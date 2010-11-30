package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogCreation extends QWidget {
	private QLabel nameLabel, descriptionLabel;
	private QLineEdit nameField;
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
		String name = nameField.text();
		String description = descriptionField.toPlainText();
		
		if (name.trim().equals("")) {
			displayMessageErro("Erro", "Nome deve ser preenchido.");
			nameField.clear();
		} else {
			try {
				//TODO it.
				//container.getBlog().createBlog(sessionId, name, description);
				displayMessageInformation("Informa��o", "Blog criado com sucesso!");
				closeFrame();
			} catch (Exception e) {
				//TODO it.
			}
		}
	}

	private void closeFrame() {
		close();
		//TODO fix it!
		container.getLayout().removeWidget(container.getActualCreationBlogFrame());
		//container.getLayout().addWidget(container.getNewLoginFrame());
	}

	private void initObjects() {
		nameLabel = new QLabel("Nome", this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));

		descriptionLabel = new QLabel("Descri��o", this);
		descriptionLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		nameField = new QLineEdit(this);
		descriptionField = new QTextEdit(this);
		
		registerButton = new QPushButton("Criar");
		registerButton.setIcon(new QIcon("pictures/right.png"));
		
		cancelButton = new QPushButton("Cancelar");
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		nameLabel.move(w, h);
		descriptionLabel.move(w, h + 40);

		nameField.move(w + 65, h);
		descriptionField.move(w + 65, h + 38);
		
		registerButton.move(w + 70, h + 60);
		cancelButton.move(w  + 150, h + 60);
	}

	private void resizeObjects() {
		nameField.resize(329, 25);
		descriptionField.resize(329, 150);
		registerButton.maximumSize();
		cancelButton.maximumSize();
	}

	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}