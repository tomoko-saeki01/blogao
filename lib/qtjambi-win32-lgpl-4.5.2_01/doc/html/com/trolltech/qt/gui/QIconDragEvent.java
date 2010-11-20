package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIconDragEvent class indicates that a main icon drag has begun. Icon drag events are sent to widgets when the main icon of a window has been dragged away. On Mac OS X, this happens when the proxy icon of a window is dragged off the title bar. <p>It is normal to begin using drag and drop in response to this event. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}, {@link com.trolltech.qt.core.QMimeData QMimeData}, and {@link com.trolltech.qt.gui.QDrag QDrag}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QIconDragEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an icon drag event object with the accept flag set to false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#accept() accept()}. <br></DD></DT>
*/

    public QIconDragEvent(){
        super((QPrivateConstructor)null);
        __qt_QIconDragEvent();
    }

    native void __qt_QIconDragEvent();

/**
@exclude
*/

    public static native QIconDragEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIconDragEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QIconDragEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
