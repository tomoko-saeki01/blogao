package br.edu.ufcg.blogao.persistence;

import java.util.Map;

import br.edu.ufcg.blogao.blog.Blog;
import br.edu.ufcg.blogao.blog.Comment;
import br.edu.ufcg.blogao.blog.Post;
import br.edu.ufcg.blogao.blog.data.InteractiveContent;
import br.edu.ufcg.blogao.user.UserIF;

public class DatabaseFacade {
	
	private final String INVALID_BLOG_MESSAGE = "Blog inv‡lido aa";
	private final String INVALID_COMMENT_MESSAGE = "Coment‡rio inv‡lido";
	private final String INVALID_USER_MESSAGE = "Usu‡rio inv‡lido";
	private final String INVALID_POST_MESSAGE = "Post inv‡lido";
	private final String INVALID_IC_MESSAGE = "Conteœdo inv‡lido";
	private static DatabaseFacade selfInstance = null;
	private BlogsKeeper blogsKeeper = null;
	private CommentsKeeper commentsKeeper = null;
	private InteractiveContentsKeeper icKeeper = null;
	private PostsKeeper postsKeeper = null;
	private UserIFsKeeper usersKeeper = null;
	
	private DatabaseFacade(){
		blogsKeeper = new BlogsKeeper();
		postsKeeper = new PostsKeeper();
		usersKeeper = new UserIFsKeeper();
		icKeeper = new InteractiveContentsKeeper();
		commentsKeeper = new CommentsKeeper();
	}
	
	public synchronized static DatabaseFacade getInstance() {
		if (selfInstance == null) {
			selfInstance = new DatabaseFacade();
		}
		return selfInstance;
	}
	
	public synchronized void deleteBlog(String blogId) throws Exception {
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.deleteBlog(blogId);
	}
	
	public synchronized void deleteComment(String commentId) throws Exception {
		if (isInvalidString(commentId)) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.deleteComment(commentId);
	}
	
	public synchronized void deleteInteractiveContent(String icId) throws Exception {
		if (isInvalidString(icId)) {
			throw new IllegalArgumentException(INVALID_IC_MESSAGE);
		}
		icKeeper.deleteInteractiveContent(icId);
	}
	
	public synchronized void deletePost(String postId) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.deletePost(postId);
	}
	
	public synchronized void deleteUser(String userId) throws Exception {
		if (isInvalidString(userId)) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.deleteUser(userId);
	}
	
	public synchronized void insertBlog(Blog blog) throws Exception {
		if (blog == null) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.insertBlog(blog);
	}
	
	public synchronized void insertComment(Comment comment) throws Exception {
		if (comment == null) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.insertComment(comment);
	}
	
	public synchronized void insertInteractiveContent(InteractiveContent content) throws Exception {
		if (content == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		icKeeper.insertInteractiveContent(content);
	}
	
	public synchronized void insertPost(Post post) throws Exception {
		if (post == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.insertPost(post);
	}
	
	public synchronized void insertUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.insertUser(user);
	}
	
	public Blog retrieveBlog(String blogId) throws Exception{
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return blogsKeeper.retrieveBlog(blogId);
	}
	
	public Comment retrieveComment(String commentId) throws Exception{
		if (isInvalidString(commentId)) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		return commentsKeeper.retrieveComment(commentId);
	}
	
	public InteractiveContent retrieveInteractiveContent(String icId) throws Exception {
		if (isInvalidString(icId)) {
			throw new IllegalArgumentException(INVALID_IC_MESSAGE);
		}
		return icKeeper.retrieveInteractiveContent(icId);
	}
	
	public Post retrievePost(String postId) throws Exception {
		if (isInvalidString(postId)) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		return postsKeeper.retrievePost(postId);
	}
	
	public UserIF retrieveUser(String userId) throws Exception{
		if (isInvalidString(userId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return usersKeeper.retrieveUser(userId);
	}
	
	public synchronized void updateBlog(Blog blog) throws Exception {
		if (blog == null) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		blogsKeeper.updateBlog(blog);
	}
	
	public synchronized void updateComment(Comment comment) throws Exception {
		if (comment == null) {
			throw new IllegalArgumentException(INVALID_COMMENT_MESSAGE);
		}
		commentsKeeper.updateComment(comment);
	}
	
	public synchronized void updatePost(Post post) throws Exception {
		if (post == null) {
			throw new IllegalArgumentException(INVALID_POST_MESSAGE);
		}
		postsKeeper.updatePost(post);
	}
	
	public synchronized void updateUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.updateUser(user);
	}
	
	public void cleanPersistence() {
		blogsKeeper.deleteAllBlogs();
		usersKeeper.deleteAllUsers();
		postsKeeper.deleteAllPosts();
		commentsKeeper.deleteAllComments();
		icKeeper.deleteAllInteractiveContents();
	}

	public Map<String, UserIF> getAllUsers() {
		return usersKeeper.getAllUsers();
	}
	
	public Map<String, Blog> getAllBlogs() {
		return blogsKeeper.getAllBlogs();
	}
	
	public boolean existsBlogInDatabase(String blogId) {
		return blogsKeeper.existsBlogInDatabase(blogId);
	}
	
	public boolean existsCommentInDatabase(String commentId) {
		return commentsKeeper.existsCommentInDatabase(commentId);
	}
	
	public boolean existsUserInDatabase(String userId) {
		return usersKeeper.existsUserInDatabase(userId);
	}
	
	public boolean existsInteractiveContentInDatabase(String icId) {
		return icKeeper.existsInteractiveContentInDatabase(icId);
	}
	
	public boolean existsPostInDatabase(String postId) {
		return postsKeeper.existsPostInDatabase(postId);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
	
}
