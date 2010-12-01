package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QCryptographicHash class provides a way to generate cryptographic hashes. QCryptographicHash can be used to generate cryptographic hashes of binary or text data. <p>Currently MD4, MD5, and SHA1 are supported.
*/
@QtJambiGeneratedClass
public class QCryptographicHash extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
    public enum Algorithm implements com.trolltech.qt.QtEnumerator {
/**
 Generate an MD4 hash sum
*/

        Md4(0),
/**
 Generate an MD5 hash sum
*/

        Md5(1),
/**
 Generate an SHA1 hash sum
*/

        Sha1(2);

        Algorithm(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCryptographicHash$Algorithm constant with the specified <tt>int</tt>.</brief>
*/

        public static Algorithm resolve(int value) {
            return (Algorithm) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Md4;
            case 1: return Md5;
            case 2: return Sha1;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an object that can be used to create a cryptographic hash from data using <tt>method</tt>.
*/

    public QCryptographicHash(com.trolltech.qt.core.QCryptographicHash.Algorithm method){
        super((QPrivateConstructor)null);
        __qt_QCryptographicHash_Algorithm(method.value());
    }

    native void __qt_QCryptographicHash_Algorithm(int method);

/**
/overload
*/

    @QtBlockedSlot
    public final void addData(com.trolltech.qt.core.QByteArray data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addData_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addData_QByteArray(long __this__nativeId, long data);

    @QtBlockedSlot
    private final void addData(com.trolltech.qt.QNativePointer data, int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addData_nativepointer_int(nativeId(), data, length);
    }
    @QtBlockedSlot
    native void __qt_addData_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer data, int length);

/**
Resets the object.
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
Returns the final hash value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toHex() QByteArray::toHex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray result()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_result(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_result(long __this__nativeId);

/**
Returns the hash of <tt>data</tt> using <tt>method</tt>.
*/

    public static com.trolltech.qt.core.QByteArray hash(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.core.QCryptographicHash.Algorithm method)    {
        return __qt_hash_QByteArray_Algorithm(data == null ? 0 : data.nativeId(), method.value());
    }
    native static com.trolltech.qt.core.QByteArray __qt_hash_QByteArray_Algorithm(long data, int method);

/**
@exclude
*/

    public static native QCryptographicHash fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCryptographicHash(QPrivateConstructor p) { super(p); } 

/**
Adds <tt>data</tt> to the cryptographic hash.
*/

    public final void addData(byte data[]) {
        QNativePointer np = com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data);
        addData(np, data.length);
    }

}
