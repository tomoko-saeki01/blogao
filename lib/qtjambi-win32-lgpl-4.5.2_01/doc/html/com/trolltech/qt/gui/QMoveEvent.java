package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMoveEvent class contains event parameters for move events. Move events are sent to widgets that have been moved to a new position relative to their parent. <p>The event handler {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) QWidget::moveEvent()} receives move events. <p><DT><b>See also:</b><br><DD>{@link QWidget#move(com.trolltech.qt.core.QPoint) QWidget::move()}, and {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMoveEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a move event with the new and old widget positions, <tt>pos</tt> and <tt>oldPos</tt> respectively.
*/

    public QMoveEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint oldPos){
        super((QPrivateConstructor)null);
        __qt_QMoveEvent_QPoint_QPoint(pos == null ? 0 : pos.nativeId(), oldPos == null ? 0 : oldPos.nativeId());
    }

    native void __qt_QMoveEvent_QPoint_QPoint(long pos, long oldPos);

/**
Returns the old position of the widget.
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
Returns the new position of the widget. This excludes the window frame for top level widgets.
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
    protected final void setOldp(com.trolltech.qt.core.QPoint oldp)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOldp_QPoint(nativeId(), oldp == null ? 0 : oldp.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOldp_QPoint(long __this__nativeId, long oldp);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint oldp()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_oldp(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_oldp(long __this__nativeId);

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

    public static native QMoveEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMoveEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QMoveEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
