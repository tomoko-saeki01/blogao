package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class MediaSource extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
    public enum Type implements com.trolltech.qt.QtEnumerator {
        Invalid(-1),
        LocalFile(0),
        Url(1),
        Disc(2),
        Stream(3),
        Empty(4);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the MediaSource$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return Invalid;
            case 0: return LocalFile;
            case 1: return Url;
            case 2: return Disc;
            case 3: return Stream;
            case 4: return Empty;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public MediaSource(){
        super((QPrivateConstructor)null);
        __qt_MediaSource();
    }

    native void __qt_MediaSource();

/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.phonon.AbstractMediaStream stream){
        super((QPrivateConstructor)null);
        __qt_MediaSource_AbstractMediaStream(stream == null ? 0 : stream.nativeId());
    }

    native void __qt_MediaSource_AbstractMediaStream(long stream);


/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.phonon.Phonon.DiscType discType) {
        this(discType, (java.lang.String)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.phonon.Phonon.DiscType discType, java.lang.String deviceName){
        super((QPrivateConstructor)null);
        __qt_MediaSource_DiscType_String(discType.value(), deviceName);
    }

    native void __qt_MediaSource_DiscType_String(int discType, java.lang.String deviceName);

/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.core.QIODevice ioDevice){
        super((QPrivateConstructor)null);
        __qt_MediaSource_QIODevice(ioDevice == null ? 0 : ioDevice.nativeId());
    }

    native void __qt_MediaSource_QIODevice(long ioDevice);

/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.phonon.MediaSource rhs){
        super((QPrivateConstructor)null);
        __qt_MediaSource_MediaSource(rhs == null ? 0 : rhs.nativeId());
    }

    native void __qt_MediaSource_MediaSource(long rhs);

/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(java.lang.String fileName){
        super((QPrivateConstructor)null);
        __qt_MediaSource_String(fileName);
    }

    native void __qt_MediaSource_String(java.lang.String fileName);

/**
This is an overloaded method provided for convenience.
*/

    public MediaSource(com.trolltech.qt.core.QUrl url){
        super((QPrivateConstructor)null);
        __qt_MediaSource_QUrl(url == null ? 0 : url.nativeId());
    }

    native void __qt_MediaSource_QUrl(long url);

/**
Returns the setting of the auto-delete option. The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource#setAutoDelete(boolean) setAutoDelete()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoDelete()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoDelete(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoDelete(long __this__nativeId);

/**
Returns the device name of the MediaSource if {@link com.trolltech.qt.phonon.MediaSource#type() type()} == Disc; otherwise returns QString(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String deviceName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_deviceName(long __this__nativeId);

/**
Returns the disc type of the MediaSource if {@link com.trolltech.qt.phonon.MediaSource#type() type()} == Disc; otherwise returns {@link com.trolltech.qt.phonon.Phonon.DiscType NoDisc }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Phonon.DiscType discType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.Phonon.DiscType.resolve(__qt_discType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_discType(long __this__nativeId);

/**
Returns the file name of the MediaSource if {@link com.trolltech.qt.phonon.MediaSource#type() type()} == {@link com.trolltech.qt.phonon.MediaSource.Type LocalFile }; otherwise, returns QString(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.phonon.MediaSource rhs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_MediaSource(nativeId(), rhs == null ? 0 : rhs.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_MediaSource(long __this__nativeId, long rhs);

/**

*/

    @QtBlockedSlot
    public final void setAutoDelete(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoDelete_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAutoDelete_boolean(long __this__nativeId, boolean enable);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.AbstractMediaStream stream()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stream(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AbstractMediaStream __qt_stream(long __this__nativeId);

/**
Returns the type of the MediaSource (depends on the constructor that was used). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource.Type Type }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaSource.Type type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.MediaSource.Type.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the URL of the MediaSource if {@link com.trolltech.qt.phonon.MediaSource#type() type()} == URL or {@link com.trolltech.qt.phonon.MediaSource#type() type()} == {@link com.trolltech.qt.phonon.MediaSource.Type LocalFile }; otherwise returns {@link <a href="../porting4.html">QUrl()</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaSource#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl url()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_url(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_url(long __this__nativeId);

/**
@exclude
*/

    public static native MediaSource fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected MediaSource(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(MediaSource array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.phonon.MediaSource)
        return operator_equal((com.trolltech.qt.phonon.MediaSource) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public MediaSource clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native MediaSource __qt_clone(long __this_nativeId);
}
