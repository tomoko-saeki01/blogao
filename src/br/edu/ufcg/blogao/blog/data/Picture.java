package br.edu.ufcg.blogao.blog.data;

/**
 * The picture that can be attached to the blog's post.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */
public class Picture implements InteractiveContent {
	
	private String id;
	private String parentId;
	private StaticContent description;
	private String data;
	
	/**
	 * Default constructor.
	 * @param id The picture's ID.
	 * @param parentId The parent's ID.
	 * @param description The picture's description.
	 * @param data The data.
	 */
	public Picture(String id, String parentId, StaticContent description, String data) {
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
}