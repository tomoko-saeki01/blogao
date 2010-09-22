package br.edu.ufcg.blogao.session;

/**
 * Represents the session on Blogao.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

public class Session implements SessionIF {
	
	private String id;
	private String userId;
	
	/**
	 * Default constructor.
	 * @param sessionId The session's ID.
	 * @param userId The user's ID.
	 */
	public Session(String sessionId, String userId) {
		this.id = sessionId;
		this.setUserId(userId);
	}

	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getUserId() {
		return userId;
	}
	
	@Override
	public void setUserId(String id) {
		this.userId = id;
	}
}