package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractItemModel class provides the abstract interface for item model classes. The QAbstractItemModel class defines the standard interface that item models must use to be able to interoperate with other components in the model/view architecture. It is not supposed to be instantiated directly. Instead, you should subclass it to create new models. <p>The QAbstractItemModel class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>If you need a model to use with a {@link com.trolltech.qt.gui.QListView QListView} or a {@link com.trolltech.qt.gui.QTableView QTableView}, you should consider subclassing {@link com.trolltech.qt.core.QAbstractListModel QAbstractListModel} or {@link com.trolltech.qt.gui.QAbstractTableModel QAbstractTableModel} instead of this class. <p>The underlying data model is exposed to views and delegates as a hierarchy of tables. If you do not make use of the hierarchy, then the model is a simple table of rows and columns. Each item has a unique index specified by a QModelIndex. <br><center><img src="../images/modelindex-no-parent.png"></center><br> Every item of data that can be accessed via a model has an associated model index. You can obtain this model index using the {@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()} function. Each index may have a {@link com.trolltech.qt.core.QAbstractItemModel#sibling(int, int, com.trolltech.qt.core.QModelIndex) sibling()} index; child items have a {@link com.trolltech.qt.core.QAbstractItemModel#parent(com.trolltech.qt.core.QModelIndex) parent()} index. <p>Each item has a number of data elements associated with it and they can be retrieved by specifying a role (see {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }) to the model's {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} function. Data for all available roles can be obtained at the same time using the {@link com.trolltech.qt.core.QAbstractItemModel#itemData(com.trolltech.qt.core.QModelIndex) itemData()} function. <p>Data for each role is set using a particular {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }. Data for individual roles are set individually with {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, or they can be set for all roles with {@link com.trolltech.qt.core.QAbstractItemModel#setItemData(com.trolltech.qt.core.QModelIndex, java.util.SortedMap) setItemData()}. <p>Items can be queried with {@link com.trolltech.qt.core.QAbstractItemModel#flags(com.trolltech.qt.core.QModelIndex) flags()} (see {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemFlag }) to see if they can be selected, dragged, or manipulated in other ways. <p>If an item has child objects, {@link com.trolltech.qt.core.QAbstractItemModel#hasChildren() hasChildren()} returns true for the corresponding index. <p>The model has a {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} and a {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} for each level of the hierarchy. Rows and columns can be inserted and removed with {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}. <p>The model emits signals to indicate changes. For example, {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } is emitted whenever items of data made available by the model are changed. Changes to the headers supplied by the model cause {@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() } to be emitted. If the structure of the underlying data changes, the model can emit {@link com.trolltech.qt.core.QAbstractItemModel#layoutChanged layoutChanged() } to indicate to any attached views that they should redisplay any items shown, taking the new structure into account. <p>The items available through the model can be searched for particular data using the {@link com.trolltech.qt.core.QAbstractItemModel#match(com.trolltech.qt.core.QModelIndex, int, java.lang.Object, int, com.trolltech.qt.core.Qt.MatchFlag[]) match()} function. <p>To sort the model, you can use {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()}.<a name="subclassing"><h2>Subclassing</h2> <b>Note:</b> Some general guidelines for subclassing models are available in the {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}. <p>When subclassing QAbstractItemModel, at the very least you must implement {@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()}, {@link com.trolltech.qt.core.QAbstractItemModel#parent(com.trolltech.qt.core.QModelIndex) parent()}, {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}, {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}, and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()}. These functions are used in all read-only models, and form the basis of editable models. <p>You can also reimplement {@link com.trolltech.qt.core.QAbstractItemModel#hasChildren() hasChildren()} to provide special behavior for models where the implementation of {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} is expensive. This makes it possible for models to restrict the amount of data requested by views, and can be used as a way to implement lazy population of model data. <p>To enable editing in your model, you must also implement {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, and reimplement {@link com.trolltech.qt.core.QAbstractItemModel#flags(com.trolltech.qt.core.QModelIndex) flags()} to ensure that <tt>ItemIsEditable</tt> is returned. You can also reimplement {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()} and {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()} to control the way the headers for your model are presented. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } and {@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() } signals must be emitted explicitly when reimplementing the {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()} and {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()} functions, respectively. <p>Custom models need to create model indexes for other components to use. To do this, call {@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()} with suitable row and column numbers for the item, and an identifier for it, either as a pointer or as an integer value. The combination of these values must be unique for each item. Custom models typically use these unique identifiers in other reimplemented functions to retrieve item data and access information about the item's parents and children. See the {@link <a href="../itemviews-simpletreemodel.html">Simple Tree Model Example</a>} for more information about unique identifiers. <p>It is not necessary to support every role defined in {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }. Depending on the type of data contained within a model, it may only be useful to implement the {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} function to return valid information for some of the more common roles. Most models provide at least a textual representation of item data for the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }, and well-behaved models should also provide valid information for the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ToolTipRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::WhatsThisRole }. Supporting these roles enables models to be used with standard Qt views. However, for some models that handle highly-specialized data, it may be appropriate to provide data only for user-defined roles. <p>Models that provide interfaces to resizable data structures can provide implementations of {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()},and {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}. When implementing these functions, it is important to notify any connected views about changes to the model's dimensions both before and after they occur: <ul><li> An {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}before inserting new rows into the data structure, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}immediately afterwards.</li><li> An {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertColumns(com.trolltech.qt.core.QModelIndex, int, int) beginInsertColumns()}before inserting new columns into the data structure, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertColumns() endInsertColumns()}immediately afterwards.</li><li> A {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}before the rows are removed from the data structure, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}immediately afterwards.</li><li> A {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()} implementation must call {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveColumns(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveColumns()}before the columns are removed from the data structure, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveColumns() endRemoveColumns()}immediately afterwards.</li></ul> The private signals that these functions emit give attached components the chance to take action before any data becomes unavailable. The encapsulation of the insert and remove operations with these begin and end functions also enables the model to manage {@link com.trolltech.qt.core.QPersistentModelIndex persistent model indexes} correctly. <b>If you want selections to be handled properly, you must ensure that you call these functions.</b> If you insert or remove an item with children, you do not need to call these functions for the child items. In other words, the parent item will take care of its child items. <p>To create models that populate incrementally, you can reimplement {@link com.trolltech.qt.core.QAbstractItemModel#fetchMore(com.trolltech.qt.core.QModelIndex) fetchMore()} and {@link com.trolltech.qt.core.QAbstractItemModel#canFetchMore(com.trolltech.qt.core.QModelIndex) canFetchMore()}. If the reimplementation of {@link com.trolltech.qt.core.QAbstractItemModel#fetchMore(com.trolltech.qt.core.QModelIndex) fetchMore()} adds rows to the model, {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()} and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()} must be called. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-model.html">Model Classes</a>}, {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}, QModelIndex, {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}, {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}, {@link <a href="../itemviews-simpledommodel.html">Simple DOM Model Example</a>}, {@link <a href="../itemviews-simpletreemodel.html">Simple Tree Model Example</a>}, {@link <a href="../itemviews-editabletreemodel.html">Editable Tree Model Example</a>}, and {@link <a href="../itemviews-fetchmore.html">Fetch More Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractItemModel extends com.trolltech.qt.core.QObject
{

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractItemModel {
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
        public com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_index_int_int_QModelIndex(nativeId(), row, column, parent);
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

    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> columnsAboutToBeInserted = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> columnsAboutToBeRemoved = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> columnsInserted = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> columnsRemoved = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: topLeft), com.trolltech.qt.core.QModelIndex(named: bottomRight)&gt;:<p> This signal is emitted whenever the data in an existing item changes. <p>If the items are of the same parent, the affected ones are those between <tt>topLeft</tt> and <tt>bottomRight</tt> inclusive. If the items do not have the same parent, the behavior is undefined. <p>When reimplementing the {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()} function, this signal must be emitted explicitly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() }, {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, and {@link com.trolltech.qt.core.QAbstractItemModel#layoutChanged layoutChanged() }. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex> dataChanged = new Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex>();

    private final void dataChanged(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataChanged_QModelIndex_QModelIndex(nativeId(), topLeft, bottomRight);
    }
    native void __qt_dataChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);
/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$Orientation(named: orientation), java.lang.Integer(named: first), java.lang.Integer(named: last)&gt;:<p> This signal is emitted whenever a header is changed. The <tt>orientation</tt> indicates whether the horizontal or vertical header has changed. The sections in the header from the <tt>first</tt> to the <tt>last</tt> need to be updated. <p>Note that this signal must be emitted explicitly when reimplementing the {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()} function. <p>If you are changing the number of columns or rows you don't need to emit this signal, but use the begin/end functions (see the section on subclassing in the QAbstractItemModel class description for details). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}, {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()}, and {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() }. <br></DD></DT>
*/

    public final Signal3<com.trolltech.qt.core.Qt.Orientation, java.lang.Integer, java.lang.Integer> headerDataChanged = new Signal3<com.trolltech.qt.core.Qt.Orientation, java.lang.Integer, java.lang.Integer>();

    private final void headerDataChanged(com.trolltech.qt.core.Qt.Orientation orientation, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_headerDataChanged_Orientation_int_int(nativeId(), orientation.value(), first, last);
    }
    native void __qt_headerDataChanged_Orientation_int_int(long __this__nativeId, int orientation, int first, int last);
/**
 This signal is emitted just before the layout of a model is changed. Components connected to this signal use it to adapt to changes in the model's layout. <p>Subclasses should update any persistent model indexes after emitting {@link com.trolltech.qt.core.QAbstractItemModel#layoutAboutToBeChanged layoutAboutToBeChanged() }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#layoutChanged layoutChanged() }, and {@link com.trolltech.qt.core.QAbstractItemModel#changePersistentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) changePersistentIndex()}. <br></DD></DT>
*/

    public final Signal0 layoutAboutToBeChanged = new Signal0();

    private final void layoutAboutToBeChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_layoutAboutToBeChanged(nativeId());
    }
    native void __qt_layoutAboutToBeChanged(long __this__nativeId);
/**
 This signal is emitted whenever the layout of items exposed by the model has changed; for example, when the model has been sorted. When this signal is received by a view, it should update the layout of items to reflect this change. <p>When subclassing QAbstractItemModel or {@link com.trolltech.qt.gui.QAbstractProxyModel QAbstractProxyModel}, ensure that you emit {@link com.trolltech.qt.core.QAbstractItemModel#layoutAboutToBeChanged layoutAboutToBeChanged() } before changing the order of items or altering the structure of the data you expose to views, and emit {@link com.trolltech.qt.core.QAbstractItemModel#layoutChanged layoutChanged() } after changing the layout. <p>Subclasses should update any persistent model indexes before emitting {@link com.trolltech.qt.core.QAbstractItemModel#layoutChanged layoutChanged() }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#layoutAboutToBeChanged layoutAboutToBeChanged() }, {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() }, {@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() }, {@link com.trolltech.qt.core.QAbstractItemModel#reset() reset()}, and {@link com.trolltech.qt.core.QAbstractItemModel#changePersistentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) changePersistentIndex()}. <br></DD></DT>
*/

    public final Signal0 layoutChanged = new Signal0();

    private final void layoutChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_layoutChanged(nativeId());
    }
    native void __qt_layoutChanged(long __this__nativeId);
    public final PrivateSignal0 modelAboutToBeReset = new PrivateSignal0();
    public final PrivateSignal0 modelReset = new PrivateSignal0();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> rowsAboutToBeInserted = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> rowsAboutToBeRemoved = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> rowsInserted = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();
    public final PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer> rowsRemoved = new PrivateSignal3<com.trolltech.qt.core.QModelIndex, java.lang.Integer, java.lang.Integer>();


/**
Constructs an abstract item model with the given <tt>parent</tt>.
*/

    public QAbstractItemModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an abstract item model with the given <tt>parent</tt>.
*/

    public QAbstractItemModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractItemModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractItemModel_QObject(long parent);

/**
Begins a column insertion operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()} in a subclass, you must call this function before inserting data into the model's underlying data store. <p>The <tt>parent</tt> index corresponds to the parent into which the new columns are inserted; <tt>first</tt> and <tt>last</tt> are the column numbers of the new columns will have after they have been inserted. <table align="center" border="0" cellpadding="2" cellspacing="1" width="80%"><tr valign="top" class="even"><td>  <br><center><img src="../images/modelview-begin-insert-columns.png"></center><br></td><td> Specify the first and last column numbers for the span of columns you want to insert into an item in a model. <p>For example, as shown in the diagram, we insert three columns before column 4, so <tt>first</tt> is 4 and <tt>last</tt> is 6: <pre class="snippet">
        itemModel.beginInsertColumns(null, 4, 6);
        </pre> This inserts the three new columns as columns 4, 5, and 6.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/modelview-begin-append-columns.png"></center><br></td><td> To append columns, insert them after the last column. <p>For example, as shown in the diagram, we append three columns to a collection of six existing columns (ending in column 5), so <tt>first</tt> is 6 and <tt>last</tt> is 8: <pre class="snippet">
        itemModel.beginInsertColumns(null, 6, 8);
        </pre> This appends the two new columns as columns 6, 7, and 8.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#endInsertColumns() endInsertColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void beginInsertColumns(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginInsertColumns_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_beginInsertColumns_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Begins a row insertion operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} in a subclass, you must call this function before inserting data into the model's underlying data store. <p>The <tt>parent</tt> index corresponds to the parent into which the new rows are inserted; <tt>first</tt> and <tt>last</tt> are the row numbers that the new rows will have after they have been inserted. <table align="center" border="0" cellpadding="2" cellspacing="1" width="80%"><tr valign="top" class="even"><td>  <br><center><img src="../images/modelview-begin-insert-rows.png"></center><br></td><td> Specify the first and last row numbers for the span of rows you want to insert into an item in a model. <p>For example, as shown in the diagram, we insert three rows before row 2, so <tt>first</tt> is 2 and <tt>last</tt> is 4: <pre class="snippet">
        itemModel.beginInsertRows(null, 2, 4);
        </pre> This inserts the three new rows as rows 2, 3, and 4.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/modelview-begin-append-rows.png"></center><br></td><td> To append rows, insert them after the last row. <p>For example, as shown in the diagram, we append two rows to a collection of 4 existing rows (ending in row 3), so <tt>first</tt> is 4 and <tt>last</tt> is 5: <pre class="snippet">
        itemModel.beginInsertRows(null, 4, 5);
        </pre> This appends the two new rows as rows 4 and 5.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void beginInsertRows(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginInsertRows_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_beginInsertRows_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Begins a column removal operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()} in a subclass, you must call this function before removing data from the model's underlying data store. <p>The <tt>parent</tt> index corresponds to the parent from which the new columns are removed; <tt>first</tt> and <tt>last</tt> are the column numbers of the first and last columns to be removed. <table align="center" border="0" cellpadding="2" cellspacing="1" width="80%"><tr valign="top" class="even"><td>  <br><center><img src="../images/modelview-begin-remove-columns.png"></center><br></td><td> Specify the first and last column numbers for the span of columns you want to remove from an item in a model. <p>For example, as shown in the diagram, we remove the three columns from column 4 to column 6, so <tt>first</tt> is 4 and <tt>last</tt> is 6: <pre class="snippet">
        itemModel.beginRemoveColumns(null, 4, 6);
        </pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#endRemoveColumns() endRemoveColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void beginRemoveColumns(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginRemoveColumns_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_beginRemoveColumns_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Begins a row removal operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()} in a subclass, you must call this function before removing data from the model's underlying data store. <p>The <tt>parent</tt> index corresponds to the parent from which the new rows are removed; <tt>first</tt> and <tt>last</tt> are the row numbers of the rows to be removed. <table align="center" border="0" cellpadding="2" cellspacing="1" width="80%"><tr valign="top" class="even"><td>  <br><center><img src="../images/modelview-begin-remove-rows.png"></center><br></td><td> Specify the first and last row numbers for the span of rows you want to remove from an item in a model. <p>For example, as shown in the diagram, we remove the two rows from row 2 to row 3, so <tt>first</tt> is 2 and <tt>last</tt> is 3: <pre class="snippet">
        itemModel.beginRemoveRows(null, 2, 3);
        </pre></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void beginRemoveRows(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginRemoveRows_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_beginRemoveRows_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Changes the {@link com.trolltech.qt.core.QPersistentModelIndex QPersistentModelIndex} that is equal to the given <tt>from</tt> model index to the given <tt>to</tt> model index. <p>If no persistent model index equal to the given <tt>from</tt> model index was found, nothing is changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#persistentIndexList() persistentIndexList()}, and {@link com.trolltech.qt.core.QAbstractItemModel#changePersistentIndexList(java.util.List, java.util.List) changePersistentIndexList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void changePersistentIndex(com.trolltech.qt.core.QModelIndex from, com.trolltech.qt.core.QModelIndex to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changePersistentIndex_QModelIndex_QModelIndex(nativeId(), from, to);
    }
    @QtBlockedSlot
    native void __qt_changePersistentIndex_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex from, com.trolltech.qt.core.QModelIndex to);

/**
Changes the QPersistentModelIndexes that is equal to the indexes in the given <tt>from</tt> model index list to the given <tt>to</tt> model index list. <p>If no persistent model indexes equal to the indexes in the given <tt>from</tt> model index list was found, nothing is changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#persistentIndexList() persistentIndexList()}, and {@link com.trolltech.qt.core.QAbstractItemModel#changePersistentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) changePersistentIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void changePersistentIndexList(java.util.List<com.trolltech.qt.core.QModelIndex> from, java.util.List<com.trolltech.qt.core.QModelIndex> to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changePersistentIndexList_List_List(nativeId(), from, to);
    }
    @QtBlockedSlot
    native void __qt_changePersistentIndexList_List_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QModelIndex> from, java.util.List<com.trolltech.qt.core.QModelIndex> to);

/**
Use QModelIndex QAbstractItemModel.:createIndex(int row, int column, quint32 id) instead.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex createIndex(int row, int column, int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createIndex_int_int_int(nativeId(), row, column, id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_createIndex_int_int_int(long __this__nativeId, int row, int column, int id);


/**
Creates a model index for the given <tt>row</tt> and <tt>column</tt> with the internal pointer <tt>ptr</tt>. <p>Note that when you are using a {@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel} its indexes have their own internal pointer. It is not advisable to access the internal pointer in the index outside of the model. Use the {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} function instead. <p>This function provides a consistent interface that model subclasses must use to create model indexes.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex createIndex(int row, int column) {
        return createIndex(row, column, (com.trolltech.qt.QNativePointer)null);
    }
/**
Creates a model index for the given <tt>row</tt> and <tt>column</tt> with the internal pointer <tt>ptr</tt>. <p>Note that when you are using a {@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel} its indexes have their own internal pointer. It is not advisable to access the internal pointer in the index outside of the model. Use the {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} function instead. <p>This function provides a consistent interface that model subclasses must use to create model indexes.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex createIndex(int row, int column, com.trolltech.qt.QNativePointer data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createIndex_int_int_nativepointer(nativeId(), row, column, data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_createIndex_int_int_nativepointer(long __this__nativeId, int row, int column, com.trolltech.qt.QNativePointer data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean decodeData(int row, int column, com.trolltech.qt.core.QModelIndex parent, com.trolltech.qt.core.QDataStream stream)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decodeData_int_int_QModelIndex_QDataStream(nativeId(), row, column, parent, stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_decodeData_int_int_QModelIndex_QDataStream(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent, long stream);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void encodeData(java.util.List<com.trolltech.qt.core.QModelIndex> indexes, com.trolltech.qt.core.QDataStream stream)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_encodeData_List_QDataStream(nativeId(), indexes, stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native void __qt_encodeData_List_QDataStream(long __this__nativeId, java.util.List<com.trolltech.qt.core.QModelIndex> indexes, long stream);

/**
Ends a column insertion operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()} in a subclass, you must call this function after inserting data into the model's underlying data store. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#beginInsertColumns(com.trolltech.qt.core.QModelIndex, int, int) beginInsertColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void endInsertColumns()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endInsertColumns(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endInsertColumns(long __this__nativeId);

/**
Ends a row insertion operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()} in a subclass, you must call this function after inserting data into the model's underlying data store. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void endInsertRows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endInsertRows(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endInsertRows(long __this__nativeId);

/**
Ends a column removal operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()} in a subclass, you must call this function after removing data from the model's underlying data store. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveColumns(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void endRemoveColumns()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endRemoveColumns(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endRemoveColumns(long __this__nativeId);

/**
Ends a row removal operation. <p>When reimplementing {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()} in a subclass, you must call this function after removing data from the model's underlying data store. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void endRemoveRows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endRemoveRows(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endRemoveRows(long __this__nativeId);


/**
Returns true if the model returns a valid QModelIndex for <tt>row</tt> and <tt>column</tt> with <tt>parent</tt>, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasIndex(int row, int column) {
        return hasIndex(row, column, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Returns true if the model returns a valid QModelIndex for <tt>row</tt> and <tt>column</tt> with <tt>parent</tt>, otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasIndex(int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasIndex_int_int_QModelIndex(nativeId(), row, column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_hasIndex_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);


/**
Inserts a single column before the given <tt>column</tt> in the child items of the <tt>parent</tt> specified. Returns true if the column is inserted; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertColumn(int column) {
        return insertColumn(column, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Inserts a single column before the given <tt>column</tt> in the child items of the <tt>parent</tt> specified. Returns true if the column is inserted; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertColumn(int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertColumn_int_QModelIndex(nativeId(), column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertColumn_int_QModelIndex(long __this__nativeId, int column, com.trolltech.qt.core.QModelIndex parent);


/**
Inserts a single row before the given <tt>row</tt> in the child items of the <tt>parent</tt> specified. Returns true if the row is inserted; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumn(int) insertColumn()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertRow(int row) {
        return insertRow(row, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Inserts a single row before the given <tt>row</tt> in the child items of the <tt>parent</tt> specified. Returns true if the row is inserted; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumn(int) insertColumn()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertRow(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRow_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertRow_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);

/**
Returns the list of indexes stored as persistent indexes in the model.
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.core.QModelIndex> persistentIndexList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_persistentIndexList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_persistentIndexList(long __this__nativeId);


/**
Removes the given <tt>column</tt> from the child items of the <tt>parent</tt> specified. Returns true if the column is removed; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}, and {@link com.trolltech.qt.core.QAbstractItemModel#insertColumn(int) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeColumn(int column) {
        return removeColumn(column, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Removes the given <tt>column</tt> from the child items of the <tt>parent</tt> specified. Returns true if the column is removed; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}, and {@link com.trolltech.qt.core.QAbstractItemModel#insertColumn(int) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeColumn(int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeColumn_int_QModelIndex(nativeId(), column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeColumn_int_QModelIndex(long __this__nativeId, int column, com.trolltech.qt.core.QModelIndex parent);


/**
Removes the given <tt>row</tt> from the child items of the <tt>parent</tt> specified. Returns true if the row is removed; otherwise returns false. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()} is a convenience function that calls {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}. The QAbstractItemModel implementation of removeRows does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}, and {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeRow(int row) {
        return removeRow(row, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Removes the given <tt>row</tt> from the child items of the <tt>parent</tt> specified. Returns true if the row is removed; otherwise returns false. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()} is a convenience function that calls {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}. The QAbstractItemModel implementation of removeRows does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}, and {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeRow(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeRow_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeRow_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);

/**
Resets the model to its original state in any attached views. <p><b>Note:</b> The view to which the model is attached to will be reset as well. <p>When a model is reset it means that any previous data reported from the model is now invalid and has to be queried for again. <p>When a model radically changes its data it can sometimes be easier to just call this function rather than emit {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } to inform other components when the underlying data source, or its structure, has changed. <p><DT><b>See also:</b><br><DD>modelAboutToBeReset(), and modelReset(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setSupportedDragActions(com.trolltech.qt.core.Qt.DropAction ... arg__1) {
        this.setSupportedDragActions(new com.trolltech.qt.core.Qt.DropActions(arg__1));
    }
/**
Sets the supported drag <tt>actions</tt> for the items in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#supportedDragActions() supportedDragActions()}, and {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSupportedDragActions(com.trolltech.qt.core.Qt.DropActions arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSupportedDragActions_DropActions(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setSupportedDragActions_DropActions(long __this__nativeId, int arg__1);

/**
Returns the sibling at <tt>row</tt> and <tt>column</tt> for the item at <tt>index</tt>, or an invalid QModelIndex if there is no sibling at that location. <p>{@link com.trolltech.qt.core.QAbstractItemModel#sibling(int, int, com.trolltech.qt.core.QModelIndex) sibling()} is just a convenience function that finds the item's parent, and uses it to retrieve the index of the child item in the specified <tt>row</tt> and <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()}, QModelIndex::row(), and QModelIndex::column(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex sibling(int row, int column, com.trolltech.qt.core.QModelIndex idx)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sibling_int_int_QModelIndex(nativeId(), row, column, idx);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_sibling_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex idx);

/**
Returns the actions supported by the data in this model. <p>The default implementation returns {@link com.trolltech.qt.core.QAbstractItemModel#supportedDropActions() supportedDropActions()} unless specific values have been set with {@link com.trolltech.qt.core.QAbstractItemModel#setSupportedDragActions(com.trolltech.qt.core.Qt.DropAction[]) setSupportedDragActions()}. <p>{@link com.trolltech.qt.core.QAbstractItemModel#supportedDragActions() supportedDragActions()} is used by {@link com.trolltech.qt.gui.QAbstractItemView#startDrag(com.trolltech.qt.core.Qt.DropAction[]) QAbstractItemView::startDrag()} as the default values when a drag occurs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#setSupportedDragActions(com.trolltech.qt.core.Qt.DropAction[]) setSupportedDragActions()}, Qt::DropActions, and {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropActions supportedDragActions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DropActions(__qt_supportedDragActions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_supportedDragActions(long __this__nativeId);

/**
Returns a model index for the buddy of the item represented by <tt>index</tt>. When the user wants to edit an item, the view will call this function to check whether another item in the model should be edited instead, and construct a delegate using the model index returned by the buddy item. <p>In the default implementation each item is its own buddy.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex buddy(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buddy_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_buddy_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns true if there is more data available for <tt>parent</tt>; otherwise returns false. <p>The default implementation always returns false. <p>If {@link com.trolltech.qt.core.QAbstractItemModel#canFetchMore(com.trolltech.qt.core.QModelIndex) canFetchMore()} returns true, {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} will call {@link com.trolltech.qt.core.QAbstractItemModel#fetchMore(com.trolltech.qt.core.QModelIndex) fetchMore()}. However, the {@link com.trolltech.qt.core.QAbstractItemModel#fetchMore(com.trolltech.qt.core.QModelIndex) fetchMore()} function is only called when the model is being populated incrementally. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#fetchMore(com.trolltech.qt.core.QModelIndex) fetchMore()}. <br></DD></DT>
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
Returns the number of columns for the children of the given <tt>parent</tt>. <p>In most subclasses, the number of columns is independent of the <tt>parent</tt>. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
int DomModel::columnCount(const QModelIndex &parent) const
{
    return 3;
}
</pre> <b>Tip:</b> When implementing a table based model, {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} should return 0 when the parent is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnCount() {
        return columnCount((com.trolltech.qt.core.QModelIndex)null);
    }
/**
Returns the number of columns for the children of the given <tt>parent</tt>. <p>In most subclasses, the number of columns is independent of the <tt>parent</tt>. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
int DomModel::columnCount(const QModelIndex &parent) const
{
    return 3;
}
</pre> <b>Tip:</b> When implementing a table based model, {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()} should return 0 when the parent is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int columnCount(com.trolltech.qt.core.QModelIndex parent);
    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);


/**
Returns the data stored under the given <tt>role</tt> for the item referred to by the <tt>index</tt>. <p><b>Note:</b> If you do not have a value to return, return an <b>empty</b>QVariant() instead of returning 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data(com.trolltech.qt.core.QModelIndex index) {
        return data(index, (int)0);
    }
/**
Returns the data stored under the given <tt>role</tt> for the item referred to by the <tt>index</tt>. <p><b>Note:</b> If you do not have a value to return, return an <b>empty</b>QVariant() instead of returning 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.Object data(com.trolltech.qt.core.QModelIndex index, int role);
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

/**
Handles the <tt>data</tt> supplied by a drag and drop operation that ended with the given <tt>action</tt>. Returns true if the data and action can be handled by the model; otherwise returns false. <p>Although the specified <tt>row</tt>, <tt>column</tt> and <tt>parent</tt> indicate the location of an item in the model where the operation ended, it is the responsibility of the view to provide a suitable location for where the data should be inserted. <p>For instance, a drop action on an item in a {@link com.trolltech.qt.gui.QTreeView QTreeView} can result in new items either being inserted as children of the item specified by <tt>row</tt>, <tt>column</tt>, and <tt>parent</tt>, or as siblings of the item. <p>When row and column are -1 it means that it is up to the model to decide where to place the data. This can occur in a tree when data is dropped on a parent. Models will usually append the data to the parent in this case. <p>Returns true if the dropping was successful otherwise false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#supportedDropActions() supportedDropActions()}, and {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}. <br></DD></DT>
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
Fetches any available data for the items with the parent specified by the <tt>parent</tt> index. <p>Reimplement this if you are populating your model incrementally. <p>The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#canFetchMore(com.trolltech.qt.core.QModelIndex) canFetchMore()}. <br></DD></DT>
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
Returns the item flags for the given <tt>index</tt>. <p>The base class implementation returns a combination of flags that enables the item (<tt>ItemIsEnabled</tt>) and allows it to be selected (<tt>ItemIsSelectable</tt>). <p><DT><b>See also:</b><br><DD>Qt::ItemFlags. <br></DD></DT>
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
Returns true if <tt>parent</tt> has any children; otherwise returns false. Use {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} on the parent to find out the number of children. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#parent(com.trolltech.qt.core.QModelIndex) parent()}, and {@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasChildren() {
        return hasChildren((com.trolltech.qt.core.QModelIndex)null);
    }
/**
Returns true if <tt>parent</tt> has any children; otherwise returns false. Use {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} on the parent to find out the number of children. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#parent(com.trolltech.qt.core.QModelIndex) parent()}, and {@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()}. <br></DD></DT>
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
Returns the data for the given <tt>role</tt> and <tt>section</tt> in the header with the specified <tt>orientation</tt>. <p>For horizontal headers, the section number corresponds to the column number of items shown beneath it. For vertical headers, the section number typically to the row number of items shown alongside it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()}, and {@link com.trolltech.qt.gui.QHeaderView QHeaderView}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object headerData(int section, com.trolltech.qt.core.Qt.Orientation orientation) {
        return headerData(section, orientation, (int)0);
    }
/**
Returns the data for the given <tt>role</tt> and <tt>section</tt> in the header with the specified <tt>orientation</tt>. <p>For horizontal headers, the section number corresponds to the column number of items shown beneath it. For vertical headers, the section number typically to the row number of items shown alongside it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) setHeaderData()}, and {@link com.trolltech.qt.gui.QHeaderView QHeaderView}. <br></DD></DT>
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
Returns the index of the item in the model specified by the given <tt>row</tt>, <tt>column</tt> and <tt>parent</tt> index. <p>When reimplementing this function in a subclass, call {@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()} to generate model indexes that other components can use to refer to items in your model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index(int row, int column) {
        return index(row, column, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
Returns the index of the item in the model specified by the given <tt>row</tt>, <tt>column</tt> and <tt>parent</tt> index. <p>When reimplementing this function in a subclass, call {@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()} to generate model indexes that other components can use to refer to items in your model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);


/**
On models that support this, inserts <tt>count</tt> new columns into the model before the given <tt>column</tt>. The items in each new column will be children of the item represented by the <tt>parent</tt> model index. <p>If <tt>column</tt> is 0, the columns are prepended to any existing columns. If <tt>column</tt> is {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}, the columns are appended to any existing columns. If <tt>parent</tt> has no children, a single row with <tt>count</tt> columns is inserted. <p>Returns true if the columns were successfully inserted; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support insertions. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertColumns(com.trolltech.qt.core.QModelIndex, int, int) beginInsertColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertColumns() endInsertColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertColumns(int column, int count) {
        return insertColumns(column, count, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
On models that support this, inserts <tt>count</tt> new columns into the model before the given <tt>column</tt>. The items in each new column will be children of the item represented by the <tt>parent</tt> model index. <p>If <tt>column</tt> is 0, the columns are prepended to any existing columns. If <tt>column</tt> is {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}, the columns are appended to any existing columns. If <tt>parent</tt> has no children, a single row with <tt>count</tt> columns is inserted. <p>Returns true if the columns were successfully inserted; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support insertions. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertColumns(com.trolltech.qt.core.QModelIndex, int, int) beginInsertColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertColumns() endInsertColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean insertColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);


/**
On models that support this, inserts <tt>count</tt> rows into the model before the given <tt>row</tt>. The items in the new row will be children of the item represented by the <tt>parent</tt> model index. <p>If <tt>row</tt> is 0, the rows are prepended to any existing rows in the parent. If <tt>row</tt> is {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}, the rows are appended to any existing rows in the parent. If <tt>parent</tt> has no children, a single column with <tt>count</tt> rows is inserted. <p>Returns true if the rows were successfully inserted; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support insertions. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertRows(int row, int count) {
        return insertRows(row, count, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
On models that support this, inserts <tt>count</tt> rows into the model before the given <tt>row</tt>. The items in the new row will be children of the item represented by the <tt>parent</tt> model index. <p>If <tt>row</tt> is 0, the rows are prepended to any existing rows in the parent. If <tt>row</tt> is {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}, the rows are appended to any existing rows in the parent. If <tt>parent</tt> has no children, a single column with <tt>count</tt> rows is inserted. <p>Returns true if the rows were successfully inserted; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support insertions. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endInsertRows() endInsertRows()}. <br></DD></DT>
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
Returns a map with values for all predefined roles in the model for the item at the given <tt>index</tt>. <p>Reimplemented this function if you want to extend the default behavior of this function to include custom roles in the map. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#setItemData(com.trolltech.qt.core.QModelIndex, java.util.SortedMap) setItemData()}, {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> match(com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits, com.trolltech.qt.core.Qt.MatchFlag ... flags) {
        return this.match(start, role, value, hits, new com.trolltech.qt.core.Qt.MatchFlags(flags));
    }

/**
This is an overloaded function provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> match(com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits) {
        return match(start, role, value, hits, new com.trolltech.qt.core.Qt.MatchFlags(com.trolltech.qt.core.Qt.MatchFlag.MatchStartsWith, com.trolltech.qt.core.Qt.MatchFlag.MatchWrap));
    }

/**
This is an overloaded function provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> match(com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value) {
        return match(start, role, value, (int)1, new com.trolltech.qt.core.Qt.MatchFlags(com.trolltech.qt.core.Qt.MatchFlag.MatchStartsWith, com.trolltech.qt.core.Qt.MatchFlag.MatchWrap));
    }
/**
Returns a list of indexes for the items in the column of the <tt>start</tt> index where the data stored under the given <tt>role</tt> matches the specified <tt>value</tt>. The way the search is performed is defined by the <tt>flags</tt> given. The list that is returned may be empty. <p>The search starts from the <tt>start</tt> index, and continues until the number of matching data items equals <tt>hits</tt>, the search reaches the last row, or the search reaches <tt>start</tt> again, depending on whether <tt>MatchWrap</tt> is specified in <tt>flags</tt>. If you want to search for all matching items, use <tt>hits</tt> = -1. <p>By default, this function will perform a wrapping, string-based comparison on all items, searching for items that begin with the search term specified by <tt>value</tt>. <p><b>Note:</b> The default implementation of this function only searches columns, This function can be reimplemented to include other search behavior.
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.core.QModelIndex> match(com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_match_QModelIndex_int_Object_int_MatchFlags(nativeId(), start, role, value, hits, flags.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_match_QModelIndex_int_Object_int_MatchFlags(long __this__nativeId, com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits, int flags);

/**
Returns an object that contains serialized items of data corresponding to the list of <tt>indexes</tt> specified. The formats used to describe the encoded data is obtained from the {@link com.trolltech.qt.core.QAbstractItemModel#mimeTypes() mimeTypes()} function. <p>If the list of indexes is empty, or there are no supported MIME types, 0 is returned rather than a serialized empty list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#mimeTypes() mimeTypes()}, and {@link com.trolltech.qt.core.QAbstractItemModel#dropMimeData(com.trolltech.qt.core.QMimeData, com.trolltech.qt.core.Qt.DropAction, int, int, com.trolltech.qt.core.QModelIndex) dropMimeData()}. <br></DD></DT>
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
Returns a list of MIME types that can be used to describe a list of model indexes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#mimeData(java.util.List) mimeData()}. <br></DD></DT>
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
Returns the parent of the model item with the given <tt>index</tt>, or QModelIndex() if it has no parent. <p>A common convention used in models that expose tree data structures is that only items in the first column have children. For that case, when reimplementing this function in a subclass the column of the returned QModelIndex would be 0. <p><b>Note:</b> When reimplementing this function in a subclass, be careful to avoid calling QModelIndex member functions, such as QModelIndex::parent(), since indexes belonging to your model will simply call your implementation, leading to infinite recursion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#createIndex(int, int, int) createIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex child);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex child);


/**
On models that support this, removes <tt>count</tt> columns starting with the given <tt>column</tt> under parent <tt>parent</tt> from the model. Returns true if the columns were successfully removed; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support removing. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveColumns(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveColumns() endRemoveColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeColumns(int column, int count) {
        return removeColumns(column, count, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
On models that support this, removes <tt>count</tt> columns starting with the given <tt>column</tt> under parent <tt>parent</tt> from the model. Returns true if the columns were successfully removed; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support removing. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveColumns(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveColumns() endRemoveColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean removeColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);


/**
On models that support this, removes <tt>count</tt> rows starting with the given <tt>row</tt> under parent <tt>parent</tt> from the model. Returns true if the rows were successfully removed; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support removing. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean removeRows(int row, int count) {
        return removeRows(row, count, (com.trolltech.qt.core.QModelIndex)null);
    }
/**
On models that support this, removes <tt>count</tt> rows starting with the given <tt>row</tt> under parent <tt>parent</tt> from the model. Returns true if the rows were successfully removed; otherwise returns false. <p>The base class implementation does nothing and returns false. <p>If you implement your own model, you can reimplement this function if you want to support removing. Alternatively, you can provide you own API for altering the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}, {@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.core.QAbstractItemModel#beginRemoveRows(com.trolltech.qt.core.QModelIndex, int, int) beginRemoveRows()}, and {@link com.trolltech.qt.core.QAbstractItemModel#endRemoveRows() endRemoveRows()}. <br></DD></DT>
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
Called to let the model know that it should discard whatever it has cached. Typically used for row editing.
*/

    public void revert()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revert(nativeId());
    }
    native void __qt_revert(long __this__nativeId);


/**
Returns the number of rows under the given <tt>parent</tt>. When the parent is valid it means that rowCount is returning the number of children of parent. <p><b>Tip:</b> When implementing a table based model, {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} should return 0 when the parent is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowCount() {
        return rowCount((com.trolltech.qt.core.QModelIndex)null);
    }
/**
Returns the number of rows under the given <tt>parent</tt>. When the parent is valid it means that rowCount is returning the number of children of parent. <p><b>Tip:</b> When implementing a table based model, {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()} should return 0 when the parent is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int rowCount(com.trolltech.qt.core.QModelIndex parent);
    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);


/**
Sets the <tt>role</tt> data for the item at <tt>index</tt> to <tt>value</tt>. Returns true if successful; otherwise returns false. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } signal should be emitted if the data was successfully set. <p>The base class implementation returns false. This function and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} must be reimplemented for editable models. Note that the {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } signal must be emitted explicitly when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()}, and {@link com.trolltech.qt.core.QAbstractItemModel#itemData(com.trolltech.qt.core.QModelIndex) itemData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setData(com.trolltech.qt.core.QModelIndex index, java.lang.Object value) {
        return setData(index, value, (int)2);
    }
/**
Sets the <tt>role</tt> data for the item at <tt>index</tt> to <tt>value</tt>. Returns true if successful; otherwise returns false. <p>The {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } signal should be emitted if the data was successfully set. <p>The base class implementation returns false. This function and {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()} must be reimplemented for editable models. Note that the {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged() } signal must be emitted explicitly when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.core.QAbstractItemModel#data(com.trolltech.qt.core.QModelIndex) data()}, and {@link com.trolltech.qt.core.QAbstractItemModel#itemData(com.trolltech.qt.core.QModelIndex) itemData()}. <br></DD></DT>
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
Sets the data for the given <tt>role</tt> and <tt>section</tt> in the header with the specified <tt>orientation</tt> to the <tt>value</tt> supplied. Returns true if the header's data was updated; otherwise returns false. <p>Note that the {@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() } signal must be emitted explicitly when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setHeaderData(int section, com.trolltech.qt.core.Qt.Orientation orientation, java.lang.Object value) {
        return setHeaderData(section, orientation, value, (int)2);
    }
/**
Sets the data for the given <tt>role</tt> and <tt>section</tt> in the header with the specified <tt>orientation</tt> to the <tt>value</tt> supplied. Returns true if the header's data was updated; otherwise returns false. <p>Note that the {@link com.trolltech.qt.core.QAbstractItemModel#headerDataChanged headerDataChanged() } signal must be emitted explicitly when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) headerData()}. <br></DD></DT>
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
This is an overloaded function provided for convenience.
*/

    @QtBlockedSlot
    public boolean setItemData(com.trolltech.qt.core.QModelIndex index, java.util.SortedMap<java.lang.Integer, java.lang.Object> roles)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setItemData_QModelIndex_SortedMap(nativeId(), index, roles);
    }
    @QtBlockedSlot
    native boolean __qt_setItemData_QModelIndex_SortedMap(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, java.util.SortedMap<java.lang.Integer, java.lang.Object> roles);


/**
Sorts the model by <tt>column</tt> in the given <tt>order</tt>. <p>The base class implementation does nothing.
*/

    @QtBlockedSlot
    public final void sort(int column) {
        sort(column, com.trolltech.qt.core.Qt.SortOrder.AscendingOrder);
    }
/**
Sorts the model by <tt>column</tt> in the given <tt>order</tt>. <p>The base class implementation does nothing.
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
Returns the row and column span of the item represented by <tt>index</tt>. <p>Note: span is not used currently, but will be in the future.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize span(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_span_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_span_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Called to let the model know that it should submit whatever it has cached to the permanent storage. Typically used for row editing. <p>Returns false on error, otherwise true.
*/

    public boolean submit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_submit(nativeId());
    }
    native boolean __qt_submit(long __this__nativeId);

/**
Returns the drop actions supported by this model. <p>The default implementation returns {@link com.trolltech.qt.core.Qt.DropAction Qt::CopyAction }. Reimplement this function if you wish to support additional actions. Note that you must also reimplement the {@link com.trolltech.qt.core.QAbstractItemModel#dropMimeData(com.trolltech.qt.core.QMimeData, com.trolltech.qt.core.Qt.DropAction, int, int, com.trolltech.qt.core.QModelIndex) dropMimeData()} function to handle the additional operations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#dropMimeData(com.trolltech.qt.core.QMimeData, com.trolltech.qt.core.Qt.DropAction, int, int, com.trolltech.qt.core.QModelIndex) dropMimeData()}, Qt::DropActions, and {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}. <br></DD></DT>
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

    public static native QAbstractItemModel fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractItemModel(QPrivateConstructor p) { super(p); } 

    private native boolean setData_native(long id, int row, int col, Object value, int role);

/**
Sets the data for the item at <tt>row</tt> and <tt>col</tt> to <tt>value</tt>.
Returns true if successful; otherwise returns false.

The dataChanged signal should be emitted if the data was successfully set.

The base class implementation returns false. This function and
data() must be reimplemented for editable models. Note that the
dataChanged() signal must be emitted explicitly when
reimplementing this function.
*/

    public final boolean setData(int row, int col, Object value) {
        return setData_native(nativeId(), row, col, value, com.trolltech.qt.core.Qt.ItemDataRole.DisplayRole);
    }

/**
Sets the models data at <tt>row</tt> and <tt>col</tt> to
<tt>value</tt>. The data is stored in the <tt>role</tt> role.
<p>

Returns true if successful; otherwise, returns false.
*/

    public final boolean setData(int row, int col, Object value, int role) {
        return setData_native(nativeId(), row, col, value, role);
    }

    private native Object data_native(long id, int row, int col, int role);

/**
Returns the data with the specified <tt>role</tt> at row <tt>row</tt>
and column <tt>col</tt>
*/

    public final Object data(int row, int col, int role) {
        return data_native(nativeId(), row, col, role);
    }

/**
Returns the data in the display role at row <tt>row</tt> and column
<tt>col</tt>.
*/

    public final Object data(int row, int col) {
        return data_native(nativeId(), row, col, Qt.ItemDataRole.DisplayRole);
    }

}
