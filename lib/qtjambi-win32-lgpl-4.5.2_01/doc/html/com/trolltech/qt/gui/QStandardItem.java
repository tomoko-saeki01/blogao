package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStandardItem class provides an item for use with the {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel} class. Items usually contain text, icons, or checkboxes. <p>Each item can have its own background brush which is set with the {@link com.trolltech.qt.gui.QStandardItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()} function. The current background brush can be found with {@link com.trolltech.qt.gui.QStandardItem#background() background()}. The text label for each item can be rendered with its own font and brush. These are specified with the {@link com.trolltech.qt.gui.QStandardItem#setFont(com.trolltech.qt.gui.QFont) setFont()} and {@link com.trolltech.qt.gui.QStandardItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()} functions, and read with {@link com.trolltech.qt.gui.QStandardItem#font() font()} and {@link com.trolltech.qt.gui.QStandardItem#foreground() foreground()}. <p>By default, items are enabled, editable, selectable, checkable, and can be used both as the source of a drag and drop operation and as a drop target. Each item's flags can be changed by calling {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. Checkable items can be checked and unchecked with the {@link com.trolltech.qt.gui.QStandardItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()} function. The corresponding {@link com.trolltech.qt.gui.QStandardItem#checkState() checkState()} function indicates whether the item is currently checked. <p>You can store application-specific data in an item by calling {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <p>Each item can have a two-dimensional table of child items. This makes it possible to build hierarchies of items. The typical hierarchy is the tree, in which case the child table is a table with a single column (a list). <p>The dimensions of the child table can be set with {@link com.trolltech.qt.gui.QStandardItem#setRowCount(int) setRowCount()} and {@link com.trolltech.qt.gui.QStandardItem#setColumnCount(int) setColumnCount()}. Items can be positioned in the child table with {@link com.trolltech.qt.gui.QStandardItem#setChild(int, com.trolltech.qt.gui.QStandardItem) setChild()}. Get a pointer to a child item with {@link com.trolltech.qt.gui.QStandardItem#child(int) child()}. New rows and columns of children can also be inserted with {@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()} and {@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}, or appended with {@link com.trolltech.qt.gui.QStandardItem#appendRow(com.trolltech.qt.gui.QStandardItem) appendRow()} and {@link com.trolltech.qt.gui.QStandardItem#appendColumn(java.util.List) appendColumn()}. When using the append and insert functions, the dimensions of the child table will grow as needed. <p>An existing row of children can be removed with {@link com.trolltech.qt.gui.QStandardItem#removeRow(int) removeRow()} or {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()}; correspondingly, a column can be removed with {@link com.trolltech.qt.gui.QStandardItem#removeColumn(int) removeColumn()} or {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}. <p>An item's children can be sorted by calling {@link com.trolltech.qt.gui.QStandardItem#sortChildren(int) sortChildren()}.<a name="subclassing"><h2>Subclassing</h2> When subclassing QStandardItem to provide custom items, it is possible to define new types for them so that they can be distinguished from the base class. The {@link com.trolltech.qt.gui.QStandardItem#type() type()} function should be reimplemented to return a new type value equal to or greater than {@link com.trolltech.qt.gui.QStandardItem.ItemType UserType }. <p>Reimplement {@link com.trolltech.qt.gui.QStandardItem#data() data()} and {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()} if you want to perform custom handling of data queries and/or control how an item's data is represented. <p>Reimplement {@link com.trolltech.qt.gui.QStandardItem#clone() clone()} if you want {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel} to be able to create instances of your custom item class on demand (see {@link com.trolltech.qt.gui.QStandardItemModel#setItemPrototype(com.trolltech.qt.gui.QStandardItem) QStandardItemModel::setItemPrototype()}). <p>Reimplement {@link com.trolltech.qt.gui.QStandardItem#read(com.trolltech.qt.core.QDataStream) read()} and {@link com.trolltech.qt.gui.QStandardItem#write(com.trolltech.qt.core.QDataStream) write()} if you want to control how items are represented in their serialized form. <p>Reimplement operator<() if you want to control the semantics of item comparison. operator<() determines the sorted order when sorting items with {@link com.trolltech.qt.gui.QStandardItem#sortChildren(int) sortChildren()} or with {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) QStandardItemModel::sort()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel}, {@link <a href="../model-view-convenience.html">Item View Convenience Classes</a>}, and {@link <a href="../model-view-programming.html">Model/View Programming</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStandardItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types that are used to describe standard items. You can define new user types in {@link com.trolltech.qt.gui.QStandardItem QStandardItem} subclasses to ensure that custom items are treated specially; for example, when items are sorted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#type() type()}. <br></DD></DT>
*/

    public enum ItemType implements com.trolltech.qt.QtEnumerator {
/**
 The default type for standard items.
*/

        Type(0),
/**
 The minimum value for custom types. Values below {@link com.trolltech.qt.gui.QStandardItem.ItemType UserType } are reserved by Qt.
*/

        UserType(1000);

        ItemType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStandardItem$ItemType constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemType resolve(int value) {
            return (ItemType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Type;
            case 1000: return UserType;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an item.
*/

    public QStandardItem(){
        super((QPrivateConstructor)null);
        __qt_QStandardItem();
    }

    native void __qt_QStandardItem();

/**
Constructs an item with the given <tt>icon</tt> and <tt>text</tt>.
*/

    public QStandardItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text){
        super((QPrivateConstructor)null);
        __qt_QStandardItem_QIcon_String(icon == null ? 0 : icon.nativeId(), text);
    }

    native void __qt_QStandardItem_QIcon_String(long icon, java.lang.String text);

/**
Constructs a copy of <tt>other</tt>. Note that {@link com.trolltech.qt.gui.QStandardItem#model() model()} is not copied. <p>This function is useful when reimplementing {@link com.trolltech.qt.gui.QStandardItem#clone() clone()}.
*/

    protected QStandardItem(com.trolltech.qt.gui.QStandardItem other){
        super((QPrivateConstructor)null);
        __qt_QStandardItem_QStandardItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStandardItem_QStandardItem(long other);

/**
Constructs an item with the given <tt>text</tt>.
*/

    public QStandardItem(java.lang.String text){
        super((QPrivateConstructor)null);
        __qt_QStandardItem_String(text);
    }

    native void __qt_QStandardItem_String(java.lang.String text);


/**
Constructs an item with <tt>rows</tt> rows and <tt>columns</tt> columns of child items.
*/

    public QStandardItem(int rows) {
        this(rows, (int)1);
    }
/**
Constructs an item with <tt>rows</tt> rows and <tt>columns</tt> columns of child items.
*/

    public QStandardItem(int rows, int columns){
        super((QPrivateConstructor)null);
        __qt_QStandardItem_int_int(rows, columns);
    }

    native void __qt_QStandardItem_int_int(int rows, int columns);

/**
Returns the item's accessible description. <p>The accessible description is used by assistive technologies (i.e. for users who cannot use conventional means of interaction). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setAccessibleDescription(java.lang.String) setAccessibleDescription()}, and {@link com.trolltech.qt.gui.QStandardItem#accessibleText() accessibleText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String accessibleDescription()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accessibleDescription(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_accessibleDescription(long __this__nativeId);

/**
Returns the item's accessible text. <p>The accessible text is used by assistive technologies (i.e. for users who cannot use conventional means of interaction). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setAccessibleText(java.lang.String) setAccessibleText()}, and {@link com.trolltech.qt.gui.QStandardItem#accessibleDescription() accessibleDescription()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String accessibleText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accessibleText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_accessibleText(long __this__nativeId);

/**
Appends a column containing <tt>items</tt>. If necessary, the row count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendColumn(java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
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
This is an overloaded member function, provided for convenience. <p>Appends a row containing <tt>item</tt>. <p>When building a list or a tree that has only one column, this function provides a convenient way to append a single new item.
*/

    @QtBlockedSlot
    public final void appendRow(com.trolltech.qt.gui.QStandardItem item)    {
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
Appends a row containing <tt>items</tt>. If necessary, the column count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendRow(java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
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
Appends rows containing <tt>items</tt>. The column count will not change. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendRows(java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendRows_List(nativeId(), items);
    }
    @QtBlockedSlot
    native void __qt_appendRows_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
Returns the brush used to render the item's background. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#foreground() foreground()}, and {@link com.trolltech.qt.gui.QStandardItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background(long __this__nativeId);

/**
Returns the checked state of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.gui.QStandardItem#isCheckable() isCheckable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CheckState checkState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CheckState.resolve(__qt_checkState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_checkState(long __this__nativeId);


/**
Returns the child item at (<tt>row</tt>, <tt>column</tt>) if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setChild(int, com.trolltech.qt.gui.QStandardItem) setChild()}, {@link com.trolltech.qt.gui.QStandardItem#takeChild(int) takeChild()}, and {@link com.trolltech.qt.gui.QStandardItem#parent() parent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem child(int row) {
        return child(row, (int)0);
    }
/**
Returns the child item at (<tt>row</tt>, <tt>column</tt>) if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setChild(int, com.trolltech.qt.gui.QStandardItem) setChild()}, {@link com.trolltech.qt.gui.QStandardItem#takeChild(int) takeChild()}, and {@link com.trolltech.qt.gui.QStandardItem#parent() parent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem child(int row, int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_child_int_int(long __this__nativeId, int row, int column);

/**
Returns the column where the item is located in its parent's child table, or -1 if the item has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#row() row()}, and {@link com.trolltech.qt.gui.QStandardItem#parent() parent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int column()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_column(nativeId());
    }
    @QtBlockedSlot
    native int __qt_column(long __this__nativeId);

/**
Returns the number of child item columns that the item has. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setColumnCount(int) setColumnCount()}, and {@link com.trolltech.qt.gui.QStandardItem#rowCount() rowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnCount(long __this__nativeId);

/**
Causes the model associated with this item to emit a {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged }() signal for this item. <p>You normally only need to call this function if you have subclassed QStandardItem and reimplemented {@link com.trolltech.qt.gui.QStandardItem#data() data()} and/or {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void emitDataChanged()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_emitDataChanged(nativeId());
    }
    @QtBlockedSlot
    native void __qt_emitDataChanged(long __this__nativeId);

/**
Returns the item flags for the item. <p>The item flags determine how the user can interact with the item. <p>By default, items are enabled, editable, selectable, checkable, and can be used both as the source of a drag and drop operation and as a drop target. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ItemFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
Returns the font used to render the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the brush used to render the item's foreground (e. . text). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QStandardItem#background() background()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush foreground()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_foreground(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_foreground(long __this__nativeId);

/**
Returns true if this item has any children; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#rowCount() rowCount()}, {@link com.trolltech.qt.gui.QStandardItem#columnCount() columnCount()}, and {@link com.trolltech.qt.gui.QStandardItem#child(int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasChildren()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildren(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasChildren(long __this__nativeId);

/**
Returns the item's icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
Returns the QModelIndex associated with this item. <p>When you need to invoke item functionality in a QModelIndex-based API (e.g. {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}), you can call this function to obtain an index that corresponds to the item's location in the model. <p>If the item is not associated with a model, an invalid QModelIndex is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#model() model()}, and {@link com.trolltech.qt.gui.QStandardItemModel#itemFromIndex(com.trolltech.qt.core.QModelIndex) QStandardItemModel::itemFromIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index(long __this__nativeId);

/**
Inserts a column at <tt>column</tt> containing <tt>items</tt>. If necessary, the row count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertColumns(int, int) insertColumns()}, and {@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertColumn(int column, java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
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
Inserts <tt>count</tt> columns of child items at column <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}, and {@link com.trolltech.qt.gui.QStandardItem#insertRows(int, java.util.List) insertRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertColumns(int column, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertColumns_int_int(nativeId(), column, count);
    }
    @QtBlockedSlot
    native void __qt_insertColumns_int_int(long __this__nativeId, int column, int count);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a row at <tt>row</tt> containing <tt>item</tt>. <p>When building a list or a tree that has only one column, this function provides a convenient way to insert a single new item.
*/

    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QStandardItem item)    {
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
Inserts a row at <tt>row</tt> containing <tt>items</tt>. If necessary, the column count is increased to the size of <tt>items</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertRows(int, java.util.List) insertRows()}, and {@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertRow(int row, java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
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
Inserts <tt>items</tt> at <tt>row</tt>. The column count wont be changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}, and {@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertRows(int row, java.util.List<com.trolltech.qt.gui.QStandardItem> items)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRows_int_List(nativeId(), row, items);
    }
    @QtBlockedSlot
    native void __qt_insertRows_int_List(long __this__nativeId, int row, java.util.List<com.trolltech.qt.gui.QStandardItem> items);

/**
Inserts <tt>count</tt> rows of child items at row <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}, and {@link com.trolltech.qt.gui.QStandardItem#insertColumns(int, int) insertColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertRows(int row, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRows_int_int(nativeId(), row, count);
    }
    @QtBlockedSlot
    native void __qt_insertRows_int_int(long __this__nativeId, int row, int count);

/**
Returns whether the item is user-checkable. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setCheckable(boolean) setCheckable()}, {@link com.trolltech.qt.gui.QStandardItem#checkState() checkState()}, and {@link com.trolltech.qt.gui.QStandardItem#isTristate() isTristate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCheckable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCheckable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCheckable(long __this__nativeId);

/**
Returns whether the item is drag enabled. An item that is drag enabled can be dragged by the user. <p>The default value is true. <p>Note that item dragging must be enabled in the view for dragging to work; see {@link QAbstractItemView#dragEnabled() QAbstractItemView::dragEnabled}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setDragEnabled(boolean) setDragEnabled()}, {@link com.trolltech.qt.gui.QStandardItem#isDropEnabled() isDropEnabled()}, and {@link com.trolltech.qt.gui.QStandardItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDragEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDragEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDragEnabled(long __this__nativeId);

/**
Returns whether the item is drop enabled. When an item is drop enabled, it can be used as a drop target. <p>The default value is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setDropEnabled(boolean) setDropEnabled()}, {@link com.trolltech.qt.gui.QStandardItem#isDragEnabled() isDragEnabled()}, and {@link com.trolltech.qt.gui.QStandardItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDropEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDropEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDropEnabled(long __this__nativeId);

/**
Returns whether the item can be edited by the user. <p>When an item is editable (and enabled), the user can edit the item by invoking one of the view's edit triggers; see {@link QAbstractItemView#editTriggers() QAbstractItemView::editTriggers}. <p>The default value is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setEditable(boolean) setEditable()}, and {@link com.trolltech.qt.gui.QStandardItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEditable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEditable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEditable(long __this__nativeId);

/**
Returns whether the item is enabled. <p>When an item is enabled, the user can interact with it. The possible types of interaction are specified by the other item flags, such as {@link com.trolltech.qt.gui.QStandardItem#isEditable() isEditable()} and {@link com.trolltech.qt.gui.QStandardItem#isSelectable() isSelectable()}. <p>The default value is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setEnabled(boolean) setEnabled()}, and {@link com.trolltech.qt.gui.QStandardItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
Returns whether the item is selectable by the user. <p>The default value is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setSelectable(boolean) setSelectable()}, and {@link com.trolltech.qt.gui.QStandardItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSelectable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelectable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelectable(long __this__nativeId);

/**
Returns whether the item is tristate; that is, if it's checkable with three separate states. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setTristate(boolean) setTristate()}, {@link com.trolltech.qt.gui.QStandardItem#isCheckable() isCheckable()}, and {@link com.trolltech.qt.gui.QStandardItem#checkState() checkState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTristate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTristate(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTristate(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel} that this item belongs to. <p>If the item is not a child of another item that belongs to the model, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#index() index()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItemModel model()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItemModel __qt_model(long __this__nativeId);

/**
<brief>Writes thisQStandardItem
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long out);

/**
<brief>Reads a QStandardItem
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long in);

/**
Returns the item's parent item, or 0 if the item has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#child(int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem parent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_parent(long __this__nativeId);

/**
Removes the given <tt>column</tt>. The items that were in the column are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}, {@link com.trolltech.qt.gui.QStandardItem#removeColumns(int, int) removeColumns()}, and {@link com.trolltech.qt.gui.QStandardItem#removeRow(int) removeRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeColumn(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_removeColumn_int(long __this__nativeId, int column);

/**
Removes <tt>count</tt> columns at column <tt>column</tt>. The items that were in those columns are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#removeColumn(int) removeColumn()}, and {@link com.trolltech.qt.gui.QStandardItem#removeRows(int, int) removeRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeColumns(int column, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeColumns_int_int(nativeId(), column, count);
    }
    @QtBlockedSlot
    native void __qt_removeColumns_int_int(long __this__nativeId, int column, int count);

/**
Removes the given <tt>row</tt>. The items that were in the row are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()}, {@link com.trolltech.qt.gui.QStandardItem#removeRows(int, int) removeRows()}, and {@link com.trolltech.qt.gui.QStandardItem#removeColumn(int) removeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeRow(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native void __qt_removeRow_int(long __this__nativeId, int row);

/**
Removes <tt>count</tt> rows at row <tt>row</tt>. The items that were in those rows are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#removeRow(int) removeRow()}, and {@link com.trolltech.qt.gui.QStandardItem#removeColumn(int) removeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeRows(int row, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeRows_int_int(nativeId(), row, count);
    }
    @QtBlockedSlot
    native void __qt_removeRows_int_int(long __this__nativeId, int row, int count);

/**
Returns the row where the item is located in its parent's child table, or -1 if the item has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#column() column()}, and {@link com.trolltech.qt.gui.QStandardItem#parent() parent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int row()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_row(nativeId());
    }
    @QtBlockedSlot
    native int __qt_row(long __this__nativeId);

/**
Returns the number of child item rows that the item has. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setRowCount(int) setRowCount()}, and {@link com.trolltech.qt.gui.QStandardItem#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rowCount(long __this__nativeId);

/**
Sets the item's accessible description to the string specified by <tt>accessibleDescription</tt>. <p>The accessible description is used by assistive technologies (i.e. for users who cannot use conventional means of interaction). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#accessibleDescription() accessibleDescription()}, and {@link com.trolltech.qt.gui.QStandardItem#setAccessibleText(java.lang.String) setAccessibleText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAccessibleDescription(java.lang.String accessibleDescription)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccessibleDescription_String(nativeId(), accessibleDescription);
    }
    @QtBlockedSlot
    native void __qt_setAccessibleDescription_String(long __this__nativeId, java.lang.String accessibleDescription);

/**
Sets the item's accessible text to the string specified by <tt>accessibleText</tt>. <p>The accessible text is used by assistive technologies (i.e. for users who cannot use conventional means of interaction). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#accessibleText() accessibleText()}, and {@link com.trolltech.qt.gui.QStandardItem#setAccessibleDescription(java.lang.String) setAccessibleDescription()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAccessibleText(java.lang.String accessibleText)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccessibleText_String(nativeId(), accessibleText);
    }
    @QtBlockedSlot
    native void __qt_setAccessibleText_String(long __this__nativeId, java.lang.String accessibleText);

/**
Sets the item's background brush to the specified <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#background() background()}, and {@link com.trolltech.qt.gui.QStandardItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_QBrush(long __this__nativeId, long brush);

/**
Sets the check state of the item to be <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#checkState() checkState()}, and {@link com.trolltech.qt.gui.QStandardItem#setCheckable(boolean) setCheckable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckState(com.trolltech.qt.core.Qt.CheckState checkState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckState_CheckState(nativeId(), checkState.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckState_CheckState(long __this__nativeId, int checkState);

/**
Sets whether the item is user-checkable. If <tt>checkable</tt> is true, the item can be checked by the user; otherwise, the user cannot check the item. <p>The item delegate will render a checkable item with a check box next to the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isCheckable() isCheckable()}, {@link com.trolltech.qt.gui.QStandardItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.gui.QStandardItem#setTristate(boolean) setTristate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckable(boolean checkable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckable_boolean(nativeId(), checkable);
    }
    @QtBlockedSlot
    native void __qt_setCheckable_boolean(long __this__nativeId, boolean checkable);

/**
This is an overloaded member function, provided for convenience. <p>Sets the child at <tt>row</tt> to <tt>item</tt>.
*/

    @QtBlockedSlot
    public final void setChild(int row, com.trolltech.qt.gui.QStandardItem item)    {
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChild_int_QStandardItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setChild_int_QStandardItem(long __this__nativeId, int row, long item);

/**
Sets the child item at (<tt>row</tt>, <tt>column</tt>) to <tt>item</tt>. This item (the parent item) takes ownership of <tt>item</tt>. If necessary, the row count and column count are increased to fit the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#child(int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setChild(int row, int column, com.trolltech.qt.gui.QStandardItem item)    {
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChild_int_int_QStandardItem(nativeId(), row, column, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setChild_int_int_QStandardItem(long __this__nativeId, int row, int column, long item);

/**
Sets the number of child item columns to <tt>columns</tt>. If this is less than {@link com.trolltech.qt.gui.QStandardItem#columnCount() columnCount()}, the data in the unwanted columns is discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#columnCount() columnCount()}, and {@link com.trolltech.qt.gui.QStandardItem#setRowCount(int) setRowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnCount(int columns)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnCount_int(nativeId(), columns);
    }
    @QtBlockedSlot
    native void __qt_setColumnCount_int(long __this__nativeId, int columns);

/**
Sets whether the item is drag enabled. If <tt>dragEnabled</tt> is true, the item can be dragged by the user; otherwise, the user cannot drag the item. <p>Note that you also need to ensure that item dragging is enabled in the view; see {@link QAbstractItemView#dragEnabled() QAbstractItemView::dragEnabled}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isDragEnabled() isDragEnabled()}, {@link com.trolltech.qt.gui.QStandardItem#setDropEnabled(boolean) setDropEnabled()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDragEnabled(boolean dragEnabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragEnabled_boolean(nativeId(), dragEnabled);
    }
    @QtBlockedSlot
    native void __qt_setDragEnabled_boolean(long __this__nativeId, boolean dragEnabled);

/**
Sets whether the item is drop enabled. If <tt>dropEnabled</tt> is true, the item can be used as a drop target; otherwise, it cannot. <p>Note that you also need to ensure that drops are enabled in the view; see {@link QWidget#acceptDrops() QWidget::acceptDrops()}; and that the model supports the desired drop actions; see {@link com.trolltech.qt.core.QAbstractItemModel#supportedDropActions() QAbstractItemModel::supportedDropActions()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isDropEnabled() isDropEnabled()}, {@link com.trolltech.qt.gui.QStandardItem#setDragEnabled(boolean) setDragEnabled()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDropEnabled(boolean dropEnabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDropEnabled_boolean(nativeId(), dropEnabled);
    }
    @QtBlockedSlot
    native void __qt_setDropEnabled_boolean(long __this__nativeId, boolean dropEnabled);

/**
Sets whether the item is editable. If <tt>editable</tt> is true, the item can be edited by the user; otherwise, the user cannot edit the item. <p>How the user can edit items in a view is determined by the view's edit triggers; see {@link QAbstractItemView#editTriggers() QAbstractItemView::editTriggers}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isEditable() isEditable()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEditable(boolean editable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditable_boolean(nativeId(), editable);
    }
    @QtBlockedSlot
    native void __qt_setEditable_boolean(long __this__nativeId, boolean editable);

/**
Sets whether the item is enabled. If <tt>enabled</tt> is true, the item is enabled, meaning that the user can interact with the item; if <tt>enabled</tt> is false, the user cannot interact with the item. <p>This flag takes presedence over the other item flags; e.g. if an item is not enabled, it cannot be selected by the user, even if the {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsSelectable } flag has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isEnabled() isEnabled()}, {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsEnabled }, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnabled(boolean enabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean enabled);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.Qt.ItemFlag ... flags) {
        this.setFlags(new com.trolltech.qt.core.Qt.ItemFlags(flags));
    }
/**
Sets the item flags for the item to <tt>flags</tt>. <p>The item flags determine how the user can interact with the item. This is often used to disable an item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#flags() flags()}, and {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.Qt.ItemFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_ItemFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_ItemFlags(long __this__nativeId, int flags);

/**
Sets the font used to display the item's text to the given <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#font() font()}, {@link com.trolltech.qt.gui.QStandardItem#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QStandardItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
Sets the brush used to display the item's foreground (e. . text) to the given <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#foreground() foreground()}, {@link com.trolltech.qt.gui.QStandardItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and {@link com.trolltech.qt.gui.QStandardItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForeground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForeground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setForeground_QBrush(long __this__nativeId, long brush);

/**
Sets the item's icon to the <tt>icon</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#icon() icon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
Sets the number of child item rows to <tt>rows</tt>. If this is less than {@link com.trolltech.qt.gui.QStandardItem#rowCount() rowCount()}, the data in the unwanted rows is discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#rowCount() rowCount()}, and {@link com.trolltech.qt.gui.QStandardItem#setColumnCount(int) setColumnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowCount(int rows)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowCount_int(nativeId(), rows);
    }
    @QtBlockedSlot
    native void __qt_setRowCount_int(long __this__nativeId, int rows);

/**
Sets whether the item is selectable. If <tt>selectable</tt> is true, the item can be selected by the user; otherwise, the user cannot select the item. <p>You can control the selection behavior and mode by manipulating their view properties; see {@link QAbstractItemView#selectionMode() QAbstractItemView::selectionMode} and {@link QAbstractItemView#selectionBehavior() QAbstractItemView::selectionBehavior}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isSelectable() isSelectable()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelectable(boolean selectable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectable_boolean(nativeId(), selectable);
    }
    @QtBlockedSlot
    native void __qt_setSelectable_boolean(long __this__nativeId, boolean selectable);

/**
Sets the size hint for the item to be <tt>size</tt>. If no size hint is set, the item delegate will compute the size hint based on the item data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#sizeHint() sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizeHint(com.trolltech.qt.core.QSize sizeHint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeHint_QSize(nativeId(), sizeHint == null ? 0 : sizeHint.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizeHint_QSize(long __this__nativeId, long sizeHint);

/**
Sets the item's status tip to the string specified by <tt>statusTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#statusTip() statusTip()}, {@link com.trolltech.qt.gui.QStandardItem#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QStandardItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusTip(java.lang.String statusTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_String(nativeId(), statusTip);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_String(long __this__nativeId, java.lang.String statusTip);

/**
Sets the item's text to the <tt>text</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#text() text()}, {@link com.trolltech.qt.gui.QStandardItem#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QStandardItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... textAlignment) {
        this.setTextAlignment(new com.trolltech.qt.core.Qt.Alignment(textAlignment));
    }
/**
Sets the text alignment for the item's text to the <tt>alignment</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#textAlignment() textAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.Alignment textAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextAlignment_Alignment(nativeId(), textAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setTextAlignment_Alignment(long __this__nativeId, int textAlignment);

/**
Sets the item's tooltip to the string specified by <tt>toolTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#toolTip() toolTip()}, {@link com.trolltech.qt.gui.QStandardItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QStandardItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolTip(java.lang.String toolTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), toolTip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String toolTip);

/**
Sets whether the item is tristate. If <tt>tristate</tt> is true, the item is checkable with three separate states; otherwise, the item is checkable with two states. (Note that this also requires that the item is checkable; see {@link com.trolltech.qt.gui.QStandardItem#isCheckable() isCheckable()}.) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#isTristate() isTristate()}, {@link com.trolltech.qt.gui.QStandardItem#setCheckable(boolean) setCheckable()}, and {@link com.trolltech.qt.gui.QStandardItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTristate(boolean tristate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTristate_boolean(nativeId(), tristate);
    }
    @QtBlockedSlot
    native void __qt_setTristate_boolean(long __this__nativeId, boolean tristate);

/**
Sets the item's "What's This?" help to the string specified by <tt>whatsThis</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#whatsThis() whatsThis()}, {@link com.trolltech.qt.gui.QStandardItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QStandardItem#setToolTip(java.lang.String) setToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String whatsThis)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), whatsThis);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String whatsThis);

/**
Returns the size hint set for the item, or an invalid {@link com.trolltech.qt.core.QSize QSize} if no size hint has been set. <p>If no size hint has been set, the item delegate will compute the size hint based on the item data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setSizeHint(com.trolltech.qt.core.QSize) setSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeHint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);


/**
Sorts the children of the item using the given <tt>order</tt>, by the values in the given <tt>column</tt>. <p><b>Note:</b> This function is recursive, therefore it sorts the children of the item, its grandchildren, etc. <p><DT><b>See also:</b><br><DD>operator<(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sortChildren(int column) {
        sortChildren(column, com.trolltech.qt.core.Qt.SortOrder.AscendingOrder);
    }
/**
Sorts the children of the item using the given <tt>order</tt>, by the values in the given <tt>column</tt>. <p><b>Note:</b> This function is recursive, therefore it sorts the children of the item, its grandchildren, etc. <p><DT><b>See also:</b><br><DD>operator<(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sortChildren(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortChildren_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sortChildren_int_SortOrder(long __this__nativeId, int column, int order);

/**
Returns the item's status tip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setStatusTip(java.lang.String) setStatusTip()}, {@link com.trolltech.qt.gui.QStandardItem#toolTip() toolTip()}, and {@link com.trolltech.qt.gui.QStandardItem#whatsThis() whatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String statusTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip(long __this__nativeId);


/**
Removes the child item at (<tt>row</tt>, <tt>column</tt>) without deleting it, and returns a pointer to the item. If there was no child at the given location, then this function returns 0. <p>Note that this function, unlike {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()} and {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}, does not affect the dimensions of the child table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#child(int) child()}, {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()}, and {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeChild(int row) {
        return takeChild(row, (int)0);
    }
/**
Removes the child item at (<tt>row</tt>, <tt>column</tt>) without deleting it, and returns a pointer to the item. If there was no child at the given location, then this function returns 0. <p>Note that this function, unlike {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()} and {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}, does not affect the dimensions of the child table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#child(int) child()}, {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()}, and {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStandardItem takeChild(int row, int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QStandardItem __qt_return_value = __qt_takeChild_int_int(nativeId(), row, column);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_takeChild_int_int(long __this__nativeId, int row, int column);

/**
Removes <tt>column</tt> without deleting the column items, and returns a list of pointers to the removed items. For items in the column that have not been set, the corresponding pointers in the list will be 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#removeColumn(int) removeColumn()}, {@link com.trolltech.qt.gui.QStandardItem#insertColumn(int, java.util.List) insertColumn()}, and {@link com.trolltech.qt.gui.QStandardItem#takeRow(int) takeRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> takeColumn(int column)    {
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
Removes <tt>row</tt> without deleting the row items, and returns a list of pointers to the removed items. For items in the row that have not been set, the corresponding pointers in the list will be 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#removeRow(int) removeRow()}, {@link com.trolltech.qt.gui.QStandardItem#insertRow(int, com.trolltech.qt.gui.QStandardItem) insertRow()}, and {@link com.trolltech.qt.gui.QStandardItem#takeColumn(int) takeColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QStandardItem> takeRow(int row)    {
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
Returns the item's text. This is the text that's presented to the user in a view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Returns the text alignment for the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setTextAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setTextAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment textAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_textAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textAlignment(long __this__nativeId);

/**
Returns the item's tooltip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setToolTip(java.lang.String) setToolTip()}, {@link com.trolltech.qt.gui.QStandardItem#statusTip() statusTip()}, and {@link com.trolltech.qt.gui.QStandardItem#whatsThis() whatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
Returns the item's "What's This?" help. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setWhatsThis(java.lang.String) setWhatsThis()}, {@link com.trolltech.qt.gui.QStandardItem#toolTip() toolTip()}, and {@link com.trolltech.qt.gui.QStandardItem#statusTip() statusTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QStandardItem clone()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStandardItem __qt_clone(long __this__nativeId);


/**
Returns the item's data for the given <tt>role</tt>, or an invalid {@link com.trolltech.qt.QVariant QVariant} if there is no data for the role. <p><b>Note:</b> The default implementation treats {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } as referring to the same data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data() {
        return data((int)33);
    }
/**
Returns the item's data for the given <tt>role</tt>, or an invalid {@link com.trolltech.qt.QVariant QVariant} if there is no data for the role. <p><b>Note:</b> The default implementation treats {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } as referring to the same data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object data(int role)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_int(nativeId(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_int(long __this__nativeId, int role);

/**
Returns true if this item is less than <tt>other</tt>; otherwise returns false. <p>The default implementation uses the data for the item's sort role (see {@link QStandardItemModel#sortRole() QStandardItemModel::sortRole}) to perform the comparison if the item belongs to a model; otherwise, the data for the item's {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } ({@link com.trolltech.qt.gui.QStandardItem#text() text()}) is used to perform the comparison. <p>{@link com.trolltech.qt.gui.QStandardItem#sortChildren(int) sortChildren()} and {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) QStandardItemModel::sort()} use this function when sorting items. If you want custom sorting, you can subclass QStandardItem and reimplement this function.
*/

    @QtBlockedSlot
    public boolean operator_less(com.trolltech.qt.gui.QStandardItem other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QStandardItem(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QStandardItem(long __this__nativeId, long other);

/**
Reads the item from stream <tt>in</tt>. Only the data and flags of the item are read, not the child items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#write(com.trolltech.qt.core.QDataStream) write()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void read(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_read_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_read_QDataStream(long __this__nativeId, long in);


/**
Sets the item's data for the given <tt>role</tt> to the specified <tt>value</tt>. <p>If you subclass QStandardItem and reimplement this function, your reimplementation should call {@link com.trolltech.qt.gui.QStandardItem#emitDataChanged() emitDataChanged()} if you do not call the base implementation of {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. This will ensure that e.g. views using the model are notified of the changes. <p><b>Note:</b> The default implementation treats {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } as referring to the same data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.gui.QStandardItem#data() data()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(java.lang.Object value) {
        setData(value, (int)33);
    }
/**
Sets the item's data for the given <tt>role</tt> to the specified <tt>value</tt>. <p>If you subclass QStandardItem and reimplement this function, your reimplementation should call {@link com.trolltech.qt.gui.QStandardItem#emitDataChanged() emitDataChanged()} if you do not call the base implementation of {@link com.trolltech.qt.gui.QStandardItem#setData(java.lang.Object) setData()}. This will ensure that e.g. views using the model are notified of the changes. <p><b>Note:</b> The default implementation treats {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } as referring to the same data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, {@link com.trolltech.qt.gui.QStandardItem#data() data()}, and {@link com.trolltech.qt.gui.QStandardItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setData(java.lang.Object value, int role)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_Object_int(nativeId(), value, role);
    }
    @QtBlockedSlot
    native void __qt_setData_Object_int(long __this__nativeId, java.lang.Object value, int role);

/**
Returns the type of this item. The type is used to distinguish custom items from the base class. When subclassing QStandardItem, you should reimplement this function and return a new value greater than or equal to {@link com.trolltech.qt.gui.QStandardItem.ItemType UserType }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem.ItemType QStandardItem::Type }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Writes the item to stream <tt>out</tt>. Only the data and flags of the item are written, not the child items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItem#read(com.trolltech.qt.core.QDataStream) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void write(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_write_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_write_QDataStream(long __this__nativeId, long out);

/**
@exclude
*/

    public static native QStandardItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStandardItem(QPrivateConstructor p) { super(p); } 
}
