package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QAbstractMessageHandler class provides a callback interface for handling messages. QAbstractMessageHandler is an abstract base class that provides a callback interface for handling messages. For example, class {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} parses and runs an XQuery. When it detects a compile or runtime error, it generates an appropriate error message, but rather than output the message itself, it passes the message to the {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) message()} function of its QAbstractMessageHandler. See {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setMessageHandler(com.trolltech.qt.xmlpatterns.QAbstractMessageHandler) QXmlQuery::setMessageHandler()}. <p>You create a message handler by subclassing QAbstractMessageHandler and implementing {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}. You then pass a pointer to an instance of your subclass to any classes that must generate messages. The messages are sent to the message handler via the {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) message()} function, which forwards them to your handleMessge(). The effect is to serialize the handling of all messages, which means your QAbstractMessageHandler subclass is thread safe. <p>A single instance of QAbstractMessageHandler can be called on to handle messages from multiple sources. Hence, the content of a message, which is the description parameter passed to {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) message()} and {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}, must be interpreted in light of the context that required the message to be sent. That context is specified by the identifier and sourceLocation parameters to {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) message()}{@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}.
*/
@QtJambiGeneratedClass
public abstract class QAbstractMessageHandler extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xmlpatterns.QAbstractMessageHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void handleMessage(com.trolltech.qt.core.Global.QtMsgType type, java.lang.String description, com.trolltech.qt.core.QUrl identifier, com.trolltech.qt.xmlpatterns.QSourceLocation sourceLocation) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_handleMessage_QtMsgType_String_QUrl_QSourceLocation(nativeId(), type.value(), description, identifier == null ? 0 : identifier.nativeId(), sourceLocation == null ? 0 : sourceLocation.nativeId());
        }
    }



/**
Sends a message to this message handler. <tt>type</tt> is the kind of message being sent. <tt>description</tt> is the message content. The <tt>identifier</tt> is a URI that identifies the message and is the key to interpreting the other arguments. <p>Typically, this class is used for reporting errors, as is the case for {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}, which uses a QAbstractMessageHandler to report compile and runtime XQuery errors. Hence, using a {@link com.trolltech.qt.core.QUrl QUrl} as the message <tt>identifier</tt> is was inspired by the explanation of {@link <a href="../http-www-w3-org-tr-xquery-errors.html">error handling in the XQuery language</a>}. Because the <tt>identifier</tt> is composed of a namespace URI and a local part, identifiers with the same local part are unique. The caller is responsible for ensuring that <tt>identifier</tt> is either a valid {@link com.trolltech.qt.core.QUrl QUrl} or a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. <p><tt>sourceLocation</tt> identifies a location in a resource (i.e., file or document) where the need for reporting a message was detected. <p>This function unconditionally calls {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}, passing all its parameters unmodified. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public final void message(com.trolltech.qt.core.Global.QtMsgType type, java.lang.String description, com.trolltech.qt.core.QUrl identifier) {
        message(type, description, identifier, (com.trolltech.qt.xmlpatterns.QSourceLocation)new com.trolltech.qt.xmlpatterns.QSourceLocation());
    }

/**
Sends a message to this message handler. <tt>type</tt> is the kind of message being sent. <tt>description</tt> is the message content. The <tt>identifier</tt> is a URI that identifies the message and is the key to interpreting the other arguments. <p>Typically, this class is used for reporting errors, as is the case for {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}, which uses a QAbstractMessageHandler to report compile and runtime XQuery errors. Hence, using a {@link com.trolltech.qt.core.QUrl QUrl} as the message <tt>identifier</tt> is was inspired by the explanation of {@link <a href="../http-www-w3-org-tr-xquery-errors.html">error handling in the XQuery language</a>}. Because the <tt>identifier</tt> is composed of a namespace URI and a local part, identifiers with the same local part are unique. The caller is responsible for ensuring that <tt>identifier</tt> is either a valid {@link com.trolltech.qt.core.QUrl QUrl} or a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. <p><tt>sourceLocation</tt> identifies a location in a resource (i.e., file or document) where the need for reporting a message was detected. <p>This function unconditionally calls {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}, passing all its parameters unmodified. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public final void message(com.trolltech.qt.core.Global.QtMsgType type, java.lang.String description) {
        message(type, description, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl(), (com.trolltech.qt.xmlpatterns.QSourceLocation)new com.trolltech.qt.xmlpatterns.QSourceLocation());
    }
/**
Sends a message to this message handler. <tt>type</tt> is the kind of message being sent. <tt>description</tt> is the message content. The <tt>identifier</tt> is a URI that identifies the message and is the key to interpreting the other arguments. <p>Typically, this class is used for reporting errors, as is the case for {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}, which uses a QAbstractMessageHandler to report compile and runtime XQuery errors. Hence, using a {@link com.trolltech.qt.core.QUrl QUrl} as the message <tt>identifier</tt> is was inspired by the explanation of {@link <a href="../http-www-w3-org-tr-xquery-errors.html">error handling in the XQuery language</a>}. Because the <tt>identifier</tt> is composed of a namespace URI and a local part, identifiers with the same local part are unique. The caller is responsible for ensuring that <tt>identifier</tt> is either a valid {@link com.trolltech.qt.core.QUrl QUrl} or a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. <p><tt>sourceLocation</tt> identifies a location in a resource (i.e., file or document) where the need for reporting a message was detected. <p>This function unconditionally calls {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#handleMessage(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl, com.trolltech.qt.xmlpatterns.QSourceLocation) handleMessage()}, passing all its parameters unmodified. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public final void message(com.trolltech.qt.core.Global.QtMsgType type, java.lang.String description, com.trolltech.qt.core.QUrl identifier, com.trolltech.qt.xmlpatterns.QSourceLocation sourceLocation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_message_QtMsgType_String_QUrl_QSourceLocation(nativeId(), type.value(), description, identifier == null ? 0 : identifier.nativeId(), sourceLocation == null ? 0 : sourceLocation.nativeId());
    }
    @QtBlockedSlot
    native void __qt_message_QtMsgType_String_QUrl_QSourceLocation(long __this__nativeId, int type, java.lang.String description, long identifier, long sourceLocation);

/**
This function must be implemented by the sub-class. {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) message()} will call this function, passing in its parameters, <tt>type</tt>, <tt>description</tt>, <tt>identifier</tt> and <tt>sourceLocation</tt> unmodified.
*/

    @QtBlockedSlot
    protected abstract void handleMessage(com.trolltech.qt.core.Global.QtMsgType type, java.lang.String description, com.trolltech.qt.core.QUrl identifier, com.trolltech.qt.xmlpatterns.QSourceLocation sourceLocation);
    @QtBlockedSlot
    native void __qt_handleMessage_QtMsgType_String_QUrl_QSourceLocation(long __this__nativeId, int type, java.lang.String description, long identifier, long sourceLocation);

/**
@exclude
*/

    public static native QAbstractMessageHandler fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractMessageHandler(QPrivateConstructor p) { super(p); } 
}
