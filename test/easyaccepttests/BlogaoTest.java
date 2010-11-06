package easyaccepttests;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;

import br.edu.ufcg.blogao.webservice.BlogWSImpl;

/**
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */
public class BlogaoTest {
	
	public static void main(String[] args) {
		String sep = System.getProperty("file.separator");
		String EASY_ACCEPT_TESTS_PATH = "test" + sep + "easyaccepttests" + sep; 
		
		List<String> acceptanceTests = new ArrayList<String>();
		for (int i = 1; i <= 14; i++) {
			acceptanceTests.add(EASY_ACCEPT_TESTS_PATH + "us" + i + ".txt");
		}
		
		BlogWSImpl testFacade = new BlogWSImpl();
		EasyAcceptFacade eaFacade = new EasyAcceptFacade(testFacade, acceptanceTests);
		eaFacade.executeTests();
		System.out.println(eaFacade.getCompleteResults());
		System.out.println((eaFacade.getTotalNumberOfPassedTests() / Float.valueOf(eaFacade.getTotalNumberOfTests())) * 100.0 + "% dos testes passando");
	}
}