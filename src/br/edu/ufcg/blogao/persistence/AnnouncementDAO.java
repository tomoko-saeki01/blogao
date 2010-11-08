package br.edu.ufcg.blogao.persistence;

import java.io.File;

import br.edu.ufcg.blogao.blog.AnnouncementIF;

/** 
 * Override Factory methods for DAO of Blogao's announcements.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public class AnnouncementDAO extends AbstractDAO<AnnouncementIF>{

	private final String ANNOUNCEMENTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "announcements" + SEP;
	private final String ANNOUNCEMENTS_FILE_EXTENSION = ".ann";
	private final String EXISTENT_ANNOUNCEMENT_MESSAGE = "Notificação existente";
	private final String UNEXISTENT_ANNOUNCEMENT_MESSAGE = "Notificação inexistente";
	
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