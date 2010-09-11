package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 31th August, 2010.
 */

import java.io.File;
import br.edu.ufcg.blogao.Identifiable;

public interface InteractiveContent extends Identifiable {
	
	/**
	 * Return the data.
	 * @return The data.
	 */
	public File getData();
	
	/**
	 * Return the description.
	 * @return The description.
	 */
	public StaticContent getDescription();
	
	/**
	 * Set the data.
	 * @param data The data to be set.
	 */
	public void setData(File data);
	
	/**
	 * Set the description.
	 * @param description The description to be set.
	 */
	public void setDescription(StaticContent description);
}