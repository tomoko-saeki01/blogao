package br.edu.ufcg.blogao.persistence;

import java.util.Map;

import br.edu.ufcg.blogao.blog.Blog;
import br.edu.ufcg.blogao.user.UserIF;

public class DatabaseFacade {
	
	private final String INVALID_BLOG_MESSAGE = "Blog inv‡lido";
	private final String INVALID_USER_MESSAGE = "Usu‡rio inv‡lido";
	private static DatabaseFacade selfInstance = null;
	private BlogsKeeper blogsKeeper = null;
	private UserIFsKeeper usersKeeper = null;
	
	private DatabaseFacade(){
		blogsKeeper = new BlogsKeeper();
		usersKeeper = new UserIFsKeeper();
	}
	
	public static DatabaseFacade getInstance() {
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
	
	public synchronized void insertUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.insertUser(user);
	}
	
	public synchronized Blog retrieveBlog(String blogId) throws Exception{
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_BLOG_MESSAGE);
		}
		return blogsKeeper.retrieveBlog(blogId);
	}
	
	public synchronized UserIF retrieveUser(String userId) throws Exception{
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
	
	public synchronized void updateUser(UserIF user) throws Exception {
		if (user == null) {
			throw new IllegalArgumentException(INVALID_USER_MESSAGE);
		}
		usersKeeper.updateUser(user);
	}
	
	public void cleanPersistence() {
		blogsKeeper.deleteAllBlogs();
		usersKeeper.deleteAllUsers();
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
	
	public boolean existsUserInDatabase(String userId) {
		return usersKeeper.existsUserInDatabase(userId);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
	
	
}
