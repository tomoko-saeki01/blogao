package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QDragResponseEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QDragResponseEvent(boolean accepted){
        super((QPrivateConstructor)null);
        __qt_QDragResponseEvent_boolean(accepted);
    }

    native void __qt_QDragResponseEvent_boolean(boolean accepted);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean dragAccepted()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dragAccepted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dragAccepted(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setA(boolean a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setA_boolean(nativeId(), a);
    }
    @QtBlockedSlot
    native void __qt_setA_boolean(long __this__nativeId, boolean a);

/**

*/

    @QtBlockedSlot
    protected final boolean a()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_a(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_a(long __this__nativeId);

/**
@exclude
*/

    public static native QDragResponseEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDragResponseEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDragResponseEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
