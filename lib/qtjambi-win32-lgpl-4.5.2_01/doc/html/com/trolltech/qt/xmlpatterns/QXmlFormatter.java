package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlFormatter class is an implementation of {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} for transforming XQuery output into formatted XML. QXmlFormatter is a subclass of {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} that formats the XML output to make it easier for humans to read. <p>{@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} outputs XML without adding unnecessary whitespace. In particular, it does not add newlines and indentation. To make the XML output easier to read, QXmlFormatter adds newlines and indentation by adding, removing, and modifying {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver sequence nodes} that only consist of whitespace. It also modifies whitespace in other places where it is not significant; e.g., between attributes and in the document prologue. <p>For example, where the base class {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} would output this:<pre class="snippet">&lt;a&gt;&lt;b/&gt;&lt;c/&gt;&lt;p&gt;Some Text&lt;/p&gt;&lt;/a&gt;
</pre> QXmlFormatter outputs this:<pre class="snippet">&lt;a&gt;
   &lt;b/&gt;
   &lt;c/&gt;
   &lt;p&gt;Some Text&lt;/p&gt;
&lt;/a&gt;
</pre> If you just want to serialize your XML in a human-readable format, use QXmlFormatter as it is. The default indentation level is 4 spaces, but you can set your own indentation value {@link com.trolltech.qt.xmlpatterns.QXmlFormatter#setIndentationDepth(int) setIndentationDepth()}. <p>The newlines and indentation added by QXmlFormatter are suitable for common formats, such as XHTML, SVG, or Docbook, where whitespace is not significant. However, if your XML will be used as input where whitespace is significant, then you must write your own subclass of {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} or {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver QAbstractXmlReceiver}. <p>Note that using QXmlFormatter instead of {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} will increase computational overhead and document storage size due to the insertion of whitespace. <p>Note also that the indentation style used by QXmlFormatter remains loosely defined and may change in future versions of Qt. If a specific indentation style is required then either use the base class {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} directly, or write your own subclass of {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} or {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver QAbstractXmlReceiver}. Alternatively, you can subclass QXmlFormatter and reimplement the callbacks there. <pre class="snippet">
   QXmlQuery query = new QXmlQuery();
   query.setQuery("doc('index.html')/html/body/p[1]");

   QXmlFormatterPointer formatter(new QXmlFormatter(query, myOutputDevice));
   formatter.setIndentationDepth(2);
   query.evaluateToReceiver(formatter);
*/
@QtJambiGeneratedClass
public class QXmlFormatter extends com.trolltech.qt.xmlpatterns.QXmlSerializer
{

/**
</pre> Constructs a formatter that uses the name pool and message handler in <tt>query</tt>, and writes the result to <tt>outputDevice</tt> as formatted XML. <p><tt>outputDevice</tt> is passed directly to {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer}'s constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer}. <br></DD></DT>
*/

    public QXmlFormatter(com.trolltech.qt.xmlpatterns.QXmlQuery query, com.trolltech.qt.core.QIODevice outputDevice){
        super((QPrivateConstructor)null);
        __qt_QXmlFormatter_QXmlQuery_QIODevice(query == null ? 0 : query.nativeId(), outputDevice == null ? 0 : outputDevice.nativeId());
    }

    native void __qt_QXmlFormatter_QXmlQuery_QIODevice(long query, long outputDevice);

/**
Returns the number of spaces QXmlFormatter will output for each indentation level. The default is four. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlFormatter#setIndentationDepth(int) setIndentationDepth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indentationDepth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indentationDepth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_indentationDepth(long __this__nativeId);

/**
Sets <tt>depth</tt> to be the number of spaces QXmlFormatter will output for level of indentation. The default is four. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlFormatter#indentationDepth() indentationDepth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIndentationDepth(int depth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndentationDepth_int(nativeId(), depth);
    }
    @QtBlockedSlot
    native void __qt_setIndentationDepth_int(long __this__nativeId, int depth);

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

    public static native QXmlFormatter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlFormatter(QPrivateConstructor p) { super(p); } 
}
