package br.edu.ufcg.blogao.user;

import java.util.Calendar;
import java.util.Map;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.Blog;

public interface User extends Identifiable {

	/**
	 * Add a user's blog.
	 * @param blog The user's blog.
	 * @param id The blog's ID.
	 */
	public void addBlog(Blog blog, String id);

	/**
	 * Return user's address.
	 * @return The user's address.
	 */
	public String getAddress();

	/**
	 * Return the user's favorites books.
	 * @return The user's favorites books.
	 */
	public String getBooks();

	/**
	 * Return a user's blog from blog's ID.
	 * @param id Blog's ID.
	 * @return A user's blog from blog's ID.
	 */
	public Blog getBlog(String id);

	/**
	 * Return all user's blogs.
	 * @return All user's blogs.
	 */
	public Map<String, Blog> getBlogs();

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
	 * Set the user's address.
	 * @param address User's address.
	 */
	public void setAddress(String address);

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

	/**
	 * Set the user's interests.
	 * @param interests The user's interests.
	 */
	public void setInterests(String interests);

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
	public void setPassword(String newPassword, String oldPassword);

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