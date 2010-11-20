package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWindowStateChangeEvent class provides the window state before a window state change.
*/
@QtJambiGeneratedClass
public class QWindowStateChangeEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public QWindowStateChangeEvent(com.trolltech.qt.core.Qt.WindowState ... aOldState) {
        this(new com.trolltech.qt.core.Qt.WindowStates(aOldState));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QWindowStateChangeEvent(com.trolltech.qt.core.Qt.WindowStates aOldState){
        super((QPrivateConstructor)null);
        __qt_QWindowStateChangeEvent_WindowStates(aOldState.value());
    }

    native void __qt_QWindowStateChangeEvent_WindowStates(int aOldState);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QWindowStateChangeEvent(com.trolltech.qt.core.Qt.WindowStates aOldState, boolean isOverride){
        super((QPrivateConstructor)null);
        __qt_QWindowStateChangeEvent_WindowStates_boolean(aOldState.value(), isOverride);
    }

    native void __qt_QWindowStateChangeEvent_WindowStates_boolean(int aOldState, boolean isOverride);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isOverride()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOverride(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOverride(long __this__nativeId);

/**
Returns the state of the window before the change.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowStates oldState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.WindowStates(__qt_oldState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_oldState(long __this__nativeId);

/**
@exclude
*/

    public static native QWindowStateChangeEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWindowStateChangeEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QWindowStateChangeEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
