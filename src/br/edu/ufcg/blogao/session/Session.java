package br.edu.ufcg.blogao.session;

public class Session implements SessionIF {
	
	private String id;
	private String userId;
	
	public Session(String sessionId, String userId) {
		this.setID(sessionId);
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
	public void setID(String id) {
		this.id = id;
	}
	
	@Override
	public void setUserId(String id) {
		this.userId = id;
	}

}
