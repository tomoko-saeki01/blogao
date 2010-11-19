package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.core.QDate;
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
			emailField, interestsField, whoIAmField, musicsField, moviesField,
			booksField;
	private QComboBox comboMonth, comboDay, comboYear;
	private QLabel month, sex;

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

	private void createComboDay() {
		comboDay = createComboBox();
		comboDay.addItem("Dia");
		// TODO
	}

	private void createComboYear() {
		comboYear = createComboBox();
		comboYear.addItem("Ano");
		QDate date = new QDate();

		@SuppressWarnings("static-access")
		int year = date.currentDate().year();
		for (int i = 1960; i <= year; i++) {
			comboYear.addItem("" + i);
		}
	}

	private void createComboMonth() {
		comboMonth = createComboBox();
		comboMonth.addItem("Mês");
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
		addressLabel = createLabel(addressText);
		addressLabel.setFont(new QFont("Tempus Sans ITC", 11));
		addressLabel.move(300, 180);

		addressField = createLineEdit();
		addressField.resize(250, 25);
		addressField.move(460, 180);
	}

	private void InitBooksFields() {
		String booksText = "Livros Favoritos";
		booksLabel = createLabel(booksText);
		booksLabel.setFont(new QFont("Tempus Sans ITC", 11));
		booksLabel.move(300, 390);

		booksField = createLineEdit();
		booksField.resize(250, 25);
		booksField.move(460, 420);
	}

	private void InitDateBirthdayFields() {
		String dateBirthdayText = "Data de Aniversário";
		dateBirthdayLabel = createLabel(dateBirthdayText);
		dateBirthdayLabel.setFont(new QFont("Tempus Sans ITC", 11));
		dateBirthdayLabel.move(300, 300);

		createComboDay();
		createComboMonth();
		createComboYear();

		month = createLabel("");
		comboMonth.currentStringChanged.connect(this,
				"OnActivatedMonth(String)");

		comboDay.move(460, 300);
		comboMonth.move(505, 300);
		comboYear.move(584, 300);
	}

	private void InitEmailsFields() {
		String emailText = "E-mail";
		emailLabel = createLabel(emailText);
		emailLabel.setFont(new QFont("Tempus Sans ITC", 11));
		emailLabel.move(300, 210);

		emailField = createLineEdit();
		emailField.resize(250, 25);
		emailField.move(460, 210);
	}

	private void InitInteretsFields() {
		String interestsText = "Interesses";
		interestsLabel = createLabel(interestsText);
		interestsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		interestsLabel.move(300, 240);

		interestsField = createLineEdit();
		interestsField.resize(250, 25);
		interestsField.move(460, 240);
	}

	private void InitMoviesFields() {
		String moviesText = "Filmes Favoritos";
		moviesLabel = createLabel(moviesText);
		moviesLabel.setFont(new QFont("Tempus Sans ITC", 11));
		moviesLabel.move(300, 360);

		moviesField = createLineEdit();
		moviesField.resize(250, 25);
		moviesField.move(460, 390);
	}

	private void InitMusicsFields() {
		String musicsText = "Músicas Favoritas";
		musicsLabel = createLabel(musicsText);
		musicsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		musicsLabel.move(300, 420);

		musicsField = createLineEdit();
		musicsField.resize(250, 25);
		musicsField.move(460, 360);
	}

	private void InitNameFields() {
		String nameText = "Nome";
		nameLabel = createLabel(nameText);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));
		nameLabel.move(300, 150);

		nameField = createLineEdit();
		nameField.resize(250, 25);
		nameField.move(460, 150);
	}

	private void InitSexFields() {
		String sexText = "Sexo";
		sexLabel = createLabel(sexText);
		sexLabel.setFont(new QFont("Tempus Sans ITC", 11));
		sexLabel.move(300, 330);

		QComboBox combo = createComboBox();

		combo.addItem("Sexo");
		combo.addItem("Feminino");
		combo.addItem("Masculino");
		combo.move(460, 330);
	}

	private void InitWhoIAmFields() {
		String whoIAmText = "Quem Sou Eu";
		whoIAmLabel = createLabel(whoIAmText);
		whoIAmLabel.setFont(new QFont("Tempus Sans ITC", 11));
		whoIAmLabel.move(300, 270);

		whoIAmField = createLineEdit();
		whoIAmField.resize(250, 25);
		whoIAmField.move(460, 270);
	}

	private QComboBox createComboBox() {
		return new QComboBox(this);
	}

	private QLabel createLabel(String text) {
		return new QLabel(text, this);
	}

	private QLineEdit createLineEdit() {
		return new QLineEdit(this);
	}

	@SuppressWarnings("unused")
	private void OnActivatedMonth(String text) {
		month.setText(text);
	}

	@SuppressWarnings("unused")
	private void OnActivatedSex(String text) {
		sex.setText(text);
	}

	@SuppressWarnings("unused")
	private void onToggled() {
		if (register.isChecked()) {
			// TODO System.out.println("register"); } }
		}
	}
}