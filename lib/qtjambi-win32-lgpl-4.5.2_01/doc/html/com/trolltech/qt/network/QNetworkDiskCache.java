package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkDiskCache class provides a very basic disk cache. QNetworkDiskCache stores each url in its own file inside of the cacheDirectory using {@link com.trolltech.qt.core.QDataStream QDataStream}. Files with a text MimeType are compressed using qCompress. Each cache file starts with "{@link <a href="../qmake-environment-reference.html">cache_</a>}" and ends in ".cache". Data is written to disk only in {@link com.trolltech.qt.network.QAbstractNetworkCache#insert(com.trolltech.qt.core.QIODevice) insert()} and {@link com.trolltech.qt.network.QAbstractNetworkCache#updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData) updateMetaData()}. <p>Currently you can not share the same cache files with more then one disk cache. <p>QNetworkDiskCache by default limits the amount of space that the cache will use on the system to 50MB. <p>Note you have to set the cache directory before it will work.
*/
@QtJambiGeneratedClass
public class QNetworkDiskCache extends com.trolltech.qt.network.QAbstractNetworkCache
{


/**
Creates a new disk cache. The <tt>parent</tt> argument is passed to {@link com.trolltech.qt.network.QAbstractNetworkCache QAbstractNetworkCache}'s constructor.
*/

    public QNetworkDiskCache() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a new disk cache. The <tt>parent</tt> argument is passed to {@link com.trolltech.qt.network.QAbstractNetworkCache QAbstractNetworkCache}'s constructor.
*/

    public QNetworkDiskCache(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QNetworkDiskCache_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QNetworkDiskCache_QObject(long parent);

/**
Returns the location where cached files will be stored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache#setCacheDirectory(java.lang.String) setCacheDirectory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String cacheDirectory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cacheDirectory(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_cacheDirectory(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.network.QNetworkCacheMetaData QNetworkCacheMetaData} for the cache file <tt>fileName</tt>. <p>If <tt>fileName</tt> is not a cache file {@link com.trolltech.qt.network.QNetworkCacheMetaData QNetworkCacheMetaData} will be invalid.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkCacheMetaData fileMetaData(java.lang.String fileName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileMetaData_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkCacheMetaData __qt_fileMetaData_String(long __this__nativeId, java.lang.String fileName);

/**
Returns the current maximum size for the disk cache. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache#setMaximumCacheSize(long) setMaximumCacheSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long maximumCacheSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumCacheSize(nativeId());
    }
    @QtBlockedSlot
    native long __qt_maximumCacheSize(long __this__nativeId);

/**
Sets the directory where cached files will be stored to <tt>cacheDir</tt> <p>QNetworkDiskCache will create this directory if it does not exists. <p>Prepared cache items will be stored in the new cache directory when they are inserted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache#cacheDirectory() cacheDirectory()}, and {@link com.trolltech.qt.gui.QDesktopServices.StandardLocation QDesktopServices::CacheLocation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCacheDirectory(java.lang.String cacheDir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCacheDirectory_String(nativeId(), cacheDir);
    }
    @QtBlockedSlot
    native void __qt_setCacheDirectory_String(long __this__nativeId, java.lang.String cacheDir);

/**
Sets the maximum size of the disk cache to be <tt>size</tt>. <p>If the new size is smaller then the current cache size then the cache will call {@link com.trolltech.qt.network.QNetworkDiskCache#expire() expire()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache#maximumCacheSize() maximumCacheSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumCacheSize(long size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumCacheSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setMaximumCacheSize_long(long __this__nativeId, long size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long cacheSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cacheSize(nativeId());
    }
    @QtBlockedSlot
    native long __qt_cacheSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QIODevice data(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_data_QUrl(long __this__nativeId, long url);

/**
Cleans the cache so that its size is under the maximum cache size. Returns the current size of the cache. <p>When the current size of the cache is greater then the {@link com.trolltech.qt.network.QNetworkDiskCache#maximumCacheSize() maximumCacheSize()} older cache files are removed until the total size is less then 90% of {@link com.trolltech.qt.network.QNetworkDiskCache#maximumCacheSize() maximumCacheSize()} starting with the oldest ones first using the file creation date to determine how old a cache file is. <p>Subclasses can reimplement this function to change the order that cache files are removed taking into account information in the application knows about that QNetworkDiskCache does not, for example the number of times a cache is accessed. <p>Note: {@link com.trolltech.qt.network.QAbstractNetworkCache#cacheSize() cacheSize()} calls expire if the current cache size is unknown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache#maximumCacheSize() maximumCacheSize()}, and {@link com.trolltech.qt.network.QNetworkDiskCache#fileMetaData(java.lang.String) fileMetaData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected long expire()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expire(nativeId());
    }
    @QtBlockedSlot
    native long __qt_expire(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public void insert(com.trolltech.qt.core.QIODevice device)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insert_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insert_QIODevice(long __this__nativeId, long device);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.network.QNetworkCacheMetaData metaData(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaData_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkCacheMetaData __qt_metaData_QUrl(long __this__nativeId, long url);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QIODevice prepare(com.trolltech.qt.network.QNetworkCacheMetaData metaData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prepare_QNetworkCacheMetaData(nativeId(), metaData == null ? 0 : metaData.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_prepare_QNetworkCacheMetaData(long __this__nativeId, long metaData);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean remove(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_remove_QUrl(long __this__nativeId, long url);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData metaData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateMetaData_QNetworkCacheMetaData(nativeId(), metaData == null ? 0 : metaData.nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateMetaData_QNetworkCacheMetaData(long __this__nativeId, long metaData);

/**
@exclude
*/

    public static native QNetworkDiskCache fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkDiskCache(QPrivateConstructor p) { super(p); } 
}
