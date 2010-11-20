package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLine class provides a two-dimensional vector using integer precision. A QLine describes a finite length line (or a line segment) on a two-dimensional surface. The start and end points of the line are specified using integer point accuracy for coordinates. Use the {@link com.trolltech.qt.gui.QLineF QLineF} constructor to retrieve a floating point copy. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qline-point.png"></center><br></td><td>  <br><center><img src="../images/qline-coordinates.png"></center><br></td></tr></table> The positions of the line's start and end points can be retrieved using the {@link com.trolltech.qt.gui.QLine#p1() p1()}, {@link com.trolltech.qt.gui.QLine#x1() x1()}, {@link com.trolltech.qt.gui.QLine#y1() y1()}, {@link com.trolltech.qt.gui.QLine#p2() p2()}, {@link com.trolltech.qt.gui.QLine#x2() x2()}, and {@link com.trolltech.qt.gui.QLine#y2() y2()} functions. The {@link com.trolltech.qt.gui.QLine#dx() dx()} and {@link com.trolltech.qt.gui.QLine#dy() dy()} functions return the horizontal and vertical components of the line. Use {@link com.trolltech.qt.gui.QLine#isNull() isNull()} to determine whether the QLine represents a valid line or a null line. <p>Finally, the line can be translated a given offset using the {@link com.trolltech.qt.gui.QLine#translate(com.trolltech.qt.core.QPoint) translate()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF QLineF}, {@link com.trolltech.qt.gui.QPolygon QPolygon}, and {@link com.trolltech.qt.core.QRect QRect}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLine extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null line.
*/

    public QLine(){
        super((QPrivateConstructor)null);
        __qt_QLine();
    }

    native void __qt_QLine();

/**
Constructs a line object that represents the line between <tt>p1</tt> and <tt>p2</tt>.
*/

    public QLine(com.trolltech.qt.core.QPoint pt1, com.trolltech.qt.core.QPoint pt2){
        super((QPrivateConstructor)null);
        __qt_QLine_QPoint_QPoint(pt1 == null ? 0 : pt1.nativeId(), pt2 == null ? 0 : pt2.nativeId());
    }

    native void __qt_QLine_QPoint_QPoint(long pt1, long pt2);

/**
Constructs a line object that represents the line between (<tt>x1</tt>, <tt>y1</tt>) and (<tt>x2</tt>, <tt>y2</tt>).
*/

    public QLine(int x1, int y1, int x2, int y2){
        super((QPrivateConstructor)null);
        __qt_QLine_int_int_int_int(x1, y1, x2, y2);
    }

    native void __qt_QLine_int_int_int_int(int x1, int y1, int x2, int y2);

/**
Returns the horizontal component of the line's vector. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#dy() dy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dx()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dx(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dx(long __this__nativeId);

/**
Returns the vertical component of the line's vector. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#dx() dx()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dy(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dy(long __this__nativeId);

/**
Returns true if the line is not set up with valid start and end point; otherwise returns false.
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
<brief>Writes thisQLine
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
    private final boolean operator_equal(com.trolltech.qt.gui.QLine d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QLine(nativeId(), d == null ? 0 : d.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QLine(long __this__nativeId, long d);

/**
<brief>Reads a QLine
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
Returns the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP1(com.trolltech.qt.core.QPoint) setP1()}, {@link com.trolltech.qt.gui.QLine#x1() x1()}, {@link com.trolltech.qt.gui.QLine#y1() y1()}, and {@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint p1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p1(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_p1(long __this__nativeId);

/**
Returns the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP2(com.trolltech.qt.core.QPoint) setP2()}, {@link com.trolltech.qt.gui.QLine#x2() x2()}, {@link com.trolltech.qt.gui.QLine#y2() y2()}, and {@link com.trolltech.qt.gui.QLine#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint p2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p2(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_p2(long __this__nativeId);

/**
Sets this line to the start in <tt>x1</tt>, <tt>y1</tt> and end in <tt>x2</tt>, <tt>y2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP1(com.trolltech.qt.core.QPoint) setP1()}, {@link com.trolltech.qt.gui.QLine#setP2(com.trolltech.qt.core.QPoint) setP2()}, {@link com.trolltech.qt.gui.QLine#p1() p1()}, and {@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLine(int x1, int y1, int x2, int y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLine_int_int_int_int(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_setLine_int_int_int_int(long __this__nativeId, int x1, int y1, int x2, int y2);

/**
Sets the starting point of this line to <tt>p1</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP2(com.trolltech.qt.core.QPoint) setP2()}, and {@link com.trolltech.qt.gui.QLine#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setP1(com.trolltech.qt.core.QPoint p1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP1_QPoint(nativeId(), p1 == null ? 0 : p1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP1_QPoint(long __this__nativeId, long p1);

/**
Sets the end point of this line to <tt>p2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP1(com.trolltech.qt.core.QPoint) setP1()}, and {@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setP2(com.trolltech.qt.core.QPoint p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP2_QPoint(nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP2_QPoint(long __this__nativeId, long p2);

/**
Sets the start point of this line to <tt>p1</tt> and the end point of this line to <tt>p2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#setP1(com.trolltech.qt.core.QPoint) setP1()}, {@link com.trolltech.qt.gui.QLine#setP2(com.trolltech.qt.core.QPoint) setP2()}, {@link com.trolltech.qt.gui.QLine#p1() p1()}, and {@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPoints(com.trolltech.qt.core.QPoint p1, com.trolltech.qt.core.QPoint p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPoints_QPoint_QPoint(nativeId(), p1 == null ? 0 : p1.nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPoints_QPoint_QPoint(long __this__nativeId, long p1, long p2);

/**
Translates this line by the given <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final void translate(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_translate_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Translates this line the distance specified by <tt>dx</tt> and <tt>dy</tt>.
*/

    @QtBlockedSlot
    public final void translate(int dx, int dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_translate_int_int(long __this__nativeId, int dx, int dy);

/**
Returns this line translated by the given <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLine translated(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLine __qt_translated_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns this line translated the distance specified by <tt>dx</tt> and <tt>dy</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLine translated(int dx, int dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLine __qt_translated_int_int(long __this__nativeId, int dx, int dy);

/**
Returns the x-coordinate of the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int x1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x1(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x1(long __this__nativeId);

/**
Returns the x-coordinate of the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int x2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x2(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x2(long __this__nativeId);

/**
Returns the y-coordinate of the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int y1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y1(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y1(long __this__nativeId);

/**
Returns the y-coordinate of the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int y2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y2(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y2(long __this__nativeId);

/**
@exclude
*/

    public static native QLine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLine(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QLine array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QLine)
        return operator_equal((com.trolltech.qt.gui.QLine) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QLine</tt>. </brief>
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
    public QLine clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QLine __qt_clone(long __this_nativeId);
}
