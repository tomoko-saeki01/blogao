package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QRectF class defines a rectangle in the plane using floating point precision. A rectangle is normally expressed as an upper-left corner and a size. The size (width and height) of a QRectF is always equivalent to the mathematical rectangle that forms the basis for its rendering. <p>A QRectF can be constructed with a set of left, top, width and height integers, or from a {@link com.trolltech.qt.core.QPoint QPoint} and a {@link com.trolltech.qt.core.QSize QSize}. The following code creates two identical rectangles. <pre class="snippet">
        QRectF r1 = new QRectF(100, 200, 11, 16);
        QRectF r2 = new QRectF(new QPointF(100, 200), new QSizeF(11, 16));
</pre> There is also a third constructor creating a QRectF from a {@link com.trolltech.qt.core.QRect QRect}, and a corresponding {@link com.trolltech.qt.core.QRectF#toRect() toRect()} function that returns a {@link com.trolltech.qt.core.QRect QRect} object based on the values of this rectangle (note that the coordinates in the returned rectangle are rounded to the nearest integer). <p>The QRectF class provides a collection of functions that return the various rectangle coordinates, and enable manipulation of these. QRectF also provide functions to move the rectangle relative to the various coordinates. In addition there is a {@link com.trolltech.qt.core.QRectF#moveTo(com.trolltech.qt.core.QPointF) moveTo()} function that moves the rectangle, leaving its top left corner at the given coordinates. Alternatively, the {@link com.trolltech.qt.core.QRectF#translate(com.trolltech.qt.core.QPointF) translate()} function moves the rectangle the given offset relative to the current position, and the {@link com.trolltech.qt.core.QRectF#translated(com.trolltech.qt.core.QPointF) translated()} function returns a translated copy of this rectangle. <p>The {@link com.trolltech.qt.core.QRectF#size() size()} function returns the rectange's dimensions as a {@link com.trolltech.qt.core.QSize QSize}. The dimensions can also be retrieved separately using the {@link com.trolltech.qt.core.QRectF#width() width()} and {@link com.trolltech.qt.core.QRectF#height() height()} functions. To manipulate the dimensions use the {@link com.trolltech.qt.core.QRectF#setSize(com.trolltech.qt.core.QSizeF) setSize()}, {@link com.trolltech.qt.core.QRectF#setWidth(double) setWidth()} or {@link com.trolltech.qt.core.QRectF#setHeight(double) setHeight()} functions. Alternatively, the size can be changed by applying either of the functions setting the rectangle coordinates, for example, {@link com.trolltech.qt.core.QRectF#setBottom(double) setBottom()} or {@link com.trolltech.qt.core.QRectF#setRight(double) setRight()}. <p>The {@link com.trolltech.qt.core.QRectF#contains(com.trolltech.qt.core.QPointF) contains()} function tells whether a given point is inside the rectangle or not, and the {@link com.trolltech.qt.core.QRectF#intersects(com.trolltech.qt.core.QRectF) intersects()} function returns true if this rectangle intersects with a given rectangle (otherwise false). The QRectF class also provides the {@link com.trolltech.qt.core.QRectF#intersected(com.trolltech.qt.core.QRectF) intersected()} function which returns the intersection rectangle, and the {@link com.trolltech.qt.core.QRectF#united(com.trolltech.qt.core.QRectF) united()} function which returns the rectangle that encloses the given rectangle and this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qrect-intersect.png"></center><br></td><td>  <br><center><img src="../images/qrect-unite.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QRectF#intersected(com.trolltech.qt.core.QRectF) intersected()}</td><td> {@link com.trolltech.qt.core.QRectF#united(com.trolltech.qt.core.QRectF) united()}</td></tr></table> The {@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()} function returns true if the rectangle's width or height is less than, or equal to, 0. Note that an empty rectangle is not valid: The {@link com.trolltech.qt.core.QRectF#isValid() isValid()} function returns true if both width and height is larger than 0. A null rectangle ({@link com.trolltech.qt.core.QRectF#isNull() isNull()} == true) on the other hand, has both width and height set to 0. <p>Note that due to the way {@link com.trolltech.qt.core.QRect QRect} and QRectF are defined, an empty QRectF is defined in essentially the same way as {@link com.trolltech.qt.core.QRect QRect}. <p>Finally, QRectF objects can be streamed as well as compared. <ul><li> {@link <a href="#rendering">Rendering</a>}</li><li> {@link <a href="#coordinates">Coordinates</a>}</li></ul><a name="rendering"><h2>Rendering</h2> When using an {@link com.trolltech.qt.gui.QPainter.RenderHint anti-aliased } painter, the boundary line of a QRectF will be rendered symmetrically on both sides of the mathematical rectangle's boundary line. But when using an aliased painter (the default) other rules apply. <p>Then, when rendering with a one pixel wide pen the QRectF's boundary line will be rendered to the right and below the mathematical rectangle's boundary line. <p>When rendering with a two pixels wide pen the boundary line will be split in the middle by the mathematical rectangle. This will be the case whenever the pen is set to an even number of pixels, while rendering with a pen with an odd number of pixels, the spare pixel will be rendered to the right and below the mathematical rectangle as in the one pixel case. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qrect-diagram-zero.png"></center><br></td><td>  <br><center><img src="../images/qrectf-diagram-one.png"></center><br></td></tr><tr valign="top" class="odd"><td> Logical representation</td><td> One pixel wide pen</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/qrectf-diagram-two.png"></center><br></td><td>  <br><center><img src="../images/qrectf-diagram-three.png"></center><br></td></tr><tr valign="top" class="odd"><td> Two pixel wide pen</td><td> Three pixel wide pen</td></tr></table><a name="coordinates"><h2>Coordinates</h2> The QRectF class provides a collection of functions that return the various rectangle coordinates, and enable manipulation of these. QRectF also provide functions to move the rectangle relative to the various coordinates. <p>For example: the {@link com.trolltech.qt.core.QRectF#bottom() bottom()}, {@link com.trolltech.qt.core.QRectF#setBottom(double) setBottom()} and {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()} functions: {@link com.trolltech.qt.core.QRectF#bottom() bottom()} returns the y-coordinate of the rectangle's bottom edge, {@link com.trolltech.qt.core.QRectF#setBottom(double) setBottom()} sets the bottom edge of the rectangle to the given y coordinate (it may change the height, but will never change the rectangle's top edge) and {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()} moves the entire rectangle vertically, leaving the rectangle's bottom edge at the given y coordinate and its size unchanged. <br><center><img src="../images/qrectf-coordinates.png"></center><br> It is also possible to add offsets to this rectangle's coordinates using the {@link com.trolltech.qt.core.QRectF#adjust(double, double, double, double) adjust()} function, as well as retrieve a new rectangle based on adjustments of the original one using the {@link com.trolltech.qt.core.QRectF#adjusted(double, double, double, double) adjusted()} function. If either of the width and height is negative, use the {@link com.trolltech.qt.core.QRectF#normalized() normalized()} function to retrieve a rectangle where the corners are swapped. <p>In addition, QRectF provides the getCoords() function which extracts the position of the rectangle's top-left and bottom-right corner, and the getRect() function which extracts the rectangle's top-left corner, width and height. Use the {@link com.trolltech.qt.core.QRectF#setCoords(double, double, double, double) setCoords()} and {@link com.trolltech.qt.core.QRectF#setRect(double, double, double, double) setRect()} function to manipulate the rectangle's coordinates and dimensions in one go. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRect QRect}, and {@link com.trolltech.qt.gui.QRegion QRegion}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRectF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#isNull() isNull()}. <br></DD></DT>
*/

    public QRectF(){
        super((QPrivateConstructor)null);
        __qt_QRectF();
    }

    native void __qt_QRectF();

/**
Constructs a rectangle with the given <tt>topLeft</tt> and <tt>bottomRight</tt> corners. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}, and {@link com.trolltech.qt.core.QRectF#setBottomRight(com.trolltech.qt.core.QPointF) setBottomRight()}. <br></DD></DT>
*/

    public QRectF(com.trolltech.qt.core.QPointF topleft, com.trolltech.qt.core.QPointF bottomRight){
        super((QPrivateConstructor)null);
        __qt_QRectF_QPointF_QPointF(topleft == null ? 0 : topleft.nativeId(), bottomRight == null ? 0 : bottomRight.nativeId());
    }

    native void __qt_QRectF_QPointF_QPointF(long topleft, long bottomRight);

/**
Constructs a rectangle with the given <tt>topLeft</tt> corner and the given <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}, and {@link com.trolltech.qt.core.QRectF#setSize(com.trolltech.qt.core.QSizeF) setSize()}. <br></DD></DT>
*/

    public QRectF(com.trolltech.qt.core.QPointF topleft, com.trolltech.qt.core.QSizeF size){
        super((QPrivateConstructor)null);
        __qt_QRectF_QPointF_QSizeF(topleft == null ? 0 : topleft.nativeId(), size == null ? 0 : size.nativeId());
    }

    native void __qt_QRectF_QPointF_QSizeF(long topleft, long size);

/**
Constructs a QRectF rectangle from the given {@link com.trolltech.qt.core.QRect QRect}<tt>rectangle</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#toRect() toRect()}. <br></DD></DT>
*/

    public QRectF(com.trolltech.qt.core.QRect rect){
        super((QPrivateConstructor)null);
        __qt_QRectF_QRect(rect == null ? 0 : rect.nativeId());
    }

    native void __qt_QRectF_QRect(long rect);

/**
Constructs a rectangle with (<tt>x</tt>, <tt>y</tt>) as its top-left corner and the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setRect(double, double, double, double) setRect()}. <br></DD></DT>
*/

    public QRectF(double left, double top, double width, double height){
        super((QPrivateConstructor)null);
        __qt_QRectF_double_double_double_double(left, top, width, height);
    }

    native void __qt_QRectF_double_double_double_double(double left, double top, double width, double height);

/**
Adds <tt>dx1</tt>, <tt>dy1</tt>, <tt>dx2</tt> and <tt>dy2</tt> respectively to the existing coordinates of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#adjusted(double, double, double, double) adjusted()}, and {@link com.trolltech.qt.core.QRectF#setRect(double, double, double, double) setRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void adjust(double x1, double y1, double x2, double y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjust_double_double_double_double(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_adjust_double_double_double_double(long __this__nativeId, double x1, double y1, double x2, double y2);

/**
Returns a new rectangle with <tt>dx1</tt>, <tt>dy1</tt>, <tt>dx2</tt> and <tt>dy2</tt> added respectively to the existing coordinates of this rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#adjust(double, double, double, double) adjust()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF adjusted(double x1, double y1, double x2, double y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_adjusted_double_double_double_double(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_adjusted_double_double_double_double(long __this__nativeId, double x1, double y1, double x2, double y2);

/**
Returns the y-coordinate of the rectangle's bottom edge. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setBottom(double) setBottom()}, {@link com.trolltech.qt.core.QRectF#bottomLeft() bottomLeft()}, and {@link com.trolltech.qt.core.QRectF#bottomRight() bottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double bottom()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottom(nativeId());
    }
    @QtBlockedSlot
    native double __qt_bottom(long __this__nativeId);

/**
Returns the position of the rectangle's bottom-left corner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setBottomLeft(com.trolltech.qt.core.QPointF) setBottomLeft()}, {@link com.trolltech.qt.core.QRectF#bottom() bottom()}, and {@link com.trolltech.qt.core.QRectF#left() left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF bottomLeft()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomLeft(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_bottomLeft(long __this__nativeId);

/**
Returns the position of the rectangle's bottom-right corner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setBottomRight(com.trolltech.qt.core.QPointF) setBottomRight()}, {@link com.trolltech.qt.core.QRectF#bottom() bottom()}, and {@link com.trolltech.qt.core.QRectF#right() right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF bottomRight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomRight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_bottomRight(long __this__nativeId);

/**
Returns the center point of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#moveCenter(com.trolltech.qt.core.QPointF) moveCenter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF center()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_center(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_center(long __this__nativeId);

/**
Returns true if the given <tt>point</tt> is inside or on the edge of the rectangle; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#intersects(com.trolltech.qt.core.QRectF) intersects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPointF(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the given <tt>rectangle</tt> is inside this rectangle; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QRectF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QRectF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QRectF(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the point (<tt>x</tt>, <tt>y</tt>) is inside or on the edge of the rectangle; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native boolean __qt_contains_double_double(long __this__nativeId, double x, double y);

/**
Returns the height of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setHeight(double) setHeight()}, {@link com.trolltech.qt.core.QRectF#width() width()}, and {@link com.trolltech.qt.core.QRectF#size() size()}. <br></DD></DT>
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
Returns the intersection of this rectangle and the given <tt>rectangle</tt>. Note that <tt>r.intersected(s)</tt> is equivalent to <tt>r & s</tt>. <br><center><img src="../images/qrect-intersect.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#intersects(com.trolltech.qt.core.QRectF) intersects()}, {@link com.trolltech.qt.core.QRectF#united(com.trolltech.qt.core.QRectF) united()}, and operator&=(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF intersected(com.trolltech.qt.core.QRectF other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QRectF(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_intersected_QRectF(long __this__nativeId, long other);

/**
Returns true if this rectangle intersects with the given <tt>rectangle</tt> (i. . there is a non-empty area of overlap between them), otherwise returns false. <p>The intersection rectangle can be retrieved using the {@link com.trolltech.qt.core.QRectF#intersected(com.trolltech.qt.core.QRectF) intersected()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#contains(com.trolltech.qt.core.QPointF) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.core.QRectF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QRectF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QRectF(long __this__nativeId, long r);

/**
Returns true if the rectangle is empty, otherwise returns false. <p>An empty rectangle has {@link com.trolltech.qt.core.QRectF#width() width()} &lt;= 0 or {@link com.trolltech.qt.core.QRectF#height() height()} &lt;= 0. An empty rectangle is not valid (i.e., {@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()} == !{@link com.trolltech.qt.core.QRectF#isValid() isValid()}). <p>Use the {@link com.trolltech.qt.core.QRectF#normalized() normalized()} function to retrieve a rectangle where the corners are swapped. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#isNull() isNull()}, {@link com.trolltech.qt.core.QRectF#isValid() isValid()}, and {@link com.trolltech.qt.core.QRectF#normalized() normalized()}. <br></DD></DT>
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
Returns true if the rectangle is a null rectangle, otherwise returns false. <p>A null rectangle has both the width and the height set to 0. A null rectangle is also empty, and hence not valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()}, and {@link com.trolltech.qt.core.QRectF#isValid() isValid()}. <br></DD></DT>
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
Returns true if the rectangle is valid, otherwise returns false. <p>A valid rectangle has a {@link com.trolltech.qt.core.QRectF#width() width()} &gt; 0 and {@link com.trolltech.qt.core.QRectF#height() height()} &gt; 0. Note that non-trivial operations like intersections are not defined for invalid rectangles. A valid rectangle is not empty (i.e., {@link com.trolltech.qt.core.QRectF#isValid() isValid()} == !{@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#isNull() isNull()}, {@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()}, and {@link com.trolltech.qt.core.QRectF#normalized() normalized()}. <br></DD></DT>
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
Returns the x-coordinate of the rectangle's left edge. Equivalent to {@link com.trolltech.qt.core.QRectF#x() x()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setLeft(double) setLeft()}, {@link com.trolltech.qt.core.QRectF#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRectF#bottomLeft() bottomLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double left()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_left(nativeId());
    }
    @QtBlockedSlot
    native double __qt_left(long __this__nativeId);

/**
Moves the rectangle vertically, leaving the rectangle's bottom edge at the given <tt>y</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#bottom() bottom()}, {@link com.trolltech.qt.core.QRectF#setBottom(double) setBottom()}, and {@link com.trolltech.qt.core.QRectF#moveTop(double) moveTop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottom(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottom_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveBottom_double(long __this__nativeId, double pos);

/**
Moves the rectangle, leaving the bottom-left corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setBottomLeft(com.trolltech.qt.core.QPointF) setBottomLeft()}, {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()}, and {@link com.trolltech.qt.core.QRectF#moveLeft(double) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottomLeft(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottomLeft_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveBottomLeft_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the bottom-right corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setBottomRight(com.trolltech.qt.core.QPointF) setBottomRight()}, {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()}, and {@link com.trolltech.qt.core.QRectF#moveRight(double) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveBottomRight(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBottomRight_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveBottomRight_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the center point at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#center() center()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveCenter(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveCenter_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveCenter_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle horizontally, leaving the rectangle's left edge at the given <tt>x</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#left() left()}, {@link com.trolltech.qt.core.QRectF#setLeft(double) setLeft()}, and {@link com.trolltech.qt.core.QRectF#moveRight(double) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveLeft(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveLeft_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveLeft_double(long __this__nativeId, double pos);

/**
Moves the rectangle horizontally, leaving the rectangle's right edge at the given <tt>x</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#right() right()}, {@link com.trolltech.qt.core.QRectF#setRight(double) setRight()}, and {@link com.trolltech.qt.core.QRectF#moveLeft(double) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveRight(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveRight_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveRight_double(long __this__nativeId, double pos);

/**
This is an overloaded member function, provided for convenience. <p>Moves the rectangle, leaving the top-left corner at the given <tt>position</tt>.
*/

    @QtBlockedSlot
    public final void moveTo(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTo_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTo_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the top-left corner at the given position (<tt>x</tt>, <tt>y</tt>). The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#translate(com.trolltech.qt.core.QPointF) translate()}, and {@link com.trolltech.qt.core.QRectF#moveTopLeft(com.trolltech.qt.core.QPointF) moveTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTo(double x, double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTo_double_double(nativeId(), x, t);
    }
    @QtBlockedSlot
    native void __qt_moveTo_double_double(long __this__nativeId, double x, double t);

/**
Moves the rectangle vertically, leaving the rectangle's top line at the given <tt>y</tt> coordinate. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#top() top()}, {@link com.trolltech.qt.core.QRectF#setTop(double) setTop()}, and {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTop(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTop_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_moveTop_double(long __this__nativeId, double pos);

/**
Moves the rectangle, leaving the top-left corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}, {@link com.trolltech.qt.core.QRectF#moveTop(double) moveTop()}, and {@link com.trolltech.qt.core.QRectF#moveLeft(double) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTopLeft(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTopLeft_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTopLeft_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle, leaving the top-right corner at the given <tt>position</tt>. The rectangle's size is unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopRight(com.trolltech.qt.core.QPointF) setTopRight()}, {@link com.trolltech.qt.core.QRectF#moveTop(double) moveTop()}, and {@link com.trolltech.qt.core.QRectF#moveRight(double) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTopRight(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTopRight_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveTopRight_QPointF(long __this__nativeId, long p);

/**
Returns a normalized rectangle; i. ., a rectangle that has a non-negative width and height. <p>If {@link com.trolltech.qt.core.QRectF#width() width()} &lt; 0 the function swaps the left and right corners, and it swaps the top and bottom corners if {@link com.trolltech.qt.core.QRectF#height() height()} &lt; 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#isValid() isValid()}, and {@link com.trolltech.qt.core.QRectF#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF normalized()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_normalized(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_normalized(long __this__nativeId);

/**
<brief>Writes thisQRectF
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
    private final boolean operator_equal(com.trolltech.qt.core.QRectF arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QRectF(nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QRectF(long __this__nativeId, long arg__2);

/**
<brief>Reads a QRectF
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
Returns the x-coordinate of the rectangle's right edge. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setRight(double) setRight()}, {@link com.trolltech.qt.core.QRectF#topRight() topRight()}, and {@link com.trolltech.qt.core.QRectF#bottomRight() bottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double right()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_right(nativeId());
    }
    @QtBlockedSlot
    native double __qt_right(long __this__nativeId);

/**
Sets the bottom edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the top edge of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#bottom() bottom()}, and {@link com.trolltech.qt.core.QRectF#moveBottom(double) moveBottom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottom(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottom_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setBottom_double(long __this__nativeId, double pos);

/**
Set the bottom-left corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the top-right corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#bottomLeft() bottomLeft()}, and {@link com.trolltech.qt.core.QRectF#moveBottomLeft(com.trolltech.qt.core.QPointF) moveBottomLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomLeft(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomLeft_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBottomLeft_QPointF(long __this__nativeId, long p);

/**
Set the bottom-right corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the top-left corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#bottomRight() bottomRight()}, and {@link com.trolltech.qt.core.QRectF#moveBottomRight(com.trolltech.qt.core.QPointF) moveBottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomRight(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomRight_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBottomRight_QPointF(long __this__nativeId, long p);

/**
Sets the coordinates of the rectangle's top-left corner to (<tt>x1</tt>, <tt>y1</tt>), and the coordinates of its bottom-right corner to (<tt>x2</tt>, <tt>y2</tt>). <p><DT><b>See also:</b><br><DD>getCoords(), and {@link com.trolltech.qt.core.QRectF#setRect(double, double, double, double) setRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCoords(double x1, double y1, double x2, double y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCoords_double_double_double_double(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_setCoords_double_double_double_double(long __this__nativeId, double x1, double y1, double x2, double y2);

/**
Sets the height of the rectangle to the given <tt>height</tt>. The bottom edge is changed, but not the top one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#height() height()}, and {@link com.trolltech.qt.core.QRectF#setSize(com.trolltech.qt.core.QSizeF) setSize()}. <br></DD></DT>
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
Sets the left edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the right edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRectF#setX(double) setX()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#left() left()}, and {@link com.trolltech.qt.core.QRectF#moveLeft(double) moveLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLeft(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeft_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setLeft_double(long __this__nativeId, double pos);

/**
Sets the coordinates of the rectangle's top-left corner to (<tt>x</tt>, <tt>y</tt>), and its size to the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>getRect(), and {@link com.trolltech.qt.core.QRectF#setCoords(double, double, double, double) setCoords()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRect(double x, double y, double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setRect_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Sets the right edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the left edge of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#right() right()}, and {@link com.trolltech.qt.core.QRectF#moveRight(double) moveRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRight(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRight_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setRight_double(long __this__nativeId, double pos);

/**
Sets the size of the rectangle to the given <tt>size</tt>. The top-left corner is not moved. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#size() size()}, {@link com.trolltech.qt.core.QRectF#setWidth(double) setWidth()}, and {@link com.trolltech.qt.core.QRectF#setHeight(double) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSize(com.trolltech.qt.core.QSizeF s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSize_QSizeF(nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSize_QSizeF(long __this__nativeId, long s);

/**
Sets the top edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the bottom edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRectF#setY(double) setY()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#top() top()}, and {@link com.trolltech.qt.core.QRectF#moveTop(double) moveTop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTop(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTop_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setTop_double(long __this__nativeId, double pos);

/**
Set the top-left corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the bottom-right corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRectF#moveTopLeft(com.trolltech.qt.core.QPointF) moveTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopLeft(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopLeft_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTopLeft_QPointF(long __this__nativeId, long p);

/**
Set the top-right corner of the rectangle to the given <tt>position</tt>. May change the size, but will never change the bottom-left corner of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#topRight() topRight()}, and {@link com.trolltech.qt.core.QRectF#moveTopRight(com.trolltech.qt.core.QPointF) moveTopRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopRight(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopRight_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTopRight_QPointF(long __this__nativeId, long p);

/**
Sets the width of the rectangle to the given <tt>width</tt>. The right edge is changed, but not the left one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#width() width()}, and {@link com.trolltech.qt.core.QRectF#setSize(com.trolltech.qt.core.QSizeF) setSize()}. <br></DD></DT>
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
Sets the left edge of the rectangle to the given <tt>x</tt> coordinate. May change the width, but will never change the right edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRectF#setLeft(double) setLeft()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#x() x()}, {@link com.trolltech.qt.core.QRectF#setY(double) setY()}, and {@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setX(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setX_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setX_double(long __this__nativeId, double pos);

/**
Sets the top edge of the rectangle to the given <tt>y</tt> coordinate. May change the height, but will never change the bottom edge of the rectangle. <p>Equivalent to {@link com.trolltech.qt.core.QRectF#setTop(double) setTop()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#y() y()}, {@link com.trolltech.qt.core.QRectF#setX(double) setX()}, and {@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setY(double pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setY_double(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_setY_double(long __this__nativeId, double pos);

/**
Returns the size of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setSize(com.trolltech.qt.core.QSizeF) setSize()}, {@link com.trolltech.qt.core.QRectF#width() width()}, and {@link com.trolltech.qt.core.QRectF#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_size(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.core.QRect QRect} based on the values of this rectangle that is the smallest possible integer rectangle that completely contains this rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#toRect() toRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect toAlignedRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toAlignedRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_toAlignedRect(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.core.QRect QRect} based on the values of this rectangle. Note that the coordinates in the returned rectangle are rounded to the nearest integer. <p><DT><b>See also:</b><br><DD>QRectF(), and {@link com.trolltech.qt.core.QRectF#toAlignedRect() toAlignedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect toRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_toRect(long __this__nativeId);

/**
Returns the y-coordinate of the rectangle's top edge. Equivalent to {@link com.trolltech.qt.core.QRectF#y() y()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTop(double) setTop()}, {@link com.trolltech.qt.core.QRectF#topLeft() topLeft()}, and {@link com.trolltech.qt.core.QRectF#topRight() topRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double top()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_top(nativeId());
    }
    @QtBlockedSlot
    native double __qt_top(long __this__nativeId);

/**
Returns the position of the rectangle's top-left corner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopLeft(com.trolltech.qt.core.QPointF) setTopLeft()}, {@link com.trolltech.qt.core.QRectF#top() top()}, and {@link com.trolltech.qt.core.QRectF#left() left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF topLeft()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLeft(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_topLeft(long __this__nativeId);

/**
Returns the position of the rectangle's top-right corner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setTopRight(com.trolltech.qt.core.QPointF) setTopRight()}, {@link com.trolltech.qt.core.QRectF#top() top()}, and {@link com.trolltech.qt.core.QRectF#right() right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF topRight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topRight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_topRight(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Moves the rectangle <tt>offset</tt>.{@link com.trolltech.qt.core.QPointF#x() x()} along the x axis and <tt>offset</tt>.{@link com.trolltech.qt.core.QPointF#y() y()} along the y axis, relative to the current position.
*/

    @QtBlockedSlot
    public final void translate(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_translate_QPointF(long __this__nativeId, long p);

/**
Moves the rectangle <tt>dx</tt> along the x-axis and <tt>dy</tt> along the y-axis, relative to the current position. Positive values move the rectangle to the right and downwards. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#moveTopLeft(com.trolltech.qt.core.QPointF) moveTopLeft()}, {@link com.trolltech.qt.core.QRectF#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, and {@link com.trolltech.qt.core.QRectF#translated(com.trolltech.qt.core.QPointF) translated()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Returns a copy of the rectangle that is translated <tt>offset</tt>.{@link com.trolltech.qt.core.QPointF#x() x()} along the x axis and <tt>offset</tt>.{@link com.trolltech.qt.core.QPointF#y() y()} along the y axis, relative to the current position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF translated(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_translated_QPointF(long __this__nativeId, long p);

/**
Returns a copy of the rectangle that is translated <tt>dx</tt> along the x axis and <tt>dy</tt> along the y axis, relative to the current position. Positive values move the rectangle to the right and down. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#translate(com.trolltech.qt.core.QPointF) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF translated(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_translated_double_double(long __this__nativeId, double dx, double dy);

/**
Returns the bounding rectangle of this rectangle and the given <tt>rectangle</tt>. <br><center><img src="../images/qrect-unite.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#intersected(com.trolltech.qt.core.QRectF) intersected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF united(com.trolltech.qt.core.QRectF other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QRectF(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_united_QRectF(long __this__nativeId, long other);

/**
Returns the width of the rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setWidth(double) setWidth()}, {@link com.trolltech.qt.core.QRectF#height() height()}, and {@link com.trolltech.qt.core.QRectF#size() size()}. <br></DD></DT>
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
Returns the x-coordinate of the rectangle's left edge. Equivalent to {@link com.trolltech.qt.core.QRectF#left() left()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setX(double) setX()}, {@link com.trolltech.qt.core.QRectF#y() y()}, and {@link com.trolltech.qt.core.QRectF#topLeft() topLeft()}. <br></DD></DT>
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
Returns the y-coordinate of the rectangle's top edge. Equivalent to {@link com.trolltech.qt.core.QRectF#top() top()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRectF#setY(double) setY()}, {@link com.trolltech.qt.core.QRectF#x() x()}, and {@link com.trolltech.qt.core.QRectF#topLeft() topLeft()}. <br></DD></DT>
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

    public static native QRectF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRectF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QRectF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QRectF)
        return operator_equal((com.trolltech.qt.core.QRectF) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QRectF</tt>. </brief>
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
    public QRectF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QRectF __qt_clone(long __this_nativeId);
}
