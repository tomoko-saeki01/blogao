package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkAccessManager class allows the application to post network requests and receive replies The Network Access API is constructed around one QNetworkAccessManager object, which holds the common configuration and settings for the requests it sends. It contains the proxy and cache configuration, as well as the signals related to such issues, and reply signals that can be used to monitor the progress of a network operation. <p>Once a QNetworkAccessManager object has been created, the application can use it to send requests over the network. A group of standard functions are supplied that take a request and optional data, and each return a {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object. The returned object is used to obtain any data returned in response to the corresponding request. the reply to is where most of the signals as well as the downloaded data are posted. <p>A simple download off the network could be accomplished with:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QNetworkAccessManager *manager = new QNetworkAccessManager(this);
connect(manager, SIGNAL(finished(QNetworkReply*)),
        this, SLOT(replyFinished(QNetworkReply*)));

manager-&gt;get(QNetworkRequest(QUrl("http://qtsoftware.com")));
</pre> When the <tt>replyFinished</tt> slot above is called, the parameter it takes is the {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object containing the downloaded data as well as meta-data (headers, etc.). <p><b>Note:</b> The slot is responsible for deleting the object at that point. <p>A more involved example, assuming the manager is already existent, can be:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QNetworkRequest request;
request.setUrl(QUrl("http://qtsoftware.com"));
request.setRawHeader("User-Agent", "MyOwnBrowser 1.0");

QNetworkReply *reply = manager-&gt;get(request);
connect(reply, SIGNAL(readyRead()), this, SLOT(slotReadyRead()));
connect(reply, SIGNAL(error(QNetworkReply::NetworkError)),
        this, SLOT(slotError(QNetworkReply::NetworkError)));
connect(reply, SIGNAL(sslErrors(QList&lt;QSslError&gt;)),
        this, SLOT(slotSslErrors(QList&lt;QSslError&gt;)));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkAccessManager extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    
/**
Indicates the operation this reply is processing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#operation() QNetworkReply::operation()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Operation implements com.trolltech.qt.QtEnumerator {
/**
 retrieve headers operation (created with {@link com.trolltech.qt.network.QNetworkAccessManager#head(com.trolltech.qt.network.QNetworkRequest) head()})
*/

        HeadOperation(1),
/**
 retrieve headers and download contents (created with {@link com.trolltech.qt.network.QNetworkAccessManager#get(com.trolltech.qt.network.QNetworkRequest) get()})
*/

        GetOperation(2),
/**
 upload contents operation (created with {@link com.trolltech.qt.network.QNetworkAccessManager#put(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) put()})
*/

        PutOperation(3),
/**
 send the contents of an HTML form for processing via HTTP POST (created with {@link com.trolltech.qt.network.QNetworkAccessManager#post(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) post()})
*/

        PostOperation(4),
        UnknownOperation(0);

        Operation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkAccessManager$Operation constant with the specified <tt>int</tt>.</brief>
*/

        public static Operation resolve(int value) {
            return (Operation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return HeadOperation;
            case 2: return GetOperation;
            case 3: return PutOperation;
            case 4: return PostOperation;
            case 0: return UnknownOperation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply(named: reply), com.trolltech.qt.QNativePointer(named: authenticator)&gt;:<p> This signal is emitted whenever a final server requests authentication before it delivers the requested contents. The slot connected to this signal should fill the credentials for the contents (which can be determined by inspecting the <tt>reply</tt> object) in the <tt>authenticator</tt> object. <p>QNetworkAccessManager will cache the credentials internally and will send the same values if the server requires authentication again, without emitting the {@link com.trolltech.qt.network.QNetworkAccessManager#authenticationRequired authenticationRequired() } signal. If it rejects the credentials, this signal will be emitted again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxyAuthenticationRequired proxyAuthenticationRequired() }. <br></DD></DT>
*/

    private final Signal2<com.trolltech.qt.network.QNetworkReply, com.trolltech.qt.QNativePointer> authenticationRequiredPrivate = new Signal2<com.trolltech.qt.network.QNetworkReply, com.trolltech.qt.QNativePointer>();

    private final void authenticationRequiredPrivate(com.trolltech.qt.network.QNetworkReply reply, com.trolltech.qt.QNativePointer authenticator)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_authenticationRequiredPrivate_QNetworkReply_nativepointer(nativeId(), reply == null ? 0 : reply.nativeId(), authenticator);
    }
    native void __qt_authenticationRequiredPrivate_QNetworkReply_nativepointer(long __this__nativeId, long reply, com.trolltech.qt.QNativePointer authenticator);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply(named: reply)&gt;:<p> This signal is emitted whenever a pending network reply is finished. The <tt>reply</tt> parameter will contain a pointer to the reply that has just finished. This signal is emitted in tandem with the {@link com.trolltech.qt.network.QNetworkReply#finished QNetworkReply::finished() } signal. <p>See {@link com.trolltech.qt.network.QNetworkReply#finished QNetworkReply::finished() } for information on the status that the object will be in. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#finished QNetworkReply::finished() }, and {@link com.trolltech.qt.network.QNetworkReply#error() QNetworkReply::error()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QNetworkReply> finished = new Signal1<com.trolltech.qt.network.QNetworkReply>();

    private final void finished(com.trolltech.qt.network.QNetworkReply reply)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished_QNetworkReply(nativeId(), reply == null ? 0 : reply.nativeId());
    }
    native void __qt_finished_QNetworkReply(long __this__nativeId, long reply);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkProxy(named: proxy), com.trolltech.qt.QNativePointer(named: authenticator)&gt;:<p> This signal is emitted whenever a proxy requests authentication and QNetworkAccessManager cannot find a valid, cached credential. The slot connected to this signal should fill in the credentials for the proxy <tt>proxy</tt> in the <tt>authenticator</tt> object. <p>QNetworkAccessManager will cache the credentials internally. The next time the proxy requests authentication, QNetworkAccessManager will automatically send the same credential without emitting the proxyAuthenticationRequired signal again. <p>If the proxy rejects the credentials, QNetworkAccessManager will emit the signal again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxy() proxy()}, {@link com.trolltech.qt.network.QNetworkAccessManager#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#authenticationRequired authenticationRequired() }. <br></DD></DT>
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
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply(named: reply), java.util.List<com.trolltech.qt.network.QSslError>(named: errors)&gt;:<p> This signal is emitted if the SSL/TLS session encountered errors during the set up, including certificate verification errors. The <tt>errors</tt> parameter contains the list of errors and <tt>reply</tt> is the {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} that is encountering these errors. <p>To indicate that the errors are not fatal and that the connection should proceed, the {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() QNetworkReply::ignoreSslErrors()} function should be called from the slot connected to this signal. If it is not called, the SSL session will be torn down before any data is exchanged (including the URL). <p>This signal can be used to display an error message to the user indicating that security may be compromised and display the SSL settings (see sslConfiguration() to obtain it). If the user decides to proceed after analyzing the remote certificate, the slot should call ignoreSslErrors(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}, {@link com.trolltech.qt.network.QNetworkReply#sslErrors QNetworkReply::sslErrors() }, {@link com.trolltech.qt.network.QNetworkReply#sslConfiguration() QNetworkReply::sslConfiguration()}, and {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() QNetworkReply::ignoreSslErrors()}. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.network.QNetworkReply, java.util.List<com.trolltech.qt.network.QSslError>> sslErrors = new Signal2<com.trolltech.qt.network.QNetworkReply, java.util.List<com.trolltech.qt.network.QSslError>>();

    private final void sslErrors(com.trolltech.qt.network.QNetworkReply reply, java.util.List<com.trolltech.qt.network.QSslError> errors)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sslErrors_QNetworkReply_List(nativeId(), reply == null ? 0 : reply.nativeId(), errors);
    }
    native void __qt_sslErrors_QNetworkReply_List(long __this__nativeId, long reply, java.util.List<com.trolltech.qt.network.QSslError> errors);


/**
Constructs a QNetworkAccessManager object that is the center of the Network Access API and sets <tt>parent</tt> as the parent object.
*/

    public QNetworkAccessManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QNetworkAccessManager object that is the center of the Network Access API and sets <tt>parent</tt> as the parent object.
*/

    public QNetworkAccessManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QNetworkAccessManager_QObject(parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        proxyAuthenticationRequiredPrivate.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequired.connect(this, "emitAuthenticationRequiredPrivate(QNetworkReply, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequiredPrivate.connect(this, "emitAuthenticationRequired(QNetworkReply, QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QNetworkAccessManager_QObject(long parent);

/**
Returns the cache that is used to store data obtained from the network. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#setCache(com.trolltech.qt.network.QAbstractNetworkCache) setCache()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractNetworkCache cache()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cache(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QAbstractNetworkCache __qt_cache(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.network.QNetworkCookieJar QNetworkCookieJar} that is used to store cookies obtained from the network as well as cookies that are about to be sent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) setCookieJar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkCookieJar cookieJar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cookieJar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkCookieJar __qt_cookieJar(long __this__nativeId);

/**
This function is used to post a request to obtain the contents of the target <tt>request</tt>. It will cause the contents to be downloaded, along with the headers associated with it. It returns a new {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object opened for reading which emits its {@link com.trolltech.qt.core.QIODevice#readyRead QIODevice::readyRead() } signal whenever new data arrives. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#post(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) post()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#put(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) put()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply get(com.trolltech.qt.network.QNetworkRequest request)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_get_QNetworkRequest(nativeId(), request == null ? 0 : request.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_get_QNetworkRequest(long __this__nativeId, long request);

/**
This function is used to post a request to obtain the network headers for <tt>request</tt>. It takes its name after the HTTP request associated (HEAD). It returns a new {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object which will contain such headers.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply head(com.trolltech.qt.network.QNetworkRequest request)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_head_QNetworkRequest(nativeId(), request == null ? 0 : request.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_head_QNetworkRequest(long __this__nativeId, long request);

/**
This function is used to send an HTTP POST request to the destination specified by <tt>request</tt>. The contents of the <tt>data</tt> device will be uploaded to the server. <p><tt>data</tt> must be opened for reading when this function is called and must remain valid until the {@link com.trolltech.qt.network.QNetworkAccessManager#finished finished() } signal is emitted for this reply. <p>The returned {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object will be open for reading and will contain the reply sent by the server to the POST request. <p>Note: sending a POST request on protocols other than HTTP and HTTPS is undefined and will probably fail. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#get(com.trolltech.qt.network.QNetworkRequest) get()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#put(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) put()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply post(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.core.QIODevice data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_post_QNetworkRequest_QIODevice(nativeId(), request == null ? 0 : request.nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_post_QNetworkRequest_QIODevice(long __this__nativeId, long request, long data);

/**
This is an overloaded member function, provided for convenience. <p>This function sends the contents of the <tt>data</tt> byte array to the destination specified by <tt>request</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply post(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_post_QNetworkRequest_QByteArray(nativeId(), request == null ? 0 : request.nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_post_QNetworkRequest_QByteArray(long __this__nativeId, long request, long data);

/**
Returns the {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} that the requests sent using this QNetworkAccessManager object will use. The default value for the proxy is {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::DefaultProxy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, {@link com.trolltech.qt.network.QNetworkAccessManager#setProxyFactory(com.trolltech.qt.network.QNetworkProxyFactory) setProxyFactory()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#proxyAuthenticationRequired proxyAuthenticationRequired() }. <br></DD></DT>
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
Returns the proxy factory that this QNetworkAccessManager object is using to determine the proxies to be used for requests. <p>Note that the pointer returned by this function is managed by QNetworkAccessManager and could be deleted at any time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#setProxyFactory(com.trolltech.qt.network.QNetworkProxyFactory) setProxyFactory()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#proxy() proxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkProxyFactory proxyFactory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_proxyFactory(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkProxyFactory __qt_proxyFactory(long __this__nativeId);

/**
This function is used to upload the contents of <tt>data</tt> to the destination <tt>request</tt>. <p><tt>data</tt> must be opened for reading when this function is called and must remain valid until the {@link com.trolltech.qt.network.QNetworkAccessManager#finished finished() } signal is emitted for this reply. <p>The returned {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object will be open for reply, but whether anything will be available for reading is protocol dependent. For HTTP, the server may send a small HTML page indicating the upload was successful (or not). Other protocols will probably have content in their replies. <p>For HTTP, this request will send a PUT request, which most servers do not allow. Form upload mechanisms, including that of uploading files through HTML forms, use the POST mechanism. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#get(com.trolltech.qt.network.QNetworkRequest) get()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#post(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) post()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply put(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.core.QIODevice data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_put_QNetworkRequest_QIODevice(nativeId(), request == null ? 0 : request.nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_put_QNetworkRequest_QIODevice(long __this__nativeId, long request, long data);

/**
This is an overloaded member function, provided for convenience. <p>This function sends the contents of the <tt>data</tt> byte array to the destination specified by <tt>request</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply put(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_put_QNetworkRequest_QByteArray(nativeId(), request == null ? 0 : request.nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_put_QNetworkRequest_QByteArray(long __this__nativeId, long request, long data);

/**
Sets the manager's network cache to be the <tt>cache</tt> specified. The cache is used for all requests dispatched by the manager. <p>Use this function to set the network cache object to a class that implements additional features, like saving the cookies to permanent storage. <p><b>Note:</b>QNetworkAccessManager takes ownership of the <tt>cache</tt> object. <p>QNetworkAccessManager by default does not have a set cache. Qt provides a simple disk cache, {@link com.trolltech.qt.network.QNetworkDiskCache QNetworkDiskCache}, which can be used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#cache() cache()}, and {@link com.trolltech.qt.network.QNetworkRequest.CacheLoadControl QNetworkRequest::CacheLoadControl }. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCache(com.trolltech.qt.network.QAbstractNetworkCache cache)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCache_QAbstractNetworkCache(nativeId(), cache == null ? 0 : cache.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCache_QAbstractNetworkCache(long __this__nativeId, long cache);

/**
Sets the manager's cookie jar to be the <tt>cookieJar</tt> specified. The cookie jar is used by all requests dispatched by the manager. <p>Use this function to set the cookie jar object to a class that implements additional features, like saving the cookies to permanent storage. <p><b>Note:</b>QNetworkAccessManager takes ownership of the <tt>cookieJar</tt> object. <p>QNetworkAccessManager will set the parent of the <tt>cookieJar</tt> passed to itself, so that the cookie jar is deleted when this object is deleted as well. If you want to share cookie jars between different QNetworkAccessManager objects, you may want to set the cookie jar's parent to 0 after calling this function. <p>QNetworkAccessManager by default does not implement any cookie policy of its own: it accepts all cookies sent by the server, as long as they are well formed and meet the minimum security requirements (cookie domain matches the request's and cookie path matches the request's). In order to implement your own security policy, override the {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) QNetworkCookieJar::cookiesForUrl()} and {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) QNetworkCookieJar::setCookiesFromUrl()} virtual functions. Those functions are called by QNetworkAccessManager when it detects a new cookie. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#cookieJar() cookieJar()}, {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) QNetworkCookieJar::cookiesForUrl()}, and {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) QNetworkCookieJar::setCookiesFromUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCookieJar(com.trolltech.qt.network.QNetworkCookieJar cookieJar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (cookieJar != null) {
            cookieJar.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCookieJar_QNetworkCookieJar(nativeId(), cookieJar == null ? 0 : cookieJar.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCookieJar_QNetworkCookieJar(long __this__nativeId, long cookieJar);

/**
Sets the proxy to be used in future requests to be <tt>proxy</tt>. This does not affect requests that have already been sent. The {@link com.trolltech.qt.network.QNetworkAccessManager#proxyAuthenticationRequired proxyAuthenticationRequired() } signal will be emitted if the proxy requests authentication. <p>A proxy set with this function will be used for all requests issued by QNetworkAccessManager. In some cases, it might be necessary to select different proxies depending on the type of request being sent or the destination host. If that's the case, you should consider using {@link com.trolltech.qt.network.QNetworkAccessManager#setProxyFactory(com.trolltech.qt.network.QNetworkProxyFactory) setProxyFactory()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxy() proxy()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#proxyAuthenticationRequired proxyAuthenticationRequired() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProxy(com.trolltech.qt.network.QNetworkProxy proxy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProxy_QNetworkProxy(nativeId(), proxy == null ? 0 : proxy.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setProxy_QNetworkProxy(long __this__nativeId, long proxy);

/**
Sets the proxy factory for this class to be <tt>factory</tt>. A proxy factory is used to determine a more specific list of proxies to be used for a given request, instead of trying to use the same proxy value for all requests. <p>All queries sent by QNetworkAccessManager will have type {@link com.trolltech.qt.network.QNetworkProxyQuery.QueryType QNetworkProxyQuery::UrlRequest }. <p>For example, a proxy factory could apply the following rules: <ul><li> if the target address is in the local network (for example, if the hostname contains no dots or if it's an IP address in the organization's range), return {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::NoProxy }</li><li> if the request is FTP, return an FTP proxy</li><li> if the request is HTTP or HTTPS, then return an HTTP proxy</li><li> otherwise, return a SOCKSv5 proxy server</li></ul> The lifetime of the object <tt>factory</tt> will be managed by QNetworkAccessManager. It will delete the object when necessary. <p><b>Note:</b> If a specific proxy is set with {@link com.trolltech.qt.network.QNetworkAccessManager#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, the factory will not be used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxyFactory() proxyFactory()}, {@link com.trolltech.qt.network.QNetworkAccessManager#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, and {@link com.trolltech.qt.network.QNetworkProxyQuery QNetworkProxyQuery}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProxyFactory(com.trolltech.qt.network.QNetworkProxyFactory factory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (factory != null) {
            factory.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProxyFactory_QNetworkProxyFactory(nativeId(), factory == null ? 0 : factory.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setProxyFactory_QNetworkProxyFactory(long __this__nativeId, long factory);


/**
Returns a new {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object to handle the operation <tt>op</tt> and request <tt>req</tt>. The device <tt>outgoingData</tt> is always 0 for Get and Head requests, but is the value passed to {@link com.trolltech.qt.network.QNetworkAccessManager#post(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) post()} and {@link com.trolltech.qt.network.QNetworkAccessManager#put(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) put()} in those operations (the {@link com.trolltech.qt.core.QByteArray QByteArray} variants will pass a {@link com.trolltech.qt.core.QBuffer QBuffer} object). <p>The default implementation calls {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) QNetworkCookieJar::cookiesForUrl()} on the cookie jar set with {@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) setCookieJar()} to obtain the cookies to be sent to the remote server. <p>The returned object must be in an open state.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.network.QNetworkReply createRequest(com.trolltech.qt.network.QNetworkAccessManager.Operation op, com.trolltech.qt.network.QNetworkRequest request) {
        return createRequest(op, request, (com.trolltech.qt.core.QIODevice)null);
    }
/**
Returns a new {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} object to handle the operation <tt>op</tt> and request <tt>req</tt>. The device <tt>outgoingData</tt> is always 0 for Get and Head requests, but is the value passed to {@link com.trolltech.qt.network.QNetworkAccessManager#post(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) post()} and {@link com.trolltech.qt.network.QNetworkAccessManager#put(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.core.QIODevice) put()} in those operations (the {@link com.trolltech.qt.core.QByteArray QByteArray} variants will pass a {@link com.trolltech.qt.core.QBuffer QBuffer} object). <p>The default implementation calls {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) QNetworkCookieJar::cookiesForUrl()} on the cookie jar set with {@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) setCookieJar()} to obtain the cookies to be sent to the remote server. <p>The returned object must be in an open state.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.network.QNetworkReply createRequest(com.trolltech.qt.network.QNetworkAccessManager.Operation op, com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.core.QIODevice outgoingData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createRequest_Operation_QNetworkRequest_QIODevice(nativeId(), op.value(), request == null ? 0 : request.nativeId(), outgoingData == null ? 0 : outgoingData.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkReply __qt_createRequest_Operation_QNetworkRequest_QIODevice(long __this__nativeId, int op, long request, long outgoingData);

/**
@exclude
*/

    public static native QNetworkAccessManager fromNativePointer(QNativePointer nativePointer);

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

    protected QNetworkAccessManager(QPrivateConstructor p) { super(p); } 

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkProxy(named: proxy), com.trolltech.qt.network.QAuthenticator(named: authenticator)&gt;:<p> This signal is emitted whenever a proxy requests authentication and QNetworkAccessManager cannot find a valid, cached credential. The slot connected to this signal should fill in the credentials for the proxy <tt>proxy</tt> in the <tt>authenticator</tt> object. <p>QNetworkAccessManager will cache the credentials internally. The next time the proxy requests authentication, QNetworkAccessManager will automatically send the same credential without emitting the proxyAuthenticationRequired signal again. <p>If the proxy rejects the credentials, QNetworkAccessManager will emit the signal again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxy() proxy()}, {@link com.trolltech.qt.network.QNetworkAccessManager#setProxy(com.trolltech.qt.network.QNetworkProxy) setProxy()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#authenticationRequired authenticationRequired() }. <br></DD></DT>
*/

    public Signal2<QNetworkProxy, QAuthenticator> proxyAuthenticationRequired = new Signal2<QNetworkProxy, QAuthenticator>();
    private boolean inEmission = false;

    private void emitProxyAuthenticationRequiredPrivate(QNetworkProxy proxy, QAuthenticator authenticator)
    {
        if (!inEmission)
        {
            inEmission = true;
            proxyAuthenticationRequiredPrivate.emit(proxy, authenticator.nativePointer());
            inEmission = false;
        }
    }

    private void emitProxyAuthenticationRequired(QNetworkProxy proxy, QNativePointer authenticator)
    {
        if (!inEmission)
        {
            inEmission = true;
            proxyAuthenticationRequired.emit(proxy, QAuthenticator.fromNativePointer(authenticator));
            inEmission = false;
        }
    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply(named: reply), com.trolltech.qt.network.QAuthenticator(named: authenticator)&gt;:<p> This signal is emitted whenever a final server requests authentication before it delivers the requested contents. The slot connected to this signal should fill the credentials for the contents (which can be determined by inspecting the <tt>reply</tt> object) in the <tt>authenticator</tt> object. <p>QNetworkAccessManager will cache the credentials internally and will send the same values if the server requires authentication again, without emitting the {@link com.trolltech.qt.network.QNetworkAccessManager#authenticationRequired authenticationRequired() } signal. If it rejects the credentials, this signal will be emitted again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#proxyAuthenticationRequired proxyAuthenticationRequired() }. <br></DD></DT>
*/

    public Signal2<QNetworkReply, QAuthenticator> authenticationRequired = new Signal2<QNetworkReply, QAuthenticator>();
    private boolean inEmissionAuthenticationRequired = false;

    private void emitAuthenticationRequiredPrivate(QNetworkReply reply, QAuthenticator authenticator)
    {
        if (!inEmissionAuthenticationRequired)
        {
            inEmissionAuthenticationRequired = true;
            authenticationRequiredPrivate.emit(reply, authenticator.nativePointer());
            inEmissionAuthenticationRequired = false;
        }
    }

    private void emitAuthenticationRequired(QNetworkReply reply, QNativePointer authenticator)
    {
        if (!inEmissionAuthenticationRequired)
        {
            inEmissionAuthenticationRequired = true;
            authenticationRequired.emit(reply, QAuthenticator.fromNativePointer(authenticator));
            inEmissionAuthenticationRequired = false;
        }
    }

}
