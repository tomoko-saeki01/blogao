package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private Blogao blogao;
	
	public FrameBlogao() {
		setWindowTitle("Blogão");
		init();
		objectsActions();
		show();
	}

	private void objectsActions() {
		openWindow(new FrameLogin());
		blogao = new Blogao();
	}

	private void openWindow(QWidget f) {
		
	}

	private void init() {
		resize(maximumSize());
		setWindowIcon(new QIcon("pictures/icon.png"));
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		new FrameBlogao();
		QApplication.exec();
	}

	public void registerUser(String login, String password,String name, String email, String sex, String dateB, String address, String interests, String whoIAm, String movies, String musics, String books) throws Exception {
		blogao.registerUser(login,password,name,email,sex, dateB,address, interests, whoIAm, movies, musics, books);		
	}
}