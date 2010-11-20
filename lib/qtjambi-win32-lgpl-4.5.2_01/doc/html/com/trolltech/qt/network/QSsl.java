package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSsl namespace declares enums common to all SSL classes in {@link <a href="../qtnetwork.html">QtNetwork</a>}.
*/
@QtJambiGeneratedClass
public interface QSsl
{
/**
Describes the two types of keys {@link com.trolltech.qt.network.QSslKey QSslKey} supports.
*/

    public enum KeyType implements com.trolltech.qt.QtEnumerator {
/**
 A private key.
*/

        PrivateKey(0),
/**
 A public key.
*/

        PublicKey(1);

        KeyType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSsl$KeyType constant with the specified <tt>int</tt>.</brief>
*/

        public static KeyType resolve(int value) {
            return (KeyType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PrivateKey;
            case 1: return PublicKey;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Describes the different key algorithms supported by {@link com.trolltech.qt.network.QSslKey QSslKey}.
*/

    public enum KeyAlgorithm implements com.trolltech.qt.QtEnumerator {
/**
 The RSA algorithm.
*/

        Rsa(0),
/**
 The DSA algorithm.
*/

        Dsa(1);

        KeyAlgorithm(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSsl$KeyAlgorithm constant with the specified <tt>int</tt>.</brief>
*/

        public static KeyAlgorithm resolve(int value) {
            return (KeyAlgorithm) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Rsa;
            case 1: return Dsa;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Describes the protocol of the cipher. Note: most servers using SSL understand both versions (2 and 3), but it is recommended to use the latest version only for security reasons. However, SSL and TLS are not compatible with each other: if you get unexpected handshake failures, verify that you chose the correct setting for your protocol.
*/

    public enum SslProtocol implements com.trolltech.qt.QtEnumerator {
/**
 SSLv3 - the default protocol.
*/

        SslV3(0),
/**
 SSLv2
*/

        SslV2(1),
/**
 TLSv1
*/

        TlsV1(2),
/**
 The socket understands SSLv2, SSLv3, and TLSv1. This value is used by {@link com.trolltech.qt.network.QSslSocket QSslSocket} only.
*/

        AnyProtocol(3),
/**
 The cipher's protocol cannot be determined.
*/

        UnknownProtocol(-1);

        SslProtocol(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSsl$SslProtocol constant with the specified <tt>int</tt>.</brief>
*/

        public static SslProtocol resolve(int value) {
            return (SslProtocol) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SslV3;
            case 1: return SslV2;
            case 2: return TlsV1;
            case 3: return AnyProtocol;
            case -1: return UnknownProtocol;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Describes the key types for alternate name entries in {@link com.trolltech.qt.network.QSslCertificate QSslCertificate}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate#alternateSubjectNames() QSslCertificate::alternateSubjectNames()}. <br></DD></DT>
*/

    public enum AlternateNameEntryType implements com.trolltech.qt.QtEnumerator {
/**
 An email entry; the entry contains an email address that the certificate is valid for.
*/

        EmailEntry(0),
/**
 A DNS host name entry; the entry contains a host name entry that the certificate is valid for. The entry may contain wildcards.
*/

        DnsEntry(1);

        AlternateNameEntryType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSsl$AlternateNameEntryType constant with the specified <tt>int</tt>.</brief>
*/

        public static AlternateNameEntryType resolve(int value) {
            return (AlternateNameEntryType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return EmailEntry;
            case 1: return DnsEntry;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Describes supported encoding formats for certificates and keys.
*/

    public enum EncodingFormat implements com.trolltech.qt.QtEnumerator {
/**
 The PEM format.
*/

        Pem(0),
/**
 The DER format.
*/

        Der(1);

        EncodingFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSsl$EncodingFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static EncodingFormat resolve(int value) {
            return (EncodingFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Pem;
            case 1: return Der;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
}
