package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QBrush;
import com.trolltech.qt.gui.QCloseEvent;
import com.trolltech.qt.gui.QColor;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLinearGradient;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPalette;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private FrameContainer container = FrameContainer.getInstance();

	public FrameBlogao() {
		setWindowTitle("Blogão");
		init();
		setColor();
		openFrameLogin();
	}

	@Override
	public void closeEvent(QCloseEvent event) {
		if (askOnExit()) {
			try {
				container.getBlog().logoff(container.getActualSession());
			} catch (Exception e) {
				// TODO: handle exception
			}
			event.accept();
		} else {
			event.ignore();
		}
	}
	
	private boolean askOnExit()
    {
		QMessageBox.StandardButton ret = QMessageBox.warning(this, tr("Application"),
				tr("Deseja realmente sair?"),
				new QMessageBox.StandardButtons(QMessageBox.StandardButton.Ok,
						QMessageBox.StandardButton.Cancel));
		if (ret == QMessageBox.StandardButton.Cancel) {
			return false;
		}
        return true;
    }
	
	private void openFrameLogin() {
		container.getLayout().addWidget(container.getNewLoginFrame());
	}

	@SuppressWarnings("unused")
	private void openFrameRegister() {
		container.getLayout().addWidget(container.getNewRegisterFrame());
	}

	private void init() {
		setWindowIcon(new QIcon("pictures/icon.png"));
		setLayout(container.getLayout());
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
		FrameBlogao app = new FrameBlogao();
		app.showMaximized();
		QApplication.exec();
	}
}