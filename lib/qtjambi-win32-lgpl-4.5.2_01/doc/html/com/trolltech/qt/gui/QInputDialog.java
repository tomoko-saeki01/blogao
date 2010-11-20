package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputDialog class provides a simple convenience dialog to get a single value from the user. The input value can be a string, a number or an item from a list. A label must be set to tell the user what they should enter. <p>Four static convenience functions are provided: {@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getInt(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInt()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. All the functions can be used in a similar way, for example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    QString text = QInputDialog::getText(this, tr("QInputDialog::getText()"),
                                         tr("User name:"), QLineEdit::Normal,
                                         QDir::home().dirName(), &ok);
    if (ok && !text.isEmpty())
        textLabel-&gt;setText(text);
</pre> The <tt>ok</tt> variable is set to true if the user clicks <b>OK</b>; otherwise it is set to false. <br><center><img src="../images/inputdialogs.png"></center><br> The {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs</a>} example shows how to use QInputDialog as well as other built-in Qt dialogs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}, and {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QInputDialog extends com.trolltech.qt.gui.QDialog
{
    
/**
This enum describes the different modes of input that can be selected for the dialog. <p><DT><b>See also:</b><br><DD>{@link QInputDialog#inputMode() inputMode}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum InputMode implements com.trolltech.qt.QtEnumerator {
/**
 Used to input text strings.
*/

        TextInput(0),
/**
 Used to input integers.
*/

        IntInput(1),
/**
 Used to input floating point numbers with double precision accuracy.
*/

        DoubleInput(2);

        InputMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QInputDialog$InputMode constant with the specified <tt>int</tt>.</brief>
*/

        public static InputMode resolve(int value) {
            return (InputMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TextInput;
            case 1: return IntInput;
            case 2: return DoubleInput;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum specifies various options that affect the look and feel of an input dialog. <p><DT><b>See also:</b><br><DD>{@link QInputDialog#options() options}, {@link com.trolltech.qt.gui.QInputDialog#setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QInputDialog#testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) testOption()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum InputDialogOption implements com.trolltech.qt.QtEnumerator {
/**
 Don't display <b>OK</b> and <b>Cancel</b> buttons. (Useful for "live dialogs".)
*/

        NoButtons(1),
/**
 Use a {@link com.trolltech.qt.gui.QListView QListView} rather than a non-editable {@link com.trolltech.qt.gui.QComboBox QComboBox} for displaying the items set with setComboBoxItems().
*/

        UseListViewForComboBoxItems(2);

        InputDialogOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QInputDialog$InputDialogOptions with the specified <tt>com.trolltech.qt.gui.QInputDialog$InputDialogOption[]</tt> QInputDialog$InputDialogOption values set.</brief>
*/

        public static InputDialogOptions createQFlags(InputDialogOption ... values) {
            return new InputDialogOptions(values);
        }
/**
<brief>Returns the QInputDialog$InputDialogOption constant with the specified <tt>int</tt>.</brief>
*/

        public static InputDialogOption resolve(int value) {
            return (InputDialogOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return NoButtons;
            case 2: return UseListViewForComboBoxItems;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class InputDialogOptions extends com.trolltech.qt.QFlags<InputDialogOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QInputDialog-InputDialogOptions with the specified <tt>com.trolltech.qt.gui.QInputDialog.InputDialogOption[]</tt>. flags set.</brief>
*/

        public InputDialogOptions(InputDialogOption ... args) { super(args); }
        public InputDialogOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Double(named: value)&gt;:<p> This signal is emitted whenever the double value changes in the dialog. The current value is specified by <tt>value</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    public final Signal1<java.lang.Double> doubleValueChanged = new Signal1<java.lang.Double>();

    private final void doubleValueChanged(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doubleValueChanged_double(nativeId(), value);
    }
    native void __qt_doubleValueChanged_double(long __this__nativeId, double value);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Double(named: value)&gt;:<p> This signal is emitted whenever the user selects a double value by accepting the dialog; for example, by clicking the <b>OK</b> button. The selected value is specified by <tt>value</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    public final Signal1<java.lang.Double> doubleValueSelected = new Signal1<java.lang.Double>();

    private final void doubleValueSelected(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doubleValueSelected_double(nativeId(), value);
    }
    native void __qt_doubleValueSelected_double(long __this__nativeId, double value);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: value)&gt;:<p> This signal is emitted whenever the integer value changes in the dialog. The current value is specified by <tt>value</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    public final Signal1<java.lang.Integer> intValueChanged = new Signal1<java.lang.Integer>();

    private final void intValueChanged(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_intValueChanged_int(nativeId(), value);
    }
    native void __qt_intValueChanged_int(long __this__nativeId, int value);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: value)&gt;:<p> This signal is emitted whenever the user selects a integer value by accepting the dialog; for example, by clicking the <b>OK</b> button. The selected value is specified by <tt>value</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    public final Signal1<java.lang.Integer> intValueSelected = new Signal1<java.lang.Integer>();

    private final void intValueSelected(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_intValueSelected_int(nativeId(), value);
    }
    native void __qt_intValueSelected_int(long __this__nativeId, int value);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted whenever the text string changes in the dialog. The current string is specified by <tt>text</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    public final Signal1<java.lang.String> textValueChanged = new Signal1<java.lang.String>();

    private final void textValueChanged(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_textValueChanged_String(nativeId(), text);
    }
    native void __qt_textValueChanged_String(long __this__nativeId, java.lang.String text);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted whenever the user selects a text string by accepting the dialog; for example, by clicking the <b>OK</b> button. The selected string is specified by <tt>text</tt>. <p>This signal is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    public final Signal1<java.lang.String> textValueSelected = new Signal1<java.lang.String>();

    private final void textValueSelected(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_textValueSelected_String(nativeId(), text);
    }
    native void __qt_textValueSelected_String(long __this__nativeId, java.lang.String text);


/**
This is an overloaded method provided for convenience.
*/

    public QInputDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a new input dialog with the given <tt>parent</tt> and window <tt>flags</tt>.
*/

    public QInputDialog(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a new input dialog with the given <tt>parent</tt> and window <tt>flags</tt>.
*/

    public QInputDialog() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a new input dialog with the given <tt>parent</tt> and window <tt>flags</tt>.
*/

    public QInputDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QInputDialog_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QInputDialog_QWidget_WindowFlags(long parent, int flags);

/**
This property holds the text for the button used to cancel the dialog.
*/

    @QtBlockedSlot
    public final java.lang.String cancelButtonText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cancelButtonText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_cancelButtonText(long __this__nativeId);

/**
This property holds the items used in the combobox for the input dialog.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> comboBoxItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_comboBoxItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_comboBoxItems(long __this__nativeId);

/**
This property holds sets the percision of the double spinbox in decimals. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#setDecimals(int) QDoubleSpinBox::setDecimals()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int doubleDecimals()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleDecimals(nativeId());
    }
    @QtBlockedSlot
    native int __qt_doubleDecimals(long __this__nativeId);

/**
This property holds the maximum double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final double doubleMaximum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleMaximum(nativeId());
    }
    @QtBlockedSlot
    native double __qt_doubleMaximum(long __this__nativeId);

/**
This property holds the minimum double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final double doubleMinimum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleMinimum(nativeId());
    }
    @QtBlockedSlot
    native double __qt_doubleMinimum(long __this__nativeId);

/**
This property holds the current double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final double doubleValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleValue(nativeId());
    }
    @QtBlockedSlot
    native double __qt_doubleValue(long __this__nativeId);

/**
This property holds the mode used for input. This property help determines which widget is used for entering input into the dialog.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QInputDialog.InputMode inputMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QInputDialog.InputMode.resolve(__qt_inputMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_inputMode(long __this__nativeId);

/**
This property holds the maximum integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final int intMaximum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intMaximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_intMaximum(long __this__nativeId);

/**
This property holds the minimum integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final int intMinimum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intMinimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_intMinimum(long __this__nativeId);

/**
This property holds the step by which the integer value is increased and decreased. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final int intStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_intStep(long __this__nativeId);

/**
This property holds the current integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final int intValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intValue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_intValue(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean isComboBoxEditable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isComboBoxEditable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isComboBoxEditable(long __this__nativeId);

/**
This property holds the text to for the label to describe what needs to be input.
*/

    @QtBlockedSlot
    public final java.lang.String labelText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_labelText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_labelText(long __this__nativeId);

/**
This property holds the text for the button used to accept the entry in the dialog.
*/

    @QtBlockedSlot
    public final java.lang.String okButtonText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_okButtonText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_okButtonText(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void open()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_open(nativeId());
    }
    @QtBlockedSlot
    native void __qt_open(long __this__nativeId);

/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QInputDialog#testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QInputDialog.InputDialogOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QInputDialog.InputDialogOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);

/**
This property holds the text for the button used to cancel the dialog.
*/

    @QtBlockedSlot
    public final void setCancelButtonText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCancelButtonText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setCancelButtonText_String(long __this__nativeId, java.lang.String text);

/**

*/

    @QtBlockedSlot
    public final void setComboBoxEditable(boolean editable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setComboBoxEditable_boolean(nativeId(), editable);
    }
    @QtBlockedSlot
    native void __qt_setComboBoxEditable_boolean(long __this__nativeId, boolean editable);

/**
This property holds the items used in the combobox for the input dialog.
*/

    @QtBlockedSlot
    public final void setComboBoxItems(java.util.List<java.lang.String> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setComboBoxItems_List(nativeId(), items);
    }
    @QtBlockedSlot
    native void __qt_setComboBoxItems_List(long __this__nativeId, java.util.List<java.lang.String> items);

/**
This property holds sets the percision of the double spinbox in decimals. <p><DT><b>See also:</b><br><DD>{@link QDoubleSpinBox#setDecimals(int) QDoubleSpinBox::setDecimals()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDoubleDecimals(int decimals)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleDecimals_int(nativeId(), decimals);
    }
    @QtBlockedSlot
    native void __qt_setDoubleDecimals_int(long __this__nativeId, int decimals);

/**
This property holds the maximum double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final void setDoubleMaximum(double max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleMaximum_double(nativeId(), max);
    }
    @QtBlockedSlot
    native void __qt_setDoubleMaximum_double(long __this__nativeId, double max);

/**
This property holds the minimum double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final void setDoubleMinimum(double min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleMinimum_double(nativeId(), min);
    }
    @QtBlockedSlot
    native void __qt_setDoubleMinimum_double(long __this__nativeId, double min);

/**
Sets the range of double precision floating point values accepted by the dialog when used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode, with minimum and maximum values specified by <tt>min</tt> and <tt>max</tt> respectively.
*/

    @QtBlockedSlot
    public final void setDoubleRange(double min, double max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleRange_double_double(nativeId(), min, max);
    }
    @QtBlockedSlot
    native void __qt_setDoubleRange_double_double(long __this__nativeId, double min, double max);

/**
This property holds the current double precision floating point value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode DoubleInput } mode.
*/

    @QtBlockedSlot
    public final void setDoubleValue(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleValue_double(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setDoubleValue_double(long __this__nativeId, double value);

/**
This property holds the mode used for input. This property help determines which widget is used for entering input into the dialog.
*/

    @QtBlockedSlot
    public final void setInputMode(com.trolltech.qt.gui.QInputDialog.InputMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInputMode_InputMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setInputMode_InputMode(long __this__nativeId, int mode);

/**
This property holds the maximum integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final void setIntMaximum(int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntMaximum_int(nativeId(), max);
    }
    @QtBlockedSlot
    native void __qt_setIntMaximum_int(long __this__nativeId, int max);

/**
This property holds the minimum integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final void setIntMinimum(int min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntMinimum_int(nativeId(), min);
    }
    @QtBlockedSlot
    native void __qt_setIntMinimum_int(long __this__nativeId, int min);

/**
Sets the range of integer values accepted by the dialog when used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode, with minimum and maximum values specified by <tt>min</tt> and <tt>max</tt> respectively.
*/

    @QtBlockedSlot
    public final void setIntRange(int min, int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntRange_int_int(nativeId(), min, max);
    }
    @QtBlockedSlot
    native void __qt_setIntRange_int_int(long __this__nativeId, int min, int max);

/**
This property holds the step by which the integer value is increased and decreased. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final void setIntStep(int step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntStep_int(nativeId(), step);
    }
    @QtBlockedSlot
    native void __qt_setIntStep_int(long __this__nativeId, int step);

/**
This property holds the current integer value accepted as input. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode IntInput } mode.
*/

    @QtBlockedSlot
    public final void setIntValue(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntValue_int(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setIntValue_int(long __this__nativeId, int value);

/**
This property holds the text to for the label to describe what needs to be input.
*/

    @QtBlockedSlot
    public final void setLabelText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLabelText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setLabelText_String(long __this__nativeId, java.lang.String text);

/**
This property holds the text for the button used to accept the entry in the dialog.
*/

    @QtBlockedSlot
    public final void setOkButtonText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOkButtonText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setOkButtonText_String(long __this__nativeId, java.lang.String text);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QInputDialog#options() options}, and {@link com.trolltech.qt.gui.QInputDialog#testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QInputDialog#options() options}, and {@link com.trolltech.qt.gui.QInputDialog#testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_InputDialogOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_InputDialogOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QInputDialog.InputDialogOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QInputDialog.InputDialogOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QInputDialog#testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QInputDialog.InputDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_InputDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_InputDialogOptions(long __this__nativeId, int options);

/**
This property holds the echo mode for the text value. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    @QtBlockedSlot
    public final void setTextEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextEchoMode_EchoMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setTextEchoMode_EchoMode(long __this__nativeId, int mode);

/**
This property holds the text value for the input dialog. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    @QtBlockedSlot
    public final void setTextValue(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextValue_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setTextValue_String(long __this__nativeId, java.lang.String text);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QInputDialog#options() options}, and {@link com.trolltech.qt.gui.QInputDialog#setOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QInputDialog.InputDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_InputDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_InputDialogOption(long __this__nativeId, int option);

/**
This property holds the echo mode for the text value. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineEdit.EchoMode textEchoMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLineEdit.EchoMode.resolve(__qt_textEchoMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textEchoMode(long __this__nativeId);

/**
This property holds the text value for the input dialog. This property is only relevant when the input dialog is used in {@link com.trolltech.qt.gui.QInputDialog.InputMode TextInput } mode.
*/

    @QtBlockedSlot
    public final java.lang.String textValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_textValue(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void done(int result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), result);
    }
    @QtBlockedSlot
    native void __qt_done_int(long __this__nativeId, int result);

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
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

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


    private static double getDouble_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return com.trolltech.qt.gui.QInputDialog.getDouble_internal(parent, title, label, value, minValue, maxValue, decimals, ok, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }
    private static double getDouble_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        return __qt_getDouble_internal_QWidget_String_String_double_double_double_int_nativepointer_WindowFlags(parent == null ? 0 : parent.nativeId(), title, label, value, minValue, maxValue, decimals, ok, flags.value());
    }
    native static double __qt_getDouble_internal_QWidget_String_String_double_double_double_int_nativepointer_WindowFlags(long parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals, com.trolltech.qt.QNativePointer ok, int flags);


    private static int getInt_private(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return com.trolltech.qt.gui.QInputDialog.getInt_private(parent, title, label, value, minValue, maxValue, step, ok, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }
    private static int getInt_private(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        return __qt_getInt_private_QWidget_String_String_int_int_int_int_nativepointer_WindowFlags(parent == null ? 0 : parent.nativeId(), title, label, value, minValue, maxValue, step, ok, flags.value());
    }
    native static int __qt_getInt_private_QWidget_String_String_int_int_int_int_nativepointer_WindowFlags(long parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, int flags);


    private static int getInteger_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return com.trolltech.qt.gui.QInputDialog.getInteger_internal(parent, title, label, value, minValue, maxValue, step, ok, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }
    private static int getInteger_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        return __qt_getInteger_internal_QWidget_String_String_int_int_int_int_nativepointer_WindowFlags(parent == null ? 0 : parent.nativeId(), title, label, value, minValue, maxValue, step, ok, flags.value());
    }
    native static int __qt_getInteger_internal_QWidget_String_String_int_int_int_int_nativepointer_WindowFlags(long parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.QNativePointer ok, int flags);


    private static java.lang.String getItem_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> items, int current, boolean editable, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return com.trolltech.qt.gui.QInputDialog.getItem_internal(parent, title, label, items, current, editable, ok, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }
    private static java.lang.String getItem_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> items, int current, boolean editable, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        return __qt_getItem_internal_QWidget_String_String_List_int_boolean_nativepointer_WindowFlags(parent == null ? 0 : parent.nativeId(), title, label, items, current, editable, ok, flags.value());
    }
    native static java.lang.String __qt_getItem_internal_QWidget_String_String_List_int_boolean_nativepointer_WindowFlags(long parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> items, int current, boolean editable, com.trolltech.qt.QNativePointer ok, int flags);


    private static java.lang.String getText_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo, java.lang.String text, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return com.trolltech.qt.gui.QInputDialog.getText_internal(parent, title, label, echo, text, ok, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }
    private static java.lang.String getText_internal(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo, java.lang.String text, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        return __qt_getText_internal_QWidget_String_String_EchoMode_String_nativepointer_WindowFlags(parent == null ? 0 : parent.nativeId(), title, label, echo.value(), text, ok, flags.value());
    }
    native static java.lang.String __qt_getText_internal_QWidget_String_String_EchoMode_String_nativepointer_WindowFlags(long parent, java.lang.String title, java.lang.String label, int echo, java.lang.String text, com.trolltech.qt.QNativePointer ok, int flags);

/**
@exclude
*/

    public static native QInputDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QInputDialog(QPrivateConstructor p) { super(p); } 

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label, int value, int min, int max, int step, com.trolltech.qt.core.Qt.WindowFlags flags)
    {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);

        int result = getInt_private(parent, title, label, value, min, max, step, ok, flags);

        return ok.booleanValue() ? result : null;

    }

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label, int value, int min, int max, int step, com.trolltech.qt.core.Qt.WindowType[] f)
    {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);

        int result = getInt_private(parent, title, label, value, min, max, step, ok, f);

        return ok.booleanValue() ? result : null;
    }

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label, int value, int min, int max, int step)
    {
        return getInt(parent, title, label, value, min, max, step, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label, int value, int min, int max)
    {
        return getInt(parent, title, label, value, min, max, 1);
    }

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label, int value)
    {
        return getInt(parent, title, label, value, (int) -2147483647, (int) 2147483647);
    }

/**

*/

    public static final Integer getInt(QWidget parent, String title, String label)
    {
        return getInt(parent, title, label, 0);
    }


    // TEMPLATE - gui.inputDialog_get_input - START
/**
Static convenience function to get a floating point number from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>value</tt> is the default floating point number that the line edit will be set to. <tt>minValue</tt> and <tt>maxValue</tt> are the minimum and maximum values the user may choose, and <tt>decimals</tt> is the maximum number of decimal places the number may have. <p>If <tt>ok</tt> is non-null, *<tt>ok</tt> will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the floating point number which has been entered by the user. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    double d = QInputDialog::getDouble(this, tr("QInputDialog::getDouble()"),
                                       tr("Amount:"), 37.56, -10000, 10000, 2, &ok);
    if (ok)
        doubleLabel-&gt;setText(QString("$%1").arg(d));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals, com.trolltech.qt.core.Qt.WindowFlags f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        Double result = getDouble_internal(parent, title, label, value, minValue, maxValue, decimals, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
Static convenience function to get a floating point number from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>value</tt> is the default floating point number that the line edit will be set to. <tt>minValue</tt> and <tt>maxValue</tt> are the minimum and maximum values the user may choose, and <tt>decimals</tt> is the maximum number of decimal places the number may have. <p>If <tt>ok</tt> is non-null, *<tt>ok</tt> will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the floating point number which has been entered by the user. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    double d = QInputDialog::getDouble(this, tr("QInputDialog::getDouble()"),
                                       tr("Amount:"), 37.56, -10000, 10000, 2, &ok);
    if (ok)
        doubleLabel-&gt;setText(QString("$%1").arg(d));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals, com.trolltech.qt.core.Qt.WindowType ... f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        Double result = getDouble_internal(parent, title, label, value, minValue, maxValue, decimals, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue, int decimals) {
        return getDouble(parent, title, label, value, minValue, maxValue, decimals, com.trolltech.qt.core.Qt.WindowType.Widget);
    }

    // TEMPLATE - gui.inputDialog_get_input - END

/**
This is a overloaded function provided for convenience.
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue, double maxValue) {
        return getDouble(parent, title, label, value, minValue, maxValue, 1);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value, double minValue) {
        return getDouble(parent, title, label, value, minValue, (double)2147483647);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, double value) {
        return getDouble(parent, title, label, value, (double)-2147483647);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Double getDouble(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label) {
        return getDouble(parent, title, label, 0.0);
    }


    // TEMPLATE - gui.inputDialog_get_input - START
/**
Static convenience function to get an integer input from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>value</tt> is the default integer which the spinbox will be set to. <tt>minValue</tt> and <tt>maxValue</tt> are the minimum and maximum values the user may choose, and <tt>step</tt> is the amount by which the values change as the user presses the arrow buttons to increment or decrement the value. <p>If <tt>ok</tt> is non-null *<tt>ok</tt> will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the integer which has been entered by the user. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    int i = QInputDialog::getInteger(this, tr("QInputDialog::getInteger()"),
                                     tr("Percentage:"), 25, 0, 100, 1, &ok);
    if (ok)
        integerLabel-&gt;setText(tr("%1%").arg(i));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.core.Qt.WindowFlags f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        Integer result = getInteger_internal(parent, title, label, value, minValue, maxValue, step, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
Static convenience function to get an integer input from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>value</tt> is the default integer which the spinbox will be set to. <tt>minValue</tt> and <tt>maxValue</tt> are the minimum and maximum values the user may choose, and <tt>step</tt> is the amount by which the values change as the user presses the arrow buttons to increment or decrement the value. <p>If <tt>ok</tt> is non-null *<tt>ok</tt> will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the integer which has been entered by the user. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    int i = QInputDialog::getInteger(this, tr("QInputDialog::getInteger()"),
                                     tr("Percentage:"), 25, 0, 100, 1, &ok);
    if (ok)
        integerLabel-&gt;setText(tr("%1%").arg(i));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step, com.trolltech.qt.core.Qt.WindowType ... f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        Integer result = getInteger_internal(parent, title, label, value, minValue, maxValue, step, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue, int step) {
        return getInteger(parent, title, label, value, minValue, maxValue, step, com.trolltech.qt.core.Qt.WindowType.Widget);
    }

    // TEMPLATE - gui.inputDialog_get_input - END

/**
This is a overloaded function provided for convenience.
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue, int maxValue) {
        return getInteger(parent, title, label, value, minValue, maxValue, 1);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value, int minValue) {
        return getInteger(parent, title, label, value, minValue, (int)2147483647);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, int value) {
        return getInteger(parent, title, label, value, (int)-2147483647);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static Integer getInteger(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label) {
        return getInteger(parent, title, label, 0);
    }


    // TEMPLATE - gui.inputDialog_get_input - START
/**
Static convenience function to let the user select an item from a string list. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>list</tt> is the string list which is inserted into the combobox, and <tt>current</tt> is the number of the item which should be the current item. If <tt>editable</tt> is true the user can enter their own text; if <tt>editable</tt> is false the user may only select one of the existing items. <p>If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text of the current item, or if <tt>editable</tt> is true, the current text of the combobox. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QStringList items;
    items &lt;&lt; tr("Spring") &lt;&lt; tr("Summer") &lt;&lt; tr("Fall") &lt;&lt; tr("Winter");

    bool ok;
    QString item = QInputDialog::getItem(this, tr("QInputDialog::getItem()"),
                                         tr("Season:"), items, 0, false, &ok);
    if (ok && !item.isEmpty())
        itemLabel-&gt;setText(item);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, and {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}. <br></DD></DT>
*/

    public static String getItem(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> list, int current, boolean editable, com.trolltech.qt.core.Qt.WindowFlags f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        String result = getItem_internal(parent, title, label, list, current, editable, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
Static convenience function to let the user select an item from a string list. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>list</tt> is the string list which is inserted into the combobox, and <tt>current</tt> is the number of the item which should be the current item. If <tt>editable</tt> is true the user can enter their own text; if <tt>editable</tt> is false the user may only select one of the existing items. <p>If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text of the current item, or if <tt>editable</tt> is true, the current text of the combobox. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QStringList items;
    items &lt;&lt; tr("Spring") &lt;&lt; tr("Summer") &lt;&lt; tr("Fall") &lt;&lt; tr("Winter");

    bool ok;
    QString item = QInputDialog::getItem(this, tr("QInputDialog::getItem()"),
                                         tr("Season:"), items, 0, false, &ok);
    if (ok && !item.isEmpty())
        itemLabel-&gt;setText(item);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getText(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QLineEdit.EchoMode, java.lang.String, com.trolltech.qt.core.Qt.WindowFlags) getText()}, {@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, and {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}. <br></DD></DT>
*/

    public static String getItem(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> list, int current, boolean editable, com.trolltech.qt.core.Qt.WindowType ... f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        String result = getItem_internal(parent, title, label, list, current, editable, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
This is a overloaded function provided for convenience.
*/

    public static String getItem(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> list, int current, boolean editable) {
        return getItem(parent, title, label, list, current, editable, com.trolltech.qt.core.Qt.WindowType.Widget);
    }

    // TEMPLATE - gui.inputDialog_get_input - END

/**
This is a overloaded function provided for convenience.
*/

    public static java.lang.String getItem(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> list, int current) {
        return getItem(parent, title, label, list, current, true);
    }

/**
This is a overloaded function provided for convenience.
*/

    public static java.lang.String getItem(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, java.util.List<java.lang.String> list) {
        return getItem(parent, title, label, list, 0);
    }


    // TEMPLATE - gui.inputDialog_get_input - START
/**
Static convenience function to get a string from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>text</tt> is the default text which is placed in the line edit. The <tt>mode</tt> is the echo mode the line edit will use. If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text which has been entered in the line edit. It will not return an empty string. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    QString text = QInputDialog::getText(this, tr("QInputDialog::getText()"),
                                         tr("User name:"), QLineEdit::Normal,
                                         QDir::home().dirName(), &ok);
    if (ok && !text.isEmpty())
        textLabel-&gt;setText(text);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static String getText(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo, java.lang.String text, com.trolltech.qt.core.Qt.WindowFlags f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        String result = getText_internal(parent, title, label, echo, text, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
Static convenience function to get a string from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>text</tt> is the default text which is placed in the line edit. The <tt>mode</tt> is the echo mode the line edit will use. If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text which has been entered in the line edit. It will not return an empty string. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    QString text = QInputDialog::getText(this, tr("QInputDialog::getText()"),
                                         tr("User name:"), QLineEdit::Normal,
                                         QDir::home().dirName(), &ok);
    if (ok && !text.isEmpty())
        textLabel-&gt;setText(text);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static String getText(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo, java.lang.String text, com.trolltech.qt.core.Qt.WindowType ... f) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        String result = getText_internal(parent, title, label, echo, text, ok, f);
        return ok.booleanValue() ? result : null;
    }

/**
Static convenience function to get a string from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>text</tt> is the default text which is placed in the line edit. The <tt>mode</tt> is the echo mode the line edit will use. If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text which has been entered in the line edit. It will not return an empty string. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    QString text = QInputDialog::getText(this, tr("QInputDialog::getText()"),
                                         tr("User name:"), QLineEdit::Normal,
                                         QDir::home().dirName(), &ok);
    if (ok && !text.isEmpty())
        textLabel-&gt;setText(text);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static String getText(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo, java.lang.String text) {
        return getText(parent, title, label, echo, text, com.trolltech.qt.core.Qt.WindowType.Widget);
    }

    // TEMPLATE - gui.inputDialog_get_input - END

/**
Static convenience function to get a string from the user. <tt>title</tt> is the text which is displayed in the title bar of the dialog. <tt>label</tt> is the text which is shown to the user (it should say what should be entered). <tt>text</tt> is the default text which is placed in the line edit. The <tt>mode</tt> is the echo mode the line edit will use. If <tt>ok</tt> is non-null *a ok will be set to true if the user pressed <b>OK</b> and to false if the user pressed <b>Cancel</b>. The dialog's parent is <tt>parent</tt>. The dialog will be modal and uses the widget flags <tt>f</tt>. <p>This function returns the text which has been entered in the line edit. It will not return an empty string. <p>Use this static function like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    bool ok;
    QString text = QInputDialog::getText(this, tr("QInputDialog::getText()"),
                                         tr("User name:"), QLineEdit::Normal,
                                         QDir::home().dirName(), &ok);
    if (ok && !text.isEmpty())
        textLabel-&gt;setText(text);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputDialog#getInteger(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, int, int, int, int, com.trolltech.qt.core.Qt.WindowFlags) getInteger()}, {@link com.trolltech.qt.gui.QInputDialog#getDouble(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, double, double, double, int, com.trolltech.qt.core.Qt.WindowFlags) getDouble()}, and {@link com.trolltech.qt.gui.QInputDialog#getItem(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, java.util.List, int, boolean, com.trolltech.qt.core.Qt.WindowFlags) getItem()}. <br></DD></DT>
*/

    public static java.lang.String getText(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label, com.trolltech.qt.gui.QLineEdit.EchoMode echo) {
        return getText(parent, title, label, echo, "");
    }

/**
This is a overloaded function provided for convenience.
*/

    public static java.lang.String getText(com.trolltech.qt.gui.QWidget parent, java.lang.String title, java.lang.String label) {
        return getText(parent, title, label, com.trolltech.qt.gui.QLineEdit.EchoMode.Normal);
    }

}
