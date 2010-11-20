package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPixmapCache class provides an application-wide cache for pixmaps. This class is a tool for optimized drawing with {@link com.trolltech.qt.gui.QPixmap QPixmap}. You can use it to store temporary pixmaps that are expensive to generate without using more storage space than {@link com.trolltech.qt.gui.QPixmapCache#cacheLimit() cacheLimit()}. Use {@link com.trolltech.qt.gui.QPixmapCache#insert(java.lang.String, com.trolltech.qt.gui.QPixmap) insert()} to insert pixmaps, {@link com.trolltech.qt.gui.QPixmapCache#find(java.lang.String, com.trolltech.qt.gui.QPixmap) find()} to find them, and {@link com.trolltech.qt.gui.QPixmapCache#clear() clear()} to empty the cache. <p>QPixmapCache contains no member data, only static functions to access the global pixmap cache. It creates an internal QCache object for caching the pixmaps. <p>The cache associates a pixmap with a string (key). If two pixmaps are inserted into the cache using equal keys, then the last pixmap will hide the first pixmap. The QHash and QCache classes do exactly the same. <p>The cache becomes full when the total size of all pixmaps in the cache exceeds {@link com.trolltech.qt.gui.QPixmapCache#cacheLimit() cacheLimit()}. The initial cache limit is 1024 KB (1 MB); it is changed with {@link com.trolltech.qt.gui.QPixmapCache#setCacheLimit(int) setCacheLimit()}. A pixmap takes roughly (width * height * depth)/8 bytes of memory. <p>The Qt Quarterly article Optimizing with QPixmapCache explains how to use QPixmapCache to speed up applications by caching the results of painting. <p><DT><b>See also:</b><br><DD>QCache, and {@link com.trolltech.qt.gui.QPixmap QPixmap}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPixmapCache extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QPixmapCache(){
        super((QPrivateConstructor)null);
        __qt_QPixmapCache();
    }

    native void __qt_QPixmapCache();

/**
Returns the cache limit (in kilobytes). <p>The default cache limit is 2048 KB for Embedded, 10240 KB for Desktops. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapCache#setCacheLimit(int) setCacheLimit()}. <br></DD></DT>
*/

    public native static int cacheLimit();

/**
Removes all pixmaps from the cache.
*/

    public native static void clear();

    private native static boolean find(java.lang.String key, com.trolltech.qt.QNativePointer arg__2);

/**
Inserts a copy of the pixmap <tt>pm</tt> associated with the <tt>key</tt> into the cache. <p>All pixmaps inserted by the Qt library have a key starting with "$qt", so your own pixmap keys should never begin "$qt". <p>When a pixmap is inserted and the cache is about to exceed its limit, it removes pixmaps until there is enough room for the pixmap to be inserted. <p>The oldest pixmaps (least recently accessed in the cache) are deleted when more space is needed. <p>The function returns true if the object was inserted into the cache; otherwise it returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapCache#setCacheLimit(int) setCacheLimit()}. <br></DD></DT>
*/

    public static boolean insert(java.lang.String key, com.trolltech.qt.gui.QPixmap arg__2)    {
        return __qt_insert_String_QPixmap(key, arg__2 == null ? 0 : arg__2.nativeId());
    }
    native static boolean __qt_insert_String_QPixmap(java.lang.String key, long arg__2);

/**
Removes the pixmap associated with <tt>key</tt> from the cache.
*/

    public native static void remove(java.lang.String key);

/**
Sets the cache limit to <tt>n</tt> kilobytes. <p>The default setting is 1024 kilobytes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapCache#cacheLimit() cacheLimit()}. <br></DD></DT>
*/

    public native static void setCacheLimit(int arg__1);

/**
@exclude
*/

    public static native QPixmapCache fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmapCache(QPrivateConstructor p) { super(p); } 

/**
Looks for a cached pixmap associated with the <tt>key</tt> in the cache.
If the pixmap is found, the function sets <tt>pm</tt> to that pixmap and
returns true; otherwise it leaves <tt>pm</tt> alone and returns false.
*/

    public static boolean find(String key, QPixmap pm) {
        return find(key, pm.nativePointer());
    }

}
