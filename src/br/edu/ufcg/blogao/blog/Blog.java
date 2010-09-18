package br.edu.ufcg.blogao.blog;

/**
 * Represents a blog.
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 7th September, 2010.
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;

public class Blog implements WebElement {
	//Blog "default" attributes.
	private StaticContent title;
	private String id;
	private String authorId;
	private Calendar creationDate;
	private StaticContent description;
	private List<String> subBlogs; //<subBlogId>
	private List<String> posts; //<postId>
	
	/**
	 * Another constructor.
	 * @param title The blog's title.
	 * @param description The blog's description.
	 */
	public Blog(String id, String authorId, StaticContent title, StaticContent description) {
		this.id = id;
		this.setAuthorId(authorId);
		this.setTitle(title);
		this.setText(description);
		this.creationDate = Calendar.getInstance();
		this.subBlogs = new ArrayList<String>();
		this.posts = new ArrayList<String>();
	}
	
	/**
	 * Add a post to the blog.
	 * @param postId The post's ID.
	 */
	public void addPost(String postId) {
		posts.add(postId);
	}
	
	/**
	 * Verify if blog contains the post.
	 * @param postId Id searched.
	 * @return true if the blog contains this postId. 
	 */
	public boolean containsPost(String postId) {
		return posts.contains(postId);
	}
	
	/**
	 * Gets the blog's author id.
	 * @return author id.
	 */
	public String getAuthorId() {
		return authorId;
	}
	
	/**
	 * Return blog's creation date.
	 */
	@Override
	public Calendar getCreationDate() {
		return creationDate;
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
	 * Return the total number of all subBlogs.
	 * @return The total number of all subBlogs.
	 */
	public Integer getNumberOfAllSubBlogs() {
		int total = 0;
		for (String blogId : subBlogs) {
			try {
				total += (1 + DatabaseFacade.getInstance().retrieveBlog(blogId).getNumberOfAllSubBlogs());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return total;
	}
	
	/**
	 * Return the total number of subBlogs.
	 * @return The total number of subBlogs.
	 */
	public Integer getNumberOfSubBlogs() {
		return subBlogs.size();
	}
	
	/**
	 * Return a blog's subBlog.
	 * @param index The subBlog's ID.
	 * @return A blog's subBlog.
	 * @throws Exception If blogId is null or "" or doesn't exist a blog with passed blogId.
	 */
	public Blog getSubBlog(int index) throws Exception {
		return DatabaseFacade.getInstance().retrieveBlog(subBlogs.get(index));
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
	public StaticContent getTitle() {
		return title;
	}
	
	/**
	 * Sets the blog's author id.
	 * @param authorId Id of blog's author.
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
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
	 * @throws Exception 
	 */
	public String getPost(int index) throws Exception {
		return posts.get(index);
	}
	
	public List<String> getPostsId() {
		return posts;
	}

	/**
	 * Set the blog's title.
	 * @param title The blog's title.
	 */
	public void setTitle(StaticContent title) {
		this.title = title;
	}
	
	public void removePost(String postId) {
		posts.remove(postId);
	}

}