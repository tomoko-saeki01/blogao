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
	}

	private void openWindow(QWidget f) {		
	}

	private void init() {
		resize(maximumSize());
		setWindowIcon(new QIcon("pictures/icon.png"));
		blogao = new Blogao();
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		new FrameBlogao();
		QApplication.exec();
	}
}