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

import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.blog.data.StaticContent;

public class Blog implements WebElement {
	//Blog "default" attributes.
	private String title;
	private String id;
	private String authorId;
	private Calendar creationDate;
	private StaticContent description;
	private Map<String, Blog> subBlogs; //<subBlogId, blog>
	private Map<String, Post> posts; //<postId, post>
	
	/**
	 * Another constructor.
	 * @param title The blog's title.
	 * @param description The blog's description.
	 */
	public Blog(String id, String authorId, String title, StaticContent description) {
		this.id = id;
		this.setAuthorId(authorId);
		this.setTitle(title);
		this.setText(description);
		this.creationDate = Calendar.getInstance();
		this.subBlogs = new HashMap<String, Blog>();
		this.posts = new HashMap<String, Post>();
	}
	
	/**
	 * Add a post to the blog.
	 * @param id The post's ID.
	 * @param post The post.
	 */
	public void addPost(Post post) {
		posts.put(post.getId(), post);
	}
	
	/**
	 * Verify if blog contains the post.
	 * @param postId Id of the searched post.
	 * @return true if the blog contains this postId. 
	 */
	public boolean containsPost(String postId) {
		return posts.containsKey(postId);
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
		Collection<Blog> sub = subBlogs.values();
		for (Blog b: sub) {
			total += b.getNumberOfSubBlogs();
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
	 */
	public Post getPost(int index) {
		return posts.get(index);
	}
	
	/**
	 * Return a blog's post by postId.
	 * @param postId Id of wanted post.
	 * @return the Post.
	 */
	public Post getPost(String postId) {
		return posts.get(postId);
	}

	/**
	 * Set the blog's title.
	 * @param title The blog's title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}