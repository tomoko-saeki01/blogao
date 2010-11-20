package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIntValidator class provides a validator that ensures a string contains a valid integer within a specified range. Example of use: <pre class="snippet">
    QValidator validator = new QIntValidator(100, 999, this);
    QLineEdit edit = new QLineEdit(this);

    // the edit lineedit will only accept integers between 100 and 999
    edit.setValidator(validator);
</pre> Below we present some examples of validators. In practice they would normally be associated with a widget as in the example above. <pre class="snippet">
    String str;
    int pos = 0;
    QIntValidator v= new QIntValidator(100, 999, this);

    str = "1";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Intermediate
    str = "12";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Intermediate

    str = "123";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Acceptable
    str = "678";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Acceptable

    str = "1234";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Invalid
    str = "-123";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Invalid
    str = "abc";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Invalid
    str = "12cm";
    v.validate(new QValidator.QValidationData(str, pos));     // returns Invalid
</pre> Notice that the value <tt>999</tt> returns Intermediate. Values consisting of a number of digits equal to or less than the max value are considered intermediate. This is intended because the digit that prevents a number to be in range is not necessarily the last digit typed. This also means that an intermediate number can have leading zeros. <p>The minimum and maximum values are set in one call with {@link com.trolltech.qt.gui.QIntValidator#setRange(int, int) setRange()}, or individually with {@link com.trolltech.qt.gui.QIntValidator#setBottom(int) setBottom()} and {@link com.trolltech.qt.gui.QIntValidator#setTop(int) setTop()}. <p>QIntValidator uses its {@link com.trolltech.qt.gui.QValidator#locale() locale()} to interpret the number. For example, in Arabic locales, QIntValidator will accept Arabic digits. In addition, QIntValidator is always guaranteed to accept a number formatted according to the "C" locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator}, {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator}, and {@link <a href="../qtjambi-lineedits.html">Line Edits Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QIntValidator extends com.trolltech.qt.gui.QValidator
{

/**
Constructs a validator with a <tt>parent</tt> object that accepts all integers.
*/

    public QIntValidator(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QIntValidator_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QIntValidator_QObject(long parent);

/**
Constructs a validator with a <tt>parent</tt>, that accepts integers from <tt>minimum</tt> to <tt>maximum</tt> inclusive.
*/

    public QIntValidator(int bottom, int top, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QIntValidator_int_int_QObject(bottom, top, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QIntValidator_int_int_QObject(int bottom, int top, long parent);

/**
This property holds the validator's lowest acceptable value. By default, this property's value is derived from the lowest signed integer available (typically -2147483647). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="bottom")
    @QtBlockedSlot
    public final int bottom()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottom(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bottom(long __this__nativeId);

/**
This property holds the validator's lowest acceptable value. By default, this property's value is derived from the lowest signed integer available (typically -2147483647). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="bottom")
    @QtBlockedSlot
    public final void setBottom(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottom_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setBottom_int(long __this__nativeId, int arg__1);

/**
This property holds the validator's highest acceptable value. By default, this property's value is derived from the highest signed integer available (typically 2147483647). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="top")
    @QtBlockedSlot
    public final void setTop(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTop_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setTop_int(long __this__nativeId, int arg__1);

/**
This property holds the validator's highest acceptable value. By default, this property's value is derived from the highest signed integer available (typically 2147483647). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="top")
    @QtBlockedSlot
    public final int top()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_top(nativeId());
    }
    @QtBlockedSlot
    native int __qt_top(long __this__nativeId);

/**
Sets the range of the validator to only accept integers between <tt>bottom</tt> and <tt>top</tt> inclusive.
*/

    @QtBlockedSlot
    public void setRange(int bottom, int top)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_int_int(nativeId(), bottom, top);
    }
    @QtBlockedSlot
    native void __qt_setRange_int_int(long __this__nativeId, int bottom, int top);

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

    public static native QIntValidator fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIntValidator(QPrivateConstructor p) { super(p); } 
}
