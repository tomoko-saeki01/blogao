package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QShowEvent class provides an event that is sent when a widget is shown. There are two kinds of show events: show events caused by the window system (spontaneous), and internal show events. Spontaneous ({@link com.trolltech.qt.core.QEvent#spontaneous() QEvent::spontaneous()}) show events are sent just after the window system shows the window; they are also sent when a top-level window is redisplayed after being iconified. Internal show events are delivered just before the widget becomes visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHideEvent QHideEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QShowEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QShowEvent.
*/

    public QShowEvent(){
        super((QPrivateConstructor)null);
        __qt_QShowEvent();
    }

    native void __qt_QShowEvent();

/**
@exclude
*/

    public static native QShowEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QShowEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QShowEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
