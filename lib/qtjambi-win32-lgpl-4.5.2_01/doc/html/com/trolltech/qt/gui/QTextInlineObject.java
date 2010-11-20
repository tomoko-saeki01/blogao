package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextInlineObject class represents an inline object in a {@link com.trolltech.qt.gui.QTextLayout QTextLayout}. This class is only used if the text layout is used to lay out parts of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <p>The inline object has various attributes that can be set, for example using, {@link com.trolltech.qt.gui.QTextInlineObject#setWidth(double) setWidth()}, {@link com.trolltech.qt.gui.QTextInlineObject#setAscent(double) setAscent()}, and {@link com.trolltech.qt.gui.QTextInlineObject#setDescent(double) setDescent()}. The rectangle it occupies is given by {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}, and its direction by isRightToLeft(). Its position in the text layout is given by at(), and its format is given by {@link com.trolltech.qt.gui.QTextInlineObject#format() format()}.
*/
@QtJambiGeneratedClass
public class QTextInlineObject extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextInlineObject(){
        super((QPrivateConstructor)null);
        __qt_QTextInlineObject();
    }

    native void __qt_QTextInlineObject();

/**
Returns the inline object's ascent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#setAscent(double) setAscent()}, {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double ascent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ascent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_ascent(long __this__nativeId);

/**
Returns the inline object's descent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#setDescent(double) setDescent()}, {@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double descent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_descent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_descent(long __this__nativeId);

/**
Returns format of the inline object within the text layout.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFormat format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFormat __qt_format(long __this__nativeId);

/**
Returns an integer describing the format of the inline object within the text layout.
*/

    @QtBlockedSlot
    public final int formatIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_formatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_formatIndex(long __this__nativeId);

/**
Returns the inline object's total height. This is equal to {@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()} + {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()} + 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native double __qt_height(long __this__nativeId);

/**
Returns true if this inline object is valid; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the inline object's rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, and {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_rect(long __this__nativeId);

/**
Sets the inline object's ascent to <tt>a</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#setDescent(double) setDescent()}, {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAscent(double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAscent_double(nativeId(), a);
    }
    @QtBlockedSlot
    native void __qt_setAscent_double(long __this__nativeId, double a);

/**
Sets the inline object's decent to <tt>d</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, {@link com.trolltech.qt.gui.QTextInlineObject#setAscent(double) setAscent()}, {@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDescent(double d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescent_double(nativeId(), d);
    }
    @QtBlockedSlot
    native void __qt_setDescent_double(long __this__nativeId, double d);

/**
Sets the inline object's width to <tt>w</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#width() width()}, {@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidth(double w)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_double(nativeId(), w);
    }
    @QtBlockedSlot
    native void __qt_setWidth_double(long __this__nativeId, double w);

/**
Returns if the object should be laid out right-to-left or left-to-right.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection textDirection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_textDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textDirection(long __this__nativeId);

/**
The position of the inline object within the text layout.
*/

    @QtBlockedSlot
    public final int textPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_textPosition(long __this__nativeId);

/**
Returns the inline object's width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextInlineObject#setWidth(double) setWidth()}, {@link com.trolltech.qt.gui.QTextInlineObject#ascent() ascent()}, {@link com.trolltech.qt.gui.QTextInlineObject#descent() descent()}, and {@link com.trolltech.qt.gui.QTextInlineObject#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native double __qt_width(long __this__nativeId);

/**
@exclude
*/

    public static native QTextInlineObject fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextInlineObject(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextInlineObject array[]);

/**
This method is reimplemented for internal reasons
*/

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextInlineObject clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextInlineObject __qt_clone(long __this_nativeId);
}
