package br.edu.ufcg.blogao.webservice;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;

public class MessageInterceptor extends AbstractPhaseInterceptor<Message> {

	public MessageInterceptor(String phase) {
		super(phase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {
		// TODO Auto-generated method stub
		
	}

}
