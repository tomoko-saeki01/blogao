package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class VolumeFaderEffect extends com.trolltech.qt.phonon.Effect
{
    public enum FadeCurve implements com.trolltech.qt.QtEnumerator {
        Fade3Decibel(0),
        Fade6Decibel(1),
        Fade9Decibel(2),
        Fade12Decibel(3);

        FadeCurve(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the VolumeFaderEffect$FadeCurve constant with the specified <tt>int</tt>.</brief>
*/

        public static FadeCurve resolve(int value) {
            return (FadeCurve) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Fade3Decibel;
            case 1: return Fade6Decibel;
            case 2: return Fade9Decibel;
            case 3: return Fade12Decibel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
This is an overloaded method provided for convenience.
*/

    public VolumeFaderEffect() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VolumeFaderEffect(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_VolumeFaderEffect_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VolumeFaderEffect_QObject(long parent);

/**
This property holds the fade curve to be used for the fadeIn(), fadeOut() and fadeTo() slots. <p>Defaults to {@link com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve Fade3Decibel }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve FadeCurve }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fadeCurve")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve fadeCurve()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve.resolve(__qt_fadeCurve(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fadeCurve(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void fadeIn(int fadeTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fadeIn_int(nativeId(), fadeTime);
    }
    native void __qt_fadeIn_int(long __this__nativeId, int fadeTime);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void fadeOut(int fadeTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fadeOut_int(nativeId(), fadeTime);
    }
    native void __qt_fadeOut_int(long __this__nativeId, int fadeTime);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void fadeTo(float volume, int fadeTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fadeTo_float_int(nativeId(), volume, fadeTime);
    }
    native void __qt_fadeTo_float_int(long __this__nativeId, float volume, int fadeTime);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="fadeCurve")
    public final void setFadeCurve(com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve curve)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFadeCurve_FadeCurve(nativeId(), curve.value());
    }
    native void __qt_setFadeCurve_FadeCurve(long __this__nativeId, int curve);

/**
This is the current volume of the output as voltage factor. Setting this property changes the volume immediately. <p>1.0 means 100%, 0.5 means 50% voltage/25% power, 0.0 means 0% <p><DT><b>See also:</b><br><DD>volumeDecibel. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="volume")
    public final void setVolume(float volume)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolume_float(nativeId(), volume);
    }
    native void __qt_setVolume_float(long __this__nativeId, float volume);

/**
This is the current volume of the output in decibel. Setting this property changes the volume immediately. <p>0 dB means no change in volume, -6dB means an attenuation of the voltage to 50% and an attenuation of the power to 25%, -inf dB means silence. <p><DT><b>See also:</b><br><DD>volume. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="volumeDecibel")
    public final void setVolumeDecibel(double volumeDecibel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolumeDecibel_double(nativeId(), volumeDecibel);
    }
    native void __qt_setVolumeDecibel_double(long __this__nativeId, double volumeDecibel);

/**
This is the current volume of the output as voltage factor. Setting this property changes the volume immediately. <p>1.0 means 100%, 0.5 means 50% voltage/25% power, 0.0 means 0% <p><DT><b>See also:</b><br><DD>volumeDecibel. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="volume")
    @QtBlockedSlot
    public final float volume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_volume(nativeId());
    }
    @QtBlockedSlot
    native float __qt_volume(long __this__nativeId);

/**
This is the current volume of the output in decibel. Setting this property changes the volume immediately. <p>0 dB means no change in volume, -6dB means an attenuation of the voltage to 50% and an attenuation of the power to 25%, -inf dB means silence. <p><DT><b>See also:</b><br><DD>volume. <br></DD></DT>
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

    public static native VolumeFaderEffect fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected VolumeFaderEffect(QPrivateConstructor p) { super(p); } 
}
