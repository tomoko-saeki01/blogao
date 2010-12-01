package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class VolumeSlider extends com.trolltech.qt.gui.QWidget
{

    private Object __rcAudioOutput = null;

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public VolumeSlider(com.trolltech.qt.phonon.AudioOutput arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VolumeSlider(com.trolltech.qt.phonon.AudioOutput arg__1, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_VolumeSlider_AudioOutput_QWidget(arg__1 == null ? 0 : arg__1.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VolumeSlider_AudioOutput_QWidget(long arg__1, long parent);


/**
This is an overloaded method provided for convenience.
*/

    public VolumeSlider() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VolumeSlider(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_VolumeSlider_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VolumeSlider_QWidget(long parent);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.phonon.VolumeSlider#setAudioOutput(com.trolltech.qt.phonon.AudioOutput) setAudioOutput()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.AudioOutput audioOutput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_audioOutput(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AudioOutput __qt_audioOutput(long __this__nativeId);

/**
This property holds whether slider tracking is enabled. <p>If tracking is enabled (the default), the volume changes while the slider is being dragged. If tracking is disabled, the volume changes only when the user releases the slider.
*/

    @com.trolltech.qt.QtPropertyReader(name="tracking")
    @QtBlockedSlot
    public final boolean hasTracking()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasTracking(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasTracking(long __this__nativeId);

/**
This property holds the icon size used for the mute button/icon.  The default size is defined by the GUI style.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
This property holds whether the mute button/icon next to the slider is visible. <p>By default the mute button/icon is visible.
*/

    @com.trolltech.qt.QtPropertyReader(name="muteVisible")
    @QtBlockedSlot
    public final boolean isMuteVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMuteVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMuteVisible(long __this__nativeId);

/**
This property holds the maximum volume that can be set with this slider. <p>By default the maximum value is 1.0 (100%).
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumVolume")
    @QtBlockedSlot
    public final double maximumVolume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumVolume(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumVolume(long __this__nativeId);

/**
This property holds the orientation of the slider. <p>The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } (the default) or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }.
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
This property holds the page step. <p>The larger of two natural steps that a slider provides and typically corresponds to the user pressing PageUp or PageDown. <p>Defaults to 5 (5% of the voltage).
*/

    @com.trolltech.qt.QtPropertyReader(name="pageStep")
    @QtBlockedSlot
    public final int pageStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageStep(long __this__nativeId);

/**

*/

    public final void setAudioOutput(com.trolltech.qt.phonon.AudioOutput arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcAudioOutput = arg__1;
        }
        __qt_setAudioOutput_AudioOutput(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_setAudioOutput_AudioOutput(long __this__nativeId, long arg__1);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    public final void setIconSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    native void __qt_setIconSize_QSize(long __this__nativeId, long size);

/**
This property holds the maximum volume that can be set with this slider. <p>By default the maximum value is 1.0 (100%).
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumVolume")
    public final void setMaximumVolume(double arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumVolume_double(nativeId(), arg__1);
    }
    native void __qt_setMaximumVolume_double(long __this__nativeId, double arg__1);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="muteVisible")
    public final void setMuteVisible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMuteVisible_boolean(nativeId(), arg__1);
    }
    native void __qt_setMuteVisible_boolean(long __this__nativeId, boolean arg__1);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), arg__1.value());
    }
    native void __qt_setOrientation_Orientation(long __this__nativeId, int arg__1);

/**
This property holds the page step. <p>The larger of two natural steps that a slider provides and typically corresponds to the user pressing PageUp or PageDown. <p>Defaults to 5 (5% of the voltage).
*/

    @com.trolltech.qt.QtPropertyWriter(name="pageStep")
    @QtBlockedSlot
    public final void setPageStep(int milliseconds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageStep_int(nativeId(), milliseconds);
    }
    @QtBlockedSlot
    native void __qt_setPageStep_int(long __this__nativeId, int milliseconds);

/**
This property holds the single step. <p>The smaller of two natural steps that a slider provides and typically corresponds to the user pressing an arrow key. <p>Defaults to 1 (1% of the voltage).
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleStep")
    @QtBlockedSlot
    public final void setSingleStep(int milliseconds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_int(nativeId(), milliseconds);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_int(long __this__nativeId, int milliseconds);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="tracking")
    @QtBlockedSlot
    public final void setTracking(boolean tracking)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTracking_boolean(nativeId(), tracking);
    }
    @QtBlockedSlot
    native void __qt_setTracking_boolean(long __this__nativeId, boolean tracking);

/**
This property holds the single step. <p>The smaller of two natural steps that a slider provides and typically corresponds to the user pressing an arrow key. <p>Defaults to 1 (1% of the voltage).
*/

    @com.trolltech.qt.QtPropertyReader(name="singleStep")
    @QtBlockedSlot
    public final int singleStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_singleStep(long __this__nativeId);

/**
@exclude
*/

    public static native VolumeSlider fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected VolumeSlider(QPrivateConstructor p) { super(p); } 
}
