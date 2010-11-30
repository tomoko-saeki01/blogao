package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class FrameLogin extends QWidget {

	private QPushButton loginButton, registerButton;
	private QLineEdit loginField, passwordField;
	private QLabel loginLabel, passwordLabel;
	private FrameContainer container = FrameContainer.getInstance();
		
	public FrameLogin() {
		resize(maximumSize());

		init();
		resize();
		positions();
		actionsObjects();
	}
	
	private void actionsObjects() {
		loginButton.clicked.connect(this, "authenticate()");
		registerButton.clicked.connect(this, "openRegisterFrame()");
	}

	@SuppressWarnings("unused")
	private void authenticate() {
		try {
			String session = container.getBlog().logon(loginField.text(), passwordField.text());
			container.setActualSession(session);
			openUserFrame();
		} catch (Exception e) {
			displayMessageErro("Erro", e.getMessage());
		}
	}
	
	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}
	
	private void init() {
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
	
	@SuppressWarnings("unused")
	private void openRegisterFrame() {
		close();
		container.getLayout().removeWidget(container.getActualLoginFrame());
		container.getLayout().addWidget(container.getNewRegisterFrame());
	}
	

	private void openUserFrame() {
		close();
		container.getLayout().removeWidget(container.getActualLoginFrame());
		container.getLayout().addWidget(container.getNewUserFrame());
	}

	private void positions() {
		int w = 450;
		int h = 120;
		loginLabel.move(w, h);
		passwordLabel.move(w, h + 40);

		loginField.move(w + 44, h - 2);
		passwordField.move(w + 44, h + 36);

		loginButton.move(w + 200, h + 80);
		registerButton.move(w + 280, h + 80);
	}

	private void resize() {
		loginButton.maximumSize();
		registerButton.maximumSize();

		loginField.resize(300, 27);
		passwordField.resize(300, 27);
	}
}