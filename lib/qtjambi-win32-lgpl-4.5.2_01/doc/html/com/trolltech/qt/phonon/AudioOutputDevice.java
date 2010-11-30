package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class AudioOutputDevice extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public AudioOutputDevice(){
        super((QPrivateConstructor)null);
        __qt_AudioOutputDevice();
    }

    native void __qt_AudioOutputDevice();

/**

*/

    public AudioOutputDevice(int index, java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> properties){
        super((QPrivateConstructor)null);
        __qt_AudioOutputDevice_int_HashMap(index, properties);
    }

    native void __qt_AudioOutputDevice_int_HashMap(int index, java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> properties);

/**
Returns a more extensive description than the name() function. <p>For example, in the case of s, this text should make clear which sound source is described; this is sometimes hard to describe or understand from just the name. <p>The text is appropriate to present to an end user in for example tool tips of items, with the name()'s as text, in a {@link com.trolltech.qt.gui.QComboBox QComboBox}.
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
Returns a unique identifier for this ObjectDescription. Used internally to distinguish between the descriptions. <p>Notice that the identifiers are only unique to the type of description, e.g.,  or .
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
Returns true if the device or effect described exists. <p>An ObjectDescription that is invalid, will also have an index() of -1. <p><DT><b>See also:</b><br><DD>index(). <br></DD></DT>
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
Returns a string appropriate for a user to select between object descriptions, e. ., from a {@link com.trolltech.qt.gui.QComboBox QComboBox}. <p><DT><b>See also:</b><br><DD>description(). <br></DD></DT>
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
    private final boolean operator_equal(com.trolltech.qt.phonon.AudioOutputDevice otherDescription)    {
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
Returns the names of the properties of this AudioOutputDevice.
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

    public static native AudioOutputDevice fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AudioOutputDevice(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(AudioOutputDevice array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.phonon.AudioOutputDevice)
        return operator_equal((com.trolltech.qt.phonon.AudioOutputDevice) other);
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
    public AudioOutputDevice clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native AudioOutputDevice __qt_clone(long __this_nativeId);
}
