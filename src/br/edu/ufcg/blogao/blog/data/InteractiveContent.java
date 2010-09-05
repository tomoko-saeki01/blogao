package br.edu.ufcg.blogao.blog.data;

import java.io.File;
import java.util.Date;

public interface InteractiveContent {
	
	public String getName();
	
	public void setName(String name);
	
	public Date getCreationDate();
	
	public File getContent();

}
