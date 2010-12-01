package com.trolltech.qt.core;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QAbstractFileEngine_MapExtensionReturn extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**

*/

    public QAbstractFileEngine_MapExtensionReturn(){
        super((QPrivateConstructor)null);
        __qt_QAbstractFileEngine_MapExtensionReturn();
    }

    native void __qt_QAbstractFileEngine_MapExtensionReturn();

    @QtBlockedSlot
    private final void address_private(com.trolltech.qt.QNativePointer address)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_address_private_nativepointer(nativeId(), address);
    }
    @QtBlockedSlot
    private native void __qt_address_private_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer address);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer address_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_address_private(nativeId());
    }
    @QtBlockedSlot
    private native com.trolltech.qt.QNativePointer __qt_address_private(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractFileEngine_MapExtensionReturn fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFileEngine_MapExtensionReturn(QPrivateConstructor p) { super(p); } 

    private QNativePointer currentAddressNativePointer; // don't garbage collect while in use
/**
This method has no available documentation.
*/

    public final void setAddress(String address) {
        currentAddressNativePointer = address != null ? QNativePointer.createCharPointer(address) : null;
        address_private(currentAddressNativePointer);
    }

/**
This method has no available documentation.
*/

    public final String address() {
        QNativePointer np = address_private();
        return np != null ? com.trolltech.qt.internal.QtJambiInternal.charPointerToString(np) : null;
    }

}
