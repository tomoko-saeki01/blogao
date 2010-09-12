package br.edu.ufcg.blogao.user;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class UsersHandler {
	
	private static UsersHandler selfInstance = null;
	private Map<String, User> users = new HashMap<String, User>(); // <userID, user>
	
	private final String INVALID_LOGIN_MESSAGE ="Login inv‡lido";
	private final String INVALID_PASSWORD_MESSAGE = "Senha inv‡lida";
	private final String  INVALID_EMAIL_MESSAGE = "Email inv‡lido";
	private final String INVALID_SEX_MESSAGE = "Sexo inv‡lido";
	private final String INVALID_DATE_MESSAGE = "Data inv‡lida";
	
	private final String EXISTENT_LOGIN_MESSAGE = "Login existente";
	private final String EXISTENT_EMAIL_MESSAGE = "Email existente";
	
	private final Map<String, Sex> ACCEPTABLE_SEX = getAcceptableSexes();
	private final String ACCEPTABLE_DATE_FORMAT = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
	
	public static UsersHandler getInstance() {
		if (selfInstance == null) {
			selfInstance = new UsersHandler();
		}
		return selfInstance;
	}
	
	public synchronized void createUser(String login, String password, String name,
			String email, String sex, String dateOfBirthday, String address,
			String interests, String whoAmI, String movies,
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
		User newUser = new UserImpl(login, password, email, name, interests, userBirthday, userSex, musics, movies, books);
		users.put("",newUser);
		
		// TODO verificar usuario existente && Salvar usuario.
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

	public String getUserInformation(String attribute) {
		// TODO
		return null;
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
	
	private Sex convertStringSexToSex(String sex) {
		return ACCEPTABLE_SEX.get(sex);
	}
	
	private Map<String, Sex> getAcceptableSexes() {
		Map<String, Sex> acceptableSexes = new HashMap<String, Sex>();
		acceptableSexes.put("Masculino", Sex.Male);
		acceptableSexes.put("Feminino", Sex.Female);
		acceptableSexes.put("N‹o informado", Sex.Uninformed);
		return acceptableSexes;
	}
	
	private boolean isInvalidDate(String date) {
		if (!date.matches(ACCEPTABLE_DATE_FORMAT)) {
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
		for (String acceptableSex : ACCEPTABLE_SEX.keySet()) {
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
