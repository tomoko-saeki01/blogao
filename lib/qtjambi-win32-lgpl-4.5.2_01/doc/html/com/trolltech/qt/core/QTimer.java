package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTimer class provides repetitive and single-shot timers. The QTimer class provides a high-level programming interface for timers. To use it, create a QTimer, connect its {@link com.trolltech.qt.core.QTimer#timeout timeout() } signal to the appropriate slots, and call {@link com.trolltech.qt.core.QTimer#start() start()}. From then on it will emit the {@link com.trolltech.qt.core.QTimer#timeout timeout() } signal at constant intervals. <p>Example for a one second (1000 millisecond) timer (from the {@link <a href="../qtjambi-analogclock.html">Analog Clock</a>} example):<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QTimer *timer = new QTimer(this);

    connect(timer, SIGNAL(timeout()), this, SLOT(update()));

    timer-&gt;start(1000);
</pre> From then on, the <tt>update()</tt> slot is called every second. <p>You can set a timer to time out only once by calling setSingleShot(true). You can also use the static {@link com.trolltech.qt.core.QTimer#singleShot(int, com.trolltech.qt.core.QObject, java.lang.String) QTimer::singleShot()} function to call a slot after a specified interval: <pre class="snippet">
        QTimer.singleShot(200, this, "updateCaption()");
    </pre> In multithreaded applications, you can use QTimer in any thread that has an event loop. To start an event loop from a non-GUI thread, use QThread::exec(). Qt uses the the timer's thread affinity to determine which thread will emit the {@link com.trolltech.qt.core.QTimer#timeout timeout() } signal. Because of this, you must start and stop the timer in its thread; it is not possible to start a timer from another thread. <p>As a special case, a QTimer with a timeout of 0 will time out as soon as all the events in the window system's event queue have been processed. This can be used to do heavy work while providing a snappy user interface: <pre class="snippet">
        QTimer timer = new QTimer(this);
    
        timer.timeout.connect(this, "processOneThing()");
    
        timer.start();
    </pre> <tt>processOneThing()</tt> will from then on be called repeatedly. It should be written in such a way that it always returns quickly (typically after processing one data item) so that Qt can deliver events to widgets and stop the timer as soon as it has done all its work. This is the traditional way of implementing heavy work in GUI applications; multithreading is now becoming available on more and more platforms, and we expect that zero-millisecond QTimers will gradually be replaced by QThreads. <p>Note that QTimer's accuracy depends on the underlying operating system and hardware. Most platforms support an accuracy of 1 millisecond, but Windows 98 supports only 55. If Qt is unable to deliver the requested number of timer clicks, it will silently discard some. <p>An alternative to using QTimer is to call {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()} for your object and reimplement the {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()} event handler in your class (which must inherit {@link com.trolltech.qt.core.QObject QObject}). The disadvantage is that {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) timerEvent()} does not support such high-level features as single-shot timers or signals. <p>Another alternative to using QTimer is to use {@link com.trolltech.qt.core.QBasicTimer QBasicTimer}. It is typically less cumbersome than using {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()} directly. See {@link <a href="../timers.html">Timers</a>} for an overview of all three approaches. <p>Some operating systems limit the number of timers that may be used; Qt tries to work around these limitations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBasicTimer QBasicTimer}, {@link com.trolltech.qt.core.QTimerEvent QTimerEvent}, {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}, {@link <a href="../timers.html">Timers</a>}, {@link <a href="../qtjambi-analogclock.html">Analog Clock Example</a>}, and {@link <a href="../qtjambi-wiggly.html">Wiggly Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTimer extends com.trolltech.qt.core.QObject
{
/**
 This signal is emitted when the timer times out. <p><DT><b>See also:</b><br><DD>{@link QTimer#interval() interval}, {@link com.trolltech.qt.core.QTimer#start() start()}, and {@link com.trolltech.qt.core.QTimer#stop() stop()}. <br></DD></DT>
*/

/**

*/

    public final Signal0 timeout = new Signal0();

    private final void timeout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timeout(nativeId());
    }
    native void __qt_timeout(long __this__nativeId);


/**
Constructs a timer with the given <tt>parent</tt>.
*/

    public QTimer() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a timer with the given <tt>parent</tt>.
*/

    public QTimer(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTimer_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTimer_QObject(long parent);

/**
This property holds the timeout interval in milliseconds. The default value for this property is 0. A QTimer with a timeout interval of 0 will time out as soon as all the events in the window system's event queue have been processed. <p>Setting the interval of an active timer changes its {@link com.trolltech.qt.core.QTimer#timerId() timerId()}. <p><DT><b>See also:</b><br><DD>{@link QTimer#isSingleShot() singleShot}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="interval")
    @QtBlockedSlot
    public final int interval()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_interval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_interval(long __this__nativeId);

/**
This boolean property is true if the timer is running; otherwise false.
*/

    @com.trolltech.qt.QtPropertyReader(name="active")
    @QtBlockedSlot
    public final boolean isActive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
This property holds whether the timer is a single-shot timer. A single-shot timer fires only once, non-single-shot timers fire every {@link QTimer#interval() interval} milliseconds. <p><DT><b>See also:</b><br><DD>{@link QTimer#interval() interval}, and {@link com.trolltech.qt.core.QTimer#singleShot(int, com.trolltech.qt.core.QObject, java.lang.String) singleShot()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="singleShot")
    @QtBlockedSlot
    public final boolean isSingleShot()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSingleShot(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSingleShot(long __this__nativeId);

/**
This property holds the timeout interval in milliseconds. The default value for this property is 0. A QTimer with a timeout interval of 0 will time out as soon as all the events in the window system's event queue have been processed. <p>Setting the interval of an active timer changes its {@link com.trolltech.qt.core.QTimer#timerId() timerId()}. <p><DT><b>See also:</b><br><DD>{@link QTimer#isSingleShot() singleShot}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="interval")
    @QtBlockedSlot
    public final void setInterval(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInterval_int(nativeId(), msec);
    }
    @QtBlockedSlot
    native void __qt_setInterval_int(long __this__nativeId, int msec);

/**
This property holds whether the timer is a single-shot timer. A single-shot timer fires only once, non-single-shot timers fire every {@link QTimer#interval() interval} milliseconds. <p><DT><b>See also:</b><br><DD>{@link QTimer#interval() interval}, and {@link com.trolltech.qt.core.QTimer#singleShot(int, com.trolltech.qt.core.QObject, java.lang.String) singleShot()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleShot")
    @QtBlockedSlot
    public final void setSingleShot(boolean singleShot)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleShot_boolean(nativeId(), singleShot);
    }
    @QtBlockedSlot
    native void __qt_setSingleShot_boolean(long __this__nativeId, boolean singleShot);

/**
This function overloads {@link com.trolltech.qt.core.QTimer#start() start()}. <p>Starts or restarts the timer with the timeout specified in {@link QTimer#interval() interval}. <p>If {@link QTimer#isSingleShot() singleShot} is true, the timer will be activated only once.
*/

    public final void start()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start(nativeId());
    }
    native void __qt_start(long __this__nativeId);

/**
Starts or restarts the timer with a timeout interval of <tt>msec</tt> milliseconds.
*/

    public final void start(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start_int(nativeId(), msec);
    }
    native void __qt_start_int(long __this__nativeId, int msec);

/**
Stops the timer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimer#start() start()}. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Returns the ID of the timer if the timer is running; otherwise returns -1.
*/

    @QtBlockedSlot
    public final int timerId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_timerId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_timerId(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QTimer fromNativePointer(QNativePointer nativePointer);

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

    protected QTimer(QPrivateConstructor p) { super(p); } 

    static private class QSingleShotTimer extends QObject {
        private int timerId = -1;
        public Signal0 timeout = new Signal0();

        public QSingleShotTimer(int msec, QObject obj, String method) {
            super(obj);
            timeout.connect(obj, method);
            timerId = startTimer(msec);
        }

        protected void disposed() {
            if (timerId > 0)
                killTimer(timerId);
            super.disposed();
        }

        protected void timerEvent(QTimerEvent e) {
            if (timerId > 0)
                killTimer(timerId);
            timerId = -1;
            timeout.emit();
            disposeLater();
        }
    }

/**
This static function calls a slot after a given time interval.
<p>
It is very convenient to use this function because you do not need
to bother with a QObject.timerEvent() or
create a local QTimer object.
<p>
Example:
<pre>
<code>
    #include &ltQApplication&gt
    #include &ltQTimer&gt

    int main(int argc, char *argv[])
    {
        QApplication app(argc, argv);
        QTimer::singleShot(600000, &app, SLOT(quit()));
        ...
        return app.exec();
    }
</endcode>
</pre>
<p>
This sample program automatically terminates after 10 minutes
(600,000 milliseconds).
<p>
The <tt>obj</tt> is the receiving object and the <tt>member</tt> is the
slot. The time interval is <tt>msec</tt> milliseconds.
*/

    public static void singleShot(int msec, QObject obj, String method) {
        new QSingleShotTimer(msec, obj, method);
    }

}
