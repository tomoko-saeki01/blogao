package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class FrameLogin extends QWidget {

	private FrameBlogao frameBlogao;
	private QPushButton loginButton, registerButton;
	private QLineEdit loginField, passwordField;
	private QLabel loginLabel, passwordLabel;

	public FrameLogin() {
		setWindowTitle("Login");
		resize(maximumSize());

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();

		show();
	}

	private void actionsObjects() {
		// TODO
		loginButton.click();
		// se loginButton pressionado: authenticate().
	}

	private void authenticate() {
		String login = loginField.text();
		String password = passwordField.text();
		boolean authenticated = frameBlogao.authenticate(login, password);
		if (authenticated) {
			// TODO
		} else {
			frameBlogao.displayMessage("Login/senha invalidos.");
		}
	}

	private void initObjects() {
		frameBlogao = new FrameBlogao();

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
		loginLabel.move(475, 300);
		passwordLabel.move(475, 330);

		loginField.move(520, 300);
		passwordField.move(520, 330);

		loginButton.move(625, 370);
		registerButton.move(715, 370);
	}

	private void resizeObjects() {
		loginButton.maximumSize();
		registerButton.maximumSize();

		loginField.resize(300, 27);
		passwordField.resize(300, 27);
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		new FrameLogin();
		QApplication.exec();
	}
}