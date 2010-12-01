package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.core.QDate;
import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QDateEdit;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameRegister extends QWidget {
	private QLabel loginLabel, passwordLabel, confirmPasswordLabel, nameLabel,
			addressLabel, emailLabel, interestsLabel, moviesLabel, musicsLabel,
			booksLabel, whoIAmLabel, sexLabel, dateBirthdayLabel;

	private QLineEdit loginField, passwordField, confirmPasswordField,
			nameField, addressField, emailField;

	private QTextEdit interestsField, moviesField, musicsField, booksField,
			whoIAmField;

	private QComboBox sexCombo, dayCombo, monthCombo, yearCombo;
	private QPushButton registerButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();

	public FrameRegister() {
		resize(1200, 700);

		init();
		resize();
		positions();
		actionsObjects();
	}

	private void actionsObjects() {
		cancelButton.clicked.connect(this, "closeFrame()");
		registerButton.clicked.connect(this, "registerUser()");	
	}

	private void createComboDay() {
		for (int i = 1; i <= 31; i++) {
			dayCombo.addItem("" + i);
		}
	}

	private void createComboMonth() {
		for (int i = 1; i <= 12; i++) {
			monthCombo.addItem("" + i);
		}
	}

	private void createComboYear() {
		int currentYear = QDate.currentDate().year();
		for (int i = currentYear; i >= 1960; i--) {
			yearCombo.addItem("" + i);
		}
	}

	private void closeFrame() {
		close();
		container.getLayout().removeWidget(container.getActualRegisterFrame());
		container.getLayout().addWidget(container.getNewLoginFrame());
	}

	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}

	private void init() {
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
		passwordField.setEchoMode(QLineEdit.EchoMode.Password);

		confirmPasswordField = new QLineEdit(this);
		confirmPasswordField.setEchoMode(QLineEdit.EchoMode.Password);

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

		dayCombo = new QComboBox(this);
		createComboDay();

		monthCombo = new QComboBox(this);
		createComboMonth();

		yearCombo = new QComboBox(this);
		createComboYear();

		registerButton = new QPushButton("Cadastrar", this);
		registerButton.setIcon(new QIcon("pictures/right.png"));

		cancelButton = new QPushButton("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}

	private void positions() {
		int w = 100;
		int h = 100;
		loginLabel.move(w, h);
		passwordLabel.move(w, h + 37);
		confirmPasswordLabel.move(w + 160, h + 37);
		nameLabel.move(w, h + 67);
		dateBirthdayLabel.move(w, h + 100);
		sexLabel.move(w, h + 127);
		emailLabel.move(w, h + 160);
		addressLabel.move(w, h + 194);
		interestsLabel.move(w + 450, h + 8);
		moviesLabel.move(w + 450, h + 225);
		musicsLabel.move(w + 750, h + 225);
		booksLabel.move(w + 750, h + 8);
		whoIAmLabel.move(w, h + 250);

		loginField.move(w + 50, h);
		passwordField.move(w + 50, h + 35);
		confirmPasswordField.move(w + 280, h + 35);
		nameField.move(w + 50, h + 67);

		dayCombo.move(w + 140, h + 100);
		monthCombo.move(w + 180, h + 100);
		yearCombo.move(w + 220, h + 100);

		sexCombo.move(w + 50, h + 127);

		emailField.move(w + 50, h + 160);
		addressField.move(w + 70, h + 192);
		interestsField.move(w + 500, h + 33);
		moviesField.move(w + 500, h + 250);
		musicsField.move(w + 800, h + 250);
		booksField.move(w + 800, h + 33);
		whoIAmField.move(w + 50, h + 275);

		registerButton.move(w + 850, h + 500);
		cancelButton.move(w + 930, h + 500);
	}

	private void resize() {
		loginField.resize(329, 25);
		passwordField.resize(100, 25);
		confirmPasswordField.resize(100, 25);
		nameField.resize(330, 25);
		emailField.resize(328, 25);
		addressField.resize(307, 25);
		interestsField.resize(200, 150);
		moviesField.resize(200, 150);
		musicsField.resize(200, 150);
		booksField.resize(200, 150);
		whoIAmField.resize(320, 300);

		registerButton.maximumSize();
		cancelButton.maximumSize();
	}

	@SuppressWarnings("unused")
	private void registerUser() throws Exception {
		QDateEdit b = new QDateEdit();
		b.setDisplayFormat("dd/MM/yyyy");
		int y = Integer.parseInt(yearCombo.currentText());
		int m = Integer.parseInt(monthCombo.currentText());
		int d = Integer.parseInt(dayCombo.currentText());
		b.setDate(new QDate(y, m, d));
		
		String login = loginField.text();
		String password = passwordField.text();
		String confirmPassword = confirmPasswordField.text();
		String name = nameField.text();
		String address = addressField.text();
		String email = emailField.text();
		String interests = interestsField.toPlainText();
		String whoIAm = whoIAmField.toPlainText();
		String movies = moviesField.toPlainText();
		String musics = musicsField.toPlainText();
		String books = booksField.toPlainText();
		String sex = sexCombo.currentText();
		String dateB = b.toString();
		
		if (sex.trim().equals("")) {
			sex = "Não informado";
		}

		if (!password.equals(confirmPassword)) {
			displayMessageErro("Erro",
					"Senhas diferentes. Por favor insere-as novamente!");
			passwordField.clear();
			confirmPasswordField.clear();

		} else if (login.trim().equals("")) {
			displayMessageErro("Erro", "Um login deve ser inserido.");
			loginField.clear();
		} else {
			try {
				// soh teste de telar, nao precisa desse metodo.
				container.getBlog().createProfile(login, password, name, email,
						sex, dateB, address, interests, whoIAm, movies, musics,
						books);
				displayMessageInformation("Informação",
						"Cadastro feito com sucesso!");
				closeFrame();
			} catch (Exception e) {
				displayMessageErro("Erro", e.getMessage());
			}
		}
	}
}