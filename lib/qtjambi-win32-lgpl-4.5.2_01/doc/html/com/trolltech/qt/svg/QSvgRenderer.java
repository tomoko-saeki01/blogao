package com.trolltech.qt.svg;

import com.trolltech.qt.*;



/**
The QSvgRenderer class is used to draw the contents of SVG files onto paint devices. Using QSvgRenderer, Scalable Vector Graphics (SVG) can be rendered onto any {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} subclass, including {@link com.trolltech.qt.gui.QWidget QWidget}, {@link com.trolltech.qt.gui.QImage QImage}, and {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}. <p>QSvgRenderer provides an API that supports basic features of SVG rendering, such as loading and rendering of static drawings, and more interactive features like animation. Since the rendering is performed using {@link com.trolltech.qt.gui.QPainter QPainter}, SVG drawings can be rendered on any subclass of {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice}. <p>SVG drawings are either loaded when an QSvgRenderer is constructed, or loaded later using the {@link com.trolltech.qt.svg.QSvgRenderer#load(com.trolltech.qt.xml.QXmlStreamReader) load()} functions. Data is either supplied directly as serialized XML, or indirectly using a file name. If a valid file has been loaded, either when the renderer is constructed or at some later time, {@link com.trolltech.qt.svg.QSvgRenderer#isValid() isValid()} returns true; otherwise it returns false. QSvgRenderer provides the {@link com.trolltech.qt.svg.QSvgRenderer#render(com.trolltech.qt.gui.QPainter) render()} slot to render the current document, or the current frame of an animated document, using a given painter. <p>The {@link com.trolltech.qt.svg.QSvgRenderer#defaultSize() defaultSize()} function provides information about the amount of space that is required to render the currently loaded SVG file. This is useful for paint devices, such as {@link com.trolltech.qt.gui.QWidget QWidget}, that often need to supply a size hint to their parent layout. The default size of a drawing may differ from its visible area, found using the {@link QSvgRenderer#viewBoxF() viewBox} property. <p>Animated SVG drawings are supported, and can be controlled with a simple collection of functions and properties: <ul><li> The {@link com.trolltech.qt.svg.QSvgRenderer#animated() animated()} function indicates whether a drawing contains animation information.</li><li> The {@link QSvgRenderer#framesPerSecond() framesPerSecond} property contains the rate at which the animation plays.</li></ul> Finally, the QSvgRenderer class provides the {@link com.trolltech.qt.svg.QSvgRenderer#repaintNeeded repaintNeeded() } signal which is emitted whenever the rendering of the document needs to be updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgWidget QSvgWidget}, {@link <a href="../qtsvg.html">QtSvg Module</a>}, {@link <a href="../painting-svgviewer.html">SVG Viewer Example</a>}, and {@link com.trolltech.qt.gui.QPicture QPicture}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSvgRenderer extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.svg.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted whenever the rendering of the document needs to be updated, usually for the purposes of animation.
*/

    public final Signal0 repaintNeeded = new Signal0();

    private final void repaintNeeded()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaintNeeded(nativeId());
    }
    native void __qt_repaintNeeded(long __this__nativeId);


/**
Constructs a new renderer with the given <tt>parent</tt>.
*/

    public QSvgRenderer() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new renderer with the given <tt>parent</tt>.
*/

    public QSvgRenderer(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSvgRenderer_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgRenderer_QObject(long parent);


/**
Constructs a new renderer with the given <tt>parent</tt> and loads the SVG data using the stream reader specified by <tt>contents</tt>.
*/

    public QSvgRenderer(com.trolltech.qt.xml.QXmlStreamReader contents) {
        this(contents, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new renderer with the given <tt>parent</tt> and loads the SVG data using the stream reader specified by <tt>contents</tt>.
*/

    public QSvgRenderer(com.trolltech.qt.xml.QXmlStreamReader contents, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSvgRenderer_QXmlStreamReader_QObject(contents == null ? 0 : contents.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgRenderer_QXmlStreamReader_QObject(long contents, long parent);


/**
Constructs a new renderer with the given <tt>parent</tt> and loads the SVG data from the byte array specified by <tt>contents</tt>.
*/

    public QSvgRenderer(com.trolltech.qt.core.QByteArray contents) {
        this(contents, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new renderer with the given <tt>parent</tt> and loads the SVG data from the byte array specified by <tt>contents</tt>.
*/

    public QSvgRenderer(com.trolltech.qt.core.QByteArray contents, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSvgRenderer_QByteArray_QObject(contents == null ? 0 : contents.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgRenderer_QByteArray_QObject(long contents, long parent);


/**
Constructs a new renderer with the given <tt>parent</tt> and loads the contents of the SVG file with the specified <tt>filename</tt>.
*/

    public QSvgRenderer(java.lang.String filename) {
        this(filename, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new renderer with the given <tt>parent</tt> and loads the contents of the SVG file with the specified <tt>filename</tt>.
*/

    public QSvgRenderer(java.lang.String filename, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSvgRenderer_String_QObject(filename, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgRenderer_String_QObject(java.lang.String filename, long parent);

/**
Returns true if the current document contains animated elements; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#framesPerSecond() framesPerSecond()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean animated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_animated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_animated(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int animationDuration()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_animationDuration(nativeId());
    }
    @QtBlockedSlot
    native int __qt_animationDuration(long __this__nativeId);

/**
Returns bounding rectangle of the item with the given <tt>id</tt>. The transformation matrix of parent elements is not affecting the bounds of the element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#matrixForElement(java.lang.String) matrixForElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundsOnElement(java.lang.String id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundsOnElement_String(nativeId(), id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundsOnElement_String(long __this__nativeId, java.lang.String id);

/**
This property holds the current frame of the document's animation, or 0 if the document is not animated. <p><DT><b>See also:</b><br><DD>animationDuration(), {@link QSvgRenderer#framesPerSecond() framesPerSecond}, and {@link com.trolltech.qt.svg.QSvgRenderer#animated() animated()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="currentFrame")
    @QtBlockedSlot
    public final int currentFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrame(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentFrame(long __this__nativeId);

/**
Returns the default size of the document contents.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize defaultSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_defaultSize(long __this__nativeId);

/**
Returns true if the element with the given <tt>id</tt> exists in the currently parsed SVG file and is a renderable element. <p>Note: this method returns true only for elements that can be rendered. Which implies that elements that are considered part of the fill/stroke style properties, e.g. radialGradients even tough marked with "id" attributes will not be found by this method.
*/

    @QtBlockedSlot
    public final boolean elementExists(java.lang.String id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementExists_String(nativeId(), id);
    }
    @QtBlockedSlot
    native boolean __qt_elementExists_String(long __this__nativeId, java.lang.String id);

/**
This property holds the number of frames per second to be shown. The number of frames per second is 0 if the current document is not animated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#animated() animated()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="framesPerSecond")
    @QtBlockedSlot
    public final int framesPerSecond()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_framesPerSecond(nativeId());
    }
    @QtBlockedSlot
    native int __qt_framesPerSecond(long __this__nativeId);

/**
Returns true if there is a valid current document; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Loads the specified SVG in <tt>contents</tt>, returning true if the content was successfully parsed; otherwise returns false. <p>The reader will be used from where it currently is positioned. If <tt>contents</tt> is <tt>null</tt>, behavior is undefined.
*/

    public final boolean load(com.trolltech.qt.xml.QXmlStreamReader contents)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_QXmlStreamReader(nativeId(), contents == null ? 0 : contents.nativeId());
    }
    native boolean __qt_load_QXmlStreamReader(long __this__nativeId, long contents);

/**
Loads the specified SVG format <tt>contents</tt>, returning true if the content was successfully parsed; otherwise returns false.
*/

    public final boolean load(com.trolltech.qt.core.QByteArray contents)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_QByteArray(nativeId(), contents == null ? 0 : contents.nativeId());
    }
    native boolean __qt_load_QByteArray(long __this__nativeId, long contents);

/**
Loads the SVG file specified by <tt>filename</tt>, returning true if the content was successfully parsed; otherwise returns false.
*/

    public final boolean load(java.lang.String filename)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_String(nativeId(), filename);
    }
    native boolean __qt_load_String(long __this__nativeId, java.lang.String filename);

/**
Returns the transformation matrix for the element with the given <tt>id</tt>. The matrix is a product of the transformation of the element's parents. The transformation of the element itself is not included. <p>To find the bounding rectangle of the element in logical coordinates, you can apply the matrix on the rectangle returned from {@link com.trolltech.qt.svg.QSvgRenderer#boundsOnElement(java.lang.String) boundsOnElement()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#boundsOnElement(java.lang.String) boundsOnElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix matrixForElement(java.lang.String id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matrixForElement_String(nativeId(), id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_matrixForElement_String(long __this__nativeId, java.lang.String id);

/**
Renders the current document, or the current frame of an animated document, using the given <tt>painter</tt>.
*/

    public final void render(com.trolltech.qt.gui.QPainter p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter(nativeId(), p == null ? 0 : p.nativeId());
    }
    native void __qt_render_QPainter(long __this__nativeId, long p);

/**
Renders the current document, or the current frame of an animated document, using the given <tt>painter</tt> on the specified <tt>bounds</tt> within the painter. If the bounding rectangle is not specified the SVG file is mapped to the whole paint device.
*/

    public final void render(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QRectF bounds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_QRectF(nativeId(), p == null ? 0 : p.nativeId(), bounds == null ? 0 : bounds.nativeId());
    }
    native void __qt_render_QPainter_QRectF(long __this__nativeId, long p, long bounds);


/**
Renders the given element with <tt>elementId</tt> using the given <tt>painter</tt> on the specified <tt>bounds</tt>. If the bounding rectangle is not specified the SVG element is mapped to the whole paint device.
*/

    public final void render(com.trolltech.qt.gui.QPainter p, java.lang.String elementId) {
        render(p, elementId, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF());
    }
/**
Renders the given element with <tt>elementId</tt> using the given <tt>painter</tt> on the specified <tt>bounds</tt>. If the bounding rectangle is not specified the SVG element is mapped to the whole paint device.
*/

    public final void render(com.trolltech.qt.gui.QPainter p, java.lang.String elementId, com.trolltech.qt.core.QRectF bounds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_String_QRectF(nativeId(), p == null ? 0 : p.nativeId(), elementId, bounds == null ? 0 : bounds.nativeId());
    }
    native void __qt_render_QPainter_String_QRectF(long __this__nativeId, long p, java.lang.String elementId, long bounds);

/**
This property holds the current frame of the document's animation, or 0 if the document is not animated. <p><DT><b>See also:</b><br><DD>animationDuration(), {@link QSvgRenderer#framesPerSecond() framesPerSecond}, and {@link com.trolltech.qt.svg.QSvgRenderer#animated() animated()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentFrame")
    @QtBlockedSlot
    public final void setCurrentFrame(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentFrame_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setCurrentFrame_int(long __this__nativeId, int arg__1);

/**
This property holds the number of frames per second to be shown. The number of frames per second is 0 if the current document is not animated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#animated() animated()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="framesPerSecond")
    @QtBlockedSlot
    public final void setFramesPerSecond(int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFramesPerSecond_int(nativeId(), num);
    }
    @QtBlockedSlot
    native void __qt_setFramesPerSecond_int(long __this__nativeId, int num);

/**
This property holds the rectangle specifying the visible area of the document in logical coordinates.
*/

    @QtBlockedSlot
    public final void setViewBox(com.trolltech.qt.core.QRect viewbox)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewBox_QRect(nativeId(), viewbox == null ? 0 : viewbox.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewBox_QRect(long __this__nativeId, long viewbox);

/**
This property holds the rectangle specifying the visible area of the document in logical coordinates.
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewBox")
    @QtBlockedSlot
    public final void setViewBox(com.trolltech.qt.core.QRectF viewbox)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewBox_QRectF(nativeId(), viewbox == null ? 0 : viewbox.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewBox_QRectF(long __this__nativeId, long viewbox);

/**
Returns {@link com.trolltech.qt.svg.QSvgRenderer#viewBoxF() viewBoxF()}.toRect(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer#setViewBox(com.trolltech.qt.core.QRect) setViewBox()}, and {@link com.trolltech.qt.svg.QSvgRenderer#viewBoxF() viewBoxF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect viewBox()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewBox(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_viewBox(long __this__nativeId);

/**
This property holds the rectangle specifying the visible area of the document in logical coordinates.
*/

    @com.trolltech.qt.QtPropertyReader(name="viewBox")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF viewBoxF()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewBoxF(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_viewBoxF(long __this__nativeId);

/**
@exclude
*/

    public static native QSvgRenderer fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSvgRenderer(QPrivateConstructor p) { super(p); } 
}
