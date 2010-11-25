package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.user.UserIF;

import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QWidget;

public class FrameBlogao extends QWidget {

	private Blogao blogao;
	@SuppressWarnings("unused")
	private UserIF userLoggedOn;

	public FrameBlogao() {

	}

	public boolean authenticate(String login, String password) {
		/*
		 * UserImpl user = (UserImpl)blogao.getUser(login); if (user == null) {
		 * return false; } if (user.getPassword().equals(password)) {
		 * userLoggedOn = user; //TODO ABRIR A TELA INICIAL DO SISTEMA return
		 * true; }
		 */
		return false;
	}

	public void displayMessage(String string) {
		// TODO testar se ta certo!!
		QMessageBox.critical(this, "Error", string);
	}

	public void openNewFrame(QWidget frame) {
		
	}

	public void openWindow(QWidget frame) {
		frame.setVisible(true);
		// TODO terminar metodo.
	}

	public void registerUser() {
		blogao.createUser();		
	}
}