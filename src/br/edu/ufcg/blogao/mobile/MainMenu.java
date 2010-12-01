package br.edu.ufcg.blogao.mobile;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class MainMenu extends MIDlet implements CommandListener {
	
	//Coisas a serem exibidas no menu
	private static final String USER_INFO = "Visualizar Perfil";
	private static final String MANAGE_BLOG = "Gerenciador de Blogs";
	private static final String ABOUT = "Sobre";
	private static final String EXIT = "Sair";
	
	private static final int USER_ITEM = 0;
	private static final int MANAGE_BLOG_ITEM = 1;
	private static final int ABOUT_ITEM = 2;
	private static final int EXIT_ITEM = 3;
	
	//Menu About
	private static final String DESCRIPTION = "Trata-se de um sistema desenvolvido para" +
			" a disciplina Sistema de Informação I, 2010.2, da Universidade Federal de " +
			"Campina Grande (UFCG).";
	private static final String DEVELOPERS = "Caio Paes -  \nCarlos Arthur - " +
			"\nCatharine Quintans - \nFracisco Demontie - 20911084\nMatheus Araujo - ";
	private static final String VERSION = "1.0 - 28/11/2010";
	
	String user;
	private boolean logged;
	
	Command enterCmd;
	Command exitCmd;
	Command saveCmd;
	Command backCmd;
	static List options;
	
	 // Display
    private static Display display;
    // Main form
    private static Form form;
	
    static MainMenu midlet;

    BlogMenu blogMenu;
    
	public MainMenu() {
		logged = false;
		user = "";
		display = Display.getDisplay(this);    
        display.setCurrent(form);
        midlet = this;
        
        blogMenu = new BlogMenu();
        
		options = new List("Blogao", List.IMPLICIT);
		options.append(USER_INFO, null);
		options.append(MANAGE_BLOG, null);
		options.append(ABOUT, null);
		options.append(EXIT, null);
		
		enterCmd = new Command("Selecionar", Command.ITEM, 0);
		exitCmd = new Command("Sair", Command.BACK, 0);
		saveCmd = new Command("Salvar", Command.ITEM, 0);
		backCmd = new Command("Voltar", Command.BACK, 0);
		
		options.addCommand(enterCmd);
		options.addCommand(exitCmd);
		//options.setSelectCommand(enterCmd);
		options.setCommandListener(this);
	    login();
	}
	
	public void commandAction(Command command, Displayable d) {
		if (command == exitCmd){
			if (getDisplay().getCurrent().equals(options))
				exitMIDlet();
		}
		if (command == backCmd){
			switch (options.getSelectedIndex()){
				case USER_ITEM:
					getDisplay().setCurrent(options);
					break;
				case MANAGE_BLOG_ITEM:
					getDisplay().setCurrent(options);
					break;
				case ABOUT_ITEM:
					getDisplay().setCurrent(options);
					break;
				default:
					break;
					//sair
			}
		}
		if (command == enterCmd){
			if (logged){
				switch (options.getSelectedIndex()) {
				case USER_ITEM:
					userInformation();
					break;
				case MANAGE_BLOG_ITEM:
					blogMenu.show();
					break;
				case ABOUT_ITEM:
					aboutMenu();
					break;
				case EXIT_ITEM:
					exitMIDlet();
					break;
				}
			}else{
				if (Login.checkLogin()){
					getDisplay().setCurrent(options);
					logged = true;
				}
			}
		}
	}
	
	public void destroyApp(boolean unconditional) {
    	notifyDestroyed();
    }
 
    public void exitMIDlet() {
        display.setCurrent(null);
        notifyDestroyed();
    }
    
	protected void pauseApp() {}

	protected void startApp() throws MIDletStateChangeException {}

	public static Display getDisplay() {
		return display;
	}
	
	public static List getOptions() {
		return options;
	}
	
	private void login() {
		Form loginWindow = Login.getForm();
	    loginWindow.addCommand(enterCmd);
	    loginWindow.setCommandListener(this);
	    user = Login.getNameBox().getString();
	    getDisplay().setCurrent(loginWindow);
	}
	
	private void userInformation() {
		Form userInfo = new Form("Informacoes do Usuario");
		userInfo.addCommand(backCmd);
		userInfo.append(new StringItem("Nome:", user)); //so pra testes XD
		userInfo.append(new StringItem("E-mail:", "emaildousuario@dominio.com"));
		userInfo.append(new StringItem("Sexo:", "Masculino/Feminino"));
		userInfo.append(new StringItem("Quem sou eu:", "Breve descricao" +
				" feita pelo usuario."));
		userInfo.setCommandListener(this);
		getDisplay().setCurrent(userInfo);
	}
	
	/**
	 * Exibe o menu "Sobre"
	 */
	private void aboutMenu() {
		Form about = new Form("Sobre");
		about.addCommand(backCmd);
		about.append(new StringItem("Descricao:", DESCRIPTION));
		about.append(new StringItem("Desenvolvedores:", DEVELOPERS));
		about.append(new StringItem("Versao:", VERSION));
		about.setCommandListener(this);
		getDisplay().setCurrent(about);
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}
	
}
