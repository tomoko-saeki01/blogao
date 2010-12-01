package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTimerEvent class contains parameters that describe a timer event. Timer events are sent at regular intervals to objects that have started one or more timers. Each timer has a unique identifier. A timer is started with {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()}. <p>The {@link com.trolltech.qt.core.QTimer QTimer} class provides a high-level programming interface that uses signals instead of events. It also provides single-shot timers. <p>The event handler {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()} receives timer events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimer QTimer}, {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}, {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()}, and {@link com.trolltech.qt.core.QObject#killTimer(int) QObject::killTimer()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTimerEvent extends com.trolltech.qt.core.QEvent
{

/**
Constructs a timer event object with the timer identifier set to <tt>timerId</tt>.
*/

    public QTimerEvent(int timerId){
        super((QPrivateConstructor)null);
        __qt_QTimerEvent_int(timerId);
    }

    native void __qt_QTimerEvent_int(int timerId);

/**
Returns the unique timer identifier, which is the same identifier as returned from {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()}.
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
Sets the <tt>id</tt> of this QTimerEvent.
*/

    @QtBlockedSlot
    protected final void setId(int id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setId_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_setId_int(long __this__nativeId, int id);

/**
Returns the id of this QTimerEvent.
*/

    @QtBlockedSlot
    protected final int id()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_id(nativeId());
    }
    @QtBlockedSlot
    native int __qt_id(long __this__nativeId);

/**
@exclude
*/

    public static native QTimerEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTimerEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QTimerEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(type=" + type().name() + ")";
    }
}
