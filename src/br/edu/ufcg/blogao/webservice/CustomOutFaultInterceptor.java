package br.edu.ufcg.blogao.webservice;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

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