package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QWaitCondition class provides a condition variable for synchronizing threads. QWaitCondition allows a thread to tell other threads that some sort of condition has been met. One or many threads can block waiting for a QWaitCondition to set a condition with {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. Use {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} to wake one randomly selected condition or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()} to wake them all. <p>For example, let's suppose that we have three tasks that should be performed whenever the user presses a key. Each task could be split into a thread, each of which would have a run() body like this: <pre class="snippet">
        while (true) {
            mutex.lock();
            keyPressed.wait(mutex);
            do_something();
            mutex.unlock();
        }
</pre> Here, the <tt>keyPressed</tt> variable is a global variable of type QWaitCondition. <p>A fourth thread would read key presses and wake the other three threads up every time it receives one, like this: <pre class="snippet">
        while (true) {
            getchar();
            keyPressed.wakeAll();
        }
</pre> The order in which the three threads are woken up is undefined. Also, if some of the threads are still in <tt>do_something()</tt> when the key is pressed, they won't be woken up (since they're not waiting on the condition variable) and so the task will not be performed for that key press. This issue can be solved using a counter and a {@link com.trolltech.qt.core.QMutex QMutex} to guard it. For example, here's the new code for the worker threads: <pre class="snippet">
        while (true) {
            mutex.lock();
            keyPressed.wait(mutex);
            ++count;
            mutex.unlock();

            do_something();

            mutex.lock();
            --count;
            mutex.unlock();
        }
</pre> Here's the code for the fourth thread: <pre class="snippet">
        while (true) {
            getchar();

            mutex.lock();
            // Sleep until there are no busy worker threads
            while (count &gt; 0) {
                mutex.unlock();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // handle exception
                }
                mutex.lock();
            }
            keyPressed.wakeAll();
            mutex.unlock();
        }
</pre> The mutex is necessary because the results of two threads attempting to change the value of the same variable simultaneously are unpredictable. <p>Wait conditions are a powerful thread synchronization primitive. The {@link <a href="../threads-waitconditions.html">Wait Conditions</a>} example shows how to use QWaitCondition as an alternative to {@link com.trolltech.qt.core.QSemaphore QSemaphore} for controlling access to a circular buffer shared by a producer thread and a consumer thread. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex QMutex}, {@link com.trolltech.qt.core.QSemaphore QSemaphore}, QThread, and {@link <a href="../threads-waitconditions.html">Wait Conditions Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWaitCondition extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a new wait condition object.
*/

    public QWaitCondition(){
        super((QPrivateConstructor)null);
        __qt_QWaitCondition();
    }

    native void __qt_QWaitCondition();


/**
Releases the locked <tt>mutex</tt> and waits on the wait condition. The <tt>mutex</tt> must be initially locked by the calling thread. If <tt>mutex</tt> is not in a locked state, this function returns immediately. If <tt>mutex</tt> is a recursive mutex, this function returns immediately. The <tt>mutex</tt> will be unlocked, and the calling thread will block until either of these conditions is met: <ul><li> Another thread signals it using {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. This function will return true in this case.</li><li> <tt>time</tt> milliseconds has elapsed. If <tt>time</tt> is <tt>ULONG_MAX</tt> (the default), then the wait will never timeout (the event must be signalled). This function will return false if the wait timed out.</li></ul> The mutex will be returned to the same locked state. This function is provided to allow the atomic transition from the locked state to the wait state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()}, and {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean wait(com.trolltech.qt.core.QMutex mutex) {
        return wait(mutex, (int)0xffffffff);
    }
/**
Releases the locked <tt>mutex</tt> and waits on the wait condition. The <tt>mutex</tt> must be initially locked by the calling thread. If <tt>mutex</tt> is not in a locked state, this function returns immediately. If <tt>mutex</tt> is a recursive mutex, this function returns immediately. The <tt>mutex</tt> will be unlocked, and the calling thread will block until either of these conditions is met: <ul><li> Another thread signals it using {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. This function will return true in this case.</li><li> <tt>time</tt> milliseconds has elapsed. If <tt>time</tt> is <tt>ULONG_MAX</tt> (the default), then the wait will never timeout (the event must be signalled). This function will return false if the wait timed out.</li></ul> The mutex will be returned to the same locked state. This function is provided to allow the atomic transition from the locked state to the wait state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()}, and {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean wait(com.trolltech.qt.core.QMutex mutex, int time)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wait_QMutex_int(nativeId(), mutex == null ? 0 : mutex.nativeId(), time);
    }
    @QtBlockedSlot
    native boolean __qt_wait_QMutex_int(long __this__nativeId, long mutex, int time);


/**
Releases the locked <tt>readWriteLock</tt> and waits on the wait condition. The <tt>readWriteLock</tt> must be initially locked by the calling thread. If <tt>readWriteLock</tt> is not in a locked state, this function returns immediately. The <tt>readWriteLock</tt> must not be locked recursively, otherwise this function will not release the lock properly. The <tt>readWriteLock</tt> will be unlocked, and the calling thread will block until either of these conditions is met: <ul><li> Another thread signals it using {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. This function will return true in this case.</li><li> <tt>time</tt> milliseconds has elapsed. If <tt>time</tt> is <tt>ULONG_MAX</tt> (the default), then the wait will never timeout (the event must be signalled). This function will return false if the wait timed out.</li></ul> The <tt>readWriteLock</tt> will be returned to the same locked state. This function is provided to allow the atomic transition from the locked state to the wait state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()}, and {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean wait(com.trolltech.qt.core.QReadWriteLock readWriteLock) {
        return wait(readWriteLock, (int)0xffffffff);
    }
/**
Releases the locked <tt>readWriteLock</tt> and waits on the wait condition. The <tt>readWriteLock</tt> must be initially locked by the calling thread. If <tt>readWriteLock</tt> is not in a locked state, this function returns immediately. The <tt>readWriteLock</tt> must not be locked recursively, otherwise this function will not release the lock properly. The <tt>readWriteLock</tt> will be unlocked, and the calling thread will block until either of these conditions is met: <ul><li> Another thread signals it using {@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()} or {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. This function will return true in this case.</li><li> <tt>time</tt> milliseconds has elapsed. If <tt>time</tt> is <tt>ULONG_MAX</tt> (the default), then the wait will never timeout (the event must be signalled). This function will return false if the wait timed out.</li></ul> The <tt>readWriteLock</tt> will be returned to the same locked state. This function is provided to allow the atomic transition from the locked state to the wait state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()}, and {@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean wait(com.trolltech.qt.core.QReadWriteLock readWriteLock, int time)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wait_QReadWriteLock_int(nativeId(), readWriteLock == null ? 0 : readWriteLock.nativeId(), time);
    }
    @QtBlockedSlot
    native boolean __qt_wait_QReadWriteLock_int(long __this__nativeId, long readWriteLock, int time);

/**
Wakes all threads waiting on the wait condition. The order in which the threads are woken up depends on the operating system's scheduling policies and cannot be controlled or predicted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeOne() wakeOne()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void wakeAll()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wakeAll(nativeId());
    }
    @QtBlockedSlot
    native void __qt_wakeAll(long __this__nativeId);

/**
Wakes one thread waiting on the wait condition. The thread that is woken up depends on the operating system's scheduling policies, and cannot be controlled or predicted. <p>If you want to wake up a specific thread, the solution is typically to use different wait conditions and have different threads wait on different conditions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QWaitCondition#wakeAll() wakeAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void wakeOne()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wakeOne(nativeId());
    }
    @QtBlockedSlot
    native void __qt_wakeOne(long __this__nativeId);

/**
@exclude
*/

    public static native QWaitCondition fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWaitCondition(QPrivateConstructor p) { super(p); } 
}
