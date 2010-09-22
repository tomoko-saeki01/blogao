package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's blog.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.blog.Blog;

import com.thoughtworks.xstream.XStream;

public class BlogsKeeper {

	private final String SEP = System.getProperty("file.separator");
	private final String BLOGS_PARENT_PATH = "resources" + SEP + "db" + SEP + "blogs" + SEP;
	private final String BLOGS_FILE_EXTENSION = ".blog";
	private final String EXISTENT_BLOG_MESSAGE = "Blog existente";
	private final String UNEXISTENT_BLOG_MESSAGE = "Blog inexistente";
	private XStream xstream = null;	
	
	/**
	 * Default constructor.
	 */
	public BlogsKeeper() {
		xstream = new XStream();
	}
	
	/**
	 * Delete all existing blogs.
	 */
	void deleteAllBlogs() {
		File blogsDirectory = new File(BLOGS_PARENT_PATH);
		blogsDirectory.mkdirs();
		File[] blogsFiles = blogsDirectory.listFiles();
		for (File blogFile : blogsFiles) {
			blogFile.delete();
		}
	}
	
	/**
	 * Delete a specific blog.
	 * @param blogId The blog's ID that will be deleted.
	 * @throws Exception If the blogId doesn't exist in database.
	 */
	void deleteBlog(String blogId) throws Exception {
		if (!existsBlogInDatabase(blogId)) {
			throw new IllegalStateException(UNEXISTENT_BLOG_MESSAGE);
		}
		new File(BLOGS_PARENT_PATH + blogId + BLOGS_FILE_EXTENSION).delete();
	}
	
	/**
	 * Verify if exist a specific blog in database.
	 * @param id The blog's ID that will be verified.
	 * @return True case the blog exist or False otherwise.
	 */
	boolean existsBlogInDatabase(String id) {
		return (new File(BLOGS_PARENT_PATH + id + BLOGS_FILE_EXTENSION)).exists();
	}
	
	/**
	 * Return a map with all blogs existing.
	 * @return A map with all blogs.
	 */
	Map<String, Blog> getAllBlogs() {
		File blogsDirectory = new File(BLOGS_PARENT_PATH);
		blogsDirectory.mkdirs();
		File[] blogsFiles = blogsDirectory.listFiles();
		Map<String, Blog> blogs = new HashMap<String, Blog>();
		for (File blogFile : blogsFiles) {
			if (blogFile.getName().endsWith(BLOGS_FILE_EXTENSION)) {
				try {
					Blog blog = (Blog) xstream.fromXML(new FileInputStream(blogFile));
					blogs.put(blog.getId(), blog);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return blogs;
	}

	/**
	 * Insert a new blog.
	 * @param blog The new blog that will be inserted.
	 * @throws Exception If the blog already exist in database.
	 */
	void insertBlog(Blog blog) throws Exception {
		if (existsBlogInDatabase(blog.getId())) {
			throw new IllegalStateException(EXISTENT_BLOG_MESSAGE);
		}
		File directoryStructure = new File(BLOGS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(BLOGS_PARENT_PATH + blog.getId() + BLOGS_FILE_EXTENSION);
		xstream.toXML(blog, new FileOutputStream(file));
	}
	
	/**
	 * Return a list with all the blog's ID in database.
	 * @return A list with all blog's ID.
	 */
	public List<String> listBlogsInDatabase() {
		File blogsDirectory = new File(BLOGS_PARENT_PATH);
		blogsDirectory.mkdirs();
		File[] blogsFiles = blogsDirectory.listFiles();
		List<String> blogsIds = new ArrayList<String>();
		for (File blogFile : blogsFiles) {
			String blogFileName = blogFile.getName();
			blogsIds.add(blogFileName.substring(0, blogFileName.length() - BLOGS_FILE_EXTENSION.length()));
		}
		return blogsIds;
	}

	/**
	 * Retrieve a specific blog.
	 * @param blogId The blog's ID that will be retrieved.
	 * @return The blog.
	 * @throws Exception If the blogId doesn't exist in database.
	 */
	Blog retrieveBlog(String blogId) throws Exception {
		if (!existsBlogInDatabase(blogId)) {
			throw new IllegalStateException(UNEXISTENT_BLOG_MESSAGE);
		}
		File file = new File(BLOGS_PARENT_PATH + blogId + BLOGS_FILE_EXTENSION);
		return (Blog) xstream.fromXML(new FileInputStream(file));
	}
	
	void updateBlog(Blog blog) throws Exception {
		if (!existsBlogInDatabase(blog.getId())) {
			throw new IllegalStateException(UNEXISTENT_BLOG_MESSAGE);
		}
		File file = new File(BLOGS_PARENT_PATH + blog.getId() + BLOGS_FILE_EXTENSION);
		xstream.toXML(blog, new FileOutputStream(file));
	}	
}