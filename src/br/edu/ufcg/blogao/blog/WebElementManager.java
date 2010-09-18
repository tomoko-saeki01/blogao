package br.edu.ufcg.blogao.blog;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.blog.data.InteractiveContent;
import br.edu.ufcg.blogao.blog.data.Movie;
import br.edu.ufcg.blogao.blog.data.Picture;
import br.edu.ufcg.blogao.blog.data.Sound;
import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.blog.data.Text;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.user.UsersHandler;

public class WebElementManager {
	
	private static WebElementManager selfInstance = null;
	
	private final String INVALID_BLOG_MESSAGE = "Blog inv�lido";
	private final String INVALID_AUTHOR_MESSAGE = "Autor inv�lido";
	private final String INVALID_TITLE_BLOG_MESSAGE = "Voc� deve especificar um t�tulo para o blog";
	private final String INVALID_POST_MESSAGE = "Post inv�lido";
	private final String INVALID_TITLE_POST_MESSAGE = "T�tulo obrigat�rio";
	private final String INVALID_INTERACTIVE_CONTENT_MESSAGE = "Id do conte�do � inv�lido";
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inv�lido";
	private final String INVALID_DATA_MESSAGE = "Dado inv�lido";
	
	private final String CREATION_DATE = "data_criacao";
	private final String TEXT = "texto";
	private final String TITLE = "titulo";
	private final String AUTHOR = "dono";
	private final String DESCRIPTION = "descricao";
	
	public static final String NUMBER_OF_MOVIES = "number_of_movies";
	public static final String NUMBER_OF_PICTURES = "number_of_pictures";
	public static final String NUMBER_OF_SOUNDS = "number_of_sounds";
	public static final String PICTURE = "picture";
	public static final String MOVIE = "movie";
	public static final String SOUND = "sound";
	public static final String CONTENT_DATA = "content_data";
	public static final String CONTENT_DESCRIPTION = "content_description";
	
	private WebElementManager() {
	}
	
	public static WebElementManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new WebElementManager();
		}
		return selfInstance;
	}
	
	public String attachMovieOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent movieDescription = new Text(description);
		String movieId = IdGenerator.getInstance().getNextId();
		InteractiveContent movie = new Movie(movieId, movieDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(movie);
		post.attachMovie(movie.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return movie.getId();
	}
	
	public String attachPictureOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent pictureDescription = new Text(description);
		String pictureId = IdGenerator.getInstance().getNextId();
		InteractiveContent picture = new Picture(pictureId, pictureDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(picture);
		post.attachPicture(picture.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return picture.getId();
	}

	public String attachSoundOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent soundDescription = new Text(description);
		String soundId = IdGenerator.getInstance().getNextId();
		InteractiveContent sound = new Sound(soundId, soundDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(sound);
		post.attachSound(sound.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return sound.getId();
	}
	
	public void changeBlogInformation(String blogId, String attribute, String value) throws Exception {
		Blog blog = getBlog(blogId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (isInvalidString(value)) {
			if (attribute.equals(TITLE)) {
				throw new IllegalArgumentException(INVALID_TITLE_BLOG_MESSAGE);
			}
			value = "";
		}
		if (attribute.equals(TITLE)) {
			StaticContent blogTitle = new Text(value);
			blog.setTitle(blogTitle);
		} else if (attribute.equals(DESCRIPTION)) {
			StaticContent blogText = new Text(value);
			blog.setText(blogText);
		} else {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		DatabaseFacade.getInstance().updateBlog(blog);
	}
	
	public String createBlog(String authorId, String title, String description) throws Exception {
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
		}
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_BLOG_MESSAGE);
		}
		
		String blogId = IdGenerator.getInstance().getNextId();
		StaticContent blogTitle = new Text(title);
		StaticContent blogDescription = new Text(description);
		Blog newBlog = new Blog(blogId, authorId, blogTitle, blogDescription);
		DatabaseFacade.getInstance().insertBlog(newBlog);
		return newBlog.getId();
	}
	
	public String createPost(String blogId, String title, String text) throws Exception {
		Blog blog = getBlog(blogId);
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_POST_MESSAGE);
		}
		if (isInvalidString(text)) {
			text = "";
		}
		String postId = IdGenerator.getInstance().getNextId();
		StaticContent postTitle = new Text(title);
		StaticContent postText = new Text(text);
		Post newPost = new Post(blogId, postId, postTitle, postText);
		DatabaseFacade.getInstance().insertPost(newPost);
		blog.addPost(newPost.getId());
		DatabaseFacade.getInstance().updateBlog(blog);
		return newPost.getId();
	}
	
	public String getBlogInformation(String blogId, String attribute) throws Exception {
		Blog blog = getBlog(blogId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(TITLE)) {
			return blog.getTitle().getText();
		} else if (attribute.equals(AUTHOR)) {
			return blog.getAuthorId();
		} else if(attribute.equals(DESCRIPTION)) {
			return blog.getText().getText();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}
	
	public String getPostInformation(String postId, String attribute) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (attribute.equals(TITLE)) {
			return post.getTitle().getText();
		} else if (attribute.equals(TEXT)) {
			return post.getText().getText();
		} else if(attribute.equals(CREATION_DATE)) {
			return UsersHandler.getInstance().convertCalendarToStringDate(post.getCreationDate());
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		
	}
	
	private Blog getBlog(String blogId) throws Exception {
		if (isInvalidString(blogId) || !DatabaseFacade.getInstance().existsBlogInDatabase(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveBlog(blogId);
	}
	
	private Post getPost(String postId) throws Exception {
		if (isInvalidString(postId) || !DatabaseFacade.getInstance().existsPostInDatabase(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrievePost(postId);
	}
	
	private InteractiveContent getInteractiveContent(String interactiveContentId) throws Exception {
		if (isInvalidString(interactiveContentId) || 
				!DatabaseFacade.getInstance().existsInteractiveContentInDatabase(interactiveContentId)) {
			throw new IllegalArgumentException(INVALID_INTERACTIVE_CONTENT_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveInteractiveContent(interactiveContentId);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	public Integer getPostAttachmentsNumericInformation(String postId, String attribute) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(NUMBER_OF_SOUNDS)) {
			return post.getNumberOfSounds();
		} else if (attribute.equals(NUMBER_OF_PICTURES)) {
			return post.getNumberOfPictures();
		} else if (attribute.equals(NUMBER_OF_MOVIES)) {
			return post.getNumberOfMovies();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}

	public String getPostAttachmentsInformation(String postId, String attribute, Integer index) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		// Tratar caso do index invalido
		
		if (attribute.equals(SOUND)) {
			return getInteractiveContent(post.getSoundId(index)).getId();
		} else if(attribute.equals(PICTURE)) {
			return getInteractiveContent(post.getPictureId(index)).getId();
		} else if (attribute.equals(MOVIE)) {
			return getInteractiveContent(post.getMovieId(index)).getId();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}
	
	public String getInteractiveContentsInformation(String icId, String attribute) throws Exception {
		InteractiveContent iContent = getInteractiveContent(icId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(CONTENT_DATA)) {
			return iContent.getData();
		} else if (attribute.equals(CONTENT_DESCRIPTION)) {
			return iContent.getDescription().getText();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}

	public Object getPostAuthor(String postId) throws Exception {
		return getBlog(getPost(postId).getParentId()).getAuthorId();
	}

	public Object getBlogAuthor(String blogId) throws Exception {
		return getBlog(blogId).getAuthorId();
	}

}
