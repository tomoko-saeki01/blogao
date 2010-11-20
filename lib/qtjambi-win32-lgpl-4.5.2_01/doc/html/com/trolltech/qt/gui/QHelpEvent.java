package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QHelpEvent class provides an event that is used to request helpful information about a particular point in a widget. This event can be intercepted in applications to provide tooltips or "What's This?" help for custom widgets. The {@link com.trolltech.qt.core.QEvent#type() type()} can be either {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip } or {@link com.trolltech.qt.core.QEvent.Type QEvent::WhatsThis }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip QToolTip}, {@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent}, and {@link com.trolltech.qt.gui.QWhatsThisClickedEvent QWhatsThisClickedEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHelpEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a help event with the given <tt>type</tt> corresponding to the widget-relative position specified by <tt>pos</tt> and the global position specified by <tt>globalPos</tt>. <p><tt>type</tt> must be either {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip } or {@link com.trolltech.qt.core.QEvent.Type QEvent::WhatsThis }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    public QHelpEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos){
        super((QPrivateConstructor)null);
        __qt_QHelpEvent_Type_QPoint_QPoint(type.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId());
    }

    native void __qt_QHelpEvent_Type_QPoint_QPoint(int type, long pos, long globalPos);

/**
Returns the mouse cursor position when the event was generated in global coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}, {@link com.trolltech.qt.gui.QHelpEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalY() globalY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint globalPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_globalPos(long __this__nativeId);

/**
Same as {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}.{@link com.trolltech.qt.gui.QHelpEvent#x() x()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#x() x()}, {@link com.trolltech.qt.gui.QHelpEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int globalX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_globalX(long __this__nativeId);

/**
Same as {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}.{@link com.trolltech.qt.gui.QHelpEvent#y() y()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#y() y()}, {@link com.trolltech.qt.gui.QHelpEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int globalY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_globalY(long __this__nativeId);

/**
Returns the mouse cursor position when the event was generated, relative to the widget to which the event is dispatched. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}, {@link com.trolltech.qt.gui.QHelpEvent#x() x()}, and {@link com.trolltech.qt.gui.QHelpEvent#y() y()}. <br></DD></DT>
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
Same as {@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}.{@link com.trolltech.qt.gui.QHelpEvent#x() x()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#y() y()}, {@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x(long __this__nativeId);

/**
Same as {@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}.{@link com.trolltech.qt.gui.QHelpEvent#y() y()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent#x() x()}, {@link com.trolltech.qt.gui.QHelpEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QHelpEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y(long __this__nativeId);

/**
@exclude
*/

    public static native QHelpEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHelpEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QHelpEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
