package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslCipher class represents an SSL cryptographic cipher. QSslCipher stores information about one cryptographic cipher. It is most commonly used with {@link com.trolltech.qt.network.QSslSocket QSslSocket}, either for configuring which ciphers the socket can use, or for displaying the socket's ciphers to the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, and {@link com.trolltech.qt.network.QSslKey QSslKey}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslCipher extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QSslCipher object.
*/

    public QSslCipher(){
        super((QPrivateConstructor)null);
        __qt_QSslCipher();
    }

    native void __qt_QSslCipher();

/**
Constructs an identical copy of the <tt>other</tt> cipher.
*/

    public QSslCipher(com.trolltech.qt.network.QSslCipher other){
        super((QPrivateConstructor)null);
        __qt_QSslCipher_QSslCipher(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSslCipher_QSslCipher(long other);

/**
Constructs a QSslCipher object for the cipher determined by <tt>name</tt> and <tt>protocol</tt>. The constructor accepts only supported ciphers (i.e., the <tt>name</tt> and <tt>protocol</tt> must identify a cipher in the list of ciphers returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}). <p>You can call {@link com.trolltech.qt.network.QSslCipher#isNull() isNull()} after construction to check if <tt>name</tt> and <tt>protocol</tt> correctly identified a supported cipher.
*/

    public QSslCipher(java.lang.String name, com.trolltech.qt.network.QSsl.SslProtocol protocol){
        super((QPrivateConstructor)null);
        __qt_QSslCipher_String_SslProtocol(name, protocol.value());
    }

    native void __qt_QSslCipher_String_SslProtocol(java.lang.String name, int protocol);

/**
Returns the cipher's authentication method as a QString.
*/

    @QtBlockedSlot
    public final java.lang.String authenticationMethod()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_authenticationMethod(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_authenticationMethod(long __this__nativeId);

/**
Returns the cipher's encryption method as a QString.
*/

    @QtBlockedSlot
    public final java.lang.String encryptionMethod()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encryptionMethod(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_encryptionMethod(long __this__nativeId);

/**
Returns true if this is a null cipher; otherwise returns false.
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
Returns the cipher's key exchange method as a QString.
*/

    @QtBlockedSlot
    public final java.lang.String keyExchangeMethod()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keyExchangeMethod(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_keyExchangeMethod(long __this__nativeId);

/**
Returns the name of the cipher, or an empty QString if this is a null cipher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCipher#isNull() isNull()}. <br></DD></DT>
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
    private final boolean operator_equal(com.trolltech.qt.network.QSslCipher other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSslCipher(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSslCipher(long __this__nativeId, long other);

/**
Returns the cipher's protocol type, or {@link com.trolltech.qt.network.QSsl.SslProtocol QSsl::UnknownProtocol } if QSslCipher is unable to determine the protocol ({@link com.trolltech.qt.network.QSslCipher#protocolString() protocolString()} may contain more information). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCipher#protocolString() protocolString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSsl.SslProtocol protocol()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSsl.SslProtocol.resolve(__qt_protocol(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_protocol(long __this__nativeId);

/**
Returns the cipher's protocol as a QString. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCipher#protocol() protocol()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String protocolString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_protocolString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_protocolString(long __this__nativeId);

/**
Returns the number of bits supported by the cipher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCipher#usedBits() usedBits()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int supportedBits()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportedBits(nativeId());
    }
    @QtBlockedSlot
    native int __qt_supportedBits(long __this__nativeId);

/**
Returns the number of bits used by the cipher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCipher#supportedBits() supportedBits()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int usedBits()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_usedBits(nativeId());
    }
    @QtBlockedSlot
    native int __qt_usedBits(long __this__nativeId);

/**
@exclude
*/

    public static native QSslCipher fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslCipher(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSslCipher array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QSslCipher)
        return operator_equal((com.trolltech.qt.network.QSslCipher) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSslCipher</tt>. </brief>
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
    public QSslCipher clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSslCipher __qt_clone(long __this_nativeId);
}
