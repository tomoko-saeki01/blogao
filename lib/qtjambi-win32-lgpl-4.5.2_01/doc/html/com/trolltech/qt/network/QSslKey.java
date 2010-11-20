package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslKey class provides an interface for private and public keys. QSslKey provides a simple API for managing keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, {@link com.trolltech.qt.network.QSslCertificate QSslCertificate}, and {@link com.trolltech.qt.network.QSslCipher QSslCipher}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslKey extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslKey#isNull() isNull()}. <br></DD></DT>
*/

    public QSslKey(){
        super((QPrivateConstructor)null);
        __qt_QSslKey();
    }

    native void __qt_QSslKey();


/**
Constructs a QSslKey by reading and decoding data from a <tt>device</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>device</tt> provided a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.network.QSsl.KeyType type) {
        this(device, algorithm, format, type, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Constructs a QSslKey by reading and decoding data from a <tt>device</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>device</tt> provided a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        this(device, algorithm, format, com.trolltech.qt.network.QSsl.KeyType.PrivateKey, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Constructs a QSslKey by reading and decoding data from a <tt>device</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>device</tt> provided a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm) {
        this(device, algorithm, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, com.trolltech.qt.network.QSsl.KeyType.PrivateKey, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs a QSslKey by reading and decoding data from a <tt>device</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>device</tt> provided a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.network.QSsl.KeyType type, com.trolltech.qt.core.QByteArray passPhrase){
        super((QPrivateConstructor)null);
        __qt_QSslKey_QIODevice_KeyAlgorithm_EncodingFormat_KeyType_QByteArray(device == null ? 0 : device.nativeId(), algorithm.value(), format.value(), type.value(), passPhrase == null ? 0 : passPhrase.nativeId());
    }

    native void __qt_QSslKey_QIODevice_KeyAlgorithm_EncodingFormat_KeyType_QByteArray(long device, int algorithm, int format, int type, long passPhrase);


/**
Constructs a QSslKey by decoding the string in the byte array <tt>encoded</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>encoded</tt> contained a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QByteArray encoded, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.network.QSsl.KeyType type) {
        this(encoded, algorithm, format, type, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Constructs a QSslKey by decoding the string in the byte array <tt>encoded</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>encoded</tt> contained a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QByteArray encoded, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        this(encoded, algorithm, format, com.trolltech.qt.network.QSsl.KeyType.PrivateKey, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Constructs a QSslKey by decoding the string in the byte array <tt>encoded</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>encoded</tt> contained a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QByteArray encoded, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm) {
        this(encoded, algorithm, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, com.trolltech.qt.network.QSsl.KeyType.PrivateKey, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs a QSslKey by decoding the string in the byte array <tt>encoded</tt> using a specified <tt>algorithm</tt> and <tt>encoding</tt> format. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <tt>type</tt> specifies whether the key is public or private. <p>After construction, use {@link com.trolltech.qt.network.QSslKey#isNull() isNull()} to check if <tt>encoded</tt> contained a valid key.
*/

    public QSslKey(com.trolltech.qt.core.QByteArray encoded, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.network.QSsl.KeyType type, com.trolltech.qt.core.QByteArray passPhrase){
        super((QPrivateConstructor)null);
        __qt_QSslKey_QByteArray_KeyAlgorithm_EncodingFormat_KeyType_QByteArray(encoded == null ? 0 : encoded.nativeId(), algorithm.value(), format.value(), type.value(), passPhrase == null ? 0 : passPhrase.nativeId());
    }

    native void __qt_QSslKey_QByteArray_KeyAlgorithm_EncodingFormat_KeyType_QByteArray(long encoded, int algorithm, int format, int type, long passPhrase);

/**
Constructs an identical copy of <tt>other</tt>.
*/

    public QSslKey(com.trolltech.qt.network.QSslKey other){
        super((QPrivateConstructor)null);
        __qt_QSslKey_QSslKey(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSslKey_QSslKey(long other);

/**
Returns the key algorithm.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSsl.KeyAlgorithm.resolve(__qt_algorithm(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_algorithm(long __this__nativeId);

/**
Clears the contents of this key, making it a null key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslKey#isNull() isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns a pointer to the native key handle, if it is available; otherwise a null pointer is returned. <p>You can use this handle together with the native API to access extended information about the key. <p><b>Warning:</b> Use of this function has a high probability of being non-portable, and its return value may vary across platforms, and between minor Qt releases.
*/

    @QtBlockedSlot
    public final long handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native long __qt_handle(long __this__nativeId);

/**
Returns true if this is a null key; otherwise false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslKey#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns the length of the key in bits, or -1 if the key is null.
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QSslKey key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSslKey(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSslKey(long __this__nativeId, long key);


/**
Returns the key in DER encoding. The result is encrypted with <tt>passPhrase</tt> if the key is a private key and <tt>passPhrase</tt> is non-empty.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toDer() {
        return toDer((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Returns the key in DER encoding. The result is encrypted with <tt>passPhrase</tt> if the key is a private key and <tt>passPhrase</tt> is non-empty.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toDer(com.trolltech.qt.core.QByteArray passPhrase)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDer_QByteArray(nativeId(), passPhrase == null ? 0 : passPhrase.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toDer_QByteArray(long __this__nativeId, long passPhrase);


/**
Returns the key in PEM encoding. The result is encrypted with <tt>passPhrase</tt> if the key is a private key and <tt>passPhrase</tt> is non-empty.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPem() {
        return toPem((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Returns the key in PEM encoding. The result is encrypted with <tt>passPhrase</tt> if the key is a private key and <tt>passPhrase</tt> is non-empty.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPem(com.trolltech.qt.core.QByteArray passPhrase)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPem_QByteArray(nativeId(), passPhrase == null ? 0 : passPhrase.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toPem_QByteArray(long __this__nativeId, long passPhrase);

/**
Returns the type of the key (i.e., PublicKey or PrivateKey).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSsl.KeyType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSsl.KeyType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QSslKey fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslKey(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSslKey array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QSslKey)
        return operator_equal((com.trolltech.qt.network.QSslKey) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSslKey</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSslKey clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSslKey __qt_clone(long __this_nativeId);
}
