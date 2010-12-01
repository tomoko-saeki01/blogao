package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkProxyFactory class provides fine-grained proxy selection. QNetworkProxyFactory is an extension to {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}, allowing applications to have a more fine-grained control over which proxy servers are used, depending on the socket requesting the proxy. This allows an application to apply different settings, according to the protocol or destination hostname, for instance. <p>QNetworkProxyFactory can be set globally for an application, in which case it will override any global proxies set with {@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) QNetworkProxy::setApplicationProxy()}. If set globally, any sockets created with Qt will query the factory to determine the proxy to be used. <p>A factory can also be set in certain frameworks that support multiple connections, such as {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. When set on such object, the factory will be queried for sockets created by that framework only.
*/
@QtJambiGeneratedClass
public abstract class QNetworkProxyFactory extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.network.QNetworkProxyFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.network.QNetworkProxy> queryProxy(com.trolltech.qt.network.QNetworkProxyQuery query) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_queryProxy_QNetworkProxyQuery(nativeId(), query == null ? 0 : query.nativeId());
        }
    }


/**
Creates a QNetworkProxyFactory object. <p>Since QNetworkProxyFactory is an abstract class, you cannot create objects of type QNetworkProxyFactory directly.
*/

    public QNetworkProxyFactory(){
        super((QPrivateConstructor)null);
        __qt_QNetworkProxyFactory();
    }

    native void __qt_QNetworkProxyFactory();


/**
This function examines takes the query request, <tt>query</tt>, examines the details of the type of socket or request and returns a list of {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} objects that indicate the proxy servers to be used, in order of preference. <p>When reimplementing this class, take care to return at least one element. <p>If you cannot determine a better proxy alternative, use {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy }, which tells the code querying for a proxy to use a higher alternative. For example, if this factory is set to a {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} object, DefaultProxy will tell it to query the application-level proxy settings. <p>If this factory is set as the application proxy factory, DefaultProxy and NoProxy will have the same meaning.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QNetworkProxy> queryProxy() {
        return queryProxy((com.trolltech.qt.network.QNetworkProxyQuery)new com.trolltech.qt.network.QNetworkProxyQuery());
    }
/**
This function examines takes the query request, <tt>query</tt>, examines the details of the type of socket or request and returns a list of {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} objects that indicate the proxy servers to be used, in order of preference. <p>When reimplementing this class, take care to return at least one element. <p>If you cannot determine a better proxy alternative, use {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy }, which tells the code querying for a proxy to use a higher alternative. For example, if this factory is set to a {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} object, DefaultProxy will tell it to query the application-level proxy settings. <p>If this factory is set as the application proxy factory, DefaultProxy and NoProxy will have the same meaning.
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.network.QNetworkProxy> queryProxy(com.trolltech.qt.network.QNetworkProxyQuery query);
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QNetworkProxy> __qt_queryProxy_QNetworkProxyQuery(long __this__nativeId, long query);

/**
This function examines takes the query request, <tt>query</tt>, examines the details of the type of socket or request and returns a list of {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} objects that indicate the proxy servers to be used, in order of preference.
*/

    public static java.util.List<com.trolltech.qt.network.QNetworkProxy> proxyForQuery(com.trolltech.qt.network.QNetworkProxyQuery query)    {
        return __qt_proxyForQuery_QNetworkProxyQuery(query == null ? 0 : query.nativeId());
    }
    native static java.util.List<com.trolltech.qt.network.QNetworkProxy> __qt_proxyForQuery_QNetworkProxyQuery(long query);

/**
Sets the application-wide proxy factory to be <tt>factory</tt>. This function will take ownership of that object and will delete it when necessary. <p>The application-wide proxy is used as a last-resort when all other proxy selection requests returned {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy }. For example, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} objects can have a proxy set with QTcpSocket::setProxy, but if none is set, the proxy factory class set with this function will be queried. <p>If you set a proxy factory with this function, any application level proxies set with QNetworkProxy::setApplicationProxy will be overridden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkProxy#setApplicationProxy(com.trolltech.qt.network.QNetworkProxy) QNetworkProxy::setApplicationProxy()}, {@link com.trolltech.qt.network.QAbstractSocket#proxy() QAbstractSocket::proxy()}, and {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) QAbstractSocket::setProxy()}. <br></DD></DT>
*/

    public static void setApplicationProxyFactory(com.trolltech.qt.network.QNetworkProxyFactory factory)    {
        if (factory != null) {
            factory.disableGarbageCollection();
        }
        __qt_setApplicationProxyFactory_QNetworkProxyFactory(factory == null ? 0 : factory.nativeId());
    }
    native static void __qt_setApplicationProxyFactory_QNetworkProxyFactory(long factory);


/**
This function examines takes the query request, <tt>query</tt>, examines the details of the type of socket or request and returns a list of {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} objects that indicate the proxy servers to be used, in order of preference. <p>This function can be used to determine the platform-specific proxy settings. This function will use the libraries provided by the operating system to determine the proxy for a given connection, if such libraries exist. If they don't, this function will just return a {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} of type {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::NoProxy }. <p>On Windows, this function will use the WinHTTP DLL functions. Despite its name, Microsoft suggests using it for all applications that require network connections, not just HTTP. This will respect the proxy settings set on the registry with the proxycfg.exe tool. If those settings are not found, this function will attempt to obtain Internet Explorer's settings and use them. <p>On MacOS X, this function will obtain the proxy settings using the SystemConfiguration framework from Apple. It will apply the FTP, HTTP and HTTPS proxy configurations for queries that contain the protocol tag "ftp", "http" and "https", respectively. If the SOCKS proxy is enabled in that configuration, this function will use the SOCKS server for all queries. If SOCKS isn't enabled, it will use the HTTPS proxy for all TcpSocket and UrlRequest queries. <p>On other systems, there is no standardised method of obtaining the system proxy configuration. This function may be improved in future versions to support those systems.<a name="limitations"><h2>Limitations</h2> These are the limitations for the current version of this function. Future versions of Qt may lift some of the limitations listed here. <p>On MacOS X, this function will ignore the Proxy Auto Configuration settings, since it cannot execute the associated ECMAScript code.
*/

    public static java.util.List<com.trolltech.qt.network.QNetworkProxy> systemProxyForQuery() {
        return systemProxyForQuery((com.trolltech.qt.network.QNetworkProxyQuery)new com.trolltech.qt.network.QNetworkProxyQuery());
    }
/**
This function examines takes the query request, <tt>query</tt>, examines the details of the type of socket or request and returns a list of {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} objects that indicate the proxy servers to be used, in order of preference. <p>This function can be used to determine the platform-specific proxy settings. This function will use the libraries provided by the operating system to determine the proxy for a given connection, if such libraries exist. If they don't, this function will just return a {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} of type {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::NoProxy }. <p>On Windows, this function will use the WinHTTP DLL functions. Despite its name, Microsoft suggests using it for all applications that require network connections, not just HTTP. This will respect the proxy settings set on the registry with the proxycfg.exe tool. If those settings are not found, this function will attempt to obtain Internet Explorer's settings and use them. <p>On MacOS X, this function will obtain the proxy settings using the SystemConfiguration framework from Apple. It will apply the FTP, HTTP and HTTPS proxy configurations for queries that contain the protocol tag "ftp", "http" and "https", respectively. If the SOCKS proxy is enabled in that configuration, this function will use the SOCKS server for all queries. If SOCKS isn't enabled, it will use the HTTPS proxy for all TcpSocket and UrlRequest queries. <p>On other systems, there is no standardised method of obtaining the system proxy configuration. This function may be improved in future versions to support those systems.<a name="limitations"><h2>Limitations</h2> These are the limitations for the current version of this function. Future versions of Qt may lift some of the limitations listed here. <p>On MacOS X, this function will ignore the Proxy Auto Configuration settings, since it cannot execute the associated ECMAScript code.
*/

    public static java.util.List<com.trolltech.qt.network.QNetworkProxy> systemProxyForQuery(com.trolltech.qt.network.QNetworkProxyQuery query)    {
        return __qt_systemProxyForQuery_QNetworkProxyQuery(query == null ? 0 : query.nativeId());
    }
    native static java.util.List<com.trolltech.qt.network.QNetworkProxy> __qt_systemProxyForQuery_QNetworkProxyQuery(long query);

/**
@exclude
*/

    public static native QNetworkProxyFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkProxyFactory(QPrivateConstructor p) { super(p); } 
}
