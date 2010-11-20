package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHttpRequestHeader class contains request header information for HTTP. This class is used in the {@link com.trolltech.qt.network.QHttp QHttp} class to report the header information if the client requests something from the server. <p>HTTP requests have a method which describes the request's action. The most common requests are "GET" and "POST". In addition to the request method the header also includes a request-URI to specify the location for the method to use. <p>The method, request-URI and protocol-version can be set using a constructor or later using {@link com.trolltech.qt.network.QHttpRequestHeader#setRequest(java.lang.String, java.lang.String, int) setRequest()}. The values can be obtained using {@link com.trolltech.qt.network.QHttpRequestHeader#method() method()}, {@link com.trolltech.qt.network.QHttpRequestHeader#path() path()}, majorVersion() and minorVersion(). <p>Note that the request-URI must be in the format expected by the HTTP server. That is, all reserved characters must be encoded in %HH (where HH are two hexadecimal digits). See {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()} for more information. <p>Important inherited functions: {@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()} and {@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader QHttpResponseHeader}, and {@link com.trolltech.qt.network.QHttp QHttp}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHttpRequestHeader extends com.trolltech.qt.network.QHttpHeader
    implements java.lang.Cloneable
{

/**
Constructs an empty HTTP request header.
*/

    public QHttpRequestHeader(){
        super((QPrivateConstructor)null);
        __qt_QHttpRequestHeader();
    }

    native void __qt_QHttpRequestHeader();

/**
Constructs a copy of <tt>header</tt>.
*/

    public QHttpRequestHeader(com.trolltech.qt.network.QHttpRequestHeader header){
        super((QPrivateConstructor)null);
        __qt_QHttpRequestHeader_QHttpRequestHeader(header == null ? 0 : header.nativeId());
    }

    native void __qt_QHttpRequestHeader_QHttpRequestHeader(long header);


/**
Constructs a HTTP request header for the method <tt>method</tt>, the request-URI <tt>path</tt> and the protocol-version <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request.
*/

    public QHttpRequestHeader(java.lang.String method, java.lang.String path, int majorVer) {
        this(method, path, majorVer, (int)1);
    }

/**
Constructs a HTTP request header for the method <tt>method</tt>, the request-URI <tt>path</tt> and the protocol-version <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request.
*/

    public QHttpRequestHeader(java.lang.String method, java.lang.String path) {
        this(method, path, (int)1, (int)1);
    }
/**
Constructs a HTTP request header for the method <tt>method</tt>, the request-URI <tt>path</tt> and the protocol-version <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request.
*/

    public QHttpRequestHeader(java.lang.String method, java.lang.String path, int majorVer, int minorVer){
        super((QPrivateConstructor)null);
        __qt_QHttpRequestHeader_String_String_int_int(method, path, majorVer, minorVer);
    }

    native void __qt_QHttpRequestHeader_String_String_int_int(java.lang.String method, java.lang.String path, int majorVer, int minorVer);

/**
Constructs a HTTP request header from the string <tt>str</tt>. The <tt>str</tt> should consist of one or more "\r\n" delimited lines; the first line should be the request-line (format: method, space, request-URI, space HTTP-version); each of the remaining lines should have the format key, colon, space, value.
*/

    public QHttpRequestHeader(java.lang.String str){
        super((QPrivateConstructor)null);
        __qt_QHttpRequestHeader_String(str);
    }

    native void __qt_QHttpRequestHeader_String(java.lang.String str);

/**
Returns the method of the HTTP request header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader#path() path()}, majorVersion(), minorVersion(), and {@link com.trolltech.qt.network.QHttpRequestHeader#setRequest(java.lang.String, java.lang.String, int) setRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String method()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_method(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_method(long __this__nativeId);

/**
Returns the request-URI of the HTTP request header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader#method() method()}, majorVersion(), minorVersion(), and {@link com.trolltech.qt.network.QHttpRequestHeader#setRequest(java.lang.String, java.lang.String, int) setRequest()}. <br></DD></DT>
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
This function sets the request method to <tt>method</tt>, the request-URI to <tt>path</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader#method() method()}, {@link com.trolltech.qt.network.QHttpRequestHeader#path() path()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRequest(java.lang.String method, java.lang.String path, int majorVer) {
        setRequest(method, path, majorVer, (int)1);
    }

/**
This function sets the request method to <tt>method</tt>, the request-URI to <tt>path</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader#method() method()}, {@link com.trolltech.qt.network.QHttpRequestHeader#path() path()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRequest(java.lang.String method, java.lang.String path) {
        setRequest(method, path, (int)1, (int)1);
    }
/**
This function sets the request method to <tt>method</tt>, the request-URI to <tt>path</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. The <tt>path</tt> argument must be properly encoded for an HTTP request. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader#method() method()}, {@link com.trolltech.qt.network.QHttpRequestHeader#path() path()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRequest(java.lang.String method, java.lang.String path, int majorVer, int minorVer)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRequest_String_String_int_int(nativeId(), method, path, majorVer, minorVer);
    }
    @QtBlockedSlot
    native void __qt_setRequest_String_String_int_int(long __this__nativeId, java.lang.String method, java.lang.String path, int majorVer, int minorVer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int majorVersion()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_majorVersion(nativeId());
    }
    @QtBlockedSlot
    native int __qt_majorVersion(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int minorVersion()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minorVersion(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minorVersion(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean parseLine(java.lang.String line, int number)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parseLine_String_int(nativeId(), line, number);
    }
    @QtBlockedSlot
    native boolean __qt_parseLine_String_int(long __this__nativeId, java.lang.String line, int number);

/**
<brief>Returns a string representation of the <tt>this QHttpRequestHeader</tt>. </brief>
*/

    @QtBlockedSlot
    public java.lang.String toString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString(long __this__nativeId);

/**
@exclude
*/

    public static native QHttpRequestHeader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHttpRequestHeader(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QHttpRequestHeader array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QHttpRequestHeader clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QHttpRequestHeader __qt_clone(long __this_nativeId);
}
