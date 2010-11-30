package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QEventLoop class provides a means of entering and leaving an event loop. At any time, you can create a QEventLoop object and call {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()} on it to start a local event loop. From within the event loop, calling {@link com.trolltech.qt.core.QEventLoop#exit() exit()} will force {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()} to return. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher QAbstractEventDispatcher}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QEventLoop extends com.trolltech.qt.core.QObject
{
    
/**
This enum controls the types of events processed by the {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ProcessEventsFlag implements com.trolltech.qt.QtEnumerator {
/**
 All events. Note that {@link com.trolltech.qt.core.QEvent.Type DeferredDelete } events are processed specially. See QObject::deleteLater() for more details.
*/

        AllEvents(0),
/**
 Do not process user input events, such as ButtonPress and KeyPress. Note that the events are not discarded; they will be delivered the next time {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()} is called without the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ExcludeUserInputEvents } flag.
*/

        ExcludeUserInputEvents(1),
/**
 Do not process socket notifier events. Note that the events are not discarded; they will be delivered the next time {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()} is called without the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ExcludeSocketNotifiers } flag.
*/

        ExcludeSocketNotifiers(2),
/**
 Wait for events if no pending events are available.
*/

        WaitForMoreEvents(4),
        X11ExcludeTimers(8),
/**
 deprecated - do not use.
*/

        DeferredDeletion(16),
        EventLoopExec(32),
        DialogExec(64);

        ProcessEventsFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QEventLoop$ProcessEventsFlags with the specified <tt>com.trolltech.qt.core.QEventLoop$ProcessEventsFlag[]</tt> QEventLoop$ProcessEventsFlag values set.</brief>
*/

        public static ProcessEventsFlags createQFlags(ProcessEventsFlag ... values) {
            return new ProcessEventsFlags(values);
        }
/**
<brief>Returns the QEventLoop$ProcessEventsFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static ProcessEventsFlag resolve(int value) {
            return (ProcessEventsFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AllEvents;
            case 1: return ExcludeUserInputEvents;
            case 2: return ExcludeSocketNotifiers;
            case 4: return WaitForMoreEvents;
            case 8: return X11ExcludeTimers;
            case 16: return DeferredDeletion;
            case 32: return EventLoopExec;
            case 64: return DialogExec;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ProcessEventsFlags extends com.trolltech.qt.QFlags<ProcessEventsFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QEventLoop-ProcessEventsFlags with the specified <tt>com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]</tt>. flags set.</brief>
*/

        public ProcessEventsFlags(ProcessEventsFlag ... args) { super(args); }
        public ProcessEventsFlags(int value) { setValue(value); }
    }




/**
Constructs an event loop object with the given <tt>parent</tt>.
*/

    public QEventLoop() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an event loop object with the given <tt>parent</tt>.
*/

    public QEventLoop(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QEventLoop_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QEventLoop_QObject(long parent);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final int exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ... flags) {
        return this.exec(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(flags));
    }

/**
Enters the main event loop and waits until {@link com.trolltech.qt.core.QEventLoop#exit() exit()} is called. Returns the value that was passed to {@link com.trolltech.qt.core.QEventLoop#exit() exit()}. <p>If <tt>flags</tt> are specified, only events of the types allowed by the <tt>flags</tt> will be processed. <p>It is necessary to call this function to start event handling. The main event loop receives events from the window system and dispatches these to the application widgets. <p>Generally speaking, no user interaction can take place before calling {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. As a special case, modal widgets like {@link com.trolltech.qt.gui.QMessageBox QMessageBox} can be used before calling {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}, because modal widgets use their own local event loop. <p>To make your application perform idle processing (i.e. executing a special function whenever there are no pending events), use a {@link com.trolltech.qt.core.QTimer QTimer} with 0 timeout. More sophisticated idle processing schemes can be achieved using {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() QApplication::quit()}, {@link com.trolltech.qt.core.QEventLoop#exit() exit()}, and {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int exec() {
        return exec(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(0));
    }
/**
Enters the main event loop and waits until {@link com.trolltech.qt.core.QEventLoop#exit() exit()} is called. Returns the value that was passed to {@link com.trolltech.qt.core.QEventLoop#exit() exit()}. <p>If <tt>flags</tt> are specified, only events of the types allowed by the <tt>flags</tt> will be processed. <p>It is necessary to call this function to start event handling. The main event loop receives events from the window system and dispatches these to the application widgets. <p>Generally speaking, no user interaction can take place before calling {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. As a special case, modal widgets like {@link com.trolltech.qt.gui.QMessageBox QMessageBox} can be used before calling {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}, because modal widgets use their own local event loop. <p>To make your application perform idle processing (i.e. executing a special function whenever there are no pending events), use a {@link com.trolltech.qt.core.QTimer QTimer} with 0 timeout. More sophisticated idle processing schemes can be achieved using {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() QApplication::quit()}, {@link com.trolltech.qt.core.QEventLoop#exit() exit()}, and {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec_ProcessEventsFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native int __qt_exec_ProcessEventsFlags(long __this__nativeId, int flags);


/**
Tells the event loop to exit with a return code. <p>After this function has been called, the event loop returns from the call to {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. The {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()} function returns <tt>returnCode</tt>. <p>By convention, a <tt>returnCode</tt> of 0 means success, and any non-zero value indicates an error. <p>Note that unlike the C library function of the same name, this function does return to the caller -- it is event processing that stops. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() QCoreApplication::quit()}, {@link com.trolltech.qt.core.QEventLoop#quit() quit()}, and {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void exit() {
        exit((int)0);
    }
/**
Tells the event loop to exit with a return code. <p>After this function has been called, the event loop returns from the call to {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. The {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()} function returns <tt>returnCode</tt>. <p>By convention, a <tt>returnCode</tt> of 0 means success, and any non-zero value indicates an error. <p>Note that unlike the C library function of the same name, this function does return to the caller -- it is event processing that stops. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() QCoreApplication::quit()}, {@link com.trolltech.qt.core.QEventLoop#quit() quit()}, and {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void exit(int returnCode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_exit_int(nativeId(), returnCode);
    }
    @QtBlockedSlot
    native void __qt_exit_int(long __this__nativeId, int returnCode);

/**
Returns true if the event loop is running; otherwise returns false. The event loop is considered running from the time when {@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()} is called until {@link com.trolltech.qt.core.QEventLoop#exit() exit()} is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEventLoop#exec(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) exec()}, and {@link com.trolltech.qt.core.QEventLoop#exit() exit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isRunning()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRunning(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRunning(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ... flags) {
        return this.processEvents(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(flags));
    }

/**
Processes pending events that match <tt>flags</tt> until there are no more events to process. Returns true if pending events were handled; otherwise returns false. <p>This function is especially useful if you have a long running operation and want to show its progress without allowing user input; i.e. by using the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ExcludeUserInputEvents } flag. <p>This function is simply a wrapper for {@link com.trolltech.qt.core.QAbstractEventDispatcher#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags) QAbstractEventDispatcher::processEvents()}. See the documentation for that function for details.
*/

    @QtBlockedSlot
    public final boolean processEvents() {
        return processEvents(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(0));
    }
/**
Processes pending events that match <tt>flags</tt> until there are no more events to process. Returns true if pending events were handled; otherwise returns false. <p>This function is especially useful if you have a long running operation and want to show its progress without allowing user input; i.e. by using the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ExcludeUserInputEvents } flag. <p>This function is simply a wrapper for {@link com.trolltech.qt.core.QAbstractEventDispatcher#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags) QAbstractEventDispatcher::processEvents()}. See the documentation for that function for details.
*/

    @QtBlockedSlot
    public final boolean processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_processEvents_ProcessEventsFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_processEvents_ProcessEventsFlags(long __this__nativeId, int flags);

/**
Process pending events that match <tt>flags</tt> for a maximum of <tt>maxTime</tt> milliseconds, or until there are no more events to process, whichever is shorter. This function is especially useful if you have a long running operation and want to show its progress without allowing user input, i.e. by using the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ExcludeUserInputEvents } flag. <p><b>Notes:</b> <ul><li> This function does not process events continuously; it returns after all available events are processed.</li><li> Specifying the {@link com.trolltech.qt.core.QEventLoop.ProcessEventsFlag WaitForMoreEvents } flag makes no sense and will be ignored.</li></ul>
*/

    @QtBlockedSlot
    public final void processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags, int maximumTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_processEvents_ProcessEventsFlags_int(nativeId(), flags.value(), maximumTime);
    }
    @QtBlockedSlot
    native void __qt_processEvents_ProcessEventsFlags_int(long __this__nativeId, int flags, int maximumTime);

/**
Tells the event loop to exit normally. <p>Same as exit(0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() QCoreApplication::quit()}, and {@link com.trolltech.qt.core.QEventLoop#exit() exit()}. <br></DD></DT>
*/

    public final void quit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_quit(nativeId());
    }
    native void __qt_quit(long __this__nativeId);

/**
Wakes up the event loop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#wakeUp() QAbstractEventDispatcher::wakeUp()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void wakeUp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wakeUp(nativeId());
    }
    @QtBlockedSlot
    native void __qt_wakeUp(long __this__nativeId);

/**
@exclude
*/

    public static native QEventLoop fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QEventLoop(QPrivateConstructor p) { super(p); } 
}
