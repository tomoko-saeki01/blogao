package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStandardItemModel class provides a generic model for storing custom data. QStandardItemModel can be used as a repository for standard Qt data types. It is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view</a>} framework. <p>QStandardItemModel provides a classic item-based approach to working with the model. The items in a QStandardItemModel are provided by {@link com.trolltech.qt.gui.QStandardItem QStandardItem}. <p>QStandardItemModel implements the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} interface, which means that the model can be used to provide data in any view that supports that interface (such as {@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTableView QTableView} and {@link com.trolltech.qt.gui.QTreeView QTreeView}, and your own custom views). For performance and flexibility, you may want to subclass {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} to provide support for different kinds of data repositories. For example, the {@link com.trolltech.qt.gui.QDirModel QDirModel} provides a model interface to the underlying file system. <p>When you want a list or tree, you typically create an empty QStandardItemModel and use {@link com.trolltech.qt.gui.QStandardItemModel#appendRow(com.trolltech.qt.gui.QStandardItem) appendRow()} to add items to the model, and {@link com.trolltech.qt.gui.QStandardItemModel#item(int) item()} to access an item. If your model represents a table, you typically pass the dimensions of the table to the QStandardItemModel constructor and use {@link com.trolltech.qt.gui.QStandardItemModel#setItem(int, com.trolltech.qt.gui.QStandardItem) setItem()} to position items into the table. You can also use {@link com.trolltech.qt.gui.QStandardItemModel#setRowCount(int) setRowCount()} and {@link com.trolltech.qt.gui.QStandardItemModel#setColumnCount(int) setColumnCount()} to alter the dimensions of the model. To insert items, use {@link com.trolltech.qt.gui.QStandardItemModel#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()} or {@link com.trolltech.qt.gui.QStandardItemModel#insertColumn(int, java.util.List) insertColumn()}, and to remove items, use {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()} or {@link com.trolltech.qt.core.QAbstractItemModel#removeColumn(int) removeColumn()}. <p>You can set the header labels of your model with {@link com.trolltech.qt.gui.QStandardItemModel#setHorizontalHeaderLabels(java.util.List) setHorizontalHeaderLabels()} and {@link com.trolltech.qt.gui.QStandardItemModel#setVerticalHeaderLabels(java.util.List) setVerticalHeaderLabels()}. <p>You can search for items in the model with {@link com.trolltech.qt.gui.QStandardItemModel#findItems(java.lang.String, com.trolltech.qt.core.Qt.MatchFlags) findItems()}, and sort the model by calling {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()}. <p>Call {@link com.trolltech.qt.gui.QStandardItemModel#clear() clear()} to remove all items from the model. <p>An example usage of QStandardItemModel to create a table: <pre class="snippet">
            QStandardItemModel model = new QStandardItemModel(4, 4);
            for (int row = 0; row &lt; 4; ++row) {
                for (int column = 0; column &lt; 4; ++column) {
                    QStandardItem tem = new QStandardItem("row " + row +", column " + column);
                    model.setItem(row, column, item);
                }
            }
</pre> An example usage of QStandardItemModel to create a tree: <pre class="snippet">
            QStandardItemModel model = new QStandardItemModel();
            QStandardItem parentItem = model.invisibleRootItem();
            for (int i = 0; i &lt; 4; ++i) {
                QStandardItem item = new QStandardItem("item " + i);
                parentItem.appendRow(item);
                parentItem = item;
            }
</pre> After setting the model on a view, you typically want to react to user actions, such as an item being clicked. Since a {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} provides QModelIndex-based signals and functions, you need a way to obtain the {@link com.trolltech.qt.gui.QStandardItem QStandardItem} that corresponds to a given QModelIndex, and vice versa. {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()} and {@link com.trolltech.qt.gui.QStandardItemModel#indexFromItem(com.trolltech.qt.gui.QStandardItem) indexFromItem()} provide this mapping. Typical usage of {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()} includes obtaining the item at the current index in a view, and obtaining the item that corresponds to an index carried by a {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} signal, such as {@link com.trolltech.qt.gui.QAbstractItemView#clicked QAbstractItemView::clicked() }. First you connect the view's signal to a slot in your class: <pre class="snippet">
        QTreeView treeView = new QTreeView(this);
        treeView.setModel(myStandardItemModel);
        treeView.clicked.connect(this, "clicked(QModelIndex)");
</pre> When you receive the signal, you call {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()} on the given model index to get a pointer to the item: <pre class="snippet">
        protected void clicked(QModelIndex index)
        {
            QStandardItem tem = myStandardItemModel.itemFromIndex(index);
            // Do stuff with the item ...
        }
</pre> Conversely, you must obtain the QModelIndex of an item when you want to invoke a model/view function that takes an index as argument. You can obtain the index either by using the model's {@link com.trolltech.qt.gui.QStandardItemModel#indexFromItem(com.trolltech.qt.gui.QStandardItem) indexFromItem()} function, or, equivalently, by calling {@link com.trolltech.qt.gui.QStandardItem#index() QStandardItem::index()}: <pre class="snippet">
        treeView.scrollTo(item.index());
</pre> You are, of course, not required to use the item-based approach; you could instead rely entirely on the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} interface when working with the model, or use a combination of the two as appropriate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem QStandardItem}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link <a href="../itemviews-simpletreemodel.html">Simple Tree Model example</a>}, and {@link <a href="../model-view-convenience.html">Item View Convenience Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStandardItemModel extends com.trolltech.qt.core.QAbstractItemModel
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QStandardItem(named: item)&gt;:<p> This signal is emitted whenever the data of <tt>item</tt> has changed.
*/

    public final Signal1<com.trolltech.qt.gui.QStandardItem> itemChanged = new Signal1<com.trolltech.qt.gui.QStandardItem>();

    private final void itemChanged(com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemChanged_QStandardItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemChanged_QStandardItem(long __this__nativeId, long item);


/**
Constructs a new item model with the given <tt>parent</tt>.
*/

    public QStandardItemModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new item model with the given <tt>parent</tt>.
*/

    public QStandardItemModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStandardItemModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStandardItemModel_QObject(long parent);


/**
Constructs a new item model that initially has <tt>rows</tt> rows and <tt>columns</tt> columns, and that has the given <tt>parent</tt>.
*/

    public QStandardItemModel(int rows, int columns) {
        this(rows, columns, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new item model that initially has <tt>rows</tt> rows and <tt>columns</tt> columns, and that has the given <tt>parent</tt>.
*/

    public QStandardItemModel(int rows, int columns, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStandardItemModel_int_int_QObject(rows, columns, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStandardItemModel_int_int_QObject(int rows, int columns, long parent);

/**
Appends a column containing <tt>items</tt>. If necessary, the row count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#insertColumn(int, java.util.List) insertColumn()}, and {@link com.trolltech.qt.gui.QStandardItemModel#appendRow(com.trolltech.qt.gui.QStandardItem) appendRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendColumn(java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QStandardItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendColumn_List(nativeId(), items);
    }
    @QtBlockedSlot
    native void __qt_appendColumn_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
This is an overloaded member function, provided for convenience. <p>When building a list or a tree that has only one column, this function provides a convenient way to append a single new <tt>item</tt>.
*/

    @QtBlockedSlot
    public final void appendRow(com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendRow_QStandardItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_appendRow_QStandardItem(long __this__nativeId, long item);

/**
Appends a row containing <tt>items</tt>. If necessary, the column count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}, and {@link com.trolltech.qt.gui.QStandardItemModel#appendColumn(java.util.List) appendColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendRow(java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QStandardItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendRow_List(nativeId(), items);
    }
    @QtBlockedSlot
    native void __qt_appendRow_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
Removes all items (including header items) from the model and sets the number of rows and columns to zero. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeColumns(int, int) removeColumns()}, and {@link com.trolltech.qt.core.QAbstractItemModel#removeRows(int, int) removeRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);


/**
Returns a list of items that match the given <tt>text</tt>, using the given <tt>flags</tt>, in the given <tt>column</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags) {
        return findItems(text, flags, (int)0);
    }

/**
Returns a list of items that match the given <tt>text</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> findItems(java.lang.String text) {
        return findItems(text, new com.trolltech.qt.core.Qt.MatchFlags(0), (int)0);
    }
/**
Returns a list of items that match the given <tt>text</tt>, using the given <tt>flags</tt>, in the given <tt>column</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findItems_String_MatchFlags_int(nativeId(), text, flags.value(), column);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QStandardItem> __qt_findItems_String_MatchFlags_int(long __this__nativeId, java.lang.String text, int flags, int column);

/**
Returns the horizontal header item for <tt>column</tt> if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setHorizontalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setHorizontalHeaderItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#verticalHeaderItem(int) verticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem horizontalHeaderItem(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalHeaderItem_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_horizontalHeaderItem_int(long __this__nativeId, int column);

/**
Returns the QModelIndex associated with the given <tt>item</tt>. <p>Use this function when you want to perform an operation that requires the QModelIndex of the item, such as {@link com.trolltech.qt.gui.QAbstractItemView#scrollTo(com.trolltech.qt.core.QModelIndex) QAbstractItemView::scrollTo()}. {@link com.trolltech.qt.gui.QStandardItem#index() QStandardItem::index()} is provided as convenience; it is equivalent to calling this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}, and {@link com.trolltech.qt.gui.QStandardItem#index() QStandardItem::index()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex indexFromItem(com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexFromItem_QStandardItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexFromItem_QStandardItem(long __this__nativeId, long item);

/**
Inserts a column at <tt>column</tt> containing <tt>items</tt>. If necessary, the row count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#takeColumn(int) takeColumn()}, {@link com.trolltech.qt.gui.QStandardItemModel#appendColumn(java.util.List) appendColumn()}, and {@link com.trolltech.qt.gui.QStandardItemModel#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertColumn(int column, java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QStandardItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertColumn_int_List(nativeId(), column, items);
    }
    @QtBlockedSlot
    native void __qt_insertColumn_int_List(long __this__nativeId, int column, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a row at <tt>row</tt> containing <tt>item</tt>. <p>When building a list or a tree that has only one column, this function provides a convenient way to append a single new item.
*/

    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_QStandardItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertRow_int_QStandardItem(long __this__nativeId, int row, long item);

/**
Inserts a row at <tt>row</tt> containing <tt>items</tt>. If necessary, the column count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#takeRow(int) takeRow()}, {@link com.trolltech.qt.gui.QStandardItemModel#appendRow(com.trolltech.qt.gui.QStandardItem) appendRow()}, and {@link com.trolltech.qt.gui.QStandardItemModel#insertColumn(int, java.util.List) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertRow(int row, java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QStandardItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_List(nativeId(), row, items);
    }
    @QtBlockedSlot
    native void __qt_insertRow_int_List(long __this__nativeId, int row, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
Returns the model's invisible root item. <p>The invisible root item provides access to the model's top-level items through the {@link com.trolltech.qt.gui.QStandardItem QStandardItem} API, making it possible to write functions that can treat top-level items and their children in a uniform way; for example, recursive functions involving a tree model. <p><b>Note:</b> Calling {@link com.trolltech.qt.core.QAbstractItemModel#index(int, int) index()} on the {@link com.trolltech.qt.gui.QStandardItem QStandardItem} object retrieved from this function is not valid.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem invisibleRootItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invisibleRootItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_invisibleRootItem(long __this__nativeId);


/**
Returns the item for the given <tt>row</tt> and <tt>column</tt> if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setItem(int, com.trolltech.qt.gui.QStandardItem) setItem()}, {@link com.trolltech.qt.gui.QStandardItemModel#takeItem(int) takeItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem item(int row) {
        return item(row, (int)0);
    }
/**
Returns the item for the given <tt>row</tt> and <tt>column</tt> if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setItem(int, com.trolltech.qt.gui.QStandardItem) setItem()}, {@link com.trolltech.qt.gui.QStandardItemModel#takeItem(int) takeItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem item(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_item_int_int(long __this__nativeId, int row, int column);

/**
Returns a pointer to the {@link com.trolltech.qt.gui.QStandardItem QStandardItem} associated with the given <tt>index</tt>. <p>Calling this function is typically the initial step when processing QModelIndex-based signals from a view, such as {@link com.trolltech.qt.gui.QAbstractItemView#activated QAbstractItemView::activated() }. In your slot, you call {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}, with the QModelIndex carried by the signal as argument, to obtain a pointer to the corresponding {@link com.trolltech.qt.gui.QStandardItem QStandardItem}. <p>Note that this function will lazily create an item for the index (using {@link com.trolltech.qt.gui.QStandardItemModel#itemPrototype() itemPrototype()}), and set it in the parent item's child table, if no item already exists at that index. <p>If <tt>index</tt> is an invalid index, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#indexFromItem(com.trolltech.qt.gui.QStandardItem) indexFromItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem itemFromIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemFromIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_itemFromIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the item prototype used by the model. The model uses the item prototype as an item factory when it needs to construct new items on demand (for instance, when a view or item delegate calls {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setItemPrototype(com.trolltech.qt.gui.QStandardItem) setItemPrototype()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem itemPrototype()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemPrototype(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_itemPrototype(long __this__nativeId);

/**
Sets the number of columns in this model to <tt>columns</tt>. If this is less than {@link com.trolltech.qt.core.QAbstractItemModel#columnCount() columnCount()}, the data in the unwanted columns is discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setRowCount(int) setRowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnCount(int columns)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnCount_int(nativeId(), columns);
    }
    @QtBlockedSlot
    native void __qt_setColumnCount_int(long __this__nativeId, int columns);

/**
Sets the horizontal header item for <tt>column</tt> to <tt>item</tt>. The model takes ownership of the item. If necessary, the column count is increased to fit the item. The previous header item (if there was one) is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#horizontalHeaderItem(int) horizontalHeaderItem()}, {@link com.trolltech.qt.gui.QStandardItemModel#setHorizontalHeaderLabels(java.util.List) setHorizontalHeaderLabels()}, and {@link com.trolltech.qt.gui.QStandardItemModel#setVerticalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setVerticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalHeaderItem(int column, com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalHeaderItem_int_QStandardItem(nativeId(), column, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalHeaderItem_int_QStandardItem(long __this__nativeId, int column, long item);

/**
Sets the horizontal header labels using <tt>labels</tt>. If necessary, the column count is increased to the size of <tt>labels</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setHorizontalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setHorizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalHeaderLabels(java.util.List<java.lang.String> labels)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalHeaderLabels_List(nativeId(), labels);
    }
    @QtBlockedSlot
    native void __qt_setHorizontalHeaderLabels_List(long __this__nativeId, java.util.List<java.lang.String> labels);

/**
This is an overloaded method provided for convenience. It is equal to
<i>setItem(<tt>row</tt>, 0, <tt>item</tt>)</i>.
*/

    @QtBlockedSlot
    public final void setItem(int row, com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItem_int_QStandardItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItem_int_QStandardItem(long __this__nativeId, int row, long item);

/**
Sets the item for the given <tt>row</tt> and <tt>column</tt> to <tt>item</tt>. The model takes ownership of the item. If necessary, the row count and column count are increased to fit the item. The previous item at the given location (if there was one) is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#item(int) item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItem(int row, int column, com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItem_int_int_QStandardItem(nativeId(), row, column, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItem_int_int_QStandardItem(long __this__nativeId, int row, int column, long item);

/**
Sets the item prototype for the model to the specified <tt>item</tt>. The model takes ownership of the prototype. <p>The item prototype acts as a {@link com.trolltech.qt.gui.QStandardItem QStandardItem} factory, by relying on the {@link com.trolltech.qt.gui.QStandardItem#clone() QStandardItem::clone()} function. To provide your own prototype, subclass {@link com.trolltech.qt.gui.QStandardItem QStandardItem}, reimplement {@link com.trolltech.qt.gui.QStandardItem#clone() QStandardItem::clone()} and set the prototype to be an instance of your custom class. Whenever QStandardItemModel needs to create an item on demand (for instance, when a view or item delegate calls {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()})), the new items will be instances of your custom class. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#itemPrototype() itemPrototype()}, and {@link com.trolltech.qt.gui.QStandardItem#clone() QStandardItem::clone()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemPrototype(com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemPrototype_QStandardItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemPrototype_QStandardItem(long __this__nativeId, long item);

/**
Sets the number of rows in this model to <tt>rows</tt>. If this is less than {@link com.trolltech.qt.core.QAbstractItemModel#rowCount() rowCount()}, the data in the unwanted rows is discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setColumnCount(int) setColumnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowCount(int rows)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowCount_int(nativeId(), rows);
    }
    @QtBlockedSlot
    native void __qt_setRowCount_int(long __this__nativeId, int rows);

/**
This property holds the item role that is used to query the model's data when sorting items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()}, and {@link com.trolltech.qt.gui.QStandardItem#sortChildren(int) QStandardItem::sortChildren()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortRole")
    @QtBlockedSlot
    public final void setSortRole(int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortRole_int(nativeId(), role);
    }
    @QtBlockedSlot
    native void __qt_setSortRole_int(long __this__nativeId, int role);

/**
Sets the vertical header item for <tt>row</tt> to <tt>item</tt>. The model takes ownership of the item. If necessary, the row count is increased to fit the item. The previous header item (if there was one) is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#verticalHeaderItem(int) verticalHeaderItem()}, {@link com.trolltech.qt.gui.QStandardItemModel#setVerticalHeaderLabels(java.util.List) setVerticalHeaderLabels()}, and {@link com.trolltech.qt.gui.QStandardItemModel#setHorizontalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setHorizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalHeaderItem(int row, com.trolltech.qt.gui.QStandardItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalHeaderItem_int_QStandardItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setVerticalHeaderItem_int_QStandardItem(long __this__nativeId, int row, long item);

/**
Sets the vertical header labels using <tt>labels</tt>. If necessary, the row count is increased to the size of <tt>labels</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setVerticalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setVerticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalHeaderLabels(java.util.List<java.lang.String> labels)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalHeaderLabels_List(nativeId(), labels);
    }
    @QtBlockedSlot
    native void __qt_setVerticalHeaderLabels_List(long __this__nativeId, java.util.List<java.lang.String> labels);

/**
This property holds the item role that is used to query the model's data when sorting items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()}, and {@link com.trolltech.qt.gui.QStandardItem#sortChildren(int) QStandardItem::sortChildren()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sortRole")
    @QtBlockedSlot
    public final int sortRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sortRole(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sortRole(long __this__nativeId);

/**
Removes the given <tt>column</tt> without deleting the column items, and returns a list of pointers to the removed items. The model releases ownership of the items. For items in the column that have not been set, the corresponding pointers in the list will be 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#takeRow(int) takeRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> takeColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.List<com.trolltech.qt.gui.QStandardItem> __qt_return_value = __qt_takeColumn_int(nativeId(), column);
        if (__qt_return_value != null) {
        for (com.trolltech.qt.gui.QStandardItem i : __qt_return_value)
            if (i != null) i.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QStandardItem> __qt_takeColumn_int(long __this__nativeId, int column);

/**
Removes the horizontal header item at <tt>column</tt> from the header without deleting it, and returns a pointer to the item. The model releases ownership of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#horizontalHeaderItem(int) horizontalHeaderItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#takeVerticalHeaderItem(int) takeVerticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeHorizontalHeaderItem(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QStandardItem __qt_return_value = __qt_takeHorizontalHeaderItem_int(nativeId(), column);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_takeHorizontalHeaderItem_int(long __this__nativeId, int column);


/**
Removes the item at (<tt>row</tt>, <tt>column</tt>) without deleting it. The model releases ownership of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#item(int) item()}, {@link com.trolltech.qt.gui.QStandardItemModel#takeRow(int) takeRow()}, and {@link com.trolltech.qt.gui.QStandardItemModel#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeItem(int row) {
        return takeItem(row, (int)0);
    }
/**
Removes the item at (<tt>row</tt>, <tt>column</tt>) without deleting it. The model releases ownership of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#item(int) item()}, {@link com.trolltech.qt.gui.QStandardItemModel#takeRow(int) takeRow()}, and {@link com.trolltech.qt.gui.QStandardItemModel#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeItem(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QStandardItem __qt_return_value = __qt_takeItem_int_int(nativeId(), row, column);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_takeItem_int_int(long __this__nativeId, int row, int column);

/**
Removes the given <tt>row</tt> without deleting the row items, and returns a list of pointers to the removed items. The model releases ownership of the items. For items in the row that have not been set, the corresponding pointers in the list will be 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> takeRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.List<com.trolltech.qt.gui.QStandardItem> __qt_return_value = __qt_takeRow_int(nativeId(), row);
        if (__qt_return_value != null) {
        for (com.trolltech.qt.gui.QStandardItem i : __qt_return_value)
            if (i != null) i.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QStandardItem> __qt_takeRow_int(long __this__nativeId, int row);

/**
Removes the vertical header item at <tt>row</tt> from the header without deleting it, and returns a pointer to the item. The model releases ownership of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#verticalHeaderItem(int) verticalHeaderItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#takeHorizontalHeaderItem(int) takeHorizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeVerticalHeaderItem(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QStandardItem __qt_return_value = __qt_takeVerticalHeaderItem_int(nativeId(), row);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_takeVerticalHeaderItem_int(long __this__nativeId, int row);

/**
Returns the vertical header item for row <tt>row</tt> if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel#setVerticalHeaderItem(int, com.trolltech.qt.gui.QStandardItem) setVerticalHeaderItem()}, and {@link com.trolltech.qt.gui.QStandardItemModel#horizontalHeaderItem(int) horizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem verticalHeaderItem(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalHeaderItem_int(nativeId(), row);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_verticalHeaderItem_int(long __this__nativeId, int row);

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
    public boolean insertColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

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
    public java.util.SortedMap<java.lang.Integer, java.lang.Object> itemData(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemData_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.Integer, java.lang.Object> __qt_itemData_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

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
    public boolean removeColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

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
    public boolean setHeaderData(int section, com.trolltech.qt.core.Qt.Orientation orientation, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHeaderData_int_Orientation_Object_int(nativeId(), section, orientation.value(), value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setHeaderData_int_Orientation_Object_int(long __this__nativeId, int section, int orientation, java.lang.Object value, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
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

    public static native QStandardItemModel fromNativePointer(QNativePointer nativePointer);

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

    protected QStandardItemModel(QPrivateConstructor p) { super(p); } 
}
