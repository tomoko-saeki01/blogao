package com.trolltech.qt.network;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QTcpServer class provides a TCP-based server. This class makes it possible to accept incoming TCP connections. You can specify the port or have QTcpServer pick one automatically. You can listen on a specific address or on all the machine's addresses. <p>Call {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()} to have the server listen for incoming connections. The {@link com.trolltech.qt.network.QTcpServer#newConnection newConnection() } signal is then emitted each time a client connects to the server. <p>Call {@link com.trolltech.qt.network.QTcpServer#nextPendingConnection() nextPendingConnection()} to accept the pending connection as a connected {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. The function returns a pointer to a {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} in {@link com.trolltech.qt.network.QAbstractSocket.SocketState QAbstractSocket::ConnectedState } that you can use for communicating with the client. <p>If an error occurs, {@link com.trolltech.qt.network.QTcpServer#serverError() serverError()} returns the type of error, and {@link com.trolltech.qt.network.QTcpServer#errorString() errorString()} can be called to get a human readable description of what happened. <p>When listening for connections, the address and port on which the server is listening are available as {@link com.trolltech.qt.network.QTcpServer#serverAddress() serverAddress()} and {@link com.trolltech.qt.network.QTcpServer#serverPort() serverPort()}. <p>Calling {@link com.trolltech.qt.network.QTcpServer#close() close()} makes QTcpServer stop listening for incoming connections. <p>Although QTcpServer is mostly designed for use with an event loop, it's possible to use it without one. In that case, you must use {@link com.trolltech.qt.network.QTcpServer#waitForNewConnection(int) waitForNewConnection()}, which blocks until either a connection is available or a timeout expires. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, {@link <a href="../network-fortuneserver.html">Fortune Server Example</a>}, {@link <a href="../network-threadedfortuneserver.html">Threaded Fortune Server Example</a>}, {@link <a href="../network-loopback.html">Loopback Example</a>}, and {@link <a href="../network-torrent.html">Torrent Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTcpServer extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted every time a new connection is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#hasPendingConnections() hasPendingConnections()}, and {@link com.trolltech.qt.network.QTcpServer#nextPendingConnection() nextPendingConnection()}. <br></DD></DT>
*/

    public final Signal0 newConnection = new Signal0();

    private final void newConnection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_newConnection(nativeId());
    }
    native void __qt_newConnection(long __this__nativeId);


/**
Constructs a QTcpServer object. <p><tt>parent</tt> is passed to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}, and {@link com.trolltech.qt.network.QTcpServer#setSocketDescriptor(int) setSocketDescriptor()}. <br></DD></DT>
*/

    public QTcpServer() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QTcpServer object. <p><tt>parent</tt> is passed to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}, and {@link com.trolltech.qt.network.QTcpServer#setSocketDescriptor(int) setSocketDescriptor()}. <br></DD></DT>
*/

    public QTcpServer(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTcpServer_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTcpServer_QObject(long parent);

/**
Closes the server. The server will no longer listen for incoming connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_close(nativeId());
    }
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
Returns a human readable description of the last error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#serverError() serverError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns true if the server is currently listening for incoming connections; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isListening()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isListening(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isListening(long __this__nativeId);

    @QtBlockedSlot
    private final boolean listen(com.trolltech.qt.network.QHostAddress address, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_listen_QHostAddress_char(nativeId(), address == null ? 0 : address.nativeId(), port);
    }
    @QtBlockedSlot
    native boolean __qt_listen_QHostAddress_char(long __this__nativeId, long address, char port);

/**
Returns the maximum number of pending accepted connections. The default is 30. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#setMaxPendingConnections(int) setMaxPendingConnections()}, and {@link com.trolltech.qt.network.QTcpServer#hasPendingConnections() hasPendingConnections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int maxPendingConnections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxPendingConnections(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxPendingConnections(long __this__nativeId);

/**
Returns the network proxy for this socket. By default {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy } is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
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
Returns the server's address if the server is listening for connections; otherwise returns {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::Null }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#serverPort() serverPort()}, and {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress serverAddress()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_serverAddress(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_serverAddress(long __this__nativeId);

/**
Returns an error code for the last error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractSocket.SocketError serverError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QAbstractSocket.SocketError.resolve(__qt_serverError(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_serverError(long __this__nativeId);

    @QtBlockedSlot
    private final char serverPort_private()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_serverPort_private(nativeId());
    }
    @QtBlockedSlot
    native char __qt_serverPort_private(long __this__nativeId);

/**
Sets the maximum number of pending accepted connections to <tt>numConnections</tt>. QTcpServer will accept no more than <tt>numConnections</tt> incoming connections before {@link com.trolltech.qt.network.QTcpServer#nextPendingConnection() nextPendingConnection()} is called. By default, the limit is 30 pending connections. <p>Clients may still able to connect after the server has reached its maximum number of pending connections (i.e., {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} can still emit the connected() signal). QTcpServer will stop accepting the new connections, but the operating system may still keep them in queue. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#maxPendingConnections() maxPendingConnections()}, and {@link com.trolltech.qt.network.QTcpServer#hasPendingConnections() hasPendingConnections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaxPendingConnections(int numConnections)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxPendingConnections_int(nativeId(), numConnections);
    }
    @QtBlockedSlot
    native void __qt_setMaxPendingConnections_int(long __this__nativeId, int numConnections);

/**
Sets the explicit network proxy for this socket to <tt>networkProxy</tt>. <p>To disable the use of a proxy for this socket, use the {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::NoProxy } proxy type: <pre class="snippet">
        server.setProxy(new QNetworkProxy(QNetworkProxy.ProxyType.NoProxy, new String(), 0));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#proxy() proxy()}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
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
Sets the socket descriptor this server should use when listening for incoming connections to <tt>socketDescriptor</tt>. Returns true if the socket is set successfully; otherwise returns false. <p>The socket is assumed to be in listening state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#socketDescriptor() socketDescriptor()}, and {@link com.trolltech.qt.network.QTcpServer#isListening() isListening()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(int socketDescriptor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSocketDescriptor_int(nativeId(), socketDescriptor);
    }
    @QtBlockedSlot
    native boolean __qt_setSocketDescriptor_int(long __this__nativeId, int socketDescriptor);

/**
Returns the native socket descriptor the server uses to listen for incoming instructions, or -1 if the server is not listening. <p>If the server is using {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, the returned descriptor may not be usable with native socket functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#setSocketDescriptor(int) setSocketDescriptor()}, and {@link com.trolltech.qt.network.QTcpServer#isListening() isListening()}. <br></DD></DT>
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

    @QtBlockedSlot
    private final boolean waitForNewConnection(int msec, com.trolltech.qt.QNativePointer timedOut)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForNewConnection_int_nativepointer(nativeId(), msec, timedOut);
    }
    @QtBlockedSlot
    native boolean __qt_waitForNewConnection_int_nativepointer(long __this__nativeId, int msec, com.trolltech.qt.QNativePointer timedOut);

/**
Returns true if the server has a pending connection; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#nextPendingConnection() nextPendingConnection()}, and {@link com.trolltech.qt.network.QTcpServer#setMaxPendingConnections(int) setMaxPendingConnections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean hasPendingConnections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasPendingConnections(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasPendingConnections(long __this__nativeId);

/**
This virtual function is called by QTcpServer when a new connection is available. The <tt>socketDescriptor</tt> argument is the native socket descriptor for the accepted connection. <p>The base implementation creates a {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, sets the socket descriptor and then stores the {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} in an internal list of pending connections. Finally {@link com.trolltech.qt.network.QTcpServer#newConnection newConnection() } is emitted. <p>Reimplement this function to alter the server's behavior when a connection is available. <p>If this server is using {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} then the <tt>socketDescriptor</tt> may not be usable with native socket functions, and should only be used with {@link com.trolltech.qt.network.QAbstractSocket#setSocketDescriptor(int, com.trolltech.qt.network.QAbstractSocket.SocketState, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) QTcpSocket::setSocketDescriptor()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#newConnection newConnection() }, and {@link com.trolltech.qt.network.QTcpServer#nextPendingConnection() nextPendingConnection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void incomingConnection(int handle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_incomingConnection_int(nativeId(), handle);
    }
    @QtBlockedSlot
    native void __qt_incomingConnection_int(long __this__nativeId, int handle);

/**
Returns the next pending connection as a connected {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} object. <p>The socket is created as a child of the server, which means that it is automatically deleted when the QTcpServer object is destroyed. It is still a good idea to delete the object explicitly when you are done with it, to avoid wasting memory. <p>0 is returned if this function is called when there are no pending connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#hasPendingConnections() hasPendingConnections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.network.QTcpSocket nextPendingConnection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextPendingConnection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QTcpSocket __qt_nextPendingConnection(long __this__nativeId);

/**
@exclude
*/

    public static native QTcpServer fromNativePointer(QNativePointer nativePointer);

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

    protected QTcpServer(QPrivateConstructor p) { super(p); } 

/**
Tells the server to listen for incoming connections on address
<tt>address</tt> and port <tt>port</tt>. If <tt>port</tt> is 0, a port is chosen
automatically. If <tt>address</tt> is QHostAddress::Any, the server
will listen on all network interfaces.
<p>
Returns true on success; otherwise returns false.
*/

    public final boolean listen(QHostAddress address, int port) {
        return listen(address, (char) port);
    }

/**
Tells the server to listen for incoming connections on address <tt>address</tt> and port <tt>port</tt>. If <tt>port</tt> is 0, a port is chosen automatically. If <tt>address</tt> is {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::Any }, the server will listen on all network interfaces. <p>Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#isListening() isListening()}. <br></DD></DT>
*/

    public final boolean listen(QHostAddress address) {
        return listen(address, '\0');
    }

/**
Tells the server to listen for incoming connections on address <tt>address</tt> and port <tt>port</tt>. If <tt>port</tt> is 0, a port is chosen automatically. If <tt>address</tt> is {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::Any }, the server will listen on all network interfaces. <p>Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer#isListening() isListening()}. <br></DD></DT>
*/

    public final boolean listen() {
        return listen(new com.trolltech.qt.network.QHostAddress(com.trolltech.qt.network.QHostAddress.SpecialAddress.Any));
    }

/**
Returns the server's port if the server is listening for connections;
otherwise, returns 0.
*/

    public final int serverPort() {
        return serverPort_private();
    }

    public enum Result {
        Success, Failure, TimedOut
    }

/**
Waits for at most <tt>msec</tt> milliseconds or until an incoming connection
is available. Returns true if a connection is available; otherwise returns
false.
<p>
This is a blocking function call. Its use is not adviced in a single-threaded
GUI application, since the whole application will stop responding until the
function returns.  waitForNewConnection() is mostly useful when there is no
event loop available.
<p>
The non-blocking alternative is to connect to the newConnection()
signal.
*/

    public final Result waitForNewConnection(int msec) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        boolean success = waitForNewConnection(msec, np);

        return (np.booleanValue() ? Result.TimedOut : (success ? Result.Success : Result.Failure));
    }

/**
This is an overloaded method provided for convenience.

@return
*/

    public final Result waitForNewConnection() {
        return waitForNewConnection(0);
    }

}
