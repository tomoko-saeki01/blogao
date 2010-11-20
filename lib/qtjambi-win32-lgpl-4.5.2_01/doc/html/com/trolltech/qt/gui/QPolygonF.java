package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.core.QPointF;


/**
The QPolygonF class provides a vector of points using floating point precision. A QPolygonF is a QVector&lt;{@link com.trolltech.qt.core.QPointF QPointF}&gt;. The easiest way to add points to a QPolygonF is to use its streaming operator, as illustrated below: <pre class="snippet">
            QPolygonF polygon = new QPolygonF();
            polygon.add(new QPointF(10.4, 20.5));
            polygon.add(new QPointF(20.2, 30.2));
    </pre> In addition to the functions provided by QVector, QPolygonF provides the {@link com.trolltech.qt.gui.QPolygonF#boundingRect() boundingRect()} and {@link com.trolltech.qt.gui.QPolygonF#translate(com.trolltech.qt.core.QPointF) translate()} functions for geometry operations. Use the {@link com.trolltech.qt.gui.QMatrix#map(com.trolltech.qt.gui.QLine) QMatrix::map()} function for more general transformations of QPolygonFs. <p>QPolygonF also provides the {@link com.trolltech.qt.gui.QPolygonF#isClosed() isClosed()} function to determine whether a polygon's start and end points are the same, and the {@link com.trolltech.qt.gui.QPolygonF#toPolygon() toPolygon()} function returning an integer precision copy of this polygon. <p>The QPolygonF class is {@link <a href="../shared.html">implicitly shared</a>}. <p><DT><b>See also:</b><br><DD>QVector, {@link com.trolltech.qt.gui.QPolygon QPolygon}, and {@link com.trolltech.qt.gui.QLineF QLineF}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPolygonF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a polygon with no points. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    public QPolygonF(){
        super((QPrivateConstructor)null);
        __qt_QPolygonF();
    }

    native void __qt_QPolygonF();

/**
Constructs a float based polygon from the specified integer based <tt>polygon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPolygonF#toPolygon() toPolygon()}. <br></DD></DT>
*/

    public QPolygonF(com.trolltech.qt.gui.QPolygon a){
        super((QPrivateConstructor)null);
        __qt_QPolygonF_QPolygon(a == null ? 0 : a.nativeId());
    }

    native void __qt_QPolygonF_QPolygon(long a);

/**
Constructs a copy of the given <tt>polygon</tt>.
*/

    public QPolygonF(com.trolltech.qt.gui.QPolygonF a){
        super((QPrivateConstructor)null);
        __qt_QPolygonF_QPolygonF(a == null ? 0 : a.nativeId());
    }

    native void __qt_QPolygonF_QPolygonF(long a);

/**
Constructs a closed polygon from the specified <tt>rectangle</tt>. <p>The polygon contains the four vertices of the rectangle in clockwise order starting and ending with the top-left vertex. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPolygonF#isClosed() isClosed()}. <br></DD></DT>
*/

    public QPolygonF(com.trolltech.qt.core.QRectF r){
        super((QPrivateConstructor)null);
        __qt_QPolygonF_QRectF(r == null ? 0 : r.nativeId());
    }

    native void __qt_QPolygonF_QRectF(long r);

/**
Constructs a polygon containing the specified <tt>points</tt>.
*/

    public QPolygonF(java.util.List<com.trolltech.qt.core.QPointF> v){
        super((QPrivateConstructor)null);
        __qt_QPolygonF_List(v);
    }

    native void __qt_QPolygonF_List(java.util.List<com.trolltech.qt.core.QPointF> v);

/**
Constructs a polygon of the given <tt>size</tt>. Creates an empty polygon if <tt>size</tt> == 0. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    public QPolygonF(int size){
        super((QPrivateConstructor)null);
        __qt_QPolygonF_int(size);
    }

    native void __qt_QPolygonF_int(int size);

/**
Appends <tt>t</tt> to this QPolygon.
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QPointF(long __this__nativeId, long t);

/**
Returns the point at positions <tt>i</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_at_int(long __this__nativeId, int i);

/**
Returns the bounding rectangle of the polygon, or {@link com.trolltech.qt.core.QRectF QRectF}(0,0,0,0) if the polygon is empty. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int capacity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_capacity(nativeId());
    }
    @QtBlockedSlot
    native int __qt_capacity(long __this__nativeId);

/**
Removes all points in this QPolygon.
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns true if this polygon contains the point <tt>t</tt>; otherwise, returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPointF(long __this__nativeId, long t);

/**
Returns true if the given <tt>point</tt> is inside the polygon according to the specified <tt>fillRule</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean containsPoint(com.trolltech.qt.core.QPointF pt, com.trolltech.qt.core.Qt.FillRule fillRule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_containsPoint_QPointF_FillRule(nativeId(), pt == null ? 0 : pt.nativeId(), fillRule.value());
    }
    @QtBlockedSlot
    native boolean __qt_containsPoint_QPointF_FillRule(long __this__nativeId, long pt, int fillRule);

/**
Returns the number of points in this QPolygonF.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns the number of occurrences of <tt>t</tt> in this polygon.
*/

    @QtBlockedSlot
    public final int count(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native int __qt_count_QPointF(long __this__nativeId, long t);

/**
Returns true if this polygon contains no points; otherwise, returns false.
*/

    @QtBlockedSlot
    public final boolean empty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_empty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_empty(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean endsWith(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_QPointF(long __this__nativeId, long t);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPointF> fill(com.trolltech.qt.core.QPointF t) {
        return fill(t, (int)-1);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPointF> fill(com.trolltech.qt.core.QPointF t, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fill_QPointF_int(nativeId(), t == null ? 0 : t.nativeId(), size);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPointF> __qt_fill_QPointF_int(long __this__nativeId, long t, int size);

/**
Returns the first point in this polygon.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF first()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_first(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_first(long __this__nativeId);


/**
Returns the index of <tt>t</tt> in this polygon.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QPointF t) {
        return indexOf(t, (int)0);
    }
/**
Returns the index of <tt>t</tt> in this polygon.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QPointF t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QPointF_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_QPointF_int(long __this__nativeId, long t, int from);

/**
Returns a polygon which is the intersection of this polygon and <tt>r</tt>. <p>Set operations on polygons will treat the polygons as areas. Non-closed polygons will be treated as implicitly closed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF intersected(com.trolltech.qt.gui.QPolygonF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QPolygonF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_intersected_QPolygonF(long __this__nativeId, long r);

/**
Returns true if the polygon is closed; otherwise returns false. <p>A polygon is said to be closed if its start point and end point are equal. <p><DT><b>See also:</b><br><DD>QVector::first(), and QVector::last(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isClosed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isClosed(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isClosed(long __this__nativeId);

/**
Returns true if this polygon contains no points; otherwise, returns false.
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
Returns the last point in this polygon.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF last()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_last(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_last(long __this__nativeId);


/**
Returns the last index of <tt>f</tt> in this polygon.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QPointF t) {
        return lastIndexOf(t, (int)-1);
    }
/**
Returns the last index of <tt>f</tt> in this polygon.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QPointF t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_QPointF_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_QPointF_int(long __this__nativeId, long t, int from);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPointF> mid(int pos) {
        return mid(pos, (int)-1);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPointF> mid(int pos, int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid_int_int(nativeId(), pos, length);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPointF> __qt_mid_int_int(long __this__nativeId, int pos, int length);

/**
<brief>Writes thisQPolygonF
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream stream)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long stream);

    @QtBlockedSlot
    private final boolean operator_equal(java.util.List<com.trolltech.qt.core.QPointF> v)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_List(nativeId(), v);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QPointF> v);

/**
<brief>Reads a QPolygonF
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream stream)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long stream);

/**
Removes the last point in this polygon and returns it.
*/

    @QtBlockedSlot
    public final void pop_back()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pop_back(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pop_back(long __this__nativeId);

/**
Removes the first point in this poligon and returns that point.
*/

    @QtBlockedSlot
    public final void pop_front()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pop_front(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pop_front(long __this__nativeId);

/**
Inserts the point <tt>t</tt> first in the polygon's point list.
*/

    @QtBlockedSlot
    public final void prepend(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prepend_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_prepend_QPointF(long __this__nativeId, long t);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void push_back(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_back_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_back_QPointF(long __this__nativeId, long t);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void push_front(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_front_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_front_QPointF(long __this__nativeId, long t);

/**
Removes the point at index <tt>i</tt> from the array.
*/

    @QtBlockedSlot
    public final void remove(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_remove_int(long __this__nativeId, int i);

/**
Remove <tt>n</tt> points from the point at index <tt>i</tt> in this polygon.
*/

    @QtBlockedSlot
    public final void remove(int i, int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_int_int(nativeId(), i, n);
    }
    @QtBlockedSlot
    native void __qt_remove_int_int(long __this__nativeId, int i, int n);

/**
Replaces the item at index position <tt>i</tt> with <tt>t</tt>. <p><tt>i</tt> must be a valid index position in the polygon
*/

    @QtBlockedSlot
    public final void replace(int i, com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replace_int_QPointF(nativeId(), i, t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_replace_int_QPointF(long __this__nativeId, int i, long t);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void reserve(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reserve_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_reserve_int(long __this__nativeId, int size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void resize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_resize_int(long __this__nativeId, int size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSharable(boolean sharable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSharable_boolean(nativeId(), sharable);
    }
    @QtBlockedSlot
    native void __qt_setSharable_boolean(long __this__nativeId, boolean sharable);

/**
Returns the number of points in this polygon.
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void squeeze()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_squeeze(nativeId());
    }
    @QtBlockedSlot
    native void __qt_squeeze(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean startsWith(com.trolltech.qt.core.QPointF t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_QPointF(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_QPointF(long __this__nativeId, long t);

/**
Returns a polygon which is <tt>r</tt> subtracted from this polygon. <p>Set operations on polygons will treat the polygons as areas. Non-closed polygons will be treated as implicitly closed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF subtracted(com.trolltech.qt.gui.QPolygonF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subtracted_QPolygonF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_subtracted_QPolygonF(long __this__nativeId, long r);

/**
Returns the points of this polygon in a list.-
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPointF> toList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPointF> __qt_toList(long __this__nativeId);

/**
Creates and returns a {@link com.trolltech.qt.gui.QPolygon QPolygon} by converting each {@link com.trolltech.qt.core.QPointF QPointF} to a {@link com.trolltech.qt.core.QPoint QPoint}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPointF#toPoint() QPointF::toPoint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon toPolygon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPolygon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_toPolygon(long __this__nativeId);

/**
Translate all points in the polygon by the given <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final void translate(com.trolltech.qt.core.QPointF offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_QPointF(nativeId(), offset == null ? 0 : offset.nativeId());
    }
    @QtBlockedSlot
    native void __qt_translate_QPointF(long __this__nativeId, long offset);

/**
This is an overloaded member function, provided for convenience. <p>Translates all points in the polygon by (<tt>dx</tt>, <tt>dy</tt>).
*/

    @QtBlockedSlot
    public final void translate(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_translate_double_double(long __this__nativeId, double dx, double dy);

/**
Returns a polygon which is the union of this polygon and <tt>r</tt>. <p>Set operations on polygons will treat the polygons as areas. Non-closed polygons will be treated as implicitly closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPolygonF#intersected(com.trolltech.qt.gui.QPolygonF) intersected()}, and {@link com.trolltech.qt.gui.QPolygonF#subtracted(com.trolltech.qt.gui.QPolygonF) subtracted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF united(com.trolltech.qt.gui.QPolygonF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QPolygonF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_united_QPolygonF(long __this__nativeId, long r);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF value(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_value_int(long __this__nativeId, int i);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF value(int i, com.trolltech.qt.core.QPointF defaultValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int_QPointF(nativeId(), i, defaultValue == null ? 0 : defaultValue.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_value_int_QPointF(long __this__nativeId, int i, long defaultValue);

/**
Creates a polygon with the points in <tt>list</tt>.
*/

    public native static java.util.List<com.trolltech.qt.core.QPointF> fromList(java.util.List<com.trolltech.qt.core.QPointF> list);

/**
@exclude
*/

    public static native QPolygonF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPolygonF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPolygonF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof java.util.List)
        return operator_equal((java.util.List) other);
        return false;
    }


    private native void add_private(long nid, double x, double y);

/**
Adds the point (<tt>x</tt>, <tt>y</tt>) to the end of this polygon's
point list.
*/

    @QtBlockedSlot
    public final QPolygonF add(double x, double y) {
        add_private(nativeId(), x, y);
        return this;
    }

/**
Adds <tt>pt</tt> to the end of this polygons point list.
*/

    @QtBlockedSlot
    public final QPolygonF add(QPointF pt) {
        add_private(nativeId(), pt.x(), pt.y());
        return this;
    }

/**
Appends the points of <tt>p</tt> to the end of this polygons point
list.
*/

    @QtBlockedSlot
    public final QPolygonF add(QPolygonF p) {
        int size = p.size();
        long nid = nativeId();
        for (int i = 0; i < size; ++i) {
            QPointF pt = p.at(i);
            add_private(nid, pt.x(), pt.y());
        }
        return this;
    }


/**
<brief>Returns a string representation of the <tt>this QPolygonF</tt>. </brief>
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
    public QPolygonF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPolygonF __qt_clone(long __this_nativeId);
}
