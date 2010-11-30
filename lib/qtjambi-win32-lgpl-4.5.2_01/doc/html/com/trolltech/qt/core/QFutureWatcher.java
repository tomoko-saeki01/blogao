package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFutureWatcher class allows monitoring a {@link com.trolltech.qt.core.QFuture QFuture} using signals and slots. QFutureWatcher provides information and notifications about a {@link com.trolltech.qt.core.QFuture QFuture}. Use the {@link com.trolltech.qt.core.QFutureWatcher#setFuture(com.trolltech.qt.core.QFuture) setFuture()} function to start watching a particular {@link com.trolltech.qt.core.QFuture QFuture}. The {@link com.trolltech.qt.core.QFutureWatcher#future() future()} function returns the future set with {@link com.trolltech.qt.core.QFutureWatcher#setFuture(com.trolltech.qt.core.QFuture) setFuture()}. <p>For convenience, several of {@link com.trolltech.qt.core.QFuture QFuture}'s functions are also available in QFutureWatcher: progressValue(), progressMinimum(), progressMaximum(), progressText(), isStarted(), isFinished(), isRunning(), isCanceled(), isPaused(), waitForFinished(), {@link com.trolltech.qt.core.QFutureWatcher#result() result()}, and {@link com.trolltech.qt.core.QFutureWatcher#resultAt(int) resultAt()}. The cancel(), setPaused(), pause(), resume(), and togglePaused() functions are slots in QFutureWatcher. <p>Status changes are reported via the started(), finished(), canceled(), paused(), resumed(), resultReadyAt(), and resultsReadyAt() signals. Progress information is provided from the progressRangeChanged(), void progressValueChanged(), and progressTextChanged() signals. <p>Throttling control is provided by the setPendingResultsLimit() function. When the number of pending resultReadyAt() or resultsReadyAt() signals exceeds the limit, the computation represented by the future will be throttled automatically. The computation will resume once the number of pending signals drops below the limit. <p>Example: Starting a computation and getting a slot callback when it's finished: <pre class="snippet">
    // Instantiate the objects and connect to the finished signal.
    MyClass myObject = new MyClass();
    QFutureWatcher&lt;Integer&gt; watcher = new QFutureWatcher&lt;Integer&gt;();
    watcher.finished.connect(myObject, "handleFinished()");

    // Start the computation.
    QFuture&lt;Integer&gt; future = QtConcurrent.run(this, method, arg1, arg2);
    watcher.setFuture(future);
</pre> Be aware that not all asynchronous computations can be canceled or paused. For example, the future returned by QtConcurrent::run() cannot be canceled; but the future returned by QtConcurrent::mappedReduced() can. <p>QFutureWatcher&lt;void&gt; is specialized to not contain any of the result fetching functions. Any {@link com.trolltech.qt.core.QFuture QFuture}&lt;T&gt; can be watched by a QFutureWatcher&lt;void&gt; as well. This is useful if only status or progress information is needed; not the actual result data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFuture QFuture}, and {@link <a href="../qtjambi-threads.html#qtconcurrent-intro">Qt Concurrent</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFutureWatcher<T> extends com.trolltech.qt.core.QFutureWatcherBase
{


/**
Constructs a new QFutureWatcher with the given <tt>parent</tt>.
*/

    public QFutureWatcher() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new QFutureWatcher with the given <tt>parent</tt>.
*/

    public QFutureWatcher(com.trolltech.qt.core.QObject _parent){
        super((QPrivateConstructor)null);
        __qt_QFutureWatcher_QObject(_parent == null ? 0 : _parent.nativeId());
    }

    native void __qt_QFutureWatcher_QObject(long _parent);

/**
Returns the first result in the {@link com.trolltech.qt.core.QFutureWatcher#future() future()}. If the result is not immediately available, this function will block and wait for the result to become available. This is a convenience method for calling resultAt(0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureWatcher#resultAt(int) resultAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T result()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_result(nativeId());
    }
    @QtBlockedSlot
    native T __qt_result(long __this__nativeId);

/**
Returns the result at <tt>index</tt> in the {@link com.trolltech.qt.core.QFutureWatcher#future() future()}. If the result is not immediately available, this function will block and wait for the result to become available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureWatcher#result() result()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T resultAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resultAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native T __qt_resultAt_int(long __this__nativeId, int index);

/**
Starts watching the given <tt>future</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureWatcher#future() future()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFuture(com.trolltech.qt.core.QFuture<T> future)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFuture_QFuture(nativeId(), future == null ? 0 : future.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFuture_QFuture(long __this__nativeId, long future);

/**
@exclude
*/

    public static native QFutureWatcher fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureWatcher(QPrivateConstructor p) { super(p); } 

/**
Returns the watched future. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureWatcher#setFuture(com.trolltech.qt.core.QFuture) setFuture()}. <br></DD></DT>
*/

    public final QFuture<T> future() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_future(nativeId());
    }
    private native QFuture<T> __qt_future(long nativeId);

}
