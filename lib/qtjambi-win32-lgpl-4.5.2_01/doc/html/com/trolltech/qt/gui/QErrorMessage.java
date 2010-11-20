package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QErrorMessage class provides an error message display dialog. An error message widget consists of a text label and a checkbox. The checkbox lets the user control whether the same error message will be displayed again in the future, typically displaying the text, "Show this message again" translated into the appropriate local language. <p>For production applications, the class can be used to display messages which the user only needs to see once. To use QErrorMessage like this, you create the dialog in the usual way, and show it by calling the {@link com.trolltech.qt.gui.QErrorMessage#showMessage(java.lang.String) showMessage()} slot or connecting signals to it. <p>The static {@link com.trolltech.qt.gui.QErrorMessage#qtHandler() qtHandler()} function installs a message handler using qInstallMsgHandler() and creates a QErrorMessage that displays qDebug(), qWarning() and qFatal() messages. This is most useful in environments where no console is available to display warnings and error messages. <p>In both cases QErrorMessage will queue pending messages and display them in order, with each new message being shown as soon as the user has accepted the previous message. Once the user has specified that a message is not to be shown again it is automatically skipped, and the dialog will show the next appropriate message in the queue. <p>The {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs</a>} example shows how to use QErrorMessage as well as other built-in Qt dialogs. <br><center><img src="../images/qerrormessage.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}, {@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) QStatusBar::showMessage()}, and {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QErrorMessage extends com.trolltech.qt.gui.QDialog
{


/**
Constructs and installs an error handler window with the given <tt>parent</tt>.
*/

    public QErrorMessage() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs and installs an error handler window with the given <tt>parent</tt>.
*/

    public QErrorMessage(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QErrorMessage_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QErrorMessage_QWidget(long parent);

/**
Shows the given message, <tt>message</tt>, and returns immediately. If the user has requested for the message not to be shown again, this function does nothing. <p>Normally, the message is displayed immediately. However, if there are pending messages, it will be queued to be displayed later.
*/

    public final void showMessage(java.lang.String message)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMessage_String(nativeId(), message);
    }
    native void __qt_showMessage_String(long __this__nativeId, java.lang.String message);

/**
This is an overloaded member function, provided for convenience. <p>Shows the given message, <tt>message</tt>, and returns immediately. If the user has requested for messages of type, <tt>type</tt>, not to be shown again, this function does nothing. <p>Normally, the message is displayed immediately. However, if there are pending messages, it will be queued to be displayed later. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QErrorMessage#showMessage(java.lang.String) showMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String message, java.lang.String type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMessage_String_String(nativeId(), message, type);
    }
    native void __qt_showMessage_String_String(long __this__nativeId, java.lang.String message, java.lang.String type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void done(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_done_int(long __this__nativeId, int arg__1);

/**
Returns a pointer to a QErrorMessage object that outputs the default Qt messages. This function creates such an object, if there isn't one already.
*/

    public native static com.trolltech.qt.gui.QErrorMessage qtHandler();

/**
@exclude
*/

    public static native QErrorMessage fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QErrorMessage(QPrivateConstructor p) { super(p); } 
}
