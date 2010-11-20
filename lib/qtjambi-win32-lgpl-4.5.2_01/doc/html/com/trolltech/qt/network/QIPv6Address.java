package com.trolltech.qt.network;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QIPv6Address extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a new QIPv6Address.
*/

    public QIPv6Address(){
        super((QPrivateConstructor)null);
        __qt_QIPv6Address();
    }

    native void __qt_QIPv6Address();

/**

*/

    @QtBlockedSlot
    public final void setC(byte[] c)    {
        if (c.length != 16)
            throw new IllegalArgumentException("Wrong number of elements in array. Found: " + c.length + ", expected: 16");

        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setC_byte_3(nativeId(), c);
    }
    @QtBlockedSlot
    native void __qt_setC_byte_3(long __this__nativeId, byte[] c);

    @QtBlockedSlot
    public final byte[] c()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_c(nativeId());
    }
    @QtBlockedSlot
    native byte[] __qt_c(long __this__nativeId);

/**
@exclude
*/

    public static native QIPv6Address fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIPv6Address(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QIPv6Address array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QIPv6Address clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QIPv6Address __qt_clone(long __this_nativeId);
}
