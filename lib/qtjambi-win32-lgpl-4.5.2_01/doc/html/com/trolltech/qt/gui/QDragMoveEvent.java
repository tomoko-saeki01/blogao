package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDragMoveEvent class provides an event which is sent while a drag and drop action is in progress. A widget will receive drag move events repeatedly while the drag is within its boundaries, if it accepts {@link QWidget#setAcceptDrops(boolean) drop events} and {@link com.trolltech.qt.gui.QWidget#dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent) enter events}. The widget should examine the event to see what kind of data it provides, and call the {@link com.trolltech.qt.gui.QDragMoveEvent#accept(com.trolltech.qt.core.QRect) accept()} function to accept the drop if appropriate. <p>The rectangle supplied by the {@link com.trolltech.qt.gui.QDragMoveEvent#answerRect() answerRect()} function can be used to restrict drops to certain parts of the widget. For example, we can check whether the rectangle intersects with the geometry of a certain child widget and only call {@link com.trolltech.qt.gui.QDropEvent#acceptProposedAction() acceptProposedAction()} if that is the case. <p>Note that this class inherits most of its functionality from {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent}, {@link com.trolltech.qt.gui.QDragLeaveEvent QDragLeaveEvent}, and {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDragMoveEvent extends com.trolltech.qt.gui.QDropEvent
{


/**
Creates a QDragMoveEvent of the required <tt>type</tt> indicating that the mouse is at position <tt>pos</tt> given within a widget. <p>The mouse and keyboard states are specified by <tt>buttons</tt> and <tt>modifiers</tt>, and the <tt>actions</tt> describe the types of drag and drop operation that are possible. The drag data is passed as MIME-encoded information in <tt>data</tt>. <p><b>Warning:</b> Do not attempt to create a QDragMoveEvent yourself. These objects rely on Qt's internal state.
*/

    public QDragMoveEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
        this(pos, actions, data, buttons, modifiers, com.trolltech.qt.core.QEvent.Type.DragMove);
    }
/**
Creates a QDragMoveEvent of the required <tt>type</tt> indicating that the mouse is at position <tt>pos</tt> given within a widget. <p>The mouse and keyboard states are specified by <tt>buttons</tt> and <tt>modifiers</tt>, and the <tt>actions</tt> describe the types of drag and drop operation that are possible. The drag data is passed as MIME-encoded information in <tt>data</tt>. <p><b>Warning:</b> Do not attempt to create a QDragMoveEvent yourself. These objects rely on Qt's internal state.
*/

    public QDragMoveEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.DropActions actions, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QDragMoveEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers_Type(pos == null ? 0 : pos.nativeId(), actions.value(), data == null ? 0 : data.nativeId(), buttons.value(), modifiers.value(), type.value());
    }

    native void __qt_QDragMoveEvent_QPoint_DropActions_QMimeData_MouseButtons_KeyboardModifiers_Type(long pos, int actions, long data, int buttons, int modifiers, int type);

/**
The same as {@link com.trolltech.qt.gui.QDragMoveEvent#accept(com.trolltech.qt.core.QRect) accept()}, but also notifies that future moves will also be acceptable if they remain within the <tt>rectangle</tt> given on the widget. This can improve performance, but may also be ignored by the underlying system. <p>If the rectangle is empty, drag move events will be sent continuously. This is useful if the source is scrolling in a timer event.
*/

    @QtBlockedSlot
    public final void accept(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accept_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_accept_QRect(long __this__nativeId, long r);

/**
Returns the rectangle in the widget where the drop will occur if accepted. You can use this information to restrict drops to certain places on the widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect answerRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_answerRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_answerRect(long __this__nativeId);

/**
The opposite of the accept(const {@link com.trolltech.qt.core.QRect QRect}&) function. Moves within the <tt>rectangle</tt> are not acceptable, and will be ignored.
*/

    @QtBlockedSlot
    public final void ignore(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ignore_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_ignore_QRect(long __this__nativeId, long r);

/**

*/

    @QtBlockedSlot
    protected final void setRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRect_QRect(long __this__nativeId, long rect);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect(long __this__nativeId);

/**
@exclude
*/

    public static native QDragMoveEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDragMoveEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDragMoveEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
