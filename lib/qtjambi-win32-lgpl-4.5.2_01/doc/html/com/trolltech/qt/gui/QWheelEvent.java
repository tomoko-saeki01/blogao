package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWheelEvent class contains parameters that describe a wheel event. Wheel events are sent to the widget under the mouse cursor, but if that widget does not handle the event they are sent to the focus widget. The rotation distance is provided by {@link com.trolltech.qt.gui.QWheelEvent#delta() delta()}. The functions {@link com.trolltech.qt.gui.QWheelEvent#pos() pos()} and {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()} return the mouse cursor's location at the time of the event. <p>A wheel event contains a special accept flag that indicates whether the receiver wants the event. You should call {@link com.trolltech.qt.core.QEvent#ignore() ignore()} if you do not handle the wheel event; this ensures that it will be sent to the parent widget. <p>The {@link QWidget#setEnabled(boolean) QWidget::setEnabled()} function can be used to enable or disable mouse and keyboard events for a widget. <p>The event handler {@link com.trolltech.qt.gui.QWidget#wheelEvent(com.trolltech.qt.gui.QWheelEvent) QWidget::wheelEvent()} receives wheel events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link com.trolltech.qt.gui.QWidget#grabMouse() QWidget::grabMouse()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWheelEvent extends com.trolltech.qt.gui.QInputEvent
{


/**
Constructs a wheel event object. <p>The <tt>pos</tt> provides the location of the mouse cursor within the widget. The position in global coordinates is specified by <tt>globalPos</tt>. <tt>delta</tt> contains the rotation distance, <tt>modifiers</tt> holds the keyboard modifier flags at the time of the event, and <tt>orient</tt> holds the wheel's orientation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}, {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()}, {@link com.trolltech.qt.gui.QWheelEvent#delta() delta()}, and state(). <br></DD></DT>
*/

    public QWheelEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, int delta, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
        this(pos, globalPos, delta, buttons, modifiers, com.trolltech.qt.core.Qt.Orientation.Vertical);
    }
/**
Constructs a wheel event object. <p>The <tt>pos</tt> provides the location of the mouse cursor within the widget. The position in global coordinates is specified by <tt>globalPos</tt>. <tt>delta</tt> contains the rotation distance, <tt>modifiers</tt> holds the keyboard modifier flags at the time of the event, and <tt>orient</tt> holds the wheel's orientation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}, {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()}, {@link com.trolltech.qt.gui.QWheelEvent#delta() delta()}, and state(). <br></DD></DT>
*/

    public QWheelEvent(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, int delta, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, com.trolltech.qt.core.Qt.Orientation orient){
        super((QPrivateConstructor)null);
        __qt_QWheelEvent_QPoint_QPoint_int_MouseButtons_KeyboardModifiers_Orientation(pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId(), delta, buttons.value(), modifiers.value(), orient.value());
    }

    native void __qt_QWheelEvent_QPoint_QPoint_int_MouseButtons_KeyboardModifiers_Orientation(long pos, long globalPos, int delta, int buttons, int modifiers, int orient);


/**
Constructs a wheel event object. <p>The position, <tt>pos</tt>, is the location of the mouse cursor within the widget. The {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()} is initialized to {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()} which is usually, but not always, correct. Use the other constructor if you need to specify the global position explicitly. <p>The <tt>buttons</tt> describe the state of the mouse buttons at the time of the event, <tt>delta</tt> contains the rotation distance, <tt>modifiers</tt> holds the keyboard modifier flags at the time of the event, and <tt>orient</tt> holds the wheel's orientation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}, {@link com.trolltech.qt.gui.QWheelEvent#delta() delta()}, and state(). <br></DD></DT>
*/

    public QWheelEvent(com.trolltech.qt.core.QPoint pos, int delta, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
        this(pos, delta, buttons, modifiers, com.trolltech.qt.core.Qt.Orientation.Vertical);
    }
/**
Constructs a wheel event object. <p>The position, <tt>pos</tt>, is the location of the mouse cursor within the widget. The {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()} is initialized to {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()} which is usually, but not always, correct. Use the other constructor if you need to specify the global position explicitly. <p>The <tt>buttons</tt> describe the state of the mouse buttons at the time of the event, <tt>delta</tt> contains the rotation distance, <tt>modifiers</tt> holds the keyboard modifier flags at the time of the event, and <tt>orient</tt> holds the wheel's orientation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}, {@link com.trolltech.qt.gui.QWheelEvent#delta() delta()}, and state(). <br></DD></DT>
*/

    public QWheelEvent(com.trolltech.qt.core.QPoint pos, int delta, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, com.trolltech.qt.core.Qt.Orientation orient){
        super((QPrivateConstructor)null);
        __qt_QWheelEvent_QPoint_int_MouseButtons_KeyboardModifiers_Orientation(pos == null ? 0 : pos.nativeId(), delta, buttons.value(), modifiers.value(), orient.value());
    }

    native void __qt_QWheelEvent_QPoint_int_MouseButtons_KeyboardModifiers_Orientation(long pos, int delta, int buttons, int modifiers, int orient);

/**
Returns the mouse state when the event occurred.
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
Returns the distance that the wheel is rotated, in eighths of a degree. A positive value indicates that the wheel was rotated forwards away from the user; a negative value indicates that the wheel was rotated backwards toward the user. <p>Most mouse types work in steps of 15 degrees, in which case the delta value is a multiple of 120; i.e., 120 units * 1/8 = 15 degrees. <p>However, some mice have finer-resolution wheels and send delta values that are less than 120 units (less than 15 degrees). To support this possibility, you can either cumulatively add the delta values from events until the value of 120 is reached, then scroll the widget, or you can partially scroll the widget in response to each wheel event. <p>Example: <pre class="snippet">
        public void wheelEvent(QWheelEvent event)
        {
            int numDegrees = event.delta() / 8;
            int numSteps = numDegrees / 15;

            if (event.orientation().equals(Qt.Orientation.Horizontal)) {
                scrollHorizontally(numSteps);
            } else {
                scrollVertically(numSteps);
            }
            event.accept();
        }
</pre>
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
Returns the global position of the mouse pointer at the time of the event. This is important on asynchronous window systems such as X11; whenever you move your widgets around in response to mouse events, {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()} can differ a lot from the current cursor position returned by {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QWheelEvent#globalY() globalY()}. <br></DD></DT>
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
Returns the global x position of the mouse cursor at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the global y position of the mouse cursor at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the wheel's orientation.
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
Returns the position of the mouse cursor relative to the widget that received the event. <p>If you move your widgets around in response to mouse events, use {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()} instead of this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#x() x()}, {@link com.trolltech.qt.gui.QWheelEvent#y() y()}, and {@link com.trolltech.qt.gui.QWheelEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the x position of the mouse cursor, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#y() y()}, and {@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}. <br></DD></DT>
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
Returns the y position of the mouse cursor, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWheelEvent#x() x()}, and {@link com.trolltech.qt.gui.QWheelEvent#pos() pos()}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    protected final void setG(com.trolltech.qt.core.QPoint g)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setG_QPoint(nativeId(), g == null ? 0 : g.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setG_QPoint(long __this__nativeId, long g);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint g()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_g(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_g(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setMouseState(com.trolltech.qt.core.Qt.MouseButton ... mouseState) {
        this.setMouseState(new com.trolltech.qt.core.Qt.MouseButtons(mouseState));
    }
/**

*/

    @QtBlockedSlot
    protected final void setMouseState(com.trolltech.qt.core.Qt.MouseButtons mouseState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMouseState_MouseButtons(nativeId(), mouseState.value());
    }
    @QtBlockedSlot
    native void __qt_setMouseState_MouseButtons(long __this__nativeId, int mouseState);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.MouseButtons mouseState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_mouseState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mouseState(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setO(com.trolltech.qt.core.Qt.Orientation o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setO_Orientation(nativeId(), o.value());
    }
    @QtBlockedSlot
    native void __qt_setO_Orientation(long __this__nativeId, int o);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.Orientation o()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_o(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_o(long __this__nativeId);

/**

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

    public static native QWheelEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWheelEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QWheelEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
