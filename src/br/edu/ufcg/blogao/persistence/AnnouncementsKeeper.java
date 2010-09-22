package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's announcements.
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

import br.edu.ufcg.blogao.blog.AnnouncementIF;

import com.thoughtworks.xstream.XStream;

public class AnnouncementsKeeper {

	private final String SEP = System.getProperty("file.separator");
	private final String ANNOUNCEMENTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "announcements" + SEP;
	private final String ANNOUNCEMENTS_FILE_EXTENSION = ".ann";
	private final String EXISTENT_ANNOUNCEMENT_MESSAGE = "Notificação existente";
	private final String UNEXISTENT_ANNOUNCEMENT_MESSAGE = "Notificação inexistente";

	private XStream xstream = null;	
	
	/**
	 * Default constructor.
	 */
	public AnnouncementsKeeper() {
		xstream = new XStream();
	}

	/**
	 * Delete all existing announcements.
	 */
	void deleteAllAnnouncements() {
		File announcementsDirectory = new File(ANNOUNCEMENTS_PARENT_PATH);
		announcementsDirectory.mkdirs();
		File[] announcementsFiles = announcementsDirectory.listFiles();
		for (File announcementFile : announcementsFiles) {
			announcementFile.delete();
		}
	}
	
	/**
	 * Delete a specific announcement. 
	 * @param announcementId The announcement's ID that will be deleted.
	 * @throws Exception If the annoucemetnId doesn't exist in database.
	 */
	void deleteAnnouncement(String announcementId) throws Exception {
		if (!existsAnnouncementInDatabase(announcementId)) {
			throw new IllegalStateException(UNEXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		new File(ANNOUNCEMENTS_PARENT_PATH + announcementId + ANNOUNCEMENTS_FILE_EXTENSION).delete();
	}
	
	/**
	 * Verify if exist a specific announcement in database.
	 * @param id The announcement's ID.
	 * @return True case the announcement exist or False otherwise.
	 */
	boolean existsAnnouncementInDatabase(String id) {
		return (new File(ANNOUNCEMENTS_PARENT_PATH + id + ANNOUNCEMENTS_FILE_EXTENSION)).exists();
	}
	
	/**
	 * Return a map with all the announcements existing.
	 * @return A map with all the announcements.
	 */
	Map<String, AnnouncementIF> getAllAnnouncements() {
		File announcementsDirectory = new File(ANNOUNCEMENTS_PARENT_PATH);
		announcementsDirectory.mkdirs();
		File[] announcementsFiles = announcementsDirectory.listFiles();
		Map<String, AnnouncementIF> announcements = new HashMap<String, AnnouncementIF>();
		for (File announcementFile : announcementsFiles) {
			if (announcementFile.getName().endsWith(ANNOUNCEMENTS_FILE_EXTENSION)) {
				try {
					AnnouncementIF announcement = (AnnouncementIF) xstream.fromXML(new FileInputStream(announcementFile));
					announcements.put(announcement.getId(), announcement);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return announcements;
	}
	
	/**
	 * Insert a new announcement.
	 * @param ann The new announcement that will be inserted.
	 * @throws Exception If already exist the announcement in database. 
	 */
	void insertAnnouncement(AnnouncementIF ann) throws Exception {
		if (existsAnnouncementInDatabase(ann.getId())) {
			throw new IllegalStateException(EXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		File directoryStructure = new File(ANNOUNCEMENTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(ANNOUNCEMENTS_PARENT_PATH + ann.getId() + ANNOUNCEMENTS_FILE_EXTENSION);
		xstream.toXML(ann, new FileOutputStream(file));
	}

	/**
	 * Retrieve a specific announcement.
	 * @param announcementId The announcement's ID that will be retrieved.
	 * @return The announcement.
	 * @throws Exception If the announcementId doesn't exist in database.
	 */
	AnnouncementIF retrieveAnnouncement(String announcementId) throws Exception {
		if (!existsAnnouncementInDatabase(announcementId)) {
			throw new IllegalStateException(UNEXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		File file = new File(ANNOUNCEMENTS_PARENT_PATH + announcementId + ANNOUNCEMENTS_FILE_EXTENSION);
		return (AnnouncementIF) xstream.fromXML(new FileInputStream(file));
	}
}