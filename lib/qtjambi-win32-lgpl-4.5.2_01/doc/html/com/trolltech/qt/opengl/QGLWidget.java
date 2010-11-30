package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLWidget class is a widget for rendering OpenGL graphics. QGLWidget provides functionality for displaying OpenGL graphics integrated into a Qt application. It is very simple to use. You inherit from it and use the subclass like any other {@link com.trolltech.qt.gui.QWidget QWidget}, except that you have the choice between using {@link com.trolltech.qt.gui.QPainter QPainter} and standard OpenGL rendering commands. <p>QGLWidget provides three convenient virtual functions that you can reimplement in your subclass to perform the typical OpenGL tasks: <ul><li> {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} - Renders the OpenGL scene. Gets called whenever the widget needs to be updated.</li><li> {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()} - Sets up the OpenGL viewport, projection, etc. Gets called whenever the the widget has been resized (and also when it is shown for the first time because all newly created widgets get a resize event automatically).</li><li> {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} - Sets up the OpenGL rendering context, defines display lists, etc. Gets called once before the first time {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()} or {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} is called.</li></ul> Here is a rough outline of how a QGLWidget subclass might look: <pre class="snippet">
    class MyGLDrawer extends QGLWidget
    {
        GL func = null;
        GLContext ctx = null;

        public MyGLDrawer(QWidget parent)
        {
        super(parent);
        }

        protected void initializeGL()
        {
        GLDrawableFactory factory = GLDrawableFactory.getFactory();
        ctx = factory.createExternalGLContext();
        func = ctx.getGL();

        // Set up the rendering context, define display lists etc.:
        // ...
        func.glClearColor(0, 0, 0, 0);
        func.glEnable(GL.GL_DEPTH_TEST);
        // ...
        }

        protected void resizeGL(int w, int h)
        {
        // setup viewport, projection etc.:
        func.glViewport(0, 0, w, h);
        // ...
        func.glFrustum(0.0, 1.0, 0.0, 1.0, 1.0, 2.0);
        // ...
        }

        protected void paintGL()
        {
        // draw the scene:
        // ...
        func.glRotatef(10, 0, 1, 0);
        func.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, 1);
        func.glBegin(GL.GL_QUADS);
        func.glVertex3f(1, 1, 1);
        func.glVertex3f(1, 2, 1);
        // ...
        func.glEnd();
        // ...
        }

    }
</pre> If you need to trigger a repaint from places other than {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} (a typical example is when using {@link com.trolltech.qt.core.QTimer timers} to animate scenes), you should call the widget's {@link com.trolltech.qt.opengl.QGLWidget#updateGL() updateGL()} function. <p>Your widget's OpenGL rendering context is made current when {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, or {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} is called. If you need to call the standard OpenGL API functions from other places (e.g. in your widget's constructor or in your own paint functions), you must call {@link com.trolltech.qt.opengl.QGLWidget#makeCurrent() makeCurrent()} first. <p>QGLWidget provides functions for requesting a new display {@link com.trolltech.qt.opengl.QGLFormat format} and you can also create widgets with customized rendering {@link com.trolltech.qt.opengl.QGLContext contexts}. <p>You can also share OpenGL display lists between QGLWidgets (see the documentation of the QGLWidget constructors for details). <p>Note that under Windows, the {@link com.trolltech.qt.opengl.QGLContext QGLContext} belonging to a QGLWidget has to be recreated when the QGLWidget is reparented. This is necessary due to limitations on the Windows platform. This will most likely cause problems for users that have subclassed and installed their own {@link com.trolltech.qt.opengl.QGLContext QGLContext} on a QGLWidget. It is possible to work around this issue by putting the QGLWidget inside a dummy widget and then reparenting the dummy widget, instead of the QGLWidget. This will side-step the issue altogether, and is what we recommend for users that need this kind of functionality.<a name="overlays"><h2>Overlays</h2> The QGLWidget creates a GL overlay context in addition to the normal context if overlays are supported by the underlying system. <p>If you want to use overlays, you specify it in the {@link com.trolltech.qt.opengl.QGLFormat format}. (Note: Overlay must be requested in the format passed to the QGLWidget constructor.) Your GL widget should also implement some or all of these virtual methods: <ul><li> {@link com.trolltech.qt.opengl.QGLWidget#paintOverlayGL() paintOverlayGL()}</li><li> {@link com.trolltech.qt.opengl.QGLWidget#resizeOverlayGL(int, int) resizeOverlayGL()}</li><li> {@link com.trolltech.qt.opengl.QGLWidget#initializeOverlayGL() initializeOverlayGL()}</li></ul> These methods work in the same way as the normal {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} etc. functions, except that they will be called when the overlay context is made current. You can explicitly make the overlay context current by using {@link com.trolltech.qt.opengl.QGLWidget#makeOverlayCurrent() makeOverlayCurrent()}, and you can access the overlay context directly (e.g. to ask for its transparent color) by calling {@link com.trolltech.qt.opengl.QGLWidget#overlayContext() overlayContext()}. <p>On X servers in which the default visual is in an overlay plane, non-GL Qt windows can also be used for overlays.<a name="painting-techniques"><h2>Painting Techniques</h2> As described above, subclass QGLWidget to render pure 3D content in the following way: <ul><li> Reimplement the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() QGLWidget::initializeGL()} and {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) QGLWidget::resizeGL()} to set up the OpenGL state and provide a perspective transformation.</li><li> Reimplement {@link com.trolltech.qt.opengl.QGLWidget#paintGL() QGLWidget::paintGL()} to paint the 3D scene, calling only OpenGL functions to draw on the widget.</li></ul> It is also possible to draw 2D graphics onto a QGLWidget subclass, it is necessary to reimplement QGLWidget::paintEvent() and do the following: <ul><li> Construct a {@link com.trolltech.qt.gui.QPainter QPainter} object.</li><li> Initialize it for use on the widget with the {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} function.</li><li> Draw primitives using {@link com.trolltech.qt.gui.QPainter QPainter}'s member functions.</li><li> Call {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} to finish painting.</li></ul> Overpainting 2D content on top of 3D content takes a little more effort. One approach to doing this is shown in the {@link <a href="../opengl-overpainting.html">Overpainting</a>} example. <p>OpenGL is a trademark of Silicon Graphics, Inc. in the United States and other countries. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer QGLPixelBuffer}, {@link <a href="../opengl-hellogl.html">Hello GL Example</a>}, {@link <a href="../qtjambi-2dpainting.html">2D Painting Example</a>}, {@link <a href="../opengl-overpainting.html">Overpainting Example</a>}, and {@link <a href="../opengl-grabber.html">Grabber Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGLWidget extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLContext context, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(context, parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>context</tt> argument is a pointer to the {@link com.trolltech.qt.opengl.QGLContext QGLContext} that you wish to be bound to this widget. This allows you to pass in your own {@link com.trolltech.qt.opengl.QGLContext QGLContext} sub-classes. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLContext context, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget) {
        this(context, parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>context</tt> argument is a pointer to the {@link com.trolltech.qt.opengl.QGLContext QGLContext} that you wish to be bound to this widget. This allows you to pass in your own {@link com.trolltech.qt.opengl.QGLContext QGLContext} sub-classes. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLContext context, com.trolltech.qt.gui.QWidget parent) {
        this(context, parent, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>context</tt> argument is a pointer to the {@link com.trolltech.qt.opengl.QGLContext QGLContext} that you wish to be bound to this widget. This allows you to pass in your own {@link com.trolltech.qt.opengl.QGLContext QGLContext} sub-classes. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLContext context) {
        this(context, (com.trolltech.qt.gui.QWidget)null, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>context</tt> argument is a pointer to the {@link com.trolltech.qt.opengl.QGLContext QGLContext} that you wish to be bound to this widget. This allows you to pass in your own {@link com.trolltech.qt.opengl.QGLContext QGLContext} sub-classes. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLContext context, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QGLWidget_QGLContext_QWidget_QGLWidget_WindowFlags(context == null ? 0 : context.nativeId(), parent == null ? 0 : parent.nativeId(), shareWidget == null ? 0 : shareWidget.nativeId(), f.value());
    }

    native void __qt_QGLWidget_QGLContext_QWidget_QGLWidget_WindowFlags(long context, long parent, long shareWidget, int f);


/**
This is an overloaded method provided for convenience.
*/

    public QGLWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs an OpenGL widget with a <tt>parent</tt> widget. <p>The {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link <a href="../opengl-textures.html">Textures Example</a>}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget) {
        this(parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with a <tt>parent</tt> widget. <p>The {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link <a href="../opengl-textures.html">Textures Example</a>}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.gui.QWidget parent) {
        this(parent, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with a <tt>parent</tt> widget. <p>The {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link <a href="../opengl-textures.html">Textures Example</a>}. <br></DD></DT>
*/

    public QGLWidget() {
        this((com.trolltech.qt.gui.QWidget)null, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs an OpenGL widget with a <tt>parent</tt> widget. <p>The {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link <a href="../opengl-textures.html">Textures Example</a>}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QGLWidget_QWidget_QGLWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), shareWidget == null ? 0 : shareWidget.nativeId(), f.value());
    }

    native void __qt_QGLWidget_QWidget_QGLWidget_WindowFlags(long parent, long shareWidget, int f);


/**
This is an overloaded method provided for convenience.
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(format, parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>format</tt> argument specifies the desired {@link com.trolltech.qt.opengl.QGLFormat rendering options}. If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLWidget#format() format()} method will return the actual format obtained. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget) {
        this(format, parent, shareWidget, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>format</tt> argument specifies the desired {@link com.trolltech.qt.opengl.QGLFormat rendering options}. If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLWidget#format() format()} method will return the actual format obtained. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.gui.QWidget parent) {
        this(format, parent, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>format</tt> argument specifies the desired {@link com.trolltech.qt.opengl.QGLFormat rendering options}. If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLWidget#format() format()} method will return the actual format obtained. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLFormat format) {
        this(format, (com.trolltech.qt.gui.QWidget)null, (com.trolltech.qt.opengl.QGLWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs an OpenGL widget with parent <tt>parent</tt>. <p>The <tt>format</tt> argument specifies the desired {@link com.trolltech.qt.opengl.QGLFormat rendering options}. If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLWidget#format() format()} method will return the actual format obtained. <p>The widget will be {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid} if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}. <p>The <tt>parent</tt> and widget flag, <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>If <tt>shareWidget</tt> is a valid QGLWidget, this widget will share OpenGL display lists and texture objects with <tt>shareWidget</tt>. But if <tt>shareWidget</tt> and this widget have different {@link com.trolltech.qt.opengl.QGLWidget#format() formats}, sharing might not be possible. You can check whether sharing is in effect by calling {@link com.trolltech.qt.opengl.QGLWidget#isSharing() isSharing()}. <p>The initialization of OpenGL rendering state, etc. should be done by overriding the {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} function, rather than in the constructor of your QGLWidget subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() QGLFormat::defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}. <br></DD></DT>
*/

    public QGLWidget(com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.opengl.QGLWidget shareWidget, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QGLWidget_QGLFormat_QWidget_QGLWidget_WindowFlags(format == null ? 0 : format.nativeId(), parent == null ? 0 : parent.nativeId(), shareWidget == null ? 0 : shareWidget.nativeId(), f.value());
    }

    native void __qt_QGLWidget_QGLFormat_QWidget_QGLWidget_WindowFlags(long format, long parent, long shareWidget, int f);

/**
Returns true if the widget is doing automatic GL buffer swapping; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#setAutoBufferSwap(boolean) setAutoBufferSwap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean autoBufferSwap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoBufferSwap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoBufferSwap(long __this__nativeId);


/**
Calls QGLContext.::bindTexture(<tt>image</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image, int target) {
        return bindTexture(image, target, (int)0x1908);
    }

/**
Calls QGLContext.::bindTexture(<tt>image</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image) {
        return bindTexture(image, (int)0x0DE1, (int)0x1908);
    }
/**
Calls QGLContext.::bindTexture(<tt>image</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image, int target, int format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QImage_int_int(nativeId(), image == null ? 0 : image.nativeId(), target, format);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QImage_int_int(long __this__nativeId, long image, int target, int format);


/**
Calls QGLContext.::bindTexture(<tt>pixmap</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap, int target) {
        return bindTexture(pixmap, target, (int)0x1908);
    }

/**
Calls QGLContext.::bindTexture(<tt>pixmap</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap) {
        return bindTexture(pixmap, (int)0x0DE1, (int)0x1908);
    }
/**
Calls QGLContext.::bindTexture(<tt>pixmap</tt>, <tt>target</tt>, <tt>format</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap, int target, int format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QPixmap_int_int(nativeId(), pixmap == null ? 0 : pixmap.nativeId(), target, format);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QPixmap_int_int(long __this__nativeId, long pixmap, int target, int format);

/**
This is an overloaded member function, provided for convenience. <p>Calls QGLContext::bindTexture(<tt>fileName</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(java.lang.String fileName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_String(long __this__nativeId, java.lang.String fileName);

/**
Returns the colormap for this widget. <p>Usually it is only top-level widgets that can have different colormaps installed. Asking for the colormap of a child widget will return the colormap for the child's top-level widget. <p>If no colormap has been set for this widget, the {@link com.trolltech.qt.gui.QColormap QColormap} returned will be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#setColormap(com.trolltech.qt.opengl.QGLColormap) setColormap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLColormap colormap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colormap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLColormap __qt_colormap(long __this__nativeId);

/**
Returns the context of this widget. <p>It is possible that the context is not valid (see {@link com.trolltech.qt.opengl.QGLWidget#isValid() isValid()}), for example, if the underlying hardware does not support the format attributes that were requested.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLContext context()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_context(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLContext __qt_context(long __this__nativeId);

/**
Calls QGLContext.:deleteTexture(<tt>id</tt>) on the currently set context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#bindTexture(com.trolltech.qt.gui.QImage, int) bindTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void deleteTexture(int tx_id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteTexture_int(nativeId(), tx_id);
    }
    @QtBlockedSlot
    native void __qt_deleteTexture_int(long __this__nativeId, int tx_id);

/**
Makes no GL context the current context. Normally, you do not need to call this function; {@link com.trolltech.qt.opengl.QGLContext QGLContext} calls it as necessary. However, it may be useful in multithreaded environments.
*/

    @QtBlockedSlot
    public final void doneCurrent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doneCurrent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_doneCurrent(long __this__nativeId);

/**
Returns true if the contained GL rendering context has double buffering; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#doubleBuffer() QGLFormat::doubleBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean doubleBuffer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleBuffer(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_doubleBuffer(long __this__nativeId);


/**
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId) {
        drawTexture(point, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId, int textureTarget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTexture_QPointF_int_int(nativeId(), point == null ? 0 : point.nativeId(), textureId, textureTarget);
    }
    @QtBlockedSlot
    native void __qt_drawTexture_QPointF_int_int(long __this__nativeId, long point, int textureId, int textureTarget);


/**
Draws the given texture, <tt>textureId</tt> to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QRectF target, int textureId) {
        drawTexture(target, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt> to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QRectF target, int textureId, int textureTarget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTexture_QRectF_int_int(nativeId(), target == null ? 0 : target.nativeId(), textureId, textureTarget);
    }
    @QtBlockedSlot
    native void __qt_drawTexture_QRectF_int_int(long __this__nativeId, long target, int textureId, int textureTarget);

/**
Returns the format of the contained GL rendering context. <p><DT><b>See also:</b><br><DD>setFormat(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLFormat format()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLFormat __qt_format(long __this__nativeId);


/**
Returns an image of the frame buffer. If <tt>withAlpha</tt> is true the alpha channel is included. <p>Depending on your hardware, you can explicitly select which color buffer to grab with a glReadBuffer() call before calling this function.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage grabFrameBuffer() {
        return grabFrameBuffer((boolean)false);
    }
/**
Returns an image of the frame buffer. If <tt>withAlpha</tt> is true the alpha channel is included. <p>Depending on your hardware, you can explicitly select which color buffer to grab with a glReadBuffer() call before calling this function.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage grabFrameBuffer(boolean withAlpha)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_grabFrameBuffer_boolean(nativeId(), withAlpha);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_grabFrameBuffer_boolean(long __this__nativeId, boolean withAlpha);

/**
Returns true if this widget's GL context is shared with another GL context, otherwise false is returned. Context sharing might not be possible if the QGLWidgets use different formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSharing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSharing(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSharing(long __this__nativeId);

/**
Returns true if the widget has a valid GL rendering context; otherwise returns false. A widget will be invalid if the system has no {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() OpenGL support}.
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
Makes this widget the current widget for OpenGL operations, i.e. makes the widget's rendering context the current OpenGL rendering context.
*/

    @QtBlockedSlot
    public final void makeCurrent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_makeCurrent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_makeCurrent(long __this__nativeId);

/**
Makes the overlay context of this widget current. Use this if you need to issue OpenGL commands to the overlay context outside of {@link com.trolltech.qt.opengl.QGLWidget#initializeOverlayGL() initializeOverlayGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeOverlayGL(int, int) resizeOverlayGL()}, and {@link com.trolltech.qt.opengl.QGLWidget#paintOverlayGL() paintOverlayGL()}. <p>Does nothing if this widget has no overlay. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#makeCurrent() makeCurrent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void makeOverlayCurrent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_makeOverlayCurrent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_makeOverlayCurrent(long __this__nativeId);

/**
Returns the overlay context of this widget, or 0 if this widget has no overlay. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#context() context()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLContext overlayContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_overlayContext(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLContext __qt_overlayContext(long __this__nativeId);

/**
Convenience function for specifying the clearing color to OpenGL. Calls glClearColor (in RGBA mode) or glClearIndex (in color-index mode) with the color <tt>c</tt>. Applies to this widgets GL context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#qglColor(com.trolltech.qt.gui.QColor) qglColor()}, {@link com.trolltech.qt.opengl.QGLContext#currentContext() QGLContext::currentContext()}, and {@link com.trolltech.qt.gui.QColor QColor}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void qglClearColor(com.trolltech.qt.gui.QColor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_qglClearColor_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native void __qt_qglClearColor_QColor(long __this__nativeId, long c);

/**
Convenience function for specifying a drawing color to OpenGL. Calls glColor4 (in RGBA mode) or glIndex (in color-index mode) with the color <tt>c</tt>. Applies to this widgets GL context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#qglClearColor(com.trolltech.qt.gui.QColor) qglClearColor()}, {@link com.trolltech.qt.opengl.QGLContext#currentContext() QGLContext::currentContext()}, and {@link com.trolltech.qt.gui.QColor QColor}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void qglColor(com.trolltech.qt.gui.QColor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_qglColor_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native void __qt_qglColor_QColor(long __this__nativeId, long c);


/**
Renders the current scene on a pixmap and returns the pixmap. <p>You can use this method on both visible and invisible QGLWidgets. <p>This method will create a pixmap and a temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} to render on the pixmap. It will then call {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, and {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} on this context. Finally, the widget's original GL context is restored. <p>The size of the pixmap will be <tt>w</tt> pixels wide and <tt>h</tt> pixels high unless one of these parameters is 0 (the default), in which case the pixmap will have the same size as the widget. <p>If <tt>useContext</tt> is true, this method will try to be more efficient by using the existing GL context to render the pixmap. The default is false. Only use true if you understand the risks. Note that under Windows a temporary context has to be created and usage of the useContext parameter is not supported. <p>Overlays are not rendered onto the pixmap. <p>If the GL rendering context and the desktop have different bit depths, the result will most likely look surprising. <p>Note that the creation of display lists, modifications of the view frustum etc. should be done from within {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}. If this is not done, the temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} will not be initialized properly, and the rendered pixmap may be incomplete/corrupted.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap renderPixmap(int w, int h) {
        return renderPixmap(w, h, (boolean)false);
    }

/**
Renders the current scene on a pixmap and returns the pixmap. <p>You can use this method on both visible and invisible QGLWidgets. <p>This method will create a pixmap and a temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} to render on the pixmap. It will then call {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, and {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} on this context. Finally, the widget's original GL context is restored. <p>The size of the pixmap will be <tt>w</tt> pixels wide and <tt>h</tt> pixels high unless one of these parameters is 0 (the default), in which case the pixmap will have the same size as the widget. <p>If <tt>useContext</tt> is true, this method will try to be more efficient by using the existing GL context to render the pixmap. The default is false. Only use true if you understand the risks. Note that under Windows a temporary context has to be created and usage of the useContext parameter is not supported. <p>Overlays are not rendered onto the pixmap. <p>If the GL rendering context and the desktop have different bit depths, the result will most likely look surprising. <p>Note that the creation of display lists, modifications of the view frustum etc. should be done from within {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}. If this is not done, the temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} will not be initialized properly, and the rendered pixmap may be incomplete/corrupted.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap renderPixmap(int w) {
        return renderPixmap(w, (int)0, (boolean)false);
    }

/**
Renders the current scene on a pixmap and returns the pixmap. <p>You can use this method on both visible and invisible QGLWidgets. <p>This method will create a pixmap and a temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} to render on the pixmap. It will then call {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, and {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} on this context. Finally, the widget's original GL context is restored. <p>The size of the pixmap will be <tt>w</tt> pixels wide and <tt>h</tt> pixels high unless one of these parameters is 0 (the default), in which case the pixmap will have the same size as the widget. <p>If <tt>useContext</tt> is true, this method will try to be more efficient by using the existing GL context to render the pixmap. The default is false. Only use true if you understand the risks. Note that under Windows a temporary context has to be created and usage of the useContext parameter is not supported. <p>Overlays are not rendered onto the pixmap. <p>If the GL rendering context and the desktop have different bit depths, the result will most likely look surprising. <p>Note that the creation of display lists, modifications of the view frustum etc. should be done from within {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}. If this is not done, the temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} will not be initialized properly, and the rendered pixmap may be incomplete/corrupted.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap renderPixmap() {
        return renderPixmap((int)0, (int)0, (boolean)false);
    }
/**
Renders the current scene on a pixmap and returns the pixmap. <p>You can use this method on both visible and invisible QGLWidgets. <p>This method will create a pixmap and a temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} to render on the pixmap. It will then call {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}, {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, and {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} on this context. Finally, the widget's original GL context is restored. <p>The size of the pixmap will be <tt>w</tt> pixels wide and <tt>h</tt> pixels high unless one of these parameters is 0 (the default), in which case the pixmap will have the same size as the widget. <p>If <tt>useContext</tt> is true, this method will try to be more efficient by using the existing GL context to render the pixmap. The default is false. Only use true if you understand the risks. Note that under Windows a temporary context has to be created and usage of the useContext parameter is not supported. <p>Overlays are not rendered onto the pixmap. <p>If the GL rendering context and the desktop have different bit depths, the result will most likely look surprising. <p>Note that the creation of display lists, modifications of the view frustum etc. should be done from within {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}. If this is not done, the temporary {@link com.trolltech.qt.opengl.QGLContext QGLContext} will not be initialized properly, and the rendered pixmap may be incomplete/corrupted.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap renderPixmap(int w, int h, boolean useContext)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_renderPixmap_int_int_boolean(nativeId(), w, h, useContext);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_renderPixmap_int_int_boolean(long __this__nativeId, int w, int h, boolean useContext);


/**
This is an overloaded member function, provided for convenience. <p><tt>x</tt>, <tt>y</tt> and <tt>z</tt> are specified in scene or object coordinates relative to the currently set projection and model matrices. This can be useful if you want to annotate models with text labels and have the labels move with the model as it is rotated etc.
*/

    @QtBlockedSlot
    public final void renderText(double x, double y, double z, java.lang.String str, com.trolltech.qt.gui.QFont fnt) {
        renderText(x, y, z, str, fnt, (int)2000);
    }

/**
This is an overloaded member function, provided for convenience. <p><tt>x</tt>, <tt>y</tt> and <tt>z</tt> are specified in scene or object coordinates relative to the currently set projection and model matrices. This can be useful if you want to annotate models with text labels and have the labels move with the model as it is rotated etc.
*/

    @QtBlockedSlot
    public final void renderText(double x, double y, double z, java.lang.String str) {
        renderText(x, y, z, str, (com.trolltech.qt.gui.QFont)new com.trolltech.qt.gui.QFont(), (int)2000);
    }
/**
This is an overloaded member function, provided for convenience. <p><tt>x</tt>, <tt>y</tt> and <tt>z</tt> are specified in scene or object coordinates relative to the currently set projection and model matrices. This can be useful if you want to annotate models with text labels and have the labels move with the model as it is rotated etc.
*/

    @QtBlockedSlot
    public final void renderText(double x, double y, double z, java.lang.String str, com.trolltech.qt.gui.QFont fnt, int listBase)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_renderText_double_double_double_String_QFont_int(nativeId(), x, y, z, str, fnt == null ? 0 : fnt.nativeId(), listBase);
    }
    @QtBlockedSlot
    native void __qt_renderText_double_double_double_String_QFont_int(long __this__nativeId, double x, double y, double z, java.lang.String str, long fnt, int listBase);


/**
Renders the string <tt>str</tt> into the GL context of this widget. <p><tt>x</tt> and <tt>y</tt> are specified in window coordinates, with the origin in the upper left-hand corner of the window. If <tt>font</tt> is not specified, the currently set application font will be used to render the string. To change the color of the rendered text you can use the glColor() call (or the {@link com.trolltech.qt.opengl.QGLWidget#qglColor(com.trolltech.qt.gui.QColor) qglColor()} convenience function), just before the {@link com.trolltech.qt.opengl.QGLWidget#renderText(double, double, double, java.lang.String, com.trolltech.qt.gui.QFont) renderText()} call. <p>The <tt>listBase</tt> parameter is obsolete and will be removed in a future version of Qt. <p><b>Note:</b> This function clears the stencil buffer.
*/

    @QtBlockedSlot
    public final void renderText(int x, int y, java.lang.String str, com.trolltech.qt.gui.QFont fnt) {
        renderText(x, y, str, fnt, (int)2000);
    }

/**
Renders the string <tt>str</tt> into the GL context of this widget. <p><tt>x</tt> and <tt>y</tt> are specified in window coordinates, with the origin in the upper left-hand corner of the window. If <tt>font</tt> is not specified, the currently set application font will be used to render the string. To change the color of the rendered text you can use the glColor() call (or the {@link com.trolltech.qt.opengl.QGLWidget#qglColor(com.trolltech.qt.gui.QColor) qglColor()} convenience function), just before the {@link com.trolltech.qt.opengl.QGLWidget#renderText(double, double, double, java.lang.String, com.trolltech.qt.gui.QFont) renderText()} call. <p>The <tt>listBase</tt> parameter is obsolete and will be removed in a future version of Qt. <p><b>Note:</b> This function clears the stencil buffer.
*/

    @QtBlockedSlot
    public final void renderText(int x, int y, java.lang.String str) {
        renderText(x, y, str, (com.trolltech.qt.gui.QFont)new com.trolltech.qt.gui.QFont(), (int)2000);
    }
/**
Renders the string <tt>str</tt> into the GL context of this widget. <p><tt>x</tt> and <tt>y</tt> are specified in window coordinates, with the origin in the upper left-hand corner of the window. If <tt>font</tt> is not specified, the currently set application font will be used to render the string. To change the color of the rendered text you can use the glColor() call (or the {@link com.trolltech.qt.opengl.QGLWidget#qglColor(com.trolltech.qt.gui.QColor) qglColor()} convenience function), just before the {@link com.trolltech.qt.opengl.QGLWidget#renderText(double, double, double, java.lang.String, com.trolltech.qt.gui.QFont) renderText()} call. <p>The <tt>listBase</tt> parameter is obsolete and will be removed in a future version of Qt. <p><b>Note:</b> This function clears the stencil buffer.
*/

    @QtBlockedSlot
    public final void renderText(int x, int y, java.lang.String str, com.trolltech.qt.gui.QFont fnt, int listBase)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_renderText_int_int_String_QFont_int(nativeId(), x, y, str, fnt == null ? 0 : fnt.nativeId(), listBase);
    }
    @QtBlockedSlot
    native void __qt_renderText_int_int_String_QFont_int(long __this__nativeId, int x, int y, java.lang.String str, long fnt, int listBase);

/**
If <tt>on</tt> is true automatic GL buffer swapping is switched on; otherwise it is switched off. <p>If <tt>on</tt> is true and the widget is using a double-buffered format, the background and foreground GL buffers will automatically be swapped after each {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} call. <p>The buffer auto-swapping is on by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#autoBufferSwap() autoBufferSwap()}, {@link com.trolltech.qt.opengl.QGLWidget#doubleBuffer() doubleBuffer()}, and {@link com.trolltech.qt.opengl.QGLWidget#swapBuffers() swapBuffers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setAutoBufferSwap(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoBufferSwap_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setAutoBufferSwap_boolean(long __this__nativeId, boolean on);

/**
Set the colormap for this widget to <tt>cmap</tt>. Usually it is only top-level widgets that can have colormaps installed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#colormap() colormap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColormap(com.trolltech.qt.opengl.QGLColormap map)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColormap_QGLColormap(nativeId(), map == null ? 0 : map.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColormap_QGLColormap(long __this__nativeId, long map);

/**
Swaps the screen contents with an off-screen buffer. This only works if the widget's format specifies double buffer mode. <p>Normally, there is no need to explicitly call this function because it is done automatically after each widget repaint, i.e. each time after {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} has been executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#doubleBuffer() doubleBuffer()}, {@link com.trolltech.qt.opengl.QGLWidget#setAutoBufferSwap(boolean) setAutoBufferSwap()}, and {@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) QGLFormat::setDoubleBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void swapBuffers()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_swapBuffers(nativeId());
    }
    @QtBlockedSlot
    native void __qt_swapBuffers(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
Executes the virtual function {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()}. <p>The widget's rendering context will become the current context and {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} will be called if it hasn't already been called.
*/

    @QtBlockedSlot
    protected void glDraw()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_glDraw(nativeId());
    }
    @QtBlockedSlot
    native void __qt_glDraw(long __this__nativeId);

/**
Initializes OpenGL for this widget's context. Calls the virtual function {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()}.
*/

    @QtBlockedSlot
    protected void glInit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_glInit(nativeId());
    }
    @QtBlockedSlot
    native void __qt_glInit(long __this__nativeId);

/**
This virtual function is called once before the first call to {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} or {@link com.trolltech.qt.opengl.QGLWidget#resizeGL(int, int) resizeGL()}, and then once whenever the widget has been assigned a new {@link com.trolltech.qt.opengl.QGLContext QGLContext}. Reimplement it in a subclass. <p>This function should set up any required OpenGL context rendering flags, defining display lists, etc. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeCurrent() makeCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void initializeGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeGL(nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializeGL(long __this__nativeId);

/**
This virtual function is used in the same manner as {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} except that it operates on the widget's overlay context instead of the widget's main context. This means that {@link com.trolltech.qt.opengl.QGLWidget#initializeOverlayGL() initializeOverlayGL()} is called once before the first call to {@link com.trolltech.qt.opengl.QGLWidget#paintOverlayGL() paintOverlayGL()} or {@link com.trolltech.qt.opengl.QGLWidget#resizeOverlayGL(int, int) resizeOverlayGL()}. Reimplement it in a subclass. <p>This function should set up any required OpenGL context rendering flags, defining display lists, etc. for the overlay context. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeOverlayCurrent() makeOverlayCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void initializeOverlayGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeOverlayGL(nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializeOverlayGL(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

/**
This virtual function is called whenever the widget needs to be painted. Reimplement it in a subclass. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeCurrent() makeCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void paintGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintGL(nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintGL(long __this__nativeId);

/**
This virtual function is used in the same manner as {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} except that it operates on the widget's overlay context instead of the widget's main context. This means that {@link com.trolltech.qt.opengl.QGLWidget#paintOverlayGL() paintOverlayGL()} is called whenever the widget's overlay needs to be painted. Reimplement it in a subclass. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeOverlayCurrent() makeOverlayCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void paintOverlayGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintOverlayGL(nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintOverlayGL(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

/**
This virtual function is called whenever the widget has been resized. The new size is passed in <tt>width</tt> and <tt>height</tt>. Reimplement it in a subclass. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeCurrent() makeCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void resizeGL(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeGL_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_resizeGL_int_int(long __this__nativeId, int w, int h);

/**
This virtual function is used in the same manner as {@link com.trolltech.qt.opengl.QGLWidget#paintGL() paintGL()} except that it operates on the widget's overlay context instead of the widget's main context. This means that {@link com.trolltech.qt.opengl.QGLWidget#resizeOverlayGL(int, int) resizeOverlayGL()} is called whenever the widget has been resized. The new size is passed in <tt>width</tt> and <tt>height</tt>. Reimplement it in a subclass. <p>There is no need to call {@link com.trolltech.qt.opengl.QGLWidget#makeOverlayCurrent() makeOverlayCurrent()} because this has already been done when this function is called.
*/

    @QtBlockedSlot
    protected void resizeOverlayGL(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeOverlayGL_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_resizeOverlayGL_int_int(long __this__nativeId, int w, int h);

/**
Updates the widget by calling {@link com.trolltech.qt.opengl.QGLWidget#glDraw() glDraw()}.
*/

    public void updateGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGL(nativeId());
    }
    native void __qt_updateGL(long __this__nativeId);

/**
Updates the widget's overlay (if any). Will cause the virtual function {@link com.trolltech.qt.opengl.QGLWidget#paintOverlayGL() paintOverlayGL()} to be executed. <p>The widget's rendering context will become the current context and {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() initializeGL()} will be called if it hasn't already been called.
*/

    public void updateOverlayGL()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateOverlayGL(nativeId());
    }
    native void __qt_updateOverlayGL(long __this__nativeId);

/**
Converts the image <tt>img</tt> into the unnamed format expected by OpenGL functions such as glTexImage2D(). The returned image is not usable as a {@link com.trolltech.qt.gui.QImage QImage}, but {@link com.trolltech.qt.gui.QImage#width() QImage::width()}, {@link com.trolltech.qt.gui.QImage#height() QImage::height()} and {@link com.trolltech.qt.gui.QImage#bits() QImage::bits()} may be used with OpenGL. The GL format used is <tt>GL_RGBA</tt>.
*/

    public static com.trolltech.qt.gui.QImage convertToGLFormat(com.trolltech.qt.gui.QImage img)    {
        return __qt_convertToGLFormat_QImage(img == null ? 0 : img.nativeId());
    }
    native static com.trolltech.qt.gui.QImage __qt_convertToGLFormat_QImage(long img);

/**
@exclude
*/

    public static native QGLWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLWidget(QPrivateConstructor p) { super(p); } 
}
