package br.edu.ufcg.blogao;

import br.edu.ufcg.blogao.webservice.HelperServer;

public class Blogao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelperServer.startServer("http://localhost:8080/blogao");
	}

}
