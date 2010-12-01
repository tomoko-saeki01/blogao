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
	
	private final String INVALID_BLOG_MESSAGE = "Blog inválido";
	private final String INVALID_COMMENT_MESSAGE = "Comentário inválido";
	private final String INVALID_USER_MESSAGE = "Usuário inválido";
	private final String INVALID_POST_MESSAGE = "Post inválido";
	private final String INVALID_IC_MESSAGE = "Conteúdo inválido";
	private final String INVALID_ANNOUNCEMENT_MESSAGE = "Anúncio inválido";
	
	private static DatabaseFacade selfInstance = null;
	
	private AbstractDAO<Blog> blogDAO = null;
	private AbstractDAO<Comment> commentDAO = null;
	private AbstractDAO<InteractiveContent> icDAO = null;
	private AbstractDAO<Post> postDAO = null;
	private AbstractDAO<UserIF> userDAO = null;
	private AbstractDAO<AnnouncementIF> annDAO = null;	
	
	protected DatabaseFacade(){		
		blogDAO = new BlogDAO();
		postDAO = new PostDAO();
		userDAO = new UserIFDAO();
		icDAO = new InteractiveContentDAO();
		commentDAO = new CommentDAO();
		annDAO = new AnnouncementDAO();
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
		blogDAO.deleteAllElements();
		userDAO.deleteAllElements();
		postDAO.deleteAllElements();
		commentDAO.deleteAllElements();
		icDAO.deleteAllElements();
		annDAO.deleteAllElements();
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
		annDAO.deleteElement(announcementId);
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
		blogDAO.deleteElement(blogId);
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
		commentDAO.deleteElement(commentId);
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
		icDAO.deleteElement(icId);
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
		postDAO.deleteElement(postId);
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
		userDAO.deleteElement(userId);
	}
	
	/**
	 * Verify if exist the announcement in database.
	 * @param announcementId The announcement that will be verified. 
	 * @return True case the announcement exist or False otherwise.
	 */
	public boolean existsAnnouncementInDatabase(String announcementId) {
		return annDAO.existsElementInDatabase(announcementId);
	}
	
	/**
	 * Verify if exist the blog in the database.
	 * @param blogId The blog's ID.
	 * @return True case the blog exist or False otherwise.
	 */
	public boolean existsBlogInDatabase(String blogId) {
		return blogDAO.existsElementInDatabase(blogId);
	}
	
	/**
	 * Verify the comment in the database.
	 * @param commentId The comment's ID.
	 * @return True case the comment exist or False otherwise.
	 */
	public boolean existsCommentInDatabase(String commentId) {
		return commentDAO.existsElementInDatabase(commentId);
	}

	/**
	 * Verify if exist the interactive content in the database.
	 * @param icId The IC's ID.
	 * @return True case the IC exist or False otherwise.
	 */
	public boolean existsInteractiveContentInDatabase(String icId) {
		return icDAO.existsElementInDatabase(icId);
	}
	
	/**
	 * Verify if exist the post in the database.
	 * @param postId The post's ID.
	 * @return True case the post exist or False otherwise.
	 */
	public boolean existsPostInDatabase(String postId) {
		return postDAO.existsElementInDatabase(postId);
	}
	
	/**
	 * Verify if exist the user in the database.
	 * @param userId The user's ID.
	 * @return True case the user exist or False otherwise.
	 */
	public boolean existsUserInDatabase(String userId) {
		return userDAO.existsElementInDatabase(userId);
	}
	
	/**
	 * Return all the users existing.
	 * @return All the users existing.
	 */
	public Map<String, UserIF> getAllUsers() {
		return userDAO.getAllElements();
	}
	
	/**
	 * Return all the blogs existing.
	 * @return All the blogs existing.
	 */
	public Map<String, Blog> getAllBlogs() {
		return blogDAO.getAllElements();
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
		annDAO.insertElement(ann);
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
		blogDAO.insertElement(blog);
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
		commentDAO.insertElement(comment);
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
		icDAO.insertElement(content);
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
		postDAO.insertElement(post);
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
		userDAO.insertElement(user);
	}
	
	/**
	 * Return a list with all the blogs stored in database.
	 * @return A list with all the blogs stored in database.
	 */
	public List<String> listBlogsInDatabase() {
		return blogDAO.listElementsInDatabase();
	}
	
	/**
	 * Return a list with all the users stored in database.
	 * @return A list with all the users stored in database.
	 */
	public List<String> listUsersInDatabase() {
		return userDAO.listElementsInDatabase();
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
		return annDAO.retrieveElement(announcementId);
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
		return blogDAO.retrieveElement(blogId);
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
		return commentDAO.retrieveElement(commentId);
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
		return icDAO.retrieveElement(icId);
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
		return postDAO.retrieveElement(postId);
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
		return userDAO.retrieveElement(userId);
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
		blogDAO.updateElement(blog);
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
		commentDAO.updateElement(comment);
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
		postDAO.updateElement(post);
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
		userDAO.updateElement(user);
	}
		
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
}