package br.edu.ufcg.blogao.user;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class UsersHandler {
	
	private static UsersHandler selfInstance = null;
	private Map<String, User> users = new HashMap<String, User>(); // <userID, user>
	
	private final String INVALID_LOGIN_MESSAGE ="Login inv�lido";
	private final String INVALID_PASSWORD_MESSAGE = "Senha inv�lida";
	private final String  INVALID_EMAIL_MESSAGE = "Email inv�lido";
	private final String INVALID_SEX_MESSAGE = "Sexo inv�lido";
	private final String INVALID_DATE_MESSAGE = "Data inv�lida";
	private final String INVALID_ATTRIBUTE_MESSAGE = "Atributo inv�lido";
	
	private final String EXISTENT_LOGIN_MESSAGE = "Login existente";
	private final String EXISTENT_EMAIL_MESSAGE = "Email existente";
	private final String UNEXISTENT_LOGIN_MESSAGE = "Login inexistente";
	
	private final Map<String, Sex> ACCEPTABLE_SEXES = getAcceptableSexes();
	private final String ACCEPTABLE_DATE_REGEX = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
	private final String DATE_FORMAT = "%d/%d/%d";
	
	public static UsersHandler getInstance() {
		if (selfInstance == null) {
			selfInstance = new UsersHandler();
		}
		return selfInstance;
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
		
		Sex userSex = convertStringSexToSex(sex);
		User newUser = new UserImpl(login, password, email, name, interests, whoIAm, userBirthday, userSex, musics, movies, books);
		users.put(newUser.getId(),newUser);
	}
	
	public String getUserInformation(String login, String attribute) {
		if (isInvalidString(login)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		if (isInvalidString(attribute)) {
			throw new IllegalArgumentException(INVALID_ATTRIBUTE_MESSAGE);
		}
		final String NAME = "nome_exibicao";
		final String EMAIL = "email";
		final String SEX = "sexo";
		final String DATE_BIRTHDAY = "DataNasc";
		final String ADDRESS = "endereco";
		final String INTERESTS = "interesses";
		final String WHO_I_AM = "quem_sou_eu";
		final String MOVIES = "filmes";
		final String MUSICS = "musicas";
		final String BOOKS = "livros";
		
		User user = users.get(login);
		if (user == null) {
			throw new IllegalStateException(UNEXISTENT_LOGIN_MESSAGE);
		}
		
		if (attribute.equals(NAME)) {
			return user.getName();
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
	
	private String convertCalendarToStringDate(Calendar cal) {
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
		for (User user : users.values()) {
			if (user.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	private boolean existsUserWithLogin(String login) {
		for (User user : users.values()) {
			if (user.getId().equals(login)) {
				return true;
			}
		}
		return false;
	}
	
	private Map<String, Sex> getAcceptableSexes() {
		Map<String, Sex> acceptableSexes = new HashMap<String, Sex>();
		acceptableSexes.put("Masculino", Sex.Male);
		acceptableSexes.put("Feminino", Sex.Female);
		acceptableSexes.put("N�o informado", Sex.Uninformed);
		return acceptableSexes;
	}
	
	private boolean isInvalidDate(String date) {
		if (!date.matches(ACCEPTABLE_DATE_REGEX)) {
			return true;
		}
		
		Calendar gc = new GregorianCalendar();
		gc.setLenient(false);
		Calendar dateOfBirthday = convertStringDateToCalendar(date);
		gc.set(dateOfBirthday.get(GregorianCalendar.YEAR), 
				dateOfBirthday.get(GregorianCalendar.MONTH), 
				dateOfBirthday.get(GregorianCalendar.DAY_OF_MONTH));
		try {
			gc.getTime();
		} catch (Exception e) {
			return true;
		}
		return false;
	}
	
	private boolean isInvalidSex(String sex) {
		for (String acceptableSex : ACCEPTABLE_SEXES.keySet()) {
			if (acceptableSex.equals(sex)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
	
	

}
