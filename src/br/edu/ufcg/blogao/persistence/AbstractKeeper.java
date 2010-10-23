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

public abstract class AbstractKeeper<T extends Identifiable> {

	protected final String SEP = System.getProperty("file.separator");

	private XStream xstream = new XStream();

	void deleteAllElements() {
		File referenceDirectory = createDirectoryReference();
		referenceDirectory.mkdirs();
		File[] files = referenceDirectory.listFiles();
		for (File referenceFile : files) {
			referenceFile.setWritable(true, true);
			referenceFile.delete();
		}
	}

	void deleteElement(String elementId) throws Exception {
		if (!existsElementInDatabase(elementId)) {
			throwExistenceElementException(Existence.UNEXISTENT);
		}
		File file = createFileReference(elementId);
		file.setWritable(true, true);
		file.delete();
	}

	boolean existsElementInDatabase(String id) {
		return createFileReference(id).exists();
	}

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
					T element = (T)xstream
							.fromXML(reader);
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

	public List<String> listElementsInDatabase() {
		File elementsDirectory = createDirectoryReference();
		elementsDirectory.mkdirs();
		File[] elementsFiles = elementsDirectory.listFiles();
		List<String> elementsIds = new ArrayList<String>();
		for (File elementFile : elementsFiles) {
			String elementFileName = elementFile.getName();
			elementsIds.add(elementFileName.substring(0,
					elementFileName.length() - createFileExtension().length()));
		}
		return elementsIds;
	}
	
	void updateElement(T element) throws Exception {
        if (!existsElementInDatabase(element.getId())) {
                throwExistenceElementException(Existence.UNEXISTENT);
        }
        FileWriter writer = new FileWriter(createFileReference(element.getId()));
        xstream.toXML(element, writer);
        writer.close();
}       

	protected abstract File createFileReference(String fileName);

	protected abstract File createDirectoryReference();

	protected abstract void throwExistenceElementException(Existence existence);

	protected abstract String createFileExtension();

}
