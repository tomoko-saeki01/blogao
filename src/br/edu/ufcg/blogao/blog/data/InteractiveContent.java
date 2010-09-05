package br.edu.ufcg.blogao.blog.data;

import java.io.File;

import br.edu.ufcg.blogao.Identifiable;

public interface InteractiveContent extends Identifiable {
	
	public StaticContent getDescription();
	
	public void setDescription(StaticContent description);
	
	public File getData();
	
	public void setData(File data);

}
