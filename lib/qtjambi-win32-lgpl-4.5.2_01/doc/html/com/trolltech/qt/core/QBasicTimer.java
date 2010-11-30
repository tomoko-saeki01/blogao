package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QBasicTimer class provides timer events for objects. This is a fast, lightweight, and low-level class used by Qt internally. We recommend using the higher-level {@link com.trolltech.qt.core.QTimer QTimer} class rather than this class if you want to use timers in your applications. <p>To use this class, create a QBasicTimer, and call its {@link com.trolltech.qt.core.QBasicTimer#start(int, com.trolltech.qt.core.QObject) start()} function with a timeout interval and with a pointer to a {@link com.trolltech.qt.core.QObject QObject} subclass. When the timer times out it will send a timer event to the {@link com.trolltech.qt.core.QObject QObject} subclass. The timer can be stopped at any time using {@link com.trolltech.qt.core.QBasicTimer#stop() stop()}. {@link com.trolltech.qt.core.QBasicTimer#isActive() isActive()} returns true for a timer that is running; i.e. it has been started, has not reached the timeout time, and has not been stopped. The timer's ID can be retrieved using {@link com.trolltech.qt.core.QBasicTimer#timerId() timerId()}. <p>The {@link <a href="../qtjambi-wiggly.html">Wiggly</a>} example uses QBasicTimer to repaint a widget at regular intervals. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimer QTimer}, {@link com.trolltech.qt.core.QTimerEvent QTimerEvent}, {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}, {@link <a href="../timers.html">Timers</a>}, and {@link <a href="../qtjambi-wiggly.html">Wiggly Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBasicTimer extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Contructs a basic timer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBasicTimer#start(int, com.trolltech.qt.core.QObject) start()}. <br></DD></DT>
*/

    public QBasicTimer(){
        super((QPrivateConstructor)null);
        __qt_QBasicTimer();
    }

    native void __qt_QBasicTimer();

/**
Returns true if the timer is running, has not yet timed out, and has not been stopped; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBasicTimer#start(int, com.trolltech.qt.core.QObject) start()}, and {@link com.trolltech.qt.core.QBasicTimer#stop() stop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
Starts (or restarts) the timer with a <tt>msec</tt> milliseconds timeout. <p>The given <tt>object</tt> will receive timer events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBasicTimer#stop() stop()}, {@link com.trolltech.qt.core.QBasicTimer#isActive() isActive()}, and {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void start(int msec, com.trolltech.qt.core.QObject obj)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start_int_QObject(nativeId(), msec, obj == null ? 0 : obj.nativeId());
    }
    @QtBlockedSlot
    native void __qt_start_int_QObject(long __this__nativeId, int msec, long obj);

/**
Stops the timer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBasicTimer#start(int, com.trolltech.qt.core.QObject) start()}, and {@link com.trolltech.qt.core.QBasicTimer#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void stop()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    @QtBlockedSlot
    native void __qt_stop(long __this__nativeId);

/**
Returns the timer's ID. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimerEvent#timerId() QTimerEvent::timerId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int timerId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_timerId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_timerId(long __this__nativeId);

/**
@exclude
*/

    public static native QBasicTimer fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBasicTimer(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QBasicTimer array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QBasicTimer clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QBasicTimer __qt_clone(long __this_nativeId);
}
