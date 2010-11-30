package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrintDialog class provides a dialog for specifying the printer's configuration. The dialog allows users to change document-related settings, such as the paper size and orientation, type of print (color or grayscale), range of pages, and number of copies to print. <p>Controls are also provided to enable users to choose from the printers available, including any configured network printers. <p>Typically, QPrintDialog objects are constructed with a {@link com.trolltech.qt.gui.QPrinter QPrinter} object, and executed using the exec() function. <pre class="snippet">
        QPrintDialog printDialog = new QPrintDialog(printer, parent);
        if (printDialog.exec() == QDialog.DialogCode.Accepted.value()) {
            // print ...
        }
</pre> If the dialog is accepted by the user, the {@link com.trolltech.qt.gui.QPrinter QPrinter} object is correctly configured for printing.    <table align="center">
    <tr><td>
      <br><center><img src="../images/plastique-printdialog.png"></center><br>    </td><td>
      <br><center><img src="../images/plastique-printdialog-properties.png"></center><br>    </td></tr>
    </table>
     The printer dialog (shown above in Plastique style) enables access to common printing properties. On X11 platforms that use the CUPS printing system, the settings for each available printer can be modified via the dialog's <b>Properties</b> push button. <p>On Windows and Mac OS X, the native print dialog is used, which means that some {@link com.trolltech.qt.gui.QWidget QWidget} and {@link com.trolltech.qt.gui.QDialog QDialog} properties set on the dialog won't be respected. The native print dialog on Mac OS X does not support setting printer options, i.e. QAbstractPrintDialog::setEnabledOptions() and QAbstractPrintDialog::addEnabledOption() have no effect. <p>In Qt 4.4, it was possible to use the satic functions to show a sheet on Mac OS X. This is no longer supported in Qt 4.5. If you want this functionality, use QPrintDialog::open(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPageSetupDialog QPageSetupDialog}, {@link com.trolltech.qt.gui.QPrinter QPrinter}, {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}, {@link <a href="../qtjambi-orderform.html">Order Form Example</a>}, {@link <a href="../widgets-imageviewer.html">Image Viewer Example</a>}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPrintDialog extends com.trolltech.qt.gui.QAbstractPrintDialog
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QPrinter(named: printer)&gt;:<p> This signal is emitted when the user accepts the values set in the print dialog. The <tt>printer</tt> parameter includes the printer that the settings were applied to.
*/

    public final Signal1<com.trolltech.qt.gui.QPrinter> accepted = new Signal1<com.trolltech.qt.gui.QPrinter>();

    private final void accepted(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accepted_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    native void __qt_accepted_QPrinter(long __this__nativeId, long printer);


/**
Constructs a new modal printer dialog for the given <tt>printer</tt> with the given <tt>parent</tt>.
*/

    public QPrintDialog(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new modal printer dialog for the given <tt>printer</tt> with the given <tt>parent</tt>.
*/

    public QPrintDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPrintDialog_QPrinter_QWidget(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPrintDialog_QPrinter_QWidget(long printer, long parent);


/**
Constructs a print dialog with the given <tt>parent</tt>.
*/

    public QPrintDialog() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a print dialog with the given <tt>parent</tt>.
*/

    public QPrintDialog(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QPrintDialog_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPrintDialog_QWidget(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void accepted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accepted(nativeId());
    }
    @QtBlockedSlot
    native void __qt_accepted(long __this__nativeId);

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
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintDialog#setOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QPrintDialog#testOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QPrintDialog#options() options}, and {@link com.trolltech.qt.gui.QPrintDialog#testOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QPrintDialog#options() options}, and {@link com.trolltech.qt.gui.QPrintDialog#testOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_PrintDialogOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_PrintDialogOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintDialog#setOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) setOption()}, and {@link com.trolltech.qt.gui.QPrintDialog#testOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_PrintDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_PrintDialogOptions(long __this__nativeId, int options);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QPrintDialog#options() options}, and {@link com.trolltech.qt.gui.QPrintDialog#setOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_PrintDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_PrintDialogOption(long __this__nativeId, int option);

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

    public static native QPrintDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QPrintDialog(QPrivateConstructor p) { super(p); } 
}
