package br.edu.ufcg.blogao.user;

import java.util.Date;
import java.util.List;

import br.edu.ufcg.blogao.Identifiable;
import br.edu.ufcg.blogao.blog.Comment;

public class User implements Identifiable {
	
	private String id;
	private String login;
	private String password;
	private String name;
	private String address;
	private String email;
	private String interests;
	private Date dateOfBirthday;
	private Sex sex;
	private List<String> musics;
	private List<String> movies;
	private List<String> books;
	private List<Comment> comments;
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
