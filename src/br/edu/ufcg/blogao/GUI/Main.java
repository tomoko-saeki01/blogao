package br.edu.ufcg.blogao.GUI;
import com.trolltech.qt.gui.*;

public class Main extends QWidget { 
    public static void main(String args[]) {
    	QApplication.initialize(args);
    	new LoginFrame();
        //new RegisterUserFrame();
        QApplication.exec();
    }
}