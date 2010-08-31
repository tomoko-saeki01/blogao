package br.edu.ufcg.dsc.si1.blog;

// eh nois q voa!!

import java.util.Date;
import java.util.List;

public class Blog implements WebElement {
	
	private String title;
	private String description;
	private List<Blog> subBlogs;
	private List<Post> posts;
	
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
