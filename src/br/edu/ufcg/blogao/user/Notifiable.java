package br.edu.ufcg.blogao.user;

/**
 *  Notife the announcements.
 *  
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.List;

public interface Notifiable {

	/**
	 * Receive a announcement.
	 * @param Id The announcement's ID.
	 */
	public void receiveAnnouncement(String Id);
	
	/**
	 * Return a list with all the announcement's ID.
	 * @return A list with all the announcements.
	 */
	public List<String> getAnnouncements();
}