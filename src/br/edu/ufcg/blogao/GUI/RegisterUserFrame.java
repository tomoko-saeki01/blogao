package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class RegisterUserFrame extends QWidget {

	private QPushButton register;
	private QLabel loginLabel, passwordLabel, nameLabel, addressLabel,
			emailLabel, interestsLabel, whoIAmLabel, dateBirthdayLabel,
			sexLabel, musicsLabel, moviesLabel, booksLabel;
	private QLineEdit loginField, passwordField, nameField, addressField,
			emailField, interestsField, whoIAmField, dateBirthdayField,
			musicsField, moviesField, booksField;
	private QComboBox comboMonth;
	private QLabel month;

	public RegisterUserFrame() {
		setWindowTitle("Blogão");
		initUI();
		resize(maximumSize());
		show();
	}

	private void initUI() {
		InitNameFields();
		InitAddressFields();
		InitBooksFields();
		InitEmailsFields();
		InitMoviesFields();
		InitInteretsFields();
		InitMusicsFields();
		InitSexFields();
		InitDateBirthdayFields();
		InitWhoIAmFields();

		/*
		 * String loginText = "Login"; loginLabel = new QLabel(loginText, this);
		 * loginLabel.setFont(new QFont("Tempus Sans ITC", 11));
		 * loginLabel.move(300, 180);
		 * 
		 * String passwordText = "Senha"; passwordLabel = new
		 * QLabel(passwordText, this); passwordLabel.setFont(new
		 * QFont("Tempus Sans ITC", 11)); passwordLabel.move(300, 210);
		 */
	}

	private void createComoMonth() {
		comboMonth = new QComboBox(this);
		comboMonth.addItem("");
		comboMonth.addItem("Janeiro");
		comboMonth.addItem("Fevereiro");
		comboMonth.addItem("Março");
		comboMonth.addItem("Abril");
		comboMonth.addItem("Maio");
		comboMonth.addItem("Junho");
		comboMonth.addItem("Julho");
		comboMonth.addItem("Agosto");
		comboMonth.addItem("Setembro");
		comboMonth.addItem("Outubro");
		comboMonth.addItem("Novembro");
		comboMonth.addItem("Dezembro");
	}

	private void InitAddressFields() {
		String addressText = "Endereço";
		addressLabel = new QLabel(addressText, this);
		addressLabel.setFont(new QFont("Tempus Sans ITC", 11));
		addressLabel.move(300, 180);

		addressField = new QLineEdit(this);
		addressField.resize(250, 25);
		addressField.move(460, 180);
	}

	private void InitBooksFields() {
		String booksText = "Livros Favoritos";
		booksLabel = new QLabel(booksText, this);
		booksLabel.setFont(new QFont("Tempus Sans ITC", 11));
		booksLabel.move(300, 390);

		booksField = new QLineEdit(this);
		booksField.resize(250, 25);
		booksField.move(460, 420);
	}

	private void InitDateBirthdayFields() {
		String dateBirthdayText = "Data de Aniversário";
		dateBirthdayLabel = new QLabel(dateBirthdayText, this);
		dateBirthdayLabel.setFont(new QFont("Tempus Sans ITC", 11));
		dateBirthdayLabel.move(300, 300);

		createComoMonth();

		month = new QLabel();
		// comboMonth.currentStringChanged.connect(this, "OnActivated(String)");

		comboMonth.move(490, 300);
		// month.move(520, 300);

		dateBirthdayField = new QLineEdit(this);
		dateBirthdayField.resize(25, 25);
		dateBirthdayField.move(460, 300);
	}

	private void InitEmailsFields() {
		String emailText = "E-mail";
		emailLabel = new QLabel(emailText, this);
		emailLabel.setFont(new QFont("Tempus Sans ITC", 11));
		emailLabel.move(300, 210);

		emailField = new QLineEdit(this);
		emailField.resize(250, 25);
		emailField.move(460, 210);
	}

	private void InitInteretsFields() {
		String interestsText = "Interesses";
		interestsLabel = new QLabel(interestsText, this);
		interestsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		interestsLabel.move(300, 240);

		interestsField = new QLineEdit(this);
		interestsField.resize(250, 25);
		interestsField.move(460, 240);
	}

	private void InitMoviesFields() {
		String moviesText = "Filmes Favoritos";
		moviesLabel = new QLabel(moviesText, this);
		moviesLabel.setFont(new QFont("Tempus Sans ITC", 11));
		moviesLabel.move(300, 360);

		moviesField = new QLineEdit(this);
		moviesField.resize(250, 25);
		moviesField.move(460, 390);
	}

	private void InitMusicsFields() {
		String musicsText = "Músicas Favoritas";
		musicsLabel = new QLabel(musicsText, this);
		musicsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		musicsLabel.move(300, 420);

		musicsField = new QLineEdit(this);
		musicsField.resize(250, 25);
		musicsField.move(460, 360);
	}

	private void InitNameFields() {
		String nameText = "Nome";
		nameLabel = new QLabel(nameText, this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));
		nameLabel.move(300, 150);

		nameField = new QLineEdit(this);
		nameField.resize(250, 25);
		nameField.move(460, 150);
	}

	private void InitSexFields() {
		String sexText = "Sexo";
		sexLabel = new QLabel(sexText, this);
		sexLabel.setFont(new QFont("Tempus Sans ITC", 11));
		sexLabel.move(300, 330);

		QComboBox combo = new QComboBox(this);

		combo.addItem(" ");
		combo.addItem("Feminino");
		combo.addItem("Masculino");
		combo.move(460, 330);
	}

	private void InitWhoIAmFields() {
		String whoIAmText = "Quem Sou Eu";
		whoIAmLabel = new QLabel(whoIAmText, this);
		whoIAmLabel.setFont(new QFont("Tempus Sans ITC", 11));
		whoIAmLabel.move(300, 270);

		whoIAmField = new QLineEdit(this);
		whoIAmField.resize(250, 25);
		whoIAmField.move(460, 270);
	}

	private void OnActivated(String text) {
		month.setText(text);
		month.adjustSize();
	}

	@SuppressWarnings("unused")
	private void onToggled() {
		if (register.isChecked()) {
			// TODO System.out.println("register"); } }
		}
	}
}