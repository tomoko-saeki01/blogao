package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionSlider class is used to describe the parameters needed for drawing a slider. QStyleOptionSlider contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QSlider QSlider} and {@link com.trolltech.qt.gui.QScrollBar QScrollBar}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, {@link com.trolltech.qt.gui.QSlider QSlider}, and {@link com.trolltech.qt.gui.QScrollBar QScrollBar}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionSlider extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSlider.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 1
*/

        Version(1);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionSlider$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSlider.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Slider } for this class).
*/

        Type(983041);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionSlider$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983041: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionSlider, initializing the members variables to their default values.
*/

    public QStyleOptionSlider(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSlider();
    }

    native void __qt_QStyleOptionSlider();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionSlider(com.trolltech.qt.gui.QStyleOptionSlider other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSlider_QStyleOptionSlider(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionSlider_QStyleOptionSlider(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSlider(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSlider_int(version);
    }

    native void __qt_QStyleOptionSlider_int(int version);

/**
This variable holds the interval that should be drawn between tick marks. The default value is 0.
*/

    @QtBlockedSlot
    public final void setTickInterval(int tickInterval)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTickInterval_int(nativeId(), tickInterval);
    }
    @QtBlockedSlot
    native void __qt_setTickInterval_int(long __this__nativeId, int tickInterval);

/**
This variable holds the interval that should be drawn between tick marks. The default value is 0.
*/

    @QtBlockedSlot
    public final int tickInterval()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tickInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tickInterval(long __this__nativeId);

/**
This variable holds the minimum value for the slider. The default value is 0.
*/

    @QtBlockedSlot
    public final void setMinimum(int minimum)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), minimum);
    }
    @QtBlockedSlot
    native void __qt_setMinimum_int(long __this__nativeId, int minimum);

/**
This variable holds the minimum value for the slider. The default value is 0.
*/

    @QtBlockedSlot
    public final int minimum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimum(long __this__nativeId);

/**
This variable holds the number of pixel between notches. The default value is 0.0. <p><DT><b>See also:</b><br><DD>{@link QDial#notchTarget() QDial::notchTarget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNotchTarget(double notchTarget)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNotchTarget_double(nativeId(), notchTarget);
    }
    @QtBlockedSlot
    native void __qt_setNotchTarget_double(long __this__nativeId, double notchTarget);

/**
This variable holds the number of pixel between notches. The default value is 0.0. <p><DT><b>See also:</b><br><DD>{@link QDial#notchTarget() QDial::notchTarget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double notchTarget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notchTarget(nativeId());
    }
    @QtBlockedSlot
    native double __qt_notchTarget(long __this__nativeId);

/**
This variable holds the maximum value for the slider. The default value is 0.
*/

    @QtBlockedSlot
    public final void setMaximum(int maximum)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), maximum);
    }
    @QtBlockedSlot
    native void __qt_setMaximum_int(long __this__nativeId, int maximum);

/**
This variable holds the maximum value for the slider. The default value is 0.
*/

    @QtBlockedSlot
    public final int maximum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximum(long __this__nativeId);

/**
This variable holds the position of the slider handle. If the slider has active feedback (i.e., {@link QAbstractSlider#hasTracking() QAbstractSlider::tracking} is true), this value will be the same as sliderValue. Otherwise, it will have the current position of the handle. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#hasTracking() QAbstractSlider::tracking}, and sliderValue. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSliderPosition(int sliderPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSliderPosition_int(nativeId(), sliderPosition);
    }
    @QtBlockedSlot
    native void __qt_setSliderPosition_int(long __this__nativeId, int sliderPosition);

/**
This variable holds the position of the slider handle. If the slider has active feedback (i.e., {@link QAbstractSlider#hasTracking() QAbstractSlider::tracking} is true), this value will be the same as sliderValue. Otherwise, it will have the current position of the handle. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#hasTracking() QAbstractSlider::tracking}, and sliderValue. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sliderPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sliderPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sliderPosition(long __this__nativeId);

/**
This variable holds whether the dial should wrap or not. The default value is false, i.e. the dial is not wrapped. <p><DT><b>See also:</b><br><DD>{@link QDial#wrapping() QDial::wrapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDialWrapping(boolean dialWrapping)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDialWrapping_boolean(nativeId(), dialWrapping);
    }
    @QtBlockedSlot
    native void __qt_setDialWrapping_boolean(long __this__nativeId, boolean dialWrapping);

/**
This variable holds whether the dial should wrap or not. The default value is false, i.e. the dial is not wrapped. <p><DT><b>See also:</b><br><DD>{@link QDial#wrapping() QDial::wrapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean dialWrapping()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dialWrapping(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dialWrapping(long __this__nativeId);

/**
This variable holds the value of the slider. If the slider has active feedback (i.e., {@link QAbstractSlider#hasTracking() QAbstractSlider::tracking} is true), this value will be the same as sliderPosition. Otherwise, it will have the value the slider had before the mouse was pressed. <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#hasTracking() QAbstractSlider::tracking}, and sliderPosition. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSliderValue(int sliderValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSliderValue_int(nativeId(), sliderValue);
    }
    @QtBlockedSlot
    native void __qt_setSliderValue_int(long __this__nativeId, int sliderValue);

/**
This variable holds the value of the slider. If the slider has active feedback (i.e., {@link QAbstractSlider#hasTracking() QAbstractSlider::tracking} is true), this value will be the same as sliderPosition. Otherwise, it will have the value the slider had before the mouse was pressed. <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#hasTracking() QAbstractSlider::tracking}, and sliderPosition. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sliderValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sliderValue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sliderValue(long __this__nativeId);

/**
This variable holds the size of the single step of the slider. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#singleStep() QAbstractSlider::singleStep}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSingleStep(int singleStep)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_int(nativeId(), singleStep);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_int(long __this__nativeId, int singleStep);

/**
This variable holds the size of the single step of the slider. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#singleStep() QAbstractSlider::singleStep}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int singleStep()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_singleStep(long __this__nativeId);

/**
This variable holds the position of the slider's tick marks, if any. The default value is {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::NoTicks }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::TickPosition }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTickPosition(com.trolltech.qt.gui.QSlider.TickPosition tickPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTickPosition_TickPosition(nativeId(), tickPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setTickPosition_TickPosition(long __this__nativeId, int tickPosition);

/**
This variable holds the position of the slider's tick marks, if any. The default value is {@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::NoTicks }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSlider.TickPosition QSlider::TickPosition }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSlider.TickPosition tickPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSlider.TickPosition.resolve(__qt_tickPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tickPosition(long __this__nativeId);

/**
This variable holds the size of the page step of the slider. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#pageStep() QAbstractSlider::pageStep}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPageStep(int pageStep)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageStep_int(nativeId(), pageStep);
    }
    @QtBlockedSlot
    native void __qt_setPageStep_int(long __this__nativeId, int pageStep);

/**
This variable holds the size of the page step of the slider. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QAbstractSlider#pageStep() QAbstractSlider::pageStep}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pageStep()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageStep(long __this__nativeId);

/**
This variable holds the slider's orientation (horizontal or vertical). The default orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.Orientation Qt::Orientation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This variable holds the slider's orientation (horizontal or vertical). The default orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.Orientation Qt::Orientation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
This variable holds the slider control orientation. Normally a slider increases as it moves up or to the right; upsideDown indicates that it should do the opposite (increase as it moves down or to the left). The default value is false, i.e. the slider increases as it moves up or to the right. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderPositionFromValue(int, int, int, int) QStyle::sliderPositionFromValue()}, {@link com.trolltech.qt.gui.QStyle#sliderValueFromPosition(int, int, int, int) QStyle::sliderValueFromPosition()}, and {@link QAbstractSlider#invertedAppearance() QAbstractSlider::invertedAppearance}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUpsideDown(boolean upsideDown)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUpsideDown_boolean(nativeId(), upsideDown);
    }
    @QtBlockedSlot
    native void __qt_setUpsideDown_boolean(long __this__nativeId, boolean upsideDown);

/**
This variable holds the slider control orientation. Normally a slider increases as it moves up or to the right; upsideDown indicates that it should do the opposite (increase as it moves down or to the left). The default value is false, i.e. the slider increases as it moves up or to the right. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderPositionFromValue(int, int, int, int) QStyle::sliderPositionFromValue()}, {@link com.trolltech.qt.gui.QStyle#sliderValueFromPosition(int, int, int, int) QStyle::sliderValueFromPosition()}, and {@link QAbstractSlider#invertedAppearance() QAbstractSlider::invertedAppearance}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean upsideDown()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_upsideDown(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_upsideDown(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionSlider fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSlider(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionSlider array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionSlider clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionSlider __qt_clone(long __this_nativeId);
}
