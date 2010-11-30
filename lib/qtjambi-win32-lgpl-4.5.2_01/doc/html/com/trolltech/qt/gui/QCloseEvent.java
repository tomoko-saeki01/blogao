package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCloseEvent class contains parameters that describe a close event. Close events are sent to widgets that the user wants to close, usually by choosing "Close" from the window menu, or by clicking the <b>X</b> title bar button. They are also sent when you call {@link com.trolltech.qt.gui.QWidget#close() QWidget::close()} to close a widget programmatically. <p>Close events contain a flag that indicates whether the receiver wants the widget to be closed or not. When a widget accepts the close event, it is hidden (and destroyed if it was created with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } flag). If it refuses to accept the close event nothing happens. (Under X11 it is possible that the window manager will forcibly close the window; but at the time of writing we are not aware of any window manager that does this.) <p>The event handler {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) QWidget::closeEvent()} receives close events. The default implementation of this event handler accepts the close event. If you do not want your widget to be hidden, or want some special handing, you should reimplement the event handler and {@link com.trolltech.qt.core.QEvent#ignore() ignore()} the event. <p>The {@link <a href="../qtjambi-application.html#close-event-handler">closeEvent() in the Application example</a>} shows a close event handler that asks whether to save a document before closing. <p>If you want the widget to be deleted when it is closed, create it with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } flag. This is very useful for independent top-level windows in a multi-window application. <p>{@link com.trolltech.qt.core.QObject QObject}s emits the destroyed() signal when they are deleted. <p>If the last top-level window is closed, the {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() } signal is emitted. <p>The isAccepted() function returns true if the event's receiver has agreed to close the widget; call {@link com.trolltech.qt.core.QEvent#accept() accept()} to agree to close the widget and call {@link com.trolltech.qt.core.QEvent#ignore() ignore()} if the receiver of this event does not want the widget to be closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}, {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()}, QObject::destroyed(), {@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()}, {@link com.trolltech.qt.core.QCoreApplication#quit() QCoreApplication::quit()}, and {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() }. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCloseEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a close event object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#accept() accept()}. <br></DD></DT>
*/

    public QCloseEvent(){
        super((QPrivateConstructor)null);
        __qt_QCloseEvent();
    }

    native void __qt_QCloseEvent();

/**
@exclude
*/

    public static native QCloseEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCloseEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QCloseEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
