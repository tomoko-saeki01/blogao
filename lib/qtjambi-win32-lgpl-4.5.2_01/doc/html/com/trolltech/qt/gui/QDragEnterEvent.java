package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDragEnterEvent class provides an event which is sent to a widget when a drag and drop action enters it. A widget must accept this event in order to receive the {@link com.trolltech.qt.gui.QDragMoveEvent drag move events} that are sent while the drag and drop action is in progress. The drag enter event is always immediately followed by a drag move event. <p>QDragEnterEvent inherits most of its functionality from {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}, which in turn inherits most of its functionality from {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDragLeaveEvent QDragLeaveEvent}, {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}, and {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDragEnterEvent extends com.trolltech.qt.gui.QDragMoveEvent
{


/**
This is an overloaded method provided for convenience.
*/

    public QDragEnterEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this(pos, actions, data, buttons, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
Constructs a QDragEnterEvent that represents a drag entering a widget at the given <tt>point</tt> with mouse and keyboard states specified by <tt>buttons</tt> and <tt>modifiers</tt>. <p>The drag data is passed as MIME-encoded information in <tt>data</tt>, and the specified <tt>actions</tt> describe the possible types of drag and drop operation that can be performed. <p><b>Warning:</b> Do not create a QDragEnterEvent yourself since these objects rely on Qt's internal state.
*/

    public QDragEnterEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers){
        super((QPrivateConstructor)null);
        __qt_QDragEnterEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers(pos == null ? 0 : pos.nativeId(), actions.value(), data == null ? 0 : data.nativeId(), buttons.value(), modifiers.value());
    }

    native void __qt_QDragEnterEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers(long pos, int actions, long data, int buttons, int modifiers);

/**
@exclude
*/

    public static native QDragEnterEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDragEnterEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDragEnterEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
