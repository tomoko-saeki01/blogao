package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlName class represents the name of an XML node, in an efficient, namespace-aware way. QXmlName represents the name of an XML node in a way that is both efficient and safe for comparing names. Normally, an XML node represents an XML element or attribute, but QXmlName can also represent the names of other kinds of nodes, e.g., {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver#processingInstruction(com.trolltech.qt.xmlpatterns.QXmlName, java.lang.String) QAbstractXmlReceiver::processingInstruction()} and {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver#namespaceBinding(com.trolltech.qt.xmlpatterns.QXmlName) QAbstractXmlReceiver::namespaceBinding()}. <p>The name of an XML node has three components: The namespace URI, the local name, and the prefix. To see what these refer to in XML, consider the following snippet.<pre class="snippet">&lt;book xmlns:dc='http://purl.org/dc/elements/1.1'
      xmlns='http://example.com/MyDefault'&gt;
    &lt;dc:title&gt;Mobey Dick&lt;/dc:title&gt; ...
&lt;/book&gt;
</pre> For the element named book, {@link com.trolltech.qt.xmlpatterns.QXmlName#localName(com.trolltech.qt.xmlpatterns.QXmlNamePool) localName()} returns book, {@link com.trolltech.qt.xmlpatterns.QXmlName#namespaceUri(com.trolltech.qt.xmlpatterns.QXmlNamePool) namespaceUri()} returns http://example.com/MyDefault, and {@link com.trolltech.qt.xmlpatterns.QXmlName#prefix(com.trolltech.qt.xmlpatterns.QXmlNamePool) prefix()} returns an empty string. For the element named title, {@link com.trolltech.qt.xmlpatterns.QXmlName#localName(com.trolltech.qt.xmlpatterns.QXmlNamePool) localName()} returns title, {@link com.trolltech.qt.xmlpatterns.QXmlName#namespaceUri(com.trolltech.qt.xmlpatterns.QXmlNamePool) namespaceUri()} returns http://purl.org/dc/elements/1.1, and {@link com.trolltech.qt.xmlpatterns.QXmlName#prefix(com.trolltech.qt.xmlpatterns.QXmlNamePool) prefix()} returns dc. <p>To ensure that operations with QXmlName are efficient, e.g., copying names and comparing them, each instance of QXmlName is associated with a {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool}, which must be specified at QXmlName construction time. The three components of the QXmlName, i.e., the namespace URI, the local name, and the prefix, are stored in the name pool mapped to identifiers so they can be shared. For this reason, the only way to create a valid instance of QXmlName is to use the class constructor, where the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool}, local name, namespace URI, and prefix must all be specified. <p>Note that QXmlName's default constructor constructs a null instance. It is typically used for allocating unused entries in collections of QXmlName. <p>A side effect of associating each instance of QXmlName with a {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool} is that each instance of QXmlName is tied to the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool QXmlNamePool} with which it was created. However, the QXmlName class does not keep track of the name pool, so all the accessor functions, e.g., {@link com.trolltech.qt.xmlpatterns.QXmlName#namespaceUri(com.trolltech.qt.xmlpatterns.QXmlNamePool) namespaceUri()}, {@link com.trolltech.qt.xmlpatterns.QXmlName#prefix(com.trolltech.qt.xmlpatterns.QXmlNamePool) prefix()}, {@link com.trolltech.qt.xmlpatterns.QXmlName#localName(com.trolltech.qt.xmlpatterns.QXmlNamePool) localName()}, and {@link com.trolltech.qt.xmlpatterns.QXmlName#toClarkName(com.trolltech.qt.xmlpatterns.QXmlNamePool) toClarkName()} require that the correct name pool be passed to them. Failure to provide the correct name pool to these accessor functions results in undefined behavior. <p>Note that a {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool} is not an XML namespace. One {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool} can represent instances of QXmlName from different XML namespaces, and the instances of QXmlName from one XML namespace can be distributed over multiple {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pools}.<a name="comparing-qxmlnames"><a name="comparing-qxmlnames"><h2>Comparing QXmlNames</h2> To determine what a QXmlName refers to, the namespace URI and the local name are used. The prefix is not used because the prefix is simply a shorthand name for use in place of the normally much longer namespace URI. Nor is the prefix used in name comparisons. For example, the following two element nodes represent the same element and compare equal.<pre class="snippet">&lt;svg xmlns="http://www.w3.org/2000/svg"/&gt;
</pre><pre class="snippet">&lt;x:svg xmlns:x="http://www.w3.org/2000/svg"/&gt;
</pre> Although the second name has the prefix x, the two names compare equal as instances of QXmlName, because the prefix is not used in the comparison. <p>A local name can never be an empty string, although the prefix and namespace URI can. If the prefix is not empty, the namespace URI cannot be empty. Local names and prefixes must be valid NCNames, e.g., abc.def or abc123. <p>QXmlName represents what is sometimes called an expanded QName, or simply a QName. <p><DT><b>See also:</b><br><DD></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlName extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an uninitialized QXmlName. To build a valid QXmlName, you normally use the other constructor, which takes a {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool}, namespace URI, local name, and prefix as parameters. But you can also use this constructor to build a null QXmlName and then assign an existing QXmlName to it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName#isNull() isNull()}. <br></DD></DT>
*/

    public QXmlName(){
        super((QPrivateConstructor)null);
        __qt_QXmlName();
    }

    native void __qt_QXmlName();

    private QXmlName(com.trolltech.qt.QNativePointer namePool, java.lang.String localName, java.lang.String namespaceURI, java.lang.String prefix){
        super((QPrivateConstructor)null);
        __qt_QXmlName_nativepointer_String_String_String(namePool, localName, namespaceURI, prefix);
    }

    native void __qt_QXmlName_nativepointer_String_String_String(com.trolltech.qt.QNativePointer namePool, java.lang.String localName, java.lang.String namespaceURI, java.lang.String prefix);

/**
Returns true if this QXmlName is not initialized with a valid combination of namespace URI, local name, and prefix. <p>A valid local name is always required. The prefix and namespace URI can be empty, but if the prefix is not empty, the namespace URI must not be empty. Local names and prefixes must be valid NCNames, e.g., abc.def or abc123.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns the local name. <p>Note that for efficiency, the local name string is not stored in the QXmlName but in the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool QXmlNamePool} that was passed to the constructor. Hence, that same <tt>namePool</tt> must be passed to this function, so it can be used for looking up the local name.
*/

    @QtBlockedSlot
    public final java.lang.String localName(com.trolltech.qt.xmlpatterns.QXmlNamePool query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localName_QXmlNamePool(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_localName_QXmlNamePool(long __this__nativeId, long query);

/**
Returns the namespace URI. <p>Note that for efficiency, the namespace URI string is not stored in the QXmlName but in the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool QXmlNamePool} that was passed to the constructor. Hence, that same <tt>namePool</tt> must be passed to this function, so it can be used for looking up the namespace URI.
*/

    @QtBlockedSlot
    public final java.lang.String namespaceUri(com.trolltech.qt.xmlpatterns.QXmlNamePool query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceUri_QXmlNamePool(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_namespaceUri_QXmlNamePool(long __this__nativeId, long query);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xmlpatterns.QXmlName other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlName(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlName(long __this__nativeId, long other);

/**
Returns the prefix. <p>Note that for efficiency, the prefix string is not stored in the QXmlName but in the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool QXmlNamePool} that was passed to the constructor. Hence, that same <tt>namePool</tt> must be passed to this function, so it can be used for looking up the prefix.
*/

    @QtBlockedSlot
    public final java.lang.String prefix(com.trolltech.qt.xmlpatterns.QXmlNamePool query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefix_QXmlNamePool(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_prefix_QXmlNamePool(long __this__nativeId, long query);

/**
Returns this QXmlName formatted as a Clark Name. For example, if the local name is <tt>html</tt>, the prefix is <tt>x</tt>, and the namespace URI is <tt>http://www.w3.org/1999/xhtml/</tt>, then the Clark Name returned is:<pre>{http://www.w3.org/1999/xhtml/}x:html.</pre> If the local name is MyWidget and the namespace is empty, the Clark Name returned is:<pre>MyWidget</pre> Note that for efficiency, the namespace URI, local name, and prefix strings are not stored in the QXmlName but in the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool QXmlNamePool} that was passed to the constructor. Hence, that same <tt>namePool</tt> must be passed to this function, so it can be used for looking up the three string components. <p>This function can be useful for debugging. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName#fromClarkName(java.lang.String, com.trolltech.qt.xmlpatterns.QXmlNamePool) fromClarkName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toClarkName(com.trolltech.qt.xmlpatterns.QXmlNamePool query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toClarkName_QXmlNamePool(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toClarkName_QXmlNamePool(long __this__nativeId, long query);

/**
Converts <tt>clarkName</tt> into a QXmlName, inserts into <tt>namePool</tt>, and returns it. <p>A clark name is a way to present a full QName with only one string, where the namespace cannot contain braces. Here are a couple of examples: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Clark Name</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> <tt>html</tt></td><td> The local name <tt>html</tt>, in no namespace</td></tr><tr valign="top" class="odd"><td> <tt>http://www.w3.org/1999/xhtml</tt>html</td><td> The local name <tt>html</tt>, in the XHTML namespace</td></tr><tr valign="top" class="even"><td> <tt>http://www.w3.org/1999/xhtml</tt>my:html</td><td> The local name <tt>html</tt>, in the XHTML namespace, with the prefix <tt>my</tt></td></tr></table> If the namespace contains braces, the returned value is either invalid or has undefined content. <p>If <tt>clarkName</tt> is an invalid name, a default constructed QXmlName is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName#toClarkName(com.trolltech.qt.xmlpatterns.QXmlNamePool) toClarkName()}. <br></DD></DT>
*/

    public static com.trolltech.qt.xmlpatterns.QXmlName fromClarkName(java.lang.String clarkName, com.trolltech.qt.xmlpatterns.QXmlNamePool namePool)    {
        return __qt_fromClarkName_String_QXmlNamePool(clarkName, namePool == null ? 0 : namePool.nativeId());
    }
    native static com.trolltech.qt.xmlpatterns.QXmlName __qt_fromClarkName_String_QXmlNamePool(java.lang.String clarkName, long namePool);

/**
Returns true if <tt>candidate</tt> is an <tt>NCName</tt>. An <tt>NCName</tt> is a string that can be used as a name in XML and XQuery, e.g., the prefix or local name in an element or attribute, or the name of a variable. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    public native static boolean isNCName(java.lang.String candidate);

/**
@exclude
*/

    public static native QXmlName fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlName(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlName array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xmlpatterns.QXmlName)
        return operator_equal((com.trolltech.qt.xmlpatterns.QXmlName) other);
        return false;
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

    /**
     * Constructs a <code>QXmlName</code> instance that inserts <code>localName</code>,
     * <code>namespaceURI</code> and <code>prefix</code> into <code>namePool</code> if they aren't
     * already there. The accessor functions <code>namespaceUri()</code>, <code>prefix()</code>,
     * <code>localName()</code>, and <code>toClarkName()</code> must be passed the <code>namePool</code>
     * used here, so the <code>namePool</code> must remain in scope while the
     * accessor functions might be used. However, two instances can
     * be compared with <code>==</code> or <code>!=</code> and copied without the
     * <code>namePool</code>.
     *
     * The user guarantees that the string components are valid for a
     * <code>QName</code>. In particular, the local name, and the prefix (if present),
     * must be valid {@link <a href="http://www.w3.org/TR/REC-xml-names/#NT-NCName">NCNames</a>}
     * The function <code>isNCName()</code> can be used to test validity
     * of these names. The namespace URI should be an absolute URI.
     * <code>QUrl.isRelative()</code> can be used to test whether the namespace URI
     * is relative or absolute. Finally, providing a prefix is not valid
     * when no namespace URI is provided.
     *
     * <code>namePool</code> is not copied. Nor is the reference to it retained
     * in this instance. This constructor inserts the three strings
     * into <code>namePool</code>.
     */
    public QXmlName(QXmlNamePool namePool, String localName, String namespaceURI, String prefix) {
        this(namePool.nativePointer(), localName, namespaceURI, prefix);
    }

    /**
     * Equivalent to calling QXmlName(namePool, localName, namespaceURI, null);
     */
    public QXmlName(QXmlNamePool namePool, String localName, String namespaceURI) {
        this(namePool, localName, namespaceURI, null);
    }

    /**
     * Equivalent to calling QXmlName(namePool, localName, null, null)
     */
    public QXmlName(QXmlNamePool namePool, String localName) {
        this(namePool, localName, null);
    }


    @Override
    public QXmlName clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlName __qt_clone(long __this_nativeId);
}
