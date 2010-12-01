package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractSpinBox class provides a spinbox and a line edit to display values. The class is designed as a common super class for widgets like {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox} and {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit} <p>Here are the main properties of the class: <ol><li> {@link QAbstractSpinBox#text() text}: The text that is displayed in the QAbstractSpinBox.</li><li> {@link QAbstractSpinBox#alignment() alignment}: The alignment of the text in the QAbstractSpinBox.</li><li> {@link QAbstractSpinBox#wrapping() wrapping}: Whether the QAbstractSpinBox wraps from the minimum value to the maximum value and vica versa.</li></ol> QAbstractSpinBox provides a virtual {@link com.trolltech.qt.gui.QAbstractSpinBox#stepBy(int) stepBy()} function that is called whenever the user triggers a step. This function takes an integer value to signify how many steps were taken. E.g. Pressing {@link com.trolltech.qt.core.Qt.Key Qt::Key_Down } will trigger a call to stepBy(-1). <p>QAbstractSpinBox also provide a virtual function {@link com.trolltech.qt.gui.QAbstractSpinBox#stepEnabled() stepEnabled()} to determine whether stepping up/down is allowed at any point. This function returns a bitset of StepEnabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox}, {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}, and {@link <a href="../qtjambi-spinboxes.html">Spin Boxes Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAbstractSpinBox extends com.trolltech.qt.gui.QWidget
{
    @QtBlockedEnum
    public enum StepEnabledFlag implements com.trolltech.qt.QtEnumerator {
/**

*/

        StepNone(0),
/**

*/

        StepUpEnabled(1),
/**

*/

        StepDownEnabled(2);

        StepEnabledFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QAbstractSpinBox$StepEnabled with the specified <tt>com.trolltech.qt.gui.QAbstractSpinBox$StepEnabledFlag[]</tt> QAbstractSpinBox$StepEnabledFlag values set.</brief>
*/

        public static StepEnabled createQFlags(StepEnabledFlag ... values) {
            return new StepEnabled(values);
        }
/**
<brief>Returns the QAbstractSpinBox$StepEnabledFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static StepEnabledFlag resolve(int value) {
            return (StepEnabledFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StepNone;
            case 1: return StepUpEnabled;
            case 2: return StepDownEnabled;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class StepEnabled extends com.trolltech.qt.QFlags<StepEnabledFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAbstractSpinBox-StepEnabled with the specified <tt>com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag[]</tt>. flags set.</brief>
*/

        public StepEnabled(StepEnabledFlag ... args) { super(args); }
        public StepEnabled(int value) { setValue(value); }
    }
/**
This enum type describes the mode the spinbox will use to correct an {@link com.trolltech.qt.gui.QValidator.State Intermediate } value if editing finishes. <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#correctionMode() correctionMode}. <br></DD></DT>
*/


    public enum CorrectionMode implements com.trolltech.qt.QtEnumerator {
/**
 The spinbox will revert to the last valid value.
*/

        CorrectToPreviousValue(0),
/**
 The spinbox will revert to the nearest valid value.
*/

        CorrectToNearestValue(1);

        CorrectionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSpinBox$CorrectionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CorrectionMode resolve(int value) {
            return (CorrectionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CorrectToPreviousValue;
            case 1: return CorrectToNearestValue;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type describes the symbols that can be displayed on the buttons in a spin box. <p> <br><center><img src="../images/qspinbox-updown.png"></center><br> <br><center><img src="../images/qspinbox-plusminus.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#buttonSymbols() QAbstractSpinBox::buttonSymbols}. <br></DD></DT>
*/

    public enum ButtonSymbols implements com.trolltech.qt.QtEnumerator {
/**
 Little arrows in the classic style.
*/

        UpDownArrows(0),
/**
 <b>+</b> and <b>-</b> symbols.
*/

        PlusMinus(1),
/**
 Don't display buttons.
*/

        NoButtons(2);

        ButtonSymbols(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSpinBox$ButtonSymbols constant with the specified <tt>int</tt>.</brief>
*/

        public static ButtonSymbols resolve(int value) {
            return (ButtonSymbols) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UpDownArrows;
            case 1: return PlusMinus;
            case 2: return NoButtons;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted editing is finished. This happens when the spinbox loses focus and when enter is pressed.
*/

    public final Signal0 editingFinished = new Signal0();

    private final void editingFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editingFinished(nativeId());
    }
    native void __qt_editingFinished(long __this__nativeId);


/**
Constructs an abstract spinbox with the given <tt>parent</tt> with default {@link QAbstractSpinBox#wrapping() wrapping}, and {@link QAbstractSpinBox#alignment() alignment} properties.
*/

    public QAbstractSpinBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an abstract spinbox with the given <tt>parent</tt> with default {@link QAbstractSpinBox#wrapping() wrapping}, and {@link QAbstractSpinBox#alignment() alignment} properties.
*/

    public QAbstractSpinBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractSpinBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractSpinBox_QWidget(long parent);

/**
This property holds the alignment of the spin box. Possible Values are {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter }. <p>By default, the alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } <p>Attempting to set the alignment to an illegal flag combination does nothing. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
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
This property holds the current button symbol mode. The possible values can be either <tt>UpDownArrows</tt> or <tt>PlusMinus</tt>. The default is <tt>UpDownArrows</tt>. <p>Note that some styles might render {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols PlusMinus } and {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols UpDownArrows } identically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols ButtonSymbols }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="buttonSymbols")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols buttonSymbols()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols.resolve(__qt_buttonSymbols(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttonSymbols(long __this__nativeId);

/**
This property holds the mode to correct an {@link com.trolltech.qt.gui.QValidator.State Intermediate } value if editing finishes. The default mode is {@link com.trolltech.qt.gui.QAbstractSpinBox.CorrectionMode QAbstractSpinBox::CorrectToPreviousValue }. <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#hasAcceptableInput() acceptableInput}, {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#fixup(java.lang.String) fixup()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="correctionMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractSpinBox.CorrectionMode correctionMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractSpinBox.CorrectionMode.resolve(__qt_correctionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_correctionMode(long __this__nativeId);

/**
This property holds whether the input satisfies the current validation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}, {@link com.trolltech.qt.gui.QAbstractSpinBox#fixup(java.lang.String) fixup()}, and {@link QAbstractSpinBox#correctionMode() correctionMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="acceptableInput")
    @QtBlockedSlot
    public final boolean hasAcceptableInput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAcceptableInput(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAcceptableInput(long __this__nativeId);

/**
This property holds whether the spin box draws itself with a frame. If enabled (the default) the spin box draws itself inside a frame, otherwise the spin box draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyReader(name="frame")
    @QtBlockedSlot
    public final boolean hasFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFrame(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFrame(long __this__nativeId);

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
This function interprets the text of the spin box. If the value has changed since last interpretation it will emit signals.
*/

    @QtBlockedSlot
    public final void interpretText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_interpretText(nativeId());
    }
    @QtBlockedSlot
    native void __qt_interpretText(long __this__nativeId);

/**
This property holds whether the spin box will accelerate the frequency of the steps when pressing the step Up/Down buttons.  If enabled the spin box will increase/decrease the value faster the longer you hold the button down.
*/

    @com.trolltech.qt.QtPropertyReader(name="accelerated")
    @QtBlockedSlot
    public final boolean isAccelerated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAccelerated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAccelerated(long __this__nativeId);

/**
This property holds whether the spin box is read only.  In read-only mode, the user can still copy the text to the clipboard, or drag and drop the text; but cannot edit it. <p>The {@link com.trolltech.qt.gui.QLineEdit QLineEdit} in the QAbstractSpinBox does not show a cursor in read-only mode. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#isReadOnly() QLineEdit::readOnly}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="readOnly")
    @QtBlockedSlot
    public final boolean isReadOnly()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
This property holds whether keyboard tracking is enabled for the spinbox.  If keyboard tracking is enabled (the default), the spinbox emits the valueChanged() signal while the new value is being entered from the keyboard. <p>E.g. when the user enters the value 600 by typing 6, 0, and 0, the spinbox emits 3 signals with the values 6, 60, and 600 respectively. <p>If keyboard tracking is disabled, the spinbox doesn't emit the valueChanged() signal while typing. It emits the signal later, when the return key is pressed, when keyboard focus is lost, or when other spinbox functionality is used, e.g. pressing an arrow key.
*/

    @com.trolltech.qt.QtPropertyReader(name="keyboardTracking")
    @QtBlockedSlot
    public final boolean keyboardTracking()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keyboardTracking(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_keyboardTracking(long __this__nativeId);

/**
This function returns a pointer to the line edit of the spin box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox#setLineEdit(com.trolltech.qt.gui.QLineEdit) setLineEdit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QLineEdit lineEdit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineEdit(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineEdit __qt_lineEdit(long __this__nativeId);

/**
Selects all the text in the spinbox except the prefix and suffix.
*/

    public final void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

/**
This property holds whether the spin box will accelerate the frequency of the steps when pressing the step Up/Down buttons.  If enabled the spin box will increase/decrease the value faster the longer you hold the button down.
*/

    @com.trolltech.qt.QtPropertyWriter(name="accelerated")
    @QtBlockedSlot
    public final void setAccelerated(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccelerated_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setAccelerated_boolean(long __this__nativeId, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... flag) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(flag));
    }
/**
This property holds the alignment of the spin box. Possible Values are {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter }. <p>By default, the alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } <p>Attempting to set the alignment to an illegal flag combination does nothing. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment flag)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), flag.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int flag);

/**
This property holds the current button symbol mode. The possible values can be either <tt>UpDownArrows</tt> or <tt>PlusMinus</tt>. The default is <tt>UpDownArrows</tt>. <p>Note that some styles might render {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols PlusMinus } and {@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols UpDownArrows } identically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols ButtonSymbols }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="buttonSymbols")
    @QtBlockedSlot
    public final void setButtonSymbols(com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols bs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonSymbols_ButtonSymbols(nativeId(), bs.value());
    }
    @QtBlockedSlot
    native void __qt_setButtonSymbols_ButtonSymbols(long __this__nativeId, int bs);

/**
This property holds the mode to correct an {@link com.trolltech.qt.gui.QValidator.State Intermediate } value if editing finishes. The default mode is {@link com.trolltech.qt.gui.QAbstractSpinBox.CorrectionMode QAbstractSpinBox::CorrectToPreviousValue }. <p><DT><b>See also:</b><br><DD>{@link QAbstractSpinBox#hasAcceptableInput() acceptableInput}, {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#fixup(java.lang.String) fixup()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="correctionMode")
    @QtBlockedSlot
    public final void setCorrectionMode(com.trolltech.qt.gui.QAbstractSpinBox.CorrectionMode cm)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCorrectionMode_CorrectionMode(nativeId(), cm.value());
    }
    @QtBlockedSlot
    native void __qt_setCorrectionMode_CorrectionMode(long __this__nativeId, int cm);

/**
This property holds whether the spin box draws itself with a frame. If enabled (the default) the spin box draws itself inside a frame, otherwise the spin box draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyWriter(name="frame")
    @QtBlockedSlot
    public final void setFrame(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrame_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFrame_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether keyboard tracking is enabled for the spinbox.  If keyboard tracking is enabled (the default), the spinbox emits the valueChanged() signal while the new value is being entered from the keyboard. <p>E.g. when the user enters the value 600 by typing 6, 0, and 0, the spinbox emits 3 signals with the values 6, 60, and 600 respectively. <p>If keyboard tracking is disabled, the spinbox doesn't emit the valueChanged() signal while typing. It emits the signal later, when the return key is pressed, when keyboard focus is lost, or when other spinbox functionality is used, e.g. pressing an arrow key.
*/

    @com.trolltech.qt.QtPropertyWriter(name="keyboardTracking")
    @QtBlockedSlot
    public final void setKeyboardTracking(boolean kt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKeyboardTracking_boolean(nativeId(), kt);
    }
    @QtBlockedSlot
    native void __qt_setKeyboardTracking_boolean(long __this__nativeId, boolean kt);

/**
Sets the line edit of the spinbox to be <tt>lineEdit</tt> instead of the current line edit widget. <tt>lineEdit</tt> can not be 0. <p>QAbstractSpinBox takes ownership of the new lineEdit <p>If {@link com.trolltech.qt.gui.QLineEdit#validator() QLineEdit::validator()} for the <tt>lineEdit</tt> returns 0, the internal validator of the spinbox will be set on the line edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox#lineEdit() lineEdit()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    protected final void setLineEdit(com.trolltech.qt.gui.QLineEdit edit)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (edit == null)
            throw new NullPointerException("Argument 'edit': null not expected.");
        __qt_setLineEdit_QLineEdit(nativeId(), edit == null ? 0 : edit.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setLineEdit_QLineEdit(long __this__nativeId, long edit);

/**
This property holds whether the spin box is read only.  In read-only mode, the user can still copy the text to the clipboard, or drag and drop the text; but cannot edit it. <p>The {@link com.trolltech.qt.gui.QLineEdit QLineEdit} in the QAbstractSpinBox does not show a cursor in read-only mode. <p><DT><b>See also:</b><br><DD>{@link QLineEdit#isReadOnly() QLineEdit::readOnly}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="readOnly")
    @QtBlockedSlot
    public final void setReadOnly(boolean r)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), r);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean r);

/**
This property holds the special-value text. If set, the spin box will display this text instead of a numeric value whenever the current value is equal to minimum(). Typical use is to indicate that this choice has a special (default) meaning. <p>For example, if your spin box allows the user to choose a scale factor (or zoom level) for displaying an image, and your application is able to automatically choose one that will enable the image to fit completely within the display window, you can set up the spin box like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QSpinBox *zoomSpinBox = new QSpinBox;
    zoomSpinBox-&gt;setRange(0, 1000);
    zoomSpinBox-&gt;setSingleStep(10);
    zoomSpinBox-&gt;setSuffix("%");
    zoomSpinBox-&gt;setSpecialValueText(tr("Automatic"));
    zoomSpinBox-&gt;setValue(100);
 </pre> The user will then be able to choose a scale from 1% to 1000% or select "Auto" to leave it up to the application to choose. Your code must then interpret the spin box value of 0 as a request from the user to scale the image to fit inside the window. <p>All values are displayed with the prefix and suffix (if set), except for the special value, which only shows the special value text. This special text is passed in the {@link com.trolltech.qt.gui.QSpinBox#valueChanged QSpinBox::valueChanged() } signal that passes a QString. <p>To turn off the special-value text display, call this function with an empty string. The default is no special-value text, i.e. the numeric value is shown as usual. <p>If no special-value text is set, {@link com.trolltech.qt.gui.QAbstractSpinBox#specialValueText() specialValueText()} returns an empty string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="specialValueText")
    @QtBlockedSlot
    public final void setSpecialValueText(java.lang.String txt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpecialValueText_String(nativeId(), txt);
    }
    @QtBlockedSlot
    native void __qt_setSpecialValueText_String(long __this__nativeId, java.lang.String txt);

/**
This property holds whether the spin box is circular.  If wrapping is true stepping up from maximum() value will take you to the minimum() value and vica versa. Wrapping only make sense if you have minimum() and maximum() values set. <pre class="snippet">
        QSpinBox spinBox = new QSpinBox(this);
        spinBox.setRange(0, 100);
        spinBox.setWrapping(true);
        spinBox.setValue(100);
        spinBox.stepBy(1);
        // value is 0
</pre> <p><DT><b>See also:</b><br><DD>{@link QSpinBox#minimum() QSpinBox::minimum()}, and {@link QSpinBox#maximum() QSpinBox::maximum()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="wrapping")
    @QtBlockedSlot
    public final void setWrapping(boolean w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWrapping_boolean(nativeId(), w);
    }
    @QtBlockedSlot
    native void __qt_setWrapping_boolean(long __this__nativeId, boolean w);

/**
This property holds the special-value text. If set, the spin box will display this text instead of a numeric value whenever the current value is equal to minimum(). Typical use is to indicate that this choice has a special (default) meaning. <p>For example, if your spin box allows the user to choose a scale factor (or zoom level) for displaying an image, and your application is able to automatically choose one that will enable the image to fit completely within the display window, you can set up the spin box like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QSpinBox *zoomSpinBox = new QSpinBox;
    zoomSpinBox-&gt;setRange(0, 1000);
    zoomSpinBox-&gt;setSingleStep(10);
    zoomSpinBox-&gt;setSuffix("%");
    zoomSpinBox-&gt;setSpecialValueText(tr("Automatic"));
    zoomSpinBox-&gt;setValue(100);
 </pre> The user will then be able to choose a scale from 1% to 1000% or select "Auto" to leave it up to the application to choose. Your code must then interpret the spin box value of 0 as a request from the user to scale the image to fit inside the window. <p>All values are displayed with the prefix and suffix (if set), except for the special value, which only shows the special value text. This special text is passed in the {@link com.trolltech.qt.gui.QSpinBox#valueChanged QSpinBox::valueChanged() } signal that passes a QString. <p>To turn off the special-value text display, call this function with an empty string. The default is no special-value text, i.e. the numeric value is shown as usual. <p>If no special-value text is set, {@link com.trolltech.qt.gui.QAbstractSpinBox#specialValueText() specialValueText()} returns an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="specialValueText")
    @QtBlockedSlot
    public final java.lang.String specialValueText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_specialValueText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_specialValueText(long __this__nativeId);

/**
Steps down by one linestep Calling this slot is analogous to calling stepBy(-1); <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox#stepBy(int) stepBy()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#stepUp() stepUp()}. <br></DD></DT>
*/

    public final void stepDown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stepDown(nativeId());
    }
    native void __qt_stepDown(long __this__nativeId);

/**
Steps up by one linestep Calling this slot is analogous to calling stepBy(1); <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QAbstractSpinBox#stepBy(int) stepBy()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#stepDown() stepDown()}. <br></DD></DT>
*/

    public final void stepUp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stepUp(nativeId());
    }
    native void __qt_stepUp(long __this__nativeId);

/**
This property holds the spin box's text, including any prefix and suffix. There is no default text.
*/

    @com.trolltech.qt.QtPropertyReader(name="text")
    @QtBlockedSlot
    public final java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
This property holds whether the spin box is circular.  If wrapping is true stepping up from maximum() value will take you to the minimum() value and vica versa. Wrapping only make sense if you have minimum() and maximum() values set. <pre class="snippet">
        QSpinBox spinBox = new QSpinBox(this);
        spinBox.setRange(0, 100);
        spinBox.setWrapping(true);
        spinBox.setValue(100);
        spinBox.stepBy(1);
        // value is 0
</pre> <p><DT><b>See also:</b><br><DD>{@link QSpinBox#minimum() QSpinBox::minimum()}, and {@link QSpinBox#maximum() QSpinBox::maximum()}. <br></DD></DT>
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
    protected void changeEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long event);

/**
Clears the lineedit of all text but prefix and suffix.
*/

    public void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long event);

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
This virtual function is called by the QAbstractSpinBox if the <tt>input</tt> is not validated to {@link com.trolltech.qt.gui.QValidator.State QValidator::Acceptable } when Return is pressed or {@link com.trolltech.qt.gui.QAbstractSpinBox#interpretText() interpretText()} is called. It will try to change the text so it is valid. Reimplemented in the various subclasses.
*/

    @QtBlockedSlot
    public java.lang.String fixup(java.lang.String input)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixup_nativepointer(nativeId(), input);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fixup_nativepointer(long __this__nativeId, java.lang.String input);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long event);

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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long event);

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
Virtual function that is called whenever the user triggers a step. The <tt>steps</tt> parameter indicates how many steps were taken, e.g. Pressing {@link com.trolltech.qt.core.Qt.Key Qt::Key_Down } will trigger a call to stepBy(-1), whereas pressing {@link com.trolltech.qt.core.Qt.Key Qt::Key_Prior } will trigger a call to stepBy(10). <p>If you subclass QAbstractSpinBox you must reimplement this function. Note that this function is called even if the resulting value will be outside the bounds of minimum and maximum. It's this function's job to handle these situations.
*/

    @QtBlockedSlot
    public void stepBy(int steps)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stepBy_int(nativeId(), steps);
    }
    @QtBlockedSlot
    native void __qt_stepBy_int(long __this__nativeId, int steps);

/**
Virtual function that determines whether stepping up and down is legal at any given time. <p>The up arrow will be painted as disabled unless ({@link com.trolltech.qt.gui.QAbstractSpinBox#stepEnabled() stepEnabled()} & {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag StepUpEnabled }) != 0. <p>The default implementation will return ({@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag StepUpEnabled }| {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag StepDownEnabled }) if wrapping is turned on. Else it will return {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag StepDownEnabled } if value is &gt; minimum() or'ed with {@link com.trolltech.qt.gui.QAbstractSpinBox.StepEnabledFlag StepUpEnabled } if value &lt; maximum(). <p>If you subclass QAbstractSpinBox you will need to reimplement this function. <p><DT><b>See also:</b><br><DD>{@link QSpinBox#minimum() QSpinBox::minimum()}, {@link QSpinBox#maximum() QSpinBox::maximum()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#wrapping() wrapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled stepEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled(__qt_stepEnabled(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_stepEnabled(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long event);

/**
This virtual function is called by the QAbstractSpinBox to determine whether <tt>input</tt> is valid. The <tt>pos</tt> parameter indicates the position in the string. Reimplemented in the various subclasses.
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QAbstractSpinBox fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractSpinBox(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QSpinBox. This method
is useful for subclasses when they need a QStyleOptionSpinBox, but don't want
to fill in all the information themselves.
*/

    protected  void initStyleOption(QStyleOptionSpinBox option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
