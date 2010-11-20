package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QAbstractTextDocumentLayout_PaintContext extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QAbstractTextDocumentLayout_PaintContext object.
*/

    public QAbstractTextDocumentLayout_PaintContext(){
        super((QPrivateConstructor)null);
        __qt_QAbstractTextDocumentLayout_PaintContext();
    }

    native void __qt_QAbstractTextDocumentLayout_PaintContext();

/**
Sets the <tt>palette</tt> palette of this
QAbstractTextDocumentLayout_PaintContext.
*/

    @QtBlockedSlot
    public final void setPalette(com.trolltech.qt.gui.QPalette palette)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPalette_QPalette(nativeId(), palette == null ? 0 : palette.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPalette_QPalette(long __this__nativeId, long palette);

/**
Returns the palette of this QAbstractTextDocumentLayout_PaintContext.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette palette()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_palette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_palette(long __this__nativeId);

/**
Sets this QAbstractTextDocumentLayout_PaintContext's <tt>cursorPosition</tt>.
*/

    @QtBlockedSlot
    public final void setCursorPosition(int cursorPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursorPosition_int(nativeId(), cursorPosition);
    }
    @QtBlockedSlot
    native void __qt_setCursorPosition_int(long __this__nativeId, int cursorPosition);

/**
Returns this QAbstractTextDocumentLayout_PaintContext's cursor
position.
*/

    @QtBlockedSlot
    public final int cursorPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_cursorPosition(long __this__nativeId);

/**
Sets this QAbstractTextDocumentLayout_PaintContext's clip region to <tt>clip</tt>.
*/

    @QtBlockedSlot
    public final void setClip(com.trolltech.qt.core.QRectF clip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClip_QRectF(nativeId(), clip == null ? 0 : clip.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setClip_QRectF(long __this__nativeId, long clip);

/**
Returns the clip region of this
QAbstractTextDocumentLayout_PaintContext.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF clip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clip(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_clip(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractTextDocumentLayout_PaintContext fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractTextDocumentLayout_PaintContext(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QAbstractTextDocumentLayout_PaintContext array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QAbstractTextDocumentLayout_PaintContext clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QAbstractTextDocumentLayout_PaintContext __qt_clone(long __this_nativeId);
}
