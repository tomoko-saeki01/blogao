package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class FrameUserPage extends QWidget {
	private QComboBox blogs;
	private QPushButton createBlogButton, cancelButton, editProfileButton;

	private FrameContainer container = FrameContainer.getInstance();

	public FrameUserPage() {
		resize(1200, 700);

		init();
		resize();
		positions();
		actionsObjects();
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

	private void init() {
		createBlogButton = new QPushButton("Criar Blog", this);
		createBlogButton.setIcon(new QIcon("pictures/right.png"));

		cancelButton = new QPushButton("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));

		editProfileButton = new QPushButton("Editar Perfil", this);
		editProfileButton.setIcon(new QIcon("pictures/edit.png"));
	}

	private void resize() {
		createBlogButton.maximumSize();
		cancelButton.maximumSize();
	}

	private void positions() {
		int w = 100;
		int h = 100;

		createBlogButton.move(w + 850, h + 500);
		cancelButton.move(w + 930, h + 500);
	}
}