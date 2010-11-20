package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QKeyEvent class describes a key event. Key events are sent to the widget with keyboard input focus when keys are pressed or released. <p>A key event contains a special accept flag that indicates whether the receiver will handle the key event. You should call {@link com.trolltech.qt.core.QEvent#ignore() ignore()} if the key press or release event is not handled by your widget. A key event is propagated up the parent widget chain until a widget accepts it with {@link com.trolltech.qt.core.QEvent#accept() accept()} or an event filter consumes it. Key events for multimedia keys are ignored by default. You should call {@link com.trolltech.qt.core.QEvent#accept() accept()} if your widget handles those events. <p>The QWidget::setEnable() function can be used to enable or disable mouse and keyboard events for a widget. <p>The event handlers {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) QWidget::keyPressEvent()} and {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) QWidget::keyReleaseEvent()} receive key events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}, and {@link com.trolltech.qt.gui.QWidget#grabKeyboard() QWidget::grabKeyboard()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QKeyEvent extends com.trolltech.qt.gui.QInputEvent
{


/**
Constructs a key event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyRelease }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::ShortcutOverride }. <p>If <tt>key</tt> is 0, the event is not a result of a known key; for example, it may be the result of a compose sequence or keyboard macro. The <tt>modifiers</tt> holds the keyboard modifiers, and the given <tt>text</tt> is the Unicode text that the key generated. If <tt>autorep</tt> is true, {@link com.trolltech.qt.gui.QKeyEvent#isAutoRepeat() isAutoRepeat()} will be true. <tt>count</tt> is the number of keys involved in the event.
*/

    public QKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, java.lang.String text, boolean autorep) {
        this(type, key, modifiers, text, autorep, (char)1);
    }

/**
Constructs a key event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyRelease }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::ShortcutOverride }. <p>If <tt>key</tt> is 0, the event is not a result of a known key; for example, it may be the result of a compose sequence or keyboard macro. The <tt>modifiers</tt> holds the keyboard modifiers, and the given <tt>text</tt> is the Unicode text that the key generated. If <tt>autorep</tt> is true, {@link com.trolltech.qt.gui.QKeyEvent#isAutoRepeat() isAutoRepeat()} will be true. <tt>count</tt> is the number of keys involved in the event.
*/

    public QKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, java.lang.String text) {
        this(type, key, modifiers, text, (boolean)false, (char)1);
    }

/**
Constructs a key event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyRelease }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::ShortcutOverride }. <p>If <tt>key</tt> is 0, the event is not a result of a known key; for example, it may be the result of a compose sequence or keyboard macro. The <tt>modifiers</tt> holds the keyboard modifiers, and the given <tt>text</tt> is the Unicode text that the key generated. If <tt>autorep</tt> is true, {@link com.trolltech.qt.gui.QKeyEvent#isAutoRepeat() isAutoRepeat()} will be true. <tt>count</tt> is the number of keys involved in the event.
*/

    public QKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
        this(type, key, modifiers, (java.lang.String)null, (boolean)false, (char)1);
    }
/**
Constructs a key event object. <p>The <tt>type</tt> parameter must be {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyRelease }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::ShortcutOverride }. <p>If <tt>key</tt> is 0, the event is not a result of a known key; for example, it may be the result of a compose sequence or keyboard macro. The <tt>modifiers</tt> holds the keyboard modifiers, and the given <tt>text</tt> is the Unicode text that the key generated. If <tt>autorep</tt> is true, {@link com.trolltech.qt.gui.QKeyEvent#isAutoRepeat() isAutoRepeat()} will be true. <tt>count</tt> is the number of keys involved in the event.
*/

    public QKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, java.lang.String text, boolean autorep, char count){
        super((QPrivateConstructor)null);
        __qt_QKeyEvent_Type_int_KeyboardModifiers_String_boolean_char(type.value(), key, modifiers.value(), text, autorep, count);
    }

    native void __qt_QKeyEvent_Type_int_KeyboardModifiers_String_boolean_char(int type, int key, int modifiers, java.lang.String text, boolean autorep, char count);

/**
Returns the number of keys involved in this event. If {@link com.trolltech.qt.gui.QKeyEvent#text() text()} is not empty, this is simply the length of the string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_KeyCompression }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

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
Returns true if this event comes from an auto-repeating key; returns false if it comes from an initial key press. <p>Note that if the event is a multiple-key compressed event that is partly due to auto-repeat, this function could return either true or false indeterminately.
*/

    @QtBlockedSlot
    public final boolean isAutoRepeat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAutoRepeat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAutoRepeat(long __this__nativeId);

/**
Returns the code of the key that was pressed or released. <p>See {@link com.trolltech.qt.core.Qt.Key Qt::Key } for the list of keyboard codes. These codes are independent of the underlying window system. Note that this function does not distinguish between capital and non-capital letters, use the {@link com.trolltech.qt.gui.QKeyEvent#text() text()} function (returning the Unicode text the key generated) for this purpose. <p>A value of either 0 or {@link com.trolltech.qt.core.Qt.Key Qt::Key_unknown } means that the event is not the result of a known key; for example, it may be the result of a compose sequence, a keyboard macro, or due to key event compression. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_KeyCompression }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int key()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native int __qt_key(long __this__nativeId);

/**
Returns true if the key event matches the given standard <tt>key</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean matches(com.trolltech.qt.gui.QKeySequence.StandardKey key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matches_StandardKey(nativeId(), key.value());
    }
    @QtBlockedSlot
    native boolean __qt_matches_StandardKey(long __this__nativeId, int key);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.KeyboardModifiers modifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modifiers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modifiers(long __this__nativeId);

/**
Returns the native modifiers of a key event. If the key event does not contain this data 0 is returned. <p>Note: The native modifiers may be 0, even if the key event contains extended information.
*/

    @QtBlockedSlot
    public final int nativeModifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nativeModifiers(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nativeModifiers(long __this__nativeId);

/**
Returns the native scan code of the key event. If the key event does not contain this data 0 is returned. <p>Note: The native scan code may be 0, even if the key event contains extended information. <p>Note: On Mac OS/X, this function is not useful, because there is no way to get the scan code from Carbon or Cocoa. The function always returns 1 (or 0 in the case explained above).
*/

    @QtBlockedSlot
    public final int nativeScanCode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nativeScanCode(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nativeScanCode(long __this__nativeId);

/**
Returns the native virtual key, or key sym of the key event. If the key event does not contain this data 0 is returned. <p>Note: The native virtual key may be 0, even if the key event contains extended information.
*/

    @QtBlockedSlot
    public final int nativeVirtualKey()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nativeVirtualKey(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nativeVirtualKey(long __this__nativeId);

/**
Returns the Unicode text that this key generated. The text returned can be an empty string in cases where modifier keys, such as Shift, Control, Alt, and Meta, are being pressed or released. In such cases {@link com.trolltech.qt.gui.QKeyEvent#key() key()} will contain a valid value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_KeyCompression }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QKeyEvent createExtendedKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, int nativeScanCode, int nativeVirtualKey, int nativeModifiers, java.lang.String text, boolean autorep) {
        return createExtendedKeyEvent(type, key, modifiers, nativeScanCode, nativeVirtualKey, nativeModifiers, text, autorep, (char)1);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QKeyEvent createExtendedKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, int nativeScanCode, int nativeVirtualKey, int nativeModifiers, java.lang.String text) {
        return createExtendedKeyEvent(type, key, modifiers, nativeScanCode, nativeVirtualKey, nativeModifiers, text, (boolean)false, (char)1);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QKeyEvent createExtendedKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, int nativeScanCode, int nativeVirtualKey, int nativeModifiers) {
        return createExtendedKeyEvent(type, key, modifiers, nativeScanCode, nativeVirtualKey, nativeModifiers, (java.lang.String)null, (boolean)false, (char)1);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static com.trolltech.qt.gui.QKeyEvent createExtendedKeyEvent(com.trolltech.qt.core.QEvent.Type type, int key, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers, int nativeScanCode, int nativeVirtualKey, int nativeModifiers, java.lang.String text, boolean autorep, char count)    {
        return __qt_createExtendedKeyEvent_Type_int_KeyboardModifiers_int_int_int_String_boolean_char(type.value(), key, modifiers.value(), nativeScanCode, nativeVirtualKey, nativeModifiers, text, autorep, count);
    }
    native static com.trolltech.qt.gui.QKeyEvent __qt_createExtendedKeyEvent_Type_int_KeyboardModifiers_int_int_int_String_boolean_char(int type, int key, int modifiers, int nativeScanCode, int nativeVirtualKey, int nativeModifiers, java.lang.String text, boolean autorep, char count);

/**

*/

    @QtBlockedSlot
    protected final void setK(int k)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setK_int(nativeId(), k);
    }
    @QtBlockedSlot
    native void __qt_setK_int(long __this__nativeId, int k);

/**

*/

    @QtBlockedSlot
    protected final int k()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_k(nativeId());
    }
    @QtBlockedSlot
    native int __qt_k(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setTxt(java.lang.String txt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTxt_String(nativeId(), txt);
    }
    @QtBlockedSlot
    native void __qt_setTxt_String(long __this__nativeId, java.lang.String txt);

/**

*/

    @QtBlockedSlot
    protected final java.lang.String txt()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_txt(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_txt(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setC(char c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setC_char(nativeId(), c);
    }
    @QtBlockedSlot
    native void __qt_setC_char(long __this__nativeId, char c);

/**

*/

    @QtBlockedSlot
    protected final char c()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_c(nativeId());
    }
    @QtBlockedSlot
    native char __qt_c(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setAutor(int autor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutor_int(nativeId(), autor);
    }
    @QtBlockedSlot
    native void __qt_setAutor_int(long __this__nativeId, int autor);

/**

*/

    @QtBlockedSlot
    protected final int autor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autor(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autor(long __this__nativeId);

/**
@exclude
*/

    public static native QKeyEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QKeyEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QKeyEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
