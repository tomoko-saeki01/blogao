package br.edu.ufcg.blogao.blog;

/**
 * Represents a blog.
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 7th September, 2010.
 */

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Blog implements WebElement {
	//Blog "default" attributes.
	private String title;
	
	//
	private String id;
	private Date date;
	private StaticContent description;
	private Map<String, Blog> subBlogs; //<id, blog>
	private Map<String, Post> posts; //<id, post>
	
	/**
	 * Default constructor.
	 * @param title The blog's title.
	 */
	public Blog(String title) {
		this(title, null);
	}
	
	/**
	 * Another constructor.
	 * @param title The blog's title.
	 * @param description The blog's description.
	 */
	public Blog(String title, StaticContent description) {
		this.title = title;
		this.description = description;
		
		//TODO Creation date.
	}
	
	/**
	 * Add a post to the blog.
	 * @param id The post's ID.
	 * @param post The post.
	 */
	public void addPost(String id, Post post) {
		posts.put(id, post);
	}
	
	/**
	 * Return blog's date creation.
	 */
	@Override
	public Date getCreationDate() {
		return date;
	}
	
	/**
	 * Return the blog's ID.
	 */
	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * Return the total number of posts.
	 * @return The total number of posts.
	 */
	public Integer getNumberOfPosts() {
		return posts.size();
	}
	
	/**
	 * Return the total number of subBlogs.
	 * @return The total number of subBlogs.
	 */
	public Integer getNumberOfSubBlogs() {
		return subBlogs.size();
	}
	
	/**
	 * Return the total number of all subBlogs.
	 * @return The total number of all subBlogs.
	 */
	public Integer getNumberOfAllSubBlogs() {
		int total = 0;
		Collection<Blog> sub = subBlogs.values();
		for (Blog b: sub) {
			total += b.getNumberOfSubBlogs();
		}		
		return total;
	}
	
	/**
	 * Return a blog's subBlog.
	 * @param index The subBlog's ID.
	 * @return A blog's subBlog.
	 */
	public Blog getSubBlog(int index) {
		return subBlogs.get(index);
	}
	
	/**
	 * Return the blog's description. 
	 */
	@Override
	public StaticContent getText() {
		return description;
	}
	
	/**
	 * Return the blog's title.
	 * @return The blog's title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the blog's description.
	 */
	@Override
	public void setText(StaticContent text) {
		this.description = text;
	}
	
	/**
	 * Return a blog's post.
	 * @param index The post's ID.
	 * @return A blog's post.
	 */
	public Post getPost(int index) {
		return posts.get(index);
	}

	/**
	 * Set the blog's title.
	 * @param title The blog's title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}