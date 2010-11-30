package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FramePostCreation extends QWidget {
	private QLabel titleLabel, textLabel;
	private QLineEdit titleField;
	private QTextEdit textField;
	private QPushButton postButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();

	public FramePostCreation() {
		resize(1200, 700);

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();
	}

	private void actionsObjects() {
		postButton.clicked.connect(this, "createBlog()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}

	@SuppressWarnings("unused")
	private void createBlog() throws Exception {
		String title = titleField.text();
		String text = textField.toPlainText();
		
		if (title.trim().equals("")) {
			displayMessageErro("Erro", "Título deve ser preenchido.");
			titleField.clear();
		} else {
			try {
				//TODO it.
				//container.getBlog().createPost(sessionId, name, description);
				displayMessageInformation("Informação", "Post criado com sucesso!");
				closeFrame();
			} catch (Exception e) {
				//TODO it.
			}
		}
	}

	private void closeFrame() {
		close();
		//TODO fix it!
		container.getLayout().removeWidget(container.getActualCreationPostFrame());
		//container.getLayout().addWidget(container.getNewLoginFrame());
	}

	private void initObjects() {
		titleLabel = new QLabel("Título", this);
		titleLabel.setFont(new QFont("Tempus Sans ITC", 11));

		textLabel = new QLabel("Descrição", this);
		textLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		postButton = new QPushButton("Postar");
		postButton.setIcon(new QIcon("pictures/right.png"));
		
		cancelButton = new QPushButton("Cancelar");
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		titleLabel.move(w, h);
		textLabel.move(w, h + 37);

		titleField.move(w + 50, h);
		textField.move(w + 50, h + 35);
		
		//TODO it.
		//postButton.move();
		//cancelButton.move();
	}

	private void resizeObjects() {
		titleField.resize(329, 25);
		textField.resize(200, 150);
		postButton.minimumSize();
		cancelButton.minimumSize();
	}

	public void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	public void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}