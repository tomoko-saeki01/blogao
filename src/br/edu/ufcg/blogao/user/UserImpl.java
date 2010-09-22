package br.edu.ufcg.blogao.user;

/**
 *  Represents a user's blog implementation.
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

public class UserImpl implements UserIF {
	private String login;
	private String password;
	private String name;
	private String address;
	private String email;
	private String interests;
	private String whoIAm;
	private Calendar dateOfBirthday;
	private Sex sex;
	private String musics;
	private String movies;
	private String books;
	private List<String> blogs;
	private List<String> announcementsListening;
	
	/**
	 * Default constructor.
	 * @param login User's login.
	 * @param password User's password
	 * @param email User's e-mail
	 */
	public UserImpl(String login, String password, String email) {
		this(login, password, email, "");
	} 
	
	/**
	 * Another constructor.
	 * @param login User's login.
	 * @param password User's Password
	 * @param email User's e-mail.
	 * @param name User's name.
	 */
	public UserImpl(String login, String password, String email, String name) {
		this(login, password, name, email, Sex.Uninformed, null, "", "", "", "", "", "");
	}
	
	/**
	 * Another constructor.
	 * @param login User's login.
	 * @param password User's Password
	 * @param email User's e-mail.
	 * @param name User's name.
	 * @param interests User's interests.
	 * @param dateOfBirthday User's anniversary date.
	 * @param sex User's sex.
	 * @param music User's music.
	 * @param movies User's movies.
	 * @param books User's books.
	 */
	public UserImpl(String login, String password, String name, String email, 
			Sex sex, Calendar dateOfBirthday, String address, String interests, 
			String whoIAm, String movies, String musics, String books) {
		this.setId(login);
		this.setPassword(password);
		this.setName(name);
		this.setEmail(email);
		this.setSex(sex);
		this.setDateOfBirthday(dateOfBirthday);
		this.setAddress(address);
		this.setInterests(interests);
		this.setWhoIAm(whoIAm);		
		this.setMovies(movies);
		this.setMusics(musics);
		this.setBooks(books);
		
		blogs = new ArrayList<String>();
		announcementsListening = new ArrayList<String>();
	}
	
	@Override
	public void addBlog(String blogId) {
		blogs.add(blogId);
	}
	
	@Override
	public String getAddress() {
		return address;
	}
	
	@Override
	public List<String> getAnnouncements() {
		return announcementsListening;
	}	

	@Override
	public String getBooks() {
		return books;
	}
	
	@Override
	public String getBlogIdAtIndex(int index) {
		return blogs.get(index);
	}

	@Override
	public List<String> getBlogs() {
		return blogs;
	}
	
	@Override
	public Calendar getDateOfBirthday() {
		return dateOfBirthday;
	}

	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public String getId() {
		return login;
	}	
	
	@Override
	public String getInterests() {
		return interests;
	}
	
	@Override
	public String getMovies() {
		return movies;
	}
	
	@Override
	public String getMusics() {
		return musics;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getNumberOfBlogs() {
		return blogs.size();
	}
	
	@Override
	public String getPassword() {
		return password;
	}
		
	@Override
	public Sex getSex() {
		return sex;
	}
	
	@Override
	public String getWhoIAm() {
		return whoIAm;
	}
	
	@Override
	public void receiveAnnouncement(String Id) {
		announcementsListening.add(Id);
	}
	
	@Override
	public void removeBlogIdAtIndex(int index) {
		blogs.remove(index);
	}

	@Override
	public void removeBlog(String blogId) {
		blogs.remove(blogId);
	}
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public void setBooks(String books) {
		this.books = books;
	}
	
	@Override
	public void setDateOfBirthday(Calendar dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void setId(String id) {
		this.login = id;
	}
	
	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	@Override
	public void setMovies(String movies) {
		this.movies = movies;
	}

	@Override
	public void setMusics(String musics) {
		this.musics = musics;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public void setWhoIAm(String whoIAm) {
		this.whoIAm = whoIAm;
	}
}