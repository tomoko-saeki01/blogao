package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputEvent class is the base class for events that describe user input.
*/
@QtJambiGeneratedClass
public class QInputEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**

*/

    public QInputEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.Qt.KeyboardModifier ... modifiers) {
        this(type, new com.trolltech.qt.core.Qt.KeyboardModifiers(modifiers));
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QInputEvent(com.trolltech.qt.core.QEvent.Type type) {
        this(type, new com.trolltech.qt.core.Qt.KeyboardModifiers(0));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QInputEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers){
        super((QPrivateConstructor)null);
        __qt_QInputEvent_Type_KeyboardModifiers(type.value(), modifiers.value());
    }

    native void __qt_QInputEvent_Type_KeyboardModifiers(int type, int modifiers);

/**
Returns the keyboard modifier flags that existed immediately before the event occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#keyboardModifiers() QApplication::keyboardModifiers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.KeyboardModifiers modifiers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modifiers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modifiers(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setModState(com.trolltech.qt.core.Qt.KeyboardModifier ... modState) {
        this.setModState(new com.trolltech.qt.core.Qt.KeyboardModifiers(modState));
    }
/**

*/

    @QtBlockedSlot
    protected final void setModState(com.trolltech.qt.core.Qt.KeyboardModifiers modState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModState_KeyboardModifiers(nativeId(), modState.value());
    }
    @QtBlockedSlot
    native void __qt_setModState_KeyboardModifiers(long __this__nativeId, int modState);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.Qt.KeyboardModifiers modState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_modState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modState(long __this__nativeId);

/**
@exclude
*/

    public static native QInputEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QInputEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
