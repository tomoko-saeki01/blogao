package br.edu.ufcg.blogao.mobile;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

public class BlogMenu implements CommandListener {

	// Coisas a serem exibidas no menu
	private static final String VIEW_BLOGS = "Visualizar Blogs";
	private static final String NEW_COMMENT = "Novo Comentario";
	private static final String BACK = "Voltar";

	private static final int BLOGS_ITEM = 0;
	private static final int COMMENT_ITEM = 1;
	private static final int BACK_ITEM = 2;

	String user;
	private boolean logged;

	Command enterCmd;
	Command exitCmd;
	Command saveCmd;
	Command backCmd;
	List options;

	private String comment;
	private TextBox textBox;
	// Display
	private static Display display;
	// Main form
	private static Form form;

	static BlogMenu midlet;

	public BlogMenu() {
		comment = "";
		display = MainMenu.getDisplay();
		display.setCurrent(form);
		midlet = this;
		// login = new Login();

		options = new List("Blogao", List.IMPLICIT);
		options.append(VIEW_BLOGS, null);
		options.append(NEW_COMMENT, null);
		options.append(BACK, null);

		enterCmd = new Command("Selecionar", Command.ITEM, 0);
		exitCmd = new Command("Voltar", Command.BACK, 0);
		saveCmd = new Command("Salvar", Command.ITEM, 0);
		backCmd = new Command("Voltar", Command.BACK, 0);

		options.addCommand(enterCmd);
		options.addCommand(exitCmd);
		// options.setSelectCommand(enterCmd);
		options.setCommandListener(this);
	}

	public void commandAction(Command command, Displayable d) {
		if (command == exitCmd) {
			backToMainMenu();
		}
		if (command == backCmd) {
			switch (options.getSelectedIndex()) {
			case BLOGS_ITEM:
				getDisplay().setCurrent(options);
				break;
			case COMMENT_ITEM:
				getDisplay().setCurrent(options);
				break;
			case BACK_ITEM:
				getDisplay().setCurrent(options);
				break;
			}
		}
		if (command == enterCmd) {
			if (logged) {
				switch (options.getSelectedIndex()) {
				case 0:
					// userInformation();
					break;
				case 1:
					comment();
					break;
				case BACK_ITEM:
					backToMainMenu();
					break;
				}
			} else {
				if (Login.checkLogin()) {
					getDisplay().setCurrent(options);
					logged = true;
				}
			}
		}
		if (command == saveCmd) {
			if (options.getSelectedIndex() == 1) {
				showText(comment);
			}
		}
	}

	public static Display getDisplay() {
		return display;
	}

	public Displayable getOptions() {
		return options;
	}

	private void comment() {
		textBox = new TextBox("Digite o texto", "", 200, TextField.ANY);
		textBox.addCommand(backCmd);
		textBox.addCommand(saveCmd);
		textBox.setCommandListener(this);
		getDisplay().setCurrent(textBox);
	}

	private void showText(String item) {
		item = textBox.getString();
		Alert alert = new Alert("Texto salvo", item, null, AlertType.INFO);
		alert.addCommand(backCmd);
		alert.setCommandListener(this);
		getDisplay().setCurrent(alert);
	}

	public void backToMainMenu() {
		MainMenu.getDisplay().setCurrent(MainMenu.getOptions());
	}

	public void show() {
		getDisplay().setCurrent(options);
	}
}