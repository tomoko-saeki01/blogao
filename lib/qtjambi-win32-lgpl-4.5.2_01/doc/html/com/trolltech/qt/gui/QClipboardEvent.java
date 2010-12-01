package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QClipboardEvent class provides the parameters used in a clipboard event. This class is for internal use only, and exists to aid the clipboard on various platforms to get all the information it needs. Use {@link com.trolltech.qt.core.QEvent.Type QEvent::Clipboard } instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard QClipboard}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QClipboardEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
@exclude
*/

    public static native QClipboardEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QClipboardEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QClipboardEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
