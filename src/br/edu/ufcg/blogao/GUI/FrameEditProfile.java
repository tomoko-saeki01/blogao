package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameEditProfile  extends QWidget {
	private QLabel nameLabel, addressLabel, emailLabel, interestsLabel,
			moviesLabel, musicsLabel, booksLabel, whoIAmLabel, sexLabel,
			dateBirthdayLabel;

	private QLineEdit nameField, addressField, emailField, birthDayField;

	private QTextEdit interestsField, moviesField, musicsField, booksField,
			whoIAmField;
	
	private QComboBox sexCombo;
	private QPushButton refreshButton, cancelButton;

	public FrameEditProfile() {
		resize(1200, 700);

		init();
		resize();
		positions();
		actionsObjects();
	}

	private void actionsObjects() {
		// TODO finish.
	}
	
	private void init() {
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

		birthDayField = new QLineEdit(this);
		nameField = new QLineEdit(this);
		addressField = new QLineEdit(this);
		emailField = new QLineEdit(this);

		interestsField = new QTextEdit(this);
		moviesField = new QTextEdit(this);
		musicsField = new QTextEdit(this);
		booksField = new QTextEdit(this);
		whoIAmField = new QTextEdit(this);
		
		sexCombo = new QComboBox(this);
		sexCombo.addItem("");
		sexCombo.addItem("Feminino");
		sexCombo.addItem("Masculino");
		
		refreshButton = new QPushButton("Atualizar Perfil ",this);
		refreshButton.setIcon(new QIcon("pictures/refresh.png"));
		
		cancelButton = new QPushButton("Cancelar ",this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}
	
	@SuppressWarnings("unused")
	private void editProfile() {
		String name = nameField.text();
		String address = addressField.text();
		String email = emailField.text();
		String interests = interestsField.toPlainText();
		String whoIAm = whoIAmField.toPlainText();
		String movies = moviesField.toPlainText();
		String musics = musicsField.toPlainText();
		String books = booksField.toPlainText();
	}

	private void positions() {
		int w = 100;
		int h = 100;

		nameLabel.move(w, h);
		dateBirthdayLabel.move(w, h + 37);
		sexLabel.move(w, h + 74);
		emailLabel.move(w, h + 111);
		addressLabel.move(w, h + 148);
		whoIAmLabel.move(w, h + 204);
		interestsLabel.move(w + 450, h + 8);
		moviesLabel.move(w + 450, h + 225);
		musicsLabel.move(w + 750, h + 225);
		booksLabel.move(w + 750, h + 8);
		
		nameField.move(w + 50, h);
		birthDayField.move(w + 140, h + 37);
		sexCombo.move(w + 50, h + 74);
		emailField.move(w + 50, h + 111);
		addressField.move(w + 70, h + 148);
		whoIAmField.move(w + 50, h + 231);
		interestsField.move(w + 500, h + 33);
		moviesField.move(w + 500, h + 250);
		musicsField.move(w + 800, h + 250);
		booksField.move(w + 800, h + 33);
		
		refreshButton.move(w + 820, h + 500);
		cancelButton.move(w + 930, h + 500);
	}

	private void resize() {
		nameField.resize(330, 25);
		emailField.resize(328, 25);
		addressField.resize(307, 25);
		interestsField.resize(200, 150);
		moviesField.resize(200, 150);
		musicsField.resize(200, 150);
		booksField.resize(200, 150);
		whoIAmField.resize(320, 300);
		
		refreshButton.maximumSize();
		cancelButton.maximumSize();
	}	
}