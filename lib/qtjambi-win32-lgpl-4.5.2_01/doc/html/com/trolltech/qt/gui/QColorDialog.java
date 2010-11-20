package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QColorDialog class provides a dialog widget for specifying colors. The color dialog's function is to allow users to choose colors. For example, you might use this in a drawing program to allow the user to set the brush color. <p>The static functions provide modal color dialogs. <p>The static {@link com.trolltech.qt.gui.QColorDialog#getColor(com.trolltech.qt.gui.QColor) getColor()} function shows the dialog, and allows the user to specify a color. The getRgba() function does the same, but also allows the user to specify a color with an alpha channel (transparency) value. <p>The user can store {@link com.trolltech.qt.gui.QColorDialog#customCount() customCount()} different custom colors. The custom colors are shared by all color dialogs, and remembered during the execution of the program. Use {@link com.trolltech.qt.gui.QColorDialog#setCustomColor(int, int) setCustomColor()} to set the custom colors, and use {@link com.trolltech.qt.gui.QColorDialog#customColor(int) customColor()} to get them. <p>Additional widgets that allow users to pick colors are available as {@link <a href="../http-qtsoftware-com-products-appdev-add-on-products.html">Qt Solutions</a>}. <p>The {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs</a>} example shows how to use QColorDialog as well as other built-in Qt dialogs. <br><center><img src="../images/plastique-colordialog.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor QColor}, {@link com.trolltech.qt.gui.QFileDialog QFileDialog}, {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, {@link com.trolltech.qt.gui.QFontDialog QFontDialog}, and {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QColorDialog extends com.trolltech.qt.gui.QDialog
{
/**
This enum specifies various options that affect the look and feel of a color dialog. <p><DT><b>See also:</b><br><DD>{@link QColorDialog#options() options}, {@link com.trolltech.qt.gui.QColorDialog#setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) setOption()}, {@link com.trolltech.qt.gui.QColorDialog#testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) testOption()}, and windowModality(). <br></DD></DT>
*/

    public enum ColorDialogOption implements com.trolltech.qt.QtEnumerator {
/**
 Allow the user to select the alpha component of a color.
*/

        ShowAlphaChannel(1),
/**
 Don't display <b>OK</b> and <b>Cancel</b> buttons. (Useful for "live dialogs".)
*/

        NoButtons(2),
/**
 Use Qt's standard color dialog on the Mac instead of Apple's native color panel.
*/

        DontUseNativeDialog(4);

        ColorDialogOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QColorDialog$ColorDialogOptions with the specified <tt>com.trolltech.qt.gui.QColorDialog$ColorDialogOption[]</tt> QColorDialog$ColorDialogOption values set.</brief>
*/

        public static ColorDialogOptions createQFlags(ColorDialogOption ... values) {
            return new ColorDialogOptions(values);
        }
/**
<brief>Returns the QColorDialog$ColorDialogOption constant with the specified <tt>int</tt>.</brief>
*/

        public static ColorDialogOption resolve(int value) {
            return (ColorDialogOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ShowAlphaChannel;
            case 2: return NoButtons;
            case 4: return DontUseNativeDialog;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ColorDialogOptions extends com.trolltech.qt.QFlags<ColorDialogOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QColorDialog-ColorDialogOptions with the specified <tt>com.trolltech.qt.gui.QColorDialog.ColorDialogOption[]</tt>. flags set.</brief>
*/

        public ColorDialogOptions(ColorDialogOption ... args) { super(args); }
        public ColorDialogOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QColor(named: color)&gt;:<p> This signal is emitted just after the user has clicked <b>OK</b> to select a color to use. The chosen color is specified by <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-stylesheet-reference.html">color</a>}, and {@link com.trolltech.qt.gui.QColorDialog#currentColorChanged currentColorChanged() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QColor> colorSelected = new Signal1<com.trolltech.qt.gui.QColor>();

    private final void colorSelected(com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_colorSelected_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    native void __qt_colorSelected_QColor(long __this__nativeId, long color);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QColor(named: color)&gt;:<p> This signal is emitted whenever the current color changes in the dialog. The current color is specified by <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-stylesheet-reference.html">color</a>}, and {@link com.trolltech.qt.gui.QColorDialog#colorSelected colorSelected() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QColor> currentColorChanged = new Signal1<com.trolltech.qt.gui.QColor>();

    private final void currentColorChanged(com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentColorChanged_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    native void __qt_currentColorChanged_QColor(long __this__nativeId, long color);


/**
Constructs a color dialog with the given <tt>parent</tt>.
*/

    public QColorDialog() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a color dialog with the given <tt>parent</tt>.
*/

    public QColorDialog(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QColorDialog_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QColorDialog_QWidget(long parent);


/**
Constructs a color dialog with the given <tt>parent</tt> and specified <tt>initial</tt> color.
*/

    public QColorDialog(com.trolltech.qt.gui.QColor initial) {
        this(initial, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a color dialog with the given <tt>parent</tt> and specified <tt>initial</tt> color.
*/

    public QColorDialog(com.trolltech.qt.gui.QColor initial, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QColorDialog_QColor_QWidget(initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QColorDialog_QColor_QWidget(long initial, long parent);

/**
This property holds the currently selected color in the dialog.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentColor")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor currentColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_currentColor(long __this__nativeId);

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
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColorDialog#setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QColorDialog#testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColorDialog.ColorDialogOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QColorDialog.ColorDialogOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);

/**
Returns the color that the user selected by clicking the <b>OK</b> or equivalent button. <p><b>Note:</b> This color is not always the same as the color held by the {@link QColorDialog#currentColor() currentColor} property since the user can choose different colors before finally selecting the one to use.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor selectedColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_selectedColor(long __this__nativeId);

/**
This property holds the currently selected color in the dialog.
*/

    @QtBlockedSlot
    public final void setCurrentColor(com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentColor_QColor(long __this__nativeId, long color);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QColorDialog#options() options}, and {@link com.trolltech.qt.gui.QColorDialog#testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QColorDialog#options() options}, and {@link com.trolltech.qt.gui.QColorDialog#testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_ColorDialogOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_ColorDialogOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QColorDialog.ColorDialogOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QColorDialog.ColorDialogOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColorDialog#setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QColorDialog#testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QColorDialog.ColorDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_ColorDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_ColorDialogOptions(long __this__nativeId, int options);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QColorDialog#options() options}, and {@link com.trolltech.qt.gui.QColorDialog#setOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QColorDialog.ColorDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_ColorDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_ColorDialogOption(long __this__nativeId, int option);

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
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
Returns the custom color at the given <tt>index</tt> as a QRgb value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColorDialog#setCustomColor(int, int) setCustomColor()}. <br></DD></DT>
*/

    public native static int customColor(int index);

/**
Returns the number of custom colors supported by QColorDialog. All color dialogs share the same custom colors.
*/

    public native static int customCount();


/**
Pops up a modal color dialog, lets the user choose a color, and returns that color. The color is initially set to <tt>initial</tt>. The dialog is a child of <tt>parent</tt>. It returns an invalid (see {@link com.trolltech.qt.gui.QColor#isValid() QColor::isValid()}) color if the user cancels the dialog.
*/

    public static com.trolltech.qt.gui.QColor getColor(com.trolltech.qt.gui.QColor initial) {
        return getColor(initial, (com.trolltech.qt.gui.QWidget)null);
    }

/**
Pops up a modal color dialog, lets the user choose a color, and returns that color. The color is initially set to <tt>initial</tt>. The dialog is a child of <tt>parent</tt>. It returns an invalid (see {@link com.trolltech.qt.gui.QColor#isValid() QColor::isValid()}) color if the user cancels the dialog.
*/

    public static com.trolltech.qt.gui.QColor getColor() {
        return getColor((com.trolltech.qt.gui.QColor)com.trolltech.qt.gui.QColor.white, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Pops up a modal color dialog, lets the user choose a color, and returns that color. The color is initially set to <tt>initial</tt>. The dialog is a child of <tt>parent</tt>. It returns an invalid (see {@link com.trolltech.qt.gui.QColor#isValid() QColor::isValid()}) color if the user cancels the dialog.
*/

    public static com.trolltech.qt.gui.QColor getColor(com.trolltech.qt.gui.QColor initial, com.trolltech.qt.gui.QWidget parent)    {
        return __qt_getColor_QColor_QWidget(initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QColor __qt_getColor_QColor_QWidget(long initial, long parent);


/**
This is an overloaded method provided for convenience.
*/

    public static com.trolltech.qt.gui.QColor getColor(com.trolltech.qt.gui.QColor initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title, com.trolltech.qt.gui.QColorDialog.ColorDialogOption ... options) {
        return com.trolltech.qt.gui.QColorDialog.getColor(initial, parent, title, new com.trolltech.qt.gui.QColorDialog.ColorDialogOptions(options));
    }

/**
Pops up a modal color dialog with the given window <tt>title</tt> (or "Select Color" if none is specified), lets the user choose a color, and returns that color. The color is initially set to <tt>initial</tt>. The dialog is a child of <tt>parent</tt>. It returns an invalid (see {@link com.trolltech.qt.gui.QColor#isValid() QColor::isValid()}) color if the user cancels the dialog. <p>The <tt>options</tt> argument allows you to customize the dialog.
*/

    public static com.trolltech.qt.gui.QColor getColor(com.trolltech.qt.gui.QColor initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title) {
        return getColor(initial, parent, title, new com.trolltech.qt.gui.QColorDialog.ColorDialogOptions(0));
    }
/**
Pops up a modal color dialog with the given window <tt>title</tt> (or "Select Color" if none is specified), lets the user choose a color, and returns that color. The color is initially set to <tt>initial</tt>. The dialog is a child of <tt>parent</tt>. It returns an invalid (see {@link com.trolltech.qt.gui.QColor#isValid() QColor::isValid()}) color if the user cancels the dialog. <p>The <tt>options</tt> argument allows you to customize the dialog.
*/

    public static com.trolltech.qt.gui.QColor getColor(com.trolltech.qt.gui.QColor initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title, com.trolltech.qt.gui.QColorDialog.ColorDialogOptions options)    {
        return __qt_getColor_QColor_QWidget_String_ColorDialogOptions(initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId(), title, options.value());
    }
    native static com.trolltech.qt.gui.QColor __qt_getColor_QColor_QWidget_String_ColorDialogOptions(long initial, long parent, java.lang.String title, int options);

    private static int getRgba_internal(int rgba, com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QWidget parent)    {
        return __qt_getRgba_internal_int_nativepointer_QWidget(rgba, ok, parent == null ? 0 : parent.nativeId());
    }
    native static int __qt_getRgba_internal_int_nativepointer_QWidget(int rgba, com.trolltech.qt.QNativePointer ok, long parent);

/**
Sets the custom color at <tt>index</tt> to the QRgb<tt>color</tt> value. <p><b>Note:</b> This function does not apply to the Native Color Dialog on the Mac OS X platform. If you still require this function, use the {@link com.trolltech.qt.gui.QColorDialog.ColorDialogOption QColorDialog::DontUseNativeDialog } option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColorDialog#customColor(int) customColor()}. <br></DD></DT>
*/

    public native static void setCustomColor(int index, int color);

/**
Sets the standard color at <tt>index</tt> to the QRgb<tt>color</tt> value. <p><b>Note:</b> This function does not apply to the Native Color Dialog on the Mac OS X platform. If you still require this function, use the {@link com.trolltech.qt.gui.QColorDialog.ColorDialogOption QColorDialog::DontUseNativeDialog } option.
*/

    public native static void setStandardColor(int index, int color);

/**
@exclude
*/

    public static native QColorDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QColorDialog(QPrivateConstructor p) { super(p); } 

/**

*/

    public static Integer getRgba(int initial, com.trolltech.qt.gui.QWidget parent) {
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        int result = getRgba_internal(initial, ok, parent);
        return ok.booleanValue() ? result : null;
    }

/**

*/

    public static Integer getRgba(com.trolltech.qt.gui.QWidget parent) {
        return getRgba(0xFFFFFFFF, parent);
    }

}
