package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkReply class contains the data and headers for a request posted with {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} The QNetworkReply class contains the data and meta data related to a request posted with {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. Like {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, it contains a URL and headers (both in parsed and raw form), some information about the reply's state and the contents of the reply itself. <p>QNetworkReply is a sequential-access {@link com.trolltech.qt.core.QIODevice QIODevice}, which means that once data is read from the object, it no longer kept by the device. It is therefore the application's responsibility to keep this data if it needs to. Whenever more data is received from the network and processed, the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal is emitted. <p>The {@link com.trolltech.qt.network.QNetworkReply#downloadProgress downloadProgress() } signal is also emitted when data is received, but the number of bytes contained in it may not represent the actual bytes received, if any transformation is done to the contents (for example, decompressing and removing the protocol overhead). <p>Even though QNetworkReply is a {@link com.trolltech.qt.core.QIODevice QIODevice} connected to the contents of the reply, it also emits the {@link com.trolltech.qt.network.QNetworkReply#uploadProgress uploadProgress() } signal, which indicates the progress of the upload for operations that have such content. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, and {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QNetworkReply extends com.trolltech.qt.core.QIODevice
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.network.QNetworkReply {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void abort() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_abort(nativeId());
        }

        @Override
        @QtBlockedSlot
        protected int readData(byte[] data) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_readData_nativepointer_long(nativeId(), data);
        }
    }
/**
Indicates all possible error conditions found during the processing of the request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#error() error()}. <br></DD></DT>
*/


    public enum NetworkError implements com.trolltech.qt.QtEnumerator {
/**
 no error condition. <b>Note:</b> When the HTTP protocol returns a redirect no error will be reported. You can check if there is a redirect with the {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::RedirectionTargetAttribute } attribute.
*/

        NoError(0),
/**
 the remote server refused the connection (the server is not accepting requests)
*/

        ConnectionRefusedError(1),
/**
 the remote server closed the connection prematurely, before the entire reply was received and processed
*/

        RemoteHostClosedError(2),
/**
 the remote host name was not found (invalid hostname)
*/

        HostNotFoundError(3),
/**
 the connection to the remote server timed out
*/

        TimeoutError(4),
/**
 the operation was canceled via calls to {@link com.trolltech.qt.network.QNetworkReply#abort() abort()} or close() before it was finished.
*/

        OperationCanceledError(5),
/**
 the SSL/TLS handshake failed and the encrypted channel could not be established. The {@link com.trolltech.qt.network.QNetworkReply#sslErrors sslErrors() } signal should have been emitted.
*/

        SslHandshakeFailedError(6),
/**
 an unknown network-related error was detected
*/

        UnknownNetworkError(99),
/**
 the connection to the proxy server was refused (the proxy server is not accepting requests)
*/

        ProxyConnectionRefusedError(101),
/**
 the proxy server closed the connection prematurely, before the entire reply was received and processed
*/

        ProxyConnectionClosedError(102),
/**
 the proxy host name was not found (invalid proxy hostname)
*/

        ProxyNotFoundError(103),
/**
 the connection to the proxy timed out or the proxy did not reply in time to the request sent
*/

        ProxyTimeoutError(104),
/**
 the proxy requires authentication in order to honour the request but did not accept any credentials offered (if any)
*/

        ProxyAuthenticationRequiredError(105),
/**
 an unknown proxy-related error was detected
*/

        UnknownProxyError(199),
/**
 the access to the remote content was denied (similar to HTTP error 401)
*/

        ContentAccessDenied(201),
/**
 the operation requested on the remote content is not permitted
*/

        ContentOperationNotPermittedError(202),
/**
 the remote content was not found at the server (similar to HTTP error 404)
*/

        ContentNotFoundError(203),
/**
 the remote server requires authentication to serve the content but the credentials provided were not accepted (if any)
*/

        AuthenticationRequiredError(204),
/**
 an unknonwn error related to the remote content was detected
*/

        UnknownContentError(299),
/**
 the Network Access API cannot honor the request because the protocol is not known
*/

        ProtocolUnknownError(301),
/**
 the requested operation is invalid for this protocol
*/

        ProtocolInvalidOperationError(302),
/**
 a breakdown in protocol was detected (parsing error, invalid or unexpected responses, etc.)
*/

        ProtocolFailure(399);

        NetworkError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkReply$NetworkError constant with the specified <tt>int</tt>.</brief>
*/

        public static NetworkError resolve(int value) {
            return (NetworkError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return ConnectionRefusedError;
            case 2: return RemoteHostClosedError;
            case 3: return HostNotFoundError;
            case 4: return TimeoutError;
            case 5: return OperationCanceledError;
            case 6: return SslHandshakeFailedError;
            case 99: return UnknownNetworkError;
            case 101: return ProxyConnectionRefusedError;
            case 102: return ProxyConnectionClosedError;
            case 103: return ProxyNotFoundError;
            case 104: return ProxyTimeoutError;
            case 105: return ProxyAuthenticationRequiredError;
            case 199: return UnknownProxyError;
            case 201: return ContentAccessDenied;
            case 202: return ContentOperationNotPermittedError;
            case 203: return ContentNotFoundError;
            case 204: return AuthenticationRequiredError;
            case 299: return UnknownContentError;
            case 301: return ProtocolUnknownError;
            case 302: return ProtocolInvalidOperationError;
            case 399: return ProtocolFailure;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Long(named: bytesReceived), java.lang.Long(named: bytesTotal)&gt;:<p> This signal is emitted to indicate the progress of the download part of this network request, if there's any. If there's no download associated with this request, this signal will be emitted once with 0 as the value of both <tt>bytesReceived</tt> and <tt>bytesTotal</tt>. <p>The <tt>bytesReceived</tt> parameter indicates the number of bytes received, while <tt>bytesTotal</tt> indicates the total number of bytes expected to be downloaded. If the number of bytes to be downloaded is not known, <tt>bytesTotal</tt> will be -1. <p>The download is finished when <tt>bytesReceived</tt> is equal to <tt>bytesTotal</tt>. At that time, <tt>bytesTotal</tt> will not be -1. <p>This signal is suitable to connecting to {@link QProgressBar#setValue(int) QProgressBar::setValue()} to update the {@link com.trolltech.qt.gui.QProgressBar QProgressBar} that provides user feedback. <p>Note that the values of both <tt>bytesReceived</tt> and <tt>bytesTotal</tt> may be different from {@link com.trolltech.qt.core.QIODevice#size() size()}, the total number of bytes obtained through {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}, or the value of the header(ContentLengthHeader). The reason for that is that there may be protocol overhead or the data may be compressed during the download. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#uploadProgress uploadProgress() }, and {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Long, java.lang.Long> downloadProgress = new Signal2<java.lang.Long, java.lang.Long>();

    private final void downloadProgress(long bytesReceived, long bytesTotal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_downloadProgress_long_long(nativeId(), bytesReceived, bytesTotal);
    }
    native void __qt_downloadProgress_long_long(long __this__nativeId, long bytesReceived, long bytesTotal);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply$NetworkError(named: code)&gt;:<p> This signal is emitted when the reply detects an error in processing. The {@link com.trolltech.qt.network.QNetworkReply#finished finished() } signal will probably follow, indicating that the connection is over. <p>The <tt>code</tt> parameter contains the code of the error that was detected. Call {@link com.trolltech.qt.core.QIODevice#errorString() errorString()} to obtain a textual representation of the error condition. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#error() error()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QNetworkReply.NetworkError> error = new Signal1<com.trolltech.qt.network.QNetworkReply.NetworkError>();

    private final void error(com.trolltech.qt.network.QNetworkReply.NetworkError arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_NetworkError(nativeId(), arg__1.value());
    }
    native void __qt_error_NetworkError(long __this__nativeId, int arg__1);
/**
 This signal is emitted when the reply has finished processing. After this signal is emitted, there will be no more updates to the reply's data or metadata. <p>Unless close() has been called, the reply will be still be opened for reading, so the data can be retrieved by calls to {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}. In particular, if no calls to {@link com.trolltech.qt.core.QIODevice#read(long) read()} were made as a result of {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() }, a call to {@link com.trolltech.qt.core.QIODevice#readAll() readAll()} will retrieve the full contents in a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>This signal is emitted in tandem with {@link com.trolltech.qt.network.QNetworkAccessManager#finished QNetworkAccessManager::finished() } where that signal's reply parameter is this object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAccessManager#finished QNetworkAccessManager::finished() }. <br></DD></DT>
*/

    public final Signal0 finished = new Signal0();

    private final void finished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished(nativeId());
    }
    native void __qt_finished(long __this__nativeId);
/**
 This signal is emitted whenever the metadata in this reply changes. metadata is any information that is not the content (data) itself, including the network headers. In the majority of cases, the metadata will be known fully by the time the first byte of data is received. However, it is possible to receive updates of headers or other metadata during the processing of the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}, {@link com.trolltech.qt.network.QNetworkReply#rawHeaderList() rawHeaderList()}, {@link com.trolltech.qt.network.QNetworkReply#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, and {@link com.trolltech.qt.network.QNetworkReply#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()}. <br></DD></DT>
*/

    public final Signal0 metaDataChanged = new Signal0();

    private final void metaDataChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_metaDataChanged(nativeId());
    }
    native void __qt_metaDataChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<com.trolltech.qt.network.QSslError>(named: errors)&gt;:<p> This signal is emitted if the SSL/TLS session encountered errors during the set up, including certificate verification errors. The <tt>errors</tt> parameter contains the list of errors. <p>To indicate that the errors are not fatal and that the connection should proceed, the {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() ignoreSslErrors()} function should be called from the slot connected to this signal. If it is not called, the SSL session will be torn down before any data is exchanged (including the URL). <p>This signal can be used to display an error message to the user indicating that security may be compromised and display the SSL settings (see {@link com.trolltech.qt.network.QNetworkReply#sslConfiguration() sslConfiguration()} to obtain it). If the user decides to proceed after analyzing the remote certificate, the slot should call {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() ignoreSslErrors()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket#sslErrors() QSslSocket::sslErrors()}, {@link com.trolltech.qt.network.QNetworkAccessManager#sslErrors QNetworkAccessManager::sslErrors() }, {@link com.trolltech.qt.network.QNetworkReply#sslConfiguration() sslConfiguration()}, and {@link com.trolltech.qt.network.QNetworkReply#ignoreSslErrors() ignoreSslErrors()}. <br></DD></DT>
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
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Long(named: bytesSent), java.lang.Long(named: bytesTotal)&gt;:<p> This signal is emitted to indicate the progress of the upload part of this network request, if there's any. If there's no upload associated with this request, this signal will not be emitted. <p>The <tt>bytesSent</tt> parameter indicates the number of bytes uploaded, while <tt>bytesTotal</tt> indicates the total number of bytes to be uploaded. If the number of bytes to be uploaded could not be determined, <tt>bytesTotal</tt> will be -1. <p>The upload is finished when <tt>bytesSent</tt> is equal to <tt>bytesTotal</tt>. At that time, <tt>bytesTotal</tt> will not be -1. <p>This signal is suitable to connecting to {@link QProgressBar#setValue(int) QProgressBar::setValue()} to update the {@link com.trolltech.qt.gui.QProgressBar QProgressBar} that provides user feedback. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#downloadProgress downloadProgress() }. <br></DD></DT>
*/

    public final Signal2<java.lang.Long, java.lang.Long> uploadProgress = new Signal2<java.lang.Long, java.lang.Long>();

    private final void uploadProgress(long bytesSent, long bytesTotal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_uploadProgress_long_long(nativeId(), bytesSent, bytesTotal);
    }
    native void __qt_uploadProgress_long_long(long __this__nativeId, long bytesSent, long bytesTotal);


/**
Creates a QNetworkReply object with parent <tt>parent</tt>. <p>You cannot directly instantiate QNetworkReply objects. Use {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} functions to do that.
*/

    protected QNetworkReply() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a QNetworkReply object with parent <tt>parent</tt>. <p>You cannot directly instantiate QNetworkReply objects. Use {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} functions to do that.
*/

    protected QNetworkReply(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QNetworkReply_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QNetworkReply_QObject(long parent);

/**
Returns the attribute associated with the code <tt>code</tt>. If the attribute has not been set, it returns an invalid {@link com.trolltech.qt.QVariant QVariant} (type QVariant::Null). <p>You can expect the default values listed in {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute } to be applied to the values returned by this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object) setAttribute()}, and {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object attribute(com.trolltech.qt.network.QNetworkRequest.Attribute code)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attribute_Attribute(nativeId(), code.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_attribute_Attribute(long __this__nativeId, int code);

/**
Returns the error that was found during the processing of this request. If no error was found, returns {@link com.trolltech.qt.network.QNetworkReply.NetworkError NoError }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setError(com.trolltech.qt.network.QNetworkReply.NetworkError, java.lang.String) setError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkReply.NetworkError error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QNetworkReply.NetworkError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns true if the raw header of name <tt>headerName</tt> was sent by the remote server <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasRawHeader(com.trolltech.qt.core.QByteArray headerName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasRawHeader_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasRawHeader_QByteArray(long __this__nativeId, long headerName);

/**
Returns the value of the known header <tt>header</tt>, if that header was sent by the remote server. If the header was not sent, returns an invalid {@link com.trolltech.qt.QVariant QVariant}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, {@link com.trolltech.qt.network.QNetworkReply#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) QNetworkRequest::header()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders header)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_header_KnownHeaders(nativeId(), header.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_header_KnownHeaders(long __this__nativeId, int header);

/**
Returns the {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} that was used to create this QNetworkReply object. Initially, it is also the parent object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkAccessManager manager()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_manager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkAccessManager __qt_manager(long __this__nativeId);

/**
Returns the operation that was posted for this reply. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setOperation(com.trolltech.qt.network.QNetworkAccessManager.Operation) setOperation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkAccessManager.Operation operation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QNetworkAccessManager.Operation.resolve(__qt_operation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_operation(long __this__nativeId);

/**
Returns the raw contents of the header <tt>headerName</tt> as sent by the remote server. If there is no such header, returns an empty byte array, which may be indistinguishable from an empty header. Use {@link com.trolltech.qt.network.QNetworkReply#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()} to verify if the server sent such header field. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}, {@link com.trolltech.qt.network.QNetworkReply#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()}, and {@link com.trolltech.qt.network.QNetworkReply#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray rawHeader(com.trolltech.qt.core.QByteArray headerName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawHeader_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_rawHeader_QByteArray(long __this__nativeId, long headerName);

/**
Returns a list of headers fields that were sent by the remote server, in the order that they were sent. Duplicate headers are merged together and take place of the latter duplicate.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> rawHeaderList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawHeaderList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_rawHeaderList(long __this__nativeId);

/**
Returns the size of the read buffer, in bytes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setReadBufferSize(long) setReadBufferSize()}. <br></DD></DT>
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
Returns the request that was posted for this reply. In special, note that the URL for the request may be different than that of the reply. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#url() QNetworkRequest::url()}, {@link com.trolltech.qt.network.QNetworkReply#url() url()}, and {@link com.trolltech.qt.network.QNetworkReply#setRequest(com.trolltech.qt.network.QNetworkRequest) setRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkRequest request()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_request(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkRequest __qt_request(long __this__nativeId);

/**
Sets the attribute <tt>code</tt> to have value <tt>value</tt>. If <tt>code</tt> was previously set, it will be overridden. If <tt>value</tt> is an invalid {@link com.trolltech.qt.QVariant QVariant}, the attribute will be unset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#attribute(com.trolltech.qt.network.QNetworkRequest.Attribute) attribute()}, and {@link com.trolltech.qt.network.QNetworkRequest#setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object) QNetworkRequest::setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute code, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_Attribute_Object(nativeId(), code.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_Attribute_Object(long __this__nativeId, int code, java.lang.Object value);

/**
Sets the error condition to be <tt>errorCode</tt>. The human-readable message is set with <tt>errorString</tt>. <p>Calling {@link com.trolltech.qt.network.QNetworkReply#setError(com.trolltech.qt.network.QNetworkReply.NetworkError, java.lang.String) setError()} does not emit the error({@link com.trolltech.qt.network.QNetworkReply.NetworkError QNetworkReply::NetworkError }) signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#error() error()}, and {@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setError(com.trolltech.qt.network.QNetworkReply.NetworkError errorCode, java.lang.String errorString)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setError_NetworkError_String(nativeId(), errorCode.value(), errorString);
    }
    @QtBlockedSlot
    native void __qt_setError_NetworkError_String(long __this__nativeId, int errorCode, java.lang.String errorString);

/**
Sets the known header <tt>header</tt> to be of value <tt>value</tt>. The corresponding raw form of the header will be set as well. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}, {@link com.trolltech.qt.network.QNetworkReply#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) QNetworkRequest::setHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders header, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeader_KnownHeaders_Object(nativeId(), header.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setHeader_KnownHeaders_Object(long __this__nativeId, int header, java.lang.Object value);

/**
Sets the associated operation for this object to be <tt>operation</tt>. This value will be returned by {@link com.trolltech.qt.network.QNetworkReply#operation() operation()}. <p>Note: the operation should be set when this object is created and not changed again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#operation() operation()}, and {@link com.trolltech.qt.network.QNetworkReply#setRequest(com.trolltech.qt.network.QNetworkRequest) setRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setOperation(com.trolltech.qt.network.QNetworkAccessManager.Operation operation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOperation_Operation(nativeId(), operation.value());
    }
    @QtBlockedSlot
    native void __qt_setOperation_Operation(long __this__nativeId, int operation);

/**
Sets the raw header <tt>headerName</tt> to be of value <tt>value</tt>. If <tt>headerName</tt> was previously set, it is overridden. Multiple HTTP headers of the same name are functionally equivalent to one single header with the values concatenated, separated by commas. <p>If <tt>headerName</tt> matches a known header, the value <tt>value</tt> will be parsed and the corresponding parsed form will also be set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, {@link com.trolltech.qt.network.QNetworkReply#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}, {@link com.trolltech.qt.network.QNetworkReply#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) QNetworkRequest::setRawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setRawHeader(com.trolltech.qt.core.QByteArray headerName, com.trolltech.qt.core.QByteArray value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRawHeader_QByteArray_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId(), value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRawHeader_QByteArray_QByteArray(long __this__nativeId, long headerName, long value);

/**
Sets the associated request for this object to be <tt>request</tt>. This value will be returned by {@link com.trolltech.qt.network.QNetworkReply#request() request()}. <p>Note: the request should be set when this object is created and not changed again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#request() request()}, and {@link com.trolltech.qt.network.QNetworkReply#setOperation(com.trolltech.qt.network.QNetworkAccessManager.Operation) setOperation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setRequest(com.trolltech.qt.network.QNetworkRequest request)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRequest_QNetworkRequest(nativeId(), request == null ? 0 : request.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRequest_QNetworkRequest(long __this__nativeId, long request);

/**
Sets the SSL configuration for the network connection associated with this request, if possible, to be that of <tt>config</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#sslConfiguration() sslConfiguration()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSslConfiguration(com.trolltech.qt.network.QSslConfiguration configuration)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSslConfiguration_QSslConfiguration(nativeId(), configuration == null ? 0 : configuration.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSslConfiguration_QSslConfiguration(long __this__nativeId, long configuration);

/**
Sets the URL being processed to be <tt>url</tt>. Normally, the URL matches that of the request that was posted, but for a variety of reasons it can be different (for example, a file path being made absolute or canonical). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#url() url()}, {@link com.trolltech.qt.network.QNetworkReply#request() request()}, and {@link com.trolltech.qt.network.QNetworkRequest#url() QNetworkRequest::url()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setUrl(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrl_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUrl_QUrl(long __this__nativeId, long url);

/**
Returns the SSL configuration and state associated with this reply, if SSL was used. It will contain the remote server's certificate, its certificate chain leading to the Certificate Authority as well as the encryption ciphers in use. <p>The peer's certificate and its certificate chain will be known by the time {@link com.trolltech.qt.network.QNetworkReply#sslErrors sslErrors() } is emitted, if it's emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#setSslConfiguration(com.trolltech.qt.network.QSslConfiguration) setSslConfiguration()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslConfiguration sslConfiguration()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sslConfiguration(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslConfiguration __qt_sslConfiguration(long __this__nativeId);

/**
Returns the URL of the content downloaded or uploaded. Note that the URL may be different from that of the original request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#request() request()}, {@link com.trolltech.qt.network.QNetworkReply#setUrl(com.trolltech.qt.core.QUrl) setUrl()}, and {@link com.trolltech.qt.network.QNetworkRequest#url() QNetworkRequest::url()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl url()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_url(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_url(long __this__nativeId);

/**
Aborts the operation immediately and close down any network connections still open. Uploads still in progress are also aborted. <p><DT><b>See also:</b><br><DD>close(). <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void abort();
    @QtBlockedSlot
    native void __qt_abort(long __this__nativeId);

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
If this function is called, SSL errors related to network connection will be ignored, including certificate validation errors. <p>Note that calling this function without restraint may pose a security risk for your application. Use it with care. <p>This function can be called from the slot connected to the {@link com.trolltech.qt.network.QNetworkReply#sslErrors sslErrors() } signal, which indicates which errors were found. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#sslConfiguration() sslConfiguration()}, and {@link com.trolltech.qt.network.QNetworkReply#sslErrors sslErrors() }. <br></DD></DT>
*/

    public void ignoreSslErrors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ignoreSslErrors(nativeId());
    }
    native void __qt_ignoreSslErrors(long __this__nativeId);

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
Sets the size of the read buffer to be <tt>size</tt> bytes. The read buffer is the buffer that holds data that is being downloaded off the network, before it is read with {@link com.trolltech.qt.core.QIODevice#read(long) QIODevice::read()}. Setting the buffer size to 0 will make the buffer unlimited in size. <p>QNetworkReply will try to stop reading from the network once this buffer is full (i.e., {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} returns <tt>size</tt> or more), thus causing the download to throttle down as well. If the buffer is not limited in size, QNetworkReply will try to download as fast as possible from the network. <p>Unlike {@link com.trolltech.qt.network.QAbstractSocket#setReadBufferSize(long) QAbstractSocket::setReadBufferSize()}, QNetworkReply cannot guarantee precision in the read buffer size. That is, {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} can return more than <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply#readBufferSize() readBufferSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setReadBufferSize(long size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadBufferSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setReadBufferSize_long(long __this__nativeId, long size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int writeData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] data);

    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] data);

/**
@exclude
*/

    public static native QNetworkReply fromNativePointer(QNativePointer nativePointer);

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

    protected QNetworkReply(QPrivateConstructor p) { super(p); } 
}
