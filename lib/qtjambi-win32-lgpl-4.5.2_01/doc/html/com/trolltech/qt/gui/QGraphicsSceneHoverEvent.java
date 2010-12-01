package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneHoverEvent class provides hover events in the graphics view framework. When a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} receives a {@link com.trolltech.qt.gui.QHoverEvent QHoverEvent} event, it translates it into QGraphicsSceneHoverEvent. The event is then forwarded to the {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} associated with the view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent QGraphicsSceneContextMenuEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent QGraphicsSceneWheelEvent}, and {@link com.trolltech.qt.gui.QHoverEvent QHoverEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneHoverEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneHoverEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneHoverEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneHoverEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneHoverEvent_Type(int type);

/**
Returns the last recorded mouse cursor position in item coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastScenePos() lastScenePos()}, {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastScreenPos() lastScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF lastPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_lastPos(long __this__nativeId);

/**
Returns the last recorded, the scene coordinates of the previous mouse or hover event received by the view, that created the event mouse cursor position in scene coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastPos() lastPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastScreenPos() lastScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#scenePos() scenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF lastScenePos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastScenePos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_lastScenePos(long __this__nativeId);

/**
Returns the last recorded mouse cursor position in screen coordinates. The last recorded position is the position of the previous mouse or hover event received by the view that created the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastPos() lastPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#lastScenePos() lastScenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#screenPos() screenPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint lastScreenPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastScreenPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_lastScreenPos(long __this__nativeId);

/**
Returns the keyboard modifiers at the moment the the hover event was sent.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.KeyboardModifiers modifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modifiers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modifiers(long __this__nativeId);

/**
Returns the position of the mouse cursor in item coordinates at the moment the the hover event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#screenPos() screenPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_pos(long __this__nativeId);

/**
Returns the position of the mouse cursor in scene coordinates at the moment the the hover event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#screenPos() screenPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF scenePos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scenePos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_scenePos(long __this__nativeId);

/**
Returns the position of the mouse cursor in screen coordinates at the moment the the hover event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent#scenePos() scenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint screenPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_screenPos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setLastPos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastPos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setLastScenePos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastScenePos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastScenePos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setLastScreenPos(com.trolltech.qt.core.QPoint pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastScreenPos_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastScreenPos_QPoint(long __this__nativeId, long pos);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setModifiers(com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this.setModifiers(new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setModifiers(com.trolltech.qt.core.Qt.KeyboardModifiers modifiers)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModifiers_KeyboardModifiers(nativeId(), modifiers.value());
    }
    @QtBlockedSlot
    native void __qt_setModifiers_KeyboardModifiers(long __this__nativeId, int modifiers);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setPos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setScenePos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScenePos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScenePos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setScreenPos(com.trolltech.qt.core.QPoint pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScreenPos_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScreenPos_QPoint(long __this__nativeId, long pos);

/**
@exclude
*/

    public static native QGraphicsSceneHoverEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneHoverEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneHoverEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
