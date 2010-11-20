package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class AbstractVolumeFader extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractVolumeFaderInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractVolumeFader(){
        super((QPrivateConstructor)null);
        __qt_AbstractVolumeFader();
    }

    native void __qt_AbstractVolumeFader();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve fadeCurve()    {
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

    @QtBlockedSlot
    public void fadeTo(float arg__1, int arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fadeTo_float_int(nativeId(), arg__1, arg__2);
    }
    @QtBlockedSlot
    native void __qt_fadeTo_float_int(long __this__nativeId, float arg__1, int arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setFadeCurve(com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFadeCurve_FadeCurve(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setFadeCurve_FadeCurve(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setVolume(float arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolume_float(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setVolume_float(long __this__nativeId, float arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public float volume()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_volume(nativeId());
    }
    @QtBlockedSlot
    native float __qt_volume(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractVolumeFader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractVolumeFader(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractVolumeFader(long ptr);
}
