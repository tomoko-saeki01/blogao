package br.edu.ufcg.blogao.blog;

import java.util.Date;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.*;

public class Post implements WebElement {
	
	private String title;
	private String text;
	private Date date;
	private List<Audio> audios;
	private List<Video> videos;
	private List<Image> images;
	private List<Comment> comments;

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
