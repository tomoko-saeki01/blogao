package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamReader class provides a fast parser for reading well-formed XML via a simple streaming API. QXmlStreamReader is a faster and more convenient replacement for Qt's own SAX parser (see {@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}). In some cases it might also be a faster and more convenient alternative for use in applications that would otherwise use a DOM tree (see {@link com.trolltech.qt.xml.QDomDocument QDomDocument}). QXmlStreamReader reads data either from a {@link com.trolltech.qt.core.QIODevice QIODevice} (see {@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}), or from a raw {@link com.trolltech.qt.core.QByteArray QByteArray} (see {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}). <p>Qt provides {@link com.trolltech.qt.xml.QXmlStreamWriter QXmlStreamWriter} for writing XML. <p>The basic concept of a stream reader is to report an XML document as a stream of tokens, similar to SAX. The main difference between QXmlStreamReader and SAX is how these XML tokens are reported. With SAX, the application must provide handlers (callback functions) that receive so-called XML events from the parser at the parser's convenience. With QXmlStreamReader, the application code itself drives the loop and pulls tokens from the reader, one after another, as it needs them. This is done by calling {@link com.trolltech.qt.xml.QXmlStreamReader#readNext() readNext()}, where the reader reads from the input stream until it completes the next token, at which point it returns the {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()}. A set of convenient functions including {@link com.trolltech.qt.xml.QXmlStreamReader#isStartElement() isStartElement()} and {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()} can then be used to examine the token to obtain information about what has been read. The big advantage of this pulling approach is the possibility to build recursive descent parsers with it, meaning you can split your XML parsing code easily into different methods or classes. This makes it easy to keep track of the application's own state when parsing XML. <p>A typical loop with QXmlStreamReader looks like this: <pre class="snippet">
        QXmlStreamReader xml = new QXmlStreamReader();
        //...
        while (!xml.atEnd()) {
            xml.readNext();
            // do processing ...
        }
        if (xml.hasError()) {
            // do error handling ...
        }
</pre> QXmlStreamReader is a well-formed XML 1.0 parser that does not include external parsed entities. As long as no error occurs, the application code can thus be assured that the data provided by the stream reader satisfies the W3C's criteria for well-formed XML. For example, you can be certain that all tags are indeed nested and closed properly, that references to internal entities have been replaced with the correct replacement text, and that attributes have been normalized or added according to the internal subset of the DTD. <p>If an error occurs while parsing, {@link com.trolltech.qt.xml.QXmlStreamReader#atEnd() atEnd()} and {@link com.trolltech.qt.xml.QXmlStreamReader#hasError() hasError()} return true, and {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} returns the error that occurred. The functions {@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}, {@link com.trolltech.qt.xml.QXmlStreamReader#lineNumber() lineNumber()}, {@link com.trolltech.qt.xml.QXmlStreamReader#columnNumber() columnNumber()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#characterOffset() characterOffset()} are for constructing an appropriate error or warning message. To simplify application code, QXmlStreamReader contains a {@link com.trolltech.qt.xml.QXmlStreamReader#raiseError() raiseError()} mechanism that lets you raise custom errors that trigger the same error handling described. <p>The {@link <a href="../xml-streambookmarks.html">QXmlStream Bookmarks Example</a>} illustrates how to use the recursive descent technique with a subclassed stream reader to read an XML bookmark file (XBEL).<a name="namespaces"><h2>Namespaces</h2> QXmlStream understands and resolves XML namespaces. E.g. in case of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }, {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()} returns the namespace the element is in, and {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()} returns the element's local name. The combination of namespaceUri and name uniquely identifies an element. If a namespace prefix was not declared in the XML entities parsed by the reader, the namespaceUri is empty. <p>If you parse XML data that does not utilize namespaces according to the XML specification or doesn't use namespaces at all, you can use the element's {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()} instead. A qualified name is the element's {@link com.trolltech.qt.xml.QXmlStreamReader#prefix() prefix()} followed by colon followed by the element's local {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()} - exactly like the element appears in the raw XML data. Since the mapping namespaceUri to prefix is neither unique nor universal, {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()} should be avoided for namespace-compliant XML data. <p>In order to parse standalone documents that do use undeclared namespace prefixes, you can turn off namespace processing completely with the {@link QXmlStreamReader#namespaceProcessing() namespaceProcessing} property.<a name="incremental-parsing"><h2>Incremental parsing</h2> QXmlStreamReader is an incremental parser. It can handle the case where the document can't be parsed all at once because it arrives in chunks (e.g. from multiple files, or over a network connection). When the reader runs out of data before the complete document has been parsed, it reports a {@link com.trolltech.qt.xml.QXmlStreamReader.Error PrematureEndOfDocumentError }. When more data arrives, either because of a call to {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()} or because more data is available through the network {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}, the reader recovers from the {@link com.trolltech.qt.xml.QXmlStreamReader.Error PrematureEndOfDocumentError } error and continues parsing the new data with the next call to {@link com.trolltech.qt.xml.QXmlStreamReader#readNext() readNext()}. <p>For example, if you read data from the network using {@link com.trolltech.qt.network.QHttp QHttp}, you would connect its {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal to a custom slot. In this slot, you read all available data with {@link com.trolltech.qt.network.QHttp#readAll() readAll()} and pass it to the XML stream reader using {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}. Then you call your custom parsing function that reads the XML events from the reader.<a name="performance-and-memory-consumption"><h2>Performance and memory consumption</h2> QXmlStreamReader is memory-conservative by design, since it doesn't store the entire XML document tree in memory, but only the current token at the time it is reported. In addition, QXmlStreamReader avoids the many small string allocations that it normally takes to map an XML document to a convenient and Qt-ish API. It does this by reporting all string data as QStringRef rather than real QString objects. QStringRef is a thin wrapper around QString substrings that provides a subset of the QString API without the memory allocation and reference-counting overhead. Calling toString() on any of those objects returns an equivalent real QString object.
*/
@QtJambiGeneratedClass
public class QXmlStreamReader extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    private Object __rcEntityResolver = null;

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }
/**
This enum specifies different error cases
*/

    public enum Error implements com.trolltech.qt.QtEnumerator {
/**
 No error has occurred.
*/

        NoError(0),
/**
 The parser encountered an element that was different to those it expected.
*/

        UnexpectedElementError(1),
/**
 A custom error has been raised with {@link com.trolltech.qt.xml.QXmlStreamReader#raiseError() raiseError()}
*/

        CustomError(2),
/**
 The parser internally raised an error due to the read XML not being well-formed.
*/

        NotWellFormedError(3),
/**
 The input stream ended before a well-formed XML document was parsed. Recovery from this error is possible if more XML arrives in the stream, either by calling {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()} or by waiting for it to arrive on the {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}.
*/

        PrematureEndOfDocumentError(4);

        Error(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QXmlStreamReader$Error constant with the specified <tt>int</tt>.</brief>
*/

        public static Error resolve(int value) {
            return (Error) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return UnexpectedElementError;
            case 2: return CustomError;
            case 3: return NotWellFormedError;
            case 4: return PrematureEndOfDocumentError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies the type of token the reader just read.
*/

    public enum TokenType implements com.trolltech.qt.QtEnumerator {
/**
 The reader has not yet read anything.
*/

        NoToken(0),
/**
 An error has occurred, reported in {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} and {@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}.
*/

        Invalid(1),
/**
 The reader reports the XML version number in {@link com.trolltech.qt.xml.QXmlStreamReader#documentVersion() documentVersion()}, and the encoding as specified in the XML document in {@link com.trolltech.qt.xml.QXmlStreamReader#documentEncoding() documentEncoding()}. If the document is declared standalone, {@link com.trolltech.qt.xml.QXmlStreamReader#isStandaloneDocument() isStandaloneDocument()} returns true; otherwise it returns false.
*/

        StartDocument(2),
/**
 The reader reports the end of the document.
*/

        EndDocument(3),
/**
 The reader reports the start of an element with {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()} and {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}. Empty elements are also reported as {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }, followed directly by {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }. The convenience function {@link com.trolltech.qt.xml.QXmlStreamReader#readElementText() readElementText()} can be called to concatenate all content until the corresponding {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }. Attributes are reported in {@link com.trolltech.qt.xml.QXmlStreamReader#attributes() attributes()}, namespace declarations in {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceDeclarations() namespaceDeclarations()}.
*/

        StartElement(4),
/**
 The reader reports the end of an element with {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()} and {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}.
*/

        EndElement(5),
/**
 The reader reports characters in {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}. If the characters are all white-space, {@link com.trolltech.qt.xml.QXmlStreamReader#isWhitespace() isWhitespace()} returns true. If the characters stem from a CDATA section, {@link com.trolltech.qt.xml.QXmlStreamReader#isCDATA() isCDATA()} returns true.
*/

        Characters(6),
/**
 The reader reports a comment in {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}.
*/

        Comment(7),
/**
 The reader reports a DTD in {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}, notation declarations in {@link com.trolltech.qt.xml.QXmlStreamReader#notationDeclarations() notationDeclarations()}, and entity declarations in {@link com.trolltech.qt.xml.QXmlStreamReader#entityDeclarations() entityDeclarations()}. Details of the DTD declaration are reported in in {@link com.trolltech.qt.xml.QXmlStreamReader#dtdName() dtdName()}, {@link com.trolltech.qt.xml.QXmlStreamReader#dtdPublicId() dtdPublicId()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#dtdSystemId() dtdSystemId()}.
*/

        DTD(8),
/**
 The reader reports an entity reference that could not be resolved. The name of the reference is reported in {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}, the replacement text in {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}.
*/

        EntityReference(9),
/**
 The reader reports a processing instruction in {@link com.trolltech.qt.xml.QXmlStreamReader#processingInstructionTarget() processingInstructionTarget()} and {@link com.trolltech.qt.xml.QXmlStreamReader#processingInstructionData() processingInstructionData()}.
*/

        ProcessingInstruction(10);

        TokenType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QXmlStreamReader$TokenType constant with the specified <tt>int</tt>.</brief>
*/

        public static TokenType resolve(int value) {
            return (TokenType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoToken;
            case 1: return Invalid;
            case 2: return StartDocument;
            case 3: return EndDocument;
            case 4: return StartElement;
            case 5: return EndElement;
            case 6: return Characters;
            case 7: return Comment;
            case 8: return DTD;
            case 9: return EntityReference;
            case 10: return ProcessingInstruction;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a stream reader. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}. <br></DD></DT>
*/

    public QXmlStreamReader(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamReader();
    }

    native void __qt_QXmlStreamReader();

/**
Creates a new stream reader that reads from <tt>device</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}. <br></DD></DT>
*/

    public QXmlStreamReader(com.trolltech.qt.core.QIODevice device){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamReader_QIODevice(device == null ? 0 : device.nativeId());
    }

    native void __qt_QXmlStreamReader_QIODevice(long device);

/**
Creates a new stream reader that reads from <tt>data</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}, {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    public QXmlStreamReader(com.trolltech.qt.core.QByteArray data){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamReader_QByteArray(data == null ? 0 : data.nativeId());
    }

    native void __qt_QXmlStreamReader_QByteArray(long data);

/**
Creates a new stream reader that reads from <tt>data</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}, {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    public QXmlStreamReader(java.lang.String data){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamReader_String(data);
    }

    native void __qt_QXmlStreamReader_String(java.lang.String data);

/**
Adds more <tt>data</tt> for the reader to read. This function does nothing if the reader has a {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#readNext() readNext()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addData(com.trolltech.qt.core.QByteArray data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addData_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addData_QByteArray(long __this__nativeId, long data);

/**
Adds more <tt>data</tt> for the reader to read. This function does nothing if the reader has a {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#readNext() readNext()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addData(java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addData_String(nativeId(), data);
    }
    @QtBlockedSlot
    native void __qt_addData_String(long __this__nativeId, java.lang.String data);

/**
Adds an <tt>extraNamespaceDeclaration</tt>. The declaration will be valid for children of the current element, or - should the function be called before any elements are read - for the entire XML document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#namespaceDeclarations() namespaceDeclarations()}, {@link com.trolltech.qt.xml.QXmlStreamReader#addExtraNamespaceDeclarations(java.util.List) addExtraNamespaceDeclarations()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#setNamespaceProcessing(boolean) setNamespaceProcessing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addExtraNamespaceDeclaration(com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration extraNamespaceDeclaraction)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addExtraNamespaceDeclaration_QXmlStreamNamespaceDeclaration(nativeId(), extraNamespaceDeclaraction == null ? 0 : extraNamespaceDeclaraction.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addExtraNamespaceDeclaration_QXmlStreamNamespaceDeclaration(long __this__nativeId, long extraNamespaceDeclaraction);

/**

*/

    @QtBlockedSlot
    public final void addExtraNamespaceDeclarations(java.util.List<com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration> extraNamespaceDeclaractions)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addExtraNamespaceDeclarations_List(nativeId(), extraNamespaceDeclaractions);
    }
    @QtBlockedSlot
    native void __qt_addExtraNamespaceDeclarations_List(long __this__nativeId, java.util.List<com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration> extraNamespaceDeclaractions);

/**
Returns true if the reader has read until the end of the XML document, or if an {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} has occurred and reading has been aborted. Otherwise, it returns false. <p>When {@link com.trolltech.qt.xml.QXmlStreamReader#atEnd() atEnd()} and {@link com.trolltech.qt.xml.QXmlStreamReader#hasError() hasError()} return true and {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} returns {@link com.trolltech.qt.xml.QXmlStreamReader.Error PrematureEndOfDocumentError }, it means the XML has been well-formed so far, but a complete XML document has not been parsed. The next chunk of XML can be added with {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}, if the XML is being read from a {@link com.trolltech.qt.core.QByteArray QByteArray}, or by waiting for more data to arrive if the XML is being read from a {@link com.trolltech.qt.core.QIODevice QIODevice}. Either way, {@link com.trolltech.qt.xml.QXmlStreamReader#atEnd() atEnd()} will return false once more adata is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#hasError() hasError()}, {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()}, {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}, and {@link com.trolltech.qt.core.QIODevice#atEnd() QIODevice::atEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
Returns the attributes of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamAttributes attributes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributes(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlStreamAttributes __qt_attributes(long __this__nativeId);

/**
Returns the current character offset, starting with 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#lineNumber() lineNumber()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#columnNumber() columnNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long characterOffset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_characterOffset(nativeId());
    }
    @QtBlockedSlot
    native long __qt_characterOffset(long __this__nativeId);

/**
Removes any {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()} or data from the reader and resets its internal state to the initial state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
        __rcDevice = null; // clear() call removes device from stream


    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns the current column number, starting with 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#lineNumber() lineNumber()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#characterOffset() characterOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long columnNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnNumber(nativeId());
    }
    @QtBlockedSlot
    native long __qt_columnNumber(long __this__nativeId);

/**
Returns the current device associated with the QXmlStreamReader, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartDocument }, this function returns the encoding string as specified in the XML declaration. Otherwise an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String documentEncoding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentEncoding(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_documentEncoding(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartDocument }, this function returns the version string as specified in the XML declaration. Otherwise an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String documentVersion()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentVersion(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_documentVersion(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, this function returns the DTD's name. Otherwise an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String dtdName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dtdName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dtdName(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, this function returns the DTD's public identifier. Otherwise an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String dtdPublicId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dtdPublicId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dtdPublicId(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, this function returns the DTD's system identifier. Otherwise an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String dtdSystemId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dtdSystemId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dtdSystemId(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, this function returns the DTD's unparsed (external) entity declarations. Otherwise an empty vector is returned. <p>The QXmlStreamEntityDeclarations class is defined to be a QVector of {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration QXmlStreamEntityDeclaration}.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamEntityDeclaration> entityDeclarations()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entityDeclarations(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamEntityDeclaration> __qt_entityDeclarations(long __this__nativeId);

/**
Returns the entity resolver, or 0 if there is no entity resolver. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#setEntityResolver(com.trolltech.qt.core.QXmlStreamEntityResolver) setEntityResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QXmlStreamEntityResolver entityResolver()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entityResolver(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QXmlStreamEntityResolver __qt_entityResolver(long __this__nativeId);

/**
Returns the type of the current error, or {@link com.trolltech.qt.xml.QXmlStreamReader.Error NoError } if no error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#raiseError() raiseError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamReader.Error error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.xml.QXmlStreamReader.Error.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns the error message that was set with {@link com.trolltech.qt.xml.QXmlStreamReader#raiseError() raiseError()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#error() error()}, {@link com.trolltech.qt.xml.QXmlStreamReader#lineNumber() lineNumber()}, {@link com.trolltech.qt.xml.QXmlStreamReader#columnNumber() columnNumber()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#characterOffset() characterOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns <tt>true</tt> if an error has occurred, otherwise <tt>false</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasError()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasError(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasError(long __this__nativeId);

/**
Returns true if the reader reports characters that stem from a CDATA section; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#isCharacters() isCharacters()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCDATA()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCDATA(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCDATA(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Characters }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#isWhitespace() isWhitespace()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#isCDATA() isCDATA()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCharacters()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCharacters(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCharacters(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Comment }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isComment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isComment(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isComment(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isDTD()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDTD(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDTD(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndDocument }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEndDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEndDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEndDocument(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEndElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEndElement(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEndElement(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EntityReference }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEntityReference()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEntityReference(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEntityReference(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType ProcessingInstruction }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isProcessingInstruction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isProcessingInstruction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isProcessingInstruction(long __this__nativeId);

/**
Returns true if this document has been declared standalone in the XML declaration; otherwise returns false. <p>If no XML declaration has been parsed, this function returns false.
*/

    @QtBlockedSlot
    public final boolean isStandaloneDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isStandaloneDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isStandaloneDocument(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartDocument }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isStartDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isStartDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isStartDocument(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()} equals {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isStartElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isStartElement(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isStartElement(long __this__nativeId);

/**
Returns true if the reader reports characters that only consist of white-space; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#isCharacters() isCharacters()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWhitespace()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWhitespace(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWhitespace(long __this__nativeId);

/**
Returns the current line number, starting with 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#columnNumber() columnNumber()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#characterOffset() characterOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long lineNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineNumber(nativeId());
    }
    @QtBlockedSlot
    native long __qt_lineNumber(long __this__nativeId);

/**
Returns the local name of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }, {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }, or an {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EntityReference }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }, this function returns the element's namespace declarations. Otherwise an empty vector is returned. <p>The {@link com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration QXmlStreamNamespaceDeclaration} class is defined to be a QVector of {@link com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration QXmlStreamNamespaceDeclaration}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#addExtraNamespaceDeclaration(com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration) addExtraNamespaceDeclaration()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#addExtraNamespaceDeclarations(java.util.List) addExtraNamespaceDeclarations()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration> namespaceDeclarations()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceDeclarations(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration> __qt_namespaceDeclarations(long __this__nativeId);

/**
the namespace-processing flag of the stream reader <p>This property controls whether or not the stream reader processes namespaces. If enabled, the reader processes namespaces, otherwise it does not. <p>By default, namespace-processing is enabled.
*/

    @QtBlockedSlot
    public final boolean namespaceProcessing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceProcessing(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_namespaceProcessing(long __this__nativeId);

/**
Returns the namespaceUri of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement } or {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String namespaceUri()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceUri(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_namespaceUri(long __this__nativeId);

/**
If the state() is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, this function returns the DTD's notation declarations. Otherwise an empty vector is returned. <p>The QXmlStreamNotationDeclarations class is defined to be a QVector of {@link com.trolltech.qt.xml.QXmlStreamNotationDeclaration QXmlStreamNotationDeclaration}.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamNotationDeclaration> notationDeclarations()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notationDeclarations(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamNotationDeclaration> __qt_notationDeclarations(long __this__nativeId);

/**
Returns the prefix of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement } or {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String prefix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_prefix(long __this__nativeId);

/**
Returns the data of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType ProcessingInstruction }.
*/

    @QtBlockedSlot
    public final java.lang.String processingInstructionData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_processingInstructionData(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_processingInstructionData(long __this__nativeId);

/**
Returns the target of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType ProcessingInstruction }.
*/

    @QtBlockedSlot
    public final java.lang.String processingInstructionTarget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_processingInstructionTarget(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_processingInstructionTarget(long __this__nativeId);

/**
Returns the qualified name of a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement } or {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }; <p>A qualified name is the raw name of an element in the XML data. It consists of the namespace prefix, followed by colon, followed by the element's local name. Since the namespace prefix is not unique (the same prefix can point to different namespaces and different prefixes can point to the same namespace), you shouldn't use {@link com.trolltech.qt.xml.QXmlStreamReader#qualifiedName() qualifiedName()}, but the resolved {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()} and the attribute's local {@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#name() name()}, {@link com.trolltech.qt.xml.QXmlStreamReader#prefix() prefix()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#namespaceUri() namespaceUri()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String qualifiedName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_qualifiedName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_qualifiedName(long __this__nativeId);


/**
Raises a custom error with an optional error <tt>message</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#error() error()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void raiseError() {
        raiseError((java.lang.String)null);
    }
/**
Raises a custom error with an optional error <tt>message</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#error() error()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void raiseError(java.lang.String message)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_raiseError_String(nativeId(), message);
    }
    @QtBlockedSlot
    native void __qt_raiseError_String(long __this__nativeId, java.lang.String message);

/**
Convenience function to be called in case a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement } was read. Reads until the corresponding {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement } and returns all text in-between. In case of no error, the current token (see {@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()}) after having called this function is {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }. <p>The function concatenates {@link com.trolltech.qt.xml.QXmlStreamReader#text() text()} when it reads either {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Characters } or {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EntityReference } tokens, but skips {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType ProcessingInstruction } and {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Comment }. In case anything else is read before reaching {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EndElement }, the function returns what it read so far and raises an {@link com.trolltech.qt.xml.QXmlStreamReader.Error UnexpectedElementError }. If the current token is not {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType StartElement }, an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String readElementText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readElementText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_readElementText(long __this__nativeId);

/**
Reads the next token and returns its type. <p>With one exception, once an {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} is reported by {@link com.trolltech.qt.xml.QXmlStreamReader#readNext() readNext()}, further reading of the XML stream is not possible. Then {@link com.trolltech.qt.xml.QXmlStreamReader#atEnd() atEnd()} returns true, {@link com.trolltech.qt.xml.QXmlStreamReader#hasError() hasError()} returns true, and this function returns {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType QXmlStreamReader::Invalid }. <p>The exception is when {@link com.trolltech.qt.xml.QXmlStreamReader#error() error()} return {@link com.trolltech.qt.xml.QXmlStreamReader.Error PrematureEndOfDocumentError }. This error is reported when the end of an otherwise well-formed chunk of XML is reached, but the chunk doesn't represent a complete XML document. In that case, parsing can be resumed by calling {@link com.trolltech.qt.xml.QXmlStreamReader#addData(com.trolltech.qt.core.QByteArray) addData()} to add the next chunk of XML, when the stream is being read from a {@link com.trolltech.qt.core.QByteArray QByteArray}, or by waiting for more data to arrive when the stream is being read from a {@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#tokenString() tokenString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamReader.TokenType readNext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.xml.QXmlStreamReader.TokenType.resolve(__qt_readNext(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_readNext(long __this__nativeId);

/**
Sets the current device to <tt>device</tt>. Setting the device resets the stream to its initial state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#device() device()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#clear() clear()}. <br></DD></DT>
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
Makes <tt>resolver</tt> the new {@link com.trolltech.qt.xml.QXmlStreamReader#entityResolver() entityResolver()}. <p>The stream reader does not take ownership of the resolver. It's the callers responsibility to ensure that the resolver is valid during the entire life-time of the stream reader object, or until another resolver or 0 is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#entityResolver() entityResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEntityResolver(com.trolltech.qt.core.QXmlStreamEntityResolver resolver)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcEntityResolver = resolver;
        }
        __qt_setEntityResolver_QXmlStreamEntityResolver(nativeId(), resolver == null ? 0 : resolver.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEntityResolver_QXmlStreamEntityResolver(long __this__nativeId, long resolver);

/**
the namespace-processing flag of the stream reader <p>This property controls whether or not the stream reader processes namespaces. If enabled, the reader processes namespaces, otherwise it does not. <p>By default, namespace-processing is enabled.
*/

    @QtBlockedSlot
    public final void setNamespaceProcessing(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNamespaceProcessing_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setNamespaceProcessing_boolean(long __this__nativeId, boolean arg__1);

/**
Returns the text of {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Characters }, {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType Comment }, {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType DTD }, or {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType EntityReference }.
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Returns the reader's current token as string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#tokenType() tokenType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tokenString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tokenString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_tokenString(long __this__nativeId);

/**
Returns the type of the current token. <p>The current token can also be queried with the convenience functions {@link com.trolltech.qt.xml.QXmlStreamReader#isStartDocument() isStartDocument()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isEndDocument() isEndDocument()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isStartElement() isStartElement()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isEndElement() isEndElement()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isCharacters() isCharacters()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isComment() isComment()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isDTD() isDTD()}, {@link com.trolltech.qt.xml.QXmlStreamReader#isEntityReference() isEntityReference()}, and {@link com.trolltech.qt.xml.QXmlStreamReader#isProcessingInstruction() isProcessingInstruction()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamReader#tokenString() tokenString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamReader.TokenType tokenType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.xml.QXmlStreamReader.TokenType.resolve(__qt_tokenType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tokenType(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlStreamReader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamReader(QPrivateConstructor p) { super(p); } 
}
