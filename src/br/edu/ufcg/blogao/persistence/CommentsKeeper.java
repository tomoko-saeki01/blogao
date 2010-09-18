package br.edu.ufcg.blogao.persistence;

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
	
	public CommentsKeeper() {
		xstream = new XStream();
	}

	void insertComment(Comment comment) throws Exception {
		if (existsCommentInDatabase(comment.getId())) {
			throw new IllegalStateException(EXISTENT_COMMENT_MESSAGE);
		}
		File directoryStructure = new File(COMMENTS_PARENT_PATH);
		directoryStructure.mkdirs();
		File file = new File(COMMENTS_PARENT_PATH + comment.getId() + COMMENTS_FILE_EXTENSION);
		xstream.toXML(comment, new FileOutputStream(file));
	}

	Comment retrieveComment(String commentId) throws Exception {
		if (!existsCommentInDatabase(commentId)) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		File file = new File(COMMENTS_PARENT_PATH + commentId + COMMENTS_FILE_EXTENSION);
		return (Comment) xstream.fromXML(new FileInputStream(file));
	}
	
	void updateComment(Comment comment) throws Exception {
		if (!existsCommentInDatabase(comment.getId())) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		File file = new File(COMMENTS_PARENT_PATH + comment.getId() + COMMENTS_FILE_EXTENSION);
		xstream.toXML(comment, new FileOutputStream(file));
	}
	
	void deleteComment(String commentId) throws Exception {
		if (!existsCommentInDatabase(commentId)) {
			throw new IllegalStateException(UNEXISTENT_COMMENT_MESSAGE);
		}
		new File(COMMENTS_PARENT_PATH + commentId + COMMENTS_FILE_EXTENSION).delete();
	}
	
	void deleteAllComments() {
		File commentsDirectory = new File(COMMENTS_PARENT_PATH);
		commentsDirectory.mkdirs();
		File[] commentsFiles = commentsDirectory.listFiles();
		for (File commentFile : commentsFiles) {
			commentFile.delete();
		}
	}
	
	Map<String, Comment> getAllComments() {
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
	
	boolean existsCommentInDatabase(String id) {
		return (new File(COMMENTS_PARENT_PATH + id + COMMENTS_FILE_EXTENSION)).exists();
	}
}
