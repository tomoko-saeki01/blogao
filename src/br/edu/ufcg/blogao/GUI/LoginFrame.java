package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class LoginFrame extends QWidget {

	private QPushButton loginButton;
	private QLineEdit loginField, passwordField;
	private QLabel loginLabel, passwordLabel;
	
	public LoginFrame() {
		setWindowTitle("Blogão");
		initUI();
		resize(maximumSize());
		show();
	}

	private void initUI() {
		
		//Cria o botão para login
		loginButton = createButton("Login", this);
		loginButton.resize(100, 25);
		loginButton.setCheckable(true);
		loginButton.toggled.connect(this, "onToggled()");
		loginButton.move(590, 400);
				
		createLoginField();
		createPasswordField();
	}
	
	private void createLoginField() {
		//Cria o texto "login" na tela.
		String loginText = "Login";
		loginLabel = createLabel(loginText, this);
		loginLabel.setFont(new QFont("Tempus Sans ITC", 11));
		loginLabel.move(480, 320);
		
		//Cria o campo para que o login seja inserido.
		loginField = createLineEdit(this);
		loginField.resize(250, 25);
		loginField.move(520, 320);
	}
	
	private void createPasswordField() {
		//Cria o texto "senha" na tela.
		String passwordText = "Senha";
		passwordLabel = createLabel(passwordText, this); 
		passwordLabel.setFont(new QFont("Tempus Sans ITC", 11));
		passwordLabel.move(480, 350);
		
		//Cria o campo para que a senha seja inserida.
		passwordField = createLineEdit(this);
		passwordField.setEchoMode(QLineEdit.EchoMode.Password);
		passwordField.resize(250, 25);
		passwordField.move(520, 350);
	}
	
	private QPushButton createButton(String text, QWidget parent) {
		return new QPushButton(text, parent);
	}
	
	private QLabel createLabel(String text, QWidget parent) {
		return new QLabel(text, parent);
	}
	
	private QLineEdit createLineEdit(QWidget parent) {
		return new QLineEdit(parent);
	}
	
	@SuppressWarnings("unused")
	private void onToggled() {
		if (loginButton.isChecked()) {
		//TODO
		System.out.println("login");
		}
	}
}