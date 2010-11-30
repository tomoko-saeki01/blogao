package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class FrameUserPage extends QWidget {

	private QComboBox blogs;
	private QPushButton createBlogButton, cancelButton, editProfileButton, goToBlog, deleteBlog;
	private QLabel blogsLabel, dataLabel;
	
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
		editProfileButton.clicked.connect(this, "openEditProfile()");
		deleteBlog.clicked.connect(this, "deleteBlog()");
	}

	@SuppressWarnings("unused")
	private void closeFrame() {
		try {
			container.getBlog().logoff(container.getActualSession());
		} catch (Exception e) {
			// TODO: handle exception
		}
		close();
		container.getLayout().removeWidget(container.getActualUserFrame());
		container.getLayout().addWidget(container.getNewLoginFrame());
	}

	@SuppressWarnings("unused")
	private void createBlog() {
		close();
		container.getLayout().removeWidget(container.getActualUserFrame());
		container.getLayout().addWidget(container.getNewCreationBlogFrame());
	}

	@SuppressWarnings("unused")
	private void deleteBlog() {
		QMessageBox.StandardButton ret = QMessageBox.warning(this, tr("Application"),
				tr("Deseja realmente remover?"),
				new QMessageBox.StandardButtons(QMessageBox.StandardButton.Ok,
						QMessageBox.StandardButton.Cancel));
		if (ret == QMessageBox.StandardButton.Cancel) {
			return;
		}
		try {
			String blogId = container.getBlog().getBlogBySessionId(container.getActualSession(), blogs.currentIndex()).toString();
			container.getBlog().deleteBlog(container.getActualSession(), blogId);
			blogs.clear();
			getUserData();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
        
	}
	
	private void init() {
		createBlogButton = new QPushButton("Criar Blog", this);
		createBlogButton.setIcon(new QIcon("pictures/create.png"));

		cancelButton = new QPushButton("Logoff", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));

		editProfileButton = new QPushButton("Editar Perfil ", this);
		editProfileButton.setIcon(new QIcon("pictures/edit.png"));
		
		goToBlog = new QPushButton("Ir", this);
		
		deleteBlog = new QPushButton("Deletar", this);
		deleteBlog.setIcon(new QIcon("pictures/wrong.png"));
		
		blogsLabel = new QLabel("Blogs:", this);
		dataLabel = new QLabel("Dados", this);
		
		blogs = new QComboBox(this);
		
		getUserData();
		
	}
	
	private void getUserData() {
		try {
			int numberOfBlogs = container.getBlog().getNumberOfBlogsBySessionId(container.getActualSession());
			for (int i = 0; i < numberOfBlogs; i++) {
				String blogId = container.getBlog().getBlogBySessionId(container.getActualSession(), i).toString();
				String blogName = container.getBlog().getBlogInformation(blogId, container.TITLE);
				blogs.addItem(blogName);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@SuppressWarnings("unused")
	private void openEditProfile() throws Exception {
		close();
		container.getLayout().removeWidget(container.getActualUserFrame());
		container.getLayout().addWidget(container.getNewEditProfileFrame());
	}

	private void resize() {
		createBlogButton.maximumSize();
		cancelButton.maximumSize();
		editProfileButton.maximumSize();
		deleteBlog.maximumSize();
		goToBlog.maximumSize();
		blogs.resize(150, 20);
	}

	private void positions() {
		int w = 100;
		int h = 100;

		editProfileButton.move(w + 100, h + 50);
		createBlogButton.move(w + 263, h + 150);
		cancelButton.move(w + 930, h + 500);
		blogs.move(w + 100, h + 150);
		goToBlog.move(w + 100, h + 190);
		deleteBlog.move(w + 200, h + 190);
		blogsLabel.move(w + 80, h + 120);
		dataLabel.move(w + 80, h + 20);
	}
}