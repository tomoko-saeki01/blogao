package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's users.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;

import br.edu.ufcg.blogao.user.UserIF;

public class UserIFsKeeper extends AbstractKeeper<UserIF>{
	
	private final String USERS_PARENT_PATH = "resources" + SEP + "db" + SEP + "users" + SEP;
	private final String USERS_FILE_EXTENSION = ".user";
	private final String EXISTENT_USER_MESSAGE = "Usu‡rio existente";
	private final String UNEXISTENT_USER_MESSAGE = "Usu‡rio inexistente";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(USERS_PARENT_PATH + fileName + USERS_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(USERS_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_USER_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return USERS_FILE_EXTENSION;
	}
}