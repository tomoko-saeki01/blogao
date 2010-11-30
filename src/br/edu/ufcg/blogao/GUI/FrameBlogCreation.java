package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogCreation extends QWidget {
	private QLabel titleLabel, descriptionLabel;
	private QLineEdit titleField;
	private QTextEdit descriptionField;
	private QPushButton registerButton, cancelButton;

	private FrameContainer container = FrameContainer.getInstance();

	public FrameBlogCreation() {
		resize(1200, 700);

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();
	}

	private void actionsObjects() {
	}

	@SuppressWarnings("unused")
	private void registerUser() throws Exception {
		String title = titleField.text();
		String description = descriptionField.toPlainText();

		/*
		 * try { // soh teste de telar, nao precisa desse metodo.
		 * container.getBlog().createProfile(login, password, name, email, sex,
		 * dateB, address, interests, whoIAm, movies, musics, books);
		 * displayMessageInformation("Informação",
		 * "Cadastro feito com sucesso!"); closeFrame(); } catch (Exception e) {
		 * displayMessageErro("Erro", e.getMessage()); // TODO achar o modo
		 * certo de limpar o campo certo! }
		 */
	}

	@SuppressWarnings("unused")
	private void closeFrame() {
		close();
		container.getLayout().removeWidget(container.getActualRegisterFrame());
		container.getLayout().addWidget(container.getNewLoginFrame());
	}

	private void initObjects() {
		titleLabel = new QLabel("Título", this);
		titleLabel.setFont(new QFont("Tempus Sans ITC", 11));

		descriptionLabel = new QLabel("Descrição", this);
		descriptionLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		registerButton = new QPushButton("Criar");
		cancelButton = new QPushButton("Cancelar");
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		titleLabel.move(w, h);
		descriptionLabel.move(w, h + 37);

		titleField.move(w + 50, h);
		descriptionField.move(w + 50, h + 35);
	}

	private void resizeObjects() {
		titleField.resize(329, 25);
		descriptionField.resize(200, 150);
	}

	public void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	public void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}