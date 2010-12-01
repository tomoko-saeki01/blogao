package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QMutex class provides access serialization between threads. The purpose of a QMutex is to protect an object, data structure or section of code so that only one thread can access it at a time (this is similar to the Java <tt>synchronized</tt> keyword). It is usually best to use a mutex with a QMutexLocker since this makes it easy to ensure that locking and unlocking are performed consistently. <p>For example, say there is a method that prints a message to the user on two lines: <pre class="snippet">
        int number = 6;

        public void method1()
        {
            number *= 5;
            number /= 4;
        }

        public void method2()
        {
            number *= 3;
            number /= 2;
        }
</pre> If these two methods are called in succession, the following happens: <pre class="snippet">
        // method1()
        number *= 5;        // number is now 30
        number /= 4;        // number is now 7

        // method2()
        number *= 3;        // number is now 21
        number /= 2;        // number is now 10
</pre> If these two methods are called simultaneously from two threads then the following sequence could result: <pre class="snippet">
        // Thread 1 calls method1()
        number *= 5;        // number is now 30

        // Thread 2 calls method2().
        //
        // Most likely Thread 1 has been put to sleep by the operating
        // system to allow Thread 2 to run.
        number *= 3;        // number is now 90
        number /= 2;        // number is now 45

        // Thread 1 finishes executing.
        number /= 4;        // number is now 11, instead of 10
</pre> If we add a mutex, we should get the result we want: <pre class="snippet">
        QMutex mutex = new QMutex();
        int number = 6;

        public void method1()
        {
            mutex.lock();
            number *= 5;
            number /= 4;
            mutex.unlock();
        }

        public void method2()
        {
            mutex.lock();
            number *= 3;
            number /= 2;
            mutex.unlock();
        }
</pre> Then only one thread can modify <tt>number</tt> at any given time and the result is correct. This is a trivial example, of course, but applies to any other case where things need to happen in a particular sequence. <p>When you call {@link com.trolltech.qt.core.QMutex#lock() lock()} in a thread, other threads that try to call {@link com.trolltech.qt.core.QMutex#lock() lock()} in the same place will block until the thread that got the lock calls {@link com.trolltech.qt.core.QMutex#unlock() unlock()}. A non-blocking alternative to {@link com.trolltech.qt.core.QMutex#lock() lock()} is {@link com.trolltech.qt.core.QMutex#tryLock() tryLock()}. <p><DT><b>See also:</b><br><DD>QMutexLocker, {@link com.trolltech.qt.core.QReadWriteLock QReadWriteLock}, {@link com.trolltech.qt.core.QSemaphore QSemaphore}, and {@link com.trolltech.qt.core.QWaitCondition QWaitCondition}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMutex extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
<p><DT><b>See also.</b><br><DD>QMutex(). <br></DD></DT>
*/

    public enum RecursionMode implements com.trolltech.qt.QtEnumerator {
/**
 In this mode, a thread may only lock a mutex once.
*/

        NonRecursive(0),
/**
 In this mode, a thread can lock the same mutex multiple times and the mutex won't be unlocked until a corresponding number of {@link com.trolltech.qt.core.QMutex#unlock() unlock()} calls have been made.
*/

        Recursive(1);

        RecursionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMutex$RecursionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static RecursionMode resolve(int value) {
            return (RecursionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NonRecursive;
            case 1: return Recursive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a new mutex. The mutex is created in an unlocked state. <p>If <tt>mode</tt> is {@link com.trolltech.qt.core.QMutex.RecursionMode QMutex::Recursive }, a thread can lock the same mutex multiple times and the mutex won't be unlocked until a corresponding number of {@link com.trolltech.qt.core.QMutex#unlock() unlock()} calls have been made. The default is {@link com.trolltech.qt.core.QMutex.RecursionMode QMutex::NonRecursive }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#lock() lock()}, and {@link com.trolltech.qt.core.QMutex#unlock() unlock()}. <br></DD></DT>
*/

    public QMutex() {
        this(com.trolltech.qt.core.QMutex.RecursionMode.NonRecursive);
    }
/**
Constructs a new mutex. The mutex is created in an unlocked state. <p>If <tt>mode</tt> is {@link com.trolltech.qt.core.QMutex.RecursionMode QMutex::Recursive }, a thread can lock the same mutex multiple times and the mutex won't be unlocked until a corresponding number of {@link com.trolltech.qt.core.QMutex#unlock() unlock()} calls have been made. The default is {@link com.trolltech.qt.core.QMutex.RecursionMode QMutex::NonRecursive }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#lock() lock()}, and {@link com.trolltech.qt.core.QMutex#unlock() unlock()}. <br></DD></DT>
*/

    public QMutex(com.trolltech.qt.core.QMutex.RecursionMode mode){
        super((QPrivateConstructor)null);
        __qt_QMutex_RecursionMode(mode.value());
    }

    native void __qt_QMutex_RecursionMode(int mode);

/**
Locks the mutex. If another thread has locked the mutex then this call will block until that thread has unlocked it. <p>Calling this function multiple times on the same mutex from the same thread is allowed if this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode recursive mutex }. If this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode non-recursive mutex }, this function will dead-lock when the mutex is locked recursively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#unlock() unlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void lock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_lock(long __this__nativeId);

/**
Attempts to lock the mutex. If the lock was obtained, this function returns true. If another thread has locked the mutex, this function returns false immediately. <p>If the lock was obtained, the mutex must be unlocked with {@link com.trolltech.qt.core.QMutex#unlock() unlock()} before another thread can successfully lock it. <p>Calling this function multiple times on the same mutex from the same thread is allowed if this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode recursive mutex }. If this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode non-recursive mutex }, this function will always return false when attempting to lock the mutex recursively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#lock() lock()}, and {@link com.trolltech.qt.core.QMutex#unlock() unlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLock(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tryLock(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Attempts to lock the mutex. This function returns true if the lock was obtained; otherwise it returns false. If another thread has locked the mutex, this function will wait for at most <tt>timeout</tt> milliseconds for the mutex to become available. <p>Note: Passing a negative number as the <tt>timeout</tt> is equivalent to calling {@link com.trolltech.qt.core.QMutex#lock() lock()}, i.e. this function will wait forever until mutex can be locked if <tt>timeout</tt> is negative. <p>If the lock was obtained, the mutex must be unlocked with {@link com.trolltech.qt.core.QMutex#unlock() unlock()} before another thread can successfully lock it. <p>Calling this function multiple times on the same mutex from the same thread is allowed if this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode recursive mutex }. If this mutex is a {@link com.trolltech.qt.core.QMutex.RecursionMode non-recursive mutex }, this function will always return false when attempting to lock the mutex recursively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#lock() lock()}, and {@link com.trolltech.qt.core.QMutex#unlock() unlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLock(int timeout)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLock_int(nativeId(), timeout);
    }
    @QtBlockedSlot
    native boolean __qt_tryLock_int(long __this__nativeId, int timeout);

/**
Unlocks the mutex. Attempting to unlock a mutex in a different thread to the one that locked it results in an error. Unlocking a mutex that is not locked results in undefined behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex#lock() lock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void unlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unlock(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unlock(long __this__nativeId);

/**
@exclude
*/

    public static native QMutex fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMutex(QPrivateConstructor p) { super(p); } 
}
