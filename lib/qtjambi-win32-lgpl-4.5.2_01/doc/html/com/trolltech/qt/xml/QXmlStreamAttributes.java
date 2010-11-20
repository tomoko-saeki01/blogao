package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamAttributes class represents a vector of {@link com.trolltech.qt.xml.QXmlStreamAttribute QXmlStreamAttribute}. Attributes are returned by a {@link com.trolltech.qt.xml.QXmlStreamReader QXmlStreamReader} in {@link com.trolltech.qt.xml.QXmlStreamReader#attributes() attributes()} when the reader reports a {@link com.trolltech.qt.xml.QXmlStreamReader.TokenType start element }. The class can also be used with a {@link com.trolltech.qt.xml.QXmlStreamWriter QXmlStreamWriter} as an argument to {@link com.trolltech.qt.xml.QXmlStreamWriter#writeAttributes(com.trolltech.qt.xml.QXmlStreamAttributes) writeAttributes()}. <p>The convenience function {@link com.trolltech.qt.xml.QXmlStreamAttributes#value(java.lang.String, java.lang.String) value()} loops over the vector and returns an attribute value for a given namespaceUri and an attribute's name. <p>New attributes can be added with {@link com.trolltech.qt.xml.QXmlStreamAttributes#append(java.lang.String, java.lang.String, java.lang.String) append()}.
*/
@QtJambiGeneratedClass
public class QXmlStreamAttributes extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QXmlStreamAttributes object.
*/

    public QXmlStreamAttributes(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamAttributes();
    }

    native void __qt_QXmlStreamAttributes();

/**
Appends a new attribute with <tt>name</tt> in the namespace described with <tt>namespaceUri</tt>, and value <tt>value</tt>. The <tt>namespaceUri</tt> can be empty.
*/

    @QtBlockedSlot
    public final void append(java.lang.String namespaceUri, java.lang.String name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_String_String_String(nativeId(), namespaceUri, name, value);
    }
    @QtBlockedSlot
    native void __qt_append_String_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name, java.lang.String value);

/**
This is an overloaded member function, provided for convenience. <p>Appends a new attribute with qualified name <tt>qualifiedName</tt> and value <tt>value</tt>.
*/

    @QtBlockedSlot
    public final void append(java.lang.String qualifiedName, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_String_String(nativeId(), qualifiedName, value);
    }
    @QtBlockedSlot
    native void __qt_append_String_String(long __this__nativeId, java.lang.String qualifiedName, java.lang.String value);

/**
Appends <tt>attribute</tt> to this QXmlStreamAttributes.
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.xml.QXmlStreamAttribute attribute)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QXmlStreamAttribute(nativeId(), attribute == null ? 0 : attribute.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QXmlStreamAttribute(long __this__nativeId, long attribute);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamAttribute at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlStreamAttribute __qt_at_int(long __this__nativeId, int i);

/**

*/

    @QtBlockedSlot
    public final int capacity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_capacity(nativeId());
    }
    @QtBlockedSlot
    native int __qt_capacity(long __this__nativeId);

/**

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

*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QXmlStreamAttribute(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QXmlStreamAttribute(long __this__nativeId, long t);

/**

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

*/

    @QtBlockedSlot
    public final int count(com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_QXmlStreamAttribute(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native int __qt_count_QXmlStreamAttribute(long __this__nativeId, long t);

/**

*/

    @QtBlockedSlot
    public final boolean empty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_empty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_empty(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean endsWith(com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_QXmlStreamAttribute(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_QXmlStreamAttribute(long __this__nativeId, long t);


/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> fill(com.trolltech.qt.xml.QXmlStreamAttribute t) {
        return fill(t, (int)-1);
    }
/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> fill(com.trolltech.qt.xml.QXmlStreamAttribute t, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fill_QXmlStreamAttribute_int(nativeId(), t == null ? 0 : t.nativeId(), size);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> __qt_fill_QXmlStreamAttribute_int(long __this__nativeId, long t, int size);

/**
{@inheritDoc}
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamAttribute first()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_first(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlStreamAttribute __qt_first(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if this QXmlStreamAttributes has an attribute whose namespace URI and name correspond to <tt>namespaceUri</tt> and <tt>name</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasAttribute(java.lang.String namespaceUri, java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAttribute_String_String(nativeId(), namespaceUri, name);
    }
    @QtBlockedSlot
    native boolean __qt_hasAttribute_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name);

/**
Returns true if this QXmlStreamAttributes has an attribute whose qualified name is <tt>qualifiedName</tt>; otherwise returns false. <p>Note that this is not namespace aware. For instance, if this QXmlStreamAttributes contains an attribute whose lexical name is "xlink:href" this doesn't tell that an attribute named <tt>href</tt> in the XLink namespace is present, since the <tt>xlink</tt> prefix can be bound to any namespace. Use the overload that takes a namespace URI and a local name as parameter, for namespace aware code.
*/

    @QtBlockedSlot
    public final boolean hasAttribute(java.lang.String qualifiedName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAttribute_String(nativeId(), qualifiedName);
    }
    @QtBlockedSlot
    native boolean __qt_hasAttribute_String(long __this__nativeId, java.lang.String qualifiedName);


/**

*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.xml.QXmlStreamAttribute t) {
        return indexOf(t, (int)0);
    }
/**

*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.xml.QXmlStreamAttribute t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QXmlStreamAttribute_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_QXmlStreamAttribute_int(long __this__nativeId, long t, int from);

/**

*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
{@inheritDoc}
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QXmlStreamAttribute last()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_last(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlStreamAttribute __qt_last(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.xml.QXmlStreamAttribute t) {
        return lastIndexOf(t, (int)-1);
    }
/**

*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.xml.QXmlStreamAttribute t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_QXmlStreamAttribute_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_QXmlStreamAttribute_int(long __this__nativeId, long t, int from);


/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> mid(int pos) {
        return mid(pos, (int)-1);
    }
/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> mid(int pos, int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid_int_int(nativeId(), pos, length);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> __qt_mid_int_int(long __this__nativeId, int pos, int length);

    @QtBlockedSlot
    private final boolean operator_equal(java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> v)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_List(nativeId(), v);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_List(long __this__nativeId, java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> v);

/**

*/

    @QtBlockedSlot
    public final void prepend(com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prepend_QXmlStreamAttribute(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_prepend_QXmlStreamAttribute(long __this__nativeId, long t);

/**

*/

    @QtBlockedSlot
    public final void remove(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_remove_int(long __this__nativeId, int i);

/**

*/

    @QtBlockedSlot
    public final void remove(int i, int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_int_int(nativeId(), i, n);
    }
    @QtBlockedSlot
    native void __qt_remove_int_int(long __this__nativeId, int i, int n);

/**

*/

    @QtBlockedSlot
    public final void replace(int i, com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replace_int_QXmlStreamAttribute(nativeId(), i, t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_replace_int_QXmlStreamAttribute(long __this__nativeId, int i, long t);

/**

*/

    @QtBlockedSlot
    public final void reserve(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reserve_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_reserve_int(long __this__nativeId, int size);

/**

*/

    @QtBlockedSlot
    public final void resize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_resize_int(long __this__nativeId, int size);

/**

*/

    @QtBlockedSlot
    public final void setSharable(boolean sharable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSharable_boolean(nativeId(), sharable);
    }
    @QtBlockedSlot
    native void __qt_setSharable_boolean(long __this__nativeId, boolean sharable);

/**

*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void squeeze()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_squeeze(nativeId());
    }
    @QtBlockedSlot
    native void __qt_squeeze(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean startsWith(com.trolltech.qt.xml.QXmlStreamAttribute t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_QXmlStreamAttribute(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_QXmlStreamAttribute(long __this__nativeId, long t);

/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> toList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> __qt_toList(long __this__nativeId);

/**
Returns the value of the attribute <tt>name</tt> in the namespace described with <tt>namespaceUri</tt>, or an empty string reference if the attribute is not defined. The <tt>namespaceUri</tt> can be empty.
*/

    @QtBlockedSlot
    public final java.lang.String value(java.lang.String namespaceUri, java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String_String(nativeId(), namespaceUri, name);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_String_String(long __this__nativeId, java.lang.String namespaceUri, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Returns the value of the attribute with qualified name <tt>qualifiedName</tt> , or an empty string reference if the attribute is not defined. A qualified name is the raw name of an attribute in the XML data. It consists of the namespace prefix, followed by colon, followed by the attribute's local name. Since the namespace prefix is not unique (the same prefix can point to different namespaces and different prefixes can point to the same namespace), you shouldn't use qualified names, but a resolved namespaceUri and the attribute's local name.
*/

    @QtBlockedSlot
    public final java.lang.String value(java.lang.String qualifiedName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String(nativeId(), qualifiedName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_String(long __this__nativeId, java.lang.String qualifiedName);

/**

*/

    public native static java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> fromList(java.util.List<com.trolltech.qt.xml.QXmlStreamAttribute> list);

/**
@exclude
*/

    public static native QXmlStreamAttributes fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamAttributes(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlStreamAttributes array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof java.util.List)
        return operator_equal((java.util.List) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlStreamAttributes clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlStreamAttributes __qt_clone(long __this_nativeId);
}
