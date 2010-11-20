package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDial class provides a rounded range control (like a speedometer or potentiometer). QDial is used when the user needs to control a value within a program-definable range, and the range either wraps around (for example, with angles measured from 0 to 359 degrees) or the dialog layout needs a square widget. <p>Since QDial inherits from {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}, the dial behaves in a similar way to a {@link com.trolltech.qt.gui.QSlider slider}. When {@link com.trolltech.qt.gui.QDial#wrapping() wrapping()} is false (the default setting) there is no real difference between a slider and a dial. They both share the same signals, slots and member functions. Which one you use depends on the expectations of your users and on the type of application. <p>The dial initially emits {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signals continuously while the slider is being moved; you can make it emit the signal less often by disabling the {@link QAbstractSlider#hasTracking() tracking} property. The {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() } signal is emitted continuously even when tracking is disabled. <p>The dial also emits {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() } and {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() } signals when the mouse button is pressed and released. Note that the dial's value can change without these signals being emitted since the keyboard and wheel can also be used to change the value. <p>Unlike the slider, QDial attempts to draw a "nice" number of notches rather than one per line step. If possible, the number of notches drawn is one per line step, but if there aren't enough pixels to draw every one, QDial will skip notches to try and draw a uniform set (e.g. by drawing every second or third notch). <p>Like the slider, the dial makes the {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider} functions setValue(), addLine(), subtractLine(), addPage() and subtractPage() available as slots. <p>The dial's keyboard interface is fairly simple: The <b>left</b>/<b>up</b> and <b>right</b>/<b>down</b> arrow keys adjust the dial's {@link QAbstractSlider#value() value} by the defined {@link QAbstractSlider#singleStep() singleStep}, <b>Page Up</b> and <b>Page Down</b> by the defined {@link QAbstractSlider#pageStep() pageStep}, and the <b>Home</b> and <b>End</b> keys set the value to the defined {@link QAbstractSlider#minimum() minimum} and {@link QAbstractSlider#maximum() maximum} values. <p>If you are using the mouse wheel to adjust the dial, the increment value is determined by the lesser value of {@link QApplication#wheelScrollLines() wheelScrollLines} multipled by {@link QAbstractSlider#singleStep() singleStep}, and {@link QAbstractSlider#pageStep() pageStep}. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-dial.png"></center><br></td><td>  <br><center><img src="../images/windowsxp-dial.png"></center><br></td><td>  <br><center><img src="../images/macintosh-dial.png"></center><br></td></tr><tr valign="top" class="odd"><td colspan=3> Dials shown in various widget styles (from left to right): {@link <a href="../gallery-plastique.html">Plastique</a>}, {@link <a href="../gallery-windowsxp.html">Windows XP</a>}, {@link <a href="../gallery-macintosh.html">Macintosh</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollBar QScrollBar}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QSlider QSlider}, {@link <a href="../guibooks.html">GUI Design Handbook: Slider</a>}, and {@link <a href="../qtjambi-sliders.html">Sliders Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDial extends com.trolltech.qt.gui.QAbstractSlider
{


/**
Constructs a dial. <p>The <tt>parent</tt> argument is sent to the {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider} constructor.
*/

    public QDial() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a dial. <p>The <tt>parent</tt> argument is sent to the {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider} constructor.
*/

    public QDial(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDial_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDial_QWidget(long parent);

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
This property holds the current notch size. The notch size is in range control units, not pixels, and if possible it is a multiple of singleStep() that results in an on-screen notch size near {@link com.trolltech.qt.gui.QDial#notchTarget() notchTarget()}. <p>By default, this property has a value of 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDial#notchTarget() notchTarget()}, and singleStep(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="notchSize")
    @QtBlockedSlot
    public final int notchSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notchSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_notchSize(long __this__nativeId);

/**
This property holds the target number of pixels between notches. The notch target is the number of pixels QDial attempts to put between each notch. <p>The actual size may differ from the target size. <p>The default notch target is 3.7 pixels.
*/

    @com.trolltech.qt.QtPropertyReader(name="notchTarget")
    @QtBlockedSlot
    public final double notchTarget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notchTarget(nativeId());
    }
    @QtBlockedSlot
    native double __qt_notchTarget(long __this__nativeId);

/**
This property holds whether the notches are shown. If the property is true, a series of notches are drawn around the dial to indicate the range of values available; otherwise no notches are shown. <p>By default, this property is disabled.
*/

    @com.trolltech.qt.QtPropertyReader(name="notchesVisible")
    @QtBlockedSlot
    public final boolean notchesVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notchesVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_notchesVisible(long __this__nativeId);

/**
This property holds the target number of pixels between notches. The notch target is the number of pixels QDial attempts to put between each notch. <p>The actual size may differ from the target size. <p>The default notch target is 3.7 pixels.
*/

    @com.trolltech.qt.QtPropertyWriter(name="notchTarget")
    @QtBlockedSlot
    public final void setNotchTarget(double target)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNotchTarget_double(nativeId(), target);
    }
    @QtBlockedSlot
    native void __qt_setNotchTarget_double(long __this__nativeId, double target);

/**
This property holds whether the notches are shown. If the property is true, a series of notches are drawn around the dial to indicate the range of values available; otherwise no notches are shown. <p>By default, this property is disabled.
*/

    @com.trolltech.qt.QtPropertyWriter(name="notchesVisible")
    public final void setNotchesVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNotchesVisible_boolean(nativeId(), visible);
    }
    native void __qt_setNotchesVisible_boolean(long __this__nativeId, boolean visible);

/**
This property holds whether wrapping is enabled. If true, wrapping is enabled; otherwise some space is inserted at the bottom of the dial to separate the ends of the range of valid values. <p>If enabled, the arrow can be oriented at any angle on the dial. If disabled, the arrow will be restricted to the upper part of the dial; if it is rotated into the space at the bottom of the dial, it will be clamped to the closest end of the valid range of values. <p>By default this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="wrapping")
    public final void setWrapping(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWrapping_boolean(nativeId(), on);
    }
    native void __qt_setWrapping_boolean(long __this__nativeId, boolean on);

/**
This property holds whether wrapping is enabled. If true, wrapping is enabled; otherwise some space is inserted at the bottom of the dial to separate the ends of the range of valid values. <p>If enabled, the arrow can be oriented at any angle on the dial. If disabled, the arrow will be restricted to the upper part of the dial; if it is rotated into the space at the bottom of the dial, it will be clamped to the closest end of the valid range of values. <p>By default this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="wrapping")
    @QtBlockedSlot
    public final boolean wrapping()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wrapping(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wrapping(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent me)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), me == null ? 0 : me.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long me);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent me)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), me == null ? 0 : me.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long me);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent me)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), me == null ? 0 : me.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long me);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent pe)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), pe == null ? 0 : pe.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long pe);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent re)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), re == null ? 0 : re.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long re);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void sliderChange(com.trolltech.qt.gui.QAbstractSlider.SliderChange change)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sliderChange_SliderChange(nativeId(), change.value());
    }
    @QtBlockedSlot
    native void __qt_sliderChange_SliderChange(long __this__nativeId, int change);

/**
@exclude
*/

    public static native QDial fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDial(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QDial. This method
is useful for subclasses when they need a QStyleOptionSlider, but don't want
to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionSlider option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
