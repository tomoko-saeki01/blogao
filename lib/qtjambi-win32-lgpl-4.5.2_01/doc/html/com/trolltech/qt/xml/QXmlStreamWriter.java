package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamWriter class provides an XML writer with a simple streaming API. QXmlStreamWriter is the pendent to {@link com.trolltech.qt.xml.QXmlStreamReader QXmlStreamReader} for writing XML. Like its related class, it operates on a {@link com.trolltech.qt.core.QIODevice QIODevice} specified with {@link com.trolltech.qt.xml.QXmlStreamWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. The API is simple and straight forward: For every XML token or event you want to write, the writer provides a specialized function. <p>You start a document with {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartDocument() writeStartDocument()} and end it with {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndDocument() writeEndDocument()}. This will implicitly close all remaining open tags. <p>Element tags are opened with {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} followed by {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()} or {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttributes(com.trolltech.qt.xml.QXmlStreamAttributes) writeAttributes()}, element content, and then {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndElement() writeEndElement()}. A shorter form {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()} can be used to write empty elements, followed by {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttributes(com.trolltech.qt.xml.QXmlStreamAttributes) writeAttributes()}. <p>Element content consists of either characters, entity references or nested elements. It is written with {@link com.trolltech.qt.xml.QXmlStreamWriter#writeCharacters(java.lang.String) writeCharacters()}, which also takes care of escaping all forbidden characters and character sequences, {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEntityReference(java.lang.String) writeEntityReference()}, or subsequent calls to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()}. A convenience method {@link com.trolltech.qt.xml.QXmlStreamWriter#writeTextElement(java.lang.String, java.lang.String, java.lang.String) writeTextElement()} can be used for writing terminal elements that contain nothing but text. <p>QXmlStreamWriter takes care of prefixing namespaces, all you have to do is specify the <tt>namespaceUri</tt> when writing elements or attributes. If you must conform to certain prefixes, you can force the writer to use them by declaring the namespaces manually with either {@link com.trolltech.qt.xml.QXmlStreamWriter#writeNamespace(java.lang.String) writeNamespace()} or {@link com.trolltech.qt.xml.QXmlStreamWriter#writeDefaultNamespace(java.lang.String) writeDefaultNamespace()}. Alternatively, you can bypass the stream writer's namespace support and use overloaded methods that take a qualified name instead. The namespace http://www.w3.org/XML/1998/namespace is implicit and mapped to the prefix xml. <p>The stream writer can automatically format the generated XML data by adding line-breaks and indentation to empty sections between elements, making the XML data more readable for humans and easier to work with for most source code management systems. The feature can be turned on with the {@link QXmlStreamWriter#autoFormatting() autoFormatting} property, and customized with the {@link QXmlStreamWriter#autoFormattingIndent() autoFormattingIndent} property. <p>Other functions are {@link com.trolltech.qt.xml.QXmlStreamWriter#writeCDATA(java.lang.String) writeCDATA()}, {@link com.trolltech.qt.xml.QXmlStreamWriter#writeComment(java.lang.String) writeComment()}, {@link com.trolltech.qt.xml.QXmlStreamWriter#writeProcessingInstruction(java.lang.String) writeProcessingInstruction()}, and {@link com.trolltech.qt.xml.QXmlStreamWriter#writeDTD(java.lang.String) writeDTD()}. Chaining of XML streams is supported with {@link com.trolltech.qt.xml.QXmlStreamWriter#writeCurrentToken(com.trolltech.qt.xml.QXmlStreamReader) writeCurrentToken()}. <p>By default, QXmlStreamWriter encodes XML in UTF-8. Different encodings can be enforced using {@link com.trolltech.qt.xml.QXmlStreamWriter#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <p>The {@link <a href="../xml-streambookmarks.html">QXmlStream Bookmarks Example</a>} illustrates how to use a subclassed stream writer to write an XML bookmark file (XBEL) that was previously read in by a {@link com.trolltech.qt.xml.QXmlStreamReader QXmlStreamReader}.
*/
@QtJambiGeneratedClass
public class QXmlStreamWriter extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    private Object __rcCodec = null;

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a stream writer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    public QXmlStreamWriter(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamWriter();
    }

    native void __qt_QXmlStreamWriter();

    private QXmlStreamWriter(com.trolltech.qt.QNativePointer array){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamWriter_nativepointer(array);
    }

    native void __qt_QXmlStreamWriter_nativepointer(com.trolltech.qt.QNativePointer array);

/**
Constructs a stream writer that writes into <tt>device</tt>;
*/

    public QXmlStreamWriter(com.trolltech.qt.core.QIODevice device){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamWriter_QIODevice(device == null ? 0 : device.nativeId());
    }

    native void __qt_QXmlStreamWriter_QIODevice(long device);

/**
the auto-formatting flag of the stream writer <p>This property controls whether or not the stream writer automatically formats the generated XML data. If enabled, the writer automatically adds line-breaks and indentation to empty sections between elements (ignorable whitespace). The main purpose of auto-formatting is to split the data into several lines, and to increase readability for a human reader. The indentation depth can be controlled through the {@link QXmlStreamWriter#autoFormattingIndent() autoFormattingIndent} property. <p>By default, auto-formatting is disabled.
*/

    @QtBlockedSlot
    public final boolean autoFormatting()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoFormatting(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoFormatting(long __this__nativeId);

/**
This property holds the number of spaces or tabs used for indentation when auto-formatting is enabled. Positive numbers indicate spaces, negative numbers tabs.. The default indentation is 4. <p><DT><b>See also:</b><br><DD>{@link QXmlStreamWriter#autoFormatting() autoFormatting}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int autoFormattingIndent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoFormattingIndent(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autoFormattingIndent(long __this__nativeId);

/**
Returns the codec that is currently assigned to the stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec codec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_codec(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_codec(long __this__nativeId);

/**
Returns the current device associated with the QXmlStreamWriter, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_device(long __this__nativeId);

/**
the auto-formatting flag of the stream writer <p>This property controls whether or not the stream writer automatically formats the generated XML data. If enabled, the writer automatically adds line-breaks and indentation to empty sections between elements (ignorable whitespace). The main purpose of auto-formatting is to split the data into several lines, and to increase readability for a human reader. The indentation depth can be controlled through the {@link QXmlStreamWriter#autoFormattingIndent() autoFormattingIndent} property. <p>By default, auto-formatting is disabled.
*/

    @QtBlockedSlot
    public final void setAutoFormatting(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoFormatting_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoFormatting_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the number of spaces or tabs used for indentation when auto-formatting is enabled. Positive numbers indicate spaces, negative numbers tabs.. The default indentation is 4. <p><DT><b>See also:</b><br><DD>{@link QXmlStreamWriter#autoFormatting() autoFormatting}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoFormattingIndent(int spacesOrTabs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoFormattingIndent_int(nativeId(), spacesOrTabs);
    }
    @QtBlockedSlot
    native void __qt_setAutoFormattingIndent_int(long __this__nativeId, int spacesOrTabs);

/**
Sets the codec for this stream to <tt>codec</tt>. The codec is used for encoding any data that is written. By default, QXmlStreamWriter uses UTF-8. <p>The encoding information is stored in the initial xml tag which gets written when you call {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartDocument() writeStartDocument()}. Call this function before calling {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartDocument() writeStartDocument()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#codec() codec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCodec(com.trolltech.qt.core.QTextCodec codec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcCodec = codec;
        }
        __qt_setCodec_QTextCodec(nativeId(), codec == null ? 0 : codec.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCodec_QTextCodec(long __this__nativeId, long codec);

    @QtBlockedSlot
    private final void setCodec(com.trolltech.qt.QNativePointer codecName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCodec_nativepointer(nativeId(), codecName);
    }
    @QtBlockedSlot
    native void __qt_setCodec_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer codecName);

/**
Sets the current device to <tt>device</tt>. If you want the stream to write into a {@link com.trolltech.qt.core.QByteArray QByteArray}, you can create a {@link com.trolltech.qt.core.QBuffer QBuffer} device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#device() device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice device)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = device;
        }
        __qt_setDevice_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDevice_QIODevice(long __this__nativeId, long device);

/**
Writes an attribute with <tt>name</tt> and <tt>value</tt>, prefixed for the specified <tt>namespaceUri</tt>. If the namespace has not been declared yet, QXmlStreamWriter will generate a namespace declaration for it. <p>This function can only be called after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} before any content is written, or after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}.
*/

    @QtBlockedSlot
    public final void writeAttribute(java.lang.String namespaceUri, java.lang.String name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeAttribute_String_String_String(nativeId(), namespaceUri, name, value);
    }
    @QtBlockedSlot
    native void __qt_writeAttribute_String_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name, java.lang.String value);

/**
This is an overloaded member function, provided for convenience. <p>Writes an attribute with <tt>qualifiedName</tt> and <tt>value</tt>. <p>This function can only be called after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} before any content is written, or after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}.
*/

    @QtBlockedSlot
    public final void writeAttribute(java.lang.String qualifiedName, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeAttribute_String_String(nativeId(), qualifiedName, value);
    }
    @QtBlockedSlot
    native void __qt_writeAttribute_String_String(long __this__nativeId, java.lang.String qualifiedName, java.lang.String value);

/**
This is an overloaded member function, provided for convenience. <p>Writes the <tt>attribute</tt>. <p>This function can only be called after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} before any content is written, or after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}.
*/

    @QtBlockedSlot
    public final void writeAttribute(com.trolltech.qt.xml.QXmlStreamAttribute attribute)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeAttribute_QXmlStreamAttribute(nativeId(), attribute == null ? 0 : attribute.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeAttribute_QXmlStreamAttribute(long __this__nativeId, long attribute);

/**
Writes the attribute vector <tt>attributes</tt>. If a namespace referenced in an attribute not been declared yet, QXmlStreamWriter will generate a namespace declaration for it. <p>This function can only be called after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} before any content is written, or after {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()}, and {@link com.trolltech.qt.xml.QXmlStreamWriter#writeNamespace(java.lang.String) writeNamespace()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeAttributes(com.trolltech.qt.xml.QXmlStreamAttributes attributes)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeAttributes_QXmlStreamAttributes(nativeId(), attributes == null ? 0 : attributes.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeAttributes_QXmlStreamAttributes(long __this__nativeId, long attributes);

/**
Writes <tt>text</tt> as CDATA section. If <tt>text</tt> contains the forbidden character sequence "]]&gt;", it is split into different CDATA sections. <p>This function mainly exists for completeness. Normally you should not need use it, because {@link com.trolltech.qt.xml.QXmlStreamWriter#writeCharacters(java.lang.String) writeCharacters()} automatically escapes all non-content characters.
*/

    @QtBlockedSlot
    public final void writeCDATA(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeCDATA_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_writeCDATA_String(long __this__nativeId, java.lang.String text);

/**
Writes <tt>text</tt>. The characters "&lt;", "&", and """ are escaped as entity references "&lt;", "&amp;, and "&quot;". To avoid the forbidden sequence "]]&gt;", "&gt;" is also escaped as "&gt;". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeEntityReference(java.lang.String) writeEntityReference()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeCharacters(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeCharacters_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_writeCharacters_String(long __this__nativeId, java.lang.String text);

/**
Writes <tt>text</tt> as XML comment, where <tt>text</tt> must not contain the forbidden sequence "--" or end with "-". Note that XML does not provide any way to escape "-" in a comment.
*/

    @QtBlockedSlot
    public final void writeComment(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeComment_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_writeComment_String(long __this__nativeId, java.lang.String text);

/**
Writes the current state of the <tt>reader</tt>. All possible valid states are supported. <p>The purpose of this function is to support chained processing of XML data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() QXmlStreamReader::tokenType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeCurrentToken(com.trolltech.qt.xml.QXmlStreamReader reader)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeCurrentToken_QXmlStreamReader(nativeId(), reader == null ? 0 : reader.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeCurrentToken_QXmlStreamReader(long __this__nativeId, long reader);

/**
Writes a DTD section. The <tt>dtd</tt> represents the entire doctypedecl production from the XML 1.0 specification.
*/

    @QtBlockedSlot
    public final void writeDTD(java.lang.String dtd)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeDTD_String(nativeId(), dtd);
    }
    @QtBlockedSlot
    native void __qt_writeDTD_String(long __this__nativeId, java.lang.String dtd);

/**
Writes a default namespace declaration for <tt>namespaceUri</tt>. <p>If {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} or {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()} was called, the declaration applies to the current element; otherwise it applies to the next child element. <p>Note that the namespaces http://www.w3.org/XML/1998/namespace (bound to xmlns) and http://www.w3.org/2000/xmlns/ (bound to xml) by definition cannot be declared as default.
*/

    @QtBlockedSlot
    public final void writeDefaultNamespace(java.lang.String namespaceUri)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeDefaultNamespace_String(nativeId(), namespaceUri);
    }
    @QtBlockedSlot
    native void __qt_writeDefaultNamespace_String(long __this__nativeId, java.lang.String namespaceUri);

/**
Writes an empty element with <tt>name</tt>, prefixed for the specified <tt>namespaceUri</tt>. If the namespace has not been declared, QXmlStreamWriter will generate a namespace declaration for it. Subsequent calls to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()} will add attributes to this element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeNamespace(java.lang.String) writeNamespace()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeEmptyElement(java.lang.String namespaceUri, java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeEmptyElement_String_String(nativeId(), namespaceUri, name);
    }
    @QtBlockedSlot
    native void __qt_writeEmptyElement_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Writes an empty element with qualified name <tt>qualifiedName</tt>. Subsequent calls to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()} will add attributes to this element.
*/

    @QtBlockedSlot
    public final void writeEmptyElement(java.lang.String qualifiedName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeEmptyElement_String(nativeId(), qualifiedName);
    }
    @QtBlockedSlot
    native void __qt_writeEmptyElement_String(long __this__nativeId, java.lang.String qualifiedName);

/**
Closes all remaining open start elements and writes a newline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartDocument() writeStartDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeEndDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeEndDocument(nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeEndDocument(long __this__nativeId);

/**
Closes the previous start element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeEndElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeEndElement(nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeEndElement(long __this__nativeId);

/**
Writes the entity reference <tt>name</tt> to the stream, as "&<tt>name</tt>;".
*/

    @QtBlockedSlot
    public final void writeEntityReference(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeEntityReference_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_writeEntityReference_String(long __this__nativeId, java.lang.String name);


/**
Writes a namespace declaration for <tt>namespaceUri</tt> with <tt>prefix</tt>. If <tt>prefix</tt> is empty, QXmlStreamWriter assigns a unique prefix consisting of the letter 'n' followed by a number. <p>If {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} or {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()} was called, the declaration applies to the current element; otherwise it applies to the next child element. <p>Note that the prefix xml is both predefined and reserved for http://www.w3.org/XML/1998/namespace, which in turn cannot be bound to any other prefix. The prefix xmlns and its URI http://www.w3.org/2000/xmlns/ are used for the namespace mechanism itself and thus completely forbidden in declarations.
*/

    @QtBlockedSlot
    public final void writeNamespace(java.lang.String namespaceUri) {
        writeNamespace(namespaceUri, (java.lang.String)null);
    }
/**
Writes a namespace declaration for <tt>namespaceUri</tt> with <tt>prefix</tt>. If <tt>prefix</tt> is empty, QXmlStreamWriter assigns a unique prefix consisting of the letter 'n' followed by a number. <p>If {@link com.trolltech.qt.xml.QXmlStreamWriter#writeStartElement(java.lang.String, java.lang.String) writeStartElement()} or {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()} was called, the declaration applies to the current element; otherwise it applies to the next child element. <p>Note that the prefix xml is both predefined and reserved for http://www.w3.org/XML/1998/namespace, which in turn cannot be bound to any other prefix. The prefix xmlns and its URI http://www.w3.org/2000/xmlns/ are used for the namespace mechanism itself and thus completely forbidden in declarations.
*/

    @QtBlockedSlot
    public final void writeNamespace(java.lang.String namespaceUri, java.lang.String prefix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeNamespace_String_String(nativeId(), namespaceUri, prefix);
    }
    @QtBlockedSlot
    native void __qt_writeNamespace_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String prefix);


/**
Writes an XML processing instruction with <tt>target</tt> and <tt>data</tt>, where <tt>data</tt> must not contain the sequence "?&gt;".
*/

    @QtBlockedSlot
    public final void writeProcessingInstruction(java.lang.String target) {
        writeProcessingInstruction(target, (java.lang.String)null);
    }
/**
Writes an XML processing instruction with <tt>target</tt> and <tt>data</tt>, where <tt>data</tt> must not contain the sequence "?&gt;".
*/

    @QtBlockedSlot
    public final void writeProcessingInstruction(java.lang.String target, java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeProcessingInstruction_String_String(nativeId(), target, data);
    }
    @QtBlockedSlot
    native void __qt_writeProcessingInstruction_String_String(long __this__nativeId, java.lang.String target, java.lang.String data);

/**
This is an overloaded member function, provided for convenience. <p>Writes a document start with XML version number "1.0". This also writes the encoding information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndDocument() writeEndDocument()}, and {@link com.trolltech.qt.xml.QXmlStreamWriter#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeStartDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeStartDocument(nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeStartDocument(long __this__nativeId);

/**
Writes a document start with the XML version number <tt>version</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndDocument() writeEndDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeStartDocument(java.lang.String version)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeStartDocument_String(nativeId(), version);
    }
    @QtBlockedSlot
    native void __qt_writeStartDocument_String(long __this__nativeId, java.lang.String version);

/**
Writes a document start with the XML version number <tt>version</tt> and a standalone attribute <tt>standalone</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndDocument() writeEndDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeStartDocument(java.lang.String version, boolean standalone)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeStartDocument_String_boolean(nativeId(), version, standalone);
    }
    @QtBlockedSlot
    native void __qt_writeStartDocument_String_boolean(long __this__nativeId, java.lang.String version, boolean standalone);

/**
Writes a start element with <tt>name</tt>, prefixed for the specified <tt>namespaceUri</tt>. If the namespace has not been declared yet, QXmlStreamWriter will generate a namespace declaration for it. Subsequent calls to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()} will add attributes to this element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeNamespace(java.lang.String) writeNamespace()}, {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndElement() writeEndElement()}, and {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeStartElement(java.lang.String namespaceUri, java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeStartElement_String_String(nativeId(), namespaceUri, name);
    }
    @QtBlockedSlot
    native void __qt_writeStartElement_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Writes a start element with <tt>qualifiedName</tt>. Subsequent calls to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttribute(java.lang.String, java.lang.String, java.lang.String) writeAttribute()} will add attributes to this element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamWriter#writeEndElement() writeEndElement()}, and {@link com.trolltech.qt.xml.QXmlStreamWriter#writeEmptyElement(java.lang.String, java.lang.String) writeEmptyElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void writeStartElement(java.lang.String qualifiedName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeStartElement_String(nativeId(), qualifiedName);
    }
    @QtBlockedSlot
    native void __qt_writeStartElement_String(long __this__nativeId, java.lang.String qualifiedName);

/**
Writes a text element with <tt>name</tt>, prefixed for the specified <tt>namespaceUri</tt>, and <tt>text</tt>. If the namespace has not been declared, QXmlStreamWriter will generate a namespace declaration for it. <p>This is a convenience function equivalent to: <pre class="snippet">
        writeStartElement(namespaceUri, name);
        writeCharacters(text);
        writeEndElement();
</pre>
*/

    @QtBlockedSlot
    public final void writeTextElement(java.lang.String namespaceUri, java.lang.String name, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTextElement_String_String_String(nativeId(), namespaceUri, name, text);
    }
    @QtBlockedSlot
    native void __qt_writeTextElement_String_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Writes a text element with <tt>qualifiedName</tt> and <tt>text</tt>. <p>This is a convenience function equivalent to: <pre class="snippet">
        writeStartElement(qualifiedName);
        writeCharacters(text);
        writeEndElement();
</pre>
*/

    @QtBlockedSlot
    public final void writeTextElement(java.lang.String qualifiedName, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTextElement_String_String(nativeId(), qualifiedName, text);
    }
    @QtBlockedSlot
    native void __qt_writeTextElement_String_String(long __this__nativeId, java.lang.String qualifiedName, java.lang.String text);

/**
@exclude
*/

    public static native QXmlStreamWriter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamWriter(QPrivateConstructor p) { super(p); } 

/**
Constructs a stream writer that writes into <tt>array</tt>. This is the
same as creating an xml writer that operates on a QBuffer device
which in turn operates on <tt>array</tt>.
*/

    public QXmlStreamWriter(com.trolltech.qt.core.QByteArray array) {
        this(array.nativePointer());
        __rcDevice = array;
    }

/**
Sets the codec for this stream to the QTextCodec for the encoding
specified by <tt>codecName</tt>. Common values for \c codecName include
"ISO 8859-1", "UTF-8", and "UTF-16". If the encoding isn't
recognized, nothing happens.
*/

    public final void setCodec(String codecName) {
        setCodec(QNativePointer.createCharPointer(codecName));
        __rcCodec = null;
    }

}
