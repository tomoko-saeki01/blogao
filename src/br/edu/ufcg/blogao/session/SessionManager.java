package br.edu.ufcg.blogao.session;

import java.util.HashMap;
import java.util.Map;

import br.edu.ufcg.blogao.IdGenerator;
import br.edu.ufcg.blogao.user.UsersHandler;

/**
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 1.0 20/09/2010
 */
public class SessionManager {
	
	private static SessionManager selfInstance = null;
	private Map<String, SessionIF> actualSessions = null;
	
	private final String INVALID_LOGIN_OR_PASSWORD_MESSAGE = "Login ou senha inv‡lido";
	private final String INVALID_LOGIN_MESSAGE = "Login inv‡lido";
	private final String INVALID_SESSIONID_MESSAGE = "Sess‹o inv‡lida";
	private final String UNEXISTENT_USER_MESSAGE = "Usu‡rio inexistente";
	private final String LOGGED_USER_MESSAGE = "Usu‡rio j‡ logado";
	
	private SessionManager() {
		actualSessions = new HashMap<String, SessionIF>();
	}
	
	public static SessionManager getInstance() {
		if (selfInstance == null) {
			selfInstance = new SessionManager();
		}
		return selfInstance;
	}
	
	public String getLoggedUserId(String sessionId) throws Exception {
		if (isInvalidString(sessionId) || isInvalidSession(sessionId)) {
			throw new IllegalArgumentException(INVALID_SESSIONID_MESSAGE);
		}
		
		SessionIF session = actualSessions.get(sessionId);
		return session.getUserId();
	}

	public synchronized void logoff(String sessionId) throws Exception {
		if (isInvalidString(sessionId) || isInvalidSession(sessionId)) {
			throw new IllegalArgumentException(INVALID_SESSIONID_MESSAGE);
		}
		
		actualSessions.remove(sessionId);
	}
	
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
	
	private boolean isInvalidSession(String sessionId) {
		return !actualSessions.containsKey(sessionId);
	}

	private boolean isInvalidString(String str) {
		return str == null || str.trim().isEmpty();
	}

	public void logoffAllSessions() {
		actualSessions.clear();
	}

}
