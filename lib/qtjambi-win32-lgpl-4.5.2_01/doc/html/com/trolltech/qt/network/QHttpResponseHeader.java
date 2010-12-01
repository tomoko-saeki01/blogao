package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHttpResponseHeader class contains response header information for HTTP. This class is used by the {@link com.trolltech.qt.network.QHttp QHttp} class to report the header information that the client received from the server. <p>HTTP responses have a status code that indicates the status of the response. This code is a 3-digit integer result code (for details see to RFC 1945). In addition to the status code, you can also specify a human-readable text that describes the reason for the code ("reason phrase"). This class allows you to get the status code and the reason phrase. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader QHttpRequestHeader}, {@link com.trolltech.qt.network.QHttp QHttp}, and {@link <a href="../qtjambi-http.html">HTTP Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHttpResponseHeader extends com.trolltech.qt.network.QHttpHeader
    implements java.lang.Cloneable
{

/**
Constructs an empty HTTP response header.
*/

    public QHttpResponseHeader(){
        super((QPrivateConstructor)null);
        __qt_QHttpResponseHeader();
    }

    native void __qt_QHttpResponseHeader();

/**
Constructs a copy of <tt>header</tt>.
*/

    public QHttpResponseHeader(com.trolltech.qt.network.QHttpResponseHeader header){
        super((QPrivateConstructor)null);
        __qt_QHttpResponseHeader_QHttpResponseHeader(header == null ? 0 : header.nativeId());
    }

    native void __qt_QHttpResponseHeader_QHttpResponseHeader(long header);

/**
Constructs a HTTP response header from the string <tt>str</tt>. The string is parsed and the information is set. The <tt>str</tt> should consist of one or more "\r\n" delimited lines; the first line should be the status-line (format: HTTP-version, space, status-code, space, reason-phrase); each of remaining lines should have the format key, colon, space, value.
*/

    public QHttpResponseHeader(java.lang.String str){
        super((QPrivateConstructor)null);
        __qt_QHttpResponseHeader_String(str);
    }

    native void __qt_QHttpResponseHeader_String(java.lang.String str);


/**
Constructs a QHttpResponseHeader, setting the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    public QHttpResponseHeader(int code, java.lang.String text, int majorVer) {
        this(code, text, majorVer, (int)1);
    }

/**
Constructs a QHttpResponseHeader, setting the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    public QHttpResponseHeader(int code, java.lang.String text) {
        this(code, text, (int)1, (int)1);
    }

/**
Constructs a QHttpResponseHeader, setting the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    public QHttpResponseHeader(int code) {
        this(code, (java.lang.String)null, (int)1, (int)1);
    }
/**
Constructs a QHttpResponseHeader, setting the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    public QHttpResponseHeader(int code, java.lang.String text, int majorVer, int minorVer){
        super((QPrivateConstructor)null);
        __qt_QHttpResponseHeader_int_String_int_int(code, text, majorVer, minorVer);
    }

    native void __qt_QHttpResponseHeader_int_String_int_int(int code, java.lang.String text, int majorVer, int minorVer);

/**
Returns the reason phrase of the HTTP response header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String reasonPhrase()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_reasonPhrase(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_reasonPhrase(long __this__nativeId);


/**
Sets the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusLine(int code, java.lang.String text, int majorVer) {
        setStatusLine(code, text, majorVer, (int)1);
    }

/**
Sets the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusLine(int code, java.lang.String text) {
        setStatusLine(code, text, (int)1, (int)1);
    }

/**
Sets the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusLine(int code) {
        setStatusLine(code, (java.lang.String)null, (int)1, (int)1);
    }
/**
Sets the status code to <tt>code</tt>, the reason phrase to <tt>text</tt> and the protocol-version to <tt>majorVer</tt> and <tt>minorVer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#statusCode() statusCode()}, {@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusLine(int code, java.lang.String text, int majorVer, int minorVer)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusLine_int_String_int_int(nativeId(), code, text, majorVer, minorVer);
    }
    @QtBlockedSlot
    native void __qt_setStatusLine_int_String_int_int(long __this__nativeId, int code, java.lang.String text, int majorVer, int minorVer);

/**
Returns the status code of the HTTP response header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpResponseHeader#reasonPhrase() reasonPhrase()}, majorVersion(), and minorVersion(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int statusCode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusCode(nativeId());
    }
    @QtBlockedSlot
    native int __qt_statusCode(long __this__nativeId);

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
<brief>Returns a string representation of the <tt>this QHttpResponseHeader</tt>. </brief>
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

    public static native QHttpResponseHeader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHttpResponseHeader(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QHttpResponseHeader array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QHttpResponseHeader clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QHttpResponseHeader __qt_clone(long __this_nativeId);
}
