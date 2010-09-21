package br.edu.ufcg.blogao.blog.data;

/**
 * The sound that can be attached to the blog's post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 2.0 - 31th August, 2010.
 */
public class Sound implements InteractiveContent {
	
	private String id;
	private String parentId;
	private StaticContent description;
	private String data;
	
	/**
	 * Default constructor.
	 * @param id The sound's ID.
	 * @param parentId The parent's ID.
	 * @param description The sound's description.
	 * @param data The data.
	 */
	public Sound(String id, String parentId, StaticContent description, String data) {
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