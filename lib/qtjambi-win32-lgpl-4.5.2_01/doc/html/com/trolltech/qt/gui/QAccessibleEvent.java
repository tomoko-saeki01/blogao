package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessibleEvent class is used to query addition accessibility information about complex widgets. The event can be of type {@link com.trolltech.qt.core.QEvent.Type QEvent::AccessibilityDescription } or {@link com.trolltech.qt.core.QEvent.Type QEvent::AccessibilityHelp }. <p>Some {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} implementations send QAccessibleEvents to the widget they wrap to obtain the description or help text of a widget or of its children. The widget can answer by calling {@link com.trolltech.qt.gui.QAccessibleEvent#setValue(java.lang.String) setValue()} with the requested information. <p>The default QWidget::event() implementation simply sets the text to be the widget's {@link QWidget#toolTip() tooltip} (for {@link com.trolltech.qt.core.QEvent.Type AccessibilityDescription } event) or its {@link QWidget#whatsThis() "What's This?" text} (for {@link com.trolltech.qt.core.QEvent.Type AccessibilityHelp } event).
*/
@QtJambiGeneratedClass
public class QAccessibleEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an accessibility event of the given <tt>type</tt>, which must be {@link com.trolltech.qt.core.QEvent.Type QEvent::AccessibilityDescription } or {@link com.trolltech.qt.core.QEvent.Type QEvent::AccessibilityHelp }. <p><tt>child</tt> is the (1-based) index of the child to which the request applies. If <tt>child</tt> is 0, the request is for the widget itself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleEvent#child() child()}. <br></DD></DT>
*/

    public QAccessibleEvent(com.trolltech.qt.core.QEvent.Type type, int child){
        super((QPrivateConstructor)null);
        __qt_QAccessibleEvent_Type_int(type.value(), child);
    }

    native void __qt_QAccessibleEvent_Type_int(int type, int child);

/**
Returns the (1-based) index of the child to which the request applies. If the child is 0, the request is for the widget itself.
*/

    @QtBlockedSlot
    public final int child()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child(nativeId());
    }
    @QtBlockedSlot
    native int __qt_child(long __this__nativeId);

/**
Set the description or help text for the given {@link com.trolltech.qt.gui.QAccessibleEvent#child() child()} to <tt>text</tt>, thereby answering the request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleEvent#value() value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(java.lang.String aText)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String(nativeId(), aText);
    }
    @QtBlockedSlot
    native void __qt_setValue_String(long __this__nativeId, java.lang.String aText);

/**
Returns the text set using {@link com.trolltech.qt.gui.QAccessibleEvent#setValue(java.lang.String) setValue()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleEvent#setValue(java.lang.String) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_value(long __this__nativeId);

/**
@exclude
*/

    public static native QAccessibleEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QAccessibleEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
