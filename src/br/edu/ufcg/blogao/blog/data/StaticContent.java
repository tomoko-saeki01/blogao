package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 31th August, 2010.
 */

public interface StaticContent {
	
	/**
	 * Return the text.
	 * @return The text.
	 */
	public String getText();
	
	/**
	 * Set the text. 
	 * @param text The text to be set.
	 */
	public void setText(String text);
}