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

import br.edu.ufcg.blogao.blog.AnnouncementIF;

public class AnnouncementsKeeper extends AbstractKeeper<AnnouncementIF>{

	private final String ANNOUNCEMENTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "announcements" + SEP;
	private final String ANNOUNCEMENTS_FILE_EXTENSION = ".ann";
	private final String EXISTENT_ANNOUNCEMENT_MESSAGE = "Notifica��o existente";
	private final String UNEXISTENT_ANNOUNCEMENT_MESSAGE = "Notifica��o inexistente";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(ANNOUNCEMENTS_PARENT_PATH + fileName + ANNOUNCEMENTS_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(ANNOUNCEMENTS_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_ANNOUNCEMENT_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_ANNOUNCEMENT_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return ANNOUNCEMENTS_FILE_EXTENSION;
	}
}