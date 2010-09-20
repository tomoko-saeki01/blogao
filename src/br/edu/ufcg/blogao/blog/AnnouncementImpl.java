package br.edu.ufcg.blogao.blog;

/**
 * @author Caio
 * @author Carlos
 * @author Catharine
 * @author Demontie
 * @author Matheus
 * @version 1.0 - 19th September, 2010.
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