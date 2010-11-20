package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QProgressDialog class provides feedback on the progress of a slow operation. A progress dialog is used to give the user an indication of how long an operation is going to take, and to demonstrate that the application has not frozen. It can also give the user an opportunity to abort the operation. <p>A common problem with progress dialogs is that it is difficult to know when to use them; operations take different amounts of time on different hardware. QProgressDialog offers a solution to this problem: it estimates the time the operation will take (based on time for steps), and only shows itself if that estimate is beyond {@link com.trolltech.qt.gui.QProgressDialog#minimumDuration() minimumDuration()} (4 seconds by default). <p>Use {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()} and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()} or the constructor to set the number of "steps" in the operation and call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} as the operation progresses. The number of steps can be chosen arbitrarily. It can be the number of files copied, the number of bytes received, the number of iterations through the main loop of your algorithm, or some other suitable unit. Progress starts at the value set by {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and the progress dialog shows that the operation has finished when you call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} with the value set by {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()} as its argument. <p>The dialog automatically resets and hides itself at the end of the operation. Use {@link com.trolltech.qt.gui.QProgressDialog#setAutoReset(boolean) setAutoReset()} and {@link com.trolltech.qt.gui.QProgressDialog#setAutoClose(boolean) setAutoClose()} to change this behavior. Note that if you set a new maximum (using {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()} or {@link com.trolltech.qt.gui.QProgressDialog#setRange(int, int) setRange()}) that equals your current {@link com.trolltech.qt.gui.QProgressDialog#value() value()}, the dialog will not close regardless. <p>There are two ways of using QProgressDialog: modal and modeless. <p>Compared to a modeless QProgressDialog, a modal QProgressDialog is simpler to use for the programmer. Do the operation in a loop, call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} at intervals, and check for cancellation with {@link com.trolltech.qt.gui.QProgressDialog#wasCanceled() wasCanceled()}. For example: <pre class="snippet">
        QProgressDialog progress =
            new QProgressDialog("Copying files...", "Abort Copy", 0, numFiles, this);
        progress.setWindowModality(Qt.WindowModality.WindowModal);

        for (int i = 0; i &lt; numFiles; i++) {
            progress.setValue(i);

            if (progress.wasCanceled())
                break;
            //... copy one file
        }
        progress.setValue(numFiles);
    </pre> A modeless progress dialog is suitable for operations that take place in the background, where the user is able to interact with the application. Such operations are typically based on {@link com.trolltech.qt.core.QTimer QTimer} (or {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}), {@link com.trolltech.qt.core.QSocketNotifier QSocketNotifier}, or {@link <a href="../porting4.html">QUrlOperator</a>}; or performed in a separate thread. A {@link com.trolltech.qt.gui.QProgressBar QProgressBar} in the status bar of your main window is often an alternative to a modeless progress dialog. <p>You need to have an event loop to be running, connect the {@link com.trolltech.qt.gui.QProgressDialog#canceled canceled() } signal to a slot that stops the operation, and call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} at intervals. For example: <pre class="snippet">
    // Operationructor
    public Operation(QObject parent)
    {
        super(parent);

        pd = new QProgressDialog("Operation in progress.", "Cancel", 0, 100);
        pd.canceled.connect(this, "cancel()");

        t = new QTimer(this);
        t.timeout.connect(this, "perform()");

        t.start(0);
    }
    <br>

    void perform()
    {
        pd.setValue(steps);
        //... perform one percent of the operation
        steps++;
        if (steps &gt; pd.maximum())
            t.stop();
    }
    <br>

    void cancel()
    {
        t.stop();
        //... cleanup
    }
    </pre> In both modes the progress dialog may be customized by replacing the child widgets with custom widgets by using {@link com.trolltech.qt.gui.QProgressDialog#setLabel(com.trolltech.qt.gui.QLabel) setLabel()}, {@link com.trolltech.qt.gui.QProgressDialog#setBar(com.trolltech.qt.gui.QProgressBar) setBar()}, and {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}. The functions {@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()} and {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()} set the texts shown. <br><center><img src="../images/plastique-progressdialog.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDialog QDialog}, {@link com.trolltech.qt.gui.QProgressBar QProgressBar}, {@link <a href="../guibooks.html">GUI Design Handbook: Progress Indicator</a>}, {@link <a href="../qtjambi-findfiles.html">Find Files Example</a>}, and {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QProgressDialog extends com.trolltech.qt.gui.QDialog
{
/**
 This signal is emitted when the cancel button is clicked. It is connected to the {@link com.trolltech.qt.gui.QProgressDialog#cancel() cancel()} slot by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#wasCanceled() wasCanceled()}. <br></DD></DT>
*/

    public final Signal0 canceled = new Signal0();

    private final void canceled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_canceled(nativeId());
    }
    native void __qt_canceled(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public QProgressDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a progress dialog. <p>Default settings: <ul><li> The label text is empty.</li><li> The cancel button text is (translated) "Cancel".</li><li> minimum is 0;</li><li> maximum is 100</li></ul> The <tt>parent</tt> argument is dialog's parent widget. The widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a progress dialog. <p>Default settings: <ul><li> The label text is empty.</li><li> The cancel button text is (translated) "Cancel".</li><li> minimum is 0;</li><li> maximum is 100</li></ul> The <tt>parent</tt> argument is dialog's parent widget. The widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a progress dialog. <p>Default settings: <ul><li> The label text is empty.</li><li> The cancel button text is (translated) "Cancel".</li><li> minimum is 0;</li><li> maximum is 100</li></ul> The <tt>parent</tt> argument is dialog's parent widget. The widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QProgressDialog_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QProgressDialog_QWidget_WindowFlags(long parent, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QProgressDialog(java.lang.String labelText, java.lang.String cancelButtonText, int minimum, int maximum, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(labelText, cancelButtonText, minimum, maximum, parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a progress dialog. <p>The <tt>labelText</tt> is the text used to remind the user what is progressing. <p>The <tt>cancelButtonText</tt> is the text to display on the cancel button, or 0 if no cancel button is to be shown. <p>The <tt>minimum</tt> and <tt>maximum</tt> is the number of steps in the operation for which this progress dialog shows progress. For example, if the operation is to examine 50 files, this value minimum value would be 0, and the maximum would be 50. Before examining the first file, call setValue(0). As each file is processed call setValue(1), setValue(2), etc., finally calling setValue(50) after examining the last file. <p>The <tt>parent</tt> argument is the dialog's parent widget. The parent, <tt>parent</tt>, and widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setLabel(com.trolltech.qt.gui.QLabel) setLabel()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog(java.lang.String labelText, java.lang.String cancelButtonText, int minimum, int maximum, com.trolltech.qt.gui.QWidget parent) {
        this(labelText, cancelButtonText, minimum, maximum, parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a progress dialog. <p>The <tt>labelText</tt> is the text used to remind the user what is progressing. <p>The <tt>cancelButtonText</tt> is the text to display on the cancel button, or 0 if no cancel button is to be shown. <p>The <tt>minimum</tt> and <tt>maximum</tt> is the number of steps in the operation for which this progress dialog shows progress. For example, if the operation is to examine 50 files, this value minimum value would be 0, and the maximum would be 50. Before examining the first file, call setValue(0). As each file is processed call setValue(1), setValue(2), etc., finally calling setValue(50) after examining the last file. <p>The <tt>parent</tt> argument is the dialog's parent widget. The parent, <tt>parent</tt>, and widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setLabel(com.trolltech.qt.gui.QLabel) setLabel()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog(java.lang.String labelText, java.lang.String cancelButtonText, int minimum, int maximum) {
        this(labelText, cancelButtonText, minimum, maximum, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a progress dialog. <p>The <tt>labelText</tt> is the text used to remind the user what is progressing. <p>The <tt>cancelButtonText</tt> is the text to display on the cancel button, or 0 if no cancel button is to be shown. <p>The <tt>minimum</tt> and <tt>maximum</tt> is the number of steps in the operation for which this progress dialog shows progress. For example, if the operation is to examine 50 files, this value minimum value would be 0, and the maximum would be 50. Before examining the first file, call setValue(0). As each file is processed call setValue(1), setValue(2), etc., finally calling setValue(50) after examining the last file. <p>The <tt>parent</tt> argument is the dialog's parent widget. The parent, <tt>parent</tt>, and widget flags, <tt>f</tt>, are passed to the QDialog::QDialog() constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}, {@link com.trolltech.qt.gui.QProgressDialog#setLabel(com.trolltech.qt.gui.QLabel) setLabel()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}, {@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}, {@link com.trolltech.qt.gui.QProgressDialog#setMinimum(int) setMinimum()}, and {@link com.trolltech.qt.gui.QProgressDialog#setMaximum(int) setMaximum()}. <br></DD></DT>
*/

    public QProgressDialog(java.lang.String labelText, java.lang.String cancelButtonText, int minimum, int maximum, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QProgressDialog_String_String_int_int_QWidget_WindowFlags(labelText, cancelButtonText, minimum, maximum, parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QProgressDialog_String_String_int_int_QWidget_WindowFlags(java.lang.String labelText, java.lang.String cancelButtonText, int minimum, int maximum, long parent, int flags);

/**
This property holds whether the dialog gets hidden by {@link com.trolltech.qt.gui.QProgressDialog#reset() reset()}. The default is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setAutoReset(boolean) setAutoReset()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoClose")
    @QtBlockedSlot
    public final boolean autoClose()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoClose(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoClose(long __this__nativeId);

/**
This property holds whether the progress dialog calls {@link com.trolltech.qt.gui.QProgressDialog#reset() reset()} as soon as {@link com.trolltech.qt.gui.QProgressDialog#value() value()} equals {@link com.trolltech.qt.gui.QProgressDialog#maximum() maximum()}. The default is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setAutoClose(boolean) setAutoClose()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoReset")
    @QtBlockedSlot
    public final boolean autoReset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoReset(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoReset(long __this__nativeId);

/**
Resets the progress dialog. {@link com.trolltech.qt.gui.QProgressDialog#wasCanceled() wasCanceled()} becomes true until the progress dialog is reset. The progress dialog becomes hidden.
*/

    public final void cancel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cancel(nativeId());
    }
    native void __qt_cancel(long __this__nativeId);

/**
Shows the dialog if it is still hidden after the algorithm has been started and {@link QProgressDialog#minimumDuration() minimumDuration} milliseconds have passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setMinimumDuration(int) setMinimumDuration()}. <br></DD></DT>
*/

    protected final void forceShow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_forceShow(nativeId());
    }
    native void __qt_forceShow(long __this__nativeId);

/**
This property holds the label's text. The default text is an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="labelText")
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
This property holds the highest value represented by the progress bar. The default is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#minimum() minimum}, and {@link com.trolltech.qt.gui.QProgressDialog#setRange(int, int) setRange()}. <br></DD></DT>
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
This property holds the lowest value represented by the progress bar. The default is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#maximum() maximum}, and {@link com.trolltech.qt.gui.QProgressDialog#setRange(int, int) setRange()}. <br></DD></DT>
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
This property holds the time that must pass before the dialog appears. If the expected duration of the task is less than the {@link QProgressDialog#minimumDuration() minimumDuration}, the dialog will not appear at all. This prevents the dialog popping up for tasks that are quickly over. For tasks that are expected to exceed the {@link QProgressDialog#minimumDuration() minimumDuration}, the dialog will pop up after the {@link QProgressDialog#minimumDuration() minimumDuration} time or as soon as any progress is set. <p>If set to 0, the dialog is always shown as soon as any progress is set. The default is 4000 milliseconds.
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumDuration")
    @QtBlockedSlot
    public final int minimumDuration()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumDuration(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimumDuration(long __this__nativeId);

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
Resets the progress dialog. The progress dialog becomes hidden if {@link com.trolltech.qt.gui.QProgressDialog#autoClose() autoClose()} is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setAutoClose(boolean) setAutoClose()}, and {@link com.trolltech.qt.gui.QProgressDialog#setAutoReset(boolean) setAutoReset()}. <br></DD></DT>
*/

    public final void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    native void __qt_reset(long __this__nativeId);

/**
This property holds whether the dialog gets hidden by {@link com.trolltech.qt.gui.QProgressDialog#reset() reset()}. The default is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setAutoReset(boolean) setAutoReset()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoClose")
    @QtBlockedSlot
    public final void setAutoClose(boolean close)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoClose_boolean(nativeId(), close);
    }
    @QtBlockedSlot
    native void __qt_setAutoClose_boolean(long __this__nativeId, boolean close);

/**
This property holds whether the progress dialog calls {@link com.trolltech.qt.gui.QProgressDialog#reset() reset()} as soon as {@link com.trolltech.qt.gui.QProgressDialog#value() value()} equals {@link com.trolltech.qt.gui.QProgressDialog#maximum() maximum()}. The default is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setAutoClose(boolean) setAutoClose()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoReset")
    @QtBlockedSlot
    public final void setAutoReset(boolean reset)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoReset_boolean(nativeId(), reset);
    }
    @QtBlockedSlot
    native void __qt_setAutoReset_boolean(long __this__nativeId, boolean reset);

/**
Sets the progress bar widget to <tt>bar</tt>. The progress dialog resizes to fit. The progress dialog takes ownership of the progress <tt>bar</tt> which will be deleted when necessary, so do not use a progress bar allocated on the stack.
*/

    @QtBlockedSlot
    public final void setBar(com.trolltech.qt.gui.QProgressBar bar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (bar != null) {
            bar.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBar_QProgressBar(nativeId(), bar == null ? 0 : bar.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBar_QProgressBar(long __this__nativeId, long bar);

/**
Sets the cancel button to the push button, <tt>cancelButton</tt>. The progress dialog takes ownership of this button which will be deleted when necessary, so do not pass the address of an object that is on the stack, i.e. use new() to create the button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setCancelButtonText(java.lang.String) setCancelButtonText()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCancelButton(com.trolltech.qt.gui.QPushButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCancelButton_QPushButton(nativeId(), button == null ? 0 : button.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCancelButton_QPushButton(long __this__nativeId, long button);

/**
Sets the cancel button's text to <tt>cancelButtonText</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setCancelButton(com.trolltech.qt.gui.QPushButton) setCancelButton()}. <br></DD></DT>
*/

    public final void setCancelButtonText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCancelButtonText_String(nativeId(), text);
    }
    native void __qt_setCancelButtonText_String(long __this__nativeId, java.lang.String text);

/**
Sets the label to <tt>label</tt>. The progress dialog resizes to fit. The label becomes owned by the progress dialog and will be deleted when necessary, so do not pass the address of an object on the stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QProgressDialog#setLabelText(java.lang.String) setLabelText()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setLabel(com.trolltech.qt.gui.QLabel label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLabel_QLabel(nativeId(), label == null ? 0 : label.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setLabel_QLabel(long __this__nativeId, long label);

/**
This property holds the label's text. The default text is an empty string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="labelText")
    public final void setLabelText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLabelText_String(nativeId(), text);
    }
    native void __qt_setLabelText_String(long __this__nativeId, java.lang.String text);

/**
This property holds the highest value represented by the progress bar. The default is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#minimum() minimum}, and {@link com.trolltech.qt.gui.QProgressDialog#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximum")
    public final void setMaximum(int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), maximum);
    }
    native void __qt_setMaximum_int(long __this__nativeId, int maximum);

/**
This property holds the lowest value represented by the progress bar. The default is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#maximum() maximum}, and {@link com.trolltech.qt.gui.QProgressDialog#setRange(int, int) setRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimum")
    public final void setMinimum(int minimum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), minimum);
    }
    native void __qt_setMinimum_int(long __this__nativeId, int minimum);

/**
This property holds the time that must pass before the dialog appears. If the expected duration of the task is less than the {@link QProgressDialog#minimumDuration() minimumDuration}, the dialog will not appear at all. This prevents the dialog popping up for tasks that are quickly over. For tasks that are expected to exceed the {@link QProgressDialog#minimumDuration() minimumDuration}, the dialog will pop up after the {@link QProgressDialog#minimumDuration() minimumDuration} time or as soon as any progress is set. <p>If set to 0, the dialog is always shown as soon as any progress is set. The default is 4000 milliseconds.
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumDuration")
    public final void setMinimumDuration(int ms)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumDuration_int(nativeId(), ms);
    }
    native void __qt_setMinimumDuration_int(long __this__nativeId, int ms);

/**
Sets the progress dialog's minimum and maximum values to <tt>minimum</tt> and <tt>maximum</tt>, respectively. <p>If <tt>maximum</tt> is smaller than <tt>minimum</tt>, <tt>minimum</tt> becomes the only legal value. <p>If the current value falls outside the new range, the progress dialog is reset with {@link com.trolltech.qt.gui.QProgressDialog#reset() reset()}. <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#minimum() minimum}, and {@link QProgressDialog#maximum() maximum}. <br></DD></DT>
*/

    public final void setRange(int minimum, int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_int_int(nativeId(), minimum, maximum);
    }
    native void __qt_setRange_int_int(long __this__nativeId, int minimum, int maximum);

/**
This property holds the current amount of progress made.  For the progress dialog to work as expected, you should initially set this property to 0 and finally set it to {@link QProgressDialog#maximum() QProgressDialog::maximum()}; you can call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} any number of times in-between. <p><b>Warning:</b> If the progress dialog is modal (see QProgressDialog::QProgressDialog()), this function calls {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QApplication::processEvents()}, so take care that this does not cause undesirable re-entrancy in your code. For example, don't use a QProgressDialog inside a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}! <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#minimum() minimum}, and {@link QProgressDialog#maximum() maximum}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void setValue(int progress)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_int(nativeId(), progress);
    }
    native void __qt_setValue_int(long __this__nativeId, int progress);

/**
This property holds the current amount of progress made.  For the progress dialog to work as expected, you should initially set this property to 0 and finally set it to {@link QProgressDialog#maximum() QProgressDialog::maximum()}; you can call {@link com.trolltech.qt.gui.QProgressDialog#setValue(int) setValue()} any number of times in-between. <p><b>Warning:</b> If the progress dialog is modal (see QProgressDialog::QProgressDialog()), this function calls {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QApplication::processEvents()}, so take care that this does not cause undesirable re-entrancy in your code. For example, don't use a QProgressDialog inside a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}! <p><DT><b>See also:</b><br><DD>{@link QProgressDialog#minimum() minimum}, and {@link QProgressDialog#maximum() maximum}. <br></DD></DT>
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
This property holds whether the dialog was canceled.
*/

    @com.trolltech.qt.QtPropertyReader(name="wasCanceled")
    @QtBlockedSlot
    public final boolean wasCanceled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wasCanceled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wasCanceled(long __this__nativeId);

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
@exclude
*/

    public static native QProgressDialog fromNativePointer(QNativePointer nativePointer);

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

    protected QProgressDialog(QPrivateConstructor p) { super(p); } 
}
