package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLFramebufferObject class encapsulates an OpenGL framebuffer object. The QGLFramebufferObject class encapsulates an OpenGL framebuffer object, defined by the <tt>GL_EXT_framebuffer_object</tt> extension. In addition it provides a rendering surface that can be painted on with a {@link com.trolltech.qt.gui.QPainter QPainter}, rendered to using native GL calls, or both. This surface can be bound and used as a regular texture in your own GL drawing code. By default, the QGLFramebufferObject class generates a 2D GL texture (using the <tt>GL_TEXTURE_2D</tt> target), which is used as the internal rendering target. <p><b>It is important to have a current GL context when creating a QGLFramebufferObject, otherwise initialization will fail.</b> <p>OpenGL framebuffer objects and pbuffers (see {@link com.trolltech.qt.opengl.QGLPixelBuffer QGLPixelBuffer}) can both be used to render to offscreen surfaces, but there are a number of advantages with using framebuffer objects instead of pbuffers: <ol><li> A framebuffer object does not require a separate rendering context, so no context switching will occur when switching rendering targets. There is an overhead involved in switching targets, but in general it is cheaper than a context switch to a pbuffer.</li><li> Rendering to dynamic textures (i.e. render-to-texture functionality) works on all platforms. No need to do explicit copy calls from a render buffer into a texture, as was necessary on systems that did not support the <tt>render_texture</tt> extension.</li><li> It is possible to attach several rendering buffers (or texture objects) to the same framebuffer object, and render to all of them without doing a context switch.</li><li> The OpenGL framebuffer extension is a pure GL extension with no system dependant WGL, CGL, or GLX parts. This makes using framebuffer objects more portable.</li></ol> Note that primitives drawn to a QGLFramebufferObject with {@link com.trolltech.qt.gui.QPainter QPainter} will only be antialiased if the {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::HighQualityAntialiasing } render hint is set. This is because there is currently no support for the <tt>GL_EXT_framebuffer_multisample</tt> extension, which is required to do multisample based antialiasing. Also note that the {@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::HighQualityAntialiasing } render hint requires the <tt>GL_ARB_fragment_program</tt> extension to work in OpenGL. <p><DT><b>See also:</b><br><DD>{@link <a href="../opengl-framebufferobject.html">Framebuffer Object Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGLFramebufferObject extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }
/**
This enum type is used to configure the depth and stencil buffers attached to the framebuffer object when it is created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public enum Attachment implements com.trolltech.qt.QtEnumerator {
/**
 No attachment is added to the framebuffer object. Note that the OpenGL depth and stencil tests won't work when rendering to a framebuffer object without any depth or stencil buffers. This is the default value.
*/

        NoAttachment(0),
/**
 If the <tt>GL_EXT_packed_depth_stencil</tt> extension is present, a combined depth and stencil buffer is attached. If the extension is not present, only a depth buffer is attached.
*/

        CombinedDepthStencil(1),
/**
 A depth buffer is attached to the framebuffer object.
*/

        Depth(2);

        Attachment(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGLFramebufferObject$Attachment constant with the specified <tt>int</tt>.</brief>
*/

        public static Attachment resolve(int value) {
            return (Attachment) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoAttachment;
            case 1: return CombinedDepthStencil;
            case 2: return Depth;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs an OpenGL framebuffer object and binds a 2D GL texture to the buffer of the size <tt>size</tt>. The texture is bound to the <tt>GL_COLOR_ATTACHMENT0</tt> target in the framebuffer object. <p>The <tt>target</tt> parameter is used to specify the GL texture target. The default target is <tt>GL_TEXTURE_2D</tt>. Keep in mind that <tt>GL_TEXTURE_2D</tt> textures must have a power of 2 width and height (e.g. 256x512), unless you are using OpenGL 2.0 or higher. <p>By default, no depth and stencil buffers are attached. This behavior can be toggled using one of the overloaded constructors. <p>The default internal texture format is <tt>GL_RGBA8</tt>. <p>It is important that you have a current GL context set when creating the QGLFramebufferObject, otherwise the initialization will fail. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(com.trolltech.qt.core.QSize size) {
        this(size, (int)0x0DE1);
    }
/**
Constructs an OpenGL framebuffer object and binds a 2D GL texture to the buffer of the size <tt>size</tt>. The texture is bound to the <tt>GL_COLOR_ATTACHMENT0</tt> target in the framebuffer object. <p>The <tt>target</tt> parameter is used to specify the GL texture target. The default target is <tt>GL_TEXTURE_2D</tt>. Keep in mind that <tt>GL_TEXTURE_2D</tt> textures must have a power of 2 width and height (e.g. 256x512), unless you are using OpenGL 2.0 or higher. <p>By default, no depth and stencil buffers are attached. This behavior can be toggled using one of the overloaded constructors. <p>The default internal texture format is <tt>GL_RGBA8</tt>. <p>It is important that you have a current GL context set when creating the QGLFramebufferObject, otherwise the initialization will fail. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(com.trolltech.qt.core.QSize size, int target){
        super((QPrivateConstructor)null);
        __qt_QGLFramebufferObject_QSize_int(size == null ? 0 : size.nativeId(), target);
    }

    native void __qt_QGLFramebufferObject_QSize_int(long size, int target);


/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>size</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(com.trolltech.qt.core.QSize size, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment, int target) {
        this(size, attachment, target, (int)0x8058);
    }

/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>size</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(com.trolltech.qt.core.QSize size, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment) {
        this(size, attachment, (int)0x0DE1, (int)0x8058);
    }
/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>size</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(com.trolltech.qt.core.QSize size, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment, int target, int internal_format){
        super((QPrivateConstructor)null);
        __qt_QGLFramebufferObject_QSize_Attachment_int_int(size == null ? 0 : size.nativeId(), attachment.value(), target, internal_format);
    }

    native void __qt_QGLFramebufferObject_QSize_Attachment_int_int(long size, int attachment, int target, int internal_format);


/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a 2D GL texture to the buffer of the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}. <br></DD></DT>
*/

    public QGLFramebufferObject(int width, int height) {
        this(width, height, (int)0x0DE1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a 2D GL texture to the buffer of the given <tt>width</tt> and <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}. <br></DD></DT>
*/

    public QGLFramebufferObject(int width, int height, int target){
        super((QPrivateConstructor)null);
        __qt_QGLFramebufferObject_int_int_int(width, height, target);
    }

    native void __qt_QGLFramebufferObject_int_int_int(int width, int height, int target);


/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>width</tt> and <tt>height</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(int width, int height, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment, int target) {
        this(width, height, attachment, target, (int)0x8058);
    }

/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>width</tt> and <tt>height</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(int width, int height, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment) {
        this(width, height, attachment, (int)0x0DE1, (int)0x8058);
    }
/**
This is an overloaded member function, provided for convenience. <p>Constructs an OpenGL framebuffer object and binds a texture to the buffer of the given <tt>width</tt> and <tt>height</tt>. <p>The <tt>attachment</tt> parameter describes the depth/stencil buffer configuration, <tt>target</tt> the texture target and <tt>internal_format</tt> the internal texture format. The default texture target is <tt>GL_TEXTURE_2D</tt>, while the default internal format is <tt>GL_RGBA8</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFramebufferObject#size() size()}, {@link com.trolltech.qt.opengl.QGLFramebufferObject#texture() texture()}, and {@link com.trolltech.qt.opengl.QGLFramebufferObject#attachment() attachment()}. <br></DD></DT>
*/

    public QGLFramebufferObject(int width, int height, com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment, int target, int internal_format){
        super((QPrivateConstructor)null);
        __qt_QGLFramebufferObject_int_int_Attachment_int_int(width, height, attachment.value(), target, internal_format);
    }

    native void __qt_QGLFramebufferObject_int_int_Attachment_int_int(int width, int height, int attachment, int target, int internal_format);

/**
Returns the status of the depth and stencil buffers attached to this framebuffer object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.opengl.QGLFramebufferObject.Attachment attachment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.opengl.QGLFramebufferObject.Attachment.resolve(__qt_attachment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_attachment(long __this__nativeId);

/**
Switches rendering from the default, windowing system provided framebuffer to this framebuffer object. Returns true upon success, false otherwise.
*/

    @QtBlockedSlot
    public final boolean bind()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bind(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_bind(long __this__nativeId);

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
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>The framebuffer object should be bound when calling this function. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QPointF point, int textureId) {
        drawTexture(point, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt>, at the given <tt>point</tt> in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>The framebuffer object should be bound when calling this function. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
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
Draws the given texture, <tt>textureId</tt>, to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>The framebuffer object should be bound when calling this function. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
*/

    @QtBlockedSlot
    public final void drawTexture(com.trolltech.qt.core.QRectF target, int textureId) {
        drawTexture(target, textureId, (int)0x0DE1);
    }
/**
Draws the given texture, <tt>textureId</tt>, to the given target rectangle, <tt>target</tt>, in OpenGL model space. The <tt>textureTarget</tt> should be a 2D texture target. <p>The framebuffer object should be bound when calling this function. <p>Equivalent to the corresponding {@link com.trolltech.qt.opengl.QGLContext#drawTexture(com.trolltech.qt.core.QPointF, int) QGLContext::drawTexture()}.
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
Returns the GL framebuffer object handle for this framebuffer object (returned by the <tt>glGenFrameBuffersEXT()</tt> function). This handle can be used to attach new images or buffers to the framebuffer. The user is responsible for cleaning up and destroying these objects.
*/

    @QtBlockedSlot
    public final int handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_handle(long __this__nativeId);

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
Returns true if the framebuffer object is currently bound to a context, otherwise false is returned.
*/

    @QtBlockedSlot
    public final boolean isBound()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBound(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isBound(long __this__nativeId);

/**
Returns true if the framebuffer object is valid. <p>The framebuffer can become invalid if the initialization process fails, the user attaches an invalid buffer to the framebuffer object, or a non-power of 2 width/height is specified as the texture size if the texture target is <tt>GL_TEXTURE_2D</tt>.
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
Switches rendering back to the default, windowing system provided framebuffer. Returns true upon success, false otherwise.
*/

    @QtBlockedSlot
    public final boolean release()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_release(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_release(long __this__nativeId);

/**
Returns the size of the texture attached to this framebuffer object.
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
Returns the texture id for the texture attached as the default rendering target in this framebuffer object. This texture id can be bound as a normal texture in your own GL code.
*/

    @QtBlockedSlot
    public final int texture()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_texture(nativeId());
    }
    @QtBlockedSlot
    native int __qt_texture(long __this__nativeId);

/**
Returns the contents of this framebuffer object as a {@link com.trolltech.qt.gui.QImage QImage}.
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
Returns true if the OpenGL <tt>GL_EXT_framebuffer_object</tt> extension is present on this system; otherwise returns false.
*/

    public native static boolean hasOpenGLFramebufferObjects();

/**
@exclude
*/

    public static native QGLFramebufferObject fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLFramebufferObject(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);
}
