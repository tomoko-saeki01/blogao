package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QProgressBar widget provides a horizontal or vertical progress bar. A progress bar is used to give the user an indication of the progress of an operation and to reassure them that the application is still running. <p>The progress bar uses the concept of steps. You set it up by specifying the minimum and maximum possible step values, and it will display the percentage of steps that have been completed when you later give it the current step value. The percentage is calculated by dividing the progress ({@link com.trolltech.qt.gui.QProgressBar#value() value()} - {@link com.trolltech.qt.gui.QProgressBar#minimum() minimum()}) divided by {@link com.trolltech.qt.gui.QProgressBar#maximum() maximum()} - {@link com.trolltech.qt.gui.QProgressBar#minimum() minimum()}. <p>You can specify the minimum and maximum number of steps with {@link com.trolltech.qt.gui.QProgressBar#setMinimum(int) setMinimum()} and setMaximum. The current number of steps is set with {@link com.trolltech.qt.gui.QProgressBar#setValue(int) setValue()}. The progress bar can be rewound to the beginning with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}. <p>If minimum and maximum both are set to 0, the bar shows a busy indicator instead of a percentage of steps. This is useful, for example, when using {@link com.trolltech.qt.network.QFtp QFtp} or {@link com.trolltech.qt.network.QHttp QHttp} to download items when they are unable to determine the size of the item being downloaded. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-progressbar.png"></center><br></td><td> A progress bar shown in the Macintosh widget style.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windowsxp-progressbar.png"></center><br></td><td> A progress bar shown in the Windows XP widget style.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-progressbar.png"></center><br></td><td> A progress bar shown in the Plastique widget style.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine QTimeLine}, {@link com.trolltech.qt.gui.QProgressDialog QProgressDialog}, and {@link <a href="../guibooks.html">GUI Design Handbook: Progress Indicator</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QProgressBar extends com.trolltech.qt.gui.QWidget
{
/**
Specifies the reading direction of the {@link QProgressBar#text() text} for vertical progress bars. Note that whether or not the text is drawn is dependent on the style. Currently CDE, CleanLooks, Motif, and Plastique draw the text. Mac, Windows and WindowsXP style do not. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#textDirection() textDirection}. <br></DD></DT>
*/

    public enum Direction implements com.trolltech.qt.QtEnumerator {
/**
 The text is rotated 90 degrees clockwise.
*/

        TopToBottom(0),
/**
 The text is rotated 90 degrees counter-clockwise.
*/

        BottomToTop(1);

        Direction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QProgressBar$Direction constant with the specified <tt>int</tt>.</brief>
*/

        public static Direction resolve(int value) {
            return (Direction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TopToBottom;
            case 1: return BottomToTop;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: value)&gt;:<p> This signal is emitted when the value shown in the progress bar changes. <tt>value</tt> is the new value shown by the progress bar.
*/

    public final Signal1<java.lang.Integer> valueChanged = new Signal1<java.lang.Integer>();

    private final void valueChanged(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_int(nativeId(), value);
    }
    native void __qt_valueChanged_int(long __this__nativeId, int value);


/**
Constructs a progress bar with the given <tt>parent</tt>. <p>By default, the minimum step value is set to 0, and the maximum to 100. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressBar#setRange(int, int) setRange()}. <br></DD></DT>
*/

    public QProgressBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a progress bar with the given <tt>parent</tt>. <p>By default, the minimum step value is set to 0, and the maximum to 100. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressBar#setRange(int, int) setRange()}. <br></DD></DT>
*/

    public QProgressBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QProgressBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QProgressBar_QWidget(long parent);

/**
This property holds the alignment of the progress bar.
*/

    @com.trolltech.qt.QtPropertyReader(name="alignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
This property holds the string used to generate the current text. %p - is replaced by the percentage completed. %v - is replaced by the current value. %m - is replaced by the total number of steps. <p>The default value is "%p%". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressBar#text() text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="format")
    @QtBlockedSlot
    public final java.lang.String format()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_format(long __this__nativeId);

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
This property holds whether or not a progress bar shows its progress inverted. If this property is false, the progress bar grows in the other direction (e.g. from right to left). By default, the progress bar is not inverted. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() orientation}, and {@link QWidget#layoutDirection() layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="invertedAppearance")
    @QtBlockedSlot
    public final boolean invertedAppearance()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invertedAppearance(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_invertedAppearance(long __this__nativeId);

/**
This property holds whether the current completed percentage should be displayed. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#textDirection() textDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textVisible")
    @QtBlockedSlot
    public final boolean isTextVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTextVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTextVisible(long __this__nativeId);

/**
This property holds the progress bar's maximum value. When setting this property, the {@link QProgressBar#minimum() minimum} is adjusted if necessary to ensure that the range remains valid. If the current value falls outside the new range, the progress bar is reset with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="maximum")
    @QtBlockedSlot
    public final int maximum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximum(long __this__nativeId);

/**
This property holds the progress bar's minimum value. When setting this property, the {@link QProgressBar#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. If the current value falls outside the new range, the progress bar is reset with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="minimum")
    @QtBlockedSlot
    public final int minimum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimum(long __this__nativeId);

/**
This property holds the orientation of the progress bar. The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } (the default) or {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#invertedAppearance() invertedAppearance}, and {@link QProgressBar#textDirection() textDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Reset the progress bar. The progress bar "rewinds" and shows no progress.
*/

    public final void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    native void __qt_reset(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This property holds the alignment of the progress bar.
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);

/**
This property holds the string used to generate the current text. %p - is replaced by the percentage completed. %v - is replaced by the current value. %m - is replaced by the total number of steps. <p>The default value is "%p%". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressBar#text() text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="format")
    @QtBlockedSlot
    public final void setFormat(java.lang.String format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_String(nativeId(), format);
    }
    @QtBlockedSlot
    native void __qt_setFormat_String(long __this__nativeId, java.lang.String format);

/**
This property holds whether or not a progress bar shows its progress inverted. If this property is false, the progress bar grows in the other direction (e.g. from right to left). By default, the progress bar is not inverted. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() orientation}, and {@link QWidget#layoutDirection() layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="invertedAppearance")
    @QtBlockedSlot
    public final void setInvertedAppearance(boolean invert)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInvertedAppearance_boolean(nativeId(), invert);
    }
    @QtBlockedSlot
    native void __qt_setInvertedAppearance_boolean(long __this__nativeId, boolean invert);

/**
This property holds the progress bar's maximum value. When setting this property, the {@link QProgressBar#minimum() minimum} is adjusted if necessary to ensure that the range remains valid. If the current value falls outside the new range, the progress bar is reset with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximum")
    public final void setMaximum(int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), maximum);
    }
    native void __qt_setMaximum_int(long __this__nativeId, int maximum);

/**
This property holds the progress bar's minimum value. When setting this property, the {@link QProgressBar#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. If the current value falls outside the new range, the progress bar is reset with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimum")
    public final void setMinimum(int minimum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), minimum);
    }
    native void __qt_setMinimum_int(long __this__nativeId, int minimum);

/**
This property holds the orientation of the progress bar. The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } (the default) or {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#invertedAppearance() invertedAppearance}, and {@link QProgressBar#textDirection() textDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), arg__1.value());
    }
    native void __qt_setOrientation_Orientation(long __this__nativeId, int arg__1);

/**
Sets the progress bar's minimum and maximum values to <tt>minimum</tt> and <tt>maximum</tt> respectively. <p>If <tt>maximum</tt> is smaller than <tt>minimum</tt>, <tt>minimum</tt> becomes the only legal value. <p>If the current value falls outside the new range, the progress bar is reset with {@link com.trolltech.qt.gui.QProgressBar#reset() reset()}. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#minimum() minimum}, and {@link QProgressBar#maximum() maximum}. <br></DD></DT>
*/

    public final void setRange(int minimum, int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_int_int(nativeId(), minimum, maximum);
    }
    native void __qt_setRange_int_int(long __this__nativeId, int minimum, int maximum);

/**
This property holds the reading direction of the {@link QProgressBar#text() text} for vertical progress bars. This property has no impact on horizontal progress bars. By default, the reading direction is {@link com.trolltech.qt.gui.QProgressBar.Direction QProgressBar::TopToBottom }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() orientation}, and {@link QProgressBar#isTextVisible() textVisible}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textDirection")
    @QtBlockedSlot
    public final void setTextDirection(com.trolltech.qt.gui.QProgressBar.Direction textDirection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextDirection_Direction(nativeId(), textDirection.value());
    }
    @QtBlockedSlot
    native void __qt_setTextDirection_Direction(long __this__nativeId, int textDirection);

/**
This property holds whether the current completed percentage should be displayed. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#textDirection() textDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textVisible")
    @QtBlockedSlot
    public final void setTextVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setTextVisible_boolean(long __this__nativeId, boolean visible);

/**
This property holds the progress bar's current value. Attempting to change the current value to one outside the minimum-maximum range has no effect on the current value.
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void setValue(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_int(nativeId(), value);
    }
    native void __qt_setValue_int(long __this__nativeId, int value);

/**
This property holds the reading direction of the {@link QProgressBar#text() text} for vertical progress bars. This property has no impact on horizontal progress bars. By default, the reading direction is {@link com.trolltech.qt.gui.QProgressBar.Direction QProgressBar::TopToBottom }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() orientation}, and {@link QProgressBar#isTextVisible() textVisible}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textDirection")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QProgressBar.Direction textDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QProgressBar.Direction.resolve(__qt_textDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textDirection(long __this__nativeId);

/**
This property holds the progress bar's current value. Attempting to change the current value to one outside the minimum-maximum range has no effect on the current value.
*/

    @com.trolltech.qt.QtPropertyReader(name="value")
    @QtBlockedSlot
    public final int value()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native int __qt_value(long __this__nativeId);

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
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

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
This property holds the descriptive text shown with the progress bar. The text returned is the same as the text displayed in the center (or in some styles, to the left) of the progress bar. <p>The progress shown in the text may be smaller than the minimum value, indicating that the progress bar is in the "reset" state before any progress is set. <p>In the default implementation, the text either contains a percentage value that indicates the progress so far, or it is blank because the progress bar is in the reset state.
*/

    @com.trolltech.qt.QtPropertyReader(name="text")
    @QtBlockedSlot
    public java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
@exclude
*/

    public static native QProgressBar fromNativePointer(QNativePointer nativePointer);

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

    protected QProgressBar(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QProgressBar. This method
is useful for subclasses when they need a QStyleOptionProgressBar or
QStyleOptionProgressBarV2, but don't want to fill in all the information
themselves. This function will check the version of the
QStyleOptionProgressBar and fill in the additional values for a
QStyleOptionProgressBarV2.
*/

    protected final void initStyleOption(QStyleOptionProgressBar option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
