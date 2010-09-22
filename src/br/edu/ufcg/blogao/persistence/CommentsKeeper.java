package br.edu.ufcg.blogao.persistence;

/** 
 * Keep the Blogao's comments.
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

import br.edu.ufcg.blogao.blog.Comment;

import com.thoughtworks.xstream.XStream;

public class CommentsKeeper {
	
	private final String SEP = System.getProperty("file.separator");
	private final String COMMENTS_PARENT_PATH = "resources" + SEP + "db" + SEP + "comments" + SEP;
	private final String COMMENTS_FILE_EXTENSION = ".comment";
	private final String EXISTENT_COMMENT_MESSAGE = "Coment‡rio existente no banco de dados";
	private final String UNEXISTENT_COMMENT_MESSAGE = "Coment‡rio inexistente no banco de dados";
	private XStream xstream = null;	
	
	/**
	 * Default constructor.
	 */
	public CommentsKeeper() {
		xstream = new XStream();
	}
	
	/**
	 * Delete all existing comments.
	 */
	public void deleteAllComments() {
		File commentsDirectory = new File(COMMENTS_PARENT_PATH);
		commentsDirectory.mkdirs();
		File[] commentsFiles = commentsDirectory.listFiles();
		for (File commentFile : commentsFiles) {
			commentFile.delete();
		}
	}
	
	/**
	 * Delete a specific comment.
	 * @param commentId The comment's ID that will be deleted.
	 * @throws Exception If the comment doesn't exist in database.
	 */
	public void deleteComment(String commentId) throws Exception {
		if (!existsCommentInDatabase(commentId)) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		new File(COMMENTS_PARENT_PATH + commentId + COMMENTS_FILE_EXTENSION).delete();
	}
	
	/**
	 * Verify if a comment exist in database. 
	 * @param id The comment's ID that will be verified.
	 * @return True case the comment exist or False otherwise.
	 */
	public boolean existsCommentInDatabase(String id) {
		return (new File(COMMENTS_PARENT_PATH + id + COMMENTS_FILE_EXTENSION)).exists();
	}

	/**
	 * Return a map with all the comments existing.
	 * @return A map with all the comments.
	 */
	public Map<String, Comment> getAllComments() {
		File commentsDirectory = new File(COMMENTS_PARENT_PATH);
		commentsDirectory.mkdirs();
		File[] commentsFiles = commentsDirectory.listFiles();
		Map<String, Comment> comments = new HashMap<String, Comment>();
		for (File commentFile : commentsFiles) {
			if (commentFile.getName().endsWith(COMMENTS_FILE_EXTENSION)) {
				try {
					Comment comment = (Comment) xstream.fromXML(new FileInputStream(commentFile));
					comments.put(comment.getId(), comment);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return comments;
	}
	
	/**
	 * Insert a new comment.
	 * @param comment The comment that will  be inserted.
	 * @throws Exception If the comment already exist.
	 */
	public void insertComment(Comment comment) throws Exception {
		if (existsCommentInDatabase(comment.getId())) {
			throw new IllegalStateException(EXISTENT_COMMENT_MESSAGE);
		}
		File directoryStructure = new File(COMMENTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(COMMENTS_PARENT_PATH + comment.getId() + COMMENTS_FILE_EXTENSION);
		xstream.toXML(comment, new FileOutputStream(file));
	}

	/**
	 * Retrieve a specific comment.
	 * @param commentId The comment's ID that will be retrieved.
	 * @return The comment.
	 * @throws Exception If the comment doesn't exist.
	 */
	public Comment retrieveComment(String commentId) throws Exception {
		if (!existsCommentInDatabase(commentId)) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		File file = new File(COMMENTS_PARENT_PATH + commentId + COMMENTS_FILE_EXTENSION);
		return (Comment) xstream.fromXML(new FileInputStream(file));
	}
	
	/**
	 * Update a comment.
	 * @param comment The comment that will be updated.
	 * @throws Exception If the comment doesn't exist.
	 */
	public void updateComment(Comment comment) throws Exception {
		if (!existsCommentInDatabase(comment.getId())) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		File file = new File(COMMENTS_PARENT_PATH + comment.getId() + COMMENTS_FILE_EXTENSION);
		xstream.toXML(comment, new FileOutputStream(file));
	}
}
