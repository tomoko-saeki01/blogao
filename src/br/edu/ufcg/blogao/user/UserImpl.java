package br.edu.ufcg.blogao.user;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.blog.Blog;

/**
 * Represents a simple user's blog implementation.
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 0.4 - 12nd September, 2010.
 */
public class UserImpl implements User {
	
	//User "default" attributes.
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
	
	//
	private Map<String, Blog> blogs; //<blog id, blog>
			
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
		this(login, password, email, name, "", "", null, Sex.Uninformed, "", "", "");
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
	public UserImpl(String login, String password, String email, String name, String interests, String whoIAm, Calendar dateOfBirthday, Sex sex, String musics, String movies, String books) {
		this.login = login;
		this.password = password;
		this.email = email;
		this.name = name;
		this.interests = interests;
		this.whoIAm = whoIAm;
		this.dateOfBirthday = dateOfBirthday;
		this.sex = sex;
		this.musics = musics;
		this.movies = movies;
		this.books = books;
		
		blogs = new HashMap<String, Blog>();		
	}
	
	@Override
	public void addBlog(Blog blog, String id) {
		blogs.put(id, blog);
	}
	
	/**
	 * Add a user's favorite book.
	 * @param books The user's favorite book.
	 */
	public void addBook(String book) {
		this.books += book;
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
		
	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getBooks() {
		return books;
	}
	
	@Override
	public Blog getBlog(String id) {
		return blogs.get(id);
	}
	
	@Override
	public Map<String, Blog> getBlogs() {
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
	public void setAddress(String address) {
		this.address = address;
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
	public void setID(String login) {
		this.login = login;
	}
	
	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setPassword(String newPassword, String oldPassword) {
		if (oldPassword.equals(getPassword())) {
			this.password = newPassword;
		}
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