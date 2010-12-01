package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSizeF class defines the size of a two-dimensional object using floating point precision. A size is specified by a {@link com.trolltech.qt.core.QSizeF#width() width()} and a {@link com.trolltech.qt.core.QSizeF#height() height()}. It can be set in the constructor and changed using the {@link com.trolltech.qt.core.QSizeF#setWidth(double) setWidth()}, {@link com.trolltech.qt.core.QSizeF#setHeight(double) setHeight()}, or {@link com.trolltech.qt.core.QSizeF#scale(com.trolltech.qt.core.QSizeF, com.trolltech.qt.core.Qt.AspectRatioMode) scale()} functions, or using arithmetic operators. A size can also be manipulated directly by retrieving references to the width and height using the rwidth() and rheight() functions. Finally, the width and height can be swapped using the {@link com.trolltech.qt.core.QSizeF#transpose() transpose()} function. <p>The {@link com.trolltech.qt.core.QSizeF#isValid() isValid()} function determines if a size is valid. A valid size has both width and height greater than or equal to zero. The {@link com.trolltech.qt.core.QSizeF#isEmpty() isEmpty()} function returns true if either of the width and height is less than (or equal to) zero, while the {@link com.trolltech.qt.core.QSizeF#isNull() isNull()} function returns true only if both the width and the height is zero. <p>Use the {@link com.trolltech.qt.core.QSizeF#expandedTo(com.trolltech.qt.core.QSizeF) expandedTo()} function to retrieve a size which holds the maximum height and width of this size and a given size. Similarly, the {@link com.trolltech.qt.core.QSizeF#boundedTo(com.trolltech.qt.core.QSizeF) boundedTo()} function returns a size which holds the minimum height and width of this size and a given size. <p>The QSizeF class also provides the {@link com.trolltech.qt.core.QSizeF#toSize() toSize()} function returning a {@link com.trolltech.qt.core.QSize QSize} copy of this size, constructed by rounding the width and height to the nearest integers. <p>QSizeF objects can be streamed as well as compared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize QSize}, {@link com.trolltech.qt.core.QPointF QPointF}, and {@link com.trolltech.qt.core.QRectF QRectF}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSizeF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#isValid() isValid()}. <br></DD></DT>
*/

    public QSizeF(){
        super((QPrivateConstructor)null);
        __qt_QSizeF();
    }

    native void __qt_QSizeF();

/**
Constructs a size with floating point accuracy from the given <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#toSize() toSize()}. <br></DD></DT>
*/

    public QSizeF(com.trolltech.qt.core.QSize sz){
        super((QPrivateConstructor)null);
        __qt_QSizeF_QSize(sz == null ? 0 : sz.nativeId());
    }

    native void __qt_QSizeF_QSize(long sz);

/**
Constructs a size with the given <tt>width</tt> and <tt>height</tt>.
*/

    public QSizeF(double w, double h){
        super((QPrivateConstructor)null);
        __qt_QSizeF_double_double(w, h);
    }

    native void __qt_QSizeF_double_double(double w, double h);

/**
Returns a size holding the minimum width and height of this size and the given <tt>otherSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#expandedTo(com.trolltech.qt.core.QSizeF) expandedTo()}, and {@link com.trolltech.qt.core.QSizeF#scale(com.trolltech.qt.core.QSizeF, com.trolltech.qt.core.Qt.AspectRatioMode) scale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF boundedTo(com.trolltech.qt.core.QSizeF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundedTo_QSizeF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_boundedTo_QSizeF(long __this__nativeId, long arg__1);

/**
Returns a size holding the maximum width and height of this size and the given <tt>otherSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#boundedTo(com.trolltech.qt.core.QSizeF) boundedTo()}, and {@link com.trolltech.qt.core.QSizeF#scale(com.trolltech.qt.core.QSizeF, com.trolltech.qt.core.Qt.AspectRatioMode) scale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF expandedTo(com.trolltech.qt.core.QSizeF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expandedTo_QSizeF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_expandedTo_QSizeF(long __this__nativeId, long arg__1);

/**
Returns the height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#width() width()}, and {@link com.trolltech.qt.core.QSizeF#setHeight(double) setHeight()}. <br></DD></DT>
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
Returns true if either of the width and height is less than or equal to 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#isNull() isNull()}, and {@link com.trolltech.qt.core.QSizeF#isValid() isValid()}. <br></DD></DT>
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
Returns true if both the width and height is 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#isValid() isValid()}, and {@link com.trolltech.qt.core.QSizeF#isEmpty() isEmpty()}. <br></DD></DT>
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
Returns true if both the width and height is equal to or greater than 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#isNull() isNull()}, and {@link com.trolltech.qt.core.QSizeF#isEmpty() isEmpty()}. <br></DD></DT>
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
    private final com.trolltech.qt.QNativePointer operator_add_assign(com.trolltech.qt.core.QSizeF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_QSizeF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_QSizeF(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(com.trolltech.qt.core.QSizeF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_QSizeF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_QSizeF(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_divide_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_divide_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_divide_assign_double(long __this__nativeId, double c);

/**
<brief>Writes thisQSizeF
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
    private final boolean operator_equal(com.trolltech.qt.core.QSizeF s2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSizeF(nativeId(), s2 == null ? 0 : s2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSizeF(long __this__nativeId, long s2);

/**
<brief>Reads a QSizeF
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
    public final void scale(com.trolltech.qt.core.QSizeF s, com.trolltech.qt.core.Qt.AspectRatioMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_QSizeF_AspectRatioMode(nativeId(), s == null ? 0 : s.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_scale_QSizeF_AspectRatioMode(long __this__nativeId, long s, int mode);

/**
Scales the size to a rectangle with the given <tt>width</tt> and <tt>height</tt>, according to the specified <tt>mode</tt>. <ul><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the size is set to (<tt>width</tt>, <tt>height</tt>).</li><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the current size is scaled to a rectangle as large as possible inside (<tt>width</tt>, <tt>height</tt>), preserving the aspect ratio.</li><li> If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the current size is scaled to a rectangle as small as possible outside (<tt>width</tt>, <tt>height</tt>), preserving the aspect ratio.</li></ul> Example: <pre class="snippet">
        QSizeF t1 = new QSizeF(10, 12);
        t1.scale(60, 60, Qt.AspectRatioMode.IgnoreAspectRatio);
        // t1 is (60, 60)

        QSizeF t2 = new QSizeF(10, 12);
        t2.scale(60, 60, Qt.AspectRatioMode.KeepAspectRatio);
        // t2 is (50, 60)

        QSizeF t3 = new QSizeF(10, 12);
        t3.scale(60, 60, Qt.AspectRatioMode.KeepAspectRatioByExpanding);
        // t3 is (60, 72)
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#setWidth(double) setWidth()}, and {@link com.trolltech.qt.core.QSizeF#setHeight(double) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scale(double w, double h, com.trolltech.qt.core.Qt.AspectRatioMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_double_double_AspectRatioMode(nativeId(), w, h, mode.value());
    }
    @QtBlockedSlot
    native void __qt_scale_double_double_AspectRatioMode(long __this__nativeId, double w, double h, int mode);

/**
Sets the height to the given <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#height() height()}, rheight(), and {@link com.trolltech.qt.core.QSizeF#setWidth(double) setWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeight(double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeight_double(nativeId(), h);
    }
    @QtBlockedSlot
    native void __qt_setHeight_double(long __this__nativeId, double h);

/**
Sets the width to the given <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#width() width()}, rwidth(), and {@link com.trolltech.qt.core.QSizeF#setHeight(double) setHeight()}. <br></DD></DT>
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
Returns an integer based copy of this size. <p>Note that the coordinates in the returned size will be rounded to the nearest integer. <p><DT><b>See also:</b><br><DD>QSizeF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize toSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_toSize(long __this__nativeId);

/**
Swaps the width and height values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#setWidth(double) setWidth()}, and {@link com.trolltech.qt.core.QSizeF#setHeight(double) setHeight()}. <br></DD></DT>
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
Returns the width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSizeF#height() height()}, and {@link com.trolltech.qt.core.QSizeF#setWidth(double) setWidth()}. <br></DD></DT>
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

    public static native QSizeF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSizeF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSizeF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QSizeF)
        return operator_equal((com.trolltech.qt.core.QSizeF) other);
        return false;
    }


    // TEMPLATE - core.multiply-devide-add-subtract - START
/**
Multiplies this QSizeF by the factor <tt>d</tt> and return the
result.
*/

    public final QSizeF multiply(double d) { operator_multiply_assign(d); return this; }
/**
Divides this QSizeF by the divisor <tt>d</tt> and returns the result.
*/

    public final QSizeF divide(double d) { operator_divide_assign(d); return this; }
/**
Adds <tt>s</tt> to this QSizeF and returns the result.
*/

    public final QSizeF add(QSizeF p) { operator_add_assign(p); return this; }
/**
Subtracts <tt>s</tt> from this QSizeF and returns the result.
*/

    public final QSizeF subtract(QSizeF p) { operator_subtract_assign(p); return this; }
    // TEMPLATE - core.multiply-devide-add-subtract - END


/**
<brief>Returns a string representation of the <tt>this QSizeF</tt>. </brief>
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
    public QSizeF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSizeF __qt_clone(long __this_nativeId);
}
