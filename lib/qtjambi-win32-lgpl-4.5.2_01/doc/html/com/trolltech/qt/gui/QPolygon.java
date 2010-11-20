package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.core.QPoint;


/**
The QPolygon class provides a vector of points using integer precision. A QPolygon object is a QVector&lt;{@link com.trolltech.qt.core.QPoint QPoint}&gt;. The easiest way to add points to a QPolygon is to use QVector's streaming operator, as illustrated below: <pre class="snippet">
            QPolygon polygon = new QPolygon();
            polygon.add(new QPoint(10, 20));
            polygon.add(new QPoint(20, 30));
    </pre> In addition to the functions provided by QVector, QPolygon provides some point-specific functions. <p>Each point in a polygon can be retrieved by passing its index to the point() function. To populate the polygon, QPolygon provides the setPoint() function to set the point at a given index, the setPoints() function to set all the points in the polygon (resizing it to the given number of points), and the putPoints() function which copies a number of given points into the polygon from a specified index (resizing the polygon if necessary). <p>QPolygon provides the {@link com.trolltech.qt.gui.QPolygon#boundingRect() boundingRect()} and {@link com.trolltech.qt.gui.QPolygon#translate(com.trolltech.qt.core.QPoint) translate()} functions for geometry functions. Use the {@link com.trolltech.qt.gui.QMatrix#map(com.trolltech.qt.gui.QLine) QMatrix::map()} function for more general transformations of QPolygons. <p>The QPolygon class is {@link <a href="../shared.html">implicitly shared</a>}. <p><DT><b>See also:</b><br><DD>QVector, {@link com.trolltech.qt.gui.QPolygonF QPolygonF}, and {@link com.trolltech.qt.gui.QLine QLine}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPolygon extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a polygon with no points. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    public QPolygon(){
        super((QPrivateConstructor)null);
        __qt_QPolygon();
    }

    native void __qt_QPolygon();

/**
Constructs a copy of the given <tt>polygon</tt>. <p><DT><b>See also:</b><br><DD>setPoints(). <br></DD></DT>
*/

    public QPolygon(com.trolltech.qt.gui.QPolygon a){
        super((QPrivateConstructor)null);
        __qt_QPolygon_QPolygon(a == null ? 0 : a.nativeId());
    }

    native void __qt_QPolygon_QPolygon(long a);


/**
Constructs a polygon from the given <tt>rectangle</tt>. If <tt>closed</tt> is false, the polygon just contains the four points of the rectangle ordered clockwise, otherwise the polygon's fifth point is set to <tt>rectangle</tt>.topLeft(). <p>Note that the bottom-right corner of the rectangle is located at (rectangle.x() + rectangle.width(), rectangle.y() + rectangle.height()). <p><DT><b>See also:</b><br><DD>setPoints(). <br></DD></DT>
*/

    public QPolygon(com.trolltech.qt.core.QRect r) {
        this(r, (boolean)false);
    }
/**
Constructs a polygon from the given <tt>rectangle</tt>. If <tt>closed</tt> is false, the polygon just contains the four points of the rectangle ordered clockwise, otherwise the polygon's fifth point is set to <tt>rectangle</tt>.topLeft(). <p>Note that the bottom-right corner of the rectangle is located at (rectangle.x() + rectangle.width(), rectangle.y() + rectangle.height()). <p><DT><b>See also:</b><br><DD>setPoints(). <br></DD></DT>
*/

    public QPolygon(com.trolltech.qt.core.QRect r, boolean closed){
        super((QPrivateConstructor)null);
        __qt_QPolygon_QRect_boolean(r == null ? 0 : r.nativeId(), closed);
    }

    native void __qt_QPolygon_QRect_boolean(long r, boolean closed);

/**
Constructs a polygon containing the specified <tt>points</tt>. <p><DT><b>See also:</b><br><DD>setPoints(). <br></DD></DT>
*/

    public QPolygon(java.util.List<com.trolltech.qt.core.QPoint> v){
        super((QPrivateConstructor)null);
        __qt_QPolygon_List(v);
    }

    native void __qt_QPolygon_List(java.util.List<com.trolltech.qt.core.QPoint> v);

/**
Constructs a polygon of the given <tt>size</tt>. Creates an empty polygon if <tt>size</tt> == 0. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    public QPolygon(int size){
        super((QPrivateConstructor)null);
        __qt_QPolygon_int(size);
    }

    native void __qt_QPolygon_int(int size);

/**
Append <tt>t</tt> to this polygon.
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QPoint(long __this__nativeId, long t);

/**
Returns the QPoint at inex <tt>i</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_at_int(long __this__nativeId, int i);

/**
Returns the bounding rectangle of the polygon, or {@link com.trolltech.qt.core.QRect QRect}(0, 0, 0, 0) if the polygon is empty. <p><DT><b>See also:</b><br><DD>QVector::isEmpty(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect boundingRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_boundingRect(long __this__nativeId);

/**
Returns the capacity, i.e., the maximum number of points the polygon can contain.
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
Clears this polygon of all points,
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
Returns true of this QPolygon contains the point <tt>t</tt>; otherwise, returns  false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPoint(long __this__nativeId, long t);

/**
Returns true if the given <tt>point</tt> is inside the polygon according to the specified <tt>fillRule</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean containsPoint(com.trolltech.qt.core.QPoint pt, com.trolltech.qt.core.Qt.FillRule fillRule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_containsPoint_QPoint_FillRule(nativeId(), pt == null ? 0 : pt.nativeId(), fillRule.value());
    }
    @QtBlockedSlot
    native boolean __qt_containsPoint_QPoint_FillRule(long __this__nativeId, long pt, int fillRule);

/**
Returns the number of points that this QPolygon contains.
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
Returns the number of occurrences of <tt>t</tt> in this QPolygon.
*/

    @QtBlockedSlot
    public final int count(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native int __qt_count_QPoint(long __this__nativeId, long t);

/**
Returns true if this QPolygon does not contains any points; otherwise, returns true.
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
    public final boolean endsWith(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_QPoint(long __this__nativeId, long t);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPoint> fill(com.trolltech.qt.core.QPoint t) {
        return fill(t, (int)-1);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPoint> fill(com.trolltech.qt.core.QPoint t, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fill_QPoint_int(nativeId(), t == null ? 0 : t.nativeId(), size);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPoint> __qt_fill_QPoint_int(long __this__nativeId, long t, int size);

/**
Returns the first point contained in this QPolygon.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint first()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_first(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_first(long __this__nativeId);


/**
Returns the index of <tt>t</tt> after the index <tt>from</tt>. The method returns -1 if <tt>t</tt> was not found.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QPoint t) {
        return indexOf(t, (int)0);
    }
/**
Returns the index of <tt>t</tt> after the index <tt>from</tt>. The method returns -1 if <tt>t</tt> was not found.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QPoint t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QPoint_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_QPoint_int(long __this__nativeId, long t, int from);

/**
Returns a polygon which is the intersection of this polygon and <tt>r</tt>. <p>Set operations on polygons will treat the polygons as areas. Non-closed polygons will be treated as implicitly closed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon intersected(com.trolltech.qt.gui.QPolygon r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QPolygon(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_intersected_QPolygon(long __this__nativeId, long r);

/**
Returns true if this QPolygon contains no points; otherwise, returns false.
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
Returns the last point in this QPolygon.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint last()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_last(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_last(long __this__nativeId);


/**
Returns the last index after <tt>from</tt> of <tt>t</tt> in this QPolygon.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QPoint t) {
        return lastIndexOf(t, (int)-1);
    }
/**
Returns the last index after <tt>from</tt> of <tt>t</tt> in this QPolygon.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QPoint t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_QPoint_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_QPoint_int(long __this__nativeId, long t, int from);


/**
Returns <tt>length</tt> points from this QPolygon, starting at index <tt>from</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPoint> mid(int pos) {
        return mid(pos, (int)-1);
    }
/**
Returns <tt>length</tt> points from this QPolygon, starting at index <tt>from</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPoint> mid(int pos, int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid_int_int(nativeId(), pos, length);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPoint> __qt_mid_int_int(long __this__nativeId, int pos, int length);

/**
<brief>Writes thisQPolygon
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
    private final boolean operator_equal(java.util.List<com.trolltech.qt.core.QPoint> v)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_List(nativeId(), v);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QPoint> v);

/**
<brief>Reads a QPolygon
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
Removes the last point in this QPolygon, and then returns that point.
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
Removes the first point from this QPolygon, and then returns that point,
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
Inserts the point <tt>t</tt> as the first point in the polygon.
*/

    @QtBlockedSlot
    public final void prepend(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prepend_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_prepend_QPoint(long __this__nativeId, long t);

/**
Inserts <tt>t</tt> to the end of this QPolygon.
*/

    @QtBlockedSlot
    public final void push_back(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_back_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_back_QPoint(long __this__nativeId, long t);

/**
Inserts <tt>t</tt> as the first point of this polygon.
*/

    @QtBlockedSlot
    public final void push_front(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_front_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_front_QPoint(long __this__nativeId, long t);

/**
rmoves the point at index <tt>i</tt>.
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
Removes <tt>n</tt> points from the index <tt>i</tt>.
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
Replace the point at index <tt>i</tt> with <tt>t</tt>.
*/

    @QtBlockedSlot
    public final void replace(int i, com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replace_int_QPoint(nativeId(), i, t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_replace_int_QPoint(long __this__nativeId, int i, long t);

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
    public final boolean startsWith(com.trolltech.qt.core.QPoint t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_QPoint(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_QPoint(long __this__nativeId, long t);

/**
Returns a polygon which is <tt>r</tt> subtracted from this polygon. <p>Set operations on polygons will treat the polygons as areas. Non-closed polygons will be treated as implicitly closed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon subtracted(com.trolltech.qt.gui.QPolygon r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subtracted_QPolygon(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_subtracted_QPolygon(long __this__nativeId, long r);

/**
Returns the points contained in this polygon in a java.util.List.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QPoint> toList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QPoint> __qt_toList(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Translates all points in the polygon by the given <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final void translate(com.trolltech.qt.core.QPoint offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_QPoint(nativeId(), offset == null ? 0 : offset.nativeId());
    }
    @QtBlockedSlot
    native void __qt_translate_QPoint(long __this__nativeId, long offset);

/**
Translates all points in the polygon by (<tt>dx</tt>, <tt>dy</tt>).
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
Returns a polygon which is the union of this polygon and <tt>r</tt>. <p>Set operations on polygons, will treat the polygons as areas, and implicitly close the polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPolygon#intersected(com.trolltech.qt.gui.QPolygon) intersected()}, and {@link com.trolltech.qt.gui.QPolygon#subtracted(com.trolltech.qt.gui.QPolygon) subtracted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon united(com.trolltech.qt.gui.QPolygon r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QPolygon(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_united_QPolygon(long __this__nativeId, long r);

/**
Returns the point at index <tt>i</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint value(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_value_int(long __this__nativeId, int i);

/**
Returns the point at index <tt>i</tt>. If <tt>i</tt> is out of bounds, <tt>defaultValue</tt> is returned.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint value(int i, com.trolltech.qt.core.QPoint defaultValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int_QPoint(nativeId(), i, defaultValue == null ? 0 : defaultValue.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_value_int_QPoint(long __this__nativeId, int i, long defaultValue);

/**
Sets this QPolygon's points to <tt>list</tt>.
*/

    public native static java.util.List<com.trolltech.qt.core.QPoint> fromList(java.util.List<com.trolltech.qt.core.QPoint> list);

/**
@exclude
*/

    public static native QPolygon fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPolygon(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPolygon array[]);

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


    private native void add_private(long nid, int x, int y);

/**
Adds the point (<tt>x</tt>, <tt>y</tt>) to the end of this QPolygon's
point list.
*/

    @QtBlockedSlot
    public final QPolygon add(int x, int y) {
        add_private(nativeId(), x, y);
        return this;
    }

/**
Adds <tt>pt</tt> to this polygon's point list.
*/

    @QtBlockedSlot
    public final QPolygon add(QPoint pt) {
        add_private(nativeId(), pt.x(), pt.y());
        return this;
    }

/**
Adds the points in <tt>p</tt> to the end of this polygons point list.
*/

    @QtBlockedSlot
    public final QPolygon add(QPolygon p) {
        int size = p.size();
        long nid = nativeId();
        for (int i = 0; i < size; ++i) {
            QPoint pt = p.at(i);
            add_private(nid, pt.x(), pt.y());
        }
        return this;
    }


/**
<brief>Returns a string representation of the <tt>this QPolygon</tt>. </brief>
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
    public QPolygon clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPolygon __qt_clone(long __this_nativeId);
}
