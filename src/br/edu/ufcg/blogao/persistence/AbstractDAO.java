package br.edu.ufcg.blogao.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.Identifiable;

import com.thoughtworks.xstream.XStream;

/**
 * Abstract class that implements CRUD in elements that implement Identifiable. The objetcs are serialized in XML,
 * using XStream Framework.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>	
 * @version 0.2
 * @param <T> Class that implements Identifiable.
 */
public abstract class AbstractDAO<T extends Identifiable> {

	/** String for file path separator.*/
	protected final String SEP = System.getProperty("file.separator");

	/** XStream instance */
	private XStream xstream = new XStream();

	/**
	 * Deletes all Elements from a directory (type of Objetc).
	 */
	void deleteAllElements() {
		File referenceDirectory = createDirectoryReference();
		referenceDirectory.mkdirs();
		File[] files = referenceDirectory.listFiles();
		for (File referenceFile : files) {
			referenceFile.setWritable(true, true);
			referenceFile.delete();
		}
	}

	/**
	 * Deletes from persistence a given element given his Id.
	 * @param elementId Id of the element.
	 * @throws Exception If there isn't this element on persistence. Or <code>null</code> parameter.
	 */
	void deleteElement(String elementId) throws Exception {
		if (!existsElementInDatabase(elementId)) {
			throwExistenceElementException(Existence.UNEXISTENT);
		}
		File file = createFileReference(elementId);
		file.setWritable(true, true);
		file.delete();
	}

	/**
	 * Search of a element exists i persistence given his id.
	 * @param id Element's Id.
	 * @return <code>true</code> if the element exists.
	 */
	boolean existsElementInDatabase(String id) {
		return createFileReference(id).exists();
	}

	/**
	 * Retrieve all elements of the type defined in instantiation moment. (I.e.: All blogs, All Posts)
	 * @return Map<Element Id, Element>
	 */
	Map<String, T> getAllElements() {
		File elementsDirectory = createDirectoryReference();
		elementsDirectory.mkdirs();
		FileReader reader = null;
		File[] elementsFiles = elementsDirectory.listFiles();
		Map<String, T> elements = new HashMap<String, T>();
		for (File elementFile : elementsFiles) {
			if (elementFile.getName().endsWith(createFileExtension())) {
				try {
					reader = new FileReader(elementFile);
					@SuppressWarnings("unchecked")
					T element = (T) xstream.fromXML(reader);
					elements.put(element.getId(), element);
					reader.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return elements;
	}

	/**
	 * Insert an element in persistence.
	 * @param element Element that implement Identifiable.
	 * @throws Exception If element is null or already exists in persistence.
	 */
	void insertElement(T element) throws Exception {
		if (existsElementInDatabase(element.getId())) {
			throwExistenceElementException(Existence.EXISTENT);
		}
		File directoryStructure = createDirectoryReference();
		directoryStructure.mkdirs();
		FileWriter writer = new FileWriter(createFileReference(element.getId()));
		xstream.toXML(element, writer);
		writer.close();
	}

	/**
	 * Retrive an element given his Id.
	 * @param elementId element.getId() unique identification of wanted element.
	 * @return Element
	 * @throws Exception if elementId is null or if there isn't an element with given Id.
	 */
	T retrieveElement(String elementId) throws Exception {
		if (!existsElementInDatabase(elementId)) {
			throwExistenceElementException(Existence.UNEXISTENT);
		}
		FileReader reader = new FileReader(createFileReference(elementId));
		@SuppressWarnings("unchecked")
		T element = (T) xstream.fromXML(reader);
		reader.close();
		return element;
	}

	/**
	 * List all Ids of instance type, in persistence.
	 * @return List<element id>
	 */
	List<String> listElementsInDatabase() {
		File elementsDirectory = createDirectoryReference();
		elementsDirectory.mkdirs();
		File[] elementsFiles = elementsDirectory.listFiles();
		List<String> elementsIds = new ArrayList<String>();
		for (File elementFile : elementsFiles) {
			String elementFileName = elementFile.getName();
			elementsIds.add(elementFileName.substring(0, elementFileName
					.length()
					- createFileExtension().length()));
		}
		return elementsIds;
	}
	
	/**
	 * Updates an existent element in persistence.
	 * @param element Existent element.
	 * @throws Exception If this element did not exist in persistence.
	 */
	void updateElement(T element) throws Exception {
		if (!existsElementInDatabase(element.getId())) {
			throwExistenceElementException(Existence.UNEXISTENT);
		}
		FileWriter writer = new FileWriter(createFileReference(element.getId()));
		xstream.toXML(element, writer);
		writer.close();
	}

	/**
	 * (Factory Method)
	 * Returns a file referencing the path where element should be persisted. (According to element type)
	 * @param fileName name of this element reference (By Default is element Id).
	 * @return File referencing the path of an element.
	 */
	protected abstract File createFileReference(String fileName);

	/**
	 * (Factory Method)
	 * Returns a file referencing the path where all elements from the instance DAO type are persisted.
	 * @return File referencing the directory of all elements.
	 */
	protected abstract File createDirectoryReference();

	/**
	 * (Factory Method)
	 * Method for throw exception according to instance type of DAO.
	 * @param existence Enum constant indicanting such element exists or not exist.
	 */
	protected abstract void throwExistenceElementException(Existence existence);

	/**
	 * (Factory Method)
	 * Retrives the file extension string, for an element according to DAO instance.
	 * @return file extension (i.e.: ".blog", ".comment", ".post"...)
	 */
	protected abstract String createFileExtension();
}