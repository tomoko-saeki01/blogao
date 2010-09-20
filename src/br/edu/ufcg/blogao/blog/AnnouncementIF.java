package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 19th September, 2010.
 */

import br.edu.ufcg.blogao.Identifiable;

public interface AnnouncementIF extends Identifiable {

	/**
	 * Return the target's ID.
	 * @return The target's ID.
	 */
	public String getTargetId();
}