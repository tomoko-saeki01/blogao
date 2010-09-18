package br.edu.ufcg.blogao.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
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
	
	public BlogsKeeper() {
		xstream = new XStream();
	}

	void insertBlog(Blog blog) throws Exception {
		if (existsBlogInDatabase(blog.getId())) {
			throw new IllegalStateException(EXISTENT_BLOG_MESSAGE);
		}
		File directoryStructure = new File(BLOGS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(BLOGS_PARENT_PATH + blog.getId() + BLOGS_FILE_EXTENSION);
		xstream.toXML(blog, new FileOutputStream(file));
	}

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
	
	void deleteBlog(String blogId) throws Exception {
		if (!existsBlogInDatabase(blogId)) {
			throw new IllegalStateException(UNEXISTENT_BLOG_MESSAGE);
		}
		new File(BLOGS_PARENT_PATH + blogId + BLOGS_FILE_EXTENSION).delete();
	}
	
	void deleteAllBlogs() {
		File blogsDirectory = new File(BLOGS_PARENT_PATH);
		blogsDirectory.mkdirs();
		File[] blogsFiles = blogsDirectory.listFiles();
		for (File blogFile : blogsFiles) {
			blogFile.delete();
		}
	}
	
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
	
	boolean existsBlogInDatabase(String id) {
		return (new File(BLOGS_PARENT_PATH + id + BLOGS_FILE_EXTENSION)).exists();
	}

}
