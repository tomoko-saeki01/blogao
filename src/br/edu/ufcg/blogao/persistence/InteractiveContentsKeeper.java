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
	public void deleteAllInteractiveContents() {
		File icsDirectory = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		icsDirectory.mkdirs();
		File[] icsFiles = icsDirectory.listFiles();
		for (File icFile : icsFiles) {
			icFile.delete();
		}
	}

	/**
	 * Delete a specific interactive content.
	 * @param icId The ID of the interactive content that will be deleted.
	 * @throws Exception If the interactive content doesn't exist.
	 */
	public void deleteInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION).delete();
	}

	/**
	 * Verify if a specific interactive content exist in database.
	 * @param id The ID of the interactive content that will be verified.
	 * @return True case the interactive content exist or False otherwise.
	 */
	public boolean existsInteractiveContentInDatabase(String id) {
		return (new File(INTERACTIVE_CONTENT_PARENT_PATH + id + INTERACTIVE_CONTENT_FILE_EXTENSION)).exists();
	}
	
	/**
	 * Return a map with all the interactive contents existing.
	 * @return A map with all the interactive contents.
	 */
	public Map<String, InteractiveContent> getAllInteractiveContents() {
		File icsDirectory = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		icsDirectory.mkdirs();
		File[] icsFiles = icsDirectory.listFiles();
		Map<String, InteractiveContent> ics = new HashMap<String, InteractiveContent>();
		for (File icFile : icsFiles) {
			if (icFile.getName().endsWith(INTERACTIVE_CONTENT_FILE_EXTENSION)) {
				try {
					InteractiveContent ic = (InteractiveContent) xstream.fromXML(new FileInputStream(icFile));
					ics.put(ic.getId(), ic);
				} catch (FileNotFoundException e) {
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
	public void insertInteractiveContent(InteractiveContent ic) throws Exception {
		if (existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		}
		File directoryStructure = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION);
		xstream.toXML(ic, new FileOutputStream(file));
	}

	/**
	 * Retrieve a specific interactive content.
	 * @param icId The ID of the interactive content that will be retrieved.
	 * @return The interactive content.
	 * @throws Exception If the interactive content doesn't exist in database.
	 */
	public InteractiveContent retrieveInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION);
		return (InteractiveContent) xstream.fromXML(new FileInputStream(file));
	}
	
	/**
	 * Update the interactive content. 
	 * @param ic The interactive content that will be updated.
	 * @throws Exception If the interactive content doesn't exist in database.
	 */
	public void updateInteractiveContent(InteractiveContent ic) throws Exception {
		if (!existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION);
		xstream.toXML(ic, new FileOutputStream(file));
	}
}