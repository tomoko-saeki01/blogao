package br.edu.ufcg.dsc.si1.blog;

import java.util.Date;
import java.util.List;

public class Comment implements WebElement {
	
	private String author;
	private String text;
	private Date date;
	private List<Comment> subComments;

	@Override
	public Date getCreationDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

}
