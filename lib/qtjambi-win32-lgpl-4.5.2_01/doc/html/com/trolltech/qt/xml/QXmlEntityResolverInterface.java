package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver} class provides an interface to resolve external entities contained in XML data. If an application needs to implement customized handling for external entities, it must implement this interface, i.e. {@link com.trolltech.qt.xml.QXmlEntityResolver#resolveEntity(java.lang.String, java.lang.String) resolveEntity()}, and register it with {@link com.trolltech.qt.xml.QXmlReader#setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface) QXmlReader::setEntityResolver()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QXmlEntityResolverInterface extends QtJambiInterface
{

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public java.lang.String errorString();

/**
The reader calls this function before it opens any external entity, except the top-level document entity. The application may request the reader to resolve the entity itself (<tt>ret</tt> is 0) or to use an entirely different input source (<tt>ret</tt> points to the input source). <p>The reader deletes the input source <tt>ret</tt> when it no longer needs it, so you should allocate it on the heap with <tt>new</tt>. <p>The argument <tt>publicId</tt> is the public identifier of the external entity, <tt>systemId</tt> is the system identifier of the external entity and <tt>ret</tt> is the return value of this function. If <tt>ret</tt> is 0 the reader should resolve the entity itself, if it is non-zero it must point to an input source which the reader uses instead. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlEntityResolver#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity resolveEntity(java.lang.String publicId, java.lang.String systemId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QXmlEntityResolver(long ptr);
}
