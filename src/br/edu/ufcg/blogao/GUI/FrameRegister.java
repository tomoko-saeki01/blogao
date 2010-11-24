package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameRegister extends QWidget {

	private QLabel loginLabel, passwordLabel, confirmPasswordLabel, nameLabel,
			addressLabel, emailLabel, interestsLabel, moviesLabel, musicsLabel,
			booksLabel, whoIAmLabel, sexLabel, dateBirthdayLabel;

	private QLineEdit loginField, passwordField, confirmPasswordField,
			nameField, addressField, emailField;

	private QTextEdit interetsField, moviesField, musicsField, booksField,
			whoIAmField;

	public FrameRegister() {
		setWindowTitle("Blogão - Cadastro de um novo usuário");
		resize(maximumSize());

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();

		show();
	}

	private void actionsObjects() {
		// TODO Auto-generated method stub

	}

	private void initObjects() {
		loginLabel = new QLabel("Login", this);
		loginLabel.setFont(new QFont("Tempus Sans ITC", 11));

		passwordLabel = new QLabel("Senha", this);
		passwordLabel.setFont(new QFont("Tempus Sans ITC", 11));

		confirmPasswordLabel = new QLabel("Confirme a senha", this);
		confirmPasswordLabel.setFont(new QFont("Tempus Sans ITC", 11));

		nameLabel = new QLabel("Nome", this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));

		addressLabel = new QLabel("Endereço", this);
		addressLabel.setFont(new QFont("Tempus Sans ITC", 11));

		emailLabel = new QLabel("E-mail", this);
		emailLabel.setFont(new QFont("Tempus Sans ITC", 11));

		interestsLabel = new QLabel("Interesses", this);
		interestsLabel.setFont(new QFont("Tempus Sans ITC", 11));

		moviesLabel = new QLabel("Filmes Favoritos", this);
		moviesLabel.setFont(new QFont("Tempus Sans ITC", 11));

		musicsLabel = new QLabel("Músicas Favoritas", this);
		musicsLabel.setFont(new QFont("Tempus Sans ITC", 11));

		booksLabel = new QLabel("Livros Favoritos", this);
		booksLabel.setFont(new QFont("Tempus Sans ITC", 11));

		whoIAmLabel = new QLabel("Quem sou eu", this);
		whoIAmLabel.setFont(new QFont("Tempus Sans ITC", 11));

		sexLabel = new QLabel("Sexo", this);
		sexLabel.setFont(new QFont("Tempus Sans ITC", 11));

		dateBirthdayLabel = new QLabel("Data de Nascimento", this);
		dateBirthdayLabel.setFont(new QFont("Tempus Sans ITC", 11));

		loginField = new QLineEdit(this);
		passwordField = new QLineEdit(this);
		confirmPasswordField = new QLineEdit(this);
		nameField = new QLineEdit(this);
		addressField = new QLineEdit(this);
		emailField = new QLineEdit(this);

		interetsField = new QTextEdit(this);
		moviesField = new QTextEdit(this);
		musicsField = new QTextEdit(this);
		booksField = new QTextEdit(this);
		whoIAmField = new QTextEdit(this);
	}

	private void positionsObjects() {
		// TODO Auto-generated method stub

	}

	private void resizeObjects() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		new FrameRegister();
		QApplication.exec();
	}
}