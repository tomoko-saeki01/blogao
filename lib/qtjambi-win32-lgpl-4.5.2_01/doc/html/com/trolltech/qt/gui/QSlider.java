package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSlider widget provides a vertical or horizontal slider. The slider is the classic widget for controlling a bounded value. It lets the user move a slider handle along a horizontal or vertical groove and translates the handle's position into an integer value within the legal range. <p>QSlider has very few of its own functions; most of the functionality is in {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}. The most useful functions are setValue() to set the slider directly to some value; {@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()} to simulate the effects of clicking (useful for shortcut keys); setSingleStep(), setPageStep() to set the steps; and setMinimum() and setMaximum() to define the range of the scroll bar. <p>QSlider provides methods for controlling tickmarks. You can use {@link com.trolltech.qt.gui.QSlider#setTickPosition(com.trolltech.qt.gui.QSlider.TickPosition) setTickPosition()} to indicate where you want the tickmarks to be, {@link com.trolltech.qt.gui.QSlider#setTickInterval(int) setTickInterval()} to indicate how many of them you want. the currently set tick position and interval can be queried using the {@link com.trolltech.qt.gui.QSlider#tickPosition() tickPosition()} and {@link com.trolltech.qt.gui.QSlider#tickInterval() tickInterval()} functions, respectively. <p>QSlider inherits a comprehensive set of signals: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Signal</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() }</td><td> Emitted when the slider's value has changed. The tracking() determines whether this signal is emitted during user interaction.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() }</td><td> Emitted when the user starts to drag the slider.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() }</td><td> Emitted when the user drags the slider.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() }</td><td> Emitted when the user releases the slider.</td></tr></table> QSlider only provides integer ranges. Note that although QSlider handles very large numbers, it becomes difficult for users to use a slider accurately for very large ranges. <p>A slider accepts focus on Tab and provides both a mouse wheel and a keyboard interface. The keyboard interface is the following: <ul><li> Left/Right move a horizontal slider by one single step.</li><li> Up/Down move a vertical slider by one single step.</li><li> PageUp moves up one page.</li><li> PageDown moves down one page.</li><li> Home moves to the start (mininum).</li><li> End moves to the end (maximum).</li></ul> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-slider.png"></center><br></td><td> A slider shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windows-slider.png"></center><br></td><td> A slider shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-slider.png"></center><br></td><td> A slider shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollBar QScrollBar}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QDial QDial}, {@link <a href="../guibooks.html">GUI Design Handbook: Slider</a>}, and {@link <a href="../qtjambi-sliders.html">Sliders Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSlider extends com.trolltech.qt.gui.QAbstractSlider
{
/**
This enum specifies where the tick marks are to be drawn relative to the slider's groove and the handle the user moves.
*/

    public enum TickPosition implements com.trolltech.qt.QtEnumerator {
/**
 Do not draw any tick marks.
*/

        NoTicks(0),
/**
 Draw tick marks above the (horizontal) slider
*/

        TicksAbove(1),
/**
 Draw tick marks below the (horizontal) slider
*/

        TicksBelow(2),
/**
 Draw tick marks on both sides of the groove.
*/

        TicksBothSides(3);

        TickPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSlider$TickPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static TickPosition resolve(int value) {
            return (TickPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoTicks;
            case 1: return TicksAbove;
            case 2: return TicksBelow;
            case 3: return TicksBothSides;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a vertical slider with the given <tt>parent</tt>.
*/

    public QSlider() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a vertical slider with the given <tt>parent</tt>.
*/

    public QSlider(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSlider_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSlider_QWidget(long parent);


/**
Constructs a slider with the given <tt>parent</tt>. The <tt>orientation</tt> parameter determines whether the slider is horizontal or vertical; the valid values are {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }.
*/

    public QSlider(com.trolltech.qt.core.Qt.Orientation orientation) {
        this(orientation, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a slider with the given <tt>parent</tt>. The <tt>orientation</tt> parameter determines whether the slider is horizontal or vertical; the valid values are {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }.
*/

    public QSlider(com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSlider_Orientation_QWidget(orientation.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSlider_Orientation_QWidget(int orientation, long parent);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This property holds the interval between tickmarks. This is a value interval, not a pixel interval. If it is 0, the slider will choose between lineStep() and pageStep(). <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QSlider#tickPosition() tickPosition}, lineStep(), and pageStep(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tickInterval")
    @QtBlockedSlot
    public final void setTickInterval(int ti)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTickInterval_int(nativeId(), ti);
    }
    @QtBlockedSlot
    native void __qt_setTickInterval_int(long __this__nativeId, int ti);

/**
This property holds the tickmark position for this slider. The valid values are described by the {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::TickPosition } enum. <p>The default value is {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::NoTicks }. <p><DT><b>See also:</b><br><DD>{@link QSlider#tickInterval() tickInterval}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tickPosition")
    @QtBlockedSlot
    public final void setTickPosition(com.trolltech.qt.gui.QSlider.TickPosition position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTickPosition_TickPosition(nativeId(), position.value());
    }
    @QtBlockedSlot
    native void __qt_setTickPosition_TickPosition(long __this__nativeId, int position);

/**
This property holds the interval between tickmarks. This is a value interval, not a pixel interval. If it is 0, the slider will choose between lineStep() and pageStep(). <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QSlider#tickPosition() tickPosition}, lineStep(), and pageStep(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tickInterval")
    @QtBlockedSlot
    public final int tickInterval()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tickInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tickInterval(long __this__nativeId);

/**
This property holds the tickmark position for this slider. The valid values are described by the {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::TickPosition } enum. <p>The default value is {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::NoTicks }. <p><DT><b>See also:</b><br><DD>{@link QSlider#tickInterval() tickInterval}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tickPosition")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSlider.TickPosition tickPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSlider.TickPosition.resolve(__qt_tickPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tickPosition(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QSlider fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSlider(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QSlider. This
method is useful for subclasses when they need a QStyleOptionSlider,
but don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionSlider option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
