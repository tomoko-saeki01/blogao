package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlDefaultHandler class provides a default implementation of all the XML handler classes. This class gathers together the features of the specialized handler classes, making it a convenient starting point when implementing custom handlers for subclasses of {@link com.trolltech.qt.xml.QXmlReader QXmlReader}, particularly {@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}. The virtual functions from each of the base classes are reimplemented in this class, providing sensible default behavior for many common cases. By subclassing this class, and overriding these functions, you can concentrate on implementing the parts of the handler relevant to your application. <p>The XML reader must be told which handler to use for different kinds of events during parsing. This means that, although QXmlDefaultHandler provides default implementations of functions inherited from all its base classes, we can still use specialized handlers for particular kinds of events. <p>For example, QXmlDefaultHandler subclasses both {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler} and {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, so by subclassing it we can use the same handler for both of the following reader functions: <pre class="snippet">
    xmlReader.setContentHandler(handler);
    xmlReader.setErrorHandler(handler);
</pre> Since the reader will inform the handler of parsing errors, it is necessary to reimplement {@link com.trolltech.qt.xml.QXmlErrorHandler#fatalError(com.trolltech.qt.xml.QXmlParseException) QXmlErrorHandler::fatalError()} if, for example, we want to stop parsing when such an error occurs: <pre class="snippet">
boolean fatalError (QXmlParseException  exception)
{
    System.err.println("Fatal error on line" + exception.lineNumber()
               + ", column" + exception.columnNumber() + ":"
               + exception.message());

    return false;
}
</pre> The above function returns false, which tells the reader to stop parsing. To continue to use the same reader, it is necessary to create a new handler instance, and set up the reader to use it in the manner described above. <p>It is useful to examine some of the functions inherited by QXmlDefaultHandler, and consider why they might be reimplemented in a custom handler. Custom handlers will typically reimplement {@link com.trolltech.qt.xml.QXmlContentHandler#startDocument() QXmlContentHandler::startDocument()} to prepare the handler for new content. Document elements and the text within them can be processed by reimplementing {@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) QXmlContentHandler::startElement()}, {@link com.trolltech.qt.xml.QXmlContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) QXmlContentHandler::endElement()}, and {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) QXmlContentHandler::characters()}. You may want to reimplement {@link com.trolltech.qt.xml.QXmlContentHandler#endDocument() QXmlContentHandler::endDocument()} to perform some finalization or validation on the content once the document has been read completely. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlDefaultHandler extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlContentHandlerInterface,
            com.trolltech.qt.xml.QXmlErrorHandlerInterface,
            com.trolltech.qt.xml.QXmlDTDHandlerInterface,
            com.trolltech.qt.xml.QXmlEntityResolverInterface,
            com.trolltech.qt.xml.QXmlLexicalHandlerInterface,
            com.trolltech.qt.xml.QXmlDeclHandlerInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a handler for use with subclasses of {@link com.trolltech.qt.xml.QXmlReader QXmlReader}.
*/

    public QXmlDefaultHandler(){
        super((QPrivateConstructor)null);
        __qt_QXmlDefaultHandler();
    }

    native void __qt_QXmlDefaultHandler();

/**
The reader calls this function to report an attribute type declaration. Only the effective (first) declaration for an attribute is reported. <p>The reader passes the name of the associated element in <tt>eName</tt> and the name of the attribute in <tt>aName</tt>. It passes a string that represents the attribute type in <tt>type</tt> and a string that represents the attribute default in <tt>valueDefault</tt>. This string is one of "#IMPLIED", "#REQUIRED", "#FIXED" or an empty string (if none of the others applies). The reader passes the attribute's default value in <tt>value</tt>. If no default value is specified in the XML file, <tt>value</tt> is an empty string. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeDecl_String_String_String_String_String(nativeId(), eName, aName, type, valueDefault, value);
    }
    @QtBlockedSlot
    native boolean __qt_attributeDecl_String_String_String_String_String(long __this__nativeId, java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String valueDefault, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean characters(java.lang.String ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_characters_String(nativeId(), ch);
    }
    @QtBlockedSlot
    native boolean __qt_characters_String(long __this__nativeId, java.lang.String ch);

/**
The reader calls this function to report an XML comment anywhere in the document. It reports the text of the comment in <tt>ch</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean comment(java.lang.String ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_comment_String(nativeId(), ch);
    }
    @QtBlockedSlot
    native boolean __qt_comment_String(long __this__nativeId, java.lang.String ch);

/**
The reader calls this function to report the end of a CDATA section. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startCDATA() startCDATA()}, and {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) QXmlContentHandler::characters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endCDATA()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endCDATA(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endCDATA(long __this__nativeId);

/**
The reader calls this function to report the end of a DTD declaration, if any. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) startDTD()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endDTD()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endDTD(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endDTD(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean endDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endDocument(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endElement_String_String_String(nativeId(), namespaceURI, localName, qName);
    }
    @QtBlockedSlot
    native boolean __qt_endElement_String_String_String(long __this__nativeId, java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName);

/**
The reader calls this function to report the end of an entity called <tt>name</tt>. <p>For every {@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()} call, there is a corresponding {@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()} call. The calls to {@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()} are properly nested. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#startEntity(java.lang.String) startEntity()}, {@link com.trolltech.qt.xml.QXmlContentHandler#skippedEntity(java.lang.String) QXmlContentHandler::skippedEntity()}, and QXmlSimpleReader::setFeature(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean endEntity(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endEntity_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_endEntity_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean endPrefixMapping(java.lang.String prefix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endPrefixMapping_String(nativeId(), prefix);
    }
    @QtBlockedSlot
    native boolean __qt_endPrefixMapping_String(long __this__nativeId, java.lang.String prefix);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean error(com.trolltech.qt.xml.QXmlParseException exception)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_error_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_error_QXmlParseException(long __this__nativeId, long exception);

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
The reader calls this function to report a parsed external entity declaration. Only the effective (first) declaration for each entity is reported. <p>The reader passes the name of the entity in <tt>name</tt>, the public identifier in <tt>publicId</tt> and the system identifier in <tt>systemId</tt>. If there is no public identifier specified, it passes an empty string in <tt>publicId</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_externalEntityDecl_String_String_String(nativeId(), name, publicId, systemId);
    }
    @QtBlockedSlot
    native boolean __qt_externalEntityDecl_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean fatalError(com.trolltech.qt.xml.QXmlParseException exception)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fatalError_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fatalError_QXmlParseException(long __this__nativeId, long exception);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean ignorableWhitespace(java.lang.String ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ignorableWhitespace_String(nativeId(), ch);
    }
    @QtBlockedSlot
    native boolean __qt_ignorableWhitespace_String(long __this__nativeId, java.lang.String ch);

/**
The reader calls this function to report an internal entity declaration. Only the effective (first) declaration is reported. <p>The reader passes the name of the entity in <tt>name</tt> and the value of the entity in <tt>value</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlDeclHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public boolean internalEntityDecl(java.lang.String name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_internalEntityDecl_String_String(nativeId(), name, value);
    }
    @QtBlockedSlot
    native boolean __qt_internalEntityDecl_String_String(long __this__nativeId, java.lang.String name, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notationDecl_String_String_String(nativeId(), name, publicId, systemId);
    }
    @QtBlockedSlot
    native boolean __qt_notationDecl_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean processingInstruction(java.lang.String target, java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_processingInstruction_String_String(nativeId(), target, data);
    }
    @QtBlockedSlot
    native boolean __qt_processingInstruction_String_String(long __this__nativeId, java.lang.String target, java.lang.String data);

/**
The reader calls this function before it opens any external entity, except the top-level document entity. The application may request the reader to resolve the entity itself (<tt>ret</tt> is 0) or to use an entirely different input source (<tt>ret</tt> points to the input source). <p>The reader deletes the input source <tt>ret</tt> when it no longer needs it, so you should allocate it on the heap with <tt>new</tt>. <p>The argument <tt>publicId</tt> is the public identifier of the external entity, <tt>systemId</tt> is the system identifier of the external entity and <tt>ret</tt> is the return value of this function. If <tt>ret</tt> is 0 the reader should resolve the entity itself, if it is non-zero it must point to an input source which the reader uses instead. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlEntityResolver#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity resolveEntity(java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolveEntity_String_String_QXmlInputSource(nativeId(), publicId, systemId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity __qt_resolveEntity_String_String_QXmlInputSource(long __this__nativeId, java.lang.String publicId, java.lang.String systemId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setDocumentLocator(com.trolltech.qt.xml.QXmlLocator locator)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentLocator_QXmlLocator(nativeId(), locator == null ? 0 : locator.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDocumentLocator_QXmlLocator(long __this__nativeId, long locator);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean skippedEntity(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_skippedEntity_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_skippedEntity_String(long __this__nativeId, java.lang.String name);

/**
The reader calls this function to report the start of a CDATA section. The content of the CDATA section is reported through the {@link com.trolltech.qt.xml.QXmlContentHandler#characters(java.lang.String) QXmlContentHandler::characters()} function. This function is intended only to report the boundary. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endCDATA() endCDATA()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startCDATA()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startCDATA(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startCDATA(long __this__nativeId);

/**
The reader calls this function to report the start of a DTD declaration, if any. It reports the name of the document type in <tt>name</tt>, the public identifier in <tt>publicId</tt> and the system identifier in <tt>systemId</tt>. <p>If the public identifier is missing, <tt>publicId</tt> is set to an empty string. If the system identifier is missing, <tt>systemId</tt> is set to an empty string. Note that it is not valid XML to have a public identifier but no system identifier; in such cases a parse error will occur. <p>All declarations reported through {@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler} or {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler} appear between the {@link com.trolltech.qt.xml.QXmlLexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) startDTD()} and {@link com.trolltech.qt.xml.QXmlLexicalHandler#endDTD() endDTD()} calls. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endDTD() endDTD()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startDTD_String_String_String(nativeId(), name, publicId, systemId);
    }
    @QtBlockedSlot
    native boolean __qt_startDTD_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean startDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startDocument(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, com.trolltech.qt.xml.QXmlAttributes atts)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startElement_String_String_String_QXmlAttributes(nativeId(), namespaceURI, localName, qName, atts == null ? 0 : atts.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startElement_String_String_String_QXmlAttributes(long __this__nativeId, java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, long atts);

/**
The reader calls this function to report the start of an entity called <tt>name</tt>. <p>Note that if the entity is unknown, the reader reports it through {@link com.trolltech.qt.xml.QXmlContentHandler#skippedEntity(java.lang.String) QXmlContentHandler::skippedEntity()} and not through this function. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlLexicalHandler#errorString() errorString()} to get the error message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlLexicalHandler#endEntity(java.lang.String) endEntity()}, and QXmlSimpleReader::setFeature(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean startEntity(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startEntity_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_startEntity_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean startPrefixMapping(java.lang.String prefix, java.lang.String uri)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startPrefixMapping_String_String(nativeId(), prefix, uri);
    }
    @QtBlockedSlot
    native boolean __qt_startPrefixMapping_String_String(long __this__nativeId, java.lang.String prefix, java.lang.String uri);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unparsedEntityDecl_String_String_String_String(nativeId(), name, publicId, systemId, notationName);
    }
    @QtBlockedSlot
    native boolean __qt_unparsedEntityDecl_String_String_String_String(long __this__nativeId, java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean warning(com.trolltech.qt.xml.QXmlParseException exception)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_warning_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_warning_QXmlParseException(long __this__nativeId, long exception);

/**
@exclude
*/

    public static native QXmlDefaultHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlDefaultHandler(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlContentHandler(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlErrorHandler(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlDTDHandler(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlEntityResolver(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlLexicalHandler(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlDeclHandler(long ptr);
}
