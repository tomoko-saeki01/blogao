package br.edu.ufcg.blogao;

import br.edu.ufcg.blogao.webservice.HelperServer;

public class Blogao {

	/**
	 * Starts Blogao application starting web service.
	 * 
	 * The WSDL is provided at <a href="http://localhost:8080/blogao?wsdl">http://localhost:8080/blogao?wsdl</a>
	 * @param args
	 */
	public static void main(String[] args) {
		HelperServer.startServer("http://localhost:8080/blogao");
	}
}