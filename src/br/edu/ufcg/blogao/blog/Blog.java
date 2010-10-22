package br.edu.ufcg.blogao.blog;

/**
 * Represents a blog.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.blog.data.StaticContent;
import br.edu.ufcg.blogao.user.Notifiable;

public class Blog implements WebElementIF {
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
	 * Default constructor.
	 * @param id The blog's ID.
	 * @param parentId The parent's ID.
	 * @param authorId The author's ID.
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
	 * @param usr The notifiable.
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
	 * @param subBlogId The subBlog's ID.
	 */
	public void addSubBlog(String subBlogId) {
		subBlogs.add(subBlogId);
	}
	
	/**
	 * Verify if blog contains the post.
	 * @param postId The ID of the post to be checked.
	 * @return True case the blog contains the postId, or False otherwise. 
	 */
	public boolean containsPost(String postId) {
		return posts.contains(postId);
	}
	
	/**
	 * Notifies all the notifiers.
	 */
	public void doNotifyAll(String announcementId) {
		for (Notifiable usr : notifiables) {
			usr.receiveAnnouncement(announcementId);
		}
	}
	
	/**
	 * Returns the list of notifier listening to changes on this blog.
	 * @return The notifiers list.
	 */
	public List<Notifiable> getNotifiables() {
		return notifiables;
	}
	
	/**
	 * Gets the blog's author ID.
	 * @return author id.
	 */
	public String getAuthorId() {
		return authorId;
	}
	
	@Override
	public Calendar getCreationDate() {
		return creationDate;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * Return the total number of posts of the blog.
	 * @return The total number of posts of the blog.
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
	 * Return the ID of a blog's post.
	 * @param index The index of the post.
	 * @return The post's ID.
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
	 * @return All subBlogs of the blog.
	 */
	public List<String> getSubBlogs() {
		return subBlogs;
	}
	
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
	 * @param postId The ID of the post to be removed.
	 */
	public void removePost(String postId) {
		posts.remove(postId);
	}
	
	/**
	 * Removes a blog's subBlog.
	 * @param subBlogId The ID of the subBlog to be removed.
	 */
	public void removeSubBlog(String subBlogId) {
		subBlogs.remove(subBlogId);
	}
	
	/**
	 * Sets the ID of the blog's author.
	 * @param authorId The ID of the blog's author.
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	@Override
	public void setText(StaticContent text) {
		this.description = text;
	}
	
	/**
	 * Set the blog's title.
	 * @param title The blog's title to the seted.
	 */
	public void setTitle(StaticContent title) {
		this.title = title;
	}	
}