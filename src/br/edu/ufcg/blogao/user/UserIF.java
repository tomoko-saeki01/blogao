package br.edu.ufcg.blogao.user;

/**
 *  Represents the user of Blogao.
 *  
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.Identifiable;

public interface UserIF extends Identifiable, Notifiable {

	/**
	 * Add a new blog's reference to user.
	 * @param blogId The blog's ID.
	 */
	public void addBlog(String blogId);
	
	/**
	 * Return the user's address.
	 * @return The user's address.
	 */
	public String getAddress();

	/**
	 * Return the user's favorites books.
	 * @return The user's favorites books.
	 */
	public String getBooks();
	
	/**
	 * Gets the blogId at given index.
	 * @param index Index of wanted blogId.
	 * @return The blog's ID.
	 */
	public String getBlogIdAtIndex(int index);

	/**
	 * Return all user's blogs.
	 * @return All user's blogs.
	 */
	public List<String> getBlogs();

	/**
	 * Return the user's anniversary date.
	 * @return The user's anniversary date.
	 */
	public Calendar getDateOfBirthday();

	/**
	 * Return the user's e-mail.
	 * @return The user's e-mail.
	 */
	public String getEmail();

	/**
	 * Return the user's identification.
	 */
	public String getId();

	/**
	 * Return the user's interests.
	 * @return The user's interests.
	 */
	public String getInterests();

	/**
	 * Return the user's favorites movies.
	 * @return The user's favorites movies.
	 */
	public String getMovies();

	/**
	 * Return the user's favorites musics.
	 * @return The user's favorites musics.
	 */
	public String getMusics();

	/**
	 * Return the user's name.
	 * @return The user's name.
	 */
	public String getName();

	/**
	 * Return the user's number of blogs.
	 * @return The user's number of blogs.
	 */
	public int getNumberOfBlogs();
	
	/**
	 * Return the user's password.
	 * @return The user's password.
	 */
	public String getPassword();

	/**
	 * Return the user's sex.	
	 * @return The user's sex.
	 */
	public Sex getSex();
	
	/**
	 * Return the user's self description (Who I am).
	 * @return The user's self description.
	 */
	public String getWhoIAm();

	/**
	 * Remove a user's blog.
	 * @param blogId The blog's ID.
	 */
	public void removeBlog(String blogId);	
	
	/**
	 * Remove a blog.
	 * @param index The index of blog to be removed.
	 */
	public void removeBlogIdAtIndex(int index);

	/**
	 * Set the user's address.
	 * @param address The user's address.
	 */
	public void setAddress(String address);
	
	/**
	 * Set the user's favorite books.
	 * @param books The user's books.
	 */
	public void setBooks(String books);

	/**
	 * Set the user's anniversary date.
	 * @param dateOfBirthday The user's anniversary date.
	 */
	public void setDateOfBirthday(Calendar dateOfBirthday);

	/**
	 * Set the user's e-mail.
	 * @param email The user's e-mail.
	 */
	public void setEmail(String email);
	
	//TODO checar.
	/**
	 * Sets the user id (login).
	 * @param id User unique identification.
	 */
	public void setId(String id);

	/**
	 * Set the user's interests.
	 * @param interests The user's interests.
	 */
	public void setInterests(String interests);
	
	/**
	 * Set the user's musics.
	 * @param musics The user's favorites musics.
	 */
	public void setMusics(String musics);
	
	/**
	 * Set the user's favorite movies;
	 * @param movies The user's favorites movies;
	 */
	public void setMovies(String movies);

	/**
	 * Set the user's name.
	 * @param name The user's name.
	 */
	public void setName(String name);

	/**
	 * Set the user's password.
	 * @param newPassword User's new password.
	 * @param oldPassword User's old password.
	 */
	public void setPassword(String password);

	/**
	 * Set the user's sex.
	 * @param sex The user's sex.
	 */
	public void setSex(Sex sex);
	
	/**
	 * Set the user's description of himself.
	 * @param whoIAm The user's self description.
	 */
	public void setWhoIAm(String whoIAm);
}