package br.edu.ufcg.blogao.blog;

public class AnnouncementImpl implements AnnouncementIF {

	private String Id;
	private String targetId;
	
	public AnnouncementImpl(String Id, String targetId) {
		this.Id = Id;
		this.targetId = targetId;
	}
	
	@Override
	public String getTargetId() {
		return targetId;
	}

	@Override
	public String getId() {
		return Id;
	}

}
