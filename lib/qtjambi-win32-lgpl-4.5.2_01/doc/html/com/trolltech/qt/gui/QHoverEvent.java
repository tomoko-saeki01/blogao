package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QHoverEvent class contains parameters that describe a mouse event. Mouse events occur when a mouse cursor is moved into, out of, or within a widget, and if the widget has the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_Hover } attribute. <p>The function {@link com.trolltech.qt.gui.QHoverEvent#pos() pos()} gives the current cursor position, while {@link com.trolltech.qt.gui.QHoverEvent#oldPos() oldPos()} gives the old mouse position.
*/
@QtJambiGeneratedClass
public class QHoverEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a hover event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::HoverEnter }, {@link com.trolltech.qt.core.QEvent.Type QEvent::HoverLeave }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::HoverMove }. <p>The <tt>pos</tt> is the current mouse cursor's position relative to the receiving widget, while <tt>oldPos</tt> is the previous mouse cursor's position relative to the receiving widget.
*/

    public QHoverEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint oldPos){
        super((QPrivateConstructor)null);
        __qt_QHoverEvent_Type_QPoint_QPoint(type.value(), pos == null ? 0 : pos.nativeId(), oldPos == null ? 0 : oldPos.nativeId());
    }

    native void __qt_QHoverEvent_Type_QPoint_QPoint(int type, long pos, long oldPos);

/**
Returns the previous position of the mouse cursor, relative to the widget that received the event. If there is no previous position, {@link com.trolltech.qt.gui.QHoverEvent#oldPos() oldPos()} will return the same position as {@link com.trolltech.qt.gui.QHoverEvent#pos() pos()}. <p>On {@link com.trolltech.qt.core.QEvent.Type QEvent::HoverEnter } events, this position will always be {@link com.trolltech.qt.core.QPoint QPoint}(-1, -1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHoverEvent#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint oldPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_oldPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_oldPos(long __this__nativeId);

/**
Returns the position of the mouse cursor, relative to the widget that received the event. <p>On {@link com.trolltech.qt.core.QEvent.Type QEvent::HoverLeave } events, this position will always be {@link com.trolltech.qt.core.QPoint QPoint}(-1, -1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHoverEvent#oldPos() oldPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setOp(com.trolltech.qt.core.QPoint op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOp_QPoint(nativeId(), op == null ? 0 : op.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOp_QPoint(long __this__nativeId, long op);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint op()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_op(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_op(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setP(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP_QPoint(long __this__nativeId, long p);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint p()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_p(long __this__nativeId);

/**
@exclude
*/

    public static native QHoverEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHoverEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QHoverEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
