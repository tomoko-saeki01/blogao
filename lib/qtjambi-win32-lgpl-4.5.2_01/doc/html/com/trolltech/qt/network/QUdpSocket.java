package com.trolltech.qt.network;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QUdpSocket class provides a UDP socket. UDP (User Datagram Protocol) is a lightweight, unreliable, datagram-oriented, connectionless protocol. It can be used when reliability isn't important. QUdpSocket is a subclass of {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket} that allows you to send and receive UDP datagrams. <p>The most common way to use this class is to bind to an address and port using {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) bind()}, then call {@link com.trolltech.qt.network.QUdpSocket#writeDatagram(byte[], com.trolltech.qt.network.QHostAddress, int) writeDatagram()} and {@link com.trolltech.qt.network.QUdpSocket#readDatagram(byte[], com.trolltech.qt.network.QUdpSocket.HostInfo) readDatagram()} to transfer data. If you want to use the standard {@link com.trolltech.qt.core.QIODevice QIODevice} functions {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, etc., you must first connect the socket directly to a peer by calling {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}. <p>The socket emits the {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal every time a datagram is written to the network. If you just want to send datagrams, you don't need to call {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) bind()}. <p>The {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal is emitted whenever datagrams arrive. In that case, {@link com.trolltech.qt.network.QUdpSocket#hasPendingDatagrams() hasPendingDatagrams()} returns true. Call {@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()} to obtain the size of the first pending datagram, and {@link com.trolltech.qt.network.QUdpSocket#readDatagram(byte[], com.trolltech.qt.network.QUdpSocket.HostInfo) readDatagram()} to read it. <p>Example: <pre class="snippet">
    public class Server extends QObject {
    private QUdpSocket udpSocket;

        public void initSocket()
        {
            udpSocket = new QUdpSocket(this);
            udpSocket.bind(new QHostAddress(QHostAddress.SpecialAddress.LocalHost), 7755);

            udpSocket.readyRead.connect(this, "readPendingDatagrams()");
        }

        public void readPendingDatagrams()
        {
            while (udpSocket.hasPendingDatagrams()) {
                byte[] datagram = new byte[(int)udpSocket.pendingDatagramSize()];
        QUdpSocket.HostInfo senderInfo = new QUdpSocket.HostInfo();

                udpSocket.readDatagram(datagram, senderInfo);

                // process the datagram
            }
        }
    }
</pre> With QUdpSocket, you can also establish a virtual connection to a UDP server using {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()} and then use {@link com.trolltech.qt.core.QIODevice#read(long) read()} and {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} to exchange datagrams without specifying the receiver for each datagram. <p>The {@link <a href="../network-broadcastsender.html">Broadcast Sender</a>} and {@link <a href="../network-broadcastreceiver.html">Broadcast Receiver</a>} examples illustrate how to use QUdpSocket in applications. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QUdpSocket extends com.trolltech.qt.network.QAbstractSocket
{
    
/**
This enum describes the different flags you can pass to modify the behavior of {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) QUdpSocket::bind()}.
*/
@QtBlockedEnum
    public enum BindFlag implements com.trolltech.qt.QtEnumerator {
/**
 The default option for the current platform. On Unix and Mac OS X, this is equivalent to ({@link com.trolltech.qt.network.QUdpSocket.BindFlag DontShareAddress } + {@link com.trolltech.qt.network.QUdpSocket.BindFlag ReuseAddressHint }), and on Windows, its equivalent to {@link com.trolltech.qt.network.QUdpSocket.BindFlag ShareAddress }.
*/

        DefaultForPlatform(0),
/**
 Allow other services to bind to the same address and port. This is useful when multiple processes share the load of a single service by listening to the same address and port (e.g., a web server with several pre-forked listeners can greatly improve response time). However, because any service is allowed to rebind, this option is subject to certain security considerations. Note that by combining this option with {@link com.trolltech.qt.network.QUdpSocket.BindFlag ReuseAddressHint }, you will also allow your service to rebind an existing shared address. On Unix, this is equivalent to the SO_REUSEADDR socket option. On Windows, this option is ignored.
*/

        ShareAddress(1),
/**
 Bind the address and port exclusively, so that no other services are allowed to rebind. By passing this option to {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) QUdpSocket::bind()}, you are guaranteed that on successs, your service is the only one that listens to the address and port. No services are allowed to rebind, even if they pass {@link com.trolltech.qt.network.QUdpSocket.BindFlag ReuseAddressHint }. This option provides more security than {@link com.trolltech.qt.network.QUdpSocket.BindFlag ShareAddress }, but on certain operating systems, it requires you to run the server with administrator privileges. On Unix and Mac OS X, not sharing is the default behavior for binding an address and port, so this option is ignored. On Windows, this option uses the SO_EXCLUSIVEADDRUSE socket option.
*/

        DontShareAddress(2),
/**
 Provides a hint to {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} that it should try to rebind the service even if the address and port are already bound by another socket. On Windows, this is equivalent to the SO_REUSEADDR socket option. On Unix, this option is ignored.
*/

        ReuseAddressHint(4);

        BindFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.network.QUdpSocket$BindMode with the specified <tt>com.trolltech.qt.network.QUdpSocket$BindFlag[]</tt> QUdpSocket$BindFlag values set.</brief>
*/

        public static BindMode createQFlags(BindFlag ... values) {
            return new BindMode(values);
        }
/**
<brief>Returns the QUdpSocket$BindFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static BindFlag resolve(int value) {
            return (BindFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DefaultForPlatform;
            case 1: return ShareAddress;
            case 2: return DontShareAddress;
            case 4: return ReuseAddressHint;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class BindMode extends com.trolltech.qt.QFlags<BindFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QUdpSocket-BindMode with the specified <tt>com.trolltech.qt.network.QUdpSocket.BindFlag[]</tt>. flags set.</brief>
*/

        public BindMode(BindFlag ... args) { super(args); }
        public BindMode(int value) { setValue(value); }
    }




/**
Creates a QUdpSocket object. <p><tt>parent</tt> is passed to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() socketType()}. <br></DD></DT>
*/

    public QUdpSocket() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a QUdpSocket object. <p><tt>parent</tt> is passed to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() socketType()}. <br></DD></DT>
*/

    public QUdpSocket(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QUdpSocket_QObject(parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        AbstractSignal sig = (AbstractSignal) com.trolltech.qt.GeneratorUtilities.fetchField(this, QAbstractSocket.class, "proxyAuthenticationRequiredPrivate");
        sig.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QUdpSocket_QObject(long parent);

    @QtBlockedSlot
    private final boolean bind_private(com.trolltech.qt.network.QHostAddress address, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bind_private_QHostAddress_char(nativeId(), address == null ? 0 : address.nativeId(), port);
    }
    @QtBlockedSlot
    native boolean __qt_bind_private_QHostAddress_char(long __this__nativeId, long address, char port);


    @QtBlockedSlot
    private final boolean bind_private(com.trolltech.qt.network.QHostAddress address, char port, com.trolltech.qt.network.QUdpSocket.BindFlag ... mode) {
        return this.bind_private(address, port, new com.trolltech.qt.network.QUdpSocket.BindMode(mode));
    }
    @QtBlockedSlot
    private final boolean bind_private(com.trolltech.qt.network.QHostAddress address, char port, com.trolltech.qt.network.QUdpSocket.BindMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bind_private_QHostAddress_char_BindMode(nativeId(), address == null ? 0 : address.nativeId(), port, mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_bind_private_QHostAddress_char_BindMode(long __this__nativeId, long address, char port, int mode);


    @QtBlockedSlot
    private final boolean bind_private() {
        return bind_private((char)0);
    }
    @QtBlockedSlot
    private final boolean bind_private(char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bind_private_char(nativeId(), port);
    }
    @QtBlockedSlot
    native boolean __qt_bind_private_char(long __this__nativeId, char port);


    @QtBlockedSlot
    private final boolean bind_private(char port, com.trolltech.qt.network.QUdpSocket.BindFlag ... mode) {
        return this.bind_private(port, new com.trolltech.qt.network.QUdpSocket.BindMode(mode));
    }
    @QtBlockedSlot
    private final boolean bind_private(char port, com.trolltech.qt.network.QUdpSocket.BindMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bind_private_char_BindMode(nativeId(), port, mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_bind_private_char_BindMode(long __this__nativeId, char port, int mode);

/**
Returns true if at least one datagram is waiting to be read; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()}, and {@link com.trolltech.qt.network.QUdpSocket#readDatagram(byte[], com.trolltech.qt.network.QUdpSocket.HostInfo) readDatagram()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasPendingDatagrams()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasPendingDatagrams(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasPendingDatagrams(long __this__nativeId);

/**
Returns the size of the first pending UDP datagram. If there is no datagram available, this function returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUdpSocket#hasPendingDatagrams() hasPendingDatagrams()}, and {@link com.trolltech.qt.network.QUdpSocket#readDatagram(byte[], com.trolltech.qt.network.QUdpSocket.HostInfo) readDatagram()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long pendingDatagramSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pendingDatagramSize(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pendingDatagramSize(long __this__nativeId);

    @QtBlockedSlot
    private final long readDatagram(com.trolltech.qt.QNativePointer data, long maxlen, com.trolltech.qt.QNativePointer host, com.trolltech.qt.QNativePointer port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readDatagram_nativepointer_long_nativepointer_nativepointer(nativeId(), data, maxlen, host, port);
    }
    @QtBlockedSlot
    native long __qt_readDatagram_nativepointer_long_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen, com.trolltech.qt.QNativePointer host, com.trolltech.qt.QNativePointer port);

    @QtBlockedSlot
    private final long writeDatagram(com.trolltech.qt.core.QByteArray datagram, com.trolltech.qt.network.QHostAddress host, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeDatagram_QByteArray_QHostAddress_char(nativeId(), datagram == null ? 0 : datagram.nativeId(), host == null ? 0 : host.nativeId(), port);
    }
    @QtBlockedSlot
    native long __qt_writeDatagram_QByteArray_QHostAddress_char(long __this__nativeId, long datagram, long host, char port);

    @QtBlockedSlot
    private final long writeDatagram(com.trolltech.qt.QNativePointer data, long len, com.trolltech.qt.network.QHostAddress host, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeDatagram_nativepointer_long_QHostAddress_char(nativeId(), data, len, host == null ? 0 : host.nativeId(), port);
    }
    @QtBlockedSlot
    native long __qt_writeDatagram_nativepointer_long_QHostAddress_char(long __this__nativeId, com.trolltech.qt.QNativePointer data, long len, long host, char port);

/**
@exclude
*/

    public static native QUdpSocket fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QUdpSocket(QPrivateConstructor p) { super(p); } 

/**
Binds this socket to the address <tt>address</tt> and the port <tt>port</tt>.
When bound, the signal readyRead() is emitted whenever a UDP
datagram arrives on the specified address and port. This function
is useful to write UDP servers.
<p>
On success, the functions returns true and the socket enters
BoundState; otherwise it returns false.
<p>
The socket is bound using the DefaultForPlatform BindMode.
*/

    public final boolean bind(QHostAddress address, int port) {
        return bind_private(address, (char) port);
    }

/**

*/

    public final boolean bind() {
        return bind_private();
    }

/**
Binds to QHostAddress.Any on port <tt>port</tt>.
*/

    public final boolean bind(int port) {
        return bind_private((char) port);
    }

/**
Binds to <tt>address</tt> on port <tt>port</tt>, using the BindMode<tt>mode</tt>.
*/

    public final boolean bind(QHostAddress address, int port, BindFlag ... mode) {
        return bind_private(address, (char) port, mode);
    }

/**
Binds to <tt>address</tt> on port <tt>port</tt>, using the BindMode<tt>mode</tt>.
*/

    public final boolean bind(QHostAddress address, int port, BindMode mode) {
        return bind_private(address, (char) port, mode);
    }

/**
Binds to <tt>address</tt> on port <tt>port</tt>, using the BindMode<tt>mode</tt>.
*/

    public final boolean bind(int port, BindFlag ... mode) {
        return bind_private((char) port, mode);
    }

/**
Binds to <tt>address</tt> on port <tt>port</tt>, using the BindMode<tt>mode</tt>.
*/

    public final boolean bind(int port, BindMode mode) {
        return bind_private((char) port, mode);
    }

    public static class HostInfo {
        public HostInfo() {
            address = new QHostAddress();
            port = 0;
        }

        public QHostAddress address;
        public int port;
    }

/**
Receives a datagram no larger than <tt>maxSize</tt> bytes and stores it in <tt>data</tt>. The sender's host address and port is stored in *<tt>address</tt> and *<tt>port</tt> (unless the pointers are 0). <p>Returns the size of the datagram on success; otherwise returns -1. <p>If <tt>maxSize</tt> is too small, the rest of the datagram will be lost. To avoid loss of data, call {@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()} to determine the size of the pending datagram before attempting to read it. If <tt>maxSize</tt> is 0, the datagram will be discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUdpSocket#writeDatagram(byte[], com.trolltech.qt.network.QHostAddress, int) writeDatagram()}, {@link com.trolltech.qt.network.QUdpSocket#hasPendingDatagrams() hasPendingDatagrams()}, and {@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()}. <br></DD></DT>
*/

    public final int readDatagram(byte data[], HostInfo info) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte, data.length);
        QNativePointer address = info != null && info.address != null ? info.address.nativePointer() : null;
        QNativePointer port = new QNativePointer(QNativePointer.Type.Char);

        int len = (int) readDatagram(np, data.length, address, port);
        if (info != null)
            info.port = port.charValue();
        for (int i = 0; i < len; ++i)
            data[i] = np.byteAt(i);

        return len;
    }

/**
Receives a datagram no larger than <tt>maxSize</tt> bytes and stores it in <tt>data</tt>. The sender's host address and port is stored in *<tt>address</tt> and *<tt>port</tt> (unless the pointers are 0). <p>Returns the size of the datagram on success; otherwise returns -1. <p>If <tt>maxSize</tt> is too small, the rest of the datagram will be lost. To avoid loss of data, call {@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()} to determine the size of the pending datagram before attempting to read it. If <tt>maxSize</tt> is 0, the datagram will be discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUdpSocket#writeDatagram(byte[], com.trolltech.qt.network.QHostAddress, int) writeDatagram()}, {@link com.trolltech.qt.network.QUdpSocket#hasPendingDatagrams() hasPendingDatagrams()}, and {@link com.trolltech.qt.network.QUdpSocket#pendingDatagramSize() pendingDatagramSize()}. <br></DD></DT>
*/

    public final int readDatagram(byte data[]) {
        return readDatagram(data, null);
    }

/**
Sends the datagram at <tt>data</tt> of size <tt>size</tt> to the host address <tt>address</tt> at port <tt>port</tt>. Returns the number of bytes sent on success; otherwise returns -1. <p>Datagrams are always written as one block. The maximum size of a datagram is highly platform-dependent, but can be as low as 8192 bytes. If the datagram is too large, this function will return -1 and {@link com.trolltech.qt.network.QAbstractSocket#error() error()} will return {@link com.trolltech.qt.network.QAbstractSocket.SocketError DatagramTooLargeError }. <p>Sending datagrams larger than 512 bytes is in general disadvised, as even if they are sent successfully, they are likely to be fragmented by the IP layer before arriving at their final destination. <p><b>Warning:</b> Calling this function on a connected UDP socket may result in an error and no packet being sent. If you are using a connected socket, use {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} to send datagrams. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUdpSocket#readDatagram(byte[], com.trolltech.qt.network.QUdpSocket.HostInfo) readDatagram()}, and {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. <br></DD></DT>
*/

    public final int writeDatagram(byte data[], QHostAddress address, int port) {
        QNativePointer np = com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data);
        return (int) writeDatagram(np, data.length, address, (char) port);
    }

/**
Sends the datagram <tt>datagram</tt> to the host address <tt>host</tt> and at
port <tt>port</tt>.
*/

    public final int writeDatagram(com.trolltech.qt.core.QByteArray data, QHostAddress address, int port) {
        return (int) writeDatagram(data, address, (char) port);
    }

}
