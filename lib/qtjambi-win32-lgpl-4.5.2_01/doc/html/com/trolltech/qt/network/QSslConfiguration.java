package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslConfiguration class holds the configuration and state of an SSL connection QSslConfiguration is used by Qt networking classes to relay information about an open SSL connection and to allow the application to control certain features of that connection. <p>The settings that QSslConfiguration currently supports are: <ul><li> The SSL/TLS protocol to be used</li><li> The certificate to be presented to the peer during connection and its associated private key</li><li> The ciphers allowed to be used for encrypting the connection</li><li> The list of Certificate Authorities certificates that are used to validate the peer's certificate</li></ul> These settings are applied only during the connection handshake. Setting them after the connection has been established has no effect. <p>The state that QSslConfiguration supports are: <ul><li> The certificate the peer presented during handshake, along with the chain leading to a CA certificate</li><li> The cipher used to encrypt this session</li></ul> The state can only be obtained once the SSL connection starts, but not necessarily before it's done. Some settings may change during the course of the SSL connection without need to restart it (for instance, the cipher can be changed over time). <p>State in QSslConfiguration objects cannot be changed. <p>QSslConfiguration can be used with {@link com.trolltech.qt.network.QSslSocket QSslSocket} and the Network Access API. <p>Note that changing settings in QSslConfiguration is not enough to change the settings in the related SSL connection. You must call setSslConfiguration on a modified QSslConfiguration object to achieve that. The following example illustrates how to change the protocol to TLSv1 in a {@link com.trolltech.qt.network.QSslSocket QSslSocket} object: <pre class="snippet">
        QSslConfiguration config = sslSocket.sslConfiguration();
        config.setProtocol(QSsl.TlsV1);
        sslSocket.setSslConfiguration(config);
</pre> {@link com.trolltech.qt.network.QSslSocket QSslSocket}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}, {@link com.trolltech.qt.network.QSslSocket#sslConfiguration() QSslSocket::sslConfiguration()}, {@link com.trolltech.qt.network.QSslSocket#setSslConfiguration(com.trolltech.qt.network.QSslConfiguration) QSslSocket::setSslConfiguration()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSsl.SslProtocol QSsl::SslProtocol }, {@link com.trolltech.qt.network.QSslCertificate QSslCertificate}, {@link com.trolltech.qt.network.QSslCipher QSslCipher}, and {@link com.trolltech.qt.network.QSslKey QSslKey}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslConfiguration extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty SSL configuration. This configuration contains no valid settings and the state will be empty. {@link com.trolltech.qt.network.QSslConfiguration#isNull() isNull()} will return true after this constructor is called. <p>Once any setter methods are called, {@link com.trolltech.qt.network.QSslConfiguration#isNull() isNull()} will return false.
*/

    public QSslConfiguration(){
        super((QPrivateConstructor)null);
        __qt_QSslConfiguration();
    }

    native void __qt_QSslConfiguration();

/**
Copies the configuration and state of <tt>other</tt>. If <tt>other</tt> is null, this object will be null too.
*/

    public QSslConfiguration(com.trolltech.qt.network.QSslConfiguration other){
        super((QPrivateConstructor)null);
        __qt_QSslConfiguration_QSslConfiguration(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSslConfiguration_QSslConfiguration(long other);

/**
Returns this connection's CA certificate database. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. It can be moodified prior to the handshake with addCaCertificate(), addCaCertificates(), and {@link com.trolltech.qt.network.QSslConfiguration#setCaCertificates(java.util.List) setCaCertificates()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setCaCertificates(java.util.List) setCaCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCertificate> caCertificates()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_caCertificates(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_caCertificates(long __this__nativeId);

/**
Returns this connection's current cryptographic cipher suite. This list is used during the handshake phase for choosing a session cipher. The returned list of ciphers is ordered by descending preference. (i.e., the first cipher in the list is the most preferred cipher). The session cipher will be the first one in the list that is also supported by the peer. <p>By default, the handshake phase can choose any of the ciphers supported by this system's SSL libraries, which may vary from system to system. The list of ciphers supported by this system's SSL libraries is returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}. You can restrict the list of ciphers used for choosing the session cipher for this socket by calling {@link com.trolltech.qt.network.QSslConfiguration#setCiphers(java.util.List) setCiphers()} with a subset of the supported ciphers. You can revert to using the entire set by calling {@link com.trolltech.qt.network.QSslConfiguration#setCiphers(java.util.List) setCiphers()} with the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setCiphers(java.util.List) setCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCipher> ciphers()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ciphers(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCipher> __qt_ciphers(long __this__nativeId);

/**
Returns true if this is a null QSslConfiguration object. <p>A QSslConfiguration object is null if it has been default-constructed and no setter methods have been called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setProtocol(com.trolltech.qt.network.QSsl.SslProtocol) setProtocol()}, {@link com.trolltech.qt.network.QSslConfiguration#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}, {@link com.trolltech.qt.network.QSslConfiguration#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}, {@link com.trolltech.qt.network.QSslConfiguration#setCiphers(java.util.List) setCiphers()}, and {@link com.trolltech.qt.network.QSslConfiguration#setCaCertificates(java.util.List) setCaCertificates()}. <br></DD></DT>
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
Returns the certificate to be presented to the peer during the SSL handshake process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCertificate localCertificate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localCertificate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCertificate __qt_localCertificate(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QSslConfiguration other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSslConfiguration(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSslConfiguration(long __this__nativeId, long other);

/**
Returns the peer's digital certificate (i. ., the immediate certificate of the host you are connected to), or a null certificate, if the peer has not assigned a certificate. <p>The peer certificate is checked automatically during the handshake phase, so this function is normally used to fetch the certificate for display or for connection diagnostic purposes. It contains information about the peer, including its host name, the certificate issuer, and the peer's public key. <p>Because the peer certificate is set during the handshake phase, it is safe to access the peer certificate from a slot connected to the {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()} signal, {@link com.trolltech.qt.network.QNetworkReply#sslErrors QNetworkReply::sslErrors() } signal, or the {@link com.trolltech.qt.network.QSslSocket#encrypted QSslSocket::encrypted() } signal. <p>If a null certificate is returned, it can mean the SSL handshake failed, or it can mean the host you are connected to doesn't have a certificate, or it can mean there is no connection. <p>If you want to check the peer's complete chain of certificates, use {@link com.trolltech.qt.network.QSslConfiguration#peerCertificateChain() peerCertificateChain()} to get them all at once. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#peerCertificateChain() peerCertificateChain()}, {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}, {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() QSslSocket::ignoreSslErrors()}, {@link com.trolltech.qt.network.QNetworkReply#sslErrors QNetworkReply::sslErrors() }, and {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() QNetworkReply::ignoreSslErrors()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCertificate peerCertificate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerCertificate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCertificate __qt_peerCertificate(long __this__nativeId);

/**
Returns the peer's chain of digital certificates, starting with the peer's immediate certificate and ending with the CA's certificate. <p>Peer certificates are checked automatically during the handshake phase. This function is normally used to fetch certificates for display, or for performing connection diagnostics. Certificates contain information about the peer and the certificate issuers, including host name, issuer names, and issuer public keys. <p>Because the peer certificate is set during the handshake phase, it is safe to access the peer certificate from a slot connected to the {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()} signal, {@link com.trolltech.qt.network.QNetworkReply#sslErrors QNetworkReply::sslErrors() } signal, or the {@link com.trolltech.qt.network.QSslSocket#encrypted QSslSocket::encrypted() } signal. <p>If an empty list is returned, it can mean the SSL handshake failed, or it can mean the host you are connected to doesn't have a certificate, or it can mean there is no connection. <p>If you want to get only the peer's immediate certificate, use {@link com.trolltech.qt.network.QSslConfiguration#peerCertificate() peerCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#peerCertificate() peerCertificate()}, {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}, {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() QSslSocket::ignoreSslErrors()}, {@link com.trolltech.qt.network.QNetworkReply#sslErrors QNetworkReply::sslErrors() }, and {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() QNetworkReply::ignoreSslErrors()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCertificate> peerCertificateChain()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerCertificateChain(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_peerCertificateChain(long __this__nativeId);

/**
Returns the maximum number of certificates in the peer's certificate chain to be checked during the SSL handshake phase, or 0 (the default) if no maximum depth has been set, indicating that the whole certificate chain should be checked. <p>The certificates are checked in issuing order, starting with the peer's own certificate, then its issuer's certificate, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setPeerVerifyDepth(int) setPeerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslConfiguration#peerVerifyMode() peerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int peerVerifyDepth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerVerifyDepth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_peerVerifyDepth(long __this__nativeId);

/**
Returns the verify mode. This mode decides whether {@link com.trolltech.qt.network.QSslSocket QSslSocket} should request a certificate from the peer (i.e., the client requests a certificate from the server, or a server requesting a certificate from the client), and whether it should require that this certificate is valid. <p>The default mode is AutoVerifyPeer, which tells {@link com.trolltech.qt.network.QSslSocket QSslSocket} to use VerifyPeer for clients, QueryPeer for clients. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode) setPeerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslSocket.PeerVerifyMode peerVerifyMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSslSocket.PeerVerifyMode.resolve(__qt_peerVerifyMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_peerVerifyMode(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.network.QSslKey SSL key} assigned to this connection or a null key if none has been assigned yet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}, and {@link com.trolltech.qt.network.QSslConfiguration#localCertificate() localCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslKey privateKey()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_privateKey(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslKey __qt_privateKey(long __this__nativeId);

/**
Returns the protocol setting for this SSL configuration. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#setProtocol(com.trolltech.qt.network.QSsl.SslProtocol) setProtocol()}. <br></DD></DT>
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
Returns the socket's cryptographic {@link com.trolltech.qt.network.QSslCipher cipher}, or a null cipher if the connection isn't encrypted. The socket's cipher for the session is set during the handshake phase. The cipher is used to encrypt and decrypt data transmitted through the socket. <p>The SSL infrastructure also provides functions for setting the ordered list of ciphers from which the handshake phase will eventually select the session cipher. This ordered list must be in place before the handshake phase begins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#ciphers() ciphers()}, {@link com.trolltech.qt.network.QSslConfiguration#setCiphers(java.util.List) setCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCipher sessionCipher()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionCipher(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCipher __qt_sessionCipher(long __this__nativeId);

/**
Sets this socket's CA certificate database to be <tt>certificates</tt>. The certificate database must be set prior to the SSL handshake. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#caCertificates() caCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCaCertificates(java.util.List<com.trolltech.qt.network.QSslCertificate> certificates)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaCertificates_List(nativeId(), certificates);
    }
    @QtBlockedSlot
    native void __qt_setCaCertificates_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslCertificate> certificates);

/**
Sets the cryptographic cipher suite for this socket to <tt>ciphers</tt>, which must contain a subset of the ciphers in the list returned by supportedCiphers(). <p>Restricting the cipher suite must be done before the handshake phase, where the session cipher is chosen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#ciphers() ciphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCiphers(java.util.List<com.trolltech.qt.network.QSslCipher> ciphers)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCiphers_List(nativeId(), ciphers);
    }
    @QtBlockedSlot
    native void __qt_setCiphers_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslCipher> ciphers);

/**
Sets the certificate to be presented to the peer during SSL handshake to be <tt>certificate</tt>. <p>Setting the certificate once the connection has been established has no effect. <p>A certificate is the means of identification used in the SSL process. The local certificate is used by the remote end to verify the local user's identity against its list of Certification Authorities. In most cases, such as in HTTP web browsing, only servers identify to the clients, so the client does not send a certificate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#localCertificate() localCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLocalCertificate(com.trolltech.qt.network.QSslCertificate certificate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalCertificate_QSslCertificate(nativeId(), certificate == null ? 0 : certificate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocalCertificate_QSslCertificate(long __this__nativeId, long certificate);

/**
Sets the maximum number of certificates in the peer's certificate chain to be checked during the SSL handshake phase, to <tt>depth</tt>. Setting a depth of 0 means that no maximum depth is set, indicating that the whole certificate chain should be checked. <p>The certificates are checked in issuing order, starting with the peer's own certificate, then its issuer's certificate, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#peerVerifyDepth() peerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslConfiguration#setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode) setPeerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerVerifyDepth(int depth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerVerifyDepth_int(nativeId(), depth);
    }
    @QtBlockedSlot
    native void __qt_setPeerVerifyDepth_int(long __this__nativeId, int depth);

/**
Sets the verify mode to <tt>mode</tt>. This mode decides whether {@link com.trolltech.qt.network.QSslSocket QSslSocket} should request a certificate from the peer (i.e., the client requests a certificate from the server, or a server requesting a certificate from the client), and whether it should require that this certificate is valid. <p>The default mode is AutoVerifyPeer, which tells {@link com.trolltech.qt.network.QSslSocket QSslSocket} to use VerifyPeer for clients, QueryPeer for clients. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#peerVerifyMode() peerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerVerifyMode_PeerVerifyMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setPeerVerifyMode_PeerVerifyMode(long __this__nativeId, int mode);

/**
Sets the connection's private {@link com.trolltech.qt.network.QSslKey key} to <tt>key</tt>. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslConfiguration#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(com.trolltech.qt.network.QSslKey key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrivateKey_QSslKey(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPrivateKey_QSslKey(long __this__nativeId, long key);

/**
Sets the protocol setting for this configuration to be <tt>protocol</tt>. <p>Setting the protocol once the connection has already been established has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslConfiguration#protocol() protocol()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProtocol(com.trolltech.qt.network.QSsl.SslProtocol protocol)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProtocol_SslProtocol(nativeId(), protocol.value());
    }
    @QtBlockedSlot
    native void __qt_setProtocol_SslProtocol(long __this__nativeId, int protocol);

/**
Returns the default SSL configuration to be used in new SSL connections. <p>The default SSL configuration consists of: <ul><li> no local certificate and no private key</li><li> protocol SSLv3</li><li> the system's default CA certificate list</li><li> the cipher list equal to the list of the SSL libraries' supported SSL ciphers</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}, and {@link com.trolltech.qt.network.QSslConfiguration#setDefaultConfiguration(com.trolltech.qt.network.QSslConfiguration) setDefaultConfiguration()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.network.QSslConfiguration defaultConfiguration();

/**
Sets the default SSL configuration to be used in new SSL connections to be <tt>configuration</tt>. Existing connections are not affected by this call. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#supportedCiphers() QSslSocket::supportedCiphers()}, and {@link com.trolltech.qt.network.QSslConfiguration#defaultConfiguration() defaultConfiguration()}. <br></DD></DT>
*/

    public static void setDefaultConfiguration(com.trolltech.qt.network.QSslConfiguration configuration)    {
        __qt_setDefaultConfiguration_QSslConfiguration(configuration == null ? 0 : configuration.nativeId());
    }
    native static void __qt_setDefaultConfiguration_QSslConfiguration(long configuration);

/**
@exclude
*/

    public static native QSslConfiguration fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslConfiguration(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSslConfiguration array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QSslConfiguration)
        return operator_equal((com.trolltech.qt.network.QSslConfiguration) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSslConfiguration clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSslConfiguration __qt_clone(long __this_nativeId);
}
