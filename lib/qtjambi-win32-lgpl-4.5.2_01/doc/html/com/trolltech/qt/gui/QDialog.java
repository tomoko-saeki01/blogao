package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDialog class is the base class of dialog windows. A dialog window is a top-level window mostly used for short-term tasks and brief communications with the user. QDialogs may be modal or modeless. QDialogs can provide a return value, and they can have default buttons. QDialogs can also have a {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} in their lower-right corner, using {@link com.trolltech.qt.gui.QDialog#setSizeGripEnabled(boolean) setSizeGripEnabled()}. <p>Note that QDialog (an any other widget that has type {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }) uses the parent widget slightly differently from other classes in Qt. A dialog is always a top-level widget, but if it has a parent, its default location is centered on top of the parent's top-level widget (if it is not top-level itself). It will also share the parent's taskbar entry. <p>Use the overload of the {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) QWidget::setParent()} function to change the ownership of a QDialog widget. This function allows you to explicitly set the window flags of the reparented widget; using the overloaded function will clear the window flags specifying the window-system properties for the widget (in particular it will reset the {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog } flag).<a name="modal-dialogs"><h2>Modal Dialogs</h2> A <b>modal</b> dialog is a dialog that blocks input to other visible windows in the same application. Dialogs that are used to request a file name from the user or that are used to set application preferences are usually modal. Dialogs can be {@link com.trolltech.qt.core.Qt.WindowModality application modal } (the default) or {@link com.trolltech.qt.core.Qt.WindowModality window modal }. <p>When an application modal dialog is opened, the user must finish interacting with the dialog and close it before they can access any other window in the application. Window modal dialogs only block access to the window associated with the dialog, allowing the user to continue to use other windows in an application. <p>The most common way to display a modal dialog is to call its {@link com.trolltech.qt.gui.QDialog#exec() exec()} function. When the user closes the dialog, {@link com.trolltech.qt.gui.QDialog#exec() exec()} will provide a useful return value. Typically, to get the dialog to close and return the appropriate value, we connect a default button, e.g. <b>OK</b>, to the {@link com.trolltech.qt.gui.QDialog#accept() accept()} slot and a <b>Cancel</b> button to the {@link com.trolltech.qt.gui.QDialog#reject() reject()} slot. Alternatively you can call the {@link com.trolltech.qt.gui.QDialog#done(int) done()} slot with <tt>Accepted</tt> or <tt>Rejected</tt>. <p>An alternative is to call setModal(true) or setWindowModality(), then {@link com.trolltech.qt.gui.QWidget#show() show()}. Unlike {@link com.trolltech.qt.gui.QDialog#exec() exec()}, {@link com.trolltech.qt.gui.QWidget#show() show()} returns control to the caller immediately. Calling setModal(true) is especially useful for progress dialogs, where the user must have the ability to interact with the dialog, e.g. to cancel a long running operation. If you use {@link com.trolltech.qt.gui.QWidget#show() show()} and setModal(true) together to perform a long operation, you must call {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QApplication::processEvents()} periodically during processing to enable the user to interact with the dialog. (See {@link com.trolltech.qt.gui.QProgressDialog QProgressDialog}.)<a name="modeless-dialogs"><h2>Modeless Dialogs</h2> A <b>modeless</b> dialog is a dialog that operates independently of other windows in the same application. Find and replace dialogs in word-processors are often modeless to allow the user to interact with both the application's main window and with the dialog. <p>Modeless dialogs are displayed using {@link com.trolltech.qt.gui.QWidget#show() show()}, which returns control to the caller immediately. <p>If you invoke the {@link com.trolltech.qt.gui.QWidget#show() show()} function after hiding a dialog, the dialog will be displayed in its original position. This is because the window manager decides the position for windows that have not been explicitly placed by the programmer. To preserve the position of a dialog that has been moved by the user, save its position in your {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) closeEvent()} handler and then move the dialog to that position, before showing it again.<a name="default"><a name="default-button"><h2>Default Button</h2> A dialog's default button is the button that's pressed when the user presses Enter (Return). This button is used to signify that the user accepts the dialog's settings and wants to close the dialog. Use {@link QPushButton#setDefault(boolean) QPushButton::setDefault()}, {@link QPushButton#isDefault() QPushButton::isDefault()} and {@link QPushButton#autoDefault() QPushButton::autoDefault()} to set and control the dialog's default button.<a name="escapekey"><a name="escape-key"><h2>Escape Key</h2> If the user presses the Esc key in a dialog, {@link com.trolltech.qt.gui.QDialog#reject() QDialog::reject()} will be called. This will cause the window to close: The {@link com.trolltech.qt.gui.QCloseEvent close event} cannot be {@link com.trolltech.qt.core.QEvent#ignore() ignored}.<a name="extensibility"><h2>Extensibility</h2> Extensibility is the ability to show the dialog in two ways: a partial dialog that shows the most commonly used options, and a full dialog that shows all the options. Typically an extensible dialog will initially appear as a partial dialog, but with a <b>More</b> toggle button. If the user presses the <b>More</b> button down, the dialog is expanded. The {@link <a href="../qtjambi-extension.html">Extension Example</a>} shows how to achieve extensible dialogs using Qt.<a name="return"><a name="return-value-modal-dialogs"><h2>Return Value (Modal Dialogs)</h2> Modal dialogs are often used in situations where a return value is required, e.g. to indicate whether the user pressed <b>OK</b> or <b>Cancel</b>. A dialog can be closed by calling the {@link com.trolltech.qt.gui.QDialog#accept() accept()} or the {@link com.trolltech.qt.gui.QDialog#reject() reject()} slots, and {@link com.trolltech.qt.gui.QDialog#exec() exec()} will return <tt>Accepted</tt> or <tt>Rejected</tt> as appropriate. The {@link com.trolltech.qt.gui.QDialog#exec() exec()} call returns the result of the dialog. The result is also available from {@link com.trolltech.qt.gui.QDialog#result() result()} if the dialog has not been destroyed. <p>In order to modify your dialog's close behavior, you can reimplement the functions {@link com.trolltech.qt.gui.QDialog#accept() accept()}, {@link com.trolltech.qt.gui.QDialog#reject() reject()} or {@link com.trolltech.qt.gui.QDialog#done(int) done()}. The {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) closeEvent()} function should only be reimplemented to preserve the dialog's position or to override the standard close or reject behavior.<a name="examples"><a name="code-examples"><h2>Code Examples</h2> A modal dialog: <pre class="snippet">
    void countWords()
    {
        WordCountDialog dialog = new WordCountDialog(this);
        dialog.setWordCount(document().wordCount());
        dialog.exec();
    }
    </pre> A modeless dialog: <pre class="snippet">
    void find()
    {
        if (findDialog == null) {
            findDialog = new FindDialog(this);
            findDialog.findNext.connect(this, "findNext()");
        }

        findDialog.show();
        findDialog.raise();
        findDialog.activateWindow();
    }
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}, {@link com.trolltech.qt.gui.QTabWidget QTabWidget}, {@link com.trolltech.qt.gui.QWidget QWidget}, {@link com.trolltech.qt.gui.QProgressDialog QProgressDialog}, {@link <a href="../guibooks.html">GUI Design Handbook: Dialogs, Standard</a>}, {@link <a href="../qtjambi-extension.html">Extension Example</a>}, and {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDialog extends com.trolltech.qt.gui.QWidget
{
    
/**
The value returned by a modal dialog.
*/
@QtBlockedEnum
    public enum DialogCode implements com.trolltech.qt.QtEnumerator {
/**

*/

        Rejected(0),
/**

*/

        Accepted(1);

        DialogCode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDialog$DialogCode constant with the specified <tt>int</tt>.</brief>
*/

        public static DialogCode resolve(int value) {
            return (DialogCode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Rejected;
            case 1: return Accepted;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when the dialog has been accepted either by the user or by calling {@link com.trolltech.qt.gui.QDialog#accept() accept()} or {@link com.trolltech.qt.gui.QDialog#done(int) done()} with the {@link com.trolltech.qt.gui.QDialog.DialogCode QDialog::Accepted } argument. <p>Note that this signal is not emitted when hiding the dialog with {@link com.trolltech.qt.gui.QWidget#hide() hide()} or setVisible(false). This includes deleting the dialog while it is visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#finished finished() }, and {@link com.trolltech.qt.gui.QDialog#rejected rejected() }. <br></DD></DT>
*/

    public final Signal0 accepted = new Signal0();

    private final void accepted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accepted(nativeId());
    }
    native void __qt_accepted(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: result)&gt;:<p> This signal is emitted when the dialog's <tt>result</tt> code has been set, either by the user or by calling {@link com.trolltech.qt.gui.QDialog#done(int) done()}, {@link com.trolltech.qt.gui.QDialog#accept() accept()}, or {@link com.trolltech.qt.gui.QDialog#reject() reject()}. <p>Note that this signal is not emitted when hiding the dialog with {@link com.trolltech.qt.gui.QWidget#hide() hide()} or setVisible(false). This includes deleting the dialog while it is visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#accepted accepted() }, and {@link com.trolltech.qt.gui.QDialog#rejected rejected() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> finished = new Signal1<java.lang.Integer>();

    private final void finished(int result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished_int(nativeId(), result);
    }
    native void __qt_finished_int(long __this__nativeId, int result);
/**
 This signal is emitted when the dialog has been rejected either by the user or by calling {@link com.trolltech.qt.gui.QDialog#reject() reject()} or {@link com.trolltech.qt.gui.QDialog#done(int) done()} with the {@link com.trolltech.qt.gui.QDialog.DialogCode QDialog::Rejected } argument. <p>Note that this signal is not emitted when hiding the dialog with {@link com.trolltech.qt.gui.QWidget#hide() hide()} or setVisible(false). This includes deleting the dialog while it is visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#finished finished() }, and {@link com.trolltech.qt.gui.QDialog#accepted accepted() }. <br></DD></DT>
*/

    public final Signal0 rejected = new Signal0();

    private final void rejected()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rejected(nativeId());
    }
    native void __qt_rejected(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public QDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs a dialog with parent <tt>parent</tt>. <p>A dialog is always a top-level widget, but if it has a parent, its default location is centered on top of the parent. It will also share the parent's taskbar entry. <p>The widget flags <tt>f</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. If, for example, you don't want a What's This button in the title bar of the dialog, pass {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowTitleHint } | {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } in <tt>f</tt>. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QDialog(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a dialog with parent <tt>parent</tt>. <p>A dialog is always a top-level widget, but if it has a parent, its default location is centered on top of the parent. It will also share the parent's taskbar entry. <p>The widget flags <tt>f</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. If, for example, you don't want a What's This button in the title bar of the dialog, pass {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowTitleHint } | {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } in <tt>f</tt>. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QDialog() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a dialog with parent <tt>parent</tt>. <p>A dialog is always a top-level widget, but if it has a parent, its default location is centered on top of the parent. It will also share the parent's taskbar entry. <p>The widget flags <tt>f</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. If, for example, you don't want a What's This button in the title bar of the dialog, pass {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowTitleHint } | {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } in <tt>f</tt>. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QDialog_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QDialog_QWidget_WindowFlags(long parent, int f);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void adjustPosition(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjustPosition_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_adjustPosition_QWidget(long __this__nativeId, long arg__1);

/**
Shows the dialog as a modal dialog, blocking until the user closes it. The function returns a {@link com.trolltech.qt.gui.QDialog.DialogCode DialogCode } result. <p>If the dialog is {@link com.trolltech.qt.core.Qt.WindowModality application modal }, users cannot interact with any other window in the same application until they close the dialog. If the dialog is {@link com.trolltech.qt.core.Qt.WindowModality window modal }, only interaction with the parent window is blocked while the dialog is open. By default, the dialog is application modal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#open() open()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QDialog#result() result()}, and setWindowModality(). <br></DD></DT>
*/

    public int exec()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec(nativeId());
    }
    native int __qt_exec(long __this__nativeId);

/**
This property holds whether the size grip is enabled. A {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} is placed in the bottom-right corner of the dialog when this property is enabled. By default, the size grip is disabled.
*/

    @com.trolltech.qt.QtPropertyReader(name="sizeGripEnabled")
    @QtBlockedSlot
    public final boolean isSizeGripEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSizeGripEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSizeGripEnabled(long __this__nativeId);

/**
Shows the dialog as a window modal dialog, returning immediately. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#exec() exec()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QDialog#result() result()}, and setWindowModality(). <br></DD></DT>
*/

    public void open()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_open(nativeId());
    }
    native void __qt_open(long __this__nativeId);

/**
Returns the modal dialog's result code, <tt>Accepted</tt> or <tt>Rejected</tt>. <p>Do not call this function if the dialog was constructed with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#setResult(int) setResult()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int result()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_result(nativeId());
    }
    @QtBlockedSlot
    native int __qt_result(long __this__nativeId);

/**
This property holds whether {@link com.trolltech.qt.gui.QWidget#show() show()} should pop up the dialog as modal or modeless. By default, this property is false and {@link com.trolltech.qt.gui.QWidget#show() show()} pops up the dialog as modeless. Setting his property to true is equivalent to setting {@link QWidget#windowModality() QWidget::windowModality} to {@link com.trolltech.qt.core.Qt.WindowModality Qt::ApplicationModal }. <p>{@link com.trolltech.qt.gui.QDialog#exec() exec()} ignores the value of this property and always pops up the dialog as modal. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowModality() QWidget::windowModality}, {@link com.trolltech.qt.gui.QWidget#show() show()}, and {@link com.trolltech.qt.gui.QDialog#exec() exec()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="modal")
    @QtBlockedSlot
    public final void setModal(boolean modal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModal_boolean(nativeId(), modal);
    }
    @QtBlockedSlot
    native void __qt_setModal_boolean(long __this__nativeId, boolean modal);

/**
Sets the modal dialog's result code to <tt>i</tt>. <p><b>Note:</b> We recommend that you use one of the values defined by {@link com.trolltech.qt.gui.QDialog.DialogCode QDialog::DialogCode }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#result() result()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setResult(int r)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResult_int(nativeId(), r);
    }
    @QtBlockedSlot
    native void __qt_setResult_int(long __this__nativeId, int r);

/**
This property holds whether the size grip is enabled. A {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} is placed in the bottom-right corner of the dialog when this property is enabled. By default, the size grip is disabled.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sizeGripEnabled")
    @QtBlockedSlot
    public final void setSizeGripEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeGripEnabled_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setSizeGripEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
Hides the modal dialog and sets the result code to <tt>Accepted</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#reject() reject()}, and {@link com.trolltech.qt.gui.QDialog#done(int) done()}. <br></DD></DT>
*/

    public void accept()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accept(nativeId());
    }
    native void __qt_accept(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

/**
Closes the dialog and sets its result code to <tt>r</tt>. If this dialog is shown with {@link com.trolltech.qt.gui.QDialog#exec() exec()}, {@link com.trolltech.qt.gui.QDialog#done(int) done()} causes the local event loop to finish, and {@link com.trolltech.qt.gui.QDialog#exec() exec()} to return <tt>r</tt>. <p>As with {@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}, {@link com.trolltech.qt.gui.QDialog#done(int) done()} deletes the dialog if the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } flag is set. If the dialog is the application's main widget, the application terminates. If the dialog is the last window closed, the {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#accept() accept()}, {@link com.trolltech.qt.gui.QDialog#reject() reject()}, {@link com.trolltech.qt.gui.QApplication#activeWindow() QApplication::activeWindow()}, and {@link com.trolltech.qt.core.QCoreApplication#quit() QApplication::quit()}. <br></DD></DT>
*/

    public void done(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), arg__1);
    }
    native void __qt_done_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

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
Hides the modal dialog and sets the result code to <tt>Rejected</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog#accept() accept()}, and {@link com.trolltech.qt.gui.QDialog#done(int) done()}. <br></DD></DT>
*/

    public void reject()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reject(nativeId());
    }
    native void __qt_reject(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long arg__1);

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
@exclude
*/

    public static native QDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QDialog(QPrivateConstructor p) { super(p); } 
}
