package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class FrameLogin extends QWidget {

	private QPushButton loginButton, registerButton;
	private QLineEdit loginField, passwordField;
	private QLabel loginLabel, passwordLabel;

	public FrameLogin() {
		resize(500, 200);

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();

	}

	private void actionsObjects() {
		// TODO consertar!
		// loginButton.clicked.connect(this, "authenticate()");
		//registerButton.clicked.connect(this, "openRegisterFrame()");
	}

	@SuppressWarnings("unused")
	private void openRegisterFrame() {
		
	}

	private void initObjects() {
		loginButton = new QPushButton("Login", this);
		registerButton = new QPushButton("Cadastrar", this);

		loginField = new QLineEdit(this);
		passwordField = new QLineEdit(this);
		passwordField.setEchoMode(QLineEdit.EchoMode.Password);

		loginLabel = new QLabel("Login", this);
		loginLabel.setFont(new QFont("Tempus Sans ITC", 11));

		passwordLabel = new QLabel("Senha", this);
		passwordLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		
	}

	private void positionsObjects() {
		int w = 80;
		int h = 35;
		loginLabel.move(w, h);
		passwordLabel.move(w, h + 40);

		loginField.move(w + 44, h - 2);
		passwordField.move(w + 44, h + 36);

		loginButton.move(w + 200, h + 80);
		registerButton.move(w + 280, h + 80);
	}

	private void resizeObjects() {
		loginButton.maximumSize();
		registerButton.maximumSize();

		loginField.resize(300, 27);
		passwordField.resize(300, 27);
	}
}