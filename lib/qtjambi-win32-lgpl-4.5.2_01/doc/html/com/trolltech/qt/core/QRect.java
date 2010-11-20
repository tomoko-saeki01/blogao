package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QRect class defines a rectangle in the plane using integer precision. A rectangle is normally expressed as an upper-left corner and a size. The size (width and height) of a QRect is always equivalent to the mathematical rectangle that forms the basis for its rendering. <p>A QRect can be constructed with a set of left, top, width and height integers, or from a {@link com.trolltech.qt.core.QPoint QPoint} and a {@link com.trolltech.qt.core.QSize QSize}. The following code creates two identical rectangles. <pre class="snippet">
        QRect r1 = new QRect(100, 200, 11, 16);
        QRect r2 = new QRect(new QPoint(100, 200), new QSize(11, 16));
</pre> There is a third constructor that creates a QRect using the top-left and bottom-right coordinates, but we recommend that you avoid using it. The rationale is that for historical reasons the values returned by the {@link com.trolltech.qt.core.QRect#bottom() bottom()} and {@link com.trolltech.qt.core.QRect#right() right()} functions deviate from the true bottom-right corner of the rectangle. <p>The QRect class provides a collection of functions that return the various rectangle coordinates, and enable manipulation of these. QRect also provide functions to move the rectangle relative to the various coordinates. In addition there is a {@link com.trolltech.qt.core.QRect#moveTo(com.trolltech.qt.core.QPoint) moveTo()} function that moves the rectangle, leaving its top left corner at the given coordinates. Alternatively, the {@link com.trolltech.qt.core.QRect#translate(com.trolltech.qt.core.QPoint) translate()} function moves the rectangle the given offset relative to the current position, and the {@link com.trolltech.qt.core.QRect#translated(com.trolltech.qt.core.QPoint) translated()} function returns a translated copy of this rectangle. <p>The {@link com.trolltech.qt.core.QRect#size() size()} function returns the rectange's dimensions as a {@link com.trolltech.qt.core.QSize QSize}. The dimensions can also be retrieved separately using the {@link com.trolltech.qt.core.QRect#width() width()} and {@link com.trolltech.qt.core.QRect#height() height()} functions. To manipulate the dimensions use the {@link com.trolltech.qt.core.QRect#setSize(com.trolltech.qt.core.QSize) setSize()}, {@link com.trolltech.qt.core.QRect#setWidth(int) setWidth()} or {@link com.trolltech.qt.core.QRect#setHeight(int) setHeight()} functions. Alternatively, the size can be changed by applying either of the functions setting the rectangle coordinates, for example, {@link com.trolltech.qt.core.QRect#setBottom(int) setBottom()} or {@link com.trolltech.qt.core.QRect#setRight(int) setRight()}. <p>The {@link com.trolltech.qt.core.QRect#contains(com.trolltech.qt.core.QPoint) contains()} function tells whether a given point is inside the rectangle or not, and the {@link com.trolltech.qt.core.QRect#intersects(com.trolltech.qt.core.QRect) intersects()} function returns true if this rectangle intersects with a given rectangle. The QRect class also provides the {@link com.trolltech.qt.core.QRect#intersected(com.trolltech.qt.core.QRect) intersected()} function which returns the intersection rectangle, and the {@link com.trolltech.qt.core.QRect#united(com.trolltech.qt.core.QRect) united()} function which returns the rectangle that encloses the given rectangle and this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qrect-intersect.png"></center><br></td><td>  <br><center><img src="../images/qrect-unite.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QRect#intersected(com.trolltech.qt.core.QRect) intersected()}</td><td> {@link com.trolltech.qt.core.QRect#united(com.trolltech.qt.core.QRect) united()}</td></tr></table> The {@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()} function returns true if {@link com.trolltech.qt.core.QRect#left() left()} &gt; {@link com.trolltech.qt.core.QRect#right() right()} or {@link com.trolltech.qt.core.QRect#top() top()} &gt; {@link com.trolltech.qt.core.QRect#bottom() bottom()}. Note that an empty rectangle is not valid: The {@link com.trolltech.qt.core.QRect#isValid() isValid()} function returns true if {@link com.trolltech.qt.core.QRect#left() left()} &lt;= {@link com.trolltech.qt.core.QRect#right() right()}and{@link com.trolltech.qt.core.QRect#top() top()} &lt;= {@link com.trolltech.qt.core.QRect#bottom() bottom()}. A null rectangle ({@link com.trolltech.qt.core.QRect#isNull() isNull()} == true) on the other hand, has both width and height set to 0. <p>Note that due to the way QRect and {@link com.trolltech.qt.core.QRectF QRectF} are defined, an empty QRect is defined in essentially the same way as {@link com.trolltech.qt.core.QRectF QRectF}. <p>Finally, QRect objects can be streamed as well as compared. <ul><li> {@link <a href="#rendering">Rendering</a>}</li><li> {@link <a href="#coordinates">Coordinates</a>}</li></ul><a name="rendering"><h2>Rendering</h2> When using an {@link com.trolltech.qt.gui.QPainter.RenderHint anti-aliased } painter, the boundary line of a QRect will be rendered symmetrically on both sides of the mathematical rectangle's boundary line. But when using an aliased painter (the default) other rules apply. <p>Then, when rendering with a one pixel wide pen the QRect's boundary line will be rendered to the right and below the mathematical rectangle's boundary line. <p>When rendering with a two pixels wide pen the boundary line will be split in the middle by the mathematical rectangle. This will be the case whenever the pen is set to an even number of pixels, while rendering with a pen with an odd number of pixels, the spare pixel will be rendered to the right and below the mathematical rectangle as in the one pixel case. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qrect-diagram-zero.png"></center><br></td><td>  <br><center><img src="../images/qrect-diagram-one.png"></center><br></td></tr><tr valign="top" class="odd"><td> Logical representation</td><td> One pixel wide pen</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/qrect-diagram-two.png"></center><br></td><td>  <br><center><img src="../images/qrect-diagram-three.png"></center><br></td></tr><tr valign="top" class="odd"><td> Two pixel wide pen</td><td> Three pixel wide pen</td></tr></table><a name="coordinates"><h2>Coordinates</h2> The QRect class provides a collection of functions that return the various rectangle coordinates, and enable manipulation of these. QRect also provide functions to move the rectangle relative to the various coordinates. <p>For example the {@link com.trolltech.qt.core.QRect#left() left()}, {@link com.trolltech.qt.core.QRect#setLeft(int) setLeft()} and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()} functions as an example: {@link com.trolltech.qt.core.QRect#left() left()} returns the x-coordinate of the rectangle's left edge, {@link com.trolltech.qt.core.QRect#setLeft(int) setLeft()} sets the left edge of the rectangle to the given x coordinate (it may change the width, but will never change the rectangle's right edge) and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()} moves the entire rectangle horizontally, leaving the rectangle's left edge at the given x coordinate and its size unchanged. <br><center><img src="../images/qrect-coordinates.png"></center><br> Note that for historical reasons the values returned by the {@link com.trolltech.qt.core.QRect#bottom() bottom()} and {@link com.trolltech.qt.core.QRect#right() right()} functions deviate from the true bottom-right corner of the rectangle: The {@link com.trolltech.qt.core.QRect#right() right()} function returns left() + width() - 1 and the {@link com.trolltech.qt.core.QRect#bottom() bottom()} function returns top() + height() - 1. The same is the case for the point returned by the {@link com.trolltech.qt.core.QRect#bottomRight() bottomRight()} convenience function. In addition, the x and y coordinate of the {@link com.trolltech.qt.core.QRect#topRight() topRight()} and {@link com.trolltech.qt.core.QRect#bottomLeft() bottomLeft()} functions, respectively, contain the same deviation from the true right and bottom edges. <p>We recommend that you use {@link com.trolltech.qt.core.QRect#x() x()} + {@link com.trolltech.qt.core.QRect#width() width()} and {@link com.trolltech.qt.core.QRect#y() y()} + {@link com.trolltech.qt.core.QRect#height() height()} to find the true bottom-right corner, and avoid {@link com.trolltech.qt.core.QRect#right() right()} and {@link com.trolltech.qt.core.QRect#bottom() bottom()}. Another solution is to use {@link com.trolltech.qt.core.QRectF QRectF}: The {@link com.trolltech.qt.core.QRectF QRectF} class defines a rectangle in the plane using floating point accuracy for coordinates, and the {@link com.trolltech.qt.core.QRectF#right() QRectF::right()} and {@link com.trolltech.qt.core.QRectF#bottom() QRectF::bottom()} functions do return the right and bottom coordinates. <p>It is also possible to add offsets to this rectangle's coordinates using the {@link com.trolltech.qt.core.QRect#adjust(int, int, int, int) adjust()} function, as well as retrieve a new rectangle based on adjustments of the original one using the {@link com.trolltech.qt.core.QRect#adjusted(int, int, int, int) adjusted()} function. If either of the width and height is negative, use the {@link com.trolltech.qt.core.QRect#normalized() normalized()} function to retrieve a rectangle where the corners are swapped. <p>In addition, QRect provides the getCoords() function which extracts the position of the rectangle's top-left and bottom-right corner, and the getRect() function which extracts the rectangle's top-left corner, width and height. Use the {@link com.trolltech.qt.core.QRect#setCoords(int, int, int, int) setCoords()} and {@link com.trolltech.qt.core.QRect#setRect(int, int, int, int) setRect()} function to manipulate the rectangle's coordinates and dimensions in one go. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF QRectF}, and {@link com.trolltech.qt.gui.QRegion QRegion}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRect extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#isNull() isNull()}. <br></DD></DT>
*/

    public QRect(){
        super((QPrivateConstructor)null);
        __qt_QRect();
    }

    native void __qt_QRect();

/**
Constructs a rectangle with the given <tt>topLeft</tt> and <tt>bottomRight</tt> corners. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}, and {@link com.trolltech.qt.core.QRect#setBottomRight(com.trolltech.qt.core.QPoint) setBottomRight()}. <br></DD></DT>
*/

    public QRect(com.trolltech.qt.core.QPoint topleft, com.trolltech.qt.core.QPoint bottomright){
        super((QPrivateConstructor)null);
        __qt_QRect_QPoint_QPoint(topleft == null ? 0 : topleft.nativeId(), bottomright == null ? 0 : bottomright.nativeId());
    }

    native void __qt_QRect_QPoint_QPoint(long topleft, long bottomright);

/**
Constructs a rectangle with the given <tt>topLeft</tt> corner and the given <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}, and {@link com.trolltech.qt.core.QRect#setSize(com.trolltech.qt.core.QSize) setSize()}. <br></DD></DT>
*/

    public QRect(com.trolltech.qt.core.QPoint topleft, com.trolltech.qt.core.QSize size){
        super((QPrivateConstructor)null);
        __qt_QRect_QPoint_QSize(topleft == null ? 0 : topleft.nativeId(), size == null ? 0 : size.nativeId());
    }

    native void __qt_QRect_QPoint_QSize(long topleft, long size);

/**
Constructs a rectangle with (<tt>x</tt>, <tt>y</tt>) as its top-left corner and the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setRect(int, int, int, int) setRect()}. <br></DD></DT>
*/

    public QRect(int left, int top, int width, int height){
        super((QPrivateConstructor)null);
        __qt_QRect_int_int_int_int(left, top, width, height);
    }

    native void __qt_QRect_int_int_int_int(int left, int top, int width, int height);

/**
Adds <tt>dx1</tt>, <tt>dy1</tt>, <tt>dx2</tt> and <tt>dy2</tt> respectively to the existing coordinates of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#adjusted(int, int, int, int) adjusted()}, and {@link com.trolltech.qt.core.QRect#setRect(int, int, int, int) setRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void adjust(int x1, int y1, int x2, int y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjust_int_int_int_int(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_adjust_int_int_int_int(long __this__nativeId, int x1, int y1, int x2, int y2);

/**
Returns a new rectangle with <tt>dx1</tt>, <tt>dy1</tt>, <tt>dx2</tt> and <tt>dy2</tt> added respectively to the existing coordinates of this rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#adjust(int, int, int, int) adjust()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect adjusted(int x1, int y1, int x2, int y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_adjusted_int_int_int_int(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_adjusted_int_int_int_int(long __this__nativeId, int x1, int y1, int x2, int y2);

/**
Returns the y-coordinate of the rectangle's bottom edge. <p>Note that for historical reasons this function returns {@link com.trolltech.qt.core.QRect#top() top()} + {@link com.trolltech.qt.core.QRect#height() height()} - 1; use {@link com.trolltech.qt.core.QRect#y() y()} + {@link com.trolltech.qt.core.QRect#height() height()} to retrieve the true y-coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setBottom(int) setBottom()}, {@link com.trolltech.qt.core.QRect#bottomLeft() bottomLeft()}, and {@link com.trolltech.qt.core.QRect#bottomRight() bottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bottom()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottom(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bottom(long __this__nativeId);

/**
Returns the position of the rectangle's bottom-left corner. Note that for historical reasons this function returns {@link com.trolltech.qt.core.QPoint QPoint}({@link com.trolltech.qt.core.QRect#left() left()}, {@link com.trolltech.qt.core.QRect#top() top()} + {@link com.trolltech.qt.core.QRect#height() height()} - 1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setBottomLeft(com.trolltech.qt.core.QPoint) setBottomLeft()}, {@link com.trolltech.qt.core.QRect#bottom() bottom()}, and {@link com.trolltech.qt.core.QRect#left() left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint bottomLeft()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomLeft(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_bottomLeft(long __this__nativeId);

/**
Returns the position of the rectangle's bottom-right corner. <p>Note that for historical reasons this function returns {@link com.trolltech.qt.core.QPoint QPoint}({@link com.trolltech.qt.core.QRect#left() left()} + {@link com.trolltech.qt.core.QRect#width() width()} -1, {@link com.trolltech.qt.core.QRect#top() top()} + {@link com.trolltech.qt.core.QRect#height() height()} - 1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setBottomRight(com.trolltech.qt.core.QPoint) setBottomRight()}, {@link com.trolltech.qt.core.QRect#bottom() bottom()}, and {@link com.trolltech.qt.core.QRect#right() right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint bottomRight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomRight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_bottomRight(long __this__nativeId);

/**
Returns the center point of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#moveCenter(com.trolltech.qt.core.QPoint) moveCenter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint center()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_center(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_center(long __this__nativeId);


/**
Returns true if the the given <tt>point</tt> is inside or on the edge of the rectangle, otherwise returns false. If <tt>proper</tt> is true, this function only returns true if the given <tt>point</tt> is inside the rectangle (i.e., not on the edge). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#intersects(com.trolltech.qt.core.QRect) intersects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPoint p) {
        return contains(p, (boolean)false);
    }
/**
Returns true if the the given <tt>point</tt> is inside or on the edge of the rectangle, otherwise returns false. If <tt>proper</tt> is true, this function only returns true if the given <tt>point</tt> is inside the rectangle (i.e., not on the edge). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#intersects(com.trolltech.qt.core.QRect) intersects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPoint p, boolean proper)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPoint_boolean(nativeId(), p == null ? 0 : p.nativeId(), proper);
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPoint_boolean(long __this__nativeId, long p, boolean proper);


/**
This is an overloaded member function, provided for convenience. <p>Returns true if the given <tt>rectangle</tt> is inside this rectangle. otherwise returns false. If <tt>proper</tt> is true, this function only returns true if the <tt>rectangle</tt> is entirely inside this rectangle (not on the edge).
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QRect r) {
        return contains(r, (boolean)false);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns true if the given <tt>rectangle</tt> is inside this rectangle. otherwise returns false. If <tt>proper</tt> is true, this function only returns true if the <tt>rectangle</tt> is entirely inside this rectangle (not on the edge).
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QRect r, boolean proper)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QRect_boolean(nativeId(), r == null ? 0 : r.nativeId(), proper);
    }
    @QtBlockedSlot
    native boolean __qt_contains_QRect_boolean(long __this__nativeId, long r, boolean proper);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the point (<tt>x</tt>, <tt>y</tt>) is inside this rectangle, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native boolean __qt_contains_int_int(long __this__nativeId, int x, int y);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the point (<tt>x</tt>, <tt>y</tt>) is inside or on the edge of the rectangle, otherwise returns false. If <tt>proper</tt> is true, this function only returns true if the point is entirely inside the rectangle(not on the edge).
*/

    @QtBlockedSlot
    public final boolean contains(int x, int y, boolean proper)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_int_int_boolean(nativeId(), x, y, proper);
    }
    @QtBlockedSlot
    native boolean __qt_contains_int_int_boolean(long __this__nativeId, int x, int y, boolean proper);

/**
Returns the height of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setHeight(int) setHeight()}, {@link com.trolltech.qt.core.QRect#width() width()}, and {@link com.trolltech.qt.core.QRect#size() size()}. <br></DD></DT>
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
Returns the intersection of this rectangle and the given <tt>rectangle</tt>. Note that <tt>r.intersected(s)</tt> is equivalent to <tt>r & s</tt>. <br><center><img src="../images/qrect-intersect.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#intersects(com.trolltech.qt.core.QRect) intersects()}, {@link com.trolltech.qt.core.QRect#united(com.trolltech.qt.core.QRect) united()}, and operator&=(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect intersected(com.trolltech.qt.core.QRect other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QRect(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_intersected_QRect(long __this__nativeId, long other);

/**
Returns true if this rectangle intersects with the given <tt>rectangle</tt> (i. ., there is at least one pixel that is within both rectangles), otherwise returns false. <p>The intersection rectangle can be retrieved using the {@link com.trolltech.qt.core.QRect#intersected(com.trolltech.qt.core.QRect) intersected()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#contains(com.trolltech.qt.core.QPoint) contains()}. <br></DD></DT>
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
Returns true if the rectangle is empty, otherwise returns false. <p>An empty rectangle has a {@link com.trolltech.qt.core.QRect#left() left()} &gt; {@link com.trolltech.qt.core.QRect#right() right()} or {@link com.trolltech.qt.core.QRect#top() top()} &gt; {@link com.trolltech.qt.core.QRect#bottom() bottom()}. An empty rectangle is not valid (i.e., {@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()} == !{@link com.trolltech.qt.core.QRect#isValid() isValid()}). <p>Use the {@link com.trolltech.qt.core.QRect#normalized() normalized()} function to retrieve a rectangle where the corners are swapped. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#isNull() isNull()}, {@link com.trolltech.qt.core.QRect#isValid() isValid()}, and {@link com.trolltech.qt.core.QRect#normalized() normalized()}. <br></DD></DT>
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
Returns true if the rectangle is a null rectangle, otherwise returns false. <p>A null rectangle has both the width and the height set to 0 (i.e., {@link com.trolltech.qt.core.QRect#right() right()} == {@link com.trolltech.qt.core.QRect#left() left()} - 1 and {@link com.trolltech.qt.core.QRect#bottom() bottom()} == {@link com.trolltech.qt.core.QRect#top() top()} - 1). A null rectangle is also empty, and hence is not valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()}, and {@link com.trolltech.qt.core.QRect#isValid() isValid()}. <br></DD></DT>
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
Returns true if the rectangle is valid, otherwise returns false. <p>A valid rectangle has a {@link com.trolltech.qt.core.QRect#left() left()} &lt; {@link com.trolltech.qt.core.QRect#right() right()} and {@link com.trolltech.qt.core.QRect#top() top()} &lt; {@link com.trolltech.qt.core.QRect#bottom() bottom()}. Note that non-trivial operations like intersections are not defined for invalid rectangles. A valid rectangle is not empty (i.e., {@link com.trolltech.qt.core.QRect#isValid() isValid()} == !{@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#isNull() isNull()}, {@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()}, and {@link com.trolltech.qt.core.QRect#normalized() normalized()}. <br></DD></DT>
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
Returns the x-coordinate of the rectangle's left edge. Equivalent to {@link com.trolltech.qt.core.QRect#x() x()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setLeft(int) setLeft()}, {@link com.trolltech.qt.core.QRect#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRect#bottomLeft() bottomLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int left()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_left(nativeId());
    }
    @QtBlockedSlot
    native int __qt_left(long __this__nativeId);

/**
Moves the rectangle vertically, leaving the rectangle's bottom edge at the given <tt>y</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#bottom() bottom()}, {@link com.trolltech.qt.core.QRect#setBottom(int) setBottom()}, and {@link com.trolltech.qt.core.QRect#moveTop(int) moveTop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottom(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottom_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveBottom_int(long __this__nativeId, int pos);

/**
Moves the rectangle, leaving the bottom-left corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setBottomLeft(com.trolltech.qt.core.QPoint) setBottomLeft()}, {@link com.trolltech.qt.core.QRect#moveBottom(int) moveBottom()}, and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottomLeft(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottomLeft_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveBottomLeft_QPoint(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the bottom-right corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setBottomRight(com.trolltech.qt.core.QPoint) setBottomRight()}, {@link com.trolltech.qt.core.QRect#moveRight(int) moveRight()}, and {@link com.trolltech.qt.core.QRect#moveBottom(int) moveBottom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottomRight(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottomRight_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveBottomRight_QPoint(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the center point at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#center() center()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveCenter(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveCenter_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveCenter_QPoint(long __this__nativeId, long p);

/**
Moves the rectangle horizontally, leaving the rectangle's left edge at the given <tt>x</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#left() left()}, {@link com.trolltech.qt.core.QRect#setLeft(int) setLeft()}, and {@link com.trolltech.qt.core.QRect#moveRight(int) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveLeft(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveLeft_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveLeft_int(long __this__nativeId, int pos);

/**
Moves the rectangle horizontally, leaving the rectangle's right edge at the given <tt>x</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#right() right()}, {@link com.trolltech.qt.core.QRect#setRight(int) setRight()}, and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveRight(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveRight_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveRight_int(long __this__nativeId, int pos);

/**
Moves the rectangle, leaving the top-left corner at the given <tt>position</tt>.
*/

    @QtBlockedSlot
    public final void moveTo(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTo_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTo_QPoint(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the top-left corner at the given position (<tt>x</tt>, <tt>y</tt>). The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#translate(com.trolltech.qt.core.QPoint) translate()}, and {@link com.trolltech.qt.core.QRect#moveTopLeft(com.trolltech.qt.core.QPoint) moveTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTo(int x, int t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTo_int_int(nativeId(), x, t);
    }
    @QtBlockedSlot
    native void __qt_moveTo_int_int(long __this__nativeId, int x, int t);

/**
Moves the rectangle vertically, leaving the rectangle's top edge at the given <tt>y</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#top() top()}, {@link com.trolltech.qt.core.QRect#setTop(int) setTop()}, and {@link com.trolltech.qt.core.QRect#moveBottom(int) moveBottom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTop(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTop_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveTop_int(long __this__nativeId, int pos);

/**
Moves the rectangle, leaving the top-left corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}, {@link com.trolltech.qt.core.QRect#moveTop(int) moveTop()}, and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTopLeft(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTopLeft_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTopLeft_QPoint(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the top-right corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopRight(com.trolltech.qt.core.QPoint) setTopRight()}, {@link com.trolltech.qt.core.QRect#moveTop(int) moveTop()}, and {@link com.trolltech.qt.core.QRect#moveRight(int) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTopRight(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTopRight_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTopRight_QPoint(long __this__nativeId, long p);

/**
Returns a normalized rectangle; i. ., a rectangle that has a non-negative width and height. <p>If {@link com.trolltech.qt.core.QRect#width() width()} &lt; 0 the function swaps the left and right corners, and it swaps the top and bottom corners if {@link com.trolltech.qt.core.QRect#height() height()} &lt; 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#isValid() isValid()}, and {@link com.trolltech.qt.core.QRect#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect normalized()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_normalized(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_normalized(long __this__nativeId);

/**
<brief>Writes thisQRect
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
    private final boolean operator_equal(com.trolltech.qt.core.QRect arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QRect(nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QRect(long __this__nativeId, long arg__2);

/**
<brief>Reads a QRect
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
Returns the x-coordinate of the rectangle's right edge. <p>Note that for historical reasons this function returns {@link com.trolltech.qt.core.QRect#left() left()} + {@link com.trolltech.qt.core.QRect#width() width()} - 1; use {@link com.trolltech.qt.core.QRect#x() x()} + {@link com.trolltech.qt.core.QRect#width() width()} to retrieve the true x-coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setRight(int) setRight()}, {@link com.trolltech.qt.core.QRect#topRight() topRight()}, and {@link com.trolltech.qt.core.QRect#bottomRight() bottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int right()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_right(nativeId());
    }
    @QtBlockedSlot
    native int __qt_right(long __this__nativeId);

/**
Sets the bottom edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the top edge of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#bottom() bottom()}, and {@link com.trolltech.qt.core.QRect#moveBottom(int) moveBottom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottom(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottom_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setBottom_int(long __this__nativeId, int pos);

/**
Set the bottom-left corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the top-right corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#bottomLeft() bottomLeft()}, and {@link com.trolltech.qt.core.QRect#moveBottomLeft(com.trolltech.qt.core.QPoint) moveBottomLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomLeft(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomLeft_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBottomLeft_QPoint(long __this__nativeId, long p);

/**
Set the bottom-right corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the top-left corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#bottomRight() bottomRight()}, and {@link com.trolltech.qt.core.QRect#moveBottomRight(com.trolltech.qt.core.QPoint) moveBottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomRight(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomRight_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBottomRight_QPoint(long __this__nativeId, long p);

/**
Sets the coordinates of the rectangle's top-left corner to (<tt>x1</tt>, <tt>y1</tt>), and the coordinates of its bottom-right corner to (<tt>x2</tt>, <tt>y2</tt>). <p><DT><b>See also:</b><br><DD>coords(), getCoords(), and {@link com.trolltech.qt.core.QRect#setRect(int, int, int, int) setRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCoords(int x1, int y1, int x2, int y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCoords_int_int_int_int(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_setCoords_int_int_int_int(long __this__nativeId, int x1, int y1, int x2, int y2);

/**
Sets the height of the rectangle to the given <tt>height</tt>. The bottom edge is changed, but not the top one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#height() height()}, and {@link com.trolltech.qt.core.QRect#setSize(com.trolltech.qt.core.QSize) setSize()}. <br></DD></DT>
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
Sets the left edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the right edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRect#setX(int) setX()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#left() left()}, and {@link com.trolltech.qt.core.QRect#moveLeft(int) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLeft(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeft_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setLeft_int(long __this__nativeId, int pos);

/**
Sets the coordinates of the rectangle's top-left corner to (<tt>x</tt>, <tt>y</tt>), and its size to the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>rect(), getRect(), and {@link com.trolltech.qt.core.QRect#setCoords(int, int, int, int) setCoords()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRect(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setRect_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Sets the right edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the left edge of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#right() right()}, and {@link com.trolltech.qt.core.QRect#moveRight(int) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRight(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRight_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setRight_int(long __this__nativeId, int pos);

/**
Sets the size of the rectangle to the given <tt>size</tt>. The top-left corner is not moved. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#size() size()}, {@link com.trolltech.qt.core.QRect#setWidth(int) setWidth()}, and {@link com.trolltech.qt.core.QRect#setHeight(int) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSize(com.trolltech.qt.core.QSize s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSize_QSize(nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSize_QSize(long __this__nativeId, long s);

/**
Sets the top edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the bottom edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRect#setY(int) setY()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#top() top()}, and {@link com.trolltech.qt.core.QRect#moveTop(int) moveTop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTop(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTop_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setTop_int(long __this__nativeId, int pos);

/**
Set the top-left corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the bottom-right corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRect#moveTopLeft(com.trolltech.qt.core.QPoint) moveTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopLeft(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopLeft_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTopLeft_QPoint(long __this__nativeId, long p);

/**
Set the top-right corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the bottom-left corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#topRight() topRight()}, and {@link com.trolltech.qt.core.QRect#moveTopRight(com.trolltech.qt.core.QPoint) moveTopRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopRight(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopRight_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTopRight_QPoint(long __this__nativeId, long p);

/**
Sets the width of the rectangle to the given <tt>width</tt>. The right edge is changed, but not the left one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#width() width()}, and {@link com.trolltech.qt.core.QRect#setSize(com.trolltech.qt.core.QSize) setSize()}. <br></DD></DT>
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
Sets the left edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the right edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRect#setLeft(int) setLeft()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#x() x()}, {@link com.trolltech.qt.core.QRect#setY(int) setY()}, and {@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}. <br></DD></DT>
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
Sets the top edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the bottom edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRect#setTop(int) setTop()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#y() y()}, {@link com.trolltech.qt.core.QRect#setX(int) setX()}, and {@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}. <br></DD></DT>
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
Returns the size of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setSize(com.trolltech.qt.core.QSize) setSize()}, {@link com.trolltech.qt.core.QRect#width() width()}, and {@link com.trolltech.qt.core.QRect#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
Returns the y-coordinate of the rectangle's top edge. Equivalent to {@link com.trolltech.qt.core.QRect#y() y()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTop(int) setTop()}, {@link com.trolltech.qt.core.QRect#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRect#topRight() topRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int top()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_top(nativeId());
    }
    @QtBlockedSlot
    native int __qt_top(long __this__nativeId);

/**
Returns the position of the rectangle's top-left corner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopLeft(com.trolltech.qt.core.QPoint) setTopLeft()}, {@link com.trolltech.qt.core.QRect#top() top()}, and {@link com.trolltech.qt.core.QRect#left() left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint topLeft()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLeft(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_topLeft(long __this__nativeId);

/**
Returns the position of the rectangle's top-right corner. <p>Note that for historical reasons this function returns {@link com.trolltech.qt.core.QPoint QPoint}({@link com.trolltech.qt.core.QRect#left() left()} + {@link com.trolltech.qt.core.QRect#width() width()} -1, {@link com.trolltech.qt.core.QRect#top() top()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setTopRight(com.trolltech.qt.core.QPoint) setTopRight()}, {@link com.trolltech.qt.core.QRect#top() top()}, and {@link com.trolltech.qt.core.QRect#right() right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint topRight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topRight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_topRight(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Moves the rectangle <tt>offset</tt>.{@link com.trolltech.qt.core.QPoint#x() x()} along the x axis and <tt>offset</tt>.{@link com.trolltech.qt.core.QPoint#y() y()} along the y axis, relative to the current position.
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
Moves the rectangle <tt>dx</tt> along the x axis and <tt>dy</tt> along the y axis, relative to the current position. Positive values move the rectangle to the right and down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#moveTopLeft(com.trolltech.qt.core.QPoint) moveTopLeft()}, {@link com.trolltech.qt.core.QRect#moveTo(com.trolltech.qt.core.QPoint) moveTo()}, and {@link com.trolltech.qt.core.QRect#translated(com.trolltech.qt.core.QPoint) translated()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Returns a copy of the rectangle that is translated <tt>offset</tt>.{@link com.trolltech.qt.core.QPoint#x() x()} along the x axis and <tt>offset</tt>.{@link com.trolltech.qt.core.QPoint#y() y()} along the y axis, relative to the current position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect translated(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_translated_QPoint(long __this__nativeId, long p);

/**
Returns a copy of the rectangle that is translated <tt>dx</tt> along the x axis and <tt>dy</tt> along the y axis, relative to the current position. Positive values move the rectangle to the right and down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#translate(com.trolltech.qt.core.QPoint) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect translated(int dx, int dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_translated_int_int(long __this__nativeId, int dx, int dy);

/**
Returns the bounding rectangle of this rectangle and the given <tt>rectangle</tt>. <br><center><img src="../images/qrect-unite.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#intersected(com.trolltech.qt.core.QRect) intersected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect united(com.trolltech.qt.core.QRect other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QRect(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_united_QRect(long __this__nativeId, long other);

/**
Returns the width of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setWidth(int) setWidth()}, {@link com.trolltech.qt.core.QRect#height() height()}, and {@link com.trolltech.qt.core.QRect#size() size()}. <br></DD></DT>
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
Returns the x-coordinate of the rectangle's left edge. Equivalent to {@link com.trolltech.qt.core.QRect#left() left()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setX(int) setX()}, {@link com.trolltech.qt.core.QRect#y() y()}, and {@link com.trolltech.qt.core.QRect#topLeft() topLeft()}. <br></DD></DT>
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
Returns the y-coordinate of the rectangle's top edge. Equivalent to {@link com.trolltech.qt.core.QRect#top() top()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect#setY(int) setY()}, {@link com.trolltech.qt.core.QRect#x() x()}, and {@link com.trolltech.qt.core.QRect#topLeft() topLeft()}. <br></DD></DT>
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

    public static native QRect fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRect(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QRect array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QRect)
        return operator_equal((com.trolltech.qt.core.QRect) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QRect</tt>. </brief>
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
    public QRect clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QRect __qt_clone(long __this_nativeId);
}
