package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QSslSocket class provides an SSL encrypted socket for both clients and servers. QSslSocket establishes a secure, encrypted TCP connection you can use for transmitting encrypted data. It can operate in both client and server mode, and it supports modern SSL protocols, including SSLv3 and TLSv1. By default, QSslSocket uses SSLv3, but you can change the SSL protocol by calling {@link com.trolltech.qt.network.QSslSocket#setProtocol(com.trolltech.qt.network.QSsl.SslProtocol) setProtocol()} as long as you do it before the handshake has started. <p>SSL encryption operates on top of the existing TCP stream after the socket enters the {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState }. There are two simple ways to establish a secure connection using QSslSocket: With an immediate SSL handshake, or with a delayed SSL handshake occurring after the connection has been established in unencrypted mode. <p>The most common way to use QSslSocket is to construct an object and start a secure connection by calling {@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()}. This method starts an immediate SSL handshake once the connection has been established.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSslSocket *socket = new QSslSocket(this);
connect(socket, SIGNAL(encrypted()), this, SLOT(ready()));

socket-&gt;connectToHostEncrypted("imap.example.com", 993);
</pre> As with a plain {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, QSslSocket enters the {@link com.trolltech.qt.network.QAbstractSocket.SocketState HostLookupState }, {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectingState }, and finally the {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState }, if the connection is successful. The handshake then starts automatically, and if it succeeds, the {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } signal is emitted to indicate the socket has entered the encrypted state and is ready for use. <p>Note that data can be written to the socket immediately after the return from {@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()} (i.e., before the {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } signal is emitted). The data is queued in QSslSocket until after the {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } signal is emitted. <p>An example of using the delayed SSL handshake to secure an existing connection is the case where an SSL server secures an incoming connection. Suppose you create an SSL server class as a subclass of {@link com.trolltech.qt.network.QTcpServer QTcpServer}. You would override {@link com.trolltech.qt.network.QTcpServer#incomingConnection(int) QTcpServer::incomingConnection()} with something like the example below, which first constructs an instance of QSslSocket and then calls {@link com.trolltech.qt.network.QSslSocket#setSocketDescriptor(int, com.trolltech.qt.network.QAbstractSocket.SocketState, com.trolltech.qt.core.QIODevice.OpenMode) setSocketDescriptor()} to set the new socket's descriptor to the existing one passed in. It then initiates the SSL handshake by calling {@link com.trolltech.qt.network.QSslSocket#startServerEncryption() startServerEncryption()}.<br><br>The following code example is written in c++.<br> <pre class="snippet">
void SslServer::incomingConnection(int socketDescriptor)
{
    QSslSocket *serverSocket = new QSslSocket;
    if (serverSocket-&gt;setSocketDescriptor(socketDescriptor)) {
        connect(serverSocket, SIGNAL(encrypted()), this, SLOT(ready()));
        serverSocket-&gt;startServerEncryption();
    } else {
        delete serverSocket;
    }
}
</pre> If an error occurs, QSslSocket emits the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal. In this case, if no action is taken to ignore the error(s), the connection is dropped. To continue, despite the occurrence of an error, you can call {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() ignoreSslErrors()}, either from within this slot after the error occurs, or any time after construction of the QSslSocket and before the connection is attempted. This will allow QSslSocket to ignore the errors it encounters when establishing the identity of the peer. Ignoring errors during an SSL handshake should be used with caution, since a fundamental characteristic of secure connections is that they should be established with a successful handshake. <p>Once encrypted, you use QSslSocket as a regular {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. When {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } is emitted, you can call {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#canReadLine() canReadLine()} and {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, or getChar() to read decrypted data from QSslSocket's internal buffer, and you can call {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} or putChar() to write data back to the peer. QSslSocket will automatically encrypt the written data for you, and emit {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } once the data has been written to the peer. <p>As a convenience, QSslSocket supports {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}'s blocking functions waitForConnected(), {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}, {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}, and waitForDisconnected(). It also provides {@link com.trolltech.qt.network.QSslSocket#waitForEncrypted() waitForEncrypted()}, which will block the calling thread until an encrypted connection has been established.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSslSocket socket;
socket.connectToHostEncrypted("http.example.com", 443);
if (!socket.waitForEncrypted()) {
    qDebug() &lt;&lt; socket.errorString();
    return false;
}

socket.write("GET / HTTP/1.0\r\n\r\n");
while (socket.waitForReadyRead())
    qDebug() &lt;&lt; socket.readAll().data();
</pre> QSslSocket provides an extensive, easy-to-use API for handling cryptographic ciphers, private keys, and local, peer, and Certification Authority (CA) certificates. It also provides an API for handling errors that occur during the handshake phase. <p>The following features can also be customized: <ul><li> The socket's cryptographic cipher suite can be customized before the handshake phase with {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()} and {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}.</li><li> The socket's local certificate and private key can be customized before the handshake phase with {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()} and {@link com.trolltech.qt.network.QSslSocket#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}.</li><li> The CA certificate database can be extended and customized with {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, {@link com.trolltech.qt.network.QSslSocket#setCaCertificates(java.util.List) setCaCertificates()}, {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}, {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificates(java.util.List) addDefaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setDefaultCaCertificates(java.util.List) setDefaultCaCertificates()}.</li></ul> For more information about ciphers and certificates, refer to {@link com.trolltech.qt.network.QSslCipher QSslCipher} and {@link com.trolltech.qt.network.QSslCertificate QSslCertificate}. <p>This product includes software developed by the OpenSSL Project for use in the OpenSSL Toolkit (http://www.openssl.org/). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslCertificate QSslCertificate}, {@link com.trolltech.qt.network.QSslCipher QSslCipher}, and {@link com.trolltech.qt.network.QSslError QSslError}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSslSocket extends com.trolltech.qt.network.QTcpSocket
{
    
/**
Describes the connection modes available for {@link com.trolltech.qt.network.QSslSocket QSslSocket}.
*/
@QtBlockedEnum
    public enum SslMode implements com.trolltech.qt.QtEnumerator {
/**
 The socket is unencrypted. Its behavior is identical to {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}.
*/

        UnencryptedMode(0),
/**
 The socket is a client-side SSL socket. It is either alreayd encrypted, or it is in the SSL handshake phase (see {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()}).
*/

        SslClientMode(1),
/**
 The socket is a server-side SSL socket. It is either already encrypted, or it is in the SSL handshake phase (see {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()}).
*/

        SslServerMode(2);

        SslMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSslSocket$SslMode constant with the specified <tt>int</tt>.</brief>
*/

        public static SslMode resolve(int value) {
            return (SslMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnencryptedMode;
            case 1: return SslClientMode;
            case 2: return SslServerMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
Describes the peer verification modes for {@link com.trolltech.qt.network.QSslSocket QSslSocket}. The default mode is {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode AutoVerifyPeer }, which selects an appropriate mode depending on the socket's QSocket::SslMode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerVerifyMode() QSslSocket::peerVerifyMode()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum PeerVerifyMode implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.network.QSslSocket QSslSocket} will not request a certificate from the peer. You can set this mode if you are not interested in the identity of the other side of the connection. The connection will still be encrypted, and your socket will still send its local certificate to the peer if it's requested.
*/

        VerifyNone(0),
/**
 {@link com.trolltech.qt.network.QSslSocket QSslSocket} will request a certificate from the peer, but does not require this certificate to be valid. This is useful when you want to display peer certificate details to the user without affecting the actual SSL handshake. This mode is the default for servers.
*/

        QueryPeer(1),
/**
 {@link com.trolltech.qt.network.QSslSocket QSslSocket} will request a certificate from the peer during the SSL handshake phase, and requires that this certificate is valid. On failure, {@link com.trolltech.qt.network.QSslSocket QSslSocket} will emit the {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()} signal. This mode is the default for clients.
*/

        VerifyPeer(2),
/**
 {@link com.trolltech.qt.network.QSslSocket QSslSocket} will automaticaly use {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode QueryPeer } for server sockets and {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode VerifyPeer } for client sockets.
*/

        AutoVerifyPeer(3);

        PeerVerifyMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSslSocket$PeerVerifyMode constant with the specified <tt>int</tt>.</brief>
*/

        public static PeerVerifyMode resolve(int value) {
            return (PeerVerifyMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return VerifyNone;
            case 1: return QueryPeer;
            case 2: return VerifyPeer;
            case 3: return AutoVerifyPeer;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when QSslSocket enters encrypted mode. After this signal has been emitted, {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()} will return true, and all further transmissions on the socket will be encrypted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) QSslSocket::connectToHostEncrypted()}, and {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()}. <br></DD></DT>
*/

    public final Signal0 encrypted = new Signal0();

    private final void encrypted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_encrypted(nativeId());
    }
    native void __qt_encrypted(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;&gt;:<p> This signal is emitted when QSslSocket enters encrypted mode. After this signal has been emitted, {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()} will return true, and all further transmissions on the socket will be encrypted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) QSslSocket::connectToHostEncrypted()}, and {@link com.trolltech.qt.network.QSslSocket#isEncrypted() QSslSocket::isEncrypted()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Long> encryptedBytesWritten = new Signal1<java.lang.Long>();

    private final void encryptedBytesWritten(long totalBytes)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_encryptedBytesWritten_long(nativeId(), totalBytes);
    }
    native void __qt_encryptedBytesWritten_long(long __this__nativeId, long totalBytes);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QSslSocket$SslMode(named: mode)&gt;:<p> This signal is emitted when QSslSocket changes from {@link com.trolltech.qt.network.QSslSocket.SslMode QSslSocket::UnencryptedMode } to either {@link com.trolltech.qt.network.QSslSocket.SslMode QSslSocket::SslClientMode } or {@link com.trolltech.qt.network.QSslSocket.SslMode QSslSocket::SslServerMode }. <tt>mode</tt> is the new mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#mode() QSslSocket::mode()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QSslSocket.SslMode> modeChanged = new Signal1<com.trolltech.qt.network.QSslSocket.SslMode>();

    private final void modeChanged(com.trolltech.qt.network.QSslSocket.SslMode newMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_modeChanged_SslMode(nativeId(), newMode.value());
    }
    native void __qt_modeChanged_SslMode(long __this__nativeId, int newMode);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QSslError(named: error)&gt;:<p> QSslSocket can emit this signal several times during the SSL handshake, before encryption has been established, to indicate that an error has occurred while establishing the identity of the peer. The <tt>error</tt> is usually an indication that QSslSocket is unable to securely identify the peer. <p>This signal provides you with an early indication when something's wrong. By connecting to this signal, you can manually choose to tear down the connection from inside the connected slot before the handshake has completed. If no action is taken, QSslSocket will proceed to emitting {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QSslError> peerVerifyError = new Signal1<com.trolltech.qt.network.QSslError>();

    private final void peerVerifyError(com.trolltech.qt.network.QSslError error)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_peerVerifyError_QSslError(nativeId(), error == null ? 0 : error.nativeId());
    }
    native void __qt_peerVerifyError_QSslError(long __this__nativeId, long error);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<com.trolltech.qt.network.QSslError>(named: errors)&gt;:<p> QSslSocket emits this signal after the SSL handshake to indicate that one or more errors have occurred while establishing the identity of the peer. The errors are usually an indication that QSslSocket is unable to securely identify the peer. Unless any action is taken, the connection will be dropped after this signal has been emitted. <p>If you want to continue connecting despite the errors that have occurred, you must call {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() QSslSocket::ignoreSslErrors()} from inside a slot connected to this signal. If you need to access the error list at a later point, you can call {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} (without arguments). <p><tt>errors</tt> contains one or more errors that prevent QSslSocket from verifying the identity of the peer. <p>Note: You cannot use {@link com.trolltech.qt.core.Qt.ConnectionType Qt::QueuedConnection } when connecting to this signal, or calling {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() QSslSocket::ignoreSslErrors()} will have no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerVerifyError peerVerifyError() }. <br></DD></DT>
*/

    public final Signal1<java.util.List<com.trolltech.qt.network.QSslError>> sslErrors = new Signal1<java.util.List<com.trolltech.qt.network.QSslError>>();

    private final void sslErrors(java.util.List<com.trolltech.qt.network.QSslError> errors)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sslErrors_List(nativeId(), errors);
    }
    native void __qt_sslErrors_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslError> errors);


/**
Constructs a QSslSocket object. <tt>parent</tt> is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. The new socket's {@link com.trolltech.qt.network.QSslCipher cipher} suite is set to the one returned by the static method {@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}.
*/

    public QSslSocket() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSslSocket object. <tt>parent</tt> is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. The new socket's {@link com.trolltech.qt.network.QSslCipher cipher} suite is set to the one returned by the static method {@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}.
*/

    public QSslSocket(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSslSocket_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSslSocket_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void abort()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_abort(nativeId());
    }
    @QtBlockedSlot
    native void __qt_abort(long __this__nativeId);

/**
Adds the <tt>certificate</tt> to this socket's CA certificate database. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>To add multiple certificates, use {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setCaCertificates(java.util.List) setCaCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addCaCertificate(com.trolltech.qt.network.QSslCertificate certificate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addCaCertificate_QSslCertificate(nativeId(), certificate == null ? 0 : certificate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addCaCertificate_QSslCertificate(long __this__nativeId, long certificate);

/**
Adds the <tt>certificates</tt> to this socket's CA certificate database. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>For more precise control, use {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addCaCertificates(java.util.List<com.trolltech.qt.network.QSslCertificate> certificates)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addCaCertificates_List(nativeId(), certificates);
    }
    @QtBlockedSlot
    native void __qt_addCaCertificates_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslCertificate> certificates);


/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and adds them to this socket's CA certificate database. <tt>path</tt> can be explicit, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if one or more certificates are added to the socket's CA certificate database; otherwise returns false. <p>The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>For more precise control, use {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, and {@link com.trolltech.qt.network.QSslCertificate#fromPath(java.lang.String, com.trolltech.qt.network.QSsl.EncodingFormat) QSslCertificate::fromPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean addCaCertificates(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        return addCaCertificates(path, format, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }

/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and adds them to this socket's CA certificate database. <tt>path</tt> can be explicit, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if one or more certificates are added to the socket's CA certificate database; otherwise returns false. <p>The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>For more precise control, use {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, and {@link com.trolltech.qt.network.QSslCertificate#fromPath(java.lang.String, com.trolltech.qt.network.QSsl.EncodingFormat) QSslCertificate::fromPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean addCaCertificates(java.lang.String path) {
        return addCaCertificates(path, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }
/**
Searches all files in the <tt>path</tt> for certificates encoded in the specified <tt>format</tt> and adds them to this socket's CA certificate database. <tt>path</tt> can be explicit, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if one or more certificates are added to the socket's CA certificate database; otherwise returns false. <p>The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>For more precise control, use {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, and {@link com.trolltech.qt.network.QSslCertificate#fromPath(java.lang.String, com.trolltech.qt.network.QSsl.EncodingFormat) QSslCertificate::fromPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean addCaCertificates(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.core.QRegExp.PatternSyntax syntax)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addCaCertificates_String_EncodingFormat_PatternSyntax(nativeId(), path, format.value(), syntax.value());
    }
    @QtBlockedSlot
    native boolean __qt_addCaCertificates_String_EncodingFormat_PatternSyntax(long __this__nativeId, java.lang.String path, int format, int syntax);

/**
Returns this socket's CA certificate database. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. It can be moodified prior to the handshake with {@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setCaCertificates(java.util.List) setCaCertificates()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#addCaCertificate(com.trolltech.qt.network.QSslCertificate) addCaCertificate()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setCaCertificates(java.util.List) setCaCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCertificate> caCertificates()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_caCertificates(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_caCertificates(long __this__nativeId);

/**
Returns this socket's current cryptographic cipher suite. This list is used during the socket's handshake phase for choosing a session cipher. The returned list of ciphers is ordered by descending preference. (i.e., the first cipher in the list is the most preferred cipher). The session cipher will be the first one in the list that is also supported by the peer. <p>By default, the handshake phase can choose any of the ciphers supported by this system's SSL libraries, which may vary from system to system. The list of ciphers supported by this system's SSL libraries is returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. You can restrict the list of ciphers used for choosing the session cipher for this socket by calling {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()} with a subset of the supported ciphers. You can revert to using the entire set by calling {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()} with the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <p>You can restrict the list of ciphers used for choosing the session cipher for all sockets by calling {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()} with a subset of the supported ciphers. You can revert to using the entire set by calling {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()} with the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()}, {@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}, {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCipher> ciphers()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ciphers(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCipher> __qt_ciphers(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void connectToHostEncrypted(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.connectToHostEncrypted(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

/**

*/

    @QtBlockedSlot
    public final void connectToHostEncrypted(java.lang.String hostName, char port) {
        connectToHostEncrypted(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**

*/

    @QtBlockedSlot
    public final void connectToHostEncrypted(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToHostEncrypted_String_char_OpenMode(nativeId(), hostName, port, mode.value());
    }
    @QtBlockedSlot
    native void __qt_connectToHostEncrypted_String_char_OpenMode(long __this__nativeId, java.lang.String hostName, char port, int mode);

    private final void connectToHostImplementation(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToHostImplementation_String_char_OpenMode(nativeId(), hostName, port, openMode.value());
    }
    native void __qt_connectToHostImplementation_String_char_OpenMode(long __this__nativeId, java.lang.String hostName, char port, int openMode);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected final void disconnectFromHostImplementation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectFromHostImplementation(nativeId());
    }
    native void __qt_disconnectFromHostImplementation(long __this__nativeId);

/**
Returns the number of encrypted bytes that are awaiting decryption. Normally, this function will return 0 because QSslSocket decrypts its incoming data as soon as it can.
*/

    @QtBlockedSlot
    public final long encryptedBytesAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encryptedBytesAvailable(nativeId());
    }
    @QtBlockedSlot
    native long __qt_encryptedBytesAvailable(long __this__nativeId);

/**
Returns the number of encrypted bytes that are waiting to be written to the network.
*/

    @QtBlockedSlot
    public final long encryptedBytesToWrite()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encryptedBytesToWrite(nativeId());
    }
    @QtBlockedSlot
    native long __qt_encryptedBytesToWrite(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean flush()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_flush(long __this__nativeId);

/**
This slot tells QSslSocket to ignore errors during QSslSocket's handshake phase and continue connecting. If you want to continue with the connection even if errors occur during the handshake phase, then you must call this slot, either from a slot connected to {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()}, or before the handshake phase. If you don't call this slot, either in response to errors or before the handshake, the connection will be dropped after the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal has been emitted. <p>If there are no errors during the SSL handshake phase (i.e., the identity of the peer is established with no problems), QSslSocket will not emit the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal, and it is unnecessary to call this function. <p>Ignoring errors that occur during an SSL handshake should be done with caution. A fundamental characteristic of secure connections is that they should be established with an error free handshake. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()}. <br></DD></DT>
*/

    public final void ignoreSslErrors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ignoreSslErrors(nativeId());
    }
    native void __qt_ignoreSslErrors(long __this__nativeId);

/**
Returns true if the socket is encrypted; otherwise, false is returned. <p>An encrypted socket encrypts all data that is written by calling {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} or putChar() before the data is written to the network, and descrypts all incoming data as the data is received from the network, before you call {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()} or getChar(). <p>QSslSocket emits {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } when it enters encrypted mode. <p>You can call {@link com.trolltech.qt.network.QSslSocket#sessionCipher() sessionCipher()} to find which cryptographic cipher is used to encrypt and decrypt your data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#mode() mode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEncrypted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEncrypted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEncrypted(long __this__nativeId);

/**
Returns the socket's local {@link com.trolltech.qt.network.QSslCertificate certificate}, or an empty certificate if no local certificate has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}, and {@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCertificate localCertificate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localCertificate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCertificate __qt_localCertificate(long __this__nativeId);

/**
Returns the current mode for the socket; either {@link com.trolltech.qt.network.QSslSocket.SslMode UnencryptedMode }, where QSslSocket behaves identially to {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, or one of {@link com.trolltech.qt.network.QSslSocket.SslMode SslClientMode } or {@link com.trolltech.qt.network.QSslSocket.SslMode SslServerMode }, where the client is either negotiating or in encrypted mode. <p>When the mode changes, QSslSocket emits {@link com.trolltech.qt.network.QSslSocket#modeChanged modeChanged() } <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket.SslMode SslMode }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslSocket.SslMode mode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSslSocket.SslMode.resolve(__qt_mode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mode(long __this__nativeId);

/**
Returns the peer's digital certificate (i. ., the immediate certificate of the host you are connected to), or a null certificate, if the peer has not assigned a certificate. <p>The peer certificate is checked automatically during the handshake phase, so this function is normally used to fetch the certificate for display or for connection diagnostic purposes. It contains information about the peer, including its host name, the certificate issuer, and the peer's public key. <p>Because the peer certificate is set during the handshake phase, it is safe to access the peer certificate from a slot connected to the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal or the {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } signal. <p>If a null certificate is returned, it can mean the SSL handshake failed, or it can mean the host you are connected to doesn't have a certificate, or it can mean there is no connection. <p>If you want to check the peer's complete chain of certificates, use {@link com.trolltech.qt.network.QSslSocket#peerCertificateChain() peerCertificateChain()} to get them all at once. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerCertificateChain() peerCertificateChain()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCertificate peerCertificate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerCertificate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCertificate __qt_peerCertificate(long __this__nativeId);

/**
Returns the peer's chain of digital certificates, or an empty list of certificates. <p>Peer certificates are checked automatically during the handshake phase. This function is normally used to fetch certificates for display, or for performing connection diagnostics. Certificates contain information about the peer and the certificate issuers, including host name, issuer names, and issuer public keys. <p>The peer certificates are set in QSslSocket during the handshake phase, so it is safe to call this function from a slot connected to the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal or the {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } signal. <p>If an empty list is returned, it can mean the SSL handshake failed, or it can mean the host you are connected to doesn't have a certificate, or it can mean there is no connection. <p>If you want to get only the peer's immediate certificate, use {@link com.trolltech.qt.network.QSslSocket#peerCertificate() peerCertificate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerCertificate() peerCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslCertificate> peerCertificateChain()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerCertificateChain(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslCertificate> __qt_peerCertificateChain(long __this__nativeId);

/**
Returns the maximum number of certificates in the peer's certificate chain to be checked during the SSL handshake phase, or 0 (the default) if no maximum depth has been set, indicating that the whole certificate chain should be checked. <p>The certificates are checked in issuing order, starting with the peer's own certificate, then its issuer's certificate, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setPeerVerifyDepth(int) setPeerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslSocket#peerVerifyMode() peerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int peerVerifyDepth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerVerifyDepth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_peerVerifyDepth(long __this__nativeId);

/**
Returns the socket's verify mode. This mode mode decides whether QSslSocket should request a certificate from the peer (i.e., the client requests a certificate from the server, or a server requesting a certificate from the client), and whether it should require that this certificate is valid. <p>The default mode is {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode AutoVerifyPeer }, which tells QSslSocket to use {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode VerifyPeer } for clients, {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode QueryPeer } for clients. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode) setPeerVerifyMode()}, {@link com.trolltech.qt.network.QSslSocket#peerVerifyDepth() peerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslSocket#mode() mode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslSocket.PeerVerifyMode peerVerifyMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSslSocket.PeerVerifyMode.resolve(__qt_peerVerifyMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_peerVerifyMode(long __this__nativeId);

/**
Returns this socket's private key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}, and {@link com.trolltech.qt.network.QSslSocket#localCertificate() localCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslKey privateKey()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_privateKey(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslKey __qt_privateKey(long __this__nativeId);

/**
Returns the socket's SSL protocol. By default, {@link com.trolltech.qt.network.QSsl.SslProtocol QSsl::SslV3 } is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setProtocol(com.trolltech.qt.network.QSsl.SslProtocol) setProtocol()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSsl.SslProtocol protocol()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QSsl.SslProtocol.resolve(__qt_protocol(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_protocol(long __this__nativeId);

/**
Returns the socket's cryptographic {@link com.trolltech.qt.network.QSslCipher cipher}, or a null cipher if the connection isn't encrypted. The socket's cipher for the session is set during the handshake phase. The cipher is used to encrypt and decrypt data transmitted through the socket. <p>QSslSocket also provides functions for setting the ordered list of ciphers from which the handshake phase will eventually select the session cipher. This ordered list must be in place before the handshake phase begins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#ciphers() ciphers()}, {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()}, {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}, {@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslCipher sessionCipher()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionCipher(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslCipher __qt_sessionCipher(long __this__nativeId);

/**
Sets this socket's CA certificate database to be <tt>certificates</tt>. The certificate database must be set prior to the SSL handshake. The CA certificate database is used by the socket during the handshake phase to validate the peer's certificate. <p>The CA certificate database can be reset to the current default CA certificate database by calling this function with the list of CA certificates returned by {@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCaCertificates(java.util.List<com.trolltech.qt.network.QSslCertificate> certificates)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaCertificates_List(nativeId(), certificates);
    }
    @QtBlockedSlot
    native void __qt_setCaCertificates_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslCertificate> certificates);

/**
Sets the cryptographic cipher suite for this socket to <tt>ciphers</tt>, which must contain a subset of the ciphers in the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <p>Restricting the cipher suite must be done before the handshake phase, where the session cipher is chosen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#ciphers() ciphers()}, {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCiphers(java.util.List<com.trolltech.qt.network.QSslCipher> ciphers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCiphers_List(nativeId(), ciphers);
    }
    @QtBlockedSlot
    native void __qt_setCiphers_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslCipher> ciphers);

/**
Sets the cryptographic cipher suite for this socket to <tt>ciphers</tt>, which is a colon-separated list of cipher suite names. The ciphers are listed in order of preference, starting with the most preferred cipher. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QSslSocket socket;
socket.setCiphers("DHE-RSA-AES256-SHA:DHE-DSS-AES256-SHA:AES256-SHA");
</pre> Each cipher name in <tt>ciphers</tt> must be the name of a cipher in the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. Restricting the cipher suite must be done before the handshake phase, where the session cipher is chosen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#ciphers() ciphers()}, {@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCiphers(java.lang.String ciphers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCiphers_String(nativeId(), ciphers);
    }
    @QtBlockedSlot
    native void __qt_setCiphers_String(long __this__nativeId, java.lang.String ciphers);

/**
Sets the socket's local certificate to <tt>certificate</tt>. The local certificate is necessary if you need to confirm your identity to the peer. It is used together with the private key; if you set the local certificate, you must also set the private key. <p>The local certificate and private key are always necessary for server sockets, but are also rarely used by client sockets if the server requires the client to authenticate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#localCertificate() localCertificate()}, and {@link com.trolltech.qt.network.QSslSocket#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLocalCertificate(com.trolltech.qt.network.QSslCertificate certificate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalCertificate_QSslCertificate(nativeId(), certificate == null ? 0 : certificate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocalCertificate_QSslCertificate(long __this__nativeId, long certificate);


/**
This is an overloaded member function, provided for convenience. <p>Sets the socket's local {@link com.trolltech.qt.network.QSslCertificate certificate} to the first one found in file <tt>path</tt>, which is parsed according to the specified <tt>format</tt>.
*/

    @QtBlockedSlot
    public final void setLocalCertificate(java.lang.String fileName) {
        setLocalCertificate(fileName, com.trolltech.qt.network.QSsl.EncodingFormat.Pem);
    }
/**
This is an overloaded member function, provided for convenience. <p>Sets the socket's local {@link com.trolltech.qt.network.QSslCertificate certificate} to the first one found in file <tt>path</tt>, which is parsed according to the specified <tt>format</tt>.
*/

    @QtBlockedSlot
    public final void setLocalCertificate(java.lang.String fileName, com.trolltech.qt.network.QSsl.EncodingFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalCertificate_String_EncodingFormat(nativeId(), fileName, format.value());
    }
    @QtBlockedSlot
    native void __qt_setLocalCertificate_String_EncodingFormat(long __this__nativeId, java.lang.String fileName, int format);

/**
Sets the maximum number of certificates in the peer's certificate chain to be checked during the SSL handshake phase, to <tt>depth</tt>. Setting a depth of 0 means that no maximum depth is set, indicating that the whole certificate chain should be checked. <p>The certificates are checked in issuing order, starting with the peer's own certificate, then its issuer's certificate, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerVerifyDepth() peerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslSocket#setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode) setPeerVerifyMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerVerifyDepth(int depth)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerVerifyDepth_int(nativeId(), depth);
    }
    @QtBlockedSlot
    native void __qt_setPeerVerifyDepth_int(long __this__nativeId, int depth);

/**
Sets the socket's verify mode to <tt>mode</tt>. This mode decides whether QSslSocket should request a certificate from the peer (i.e., the client requests a certificate from the server, or a server requesting a certificate from the client), and whether it should require that this certificate is valid. <p>The default mode is {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode AutoVerifyPeer }, which tells QSslSocket to use {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode VerifyPeer } for clients, {@link com.trolltech.qt.network.QSslSocket.PeerVerifyMode QueryPeer } for clients. <p>Setting this mode after encryption has started has no effect on the current connection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#peerVerifyMode() peerVerifyMode()}, {@link com.trolltech.qt.network.QSslSocket#setPeerVerifyDepth(int) setPeerVerifyDepth()}, and {@link com.trolltech.qt.network.QSslSocket#mode() mode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerVerifyMode(com.trolltech.qt.network.QSslSocket.PeerVerifyMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerVerifyMode_PeerVerifyMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setPeerVerifyMode_PeerVerifyMode(long __this__nativeId, int mode);

/**
Sets the socket's private {@link com.trolltech.qt.network.QSslKey key} to <tt>key</tt>. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(com.trolltech.qt.network.QSslKey key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrivateKey_QSslKey(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPrivateKey_QSslKey(long __this__nativeId, long key);


/**
This is an overloaded member function, provided for convenience. <p>Reads the string in file <tt>fileName</tt> and decodes it using a specified <tt>algorithm</tt> and encoding <tt>format</tt> to construct an {@link com.trolltech.qt.network.QSslKey SSL key}. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <p>The socket's private key is set to the constructed key. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(java.lang.String fileName, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        setPrivateKey(fileName, algorithm, format, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
This is an overloaded member function, provided for convenience. <p>Reads the string in file <tt>fileName</tt> and decodes it using a specified <tt>algorithm</tt> and encoding <tt>format</tt> to construct an {@link com.trolltech.qt.network.QSslKey SSL key}. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <p>The socket's private key is set to the constructed key. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(java.lang.String fileName, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm) {
        setPrivateKey(fileName, algorithm, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
This is an overloaded member function, provided for convenience. <p>Reads the string in file <tt>fileName</tt> and decodes it using a specified <tt>algorithm</tt> and encoding <tt>format</tt> to construct an {@link com.trolltech.qt.network.QSslKey SSL key}. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <p>The socket's private key is set to the constructed key. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(java.lang.String fileName) {
        setPrivateKey(fileName, com.trolltech.qt.network.QSsl.KeyAlgorithm.Rsa, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
This is an overloaded member function, provided for convenience. <p>Reads the string in file <tt>fileName</tt> and decodes it using a specified <tt>algorithm</tt> and encoding <tt>format</tt> to construct an {@link com.trolltech.qt.network.QSslKey SSL key}. If the encoded key is encrypted, <tt>passPhrase</tt> is used to decrypt it. <p>The socket's private key is set to the constructed key. The private key and the local {@link com.trolltech.qt.network.QSslCertificate certificate} are used by clients and servers that must prove their identity to SSL peers. <p>Both the key and the local certificate are required if you are creating an SSL server socket. If you are creating an SSL client socket, the key and local certificate are required if your client must identify itself to an SSL server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, and {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrivateKey(java.lang.String fileName, com.trolltech.qt.network.QSsl.KeyAlgorithm algorithm, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.core.QByteArray passPhrase)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrivateKey_String_KeyAlgorithm_EncodingFormat_QByteArray(nativeId(), fileName, algorithm.value(), format.value(), passPhrase == null ? 0 : passPhrase.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPrivateKey_String_KeyAlgorithm_EncodingFormat_QByteArray(long __this__nativeId, java.lang.String fileName, int algorithm, int format, long passPhrase);

/**
Sets the socket's SSL protocol to <tt>protocol</tt>. This will affect the next initiated handshake; calling this function on an already-encrypted socket will not affect the socket's protocol. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#protocol() protocol()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProtocol(com.trolltech.qt.network.QSsl.SslProtocol protocol)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProtocol_SslProtocol(nativeId(), protocol.value());
    }
    @QtBlockedSlot
    native void __qt_setProtocol_SslProtocol(long __this__nativeId, int protocol);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setReadBufferSize(long size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadBufferSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setReadBufferSize_long(long __this__nativeId, long size);

/**
Initializes QSslSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if <tt>socketDescriptor</tt> is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>state</tt>. <p><b>Note:</b> It is not possible to initialize two sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketDescriptor() socketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(int socketDescriptor, com.trolltech.qt.network.QAbstractSocket.SocketState state, com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSocketDescriptor_int_SocketState_OpenMode(nativeId(), socketDescriptor, state.value(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_setSocketDescriptor_int_SocketState_OpenMode(long __this__nativeId, int socketDescriptor, int state, int openMode);

/**
Sets the socket's SSL configuration to be the contents of <tt>configuration</tt>. This function sets the local certificate, the ciphers, the private key and the CA certificates to those stored in <tt>configuration</tt>. <p>It is not possible to set the SSL-state related fields. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#sslConfiguration() sslConfiguration()}, {@link com.trolltech.qt.network.QSslSocket#setLocalCertificate(com.trolltech.qt.network.QSslCertificate) setLocalCertificate()}, {@link com.trolltech.qt.network.QSslSocket#setPrivateKey(com.trolltech.qt.network.QSslKey) setPrivateKey()}, {@link com.trolltech.qt.network.QSslSocket#setCaCertificates(java.util.List) setCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSslConfiguration(com.trolltech.qt.network.QSslConfiguration config)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSslConfiguration_QSslConfiguration(nativeId(), config == null ? 0 : config.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSslConfiguration_QSslConfiguration(long __this__nativeId, long config);

/**
Returns the socket's SSL configuration state. The default SSL configuration of a socket is to use the default ciphers, default CA certificates, no local private key or certificate. <p>The SSL configuration also contains fields that can change with time without notice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setSslConfiguration(com.trolltech.qt.network.QSslConfiguration) setSslConfiguration()}, {@link com.trolltech.qt.network.QSslSocket#localCertificate() localCertificate()}, {@link com.trolltech.qt.network.QSslSocket#peerCertificate() peerCertificate()}, {@link com.trolltech.qt.network.QSslSocket#peerCertificateChain() peerCertificateChain()}, {@link com.trolltech.qt.network.QSslSocket#sessionCipher() sessionCipher()}, {@link com.trolltech.qt.network.QSslSocket#privateKey() privateKey()}, {@link com.trolltech.qt.network.QSslSocket#ciphers() ciphers()}, and {@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslConfiguration sslConfiguration()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sslConfiguration(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslConfiguration __qt_sslConfiguration(long __this__nativeId);

/**
Returns a list of the last SSL errors that occurred. This is the same list as QSslSocket passes via the {@link com.trolltech.qt.network.QSslSocket#sslErrors() sslErrors()} signal. If the connection has been encrypted with no errors, this function will return an empty list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QSslError> sslErrors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sslErrors(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QSslError> __qt_sslErrors(long __this__nativeId);

/**
Starts a delayed SSL handshake for a client connection. This function can be called when the socket is in the {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } but still in the {@link com.trolltech.qt.network.QSslSocket.SslMode UnencryptedMode }. If it is not yet connected, or if it is already encrypted, this function has no effect. <p>Clients that implement STARTTLS functionality often make use of delayed SSL handshakes. Most other clients can avoid calling this function directly by using {@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()} instead, which automatically performs the handshake. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()}, and {@link com.trolltech.qt.network.QSslSocket#startServerEncryption() startServerEncryption()}. <br></DD></DT>
*/

    public final void startClientEncryption()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startClientEncryption(nativeId());
    }
    native void __qt_startClientEncryption(long __this__nativeId);

/**
Starts a delayed SSL handshake for a server connection. This function can be called when the socket is in the {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } but still in {@link com.trolltech.qt.network.QSslSocket.SslMode UnencryptedMode }. If it is not connected or it is already encrypted, the function has no effect. <p>For server sockets, calling this function is the only way to initiate the SSL handshake. Most servers will call this function immediately upon receiving a connection, or as a result of having received a protocol-specific command to enter SSL mode (e.g, the server may respond to receiving the string "STARTTLS\r\n" by calling this function). <p>The most common way to implement an SSL server is to create a subclass of {@link com.trolltech.qt.network.QTcpServer QTcpServer} and reimplement {@link com.trolltech.qt.network.QTcpServer#incomingConnection(int) QTcpServer::incomingConnection()}. The returned socket descriptor is then passed to {@link com.trolltech.qt.network.QSslSocket#setSocketDescriptor(int, com.trolltech.qt.network.QAbstractSocket.SocketState, com.trolltech.qt.core.QIODevice.OpenMode) QSslSocket::setSocketDescriptor()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#connectToHostEncrypted(java.lang.String, char, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToHostEncrypted()}, and {@link com.trolltech.qt.network.QSslSocket#startClientEncryption() startClientEncryption()}. <br></DD></DT>
*/

    public final void startServerEncryption()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startServerEncryption(nativeId());
    }
    native void __qt_startServerEncryption(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean waitForConnected(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForConnected_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForConnected_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean waitForDisconnected(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForDisconnected_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForDisconnected_int(long __this__nativeId, int msecs);


/**
Waits until the socket has completed the SSL handshake and has emitted {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() }, or <tt>msecs</tt> milliseconds, whichever comes first. If {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } has been emitted, this function returns true; otherwise (e.g., the socket is disconnected, or the SSL handshake fails), false is returned. <p>The following example waits up to one second for the socket to be encrypted:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;connectToHostEncrypted("imap", 993);
if (socket-&gt;waitForEncrypted(1000))
    qDebug("Encrypted!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#startClientEncryption() startClientEncryption()}, {@link com.trolltech.qt.network.QSslSocket#startServerEncryption() startServerEncryption()}, {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() }, and {@link com.trolltech.qt.network.QSslSocket#isEncrypted() isEncrypted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForEncrypted() {
        return waitForEncrypted((int)30000);
    }
/**
Waits until the socket has completed the SSL handshake and has emitted {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() }, or <tt>msecs</tt> milliseconds, whichever comes first. If {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() } has been emitted, this function returns true; otherwise (e.g., the socket is disconnected, or the SSL handshake fails), false is returned. <p>The following example waits up to one second for the socket to be encrypted:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;connectToHostEncrypted("imap", 993);
if (socket-&gt;waitForEncrypted(1000))
    qDebug("Encrypted!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#startClientEncryption() startClientEncryption()}, {@link com.trolltech.qt.network.QSslSocket#startServerEncryption() startServerEncryption()}, {@link com.trolltech.qt.network.QSslSocket#encrypted encrypted() }, and {@link com.trolltech.qt.network.QSslSocket#isEncrypted() isEncrypted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForEncrypted(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForEncrypted_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForEncrypted_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean atEnd()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long bytesAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesAvailable(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesAvailable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long bytesToWrite()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesToWrite(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesToWrite(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean canReadLine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canReadLine(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canReadLine(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_close(nativeId());
    }
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int readData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean waitForBytesWritten(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForBytesWritten_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForBytesWritten_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean waitForReadyRead(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForReadyRead_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForReadyRead_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int writeData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] data);

/**
Adds <tt>certificate</tt> to the default CA certificate database. Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}. <br></DD></DT>
*/

    public static void addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate certificate)    {
        __qt_addDefaultCaCertificate_QSslCertificate(certificate == null ? 0 : certificate.nativeId());
    }
    native static void __qt_addDefaultCaCertificate_QSslCertificate(long certificate);

/**
Adds <tt>certificates</tt> to the default CA certificate database. Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}. <br></DD></DT>
*/

    public native static void addDefaultCaCertificates(java.util.List<com.trolltech.qt.network.QSslCertificate> certificates);


/**
Searches all files in the <tt>path</tt> for certificates with the specified <tt>encoding</tt> and adds them to the default CA certificate database. <tt>path</tt> can be an explicit file, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if any CA certificates are added to the default database. <p>Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}. <br></DD></DT>
*/

    public static boolean addDefaultCaCertificates(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format) {
        return addDefaultCaCertificates(path, format, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }

/**
Searches all files in the <tt>path</tt> for certificates with the specified <tt>encoding</tt> and adds them to the default CA certificate database. <tt>path</tt> can be an explicit file, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if any CA certificates are added to the default database. <p>Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}. <br></DD></DT>
*/

    public static boolean addDefaultCaCertificates(java.lang.String path) {
        return addDefaultCaCertificates(path, com.trolltech.qt.network.QSsl.EncodingFormat.Pem, com.trolltech.qt.core.QRegExp.PatternSyntax.FixedString);
    }
/**
Searches all files in the <tt>path</tt> for certificates with the specified <tt>encoding</tt> and adds them to the default CA certificate database. <tt>path</tt> can be an explicit file, or it can contain wildcards in the format specified by <tt>syntax</tt>. Returns true if any CA certificates are added to the default database. <p>Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, {@link com.trolltech.qt.network.QSslSocket#addCaCertificates(java.util.List) addCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}. <br></DD></DT>
*/

    public static boolean addDefaultCaCertificates(java.lang.String path, com.trolltech.qt.network.QSsl.EncodingFormat format, com.trolltech.qt.core.QRegExp.PatternSyntax syntax)    {
        return __qt_addDefaultCaCertificates_String_EncodingFormat_PatternSyntax(path, format.value(), syntax.value());
    }
    native static boolean __qt_addDefaultCaCertificates_String_EncodingFormat_PatternSyntax(java.lang.String path, int format, int syntax);

/**
Returns the current default CA certificate database. This database is originally set to your system's default CA certificate database. If no system default database is found, Qt will provide its own default database. You can override the default CA certificate database with your own CA certificate database using {@link com.trolltech.qt.network.QSslSocket#setDefaultCaCertificates(java.util.List) setDefaultCaCertificates()}. <p>Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setDefaultCaCertificates(java.util.List) setDefaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.network.QSslCertificate> defaultCaCertificates();

/**
Returns the default cryptographic cipher suite for all sockets in this application. This list is used during the socket's handshake phase when negotiating with the peer to choose a session cipher. The list is ordered by preference (i.e., the first cipher in the list is the most preferred cipher). <p>By default, the handshake phase can choose any of the ciphers supported by this system's SSL libraries, which may vary from system to system. The list of ciphers supported by this system's SSL libraries is returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setDefaultCiphers(java.util.List) setDefaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.network.QSslCipher> defaultCiphers();

/**
Sets the default CA certificate database to <tt>certificates</tt>. The default CA certificate database is originally set to your system's default CA certificate database. If no system default database is found, Qt will provide its own default database. You can override the default CA certificate database with your own CA certificate database using this function. <p>Each SSL socket's CA certificate database is initialized to the default CA certificate database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#addDefaultCaCertificate(com.trolltech.qt.network.QSslCertificate) addDefaultCaCertificate()}. <br></DD></DT>
*/

    public native static void setDefaultCaCertificates(java.util.List<com.trolltech.qt.network.QSslCertificate> certificates);

/**
Sets the default cryptographic cipher suite for all sockets in this application to <tt>ciphers</tt>, which must contain a subset of the ciphers in the list returned by {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <p>Restricting the default cipher suite only affects SSL sockets that perform their handshake phase after the default cipher suite has been changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()}, {@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}, and {@link com.trolltech.qt.network.QSslSocket#supportedCiphers() supportedCiphers()}. <br></DD></DT>
*/

    public native static void setDefaultCiphers(java.util.List<com.trolltech.qt.network.QSslCipher> ciphers);

/**
Returns the list of cryptographic ciphers supported by this system. This list is set by the system's SSL libraries and may vary from system to system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#defaultCiphers() defaultCiphers()}, {@link com.trolltech.qt.network.QSslSocket#ciphers() ciphers()}, and {@link com.trolltech.qt.network.QSslSocket#setCiphers(java.util.List) setCiphers()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.network.QSslCipher> supportedCiphers();

/**
Returns true if this platform supports SSL; otherwise, returns false. If the platform doesn't support SSL, the socket will fail in the connection phase.
*/

    public native static boolean supportsSsl();

/**
Returns the system default CA certificate database for your system. This database is normally found in a standard place for your system. If it is not found there, Qt will provide its own default CA certificate database. The CA certificate database returned by this function is used to initialize the database returned by {@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}. You can replace that database with your own with {@link com.trolltech.qt.network.QSslSocket#setDefaultCaCertificates(java.util.List) setDefaultCaCertificates()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#caCertificates() caCertificates()}, {@link com.trolltech.qt.network.QSslSocket#defaultCaCertificates() defaultCaCertificates()}, and {@link com.trolltech.qt.network.QSslSocket#setDefaultCaCertificates(java.util.List) setDefaultCaCertificates()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.network.QSslCertificate> systemCaCertificates();

/**
@exclude
*/

    public static native QSslSocket fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSslSocket(QPrivateConstructor p) { super(p); } 

/**

*/

    protected void connectToHostImplementation(String host, int port, com.trolltech.qt.core.QIODevice.OpenMode mode) {
        connectToHostImplementation(host, (char) port, mode);
    }

/**

*/

    protected void connectToHostImplementation(String host, int port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        connectToHostImplementation(host, (char) port, mode);
    }

/**

*/

    protected void connectToHostImplementation(String host, int port) {
        connectToHostImplementation(host, (char) port);
    }

}
