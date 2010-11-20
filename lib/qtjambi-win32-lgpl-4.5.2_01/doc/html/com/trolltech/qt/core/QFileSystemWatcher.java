package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFileSystemWatcher class provides an interface for monitoring files and directories for modifications. QFileSystemWatcher monitors the file system for changes to files and directories by watching a list of specified paths. <p>Call {@link com.trolltech.qt.core.QFileSystemWatcher#addPath(java.lang.String) addPath()} to watch a particular file or directory. Multiple paths can be added using the {@link com.trolltech.qt.core.QFileSystemWatcher#addPaths(java.util.List) addPaths()} function. Existing paths can be removed by using the {@link com.trolltech.qt.core.QFileSystemWatcher#removePath(java.lang.String) removePath()} and {@link com.trolltech.qt.core.QFileSystemWatcher#removePaths(java.util.List) removePaths()} functions. <p>QFileSystemWatcher examines each path added to it. Files that have been added to the QFileSystemWatcher can be accessed using the {@link com.trolltech.qt.core.QFileSystemWatcher#files() files()} function, and directories using the {@link com.trolltech.qt.core.QFileSystemWatcher#directories() directories()} function. <p>The {@link com.trolltech.qt.core.QFileSystemWatcher#fileChanged fileChanged() } signal is emitted when a file has been modified, renamed or removed from disk. Similarly, the {@link com.trolltech.qt.core.QFileSystemWatcher#directoryChanged directoryChanged() } signal is emitted when a directory or its contents is modified or removed. Note that QFileSystemWatcher stops monitoring files once they have been renamed or removed from disk, and directories once they have been removed from disk. <p><b>Note:</b> On systems running a Linux kernel without inotify support, file systems that contain watched paths cannot be unmounted. <p><b>Note:</b> Windows CE does not support directory monitoring by default as this depends on the file system driver installed. <p><b>Note:</b> The act of monitoring files and directories for modifications consumes system resources. This implies there is a limit to the number of files and directories your process can monitor simultaneously. On Mac OS and all BSD variants, for example, an open file descriptor is required for each monitored file. The system limits the number of open file descriptors to 256 by default. This means that {@link com.trolltech.qt.core.QFileSystemWatcher#addPath(java.lang.String) addPath()} and {@link com.trolltech.qt.core.QFileSystemWatcher#addPaths(java.util.List) addPaths()} will fail if your process tries to add more than 256 files or directories to the file system monitor. Also note that your process may have other file descriptors open in addition to the ones for files being monitored, and these other open descriptors also count in the total. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile QFile}, and {@link com.trolltech.qt.core.QDir QDir}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFileSystemWatcher extends com.trolltech.qt.core.QObject
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: path)&gt;:<p> This signal is emitted when the directory at a specified <tt>path</tt>, is modified (e. ., when a file is added, modified or deleted) or removed from disk. Note that if there are several changes during a short period of time, some of the changes might not emit this signal. However, the last change in the sequence of changes will always generate this signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#fileChanged fileChanged() }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> directoryChanged = new Signal1<java.lang.String>();

    private final void directoryChanged(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_directoryChanged_String(nativeId(), path);
    }
    native void __qt_directoryChanged_String(long __this__nativeId, java.lang.String path);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: path)&gt;:<p> This signal is emitted when the file at the specified <tt>path</tt> is modified, renamed or removed from disk. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#directoryChanged directoryChanged() }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> fileChanged = new Signal1<java.lang.String>();

    private final void fileChanged(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fileChanged_String(nativeId(), path);
    }
    native void __qt_fileChanged_String(long __this__nativeId, java.lang.String path);


/**
Constructs a new file system watcher object with the given <tt>parent</tt>.
*/

    public QFileSystemWatcher() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new file system watcher object with the given <tt>parent</tt>.
*/

    public QFileSystemWatcher(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFileSystemWatcher_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFileSystemWatcher_QObject(long parent);


/**
Constructs a new file system watcher object with the given <tt>parent</tt> which monitors the specified <tt>paths</tt> list.
*/

    public QFileSystemWatcher(java.util.List<java.lang.String> paths) {
        this(paths, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new file system watcher object with the given <tt>parent</tt> which monitors the specified <tt>paths</tt> list.
*/

    public QFileSystemWatcher(java.util.List<java.lang.String> paths, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFileSystemWatcher_List_QObject(paths, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFileSystemWatcher_List_QObject(java.util.List<java.lang.String> paths, long parent);

/**
Adds <tt>path</tt> to the file system watcher if <tt>path</tt> exists. The path is not added if it does not exist, or if it is already being monitored by the file system watcher. <p>If <tt>path</tt> specifies a directory, the {@link com.trolltech.qt.core.QFileSystemWatcher#directoryChanged directoryChanged() } signal will be emitted when <tt>path</tt> is modified or removed from disk; otherwise the {@link com.trolltech.qt.core.QFileSystemWatcher#fileChanged fileChanged() } signal is emitted when <tt>path</tt> is modified, renamed or removed. <p><b>Note:</b> There is a system dependent limit to the number of files and directories that can be monitored simultaneously. If this limit has been reached, <tt>path</tt> will not be added to the file system watcher, and a warning message will be printed to stderr. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#addPaths(java.util.List) addPaths()}, and {@link com.trolltech.qt.core.QFileSystemWatcher#removePath(java.lang.String) removePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPath(java.lang.String file)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPath_String(nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_addPath_String(long __this__nativeId, java.lang.String file);

/**
Adds each path in <tt>paths</tt> to the file system watcher. Paths are not added if they not exist, or if they are already being monitored by the file system watcher. <p>If a path specifies a directory, the {@link com.trolltech.qt.core.QFileSystemWatcher#directoryChanged directoryChanged() } signal will be emitted when the path is modified or removed from disk; otherwise the {@link com.trolltech.qt.core.QFileSystemWatcher#fileChanged fileChanged() } signal is emitted when the path is modified, renamed, or removed. <p><b>Note:</b> There is a system dependent limit to the number of files and directories that can be monitored simultaneously. If this limit has been reached, the excess <tt>paths</tt> will not be added to the file system watcher, and a warning message will be printed to stderr for each path that could not be added. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#addPath(java.lang.String) addPath()}, and {@link com.trolltech.qt.core.QFileSystemWatcher#removePaths(java.util.List) removePaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPaths(java.util.List<java.lang.String> files)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPaths_List(nativeId(), files);
    }
    @QtBlockedSlot
    native void __qt_addPaths_List(long __this__nativeId, java.util.List<java.lang.String> files);

/**
Returns a list of paths to directories that are being watched. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#files() files()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> directories()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_directories(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_directories(long __this__nativeId);

/**
Returns a list of paths to files that are being watched. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#directories() directories()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> files()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_files(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_files(long __this__nativeId);

/**
Removes the specified <tt>path</tt> from the file system watcher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#removePaths(java.util.List) removePaths()}, and {@link com.trolltech.qt.core.QFileSystemWatcher#addPath(java.lang.String) addPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removePath(java.lang.String file)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removePath_String(nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_removePath_String(long __this__nativeId, java.lang.String file);

/**
Removes the specified <tt>paths</tt> from the file system watcher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileSystemWatcher#removePath(java.lang.String) removePath()}, and {@link com.trolltech.qt.core.QFileSystemWatcher#addPaths(java.util.List) addPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removePaths(java.util.List<java.lang.String> files)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removePaths_List(nativeId(), files);
    }
    @QtBlockedSlot
    native void __qt_removePaths_List(long __this__nativeId, java.util.List<java.lang.String> files);

/**
@exclude
*/

    public static native QFileSystemWatcher fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFileSystemWatcher(QPrivateConstructor p) { super(p); } 
}
