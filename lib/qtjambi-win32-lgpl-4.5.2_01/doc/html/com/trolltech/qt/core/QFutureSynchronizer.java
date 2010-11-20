package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFutureSynchronizer class is a convenience class that simplifies {@link com.trolltech.qt.core.QFuture QFuture} synchronization. QFutureSynchronizer is a template class that simplifies synchronization of one or more {@link com.trolltech.qt.core.QFuture QFuture} objects. Futures are added using the {@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()} or {@link com.trolltech.qt.core.QFutureSynchronizer#setFuture(com.trolltech.qt.core.QFuture) setFuture()} functions. The {@link com.trolltech.qt.core.QFutureSynchronizer#futures() futures()} function returns a list of futures. Use {@link com.trolltech.qt.core.QFutureSynchronizer#clearFutures() clearFutures()} to remove all futures from the QFutureSynchronizer. <p>The {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()} function waits for all futures to finish. The destructor of QFutureSynchronizer calls {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()}, providing an easy way to ensure that all futures have finished before returning from a function: <pre class="snippet">
    public final void someFunction()
    {
        QFutureSynchronizerVoid synchronizer = new QFutureSynchronizerVoid();

         ... 

        synchronizer.addFuture(QtConcurrent.runVoidMethod(this, anotherMethod, arg1, arg2));
        synchronizer.addFuture(QtConcurrent.map(list, mapFunctor));

        return; // QFutureSynchronizer waits for all futures to finish
    }
</pre> The behavior of {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()} can be changed using the {@link com.trolltech.qt.core.QFutureSynchronizer#setCancelOnWait(boolean) setCancelOnWait()} function. Calling setCancelOnWait(true) will cause {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()} to cancel all futures before waiting for them to finish. You can query the status of the cancel-on-wait feature using the {@link com.trolltech.qt.core.QFutureSynchronizer#cancelOnWait() cancelOnWait()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture QFuture}, {@link com.trolltech.qt.core.QFutureWatcher QFutureWatcher}, and {@link <a href="../qtjambi-threads.html#qtconcurrent-intro">Qt Concurrent</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFutureSynchronizer<T> extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QFutureSynchronizer.
*/

    public QFutureSynchronizer(){
        super((QPrivateConstructor)null);
        __qt_QFutureSynchronizer();
    }

    native void __qt_QFutureSynchronizer();

/**
Constructs a QFutureSynchronizer and begins watching <tt>future</tt> by calling {@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}. <br></DD></DT>
*/

    public QFutureSynchronizer(com.trolltech.qt.core.QFuture<T> future){
        super((QPrivateConstructor)null);
        __qt_QFutureSynchronizer_QFuture(future == null ? 0 : future.nativeId());
    }

    native void __qt_QFutureSynchronizer_QFuture(long future);

/**
Adds <tt>future</tt> to the list of managed futures. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#futures() futures()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addFuture(com.trolltech.qt.core.QFuture<T> future)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addFuture_QFuture(nativeId(), future == null ? 0 : future.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addFuture_QFuture(long __this__nativeId, long future);

/**
Returns true if the cancel-on-wait feature is enabled; otherwise returns false. If cancel-on-wait is enabled, the {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()} function will cancel all futures before waiting for them to finish. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#setCancelOnWait(boolean) setCancelOnWait()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()}. <br></DD></DT>
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
Removes all managed futures from this QFutureSynchronizer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#setFuture(com.trolltech.qt.core.QFuture) setFuture()}. <br></DD></DT>
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
Enables or disables the cancel-on-wait feature based on the <tt>enabled</tt> argument. If <tt>enabled</tt> is true, the {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()} function will cancel all futures before waiting for them to finish. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#cancelOnWait() cancelOnWait()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()}. <br></DD></DT>
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
Sets <tt>future</tt> to be the only future managed by this QFutureSynchronizer. This is a convenience function that calls {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()}, then {@link com.trolltech.qt.core.QFutureSynchronizer#clearFutures() clearFutures()}, and finally passes <tt>future</tt> to {@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}, {@link com.trolltech.qt.core.QFutureSynchronizer#waitForFinished() waitForFinished()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#clearFutures() clearFutures()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFuture(com.trolltech.qt.core.QFuture<T> future)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFuture_QFuture(nativeId(), future == null ? 0 : future.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFuture_QFuture(long __this__nativeId, long future);

/**
Waits for all futures to finish. If {@link com.trolltech.qt.core.QFutureSynchronizer#cancelOnWait() cancelOnWait()} returns true, each future is canceled before waiting for them to finish. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#cancelOnWait() cancelOnWait()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#setCancelOnWait(boolean) setCancelOnWait()}. <br></DD></DT>
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
@exclude
*/

    public static native QFutureSynchronizer fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureSynchronizer(QPrivateConstructor p) { super(p); } 

/**
Returns a list of all managed futures. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureSynchronizer#addFuture(com.trolltech.qt.core.QFuture) addFuture()}, and {@link com.trolltech.qt.core.QFutureSynchronizer#setFuture(com.trolltech.qt.core.QFuture) setFuture()}. <br></DD></DT>
*/

    public final java.util.List<QFuture<T>> futures() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_futures(nativeId());
    }
    private native java.util.List<QFuture<T>> __qt_futures(long nativeId);

}
