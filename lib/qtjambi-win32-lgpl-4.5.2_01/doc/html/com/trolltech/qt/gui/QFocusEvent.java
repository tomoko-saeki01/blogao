package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFocusEvent class contains event parameters for widget focus events. Focus events are sent to widgets when the keyboard input focus changes. Focus events occur due to mouse actions, key presses (such as <b>Tab</b> or <b>Backtab</b>), the window system, popup menus, keyboard shortcuts, or other application-specific reasons. The reason for a particular focus event is returned by reason() in the appropriate event handler. <p>The event handlers {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) QWidget::focusInEvent()} and {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) QWidget::focusOutEvent()} receive focus events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocus() QWidget::setFocus()}, {@link QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) QWidget::setFocusPolicy()}, and {@link <a href="../focus.html">Keyboard Focus</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFocusEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a focus event object. <p>The <tt>type</tt> parameter must be either {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusIn } or {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusOut }. The <tt>reason</tt> describes the cause of the change in focus.
*/

    public QFocusEvent(com.trolltech.qt.core.QEvent.Type type) {
        this(type, com.trolltech.qt.core.Qt.FocusReason.OtherFocusReason);
    }
/**
Constructs a focus event object. <p>The <tt>type</tt> parameter must be either {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusIn } or {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusOut }. The <tt>reason</tt> describes the cause of the change in focus.
*/

    public QFocusEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.Qt.FocusReason reason){
        super((QPrivateConstructor)null);
        __qt_QFocusEvent_Type_FocusReason(type.value(), reason.value());
    }

    native void __qt_QFocusEvent_Type_FocusReason(int type, int reason);

/**
Returns true if {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusIn }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean gotFocus()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_gotFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_gotFocus(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type QEvent::FocusOut }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean lostFocus()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lostFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_lostFocus(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.FocusReason reason()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.FocusReason.resolve(__qt_reason(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_reason(long __this__nativeId);

/**
@exclude
*/

    public static native QFocusEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFocusEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QFocusEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
