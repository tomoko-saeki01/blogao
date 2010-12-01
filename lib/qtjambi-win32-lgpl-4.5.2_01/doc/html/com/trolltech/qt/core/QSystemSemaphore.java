package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSystemSemaphore class provides a general counting system semaphore. A semaphore is a generalization of a mutex. While a mutex can be locked only once, a semaphore can be acquired multiple times. Typically, a semaphore is used to protect a certain number of identical resources. <p>Like its lighter counterpart {@link com.trolltech.qt.core.QSemaphore QSemaphore}, a QSystemSemaphore can be accessed from multiple threads. Unlike {@link com.trolltech.qt.core.QSemaphore QSemaphore}, a QSystemSemaphore can also be accessed from multiple {@link com.trolltech.qt.core.QProcess processes}. This means QSystemSemaphore is a much heavier class, so if your application doesn't need to access your semaphores across multiple processes, you will probably want to use {@link com.trolltech.qt.core.QSemaphore QSemaphore}. <p>Semaphores support two fundamental operations, {@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()} and {@link com.trolltech.qt.core.QSystemSemaphore#release() release()}: <p>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()} tries to acquire one resource. If there isn't a resource available, the call blocks until a resource becomes available. Then the resource is acquired and the call returns. <p>{@link com.trolltech.qt.core.QSystemSemaphore#release() release()} releases one resource so it can be acquired by another process. The function can also be called with a parameter n &gt; 1, which releases n resources. <p>A system semaphore is created with a string key that other processes can use to use the same semaphore. <p>Example: Create a system semaphore<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSystemSemaphore sem("market", 3, QSystemSemaphore::Create);
                             // resources available == 3
sem.acquire();               // resources available == 2
sem.acquire();               // resources available == 1
sem.acquire();               // resources available == 0
sem.release();               // resources available == 1
sem.release(2);              // resources available == 3
</pre> A typical application of system semaphores is for controlling access to a circular buffer shared by a producer process and a consumer processes.<a name="platform-specific-behavior"><h2>Platform-Specific Behavior</h2> When using this class, be aware of the following platform differences: <p><b>Windows:</b>QSystemSemaphore does not own its underlying system semaphore. Windows owns it. This means that when all instances of QSystemSemaphore for a particular key have been destroyed, either by having their destructors called, or because one or more processes crash, Windows removes the underlying system semaphore. <p><b>Unix:</b> <ul><li> QSystemSemaphore owns the underlying system semaphore in Unix systems. This means that the last process having an instance of QSystemSemaphore for a particular key must remove the underlying system semaphore in its destructor. If the last process crashes without running the QSystemSemaphore destructor, Unix does not automatically remove the underlying system semaphore, and the semaphore survives the crash. A subsequent process that constructs a QSystemSemaphore with the same key will then be given the existing system semaphore. In that case, if the QSystemSemaphore constructor has specified its {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode access mode } as {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Open }, its initial resource count will not be reset to the one provided but remain set to the value it received in the crashed process. To protect against this, the first process to create a semaphore for a particular key (usually a server), must pass its {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode access mode } as {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create }, which will force Unix to reset the resource count in the underlying system semaphore.</li><li> When a process using QSystemSemaphore terminates for any reason, Unix automatically reverses the effect of all acquire operations that were not released. Thus if the process acquires a resource and then exits without releasing it, Unix will release that resource.</li></ul> <p><DT><b>See also:</b><br><DD>QSharedMemory, and {@link com.trolltech.qt.core.QSemaphore QSemaphore}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSystemSemaphore extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum is used by the constructor and {@link com.trolltech.qt.core.QSystemSemaphore#setKey(java.lang.String, int) setKey()}. Its purpose is to enable handling the problem in Unix implementations of semaphores that survive a crash. In Unix, when a semaphore survives a crash, we need a way to force it to reset its resource count, when the system reuses the semaphore. In Windows, where semaphores can't survive a crash, this enum has no effect.
*/

    public enum AccessMode implements com.trolltech.qt.QtEnumerator {
/**
 If the semaphore already exists, its initial resource count is not reset. If the semaphore does not already exist, it is created and its initial resource count set.
*/

        Open(0),
/**
 {@link com.trolltech.qt.core.QSystemSemaphore QSystemSemaphore} takes ownership of the semaphore and sets its resource count to the requested value, regardless of whether the semaphore already exists by having survived a crash. This value should be passed to the constructor, when the first semaphore for a particular key is constructed and you know that if the semaphore already exists it could only be because of a crash. In Windows, where a semaphore can't survive a crash, Create and Open have the same behavior.
*/

        Create(1);

        AccessMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSystemSemaphore$AccessMode constant with the specified <tt>int</tt>.</brief>
*/

        public static AccessMode resolve(int value) {
            return (AccessMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Open;
            case 1: return Create;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum SystemSemaphoreError implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 The operation failed because the caller didn't have the required permissions.
*/

        PermissionDenied(1),
/**
 The operation failed because of an invalid key.
*/

        KeyError(2),
/**
 The operation failed because a system semaphore with the specified key already existed.
*/

        AlreadyExists(3),
/**
 The operation failed because a system semaphore with the specified key could not be found.
*/

        NotFound(4),
/**
 The operation failed because there was not enough memory available to fill the request.
*/

        OutOfResources(5),
/**
 Something else happened and it was bad.
*/

        UnknownError(6);

        SystemSemaphoreError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSystemSemaphore$SystemSemaphoreError constant with the specified <tt>int</tt>.</brief>
*/

        public static SystemSemaphoreError resolve(int value) {
            return (SystemSemaphoreError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return PermissionDenied;
            case 2: return KeyError;
            case 3: return AlreadyExists;
            case 4: return NotFound;
            case 5: return OutOfResources;
            case 6: return UnknownError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Requests a system semaphore for the specified <tt>key</tt>. The parameters <tt>initialValue</tt> and <tt>mode</tt> are used according to the following rules, which are system dependent. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Open } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and the semaphore's resource count is not changed, i.e., <tt>initialValue</tt> is ignored. But if the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and its resource count is set to <tt>initialValue</tt>. If the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Windows, <tt>mode</tt> is ignored, and the system always tries to create a semaphore for the specified <tt>key</tt>. If the system does not already have a semaphore identified as <tt>key</tt>, it creates the semaphore and sets its resource count to <tt>initialValue</tt>. But if the system already has a semaphore identified as <tt>key</tt> it uses that semaphore and ignores <tt>initialValue</tt>. <p>The {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode mode } parameter is only used in Unix systems to handle the case where a semaphore survives a process crash. In that case, the next process to allocate a semaphore with the same <tt>key</tt> will get the semaphore that survived the crash, and unless <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create }, the resource count will not be reset to <tt>initialValue</tt> but will retain the initial value it had been given by the crashed process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    public QSystemSemaphore(java.lang.String key, int initialValue) {
        this(key, initialValue, com.trolltech.qt.core.QSystemSemaphore.AccessMode.Open);
    }

/**
Requests a system semaphore for the specified <tt>key</tt>. The parameters <tt>initialValue</tt> and <tt>mode</tt> are used according to the following rules, which are system dependent. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Open } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and the semaphore's resource count is not changed, i.e., <tt>initialValue</tt> is ignored. But if the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and its resource count is set to <tt>initialValue</tt>. If the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Windows, <tt>mode</tt> is ignored, and the system always tries to create a semaphore for the specified <tt>key</tt>. If the system does not already have a semaphore identified as <tt>key</tt>, it creates the semaphore and sets its resource count to <tt>initialValue</tt>. But if the system already has a semaphore identified as <tt>key</tt> it uses that semaphore and ignores <tt>initialValue</tt>. <p>The {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode mode } parameter is only used in Unix systems to handle the case where a semaphore survives a process crash. In that case, the next process to allocate a semaphore with the same <tt>key</tt> will get the semaphore that survived the crash, and unless <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create }, the resource count will not be reset to <tt>initialValue</tt> but will retain the initial value it had been given by the crashed process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    public QSystemSemaphore(java.lang.String key) {
        this(key, (int)0, com.trolltech.qt.core.QSystemSemaphore.AccessMode.Open);
    }
/**
Requests a system semaphore for the specified <tt>key</tt>. The parameters <tt>initialValue</tt> and <tt>mode</tt> are used according to the following rules, which are system dependent. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Open } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and the semaphore's resource count is not changed, i.e., <tt>initialValue</tt> is ignored. But if the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Unix, if the <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create } and the system already has a semaphore identified by <tt>key</tt>, that semaphore is used, and its resource count is set to <tt>initialValue</tt>. If the system does not already have a semaphore identified by <tt>key</tt>, it creates a new semaphore for that key and sets its resource count to <tt>initialValue</tt>. <p>In Windows, <tt>mode</tt> is ignored, and the system always tries to create a semaphore for the specified <tt>key</tt>. If the system does not already have a semaphore identified as <tt>key</tt>, it creates the semaphore and sets its resource count to <tt>initialValue</tt>. But if the system already has a semaphore identified as <tt>key</tt> it uses that semaphore and ignores <tt>initialValue</tt>. <p>The {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode mode } parameter is only used in Unix systems to handle the case where a semaphore survives a process crash. In that case, the next process to allocate a semaphore with the same <tt>key</tt> will get the semaphore that survived the crash, and unless <tt>mode</tt> is {@link com.trolltech.qt.core.QSystemSemaphore.AccessMode Create }, the resource count will not be reset to <tt>initialValue</tt> but will retain the initial value it had been given by the crashed process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    public QSystemSemaphore(java.lang.String key, int initialValue, com.trolltech.qt.core.QSystemSemaphore.AccessMode mode){
        super((QPrivateConstructor)null);
        __qt_QSystemSemaphore_String_int_AccessMode(key, initialValue, mode.value());
    }

    native void __qt_QSystemSemaphore_String_int_AccessMode(java.lang.String key, int initialValue, int mode);

/**
Acquires one of the resources guarded by this semaphore, if there is one available, and returns true. If all the resources guarded by this semaphore have already been acquired, the call blocks until one of them is released by another process or thread having a semaphore with the same key. <p>If false is returned, a system error has occurred. Call {@link com.trolltech.qt.core.QSystemSemaphore#error() error()} to get a value of {@link com.trolltech.qt.core.QSystemSemaphore.SystemSemaphoreError QSystemSemaphore::SystemSemaphoreError } that indicates which error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#release() release()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean acquire()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acquire(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acquire(long __this__nativeId);

/**
Returns a value indicating whether an error occurred, and, if so, which error it was. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSystemSemaphore.SystemSemaphoreError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QSystemSemaphore.SystemSemaphoreError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a text description of the last error that occurred. If {@link com.trolltech.qt.core.QSystemSemaphore#error() error()} returns an {@link com.trolltech.qt.core.QSystemSemaphore.SystemSemaphoreError error value }, call this function to get a text string that describes the error. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns the key assigned to this system semaphore. The key is the name by which the semaphore can be accessed from other processes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#setKey(java.lang.String, int) setKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String key()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_key(long __this__nativeId);


/**
Releases <tt>n</tt> resources guarded by the semaphore. Returns true unless there is a system error. <p>Example: Create a system semaphore having five resources; acquire them all and then release them all.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSystemSemaphore sem("market", 5, QSystemSemaphore::Create);
sem.acquire(5);           // acquire all 5 resources
sem.release(5);           // release the 5 resources
</pre> This function can also "create" resources. For example, immediately following the sequence of statements above, suppose we add the statement:<br><br>The following code example is written in c++.<br> <pre class="snippet">
sem.release(10);          // "create" 10 new resources
</pre> Ten new resources are now guarded by the semaphore, in addition to the five that already existed. You would not normally use this function to create more resources. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean release() {
        return release((int)1);
    }
/**
Releases <tt>n</tt> resources guarded by the semaphore. Returns true unless there is a system error. <p>Example: Create a system semaphore having five resources; acquire them all and then release them all.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSystemSemaphore sem("market", 5, QSystemSemaphore::Create);
sem.acquire(5);           // acquire all 5 resources
sem.release(5);           // release the 5 resources
</pre> This function can also "create" resources. For example, immediately following the sequence of statements above, suppose we add the statement:<br><br>The following code example is written in c++.<br> <pre class="snippet">
sem.release(10);          // "create" 10 new resources
</pre> Ten new resources are now guarded by the semaphore, in addition to the five that already existed. You would not normally use this function to create more resources. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSystemSemaphore#acquire() acquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean release(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_release_int(nativeId(), n);
    }
    @QtBlockedSlot
    native boolean __qt_release_int(long __this__nativeId, int n);


/**
This function works the same as the constructor. It reconstructs this QSystemSemaphore object. If the new <tt>key</tt> is different from the old key, calling this function is like calling the destructor of the semaphore with the old key, then calling the constructor to create a new semaphore with the new <tt>key</tt>. The <tt>initialValue</tt> and <tt>mode</tt> parameters are as defined for the constructor. <p><DT><b>See also:</b><br><DD>QSystemSemaphore(), and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setKey(java.lang.String key, int initialValue) {
        setKey(key, initialValue, com.trolltech.qt.core.QSystemSemaphore.AccessMode.Open);
    }

/**
This function works the same as the constructor. It reconstructs this QSystemSemaphore object. If the new <tt>key</tt> is different from the old key, calling this function is like calling the destructor of the semaphore with the old key, then calling the constructor to create a new semaphore with the new <tt>key</tt>. The <tt>initialValue</tt> and <tt>mode</tt> parameters are as defined for the constructor. <p><DT><b>See also:</b><br><DD>QSystemSemaphore(), and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setKey(java.lang.String key) {
        setKey(key, (int)0, com.trolltech.qt.core.QSystemSemaphore.AccessMode.Open);
    }
/**
This function works the same as the constructor. It reconstructs this QSystemSemaphore object. If the new <tt>key</tt> is different from the old key, calling this function is like calling the destructor of the semaphore with the old key, then calling the constructor to create a new semaphore with the new <tt>key</tt>. The <tt>initialValue</tt> and <tt>mode</tt> parameters are as defined for the constructor. <p><DT><b>See also:</b><br><DD>QSystemSemaphore(), and {@link com.trolltech.qt.core.QSystemSemaphore#key() key()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setKey(java.lang.String key, int initialValue, com.trolltech.qt.core.QSystemSemaphore.AccessMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKey_String_int_AccessMode(nativeId(), key, initialValue, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setKey_String_int_AccessMode(long __this__nativeId, java.lang.String key, int initialValue, int mode);

/**
@exclude
*/

    public static native QSystemSemaphore fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSystemSemaphore(QPrivateConstructor p) { super(p); } 
}
