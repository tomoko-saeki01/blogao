package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QUrl class provides a convenient interface for working with URLs. It can parse and construct URLs in both encoded and unencoded form. QUrl also has support for internationalized domain names (IDNs). <p>The most common way to use QUrl is to initialize it via the constructor by passing a QString. Otherwise, {@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()} and {@link com.trolltech.qt.core.QUrl#setEncodedUrl(com.trolltech.qt.core.QByteArray) setEncodedUrl()} can also be used. <p>URLs can be represented in two forms: encoded or unencoded. The unencoded representation is suitable for showing to users, but the encoded representation is typically what you would send to a web server. For example, the unencoded URL "http://b&uuml;<tt></tt>hler.example.com" would be sent to the server as "http://xn--bhler-kva.example.com/List%20of%20applicants.xml". <p>A URL can also be constructed piece by piece by calling {@link com.trolltech.qt.core.QUrl#setScheme(java.lang.String) setScheme()}, {@link com.trolltech.qt.core.QUrl#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.core.QUrl#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.core.QUrl#setHost(java.lang.String) setHost()}, {@link com.trolltech.qt.core.QUrl#setPort(int) setPort()}, {@link com.trolltech.qt.core.QUrl#setPath(java.lang.String) setPath()}, {@link com.trolltech.qt.core.QUrl#setEncodedQuery(com.trolltech.qt.core.QByteArray) setEncodedQuery()} and {@link com.trolltech.qt.core.QUrl#setFragment(java.lang.String) setFragment()}. Some convenience functions are also available: {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()} sets the user name, password, host and port. {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()} sets the user name and password at once. <p>Call {@link com.trolltech.qt.core.QUrl#isValid() isValid()} to check if the URL is valid. This can be done at any point during the constructing of a URL. <p>Constructing a query is particularly convenient through the use of {@link com.trolltech.qt.core.QUrl#setQueryItems(java.util.List) setQueryItems()}, {@link com.trolltech.qt.core.QUrl#addQueryItem(java.lang.String, java.lang.String) addQueryItem()} and {@link com.trolltech.qt.core.QUrl#removeQueryItem(java.lang.String) removeQueryItem()}. Use {@link com.trolltech.qt.core.QUrl#setQueryDelimiters(byte, byte) setQueryDelimiters()} to customize the delimiters used for generating the query string. <p>For the convenience of generating encoded URL strings or query strings, there are two static functions called {@link com.trolltech.qt.core.QUrl#fromPercentEncoding(com.trolltech.qt.core.QByteArray) fromPercentEncoding()} and {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) toPercentEncoding()} which deal with percent encoding and decoding of QStrings. <p>Calling {@link com.trolltech.qt.core.QUrl#isRelative() isRelative()} will tell whether or not the URL is relative. A relative URL can be resolved by passing it as argument to {@link com.trolltech.qt.core.QUrl#resolved(com.trolltech.qt.core.QUrl) resolved()}, which returns an absolute URL. {@link com.trolltech.qt.core.QUrl#isParentOf(com.trolltech.qt.core.QUrl) isParentOf()} is used for determining whether one URL is a parent of another. <p>{@link com.trolltech.qt.core.QUrl#fromLocalFile(java.lang.String) fromLocalFile()} constructs a QUrl by parsing a local file path. {@link com.trolltech.qt.core.QUrl#toLocalFile() toLocalFile()} converts a URL to a local file path. <p>The human readable representation of the URL is fetched with {@link com.trolltech.qt.core.QUrl#toString(com.trolltech.qt.core.QUrl.FormattingOption[]) toString()}. This representation is appropriate for displaying a URL to a user in unencoded form. The encoded form however, as returned by {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}, is for internal use, passing to web servers, mail clients and so on. <p>QUrl conforms to the URI specification from {@link <a href="../http-www-rfc-editor-org-rfc-rfc3986-txt.html">RFC 3986</a>} (Uniform Resource Identifier: Generic Syntax), and includes scheme extensions from {@link <a href="../http-www-rfc-editor-org-rfc-rfc1738-txt.html">RFC 1738</a>} (Uniform Resource Locators). Case folding rules in QUrl conform to {@link <a href="../http-www-rfc-editor-org-rfc-rfc3491-txt.html">RFC 3491</a>} (Nameprep: A Stringprep Profile for Internationalized Domain Names (IDN)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo QUrlInfo}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QUrl extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
The parsing mode controls the way {@link com.trolltech.qt.core.QUrl QUrl} parses strings. In {@link com.trolltech.qt.core.QUrl.ParsingMode TolerantMode }, the parser corrects the following invalid input: <ul><li> Spaces and "%20": If an encoded URL contains a space, this will be replaced with "%20". If a decoded URL contains "%20", this will be replaced with a single space before the URL is parsed.</li><li> Single "%" characters: Any occurrences of a percent character "%" not followed by exactly two hexadecimal characters (e.g., "13% coverage.html") will be replaced by "%25".</li><li> Reserved and unreserved characters: An encoded URL should only contain a few characters as literals; all other characters should be percent-encoded. In {@link com.trolltech.qt.core.QUrl.ParsingMode TolerantMode }, these characters will be automatically percent-encoded where they are not allowed: space / double-quote / "&lt;" / "&gt;" / "[" / "" / "]" / "^" / "`" / "{" / "|" / "}"</li></ul>
*/

    public enum ParsingMode implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.core.QUrl QUrl} will try to correct some common errors in URLs. This mode is useful when processing URLs entered by users.
*/

        TolerantMode(0),
/**
 Only valid URLs are accepted. This mode is useful for general URL validation.
*/

        StrictMode(1);

        ParsingMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QUrl$ParsingMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ParsingMode resolve(int value) {
            return (ParsingMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TolerantMode;
            case 1: return StrictMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
The formatting options define how the URL is formatted when written out as text. Note that the case folding rules in {@link <a href="../http-www-rfc-editor-org-rfc-rfc3491-txt.html">Nameprep</a>}, which {@link com.trolltech.qt.core.QUrl QUrl} conforms to, require host names to always be converted to lower case, regardless of the Qt::FormattingOptions used.
*/

    public enum FormattingOption implements com.trolltech.qt.QtEnumerator {
/**
 The format of the URL is unchanged.
*/

        None(0),
/**
 The scheme is removed from the URL.
*/

        RemoveScheme(1),
/**
 Any password in the URL is removed.
*/

        RemovePassword(2),
/**
 Any user information in the URL is removed.
*/

        RemoveUserInfo(6),
/**
 Any specified port is removed from the URL.
*/

        RemovePort(8),
/**

*/

        RemoveAuthority(30),
/**
 The URL's path is removed, leaving only the scheme, host address, and port (if present).
*/

        RemovePath(32),
/**
 The query part of the URL (following a '?' character) is removed.
*/

        RemoveQuery(64),
/**

*/

        RemoveFragment(128),
/**
 The trailing slash is removed if one is present.
*/

        StripTrailingSlash(65536);

        FormattingOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QUrl$FormattingOptions with the specified <tt>com.trolltech.qt.core.QUrl$FormattingOption[]</tt> QUrl$FormattingOption values set.</brief>
*/

        public static FormattingOptions createQFlags(FormattingOption ... values) {
            return new FormattingOptions(values);
        }
/**
<brief>Returns the QUrl$FormattingOption constant with the specified <tt>int</tt>.</brief>
*/

        public static FormattingOption resolve(int value) {
            return (FormattingOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return RemoveScheme;
            case 2: return RemovePassword;
            case 6: return RemoveUserInfo;
            case 8: return RemovePort;
            case 30: return RemoveAuthority;
            case 32: return RemovePath;
            case 64: return RemoveQuery;
            case 128: return RemoveFragment;
            case 65536: return StripTrailingSlash;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FormattingOptions extends com.trolltech.qt.QFlags<FormattingOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QUrl-FormattingOptions with the specified <tt>com.trolltech.qt.core.QUrl.FormattingOption[]</tt>. flags set.</brief>
*/

        public FormattingOptions(FormattingOption ... args) { super(args); }
        public FormattingOptions(int value) { setValue(value); }
    }



/**
Constructs an empty QUrl object.
*/

    public QUrl(){
        super((QPrivateConstructor)null);
        __qt_QUrl();
    }

    native void __qt_QUrl();

/**
Constructs a URL by parsing <tt>url</tt>. <tt>url</tt> is assumed to be in human readable representation, with no percent encoding. QUrl will automatically percent encode all characters that are not allowed in a URL. <p>Example: <pre class="snippet">
        QUrl url = new QUrl("http://www.example.com/List of holidays.xml");
        // url.toEncoded() == "http://www.example.com/List%20of%20holidays.xml"
</pre> To construct a URL from an encoded string, call {@link com.trolltech.qt.core.QUrl#fromEncoded(com.trolltech.qt.core.QByteArray) fromEncoded()}: <pre class="snippet">
        QUrl url = QUrl.fromEncoded(new QByteArray("http://www.trolltech.com/List%20of%20holidays.xml"));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()}, {@link com.trolltech.qt.core.QUrl#setEncodedUrl(com.trolltech.qt.core.QByteArray) setEncodedUrl()}, {@link com.trolltech.qt.core.QUrl#fromEncoded(com.trolltech.qt.core.QByteArray) fromEncoded()}, and {@link com.trolltech.qt.core.QUrl.ParsingMode TolerantMode }. <br></DD></DT>
*/

    public QUrl(java.lang.String url){
        super((QPrivateConstructor)null);
        __qt_QUrl_String(url);
    }

    native void __qt_QUrl_String(java.lang.String url);

/**
This is an overloaded member function, provided for convenience. <p>Parses the <tt>url</tt> using the parser mode <tt>parsingMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()}. <br></DD></DT>
*/

    public QUrl(java.lang.String url, com.trolltech.qt.core.QUrl.ParsingMode mode){
        super((QPrivateConstructor)null);
        __qt_QUrl_String_ParsingMode(url, mode.value());
    }

    native void __qt_QUrl_String_ParsingMode(java.lang.String url, int mode);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QUrl(com.trolltech.qt.core.QUrl copy){
        super((QPrivateConstructor)null);
        __qt_QUrl_QUrl(copy == null ? 0 : copy.nativeId());
    }

    native void __qt_QUrl_QUrl(long copy);

/**
Inserts the pair <tt>key</tt> = <tt>value</tt> into the query string of the URL. <p>Note: this function does not verify that either <tt>key</tt> or <tt>value</tt> are properly encoded. It is the caller's responsibility to ensure that the query delimiters are properly encoded, if any. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#addQueryItem(java.lang.String, java.lang.String) addQueryItem()}, and {@link com.trolltech.qt.core.QUrl#setQueryDelimiters(byte, byte) setQueryDelimiters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addEncodedQueryItem(com.trolltech.qt.core.QByteArray key, com.trolltech.qt.core.QByteArray value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEncodedQueryItem_QByteArray_QByteArray(nativeId(), key == null ? 0 : key.nativeId(), value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addEncodedQueryItem_QByteArray_QByteArray(long __this__nativeId, long key, long value);

/**
Inserts the pair <tt>key</tt> = <tt>value</tt> into the query string of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#addEncodedQueryItem(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) addEncodedQueryItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addQueryItem(java.lang.String key, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addQueryItem_String_String(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_addQueryItem_String_String(long __this__nativeId, java.lang.String key, java.lang.String value);

/**
Returns the a list of query string values whose key is equal to <tt>key</tt> from the URL. <p>Note: if the encoded <tt>key</tt> does not match the encoded version of the query, this function will not work. That is, if the encoded query of this URL is "search=Qt%20Rules", calling this function with <tt>key</tt> = "%73earch" will return an empty list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#allQueryItemValues(java.lang.String) allQueryItemValues()}, {@link com.trolltech.qt.core.QUrl#queryItemValue(java.lang.String) queryItemValue()}, and {@link com.trolltech.qt.core.QUrl#encodedQueryItemValue(com.trolltech.qt.core.QByteArray) encodedQueryItemValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> allEncodedQueryItemValues(com.trolltech.qt.core.QByteArray key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allEncodedQueryItemValues_QByteArray(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_allEncodedQueryItemValues_QByteArray(long __this__nativeId, long key);

/**
Returns the a list of query string values whose key is equal to <tt>key</tt> from the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#queryItemValue(java.lang.String) queryItemValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> allQueryItemValues(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allQueryItemValues_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_allQueryItemValues_String(long __this__nativeId, java.lang.String key);

/**
Returns the authority of the URL if it is defined; otherwise an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String authority()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_authority(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_authority(long __this__nativeId);

/**
Resets the content of the QUrl. After calling this function, the QUrl is equal to one that has been constructed with the default empty constructor.
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns the fragment of the URL if it is defined; otherwise an empty string is returned. The returned value will have its non-ASCII and other control characters percent-encoded, as in {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedFragment(com.trolltech.qt.core.QByteArray) setEncodedFragment()}, and {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedFragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedFragment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedFragment(long __this__nativeId);

/**
Returns the host part of the URL if it is defined; otherwise an empty string is returned. <p>Note: {@link com.trolltech.qt.core.QUrl#encodedHost() encodedHost()} does not return percent-encoded hostnames. Instead, the ACE-encoded (bare ASCII in Punycode encoding) form will be returned for any non-ASCII hostname. <p>This function is equivalent to calling {@link com.trolltech.qt.core.QUrl#toAce(java.lang.String) QUrl::toAce()} on the return value of {@link com.trolltech.qt.core.QUrl#host() host()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedHost(com.trolltech.qt.core.QByteArray) setEncodedHost()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedHost()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedHost(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedHost(long __this__nativeId);

/**
Returns the password of the URL if it is defined; otherwise an empty string is returned. The returned value will have its non-ASCII and other control characters percent-encoded, as in {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedPassword(com.trolltech.qt.core.QByteArray) setEncodedPassword()}, and {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedPassword()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedPassword(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedPassword(long __this__nativeId);

/**
Returns the path of the URL if it is defined; otherwise an empty string is returned. The returned value will have its non-ASCII and other control characters percent-encoded, as in {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedPath(com.trolltech.qt.core.QByteArray) setEncodedPath()}, and {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedPath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedPath(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedPath(long __this__nativeId);

/**
Returns the query string of the URL in percent encoded form. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedQuery(com.trolltech.qt.core.QByteArray) setEncodedQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedQuery(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedQuery(long __this__nativeId);

/**
Returns the first query string value whose key is equal to <tt>key</tt> from the URL. <p>Note: if the encoded <tt>key</tt> does not match the encoded version of the query, this function will not work. That is, if the encoded query of this URL is "search=Qt%20Rules", calling this function with <tt>key</tt> = "%73earch" will return an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#queryItemValue(java.lang.String) queryItemValue()}, and {@link com.trolltech.qt.core.QUrl#allQueryItemValues(java.lang.String) allQueryItemValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedQueryItemValue(com.trolltech.qt.core.QByteArray key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedQueryItemValue_QByteArray(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedQueryItemValue_QByteArray(long __this__nativeId, long key);

/**
Returns the query string of the URL, as a map of encoded keys and values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedQueryItems(java.util.List) setEncodedQueryItems()}, {@link com.trolltech.qt.core.QUrl#setQueryItems(java.util.List) setQueryItems()}, and {@link com.trolltech.qt.core.QUrl#setEncodedQuery(com.trolltech.qt.core.QByteArray) setEncodedQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> encodedQueryItems()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedQueryItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> __qt_encodedQueryItems(long __this__nativeId);

/**
Returns the user name of the URL if it is defined; otherwise an empty string is returned. The returned value will have its non-ASCII and other control characters percent-encoded, as in {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedUserName(com.trolltech.qt.core.QByteArray) setEncodedUserName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray encodedUserName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_encodedUserName(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_encodedUserName(long __this__nativeId);

/**
Returns a text string that explains why an URL is invalid in the case being; otherwise returns an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns the fragment of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setFragment(java.lang.String) setFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fragment(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fragment(long __this__nativeId);

/**
Returns true if there is a query string pair whose key is equal to <tt>key</tt> from the URL. <p>Note: if the encoded <tt>key</tt> does not match the encoded version of the query, this function will return false. That is, if the encoded query of this URL is "search=Qt%20Rules", calling this function with <tt>key</tt> = "%73earch" will return false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#hasQueryItem(java.lang.String) hasQueryItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasEncodedQueryItem(com.trolltech.qt.core.QByteArray key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasEncodedQueryItem_QByteArray(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasEncodedQueryItem_QByteArray(long __this__nativeId, long key);

/**
Returns true if this URL contains a fragment (i. ., if # was seen on it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#fragment() fragment()}, and {@link com.trolltech.qt.core.QUrl#setFragment(java.lang.String) setFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasFragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFragment(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFragment(long __this__nativeId);

/**
Returns true if this URL contains a Query (i. ., if ? was seen on it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#hasQueryItem(java.lang.String) hasQueryItem()}, and {@link com.trolltech.qt.core.QUrl#encodedQuery() encodedQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasQuery(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasQuery(long __this__nativeId);

/**
Returns true if there is a query string pair whose key is equal to <tt>key</tt> from the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#hasEncodedQueryItem(com.trolltech.qt.core.QByteArray) hasEncodedQueryItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasQueryItem(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasQueryItem_String(nativeId(), key);
    }
    @QtBlockedSlot
    native boolean __qt_hasQueryItem_String(long __this__nativeId, java.lang.String key);

/**
Returns the host of the URL if it is defined; otherwise an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setHost(java.lang.String) setHost()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String host()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_host(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_host(long __this__nativeId);

/**
Returns true if the URL has no data; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns true if this URL is a parent of <tt>childUrl</tt>. <tt>childUrl</tt> is a child of this URL if the two URLs share the same scheme and authority, and this URL's path is a parent of the path of <tt>childUrl</tt>.
*/

    @QtBlockedSlot
    public final boolean isParentOf(com.trolltech.qt.core.QUrl url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isParentOf_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isParentOf_QUrl(long __this__nativeId, long url);

/**
Returns true if the URL is relative; otherwise returns false. A URL is relative if its scheme is undefined; this function is therefore equivalent to calling {@link com.trolltech.qt.core.QUrl#scheme() scheme()}.{@link com.trolltech.qt.core.QUrl#isEmpty() isEmpty()}.
*/

    @QtBlockedSlot
    public final boolean isRelative()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRelative(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRelative(long __this__nativeId);

/**
Returns true if the URL is valid; otherwise returns false. <p>The URL is run through a conformance test. Every part of the URL must conform to the standard encoding rules of the URI standard for the URL to be reported as valid. <pre class="snippet">
        private boolean checkUrl(QUrl url) {
            if (!url.isValid()) {
                System.out.println("Invalid URL: " + url);
                return false;
            }

            return true;
        }
</pre>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.core.QUrl url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QUrl(long __this__nativeId, long url);

/**
<brief>Writes thisQUrl
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QUrl url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QUrl(long __this__nativeId, long url);

/**
<brief>Reads a QUrl
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
Returns the password of the URL if it is defined; otherwise an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setPassword(java.lang.String) setPassword()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String password()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_password(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_password(long __this__nativeId);

/**
Returns the path of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setPath(java.lang.String) setPath()}. <br></DD></DT>
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
Returns the port of the URL, or -1 if the port is unspecified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setPort(int) setPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int port()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_port(nativeId());
    }
    @QtBlockedSlot
    native int __qt_port(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns the port of the URL, or <tt>defaultPort</tt> if the port is unspecified. <p>Example: <pre class="snippet">
        QFtp ftp = new QFtp();
        ftp.connectToHost(url.host(), (char)url.port(21));
</pre>
*/

    @QtBlockedSlot
    public final int port(int defaultPort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_port_int(nativeId(), defaultPort);
    }
    @QtBlockedSlot
    native int __qt_port_int(long __this__nativeId, int defaultPort);

/**
Returns the first query string value whose key is equal to <tt>key</tt> from the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#allQueryItemValues(java.lang.String) allQueryItemValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String queryItemValue(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_queryItemValue_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.lang.String __qt_queryItemValue_String(long __this__nativeId, java.lang.String key);

/**
Returns the query string of the URL, as a map of keys and values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setQueryItems(java.util.List) setQueryItems()}, and {@link com.trolltech.qt.core.QUrl#setEncodedQuery(com.trolltech.qt.core.QByteArray) setEncodedQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> queryItems()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_queryItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> __qt_queryItems(long __this__nativeId);

/**
Returns the character used to delimit between key-value pairs in the query string of the URL.
*/

    @QtBlockedSlot
    public final byte queryPairDelimiter()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_queryPairDelimiter(nativeId());
    }
    @QtBlockedSlot
    native byte __qt_queryPairDelimiter(long __this__nativeId);

/**
Returns the character used to delimit between keys and values in the query string of the URL.
*/

    @QtBlockedSlot
    public final byte queryValueDelimiter()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_queryValueDelimiter(nativeId());
    }
    @QtBlockedSlot
    native byte __qt_queryValueDelimiter(long __this__nativeId);

/**
Removes all the query string pairs whose key is equal to <tt>key</tt> from the URL. <p>Note: if the encoded <tt>key</tt> does not match the encoded version of the query, this function will not work. That is, if the encoded query of this URL is "search=Qt%20Rules", calling this function with <tt>key</tt> = "%73earch" will do nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#removeQueryItem(java.lang.String) removeQueryItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeAllEncodedQueryItems(com.trolltech.qt.core.QByteArray key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAllEncodedQueryItems_QByteArray(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeAllEncodedQueryItems_QByteArray(long __this__nativeId, long key);

/**
Removes all the query string pairs whose key is equal to <tt>key</tt> from the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#removeQueryItem(java.lang.String) removeQueryItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeAllQueryItems(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAllQueryItems_String(nativeId(), key);
    }
    @QtBlockedSlot
    native void __qt_removeAllQueryItems_String(long __this__nativeId, java.lang.String key);

/**
Removes the first query string pair whose key is equal to <tt>key</tt> from the URL. <p>Note: if the encoded <tt>key</tt> does not match the encoded version of the query, this function will not work. That is, if the encoded query of this URL is "search=Qt%20Rules", calling this function with <tt>key</tt> = "%73earch" will do nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#removeQueryItem(java.lang.String) removeQueryItem()}, and {@link com.trolltech.qt.core.QUrl#removeAllQueryItems(java.lang.String) removeAllQueryItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeEncodedQueryItem(com.trolltech.qt.core.QByteArray key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeEncodedQueryItem_QByteArray(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeEncodedQueryItem_QByteArray(long __this__nativeId, long key);

/**
Removes the first query string pair whose key is equal to <tt>key</tt> from the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#removeAllQueryItems(java.lang.String) removeAllQueryItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeQueryItem(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeQueryItem_String(nativeId(), key);
    }
    @QtBlockedSlot
    native void __qt_removeQueryItem_String(long __this__nativeId, java.lang.String key);

/**
Returns the result of the merge of this URL with <tt>relative</tt>. This URL is used as a base to convert <tt>relative</tt> to an absolute URL. <p>If <tt>relative</tt> is not a relative URL, this function will return <tt>relative</tt> directly. Otherwise, the paths of the two URLs are merged, and the new URL returned has the scheme and authority of the base URL, but with the merged path, as in the following example: <pre class="snippet">
         QUrl baseUrl = new QUrl("http://www.trolltech.com/support");
         QUrl relativeUrl = new QUrl("../products/solutions");
         System.out.println(baseUrl.resolved(relativeUrl).toString());
         // prints "http://www.trolltech.com/products/solutions"
</pre> Calling {@link com.trolltech.qt.core.QUrl#resolved(com.trolltech.qt.core.QUrl) resolved()} with ".." returns a QUrl whose directory is one level higher than the original. Similarly, calling {@link com.trolltech.qt.core.QUrl#resolved(com.trolltech.qt.core.QUrl) resolved()} with "../.." removes two levels from the path. If <tt>relative</tt> is "/", the path becomes "/". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl resolved(com.trolltech.qt.core.QUrl relative)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolved_QUrl(nativeId(), relative == null ? 0 : relative.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_resolved_QUrl(long __this__nativeId, long relative);

/**
Returns the scheme of the URL. If an empty string is returned, this means the scheme is undefined and the URL is then relative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setScheme(java.lang.String) setScheme()}, and {@link com.trolltech.qt.core.QUrl#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String scheme()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scheme(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_scheme(long __this__nativeId);

/**
Sets the authority of the URL to <tt>authority</tt>. <p>The authority of a URL is the combination of user info, a host name and a port. All of these elements are optional; an empty authority is therefore valid. <p>The user info and host are separated by a '@', and the host and port are separated by a ':'. If the user info is empty, the '@' must be omitted; although a stray ':' is permitted if the port is empty. <p>The following example shows a valid authority string: <br><center><img src="../images/qurl-authority.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#authority() authority()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAuthority(java.lang.String authority)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAuthority_String(nativeId(), authority);
    }
    @QtBlockedSlot
    native void __qt_setAuthority_String(long __this__nativeId, java.lang.String authority);

/**
Sets the URL's fragment to the percent-encoded <tt>fragment</tt>. The fragment is the last part of the URL, represented by a '#' followed by a string of characters. It is typically used in HTTP for referring to a certain link or point on a page: <br><center><img src="../images/qurl-fragment.png"></center><br> The fragment is sometimes also referred to as the URL "reference". <p>Passing an argument of QByteArray() (a null {@link com.trolltech.qt.core.QByteArray QByteArray}) will unset the fragment. Passing an argument of {@link com.trolltech.qt.core.QByteArray QByteArray}("") (an empty but not null {@link com.trolltech.qt.core.QByteArray QByteArray}) will set the fragment to an empty string (as if the original URL had a lone "#"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setFragment(java.lang.String) setFragment()}, and {@link com.trolltech.qt.core.QUrl#encodedFragment() encodedFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedFragment(com.trolltech.qt.core.QByteArray fragment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedFragment_QByteArray(nativeId(), fragment == null ? 0 : fragment.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedFragment_QByteArray(long __this__nativeId, long fragment);

/**
Sets the URL's host to the ACE- or percent-encoded <tt>host</tt>. The <tt>host</tt> is part of the user info element in the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setHost(java.lang.String) setHost()}, {@link com.trolltech.qt.core.QUrl#encodedHost() encodedHost()}, {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}, and {@link com.trolltech.qt.core.QUrl#fromAce(com.trolltech.qt.core.QByteArray) fromAce()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedHost(com.trolltech.qt.core.QByteArray host)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedHost_QByteArray(nativeId(), host == null ? 0 : host.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedHost_QByteArray(long __this__nativeId, long host);

/**
Sets the URL's password to the percent-encoded <tt>password</tt>. The <tt>password</tt> is part of the user info element in the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <p>Note: this function does not verify that <tt>password</tt> is properly encoded. It is the caller's responsibility to ensure that the any delimiters (such as colons or slashes) are properly encoded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.core.QUrl#encodedPassword() encodedPassword()}, and {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedPassword(com.trolltech.qt.core.QByteArray password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedPassword_QByteArray(nativeId(), password == null ? 0 : password.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedPassword_QByteArray(long __this__nativeId, long password);

/**
Sets the URL's path to the percent-encoded <tt>path</tt>. The path is the part of the URL that comes after the authority but before the query string. <br><center><img src="../images/qurl-ftppath.png"></center><br> For non-hierarchical schemes, the path will be everything following the scheme declaration, as in the following example: <br><center><img src="../images/qurl-mailtopath.png"></center><br> Note: this function does not verify that <tt>path</tt> is properly encoded. It is the caller's responsibility to ensure that the any delimiters (such as '?' and '#') are properly encoded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setPath(java.lang.String) setPath()}, {@link com.trolltech.qt.core.QUrl#encodedPath() encodedPath()}, and {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedPath(com.trolltech.qt.core.QByteArray path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedPath_QByteArray(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedPath_QByteArray(long __this__nativeId, long path);

/**
Sets the query string of the URL to <tt>query</tt>. The string is inserted as-is, and no further encoding is performed when calling {@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}. <p>This function is useful if you need to pass a query string that does not fit into the key-value pattern, or that uses a different scheme for encoding special characters than what is suggested by QUrl. <p>Passing a value of QByteArray() to <tt>query</tt> (a null {@link com.trolltech.qt.core.QByteArray QByteArray}) unsets the query completely. However, passing a value of {@link com.trolltech.qt.core.QByteArray QByteArray}("") will set the query to an empty value, as if the original URL had a lone "?". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#encodedQuery() encodedQuery()}, and {@link com.trolltech.qt.core.QUrl#hasQuery() hasQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedQuery(com.trolltech.qt.core.QByteArray query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedQuery_QByteArray(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedQuery_QByteArray(long __this__nativeId, long query);

/**
Sets the query string of the URL to the encoded version of <tt>query</tt>. The contents of <tt>query</tt> are converted to a string internally, each pair delimited by the character returned by {@link com.trolltech.qt.core.QUrl#setEncodedQueryItems(java.util.List) pairDelimiter()}, and the key and value are delimited by {@link com.trolltech.qt.core.QUrl#setEncodedQueryItems(java.util.List) valueDelimiter()}. <p>Note: this function does not verify that the key-value pairs are properly encoded. It is the caller's responsibility to ensure that the query delimiters are properly encoded, if any. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setQueryDelimiters(byte, byte) setQueryDelimiters()}, {@link com.trolltech.qt.core.QUrl#encodedQueryItems() encodedQueryItems()}, and {@link com.trolltech.qt.core.QUrl#setQueryItems(java.util.List) setQueryItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedQueryItems(java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedQueryItems_List(nativeId(), query);
    }
    @QtBlockedSlot
    native void __qt_setEncodedQueryItems_List(long __this__nativeId, java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> query);

/**
Constructs a URL by parsing the contents of <tt>encodedUrl</tt>. <p><tt>encodedUrl</tt> is assumed to be a URL string in percent encoded form, containing only ASCII characters. <p>Use {@link com.trolltech.qt.core.QUrl#isValid() isValid()} to determine if a valid URL was constructed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedUrl(com.trolltech.qt.core.QByteArray url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedUrl_QByteArray(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedUrl_QByteArray(long __this__nativeId, long url);

/**
Constructs a URL by parsing the contents of <tt>encodedUrl</tt> using the given <tt>parsingMode</tt>.
*/

    @QtBlockedSlot
    public final void setEncodedUrl(com.trolltech.qt.core.QByteArray url, com.trolltech.qt.core.QUrl.ParsingMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedUrl_QByteArray_ParsingMode(nativeId(), url == null ? 0 : url.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setEncodedUrl_QByteArray_ParsingMode(long __this__nativeId, long url, int mode);

/**
Sets the URL's user name to the percent-encoded <tt>userName</tt>. The <tt>userName</tt> is part of the user info element in the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <p>Note: this function does not verify that <tt>userName</tt> is properly encoded. It is the caller's responsibility to ensure that the any delimiters (such as colons or slashes) are properly encoded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.core.QUrl#encodedUserName() encodedUserName()}, and {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEncodedUserName(com.trolltech.qt.core.QByteArray userName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEncodedUserName_QByteArray(nativeId(), userName == null ? 0 : userName.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEncodedUserName_QByteArray(long __this__nativeId, long userName);

/**
Sets the fragment of the URL to <tt>fragment</tt>. The fragment is the last part of the URL, represented by a '#' followed by a string of characters. It is typically used in HTTP for referring to a certain link or point on a page: <br><center><img src="../images/qurl-fragment.png"></center><br> The fragment is sometimes also referred to as the URL "reference". <p>Passing an argument of QString() (a null QString) will unset the fragment. Passing an argument of QString("") (an empty but not null QString) will set the fragment to an empty string (as if the original URL had a lone "#"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#fragment() fragment()}, and {@link com.trolltech.qt.core.QUrl#hasFragment() hasFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFragment(java.lang.String fragment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFragment_String(nativeId(), fragment);
    }
    @QtBlockedSlot
    native void __qt_setFragment_String(long __this__nativeId, java.lang.String fragment);

/**
Sets the host of the URL to <tt>host</tt>. The host is part of the authority. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#host() host()}, and {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHost(java.lang.String host)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHost_String(nativeId(), host);
    }
    @QtBlockedSlot
    native void __qt_setHost_String(long __this__nativeId, java.lang.String host);

/**
Sets the URL's password to <tt>password</tt>. The <tt>password</tt> is part of the user info element in the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#password() password()}, and {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPassword(java.lang.String password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPassword_String(nativeId(), password);
    }
    @QtBlockedSlot
    native void __qt_setPassword_String(long __this__nativeId, java.lang.String password);

/**
Sets the path of the URL to <tt>path</tt>. The path is the part of the URL that comes after the authority but before the query string. <br><center><img src="../images/qurl-ftppath.png"></center><br> For non-hierarchical schemes, the path will be everything following the scheme declaration, as in the following example: <br><center><img src="../images/qurl-mailtopath.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#path() path()}. <br></DD></DT>
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
Sets the port of the URL to <tt>port</tt>. The port is part of the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <p><tt>port</tt> must be between 0 and 65535 inclusive. Setting the port to -1 indicates that the port is unspecified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#port() port()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPort(int port)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPort_int(nativeId(), port);
    }
    @QtBlockedSlot
    native void __qt_setPort_int(long __this__nativeId, int port);

/**
Sets the characters used for delimiting between keys and values, and between key-value pairs in the URL's query string. The default value delimiter is '=' and the default pair delimiter is '&'. <br><center><img src="../images/qurl-querystring.png"></center><br> <tt>valueDelimiter</tt> will be used for separating keys from values, and <tt>pairDelimiter</tt> will be used to separate key-value pairs. Any occurrences of these delimiting characters in the encoded representation of the keys and values of the query string are percent encoded. <p>If <tt>valueDelimiter</tt> is set to '-' and <tt>pairDelimiter</tt> is '/', the above query string would instead be represented like this: <pre class="snippet">
        http://www.example.com/cgi-bin/drawgraph.cgi?type-pie/color-green
</pre> Calling this function does not change the delimiters of the current query string. It only affects {@link com.trolltech.qt.core.QUrl#queryItems() queryItems()}, {@link com.trolltech.qt.core.QUrl#setQueryItems(java.util.List) setQueryItems()} and addQueryItems().
*/

    @QtBlockedSlot
    public final void setQueryDelimiters(byte valueDelimiter, byte pairDelimiter)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQueryDelimiters_byte_byte(nativeId(), valueDelimiter, pairDelimiter);
    }
    @QtBlockedSlot
    native void __qt_setQueryDelimiters_byte_byte(long __this__nativeId, byte valueDelimiter, byte pairDelimiter);

/**
Sets the query string of the URL to an encoded version of
<tt>query</tt>. The contents of <tt>query</tt> are converted to a
string internally, each pair delimited by the character returned by
pairDelimiter(), and the key and value are delimited by
valueDelimiter().
*/

    @QtBlockedSlot
    public final void setQueryItems(java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQueryItems_List(nativeId(), query);
    }
    @QtBlockedSlot
    native void __qt_setQueryItems_List(long __this__nativeId, java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> query);

/**
Sets the scheme of the URL to <tt>scheme</tt>. As a scheme can only contain ASCII characters, no conversion or encoding is done on the input. <p>The scheme describes the type (or protocol) of the URL. It's represented by one or more ASCII characters at the start the URL, and is followed by a ':'. The following example shows a URL where the scheme is "ftp": <br><center><img src="../images/qurl-authority2.png"></center><br> The scheme can also be empty, in which case the URL is interpreted as relative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#scheme() scheme()}, and {@link com.trolltech.qt.core.QUrl#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScheme(java.lang.String scheme)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScheme_String(nativeId(), scheme);
    }
    @QtBlockedSlot
    native void __qt_setScheme_String(long __this__nativeId, java.lang.String scheme);

/**
Constructs a URL by parsing the contents of <tt>url</tt>. <p><tt>url</tt> is assumed to be in unicode format, with no percent encoding. <p>Calling {@link com.trolltech.qt.core.QUrl#isValid() isValid()} will tell whether or not a valid URL was constructed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedUrl(com.trolltech.qt.core.QByteArray) setEncodedUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUrl(java.lang.String url)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrl_String(nativeId(), url);
    }
    @QtBlockedSlot
    native void __qt_setUrl_String(long __this__nativeId, java.lang.String url);

/**
This is an overloaded member function, provided for convenience. <p>Parses <tt>url</tt> using the parsing mode <tt>parsingMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedUrl(com.trolltech.qt.core.QByteArray) setEncodedUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUrl(java.lang.String url, com.trolltech.qt.core.QUrl.ParsingMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrl_String_ParsingMode(nativeId(), url, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setUrl_String_ParsingMode(long __this__nativeId, java.lang.String url, int mode);

/**
Sets the user info of the URL to <tt>userInfo</tt>. The user info is an optional part of the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <p>The user info consists of a user name and optionally a password, separated by a ':'. If the password is empty, the colon must be omitted. The following example shows a valid user info string: <br><center><img src="../images/qurl-authority3.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#userInfo() userInfo()}, {@link com.trolltech.qt.core.QUrl#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.core.QUrl#setPassword(java.lang.String) setPassword()}, and {@link com.trolltech.qt.core.QUrl#setAuthority(java.lang.String) setAuthority()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserInfo(java.lang.String userInfo)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserInfo_String(nativeId(), userInfo);
    }
    @QtBlockedSlot
    native void __qt_setUserInfo_String(long __this__nativeId, java.lang.String userInfo);

/**
Sets the URL's user name to <tt>userName</tt>. The <tt>userName</tt> is part of the user info element in the authority of the URL, as described in {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setEncodedUserName(com.trolltech.qt.core.QByteArray) setEncodedUserName()}, {@link com.trolltech.qt.core.QUrl#userName() userName()}, and {@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserName(java.lang.String userName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserName_String(nativeId(), userName);
    }
    @QtBlockedSlot
    native void __qt_setUserName_String(long __this__nativeId, java.lang.String userName);


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toEncoded(com.trolltech.qt.core.QUrl.FormattingOption ... options) {
        return this.toEncoded(new com.trolltech.qt.core.QUrl.FormattingOptions(options));
    }

/**
Returns the encoded representation of the URL if it's valid; otherwise an empty {@link com.trolltech.qt.core.QByteArray QByteArray} is returned. The output can be customized by passing flags with <tt>options</tt>. <p>The user info, path and fragment are all converted to UTF-8, and all non-ASCII characters are then percent encoded. The host name is encoded using Punycode.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toEncoded() {
        return toEncoded(new com.trolltech.qt.core.QUrl.FormattingOptions(0));
    }
/**
Returns the encoded representation of the URL if it's valid; otherwise an empty {@link com.trolltech.qt.core.QByteArray QByteArray} is returned. The output can be customized by passing flags with <tt>options</tt>. <p>The user info, path and fragment are all converted to UTF-8, and all non-ASCII characters are then percent encoded. The host name is encoded using Punycode.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toEncoded(com.trolltech.qt.core.QUrl.FormattingOptions options)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toEncoded_FormattingOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toEncoded_FormattingOptions(long __this__nativeId, int options);

/**
Returns the path of this URL formatted as a local file path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#fromLocalFile(java.lang.String) fromLocalFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toLocalFile()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toLocalFile(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toLocalFile(long __this__nativeId);


/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QUrl$FormattingOption[]</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QUrl.FormattingOption ... options) {
        return this.toString(new com.trolltech.qt.core.QUrl.FormattingOptions(options));
    }

/**
<brief>Returns a string representation of the <tt>this QUrl</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString() {
        return toString(new com.trolltech.qt.core.QUrl.FormattingOptions(0));
    }
/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QUrl$FormattingOptions</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QUrl.FormattingOptions options)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_FormattingOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_FormattingOptions(long __this__nativeId, int options);

/**
Returns the user info of the URL, or an empty string if the user info is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUserInfo(java.lang.String) setUserInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String userInfo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userInfo(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_userInfo(long __this__nativeId);

/**
Returns the user name of the URL if it is defined; otherwise an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setUserName(java.lang.String) setUserName()}, and {@link com.trolltech.qt.core.QUrl#encodedUserName() encodedUserName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String userName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_userName(long __this__nativeId);

/**
Returns the Unicode form of the given domain name <tt>domain</tt>, which is encoded in the ASCII Compatible Encoding (ACE). The result of this function is considered equivalent to <tt>domain</tt>. <p>If the value in <tt>domain</tt> cannot be encoded, it will be converted to QString and returned. <p>The ASCII Compatible Encoding (ACE) is defined by RFC 3490, RFC 3491 and RFC 3492. It is part of the Internationalizing Domain Names in Applications (IDNA) specification, which allows for domain names (like <tt>"qtsoftware.com"</tt>) to be written using international characters.
*/

    public static java.lang.String fromAce(com.trolltech.qt.core.QByteArray arg__1)    {
        return __qt_fromAce_QByteArray(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static java.lang.String __qt_fromAce_QByteArray(long arg__1);

/**
Parses <tt>input</tt> and returns the corresponding QUrl. <tt>input</tt> is assumed to be in encoded form, containing only ASCII characters. <p>The URL is parsed using {@link com.trolltech.qt.core.QUrl.ParsingMode TolerantMode }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}, and {@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QUrl fromEncoded(com.trolltech.qt.core.QByteArray url)    {
        return __qt_fromEncoded_QByteArray(url == null ? 0 : url.nativeId());
    }
    native static com.trolltech.qt.core.QUrl __qt_fromEncoded_QByteArray(long url);

/**
This is an overloaded member function, provided for convenience. <p>Parses the URL using <tt>parsingMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#toEncoded(com.trolltech.qt.core.QUrl.FormattingOption[]) toEncoded()}, and {@link com.trolltech.qt.core.QUrl#setUrl(java.lang.String) setUrl()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QUrl fromEncoded(com.trolltech.qt.core.QByteArray url, com.trolltech.qt.core.QUrl.ParsingMode mode)    {
        return __qt_fromEncoded_QByteArray_ParsingMode(url == null ? 0 : url.nativeId(), mode.value());
    }
    native static com.trolltech.qt.core.QUrl __qt_fromEncoded_QByteArray_ParsingMode(long url, int mode);

/**
Returns a QUrl representation of <tt>localFile</tt>, interpreted as a local file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#toLocalFile() toLocalFile()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QUrl fromLocalFile(java.lang.String localfile);

/**
Returns a decoded copy of <tt>input</tt>. <tt>input</tt> is first decoded from percent encoding, then converted from UTF-8 to unicode.
*/

    public static java.lang.String fromPercentEncoding(com.trolltech.qt.core.QByteArray arg__1)    {
        return __qt_fromPercentEncoding_QByteArray(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static java.lang.String __qt_fromPercentEncoding_QByteArray(long arg__1);

/**
Returns the current whitelist of top-level domains that are allowed to have non-ASCII characters in their compositions. <p>See {@link com.trolltech.qt.core.QUrl#setIdnWhitelist(java.util.List) setIdnWhitelist()} for the rationale of this list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#setIdnWhitelist(java.util.List) setIdnWhitelist()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> idnWhitelist();

/**
Sets the whitelist of Top-Level Domains (TLDs) that are allowed to have non-ASCII characters in domains to the value of <tt>list</tt>. <p>Qt has comes a default list that contains the Internet top-level domains that have published support for Internationalized Domain Names (IDNs) and rules to guarantee that no deception can happen between similarly-looking characters (such as the Latin lowercase letter <tt>'a'</tt> and the Cyrillic equivalent, which in most fonts are visually identical). <p>This list is periodically maintained, as registrars publish new rules. <p>This function is provided for those who need to manipulate the list, in order to add or remove a TLD. It is not recommended to change its value for purposes other than testing, as it may expose users to security risks. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#idnWhitelist() idnWhitelist()}. <br></DD></DT>
*/

    public native static void setIdnWhitelist(java.util.List<java.lang.String> arg__1);

/**
Returns the ASCII Compatible Encoding of the given domain name <tt>domain</tt>. The result of this function is considered equivalent to <tt>domain</tt>. <p>The ASCII-Compatible Encoding (ACE) is defined by RFC 3490, RFC 3491 and RFC 3492. It is part of the Internationalizing Domain Names in Applications (IDNA) specification, which allows for domain names (like <tt>"qtsoftware.com"</tt>) to be written using international characters.
*/

    public native static com.trolltech.qt.core.QByteArray toAce(java.lang.String arg__1);


/**
Returns an encoded copy of <tt>input</tt>. <tt>input</tt> is first converted to UTF-8, and all ASCII-characters that are not in the unreserved group are percent encoded. To prevent characters from being percent encoded pass them to <tt>exclude</tt>. To force characters to be percent encoded pass them to <tt>include</tt>. <p>Unreserved is defined as: ALPHA / DIGIT / "-" / "." / "_" / "~" <pre class="snippet">
         QByteArray ba = QUrl.toPercentEncoding("{a fishy string?}", new QByteArray("{}"), new QByteArray("s"));
         System.out.println(ba);
         // prints "{a fi%73hy %73tring%3F}"
</pre>
*/

    public static com.trolltech.qt.core.QByteArray toPercentEncoding(java.lang.String arg__1, com.trolltech.qt.core.QByteArray exclude) {
        return toPercentEncoding(arg__1, exclude, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Returns an encoded copy of <tt>input</tt>. <tt>input</tt> is first converted to UTF-8, and all ASCII-characters that are not in the unreserved group are percent encoded. To prevent characters from being percent encoded pass them to <tt>exclude</tt>. To force characters to be percent encoded pass them to <tt>include</tt>. <p>Unreserved is defined as: ALPHA / DIGIT / "-" / "." / "_" / "~" <pre class="snippet">
         QByteArray ba = QUrl.toPercentEncoding("{a fishy string?}", new QByteArray("{}"), new QByteArray("s"));
         System.out.println(ba);
         // prints "{a fi%73hy %73tring%3F}"
</pre>
*/

    public static com.trolltech.qt.core.QByteArray toPercentEncoding(java.lang.String arg__1) {
        return toPercentEncoding(arg__1, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Returns an encoded copy of <tt>input</tt>. <tt>input</tt> is first converted to UTF-8, and all ASCII-characters that are not in the unreserved group are percent encoded. To prevent characters from being percent encoded pass them to <tt>exclude</tt>. To force characters to be percent encoded pass them to <tt>include</tt>. <p>Unreserved is defined as: ALPHA / DIGIT / "-" / "." / "_" / "~" <pre class="snippet">
         QByteArray ba = QUrl.toPercentEncoding("{a fishy string?}", new QByteArray("{}"), new QByteArray("s"));
         System.out.println(ba);
         // prints "{a fi%73hy %73tring%3F}"
</pre>
*/

    public static com.trolltech.qt.core.QByteArray toPercentEncoding(java.lang.String arg__1, com.trolltech.qt.core.QByteArray exclude, com.trolltech.qt.core.QByteArray include)    {
        return __qt_toPercentEncoding_String_QByteArray_QByteArray(arg__1, exclude == null ? 0 : exclude.nativeId(), include == null ? 0 : include.nativeId());
    }
    native static com.trolltech.qt.core.QByteArray __qt_toPercentEncoding_String_QByteArray_QByteArray(java.lang.String arg__1, long exclude, long include);

/**
@exclude
*/

    public static native QUrl fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QUrl(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QUrl array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QUrl)
        return operator_equal((com.trolltech.qt.core.QUrl) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QUrl) {
            if (operator_less((com.trolltech.qt.core.QUrl) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QUrl clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QUrl __qt_clone(long __this_nativeId);
}
