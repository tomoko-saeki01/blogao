package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QPoint class defines a point in the plane using integer precision. A point is specified by a x coordinate and an y coordinate which can be accessed using the {@link com.trolltech.qt.core.QPoint#x() x()} and {@link com.trolltech.qt.core.QPoint#y() y()} functions. The {@link com.trolltech.qt.core.QPoint#isNull() isNull()} function returns true if both x and y are set to 0. The coordinates can be set (or altered) using the {@link com.trolltech.qt.core.QPoint#setX(int) setX()} and {@link com.trolltech.qt.core.QPoint#setY(int) setY()} functions, or alternatively the rx() and ry() functions which return references to the coordinates (allowing direct manipulation). <p>Given a point p, the following statements are all equivalent: <pre class="snippet">
        QPoint p = new QPoint();

        p.setX(p.x() + 1);
        p.add(new QPoint(1, 0));
</pre> A QPoint object can also be used as a vector: Addition and subtraction are defined as for vectors (each component is added separately). A QPoint object can also be divided or multiplied by an <tt>int</tt> or a <tt>qreal</tt>. <p>In addition, the QPoint class provides the {@link com.trolltech.qt.core.QPoint#manhattanLength() manhattanLength()} function which gives an inexpensive approximation of the length of the QPoint object interpreted as a vector. Finally, QPoint objects can be streamed as well as compared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF QPointF}, and {@link com.trolltech.qt.gui.QPolygon QPolygon}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPoint extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null point, i. . with coordinates (0, 0) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#isNull() isNull()}. <br></DD></DT>
*/

    public QPoint(){
        super((QPrivateConstructor)null);
        __qt_QPoint();
    }

    native void __qt_QPoint();

/**
Constructs a point with the given coordinates (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#setX(int) setX()}, and {@link com.trolltech.qt.core.QPoint#setY(int) setY()}. <br></DD></DT>
*/

    public QPoint(int xpos, int ypos){
        super((QPrivateConstructor)null);
        __qt_QPoint_int_int(xpos, ypos);
    }

    native void __qt_QPoint_int_int(int xpos, int ypos);

/**
Returns true if both the x and y coordinates are set to 0, otherwise returns false.
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
Returns the sum of the absolute values of {@link com.trolltech.qt.core.QPoint#x() x()} and {@link com.trolltech.qt.core.QPoint#y() y()}, traditionally known as the "Manhattan length" of the vector from the origin to the point. For example: <pre class="snippet">
        protected QPoint oldPosition = new QPoint();

        protected void mouseMoveEvent(QMouseEvent event)
        {
            QPoint point = new QPoint(event.pos().x(), event.pos().y());
            point.subtract(oldPosition);
            if (point.manhattanLength() &gt; 3) {
                // the mouse has moved more than 3 pixels since the oldPosition
            }
        }
</pre> This is a useful, and quick to calculate, approximation to the true length: <pre class="snippet">
        double trueLength = Math.hypot(p.x(), p.y());
</pre> The tradition of "Manhattan length" arises because such distances apply to travelers who can only travel on a rectangular grid, like the streets of Manhattan.
*/

    @QtBlockedSlot
    public final int manhattanLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_manhattanLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_manhattanLength(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_double(long __this__nativeId, double c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_add_assign(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_QPoint(long __this__nativeId, long p);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_QPoint(long __this__nativeId, long p);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_divide_assign(double c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_divide_assign_double(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_divide_assign_double(long __this__nativeId, double c);

/**
<brief>Writes thisQPoint
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
    private final boolean operator_equal(com.trolltech.qt.core.QPoint p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPoint(nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPoint(long __this__nativeId, long p2);

/**
<brief>Reads a QPoint
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
Sets the x coordinate of this point to the given <tt>x</tt> coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#x() x()}, and {@link com.trolltech.qt.core.QPoint#setY(int) setY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setX(int x)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setX_int(nativeId(), x);
    }
    @QtBlockedSlot
    native void __qt_setX_int(long __this__nativeId, int x);

/**
Sets the y coordinate of this point to the given <tt>y</tt> coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#y() y()}, and {@link com.trolltech.qt.core.QPoint#setX(int) setX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setY(int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setY_int(nativeId(), y);
    }
    @QtBlockedSlot
    native void __qt_setY_int(long __this__nativeId, int y);

/**
Returns the x coordinate of this point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#setX(int) setX()}, and rx(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x(long __this__nativeId);

/**
Returns the y coordinate of this point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPoint#setY(int) setY()}, and ry(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y(long __this__nativeId);

/**
@exclude
*/

    public static native QPoint fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPoint(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPoint array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QPoint)
        return operator_equal((com.trolltech.qt.core.QPoint) other);
        return false;
    }


    // TEMPLATE - core.multiply-devide-add-subtract - START
/**
Multiplies this QPoint by factor <tt>d</tt> and returns the result.

<tt>d</tt>
@return
*/

    public final QPoint multiply(double d) { operator_multiply_assign(d); return this; }
/**
Divides this QPoint by divisor <tt>d</tt> and returns the result.
*/

    public final QPoint divide(double d) { operator_divide_assign(d); return this; }
/**
Adds this QPoint to <tt>p</tt> and returns the result.
*/

    public final QPoint add(QPoint p) { operator_add_assign(p); return this; }
/**
Subtracts this QPoint by <tt>p</tt> and returns the result.
*/

    public final QPoint subtract(QPoint p) { operator_subtract_assign(p); return this; }
    // TEMPLATE - core.multiply-devide-add-subtract - END


/**
<brief>Returns a string representation of the <tt>this QPoint</tt>. </brief>
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
    public QPoint clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPoint __qt_clone(long __this_nativeId);
}
