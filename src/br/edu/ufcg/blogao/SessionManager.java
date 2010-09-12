package br.edu.ufcg.blogao;

public class SessionManager {
	
	private static SessionManager selfInstance = null;
	
	public static SessionManager getInstance() {
		if (selfInstance != null) {
			selfInstance = new SessionManager();
		}
		return selfInstance;
	}
	
	

}
