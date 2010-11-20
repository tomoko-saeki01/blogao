package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QTextLayout_FormatRange extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QTextLayout_FormatRange.
*/

    public QTextLayout_FormatRange(){
        super((QPrivateConstructor)null);
        __qt_QTextLayout_FormatRange();
    }

    native void __qt_QTextLayout_FormatRange();

/**
Sets this QTextLayout_FormatRange text char format to <tt>format</tt>.
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
Returns this QTextLayout_FormatRange's text char format.
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
Sets this QTextLayout_FormatRange's length to <tt>length</tt>.
*/

    @QtBlockedSlot
    public final void setLength(int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLength_int(nativeId(), length);
    }
    @QtBlockedSlot
    native void __qt_setLength_int(long __this__nativeId, int length);

/**
Returns the length of this QTextLayout_FormatRange.
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
Sets the <tt>start</tt>, which is the beginning of the format range
within the text layout's text, of this QTextLayout_FormatRange.
*/

    @QtBlockedSlot
    public final void setStart(int start)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStart_int(nativeId(), start);
    }
    @QtBlockedSlot
    native void __qt_setStart_int(long __this__nativeId, int start);

/**
Returns the beginning of the format range within the text layout's
text.
*/

    @QtBlockedSlot
    public final int start()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_start(nativeId());
    }
    @QtBlockedSlot
    native int __qt_start(long __this__nativeId);

/**
@exclude
*/

    public static native QTextLayout_FormatRange fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextLayout_FormatRange(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextLayout_FormatRange array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextLayout_FormatRange clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextLayout_FormatRange __qt_clone(long __this_nativeId);
}
