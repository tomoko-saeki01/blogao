package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QTextEdit_ExtraSelection extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QTextEdit_ExtraSelection.
*/

    public QTextEdit_ExtraSelection(){
        super((QPrivateConstructor)null);
        __qt_QTextEdit_ExtraSelection();
    }

    native void __qt_QTextEdit_ExtraSelection();

/**
Sets this QTextEdit_ExtraSelection's <tt>cursor</tt>.
*/

    @QtBlockedSlot
    public final void setCursor(com.trolltech.qt.gui.QTextCursor cursor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursor_QTextCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCursor_QTextCursor(long __this__nativeId, long cursor);

/**
Returns the cursor of this QTextEdit_ExtraSelection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor cursor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_cursor(long __this__nativeId);

/**
Sets the <tt>format</tt> of this QTextEdit_ExtraSelection.
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QTextCharFormat(long __this__nativeId, long format);

/**
Returns the format of this QTextEdit_ExtraSelection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_format(long __this__nativeId);

/**
@exclude
*/

    public static native QTextEdit_ExtraSelection fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextEdit_ExtraSelection(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextEdit_ExtraSelection array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextEdit_ExtraSelection clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextEdit_ExtraSelection __qt_clone(long __this_nativeId);
}
