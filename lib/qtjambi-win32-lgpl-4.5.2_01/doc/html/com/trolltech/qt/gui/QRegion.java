package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QRegion class specifies a clip region for a painter. QRegion is used with {@link com.trolltech.qt.gui.QPainter#setClipRegion(com.trolltech.qt.gui.QRegion) QPainter::setClipRegion()} to limit the paint area to what needs to be painted. There is also a {@link com.trolltech.qt.gui.QWidget#repaint() QWidget::repaint()} function that takes a QRegion parameter. QRegion is the best tool for reducing flicker. <p>A region can be created from a rectangle, an ellipse, a polygon or a bitmap. Complex regions may be created by combining simple regions using {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) united()}, {@link com.trolltech.qt.gui.QRegion#intersected(com.trolltech.qt.core.QRect) intersected()}, {@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}, or {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()} (exclusive or). You can move a region using {@link com.trolltech.qt.gui.QRegion#translate(com.trolltech.qt.core.QPoint) translate()}. <p>You can test whether a region {@link com.trolltech.qt.gui.QRegion#isEmpty() isEmpty()} or if it {@link com.trolltech.qt.gui.QRegion#contains(com.trolltech.qt.core.QPoint) contains()} a {@link com.trolltech.qt.core.QPoint QPoint} or {@link com.trolltech.qt.core.QRect QRect}. The bounding rectangle can be found with {@link com.trolltech.qt.gui.QRegion#boundingRect() boundingRect()}. <p>The function {@link com.trolltech.qt.gui.QRegion#rects() rects()} gives a decomposition of the region into rectangles. <p>Example of using complex regions: <pre class="snippet">
    protected void paintEvent(QPaintEvent e) {
        // r1: elliptic region
        QRegion r1 = new QRegion(new QRect(100, 100, 200, 80),
                                 QRegion.RegionType.Ellipse);

        // r2: rectangular region
        QRegion r2 = new QRegion(new QRect(100, 120, 90, 30));

        // r3: intersection
        QRegion r3 = r1.intersected(r2);

        QPainter painter = new QPainter(this);
        painter.setClipRegion(r3);

        // paint clipped graphics
    }
</pre> QRegion is an {@link <a href="../shared.html">implicitly shared</a>} class. <p><b>Warning:</b> Due to window system limitations, the whole coordinate space for a region is limited to the points between -32767 and 32767 on Windows 95/98/ME. You can circumvent this limitation by using a {@link com.trolltech.qt.gui.QPainterPath QPainterPath}.<a name="additional-license-information"><h2>Additional License Information</h2> On Embedded Linux, Windows CE and X11 platforms, parts of this class rely on code obtained under the following license:Copyright (c) 1987 X ConsortiumPermission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE X CONSORTIUM BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.Except as contained in this notice, the name of the X Consortium shall not be used in advertising or otherwise to promote the sale, use or other dealings in this Software without prior written authorization from the X Consortium.    <hr />
    Copyright 1987 by Digital Equipment Corporation, Maynard, Massachusetts.All Rights ReservedPermission to use, copy, modify, and distribute this software and its documentation for any purpose and without fee is hereby granted, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation, and that the name of Digital not be used in advertising or publicity pertaining to distribution of the software without specific, written prior permission.DIGITAL DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS, IN NO EVENT SHALL DIGITAL BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setClipRegion(com.trolltech.qt.gui.QRegion) QPainter::setClipRegion()}, {@link com.trolltech.qt.gui.QPainter#setClipRect(com.trolltech.qt.core.QRect) QPainter::setClipRect()}, and {@link com.trolltech.qt.gui.QPainterPath QPainterPath}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRegion extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
Specifies the shape of the region to be created.
*/

    public enum RegionType implements com.trolltech.qt.QtEnumerator {
/**
 the region covers the entire rectangle.
*/

        Rectangle(0),
/**
 the region is an ellipse inside the rectangle.
*/

        Ellipse(1);

        RegionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QRegion$RegionType constant with the specified <tt>int</tt>.</brief>
*/

        public static RegionType resolve(int value) {
            return (RegionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Rectangle;
            case 1: return Ellipse;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty region. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#isEmpty() isEmpty()}. <br></DD></DT>
*/

    public QRegion(){
        super((QPrivateConstructor)null);
        __qt_QRegion();

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion();

/**
Constructs a region from the bitmap <tt>bm</tt>. <p>The resulting region consists of the pixels in bitmap <tt>bm</tt> that are {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 }, as if each pixel was a 1 by 1 rectangle. <p>This constructor may create complex regions that will slow down painting when used. Note that drawing masked pixmaps can be done much faster using {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}.
*/

    public QRegion(com.trolltech.qt.gui.QBitmap bitmap){
        super((QPrivateConstructor)null);
        __qt_QRegion_QBitmap(bitmap == null ? 0 : bitmap.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion_QBitmap(long bitmap);


/**
Constructs a polygon region from the point array <tt>a</tt> with the fill rule specified by <tt>fillRule</tt>. <p>If <tt>fillRule</tt> is {@link com.trolltech.qt.core.Qt.FillRule Qt::WindingFill }, the polygon region is defined using the winding algorithm; if it is {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }, the odd-even fill algorithm is used. <p><b>Warning:</b> This constructor can be used to create complex regions that will slow down painting when used.
*/

    public QRegion(com.trolltech.qt.gui.QPolygon pa) {
        this(pa, com.trolltech.qt.core.Qt.FillRule.OddEvenFill);
    }
/**
Constructs a polygon region from the point array <tt>a</tt> with the fill rule specified by <tt>fillRule</tt>. <p>If <tt>fillRule</tt> is {@link com.trolltech.qt.core.Qt.FillRule Qt::WindingFill }, the polygon region is defined using the winding algorithm; if it is {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }, the odd-even fill algorithm is used. <p><b>Warning:</b> This constructor can be used to create complex regions that will slow down painting when used.
*/

    public QRegion(com.trolltech.qt.gui.QPolygon pa, com.trolltech.qt.core.Qt.FillRule fillRule){
        super((QPrivateConstructor)null);
        __qt_QRegion_QPolygon_FillRule(pa == null ? 0 : pa.nativeId(), fillRule.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion_QPolygon_FillRule(long pa, int fillRule);


/**
This is an overloaded member function, provided for convenience. <p>Create a region based on the rectange <tt>r</tt> with region type <tt>t</tt>. <p>If the rectangle is invalid a null region will be created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion.RegionType QRegion::RegionType }. <br></DD></DT>
*/

    public QRegion(com.trolltech.qt.core.QRect r) {
        this(r, com.trolltech.qt.gui.QRegion.RegionType.Rectangle);
    }
/**
This is an overloaded member function, provided for convenience. <p>Create a region based on the rectange <tt>r</tt> with region type <tt>t</tt>. <p>If the rectangle is invalid a null region will be created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion.RegionType QRegion::RegionType }. <br></DD></DT>
*/

    public QRegion(com.trolltech.qt.core.QRect r, com.trolltech.qt.gui.QRegion.RegionType t){
        super((QPrivateConstructor)null);
        __qt_QRegion_QRect_RegionType(r == null ? 0 : r.nativeId(), t.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion_QRect_RegionType(long r, int t);

/**
Constructs a new region which is equal to region <tt>r</tt>.
*/

    public QRegion(com.trolltech.qt.gui.QRegion region){
        super((QPrivateConstructor)null);
        __qt_QRegion_QRegion(region == null ? 0 : region.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion_QRegion(long region);


/**
Constructs a rectangular or elliptic region. <p>If <tt>t</tt> is <tt>Rectangle</tt>, the region is the filled rectangle (<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>). If <tt>t</tt> is <tt>Ellipse</tt>, the region is the filled ellipse with center at (<tt>x</tt> + <tt>w</tt> / 2, <tt>y</tt> + <tt>h</tt> / 2) and size (<tt>w</tt> ,<tt>h</tt>).
*/

    public QRegion(int x, int y, int w, int h) {
        this(x, y, w, h, com.trolltech.qt.gui.QRegion.RegionType.Rectangle);
    }
/**
Constructs a rectangular or elliptic region. <p>If <tt>t</tt> is <tt>Rectangle</tt>, the region is the filled rectangle (<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>). If <tt>t</tt> is <tt>Ellipse</tt>, the region is the filled ellipse with center at (<tt>x</tt> + <tt>w</tt> / 2, <tt>y</tt> + <tt>h</tt> / 2) and size (<tt>w</tt> ,<tt>h</tt>).
*/

    public QRegion(int x, int y, int w, int h, com.trolltech.qt.gui.QRegion.RegionType t){
        super((QPrivateConstructor)null);
        __qt_QRegion_int_int_int_int_RegionType(x, y, w, h, t.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QRegion.class, 1, 4096);
    }

    native void __qt_QRegion_int_int_int_int_RegionType(int x, int y, int w, int h, int t);

/**
Returns the bounding rectangle of this region. An empty region gives a rectangle that is {@link com.trolltech.qt.core.QRect#isNull() QRect::isNull()}.
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
Returns true if the region contains the point <tt>p</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the region overlaps the rectangle <tt>r</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QRect(long __this__nativeId, long r);

/**
Use intersected(<tt>rect</tt>) instead.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion intersect(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersect_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_intersect_QRect(long __this__nativeId, long r);

/**
Returns a region which is the intersection of this region and the given <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}, {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) united()}, and {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion intersected(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_intersected_QRect(long __this__nativeId, long r);

/**
Returns a region which is the intersection of this region and <tt>r</tt>. <br><center><img src="../images/rintersect.png"></center><br> The figure shows the intersection of two elliptical regions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}, {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) united()}, and {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion intersected(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_intersected_QRegion(long __this__nativeId, long r);

/**
Returns true if this region intersects with <tt>rect</tt>, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QRect(long __this__nativeId, long r);

/**
Returns true if this region intersects with <tt>region</tt>, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QRegion(long __this__nativeId, long r);

/**
Returns true if the region is empty; otherwise returns false. An empty region is a region that contains no points. <p>Example: <pre class="snippet">
        QRegion r1 = new QRegion(10, 10, 20, 20);
        r1.isEmpty();               // false

        QRegion r2 = new QRegion(40, 40, 20, 20);
        QRegion r3 = new QRegion();
        r3.isEmpty();               // true

        r3 = r1.intersected(r2);    // r3: intersection of r1 and r2
        r3.isEmpty();               // true

        r3 = r1.united(r2);         // r3: union of r1 and r2
        r3.isEmpty();               // false
</pre>
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
Returns the number of rectangles that will be returned in {@link com.trolltech.qt.gui.QRegion#rects() rects()}.
*/

    @QtBlockedSlot
    public final int numRects()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numRects(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numRects(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion operator_and(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_and_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_operator_and_QRect(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion operator_add(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_operator_add_QRect(long __this__nativeId, long r);

/**
<brief>Writes thisQRegion
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
    private final boolean operator_equal(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QRegion(long __this__nativeId, long r);

/**
<brief>Reads a QRegion
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
Returns an array of non-overlapping rectangles that make up the region. <p>The union of all the rectangles is equal to the original region. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#setRects(com.trolltech.qt.core.QRect[]) setRects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QRect> rects()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rects(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QRect> __qt_rects(long __this__nativeId);

    @QtBlockedSlot
    private final void setRects(com.trolltech.qt.QNativePointer rect, int num)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRects_nativepointer_int(nativeId(), rect, num);
    }
    @QtBlockedSlot
    native void __qt_setRects_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer rect, int num);

/**
Returns a region which is <tt>r</tt> subtracted from this region. <br><center><img src="../images/rsubtract.png"></center><br> The figure shows the result when the ellipse on the right is subtracted from the ellipse on the left (<tt>left - right</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#intersected(com.trolltech.qt.core.QRect) intersected()}, {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) united()}, and {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion subtracted(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subtracted_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_subtracted_QRegion(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience. <p>Translates the region <tt>point</tt>.x() along the x axis and <tt>point</tt>.y() along the y axis, relative to the current position. Positive values move the region to the right and down. <p>Translates to the given <tt>point</tt>.
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
Translates (moves) the region <tt>dx</tt> along the X axis and <tt>dy</tt> along the Y axis.
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
This is an overloaded member function, provided for convenience. <p>Returns a copy of the regtion that is translated <tt>p</tt>.x() along the x axis and <tt>p</tt>.y() along the y axis, relative to the current position. Positive values move the rectangle to the right and down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#translate(com.trolltech.qt.core.QPoint) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion translated(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_translated_QPoint(long __this__nativeId, long p);

/**
Returns a copy of the region that is translated <tt>dx</tt> along the x axis and <tt>dy</tt> along the y axis, relative to the current position. Positive values move the region to the right and down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#translate(com.trolltech.qt.core.QPoint) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion translated(int dx, int dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_translated_int_int(long __this__nativeId, int dx, int dy);

/**
Use united(<tt>rect</tt>) instead.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion unite(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unite_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_unite_QRect(long __this__nativeId, long r);

/**
Returns a region which is the union of this region and the given <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#intersected(com.trolltech.qt.core.QRect) intersected()}, {@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}, and {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion united(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_united_QRect(long __this__nativeId, long r);

/**
Returns a region which is the union of this region and <tt>r</tt>. <br><center><img src="../images/runion.png"></center><br> The figure shows the union of two elliptical regions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#intersected(com.trolltech.qt.core.QRect) intersected()}, {@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}, and {@link com.trolltech.qt.gui.QRegion#xored(com.trolltech.qt.gui.QRegion) xored()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion united(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_united_QRegion(long __this__nativeId, long r);

/**
Returns a region which is the exclusive or (XOR) of this region and <tt>r</tt>. <br><center><img src="../images/rxor.png"></center><br> The figure shows the exclusive or of two elliptical regions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#intersected(com.trolltech.qt.core.QRect) intersected()}, {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) united()}, and {@link com.trolltech.qt.gui.QRegion#subtracted(com.trolltech.qt.gui.QRegion) subtracted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion xored(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_xored_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_xored_QRegion(long __this__nativeId, long r);

/**
@exclude
*/

    public static native QRegion fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRegion(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QRegion array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QRegion)
        return operator_equal((com.trolltech.qt.gui.QRegion) other);
        return false;
    }


/**
Sets the region using the array of rectangles specified by <tt>rects</tt> and <tt>number</tt>. The rectangles must be optimally Y-X sorted and follow these restrictions: <ul><li> The rectangles must not intersect.</li><li> All rectangles with a given top coordinate must have the same height.</li><li> No two rectangles may abut horizontally (they should be combined into a single wider rectangle in that case).</li><li> The rectangles must be sorted in ascending order, with Y as the major sort key and X as the minor sort key.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRegion#rects() rects()}. <br></DD></DT>
*/

    public void setRects(com.trolltech.qt.core.QRect[] rects) {
        setRects(com.trolltech.qt.core.QRect.nativePointerArray(rects), rects.length);
    }


/**
<brief>Returns a string representation of the <tt>this QRegion</tt>. </brief>
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
    public QRegion clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QRegion __qt_clone(long __this_nativeId);
}
