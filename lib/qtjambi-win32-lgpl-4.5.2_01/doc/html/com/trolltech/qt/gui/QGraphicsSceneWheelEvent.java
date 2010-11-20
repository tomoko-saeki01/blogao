package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneWheelEvent class provides wheel events in the graphics view framework. he QGraphicsSceneWheelEvent class provides wheel events in the graphics view framework. {@link com.trolltech.qt.gui.QWheelEvent QWheelEvent}s received by a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} are translated into QGraphicsSceneWheelEvents; it translates the {@link com.trolltech.qt.gui.QWheelEvent#globalPos() QWheelEvent::globalPos()} into item, scene, and screen coordinates ({@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#screenPos() screenPos()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent QGraphicsSceneContextMenuEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}, and {@link com.trolltech.qt.gui.QWheelEvent QWheelEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneWheelEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneWheelEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneWheelEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneWheelEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneWheelEvent_Type(int type);

/**
Returns the mouse buttons that were pressed when the wheel event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#modifiers() modifiers()}. <br></DD></DT>
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
Returns the distance that the wheel is rotated, in eighths (1/8s) of a degree. A positive value indicates that the wheel was rotated forwards away from the user; a negative value indicates that the wheel was rotated backwards toward the user. <p>Most mouse types work in steps of 15 degrees, in which case the delta value is a multiple of 120 (== 15 * 8).
*/

    @QtBlockedSlot
    public final int delta()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_delta(nativeId());
    }
    @QtBlockedSlot
    native int __qt_delta(long __this__nativeId);

/**
Returns the keyboard modifiers that were active when the wheel event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#buttons() buttons()}. <br></DD></DT>
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
Returns the wheel orientation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Returns the position of the cursor in item coordinates when the wheel event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the position of the cursor in scene coordinates when the wheel event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the position of the cursor in screen coordinates when the wheel event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent#scenePos() scenePos()}. <br></DD></DT>
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
    public final void setDelta(int delta)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDelta_int(nativeId(), delta);
    }
    @QtBlockedSlot
    native void __qt_setDelta_int(long __this__nativeId, int delta);


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
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

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

    public static native QGraphicsSceneWheelEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneWheelEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneWheelEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
