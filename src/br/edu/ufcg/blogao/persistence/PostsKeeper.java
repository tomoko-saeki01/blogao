package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's post.
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
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.blog.Post;

import com.thoughtworks.xstream.XStream;

public class PostsKeeper {
	
	private final String SEP = System.getProperty("file.separator");
	private final String POSTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "posts" + SEP;
	private final String POSTS_FILE_EXTENSION = ".post";
	private final String EXISTENT_POST_MESSAGE = "Post existente no banco de dados";
	private final String UNEXISTENT_POST_MESSAGE = "Post inexistente no banco de dados";
	private XStream xstream = null;	
	
	/**
	 * Default constructor.
	 */
	public PostsKeeper() {
		xstream = new XStream();
	}

	/**
	 * Delete all existing posts.
	 */
	void deleteAllPosts() {
		File postsDirectory = new File(POSTS_PARENT_PATH);
		postsDirectory.mkdirs();
		File[] postsFiles = postsDirectory.listFiles();
		for (File postFile : postsFiles) {
			postFile.delete();
		}
	}	
	
	/**
	 * Delete a specific post.
	 * @param postId The post's ID that will be deleted.
	 * @throws Exception If the post doesn't exist in database.
	 */
	void deletePost(String postId) throws Exception {
		if (!existsPostInDatabase(postId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		new File(POSTS_PARENT_PATH + postId + POSTS_FILE_EXTENSION).delete();
	}
	
	/**
	 * Verify if a specific post exist.
	 * @param id The post's ID that will be checked.
	 * @return True case the post exist or False otherwise.
	 */
	boolean existsPostInDatabase(String id) {
		return (new File(POSTS_PARENT_PATH + id + POSTS_FILE_EXTENSION)).exists();
	}

	/**
	 * Return a map with all existing posts.
	 * @return A map with all posts.
	 */
	Map<String, Post> getAllPosts() {
		File postsDirectory = new File(POSTS_PARENT_PATH);
		postsDirectory.mkdirs();
		File[] postsFiles = postsDirectory.listFiles();
		Map<String, Post> posts = new HashMap<String, Post>();
		for (File postFile : postsFiles) {
			if (postFile.getName().endsWith(POSTS_FILE_EXTENSION)) {
				try {
					Post post = (Post) xstream.fromXML(new FileInputStream(postFile));
					posts.put(post.getId(), post);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return posts;
	}
	
	/**
	 * Insert a new post.
	 * @param post The post that will be inserted.
	 * @throws Exception If the post already exist in database.
	 */
	void insertPost(Post post) throws Exception {
		if (existsPostInDatabase(post.getId())) {
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		}
		File directoryStructure = new File(POSTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(POSTS_PARENT_PATH + post.getId() + POSTS_FILE_EXTENSION);
		xstream.toXML(post, new FileOutputStream(file));
	}

	/**
	 * Retrieve a specific post.
	 * @param postId The post's ID that will be retrieved.
	 * @return The post.
	 * @throws Exception If the post doesn't exist in database.
	 */
	Post retrievePost(String postId) throws Exception {
		if (!existsPostInDatabase(postId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(POSTS_PARENT_PATH + postId + POSTS_FILE_EXTENSION);
		return (Post) xstream.fromXML(new FileInputStream(file));
	}
	
	/**
	 * Update a post.
	 * @param post The post that will be updated.
	 * @throws Exception If the post doesn't exist in database.
	 */
	void updatePost(Post post) throws Exception {
		if (!existsPostInDatabase(post.getId())) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(POSTS_PARENT_PATH + post.getId() + POSTS_FILE_EXTENSION);
		xstream.toXML(post, new FileOutputStream(file));
	}
}