package br.edu.ufcg.blogao.blog;

import java.util.Date;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Blog implements WebElement {
	
	private String id;
	private String title;
	private Date date;
	private StaticContent description;
	private List<Blog> subBlogs;
	private List<Post> posts;
	
	@Override
	public Date getCreationDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public StaticContent getText() {
		return description;
	}

	@Override
	public void setText(StaticContent text) {
		this.description = text;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String createPost(String title, String text) {
		// TODO
		return null;
	}
	
	public Post getPost(int index) {
		// TODO
		return null;
	}
	
	public Integer getNumberOfPosts() {
		// TODO
		return null;
	}
	
	public Blog getSubBlog(int index) {
		// TODO
		return null;
	}
	
	public Integer getNumberOfSubBlogs() {
		// TODO
		return null;
	}
	
	public Integer getNumberOfAllSubBlogs() {
		// TODO
		return null;
	}

}
