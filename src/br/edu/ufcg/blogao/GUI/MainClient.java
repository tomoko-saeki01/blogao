package br.edu.ufcg.blogao.GUI;

import br.edu.ufcg.blogao.webservice.BlogWS;

public class MainClient {
	
	public static void main(String[] args) {
		
		BlogWS blog = HelperClient.getInstance("http://localhost:8080/blogao");
		try {
			blog.isUserLogged("blogao");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//QApplication.initialize(args);
		//new FrameLogin(blog);
		//QApplication.exec();
	}
}