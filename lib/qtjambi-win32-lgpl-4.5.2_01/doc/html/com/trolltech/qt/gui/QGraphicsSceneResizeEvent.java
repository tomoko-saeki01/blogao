package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSceneResizeEvent class provides events for widget resizing in the graphics view framework. A {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} sends itself a QGraphicsSceneResizeEvent immediately when its geometry changes. <p>It's similar to {@link com.trolltech.qt.gui.QResizeEvent QResizeEvent}, but its sizes, {@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent#oldSize() oldSize()} and {@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent#newSize() newSize()}, use {@link com.trolltech.qt.core.QSizeF QSizeF} instead of {@link com.trolltech.qt.core.QSize QSize}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) QGraphicsWidget::setGeometry()}, and {@link QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) QGraphicsWidget::resize()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSceneResizeEvent extends com.trolltech.qt.gui.QGraphicsSceneEvent
{

/**
Constructs a QGraphicsSceneResizeEvent.
*/

    public QGraphicsSceneResizeEvent(){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSceneResizeEvent();
    }

    native void __qt_QGraphicsSceneResizeEvent();

/**
Returns the new size (i. ., the current size). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent#oldSize() oldSize()}, and {@link QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) QGraphicsWidget::resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF newSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_newSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_newSize(long __this__nativeId);

/**
Returns the old size (i. ., the size immediately before the widget was resized). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent#newSize() newSize()}, and {@link QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) QGraphicsWidget::resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF oldSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_oldSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_oldSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setNewSize(com.trolltech.qt.core.QSizeF size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNewSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setNewSize_QSizeF(long __this__nativeId, long size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setOldSize(com.trolltech.qt.core.QSizeF size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOldSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOldSize_QSizeF(long __this__nativeId, long size);

/**
@exclude
*/

    public static native QGraphicsSceneResizeEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSceneResizeEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QGraphicsSceneResizeEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
