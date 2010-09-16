package br.edu.ufcg.blogao.blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.blog.data.*;

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
	private String title;
	private StaticContent text;
	private Calendar creationDate;
	private Map<String, List<InteractiveContent>> attachments;
	private Map<String, Comment> comments; //<id, comment>

	/**
	 * Default constructor.
	 * @param id the post's id
	 * @param title The post's title.
	 * @param text The post's text.
	 */
	public Post(String id, String title, StaticContent text) {
		this.id = id;
		this.setTitle(title);
		this.setText(text);
		creationDate = Calendar.getInstance();
		attachments = new HashMap<String, List<InteractiveContent>>();
		attachments.put(MOVIES_KEY, new ArrayList<InteractiveContent>());
		attachments.put(PICTURES_KEY, new ArrayList<InteractiveContent>());
		attachments.put(SOUNDS_KEY, new ArrayList<InteractiveContent>());
		comments = new HashMap<String, Comment>();
	}
	
	/**
	 * Add a comment to the post.
	 * @param comment Post's comment.
	 * @param id Comment's ID.
	 */
	public void addComment(Comment comment) {
		comments.put(comment.getId(), comment);
	}
	
	public String attachMovie(String description, String data) {
		StaticContent movieDescription = new Text(description);
		String movieId = IdGenerator.getInstance().getNextId();
		InteractiveContent movie = new Movie(movieId, movieDescription, data);
		attachments.get(MOVIES_KEY).add(movie);
		return movie.getId();
	}
	
	public String attachPicture(String description, String data) {
		StaticContent pictureDescription = new Text(description);
		String pictureId = IdGenerator.getInstance().getNextId();
		InteractiveContent picture = new Picture(pictureId, pictureDescription, data);
		attachments.get(PICTURES_KEY).add(picture);
		return picture.getId();
	}
	
	public String attachSound(String description, String data) {
		StaticContent soundDescription = new Text(description);
		String soundId = IdGenerator.getInstance().getNextId();
		InteractiveContent sound = new Sound(soundId, soundDescription, data);
		attachments.get(SOUNDS_KEY).add(sound);
		return sound.getId();
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
		return creationDate;
	}
	
	@Override
	public String getId() {
		return id;
	}

	public Movie getMovie(int index) {
		return (Movie) attachments.get(MOVIES_KEY).get(index);
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
	public String getTitle() {
		return title;
	}
	
	public Picture getPicture(int index) {
		return (Picture) attachments.get(PICTURES_KEY).get(index);
	}
	
	public Sound getSound(int index) {
		return (Sound) attachments.get(SOUNDS_KEY).get(index);
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