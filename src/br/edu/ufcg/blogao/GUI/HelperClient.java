package br.edu.ufcg.blogao.GUI;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import br.edu.ufcg.blogao.webservice.BlogWS;
import br.edu.ufcg.blogao.webservice.CustomOutFaultInterceptor;

public class HelperClient {
	
	/**
	 * Retorna uma instancia do objeto BlogWS
	 * @param port
	 * @return
	 */
	public static BlogWS getInstance(String port) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new CustomOutFaultInterceptor());
		
		factory.setServiceClass(BlogWS.class);
		factory.setAddress(port);
		return (BlogWS) factory.create();
	}
}