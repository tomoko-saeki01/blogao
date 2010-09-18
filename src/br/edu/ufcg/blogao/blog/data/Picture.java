package br.edu.ufcg.blogao.blog.data;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 31th August, 2010.
 */
public class Picture implements InteractiveContent {
	
	private String id;
	private String parentId;
	private StaticContent description;
	private String data;
	
	public Picture(String id, String parentId, StaticContent description, String data) {
		this.id = id;
		this.setParentId(parentId);
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
	
	@Override
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
	
	@Override
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}