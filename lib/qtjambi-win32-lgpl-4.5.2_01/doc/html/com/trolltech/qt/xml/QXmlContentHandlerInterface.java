package com.trolltech.qt.xml;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QXmlContentHandlerInterface extends QtJambiInterface
{

/**
The reader calls this function when it has parsed a chunk of character data (either normal character data or character data inside a CDATA section; if you need to distinguish between those two types you must use {@link com.trolltech.qt.xml.QXmlLexicalHandler#startCDATA() QXmlLexicalHandler::startCDATA()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#endCDATA() QXmlLexicalHandler::endCDATA()}). The character data is reported in <tt>ch</tt>. <p>Some readers report whitespace in element content using the {@link com.trolltech.qt.xml.QXmlContentHandler#ignorableWhitespace(java.lang.String) ignorableWhitespace()} function rather than using this one. <p>A reader may report the character data of an element in more than one chunk; e.g. a reader might want to report "a&lt;b" in three {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) characters()} events ("a ", "&lt;" and " b"). <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean characters(java.lang.String ch);

/**
The reader calls this function after it has finished parsing. It is called just once, and is the last handler function called. It is called after the reader has read all input or has abandoned parsing because of a fatal error. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#startDocument() startDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endDocument();

/**
The reader calls this function when it has parsed an end element tag with the qualified name <tt>qName</tt>, the local name <tt>localName</tt> and the namespace URI <tt>namespaceURI</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) startElement()}, and {@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName);

/**
The reader calls this function to signal the end of a prefix mapping for the prefix <tt>prefix</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#startPrefixMapping(java.lang.String, java.lang.String) startPrefixMapping()}, and {@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endPrefixMapping(java.lang.String prefix);

/**
The reader calls this function to get an error string, e.g. if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public java.lang.String errorString();

/**
Some readers may use this function to report each chunk of whitespace in element content. The whitespace is reported in <tt>ch</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean ignorableWhitespace(java.lang.String ch);

/**
The reader calls this function when it has parsed a processing instruction. <p><tt>target</tt> is the target name of the processing instruction and <tt>data</tt> is the data in the processing instruction. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean processingInstruction(java.lang.String target, java.lang.String data);

/**
The reader calls this function before it starts parsing the document. The argument <tt>locator</tt> is a pointer to a {@link com.trolltech.qt.xml.QXmlLocator QXmlLocator} which allows the application to get the parsing position within the document. <p>Do not destroy the <tt>locator</tt>; it is destroyed when the reader is destroyed. (Do not use the <tt>locator</tt> after the reader is destroyed).
*/

    @QtBlockedSlot
    public void setDocumentLocator(com.trolltech.qt.xml.QXmlLocator locator);

/**
Some readers may skip entities if they have not seen the declarations (e. . because they are in an external DTD). If they do so they report that they skipped the entity called <tt>name</tt> by calling this function. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean skippedEntity(java.lang.String name);

/**
The reader calls this function when it starts parsing the document. The reader calls this function just once, after the call to {@link com.trolltech.qt.xml.QXmlContentHandler#setDocumentLocator(com.trolltech.qt.xml.QXmlLocator) setDocumentLocator()}, and before any other functions in this class or in the {@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler} class are called. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#endDocument() endDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startDocument();

/**
The reader calls this function when it has parsed a start element tag. <p>There is a corresponding {@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) endElement()} call when the corresponding end element tag is read. The {@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) startElement()} and {@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) endElement()} calls are always nested correctly. Empty element tags (e.g. <tt>&lt;x/&gt;</tt>) cause a {@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) startElement()} call to be immediately followed by an {@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) endElement()} call. <p>The attribute list provided only contains attributes with explicit values. The attribute list contains attributes used for namespace declaration (i.e. attributes starting with xmlns) only if the namespace-prefix property of the reader is true. <p>The argument <tt>namespaceURI</tt> is the namespace URI, or an empty string if the element has no namespace URI or if no namespace processing is done. <tt>localName</tt> is the local name (without prefix), or an empty string if no namespace processing is done, <tt>qName</tt> is the qualified name (with prefix) and <tt>atts</tt> are the attributes attached to the element. If there are no attributes, <tt>atts</tt> is an empty attributes object. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) endElement()}, and {@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, com.trolltech.qt.xml.QXmlAttributes atts);

/**
The reader calls this function to signal the begin of a prefix-URI namespace mapping scope. This information is not necessary for normal namespace processing since the reader automatically replaces prefixes for element and attribute names. <p>Note that {@link com.trolltech.qt.xml.QXmlContentHandler#startPrefixMapping(java.lang.String, java.lang.String) startPrefixMapping()} and {@link com.trolltech.qt.xml.QXmlContentHandler#endPrefixMapping(java.lang.String) endPrefixMapping()} calls are not guaranteed to be properly nested relative to each other: all {@link com.trolltech.qt.xml.QXmlContentHandler#startPrefixMapping(java.lang.String, java.lang.String) startPrefixMapping()} events occur before the corresponding {@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) startElement()} event, and all {@link com.trolltech.qt.xml.QXmlContentHandler#endPrefixMapping(java.lang.String) endPrefixMapping()} events occur after the corresponding {@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) endElement()} event, but their order is not otherwise guaranteed. <p>The argument <tt>prefix</tt> is the namespace prefix being declared and the argument <tt>uri</tt> is the namespace URI the prefix is mapped to. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlContentHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlContentHandler#endPrefixMapping(java.lang.String) endPrefixMapping()}, and {@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startPrefixMapping(java.lang.String prefix, java.lang.String uri);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QXmlContentHandler(long ptr);
}
