package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHttp class provides an implementation of the HTTP protocol. This class provides a direct interface to HTTP that allows you to have more control over the requests and that allows you to access the response header fields. However, for new applications, it is recommended to use {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} and {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, as those classes possess a simpler, yet more powerful API. <p>The class works asynchronously, so there are no blocking functions. If an operation cannot be executed immediately, the function will still return straight away and the operation will be scheduled for later execution. The results of scheduled operations are reported via signals. This approach depends on the event loop being in operation. <p>The operations that can be scheduled (they are called "requests" in the rest of the documentation) are the following: {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()} and {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}. <p>All of these requests return a unique identifier that allows you to keep track of the request that is currently executed. When the execution of a request starts, the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal with the identifier is emitted and when the request is finished, the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted with the identifier and a bool that indicates if the request finished with an error. <p>To make an HTTP request you must set up suitable HTTP headers. The following example demonstrates, how to request the main HTML page from the Trolltech home page (i.e., the URL <tt>http://qtsoftware.com/index.html</tt>): <pre class="snippet">
    QHttp http = new QHttp();
    QHttpRequestHeader header = new QHttpRequestHeader("GET", "/index.html");
    header.setValue("Host", "www.trolltech.com");
    http.setHost("www.trolltech.com", 80);
    http.request(header);
</pre> For the common HTTP requests <tt>GET</tt>, <tt>POST</tt> and <tt>HEAD</tt>, QHttp provides the convenience functions {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()} and {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}. They already use a reasonable header and if you don't have to set special header fields, they are easier to use. The above example can also be written as: <pre class="snippet">
    http.setHost("www.trolltech.com", 80); // id == 1
    http.get("/index.html");           // id == 2
</pre> For this example the following sequence of signals is emitted (with small variations, depending on network traffic, etc.): <pre class="snippet">
    requestStarted(1)
    requestFinished(1, false)

    requestStarted(2)
    stateChanged(Connecting)
    stateChanged(Sending)
    dataSendProgress(77, 77)
    stateChanged(Reading)
    responseHeaderReceived(responseheader)
    dataReadProgress(5388, 0)
    readyRead(responseheader)
    dataReadProgress(18300, 0)
    readyRead(responseheader)
    stateChanged(Connected)
    requestFinished(2, false)

    done(false)

    stateChanged(Closing)
    stateChanged(Unconnected)
</pre> The {@link com.trolltech.qt.network.QHttp#dataSendProgress dataSendProgress() } and {@link com.trolltech.qt.network.QHttp#dataReadProgress dataReadProgress() } signals in the above example are useful if you want to show a {@link com.trolltech.qt.gui.QProgressBar progress bar} to inform the user about the progress of the download. The second argument is the total size of data. In certain cases it is not possible to know the total amount in advance, in which case the second argument is 0. (If you connect to a {@link com.trolltech.qt.gui.QProgressBar QProgressBar} a total of 0 results in a busy indicator.) <p>When the response header is read, it is reported with the {@link com.trolltech.qt.network.QHttp#responseHeaderReceived responseHeaderReceived() } signal. <p>The {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal tells you that there is data ready to be read. The amount of data can then be queried with the {@link com.trolltech.qt.network.QHttp#bytesAvailable() bytesAvailable()} function and it can be read with the {@link com.trolltech.qt.network.QHttp#read(byte[]) read()} or {@link com.trolltech.qt.network.QHttp#readAll() readAll()} functions. <p>If an error occurs during the execution of one of the commands in a sequence of commands, all the pending commands (i.e. scheduled, but not yet executed commands) are cleared and no signals are emitted for them. <p>For example, if you have the following sequence of requests <pre class="snippet">
    http.setHost("www.foo.bar", 80);       // id == 1
    http.get("/index.html");           // id == 2
    http.post("register.html", data);  // id == 3
</pre> and the {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()} request fails because the host lookup fails, then the {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()} request is never executed and the signals would look like this: <pre class="snippet">
    requestStarted(1)
    requestFinished(1, false)

    requestStarted(2)
    stateChanged(HostLookup)
    requestFinished(2, true)

    done(true)

    stateChanged(Unconnected)
</pre> You can then get details about the error with the {@link com.trolltech.qt.network.QHttp#error() error()} and {@link com.trolltech.qt.network.QHttp#errorString() errorString()} functions. Note that only unexpected behavior, like network failure is considered as an error. If the server response contains an error status, like a 404 response, this is reported as a normal response case. So you should always check the {@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() status code} of the response header. <p>The functions {@link com.trolltech.qt.network.QHttp#currentId() currentId()} and {@link com.trolltech.qt.network.QHttp#currentRequest() currentRequest()} provide more information about the currently executing request. <p>The functions {@link com.trolltech.qt.network.QHttp#hasPendingRequests() hasPendingRequests()} and {@link com.trolltech.qt.network.QHttp#clearPendingRequests() clearPendingRequests()} allow you to query and clear the list of pending requests. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp QFtp}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}, {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, {@link <a href="../qtjambi-http.html">HTTP Example</a>}, and {@link <a href="../network-torrent.html">Torrent Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHttp extends com.trolltech.qt.core.QObject
{

    private Object __rcSocket = null;

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum identifies the error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#error() error()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Error implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 An error other than those specified above occurred.
*/

        UnknownError(1),
/**
 The host name lookup failed.
*/

        HostNotFound(2),
/**
 The server refused the connection.
*/

        ConnectionRefused(3),
/**
 The server closed the connection unexpectedly.
*/

        UnexpectedClose(4),
/**
 The server sent an invalid response header.
*/

        InvalidResponseHeader(5),
/**
 The client could not read the content correctly because an error with respect to the content length occurred.
*/

        WrongContentLength(6),
/**
 The request was aborted with {@link com.trolltech.qt.network.QHttp#abort() abort()}.
*/

        Aborted(7),
/**
 The web server requires authentication to complete the request.
*/

        AuthenticationRequiredError(8),
/**
 {@link com.trolltech.qt.network.QHttp QHttp} is using a proxy, and the proxy server requires authentication to establish a connection.
*/

        ProxyAuthenticationRequiredError(9);

        Error(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHttp$Error constant with the specified <tt>int</tt>.</brief>
*/

        public static Error resolve(int value) {
            return (Error) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return UnknownError;
            case 2: return HostNotFound;
            case 3: return ConnectionRefused;
            case 4: return UnexpectedClose;
            case 5: return InvalidResponseHeader;
            case 6: return WrongContentLength;
            case 7: return Aborted;
            case 8: return AuthenticationRequiredError;
            case 9: return ProxyAuthenticationRequiredError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used to specify the mode of connection to use. When using the Https mode, care should be taken to connect to the sslErrors signal, and handle possible Ssl errors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ConnectionMode implements com.trolltech.qt.QtEnumerator {
/**
 The connection is a regular Http connection to the server
*/

        ConnectionModeHttp(0),
/**
 The Https protocol is used and the connection is encrypted using SSL.
*/

        ConnectionModeHttps(1);

        ConnectionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHttp$ConnectionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ConnectionMode resolve(int value) {
            return (ConnectionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ConnectionModeHttp;
            case 1: return ConnectionModeHttps;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used to specify the state the client is in. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#stateChanged stateChanged() }, and {@link com.trolltech.qt.network.QHttp#state() state()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 There is no connection to the host.
*/

        Unconnected(0),
/**
 A host name lookup is in progress.
*/

        HostLookup(1),
/**
 An attempt to connect to the host is in progress.
*/

        Connecting(2),
/**
 The client is sending its request to the server.
*/

        Sending(3),
/**
 The client's request has been sent and the client is reading the server's response.
*/

        Reading(4),
/**
 The connection to the host is open, but the client is neither sending a request, nor waiting for a response.
*/

        Connected(5),
/**
 The connection is closing down, but is not yet closed. (The state will be <tt>Unconnected</tt> when the connection is closed.)
*/

        Closing(6);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHttp$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Unconnected;
            case 1: return HostLookup;
            case 2: return Connecting;
            case 3: return Sending;
            case 4: return Reading;
            case 5: return Connected;
            case 6: return Closing;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: hostname), java.lang.Character(named: port), com.trolltech.qt.QNativePointer(named: authenticator)&gt;:<p> This signal can be emitted when a web server on a given <tt>hostname</tt> and <tt>port</tt> requires authentication. The <tt>authenticator</tt> object can then be filled in with the required details to allow authentication and continue the connection. <p><b>Note:</b> It is not possible to use a QueuedConnection to connect to this signal, as the connection will fail if the authenticator has not been filled in with new information when the signal returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator QAuthenticator}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/

    private final Signal3<java.lang.String, java.lang.Character, com.trolltech.qt.QNativePointer> authenticationRequiredPrivate = new Signal3<java.lang.String, java.lang.Character, com.trolltech.qt.QNativePointer>();

    private final void authenticationRequiredPrivate(java.lang.String hostname, char port, com.trolltech.qt.QNativePointer arg__3)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_authenticationRequiredPrivate_String_char_nativepointer(nativeId(), hostname, port, arg__3);
    }
    native void __qt_authenticationRequiredPrivate_String_char_nativepointer(long __this__nativeId, java.lang.String hostname, char port, com.trolltech.qt.QNativePointer arg__3);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: done), java.lang.Integer(named: total)&gt;:<p> This signal is emitted when this object reads data from a HTTP server to indicate the current progress of the download. <p><tt>done</tt> is the amount of data that has already arrived and <tt>total</tt> is the total amount of data. It is possible that the total amount of data that should be transferred cannot be determined, in which case <tt>total</tt> is 0.(If you connect to a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}, the progress bar shows a busy indicator if the total is 0). <p><b>Warning:</b><tt>done</tt> and <tt>total</tt> are not necessarily the size in bytes, since for large files these values might need to be "scaled" to avoid overflow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#dataSendProgress dataSendProgress() }, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, and {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> dataReadProgress = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void dataReadProgress(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataReadProgress_int_int(nativeId(), arg__1, arg__2);
    }
    native void __qt_dataReadProgress_int_int(long __this__nativeId, int arg__1, int arg__2);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: done), java.lang.Integer(named: total)&gt;:<p> This signal is emitted when this object sends data to a HTTP server to inform it about the progress of the upload. <p><tt>done</tt> is the amount of data that has already arrived and <tt>total</tt> is the total amount of data. It is possible that the total amount of data that should be transferred cannot be determined, in which case <tt>total</tt> is 0.(If you connect to a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}, the progress bar shows a busy indicator if the total is 0). <p><b>Warning:</b><tt>done</tt> and <tt>total</tt> are not necessarily the size in bytes, since for large files these values might need to be "scaled" to avoid overflow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#dataReadProgress dataReadProgress() }, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, and {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> dataSendProgress = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void dataSendProgress(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataSendProgress_int_int(nativeId(), arg__1, arg__2);
    }
    native void __qt_dataSendProgress_int_int(long __this__nativeId, int arg__1, int arg__2);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: error)&gt;:<p> This signal is emitted when the last pending request has finished; (it is emitted after the last request's {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal). <tt>error</tt> is true if an error occurred during the processing; otherwise <tt>error</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, {@link com.trolltech.qt.network.QHttp#error() error()}, and {@link com.trolltech.qt.network.QHttp#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> done = new Signal1<java.lang.Boolean>();

    private final void done(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_boolean(nativeId(), arg__1);
    }
    native void __qt_done_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkProxy(named: proxy), com.trolltech.qt.QNativePointer(named: authenticator)&gt;:<p> This signal can be emitted when a <tt>proxy</tt> that requires authentication is used. The <tt>authenticator</tt> object can then be filled in with the required details to allow authentication and continue the connection. <p><b>Note:</b> It is not possible to use a QueuedConnection to connect to this signal, as the connection will fail if the authenticator has not been filled in with new information when the signal returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator QAuthenticator}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/

    private final Signal2<com.trolltech.qt.network.QNetworkProxy, com.trolltech.qt.QNativePointer> proxyAuthenticationRequiredPrivate = new Signal2<com.trolltech.qt.network.QNetworkProxy, com.trolltech.qt.QNativePointer>();

    private final void proxyAuthenticationRequiredPrivate(com.trolltech.qt.network.QNetworkProxy proxy, com.trolltech.qt.QNativePointer arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_proxyAuthenticationRequiredPrivate_QNetworkProxy_nativepointer(nativeId(), proxy == null ? 0 : proxy.nativeId(), arg__2);
    }
    native void __qt_proxyAuthenticationRequiredPrivate_QNetworkProxy_nativepointer(long __this__nativeId, long proxy, com.trolltech.qt.QNativePointer arg__2);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QHttpResponseHeader(named: resp)&gt;:<p> This signal is emitted when there is new response data to read. <p>If you specified a device in the request where the data should be written to, then this signal is not emitted; instead the data is written directly to the device. <p>The response header is passed in <tt>resp</tt>. <p>You can read the data with the {@link com.trolltech.qt.network.QHttp#readAll() readAll()} or {@link com.trolltech.qt.network.QHttp#read(byte[]) read()} functions <p>This signal is useful if you want to process the data in chunks as soon as it becomes available. If you are only interested in the complete data, just connect to the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal and read the data then instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#readAll() readAll()}, {@link com.trolltech.qt.network.QHttp#read(byte[]) read()}, and {@link com.trolltech.qt.network.QHttp#bytesAvailable() bytesAvailable()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QHttpResponseHeader> readyRead = new Signal1<com.trolltech.qt.network.QHttpResponseHeader>();

    private final void readyRead(com.trolltech.qt.network.QHttpResponseHeader resp)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readyRead_QHttpResponseHeader(nativeId(), resp == null ? 0 : resp.nativeId());
    }
    native void __qt_readyRead_QHttpResponseHeader(long __this__nativeId, long resp);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: id), java.lang.Boolean(named: error)&gt;:<p> This signal is emitted when processing the request identified by <tt>id</tt> has finished. <tt>error</tt> is true if an error occurred during the processing; otherwise <tt>error</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#done done() }, {@link com.trolltech.qt.network.QHttp#error() error()}, and {@link com.trolltech.qt.network.QHttp#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Boolean> requestFinished = new Signal2<java.lang.Integer, java.lang.Boolean>();

    private final void requestFinished(int arg__1, boolean arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_requestFinished_int_boolean(nativeId(), arg__1, arg__2);
    }
    native void __qt_requestFinished_int_boolean(long __this__nativeId, int arg__1, boolean arg__2);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: id)&gt;:<p> This signal is emitted when processing the request identified by <tt>id</tt> starts. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> requestStarted = new Signal1<java.lang.Integer>();

    private final void requestStarted(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_requestStarted_int(nativeId(), arg__1);
    }
    native void __qt_requestStarted_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QHttpResponseHeader(named: resp)&gt;:<p> This signal is emitted when the HTTP header of a server response is available. The header is passed in <tt>resp</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, and {@link com.trolltech.qt.network.QHttp#readyRead readyRead() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QHttpResponseHeader> responseHeaderReceived = new Signal1<com.trolltech.qt.network.QHttpResponseHeader>();

    private final void responseHeaderReceived(com.trolltech.qt.network.QHttpResponseHeader resp)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_responseHeaderReceived_QHttpResponseHeader(nativeId(), resp == null ? 0 : resp.nativeId());
    }
    native void __qt_responseHeaderReceived_QHttpResponseHeader(long __this__nativeId, long resp);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<com.trolltech.qt.network.QSslError>(named: errors)&gt;:<p> Forwards the sslErrors signal from the {@link com.trolltech.qt.network.QSslSocket QSslSocket} used in QHttp. <tt>errors</tt> is the list of errors that occurred during the SSL handshake. Unless you call {@link com.trolltech.qt.network.QHttp#ignoreSslErrors() ignoreSslErrors()} from within a slot connected to this signal when an error occurs, QHttp will tear down the connection immediately after emitting the signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, and {@link com.trolltech.qt.network.QSslSocket#ignoreSslErrors() QSslSocket::ignoreSslErrors()}. <br></DD></DT>
*/

    public final Signal1<java.util.List<com.trolltech.qt.network.QSslError>> sslErrors = new Signal1<java.util.List<com.trolltech.qt.network.QSslError>>();

    private final void sslErrors(java.util.List<com.trolltech.qt.network.QSslError> errors)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sslErrors_List(nativeId(), errors);
    }
    native void __qt_sslErrors_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QSslError> errors);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: state)&gt;:<p> This signal is emitted when the state of the QHttp object changes. The argument <tt>state</tt> is the new state of the connection; it is one of the {@link com.trolltech.qt.network.QHttp.State State } values. <p>This usually happens when a request is started, but it can also happen when the server closes the connection or when a call to {@link com.trolltech.qt.network.QHttp#close() close()} succeeded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#close() close()}, {@link com.trolltech.qt.network.QHttp#state() state()}, and {@link com.trolltech.qt.network.QHttp.State State }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> stateChanged = new Signal1<java.lang.Integer>();

    private final void stateChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_int(nativeId(), arg__1);
    }
    native void __qt_stateChanged_int(long __this__nativeId, int arg__1);


/**
Constructs a QHttp object. The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor.
*/

    public QHttp() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QHttp object. The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor.
*/

    public QHttp(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QHttp_QObject(parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        proxyAuthenticationRequiredPrivate.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequired.connect(this, "emitAuthenticationRequiredPrivate(String, int, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequiredPrivate.connect(this, "emitAuthenticationRequired(String, char, QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QHttp_QObject(long parent);


    private QHttp(java.lang.String hostname, com.trolltech.qt.network.QHttp.ConnectionMode mode, char port) {
        this(hostname, mode, port, (com.trolltech.qt.core.QObject)null);
    }
    private QHttp(java.lang.String hostname, com.trolltech.qt.network.QHttp.ConnectionMode mode, char port, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QHttp_String_ConnectionMode_char_QObject(hostname, mode.value(), port, parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        proxyAuthenticationRequiredPrivate.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequired.connect(this, "emitAuthenticationRequiredPrivate(String, int, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequiredPrivate.connect(this, "emitAuthenticationRequired(String, char, QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QHttp_String_ConnectionMode_char_QObject(java.lang.String hostname, int mode, char port, long parent);


    private QHttp(java.lang.String hostname, char port) {
        this(hostname, port, (com.trolltech.qt.core.QObject)null);
    }
    private QHttp(java.lang.String hostname, char port, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QHttp_String_char_QObject(hostname, port, parent == null ? 0 : parent.nativeId());
        proxyAuthenticationRequired.connect(this, "emitProxyAuthenticationRequiredPrivate(QNetworkProxy, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        proxyAuthenticationRequiredPrivate.connect(this, "emitProxyAuthenticationRequired(QNetworkProxy,QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequired.connect(this, "emitAuthenticationRequiredPrivate(String, int, QAuthenticator)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);
        authenticationRequiredPrivate.connect(this, "emitAuthenticationRequired(String, char, QNativePointer)", com.trolltech.qt.core.Qt.ConnectionType.DirectConnection);

    }

    native void __qt_QHttp_String_char_QObject(java.lang.String hostname, char port, long parent);

/**
Aborts the current request and deletes all scheduled requests. <p>For the current request, the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal with the <tt>error</tt> argument <tt>true</tt> is emitted. For all other requests that are affected by the {@link com.trolltech.qt.network.QHttp#abort() abort()}, no signals are emitted. <p>Since this slot also deletes the scheduled requests, there are no requests left and the {@link com.trolltech.qt.network.QHttp#done done() } signal is emitted (with the <tt>error</tt> argument <tt>true</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#clearPendingRequests() clearPendingRequests()}. <br></DD></DT>
*/

    public final void abort()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_abort(nativeId());
    }
    native void __qt_abort(long __this__nativeId);

/**
Returns the number of bytes that can be read from the response content at the moment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#readyRead readyRead() }, {@link com.trolltech.qt.network.QHttp#read(byte[]) read()}, and {@link com.trolltech.qt.network.QHttp#readAll() readAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long bytesAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesAvailable(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesAvailable(long __this__nativeId);

/**
Deletes all pending requests from the list of scheduled requests. This does not affect the request that is being executed. If you want to stop this this as well, use {@link com.trolltech.qt.network.QHttp#abort() abort()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#hasPendingRequests() hasPendingRequests()}, and {@link com.trolltech.qt.network.QHttp#abort() abort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearPendingRequests()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearPendingRequests(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearPendingRequests(long __this__nativeId);

/**
Closes the connection; this is useful if you have a keep-alive connection and want to close it. <p>For the requests issued with {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()} and {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, QHttp sets the connection to be keep-alive. You can also do this using the header you pass to the {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()} function. QHttp only closes the connection to the HTTP server if the response header requires it to do so. <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p>If you want to close the connection immediately, you have to use {@link com.trolltech.qt.network.QHttp#abort() abort()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#stateChanged stateChanged() }, {@link com.trolltech.qt.network.QHttp#abort() abort()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    @QtBlockedSlot
    native int __qt_close(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.core.QIODevice QIODevice} pointer that is used as to store the data of the HTTP request being executed. If there is no current request or if the request does not store the data to an IO device, this function returns 0. <p>This function can be used to delete the {@link com.trolltech.qt.core.QIODevice QIODevice} in the slot connected to the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#currentSourceDevice() currentSourceDevice()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, and {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice currentDestinationDevice()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentDestinationDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_currentDestinationDevice(long __this__nativeId);

/**
Returns the identifier of the HTTP request being executed or 0 if there is no request being executed (i. . they've all finished). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#currentRequest() currentRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentId(long __this__nativeId);

/**
Returns the request header of the HTTP request being executed. If the request is one issued by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or {@link com.trolltech.qt.network.QHttp#close() close()}, it returns an invalid request header, i.e. {@link com.trolltech.qt.network.QHttpHeader#isValid() QHttpRequestHeader::isValid()} returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#currentId() currentId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHttpRequestHeader currentRequest()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentRequest(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHttpRequestHeader __qt_currentRequest(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.core.QIODevice QIODevice} pointer that is used as the data source of the HTTP request being executed. If there is no current request or if the request does not use an IO device as the data source, this function returns 0. <p>This function can be used to delete the {@link com.trolltech.qt.core.QIODevice QIODevice} in the slot connected to the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#currentDestinationDevice() currentDestinationDevice()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, and {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice currentSourceDevice()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentSourceDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_currentSourceDevice(long __this__nativeId);

/**
Returns the last error that occurred. This is useful to find out what happened when receiving a {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } or a {@link com.trolltech.qt.network.QHttp#done done() } signal with the <tt>error</tt> argument <tt>true</tt>. <p>If you start a new request, the error status is reset to <tt>NoError</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHttp.Error error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QHttp.Error.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a human-readable description of the last error that occurred. This is useful to present a error message to the user when receiving a {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } or a {@link com.trolltech.qt.network.QHttp#done done() } signal with the <tt>error</tt> argument <tt>true</tt>.
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
Sends a get request for <tt>path</tt> to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. <p><tt>path</tt> must be a absolute path like <tt>/index.html</tt> or an absolute URI like <tt>http://qtsoftware.com/index.html</tt> and must be encoded with either {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()} or {@link com.trolltech.qt.core.QUrl#encodedPath() QUrl::encodedPath()}. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted).<a name="request-processing"><h2>Request Processing</h2> The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int get(java.lang.String path) {
        return get(path, (com.trolltech.qt.core.QIODevice)null);
    }
/**
Sends a get request for <tt>path</tt> to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. <p><tt>path</tt> must be a absolute path like <tt>/index.html</tt> or an absolute URI like <tt>http://qtsoftware.com/index.html</tt> and must be encoded with either {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()} or {@link com.trolltech.qt.core.QUrl#encodedPath() QUrl::encodedPath()}. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted).<a name="request-processing"><h2>Request Processing</h2> The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int get(java.lang.String path, com.trolltech.qt.core.QIODevice to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_get_String_QIODevice(nativeId(), path, to == null ? 0 : to.nativeId());
    }
    @QtBlockedSlot
    native int __qt_get_String_QIODevice(long __this__nativeId, java.lang.String path, long to);

/**
Returns true if there are any requests scheduled that have not yet been executed; otherwise returns false. <p>The request that is being executed is not considered as a scheduled request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#clearPendingRequests() clearPendingRequests()}, {@link com.trolltech.qt.network.QHttp#currentId() currentId()}, and {@link com.trolltech.qt.network.QHttp#currentRequest() currentRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasPendingRequests()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasPendingRequests(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasPendingRequests(long __this__nativeId);

/**
Sends a header request for <tt>path</tt> to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. <p><tt>path</tt> must be an absolute path like <tt>/index.html</tt> or an absolute URI like <tt>http://qtsoftware.com/index.html</tt>. <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int head(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_head_String(nativeId(), path);
    }
    @QtBlockedSlot
    native int __qt_head_String(long __this__nativeId, java.lang.String path);

/**
Tells the {@link com.trolltech.qt.network.QSslSocket QSslSocket} used for the Http connection to ignore the errors reported in the {@link com.trolltech.qt.network.QHttp#sslErrors sslErrors() } signal. <p>Note that this function must be called from within a slot connected to the {@link com.trolltech.qt.network.QHttp#sslErrors sslErrors() } signal to have any effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}, and {@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}. <br></DD></DT>
*/

    public final void ignoreSslErrors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ignoreSslErrors(nativeId());
    }
    native void __qt_ignoreSslErrors(long __this__nativeId);

/**
Returns the received response header of the most recently finished HTTP request. If no response has yet been received {@link com.trolltech.qt.network.QHttpHeader#isValid() QHttpResponseHeader::isValid()} will return false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#currentRequest() currentRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHttpResponseHeader lastResponse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastResponse(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHttpResponseHeader __qt_lastResponse(long __this__nativeId);


/**
Sends a post request for <tt>path</tt> to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. <p><tt>path</tt> must be an absolute path like <tt>/index.html</tt> or an absolute URI like <tt>http://qtsoftware.com/index.html</tt> and must be encoded with either {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()} or {@link com.trolltech.qt.core.QUrl#encodedPath() QUrl::encodedPath()}. <p>The incoming data comes via the <tt>data</tt> IO device. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted). <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int post(java.lang.String path, com.trolltech.qt.core.QIODevice data) {
        return post(path, data, (com.trolltech.qt.core.QIODevice)null);
    }
/**
Sends a post request for <tt>path</tt> to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. <p><tt>path</tt> must be an absolute path like <tt>/index.html</tt> or an absolute URI like <tt>http://qtsoftware.com/index.html</tt> and must be encoded with either {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()} or {@link com.trolltech.qt.core.QUrl#encodedPath() QUrl::encodedPath()}. <p>The incoming data comes via the <tt>data</tt> IO device. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted). <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int post(java.lang.String path, com.trolltech.qt.core.QIODevice data, com.trolltech.qt.core.QIODevice to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_post_String_QIODevice_QIODevice(nativeId(), path, data == null ? 0 : data.nativeId(), to == null ? 0 : to.nativeId());
    }
    @QtBlockedSlot
    native int __qt_post_String_QIODevice_QIODevice(long __this__nativeId, java.lang.String path, long data, long to);


/**
This is an overloaded member function, provided for convenience. <p><tt>data</tt> is used as the content data of the HTTP request.
*/

    @QtBlockedSlot
    public final int post(java.lang.String path, com.trolltech.qt.core.QByteArray data) {
        return post(path, data, (com.trolltech.qt.core.QIODevice)null);
    }
/**
This is an overloaded member function, provided for convenience. <p><tt>data</tt> is used as the content data of the HTTP request.
*/

    @QtBlockedSlot
    public final int post(java.lang.String path, com.trolltech.qt.core.QByteArray data, com.trolltech.qt.core.QIODevice to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_post_String_QByteArray_QIODevice(nativeId(), path, data == null ? 0 : data.nativeId(), to == null ? 0 : to.nativeId());
    }
    @QtBlockedSlot
    native int __qt_post_String_QByteArray_QIODevice(long __this__nativeId, java.lang.String path, long data, long to);

    @QtBlockedSlot
    private final long read(com.trolltech.qt.QNativePointer data, long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_read_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
Reads all the bytes from the response content and returns them. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#readyRead readyRead() }, {@link com.trolltech.qt.network.QHttp#bytesAvailable() bytesAvailable()}, and {@link com.trolltech.qt.network.QHttp#read(byte[]) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readAll(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_readAll(long __this__nativeId);


/**
Sends a request to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. Uses the <tt>header</tt> as the HTTP request header. You are responsible for setting up a header that is appropriate for your request. <p>The incoming data comes via the <tt>data</tt> IO device. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted). <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int request(com.trolltech.qt.network.QHttpRequestHeader header, com.trolltech.qt.core.QIODevice device) {
        return request(header, device, (com.trolltech.qt.core.QIODevice)null);
    }

/**
Sends a request to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. Uses the <tt>header</tt> as the HTTP request header. You are responsible for setting up a header that is appropriate for your request. <p>The incoming data comes via the <tt>data</tt> IO device. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted). <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int request(com.trolltech.qt.network.QHttpRequestHeader header) {
        return request(header, (com.trolltech.qt.core.QIODevice)null, (com.trolltech.qt.core.QIODevice)null);
    }
/**
Sends a request to the server set by {@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()} or as specified in the constructor. Uses the <tt>header</tt> as the HTTP request header. You are responsible for setting up a header that is appropriate for your request. <p>The incoming data comes via the <tt>data</tt> IO device. <p>If the IO device <tt>to</tt> is 0 the {@link com.trolltech.qt.network.QHttp#readyRead readyRead() } signal is emitted every time new content data is available to read. <p>If the IO device <tt>to</tt> is not 0, the content data of the response is written directly to the device. Make sure that the <tt>to</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted). <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}, {@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int request(com.trolltech.qt.network.QHttpRequestHeader header, com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QIODevice to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_request_QHttpRequestHeader_QIODevice_QIODevice(nativeId(), header == null ? 0 : header.nativeId(), device == null ? 0 : device.nativeId(), to == null ? 0 : to.nativeId());
    }
    @QtBlockedSlot
    native int __qt_request_QHttpRequestHeader_QIODevice_QIODevice(long __this__nativeId, long header, long device, long to);


/**
This is an overloaded member function, provided for convenience. <p><tt>data</tt> is used as the content data of the HTTP request.
*/

    @QtBlockedSlot
    public final int request(com.trolltech.qt.network.QHttpRequestHeader header, com.trolltech.qt.core.QByteArray data) {
        return request(header, data, (com.trolltech.qt.core.QIODevice)null);
    }
/**
This is an overloaded member function, provided for convenience. <p><tt>data</tt> is used as the content data of the HTTP request.
*/

    @QtBlockedSlot
    public final int request(com.trolltech.qt.network.QHttpRequestHeader header, com.trolltech.qt.core.QByteArray data, com.trolltech.qt.core.QIODevice to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_request_QHttpRequestHeader_QByteArray_QIODevice(nativeId(), header == null ? 0 : header.nativeId(), data == null ? 0 : data.nativeId(), to == null ? 0 : to.nativeId());
    }
    @QtBlockedSlot
    native int __qt_request_QHttpRequestHeader_QByteArray_QIODevice(long __this__nativeId, long header, long data, long to);

    @QtBlockedSlot
    private final int setHost(java.lang.String hostname, com.trolltech.qt.network.QHttp.ConnectionMode mode, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHost_String_ConnectionMode_char(nativeId(), hostname, mode.value(), port);
    }
    @QtBlockedSlot
    native int __qt_setHost_String_ConnectionMode_char(long __this__nativeId, java.lang.String hostname, int mode, char port);

    @QtBlockedSlot
    private final int setHost(java.lang.String hostname, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHost_String_char(nativeId(), hostname, port);
    }
    @QtBlockedSlot
    native int __qt_setHost_String_char(long __this__nativeId, java.lang.String hostname, char port);

/**
This is an overloaded member function, provided for convenience. <p>Enables HTTP proxy support using the proxy settings from <tt>proxy</tt>. If <tt>proxy</tt> is a transparent proxy, QHttp will call {@link com.trolltech.qt.network.QAbstractSocket#setProxy(com.trolltech.qt.network.QNetworkProxy) QAbstractSocket::setProxy()} on the underlying socket. If the type is {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::HttpCachingProxy }, QHttp will behave like the previous function. <p>Note: for compatibility with Qt 4.3, if the proxy type is {@link com.trolltech.qt.network.QNetworkProxy.ProxyType QNetworkProxy::HttpProxy } and the request type is unencrypted (that is, {@link com.trolltech.qt.network.QHttp.ConnectionMode ConnectionModeHttp }), QHttp will treat the proxy as a caching proxy.
*/

    @QtBlockedSlot
    public final int setProxy(com.trolltech.qt.network.QNetworkProxy proxy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setProxy_QNetworkProxy(nativeId(), proxy == null ? 0 : proxy.nativeId());
    }
    @QtBlockedSlot
    native int __qt_setProxy_QNetworkProxy(long __this__nativeId, long proxy);


/**
Enables HTTP proxy support, using the proxy server <tt>host</tt> on port <tt>port</tt>. <tt>username</tt> and <tt>password</tt> can be provided if the proxy server requires authentication. <p>Example: <pre class="snippet">
      public void getTicks()
      {
        http = new QHttp(this);
        http.done.connect(this, "showPage()");
        http.setProxy("proxy.example.com", 3128);
        http.setHost("ticker.example.com", 80);
        http.get("/ticks.asp");
      }

      void showPage()
      {
        display(http.readAll());
      }
</pre> QHttp supports non-transparent web proxy servers only, such as the Squid Web proxy cache server (from http://www.squid.org/). For transparent proxying, such as SOCKS5, use {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#setProxy(java.lang.String, char) QFtp::setProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int setProxy(java.lang.String host, int port, java.lang.String username) {
        return setProxy(host, port, username, (java.lang.String)null);
    }

/**
Enables HTTP proxy support, using the proxy server <tt>host</tt> on port <tt>port</tt>. <tt>username</tt> and <tt>password</tt> can be provided if the proxy server requires authentication. <p>Example: <pre class="snippet">
      public void getTicks()
      {
        http = new QHttp(this);
        http.done.connect(this, "showPage()");
        http.setProxy("proxy.example.com", 3128);
        http.setHost("ticker.example.com", 80);
        http.get("/ticks.asp");
      }

      void showPage()
      {
        display(http.readAll());
      }
</pre> QHttp supports non-transparent web proxy servers only, such as the Squid Web proxy cache server (from http://www.squid.org/). For transparent proxying, such as SOCKS5, use {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#setProxy(java.lang.String, char) QFtp::setProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int setProxy(java.lang.String host, int port) {
        return setProxy(host, port, (java.lang.String)null, (java.lang.String)null);
    }
/**
Enables HTTP proxy support, using the proxy server <tt>host</tt> on port <tt>port</tt>. <tt>username</tt> and <tt>password</tt> can be provided if the proxy server requires authentication. <p>Example: <pre class="snippet">
      public void getTicks()
      {
        http = new QHttp(this);
        http.done.connect(this, "showPage()");
        http.setProxy("proxy.example.com", 3128);
        http.setHost("ticker.example.com", 80);
        http.get("/ticks.asp");
      }

      void showPage()
      {
        display(http.readAll());
      }
</pre> QHttp supports non-transparent web proxy servers only, such as the Squid Web proxy cache server (from http://www.squid.org/). For transparent proxying, such as SOCKS5, use {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#setProxy(java.lang.String, char) QFtp::setProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int setProxy(java.lang.String host, int port, java.lang.String username, java.lang.String password)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setProxy_String_int_String_String(nativeId(), host, port, username, password);
    }
    @QtBlockedSlot
    native int __qt_setProxy_String_int_String_String(long __this__nativeId, java.lang.String host, int port, java.lang.String username, java.lang.String password);

/**
Replaces the internal {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} that QHttp uses with <tt>socket</tt>. This is useful if you want to use your own custom {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} subclass instead of the plain {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} that QHttp uses by default. QHttp does not take ownership of the socket, and will not delete <tt>socket</tt> when destroyed. <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p>Note: If QHttp is used in a non-GUI thread that runs its own event loop, you must move <tt>socket</tt> to that thread before calling {@link com.trolltech.qt.network.QHttp#setSocket(com.trolltech.qt.network.QTcpSocket) setSocket()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#moveToThread(java.lang.Thread) QObject::moveToThread()}, and {@link <a href="../qtjambi-threads.html">Thread Support in Qt</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int setSocket(com.trolltech.qt.network.QTcpSocket socket)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcSocket = socket;
        }
        return __qt_setSocket_QTcpSocket(nativeId(), socket == null ? 0 : socket.nativeId());
    }
    @QtBlockedSlot
    native int __qt_setSocket_QTcpSocket(long __this__nativeId, long socket);


/**
This function sets the user name <tt>userName</tt> and password <tt>password</tt> for web pages that require authentication. <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted.
*/

    @QtBlockedSlot
    public final int setUser(java.lang.String username) {
        return setUser(username, (java.lang.String)null);
    }
/**
This function sets the user name <tt>userName</tt> and password <tt>password</tt> for web pages that require authentication. <p>The function does not block; instead, it returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted.
*/

    @QtBlockedSlot
    public final int setUser(java.lang.String username, java.lang.String password)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setUser_String_String(nativeId(), username, password);
    }
    @QtBlockedSlot
    native int __qt_setUser_String_String(long __this__nativeId, java.lang.String username, java.lang.String password);

/**
Returns the current state of the object. When the state changes, the {@link com.trolltech.qt.network.QHttp#stateChanged stateChanged() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp.State State }, and {@link com.trolltech.qt.network.QHttp#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHttp.State state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QHttp.State.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
@exclude
*/

    public static native QHttp fromNativePointer(QNativePointer nativePointer);

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

    protected QHttp(QPrivateConstructor p) { super(p); } 

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
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: hostname), java.lang.Integer(named: port), com.trolltech.qt.network.QAuthenticator(named: authenticator)&gt;:<p> This signal can be emitted when a web server on a given <tt>hostname</tt> and <tt>port</tt> requires authentication. The <tt>authenticator</tt> object can then be filled in with the required details to allow authentication and continue the connection. <p><b>Note:</b> It is not possible to use a QueuedConnection to connect to this signal, as the connection will fail if the authenticator has not been filled in with new information when the signal returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator QAuthenticator}, and {@link com.trolltech.qt.network.QNetworkProxy QNetworkProxy}. <br></DD></DT>
*/

    public Signal3<String, Integer, QAuthenticator> authenticationRequired = new Signal3<String, Integer, QAuthenticator>();
    private boolean inEmissionAuthenticationRequired = false;

    private void emitAuthenticationRequiredPrivate(String hostName, int port, QAuthenticator authenticator) {
        if (!inEmissionAuthenticationRequired) {
            inEmissionAuthenticationRequired = true;
            authenticationRequiredPrivate.emit(hostName, (char) port, authenticator.nativePointer());
            inEmissionAuthenticationRequired = false;
        }
    }

    private void emitAuthenticationRequired(String hostName, char port, QNativePointer authenticator) {
        if (!inEmissionAuthenticationRequired) {
            inEmissionAuthenticationRequired = true;
            authenticationRequired.emit(hostName, (int) port, QAuthenticator.fromNativePointer(authenticator));
            inEmissionAuthenticationRequired = false;
        }
    }

/**
Constructs a QHttp object. Subsequent requests are done by connecting to the server <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 for Https). <p>The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}. <br></DD></DT>
*/

    public QHttp(String hostname) {
        this(hostname, (char) 80);
    }

/**
This is an overloaded constructor provided for convenince.
*/

    public QHttp(String hostname, int port) {
        this(hostname, (char) port);
    }

/**
This is an overloaded constructor provided for convenince.
*/

    public QHttp(String hostname, int port, com.trolltech.qt.core.QObject parent) {
        this(hostname, (char) port, parent);
    }

/**
Constructs a QHttp object. Subsequent requests are done by connecting to the server <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 for Https). <p>The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}. <br></DD></DT>
*/

    public QHttp(java.lang.String hostname, com.trolltech.qt.network.QHttp.ConnectionMode mode) {
        this(hostname, mode, '\0');
    }

/**
Constructs a QHttp object. Subsequent requests are done by connecting to the server <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 for Https). <p>The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}. <br></DD></DT>
*/

    public QHttp(String hostname, QHttp.ConnectionMode mode, int port) {
        this(hostname, mode, (char) port);
    }

/**
Constructs a QHttp object. Subsequent requests are done by connecting to the server <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 for Https). <p>The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#setHost(java.lang.String, com.trolltech.qt.network.QHttp.ConnectionMode) setHost()}. <br></DD></DT>
*/

    public QHttp(String hostname, QHttp.ConnectionMode mode, int port, com.trolltech.qt.core.QObject parent) {
        this(hostname, mode, (char) port, parent);
    }

/**
Sets the HTTP server that is used for requests to <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 fopr Https). <p>The function does not block and returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    public final int setHost(String hostName, QHttp.ConnectionMode mode) {
        return setHost(hostName, mode, '\0');
    }

/**
Sets the HTTP server that is used for requests to <tt>hostName</tt> on port <tt>port</tt> using the connection mode <tt>mode</tt>. <p>If port is 0, it will use the default port for the <tt>mode</tt> used (80 for Http and 443 fopr Https). <p>The function does not block and returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    public final int setHost(String hostname, QHttp.ConnectionMode mode, int port) {
        return setHost(hostname, mode, (char) port);
    }

/**
Sets the HTTP server that is used for requests to <tt>hostName</tt> on port <tt>port</tt>. <p>The function does not block and returns immediately. The request is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } and {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }. <p>When the request is started the {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp#get(java.lang.String) get()}, {@link com.trolltech.qt.network.QHttp#post(java.lang.String, com.trolltech.qt.core.QIODevice) post()}, {@link com.trolltech.qt.network.QHttp#head(java.lang.String) head()}, {@link com.trolltech.qt.network.QHttp#request(com.trolltech.qt.network.QHttpRequestHeader, com.trolltech.qt.core.QIODevice) request()}, {@link com.trolltech.qt.network.QHttp#requestStarted requestStarted() }, {@link com.trolltech.qt.network.QHttp#requestFinished requestFinished() }, and {@link com.trolltech.qt.network.QHttp#done done() }. <br></DD></DT>
*/

    public final int setHost(String hostname) {
        return setHost(hostname, (char) 80);
    }

/**
Sets the HTTP server that is used for requests to <tt>hostname</tt> on port
<tt>port</tt>.
<p>
The function does not block and returns immediately. The request is scheduled,
and its execution is performed asynchronously. The function returns a unique
identifier which is passed by requestStarted() and requestFinished().
<p>
When the request is started the requestStarted() signal is emitted. When it is
finished the requestFinished() signal is emitted.
*/

    public final int setHost(String hostname, int port) {
        return setHost(hostname, (char) port);
    }


    // TEMPLATE - network.read_char*_long_long - START
/**
Reads from this http connection into data. The method returns the
*/

    public final int read(byte data[]) {
        if (data.length == 0) return 0;

        com.trolltech.qt.QNativePointer np = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Byte, data.length);
        int len = (int) read(np, data.length);
        for (int i=0; i<len; ++i) data[i] = np.byteAt(i);

        return len;
    }
    // TEMPLATE - network.read_char*_long_long - END

}
