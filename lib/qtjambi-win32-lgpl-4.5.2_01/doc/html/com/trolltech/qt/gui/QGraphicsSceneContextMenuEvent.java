package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneContextMenuEvent class provides context menu events in the graphics view framework. A {@link com.trolltech.qt.gui.QContextMenuEvent QContextMenuEvent} received by a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} is translated into a QGraphicsSceneContextMenuEvent. The {@link com.trolltech.qt.gui.QWheelEvent#globalPos() QWheelEvent::globalPos()} is translated into item, scene, and screen coordinates ({@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#screenPos() screenPos()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}, {@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent QGraphicsSceneWheelEvent}, and {@link com.trolltech.qt.gui.QContextMenuEvent QContextMenuEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneContextMenuEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{
/**
This enum describes the reason why the context event was sent.
*/

    public enum Reason implements com.trolltech.qt.QtEnumerator {
/**
 The mouse caused the event to be sent. On most platforms, this means the right mouse button was clicked.
*/

        Mouse(0),
/**
 The keyboard caused this event to be sent. On Windows and Mac OS X, this means the menu button was pressed.
*/

        Keyboard(1),
/**
 The event was sent by some other means (i.e. not by the mouse or keyboard).
*/

        Other(2);

        Reason(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsSceneContextMenuEvent$Reason constant with the specified <tt>int</tt>.</brief>
*/

        public static Reason resolve(int value) {
            return (Reason) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Mouse;
            case 1: return Keyboard;
            case 2: return Other;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneContextMenuEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneContextMenuEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneContextMenuEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneContextMenuEvent_Type(int type);

/**
Returns the keyboard modifiers in use when the context menu was requested.
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
Returns the position of the mouse cursor in item coordinates at the moment the the context menu was requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the reason for the context menu event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent.Reason QGraphicsSceneContextMenuEvent::Reason }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent.Reason reason()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent.Reason.resolve(__qt_reason(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_reason(long __this__nativeId);

/**
Returns the position of the mouse cursor in scene coordinates at the moment the the context menu was requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the position of the mouse cursor in screen coordinates at the moment the the context menu was requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent#scenePos() scenePos()}. <br></DD></DT>
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
    public final void setReason(com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent.Reason reason)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReason_Reason(nativeId(), reason.value());
    }
    @QtBlockedSlot
    native void __qt_setReason_Reason(long __this__nativeId, int reason);

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

    public static native QGraphicsSceneContextMenuEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneContextMenuEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneContextMenuEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
