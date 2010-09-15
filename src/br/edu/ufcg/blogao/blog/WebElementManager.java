package br.edu.ufcg.blogao.blog;

import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.blog.data.Text;

public class WebElementManager {
	
	private static WebElementManager selfInstance = null;
	private Map<String, WebElement> blogs = null;
	
	private final String INVALID_BLOG_MESSAGE = "Blog inválido";
	private final String INVALID_BLOG_AUTHOR_MESSAGE = "Autor inválido";
	private final String INVALID_TITLE_MESSAGE = "Você deve especificar um título para o blog";
	
	private WebElementManager() {
		this.blogs = new HashMap<String, WebElement>();
	}
	
	public static WebElementManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new WebElementManager();
		}
		return selfInstance;
	}
	
	public String createBlog(String authorId, String title, String description) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_BLOG_AUTHOR_MESSAGE);
		}
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_MESSAGE);
		}
		
		String blogId = IdGenerator.getInstance().getNextId();
		StaticContent blogDescription = new Text(description);
		Blog newBlog = new Blog(blogId, title, blogDescription);
		blogs.put(newBlog.getId(), newBlog);
		return newBlog.getId();
	}
	
	public Blog getBlog(String blogId) {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return (Blog) blogs.get(blogId);
	}

	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	private boolean isInvalidBlog(String blogId) {
		return !blogs.containsKey(blogId);
	}

}
