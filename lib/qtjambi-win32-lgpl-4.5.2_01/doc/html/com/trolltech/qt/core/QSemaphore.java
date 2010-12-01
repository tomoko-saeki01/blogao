package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSemaphore class provides a general counting semaphore. A semaphore is a generalization of a mutex. While a mutex can only be locked once, it's possible to acquire a semaphore multiple times. Semaphores are typically used to protect a certain number of identical resources. <p>Semaphores support two fundamental operations, {@link com.trolltech.qt.core.QSemaphore#acquire() acquire()} and {@link com.trolltech.qt.core.QSemaphore#release() release()}: <ul><li> acquire(n) tries to acquire n resources. If there aren't that many resources available, the call will block until this is the case.</li><li> release(n) releases n resources.</li></ul> There's also a {@link com.trolltech.qt.core.QSemaphore#tryAcquire() tryAcquire()} function that returns immediately if it cannot acquire the resources, and an {@link com.trolltech.qt.core.QSemaphore#available() available()} function that returns the number of available resources at any time. <p>Example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);      // sem.available() == 5

        sem.acquire(3);         // sem.available() == 2
        sem.acquire(2);         // sem.available() == 0
        sem.release(5);         // sem.available() == 5
        sem.release(5);         // sem.available() == 10

        sem.tryAcquire(1);      // sem.available() == 9, returns true
        sem.tryAcquire(250);    // sem.available() == 9, returns false
</pre> A typical application of semaphores is for controlling access to a circular buffer shared by a producer thread and a consumer thread. The {@link <a href="../threads-semaphores.html">Semaphores</a>} example shows how to use QSemaphore to solve that problem. <p>A non-computing example of a semaphore would be dining at a restaurant. A semaphore is initialized with the number of chairs in the restaurant. As people arrive, they want a seat. As seats are filled, {@link com.trolltech.qt.core.QSemaphore#available() available()} is decremented. As people leave, the {@link com.trolltech.qt.core.QSemaphore#available() available()} is incremented, allowing more people to enter. If a party of 10 people want to be seated, but there are only 9 seats, those 10 people will wait, but a party of 4 people would be seated (taking the available seats to 5, making the party of 10 people wait longer). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMutex QMutex}, {@link com.trolltech.qt.core.QWaitCondition QWaitCondition}, QThread, and {@link <a href="../threads-semaphores.html">Semaphores Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSemaphore extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }


/**
Creates a new semaphore and initializes the number of resources it guards to <tt>n</tt> (by default, 0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#release() release()}, and {@link com.trolltech.qt.core.QSemaphore#available() available()}. <br></DD></DT>
*/

    public QSemaphore() {
        this((int)0);
    }
/**
Creates a new semaphore and initializes the number of resources it guards to <tt>n</tt> (by default, 0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#release() release()}, and {@link com.trolltech.qt.core.QSemaphore#available() available()}. <br></DD></DT>
*/

    public QSemaphore(int n){
        super((QPrivateConstructor)null);
        __qt_QSemaphore_int(n);
    }

    native void __qt_QSemaphore_int(int n);


/**
Tries to acquire <tt>n</tt> resources guarded by the semaphore. If <tt>n</tt> &gt; {@link com.trolltech.qt.core.QSemaphore#available() available()}, this call will block until enough resources are available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#release() release()}, {@link com.trolltech.qt.core.QSemaphore#available() available()}, and {@link com.trolltech.qt.core.QSemaphore#tryAcquire() tryAcquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void acquire() {
        acquire((int)1);
    }
/**
Tries to acquire <tt>n</tt> resources guarded by the semaphore. If <tt>n</tt> &gt; {@link com.trolltech.qt.core.QSemaphore#available() available()}, this call will block until enough resources are available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#release() release()}, {@link com.trolltech.qt.core.QSemaphore#available() available()}, and {@link com.trolltech.qt.core.QSemaphore#tryAcquire() tryAcquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void acquire(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_acquire_int(nativeId(), n);
    }
    @QtBlockedSlot
    native void __qt_acquire_int(long __this__nativeId, int n);

/**
Returns the number of resources currently available to the semaphore. This number can never be negative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSemaphore#release() release()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int available()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_available(nativeId());
    }
    @QtBlockedSlot
    native int __qt_available(long __this__nativeId);


/**
Releases <tt>n</tt> resources guarded by the semaphore. <p>This function can be used to "create" resources as well. For example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);      // a semaphore that guards 5 resources
        sem.acquire(5);         // acquire all 5 resources
        sem.release(5);         // release the 5 resources
        sem.release(10);        // "create" 10 new resources
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSemaphore#available() available()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void release() {
        release((int)1);
    }
/**
Releases <tt>n</tt> resources guarded by the semaphore. <p>This function can be used to "create" resources as well. For example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);      // a semaphore that guards 5 resources
        sem.acquire(5);         // acquire all 5 resources
        sem.release(5);         // release the 5 resources
        sem.release(10);        // "create" 10 new resources
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}, and {@link com.trolltech.qt.core.QSemaphore#available() available()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void release(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_release_int(nativeId(), n);
    }
    @QtBlockedSlot
    native void __qt_release_int(long __this__nativeId, int n);


/**
Tries to acquire <tt>n</tt> resources guarded by the semaphore and returns true on success. If {@link com.trolltech.qt.core.QSemaphore#available() available()} &lt; <tt>n</tt>, this call immediately returns false without acquiring any resources. <p>Example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);      // sem.available() == 5
        sem.tryAcquire(250);    // sem.available() == 5, returns false
        sem.tryAcquire(3);      // sem.available() == 2, returns true
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryAcquire() {
        return tryAcquire((int)1);
    }
/**
Tries to acquire <tt>n</tt> resources guarded by the semaphore and returns true on success. If {@link com.trolltech.qt.core.QSemaphore#available() available()} &lt; <tt>n</tt>, this call immediately returns false without acquiring any resources. <p>Example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);      // sem.available() == 5
        sem.tryAcquire(250);    // sem.available() == 5, returns false
        sem.tryAcquire(3);      // sem.available() == 2, returns true
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryAcquire(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryAcquire_int(nativeId(), n);
    }
    @QtBlockedSlot
    native boolean __qt_tryAcquire_int(long __this__nativeId, int n);

/**
Tries to acquire <tt>n</tt> resources guarded by the semaphore and returns true on success. If {@link com.trolltech.qt.core.QSemaphore#available() available()} &lt; <tt>n</tt>, this call will wait for at most <tt>timeout</tt> milliseconds for resources to become available. <p>Note: Passing a negative number as the <tt>timeout</tt> is equivalent to calling {@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}, i.e. this function will wait forever for resources to become available if <tt>timeout</tt> is negative. <p>Example: <pre class="snippet">
        QSemaphore sem = new QSemaphore(5);            // sem.available() == 5
        sem.tryAcquire(250, 1000);    // sem.available() == 5, waits 1000 milliseconds and returns false
        sem.tryAcquire(3, 30000);     // sem.available() == 2, returns true without waiting
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSemaphore#acquire() acquire()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean tryAcquire(int n, int timeout)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tryAcquire_int_int(nativeId(), n, timeout);
    }
    @QtBlockedSlot
    native boolean __qt_tryAcquire_int_int(long __this__nativeId, int n, int timeout);

/**
@exclude
*/

    public static native QSemaphore fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSemaphore(QPrivateConstructor p) { super(p); } 
}
