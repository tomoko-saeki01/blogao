package br.edu.ufcg.blogao.blog.data;

/**
 * The interactive content of the blog's post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import br.edu.ufcg.blogao.Identifiable;

public interface InteractiveContent extends Identifiable {
	
	/**
	 * Return the data.
	 * @return The data.
	 */
	public String getData();
	
	/**
	 * Return the description of the interactive content.
	 * @return The description of the interactive content.
	 */
	public StaticContent getDescription();
	
	/**
	 * Return the parent id of the interactive content.
	 * @return The parent id of the interactive content.
	 */
	public String getParentId();
	
	/**
	 * Set the data.
	 * @param data The data to be set.
	 */
	public void setData(String data);
	
	/**
	 * Set the description of the interactive content.
	 * @param description The description to be set.
	 */
	public void setDescription(StaticContent description);
}