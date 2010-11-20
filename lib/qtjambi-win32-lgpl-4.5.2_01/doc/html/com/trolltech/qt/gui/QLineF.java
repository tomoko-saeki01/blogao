package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLineF class provides a two-dimensional vector using floating point precision. A QLineF describes a finite length line (or line segment) on a two-dimensional surface. QLineF defines the start and end points of the line using floating point accuracy for coordinates. Use the {@link com.trolltech.qt.gui.QLineF#toLine() toLine()} function to retrieve an integer based copy of this line. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qline-point.png"></center><br></td><td>  <br><center><img src="../images/qline-coordinates.png"></center><br></td></tr></table> The positions of the line's start and end points can be retrieved using the {@link com.trolltech.qt.gui.QLineF#p1() p1()}, {@link com.trolltech.qt.gui.QLineF#x1() x1()}, {@link com.trolltech.qt.gui.QLineF#y1() y1()}, {@link com.trolltech.qt.gui.QLineF#p2() p2()}, {@link com.trolltech.qt.gui.QLineF#x2() x2()}, and {@link com.trolltech.qt.gui.QLineF#y2() y2()} functions. The {@link com.trolltech.qt.gui.QLineF#dx() dx()} and {@link com.trolltech.qt.gui.QLineF#dy() dy()} functions return the horizontal and vertical components of the line, respectively. <p>The line's length can be retrieved using the {@link com.trolltech.qt.gui.QLineF#length() length()} function, and altered using the {@link com.trolltech.qt.gui.QLineF#setLength(double) setLength()} function. Similarly, {@link com.trolltech.qt.gui.QLineF#angle() angle()} and {@link com.trolltech.qt.gui.QLineF#setAngle(double) setAngle()} are respectively used for retrieving and altering the angle of the line. Use the {@link com.trolltech.qt.gui.QLineF#isNull() isNull()} function to determine whether the QLineF represents a valid line or a null line. <p>The {@link com.trolltech.qt.gui.QLineF#intersect(com.trolltech.qt.gui.QLineF, com.trolltech.qt.core.QPointF) intersect()} function determines the {@link com.trolltech.qt.gui.QLineF.IntersectType IntersectType } for this line and a given line, while the {@link com.trolltech.qt.gui.QLineF#angle() angle()} function returns the angle between the lines. In addition, the {@link com.trolltech.qt.gui.QLineF#unitVector() unitVector()} function returns a line that has the same starting point as this line, but with a length of only 1, while the {@link com.trolltech.qt.gui.QLineF#normalVector() normalVector()} function returns a line that is perpendicular to this line with the same starting point and length. <p>Finally, the line can be translated a given offset using the {@link com.trolltech.qt.gui.QLineF#translate(com.trolltech.qt.core.QPointF) translate()} function, and can be traversed using the {@link com.trolltech.qt.gui.QLineF#pointAt(double) pointAt()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLine QLine}, {@link com.trolltech.qt.gui.QPolygonF QPolygonF}, and {@link com.trolltech.qt.core.QRectF QRectF}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLineF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
Describes the intersection between two lines. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qlinef-unbounded.png"></center><br></td><td>  <br><center><img src="../images/qlinef-bounded.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QLineF.IntersectType QLineF::UnboundedIntersection }</td><td> {@link com.trolltech.qt.gui.QLineF.IntersectType QLineF::BoundedIntersection }</td></tr></table> {@link com.trolltech.qt.gui.QLineF#intersect(com.trolltech.qt.gui.QLineF, com.trolltech.qt.core.QPointF) intersect()} will also return this value if the intersect point is within the start and end point of only one of the lines. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#intersect(com.trolltech.qt.gui.QLineF, com.trolltech.qt.core.QPointF) intersect()}. <br></DD></DT>
*/

    public enum IntersectType implements com.trolltech.qt.QtEnumerator {
/**
 Indicates that the lines do not intersect; i.e. they are parallel.
*/

        NoIntersection(0),
/**
 The two lines intersect with each other within the start and end points of each line.
*/

        BoundedIntersection(1),
/**
 The two lines intersect, but not within the range defined by their lengths. This will be the case if the lines are not parallel.
*/

        UnboundedIntersection(2);

        IntersectType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLineF$IntersectType constant with the specified <tt>int</tt>.</brief>
*/

        public static IntersectType resolve(int value) {
            return (IntersectType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoIntersection;
            case 1: return BoundedIntersection;
            case 2: return UnboundedIntersection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a null line.
*/

    public QLineF(){
        super((QPrivateConstructor)null);
        __qt_QLineF();
    }

    native void __qt_QLineF();

/**
Construct a QLineF object from the given integer-based <tt>line</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#toLine() toLine()}. <br></DD></DT>
*/

    public QLineF(com.trolltech.qt.gui.QLine line){
        super((QPrivateConstructor)null);
        __qt_QLineF_QLine(line == null ? 0 : line.nativeId());
    }

    native void __qt_QLineF_QLine(long line);

/**
Constructs a line object that represents the line between <tt>p1</tt> and <tt>p2</tt>.
*/

    public QLineF(com.trolltech.qt.core.QPointF pt1, com.trolltech.qt.core.QPointF pt2){
        super((QPrivateConstructor)null);
        __qt_QLineF_QPointF_QPointF(pt1 == null ? 0 : pt1.nativeId(), pt2 == null ? 0 : pt2.nativeId());
    }

    native void __qt_QLineF_QPointF_QPointF(long pt1, long pt2);

/**
Constructs a line object that represents the line between (<tt>x1</tt>, <tt>y1</tt>) and (<tt>x2</tt>, <tt>y2</tt>).
*/

    public QLineF(double x1, double y1, double x2, double y2){
        super((QPrivateConstructor)null);
        __qt_QLineF_double_double_double_double(x1, y1, x2, y2);
    }

    native void __qt_QLineF_double_double_double_double(double x1, double y1, double x2, double y2);

/**
Returns the angle of the line in degrees. <p>Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setAngle(double) setAngle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double angle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_angle(nativeId());
    }
    @QtBlockedSlot
    native double __qt_angle(long __this__nativeId);

/**
Returns the angle (in degrees) between this line and the given <tt>line</tt>, taking the direction of the lines into account. If the lines do not intersect within their range, it is the intersection point of the extended lines that serves as origin (see {@link com.trolltech.qt.gui.QLineF.IntersectType QLineF::UnboundedIntersection }). <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qlinef-angle-identicaldirection.png"></center><br></td><td>  <br><center><img src="../images/qlinef-angle-oppositedirection.png"></center><br></td></tr></table> When the lines are parallel, this function returns 0 if they have the same direction; otherwise it returns 180. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#intersect(com.trolltech.qt.gui.QLineF, com.trolltech.qt.core.QPointF) intersect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double angle(com.trolltech.qt.gui.QLineF l)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_angle_QLineF(nativeId(), l == null ? 0 : l.nativeId());
    }
    @QtBlockedSlot
    native double __qt_angle_QLineF(long __this__nativeId, long l);

/**
Returns the angle (in degrees) from this line to the given <tt>line</tt>, taking the direction of the lines into account. If the lines do not intersect within their range, it is the intersection point of the extended lines that serves as origin (see {@link com.trolltech.qt.gui.QLineF.IntersectType QLineF::UnboundedIntersection }). <p>The returned value represents the number of degrees you need to add to this line to make it have the same angle as the given <tt>line</tt>, going counter-clockwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#intersect(com.trolltech.qt.gui.QLineF, com.trolltech.qt.core.QPointF) intersect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double angleTo(com.trolltech.qt.gui.QLineF l)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_angleTo_QLineF(nativeId(), l == null ? 0 : l.nativeId());
    }
    @QtBlockedSlot
    native double __qt_angleTo_QLineF(long __this__nativeId, long l);

/**
Returns the horizontal component of the line's vector. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#dy() dy()}, and {@link com.trolltech.qt.gui.QLineF#pointAt(double) pointAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double dx()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dx(nativeId());
    }
    @QtBlockedSlot
    native double __qt_dx(long __this__nativeId);

/**
Returns the vertical component of the line's vector. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#dx() dx()}, and {@link com.trolltech.qt.gui.QLineF#pointAt(double) pointAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double dy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dy(nativeId());
    }
    @QtBlockedSlot
    native double __qt_dy(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.gui.QLineF.IntersectType intersect(com.trolltech.qt.gui.QLineF l, com.trolltech.qt.QNativePointer intersectionPoint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLineF.IntersectType.resolve(__qt_intersect_QLineF_nativepointer(nativeId(), l == null ? 0 : l.nativeId(), intersectionPoint));
    }
    @QtBlockedSlot
    native int __qt_intersect_QLineF_nativepointer(long __this__nativeId, long l, com.trolltech.qt.QNativePointer intersectionPoint);

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
Returns the length of the line. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setLength(double) setLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native double __qt_length(long __this__nativeId);

/**
Returns a line that is perpendicular to this line with the same starting point and length. <br><center><img src="../images/qlinef-normalvector.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#unitVector() unitVector()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineF normalVector()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_normalVector(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineF __qt_normalVector(long __this__nativeId);

/**
<brief>Writes thisQLineF
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
    private final boolean operator_equal(com.trolltech.qt.gui.QLineF d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QLineF(nativeId(), d == null ? 0 : d.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QLineF(long __this__nativeId, long d);

/**
<brief>Reads a QLineF
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
Returns the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP1(com.trolltech.qt.core.QPointF) setP1()}, {@link com.trolltech.qt.gui.QLineF#x1() x1()}, {@link com.trolltech.qt.gui.QLineF#y1() y1()}, and {@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF p1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p1(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_p1(long __this__nativeId);

/**
Returns the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP2(com.trolltech.qt.core.QPointF) setP2()}, {@link com.trolltech.qt.gui.QLineF#x2() x2()}, {@link com.trolltech.qt.gui.QLineF#y2() y2()}, and {@link com.trolltech.qt.gui.QLineF#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF p2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_p2(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_p2(long __this__nativeId);

/**
Returns the point at the parameterized position specified by <tt>t</tt>. The function returns the line's start point if t = 0, and its end point if t = 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#dx() dx()}, and {@link com.trolltech.qt.gui.QLineF#dy() dy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF pointAt(double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pointAt_double(nativeId(), t);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_pointAt_double(long __this__nativeId, double t);

/**
Sets the angle of the line to the given <tt>angle</tt> (in degrees). This will change the position of the second point of the line such that the line has the given angle. <p>Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#angle() angle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAngle(double angle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAngle_double(nativeId(), angle);
    }
    @QtBlockedSlot
    native void __qt_setAngle_double(long __this__nativeId, double angle);

/**
Sets the length of the line to the given <tt>length</tt>. QLineF will move the end point - {@link com.trolltech.qt.gui.QLineF#p2() p2()} - of the line to give the line its new length. <p>If the line is a null line, the length will remain zero regardless of the length specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#length() length()}, and {@link com.trolltech.qt.gui.QLineF#isNull() isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLength(double len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLength_double(nativeId(), len);
    }
    @QtBlockedSlot
    native void __qt_setLength_double(long __this__nativeId, double len);

/**
Sets this line to the start in <tt>x1</tt>, <tt>y1</tt> and end in <tt>x2</tt>, <tt>y2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP1(com.trolltech.qt.core.QPointF) setP1()}, {@link com.trolltech.qt.gui.QLineF#setP2(com.trolltech.qt.core.QPointF) setP2()}, {@link com.trolltech.qt.gui.QLineF#p1() p1()}, and {@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLine(double x1, double y1, double x2, double y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLine_double_double_double_double(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_setLine_double_double_double_double(long __this__nativeId, double x1, double y1, double x2, double y2);

/**
Sets the starting point of this line to <tt>p1</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP2(com.trolltech.qt.core.QPointF) setP2()}, and {@link com.trolltech.qt.gui.QLineF#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setP1(com.trolltech.qt.core.QPointF p1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP1_QPointF(nativeId(), p1 == null ? 0 : p1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP1_QPointF(long __this__nativeId, long p1);

/**
Sets the end point of this line to <tt>p2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP1(com.trolltech.qt.core.QPointF) setP1()}, and {@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setP2(com.trolltech.qt.core.QPointF p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setP2_QPointF(nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setP2_QPointF(long __this__nativeId, long p2);

/**
Sets the start point of this line to <tt>p1</tt> and the end point of this line to <tt>p2</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#setP1(com.trolltech.qt.core.QPointF) setP1()}, {@link com.trolltech.qt.gui.QLineF#setP2(com.trolltech.qt.core.QPointF) setP2()}, {@link com.trolltech.qt.gui.QLineF#p1() p1()}, and {@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPoints(com.trolltech.qt.core.QPointF p1, com.trolltech.qt.core.QPointF p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPoints_QPointF_QPointF(nativeId(), p1 == null ? 0 : p1.nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPoints_QPointF_QPointF(long __this__nativeId, long p1, long p2);

/**
Returns an integer based copy of this line. <p>Note that the returned line's start and end points are rounded to the nearest integer. <p><DT><b>See also:</b><br><DD>QLineF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLine toLine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toLine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLine __qt_toLine(long __this__nativeId);

/**
Translates this line by the given <tt>offset</tt>.
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
This is an overloaded member function, provided for convenience. <p>Translates this line the distance specified by <tt>dx</tt> and <tt>dy</tt>.
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
Returns this line translated by the given <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineF translated(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineF __qt_translated_QPointF(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns this line translated the distance specified by <tt>dx</tt> and <tt>dy</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineF translated(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translated_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineF __qt_translated_double_double(long __this__nativeId, double dx, double dy);

/**
Returns the unit vector for this line, i.  a line starting at the same point as this line with a length of 1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#normalVector() normalVector()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineF unitVector()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unitVector(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineF __qt_unitVector(long __this__nativeId);

/**
Returns the x-coordinate of the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double x1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x1(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x1(long __this__nativeId);

/**
Returns the x-coordinate of the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double x2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x2(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x2(long __this__nativeId);

/**
Returns the y-coordinate of the line's start point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#p1() p1()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double y1()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y1(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y1(long __this__nativeId);

/**
Returns the y-coordinate of the line's end point. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineF#p2() p2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double y2()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y2(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y2(long __this__nativeId);

/**
Returns a QLineF with the given <tt>length</tt> and <tt>angle</tt>. <p>The first point of the line will be on the origin. <p>Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position.
*/

    public native static com.trolltech.qt.gui.QLineF fromPolar(double length, double angle);

/**
@exclude
*/

    public static native QLineF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLineF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QLineF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QLineF)
        return operator_equal((com.trolltech.qt.gui.QLineF) other);
        return false;
    }


/**
Returns a value indicating whether or not <b>this</b> line intersects
with the given <tt>line</tt>.
<p>
The actual intersection point is extracted to
<tt>intersectionPoint</tt> (if the pointer is valid). If the lines are
parallel, the intersection point is undefined.
*/

    public final QLineF.IntersectType intersect(QLineF line, com.trolltech.qt.core.QPointF intersectionPoint) {
        return intersect(line, intersectionPoint != null ? intersectionPoint.nativePointer() : null);
    }


/**
<brief>Returns a string representation of the <tt>this QLineF</tt>. </brief>
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
    public QLineF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QLineF __qt_clone(long __this_nativeId);
}
