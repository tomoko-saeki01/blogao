package br.edu.ufcg.blogao.blog;

import br.edu.ufcg.blogao.Identifiable;

/**
 * Describes the behavior of a notifier.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public interface AnnouncementIF extends Identifiable {

	/**
	 * Return the target's ID.
	 * @return The target's ID.
	 */
	public String getTargetId();
}