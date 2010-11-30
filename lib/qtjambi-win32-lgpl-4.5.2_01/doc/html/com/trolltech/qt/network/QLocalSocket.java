package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QLocalSocket class provides a local socket. On Windows this is a named pipe and on Unix this this is a local domain socket. <p>If an error occurs, socketError() returns the type of error, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()} can be called to get a human readable description of what happened. <p>Although QLocalSocket is designed for use with an event loop, it's possible to use it without one. In that case, you must use {@link com.trolltech.qt.network.QLocalSocket#waitForConnected() waitForConnected()}, waitForReadyRead(), {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}, and {@link com.trolltech.qt.network.QLocalSocket#waitForDisconnected() waitForDisconnected()} which blocks until the operation is complete or the timeout expires. <p>Note that this feature is not supported on Window 9x. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalServer QLocalServer}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLocalSocket extends com.trolltech.qt.core.QIODevice
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the different states in which a socket can be. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#state() QLocalSocket::state()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum LocalSocketState implements com.trolltech.qt.QtEnumerator {
/**
 The socket is not connected.
*/

        UnconnectedState(0),
/**
 The socket has started establishing a connection.
*/

        ConnectingState(2),
/**
 A connection is established.
*/

        ConnectedState(3),
/**
 The socket is about to close (data may still be waiting to be written).
*/

        ClosingState(6);

        LocalSocketState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocalSocket$LocalSocketState constant with the specified <tt>int</tt>.</brief>
*/

        public static LocalSocketState resolve(int value) {
            return (LocalSocketState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnconnectedState;
            case 2: return ConnectingState;
            case 3: return ConnectedState;
            case 6: return ClosingState;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
The LocalServerError enumeration represents the errors that can occur. The most recent error can be retrieved through a call to {@link com.trolltech.qt.network.QLocalSocket#error() QLocalSocket::error()}.
*/
@QtBlockedEnum
    public enum LocalSocketError implements com.trolltech.qt.QtEnumerator {
/**
 The connection was refused by the peer (or timed out).
*/

        ConnectionRefusedError(0),
/**
 The remote socket closed the connection. Note that the client socket (i.e., this socket) will be closed after the remote close notification has been sent.
*/

        PeerClosedError(1),
/**
 The local socket name was not found.
*/

        ServerNotFoundError(2),
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
 An error occurred with the connection.
*/

        ConnectionError(7),
/**
 The requested socket operation is not supported by the local operating system.
*/

        UnsupportedSocketOperationError(10),
/**
 An unidentified error occurred.
*/

        UnknownSocketError(-1);

        LocalSocketError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocalSocket$LocalSocketError constant with the specified <tt>int</tt>.</brief>
*/

        public static LocalSocketError resolve(int value) {
            return (LocalSocketError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ConnectionRefusedError;
            case 1: return PeerClosedError;
            case 2: return ServerNotFoundError;
            case 3: return SocketAccessError;
            case 4: return SocketResourceError;
            case 5: return SocketTimeoutError;
            case 6: return DatagramTooLargeError;
            case 7: return ConnectionError;
            case 10: return UnsupportedSocketOperationError;
            case -1: return UnknownSocketError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted after {@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()} has been called and a connection has been successfully established. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, and {@link com.trolltech.qt.network.QLocalSocket#disconnected disconnected() }. <br></DD></DT>
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
 This signal is emitted when the socket has been disconnected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, {@link com.trolltech.qt.network.QLocalSocket#disconnectFromServer() disconnectFromServer()}, {@link com.trolltech.qt.network.QLocalSocket#abort() abort()}, and {@link com.trolltech.qt.network.QLocalSocket#connected connected() }. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QLocalSocket$LocalSocketError(named: socketError)&gt;:<p> This signal is emitted after an error occurred. The <tt>socketError</tt> parameter describes the type of error that occurred. <p>{@link com.trolltech.qt.network.QLocalSocket.LocalSocketError QLocalSocket::LocalSocketError } is not a registered metatype, so for queued connections, you will have to register it with Q_DECLARE_METATYPE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#error() error()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QLocalSocket.LocalSocketError> error = new Signal1<com.trolltech.qt.network.QLocalSocket.LocalSocketError>();

    private final void error(com.trolltech.qt.network.QLocalSocket.LocalSocketError socketError)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_LocalSocketError(nativeId(), socketError.value());
    }
    native void __qt_error_LocalSocketError(long __this__nativeId, int socketError);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QLocalSocket$LocalSocketState(named: socketState)&gt;:<p> This signal is emitted whenever QLocalSocket's state changes. The <tt>socketState</tt> parameter is the new state. <p>QLocalSocket::SocketState is not a registered metatype, so for queued connections, you will have to register it with Q_DECLARE_METATYPE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#state() state()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QLocalSocket.LocalSocketState> stateChanged = new Signal1<com.trolltech.qt.network.QLocalSocket.LocalSocketState>();

    private final void stateChanged(com.trolltech.qt.network.QLocalSocket.LocalSocketState socketState)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_LocalSocketState(nativeId(), socketState.value());
    }
    native void __qt_stateChanged_LocalSocketState(long __this__nativeId, int socketState);


/**
Creates a new local socket. The <tt>parent</tt> argument is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QLocalSocket() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a new local socket. The <tt>parent</tt> argument is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QLocalSocket(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QLocalSocket_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLocalSocket_QObject(long parent);

/**
Aborts the current connection and resets the socket. Unlike {@link com.trolltech.qt.network.QLocalSocket#disconnectFromServer() disconnectFromServer()}, this function immediately closes the socket, clearing any pending data in the write buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#disconnectFromServer() disconnectFromServer()}, and {@link com.trolltech.qt.core.QIODevice#close() close()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void connectToServer(java.lang.String name, com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        this.connectToServer(name, new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }

/**
Attempts to make a connection to <tt>name</tt>. <p>The socket is opened in the given <tt>openMode</tt> and first enters {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ConnectingState }. It then attempts to connect to the address or addresses returned by the lookup. Finally, if a connection is established, QLocalSocket enters {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ConnectedState } and emits {@link com.trolltech.qt.network.QLocalSocket#connected connected() }. <p>At any point, the socket can emit {@link com.trolltech.qt.network.QLocalSocket#error() error()} to signal that an error occurred. <p>See also {@link com.trolltech.qt.network.QLocalSocket#state() state()}, {@link com.trolltech.qt.network.QLocalSocket#serverName() serverName()}, and {@link com.trolltech.qt.network.QLocalSocket#waitForConnected() waitForConnected()}.
*/

    @QtBlockedSlot
    public final void connectToServer(java.lang.String name) {
        connectToServer(name, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**
Attempts to make a connection to <tt>name</tt>. <p>The socket is opened in the given <tt>openMode</tt> and first enters {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ConnectingState }. It then attempts to connect to the address or addresses returned by the lookup. Finally, if a connection is established, QLocalSocket enters {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ConnectedState } and emits {@link com.trolltech.qt.network.QLocalSocket#connected connected() }. <p>At any point, the socket can emit {@link com.trolltech.qt.network.QLocalSocket#error() error()} to signal that an error occurred. <p>See also {@link com.trolltech.qt.network.QLocalSocket#state() state()}, {@link com.trolltech.qt.network.QLocalSocket#serverName() serverName()}, and {@link com.trolltech.qt.network.QLocalSocket#waitForConnected() waitForConnected()}.
*/

    @QtBlockedSlot
    public final void connectToServer(java.lang.String name, com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToServer_String_OpenMode(nativeId(), name, openMode.value());
    }
    @QtBlockedSlot
    native void __qt_connectToServer_String_OpenMode(long __this__nativeId, java.lang.String name, int openMode);

/**
Attempts to close the socket. If there is pending data waiting to be written, QLocalSocket will enter {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ClosingState } and wait until all data has been written. Eventually, it will enter {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState UnconnectedState } and emit the disconnectedFromServer() signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void disconnectFromServer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectFromServer(nativeId());
    }
    @QtBlockedSlot
    native void __qt_disconnectFromServer(long __this__nativeId);

/**
Returns the type of error that last occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#state() state()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QLocalSocket.LocalSocketError error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QLocalSocket.LocalSocketError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
This function writes as much as possible from the internal write buffer to the socket, without blocking. If any data was written, this function returns true; otherwise false is returned. <p>Call this function if you need QLocalSocket to start sending buffered data immediately. The number of bytes successfully written depends on the operating system. In most cases, you do not need to call this function, because QLocalSocket will start sending data automatically once control goes back to the event loop. In the absence of an event loop, call {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, and {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}. <br></DD></DT>
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
Returns the server path that the socket is connected to. <p>Note: This is platform specific <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, and {@link com.trolltech.qt.network.QLocalSocket#serverName() serverName()}. <br></DD></DT>
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
Returns true if the socket is valid and ready for use; otherwise returns false. <p>Note: The socket's state must be {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState ConnectedState } before reading and writing can occur. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#state() state()}. <br></DD></DT>
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
Returns the size of the internal read buffer. This limits the amount of data that the client can receive before you call {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}. A read buffer size of 0 (the default) means that the buffer has no size limit, ensuring that no data is lost. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#setReadBufferSize(long) setReadBufferSize()}, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
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
Returns the name of the peer as specified by {@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, or an empty QString if {@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()} has not been called or it failed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, and {@link com.trolltech.qt.network.QLocalSocket#fullServerName() fullServerName()}. <br></DD></DT>
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
Sets the size of QLocalSocket's internal read buffer to be <tt>size</tt> bytes. <p>If the buffer size is limited to a certain size, QLocalSocket won't buffer more than this size of data. Exceptionally, a buffer size of 0 means that the read buffer is unlimited and all incoming data is buffered. This is the default. <p>This option is useful if you only read the data at certain points in time (e.g., in a real-time streaming application) or if you want to protect your socket against receiving too much data, which may eventually cause your application to run out of memory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#readBufferSize() readBufferSize()}, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(long socketDescriptor, com.trolltech.qt.network.QLocalSocket.LocalSocketState socketState, com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        return this.setSocketDescriptor(socketDescriptor, socketState, new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }

/**
Initializes QLocalSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if socketDescriptor is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p>Note: It is not possible to initialize two local sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#socketDescriptor() socketDescriptor()}, {@link com.trolltech.qt.network.QLocalSocket#state() state()}, and {@link com.trolltech.qt.core.QIODevice#openMode() openMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(long socketDescriptor, com.trolltech.qt.network.QLocalSocket.LocalSocketState socketState) {
        return setSocketDescriptor(socketDescriptor, socketState, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }

/**
Initializes QLocalSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if socketDescriptor is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p>Note: It is not possible to initialize two local sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#socketDescriptor() socketDescriptor()}, {@link com.trolltech.qt.network.QLocalSocket#state() state()}, and {@link com.trolltech.qt.core.QIODevice#openMode() openMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(long socketDescriptor) {
        return setSocketDescriptor(socketDescriptor, com.trolltech.qt.network.QLocalSocket.LocalSocketState.ConnectedState, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**
Initializes QLocalSocket with the native socket descriptor <tt>socketDescriptor</tt>. Returns true if socketDescriptor is accepted as a valid socket descriptor; otherwise returns false. The socket is opened in the mode specified by <tt>openMode</tt>, and enters the socket state specified by <tt>socketState</tt>. <p>Note: It is not possible to initialize two local sockets with the same native socket descriptor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#socketDescriptor() socketDescriptor()}, {@link com.trolltech.qt.network.QLocalSocket#state() state()}, and {@link com.trolltech.qt.core.QIODevice#openMode() openMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setSocketDescriptor(long socketDescriptor, com.trolltech.qt.network.QLocalSocket.LocalSocketState socketState, com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSocketDescriptor_long_LocalSocketState_OpenMode(nativeId(), socketDescriptor, socketState.value(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_setSocketDescriptor_long_LocalSocketState_OpenMode(long __this__nativeId, long socketDescriptor, int socketState, int openMode);

/**
Returns the native socket descriptor of the QLocalSocket object if this is available; otherwise returns -1. <p>The socket descriptor is not available when QLocalSocket is in {@link com.trolltech.qt.network.QLocalSocket.LocalSocketState UnconnectedState }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#setSocketDescriptor(long, com.trolltech.qt.network.QLocalSocket.LocalSocketState, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setSocketDescriptor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long socketDescriptor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_socketDescriptor(nativeId());
    }
    @QtBlockedSlot
    native long __qt_socketDescriptor(long __this__nativeId);

/**
Returns the state of the socket. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QLocalSocket.LocalSocketState state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QLocalSocket.LocalSocketState.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);


/**
Waits until the socket is connected, up to <tt>msec</tt> milliseconds. If the connection has been established, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QLocalSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be established: <pre class="snippet">
        socket.connectToServer("market");
        if (socket.waitForConnected(1000))
            System.out.println("Connected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, and {@link com.trolltech.qt.network.QLocalSocket#connected connected() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForConnected() {
        return waitForConnected((int)30000);
    }
/**
Waits until the socket is connected, up to <tt>msec</tt> milliseconds. If the connection has been established, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QLocalSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be established: <pre class="snippet">
        socket.connectToServer("market");
        if (socket.waitForConnected(1000))
            System.out.println("Connected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#connectToServer(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) connectToServer()}, and {@link com.trolltech.qt.network.QLocalSocket#connected connected() }. <br></DD></DT>
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
Waits until the socket has disconnected, up to <tt>msecs</tt> milliseconds. If the connection has been disconnected, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QLocalSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be closed: <pre class="snippet">
        socket.disconnectFromServer();
        if (socket.waitForDisconnected(1000))
            System.out.println("Disconnected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#disconnectFromServer() disconnectFromServer()}, and {@link com.trolltech.qt.core.QIODevice#close() close()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForDisconnected() {
        return waitForDisconnected((int)30000);
    }
/**
Waits until the socket has disconnected, up to <tt>msecs</tt> milliseconds. If the connection has been disconnected, this function returns true; otherwise it returns false. In the case where it returns false, you can call {@link com.trolltech.qt.network.QLocalSocket#error() error()} to determine the cause of the error. <p>The following example waits up to one second for a connection to be closed: <pre class="snippet">
        socket.disconnectFromServer();
        if (socket.waitForDisconnected(1000))
            System.out.println("Disconnected!");
</pre> If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QLocalSocket#disconnectFromServer() disconnectFromServer()}, and {@link com.trolltech.qt.core.QIODevice#close() close()}. <br></DD></DT>
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
    protected int readData(byte[] arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readData_nativepointer_long(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] arg__1);

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
    protected int writeData(byte[] arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeData_nativepointer_long(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] arg__1);

/**
@exclude
*/

    public static native QLocalSocket fromNativePointer(QNativePointer nativePointer);

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

    protected QLocalSocket(QPrivateConstructor p) { super(p); } 
}
