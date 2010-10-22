package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;

import br.edu.ufcg.blogao.blog.Post;

public class PostsKeeper extends AbstractKeeper<Post>{
	
	private final String POSTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "posts" + SEP;
	private final String POSTS_FILE_EXTENSION = ".post";
	private final String EXISTENT_POST_MESSAGE = "Post existente no banco de dados";
	private final String UNEXISTENT_POST_MESSAGE = "Post inexistente no banco de dados";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(POSTS_PARENT_PATH + fileName + POSTS_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(POSTS_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return POSTS_FILE_EXTENSION;
	}

}