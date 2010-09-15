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
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inválido";
	
	private final String TITLE = "titulo";
	private final String AUTHOR = "dono";
	private final String DESCRIPTION = "descricao";
	
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
		Blog newBlog = new Blog(blogId, authorId, title, blogDescription);
		blogs.put(newBlog.getId(), newBlog);
		return newBlog.getId();
	}
	
	public Blog getBlog(String blogId) throws Exception {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return (Blog) blogs.get(blogId);
	}
	
	public String getBlogInformation(String blogId, String attribute) throws Exception {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		Blog blog = (Blog) blogs.get(blogId);
		if (attribute.equals(TITLE)) {
			return blog.getTitle();
		} else if (attribute.equals(AUTHOR)) {
			return blog.getAuthorId();
		} else if(attribute.equals(DESCRIPTION)) {
			return blog.getText().getText();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}

	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	private boolean isInvalidBlog(String blogId) {
		return !blogs.containsKey(blogId);
	}

}
