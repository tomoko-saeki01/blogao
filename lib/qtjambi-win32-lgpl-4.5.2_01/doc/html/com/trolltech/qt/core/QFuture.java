package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFuture class represents the result of an asynchronous computation. To start a computation, use one of the APIs in the {@link <a href="../qtjambi-threads.html#qtconcurrent-intro">Qt Concurrent</a>} framework. <p>QFuture allows threads to be synchronized against one or more results which will be ready at a later point in time. The result can be of any type that has a default constructor and a copy constructor. If a result is not available at the time of calling the {@link com.trolltech.qt.core.QFuture#result() result()}, {@link com.trolltech.qt.core.QFuture#resultAt(int) resultAt()}, or {@link com.trolltech.qt.core.QFuture#results() results()} functions, QFuture will wait until the result becomes available. You can use the {@link com.trolltech.qt.core.QFuture#isResultReadyAt(int) isResultReadyAt()} function to determine if a result is ready or not. For QFuture objects that report more than one result, the {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()} function returns the number of continuous results. This means that it is always safe to iterate through the results from 0 to {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()}. <p>QFuture provides a {@link <a href="../containers.html">Java-style iterator</a>} ({@link com.trolltech.qt.core.QFutureIterator QFutureIterator}) and an {@link <a href="../containers.html">STL-style iterator</a>} (QFuture::const_iterator). Using these iterators is another way to access results in the future. <p>QFuture also offers ways to interact with a runnning computation. For instance, the computation can be canceled with the {@link com.trolltech.qt.core.QFuture#cancel() cancel()} function. To pause the computation, use the {@link com.trolltech.qt.core.QFuture#setPaused(boolean) setPaused()} function or one of the {@link com.trolltech.qt.core.QFuture#pause() pause()}, {@link com.trolltech.qt.core.QFuture#resume() resume()}, or {@link com.trolltech.qt.core.QFuture#togglePaused() togglePaused()} convenience functions. Be aware that not all asynchronous computations can be canceled or paused. For example, the future returned by QtConcurrent::run() cannot be canceled; but the future returned by QtConcurrent::mappedReduced() can. <p>Progress information is provided by the {@link com.trolltech.qt.core.QFuture#progressValue() progressValue()}, {@link com.trolltech.qt.core.QFuture#progressMinimum() progressMinimum()}, {@link com.trolltech.qt.core.QFuture#progressMaximum() progressMaximum()}, and {@link com.trolltech.qt.core.QFuture#progressText() progressText()} functions. The {@link com.trolltech.qt.core.QFuture#waitForFinished() waitForFinished()} function causes the calling thread to block and wait for the computation to finish, ensuring that all results are available. <p>The state of the computation represented by a QFuture can be queried using the {@link com.trolltech.qt.core.QFuture#isCanceled() isCanceled()}, {@link com.trolltech.qt.core.QFuture#isStarted() isStarted()}, {@link com.trolltech.qt.core.QFuture#isFinished() isFinished()}, {@link com.trolltech.qt.core.QFuture#isRunning() isRunning()}, or {@link com.trolltech.qt.core.QFuture#isPaused() isPaused()} functions. <p>QFuture is a lightweight reference counted class that can be passed by value. <p>QFuture&lt;void&gt; is specialized to not contain any of the result fetching functions. Any QFuture&lt;T&gt; can be assigned or copied into a QFuture&lt;void&gt; as well. This is useful if only status or progress information is needed - not the actual result data. <p>To interact with running tasks using signals and slots, use {@link com.trolltech.qt.core.QFutureWatcher QFutureWatcher}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureWatcher QFutureWatcher}, and {@link <a href="../qtjambi-threads.html#qtconcurrent-intro">Qt Concurrent</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFuture<T> extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty future.
*/

    public QFuture(){
        super((QPrivateConstructor)null);
        __qt_QFuture();
    }

    native void __qt_QFuture();

/**
Constructs a copy of <tt>other</tt>. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QFuture(com.trolltech.qt.core.QFuture<T> other){
        super((QPrivateConstructor)null);
        __qt_QFuture_QFuture(other == null ? 0 : other.nativeId());
    }

    native void __qt_QFuture_QFuture(long other);

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
Returns true if the result at <tt>index</tt> is immediately available; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#resultAt(int) resultAt()}, and {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isResultReadyAt(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isResultReadyAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isResultReadyAt_int(long __this__nativeId, int index);

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
Pauses the asynchronous computation represented by this future. This is a convenience method that simply calls setPaused(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#resume() resume()}. <br></DD></DT>
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
Returns the first result in the future. If the result is not immediately available, this function will block and wait for the result to become available. This is a convenience method for calling resultAt(0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#resultAt(int) resultAt()}, and {@link com.trolltech.qt.core.QFuture#results() results()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T result()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_result(nativeId());
    }
    @QtBlockedSlot
    native T __qt_result(long __this__nativeId);

/**
Returns the result at <tt>index</tt> in the future. If the result is not immediately available, this function will block and wait for the result to become available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#result() result()}, {@link com.trolltech.qt.core.QFuture#results() results()}, and {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T resultAt(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resultAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native T __qt_resultAt_int(long __this__nativeId, int index);

/**
Returns the number of continuous results available in this future. The real number of results stored might be different from this value, due to gaps in the result set. It is always safe to iterate through the results from 0 to {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#result() result()}, {@link com.trolltech.qt.core.QFuture#resultAt(int) resultAt()}, and {@link com.trolltech.qt.core.QFuture#results() results()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int resultCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resultCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_resultCount(long __this__nativeId);

/**
Returns all results from the future. If the results are not immediately available, this function will block and wait for them to become available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#result() result()}, {@link com.trolltech.qt.core.QFuture#resultAt(int) resultAt()}, and {@link com.trolltech.qt.core.QFuture#resultCount() resultCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<T> results()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_results(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<T> __qt_results(long __this__nativeId);

/**
Resumes the asynchronous computation represented by this future. This is a convenience method that simply calls setPaused(false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#pause() pause()}. <br></DD></DT>
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
Toggles the paused state of the asynchronous computation. In other words, if the computation is currently paused, calling this function resumes it; if the computation is running, it is paused. This is a convenience method for calling setPaused(!{@link com.trolltech.qt.core.QFuture#isPaused() isPaused()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture#setPaused(boolean) setPaused()}, {@link com.trolltech.qt.core.QFuture#pause() pause()}, and {@link com.trolltech.qt.core.QFuture#resume() resume()}. <br></DD></DT>
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

    public static native QFuture fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFuture(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFuture array[]);

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
    public QFuture clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFuture __qt_clone(long __this_nativeId);
}
