package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QBrush;
import com.trolltech.qt.gui.QColor;
import com.trolltech.qt.gui.QGridLayout;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLinearGradient;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPalette;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private QGridLayout layout;
	private FrameLogin frameLogin;
	private FrameRegister frameRegister;
		
	public FrameBlogao() {
		setWindowTitle("Blogão");
		init();
		setColor();
		openFrameLogin();
	}
	
	private void openFrameLogin() {
		frameLogin = new FrameLogin();
		layout.addWidget(frameLogin);
	}
	
	@SuppressWarnings("unused")
	private void openFrameRegister() {
		frameRegister = new FrameRegister();
		layout.addWidget(frameRegister);
	}

	private void init() {
		setWindowIcon(new QIcon("pictures/icon.png"));
		layout = new QGridLayout();
		setLayout(layout);	
	}
	
	private void setColor() {
		QPalette palette = new QPalette();
        QLinearGradient gradient = new QLinearGradient(0, 0, 0, this.height());
        gradient.setColorAt(0.0, new QColor("#c5c5c5"));
        gradient.setColorAt(1.0, new QColor("#334c93"));
        palette.setBrush(QPalette.ColorRole.Window, new QBrush(gradient));
        this.setPalette(palette);
	}
	
	public void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	public void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
	
	public static void main(String[] args) {
		QApplication.initialize(args);
		FrameBlogao app = new  FrameBlogao();
		app.showMaximized();		
		QApplication.exec();
	}
}