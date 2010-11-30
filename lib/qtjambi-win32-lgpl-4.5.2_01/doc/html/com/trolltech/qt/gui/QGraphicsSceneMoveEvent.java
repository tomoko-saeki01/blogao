package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneMoveEvent class provides events for widget moving in the graphics view framework. A {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} sends itself a QGraphicsSceneMoveEvent immediately when its local position changes. The delivery is implemented as part of {@link com.trolltech.qt.gui.QGraphicsItem#itemChange(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange, java.lang.Object) QGraphicsItem::itemChange()}. <p>It's similar to {@link com.trolltech.qt.gui.QMoveEvent QMoveEvent}, but its positions, {@link com.trolltech.qt.gui.QGraphicsSceneMoveEvent#oldPos() oldPos()} and {@link com.trolltech.qt.gui.QGraphicsSceneMoveEvent#newPos() newPos()}, use {@link com.trolltech.qt.core.QPointF QPointF} instead of {@link com.trolltech.qt.core.QPoint QPoint}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setPos(com.trolltech.qt.core.QPointF) QGraphicsItem::setPos()}, {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange QGraphicsItem::ItemPositionChange }, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange QGraphicsItem::ItemPositionHasChanged }. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneMoveEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{

/**
Constructs a QGraphicsSceneMoveEvent.
*/

    public QGraphicsSceneMoveEvent(){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneMoveEvent();
    }

    native void __qt_QGraphicsSceneMoveEvent();

/**
Returns the new position (i. ., the current position). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMoveEvent#oldPos() oldPos()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setPos(com.trolltech.qt.core.QPointF) QGraphicsItem::setPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF newPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_newPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_newPos(long __this__nativeId);

/**
Returns the old position (i. ., the position immediatly before the widget was moved). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneMoveEvent#newPos() newPos()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setPos(com.trolltech.qt.core.QPointF) QGraphicsItem::setPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF oldPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_oldPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_oldPos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setNewPos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNewPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setNewPos_QPointF(long __this__nativeId, long pos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setOldPos(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOldPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOldPos_QPointF(long __this__nativeId, long pos);

/**
@exclude
*/

    public static native QGraphicsSceneMoveEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneMoveEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneMoveEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
