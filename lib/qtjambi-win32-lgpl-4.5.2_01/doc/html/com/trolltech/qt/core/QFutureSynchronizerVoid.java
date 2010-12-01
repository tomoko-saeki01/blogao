package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class QFutureSynchronizerVoid extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureSynchronizerVoid(){
        super((QPrivateConstructor)null);
        __qt_QFutureSynchronizerVoid();
    }

    native void __qt_QFutureSynchronizerVoid();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureSynchronizerVoid(com.trolltech.qt.core.QFutureVoid future){
        super((QPrivateConstructor)null);
        __qt_QFutureSynchronizerVoid_QFuture(future == null ? 0 : future.nativeId());
    }

    native void __qt_QFutureSynchronizerVoid_QFuture(long future);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void addFuture(com.trolltech.qt.core.QFutureVoid future)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addFuture_QFuture(nativeId(), future == null ? 0 : future.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addFuture_QFuture(long __this__nativeId, long future);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean cancelOnWait()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cancelOnWait(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_cancelOnWait(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void clearFutures()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearFutures(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearFutures(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setCancelOnWait(boolean enabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCancelOnWait_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setCancelOnWait_boolean(long __this__nativeId, boolean enabled);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setFuture(com.trolltech.qt.core.QFutureVoid future)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFuture_QFuture(nativeId(), future == null ? 0 : future.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFuture_QFuture(long __this__nativeId, long future);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void waitForFinished()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_waitForFinished(nativeId());
    }
    @QtBlockedSlot
    native void __qt_waitForFinished(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native QFutureSynchronizerVoid fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureSynchronizerVoid(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final java.util.List<QFutureVoid> futures() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_futures(nativeId());
    }
    private native java.util.List<QFutureVoid> __qt_futures(long nativeId);

}
