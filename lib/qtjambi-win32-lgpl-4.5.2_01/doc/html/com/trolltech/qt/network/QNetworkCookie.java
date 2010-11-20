package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkCookie class holds one network cookie. Cookies are small bits of information that stateless protocols like HTTP use to maintain some persistent information across requests. <p>A cookie is set by a remote server when it replies to a request and it expects the same cookie to be sent back when further requests are sent. <p>QNetworkCookie holds one such cookie as received from the network. A cookie has a name and a value, but those are opaque to the application (that is, the information stored in them has no meaning to the application). A cookie has an associated path name and domain, which indicate when the cookie should be sent again to the server. <p>A cookie can also have an expiration date, indicating its validity. If the expiration date is not present, the cookie is considered a "session cookie" and should be discarded when the application exits (or when its concept of session is over). <p>QNetworkCookie provides a way of parsing a cookie from the HTTP header format using the {@link com.trolltech.qt.network.QNetworkCookie#parseCookies(com.trolltech.qt.core.QByteArray) QNetworkCookie::parseCookies()} function. However, when received in a {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, the cookie is already parsed. <p>This class implements cookies as described by the {@link <a href="../http-cgi-netscape-com-newsref-std-cookie-spec.html">initial cookie specification by Netscape</a>}, which is somewhat similar to the {@link <a href="../http-www-rfc-editor-org-rfc-rfc2109-txt.html">RFC 2109</a>} specification, plus the {@link <a href="../http-msdn-microsoft-com-en-us-library-ms533046-vs-85-aspx.html">"HttpOnly" extension</a>}. The more recent {@link <a href="../http-www-rfc-editor-org-rfc-rfc2965-txt.html">RFC 2965</a>} specification (which uses the Set-Cookie2 header) is not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookieJar QNetworkCookieJar}, {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, and {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkCookie extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
This enum is used with the {@link com.trolltech.qt.network.QNetworkCookie#toRawForm() toRawForm()} function to declare which form of a cookie shall be returned. Note that only the Full form of the cookie can be parsed back into its original contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#toRawForm() toRawForm()}, and {@link com.trolltech.qt.network.QNetworkCookie#parseCookies(com.trolltech.qt.core.QByteArray) parseCookies()}. <br></DD></DT>
*/

    public enum RawForm implements com.trolltech.qt.QtEnumerator {
/**
 makes {@link com.trolltech.qt.network.QNetworkCookie#toRawForm() toRawForm()} return only the "NAME=VALUE" part of the cookie, as suitable for sending back to a server in a client request's "Cookie:" header. Multiple cookies are separated by a semi-colon in the "Cookie:" header field.
*/

        NameAndValueOnly(0),
/**
 makes {@link com.trolltech.qt.network.QNetworkCookie#toRawForm() toRawForm()} return the full cookie contents, as suitable for sending to a client in a server's "Set-Cookie:" header. Multiple cookies are separated by commas in a "Set-Cookie:" header.
*/

        Full(1);

        RawForm(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QNetworkCookie$RawForm constant with the specified <tt>int</tt>.</brief>
*/

        public static RawForm resolve(int value) {
            return (RawForm) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NameAndValueOnly;
            case 1: return Full;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Create a new QNetworkCookie object, initializing the cookie name to <tt>name</tt> and its value to <tt>value</tt>. <p>A cookie is only valid if it has a name. However, the value is opaque to the application and being empty may have significance to the remote server.
*/

    public QNetworkCookie(com.trolltech.qt.core.QByteArray name) {
        this(name, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Create a new QNetworkCookie object, initializing the cookie name to <tt>name</tt> and its value to <tt>value</tt>. <p>A cookie is only valid if it has a name. However, the value is opaque to the application and being empty may have significance to the remote server.
*/

    public QNetworkCookie() {
        this((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Create a new QNetworkCookie object, initializing the cookie name to <tt>name</tt> and its value to <tt>value</tt>. <p>A cookie is only valid if it has a name. However, the value is opaque to the application and being empty may have significance to the remote server.
*/

    public QNetworkCookie(com.trolltech.qt.core.QByteArray name, com.trolltech.qt.core.QByteArray value){
        super((QPrivateConstructor)null);
        __qt_QNetworkCookie_QByteArray_QByteArray(name == null ? 0 : name.nativeId(), value == null ? 0 : value.nativeId());
    }

    native void __qt_QNetworkCookie_QByteArray_QByteArray(long name, long value);

/**
Creates a new QNetworkCookie object by copying the contents of <tt>other</tt>.
*/

    public QNetworkCookie(com.trolltech.qt.network.QNetworkCookie other){
        super((QPrivateConstructor)null);
        __qt_QNetworkCookie_QNetworkCookie(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkCookie_QNetworkCookie(long other);

/**
Returns the domain this cookie is associated with. This corresponds to the "domain" field of the cookie string. <p>Note that the domain here may start with a dot, which is not a valid hostname. However, it means this cookie matches all hostnames ending with that domain name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#setDomain(java.lang.String) setDomain()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String domain()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_domain(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_domain(long __this__nativeId);

/**
Returns the expiration date for this cookie. If this cookie is a session cookie, the {@link com.trolltech.qt.core.QDateTime QDateTime} returned will not be valid. If the date is in the past, this cookie has already expired and should not be sent again back to a remote server. <p>The expiration date corresponds to the parameters of the "expires" entry in the cookie string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#isSessionCookie() isSessionCookie()}, and {@link com.trolltech.qt.network.QNetworkCookie#setExpirationDate(com.trolltech.qt.core.QDateTime) setExpirationDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime expirationDate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expirationDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_expirationDate(long __this__nativeId);

/**
Returns true if the "HttpOnly" flag is enabled for this cookie. <p>A cookie that is "HttpOnly" is only set and retrieved by the network requests and replies; i.e., the HTTP protocol. It is not accessible from scripts running on browsers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#isSecure() isSecure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isHttpOnly()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHttpOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHttpOnly(long __this__nativeId);

/**
Returns true if the "secure" option was specified in the cookie string, false otherwise. <p>Secure cookies may contain private information and should not be resent over unencrypted connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#setSecure(boolean) setSecure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSecure()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSecure(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSecure(long __this__nativeId);

/**
Returns true if this cookie is a session cookie. A session cookie is a cookie which has no expiration date, which means it should be discarded when the application's concept of session is over (usually, when the application exits). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#expirationDate() expirationDate()}, and {@link com.trolltech.qt.network.QNetworkCookie#setExpirationDate(com.trolltech.qt.core.QDateTime) setExpirationDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSessionCookie()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSessionCookie(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSessionCookie(long __this__nativeId);

/**
Returns the name of this cookie. The only mandatory field of a cookie is its name, without which it is not considered valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#setName(com.trolltech.qt.core.QByteArray) setName()}, and {@link com.trolltech.qt.network.QNetworkCookie#value() value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkCookie other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkCookie(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkCookie(long __this__nativeId, long other);

/**
Returns the path associated with this cookie. This corresponds to the "path" field of the cookie string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#setPath(java.lang.String) setPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String path()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_path(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_path(long __this__nativeId);

/**
Sets the domain associated with this cookie to be <tt>domain</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#domain() domain()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDomain(java.lang.String domain)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDomain_String(nativeId(), domain);
    }
    @QtBlockedSlot
    native void __qt_setDomain_String(long __this__nativeId, java.lang.String domain);

/**
Sets the expiration date of this cookie to <tt>date</tt>. Setting an invalid expiration date to this cookie will mean it's a session cookie. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#isSessionCookie() isSessionCookie()}, and {@link com.trolltech.qt.network.QNetworkCookie#expirationDate() expirationDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setExpirationDate(com.trolltech.qt.core.QDateTime date)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpirationDate_QDateTime(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setExpirationDate_QDateTime(long __this__nativeId, long date);

/**
Sets this cookie's "HttpOnly" flag to <tt>enable</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#isHttpOnly() isHttpOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHttpOnly(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHttpOnly_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setHttpOnly_boolean(long __this__nativeId, boolean enable);

/**
Sets the name of this cookie to be <tt>cookieName</tt>. Note that setting a cookie name to an empty {@link com.trolltech.qt.core.QByteArray QByteArray} will make this cookie invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#name() name()}, and {@link com.trolltech.qt.network.QNetworkCookie#value() value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setName(com.trolltech.qt.core.QByteArray cookieName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_QByteArray(nativeId(), cookieName == null ? 0 : cookieName.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setName_QByteArray(long __this__nativeId, long cookieName);

/**
Sets the path associated with this cookie to be <tt>path</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#path() path()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPath(java.lang.String path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPath_String(nativeId(), path);
    }
    @QtBlockedSlot
    native void __qt_setPath_String(long __this__nativeId, java.lang.String path);

/**
Sets the secure flag of this cookie to <tt>enable</tt>. <p>Secure cookies may contain private information and should not be resent over unencrypted connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#isSecure() isSecure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSecure(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSecure_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setSecure_boolean(long __this__nativeId, boolean enable);

/**
Sets the value of this cookie to be <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#value() value()}, and {@link com.trolltech.qt.network.QNetworkCookie#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(com.trolltech.qt.core.QByteArray value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QByteArray(nativeId(), value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setValue_QByteArray(long __this__nativeId, long value);


/**
Returns the raw form of this QNetworkCookie. The {@link com.trolltech.qt.core.QByteArray QByteArray} returned by this function is suitable for an HTTP header, either in a server response (the Set-Cookie header) or the client request (the Cookie header). You can choose from one of two formats, using <tt>form</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#parseCookies(com.trolltech.qt.core.QByteArray) parseCookies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toRawForm() {
        return toRawForm(com.trolltech.qt.network.QNetworkCookie.RawForm.Full);
    }
/**
Returns the raw form of this QNetworkCookie. The {@link com.trolltech.qt.core.QByteArray QByteArray} returned by this function is suitable for an HTTP header, either in a server response (the Set-Cookie header) or the client request (the Cookie header). You can choose from one of two formats, using <tt>form</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#parseCookies(com.trolltech.qt.core.QByteArray) parseCookies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toRawForm(com.trolltech.qt.network.QNetworkCookie.RawForm form)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toRawForm_RawForm(nativeId(), form.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toRawForm_RawForm(long __this__nativeId, int form);

/**
Returns this cookies value, as specified in the cookie string. Note that a cookie is still valid if its value is empty. <p>Cookie name-value pairs are considered opaque to the application: that is, their values don't mean anything. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#setValue(com.trolltech.qt.core.QByteArray) setValue()}, and {@link com.trolltech.qt.network.QNetworkCookie#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_value(long __this__nativeId);

/**
Parses the cookie string <tt>cookieString</tt> as received from a server response in the "Set-Cookie." header. If there's a parsing error, this function returns an empty list. <p>Since the HTTP header can set more than one cookie at the same time, this function returns a QList&lt;QNetworkCookie&gt;, one for each cookie that is parsed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie#toRawForm() toRawForm()}. <br></DD></DT>
*/

    public static java.util.List<com.trolltech.qt.network.QNetworkCookie> parseCookies(com.trolltech.qt.core.QByteArray cookieString)    {
        return __qt_parseCookies_QByteArray(cookieString == null ? 0 : cookieString.nativeId());
    }
    native static java.util.List<com.trolltech.qt.network.QNetworkCookie> __qt_parseCookies_QByteArray(long cookieString);

/**
@exclude
*/

    public static native QNetworkCookie fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkCookie(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkCookie array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkCookie)
        return operator_equal((com.trolltech.qt.network.QNetworkCookie) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QNetworkCookie</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkCookie clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkCookie __qt_clone(long __this_nativeId);
}
