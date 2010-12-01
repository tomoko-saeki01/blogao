package com.trolltech.qt.core;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QFutureVoid extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**

*/

    public QFutureVoid(){
        super((QPrivateConstructor)null);
        __qt_QFutureVoid();
    }

    native void __qt_QFutureVoid();

/**
Constructs a copy of <tt>other</tt>. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QFutureVoid(com.trolltech.qt.core.QFutureVoid other){
        super((QPrivateConstructor)null);
        __qt_QFutureVoid_QFuture(other == null ? 0 : other.nativeId());
    }

    native void __qt_QFutureVoid_QFuture(long other);

/**
Cancels the asynchronous computation represented by this future. Note that the cancelation is asynchronous. Use {@link com.trolltech.qt.core.QFuture#waitForFinished() waitForFinished()} after calling {@link com.trolltech.qt.core.QFuture#cancel() cancel()} when you need synchronous cancelation. <p>Results currently available may still be accessed on a canceled future, but new results will not become available after calling this function. Any {@link com.trolltech.qt.core.QFutureWatcher QFutureWatcher} object that is watching this future will not deliver progress and result ready signals on a canceled future. <p>Be aware that not all asynchronous computations can be canceled. For example, the future returned by QtConcurrent::run() cannot be canceled; but the future returned by QtConcurrent::mappedReduced() can.
*/

    @QtBlockedSlot
    public final void cancel()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cancel(nativeId());
    }
    @QtBlockedSlot
    native void __qt_cancel(long __this__nativeId);

/**
Returns true if the asynchronous computation has been canceled with the {@link com.trolltech.qt.core.QFuture#cancel() cancel()} function; otherwise returns false. <p>Be aware that the computation may still be running even though this function returns true. See {@link com.trolltech.qt.core.QFuture#cancel() cancel()} for more details.
*/

    @QtBlockedSlot
    public final boolean isCanceled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCanceled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCanceled(long __this__nativeId);

/**
Returns true if the asynchronous computation represented by this future has finished; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isFinished()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFinished(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFinished(long __this__nativeId);

/**
Returns true if the asynchronous computation has been paused with the {@link com.trolltech.qt.core.QFuture#pause() pause()} function; otherwise returns false. <p>Be aware that the computation may still be running even though this function returns true. See {@link com.trolltech.qt.core.QFuture#setPaused(boolean) setPaused()} for more details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#setPaused(boolean) setPaused()}, and {@link com.trolltech.qt.core.QFuture#togglePaused() togglePaused()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isPaused()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPaused(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isPaused(long __this__nativeId);

/**
Returns true if the asynchronous computation represented by this future is currently running; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isRunning()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRunning(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRunning(long __this__nativeId);

/**
Returns true if the asynchronous computation represented by this future has been started; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isStarted()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isStarted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isStarted(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QFuture other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QFuture(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QFuture(long __this__nativeId, long other);

/**
Pauses the asynchronous computation represented by this future. This is a convenience method that simply calls {@link com.trolltech.qt.core.QFuture#pause() setPaused}(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#resume() resume()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void pause()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pause(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pause(long __this__nativeId);

/**
Returns the maximum {@link com.trolltech.qt.core.QFuture#progressValue() progressValue()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#progressValue() progressValue()}, and {@link com.trolltech.qt.core.QFuture#progressMinimum() progressMinimum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int progressMaximum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressMaximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressMaximum(long __this__nativeId);

/**
Returns the minimum {@link com.trolltech.qt.core.QFuture#progressValue() progressValue()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#progressValue() progressValue()}, and {@link com.trolltech.qt.core.QFuture#progressMaximum() progressMaximum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int progressMinimum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressMinimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressMinimum(long __this__nativeId);

/**
Returns the (optional) textual representation of the progress as reported by the asynchronous computation. <p>Be aware that not all computations provide a textual representation of the progress, and as such, this function may return an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String progressText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_progressText(long __this__nativeId);

/**
Returns the current progress value, which is between the {@link com.trolltech.qt.core.QFuture#progressMinimum() progressMinimum()} and {@link com.trolltech.qt.core.QFuture#progressMaximum() progressMaximum()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#progressMinimum() progressMinimum()}, and {@link com.trolltech.qt.core.QFuture#progressMaximum() progressMaximum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int progressValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressValue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressValue(long __this__nativeId);

/**
Resumes the asynchronous computation represented by this future. This is a convenience method that simply calls {@link com.trolltech.qt.core.QFuture#resume() setPaused}(false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#pause() pause()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resume()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resume(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resume(long __this__nativeId);

/**
If <tt>paused</tt> is true, this function pauses the asynchronous computation represented by the future. If the computation is already paused, this function does nothing. Any {@link com.trolltech.qt.core.QFutureWatcher QFutureWatcher} object that is watching this future will stop delivering progress and result ready signals while the future is paused. Signal delivery will continue once the future is resumed. <p>If <tt>paused</tt> is false, this function resumes the asynchronous computation. If the computation was not previously paused, this function does nothing. <p>Be aware that not all computations can be paused. For example, the future returned by QtConcurrent::run() cannot be paused; but the future returned by QtConcurrent::mappedReduced() can. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#isPaused() isPaused()}, {@link com.trolltech.qt.core.QFuture#pause() pause()}, {@link com.trolltech.qt.core.QFuture#resume() resume()}, and {@link com.trolltech.qt.core.QFuture#togglePaused() togglePaused()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPaused(boolean paused)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaused_boolean(nativeId(), paused);
    }
    @QtBlockedSlot
    native void __qt_setPaused_boolean(long __this__nativeId, boolean paused);

/**
Toggles the paused state of the asynchronous computation. In other words, if the computation is currently paused, calling this function resumes it; if the computation is running, it is paused. This is a convenience method for calling {@link com.trolltech.qt.core.QFuture#togglePaused() setPaused}(!{@link com.trolltech.qt.core.QFuture#isPaused() isPaused()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#setPaused(boolean) setPaused()}, {@link com.trolltech.qt.core.QFuture#pause() pause()}, and {@link com.trolltech.qt.core.QFuture#resume() resume()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void togglePaused()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_togglePaused(nativeId());
    }
    @QtBlockedSlot
    native void __qt_togglePaused(long __this__nativeId);

/**
Waits for the asynchronous computation to finish (including {@link com.trolltech.qt.core.QFuture#cancel() cancel()}ed computations).
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

    public static native QFutureVoid fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureVoid(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFutureVoid array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QFuture)
        return operator_equal((com.trolltech.qt.core.QFuture) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFutureVoid clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFutureVoid __qt_clone(long __this_nativeId);
}
