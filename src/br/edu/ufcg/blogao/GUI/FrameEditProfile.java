package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.webservice.BlogWS;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameEditProfile extends QWidget {
	private QLabel nameLabel, addressLabel, interestsLabel,
			moviesLabel, musicsLabel, booksLabel, whoIAmLabel, sexLabel,
			dateBirthdayLabel;

	private QLineEdit nameField, addressField, dateBirthdayField;

	private QTextEdit interestsField, moviesField, musicsField, booksField,
			whoIAmField;

	private QComboBox sexCombo, dayCombo, monthCombo, yearCombo;
	private QPushButton refreshButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();

	public FrameEditProfile() throws Exception {
		resize(1200, 700);

		init();
		resize();
		positions();
		actionsObjects();
	}

	private void actionsObjects() {
		refreshButton.clicked.connect(this, "refreshProfile()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}

	private void closeFrame() {
		close();
		container.getLayout().removeWidget(
				container.getActualEditProfielFrame());
		container.getLayout().addWidget(container.getNewUserFrame());
	}

	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}

	private void getUserData() {
		try {
			String interests = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.INTERESTS);
			String movies = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.MOVIES);
			String musics = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.MUSICS);
			String books = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.BOOKS);
			String name = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.NAME);
			String birthDate = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.DATE_BIRTHDAY);
			String address = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.ADDRESS);
			String whoIAm = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.WHO_I_AM);
			String sex = container.getBlog().getProfileInformationBySessionId(container.getActualSession(), container.SEX);
			
			interestsField.setText(interests);
			moviesField.setText(movies);
			musicsField.setText(musics);
			booksField.setText(books);
			nameField.setText(name);
			dateBirthdayField.setText(birthDate);
			addressField.setText(address);
			whoIAmField.setText(whoIAm);
			
			if (sex.equalsIgnoreCase(container.MALE)) {
				sexCombo.setCurrentIndex(2);
			} else if (sex.equalsIgnoreCase(container.FEMALE)) {
				sexCombo.setCurrentIndex(1);
			} else {
				sexCombo.setCurrentIndex(0);
			}
		} catch (Exception e) {
			displayMessageErro("Erro", "A página não pôde ser carregada. Tente novamente.");
			closeFrame();
		}
	}
	
	private void init() {
		nameLabel = new QLabel("Nome", this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));

		addressLabel = new QLabel("Endereço", this);
		addressLabel.setFont(new QFont("Tempus Sans ITC", 11));

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

		dateBirthdayField = new QLineEdit(this);
		nameField = new QLineEdit(this);
		addressField = new QLineEdit(this);

		interestsField = new QTextEdit(this);
		moviesField = new QTextEdit(this);
		musicsField = new QTextEdit(this);
		booksField = new QTextEdit(this);
		whoIAmField = new QTextEdit(this);

		sexCombo = new QComboBox(this);
		sexCombo.addItem("");
		sexCombo.addItem("Feminino");
		sexCombo.addItem("Masculino");

		refreshButton = new QPushButton("Atualizar Perfil ", this);
		refreshButton.setIcon(new QIcon("pictures/refresh.png"));

		cancelButton = new QPushButton("Cancelar ", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
		
		getUserData();
	}

	@SuppressWarnings("unused")
	private void editProfile() {
		String name = nameField.text();
		String address = addressField.text();
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
		addressLabel.move(w, h + 111);
		whoIAmLabel.move(w, h + 165);
		interestsLabel.move(w + 450, h + 8);
		moviesLabel.move(w + 450, h + 225);
		musicsLabel.move(w + 750, h + 225);
		booksLabel.move(w + 750, h + 8);

		nameField.move(w + 50, h);
		dateBirthdayField.move(w + 140, h + 37);
		sexCombo.move(w + 50, h + 74);
		addressField.move(w + 70, h + 111);
		whoIAmField.move(w + 50, h + 200);
		interestsField.move(w + 500, h + 33);
		moviesField.move(w + 500, h + 250);
		musicsField.move(w + 800, h + 250);
		booksField.move(w + 800, h + 33);

		refreshButton.move(w + 820, h + 500);
		cancelButton.move(w + 930, h + 500);
	}

	@SuppressWarnings("unused")
	private void refreshProfile() {
		String name = nameField.text();
		String address = addressField.text();
		String interests = interestsField.toPlainText();
		String whoIAm = whoIAmField.toPlainText();
		String movies = moviesField.toPlainText();
		String musics = musicsField.toPlainText();
		String books = booksField.toPlainText();
		String sex = sexCombo.currentText();
		String dateB = dayCombo.currentText() + "/" + 
		   monthCombo.currentText() + "/" +
		   yearCombo.currentText(); 
		
		if (sex.trim().equals("")) {
			sex = "Não informado";
		}

		try {
			BlogWS blog = container.getBlog();
			String login = container.getActualSession();
			blog.changeProfileInformation(login, container.NAME, name);
			blog.changeProfileInformation(login, container.ADDRESS, address);
			blog.changeProfileInformation(login, container.INTERESTS, interests);
			blog.changeProfileInformation(login, container.WHO_I_AM, whoIAm);
			blog.changeProfileInformation(login, container.MOVIES, movies);
			blog.changeProfileInformation(login, container.MUSICS, musics);
			blog.changeProfileInformation(login, container.BOOKS, books);
			blog.changeProfileInformation(login, container.SEX, sex);
			
			//TODO
			//blog.changeProfileInformation(login, "dataNasc", dateB);
			
			displayMessageInformation("Informação", "Perfil atualizado com sucesso!");
			closeFrame();
		} catch (Exception e) {
			displayMessageErro("Erro", e.getMessage());
			// TODO achar o modo certo de limpar o campo certo!
		}
	}

	private void resize() {
		nameField.resize(330, 25);
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