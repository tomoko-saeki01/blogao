package br.edu.ufcg.blogao.GUI;

public class FrameContainer {
	
	private static FrameContainer singleton;
	private FrameLogin frameLogin;
	private FrameRegister frameRegister;
	
	private FrameContainer() {
		frameLogin = new FrameLogin();
		frameRegister = new FrameRegister();
	}
	
	public static FrameContainer getInstance() {
		if (singleton == null) {
			singleton = new FrameContainer();
		}
		return singleton;
	}
	
	public FrameLogin getLoginFrame() {
		return frameLogin;
	}
	
	public FrameRegister getRegisterFrame() {
		return frameRegister;
	}

}
