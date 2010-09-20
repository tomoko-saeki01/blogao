package br.edu.ufcg.blogao.user;

import java.util.List;

public interface Notifiable {

	public void doNotify(String Id);
	
	public List<String> getAnnouncements();
}
