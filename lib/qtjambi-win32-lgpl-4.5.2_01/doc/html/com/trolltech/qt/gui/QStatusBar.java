package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStatusBar class provides a horizontal bar suitable for presenting status information. Each status indicator falls into one of three categories: <ul><li> Temporary - briefly occupies most of the status bar. Used to explain tool tip texts or menu entries, for example.</li><li> Normal - occupies part of the status bar and may be hidden by temporary messages. Used to display the page and line number in a word processor, for example.</li><li> Permanent - is never hidden. Used for important mode indications, for example, some applications put a Caps Lock indicator in the status bar.</li></ul> QStatusBar lets you display all three types of indicators. <p>Typically, a request for the status bar functionality occurs in relation to a {@link com.trolltech.qt.gui.QMainWindow QMainWindow} object. {@link com.trolltech.qt.gui.QMainWindow QMainWindow} provides a main application window, with a menu bar, tool bars, dock widgets and a status bar around a large central widget. The status bar can be retrieved using the {@link com.trolltech.qt.gui.QMainWindow#statusBar() QMainWindow::statusBar()} function, and replaced using the {@link com.trolltech.qt.gui.QMainWindow#setStatusBar(com.trolltech.qt.gui.QStatusBar) QMainWindow::setStatusBar()} function. <p>Use the {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} slot to display a temporary message:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MainWindow::createStatusBar()
{
    statusBar()-&gt;showMessage(tr("Ready"));
}
</pre> To remove a temporary message, use the {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()} slot, or set a time limit when calling {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()}. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MainWindow::print()
{
#ifndef QT_NO_PRINTDIALOG
    QTextDocument *document = textEdit-&gt;document();
    QPrinter printer;

    QPrintDialog *dlg = new QPrintDialog(&printer, this);
    if (dlg-&gt;exec() != QDialog::Accepted)
        return;

    document-&gt;print(&printer);

    statusBar()-&gt;showMessage(tr("Ready"), 2000);
#endif
}
</pre> Use the {@link com.trolltech.qt.gui.QStatusBar#currentMessage() currentMessage()} function to retrieve the temporary message currently shown. The QStatusBar class also provide the {@link com.trolltech.qt.gui.QStatusBar#messageChanged messageChanged() } signal which is emitted whenever the temporary status message changes.<a name="permanent-message"> Normal and Permanent messages are displayed by creating a small widget ({@link com.trolltech.qt.gui.QLabel QLabel}, {@link com.trolltech.qt.gui.QProgressBar QProgressBar} or even {@link com.trolltech.qt.gui.QToolButton QToolButton}) and then adding it to the status bar using the {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} or the {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()} function. Use the {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()} function to remove such messages from the status bar. <pre class="snippet">
        statusBar().addWidget(new MyReadWriteIndication());
</pre> By default QStatusBar provides a {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} in the lower-right corner. You can disable it using the {@link com.trolltech.qt.gui.QStatusBar#setSizeGripEnabled(boolean) setSizeGripEnabled()} function. Use the {@link com.trolltech.qt.gui.QStatusBar#isSizeGripEnabled() isSizeGripEnabled()} function to determine the current status of the size grip. <br><center><img src="../images/plastique-statusbar.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow QMainWindow}, {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent}, {@link <a href="../guibooks.html">GUI Design Handbook: Status Bar</a>}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStatusBar extends com.trolltech.qt.gui.QWidget
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: message)&gt;:<p> This signal is emitted whenever the temporary status message changes. The new temporary message is passed in the <tt>message</tt> parameter which is a null-string when the message has been removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()}, and {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final Signal1<java.lang.String> messageChanged = new Signal1<java.lang.String>();

    private final void messageChanged(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_messageChanged_String(nativeId(), text);
    }
    native void __qt_messageChanged_String(long __this__nativeId, java.lang.String text);


/**
Constructs a status bar with a size grip and the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#setSizeGripEnabled(boolean) setSizeGripEnabled()}. <br></DD></DT>
*/

    public QStatusBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a status bar with a size grip and the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#setSizeGripEnabled(boolean) setSizeGripEnabled()}. <br></DD></DT>
*/

    public QStatusBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QStatusBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStatusBar_QWidget(long parent);


/**
Adds the given <tt>widget</tt> permanently to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>Permanently means that the widget may not be obscured by temporary messages. It is is located at the far right of the status bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#insertPermanentWidget(int, com.trolltech.qt.gui.QWidget) insertPermanentWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addPermanentWidget(com.trolltech.qt.gui.QWidget widget) {
        addPermanentWidget(widget, (int)0);
    }
/**
Adds the given <tt>widget</tt> permanently to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>Permanently means that the widget may not be obscured by temporary messages. It is is located at the far right of the status bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#insertPermanentWidget(int, com.trolltech.qt.gui.QWidget) insertPermanentWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addPermanentWidget(com.trolltech.qt.gui.QWidget widget, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPermanentWidget_QWidget_int(nativeId(), widget == null ? 0 : widget.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addPermanentWidget_QWidget_int(long __this__nativeId, long widget, int stretch);


/**
Adds the given <tt>widget</tt> to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>The widget is located to the far left of the first permanent widget (see {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}) and may be obscured by temporary messages. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget widget) {
        addWidget(widget, (int)0);
    }
/**
Adds the given <tt>widget</tt> to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>The widget is located to the far left of the first permanent widget (see {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}) and may be obscured by temporary messages. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget widget, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addWidget_QWidget_int(nativeId(), widget == null ? 0 : widget.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget_int(long __this__nativeId, long widget, int stretch);

/**
Removes any temporary message being shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#currentMessage() currentMessage()}, {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()}, and {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}. <br></DD></DT>
*/

    public final void clearMessage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMessage(nativeId());
    }
    native void __qt_clearMessage(long __this__nativeId);

/**
Returns the temporary message currently shown, or an empty string if there is no such message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String currentMessage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentMessage(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_currentMessage(long __this__nativeId);

/**
Ensures that the right widgets are visible. <p>Used by the {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} and {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()} functions.
*/

    @QtBlockedSlot
    protected final void hideOrShow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideOrShow(nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideOrShow(long __this__nativeId);


/**
Inserts the given <tt>widget</tt> at the given <tt>index</tt> permanently to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. If <tt>index</tt> is out of range, the widget is appended (in which case it is the actual index of the widget that is returned). <p>The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>Permanently means that the widget may not be obscured by temporary messages. It is is located at the far right of the status bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertPermanentWidget(int index, com.trolltech.qt.gui.QWidget widget) {
        return insertPermanentWidget(index, widget, (int)0);
    }
/**
Inserts the given <tt>widget</tt> at the given <tt>index</tt> permanently to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. If <tt>index</tt> is out of range, the widget is appended (in which case it is the actual index of the widget that is returned). <p>The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>Permanently means that the widget may not be obscured by temporary messages. It is is located at the far right of the status bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertPermanentWidget(int index, com.trolltech.qt.gui.QWidget widget, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertPermanentWidget_int_QWidget_int(nativeId(), index, widget == null ? 0 : widget.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertPermanentWidget_int_QWidget_int(long __this__nativeId, int index, long widget, int stretch);


/**
Inserts the given <tt>widget</tt> at the given <tt>index</tt> to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. If <tt>index</tt> is out of range, the widget is appended (in which case it is the actual index of the widget that is returned). <p>The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>The widget is located to the far left of the first permanent widget (see {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}) and may be obscured by temporary messages. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertWidget(int index, com.trolltech.qt.gui.QWidget widget) {
        return insertWidget(index, widget, (int)0);
    }
/**
Inserts the given <tt>widget</tt> at the given <tt>index</tt> to this status bar, reparenting the widget if it isn't already a child of this QStatusBar object. If <tt>index</tt> is out of range, the widget is appended (in which case it is the actual index of the widget that is returned). <p>The <tt>stretch</tt> parameter is used to compute a suitable size for the given <tt>widget</tt> as the status bar grows and shrinks. The default stretch factor is 0, i.e giving the widget a minimum of space. <p>The widget is located to the far left of the first permanent widget (see {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}) and may be obscured by temporary messages. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QStatusBar#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertWidget(int index, com.trolltech.qt.gui.QWidget widget, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertWidget_int_QWidget_int(nativeId(), index, widget == null ? 0 : widget.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertWidget_int_QWidget_int(long __this__nativeId, int index, long widget, int stretch);

/**
This property holds whether the {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} in the bottom-right corner of the status bar is enabled. The size grip is enabled by default.
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
Changes the status bar's appearance to account for item changes. <p>Special subclasses may need this function, but geometry management will usually take care of any necessary rearrangements.
*/

    @QtBlockedSlot
    protected final void reformat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reformat(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reformat(long __this__nativeId);

/**
Removes the specified <tt>widget</tt> from the status bar. <p><b>Note:</b> This function does not delete the widget but hides it. To add the widget again, you must call both the {@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} and {@link com.trolltech.qt.gui.QWidget#show() show()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QStatusBar#addPermanentWidget(com.trolltech.qt.gui.QWidget) addPermanentWidget()}, and {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds whether the {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip} in the bottom-right corner of the status bar is enabled. The size grip is enabled by default.
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
Hides the normal status indications and displays the given <tt>message</tt> for the specified number of milli-seconds (<tt>timeout</tt>). If <tt>timeout</tt> is 0 (default), the <tt>message</tt> remains displayed until the {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()} slot is called or until the {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} slot is called again to change the message. <p>Note that {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} is called to show temporary explanations of tool tip texts, so passing a <tt>timeout</tt> of 0 is not sufficient to display a permanent message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#messageChanged messageChanged() }, {@link com.trolltech.qt.gui.QStatusBar#currentMessage() currentMessage()}, and {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String text) {
        showMessage(text, (int)0);
    }
/**
Hides the normal status indications and displays the given <tt>message</tt> for the specified number of milli-seconds (<tt>timeout</tt>). If <tt>timeout</tt> is 0 (default), the <tt>message</tt> remains displayed until the {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()} slot is called or until the {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} slot is called again to change the message. <p>Note that {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) showMessage()} is called to show temporary explanations of tool tip texts, so passing a <tt>timeout</tt> of 0 is not sufficient to display a permanent message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#messageChanged messageChanged() }, {@link com.trolltech.qt.gui.QStatusBar#currentMessage() currentMessage()}, and {@link com.trolltech.qt.gui.QStatusBar#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String text, int timeout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMessage_String_int(nativeId(), text, timeout);
    }
    native void __qt_showMessage_String_int(long __this__nativeId, java.lang.String text, int timeout);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

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
@exclude
*/

    public static native QStatusBar fromNativePointer(QNativePointer nativePointer);

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

    protected QStatusBar(QPrivateConstructor p) { super(p); } 
}
