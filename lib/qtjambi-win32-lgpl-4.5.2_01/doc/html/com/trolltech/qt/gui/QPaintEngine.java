package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPaintEngine class provides an abstract definition of how {@link com.trolltech.qt.gui.QPainter QPainter} draws to a given device on a given platform. Qt 4.0 provides several premade implementations of QPaintEngine for the different painter backends we support. We provide one paint engine for each window system and painting framework we support. This includes X11 on Unix/Linux and {@link com.trolltech.qt.gui.QPaintEngine.Type CoreGraphics } on Mac OS X. In addition we provide QPaintEngine implementations for {@link com.trolltech.qt.gui.QPaintEngine.Type OpenGL } (accessible through {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}) and {@link com.trolltech.qt.gui.QPaintEngine.Type PostScript } (accessible through QPSPrinter on X11). Additionally there is a raster-based paint engine that is a fallback for when an engine does not support a certain capability. <p>If one wants to use {@link com.trolltech.qt.gui.QPainter QPainter} to draw to a different backend, one must subclass QPaintEngine and reimplement all its virtual functions. The QPaintEngine implementation is then made available by subclassing {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} and reimplementing the virtual function {@link com.trolltech.qt.gui.QPaintDevice#paintEngine() QPaintDevice::paintEngine()}. <p>QPaintEngine is created and owned by the {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} that created it. <p>The big advantage of the QPaintEngine approach opposed to Qt 3's {@link com.trolltech.qt.gui.QPainter QPainter}/QPaintDevice::cmd() approach is that it is now possible to adapt to multiple technologies on each platform and take advantage of each to the fullest. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QPaintDevice#paintEngine() QPaintDevice::paintEngine()}, and {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QPaintEngine extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QPaintEngine {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean begin(com.trolltech.qt.gui.QPaintDeviceInterface pdev) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_begin_QPaintDevice(nativeId(), pdev == null ? 0 : pdev.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void drawPixmap(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QPixmap pm, com.trolltech.qt.core.QRectF sr) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_drawPixmap_QRectF_QPixmap_QRectF(nativeId(), r == null ? 0 : r.nativeId(), pm == null ? 0 : pm.nativeId(), sr == null ? 0 : sr.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean end() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_end(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QPaintEngine.Type type() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.gui.QPaintEngine.Type.resolve(super.__qt_type(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public void updateState(com.trolltech.qt.gui.QPaintEngineState state) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_updateState_QPaintEngineState(nativeId(), state == null ? 0 : state.nativeId());
        }
    }

    public enum PolygonDrawMode implements com.trolltech.qt.QtEnumerator {
/**
 The polygon should be drawn using OddEven fill rule.
*/

        OddEvenMode(0),
/**
 The polygon should be drawn using Winding fill rule.
*/

        WindingMode(1),
/**
 The polygon is a convex polygon and can be drawn using specialized algorithms where available.
*/

        ConvexMode(2),
/**
 Only the outline of the polygon should be drawn.
*/

        PolylineMode(3);

        PolygonDrawMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPaintEngine$PolygonDrawMode constant with the specified <tt>int</tt>.</brief>
*/

        public static PolygonDrawMode resolve(int value) {
            return (PolygonDrawMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OddEvenMode;
            case 1: return WindingMode;
            case 2: return ConvexMode;
            case 3: return PolylineMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Type implements com.trolltech.qt.QtEnumerator {
/**

*/

        X11(0),
/**

*/

        Windows(1),
/**
 Mac OS X's {@link com.trolltech.qt.gui.QPaintEngine.Type QuickDraw }
*/

        QuickDraw(2),
/**
 Mac OS X's Quartz2D ({@link com.trolltech.qt.gui.QPaintEngine.Type CoreGraphics })
*/

        CoreGraphics(3),
/**

*/

        MacPrinter(4),
/**
 Qt for Embedded Linux
*/

        QWindowSystem(5),
/**

*/

        PostScript(6),
/**

*/

        OpenGL(7),
/**
 {@link com.trolltech.qt.gui.QPicture QPicture} format
*/

        Picture(8),
/**
 Scalable Vector Graphics XML format
*/

        SVG(9),
/**

*/

        Raster(10),
/**
 Windows only, {@link com.trolltech.qt.gui.QPaintEngine.Type Direct3D } based engine
*/

        Direct3D(11),
/**
 Portable Document Format
*/

        Pdf(12),
/**

*/

        OpenVG(13),
/**
 First user type ID
*/

        User(50),
/**
 Last user type ID
*/

        MaxUser(100);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPaintEngine$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return X11;
            case 1: return Windows;
            case 2: return QuickDraw;
            case 3: return CoreGraphics;
            case 4: return MacPrinter;
            case 5: return QWindowSystem;
            case 6: return PostScript;
            case 7: return OpenGL;
            case 8: return Picture;
            case 9: return SVG;
            case 10: return Raster;
            case 11: return Direct3D;
            case 12: return Pdf;
            case 13: return OpenVG;
            case 50: return User;
            case 100: return MaxUser;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to describe the features or capabilities that the paint engine has. If a feature is not supported by the engine, {@link com.trolltech.qt.gui.QPainter QPainter} will do a best effort to emulate that feature through other means and pass on an alpha blended {@link com.trolltech.qt.gui.QImage QImage} to the engine with the emulated results. Some features cannot be emulated: {@link com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature AlphaBlend } and {@link com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature PorterDuff }.
*/

    public enum PaintEngineFeature implements com.trolltech.qt.QtEnumerator {
/**
 The engine has support for transforming drawing primitives.
*/

        PrimitiveTransform(1),
/**
 The engine has support for transforming brush patterns.
*/

        PatternTransform(2),
/**
 The engine can transform pixmaps, including rotation and shearing.
*/

        PixmapTransform(4),
/**
 The engine is capable of rendering brushes with the brush patterns specified in {@link com.trolltech.qt.core.Qt.BrushStyle Qt::BrushStyle }.
*/

        PatternBrush(8),
/**
 The engine supports linear gradient fills.
*/

        LinearGradientFill(16),
/**
 The engine supports radial gradient fills.
*/

        RadialGradientFill(32),
/**
 The engine supports conical gradient fills.
*/

        ConicalGradientFill(64),
/**
 The engine can alpha blend primitives.
*/

        AlphaBlend(128),
/**
 The engine supports Porter-Duff operations
*/

        PorterDuff(256),
/**
 The engine has path support.
*/

        PainterPaths(512),
/**
 The engine can use antialising to improve the appearance of rendered primitives.
*/

        Antialiasing(1024),
/**
 The engine supports drawing strokes that contain brushes as fills, not just solid colors (e.g. a dashed gradient line of width 2).
*/

        BrushStroke(2048),
/**
 The engine supports the feature provided by {@link com.trolltech.qt.gui.QPainter#setOpacity(double) QPainter::setOpacity()}.
*/

        ConstantOpacity(4096),
/**
 The engine is capable of rendering brushes that has a texture with an alpha channel or a mask.
*/

        MaskedBrush(8192),
/**
 The engine has support for performing perspective transformations on primitives.
*/

        PerspectiveTransform(16384),
/**
 The engine supports blending modes.
*/

        BlendModes(32768),
/**
 The engine has native support for gradients with coordinate mode {@link com.trolltech.qt.gui.QGradient.CoordinateMode QGradient::ObjectBoundingMode }. Otherwise, if {@link com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature QPaintEngine::PatternTransform } is supported, object bounding mode gradients are converted to gradients with coordinate mode {@link com.trolltech.qt.gui.QGradient.CoordinateMode QGradient::LogicalMode } and a brush transform for the coordinate mapping.
*/

        ObjectBoundingModeGradients(65536),
/**
 The engine supports bitwise raster operations.
*/

        RasterOpModes(131072),
/**
 The engine is capable of painting outside of paint events.
*/

        PaintOutsidePaintEvent(536870912),
/**
 All of the above features. This enum value is usually used as a bit mask.
*/

        AllFeatures(-1);

        PaintEngineFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QPaintEngine$PaintEngineFeatures with the specified <tt>com.trolltech.qt.gui.QPaintEngine$PaintEngineFeature[]</tt> QPaintEngine$PaintEngineFeature values set.</brief>
*/

        public static PaintEngineFeatures createQFlags(PaintEngineFeature ... values) {
            return new PaintEngineFeatures(values);
        }
/**
<brief>Returns the QPaintEngine$PaintEngineFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static PaintEngineFeature resolve(int value) {
            return (PaintEngineFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return PrimitiveTransform;
            case 2: return PatternTransform;
            case 4: return PixmapTransform;
            case 8: return PatternBrush;
            case 16: return LinearGradientFill;
            case 32: return RadialGradientFill;
            case 64: return ConicalGradientFill;
            case 128: return AlphaBlend;
            case 256: return PorterDuff;
            case 512: return PainterPaths;
            case 1024: return Antialiasing;
            case 2048: return BrushStroke;
            case 4096: return ConstantOpacity;
            case 8192: return MaskedBrush;
            case 16384: return PerspectiveTransform;
            case 32768: return BlendModes;
            case 65536: return ObjectBoundingModeGradients;
            case 131072: return RasterOpModes;
            case 536870912: return PaintOutsidePaintEvent;
            case -1: return AllFeatures;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class PaintEngineFeatures extends com.trolltech.qt.QFlags<PaintEngineFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QPaintEngine-PaintEngineFeatures with the specified <tt>com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature[]</tt>. flags set.</brief>
*/

        public PaintEngineFeatures(PaintEngineFeature ... args) { super(args); }
        public PaintEngineFeatures(int value) { setValue(value); }
    }
/**
These types are used by {@link com.trolltech.qt.gui.QPainter QPainter} to trigger lazy updates of the various states in the {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} using {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <p>A paint engine must update every dirty state.
*/


    public enum DirtyFlag implements com.trolltech.qt.QtEnumerator {
/**
 The pen is dirty and needs to be updated.
*/

        DirtyPen(1),
/**
 The brush is dirty and needs to be updated.
*/

        DirtyBrush(2),
/**
 The brush origin is dirty and needs to updated.
*/

        DirtyBrushOrigin(4),
/**
 The font is dirty and needs to be updated.
*/

        DirtyFont(8),
/**
 The background is dirty and needs to be updated.
*/

        DirtyBackground(16),
/**
 The background mode is dirty and needs to be updated.
*/

        DirtyBackgroundMode(32),
/**
 The transform is dirty and needs to be updated.
*/

        DirtyTransform(64),
/**
 The clip region is dirty and needs to be updated.
*/

        DirtyClipRegion(128),
/**
 The clip path is dirty and needs to be updated.
*/

        DirtyClipPath(256),
/**
 The render hints is dirty and needs to be updated.
*/

        DirtyHints(512),
/**
 The composition mode is dirty and needs to be updated.
*/

        DirtyCompositionMode(1024),
/**
 Whether clipping is enabled or not is dirty and needs to be updated.
*/

        DirtyClipEnabled(2048),
/**
 The constant opacity has changed and needs to be updated as part of the state change in {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}.
*/

        DirtyOpacity(4096),
/**
 Convenience enum used internally.
*/

        AllDirty(65535);

        DirtyFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QPaintEngine$DirtyFlags with the specified <tt>com.trolltech.qt.gui.QPaintEngine$DirtyFlag[]</tt> QPaintEngine$DirtyFlag values set.</brief>
*/

        public static DirtyFlags createQFlags(DirtyFlag ... values) {
            return new DirtyFlags(values);
        }
/**
<brief>Returns the QPaintEngine$DirtyFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static DirtyFlag resolve(int value) {
            return (DirtyFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DirtyPen;
            case 2: return DirtyBrush;
            case 4: return DirtyBrushOrigin;
            case 8: return DirtyFont;
            case 16: return DirtyBackground;
            case 32: return DirtyBackgroundMode;
            case 64: return DirtyTransform;
            case 128: return DirtyClipRegion;
            case 256: return DirtyClipPath;
            case 512: return DirtyHints;
            case 1024: return DirtyCompositionMode;
            case 2048: return DirtyClipEnabled;
            case 4096: return DirtyOpacity;
            case 65535: return AllDirty;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class DirtyFlags extends com.trolltech.qt.QFlags<DirtyFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QPaintEngine-DirtyFlags with the specified <tt>com.trolltech.qt.gui.QPaintEngine.DirtyFlag[]</tt>. flags set.</brief>
*/

        public DirtyFlags(DirtyFlag ... args) { super(args); }
        public DirtyFlags(int value) { setValue(value); }
    }




/**

*/

    public QPaintEngine(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature ... features) {
        this(new com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures(features));
    }

/**
Creates a paint engine with the featureset specified by <tt>caps</tt>.
*/

    public QPaintEngine() {
        this(new com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures(0));
    }
/**
Creates a paint engine with the featureset specified by <tt>caps</tt>.
*/

    public QPaintEngine(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures features){
        super((QPrivateConstructor)null);
        __qt_QPaintEngine_PaintEngineFeatures(features.value());
    }

    native void __qt_QPaintEngine_PaintEngineFeatures(int features);


/**

*/

    @QtBlockedSlot
    public final void clearDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlag ... df) {
        this.clearDirty(new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(df));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void clearDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlags df)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearDirty_DirtyFlags(nativeId(), df.value());
    }
    @QtBlockedSlot
    native void __qt_clearDirty_DirtyFlags(long __this__nativeId, int df);


/**

*/

    @QtBlockedSlot
    public final boolean hasFeature(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature ... feature) {
        return this.hasFeature(new com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures(feature));
    }
/**
Returns true if the paint engine supports the specified <tt>feature</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasFeature(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures feature)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFeature_PaintEngineFeatures(nativeId(), feature.value());
    }
    @QtBlockedSlot
    native boolean __qt_hasFeature_PaintEngineFeatures(long __this__nativeId, int feature);

/**
Returns true if the paint engine is actively drawing; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine#setActive(boolean) setActive()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isExtended()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExtended(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExtended(long __this__nativeId);

/**
Returns the device that this engine is painting on, if painting is active; otherwise returns 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPaintDeviceInterface paintDevice()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintDeviceInterface __qt_paintDevice(long __this__nativeId);

/**
Returns the paint engine's painter.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter painter()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_painter(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainter __qt_painter(long __this__nativeId);

/**
Sets the active state of the paint engine to <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setActive(boolean newState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActive_boolean(nativeId(), newState);
    }
    @QtBlockedSlot
    native void __qt_setActive_boolean(long __this__nativeId, boolean newState);


/**

*/

    @QtBlockedSlot
    public final void setDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlag ... df) {
        this.setDirty(new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(df));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlags df)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirty_DirtyFlags(nativeId(), df.value());
    }
    @QtBlockedSlot
    native void __qt_setDirty_DirtyFlags(long __this__nativeId, int df);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSystemClip(com.trolltech.qt.gui.QRegion baseClip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSystemClip_QRegion(nativeId(), baseClip == null ? 0 : baseClip.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSystemClip_QRegion(long __this__nativeId, long baseClip);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSystemRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSystemRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSystemRect_QRect(long __this__nativeId, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void syncState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_syncState(nativeId());
    }
    @QtBlockedSlot
    native void __qt_syncState(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion systemClip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemClip(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_systemClip(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect systemRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_systemRect(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final boolean testDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlag ... df) {
        return this.testDirty(new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(df));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean testDirty(com.trolltech.qt.gui.QPaintEngine.DirtyFlags df)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testDirty_DirtyFlags(nativeId(), df.value());
    }
    @QtBlockedSlot
    native boolean __qt_testDirty_DirtyFlags(long __this__nativeId, int df);

/**
Reimplement this function to initialise your paint engine when painting is to start on the paint device <tt>pdev</tt>. Return true if the initialization was successful; otherwise return false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine#end() end()}, and {@link com.trolltech.qt.gui.QPaintEngine#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean begin(com.trolltech.qt.gui.QPaintDeviceInterface pdev);
    @QtBlockedSlot
    native boolean __qt_begin_QPaintDevice(long __this__nativeId, long pdev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QPoint coordinateOffset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_coordinateOffset(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_coordinateOffset(long __this__nativeId);

/**
The default implementation of this function calls the floating point version of this function
*/

    @QtBlockedSlot
    public void drawEllipse(com.trolltech.qt.core.QRect r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QRect(long __this__nativeId, long r);

/**
Reimplement this function to draw the largest ellipse that can be contained within rectangle <tt>rect</tt>. <p>The default implementation calls {@link com.trolltech.qt.gui.QPaintEngine#drawPolygon(com.trolltech.qt.core.QPoint[], com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode) drawPolygon()}.
*/

    @QtBlockedSlot
    public void drawEllipse(com.trolltech.qt.core.QRectF r)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawEllipse_QRectF(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawEllipse_QRectF(long __this__nativeId, long r);


/**

*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QImage pm, com.trolltech.qt.core.QRectF sr, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this.drawImage(r, pm, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Reimplement this function to draw the part of the <tt>image</tt> specified by the <tt>sr</tt> rectangle in the given <tt>rectangle</tt> using the given conversion flags <tt>flags</tt>, to convert it to a pixmap.
*/

    @QtBlockedSlot
    public final void drawImage(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QImage pm, com.trolltech.qt.core.QRectF sr) {
        drawImage(r, pm, sr, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Reimplement this function to draw the part of the <tt>image</tt> specified by the <tt>sr</tt> rectangle in the given <tt>rectangle</tt> using the given conversion flags <tt>flags</tt>, to convert it to a pixmap.
*/

    @QtBlockedSlot
    public void drawImage(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QImage pm, com.trolltech.qt.core.QRectF sr, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawImage_QRectF_QImage_QRectF_ImageConversionFlags(nativeId(), r == null ? 0 : r.nativeId(), pm == null ? 0 : pm.nativeId(), sr == null ? 0 : sr.nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_drawImage_QRectF_QImage_QRectF_ImageConversionFlags(long __this__nativeId, long r, long pm, long sr, int flags);

/**
This is an overloaded member function, provided for convenience. <p>The default implementation converts the first <tt>lineCount</tt> lines in <tt>lines</tt> to a {@link com.trolltech.qt.gui.QLineF QLineF} and calls the floating point version of this function.
*/

    @QtBlockedSlot
    public void drawLines(com.trolltech.qt.gui.QLine[] lines)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLines_nativepointer_int(nativeId(), lines);
    }
    @QtBlockedSlot
    native void __qt_drawLines_nativepointer_int(long __this__nativeId, com.trolltech.qt.gui.QLine[] lines);

/**
The default implementation splits the list of lines in <tt>lines</tt> into <tt>lineCount</tt> separate calls to {@link com.trolltech.qt.gui.QPaintEngine#drawPath(com.trolltech.qt.gui.QPainterPath) drawPath()} or {@link com.trolltech.qt.gui.QPaintEngine#drawPolygon(com.trolltech.qt.core.QPoint[], com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode) drawPolygon()} depending on the feature set of the paint engine.
*/

    @QtBlockedSlot
    public void drawLines(com.trolltech.qt.gui.QLineF[] lines)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawLines_nativepointer_int(nativeId(), lines);
    }
    @QtBlockedSlot
    native void __qt_drawLines_nativepointer_int(long __this__nativeId, com.trolltech.qt.gui.QLineF[] lines);

/**
The default implementation ignores the <tt>path</tt> and does nothing.
*/

    @QtBlockedSlot
    public void drawPath(com.trolltech.qt.gui.QPainterPath path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPath_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPath_QPainterPath(long __this__nativeId, long path);

/**
Reimplement this function to draw the part of the <tt>pm</tt> specified by the <tt>sr</tt> rectangle in the given <tt>r</tt>.
*/

    @QtBlockedSlot
    public abstract void drawPixmap(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QPixmap pm, com.trolltech.qt.core.QRectF sr);
    @QtBlockedSlot
    native void __qt_drawPixmap_QRectF_QPixmap_QRectF(long __this__nativeId, long r, long pm, long sr);

/**
Draws the first <tt>pointCount</tt> points in the buffer <tt>points</tt> <p>The default implementation converts the first <tt>pointCount</tt> QPoints in <tt>points</tt> to QPointFs and calls the floating point version of drawPoints.
*/

    @QtBlockedSlot
    public void drawPoints(com.trolltech.qt.core.QPoint[] points)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoints_nativepointer_int(nativeId(), points);
    }
    @QtBlockedSlot
    native void __qt_drawPoints_nativepointer_int(long __this__nativeId, com.trolltech.qt.core.QPoint[] points);

/**
Draws the first <tt>pointCount</tt> points in the buffer <tt>points</tt>
*/

    @QtBlockedSlot
    public void drawPoints(com.trolltech.qt.core.QPointF[] points)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPoints_nativepointer_int(nativeId(), points);
    }
    @QtBlockedSlot
    native void __qt_drawPoints_nativepointer_int(long __this__nativeId, com.trolltech.qt.core.QPointF[] points);

    @QtBlockedSlot
    public void drawPolygon(com.trolltech.qt.core.QPoint[] points, com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolygon_nativepointer_int_PolygonDrawMode(nativeId(), points, mode.value());
    }
    @QtBlockedSlot
    native void __qt_drawPolygon_nativepointer_int_PolygonDrawMode(long __this__nativeId, com.trolltech.qt.core.QPoint[] points, int mode);

/**
Reimplement this virtual function to draw the polygon defined by the <tt>pointCount</tt> first points in <tt>points</tt>, using mode <tt>mode</tt>. <p><b>Note:</b> At least one of the {@link com.trolltech.qt.gui.QPaintEngine#drawPolygon(com.trolltech.qt.core.QPoint[], com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode) drawPolygon()} functions must be reimplemented.
*/

/**
This is an overloaded member function, provided for convenience. <p>Reimplement this virtual function to draw the polygon defined by the <tt>pointCount</tt> first points in <tt>points</tt>, using mode <tt>mode</tt>. <p><b>Note:</b> At least one of the {@link com.trolltech.qt.gui.QPaintEngine#drawPolygon(com.trolltech.qt.core.QPoint[], com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode) drawPolygon()} functions must be reimplemented.
*/

    @QtBlockedSlot
    public void drawPolygon(com.trolltech.qt.core.QPointF[] points, com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPolygon_nativepointer_int_PolygonDrawMode(nativeId(), points, mode.value());
    }
    @QtBlockedSlot
    native void __qt_drawPolygon_nativepointer_int_PolygonDrawMode(long __this__nativeId, com.trolltech.qt.core.QPointF[] points, int mode);

/**
This is an overloaded member function, provided for convenience. <p>The default implementation converts the first <tt>rectCount</tt> rectangles in the buffer <tt>rects</tt> to a {@link com.trolltech.qt.core.QRectF QRectF} and calls the floating point version of this function.
*/

    @QtBlockedSlot
    public void drawRects(com.trolltech.qt.core.QRect[] rects)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRects_nativepointer_int(nativeId(), rects);
    }
    @QtBlockedSlot
    native void __qt_drawRects_nativepointer_int(long __this__nativeId, com.trolltech.qt.core.QRect[] rects);

/**
Draws the first <tt>rectCount</tt> rectangles in the buffer <tt>rects</tt>. The default implementation of this function calls {@link com.trolltech.qt.gui.QPaintEngine#drawPath(com.trolltech.qt.gui.QPainterPath) drawPath()} or {@link com.trolltech.qt.gui.QPaintEngine#drawPolygon(com.trolltech.qt.core.QPoint[], com.trolltech.qt.gui.QPaintEngine.PolygonDrawMode) drawPolygon()} depending on the feature set of the paint engine.
*/

    @QtBlockedSlot
    public void drawRects(com.trolltech.qt.core.QRectF[] rects)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRects_nativepointer_int(nativeId(), rects);
    }
    @QtBlockedSlot
    native void __qt_drawRects_nativepointer_int(long __this__nativeId, com.trolltech.qt.core.QRectF[] rects);

/**
This function draws the text item <tt>textItem</tt> at position <tt>p</tt>. The default implementation of this function converts the text to a {@link com.trolltech.qt.gui.QPainterPath QPainterPath} and paints the resulting path.
*/

    @QtBlockedSlot
    public void drawTextItem(com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QTextItem textItem)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTextItem_QPointF_QTextItem(nativeId(), p == null ? 0 : p.nativeId(), textItem == null ? 0 : textItem.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTextItem_QPointF_QTextItem(long __this__nativeId, long p, long textItem);

/**
Reimplement this function to draw the <tt>pixmap</tt> in the given <tt>rect</tt>, starting at the given <tt>p</tt>. The pixmap will be drawn repeatedly until the <tt>rect</tt> is filled.
*/

    @QtBlockedSlot
    public void drawTiledPixmap(com.trolltech.qt.core.QRectF r, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.QPointF s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTiledPixmap_QRectF_QPixmap_QPointF(nativeId(), r == null ? 0 : r.nativeId(), pixmap == null ? 0 : pixmap.nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTiledPixmap_QRectF_QPixmap_QPointF(long __this__nativeId, long r, long pixmap, long s);

/**
Reimplement this function to finish painting on the current paint device. Return true if painting was finished successfully; otherwise return false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine#begin(com.trolltech.qt.gui.QPaintDeviceInterface) begin()}, and {@link com.trolltech.qt.gui.QPaintEngine#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean end();
    @QtBlockedSlot
    native boolean __qt_end(long __this__nativeId);

/**
Reimplement this function to return the paint engine {@link com.trolltech.qt.gui.QPaintEngine.Type Type }.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QPaintEngine.Type type();
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Reimplement this function to update the state of a paint engine. <p>When implemented, this function is responsible for checking the paint engine's current <tt>state</tt> and update the properties that are changed. Use the {@link com.trolltech.qt.gui.QPaintEngineState#state() QPaintEngineState::state()} function to find out which properties that must be updated, then use the corresponding {@link com.trolltech.qt.gui.QPaintEngineState get function} to retrieve the current values for the given properties. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState QPaintEngineState}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void updateState(com.trolltech.qt.gui.QPaintEngineState state);
    @QtBlockedSlot
    native void __qt_updateState_QPaintEngineState(long __this__nativeId, long state);

/**

*/

    @QtBlockedSlot
    protected final void setExtended(int extended)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExtended_int(nativeId(), extended);
    }
    @QtBlockedSlot
    native void __qt_setExtended_int(long __this__nativeId, int extended);

/**

*/

    @QtBlockedSlot
    protected final int extended()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_extended(nativeId());
    }
    @QtBlockedSlot
    native int __qt_extended(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setSelfDestruct(int selfDestruct)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelfDestruct_int(nativeId(), selfDestruct);
    }
    @QtBlockedSlot
    native void __qt_setSelfDestruct_int(long __this__nativeId, int selfDestruct);

/**

*/

    @QtBlockedSlot
    protected final int selfDestruct()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selfDestruct(nativeId());
    }
    @QtBlockedSlot
    native int __qt_selfDestruct(long __this__nativeId);

/**
Sets the active state of the paint engine to <tt>active</tt>.
*/

    @QtBlockedSlot
    protected final void setActive(int active)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActive_int(nativeId(), active);
    }
    @QtBlockedSlot
    native void __qt_setActive_int(long __this__nativeId, int active);

/**
Returns the active state of this paint engine.
*/

    @QtBlockedSlot
    protected final int active()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_active(nativeId());
    }
    @QtBlockedSlot
    native int __qt_active(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setGccaps(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeature ... gccaps) {
        this.setGccaps(new com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures(gccaps));
    }
/**

*/

    @QtBlockedSlot
    protected final void setGccaps(com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures gccaps)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGccaps_PaintEngineFeatures(nativeId(), gccaps.value());
    }
    @QtBlockedSlot
    native void __qt_setGccaps_PaintEngineFeatures(long __this__nativeId, int gccaps);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures gccaps()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPaintEngine.PaintEngineFeatures(__qt_gccaps(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_gccaps(long __this__nativeId);

/**
@exclude
*/

    public static native QPaintEngine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPaintEngine(QPrivateConstructor p) { super(p); } 
}
