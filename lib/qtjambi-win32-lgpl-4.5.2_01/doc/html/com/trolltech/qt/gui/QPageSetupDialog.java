package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPageSetupDialog class provides a configuration dialog for the page-related options on a printer. On Windows and Mac OS X the page setup dialog is implemented using the native page setup dialogs. <p>Note that on Windows and Mac OS X custom paper sizes won't be reflected in the native page setup dialogs. Additionally, custom page margins set on a {@link com.trolltech.qt.gui.QPrinter QPrinter} won't show in the native Mac OS X page setup dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter QPrinter}, and {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPageSetupDialog extends com.trolltech.qt.gui.QAbstractPageSetupDialog
{
/**
Used to specify options to the page setup dialog <p>This value is obsolete and does nothing since Qt 4.5:
*/

    public enum PageSetupDialogOption implements com.trolltech.qt.QtEnumerator {
        None(0),
/**
 In previous versions of Qt, exec() the page setup dialog would create a sheet by default if the dialog was given a parent. This is no longer supported in Qt 4.5. If you want to use sheets, use QPageSetupDialog::open() instead.
*/

        DontUseSheet(1),
        OwnsPrinter(-2147483648);

        PageSetupDialogOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QPageSetupDialog$PageSetupDialogOptions with the specified <tt>com.trolltech.qt.gui.QPageSetupDialog$PageSetupDialogOption[]</tt> QPageSetupDialog$PageSetupDialogOption values set.</brief>
*/

        public static PageSetupDialogOptions createQFlags(PageSetupDialogOption ... values) {
            return new PageSetupDialogOptions(values);
        }
/**
<brief>Returns the QPageSetupDialog$PageSetupDialogOption constant with the specified <tt>int</tt>.</brief>
*/

        public static PageSetupDialogOption resolve(int value) {
            return (PageSetupDialogOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return DontUseSheet;
            case -2147483648: return OwnsPrinter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class PageSetupDialogOptions extends com.trolltech.qt.QFlags<PageSetupDialogOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QPageSetupDialog-PageSetupDialogOptions with the specified <tt>com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption[]</tt>. flags set.</brief>
*/

        public PageSetupDialogOptions(PageSetupDialogOption ... args) { super(args); }
        public PageSetupDialogOptions(int value) { setValue(value); }
    }




/**
Constructs a page setup dialog that configures <tt>printer</tt> with <tt>parent</tt> as the parent widget.
*/

    public QPageSetupDialog(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a page setup dialog that configures <tt>printer</tt> with <tt>parent</tt> as the parent widget.
*/

    public QPageSetupDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPageSetupDialog_QPrinter_QWidget(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPageSetupDialog_QPrinter_QWidget(long printer, long parent);


/**
Constructs a page setup dialog that configures a default-constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} with <tt>parent</tt> as the parent widget. <p><DT><b>See also:</b><br><DD>printer(). <br></DD></DT>
*/

    public QPageSetupDialog() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a page setup dialog that configures a default-constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} with <tt>parent</tt> as the parent widget. <p><DT><b>See also:</b><br><DD>printer(). <br></DD></DT>
*/

    public QPageSetupDialog(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPageSetupDialog_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPageSetupDialog_QWidget(long parent);

/**
Use setOption(<tt>option</tt>, true) instead.
*/

    @QtBlockedSlot
    public final void addEnabledOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEnabledOption_PageSetupDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native void __qt_addEnabledOption_PageSetupDialogOption(long __this__nativeId, int option);

/**
Use {@link com.trolltech.qt.gui.QPageSetupDialog#options() options()} instead. <p><DT><b>See also:</b><br><DD>setEnabledOptions(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions enabledOptions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions(__qt_enabledOptions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_enabledOptions(long __this__nativeId);

/**
Use testOption(<tt>option</tt>) instead.
*/

    @QtBlockedSlot
    public final boolean isOptionEnabled(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOptionEnabled_PageSetupDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_isOptionEnabled_PageSetupDialogOption(long __this__nativeId, int option);

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
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPageSetupDialog#setOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QPageSetupDialog#testOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setEnabledOptions(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption ... options) {
        this.setEnabledOptions(new com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions(options));
    }
/**
Use setOptions(<tt>options</tt>) instead. <p><DT><b>See also:</b><br><DD>enabledOptions(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnabledOptions(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabledOptions_PageSetupDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setEnabledOptions_PageSetupDialogOptions(long __this__nativeId, int options);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QPageSetupDialog#options() options}, and {@link com.trolltech.qt.gui.QPageSetupDialog#testOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QPageSetupDialog#options() options}, and {@link com.trolltech.qt.gui.QPageSetupDialog#testOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_PageSetupDialogOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_PageSetupDialogOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPageSetupDialog#setOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QPageSetupDialog#testOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_PageSetupDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_PageSetupDialogOptions(long __this__nativeId, int options);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QPageSetupDialog#options() options}, and {@link com.trolltech.qt.gui.QPageSetupDialog#setOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QPageSetupDialog.PageSetupDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_PageSetupDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_PageSetupDialogOption(long __this__nativeId, int option);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int exec()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec(nativeId());
    }
    @QtBlockedSlot
    native int __qt_exec(long __this__nativeId);

/**
@exclude
*/

    public static native QPageSetupDialog fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPageSetupDialog(QPrivateConstructor p) { super(p); } 
}
