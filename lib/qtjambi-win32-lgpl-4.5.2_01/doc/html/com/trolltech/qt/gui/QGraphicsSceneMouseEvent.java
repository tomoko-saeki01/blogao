package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneMouseEvent class provides mouse events in the graphics view framework. When a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} receives a {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, it translates it to a QGraphicsSceneMouseEvent. The event is then forwarded to the {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} associated with the view. <p>In addition to containing the item, scene, and screen coordinates of the event (as {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}), mouse events also contain the coordinates of the previous mouse event received by the view. These can be retrieved with {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastPos() lastPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScreenPos() lastScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScenePos() lastScenePos()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent QGraphicsSceneContextMenuEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent QGraphicsSceneWheelEvent}, and {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneMouseEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneMouseEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneMouseEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneMouseEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneMouseEvent_Type(int type);

/**
Returns the mouse button (if any) that caused the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttons() buttons()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#modifiers() modifiers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButton button()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.MouseButton.resolve(__qt_button(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_button(long __this__nativeId);

/**
Returns the mouse cursor position in item coordinates where the specified <tt>button</tt> was clicked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownScenePos(com.trolltech.qt.core.Qt.MouseButton) buttonDownScenePos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownScreenPos(com.trolltech.qt.core.Qt.MouseButton) buttonDownScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF buttonDownPos(com.trolltech.qt.core.Qt.MouseButton button)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttonDownPos_MouseButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_buttonDownPos_MouseButton(long __this__nativeId, int button);

/**
Returns the mouse cursor position in scene coordinates where the specified <tt>button</tt> was clicked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownPos(com.trolltech.qt.core.Qt.MouseButton) buttonDownPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownScreenPos(com.trolltech.qt.core.Qt.MouseButton) buttonDownScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF buttonDownScenePos(com.trolltech.qt.core.Qt.MouseButton button)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttonDownScenePos_MouseButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_buttonDownScenePos_MouseButton(long __this__nativeId, int button);

/**
Returns the mouse cursor position in screen coordinates where the specified <tt>button</tt> was clicked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownPos(com.trolltech.qt.core.Qt.MouseButton) buttonDownPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttonDownScenePos(com.trolltech.qt.core.Qt.MouseButton) buttonDownScenePos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint buttonDownScreenPos(com.trolltech.qt.core.Qt.MouseButton button)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttonDownScreenPos_MouseButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_buttonDownScreenPos_MouseButton(long __this__nativeId, int button);

/**
Returns the combination of mouse buttons that were pressed at the time the event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#button() button()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#modifiers() modifiers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButtons buttons()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_buttons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_buttons(long __this__nativeId);

/**
Returns the last recorded mouse cursor position in item coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScenePos() lastScenePos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScreenPos() lastScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}. <br></DD></DT>
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
Returns the last recorded mouse cursor position in scene coordinates. The last recorded position is the position of the previous mouse event received by the view that created the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastPos() lastPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScreenPos() lastScreenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}. <br></DD></DT>
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
Returns the last recorded mouse cursor position in screen coordinates. The last recorded position is the position of the previous mouse event received by the view that created the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastPos() lastPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScenePos() lastScenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the keyboard modifiers in use at the time the event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#buttons() buttons()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#button() button()}. <br></DD></DT>
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
Returns the mouse cursor position in item coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastPos() lastPos()}. <br></DD></DT>
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
Returns the mouse cursor position in scene coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScenePos() lastScenePos()}. <br></DD></DT>
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
Returns the mouse cursor position in screen coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScreenPos() lastScreenPos()}. <br></DD></DT>
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
    public final void setButton(com.trolltech.qt.core.Qt.MouseButton button)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButton_MouseButton(nativeId(), button.value());
    }
    @QtBlockedSlot
    native void __qt_setButton_MouseButton(long __this__nativeId, int button);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setButtonDownPos(com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonDownPos_MouseButton_QPointF(nativeId(), button.value(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setButtonDownPos_MouseButton_QPointF(long __this__nativeId, int button, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setButtonDownScenePos(com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonDownScenePos_MouseButton_QPointF(nativeId(), button.value(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setButtonDownScenePos_MouseButton_QPointF(long __this__nativeId, int button, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setButtonDownScreenPos(com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.QPoint pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonDownScreenPos_MouseButton_QPoint(nativeId(), button.value(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setButtonDownScreenPos_MouseButton_QPoint(long __this__nativeId, int button, long pos);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setButtons(com.trolltech.qt.core.Qt.MouseButton ... buttons) {
        this.setButtons(new com.trolltech.qt.core.Qt.MouseButtons(buttons));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setButtons(com.trolltech.qt.core.Qt.MouseButtons buttons)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtons_MouseButtons(nativeId(), buttons.value());
    }
    @QtBlockedSlot
    native void __qt_setButtons_MouseButtons(long __this__nativeId, int buttons);

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

    public static native QGraphicsSceneMouseEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneMouseEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneMouseEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
