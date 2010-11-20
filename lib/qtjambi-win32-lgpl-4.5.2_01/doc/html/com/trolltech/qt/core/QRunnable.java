package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QRunnable class is the base class for all runnable objects. The QRunnable class is an interface for representing a task or piece of code that needs to be executed, represented by your reimplementation of the {@link com.trolltech.qt.core.QRunnable#run() run()} function. <p>You can use {@link com.trolltech.qt.core.QThreadPool QThreadPool} to execute your code in a separate thread. {@link com.trolltech.qt.core.QThreadPool QThreadPool} deletes the QRunnable automatically if {@link com.trolltech.qt.core.QRunnable#autoDelete() autoDelete()} returns true (the default). Use {@link com.trolltech.qt.core.QRunnable#setAutoDelete(boolean) setAutoDelete()} to change the auto-deletion flag. <p>{@link com.trolltech.qt.core.QThreadPool QThreadPool} supports executing the same QRunnable more than once by calling QThreadPool::tryStart(this) from within the {@link com.trolltech.qt.core.QRunnable#run() run()} function. If autoDelete is enabled the QRunnable will be deleted when the last thread exits the run function. Calling {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) QThreadPool::start()} multiple times with the same QRunnable when autoDelete is enabled creates a race condition and is not recommended. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QThreadPool QThreadPool}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QRunnable extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.core.QRunnable {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void run() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_run(nativeId());
        }
    }


/**
Constructs a QRunnable. Auto-deletion is enabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRunnable#autoDelete() autoDelete()}, and {@link com.trolltech.qt.core.QRunnable#setAutoDelete(boolean) setAutoDelete()}. <br></DD></DT>
*/

    public QRunnable(){
        super((QPrivateConstructor)null);
        __qt_QRunnable();
    }

    native void __qt_QRunnable();

/**
Returns true is auto-deletion is enabled; false otherwise. <p>If auto-deletion is enabled, {@link com.trolltech.qt.core.QThreadPool QThreadPool} will automatically delete this runnable after calling {@link com.trolltech.qt.core.QRunnable#run() run()}; otherwise, ownership remains with the application programmer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRunnable#setAutoDelete(boolean) setAutoDelete()}, and {@link com.trolltech.qt.core.QThreadPool QThreadPool}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoDelete()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoDelete(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoDelete(long __this__nativeId);

/**
Enables auto-deletion if <tt>autoDelete</tt> is true; otherwise auto-deletion is disabled. <p>If auto-deletion is enabled, {@link com.trolltech.qt.core.QThreadPool QThreadPool} will automatically delete this runnable after calling {@link com.trolltech.qt.core.QRunnable#run() run()}; otherwise, ownership remains with the application programmer. <p>Note that this flag must be set before calling {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) QThreadPool::start()}. Calling this function after {@link com.trolltech.qt.core.QThreadPool#start(com.trolltech.qt.core.QRunnable) QThreadPool::start()} results in undefined behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRunnable#autoDelete() autoDelete()}, and {@link com.trolltech.qt.core.QThreadPool QThreadPool}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoDelete(boolean _autoDelete)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoDelete_boolean(nativeId(), _autoDelete);
    }
    @QtBlockedSlot
    native void __qt_setAutoDelete_boolean(long __this__nativeId, boolean _autoDelete);

/**
Implement this pure virtual function in your subclass.
*/

    @QtBlockedSlot
    public abstract void run();
    @QtBlockedSlot
    native void __qt_run(long __this__nativeId);

/**
@exclude
*/

    public static native QRunnable fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRunnable(QPrivateConstructor p) { super(p); } 
}
