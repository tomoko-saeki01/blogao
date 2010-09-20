package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 19th September, 2010.
 */

public class Text implements StaticContent {
	
	private String text;
	
	/**
	 * Default constructor.
	 * @param text The text.
	 */
	public Text(String text) {
		this.setText(text);
	}

	/**
	 * Return the text.
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * Set the text.
	 */
	@Override
	public void setText(String text) {
		this.text = text;
	}
}