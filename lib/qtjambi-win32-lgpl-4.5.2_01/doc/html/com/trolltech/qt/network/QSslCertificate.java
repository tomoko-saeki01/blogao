package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslCertificate class provides a convenient API for an X509 certificate. QSslCertificate stores an X509 certificate, and is commonly used to verify the identity and store information about the local host, a remotely connected peer, or a trusted third party Certificate Authority. <p>There are many ways to construct a QSslCertificate. The most common way is to call {@link com.trolltech.qt.network.QSslSocket#peerCertificate() QSslSocket::peerCertificate()}, which returns a QSslCertificate object, or {@link com.trolltech.qt.network.QSslSocket#peerCertificateChain() QSslSocket::peerCertificateChain()}, which returns a list of them. You can also load certificates from a DER (binary) or PEM (Base64) encoded bundle, typically stored as one or more local files, or in a Qt Resource. <p>You can call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to check if your certificate is null. By default, QSslCertificate constructs a null certificate. To check if the certificate is valid, call {@link com.trolltech.qt.network.QSslCertificate#isValid() isValid()}. A null certificate is invalid, but an invalid certificate is not necessarily null. If you want to reset all contents in a certificate, call {@link com.trolltech.qt.network.QSslCertificate#clear() clear()}. <p>After loading a certificate, you can find information about the certificate, its subject, and its issuer, by calling one of the many accessor functions, including {@link com.trolltech.qt.network.QSslCertificate#version() version()}, {@link com.trolltech.qt.network.QSslCertificate#serialNumber() serialNumber()}, {@link com.trolltech.qt.network.QSslCertificate#issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) issuerInfo()} and {@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) subjectInfo()}. You can call notValidBefore() and notValidAfter() to check when the certificate was issued, and when it expires. The {@link com.trolltech.qt.network.QSslCertificate#publicKey() publicKey()} function returns the certificate subject's public key as a {@link com.trolltech.qt.network.QSslKey QSslKey}. You can call {@link com.trolltech.qt.network.QSslCertificate#issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) issuerInfo()} or {@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) subjectInfo()} to get detailed information about the certificate issuer and its subject. <p>Internally, QSslCertificate is stored as an X509 structure. You can access this handle by calling {@link com.trolltech.qt.network.QSslCertificate#handle() handle()}, but the results are likely to not be portable. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, {@link com.trolltech.qt.network.QSslKey QSslKey}, {@link com.trolltech.qt.network.QSslCipher QSslCipher}, and {@link com.trolltech.qt.network.QSslError QSslError}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslCertificate extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
Describes keys that you can pass to {@link com.trolltech.qt.network.QSslCertificate#issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) QSslCertificate::issuerInfo()} or {@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) QSslCertificate::subjectInfo()} to get information about the certificate issuer or subject.
*/

    public enum SubjectInfo implements com.trolltech.qt.QtEnumerator {
/**
 "O" The name of the organization.
*/

        Organization(0),
/**
 "CN" The common name; most often this is used to store the host name.
*/

        CommonName(1),
/**
 "L" The locality.
*/

        LocalityName(2),
/**
 "OU" The organizational unit name.
*/

        OrganizationalUnitName(3),
/**
 "C" The country.
*/

        CountryName(4),
/**
 "ST" The state or province.
*/

        StateOrProvinceName(5);

        SubjectInfo(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSslCertificate$SubjectInfo constant with the specified <tt>int</tt>.</brief>
*/

        public static SubjectInfo resolve(int value) {
            return (SubjectInfo) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Organization;
            case 1: return CommonName;
            case 2: return LocalityName;
            case 3: return OrganizationalUnitName;
            case 4: return CountryName;
            case 5: return StateOrProvinceName;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QSslCertificate by reading <tt>format</tt> encoded data from <tt>device</tt> and using the first certificate found. You can later call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to see if <tt>device</tt> contained a certificate, and if this certificate was loaded successfully.
*/

    public QSslCertificate(com.trolltech.qt.core.QIODevice device) {
        this(device, com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }
/**
Constructs a QSslCertificate by reading <tt>format</tt> encoded data from <tt>device</tt> and using the first certificate found. You can later call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to see if <tt>device</tt> contained a certificate, and if this certificate was loaded successfully.
*/

    public QSslCertificate(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.EncodingFormat format){
        super((QPrivateConstructor)null);
        __qt_QSslCertificate_QIODevice_EncodingFormat(device == null ? 0 : device.nativeId(), format.value());
    }

    native void __qt_QSslCertificate_QIODevice_EncodingFormat(long device, int format);


/**
Constructs a QSslCertificate by parsing the <tt>format</tt> encoded <tt>data</tt> and using the first available certificate found. You can later call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to see if <tt>data</tt> contained a certificate, and if this certificate was loaded successfully.
*/

    public QSslCertificate(com.trolltech.qt.core.QByteArray encoded) {
        this(encoded, com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }

/**
Constructs a QSslCertificate by parsing the <tt>format</tt> encoded <tt>data</tt> and using the first available certificate found. You can later call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to see if <tt>data</tt> contained a certificate, and if this certificate was loaded successfully.
*/

    public QSslCertificate() {
        this((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }
/**
Constructs a QSslCertificate by parsing the <tt>format</tt> encoded <tt>data</tt> and using the first available certificate found. You can later call {@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()} to see if <tt>data</tt> contained a certificate, and if this certificate was loaded successfully.
*/

    public QSslCertificate(com.trolltech.qt.core.QByteArray encoded, com.trolltech.qt.network.QSsl.EncodingFormat format){
        super((QPrivateConstructor)null);
        __qt_QSslCertificate_QByteArray_EncodingFormat(encoded == null ? 0 : encoded.nativeId(), format.value());
    }

    native void __qt_QSslCertificate_QByteArray_EncodingFormat(long encoded, int format);

/**
Constructs an identical copy of <tt>other</tt>.
*/

    public QSslCertificate(com.trolltech.qt.network.QSslCertificate other){
        super((QPrivateConstructor)null);
        __qt_QSslCertificate_QSslCertificate(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSslCertificate_QSslCertificate(long other);

/**
Returns the list of alternative subject names for this certificate. The alternate subject names typically contain host names, optionally with wildcards, that are valid for this certificate. <p>These names are tested against the connected peer's host name, if either the subject information for {@link com.trolltech.qt.network.QSslCertificate.SubjectInfo CommonName } doesn't define a valid host name, or the subject info name doesn't match the peer's host name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) subjectInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.SortedMap<com.trolltech.qt.network.QSsl.AlternateNameEntryType, java.util.List<java.lang.String>> alternateSubjectNames()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alternateSubjectNames(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<com.trolltech.qt.network.QSsl.AlternateNameEntryType, java.util.List<java.lang.String>> __qt_alternateSubjectNames(long __this__nativeId);

/**
Clears the contents of this certificate, making it a null certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()}. <br></DD></DT>
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
Returns a cryptographic digest of this certificate. By default, and MD5 digest will be generated, but you can also specify a custom <tt>algorithm</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray digest() {
        return digest(com.trolltech.qt.core.QCryptographicHash.Algorithm.Md5);
    }
/**
Returns a cryptographic digest of this certificate. By default, and MD5 digest will be generated, but you can also specify a custom <tt>algorithm</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray digest(com.trolltech.qt.core.QCryptographicHash.Algorithm algorithm)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_digest_Algorithm(nativeId(), algorithm.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_digest_Algorithm(long __this__nativeId, int algorithm);

/**
Returns the date-time that the certificate becomes valid, or an empty {@link com.trolltech.qt.core.QDateTime QDateTime} if this is a null certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#expiryDate() expiryDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime effectiveDate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effectiveDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_effectiveDate(long __this__nativeId);

/**
Returns the date-time that the certificate expires, or an empty {@link com.trolltech.qt.core.QDateTime QDateTime} if this is a null certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#effectiveDate() effectiveDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime expiryDate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expiryDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_expiryDate(long __this__nativeId);

/**
Returns a pointer to the native certificate handle, if there is one, or a null pointer otherwise. <p>You can use this handle, together with the native API, to access extended information about the certificate. <p><b>Warning:</b> Use of this function has a high probability of being non-portable, and its return value may vary from platform to platform or change from minor release to minor release.
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
Returns true if this is a null certificate (i. ., a certificate with no contents); otherwise returns false. <p>By default, QSslCertificate constructs a null certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#isValid() isValid()}, and {@link com.trolltech.qt.network.QSslCertificate#clear() clear()}. <br></DD></DT>
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
Returns true if this certificate is valid; otherwise returns false. <p>Note: Currently, this function only checks that the current data-time is within the date-time range during which the certificate is considered valid. No other checks are currently performed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#isNull() isNull()}. <br></DD></DT>
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
Returns the issuer information for the <tt>subject</tt> from the certificate, or an empty string if there is no information for <tt>subject</tt> in the certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) subjectInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo info)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_issuerInfo_SubjectInfo(nativeId(), info.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_issuerInfo_SubjectInfo(long __this__nativeId, int info);

/**
Returns the issuer information for <tt>tag</tt> from the certificate, or an empty string if there is no information for <tt>tag</tt> in the certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) subjectInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String issuerInfo(com.trolltech.qt.core.QByteArray tag)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_issuerInfo_QByteArray(nativeId(), tag == null ? 0 : tag.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_issuerInfo_QByteArray(long __this__nativeId, long tag);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QSslCertificate other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSslCertificate(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSslCertificate(long __this__nativeId, long other);

/**
Returns the certificate subject's public key.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslKey publicKey()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_publicKey(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslKey __qt_publicKey(long __this__nativeId);

/**
Returns the certificate's serial number string.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray serialNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_serialNumber(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_serialNumber(long __this__nativeId);

/**
Returns the information for the <tt>subject</tt>, or an empty string if there is no information for <tt>subject</tt> in the certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) issuerInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String subjectInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo info)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subjectInfo_SubjectInfo(nativeId(), info.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_subjectInfo_SubjectInfo(long __this__nativeId, int info);

/**
Returns the subject information for <tt>tag</tt>, or an empty string if there is no information for <tt>tag</tt> in the certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#issuerInfo(com.trolltech.qt.network.QSslCertificate.SubjectInfo) issuerInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String subjectInfo(com.trolltech.qt.core.QByteArray tag)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subjectInfo_QByteArray(nativeId(), tag == null ? 0 : tag.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_subjectInfo_QByteArray(long __this__nativeId, long tag);

/**
Returns this certificate converted to a DER (binary) encoded representation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toDer()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toDer(long __this__nativeId);

/**
Returns this certificate converted to a PEM (Base64) encoded representation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toPem(long __this__nativeId);

/**
Returns the certificate's version string.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray version()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_version(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_version(long __this__nativeId);


/**
Searches for and parses all certificates in <tt>data</tt> that are encoded in the specified <tt>format</tt> and returns them in a list of certificates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromDevice(com.trolltech.qt.core.QIODevice) fromDevice()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromData(com.trolltech.qt.core.QByteArray data) {
        return fromData(data, com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }
/**
Searches for and parses all certificates in <tt>data</tt> that are encoded in the specified <tt>format</tt> and returns them in a list of certificates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromDevice(com.trolltech.qt.core.QIODevice) fromDevice()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromData(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.network.QSsl.EncodingFormat format)    {
        return __qt_fromData_QByteArray_EncodingFormat(data == null ? 0 : data.nativeId(), format.value());
    }
    native static java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_fromData_QByteArray_EncodingFormat(long data, int format);


/**
Searches for and parses all certificates in <tt>device</tt> that are encoded in the specified <tt>format</tt> and returns them in a list of certificates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromData(com.trolltech.qt.core.QByteArray) fromData()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromDevice(com.trolltech.qt.core.QIODevice device) {
        return fromDevice(device, com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }
/**
Searches for and parses all certificates in <tt>device</tt> that are encoded in the specified <tt>format</tt> and returns them in a list of certificates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromData(com.trolltech.qt.core.QByteArray) fromData()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromDevice(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.network.QSsl.EncodingFormat format)    {
        return __qt_fromDevice_QIODevice_EncodingFormat(device == null ? 0 : device.nativeId(), format.value());
    }
    native static java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_fromDevice_QIODevice_EncodingFormat(long device, int format);


/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and returns them in a list. must be a file or a pattern matching one or more files, as specified by <tt>syntax</tt>. <p>Example: <pre class="snippet">
    for (QSslCertificate cert : QSslCertificate.fromPath("C:/ssl/certificate.*.pem",
                                                             QRegExp.Wildcard)) {
        qDebug() &lt;&lt; cert.issuerInfo(QSslCertificate.Organization);
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromData(com.trolltech.qt.core.QByteArray) fromData()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromPath(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        return fromPath(path, format, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }

/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and returns them in a list. must be a file or a pattern matching one or more files, as specified by <tt>syntax</tt>. <p>Example: <pre class="snippet">
    for (QSslCertificate cert : QSslCertificate.fromPath("C:/ssl/certificate.*.pem",
                                                             QRegExp.Wildcard)) {
        qDebug() &lt;&lt; cert.issuerInfo(QSslCertificate.Organization);
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromData(com.trolltech.qt.core.QByteArray) fromData()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromPath(java.lang.String path) {
        return fromPath(path, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }
/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and returns them in a list. must be a file or a pattern matching one or more files, as specified by <tt>syntax</tt>. <p>Example: <pre class="snippet">
    for (QSslCertificate cert : QSslCertificate.fromPath("C:/ssl/certificate.*.pem",
                                                             QRegExp.Wildcard)) {
        qDebug() &lt;&lt; cert.issuerInfo(QSslCertificate.Organization);
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#fromData(com.trolltech.qt.core.QByteArray) fromData()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QSslCertificate> fromPath(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.core.QRegExp.PatternSyntax syntax)    {
        return __qt_fromPath_String_EncodingFormat_PatternSyntax(path, format.value(), syntax.value());
    }
    native static java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_fromPath_String_EncodingFormat_PatternSyntax(java.lang.String path, int format, int syntax);

/**
@exclude
*/

    public static native QSslCertificate fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslCertificate(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSslCertificate array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QSslCertificate)
        return operator_equal((com.trolltech.qt.network.QSslCertificate) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSslCertificate</tt>. </brief>
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
    public QSslCertificate clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSslCertificate __qt_clone(long __this_nativeId);
}
