package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 3.0 - 31th August, 2010.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;

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
	 * Return the total number of all subComments.
	 * @return The total number of all subComments.
	 */
	public Integer getNumberOfAllSubComments() {
		return subComments.size();
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
	 * Return a subComment.
	 * @param index The index of the subComment.
	 * @return A subComment.
	 * @throws Exception If subCommentId is null or "" or doesn't exist a subComment with passed subCommentId. 
	 */
	public Comment getSubComment(int index) throws Exception {
		return DatabaseFacade.getInstance().retrieveComment(subComments.get(index));
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
}