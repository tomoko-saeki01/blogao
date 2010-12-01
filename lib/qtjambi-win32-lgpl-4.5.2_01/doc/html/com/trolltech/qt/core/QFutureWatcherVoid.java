package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class QFutureWatcherVoid extends com.trolltech.qt.core.QFutureWatcherBase
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureWatcherVoid() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureWatcherVoid(com.trolltech.qt.core.QObject _parent){
        super((QPrivateConstructor)null);
        __qt_QFutureWatcherVoid_QObject(_parent == null ? 0 : _parent.nativeId());
    }

    native void __qt_QFutureWatcherVoid_QObject(long _parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setFuture(com.trolltech.qt.core.QFutureVoid future)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
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

    public static native QFutureWatcherVoid fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureWatcherVoid(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final QFutureVoid future() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_future(nativeId());
    }

    private native QFutureVoid __qt_future(long nativeId);

}
