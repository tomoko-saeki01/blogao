package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QGridLayout;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private Blogao blogao;
	private QGridLayout layout;

	public FrameBlogao() {
		setWindowTitle("Blogão");
		init();
		objectsActions();		
	}

	private void objectsActions() {
		blogao = new Blogao();
	}
	
	private void init() {
		setWindowIcon(new QIcon("pictures/icon.png"));
		layout = new QGridLayout();
		setLayout(layout);
		layout.addWidget(new FrameLogin());
		showMaximized();
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		new FrameBlogao();
		QApplication.exec();
	}

	public void registerUser(String login, String password, String name,
			String email, String sex, String dateB, String address,
			String interests, String whoIAm, String movies, String musics,
			String books) throws Exception {
		blogao.registerUser(login, password, name, email, sex, dateB, address,
				interests, whoIAm, movies, musics, books);
	}

	public void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	public void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);

	}
}