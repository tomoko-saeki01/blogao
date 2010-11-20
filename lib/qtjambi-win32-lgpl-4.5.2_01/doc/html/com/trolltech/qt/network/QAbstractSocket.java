package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QAbstractSocket class provides the base functionality common to all socket types. QAbstractSocket is the base class for {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} and contains all common functionality of these two classes. If you need a socket, you have two options: <ul><li> Instantiate {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} or {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}.</li><li> Create a native socket descriptor, instantiate QAbstractSocket, and call {@link com.trolltech.qt.network.QAbstractSocket#setSocketDescriptor(int, com.trolltech.qt.network.QAbstractSocket.SocketState, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setSocketDescriptor()} to wrap the native socket.</li></ul> TCP (Transmission Control Protocol) is a reliable, stream-oriented, connection-oriented transport protocol. UDP (User Datagram Protocol) is an unreliable, datagram-oriented, connectionless protocol. In practice, this means that TCP is better suited for continuous transmission of data, whereas the more lightweight UDP can be used when reliability isn't important. <p>QAbstractSocket's API unifies most of the differences between the two protocols. For example, although UDP is connectionless, {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()} establishes a virtual connection for UDP sockets, enabling you to use QAbstractSocket in more or less the same way regardless of the underlying protocol. Internally, QAbstractSocket remembers the address and port passed to {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, and functions like {@link com.trolltech.qt.core.QIODevice#read(long) read()} and {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} use these values. <p>At any time, QAbstractSocket has a state (returned by {@link com.trolltech.qt.network.QAbstractSocket#state() state()}). The initial state is {@link com.trolltech.qt.network.QAbstractSocket.SocketState UnconnectedState }. After calling {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, the socket first enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState HostLookupState }. If the host is found, QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectingState } and emits the {@link com.trolltech.qt.network.QAbstractSocket#hostFound hostFound() } signal. When the connection has been established, it enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } and emits {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. If an error occurs at any stage, {@link com.trolltech.qt.network.QAbstractSocket#error() error()} is emitted. Whenever the state changes, {@link com.trolltech.qt.network.QAbstractSocket#stateChanged stateChanged() } is emitted. For convenience, {@link com.trolltech.qt.network.QAbstractSocket#isValid() isValid()} returns true if the socket is ready for reading and writing, but note that the socket's state must be {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } before reading and writing can occur. <p>Read or write data by calling {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, or use the convenience functions {@link com.trolltech.qt.core.QIODevice#readLine() readLine()} and {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}. QAbstractSocket also inherits getChar(), putChar(), and ungetChar() from {@link com.trolltech.qt.core.QIODevice QIODevice}, which work on single bytes. The {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal is emitted when data has been written to the socket (i.e., when the client has read the data). Note that Qt does not limit the write buffer size. You can monitor its size by listening to this signal. <p>The {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal is emitted every time a new chunk of data has arrived. bytesAvailable() then returns the number of bytes that are available for reading. Typically, you would connect the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal to a slot and read all available data there. If you don't read all the data at once, the remaining data will still be available later, and any new incoming data will be appended to QAbstractSocket's internal read buffer. To limit the size of the read buffer, call {@link com.trolltech.qt.network.QAbstractSocket#setReadBufferSize(long) setReadBufferSize()}. <p>To close the socket, call {@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}. QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState QAbstractSocket::ClosingState }. After all pending data has been written to the socket, QAbstractSocket actually closes the socket, enters QAbstractSocket::ClosedState, and emits {@link com.trolltech.qt.network.QAbstractSocket#disconnected disconnected() }. If you want to abort a connection immediately, discarding all pending data, call {@link com.trolltech.qt.network.QAbstractSocket#abort() abort()} instead. If the remote host closes the connection, QAbstractSocket will emit error({@link com.trolltech.qt.network.QAbstractSocket.SocketError QAbstractSocket::RemoteHostClosedError }), during which the socket state will still be {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState }, and then the {@link com.trolltech.qt.network.QAbstractSocket#disconnected disconnected() } signal will be emitted. <p>The port and address of the connected peer is fetched by calling {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()} and {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}. {@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()} returns the host name of the peer, as passed to {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}. {@link com.trolltech.qt.network.QAbstractSocket#localPort() localPort()} and {@link com.trolltech.qt.network.QAbstractSocket#localAddress() localAddress()} return the port and address of the local socket. <p>QAbstractSocket provides a set of functions that suspend the calling thread until certain signals are emitted. These functions can be used to implement blocking sockets: <ul><li> {@link com.trolltech.qt.network.QAbstractSocket#waitForConnected() waitForConnected()} blocks until a connection has been established.</li><li> waitForReadyRead() blocks until new data is available for reading.</li><li> {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} blocks until one payload of data has been written to the socket.</li><li> {@link com.trolltech.qt.network.QAbstractSocket#waitForDisconnected() waitForDisconnected()} blocks until the connection has closed.</li></ul> We show an example: <pre class="snippet">
        int numRead = 0, numReadTotal = 0;
        byte buffer[] = new byte[50];

        while (true) {
            numRead  = socket.read(buffer);

            // do whatever with array

            numReadTotal += numRead;
            if (numRead == 0 && !socket.waitForReadyRead(1000))
                break;
        }
    </pre> If {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()} returns false, the connection has been closed or an error has occurred. <p>Programming with a blocking socket is radically different from programming with a non-blocking socket. A blocking socket doesn't require an event loop and typically leads to simpler code. However, in a GUI application, blocking sockets should only be used in non-GUI threads, to avoid freezing the user interface. See the {@link <a href="../network-fortuneclient.html">network/fortuneclient</a>} and {@link <a href="../network-blockingfortuneclient.html">network/blockingfortuneclient</a>} examples for an overview of both approaches. <p>QAbstractSocket can be used with {@link com.trolltech.qt.core.QTextStream QTextStream} and {@link com.trolltech.qt.core.QDataStream QDataStream}'s stream operators (operator&lt;&lt;() and operator&gt;&gt;()). There is one issue to be aware of, though: You must make sure that enough data is available before attempting to read it using operator&gt;&gt;(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp QFtp}, {@link com.trolltech.qt.network.QHttp QHttp}, and {@link com.trolltech.qt.network.QTcpServer QTcpServer}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAbstractSocket extends com.trolltech.qt.core.QIODevice
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the transport layer protocol. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() QAbstractSocket::socketType()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum SocketType implements com.trolltech.qt.QtEnumerator {
/**
 TCP
*/

        TcpSocket(0),
/**
 UDP
*/

        UdpSocket(1),
/**
 Other than TCP and UDP
*/

        UnknownSocketType(-1);

        SocketType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSocket$SocketType constant with the specified <tt>int</tt>.</brief>
*/

        public static SocketType resolve(int value) {
            return (SocketType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TcpSocket;
            case 1: return UdpSocket;
            case -1: return UnknownSocketType;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the socket errors that can occur. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#error() QAbstractSocket::error()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum SocketError implements com.trolltech.qt.QtEnumerator {
/**
 The connection was refused by the peer (or timed out).
*/

        ConnectionRefusedError(0),
/**
 The remote host closed the connection. Note that the client socket (i.e., this socket) will be closed after the remote close notification has been sent.
*/

        RemoteHostClosedError(1),
/**
 The host address was not found.
*/

        HostNotFoundError(2),
/**
 The socket operation failed because the application lacked the required privileges.
*/

        SocketAccessError(3),
/**
 The local system ran out of resources (e.g., too many sockets).
*/

        SocketResourceError(4),
/**
 The socket operation timed out.
*/

        SocketTimeoutError(5),
/**
 The datagram was larger than the operating system's limit (which can be as low as 8192 bytes).
*/

        DatagramTooLargeError(6),
/**
 An error occurred with the network (e.g., the network cable was accidentally plugged out).
*/

        NetworkError(7),
/**
 The address specified to {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) QUdpSocket::bind()} is already in use and was set to be exclusive.
*/

        AddressInUseError(8),
/**
 The address specified to {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) QUdpSocket::bind()} does not belong to the host.
*/

        SocketAddressNotAvailableError(9),
/**
 The requested socket operation is not supported by the local operating system (e.g., lack of IPv6 support).
*/

        UnsupportedSocketOperationError(10),
/**
 Used by QAbstractSocketEngine only, The last operation attempted has not finished yet (still in progress in the background).
*/

        UnfinishedSocketOperationError(11),
/**
 The socket is using a proxy, and the proxy requires authentication.
*/

        ProxyAuthenticationRequiredError(12),
/**
 The SSL/TLS handshake failed, so the connection was closed (only used in {@link com.trolltech.qt.network.QSslSocket QSslSocket})
*/

        SslHandshakeFailedError(13),
/**
 Could not contact the proxy server because the connection to that server was denied
*/

        ProxyConnectionRefusedError(14),
/**
 The connection to the proxy server was closed unexpectedly (before the connection to the final peer was established)
*/

        ProxyConnectionClosedError(15),
/**
 The connection to the proxy server timed out or the proxy server stopped responding in the authentication phase.
*/

        ProxyConnectionTimeoutError(16),
/**
 The proxy address set with {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()} (or the application proxy) was not found.
*/

        ProxyNotFoundError(17),
/**
 The connection negotiation with the proxy server because the response from the proxy server could not be understood.
*/

        ProxyProtocolError(18),
/**
 An unidentified error occurred.
*/

        UnknownSocketError(-1);

        SocketError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSocket$SocketError constant with the specified <tt>int</tt>.</brief>
*/

        public static SocketError resolve(int value) {
            return (SocketError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ConnectionRefusedError;
            case 1: return RemoteHostClosedError;
            case 2: return HostNotFoundError;
            case 3: return SocketAccessError;
            case 4: return SocketResourceError;
            case 5: return SocketTimeoutError;
            case 6: return DatagramTooLargeError;
            case 7: return NetworkError;
            case 8: return AddressInUseError;
            case 9: return SocketAddressNotAvailableError;
            case 10: return UnsupportedSocketOperationError;
            case 11: return UnfinishedSocketOperationError;
            case 12: return ProxyAuthenticationRequiredError;
            case 13: return SslHandshakeFailedError;
            case 14: return ProxyConnectionRefusedError;
            case 15: return ProxyConnectionClosedError;
            case 16: return ProxyConnectionTimeoutError;
            case 17: return ProxyNotFoundError;
            case 18: return ProxyProtocolError;
            case -1: return UnknownSocketError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the network layer protocol values used in Qt. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#protocol() QHostAddress::protocol()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum NetworkLayerProtocol implements com.trolltech.qt.QtEnumerator {
/**
 IPv4
*/

        IPv4Protocol(0),
/**
 IPv6
*/

        IPv6Protocol(1),
/**
 Other than IPv4 and IPv6
*/

        UnknownNetworkLayerProtocol(-1);

        NetworkLayerProtocol(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSocket$NetworkLayerProtocol constant with the specified <tt>int</tt>.</brief>
*/

        public static NetworkLayerProtocol resolve(int value) {
            return (NetworkLayerProtocol) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return IPv4Protocol;
            case 1: return IPv6Protocol;
            case -1: return UnknownNetworkLayerProtocol;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the different states in which a socket can be. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() QAbstractSocket::state()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum SocketState implements com.trolltech.qt.QtEnumerator {
/**
 The socket is not connected.
*/

        UnconnectedState(0),
/**
 The socket is performing a host name lookup.
*/

        HostLookupState(1),
/**
 The socket has started establishing a connection.
*/

        ConnectingState(2),
/**
 A connection is established.
*/

        ConnectedState(3),
/**
 The socket is bound to an address and port (for servers).
*/

        BoundState(4),
/**
 For internal use only.
*/

        ListeningState(5),
/**
 The socket is about to close (data may still be waiting to be written).
*/

        ClosingState(6);

        SocketState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractSocket$SocketState constant with the specified <tt>int</tt>.</brief>
*/

        public static SocketState resolve(int value) {
            return (SocketState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnconnectedState;
            case 1: return HostLookupState;
            case 2: return ConnectingState;
            case 3: return ConnectedState;
            case 4: return BoundState;
            case 5: return ListeningState;
            case 6: return ClosingState;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted after {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()} has been called and a connection has been successfully established. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, and {@link com.trolltech.qt.network.QAbstractSocket#disconnected disconnected() }. <br></DD></DT>
*/

    public final Signal0 connected = new Signal0();

    private final void connected()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connected(nativeId());
    }
    native void __qt_connected(long __this__nativeId);
/**
 This signal is emitted when the socket has been disconnected. <p><b>Warning:</b> If you need to delete the sender() of this signal in a slot connected to it, use the deleteLater() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, {@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}, and {@link com.trolltech.qt.network.QAbstractSocket#abort() abort()}. <br></DD></DT>
*/

    public final Signal0 disconnected = new Signal0();

    private final void disconnected()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnected(nativeId());
    }
    native void __qt_disconnected(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QAbstractSocket$SocketError(named: socketError)&gt;:<p> This signal is emitted after an error occurred. The <tt>socketError</tt> parameter describes the type of error that occurred. <p>{@link com.trolltech.qt.network.QAbstractSocket.SocketError QAbstractSocket::SocketError } is not a registered metatype, so for queued connections, you will have to register it with Q_REGISTER_METATYPE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#error() error()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QAbstractSocket.SocketError> error = new Signal1<com.trolltech.qt.network.QAbstractSocket.SocketError>();

    private final void error(com.trolltech.qt.network.QAbstractSocket.SocketError arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_SocketError(nativeId(), arg__1.value());
    }
    native void __qt_error_SocketError(long __this__nativeId, int arg__1);
/**
 This signal is emitted after {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()} has been called and the host lookup has succeeded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <br></DD></DT>
*/

    public final Signal0 hostFound = new Signal0();

    private final void hostFound()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hostFound(nativeId());
    }
    native void __qt_hostFound(long __this__nativeId);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkProxy(named: proxy), com.trolltech.qt.QNativePointer(named: authenticator)&gt;:<p> This signal can be emitted when a <tt>proxy</tt> that requires authentication is used. The <tt>authenticator</tt> object can then be filled in with the required details to allow authentication and continue the connection. <p><b>Note:</b> It is not possible to use a QueuedConnection to connect to this signal, as the connection will fail if the authenticator has not been filled in with new information when the signal returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator QAuthenticator}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/

    private final Signal2<com.trolltech.qt.network.QNetworkProxy, com.trolltech.qt.QNativePointer> proxyAuthenticationRequiredPrivate = new Signal2<com.trolltech.qt.network.QNetworkProxy, com.trolltech.qt.QNativePointer>();

    private final void proxyAuthenticationRequiredPrivate(com.trolltech.qt.network.QNetworkProxy proxy, com.trolltech.qt.QNativePointer authenticator)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_proxyAuthenticationRequiredPrivate_QNetworkProxy_nativepointer(nativeId(), proxy == null ? 0 : proxy.nativeId(), authenticator);
    }
    native void __qt_proxyAuthenticationRequiredPrivate_QNetworkProxy_nativepointer(long __this__nativeId, long proxy, com.trolltech.qt.QNativePointer authenticator);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QAbstractSocket$SocketState(named: socketState)&gt;:<p> This signal is emitted whenever QAbstractSocket's state changes. The <tt>socketState</tt> parameter is the new state. <p>{@link com.trolltech.qt.network.QAbstractSocket.SocketState QAbstractSocket::SocketState } is not a registered metatype, so for queued connections, you will have to register it with Q_REGISTER_METATYPE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QAbstractSocket.SocketState> stateChanged = new Signal1<com.trolltech.qt.network.QAbstractSocket.SocketState>();

    private final void stateChanged(com.trolltech.qt.network.QAbstractSocket.SocketState arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_SocketState(nativeId(), arg__1.value());
    }
    native void __qt_stateChanged_SocketState(long __this__nativeId, int arg__1);

/**
Creates a new abstract socket of type <tt>socketType</tt>. The <tt>parent</tt> argument is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() socketType()}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}. <br></DD></DT>
*/

    public QAbstractSocket(com.trolltech.qt.network.QAbstractSocket.SocketType socketType, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractSocket_SocketType_QObject(socketType.value(), parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        proxyAuthenticationRequiredPrivate.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QAbstractSocket_SocketType_QObject(int socketType, long parent);

/**
Aborts the current connection and resets the socket. Unlike {@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}, this function immediately closes the socket, discarding any pending data in the write buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}, and close(). <br></DD></DT>
*/

    @QtBlockedSlot
    public void abort()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_abort(nativeId());
    }
    @QtBlockedSlot
    native void __qt_abort(long __this__nativeId);


    @QtBlockedSlot
    private final void connectToHost(com.trolltech.qt.network.QHostAddress address, char port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.connectToHost(address, port, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

    @QtBlockedSlot
    private final void connectToHost(com.trolltech.qt.network.QHostAddress address, char port) {
        connectToHost(address, port, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
    @QtBlockedSlot
    private final void connectToHost(com.trolltech.qt.network.QHostAddress address, char port, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToHost_QHostAddress_char_OpenMode(nativeId(), address == null ? 0 : address.nativeId(), port, mode.value());
    }
    @QtBlockedSlot
    native void __qt_connectToHost_QHostAddress_char_OpenMode(long __this__nativeId, long address, char port, int mode);


    @QtBlockedSlot
    private final void connectToHost(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.connectToHost(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

    @QtBlockedSlot
    private final void connectToHost(java.lang.String hostName, char port) {
        connectToHost(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
    @QtBlockedSlot
    private final void connectToHost(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToHost_String_char_OpenMode(nativeId(), hostName, port, mode.value());
    }
    @QtBlockedSlot
    native void __qt_connectToHost_String_char_OpenMode(long __this__nativeId, java.lang.String hostName, char port, int mode);


    private final void connectToHostImplementation(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.connectToHostImplementation(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

    private final void connectToHostImplementation(java.lang.String hostName, char port) {
        connectToHostImplementation(hostName, port, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
    private final void connectToHostImplementation(java.lang.String hostName, char port, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToHostImplementation_String_char_OpenMode(nativeId(), hostName, port, mode.value());
    }
    native void __qt_connectToHostImplementation_String_char_OpenMode(long __this__nativeId, java.lang.String hostName, char port, int mode);

/**
Attempts to close the socket. If there is pending data waiting to be written, QAbstractSocket will enter {@link com.trolltech.qt.network.QAbstractSocket.SocketState ClosingState } and wait until all data has been written. Eventually, it will enter {@link com.trolltech.qt.network.QAbstractSocket.SocketState UnconnectedState } and emit the {@link com.trolltech.qt.network.QAbstractSocket#disconnected disconnected() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void disconnectFromHost()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectFromHost(nativeId());
    }
    @QtBlockedSlot
    native void __qt_disconnectFromHost(long __this__nativeId);

/**
Contains the implementation of {@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}.
*/

    protected void disconnectFromHostImplementation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectFromHostImplementation(nativeId());
    }
    native void __qt_disconnectFromHostImplementation(long __this__nativeId);

/**
Returns the type of error that last occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractSocket.SocketError error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QAbstractSocket.SocketError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
This function writes as much as possible from the internal write buffer to the underlying network socket, without blocking. If any data was written, this function returns true; otherwise false is returned. <p>Call this function if you need QAbstractSocket to start sending buffered data immediately. The number of bytes successfully written depends on the operating system. In most cases, you do not need to call this function, because QAbstractSocket will start sending data automatically once control goes back to the event loop. In the absence of an event loop, call {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, and {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean flush()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_flush(long __this__nativeId);

/**
Returns true if the socket is valid and ready for use; otherwise returns false. <p><b>Note:</b> The socket's state must be {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } before reading and writing can occur. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the host address of the local socket if available; otherwise returns {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::Null }. <p>This is normally the main IP address of the host, but can be {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::LocalHost } (127.0.0.1) for connections to the local host. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#localPort() localPort()}, {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, and {@link com.trolltech.qt.network.QAbstractSocket#setLocalAddress(com.trolltech.qt.network.QHostAddress) setLocalAddress()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress localAddress()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localAddress(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_localAddress(long __this__nativeId);

    @QtBlockedSlot
    private final char localPort_private()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localPort_private(nativeId());
    }
    @QtBlockedSlot
    native char __qt_localPort_private(long __this__nativeId);

/**
Returns the address of the connected peer if the socket is in {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState }; otherwise returns {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::Null }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()}, {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()}, {@link com.trolltech.qt.network.QAbstractSocket#localAddress() localAddress()}, and {@link com.trolltech.qt.network.QAbstractSocket#setPeerAddress(com.trolltech.qt.network.QHostAddress) setPeerAddress()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress peerAddress()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerAddress(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_peerAddress(long __this__nativeId);

/**
Returns the name of the peer as specified by {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, or an empty QString if {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()} has not been called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#setPeerName(java.lang.String) setPeerName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String peerName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_peerName(long __this__nativeId);

    @QtBlockedSlot
    private final char peerPort_private()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerPort_private(nativeId());
    }
    @QtBlockedSlot
    native char __qt_peerPort_private(long __this__nativeId);

/**
Returns the network proxy for this socket. By default {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy } is used, which means this socket will query the default proxy settings for the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, and {@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkProxy proxy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_proxy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkProxy __qt_proxy(long __this__nativeId);

/**
Returns the size of the internal read buffer. This limits the amount of data that the client can receive before you call {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}. <p>A read buffer size of 0 (the default) means that the buffer has no size limit, ensuring that no data is lost. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#setReadBufferSize(long) setReadBufferSize()}, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long readBufferSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readBufferSize(nativeId());
    }
    @QtBlockedSlot
    native long __qt_readBufferSize(long __this__nativeId);

/**
Sets the address on the local side of a connection to <tt>address</tt>. <p>You can call this function in a subclass of QAbstractSocket to change the return value of the {@link com.trolltech.qt.network.QAbstractSocket#localAddress() localAddress()} function after a connection has been established. This feature is commonly used by proxy connections for virtual connection settings. <p>Note that this function does not bind the local address of the socket prior to a connection (e.g., {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) QUdpSocket::bind()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#localAddress() localAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#setLocalPort(int) setLocalPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#setPeerAddress(com.trolltech.qt.network.QHostAddress) setPeerAddress()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setLocalAddress(com.trolltech.qt.network.QHostAddress address)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalAddress_QHostAddress(nativeId(), address == null ? 0 : address.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocalAddress_QHostAddress(long __this__nativeId, long address);

    @QtBlockedSlot
    private final void setLocalPort(char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalPort_char(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setLocalPort_char(long __this__nativeId, char port);

/**
Sets the address of the remote side of the connection to <tt>address</tt>. <p>You can call this function in a subclass of QAbstractSocket to change the return value of the {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()} function after a connection has been established. This feature is commonly used by proxy connections for virtual connection settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#setPeerPort(int) setPeerPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#setLocalAddress(com.trolltech.qt.network.QHostAddress) setLocalAddress()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setPeerAddress(com.trolltech.qt.network.QHostAddress address)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerAddress_QHostAddress(nativeId(), address == null ? 0 : address.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPeerAddress_QHostAddress(long __this__nativeId, long address);

/**
Sets the host name of the remote peer to <tt>name</tt>. <p>You can call this function in a subclass of QAbstractSocket to change the return value of the {@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()} function after a connection has been established. This feature is commonly used by proxy connections for virtual connection settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setPeerName(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setPeerName_String(long __this__nativeId, java.lang.String name);

    @QtBlockedSlot
    private final void setPeerPort(char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerPort_char(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setPeerPort_char(long __this__nativeId, char port);

/**
Sets the explicit network proxy for this socket to <tt>networkProxy</tt>. <p>To disable the use of a proxy for this socket, use the {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::NoProxy } proxy type:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;setProxy(QNetworkProxy::NoProxy);
</pre> The default value for the proxy is {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy }, which means the socket will use the application settings: if a proxy is set with QNetworkProxy::setApplicationProxy, it will use that; otherwise, if a factory is set with QNetworkProxyFactory::setApplicationProxyFactory, it will query that factory with type {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#proxy() proxy()}, {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, and {@link com.trolltech.qt.network.QNetworkProxyFactory#queryProxy() QNetworkProxyFactory::queryProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProxy(com.trolltech.qt.network.QNetworkProxy networkProxy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProxy_QNetworkProxy(nativeId(), networkProxy == null ? 0 : networkProxy.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setProxy_QNetworkProxy(long __this__nativeId, long networkProxy);

/**
Sets the size of QAbstractSocket's internal read buffer to be <tt>size</tt> bytes. <p>If the buffer size is limited to a certain size, QAbstractSocket won't buffer more than this size of data. Exceptionally, a buffer size of 0 means that the read buffer is unlimited and all incoming data is buffered. This is the default. <p>This option is useful if you only read the data at certain points in time (e.g., in a real-time streaming application) or if you want to protect your socket against receiving too much data, which may eventually cause your application to run out of memory. <p>Only {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} uses QAbstractSocket's internal buffer; {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} does not use any buffering at all, but rather relies on the implicit buffering provided by the operating system. Because of this, calling this function on {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#readBufferSize() readBufferSize()}, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setReadBufferSize(long size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadBufferSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setReadBufferSize_long(long __this__nativeId, long size);


/**

*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(int socketDescriptor, com.trolltech.qt.network.QAbstractSocket.SocketState state, com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        return this.setSocketDescriptor(socketDescriptor, state, new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }

/**
Initializes QAbstractSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if <tt>socketDescriptor</tt> is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p><b>Note:</b> It is not possible to initialize two abstract sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketDescriptor() socketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(int socketDescriptor, com.trolltech.qt.network.QAbstractSocket.SocketState state) {
        return setSocketDescriptor(socketDescriptor, state, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }

/**
Initializes QAbstractSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if <tt>socketDescriptor</tt> is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p><b>Note:</b> It is not possible to initialize two abstract sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketDescriptor() socketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(int socketDescriptor) {
        return setSocketDescriptor(socketDescriptor, com.trolltech.qt.network.QAbstractSocket.SocketState.ConnectedState, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**
Initializes QAbstractSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if <tt>socketDescriptor</tt> is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p><b>Note:</b> It is not possible to initialize two abstract sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketDescriptor() socketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean setSocketDescriptor(int socketDescriptor, com.trolltech.qt.network.QAbstractSocket.SocketState state, com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSocketDescriptor_int_SocketState_OpenMode(nativeId(), socketDescriptor, state.value(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_setSocketDescriptor_int_SocketState_OpenMode(long __this__nativeId, int socketDescriptor, int state, int openMode);

/**
Sets the type of error that last occurred to <tt>socketError</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#setSocketState(com.trolltech.qt.network.QAbstractSocket.SocketState) setSocketState()}, and {@link com.trolltech.qt.core.QIODevice#setErrorString(java.lang.String) setErrorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setSocketError(com.trolltech.qt.network.QAbstractSocket.SocketError socketError)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSocketError_SocketError(nativeId(), socketError.value());
    }
    @QtBlockedSlot
    native void __qt_setSocketError_SocketError(long __this__nativeId, int socketError);

/**
Sets the state of the socket to <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setSocketState(com.trolltech.qt.network.QAbstractSocket.SocketState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSocketState_SocketState(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setSocketState_SocketState(long __this__nativeId, int state);

/**
Returns the native socket descriptor of the QAbstractSocket object if this is available; otherwise returns -1. <p>If the socket is using {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, the returned descriptor may not be usable with native socket functions. <p>The socket descriptor is not available when QAbstractSocket is in {@link com.trolltech.qt.network.QAbstractSocket.SocketState UnconnectedState }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#setSocketDescriptor(int, com.trolltech.qt.network.QAbstractSocket.SocketState, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setSocketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int socketDescriptor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_socketDescriptor(nativeId());
    }
    @QtBlockedSlot
    native int __qt_socketDescriptor(long __this__nativeId);

/**
Returns the socket type (TCP, UDP, or other). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractSocket.SocketType socketType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QAbstractSocket.SocketType.resolve(__qt_socketType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_socketType(long __this__nativeId);

/**
Returns the state of the socket. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractSocket.SocketState state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QAbstractSocket.SocketState.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);


/**
Waits until the socket is connected, up to <tt>msecs</tt> milliseconds. If the connection has been established, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be established:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;connectToHost("imap", 143);
if (socket-&gt;waitForConnected(1000))
    qDebug("Connected!");
</pre> If msecs is -1, this function will not time out. <p>Note: This function may wait slightly longer than <tt>msecs</tt>, depending on the time it takes to complete the host lookup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, and {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForConnected() {
        return waitForConnected((int)30000);
    }
/**
Waits until the socket is connected, up to <tt>msecs</tt> milliseconds. If the connection has been established, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be established:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;connectToHost("imap", 143);
if (socket-&gt;waitForConnected(1000))
    qDebug("Connected!");
</pre> If msecs is -1, this function will not time out. <p>Note: This function may wait slightly longer than <tt>msecs</tt>, depending on the time it takes to complete the host lookup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, and {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean waitForConnected(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForConnected_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForConnected_int(long __this__nativeId, int msecs);


/**
Waits until the socket has disconnected, up to <tt>msecs</tt> milliseconds. If the connection has been disconnected, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be closed:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;disconnectFromHost();
    if (socket-&gt;state() == QAbstractSocket::UnconnectedState || 
        socket-&gt;waitForDisconnected(1000))
        qDebug("Disconnected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}, and close(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForDisconnected() {
        return waitForDisconnected((int)30000);
    }
/**
Waits until the socket has disconnected, up to <tt>msecs</tt> milliseconds. If the connection has been disconnected, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be closed:<br><br>The following code example is written in c++.<br> <pre class="snippet">
socket-&gt;disconnectFromHost();
    if (socket-&gt;state() == QAbstractSocket::UnconnectedState || 
        socket-&gt;waitForDisconnected(1000))
        qDebug("Disconnected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#disconnectFromHost() disconnectFromHost()}, and close(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean waitForDisconnected(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForDisconnected_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForDisconnected_int(long __this__nativeId, int msecs);

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
    public boolean isSequential()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSequential(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSequential(long __this__nativeId);

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
    protected int readLineData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLineData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readLineData_nativepointer_long(long __this__nativeId, byte[] data);

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
@exclude
*/

    public static native QAbstractSocket fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractSocket(QPrivateConstructor p) { super(p); } 

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkProxy(named: proxy), com.trolltech.qt.network.QAuthenticator(named: authenticator)&gt;:<p> This signal can be emitted when a <tt>proxy</tt> that requires authentication is used. The <tt>authenticator</tt> object can then be filled in with the required details to allow authentication and continue the connection. <p><b>Note:</b> It is not possible to use a QueuedConnection to connect to this signal, as the connection will fail if the authenticator has not been filled in with new information when the signal returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator QAuthenticator}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/

    public Signal2<QNetworkProxy, QAuthenticator> proxyAuthenticationRequired = new Signal2<QNetworkProxy, QAuthenticator>();
    private boolean inEmission = false;

    private void emitProxyAuthenticationRequiredPrivate(QNetworkProxy proxy, QAuthenticator authenticator) {
        if (!inEmission) {
            inEmission = true;
            proxyAuthenticationRequiredPrivate.emit(proxy, authenticator.nativePointer());
            inEmission = false;
        }
    }

    private void emitProxyAuthenticationRequired(QNetworkProxy proxy, QNativePointer authenticator) {
        if (!inEmission) {
            inEmission = true;
            proxyAuthenticationRequired.emit(proxy, QAuthenticator.fromNativePointer(authenticator));
            inEmission = false;
        }
    }

/**
Attempts to make a connection to <tt>hostName</tt> on the given <tt>port</tt>. <p>The socket is opened in the given <tt>openMode</tt> and first enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState HostLookupState }, then performs a host name lookup of <tt>hostName</tt>. If the lookup succeeds, {@link com.trolltech.qt.network.QAbstractSocket#hostFound hostFound() } is emitted and QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectingState }. It then attempts to connect to the address or addresses returned by the lookup. Finally, if a connection is established, QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } and emits {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <p>At any point, the socket can emit {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to signal that an error occurred. <p><tt>hostName</tt> may be an IP address in string form (e.g., "43.195.83.32"), or it may be a host name (e.g., "www.trolltech.com"). QAbstractSocket will do a lookup only if required. <tt>port</tt> is in native byte order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}, {@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()}, {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#waitForConnected() waitForConnected()}. <br></DD></DT>
*/

    public final void connectToHost(String host, int port, com.trolltech.qt.core.QIODevice.OpenMode mode) {
        connectToHost(host, (char) port, mode);
    }

/**
Attempts to make a connection to <tt>hostName</tt> on the given <tt>port</tt>. <p>The socket is opened in the given <tt>openMode</tt> and first enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState HostLookupState }, then performs a host name lookup of <tt>hostName</tt>. If the lookup succeeds, {@link com.trolltech.qt.network.QAbstractSocket#hostFound hostFound() } is emitted and QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectingState }. It then attempts to connect to the address or addresses returned by the lookup. Finally, if a connection is established, QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } and emits {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <p>At any point, the socket can emit {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to signal that an error occurred. <p><tt>hostName</tt> may be an IP address in string form (e.g., "43.195.83.32"), or it may be a host name (e.g., "www.trolltech.com"). QAbstractSocket will do a lookup only if required. <tt>port</tt> is in native byte order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}, {@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()}, {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#waitForConnected() waitForConnected()}. <br></DD></DT>
*/

    public final void connectToHost(String host, int port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        connectToHost(host, (char) port, mode);
    }

/**
Attempts to make a connection to <tt>hostName</tt> on the given <tt>port</tt>. <p>The socket is opened in the given <tt>openMode</tt> and first enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState HostLookupState }, then performs a host name lookup of <tt>hostName</tt>. If the lookup succeeds, {@link com.trolltech.qt.network.QAbstractSocket#hostFound hostFound() } is emitted and QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectingState }. It then attempts to connect to the address or addresses returned by the lookup. Finally, if a connection is established, QAbstractSocket enters {@link com.trolltech.qt.network.QAbstractSocket.SocketState ConnectedState } and emits {@link com.trolltech.qt.network.QAbstractSocket#connected connected() }. <p>At any point, the socket can emit {@link com.trolltech.qt.network.QAbstractSocket#error() error()} to signal that an error occurred. <p><tt>hostName</tt> may be an IP address in string form (e.g., "43.195.83.32"), or it may be a host name (e.g., "www.trolltech.com"). QAbstractSocket will do a lookup only if required. <tt>port</tt> is in native byte order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#state() state()}, {@link com.trolltech.qt.network.QAbstractSocket#peerName() peerName()}, {@link com.trolltech.qt.network.QAbstractSocket#peerAddress() peerAddress()}, {@link com.trolltech.qt.network.QAbstractSocket#peerPort() peerPort()}, and {@link com.trolltech.qt.network.QAbstractSocket#waitForConnected() waitForConnected()}. <br></DD></DT>
*/

    public final void connectToHost(String host, int port) {
        connectToHost(host, (char) port);
    }

/**
Attempts to make a connection to <tt>address</tt> on port <tt>port</tt>.
*/

    public final void connectToHost(QHostAddress host, int port, com.trolltech.qt.core.QIODevice.OpenMode mode) {
        connectToHost(host, (char) port, mode);
    }

/**
Attempts to make a connection to <tt>address</tt> on port <tt>port</tt>.
*/

    public final void connectToHost(QHostAddress host, int port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        connectToHost(host, (char) port, mode);
    }

/**
Attempts to make a connection to <tt>address</tt> on port <tt>port</tt>.
*/

    public final void connectToHost(QHostAddress host, int port)
    {
        connectToHost(host, (char) port);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void connectToHostImplementation(String host, int port, com.trolltech.qt.core.QIODevice.OpenMode mode) {
        connectToHostImplementation(host, (char) port, mode);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void connectToHostImplementation(String host, int port, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        connectToHostImplementation(host, (char) port, mode);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void connectToHostImplementation(String host, int port) {
        connectToHostImplementation(host, (char) port);
    }

/**
Returns the host port number (in native byte order) of the local
socket if available; otherwise returns 0.
*/

    public final int localPort()
    {
        return localPort_private();
    }

/**
Returns the port of the connected peer if the socket is in
ConnectedState; otherwise returns 0.
*/

    public final int peerPort() {
        return peerPort_private();
    }

/**
Sets the local port of this QAbstractSocket to <tt>port</tt>.
*/

    protected final void setLocalPort(int port) {
        setLocalPort((char) port);
    }

/**
Sets the peer port of this QAbstractSocket to <tt>port</tt>.
*/

    protected final void setPeerPort(int port) {
        setPeerPort((char) port);
    }

}
