package br.edu.ufcg.blogao.session;

import br.edu.ufcg.blogao.Identifiable;

public interface SessionIF extends Identifiable {
	
	public void setUserId(String id);
	
	public String getUserId();
	
}
