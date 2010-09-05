package br.edu.ufcg.blogao.blog.data;

import java.io.File;

public class Sound implements InteractiveContent {
	
	private String id;
	private StaticContent description;
	private File data;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public File getData() {
		return data;
	}
	
	@Override
	public void setData(File data) {
		this.data = data;
	}

	@Override
	public StaticContent getDescription() {
		return description;
	}

	@Override
	public void setDescription(StaticContent description) {
		this.description = description;
	}

}
