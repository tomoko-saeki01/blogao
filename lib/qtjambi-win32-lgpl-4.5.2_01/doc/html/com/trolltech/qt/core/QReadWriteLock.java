package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QReadWriteLock class provides read-write locking. A read-write lock is a synchronization tool for protecting resources that can be accessed for reading and writing. This type of lock is useful if you want to allow multiple threads to have simultaneous read-only access, but as soon as one thread wants to write to the resource, all other threads must be blocked until the writing is complete. <p>In many cases, QReadWriteLock is a direct competitor to {@link com.trolltech.qt.core.QMutex QMutex}. QReadWriteLock is a good choice if there are many concurrent reads and writing occurs infrequently. <p>Example: <pre class="snippet">
        QReadWriteLock lock = new QReadWriteLock();

        public void readerFunction() {
            // ...
            lock.lockForRead();
            read_file();
            lock.unlock();
            // ...
        }

        public void writerFunction() {
            // ...
            lock.lockForWrite();
            write_file();
            lock.unlock();
            // ...
        }
</pre> To ensure that writers aren't blocked forever by readers, readers attempting to obtain a lock will not succeed if there is a blocked writer waiting for access, even if the lock is currently only accessed by other readers. Also, if the lock is accessed by a writer and another writer comes in, that writer will have priority over any readers that might also be waiting. <p>Like {@link com.trolltech.qt.core.QMutex QMutex}, a QReadWriteLock can be recursively locked by the same thread when constructed in {@link com.trolltech.qt.core.QReadWriteLock.RecursionMode QReadWriteLock::RecursionMode }recursive mode}. In such cases, {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} must be called the same number of times {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()} or {@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()} was called. Note that the lock type cannot be changed when trying to lock recursively, i.e. it is not possible to lock for reading in a thread that already has locked for writing (and vice versa). <p><DT><b>See also:</b><br><DD>QReadLocker, QWriteLocker, {@link com.trolltech.qt.core.QMutex QMutex}, and {@link com.trolltech.qt.core.QSemaphore QSemaphore}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QReadWriteLock extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
<p><DT><b>See also.</b><br><DD>QReadWriteLock(). <br></DD></DT>
*/

    public enum RecursionMode implements com.trolltech.qt.QtEnumerator {
/**
 In this mode, a thread may only lock a {@link com.trolltech.qt.core.QReadWriteLock QReadWriteLock} once.
*/

        NonRecursive(0),
/**
 In this mode, a thread can lock the same {@link com.trolltech.qt.core.QReadWriteLock QReadWriteLock} multiple times and the mutex won't be unlocked until a corresponding number of {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} calls have been made.
*/

        Recursive(1);

        RecursionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QReadWriteLock$RecursionMode constant with the specified <tt>int</tt>.</brief>
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
Constructs a QReadWriteLock object in {@link com.trolltech.qt.core.QReadWriteLock.RecursionMode NonRecursive } mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}, and {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}. <br></DD></DT>
*/

    public QReadWriteLock(){
        super((QPrivateConstructor)null);
        __qt_QReadWriteLock();
    }

    native void __qt_QReadWriteLock();

/**
Constructs a QReadWriteLock object in the given <tt>recursionMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}, {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}, and {@link com.trolltech.qt.core.QReadWriteLock.RecursionMode RecursionMode }. <br></DD></DT>
*/

    public QReadWriteLock(com.trolltech.qt.core.QReadWriteLock.RecursionMode recursionMode){
        super((QPrivateConstructor)null);
        __qt_QReadWriteLock_RecursionMode(recursionMode.value());
    }

    native void __qt_QReadWriteLock_RecursionMode(int recursionMode);

/**
Locks the lock for reading. This function will block the current thread if any thread (including the current) has locked for writing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}, and {@link com.trolltech.qt.core.QReadWriteLock#tryLockForRead() tryLockForRead()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void lockForRead()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lockForRead(nativeId());
    }
    @QtBlockedSlot
    native void __qt_lockForRead(long __this__nativeId);

/**
Locks the lock for writing. This function will block the current thread if another thread has locked for reading or writing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, {@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}, and {@link com.trolltech.qt.core.QReadWriteLock#tryLockForWrite() tryLockForWrite()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void lockForWrite()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lockForWrite(nativeId());
    }
    @QtBlockedSlot
    native void __qt_lockForWrite(long __this__nativeId);

/**
Attempts to lock for reading. If the lock was obtained, this function returns true, otherwise it returns false instead of waiting for the lock to become available, i.e. it does not block. <p>The lock attempt will fail if another thread has locked for writing. <p>If the lock was obtained, the lock must be unlocked with {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} before another thread can successfully lock it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, and {@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLockForRead()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLockForRead(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tryLockForRead(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Attempts to lock for reading. This function returns true if the lock was obtained; otherwise it returns false. If another thread has locked for writing, this function will wait for at most <tt>timeout</tt> milliseconds for the lock to become available. <p>Note: Passing a negative number as the <tt>timeout</tt> is equivalent to calling {@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}, i.e. this function will wait forever until lock can be locked for reading when <tt>timeout</tt> is negative. <p>If the lock was obtained, the lock must be unlocked with {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} before another thread can successfully lock it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, and {@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLockForRead(int timeout)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLockForRead_int(nativeId(), timeout);
    }
    @QtBlockedSlot
    native boolean __qt_tryLockForRead_int(long __this__nativeId, int timeout);

/**
Attempts to lock for writing. If the lock was obtained, this function returns true; otherwise, it returns false immediately. <p>The lock attempt will fail if another thread has locked for reading or writing. <p>If the lock was obtained, the lock must be unlocked with {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} before another thread can successfully lock it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, and {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLockForWrite()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLockForWrite(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tryLockForWrite(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Attempts to lock for writing. This function returns true if the lock was obtained; otherwise it returns false. If another thread has locked for reading or writing, this function will wait for at most <tt>timeout</tt> milliseconds for the lock to become available. <p>Note: Passing a negative number as the <tt>timeout</tt> is equivalent to calling {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}, i.e. this function will wait forever until lock can be locked for writing when <tt>timeout</tt> is negative. <p>If the lock was obtained, the lock must be unlocked with {@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()} before another thread can successfully lock it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#unlock() unlock()}, and {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryLockForWrite(int timeout)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryLockForWrite_int(nativeId(), timeout);
    }
    @QtBlockedSlot
    native boolean __qt_tryLockForWrite_int(long __this__nativeId, int timeout);

/**
Unlocks the lock. <p>Attempting to unlock a lock that is not locked is an error, and will result in program termination. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QReadWriteLock#lockForRead() lockForRead()}, {@link com.trolltech.qt.core.QReadWriteLock#lockForWrite() lockForWrite()}, {@link com.trolltech.qt.core.QReadWriteLock#tryLockForRead() tryLockForRead()}, and {@link com.trolltech.qt.core.QReadWriteLock#tryLockForWrite() tryLockForWrite()}. <br></DD></DT>
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

    public static native QReadWriteLock fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QReadWriteLock(QPrivateConstructor p) { super(p); } 
}
