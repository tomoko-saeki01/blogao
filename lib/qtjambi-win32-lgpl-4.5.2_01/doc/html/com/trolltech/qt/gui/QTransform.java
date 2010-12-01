package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.core.Qt.Axis;


/**
The QTransform class specifies 2D transformations of a coordinate system. A transformation specifies how to translate, scale, shear, rotate or project the coordinate system, and is typically used when rendering graphics. <p>QTransform differs from {@link com.trolltech.qt.gui.QMatrix QMatrix} in that it is a true 3x3 matrix, allowing perspective transformations. QTransform's {@link com.trolltech.qt.gui.QTransform#toAffine() toAffine()} method allows casting QTransform to {@link com.trolltech.qt.gui.QMatrix QMatrix}. If a perspective transformation has been specified on the matrix, then the conversion to an affine {@link com.trolltech.qt.gui.QMatrix QMatrix} will cause loss of data. <p>QTransform is the recommended transformation class in Qt. <p>A QTransform object can be built using the {@link com.trolltech.qt.gui.QTransform#setMatrix(double, double, double, double, double, double, double, double, double) setMatrix()}, {@link com.trolltech.qt.gui.QTransform#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QTransform#rotate(double, com.trolltech.qt.core.Qt.Axis) rotate()}, {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()} and {@link com.trolltech.qt.gui.QTransform#shear(double, double) shear()} functions. Alternatively, it can be built by applying basic matrix operations. The matrix can also be defined when constructed, and it can be reset to the identity matrix (the default) using the {@link com.trolltech.qt.gui.QTransform#reset() reset()} function. <p>The QTransform class supports mapping of graphic primitives: A given point, line, polygon, region, or painter path can be mapped to the coordinate system defined by this matrix using the {@link com.trolltech.qt.gui.QTransform#map(com.trolltech.qt.gui.QLine) map()} function. In case of a rectangle, its coordinates can be transformed using the {@link com.trolltech.qt.gui.QTransform#mapRect(com.trolltech.qt.core.QRect) mapRect()} function. A rectangle can also be transformed into a polygon (mapped to the coordinate system defined by this matrix), using the {@link com.trolltech.qt.gui.QTransform#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()} function. <p>QTransform provides the {@link com.trolltech.qt.gui.QTransform#isIdentity() isIdentity()} function which returns true if the matrix is the identity matrix, and the {@link com.trolltech.qt.gui.QTransform#isInvertible() isInvertible()} function which returns true if the matrix is non-singular (i.e. AB = BA = I). The {@link com.trolltech.qt.gui.QTransform#inverted() inverted()} function returns an inverted copy of this matrix if it is invertible (otherwise it returns the identity matrix). In addition, QTransform provides the {@link com.trolltech.qt.gui.QTransform#det() det()} function returning the matrix's determinant. <p>Finally, the QTransform class supports matrix multiplication, and objects of the class can be streamed as well as compared. <ul><li> {@link <a href="#rendering-graphics">Rendering Graphics</a>}</li><li> {@link <a href="#basic-matrix-operations">Basic Matrix Operations</a>}</li></ul><a name="rendering-graphics"><h2>Rendering Graphics</h2> When rendering graphics, the matrix defines the transformations but the actual transformation is performed by the drawing routines in {@link com.trolltech.qt.gui.QPainter QPainter}. <p>By default, {@link com.trolltech.qt.gui.QPainter QPainter} operates on the associated device's own coordinate system. The standard coordinate system of a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} has its origin located at the top-left position. The x values increase to the right; y values increase downward. For a complete description, see the {@link <a href="../coordsys.html">coordinate system</a>} documentation. <p>{@link com.trolltech.qt.gui.QPainter QPainter} has functions to translate, scale, shear and rotate the coordinate system without using a QTransform. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qtransform-simpletransformation.png"></center><br></td><td> <pre class="snippet">
    void SimpleTransformation.paintEvent(QPaintEvent )
    {
        QPainter painter(this);
        painter.setPen(QPen(Qt.blue, 1, Qt.DashLine));
        painter.drawRect(0, 0, 100, 100);

        painter.rotate(45);

        painter.setFont(QFont("Helvetica", 24));
        painter.setPen(QPen(Qt.black, 1));
        painter.drawText(20, 10, "QTransform");
    }
    </pre></td></tr></table> Although these functions are very convenient, it can be more efficient to build a QTransform and call {@link com.trolltech.qt.gui.QPainter#setTransform(com.trolltech.qt.gui.QTransform) QPainter::setTransform()} if you want to perform more than a single transform operation. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qtransform-combinedtransformation.png"></center><br></td><td> <pre class="snippet">
    void CombinedTransformation.paintEvent(QPaintEvent )
    {
        QPainter painter(this);
        painter.setPen(QPen(Qt.blue, 1, Qt.DashLine));
        painter.drawRect(0, 0, 100, 100);

        QTransform transform;
        transform.translate(50, 50);
        transform.rotate(45);
        transform.scale(0.5, 1.0);
        painter.setTransform(transform);

        painter.setFont(QFont("Helvetica", 24));
        painter.setPen(QPen(Qt.black, 1));
        painter.drawText(20, 10, "QTransform");
    }
    </pre></td></tr></table><a name="basic-matrix-operations"><h2>Basic Matrix Operations</h2> <br><center><img src="../images/qtransform-representation.png"></center><br> A QTransform object contains a 3 x 3 matrix. The <tt>dx</tt> and <tt>dy</tt> elements specify horizontal and vertical translation. The <tt>m11</tt> and <tt>m22</tt> elements specify horizontal and vertical scaling. The <tt>m21</tt> and <tt>m12</tt> elements specify horizontal and vertical shearing. And finally, the <tt>m13</tt> and <tt>m23</tt> elements specify horizontal and vertical projection, with <tt>m33</tt> as an additional projection factor. <p>QTransform transforms a point in the plane to another point using the following formulas: <pre class="snippet">
        x' = m11 + m21 + dx
        y' = m22 + m12 + dy
</pre> The point (x, y) is the original point, and (x', y') is the transformed point. (x', y') can be transformed back to (x, y) by performing the same operation on the {@link com.trolltech.qt.gui.QTransform#inverted() inverted()} matrix. <p>The various matrix elements can be set when constructing the matrix, or by using the {@link com.trolltech.qt.gui.QTransform#setMatrix(double, double, double, double, double, double, double, double, double) setMatrix()} function later on. They can also be manipulated using the {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, {@link com.trolltech.qt.gui.QTransform#rotate(double, com.trolltech.qt.core.Qt.Axis) rotate()}, {@link com.trolltech.qt.gui.QTransform#scale(double, double) scale()} and {@link com.trolltech.qt.gui.QTransform#shear(double, double) shear()} convenience functions, The currently set values can be retrieved using the {@link com.trolltech.qt.gui.QTransform#m11() m11()}, {@link com.trolltech.qt.gui.QTransform#m12() m12()}, {@link com.trolltech.qt.gui.QTransform#m13() m13()}, {@link com.trolltech.qt.gui.QTransform#m21() m21()}, {@link com.trolltech.qt.gui.QTransform#m22() m22()}, {@link com.trolltech.qt.gui.QTransform#m23() m23()}, {@link com.trolltech.qt.gui.QTransform#m31() m31()}, {@link com.trolltech.qt.gui.QTransform#m32() m32()}, {@link com.trolltech.qt.gui.QTransform#m33() m33()}, {@link com.trolltech.qt.gui.QTransform#dx() dx()} and {@link com.trolltech.qt.gui.QTransform#dy() dy()} functions. <p>Translation is the simplest transformation. Setting <tt>dx</tt> and <tt>dy</tt> will move the coordinate system <tt>dx</tt> units along the X axis and <tt>dy</tt> units along the Y axis. Scaling can be done by setting <tt>m11</tt> and <tt>m22</tt>. For example, setting <tt>m11</tt> to 2 and <tt>m22</tt> to 1.5 will double the height and increase the width by 50%. The identity matrix has <tt>m11</tt>, <tt>m22</tt>, and <tt>m33</tt> set to 1 (all others are set to 0) mapping a point to itself. Shearing is controlled by <tt>m12</tt> and <tt>m21</tt>. Setting these elements to values different from zero will twist the coordinate system. Rotation is achieved by carefully setting both the shearing factors and the scaling factors. Perspective transformation is achieved by carefully setting both the projection factors and the scaling factors. <p>Here's the combined transformations example using basic matrix operations: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qtransform-combinedtransformation2.png"></center><br></td><td> <pre class="snippet">
    void BasicOperations.paintEvent(QPaintEvent )
    {
        double pi = 3.14;

        double a    = pi/180  45.0;
        double sina = sin(a);
        double cosa = cos(a);

        QTransform translationTransform(1, 0, 0, 1, 50.0, 50.0);
        QTransform rotationTransform(cosa, sina, -sina, cosa, 0, 0);
        QTransform scalingTransform(0.5, 0, 0, 1.0, 0, 0);

        QTransform transform;
        transform = scalingTransform  rotationTransform  translationTransform;

        QPainter painter(this);
        painter.setPen(QPen(Qt.blue, 1, Qt.DashLine));
        painter.drawRect(0, 0, 100, 100);

        painter.setTransform(transform);

        painter.setFont(QFont("Helvetica", 24));
        painter.setPen(QPen(Qt.black, 1));
        painter.drawText(20, 10, "QTransform");
    }
    </pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter QPainter}, {@link <a href="../coordsys.html">The Coordinate System</a>}, {@link <a href="../demos-affine.html">Affine Transformations Demo</a>}, and {@link <a href="../painting-transformations.html">Transformations Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTransform extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum TransformationType implements com.trolltech.qt.QtEnumerator {
/**

*/

        TxNone(0),
/**

*/

        TxTranslate(1),
/**

*/

        TxScale(2),
/**

*/

        TxRotate(4),
/**

*/

        TxShear(8),
/**

*/

        TxProject(16);

        TransformationType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTransform$TransformationType constant with the specified <tt>int</tt>.</brief>
*/

        public static TransformationType resolve(int value) {
            return (TransformationType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TxNone;
            case 1: return TxTranslate;
            case 2: return TxScale;
            case 4: return TxRotate;
            case 8: return TxShear;
            case 16: return TxProject;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


    public QTransform(){
        super((QPrivateConstructor)null);
        __qt_QTransform();
    }

    native void __qt_QTransform();

/**
Constructs a matrix that is a copy of the given <tt>matrix</tt>. Note that the <tt>m13</tt>, <tt>m23</tt>, and <tt>m33</tt> elements are set to 0, 0, and 1 respectively.
*/

    public QTransform(com.trolltech.qt.gui.QMatrix mtx){
        super((QPrivateConstructor)null);
        __qt_QTransform_QMatrix(mtx == null ? 0 : mtx.nativeId());
    }

    native void __qt_QTransform_QMatrix(long mtx);


/**
Constructs a matrix with the elements, <tt>h11</tt>, <tt>h12</tt>, <tt>h13</tt>, <tt>h21</tt>, <tt>h22</tt>, <tt>h23</tt>, <tt>h31</tt>, <tt>h32</tt>, <tt>h33</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#setMatrix(double, double, double, double, double, double, double, double, double) setMatrix()}. <br></DD></DT>
*/

    public QTransform(double h11, double h12, double h13, double h21, double h22, double h23, double h31, double h32) {
        this(h11, h12, h13, h21, h22, h23, h31, h32, (double)1.0);
    }
/**
Constructs a matrix with the elements, <tt>h11</tt>, <tt>h12</tt>, <tt>h13</tt>, <tt>h21</tt>, <tt>h22</tt>, <tt>h23</tt>, <tt>h31</tt>, <tt>h32</tt>, <tt>h33</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#setMatrix(double, double, double, double, double, double, double, double, double) setMatrix()}. <br></DD></DT>
*/

    public QTransform(double h11, double h12, double h13, double h21, double h22, double h23, double h31, double h32, double h33){
        super((QPrivateConstructor)null);
        __qt_QTransform_double_double_double_double_double_double_double_double_double(h11, h12, h13, h21, h22, h23, h31, h32, h33);
    }

    native void __qt_QTransform_double_double_double_double_double_double_double_double_double(double h11, double h12, double h13, double h21, double h22, double h23, double h31, double h32, double h33);

/**
Constructs a matrix with the elements, <tt>h11</tt>, <tt>h12</tt>, <tt>h21</tt>, <tt>h22</tt>, <tt>dx</tt> and <tt>dy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#setMatrix(double, double, double, double, double, double, double, double, double) setMatrix()}. <br></DD></DT>
*/

    public QTransform(double h11, double h12, double h21, double h22, double dx, double dy){
        super((QPrivateConstructor)null);
        __qt_QTransform_double_double_double_double_double_double(h11, h12, h21, h22, dx, dy);
    }

    native void __qt_QTransform_double_double_double_double_double_double(double h11, double h12, double h21, double h22, double dx, double dy);

/**
Returns the adjoint of this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform adjoint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_adjoint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_adjoint(long __this__nativeId);

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
Returns the matrix's determinant.
*/

    @QtBlockedSlot
    public final double determinant()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_determinant(nativeId());
    }
    @QtBlockedSlot
    native double __qt_determinant(long __this__nativeId);

/**
Returns the horizontal translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#m31() m31()}, {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the vertical translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
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
    private final com.trolltech.qt.gui.QTransform inverted(com.trolltech.qt.QNativePointer invertible)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inverted_nativepointer(nativeId(), invertible);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_inverted_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer invertible);

/**
Returns true if the matrix represent an affine transformation, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isAffine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAffine(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAffine(long __this__nativeId);

/**
Returns true if the matrix is the identity matrix, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#reset() reset()}. <br></DD></DT>
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
Returns true if the matrix is invertible, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#inverted() inverted()}. <br></DD></DT>
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
Returns true if the matrix represents some kind of a rotating transformation, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#reset() reset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isRotating()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRotating(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRotating(long __this__nativeId);

/**
Returns true if the matrix represents a scaling transformation, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#reset() reset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isScaling()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isScaling(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isScaling(long __this__nativeId);

/**
Returns true if the matrix represents a translating transformation, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#reset() reset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTranslating()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTranslating(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTranslating(long __this__nativeId);

/**
Returns the horizontal scaling factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#scale(double, double) scale()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the vertical shearing factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#shear(double, double) shear()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the horizontal projection factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m13()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m13(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m13(long __this__nativeId);

/**
Returns the horizontal shearing factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#shear(double, double) shear()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the vertical scaling factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#scale(double, double) scale()}, and Basic Matrix Operations. <br></DD></DT>
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
Returns the vertical projection factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m23()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m23(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m23(long __this__nativeId);

/**
Returns the horizontal translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#dx() dx()}, {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m31()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m31(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m31(long __this__nativeId);

/**
Returns the vertical translation factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#dy() dy()}, {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m32()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m32(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m32(long __this__nativeId);

/**
Returns the division factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double m33()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m33(nativeId());
    }
    @QtBlockedSlot
    native double __qt_m33(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QLineF QLineF} object that is a copy of the given line, <tt>l</tt>, mapped into the coordinate system defined by this matrix.
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
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.gui.QLine QLine} object that is a copy of the given <tt>line</tt>, mapped into the coordinate system defined by this matrix. Note that the transformed coordinates are rounded to the nearest integer.
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
This is an overloaded member function, provided for convenience. <p>Creates and returns a {@link com.trolltech.qt.core.QPointF QPointF} object that is a copy of the given point, <tt>p</tt>, mapped into the coordinate system defined by this matrix.
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
        if (is not affine) {
            w' = m13 + m23 + m33
            x' /= w'
            y' /= w'
        }
</pre> If rotation or shearing has been specified, this function returns the bounding rectangle. To retrieve the exact region the given <tt>rectangle</tt> maps to, use the {@link com.trolltech.qt.gui.QTransform#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()} function instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#mapToPolygon(com.trolltech.qt.core.QRect) mapToPolygon()}, and Basic Matrix Operations. <br></DD></DT>
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
        if (is not affine) {
            w' = m13 + m23 + m33
            x' /= w'
            y' /= w'
        }
</pre> Polygons and rectangles behave slightly differently when transformed (due to integer rounding), so <tt>matrix.map(QPolygon(rectangle))</tt> is not always the same as <tt>matrix.mapToPolygon(rectangle)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#mapRect(com.trolltech.qt.core.QRect) mapRect()}, and Basic Matrix Operations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon mapToPolygon(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToPolygon_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_mapToPolygon_QRect(long __this__nativeId, long r);

/**
Multiplies this QTransform with <tt>o</tt>, and returns the result.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform multiplied(com.trolltech.qt.gui.QTransform o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_multiplied_QTransform(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_multiplied_QTransform(long __this__nativeId, long o);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(com.trolltech.qt.gui.QTransform arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_QTransform(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_QTransform(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_multiply_assign(double div)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply_assign_double(nativeId(), div);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_multiply_assign_double(long __this__nativeId, double div);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_add_assign(double div)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_double(nativeId(), div);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_double(long __this__nativeId, double div);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(double div)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_double(nativeId(), div);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_double(long __this__nativeId, double div);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_divide_assign(double div)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_divide_assign_double(nativeId(), div);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_divide_assign_double(long __this__nativeId, double div);

/**
<brief>Writes thisQTransform
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
    private final boolean operator_equal(com.trolltech.qt.gui.QTransform arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTransform(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTransform(long __this__nativeId, long arg__1);

/**
<brief>Reads a QTransform
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
Resets the matrix to an identity matrix, i. . all elements are set to zero, except <tt>m11</tt> and <tt>m22</tt> (specifying the scale) which are set to 1. <p><DT><b>See also:</b><br><DD>QTransform(), {@link com.trolltech.qt.gui.QTransform#isIdentity() isIdentity()}, and Basic Matrix Operations. <br></DD></DT>
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
    private final com.trolltech.qt.QNativePointer rotate_private(double a) {
        return rotate_private(a, com.trolltech.qt.core.Qt.Axis.ZAxis);
    }
    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer rotate_private(double a, com.trolltech.qt.core.Qt.Axis axis)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotate_private_double_Axis(nativeId(), a, axis.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_rotate_private_double_Axis(long __this__nativeId, double a, int axis);


    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer rotateRadians_private(double a) {
        return rotateRadians_private(a, com.trolltech.qt.core.Qt.Axis.ZAxis);
    }
    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer rotateRadians_private(double a, com.trolltech.qt.core.Qt.Axis axis)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotateRadians_private_double_Axis(nativeId(), a, axis.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_rotateRadians_private_double_Axis(long __this__nativeId, double a, int axis);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer scale_private(double sx, double sy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scale_private_double_double(nativeId(), sx, sy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_scale_private_double_double(long __this__nativeId, double sx, double sy);

/**
Sets the matrix elements to the specified values, <tt>m11</tt>, <tt>m12</tt>, <tt>m13</tt><tt>m21</tt>, <tt>m22</tt>, <tt>m23</tt><tt>m31</tt>, <tt>m32</tt> and <tt>m33</tt>. Note that this function replaces the previous values. {@link com.trolltech.qt.gui.QMatrix QMatrix} provides the {@link com.trolltech.qt.gui.QTransform#translate(double, double) translate()}, {@link com.trolltech.qt.gui.QTransform#rotate(double, com.trolltech.qt.core.Qt.Axis) rotate()}, {@link com.trolltech.qt.gui.QTransform#scale(double, double) scale()} and {@link com.trolltech.qt.gui.QTransform#shear(double, double) shear()} convenience functions to manipulate the various matrix elements based on the currently defined coordinate system. <p><DT><b>See also:</b><br><DD>QTransform(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMatrix_double_double_double_double_double_double_double_double_double(nativeId(), m11, m12, m13, m21, m22, m23, m31, m32, m33);
    }
    @QtBlockedSlot
    native void __qt_setMatrix_double_double_double_double_double_double_double_double_double(long __this__nativeId, double m11, double m12, double m13, double m21, double m22, double m23, double m31, double m32, double m33);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer shear_private(double sh, double sv)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shear_private_double_double(nativeId(), sh, sv);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_shear_private_double_double(long __this__nativeId, double sh, double sv);

/**
Returns the QTransform cast to a {@link com.trolltech.qt.gui.QMatrix QMatrix}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix toAffine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toAffine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_toAffine(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer translate_private(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translate_private_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_translate_private_double_double(long __this__nativeId, double dx, double dy);

/**
Returns the transpose of this matrix.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform transposed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transposed(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_transposed(long __this__nativeId);

/**
Returns the transformation type of this matrix. <p>The transformation type is the highest enumeration value capturing all of the matrix's transformations. For example, if the matrix both scales and shears, the type would be <tt>TxShear</tt>, because <tt>TxShear</tt> has a higher enumeration value than <tt>TxScale</tt>. <p>Knowing the transformation type of a matrix is useful for optimization: you can often handle specific types more optimally than handling the generic case.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform.TransformationType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTransform.TransformationType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Creates a matrix which corresponds to a scaling of <tt>sx</tt> horizontally and <tt>sy</tt> vertically. This is the same as QTransform().scale(sx, sy) but slightly faster.
*/

    public native static com.trolltech.qt.gui.QTransform fromScale(double dx, double dy);

/**
Creates a matrix which corresponds to a translation of <tt>dx</tt> along the x axis and <tt>dy</tt> along the y axis. This is the same as QTransform().translate(dx, dy) but slightly faster.
*/

    public native static com.trolltech.qt.gui.QTransform fromTranslate(double dx, double dy);

    private static boolean quadToQuadPrivate(com.trolltech.qt.gui.QPolygonF one, com.trolltech.qt.gui.QPolygonF two, com.trolltech.qt.QNativePointer result)    {
        return __qt_quadToQuadPrivate_QPolygonF_QPolygonF_nativepointer(one == null ? 0 : one.nativeId(), two == null ? 0 : two.nativeId(), result);
    }
    native static boolean __qt_quadToQuadPrivate_QPolygonF_QPolygonF_nativepointer(long one, long two, com.trolltech.qt.QNativePointer result);

    private static boolean quadToSquarePrivate(com.trolltech.qt.gui.QPolygonF quad, com.trolltech.qt.QNativePointer result)    {
        return __qt_quadToSquarePrivate_QPolygonF_nativepointer(quad == null ? 0 : quad.nativeId(), result);
    }
    native static boolean __qt_quadToSquarePrivate_QPolygonF_nativepointer(long quad, com.trolltech.qt.QNativePointer result);

    private static boolean squareToQuadPrivate(com.trolltech.qt.gui.QPolygonF square, com.trolltech.qt.QNativePointer result)    {
        return __qt_squareToQuadPrivate_QPolygonF_nativepointer(square == null ? 0 : square.nativeId(), result);
    }
    native static boolean __qt_squareToQuadPrivate_QPolygonF_nativepointer(long square, com.trolltech.qt.QNativePointer result);

/**
@exclude
*/

    public static native QTransform fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTransform(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTransform array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTransform)
        return operator_equal((com.trolltech.qt.gui.QTransform) other);
        return false;
    }


/**
Multiplies this QTransform with <tt>d</tt>.
*/

    public final QTransform multiply(double d) {
        operator_multiply_assign(d);
        return this;
    }

/**
Returns the result of multiplying this matrix by the given <tt>matrix</tt>. <p>Note that matrix multiplication is not commutative, i.e. a*b != b*a.
*/

    public final QTransform multiply(QTransform matrix) {
        operator_multiply_assign(matrix);
        return this;
    }

/**
Adds <tt>d</tt> to this QTransform.

<tt>d</tt>
*/

    public final QTransform add(double d) {
        operator_add_assign(d);
        return this;
    }

/**
Divides this QTransform by <tt>d</tt>.
*/

    public final QTransform divide(double d) {
        operator_divide_assign(d);
        return this;
    }

/**
Subtracts <tt>d</tt> from this QTransform.
*/

    public final QTransform subtract(double d) {
        operator_subtract_assign(d);
        return this;
    }

    /**
     * Returns an inverted copy of this transformation.
     *
     * @return The inverse of the transformation.
     * @throws IllegalArgumentException
     *             If this transformation is not invertible.
     */
    public final QTransform inverted() {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        QTransform returned = inverted(ok);
        if (!ok.booleanValue())
            throw new IllegalArgumentException("Transformation is not invertible");
        return returned;
    }

    /**
     * Creates a transformation mapping one arbitrary quad into another.
     *
     * @return The transformation.
     * @throws IllegalArgumentException
     *             If this transformation is not possible.
     */
    public static final QTransform quadToQuad(QPolygonF from, QPolygonF to) {
        QTransform res = new QTransform();
        QNativePointer resPointer = res.nativePointer();
        if (quadToQuadPrivate(from, to, resPointer)) {
            return res;
        } else
            throw new IllegalArgumentException("Transformation is not possible");
    }

    /**
     * Creates a transformation that maps a quad to a unit square.
     *
     * @return The transformation.
     * @throws IllegalArgumentException If this transformation is not possible.
     */
    public static final QTransform quadToSquare(QPolygonF quad) {
        QTransform res = new QTransform();
        QNativePointer resPointer = res.nativePointer();
        if (quadToSquarePrivate(quad, resPointer)) {
            return res;
        } else
            throw new IllegalArgumentException("Transformation is not possible");
    }

    /**
     * Creates a transformation that maps a unit square to a the given quad.
     *
     * @return The transformation.
     * @throws IllegalArgumentException
     *             If this transformation is not possible.
     */
    public static final QTransform squareToQuad(QPolygonF quad) {
        QTransform res = new QTransform();
        QNativePointer resPointer = res.nativePointer();
        if (squareToQuadPrivate(quad, resPointer)) {
            return res;
        } else
            throw new IllegalArgumentException("Transformation is not possible");
    }


    /**
     * Rotates the transformation around the given axis.
     *
     * @return The rotated transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform rotate(double angle, Axis axis) {
        rotate_private(angle, axis);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

    /**
     * Rotates the transformation around the z-axis.
     *
     * @return The rotated transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform rotate(double angle) {
        rotate_private(angle);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    /**
     * Rotates the transformation around the given axis.
     *
     * @return The rotated transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform rotateRadians(double angle, Axis axis) {
        rotateRadians_private(angle, axis);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

    /**
     * Rotates the transformation around the z-axis.
     *
     * @return The rotated transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform rotateRadians(double angle) {
        rotateRadians_private(angle);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    /**
     * Scales the transformation using x and y.
     *
     * @return The scaled transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform scale(double x, double y) {
        scale_private(x, y);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    /**
     * Shears the transformation using x and y.
     *
     * @return The sheared transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform shear(double x, double y) {
        shear_private(x, y);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    /**
     * Translates the transformation using x and y.
     *
     * @return The translated transformation.
     */
    // TEMPLATE - core.private_function_return_self - START
    public final QTransform translate(double x, double y) {
        translate_private(x, y);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

    @Override
    public QTransform clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTransform __qt_clone(long __this_nativeId);
}
