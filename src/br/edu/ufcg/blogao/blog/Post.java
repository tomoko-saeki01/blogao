package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 31th August, 2010.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.*;

public class Post implements WebElement {
	
	private String id;
	private String title;
	private StaticContent text;
	private Calendar date;
	private List<InteractiveContent> content;
	private Map<String, Comment> comments; //<id, comment>

	/**
	 * Default constructor.
	 * @param title The post's title.
	 * @param text The post's text.
	 */
	public Post(String title, StaticContent text) {
		this.title = title;
		this.text = text;
		
		date = Calendar.getInstance();
		
		content = new ArrayList<InteractiveContent>();
		comments = new HashMap<String, Comment>();
	}
	
	/**
	 * Add a comment to the post.
	 * @param comment Post's comment.
	 * @param id Comment's ID.
	 */
	public void addComment(Comment comment, String id) {
		comments.put(id, comment);
	}
	
	public String attachMovie(String description, String data) {
		// TODO
		return null;
	}
	
	public String attachPicture(String description, String data) {
		// TODO
		return null;
	}
	
	public String attachSound(String description, String data) {
		// TODO
		return null;
	}
	
	/**
	 * Return a post's comment.
	 * @param index Comment's index.
	 * @return A post's comment.
	 */
	public Comment getComment(int index) {
		return comments.get(index);
	}
	
	/**
	 * Return post's creation date.
	 */
	@Override
	public Calendar getCreationDate() {
		return date;
	}
	
	/**
	 * Return post's ID.
	 */
	@Override
	public String getId() {
		return id;
	}

	public Movie getMovie(int index) {
		// TODO
		return null;
	}
	
	/**
	 * Return the total number of comments.
	 * @return The total number of comments.
	 */
	public Integer getNumberOfComments() {
		int total = 0;
		Collection<Comment> allComments = comments.values();		
		for (Comment c : allComments) {
			total += c.getNumberOfAllSubComments();
		}
		return total;
	}
	
	public Integer getNumberOfMovies() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfPictures() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfSounds() {
		// TODO
		return null;
	}
	
	/**
	 * Return post's title.
	 * @return Post's title.
	 */
	public String getTitle() {
		return title;
	}
	
	public Picture getPicture(int index) {
		// TODO
		return null;
	}
	
	public Sound getSound(int index) {
		// TODO
		return null;
	}
	
	/**
	 * Return post's text.
	 */
	@Override
	public StaticContent getText() {
		return text;
	}

	/**
	 * Set the post's text.
	 */
	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}
	
	/**
	 * Set post's title.
	 * @param title Post's title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}