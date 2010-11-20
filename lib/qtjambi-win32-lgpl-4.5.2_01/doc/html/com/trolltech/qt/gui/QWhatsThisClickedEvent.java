package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWhatsThisClickedEvent class provides an event that can be used to handle hyperlinks in a "What's This?" text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, {@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}, and {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWhatsThisClickedEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an event containing a URL specified by <tt>href</tt> when a link is clicked in a "What's This?" message. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThisClickedEvent#href() href()}. <br></DD></DT>
*/

    public QWhatsThisClickedEvent(java.lang.String href){
        super((QPrivateConstructor)null);
        __qt_QWhatsThisClickedEvent_String(href);
    }

    native void __qt_QWhatsThisClickedEvent_String(java.lang.String href);

/**
Returns the URL that was clicked by the user in the "What's This?" text.
*/

    @QtBlockedSlot
    public final java.lang.String href()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_href(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_href(long __this__nativeId);

/**
@exclude
*/

    public static native QWhatsThisClickedEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWhatsThisClickedEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QWhatsThisClickedEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
