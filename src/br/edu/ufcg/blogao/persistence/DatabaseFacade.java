package br.edu.ufcg.blogao.persistence;

/** 
 * The Database facade.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.blog.AnnouncementIF;
import br.edu.ufcg.blogao.blog.Blog;
import br.edu.ufcg.blogao.blog.Comment;
import br.edu.ufcg.blogao.blog.Post;
import br.edu.ufcg.blogao.blog.data.InteractiveContent;
import br.edu.ufcg.blogao.user.UserIF;

public class DatabaseFacade {
	
	private final String INVALID_BLOG_MESSAGE = "Blog inv‡lido";
	private final String INVALID_COMMENT_MESSAGE = "Coment‡rio inv‡lido";
	private final String INVALID_USER_MESSAGE = "Usu‡rio inv‡lido";
	private final String INVALID_POST_MESSAGE = "Post inv‡lido";
	private final String INVALID_IC_MESSAGE = "Conteœdo inv‡lido";
	private final String INVALID_ANNOUNCEMENT_MESSAGE = "Anuncio inv‡lido";
	private static DatabaseFacade selfInstance = null;
	private AbstractKeeper<Blog> blogsKeeper = null;
	private AbstractKeeper<Comment> commentsKeeper = null;
	private AbstractKeeper<InteractiveContent> icKeeper = null;
	private AbstractKeeper<Post> postsKeeper = null;
	private AbstractKeeper<UserIF> usersKeeper = null;
	private AbstractKeeper<AnnouncementIF> annKeeper = null;	
	
	protected DatabaseFacade(){		
		blogsKeeper = new BlogsKeeper();
		postsKeeper = new PostsKeeper();
		usersKeeper = new UserIFsKeeper();
		icKeeper = new InteractiveContentsKeeper();
		commentsKeeper = new CommentsKeeper();
		annKeeper = new AnnouncementsKeeper();
	}
	
	/**
	 * Return the instance of the Database Facade.
	 * @return The instance of the Database Facade.
	 */
	public synchronized static DatabaseFacade getInstance() {
		if (selfInstance == null) {
			selfInstance = new DatabaseFacade();
		}
		return selfInstance;
	}
	
	/**
	 * Clean the persistence of datas.
	 */
	public void cleanPersistence() {
		blogsKeeper.deleteAllElements();
		usersKeeper.deleteAllElements();
		postsKeeper.deleteAllElements();
		commentsKeeper.deleteAllElements();
		icKeeper.deleteAllElements();
		annKeeper.deleteAllElements();
	}
	
	/**
	 * Delete a announcement.
	 * @param announcementId The announcement's ID.
	 * @throws Exception If announcementId is null or empty.
	 */
	public synchronized void deleteAnnouncement(String announcementId) throws Exception {
		if (isInvalidString(announcementId)) {
			throw new IllegalArgumentException(INVALID_ANNOUNCEMENT_MESSAGE);
		}
		annKeeper.deleteElement(announcementId);
	}
	
	/**
	 * Delete a blog.
	 * @param blogId The blog's ID.
	 * @throws Exception If the blogId is null or empty.
	 */
	public synchronized void deleteBlog(String blogId) throws Exception {
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.deleteElement(blogId);
	}
	
	/**
	 * Delete a comment.
	 * @param commentId The comment's ID.
	 * @throws Exception If the commentId is null or empty.
	 */
	public synchronized void deleteComment(String commentId) throws Exception {
		if (isInvalidString(commentId)) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.deleteElement(commentId);
	}
	
	/**
	 * Delete a interactive content.
	 * @param icId The IC's ID.
	 * @throws Exception If the icId is null or empty.
	 */
	public synchronized void deleteInteractiveContent(String icId) throws Exception {
		if (isInvalidString(icId)) {
			throw new IllegalArgumentException(INVALID_IC_MESSAGE);
		}
		icKeeper.deleteElement(icId);
	}
	
	/**
	 * Delete a post.
	 * @param postId The post's ID.
	 * @throws Exception If the postId is null or empty.
	 */
	public synchronized void deletePost(String postId) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.deleteElement(postId);
	}
	
	/**
	 * Delete a user.
	 * @param userId The user's ID.
	 * @throws Exception If the userId is null or empty.
	 */
	public synchronized void deleteUser(String userId) throws Exception {
		if (isInvalidString(userId)) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.deleteElement(userId);
	}
	
	/**
	 * Verify if exist the announcement in database.
	 * @param announcementId The announcement that will be verified. 
	 * @return True case the announcement exist or False otherwise.
	 */
	public boolean existsAnnouncementInDatabase(String announcementId) {
		return annKeeper.existsElementInDatabase(announcementId);
	}
	
	/**
	 * Verify if exist the blog in the database.
	 * @param blogId The blog's ID.
	 * @return True case the blog exist or False otherwise.
	 */
	public boolean existsBlogInDatabase(String blogId) {
		return blogsKeeper.existsElementInDatabase(blogId);
	}
	
	/**
	 * Verify the comment in the database.
	 * @param commentId The comment's ID.
	 * @return True case the comment exist or False otherwise.
	 */
	public boolean existsCommentInDatabase(String commentId) {
		return commentsKeeper.existsElementInDatabase(commentId);
	}

	/**
	 * Verify if exist the interactive content in the database.
	 * @param icId The IC's ID.
	 * @return True case the IC exist or False otherwise.
	 */
	public boolean existsInteractiveContentInDatabase(String icId) {
		return icKeeper.existsElementInDatabase(icId);
	}
	
	/**
	 * Verify if exist the post in the database.
	 * @param postId The post's ID.
	 * @return True case the post exist or False otherwise.
	 */
	public boolean existsPostInDatabase(String postId) {
		return postsKeeper.existsElementInDatabase(postId);
	}
	
	/**
	 * Verify if exist the user in the database.
	 * @param userId The user's ID.
	 * @return True case the user exist or False otherwise.
	 */
	public boolean existsUserInDatabase(String userId) {
		return usersKeeper.existsElementInDatabase(userId);
	}
	
	/**
	 * Return all the users existing.
	 * @return All the users existing.
	 */
	public Map<String, UserIF> getAllUsers() {
		return usersKeeper.getAllElements();
	}
	
	/**
	 * Return all the blogs existing.
	 * @return All the blogs existing.
	 */
	public Map<String, Blog> getAllBlogs() {
		return blogsKeeper.getAllElements();
	}
		
	/**
	 * Insert a announcement.
	 * @param ann The announcement that will be inserted.
	 * @throws Exception If the ann is null.
	 */
	public synchronized void insertAnnouncement(AnnouncementIF ann) throws Exception {
		if (ann == null) {
			throw new IllegalArgumentException(INVALID_ANNOUNCEMENT_MESSAGE);
		}
		annKeeper.insertElement(ann);
	}
	
	/**
	 * Insert a blog.
	 * @param blog The blog that will be inserted.
	 * @throws Exception If the blog is null.
	 */
	public synchronized void insertBlog(Blog blog) throws Exception {
		if (blog == null) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.insertElement(blog);
	}
	
	/**
	 * Insert a comment.
	 * @param comment The comment that will be inserted.
	 * @throws Exception If comment is null.
	 */
	public synchronized void insertComment(Comment comment) throws Exception {
		if (comment == null) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.insertElement(comment);
	}
	
	/**
	 * Insert a interactive content.
	 * @param content The IC that will be inserted.
	 * @throws Exception If the content if null.
	 */
	public synchronized void insertInteractiveContent(InteractiveContent content) throws Exception {
		if (content == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		icKeeper.insertElement(content);
	}
	
	/**
	 * Insert a post.
	 * @param post The post that will be inserted.
	 * @throws Exception If the post is null.
	 */
	public synchronized void insertPost(Post post) throws Exception {
		if (post == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.insertElement(post);
	}
	
	/**
	 * Insert a user.
	 * @param user The user that will be inserted.
	 * @throws Exception If the user is null.
	 */
	public synchronized void insertUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.insertElement(user);
	}
	
	/**
	 * Return a list with all the blogs stored in database.
	 * @return A list with all the blogs stored in database.
	 */
	public List<String> listBlogsInDatabase() {
		return blogsKeeper.listElementsInDatabase();
	}
	
	/**
	 * Return a list with all the users stored in database.
	 * @return A list with all the users stored in database.
	 */
	public List<String> listUsersInDatabase() {
		return usersKeeper.listElementsInDatabase();
	}
	
	/**
	 * Retrieve a announcement.
	 * @param announcementId The announcement'si ID. 
	 * @return The announcement.
	 * @throws Exception If the announcementId is null or empty.
	 */
	public AnnouncementIF retrieveAnnouncement(String announcementId) throws Exception{
		if (isInvalidString(announcementId)) {
			throw new IllegalArgumentException(INVALID_ANNOUNCEMENT_MESSAGE);
		}
		return annKeeper.retrieveElement(announcementId);
	}
	
	/**
	 * Retrieve a blog.
	 * @param blogId The blog's ID.
	 * @return The blog.
	 * @throws Exception If blogId is null or empty. 
	 */
	public Blog retrieveBlog(String blogId) throws Exception{
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return blogsKeeper.retrieveElement(blogId);
	}
	
	/**
	 * Retrieve a comment.
	 * @param commentId The comment's ID.
	 * @return The comment.
	 * @throws Exception If commentId is null or empty.
	 */
	public Comment retrieveComment(String commentId) throws Exception{
		if (isInvalidString(commentId)) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		return commentsKeeper.retrieveElement(commentId);
	}
	
	/**
	 * Retrieve a interactive content.
	 * @param icId The IC's ID.
	 * @return The interactive content.
	 * @throws Exception Is the icId is null or empty.
	 */
	public InteractiveContent retrieveInteractiveContent(String icId) throws Exception {
		if (isInvalidString(icId)) {
			throw new IllegalArgumentException(INVALID_IC_MESSAGE);
		}
		return icKeeper.retrieveElement(icId);
	}
	
	/**
	 * Retrieve a post.
	 * @param postId The post's ID.
	 * @return The post.
	 * @throws Exception If the postId is null or empty.
	 */
	public Post retrievePost(String postId) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		return postsKeeper.retrieveElement(postId);
	}
	
	/**
	 * Retrieve a user.
	 * @param userId The user's ID.
	 * @return The user.
	 * @throws Exception If the userId is null or empty.
	 */
	public UserIF retrieveUser(String userId) throws Exception{
		if (isInvalidString(userId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return usersKeeper.retrieveElement(userId);
	}
		
	/**
	 * Update the blog.
	 * @param blog The blog that will be updated.
	 * @throws Exception If the blog is null.
	 */
	public synchronized void updateBlog(Blog blog) throws Exception {
		if (blog == null) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.updateElement(blog);
	}
	
	/**
	 * Update the comment.
	 * @param comment The comment that will be updated.
	 * @throws Exception If the comment is null.
	 */
	public synchronized void updateComment(Comment comment) throws Exception {
		if (comment == null) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.updateElement(comment);
	}
	
	/**
	 * Update the post.
	 * @param post The post that will be updated.
	 * @throws Exception If the post is null.
	 */
	public synchronized void updatePost(Post post) throws Exception {
		if (post == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.updateElement(post);
	}
	
	/**
	 * Update the user.
	 * @param user The user that will be updated.
	 * @throws Exception If the user is null.
	 */
	public synchronized void updateUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.updateElement(user);
	}
		
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
}