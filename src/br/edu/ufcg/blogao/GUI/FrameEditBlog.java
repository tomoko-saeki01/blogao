package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameEditBlog extends QWidget {
	private QLabel nameLabel, descriptionLabel;
	private QLineEdit nameField;
	private QTextEdit descriptionField;
	private QPushButton createButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();

	public FrameEditBlog() {
		resize(1200, 700);

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();
	}

	private void actionsObjects() {
		createButton.clicked.connect(this, "editBlog()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}

	@SuppressWarnings("unused")
	private void editBlog() throws Exception {
		String name = nameField.text();
		String description = descriptionField.toPlainText();
		
		if (name.trim().equals("")) {
			displayMessageErro("Erro", "Nome deve ser preenchido.");
			nameField.clear();
		} else {
			
			container.getBlog().changeBlogInformation(container.getActualSession(), container.getCurrentBlogId(), container.TITLE, name);
			container.getBlog().changeBlogInformation(container.getActualSession(), container.getCurrentBlogId(), container.DESCRIPTION, description);
			displayMessageInformation("Informação", "Blog editado com sucesso!");
			closeFrame();

		}
	}

	private void closeFrame() {
		close();
		//TODO fix it!
		container.getLayout().removeWidget(container.getActualEditBlogFrame());
		container.getLayout().addWidget(container.getNewUserFrame());
	}

	private void initObjects() {
		nameLabel = new QLabel("Nome", this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));

		descriptionLabel = new QLabel("Descrição", this);
		descriptionLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		nameField = new QLineEdit(this);
		descriptionField = new QTextEdit(this);
		
		createButton = new QPushButton("Confirmar", this);
		createButton.setIcon(new QIcon("pictures/refresh.png"));
		
		cancelButton = new QPushButton("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
		
		getUserData();
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		nameLabel.move(w, h);
		descriptionLabel.move(w, h + 40);

		nameField.move(w + 65, h);
		descriptionField.move(w + 65, h + 38);
		
		createButton.move(w + 70, h + 200);
		cancelButton.move(w  + 150, h + 200);
	}

	private void resizeObjects() {
		nameField.resize(329, 25);
		descriptionField.resize(329, 150);
		createButton.maximumSize();
		cancelButton.maximumSize();
	}

	private void getUserData() {
		try {
			String name = container.getBlog().getBlogInformation(container.getCurrentBlogId(), container.TITLE);
			String description = container.getBlog().getBlogInformation(container.getCurrentBlogId(), container.DESCRIPTION);
			nameField.setText(name);
			descriptionField.setText(description);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}