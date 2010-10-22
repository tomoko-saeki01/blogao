package br.edu.ufcg.blogao.blog;

/**
 * Represents the comment of a post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Comment implements WebElementIF {
	
	private String id;
	private String parentId;
	private String authorId;
	private StaticContent text;
	private Calendar date;
	private List<String> subComments; //<subCommentsID>

	/**
	 * Default constructor.
	 * @param id The comment's ID.
	 * @param parentId The parent's ID.
	 * @param authorId The comment's author ID.
	 * @param text The text of the comment.
	 */
	public Comment(String id, String parentId, String authorId, StaticContent text) {
		this.id = id;
		this.parentId = parentId;
		this.setAuthorId(authorId);
		this.setText(text);
		this.date = Calendar.getInstance();
		this.subComments = new ArrayList<String>();
	}
	
	/**
	 * Add a subComment to the comment.
	 * @param subcommentID The subComment's ID.
	 */
	public void addSubComment(String subcommentID) {
		subComments.add(subcommentID);
	}
	
	/**
	 * Return the author's ID of the comment.
	 * @return The comment's author id.
	 */
	public String getAuthorId() {
		return authorId;
	}
	
	@Override
	public Calendar getCreationDate() {
		return date;
	}

	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * Return the total number of subComments.
	 * @return The total number of subComments.
	 */
	public Integer getNumberOfSubComments() {
		return subComments.size();
	}
	
	@Override
	public StaticContent getText() {
		return text;
	}
	
	/**
	 * Return the parent's ID.
	 * @return The parent's ID.
	 */
	public String getParentId() {
		return parentId;
	}
	
	/**
	 * Returns a list with all the subComments.
	 * @return All subComments' IDs of the comment.
	 */
	public List<String> getSubComments() {
		return subComments;
	}

	/**
	 * Set the author's ID of the comment.
	 * @param authorId The author's ID of the comment.
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}
	
	/**
	 * Remove a subComment of the comment.
	 * @param subCommentId The ID of the subComment that will be removed.
	 */
	public void removeSubComment(String subCommentId) {
		subComments.remove(subCommentId);
	}
}