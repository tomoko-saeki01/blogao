package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QHideEvent class provides an event which is sent after a widget is hidden. This event is sent just before {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} returns, and also when a top-level window has been hidden (iconified) by the user. <p>If {@link com.trolltech.qt.core.QEvent#spontaneous() spontaneous()} is true, the event originated outside the application. In this case, the user hid the window using the window manager controls, either by iconifying the window or by switching to another virtual desktop where the window isn't visible. The window will become hidden but not withdrawn. If the window was iconified, {@link QWidget#isMinimized() QWidget::isMinimized()} returns true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShowEvent QShowEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHideEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QHideEvent.
*/

    public QHideEvent(){
        super((QPrivateConstructor)null);
        __qt_QHideEvent();
    }

    native void __qt_QHideEvent();

/**
@exclude
*/

    public static native QHideEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHideEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QHideEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
