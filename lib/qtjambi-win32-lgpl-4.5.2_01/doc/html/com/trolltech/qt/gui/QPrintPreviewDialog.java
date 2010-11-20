package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrintPreviewDialog class provides a dialog for previewing and configuring page layouts for printer output. Using QPrintPreviewDialog in your existing application is straightforward: <ol><li> Create the QPrintPreviewDialog. <p>You can construct a QPrintPreviewDialog with an existing {@link com.trolltech.qt.gui.QPrinter QPrinter} object, or you can have QPrintPreviewDialog create one for you, which will be the system default printer.</li><li> Connect the {@link com.trolltech.qt.gui.QPrintPreviewDialog#paintRequested paintRequested() } signal to a slot. <p>When the dialog needs to generate a set of preview pages, the {@link com.trolltech.qt.gui.QPrintPreviewDialog#paintRequested paintRequested() } signal will be emitted. You can use the exact same code for the actual printing as for having the preview generated, including calling {@link com.trolltech.qt.gui.QPrinter#newPage() QPrinter::newPage()} to start a new page in the preview. Connect a slot to the {@link com.trolltech.qt.gui.QPrintPreviewDialog#paintRequested paintRequested() } signal, where you draw onto the {@link com.trolltech.qt.gui.QPrinter QPrinter} object that is passed into the slot.</li><li> Call {@link com.trolltech.qt.gui.QDialog#exec() exec()}. <p>Call {@link com.trolltech.qt.gui.QDialog#exec() QPrintPreviewDialog::exec()} to show the preview dialog.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter QPrinter}, {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, {@link com.trolltech.qt.gui.QPageSetupDialog QPageSetupDialog}, and {@link com.trolltech.qt.gui.QPrintPreviewWidget QPrintPreviewWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPrintPreviewDialog extends com.trolltech.qt.gui.QDialog
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QPrinter(named: printer)&gt;:<p> This signal is emitted when the QPrintPreviewDialog needs to generate a set of preview pages. <p>The <tt>printer</tt> instance supplied is the paint device onto which you should paint the contents of each page, using the {@link com.trolltech.qt.gui.QPrinter QPrinter} instance in the same way as you would when printing directly.
*/

    public final Signal1<com.trolltech.qt.gui.QPrinter> paintRequested = new Signal1<com.trolltech.qt.gui.QPrinter>();

    private final void paintRequested(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintRequested_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    native void __qt_paintRequested_QPrinter(long __this__nativeId, long printer);


/**
This is an overloaded method provided for convenience.
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(printer, parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a QPrintPreviewDialog based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent) {
        this(printer, parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QPrintPreviewDialog based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QPrintPreviewDialog based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QPrintPreviewDialog_QPrinter_QWidget_WindowFlags(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QPrintPreviewDialog_QPrinter_QWidget_WindowFlags(long printer, long parent, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>This will create an internal {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will use the system default printer.
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>This will create an internal {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will use the system default printer.
*/

    public QPrintPreviewDialog() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>This will create an internal {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will use the system default printer.
*/

    public QPrintPreviewDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QPrintPreviewDialog_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QPrintPreviewDialog_QWidget_WindowFlags(long parent, int flags);

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
Returns a pointer to the {@link com.trolltech.qt.gui.QPrinter QPrinter} object this dialog is currently operating on.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter printer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_printer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPrinter __qt_printer(long __this__nativeId);

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
@exclude
*/

    public static native QPrintPreviewDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QPrintPreviewDialog(QPrivateConstructor p) { super(p); } 
}
