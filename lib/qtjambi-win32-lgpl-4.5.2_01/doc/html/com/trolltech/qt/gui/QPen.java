package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPen class defines how a {@link com.trolltech.qt.gui.QPainter QPainter} should draw lines and outlines of shapes. A pen has a {@link com.trolltech.qt.gui.QPen#style() style()}, {@link com.trolltech.qt.gui.QPen#width() width()}, {@link com.trolltech.qt.gui.QPen#brush() brush()}, {@link com.trolltech.qt.gui.QPen#capStyle() capStyle()} and {@link com.trolltech.qt.gui.QPen#joinStyle() joinStyle()}. <p>The pen style defines the line type. The brush is used to fill strokes generated with the pen. Use the {@link com.trolltech.qt.gui.QBrush QBrush} class to specify fill styles. The cap style determines the line end caps that can be drawn using {@link com.trolltech.qt.gui.QPainter QPainter}, while the join style describes how joins between two lines are drawn. The pen width can be specified in both integer ({@link com.trolltech.qt.gui.QPen#width() width()}) and floating point ({@link com.trolltech.qt.gui.QPen#widthF() widthF()}) precision. A line width of zero indicates a cosmetic pen. This means that the pen width is always drawn one pixel wide, independent of the {@link com.trolltech.qt.gui.QPainter transformation} set on the painter. <p>The various settings can easily be modified using the corresponding {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()} and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()} functions (note that the painter's pen must be reset when altering the pen's properties). <p>For example: <pre class="snippet">
        QPainter painter = new QPainter(this);
        QPen pen = new QPen(QColor.green, 3, Qt.PenStyle.DashDotLine, Qt.PenCapStyle.RoundCap, Qt.PenJoinStyle.RoundJoin);
        painter.setPen(pen);
</pre> which is equivalent to <pre class="snippet">
        QPainter painter = new QPainter(this);
        QPen pen = new QPen();  // creates a default pen

        pen.setStyle(Qt.PenStyle.DashDotLine);
        pen.setWidth(3);
        pen.setBrush(new QBrush(QColor.green));
        pen.setCapStyle(Qt.PenCapStyle.RoundCap);
        pen.setJoinStyle(Qt.PenJoinStyle.RoundJoin);

        painter.setPen(pen);
</pre> The default pen is a solid black brush with 0 width, square cap style ({@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }), and bevel join style ({@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin }). <p>In addition QPen provides the {@link com.trolltech.qt.gui.QPen#color() color()} and {@link com.trolltech.qt.gui.QPen#setColor(com.trolltech.qt.gui.QColor) setColor()} convenience functions to extract and set the color of the pen's brush, respectively. Pens may also be compared and streamed. <p>For more information about painting in general, see {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>} documentation. <ul><li> {@link <a href="#pen-style">Pen Style</a>}</li><li> {@link <a href="#cap-style">Cap Style</a>}</li><li> {@link <a href="#join-style">Join Style</a>}</li></ul><a name="pen-style"><h2>Pen Style</h2> Qt provides several built-in styles represented by the {@link com.trolltech.qt.core.Qt.PenStyle Qt::PenStyle } enum: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-solid.png"></center><br></td><td>  <br><center><img src="../images/qpen-dash.png"></center><br></td><td>  <br><center><img src="../images/qpen-dot.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::SolidLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DotLine }</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-dashdot.png"></center><br></td><td>  <br><center><img src="../images/qpen-dashdotdot.png"></center><br></td><td>  <br><center><img src="../images/qpen-custom.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotDotLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }</td></tr></table> Simply use the {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()} function to convert the pen style to either of the built-in styles, except the {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine } style which we will come back to shortly. Setting the style to {@link com.trolltech.qt.core.Qt.PenStyle Qt::NoPen } tells the painter to not draw lines or outlines. The default pen style is {@link com.trolltech.qt.core.Qt.PenStyle Qt::SolidLine }. <p>Since Qt 4.1 it is also possible to specify a custom dash pattern using the {@link com.trolltech.qt.gui.QPen#setDashPattern(java.util.List) setDashPattern()} function which implicitly converts the style of the pen to {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }. The pattern argument, a QVector, must be specified as an even number of qreal entries where the entries 1, 3, 5... are the dashes and 2, 4, 6... are the spaces. For example, the custom pattern shown above is created using the following code: <pre class="snippet">
        QPen pen = new QPen();
        List&lt;Double&gt; dashes = new ArrayList&lt;Double&gt;();

        double space = 4;

        dashes.add(1.0);
        dashes.add(space);
        dashes.add(3.0);
        dashes.add(space);
        dashes.add(9.0);
        dashes.add(space);
        dashes.add(27.0);
        dashes.add(space);
        dashes.add(9.0);

        pen.setDashPattern(dashes);
</pre> Note that the dash pattern is specified in units of the pens width, e.g. a dash of length 5 in width 10 is 50 pixels long. <p>The currently set dash pattern can be retrieved using the {@link com.trolltech.qt.gui.QPen#dashPattern() dashPattern()} function. Use the {@link com.trolltech.qt.gui.QPen#isSolid() isSolid()} function to determine whether the pen has a solid fill, or not.<a name="cap-style"><h2>Cap Style</h2> The cap style defines how the end points of lines are drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. The cap style only apply to wide lines, i.e. when the width is 1 or greater. The {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::PenCapStyle } enum provides the following styles: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-square.png"></center><br></td><td>  <br><center><img src="../images/qpen-flat.png"></center><br></td><td>  <br><center><img src="../images/qpen-roundcap.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }</td><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::FlatCap }</td><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::RoundCap }</td></tr></table> The {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap } style is a square line end that covers the end point and extends beyond it by half the line width. The {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::FlatCap } style is a square line end that does not cover the end point of the line. And the {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::RoundCap } style is a rounded line end covering the end point. <p>The default is {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }. <p>Whether or not end points are drawn when the pen width is 0 or 1 depends on the cap style. Using {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap } or {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::RoundCap } they are drawn, using {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::FlatCap } they are not drawn.<a name="join-style"><h2>Join Style</h2> The join style defines how joins between two connected lines can be drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. The join style only apply to wide lines, i.e. when the width is 1 or greater. The {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::PenJoinStyle } enum provides the following styles: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-bevel.png"></center><br></td><td>  <br><center><img src="../images/qpen-miter.png"></center><br></td><td>  <br><center><img src="../images/qpen-roundjoin.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin }</td><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin }</td><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::RoundJoin }</td></tr></table> The {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin } style fills the triangular notch between the two lines. The {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin } style extends the lines to meet at an angle. And the {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::RoundJoin } style fills a circular arc between the two lines. <p>The default is {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin }. <br><center><img src="../images/qpen-miterlimit.png"></center><br> When the {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin } style is applied, it is possible to use the {@link com.trolltech.qt.gui.QPen#setMiterLimit(double) setMiterLimit()} function to specify how far the miter join can extend from the join point. The {@link com.trolltech.qt.gui.QPen#miterLimit() miterLimit()} is used to reduce artifacts between line joins where the lines are close to parallel. <p>The {@link com.trolltech.qt.gui.QPen#miterLimit() miterLimit()} must be specified in units of the pens width, e.g. a miter limit of 5 in width 10 is 50 pixels long. The default miter limit is 2, i.e. twice the pen width in pixels. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-demo.png"></center><br></td><td> <b>{@link <a href="../qtjambi-pathstroke.html">The Path Stroking Demo</a>}</b> <p>The Path Stroking demo shows Qt's built-in dash patterns and shows how custom patterns can be used to extend the range of available patterns.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QBrush QBrush}, {@link <a href="../qtjambi-pathstroke.html">Path Stroking Demo</a>}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPen extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a default black solid line pen with 0 width.
*/

    public QPen(){
        super((QPrivateConstructor)null);
        __qt_QPen();
    }

    native void __qt_QPen();

/**
Constructs a black pen with 0 width and the given <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.core.Qt.PenStyle arg__1){
        super((QPrivateConstructor)null);
        __qt_QPen_PenStyle(arg__1.value());
    }

    native void __qt_QPen_PenStyle(int arg__1);


/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.gui.QBrush brush, double width, com.trolltech.qt.core.Qt.PenStyle s, com.trolltech.qt.core.Qt.PenCapStyle c) {
        this(brush, width, s, c, com.trolltech.qt.core.Qt.PenJoinStyle.BevelJoin);
    }

/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.gui.QBrush brush, double width, com.trolltech.qt.core.Qt.PenStyle s) {
        this(brush, width, s, com.trolltech.qt.core.Qt.PenCapStyle.SquareCap, com.trolltech.qt.core.Qt.PenJoinStyle.BevelJoin);
    }

/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.gui.QBrush brush, double width) {
        this(brush, width, com.trolltech.qt.core.Qt.PenStyle.SolidLine, com.trolltech.qt.core.Qt.PenCapStyle.SquareCap, com.trolltech.qt.core.Qt.PenJoinStyle.BevelJoin);
    }
/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.gui.QBrush brush, double width, com.trolltech.qt.core.Qt.PenStyle s, com.trolltech.qt.core.Qt.PenCapStyle c, com.trolltech.qt.core.Qt.PenJoinStyle j){
        super((QPrivateConstructor)null);
        __qt_QPen_QBrush_double_PenStyle_PenCapStyle_PenJoinStyle(brush == null ? 0 : brush.nativeId(), width, s.value(), c.value(), j.value());
    }

    native void __qt_QPen_QBrush_double_PenStyle_PenCapStyle_PenJoinStyle(long brush, double width, int s, int c, int j);

/**
Constructs a solid line pen with 0 width and the given <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, and {@link com.trolltech.qt.gui.QPen#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
*/

    public QPen(com.trolltech.qt.gui.QColor color){
        super((QPrivateConstructor)null);
        __qt_QPen_QColor(color == null ? 0 : color.nativeId());
    }

    native void __qt_QPen_QColor(long color);

/**
Constructs a pen that is a copy of the given <tt>pen</tt>.
*/

    public QPen(com.trolltech.qt.gui.QPen pen){
        super((QPrivateConstructor)null);
        __qt_QPen_QPen(pen == null ? 0 : pen.nativeId());
    }

    native void __qt_QPen_QPen(long pen);

/**
Returns the brush used to fill strokes generated with this pen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brush(long __this__nativeId);

/**
Returns the pen's cap style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and Cap Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.PenCapStyle capStyle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.PenCapStyle.resolve(__qt_capStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_capStyle(long __this__nativeId);

/**
Returns the color of this pen's brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#brush() brush()}, and {@link com.trolltech.qt.gui.QPen#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor color()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_color(long __this__nativeId);

/**
Returns the dash offset for the pen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setDashOffset(double) setDashOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double dashOffset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dashOffset(nativeId());
    }
    @QtBlockedSlot
    native double __qt_dashOffset(long __this__nativeId);

/**
Returns the dash pattern of this pen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setDashPattern(java.util.List) setDashPattern()}, {@link com.trolltech.qt.gui.QPen#style() style()}, and {@link com.trolltech.qt.gui.QPen#isSolid() isSolid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Double> dashPattern()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dashPattern(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Double> __qt_dashPattern(long __this__nativeId);

/**
Returns true if the pen is cosmetic; otherwise returns false. <p>Cosmetic pens are used to draw strokes that have a constant width regardless of any transformations applied to the {@link com.trolltech.qt.gui.QPainter QPainter} they are used with. Drawing a shape with a cosmetic pen ensures that its outline will have the same thickness at different scale factors. <p>A zero width pen is cosmetic by default; pens with a non-zero width are non-cosmetic. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setCosmetic(boolean) setCosmetic()}, and {@link com.trolltech.qt.gui.QPen#widthF() widthF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCosmetic()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCosmetic(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCosmetic(long __this__nativeId);

/**
Returns true if the pen has a solid fill, otherwise false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#style() style()}, and {@link com.trolltech.qt.gui.QPen#dashPattern() dashPattern()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSolid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSolid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSolid(long __this__nativeId);

/**
Returns the pen's join style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}, and Join Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.PenJoinStyle joinStyle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.PenJoinStyle.resolve(__qt_joinStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_joinStyle(long __this__nativeId);

/**
Returns the miter limit of the pen. The miter limit is only relevant when the join style is set to {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setMiterLimit(double) setMiterLimit()}, and Join Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double miterLimit()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_miterLimit(nativeId());
    }
    @QtBlockedSlot
    native double __qt_miterLimit(long __this__nativeId);

/**
<brief>Writes thisQPen
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
    private final boolean operator_equal(com.trolltech.qt.gui.QPen p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPen(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPen(long __this__nativeId, long p);

/**
<brief>Reads a QPen
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
Sets the brush used to fill strokes generated with this pen to the given <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#brush() brush()}, and {@link com.trolltech.qt.gui.QPen#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBrush(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrush_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBrush_QBrush(long __this__nativeId, long brush);

/**
Sets the pen's cap style to the given <tt>style</tt>. The default value is {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#capStyle() capStyle()}, and Cap Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle pcs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCapStyle_PenCapStyle(nativeId(), pcs.value());
    }
    @QtBlockedSlot
    native void __qt_setCapStyle_PenCapStyle(long __this__nativeId, int pcs);

/**
Sets the color of this pen's brush to the given <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, and {@link com.trolltech.qt.gui.QPen#color() color()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColor_QColor(long __this__nativeId, long color);

/**
Sets this pen to cosmetic or non-cosmetic, depending on the value of <tt>cosmetic</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#isCosmetic() isCosmetic()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCosmetic(boolean cosmetic)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCosmetic_boolean(nativeId(), cosmetic);
    }
    @QtBlockedSlot
    native void __qt_setCosmetic_boolean(long __this__nativeId, boolean cosmetic);

/**
Sets the dash offset (the starting point on the dash pattern) for this pen to the <tt>offset</tt> specified. The offset is measured in terms of the units used to specify the dash pattern. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-dashpattern.png"></center><br></td><td> For example, a pattern where each stroke is four units long, followed by a gap of two units, will begin with the stroke when drawn as a line. <p>However, if the dash offset is set to 4.0, any line drawn will begin with the gap. Values of the offset up to 4.0 will cause part of the stroke to be drawn first, and values of the offset between 4.0 and 6.0 will cause the line to begin with part of the gap.</td></tr></table> <b>Note:</b> This implicitly converts the style of the pen to {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#dashOffset() dashOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDashOffset(double doffset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDashOffset_double(nativeId(), doffset);
    }
    @QtBlockedSlot
    native void __qt_setDashOffset_double(long __this__nativeId, double doffset);

/**
Sets the dash pattern for this pen to the given <tt>pattern</tt>. This implicitly converts the style of the pen to {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }. <p>The pattern must be specified as an even number of entries where the entries 1, 3, 5... are the dashes and 2, 4, 6... are the spaces. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-custom.png"></center><br></td><td> <pre class="snippet">
        QPen pen = new QPen();
        List&lt;Double&gt; dashes = new ArrayList&lt;Double&gt;();

        double space = 4;

        dashes.add(1.0);
        dashes.add(space);
        dashes.add(3.0);
        dashes.add(space);
        dashes.add(9.0);
        dashes.add(space);
        dashes.add(27.0);
        dashes.add(space);
        dashes.add(9.0);

        pen.setDashPattern(dashes);
</pre></td></tr></table> The dash pattern is specified in units of the pens width; e.g. a dash of length 5 in width 10 is 50 pixels long. Note that a pen with zero width is equivalent to a cosmetic pen with a width of 1 pixel. <p>Each dash is also subject to cap styles so a dash of 1 with square cap set will extend 0.5 pixels out in each direction resulting in a total width of 2. <p>Note that the default cap style is {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }, meaning that a square line end covers the end point and extends beyond it by half the line width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#dashPattern() dashPattern()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setCosmetic(boolean) setCosmetic()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDashPattern(java.util.List<java.lang.Double> pattern)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDashPattern_List(nativeId(), pattern);
    }
    @QtBlockedSlot
    native void __qt_setDashPattern_List(long __this__nativeId, java.util.List<java.lang.Double> pattern);

/**
Sets the pen's join style to the given <tt>style</tt>. The default value is {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#joinStyle() joinStyle()}, and Join Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle pcs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setJoinStyle_PenJoinStyle(nativeId(), pcs.value());
    }
    @QtBlockedSlot
    native void __qt_setJoinStyle_PenJoinStyle(long __this__nativeId, int pcs);

/**
Sets the miter limit of this pen to the given <tt>limit</tt>. <br><center><img src="../images/qpen-miterlimit.png"></center><br> The miter limit describes how far a miter join can extend from the join point. This is used to reduce artifacts between line joins where the lines are close to parallel. <p>This value does only have effect when the pen style is set to {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin }. The value is specified in units of the pen's width, e.g. a miter limit of 5 in width 10 is 50 pixels long. The default miter limit is 2, i.e. twice the pen width in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#miterLimit() miterLimit()}, {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}, and Join Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMiterLimit(double limit)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMiterLimit_double(nativeId(), limit);
    }
    @QtBlockedSlot
    native void __qt_setMiterLimit_double(long __this__nativeId, double limit);

/**
Sets the pen style to the given <tt>style</tt>. <p>See the {@link com.trolltech.qt.core.Qt.PenStyle Qt::PenStyle } documentation for a list of the available styles. Since Qt 4.1 it is also possible to specify a custom dash pattern using the {@link com.trolltech.qt.gui.QPen#setDashPattern(java.util.List) setDashPattern()} function which implicitly converts the style of the pen to {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#style() style()}, and Pen Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.core.Qt.PenStyle arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyle_PenStyle(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setStyle_PenStyle(long __this__nativeId, int arg__1);

/**
Sets the pen width to the given <tt>width</tt> in pixels with integer precision. <p>A line width of zero indicates a cosmetic pen. This means that the pen width is always drawn one pixel wide, independent of the {@link com.trolltech.qt.gui.QPainter transformation} set on the painter. <p>Setting a pen width with a negative value is not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setWidthF(double) setWidthF()}, and {@link com.trolltech.qt.gui.QPen#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidth(int width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_int(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setWidth_int(long __this__nativeId, int width);

/**
Sets the pen width to the given <tt>width</tt> in pixels with floating point precision. <p>A line width of zero indicates a cosmetic pen. This means that the pen width is always drawn one pixel wide, independent of the {@link com.trolltech.qt.gui.QPainter transformation} on the painter. <p>Setting a pen width with a negative value is not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, and {@link com.trolltech.qt.gui.QPen#widthF() widthF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidthF(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidthF_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setWidthF_double(long __this__nativeId, double width);

/**
Returns the pen style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, and Pen Style. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.PenStyle style()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.PenStyle.resolve(__qt_style(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_style(long __this__nativeId);

/**
Returns the pen width with integer precision. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, and {@link com.trolltech.qt.gui.QPen#widthF() widthF()}. <br></DD></DT>
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
Returns the pen width with floating point precision. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setWidthF(double) setWidthF()}, and {@link com.trolltech.qt.gui.QPen#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double widthF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widthF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_widthF(long __this__nativeId);

/**
@exclude
*/

    public static native QPen fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPen(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPen array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QPen)
        return operator_equal((com.trolltech.qt.gui.QPen) other);
        return false;
    }


/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(QColor color, double width, com.trolltech.qt.core.Qt.PenStyle s, com.trolltech.qt.core.Qt.PenCapStyle c, com.trolltech.qt.core.Qt.PenJoinStyle j) {
        this(new QBrush(color), width, s, c, j);
    }

/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(QColor color, double width, com.trolltech.qt.core.Qt.PenStyle s, com.trolltech.qt.core.Qt.PenCapStyle c) {
        this(new QBrush(color), width, s, c);
    }

/**
Constructs a pen with the specified <tt>brush</tt>, <tt>width</tt>, pen <tt>style</tt>, <tt>cap</tt> style and <tt>join</tt> style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPen#setWidth(int) setWidth()}, {@link com.trolltech.qt.gui.QPen#setStyle(com.trolltech.qt.core.Qt.PenStyle) setStyle()}, {@link com.trolltech.qt.gui.QPen#setCapStyle(com.trolltech.qt.core.Qt.PenCapStyle) setCapStyle()}, and {@link com.trolltech.qt.gui.QPen#setJoinStyle(com.trolltech.qt.core.Qt.PenJoinStyle) setJoinStyle()}. <br></DD></DT>
*/

    public QPen(QColor color, double width, com.trolltech.qt.core.Qt.PenStyle s) {
        this(new QBrush(color), width, s);
    }

/**
This is an overloaded constructor provided for convenience.
*/

    public QPen(QColor color, double width) {
        this(new QBrush(color), width);
    }

    public static final QPen NoPen = new QPen(com.trolltech.qt.core.Qt.PenStyle.NoPen);


/**
<brief>Returns a string representation of the <tt>this QPen</tt>. </brief>
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
    public QPen clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPen __qt_clone(long __this_nativeId);
}
