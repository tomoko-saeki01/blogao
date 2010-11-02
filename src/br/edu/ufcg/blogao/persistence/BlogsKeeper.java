package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's blog.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;

import br.edu.ufcg.blogao.blog.Blog;

public class BlogsKeeper extends AbstractKeeper<Blog>{

	private final String BLOGS_PARENT_PATH = "resources" + SEP + "db" + SEP + "blogs" + SEP;
	private final String BLOGS_FILE_EXTENSION = ".blog";
	private final String EXISTENT_BLOG_MESSAGE = "Blog existente";
	private final String UNEXISTENT_BLOG_MESSAGE = "Blog inexistente";
	
	@Override
	protected File createFileReference(String fileName) {
		return new File(BLOGS_PARENT_PATH + fileName + BLOGS_FILE_EXTENSION);
	}
	@Override
	protected File createDirectoryReference() {
		return new File(BLOGS_PARENT_PATH + SEP);
	}
	@Override
	protected void throwExistenceElementException(Existence existence) {
		if (existence == Existence.EXISTENT)
			throw new IllegalStateException(EXISTENT_BLOG_MESSAGE);
		else
			throw new IllegalStateException(UNEXISTENT_BLOG_MESSAGE);
		
	}
	@Override
	protected String createFileExtension() {
		return BLOGS_FILE_EXTENSION;
	}
}