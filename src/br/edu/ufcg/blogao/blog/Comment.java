package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 31th August, 2010.
 */

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Comment implements WebElement {
	
	private String id;
	private String author;
	private StaticContent text;
	private Calendar date;
	private Map<String, Comment> subComments;

	/**
	 * Default constructor.
	 * @param author Comment's author.
	 * @param text Comment.
	 */
	public Comment(String author, StaticContent text) {
		this.author = author;
		this.text = text;
		
		subComments = new HashMap<String, Comment>();
		
		date = Calendar.getInstance();
	}
	
	/**
	 * Add a subComment to the comment.
	 * @param subComment The subComment.
	 * @param id The subComment's ID.
	 */
	public void addSubComment(Comment subComment, String id) {
		subComments.put(id, subComment);
	}
	
	/**
	 * Return comment's author.
	 * @return The comment's author.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Return creation date.
	 */
	@Override
	public Calendar getCreationDate() {
		return date;
	}

	/**
	 * Return comment's ID.
	 */
	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * Return the total number of all subComments.
	 * @return The total number of all subComments.
	 */
	public Integer getNumberOfAllSubComments() {
		int total = 0;
		Collection<Comment> sub = subComments.values();
		for (Comment b: sub) {
			total += b.getNumberOfSubComments();
		}		
		return total;
	}
	
	/**
	 * Return the number of subComments.
	 * @return The number of subComments.
	 */
	public Integer getNumberOfSubComments() {
		return subComments.size();
	}
	
	/**
	 * Return comment's text.
	 */
	@Override
	public StaticContent getText() {
		return text;
	}
	
	/**
	 * Return a subComment.
	 * @param index The index of the subComment.
	 * @return A subComment.
	 */
	public Comment getSubComment(int index) {
		return subComments.get(index);
	}

	/**
	 * Set the comment's author.
	 * @param author The comment's author.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void setID(String id) {
		this.id = id;
	}
	
	/**
	 * Set the comment's text.
	 */
	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}

}