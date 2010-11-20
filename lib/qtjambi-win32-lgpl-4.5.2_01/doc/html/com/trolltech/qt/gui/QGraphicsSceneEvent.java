package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneEvent class provides a base class for all graphics view related events. When a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} receives Qt mouse, keyboard, and drag and drop events ({@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, QDragEvent, etc.), it translates them into instances of QGraphicsSceneEvent subclasses and forwards them to the {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} it displays. The scene then forwards the events to the relevant items. <p>For example, when a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} receives a {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent} of type MousePress as a response to a user click, the view sends a {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent} of type {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneMousePress } to the underlying {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} through its {@link com.trolltech.qt.gui.QGraphicsScene#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()} function. The default {@link com.trolltech.qt.gui.QGraphicsScene#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsScene::mousePressEvent()} implementation determines which item was clicked and forwards the event to {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()}. <p>Subclasses such as {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent} and {@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent QGraphicsSceneContextMenuEvent} provide the coordinates from the original {@link com.trolltech.qt.core.QEvent QEvent} in screen, scene, and item coordinates (see {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#screenPos() screenPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#scenePos() scenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#pos() pos()}). The item coordinates are set by the {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} before it forwards the event to the event to a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. The mouse events also add the possibility to retrieve the coordinates from the last event received by the view (see {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScreenPos() lastScreenPos()}, {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastScenePos() lastScenePos()}, and {@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent#lastPos() lastPos()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent QEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGraphicsSceneEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneEvent_Type(type.value());
    }

    native void __qt_QGraphicsSceneEvent_Type(int type);

/**
Returns the widget where the event originated, or 0 if the event originates from another application.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
@exclude
*/

    public static native QGraphicsSceneEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
