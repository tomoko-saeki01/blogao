package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStringListModel class provides a model that supplies strings to views. QStringListModel is an editable model that can be used for simple cases where you need to display a number of strings in a view widget, such as a {@link com.trolltech.qt.gui.QListView QListView} or a {@link com.trolltech.qt.gui.QComboBox QComboBox}. <p>The model provides all the standard functions of an editable model, representing the data in the string list as a model with one column and a number of rows equal to the number of items in the list. <p>Model indexes corresponding to items are obtained with the index() function, and item flags are obtained with flags(). Item data is read with the data() function and written with setData(). The number of rows (and number of items in the string list) can be found with the rowCount() function. <p>The model can be constructed with an existing string list, or strings can be set later with the {@link com.trolltech.qt.gui.QStringListModel#setStringList(java.util.List) setStringList()} convenience function. Strings can also be inserted in the usual way with the insertRows() function, and removed with removeRows(). The contents of the string list can be retrieved with the {@link com.trolltech.qt.gui.QStringListModel#stringList() stringList()} convenience function. <p>An example usage of QStringListModel: <pre class="snippet">
        QStringListModel model = new QStringListModel();
        List&lt;String&gt; list = new Vector&lt;String&gt;();
        list.add("a");
        list.add("b");
        list.add("c");
        model.setStringList(list);
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractListModel QAbstractListModel}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, and {@link <a href="../model-view-model.html">Model Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStringListModel extends com.trolltech.qt.core.QAbstractListModel
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a string list model with the given <tt>parent</tt>.
*/

    public QStringListModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a string list model with the given <tt>parent</tt>.
*/

    public QStringListModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStringListModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStringListModel_QObject(long parent);


/**
Constructs a string list model containing the specified <tt>strings</tt> with the given <tt>parent</tt>.
*/

    public QStringListModel(java.util.List<java.lang.String> strings) {
        this(strings, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a string list model containing the specified <tt>strings</tt> with the given <tt>parent</tt>.
*/

    public QStringListModel(java.util.List<java.lang.String> strings, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStringListModel_List_QObject(strings, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStringListModel_List_QObject(java.util.List<java.lang.String> strings, long parent);

/**
Sets the model's internal string list to <tt>strings</tt>. The model will notify any attached views that its underlying data has changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStringListModel#stringList() stringList()}, and {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStringList(java.util.List<java.lang.String> strings)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStringList_List(nativeId(), strings);
    }
    @QtBlockedSlot
    native void __qt_setStringList_List(long __this__nativeId, java.util.List<java.lang.String> strings);

/**
Returns the string list used by the model to store data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStringListModel#setStringList(java.util.List) setStringList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> stringList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stringList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_stringList(long __this__nativeId);

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
    public boolean insertRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean removeRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

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

    public static native QStringListModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStringListModel(QPrivateConstructor p) { super(p); } 
}
