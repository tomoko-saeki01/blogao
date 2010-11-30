package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMatrix class specifies 2D transformations of a coordinate system. A matrix specifies how to translate, scale, shear or rotate the coordinate system, and is typically used when rendering graphics. <p>A QMatrix object can be built using the {@link com.trolltech.qt.gui.QMatrix#setMatrix(double, double, double, double, double, double) setMatrix()}, {@link com.trolltech.qt.gui.QMatrix#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QMatrix#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QMatrix#translate(double, double) translate()} and {@link com.trolltech.qt.gui.QMatrix#shear(double, double) shear()} functions. Alternatively, it can be built by applying basic matrix operations. The matrix can also be defined when constructed, and it can be reset to the identity matrix (the default) using the {@link com.trolltech.qt.gui.QMatrix#reset() reset()} function. <p>The QMatrix class supports mapping of graphic primitives: A given point, line, polygon, region, or painter path can be mapped to the coordinate system defined by this matrix using the {@link com.trolltech.qt.gui.QMatrix#map(com.trolltech.qt.gui.QLine) map()} function. In case of a rectangle, its coordinates can be transformed using the {@link com.trolltech.qt.gui.QMatrix#mapRect(com.trolltech.qt.core.QRect) mapRect()} function. A rectangle can also be transformed into a polygon (mapped to the coordinate system defined by this matrix), using the {@link com.trolltech.qt.gui.QMatrix#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()} function. <p>QMatrix provides the {@link com.trolltech.qt.gui.QMatrix#isIdentity() isIdentity()} function which returns true if the matrix is the identity matrix, and the {@link com.trolltech.qt.gui.QMatrix#isInvertible() isInvertible()} function which returns true if the matrix is non-singular (i.e. AB = BA = I). The {@link com.trolltech.qt.gui.QMatrix#inverted() inverted()} function returns an inverted copy of this matrix if it is invertible (otherwise it returns the identity matrix). In addition, QMatrix provides the {@link com.trolltech.qt.gui.QMatrix#det() det()} function returning the matrix's determinant. <p>Finally, the QMatrix class supports matrix multiplication, and objects of the class can be streamed as well as compared. <ul><li> {@link <a href="#rendering-graphics">Rendering Graphics</a>}</li><li> {@link <a href="#basic-matrix-operations">Basic Matrix Operations</a>}</li></ul><a name="rendering-graphics"><h2>Rendering Graphics</h2> When rendering graphics, the matrix defines the transformations but the actual transformation is performed by the drawing routines in {@link com.trolltech.qt.gui.QPainter QPainter}. <p>By default, {@link com.trolltech.qt.gui.QPainter QPainter} operates on the associated device's own coordinate system. The standard coordinate system of a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} has its origin located at the top-left position. The x values increase to the right; y values increase downward. For a complete description, see the {@link <a href="../coordsys.html">coordinate system</a>} documentation. <p>{@link com.trolltech.qt.gui.QPainter QPainter} has functions to translate, scale, shear and rotate the coordinate system without using a QMatrix. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qmatrix-simpletransformation.png"></center><br></td><td> <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    {
        QPainter painter = new QPainter(this);
        painter.setPen(new QPen(QColor.blue, 1, Qt.PenStyle.DashLine));
        painter.drawRect(0, 0, 100, 100);

        painter.rotate(45);

        painter.setFont(new QFont("Helvetica", 24));
        painter.setPen(new QPen(QColor.black, 1));
        painter.drawText(20, 10, "QMatrix");
    }
    </pre></td></tr></table> Although these functions are very convenient, it can be more efficient to build a QMatrix and call QPainter::setMatrix() if you want to perform more than a single transform operation. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qmatrix-combinedtransformation.png"></center><br></td><td> <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    {
        QPainter painter = new QPainter(this);
        painter.setPen(new QPen(QColor.blue, 1,
                                Qt.PenStyle.DashLine));
        painter.drawRect(0, 0, 100, 100);

        QMatrix matrix = new QMatrix();
        matrix.translate(50, 50);
        matrix.rotate(45);
        matrix.scale(0.5, 1.0);
        painter.setWorldMatrix(matrix);

        painter.setFont(new QFont("Helvetica", 24));
        painter.setPen(new QPen(QColor.black, 1));
        painter.drawText(20, 10, "QMatrix");
    }
    </pre></td></tr></table><a name="basic-matrix-operations"><h2>Basic Matrix Operations</h2> <br><center><img src="../images/qmatrix-representation.png"></center><br> A QMatrix object contains a 3 x 3 matrix. The <tt>dx</tt> and <tt>dy</tt> elements specify horizontal and vertical translation. The <tt>m11</tt> and <tt>m22</tt> elements specify horizontal and vertical scaling. And finally, the <tt>m21</tt> and <tt>m12</tt> elements specify horizontal and vertical shearing. <p>QMatrix transforms a point in the plane to another point using the following formulas: <pre class="snippet">
        x' = m11 + m21 + dx
        y' = m22 + m12 + dy
</pre> The point (x, y) is the original point, and (x', y') is the transformed point. (x', y') can be transformed back to (x, y) by performing the same operation on the {@link com.trolltech.qt.gui.QMatrix#inverted() inverted()} matrix. <p>The various matrix elements can be set when constructing the matrix, or by using the {@link com.trolltech.qt.gui.QMatrix#setMatrix(double, double, double, double, double, double) setMatrix()} function later on. They can also be manipulated using the {@link com.trolltech.qt.gui.QMatrix#translate(double, double) translate()}, {@link com.trolltech.qt.gui.QMatrix#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QMatrix#scale(double, double) scale()} and {@link com.trolltech.qt.gui.QMatrix#shear(double, double) shear()} convenience functions, The currently set values can be retrieved using the {@link com.trolltech.qt.gui.QMatrix#m11() m11()}, {@link com.trolltech.qt.gui.QMatrix#m12() m12()}, {@link com.trolltech.qt.gui.QMatrix#m21() m21()}, {@link com.trolltech.qt.gui.QMatrix#m22() m22()}, {@link com.trolltech.qt.gui.QMatrix#dx() dx()} and {@link com.trolltech.qt.gui.QMatrix#dy() dy()} functions. <p>Translation is the simplest transformation. Setting <tt>dx</tt> and <tt>dy</tt> will move the coordinate system <tt>dx</tt> units along the X axis and <tt>dy</tt> units along the Y axis. Scaling can be done by setting <tt>m11</tt> and <tt>m22</tt>. For example, setting <tt>m11</tt> to 2 and <tt>m22</tt> to 1.5 will double the height and increase the width by 50%. The identity matrix has <tt>m11</tt> and <tt>m22</tt> set to 1 (all others are set to 0) mapping a point to itself. Shearing is controlled by <tt>m12</tt> and <tt>m21</tt>. Setting these elements to values different from zero will twist the coordinate system. Rotation is achieved by carefully setting both the shearing factors and the scaling factors. <p>Here's the combined transformations example using basic matrix operations: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qmatrix-combinedtransformation.png"></center><br></td><td> <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    {
        double pi = 3.14;

        double a    = pi/180 * 45.0;
        double sina = Math.sin(a);
        double cosa = Math.cos(a);

        QMatrix translationMatrix = new QMatrix(1, 0, 0, 1, 50.0, 50.0);
        QMatrix rotationMatrix = new QMatrix(cosa, sina, -sina, cosa, 0, 0);
        QMatrix scalingMatrix = new QMatrix(0.5, 0, 0, 1.0, 0, 0);

        QMatrix matrix = new QMatrix();
        matrix =  scalingMatrix.multiply(rotationMatrix.multiply(translationMatrix));

        QPainter painter = new QPainter(this);
        painter.setPen(new QPen(QColor.blue, 1, Qt.PenStyle.DashLine));
        painter.drawRect(0, 0, 100, 100);

        painter.setWorldMatrix(matrix);

        painter.setFont(new QFont("Helvetica", 24));
        painter.setPen(new QPen(QColor.black, 1));
        painter.drawText(20, 10, "QMatrix");
    }
    </pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter QPainter}, {@link <a href="../coordsys.html">The Coordinate System</a>}, {@link <a href="../demos-affine.html">Affine Transformations Demo</a>}, and {@link <a href="../painting-transformations.html">Transformations Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMatrix extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an identity matrix. <p>All elements are set to zero except <tt>m11</tt> and <tt>m22</tt> (specifying the scale), which are set to 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#reset() reset()}. <br></DD></DT>
*/

    public QMatrix(){
        super((QPrivateConstructor)null);
        __qt_QMatrix();
    }

    native void __qt_QMatrix();

/**
Constructs a matrix that is a copy of the given <tt>matrix</tt>.
*/

    public QMatrix(com.trolltech.qt.gui.QMatrix matrix){
        super((QPrivateConstructor)null);
        __qt_QMatrix_QMatrix(matrix == null ? 0 : matrix.nativeId());
    }

    native void __qt_QMatrix_QMatrix(long matrix);

/**
Constructs a matrix with the elements, <tt>m11</tt>, <tt>m12</tt>, <tt>m21</tt>, <tt>m22</tt>, <tt>dx</tt> and <tt>dy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#setMatrix(double, double, double, double, double, double) setMatrix()}. <br></DD></DT>
*/

    public QMatrix(double m11, double m12, double m21, double m22, double dx, double dy){
        super((QPrivateConstructor)null);
        __qt_QMatrix_double_double_double_double_double_double(m11, m12, m21, m22, dx, dy);
    }

    native void __qt_QMatrix_double_double_double_double_double_double(double m11, double m12, double m21, double m22, double dx, double dy);

/**
Returns the matrix's determinant.
*/

    @QtBlockedSlot
    public final double det()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_det(nativeId());
    }
    @QtBlockedSlot
    native double __qt_det(long __this__nativeId);

/**
Returns the horizontal translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the vertical translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
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
    private final com.trolltech.qt.gui.QMatrix inverted(com.trolltech.qt.QNativePointer invertible)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inverted_nativepointer(nativeId(), invertible);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_inverted_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer invertible);

/**
Returns true if the matrix is the identity matrix, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#reset() reset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isIdentity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isIdentity(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isIdentity(long __this__nativeId);

/**
Returns true if the matrix is invertible, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#inverted() inverted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isInvertible()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isInvertible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isInvertible(long __this__nativeId);

/**
Returns the horizontal scaling factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#scale(double, double) scale()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m11()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m11(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m11(long __this__nativeId);

/**
Returns the vertical shearing factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#shear(double, double) shear()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m12()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m12(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m12(long __this__nativeId);

/**
Returns the horizontal shearing factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#shear(double, double) shear()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m21()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m21(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m21(long __this__nativeId);

/**
Returns the vertical scaling factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#scale(double, double) scale()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m22()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m22(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m22(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QLine QLine} object that is a copy of the given <tt>line</tt>, mapped into the coordinate system defined by this matrix. Note that the transformed coordinates are rounded to the nearest integer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLine map(com.trolltech.qt.gui.QLine l)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QLine(nativeId(), l == null ? 0 : l.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLine __qt_map_QLine(long __this__nativeId, long l);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QLineF QLineF} object that is a copy of the given <tt>line</tt>, mapped into the coordinate system defined by this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineF map(com.trolltech.qt.gui.QLineF l)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QLineF(nativeId(), l == null ? 0 : l.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineF __qt_map_QLineF(long __this__nativeId, long l);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QPainterPath QPainterPath} object that is a copy of the given <tt>path</tt>, mapped into the coordinate system defined by this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath map(com.trolltech.qt.gui.QPainterPath p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QPainterPath(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_map_QPainterPath(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.core.QPoint QPoint} object that is a copy of the given <tt>point</tt>, mapped into the coordinate system defined by this matrix. Note that the transformed coordinates are rounded to the nearest integer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint map(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_map_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.core.QPointF QPointF} object that is a copy of the given <tt>point</tt>, mapped into the coordinate system defined by this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF map(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_map_QPointF(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QPolygon QPolygon} object that is a copy of the given <tt>polygon</tt>, mapped into the coordinate system defined by this matrix. Note that the transformed coordinates are rounded to the nearest integer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon map(com.trolltech.qt.gui.QPolygon a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QPolygon(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_map_QPolygon(long __this__nativeId, long a);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QPolygonF QPolygonF} object that is a copy of the given <tt>polygon</tt>, mapped into the coordinate system defined by this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF map(com.trolltech.qt.gui.QPolygonF a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QPolygonF(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_map_QPolygonF(long __this__nativeId, long a);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QRegion QRegion} object that is a copy of the given <tt>region</tt>, mapped into the coordinate system defined by this matrix. <p>Calling this method can be rather expensive if rotations or shearing are used.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion map(com.trolltech.qt.gui.QRegion r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_map_QRegion(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_map_QRegion(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.core.QRect QRect} object that is a copy of the given <tt>rectangle</tt>, mapped into the coordinate system defined by this matrix. Note that the transformed coordinates are rounded to the nearest integer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect mapRect(com.trolltech.qt.core.QRect arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRect_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_mapRect_QRect(long __this__nativeId, long arg__1);

/**
Creates and returns a {@link com.trolltech.qt.core.QRectF QRectF} object that is a copy of the given <tt>rectangle</tt>, mapped into the coordinate system defined by this matrix. <p>The rectangle's coordinates are transformed using the following formulas: <pre class="snippet">
        x' = m11 + m21 + dx
        y' = m22 + m12 + dy
</pre> If rotation or shearing has been specified, this function returns the bounding rectangle. To retrieve the exact region the given <tt>rectangle</tt> maps to, use the {@link com.trolltech.qt.gui.QMatrix#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()} function instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRect(com.trolltech.qt.core.QRectF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRect_QRectF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRect_QRectF(long __this__nativeId, long arg__1);

/**
Creates and returns a {@link com.trolltech.qt.gui.QPolygon QPolygon} representation of the given <tt>rectangle</tt>, mapped into the coordinate system defined by this matrix. <p>The rectangle's coordinates are transformed using the following formulas: <pre class="snippet">
        x' = m11 + m21 + dx
        y' = m22 + m12 + dy
</pre> Polygons and rectangles behave slightly differently when transformed (due to integer rounding), so <tt>matrix.map(QPolygon(rectangle))</tt> is not always the same as <tt>matrix.mapToPolygon(rectangle)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMatrix#mapRect(com.trolltech.qt.core.QRect) mapRect()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon mapToPolygon(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToPolygon_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_mapToPolygon_QRect(long __this__nativeId, long r);

    @QtBlockedSlot
    private final com.trolltech.qt.gui.QMatrix operator_multiply(com.trolltech.qt.gui.QMatrix o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_QMatrix(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_operator_multiply_QMatrix(long __this__nativeId, long o);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(com.trolltech.qt.gui.QMatrix arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_QMatrix(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_QMatrix(long __this__nativeId, long arg__1);

/**
<brief>Writes thisQMatrix
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
    private final boolean operator_equal(com.trolltech.qt.gui.QMatrix arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QMatrix(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QMatrix(long __this__nativeId, long arg__1);

/**
<brief>Reads a QMatrix
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
Resets the matrix to an identity matrix, i. . all elements are set to zero, except <tt>m11</tt> and <tt>m22</tt> (specifying the scale) which are set to 1. <p><DT><b>See also:</b><br><DD>QMatrix(), {@link com.trolltech.qt.gui.QMatrix#isIdentity() isIdentity()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer rotate_private(double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotate_private_double(nativeId(), a);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_rotate_private_double(long __this__nativeId, double a);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer scale_private(double sx, double sy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scale_private_double_double(nativeId(), sx, sy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_scale_private_double_double(long __this__nativeId, double sx, double sy);

/**
Sets the matrix elements to the specified values, <tt>m11</tt>, <tt>m12</tt>, <tt>m21</tt>, <tt>m22</tt>, <tt>dx</tt> and <tt>dy</tt>. <p>Note that this function replaces the previous values. QMatrix provide the {@link com.trolltech.qt.gui.QMatrix#translate(double, double) translate()}, {@link com.trolltech.qt.gui.QMatrix#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QMatrix#scale(double, double) scale()} and {@link com.trolltech.qt.gui.QMatrix#shear(double, double) shear()} convenience functions to manipulate the various matrix elements based on the currently defined coordinate system. <p><DT><b>See also:</b><br><DD>QMatrix(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(double m11, double m12, double m21, double m22, double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMatrix_double_double_double_double_double_double(nativeId(), m11, m12, m21, m22, dx, dy);
    }
    @QtBlockedSlot
    native void __qt_setMatrix_double_double_double_double_double_double(long __this__nativeId, double m11, double m12, double m21, double m22, double dx, double dy);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer shear_private(double sh, double sv)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shear_private_double_double(nativeId(), sh, sv);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_shear_private_double_double(long __this__nativeId, double sh, double sv);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer translate_private(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translate_private_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_translate_private_double_double(long __this__nativeId, double dx, double dy);

/**
@exclude
*/

    public static native QMatrix fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMatrix(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QMatrix array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QMatrix)
        return operator_equal((com.trolltech.qt.gui.QMatrix) other);
        return false;
    }


    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
Rotates the coordinate system the given <tt>other</tt> degrees
counterclockwise.
<p>
Note that if you apply a QMatrix to a point defined in widget
coordinates, the direction of the rotation will be clockwise
because the y-axis points downwards.
<p>
Returns a reference to the matrix.
*/

    public final QMatrix rotate(double other) {
        rotate_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END

    // TEMPLATE - core.private_function_return_self - START
/**
Scales the coordinate system by <tt>sx</tt> horizontally and
<tt>sy</tt> vertically, and returns a reference to the matrix.
*/

    public final QMatrix scale(double sx, double sy) {
        scale_private(sx, sy);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

    // TEMPLATE - core.private_function_return_self - START
/**
Shears the coordinate system by <tt>sh</tt> horizontally and
<tt>sv</tt> vertically, and returns a reference to the matrix.
*/

    public final QMatrix shear(double sh, double sv) {
        shear_private(sh, sv);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

    // TEMPLATE - core.private_function_return_self - START
/**
Moves the coordinate system <tt>dx</tt> along the x axis and
<tt>dy</tt> along the y axis, and returns a reference to the matrix.
*/

    public final QMatrix translate(double dx, double dy) {
        translate_private(dx, dy);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    /**
     * Returns an inverted copy of this matrix.
     *
     * @return The inverse of the matrix.
     * @throws IllegalArgumentException
     *             If this matrix is not invertible.
     */
    public final QMatrix inverted() {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        QMatrix returned = inverted(ok);
        if (!ok.booleanValue())
            throw new IllegalArgumentException("Matrix is not invertible");
        return returned;
    }

    @QtBlockedSlot
    public final QMatrix multiply(QMatrix other) {
        operator_multiply_assign(other);
        return this;
    }

    @QtBlockedSlot
    public final QMatrix multiplied(QMatrix other) {
        return operator_multiply(other);
    }


    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

    @Override
    public QMatrix clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QMatrix __qt_clone(long __this_nativeId);
}
