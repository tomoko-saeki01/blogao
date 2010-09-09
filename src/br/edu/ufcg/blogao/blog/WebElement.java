package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 31th August, 2010.
 */

import java.util.Calendar;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.data.StaticContent;

public interface WebElement extends Identifiable {
	
	/**
	 * Return a text.
	 * @return A text.
	 */
	public StaticContent getText();
	
	/**
	 * Set a text.
	 * @param text A text.
	 */
	public void setText(StaticContent text);
	
	/**
	 * Return the creation date.
	 * @return The creation date.
	 */
	public Calendar getCreationDate();
}