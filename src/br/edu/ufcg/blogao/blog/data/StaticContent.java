package br.edu.ufcg.blogao.blog.data;

/**
 * The static content of the blog's post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
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