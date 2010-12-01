package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlDeclHandler class provides an interface to report declaration content of XML data. You can set the declaration handler with {@link com.trolltech.qt.xml.QXmlReader#setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface) QXmlReader::setDeclHandler()}. <p>This interface is based on the SAX2 extension DeclHandler. <p>The interface provides {@link com.trolltech.qt.xml.QXmlDeclHandler#attributeDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) attributeDecl()}, {@link com.trolltech.qt.xml.QXmlDeclHandler#internalEntityDecl(java.lang.String, java.lang.String) internalEntityDecl()} and {@link com.trolltech.qt.xml.QXmlDeclHandler#externalEntityDecl(java.lang.String, java.lang.String, java.lang.String) externalEntityDecl()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlDeclHandler extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlDeclHandlerInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlDeclHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_attributeDecl_String_String_String_String_String(nativeId(), eName, aName, type, valueDefault, value);
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
        public boolean externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_externalEntityDecl_String_String_String(nativeId(), name, publicId, systemId);
        }

        @Override
        @QtBlockedSlot
        public boolean internalEntityDecl(java.lang.String name, java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_internalEntityDecl_String_String(nativeId(), name, value);
        }
    }


/**
Creates a new QXmlDeclHandler.
*/

    public QXmlDeclHandler(){
        super((QPrivateConstructor)null);
        __qt_QXmlDeclHandler();
    }

    native void __qt_QXmlDeclHandler();

/**
The reader calls this function to report an attribute type declaration. Only the effective (first) declaration for an attribute is reported. <p>The reader passes the name of the associated element in <tt>eName</tt> and the name of the attribute in <tt>aName</tt>. It passes a string that represents the attribute type in <tt>type</tt> and a string that represents the attribute default in <tt>valueDefault</tt>. This string is one of "#IMPLIED", "#REQUIRED", "#FIXED" or an empty string (if none of the others applies). The reader passes the attribute's default value in <tt>value</tt>. If no default value is specified in the XML file, <tt>value</tt> is an empty string. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value);
    @QtBlockedSlot
    native boolean __qt_attributeDecl_String_String_String_String_String(long __this__nativeId, java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value);

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
The reader calls this function to report a parsed external entity declaration. Only the effective (first) declaration for each entity is reported. <p>The reader passes the name of the entity in <tt>name</tt>, the public identifier in <tt>publicId</tt> and the system identifier in <tt>systemId</tt>. If there is no public identifier specified, it passes an empty string in <tt>publicId</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId);
    @QtBlockedSlot
    native boolean __qt_externalEntityDecl_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
The reader calls this function to report an internal entity declaration. Only the effective (first) declaration is reported. <p>The reader passes the name of the entity in <tt>name</tt> and the value of the entity in <tt>value</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean internalEntityDecl(java.lang.String name, java.lang.String value);
    @QtBlockedSlot
    native boolean __qt_internalEntityDecl_String_String(long __this__nativeId, java.lang.String name, java.lang.String value);

/**
@exclude
*/

    public static native QXmlDeclHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlDeclHandler(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlDeclHandler(long ptr);
}
