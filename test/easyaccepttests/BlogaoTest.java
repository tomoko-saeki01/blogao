package easyaccepttests;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;

import br.edu.ufcg.blogao.webservice.BlogWSImpl;

/**
 * 
 * @author caiopaes
 * @author Carlos
 * @author Catharine
 * @author Demontiê
 * @author Matheus
 *
 */
public class BlogaoTest {
	
	public static void main(String[] args) {
		String sep = System.getProperty("file.separator");
		String EASY_ACCEPT_TESTS_PATH = "test" + sep + "easyaccepttests" + sep; 
		
		List<String> acceptanceTests = new ArrayList<String>();
		for (int i = 1; i <= 14; i++) {
			acceptanceTests.add(EASY_ACCEPT_TESTS_PATH + "us" + i + ".txt");
		}
//		acceptanceTests.add(EASY_ACCEPT_TESTS_PATH + "us6.txt");
		BlogWSImpl testFacade = new BlogWSImpl();
		EasyAcceptFacade eaFacade = new EasyAcceptFacade(testFacade, acceptanceTests);
		eaFacade.executeTests();
		System.out.println(eaFacade.getCompleteResults());
	}

}
