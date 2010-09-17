package br.edu.ufcg.blogao.blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.StaticContent;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 31th August, 2010.
 */
public class Post implements WebElement {
	
	private final String MOVIES_KEY = "0";
	private final String PICTURES_KEY = "1";
	private final String SOUNDS_KEY = "2";
	
	private String id;
	private String parentId;
	private StaticContent title;
	private StaticContent text;
	private Calendar creationDate;
	private Map<String, List<String>> attachments;
	private List<String> comments;

	/**
	 * Default constructor.
	 * @param id the post's id
	 * @param title The post's title.
	 * @param text The post's text.
	 */
	public Post(String parentId, String id, StaticContent title, StaticContent text) {
		this.setParentId(parentId);
		this.id = id;
		this.setTitle(title);
		this.setText(text);
		creationDate = Calendar.getInstance();
		attachments = new HashMap<String, List<String>>();
		attachments.put(MOVIES_KEY, new ArrayList<String>());
		attachments.put(PICTURES_KEY, new ArrayList<String>());
		attachments.put(SOUNDS_KEY, new ArrayList<String>());
		comments = new ArrayList<String>();
	}
	
	public String getParentId() {
		return parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * Add a comment to the post.
	 * @param id Comment's ID.
	 */
	public void addComment(String commentId) {
		comments.add(commentId);
	}
	
	public void attachMovie(String movieId) {
		attachments.get(MOVIES_KEY).add(movieId);
	}
	
	public void attachPicture(String pictureId) {
		attachments.get(PICTURES_KEY).add(pictureId);
	}
	
	public void attachSound(String soundId) {
		attachments.get(SOUNDS_KEY).add(soundId);
	}
	
	/**
	 * Return a post's comment id.
	 * @param index Comment's id index.
	 * @return A post's commentId.
	 */
	public String getCommentId(int index) {
		return comments.get(index);
	}
	
	/**
	 * Return post's creation date.
	 */
	@Override
	public Calendar getCreationDate() {
		return creationDate;
	}
	
	@Override
	public String getId() {
		return id;
	}

	public String getMovieId(int index) {
		return attachments.get(MOVIES_KEY).get(index);
	}
	
	/**
	 * Return the total number of comments.
	 * @return The total number of comments.
	 */
	public Integer getNumberOfComments() {
		return comments.size();
	}
	
	public Integer getNumberOfMovies() {
		return attachments.get(MOVIES_KEY).size();
	}
	
	public Integer getNumberOfPictures() {
		return attachments.get(PICTURES_KEY).size();
	}
	
	public Integer getNumberOfSounds() {
		return attachments.get(SOUNDS_KEY).size();
	}
	
	/**
	 * Return post's title.
	 * @return Post's title.
	 */
	public StaticContent getTitle() {
		return title;
	}
	
	public String getPictureId(int index) {
		return attachments.get(PICTURES_KEY).get(index);
	}
	
	public String getSoundId(int index) {
		return attachments.get(SOUNDS_KEY).get(index);
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
	public void setTitle(StaticContent title) {
		this.title = title;
	}
}