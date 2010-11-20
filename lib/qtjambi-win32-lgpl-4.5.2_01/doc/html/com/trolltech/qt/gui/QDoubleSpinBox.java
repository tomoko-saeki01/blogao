package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDoubleSpinBox class provides a spin box widget that takes doubles. QDoubleSpinBox allows the user to choose a value by clicking the up and down buttons or by pressing Up or Down on the keyboard to increase or decrease the value currently displayed. The user can also type the value in manually. The spin box supports double values but can be extended to use different strings with {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#textFromValue(double) textFromValue()} and {@link com.trolltech.qt.gui.QDoubleSpinBox#valueFromText(java.lang.String) valueFromText()}. <p>Every time the value changes QDoubleSpinBox emits the {@link com.trolltech.qt.gui.QDoubleSpinBox#valueChanged valueChanged() } signal. The current value can be fetched with {@link com.trolltech.qt.gui.QDoubleSpinBox#value() value()} and set with {@link com.trolltech.qt.gui.QDoubleSpinBox#setValue(double) setValue()}. <p>Note: QDoubleSpinBox will round numbers so they can be displayed with the current precision. In a QDoubleSpinBox with decimals set to 2, calling setValue(2.555) will cause {@link com.trolltech.qt.gui.QDoubleSpinBox#value() value()} to return 2.56. <p>Clicking the up and down buttons or using the keyboard accelerator's Up and Down arrows will increase or decrease the current value in steps of size {@link com.trolltech.qt.gui.QDoubleSpinBox#singleStep() singleStep()}. If you want to change this behavior you can reimplement the virtual function {@link com.trolltech.qt.gui.QAbstractSpinBox#stepBy(int) stepBy()}. The minimum and maximum value and the step size can be set using one of the constructors, and can be changed later with {@link com.trolltech.qt.gui.QDoubleSpinBox#setMinimum(double) setMinimum()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setMaximum(double) setMaximum()} and {@link com.trolltech.qt.gui.QDoubleSpinBox#setSingleStep(double) setSingleStep()}. The spinbox has a default precision of 2 decimal places but this can be changed using {@link com.trolltech.qt.gui.QDoubleSpinBox#setDecimals(int) setDecimals()}. <p>Most spin boxes are directional, but QDoubleSpinBox can also operate as a circular spin box, i.e. if the range is 0.0-99.9 and the current value is 99.9, clicking "up" will give 0 if wrapping() is set to true. Use setWrapping() if you want circular behavior. <p>The displayed value can be prepended and appended with arbitrary strings indicating, for example, currency or the unit of measurement. See {@link com.trolltech.qt.gui.QDoubleSpinBox#setPrefix(java.lang.String) setPrefix()} and {@link com.trolltech.qt.gui.QDoubleSpinBox#setSuffix(java.lang.String) setSuffix()}. The text in the spin box is retrieved with text() (which includes any {@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()} and {@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()}), or with {@link com.trolltech.qt.gui.QDoubleSpinBox#cleanText() cleanText()} (which has no {@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()}, no {@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()} and no leading or trailing whitespace). <p>It is often desirable to give the user a special (often default) choice in addition to the range of numeric values. See setSpecialValueText() for how to do this with QDoubleSpinBox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}, {@link com.trolltech.qt.gui.QSlider QSlider}, and {@link <a href="../qtjambi-spinboxes.html">Spin Boxes Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDoubleSpinBox extends com.trolltech.qt.gui.QAbstractSpinBox
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: arg__1)&gt;:<p>
*/

    public final Signal1<java.lang.String> valueStringChanged = new Signal1<java.lang.String>();

    private final void valueStringChanged(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueStringChanged_String(nativeId(), arg__1);
    }
    native void __qt_valueStringChanged_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Double(named: d)&gt;:<p> This signal is emitted whenever the spin box's value is changed. The new value is passed in <tt>d</tt>.
*/

    public final Signal1<java.lang.Double> valueChanged = new Signal1<java.lang.Double>();

    private final void valueChanged(double arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_double(nativeId(), arg__1);
    }
    native void __qt_valueChanged_double(long __this__nativeId, double arg__1);


/**
Constructs a spin box with 0.  as minimum value and 99.99 as maximum value, a step value of 1.0 and a precision of 2 decimal places. The value is initially set to 0.00. The spin box has the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#setMinimum(double) setMinimum()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setMaximum(double) setMaximum()}, and {@link com.trolltech.qt.gui.QDoubleSpinBox#setSingleStep(double) setSingleStep()}. <br></DD></DT>
*/

    public QDoubleSpinBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a spin box with 0.  as minimum value and 99.99 as maximum value, a step value of 1.0 and a precision of 2 decimal places. The value is initially set to 0.00. The spin box has the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#setMinimum(double) setMinimum()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setMaximum(double) setMaximum()}, and {@link com.trolltech.qt.gui.QDoubleSpinBox#setSingleStep(double) setSingleStep()}. <br></DD></DT>
*/

    public QDoubleSpinBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDoubleSpinBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDoubleSpinBox_QWidget(long parent);

/**
This property holds the text of the spin box excluding any prefix, suffix, or leading or trailing whitespace.  <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#text() text}, {@link QDoubleSpinBox#prefix() QDoubleSpinBox::prefix}, and {@link QDoubleSpinBox#suffix() QDoubleSpinBox::suffix}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="cleanText")
    @QtBlockedSlot
    public final java.lang.String cleanText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cleanText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_cleanText(long __this__nativeId);

/**
This property holds the precision of the spin box, in decimals. Sets how many decimals the spinbox will use for displaying and interpreting doubles. <p><b>Warning:</b> The results might not be reliable with very high values for <tt>decimals</tt>. <p>Note: The maximum, minimum and value might change as a result of changing this property.
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
This property holds the maximum value of the spin box. When setting this property the {@link QDoubleSpinBox#minimum() minimum} is adjusted if necessary, to ensure that the range remains valid. <p>The default maximum value is 99.99. <p>Note: The maximum value will be rounded to match the decimals property. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}, and {@link com.trolltech.qt.gui.QDoubleSpinBox#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximum")
    @QtBlockedSlot
    public final double maximum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximum(long __this__nativeId);

/**
This property holds the minimum value of the spin box. When setting this property the {@link QDoubleSpinBox#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. <p>The default minimum value is 0.0. <p>Note: The minimum value will be rounded to match the decimals property. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setRange(double, double) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimum")
    @QtBlockedSlot
    public final double minimum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimum(long __this__nativeId);

/**
This property holds the spin box's prefix. The prefix is prepended to the start of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setPrefix("$");
</pre> To turn off the prefix display, set this property to an empty string. The default is no prefix. The prefix is not displayed when {@link com.trolltech.qt.gui.QDoubleSpinBox#value() value()} == {@link com.trolltech.qt.gui.QDoubleSpinBox#minimum() minimum()} and specialValueText() is set. <p>If no prefix is set, {@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setSuffix(java.lang.String) setSuffix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="prefix")
    @QtBlockedSlot
    public final java.lang.String prefix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_prefix(long __this__nativeId);

/**
This property holds the precision of the spin box, in decimals. Sets how many decimals the spinbox will use for displaying and interpreting doubles. <p><b>Warning:</b> The results might not be reliable with very high values for <tt>decimals</tt>. <p>Note: The maximum, minimum and value might change as a result of changing this property.
*/

    @com.trolltech.qt.QtPropertyWriter(name="decimals")
    @QtBlockedSlot
    public final void setDecimals(int prec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecimals_int(nativeId(), prec);
    }
    @QtBlockedSlot
    native void __qt_setDecimals_int(long __this__nativeId, int prec);

/**
This property holds the maximum value of the spin box. When setting this property the {@link QDoubleSpinBox#minimum() minimum} is adjusted if necessary, to ensure that the range remains valid. <p>The default maximum value is 99.99. <p>Note: The maximum value will be rounded to match the decimals property. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}, and {@link com.trolltech.qt.gui.QDoubleSpinBox#setRange(double, double) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximum")
    @QtBlockedSlot
    public final void setMaximum(double max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_double(nativeId(), max);
    }
    @QtBlockedSlot
    native void __qt_setMaximum_double(long __this__nativeId, double max);

/**
This property holds the minimum value of the spin box. When setting this property the {@link QDoubleSpinBox#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. <p>The default minimum value is 0.0. <p>Note: The minimum value will be rounded to match the decimals property. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setRange(double, double) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimum")
    @QtBlockedSlot
    public final void setMinimum(double min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_double(nativeId(), min);
    }
    @QtBlockedSlot
    native void __qt_setMinimum_double(long __this__nativeId, double min);

/**
This property holds the spin box's prefix. The prefix is prepended to the start of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setPrefix("$");
</pre> To turn off the prefix display, set this property to an empty string. The default is no prefix. The prefix is not displayed when {@link com.trolltech.qt.gui.QDoubleSpinBox#value() value()} == {@link com.trolltech.qt.gui.QDoubleSpinBox#minimum() minimum()} and specialValueText() is set. <p>If no prefix is set, {@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setSuffix(java.lang.String) setSuffix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="prefix")
    @QtBlockedSlot
    public final void setPrefix(java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrefix_String(nativeId(), prefix);
    }
    @QtBlockedSlot
    native void __qt_setPrefix_String(long __this__nativeId, java.lang.String prefix);

/**
Convenience function to set the <tt>minimum</tt> and <tt>maximum</tt> values with a single function call. <p>Note: The maximum and minimum values will be rounded to match the decimals property. <pre class="snippet">
        spinbox.setRange(minimum, maximum);
</pre> is equivalent to: <pre class="snippet">
        spinbox.setMinimum(minimum);
        spinbox.setMaximum(maximum);
</pre> <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#minimum() minimum}, and {@link QDoubleSpinBox#maximum() maximum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRange(double min, double max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_double_double(nativeId(), min, max);
    }
    @QtBlockedSlot
    native void __qt_setRange_double_double(long __this__nativeId, double min, double max);

/**
This property holds the step value. When the user uses the arrows to change the spin box's value the value will be incremented/decremented by the amount of the {@link QDoubleSpinBox#singleStep() singleStep}. The default value is 1.0. Setting a {@link QDoubleSpinBox#singleStep() singleStep} value of less than 0 does nothing.
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleStep")
    @QtBlockedSlot
    public final void setSingleStep(double val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_double(nativeId(), val);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_double(long __this__nativeId, double val);

/**
This property holds the suffix of the spin box. The suffix is appended to the end of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setSuffix(" km");
</pre> To turn off the suffix display, set this property to an empty string. The default is no suffix. The suffix is not displayed for the {@link com.trolltech.qt.gui.QDoubleSpinBox#minimum() minimum()} if specialValueText() is set. <p>If no suffix is set, {@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setPrefix(java.lang.String) setPrefix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="suffix")
    @QtBlockedSlot
    public final void setSuffix(java.lang.String suffix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSuffix_String(nativeId(), suffix);
    }
    @QtBlockedSlot
    native void __qt_setSuffix_String(long __this__nativeId, java.lang.String suffix);

/**
This property holds the value of the spin box. {@link com.trolltech.qt.gui.QDoubleSpinBox#setValue(double) setValue()} will emit {@link com.trolltech.qt.gui.QDoubleSpinBox#valueChanged valueChanged() } if the new value is different from the old one. <p>Note: The value will be rounded so it can be displayed with the current setting of decimals. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void setValue(double val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_double(nativeId(), val);
    }
    native void __qt_setValue_double(long __this__nativeId, double val);

/**
This property holds the step value. When the user uses the arrows to change the spin box's value the value will be incremented/decremented by the amount of the {@link QDoubleSpinBox#singleStep() singleStep}. The default value is 1.0. Setting a {@link QDoubleSpinBox#singleStep() singleStep} value of less than 0 does nothing.
*/

    @com.trolltech.qt.QtPropertyReader(name="singleStep")
    @QtBlockedSlot
    public final double singleStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep(nativeId());
    }
    @QtBlockedSlot
    native double __qt_singleStep(long __this__nativeId);

/**
This property holds the suffix of the spin box. The suffix is appended to the end of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setSuffix(" km");
</pre> To turn off the suffix display, set this property to an empty string. The default is no suffix. The suffix is not displayed for the {@link com.trolltech.qt.gui.QDoubleSpinBox#minimum() minimum()} if specialValueText() is set. <p>If no suffix is set, {@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()}, {@link com.trolltech.qt.gui.QDoubleSpinBox#setPrefix(java.lang.String) setPrefix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="suffix")
    @QtBlockedSlot
    public final java.lang.String suffix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_suffix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_suffix(long __this__nativeId);

/**
This property holds the value of the spin box. {@link com.trolltech.qt.gui.QDoubleSpinBox#setValue(double) setValue()} will emit {@link com.trolltech.qt.gui.QDoubleSpinBox#valueChanged valueChanged() } if the new value is different from the old one. <p>Note: The value will be rounded so it can be displayed with the current setting of decimals. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#decimals() decimals}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="value")
    @QtBlockedSlot
    public final double value()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native double __qt_value(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String fixup(java.lang.String str)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixup_nativepointer(nativeId(), str);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fixup_nativepointer(long __this__nativeId, java.lang.String str);

/**
This virtual function is used by the spin box whenever it needs to display the given <tt>value</tt>. The default implementation returns a string containing <tt>value</tt> printed using {@link QWidget#locale() QWidget::locale()}.toString(<tt>value</tt>, QLatin1Char('f'), {@link com.trolltech.qt.gui.QDoubleSpinBox#decimals() decimals()}) and will remove the thousand separator. Reimplementations may return anything. <p>Note: QDoubleSpinBox does not call this function for specialValueText() and that neither {@link com.trolltech.qt.gui.QDoubleSpinBox#prefix() prefix()} nor {@link com.trolltech.qt.gui.QDoubleSpinBox#suffix() suffix()} should be included in the return value. <p>If you reimplement this, you may also need to reimplement {@link com.trolltech.qt.gui.QDoubleSpinBox#valueFromText(java.lang.String) valueFromText()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#valueFromText(java.lang.String) valueFromText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String textFromValue(double val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textFromValue_double(nativeId(), val);
    }
    @QtBlockedSlot
    native java.lang.String __qt_textFromValue_double(long __this__nativeId, double val);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData input)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QValidator.State.resolve(__qt_validate_nativepointer_nativepointer(nativeId(), input));
    }
    @QtBlockedSlot
    native int __qt_validate_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QValidator.QValidationData input);

/**
This virtual function is used by the spin box whenever it needs to interpret <tt>text</tt> entered by the user as a value. <p>Subclasses that need to display spin box values in a non-numeric way need to reimplement this function. <p>Note: QDoubleSpinBox handles specialValueText() separately; this function is only concerned with the other values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox#textFromValue(double) textFromValue()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double valueFromText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueFromText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native double __qt_valueFromText_String(long __this__nativeId, java.lang.String text);

/**
@exclude
*/

    public static native QDoubleSpinBox fromNativePointer(QNativePointer nativePointer);

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

    protected QDoubleSpinBox(QPrivateConstructor p) { super(p); } 
}
