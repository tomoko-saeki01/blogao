package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.webservice.BlogWS;

import com.trolltech.qt.gui.QGridLayout;
import com.trolltech.qt.gui.QWidget;


public class FrameContainer {
	private static FrameContainer singleton;
	private FrameLogin frameLogin;
	private FrameRegister frameRegister;
	private FrameBlogCreation frameCreationBlog;
	private FrameUserPage frameUser;
	private FramePostCreation frameCreationPost;
	private QGridLayout layout;
	private BlogWS blog = HelperClient.getInstance("http://localhost:8080/blogao");
	private String sessionId;
	
	private FrameContainer() {}
	
	public static FrameContainer getInstance() {
		if (singleton == null) {
			singleton = new FrameContainer();
		}
		return singleton;
	}
	
	public FrameLogin getNewLoginFrame() {
		frameLogin = new FrameLogin();
		return frameLogin;
	}
	
	public FrameRegister getNewRegisterFrame() {
		frameRegister = new FrameRegister(); 
		return frameRegister;
	}
	
	public FrameLogin getActualLoginFrame() {
		return frameLogin;
	}
	
	public FrameRegister getActualRegisterFrame() {
		return frameRegister;
	}
	
	public FrameBlogCreation getNewCreationBlogFrame() {
		frameCreationBlog = new FrameBlogCreation();
		return frameCreationBlog;
	}
	
	public FrameBlogCreation getActualCreationBlogFrame() {
		return frameCreationBlog;
	}
	
	public QGridLayout getLayout() {
		if (layout == null)
			layout = new QGridLayout();
		return layout;
	}
	
	public BlogWS getBlog() {
		return blog;
	}
	
	public void setActualSession(String id) {
		this.sessionId = id;
	}
	
	public String getActualSession() {
		return sessionId;
	}

	public QWidget getActualUserFrame() {
		return frameUser;
	}
	
	public QWidget getNewUserFrame() {
		frameUser = new FrameUserPage();
		return frameUser;
	}

	public FramePostCreation getActualCreationPostFrame() {
		return frameCreationPost;
	}
}