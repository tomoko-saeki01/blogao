package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QAbstractNetworkCache class provides the interface for cache implementations. QAbstractNetworkCache is the base class for every standard cache that is used be {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}. QAbstractNetworkCache is an abstract class and cannot be instantiated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkDiskCache QNetworkDiskCache}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractNetworkCache extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.network.QAbstractNetworkCache {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public long cacheSize() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_cacheSize(nativeId());
        }

        @Override
        public void clear() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_clear(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QIODevice data(com.trolltech.qt.core.QUrl url) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_data_QUrl(nativeId(), url == null ? 0 : url.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void insert(com.trolltech.qt.core.QIODevice device) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_insert_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.network.QNetworkCacheMetaData metaData(com.trolltech.qt.core.QUrl url) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_metaData_QUrl(nativeId(), url == null ? 0 : url.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QIODevice prepare(com.trolltech.qt.network.QNetworkCacheMetaData metaData) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_prepare_QNetworkCacheMetaData(nativeId(), metaData == null ? 0 : metaData.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean remove(com.trolltech.qt.core.QUrl url) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_remove_QUrl(nativeId(), url == null ? 0 : url.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData metaData) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_updateMetaData_QNetworkCacheMetaData(nativeId(), metaData == null ? 0 : metaData.nativeId());
        }
    }



/**
Constructs an abstract network cache with the given <tt>parent</tt>.
*/

    protected QAbstractNetworkCache() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an abstract network cache with the given <tt>parent</tt>.
*/

    protected QAbstractNetworkCache(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractNetworkCache_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractNetworkCache_QObject(long parent);

/**
Returns the current size taken up by the cache. Depending upon the cache implementation this might be disk or memory size. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract long cacheSize();
    @QtBlockedSlot
    native long __qt_cacheSize(long __this__nativeId);

/**
Removes all items from the cache. Unless there was failures clearing the cache {@link com.trolltech.qt.network.QAbstractNetworkCache#cacheSize() cacheSize()} should return 0 after a call to clear. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#cacheSize() cacheSize()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#remove(com.trolltech.qt.core.QUrl) remove()}. <br></DD></DT>
*/

    public abstract void clear();
    native void __qt_clear(long __this__nativeId);

/**
Returns the data associated with <tt>url</tt>. <p>It is up to the application that requests the data to delete the {@link com.trolltech.qt.core.QIODevice QIODevice} when done with it. <p>If there is no cache for <tt>url</tt>, the url is invalid, or if there is an internal cache error 0 is returned. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#metaData(com.trolltech.qt.core.QUrl) metaData()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#prepare(com.trolltech.qt.network.QNetworkCacheMetaData) prepare()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QIODevice data(com.trolltech.qt.core.QUrl url);
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_data_QUrl(long __this__nativeId, long url);

/**
Inserts the data in <tt>device</tt> and the prepared meta data into the cache. After this function is called the data and meta data should be retrievable using {@link com.trolltech.qt.network.QAbstractNetworkCache#data(com.trolltech.qt.core.QUrl) data()} and {@link com.trolltech.qt.network.QAbstractNetworkCache#metaData(com.trolltech.qt.core.QUrl) metaData()}. <p>To cancel a prepared inserted call {@link com.trolltech.qt.network.QAbstractNetworkCache#remove(com.trolltech.qt.core.QUrl) remove()} on the metadata's url. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#prepare(com.trolltech.qt.network.QNetworkCacheMetaData) prepare()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#remove(com.trolltech.qt.core.QUrl) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void insert(com.trolltech.qt.core.QIODevice device);
    @QtBlockedSlot
    native void __qt_insert_QIODevice(long __this__nativeId, long device);

/**
Returns the meta data for the url <tt>url</tt>. <p>If the url is valid and the cache contains the data for url, a valid {@link com.trolltech.qt.network.QNetworkCacheMetaData QNetworkCacheMetaData} is returned. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData) updateMetaData()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#data(com.trolltech.qt.core.QUrl) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.network.QNetworkCacheMetaData metaData(com.trolltech.qt.core.QUrl url);
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkCacheMetaData __qt_metaData_QUrl(long __this__nativeId, long url);

/**
Returns the device that should be populated with the data for the cache item <tt>metaData</tt>. When all of the data has been written {@link com.trolltech.qt.network.QAbstractNetworkCache#insert(com.trolltech.qt.core.QIODevice) insert()} should be called. If metaData is invalid or the url in the metadata is invalid 0 is returned. <p>The cache owns the device and will take care of deleting it when it is inserted or removed. <p>To cancel a prepared inserted call {@link com.trolltech.qt.network.QAbstractNetworkCache#remove(com.trolltech.qt.core.QUrl) remove()} on the metadata's url. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#remove(com.trolltech.qt.core.QUrl) remove()}, {@link com.trolltech.qt.network.QAbstractNetworkCache#updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData) updateMetaData()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#insert(com.trolltech.qt.core.QIODevice) insert()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QIODevice prepare(com.trolltech.qt.network.QNetworkCacheMetaData metaData);
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_prepare_QNetworkCacheMetaData(long __this__nativeId, long metaData);

/**
Removes the cache entry for <tt>url</tt>, returning true if success otherwise false. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#clear() clear()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#prepare(com.trolltech.qt.network.QNetworkCacheMetaData) prepare()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean remove(com.trolltech.qt.core.QUrl url);
    @QtBlockedSlot
    native boolean __qt_remove_QUrl(long __this__nativeId, long url);

/**
Updates the cache meta date for the metaData's url to <tt>metaData</tt> <p>If the cache does not contains a cache item for the url then no action is taken. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractNetworkCache#metaData(com.trolltech.qt.core.QUrl) metaData()}, and {@link com.trolltech.qt.network.QAbstractNetworkCache#prepare(com.trolltech.qt.network.QNetworkCacheMetaData) prepare()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void updateMetaData(com.trolltech.qt.network.QNetworkCacheMetaData metaData);
    @QtBlockedSlot
    native void __qt_updateMetaData_QNetworkCacheMetaData(long __this__nativeId, long metaData);

/**
@exclude
*/

    public static native QAbstractNetworkCache fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractNetworkCache(QPrivateConstructor p) { super(p); } 
}
