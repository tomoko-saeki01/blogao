package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkCacheMetaData class provides cache information. QNetworkCacheMetaData provides information about a cache file including the url, when it was last modified, when the cache file was created, headers for file and if the file should be saved onto a disk. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache QAbstractNetworkCache}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkCacheMetaData extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an invalid network cache meta data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#isValid() isValid()}. <br></DD></DT>
*/

    public QNetworkCacheMetaData(){
        super((QPrivateConstructor)null);
        __qt_QNetworkCacheMetaData();
    }

    native void __qt_QNetworkCacheMetaData();

/**
Constructs a copy of the <tt>other</tt>QNetworkCacheMetaData.
*/

    public QNetworkCacheMetaData(com.trolltech.qt.network.QNetworkCacheMetaData other){
        super((QPrivateConstructor)null);
        __qt_QNetworkCacheMetaData_QNetworkCacheMetaData(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkCacheMetaData_QNetworkCacheMetaData(long other);

    @QtBlockedSlot
    public final java.util.HashMap<com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object> attributes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributes(nativeId());
    }
    @QtBlockedSlot
    native java.util.HashMap<com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object> __qt_attributes(long __this__nativeId);

/**
Returns the date and time when the meta data expires. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#setExpirationDate(com.trolltech.qt.core.QDateTime) setExpirationDate()}. <br></DD></DT>
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
Returns true if this network cache meta data has attributes that have been set otherwise false.
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
Returns the date and time when the meta data was last modified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#setLastModified(com.trolltech.qt.core.QDateTime) setLastModified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime lastModified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastModified(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_lastModified(long __this__nativeId);

/**
<brief>Writes thisQNetworkCacheMetaData
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
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkCacheMetaData other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkCacheMetaData(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkCacheMetaData(long __this__nativeId, long other);

/**
<brief>Reads a QNetworkCacheMetaData
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
Returns a list of all raw headers that are set in this meta data. The list is in the same order that the headers were set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#setRawHeaders(java.util.List) setRawHeaders()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> rawHeaders()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawHeaders(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> __qt_rawHeaders(long __this__nativeId);

/**
Returns is this cache should be allowed to be stored on disk. <p>Some cache implementations can keep these cache items in memory for performance reasons, but for security reasons they should not be written to disk. <p>Specifically with http, documents marked with Pragma: no-cache, or have a Cache-control set to no-store or no-cache or any https document that doesn't have "Cache-control: public" set will set the saveToDisk to false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#setSaveToDisk(boolean) setSaveToDisk()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean saveToDisk()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveToDisk(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_saveToDisk(long __this__nativeId);

    @QtBlockedSlot
    public final void setAttributes(java.util.HashMap<com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object> attributes)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttributes_HashMap(nativeId(), attributes);
    }
    @QtBlockedSlot
    native void __qt_setAttributes_HashMap(long __this__nativeId, java.util.HashMap<com.trolltech.qt.network.QNetworkRequest.Attribute, java.lang.Object> attributes);

/**
Sets the date and time when the meta data expires to <tt>dateTime</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#expirationDate() expirationDate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setExpirationDate(com.trolltech.qt.core.QDateTime dateTime)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpirationDate_QDateTime(nativeId(), dateTime == null ? 0 : dateTime.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setExpirationDate_QDateTime(long __this__nativeId, long dateTime);

/**
Sets the date and time when the meta data was last modified to <tt>dateTime</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#lastModified() lastModified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLastModified(com.trolltech.qt.core.QDateTime dateTime)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastModified_QDateTime(nativeId(), dateTime == null ? 0 : dateTime.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastModified_QDateTime(long __this__nativeId, long dateTime);

/**

*/

    @QtBlockedSlot
    public final void setRawHeaders(java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> headers)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRawHeaders_List(nativeId(), headers);
    }
    @QtBlockedSlot
    native void __qt_setRawHeaders_List(long __this__nativeId, java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray>> headers);

/**
Sets whether this network cache meta data and associated content should be allowed to be stored on disk to <tt>allow</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#saveToDisk() saveToDisk()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSaveToDisk(boolean allow)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSaveToDisk_boolean(nativeId(), allow);
    }
    @QtBlockedSlot
    native void __qt_setSaveToDisk_boolean(long __this__nativeId, boolean allow);

/**
Sets the URL this network cache meta data to to be <tt>url</tt>. <p>The password and fragment are removed from the url. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#url() url()}. <br></DD></DT>
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
Returns the URL this network cache meta data is referring to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCacheMetaData#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. <br></DD></DT>
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

    public static native QNetworkCacheMetaData fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkCacheMetaData(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkCacheMetaData array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkCacheMetaData)
        return operator_equal((com.trolltech.qt.network.QNetworkCacheMetaData) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkCacheMetaData clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkCacheMetaData __qt_clone(long __this_nativeId);
}
