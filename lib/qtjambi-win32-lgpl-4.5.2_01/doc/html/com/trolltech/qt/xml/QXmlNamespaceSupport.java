package com.trolltech.qt.xml;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QXmlNamespaceSupport class is a helper class for XML readers which want to include namespace support. You can set the prefix for the current namespace with {@link com.trolltech.qt.xml.QXmlNamespaceSupport#setPrefix(java.lang.String, java.lang.String) setPrefix()}, and get the list of current prefixes (or those for a given URI) with {@link com.trolltech.qt.xml.QXmlNamespaceSupport#prefixes() prefixes()}. The namespace URI is available from {@link com.trolltech.qt.xml.QXmlNamespaceSupport#uri(java.lang.String) uri()}. Use {@link com.trolltech.qt.xml.QXmlNamespaceSupport#pushContext() pushContext()} to start a new namespace context, and {@link com.trolltech.qt.xml.QXmlNamespaceSupport#popContext() popContext()} to return to the previous namespace context. Use {@link com.trolltech.qt.xml.QXmlNamespaceSupport#splitName(java.lang.String) splitName()} or {@link com.trolltech.qt.xml.QXmlNamespaceSupport#processName(java.lang.String, boolean) processName()} to split a name into its prefix and local name. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlNamespaceSupport extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QXmlNamespaceSupport.
*/

    public QXmlNamespaceSupport(){
        super((QPrivateConstructor)null);
        __qt_QXmlNamespaceSupport();
    }

    native void __qt_QXmlNamespaceSupport();

/**
Reverts to the previous namespace context. <p>Normally, you should pop the context at the end of each XML element. After popping the context, all namespace prefix mappings that were previously in force are restored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlNamespaceSupport#pushContext() pushContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void popContext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_popContext(nativeId());
    }
    @QtBlockedSlot
    native void __qt_popContext(long __this__nativeId);

/**
Returns one of the prefixes mapped to the namespace URI <tt>uri</tt>. <p>If more than one prefix is currently mapped to the same URI, this function makes an arbitrary selection; if you want all of the prefixes, use {@link com.trolltech.qt.xml.QXmlNamespaceSupport#prefixes() prefixes()} instead. <p>Note: to check for a default prefix, use the {@link com.trolltech.qt.xml.QXmlNamespaceSupport#uri(java.lang.String) uri()} function with an argument of "". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlNamespaceSupport#setPrefix(java.lang.String, java.lang.String) setPrefix()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String prefix(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefix_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_prefix_String(long __this__nativeId, java.lang.String arg__1);

/**
Returns a list of all the prefixes currently declared. <p>If there is a default prefix, this function does not return it in the list; check for the default prefix using {@link com.trolltech.qt.xml.QXmlNamespaceSupport#uri(java.lang.String) uri()} with an argument of "".
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> prefixes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefixes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_prefixes(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns a list of all prefixes currently declared for the namespace URI <tt>uri</tt>. <p>The "xml:" prefix is included. If you only want one prefix that is mapped to the namespace URI, and you don't care which one you get, use the {@link com.trolltech.qt.xml.QXmlNamespaceSupport#prefix(java.lang.String) prefix()} function instead. <p>Note: The empty (default) prefix is never included in this list; to check for the presence of a default namespace, call {@link com.trolltech.qt.xml.QXmlNamespaceSupport#uri(java.lang.String) uri()} with "" as the argument.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> prefixes(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefixes_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_prefixes_String(long __this__nativeId, java.lang.String arg__1);

    @QtBlockedSlot
    private final void processName(java.lang.String arg__1, boolean arg__2, com.trolltech.qt.QNativePointer arg__3, com.trolltech.qt.QNativePointer arg__4)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_processName_String_boolean_nativepointer_nativepointer(nativeId(), arg__1, arg__2, arg__3, arg__4);
    }
    @QtBlockedSlot
    native void __qt_processName_String_boolean_nativepointer_nativepointer(long __this__nativeId, java.lang.String arg__1, boolean arg__2, com.trolltech.qt.QNativePointer arg__3, com.trolltech.qt.QNativePointer arg__4);

/**
Starts a new namespace context. <p>Normally, you should push a new context at the beginning of each XML element: the new context automatically inherits the declarations of its parent context, and it also keeps track of which declarations were made within this context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlNamespaceSupport#popContext() popContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void pushContext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pushContext(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pushContext(long __this__nativeId);

/**
Resets this namespace support object ready for reuse.
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This function declares a prefix <tt>pre</tt> in the current namespace context to be the namespace URI <tt>uri</tt>. The prefix remains in force until this context is popped, unless it is shadowed in a descendant context. <p>Note that there is an asymmetry in this library. {@link com.trolltech.qt.xml.QXmlNamespaceSupport#prefix(java.lang.String) prefix()} does not return the default "" prefix, even if you have declared one; to check for a default prefix, you must look it up explicitly using {@link com.trolltech.qt.xml.QXmlNamespaceSupport#uri(java.lang.String) uri()}. This asymmetry exists to make it easier to look up prefixes for attribute names, where the default prefix is not allowed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlNamespaceSupport#prefix(java.lang.String) prefix()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrefix(java.lang.String arg__1, java.lang.String arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrefix_String_String(nativeId(), arg__1, arg__2);
    }
    @QtBlockedSlot
    native void __qt_setPrefix_String_String(long __this__nativeId, java.lang.String arg__1, java.lang.String arg__2);

    @QtBlockedSlot
    private final void splitName(java.lang.String arg__1, com.trolltech.qt.QNativePointer arg__2, com.trolltech.qt.QNativePointer arg__3)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_splitName_String_nativepointer_nativepointer(nativeId(), arg__1, arg__2, arg__3);
    }
    @QtBlockedSlot
    native void __qt_splitName_String_nativepointer_nativepointer(long __this__nativeId, java.lang.String arg__1, com.trolltech.qt.QNativePointer arg__2, com.trolltech.qt.QNativePointer arg__3);

/**
Looks up the prefix <tt>prefix</tt> in the current context and returns the currently-mapped namespace URI. Use the empty string ("") for the default namespace.
*/

    @QtBlockedSlot
    public final java.lang.String uri(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uri_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_uri_String(long __this__nativeId, java.lang.String arg__1);

/**
@exclude
*/

    public static native QXmlNamespaceSupport fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlNamespaceSupport(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlNamespaceSupport array[]);

    public static class ProcessedName {
        public ProcessedName(String nsuri, String localName) {
            this.nsuri = nsuri;
            this.localName = localName;
        }

        public String nsuri;
        public String localName;
    }

/**
Processes a raw XML 1.0 name in the current context by removing
the prefix and looking it up among the prefixes currently
declared.
<p>
<tt>qname</tt> is the raw XML 1.0 name to be processed. <tt>isAttribute</tt>
is true if the name is an attribute name.
<p>
Note that attribute names are processed differently than element
names: an unprefixed element name gets the default namespace (if
any), while an unprefixed attribute name does not.
*/

    public final ProcessedName processName(String qname, boolean isAttribute) {
        QNativePointer nsUri = new QNativePointer(QNativePointer.Type.String);
        QNativePointer localName = new QNativePointer(QNativePointer.Type.String);
        processName(qname, isAttribute, nsUri, localName);

        return new ProcessedName(nsUri.stringValue(), localName.stringValue());
    }

    public static class SplitName {
        public SplitName(String prefix, String localname) {
            this.prefix = prefix;
            this.localname = localname;
        }

        public String prefix;
        public String localname;
    }

/**
Splits the name <tt>qname</tt> at the '.' and returns the prefix
prefix and the local name.
*/

    public final SplitName splitName(String qname) {
        QNativePointer prefix = new QNativePointer(QNativePointer.Type.String);
        QNativePointer localName = new QNativePointer(QNativePointer.Type.String);
        splitName(qname, prefix, localName);

        return new SplitName(prefix.stringValue(), localName.stringValue());
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlNamespaceSupport clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlNamespaceSupport __qt_clone(long __this_nativeId);
}
