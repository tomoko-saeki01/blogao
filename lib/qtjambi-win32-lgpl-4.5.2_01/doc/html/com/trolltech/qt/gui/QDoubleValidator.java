package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDoubleValidator class provides range checking of floating-point numbers. QDoubleValidator provides an upper bound, a lower bound, and a limit on the number of digits after the decimal point. It does not provide a {@link com.trolltech.qt.gui.QValidator#fixup(java.lang.String) fixup()} function. <p>You can set the acceptable range in one call with {@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}, or with {@link com.trolltech.qt.gui.QDoubleValidator#setBottom(double) setBottom()} and {@link com.trolltech.qt.gui.QDoubleValidator#setTop(double) setTop()}. Set the number of decimal places with {@link com.trolltech.qt.gui.QDoubleValidator#setDecimals(int) setDecimals()}. The validate() function returns the validation state. <p>QDoubleValidator uses its {@link com.trolltech.qt.gui.QValidator#locale() locale()} to interpret the number. For example, in the German locale, "1,234" will be accepted as the fractional number 1.234. In Arabic locales, QDoubleValidator will accept Arabic digits. <p>In addition, QDoubleValidator is always guaranteed to accept a number formatted according to the "C" locale. QDoubleValidator will not accept numbers with thousand-seperators. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator QIntValidator}, {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator}, and {@link <a href="../qtjambi-lineedits.html">Line Edits Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDoubleValidator extends com.trolltech.qt.gui.QValidator
{
    
/**
This enum defines the allowed notations for entering a double.
*/
@QtBlockedEnum
    public enum Notation implements com.trolltech.qt.QtEnumerator {
/**
 The string is written as a standard number (i.e. 0.015).
*/

        StandardNotation(0),
/**
 The string is written in scientific form. It may have an exponent part(i.e. 1.5E-2).
*/

        ScientificNotation(1);

        Notation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDoubleValidator$Notation constant with the specified <tt>int</tt>.</brief>
*/

        public static Notation resolve(int value) {
            return (Notation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StandardNotation;
            case 1: return ScientificNotation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a validator object with a <tt>parent</tt> object that accepts any double.
*/

    public QDoubleValidator(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QDoubleValidator_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDoubleValidator_QObject(long parent);

/**
Constructs a validator object with a <tt>parent</tt> object. This validator will accept doubles from <tt>bottom</tt> to <tt>top</tt> inclusive, with up to <tt>decimals</tt> digits after the decimal point.
*/

    public QDoubleValidator(double bottom, double top, int decimals, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QDoubleValidator_double_double_int_QObject(bottom, top, decimals, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDoubleValidator_double_double_int_QObject(double bottom, double top, int decimals, long parent);

/**
This property holds the validator's minimum acceptable value. By default, this property contains a value of -infinity. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="bottom")
    @QtBlockedSlot
    public final double bottom()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottom(nativeId());
    }
    @QtBlockedSlot
    native double __qt_bottom(long __this__nativeId);

/**
This property holds the validator's maximum number of digits after the decimal point. By default, this property contains a value of 1000. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="decimals")
    @QtBlockedSlot
    public final int decimals()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decimals(nativeId());
    }
    @QtBlockedSlot
    native int __qt_decimals(long __this__nativeId);

/**
This property holds the notation of how a string can describe a number. By default, this property is set to {@link com.trolltech.qt.gui.QDoubleValidator.Notation ScientificNotation }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator.Notation Notation }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="notation")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDoubleValidator.Notation notation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDoubleValidator.Notation.resolve(__qt_notation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_notation(long __this__nativeId);

/**
This property holds the validator's minimum acceptable value. By default, this property contains a value of -infinity. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="bottom")
    @QtBlockedSlot
    public final void setBottom(double arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottom_double(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setBottom_double(long __this__nativeId, double arg__1);

/**
This property holds the validator's maximum number of digits after the decimal point. By default, this property contains a value of 1000. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="decimals")
    @QtBlockedSlot
    public final void setDecimals(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecimals_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDecimals_int(long __this__nativeId, int arg__1);

/**
This property holds the notation of how a string can describe a number. By default, this property is set to {@link com.trolltech.qt.gui.QDoubleValidator.Notation ScientificNotation }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator.Notation Notation }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="notation")
    @QtBlockedSlot
    public final void setNotation(com.trolltech.qt.gui.QDoubleValidator.Notation arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNotation_Notation(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setNotation_Notation(long __this__nativeId, int arg__1);

/**
This property holds the validator's maximum acceptable value. By default, this property contains a value of infinity. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="top")
    @QtBlockedSlot
    public final void setTop(double arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTop_double(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setTop_double(long __this__nativeId, double arg__1);

/**
This property holds the validator's maximum acceptable value. By default, this property contains a value of infinity. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="top")
    @QtBlockedSlot
    public final double top()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_top(nativeId());
    }
    @QtBlockedSlot
    native double __qt_top(long __this__nativeId);


/**
Sets the validator to accept doubles from <tt>minimum</tt> to <tt>maximum</tt> inclusive, with at most <tt>decimals</tt> digits after the decimal point.
*/

    @QtBlockedSlot
    public final void setRange(double bottom, double top) {
        setRange(bottom, top, (int)0);
    }
/**
Sets the validator to accept doubles from <tt>minimum</tt> to <tt>maximum</tt> inclusive, with at most <tt>decimals</tt> digits after the decimal point.
*/

    @QtBlockedSlot
    public void setRange(double bottom, double top, int decimals)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_double_double_int(nativeId(), bottom, top, decimals);
    }
    @QtBlockedSlot
    native void __qt_setRange_double_double_int(long __this__nativeId, double bottom, double top, int decimals);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QValidator.State.resolve(__qt_validate_nativepointer_nativepointer(nativeId(), arg__1));
    }
    @QtBlockedSlot
    native int __qt_validate_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QValidator.QValidationData arg__1);

/**
@exclude
*/

    public static native QDoubleValidator fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDoubleValidator(QPrivateConstructor p) { super(p); } 
}
