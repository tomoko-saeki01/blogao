package br.edu.ufcg.blogao.persistence;

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
	private final String EXISTENT_ANNOUNCEMENT_MESSAGE = "Anuncio existente";
	private final String UNEXISTENT_ANNOUNCEMENT_MESSAGE = "Anuncio inexistente";

	private XStream xstream = null;	
	
	public AnnouncementsKeeper() {
		xstream = new XStream();
	}

	void insertAnnouncement(AnnouncementIF ann) throws Exception {
		if (existsAnnouncementInDatabase(ann.getId())) {
			throw new IllegalStateException(EXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		File directoryStructure = new File(ANNOUNCEMENTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(ANNOUNCEMENTS_PARENT_PATH + ann.getId() + ANNOUNCEMENTS_FILE_EXTENSION);
		xstream.toXML(ann, new FileOutputStream(file));
	}

	AnnouncementIF retrieveAnnouncement(String announcementId) throws Exception {
		if (!existsAnnouncementInDatabase(announcementId)) {
			throw new IllegalStateException(UNEXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		File file = new File(ANNOUNCEMENTS_PARENT_PATH + announcementId + ANNOUNCEMENTS_FILE_EXTENSION);
		return (AnnouncementIF) xstream.fromXML(new FileInputStream(file));
	}
	
	void deleteAnnouncement(String announcementId) throws Exception {
		if (!existsAnnouncementInDatabase(announcementId)) {
			throw new IllegalStateException(UNEXISTENT_ANNOUNCEMENT_MESSAGE);
		}
		new File(ANNOUNCEMENTS_PARENT_PATH + announcementId + ANNOUNCEMENTS_FILE_EXTENSION).delete();
	}
	
	void deleteAllAnnouncements() {
		File announcementsDirectory = new File(ANNOUNCEMENTS_PARENT_PATH);
		announcementsDirectory.mkdirs();
		File[] announcementsFiles = announcementsDirectory.listFiles();
		for (File announcementFile : announcementsFiles) {
			announcementFile.delete();
		}
	}
	
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
	
	boolean existsAnnouncementInDatabase(String id) {
		return (new File(ANNOUNCEMENTS_PARENT_PATH + id + ANNOUNCEMENTS_FILE_EXTENSION)).exists();
	}

}
