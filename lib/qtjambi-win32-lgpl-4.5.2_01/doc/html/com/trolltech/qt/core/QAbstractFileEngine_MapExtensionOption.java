package com.trolltech.qt.core;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QAbstractFileEngine_MapExtensionOption extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QAbstractFileEngine_MapExtensionOption(){
        super((QPrivateConstructor)null);
        __qt_QAbstractFileEngine_MapExtensionOption();
    }

    native void __qt_QAbstractFileEngine_MapExtensionOption();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.QFile.MemoryMapFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_MemoryMapFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_MemoryMapFlags(long __this__nativeId, int flags);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.MemoryMapFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QFile.MemoryMapFlags.resolve(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setOffset(long offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffset_long(nativeId(), offset);
    }
    @QtBlockedSlot
    native void __qt_setOffset_long(long __this__nativeId, long offset);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final long offset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_offset(nativeId());
    }
    @QtBlockedSlot
    native long __qt_offset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSize(long size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setSize_long(long __this__nativeId, long size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final long size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractFileEngine_MapExtensionOption fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFileEngine_MapExtensionOption(QPrivateConstructor p) { super(p); } 
}
