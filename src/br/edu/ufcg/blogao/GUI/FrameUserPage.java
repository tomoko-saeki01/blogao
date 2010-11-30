package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameUserPage extends QWidget {
	private QLabel nameLabel, addressLabel, emailLabel, interestsLabel,
			moviesLabel, musicsLabel, booksLabel, whoIAmLabel, sexLabel,
			dateBirthdayLabel;

	private QLineEdit nameField, addressField, emailField, birthDayField,
			sexField;

	private QTextEdit interestsField, moviesField, musicsField, booksField,
			whoIAmField;

	private QComboBox blogs;
	private QPushButton createBlogButton, cancelButton;

	private FrameContainer container = FrameContainer.getInstance();

	public FrameUserPage() {
		resize(1200, 700);
		try {
			initObjects();
			resizeObjects();
			positionsObjects();
			actionsObjects();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void actionsObjects() {
		cancelButton.clicked.connect(this, "closeFrame()");
		createBlogButton.clicked.connect(this, "createBlog()");
	}

	@SuppressWarnings("unused")
	private void closeFrame() {
		close();
		container.getLayout().removeWidget(container.getActualRegisterFrame());
		container.getLayout().addWidget(container.getNewLoginFrame());
	}
	
	@SuppressWarnings("unused")
	private void createBlog() {
		close();
		container.getLayout().removeWidget(container.getActualUserFrame());
		container.getLayout().addWidget(container.getNewCreationBlogFrame());
	}
	
	private void initObjects() {
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
		sexField = new QLineEdit(this);
		nameField = new QLineEdit(this);
		addressField = new QLineEdit(this);
		emailField = new QLineEdit(this);

		interestsField = new QTextEdit(this);
		moviesField = new QTextEdit(this);
		musicsField = new QTextEdit(this);
		booksField = new QTextEdit(this);
		whoIAmField = new QTextEdit(this);

		createBlogButton = new QPushButton("Criar Blog", this);
		createBlogButton.setIcon(new QIcon("pictures/right.png"));
		cancelButton = new QPushButton("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}

	private void resizeObjects() {
		nameField.resize(330, 25);
		emailField.resize(328, 25);
		addressField.resize(307, 25);
		interestsField.resize(200, 150);
		moviesField.resize(200, 150);
		musicsField.resize(200, 150);
		booksField.resize(200, 150);
		whoIAmField.resize(320, 300);

		createBlogButton.maximumSize();
		cancelButton.maximumSize();
	}
	
	@SuppressWarnings("unused")
	private void registerUser() throws Exception {
		String name = nameField.text();
		String address = addressField.text();
		String email = emailField.text();
		String interests = interestsField.toPlainText();
		String whoIAm = whoIAmField.toPlainText();
		String movies = moviesField.toPlainText();
		String musics = musicsField.toPlainText();
		String books = booksField.toPlainText();

		/*
		 * if (!password.equals(confirmPassword)) {
		 * frameBlogao.displayMessageErro("Erro",
		 * "Senhas diferentes. Por favor insere-as novamente!");
		 * passwordField.clear(); confirmPasswordField.clear();
		 * 
		 * } else if (login.trim().equals("")){
		 * frameBlogao.displayMessageErro("Erro",
		 * "Um login deve ser inserido."); loginField.clear(); } try { //soh
		 * teste de telar, nao precisa desse metodo.
		 * //frameBlogao.registerUser(login, password, name, email, sex, dateB,
		 * // address, interests, whoIAm, movies, musics, books);
		 * frameBlogao.displayMessageInformation("Informação",
		 * "Cadastro feito com sucesso!"); } catch (Exception e) {
		 * frameBlogao.displayMessageErro("Erro", e.getMessage()); //TODO achar
		 * o modo certo de limpar o campo certo! }
		 */
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;

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

		nameField.move(w + 50, h + 67);

		birthDayField.move(w + 140, h + 100);

		sexField.move(w + 50, h + 127);

		emailField.move(w + 50, h + 160);
		addressField.move(w + 70, h + 192);
		interestsField.move(w + 500, h + 33);
		moviesField.move(w + 500, h + 250);
		musicsField.move(w + 800, h + 250);
		booksField.move(w + 800, h + 33);
		whoIAmField.move(w + 50, h + 275);

		createBlogButton.move(w + 850, h + 500);
		cancelButton.move(w + 930, h + 500);
	}
}