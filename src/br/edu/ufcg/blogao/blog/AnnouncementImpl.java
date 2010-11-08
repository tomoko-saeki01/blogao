package br.edu.ufcg.blogao.blog;

/**
 * Describes the behavior of a notifier.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
public class AnnouncementImpl implements AnnouncementIF {

	private String Id;
	private String targetId;
	
	/**
	 * Default constructor.
	 * @param Id The announcement's ID.
	 * @param targetId The target's ID.
	 */
	public AnnouncementImpl(String Id, String targetId) {
		this.Id = Id;
		this.targetId = targetId;
	}
	
	@Override
	public String getId() {
		return Id;
	}
	
	@Override
	public String getTargetId() {
		return targetId;
	}
}