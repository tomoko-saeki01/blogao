package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public final class AbstractVideoOutput extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractVideoOutputInterface,
            com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_inputPaths(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> outputPaths()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractVideoOutput fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractVideoOutput(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractVideoOutput(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
