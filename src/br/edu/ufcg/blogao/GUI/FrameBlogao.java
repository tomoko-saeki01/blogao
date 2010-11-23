package br.edu.ufcg.blogao.GUI;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget{
	
	public FrameBlogao() {
		setWindowTitle("Blogão");
		initUI();
		show();
	}
	
	private void initUI() {
		resize(maximumSize());
		
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		FrameBlogao blogao = new FrameBlogao();
		blogao.	setVisible(true);
		QApplication.exec();
	}
	
	
	
}