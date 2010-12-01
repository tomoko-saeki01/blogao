package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractTableModel class provides an abstract model that can be subclassed to create table models. QAbstractTableModel provides a standard interface for models that represent their data as a two-dimensional array of items. It is not used directly, but must be subclassed. <p>Since the model provides a more specialized interface than {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, it is not suitable for use with tree views, although it can be used to provide data to a {@link com.trolltech.qt.gui.QListView QListView}. If you need to represent a simple list of items, and only need a model to contain a single column of data, subclassing the {@link com.trolltech.qt.core.QAbstractListModel QAbstractListModel} may be more appropriate. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} and {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} functions return the dimensions of the table. To retrieve a model index corresponding to an item in the model, use index() and provide only the row and column numbers.<a name="subclassing"><h2>Subclassing</h2> <b>Note:</b> Some general guidelines for subclassing models are available in the {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}. <p>When subclassing QAbstractTableModel, you must implement {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}, {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}, and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()}. Default implementations of the index() and {@link com.trolltech.qt.core.QAbstractItemModel#parent(com.trolltech.qt.core.QModelIndex) parent()} functions are provided by QAbstractTableModel. Well behaved models will also implement {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}. <p>Editable models need to implement {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, and implement {@link com.trolltech.qt.core.QAbstractItemModel#flags(com.trolltech.qt.core.QModelIndex) flags()} to return a value containing Qt::ItemIsEditable. <p>Models that provide interfaces to resizable data structures can provide implementations of {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}. When implementing these functions, it is important to call the appropriate functions so that all connected views are aware of any changes: <ul><li> An {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}before inserting new rows into the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}immediately afterwards.</li><li> An {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertColumns(com.trolltech.qt.core.QModelIndex, int, int) beginInsertColumns()}before inserting new columns into the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endInsertColumns() endInsertColumns()}immediately afterwards.</li><li> A {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}before the rows are removed from the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}immediately afterwards.</li><li> A {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveColumns(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveColumns()}before the columns are removed from the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveColumns() endRemoveColumns()}immediately afterwards.</li></ul> <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-model.html">Model Classes</a>}, {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link com.trolltech.qt.core.QAbstractListModel QAbstractListModel}, and {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractTableModel extends com.trolltech.qt.core.QAbstractItemModel
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractTableModel {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int columnCount(com.trolltech.qt.core.QModelIndex parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnCount_QModelIndex(nativeId(), parent);
        }

        @Override
        @QtBlockedSlot
        public java.lang.Object data(com.trolltech.qt.core.QModelIndex index, int role) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_data_QModelIndex_int(nativeId(), index, role);
        }

        @Override
        @QtBlockedSlot
        public int rowCount(com.trolltech.qt.core.QModelIndex parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowCount_QModelIndex(nativeId(), parent);
        }
    }



/**
Constructs an abstract table model for the given <tt>parent</tt>.
*/

    public QAbstractTableModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an abstract table model for the given <tt>parent</tt>.
*/

    public QAbstractTableModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractTableModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractTableModel_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Deprecated
    @QtBlockedSlot
    public final boolean hasChildren(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildren_QModelIndex(nativeId(), parent);
    }
    @Deprecated
    @QtBlockedSlot
    final boolean __qt_hasChildren_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Deprecated
    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent_QModelIndex(nativeId(), child);
    }
    @Deprecated
    @QtBlockedSlot
    final com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex child)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


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
    public com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_int_int_QModelIndex(nativeId(), row, column, parent);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);

    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
@exclude
*/

    public static native QAbstractTableModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractTableModel(QPrivateConstructor p) { super(p); } 
}
