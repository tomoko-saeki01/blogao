package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractSlider class provides an integer value within a range. The class is designed as a common super class for widgets like {@link com.trolltech.qt.gui.QScrollBar QScrollBar}, {@link com.trolltech.qt.gui.QSlider QSlider} and {@link com.trolltech.qt.gui.QDial QDial}. <p>Here are the main properties of the class: <ol><li> {@link QAbstractSlider#value() value}: The bounded integer that QAbstractSlider maintains.</li><li> {@link QAbstractSlider#minimum() minimum}: The lowest possible value.</li><li> {@link QAbstractSlider#maximum() maximum}: The highest possible value.</li><li> {@link QAbstractSlider#singleStep() singleStep}: The smaller of two natural steps that an abstract sliders provides and typically corresponds to the user pressing an arrow key.</li><li> {@link QAbstractSlider#pageStep() pageStep}: The larger of two natural steps that an abstract slider provides and typically corresponds to the user pressing PageUp or PageDown.</li><li> {@link QAbstractSlider#hasTracking() tracking}: Whether slider tracking is enabled.</li><li> {@link QAbstractSlider#sliderPosition() sliderPosition}: The current position of the slider. If {@link QAbstractSlider#hasTracking() tracking} is enabled (the default), this is identical to {@link QAbstractSlider#value() value}.</li></ol> Unity (1) may be viewed as a third step size. {@link com.trolltech.qt.gui.QAbstractSlider#setValue(int) setValue()} lets you set the current value to any integer in the allowed range, not just {@link com.trolltech.qt.gui.QAbstractSlider#minimum() minimum()} + n * {@link com.trolltech.qt.gui.QAbstractSlider#singleStep() singleStep()} for integer values of n. Some widgets may allow the user to set any value at all; others may just provide multiples of {@link com.trolltech.qt.gui.QAbstractSlider#singleStep() singleStep()} or {@link com.trolltech.qt.gui.QAbstractSlider#pageStep() pageStep()}. <p>QAbstractSlider emits a comprehensive set of signals: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Signal</center></th><th><center> Emitted when</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() }</td><td> the value has changed. The {@link QAbstractSlider#hasTracking() tracking} determines whether this signal is emitted during user interaction.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() }</td><td> the user starts to drag the slider.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() }</td><td> the user drags the slider.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() }</td><td> the user releases the slider.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractSlider#actionTriggered actionTriggered() }</td><td> a slider action was triggerd.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider#rangeChanged rangeChanged() }</td><td> a the range has changed.</td></tr></table> QAbstractSlider provides a virtual {@link com.trolltech.qt.gui.QAbstractSlider#sliderChange(com.trolltech.qt.gui.QAbstractSlider.SliderChange) sliderChange()} function that is well suited for updating the on-screen representation of sliders. By calling {@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()}, subclasses trigger slider actions. Two helper functions {@link com.trolltech.qt.gui.QStyle#sliderPositionFromValue(int, int, int, int) QStyle::sliderPositionFromValue()} and {@link com.trolltech.qt.gui.QStyle#sliderValueFromPosition(int, int, int, int) QStyle::sliderValueFromPosition()} help subclasses and styles to map screen coordinates to logical range values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox QAbstractSpinBox}, {@link com.trolltech.qt.gui.QSlider QSlider}, {@link com.trolltech.qt.gui.QDial QDial}, {@link com.trolltech.qt.gui.QScrollBar QScrollBar}, and {@link <a href="../qtjambi-sliders.html">Sliders Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAbstractSlider extends com.trolltech.qt.gui.QWidget
{
    @QtBlockedEnum
    public enum SliderAction implements com.trolltech.qt.QtEnumerator {
/**

*/

        SliderNoAction(0),
/**

*/

        SliderSingleStepAdd(1),
/**

*/

        SliderSingleStepSub(2),
/**

*/

        SliderPageStepAdd(3),
/**

*/

        SliderPageStepSub(4),
/**

*/

        SliderToMinimum(5),
/**

*/

        SliderToMaximum(6),
/**

*/

        SliderMove(7);

        SliderAction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSlider$SliderAction constant with the specified <tt>int</tt>.</brief>
*/

        public static SliderAction resolve(int value) {
            return (SliderAction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SliderNoAction;
            case 1: return SliderSingleStepAdd;
            case 2: return SliderSingleStepSub;
            case 3: return SliderPageStepAdd;
            case 4: return SliderPageStepSub;
            case 5: return SliderToMinimum;
            case 6: return SliderToMaximum;
            case 7: return SliderMove;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum SliderChange implements com.trolltech.qt.QtEnumerator {
/**

*/

        SliderRangeChange(0),
/**

*/

        SliderOrientationChange(1),
/**

*/

        SliderStepsChange(2),
/**

*/

        SliderValueChange(3);

        SliderChange(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSlider$SliderChange constant with the specified <tt>int</tt>.</brief>
*/

        public static SliderChange resolve(int value) {
            return (SliderChange) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SliderRangeChange;
            case 1: return SliderOrientationChange;
            case 2: return SliderStepsChange;
            case 3: return SliderValueChange;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: action)&gt;:<p> This signal is emitted when the slider action <tt>action</tt> is triggered. Actions are {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderSingleStepAdd }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderSingleStepSub }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderPageStepAdd }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderPageStepSub }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderToMinimum }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderToMaximum }, and {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderMove }. <p>When the signal is emitted, the {@link QAbstractSlider#sliderPosition() sliderPosition} has been adjusted according to the action, but the {@link QAbstractSlider#value() value} has not yet been propagated (meaning the {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signal was not yet emitted), and the visual display has not been updated. In slots connected to this signal you can thus safely adjust any action by calling {@link com.trolltech.qt.gui.QAbstractSlider#setSliderPosition(int) setSliderPosition()} yourself, based on both the action and the slider's value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> actionTriggered = new Signal1<java.lang.Integer>();

    private final void actionTriggered(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionTriggered_int(nativeId(), action);
    }
    native void __qt_actionTriggered_int(long __this__nativeId, int action);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: min), java.lang.Integer(named: max)&gt;:<p> This signal is emitted when the slider range has changed, with <tt>min</tt> being the new minimum, and <tt>max</tt> being the new maximum. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#minimum() minimum}, and {@link QAbstractSlider#maximum() maximum}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> rangeChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void rangeChanged(int min, int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rangeChanged_int_int(nativeId(), min, max);
    }
    native void __qt_rangeChanged_int_int(long __this__nativeId, int min, int max);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: value)&gt;:<p> This signal is emitted when {@link QAbstractSlider#isSliderDown() sliderDown} is true and the slider moves. This usually happens when the user is dragging the slider. The <tt>value</tt> is the new slider position. <p>This signal is emitted even when tracking is turned off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#setTracking(boolean) setTracking()}, {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() }, {@link com.trolltech.qt.gui.QAbstractSlider#isSliderDown() isSliderDown()}, {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() }, and {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sliderMoved = new Signal1<java.lang.Integer>();

    private final void sliderMoved(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sliderMoved_int(nativeId(), position);
    }
    native void __qt_sliderMoved_int(long __this__nativeId, int position);
/**
 This signal is emitted when the user presses the slider with the mouse, or programmatically when setSliderDown(true) is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() }, {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() }, and {@link com.trolltech.qt.gui.QAbstractSlider#isSliderDown() isSliderDown()}. <br></DD></DT>
*/

    public final Signal0 sliderPressed = new Signal0();

    private final void sliderPressed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sliderPressed(nativeId());
    }
    native void __qt_sliderPressed(long __this__nativeId);
/**
 This signal is emitted when the user releases the slider with the mouse, or programmatically when setSliderDown(false) is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() }, {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() }, and {@link QAbstractSlider#isSliderDown() sliderDown}. <br></DD></DT>
*/

    public final Signal0 sliderReleased = new Signal0();

    private final void sliderReleased()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sliderReleased(nativeId());
    }
    native void __qt_sliderReleased(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: value)&gt;:<p> This signal is emitted when the slider value has changed, with the new slider <tt>value</tt> as argument.
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
Constructs an abstract slider. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QAbstractSlider() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an abstract slider. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QAbstractSlider(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractSlider_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractSlider_QWidget(long parent);

/**
This property holds whether slider tracking is enabled. If tracking is enabled (the default), the slider emits the {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signal while the slider is being dragged. If tracking is disabled, the slider emits the {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signal only when the user releases the slider. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#isSliderDown() sliderDown}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tracking")
    @QtBlockedSlot
    public final boolean hasTracking()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasTracking(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasTracking(long __this__nativeId);

/**
This property holds whether or not a slider shows its values inverted.  If this property is false (the default), the minimum and maximum will be shown in its classic position for the inherited widget. If the value is true, the minimum and maximum appear at their opposite location. <p>Note: This property makes most sense for sliders and dials. For scroll bars, the visual effect of the scroll bar subcontrols depends on whether or not the styles understand inverted appearance; most styles ignore this property for scroll bars.
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
This property holds whether or not the slider inverts its wheel and key events.  If this property is false, scrolling the mouse wheel "up" and using keys like page up will increase the slider's value towards its maximum. Otherwise pressing page up will move value towards the slider's minimum.
*/

    @com.trolltech.qt.QtPropertyReader(name="invertedControls")
    @QtBlockedSlot
    public final boolean invertedControls()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invertedControls(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_invertedControls(long __this__nativeId);

/**
This property holds whether the slider is pressed down.  The property is set by subclasses in order to let the abstract slider know whether or not {@link QAbstractSlider#hasTracking() tracking} has any effect. <p>Changing the slider down property emits the {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() } and {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() } signals.
*/

    @com.trolltech.qt.QtPropertyReader(name="sliderDown")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isSliderDown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSliderDown(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSliderDown(long __this__nativeId);

/**
This property holds the slider's maximum value. When setting this property, the {@link QAbstractSlider#minimum() minimum} is adjusted if necessary to ensure that the range remains valid. Also the slider's current value is adjusted to be within the new range.
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
This property holds the sliders's minimum value. When setting this property, the {@link QAbstractSlider#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. Also the slider's current value is adjusted to be within the new range.
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
This property holds the orientation of the slider. The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } (the default) or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }.
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
This property holds the page step.  The larger of two natural steps that an abstract slider provides and typically corresponds to the user pressing PageUp or PageDown. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#singleStep() singleStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="pageStep")
    @QtBlockedSlot
    public final int pageStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageStep(long __this__nativeId);

/**
Returns the current repeat action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#setRepeatAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction, int) setRepeatAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QAbstractSlider.SliderAction repeatAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractSlider.SliderAction.resolve(__qt_repeatAction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_repeatAction(long __this__nativeId);

/**
This property holds whether or not a slider shows its values inverted.  If this property is false (the default), the minimum and maximum will be shown in its classic position for the inherited widget. If the value is true, the minimum and maximum appear at their opposite location. <p>Note: This property makes most sense for sliders and dials. For scroll bars, the visual effect of the scroll bar subcontrols depends on whether or not the styles understand inverted appearance; most styles ignore this property for scroll bars.
*/

    @com.trolltech.qt.QtPropertyWriter(name="invertedAppearance")
    @QtBlockedSlot
    public final void setInvertedAppearance(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInvertedAppearance_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setInvertedAppearance_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether or not the slider inverts its wheel and key events.  If this property is false, scrolling the mouse wheel "up" and using keys like page up will increase the slider's value towards its maximum. Otherwise pressing page up will move value towards the slider's minimum.
*/

    @com.trolltech.qt.QtPropertyWriter(name="invertedControls")
    @QtBlockedSlot
    public final void setInvertedControls(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInvertedControls_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setInvertedControls_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the slider's maximum value. When setting this property, the {@link QAbstractSlider#minimum() minimum} is adjusted if necessary to ensure that the range remains valid. Also the slider's current value is adjusted to be within the new range.
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximum")
    @QtBlockedSlot
    public final void setMaximum(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setMaximum_int(long __this__nativeId, int arg__1);

/**
This property holds the sliders's minimum value. When setting this property, the {@link QAbstractSlider#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. Also the slider's current value is adjusted to be within the new range.
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimum")
    @QtBlockedSlot
    public final void setMinimum(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setMinimum_int(long __this__nativeId, int arg__1);

/**
This property holds the orientation of the slider. The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } (the default) or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }.
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
This property holds the page step.  The larger of two natural steps that an abstract slider provides and typically corresponds to the user pressing PageUp or PageDown. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#singleStep() singleStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="pageStep")
    @QtBlockedSlot
    public final void setPageStep(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageStep_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPageStep_int(long __this__nativeId, int arg__1);

/**
Sets the slider's minimum to <tt>min</tt> and its maximum to <tt>max</tt>. <p>If <tt>max</tt> is smaller than <tt>min</tt>, <tt>min</tt> becomes the only legal value. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#minimum() minimum}, and {@link QAbstractSlider#maximum() maximum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRange(int min, int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_int_int(nativeId(), min, max);
    }
    @QtBlockedSlot
    native void __qt_setRange_int_int(long __this__nativeId, int min, int max);


/**
Sets action <tt>action</tt> to be triggered repetitively in intervals of <tt>repeatTime</tt>, after an initial delay of <tt>thresholdTime</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()}, and {@link com.trolltech.qt.gui.QAbstractSlider#repeatAction() repeatAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setRepeatAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction action, int thresholdTime) {
        setRepeatAction(action, thresholdTime, (int)50);
    }

/**
Sets action <tt>action</tt> to be triggered repetitively in intervals of <tt>repeatTime</tt>, after an initial delay of <tt>thresholdTime</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()}, and {@link com.trolltech.qt.gui.QAbstractSlider#repeatAction() repeatAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setRepeatAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction action) {
        setRepeatAction(action, (int)500, (int)50);
    }
/**
Sets action <tt>action</tt> to be triggered repetitively in intervals of <tt>repeatTime</tt>, after an initial delay of <tt>thresholdTime</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()}, and {@link com.trolltech.qt.gui.QAbstractSlider#repeatAction() repeatAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setRepeatAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction action, int thresholdTime, int repeatTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRepeatAction_SliderAction_int_int(nativeId(), action.value(), thresholdTime, repeatTime);
    }
    @QtBlockedSlot
    native void __qt_setRepeatAction_SliderAction_int_int(long __this__nativeId, int action, int thresholdTime, int repeatTime);

/**
This property holds the single step.  The smaller of two natural steps that an abstract sliders provides and typically corresponds to the user pressing an arrow key. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#pageStep() pageStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleStep")
    @QtBlockedSlot
    public final void setSingleStep(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_int(long __this__nativeId, int arg__1);

/**
This property holds whether the slider is pressed down.  The property is set by subclasses in order to let the abstract slider know whether or not {@link QAbstractSlider#hasTracking() tracking} has any effect. <p>Changing the slider down property emits the {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() } and {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() } signals.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sliderDown")
    @QtBlockedSlot
    public final void setSliderDown(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSliderDown_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setSliderDown_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the current slider position. If {@link QAbstractSlider#hasTracking() tracking} is enabled (the default), this is identical to {@link QAbstractSlider#value() value}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sliderPosition")
    @QtBlockedSlot
    public final void setSliderPosition(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSliderPosition_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setSliderPosition_int(long __this__nativeId, int arg__1);

/**
This property holds whether slider tracking is enabled. If tracking is enabled (the default), the slider emits the {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signal while the slider is being dragged. If tracking is disabled, the slider emits the {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } signal only when the user releases the slider. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#isSliderDown() sliderDown}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tracking")
    @QtBlockedSlot
    public final void setTracking(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTracking_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setTracking_boolean(long __this__nativeId, boolean enable);

/**
This property holds the slider's current value. The slider forces the value to be within the legal range: {@link QAbstractSlider#minimum() minimum} &lt;= <tt>value</tt> &lt;= {@link QAbstractSlider#maximum() maximum}. <p>Changing the value also changes the {@link QAbstractSlider#sliderPosition() sliderPosition}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void setValue(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_int(nativeId(), arg__1);
    }
    native void __qt_setValue_int(long __this__nativeId, int arg__1);

/**
This property holds the single step.  The smaller of two natural steps that an abstract sliders provides and typically corresponds to the user pressing an arrow key. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#pageStep() pageStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="singleStep")
    @QtBlockedSlot
    public final int singleStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_singleStep(long __this__nativeId);

/**
This property holds the current slider position. If {@link QAbstractSlider#hasTracking() tracking} is enabled (the default), this is identical to {@link QAbstractSlider#value() value}.
*/

    @com.trolltech.qt.QtPropertyReader(name="sliderPosition")
    @QtBlockedSlot
    public final int sliderPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sliderPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sliderPosition(long __this__nativeId);

/**
Triggers a slider <tt>action</tt>. Possible actions are {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderSingleStepAdd }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderSingleStepSub }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderPageStepAdd }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderPageStepSub }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderToMinimum }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderToMaximum }, and {@link com.trolltech.qt.gui.QAbstractSlider.SliderAction SliderMove }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider#actionTriggered actionTriggered() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggerAction_SliderAction(nativeId(), action.value());
    }
    @QtBlockedSlot
    native void __qt_triggerAction_SliderAction(long __this__nativeId, int action);

/**
This property holds the slider's current value. The slider forces the value to be within the legal range: {@link QAbstractSlider#minimum() minimum} &lt;= <tt>value</tt> &lt;= {@link QAbstractSlider#maximum() maximum}. <p>Changing the value also changes the {@link QAbstractSlider#sliderPosition() sliderPosition}.
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
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

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
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long ev);

/**
Reimplement this virtual function to track slider changes such as {@link com.trolltech.qt.gui.QAbstractSlider.SliderChange SliderRangeChange }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderChange SliderOrientationChange }, {@link com.trolltech.qt.gui.QAbstractSlider.SliderChange SliderStepsChange }, or {@link com.trolltech.qt.gui.QAbstractSlider.SliderChange SliderValueChange }. The default implementation only updates the display and ignores the <tt>change</tt> parameter.
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QAbstractSlider fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractSlider(QPrivateConstructor p) { super(p); } 
}
