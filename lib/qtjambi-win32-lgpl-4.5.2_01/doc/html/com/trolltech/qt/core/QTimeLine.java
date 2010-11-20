package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTimeLine class provides a timeline for controlling animations. It's most commonly used to animate a GUI control by calling a slot periodically. You can construct a timeline by passing its duration in milliseconds to QTimeLine's constructor. The timeline's duration describes for how long the animation will run. Then you set a suitable frame range by calling {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. Finally connect the {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } signal to a suitable slot in the widget you wish to animate (e.g., setValue() in {@link com.trolltech.qt.gui.QProgressBar QProgressBar}). When you proceed to calling {@link com.trolltech.qt.core.QTimeLine#start() start()}, QTimeLine will enter Running state, and start emitting {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } at regular intervals, causing your widget's connected property's value to grow from the lower end to the upper and of your frame range, at a steady rate. You can specify the update interval by calling {@link com.trolltech.qt.core.QTimeLine#setUpdateInterval(int) setUpdateInterval()}. When done, QTimeLine enters {@link com.trolltech.qt.core.QTimeLine.State NotRunning } state, and emits {@link com.trolltech.qt.core.QTimeLine#finished finished() }. <p>Example: <pre class="snippet">
        // ...
        progressBar = new QProgressBar(this);
        progressBar.setRange(0, 100);

        // Construct a 1-second timeline with a frame range of 0 - 100
        QTimeLine timeLine = new QTimeLine(1000, this);
        timeLine.setFrameRange(0, 100);
        timeLine.frameChanged.connect(progressBar, "setValue(int)");

        // Clicking the push button will start the progress bar animation
        pushButton = new QPushButton(tr("Start animation"), this);
        pushButton.clicked.connect(timeLine, "start()");
        // ...
</pre> You can also use QTimeLine with the {@link <a href="../graphicsview.html">Graphics View framework</a>} for animations. The {@link com.trolltech.qt.gui.QGraphicsItemAnimation QGraphicsItemAnimation} class implements animation of {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItems} with a timeline. <p>By default the timeline runs once, from the beginning and towards the end, upon which you must call {@link com.trolltech.qt.core.QTimeLine#start() start()} again to restart from the beginning. To make the timeline loop, you can call {@link com.trolltech.qt.core.QTimeLine#setLoopCount(int) setLoopCount()}, passing the number of times the timeline should run before finishing. The direction can also be changed, causing the timeline to run backward, by calling {@link com.trolltech.qt.core.QTimeLine#setDirection(com.trolltech.qt.core.QTimeLine.Direction) setDirection()}. You can also pause and unpause the timeline while it's running by calling {@link com.trolltech.qt.core.QTimeLine#setPaused(boolean) setPaused()}. For interactive control, the {@link com.trolltech.qt.core.QTimeLine#setCurrentTime(int) setCurrentTime()} function is provided, which sets the time position of the time line directly. Although most useful in {@link com.trolltech.qt.core.QTimeLine.State NotRunning } state, (e.g., connected to a {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() } signal in a {@link com.trolltech.qt.gui.QSlider QSlider},) this function can be called at any time. <p>The frame interface is useful for standard widgets, but QTimeLine can be used to control any type of animation. The heart of QTimeLine lies in the {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()} function, which generates a value between 0 and 1 for a given time. This value is typically used to describe the steps of an animation, where 0 is the first step of an animation, and 1 is the last step. When running, QTimeLine generates values between 0 and 1 by calling {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()} and emitting {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() }. By default, {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()} applies an interpolation algorithm to generate these value. You can choose from a set of predefined timeline algorithms by calling {@link com.trolltech.qt.core.QTimeLine#setCurveShape(com.trolltech.qt.core.QTimeLine.CurveShape) setCurveShape()}. By default, QTimeLine uses the EaseInOut curve shape, which provides a value that grows slowly, then grows steadily, and finally grows slowly. For a custom timeline, you can reimplement {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}, in which case QTimeLine's {@link QTimeLine#curveShape() curveShape} property is ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressBar QProgressBar}, {@link com.trolltech.qt.gui.QProgressDialog QProgressDialog}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation QGraphicsItemAnimation}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTimeLine extends com.trolltech.qt.core.QObject
{
    
/**
This enum describes the direction of the timeline when in {@link com.trolltech.qt.core.QTimeLine.State Running } state. <p><DT><b>See also:</b><br><DD>setDirection(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum Direction implements com.trolltech.qt.QtEnumerator {
/**
 The current time of the timeline increases with time (i.e., moves from 0 and towards the end / duration).
*/

        Forward(0),
/**
 The current time of the timeline decreases with time (i.e., moves from the end / duration and towards 0).
*/

        Backward(1);

        Direction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTimeLine$Direction constant with the specified <tt>int</tt>.</brief>
*/

        public static Direction resolve(int value) {
            return (Direction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Forward;
            case 1: return Backward;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the default shape of {@link com.trolltech.qt.core.QTimeLine QTimeLine}'s value curve. The default, shape is {@link com.trolltech.qt.core.QTimeLine.CurveShape EaseInOutCurve }. The curve defines the relation between the value and the timeline. <p><DT><b>See also:</b><br><DD>setCurveShape(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum CurveShape implements com.trolltech.qt.QtEnumerator {
/**
 The value starts growing slowly, then increases in speed.
*/

        EaseInCurve(0),
/**
 The value starts growing steadily, then ends slowly.
*/

        EaseOutCurve(1),
/**
 The value starts growing slowly, then runs steadily, then grows slowly again.
*/

        EaseInOutCurve(2),
/**
 The value grows linearly (e.g., if the duration is 1000 ms, the value at time 500 ms is 0.5).
*/

        LinearCurve(3),
/**
 The value grows sinusoidally.
*/

        SineCurve(4),
/**
 The value grows cosinusoidally.
*/

        CosineCurve(5);

        CurveShape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTimeLine$CurveShape constant with the specified <tt>int</tt>.</brief>
*/

        public static CurveShape resolve(int value) {
            return (CurveShape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return EaseInCurve;
            case 1: return EaseOutCurve;
            case 2: return EaseInOutCurve;
            case 3: return LinearCurve;
            case 4: return SineCurve;
            case 5: return CosineCurve;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the state of the timeline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#state() state()}, and {@link com.trolltech.qt.core.QTimeLine#stateChanged stateChanged() }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 The timeline is not running. This is the initial state of {@link com.trolltech.qt.core.QTimeLine QTimeLine}, and the state {@link com.trolltech.qt.core.QTimeLine QTimeLine} reenters when finished. The current time, frame and value remain unchanged until either setCurrentTime() is called, or the timeline is started by calling {@link com.trolltech.qt.core.QTimeLine#start() start()}.
*/

        NotRunning(0),
/**
 The timeline is paused (i.e., temporarily suspended). Calling setPaused(false) will resume timeline activity.
*/

        Paused(1),
/**
 The timeline is running. While control is in the event loop, {@link com.trolltech.qt.core.QTimeLine QTimeLine} will update its current time at regular intervals, emitting {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() } and {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } when appropriate.
*/

        Running(2);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTimeLine$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotRunning;
            case 1: return Paused;
            case 2: return Running;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when QTimeLine finishes (i.e., reaches the end of its time line), and does not loop.
*/

    public final Signal0 finished = new Signal0();

    private final void finished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished(nativeId());
    }
    native void __qt_finished(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: frame)&gt;:<p> QTimeLine emits this signal at regular intervals when in {@link com.trolltech.qt.core.QTimeLine.State Running } state, but only if the current frame changes. <tt>frame</tt> is the current frame number. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) QTimeLine::setFrameRange()}, and {@link QTimeLine#updateInterval() QTimeLine::updateInterval}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> frameChanged = new Signal1<java.lang.Integer>();

    private final void frameChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_frameChanged_int(nativeId(), arg__1);
    }
    native void __qt_frameChanged_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QTimeLine$State(named: newState)&gt;:<p> This signal is emitted whenever QTimeLine's state changes. The new state is <tt>newState</tt>.
*/

    public final Signal1<com.trolltech.qt.core.QTimeLine.State> stateChanged = new Signal1<com.trolltech.qt.core.QTimeLine.State>();

    private final void stateChanged(com.trolltech.qt.core.QTimeLine.State newState)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_State(nativeId(), newState.value());
    }
    native void __qt_stateChanged_State(long __this__nativeId, int newState);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Double(named: value)&gt;:<p> QTimeLine emits this signal at regular intervals when in {@link com.trolltech.qt.core.QTimeLine.State Running } state, but only if the current value changes. <tt>value</tt> is the current value. <tt>value</tt> is a number between 0.0 and 1.0 <p><DT><b>See also:</b><br><DD>{@link QTimeLine#setDuration(int) QTimeLine::setDuration()}, {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) QTimeLine::valueForTime()}, and {@link QTimeLine#updateInterval() QTimeLine::updateInterval}. <br></DD></DT>
*/

    public final Signal1<java.lang.Double> valueChanged = new Signal1<java.lang.Double>();

    private final void valueChanged(double x)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_double(nativeId(), x);
    }
    native void __qt_valueChanged_double(long __this__nativeId, double x);


/**
Constructs a timeline with a duration of <tt>duration</tt> milliseconds. <tt>parent</tt> is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. The default duration is 1000 milliseconds.
*/

    public QTimeLine(int duration) {
        this(duration, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a timeline with a duration of <tt>duration</tt> milliseconds. <tt>parent</tt> is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. The default duration is 1000 milliseconds.
*/

    public QTimeLine() {
        this((int)1000, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a timeline with a duration of <tt>duration</tt> milliseconds. <tt>parent</tt> is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. The default duration is 1000 milliseconds.
*/

    public QTimeLine(int duration, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTimeLine_int_QObject(duration, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTimeLine_int_QObject(int duration, long parent);

/**
Returns the frame corresponding to the current time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#currentTime() currentTime()}, {@link com.trolltech.qt.core.QTimeLine#frameForTime(int) frameForTime()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrame(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentFrame(long __this__nativeId);

/**
This property holds the current time of the time line.  When QTimeLine is in Running state, this value is updated continuously as a function of the duration and direction of the timeline. Otherwise, it is value that was current when {@link com.trolltech.qt.core.QTimeLine#stop() stop()} was called last, or the value set by {@link com.trolltech.qt.core.QTimeLine#setCurrentTime(int) setCurrentTime()}. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentTime")
    @QtBlockedSlot
    public final int currentTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentTime(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentTime(long __this__nativeId);

/**
Returns the value corresponding to the current time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}, and {@link com.trolltech.qt.core.QTimeLine#currentFrame() currentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double currentValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentValue(nativeId());
    }
    @QtBlockedSlot
    native double __qt_currentValue(long __this__nativeId);

/**
This property holds the shape of the timeline curve.  The curve shape describes the relation between the time and value for the base implementation of {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <p>If you have reimplemented {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}, this value is ignored. <p>By default, this property is set to {@link com.trolltech.qt.core.QTimeLine.CurveShape EaseInOutCurve }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="curveShape")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTimeLine.CurveShape curveShape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTimeLine.CurveShape.resolve(__qt_curveShape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_curveShape(long __this__nativeId);

/**
This property holds the direction of the timeline when QTimeLine is in {@link com.trolltech.qt.core.QTimeLine.State Running } state.. This direction indicates whether the time moves from 0 towards the timeline duration, or from the value of the duration and towards 0 after {@link com.trolltech.qt.core.QTimeLine#start() start()} has been called. <p>By default, this property is set to {@link com.trolltech.qt.core.QTimeLine.Direction Forward }.
*/

    @com.trolltech.qt.QtPropertyReader(name="direction")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTimeLine.Direction direction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTimeLine.Direction.resolve(__qt_direction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_direction(long __this__nativeId);

/**
This property holds the total duration of the timeline in milliseconds.  By default, this value is 1000 (i.e., 1 second), but you can change this by either passing a duration to QTimeLine's constructor, or by calling {@link com.trolltech.qt.core.QTimeLine#setDuration(int) setDuration()}. The duration must be larger than 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="duration")
    @QtBlockedSlot
    public final int duration()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_duration(nativeId());
    }
    @QtBlockedSlot
    native int __qt_duration(long __this__nativeId);

/**
Returns the end frame, which is the frame corresponding to the end of the timeline (i. ., the frame for which the current value is 1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#setEndFrame(int) setEndFrame()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int endFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endFrame(nativeId());
    }
    @QtBlockedSlot
    native int __qt_endFrame(long __this__nativeId);

/**
Returns the frame corresponding to the time <tt>msec</tt>. This value is calculated using a linear interpolation of the start and end frame, based on the value returned by {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int frameForTime(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameForTime_int(nativeId(), msec);
    }
    @QtBlockedSlot
    native int __qt_frameForTime_int(long __this__nativeId, int msec);

/**
This property holds the number of times the timeline should loop before it's finished.  A loop count of of 0 means that the timeline will loop forever. <p>By default, this property contains a value of 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="loopCount")
    @QtBlockedSlot
    public final int loopCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loopCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loopCount(long __this__nativeId);

/**
Resumes the timeline from the current time. QTimeLine will reenter Running state, and once it enters the event loop, it will update its current time, frame and value at regular intervals. <p>In contrast to {@link com.trolltech.qt.core.QTimeLine#start() start()}, this function does not restart the timeline before is resumes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#start() start()}, {@link com.trolltech.qt.core.QTimeLine#updateInterval() updateInterval()}, {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() }, and {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() }. <br></DD></DT>
*/

    public final void resume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resume(nativeId());
    }
    native void __qt_resume(long __this__nativeId);

/**
This property holds the current time of the time line.  When QTimeLine is in Running state, this value is updated continuously as a function of the duration and direction of the timeline. Otherwise, it is value that was current when {@link com.trolltech.qt.core.QTimeLine#stop() stop()} was called last, or the value set by {@link com.trolltech.qt.core.QTimeLine#setCurrentTime(int) setCurrentTime()}. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentTime")
    public final void setCurrentTime(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentTime_int(nativeId(), msec);
    }
    native void __qt_setCurrentTime_int(long __this__nativeId, int msec);

/**
This property holds the shape of the timeline curve.  The curve shape describes the relation between the time and value for the base implementation of {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <p>If you have reimplemented {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}, this value is ignored. <p>By default, this property is set to {@link com.trolltech.qt.core.QTimeLine.CurveShape EaseInOutCurve }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="curveShape")
    @QtBlockedSlot
    public final void setCurveShape(com.trolltech.qt.core.QTimeLine.CurveShape shape)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurveShape_CurveShape(nativeId(), shape.value());
    }
    @QtBlockedSlot
    native void __qt_setCurveShape_CurveShape(long __this__nativeId, int shape);

/**
This property holds the direction of the timeline when QTimeLine is in {@link com.trolltech.qt.core.QTimeLine.State Running } state.. This direction indicates whether the time moves from 0 towards the timeline duration, or from the value of the duration and towards 0 after {@link com.trolltech.qt.core.QTimeLine#start() start()} has been called. <p>By default, this property is set to {@link com.trolltech.qt.core.QTimeLine.Direction Forward }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="direction")
    @QtBlockedSlot
    public final void setDirection(com.trolltech.qt.core.QTimeLine.Direction direction)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirection_Direction(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setDirection_Direction(long __this__nativeId, int direction);

/**
This property holds the total duration of the timeline in milliseconds.  By default, this value is 1000 (i.e., 1 second), but you can change this by either passing a duration to QTimeLine's constructor, or by calling {@link com.trolltech.qt.core.QTimeLine#setDuration(int) setDuration()}. The duration must be larger than 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="duration")
    @QtBlockedSlot
    public final void setDuration(int duration)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDuration_int(nativeId(), duration);
    }
    @QtBlockedSlot
    native void __qt_setDuration_int(long __this__nativeId, int duration);

/**
Sets the end frame, which is the frame corresponding to the end of the timeline (i. ., the frame for which the current value is 1), to <tt>frame</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#endFrame() endFrame()}, {@link com.trolltech.qt.core.QTimeLine#startFrame() startFrame()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEndFrame(int frame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEndFrame_int(nativeId(), frame);
    }
    @QtBlockedSlot
    native void __qt_setEndFrame_int(long __this__nativeId, int frame);

/**
Sets the timeline's frame counter to start at <tt>startFrame</tt>, and end and <tt>endFrame</tt>. For each time value, QTimeLine will find the corresponding frame when you call {@link com.trolltech.qt.core.QTimeLine#currentFrame() currentFrame()} or {@link com.trolltech.qt.core.QTimeLine#frameForTime(int) frameForTime()} by interpolating, using the return value of {@link com.trolltech.qt.core.QTimeLine#valueForTime(int) valueForTime()}. <p>When in Running state, QTimeLine also emits the {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } signal when the frame changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#startFrame() startFrame()}, {@link com.trolltech.qt.core.QTimeLine#endFrame() endFrame()}, {@link com.trolltech.qt.core.QTimeLine#start() start()}, and {@link com.trolltech.qt.core.QTimeLine#currentFrame() currentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFrameRange(int startFrame, int endFrame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameRange_int_int(nativeId(), startFrame, endFrame);
    }
    @QtBlockedSlot
    native void __qt_setFrameRange_int_int(long __this__nativeId, int startFrame, int endFrame);

/**
This property holds the number of times the timeline should loop before it's finished.  A loop count of of 0 means that the timeline will loop forever. <p>By default, this property contains a value of 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="loopCount")
    @QtBlockedSlot
    public final void setLoopCount(int count)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLoopCount_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_setLoopCount_int(long __this__nativeId, int count);

/**
If <tt>paused</tt> is true, the timeline is paused, causing QTimeLine to enter Paused state. No updates will be signaled until either {@link com.trolltech.qt.core.QTimeLine#start() start()} or setPaused(false) is called. If <tt>paused</tt> is false, the timeline is resumed and continues where it left. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#state() state()}, and {@link com.trolltech.qt.core.QTimeLine#start() start()}. <br></DD></DT>
*/

    public final void setPaused(boolean paused)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaused_boolean(nativeId(), paused);
    }
    native void __qt_setPaused_boolean(long __this__nativeId, boolean paused);

/**
Sets the start frame, which is the frame corresponding to the start of the timeline (i. ., the frame for which the current value is 0), to <tt>frame</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#startFrame() startFrame()}, {@link com.trolltech.qt.core.QTimeLine#endFrame() endFrame()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStartFrame(int frame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStartFrame_int(nativeId(), frame);
    }
    @QtBlockedSlot
    native void __qt_setStartFrame_int(long __this__nativeId, int frame);

/**
This property holds the time in milliseconds between each time QTimeLine updates its current time.  When updating the current time, QTimeLine will emit {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() } if the current value changed, and {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } if the frame changed. <p>By default, the interval is 40 ms, which corresponds to a rate of 25 updates per second.
*/

    @com.trolltech.qt.QtPropertyWriter(name="updateInterval")
    @QtBlockedSlot
    public final void setUpdateInterval(int interval)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUpdateInterval_int(nativeId(), interval);
    }
    @QtBlockedSlot
    native void __qt_setUpdateInterval_int(long __this__nativeId, int interval);

/**
Starts the timeline. QTimeLine will enter Running state, and once it enters the event loop, it will update its current time, frame and value at regular intervals. The default interval is 40 ms (i.e., 25 times per second). You can change the update interval by calling {@link com.trolltech.qt.core.QTimeLine#setUpdateInterval(int) setUpdateInterval()}. <p>If you want to resume a stopped timeline without restarting, you can call {@link com.trolltech.qt.core.QTimeLine#resume() resume()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#resume() resume()}, {@link com.trolltech.qt.core.QTimeLine#updateInterval() updateInterval()}, {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() }, and {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() }. <br></DD></DT>
*/

    public final void start()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start(nativeId());
    }
    native void __qt_start(long __this__nativeId);

/**
Returns the start frame, which is the frame corresponding to the start of the timeline (i. ., the frame for which the current value is 0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#setStartFrame(int) setStartFrame()}, and {@link com.trolltech.qt.core.QTimeLine#setFrameRange(int, int) setFrameRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int startFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startFrame(nativeId());
    }
    @QtBlockedSlot
    native int __qt_startFrame(long __this__nativeId);

/**
Returns the state of the timeline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#start() start()}, {@link com.trolltech.qt.core.QTimeLine#setPaused(boolean) setPaused()}, and {@link com.trolltech.qt.core.QTimeLine#stop() stop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTimeLine.State state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTimeLine.State.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
Stops the timeline, causing QTimeLine to enter {@link com.trolltech.qt.core.QTimeLine.State NotRunning } state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#start() start()}. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Toggles the direction of the timeline. If the direction was Forward, it becomes Backward, and vice verca. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine#setDirection(com.trolltech.qt.core.QTimeLine.Direction) setDirection()}. <br></DD></DT>
*/

    public final void toggleDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggleDirection(nativeId());
    }
    native void __qt_toggleDirection(long __this__nativeId);

/**
This property holds the time in milliseconds between each time QTimeLine updates its current time.  When updating the current time, QTimeLine will emit {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() } if the current value changed, and {@link com.trolltech.qt.core.QTimeLine#frameChanged frameChanged() } if the frame changed. <p>By default, the interval is 40 ms, which corresponds to a rate of 25 updates per second.
*/

    @com.trolltech.qt.QtPropertyReader(name="updateInterval")
    @QtBlockedSlot
    public final int updateInterval()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_updateInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_updateInterval(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long event);

/**
Returns the timeline value for the time <tt>msec</tt>. The returned value, which varies depending on the curve shape, is always between 0 and 1. If <tt>msec</tt> is 0, the default implementation always returns 0. <p>Reimplement this function to provide a custom curve shape for your timeline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine.CurveShape CurveShape }, and {@link com.trolltech.qt.core.QTimeLine#frameForTime(int) frameForTime()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double valueForTime(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueForTime_int(nativeId(), msec);
    }
    @QtBlockedSlot
    native double __qt_valueForTime_int(long __this__nativeId, int msec);

/**
@exclude
*/

    public static native QTimeLine fromNativePointer(QNativePointer nativePointer);

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

    protected QTimeLine(QPrivateConstructor p) { super(p); } 
}
