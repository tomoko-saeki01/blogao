package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractProxyModel class provides a base class for proxy item models that can do sorting, filtering or other data processing tasks. This class defines the standard interface that proxy models must use to be able to interoperate correctly with other model/view components. It is not supposed to be instantiated directly. <p>All standard proxy models are derived from the QAbstractProxyModel class. If you need to create a new proxy model class, it is usually better to subclass an existing class that provides the closest behavior to the one you want to provide. <p>Proxy models that filter or sort items of data from a source model should be created by using or subclassing {@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel}. <p>To subclass QAbstractProxyModel, you need to implement {@link com.trolltech.qt.gui.QAbstractProxyModel#mapFromSource(com.trolltech.qt.core.QModelIndex) mapFromSource()} and {@link com.trolltech.qt.gui.QAbstractProxyModel#mapToSource(com.trolltech.qt.core.QModelIndex) mapToSource()}. The {@link com.trolltech.qt.gui.QAbstractProxyModel#mapSelectionFromSource(com.trolltech.qt.gui.QItemSelection) mapSelectionFromSource()} and {@link com.trolltech.qt.gui.QAbstractProxyModel#mapSelectionToSource(com.trolltech.qt.gui.QItemSelection) mapSelectionToSource()} functions only need to be reimplemented if you need a behavior different from the default behavior. <p><b>Note:</b> If the source model is deleted or no source model is specified, the proxy model operates on a empty placeholder model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, and {@link <a href="../model-view-programming.html">Model/View Programming</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractProxyModel extends com.trolltech.qt.core.QAbstractItemModel
{

    private Object __rcSourceModel = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractProxyModel {
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
        public com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_index_int_int_QModelIndex(nativeId(), row, column, parent);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QModelIndex mapFromSource(com.trolltech.qt.core.QModelIndex sourceIndex) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_mapFromSource_QModelIndex(nativeId(), sourceIndex);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QModelIndex mapToSource(com.trolltech.qt.core.QModelIndex proxyIndex) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_mapToSource_QModelIndex(nativeId(), proxyIndex);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex child) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_parent_QModelIndex(nativeId(), child);
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
Constructs a proxy model with the given <tt>parent</tt>.
*/

    public QAbstractProxyModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a proxy model with the given <tt>parent</tt>.
*/

    public QAbstractProxyModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractProxyModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractProxyModel_QObject(long parent);

/**
Returns the model that contains the data that is available through the proxy model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractProxyModel#setSourceModel(com.trolltech.qt.core.QAbstractItemModel) setSourceModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel sourceModel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sourceModel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_sourceModel(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex proxyIndex, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), proxyIndex, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex proxyIndex, int role);

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
    public java.util.SortedMap<java.lang.Integer, java.lang.Object> itemData(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemData_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.Integer, java.lang.Object> __qt_itemData_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Reimplement this function to return the model index in the proxy model that corresponds to the <tt>sourceIndex</tt> from the source model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractProxyModel#mapToSource(com.trolltech.qt.core.QModelIndex) mapToSource()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QModelIndex mapFromSource(com.trolltech.qt.core.QModelIndex sourceIndex);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_mapFromSource_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex sourceIndex);

/**
Returns a proxy selection mapped from the specified <tt>sourceSelection</tt>. <p>Reimplement this method to map source selections to proxy selections.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QItemSelection mapSelectionFromSource(com.trolltech.qt.gui.QItemSelection selection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapSelectionFromSource_QItemSelection(nativeId(), selection == null ? 0 : selection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelection __qt_mapSelectionFromSource_QItemSelection(long __this__nativeId, long selection);

/**
Returns a source selection mapped from the specified <tt>proxySelection</tt>. <p>Reimplement this method to map proxy selections to source selections.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QItemSelection mapSelectionToSource(com.trolltech.qt.gui.QItemSelection selection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapSelectionToSource_QItemSelection(nativeId(), selection == null ? 0 : selection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelection __qt_mapSelectionToSource_QItemSelection(long __this__nativeId, long selection);

/**
Reimplement this function to return the model index in the source model that corresponds to the <tt>proxyIndex</tt> in the proxy model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractProxyModel#mapFromSource(com.trolltech.qt.core.QModelIndex) mapFromSource()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QModelIndex mapToSource(com.trolltech.qt.core.QModelIndex proxyIndex);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_mapToSource_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex proxyIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void revert()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revert(nativeId());
    }
    @QtBlockedSlot
    native void __qt_revert(long __this__nativeId);

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
    public boolean setHeaderData(int section, com.trolltech.qt.core.Qt.Orientation orientation, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHeaderData_int_Orientation_Object_int(nativeId(), section, orientation.value(), value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setHeaderData_int_Orientation_Object_int(long __this__nativeId, int section, int orientation, java.lang.Object value, int role);

/**
Sets the given <tt>sourceModel</tt> to be processed by the proxy model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractProxyModel#sourceModel() sourceModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSourceModel(com.trolltech.qt.core.QAbstractItemModel sourceModel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcSourceModel = sourceModel;
        }
        __qt_setSourceModel_QAbstractItemModel(nativeId(), sourceModel == null ? 0 : sourceModel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSourceModel_QAbstractItemModel(long __this__nativeId, long sourceModel);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean submit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_submit(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_submit(long __this__nativeId);

    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);

    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex child);

    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
@exclude
*/

    public static native QAbstractProxyModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractProxyModel(QPrivateConstructor p) { super(p); } 
}
