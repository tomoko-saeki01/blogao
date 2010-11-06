package br.edu.ufcg.blogao.session;

/**
 * Manage the sessions on Blogao.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.user.UsersHandler;

public class SessionManager {
	
	private static SessionManager selfInstance = null;
	private Map<String, SessionIF> actualSessions = null;
	
	private final String INVALID_LOGIN_OR_PASSWORD_MESSAGE = "Login ou senha inválido";
	private final String INVALID_LOGIN_MESSAGE = "Login inválido";
	private final String INVALID_SESSIONID_MESSAGE = "Sessão inválida";
	private final String UNEXISTENT_USER_MESSAGE = "Usuário inexistente";
	private final String LOGGED_USER_MESSAGE = "Usuário já logado";
	
	private SessionManager() {
		actualSessions = new HashMap<String, SessionIF>();
	}
	
	/**
	 * Return the instance of session manager.
	 * @return The instance of session manager.
	 */
	public static SessionManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new SessionManager();
		}
		return selfInstance;
	}
	
	/**
	 * Return the ID of the logged user.
	 * @param sessionId The session's ID.
	 * @return The ID of the logged user.
	 * @throws Exception If the sessionID is null, empty or doesn't exist.
	 */
	public String getLoggedUserId(String sessionId) throws Exception {
		if (isInvalidString(sessionId) || isInvalidSession(sessionId)) {
			throw new IllegalArgumentException(INVALID_SESSIONID_MESSAGE);
		}		
		SessionIF session = actualSessions.get(sessionId);
		return session.getUserId();
	}
	
	/**
	 * Verify if the user is logged on Blogao.
	 * @param userLogin The user's login.
	 * @return True case the user is logged or False otherwise.
	 * @throws Exception If the userLogin is null or empty or if the user doesn't exist.
	 */
	public boolean isUserLogged(String userLogin) throws Exception {
		if (isInvalidString(userLogin)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		for (SessionIF session : actualSessions.values()) {
			if (session.getUserId().equals(userLogin)) {
				return true;
			}
		}		
		if (!UsersHandler.getInstance().existsUserWithLogin(userLogin)) {
			throw new IllegalArgumentException(UNEXISTENT_USER_MESSAGE);
		}
		return false;
	}

	/**
	 * Logoff the session.
	 * @param sessionId The session's ID.
	 * @throws Exception If the sessionId is null, empty or doesn't exist.
	 */
	public synchronized void logoff(String sessionId) throws Exception {
		if (isInvalidString(sessionId) || isInvalidSession(sessionId)) {
			throw new IllegalArgumentException(INVALID_SESSIONID_MESSAGE);
		}		
		actualSessions.remove(sessionId);
	}
	
	/**
	 * Logoff all the sessions.
	 */
	public void logoffAllSessions() {
		actualSessions.clear();
	}
	
	/**
	 * Log the user on Blogao.
	 * @param userLogin The user's login.
	 * @param userPassword The user's password.
	 * @return The session's ID.
	 * @throws Exception If the userLogin is null, empty or doesn't exist.
	 * 				     If the serPassword is null or empty. 
	 * 					 If the user is already logged.
	 */
	public synchronized String logon(String userLogin, String userPassword) throws Exception {
		if (isInvalidString(userLogin) || !UsersHandler.getInstance().existsUserWithLogin(userLogin)) {
			throw new IllegalArgumentException(INVALID_LOGIN_OR_PASSWORD_MESSAGE);
		}
		
		if (isInvalidString(userPassword) || !UsersHandler.getInstance().isPasswordFromUser(userLogin, userPassword)) {
			throw new IllegalArgumentException(INVALID_LOGIN_OR_PASSWORD_MESSAGE);
		}
		
		if (isUserLogged(userLogin)) {
			throw new IllegalStateException(LOGGED_USER_MESSAGE);
		}
		String sessionId = IdGenerator.getInstance().getNextId();
		SessionIF newSession = new Session(sessionId, userLogin);
		actualSessions.put(sessionId, newSession);
		return sessionId;
	}
	
	/**
	 * Update the logged user's ID.	
	 * @param actualUserId The actual user's ID. 
	 * @param newUserId The new user's ID.
	 * @throws Exception If the actualId or the newId are null or empty.
	 */
	public void updateLoggedUserId(String actualUserId, String newUserId) throws Exception {
		if (isInvalidString(actualUserId) || isInvalidString(newUserId)) {
			throw new IllegalArgumentException(INVALID_LOGIN_MESSAGE);
		}
		if (isUserLogged(actualUserId)) {
			for (SessionIF session : actualSessions.values()) {
				if (session.getUserId().equals(actualUserId)) {
					session.setUserId(newUserId);
				}
			}
		}		
	}
	
	/**
	 * Verify if the session is invalid.
	 * @param sessionId The session's ID that will be verified.
	 * @return True case the session is invalid or False otherwise.
	 */
	private boolean isInvalidSession(String sessionId) {
		return !actualSessions.containsKey(sessionId);
	}

	/**
	 * Verify if the string is invalid.
	 * @param str The string that will be verified.
	 * @return True case the string is invalid or False otherwise.
	 */
	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}
}