package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLFormat class specifies the display format of an OpenGL rendering context. A display format has several characteristics: <ul><li> {@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) Double or single buffering.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) Depth buffer.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setRgba(boolean) RGBA or color index mode.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAlpha(boolean) Alpha channel.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) Accumulation buffer.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) Stencil buffer.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStereo(boolean) Stereo buffers.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDirectRendering(boolean) Direct rendering.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setOverlay(boolean) Presence of an overlay.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setPlane(int) The plane of an overlay format.}</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setSampleBuffers(boolean) Multisample buffers.}</li></ul> You can also specify preferred bit depths for the depth buffer, alpha buffer, accumulation buffer and the stencil buffer with the functions: {@link com.trolltech.qt.opengl.QGLFormat#setDepthBufferSize(int) setDepthBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setAccumBufferSize(int) setAccumBufferSize()} and {@link com.trolltech.qt.opengl.QGLFormat#setStencilBufferSize(int) setStencilBufferSize()}. <p>Note that even if you specify that you prefer a 32 bit depth buffer (e.g. with setDepthBufferSize(32)), the format that is chosen may not have a 32 bit depth buffer, even if there is a format available with a 32 bit depth buffer. The main reason for this is how the system dependant picking algorithms work on the different platforms, and some format options may have higher precedence than others. <p>You create and tell a QGLFormat object what rendering options you want from an OpenGL rendering context. <p>OpenGL drivers or accelerated hardware may or may not support advanced features such as alpha channel or stereographic viewing. If you request some features that the driver/hardware does not provide when you create a {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, you will get a rendering context with the nearest subset of features. <p>There are different ways to define the display characteristics of a rendering context. One is to create a QGLFormat and make it the default for the entire application: <pre class="snippet">
    QGLFormat fmt = new QGLFormat();
    fmt.setAlpha(true);
    fmt.setStereo(true);
    QGLFormat.setDefaultFormat(fmt);
</pre> Or you can specify the desired format when creating an object of your {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} subclass: <pre class="snippet">
    QGLFormat fmt = new QGLFormat();
    fmt.setDoubleBuffer(false);                 // single buffer
    fmt.setDirectRendering(false);              // software rendering
    MyGLWidget myWidget = new MyGLWidget(fmt);
</pre> After the widget has been created, you can find out which of the requested features the system was able to provide: <pre class="snippet">
    QGLFormat fmt = new QGLFormat();
    fmt.setOverlay(true);
    fmt.setStereo(true);
    MyGLWidget myWidget = new MyGLWidget(fmt);
    if (!myWidget.format().stereo()) {
        // ok, goggles off
        if (!myWidget.format().hasOverlay()) {
        throw new RuntimeException("Cool hardware required");
        }
    }
</pre>OpenGL is a trademark of Silicon Graphics, Inc. in the United States and other countries. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLContext QGLContext}, and {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGLFormat extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the various OpenGL versions that are recognized by Qt. Use the {@link com.trolltech.qt.opengl.QGLFormat#openGLVersionFlags() QGLFormat::openGLVersionFlags()} function to identify which versions that are supported at runtime. See also http://www.opengl.org for more information about the different revisions of OpenGL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#openGLVersionFlags() openGLVersionFlags()}. <br></DD></DT>
*/

    public enum OpenGLVersionFlag implements com.trolltech.qt.QtEnumerator {
/**
 If no OpenGL is present or if no OpenGL context is current.
*/

        OpenGL_Version_None(0),
/**
 OpenGL version 1.1 or higher is present.
*/

        OpenGL_Version_1_1(1),
/**
 OpenGL version 1.2 or higher is present.
*/

        OpenGL_Version_1_2(2),
/**
 OpenGL version 1.3 or higher is present.
*/

        OpenGL_Version_1_3(4),
/**
 OpenGL version 1.4 or higher is present.
*/

        OpenGL_Version_1_4(8),
/**
 OpenGL version 1.5 or higher is present.
*/

        OpenGL_Version_1_5(16),
/**
 OpenGL version 2.0 or higher is present. Note that version 2.0 supports all the functionality of version 1.5.
*/

        OpenGL_Version_2_0(32),
/**
 OpenGL version 2.1 or higher is present.
*/

        OpenGL_Version_2_1(64),
/**
 OpenGL ES version 1.0 Common or higher is present. The Common profile supports all the features of Common Lite.
*/

        OpenGL_ES_Common_Version_1_0(128),
/**
 OpenGL ES version 1.0 Common Lite or higher is present.
*/

        OpenGL_ES_CommonLite_Version_1_0(256),
/**
 OpenGL ES version 1.1 Common or higher is present. The Common profile supports all the features of Common Lite.
*/

        OpenGL_ES_Common_Version_1_1(512),
/**
 OpenGL ES version 1.1 Common Lite or higher is present.
*/

        OpenGL_ES_CommonLite_Version_1_1(1024),
/**
 OpenGL ES version 2.  or higher is present. Note that OpenGL ES version 2.0 does not support all the features of OpenGL ES 1.x. So if {@link com.trolltech.qt.opengl.QGLFormat.OpenGLVersionFlag OpenGL_ES_Version_2_0 } is returned, none of the ES 1.x flags are returned.
*/

        OpenGL_ES_Version_2_0(2048);

        OpenGLVersionFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.opengl.QGLFormat$OpenGLVersionFlags with the specified <tt>com.trolltech.qt.opengl.QGLFormat$OpenGLVersionFlag[]</tt> QGLFormat$OpenGLVersionFlag values set.</brief>
*/

        public static OpenGLVersionFlags createQFlags(OpenGLVersionFlag ... values) {
            return new OpenGLVersionFlags(values);
        }
/**
<brief>Returns the QGLFormat$OpenGLVersionFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static OpenGLVersionFlag resolve(int value) {
            return (OpenGLVersionFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OpenGL_Version_None;
            case 1: return OpenGL_Version_1_1;
            case 2: return OpenGL_Version_1_2;
            case 4: return OpenGL_Version_1_3;
            case 8: return OpenGL_Version_1_4;
            case 16: return OpenGL_Version_1_5;
            case 32: return OpenGL_Version_2_0;
            case 64: return OpenGL_Version_2_1;
            case 128: return OpenGL_ES_Common_Version_1_0;
            case 256: return OpenGL_ES_CommonLite_Version_1_0;
            case 512: return OpenGL_ES_Common_Version_1_1;
            case 1024: return OpenGL_ES_CommonLite_Version_1_1;
            case 2048: return OpenGL_ES_Version_2_0;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class OpenGLVersionFlags extends com.trolltech.qt.QFlags<OpenGLVersionFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QGLFormat-OpenGLVersionFlags with the specified <tt>com.trolltech.qt.opengl.QGLFormat.OpenGLVersionFlag[]</tt>. flags set.</brief>
*/

        public OpenGLVersionFlags(OpenGLVersionFlag ... args) { super(args); }
        public OpenGLVersionFlags(int value) { setValue(value); }
    }



/**
Constructs a QGLFormat object with the factory default settings. <ul><li> {@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) Double buffer:} Enabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) Depth buffer:} Enabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setRgba(boolean) RGBA:} Enabled (i.e., color index disabled).</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAlpha(boolean) Alpha channel:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) Accumulator buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) Stencil buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStereo(boolean) Stereo:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDirectRendering(boolean) Direct rendering:} Enabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setOverlay(boolean) Overlay:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setPlane(int) Plane:} 0 (i.e., normal plane).</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setSampleBuffers(boolean) Multisample buffers:} Disabled.</li></ul>
*/

    public QGLFormat(){
        super((QPrivateConstructor)null);
        __qt_QGLFormat();
    }

    native void __qt_QGLFormat();


/**
Creates a QGLFormat object that is a copy of the current {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() application default format}. <p>If <tt>options</tt> is not 0, this copy is modified by these format options. The <tt>options</tt> parameter should be <tt>FormatOption</tt> values OR'ed together. <p>This constructor makes it easy to specify a certain desired format in classes derived from {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, for example: <pre class="snippet">
    // The rendering in MyGLWidget depends on using
    // stencil buffer and alpha channel
        class MyGLWidget extends QGLWidget {
        public MyGLWidget(QWidget parent)
        {
        super(new QGLFormat(new QGL.FormatOptions(QGL.FormatOption.StencilBuffer, QGL.FormatOption.AlphaChannel)), parent);
        if (!format().stencil())
            System.err.println("Could not get stencil buffer; results will be suboptimal");
        if (!format().alpha())
            System.err.println("Could not get alpha channel; results will be suboptimal");
        // ...
        }
    }
</pre> Note that there are <tt>FormatOption</tt> values to turn format settings both on and off, e.g. <tt>DepthBuffer</tt> and <tt>NoDepthBuffer</tt>, <tt>DirectRendering</tt> and <tt>IndirectRendering</tt>, etc. <p>The <tt>plane</tt> parameter defaults to 0 and is the plane which this format should be associated with. Not all OpenGL implementations supports overlay/underlay rendering planes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLFormat#setOption(com.trolltech.qt.opengl.QGL.FormatOption[]) setOption()}. <br></DD></DT>
*/

    public QGLFormat(com.trolltech.qt.opengl.QGL.FormatOptions options) {
        this(options, (int)0);
    }
/**
Creates a QGLFormat object that is a copy of the current {@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() application default format}. <p>If <tt>options</tt> is not 0, this copy is modified by these format options. The <tt>options</tt> parameter should be <tt>FormatOption</tt> values OR'ed together. <p>This constructor makes it easy to specify a certain desired format in classes derived from {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, for example: <pre class="snippet">
    // The rendering in MyGLWidget depends on using
    // stencil buffer and alpha channel
        class MyGLWidget extends QGLWidget {
        public MyGLWidget(QWidget parent)
        {
        super(new QGLFormat(new QGL.FormatOptions(QGL.FormatOption.StencilBuffer, QGL.FormatOption.AlphaChannel)), parent);
        if (!format().stencil())
            System.err.println("Could not get stencil buffer; results will be suboptimal");
        if (!format().alpha())
            System.err.println("Could not get alpha channel; results will be suboptimal");
        // ...
        }
    }
</pre> Note that there are <tt>FormatOption</tt> values to turn format settings both on and off, e.g. <tt>DepthBuffer</tt> and <tt>NoDepthBuffer</tt>, <tt>DirectRendering</tt> and <tt>IndirectRendering</tt>, etc. <p>The <tt>plane</tt> parameter defaults to 0 and is the plane which this format should be associated with. Not all OpenGL implementations supports overlay/underlay rendering planes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() defaultFormat()}, and {@link com.trolltech.qt.opengl.QGLFormat#setOption(com.trolltech.qt.opengl.QGL.FormatOption[]) setOption()}. <br></DD></DT>
*/

    public QGLFormat(com.trolltech.qt.opengl.QGL.FormatOptions options, int plane){
        super((QPrivateConstructor)null);
        __qt_QGLFormat_FormatOptions_int(options.value(), plane);
    }

    native void __qt_QGLFormat_FormatOptions_int(int options, int plane);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QGLFormat(com.trolltech.qt.opengl.QGLFormat other){
        super((QPrivateConstructor)null);
        __qt_QGLFormat_QGLFormat(other == null ? 0 : other.nativeId());
    }

    native void __qt_QGLFormat_QGLFormat(long other);

/**
Returns true if the accumulation buffer is enabled; otherwise returns false. The accumulation buffer is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) setAccum()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAccumBufferSize(int) setAccumBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean accum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accum(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_accum(long __this__nativeId);

/**
Returns the accumulation buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setAccumBufferSize(int) setAccumBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#accum() accum()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) setAccum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int accumBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accumBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_accumBufferSize(long __this__nativeId);

/**
Returns true if the alpha buffer in the framebuffer is enabled; otherwise returns false. The alpha buffer is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setAlpha(boolean) setAlpha()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean alpha()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alpha(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_alpha(long __this__nativeId);

/**
Returns the alpha buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#alpha() alpha()}, {@link com.trolltech.qt.opengl.QGLFormat#setAlpha(boolean) setAlpha()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int alphaBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alphaBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_alphaBufferSize(long __this__nativeId);

/**
Returns the blue buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setBlueBufferSize(int) setBlueBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int blueBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blueBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_blueBufferSize(long __this__nativeId);

/**
Returns true if the depth buffer is enabled; otherwise returns false. The depth buffer is enabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) setDepth()}, and {@link com.trolltech.qt.opengl.QGLFormat#setDepthBufferSize(int) setDepthBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean depth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_depth(long __this__nativeId);

/**
Returns the depth buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#depth() depth()}, {@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) setDepth()}, and {@link com.trolltech.qt.opengl.QGLFormat#setDepthBufferSize(int) setDepthBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int depthBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depthBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_depthBufferSize(long __this__nativeId);

/**
Returns true if direct rendering is enabled; otherwise returns false. <p>Direct rendering is enabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDirectRendering(boolean) setDirectRendering()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean directRendering()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_directRendering(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_directRendering(long __this__nativeId);

/**
Returns true if double buffering is enabled; otherwise returns false. Double buffering is enabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) setDoubleBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean doubleBuffer()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleBuffer(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_doubleBuffer(long __this__nativeId);

/**
Returns the green buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setGreenBufferSize(int) setGreenBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int greenBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_greenBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_greenBufferSize(long __this__nativeId);

/**
Returns true if overlay plane is enabled; otherwise returns false. <p>Overlay is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setOverlay(boolean) setOverlay()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasOverlay()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasOverlay(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasOverlay(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.opengl.QGLFormat arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QGLFormat(nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QGLFormat(long __this__nativeId, long arg__2);

/**
Returns the plane of this format. The default for normal formats is 0, which means the normal plane. The default for overlay formats is 1, which is the first overlay plane. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setPlane(int) setPlane()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int plane()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_plane(nativeId());
    }
    @QtBlockedSlot
    native int __qt_plane(long __this__nativeId);

/**
Returns the red buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setRedBufferSize(int) setRedBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int redBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_redBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_redBufferSize(long __this__nativeId);

/**
Returns true if RGBA color mode is set. Returns false if color index mode is set. The default color mode is RGBA. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setRgba(boolean) setRgba()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rgba()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rgba(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rgba(long __this__nativeId);

/**
Returns true if multisample buffer support is enabled; otherwise returns false. <p>The multisample buffer is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setSampleBuffers(boolean) setSampleBuffers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean sampleBuffers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sampleBuffers(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_sampleBuffers(long __this__nativeId);

/**
Returns the number of samples per pixel when multisampling is enabled. By default, the highest number of samples that is available is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setSampleBuffers(boolean) setSampleBuffers()}, {@link com.trolltech.qt.opengl.QGLFormat#sampleBuffers() sampleBuffers()}, and {@link com.trolltech.qt.opengl.QGLFormat#setSamples(int) setSamples()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int samples()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_samples(nativeId());
    }
    @QtBlockedSlot
    native int __qt_samples(long __this__nativeId);

/**
If <tt>enable</tt> is true enables the accumulation buffer; otherwise disables the accumulation buffer. <p>The accumulation buffer is disabled by default. <p>The accumulation buffer is used to create blur effects and multiple exposures. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#accum() accum()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAccumBufferSize(int) setAccumBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAccum(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccum_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAccum_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred accumulation buffer size, where <tt>size</tt> is the bit depth for each RGBA component. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#accum() accum()}, {@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) setAccum()}, and {@link com.trolltech.qt.opengl.QGLFormat#accumBufferSize() accumBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAccumBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccumBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setAccumBufferSize_int(long __this__nativeId, int size);

/**
If <tt>enable</tt> is true enables the alpha buffer; otherwise disables the alpha buffer. <p>The alpha buffer is disabled by default. <p>The alpha buffer is typically used for implementing transparency or translucency. The A in RGBA specifies the transparency of a pixel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#alpha() alpha()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlpha(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlpha_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAlpha_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred alpha buffer size to <tt>size</tt>. This function implicitly enables the alpha channel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setRedBufferSize(int) setRedBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setGreenBufferSize(int) setGreenBufferSize()}, and {@link com.trolltech.qt.opengl.QGLFormat#alphaBufferSize() alphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlphaBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlphaBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setAlphaBufferSize_int(long __this__nativeId, int size);

/**
Set the preferred blue buffer size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#blueBufferSize() blueBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setRedBufferSize(int) setRedBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setGreenBufferSize(int) setGreenBufferSize()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlueBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlueBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setBlueBufferSize_int(long __this__nativeId, int size);

/**
If <tt>enable</tt> is true enables the depth buffer; otherwise disables the depth buffer. <p>The depth buffer is enabled by default. <p>The purpose of a depth buffer (or Z-buffering) is to remove hidden surfaces. Pixels are assigned Z values based on the distance to the viewer. A pixel with a high Z value is closer to the viewer than a pixel with a low Z value. This information is used to decide whether to draw a pixel or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#depth() depth()}, and {@link com.trolltech.qt.opengl.QGLFormat#setDepthBufferSize(int) setDepthBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDepth(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDepth_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDepth_boolean(long __this__nativeId, boolean enable);

/**
Set the minimum depth buffer size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#depthBufferSize() depthBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) setDepth()}, and {@link com.trolltech.qt.opengl.QGLFormat#depth() depth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDepthBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDepthBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setDepthBufferSize_int(long __this__nativeId, int size);

/**
If <tt>enable</tt> is true enables direct rendering; otherwise disables direct rendering. <p>Direct rendering is enabled by default. <p>Enabling this option will make OpenGL bypass the underlying window system and render directly from hardware to the screen, if this is supported by the system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#directRendering() directRendering()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDirectRendering(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirectRendering_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDirectRendering_boolean(long __this__nativeId, boolean enable);

/**
If <tt>enable</tt> is true sets double buffering; otherwise sets single buffering. <p>Double buffering is enabled by default. <p>Double buffering is a technique where graphics are rendered on an off-screen buffer and not directly to the screen. When the drawing has been completed, the program calls a swapBuffers() function to exchange the screen contents with the buffer. The result is flicker-free drawing and often better performance. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#doubleBuffer() doubleBuffer()}, {@link com.trolltech.qt.opengl.QGLContext#swapBuffers() QGLContext::swapBuffers()}, and {@link com.trolltech.qt.opengl.QGLWidget#swapBuffers() QGLWidget::swapBuffers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDoubleBuffer(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleBuffer_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDoubleBuffer_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred green buffer size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#greenBufferSize() greenBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setRedBufferSize(int) setRedBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setBlueBufferSize(int) setBlueBufferSize()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGreenBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGreenBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setGreenBufferSize_int(long __this__nativeId, int size);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.opengl.QGL.FormatOption ... opt) {
        this.setOption(new com.trolltech.qt.opengl.QGL.FormatOptions(opt));
    }
/**
Sets the format option to <tt>opt</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#testOption(com.trolltech.qt.opengl.QGL.FormatOption[]) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.opengl.QGL.FormatOptions opt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_FormatOptions(nativeId(), opt.value());
    }
    @QtBlockedSlot
    native void __qt_setOption_FormatOptions(long __this__nativeId, int opt);

/**
If <tt>enable</tt> is true enables an overlay plane; otherwise disables the overlay plane. <p>Enabling the overlay plane will cause {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} to create an additional context in an overlay plane. See the {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} documentation for further information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#hasOverlay() hasOverlay()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOverlay(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOverlay_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setOverlay_boolean(long __this__nativeId, boolean enable);

/**
Sets the requested plane to <tt>plane</tt>. 0 is the normal plane, 1 is the first overlay plane, 2 is the second overlay plane, etc.; -1, -2, etc. are underlay planes. <p>Note that in contrast to other format specifications, the plane specifications will be matched exactly. This means that if you specify a plane that the underlying OpenGL system cannot provide, an {@link com.trolltech.qt.opengl.QGLWidget#isValid() invalid}{@link com.trolltech.qt.opengl.QGLWidget QGLWidget} will be created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#plane() plane()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPlane(int plane)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPlane_int(nativeId(), plane);
    }
    @QtBlockedSlot
    native void __qt_setPlane_int(long __this__nativeId, int plane);

/**
Set the preferred red buffer size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#redBufferSize() redBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setGreenBufferSize(int) setGreenBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setBlueBufferSize(int) setBlueBufferSize()}, and {@link com.trolltech.qt.opengl.QGLFormat#setAlphaBufferSize(int) setAlphaBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRedBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRedBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setRedBufferSize_int(long __this__nativeId, int size);

/**
If <tt>enable</tt> is true sets RGBA mode. If <tt>enable</tt> is false sets color index mode. <p>The default color mode is RGBA. <p>RGBA is the preferred mode for most OpenGL applications. In RGBA color mode you specify colors as red + green + blue + alpha quadruplets. <p>In color index mode you specify an index into a color lookup table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#rgba() rgba()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgba(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRgba_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setRgba_boolean(long __this__nativeId, boolean enable);

/**
If <tt>enable</tt> is true, a GL context with multisample buffer support is picked; otherwise ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#sampleBuffers() sampleBuffers()}, {@link com.trolltech.qt.opengl.QGLFormat#setSamples(int) setSamples()}, and {@link com.trolltech.qt.opengl.QGLFormat#samples() samples()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSampleBuffers(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSampleBuffers_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setSampleBuffers_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred number of samples per pixel when multisampling is enabled to <tt>numSamples</tt>. By default, the highest number of samples available is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setSampleBuffers(boolean) setSampleBuffers()}, {@link com.trolltech.qt.opengl.QGLFormat#sampleBuffers() sampleBuffers()}, and {@link com.trolltech.qt.opengl.QGLFormat#samples() samples()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSamples(int numSamples)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSamples_int(nativeId(), numSamples);
    }
    @QtBlockedSlot
    native void __qt_setSamples_int(long __this__nativeId, int numSamples);

/**
If <tt>enable</tt> is true enables the stencil buffer; otherwise disables the stencil buffer. <p>The stencil buffer is disabled by default. <p>The stencil buffer masks certain parts of the drawing area so that masked parts are not drawn on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#stencil() stencil()}, and {@link com.trolltech.qt.opengl.QGLFormat#setStencilBufferSize(int) setStencilBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStencil(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStencil_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setStencil_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred stencil buffer size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#stencilBufferSize() stencilBufferSize()}, {@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) setStencil()}, and {@link com.trolltech.qt.opengl.QGLFormat#stencil() stencil()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStencilBufferSize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStencilBufferSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setStencilBufferSize_int(long __this__nativeId, int size);

/**
If <tt>enable</tt> is true enables stereo buffering; otherwise disables stereo buffering. <p>Stereo buffering is disabled by default. <p>Stereo buffering provides extra color buffers to generate left-eye and right-eye images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#stereo() stereo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStereo(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStereo_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setStereo_boolean(long __this__nativeId, boolean enable);

/**
Set the preferred swap interval. This can be used to sync the GL drawing into a system window to the vertical refresh of the screen. Setting an <tt>interval</tt> value of 0 will turn the vertical refresh syncing off, any value higher than 0 will turn the vertical syncing on. <p>Under Windows and under X11, where the <tt>WGL_EXT_swap_control</tt> and <tt>GLX_SGI_video_sync</tt> extensions are used, the <tt>interval</tt> parameter can be used to set the minimum number of video frames that are displayed before a buffer swap will occur. In effect, setting the <tt>interval</tt> to 10, means there will be 10 vertical retraces between every buffer swap. <p>Under Windows the <tt>WGL_EXT_swap_control</tt> extension has to be present, and under X11 the <tt>GLX_SGI_video_sync</tt> extension has to be present. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#swapInterval() swapInterval()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSwapInterval(int interval)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSwapInterval_int(nativeId(), interval);
    }
    @QtBlockedSlot
    native void __qt_setSwapInterval_int(long __this__nativeId, int interval);

/**
Returns true if the stencil buffer is enabled; otherwise returns false. The stencil buffer is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) setStencil()}, and {@link com.trolltech.qt.opengl.QGLFormat#setStencilBufferSize(int) setStencilBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean stencil()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stencil(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_stencil(long __this__nativeId);

/**
Returns the stencil buffer size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#stencil() stencil()}, {@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) setStencil()}, and {@link com.trolltech.qt.opengl.QGLFormat#setStencilBufferSize(int) setStencilBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int stencilBufferSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stencilBufferSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_stencilBufferSize(long __this__nativeId);

/**
Returns true if stereo buffering is enabled; otherwise returns false. Stereo buffering is disabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setStereo(boolean) setStereo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean stereo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stereo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_stereo(long __this__nativeId);

/**
Returns the currently set swap interval. -1 is returned if setting the swap interval isn't supported in the system GL implementation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setSwapInterval(int) setSwapInterval()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int swapInterval()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_swapInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_swapInterval(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.opengl.QGL.FormatOption ... opt) {
        return this.testOption(new com.trolltech.qt.opengl.QGL.FormatOptions(opt));
    }
/**
Returns true if format option <tt>opt</tt> is set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setOption(com.trolltech.qt.opengl.QGL.FormatOption[]) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.opengl.QGL.FormatOptions opt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_FormatOptions(nativeId(), opt.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_FormatOptions(long __this__nativeId, int opt);

/**
Returns the default QGLFormat for the application. All QGLWidgets that are created use this format unless another format is specified, e.g. when they are constructed. <p>If no special default format has been set using {@link com.trolltech.qt.opengl.QGLFormat#setDefaultFormat(com.trolltech.qt.opengl.QGLFormat) setDefaultFormat()}, the default format is the same as that created with QGLFormat(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDefaultFormat(com.trolltech.qt.opengl.QGLFormat) setDefaultFormat()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.opengl.QGLFormat defaultFormat();

/**
Returns the default QGLFormat for overlay contexts. <p>The factory default overlay format is: <ul><li> {@link com.trolltech.qt.opengl.QGLFormat#setDoubleBuffer(boolean) Double buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDepth(boolean) Depth buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setRgba(boolean) RGBA:} Disabled (i.e., color index enabled).</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAlpha(boolean) Alpha channel:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setAccum(boolean) Accumulator buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStencil(boolean) Stencil buffer:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setStereo(boolean) Stereo:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setDirectRendering(boolean) Direct rendering:} Enabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setOverlay(boolean) Overlay:} Disabled.</li><li> {@link com.trolltech.qt.opengl.QGLFormat#setPlane(int) Plane:} 1 (i.e., first overlay plane).</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#setDefaultOverlayFormat(com.trolltech.qt.opengl.QGLFormat) setDefaultOverlayFormat()}, and {@link com.trolltech.qt.opengl.QGLFormat#setDefaultFormat(com.trolltech.qt.opengl.QGLFormat) setDefaultFormat()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.opengl.QGLFormat defaultOverlayFormat();

/**
Returns true if the window system has any OpenGL support; otherwise returns false. <p><b>Warning:</b> This function must not be called until the {@link com.trolltech.qt.gui.QApplication QApplication} object has been created.
*/

    public native static boolean hasOpenGL();

/**
Returns true if the window system supports OpenGL overlays; otherwise returns false. <p><b>Warning:</b> This function must not be called until the {@link com.trolltech.qt.gui.QApplication QApplication} object has been created.
*/

    public native static boolean hasOpenGLOverlays();

/**
Identifies, at runtime, which OpenGL versions that are supported by the current platform. <p>Note that if OpenGL version 1.5 is supported, its predecessors (i.e., version 1.4 and lower) are also supported. To identify the support of a particular feature, like multi texturing, test for the version in which the feature was first introduced (i.e., version 1.3 in the case of multi texturing) to adapt to the largest possible group of runtime platforms. <p>This function needs a valid current OpenGL context to work; otherwise it will return {@link com.trolltech.qt.opengl.QGLFormat.OpenGLVersionFlag OpenGL_Version_None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#hasOpenGL() hasOpenGL()}, and {@link com.trolltech.qt.opengl.QGLFormat#hasOpenGLOverlays() hasOpenGLOverlays()}. <br></DD></DT>
*/

    public static com.trolltech.qt.opengl.QGLFormat.OpenGLVersionFlags openGLVersionFlags()    {
        return new com.trolltech.qt.opengl.QGLFormat.OpenGLVersionFlags(__qt_openGLVersionFlags());
    }
    native static int __qt_openGLVersionFlags();

/**
Sets a new default QGLFormat for the application to <tt>f</tt>. For example, to set single buffering as the default instead of double buffering, your main() might contain code like this: <pre class="snippet">
    QApplication.initialize(args);
    QGLFormat f = new QGLFormat();
    f.setDoubleBuffer(false);
    QGLFormat.setDefaultFormat(f);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultFormat() defaultFormat()}. <br></DD></DT>
*/

    public static void setDefaultFormat(com.trolltech.qt.opengl.QGLFormat f)    {
        __qt_setDefaultFormat_QGLFormat(f == null ? 0 : f.nativeId());
    }
    native static void __qt_setDefaultFormat_QGLFormat(long f);

/**
Sets a new default QGLFormat for overlay contexts to <tt>f</tt>. This format is used whenever a {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} is created with a format that {@link com.trolltech.qt.opengl.QGLFormat#hasOverlay() hasOverlay()} enabled. <p>For example, to get a double buffered overlay context (if available), use code like this: <pre class="snippet">
    QGLFormat f = QGLFormat.defaultOverlayFormat();
    f.setDoubleBuffer(true);
    QGLFormat.setDefaultOverlayFormat(f);
</pre> As usual, you can find out after widget creation whether the underlying OpenGL system was able to provide the requested specification: <pre class="snippet">
    // ...continued from above
    MyGLWidget myWidget = new MyGLWidget(new QGLFormat(new QGL.FormatOptions(QGL.FormatOption.HasOverlay)));
    if (myWidget.format().hasOverlay()) {
        // Yes, we got an overlay, let's check _its_ format:
        QGLContext olContext = myWidget.overlayContext();
        if (olContext.format().doubleBuffer())
        ; // yes, we got a double buffered overlay
        else
        ; // no, only single buffered overlays are available
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLFormat#defaultOverlayFormat() defaultOverlayFormat()}. <br></DD></DT>
*/

    public static void setDefaultOverlayFormat(com.trolltech.qt.opengl.QGLFormat f)    {
        __qt_setDefaultOverlayFormat_QGLFormat(f == null ? 0 : f.nativeId());
    }
    native static void __qt_setDefaultOverlayFormat_QGLFormat(long f);

/**
@exclude
*/

    public static native QGLFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QGLFormat array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.opengl.QGLFormat)
        return operator_equal((com.trolltech.qt.opengl.QGLFormat) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QGLFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QGLFormat __qt_clone(long __this_nativeId);
}
