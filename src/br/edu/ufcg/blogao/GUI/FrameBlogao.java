package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.user.UserIF;
import br.edu.ufcg.blogao.user.UserImpl;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private Blogao blogao;
	private UserIF userLoggedOn;
	
	public FrameBlogao() {
	
	}
	
	public boolean authenticate(String login, String password) {
        UserImpl user = (UserImpl)blogao.getUser(login);
        if (user == null) {
            return false;
        }
        if (user.getPassword().equals(password)) {
            userLoggedOn = user;
            //TODO ABRIR A TELA INICIAL DO SISTEMA
            return true;
        }
        return false;
    }

	public void openWindow(QWidget frame) {
		frame.setVisible(true);
		// TODO terminar metodo.
	}

	public static void main(String[] args) {
		QApplication.initialize(args);
		FrameBlogao blogao = new FrameBlogao();
		blogao.setVisible(true);
		QApplication.exec();
	}

	public void displayMessage(String string) {
		//TODO testar se ta certo!!
		QMessageBox.critical(this, "Error", string);
	}
}