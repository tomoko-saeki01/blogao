package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QScrollArea;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameBlog extends QWidget {
	private QLabel nameLabel, descriptionLabel;
	
	private QTextEdit descriptionField;
	private QPushButton createButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();
	private QScrollArea scrollArea;

	public FrameBlog() {
		resize(1200, 700);

		initObjects();
		resizeObjects();
		positionsObjects();
		actionsObjects();
	}

	private void actionsObjects() {
		createButton.clicked.connect(this, "createPost()");
		cancelButton.clicked.connect(this, "closeFrame()");
	}

	private void createPost() {
		try {

			close();
			container.getLayout().removeWidget(container.getActualBlogFrame());
			container.getLayout().addWidget(container.getNewPostCreationFrame());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void closeFrame() {
		close();
		//TODO fix it!
		container.getLayout().removeWidget(container.getActualBlogFrame());
		container.getLayout().addWidget(container.getNewUserFrame());
	}

	private void initObjects() {
		scrollArea = new QScrollArea(this);
		
		nameLabel = new QLabel("Nome", this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 28));

		descriptionLabel = new QLabel("Descrição", this);
		descriptionLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		
		descriptionField = new QTextEdit(this);
		
		createButton = new QPushButton("Criar Post", this);
		createButton.setIcon(new QIcon("pictures/refresh.png"));
		
		cancelButton = new QPushButton("Voltar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
		
		getUserData();
		scrollArea.setWidget(new FramePosts());
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		nameLabel.move(w + 500, 20);
		descriptionLabel.move(w + 430, h - 20);

		
		descriptionField.move(w + 450, h);
		
		createButton.move(w + 70, h + 200);
		cancelButton.move(w + 150, h + 200);
		
		scrollArea.move(w + 250, h + 110);
	}

	private void resizeObjects() {
		
		descriptionField.resize(220, 90);
		createButton.maximumSize();
		cancelButton.maximumSize();
		scrollArea.resize(600, 500);
	}

	private void getUserData() {
		try {
			String name = container.getBlog().getBlogInformation(container.getCurrentBlogId(), container.TITLE);
			String description = container.getBlog().getBlogInformation(container.getCurrentBlogId(), container.DESCRIPTION);
			nameLabel.setText(name);
			descriptionField.setText(description);
			descriptionField.setEnabled(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}