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

import br.edu.ufcg.blogao.Identifiable;

public interface SessionIF extends Identifiable {
	
	/**
	 * Set the user's ID. 
	 * @param id The user's ID that will be seted.
	 */
	public void setUserId(String id);
	
	/**
	 * Return the user's ID.
	 * @return The user's ID.
	 */
	public String getUserId();
}