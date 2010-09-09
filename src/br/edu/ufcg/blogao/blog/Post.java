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
import java.util.List;

import br.edu.ufcg.blogao.blog.data.*;

public class Post implements WebElement {
	
	private String id;
	private String title;
	private StaticContent text;
	private Calendar Calendar;
	private List<InteractiveContent> content;
	private List<Comment> comments;

	@Override
	public Calendar getCreationDate() {
		return Calendar;
	}

	@Override
	public StaticContent getText() {
		return text;
	}

	@Override
	public void setText(StaticContent text) {
		this.text = text;
	}

	@Override
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String addComment(String text) {
		// TODO
		return null;
	}
	
	public Comment getComment(int index) {
		// TODO
		return null;
	}
	
	public Integer getNumberOfComments() {
		// TODO
		return null;
	}
	
	public String attachSound(String description, String data) {
		// TODO
		return null;
	}
	
	public String attachMovie(String description, String data) {
		// TODO
		return null;
	}
	
	public String attachPicture(String description, String data) {
		// TODO
		return null;
	}
	
	public Sound getSound(int index) {
		// TODO
		return null;
	}
	
	public Movie getMovie(int index) {
		// TODO
		return null;
	}
	
	public Picture getPicture(int index) {
		// TODO
		return null;
	}
	
	public Integer getNumberOfSounds() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfMovies() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfPictures() {
		// TODO
		return null;
	}
	
	
}
