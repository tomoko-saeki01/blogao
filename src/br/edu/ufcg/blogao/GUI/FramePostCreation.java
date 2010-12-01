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
		postButton.clicked.connect(this, "createPost()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}
	
	private void closeFrame() {
		close();
		//TODO fix it!
		container.getLayout().removeWidget(container.getActualCreationPostFrame());
		container.getLayout().addWidget(container.getNewBlogFrame());
	}

	@SuppressWarnings("unused")
	private void createPost() throws Exception {
		String title = titleField.text();
		String text = textField.toPlainText();
		
		if (title.trim().equals("")) {
			displayMessageErro("Erro", "Título deve ser preenchido.");
			titleField.clear();
		} else {
			try {
				//TODO it.
				container.getBlog().createPost(container.getActualSession(), container.getCurrentBlogId(), title,
						text);
				displayMessageInformation("Informação", "Post criado com sucesso!");
				closeFrame();
			} catch (Exception e) {
				//TODO it.
			}
		}
	}
	
	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}

	private void initObjects() {
		titleLabel = new QLabel("Título", this);
		titleLabel.setFont(new QFont("Tempus Sans ITC", 11));

		textLabel = new QLabel("Descrição", this);
		textLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		titleField = new QLineEdit(this);
		
		textField = new QTextEdit(this);
		
		postButton = new QPushButton("Postar", this);
		postButton.setIcon(new QIcon("pictures/right.png"));
		
		cancelButton = new QPushButton("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		titleLabel.move(w, h);
		textLabel.move(w, h + 37);

		titleField.move(w + 100, h);
		textField.move(w + 100, h + 35);
		
		//TODO it.
		postButton.move(w + 100, h + 200);
		cancelButton.move(w + 180, h + 200);
	}

	private void resizeObjects() {
		titleField.resize(329, 25);
		textField.resize(200, 150);
		postButton.maximumSize();
		cancelButton.maximumSize();
	}
}