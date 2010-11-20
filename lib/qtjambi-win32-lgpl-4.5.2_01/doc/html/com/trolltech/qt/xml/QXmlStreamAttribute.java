package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamAttribute class represents a single XML attribute An attribute consists of an optionally empty {@link com.trolltech.qt.xml.QXmlStreamAttribute#namespaceUri() namespaceUri()}, a {@link com.trolltech.qt.xml.QXmlStreamAttribute#name() name()}, a {@link com.trolltech.qt.xml.QXmlStreamAttribute#value() value()}, and an {@link com.trolltech.qt.xml.QXmlStreamAttribute#isDefault() isDefault()} attribute. <p>The raw XML attribute name is returned as {@link com.trolltech.qt.xml.QXmlStreamAttribute#qualifiedName() qualifiedName()}.
*/
@QtJambiGeneratedClass
public class QXmlStreamAttribute extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty attribute.
*/

    public QXmlStreamAttribute(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamAttribute();
    }

    native void __qt_QXmlStreamAttribute();

/**
Constructs an attribute in the namespace described with <tt>namespaceUri</tt> with <tt>name</tt> and value <tt>value</tt>.
*/

    public QXmlStreamAttribute(java.lang.String namespaceUri, java.lang.String name, java.lang.String value){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamAttribute_String_String_String(namespaceUri, name, value);
    }

    native void __qt_QXmlStreamAttribute_String_String_String(java.lang.String namespaceUri, java.lang.String name, java.lang.String value);

/**
Constructs an attribute with qualified name <tt>qualifiedName</tt> and value <tt>value</tt>.
*/

    public QXmlStreamAttribute(java.lang.String qualifiedName, java.lang.String value){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamAttribute_String_String(qualifiedName, value);
    }

    native void __qt_QXmlStreamAttribute_String_String(java.lang.String qualifiedName, java.lang.String value);

/**
Creates a copy of <tt>other</tt>.
*/

    public QXmlStreamAttribute(com.trolltech.qt.xml.QXmlStreamAttribute arg__1){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamAttribute_QXmlStreamAttribute(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QXmlStreamAttribute_QXmlStreamAttribute(long arg__1);

/**
Returns true if the parser added this attribute with a default value following an ATTLIST declaration in the DTD; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isDefault()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDefault(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDefault(long __this__nativeId);

/**
Returns the attribute's local name.
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
Returns the attribute's resolved namespaceUri, or an empty string reference if the attribute does not have a defined namespace.
*/

    @QtBlockedSlot
    public final java.lang.String namespaceUri()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceUri(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_namespaceUri(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QXmlStreamAttribute other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlStreamAttribute(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlStreamAttribute(long __this__nativeId, long other);

/**
Returns the attribute's namespace prefix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlStreamAttribute#name() name()}, and {@link com.trolltech.qt.xml.QXmlStreamAttribute#qualifiedName() qualifiedName()}. <br></DD></DT>
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
Returns the attribute's qualified name. <p>A qualified name is the raw name of an attribute in the XML data. It consists of the namespace {@link com.trolltech.qt.xml.QXmlStreamAttribute#prefix() prefix()}, followed by colon, followed by the attribute's local {@link com.trolltech.qt.xml.QXmlStreamAttribute#name() name()}. Since the namespace prefix is not unique (the same prefix can point to different namespaces and different prefixes can point to the same namespace), you shouldn't use {@link com.trolltech.qt.xml.QXmlStreamAttribute#qualifiedName() qualifiedName()}, but the resolved {@link com.trolltech.qt.xml.QXmlStreamAttribute#namespaceUri() namespaceUri()} and the attribute's local {@link com.trolltech.qt.xml.QXmlStreamAttribute#name() name()}.
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
Returns the attribute's value.
*/

    @QtBlockedSlot
    public final java.lang.String value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_value(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlStreamAttribute fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamAttribute(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlStreamAttribute array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QXmlStreamAttribute)
        return operator_equal((com.trolltech.qt.xml.QXmlStreamAttribute) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlStreamAttribute clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlStreamAttribute __qt_clone(long __this_nativeId);
}
