package br.edu.ufcg.blogao.blog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.blog.data.Text;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.user.UsersHandler;

public class WebElementManager {
	
	private static WebElementManager selfInstance = null;
	private Map<String, Blog> blogs = null;
	
	private final String INVALID_BLOG_MESSAGE = "Blog inválido";
	private final String INVALID_BLOG_AUTHOR_MESSAGE = "Autor inválido";
	private final String INVALID_TITLE_BLOG_MESSAGE = "Você deve especificar um título para o blog";
	private final String INVALID_TITLE_POST_MESSAGE = "Título obrigatório";
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inválido";
	private final String INVALID_DATA_MESSAGE = "Dado inválido";
	
	private final String TITLE = "titulo";
	private final String AUTHOR = "dono";
	private final String DESCRIPTION = "descricao";
	
	private WebElementManager() {
		this.blogs = new HashMap<String, Blog>();
	}
	
	public static WebElementManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new WebElementManager();
		}
		return selfInstance;
	}
	
	public void changeBlogInformation(String blogId, String attribute, String value) {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (isInvalidString(value)) {
			if (attribute.equals(TITLE)) {
				throw new IllegalArgumentException(INVALID_TITLE_BLOG_MESSAGE);
			}
			value = "";
		}
		Blog blog = blogs.get(blogId);
		if (attribute.equals(TITLE)) {
			blog.setTitle(value);
		} else if(attribute.equals(DESCRIPTION)) {
			StaticContent blogText = new Text(value);
			blog.setText(blogText);
		} else {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
	}
	
	public String createBlog(String authorId, String title, String description) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_BLOG_AUTHOR_MESSAGE);
		}
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_BLOG_MESSAGE);
		}
		
		String blogId = IdGenerator.getInstance().getNextId();
		StaticContent blogDescription = new Text(description);
		Blog newBlog = new Blog(blogId, authorId, title, blogDescription);
		blogs.put(newBlog.getId(), newBlog);
		return newBlog.getId();
	}
	
	public String createPost(String blogId, String title, String text) {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_POST_MESSAGE);
		}
		if (isInvalidString(text)) {
			text = "";
		}
		String postId = IdGenerator.getInstance().getNextId();
		StaticContent postText = new Text(text);
		Post newPost = new Post(postId, title, postText);
		Blog blog = blogs.get(blogId);
		blog.addPost(newPost);
		return newPost.getId();
	}
	
	public Blog getBlog(String blogId) throws Exception {
		if (isInvalidString(blogId) || isInvalidBlog(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return blogs.get(blogId);
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
	
	public void loadAllBlogs() {
		this.blogs = DatabaseFacade.getInstance().getAllBlogs();
	}
	
	public void deleteAllBlogs() {
		blogs.clear();
	}
	
	public void saveAllBlogs() {
		DatabaseFacade dbFacade = DatabaseFacade.getInstance();
		for (Blog blog : blogs.values()) {
			try {
				if (dbFacade.existsBlogInDatabase(blog.getId())) {
					dbFacade.updateBlog(blog);
				} else {
					dbFacade.insertBlog(blog);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	private boolean isInvalidBlog(String blogId) {
		return !blogs.containsKey(blogId);
	}

	// TODO
	public String attachSoundOnPost(String userId, String postId, String description, String data) throws Exception {
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		List<String> userBlogs = UsersHandler.getInstance().getAllBlogsFromUser(userId);
		Iterator<String> it = userBlogs.iterator();
		while(it.hasNext()) {
			String blogId = it.next();
			if (blogs.get(blogId).containsPost(postId)) {
				Blog blog = blogs.get(blogId);
				Post post = blog.getPost(postId);
				return post.attachSound(description, data);
			}
		}
		throw new IllegalStateException("POST NAO EH DO USUARIO - REFATORAR AQUI!!! - MENSAGEM NAO ESCOLHIDA");
		
	}

}
