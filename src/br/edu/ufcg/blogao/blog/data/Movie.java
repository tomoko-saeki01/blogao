package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 31th August, 2010.
 */
public class Movie implements InteractiveContent {
	
	private String id;
	private StaticContent description;
	private String data;
	
	public Movie(String id, StaticContent description, String data) {
		this.id = id;
		this.setDescription(description);
		this.setData(data);
	}

	/**
	 * Return the data.
	 */
	@Override
	public String getData() {
		return data;
	}
	
	/**
	 * Return the description.
	 */
	@Override
	public StaticContent getDescription() {
		return description;
	}
	
	/**
	 * Return the ID.
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * Set the data.
	 */
	@Override
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Set the description.
	 */
	@Override
	public void setDescription(StaticContent description) {
		this.description = description;
	}
}