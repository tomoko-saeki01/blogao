package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDragLeaveEvent class provides an event that is sent to a widget when a drag and drop action leaves it. This event is always preceded by a {@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent} and a series of {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}s. It is not sent if a {@link com.trolltech.qt.gui.QDropEvent QDropEvent} is sent instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent}, {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}, and {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDragLeaveEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QDragLeaveEvent. <p><b>Warning:</b> Do not create a QDragLeaveEvent yourself since these objects rely on Qt's internal state.
*/

    public QDragLeaveEvent(){
        super((QPrivateConstructor)null);
        __qt_QDragLeaveEvent();
    }

    native void __qt_QDragLeaveEvent();

/**
@exclude
*/

    public static native QDragLeaveEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDragLeaveEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDragLeaveEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
