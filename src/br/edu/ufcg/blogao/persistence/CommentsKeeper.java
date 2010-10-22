package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's comments.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;

import br.edu.ufcg.blogao.blog.Comment;

public class CommentsKeeper extends AbstractKeeper<Comment>{
	
	private final String COMMENTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "comments" + SEP;
	private final String COMMENTS_FILE_EXTENSION = ".comment";
	private final String EXISTENT_COMMENT_MESSAGE = "Comentário existente no banco de dados";
	private final String UNEXISTENT_COMMENT_MESSAGE = "Comentário inexistente no banco de dados";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(COMMENTS_PARENT_PATH + fileName + COMMENTS_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(COMMENTS_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_COMMENT_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return COMMENTS_FILE_EXTENSION;
	}
	
	
}