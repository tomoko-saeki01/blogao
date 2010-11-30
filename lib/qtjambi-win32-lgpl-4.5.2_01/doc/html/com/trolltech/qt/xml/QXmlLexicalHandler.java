package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlLexicalHandler class provides an interface to report the lexical content of XML data. The events in the lexical handler apply to the entire document, not just to the document element, and all lexical handler events appear between the content handler's startDocument and endDocument events. <p>You can set the lexical handler with {@link com.trolltech.qt.xml.QXmlReader#setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface) QXmlReader::setLexicalHandler()}. <p>This interface's design is based on the the SAX2 extension LexicalHandler. <p>The interface provides the {@link com.trolltech.qt.xml.QXmlLexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) startDTD()}, {@link com.trolltech.qt.xml.QXmlLexicalHandler#endDTD() endDTD()}, {@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()}, {@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()}, {@link com.trolltech.qt.xml.QXmlLexicalHandler#startCDATA() startCDATA()}, {@link com.trolltech.qt.xml.QXmlLexicalHandler#endCDATA() endCDATA()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#comment(java.lang.String) comment()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlLexicalHandler extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlLexicalHandlerInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlLexicalHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean comment(java.lang.String ch) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_comment_String(nativeId(), ch);
        }

        @Override
        @QtBlockedSlot
        public boolean endCDATA() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_endCDATA(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean endDTD() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_endDTD(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean endEntity(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_endEntity_String(nativeId(), name);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String errorString() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorString(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean startCDATA() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_startCDATA(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_startDTD_String_String_String(nativeId(), name, publicId, systemId);
        }

        @Override
        @QtBlockedSlot
        public boolean startEntity(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_startEntity_String(nativeId(), name);
        }
    }


/**
Creates a new QXmlLexicalHandler.
*/

    public QXmlLexicalHandler(){
        super((QPrivateConstructor)null);
        __qt_QXmlLexicalHandler();
    }

    native void __qt_QXmlLexicalHandler();

/**
The reader calls this function to report an XML comment anywhere in the document. It reports the text of the comment in <tt>ch</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean comment(java.lang.String ch);
    @QtBlockedSlot
    native boolean __qt_comment_String(long __this__nativeId, java.lang.String ch);

/**
The reader calls this function to report the end of a CDATA section. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startCDATA() startCDATA()}, and {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) QXmlContentHandler::characters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean endCDATA();
    @QtBlockedSlot
    native boolean __qt_endCDATA(long __this__nativeId);

/**
The reader calls this function to report the end of a DTD declaration, if any. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) startDTD()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean endDTD();
    @QtBlockedSlot
    native boolean __qt_endDTD(long __this__nativeId);

/**
The reader calls this function to report the end of an entity called <tt>name</tt>. <p>For every {@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()} call, there is a corresponding {@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()} call. The calls to {@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()} are properly nested. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()}, {@link com.trolltech.qt.xml.QXmlContentHandler#skippedEntity(java.lang.String) QXmlContentHandler::skippedEntity()}, and QXmlSimpleReader::setFeature(). <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean endEntity(java.lang.String name);
    @QtBlockedSlot
    native boolean __qt_endEntity_String(long __this__nativeId, java.lang.String name);

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
The reader calls this function to report the start of a CDATA section. The content of the CDATA section is reported through the {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) QXmlContentHandler::characters()} function. This function is intended only to report the boundary. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endCDATA() endCDATA()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean startCDATA();
    @QtBlockedSlot
    native boolean __qt_startCDATA(long __this__nativeId);

/**
The reader calls this function to report the start of a DTD declaration, if any. It reports the name of the document type in <tt>name</tt>, the public identifier in <tt>publicId</tt> and the system identifier in <tt>systemId</tt>. <p>If the public identifier is missing, <tt>publicId</tt> is set to an empty string. If the system identifier is missing, <tt>systemId</tt> is set to an empty string. Note that it is not valid XML to have a public identifier but no system identifier; in such cases a parse error will occur. <p>All declarations reported through {@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler} or {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler} appear between the {@link com.trolltech.qt.xml.QXmlLexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) startDTD()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#endDTD() endDTD()} calls. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endDTD() endDTD()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId);
    @QtBlockedSlot
    native boolean __qt_startDTD_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
The reader calls this function to report the start of an entity called <tt>name</tt>. <p>Note that if the entity is unknown, the reader reports it through {@link com.trolltech.qt.xml.QXmlContentHandler#skippedEntity(java.lang.String) QXmlContentHandler::skippedEntity()} and not through this function. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()}, and QXmlSimpleReader::setFeature(). <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean startEntity(java.lang.String name);
    @QtBlockedSlot
    native boolean __qt_startEntity_String(long __this__nativeId, java.lang.String name);

/**
@exclude
*/

    public static native QXmlLexicalHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlLexicalHandler(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlLexicalHandler(long ptr);
}
