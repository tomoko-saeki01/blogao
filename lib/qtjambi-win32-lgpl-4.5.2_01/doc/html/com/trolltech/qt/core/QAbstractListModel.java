package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractListModel class provides an abstract model that can be subclassed to create one-dimensional list models. QAbstractListModel provides a standard interface for models that represent their data as a simple non-hierarchical sequence of items. It is not used directly, but must be subclassed. <p>Since the model provides a more specialized interface than {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, it is not suitable for use with tree views; you will need to subclass {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} if you want to provide a model for that purpose. If you need to use a number of list models to manage data, it may be more appropriate to subclass {@link com.trolltech.qt.gui.QAbstractTableModel QAbstractTableModel} class instead. <p>Simple models can be created by subclassing this class and implementing the minimum number of required functions. For example, we could implement a simple read-only QStringList-based model that provides a list of strings to a {@link com.trolltech.qt.gui.QListView QListView} widget. In such a case, we only need to implement the {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} function to return the number of items in the list, and the {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} function to retrieve items from the list. <p>Since the model represents a one-dimensional structure, the {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} function returns the total number of items in the model. The {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} function is implemented for interoperability with all kinds of views, but by default informs views that the model contains only one column.<a name="subclassing"><h2>Subclassing</h2> <b>Note:</b> Some general guidelines for subclassing models are available in the {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}. <p>When subclassing QAbstractListModel, you must provide implementations of the {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} functions. Well behaved models also provide a {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()} implementation. <p>For editable list models, you must also provide an implementation of {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, implement the {@link com.trolltech.qt.core.QAbstractItemModel#flags(com.trolltech.qt.core.QModelIndex) flags()} function so that it returns a value containing Qt::ItemIsEditable. <p>Note that QAbstractListModel provides a default implementation of {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} that informs views that there is only a single column of items in this model. <p>Models that provide interfaces to resizable list-like data structures can provide implementations of {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} and {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}. When implementing these functions, it is important to call the appropriate functions so that all connected views are aware of any changes: <ul><li> An {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}before inserting new rows into the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}immediately afterwards.</li><li> A {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}before the rows are removed from the data structure, and it must call {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}immediately afterwards.</li></ul> <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-model.html">Model Classes</a>}, {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}, {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}, {@link com.trolltech.qt.gui.QAbstractTableModel QAbstractTableModel}, and {@link <a href="../itemviews-puzzle.html">Item Views Puzzle Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractListModel extends com.trolltech.qt.core.QAbstractItemModel
{

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractListModel {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

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
Constructs an abstract list model with the given <tt>parent</tt>.
*/

    public QAbstractListModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an abstract list model with the given <tt>parent</tt>.
*/

    public QAbstractListModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractListModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractListModel_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Deprecated
    @QtBlockedSlot
    public final int columnCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount_QModelIndex(nativeId(), parent);
    }
    @Deprecated
    @QtBlockedSlot
    final int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


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
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
@exclude
*/

    public static native QAbstractListModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractListModel(QPrivateConstructor p) { super(p); } 
}
