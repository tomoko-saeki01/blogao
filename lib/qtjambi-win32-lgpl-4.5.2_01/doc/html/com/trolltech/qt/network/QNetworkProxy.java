package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkProxy class provides a network layer proxy. QNetworkProxy provides the method for configuring network layer proxy support to the Qt network classes. The currently supported classes are {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, {@link com.trolltech.qt.network.QTcpServer QTcpServer}, {@link com.trolltech.qt.network.QHttp QHttp} and {@link com.trolltech.qt.network.QFtp QFtp}. The proxy support is designed to be as transparent as possible. This means that existing network-enabled applications that you have written should automatically support network proxy using the following code.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QNetworkProxy proxy;
proxy.setType(QNetworkProxy::Socks5Proxy);
proxy.setHostName("proxy.example.com");
proxy.setPort(1080);
proxy.setUser("username");
proxy.setPassword("password");
QNetworkProxy::setApplicationProxy(proxy);
</pre> An alternative to setting an application wide proxy is to specify the proxy for individual sockets using {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) QAbstractSocket::setProxy()} and {@link com.trolltech.qt.network.QTcpServer#setProxy(com.trolltech.qt.network.QNetworkProxy) QTcpServer::setProxy()}. In this way, it is possible to disable the use of a proxy for specific sockets using the following code:<br><br>The following code example is written in c++.<br> <pre class="snippet">
serverSocket-&gt;setProxy(QNetworkProxy::NoProxy);
</pre> Network proxy is not used if the address used in {@link com.trolltech.qt.network.QAbstractSocket#connectToHost(java.lang.String, int, com.trolltech.qt.core.QIODevice.OpenMode) connectToHost()}, {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) bind()} or {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()} is equivalent to {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::LocalHost } or {@link com.trolltech.qt.network.QHostAddress.SpecialAddress QHostAddress::LocalHostIPv6 }. <p>Each type of proxy support has certain restrictions associated with it. You should read the {@link com.trolltech.qt.network.QNetworkProxy.ProxyType ProxyType } documentation carefully before selecting a proxy type to use. <p><b>Note:</b> Changes made to currently connected sockets do not take effect. If you need to change a connected socket, you should reconnect it.<a name="socks5"><h2>SOCKS5</h2> The SOCKS5 support in Qt 4 is based on {@link <a href="../http-www-rfc-editor-org-rfc-rfc1928-txt.html">RFC 1928</a>} and {@link <a href="../http-www-rfc-editor-org-rfc-rfc1929-txt.html">RFC 1929</a>}. The supported authentication methods are no authentication and username/password authentication. Both IPv4 and IPv6 are supported, but domain name resolution via the SOCKS server is not supported; i.e. all domain names are resolved locally. There are several things to remember when using SOCKS5 with {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} and {@link com.trolltech.qt.network.QTcpServer QTcpServer}: <p>With {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, a call to {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) bind()} may fail with a timeout error. If a port number other than 0 is passed to {@link com.trolltech.qt.network.QUdpSocket#bind(com.trolltech.qt.network.QHostAddress, int) bind()}, it is not guaranteed that it is the specified port that will be used. Use {@link com.trolltech.qt.network.QAbstractSocket#localPort() localPort()} and {@link com.trolltech.qt.network.QAbstractSocket#localAddress() localAddress()} to get the actual address and port number in use. Because proxied UDP goes through two UDP connections, it is more likely that packets will be dropped. <p>With {@link com.trolltech.qt.network.QTcpServer QTcpServer} a call to {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()} may fail with a timeout error. If a port number other than 0 is passed to {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}, then it is not guaranteed that it is the specified port that will be used. Use {@link com.trolltech.qt.network.QTcpServer#serverPort() serverPort()} and {@link com.trolltech.qt.network.QTcpServer#serverAddress() serverAddress()} to get the actual address and port used to listen for connections. SOCKS5 only supports one accepted connection per call to {@link com.trolltech.qt.network.QTcpServer#listen(com.trolltech.qt.network.QHostAddress, int) listen()}, and each call is likely to result in a different {@link com.trolltech.qt.network.QTcpServer#serverPort() serverPort()} being used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket}, and {@link com.trolltech.qt.network.QTcpServer QTcpServer}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkProxy extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types of network proxying provided in Qt. <p>There are two types of proxies that Qt understands: transparent proxies and caching proxies. The first group consists of proxies that can handle any arbitrary data transfer, while the second can only handle specific requests. The caching proxies only make sense for the specific classes where they can be used. The table below lists different proxy types and their capabilities. Since each proxy type has different capabilities, it is important to understand them before choosing a proxy type. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Proxy type</center></th><th><center> Description</center></th><th><center> Default capabilities</center></th></tr></thead><tr valign="top" class="even"><td> SOCKS 5</td><td> Generic proxy for any kind of connection. Supports TCP, UDP, binding to a port (incoming connections) and authentication.</td><td> {@link com.trolltech.qt.network.QNetworkProxy.Capability TunnelingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability ListeningCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability UdpTunnelingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability HostNameLookupCapability }</td></tr><tr valign="top" class="odd"><td> HTTP</td><td> Implemented using the "CONNECT" command, supports only outgoing TCP connections; supports authentication.</td><td> {@link com.trolltech.qt.network.QNetworkProxy.Capability TunnelingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability CachingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability HostNameLookupCapability }</td></tr><tr valign="top" class="even"><td> Caching-only HTTP</td><td> Implemented using normal HTTP commands, it is useful only in the context of HTTP requests (see {@link com.trolltech.qt.network.QHttp QHttp}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager})</td><td> {@link com.trolltech.qt.network.QNetworkProxy.Capability CachingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability HostNameLookupCapability }</td></tr><tr valign="top" class="odd"><td> Caching FTP</td><td> Implemented using an FTP proxy, it is useful only in the context of FTP requests (see {@link com.trolltech.qt.network.QFtp QFtp}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager})</td><td> {@link com.trolltech.qt.network.QNetworkProxy.Capability CachingCapability }, {@link com.trolltech.qt.network.QNetworkProxy.Capability HostNameLookupCapability }</td></tr></table> Also note that you shouldn't set the application default proxy ({@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) setApplicationProxy()}) to a proxy that doesn't have the {@link com.trolltech.qt.network.QNetworkProxy.Capability TunnelingCapability } capability. If you do, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} will not know how to open connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setType(com.trolltech.qt.network.QNetworkProxy.ProxyType) setType()}, {@link com.trolltech.qt.network.QNetworkProxy#type() type()}, {@link com.trolltech.qt.network.QNetworkProxy#capabilities() capabilities()}, and {@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}. <br></DD></DT>
*/

    public enum ProxyType implements com.trolltech.qt.QtEnumerator {
/**
 Proxy is determined based on the application proxy set using {@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) setApplicationProxy()}
*/

        DefaultProxy(0),
/**
 {@link com.trolltech.qt.network.QNetworkProxy Socks5} proxying is used
*/

        Socks5Proxy(1),
/**
 No proxying is used
*/

        NoProxy(2),
/**
 HTTP transparent proxying is used
*/

        HttpProxy(3),
/**
 Proxying for HTTP requests only
*/

        HttpCachingProxy(4),
/**
 Proxying for FTP requests only
*/

        FtpCachingProxy(5);

        ProxyType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkProxy$ProxyType constant with the specified <tt>int</tt>.</brief>
*/

        public static ProxyType resolve(int value) {
            return (ProxyType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DefaultProxy;
            case 1: return Socks5Proxy;
            case 2: return NoProxy;
            case 3: return HttpProxy;
            case 4: return HttpCachingProxy;
            case 5: return FtpCachingProxy;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
These flags indicate the capabilities that a given proxy server supports. <p>{@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} sets different capabilities by default when the object is created (see {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::ProxyType } for a list of the defaults). However, it is possible to change the capabitilies after the object has been created with {@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}. <p>The capabilities that {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} supports are:
*/

    public enum Capability implements com.trolltech.qt.QtEnumerator {
/**
 Ability to open transparent, tunneled TCP connections to a remote host. The proxy server relays the transmission verbatim from one side to the other and does no caching.
*/

        TunnelingCapability(1),
/**
 Ability to create a listening socket and wait for an incoming TCP connection from a remote host.
*/

        ListeningCapability(2),
/**
 Ability to relay UDP datagrams via the proxy server to and from a remote host.
*/

        UdpTunnelingCapability(4),
/**
 Ability to cache the contents of the transfer. This capability is specific to each protocol and proxy type. For example, HTTP proxies can cache the contents of web data transferred with "GET" commands.
*/

        CachingCapability(8),
/**
 Ability to connect to perform the lookup on a remote host name and connect to it, as opposed to requiring the application to perform the name lookup and request connection to IP addresses only.
*/

        HostNameLookupCapability(16);

        Capability(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.network.QNetworkProxy$Capabilities with the specified <tt>com.trolltech.qt.network.QNetworkProxy$Capability[]</tt> QNetworkProxy$Capability values set.</brief>
*/

        public static Capabilities createQFlags(Capability ... values) {
            return new Capabilities(values);
        }
/**
<brief>Returns the QNetworkProxy$Capability constant with the specified <tt>int</tt>.</brief>
*/

        public static Capability resolve(int value) {
            return (Capability) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return TunnelingCapability;
            case 2: return ListeningCapability;
            case 4: return UdpTunnelingCapability;
            case 8: return CachingCapability;
            case 16: return HostNameLookupCapability;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Capabilities extends com.trolltech.qt.QFlags<Capability> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QNetworkProxy-Capabilities with the specified <tt>com.trolltech.qt.network.QNetworkProxy.Capability[]</tt>. flags set.</brief>
*/

        public Capabilities(Capability ... args) { super(args); }
        public Capabilities(int value) { setValue(value); }
    }



/**
Constructs a QNetworkProxy with {@link com.trolltech.qt.network.QNetworkProxy.ProxyType DefaultProxy } type; the proxy type is determined by {@link com.trolltech.qt.network.QNetworkProxy#applicationProxy() applicationProxy()}, which defaults to {@link com.trolltech.qt.network.QNetworkProxy.ProxyType NoProxy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setType(com.trolltech.qt.network.QNetworkProxy.ProxyType) setType()}, and {@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) setApplicationProxy()}. <br></DD></DT>
*/

    public QNetworkProxy(){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxy();
    }

    native void __qt_QNetworkProxy();


    private QNetworkProxy(com.trolltech.qt.network.QNetworkProxy.ProxyType type, java.lang.String hostName, char port, java.lang.String user) {
        this(type, hostName, port, user, (java.lang.String)null);
    }

    private QNetworkProxy(com.trolltech.qt.network.QNetworkProxy.ProxyType type, java.lang.String hostName, char port) {
        this(type, hostName, port, (java.lang.String)null, (java.lang.String)null);
    }
    private QNetworkProxy(com.trolltech.qt.network.QNetworkProxy.ProxyType type, java.lang.String hostName, char port, java.lang.String user, java.lang.String password){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxy_ProxyType_String_char_String_String(type.value(), hostName, port, user, password);
    }

    native void __qt_QNetworkProxy_ProxyType_String_char_String_String(int type, java.lang.String hostName, char port, java.lang.String user, java.lang.String password);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QNetworkProxy(com.trolltech.qt.network.QNetworkProxy other){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxy_QNetworkProxy(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkProxy_QNetworkProxy(long other);

/**
Returns the capabilities of this proxy server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}, and {@link com.trolltech.qt.network.QNetworkProxy#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkProxy.Capabilities capabilities()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.network.QNetworkProxy.Capabilities(__qt_capabilities(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_capabilities(long __this__nativeId);

/**
Returns the host name of the proxy host. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.network.QNetworkProxy#setPort(int) setPort()}, and {@link com.trolltech.qt.network.QNetworkProxy#port() port()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String hostName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hostName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_hostName(long __this__nativeId);

/**
Returns true if this proxy supports the {@link com.trolltech.qt.network.QNetworkProxy.Capability QNetworkProxy::CachingCapability } capability. <p>In Qt 4.4, the capability was tied to the proxy type, but since Qt 4.5 it is possible to remove the capability of caching from a proxy by calling {@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#capabilities() capabilities()}, {@link com.trolltech.qt.network.QNetworkProxy#type() type()}, and {@link com.trolltech.qt.network.QNetworkProxy#isTransparentProxy() isTransparentProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCachingProxy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCachingProxy(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCachingProxy(long __this__nativeId);

/**
Returns true if this proxy supports transparent tunneling of TCP connections. This matches the {@link com.trolltech.qt.network.QNetworkProxy.Capability QNetworkProxy::TunnelingCapability } capability. <p>In Qt 4.4, the capability was tied to the proxy type, but since Qt 4.5 it is possible to remove the capability of caching from a proxy by calling {@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#capabilities() capabilities()}, {@link com.trolltech.qt.network.QNetworkProxy#type() type()}, and {@link com.trolltech.qt.network.QNetworkProxy#isCachingProxy() isCachingProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTransparentProxy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTransparentProxy(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTransparentProxy(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkProxy other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkProxy(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkProxy(long __this__nativeId, long other);

/**
Returns the password used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#user() user()}, {@link com.trolltech.qt.network.QNetworkProxy#setPassword(java.lang.String) setPassword()}, and {@link com.trolltech.qt.network.QNetworkProxy#setUser(java.lang.String) setUser()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String password()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_password(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_password(long __this__nativeId);

    @QtBlockedSlot
    private final char port_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_port_private(nativeId());
    }
    @QtBlockedSlot
    native char __qt_port_private(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability ... capab) {
        this.setCapabilities(new com.trolltech.qt.network.QNetworkProxy.Capabilities(capab));
    }
/**
Sets the capabilities of this proxy to <tt>capabilities</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setType(com.trolltech.qt.network.QNetworkProxy.ProxyType) setType()}, and {@link com.trolltech.qt.network.QNetworkProxy#capabilities() capabilities()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capabilities capab)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCapabilities_Capabilities(nativeId(), capab.value());
    }
    @QtBlockedSlot
    native void __qt_setCapabilities_Capabilities(long __this__nativeId, int capab);

/**
Sets the host name of the proxy host to be <tt>hostName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#hostName() hostName()}, {@link com.trolltech.qt.network.QNetworkProxy#setPort(int) setPort()}, and {@link com.trolltech.qt.network.QNetworkProxy#port() port()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHostName(java.lang.String hostName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHostName_String(nativeId(), hostName);
    }
    @QtBlockedSlot
    native void __qt_setHostName_String(long __this__nativeId, java.lang.String hostName);

/**
Sets the password for proxy authentication to be <tt>password</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#user() user()}, {@link com.trolltech.qt.network.QNetworkProxy#setUser(java.lang.String) setUser()}, and {@link com.trolltech.qt.network.QNetworkProxy#password() password()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPassword(java.lang.String password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPassword_String(nativeId(), password);
    }
    @QtBlockedSlot
    native void __qt_setPassword_String(long __this__nativeId, java.lang.String password);

    @QtBlockedSlot
    private final void setPort(char port)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPort_char(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setPort_char(long __this__nativeId, char port);

/**
Sets the proxy type for this instance to be <tt>type</tt>. <p>Note that changing the type of a proxy does not change the set of capabilities this QNetworkProxy object holds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#type() type()}, and {@link com.trolltech.qt.network.QNetworkProxy#setCapabilities(com.trolltech.qt.network.QNetworkProxy.Capability[]) setCapabilities()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setType(com.trolltech.qt.network.QNetworkProxy.ProxyType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_ProxyType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setType_ProxyType(long __this__nativeId, int type);

/**
Sets the user name for proxy authentication to be <tt>user</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#user() user()}, {@link com.trolltech.qt.network.QNetworkProxy#setPassword(java.lang.String) setPassword()}, and {@link com.trolltech.qt.network.QNetworkProxy#password() password()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUser(java.lang.String userName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUser_String(nativeId(), userName);
    }
    @QtBlockedSlot
    native void __qt_setUser_String(long __this__nativeId, java.lang.String userName);

/**
Returns the proxy type for this instance. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setType(com.trolltech.qt.network.QNetworkProxy.ProxyType) setType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkProxy.ProxyType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QNetworkProxy.ProxyType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the user name used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setUser(java.lang.String) setUser()}, {@link com.trolltech.qt.network.QNetworkProxy#setPassword(java.lang.String) setPassword()}, and {@link com.trolltech.qt.network.QNetworkProxy#password() password()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String user()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_user(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_user(long __this__nativeId);

/**
Returns the application level network proxying. <p>If a {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket} or {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} has the {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy } type, then the QNetworkProxy returned by this function is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory}, {@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) setApplicationProxy()}, {@link com.trolltech.qt.network.QAbstractSocket#proxy() QAbstractSocket::proxy()}, and {@link com.trolltech.qt.network.QTcpServer#proxy() QTcpServer::proxy()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.network.QNetworkProxy applicationProxy();

/**
Sets the application level network proxying to be <tt>networkProxy</tt>. <p>If a {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket} or {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} has the {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy } type, then the QNetworkProxy set with this function is used. If you want more flexibility in determining which the proxy, use the {@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory} class. <p>Setting a default proxy value with this function will override the application proxy factory set with QNetworkProxyFactory::setApplicationProxyFactory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxyFactory QNetworkProxyFactory}, {@link com.trolltech.qt.network.QNetworkProxy#applicationProxy() applicationProxy()}, {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) QAbstractSocket::setProxy()}, and {@link com.trolltech.qt.network.QTcpServer#setProxy(com.trolltech.qt.network.QNetworkProxy) QTcpServer::setProxy()}. <br></DD></DT>
*/

    public static void setApplicationProxy(com.trolltech.qt.network.QNetworkProxy proxy)    {
        __qt_setApplicationProxy_QNetworkProxy(proxy == null ? 0 : proxy.nativeId());
    }
    native static void __qt_setApplicationProxy_QNetworkProxy(long proxy);

/**
@exclude
*/

    public static native QNetworkProxy fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkProxy(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkProxy array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkProxy)
        return operator_equal((com.trolltech.qt.network.QNetworkProxy) other);
        return false;
    }


/**
Constructs a QNetworkProxy with <tt>type</tt>, <tt>hostName</tt>, <tt>port</tt>, <tt>user</tt> and <tt>password</tt>.
*/

    public QNetworkProxy(QNetworkProxy.ProxyType type) {
        this(type, null, '\0');
    }

/**
Constructs a QNetworkProxy with <tt>type</tt>, <tt>hostName</tt>, <tt>port</tt>, <tt>user</tt> and <tt>password</tt>.
*/

    public QNetworkProxy(QNetworkProxy.ProxyType type, String host) {
        this(type, host, '\0');
    }

/**
Constructs a QNetworkProxy with <tt>type</tt>, <tt>hostName</tt>, <tt>port</tt>, <tt>user</tt> and <tt>password</tt>.
*/

    public QNetworkProxy(QNetworkProxy.ProxyType type, String host, int port) {
        this(type, host, (char) port);
    }

/**
Constructs a QNetworkProxy with <tt>type</tt>, <tt>hostName</tt>, <tt>port</tt>, <tt>user</tt> and <tt>password</tt>.
*/

    public QNetworkProxy(QNetworkProxy.ProxyType type, String host, int port, String username) {
        this(type, host, (char) port, username);
    }

/**
Constructs a QNetworkProxy with <tt>type</tt>, <tt>hostName</tt>, <tt>port</tt>, <tt>user</tt> and <tt>password</tt>.
*/

    public QNetworkProxy(QNetworkProxy.ProxyType type, String host, int port, String username, String password) {
        this(type, host, (char) port, username, password);
    }

/**
Sets the port of the proxy host to be <tt>port</tt>.
*/

    public final void setPort(int port) {
        setPort((char) port);
    }

/**
Returns the port of this proxy.
*/

    public final int port() {
        return port_private();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkProxy clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkProxy __qt_clone(long __this_nativeId);
}
