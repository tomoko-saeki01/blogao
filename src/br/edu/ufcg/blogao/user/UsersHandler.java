package br.edu.ufcg.blogao.user;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ufcg.blogao.Encryptor;
import br.edu.ufcg.blogao.blog.WebElementManager;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;

public class UsersHandler {
	
	private static UsersHandler selfInstance = null;
	
	private final String INVALID_LOGIN_MESSAGE ="Login inv‡lido";
	private final String INVALID_PASSWORD_MESSAGE = "Senha inv‡lida";
	private final String  INVALID_EMAIL_MESSAGE = "Email inv‡lido";
	private final String INVALID_SEX_MESSAGE = "Sexo inv‡lido";
	private final String INVALID_DATE_MESSAGE = "Data inv‡lida";
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo Inv‡lido";
	
	private final String EXISTENT_LOGIN_MESSAGE = "Login existente";
	private final String EXISTENT_EMAIL_MESSAGE = "Email existente";
	private final String UNEXISTENT_USER_MESSAGE = "Usu‡rio inexistente";
	
	private final Map<String, Sex> ACCEPTABLE_SEXES = getAcceptableSexes();
	private final String ACCEPTABLE_DATE_REGEX = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
	private final String DATE_FORMAT = "%02d/%02d/%04d";
	
	private final String PASSWORD = "senha";
	private final String LOGIN = "login";
	private final String NAME = "nome_exibicao";
	private final String EMAIL = "email";
	private final String SEX = "sexo";
	private final String DATE_BIRTHDAY = "dataNasc";
	private final String ADDRESS = "endereco";
	private final String INTERESTS = "interesses";
	private final String WHO_I_AM = "quem_sou_eu";
	private final String MOVIES = "filmes";
	private final String MUSICS = "musicas";
	private final String BOOKS = "livros";
	
	private UsersHandler(){
	}
	
	public synchronized static UsersHandler getInstance() {
		if (selfInstance == null) {
			selfInstance = new UsersHandler();
		}
		return selfInstance;
	}
	
	public void addBlogToUser(String blogId, String login) throws Exception {
		UserIF user = getUser(login);
		user.addBlog(blogId);
		DatabaseFacade.getInstance().updateUser(user);
	}
	
public void removeBlogFromUser(String blogId, String login) throws Exception {
		UserIF user = getUser(login);
		user.removeBlog(blogId);
		DatabaseFacade.getInstance().updateUser(user);
	}
	
	private UserIF getUser(String login) throws Exception {
		if (isInvalidString(login) || !existsUserWithLogin(login)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		return DatabaseFacade.getInstance().retrieveUser(login);
	}
	
	public Integer getNumberOfBlogsFromUser(String userId) throws Exception {
		UserIF user = getUser(userId);
		return user.getNumberOfBlogs();
	}
	
	public String getBlogFromUser(String login, Integer index) throws Exception {
		return getUser(login).getBlogIdAtIndex(index);
	}

	public void changeUserInformation(String login, String attribute, String value) throws Exception {
		// Required parameters
		UserIF user = getUser(login);
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		
		if (isInvalidString(value)) {
			// Required not null parameters
			if (attribute.equals(PASSWORD)) {
				throw new IllegalArgumentException(INVALID_PASSWORD_MESSAGE);
			}
			if (attribute.equals(EMAIL)) {
				throw new IllegalArgumentException(INVALID_EMAIL_MESSAGE);
			}
			if (attribute.equals(LOGIN)) {
				throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
			}
			value = "";
		} else {
			// Validate some parameters
			if (attribute.equals(EMAIL) && existsUserWithEmail(value)) {
				throw new IllegalArgumentException(EXISTENT_EMAIL_MESSAGE);
			}
			if (attribute.equals(LOGIN) && existsUserWithLogin(value)) {
				throw new IllegalArgumentException(EXISTENT_LOGIN_MESSAGE);
			}
			if (attribute.equals(DATE_BIRTHDAY) && isInvalidDate(value)) {
				throw new IllegalArgumentException(INVALID_DATE_MESSAGE);
			}
		}
		if (attribute.equals(SEX) && isInvalidSex(value)) {
			throw new IllegalArgumentException(INVALID_SEX_MESSAGE);
		}
		
		if (attribute.equals(LOGIN)) {
			user.setId(value);
		} else if (attribute.equals(PASSWORD)) {
			user.setPassword(value);
		} else if (attribute.equals(NAME)) {
			user.setName(value);
		} else if (attribute.equals(EMAIL)) {
			user.setEmail(value);
		} else if (attribute.equals(SEX)) {
			user.setSex(convertStringSexToSex(value));
		} else if (attribute.equals(DATE_BIRTHDAY)) {
			user.setDateOfBirthday(convertStringDateToCalendar(value));
		} else if (attribute.equals(ADDRESS)) {
			user.setAddress(value);
		} else if (attribute.equals(INTERESTS)) {
			user.setInterests(value);
		} else if (attribute.equals(WHO_I_AM)) {
			user.setWhoIAm(value);
		} else if (attribute.equals(MOVIES)) {
			user.setMovies(value);
		} else if (attribute.equals(MUSICS)) {
			user.setMusics(value);
		} else if(attribute.equals(BOOKS)) {
			user.setBooks(value);
		} else {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		DatabaseFacade.getInstance().updateUser(user);
	}
	
	public synchronized void createUser(String login, String password, String name,
			String email, String sex, String dateOfBirthday, String address,
			String interests, String whoIAm, String movies,
			String musics, String books) throws Exception {
		
		// Check the required parameters
		if (isInvalidString(login)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		
		if (isInvalidString(password)) {
			throw new IllegalArgumentException(INVALID_PASSWORD_MESSAGE);
		}
		
		if (isInvalidString(email)) {
			throw new IllegalArgumentException(INVALID_EMAIL_MESSAGE);
		}
		
		if (isInvalidString(sex) || isInvalidSex(sex)) {
			throw new IllegalArgumentException(INVALID_SEX_MESSAGE);
		}
		
		Calendar userBirthday = null;
		if ((!isInvalidString(dateOfBirthday))) {
			if (isInvalidDate(dateOfBirthday)) {
				throw new IllegalArgumentException(INVALID_DATE_MESSAGE);
			}
			userBirthday = convertStringDateToCalendar(dateOfBirthday);
		}
		
		// Check existent Login and Email
		if (existsUserWithLogin(login)) {
			throw new IllegalArgumentException(EXISTENT_LOGIN_MESSAGE);
		}
		
		if (existsUserWithEmail(email)) {
			throw new IllegalArgumentException(EXISTENT_EMAIL_MESSAGE);
		}
		
		// Override null parameters with ""
		name = (name == null? "" : name);
		address = (address == null? "" : address);
		interests = (interests == null? "" : interests);
		whoIAm = (whoIAm == null? "" : whoIAm);
		movies = (movies == null? "" : movies);
		musics = (musics == null? "" : musics);
		books = (books == null? "" : books);
		
		Sex userSex = convertStringSexToSex(sex);
		String userPassword = Encryptor.encrypt(password);
		UserIF newUser = new UserImpl(login, userPassword, name, email, userSex, userBirthday, address, interests, whoIAm, movies, musics, books);
		DatabaseFacade.getInstance().insertUser(newUser);
	}
	
	public List<String> getAllBlogsFromUser(String userId) throws Exception {
		return getUser(userId).getBlogs();
	}
	
	public String getUserInformation(String login, String attribute) throws Exception {
		if (isInvalidString(login)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		if (!existsUserWithLogin(login)) {
			throw new IllegalStateException(UNEXISTENT_USER_MESSAGE);
		}
		
		UserIF user = getUser(login);
		
		if (attribute.equals(LOGIN)) {
			return user.getId();
		} else if (attribute.equals(NAME)) {
			String name = user.getName();
			return name == null || name.equals("")? user.getId() : name;
		} else if (attribute.equals(EMAIL)) {
			return user.getEmail();
		} else if (attribute.equals(SEX)) {
			return convertSexToStringSex(user.getSex());
		} else if (attribute.equals(DATE_BIRTHDAY)) {
			return convertCalendarToStringDate(user.getDateOfBirthday());
		} else if (attribute.equals(ADDRESS)) {
			return user.getAddress();
		} else if (attribute.equals(INTERESTS)) {
			return user.getInterests();
		} else if (attribute.equals(WHO_I_AM)) {
			return user.getWhoIAm();
		} else if (attribute.equals(MOVIES)) {
			return user.getMovies();
		} else if (attribute.equals(MUSICS)) {
			return user.getMusics();
		} else if(attribute.equals(BOOKS)) {
			return user.getBooks();
		}
		throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
	}
	
	public boolean existsUserWithLogin(String login) {
		return DatabaseFacade.getInstance().existsUserInDatabase(login);
	}
	
	public boolean isPasswordFromUser(String login, String password) throws Exception {
		UserIF user = getUser(login);
		if (isInvalidString(password)) {
			throw new IllegalArgumentException(INVALID_PASSWORD_MESSAGE);
		}
		String passedPassword = Encryptor.encrypt(password);
		String userPassword = user.getPassword();
		return userPassword.equals(passedPassword);
	}
	
	public boolean isBlogFromUser(String login, String blogId) throws Exception {
		UserIF user = getUser(login);
		if (isInvalidString(blogId)) {
			throw new IllegalArgumentException(INVALID_PASSWORD_MESSAGE);
		}
		return user.getBlogs().contains(blogId);
	}
	
	public String convertCalendarToStringDate(Calendar cal) {
		int dayOfMonth = cal.get(GregorianCalendar.DAY_OF_MONTH);
		// In GregorianCalendar the month is from 0 (January) to 11 (December)
		int month = cal.get(GregorianCalendar.MONTH) + 1;
		int year = cal.get(GregorianCalendar.YEAR);
		
		return String.format(DATE_FORMAT, dayOfMonth, month, year);
	}
	
	/**
	 * This method assumes this date format 'DD/MM/YYYY'.
	 * @param stringDate String representation of user's birthday.
	 * @return Correspondent Calendar to stringDate.
	 */
	private Calendar convertStringDateToCalendar(String stringDate) {
		int year = Integer.parseInt(stringDate.substring(6, 10));
		// In GregorianCalendar the month is from 0 (January) to 11 (December) 
		int month = Integer.parseInt(stringDate.substring(3, 5)) - 1;
		int dayOfMonth = Integer.parseInt(stringDate.substring(0, 2));
		return new GregorianCalendar(year, month, dayOfMonth);
	}
	
	private String convertSexToStringSex(Sex sex) {
		for (String sexString : ACCEPTABLE_SEXES.keySet()) {
			if (ACCEPTABLE_SEXES.get(sexString).equals(sex)) {
				return sexString;
			}
		}
		return null;
	}
	
	private Sex convertStringSexToSex(String sex) {
		return ACCEPTABLE_SEXES.get(sex);
	}
	
	private boolean existsUserWithEmail(String email) {
		for (UserIF user : DatabaseFacade.getInstance().getAllUsers().values()) {
			if (user.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	private Map<String, Sex> getAcceptableSexes() {
		Map<String, Sex> acceptableSexes = new HashMap<String, Sex>();
		acceptableSexes.put("Masculino", Sex.Male);
		acceptableSexes.put("Feminino", Sex.Female);
		acceptableSexes.put("N‹o informado", Sex.Uninformed);
		return acceptableSexes;
	}
	
	private boolean isInvalidDate(String date) {
		if (!date.matches(ACCEPTABLE_DATE_REGEX)) {
			return true;
		}
		
		Calendar gc = new GregorianCalendar();
		gc.setLenient(false);
		
		/* We can't use the convertStringDateToCalendar, because when we make new GregorianCalendar
		 * with an invalid value, it increments in a acceptable date, but it's wrong.
		 */
		int year = Integer.parseInt(date.substring(6, 10));
		// In GregorianCalendar the month is from 0 (January) to 11 (December) 
		int month = Integer.parseInt(date.substring(3, 5)) - 1;
		int dayOfMonth = Integer.parseInt(date.substring(0, 2));
		gc.set(year, month, dayOfMonth);
		try {
			gc.getTime();
		} catch (Exception e) {
			return true;
		}
		return false;
	}
	
	private boolean isInvalidSex(String sex) {
		return !ACCEPTABLE_SEXES.containsKey(sex);
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	public void deleteUser(String login) throws Exception {
		UserIF user = getUser(login);
		for (String blogId : user.getBlogs()) {
			WebElementManager.getInstance().deleteBlog(blogId);
		}
		DatabaseFacade.getInstance().deleteUser(login);
	}
	

}
