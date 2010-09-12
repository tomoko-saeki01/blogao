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
		this(login, password, email, name, "", null, Sex.Uninformed, "", "", "");
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
	public UserImpl(String login, String password, String email, String name, String interests, Calendar dateOfBirthday, Sex sex, String musics, String movies, String books) {
		this.login = login;
		this.password = password;
		this.email = email;
		this.name = name;
		this.interests = interests;
		this.dateOfBirthday = dateOfBirthday;
		this.sex = sex;
		this.musics = musics;
		this.movies = movies;
		this.books = books;
		
		blogs = new HashMap<String, Blog>();		
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#addBlog(br.edu.ufcg.blogao.blog.Blog, java.lang.String)
	 */
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
		
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getAddress()
	 */
	public String getAddress() {
		return address;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getBooks()
	 */
	public String getBooks() {
		return books;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getBlog(java.lang.String)
	 */
	public Blog getBlog(String id) {
		return blogs.get(id);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getBlogs()
	 */
	public Map<String, Blog> getBlogs() {
		return blogs;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getDateOfBirthday()
	 */
	public Calendar getDateOfBirthday() {
		return dateOfBirthday;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getEmail()
	 */
	public String getEmail() {
		return email;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getId()
	 */
	@Override
	public String getId() {
		return login;
	}	
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getInterests()
	 */
	public String getInterests() {
		return interests;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getMovies()
	 */
	public String getMovies() {
		return movies;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getMusics()
	 */
	public String getMusics() {
		return musics;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getName()
	 */
	public String getName() {
		return name;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getNumberOfBlogs()
	 */
	public int getNumberOfBlogs() {
		return blogs.size();
	}
		
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#getSex()
	 */
	public Sex getSex() {
		return sex;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setAddress(java.lang.String)
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setDateOfBirthday(java.util.Calendar)
	 */
	public void setDateOfBirthday(Calendar dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setEmail(java.lang.String)
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setInterests(java.lang.String)
	 */
	public void setInterests(String interests) {
		this.interests = interests;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setPassword(java.lang.String, java.lang.String)
	 */
	public void setPassword(String newPassword, String oldPassword) {
		if (oldPassword.equals(getPassword())) {
			this.password = newPassword;
		}
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ufcg.blogao.user.User#setSex(br.edu.ufcg.blogao.user.Sex)
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