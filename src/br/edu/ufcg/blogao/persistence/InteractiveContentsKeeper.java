package br.edu.ufcg.blogao.persistence;

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
	
	public InteractiveContentsKeeper() {
		xstream = new XStream();
	}

	void insertInteractiveContent(InteractiveContent ic) throws Exception {
		if (existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		}
		File directoryStructure = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION);
		xstream.toXML(ic, new FileOutputStream(file));
	}

	InteractiveContent retrieveInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION);
		return (InteractiveContent) xstream.fromXML(new FileInputStream(file));
	}
	
	void updateInteractiveContent(InteractiveContent ic) throws Exception {
		if (!existsInteractiveContentInDatabase(ic.getId())) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(INTERACTIVE_CONTENT_PARENT_PATH + ic.getId() + INTERACTIVE_CONTENT_FILE_EXTENSION);
		xstream.toXML(ic, new FileOutputStream(file));
	}
	
	void deleteInteractiveContent(String icId) throws Exception {
		if (!existsInteractiveContentInDatabase(icId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		new File(INTERACTIVE_CONTENT_PARENT_PATH + icId + INTERACTIVE_CONTENT_FILE_EXTENSION).delete();
	}
	
	void deleteAllInteractiveContents() {
		File icsDirectory = new File(INTERACTIVE_CONTENT_PARENT_PATH);
		icsDirectory.mkdirs();
		File[] icsFiles = icsDirectory.listFiles();
		for (File icFile : icsFiles) {
			icFile.delete();
		}
	}
	
	Map<String, InteractiveContent> getAllInteractiveContents() {
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
	
	boolean existsInteractiveContentInDatabase(String id) {
		return (new File(INTERACTIVE_CONTENT_PARENT_PATH + id + INTERACTIVE_CONTENT_FILE_EXTENSION)).exists();
	}
}
