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

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Comment implements WebElement {
	
	private String id;
	private String author;
	private StaticContent text;
	private Calendar date;
	private List<Comment> subComments;

	@Override
	public Calendar getCreationDate() {
		// TODO Auto-generated method stub
		return null;
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
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String addSubComment(String text) {
		// TODO
		return null;
	}
	
	public Comment getSubComment(int index) {
		// TODO
		return null;
	}
	
	public Integer getNumberOfSubComments() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfAllSubComments() {
		// TODO
		return null;
	}

}
