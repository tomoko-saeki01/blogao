package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlSerializer class is an implementation of {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver QAbstractXmlReceiver} for transforming XQuery output into unformatted XML. QXmlSerializer translates an {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver XQuery sequence}, usually the output of an {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}, into XML. Consider the example: <pre class="snippet">
  QXmlQuery query = new QXmlQuery();
  query.setQuery("doc('index.html')/html/body/p[1]");

  QXmlSerializerPointer serializer = new QXmlSerializerPointer(new QXmlSerializer(query, myOutputDevice));
  query.evaluateToReceiver(serializer);
</pre> First it constructs a {@link com.trolltech.qt.xmlpatterns.QXmlQuery query} that gets the first paragraph from document <tt>index.html</tt>. Then it constructs an instance of this class with the {@link com.trolltech.qt.xmlpatterns.QXmlQuery query} and {@link com.trolltech.qt.core.QIODevice myOutputDevice}. Finally, it {@link com.trolltech.qt.xmlpatterns.QXmlQuery#evaluateTo(com.trolltech.qt.core.QIODevice) evaluates} the {@link com.trolltech.qt.xmlpatterns.QXmlQuery query}, producing an ordered sequence of calls to the serializer's callback functions. The sequence of callbacks transforms the query output to XML and writes it to {@link com.trolltech.qt.core.QIODevice myOutputDevice}. <p>QXmlSerializer will: <ul><li> Declare namespaces when needed,</li><li> Use appropriate escaping, when characters can't be represented in the XML,</li><li> Handle line endings appropriately,</li><li> Report errors, when it can't serialize the content, e.g., when asked to serialize an attribute that is a top-level node, or when more than one top-level element is encountered.</li></ul> If an error occurs during serialization, result is undefined unless the serializer is driven through a call to {@link com.trolltech.qt.xmlpatterns.QXmlQuery#evaluateTo(com.trolltech.qt.core.QIODevice) QXmlQuery::evaluateTo()}. <p>If the generated XML should be indented and formatted for reading, use {@link com.trolltech.qt.xmlpatterns.QXmlFormatter QXmlFormatter}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlFormatter QXmlFormatter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlSerializer extends com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver
{

    private Object __rcCodec = null;

/**
Constructs a serializer that uses the name pool and message handler in <tt>query</tt>, and writes the output to <tt>outputDevice</tt>. <p><tt>outputDevice</tt> must be a valid, non-null device that is open in write mode, otherwise behavior is undefined. <p><tt>outputDevice</tt> must not be opened with {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Text } because it will cause the output to be incorrect. This class will ensure line endings are serialized as according with the XML specification. QXmlSerializer does not take ownership of <tt>outputDevice</tt>.
*/

    public QXmlSerializer(com.trolltech.qt.xmlpatterns.QXmlQuery query, com.trolltech.qt.core.QIODevice outputDevice){
        super((QPrivateConstructor)null);
        __qt_QXmlSerializer_QXmlQuery_QIODevice(query == null ? 0 : query.nativeId(), outputDevice == null ? 0 : outputDevice.nativeId());
    }

    native void __qt_QXmlSerializer_QXmlQuery_QIODevice(long query, long outputDevice);

/**
Returns the codec being used by the serializer for encoding its XML output. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlSerializer#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
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
Returns a pointer to the output device. There is no corresponding function to set the output device, because the output device must be passed to the constructor. The serializer does not take ownership of its IO device.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice outputDevice()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_outputDevice(long __this__nativeId);

/**
Sets the codec the serializer will use for encoding its XML output. The output codec is set to <tt>outputCodec</tt>. By default, the output codec is set to the one for <tt>UTF-8</tt>. The serializer does not take ownership of the codec. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlSerializer#codec() codec()}. <br></DD></DT>
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

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void atomicValue(java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_atomicValue_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_atomicValue_Object(long __this__nativeId, java.lang.Object value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void attribute(com.trolltech.qt.xmlpatterns.QXmlName name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_attribute_QXmlName_String(nativeId(), name == null ? 0 : name.nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_attribute_QXmlName_String(long __this__nativeId, long name, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void characters(java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_characters_String(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_characters_String(long __this__nativeId, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void comment(java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_comment_String(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_comment_String(long __this__nativeId, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void endDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endDocument(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endDocument(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void endElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endElement(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endElement(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void endOfSequence()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endOfSequence(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endOfSequence(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void namespaceBinding(com.trolltech.qt.xmlpatterns.QXmlName nb)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_namespaceBinding_QXmlName(nativeId(), nb == null ? 0 : nb.nativeId());
    }
    @QtBlockedSlot
    native void __qt_namespaceBinding_QXmlName(long __this__nativeId, long nb);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void processingInstruction(com.trolltech.qt.xmlpatterns.QXmlName name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_processingInstruction_QXmlName_String(nativeId(), name == null ? 0 : name.nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_processingInstruction_QXmlName_String(long __this__nativeId, long name, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void startDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startDocument(nativeId());
    }
    @QtBlockedSlot
    native void __qt_startDocument(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void startElement(com.trolltech.qt.xmlpatterns.QXmlName name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startElement_QXmlName(nativeId(), name == null ? 0 : name.nativeId());
    }
    @QtBlockedSlot
    native void __qt_startElement_QXmlName(long __this__nativeId, long name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void startOfSequence()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startOfSequence(nativeId());
    }
    @QtBlockedSlot
    native void __qt_startOfSequence(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlSerializer fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlSerializer(QPrivateConstructor p) { super(p); } 
}
