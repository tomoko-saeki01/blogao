package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPainter class performs low-level painting on widgets and other paint devices. QPainter provides highly optimized functions to do most of the drawing GUI programs require. It can draw everything from simple lines to complex shapes like pies and chords. It can also draw aligned text and pixmaps. Normally, it draws in a "natural" coordinate system, but it can also do view and world transformation. QPainter can operate on any object that inherits the {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} class. <p>The common use of QPainter is inside a widget's paint event: Construct and customize (e.g. set the pen or the brush) the painter. Then draw. Remember to destroy the QPainter object after drawing. For example: <pre class="snippet">
    &#64;Override
    protected void paintEvent(QPaintEvent e) {
        QPainter painter = new QPainter(this);
        painter.setPen(QColor.blue);
        painter.setFont(new QFont("Arial", 30));
        painter.drawText(rect(), Qt.AlignmentFlag.AlignCenter.value(), "Qt");
        painter.end();
    }
</pre> The core functionality of QPainter is drawing, but the class also provide several functions that allows you to customize QPainter's settings and its rendering quality, and others that enable clipping. In addition you can control how different shapes are merged together by specifying the painter's composition mode. <p>The {@link com.trolltech.qt.gui.QPainter#isActive() isActive()} function indicates whether the painter is active. A painter is activated by the {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} function and the constructor that takes a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} argument. The {@link com.trolltech.qt.gui.QPainter#end() end()} function, and the destructor, deactivates it. <p>Together with the {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} and {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} classes, QPainter form the basis for Qt's paint system. QPainter is the class used to perform drawing operations. {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} represents a device that can be painted on using a QPainter. {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} provides the interface that the painter uses to draw onto different types of devices. If the painter is active, {@link com.trolltech.qt.gui.QPainter#device() device()} returns the paint device on which the painter paints, and {@link com.trolltech.qt.gui.QPainter#paintEngine() paintEngine()} returns the paint engine that the painter is currently operating on. For more information, see {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>} documentation. <p>Sometimes it is desirable to make someone else paint on an unusual {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice}. QPainter supports a static function to do this, {@link com.trolltech.qt.gui.QPainter#setRedirected(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.gui.QPaintDeviceInterface) setRedirected()}. <p><b>Warning:</b> When the paintdevice is a widget, QPainter can only be used inside a paintEvent() function or in a function called by paintEvent(); that is unless the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOutsidePaintEvent } widget attribute is set. On Mac OS X and Windows, you can only paint in a paintEvent() function regardless of this attribute's setting. <ul><li> {@link <a href="#settings">Settings</a>}</li><li> {@link <a href="#drawing">Drawing</a>}</li><li> {@link <a href="#rendering-quality">Rendering Quality</a>}</li><li> {@link <a href="#coordinate-transformations">Coordinate Transformations</a>}</li><li> {@link <a href="#clipping">Clipping</a>}</li><li> {@link <a href="#composition-modes">Composition Modes</a>}</li><li> {@link <a href="#limitations">Limitations</a>}</li></ul><a name="settings"><h2>Settings</h2> There are several settings that you can customize to make QPainter draw according to your preferences: <ul><li> {@link com.trolltech.qt.gui.QPainter#font() font()} is the font used for drawing text. If the painter {@link com.trolltech.qt.gui.QPainter#isActive() isActive()}, you can retrieve information about the currently set font, and its metrics, using the {@link com.trolltech.qt.gui.QPainter#fontInfo() fontInfo()} and {@link com.trolltech.qt.gui.QPainter#fontMetrics() fontMetrics()} functions respectively.</li><li> {@link com.trolltech.qt.gui.QPainter#brush() brush()} defines the color or pattern that is used for filling shapes.</li><li> {@link com.trolltech.qt.gui.QPainter#pen() pen()} defines the color or stipple that is used for drawing lines or boundaries.</li><li> {@link com.trolltech.qt.gui.QPainter#backgroundMode() backgroundMode()} defines whether there is a {@link com.trolltech.qt.gui.QPainter#background() background()} or not, i.e it is either {@link com.trolltech.qt.core.Qt.BGMode Qt::OpaqueMode } or {@link com.trolltech.qt.core.Qt.BGMode Qt::TransparentMode }.</li><li> {@link com.trolltech.qt.gui.QPainter#background() background()} only applies when {@link com.trolltech.qt.gui.QPainter#backgroundMode() backgroundMode()} is {@link com.trolltech.qt.core.Qt.BGMode Qt::OpaqueMode } and {@link com.trolltech.qt.gui.QPainter#pen() pen()} is a stipple. In that case, it describes the color of the background pixels in the stipple.</li><li> {@link com.trolltech.qt.gui.QPainter#brushOrigin() brushOrigin()} defines the origin of the tiled brushes, normally the origin of widget's background.</li><li> {@link com.trolltech.qt.gui.QPainter#viewport() viewport()}, {@link com.trolltech.qt.gui.QPainter#window() window()}, {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()} make up the painter's coordinate transformation system. For more information, see the Coordinate Transformations section and the {@link <a href="../coordsys.html">The Coordinate System</a>} documentation.</li><li> {@link com.trolltech.qt.gui.QPainter#hasClipping() hasClipping()} tells whether the painter clips at all. (The paint device clips, too.) If the painter clips, it clips to {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}.</li><li> {@link com.trolltech.qt.gui.QPainter#layoutDirection() layoutDirection()} defines the layout direction used by the painter when drawing text.</li><li> matrixEnabled() tells whether world transformation is enabled.</li><li> {@link com.trolltech.qt.gui.QPainter#viewTransformEnabled() viewTransformEnabled()} tells whether view transformation is enabled.</li></ul> Note that some of these settings mirror settings in some paint devices, e.g. {@link QWidget#font() QWidget::font()}. The {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} function (or equivalently the QPainter constructor) copies these attributes from the paint device. <p>You can at any time save the QPainter's state by calling the {@link com.trolltech.qt.gui.QPainter#save() save()} function which saves all the available settings on an internal stack. The {@link com.trolltech.qt.gui.QPainter#restore() restore()} function pops them back.<a name="drawing"><h2>Drawing</h2> QPainter provides functions to draw most primitives: {@link com.trolltech.qt.gui.QPainter#drawPoint(com.trolltech.qt.core.QPoint) drawPoint()}, {@link com.trolltech.qt.gui.QPainter#drawPoints(com.trolltech.qt.gui.QPolygon) drawPoints()}, {@link com.trolltech.qt.gui.QPainter#drawLine(com.trolltech.qt.gui.QLine) drawLine()}, {@link com.trolltech.qt.gui.QPainter#drawRect(com.trolltech.qt.core.QRect) drawRect()}, {@link com.trolltech.qt.gui.QPainter#drawRoundedRect(com.trolltech.qt.core.QRect, double, double) drawRoundedRect()}, {@link com.trolltech.qt.gui.QPainter#drawEllipse(com.trolltech.qt.core.QPoint, int, int) drawEllipse()}, {@link com.trolltech.qt.gui.QPainter#drawArc(com.trolltech.qt.core.QRect, int, int) drawArc()}, {@link com.trolltech.qt.gui.QPainter#drawPie(com.trolltech.qt.core.QRect, int, int) drawPie()}, {@link com.trolltech.qt.gui.QPainter#drawChord(com.trolltech.qt.core.QRect, int, int) drawChord()}, {@link com.trolltech.qt.gui.QPainter#drawPolyline(com.trolltech.qt.gui.QPolygon) drawPolyline()}, {@link com.trolltech.qt.gui.QPainter#drawPolygon(com.trolltech.qt.gui.QPolygon) drawPolygon()}, {@link com.trolltech.qt.gui.QPainter#drawConvexPolygon(com.trolltech.qt.gui.QPolygon) drawConvexPolygon()} and drawCubicBezier(). The two convenience functions, {@link com.trolltech.qt.gui.QPainter#drawRects(java.util.List) drawRects()} and {@link com.trolltech.qt.gui.QPainter#drawLines(java.util.List) drawLines()}, draw the given number of rectangles or lines in the given array of {@link com.trolltech.qt.core.QRect QRects} or {@link com.trolltech.qt.gui.QLine QLines} using the current pen and brush. <p>The QPainter class also provides the {@link com.trolltech.qt.gui.QPainter#fillRect(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QBrush) fillRect()} function which fills the given {@link com.trolltech.qt.core.QRect QRect}, with the given {@link com.trolltech.qt.gui.QBrush QBrush}, and the {@link com.trolltech.qt.gui.QPainter#eraseRect(com.trolltech.qt.core.QRect) eraseRect()} function that erases the area inside the given rectangle. <p>All of these functions have both integer and floating point versions. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-basicdrawing.png"></center><br></td><td> <b>Basic Drawing Example</b> <p>The {@link <a href="../painting-basicdrawing.html">Basic Drawing</a>} example shows how to display basic graphics primitives in a variety of styles using the QPainter class.</td></tr></table> If you need to draw a complex shape, especially if you need to do so repeatedly, consider creating a {@link com.trolltech.qt.gui.QPainterPath QPainterPath} and drawing it using {@link com.trolltech.qt.gui.QPainter#drawPath(com.trolltech.qt.gui.QPainterPath) drawPath()}. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <b>Painter Paths example</b> <p>The {@link com.trolltech.qt.gui.QPainterPath QPainterPath} class provides a container for painting operations, enabling graphical shapes to be constructed and reused. <p>The {@link <a href="../painting-painterpaths.html">Painter Paths</a>} example shows how painter paths can be used to build complex shapes for rendering.</td><td>  <br><center><img src="../images/qpainter-painterpaths.png"></center><br></td></tr></table> QPainter also provides the {@link com.trolltech.qt.gui.QPainter#fillPath(com.trolltech.qt.gui.QPainterPath, com.trolltech.qt.gui.QBrush) fillPath()} function which fills the given {@link com.trolltech.qt.gui.QPainterPath QPainterPath} with the given {@link com.trolltech.qt.gui.QBrush QBrush}, and the {@link com.trolltech.qt.gui.QPainter#strokePath(com.trolltech.qt.gui.QPainterPath, com.trolltech.qt.gui.QPen) strokePath()} function that draws the outline of the given path (i.e. strokes the path). <p>See also the {@link <a href="../qtjambi-deform.html">Vector Deformation</a>} demo which shows how to use advanced vector techniques to draw text using a {@link com.trolltech.qt.gui.QPainterPath QPainterPath}, the {@link <a href="../demos-gradients.html">Gradients</a>} demo which shows the different types of gradients that are available in Qt, and the {@link <a href="../qtjambi-pathstroke.html">Path Stroking</a>} demo which shows Qt's built-in dash patterns and shows how custom patterns can be used to extend the range of available patterns. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-vectordeformation.png"></center><br></td><td>  <br><center><img src="../images/qpainter-gradients.png"></center><br></td><td>  <br><center><img src="../images/qpainter-pathstroking.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> {@link <a href="../qtjambi-deform.html">Vector Deformation</a>}</center></th><th><center> {@link <a href="../demos-gradients.html">Gradients</a>}</center></th><th><center> {@link <a href="../qtjambi-pathstroke.html">Path Stroking</a>}</center></th></tr></thead></table> There are functions to draw pixmaps/images, namely {@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()}, {@link com.trolltech.qt.gui.QPainter#drawImage(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QImage) drawImage()} and {@link com.trolltech.qt.gui.QPainter#drawTiledPixmap(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QPixmap) drawTiledPixmap()}. Both {@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()} and {@link com.trolltech.qt.gui.QPainter#drawImage(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QImage) drawImage()} produce the same result, except that {@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()} is faster on-screen while {@link com.trolltech.qt.gui.QPainter#drawImage(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QImage) drawImage()} may be faster on a {@link com.trolltech.qt.gui.QPrinter QPrinter} or other devices. <p>Text drawing is done using {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}. When you need fine-grained positioning, {@link com.trolltech.qt.gui.QPainter#boundingRect(com.trolltech.qt.core.QRect, int, java.lang.String) boundingRect()} tells you where a given {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()} command will draw. <p>There is a {@link com.trolltech.qt.gui.QPainter#drawPicture(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPicture) drawPicture()} function that draws the contents of an entire {@link com.trolltech.qt.gui.QPicture QPicture}. The {@link com.trolltech.qt.gui.QPainter#drawPicture(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPicture) drawPicture()} function is the only function that disregards all the painter's settings as {@link com.trolltech.qt.gui.QPicture QPicture} has its own settings.<a name="rendering-quality"><h2>Rendering Quality</h2> To get the optimal rendering result using QPainter, you should use the platform independent {@link com.trolltech.qt.gui.QImage QImage} as paint device; i.e. using {@link com.trolltech.qt.gui.QImage QImage} will ensure that the result has an identical pixel representation on any platform. <p>The QPainter class also provides a means of controlling the rendering quality through its {@link com.trolltech.qt.gui.QPainter.RenderHint RenderHint } enum and the support for floating point precision: All the functions for drawing primitives has a floating point version. These are often used in combination with the {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::Antialiasing } render hint. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-concentriccircles.png"></center><br></td><td> <b>Concentric Circles Example</b> <p>The {@link <a href="../painting-concentriccircles.html">Concentric Circles</a>} example shows the improved rendering quality that can be obtained using floating point precision and anti-aliasing when drawing custom widgets. <p>The application's main window displays several widgets which are drawn using the various combinations of precision and anti-aliasing.</td></tr></table> The {@link com.trolltech.qt.gui.QPainter.RenderHint RenderHint } enum specifies flags to QPainter that may or may not be respected by any given engine. {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::Antialiasing } indicates that the engine should antialias edges of primitives if possible, {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::TextAntialiasing } indicates that the engine should antialias text if possible, and the {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::SmoothPixmapTransform } indicates that the engine should use a smooth pixmap transformation algorithm. {@link com.trolltech.qt.gui.QPainter.RenderHint HighQualityAntialiasing } is an OpenGL-specific rendering hint indicating that the engine should use fragment programs and offscreen rendering for antialiasing. <p>The {@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()} function returns a flag that specifies the rendering hints that are set for this painter. Use the {@link com.trolltech.qt.gui.QPainter#setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) setRenderHint()} function to set or clear the currently set RenderHints.<a name="coordinate-transformations"><h2>Coordinate Transformations</h2> Normally, the QPainter operates on the device's own coordinate system (usually pixels), but QPainter has good support for coordinate transformations. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-clock.png"></center><br></td><td>  <br><center><img src="../images/qpainter-rotation.png"></center><br></td><td>  <br><center><img src="../images/qpainter-scale.png"></center><br></td><td>  <br><center><img src="../images/qpainter-translation.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> nop</center></th><th><center> {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}</center></th><th><center> {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}</center></th><th><center> {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}</center></th></tr></thead></table> The most commonly used transformations are scaling, rotation, translation and shearing. Use the {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()} function to scale the coordinate system by a given offset, the {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()} function to rotate it clockwise and {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()} to translate it (i.e. adding a given offset to the points). You can also twist the coordinate system around the origin using the {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()} function. See the {@link <a href="../demos-affine.html">Affine Transformations</a>} demo for a visualization of a sheared coordinate system. <p>See also the {@link <a href="../painting-transformations.html">Transformations</a>} example which shows how transformations influence the way that QPainter renders graphics primitives. In particular it shows how the order of transformations affects the result. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <b>Affine Transformations Demo</b> <p>The {@link <a href="../demos-affine.html">Affine Transformations</a>} demo show Qt's ability to perform affine transformations on painting operations. The demo also allows the user to experiment with the transformation operations and see the results immediately.</td><td>  <br><center><img src="../images/qpainter-affinetransformations.png"></center><br></td></tr></table> All the tranformation operations operate on the transformation {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}. A matrix transforms a point in the plane to another point. For more information about the transformation matrix, see the {@link <a href="../coordsys.html">The Coordinate System</a>} and {@link com.trolltech.qt.gui.QMatrix QMatrix} documentation. <p>The {@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()} function can replace or add to the currently set {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}. The {@link com.trolltech.qt.gui.QPainter#resetMatrix() resetMatrix()} function resets any transformations that were made using {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}, {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()}, {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, {@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()} and {@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()} functions. The {@link com.trolltech.qt.gui.QPainter#deviceMatrix() deviceMatrix()} returns the matrix that transforms from logical coordinates to device coordinates of the platform dependent paint device. The latter function is only needed when using platform painting commands on the platform dependent handle, and the platform does not do transformations nativly. <p>When drawing with QPainter, we specify points using logical coordinates which then are converted into the physical coordinates of the paint device. The mapping of the logical coordinates to the physical coordinates are handled by QPainter's {@link com.trolltech.qt.gui.QPainter#combinedMatrix() combinedMatrix()}, a combination of {@link com.trolltech.qt.gui.QPainter#viewport() viewport()} and {@link com.trolltech.qt.gui.QPainter#window() window()} and {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}. The {@link com.trolltech.qt.gui.QPainter#viewport() viewport()} represents the physical coordinates specifying an arbitrary rectangle, the {@link com.trolltech.qt.gui.QPainter#window() window()} describes the same rectangle in logical coordinates, and the {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()} is identical with the transformation matrix. <p>See also {@link <a href="../coordsys.html">The Coordinate System</a>} documentation.<a name="clipping"><h2>Clipping</h2> QPainter can clip any drawing operation to a rectangle, a region, or a vector path. The current clip is available using the functions {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()} and {@link com.trolltech.qt.gui.QPainter#clipPath() clipPath()}. Whether paths or regions are preferred (faster) depends on the underlying {@link com.trolltech.qt.gui.QPainter#paintEngine() paintEngine()}. For example, the {@link com.trolltech.qt.gui.QImage QImage} paint engine prefers paths while the X11 paint engine prefers regions. Setting a clip is done in the painters logical coordinates. <p>After QPainter's clipping, the paint device may also clip. For example, most widgets clip away the pixels used by child widgets, and most printers clip away an area near the edges of the paper. This additional clipping is not reflected by the return value of {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()} or {@link com.trolltech.qt.gui.QPainter#hasClipping() hasClipping()}.<a name="composition-modes"><h2>Composition Modes</h2><a name="composition-modes"> QPainter provides the {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode } enum which defines the Porter-Duff rules for digital image compositing; it describes a model for combining the pixels in one image, the source, with the pixels in another image, the destination. <p>The two most common forms of composition are {@link com.trolltech.qt.gui.QPainter.CompositionMode Source } and {@link com.trolltech.qt.gui.QPainter.CompositionMode SourceOver }. {@link com.trolltech.qt.gui.QPainter.CompositionMode Source } is used to draw opaque objects onto a paint device. In this mode, each pixel in the source replaces the corresponding pixel in the destination. In {@link com.trolltech.qt.gui.QPainter.CompositionMode SourceOver } composition mode, the source object is transparent and is drawn on top of the destination. <p>Note that composition transformation operates pixelwise. For that reason, there is a difference between using the grahic primitive itself and its bounding rectangle: The bounding rect contains pixels with alpha == 0 (i.e the pixels surrounding the primitive). These pixels will overwrite the other image's pixels, affectively clearing those, while the primitive only overwrites its own area. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-compositiondemo.png"></center><br></td><td> <b>Composition Modes Demo</b> <p>The {@link <a href="../demos-composition.html">Composition Modes</a>} demo, available in Qt's demo directory, allows you to experiment with the various composition modes and see the results immediately.</td></tr></table><a name="limitations"><h2>Limitations</h2><a name="limitations"> If you are using coordinates with Qt's raster-based paint engine, it is important to note that, while coordinates greater than +/- 215 can be used, any painting performed with coordinates outside this range is not guaranteed to be shown; the drawing may be clipped. This is due to the use of <tt>short int</tt> in the implementation. <p>The outlines generated by Qt's stroker are only an approximation when dealing with curved shapes. It is in most cases impossible to represent the outline of a bezier curve segment using another bezier curve segment, and so Qt approximates the curve outlines by using several smaller curves. For performance reasons there is a limit to how many curves Qt uses for these outlines, and thus when using large pen widths or scales the outline error increases. To generate outlines with smaller errors it is possible to use the {@link com.trolltech.qt.gui.QPainterPathStroker QPainterPathStroker} class, which has the setCurveThreshold member function which let's the user specify the error tolerance. Another workaround is to convert the paths to polygons first and then draw the polygons instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice QPaintDevice}, {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine}, {@link <a href="../qtsvg.html">QtSvg Module</a>}, and {@link <a href="../painting-basicdrawing.html">Basic Drawing Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPainter extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
Defines the modes supported for digital image compositing. Composition modes are used to specify how the pixels in one image, the source, are merged with the pixel in another image, the destination. <p>Please note that the bitwise raster operation modes, denoted with a RasterOp prefix, are only natively supported in the X11 and raster paint engines. This means that the only way to utilize these modes on the Mac is via a {@link com.trolltech.qt.gui.QImage QImage}. The RasterOp denoted blend modes are not supported for pens and brushes with alpha components. Also, turning on the {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::Antialiasing } render hint will effectively disable the RasterOp modes. <br><center><img src="../images/qpainter-compositionmode1.png"></center><br> <br><center><img src="../images/qpainter-compositionmode2.png"></center><br> The most common type is SourceOver (often referred to as just alpha blending) where the source pixel is blended on top of the destination pixel in such a way that the alpha component of the source defines the translucency of the pixel. <p>When the paint device is a {@link com.trolltech.qt.gui.QImage QImage}, the image format must be set to {@link com.trolltech.qt.gui.QImage.Format Format_ARGB32Premultiplied } or {@link com.trolltech.qt.gui.QImage.Format Format_ARGB32 } for the composition modes to have any effect. For performance the premultiplied version is the preferred format. <p>When a composition mode is set it applies to all painting operator, pens, brushes, gradients and pixmap/image drawing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#compositionMode() compositionMode()}, {@link com.trolltech.qt.gui.QPainter#setCompositionMode(com.trolltech.qt.gui.QPainter.CompositionMode) setCompositionMode()}, {@link com.trolltech.qt.gui.QPainter Composition Modes}, and {@link <a href="../painting-imagecomposition.html">Image Composition Example</a>}. <br></DD></DT>
*/

    public enum CompositionMode implements com.trolltech.qt.QtEnumerator {
/**
 The output is the source pixel. (This means a basic copy operation and is identical to SourceOver when the source pixel is opaque).
*/

/**
 This is the default mode. The alpha of the source is used to blend the pixel on top of the destination.
*/

        CompositionMode_SourceOver(0),
/**
 The output is the destination pixel. This means that the blending has no effect. This mode is the inverse of {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_Source }.
*/

/**
 The alpha of the destination is used to blend it on top of the source pixels. This mode is the inverse of {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_SourceOver }.
*/

        CompositionMode_DestinationOver(1),
/**
 The pixels in the destination are cleared (set to fully transparent) independent of the source.
*/

        CompositionMode_Clear(2),
        CompositionMode_Source(3),
        CompositionMode_Destination(4),
/**
 The output is the source, where the alpha is reduced by that of the destination.
*/

        CompositionMode_SourceIn(5),
/**
 The output is the destination, where the alpha is reduced by that of the source. This mode is the inverse of {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_SourceIn }.
*/

        CompositionMode_DestinationIn(6),
/**
 The output is the source, where the alpha is reduced by the inverse of destination.
*/

        CompositionMode_SourceOut(7),
/**
 The output is the destination, where the alpha is reduced by the inverse of the source. This mode is the inverse of {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_SourceOut }.
*/

        CompositionMode_DestinationOut(8),
/**
 The source pixel is blended on top of the destination, with the alpha of the source pixel reduced by the alpha of the destination pixel.
*/

        CompositionMode_SourceAtop(9),
/**
 The destination pixel is blended on top of the source, with the alpha of the destination pixel is reduced by the alpha of the destination pixel. This mode is the inverse of {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_SourceAtop }.
*/

        CompositionMode_DestinationAtop(10),
/**
 The source, whose alpha is reduced with the inverse of the destination alpha, is merged with the destination, whose alpha is reduced by the inverse of the source alpha. {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_Xor } is not the same as the bitwise Xor.
*/

        CompositionMode_Xor(11),
/**
 Both the alpha and color of the source and destination pixels are added together.
*/

        CompositionMode_Plus(12),
/**
 The output is the source color multiplied by the destination. Multiplying a color with white leaves the color unchanged, while multiplying a color with black produces black.
*/

        CompositionMode_Multiply(13),
/**
 The source and destination colors are inverted and then multiplied. Screening a color with white produces white, whereas screening a color with black leaves the color unchanged.
*/

        CompositionMode_Screen(14),
/**
 Multiplies or screens the colors depending on the destination color. The destination color is mixed with the source color to reflect the lightness or darkness of the destination.
*/

        CompositionMode_Overlay(15),
/**
 The darker of the source and destination colors is selected.
*/

        CompositionMode_Darken(16),
/**
 The lighter of the source and destination colors is selected.
*/

        CompositionMode_Lighten(17),
/**
 The destination color is brightened to reflect the source color. A black source color leaves the destination color unchanged.
*/

        CompositionMode_ColorDodge(18),
/**
 The destination color is darkened to reflect the source color. A white source color leaves the destination color unchanged.
*/

        CompositionMode_ColorBurn(19),
/**
 Multiplies or screens the colors depending on the source color. A light source color will lighten the destination color, whereas a dark source color will darken the destination color.
*/

        CompositionMode_HardLight(20),
/**
 Darkens or lightens the colors depending on the source color. Similar to {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_HardLight }.
*/

        CompositionMode_SoftLight(21),
/**
 Subtracts the darker of the colors from the lighter. Painting with white inverts the destination color, whereas painting with black leaves the destination color unchanged.
*/

        CompositionMode_Difference(22),
/**
 Similar to {@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode_Difference }, but with a lower contrast. Painting with white inverts the destination color, whereas painting with black leaves the destination color unchanged.
*/

        CompositionMode_Exclusion(23),
/**
 Does a bitwise OR operation on the source and destination pixels (src OR dst).
*/

        RasterOp_SourceOrDestination(24),
/**
 Does a bitwise AND operation on the source and destination pixels (src AND dst).
*/

        RasterOp_SourceAndDestination(25),
/**
 Does a bitwise XOR operation on the source and destination pixels (src XOR dst).
*/

        RasterOp_SourceXorDestination(26),
/**
 Does a bitwise operation where the source pixels are inverted (NOT src).
*/

/**
 Does a bitwise NOR operation on the source and destination pixels ((NOT src) AND (NOT dst)).
*/

        RasterOp_NotSourceAndNotDestination(27),
/**
 Does a bitwise NAND operation on the source and destination pixels ((NOT src) OR (NOT dst)).
*/

        RasterOp_NotSourceOrNotDestination(28),
/**
 Does a bitwise operation where the source pixels are inverted and then XOR'ed with the destination ((NOT src) XOR dst).
*/

        RasterOp_NotSourceXorDestination(29),
        RasterOp_NotSource(30),
/**
 Does a bitwise operation where the source is inverted and then AND'ed with the destination ((NOT src) AND dst).
*/

        RasterOp_NotSourceAndDestination(31),
/**
 Does a bitwise operation where the source is AND'ed with the inverted destination pixels (src AND (NOT dst)).
*/

        RasterOp_SourceAndNotDestination(32);

        CompositionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPainter$CompositionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CompositionMode resolve(int value) {
            return (CompositionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CompositionMode_SourceOver;
            case 1: return CompositionMode_DestinationOver;
            case 2: return CompositionMode_Clear;
            case 3: return CompositionMode_Source;
            case 4: return CompositionMode_Destination;
            case 5: return CompositionMode_SourceIn;
            case 6: return CompositionMode_DestinationIn;
            case 7: return CompositionMode_SourceOut;
            case 8: return CompositionMode_DestinationOut;
            case 9: return CompositionMode_SourceAtop;
            case 10: return CompositionMode_DestinationAtop;
            case 11: return CompositionMode_Xor;
            case 12: return CompositionMode_Plus;
            case 13: return CompositionMode_Multiply;
            case 14: return CompositionMode_Screen;
            case 15: return CompositionMode_Overlay;
            case 16: return CompositionMode_Darken;
            case 17: return CompositionMode_Lighten;
            case 18: return CompositionMode_ColorDodge;
            case 19: return CompositionMode_ColorBurn;
            case 20: return CompositionMode_HardLight;
            case 21: return CompositionMode_SoftLight;
            case 22: return CompositionMode_Difference;
            case 23: return CompositionMode_Exclusion;
            case 24: return RasterOp_SourceOrDestination;
            case 25: return RasterOp_SourceAndDestination;
            case 26: return RasterOp_SourceXorDestination;
            case 27: return RasterOp_NotSourceAndNotDestination;
            case 28: return RasterOp_NotSourceOrNotDestination;
            case 29: return RasterOp_NotSourceXorDestination;
            case 30: return RasterOp_NotSource;
            case 31: return RasterOp_NotSourceAndDestination;
            case 32: return RasterOp_SourceAndNotDestination;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Renderhints are used to specify flags to {@link com.trolltech.qt.gui.QPainter QPainter} that may or may not be respected by any given engine. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, {@link com.trolltech.qt.gui.QPainter#setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) setRenderHint()}, {@link com.trolltech.qt.gui.QPainter Rendering Quality}, and {@link <a href="../painting-concentriccircles.html">Concentric Circles Example</a>}. <br></DD></DT>
*/

    public enum RenderHint implements com.trolltech.qt.QtEnumerator {
/**
 Indicates that the engine should antialias edges of primitives if possible.
*/

        Antialiasing(1),
/**
 Indicates that the engine should antialias text if possible. To forcibly disable antialiasing for text, do not use this hint. Instead, set {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::NoAntialias } on your font's style strategy.
*/

        TextAntialiasing(2),
/**
 Indicates that the engine should use a smooth pixmap transformation algorithm (such as bilinear) rather than nearest neighbor.
*/

        SmoothPixmapTransform(4),
/**
 An OpenGL-specific rendering hint indicating that the engine should use fragment programs and offscreen rendering for antialiasing.
*/

        HighQualityAntialiasing(8),
/**
 The engine should interpret pens with a width of 0 (which otherwise enables {@link com.trolltech.qt.gui.QPen#isCosmetic() QPen::isCosmetic()}) as being a non-cosmetic pen with a width of 1.
*/

        NonCosmeticDefaultPen(16);

        RenderHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QPainter$RenderHints with the specified <tt>com.trolltech.qt.gui.QPainter$RenderHint[]</tt> QPainter$RenderHint values set.</brief>
*/

        public static RenderHints createQFlags(RenderHint ... values) {
            return new RenderHints(values);
        }
/**
<brief>Returns the QPainter$RenderHint constant with the specified <tt>int</tt>.</brief>
*/

        public static RenderHint resolve(int value) {
            return (RenderHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Antialiasing;
            case 2: return TextAntialiasing;
            case 4: return SmoothPixmapTransform;
            case 8: return HighQualityAntialiasing;
            case 16: return NonCosmeticDefaultPen;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class RenderHints extends com.trolltech.qt.QFlags<RenderHint> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QPainter-RenderHints with the specified <tt>com.trolltech.qt.gui.QPainter.RenderHint[]</tt>. flags set.</brief>
*/

        public RenderHints(RenderHint ... args) { super(args); }
        public RenderHints(int value) { setValue(value); }
    }



/**
Constructs a painter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and {@link com.trolltech.qt.gui.QPainter#end() end()}. <br></DD></DT>
*/

    public QPainter(){
        super((QPrivateConstructor)null);
        __qt_QPainter();
    }

    native void __qt_QPainter();

/**
Constructs a painter that begins painting the paint <tt>device</tt> immediately. <p>This constructor is convenient for short-lived painters, e.g. in a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()} and should be used only once. The constructor calls {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} for you and the QPainter destructor automatically calls {@link com.trolltech.qt.gui.QPainter#end() end()}. <p>Here's an example using {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} and {@link com.trolltech.qt.gui.QPainter#end() end()}: <pre class="snippet">
    &#64;Override
    protected void paintEvent(QPaintEvent e) {
        QPainter p = new QPainter();
        p.begin(this);
        p.drawLine(line);        // drawing code
        p.end();
    }
</pre> The same example using this constructor: <pre class="snippet">
    &#64;Override
    protected void paintEvent(QPaintEvent e) {
        QPainter p = new QPainter(this);
        p.drawLine(line);        // drawing code
        p.end();
    }
</pre> Since the constructor cannot provide feedback when the initialization of the painter failed you should rather use {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} and {@link com.trolltech.qt.gui.QPainter#end() end()} to paint on external devices, e.g. printers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and {@link com.trolltech.qt.gui.QPainter#end() end()}. <br></DD></DT>
*/

    public QPainter(com.trolltech.qt.gui.QPaintDeviceInterface arg__1){
        super((QPrivateConstructor)null);
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        __qt_QPainter_QPaintDevice(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QPainter_QPaintDevice(long arg__1);

/**
Returns the current background brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background(long __this__nativeId);

/**
Returns the current background mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setBackgroundMode(com.trolltech.qt.core.Qt.BGMode) setBackgroundMode()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.BGMode backgroundMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.BGMode.resolve(__qt_backgroundMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_backgroundMode(long __this__nativeId);

/**
Begins painting the paint <tt>device</tt> and returns true if successful; otherwise returns false. <p>Notice that all painter settings ({@link com.trolltech.qt.gui.QPainter#setPen(com.trolltech.qt.core.Qt.PenStyle) setPen()}, {@link com.trolltech.qt.gui.QPainter#setBrush(com.trolltech.qt.core.Qt.BrushStyle) setBrush()} etc.) are reset to default values when {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} is called. <p>The errors that can occur are serious problems, such as these: <pre class="snippet">
        painter.begin(null); // impossible - paint device cannot be null

        QPixmap image = new QPixmap(0, 0);
        painter.begin(image); // impossible - image.isNull() == true;

        painter.begin(myWidget);
        painter2.begin(myWidget); // impossible - only one painter at a time
</pre> Note that most of the time, you can use one of the constructors instead of {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and that {@link com.trolltech.qt.gui.QPainter#end() end()} is automatically done at destruction. <p><b>Warning:</b> A paint device can only be painted by one painter at a time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#end() end()}, and QPainter(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean begin(com.trolltech.qt.gui.QPaintDeviceInterface arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        return __qt_begin_QPaintDevice(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_begin_QPaintDevice(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Returns the bounding rectangle of the <tt>text</tt> as it will appear when drawn inside the given <tt>rectangle</tt> with the specified <tt>flags</tt> using the currently set {@link com.trolltech.qt.gui.QPainter#font() font()}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect boundingRect(com.trolltech.qt.core.QRect rect, int flags, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_QRect_int_String(nativeId(), rect == null ? 0 : rect.nativeId(), flags, text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_boundingRect_QRect_int_String(long __this__nativeId, long rect, int flags, java.lang.String text);


/**
This is an overloaded member function, provided for convenience. <p>Instead of specifying flags as a bitwise OR of the {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag } and {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextFlag }, this overloaded function takes an <tt>option</tt> argument. The {@link com.trolltech.qt.gui.QTextOption QTextOption} class provides a description of general rich text properties. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption QTextOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, java.lang.String text) {
        return boundingRect(rect, text, (com.trolltech.qt.gui.QTextOption)new com.trolltech.qt.gui.QTextOption());
    }
/**
This is an overloaded member function, provided for convenience. <p>Instead of specifying flags as a bitwise OR of the {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag } and {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextFlag }, this overloaded function takes an <tt>option</tt> argument. The {@link com.trolltech.qt.gui.QTextOption QTextOption} class provides a description of general rich text properties. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption QTextOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, java.lang.String text, com.trolltech.qt.gui.QTextOption o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_QRectF_String_QTextOption(nativeId(), rect == null ? 0 : rect.nativeId(), text, o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect_QRectF_String_QTextOption(long __this__nativeId, long rect, java.lang.String text, long o);

/**
Returns the bounding rectangle of the <tt>text</tt> as it will appear when drawn inside the given <tt>rectangle</tt> with the specified <tt>flags</tt> using the currently set {@link com.trolltech.qt.gui.QPainter#font() font()}; i.e the function tells you where the {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()} function will draw when given the same arguments. <p>If the <tt>text</tt> does not fit within the given <tt>rectangle</tt> using the specified <tt>flags</tt>, the function returns the required rectangle. <p>The <tt>flags</tt> argument is a bitwise OR of the following flags: <ul><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignBottom }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignVCenter }</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter }</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextSingleLine }</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextExpandTabs }</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic }</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextWordWrap }</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextIncludeTrailingSpaces }</li></ul> If several of the horizontal or several of the vertical alignment flags are set, the resulting alignment is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}, Qt::Alignment, and {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextFlag }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, int flags, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_QRectF_int_String(nativeId(), rect == null ? 0 : rect.nativeId(), flags, text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect_QRectF_int_String(long __this__nativeId, long rect, int flags, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Returns the bounding rectangle of the given <tt>text</tt> as it will appear when drawn inside the rectangle beginning at the point (<tt>x</tt>, <tt>y</tt>) with width <tt>w</tt> and height <tt>h</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect boundingRect(int x, int y, int w, int h, int flags, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_int_int_int_int_int_String(nativeId(), x, y, w, h, flags, text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_boundingRect_int_int_int_int_int_String(long __this__nativeId, int x, int y, int w, int h, int flags, java.lang.String text);

/**
Returns the painter's current brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setBrush(com.trolltech.qt.core.Qt.BrushStyle) QPainter::setBrush()}, and Settings. <br></DD></DT>
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
Returns the currently set brush origin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setBrushOrigin(com.trolltech.qt.core.QPoint) setBrushOrigin()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint brushOrigin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brushOrigin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_brushOrigin(long __this__nativeId);

/**
Returns the currently clip as a path. Note that the clip path is given in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setClipPath(com.trolltech.qt.gui.QPainterPath) setClipPath()}, {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, and {@link com.trolltech.qt.gui.QPainter#setClipping(boolean) setClipping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath clipPath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipPath(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_clipPath(long __this__nativeId);

/**
Returns the currently set clip region. Note that the clip region is given in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setClipRegion(com.trolltech.qt.gui.QRegion) setClipRegion()}, {@link com.trolltech.qt.gui.QPainter#clipPath() clipPath()}, and {@link com.trolltech.qt.gui.QPainter#setClipping(boolean) setClipping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion clipRegion()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipRegion(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_clipRegion(long __this__nativeId);

/**
Returns the transformation matrix combining the current window/viewport and world transformation. <p>It is advisable to use {@link com.trolltech.qt.gui.QPainter#combinedTransform() combinedTransform()} instead of this function to preserve the properties of perspective transformations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, {@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()}, and {@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix combinedMatrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_combinedMatrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_combinedMatrix(long __this__nativeId);

/**
Returns the transformation matrix combining the current window/viewport and world transformation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, {@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()}, and {@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform combinedTransform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_combinedTransform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_combinedTransform(long __this__nativeId);

/**
Returns the current composition mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter.CompositionMode CompositionMode }, and {@link com.trolltech.qt.gui.QPainter#setCompositionMode(com.trolltech.qt.gui.QPainter.CompositionMode) setCompositionMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter.CompositionMode compositionMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPainter.CompositionMode.resolve(__qt_compositionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_compositionMode(long __this__nativeId);

/**
Returns the paint device on which this painter is currently painting, or 0 if the painter is not active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPaintDeviceInterface device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintDeviceInterface __qt_device(long __this__nativeId);

/**
Returns the matrix that transforms from logical coordinates to device coordinates of the platform dependent paint device. <p><b>Note:</b> It is advisable to use {@link com.trolltech.qt.gui.QPainter#deviceTransform() deviceTransform()} instead of this function to preserve the properties of perspective transformations. <p>This function is only needed when using platform painting commands on the platform dependent handle (Qt::HANDLE), and the platform does not do transformations nativly. <p>The {@link com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature QPaintEngine::PaintEngineFeature } enum can be queried to determine whether the platform performs the transformations or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}, and {@link com.trolltech.qt.gui.QPaintEngine#hasFeature(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature[]) QPaintEngine::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix deviceMatrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceMatrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_deviceMatrix(long __this__nativeId);

/**
Returns the matrix that transforms from logical coordinates to device coordinates of the platform dependent paint device. <p>This function is only needed when using platform painting commands on the platform dependent handle (Qt::HANDLE), and the platform does not do transformations nativly. <p>The {@link com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature QPaintEngine::PaintEngineFeature } enum can be queried to determine whether the platform performs the transformations or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldTransform() worldTransform()}, and {@link com.trolltech.qt.gui.QPaintEngine#hasFeature(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature[]) QPaintEngine::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform deviceTransform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceTransform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_deviceTransform(long __this__nativeId);

    @QtBlockedSlot
    public final void drawArc(com.trolltech.qt.core.QRect arg__1, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawArc_QRect_int_int(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawArc_QRect_int_int(long __this__nativeId, long arg__1, int a, int alen);

/**
Draws the arc defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and <tt>spanAngle</tt>. <p>The <tt>startAngle</tt> and <tt>spanAngle</tt> must be specified in 1/16th of a degree, i.e. a full circle equals 5760 (16 * 360). Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-arc.png"></center><br></td><td> <pre class="snippet">
    QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);
    int startAngle = 30 * 16;
    int spanAngle = 120 * 16;

    QPainter painter = new QPainter(this);
    painter.drawArc(rectangle, startAngle, spanAngle);
    painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPie(com.trolltech.qt.core.QRect, int, int) drawPie()}, {@link com.trolltech.qt.gui.QPainter#drawChord(com.trolltech.qt.core.QRect, int, int) drawChord()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the arc defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawArc(com.trolltech.qt.core.QRectF rect, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawArc_QRectF_int_int(nativeId(), rect == null ? 0 : rect.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawArc_QRectF_int_int(long __this__nativeId, long rect, int a, int alen);

/**
This is an overloaded member function, provided for convenience. <p>Draws the arc defined by the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the specified <tt>width</tt> and <tt>height</tt>, and the given <tt>startAngle</tt> and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawArc(int x, int y, int w, int h, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawArc_int_int_int_int_int_int(nativeId(), x, y, w, h, a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawArc_int_int_int_int_int_int(long __this__nativeId, int x, int y, int w, int h, int a, int alen);

    @QtBlockedSlot
    public final void drawChord(com.trolltech.qt.core.QRect arg__1, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawChord_QRect_int_int(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawChord_QRect_int_int(long __this__nativeId, long arg__1, int a, int alen);

/**
Draws the chord defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and <tt>spanAngle</tt>. The chord is filled with the current {@link com.trolltech.qt.gui.QPainter#brush() brush()}. <p>The startAngle and spanAngle must be specified in 1/16th of a degree, i.e. a full circle equals 5760 (16 * 360). Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-chord.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);
        int startAngle = 30 * 16;
        int spanAngle = 120 * 16;

        QPainter painter = new QPainter(this);
        painter.drawChord(rectangle, startAngle, spanAngle);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawArc(com.trolltech.qt.core.QRect, int, int) drawArc()}, {@link com.trolltech.qt.gui.QPainter#drawPie(com.trolltech.qt.core.QRect, int, int) drawPie()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the chord defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawChord(com.trolltech.qt.core.QRectF rect, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawChord_QRectF_int_int(nativeId(), rect == null ? 0 : rect.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawChord_QRectF_int_int(long __this__nativeId, long rect, int a, int alen);

/**
This is an overloaded member function, provided for convenience. <p>Draws the chord defined by the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the specified <tt>width</tt> and <tt>height</tt>, and the given <tt>startAngle</tt> and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawChord(int x, int y, int w, int h, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawChord_int_int_int_int_int_int(nativeId(), x, y, w, h, a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawChord_int_int_int_int_int_int(long __this__nativeId, int x, int y, int w, int h, int a, int alen);

/**
This is an overloaded member function, provided for convenience. <p>Draws the convex polygon defined by <tt>polygon</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawConvexPolygon(com.trolltech.qt.gui.QPolygon polygon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawConvexPolygon_QPolygon(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawConvexPolygon_QPolygon(long __this__nativeId, long polygon);

/**
This is an overloaded member function, provided for convenience. <p>Draws the convex polygon defined by <tt>polygon</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawConvexPolygon(com.trolltech.qt.gui.QPolygonF polygon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawConvexPolygon_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawConvexPolygon_QPolygonF(long __this__nativeId, long polygon);

/**
This is an overloaded member function, provided for convenience. <p>Draws the ellipse positioned at <tt>center</tt> with radii <tt>rx</tt> and <tt>ry</tt>.
*/

    @QtBlockedSlot
    public final void drawEllipse(com.trolltech.qt.core.QPoint center, int rx, int ry)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QPoint_int_int(nativeId(), center == null ? 0 : center.nativeId(), rx, ry);
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QPoint_int_int(long __this__nativeId, long center, int rx, int ry);

/**
This is an overloaded member function, provided for convenience. <p>Draws the ellipse positioned at <tt>center</tt> with radii <tt>rx</tt> and <tt>ry</tt>.
*/

    @QtBlockedSlot
    public final void drawEllipse(com.trolltech.qt.core.QPointF center, double rx, double ry)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QPointF_double_double(nativeId(), center == null ? 0 : center.nativeId(), rx, ry);
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QPointF_double_double(long __this__nativeId, long center, double rx, double ry);

/**
This is an overloaded member function, provided for convenience. <p>Draws the ellipse defined by the given <tt>rectangle</tt>.
*/

    @QtBlockedSlot
    public final void drawEllipse(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QRect(long __this__nativeId, long r);

/**
Draws the ellipse defined by the given <tt>rectangle</tt>. <p>A filled ellipse has a size of <tt>rectangle</tt>.{@link com.trolltech.qt.core.QRect#size() size()}. A stroked ellipse has a size of <tt>rectangle</tt>.{@link com.trolltech.qt.core.QRect#size() size()} plus the pen width. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-ellipse.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);

        QPainter painter = new QPainter(this);
        painter.drawEllipse(rectangle);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPie(com.trolltech.qt.core.QRect, int, int) drawPie()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawEllipse(com.trolltech.qt.core.QRectF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QRectF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QRectF(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience. <p>Draws the ellipse defined by the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void drawEllipse(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QPoint_QImage(nativeId(), p == null ? 0 : p.nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QPoint_QImage(long __this__nativeId, long p, long image);


    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sr, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(p, image, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sr) {
        drawImage(p, image, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sr, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QPoint_QImage_QRect_ImageConversionFlags(nativeId(), p == null ? 0 : p.nativeId(), image == null ? 0 : image.nativeId(), sr == null ? 0 : sr.nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QPoint_QImage_QRect_ImageConversionFlags(long __this__nativeId, long p, long image, long sr, int flags);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>image</tt> at the given <tt>point</tt>.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>image</tt> at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QPointF_QImage(nativeId(), p == null ? 0 : p.nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QPointF_QImage(long __this__nativeId, long p, long image);


/**
This is an overloaded method provided for convenience.
*/

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sr, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(p, image, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sr) {
        drawImage(p, image, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> with its origin at the given <tt>point</tt>.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sr, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QPointF_QImage_QRectF_ImageConversionFlags(nativeId(), p == null ? 0 : p.nativeId(), image == null ? 0 : image.nativeId(), sr == null ? 0 : sr.nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QPointF_QImage_QRectF_ImageConversionFlags(long __this__nativeId, long p, long image, long sr, int flags);

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRect r, com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QRect_QImage(nativeId(), r == null ? 0 : r.nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QRect_QImage(long __this__nativeId, long r, long image);


    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRect targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sourceRect, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(targetRect, image, sourceRect, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> into the <tt>target</tt> rectangle in the paint device. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRect targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sourceRect) {
        drawImage(targetRect, image, sourceRect, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRect targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRect sourceRect, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QRect_QImage_QRect_ImageConversionFlags(nativeId(), targetRect == null ? 0 : targetRect.nativeId(), image == null ? 0 : image.nativeId(), sourceRect == null ? 0 : sourceRect.nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QRect_QImage_QRect_ImageConversionFlags(long __this__nativeId, long targetRect, long image, long sourceRect, int flags);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>image</tt> into the given <tt>rectangle</tt>. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>image</tt> into the given <tt>rectangle</tt>. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QRectF_QImage(nativeId(), r == null ? 0 : r.nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QRectF_QImage(long __this__nativeId, long r, long image);


/**
This is an overloaded method provided for convenience.
*/

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sourceRect, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(targetRect, image, sourceRect, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> into the <tt>target</tt> rectangle in the paint device. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to specify how you would prefer this to happen. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet">
    QRectF target = new QRectF(10.0, 20.0, 80.0, 60.0);
    QRectF source = new QRectF(0.0, 0.0, 70.0, 40.0);
    QImage image = new QImage("classpath:/images/myImage.png");

    QPainter painter = new QPainter(this);
    painter.drawImage(target, image, source);
    painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sourceRect) {
        drawImage(targetRect, image, sourceRect, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> into the <tt>target</tt> rectangle in the paint device. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to specify how you would prefer this to happen. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet">
    QRectF target = new QRectF(10.0, 20.0, 80.0, 60.0);
    QRectF source = new QRectF(0.0, 0.0, 70.0, 40.0);
    QImage image = new QImage("classpath:/images/myImage.png");

    QPainter painter = new QPainter(this);
    painter.drawImage(target, image, source);
    painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>image</tt> into the <tt>target</tt> rectangle in the paint device. <p><b>Note:</b> The image is scaled to fit the rectangle, if both the image and rectangle size disagree.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF targetRect, com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.QRectF sourceRect, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QRectF_QImage_QRectF_ImageConversionFlags(nativeId(), targetRect == null ? 0 : targetRect.nativeId(), image == null ? 0 : image.nativeId(), sourceRect == null ? 0 : sourceRect.nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QRectF_QImage_QRectF_ImageConversionFlags(long __this__nativeId, long targetRect, long image, long sourceRect, int flags);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx, int sy, int sw, int sh, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(x, y, image, sx, sy, sw, sh, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx, int sy, int sw, int sh) {
        drawImage(x, y, image, sx, sy, sw, sh, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx, int sy, int sw) {
        drawImage(x, y, image, sx, sy, sw, (int)-1, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx, int sy) {
        drawImage(x, y, image, sx, sy, (int)-1, (int)-1, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx) {
        drawImage(x, y, image, sx, (int)0, (int)-1, (int)-1, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image) {
        drawImage(x, y, image, (int)0, (int)0, (int)-1, (int)-1, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws an image at (<tt>x</tt>, <tt>y</tt>) by copying a part of <tt>image</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>image</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the image that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the image.
*/

    @QtBlockedSlot
    public final void drawImage(int x, int y, com.trolltech.qt.gui.QImage image, int sx, int sy, int sw, int sh, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_int_int_QImage_int_int_int_int_ImageConversionFlags(nativeId(), x, y, image == null ? 0 : image.nativeId(), sx, sy, sw, sh, flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_int_int_QImage_int_int_int_int_ImageConversionFlags(long __this__nativeId, int x, int y, long image, int sx, int sy, int sw, int sh, int flags);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line defined by <tt>line</tt>.
*/

    @QtBlockedSlot
    public final void drawLine(com.trolltech.qt.gui.QLine line)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLine_QLine(nativeId(), line == null ? 0 : line.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawLine_QLine(long __this__nativeId, long line);

/**
Draws a line defined by <tt>line</tt>. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-line.png"></center><br></td><td> <pre class="snippet">
    QLineF line = new QLineF(10.0, 80.0, 90.0, 20.0);

    QPainter painter = new QPainter(this);
    painter.drawLine(line);
    painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawLines(java.util.List) drawLines()}, {@link com.trolltech.qt.gui.QPainter#drawPolyline(com.trolltech.qt.gui.QPolygon) drawPolyline()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawLine(com.trolltech.qt.gui.QLineF line)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLine_QLineF(nativeId(), line == null ? 0 : line.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawLine_QLineF(long __this__nativeId, long line);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line from <tt>p1</tt> to <tt>p2</tt>.
*/

    @QtBlockedSlot
    public final void drawLine(com.trolltech.qt.core.QPoint p1, com.trolltech.qt.core.QPoint p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLine_QPoint_QPoint(nativeId(), p1 == null ? 0 : p1.nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawLine_QPoint_QPoint(long __this__nativeId, long p1, long p2);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line from <tt>p1</tt> to <tt>p2</tt>.
*/

    @QtBlockedSlot
    public final void drawLine(com.trolltech.qt.core.QPointF p1, com.trolltech.qt.core.QPointF p2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLine_QPointF_QPointF(nativeId(), p1 == null ? 0 : p1.nativeId(), p2 == null ? 0 : p2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawLine_QPointF_QPointF(long __this__nativeId, long p1, long p2);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line from (<tt>x1</tt>, <tt>y1</tt>) to (<tt>x2</tt>, <tt>y2</tt>) and sets the current pen position to (<tt>x2</tt>, <tt>y2</tt>).
*/

    @QtBlockedSlot
    public final void drawLine(int x1, int y1, int x2, int y2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLine_int_int_int_int(nativeId(), x1, y1, x2, y2);
    }
    @QtBlockedSlot
    native void __qt_drawLine_int_int_int_int(long __this__nativeId, int x1, int y1, int x2, int y2);

/**
This is an overloaded member function, provided for convenience. <p>Draws the set of lines defined by the list <tt>lines</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawLines(java.util.List<com.trolltech.qt.gui.QLine> lines)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLines_List(nativeId(), lines);
    }
    @QtBlockedSlot
    native void __qt_drawLines_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QLine> lines);

/**
This is an overloaded member function, provided for convenience. <p>Draws the set of lines defined by the list <tt>lines</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawLinesF(java.util.List<com.trolltech.qt.gui.QLineF> lines)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLinesF_List(nativeId(), lines);
    }
    @QtBlockedSlot
    native void __qt_drawLinesF_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QLineF> lines);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line for each pair of points in the vector <tt>pointPairs</tt> using the current pen.
*/

    @QtBlockedSlot
    public final void drawLinesFromPoints(java.util.List<com.trolltech.qt.core.QPoint> pointPairs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLinesFromPoints_List(nativeId(), pointPairs);
    }
    @QtBlockedSlot
    native void __qt_drawLinesFromPoints_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QPoint> pointPairs);

/**
This is an overloaded member function, provided for convenience. <p>Draws a line for each pair of points in the vector <tt>pointPairs</tt> using the current pen. If there is an odd number of points in the array, the last point will be ignored.
*/

    @QtBlockedSlot
    public final void drawLinesFromPointsF(java.util.List<com.trolltech.qt.core.QPointF> pointPairs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLinesFromPointsF_List(nativeId(), pointPairs);
    }
    @QtBlockedSlot
    native void __qt_drawLinesFromPointsF_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QPointF> pointPairs);

/**
Draws the given painter <tt>path</tt> using the current pen for outline and the current brush for filling. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-path.png"></center><br></td><td> <pre class="snippet">
    QPainterPath path = new QPainterPath();
    path.moveTo(20, 80);
    path.lineTo(20, 30);
    path.cubicTo(80, 0, 50, 50, 80, 80);

    QPainter painter = new QPainter(this);
    painter.drawPath(path);
    painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link <a href="../painting-painterpaths.html">the Painter Paths example</a>}, and {@link <a href="../qtjambi-deform.html">the Vector Deformation demo</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawPath(com.trolltech.qt.gui.QPainterPath path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPath_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPath_QPainterPath(long __this__nativeId, long path);

    @QtBlockedSlot
    public final void drawPicture(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QPicture picture)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPicture_QPoint_QPicture(nativeId(), p == null ? 0 : p.nativeId(), picture == null ? 0 : picture.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPicture_QPoint_QPicture(long __this__nativeId, long p, long picture);

/**
Replays the given <tt>picture</tt> at the given <tt>point</tt>. <p>The {@link com.trolltech.qt.gui.QPicture QPicture} class is a paint device that records and replays QPainter commands. A picture serializes the painter commands to an IO device in a platform-independent format. Everything that can be painted on a widget or pixmap can also be stored in a picture. <p>This function does exactly the same as {@link com.trolltech.qt.gui.QPicture#play(com.trolltech.qt.gui.QPainter) QPicture::play()} when called with <tt>point</tt> = {@link com.trolltech.qt.core.QPoint QPoint}(0, 0). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet">
        QPicture picture = new QPicture();
        picture.load("drawing.pic");

        QPainter painter = new QPainter(this);
        painter.drawPicture(0, 0, picture);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPicture#play(com.trolltech.qt.gui.QPainter) QPicture::play()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Replays the given <tt>picture</tt> at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawPicture(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPicture picture)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPicture_QPointF_QPicture(nativeId(), p == null ? 0 : p.nativeId(), picture == null ? 0 : picture.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPicture_QPointF_QPicture(long __this__nativeId, long p, long picture);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>picture</tt> at point (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void drawPicture(int x, int y, com.trolltech.qt.gui.QPicture picture)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPicture_int_int_QPicture(nativeId(), x, y, picture == null ? 0 : picture.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPicture_int_int_QPicture(long __this__nativeId, int x, int y, long picture);

    @QtBlockedSlot
    public final void drawPie(com.trolltech.qt.core.QRect arg__1, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPie_QRect_int_int(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawPie_QRect_int_int(long __this__nativeId, long arg__1, int a, int alen);

/**
Draws a pie defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and and <tt>spanAngle</tt>. <p>The pie is filled with the current {@link com.trolltech.qt.gui.QPainter#brush() brush()}. <p>The startAngle and spanAngle must be specified in 1/16th of a degree, i.e. a full circle equals 5760 (16 * 360). Positive values for the angles mean counter-clockwise while negative values mean the clockwise direction. Zero degrees is at the 3 o'clock position. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-pie.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);
        int startAngle = 30 * 16;
        int spanAngle = 120 * 16;

        QPainter painter = new QPainter(this);
        painter.drawPie(rectangle, startAngle, spanAngle);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawEllipse(com.trolltech.qt.core.QPoint, int, int) drawEllipse()}, {@link com.trolltech.qt.gui.QPainter#drawChord(com.trolltech.qt.core.QRect, int, int) drawChord()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws a pie defined by the given <tt>rectangle</tt>, <tt>startAngle</tt> and and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawPie(com.trolltech.qt.core.QRectF rect, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPie_QRectF_int_int(nativeId(), rect == null ? 0 : rect.nativeId(), a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawPie_QRectF_int_int(long __this__nativeId, long rect, int a, int alen);

/**
This is an overloaded member function, provided for convenience. <p>Draws the pie defined by the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the specified <tt>width</tt> and <tt>height</tt>, and the given <tt>startAngle</tt> and <tt>spanAngle</tt>.
*/

    @QtBlockedSlot
    public final void drawPie(int x, int y, int w, int h, int a, int alen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPie_int_int_int_int_int_int(nativeId(), x, y, w, h, a, alen);
    }
    @QtBlockedSlot
    native void __qt_drawPie_int_int_int_int_int_int(long __this__nativeId, int x, int y, int w, int h, int a, int alen);

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QPixmap pm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QPoint_QPixmap(nativeId(), p == null ? 0 : p.nativeId(), pm == null ? 0 : pm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QPoint_QPixmap(long __this__nativeId, long p, long pm);

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>pixmap</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QPixmap pm, com.trolltech.qt.core.QRect sr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QPoint_QPixmap_QRect(nativeId(), p == null ? 0 : p.nativeId(), pm == null ? 0 : pm.nativeId(), sr == null ? 0 : sr.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QPoint_QPixmap_QRect(long __this__nativeId, long p, long pm, long sr);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>pixmap</tt> with its origin at the given <tt>point</tt>.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>pixmap</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPixmap pm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QPointF_QPixmap(nativeId(), p == null ? 0 : p.nativeId(), pm == null ? 0 : pm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QPointF_QPixmap(long __this__nativeId, long p, long pm);

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>pixmap</tt> with its origin at the given <tt>point</tt>.
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPixmap pm, com.trolltech.qt.core.QRectF sr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QPointF_QPixmap_QRectF(nativeId(), p == null ? 0 : p.nativeId(), pm == null ? 0 : pm.nativeId(), sr == null ? 0 : sr.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QPointF_QPixmap_QRectF(long __this__nativeId, long p, long pm, long sr);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>pixmap</tt> into the given <tt>rectangle</tt>. <p><b>Note:</b> The pixmap is scaled to fit the rectangle, if both the pixmap and rectangle size disagree.
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QRect r, com.trolltech.qt.gui.QPixmap pm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QRect_QPixmap(nativeId(), r == null ? 0 : r.nativeId(), pm == null ? 0 : pm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QRect_QPixmap(long __this__nativeId, long r, long pm);

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion <tt>source</tt> of the given <tt>pixmap</tt> into the given <tt>target</tt> in the paint device. <p><b>Note:</b> The pixmap is scaled to fit the rectangle, if both the pixmap and rectangle size disagree.
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QRect targetRect, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.QRect sourceRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QRect_QPixmap_QRect(nativeId(), targetRect == null ? 0 : targetRect.nativeId(), pixmap == null ? 0 : pixmap.nativeId(), sourceRect == null ? 0 : sourceRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QRect_QPixmap_QRect(long __this__nativeId, long targetRect, long pixmap, long sourceRect);

/**
Draws the rectangular portion <tt>source</tt> of the given <tt>pixmap</tt> into the given <tt>target</tt> in the paint device. <p><b>Note:</b> The pixmap is scaled to fit the rectangle, if both the pixmap and rectangle size disagree. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet">
    QRectF target = new QRectF(10.0, 20.0, 80.0, 60.0);
    QRectF source = new QRectF(0.0, 0.0, 70.0, 40.0);
    QPixmap pixmap = new QPixmap("classpath:myPixmap.png");

    QPainter painter = new QPainter(this);
    painter.drawPixmap(target, pixmap, source);
    painter.end();
</pre></td></tr></table> If <tt>pixmap</tt> is a {@link com.trolltech.qt.gui.QBitmap QBitmap} it is drawn with the bits that are "set" using the pens color. If backgroundMode is {@link com.trolltech.qt.core.Qt.BGMode Qt::OpaqueMode }, the "unset" bits are drawn using the color of the background brush; if backgroundMode is {@link com.trolltech.qt.core.Qt.BGMode Qt::TransparentMode }, the "unset" bits are transparent. Drawing bitmaps with gradient or texture colors is not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawImage(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QImage) drawImage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawPixmap(com.trolltech.qt.core.QRectF targetRect, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.QRectF sourceRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_QRectF_QPixmap_QRectF(nativeId(), targetRect == null ? 0 : targetRect.nativeId(), pixmap == null ? 0 : pixmap.nativeId(), sourceRect == null ? 0 : sourceRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_QRectF_QPixmap_QRectF(long __this__nativeId, long targetRect, long pixmap, long sourceRect);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>pixmap</tt> at position (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void drawPixmap(int x, int y, com.trolltech.qt.gui.QPixmap pm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_int_int_QPixmap(nativeId(), x, y, pm == null ? 0 : pm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_int_int_QPixmap(long __this__nativeId, int x, int y, long pm);

/**
This is an overloaded member function, provided for convenience. <p>Draws a pixmap at (<tt>x</tt>, <tt>y</tt>) by copying a part of the given <tt>pixmap</tt> into the paint device. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in <tt>pixmap</tt> that is to be drawn. The default is (0, 0). <p>(<tt>sw</tt>, <tt>sh</tt>) specifies the size of the pixmap that is to be drawn. The default, (0, 0) (and negative) means all the way to the bottom-right of the pixmap.
*/

    @QtBlockedSlot
    public final void drawPixmap(int x, int y, com.trolltech.qt.gui.QPixmap pm, int sx, int sy, int sw, int sh)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_int_int_QPixmap_int_int_int_int(nativeId(), x, y, pm == null ? 0 : pm.nativeId(), sx, sy, sw, sh);
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_int_int_QPixmap_int_int_int_int(long __this__nativeId, int x, int y, long pm, int sx, int sy, int sw, int sh);

/**
This is an overloaded member function, provided for convenience. <p>Draws the <tt>pixmap</tt> into the rectangle at position (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void drawPixmap(int x, int y, int w, int h, com.trolltech.qt.gui.QPixmap pm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_int_int_int_int_QPixmap(nativeId(), x, y, w, h, pm == null ? 0 : pm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_int_int_int_int_QPixmap(long __this__nativeId, int x, int y, int w, int h, long pm);

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangular portion with the origin (<tt>sx</tt>, <tt>sy</tt>), width <tt>sw</tt> and height <tt>sh</tt>, of the given <tt>pixmap</tt> , at the point (<tt>x</tt>, <tt>y</tt>), with a width of <tt>w</tt> and a height of <tt>h</tt>. If sw or sh are equal to zero the width/height of the pixmap is used and adjusted by the offset sx/sy;
*/

    @QtBlockedSlot
    public final void drawPixmap(int x, int y, int w, int h, com.trolltech.qt.gui.QPixmap pm, int sx, int sy, int sw, int sh)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPixmap_int_int_int_int_QPixmap_int_int_int_int(nativeId(), x, y, w, h, pm == null ? 0 : pm.nativeId(), sx, sy, sw, sh);
    }
    @QtBlockedSlot
    native void __qt_drawPixmap_int_int_int_int_QPixmap_int_int_int_int(long __this__nativeId, int x, int y, int w, int h, long pm, int sx, int sy, int sw, int sh);

/**
This is an overloaded member function, provided for convenience. <p>Draws a single point at the given <tt>position</tt> using the current pen's color.
*/

    @QtBlockedSlot
    public final void drawPoint(com.trolltech.qt.core.QPoint p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoint_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPoint_QPoint(long __this__nativeId, long p);

/**
Draws a single point at the given <tt>position</tt> using the current pen's color. <p><DT><b>See also:</b><br><DD>{@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawPoint(com.trolltech.qt.core.QPointF pt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoint_QPointF(nativeId(), pt == null ? 0 : pt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPoint_QPointF(long __this__nativeId, long pt);

/**
This is an overloaded member function, provided for convenience. <p>Draws a single point at position (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void drawPoint(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoint_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_drawPoint_int_int(long __this__nativeId, int x, int y);

/**
This is an overloaded member function, provided for convenience. <p>Draws the points in the vector <tt>points</tt>.
*/

    @QtBlockedSlot
    public final void drawPoints(com.trolltech.qt.gui.QPolygon points)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoints_QPolygon(nativeId(), points == null ? 0 : points.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPoints_QPolygon(long __this__nativeId, long points);

/**
This is an overloaded member function, provided for convenience. <p>Draws the points in the vector <tt>points</tt>.
*/

    @QtBlockedSlot
    public final void drawPoints(com.trolltech.qt.gui.QPolygonF points)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoints_QPolygonF(nativeId(), points == null ? 0 : points.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPoints_QPolygonF(long __this__nativeId, long points);


/**
This is an overloaded member function, provided for convenience. <p>Draws the polygon defined by the given <tt>points</tt> using the fill rule <tt>fillRule</tt>.
*/

    @QtBlockedSlot
    public final void drawPolygon(com.trolltech.qt.gui.QPolygon polygon) {
        drawPolygon(polygon, com.trolltech.qt.core.Qt.FillRule.OddEvenFill);
    }
    @QtBlockedSlot
    public final void drawPolygon(com.trolltech.qt.gui.QPolygon polygon, com.trolltech.qt.core.Qt.FillRule fillRule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolygon_QPolygon_FillRule(nativeId(), polygon == null ? 0 : polygon.nativeId(), fillRule.value());
    }
    @QtBlockedSlot
    native void __qt_drawPolygon_QPolygon_FillRule(long __this__nativeId, long polygon, int fillRule);


/**
This is an overloaded member function, provided for convenience. <p>Draws the polygon defined by the given <tt>points</tt> using the fill rule <tt>fillRule</tt>.
*/

    @QtBlockedSlot
    public final void drawPolygon(com.trolltech.qt.gui.QPolygonF polygon) {
        drawPolygon(polygon, com.trolltech.qt.core.Qt.FillRule.OddEvenFill);
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws the polygon defined by the given <tt>points</tt> using the fill rule <tt>fillRule</tt>.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the polygon defined by the given <tt>points</tt> using the fill rule <tt>fillRule</tt>.
*/

    @QtBlockedSlot
    public final void drawPolygon(com.trolltech.qt.gui.QPolygonF polygon, com.trolltech.qt.core.Qt.FillRule fillRule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolygon_QPolygonF_FillRule(nativeId(), polygon == null ? 0 : polygon.nativeId(), fillRule.value());
    }
    @QtBlockedSlot
    native void __qt_drawPolygon_QPolygonF_FillRule(long __this__nativeId, long polygon, int fillRule);

/**
This is an overloaded member function, provided for convenience. <p>Draws the polyline defined by the given <tt>points</tt> using the current pen.
*/

    @QtBlockedSlot
    public final void drawPolyline(com.trolltech.qt.gui.QPolygon polygon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolyline_QPolygon(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPolyline_QPolygon(long __this__nativeId, long polygon);

/**
This is an overloaded member function, provided for convenience. <p>Draws the polyline defined by the given <tt>points</tt> using the current pen.
*/

    @QtBlockedSlot
    public final void drawPolyline(com.trolltech.qt.gui.QPolygonF polyline)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolyline_QPolygonF(nativeId(), polyline == null ? 0 : polyline.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPolyline_QPolygonF(long __this__nativeId, long polyline);

/**
This is an overloaded member function, provided for convenience. <p>Draws the current <tt>rectangle</tt> with the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawRect_QRect(long __this__nativeId, long rect);

/**
Draws the current <tt>rectangle</tt> with the current pen and brush. <p>A filled rectangle has a size of <tt>rectangle</tt>.size(). A stroked rectangle has a size of <tt>rectangle</tt>.size() plus the pen width. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-rectangle.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);

        QPainter painter = new QPainter(this);
        painter.drawRect(rectangle);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRects(java.util.List) drawRects()}, {@link com.trolltech.qt.gui.QPainter#drawPolygon(com.trolltech.qt.gui.QPolygon) drawPolygon()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawRect(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRect_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawRect_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>Draws a rectangle with upper left corner at (<tt>x</tt>, <tt>y</tt>) and with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void drawRect(int x1, int y1, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRect_int_int_int_int(nativeId(), x1, y1, w, h);
    }
    @QtBlockedSlot
    native void __qt_drawRect_int_int_int_int(long __this__nativeId, int x1, int y1, int w, int h);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>rectangles</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawRects(java.util.List<com.trolltech.qt.core.QRect> rectangles)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRects_List(nativeId(), rectangles);
    }
    @QtBlockedSlot
    native void __qt_drawRects_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QRect> rectangles);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>rectangles</tt> using the current pen and brush.
*/

    @QtBlockedSlot
    public final void drawRectsF(java.util.List<com.trolltech.qt.core.QRectF> rectangles)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRectsF_List(nativeId(), rectangles);
    }
    @QtBlockedSlot
    native void __qt_drawRectsF_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QRectF> rectangles);


    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRect r, int xround) {
        drawRoundRect(r, xround, (int)25);
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>r</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRect r) {
        drawRoundRect(r, (int)25, (int)25);
    }
    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRect r, int xround, int yround)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundRect_QRect_int_int(nativeId(), r == null ? 0 : r.nativeId(), xround, yround);
    }
    @QtBlockedSlot
    native void __qt_drawRoundRect_QRect_int_int(long __this__nativeId, long r, int xround, int yround);


/**
Draws a rectangle <tt>r</tt> with rounded corners. <p>The <tt>xRnd</tt> and <tt>yRnd</tt> arguments specify how rounded the corners should be. 0 is angled corners, 99 is maximum roundedness. <p>A filled rectangle has a size of r.size(). A stroked rectangle has a size of r.size() plus the pen width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRoundedRect(com.trolltech.qt.core.QRect, double, double) drawRoundedRect()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>r</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRectF r, int xround) {
        drawRoundRect(r, xround, (int)25);
    }

/**
Draws a rectangle <tt>r</tt> with rounded corners. <p>The <tt>xRnd</tt> and <tt>yRnd</tt> arguments specify how rounded the corners should be. 0 is angled corners, 99 is maximum roundedness. <p>A filled rectangle has a size of r.size(). A stroked rectangle has a size of r.size() plus the pen width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRoundedRect(com.trolltech.qt.core.QRect, double, double) drawRoundedRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRectF r) {
        drawRoundRect(r, (int)25, (int)25);
    }
/**
Draws a rectangle <tt>r</tt> with rounded corners. <p>The <tt>xRnd</tt> and <tt>yRnd</tt> arguments specify how rounded the corners should be. 0 is angled corners, 99 is maximum roundedness. <p>A filled rectangle has a size of r.size(). A stroked rectangle has a size of r.size() plus the pen width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRoundedRect(com.trolltech.qt.core.QRect, double, double) drawRoundedRect()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>r</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(com.trolltech.qt.core.QRectF r, int xround, int yround)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundRect_QRectF_int_int(nativeId(), r == null ? 0 : r.nativeId(), xround, yround);
    }
    @QtBlockedSlot
    native void __qt_drawRoundRect_QRectF_int_int(long __this__nativeId, long r, int xround, int yround);


/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(int x, int y, int w, int h, int arg__5) {
        drawRoundRect(x, y, w, h, arg__5, (int)25);
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(int x, int y, int w, int h) {
        drawRoundRect(x, y, w, h, (int)25, (int)25);
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws the rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundRect(int x, int y, int w, int h, int arg__5, int arg__6)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundRect_int_int_int_int_int_int(nativeId(), x, y, w, h, arg__5, arg__6);
    }
    @QtBlockedSlot
    native void __qt_drawRoundRect_int_int_int_int_int_int(long __this__nativeId, int x, int y, int w, int h, int arg__5, int arg__6);


    @QtBlockedSlot
    public final void drawRoundedRect(com.trolltech.qt.core.QRect rect, double xRadius, double yRadius) {
        drawRoundedRect(rect, xRadius, yRadius, com.trolltech.qt.core.Qt.SizeMode.AbsoluteSize);
    }
    @QtBlockedSlot
    public final void drawRoundedRect(com.trolltech.qt.core.QRect rect, double xRadius, double yRadius, com.trolltech.qt.core.Qt.SizeMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundedRect_QRect_double_double_SizeMode(nativeId(), rect == null ? 0 : rect.nativeId(), xRadius, yRadius, mode.value());
    }
    @QtBlockedSlot
    native void __qt_drawRoundedRect_QRect_double_double_SizeMode(long __this__nativeId, long rect, double xRadius, double yRadius, int mode);


/**
Draws the given rectangle <tt>rect</tt> with rounded corners. <p>The <tt>xRadius</tt> and <tt>yRadius</tt> arguments specify the radii of the ellipses defining the corners of the rounded rectangle. When <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.SizeMode Qt::RelativeSize }, <tt>xRadius</tt> and <tt>yRadius</tt> are specified in percentage of half the rectangle's width and height respectively, and should be in the range 0.0 to 100.0. <p>A filled rectangle has a size of rect.size(). A stroked rectangle has a size of rect.size() plus the pen width. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-roundrect.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);

        QPainter painter = new QPainter(this);
        painter.drawRoundedRect(rectangle, 20.0, 15.0);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRect(com.trolltech.qt.core.QRect) drawRect()}, and {@link com.trolltech.qt.gui.QPen QPen}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given rectangle <tt>rect</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundedRect(com.trolltech.qt.core.QRectF rect, double xRadius, double yRadius) {
        drawRoundedRect(rect, xRadius, yRadius, com.trolltech.qt.core.Qt.SizeMode.AbsoluteSize);
    }
/**
Draws the given rectangle <tt>rect</tt> with rounded corners. <p>The <tt>xRadius</tt> and <tt>yRadius</tt> arguments specify the radii of the ellipses defining the corners of the rounded rectangle. When <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.SizeMode Qt::RelativeSize }, <tt>xRadius</tt> and <tt>yRadius</tt> are specified in percentage of half the rectangle's width and height respectively, and should be in the range 0.0 to 100.0. <p>A filled rectangle has a size of rect.size(). A stroked rectangle has a size of rect.size() plus the pen width. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpainter-roundrect.png"></center><br></td><td> <pre class="snippet">
        QRectF rectangle = new QRectF(10.0, 20.0, 80.0, 60.0);

        QPainter painter = new QPainter(this);
        painter.drawRoundedRect(rectangle, 20.0, 15.0);
        painter.end();
</pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRect(com.trolltech.qt.core.QRect) drawRect()}, and {@link com.trolltech.qt.gui.QPen QPen}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given rectangle <tt>rect</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundedRect(com.trolltech.qt.core.QRectF rect, double xRadius, double yRadius, com.trolltech.qt.core.Qt.SizeMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundedRect_QRectF_double_double_SizeMode(nativeId(), rect == null ? 0 : rect.nativeId(), xRadius, yRadius, mode.value());
    }
    @QtBlockedSlot
    native void __qt_drawRoundedRect_QRectF_double_double_SizeMode(long __this__nativeId, long rect, double xRadius, double yRadius, int mode);


/**
This is an overloaded member function, provided for convenience. <p>Draws the given rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundedRect(int x, int y, int w, int h, double xRadius, double yRadius) {
        drawRoundedRect(x, y, w, h, xRadius, yRadius, com.trolltech.qt.core.Qt.SizeMode.AbsoluteSize);
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws the given rectangle <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt> with rounded corners.
*/

    @QtBlockedSlot
    public final void drawRoundedRect(int x, int y, int w, int h, double xRadius, double yRadius, com.trolltech.qt.core.Qt.SizeMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRoundedRect_int_int_int_int_double_double_SizeMode(nativeId(), x, y, w, h, xRadius, yRadius, mode.value());
    }
    @QtBlockedSlot
    native void __qt_drawRoundedRect_int_int_int_int_double_double_SizeMode(long __this__nativeId, int x, int y, int w, int h, double xRadius, double yRadius, int mode);

    @QtBlockedSlot
    public final void drawText(com.trolltech.qt.core.QPoint p, java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_QPoint_String(nativeId(), p == null ? 0 : p.nativeId(), s);
    }
    @QtBlockedSlot
    native void __qt_drawText_QPoint_String(long __this__nativeId, long p, java.lang.String s);

/**
Draws the given <tt>text</tt> with the currently defined text direction, beginning at the given <tt>position</tt>. <p>This function does not handle the newline character (\n), as it cannot break text into multiple lines, and it cannot display the newline character. Use the {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) QPainter::drawText()} overload that takes a rectangle instead if you want to draw multiple lines of text with the newline character, or if you want the text to be wrapped. <p>By default, QPainter draws text anti-aliased. <p><b>Note:</b> The y-position is used as the baseline of the font.
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>text</tt> with the currently defined text direction, beginning at the given <tt>position</tt>. <p>By default, QPainter draws text anti-aliased. <p><b>Note:</b> The y-position is used as the baseline of the font.
*/

    @QtBlockedSlot
    public final void drawText(com.trolltech.qt.core.QPointF p, java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_QPointF_String(nativeId(), p == null ? 0 : p.nativeId(), s);
    }
    @QtBlockedSlot
    native void __qt_drawText_QPointF_String(long __this__nativeId, long p, java.lang.String s);

    @QtBlockedSlot
    private final void drawText(com.trolltech.qt.core.QRect r, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_QRect_int_String_nativepointer(nativeId(), r == null ? 0 : r.nativeId(), flags, text, br);
    }
    @QtBlockedSlot
    native void __qt_drawText_QRect_int_String_nativepointer(long __this__nativeId, long r, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br);


/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>text</tt> in the <tt>rectangle</tt> specified using the <tt>option</tt> to control its positioning and orientation. <p>By default, QPainter draws text anti-aliased. <p><b>Note:</b> The y-coordinate of <tt>rectangle</tt> is used as the top of the font.
*/

    @QtBlockedSlot
    public final void drawText(com.trolltech.qt.core.QRectF r, java.lang.String text) {
        drawText(r, text, (com.trolltech.qt.gui.QTextOption)new com.trolltech.qt.gui.QTextOption());
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>text</tt> in the <tt>rectangle</tt> specified using the <tt>option</tt> to control its positioning and orientation. <p>By default, QPainter draws text anti-aliased. <p><b>Note:</b> The y-coordinate of <tt>rectangle</tt> is used as the top of the font.
*/

    @QtBlockedSlot
    public final void drawText(com.trolltech.qt.core.QRectF r, java.lang.String text, com.trolltech.qt.gui.QTextOption o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_QRectF_String_QTextOption(nativeId(), r == null ? 0 : r.nativeId(), text, o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawText_QRectF_String_QTextOption(long __this__nativeId, long r, java.lang.String text, long o);

    @QtBlockedSlot
    private final void drawText(com.trolltech.qt.core.QRectF r, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_QRectF_int_String_nativepointer(nativeId(), r == null ? 0 : r.nativeId(), flags, text, br);
    }
    @QtBlockedSlot
    native void __qt_drawText_QRectF_int_String_nativepointer(long __this__nativeId, long r, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br);

/**
This is an overloaded member function, provided for convenience. <p>Draws the given <tt>text</tt> at position (<tt>x</tt>, <tt>y</tt>), using the painter's currently defined text direction. <p>By default, QPainter draws text anti-aliased. <p><b>Note:</b> The y-position is used as the baseline of the font.
*/

    @QtBlockedSlot
    public final void drawText(int x, int y, java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_int_int_String(nativeId(), x, y, s);
    }
    @QtBlockedSlot
    native void __qt_drawText_int_int_String(long __this__nativeId, int x, int y, java.lang.String s);

    @QtBlockedSlot
    private final void drawText(int x, int y, int w, int h, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawText_int_int_int_int_int_String_nativepointer(nativeId(), x, y, w, h, flags, text, br);
    }
    @QtBlockedSlot
    native void __qt_drawText_int_int_int_int_int_String_nativepointer(long __this__nativeId, int x, int y, int w, int h, int flags, java.lang.String text, com.trolltech.qt.QNativePointer br);

    @QtBlockedSlot
    public final void drawTextItem(com.trolltech.qt.core.QPoint p, com.trolltech.qt.gui.QTextItem ti)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTextItem_QPoint_QTextItem(nativeId(), p == null ? 0 : p.nativeId(), ti == null ? 0 : ti.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTextItem_QPoint_QTextItem(long __this__nativeId, long p, long ti);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void drawTextItem(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QTextItem ti)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTextItem_QPointF_QTextItem(nativeId(), p == null ? 0 : p.nativeId(), ti == null ? 0 : ti.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTextItem_QPointF_QTextItem(long __this__nativeId, long p, long ti);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void drawTextItem(int x, int y, com.trolltech.qt.gui.QTextItem ti)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTextItem_int_int_QTextItem(nativeId(), x, y, ti == null ? 0 : ti.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTextItem_int_int_QTextItem(long __this__nativeId, int x, int y, long ti);


    @QtBlockedSlot
    public final void drawTiledPixmap(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.gui.QPixmap arg__2) {
        drawTiledPixmap(arg__1, arg__2, (com.trolltech.qt.core.QPoint)new com.trolltech.qt.core.QPoint());
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws a tiled <tt>pixmap</tt>, inside the given <tt>rectangle</tt> with its origin at the given <tt>position</tt>.
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.gui.QPixmap arg__2, com.trolltech.qt.core.QPoint arg__3)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTiledPixmap_QRect_QPixmap_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId(), arg__3 == null ? 0 : arg__3.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTiledPixmap_QRect_QPixmap_QPoint(long __this__nativeId, long arg__1, long arg__2, long arg__3);


/**
Draws a tiled <tt>pixmap</tt>, inside the given <tt>rectangle</tt> with its origin at the given <tt>position</tt>. <p>Calling {@link com.trolltech.qt.gui.QPainter#drawTiledPixmap(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QPixmap) drawTiledPixmap()} is similar to calling {@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()} several times to fill (tile) an area with a pixmap, but is potentially much more efficient depending on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Draws a tiled <tt>pixmap</tt>, inside the given <tt>rectangle</tt> with its origin at the given <tt>position</tt>.
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QPixmap pm) {
        drawTiledPixmap(rect, pm, (com.trolltech.qt.core.QPointF)new com.trolltech.qt.core.QPointF());
    }
/**
Draws a tiled <tt>pixmap</tt>, inside the given <tt>rectangle</tt> with its origin at the given <tt>position</tt>. <p>Calling {@link com.trolltech.qt.gui.QPainter#drawTiledPixmap(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QPixmap) drawTiledPixmap()} is similar to calling {@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()} several times to fill (tile) an area with a pixmap, but is potentially much more efficient depending on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPixmap(com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QPixmap) drawPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QPixmap pm, com.trolltech.qt.core.QPointF offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTiledPixmap_QRectF_QPixmap_QPointF(nativeId(), rect == null ? 0 : rect.nativeId(), pm == null ? 0 : pm.nativeId(), offset == null ? 0 : offset.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTiledPixmap_QRectF_QPixmap_QPointF(long __this__nativeId, long rect, long pm, long offset);


/**
This is an overloaded member function, provided for convenience. <p>Draws a tiled <tt>pixmap</tt> in the specified rectangle. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto; with the given <tt>width</tt> and <tt>height</tt>. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in the <tt>pixmap</tt> that is to be drawn; this defaults to (0, 0).
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(int x, int y, int w, int h, com.trolltech.qt.gui.QPixmap arg__5, int sx) {
        drawTiledPixmap(x, y, w, h, arg__5, sx, (int)0);
    }

/**
This is an overloaded member function, provided for convenience. <p>Draws a tiled <tt>pixmap</tt> in the specified rectangle. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto; with the given <tt>width</tt> and <tt>height</tt>. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in the <tt>pixmap</tt> that is to be drawn; this defaults to (0, 0).
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(int x, int y, int w, int h, com.trolltech.qt.gui.QPixmap arg__5) {
        drawTiledPixmap(x, y, w, h, arg__5, (int)0, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Draws a tiled <tt>pixmap</tt> in the specified rectangle. <p>(<tt>x</tt>, <tt>y</tt>) specifies the top-left point in the paint device that is to be drawn onto; with the given <tt>width</tt> and <tt>height</tt>. (<tt>sx</tt>, <tt>sy</tt>) specifies the top-left point in the <tt>pixmap</tt> that is to be drawn; this defaults to (0, 0).
*/

    @QtBlockedSlot
    public final void drawTiledPixmap(int x, int y, int w, int h, com.trolltech.qt.gui.QPixmap arg__5, int sx, int sy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTiledPixmap_int_int_int_int_QPixmap_int_int(nativeId(), x, y, w, h, arg__5 == null ? 0 : arg__5.nativeId(), sx, sy);
    }
    @QtBlockedSlot
    native void __qt_drawTiledPixmap_int_int_int_int_QPixmap_int_int(long __this__nativeId, int x, int y, int w, int h, long arg__5, int sx, int sy);

/**
Ends painting. Any resources used while painting are released. You don't normally need to call this since it is called by the destructor. <p>Returns true if the painter is no longer active; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and {@link com.trolltech.qt.gui.QPainter#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean end()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_end(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_end(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Erases the area inside the given <tt>rectangle</tt>.
*/

    @QtBlockedSlot
    public final void eraseRect(com.trolltech.qt.core.QRect arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_eraseRect_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_eraseRect_QRect(long __this__nativeId, long arg__1);

/**
Erases the area inside the given <tt>rectangle</tt>. Equivalent to calling <pre class="snippet">
        fillRect(rectangle, background());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#fillRect(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QBrush) fillRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void eraseRect(com.trolltech.qt.core.QRectF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_eraseRect_QRectF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_eraseRect_QRectF(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Erases the area inside the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void eraseRect(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_eraseRect_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_eraseRect_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Fills the given <tt>path</tt> using the given <tt>brush</tt>. The outline is not drawn. <p>Alternatively, you can specify a {@link com.trolltech.qt.gui.QColor QColor} instead of a {@link com.trolltech.qt.gui.QBrush QBrush}; the {@link com.trolltech.qt.gui.QBrush QBrush} constructor (taking a {@link com.trolltech.qt.gui.QColor QColor} argument) will automatically create a solid pattern brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawPath(com.trolltech.qt.gui.QPainterPath) drawPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fillPath(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillPath_QPainterPath_QBrush(nativeId(), path == null ? 0 : path.nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillPath_QPainterPath_QBrush(long __this__nativeId, long path, long brush);

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.gui.QBrush arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRect_QBrush(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRect_QBrush(long __this__nativeId, long arg__1, long arg__2);

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRect_QColor(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRect_QColor(long __this__nativeId, long arg__1, long color);

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRect r, com.trolltech.qt.core.Qt.BrushStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRect_BrushStyle(nativeId(), r == null ? 0 : r.nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRect_BrushStyle(long __this__nativeId, long r, int style);

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRect r, com.trolltech.qt.core.Qt.GlobalColor c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRect_GlobalColor(nativeId(), r == null ? 0 : r.nativeId(), c.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRect_GlobalColor(long __this__nativeId, long r, int c);

/**
Fills the given <tt>rectangle</tt> with the <tt>brush</tt> specified. <p>Alternatively, you can specify a {@link com.trolltech.qt.gui.QColor QColor} instead of a {@link com.trolltech.qt.gui.QBrush QBrush}; the {@link com.trolltech.qt.gui.QBrush QBrush} constructor (taking a {@link com.trolltech.qt.gui.QColor QColor} argument) will automatically create a solid pattern brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#drawRect(com.trolltech.qt.core.QRect) drawRect()}. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the specified <tt>brush</tt>.
*/

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRectF arg__1, com.trolltech.qt.gui.QBrush arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRectF_QBrush(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRectF_QBrush(long __this__nativeId, long arg__1, long arg__2);

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the <tt>color</tt> specified.
*/

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the <tt>color</tt> specified.
*/

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRectF arg__1, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRectF_QColor(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRectF_QColor(long __this__nativeId, long arg__1, long color);

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the brush <tt>style</tt> specified.
*/

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the brush <tt>style</tt> specified.
*/

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRectF r, com.trolltech.qt.core.Qt.BrushStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRectF_BrushStyle(nativeId(), r == null ? 0 : r.nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRectF_BrushStyle(long __this__nativeId, long r, int style);

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the specified <tt>color</tt>.
*/

/**
This is an overloaded member function, provided for convenience. <p>Fills the given <tt>rectangle</tt> with the specified <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void fillRect(com.trolltech.qt.core.QRectF r, com.trolltech.qt.core.Qt.GlobalColor c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_QRectF_GlobalColor(nativeId(), r == null ? 0 : r.nativeId(), c.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_QRectF_GlobalColor(long __this__nativeId, long r, int c);

/**
This is an overloaded member function, provided for convenience. <p>Fills the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>, using the brush <tt>style</tt> specified.
*/

    @QtBlockedSlot
    public final void fillRect(int x, int y, int w, int h, com.trolltech.qt.core.Qt.BrushStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_int_int_int_int_BrushStyle(nativeId(), x, y, w, h, style.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_int_int_int_int_BrushStyle(long __this__nativeId, int x, int y, int w, int h, int style);

/**
This is an overloaded member function, provided for convenience. <p>Fills the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>, using the given <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void fillRect(int x, int y, int w, int h, com.trolltech.qt.core.Qt.GlobalColor c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_int_int_int_int_GlobalColor(nativeId(), x, y, w, h, c.value());
    }
    @QtBlockedSlot
    native void __qt_fillRect_int_int_int_int_GlobalColor(long __this__nativeId, int x, int y, int w, int h, int c);

/**
This is an overloaded member function, provided for convenience. <p>Fills the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>, using the given <tt>brush</tt>.
*/

    @QtBlockedSlot
    public final void fillRect(int x, int y, int w, int h, com.trolltech.qt.gui.QBrush arg__5)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_int_int_int_int_QBrush(nativeId(), x, y, w, h, arg__5 == null ? 0 : arg__5.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_int_int_int_int_QBrush(long __this__nativeId, int x, int y, int w, int h, long arg__5);

/**
This is an overloaded member function, provided for convenience. <p>Fills the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>, using the given <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void fillRect(int x, int y, int w, int h, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fillRect_int_int_int_int_QColor(nativeId(), x, y, w, h, color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fillRect_int_int_int_int_QColor(long __this__nativeId, int x, int y, int w, int h, long color);

/**
Returns the currently set font used for drawing text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setFont(com.trolltech.qt.gui.QFont) setFont()}, {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the font info for the painter if the painter is active. Otherwise, the return value is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#font() font()}, {@link com.trolltech.qt.gui.QPainter#isActive() isActive()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontInfo fontInfo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontInfo(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFontInfo __qt_fontInfo(long __this__nativeId);

/**
Returns the font metrics for the painter if the painter is active. Otherwise, the return value is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#font() font()}, {@link com.trolltech.qt.gui.QPainter#isActive() isActive()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontMetrics fontMetrics()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontMetrics(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFontMetrics __qt_fontMetrics(long __this__nativeId);

/**
Returns true if clipping has been set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setClipping(boolean) setClipping()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasClipping()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasClipping(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasClipping(long __this__nativeId);

/**
Initializes the painters pen, background and font to the same as the given <tt>widget</tt>. Call this function after {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} while the painter is active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void initFrom(com.trolltech.qt.gui.QWidget widget)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (widget == null)
            throw new NullPointerException("Argument 'widget': null not expected.");
        __qt_initFrom_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_initFrom_QWidget(long __this__nativeId, long widget);

/**
Returns true if {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} has been called and {@link com.trolltech.qt.gui.QPainter#end() end()} has not yet been called; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and {@link com.trolltech.qt.gui.QPaintDevice#paintingActive() QPaintDevice::paintingActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
Returns the layout direction used by the painter when drawing text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}, {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection layoutDirection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_layoutDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_layoutDirection(long __this__nativeId);

/**
Returns the opacity of the painter. The default value is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setOpacity(double) setOpacity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double opacity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opacity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_opacity(long __this__nativeId);

/**
Returns the paint engine that the painter is currently operating on if the painter is active; otherwise 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
Returns the painter's current pen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setPen(com.trolltech.qt.core.Qt.PenStyle) setPen()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPen pen()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pen(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPen __qt_pen(long __this__nativeId);

/**
Returns a flag that specifies the rendering hints that are set for this painter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints) setRenderHints()}, {@link com.trolltech.qt.gui.QPainter#testRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) testRenderHint()}, and Rendering Quality. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter.RenderHints renderHints()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPainter.RenderHints(__qt_renderHints(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_renderHints(long __this__nativeId);

/**
Resets any transformations that were made using {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}, {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()}, {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, {@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()} and {@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()}. <p>It is advisable to use {@link com.trolltech.qt.gui.QPainter#resetTransform() resetTransform()} instead of this function to preserve the properties of perspective transformations. <p><DT><b>See also:</b><br><DD>Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetMatrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetMatrix(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetMatrix(long __this__nativeId);

/**
Resets any transformations that were made using {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}, {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()}, {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()}, {@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()} and {@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()}. <p><DT><b>See also:</b><br><DD>Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetTransform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetTransform(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetTransform(long __this__nativeId);

/**
Restores the current painter state (pops a saved state off the stack). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#save() save()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void restore()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_restore(nativeId());
    }
    @QtBlockedSlot
    native void __qt_restore(long __this__nativeId);

/**
Rotates the coordinate system the given <tt>angle</tt> clockwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, and Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void rotate(double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rotate_double(nativeId(), a);
    }
    @QtBlockedSlot
    native void __qt_rotate_double(long __this__nativeId, double a);

/**
Saves the current painter state (pushes the state onto a stack). A {@link com.trolltech.qt.gui.QPainter#save() save()} must be followed by a corresponding {@link com.trolltech.qt.gui.QPainter#restore() restore()}; the {@link com.trolltech.qt.gui.QPainter#end() end()} function unwinds the stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#restore() restore()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void save()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_save(nativeId());
    }
    @QtBlockedSlot
    native void __qt_save(long __this__nativeId);

/**
Scales the coordinate system by (<tt>sx</tt>, <tt>sy</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, and Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scale(double sx, double sy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_double_double(nativeId(), sx, sy);
    }
    @QtBlockedSlot
    native void __qt_scale_double_double(long __this__nativeId, double sx, double sy);

/**
Sets the background brush of the painter to the given <tt>brush</tt>. <p>The background brush is the brush that is filled in when drawing opaque text, stippled lines and bitmaps. The background brush has no effect in transparent background mode (which is the default). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#background() background()}, {@link com.trolltech.qt.gui.QPainter#setBackgroundMode(com.trolltech.qt.core.Qt.BGMode) setBackgroundMode()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackground(com.trolltech.qt.gui.QBrush bg)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_QBrush(nativeId(), bg == null ? 0 : bg.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_QBrush(long __this__nativeId, long bg);

/**
Sets the background mode of the painter to the given <tt>mode</tt> <p>{@link com.trolltech.qt.core.Qt.BGMode Qt::TransparentMode } (the default) draws stippled lines and text without setting the background pixels. {@link com.trolltech.qt.core.Qt.BGMode Qt::OpaqueMode } fills these space with the current background color. <p>Note that in order to draw a bitmap or pixmap transparently, you must use {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#backgroundMode() backgroundMode()}, {@link com.trolltech.qt.gui.QPainter#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackgroundMode(com.trolltech.qt.core.Qt.BGMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundMode_BGMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundMode_BGMode(long __this__nativeId, int mode);

/**
This is an overloaded member function, provided for convenience. <p>Sets the painter's brush to black color and the specified <tt>style</tt>.
*/

    @QtBlockedSlot
    public final void setBrush(com.trolltech.qt.core.Qt.BrushStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrush_BrushStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setBrush_BrushStyle(long __this__nativeId, int style);

/**
Sets the painter's brush to the given <tt>brush</tt>. <p>The painter's brush defines how shapes are filled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#brush() brush()}, and Settings. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Sets the brush's origin to the given <tt>position</tt>.
*/

    @QtBlockedSlot
    public final void setBrushOrigin(com.trolltech.qt.core.QPoint arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrushOrigin_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBrushOrigin_QPoint(long __this__nativeId, long arg__1);

/**
Sets the brush origin to <tt>position</tt>. <p>The brush origin specifies the (0, 0) coordinate of the painter's brush. This setting only applies to pattern brushes and pixmap brushes. <p>Note that while the {@link com.trolltech.qt.gui.QPainter#brushOrigin() brushOrigin()} was necessary to adopt the parent's background for a widget in Qt 3, this is no longer the case since the Qt 4 painter doesn't paint the background unless you explicitly tell it to do so by setting the widget's {@link QWidget#autoFillBackground() autoFillBackground} property to true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#brushOrigin() brushOrigin()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBrushOrigin(com.trolltech.qt.core.QPointF arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrushOrigin_QPointF(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBrushOrigin_QPointF(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Sets the brush's origin to point (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final void setBrushOrigin(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrushOrigin_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setBrushOrigin_int_int(long __this__nativeId, int x, int y);


/**
Enables clipping, and sets the clip path for the painter to the given <tt>path</tt>, with the clip <tt>operation</tt>. <p>Note that the clip path is specified in logical (painter) coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipPath() clipPath()}, {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipPath(com.trolltech.qt.gui.QPainterPath path) {
        setClipPath(path, com.trolltech.qt.core.Qt.ClipOperation.ReplaceClip);
    }
/**
Enables clipping, and sets the clip path for the painter to the given <tt>path</tt>, with the clip <tt>operation</tt>. <p>Note that the clip path is specified in logical (painter) coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipPath() clipPath()}, {@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipPath(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.core.Qt.ClipOperation op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipPath_QPainterPath_ClipOperation(nativeId(), path == null ? 0 : path.nativeId(), op.value());
    }
    @QtBlockedSlot
    native void __qt_setClipPath_QPainterPath_ClipOperation(long __this__nativeId, long path, int op);


/**
This is an overloaded member function, provided for convenience. <p>Enables clipping, and sets the clip region to the given <tt>rectangle</tt> using the given clip <tt>operation</tt>.
*/

    @QtBlockedSlot
    public final void setClipRect(com.trolltech.qt.core.QRect arg__1) {
        setClipRect(arg__1, com.trolltech.qt.core.Qt.ClipOperation.ReplaceClip);
    }
    @QtBlockedSlot
    public final void setClipRect(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.core.Qt.ClipOperation op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipRect_QRect_ClipOperation(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), op.value());
    }
    @QtBlockedSlot
    native void __qt_setClipRect_QRect_ClipOperation(long __this__nativeId, long arg__1, int op);


/**
Enables clipping, and sets the clip region to the given <tt>rectangle</tt> using the given clip <tt>operation</tt>. The default operation is to replace the current clip rectangle. <p>Note that the clip rectangle is specified in logical (painter) coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, {@link com.trolltech.qt.gui.QPainter#setClipping(boolean) setClipping()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipRect(com.trolltech.qt.core.QRectF arg__1) {
        setClipRect(arg__1, com.trolltech.qt.core.Qt.ClipOperation.ReplaceClip);
    }
/**
Enables clipping, and sets the clip region to the given <tt>rectangle</tt> using the given clip <tt>operation</tt>. The default operation is to replace the current clip rectangle. <p>Note that the clip rectangle is specified in logical (painter) coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, {@link com.trolltech.qt.gui.QPainter#setClipping(boolean) setClipping()}, and Clipping. <br></DD></DT>
*/

/**
This is an overloaded member function, provided for convenience. <p>Enables clipping, and sets the clip region to the given <tt>rectangle</tt> using the given clip <tt>operation</tt>.
*/

    @QtBlockedSlot
    public final void setClipRect(com.trolltech.qt.core.QRectF arg__1, com.trolltech.qt.core.Qt.ClipOperation op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipRect_QRectF_ClipOperation(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), op.value());
    }
    @QtBlockedSlot
    native void __qt_setClipRect_QRectF_ClipOperation(long __this__nativeId, long arg__1, int op);


/**
Enables clipping, and sets the clip region to the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setClipRect(int x, int y, int w, int h) {
        setClipRect(x, y, w, h, com.trolltech.qt.core.Qt.ClipOperation.ReplaceClip);
    }
/**
Enables clipping, and sets the clip region to the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setClipRect(int x, int y, int w, int h, com.trolltech.qt.core.Qt.ClipOperation op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipRect_int_int_int_int_ClipOperation(nativeId(), x, y, w, h, op.value());
    }
    @QtBlockedSlot
    native void __qt_setClipRect_int_int_int_int_ClipOperation(long __this__nativeId, int x, int y, int w, int h, int op);


/**
Sets the clip region to the given <tt>region</tt> using the specified clip <tt>operation</tt>. The default clip operation is to replace the current clip region. <p>Note that the clip region is given in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, {@link com.trolltech.qt.gui.QPainter#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipRegion(com.trolltech.qt.gui.QRegion arg__1) {
        setClipRegion(arg__1, com.trolltech.qt.core.Qt.ClipOperation.ReplaceClip);
    }
/**
Sets the clip region to the given <tt>region</tt> using the specified clip <tt>operation</tt>. The default clip operation is to replace the current clip region. <p>Note that the clip region is given in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#clipRegion() clipRegion()}, {@link com.trolltech.qt.gui.QPainter#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipRegion(com.trolltech.qt.gui.QRegion arg__1, com.trolltech.qt.core.Qt.ClipOperation op)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipRegion_QRegion_ClipOperation(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), op.value());
    }
    @QtBlockedSlot
    native void __qt_setClipRegion_QRegion_ClipOperation(long __this__nativeId, long arg__1, int op);

/**
Enables clipping if <tt>enable</tt> is true, or disables clipping if <tt>enable</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#hasClipping() hasClipping()}, and Clipping. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipping(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipping_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setClipping_boolean(long __this__nativeId, boolean enable);

/**
Sets the composition mode to the given <tt>mode</tt>. <p><b>Warning:</b> You can only set the composition mode for QPainter objects that operates on a {@link com.trolltech.qt.gui.QImage QImage}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#compositionMode() compositionMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCompositionMode(com.trolltech.qt.gui.QPainter.CompositionMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompositionMode_CompositionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setCompositionMode_CompositionMode(long __this__nativeId, int mode);

/**
Sets the painter's font to the given <tt>font</tt>. <p>This font is used by subsequent {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()} functions. The text color is the same as the pen color. <p>If you set a font that isn't available, Qt finds a close match. {@link com.trolltech.qt.gui.QPainter#font() font()} will return what you set using {@link com.trolltech.qt.gui.QPainter#setFont(com.trolltech.qt.gui.QFont) setFont()} and {@link com.trolltech.qt.gui.QPainter#fontInfo() fontInfo()} returns the font actually being used (which may be the same). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#font() font()}, {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), f == null ? 0 : f.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long f);

/**
Sets the layout direction used by the painter when drawing text, to the specified <tt>direction</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#layoutDirection() layoutDirection()}, {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) drawText()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayoutDirection_LayoutDirection(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setLayoutDirection_LayoutDirection(long __this__nativeId, int direction);

/**
Sets the opacity of the painter to <tt>opacity</tt>. The value should be in the range 0.0 to 1.0, where 0.0 is fully transparent and 1.0 is fully opaque. <p>Opacity set on the painter will apply to all drawing operations individually. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#opacity() opacity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOpacity(double opacity)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpacity_double(nativeId(), opacity);
    }
    @QtBlockedSlot
    native void __qt_setOpacity_double(long __this__nativeId, double opacity);

/**
This is an overloaded member function, provided for convenience. <p>Sets the painter's pen to have the given <tt>style</tt>, width 0 and black color.
*/

    @QtBlockedSlot
    public final void setPen(com.trolltech.qt.core.Qt.PenStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPen_PenStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setPen_PenStyle(long __this__nativeId, int style);

/**
This is an overloaded member function, provided for convenience. <p>Sets the painter's pen to have style {@link com.trolltech.qt.core.Qt.PenStyle Qt::SolidLine }, width 0 and the specified <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void setPen(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPen_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPen_QColor(long __this__nativeId, long color);

/**
Sets the painter's pen to be the given <tt>pen</tt>. <p>The <tt>pen</tt> defines how to draw lines and outlines, and it also defines the text color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#pen() pen()}, and Settings. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPen(com.trolltech.qt.gui.QPen pen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPen_QPen(nativeId(), pen == null ? 0 : pen.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPen_QPen(long __this__nativeId, long pen);


/**
Sets the given render <tt>hint</tt> on the painter if <tt>on</tt> is true; otherwise clears the render hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints) setRenderHints()}, {@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, and Rendering Quality. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint hint) {
        setRenderHint(hint, (boolean)true);
    }
/**
Sets the given render <tt>hint</tt> on the painter if <tt>on</tt> is true; otherwise clears the render hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints) setRenderHints()}, {@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, and Rendering Quality. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint hint, boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRenderHint_RenderHint_boolean(nativeId(), hint.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setRenderHint_RenderHint_boolean(long __this__nativeId, int hint, boolean on);


/**
Sets the given render <tt>hints</tt> on the painter if <tt>on</tt> is true; otherwise clears the render hints. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) setRenderHint()}, {@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, and Rendering Quality. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints hints) {
        setRenderHints(hints, (boolean)true);
    }
/**
Sets the given render <tt>hints</tt> on the painter if <tt>on</tt> is true; otherwise clears the render hints. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) setRenderHint()}, {@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, and Rendering Quality. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints hints, boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRenderHints_RenderHints_boolean(nativeId(), hints.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setRenderHints_RenderHints_boolean(long __this__nativeId, int hints, boolean on);


/**
Sets the world transformation matrix. If <tt>combine</tt> is true, the specified <tt>transform</tt> is combined with the current matrix; otherwise it replaces the current matrix. <p>This function has been added for compatibility with setMatrix(), but as with setMatrix() the preferred method of setting a transformation on the painter is through {@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#transform() transform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTransform(com.trolltech.qt.gui.QTransform transform) {
        setTransform(transform, (boolean)false);
    }
/**
Sets the world transformation matrix. If <tt>combine</tt> is true, the specified <tt>transform</tt> is combined with the current matrix; otherwise it replaces the current matrix. <p>This function has been added for compatibility with setMatrix(), but as with setMatrix() the preferred method of setting a transformation on the painter is through {@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#transform() transform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTransform(com.trolltech.qt.gui.QTransform transform, boolean combine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTransform_QTransform_boolean(nativeId(), transform == null ? 0 : transform.nativeId(), combine);
    }
    @QtBlockedSlot
    native void __qt_setTransform_QTransform_boolean(long __this__nativeId, long transform, boolean combine);

/**
Enables view transformations if <tt>enable</tt> is true, or disables view transformations if <tt>enable</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#viewTransformEnabled() viewTransformEnabled()}, and {@link <a href="../coordsys.html#window-viewport-conversion">Window-Viewport Conversion</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setViewTransformEnabled(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewTransformEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setViewTransformEnabled_boolean(long __this__nativeId, boolean enable);

/**
Sets the painter's viewport rectangle to the given <tt>rectangle</tt>, and enables view transformations. <p>The viewport rectangle is part of the view transformation. The viewport specifies the device coordinate system. Its sister, the {@link com.trolltech.qt.gui.QPainter#window() window()}, specifies the logical coordinate system. <p>The default viewport rectangle is the same as the device's rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#viewport() viewport()}, {@link com.trolltech.qt.gui.QPainter#viewTransformEnabled() viewTransformEnabled()}, and {@link <a href="../coordsys.html#window-viewport-conversion">Window-Viewport Conversion</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setViewport(com.trolltech.qt.core.QRect viewport)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewport_QRect(nativeId(), viewport == null ? 0 : viewport.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewport_QRect(long __this__nativeId, long viewport);

/**
This is an overloaded member function, provided for convenience. <p>Sets the painter's viewport rectangle to be the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) with the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setViewport(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewport_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setViewport_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Sets the painter's window to the given <tt>rectangle</tt>, and enables view transformations. <p>The window rectangle is part of the view transformation. The window specifies the logical coordinate system. Its sister, the {@link com.trolltech.qt.gui.QPainter#viewport() viewport()}, specifies the device coordinate system. <p>The default window rectangle is the same as the device's rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#window() window()}, {@link com.trolltech.qt.gui.QPainter#viewTransformEnabled() viewTransformEnabled()}, and {@link <a href="../coordsys.html#window-viewport-conversion">Window-Viewport Conversion</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWindow(com.trolltech.qt.core.QRect window)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindow_QRect(nativeId(), window == null ? 0 : window.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWindow_QRect(long __this__nativeId, long window);

/**
This is an overloaded member function, provided for convenience. <p>Sets the painter's window to the rectangle beginning at (<tt>x</tt>, <tt>y</tt>) and the given <tt>width</tt> and <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setWindow(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindow_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setWindow_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);


/**
Sets the transformation matrix to <tt>matrix</tt> and enables transformations. <p><b>Note:</b> It is advisable to use {@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()} instead of this function to preserve the properties of perspective transformations. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current transformation matrix; otherwise <tt>matrix</tt> replaces the current transformation matrix. <p>If <tt>matrix</tt> is the identity matrix and <tt>combine</tt> is false, this function calls setWorldMatrixEnabled(false). (The identity matrix is the matrix where {@link com.trolltech.qt.gui.QMatrix#m11() QMatrix::m11()} and {@link com.trolltech.qt.gui.QMatrix#m22() QMatrix::m22()} are 1.0 and the rest are 0.0.) <p>The following functions can transform the coordinate system without using a {@link com.trolltech.qt.gui.QMatrix QMatrix}: <ul><li> {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}</li><li> {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}</li><li> {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()}</li><li> {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}</li></ul> They operate on the painter's {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()} and are implemented like this: <pre class="snippet">
    void rotate(double angle) {
        QMatrix matrix = new QMatrix();
        matrix.rotate(angle);
        setWorldMatrix(matrix, true);
    }
</pre> Note that when using {@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()} function you should always have <tt>combine</tt> be true when you are drawing into a {@link com.trolltech.qt.gui.QPicture QPicture}. Otherwise it may not be possible to replay the picture with additional transformations; using the {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}, {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}, etc. convenience functions is safe. <p>For more information about the coordinate system, transformations and window-viewport conversion, see {@link <a href="../coordsys.html">The Coordinate System</a>} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldMatrixEnabled() worldMatrixEnabled()}, and {@link com.trolltech.qt.gui.QMatrix QMatrix}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorldMatrix(com.trolltech.qt.gui.QMatrix matrix) {
        setWorldMatrix(matrix, (boolean)false);
    }
/**
Sets the transformation matrix to <tt>matrix</tt> and enables transformations. <p><b>Note:</b> It is advisable to use {@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()} instead of this function to preserve the properties of perspective transformations. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current transformation matrix; otherwise <tt>matrix</tt> replaces the current transformation matrix. <p>If <tt>matrix</tt> is the identity matrix and <tt>combine</tt> is false, this function calls setWorldMatrixEnabled(false). (The identity matrix is the matrix where {@link com.trolltech.qt.gui.QMatrix#m11() QMatrix::m11()} and {@link com.trolltech.qt.gui.QMatrix#m22() QMatrix::m22()} are 1.0 and the rest are 0.0.) <p>The following functions can transform the coordinate system without using a {@link com.trolltech.qt.gui.QMatrix QMatrix}: <ul><li> {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}</li><li> {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}</li><li> {@link com.trolltech.qt.gui.QPainter#shear(double, double) shear()}</li><li> {@link com.trolltech.qt.gui.QPainter#rotate(double) rotate()}</li></ul> They operate on the painter's {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()} and are implemented like this: <pre class="snippet">
    void rotate(double angle) {
        QMatrix matrix = new QMatrix();
        matrix.rotate(angle);
        setWorldMatrix(matrix, true);
    }
</pre> Note that when using {@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()} function you should always have <tt>combine</tt> be true when you are drawing into a {@link com.trolltech.qt.gui.QPicture QPicture}. Otherwise it may not be possible to replay the picture with additional transformations; using the {@link com.trolltech.qt.gui.QPainter#translate(com.trolltech.qt.core.QPoint) translate()}, {@link com.trolltech.qt.gui.QPainter#scale(double, double) scale()}, etc. convenience functions is safe. <p>For more information about the coordinate system, transformations and window-viewport conversion, see {@link <a href="../coordsys.html">The Coordinate System</a>} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldMatrixEnabled() worldMatrixEnabled()}, and {@link com.trolltech.qt.gui.QMatrix QMatrix}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorldMatrix(com.trolltech.qt.gui.QMatrix matrix, boolean combine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWorldMatrix_QMatrix_boolean(nativeId(), matrix == null ? 0 : matrix.nativeId(), combine);
    }
    @QtBlockedSlot
    native void __qt_setWorldMatrix_QMatrix_boolean(long __this__nativeId, long matrix, boolean combine);

/**
Enables transformations if <tt>enable</tt> is true, or disables transformations if <tt>enable</tt> is false. The world transformation matrix is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldMatrixEnabled() worldMatrixEnabled()}, {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}, and Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorldMatrixEnabled(boolean enabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWorldMatrixEnabled_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setWorldMatrixEnabled_boolean(long __this__nativeId, boolean enabled);


/**
Sets the world transformation matrix. If <tt>combine</tt> is true, the specified <tt>matrix</tt> is combined with the current matrix; otherwise it replaces the current matrix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldTransform() worldTransform()}, {@link com.trolltech.qt.gui.QPainter#transform() transform()}, and {@link com.trolltech.qt.gui.QPainter#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorldTransform(com.trolltech.qt.gui.QTransform matrix) {
        setWorldTransform(matrix, (boolean)false);
    }
/**
Sets the world transformation matrix. If <tt>combine</tt> is true, the specified <tt>matrix</tt> is combined with the current matrix; otherwise it replaces the current matrix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#worldTransform() worldTransform()}, {@link com.trolltech.qt.gui.QPainter#transform() transform()}, and {@link com.trolltech.qt.gui.QPainter#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorldTransform(com.trolltech.qt.gui.QTransform matrix, boolean combine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWorldTransform_QTransform_boolean(nativeId(), matrix == null ? 0 : matrix.nativeId(), combine);
    }
    @QtBlockedSlot
    native void __qt_setWorldTransform_QTransform_boolean(long __this__nativeId, long matrix, boolean combine);

/**
Shears the coordinate system by (<tt>sh</tt>, <tt>sv</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, and Coordinate Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void shear(double sh, double sv)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_shear_double_double(nativeId(), sh, sv);
    }
    @QtBlockedSlot
    native void __qt_shear_double_double(long __this__nativeId, double sh, double sv);

/**
Draws the outline (strokes) the path <tt>path</tt> with the pen specified by <tt>pen</tt> <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QPainter#fillPath(com.trolltech.qt.gui.QPainterPath, com.trolltech.qt.gui.QBrush) fillPath()}, and Drawing. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void strokePath(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.gui.QPen pen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_strokePath_QPainterPath_QPen(nativeId(), path == null ? 0 : path.nativeId(), pen == null ? 0 : pen.nativeId());
    }
    @QtBlockedSlot
    native void __qt_strokePath_QPainterPath_QPen(long __this__nativeId, long path, long pen);

/**
Returns true if <tt>hint</tt> is set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#renderHints() renderHints()}, and {@link com.trolltech.qt.gui.QPainter#setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint) setRenderHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testRenderHint(com.trolltech.qt.gui.QPainter.RenderHint hint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testRenderHint_RenderHint(nativeId(), hint.value());
    }
    @QtBlockedSlot
    native boolean __qt_testRenderHint_RenderHint(long __this__nativeId, int hint);

/**
Returns the world transformation matrix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform transform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_transform(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Translates the coordinate system by the given <tt>offset</tt>.
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
Translates the coordinate system by the given <tt>offset</tt>; i. . the given <tt>offset</tt> is added to points. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, and Coordinate Transformations. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Translates the coordinate system by the vector (<tt>dx</tt>, <tt>dy</tt>).
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
Returns true if view transformation is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setViewTransformEnabled(boolean) setViewTransformEnabled()}, and {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean viewTransformEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewTransformEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewTransformEnabled(long __this__nativeId);

/**
Returns the viewport rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setViewport(com.trolltech.qt.core.QRect) setViewport()}, and {@link com.trolltech.qt.gui.QPainter#setViewTransformEnabled(boolean) setViewTransformEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect viewport()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewport(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_viewport(long __this__nativeId);

/**
Returns the window rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWindow(com.trolltech.qt.core.QRect) setWindow()}, and {@link com.trolltech.qt.gui.QPainter#setViewTransformEnabled(boolean) setViewTransformEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect window()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_window(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_window(long __this__nativeId);

/**
Returns the world transformation matrix. <p>It is advisable to use {@link com.trolltech.qt.gui.QPainter#worldTransform() worldTransform()} because {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()} does not preserve the properties of perspective transformations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrix(com.trolltech.qt.gui.QMatrix) setWorldMatrix()}, Coordinate Transformations, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix worldMatrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_worldMatrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_worldMatrix(long __this__nativeId);

/**
Returns true if world transformation is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldMatrixEnabled(boolean) setWorldMatrixEnabled()}, {@link com.trolltech.qt.gui.QPainter#worldMatrix() worldMatrix()}, and {@link <a href="../coordsys.html">The Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean worldMatrixEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_worldMatrixEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_worldMatrixEnabled(long __this__nativeId);

/**
Returns the world transformation matrix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#setWorldTransform(com.trolltech.qt.gui.QTransform) setWorldTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform worldTransform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_worldTransform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_worldTransform(long __this__nativeId);

    private static com.trolltech.qt.gui.QPaintDeviceInterface redirected(com.trolltech.qt.gui.QPaintDeviceInterface device, com.trolltech.qt.QNativePointer offset)    {
        return __qt_redirected_QPaintDevice_nativepointer(device == null ? 0 : device.nativeId(), offset);
    }
    native static com.trolltech.qt.gui.QPaintDeviceInterface __qt_redirected_QPaintDevice_nativepointer(long device, com.trolltech.qt.QNativePointer offset);

/**
Restores the previous redirection for the given <tt>device</tt> after a call to {@link com.trolltech.qt.gui.QPainter#setRedirected(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.gui.QPaintDeviceInterface) setRedirected()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#redirected(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.core.QPoint) redirected()}. <br></DD></DT>
*/

    public static void restoreRedirected(com.trolltech.qt.gui.QPaintDeviceInterface device)    {
        if (device == null)
            throw new NullPointerException("Argument 'device': null not expected.");
        __qt_restoreRedirected_QPaintDevice(device == null ? 0 : device.nativeId());
        if (!__rcRedirections.empty()) __rcRedirections.pop();
        if (!__rcRedirections.empty()) __rcRedirections.pop();


    }
    native static void __qt_restoreRedirected_QPaintDevice(long device);


/**
Redirects all paint commands for the given paint <tt>device</tt>, to the <tt>replacement</tt> device. The optional point <tt>offset</tt> defines an offset within the source device. <p>The redirection will not be effective until the {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} function has been called; make sure to call {@link com.trolltech.qt.gui.QPainter#end() end()} for the given <tt>device</tt>'s painter (if any) before redirecting. Call {@link com.trolltech.qt.gui.QPainter#restoreRedirected(com.trolltech.qt.gui.QPaintDeviceInterface) restoreRedirected()} to restore the previous redirection. <p>In general, you'll probably find that calling {@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) QPixmap::grabWidget()} or {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) QPixmap::grabWindow()} is an easier solution. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#redirected(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.core.QPoint) redirected()}, and {@link com.trolltech.qt.gui.QPainter#restoreRedirected(com.trolltech.qt.gui.QPaintDeviceInterface) restoreRedirected()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setRedirected(com.trolltech.qt.gui.QPaintDeviceInterface device, com.trolltech.qt.gui.QPaintDeviceInterface replacement) {
        setRedirected(device, replacement, (com.trolltech.qt.core.QPoint)new com.trolltech.qt.core.QPoint());
    }
/**
Redirects all paint commands for the given paint <tt>device</tt>, to the <tt>replacement</tt> device. The optional point <tt>offset</tt> defines an offset within the source device. <p>The redirection will not be effective until the {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()} function has been called; make sure to call {@link com.trolltech.qt.gui.QPainter#end() end()} for the given <tt>device</tt>'s painter (if any) before redirecting. Call {@link com.trolltech.qt.gui.QPainter#restoreRedirected(com.trolltech.qt.gui.QPaintDeviceInterface) restoreRedirected()} to restore the previous redirection. <p>In general, you'll probably find that calling {@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) QPixmap::grabWidget()} or {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) QPixmap::grabWindow()} is an easier solution. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#redirected(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.core.QPoint) redirected()}, and {@link com.trolltech.qt.gui.QPainter#restoreRedirected(com.trolltech.qt.gui.QPaintDeviceInterface) restoreRedirected()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setRedirected(com.trolltech.qt.gui.QPaintDeviceInterface device, com.trolltech.qt.gui.QPaintDeviceInterface replacement, com.trolltech.qt.core.QPoint offset)    {
        if (device == null)
            throw new NullPointerException("Argument 'device': null not expected.");
        __qt_setRedirected_QPaintDevice_QPaintDevice_QPoint(device == null ? 0 : device.nativeId(), replacement == null ? 0 : replacement.nativeId(), offset == null ? 0 : offset.nativeId());
        __rcRedirections.push(device);
        __rcRedirections.push(replacement);


    }
    @SuppressWarnings("unchecked")
    native static void __qt_setRedirected_QPaintDevice_QPaintDevice_QPoint(long device, long replacement, long offset);

/**
@exclude
*/

    public static native QPainter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPainter(QPrivateConstructor p) { super(p); } 

/**
Sets the brush of this QPainter to a solid <tt>color</tt> brush.
*/

    public final void setBrush(QColor color) {
        setBrush(new QBrush(color));
    }

/**
Sets this QPainter's brush to use <tt>gradient</tt>.

<tt>gradient</tt>
*/

    public final void setBrush(QGradient gradient) {
        setBrush(new QBrush(gradient));
    }

/**
Sets this QPainter's brush to use <tt>pm</tt>.
*/

    public final void setBrush(QPixmap pm) {
        setBrush(new QBrush(pm));
    }

/**
Returns the replacement for given <tt>device</tt>. The optional out
parameter <tt>offset</tt> returns the offset within the replaced
device.
*/

    public static QPaintDeviceInterface redirected(QPaintDeviceInterface device, com.trolltech.qt.core.QPoint offset) {
        return redirected(device, offset == null ? null : offset.nativePointer());
    }

/**
Creates a QPainter with parent <tt>widget</tt>.
*/

    public QPainter(QWidget widget) {
        this();
        begin(widget);
    }

/**
This method initializes the painter to draw on <tt>widget</tt>.
It returns true if successful; otherwise, it returns false.
*/

    public boolean begin(QWidget widget) { // can't be final because of QStylePainter
        return com.trolltech.qt.QtJambiGuiInternal.beginPaint(widget, this);
    }
    private static java.util.Stack<QPaintDeviceInterface> __rcRedirections = new java.util.Stack<QPaintDeviceInterface>();


    // TEMPLATE - gui.painter_draw_text_qrect - START
    // TEMPLATE - gui.painter_draw_text_general - START
/**
Draws the given <tt>text</tt> within the provided <tt>rectangle</tt>.
<p>
The <tt>boundingRect</tt> (if not null) is set to the actual bounding
rectangle of the output.  The <tt>flags</tt> argument is a bitwise OR of
Qt.AlignmentFlags.
*/

    public final void drawText(com.trolltech.qt.core.QRect rectangle, int flags, String text, com.trolltech.qt.core.QRect boundingRect) {
        drawText(rectangle, flags, text, boundingRect == null ? null : boundingRect.nativePointer());
    }

    public final void drawText(com.trolltech.qt.core.QRect rectangle, int flags, String text) {
        drawText(rectangle, flags, text, (com.trolltech.qt.core.QRect) null);
    }
    // TEMPLATE - gui.painter_draw_text_general - END
    // TEMPLATE - gui.painter_draw_text_qrect - END


    // TEMPLATE - gui.painter_draw_text_qrect - START
    // TEMPLATE - gui.painter_draw_text_general - START
/**
Draws the given <tt>text</tt> within the provided <tt>rectangle</tt>.
<p>
The <tt>boundingRect</tt> (if not null) is set to the actual bounding
rectangle of the output.  The <tt>flags</tt> argument is a bitwise OR of
Qt.AlignmentFlags.
*/

    public final void drawText(com.trolltech.qt.core.QRectF rectangle, int flags, String text, com.trolltech.qt.core.QRectF boundingRect) {
        drawText(rectangle, flags, text, boundingRect == null ? null : boundingRect.nativePointer());
    }

/**
This is an overloaded method provided for convenience.
*/

/**
This is an overloaded function provided for convenience.
*/

    public final void drawText(com.trolltech.qt.core.QRectF rectangle, int flags, String text) {
        drawText(rectangle, flags, text, (com.trolltech.qt.core.QRectF) null);
    }
    // TEMPLATE - gui.painter_draw_text_general - END
    // TEMPLATE - gui.painter_draw_text_qrect - END


    // TEMPLATE - gui.painter_draw_text_general - START
/**
Draws the given <tt>text</tt> within the rectangle with origin
(<tt>x</tt>, <tt>y</tt>), <tt>width</tt> and <tt>height</dd>.
<p>
The <tt>boundingRect</tt> (if not null) is set to the actual bounding
rectangle of the output.  The <tt>flags</tt> argument is a bitwise OR
of the following flags:
*/

    public final void drawText(int x, int y, int width, int height, int flags, String text, com.trolltech.qt.core.QRect boundingRect) {
        drawText(x, y, width, height, flags, text, boundingRect == null ? null : boundingRect.nativePointer());
    }

/**
This is an overloaded method provided for convenience.
*/

    public final void drawText(int x, int y, int width, int height, int flags, String text) {
        drawText(x, y, width, height, flags, text, (com.trolltech.qt.core.QRect) null);
    }
    // TEMPLATE - gui.painter_draw_text_general - END

}
