package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

public class RegisterUserFrame extends QWidget {
	
	private QPushButton register;
	private QLabel loginLabel, passwordLabel, nameLabel, addressLabel,
			emailLabel, interestsLabel, whoIAmLabel, dateBirthdayLabel,
			sexLabel, musicsLabel, moviesLabel, booksLabel;

	public RegisterUserFrame(){
		setWindowTitle("Blogão");
		initUI();
		resize(maximumSize());
		show();
	}	
	
	private void initUI() {
		String nameText = "Nome";
		nameLabel = new QLabel(nameText, this);
		nameLabel.setFont(new QFont("Tempus Sans ITC", 11));
		nameLabel.move(300, 150);
		
		String loginText = "Login";
		loginLabel = new QLabel(loginText, this);
		loginLabel.setFont(new QFont("Tempus Sans ITC", 11));
		loginLabel.move(300, 180);
		
		String passwordText = "Senha";
		passwordLabel = new QLabel(passwordText, this);
		passwordLabel.setFont(new QFont("Tempus Sans ITC", 11));
		passwordLabel.move(300, 210);
		
		String addressText = "Endereço";
		addressLabel = new QLabel(addressText, this);
		addressLabel.setFont(new QFont("Tempus Sans ITC", 11));
		addressLabel.move(300, 240);
		
		String emailText = "E-mail";
		emailLabel = new QLabel(emailText, this);
		emailLabel.setFont(new QFont("Tempus Sans ITC", 11));
		emailLabel.move(300, 270);
		
		String interestsText = "Interesses";
		interestsLabel = new QLabel(interestsText, this);
		interestsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		interestsLabel.move(300, 300);
		
		String whoIAmText = "Quem Sou Eu";
		whoIAmLabel = new QLabel(whoIAmText, this);
		whoIAmLabel.setFont(new QFont("Tempus Sans ITC", 11));
		whoIAmLabel.move(300, 330);
		
		String dateBirthdayText = "Data de Aniversário";
		dateBirthdayLabel = new QLabel(dateBirthdayText, this);
		dateBirthdayLabel.setFont(new QFont("Tempus Sans ITC", 11));
		dateBirthdayLabel.move(300, 360);
		
		String sexText = "Sexo";
		sexLabel = new QLabel(sexText, this);
		sexLabel.setFont(new QFont("Tempus Sans ITC", 11));
		sexLabel.move(300, 390);
		
		String musicsText = "Músicas Favoritas";
		musicsLabel = new QLabel(musicsText, this);
		musicsLabel.setFont(new QFont("Tempus Sans ITC", 11));
		musicsLabel.move(300, 420);
				
		String moviesText = "Filmes Favoritos";
		moviesLabel = new QLabel(moviesText, this);
		moviesLabel.setFont(new QFont("Tempus Sans ITC", 11));
		moviesLabel.move(300, 450);
		
		String booksText = "Livros Favoritos";
		booksLabel = new QLabel(booksText, this);
		booksLabel.setFont(new QFont("Tempus Sans ITC", 11));
		booksLabel.move(300, 480);

	}

	@SuppressWarnings("unused")
	private void onToggled() {
		if (register.isChecked()) {
			// TODO
			System.out.println("register");
		}
	}
}
