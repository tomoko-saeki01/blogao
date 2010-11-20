package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFileOpenEvent class provides an event that will be sent when there is a request to open a file. File open events will be sent to the {@link com.trolltech.qt.core.QCoreApplication#instance() QApplication::instance()} when the operating system requests that a file be opened. This is a high-level event that can be caused by different user actions depending on the user's desktop environment; for example, double clicking on an file icon in the Finder on Mac OS X. <p>This event is only used to notify the application of a request. It may be safely ignored. <p><b>Note:</b> This class is currently supported for Mac Os X only.
*/
@QtJambiGeneratedClass
public class QFileOpenEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFileOpenEvent(java.lang.String file){
        super((QPrivateConstructor)null);
        __qt_QFileOpenEvent_String(file);
    }

    native void __qt_QFileOpenEvent_String(java.lang.String file);

/**
Returns the file that is being opened.
*/

    @QtBlockedSlot
    public final java.lang.String file()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_file(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_file(long __this__nativeId);

/**
@exclude
*/

    public static native QFileOpenEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFileOpenEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QFileOpenEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
