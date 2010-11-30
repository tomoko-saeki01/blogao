package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSize class defines the size of a two-dimensional object using integer point precision. A size is specified by a {@link com.trolltech.qt.core.QSize#width() width()} and a {@link com.trolltech.qt.core.QSize#height() height()}. It can be set in the constructor and changed using the {@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}, {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}, or {@link com.trolltech.qt.core.QSize#scale(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) scale()} functions, or using arithmetic operators. A size can also be manipulated directly by retrieving references to the width and height using the rwidth() and rheight() functions. Finally, the width and height can be swapped using the {@link com.trolltech.qt.core.QSize#transpose() transpose()} function. <p>The {@link com.trolltech.qt.core.QSize#isValid() isValid()} function determines if a size is valid (a valid size has both width and height greater than zero). The {@link com.trolltech.qt.core.QSize#isEmpty() isEmpty()} function returns true if either of the width and height is less than, or equal to, zero, while the {@link com.trolltech.qt.core.QSize#isNull() isNull()} function returns true only if both the width and the height is zero. <p>Use the {@link com.trolltech.qt.core.QSize#expandedTo(com.trolltech.qt.core.QSize) expandedTo()} function to retrieve a size which holds the maximum height and width of this size and a given size. Similarly, the {@link com.trolltech.qt.core.QSize#boundedTo(com.trolltech.qt.core.QSize) boundedTo()} function returns a size which holds the minimum height and width of this size and a given size. <p>QSize objects can be streamed as well as compared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF QSizeF}, {@link com.trolltech.qt.core.QPoint QPoint}, and {@link com.trolltech.qt.core.QRect QRect}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSize extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a size with an invalid width and height (i. ., {@link com.trolltech.qt.core.QSize#isValid() isValid()} returns false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isValid() isValid()}. <br></DD></DT>
*/

    public QSize(){
        super((QPrivateConstructor)null);
        __qt_QSize();
    }

    native void __qt_QSize();

/**
Constructs a size with the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}, and {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}. <br></DD></DT>
*/

    public QSize(int w, int h){
        super((QPrivateConstructor)null);
        __qt_QSize_int_int(w, h);
    }

    native void __qt_QSize_int_int(int w, int h);

/**
Returns a size holding the minimum width and height of this size and the given <tt>otherSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#expandedTo(com.trolltech.qt.core.QSize) expandedTo()}, and {@link com.trolltech.qt.core.QSize#scale(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) scale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize boundedTo(com.trolltech.qt.core.QSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundedTo_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_boundedTo_QSize(long __this__nativeId, long arg__1);

/**
Returns a size holding the maximum width and height of this size and the given <tt>otherSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#boundedTo(com.trolltech.qt.core.QSize) boundedTo()}, and {@link com.trolltech.qt.core.QSize#scale(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) scale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize expandedTo(com.trolltech.qt.core.QSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expandedTo_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_expandedTo_QSize(long __this__nativeId, long arg__1);

/**
Returns the height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#width() width()}, and {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns true if either of the width and height is less than or equal to 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isNull() isNull()}, and {@link com.trolltech.qt.core.QSize#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns true if both the width and height is 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isValid() isValid()}, and {@link com.trolltech.qt.core.QSize#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns true if both the width and height is equal to or greater than 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isNull() isNull()}, and {@link com.trolltech.qt.core.QSize#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_double(long __this__nativeId, double c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_add_assign(com.trolltech.qt.core.QSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_QSize(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(com.trolltech.qt.core.QSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_QSize(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_divide_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_divide_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_divide_assign_double(long __this__nativeId, double c);

/**
<brief>Writes thisQSize
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QSize s2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSize(nativeId(), s2 == null ? 0 : s2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSize(long __this__nativeId, long s2);

/**
<brief>Reads a QSize
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Scales the size to a rectangle with the given <tt>size</tt>, according to the specified <tt>mode</tt>.
*/

    @QtBlockedSlot
    public final void scale(com.trolltech.qt.core.QSize s, com.trolltech.qt.core.Qt.AspectRatioMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_QSize_AspectRatioMode(nativeId(), s == null ? 0 : s.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_scale_QSize_AspectRatioMode(long __this__nativeId, long s, int mode);

/**
Scales the size to a rectangle with the given <tt>width</tt> and <tt>height</tt>, according to the specified <tt>mode</tt>. <ul><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the size is set to (<tt>width</tt>, <tt>height</tt>).</li><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the current size is scaled to a rectangle as large as possible inside (<tt>width</tt>, <tt>height</tt>), preserving the aspect ratio.</li><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the current size is scaled to a rectangle as small as possible outside (<tt>width</tt>, <tt>height</tt>), preserving the aspect ratio.</li></ul> Example: <pre class="snippet">
        QSize t1 = new QSize(10, 12);
        t1.scale(60, 60, Qt.AspectRatioMode.IgnoreAspectRatio);
        // t1 is (60, 60)

        QSize t2 = new QSize(10, 12);
        t2.scale(60, 60, Qt.AspectRatioMode.KeepAspectRatio);
        // t2 is (50, 60)

        QSize t3 = new QSize(10, 12);
        t3.scale(60, 60, Qt.AspectRatioMode.KeepAspectRatioByExpanding);
        // t3 is (60, 72)
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}, and {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scale(int w, int h, com.trolltech.qt.core.Qt.AspectRatioMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_int_int_AspectRatioMode(nativeId(), w, h, mode.value());
    }
    @QtBlockedSlot
    native void __qt_scale_int_int_AspectRatioMode(long __this__nativeId, int w, int h, int mode);

/**
Sets the height to the given <tt>height</tt>. <p><DT><b>See also:</b><br><DD>rheight(), {@link com.trolltech.qt.core.QSize#height() height()}, and {@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeight(int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeight_int(nativeId(), h);
    }
    @QtBlockedSlot
    native void __qt_setHeight_int(long __this__nativeId, int h);

/**
Sets the width to the given <tt>width</tt>. <p><DT><b>See also:</b><br><DD>rwidth(), {@link com.trolltech.qt.core.QSize#width() width()}, and {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidth(int w)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_int(nativeId(), w);
    }
    @QtBlockedSlot
    native void __qt_setWidth_int(long __this__nativeId, int w);

/**
Swaps the width and height values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}, and {@link com.trolltech.qt.core.QSize#setHeight(int) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void transpose()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_transpose(nativeId());
    }
    @QtBlockedSlot
    native void __qt_transpose(long __this__nativeId);

/**
Returns the width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#height() height()}, and {@link com.trolltech.qt.core.QSize#setWidth(int) setWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native int __qt_width(long __this__nativeId);

/**
@exclude
*/

    public static native QSize fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSize(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSize array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QSize)
        return operator_equal((com.trolltech.qt.core.QSize) other);
        return false;
    }


    // TEMPLATE - core.multiply-devide-add-subtract - START
/**
Multiplies this QSize by factor <tt>d</tt> and returns the result.
*/

    public final QSize multiply(double d) { operator_multiply_assign(d); return this; }
/**
Divides this QSize by divisor <tt>d</tt> and returns the result.
*/

    public final QSize divide(double d) { operator_divide_assign(d); return this; }
/**
Adds <tt>s</tt> to this QSize and returns the result.
*/

    public final QSize add(QSize p) { operator_add_assign(p); return this; }
/**
Subtracts <tt>s</tt> from this QSize and returns the result.
*/

    public final QSize subtract(QSize p) { operator_subtract_assign(p); return this; }
    // TEMPLATE - core.multiply-devide-add-subtract - END


/**
<brief>Returns a string representation of the <tt>this QSize</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSize clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSize __qt_clone(long __this_nativeId);
}
