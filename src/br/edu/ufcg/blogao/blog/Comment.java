package br.edu.ufcg.blogao.blog;

/**
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 1.0 20/09/2010
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Comment implements WebElement {
	
	private String id;
	private String parentId;
	private String authorId;
	private StaticContent text;
	private Calendar date;
	private List<String> subComments; //<subCommentsID>

	/**
	 * Default constructor.
	 * @param id The comment's ID.
	 * @param parentId
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
	 * Return comment's author id.
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
	 * Return the number of subComments.
	 * @return The number of subComments.
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
	 * Returns subComments.
	 * @return All subComments ids of this Comment.
	 */
	public List<String> getSubComments() {
		return subComments;
	}

	/**
	 * Set the comment's author id.
	 * @param author The comment's author id.
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}
	
	public void removeSubComment(String subCommentId) {
		subComments.remove(subCommentId);
	}
}