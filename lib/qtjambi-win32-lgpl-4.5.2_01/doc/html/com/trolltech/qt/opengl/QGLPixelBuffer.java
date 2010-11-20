package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLPixelBuffer class encapsulates an OpenGL pbuffer. Rendering into a pbuffer is normally done using full hardware acceleration. This can be significantly faster than rendering into a {@link com.trolltech.qt.gui.QPixmap QPixmap}. <p>There are three approaches to using this class: <ol><li> <b>We can draw into the pbuffer and convert it to a {@link com.trolltech.qt.gui.QImage QImage} using {@link com.trolltech.qt.opengl.QGLPixelBuffer#toImage() toImage()}.</b> This is normally much faster than calling {@link com.trolltech.qt.opengl.QGLWidget#renderPixmap(int, int) QGLWidget::renderPixmap()}.</li><li> <b>We can draw into the pbuffer and copy the contents into an OpenGL texture using {@link com.trolltech.qt.opengl.QGLPixelBuffer#updateDynamicTexture(int) updateDynamicTexture()}.</b> This allows us to create dynamic textures and works on all systems with pbuffer support.</li><li> <b>On systems that support it, we can bind the pbuffer to an OpenGL texture.</b> The texture is then updated automatically when the pbuffer contents change, eliminating the need for additional copy operations. This is supported only on Windows and Mac OS X systems that provide the <tt>render_texture</tt> extension.</li></ol> Pbuffers are provided by the OpenGL <tt>pbuffer</tt> extension; call hasOpenGLPbuffer() to find out if the system provides pbuffers. <p><DT><b>See also:</b><br><DD>{@link <a href="../opengl-pbuffers.html">Pbuffers Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGLPixelBuffer extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }


/**
Constructs an OpenGL pbuffer of the given <tt>size</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(com.trolltech.qt.core.QSize size, com.trolltech.qt.opengl.QGLFormat format) {
        this(size, format, (com.trolltech.qt.opengl.QGLWidget)null);
    }

/**
Constructs an OpenGL pbuffer of the given <tt>size</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(com.trolltech.qt.core.QSize size) {
        this(size, (com.trolltech.qt.opengl.QGLFormat)com.trolltech.qt.opengl.QGLFormat.defaultFormat(), (com.trolltech.qt.opengl.QGLWidget)null);
    }
/**
Constructs an OpenGL pbuffer of the given <tt>size</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(com.trolltech.qt.core.QSize size, com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.opengl.QGLWidget shareWidget){
        super((QPrivateConstructor)null);
        __qt_QGLPixelBuffer_QSize_QGLFormat_QGLWidget(size == null ? 0 : size.nativeId(), format == null ? 0 : format.nativeId(), shareWidget == null ? 0 : shareWidget.nativeId());
    }

    native void __qt_QGLPixelBuffer_QSize_QGLFormat_QGLWidget(long size, long format, long shareWidget);


/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL pbuffer with the <tt>width</tt> and <tt>height</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(int width, int height, com.trolltech.qt.opengl.QGLFormat format) {
        this(width, height, format, (com.trolltech.qt.opengl.QGLWidget)null);
    }

/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL pbuffer with the <tt>width</tt> and <tt>height</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(int width, int height) {
        this(width, height, (com.trolltech.qt.opengl.QGLFormat)com.trolltech.qt.opengl.QGLFormat.defaultFormat(), (com.trolltech.qt.opengl.QGLWidget)null);
    }
/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL pbuffer with the <tt>width</tt> and <tt>height</tt>. If no <tt>format</tt> is specified, the {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() default format} is used. If the <tt>shareWidget</tt> parameter points to a valid {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, the pbuffer will share its context with <tt>shareWidget</tt>. <p>If you intend to bind this pbuffer as a dynamic texture, the width and height components of <tt>size</tt> must be powers of two (e.g., 512 x 128). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#format() format()}. <br></DD></DT>
*/

    public QGLPixelBuffer(int width, int height, com.trolltech.qt.opengl.QGLFormat format, com.trolltech.qt.opengl.QGLWidget shareWidget){
        super((QPrivateConstructor)null);
        __qt_QGLPixelBuffer_int_int_QGLFormat_QGLWidget(width, height, format == null ? 0 : format.nativeId(), shareWidget == null ? 0 : shareWidget.nativeId());
    }

    native void __qt_QGLPixelBuffer_int_int_QGLFormat_QGLWidget(int width, int height, long format, long shareWidget);


/**
Generates and binds a 2D GL texture to the current context, based on <tt>image</tt>. The generated texture id is returned and can be used in later glBindTexture() calls. <p>The <tt>target</tt> parameter specifies the texture target. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) QGLContext::bindTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image) {
        return bindTexture(image, (int)0x0DE1);
    }
/**
Generates and binds a 2D GL texture to the current context, based on <tt>image</tt>. The generated texture id is returned and can be used in later glBindTexture() calls. <p>The <tt>target</tt> parameter specifies the texture target. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) QGLContext::bindTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QImage image, int target)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QImage_int(nativeId(), image == null ? 0 : image.nativeId(), target);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QImage_int(long __this__nativeId, long image, int target);


/**
This is an overloaded member function, provided for convenience. <p>Generates and binds a 2D GL texture based on <tt>pixmap</tt>. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) QGLContext::bindTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap) {
        return bindTexture(pixmap, (int)0x0DE1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Generates and binds a 2D GL texture based on <tt>pixmap</tt>. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) QGLContext::bindTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#deleteTexture(int) deleteTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bindTexture(com.trolltech.qt.gui.QPixmap pixmap, int target)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindTexture_QPixmap_int(nativeId(), pixmap == null ? 0 : pixmap.nativeId(), target);
    }
    @QtBlockedSlot
    native int __qt_bindTexture_QPixmap_int(long __this__nativeId, long pixmap, int target);

/**
This is an overloaded member function, provided for convenience. <p>Reads the DirectDrawSurface (DDS) compressed file <tt>fileName</tt> and generates a 2D GL texture from it. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#bindTexture(com.trolltech.qt.gui.QImage, int) QGLContext::bindTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#deleteTexture(int) deleteTexture()}. <br></DD></DT>
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
Binds the texture specified by <tt>texture_id</tt> to this pbuffer. Returns true on success; otherwise returns false. <p>The texture must be of the same size and format as the pbuffer. <p>To unbind the texture, call {@link com.trolltech.qt.opengl.QGLPixelBuffer#releaseFromDynamicTexture() releaseFromDynamicTexture()}. While the texture is bound, it is updated automatically when the pbuffer contents change, eliminating the need for additional copy operations. <p>Example: <pre class="snippet">
        QGLPixelBuffer pbuffer = new QGLPixelBuffer(256, 256);
        //...
        pbuffer.makeCurrent();
        int dynamicTexture = pbuffer.generateDynamicTexture();
        pbuffer.bindToDynamicTexture(dynamicTexture);
        //...
        pbuffer.releaseFromDynamicTexture();
</pre> <b>Warning:</b> This function uses the <tt>render_texture</tt> extension, which is currently not supported under X11. An alternative that works on all systems (including X11) is to manually copy the pbuffer contents to a texture using {@link com.trolltech.qt.opengl.QGLPixelBuffer#updateDynamicTexture(int) updateDynamicTexture()}. <p><b>Warning:</b> For the {@link com.trolltech.qt.opengl.QGLPixelBuffer#bindToDynamicTexture(int) bindToDynamicTexture()} call to succeed on the Mac OS X, the pbuffer needs a shared context, i.e. the QGLPixelBuffer must be created with a share widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#generateDynamicTexture() generateDynamicTexture()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#releaseFromDynamicTexture() releaseFromDynamicTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean bindToDynamicTexture(int texture)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bindToDynamicTexture_int(nativeId(), texture);
    }
    @QtBlockedSlot
    native boolean __qt_bindToDynamicTexture_int(long __this__nativeId, int texture);

/**
Removes the texture identified by <tt>texture_id</tt> from the texture cache. <p>Equivalent to calling {@link com.trolltech.qt.opengl.QGLContext#deleteTexture(int) QGLContext::deleteTexture()}.
*/

    @QtBlockedSlot
    public final void deleteTexture(int texture_id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteTexture_int(nativeId(), texture_id);
    }
    @QtBlockedSlot
    native void __qt_deleteTexture_int(long __this__nativeId, int texture_id);

/**
Returns the bit depth (number of bit planes) of the paint device.
*/

    @QtBlockedSlot
    public final int depth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_depth(long __this__nativeId);

/**
Makes no context the current OpenGL context. Returns true on success; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean doneCurrent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doneCurrent(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_doneCurrent(long __this__nativeId);


/**
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The textureTarget parameter should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId) {
        drawTexture(point, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The textureTarget parameter should be a 2D texture target. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
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
Returns the format of the pbuffer. The format may be different from the one that was requested.
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
Generates and binds a 2D GL texture that is the same size as the pbuffer, and returns the texture's ID. This can be used in conjunction with {@link com.trolltech.qt.opengl.QGLPixelBuffer#bindToDynamicTexture(int) bindToDynamicTexture()} and {@link com.trolltech.qt.opengl.QGLPixelBuffer#updateDynamicTexture(int) updateDynamicTexture()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int generateDynamicTexture()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_generateDynamicTexture(nativeId());
    }
    @QtBlockedSlot
    native int __qt_generateDynamicTexture(long __this__nativeId);

/**
Returns the native pbuffer handle.
*/

    @QtBlockedSlot
    public final long handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native long __qt_handle(long __this__nativeId);

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns the height of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int heightMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_heightMM(long __this__nativeId);

/**
Returns true if this pbuffer is valid; otherwise returns false.
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
Returns the horizontal resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiX(long __this__nativeId);

/**
Returns the vertical resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiY(long __this__nativeId);

/**
Makes this pbuffer the current OpenGL rendering context. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext#makeCurrent() QGLContext::makeCurrent()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#doneCurrent() doneCurrent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean makeCurrent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_makeCurrent(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_makeCurrent(long __this__nativeId);

/**
Returns the number of different colors available for the paint device. Since this value is an int, it will not be sufficient to represent the number of colors on 32 bit displays, in this case INT_MAX is returned instead.
*/

    @QtBlockedSlot
    public final int numColors()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numColors(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numColors(long __this__nativeId);

/**
Returns true if the device is currently being painted on, i. . someone has called {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} but not yet called {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for this device; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() QPainter::isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean paintingActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintingActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_paintingActive(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiX(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiY(long __this__nativeId);

/**
Releases the pbuffer from any previously bound texture. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#bindToDynamicTexture(int) bindToDynamicTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseFromDynamicTexture()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseFromDynamicTexture(nativeId());
    }
    @QtBlockedSlot
    native void __qt_releaseFromDynamicTexture(long __this__nativeId);

/**
Returns the size of the pbuffer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
Returns the contents of the pbuffer as a {@link com.trolltech.qt.gui.QImage QImage}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage toImage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toImage(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_toImage(long __this__nativeId);

/**
Copies the pbuffer contents into the texture specified with <tt>texture_id</tt>. <p>The texture must be of the same size and format as the pbuffer. <p>Example: <pre class="snippet">
        QGLPixelBuffer pbuffer = new QGLPixelBuffer(256, 256);
        // ...
        pbuffer.makeCurrent();
        int dynamicTexture = pbuffer.generateDynamicTexture();
        // ...
        pbuffer.updateDynamicTexture(dynamicTexture);
</pre> An alternative on Windows and Mac OS X systems that support the <tt>render_texture</tt> extension is to use {@link com.trolltech.qt.opengl.QGLPixelBuffer#bindToDynamicTexture(int) bindToDynamicTexture()} to get dynamic updates of the texture. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLPixelBuffer#generateDynamicTexture() generateDynamicTexture()}, and {@link com.trolltech.qt.opengl.QGLPixelBuffer#bindToDynamicTexture(int) bindToDynamicTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void updateDynamicTexture(int texture_id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateDynamicTexture_int(nativeId(), texture_id);
    }
    @QtBlockedSlot
    native void __qt_updateDynamicTexture_int(long __this__nativeId, int texture_id);

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
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
Returns the width of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int widthMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widthMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_widthMM(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int devType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_devType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_devType(long __this__nativeId);

/**
Returns the metric information for the given paint device <tt>metric</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric metric)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metric_PaintDeviceMetric(nativeId(), metric.value());
    }
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int metric);

/**
Returns a pointer to the paint engine used for drawing on the device.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
Returns true if the OpenGL <tt>pbuffer</tt> extension is present on this system; otherwise returns false.
*/

    public native static boolean hasOpenGLPbuffers();

/**
@exclude
*/

    public static native QGLPixelBuffer fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLPixelBuffer(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);
}
