package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMouseEvent class contains parameters that describe a mouse event. Mouse events occur when a mouse button is pressed or released inside a widget, or when the mouse cursor is moved. <p>Mouse move events will occur only when a mouse button is pressed down, unless mouse tracking has been enabled with {@link QWidget#setMouseTracking(boolean) QWidget::setMouseTracking()}. <p>Qt automatically grabs the mouse when a mouse button is pressed inside a widget; the widget will continue to receive mouse events until the last mouse button is released. <p>A mouse event contains a special accept flag that indicates whether the receiver wants the event. You should call {@link com.trolltech.qt.core.QEvent#ignore() ignore()} if the mouse event is not handled by your widget. A mouse event is propagated up the parent widget chain until a widget accepts it with {@link com.trolltech.qt.core.QEvent#accept() accept()}, or an event filter consumes it. <p>The state of the keyboard modifier keys can be found by calling the {@link com.trolltech.qt.gui.QInputEvent#modifiers() modifiers()} function, inhertied from {@link com.trolltech.qt.gui.QInputEvent QInputEvent}. <p>The functions {@link com.trolltech.qt.gui.QMouseEvent#pos() pos()}, {@link com.trolltech.qt.gui.QMouseEvent#x() x()}, and {@link com.trolltech.qt.gui.QMouseEvent#y() y()} give the cursor position relative to the widget that receives the mouse event. If you move the widget as a result of the mouse event, use the global position returned by {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()} to avoid a shaking motion. <p>The {@link QWidget#setEnabled(boolean) QWidget::setEnabled()} function can be used to enable or disable mouse and keyboard events for a widget. <p>Reimplement the {@link com.trolltech.qt.gui.QWidget QWidget} event handlers, {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) QWidget::mousePressEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) QWidget::mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) QWidget::mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) QWidget::mouseMoveEvent()} to receive mouse events in your own widgets. <p>{@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()} <p><DT><b>See also:</b><br><DD>{@link QWidget#setMouseTracking(boolean) QWidget::setMouseTracking()}, and {@link com.trolltech.qt.gui.QWidget#grabMouse() QWidget::grabMouse()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMouseEvent extends com.trolltech.qt.gui.QInputEvent
{


/**

*/

    public QMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this(type, pos, button, buttons, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
Constructs a mouse event object. <p>The <tt>type</tt> parameter must be one of {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonRelease }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonDblClick }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseMove }. <p>The <tt>position</tt> is the mouse cursor's position relative to the receiving widget. The <tt>button</tt> that caused the event is given as a value from the {@link com.trolltech.qt.core.Qt.MouseButton Qt::MouseButton } enum. If the event <tt>type</tt> is {@link com.trolltech.qt.core.QEvent.Type MouseMove }, the appropriate button for this event is {@link com.trolltech.qt.core.Qt.MouseButton Qt::NoButton }. The mouse and keyboard states at the time of the event are specified by <tt>buttons</tt> and <tt>modifiers</tt>. <p>The {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()} is initialized to {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}, which may not be appropriate. Use the other constructor to specify the global position explicitly.
*/

    public QMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers){
        super((QPrivateConstructor)null);
        __qt_QMouseEvent_Type_QPoint_MouseButton_MouseButtons_KeyboardModifiers(type.value(), pos == null ? 0 : pos.nativeId(), button.value(), buttons.value(), modifiers.value());
    }

    native void __qt_QMouseEvent_Type_QPoint_MouseButton_MouseButtons_KeyboardModifiers(int type, long pos, int button, int buttons, int modifiers);


/**

*/

    public QMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this(type, pos, globalPos, button, buttons, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
Constructs a mouse event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonRelease }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonDblClick }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseMove }. <p>The <tt>pos</tt> is the mouse cursor's position relative to the receiving widget. The cursor's position in global coordinates is specified by <tt>globalPos</tt>. The <tt>button</tt> that caused the event is given as a value from the {@link com.trolltech.qt.core.Qt.MouseButton Qt::MouseButton } enum. If the event <tt>type</tt> is {@link com.trolltech.qt.core.QEvent.Type MouseMove }, the appropriate button for this event is {@link com.trolltech.qt.core.Qt.MouseButton Qt::NoButton }. <tt>buttons</tt> is the state of all buttons at the time of the event, <tt>modifiers</tt> the state of all keyboard modifiers.
*/

    public QMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers){
        super((QPrivateConstructor)null);
        __qt_QMouseEvent_Type_QPoint_QPoint_MouseButton_MouseButtons_KeyboardModifiers(type.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId(), button.value(), buttons.value(), modifiers.value());
    }

    native void __qt_QMouseEvent_Type_QPoint_QPoint_MouseButton_MouseButtons_KeyboardModifiers(int type, long pos, long globalPos, int button, int buttons, int modifiers);

/**
Returns the button that caused the event. <p>Note that the returned value is always {@link com.trolltech.qt.core.Qt.MouseButton Qt::NoButton } for mouse move events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#buttons() buttons()}, and {@link com.trolltech.qt.core.Qt.MouseButton Qt::MouseButton }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButton button()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.MouseButton.resolve(__qt_button(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_button(long __this__nativeId);

/**
Returns the button state when the event was generated. The button state is a combination of {@link com.trolltech.qt.core.Qt.MouseButton Qt::LeftButton }, {@link com.trolltech.qt.core.Qt.MouseButton Qt::RightButton }, {@link com.trolltech.qt.core.Qt.MouseButton Qt::MidButton } using the OR operator. For mouse move events, this is all buttons that are pressed down. For mouse press and double click events this includes the button that caused the event. For mouse release events this excludes the button that caused the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#button() button()}, and {@link com.trolltech.qt.core.Qt.MouseButton Qt::MouseButton }. <br></DD></DT>
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
Returns the global position of the mouse cursor at the time of the event. This is important on asynchronous window systems like X11. Whenever you move your widgets around in response to mouse events, {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()} may differ a lot from the current pointer position {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}, and from QWidget::mapToGlobal({@link com.trolltech.qt.gui.QMouseEvent#pos() pos()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QMouseEvent#globalY() globalY()}. <br></DD></DT>
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
Returns the global x position of the mouse cursor at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the global y position of the mouse cursor at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#globalX() globalX()}, and {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean hasExtendedInfo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasExtendedInfo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasExtendedInfo(long __this__nativeId);

/**
Returns the position of the mouse cursor, relative to the widget that received the event. <p>If you move the widget as a result of the mouse event, use the global position returned by {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()} to avoid a shaking motion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#x() x()}, {@link com.trolltech.qt.gui.QMouseEvent#y() y()}, and {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()}. <br></DD></DT>
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
Returns the position of the mouse cursor as a {@link com.trolltech.qt.core.QPointF QPointF}, relative to the widget that received the event. <p>If you move the widget as a result of the mouse event, use the global position returned by {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()} to avoid a shaking motion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#x() x()}, {@link com.trolltech.qt.gui.QMouseEvent#y() y()}, {@link com.trolltech.qt.gui.QMouseEvent#pos() pos()}, and {@link com.trolltech.qt.gui.QMouseEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF posF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_posF(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_posF(long __this__nativeId);

/**
Returns the x position of the mouse cursor, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#y() y()}, and {@link com.trolltech.qt.gui.QMouseEvent#pos() pos()}. <br></DD></DT>
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
Returns the y position of the mouse cursor, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMouseEvent#x() x()}, and {@link com.trolltech.qt.gui.QMouseEvent#pos() pos()}. <br></DD></DT>
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

    public static com.trolltech.qt.gui.QMouseEvent createExtendedMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPointF pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        return com.trolltech.qt.gui.QMouseEvent.createExtendedMouseEvent(type, pos, globalPos, button, buttons, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QMouseEvent createExtendedMouseEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QPointF pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.Qt.MouseButton button, com.trolltech.qt.core.Qt.MouseButtons buttons, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers)    {
        return __qt_createExtendedMouseEvent_Type_QPointF_QPoint_MouseButton_MouseButtons_KeyboardModifiers(type.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId(), button.value(), buttons.value(), modifiers.value());
    }
    native static com.trolltech.qt.gui.QMouseEvent __qt_createExtendedMouseEvent_Type_QPointF_QPoint_MouseButton_MouseButtons_KeyboardModifiers(int type, long pos, long globalPos, int button, int buttons, int modifiers);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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

*/

    @QtBlockedSlot
    protected final void setB(com.trolltech.qt.core.Qt.MouseButton b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setB_MouseButton(nativeId(), b.value());
    }
    @QtBlockedSlot
    native void __qt_setB_MouseButton(long __this__nativeId, int b);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.MouseButton b()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.MouseButton.resolve(__qt_b(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_b(long __this__nativeId);

/**
@exclude
*/

    public static native QMouseEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMouseEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QMouseEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
