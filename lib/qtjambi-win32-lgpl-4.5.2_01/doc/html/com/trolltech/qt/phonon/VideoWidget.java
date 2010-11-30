package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class VideoWidget extends com.trolltech.qt.gui.QWidget
    implements com.trolltech.qt.phonon.AbstractVideoOutputInterface,
            com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
    public enum AspectRatio implements com.trolltech.qt.QtEnumerator {
        AspectRatioAuto(0),
        AspectRatioWidget(1),
        AspectRatio4_3(2),
        AspectRatio16_9(3);

        AspectRatio(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the VideoWidget$AspectRatio constant with the specified <tt>int</tt>.</brief>
*/

        public static AspectRatio resolve(int value) {
            return (AspectRatio) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AspectRatioAuto;
            case 1: return AspectRatioWidget;
            case 2: return AspectRatio4_3;
            case 3: return AspectRatio16_9;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ScaleMode implements com.trolltech.qt.QtEnumerator {
        FitInView(0),
        ScaleAndCrop(1);

        ScaleMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the VideoWidget$ScaleMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ScaleMode resolve(int value) {
            return (ScaleMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FitInView;
            case 1: return ScaleAndCrop;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
This is an overloaded method provided for convenience.
*/

    public VideoWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VideoWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_VideoWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VideoWidget_QWidget(long parent);

/**
Defaults to {@link com.trolltech.qt.phonon.VideoWidget.AspectRatio AspectRatioAuto }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.VideoWidget.AspectRatio AspectRatio }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="aspectRatio")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.VideoWidget.AspectRatio aspectRatio()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.VideoWidget.AspectRatio.resolve(__qt_aspectRatio(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_aspectRatio(long __this__nativeId);

/**
This property holds brightness of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="brightness")
    @QtBlockedSlot
    public final double brightness()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brightness(nativeId());
    }
    @QtBlockedSlot
    native double __qt_brightness(long __this__nativeId);

/**
This property holds the contrast of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="contrast")
    @QtBlockedSlot
    public final double contrast()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contrast(nativeId());
    }
    @QtBlockedSlot
    native double __qt_contrast(long __this__nativeId);

/**
Convenience slot, calling setFullScreen(true)
*/

    public final void enterFullScreen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enterFullScreen(nativeId());
    }
    native void __qt_enterFullScreen(long __this__nativeId);

/**
Convenience slot, calling setFullScreen(false)
*/

    public final void exitFullScreen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_exitFullScreen(nativeId());
    }
    native void __qt_exitFullScreen(long __this__nativeId);

/**
This property holds the hue of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="hue")
    @QtBlockedSlot
    public final double hue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hue(nativeId());
    }
    @QtBlockedSlot
    native double __qt_hue(long __this__nativeId);

/**
Returns the paths that inputs multimedia to this media node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#outputPaths() outputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_inputPaths(long __this__nativeId);

/**
Returns true if the backend provides an implementation of this class; otherwise returns false. <p>This does not guarantee that instances of the class works as expected, but that the backend has implemented the functionality for this class. For instance, Qt's GStreamer backend will return true for instances of the {@link com.trolltech.qt.phonon.AudioOutput AudioOutput} class, even if there is a problem with GStreamer and it could not play sound.
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
Returns the paths to which this media node outputs media. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#inputPaths() inputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> outputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

/**
This property holds saturation of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="saturation")
    @QtBlockedSlot
    public final double saturation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saturation(nativeId());
    }
    @QtBlockedSlot
    native double __qt_saturation(long __this__nativeId);

/**
If the size of the widget and the size of the video are not equal. The video will be zoomed to fit the widget. The smaller zoom (AddBarsScaleMode) adds black bars at the left/right or top/bottom to make all of the image visible (default). The bigger zoom (ExpandMode) fills the widget completely, keeping all information in one direction and leaving parts of the image outside of the widget in the other direction.
*/

    @com.trolltech.qt.QtPropertyReader(name="scaleMode")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.VideoWidget.ScaleMode scaleMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.VideoWidget.ScaleMode.resolve(__qt_scaleMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_scaleMode(long __this__nativeId);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="aspectRatio")
    public final void setAspectRatio(com.trolltech.qt.phonon.VideoWidget.AspectRatio arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAspectRatio_AspectRatio(nativeId(), arg__1.value());
    }
    native void __qt_setAspectRatio_AspectRatio(long __this__nativeId, int arg__1);

/**
This property holds brightness of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="brightness")
    public final void setBrightness(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrightness_double(nativeId(), value);
    }
    native void __qt_setBrightness_double(long __this__nativeId, double value);

/**
This property holds the contrast of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="contrast")
    public final void setContrast(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContrast_double(nativeId(), value);
    }
    native void __qt_setContrast_double(long __this__nativeId, double value);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="fullScreen")
    public final void setFullScreen(boolean fullscreen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFullScreen_boolean(nativeId(), fullscreen);
    }
    native void __qt_setFullScreen_boolean(long __this__nativeId, boolean fullscreen);

/**
This property holds the hue of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="hue")
    public final void setHue(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHue_double(nativeId(), value);
    }
    native void __qt_setHue_double(long __this__nativeId, double value);

/**
This property holds saturation of the video. <p>Default is 0. Acceptable values are in range of -1, 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="saturation")
    public final void setSaturation(double value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSaturation_double(nativeId(), value);
    }
    native void __qt_setSaturation_double(long __this__nativeId, double value);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="scaleMode")
    public final void setScaleMode(com.trolltech.qt.phonon.VideoWidget.ScaleMode arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaleMode_ScaleMode(nativeId(), arg__1.value());
    }
    native void __qt_setScaleMode_ScaleMode(long __this__nativeId, int arg__1);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native VideoWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected VideoWidget(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractVideoOutput(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
