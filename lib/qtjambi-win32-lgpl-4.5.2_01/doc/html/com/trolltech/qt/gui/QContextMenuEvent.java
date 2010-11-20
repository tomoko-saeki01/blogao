package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QContextMenuEvent class contains parameters that describe a context menu event. Context menu events are sent to widgets when a user performs an action associated with opening a context menu. The actions required to open context menus vary between platforms; for example, on Windows, pressing the menu button or clicking the right mouse button will cause this event to be sent. <p>When this event occurs it is customary to show a {@link com.trolltech.qt.gui.QMenu QMenu} with a context menu, if this is relevant to the context. <p>Context menu events contain a special accept flag that indicates whether the receiver accepted the event. If the event handler does not accept the event then, if possible, whatever triggered the event will be handled as a regular input event.
*/
@QtJambiGeneratedClass
public class QContextMenuEvent extends com.trolltech.qt.gui.QInputEvent
{
/**
This enum describes the reason why the event was sent.
*/

    public enum Reason implements com.trolltech.qt.QtEnumerator {
/**
 The mouse caused the event to be sent. Normally this means the right mouse button was clicked, but this is platform dependent.
*/

        Mouse(0),
/**
 The keyboard caused this event to be sent. On Windows, this means the menu button was pressed.
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
<brief>Returns the QContextMenuEvent$Reason constant with the specified <tt>int</tt>.</brief>
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
Constructs a context menu event object with the accept parameter flag set to false. <p>The <tt>reason</tt> parameter must be {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Mouse } or {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Keyboard }. <p>The <tt>pos</tt> parameter specifies the mouse position relative to the receiving widget. <p>The {@link com.trolltech.qt.gui.QContextMenuEvent#globalPos() globalPos()} is initialized to {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}, which may not be appropriate. Use the other constructor to specify the global position explicitly.
*/

    public QContextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent.Reason reason, com.trolltech.qt.core.QPoint pos){
        super((QPrivateConstructor)null);
        __qt_QContextMenuEvent_Reason_QPoint(reason.value(), pos == null ? 0 : pos.nativeId());
    }

    native void __qt_QContextMenuEvent_Reason_QPoint(int reason, long pos);

/**
Constructs a context menu event object with the accept parameter flag set to false. <p>The <tt>reason</tt> parameter must be {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Mouse } or {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Keyboard }. <p>The <tt>pos</tt> parameter specifies the mouse position relative to the receiving widget. <tt>globalPos</tt> is the mouse position in absolute coordinates.
*/

    public QContextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent.Reason reason, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos){
        super((QPrivateConstructor)null);
        __qt_QContextMenuEvent_Reason_QPoint_QPoint(reason.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId());
    }

    native void __qt_QContextMenuEvent_Reason_QPoint_QPoint(int reason, long pos, long globalPos);


/**
This is an overloaded method provided for convenience.
*/

    public QContextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent.Reason reason, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this(reason, pos, globalPos, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
Constructs a context menu event object with the accept parameter flag set to false. <p>The <tt>reason</tt> parameter must be {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Mouse } or {@link com.trolltech.qt.gui.QContextMenuEvent.Reason QContextMenuEvent::Keyboard }. <p>The <tt>pos</tt> parameter specifies the mouse position relative to the receiving widget. <tt>globalPos</tt> is the mouse position in absolute coordinates. The <tt>modifiers</tt> holds the keyboard modifiers.
*/

    public QContextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent.Reason reason, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers){
        super((QPrivateConstructor)null);
        __qt_QContextMenuEvent_Reason_QPoint_QPoint_KeyboardModifiers(reason.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId(), modifiers.value());
    }

    native void __qt_QContextMenuEvent_Reason_QPoint_QPoint_KeyboardModifiers(int reason, long pos, long globalPos, int modifiers);

/**
Returns the global position of the mouse pointer at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#x() x()}, {@link com.trolltech.qt.gui.QContextMenuEvent#y() y()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#pos() pos()}. <br></DD></DT>
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
Returns the global x position of the mouse pointer at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the global y position of the mouse pointer at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the position of the mouse pointer relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#x() x()}, {@link com.trolltech.qt.gui.QContextMenuEvent#y() y()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the reason for this context event.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QContextMenuEvent.Reason reason()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QContextMenuEvent.Reason.resolve(__qt_reason(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_reason(long __this__nativeId);

/**
Returns the x position of the mouse pointer, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#y() y()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#pos() pos()}. <br></DD></DT>
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
Returns the y position of the mouse pointer, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QContextMenuEvent#x() x()}, and {@link com.trolltech.qt.gui.QContextMenuEvent#pos() pos()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setReas(int reas)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReas_int(nativeId(), reas);
    }
    @QtBlockedSlot
    native void __qt_setReas_int(long __this__nativeId, int reas);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int reas()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_reas(nativeId());
    }
    @QtBlockedSlot
    native int __qt_reas(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setGp(com.trolltech.qt.core.QPoint gp)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGp_QPoint(nativeId(), gp == null ? 0 : gp.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGp_QPoint(long __this__nativeId, long gp);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint gp()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_gp(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_gp(long __this__nativeId);

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

    public static native QContextMenuEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QContextMenuEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QContextMenuEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
