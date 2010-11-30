package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPainterPath class provides a container for painting operations, enabling graphical shapes to be constructed and reused. A painter path is an object composed of a number of graphical building blocks, such as rectangles, ellipses, lines, and curves. Building blocks can be joined in closed subpaths, for example as a rectangle or an ellipse. A closed path has coinciding start and end points. Or they can exist independently as unclosed subpaths, such as lines and curves. <p>A QPainterPath object can be used for filling, outlining, and clipping. To generate fillable outlines for a given painter path, use the {@link com.trolltech.qt.gui.QPainterPathStroker QPainterPathStroker} class. The main advantage of painter paths over normal drawing operations is that complex shapes only need to be created once; then they can be drawn many times using only calls to the {@link com.trolltech.qt.gui.QPainter#drawPath(com.trolltech.qt.gui.QPainterPath) QPainter::drawPath()} function. <p>QPainterPath provides a collection of functions that can be used to obtain information about the path and its elements. In addition it is possible to reverse the order of the elements using the {@link com.trolltech.qt.gui.QPainterPath#toReversed() toReversed()} function. There are also several functions to convert this painter path object into a polygon representation. <ul><li> {@link <a href="#composing-a-qpainterpath">Composing a QPainterPath</a>}</li><li> {@link <a href="#qpainterpath-information">QPainterPath Information</a>}</li><li> {@link <a href="#qpainterpath-conversion">QPainterPath Conversion</a>}</li><li> {@link <a href="#examples">Examples</a>}</li></ul><a name="composing-a-qpainterpath"><h2>Composing a QPainterPath</h2> A QPainterPath object can be constructed as an empty path, with a given start point, or as a copy of another QPainterPath object. Once created, lines and curves can be added to the path using the {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()}, {@link com.trolltech.qt.gui.QPainterPath#arcTo(com.trolltech.qt.core.QRectF, double, double) arcTo()}, {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()} and {@link com.trolltech.qt.gui.QPainterPath#quadTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) quadTo()} functions. The lines and curves stretch from the {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()} to the position passed as argument. <p>The {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()} of the QPainterPath object is always the end position of the last subpath that was added (or the initial start point). Use the {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()} function to move the {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()} without adding a component. The {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()} function implicitly starts a new subpath, and closes the previous one. Another way of starting a new subpath is to call the {@link com.trolltech.qt.gui.QPainterPath#closeSubpath() closeSubpath()} function which closes the current path by adding a line from the {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()} back to the path's start position. Note that the new path will have (0, 0) as its initial {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()}. <p>QPainterPath class also provides several convenience functions to add closed subpaths to a painter path: {@link com.trolltech.qt.gui.QPainterPath#addEllipse(com.trolltech.qt.core.QPointF, double, double) addEllipse()}, {@link com.trolltech.qt.gui.QPainterPath#addPath(com.trolltech.qt.gui.QPainterPath) addPath()}, {@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}, {@link com.trolltech.qt.gui.QPainterPath#addRegion(com.trolltech.qt.gui.QRegion) addRegion()} and {@link com.trolltech.qt.gui.QPainterPath#addText(com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QFont, java.lang.String) addText()}. The {@link com.trolltech.qt.gui.QPainterPath#addPolygon(com.trolltech.qt.gui.QPolygonF) addPolygon()} function adds an unclosed subpath. In fact, these functions are all collections of {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()} and {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()} operations. <p>In addition, a path can be added to the current path using the {@link com.trolltech.qt.gui.QPainterPath#connectPath(com.trolltech.qt.gui.QPainterPath) connectPath()} function. But note that this function will connect the last element of the current path to the first element of given one by adding a line. <p>Below is a code snippet that shows how a QPainterPath object can be used: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-construction.png"></center><br></td><td> <pre class="snippet">
        QPainterPath path = new QPainterPath();
        path.addRect(20, 20, 60, 60);

        path.moveTo(0, 0);
        path.cubicTo(99, 0,  50, 50,  99, 99);
        path.cubicTo(0, 99,  50, 50,  0, 0);

        QPainter painter = new QPainter(this);
        painter.fillRect(0, 0, 100, 100, new QBrush(QColor.white));
        painter.setPen(new QPen(new QColor(79, 106, 25), 1,
                                Qt.PenStyle.SolidLine,
                                Qt.PenCapStyle.FlatCap,
                                Qt.PenJoinStyle.MiterJoin));
        painter.setBrush(new QColor(122, 163, 39));

        painter.drawPath(path);
</pre></td></tr></table> The painter path is initially empty when constructed. We first add a rectangle, which is a closed subpath. Then we add two bezier curves which together form a closed subpath even though they are not closed individually. Finally we draw the entire path. The path is filled using the default fill rule, {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }. Qt provides two methods for filling paths: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qt-fillrule-oddeven.png"></center><br></td><td>  <br><center><img src="../images/qt-fillrule-winding.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }</center></th><th><center> {@link com.trolltech.qt.core.Qt.FillRule Qt::WindingFill }</center></th></tr></thead></table> See the {@link com.trolltech.qt.core.Qt.FillRule Qt::FillRule } documentation for the definition of the rules. A painter path's currently set fill rule can be retrieved using the {@link com.trolltech.qt.gui.QPainterPath#fillRule() fillRule()} function, and altered using the {@link com.trolltech.qt.gui.QPainterPath#setFillRule(com.trolltech.qt.core.Qt.FillRule) setFillRule()} function.<a name="qpainterpath-information"><h2>QPainterPath Information</h2> The QPainterPath class provides a collection of functions that returns information about the path and its elements. <p>The {@link com.trolltech.qt.gui.QPainterPath#currentPosition() currentPosition()} function returns the end point of the last subpath that was added (or the initial start point). The {@link com.trolltech.qt.gui.QPainterPath#elementAt(int) elementAt()} function can be used to retrieve the various subpath elements, the number of elements can be retrieved using the {@link com.trolltech.qt.gui.QPainterPath#elementCount() elementCount()} function, and the {@link com.trolltech.qt.gui.QPainterPath#isEmpty() isEmpty()} function tells whether this QPainterPath object contains any elements at all. <p>The {@link com.trolltech.qt.gui.QPainterPath#controlPointRect() controlPointRect()} function returns the rectangle containing all the points and control points in this path. This function is significantly faster to compute than the exact {@link com.trolltech.qt.gui.QPainterPath#boundingRect() boundingRect()} which returns the bounding rectangle of this painter path with floating point precision. <p>Finally, QPainterPath provides the {@link com.trolltech.qt.gui.QPainterPath#contains(com.trolltech.qt.gui.QPainterPath) contains()} function which can be used to determine whether a given point or rectangle is inside the path, and the {@link com.trolltech.qt.gui.QPainterPath#intersects(com.trolltech.qt.gui.QPainterPath) intersects()} function which determines if any of the points inside a given rectangle also are inside this path.<a name="qpainterpath-conversion"><h2>QPainterPath Conversion</h2> For compatibility reasons, it might be required to simplify the representation of a painter path: QPainterPath provides the {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()}, {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} and {@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()} functions which convert the painter path into a polygon. The {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()} returns the painter path as one single polygon, while the two latter functions return a list of polygons. <p>The {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} and {@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()} functions are provided because it is usually faster to draw several small polygons than to draw one large polygon, even though the total number of points drawn is the same. The difference between the two is the number of polygons they return: The {@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()} creates one polygon for each subpath regardless of intersecting subpaths (i.e. overlapping bounding rectangles), while the {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} functions creates only one polygon for overlapping subpaths. <p>The {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()} and {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} functions first convert all the subpaths to polygons, then uses a rewinding technique to make sure that overlapping subpaths can be filled using the correct fill rule. Note that rewinding inserts additional lines in the polygon so the outline of the fill polygon does not match the outline of the path.<a name="examples"><h2>Examples</h2> Qt provides the {@link <a href="../painting-painterpaths.html">Painter Paths Example</a>} and the {@link <a href="../qtjambi-deform.html">Vector Deformation Demo</a>} which are located in Qt's example and demo directories respectively. <p>The {@link <a href="../painting-painterpaths.html">Painter Paths Example</a>} shows how painter paths can be used to build complex shapes for rendering and lets the user experiment with the filling and stroking. The {@link <a href="../qtjambi-deform.html">Vector Deformation Demo</a>} shows how to use QPainterPath to draw text. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-example.png"></center><br></td><td>  <br><center><img src="../images/qpainterpath-demo.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> {@link <a href="../painting-painterpaths.html">Painter Paths Example</a>}</center></th><th><center> {@link <a href="../qtjambi-deform.html">Vector Deformation Demo</a>}</center></th></tr></thead></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPathStroker QPainterPathStroker}, {@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QRegion QRegion}, and {@link <a href="../painting-painterpaths.html">Painter Paths Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPainterPath extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types of elements used to connect vertices in subpaths. <p>Note that elements added as closed subpaths using the {@link com.trolltech.qt.gui.QPainterPath#addEllipse(com.trolltech.qt.core.QPointF, double, double) addEllipse()}, {@link com.trolltech.qt.gui.QPainterPath#addPath(com.trolltech.qt.gui.QPainterPath) addPath()}, {@link com.trolltech.qt.gui.QPainterPath#addPolygon(com.trolltech.qt.gui.QPolygonF) addPolygon()}, {@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}, {@link com.trolltech.qt.gui.QPainterPath#addRegion(com.trolltech.qt.gui.QRegion) addRegion()} and {@link com.trolltech.qt.gui.QPainterPath#addText(com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QFont, java.lang.String) addText()} convenience functions, is actually added to the path as a collection of separate elements using the {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()} and {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#elementAt(int) elementAt()}, and {@link com.trolltech.qt.gui.QPainterPath#elementCount() elementCount()}. <br></DD></DT>
*/

    public enum ElementType implements com.trolltech.qt.QtEnumerator {
/**
 A new subpath. See also {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}.
*/

        MoveToElement(0),
/**
 A line. See also {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()}.
*/

        LineToElement(1),
/**
 A curve. See also {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()} and {@link com.trolltech.qt.gui.QPainterPath#quadTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) quadTo()}.
*/

        CurveToElement(2),
/**
 The extra data required to describe a curve in a {@link com.trolltech.qt.gui.QPainterPath.ElementType CurveToElement } element.
*/

        CurveToDataElement(3);

        ElementType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPainterPath$ElementType constant with the specified <tt>int</tt>.</brief>
*/

        public static ElementType resolve(int value) {
            return (ElementType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MoveToElement;
            case 1: return LineToElement;
            case 2: return CurveToElement;
            case 3: return CurveToDataElement;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty QPainterPath object.
*/

    public QPainterPath(){
        super((QPrivateConstructor)null);
        __qt_QPainterPath();
    }

    native void __qt_QPainterPath();

/**
Creates a QPainterPath object that is a copy of the given <tt>path</tt>. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QPainterPath(com.trolltech.qt.gui.QPainterPath other){
        super((QPrivateConstructor)null);
        __qt_QPainterPath_QPainterPath(other == null ? 0 : other.nativeId());
    }

    native void __qt_QPainterPath_QPainterPath(long other);

/**
Creates a QPainterPath object with the given <tt>startPoint</tt> as its current position.
*/

    public QPainterPath(com.trolltech.qt.core.QPointF startPoint){
        super((QPrivateConstructor)null);
        __qt_QPainterPath_QPointF(startPoint == null ? 0 : startPoint.nativeId());
    }

    native void __qt_QPainterPath_QPointF(long startPoint);

/**
This is an overloaded member function, provided for convenience. <p>Creates an ellipse positioned at <tt>center</tt> with radii <tt>rx</tt> and <tt>ry</tt>, and adds it to the painter path as a closed subpath.
*/

    @QtBlockedSlot
    public final void addEllipse(com.trolltech.qt.core.QPointF center, double rx, double ry)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEllipse_QPointF_double_double(nativeId(), center == null ? 0 : center.nativeId(), rx, ry);
    }
    @QtBlockedSlot
    native void __qt_addEllipse_QPointF_double_double(long __this__nativeId, long center, double rx, double ry);

/**
Creates an ellipse within the the specified <tt>boundingRectangle</tt> and adds it to the painter path as a closed subpath. <p>The ellipse is composed of a clockwise curve, starting and finishing at zero degrees (the 3 o'clock position). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-addellipse.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();
        QRectF boundingRectangle = new QRectF();

        QPainterPath myPath = new QPainterPath();
        myPath.addEllipse(boundingRectangle);

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#arcTo(com.trolltech.qt.core.QRectF, double, double) arcTo()}, {@link com.trolltech.qt.gui.QPainter#drawEllipse(com.trolltech.qt.core.QPoint, int, int) QPainter::drawEllipse()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addEllipse(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEllipse_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addEllipse_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>Creates an ellipse within the bounding rectangle defined by its top-left corner at (<tt>x</tt>, <tt>y</tt>), <tt>width</tt> and <tt>height</tt>, and adds it to the painter path as a closed subpath.
*/

    @QtBlockedSlot
    public final void addEllipse(double x, double y, double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEllipse_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_addEllipse_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Adds the given <tt>path</tt> to this path as a closed subpath. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#connectPath(com.trolltech.qt.gui.QPainterPath) connectPath()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPath(com.trolltech.qt.gui.QPainterPath path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPath_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addPath_QPainterPath(long __this__nativeId, long path);

/**
Adds the given <tt>polygon</tt> to the path as an (unclosed) subpath. <p>Note that the current position after the polygon has been added, is the last point in <tt>polygon</tt>. To draw a line back to the first point, use the {@link com.trolltech.qt.gui.QPainterPath#closeSubpath() closeSubpath()} function. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-addpolygon.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();
        QPolygonF myPolygon = new QPolygonF();

        QPainterPath myPath = new QPainterPath();
        myPath.addPolygon(myPolygon);

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPolygon(com.trolltech.qt.gui.QPolygonF polygon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPolygon_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addPolygon_QPolygonF(long __this__nativeId, long polygon);

/**
Adds the given <tt>rectangle</tt> to this path as a closed subpath. <p>The <tt>rectangle</tt> is added as a clockwise set of lines. The painter path's current position after the <tt>rectangle</tt> has been added is at the top-left corner of the rectangle. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-addrectangle.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();
        QRectF myRectangle = new QRectF();

        QPainterPath myPath = new QPainterPath();
        myPath.addRect(myRectangle);

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRegion(com.trolltech.qt.gui.QRegion) addRegion()}, {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRect(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRect_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addRect_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>Adds a rectangle at position (<tt>x</tt>, <tt>y</tt>), with the given <tt>width</tt> and <tt>height</tt>, as a closed subpath.
*/

    @QtBlockedSlot
    public final void addRect(double x, double y, double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRect_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_addRect_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Adds the given <tt>region</tt> to the path by adding each rectangle in the region as a separate closed subpath. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRegion(com.trolltech.qt.gui.QRegion region)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRegion_QRegion(nativeId(), region == null ? 0 : region.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addRegion_QRegion(long __this__nativeId, long region);

/**
This is an overloaded member function, provided for convenience. <p>Adds a rounded rectangle, <tt>rect</tt>, to the path. <p>The <tt>roundness</tt> argument specifies uniform roundness for the rectangle. Vertical and horizontal roundness factors will be adjusted accordingly to act uniformly around both axes. Use this method if you want a rectangle equally rounded across both the X and Y axis. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRoundedRect(com.trolltech.qt.core.QRectF, double, double) addRoundedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundRect(com.trolltech.qt.core.QRectF rect, int roundness)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundRect_QRectF_int(nativeId(), rect == null ? 0 : rect.nativeId(), roundness);
    }
    @QtBlockedSlot
    native void __qt_addRoundRect_QRectF_int(long __this__nativeId, long rect, int roundness);

/**
Adds a rectangle <tt>r</tt> with rounded corners to the path. <p>The <tt>xRnd</tt> and <tt>yRnd</tt> arguments specify how rounded the corners should be. 0 is angled corners, 99 is maximum roundedness. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRoundedRect(com.trolltech.qt.core.QRectF, double, double) addRoundedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundRect(com.trolltech.qt.core.QRectF rect, int xRnd, int yRnd)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundRect_QRectF_int_int(nativeId(), rect == null ? 0 : rect.nativeId(), xRnd, yRnd);
    }
    @QtBlockedSlot
    native void __qt_addRoundRect_QRectF_int_int(long __this__nativeId, long rect, int xRnd, int yRnd);

/**
This is an overloaded member function, provided for convenience. <p>Adds a rounded rectangle to the path, defined by the coordinates <tt>x</tt> and <tt>y</tt> with the specified <tt>width</tt> and <tt>height</tt>. <p>The <tt>roundness</tt> argument specifies uniform roundness for the rectangle. Vertical and horizontal roundness factors will be adjusted accordingly to act uniformly around both axes. Use this method if you want a rectangle equally rounded across both the X and Y axis. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRoundedRect(com.trolltech.qt.core.QRectF, double, double) addRoundedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundRect(double x, double y, double w, double h, int roundness)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundRect_double_double_double_double_int(nativeId(), x, y, w, h, roundness);
    }
    @QtBlockedSlot
    native void __qt_addRoundRect_double_double_double_double_int(long __this__nativeId, double x, double y, double w, double h, int roundness);

/**
This is an overloaded member function, provided for convenience. <p>Adds a rectangle with rounded corners to the path. The rectangle is constructed from <tt>x</tt>, <tt>y</tt>, and the width and height <tt>w</tt> and <tt>h</tt>. <p>The <tt>xRnd</tt> and <tt>yRnd</tt> arguments specify how rounded the corners should be. 0 is angled corners, 99 is maximum roundedness. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRoundedRect(com.trolltech.qt.core.QRectF, double, double) addRoundedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundRect(double x, double y, double w, double h, int xRnd, int yRnd)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundRect_double_double_double_double_int_int(nativeId(), x, y, w, h, xRnd, yRnd);
    }
    @QtBlockedSlot
    native void __qt_addRoundRect_double_double_double_double_int_int(long __this__nativeId, double x, double y, double w, double h, int xRnd, int yRnd);


/**
Adds the given rectangle <tt>rect</tt> with rounded corners to the path. <p>The <tt>xRadius</tt> and <tt>yRadius</tt> arguments specify the radii of the ellipses defining the corners of the rounded rectangle. When <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.SizeMode Qt::RelativeSize }, <tt>xRadius</tt> and <tt>yRadius</tt> are specified in percentage of half the rectangle's width and height respectively, and should be in the range 0.0 to 100.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundedRect(com.trolltech.qt.core.QRectF rect, double xRadius, double yRadius) {
        addRoundedRect(rect, xRadius, yRadius, com.trolltech.qt.core.Qt.SizeMode.AbsoluteSize);
    }
/**
Adds the given rectangle <tt>rect</tt> with rounded corners to the path. <p>The <tt>xRadius</tt> and <tt>yRadius</tt> arguments specify the radii of the ellipses defining the corners of the rounded rectangle. When <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.SizeMode Qt::RelativeSize }, <tt>xRadius</tt> and <tt>yRadius</tt> are specified in percentage of half the rectangle's width and height respectively, and should be in the range 0.0 to 100.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addRoundedRect(com.trolltech.qt.core.QRectF rect, double xRadius, double yRadius, com.trolltech.qt.core.Qt.SizeMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundedRect_QRectF_double_double_SizeMode(nativeId(), rect == null ? 0 : rect.nativeId(), xRadius, yRadius, mode.value());
    }
    @QtBlockedSlot
    native void __qt_addRoundedRect_QRectF_double_double_SizeMode(long __this__nativeId, long rect, double xRadius, double yRadius, int mode);


/**
This is an overloaded member function, provided for convenience. <p>Adds the given rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners to the path.
*/

    @QtBlockedSlot
    public final void addRoundedRect(double x, double y, double w, double h, double xRadius, double yRadius) {
        addRoundedRect(x, y, w, h, xRadius, yRadius, com.trolltech.qt.core.Qt.SizeMode.AbsoluteSize);
    }
/**
This is an overloaded member function, provided for convenience. <p>Adds the given rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners to the path.
*/

    @QtBlockedSlot
    public final void addRoundedRect(double x, double y, double w, double h, double xRadius, double yRadius, com.trolltech.qt.core.Qt.SizeMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRoundedRect_double_double_double_double_double_double_SizeMode(nativeId(), x, y, w, h, xRadius, yRadius, mode.value());
    }
    @QtBlockedSlot
    native void __qt_addRoundedRect_double_double_double_double_double_double_SizeMode(long __this__nativeId, double x, double y, double w, double h, double xRadius, double yRadius, int mode);

/**
Adds the given <tt>text</tt> to this path as a set of closed subpaths created from the <tt>font</tt> supplied. The subpaths are positioned so that the left end of the text's baseline lies at the specified <tt>point</tt>. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-addtext.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();
        QFont myFont = font();
        QPointF baseline = new QPointF(x, y);

        QPainterPath myPath = new QPainterPath();
        myPath.addText(baseline, myFont, tr("Qt"));

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) QPainter::drawText()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addText(com.trolltech.qt.core.QPointF point, com.trolltech.qt.gui.QFont f, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addText_QPointF_QFont_String(nativeId(), point == null ? 0 : point.nativeId(), f == null ? 0 : f.nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_addText_QPointF_QFont_String(long __this__nativeId, long point, long f, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Adds the given <tt>text</tt> to this path as a set of closed subpaths created from the <tt>font</tt> supplied. The subpaths are positioned so that the left end of the text's baseline lies at the point specified by (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void addText(double x, double y, com.trolltech.qt.gui.QFont f, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addText_double_double_QFont_String(nativeId(), x, y, f == null ? 0 : f.nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_addText_double_double_QFont_String(long __this__nativeId, double x, double y, long f, java.lang.String text);

/**
Returns the angle of the path tangent at the percentage <tt>t</tt>. The argument <tt>t</tt> has to be between 0 and 1. <p>Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <p>Note that similarly to the other percent methods, the percentage measurment is not linear with regards to the length if curves are present in the path. When curves are present the percentage argument is mapped to the t parameter of the Bezier equations.
*/

    @QtBlockedSlot
    public final double angleAtPercent(double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_angleAtPercent_double(nativeId(), t);
    }
    @QtBlockedSlot
    native double __qt_angleAtPercent_double(long __this__nativeId, double t);

/**
Creates a move to that lies on the arc that occupies the given <tt>rectangle</tt> at <tt>angle</tt>. <p>Angles are specified in degrees. Clockwise arcs can be specified using negative angles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, and {@link com.trolltech.qt.gui.QPainterPath#arcTo(com.trolltech.qt.core.QRectF, double, double) arcTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void arcMoveTo(com.trolltech.qt.core.QRectF rect, double angle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_arcMoveTo_QRectF_double(nativeId(), rect == null ? 0 : rect.nativeId(), angle);
    }
    @QtBlockedSlot
    native void __qt_arcMoveTo_QRectF_double(long __this__nativeId, long rect, double angle);

/**
This is an overloaded member function, provided for convenience. <p>Creates a move to that lies on the arc that occupies the {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>) at <tt>angle</tt>.
*/

    @QtBlockedSlot
    public final void arcMoveTo(double x, double y, double w, double h, double angle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_arcMoveTo_double_double_double_double_double(nativeId(), x, y, w, h, angle);
    }
    @QtBlockedSlot
    native void __qt_arcMoveTo_double_double_double_double_double(long __this__nativeId, double x, double y, double w, double h, double angle);

/**
Creates an arc that occupies the given <tt>rectangle</tt>, beginning at the specified <tt>startAngle</tt> and extending <tt>sweepLength</tt> degrees counter-clockwise. <p>Angles are specified in degrees. Clockwise arcs can be specified using negative angles. <p>Note that this function connects the starting point of the arc to the current position if they are not already connected. After the arc has been added, the current position is the last point in arc. To draw a line back to the first point, use the {@link com.trolltech.qt.gui.QPainterPath#closeSubpath() closeSubpath()} function. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-arcto.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();

        QPointF center = new QPointF();

        QPainterPath myPath = new QPainterPath();
        myPath.moveTo(center);
        myPath.arcTo(boundingRect, startAngle,
                     sweepLength);

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#arcMoveTo(com.trolltech.qt.core.QRectF, double) arcMoveTo()}, {@link com.trolltech.qt.gui.QPainterPath#addEllipse(com.trolltech.qt.core.QPointF, double, double) addEllipse()}, {@link com.trolltech.qt.gui.QPainter#drawArc(com.trolltech.qt.core.QRect, int, int) QPainter::drawArc()}, {@link com.trolltech.qt.gui.QPainter#drawPie(com.trolltech.qt.core.QRect, int, int) QPainter::drawPie()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void arcTo(com.trolltech.qt.core.QRectF rect, double startAngle, double arcLength)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_arcTo_QRectF_double_double(nativeId(), rect == null ? 0 : rect.nativeId(), startAngle, arcLength);
    }
    @QtBlockedSlot
    native void __qt_arcTo_QRectF_double_double(long __this__nativeId, long rect, double startAngle, double arcLength);

/**
This is an overloaded member function, provided for convenience. <p>Creates an arc that occupies the rectangle {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), beginning at the specified <tt>startAngle</tt> and extending <tt>sweepLength</tt> degrees counter-clockwise.
*/

    @QtBlockedSlot
    public final void arcTo(double x, double y, double w, double h, double startAngle, double arcLength)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_arcTo_double_double_double_double_double_double(nativeId(), x, y, w, h, startAngle, arcLength);
    }
    @QtBlockedSlot
    native void __qt_arcTo_double_double_double_double_double_double(long __this__nativeId, double x, double y, double w, double h, double startAngle, double arcLength);

/**
Returns the bounding rectangle of this painter path as a rectangle with floating point precision. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#controlPointRect() controlPointRect()}. <br></DD></DT>
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
Closes the current subpath by drawing a line to the beginning of the subpath, automatically starting a new path. The current point of the new path is (0, 0). <p>If the subpath does not contain any elements, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closeSubpath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeSubpath(nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeSubpath(long __this__nativeId);

/**
Connects the given <tt>path</tt> to this path by adding a line from the last element of this path to the first element of the given path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addPath(com.trolltech.qt.gui.QPainterPath) addPath()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void connectPath(com.trolltech.qt.gui.QPainterPath path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectPath_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_connectPath_QPainterPath(long __this__nativeId, long path);

/**
Returns true if the given path <tt>p</tt> is contained within the current path. Returns false if any edges of the current path and <tt>p</tt> intersect. <p>Set operations on paths will treat the paths as areas. Non-closed paths will be treated as implicitly closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#intersects(com.trolltech.qt.gui.QPainterPath) intersects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.gui.QPainterPath p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPainterPath(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPainterPath(long __this__nativeId, long p);

/**
Returns true if the given <tt>point</tt> is inside the path, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#intersects(com.trolltech.qt.gui.QPainterPath) intersects()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QPointF pt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPointF(nativeId(), pt == null ? 0 : pt.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPointF(long __this__nativeId, long pt);

/**
Returns true if the given <tt>rectangle</tt> is inside the path, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QRectF(long __this__nativeId, long rect);

/**
Returns the rectangle containing all the points and control points in this path. <p>This function is significantly faster to compute than the exact {@link com.trolltech.qt.gui.QPainterPath#boundingRect() boundingRect()}, and the returned rectangle is always a superset of the rectangle returned by {@link com.trolltech.qt.gui.QPainterPath#boundingRect() boundingRect()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#boundingRect() boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF controlPointRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_controlPointRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_controlPointRect(long __this__nativeId);

/**
Adds a cubic Bezier curve between the current position and the given <tt>endPoint</tt> using the control points specified by <tt>c1</tt>, and <tt>c2</tt>. <p>After the curve is added, the current position is updated to be at the end point of the curve. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainterpath-cubicto.png"></center><br></td><td> <pre class="snippet">
        QLinearGradient myGradient = new QLinearGradient();
        QPen myPen = new QPen();

        QPainterPath myPath = new QPainterPath();
        myPath.cubicTo(c1, c2, endPoint);

        QPainter painter = new QPainter(this);
        painter.setBrush(myGradient);
        painter.setPen(myPen);
        painter.drawPath(myPath);
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#quadTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) quadTo()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cubicTo(com.trolltech.qt.core.QPointF ctrlPt1, com.trolltech.qt.core.QPointF ctrlPt2, com.trolltech.qt.core.QPointF endPt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cubicTo_QPointF_QPointF_QPointF(nativeId(), ctrlPt1 == null ? 0 : ctrlPt1.nativeId(), ctrlPt2 == null ? 0 : ctrlPt2.nativeId(), endPt == null ? 0 : endPt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_cubicTo_QPointF_QPointF_QPointF(long __this__nativeId, long ctrlPt1, long ctrlPt2, long endPt);

/**
This is an overloaded member function, provided for convenience. <p>Adds a cubic Bezier curve between the current position and the end point (<tt>endPointX</tt>, <tt>endPointY</tt>) with control points specified by (<tt>c1X</tt>, <tt>c1Y</tt>) and (<tt>c2X</tt>, <tt>c2Y</tt>).
*/

    @QtBlockedSlot
    public final void cubicTo(double ctrlPt1x, double ctrlPt1y, double ctrlPt2x, double ctrlPt2y, double endPtx, double endPty)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cubicTo_double_double_double_double_double_double(nativeId(), ctrlPt1x, ctrlPt1y, ctrlPt2x, ctrlPt2y, endPtx, endPty);
    }
    @QtBlockedSlot
    native void __qt_cubicTo_double_double_double_double_double_double(long __this__nativeId, double ctrlPt1x, double ctrlPt1y, double ctrlPt2x, double ctrlPt2y, double endPtx, double endPty);

/**
Returns the current position of the path.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF currentPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_currentPosition(long __this__nativeId);

/**
Returns the element at the given <tt>index</tt> in the painter path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath.ElementType ElementType }, {@link com.trolltech.qt.gui.QPainterPath#elementCount() elementCount()}, and {@link com.trolltech.qt.gui.QPainterPath#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath_Element elementAt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementAt_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath_Element __qt_elementAt_int(long __this__nativeId, int i);

/**
Returns the number of path elements in the painter path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath.ElementType ElementType }, {@link com.trolltech.qt.gui.QPainterPath#elementAt(int) elementAt()}, and {@link com.trolltech.qt.gui.QPainterPath#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int elementCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_elementCount(long __this__nativeId);

/**
Returns the painter path's currently set fill rule. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#setFillRule(com.trolltech.qt.core.Qt.FillRule) setFillRule()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.FillRule fillRule()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.FillRule.resolve(__qt_fillRule(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fillRule(long __this__nativeId);

/**
Returns a path which is the intersection of this path's fill area and <tt>p</tt>'s fill area.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath intersected(com.trolltech.qt.gui.QPainterPath r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QPainterPath(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_intersected_QPainterPath(long __this__nativeId, long r);

/**
Returns true if the current path intersects at any point the given path <tt>p</tt>. Also returns true if the current path contains or is contained by any part of <tt>p</tt>. <p>Set operations on paths will treat the paths as areas. Non-closed paths will be treated as implicitly closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#contains(com.trolltech.qt.gui.QPainterPath) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.gui.QPainterPath p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QPainterPath(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QPainterPath(long __this__nativeId, long p);

/**
Returns true if any point in the given <tt>rectangle</tt> intersects the path; otherwise returns false. <p>There is an intersection if any of the lines making up the rectangle crosses a part of the path or if any part of the rectangle overlaps with any area enclosed by the path. This function respects the current fillRule to determine what is considered inside the path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#contains(com.trolltech.qt.gui.QPainterPath) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QRectF(long __this__nativeId, long rect);

/**
Returns true if either there are no elements in this path, or if the only element is a {@link com.trolltech.qt.gui.QPainterPath.ElementType MoveToElement }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#elementCount() elementCount()}. <br></DD></DT>
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
Returns the length of the current path.
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
Adds a straight line from the current position to the given <tt>endPoint</tt>. After the line is drawn, the current position is updated to be at the end point of the line. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#addPolygon(com.trolltech.qt.gui.QPolygonF) addPolygon()}, {@link com.trolltech.qt.gui.QPainterPath#addRect(com.trolltech.qt.core.QRectF) addRect()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void lineTo(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lineTo_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_lineTo_QPointF(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line from the current position to the point (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void lineTo(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lineTo_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_lineTo_double_double(long __this__nativeId, double x, double y);

/**
Moves the current point to the given <tt>point</tt>, implicitly starting a new subpath and closing the previous one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#closeSubpath() closeSubpath()}, and Composing a QPainterPath. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Moves the current position to (<tt>x</tt>, <tt>y</tt>) and starts a new subpath, implicitly closing the previous path.
*/

    @QtBlockedSlot
    public final void moveTo(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTo_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_moveTo_double_double(long __this__nativeId, double x, double y);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath operator_and(com.trolltech.qt.gui.QPainterPath other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_and_QPainterPath(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_operator_and_QPainterPath(long __this__nativeId, long other);

/**
Returns the union of this path and the <tt>other</tt> path. This function is equivalent to operator|(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#united(com.trolltech.qt.gui.QPainterPath) united()}, operator+=(), and operator-(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath operator_add(com.trolltech.qt.gui.QPainterPath other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_QPainterPath(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_operator_add_QPainterPath(long __this__nativeId, long other);

/**
Subtracts the <tt>other</tt> path from a copy of this path, and returns the copy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#subtracted(com.trolltech.qt.gui.QPainterPath) subtracted()}, operator-=(), and operator+(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath operator_subtract(com.trolltech.qt.gui.QPainterPath other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_QPainterPath(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_operator_subtract_QPainterPath(long __this__nativeId, long other);

/**
<brief>Writes thisQPainterPath
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
    private final boolean operator_equal(com.trolltech.qt.gui.QPainterPath other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPainterPath(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPainterPath(long __this__nativeId, long other);

/**
<brief>Reads a QPainterPath
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
Returns the union of this path and the <tt>other</tt> path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#united(com.trolltech.qt.gui.QPainterPath) united()}, operator|=(), {@link com.trolltech.qt.gui.QPainterPath#intersected(com.trolltech.qt.gui.QPainterPath) intersected()}, and operator&(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath operator_or(com.trolltech.qt.gui.QPainterPath other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_or_QPainterPath(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_operator_or_QPainterPath(long __this__nativeId, long other);

/**
Returns percentage of the whole path at the specified length <tt>len</tt>. <p>Note that similarly to other percent methods, the percentage measurment is not linear with regards to the length, if curves are present in the path. When curves are present the percentage argument is mapped to the t parameter of the Bezier equations.
*/

    @QtBlockedSlot
    public final double percentAtLength(double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_percentAtLength_double(nativeId(), t);
    }
    @QtBlockedSlot
    native double __qt_percentAtLength_double(long __this__nativeId, double t);

/**
Returns the point at at the percentage <tt>t</tt> of the current path. The argument <tt>t</tt> has to be between 0 and 1. <p>Note that similarly to other percent methods, the percentage measurment is not linear with regards to the length, if curves are present in the path. When curves are present the percentage argument is mapped to the t parameter of the Bezier equations.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF pointAtPercent(double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pointAtPercent_double(nativeId(), t);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_pointAtPercent_double(long __this__nativeId, double t);

/**
Adds a quadratic Bezier curve between the current position and the given <tt>endPoint</tt> with the control point specified by <tt>c</tt>. <p>After the curve is added, the current point is updated to be at the end point of the curve. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()}, and Composing a QPainterPath. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void quadTo(com.trolltech.qt.core.QPointF ctrlPt, com.trolltech.qt.core.QPointF endPt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_quadTo_QPointF_QPointF(nativeId(), ctrlPt == null ? 0 : ctrlPt.nativeId(), endPt == null ? 0 : endPt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_quadTo_QPointF_QPointF(long __this__nativeId, long ctrlPt, long endPt);

/**
This is an overloaded member function, provided for convenience. <p>Adds a quadratic Bezier curve between the current point and the endpoint (<tt>endPointX</tt>, <tt>endPointY</tt>) with the control point specified by (<tt>cx</tt>, <tt>cy</tt>).
*/

    @QtBlockedSlot
    public final void quadTo(double ctrlPtx, double ctrlPty, double endPtx, double endPty)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_quadTo_double_double_double_double(nativeId(), ctrlPtx, ctrlPty, endPtx, endPty);
    }
    @QtBlockedSlot
    native void __qt_quadTo_double_double_double_double(long __this__nativeId, double ctrlPtx, double ctrlPty, double endPtx, double endPty);

/**
Sets the x and y coordinate of the element at index <tt>index</tt> to <tt>x</tt> and <tt>y</tt>.
*/

    @QtBlockedSlot
    public final void setElementPositionAt(int i, double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setElementPositionAt_int_double_double(nativeId(), i, x, y);
    }
    @QtBlockedSlot
    native void __qt_setElementPositionAt_int_double_double(long __this__nativeId, int i, double x, double y);

/**
Sets the fill rule of the painter path to the given <tt>fillRule</tt>. Qt provides two methods for filling paths: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qt-fillrule-oddeven.png"></center><br></td><td>  <br><center><img src="../images/qt-fillrule-winding.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill } (default)</center></th><th><center> {@link com.trolltech.qt.core.Qt.FillRule Qt::WindingFill }</center></th></tr></thead></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#fillRule() fillRule()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFillRule(com.trolltech.qt.core.Qt.FillRule fillRule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFillRule_FillRule(nativeId(), fillRule.value());
    }
    @QtBlockedSlot
    native void __qt_setFillRule_FillRule(long __this__nativeId, int fillRule);

/**
Returns a simplified version of this path. This implies merging all subpaths that intersect, and returning a path containing no intersecting edges. Consecutive parallel lines will also be merged. The simplified path will always use the default fill rule, {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath simplified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_simplified(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_simplified(long __this__nativeId);

/**
Returns the slope of the path at the percentage <tt>t</tt>. The argument <tt>t</tt> has to be between 0 and 1. <p>Note that similarly to other percent methods, the percentage measurment is not linear with regards to the length, if curves are present in the path. When curves are present the percentage argument is mapped to the t parameter of the Bezier equations.
*/

    @QtBlockedSlot
    public final double slopeAtPercent(double t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_slopeAtPercent_double(nativeId(), t);
    }
    @QtBlockedSlot
    native double __qt_slopeAtPercent_double(long __this__nativeId, double t);

/**
Returns a path which is <tt>p</tt>'s fill area subtracted from this path's fill area. <p>Set operations on paths will treat the paths as areas. Non-closed paths will be treated as implicitly closed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath subtracted(com.trolltech.qt.gui.QPainterPath r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subtracted_QPainterPath(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_subtracted_QPainterPath(long __this__nativeId, long r);

/**
Use {@link com.trolltech.qt.gui.QPainterPath#subtracted(com.trolltech.qt.gui.QPainterPath) subtracted()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#subtracted(com.trolltech.qt.gui.QPainterPath) subtracted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath subtractedInverted(com.trolltech.qt.gui.QPainterPath r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subtractedInverted_QPainterPath(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_subtractedInverted_QPainterPath(long __this__nativeId, long r);


/**
This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF toFillPolygon() {
        return toFillPolygon((com.trolltech.qt.gui.QMatrix)new com.trolltech.qt.gui.QMatrix());
    }
/**
This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF toFillPolygon(com.trolltech.qt.gui.QMatrix matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFillPolygon_QMatrix(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_toFillPolygon_QMatrix(long __this__nativeId, long matrix);

/**
Converts the path into a polygon using the {@link com.trolltech.qt.gui.QTransform QTransform}<tt>matrix</tt>, and returns the polygon. <p>The polygon is created by first converting all subpaths to polygons, then using a rewinding technique to make sure that overlapping subpaths can be filled using the correct fill rule. <p>Note that rewinding inserts addition lines in the polygon so the outline of the fill polygon does not match the outline of the path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()}, {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()}, and QPainterPath Conversion. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF toFillPolygon(com.trolltech.qt.gui.QTransform matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFillPolygon_QTransform(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_toFillPolygon_QTransform(long __this__nativeId, long matrix);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toFillPolygons() {
        return toFillPolygons((com.trolltech.qt.gui.QMatrix)new com.trolltech.qt.gui.QMatrix());
    }
/**
Converts the path into a list of polygons using the 
QMatrix <tt>matrix</tt>, and returns the list.
<p>
The function differs from the toFillPolygon() function in that it
creates several polygons. It is provided because it is usually
faster to draw several small polygons than to draw one large
polygon, even though the total number of points drawn is the same.
<p>
The toFillPolygons() function differs from the toSubpathPolygons()
function in that it create only polygon for subpaths that have
overlapping bounding rectangles.
<p>
Like the toFillPolygon() function, this function uses a rewinding
technique to make sure that overlapping subpaths can be filled
using the correct fill rule. Note that rewinding inserts addition
lines in the polygons so the outline of the fill polygon does not
match the outline of the path.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toFillPolygons(com.trolltech.qt.gui.QMatrix matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFillPolygons_QMatrix(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QPolygonF> __qt_toFillPolygons_QMatrix(long __this__nativeId, long matrix);

/**
Converts the path into a list of polygons using the {@link com.trolltech.qt.gui.QTransform QTransform}<tt>matrix</tt>, and returns the list. <p>The function differs from the {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()} function in that it creates several polygons. It is provided because it is usually faster to draw several small polygons than to draw one large polygon, even though the total number of points drawn is the same. <p>The {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} function differs from the {@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()} function in that it create only polygon for subpaths that have overlapping bounding rectangles. <p>Like the {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()} function, this function uses a rewinding technique to make sure that overlapping subpaths can be filled using the correct fill rule. Note that rewinding inserts addition lines in the polygons so the outline of the fill polygon does not match the outline of the path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#toSubpathPolygons() toSubpathPolygons()}, {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()}, and QPainterPath Conversion. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toFillPolygons(com.trolltech.qt.gui.QTransform matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFillPolygons_QTransform(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QPolygonF> __qt_toFillPolygons_QTransform(long __this__nativeId, long matrix);

/**
Creates and returns a reversed copy of the path. <p>It is the order of the elements that is reversed: If a QPainterPath is composed by calling the {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}, {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()} and {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()} functions in the specified order, the reversed copy is composed by calling {@link com.trolltech.qt.gui.QPainterPath#cubicTo(com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF, com.trolltech.qt.core.QPointF) cubicTo()}, {@link com.trolltech.qt.gui.QPainterPath#lineTo(com.trolltech.qt.core.QPointF) lineTo()} and {@link com.trolltech.qt.gui.QPainterPath#moveTo(com.trolltech.qt.core.QPointF) moveTo()}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath toReversed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toReversed(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_toReversed(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toSubpathPolygons() {
        return toSubpathPolygons((com.trolltech.qt.gui.QMatrix)new com.trolltech.qt.gui.QMatrix());
    }
/**
Converts the path into a list of polygons using the QMatrix
<tt>matrix</tt>, and returns the list.
<p>
This function creates one polygon for each subpath regardless of
intersecting subpaths (i.e. overlapping bounding rectangles). To
make sure that such overlapping subpaths are filled correctly, use
the toFillPolygons() function instead.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toSubpathPolygons(com.trolltech.qt.gui.QMatrix matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toSubpathPolygons_QMatrix(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QPolygonF> __qt_toSubpathPolygons_QMatrix(long __this__nativeId, long matrix);

/**
Converts the path into a list of polygons using the {@link com.trolltech.qt.gui.QTransform QTransform}<tt>matrix</tt>, and returns the list. <p>This function creates one polygon for each subpath regardless of intersecting subpaths (i.e. overlapping bounding rectangles). To make sure that such overlapping subpaths are filled correctly, use the {@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()} function instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#toFillPolygons() toFillPolygons()}, {@link com.trolltech.qt.gui.QPainterPath#toFillPolygon() toFillPolygon()}, and QPainterPath Conversion. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPolygonF> toSubpathPolygons(com.trolltech.qt.gui.QTransform matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toSubpathPolygons_QTransform(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QPolygonF> __qt_toSubpathPolygons_QTransform(long __this__nativeId, long matrix);

/**
Returns a path which is the union of this path's fill area and <tt>p</tt>'s fill area. <p>Set operations on paths will treat the paths as areas. Non-closed paths will be treated as implicitly closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainterPath#intersected(com.trolltech.qt.gui.QPainterPath) intersected()}, {@link com.trolltech.qt.gui.QPainterPath#subtracted(com.trolltech.qt.gui.QPainterPath) subtracted()}, and subtractedInverted(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath united(com.trolltech.qt.gui.QPainterPath r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_united_QPainterPath(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_united_QPainterPath(long __this__nativeId, long r);

/**
@exclude
*/

    public static native QPainterPath fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPainterPath(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPainterPath array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QPainterPath)
        return operator_equal((com.trolltech.qt.gui.QPainterPath) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QPainterPath</tt>. </brief>
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
    public QPainterPath clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPainterPath __qt_clone(long __this_nativeId);
}
