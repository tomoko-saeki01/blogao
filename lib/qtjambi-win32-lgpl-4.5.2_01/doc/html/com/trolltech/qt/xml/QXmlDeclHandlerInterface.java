package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler} class provides an interface to report declaration content of XML data. You can set the declaration handler with {@link com.trolltech.qt.xml.QXmlReader#setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface) QXmlReader::setDeclHandler()}. <p>This interface is based on the SAX2 extension DeclHandler. <p>The interface provides {@link com.trolltech.qt.xml.QXmlDeclHandler#attributeDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) attributeDecl()}, {@link com.trolltech.qt.xml.QXmlDeclHandler#internalEntityDecl(java.lang.String, java.lang.String) internalEntityDecl()} and {@link com.trolltech.qt.xml.QXmlDeclHandler#externalEntityDecl(java.lang.String, java.lang.String, java.lang.String) externalEntityDecl()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QXmlDeclHandlerInterface extends QtJambiInterface
{

    @QtBlockedSlot
    public boolean attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value);

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public java.lang.String errorString();

    @QtBlockedSlot
    public boolean externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId);

    @QtBlockedSlot
    public boolean internalEntityDecl(java.lang.String name, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QXmlDeclHandler(long ptr);
}
