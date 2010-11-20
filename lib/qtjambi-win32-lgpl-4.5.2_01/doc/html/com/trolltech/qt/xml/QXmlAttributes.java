package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlAttributes class provides XML attributes. If attributes are reported by {@link com.trolltech.qt.xml.QXmlContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, com.trolltech.qt.xml.QXmlAttributes) QXmlContentHandler::startElement()} this class is used to pass the attribute values. <p>Use {@link com.trolltech.qt.xml.QXmlAttributes#index(java.lang.String) index()} to locate the position of an attribute in the list, {@link com.trolltech.qt.xml.QXmlAttributes#count() count()} to retrieve the number of attributes, and {@link com.trolltech.qt.xml.QXmlAttributes#clear() clear()} to remove the attributes. New attributes can be added with {@link com.trolltech.qt.xml.QXmlAttributes#append(java.lang.String, java.lang.String, java.lang.String, java.lang.String) append()}. Use {@link com.trolltech.qt.xml.QXmlAttributes#type(java.lang.String) type()} to get an attribute's type and {@link com.trolltech.qt.xml.QXmlAttributes#value(java.lang.String) value()} to get its value. The attribute's name is available from {@link com.trolltech.qt.xml.QXmlAttributes#localName(int) localName()} or {@link com.trolltech.qt.xml.QXmlAttributes#qName(int) qName()}, and its namespace URI from {@link com.trolltech.qt.xml.QXmlAttributes#uri(int) uri()}.
*/
@QtJambiGeneratedClass
public class QXmlAttributes extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty attribute list.
*/

    public QXmlAttributes(){
        super((QPrivateConstructor)null);
        __qt_QXmlAttributes();
    }

    native void __qt_QXmlAttributes();

/**
Appends a new attribute entry to the list of attributes. The qualified name of the attribute is <tt>qName</tt>, the namespace URI is <tt>uri</tt> and the local name is <tt>localPart</tt>. The value of the attribute is <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlAttributes#qName(int) qName()}, {@link com.trolltech.qt.xml.QXmlAttributes#uri(int) uri()}, {@link com.trolltech.qt.xml.QXmlAttributes#localName(int) localName()}, and {@link com.trolltech.qt.xml.QXmlAttributes#value(java.lang.String) value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void append(java.lang.String qName, java.lang.String uri, java.lang.String localPart, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_String_String_String_String(nativeId(), qName, uri, localPart, value);
    }
    @QtBlockedSlot
    native void __qt_append_String_String_String_String(long __this__nativeId, java.lang.String qName, java.lang.String uri, java.lang.String localPart, java.lang.String value);

/**
Clears the list of attributes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlAttributes#append(java.lang.String, java.lang.String, java.lang.String, java.lang.String) append()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns the number of attributes in the list. This function is equivalent to {@link com.trolltech.qt.xml.QXmlAttributes#length() length()}.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Looks up the index of an attribute by the qualified name <tt>qName</tt>. <p>Returns the index of the attribute or -1 if it wasn't found. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int index(java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_String(nativeId(), qName);
    }
    @QtBlockedSlot
    native int __qt_index_String(long __this__nativeId, java.lang.String qName);

/**
This is an overloaded member function, provided for convenience. <p>Looks up the index of an attribute by a namespace name. <p><tt>uri</tt> specifies the namespace URI, or an empty string if the name has no namespace URI. <tt>localPart</tt> specifies the attribute's local name. <p>Returns the index of the attribute, or -1 if it wasn't found. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int index(java.lang.String uri, java.lang.String localPart)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_String_String(nativeId(), uri, localPart);
    }
    @QtBlockedSlot
    native int __qt_index_String_String(long __this__nativeId, java.lang.String uri, java.lang.String localPart);

/**
Returns the number of attributes in the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlAttributes#count() count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
Looks up an attribute's local name for the attribute at position <tt>index</tt>. If no namespace processing is done, the local name is an empty string. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String localName(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localName_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_localName_int(long __this__nativeId, int index);

/**
Looks up an attribute's XML 1.  qualified name for the attribute at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String qName(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_qName_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_qName_int(long __this__nativeId, int index);

/**
This is an overloaded member function, provided for convenience. <p>Looks up an attribute's type for the qualified name <tt>qName</tt>. <p>Currently only "CDATA" is returned.
*/

    @QtBlockedSlot
    public final java.lang.String type(java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type_String(nativeId(), qName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_type_String(long __this__nativeId, java.lang.String qName);

/**
This is an overloaded member function, provided for convenience. <p>Looks up an attribute's type by namespace name. <p><tt>uri</tt> specifies the namespace URI and <tt>localName</tt> specifies the local name. If the name has no namespace URI, use an empty string for <tt>uri</tt>. <p>Currently only "CDATA" is returned.
*/

    @QtBlockedSlot
    public final java.lang.String type(java.lang.String uri, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type_String_String(nativeId(), uri, localName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_type_String_String(long __this__nativeId, java.lang.String uri, java.lang.String localName);

/**
Looks up an attribute's type for the attribute at position <tt>index</tt>. <p>Currently only "CDATA" is returned.
*/

    @QtBlockedSlot
    public final java.lang.String type(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_type_int(long __this__nativeId, int index);

/**
Looks up an attribute's namespace URI for the attribute at position <tt>index</tt>. If no namespace processing is done or if the attribute has no namespace, the namespace URI is an empty string. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String uri(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uri_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_uri_int(long __this__nativeId, int index);

/**
This is an overloaded member function, provided for convenience. <p>Returns an attribute's value for the qualified name <tt>qName</tt>, or an empty string if no attribute exists for the name given. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtxml.html">Namespace Support via Features</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String value(java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String(nativeId(), qName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_String(long __this__nativeId, java.lang.String qName);

/**
This is an overloaded member function, provided for convenience. <p>Returns an attribute's value by namespace name. <p><tt>uri</tt> specifies the namespace URI, or an empty string if the name has no namespace URI. <tt>localName</tt> specifies the attribute's local name.
*/

    @QtBlockedSlot
    public final java.lang.String value(java.lang.String uri, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String_String(nativeId(), uri, localName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_String_String(long __this__nativeId, java.lang.String uri, java.lang.String localName);

/**
Returns an attribute's value for the attribute at position <tt>index</tt>. The index must be a valid position (i.e., 0 &lt;= <tt>index</tt> &lt; {@link com.trolltech.qt.xml.QXmlAttributes#count() count()}).
*/

    @QtBlockedSlot
    public final java.lang.String value(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_int(long __this__nativeId, int index);

/**
@exclude
*/

    public static native QXmlAttributes fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlAttributes(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlAttributes array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlAttributes clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlAttributes __qt_clone(long __this_nativeId);
}
