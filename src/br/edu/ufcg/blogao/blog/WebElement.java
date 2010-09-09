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
	
	public StaticContent getText();
	
	public void setText(StaticContent text);
	
	public Calendar getCreationDate();

}
