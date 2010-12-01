package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QThreadPool class manages a collection of QThreads. QThreadPool manages and recyles individual QThread objects to help reduce thread creation costs in programs that use threads. Each Qt application has one global QThreadPool object, which can be accessed by calling {@link com.trolltech.qt.core.QThreadPool#globalInstance() globalInstance()}. <p>To use one of the QThreadPool threads, subclass {@link com.trolltech.qt.core.QRunnable QRunnable} and implement the run() virtual function. Then create an object of that class and pass it to {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) QThreadPool::start()}. <pre class="snippet">
        static class HelloWorldTask extends QRunnable {
            &#64;Override
            public void run()
            {
                System.out.println("Hello world from thread" + QThread.currentThread());
            }
        }

        public static void main(String args[]) {
            QCoreApplication.initialize(args);

            HelloWorldTask hello = new HelloWorldTask();
            // QThreadPool takes ownership and deletes 'hello' automatically
            QThreadPool.globalInstance().start(hello);
        }
</pre> QThreadPool deletes the {@link com.trolltech.qt.core.QRunnable QRunnable} automatically by default. Use {@link com.trolltech.qt.core.QRunnable#setAutoDelete(boolean) QRunnable::setAutoDelete()} to change the auto-deletion flag. <p>QThreadPool supports executing the same {@link com.trolltech.qt.core.QRunnable QRunnable} more than once by calling tryStart(this) from within {@link com.trolltech.qt.core.QRunnable#run() QRunnable::run()}. If autoDelete is enabled the {@link com.trolltech.qt.core.QRunnable QRunnable} will be deleted when the last thread exits the run function. Calling {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) start()} multiple times with the same {@link com.trolltech.qt.core.QRunnable QRunnable} when autoDelete is enabled creates a race condition and is not recommended. <p>Threads that are unused for a certain amount of time will expire. The default expiry timeout is 30000 milliseconds (30 seconds). This can be changed using {@link com.trolltech.qt.core.QThreadPool#setExpiryTimeout(int) setExpiryTimeout()}. Setting a negative expiry timeout disables the expiry mechanism. <p>Call {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()} to query the maximum number of threads to be used. If needed, you can change the limit with {@link com.trolltech.qt.core.QThreadPool#setMaxThreadCount(int) setMaxThreadCount()}. The default {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()} is QThread::idealThreadCount(). The {@link com.trolltech.qt.core.QThreadPool#activeThreadCount() activeThreadCount()} function returns the number of threads currently doing work. <p>The {@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()} function reserves a thread for external use. Use {@link com.trolltech.qt.core.QThreadPool#releaseThread() releaseThread()} when your are done with the thread, so that it may be reused. Essentially, these functions temporarily increase or reduce the active thread count and are useful when implementing time-consuming operations that are not visible to the QThreadPool. <p>Note that QThreadPool is a low-level class for managing threads, see QtConcurrent::run() or the other {@link <a href="../qtjambi-threads.html#qtconcurrent-intro">Qt Concurrent</a>} APIs for higher level alternatives. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRunnable QRunnable}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QThreadPool extends com.trolltech.qt.core.QObject
{


/**
Constructs a thread pool with the given <tt>parent</tt>.
*/

    public QThreadPool() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a thread pool with the given <tt>parent</tt>.
*/

    public QThreadPool(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QThreadPool_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QThreadPool_QObject(long parent);

/**
This property represents the number of active threads in the thread pool. <p><b>Note:</b> It is possible for this function to return a value that is greater than {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()}. See {@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()} for more details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()}, and {@link com.trolltech.qt.core.QThreadPool#releaseThread() releaseThread()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="activeThreadCount")
    @QtBlockedSlot
    public final int activeThreadCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeThreadCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_activeThreadCount(long __this__nativeId);

/**
Threads that are unused for <tt>expiryTimeout</tt> milliseconds are considered to have expired and will exit. Such threads will be restarted as needed. The default <tt>expiryTimeout</tt> is 30000 milliseconds (30 seconds). If <tt>expiryTimeout</tt> is negative, newly created threads will not expire, e.g., they will not exit until the thread pool is destroyed. <p>Note that setting <tt>expiryTimeout</tt> has no effect on already running threads. Only newly created threads will use the new <tt>expiryTimeout</tt>. We recommend setting the <tt>expiryTimeout</tt> immediately after creating the thread pool, but before calling {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) start()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="expiryTimeout")
    @QtBlockedSlot
    public final int expiryTimeout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expiryTimeout(nativeId());
    }
    @QtBlockedSlot
    native int __qt_expiryTimeout(long __this__nativeId);

/**
This property represents the maximum number of threads used by the thread pool. <p><b>Note:</b> The thread pool will always use at least 1 thread, even if <tt>maxThreadCount</tt> limit is zero or negative. <p>The default <tt>maxThreadCount</tt> is QThread::idealThreadCount().
*/

    @com.trolltech.qt.QtPropertyReader(name="maxThreadCount")
    @QtBlockedSlot
    public final int maxThreadCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxThreadCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxThreadCount(long __this__nativeId);

/**
Releases a thread previously reserved by a call to {@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()}. <p><b>Note:</b> Calling this function without previously reserving a thread temporarily increases {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()}. This is useful when a thread goes to sleep waiting for more work, allowing other threads to continue. Be sure to call {@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()} when done waiting, so that the thread pool can correctly maintain the {@link com.trolltech.qt.core.QThreadPool#activeThreadCount() activeThreadCount()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QThreadPool#reserveThread() reserveThread()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseThread()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseThread(nativeId());
    }
    @QtBlockedSlot
    native void __qt_releaseThread(long __this__nativeId);

/**
Reserves one thread, disregarding {@link com.trolltech.qt.core.QThreadPool#activeThreadCount() activeThreadCount()} and {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()}. <p>Once you are done with the thread, call {@link com.trolltech.qt.core.QThreadPool#releaseThread() releaseThread()} to allow it to be reused. <p><b>Note:</b> This function will always increase the number of active threads. This means that by using this function, it is possible for {@link com.trolltech.qt.core.QThreadPool#activeThreadCount() activeThreadCount()} to return a value greater than {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()} . <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QThreadPool#releaseThread() releaseThread()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void reserveThread()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reserveThread(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reserveThread(long __this__nativeId);

/**
Threads that are unused for <tt>expiryTimeout</tt> milliseconds are considered to have expired and will exit. Such threads will be restarted as needed. The default <tt>expiryTimeout</tt> is 30000 milliseconds (30 seconds). If <tt>expiryTimeout</tt> is negative, newly created threads will not expire, e.g., they will not exit until the thread pool is destroyed. <p>Note that setting <tt>expiryTimeout</tt> has no effect on already running threads. Only newly created threads will use the new <tt>expiryTimeout</tt>. We recommend setting the <tt>expiryTimeout</tt> immediately after creating the thread pool, but before calling {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) start()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="expiryTimeout")
    @QtBlockedSlot
    public final void setExpiryTimeout(int expiryTimeout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpiryTimeout_int(nativeId(), expiryTimeout);
    }
    @QtBlockedSlot
    native void __qt_setExpiryTimeout_int(long __this__nativeId, int expiryTimeout);

/**
This property represents the maximum number of threads used by the thread pool. <p><b>Note:</b> The thread pool will always use at least 1 thread, even if <tt>maxThreadCount</tt> limit is zero or negative. <p>The default <tt>maxThreadCount</tt> is QThread::idealThreadCount().
*/

    @com.trolltech.qt.QtPropertyWriter(name="maxThreadCount")
    @QtBlockedSlot
    public final void setMaxThreadCount(int maxThreadCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxThreadCount_int(nativeId(), maxThreadCount);
    }
    @QtBlockedSlot
    native void __qt_setMaxThreadCount_int(long __this__nativeId, int maxThreadCount);


/**
Reserves a thread and uses it to run <tt>runnable</tt>, unless this thread will make the current thread count exceed {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()}. In that case, <tt>runnable</tt> is added to a run queue instead. The <tt>priority</tt> argument can be used to control the run queue's order of execution. <p>Note that the thread pool takes ownership of the <tt>runnable</tt> if {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns true, and the <tt>runnable</tt> will be deleted automatically by the thread pool after the {@link com.trolltech.qt.core.QRunnable#run() runnable->run()} returns. If {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns false, ownership of <tt>runnable</tt> remains with the caller. Note that changing the auto-deletion on <tt>runnable</tt> after calling this functions results in undefined behavior.
*/

    @QtBlockedSlot
    public final void start(com.trolltech.qt.core.QRunnable runnable) {
        start(runnable, (int)0);
    }
/**
Reserves a thread and uses it to run <tt>runnable</tt>, unless this thread will make the current thread count exceed {@link com.trolltech.qt.core.QThreadPool#maxThreadCount() maxThreadCount()}. In that case, <tt>runnable</tt> is added to a run queue instead. The <tt>priority</tt> argument can be used to control the run queue's order of execution. <p>Note that the thread pool takes ownership of the <tt>runnable</tt> if {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns true, and the <tt>runnable</tt> will be deleted automatically by the thread pool after the {@link com.trolltech.qt.core.QRunnable#run() runnable->run()} returns. If {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns false, ownership of <tt>runnable</tt> remains with the caller. Note that changing the auto-deletion on <tt>runnable</tt> after calling this functions results in undefined behavior.
*/

    @QtBlockedSlot
    public final void start(com.trolltech.qt.core.QRunnable runnable, int priority)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start_QRunnable_int(nativeId(), runnable == null ? 0 : runnable.nativeId(), priority);
    }
    @QtBlockedSlot
    native void __qt_start_QRunnable_int(long __this__nativeId, long runnable, int priority);

/**
Attempts to reserve a thread to run <tt>runnable</tt>. <p>If no threads are available at the time of calling, then this function does nothing and returns false. Otherwise, <tt>runnable</tt> is run immediately using one available thread and this function returns true. <p>Note that the thread pool takes ownership of the <tt>runnable</tt> if {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns true, and the <tt>runnable</tt> will be deleted automatically by the thread pool after the {@link com.trolltech.qt.core.QRunnable#run() runnable->run()} returns. If {@link com.trolltech.qt.core.QRunnable#autoDelete() runnable->autoDelete()} returns false, ownership of <tt>runnable</tt> remains with the caller. Note that changing the auto-deletion on <tt>runnable</tt> after calling this function results in undefined behavior.
*/

    @QtBlockedSlot
    public final boolean tryStart(com.trolltech.qt.core.QRunnable runnable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryStart_QRunnable(nativeId(), runnable == null ? 0 : runnable.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tryStart_QRunnable(long __this__nativeId, long runnable);

/**
Waits for each thread to exit and removes all threads from the thread pool.
*/

    @QtBlockedSlot
    public final void waitForDone()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_waitForDone(nativeId());
    }
    @QtBlockedSlot
    native void __qt_waitForDone(long __this__nativeId);

/**
Returns the global QThreadPool instance.
*/

    public native static com.trolltech.qt.core.QThreadPool globalInstance();

/**
@exclude
*/

    public static native QThreadPool fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QThreadPool(QPrivateConstructor p) { super(p); } 
}
