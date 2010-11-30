package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLContext class encapsulates an OpenGL rendering context. An OpenGL rendering context is a complete set of OpenGL state variables. The rendering context's {@link com.trolltech.qt.opengl.QGL.FormatOption format } is set in the constructor, but it can also be set later with {@link com.trolltech.qt.opengl.QGLContext#setFormat(com.trolltech.qt.opengl.QGLFormat) setFormat()}. The format options that are actually set are returned by {@link com.trolltech.qt.opengl.QGLContext#format() format()}; the options you asked for are returned by {@link com.trolltech.qt.opengl.QGLContext#requestedFormat() requestedFormat()}. Note that after a QGLContext object has been constructed, the actual OpenGL context must be created by explicitly calling the {@link com.trolltech.qt.opengl.QGLContext#create() create()} function. The {@link com.trolltech.qt.opengl.QGLContext#makeCurrent() makeCurrent()} function makes this context the current rendering context. You can make no context current using {@link com.trolltech.qt.opengl.QGLContext#doneCurrent() doneCurrent()}. The {@link com.trolltech.qt.opengl.QGLContext#reset() reset()} function will reset the context and make it invalid. <p>You can examine properties of the context with, e.g. {@link com.trolltech.qt.opengl.QGLContext#isValid() isValid()}, {@link com.trolltech.qt.opengl.QGLContext#isSharing() isSharing()}, {@link com.trolltech.qt.opengl.QGLContext#initialized() initialized()}, {@link com.trolltech.qt.opengl.QGLContext#windowCreated() windowCreated()} and {@link com.trolltech.qt.opengl.QGLContext#overlayTransparentColor() overlayTransparentColor()}. <p>If you're using double buffering you can swap the screen contents with the off-screen buffer using {@link com.trolltech.qt.opengl.QGLContext#swapBuffers() swapBuffers()}. <p>Please note that QGLContext is not thread safe.
*/
@QtJambiGeneratedClass
public class QGLContext extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an OpenGL context with the given <tt>format</tt> which specifies several display options for the context. <p>If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLContext#format() format()} method will return the actual format obtained. <p>Note that after a QGLContext object has been constructed, {@link com.trolltech.qt.opengl.QGLContext#create() create()} must be called explicitly to create the actual OpenGL context. The context will be {@link com.trolltech.qt.opengl.QGLContext#isValid() invalid} if it was not possible to obtain a GL context at all. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#format() format()}, and {@link com.trolltech.qt.opengl.QGLContext#isValid() isValid()}. <br></DD></DT>
*/

    public QGLContext(com.trolltech.qt.opengl.QGLFormat format){
        super((QPrivateConstructor)null);
        __qt_QGLContext_QGLFormat(format == null ? 0 : format.nativeId());
    }

    native void __qt_QGLContext_QGLFormat(long format);

/**
Constructs an OpenGL context for the given paint <tt>device</tt>, which can be a widget or a pixmap. The <tt>format</tt> specifies several display options for the context. <p>If the underlying OpenGL/Window system cannot satisfy all the features requested in <tt>format</tt>, the nearest subset of features will be used. After creation, the {@link com.trolltech.qt.opengl.QGLContext#format() format()} method will return the actual format obtained. <p>Note that after a QGLContext object has been constructed, {@link com.trolltech.qt.opengl.QGLContext#create() create()} must be called explicitly to create the actual OpenGL context. The context will be {@link com.trolltech.qt.opengl.QGLContext#isValid() invalid} if it was not possible to obtain a GL context at all.
*/

    public QGLContext(com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.gui.QPaintDeviceInterface device){
        super((QPrivateConstructor)null);
        __qt_QGLContext_QGLFormat_QPaintDevice(format == null ? 0 : format.nativeId(), device == null ? 0 : device.nativeId());
    }

    native void __qt_QGLContext_QGLFormat_QPaintDevice(long format, long device);


/**
Generates and binds a 2D GL texture to the current context, based on <tt>image</tt>. The generated texture id is returned and can be used in later <tt>glBindTexture()</tt> calls. <p>The <tt>target</tt> parameter specifies the texture target. The default target is <tt>GL_TEXTURE_2D</tt>. <p>The <tt>format</tt> parameter sets the internal format for the texture. The default format is <tt>GL_RGBA8</tt>. <p>If the GL implementation supports the <tt>GL_SGIS_generate_mipmap</tt> extension, mipmaps will be automatically generated for the texture. Mipmap generation is only supported for the <tt>GL_TEXTURE_2D</tt> target. <p>The texture that is generated is cached, so multiple calls to {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) bindTexture()} with the same {@link com.trolltech.qt.gui.QImage QImage} will return the same texture id. <p>Note that we assume default values for the glPixelStore() and glPixelTransfer() parameters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image, int target) {
        return bindTexture(image, target, (int)0x1908);
    }

/**
Generates and binds a 2D GL texture to the current context, based on <tt>image</tt>. The generated texture id is returned and can be used in later <tt>glBindTexture()</tt> calls. <p>The <tt>target</tt> parameter specifies the texture target. The default target is <tt>GL_TEXTURE_2D</tt>. <p>The <tt>format</tt> parameter sets the internal format for the texture. The default format is <tt>GL_RGBA8</tt>. <p>If the GL implementation supports the <tt>GL_SGIS_generate_mipmap</tt> extension, mipmaps will be automatically generated for the texture. Mipmap generation is only supported for the <tt>GL_TEXTURE_2D</tt> target. <p>The texture that is generated is cached, so multiple calls to {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) bindTexture()} with the same {@link com.trolltech.qt.gui.QImage QImage} will return the same texture id. <p>Note that we assume default values for the glPixelStore() and glPixelTransfer() parameters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image) {
        return bindTexture(image, (int)0x0DE1, (int)0x1908);
    }
/**
Generates and binds a 2D GL texture to the current context, based on <tt>image</tt>. The generated texture id is returned and can be used in later <tt>glBindTexture()</tt> calls. <p>The <tt>target</tt> parameter specifies the texture target. The default target is <tt>GL_TEXTURE_2D</tt>. <p>The <tt>format</tt> parameter sets the internal format for the texture. The default format is <tt>GL_RGBA8</tt>. <p>If the GL implementation supports the <tt>GL_SGIS_generate_mipmap</tt> extension, mipmaps will be automatically generated for the texture. Mipmap generation is only supported for the <tt>GL_TEXTURE_2D</tt> target. <p>The texture that is generated is cached, so multiple calls to {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) bindTexture()} with the same {@link com.trolltech.qt.gui.QImage QImage} will return the same texture id. <p>Note that we assume default values for the glPixelStore() and glPixelTransfer() parameters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image, int target, int format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QImage_int_int(nativeId(), image == null ? 0 : image.nativeId(), target, format);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QImage_int_int(long __this__nativeId, long image, int target, int format);


/**
This is an overloaded member function, provided for convenience. <p>Generates and binds a 2D GL texture based on <tt>pixmap</tt>.
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap, int target) {
        return bindTexture(pixmap, target, (int)0x1908);
    }

/**
This is an overloaded member function, provided for convenience. <p>Generates and binds a 2D GL texture based on <tt>pixmap</tt>.
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap) {
        return bindTexture(pixmap, (int)0x0DE1, (int)0x1908);
    }
/**
This is an overloaded member function, provided for convenience. <p>Generates and binds a 2D GL texture based on <tt>pixmap</tt>.
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap, int target, int format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QPixmap_int_int(nativeId(), pixmap == null ? 0 : pixmap.nativeId(), target, format);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QPixmap_int_int(long __this__nativeId, long pixmap, int target, int format);

/**
This is an overloaded member function, provided for convenience. <p>Reads the DirectDrawSurface (DDS) compressed file <tt>fileName</tt> and generates a 2D GL texture from it. <p>Only the DXT1, DXT3 and DXT5 DDS formats are supported. <p>Note that this will only work if the implementation supports the <tt>GL_ARB_texture_compression</tt> and <tt>GL_EXT_texture_compression_s3tc</tt> extensions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_String(long __this__nativeId, java.lang.String fileName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int colorIndex(com.trolltech.qt.gui.QColor c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colorIndex_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native int __qt_colorIndex_QColor(long __this__nativeId, long c);

/**
Removes the texture identified by <tt>id</tt> from the texture cache, and calls glDeleteTextures() to delete the texture from the context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) bindTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void deleteTexture(int tx_id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteTexture_int(nativeId(), tx_id);
    }
    @QtBlockedSlot
    native void __qt_deleteTexture_int(long __this__nativeId, int tx_id);

/**
Returns the paint device set for this context. <p><DT><b>See also:</b><br><DD>QGLContext::QGLContext(). <br></DD></DT>
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
Returns true if the paint device of this context is a pixmap; otherwise returns false.
*/

    @QtBlockedSlot
    protected final boolean deviceIsPixmap()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceIsPixmap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_deviceIsPixmap(long __this__nativeId);


/**
Draws the given texture at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId) {
        drawTexture(point, textureId, (int)0x0DE1);
    }
/**
Draws the given texture at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId, int textureTarget)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTexture_QPointF_int_int(nativeId(), point == null ? 0 : point.nativeId(), textureId, textureTarget);
    }
    @QtBlockedSlot
    native void __qt_drawTexture_QPointF_int_int(long __this__nativeId, long point, int textureId, int textureTarget);


/**
Draws the given texture, <tt>textureId</tt>, to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QRectF target, int textureId) {
        drawTexture(target, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt>, to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QRectF target, int textureId, int textureTarget)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTexture_QRectF_int_int(nativeId(), target == null ? 0 : target.nativeId(), textureId, textureTarget);
    }
    @QtBlockedSlot
    native void __qt_drawTexture_QRectF_int_int(long __this__nativeId, long target, int textureId, int textureTarget);

/**
Returns the frame buffer format that was obtained (this may be a subset of what was requested). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#setFormat(com.trolltech.qt.opengl.QGLFormat) setFormat()}, and {@link com.trolltech.qt.opengl.QGLContext#requestedFormat() requestedFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLFormat format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLFormat __qt_format(long __this__nativeId);

/**
Returns true if this context has been initialized, i. . if {@link com.trolltech.qt.opengl.QGLWidget#initializeGL() QGLWidget::initializeGL()} has been performed on it; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#setInitialized(boolean) setInitialized()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean initialized()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_initialized(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_initialized(long __this__nativeId);

/**
Returns true if this context is sharing its GL context with another QGLContext, otherwise false is returned. Note that context sharing might not be supported between contexts with different formats.
*/

    @QtBlockedSlot
    public final boolean isSharing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSharing(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSharing(long __this__nativeId);

/**
Returns true if a GL rendering context has been successfully created; otherwise returns false.
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
If this context is a valid context in an overlay plane, returns the plane's transparent color. Otherwise returns an {@link com.trolltech.qt.gui.QColor#isValid() invalid} color. <p>The returned color's pixel value is the index of the transparent color in the colormap of the overlay plane. (Naturally, the color's RGB values are meaningless.) <p>The returned {@link com.trolltech.qt.gui.QColor QColor} object will generally work as expected only when passed as the argument to {@link com.trolltech.qt.opengl.QGLWidget#qglColor(com.trolltech.qt.gui.QColor) QGLWidget::qglColor()} or {@link com.trolltech.qt.opengl.QGLWidget#qglClearColor(com.trolltech.qt.gui.QColor) QGLWidget::qglClearColor()}. Under certain circumstances it can also be used to draw transparent graphics with a {@link com.trolltech.qt.gui.QPainter QPainter}. See the examples/opengl/overlay_x11 example for details.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor overlayTransparentColor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_overlayTransparentColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_overlayTransparentColor(long __this__nativeId);

/**
Returns the frame buffer format that was originally requested in the constructor or {@link com.trolltech.qt.opengl.QGLContext#setFormat(com.trolltech.qt.opengl.QGLFormat) setFormat()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLFormat requestedFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_requestedFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.opengl.QGLFormat __qt_requestedFormat(long __this__nativeId);

/**
Resets the context and makes it invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#create() create()}, and {@link com.trolltech.qt.opengl.QGLContext#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
Sets a <tt>format</tt> for this context. The context is {@link com.trolltech.qt.opengl.QGLContext#reset() reset}. <p>Call {@link com.trolltech.qt.opengl.QGLContext#create() create()} to create a new GL context that tries to match the new format. <pre class="snippet">
    //  ...
    QGLFormat f = new QGLFormat();
    f.setStereo(true);
    QGLContext cx = new QGLContext(f);
    if (!cx.create())
        throw new RuntimeException("No OpenGL support, or cannot render on the specified paintdevice.");
    if (!cx.format().stereo())
        throw new RuntimeException("Could not create stereo context.");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#format() format()}, {@link com.trolltech.qt.opengl.QGLContext#reset() reset()}, and {@link com.trolltech.qt.opengl.QGLContext#create() create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.opengl.QGLFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QGLFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QGLFormat(long __this__nativeId, long format);

/**
If <tt>on</tt> is true the context has been initialized, i. . {@link com.trolltech.qt.opengl.QGLContext#setInitialized(boolean) QGLContext::setInitialized()} has been called on it. If <tt>on</tt> is false the context has not been initialized. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#initialized() initialized()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setInitialized(boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInitialized_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setInitialized_boolean(long __this__nativeId, boolean on);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setValid(boolean valid)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValid_boolean(nativeId(), valid);
    }
    @QtBlockedSlot
    native void __qt_setValid_boolean(long __this__nativeId, boolean valid);

/**
If <tt>on</tt> is true the context has had a window created for it. If <tt>on</tt> is false no window has been created for the context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#windowCreated() windowCreated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setWindowCreated(boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowCreated_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setWindowCreated_boolean(long __this__nativeId, boolean on);

/**
Returns true if a window has been created for this context; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#setWindowCreated(boolean) setWindowCreated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean windowCreated()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowCreated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_windowCreated(long __this__nativeId);


/**
This semi-internal function is called by {@link com.trolltech.qt.opengl.QGLContext#create() create()}. It creates a system-dependent OpenGL handle that matches the {@link com.trolltech.qt.opengl.QGLContext#format() format()} of <tt>shareContext</tt> as closely as possible, returning true if successful or false if a suitable handle could not be found. <p>On Windows, it calls the virtual function choosePixelFormat(), which finds a matching pixel format identifier. On X11, it calls the virtual function chooseVisual() which finds an appropriate X visual. On other platforms it may work differently.
*/

    @QtBlockedSlot
    protected final boolean chooseContext() {
        return chooseContext((com.trolltech.qt.opengl.QGLContext)null);
    }
/**
This semi-internal function is called by {@link com.trolltech.qt.opengl.QGLContext#create() create()}. It creates a system-dependent OpenGL handle that matches the {@link com.trolltech.qt.opengl.QGLContext#format() format()} of <tt>shareContext</tt> as closely as possible, returning true if successful or false if a suitable handle could not be found. <p>On Windows, it calls the virtual function choosePixelFormat(), which finds a matching pixel format identifier. On X11, it calls the virtual function chooseVisual() which finds an appropriate X visual. On other platforms it may work differently.
*/

    @QtBlockedSlot
    protected boolean chooseContext(com.trolltech.qt.opengl.QGLContext shareContext)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_chooseContext_QGLContext(nativeId(), shareContext == null ? 0 : shareContext.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_chooseContext_QGLContext(long __this__nativeId, long shareContext);


/**
Creates the GL context. Returns true if it was successful in creating a valid GL rendering context on the paint device specified in the constructor; otherwise returns false (i.e. the context is invalid). <p>After successful creation, {@link com.trolltech.qt.opengl.QGLContext#format() format()} returns the set of features of the created GL rendering context. <p>If <tt>shareContext</tt> points to a valid QGLContext, this method will try to establish OpenGL display list and texture object sharing between this context and the <tt>shareContext</tt>. Note that this may fail if the two contexts have different {@link com.trolltech.qt.opengl.QGLContext#format() formats}. Use {@link com.trolltech.qt.opengl.QGLContext#isSharing() isSharing()} to see if sharing is in effect. <p><b>Warning:</b> Implementation note: initialization of C++ class members usually takes place in the class constructor. QGLContext is an exception because it must be simple to customize. The virtual functions {@link com.trolltech.qt.opengl.QGLContext#chooseContext() chooseContext()} (and chooseVisual() for X11) can be reimplemented in a subclass to select a particular context. The problem is that virtual functions are not properly called during construction (even though this is correct C++) because C++ constructs class hierarchies from the bottom up. For this reason we need a {@link com.trolltech.qt.opengl.QGLContext#create() create()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#chooseContext() chooseContext()}, {@link com.trolltech.qt.opengl.QGLContext#format() format()}, and {@link com.trolltech.qt.opengl.QGLContext#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean create() {
        return create((com.trolltech.qt.opengl.QGLContext)null);
    }
/**
Creates the GL context. Returns true if it was successful in creating a valid GL rendering context on the paint device specified in the constructor; otherwise returns false (i.e. the context is invalid). <p>After successful creation, {@link com.trolltech.qt.opengl.QGLContext#format() format()} returns the set of features of the created GL rendering context. <p>If <tt>shareContext</tt> points to a valid QGLContext, this method will try to establish OpenGL display list and texture object sharing between this context and the <tt>shareContext</tt>. Note that this may fail if the two contexts have different {@link com.trolltech.qt.opengl.QGLContext#format() formats}. Use {@link com.trolltech.qt.opengl.QGLContext#isSharing() isSharing()} to see if sharing is in effect. <p><b>Warning:</b> Implementation note: initialization of C++ class members usually takes place in the class constructor. QGLContext is an exception because it must be simple to customize. The virtual functions {@link com.trolltech.qt.opengl.QGLContext#chooseContext() chooseContext()} (and chooseVisual() for X11) can be reimplemented in a subclass to select a particular context. The problem is that virtual functions are not properly called during construction (even though this is correct C++) because C++ constructs class hierarchies from the bottom up. For this reason we need a {@link com.trolltech.qt.opengl.QGLContext#create() create()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#chooseContext() chooseContext()}, {@link com.trolltech.qt.opengl.QGLContext#format() format()}, and {@link com.trolltech.qt.opengl.QGLContext#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean create(com.trolltech.qt.opengl.QGLContext shareContext)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_create_QGLContext(nativeId(), shareContext == null ? 0 : shareContext.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_create_QGLContext(long __this__nativeId, long shareContext);

/**
Makes no GL context the current context. Normally, you do not need to call this function; QGLContext calls it as necessary.
*/

    @QtBlockedSlot
    public void doneCurrent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doneCurrent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_doneCurrent(long __this__nativeId);

/**
Makes this context the current OpenGL rendering context. All GL functions you call operate on this context until another context is made current. <p>In some very rare cases the underlying call may fail. If this occurs an error message is output to stderr.
*/

    @QtBlockedSlot
    public void makeCurrent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_makeCurrent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_makeCurrent(long __this__nativeId);

/**
Swaps the screen contents with an off-screen buffer. Only works if the context is in double buffer mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) QGLFormat::setDoubleBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void swapBuffers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_swapBuffers(nativeId());
    }
    @QtBlockedSlot
    native void __qt_swapBuffers(long __this__nativeId);

/**
Returns the current context, i. . the context to which any OpenGL commands will currently be directed. Returns 0 if no context is current. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#makeCurrent() makeCurrent()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.opengl.QGLContext currentContext();

/**
This function sets the limit for the texture cache to <tt>size</tt>, expressed in kilobytes. <p>By default, the cache limit is approximately 64 MB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#textureCacheLimit() textureCacheLimit()}. <br></DD></DT>
*/

    public native static void setTextureCacheLimit(int size);

/**
Returns the current texture cache limit in kilobytes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#setTextureCacheLimit(int) setTextureCacheLimit()}. <br></DD></DT>
*/

    public native static int textureCacheLimit();

/**
@exclude
*/

    public static native QGLContext fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLContext(QPrivateConstructor p) { super(p); } 
}
