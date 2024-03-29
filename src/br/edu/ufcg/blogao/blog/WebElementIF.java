package br.edu.ufcg.blogao.blog;

import java.util.Calendar;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.data.StaticContent;

/**
 * Interface for Web elements like Blog, Post, Comment.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public interface WebElementIF extends Identifiable {
	
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