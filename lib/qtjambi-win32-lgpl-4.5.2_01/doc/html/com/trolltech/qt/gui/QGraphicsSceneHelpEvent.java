package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneHelpEvent class provides events when a tooltip is requested. When a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} receives a {@link com.trolltech.qt.core.QEvent QEvent} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip }, it creates a QGraphicsSceneHelpEvent, which is forwarded to the scene. You can set a tooltip on a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} with {@link com.trolltech.qt.gui.QGraphicsItem#setToolTip(java.lang.String) setToolTip()}; by default {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} displays the tooltip of the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} with the highest z-value (i.e, the top-most item) under the mouse position. <p>{@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} does not forward events when {@link com.trolltech.qt.gui.QWhatsThis "What's This"} and {@link com.trolltech.qt.gui.QStatusTipEvent status tip} help is requested. If you need this, you can reimplement {@link com.trolltech.qt.gui.QAbstractScrollArea#viewportEvent(com.trolltech.qt.core.QEvent) QGraphicsView::viewportEvent()} and forward {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent} events and {@link com.trolltech.qt.core.QEvent QEvents} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::WhatsThis } to the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent QEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneHelpEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneHelpEvent() {
        this(com.trolltech.qt.core.QEvent.Type.None);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneHelpEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneHelpEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneHelpEvent_Type(int type);

/**
Returns the position of the mouse cursor in scene coordinates at the moment the the help event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHelpEvent#screenPos() screenPos()}. <br></DD></DT>
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
Returns the position of the mouse cursor in screen coordinates at the moment the the help event was sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneHelpEvent#scenePos() scenePos()}. <br></DD></DT>
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

    public static native QGraphicsSceneHelpEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneHelpEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneHelpEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
