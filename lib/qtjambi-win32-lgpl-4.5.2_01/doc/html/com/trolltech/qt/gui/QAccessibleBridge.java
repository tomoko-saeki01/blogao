package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessibleBridge class is the base class for accessibility back-ends. Qt supports Microsoft Active Accessibility (MSAA), Mac OS X Accessibility, and the Unix/X11 AT-SPI standard. By subclassing QAccessibleBridge, you can support other backends than the predefined ones. <p>Currently, custom bridges are only supported on Unix. We might add support for them on other platforms as well if there is enough demand. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible QAccessible}, and QAccessibleBridgePlugin. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAccessibleBridge extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAccessibleBridge {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void notifyAccessibilityUpdate(int arg__1, com.trolltech.qt.gui.QAccessibleInterface arg__2, int arg__3) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_notifyAccessibilityUpdate_int_QAccessibleInterface_int(nativeId(), arg__1, arg__2 == null ? 0 : arg__2.nativeId(), arg__3);
        }

        @Override
        @QtBlockedSlot
        public void setRootObject(com.trolltech.qt.gui.QAccessibleInterface arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setRootObject_QAccessibleInterface(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QAccessibleBridge(){
        super((QPrivateConstructor)null);
        __qt_QAccessibleBridge();
    }

    native void __qt_QAccessibleBridge();

/**
This function is called by Qt to notify the bridge about a change in the accessibility information for object wrapped by the given <tt>interface</tt>. <p><tt>reason</tt> specifies the cause of the change. It can take values of type {@link com.trolltech.qt.gui.QAccessible.Event QAccessible::Event }. <p><tt>child</tt> is the (1-based) index of the child element that has changed. When <tt>child</tt> is 0, the object itself has changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible#updateAccessibility(com.trolltech.qt.core.QObject, int, com.trolltech.qt.gui.QAccessible.Event) QAccessible::updateAccessibility()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void notifyAccessibilityUpdate(int arg__1, com.trolltech.qt.gui.QAccessibleInterface arg__2, int arg__3);
    @QtBlockedSlot
    native void __qt_notifyAccessibilityUpdate_int_QAccessibleInterface_int(long __this__nativeId, int arg__1, long arg__2, int arg__3);

/**
This function is called by Qt at application startup to set the root accessible object of the application to <tt>object</tt>. All other accessible objects in the application can be reached by the client using object navigation.
*/

    @QtBlockedSlot
    public abstract void setRootObject(com.trolltech.qt.gui.QAccessibleInterface arg__1);
    @QtBlockedSlot
    native void __qt_setRootObject_QAccessibleInterface(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QAccessibleBridge fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleBridge(QPrivateConstructor p) { super(p); } 
}
