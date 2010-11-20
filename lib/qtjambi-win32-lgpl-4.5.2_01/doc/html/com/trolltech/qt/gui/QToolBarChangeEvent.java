package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QToolBarChangeEvent class provides an event that is sent whenever a the toolbar button is clicked on Mac OS X. The QToolBarChangeEvent is sent when the toolbar button is clicked. On Mac OS X, this is the long oblong button on the right side of the window title bar. The default implementation is to toggle the appearance (hidden or shown) of the associated toolbars for the window.
*/
@QtJambiGeneratedClass
public class QToolBarChangeEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QToolBarChangeEvent(boolean t){
        super((QPrivateConstructor)null);
        __qt_QToolBarChangeEvent_boolean(t);
    }

    native void __qt_QToolBarChangeEvent_boolean(boolean t);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean toggle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toggle(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_toggle(long __this__nativeId);

/**
@exclude
*/

    public static native QToolBarChangeEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QToolBarChangeEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QToolBarChangeEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
