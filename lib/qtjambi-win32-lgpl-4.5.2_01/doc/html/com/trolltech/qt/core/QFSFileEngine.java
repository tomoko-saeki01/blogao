package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFSFileEngine class implements Qt's default file engine. This class is part of the file engine framework in Qt. If you only want to access files or directories, use {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QFileInfo QFileInfo} or {@link com.trolltech.qt.core.QDir QDir} instead. <p>QFSFileEngine is the default file engine for accessing regular files. It is provided for convenience; by subclassing this class, you can alter its behavior slightly, without having to write a complete {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine} subclass. To install your custom file engine, you must also subclass {@link com.trolltech.qt.core.QAbstractFileEngineHandler QAbstractFileEngineHandler} and create an instance of your handler. <p>It can also be useful to create a QFSFileEngine object directly if you need to use the local file system inside {@link com.trolltech.qt.core.QAbstractFileEngine#create(java.lang.String) QAbstractFileEngine::create()}, in order to avoid recursion (as higher-level classes tend to call {@link com.trolltech.qt.core.QAbstractFileEngine#create(java.lang.String) QAbstractFileEngine::create()}).
*/
@QtJambiGeneratedClass
public class QFSFileEngine extends com.trolltech.qt.core.QAbstractFileEngine
{

/**
Constructs a QFSFileEngine.
*/

    public QFSFileEngine(){
        super((QPrivateConstructor)null);
        __qt_QFSFileEngine();
    }

    native void __qt_QFSFileEngine();

/**
Constructs a QFSFileEngine for the file name <tt>file</tt>.
*/

    public QFSFileEngine(java.lang.String file){
        super((QPrivateConstructor)null);
        __qt_QFSFileEngine_String(file);
    }

    native void __qt_QFSFileEngine_String(java.lang.String file);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractFileEngineIterator beginEntryList(com.trolltech.qt.core.QDir.Filters filters, java.util.List<java.lang.String> filterNames)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_beginEntryList_Filters_List(nativeId(), filters.value(), filterNames);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractFileEngineIterator __qt_beginEntryList_Filters_List(long __this__nativeId, int filters, java.util.List<java.lang.String> filterNames);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractFileEngineIterator endEntryList()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endEntryList(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractFileEngineIterator __qt_endEntryList(long __this__nativeId);

/**
Opens the file descriptor <tt>fd</tt> in <tt>openMode</tt> mode. Returns true on success; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean open(com.trolltech.qt.core.QIODevice.OpenMode flags, int fd)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode_int(nativeId(), flags.value(), fd);
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode_int(long __this__nativeId, int flags, int fd);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean caseSensitive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_caseSensitive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_caseSensitive(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean close()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_close(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean copy(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_copy_String(long __this__nativeId, java.lang.String newName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> entryList(com.trolltech.qt.core.QDir.Filters filters, java.util.List<java.lang.String> filterNames)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryList_Filters_List(nativeId(), filters.value(), filterNames);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_entryList_Filters_List(long __this__nativeId, int filters, java.util.List<java.lang.String> filterNames);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QAbstractFileEngine.FileFlags fileFlags(com.trolltech.qt.core.QAbstractFileEngine.FileFlags type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QAbstractFileEngine.FileFlags(__qt_fileFlags_FileFlags(nativeId(), type.value()));
    }
    @QtBlockedSlot
    native int __qt_fileFlags_FileFlags(long __this__nativeId, int type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String fileName(com.trolltech.qt.core.QAbstractFileEngine.FileName file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName_FileName(nativeId(), file.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName_FileName(long __this__nativeId, int file);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QDateTime fileTime(com.trolltech.qt.core.QAbstractFileEngine.FileTime time)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileTime_FileTime(nativeId(), time.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_fileTime_FileTime(long __this__nativeId, int time);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean flush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_flush(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_handle(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isRelativePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRelativePath(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRelativePath(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isSequential()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSequential(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSequential(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean link(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_link_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_link_String(long __this__nativeId, java.lang.String newName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean mkdir(java.lang.String dirName, boolean createParentDirectories)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkdir_String_boolean(nativeId(), dirName, createParentDirectories);
    }
    @QtBlockedSlot
    native boolean __qt_mkdir_String_boolean(long __this__nativeId, java.lang.String dirName, boolean createParentDirectories);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int openMode);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String owner(com.trolltech.qt.core.QAbstractFileEngine.FileOwner arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_owner_FileOwner(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_owner_FileOwner(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int ownerId(com.trolltech.qt.core.QAbstractFileEngine.FileOwner arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownerId_FileOwner(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native int __qt_ownerId_FileOwner(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long read(com.trolltech.qt.QNativePointer data, long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_read_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long readLine(com.trolltech.qt.QNativePointer data, long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLine_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_readLine_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean remove()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_remove(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean rename(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rename_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_rename_String(long __this__nativeId, java.lang.String newName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean rmdir(java.lang.String dirName, boolean recurseParentDirectories)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmdir_String_boolean(nativeId(), dirName, recurseParentDirectories);
    }
    @QtBlockedSlot
    native boolean __qt_rmdir_String_boolean(long __this__nativeId, java.lang.String dirName, boolean recurseParentDirectories);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean seek(long arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setFileName(java.lang.String file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String file);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setPermissions(int perms)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setPermissions_int(nativeId(), perms);
    }
    @QtBlockedSlot
    native boolean __qt_setPermissions_int(long __this__nativeId, int perms);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setSize(long size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native boolean __qt_setSize_long(long __this__nativeId, long size);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean supportsExtension(com.trolltech.qt.core.QAbstractFileEngine.Extension extension)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long write(com.trolltech.qt.QNativePointer data, long len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_nativepointer_long(nativeId(), data, len);
    }
    @QtBlockedSlot
    native long __qt_write_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long len);


/**
Returns the canonicalized form of the current path used by the file engine for the drive specified by <tt>fileName</tt>. <p>On Windows, each drive has its own current directory, so a different path is returned for file names that include different drive names (e.g. A: or C:). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFSFileEngine#setCurrentPath(java.lang.String) setCurrentPath()}. <br></DD></DT>
*/

    public static java.lang.String currentPath() {
        return currentPath((java.lang.String)null);
    }
/**
Returns the canonicalized form of the current path used by the file engine for the drive specified by <tt>fileName</tt>. <p>On Windows, each drive has its own current directory, so a different path is returned for file names that include different drive names (e.g. A: or C:). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFSFileEngine#setCurrentPath(java.lang.String) setCurrentPath()}. <br></DD></DT>
*/

    public native static java.lang.String currentPath(java.lang.String path);

/**
Returns the list of drives in the file system as a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects. On unix, Mac OS X and Windows CE, only the root path is returned. On Windows, this function returns all drives (A:, C:, D:, etc.).
*/

    public native static java.util.List<com.trolltech.qt.core.QFileInfo> drives();

/**
Returns the home path of the current user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFSFileEngine#rootPath() rootPath()}. <br></DD></DT>
*/

    public native static java.lang.String homePath();

/**
Returns the root path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFSFileEngine#homePath() homePath()}. <br></DD></DT>
*/

    public native static java.lang.String rootPath();

/**
Sets the current path (e. ., for {@link com.trolltech.qt.core.QDir QDir}), to <tt>path</tt>. Returns true if the new path exists; otherwise this function does nothing, and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFSFileEngine#currentPath() currentPath()}. <br></DD></DT>
*/

    public native static boolean setCurrentPath(java.lang.String path);

/**
Returns the temporary path (i.e., a path in which it is safe to store temporary files).
*/

    public native static java.lang.String tempPath();

/**
@exclude
*/

    public static native QFSFileEngine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFSFileEngine(QPrivateConstructor p) { super(p); } 
}
