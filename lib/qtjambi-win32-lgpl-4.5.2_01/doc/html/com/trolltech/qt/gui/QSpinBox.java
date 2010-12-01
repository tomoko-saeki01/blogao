package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSpinBox class provides a spin box widget. QSpinBox is designed to handle integers and discrete sets of values (e.g., month names); use {@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox} for floating point values. <p>QSpinBox allows the user to choose a value by clicking the up/down buttons or pressing up/down on the keyboard to increase/decrease the value currently displayed. The user can also type the value in manually. The spin box supports integer values but can be extended to use different strings with {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}, {@link com.trolltech.qt.gui.QSpinBox#textFromValue(int) textFromValue()} and {@link com.trolltech.qt.gui.QSpinBox#valueFromText(java.lang.String) valueFromText()}. <p>Every time the value changes QSpinBox emits the {@link com.trolltech.qt.gui.QSpinBox#valueChanged valueChanged() } signals. The current value can be fetched with {@link com.trolltech.qt.gui.QSpinBox#value() value()} and set with {@link com.trolltech.qt.gui.QSpinBox#setValue(int) setValue()}. <p>Clicking the up/down buttons or using the keyboard accelerator's up and down arrows will increase or decrease the current value in steps of size {@link com.trolltech.qt.gui.QSpinBox#singleStep() singleStep()}. If you want to change this behaviour you can reimplement the virtual function {@link com.trolltech.qt.gui.QAbstractSpinBox#stepBy(int) stepBy()}. The minimum and maximum value and the step size can be set using one of the constructors, and can be changed later with {@link com.trolltech.qt.gui.QSpinBox#setMinimum(int) setMinimum()}, {@link com.trolltech.qt.gui.QSpinBox#setMaximum(int) setMaximum()} and {@link com.trolltech.qt.gui.QSpinBox#setSingleStep(int) setSingleStep()}. <p>Most spin boxes are directional, but QSpinBox can also operate as a circular spin box, i.e. if the range is 0-99 and the current value is 99, clicking "up" will give 0 if wrapping() is set to true. Use setWrapping() if you want circular behavior. <p>The displayed value can be prepended and appended with arbitrary strings indicating, for example, currency or the unit of measurement. See {@link com.trolltech.qt.gui.QSpinBox#setPrefix(java.lang.String) setPrefix()} and {@link com.trolltech.qt.gui.QSpinBox#setSuffix(java.lang.String) setSuffix()}. The text in the spin box is retrieved with text() (which includes any {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()} and {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()}), or with {@link com.trolltech.qt.gui.QSpinBox#cleanText() cleanText()} (which has no {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()}, no {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()} and no leading or trailing whitespace). <p>It is often desirable to give the user a special (often default) choice in addition to the range of numeric values. See setSpecialValueText() for how to do this with QSpinBox. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-spinbox.png"></center><br></td><td> A spin box shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/plastique-spinbox.png"></center><br></td><td> A spin box shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-spinbox.png"></center><br></td><td> A spin box shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr></table><a name="subclassing-qspinbox"><h2>Subclassing QSpinBox</h2> If using {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()}, {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()}, and specialValueText() don't provide enough control, you subclass QSpinBox and reimplement {@link com.trolltech.qt.gui.QSpinBox#valueFromText(java.lang.String) valueFromText()} and {@link com.trolltech.qt.gui.QSpinBox#textFromValue(int) textFromValue()}. For example, here's the code for a custom spin box that allows the user to enter icon sizes (e.g., "32 x 32"):<br><br>The following code example is written in c++.<br> <pre class="snippet">
int IconSizeSpinBox::valueFromText(const QString &text) const
{
    QRegExp regExp(tr("(\\d+)(\\s*[xx]\\s*\\d+)?"));

    if (regExp.exactMatch(text)) {
        return regExp.cap(1).toInt();
    } else {
        return 0;
    }
}
<br>
QString IconSizeSpinBox::textFromValue(int value) const
{
    return tr("%1 x %1").arg(value);
}
</pre> See the {@link <a href="../qtjambi-icons.html">Icons</a>} example for the full source code. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox}, {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}, {@link com.trolltech.qt.gui.QSlider QSlider}, and {@link <a href="../qtjambi-spinboxes.html">Spin Boxes Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSpinBox extends com.trolltech.qt.gui.QAbstractSpinBox
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: i)&gt;:<p> This signal is emitted whenever the spin box's value is changed. The new value's integer value is passed in <tt>i</tt>.
*/

    public final Signal1<java.lang.Integer> valueChanged = new Signal1<java.lang.Integer>();

    private final void valueChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_int(nativeId(), arg__1);
    }
    native void __qt_valueChanged_int(long __this__nativeId, int arg__1);


/**
Constructs a spin box with 0 as minimum value and 99 as maximum value, a step value of 1. The value is initially set to 0. It is parented to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setMinimum(int) setMinimum()}, {@link com.trolltech.qt.gui.QSpinBox#setMaximum(int) setMaximum()}, and {@link com.trolltech.qt.gui.QSpinBox#setSingleStep(int) setSingleStep()}. <br></DD></DT>
*/

    public QSpinBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a spin box with 0 as minimum value and 99 as maximum value, a step value of 1. The value is initially set to 0. It is parented to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setMinimum(int) setMinimum()}, {@link com.trolltech.qt.gui.QSpinBox#setMaximum(int) setMaximum()}, and {@link com.trolltech.qt.gui.QSpinBox#setSingleStep(int) setSingleStep()}. <br></DD></DT>
*/

    public QSpinBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSpinBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSpinBox_QWidget(long parent);

/**
This property holds the text of the spin box excluding any prefix, suffix, or leading or trailing whitespace.  <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#text() text}, {@link QSpinBox#prefix() QSpinBox::prefix}, and {@link QSpinBox#suffix() QSpinBox::suffix}. <br></DD></DT>
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
This property holds the maximum value of the spin box. When setting this property the {@link QSpinBox#minimum() minimum} is adjusted if necessary, to ensure that the range remains valid. <p>The default maximum value is 99. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setRange(int, int) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
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
This property holds the minimum value of the spin box. When setting this property the {@link QSpinBox#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. <p>The default minimum value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setRange(int, int) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
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
This property holds the spin box's prefix. The prefix is prepended to the start of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setPrefix("$");
</pre> To turn off the prefix display, set this property to an empty string. The default is no prefix. The prefix is not displayed when {@link com.trolltech.qt.gui.QSpinBox#value() value()} == {@link com.trolltech.qt.gui.QSpinBox#minimum() minimum()} and specialValueText() is set. <p>If no prefix is set, {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()}, {@link com.trolltech.qt.gui.QSpinBox#setSuffix(java.lang.String) setSuffix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
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
This property holds the maximum value of the spin box. When setting this property the {@link QSpinBox#minimum() minimum} is adjusted if necessary, to ensure that the range remains valid. <p>The default maximum value is 99. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setRange(int, int) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximum")
    @QtBlockedSlot
    public final void setMaximum(int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), max);
    }
    @QtBlockedSlot
    native void __qt_setMaximum_int(long __this__nativeId, int max);

/**
This property holds the minimum value of the spin box. When setting this property the {@link QSpinBox#maximum() maximum} is adjusted if necessary to ensure that the range remains valid. <p>The default minimum value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#setRange(int, int) setRange()}, and {@link QAbstractSpinBox#specialValueText() specialValueText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimum")
    @QtBlockedSlot
    public final void setMinimum(int min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), min);
    }
    @QtBlockedSlot
    native void __qt_setMinimum_int(long __this__nativeId, int min);

/**
This property holds the spin box's prefix. The prefix is prepended to the start of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setPrefix("$");
</pre> To turn off the prefix display, set this property to an empty string. The default is no prefix. The prefix is not displayed when {@link com.trolltech.qt.gui.QSpinBox#value() value()} == {@link com.trolltech.qt.gui.QSpinBox#minimum() minimum()} and specialValueText() is set. <p>If no prefix is set, {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()}, {@link com.trolltech.qt.gui.QSpinBox#setSuffix(java.lang.String) setSuffix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
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
Convenience function to set the <tt>minimum</tt>, and <tt>maximum</tt> values with a single function call. <pre class="snippet">
        spinbox.setRange(minimum, maximum);
</pre> is equivalent to: <pre class="snippet">
        spinbox.setMinimum(minimum);
        spinbox.setMaximum(maximum);
</pre> <p><DT><b>See also:</b><br><DD>{@link QSpinBox#minimum() minimum}, and {@link QSpinBox#maximum() maximum}. <br></DD></DT>
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
This property holds the step value. When the user uses the arrows to change the spin box's value the value will be incremented/decremented by the amount of the {@link QSpinBox#singleStep() singleStep}. The default value is 1. Setting a {@link QSpinBox#singleStep() singleStep} value of less than 0 does nothing.
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleStep")
    @QtBlockedSlot
    public final void setSingleStep(int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_int(nativeId(), val);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_int(long __this__nativeId, int val);

/**
This property holds the suffix of the spin box. The suffix is appended to the end of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setSuffix(" km");
</pre> To turn off the suffix display, set this property to an empty string. The default is no suffix. The suffix is not displayed for the {@link com.trolltech.qt.gui.QSpinBox#minimum() minimum()} if specialValueText() is set. <p>If no suffix is set, {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()}, {@link com.trolltech.qt.gui.QSpinBox#setPrefix(java.lang.String) setPrefix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
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
This property holds the value of the spin box. {@link com.trolltech.qt.gui.QSpinBox#setValue(int) setValue()} will emit {@link com.trolltech.qt.gui.QSpinBox#valueChanged valueChanged() } if the new value is different from the old one.
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void setValue(int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_int(nativeId(), val);
    }
    native void __qt_setValue_int(long __this__nativeId, int val);

/**
This property holds the step value. When the user uses the arrows to change the spin box's value the value will be incremented/decremented by the amount of the {@link QSpinBox#singleStep() singleStep}. The default value is 1. Setting a {@link QSpinBox#singleStep() singleStep} value of less than 0 does nothing.
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
This property holds the suffix of the spin box. The suffix is appended to the end of the displayed value. Typical use is to display a unit of measurement or a currency symbol. For example: <pre class="snippet">
        spinbox.setSuffix(" km");
</pre> To turn off the suffix display, set this property to an empty string. The default is no suffix. The suffix is not displayed for the {@link com.trolltech.qt.gui.QSpinBox#minimum() minimum()} if specialValueText() is set. <p>If no suffix is set, {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()}, {@link com.trolltech.qt.gui.QSpinBox#setPrefix(java.lang.String) setPrefix()}, specialValueText(), and setSpecialValueText(). <br></DD></DT>
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
This property holds the value of the spin box. {@link com.trolltech.qt.gui.QSpinBox#setValue(int) setValue()} will emit {@link com.trolltech.qt.gui.QSpinBox#valueChanged valueChanged() } if the new value is different from the old one.
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
    public java.lang.String fixup(java.lang.String str)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixup_nativepointer(nativeId(), str);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fixup_nativepointer(long __this__nativeId, java.lang.String str);

/**
This virtual function is used by the spin box whenever it needs to display the given <tt>value</tt>. The default implementation returns a string containing <tt>value</tt> printed in the standard way using {@link QWidget#locale() QWidget::locale()}.toString(). Reimplementations may return anything. (See the example in the detailed description.) <p>Note: QSpinBox does not call this function for specialValueText() and that neither {@link com.trolltech.qt.gui.QSpinBox#prefix() prefix()} nor {@link com.trolltech.qt.gui.QSpinBox#suffix() suffix()} should be included in the return value. <p>If you reimplement this, you may also need to reimplement {@link com.trolltech.qt.gui.QSpinBox#valueFromText(java.lang.String) valueFromText()} and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#valueFromText(java.lang.String) valueFromText()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.String textFromValue(int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textFromValue_int(nativeId(), val);
    }
    @QtBlockedSlot
    native java.lang.String __qt_textFromValue_int(long __this__nativeId, int val);

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
This virtual function is used by the spin box whenever it needs to interpret <tt>text</tt> entered by the user as a value. <p>Subclasses that need to display spin box values in a non-numeric way need to reimplement this function. <p>Note: QSpinBox handles specialValueText() separately; this function is only concerned with the other values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSpinBox#textFromValue(int) textFromValue()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected int valueFromText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueFromText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native int __qt_valueFromText_String(long __this__nativeId, java.lang.String text);

/**
@exclude
*/

    public static native QSpinBox fromNativePointer(QNativePointer nativePointer);

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

    protected QSpinBox(QPrivateConstructor p) { super(p); } 
}
