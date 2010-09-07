package br.edu.ufcg.blogao.user;

/**
 * Represents a user's blog.
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 3.0 - 31th August, 2010.
 */

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.Blog;

public class User implements Identifiable {
	
	//User "default" attributes.
	private String id;
	private String login;
	private String password;
	private String name;
	private String address;
	private String email;
	private String interests;
	private Calendar dateOfBirthday;
	private Sex sex;
	private String musics;
	private String movies;
	private String books;
	
	//
	private Map<String, Blog> blogs; //<blog id, blog>
			
	/**
	 * Default constructor.
	 * @param login User's login.
	 * @param password User's password
	 * @param email User's e-mail
	 */
	public User(String login, String password, String email) {
		this.login = login;
		this.password = password;
		this.email = email;
		
		blogs = new HashMap<String, Blog>();
	} 
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @param email
	 * @param name
	 */
	public User(String login, String password, String email, String name) {
		//TODO
	}
	
	/**
	 * 
	 * @param login
	 * @param password
	 * @param email
	 * @param name
	 * @param interests
	 * @param dateBirthday
	 * @param sex
	 * @param music
	 * @param movies
	 * @param books
	 */
	public User(String login, String password, String email, String name, String interests, Calendar dateBirthday, Sex sex, String music, String movies, String books) {
		//TODO
	}
	
	/**
	 * Add a user's favorite book.
	 * @param books The user's favorite book.
	 */
	public void addBook(String book) {
		this.books += book;
	}
	
	/**
	 * Add a user's blog.
	 * @param blog The user's blog.
	 * @param id The blog's ID.
	 */
	public void addBlog(Blog blog, String id) {
		blogs.put(id, blog);
	}
	 	
	/**
	 * Add a user's favorite movie.
	 * @param movies User's favorite movie.
	 */
	public void addMovie(String movie) {
		this.movies += movie;
	}
	
	/**
	 * Add a user's favorite music.
	 * @param musics User's favorite music.
	 */
	public void addMusic(String music) {
		this.musics += music;
	}
		
	/**
	 * Return user's address.
	 * @return The user's address.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Return the user's favorites books.
	 * @return The user's favorites books.
	 */
	public String getBooks() {
		return books;
	}
	
	/**
	 * Return all user's blogs.
	 * @return All user's blogs.
	 */
	public Map<String, Blog> getBlogs() {
		return blogs;
	}
	
	/**
	 * Return the user's anniversary date.
	 * @return The user's anniversary date.
	 */
	public Calendar getDateOfBirthday() {
		return dateOfBirthday;
	}

	/**
	 * Return the user's e-mail.
	 * @return The user's e-mail.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Return the user's identification.
	 */
	@Override
	public String getId() {
		return id;
	}	
	
	/**
	 * Return the user's interests.
	 * @return The user's interests.
	 */
	public String getInterests() {
		return interests;
	}
	
	/**
	 * Return the user's login.
	 * @return The user's login.
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * Return the user's favorites movies.
	 * @return The user's favorites movies.
	 */
	public String getMovies() {
		return movies;
	}
	
	/**
	 * Return the user's favorites musics.
	 * @return The user's favorites musics.
	 */
	public String getMusics() {
		return musics;
	}

	/**
	 * Return the user's name.
	 * @return The user's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the user's number of blogs.
	 * @return The user's number of blogs.
	 */
	public int getNumberOfBlogs() {
		return blogs.size();
	}
		
	/**
	 * Return the user's sex.	
	 * @return The user's sex.
	 */
	public Sex getSex() {
		return sex;
	}
	
	/**
	 * Set the user's address.
	 * @param address User's address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Set the user's anniversary date.
	 * @param dateOfBirthday The user's anniversary date.
	 */
	public void setDateOfBirthday(Calendar dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	
	/**
	 * Set the user's e-mail.
	 * @param email The user's e-mail.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Set the user's interests.
	 * @param interests The user's interests.
	 */
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	/**
	 * Set the user's name.
	 * @param name The user's name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set the user's password.
	 * @param newPassword User's new password.
	 * @param oldPassword User's old password.
	 */
	public void setPassword(String newPassword, String oldPassword) {
		if (oldPassword.equals(getPassword())) {
			this.password = newPassword;
		}
	}
	
	/**
	 * Set the user's sex.
	 * @param sex The user's sex.
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}	

	/**
	 * Return the user's password.
	 * @return The user's password.
	 */
	private String getPassword() {
		return password;
	}
}