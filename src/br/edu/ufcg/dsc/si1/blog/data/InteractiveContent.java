package br.edu.ufcg.dsc.si1.blog.data;

import java.io.File;
import java.util.Date;

public interface InteractiveContent {
	
	public String getName();
	
	public void setName(String name);
	
	public Date getCreationDate();
	
	public File getContent();

}
