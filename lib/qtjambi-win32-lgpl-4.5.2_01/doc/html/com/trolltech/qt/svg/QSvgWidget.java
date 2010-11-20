package com.trolltech.qt.svg;

import com.trolltech.qt.*;



/**
The QSvgWidget class provides a widget that is used to display the contents of Scalable Vector Graphics (SVG) files. This class enables developers to display SVG drawings alongside standard widgets, and is used in much the same way as {@link com.trolltech.qt.gui.QLabel QLabel} is used for displaying text and bitmap images. <p>Since QSvgWidget is a subclass of {@link com.trolltech.qt.gui.QWidget QWidget}, SVG drawings are rendered using the properties of the display. More control can be exercised over the rendering process with the {@link com.trolltech.qt.svg.QSvgRenderer QSvgRenderer} class, as this can be used to paint onto other paint devices, such as {@link com.trolltech.qt.gui.QImage QImage} and {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}. The renderer used by the widget can be obtained with the {@link com.trolltech.qt.svg.QSvgWidget#renderer() renderer()} function. <p>Each QSvgWidget can be constructed with the file name of a SVG file, or they can be constructed without a specific file to render and one can be supplied later. The {@link com.trolltech.qt.svg.QSvgWidget#load(com.trolltech.qt.core.QByteArray) load()} functions provide two different ways to load an SVG file: they accept either the file name of an SVG file or a {@link com.trolltech.qt.core.QByteArray QByteArray} containing the serialized XML representation of an SVG file. <p>By default, the widget provides a size hint to reflect the size of the drawing that it displays. If no data has been loaded, the widget provides the default {@link com.trolltech.qt.gui.QWidget QWidget} size hint. Subclass this class and reimplement sizeHint() if you need to customize this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer QSvgRenderer}, {@link <a href="../qtsvg.html">QtSvg Module</a>}, and {@link com.trolltech.qt.gui.QPicture QPicture}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSvgWidget extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.qt.svg.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a new SVG display widget with the given <tt>parent</tt>.
*/

    public QSvgWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new SVG display widget with the given <tt>parent</tt>.
*/

    public QSvgWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSvgWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgWidget_QWidget(long parent);


/**
Constructs a new SVG display widget with the given <tt>parent</tt> and loads the contents of the specified <tt>file</tt>.
*/

    public QSvgWidget(java.lang.String file) {
        this(file, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new SVG display widget with the given <tt>parent</tt> and loads the contents of the specified <tt>file</tt>.
*/

    public QSvgWidget(java.lang.String file, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSvgWidget_String_QWidget(file, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSvgWidget_String_QWidget(java.lang.String file, long parent);

/**
Loads the specified SVG format <tt>contents</tt> and updates the widget.
*/

    public final void load(com.trolltech.qt.core.QByteArray contents)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_load_QByteArray(nativeId(), contents == null ? 0 : contents.nativeId());
    }
    native void __qt_load_QByteArray(long __this__nativeId, long contents);

/**
Loads the contents of the specified SVG <tt>file</tt> and updates the widget.
*/

    public final void load(java.lang.String file)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_load_String(nativeId(), file);
    }
    native void __qt_load_String(long __this__nativeId, java.lang.String file);

/**
Returns the renderer used to display the contents of the widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.svg.QSvgRenderer renderer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_renderer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.svg.QSvgRenderer __qt_renderer(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QSvgWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSvgWidget(QPrivateConstructor p) { super(p); } 
}
