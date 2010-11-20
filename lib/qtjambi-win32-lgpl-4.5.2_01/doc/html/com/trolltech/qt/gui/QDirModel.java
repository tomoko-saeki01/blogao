package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDirModel class provides a data model for the local filesystem. This class provides access to the local filesystem, providing functions for renaming and removing files and directories, and for creating new directories. In the simplest case, it can be used with a suitable display widget as part of a browser or filer. <p>QDirModel keeps a cache with file information. The cache needs to be updated with {@link com.trolltech.qt.gui.QDirModel#refresh() refresh()}. <p>A directory model that displays the contents of a default directory is usually constructed with a parent object: <pre class="snippet"> 
    QDirModel model = new QDirModel();
 </pre> A tree view can be used to display the contents of the model <pre class="snippet"> 
    QTreeView tree = new QTreeView(splitter);
 
    tree.setModel(model);
</pre> and the contents of a particular directory can be displayed by setting the tree view's root index: <pre class="snippet">
    tree.setRootIndex(model.index(QDir.currentPath()));
</pre> The view's root index can be used to control how much of a hierarchical model is displayed. QDirModel provides a convenience function that returns a suitable model index for a path to a directory within the model. <p>QDirModel can be accessed using the standard interface provided by {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, but it also provides some convenience functions that are specific to a directory model. The {@link com.trolltech.qt.gui.QDirModel#fileInfo(com.trolltech.qt.core.QModelIndex) fileInfo()} and {@link com.trolltech.qt.gui.QDirModel#isDir(com.trolltech.qt.core.QModelIndex) isDir()} functions provide information about the underlying files and directories related to items in the model. <p>Directories can be created and removed using {@link com.trolltech.qt.gui.QDirModel#mkdir(com.trolltech.qt.core.QModelIndex, java.lang.String) mkdir()}, {@link com.trolltech.qt.gui.QDirModel#rmdir(com.trolltech.qt.core.QModelIndex) rmdir()}, and the model will be automatically updated to take the changes into account. <p><b>Note:</b>QDirModel requires an instance of a GUI application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#nameFilters() nameFilters()}, {@link com.trolltech.qt.gui.QDirModel#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, {@link com.trolltech.qt.gui.QDirModel#filter() filter()}, {@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTreeView QTreeView}, {@link <a href="../itemviews-dirview.html">Dir View Example</a>}, and {@link <a href="../model-view-model.html">Model Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDirModel extends com.trolltech.qt.core.QAbstractItemModel
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

        FileNameRole(2);

        Roles(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDirModel$Roles constant with the specified <tt>int</tt>.</brief>
*/

        public static Roles resolve(int value) {
            return (Roles) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FileIconRole;
            case 1: return FilePathRole;
            case 2: return FileNameRole;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a directory model with the given <tt>parent</tt>.
*/

    public QDirModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a directory model with the given <tt>parent</tt>.
*/

    public QDirModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QDirModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDirModel_QObject(long parent);


/**
Constructs a new directory model with the given <tt>parent</tt>. Only those files matching the <tt>nameFilters</tt> and the <tt>filters</tt> are included in the model. The sort order is given by the <tt>sort</tt> flags.
*/

    public QDirModel(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort) {
        this(nameFilters, filters, sort, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new directory model with the given <tt>parent</tt>. Only those files matching the <tt>nameFilters</tt> and the <tt>filters</tt> are included in the model. The sort order is given by the <tt>sort</tt> flags.
*/

    public QDirModel(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QDirModel_List_Filters_SortFlags_QObject(nameFilters, filters.value(), sort.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDirModel_List_Filters_SortFlags_QObject(java.util.List<java.lang.String> nameFilters, int filters, int sort, long parent);

/**
Returns the icons for the item stored in the model under the given <tt>index</tt>.
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
Returns the file information for the specified model <tt>index</tt>. <p><b>Note:</b> If the model index represents a symbolic link in the underlying filing system, the file information returned will contain information about the symbolic link itself, regardless of whether {@link QDirModel#resolveSymlinks() resolveSymlinks} is enabled or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#symLinkTarget() QFileInfo::symLinkTarget()}. <br></DD></DT>
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
Returns the name of the item stored in the model under the <tt>index</tt> given.
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
Returns the filter specification for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and QDir::Filters. <br></DD></DT>
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
Returns the file icon provider for this directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#setIconProvider(com.trolltech.qt.gui.QFileIconProvider) setIconProvider()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Returns the model item index for the given <tt>path</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index(java.lang.String path) {
        return index(path, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the model item index for the given <tt>path</tt>.
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
This property holds Whether the directory model optimizes the hasChildren function to only check if the item is a directory.  If this property is set to false, the directory model will make sure that a directory actually containes any files before reporting that it has children. Otherwise the directory model will report that an item has children if the item is a directory. <p>This property is false by default
*/

    @com.trolltech.qt.QtPropertyReader(name="lazyChildCount")
    @QtBlockedSlot
    public final boolean lazyChildCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lazyChildCount(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_lazyChildCount(long __this__nativeId);

/**
Create a directory with the <tt>name</tt> in the <tt>parent</tt> model item.
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
Returns a list of filters applied to the names in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
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
QDirModel caches file information. This function updates the cache. The <tt>parent</tt> parameter is the directory from which the model is updated; the default value will update the model from root directory of the file system (the entire model).
*/

    public final void refresh() {
        refresh((com.trolltech.qt.core.QModelIndex)null);
    }
/**
QDirModel caches file information. This function updates the cache. The <tt>parent</tt> parameter is the directory from which the model is updated; the default value will update the model from root directory of the file system (the entire model).
*/

    public final void refresh(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_refresh_QModelIndex(nativeId(), parent);
    }
    native void __qt_refresh_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
Removes the model item <tt>index</tt> from the directory model and <b>deletes the corresponding file from the file system</b>, returning true if successful. If the item cannot be removed, false is returned. <p><b>Warning:</b> This function deletes files from the file system; it does <b>not</b> move them to a location where they can be recovered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#rmdir(com.trolltech.qt.core.QModelIndex) rmdir()}. <br></DD></DT>
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
This property holds Whether the directory model should resolve symbolic links. This is only relevant on operating systems that support symbolic links.
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
Removes the directory corresponding to the model item <tt>index</tt> in the directory model and <b>deletes the corresponding directory from the file system</b>, returning true if successful. If the directory cannot be removed, false is returned. <p><b>Warning:</b> This function deletes directories from the file system; it does <b>not</b> move them to a location where they can be recovered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#remove(com.trolltech.qt.core.QModelIndex) remove()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filter ... filters) {
        this.setFilter(new com.trolltech.qt.core.QDir.Filters(filters));
    }
/**
Sets the directory model's filter to that specified by <tt>filters</tt>. <p>Note that the filter you set should always include the {@link com.trolltech.qt.core.QDir.Filter QDir::AllDirs } enum value, otherwise QDirModel won't be able to read the directory structure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#filter() filter()}, and QDir::Filters. <br></DD></DT>
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
Sets the <tt>provider</tt> of file icons for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#iconProvider() iconProvider()}. <br></DD></DT>
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
This property holds Whether the directory model optimizes the hasChildren function to only check if the item is a directory.  If this property is set to false, the directory model will make sure that a directory actually containes any files before reporting that it has children. Otherwise the directory model will report that an item has children if the item is a directory. <p>This property is false by default
*/

    @com.trolltech.qt.QtPropertyWriter(name="lazyChildCount")
    @QtBlockedSlot
    public final void setLazyChildCount(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLazyChildCount_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setLazyChildCount_boolean(long __this__nativeId, boolean enable);

/**
Sets the name <tt>filters</tt> for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#nameFilters() nameFilters()}. <br></DD></DT>
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
This property holds Whether the directory model should resolve symbolic links. This is only relevant on operating systems that support symbolic links.
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setSorting(com.trolltech.qt.core.QDir.SortFlag ... sort) {
        this.setSorting(new com.trolltech.qt.core.QDir.SortFlags(sort));
    }
/**
Sets the directory model's sorting order to that specified by <tt>sort</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#sorting() sorting()}, and QDir::SortFlags. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSorting(com.trolltech.qt.core.QDir.SortFlags sort)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSorting_SortFlags(nativeId(), sort.value());
    }
    @QtBlockedSlot
    native void __qt_setSorting_SortFlags(long __this__nativeId, int sort);

/**
Returns the sorting method used for the directory model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDirModel#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and QDir::SortFlags. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.SortFlags sorting()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.SortFlags(__qt_sorting(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sorting(long __this__nativeId);

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
    public boolean hasChildren(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildren_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_hasChildren_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

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
@exclude
*/

    public static native QDirModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDirModel(QPrivateConstructor p) { super(p); } 
}
