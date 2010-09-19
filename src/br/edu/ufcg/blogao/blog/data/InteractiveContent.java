package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 31th August, 2010.
 */

import br.edu.ufcg.blogao.Identifiable;

public interface InteractiveContent extends Identifiable {
	
	/**
	 * Return the data.
	 * @return The data.
	 */
	public String getData();
	
	/**
	 * Return the description.
	 * @return The description.
	 */
	public StaticContent getDescription();
	
	/**
	 * Return the id of this interactive content.
	 * @return parent id.
	 */
	public String getParentId();
	
	/**
	 * Set the data.
	 * @param data The data to be set.
	 */
	public void setData(String data);
	
	/**
	 * Set the description.
	 * @param description The description to be set.
	 */
	public void setDescription(StaticContent description);
	
	/**
	 * Set the parent id of this interactive content.
	 * @param parentId id of the parent.
	 */
	public void setParentId(String parentId);
}