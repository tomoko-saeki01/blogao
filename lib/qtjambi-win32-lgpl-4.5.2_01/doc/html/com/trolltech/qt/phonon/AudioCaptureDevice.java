package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class AudioCaptureDevice extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public AudioCaptureDevice(){
        super((QPrivateConstructor)null);
        __qt_AudioCaptureDevice();
    }

    native void __qt_AudioCaptureDevice();

/**
This is an overloaded method provided for convenience.
*/

    public AudioCaptureDevice(int index, java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> properties){
        super((QPrivateConstructor)null);
        __qt_AudioCaptureDevice_int_HashMap(index, properties);
    }

    native void __qt_AudioCaptureDevice_int_HashMap(int index, java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> properties);

/**

*/

    @QtBlockedSlot
    public final java.lang.String description()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final int index()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index(nativeId());
    }
    @QtBlockedSlot
    native int __qt_index(long __this__nativeId);

/**

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

*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.phonon.AudioCaptureDevice otherDescription)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_Phonon_ObjectDescription(nativeId(), otherDescription == null ? 0 : otherDescription.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_Phonon_ObjectDescription(long __this__nativeId, long otherDescription);

    @QtBlockedSlot
    private final java.lang.Object property(com.trolltech.qt.QNativePointer name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_property_nativepointer(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_property_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer name);

/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> propertyNames()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyNames(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_propertyNames(long __this__nativeId);

/**
@exclude
*/

    public static native AudioCaptureDevice fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AudioCaptureDevice(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(AudioCaptureDevice array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.phonon.AudioCaptureDevice)
        return operator_equal((com.trolltech.qt.phonon.AudioCaptureDevice) other);
        return false;
    }


    /**
     * Returns a named property.
     *
     * If the property is not set an invalid value is returned.
     *
     * @param name The name of the property to return
     * @return The property corresponding to the name
     */
    public final java.lang.Object property(String name) {
        return property(QNativePointer.createCharPointer(name));
    }


    @Override
    public AudioCaptureDevice clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native AudioCaptureDevice __qt_clone(long __this_nativeId);
}
