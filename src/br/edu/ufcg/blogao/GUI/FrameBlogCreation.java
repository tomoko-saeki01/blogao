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
		registerButton.clicked.connect(this, "createBlog()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}

	@SuppressWarnings("unused")
	private void createBlog() throws Exception {
		String title = titleField.text();
		String description = descriptionField.toPlainText();
		//TODO it.
	}

	@SuppressWarnings("unused")
	private void closeFrame() {
		close();
		//TODO fix it!
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
		
		//registerButton.move();
		//cancelButton.move();
	}

	private void resizeObjects() {
		titleField.resize(329, 25);
		descriptionField.resize(200, 150);
		registerButton.minimumSize();
		cancelButton.minimumSize();
	}

	public void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	public void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}