package br.edu.ufcg.blogao.persistence;

import java.io.File;

import br.edu.ufcg.blogao.blog.data.InteractiveContent;

/** 
 * Override Factory methods for DAO of Blogao's Interactive Contents.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public class InteractiveContentDAO extends AbstractDAO<InteractiveContent>{
	
	private final String INTERACTIVE_CONTENT_PARENT_PATH = "resources" + SEP + "db" + SEP + "ic" + SEP;
	private final String INTERACTIVE_CONTENT_FILE_EXTENSION = ".icontent";
	private final String EXISTENT_INTERACTIVE_CONTENT_MESSAGE = "Conte�do existente no banco de dados";
	private final String UNEXISTENT_INTERACTIVE_CONTENT_MESSAGE = "Conte�do inexistente no banco de dados";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(INTERACTIVE_CONTENT_PARENT_PATH + fileName + INTERACTIVE_CONTENT_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(INTERACTIVE_CONTENT_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_INTERACTIVE_CONTENT_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_INTERACTIVE_CONTENT_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return INTERACTIVE_CONTENT_FILE_EXTENSION;
	}
}