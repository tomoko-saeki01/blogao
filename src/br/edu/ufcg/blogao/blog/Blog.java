package br.edu.ufcg.blogao.blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.user.Notifiable;

/**
 * Represents a blog.
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 7th September, 2010.
 */
public class Blog implements WebElement {
	//Blog "default" attributes.
	private StaticContent title;
	private String id;
	private String parentId;
	private String authorId;
	private Calendar creationDate;
	private StaticContent description;
	private List<String> subBlogs; //<subBlogId>
	private List<String> posts; //<postId>
	private List<Notifiable> notifiables;
	
	/**
	 * Another constructor.
	 * @param title The blog's title.
	 * @param description The blog's description.
	 */
	public Blog(String id, String parentId, String authorId, StaticContent title, StaticContent description) {
		this.id = id;
		this.parentId = parentId;
		this.setAuthorId(authorId);
		this.setTitle(title);
		this.setText(description);
		this.creationDate = Calendar.getInstance();
		this.subBlogs = new ArrayList<String>();
		this.posts = new ArrayList<String>();
		this.notifiables = new ArrayList<Notifiable>();
	}
	
	/**
	 * Adds a notifiable to this blog so that it will listen to
	 * changes made on this object.
	 * @param usr The notifiable
	 */
	public void addNotifiable(Notifiable usr) {
		this.notifiables.add(usr);
	}
	
	/**
	 * Add a post to the blog.
	 * @param postId The post's ID.
	 */
	public void addPost(String postId) {
		posts.add(postId);
	}
	
	/**
	 * Add a subBlog to the blog.
	 * @param subBlogId Id of subBlog added.
	 */
	public void addSubBlog(String subBlogId) {
		subBlogs.add(subBlogId);
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
	 * Notifies all notifiables
	 */
	public void doNotifyAll(String announcementId) {
		for (Notifiable usr : notifiables) {
			usr.doNotify(announcementId);
		}
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
	 * Return the parent's ID.
	 * @return The parent's ID.
	 */
	public String getParentId() {
		return parentId;
	}
	
	/**
	 * Return a blog's post ID.
	 * @param index The post's ID.
	 * @return A blog's post ID.
	 */
	public String getPost(int index) {
		return posts.get(index);
	}
	
	/**
	 * Return the list of all post's ID.
	 * @return All post's ID.
	 */
	public List<String> getPostsId() {
		return posts;
	}
	
	/**
	 * Return the total number of subBlogs.
	 * @return The total number of subBlogs.
	 */
	public Integer getNumberOfSubBlogs() {
		return subBlogs.size();
	}
	
	/**
	 * Returns the list of subBlogs
	 * @return all subBlogs of this blog.
	 */
	public List<String> getSubBlogs() {
		return subBlogs;
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
	 * Remove a blog's post.
	 * @param postId The post's ID.
	 */
	public void removePost(String postId) {
		posts.remove(postId);
	}
	
	/**
	 * Removes a subBlog.
	 * @param subBlogId Id of subBlog to be removed.
	 */
	public void removeSubBlog(String subBlogId) {
		subBlogs.remove(subBlogId);
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
	 * Set the blog's title.
	 * @param title The blog's title.
	 */
	public void setTitle(StaticContent title) {
		this.title = title;
	}
	
}