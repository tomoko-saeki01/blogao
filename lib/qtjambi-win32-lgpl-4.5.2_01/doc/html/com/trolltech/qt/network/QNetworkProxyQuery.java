package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkProxyQuery class is used to query the proxy settings for a socket QNetworkProxyQuery holds the details of a socket being created or request being made. It is used by {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} and {@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory} to allow applications to have a more fine-grained control over which proxy servers are used, depending on the details of the query. This allows an application to apply different settings, according to the protocol or destination hostname, for instance. <p>QNetworkProxyQuery supports the following criteria for selecting the proxy: <ul><li> the type of query</li><li> the local port number to use</li><li> the destination host name</li><li> the destination port number</li><li> the protocol name, such as "http" or "ftp"</li><li> the URL being requested</li></ul> The destination host name is the host in the connection in the case of outgoing connection sockets. It is the <tt>hostName</tt> parameter passed to {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) QTcpSocket::connectToHost()} or the host component of a URL requested with {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}. <p>The destination port number is the requested port to connect to in the case of outgoing sockets, while the local port number is the port the socket wishes to use locally before attempting the external connection. In most cases, the local port number is used by listening sockets only ({@link com.trolltech.qt.network.QTcpSocket QTcpSocket}) or by datagram sockets ({@link com.trolltech.qt.network.QUdpSocket QUdpSocket}). <p>The protocol name is an arbitrary string that indicates the type of connection being attempted. For example, it can match the scheme of a URL, like "http", "https" and "ftp". In most cases, the proxy selection will not change depending on the protocol, but this information is provided in case a better choice can be made, like choosing an caching HTTP proxy for HTTP-based connections, but a more powerful SOCKSv5 proxy for all others. <p>Some of the criteria may not make sense in all of the types of query. The following table lists the criteria that are most commonly used, according to the type of query. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Query type</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType TcpSocket }</td><td> Normal sockets requesting a connection to a remote server, like {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. The peer hostname and peer port match the values passed to {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) QTcpSocket::connectToHost()}. The local port is usually -1, indicating the socket has no preference in which port should be used. The URL component is not used.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType UdpSocket }</td><td> Datagram-based sockets, which can both send and receive. The local port, remote host or remote port fields can all be used or be left unused, depending on the characteristics of the socket. The URL component is not used.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType TcpServer }</td><td> Passive server sockets that listen on a port and await incoming connections from the network. Normally, only the local port is used, but the remote address could be used in specific circumstances, for example to indicate which remote host a connection is expected from. The URL component is not used.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType UrlRequest }</td><td> A more high-level request, such as those coming from {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. These requests will inevitably use an outgoing TCP socket, but the this query type is provided to indicate that more detailed information is present in the URL component. For ease of implementation, the URL's host and port are set as the destination address.</td></tr></table> It should be noted that any of the criteria may be missing or unknown (an empty QString for the hostname or protocol name, -1 for the port numbers). If that happens, the functions executing the query should make their best guess or apply some implementation-defined default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, {@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}, and {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) QAbstractSocket::setProxy()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkProxyQuery extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
Describes the type of one {@link com.trolltech.qt.network.QNetworkProxyQuery QNetworkProxyQuery} query. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#queryType() queryType()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setQueryType(com.trolltech.qt.network.QNetworkProxyQuery.QueryType) setQueryType()}. <br></DD></DT>
*/

    public enum QueryType implements com.trolltech.qt.QtEnumerator {
/**
 a normal, outgoing TCP socket
*/

        TcpSocket(0),
/**
 a datagram-based UDP socket, which could send to multiple destinations
*/

        UdpSocket(1),
/**
 a TCP server that listens for incoming connections from the network
*/

        TcpServer(100),
/**
 a more complex request which involves loading of a URL
*/

        UrlRequest(101);

        QueryType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkProxyQuery$QueryType constant with the specified <tt>int</tt>.</brief>
*/

        public static QueryType resolve(int value) {
            return (QueryType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TcpSocket;
            case 1: return UdpSocket;
            case 100: return TcpServer;
            case 101: return UrlRequest;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a default QNetworkProxyQuery object. By default, the query type will be {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket }.
*/

    public QNetworkProxyQuery(){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyQuery();
    }

    native void __qt_QNetworkProxyQuery();

/**
Constructs a QNetworkProxyQuery object that is a copy of <tt>other</tt>.
*/

    public QNetworkProxyQuery(com.trolltech.qt.network.QNetworkProxyQuery other){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyQuery_QNetworkProxyQuery(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkProxyQuery_QNetworkProxyQuery(long other);


/**
Constructs a QNetworkProxyQuery of type <tt>queryType</tt> and sets the protocol tag to be <tt>protocolTag</tt>. This constructor is suitable for {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket } queries, because it sets the peer hostname to <tt>hostname</tt> and the peer's port number to <tt>port</tt>.
*/

    public QNetworkProxyQuery(java.lang.String hostname, int port, java.lang.String protocolTag) {
        this(hostname, port, protocolTag, com.trolltech.qt.network.QNetworkProxyQuery.QueryType.TcpSocket);
    }

/**
Constructs a QNetworkProxyQuery of type <tt>queryType</tt> and sets the protocol tag to be <tt>protocolTag</tt>. This constructor is suitable for {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket } queries, because it sets the peer hostname to <tt>hostname</tt> and the peer's port number to <tt>port</tt>.
*/

    public QNetworkProxyQuery(java.lang.String hostname, int port) {
        this(hostname, port, (java.lang.String)null, com.trolltech.qt.network.QNetworkProxyQuery.QueryType.TcpSocket);
    }
/**
Constructs a QNetworkProxyQuery of type <tt>queryType</tt> and sets the protocol tag to be <tt>protocolTag</tt>. This constructor is suitable for {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket } queries, because it sets the peer hostname to <tt>hostname</tt> and the peer's port number to <tt>port</tt>.
*/

    public QNetworkProxyQuery(java.lang.String hostname, int port, java.lang.String protocolTag, com.trolltech.qt.network.QNetworkProxyQuery.QueryType queryType){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyQuery_String_int_String_QueryType(hostname, port, protocolTag, queryType.value());
    }

    native void __qt_QNetworkProxyQuery_String_int_String_QueryType(java.lang.String hostname, int port, java.lang.String protocolTag, int queryType);


/**
Constructs a QNetworkProxyQuery with the URL <tt>requestUrl</tt> and sets the query type to <tt>queryType</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#protocolTag() protocolTag()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}. <br></DD></DT>
*/

    public QNetworkProxyQuery(com.trolltech.qt.core.QUrl requestUrl) {
        this(requestUrl, com.trolltech.qt.network.QNetworkProxyQuery.QueryType.UrlRequest);
    }
/**
Constructs a QNetworkProxyQuery with the URL <tt>requestUrl</tt> and sets the query type to <tt>queryType</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#protocolTag() protocolTag()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}. <br></DD></DT>
*/

    public QNetworkProxyQuery(com.trolltech.qt.core.QUrl requestUrl, com.trolltech.qt.network.QNetworkProxyQuery.QueryType queryType){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyQuery_QUrl_QueryType(requestUrl == null ? 0 : requestUrl.nativeId(), queryType.value());
    }

    native void __qt_QNetworkProxyQuery_QUrl_QueryType(long requestUrl, int queryType);


/**
This is an overloaded method provided for convenience.
*/

    public QNetworkProxyQuery(char bindPort, java.lang.String protocolTag) {
        this(bindPort, protocolTag, com.trolltech.qt.network.QNetworkProxyQuery.QueryType.TcpServer);
    }

/**
This is an overloaded method provided for convenience.
*/

    public QNetworkProxyQuery(char bindPort) {
        this(bindPort, (java.lang.String)null, com.trolltech.qt.network.QNetworkProxyQuery.QueryType.TcpServer);
    }
/**
This is an overloaded method provided for convenience.
*/

    public QNetworkProxyQuery(char bindPort, java.lang.String protocolTag, com.trolltech.qt.network.QNetworkProxyQuery.QueryType queryType){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyQuery_char_String_QueryType(bindPort, protocolTag, queryType.value());
    }

    native void __qt_QNetworkProxyQuery_char_String_QueryType(char bindPort, java.lang.String protocolTag, int queryType);

/**
Returns the port number of the socket that will accept incoming packets from remote servers or -1 if the port is not known. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setLocalPort(int) setLocalPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int localPort()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localPort(nativeId());
    }
    @QtBlockedSlot
    native int __qt_localPort(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkProxyQuery other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkProxyQuery(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkProxyQuery(long __this__nativeId, long other);

/**
Returns the host name or IP address being of the outgoing connection being requested, or an empty string if the remote hostname is not known. <p>If the query type is {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UrlRequest }, this function returns the host component of the URL being requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#localPort() localPort()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerHostName(java.lang.String) setPeerHostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String peerHostName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerHostName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_peerHostName(long __this__nativeId);

/**
Returns the port number for the outgoing request or -1 if the port number is not known. <p>If the query type is {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UrlRequest }, this function returns the port number of the URL being requested. In general, frameworks will fill in the port number from their default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#localPort() localPort()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerPort(int) setPeerPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int peerPort()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peerPort(nativeId());
    }
    @QtBlockedSlot
    native int __qt_peerPort(long __this__nativeId);

/**
Returns the protocol tag for this QNetworkProxyQuery object, or an empty QString in case the protocol tag is unknown. <p>In the case of queries of type {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UrlRequest }, this function returns the value of the scheme component of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#setProtocolTag(java.lang.String) setProtocolTag()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#url() url()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String protocolTag()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_protocolTag(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_protocolTag(long __this__nativeId);

/**
Returns the query type. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#setQueryType(com.trolltech.qt.network.QNetworkProxyQuery.QueryType) setQueryType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkProxyQuery.QueryType queryType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QNetworkProxyQuery.QueryType.resolve(__qt_queryType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_queryType(long __this__nativeId);

/**
Sets the port number that the socket wishes to use locally to accept incoming packets from remote servers to <tt>port</tt>. The local port is most often used with the {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpServer } and {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UdpSocket } query types. <p>Valid values are 0 to 65535 (with 0 indicating that any port number will be acceptable) or -1, which means the local port number is unknown or not applicable. <p>In some circumstances, for special protocols, it's the local port number can also be used with a query of type {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpSocket }. When that happens, the socket is indicating it wishes to use the port number <tt>port</tt> when connecting to a remote host. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#localPort() localPort()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerPort(int) setPeerPort()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerHostName(java.lang.String) setPeerHostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLocalPort(int port)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocalPort_int(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setLocalPort_int(long __this__nativeId, int port);

/**
Sets the hostname of the outgoing connection being requested to <tt>hostname</tt>. An empty hostname can be used to indicate that the remote host is unknown. <p>The peer host name can also be used to indicate the expected source address of an incoming connection in the case of {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UdpSocket } or {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpServer } query types. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerPort(int) setPeerPort()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setLocalPort(int) setLocalPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerHostName(java.lang.String hostname)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerHostName_String(nativeId(), hostname);
    }
    @QtBlockedSlot
    native void __qt_setPeerHostName_String(long __this__nativeId, java.lang.String hostname);

/**
Sets the requested port number for the outgoing connection to be <tt>port</tt>. Valid values are 1 to 65535, or -1 to indicate that the remote port number is unknown. <p>The peer port number can also be used to indicate the expected port number of an incoming connection in the case of {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UdpSocket } or {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::TcpServer } query types. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#setPeerHostName(java.lang.String) setPeerHostName()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#setLocalPort(int) setLocalPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPeerPort(int port)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPeerPort_int(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setPeerPort_int(long __this__nativeId, int port);

/**
Sets the protocol tag for this QNetworkProxyQuery object to be <tt>protocolTag</tt>. <p>The protocol tag is an arbitrary string that indicates which protocol is being talked over the socket, such as "http", "xmpp", "telnet", etc. The protocol tag is used by the backend to return a request that is more specific to the protocol in question: for example, a HTTP connection could be use a caching HTTP proxy server, while all other connections use a more powerful SOCKSv5 proxy server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#protocolTag() protocolTag()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProtocolTag(java.lang.String protocolTag)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProtocolTag_String(nativeId(), protocolTag);
    }
    @QtBlockedSlot
    native void __qt_setProtocolTag_String(long __this__nativeId, java.lang.String protocolTag);

/**
Sets the query type of this object to be <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#queryType() queryType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setQueryType(com.trolltech.qt.network.QNetworkProxyQuery.QueryType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQueryType_QueryType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setQueryType_QueryType(long __this__nativeId, int type);

/**
Sets the URL component of this QNetworkProxyQuery object to be <tt>url</tt>. Setting the URL will also set the protocol tag, the remote host name and port number. This is done so as to facilitate the implementation of the code that determines the proxy server to be used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#url() url()}, {@link com.trolltech.qt.network.QNetworkProxyQuery#peerHostName() peerHostName()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery#peerPort() peerPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUrl(com.trolltech.qt.core.QUrl url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrl_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUrl_QUrl(long __this__nativeId, long url);

/**
Returns the URL component of this QNetworkProxyQuery object in case of a query of type {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UrlRequest }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyQuery#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl url()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_url(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_url(long __this__nativeId);

/**
@exclude
*/

    public static native QNetworkProxyQuery fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkProxyQuery(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkProxyQuery array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkProxyQuery)
        return operator_equal((com.trolltech.qt.network.QNetworkProxyQuery) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkProxyQuery clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkProxyQuery __qt_clone(long __this_nativeId);
}
