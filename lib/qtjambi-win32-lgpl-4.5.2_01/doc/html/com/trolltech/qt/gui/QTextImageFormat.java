package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextImageFormat class provides formatting information for images in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. Inline images are represented by an object replacement character (0xFFFC in Unicode) which has an associated QTextImageFormat. The image format specifies a name with {@link com.trolltech.qt.gui.QTextImageFormat#setName(java.lang.String) setName()} that is used to locate the image. The size of the rectangle that the image will occupy is specified using {@link com.trolltech.qt.gui.QTextImageFormat#setWidth(double) setWidth()} and {@link com.trolltech.qt.gui.QTextImageFormat#setHeight(double) setHeight()}. <p>Images can be supplied in any format for which Qt has an image reader, so SVG drawings can be included alongside PNG, TIFF and other bitmap formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage QImage}, and {@link com.trolltech.qt.gui.QImageReader QImageReader}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextImageFormat extends com.trolltech.qt.gui.QTextCharFormat
    implements java.lang.Cloneable
{

/**
Creates a new image format object.
*/

    public QTextImageFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextImageFormat();
    }

    native void __qt_QTextImageFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextImageFormat(com.trolltech.qt.gui.QTextFormat format){
        super((QPrivateConstructor)null);
        __qt_QTextImageFormat_QTextFormat(format == null ? 0 : format.nativeId());
    }

    native void __qt_QTextImageFormat_QTextFormat(long format);

/**
Returns the height of the rectangle occupied by the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#width() width()}, and {@link com.trolltech.qt.gui.QTextImageFormat#setHeight(double) setHeight()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
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
Returns the name of the image. The name refers to an entry in the application's resources file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#setName(java.lang.String) setName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
Sets the <tt>height</tt> of the rectangle occupied by the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#height() height()}, and {@link com.trolltech.qt.gui.QTextImageFormat#setWidth(double) setWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeight(double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setHeight_double(long __this__nativeId, double height);

/**
Sets the <tt>name</tt> of the image. The <tt>name</tt> is used to locate the image in the application's resources. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setName_String(long __this__nativeId, java.lang.String name);

/**
Sets the <tt>width</tt> of the rectangle occupied by the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#width() width()}, and {@link com.trolltech.qt.gui.QTextImageFormat#setHeight(double) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setWidth_double(long __this__nativeId, double width);

/**
Returns the width of the rectangle occupied by the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextImageFormat#height() height()}, and {@link com.trolltech.qt.gui.QTextImageFormat#setWidth(double) setWidth()}. <br></DD></DT>
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

    public static native QTextImageFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextImageFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextImageFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextImageFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextImageFormat __qt_clone(long __this_nativeId);
}
