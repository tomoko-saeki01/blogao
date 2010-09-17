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
	private final String INVALID_AUTHOR_MESSAGE = "Autor inválido";
	private final String INVALID_TITLE_BLOG_MESSAGE = "Você deve especificar um título para o blog";
	private final String INVALID_POST_MESSAGE = "Post inválido";
	private final String INVALID_TITLE_POST_MESSAGE = "Título obrigatório";	
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inválido";
	private final String INVALID_DATA_MESSAGE = "Dado inválido";
	
	private final String CREATION_DATE = "data_criacao";
	private final String TEXT = "texto";
	private final String TITLE = "titulo";
	private final String AUTHOR = "dono";
	private final String DESCRIPTION = "descricao";
	private final String NUMBER_OF_MOVIES = "number_of_movies";
	private final String NUMBER_OF_PICTURES = "number_of_pictures";
	private final String NUMBER_OF_SOUNDS = "number_of_sounds";
	private final String PICTURE = "picture";
	private final String MOVIE = "movie";
	private final String SOUND = "sound";
	
	private WebElementManager() {
		this.blogs = new HashMap<String, Blog>();
	}
	
	public static WebElementManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new WebElementManager();
		}
		return selfInstance;
	}
	
	public String attachMovieOnPost(String authorId, String postId, String description, String data) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
		}
		Post post = getPost(authorId, postId);
		
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		return post.attachMovie(description, data);
	}
	
	public String attachPictureOnPost(String authorId, String postId, String description, String data) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
		}
		Post post = getPost(authorId, postId);
		
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		return post.attachPicture(description, data);
	}

	public String attachSoundOnPost(String authorId, String postId, String description, String data) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
		}
		Post post = getPost(authorId, postId);
		
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		return post.attachSound(description, data);
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
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
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
	
	public String getPostInformation(String postId, String attribute) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		Post post = getPost(null, postId);
		if (attribute.equals(TITLE)) {
			return post.getTitle();
		} else if (attribute.equals(TEXT)) {
			return post.getText().getText();
		} else if(attribute.equals(CREATION_DATE)) {
			return UsersHandler.getInstance().convertCalendarToStringDate(post.getCreationDate());
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
	
	private String findBlogOwnerOfPost(String postId) throws Exception {
		for (Blog blog : blogs.values()) {
			if (blog.containsPost(postId)) {
				return blog.getId();
			}
		}
		return null;
	}
	
	private String findBlogOwnerOfPost(String authorId, String postId) throws Exception {
		List<String> authorBlogs = UsersHandler.getInstance().getAllBlogsFromUser(authorId);
		Iterator<String> it = authorBlogs.iterator();
		while(it.hasNext()) {
			String blogId = it.next();
			Blog blog = blogs.get(blogId);
			if (blog != null && blog.containsPost(postId)) {
				return blog.getId();
			}
		}
		return null;
	}
	
	private Post getPost(String authorId, String postId) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		String blogId = null;
		if (authorId == null) {
			blogId = findBlogOwnerOfPost(postId);
		} else {
			blogId = findBlogOwnerOfPost(authorId, postId);
		}
		if (blogId == null) {
			throw new IllegalStateException(INVALID_AUTHOR_MESSAGE);
		}
		return blogs.get(blogId).getPost(postId);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	private boolean isInvalidBlog(String blogId) {
		return !blogs.containsKey(blogId);
	}

	public Integer getPostAttachmentsNumericInformation(String postId, String attribute) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(NUMBER_OF_SOUNDS)) {
			return getPost(null, postId).getNumberOfSounds();
		} else if(attribute.equals(NUMBER_OF_PICTURES)) {
			return getPost(null, postId).getNumberOfPictures();
		} else if (attribute.equals(NUMBER_OF_MOVIES)) {
			return getPost(null, postId).getNumberOfMovies();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}

	public String getPostAttachmentsInformation(String postId, String attribute, Integer index) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(SOUND)) {
			return getPost(null, postId).getSound(index).getId();
		} else if(attribute.equals(PICTURE)) {
			return getPost(null, postId).getPicture(index).getId();
		} else if (attribute.equals(MOVIE)) {
			return getPost(null, postId).getMovie(index).getId();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}

}
