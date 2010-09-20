package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 2.0 - 31th August, 2010.
 */
public class Movie implements InteractiveContent {
	
	private String id;
	private String parentId;
	private StaticContent description;
	private String data;
	
	/**
	 * Default Constructor.
	 * @param id The movie's ID.
	 * @param parentId The parent's ID.
	 * @param description The movie's description.
	 * @param data The data.
	 */
	public Movie(String id, String parentId, StaticContent description, String data) {
		this.id = id;
		this.parentId = parentId;
		this.setDescription(description);
		this.setData(data);
	}

	@Override
	public String getData() {
		return data;
	}
	
	@Override
	public StaticContent getDescription() {
		return description;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	public String getParentId() {
		return parentId;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void setDescription(StaticContent description) {
		this.description = description;
	}
}