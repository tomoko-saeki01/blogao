package br.edu.ufcg.blogao.webservice;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.model.BindingMessageInfo;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.apache.cxf.ws.policy.EffectivePolicy;
import org.apache.cxf.ws.policy.EffectivePolicyImpl;

public class CustomOutFaultInterceptor extends AbstractPhaseInterceptor<Message> {
    private boolean handleMessageCalled;
    public CustomOutFaultInterceptor() {
        this(Phase.PRE_STREAM);
    }

    public CustomOutFaultInterceptor(String s) {
        super(Phase.SEND);

    }

    public void handleMessage(Message message) {
        
        handleMessageCalled = true;
        
        
       
        
        System.out.println(message.keySet().toString());
        System.out.println(message.values().toString());
     

    }

    protected boolean handleMessageCalled() {
        return handleMessageCalled;
    }

    
    
}