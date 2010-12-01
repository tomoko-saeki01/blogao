package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFontDialog class provides a dialog widget for selecting a font. A font dialog is created through one of the static {@link com.trolltech.qt.gui.QFontDialog#getFont(com.trolltech.qt.gui.QFont, com.trolltech.qt.gui.QWidget, java.lang.String, com.trolltech.qt.gui.QFontDialog.FontDialogOptions) getFont()} functions. <p>Examples: <pre class="snippet">
    QFont font;
    QFontDialog.Result fontResult  = QFontDialog.getFont(new QFont("Helvetica [Cronyx]", 10), this);
    if (fontResult.ok) {
        // the user clicked OK and font is set to the font the user selected
        font = fontResult.font;
    } else {
        // the user canceled the dialog; font is set to the initial
        // value, in this case Helvetica [Cronyx], 10
    }
</pre> The dialog can also be used to set a widget's font directly: <pre class="snippet">
    myWidget.setFont(QFontDialog.getFont(myWidget.font()).font);
</pre> If the user clicks OK the font they chose will be used for myWidget, and if they click Cancel the original font is used. <br><center><img src="../images/plastique-fontdialog.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QFontInfo QFontInfo}, {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}, {@link com.trolltech.qt.gui.QColorDialog QColorDialog}, {@link com.trolltech.qt.gui.QFileDialog QFileDialog}, {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, and {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFontDialog extends com.trolltech.qt.gui.QDialog
{
/**
This enum specifies various options that affect the look and feel of a font dialog. <p><DT><b>See also:</b><br><DD>{@link QFontDialog#options() options}, {@link com.trolltech.qt.gui.QFontDialog#setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QFontDialog#testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) testOption()}. <br></DD></DT>
*/

    public enum FontDialogOption implements com.trolltech.qt.QtEnumerator {
/**
 Don't display <b>OK</b> and <b>Cancel</b> buttons. (Useful for "live dialogs".)
*/

        NoButtons(1),
/**
 Use Qt's standard font dialog on the Mac instead of Apple's native font panel. (Currently, the native dialog is never used, but this is likely to change in future Qt releases.)
*/

        DontUseNativeDialog(2);

        FontDialogOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QFontDialog$FontDialogOptions with the specified <tt>com.trolltech.qt.gui.QFontDialog$FontDialogOption[]</tt> QFontDialog$FontDialogOption values set.</brief>
*/

        public static FontDialogOptions createQFlags(FontDialogOption ... values) {
            return new FontDialogOptions(values);
        }
/**
<brief>Returns the QFontDialog$FontDialogOption constant with the specified <tt>int</tt>.</brief>
*/

        public static FontDialogOption resolve(int value) {
            return (FontDialogOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return NoButtons;
            case 2: return DontUseNativeDialog;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FontDialogOptions extends com.trolltech.qt.QFlags<FontDialogOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QFontDialog-FontDialogOptions with the specified <tt>com.trolltech.qt.gui.QFontDialog.FontDialogOption[]</tt>. flags set.</brief>
*/

        public FontDialogOptions(FontDialogOption ... args) { super(args); }
        public FontDialogOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QFont(named: font)&gt;:<p> This signal is emitted when the current font is changed. The new font is specified in <tt>font</tt>. <p>The signal is emitted while a user is selecting a font. Ultimately, the chosen font may differ from the font currently selected. <p><DT><b>See also:</b><br><DD>{@link QFontDialog#currentFont() currentFont}, {@link com.trolltech.qt.gui.QFontDialog#fontSelected fontSelected() }, and {@link com.trolltech.qt.gui.QFontDialog#selectedFont() selectedFont()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QFont> currentFontChanged = new Signal1<com.trolltech.qt.gui.QFont>();

    private final void currentFontChanged(com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentFontChanged_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    native void __qt_currentFontChanged_QFont(long __this__nativeId, long font);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QFont(named: font)&gt;:<p> This signal is emitted when a font has been selected. The selected font is specified in <tt>font</tt>. <p>The signal is only emitted when a user has chosen the final font to be used. It is not emitted while the user is changing the current font in the font dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDialog#selectedFont() selectedFont()}, {@link com.trolltech.qt.gui.QFontDialog#currentFontChanged currentFontChanged() }, and {@link QFontDialog#currentFont() currentFont}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QFont> fontSelected = new Signal1<com.trolltech.qt.gui.QFont>();

    private final void fontSelected(com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fontSelected_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    native void __qt_fontSelected_QFont(long __this__nativeId, long font);


/**
Constructs a standard font dialog. <p>Use {@link com.trolltech.qt.gui.QFontDialog#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()} to set the initial font attributes. <p>The <tt>parent</tt> parameter is passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDialog#getFont(com.trolltech.qt.gui.QFont, com.trolltech.qt.gui.QWidget, java.lang.String, com.trolltech.qt.gui.QFontDialog.FontDialogOptions) getFont()}. <br></DD></DT>
*/

    public QFontDialog() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a standard font dialog. <p>Use {@link com.trolltech.qt.gui.QFontDialog#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()} to set the initial font attributes. <p>The <tt>parent</tt> parameter is passed to the {@link com.trolltech.qt.gui.QDialog QDialog} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDialog#getFont(com.trolltech.qt.gui.QFont, com.trolltech.qt.gui.QWidget, java.lang.String, com.trolltech.qt.gui.QFontDialog.FontDialogOptions) getFont()}. <br></DD></DT>
*/

    public QFontDialog(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QFontDialog_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFontDialog_QWidget(long parent);


/**
Constructs a standard font dialog with the given <tt>parent</tt> and specified <tt>initial</tt> color.
*/

    public QFontDialog(com.trolltech.qt.gui.QFont initial) {
        this(initial, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a standard font dialog with the given <tt>parent</tt> and specified <tt>initial</tt> color.
*/

    public QFontDialog(com.trolltech.qt.gui.QFont initial, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QFontDialog_QFont_QWidget(initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFontDialog_QFont_QWidget(long initial, long parent);

/**

*/

    @com.trolltech.qt.QtPropertyReader(name="currentFont")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont currentFont()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFont(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_currentFont(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Deprecated
    @QtBlockedSlot
    public final boolean eventFilter(com.trolltech.qt.core.QObject object, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), object == null ? 0 : object.nativeId(), event == null ? 0 : event.nativeId());
    }
    @Deprecated
    @QtBlockedSlot
    final boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long object, long event)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


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
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDialog#setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QFontDialog#testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontDialog.FontDialogOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QFontDialog.FontDialogOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);

/**
Returns the font that the user selected by clicking the <b>OK</b> or equivalent button. <p><b>Note:</b> This font is not always the same as the font held by the {@link QFontDialog#currentFont() currentFont} property since the user can choose different fonts before finally selecting the one to use.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont selectedFont()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedFont(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_selectedFont(long __this__nativeId);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="currentFont")
    @QtBlockedSlot
    public final void setCurrentFont(com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentFont_QFont(long __this__nativeId, long font);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QFontDialog#options() options}, and {@link com.trolltech.qt.gui.QFontDialog#testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QFontDialog#options() options}, and {@link com.trolltech.qt.gui.QFontDialog#testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_FontDialogOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_FontDialogOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QFontDialog.FontDialogOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QFontDialog.FontDialogOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDialog#setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QFontDialog#testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QFontDialog.FontDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_FontDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_FontDialogOptions(long __this__nativeId, int options);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QFontDialog#options() options}, and {@link com.trolltech.qt.gui.QFontDialog#setOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QFontDialog.FontDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_FontDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_FontDialogOption(long __this__nativeId, int option);

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

    private static com.trolltech.qt.gui.QFont getFont(com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QWidget parent)    {
        return __qt_getFont_nativepointer_QWidget(ok, parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QFont __qt_getFont_nativepointer_QWidget(com.trolltech.qt.QNativePointer ok, long parent);

    private static com.trolltech.qt.gui.QFont getFont(com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QFont initial, com.trolltech.qt.gui.QWidget parent)    {
        return __qt_getFont_nativepointer_QFont_QWidget(ok, initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QFont __qt_getFont_nativepointer_QFont_QWidget(com.trolltech.qt.QNativePointer ok, long initial, long parent);

    private static com.trolltech.qt.gui.QFont getFont(com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QFont initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title)    {
        return __qt_getFont_nativepointer_QFont_QWidget_String(ok, initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId(), title);
    }
    native static com.trolltech.qt.gui.QFont __qt_getFont_nativepointer_QFont_QWidget_String(com.trolltech.qt.QNativePointer ok, long initial, long parent, java.lang.String title);


    private static com.trolltech.qt.gui.QFont getFont(com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QFont initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title, com.trolltech.qt.gui.QFontDialog.FontDialogOption ... options) {
        return com.trolltech.qt.gui.QFontDialog.getFont(ok, initial, parent, title, new com.trolltech.qt.gui.QFontDialog.FontDialogOptions(options));
    }
    private static com.trolltech.qt.gui.QFont getFont(com.trolltech.qt.QNativePointer ok, com.trolltech.qt.gui.QFont initial, com.trolltech.qt.gui.QWidget parent, java.lang.String title, com.trolltech.qt.gui.QFontDialog.FontDialogOptions options)    {
        return __qt_getFont_nativepointer_QFont_QWidget_String_FontDialogOptions(ok, initial == null ? 0 : initial.nativeId(), parent == null ? 0 : parent.nativeId(), title, options.value());
    }
    native static com.trolltech.qt.gui.QFont __qt_getFont_nativepointer_QFont_QWidget_String_FontDialogOptions(com.trolltech.qt.QNativePointer ok, long initial, long parent, java.lang.String title, int options);

/**
@exclude
*/

    public static native QFontDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QFontDialog(QPrivateConstructor p) { super(p); } 

    public static final class Result {
        public Result(QFont font, boolean ok) {
            this.font = font;
            this.ok = ok;
        }

        public QFont font;
        public boolean ok;
    }

/**
This is an overloaded method provided for convenience.
*/

    public static Result getFont(QFont initial, QWidget parent, String title, FontDialogOptions options) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        QFont returned = getFont(np, initial, parent, title, options);
        return new Result(returned, np.booleanValue());
    }

/**
Executes a modal font dialog and returns a font.
<p>
If the user clicks OK, the selected font is returned. If the user
clicks Cancel, the <tt>initial</tt> font is returned.
<p>
The dialog is constructed with the given <tt>parent</tt>.
<tt>caption</tt> is shown as the window title of the dialog and
<tt>initial</tt> is the initially selected font.
<p>
This static function is less flexible than the full QFontDialog
object, but is convenient and easy to use.
*/

    public static Result getFont(QFont initial, QWidget parent, String caption) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        QFont returned = getFont(np, initial, parent, caption);
        return new Result(returned, np.booleanValue());
    }

/**
This is an overloaded method provided for convenience.
*/

    public static Result getFont(QWidget parent) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        QFont returned = getFont(np, parent);
        return new Result(returned, np.booleanValue());
    }

/**
This is an overloaded method provided for convenience.
*/

    public static Result getFont() {
        return getFont((QWidget) null);
    }

/**
This is an overloaded method provided for convenience.
*/

    public static Result getFont(QFont initial, QWidget parent) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        QFont returned = getFont(np, initial, parent);
        return new Result(returned, np.booleanValue());
    }

/**
This is an overloaded method provided for convenience.
*/

    public static Result getFont(QFont initial) {
        return getFont(initial , (QWidget) null);
    }

}
