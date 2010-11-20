package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlStreamEntityDeclaration class represents a DTD entity declaration. An entity declaration consists of a {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration#name() name()}, a {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration#notationName() notationName()}, a {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration#systemId() systemId()}, a {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration#publicId() publicId()}, and a {@link com.trolltech.qt.xml.QXmlStreamEntityDeclaration#value() value()}.
*/
@QtJambiGeneratedClass
public class QXmlStreamEntityDeclaration extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty entity declaration.
*/

    public QXmlStreamEntityDeclaration(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamEntityDeclaration();
    }

    native void __qt_QXmlStreamEntityDeclaration();

/**
Creates a copy of <tt>other</tt>.
*/

    public QXmlStreamEntityDeclaration(com.trolltech.qt.xml.QXmlStreamEntityDeclaration arg__1){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamEntityDeclaration_QXmlStreamEntityDeclaration(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QXmlStreamEntityDeclaration_QXmlStreamEntityDeclaration(long arg__1);

/**
Returns the entity name.
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
Returns the notation name.
*/

    @QtBlockedSlot
    public final java.lang.String notationName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notationName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_notationName(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QXmlStreamEntityDeclaration other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlStreamEntityDeclaration(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlStreamEntityDeclaration(long __this__nativeId, long other);

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
Returns the entity's value.
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

    public static native QXmlStreamEntityDeclaration fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamEntityDeclaration(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlStreamEntityDeclaration array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QXmlStreamEntityDeclaration)
        return operator_equal((com.trolltech.qt.xml.QXmlStreamEntityDeclaration) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlStreamEntityDeclaration clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlStreamEntityDeclaration __qt_clone(long __this_nativeId);
}
