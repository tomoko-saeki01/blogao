package br.edu.ufcg.blogao.persistence;

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
	
	public PostsKeeper() {
		xstream = new XStream();
	}

	void insertPost(Post post) throws Exception {
		if (existsPostInDatabase(post.getId())) {
			throw new IllegalStateException(EXISTENT_POST_MESSAGE);
		}
		File directoryStructure = new File(POSTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(POSTS_PARENT_PATH + post.getId() + POSTS_FILE_EXTENSION);
		xstream.toXML(post, new FileOutputStream(file));
	}

	Post retrievePost(String postId) throws Exception {
		if (!existsPostInDatabase(postId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(POSTS_PARENT_PATH + postId + POSTS_FILE_EXTENSION);
		return (Post) xstream.fromXML(new FileInputStream(file));
	}
	
	void updatePost(Post post) throws Exception {
		if (!existsPostInDatabase(post.getId())) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		File file = new File(POSTS_PARENT_PATH + post.getId() + POSTS_FILE_EXTENSION);
		xstream.toXML(post, new FileOutputStream(file));
	}
	
	void deletePost(String postId) throws Exception {
		if (!existsPostInDatabase(postId)) {
			throw new IllegalStateException(UNEXISTENT_POST_MESSAGE);
		}
		new File(POSTS_PARENT_PATH + postId + POSTS_FILE_EXTENSION).delete();
	}
	
	void deleteAllBlogs() {
		File postsDirectory = new File(POSTS_PARENT_PATH);
		postsDirectory.mkdirs();
		File[] postsFiles = postsDirectory.listFiles();
		for (File postFile : postsFiles) {
			postFile.delete();
		}
	}
	
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
	
	boolean existsPostInDatabase(String id) {
		return (new File(POSTS_PARENT_PATH + id + POSTS_FILE_EXTENSION)).exists();
	}

}
