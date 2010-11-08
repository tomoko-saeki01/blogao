package br.edu.ufcg.blogao.blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.StaticContent;

/**
 * Represents the post of a blog.
 *
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public class Post implements WebElementIF {
	
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
	 * @param id The post's id
	 * @param title The post's title.
	 * @param text The post's text.
	 */
	public Post(String parentId, String id, StaticContent title, StaticContent text) {
		
		this.parentId = parentId;
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
			
	/**
	 * Add a comment to the post.
	 * @param commentId The comment's ID.
	 */
	public void addComment(String commentId) {
		comments.add(commentId);
	}
	
	/**
	 * Attach a movie to the post.
	 * @param movieId The movie's ID.
	 */
	public void attachMovie(String movieId) {
		attachments.get(MOVIES_KEY).add(movieId);
	}
	
	/**
	 * Attach a picture to the post.
	 * @param pictureId The picture's ID.
	 */
	public void attachPicture(String pictureId) {
		attachments.get(PICTURES_KEY).add(pictureId);
	}
	
	/**
	 * Attach a sound to the picture.
	 * @param soundId The sound's ID.
	 */
	public void attachSound(String soundId) {
		attachments.get(SOUNDS_KEY).add(soundId);
	}
	
	/**
	 * Return all the post's attachments.
	 * @return The post's attachments.
	 */
	public List<String> getAttachments() {
		List<String> attachmentsList = new ArrayList<String>();
		attachmentsList.addAll(attachments.get(MOVIES_KEY));
		attachmentsList.addAll(attachments.get(PICTURES_KEY));
		attachmentsList.addAll(attachments.get(SOUNDS_KEY));
		return attachmentsList;
	}
	
	/**
	 * Return the comment's ID of a post.
	 * @param index The index of the comment.
	 * @return The comment's ID.
	 */
	public String getCommentId(Integer index) {
		return comments.get(index);
	}
	
	/**
	 * Return the IDs of all post's comments.
	 * @return The IDs of all post's comments.
	 */
	public List<String> getCommentsId() {
		return comments;
	}
	
	@Override
	public Calendar getCreationDate() {
		return creationDate;
	}
	
	@Override
	public String getId() {
		return id;
	}

	/**
	 * Return the movie's ID.
	 * @param index The index of the movie.
	 * @return The movie's ID.
	 */
	public String getMovieId(Integer index) {
		return attachments.get(MOVIES_KEY).get(index);
	}
	
	/**
	 * Return the total number of comments.
	 * @return The total number of comments.
	 */
	public Integer getNumberOfComments() {
		return comments.size();
	}
	
	/**
	 * Return the total number of movies.
	 * @return The total number of movies.
	 */
	public Integer getNumberOfMovies() {
		return attachments.get(MOVIES_KEY).size();
	}
	
	/**
	 * Return the total number of pictures.
	 * @return The total number of pictures.
	 */
	public Integer getNumberOfPictures() {
		return attachments.get(PICTURES_KEY).size();
	}
	
	/**
	 * Return the total number of sounds.
	 * @return The total number of sounds.
	 */
	public Integer getNumberOfSounds() {
		return attachments.get(SOUNDS_KEY).size();
	}
	
	/**
	 * Return the parent's ID.
	 * @return The parent's ID.
	 */
	public String getParentId() {
		return parentId;
	}
	
	/**
	 * Return a picture's ID.
	 * @param index The index of the picture.
	 * @return The picture's ID.
	 */
	public String getPictureId(Integer index) {
		return attachments.get(PICTURES_KEY).get(index);
	}
	
	/**
	 * Return a sound's ID.
	 * @param index The index of the sound.
	 * @return A sound's ID.
	 */
	public String getSoundId(Integer index) {
		return attachments.get(SOUNDS_KEY).get(index);
	}
	
	/**
	 * Return post's title.
	 * @return Post's title.
	 */
	public StaticContent getTitle() {
		return title;
	}
	
	@Override
	public StaticContent getText() {
		return text;
	}

	/**
	 * Remove a comment of the post.
	 * @param commentId The ID of the comment that will be removed.
	 */
	public void removeComment(String commentId) {
		comments.remove(commentId);
	}

	/**
	 * Remove a interactive content from the post.
	 * @param icId The ID of the interactive content. 
	 */
	public void removeInteractiveContent(String icId) {
		if (attachments.get(MOVIES_KEY).contains(icId)) {
			attachments.get(MOVIES_KEY).remove(icId);
			
		} else if (attachments.get(PICTURES_KEY).contains(icId)) {
			attachments.get(PICTURES_KEY).remove(icId);
			
		} else if (attachments.get(SOUNDS_KEY).contains(icId)) {
			attachments.get(SOUNDS_KEY).remove(icId);
		}
	}
		
	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}
	
	/**
	 * Set post's title.
	 * @param title The post's title.
	 */
	public void setTitle(StaticContent title) {
		this.title = title;
	}
}