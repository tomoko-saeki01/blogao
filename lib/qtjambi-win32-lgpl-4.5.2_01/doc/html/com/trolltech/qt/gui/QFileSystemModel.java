package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFileSystemModel class provides a data model for the local filesystem. This class provides access to the local filesystem, providing functions for renaming and removing files and directories, and for creating new directories. In the simplest case, it can be used with a suitable display widget as part of a browser or filter. <p>QFileSystemModel will not fetch any files or directories until setRootPath is called. This will prevent any unnecessary querying on the file system until that point such as listing the drives on Windows. <p>Unlike the {@link com.trolltech.qt.gui.QDirModel QDirModel}, QFileSystemModel uses a separate thread to populate itself so it will not cause the main thread to hang as the file system is being queried. Calls to {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} will return 0 until the model populates a directory. <p>QFileSystemModel keeps a cache with file information. The cache is automatically kept up to date using the {@link com.trolltech.qt.core.QFileSystemWatcher QFileSystemWatcher}. <p>QFileSystemModel can be accessed using the standard interface provided by {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, but it also provides some convenience functions that are specific to a directory model. The {@link com.trolltech.qt.gui.QFileSystemModel#fileInfo(com.trolltech.qt.core.QModelIndex) fileInfo()}, {@link com.trolltech.qt.gui.QFileSystemModel#isDir(com.trolltech.qt.core.QModelIndex) isDir()}, name(), and path() functions provide information about the underlying files and directories related to items in the model. Directories can be created and removed using {@link com.trolltech.qt.gui.QFileSystemModel#mkdir(com.trolltech.qt.core.QModelIndex, java.lang.String) mkdir()}, {@link com.trolltech.qt.gui.QFileSystemModel#rmdir(com.trolltech.qt.core.QModelIndex) rmdir()}. <p><b>Note:</b>QFileSystemModel requires an instance of a GUI application. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-model.html">Model Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFileSystemModel extends com.trolltech.qt.core.QAbstractItemModel
{

    private Object __rcIconProvider = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    @QtBlockedEnum
    public enum Roles implements com.trolltech.qt.QtEnumerator {
/**

*/

        FileIconRole(0),
/**

*/

        FilePathRole(1),
/**

*/

        FileNameRole(2),
/**

*/

        FilePermissions(3);

        Roles(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileSystemModel$Roles constant with the specified <tt>int</tt>.</brief>
*/

        public static Roles resolve(int value) {
            return (Roles) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FileIconRole;
            case 1: return FilePathRole;
            case 2: return FileNameRole;
            case 3: return FilePermissions;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: path), java.lang.String(named: oldName), java.lang.String(named: newName)&gt;:<p> This signal is emitted whenever a file with the <tt>oldName</tt> is successfully renamed to <tt>newName</tt>. The file is located in in the directory <tt>path</tt>.
*/

    public final Signal3<java.lang.String, java.lang.String, java.lang.String> fileRenamed = new Signal3<java.lang.String, java.lang.String, java.lang.String>();

    private final void fileRenamed(java.lang.String path, java.lang.String oldName, java.lang.String newName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fileRenamed_String_String_String(nativeId(), path, oldName, newName);
    }
    native void __qt_fileRenamed_String_String_String(long __this__nativeId, java.lang.String path, java.lang.String oldName, java.lang.String newName);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: newPath)&gt;:<p> This signal is emitted whenever the root path has been changed to a <tt>newPath</tt>.
*/

    public final Signal1<java.lang.String> rootPathChanged = new Signal1<java.lang.String>();

    private final void rootPathChanged(java.lang.String newPath)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rootPathChanged_String(nativeId(), newPath);
    }
    native void __qt_rootPathChanged_String(long __this__nativeId, java.lang.String newPath);


/**
Constructs a file system model with the given <tt>parent</tt>.
*/

    public QFileSystemModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a file system model with the given <tt>parent</tt>.
*/

    public QFileSystemModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFileSystemModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFileSystemModel_QObject(long parent);

/**
Returns the icon for the item stored in the model under the given <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon fileIcon(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileIcon_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_fileIcon_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the {@link com.trolltech.qt.core.QFileInfo QFileInfo} for the item stored in the model under the given <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFileInfo fileInfo(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileInfo_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QFileInfo __qt_fileInfo_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the file name for the item stored in the model under the given <tt>index</tt>.
*/

    @QtBlockedSlot
    public final java.lang.String fileName(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the path of the item stored in the model under the <tt>index</tt> given.
*/

    @QtBlockedSlot
    public final java.lang.String filePath(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filePath_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_filePath_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the filter specification for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and QDir::Filters. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.Filters filter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.Filters(__qt_filter(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_filter(long __this__nativeId);

/**
Returns the file icon provider for this directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#setIconProvider(com.trolltech.qt.gui.QFileIconProvider) setIconProvider()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileIconProvider iconProvider()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconProvider(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFileIconProvider __qt_iconProvider(long __this__nativeId);


/**
This is an overloaded member function, provided for convenience. <p>Returns the model item index for the given <tt>path</tt> and <tt>column</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index(java.lang.String path) {
        return index(path, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the model item index for the given <tt>path</tt> and <tt>column</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index(java.lang.String path, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_String_int(nativeId(), path, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_String_int(long __this__nativeId, java.lang.String path, int column);

/**
Returns true if the model item <tt>index</tt> represents a directory; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isDir(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDir_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isDir_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds Whether the directory model allows writing to the file system. If this property is set to false, the directory model will allow renaming, copying and deleting of files and directories. <p>This property is true by default
*/

    @com.trolltech.qt.QtPropertyReader(name="readOnly")
    @QtBlockedSlot
    public final boolean isReadOnly()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
Returns the date and time when <tt>index</tt> was last modified.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime lastModified(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastModified_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_lastModified_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Create a directory with the <tt>name</tt> in the <tt>parent</tt> model index.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex mkdir(com.trolltech.qt.core.QModelIndex parent, java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkdir_QModelIndex_String(nativeId(), parent, name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_mkdir_QModelIndex_String(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, java.lang.String name);


/**
Returns the data stored under the given <tt>role</tt> for the item "My Computer". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object myComputer() {
        return myComputer((int)0);
    }
/**
Returns the data stored under the given <tt>role</tt> for the item "My Computer". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object myComputer(int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_myComputer_int(nativeId(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_myComputer_int(long __this__nativeId, int role);

/**
This property holds Whether files that don't pass the name filter are hidden or disabled. This property is true by default
*/

    @com.trolltech.qt.QtPropertyReader(name="nameFilterDisables")
    @QtBlockedSlot
    public final boolean nameFilterDisables()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nameFilterDisables(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_nameFilterDisables(long __this__nativeId);

/**
Returns a list of filters applied to the names in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> nameFilters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nameFilters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_nameFilters(long __this__nativeId);

/**
Returns the complete OR-ed together combination of {@link com.trolltech.qt.core.QFile.Permission QFile::Permission } for the <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.Permissions permissions(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QFile.Permissions(__qt_permissions_QModelIndex(nativeId(), index));
    }
    @QtBlockedSlot
    native int __qt_permissions_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Removes the model item <tt>index</tt> from the file system model and <b>deletes the corresponding file from the file system</b>, returning true if successful. If the item cannot be removed, false is returned. <p><b>Warning:</b> This function deletes files from the file system; it does <b>not</b> move them to a location where they can be recovered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#rmdir(com.trolltech.qt.core.QModelIndex) rmdir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean remove(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_remove_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds Whether the directory model should resolve symbolic links. This is only relevant on operating systems that support symbolic links. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="resolveSymlinks")
    @QtBlockedSlot
    public final boolean resolveSymlinks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolveSymlinks(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_resolveSymlinks(long __this__nativeId);

/**
Removes the directory corresponding to the model item <tt>index</tt> in the file system model and <b>deletes the corresponding directory from the file system</b>, returning true if successful. If the directory cannot be removed, false is returned. <p><b>Warning:</b> This function deletes directories from the file system; it does <b>not</b> move them to a location where they can be recovered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#remove(com.trolltech.qt.core.QModelIndex) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rmdir(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmdir_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_rmdir_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
The currently set directory <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#rootPath() rootPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir rootDirectory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootDirectory(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDir __qt_rootDirectory(long __this__nativeId);

/**
The currently set root path <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#setRootPath(java.lang.String) setRootPath()}, and {@link com.trolltech.qt.gui.QFileSystemModel#rootDirectory() rootDirectory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String rootPath()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootPath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_rootPath(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filter ... filters) {
        this.setFilter(new com.trolltech.qt.core.QDir.Filters(filters));
    }
/**
Sets the directory model's filter to that specified by <tt>filters</tt>. <p>Note that the filter you set should always include the {@link com.trolltech.qt.core.QDir.Filter QDir::AllDirs } enum value, otherwise QFileSystemModel won't be able to read the directory structure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#filter() filter()}, and QDir::Filters. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filters filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilter_Filters(nativeId(), filters.value());
    }
    @QtBlockedSlot
    native void __qt_setFilter_Filters(long __this__nativeId, int filters);

/**
Sets the <tt>provider</tt> of file icons for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#iconProvider() iconProvider()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIconProvider(com.trolltech.qt.gui.QFileIconProvider provider)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcIconProvider = provider;
        }
        __qt_setIconProvider_QFileIconProvider(nativeId(), provider == null ? 0 : provider.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconProvider_QFileIconProvider(long __this__nativeId, long provider);

/**
This property holds Whether files that don't pass the name filter are hidden or disabled. This property is true by default
*/

    @com.trolltech.qt.QtPropertyWriter(name="nameFilterDisables")
    @QtBlockedSlot
    public final void setNameFilterDisables(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilterDisables_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setNameFilterDisables_boolean(long __this__nativeId, boolean enable);

/**
Sets the name <tt>filters</tt> to apply against the existing files. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#nameFilters() nameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNameFilters(java.util.List<java.lang.String> filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilters_List(nativeId(), filters);
    }
    @QtBlockedSlot
    native void __qt_setNameFilters_List(long __this__nativeId, java.util.List<java.lang.String> filters);

/**
This property holds Whether the directory model allows writing to the file system. If this property is set to false, the directory model will allow renaming, copying and deleting of files and directories. <p>This property is true by default
*/

    @com.trolltech.qt.QtPropertyWriter(name="readOnly")
    @QtBlockedSlot
    public final void setReadOnly(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean enable);

/**
This property holds Whether the directory model should resolve symbolic links. This is only relevant on operating systems that support symbolic links. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="resolveSymlinks")
    @QtBlockedSlot
    public final void setResolveSymlinks(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResolveSymlinks_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setResolveSymlinks_boolean(long __this__nativeId, boolean enable);

/**
Sets the directory that is being watched by the model to <tt>newPath</tt> by installing a {@link com.trolltech.qt.core.QFileSystemWatcher file system watcher} on it. Any changes to files and directories within this directory will be reflected in the model. <p>If the path is changed, the {@link com.trolltech.qt.gui.QFileSystemModel#rootPathChanged rootPathChanged() } signal will be emitted. <p><b>Note:</b> This function does not change the structure of the model or modify the data available to views. In other words, the "root" of the model is not changed to include only files and directories within the directory specified by <tt>newPath</tt> in the file system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileSystemModel#rootPath() rootPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex setRootPath(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setRootPath_String(nativeId(), path);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_setRootPath_String(long __this__nativeId, java.lang.String path);

/**
Returns the size in bytes of <tt>index</tt>. If the file does not exist, 0 is returned.
*/

    @QtBlockedSlot
    public final long size(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native long __qt_size_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the type of file <tt>index</tt> such as "Directory" or "JPEG file".
*/

    @QtBlockedSlot
    public final java.lang.String type(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_type_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean canFetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canFetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native boolean __qt_canFetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int columnCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex index, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), index, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean dropMimeData(com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.DropAction action, int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dropMimeData_QMimeData_DropAction_int_int_QModelIndex(nativeId(), data == null ? 0 : data.nativeId(), action.value(), row, column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_dropMimeData_QMimeData_DropAction_int_int_QModelIndex(long __this__nativeId, long data, int action, int row, int column, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void fetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native void __qt_fetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.ItemFlags flags(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags_QModelIndex(nativeId(), index));
    }
    @QtBlockedSlot
    native int __qt_flags_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasChildren(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildren_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native boolean __qt_hasChildren_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object headerData(int section, com.trolltech.qt.core.Qt.Orientation orientation, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerData_int_Orientation_int(nativeId(), section, orientation.value(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_headerData_int_Orientation_int(long __this__nativeId, int section, int orientation, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_int_int_QModelIndex(nativeId(), row, column, parent);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QMimeData mimeData(java.util.List<com.trolltech.qt.core.QModelIndex> indexes)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_List(nativeId(), indexes);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QModelIndex> indexes);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> mimeTypes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeTypes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_mimeTypes(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent_QModelIndex(nativeId(), child);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int rowCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setData(com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setData_QModelIndex_Object_int(nativeId(), index, value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setData_QModelIndex_Object_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void sort(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sort_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sort_int_SortOrder(long __this__nativeId, int column, int order);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.DropActions supportedDropActions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DropActions(__qt_supportedDropActions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_supportedDropActions(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QFileSystemModel fromNativePointer(QNativePointer nativePointer);

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

    protected QFileSystemModel(QPrivateConstructor p) { super(p); } 
}
