package br.edu.ufcg.blogao.mobile;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;


public class Login {
	static Form form = new Form("Entrar no sistema");
	static TextField nameBox = new TextField("Login:", "", 15, TextField.ANY);
	static TextField passwdBox = new TextField("Senha:", "", 15, TextField.PASSWORD);
	
	public static Form getForm(){
		form.append(nameBox);
		form.append(passwdBox);
		return form;
	}
	
	public static boolean checkLogin() {
		return !(nameBox.getString().equals("")) && !(passwdBox.getString().equals(""));
	}
	
	public static TextField getNameBox() {
		return nameBox;
	}
	
}
