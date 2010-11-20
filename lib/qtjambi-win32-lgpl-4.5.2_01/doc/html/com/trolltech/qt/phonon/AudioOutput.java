package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class AudioOutput extends com.trolltech.qt.phonon.AbstractAudioOutput
{
/**

*/

    public final Signal1<java.lang.Boolean> mutedChanged = new Signal1<java.lang.Boolean>();

    private final void mutedChanged(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mutedChanged_boolean(nativeId(), arg__1);
    }
    native void __qt_mutedChanged_boolean(long __this__nativeId, boolean arg__1);
/**

*/

    public final Signal1<com.trolltech.qt.phonon.AudioOutputDevice> outputDeviceChanged = new Signal1<com.trolltech.qt.phonon.AudioOutputDevice>();

    private final void outputDeviceChanged(com.trolltech.qt.phonon.AudioOutputDevice newAudioOutputDevice)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_outputDeviceChanged_AudioOutputDevice(nativeId(), newAudioOutputDevice == null ? 0 : newAudioOutputDevice.nativeId());
    }
    native void __qt_outputDeviceChanged_AudioOutputDevice(long __this__nativeId, long newAudioOutputDevice);
/**

*/

    public final Signal1<java.lang.Double> volumeChanged = new Signal1<java.lang.Double>();

    private final void volumeChanged(double newVolume)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_volumeChanged_double(nativeId(), newVolume);
    }
    native void __qt_volumeChanged_double(long __this__nativeId, double newVolume);


/**
This is an overloaded method provided for convenience.
*/

    public AudioOutput(com.trolltech.qt.phonon.Phonon.Category category) {
        this(category, (com.trolltech.qt.core.QObject)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public AudioOutput(com.trolltech.qt.phonon.Phonon.Category category, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_AudioOutput_Category_QObject(category.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_AudioOutput_Category_QObject(int category, long parent);


/**
This is an overloaded method provided for convenience.
*/

    public AudioOutput() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public AudioOutput(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_AudioOutput_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_AudioOutput_QObject(long parent);

/**
Returns the category of this output. <p><DT><b>See also:</b><br><DD>Phonon::AudioOutput::AudioOutput(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Phonon.Category category()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.Phonon.Category.resolve(__qt_category(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_category(long __this__nativeId);

/**
This property tells whether the output is muted. <p>Muting the output has the same effect as calling setVolume(0.0).
*/

    @com.trolltech.qt.QtPropertyReader(name="muted")
    @QtBlockedSlot
    public final boolean isMuted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMuted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMuted(long __this__nativeId);

/**
This is the name that appears in Mixer applications that control the volume of this output.
*/

    @com.trolltech.qt.QtPropertyReader(name="name")
    @QtBlockedSlot
    public final java.lang.String name()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
This property holds the (hardware) destination for the output. <p>The default device is determined by the {@link com.trolltech.qt.phonon.Phonon.Category Category } and the global configuration for that category. Normally you don't need to override this setting - letting the user change the global configuration is the right choice. You can still override the device though, if you have good reasons to do so. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.AudioOutput#outputDeviceChanged outputDeviceChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="outputDevice")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.AudioOutputDevice outputDevice()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AudioOutputDevice __qt_outputDevice(long __this__nativeId);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="muted")
    public final void setMuted(boolean mute)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMuted_boolean(nativeId(), mute);
    }
    native void __qt_setMuted_boolean(long __this__nativeId, boolean mute);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="name")
    public final void setName(java.lang.String newName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_String(nativeId(), newName);
    }
    native void __qt_setName_String(long __this__nativeId, java.lang.String newName);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="outputDevice")
    public final boolean setOutputDevice(com.trolltech.qt.phonon.AudioOutputDevice newAudioOutputDevice)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setOutputDevice_AudioOutputDevice(nativeId(), newAudioOutputDevice == null ? 0 : newAudioOutputDevice.nativeId());
    }
    native boolean __qt_setOutputDevice_AudioOutputDevice(long __this__nativeId, long newAudioOutputDevice);

/**
This is the current loudness of the output. <p>(it is using Stevens' law to calculate the change in voltage internally). <p><DT><b>See also:</b><br><DD>volumeDecibel. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="volume")
    public final void setVolume(double newVolume)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolume_double(nativeId(), newVolume);
    }
    native void __qt_setVolume_double(long __this__nativeId, double newVolume);

/**
This is the current volume of the output in decibel. <p>0 dB means no change in volume, -6dB means an attenuation of the voltage to 50% and an attenuation of the power to 25%, -inf dB means silence. <p><DT><b>See also:</b><br><DD>volume. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="volumeDecibel")
    public final void setVolumeDecibel(double newVolumeDecibel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolumeDecibel_double(nativeId(), newVolumeDecibel);
    }
    native void __qt_setVolumeDecibel_double(long __this__nativeId, double newVolumeDecibel);

/**
This is the current loudness of the output. <p>(it is using Stevens' law to calculate the change in voltage internally). <p><DT><b>See also:</b><br><DD>volumeDecibel. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="volume")
    @QtBlockedSlot
    public final double volume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_volume(nativeId());
    }
    @QtBlockedSlot
    native double __qt_volume(long __this__nativeId);

/**
This is the current volume of the output in decibel. <p>0 dB means no change in volume, -6dB means an attenuation of the voltage to 50% and an attenuation of the power to 25%, -inf dB means silence. <p><DT><b>See also:</b><br><DD>volume. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="volumeDecibel")
    @QtBlockedSlot
    public final double volumeDecibel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_volumeDecibel(nativeId());
    }
    @QtBlockedSlot
    native double __qt_volumeDecibel(long __this__nativeId);

/**
@exclude
*/

    public static native AudioOutput fromNativePointer(QNativePointer nativePointer);

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

    protected AudioOutput(QPrivateConstructor p) { super(p); } 
}
