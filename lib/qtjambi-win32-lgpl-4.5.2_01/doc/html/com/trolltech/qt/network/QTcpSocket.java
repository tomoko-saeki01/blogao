package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QTcpSocket class provides a TCP socket. TCP (Transmission Control Protocol) is a reliable, stream-oriented, connection-oriented transport protocol. It is especially well suited for continuous transmission of data. <p>QTcpSocket is a convenience subclass of {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket} that allows you to establish a TCP connection and transfer streams of data. See the {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket} documentation for details. <p><b>Note:</b> TCP sockets cannot be opened in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Unbuffered } mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpServer QTcpServer}, {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, {@link com.trolltech.qt.network.QFtp QFtp}, {@link com.trolltech.qt.network.QHttp QHttp}, {@link <a href="../network-fortuneserver.html">Fortune Server Example</a>}, {@link <a href="../network-fortuneclient.html">Fortune Client Example</a>}, {@link <a href="../network-threadedfortuneserver.html">Threaded Fortune Server Example</a>}, {@link <a href="../network-blockingfortuneclient.html">Blocking Fortune Client Example</a>}, {@link <a href="../network-loopback.html">Loopback Example</a>}, and {@link <a href="../network-torrent.html">Torrent Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTcpSocket extends com.trolltech.qt.network.QAbstractSocket
{


/**
Creates a QTcpSocket object in state <tt>UnconnectedState</tt>. <p><tt>parent</tt> is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() socketType()}. <br></DD></DT>
*/

    public QTcpSocket() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a QTcpSocket object in state <tt>UnconnectedState</tt>. <p><tt>parent</tt> is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket#socketType() socketType()}. <br></DD></DT>
*/

    public QTcpSocket(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTcpSocket_QObject(parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        AbstractSignal sig = (AbstractSignal) com.trolltech.qt.GeneratorUtilities.fetchField(this, QAbstractSocket.class, "proxyAuthenticationRequiredPrivate");
        sig.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QTcpSocket_QObject(long parent);

/**
@exclude
*/

    public static native QTcpSocket fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTcpSocket(QPrivateConstructor p) { super(p); } 
}
