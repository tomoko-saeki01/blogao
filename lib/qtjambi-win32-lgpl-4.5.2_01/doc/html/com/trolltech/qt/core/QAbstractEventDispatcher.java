package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractEventDispatcher class provides an interface to manage Qt's event queue. An event dispatcher receives events from the window system and other sources. It then sends them to the {@link com.trolltech.qt.core.QCoreApplication QCoreApplication} or {@link com.trolltech.qt.gui.QApplication QApplication} instance for processing and delivery. QAbstractEventDispatcher provides fine-grained control over event delivery. <p>For simple control of event processing use {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QCoreApplication::processEvents()}. <p>For finer control of the application's event loop, call {@link com.trolltech.qt.core.QAbstractEventDispatcher#instance() instance()} and call functions on the QAbstractEventDispatcher object that is returned. If you want to use your own instance of QAbstractEventDispatcher or of a QAbstractEventDispatcher subclass, you must create your instance before you create the {@link com.trolltech.qt.gui.QApplication QApplication} object. <p>The main event loop is started by calling {@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()}, and stopped by calling {@link com.trolltech.qt.core.QCoreApplication#exit() QCoreApplication::exit()}. Local event loops can be created using {@link com.trolltech.qt.core.QEventLoop QEventLoop}. <p>Programs that perform long operations can call {@link com.trolltech.qt.core.QAbstractEventDispatcher#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags) processEvents()} with a bitwise OR combination of various {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag QEventLoop::ProcessEventsFlag } values to control which events should be delivered. <p>QAbstractEventDispatcher also allows the integration of an external event loop with the Qt event loop. For example, the {@link <a href="../http-qtsoftware-com-products-appdev-add-on-products.html">Motif Extension Qt Solution</a>} includes a reimplementation of QAbstractEventDispatcher that merges Qt and Motif events together. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEventLoop QEventLoop}, and {@link com.trolltech.qt.core.QCoreApplication QCoreApplication}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractEventDispatcher extends com.trolltech.qt.core.QObject
{

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractEventDispatcher {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void flush() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_flush(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean hasPendingEvents() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasPendingEvents(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void interrupt() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_interrupt(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_processEvents_ProcessEventsFlags(nativeId(), flags.value());
        }

        @Override
        @QtBlockedSlot
        public void registerSocketNotifier(com.trolltech.qt.core.QSocketNotifier notifier) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_registerSocketNotifier_QSocketNotifier(nativeId(), notifier == null ? 0 : notifier.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void registerTimer(int timerId, int interval, com.trolltech.qt.core.QObject object) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_registerTimer_int_int_QObject(nativeId(), timerId, interval, object == null ? 0 : object.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.QPair<java.lang.Integer, java.lang.Integer>> registeredTimers(com.trolltech.qt.core.QObject object) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_registeredTimers_QObject(nativeId(), object == null ? 0 : object.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void unregisterSocketNotifier(com.trolltech.qt.core.QSocketNotifier notifier) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_unregisterSocketNotifier_QSocketNotifier(nativeId(), notifier == null ? 0 : notifier.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean unregisterTimer(int timerId) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_unregisterTimer_int(nativeId(), timerId);
        }

        @Override
        @QtBlockedSlot
        public boolean unregisterTimers(com.trolltech.qt.core.QObject object) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_unregisterTimers_QObject(nativeId(), object == null ? 0 : object.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void wakeUp() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_wakeUp(nativeId());
        }
    }

/**
 This signal is emitted before the event loop calls a function that could block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#awake awake() }. <br></DD></DT>
*/

    public final Signal0 aboutToBlock = new Signal0();

    private final void aboutToBlock()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToBlock(nativeId());
    }
    native void __qt_aboutToBlock(long __this__nativeId);
/**
 This signal is emitted after the event loop returns from a function that could block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#wakeUp() wakeUp()}, and {@link com.trolltech.qt.core.QAbstractEventDispatcher#aboutToBlock aboutToBlock() }. <br></DD></DT>
*/

    public final Signal0 awake = new Signal0();

    private final void awake()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_awake(nativeId());
    }
    native void __qt_awake(long __this__nativeId);


/**
Constructs a new event dispatcher with the given <tt>parent</tt>.
*/

    public QAbstractEventDispatcher() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new event dispatcher with the given <tt>parent</tt>.
*/

    public QAbstractEventDispatcher(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractEventDispatcher_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractEventDispatcher_QObject(long parent);

/**
Registers a timer with the specified <tt>interval</tt> for the given <tt>object</tt>.
*/

    @QtBlockedSlot
    public final int registerTimer(int interval, com.trolltech.qt.core.QObject object)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_registerTimer_int_QObject(nativeId(), interval, object == null ? 0 : object.nativeId());
    }
    @QtBlockedSlot
    native int __qt_registerTimer_int_QObject(long __this__nativeId, int interval, long object);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void closingDown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closingDown(nativeId());
    }
    @QtBlockedSlot
    native void __qt_closingDown(long __this__nativeId);

/**
Flushes the event queue. This normally returns almost immediately. Does nothing on platforms other than X11.
*/

    @QtBlockedSlot
    public abstract void flush();
    @QtBlockedSlot
    native void __qt_flush(long __this__nativeId);

/**
Returns true if there is an event waiting; otherwise returns false.
*/

    @QtBlockedSlot
    public abstract boolean hasPendingEvents();
    @QtBlockedSlot
    native boolean __qt_hasPendingEvents(long __this__nativeId);

/**
Interrupts event dispatching; i. . the event dispatcher will return from {@link com.trolltech.qt.core.QAbstractEventDispatcher#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags) processEvents()} as soon as possible.
*/

    @QtBlockedSlot
    public abstract void interrupt();
    @QtBlockedSlot
    native void __qt_interrupt(long __this__nativeId);

/**
Processes pending events that match <tt>flags</tt> until there are no more events to process. Returns true if an event was processed; otherwise returns false. <p>This function is especially useful if you have a long running operation and want to show its progress without allowing user input; i.e. by using the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag QEventLoop::ExcludeUserInputEvents } flag. <p>If the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag QEventLoop::WaitForMoreEvents } flag is set in <tt>flags</tt>, the behavior of this function is as follows: <ul><li> If events are available, this function returns after processing them.</li><li> If no events are available, this function will wait until more are available and return after processing newly available events.</li></ul> If the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag QEventLoop::WaitForMoreEvents } flag is not set in <tt>flags</tt>, and no events are available, this function will return immediately. <p><b>Note:</b> This function does not process events continuously; it returns after all available events are processed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#hasPendingEvents() hasPendingEvents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags);
    @QtBlockedSlot
    native boolean __qt_processEvents_ProcessEventsFlags(long __this__nativeId, int flags);

/**
Registers <tt>notifier</tt> with the event loop. Subclasses must implement this method to tie a socket notifier into another event loop.
*/

    @QtBlockedSlot
    public abstract void registerSocketNotifier(com.trolltech.qt.core.QSocketNotifier notifier);
    @QtBlockedSlot
    native void __qt_registerSocketNotifier_QSocketNotifier(long __this__nativeId, long notifier);

/**
Register a timer with the specified <tt>timerId</tt> and <tt>interval</tt> for the given <tt>object</tt>.
*/

    @QtBlockedSlot
    public abstract void registerTimer(int timerId, int interval, com.trolltech.qt.core.QObject object);
    @QtBlockedSlot
    native void __qt_registerTimer_int_int_QObject(long __this__nativeId, int timerId, int interval, long object);

/**
Returns a list of registered timers for <tt>object</tt>. The timer ID is the first member in each pair; the interval is the second.
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.QPair<java.lang.Integer, java.lang.Integer>> registeredTimers(com.trolltech.qt.core.QObject object);
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Integer, java.lang.Integer>> __qt_registeredTimers_QObject(long __this__nativeId, long object);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void startingUp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startingUp(nativeId());
    }
    @QtBlockedSlot
    native void __qt_startingUp(long __this__nativeId);

/**
Unregisters <tt>notifier</tt> from the event dispatcher. Subclasses must reimplement this method to tie a socket notifier into another event loop. Reimplementations must call the base implementation.
*/

    @QtBlockedSlot
    public abstract void unregisterSocketNotifier(com.trolltech.qt.core.QSocketNotifier notifier);
    @QtBlockedSlot
    native void __qt_unregisterSocketNotifier_QSocketNotifier(long __this__nativeId, long notifier);

/**
Unregisters the timer with the given <tt>timerId</tt>. Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#registerTimer(int, com.trolltech.qt.core.QObject) registerTimer()}, and {@link com.trolltech.qt.core.QAbstractEventDispatcher#unregisterTimers(com.trolltech.qt.core.QObject) unregisterTimers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean unregisterTimer(int timerId);
    @QtBlockedSlot
    native boolean __qt_unregisterTimer_int(long __this__nativeId, int timerId);

/**
Unregisters all the timers associated with the given <tt>object</tt>. Returns true if all timers were successful removed; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#unregisterTimer(int) unregisterTimer()}, and {@link com.trolltech.qt.core.QAbstractEventDispatcher#registeredTimers(com.trolltech.qt.core.QObject) registeredTimers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean unregisterTimers(com.trolltech.qt.core.QObject object);
    @QtBlockedSlot
    native boolean __qt_unregisterTimers_QObject(long __this__nativeId, long object);

/**
Wakes up the event loop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#awake awake() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void wakeUp();
    @QtBlockedSlot
    native void __qt_wakeUp(long __this__nativeId);


/**
Returns a pointer to the event dispatcher object for the specified <tt>thread</tt>. If <tt>thread</tt> is zero, the current thread is used. If no event dispatcher exists for the specified thread, this function returns 0. <p><b>Note:</b> If Qt is built without thread support, the <tt>thread</tt> argument is ignored.
*/

    public static com.trolltech.qt.core.QAbstractEventDispatcher instance() {
        return instance((java.lang.Thread)null);
    }
/**
Returns a pointer to the event dispatcher object for the specified <tt>thread</tt>. If <tt>thread</tt> is zero, the current thread is used. If no event dispatcher exists for the specified thread, this function returns 0. <p><b>Note:</b> If Qt is built without thread support, the <tt>thread</tt> argument is ignored.
*/

    public native static com.trolltech.qt.core.QAbstractEventDispatcher instance(java.lang.Thread thread);

/**
@exclude
*/

    public static native QAbstractEventDispatcher fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractEventDispatcher(QPrivateConstructor p) { super(p); } 
}
