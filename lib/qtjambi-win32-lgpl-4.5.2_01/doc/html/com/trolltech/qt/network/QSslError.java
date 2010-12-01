package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslError class provides an SSL error. QSslError provides a simple API for managing errors during {@link com.trolltech.qt.network.QSslSocket QSslSocket}'s SSL handshake. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, {@link com.trolltech.qt.network.QSslCertificate QSslCertificate}, and {@link com.trolltech.qt.network.QSslCipher QSslCipher}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslError extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
Describes all recognized errors that can occur during an SSL handshake. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslError#errorString() QSslError::errorString()}. <br></DD></DT>
*/

    public enum SslError implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoError(0),
/**

*/

        UnableToGetIssuerCertificate(1),
/**

*/

        UnableToDecryptCertificateSignature(2),
/**

*/

        UnableToDecodeIssuerPublicKey(3),
/**

*/

        CertificateSignatureFailed(4),
/**

*/

        CertificateNotYetValid(5),
/**

*/

        CertificateExpired(6),
/**

*/

        InvalidNotBeforeField(7),
/**

*/

        InvalidNotAfterField(8),
/**

*/

        SelfSignedCertificate(9),
/**

*/

        SelfSignedCertificateInChain(10),
/**

*/

        UnableToGetLocalIssuerCertificate(11),
/**

*/

        UnableToVerifyFirstCertificate(12),
/**

*/

        CertificateRevoked(13),
/**

*/

        InvalidCaCertificate(14),
/**

*/

        PathLengthExceeded(15),
/**

*/

        InvalidPurpose(16),
/**

*/

        CertificateUntrusted(17),
/**

*/

        CertificateRejected(18),
/**

*/

        SubjectIssuerMismatch(19),
/**

*/

        AuthorityIssuerSerialNumberMismatch(20),
/**

*/

        NoPeerCertificate(21),
/**

*/

        HostNameMismatch(22),
/**

*/

        NoSslSupport(23),
/**

*/

        UnspecifiedError(-1);

        SslError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSslError$SslError constant with the specified <tt>int</tt>.</brief>
*/

        public static SslError resolve(int value) {
            return (SslError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return UnableToGetIssuerCertificate;
            case 2: return UnableToDecryptCertificateSignature;
            case 3: return UnableToDecodeIssuerPublicKey;
            case 4: return CertificateSignatureFailed;
            case 5: return CertificateNotYetValid;
            case 6: return CertificateExpired;
            case 7: return InvalidNotBeforeField;
            case 8: return InvalidNotAfterField;
            case 9: return SelfSignedCertificate;
            case 10: return SelfSignedCertificateInChain;
            case 11: return UnableToGetLocalIssuerCertificate;
            case 12: return UnableToVerifyFirstCertificate;
            case 13: return CertificateRevoked;
            case 14: return InvalidCaCertificate;
            case 15: return PathLengthExceeded;
            case 16: return InvalidPurpose;
            case 17: return CertificateUntrusted;
            case 18: return CertificateRejected;
            case 19: return SubjectIssuerMismatch;
            case 20: return AuthorityIssuerSerialNumberMismatch;
            case 21: return NoPeerCertificate;
            case 22: return HostNameMismatch;
            case 23: return NoSslSupport;
            case -1: return UnspecifiedError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QSslError object. The two optional arguments specify the <tt>error</tt> that occurred, and which <tt>certificate</tt> the error relates to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate QSslCertificate}. <br></DD></DT>
*/

    public QSslError(com.trolltech.qt.network.QSslError.SslError error) {
        this(error, (com.trolltech.qt.network.QSslCertificate)new com.trolltech.qt.network.QSslCertificate());
    }

/**
Constructs a QSslError object. The two optional arguments specify the <tt>error</tt> that occurred, and which <tt>certificate</tt> the error relates to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate QSslCertificate}. <br></DD></DT>
*/

    public QSslError() {
        this(com.trolltech.qt.network.QSslError.SslError.NoError, (com.trolltech.qt.network.QSslCertificate)new com.trolltech.qt.network.QSslCertificate());
    }
/**
Constructs a QSslError object. The two optional arguments specify the <tt>error</tt> that occurred, and which <tt>certificate</tt> the error relates to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate QSslCertificate}. <br></DD></DT>
*/

    public QSslError(com.trolltech.qt.network.QSslError.SslError error, com.trolltech.qt.network.QSslCertificate certificate){
        super((QPrivateConstructor)null);
        __qt_QSslError_SslError_QSslCertificate(error.value(), certificate == null ? 0 : certificate.nativeId());
    }

    native void __qt_QSslError_SslError_QSslCertificate(int error, long certificate);

/**
Constructs an identical copy of <tt>other</tt>.
*/

    public QSslError(com.trolltech.qt.network.QSslError other){
        super((QPrivateConstructor)null);
        __qt_QSslError_QSslError(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSslError_QSslError(long other);

/**
Returns the certificate associated with this error, or a null certificate if the error does not relate to any certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslError#error() error()}, and {@link com.trolltech.qt.network.QSslError#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCertificate certificate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_certificate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCertificate __qt_certificate(long __this__nativeId);

/**
Returns the type of the error. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslError#errorString() errorString()}, and {@link com.trolltech.qt.network.QSslError#certificate() certificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslError.SslError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSslError.SslError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a short localized human-readable description of the error. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslError#error() error()}, and {@link com.trolltech.qt.network.QSslError#certificate() certificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QSslError other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSslError(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSslError(long __this__nativeId, long other);

/**
@exclude
*/

    public static native QSslError fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslError(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSslError array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QSslError)
        return operator_equal((com.trolltech.qt.network.QSslError) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSslError</tt>. </brief>
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
    public QSslError clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSslError __qt_clone(long __this_nativeId);
}
