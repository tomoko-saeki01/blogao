package br.edu.ufcg.blogao.blog;

import java.util.Date;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.data.StaticContent;

public interface WebElement extends Identifiable {
	
	public StaticContent getText();
	
	public void setText(StaticContent text);
	
	public Date getCreationDate();

}
