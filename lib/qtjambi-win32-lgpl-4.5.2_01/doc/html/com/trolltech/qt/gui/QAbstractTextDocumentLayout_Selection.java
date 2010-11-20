package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QAbstractTextDocumentLayout_Selection extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a new QAbstractTextDocumentLayout_Selection object.
*/

    public QAbstractTextDocumentLayout_Selection(){
        super((QPrivateConstructor)null);
        __qt_QAbstractTextDocumentLayout_Selection();
    }

    native void __qt_QAbstractTextDocumentLayout_Selection();

/**
Sets the <tt>cursor</tt> of this
QAbstractTextDocumentLayout_Selection.
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
Returns the cursor of this QAbstractTextDocumentLayout_Selection.
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
Sets the <tt>format</tt> of this
QAbstractTextDocumentLayout_Selection.
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
Returns the format of this QAbstractTextDocumentLayout_Selection.
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

    public static native QAbstractTextDocumentLayout_Selection fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractTextDocumentLayout_Selection(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QAbstractTextDocumentLayout_Selection array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QAbstractTextDocumentLayout_Selection clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QAbstractTextDocumentLayout_Selection __qt_clone(long __this_nativeId);
}
