package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamNotationDeclaration class represents a DTD notation declaration. An notation declaration consists of a {@link com.trolltech.qt.xml.QXmlStreamNotationDeclaration#name() name()}, a {@link com.trolltech.qt.xml.QXmlStreamNotationDeclaration#systemId() systemId()}, and a {@link com.trolltech.qt.xml.QXmlStreamNotationDeclaration#publicId() publicId()}.
*/
@QtJambiGeneratedClass
public class QXmlStreamNotationDeclaration extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty notation declaration.
*/

    public QXmlStreamNotationDeclaration(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamNotationDeclaration();
    }

    native void __qt_QXmlStreamNotationDeclaration();

/**
Creates a copy of <tt>other</tt>.
*/

    public QXmlStreamNotationDeclaration(com.trolltech.qt.xml.QXmlStreamNotationDeclaration arg__1){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamNotationDeclaration_QXmlStreamNotationDeclaration(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QXmlStreamNotationDeclaration_QXmlStreamNotationDeclaration(long arg__1);

/**
Returns the notation name.
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QXmlStreamNotationDeclaration other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlStreamNotationDeclaration(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlStreamNotationDeclaration(long __this__nativeId, long other);

/**
Returns the public identifier.
*/

    @QtBlockedSlot
    public final java.lang.String publicId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_publicId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_publicId(long __this__nativeId);

/**
Returns the system identifier.
*/

    @QtBlockedSlot
    public final java.lang.String systemId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_systemId(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlStreamNotationDeclaration fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamNotationDeclaration(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlStreamNotationDeclaration array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QXmlStreamNotationDeclaration)
        return operator_equal((com.trolltech.qt.xml.QXmlStreamNotationDeclaration) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlStreamNotationDeclaration clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlStreamNotationDeclaration __qt_clone(long __this_nativeId);
}
