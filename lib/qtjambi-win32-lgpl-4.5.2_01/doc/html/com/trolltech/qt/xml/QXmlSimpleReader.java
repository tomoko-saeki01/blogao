package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlSimpleReader class provides an implementation of a simple XML parser. This XML reader is suitable for a wide range of applications. It is able to parse well-formed XML and can report the namespaces of elements to a content handler; however, it does not parse any external entities. For historical reasons, Attribute Value Normalization and End-of-Line Handling as described in the XML 1.0 specification is not performed. <p>The easiest pattern of use for this class is to create a reader instance, define an input source, specify the handlers to be used by the reader, and parse the data. <p>For example, we could use a {@link com.trolltech.qt.core.QFile QFile} to supply the input. Here, we create a reader, and define an input source to be used by the reader: <pre class="snippet">
        QXmlSimpleReader xmlReader = new QXmlSimpleReader();
        QXmlInputSource source = new QXmlInputSource(file);
    </pre> A handler lets us perform actions when the reader encounters certain types of content, or if errors in the input are found. The reader must be told which handler to use for each type of event. For many common applications, we can create a custom handler by subclassing {@link com.trolltech.qt.xml.QXmlDefaultHandler QXmlDefaultHandler}, and use this to handle both error and content events: <pre class="snippet">
        Handler handler = new Handler();
        xmlReader.setContentHandler(handler);
        xmlReader.setErrorHandler(handler);
    </pre> If you don't set at least the content and error handlers, the parser will fall back on its default behavior---and will do nothing. <p>The most convenient way to handle the input is to read it in a single pass using the parse() function with an argument that specifies the input source: <pre class="snippet">
        boolean ok = xmlReader.parse(source);

        if (!ok)
            System.err.println("Parsing failed.");
    </pre> If you can't parse the entire input in one go (for example, it is huge, or is being delivered over a network connection), data can be fed to the parser in pieces. This is achieved by telling parse() to work incrementally, and making subsequent calls to the {@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() parseContinue()} function, until all the data has been processed. <p>A common way to perform incremental parsing is to connect the <tt>readyRead()</tt> signal of the input source to a slot, and handle the incoming data there. For example, the following code shows how a parser for RSS feeds can be used to incrementally parse data that it receives from a {@link com.trolltech.qt.network.QHttp QHttp} object: <pre class="snippet">
void readData(QHttpResponseHeader resp)
{
    boolean sok;

    if (resp.statusCode() != 200)
        http.abort();
    else {
        xmlInput.setData(http.readAll());

        if (newInformation) {
            ok = xmlReader.parse(xmlInput, true);
            newInformation = false;
        }
        else
            ok = xmlReader.parseContinue();

        if (!ok)
            http.abort();
    }
}
</pre> Aspects of the parsing behavior can be adapted using setFeature() and setProperty(). For example, the following code could be used to enable reporting of namespace prefixes to the content handler: <p>QXmlSimpleReader is not reentrant. If you want to use the class in threaded code, lock the code using QXmlSimpleReader with a locking mechanism, such as a {@link com.trolltech.qt.core.QMutex QMutex}. <pre class="snippet">
        xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
*/
@QtJambiGeneratedClass
public class QXmlSimpleReader extends com.trolltech.qt.xml.QXmlReader
{

    private Object __rcDTDHandler = null;

    private Object __rcDeclHandler = null;

    private Object __rcLexicalHandler = null;

    private Object __rcErrorHandler = null;

    private Object __rcContentHandler = null;

    private Object __rcEntityResolver = null;

/**
</pre> Constructs a simple XML reader.
*/

    public QXmlSimpleReader(){
        super((QPrivateConstructor)null);
        __qt_QXmlSimpleReader();
    }

    native void __qt_QXmlSimpleReader();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlDTDHandlerInterface DTDHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_DTDHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlDTDHandlerInterface __qt_DTDHandler(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlContentHandlerInterface contentHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlContentHandlerInterface __qt_contentHandler(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlDeclHandlerInterface declHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_declHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlDeclHandlerInterface __qt_declHandler(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlEntityResolverInterface entityResolver()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entityResolver(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlEntityResolverInterface __qt_entityResolver(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlErrorHandlerInterface errorHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlErrorHandlerInterface __qt_errorHandler(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean feature(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_feature_String_nativepointer(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_feature_String_nativepointer(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasFeature(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFeature_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_hasFeature_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasProperty(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasProperty_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_hasProperty_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xml.QXmlLexicalHandlerInterface lexicalHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lexicalHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlLexicalHandlerInterface __qt_lexicalHandler(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean parse(com.trolltech.qt.xml.QXmlInputSource input)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parse_QXmlInputSource(nativeId(), input == null ? 0 : input.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_parse_QXmlInputSource(long __this__nativeId, long input);

/**
Reads an XML document from <tt>input</tt> and parses it. Returns true if the parsing is completed successfully; otherwise returns false, indicating that an error occurred. <p>If <tt>incremental</tt> is false, this function will return false if the XML file is not read completely. The parsing cannot be continued in this case. <p>If <tt>incremental</tt> is true, the parser does not return false if it reaches the end of the <tt>input</tt> before reaching the end of the XML file. Instead, it stores the state of the parser so that parsing can be continued later when more data is available. In such a case, you can use the function {@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() parseContinue()} to continue with parsing. This class stores a pointer to the input source <tt>input</tt> and the {@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() parseContinue()} function tries to read from that input source. Therefore, you should not delete the input source <tt>input</tt> until you no longer need to call {@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() parseContinue()}. <p>If this function is called with <tt>incremental</tt> set to true while an incremental parse is in progress, a new parsing session will be started, and the previous session will be lost. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() parseContinue()}, and {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean parse(com.trolltech.qt.xml.QXmlInputSource input, boolean incremental)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parse_QXmlInputSource_boolean(nativeId(), input == null ? 0 : input.nativeId(), incremental);
    }
    @QtBlockedSlot
    native boolean __qt_parse_QXmlInputSource_boolean(long __this__nativeId, long input, boolean incremental);

/**
Continues incremental parsing, taking input from the {@link com.trolltech.qt.xml.QXmlInputSource QXmlInputSource} that was specified with the most recent call to parse(). To use this function, you must have called parse() with the incremental argument set to true. <p>Returns false if a parsing error occurs; otherwise returns true, even if the end of the XML file has not been reached. You can continue parsing at a later stage by calling this function again when there is more data available to parse. <p>Calling this function when there is no data available in the input source indicates to the reader that the end of the XML file has been reached. If the input supplied up to this point was not well-formed then a parsing error occurs, and false is returned. If the input supplied was well-formed, true is returned. It is important to end the input in this way because it allows you to reuse the reader to parse other XML files. <p>Calling this function after the end of file has been reached, but without available data will cause false to be returned whether the previous input was well-formed or not. <p><DT><b>See also:</b><br><DD>parse(), {@link com.trolltech.qt.xml.QXmlInputSource#data() QXmlInputSource::data()}, and {@link com.trolltech.qt.xml.QXmlInputSource#next() QXmlInputSource::next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean parseContinue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parseContinue(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_parseContinue(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setContentHandler(com.trolltech.qt.xml.QXmlContentHandlerInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContentHandler = handler;
        }
        __qt_setContentHandler_QXmlContentHandler(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setContentHandler_QXmlContentHandler(long __this__nativeId, long handler);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDTDHandler = handler;
        }
        __qt_setDTDHandler_QXmlDTDHandler(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDTDHandler_QXmlDTDHandler(long __this__nativeId, long handler);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDeclHandler = handler;
        }
        __qt_setDeclHandler_QXmlDeclHandler(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDeclHandler_QXmlDeclHandler(long __this__nativeId, long handler);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcEntityResolver = handler;
        }
        __qt_setEntityResolver_QXmlEntityResolver(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEntityResolver_QXmlEntityResolver(long __this__nativeId, long handler);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcErrorHandler = handler;
        }
        __qt_setErrorHandler_QXmlErrorHandler(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setErrorHandler_QXmlErrorHandler(long __this__nativeId, long handler);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setFeature(java.lang.String name, boolean value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeature_String_boolean(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setFeature_String_boolean(long __this__nativeId, java.lang.String name, boolean value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface handler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcLexicalHandler = handler;
        }
        __qt_setLexicalHandler_QXmlLexicalHandler(nativeId(), handler == null ? 0 : handler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLexicalHandler_QXmlLexicalHandler(long __this__nativeId, long handler);

/**
@exclude
*/

    public static native QXmlSimpleReader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlSimpleReader(QPrivateConstructor p) { super(p); } 
}
