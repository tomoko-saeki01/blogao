package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkRequest class holds one request to be sent with the Network Access API. QNetworkRequest is part of the Network Access API and is the class holding the information necessary to send a request over the network. It contains a URL and some ancillary information that can be used to modify the request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, and {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkRequest extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
Controls the caching mechanism of {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}.
*/

    public enum CacheLoadControl implements com.trolltech.qt.QtEnumerator {
/**
 always load from network and do not check if the cache has a valid entry (similar to the "Reload" feature in browsers)
*/

        AlwaysNetwork(0),
/**
 default value; load from the network if the cached entry is older than the network entry
*/

        PreferNetwork(1),
/**
 load from cache if available, otherwise load from network. Note that this can return possibly stale (but not expired) items from cache.
*/

        PreferCache(2),
/**
 only load from cache, indicating error if the item was not cached (i.e., off-line mode)
*/

        AlwaysCache(3);

        CacheLoadControl(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkRequest$CacheLoadControl constant with the specified <tt>int</tt>.</brief>
*/

        public static CacheLoadControl resolve(int value) {
            return (CacheLoadControl) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AlwaysNetwork;
            case 1: return PreferNetwork;
            case 2: return PreferCache;
            case 3: return AlwaysCache;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
List of known header types that {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest} parses. Each known header is also represented in raw form with its full HTTP name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}, {@link com.trolltech.qt.network.QNetworkRequest#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}, {@link com.trolltech.qt.network.QNetworkRequest#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}. <br></DD></DT>
*/

    public enum KnownHeaders implements com.trolltech.qt.QtEnumerator {
/**
 corresponds to the HTTP Content-Type header and contains a string containing the media (MIME) type and any auxiliary data (for instance, charset)
*/

        ContentTypeHeader(0),
/**
 corresponds to the HTTP Content-Length header and contains the length in bytes of the data transmitted.
*/

        ContentLengthHeader(1),
/**
 corresponds to the HTTP Location header and contains a URL representing the actual location of the data, including the destination URL in case of redirections.
*/

        LocationHeader(2),
/**
 corresponds to the HTTP Last-Modified header and contains a {@link com.trolltech.qt.core.QDateTime QDateTime} representing the last modification date of the contents
*/

        LastModifiedHeader(3),
/**
 corresponds to the HTTP Cookie header and contains a QList&lt;{@link com.trolltech.qt.network.QNetworkCookie QNetworkCookie}&gt; representing the cookies to be sent back to the server
*/

        CookieHeader(4),
/**
 corresponds to the HTTP Set-Cookie header and contains a QList&lt;{@link com.trolltech.qt.network.QNetworkCookie QNetworkCookie}&gt; representing the cookies sent by the server to be stored locally
*/

        SetCookieHeader(5);

        KnownHeaders(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkRequest$KnownHeaders constant with the specified <tt>int</tt>.</brief>
*/

        public static KnownHeaders resolve(int value) {
            return (KnownHeaders) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ContentTypeHeader;
            case 1: return ContentLengthHeader;
            case 2: return LocationHeader;
            case 3: return LastModifiedHeader;
            case 4: return CookieHeader;
            case 5: return SetCookieHeader;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Attribute codes for the {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest} and {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}. <p>Attributes are extra meta-data that are used to control the behavior of the request and to pass further information from the reply back to the application. Attributes are also extensible, allowing custom implementations to pass custom values. <p>The following table explains what the default attribute codes are, the {@link com.trolltech.qt.QVariant QVariant} types associated, the default value if said attribute is missing and whether it's used in requests or replies.
*/

    public enum Attribute implements com.trolltech.qt.QtEnumerator {
/**
 Replies only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Int } (no default) Indicates the HTTP status code received from the HTTP server (like 200, 304, 404, 401, etc.). If the connection was not HTTP-based, this attribute will not be present.
*/

        HttpStatusCodeAttribute(0),
/**
 Replies only, type. {@link com.trolltech.qt.QVariant.Type QVariant::ByteArray } (no default) Indicates the HTTP reason phrase as received from the HTTP server (like "Ok", "Found", "Not Found", "Access Denied", etc.) This is the human-readable representation of the status code (see above). If the connection was not HTTP-based, this attribute will not be present.
*/

        HttpReasonPhraseAttribute(1),
/**
 Replies only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Url } (no default) If present, it indicates that the server is redirecting the request to a different URL. The Network Access API does not by default follow redirections: it's up to the application to determine if the requested redirection should be allowed, according to its security policies.
*/

        RedirectionTargetAttribute(2),
/**
 Replies only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Bool } (default: false) Indicates whether the data was obtained through an encrypted (secure) connection.
*/

        ConnectionEncryptedAttribute(3),
/**
 Requests only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Int } (default: {@link com.trolltech.qt.network.QNetworkRequest.CacheLoadControl QNetworkRequest::PreferNetwork }) Controls how the cache should be accessed. The possible values are those of {@link com.trolltech.qt.network.QNetworkRequest.CacheLoadControl QNetworkRequest::CacheLoadControl }. Note that the default {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} implementation does not support caching. However, this attribute may be used by certain backends to modify their requests (for example, for caching proxies).
*/

        CacheLoadControlAttribute(4),
/**
 Requests only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Bool } (default: true) Controls if the data obtained should be saved to cache for future uses. If the value is false, the data obtained will not be automatically cached. If true, data may be cached, provided it is cacheable (what is cacheable depends on the protocol being used). Note that the default {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} implementation does not support caching, so it will ignore this attribute.
*/

        CacheSaveControlAttribute(5),
/**
 Replies only, type. {@link com.trolltech.qt.QVariant.Type QVariant::Bool } (default: false) Indicates whether the data was obtained from cache or not.
*/

        SourceIsFromCacheAttribute(6),
/**
 Special type. Additional information can be passed in QVariants with types ranging from User to {@link com.trolltech.qt.network.QNetworkRequest.Attribute UserMax }. The default implementation of Network Access will ignore any request attributes in this range and it will not produce any attributes in this range in replies. The range is reserved for extensions of {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}.
*/

        User(1000),
/**
 Special type. See User.
*/

        UserMax(32767),
        CustomEnum(0);

        Attribute(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkRequest$Attribute constant with the specified <tt>int</tt>.</brief>
*/

        public static Attribute resolve(int value) {
            return (Attribute) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return HttpStatusCodeAttribute;
            case 1: return HttpReasonPhraseAttribute;
            case 2: return RedirectionTargetAttribute;
            case 3: return ConnectionEncryptedAttribute;
            case 4: return CacheLoadControlAttribute;
            case 5: return CacheSaveControlAttribute;
            case 6: return SourceIsFromCacheAttribute;
            case 1000: return User;
            case 32767: return UserMax;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, Attribute>();
            Attribute e = enumCache.get(value);
            if (e == null) {
                e = (Attribute) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), Attribute.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, Attribute> enumCache;    }


/**
Creates a copy of <tt>other</tt>.
*/

    public QNetworkRequest(com.trolltech.qt.network.QNetworkRequest other){
        super((QPrivateConstructor)null);
        __qt_QNetworkRequest_QNetworkRequest(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkRequest_QNetworkRequest(long other);


/**
Constructs a QNetworkRequest object with <tt>url</tt> as the URL to be requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#url() url()}, and {@link com.trolltech.qt.network.QNetworkRequest#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. <br></DD></DT>
*/

    public QNetworkRequest() {
        this((com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Constructs a QNetworkRequest object with <tt>url</tt> as the URL to be requested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#url() url()}, and {@link com.trolltech.qt.network.QNetworkRequest#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. <br></DD></DT>
*/

    public QNetworkRequest(com.trolltech.qt.core.QUrl url){
        super((QPrivateConstructor)null);
        __qt_QNetworkRequest_QUrl(url == null ? 0 : url.nativeId());
    }

    native void __qt_QNetworkRequest_QUrl(long url);


/**
Returns the attribute associated with the code <tt>code</tt>. If the attribute has not been set, it returns <tt>defaultValue</tt>. <p>Note: this function does not apply the defaults listed in {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object) setAttribute()}, and {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object attribute(com.trolltech.qt.network.QNetworkRequest.Attribute code) {
        return attribute(code, (java.lang.Object)null);
    }
/**
Returns the attribute associated with the code <tt>code</tt>. If the attribute has not been set, it returns <tt>defaultValue</tt>. <p>Note: this function does not apply the defaults listed in {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object) setAttribute()}, and {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object attribute(com.trolltech.qt.network.QNetworkRequest.Attribute code, java.lang.Object defaultValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attribute_Attribute_Object(nativeId(), code.value(), defaultValue);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_attribute_Attribute_Object(long __this__nativeId, int code, java.lang.Object defaultValue);

/**
Returns true if the raw header <tt>headerName</tt> is present in this network request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasRawHeader(com.trolltech.qt.core.QByteArray headerName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasRawHeader_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasRawHeader_QByteArray(long __this__nativeId, long headerName);

/**
Returns the value of the known network header <tt>header</tt> if it is present in this request. If it is not present, returns QVariant() (i.e., an invalid variant). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest.KnownHeaders KnownHeaders }, {@link com.trolltech.qt.network.QNetworkRequest#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders header)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_header_KnownHeaders(nativeId(), header.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_header_KnownHeaders(long __this__nativeId, int header);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkRequest other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkRequest(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkRequest(long __this__nativeId, long other);

/**
Returns the raw form of header <tt>headerName</tt>. If no such header is present, an empty {@link com.trolltech.qt.core.QByteArray QByteArray} is returned, which may be indistinguishable from a header that is present but has no content (use {@link com.trolltech.qt.network.QNetworkRequest#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()} to find out if the header exists or not). <p>Raw headers can be set with {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()} or with {@link com.trolltech.qt.network.QNetworkRequest#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}, and {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray rawHeader(com.trolltech.qt.core.QByteArray headerName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawHeader_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_rawHeader_QByteArray(long __this__nativeId, long headerName);

/**
Returns a list of all raw headers that are set in this network request. The list is in the order that the headers were set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> rawHeaderList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawHeaderList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_rawHeaderList(long __this__nativeId);

/**
Sets the attribute associated with code <tt>code</tt> to be value <tt>value</tt>. If the attribute is already set, the previous value is discarded. In special, if <tt>value</tt> is an invalid {@link com.trolltech.qt.QVariant QVariant}, the attribute is unset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#attribute(com.trolltech.qt.network.QNetworkRequest.Attribute) attribute()}, and {@link com.trolltech.qt.network.QNetworkRequest.Attribute QNetworkRequest::Attribute }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.network.QNetworkRequest.Attribute code, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_Attribute_Object(nativeId(), code.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_Attribute_Object(long __this__nativeId, int code, java.lang.Object value);

/**
Sets the value of the known header <tt>header</tt> to be <tt>value</tt>, overriding any previously set headers. This operation also sets the equivalent raw HTTP header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest.KnownHeaders KnownHeaders }, {@link com.trolltech.qt.network.QNetworkRequest#setRawHeader(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) setRawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#header(com.trolltech.qt.network.QNetworkRequest.KnownHeaders) header()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders header, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeader_KnownHeaders_Object(nativeId(), header.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setHeader_KnownHeaders_Object(long __this__nativeId, int header, java.lang.Object value);

/**
Sets the header <tt>headerName</tt> to be of value <tt>headerValue</tt>. If <tt>headerName</tt> corresponds to a known header (see {@link com.trolltech.qt.network.QNetworkRequest.KnownHeaders QNetworkRequest::KnownHeaders }), the raw format will be parsed and the corresponding "cooked" header will be set as well. <p>For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
request.setRawHeader("Last-Modified", "Sun, 06 Nov 1994 08:49:37 GMT");
</pre> will also set the known header {@link com.trolltech.qt.network.QNetworkRequest.KnownHeaders LastModifiedHeader } to be the {@link com.trolltech.qt.core.QDateTime QDateTime} object of the parsed date. <p>Note: setting the same header twice overrides the previous setting. To accomplish the behaviour of multiple HTTP headers of the same name, you should concatenate the two values, separating them with a comma (",") and set one single raw header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest.KnownHeaders KnownHeaders }, {@link com.trolltech.qt.network.QNetworkRequest#setHeader(com.trolltech.qt.network.QNetworkRequest.KnownHeaders, java.lang.Object) setHeader()}, {@link com.trolltech.qt.network.QNetworkRequest#hasRawHeader(com.trolltech.qt.core.QByteArray) hasRawHeader()}, and {@link com.trolltech.qt.network.QNetworkRequest#rawHeader(com.trolltech.qt.core.QByteArray) rawHeader()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRawHeader(com.trolltech.qt.core.QByteArray headerName, com.trolltech.qt.core.QByteArray value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRawHeader_QByteArray_QByteArray(nativeId(), headerName == null ? 0 : headerName.nativeId(), value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRawHeader_QByteArray_QByteArray(long __this__nativeId, long headerName, long value);

/**
Sets this network request's SSL configuration to be <tt>config</tt>. The settings that apply are the private key, the local certificate, the SSL protocol (SSLv2, SSLv3, TLSv1 where applicable) and the ciphers that the SSL backend is allowed to use. <p>By default, no SSL configuration is set, which allows the backends to choose freely what configuration is best for them. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#sslConfiguration() sslConfiguration()}, and {@link com.trolltech.qt.network.QSslConfiguration#defaultConfiguration() QSslConfiguration::defaultConfiguration()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSslConfiguration(com.trolltech.qt.network.QSslConfiguration configuration)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSslConfiguration_QSslConfiguration(nativeId(), configuration == null ? 0 : configuration.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSslConfiguration_QSslConfiguration(long __this__nativeId, long configuration);

/**
Sets the URL this network request is referring to to be <tt>url</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#url() url()}. <br></DD></DT>
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
Returns this network request's SSL configuration. By default, no SSL settings are specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#setSslConfiguration(com.trolltech.qt.network.QSslConfiguration) setSslConfiguration()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QSslConfiguration sslConfiguration()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sslConfiguration(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QSslConfiguration __qt_sslConfiguration(long __this__nativeId);

/**
Returns the URL this network request is referring to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkRequest#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. <br></DD></DT>
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

    public static native QNetworkRequest fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkRequest(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkRequest array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkRequest)
        return operator_equal((com.trolltech.qt.network.QNetworkRequest) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkRequest clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkRequest __qt_clone(long __this_nativeId);
}
