package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QPointF class defines a point in the plane using floating point precision. A point is specified by a x coordinate and an y coordinate which can be accessed using the {@link com.trolltech.qt.core.QPointF#x() x()} and {@link com.trolltech.qt.core.QPointF#y() y()} functions. The coordinates of the point are specified using floating point numbers for accuracy. The {@link com.trolltech.qt.core.QPointF#isNull() isNull()} function returns true if both x and y are set to 0.0. The coordinates can be set (or altered) using the {@link com.trolltech.qt.core.QPointF#setX(double) setX()} and {@link com.trolltech.qt.core.QPointF#setY(double) setY()} functions, or alternatively the rx() and ry() functions which return references to the coordinates (allowing direct manipulation). <p>Given a point p, the following statements are all equivalent: <pre class="snippet">
        QPointF p = new QPointF();

        p.setX(p.x() + 1.0);
        p.add(new QPointF(1.0, 0.0));
</pre> A QPointF object can also be used as a vector: Addition and subtraction are defined as for vectors (each component is added separately). A QPointF object can also be divided or multiplied by an <tt>int</tt> or a <tt>qreal</tt>. <p>In addition, the QPointF class provides a constructor converting a {@link com.trolltech.qt.core.QPoint QPoint} object into a QPointF object, and a corresponding {@link com.trolltech.qt.core.QPointF#toPoint() toPoint()} function which returns a {@link com.trolltech.qt.core.QPoint QPoint} copy of this point. Finally, QPointF objects can be streamed as well as compared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint QPoint}, and {@link com.trolltech.qt.gui.QPolygonF QPolygonF}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPointF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null point, i. . with coordinates (0.0, 0.0) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#isNull() isNull()}. <br></DD></DT>
*/

    public QPointF(){
        super((QPrivateConstructor)null);
        __qt_QPointF();
    }

    native void __qt_QPointF();

/**
Constructs a copy of the given <tt>point</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#toPoint() toPoint()}. <br></DD></DT>
*/

    public QPointF(com.trolltech.qt.core.QPoint p){
        super((QPrivateConstructor)null);
        __qt_QPointF_QPoint(p == null ? 0 : p.nativeId());
    }

    native void __qt_QPointF_QPoint(long p);

/**
Constructs a point with the given coordinates (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#setX(double) setX()}, and {@link com.trolltech.qt.core.QPointF#setY(double) setY()}. <br></DD></DT>
*/

    public QPointF(double xpos, double ypos){
        super((QPrivateConstructor)null);
        __qt_QPointF_double_double(xpos, ypos);
    }

    native void __qt_QPointF_double_double(double xpos, double ypos);

/**
Returns true if both the x and y coordinates are set to 0.0, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_double(long __this__nativeId, double c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_add_assign(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_QPointF(long __this__nativeId, long p);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_QPointF(long __this__nativeId, long p);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_divide_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_divide_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_divide_assign_double(long __this__nativeId, double c);

/**
<brief>Writes thisQPointF
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
    private final boolean operator_equal(com.trolltech.qt.core.QPointF p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPointF(nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPointF(long __this__nativeId, long p2);

/**
<brief>Reads a QPointF
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
Sets the x coordinate of this point to the given <tt>x</tt> coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#x() x()}, and {@link com.trolltech.qt.core.QPointF#setY(double) setY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setX(double x)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setX_double(nativeId(), x);
    }
    @QtBlockedSlot
    native void __qt_setX_double(long __this__nativeId, double x);

/**
Sets the y coordinate of this point to the given <tt>y</tt> coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#y() y()}, and {@link com.trolltech.qt.core.QPointF#setX(double) setX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setY(double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setY_double(nativeId(), y);
    }
    @QtBlockedSlot
    native void __qt_setY_double(long __this__nativeId, double y);

/**
Rounds the coordinates of this point to the nearest integer, and returns a {@link com.trolltech.qt.core.QPoint QPoint} object with the rounded coordinates. <p><DT><b>See also:</b><br><DD>QPointF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint toPoint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPoint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_toPoint(long __this__nativeId);

/**
Returns the x-coordinate of this point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#setX(double) setX()}, and rx(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final double x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x(long __this__nativeId);

/**
Returns the y-coordinate of this point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#setY(double) setY()}, and ry(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final double y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y(long __this__nativeId);

/**
@exclude
*/

    public static native QPointF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPointF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPointF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QPointF)
        return operator_equal((com.trolltech.qt.core.QPointF) other);
        return false;
    }


    // TEMPLATE - core.multiply-devide-add-subtract - START
/**
Multiplies this QPointF by factor <tt>d</tt> and returns the result.
*/

    public final QPointF multiply(double d) { operator_multiply_assign(d); return this; }
/**
Divides this QPointF by deviser <tt>s</tt> and returns the result.
*/

    public final QPointF divide(double d) { operator_divide_assign(d); return this; }
/**
Adds <tt>p</tt> to this QPointF and returns the result.
*/

    public final QPointF add(QPointF p) { operator_add_assign(p); return this; }
/**
Subtracts <tt>p</tt> from this QPointF and returns the result.
*/

    public final QPointF subtract(QPointF p) { operator_subtract_assign(p); return this; }
    // TEMPLATE - core.multiply-devide-add-subtract - END


/**
<brief>Returns a string representation of the <tt>this QPointF</tt>. </brief>
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
    public QPointF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPointF __qt_clone(long __this_nativeId);
}
