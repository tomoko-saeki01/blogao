package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHttpHeader class contains header information for HTTP. In most cases you should use the more specialized derivatives of this class, {@link com.trolltech.qt.network.QHttpResponseHeader QHttpResponseHeader} and {@link com.trolltech.qt.network.QHttpRequestHeader QHttpRequestHeader}, rather than directly using QHttpHeader. <p>QHttpHeader provides the HTTP header fields. A HTTP header field consists of a name followed by a colon, a single space, and the field value. (See RFC 1945.) Field names are case-insensitive. A typical header field looks like this: <pre class="snippet">
    content-type: text/html
</pre> In the API the header field name is called the "key" and the content is called the "value". You can get and set a header field's value by using its key with {@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()} and {@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()}, e.g. <pre class="snippet">
    header.setValue("content-type", "text/html");
    StringscontentType = header.value("content-type");
</pre> Some fields are so common that getters and setters are provided for them as a convenient alternative to using {@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()} and {@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()}, e.g. {@link com.trolltech.qt.network.QHttpHeader#contentLength() contentLength()} and {@link com.trolltech.qt.network.QHttpHeader#contentType() contentType()}, {@link com.trolltech.qt.network.QHttpHeader#setContentLength(int) setContentLength()} and {@link com.trolltech.qt.network.QHttpHeader#setContentType(java.lang.String) setContentType()}. <p>Each header key has a single value associated with it. If you set the value for a key which already exists the previous value will be discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpRequestHeader QHttpRequestHeader}, and {@link com.trolltech.qt.network.QHttpResponseHeader QHttpResponseHeader}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QHttpHeader extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.network.QHttpHeader {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int majorVersion() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_majorVersion(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int minorVersion() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_minorVersion(nativeId());
        }
    }


/**
Constructs an empty HTTP header.
*/

    public QHttpHeader(){
        super((QPrivateConstructor)null);
        __qt_QHttpHeader();
    }

    native void __qt_QHttpHeader();

/**
Constructs a copy of <tt>header</tt>.
*/

    public QHttpHeader(com.trolltech.qt.network.QHttpHeader header){
        super((QPrivateConstructor)null);
        __qt_QHttpHeader_QHttpHeader(header == null ? 0 : header.nativeId());
    }

    native void __qt_QHttpHeader_QHttpHeader(long header);

/**
Constructs a HTTP header for <tt>str</tt>. <p>This constructor parses the string <tt>str</tt> for header fields and adds this information. The <tt>str</tt> should consist of one or more "\r\n" delimited lines; each of these lines should have the format key, colon, space, value.
*/

    public QHttpHeader(java.lang.String str){
        super((QPrivateConstructor)null);
        __qt_QHttpHeader_String(str);
    }

    native void __qt_QHttpHeader_String(java.lang.String str);

/**
Adds a new entry with the <tt>key</tt> and <tt>value</tt>.
*/

    @QtBlockedSlot
    public final void addValue(java.lang.String key, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addValue_String_String(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_addValue_String_String(long __this__nativeId, java.lang.String key, java.lang.String value);

/**
Returns all the entries with the given <tt>key</tt>. If no entry has this <tt>key</tt>, an empty string list is returned.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> allValues(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allValues_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_allValues_String(long __this__nativeId, java.lang.String key);

/**
Returns the value of the special HTTP header field <tt>content-length</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#setContentLength(int) setContentLength()}, and {@link com.trolltech.qt.network.QHttpHeader#hasContentLength() hasContentLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int contentLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_contentLength(long __this__nativeId);

/**
Returns the value of the special HTTP header field <tt>content-type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#setContentType(java.lang.String) setContentType()}, and {@link com.trolltech.qt.network.QHttpHeader#hasContentType() hasContentType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String contentType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentType(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_contentType(long __this__nativeId);

/**
Returns true if the header has an entry for the special HTTP header field <tt>content-length</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#contentLength() contentLength()}, and {@link com.trolltech.qt.network.QHttpHeader#setContentLength(int) setContentLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasContentLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasContentLength(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasContentLength(long __this__nativeId);

/**
Returns true if the header has an entry for the the special HTTP header field <tt>content-type</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#contentType() contentType()}, and {@link com.trolltech.qt.network.QHttpHeader#setContentType(java.lang.String) setContentType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasContentType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasContentType(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasContentType(long __this__nativeId);

/**
Returns true if the HTTP header has an entry with the given <tt>key</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()}, {@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()}, and {@link com.trolltech.qt.network.QHttpHeader#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasKey(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasKey_String(nativeId(), key);
    }
    @QtBlockedSlot
    native boolean __qt_hasKey_String(long __this__nativeId, java.lang.String key);

/**
Returns true if the HTTP header is valid; otherwise returns false. <p>A QHttpHeader is invalid if it was created by parsing a malformed string.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns a list of the keys in the HTTP header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#hasKey(java.lang.String) hasKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> keys()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keys(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean parse(java.lang.String str)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parse_String(nativeId(), str);
    }
    @QtBlockedSlot
    native boolean __qt_parse_String(long __this__nativeId, java.lang.String str);

/**
Removes all the entries with the key <tt>key</tt> from the HTTP header.
*/

    @QtBlockedSlot
    public final void removeAllValues(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAllValues_String(nativeId(), key);
    }
    @QtBlockedSlot
    native void __qt_removeAllValues_String(long __this__nativeId, java.lang.String key);

/**
Removes the entry with the key <tt>key</tt> from the HTTP header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()}, and {@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeValue(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeValue_String(nativeId(), key);
    }
    @QtBlockedSlot
    native void __qt_removeValue_String(long __this__nativeId, java.lang.String key);

/**
Sets the value of the special HTTP header field <tt>content-length</tt> to <tt>len</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#contentLength() contentLength()}, and {@link com.trolltech.qt.network.QHttpHeader#hasContentLength() hasContentLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContentLength(int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentLength_int(nativeId(), len);
    }
    @QtBlockedSlot
    native void __qt_setContentLength_int(long __this__nativeId, int len);

/**
Sets the value of the special HTTP header field <tt>content-type</tt> to <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#contentType() contentType()}, and {@link com.trolltech.qt.network.QHttpHeader#hasContentType() hasContentType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContentType(java.lang.String type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentType_String(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setContentType_String(long __this__nativeId, java.lang.String type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setValid(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValid_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setValid_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the value of the entry with the <tt>key</tt> to <tt>value</tt>. <p>If no entry with <tt>key</tt> exists, a new entry with the given <tt>key</tt> and <tt>value</tt> is created. If an entry with the <tt>key</tt> already exists, the first value is discarded and replaced with the given <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#value(java.lang.String) value()}, {@link com.trolltech.qt.network.QHttpHeader#hasKey(java.lang.String) hasKey()}, and {@link com.trolltech.qt.network.QHttpHeader#removeValue(java.lang.String) removeValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(java.lang.String key, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String_String(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_setValue_String_String(long __this__nativeId, java.lang.String key, java.lang.String value);

/**
Sets the header entries to be the list of key value pairs in <tt>values</tt>.
*/

    @QtBlockedSlot
    public final void setValues(java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> values)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValues_List(nativeId(), values);
    }
    @QtBlockedSlot
    native void __qt_setValues_List(long __this__nativeId, java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> values);

/**
Returns the first value for the entry with the given <tt>key</tt>. If no entry has this <tt>key</tt>, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#setValue(java.lang.String, java.lang.String) setValue()}, {@link com.trolltech.qt.network.QHttpHeader#removeValue(java.lang.String) removeValue()}, {@link com.trolltech.qt.network.QHttpHeader#hasKey(java.lang.String) hasKey()}, and {@link com.trolltech.qt.network.QHttpHeader#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String value(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.lang.String __qt_value_String(long __this__nativeId, java.lang.String key);

/**
Returns all the entries in the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttpHeader#setValues(java.util.List) setValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> values()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_values(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.String, java.lang.String>> __qt_values(long __this__nativeId);

/**
Returns the major protocol-version of the HTTP header.
*/

    @QtBlockedSlot
    public abstract int majorVersion();
    @QtBlockedSlot
    native int __qt_majorVersion(long __this__nativeId);

/**
Returns the minor protocol-version of the HTTP header.
*/

    @QtBlockedSlot
    public abstract int minorVersion();
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
<brief>Returns a string representation of the <tt>this QHttpHeader</tt>. </brief>
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

    public static native QHttpHeader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHttpHeader(QPrivateConstructor p) { super(p); } 
}
