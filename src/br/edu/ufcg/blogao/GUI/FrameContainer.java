package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.webservice.BlogWS;

import com.trolltech.qt.gui.QGridLayout;

public class FrameContainer {
	private static FrameContainer singleton;
	private FrameLogin frameLogin;
	private FrameRegister frameRegister;
	private FrameBlogCreation frameCreationBlog;
	private FrameEditProfile frameEditProfile;
	private FrameUserPage frameUser;
	private FramePostCreation frameCreationPost;
	private QGridLayout layout;
	private BlogWS blog = HelperClient
			.getInstance("http://localhost:8080/blogao");
	public String sessionId;
	public final String PASSWORD = "senha";
	public final String LOGIN = "login";
	public final String NAME = "nome_exibicao";
	public final String EMAIL = "email";
	public final String SEX = "sexo";
	public final String DATE_BIRTHDAY = "dataNasc";
	public final String ADDRESS = "endereco";
	public final String INTERESTS = "interesses";
	public final String WHO_I_AM = "quem_sou_eu";
	public final String MOVIES = "filmes";
	public final String MUSICS = "musicas";
	public final String BOOKS = "livros";
	
	public final String TITLE = "titulo";
	public final String AUTHOR = "dono";
	public final String DESCRIPTION = "descricao";
	
	public final String MALE = "Masculino";
	public final String FEMALE = "Feminino";
	public final String UNINFORMED = "Não informado";

	private FrameContainer() {
	}

	public static FrameContainer getInstance() {
		if (singleton == null) {
			singleton = new FrameContainer();
		}
		return singleton;
	}

	public FrameBlogCreation getActualCreationBlogFrame() {
		return frameCreationBlog;
	}

	public FramePostCreation getActualCreationPostFrame() {
		return frameCreationPost;
	}

	public FrameEditProfile getActualEditProfielFrame() {
		return frameEditProfile;
	}
	
	public FrameLogin getActualLoginFrame() {
		return frameLogin;
	}

	public FrameRegister getActualRegisterFrame() {
		return frameRegister;
	}

	public String getActualSession() {
		return sessionId;
	}

	public FrameUserPage getActualUserFrame() {
		return frameUser;
	}

	public BlogWS getBlog() {
		return blog;
	}

	public QGridLayout getLayout() {
		if (layout == null)
			layout = new QGridLayout();
		return layout;
	}

	public FrameBlogCreation getNewCreationBlogFrame() {
		frameCreationBlog = new FrameBlogCreation();
		return frameCreationBlog;
	}
	
	public FrameEditProfile getNewEditProfileFrame() throws Exception {
		frameEditProfile = new FrameEditProfile();
		return frameEditProfile;
	}

	public FrameLogin getNewLoginFrame() {
		frameLogin = new FrameLogin();
		return frameLogin;
	}

	public FrameRegister getNewRegisterFrame() {
		frameRegister = new FrameRegister();
		return frameRegister;
	}

	public FrameUserPage getNewUserFrame() {
		frameUser = new FrameUserPage();
		return frameUser;
	}

	public void setActualSession(String id) {
		this.sessionId = id;
	}
}