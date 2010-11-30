package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamNamespaceDeclaration class represents a namespace declaration. An namespace declaration consists of a {@link com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration#prefix() prefix()} and a {@link com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration#namespaceUri() namespaceUri()}.
*/
@QtJambiGeneratedClass
public class QXmlStreamNamespaceDeclaration extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty namespace declaration.
*/

    public QXmlStreamNamespaceDeclaration(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamNamespaceDeclaration();
    }

    native void __qt_QXmlStreamNamespaceDeclaration();

/**
Creates a namespace declaration with <tt>prefix</tt> and <tt>namespaceUri</tt>.
*/

    public QXmlStreamNamespaceDeclaration(java.lang.String prefix, java.lang.String namespaceUri){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamNamespaceDeclaration_String_String(prefix, namespaceUri);
    }

    native void __qt_QXmlStreamNamespaceDeclaration_String_String(java.lang.String prefix, java.lang.String namespaceUri);

/**
Creates a copy of <tt>other</tt>.
*/

    public QXmlStreamNamespaceDeclaration(com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration arg__1){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamNamespaceDeclaration_QXmlStreamNamespaceDeclaration(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QXmlStreamNamespaceDeclaration_QXmlStreamNamespaceDeclaration(long arg__1);

/**
Returns the namespaceUri.
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
    private final boolean operator_equal(com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlStreamNamespaceDeclaration(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlStreamNamespaceDeclaration(long __this__nativeId, long other);

/**
Returns the prefix.
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
@exclude
*/

    public static native QXmlStreamNamespaceDeclaration fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamNamespaceDeclaration(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlStreamNamespaceDeclaration array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration)
        return operator_equal((com.trolltech.qt.xml.QXmlStreamNamespaceDeclaration) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlStreamNamespaceDeclaration clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlStreamNamespaceDeclaration __qt_clone(long __this_nativeId);
}
