package br.edu.ufcg.blogao.blog;

/**
 * Manages the elements (Post, Comment, User, Blog, Interactive Contents, etc)
 * that act as objects on the web.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.blog.data.InteractiveContent;
import br.edu.ufcg.blogao.blog.data.Movie;
import br.edu.ufcg.blogao.blog.data.Picture;
import br.edu.ufcg.blogao.blog.data.Sound;
import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.blog.data.Text;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.user.Notifiable;
import br.edu.ufcg.blogao.user.UserIF;
import br.edu.ufcg.blogao.user.UsersHandler;

public class WebElementManager {
	
	private static WebElementManager selfInstance = null;
	
	private final String INVALID_BLOG_MESSAGE = "Blog inválido";
	private final String INVALID_AUTHOR_MESSAGE = "Autor inválido";
	private final String INVALID_TITLE_BLOG_MESSAGE = "Você deve especificar um título para o blog";
	private final String INVALID_COMMENT_MESSAGE = "Comentário inválido";
	private final String INVALID_POST_MESSAGE = "Post inválido";
	private final String INVALID_TITLE_POST_MESSAGE = "Título obrigatório";
	private final String INVALID_INTERACTIVE_CONTENT_MESSAGE = "Id do conteúdo é inválido";
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inválido";
	private final String INVALID_DATA_MESSAGE = "Dado inválido";
	private final String INVALID_INDEX_MESSAGE = "Índice incorreto";
	private final String INVALID_ANNOUNCEMENT_MESSAGE = "Notificação inválida";
	
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
	public static final String COMMENT_TEXT = "comment_text";
	public static final String COMMENT_AUTHOR = "comment_author";
	
	private WebElementManager() {
	}
	
	/**
	 * Return the instance of the WebElementManager.
	 * @return The instance of the WebElementManager.
	 */
	public static synchronized WebElementManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new WebElementManager();
		}
		return selfInstance;
	}
	
	/**
	 * Add a comment to the post.
	 * @param postId The post's ID.
	 * @param authorId The author's ID.
	 * @param text The comment's text.
	 * @return The comment's ID.
	 * @throws Exception If the postId is null, empty or doesn't exist a post with the passed postId.
	 * 					 If the authorId is null or empty or doesn't exist a author with the passed authorId.
	 */
	public String addComment(String postId, String authorId, String text) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(authorId)) {
			throw new IllegalArgumentException(INVALID_AUTHOR_MESSAGE);
		}
		
		String commentId = IdGenerator.getInstance().getNextId();
		StaticContent commentText = new Text(text);
		Comment newComment = new Comment(commentId, postId, authorId, commentText);
		DatabaseFacade.getInstance().insertComment(newComment);
		post.addComment(newComment.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return newComment.getId();
	}
	
	/**
	 * Add a announcement to the blog.
	 * @param blogId The blog's ID.
	 * @param userId The user's ID. 
	 * @throws Exception If the blogId is null, empty or doesn't exist a blog with the passed blogId.
	 */
	public void addPostAnnouncement(String blogId, String userId) throws Exception {
		UserIF usr = DatabaseFacade.getInstance().retrieveUser(userId);
		Blog blog = getBlog(blogId);
		blog.addNotifiable(usr);
		DatabaseFacade.getInstance().updateBlog(blog);
	}
	
	/**
	 * Creates a new comment like a sub comment of an existent comment.
	 * @param parentCommentId Id of Comment that will be sub commented.
	 * @param userId Author of subComment been added.
	 * @param text Sub comment text.
	 * @return created sub comment id.
	 * @throws Exception If the parent Comment doesn't exist. (Invalid parentCommentId)
	 */
	public String addSubComment(String parentCommentId, String userId, String text) throws Exception {
		Comment parentComment = getComment(parentCommentId);
		String subCommentId = IdGenerator.getInstance().getNextId();
		StaticContent subCommentText = new Text(text);
		Comment subComment = new Comment(subCommentId, parentCommentId, userId, subCommentText);
		DatabaseFacade.getInstance().insertComment(subComment);
		parentComment.addSubComment(subComment.getId());
		DatabaseFacade.getInstance().updateComment(parentComment);
		return subComment.getId();
	}
	
	/**
	 * Attach a movie to the post.
	 * @param postId The post's ID.
	 * @param description The description. 
	 * @param data The data.
	 * @return The movie's ID.
	 * @throws Exception If data is null or empty. If the postId is null, empty or doesn't exist a post with passed postId.
	 */
	public String attachMovieOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent movieDescription = new Text(description);
		String movieId = IdGenerator.getInstance().getNextId();
		InteractiveContent movie = new Movie(movieId, postId, movieDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(movie);
		post.attachMovie(movie.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return movie.getId();
	}
	
	/**
	 * Attach a picture to the post.
	 * @param postId The post's ID.
	 * @param description The description.
	 * @param data The data.
	 * @return The picture's ID.
	 * @throws Exception If data is null or empty. If postId is null, empty or doesn't exist a post with passed postId. 
	 */
	public String attachPictureOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent pictureDescription = new Text(description);
		String pictureId = IdGenerator.getInstance().getNextId();
		InteractiveContent picture = new Picture(pictureId, postId, pictureDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(picture);
		post.attachPicture(picture.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return picture.getId();
	}

	/**
	 * Attach a sound to the post.
	 * @param postId The post's ID.
	 * @param description The description.
	 * @param data The data.
	 * @return The sound's ID.
	 * @throws Exception If data is null or empty doesn't exist a post with passed postId.
	 */
	public String attachSoundOnPost(String postId, String description, String data) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(data)) {
			throw new IllegalArgumentException(INVALID_DATA_MESSAGE);
		}
		// Can be an empty data.
		description = description == null? "" : description;
		StaticContent soundDescription = new Text(description);
		String soundId = IdGenerator.getInstance().getNextId();
		InteractiveContent sound = new Sound(soundId, postId, soundDescription, data);
		DatabaseFacade.getInstance().insertInteractiveContent(sound);
		post.attachSound(sound.getId());
		DatabaseFacade.getInstance().updatePost(post);
		return sound.getId();
	}
	
	/**
	 * Change the blog's informatation.
	 * @param blogId The blog's ID.
	 * @param attribute The attribute that will change.
	 * @param value The value.
	 * @throws Exception If attribute, or value, is null or empty. If the blogId is null, empty doesn't exist a blog with passed blogId.
	 */
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
	
	/**
	 * Change post's textual information.
	 * @param postId The post's ID.
	 * @param attribute The attribute that will change.
	 * @param value The value.
	 * @throws Exception If attribute, or value, is null or empty. If the postId is null, empty doesn't exist a post with passed postId.
	 */
	public void changePostInformation(String postId, String attribute, String value) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (isInvalidString(value)) {
			if (attribute.equals(TITLE)) {
				throw new IllegalArgumentException(INVALID_TITLE_POST_MESSAGE);
			}
			value = "";
		}
		if (attribute.equals(TITLE)) {
			StaticContent postTitle = new Text(value);
			post.setTitle(postTitle);
		} else if (attribute.equals(TEXT)) {
			StaticContent postText = new Text(value);
			post.setText(postText);
		} else {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		DatabaseFacade.getInstance().updatePost(post);
		
	}
	
	/**
	 * Create a new blog.
	 * @param authorId The blog's author.
	 * @param title The blog's title. 
	 * @param description The blog's description.
	 * @return The blog's ID.
	 * @throws Exception If authorID, or title, is null or empty. 
	 */
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
		Blog newBlog = new Blog(blogId, null, authorId, blogTitle, blogDescription);
		DatabaseFacade.getInstance().insertBlog(newBlog);
		return newBlog.getId();
	}
	
	/**
	 * Create a new post for a blog.
	 * @param blogId The blog where que post will be create.
	 * @param title The post's title.
	 * @param text The post's title.
	 * @return The post's id.
	 * @throws Exception If title is null or empty. If the blogId is null, empty doesn't exist a blog with passed blogId.
	 */
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
		AnnouncementIF ann = createAnnouncement(newPost.getId());
		blog.doNotifyAll(ann.getId());
		DatabaseFacade.getInstance().insertAnnouncement(ann);
		DatabaseFacade.getInstance().updateBlog(blog);
		for (Notifiable usr : blog.getNotifiables()) {
			DatabaseFacade.getInstance().updateUser((UserIF) usr);
		}
		return newPost.getId();
	}
	
	public String createSubBlog(String parentBlogId, String title, String description) throws Exception {
		Blog parentBlog = getBlog(parentBlogId);
		if (isInvalidString(title)) {
			throw new IllegalArgumentException(INVALID_TITLE_BLOG_MESSAGE);
		}
		description = (description == null? "" : description);
		
		String subBlogId = IdGenerator.getInstance().getNextId();
		StaticContent subBlogTitle = new Text(title);
		StaticContent subBlogDescription = new Text(description);
		Blog subBlog = new Blog(subBlogId, parentBlog.getId(), parentBlog.getAuthorId(), subBlogTitle, subBlogDescription);
		DatabaseFacade.getInstance().insertBlog(subBlog);
		parentBlog.addSubBlog(subBlog.getId());
		DatabaseFacade.getInstance().updateBlog(parentBlog);
		return subBlog.getId();
	}
	
	/**
	 * Delete a specific announcement.
	 * @param userId The user's ID.
	 * @param announcementId The announcement's ID.
	 * @throws Exception If the announcement or the user doesn't exist.
	 */
	public void deleteAnnouncement(String userId, String announcementId) throws Exception {
		UserIF usr = DatabaseFacade.getInstance().retrieveUser(userId);
		usr.getAnnouncements().remove(announcementId);
		DatabaseFacade.getInstance().deleteAnnouncement(announcementId);
		DatabaseFacade.getInstance().updateUser(usr);
	}
	
	/**
	 * Delete a specific blog.
	 * @param blogId The blog's ID.
	 * @throws Exception If the blogId is null, empty or doesn't exist the blog with the passed blogId.
	 */
	public void deleteBlog(String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		for (String postId : blog.getPostsId()) {
			deletePost(postId);
		}
		for (String subBlogId: blog.getSubBlogs()) {
			deleteBlog(subBlogId);
		}
		if (blog.getParentId() != null) {
			Blog parentBlog = getBlog(blog.getParentId());
			parentBlog.removeSubBlog(blog.getId());
			DatabaseFacade.getInstance().updateBlog(parentBlog);
		}
		DatabaseFacade.getInstance().deleteBlog(blog.getId());
		
	}
	
	/**
	 * Delete a comment in a post.
	 * @param commentId The comment's ID.
	 * @throws Exception If commentId is null, empty or doesn't exist the comment with the passed ID.
	 */
	public void deleteComment(String commentId) throws Exception {
		Comment comment = getComment(commentId);
		Post post = getPost(comment.getParentId());
		DatabaseFacade.getInstance().deleteComment(commentId);
		post.removeComment(commentId);
		DatabaseFacade.getInstance().updatePost(post);
	}
	
	/**
	 * Delete a interactive content in a post.
	 * @param icId The ID of the interactive content.
	 * @throws Exception If the icId is null, empty or doesn't exist the IC with the passed icId.
	 */
	public void deleteInteractiveContent(String icId) throws Exception {
		InteractiveContent ic = getInteractiveContent(icId);
		Post post = getPost(ic.getParentId());
		DatabaseFacade.getInstance().deleteInteractiveContent(icId);
		post.removeInteractiveContent(ic.getId());
		DatabaseFacade.getInstance().updatePost(post);
	}
	
	/**
	 * Delete a specific post.
	 * @param postId The post's ID.
	 * @throws Exception If the postId is null, empty or doesn't exist the post with the passed postId.
	 */
	public void deletePost(String postId) throws Exception {
		Post post = getPost(postId);
		for (String icId : post.getAttachments()) {
			deleteInteractiveContent(icId);
		}
		for (String commentId : post.getCommentsId()) {
			deleteComment(commentId);
		}
		DatabaseFacade.getInstance().deletePost(postId);
		Blog blog = getBlog(post.getParentId());

		blog.removePost(post.getId());
		DatabaseFacade.getInstance().updateBlog(blog);
	}
	
	/**
	 * Return the ID of a announcement target..
	 * @param announcementId The announcement's ID.
	 * @return The ID of a announcement target.
	 * @throws Exception If announcementId is null, empty or doesn't exist the announcement with the passed ID.
	 */
	public String getAnnouncementTarget(String announcementId) throws Exception {
		AnnouncementIF ann = getAnnouncement(announcementId);
		return ann.getTargetId();
	}
	
	/**
	 * Return the author's ID of a specific blog.
	 * @param blogId The blog's ID.
	 * @return The author's ID.
	 * @throws Exception If the blogId is null, empty or doesn't exist a blog with the passed blogId.
	 */
	public String getBlogAuthor(String blogId) throws Exception {
		return getBlog(blogId).getAuthorId();
	}
	
	/**
	 * Return the blog's information.
	 * @param blogId The blog's ID.
	 * @param attribute The information that the blog has (title, author or description).
	 * 					The attributes: "titulo", "dono", "descricao".
	 * @return The blog's information.
	 * @throws Exception If attribute is null or empty. If blogID is null, empty or doesn't exist a blog with passed blogId. 
	 */
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
	
	/**
	 * Return the comment's ID from a specific post.
	 * @param postId The post's id.
	 * @param index The comment's index.
	 * @return The comment's ID.
	 * @throws Exception If the postID is null, empty or doesn't exist the post with the passed postId.
	 * 					 If the index is null or less then 0 (zero).
	 */
	public String getCommentFromPost(String postId, Integer index) throws Exception {
		Post post = getPost(postId);
		if (isInvalidIndex(index) || (index.compareTo(post.getNumberOfComments()) > 0)) {
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
		}
		return post.getCommentId(index);
	}
	
	/**
	 * Return comment's information.
	 * @param commentId The comment's ID.
	 * @param attribute The information that comment has (text, author).
	 * 					The attribute: "comment_text", "comment_author".
	 * @return The comment's author's ID to author information. The comment's text to the text.
	 * @throws Exception If the commented, or attribute, is null, empty or doesn't exit a comment with the passed commentId.
	 */
	public String getCommentInformation(String commentId, String attribute) throws Exception {
		Comment comment = getComment(commentId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (attribute.equals(COMMENT_TEXT)) {
			return comment.getText().getText();
		} else if (attribute.equals(COMMENT_AUTHOR)) {
			return comment.getAuthorId();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}
	
	/**
	 * Return the author's ID of a specific interactive content.
	 * @param icId The ID of the interactive content.
	 * @return The author's ID of a specific interactive content.
	 * @throws Exception If the icId is null, empty or doesn't exist a interactive content with passed icId.
	 */
	public String getInteractiveContentAuthor(String icId) throws Exception {
		return getBlog(getPost(getInteractiveContent(icId).getParentId()).getParentId()).getAuthorId();
	}
	
	/**
	 * Return the post's interactive contents information.
	 * @param icId The ID of the interactive contents.
	 * @param attribute The information that the IC has (data, description).
	 * 					The attributes: "content_data", "content_description".
	 * @return The post's interactive contents information.
	 * @throws Exception If attribute is null, empty or different of the expected.
	 */
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
	
	/**
	 * Calculates the number of Posts in Hierarchy tree of a Blog (inluding Posts on his subBlogs).
	 * @param blogId Blog id.
	 * @return Number of posts in this Blog + all posts in subBlogs.
	 * @throws Exception If doesn't exist a Blog with the passes id.
	 */
	public Integer getNumberOfAllPostsFromBlog(String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		int numberOfPosts = blog.getNumberOfPosts();
		for (String subBlogId : blog.getSubBlogs()) {
			numberOfPosts += getNumberOfAllPostsFromBlog(subBlogId);
		}
		return numberOfPosts;
	}
		
	/**
	 * Calculates the number of subBlogs in hierarchy tree of this blog.
	 * @param blogId Id of parent Blog.
	 * @return Number of subBlogs from this blog.
	 * @throws Exception If blog with id passes doesn't exist.
	 */
	public Integer getNumberOfAllSubBlogs(String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		int numOfSubBlogs = 0;
		for (String subBlogId : blog.getSubBlogs()) {
			numOfSubBlogs += 1 + getNumberOfAllSubBlogs(subBlogId);
		}
		return numOfSubBlogs;
	}
	
	/**
	 * Calculates the number of sub comments in Tree Hierarchy of a given comment.
	 * @param commentId Id of the parent comment.
	 * @return Number of sub comments in all levels.
	 * @throws Exception If the sub comment doesn't exist.
	 */
	public Integer getNumberOfAllSubComments(String commentId) throws Exception {
		Comment comment = getComment(commentId);
		int numOfsubComments = 0;
		for (String subCommentId : comment.getSubComments()) {
			numOfsubComments += 1 + getNumberOfAllSubComments(subCommentId);
		}
		return numOfsubComments;
	}
	
	/**
	 * Calculates the number of comments from passed author on a blog.
	 * @param login Login of probably comments author.
	 * @param blogId Blog's id witch the comments are counted.
	 * @return Number of comments from an Author in a given blog.
	 * @throws Exception If the blogId doesn't references an existent blog.
	 */
	public Integer getNumberOfCommentsFromAuthorOnBlog(String login, String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		int numOfComments = 0;
		for (String postId : blog.getPostsId()) {
			numOfComments += getNumberOfCommentsFromAuthorOnPost(login, postId);
		}
		return numOfComments;
	}

	/**
	 * Calculates the number of comments from passed author on a post.
	 * @param login Login of comments probably author. 
	 * @param postId Post's id witch the comments are counted.
	 * @return Number of comments from an Author in a given post.
	 * @throws Exception If the postId doesn't references an existent post.
	 */
	public int getNumberOfCommentsFromAuthorOnPost(String login, String postId) throws Exception {
		Post post = getPost(postId);
		int numOfComments = 0;
		for (String commentId : post.getCommentsId()) {
			if (getComment(commentId).getAuthorId().equals(login)) {
				numOfComments++;
			}
		}
		return numOfComments;
	}
		
	/**
	 * Return the number of comments from a specific post.
	 * @param postId The post's ID.
	 * @return The number of comments.
	 * @throws Exception If the postId is null, empty or doesn't exist a post with the passed postId.
	 */
	public Integer getNumberOfCommentsFromPost(String postId) throws Exception {
		Post post = getPost(postId);
		return post.getNumberOfComments();
	}
	
	/**
	 * The number of post of a specific blog.
	 * @param blogId The blog's ID.
	 * @return The number of blog's posts.
	 * @throws Exception If blogId is null, empty doesn't exist a blog with passed blogId.
	 */
	public Integer getNumberOfPostsFromBlog(String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		return blog.getNumberOfPosts();
	}
	
	/**
	 * Returns the number of first level subBlogs of that Blog.
	 * @param blogId Id of Blog.
	 * @return Number of first level subBlogs in a blog.
	 * @throws Exception If the blog with passed blogId doesn't exist.
	 */
	public Integer getNumberOfSubBlogs(String blogId) throws Exception {
		Blog blog = getBlog(blogId);
		return blog.getNumberOfSubBlogs();
	}
	
	/**
	 * Returns the number of sub comments of a comment.
	 * @param commentId Id of existent comment.
	 * @return Number of sub comment in first level of this comment.
	 * @throws Exception If doesn't exist a comment with given id.
	 */
	public Integer getNumberOfSubComments(String commentId) throws Exception {
		Comment comment = getComment(commentId);
		return comment.getNumberOfSubComments();
	}
	
	/**
	 * Return the ID of a specific attachment.
	 * @param postId The post's ID.
	 * @param attribute The information that the post has (sound, movie, picture).
	 * 					The attributes: "sound", "movie", "picture".
	 * @param index The index.
	 * @return The ID of a specific attachment.
	 * @throws Exception If the attribute is null or empty. If index is null or less than 0 (zero).
	 *                   If the postId is null, empty doesn't exist a post with passed postId.
	 */
	public String getPostAttachmentsInformation(String postId, String attribute, Integer index) throws Exception {
		Post post = getPost(postId);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (isInvalidIndex(index)) {
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
		}
		
		if (attribute.equals(SOUND)) {
			if (index.compareTo(post.getNumberOfSounds()) < 0) {
				return getInteractiveContent(post.getSoundId(index)).getId();
			}
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
			
		} else if(attribute.equals(PICTURE)) {
			if (index.compareTo(post.getNumberOfPictures()) < 0) {
				return getInteractiveContent(post.getPictureId(index)).getId();
			}
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
			
		} else if (attribute.equals(MOVIE)) {
			if (index.compareTo(post.getNumberOfMovies()) < 0) {
				return getInteractiveContent(post.getMovieId(index)).getId();
			}
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
			
		} else {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
	}
	
	/**
	 * Return a numerical informal about the post's information.
	 * @param postId The post's ID.
	 * @param attribute The information that the post has (number of sounds, number of pictures, number of movies).
	 *                  The attributes: "number_of_sounds", "number_of_movies", "number_of_pictures".
	 * @return The number of determinate post's attachments.
	 * @throws Exception Is attribute is null or empty. If the postId is null, empty or doesn't exist a post with passed postId.
	 */
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
	
	/**
	 * Return the author's ID of a specific post.
	 * @param postId The post's ID.
	 * @return The author's ID.
	 * @throws Exception If postId if null, empty or doesn't exist a post with the passed postId.
	 */
	public String getPostAuthor(String postId) throws Exception {
		return getBlog(getPost(postId).getParentId()).getAuthorId();
	}
	
	/**
	 * Return the post's ID from a blog.
	 * @param blogId The blog's ID.
	 * @param index The index of the post on the blog.
	 * @return The post's ID.
	 * @throws Exception If blogId is null, empty or doesn't exist a blog with the passed blogId.
	 * 					 If the index is less then 0 (zero).
	 */
	public String getPostFromBlog(String blogId, Integer index) throws Exception {
		Blog blog = getBlog(blogId);
		
		if (isInvalidIndex(index)) {
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
		}
		return blog.getPost(index);
	}
	
	/**
	 * Return the post's information.
	 * @param postId The post's ID.
	 * @param attribute The information that the post has (title, text, creation date). 
	 * 					The attributes: "dono", "texto", "data_criacao".
	 * @return The post's information.
	 * @throws Exception If attribute is null or empty. If the postId is null, empty or doesn't exist a post with passed postId.
	 */
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
	
	/**
	 * Returns the subComment at Index passed.
	 * @param parentCommentId Parent Comment Id.
	 * @param index Index of searched subComment. (0<=x<numOfSubComments)
	 * @return Searched sub comment id.
	 * @throws Exception If the parent comment passed doesn't exist or if was passed an invalid index.
	 */
	public String getSubComment(String parentCommentId, Integer index) throws Exception {
		Comment parentComment = getComment(parentCommentId);
		if (isInvalidIndex(index) || index.compareTo(parentComment.getNumberOfSubComments()) >= 0) {
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
		}
		return parentComment.getSubComments().get(index);
	}
	
	/**
	 * Returns the subBlog at passed index (Ordered by creation time).
	 * @param blogId Blog id.
	 * @param index Index of the wanted subBlog.
	 * @return SubBlog id.
	 * @throws Exception If doesn't exists a Blog with passed id.
	 */
	public String getSubBlog(String blogId, Integer index) throws Exception {
		Blog blog = getBlog(blogId);
		if (isInvalidIndex(index) || index.compareTo(blog.getNumberOfSubBlogs()) >= 0) {
			throw new IllegalArgumentException(INVALID_INDEX_MESSAGE);
		}
		return blog.getSubBlogs().get(index);
	}
	
	/**
	 * Return a announcement by the targetID.
	 * @param targetId The target's ID.
	 * @return The announcement.
	 */
	private AnnouncementIF createAnnouncement(String targetId) {
		String announcementId = IdGenerator.getInstance().getNextId();
		AnnouncementIF ann = new AnnouncementImpl(announcementId, targetId);
		return ann;
	}
	
	/**
	 * Return a announcement by the announcement's ID.
	 * @param announcementId The announcement's ID.
	 * @return The announcement.
	 * @throws Exception Throw if the id is null, empty or doesn't exist.
	 */
	private AnnouncementIF getAnnouncement(String announcementId) throws Exception {
		if (isInvalidString(announcementId) || !DatabaseFacade.getInstance().existsAnnouncementInDatabase(announcementId)) {
			throw new IllegalArgumentException(INVALID_ANNOUNCEMENT_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveAnnouncement(announcementId);
	}
	
	/**
	 * Return a specific blog.
	 * @param blogId The ID of the blog that will be find.
	 * @return The blog.
	 * @throws Exception Throw if the id is null, empty or doesn't exist.
	 */
	private Blog getBlog(String blogId) throws Exception {
		if (isInvalidString(blogId) || !DatabaseFacade.getInstance().existsBlogInDatabase(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveBlog(blogId);
	}
	
	/**
	 * Return a specific comment.
	 * @param commentId The ID of the comment that will be find.
	 * @return The comment.
	 * @throws Exception Throw if the id is null, empty or doesn't exist.
	 */
	private Comment getComment(String commentId) throws Exception {
		if (isInvalidString(commentId) || !DatabaseFacade.getInstance().existsCommentInDatabase(commentId)) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveComment(commentId);
	}
	
	/**
	 * Return a specific interative content.
	 * @param interactiveContentId The ID of the interactive content that will be find.
	 * @return The interactive content.
	 * @throws Exception Throw case the id is null, empty or doesn't exist.
	 */
	private InteractiveContent getInteractiveContent(String interactiveContentId) throws Exception {
		if (isInvalidString(interactiveContentId) || 
				!DatabaseFacade.getInstance().existsInteractiveContentInDatabase(interactiveContentId)) {
			throw new IllegalArgumentException(INVALID_INTERACTIVE_CONTENT_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveInteractiveContent(interactiveContentId);
	}
	
	/**
	 * Return a specific post.
	 * @param postId The ID of the post that will be find. 
	 * @return The post.
	 * @throws Exception Throw case the postId is null, empty or doesn't exist the post.
	 */
	private Post getPost(String postId) throws Exception {
		if (isInvalidString(postId) || !DatabaseFacade.getInstance().existsPostInDatabase(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrievePost(postId);
	}
	
	/**
	 * Verify if a string is invalida.
	 * @param str The string that will be verified.
	 * @return True case is invalid, or False otherwise.
	 */
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	/**
	 * Verify if a integer is invalid.
	 * @param index The integer that will be verified.
	 * @return True case is invalid, or False otherwise.
	 */
	private boolean isInvalidIndex(Integer index) {
		return index == null || index.compareTo(0) < 0;
	}	
}