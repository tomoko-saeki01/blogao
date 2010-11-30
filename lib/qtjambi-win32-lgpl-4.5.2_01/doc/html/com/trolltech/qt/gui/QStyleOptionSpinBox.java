package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionSpinBox class is used to describe the parameters necessary for drawing a spin box. QStyleOptionSpinBox contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QSpinBox QSpinBox} and {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionSpinBox extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSpinBox.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionSpinBox$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSpinBox.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_SpinBox } for this class).
*/

        Type(983042);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionSpinBox$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983042: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionSpinBox, initializing the members variables to their default values.
*/

    public QStyleOptionSpinBox(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSpinBox();
    }

    native void __qt_QStyleOptionSpinBox();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionSpinBox(com.trolltech.qt.gui.QStyleOptionSpinBox other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSpinBox_QStyleOptionSpinBox(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionSpinBox_QStyleOptionSpinBox(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSpinBox(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSpinBox_int(version);
    }

    native void __qt_QStyleOptionSpinBox_int(int version);


/**

*/

    @QtBlockedSlot
    public final void setStepEnabled(com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag ... stepEnabled) {
        this.setStepEnabled(new com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled(stepEnabled));
    }
/**
This variable holds which buttons of the spin box that are enabled. The default value is {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag QAbstractSpinBox::StepNone }. <p><DT><b>See also:</b><br><DD>QAbstractSpinBox::StepEnabled. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStepEnabled(com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled stepEnabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStepEnabled_StepEnabled(nativeId(), stepEnabled.value());
    }
    @QtBlockedSlot
    native void __qt_setStepEnabled_StepEnabled(long __this__nativeId, int stepEnabled);

/**
This variable holds which buttons of the spin box that are enabled. The default value is {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag QAbstractSpinBox::StepNone }. <p><DT><b>See also:</b><br><DD>QAbstractSpinBox::StepEnabled. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled stepEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled(__qt_stepEnabled(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_stepEnabled(long __this__nativeId);

/**
This variable holds the type of button symbols to draw for the spin box. The default value is {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols QAbstractSpinBox::UpDownArrows } specufying little arrows in the classic style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols QAbstractSpinBox::ButtonSymbols }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setButtonSymbols(com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols buttonSymbols)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonSymbols_ButtonSymbols(nativeId(), buttonSymbols.value());
    }
    @QtBlockedSlot
    native void __qt_setButtonSymbols_ButtonSymbols(long __this__nativeId, int buttonSymbols);

/**
This variable holds the type of button symbols to draw for the spin box. The default value is {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols QAbstractSpinBox::UpDownArrows } specufying little arrows in the classic style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols QAbstractSpinBox::ButtonSymbols }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols buttonSymbols()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols.resolve(__qt_buttonSymbols(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttonSymbols(long __this__nativeId);

/**
This variable holds whether the spin box has a frame. The default value is false, i.e. the spin box has no frame.
*/

    @QtBlockedSlot
    public final void setFrame(boolean frame)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrame_boolean(nativeId(), frame);
    }
    @QtBlockedSlot
    native void __qt_setFrame_boolean(long __this__nativeId, boolean frame);

/**
This variable holds whether the spin box has a frame. The default value is false, i.e. the spin box has no frame.
*/

    @QtBlockedSlot
    public final boolean frame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frame(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_frame(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionSpinBox fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSpinBox(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionSpinBox array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionSpinBox clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionSpinBox __qt_clone(long __this_nativeId);
}
