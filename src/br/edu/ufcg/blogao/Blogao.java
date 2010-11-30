package br.edu.ufcg.blogao;

import br.edu.ufcg.blogao.webservice.HelperServer;

/**
 * Main class for run Blogao Web Service.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.2
 */
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