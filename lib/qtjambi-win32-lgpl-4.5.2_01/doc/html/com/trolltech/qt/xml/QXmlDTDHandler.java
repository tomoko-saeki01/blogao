package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlDTDHandler class provides an interface to report DTD content of XML data. If an application needs information about notations and unparsed entities, it can implement this interface and register an instance with {@link com.trolltech.qt.xml.QXmlReader#setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface) QXmlReader::setDTDHandler()}. <p>Note that this interface includes only those DTD events that the XML recommendation requires processors to report, i.e. notation and unparsed entity declarations using {@link com.trolltech.qt.xml.QXmlDTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String) notationDecl()} and {@link com.trolltech.qt.xml.QXmlDTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String) unparsedEntityDecl()} respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlDTDHandler extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlDTDHandlerInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlDTDHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String errorString() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorString(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_notationDecl_String_String_String(nativeId(), name, publicId, systemId);
        }

        @Override
        @QtBlockedSlot
        public boolean unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_unparsedEntityDecl_String_String_String_String(nativeId(), name, publicId, systemId, notationName);
        }
    }


/**
Creates a new QXmlDTDHandler.
*/

    public QXmlDTDHandler(){
        super((QPrivateConstructor)null);
        __qt_QXmlDTDHandler();
    }

    native void __qt_QXmlDTDHandler();

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
The reader calls this function when it has parsed a notation declaration. <p>The argument <tt>name</tt> is the notation name, <tt>publicId</tt> is the notation's public identifier and <tt>systemId</tt> is the notation's system identifier. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDTDHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId);
    @QtBlockedSlot
    native boolean __qt_notationDecl_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
The reader calls this function when it finds an unparsed entity declaration. <p>The argument <tt>name</tt> is the unparsed entity's name, <tt>publicId</tt> is the entity's public identifier, <tt>systemId</tt> is the entity's system identifier and <tt>notationName</tt> is the name of the associated notation. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDTDHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName);
    @QtBlockedSlot
    native boolean __qt_unparsedEntityDecl_String_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName);

/**
@exclude
*/

    public static native QXmlDTDHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlDTDHandler(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlDTDHandler(long ptr);
}
