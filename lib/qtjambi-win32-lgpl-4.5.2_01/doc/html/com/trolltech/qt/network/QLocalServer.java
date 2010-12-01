package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QLocalServer class provides a local socket based server. This class makes it possible to accept incoming local socket connections. <p>Call {@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()} to have the server start listening for incoming connections on a specified key. The {@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() } signal is then emitted each time a client connects to the server. <p>Call {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()} to accept the pending connection as a connected {@link com.trolltech.qt.network.QLocalSocket QLocalSocket}. The function returns a pointer to a {@link com.trolltech.qt.network.QLocalSocket QLocalSocket} that can be used for communicating with the client. <p>If an error occurs, {@link com.trolltech.qt.network.QLocalServer#serverError() serverError()} returns the type of error, and {@link com.trolltech.qt.network.QLocalServer#errorString() errorString()} can be called to get a human readable description of what happened. <p>When listening for connections, the name which the server is listening on is available through {@link com.trolltech.qt.network.QLocalServer#serverName() serverName()}. <p>Calling {@link com.trolltech.qt.network.QLocalServer#close() close()} makes QLocalServer stop listening for incoming connections. <p>Although QLocalServer is designed for use with an event loop, it's possible to use it without one. In that case, you must use {@link com.trolltech.qt.network.QLocalServer#waitForNewConnection(int) waitForNewConnection()}, which blocks until either a connection is available or a timeout expires. <p>Note that this feature is not supported on Windows 9x. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket QLocalSocket}, and {@link com.trolltech.qt.network.QTcpServer QTcpServer}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLocalServer extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted every time a new connection is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}, and {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()}. <br></DD></DT>
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
Create a new local socket server with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}. <br></DD></DT>
*/

    public QLocalServer() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Create a new local socket server with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}. <br></DD></DT>
*/

    public QLocalServer(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QLocalServer_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLocalServer_QObject(long parent);

/**
Stop listening for incoming connections. Existing connections are not effected, but any new connections will be refused. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#isListening() isListening()}, and {@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}. <br></DD></DT>
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
Returns the human-readable message appropriate to the current error reported by {@link com.trolltech.qt.network.QLocalServer#serverError() serverError()}. If no suitable string is available, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#serverError() serverError()}. <br></DD></DT>
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
Returns the full path that the server is listening on. <p>Note: This is platform specific <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}, and {@link com.trolltech.qt.network.QLocalServer#serverName() serverName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fullServerName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fullServerName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fullServerName(long __this__nativeId);

/**
Returns true if the server is listening for incoming connections otherwise false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}, and {@link com.trolltech.qt.network.QLocalServer#close() close()}. <br></DD></DT>
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

/**
Tells the server to listen for incoming connections on <tt>name</tt>. If the server is currently listening then it will return false. Return true on success otherwise false. <p><tt>name</tt> can be a single name and QLocalServer will determine the correct platform specific path. {@link com.trolltech.qt.network.QLocalServer#serverName() serverName()} will return the name that is passed into listen. <p>Usually you would just pass in a name like "foo", but on Unix this could also be a path such as "/tmp/foo" and on Windows this could be a pipe path such as "\\.\pipe\foo" <p>Note: On Unix if the server crashes without closing listen will fail with AddressInUseError. To create a new server the file should be removed. On Windows two local servers can listen to the same pipe at the same time, but any connections will go to one of the server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#serverName() serverName()}, {@link com.trolltech.qt.network.QLocalServer#isListening() isListening()}, and {@link com.trolltech.qt.network.QLocalServer#close() close()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean listen(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_listen_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_listen_String(long __this__nativeId, java.lang.String name);

/**
Returns the maximum number of pending accepted connections. The default is 30. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#setMaxPendingConnections(int) setMaxPendingConnections()}, and {@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}. <br></DD></DT>
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
Returns the type of error that occurred last or NoError. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#errorString() errorString()}. <br></DD></DT>
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

/**
Returns the server name if the server is listening for connections; otherwise returns QString() <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#listen(java.lang.String) listen()}, and {@link com.trolltech.qt.network.QLocalServer#fullServerName() fullServerName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String serverName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_serverName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_serverName(long __this__nativeId);

/**
Sets the maximum number of pending accepted connections to <tt>numConnections</tt>. QLocalServer will accept no more than <tt>numConnections</tt> incoming connections before {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()} is called. <p>Note: Even though QLocalServer will stop accepting new connections after it has reached its maximum number of pending connections, the operating system may still keep them in queue which will result in clients signaling that it is connected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#maxPendingConnections() maxPendingConnections()}, and {@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}. <br></DD></DT>
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
Returns true if the server has a pending connection; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()}, and {@link com.trolltech.qt.network.QLocalServer#setMaxPendingConnections(int) setMaxPendingConnections()}. <br></DD></DT>
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
This virtual function is called by QLocalServer when a new connection is available. <tt>socketDescriptor</tt> is the native socket descriptor for the accepted connection. <p>The base implementation creates a {@link com.trolltech.qt.network.QLocalSocket QLocalSocket}, sets the socket descriptor and then stores the {@link com.trolltech.qt.network.QLocalSocket QLocalSocket} in an internal list of pending connections. Finally {@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() } is emitted. <p>Reimplement this function to alter the server's behavior when a connection is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() }, {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()}, and {@link com.trolltech.qt.network.QLocalSocket#setSocketDescriptor(long, com.trolltech.qt.network.QLocalSocket.LocalSocketState, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) QLocalSocket::setSocketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void incomingConnection(long socketDescriptor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_incomingConnection_long(nativeId(), socketDescriptor);
    }
    @QtBlockedSlot
    native void __qt_incomingConnection_long(long __this__nativeId, long socketDescriptor);

/**
Returns the next pending connection as a connected {@link com.trolltech.qt.network.QLocalSocket QLocalSocket} object. <p>The socket is created as a child of the server, which means that it is automatically deleted when the QLocalServer object is destroyed. It is still a good idea to delete the object explicitly when you are done with it, to avoid wasting memory. <p>0 is returned if this function is called when there are no pending connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}, {@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() }, and {@link com.trolltech.qt.network.QLocalServer#incomingConnection(long) incomingConnection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.network.QLocalSocket nextPendingConnection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextPendingConnection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QLocalSocket __qt_nextPendingConnection(long __this__nativeId);

    public native static boolean removeServer(java.lang.String name);

/**
@exclude
*/

    public static native QLocalServer fromNativePointer(QNativePointer nativePointer);

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

    protected QLocalServer(QPrivateConstructor p) { super(p); } 

    public enum Result {
        Success, Failure, TimedOut
    }

/**
Waits for at most <tt>msec</tt> milliseconds or until an incoming connection is available. Returns true if a connection is available; otherwise returns false. If the operation timed out and <tt>timedOut</tt> is not 0, *{@link com.trolltech.qt.network.QLocalServer#waitForNewConnection(int) timedOut} will be set to true. <p>This is a blocking function call. Its use is ill-advised in a single-threaded GUI application, since the whole application will stop responding until the function returns. {@link com.trolltech.qt.network.QLocalServer#waitForNewConnection(int) waitForNewConnection()} is mostly useful when there is no event loop available. <p>The non-blocking alternative is to connect to the {@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() } signal. <p>If msec is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}, and {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()}. <br></DD></DT>
*/

    public final Result waitForNewConnection(int msec) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Boolean);
        boolean success = waitForNewConnection(msec, np);

        return (np.booleanValue() ? Result.TimedOut : (success ? Result.Success : Result.Failure));
    }

/**
Waits for at most <tt>msec</tt> milliseconds or until an incoming connection is available. Returns true if a connection is available; otherwise returns false. If the operation timed out and <tt>timedOut</tt> is not 0, *{@link com.trolltech.qt.network.QLocalServer#waitForNewConnection(int) timedOut} will be set to true. <p>This is a blocking function call. Its use is ill-advised in a single-threaded GUI application, since the whole application will stop responding until the function returns. {@link com.trolltech.qt.network.QLocalServer#waitForNewConnection(int) waitForNewConnection()} is mostly useful when there is no event loop available. <p>The non-blocking alternative is to connect to the {@link com.trolltech.qt.network.QLocalServer#newConnection newConnection() } signal. <p>If msec is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer#hasPendingConnections() hasPendingConnections()}, and {@link com.trolltech.qt.network.QLocalServer#nextPendingConnection() nextPendingConnection()}. <br></DD></DT>
*/

    public final Result waitForNewConnection() {
        return waitForNewConnection(0);
    }

}
