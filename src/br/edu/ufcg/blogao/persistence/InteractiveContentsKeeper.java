package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's Interactive Contents.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.InteractiveContent;

import com.thoughtworks.xstream.XStream;

public class InteractiveContentsKeeper {
	
	private final String SEP = System.getProperty("file.separator");
	private final String INTERACTIVE_CONTENT_PARENT_PATH = "resources" + SEP + "db" + SEP + "ic" + SEP;
	private final String INTERACTIVE_CONTENT_FILE_EXTENSION = ".icontent";
	private final String EXISTENT_POST_MESSAGE = "Conteœdo existente no banco de dados";
	private final String UNEXISTENT_POST_MESSAGE = "Conteœdo inexistente no banco de dados";
	private XStream xstream = null;	
	
	/**
	 * Default constructor.
	 */
	public InteractiveContentsKeeper() {
		xstream = new XStream();
	}
	
	/**
	 * Delete all existing interactive contents.
	 */
	void deleteAllInteractiveContents() {
		File icsDirectory = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		icsDirectory.mkdirs();
		File[] icsFiles = icsDirectory.listFiles();
		for (File icFile : icsFiles) {
			icFile.setWritable(true, true);
			icFile.delete();
		}
	}

	/**
	 * Delete a specific interactive content.
	 * @param icId The ID of the interactive content that will be deleted.
	 * @throws Exception If the interactive content doesn't exist.
	 */
	void deleteInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION);
		file.setWritable(true, true);
		file.delete();
	}

	/**
	 * Verify if a specific interactive content exist in database.
	 * @param id The ID of the interactive content that will be verified.
	 * @return True case the interactive content exist or False otherwise.
	 */
	boolean existsInteractiveContentInDatabase(String id) {
		return (new File(INTERACTIVE_CONTENT_PARENT_PATH + id + INTERACTIVE_CONTENT_FILE_EXTENSION)).exists();
	}
	
	/**
	 * Return a map with all the interactive contents existing.
	 * @return A map with all the interactive contents.
	 */
	Map<String, InteractiveContent> getAllInteractiveContents() {
		File icsDirectory = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		icsDirectory.mkdirs();
		FileInputStream reader = null;
		File[] icsFiles = icsDirectory.listFiles();
		Map<String, InteractiveContent> ics = new HashMap<String, InteractiveContent>();
		for (File icFile : icsFiles) {
			if (icFile.getName().endsWith(INTERACTIVE_CONTENT_FILE_EXTENSION)) {
				try {
					reader = new FileInputStream(icFile);
					InteractiveContent ic = (InteractiveContent) xstream.fromXML(reader);
					ics.put(ic.getId(), ic);
					reader.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return ics;
	}
	
	/**
	 * Insert a new interactive content.
	 * @param ic The ID of the interactive content that will be inserted.
	 * @throws Exception If the interactive content already exist in database.
	 */
	void insertInteractiveContent(InteractiveContent ic) throws Exception {
		if (existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		}
		File directoryStructure = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		directoryStructure.mkdirs();
		FileOutputStream writer = new FileOutputStream(new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION));
		xstream.toXML(ic, writer);
		writer.close();
	}

	/**
	 * Retrieve a specific interactive content.
	 * @param icId The ID of the interactive content that will be retrieved.
	 * @return The interactive content.
	 * @throws Exception If the interactive content doesn't exist in database.
	 */
	InteractiveContent retrieveInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		FileInputStream reader = new FileInputStream(new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION));
		InteractiveContent ic = (InteractiveContent) xstream.fromXML(reader);
		reader.close();
		return ic;
	}
	
	/**
	 * Update the interactive content. 
	 * @param ic The interactive content that will be updated.
	 * @throws Exception If the interactive content doesn't exist in database.
	 */
	void updateInteractiveContent(InteractiveContent ic) throws Exception {
		if (!existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		FileOutputStream writer = new FileOutputStream(new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION));
		xstream.toXML(ic, writer);
		writer.close();
	}
}