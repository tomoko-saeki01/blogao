package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTreeWidgetItem class provides an item for use with the {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} convenience class. Tree widget items are used to hold rows of information for tree widgets. Rows usually contain several columns of data, each of which can contain a text label and an icon. <p>The QTreeWidgetItem class is a convenience class that replaces the QListViewItem class in Qt 3. It provides an item for use with the {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} class. <p>Items are usually constructed with a parent that is either a {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} (for top-level items) or a QTreeWidgetItem (for items on lower levels of the tree). For example, the following code constructs a top-level item to represent cities of the world, and adds a entry for Oslo as a child item: <pre class="snippet">
        QTreeWidgetItem cities = new QTreeWidgetItem(treeWidget);
        cities.setText(0, tr("Cities"));
        QTreeWidgetItem osloItem = new QTreeWidgetItem(cities);
        osloItem.setText(0, tr("Oslo"));
        osloItem.setText(1, tr("Yes"));
    </pre> Items can be added in a particular order by specifying the item they follow when they are constructed: <pre class="snippet">
        QTreeWidgetItem planets = new QTreeWidgetItem(treeWidget, cities);
    
        planets.setText(0, tr("Planets"));
    </pre> Each column in an item can have its own background brush which is set with the {@link com.trolltech.qt.gui.QTreeWidgetItem#setBackground(int, com.trolltech.qt.gui.QBrush) setBackground()} function. The current background brush can be found with {@link com.trolltech.qt.gui.QTreeWidgetItem#background(int) background()}. The text label for each column can be rendered with its own font and brush. These are specified with the {@link com.trolltech.qt.gui.QTreeWidgetItem#setFont(int, com.trolltech.qt.gui.QFont) setFont()} and {@link com.trolltech.qt.gui.QTreeWidgetItem#setForeground(int, com.trolltech.qt.gui.QBrush) setForeground()} functions, and read with {@link com.trolltech.qt.gui.QTreeWidgetItem#font(int) font()} and {@link com.trolltech.qt.gui.QTreeWidgetItem#foreground(int) foreground()}. <p>The main difference between top-level items and those in lower levels of the tree is that a top-level item has no {@link com.trolltech.qt.gui.QTreeWidgetItem#parent() parent()}. This information can be used to tell the difference between items, and is useful to know when inserting and removing items from the tree. Children of an item can be removed with {@link com.trolltech.qt.gui.QTreeWidgetItem#takeChild(int) takeChild()} and inserted at a given index in the list of children with the {@link com.trolltech.qt.gui.QTreeWidgetItem#insertChild(int, com.trolltech.qt.gui.QTreeWidgetItem) insertChild()} function. <p>By default, items are enabled, selectable, checkable, and can be the source of a drag and drop operation. Each item's flags can be changed by calling {@link com.trolltech.qt.gui.QTreeWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()} with the appropriate value (see Qt::ItemFlags). Checkable items can be checked and unchecked with the {@link com.trolltech.qt.gui.QTreeWidgetItem#setCheckState(int, com.trolltech.qt.core.Qt.CheckState) setCheckState()} function. The corresponding {@link com.trolltech.qt.gui.QTreeWidgetItem#checkState(int) checkState()} function indicates whether the item is currently checked.<a name="subclassing"><h2>Subclassing</h2> When subclassing QTreeWidgetItem to provide custom items, it is possible to define new types for them so that they can be distinguished from standard items. The constructors for subclasses that require this feature need to call the base class constructor with a new type value equal to or greater than {@link com.trolltech.qt.gui.QTreeWidgetItem.ItemType UserType }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget QTreeWidget}, {@link com.trolltech.qt.gui.QTreeWidgetItemIterator QTreeWidgetItemIterator}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem}, and {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTreeWidgetItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types that are used to describe tree widget items. You can define new user types in {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem} subclasses to ensure that custom items are treated specially; for example, when items are sorted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public enum ItemType implements com.trolltech.qt.QtEnumerator {
/**
 The default type for tree widget items.
*/

        Type(0),
/**
 The minimum value for custom types. Values below {@link com.trolltech.qt.gui.QTreeWidgetItem.ItemType UserType } are reserved by Qt.
*/

        UserType(1000);

        ItemType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTreeWidgetItem$ItemType constant with the specified <tt>int</tt>.</brief>
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
    public enum ChildIndicatorPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The controls for expanding and collapsing will be shown for this item even if there are no children.
*/

        ShowIndicator(0),
/**
 The controls for expanding and collapsing will never be shown even if there are children. If the node is forced open the user will not be able to expand or collapse the item.
*/

        DontShowIndicator(1),
/**
 The controls for expanding and collapsing will be shown if the item contains children.
*/

        DontShowIndicatorWhenChildless(2);

        ChildIndicatorPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTreeWidgetItem$ChildIndicatorPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static ChildIndicatorPolicy resolve(int value) {
            return (ChildIndicatorPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ShowIndicator;
            case 1: return DontShowIndicator;
            case 2: return DontShowIndicatorWhenChildless;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view, com.trolltech.qt.gui.QTreeWidgetItem after) {
        this(view, after, (int)0);
    }
    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view, com.trolltech.qt.gui.QTreeWidgetItem after, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidget_QTreeWidgetItem_int(view == null ? 0 : view.nativeId(), after == null ? 0 : after.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidget_QTreeWidgetItem_int(long view, long after, int type);


    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view, java.util.List<java.lang.String> strings) {
        this(view, strings, (int)0);
    }
    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view, java.util.List<java.lang.String> strings, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidget_List_int(view == null ? 0 : view.nativeId(), strings, type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidget_List_int(long view, java.util.List<java.lang.String> strings, int type);


/**
Constructs a tree widget item of the specified <tt>type</tt> and appends it to the items in the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view) {
        this(view, (int)0);
    }
    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidget view, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidget_int(view == null ? 0 : view.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidget_int(long view, int type);


/**
Constructs a tree widget item of the specified <tt>type</tt> that is inserted into the <tt>parent</tt> after the <tt>preceding</tt> child item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

/**
Constructs a tree widget item of the specified <tt>type</tt> and inserts it into the given <tt>parent</tt> after the <tt>preceding</tt> item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent, com.trolltech.qt.gui.QTreeWidgetItem after) {
        this(parent, after, (int)0);
    }
/**
Constructs a tree widget item of the specified <tt>type</tt> that is inserted into the <tt>parent</tt> after the <tt>preceding</tt> child item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

/**
Constructs a tree widget item of the specified <tt>type</tt> and inserts it into the given <tt>parent</tt> after the <tt>preceding</tt> item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent, com.trolltech.qt.gui.QTreeWidgetItem after, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidgetItem_QTreeWidgetItem_int(parent == null ? 0 : parent.nativeId(), after == null ? 0 : after.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidgetItem_QTreeWidgetItem_int(long parent, long after, int type);


/**
Constructs a tree widget item and append it to the given <tt>parent</tt>. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

/**
Constructs a tree widget item of the specified <tt>type</tt> and appends it to the items in the given <tt>parent</tt>. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent, java.util.List<java.lang.String> strings) {
        this(parent, strings, (int)0);
    }
/**
Constructs a tree widget item and append it to the given <tt>parent</tt>. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

/**
Constructs a tree widget item of the specified <tt>type</tt> and appends it to the items in the given <tt>parent</tt>. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent, java.util.List<java.lang.String> strings, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidgetItem_List_int(parent == null ? 0 : parent.nativeId(), strings, type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidgetItem_List_int(long parent, java.util.List<java.lang.String> strings, int type);


/**
Constructs a tree widget item and append it to the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent) {
        this(parent, (int)0);
    }
/**
Constructs a tree widget item and append it to the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

/**
Constructs a tree widget item of the specified <tt>type</tt> and appends it to the items in the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(com.trolltech.qt.gui.QTreeWidgetItem parent, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_QTreeWidgetItem_int(parent == null ? 0 : parent.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QTreeWidgetItem_QTreeWidgetItem_int(long parent, int type);


/**
Constructs a tree widget item of the specified <tt>type</tt>. The item must be inserted into a tree widget. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(java.util.List<java.lang.String> strings) {
        this(strings, (int)0);
    }
/**
Constructs a tree widget item of the specified <tt>type</tt>. The item must be inserted into a tree widget. The given list of <tt>strings</tt> will be set as the item text for each column in the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(java.util.List<java.lang.String> strings, int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_List_int(strings, type);
    }

    native void __qt_QTreeWidgetItem_List_int(java.util.List<java.lang.String> strings, int type);


/**
Constructs a tree widget item of the specified <tt>type</tt>. The item must be inserted into a tree widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem() {
        this((int)0);
    }
/**
Constructs a tree widget item of the specified <tt>type</tt>. The item must be inserted into a tree widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTreeWidgetItem(int type){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItem_int(type);
    }

    native void __qt_QTreeWidgetItem_int(int type);

/**
Appends the <tt>child</tt> item to the list of children. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#insertChild(int, com.trolltech.qt.gui.QTreeWidgetItem) insertChild()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#takeChild(int) takeChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addChild(com.trolltech.qt.gui.QTreeWidgetItem child)    {
        if (child != null) {
            child.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addChild_QTreeWidgetItem(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addChild_QTreeWidgetItem(long __this__nativeId, long child);

/**
Appends the given list of <tt>children</tt> to the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#insertChildren(int, java.util.List) insertChildren()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#takeChildren() takeChildren()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addChildren(java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> children)    {
        if (children != null) {
            for (com.trolltech.qt.gui.QTreeWidgetItem i : children)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addChildren_List(nativeId(), children);
    }
    @QtBlockedSlot
    native void __qt_addChildren_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> children);

/**
Returns the brush used to render the background of the specified <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setBackground(int, com.trolltech.qt.gui.QBrush) setBackground()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#foreground(int) foreground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background_int(long __this__nativeId, int column);

/**
Returns the check state of the label in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setCheckState(int, com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CheckState checkState(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CheckState.resolve(__qt_checkState_int(nativeId(), column));
    }
    @QtBlockedSlot
    native int __qt_checkState_int(long __this__nativeId, int column);

/**
Returns the item at the given <tt>index</tt> in the list of the item's children. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#parent() parent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem child(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_child_int(long __this__nativeId, int index);

/**
Returns the number of child items.
*/

    @QtBlockedSlot
    public final int childCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_childCount(long __this__nativeId);

/**
Returns the item indicator policy. This policy decides when the tree branch expand/collapse indicator is shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setChildIndicatorPolicy(com.trolltech.qt.gui.QTreeWidgetItem.ChildIndicatorPolicy) setChildIndicatorPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem.ChildIndicatorPolicy childIndicatorPolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTreeWidgetItem.ChildIndicatorPolicy.resolve(__qt_childIndicatorPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_childIndicatorPolicy(long __this__nativeId);

/**
Returns the number of columns in the item.
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
Causes the model associated with this item to emit a {@link com.trolltech.qt.core.QAbstractItemModel#dataChanged dataChanged }() signal for this item. <p>You normally only need to call this function if you have subclassed QTreeWidgetItem and reimplemented {@link com.trolltech.qt.gui.QTreeWidgetItem#data(int, int) data()} and/or {@link com.trolltech.qt.gui.QTreeWidgetItem#setData(int, int, java.lang.Object) setData()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setData(int, int, java.lang.Object) setData()}. <br></DD></DT>
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
Returns the flags used to describe the item. These determine whether the item can be checked, edited, and selected. <p>The default value for flags is {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsSelectable } | {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsUserCheckable } | {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsEnabled } | {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsDragEnabled }. If the item was constructed with a parent, flags will in addition contain {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsDropEnabled }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
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
Returns the font used to render the text in the specified <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setFont(int, com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font_int(long __this__nativeId, int column);

/**
Returns the brush used to render the foreground (e. . text) of the specified <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setForeground(int, com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#background(int) background()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush foreground(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_foreground_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_foreground_int(long __this__nativeId, int column);

/**
Returns the icon that is displayed in the specified <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setIcon(int, com.trolltech.qt.gui.QIcon) setIcon()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon_int(long __this__nativeId, int column);

/**
Returns the index of the given <tt>child</tt> in the item's list of children.
*/

    @QtBlockedSlot
    public final int indexOfChild(com.trolltech.qt.gui.QTreeWidgetItem child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOfChild_QTreeWidgetItem(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOfChild_QTreeWidgetItem(long __this__nativeId, long child);

/**
Inserts the <tt>child</tt> item at <tt>index</tt> in the list of children. <p>If the child has already been inserted somewhere else it wont be inserted again.
*/

    @QtBlockedSlot
    public final void insertChild(int index, com.trolltech.qt.gui.QTreeWidgetItem child)    {
        if (child != null) {
            child.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertChild_int_QTreeWidgetItem(nativeId(), index, child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertChild_int_QTreeWidgetItem(long __this__nativeId, int index, long child);

/**
Inserts the given list of <tt>children</tt> into the list of the item children at <tt>index</tt> . <p>Children that have already been inserted somewhere else wont be inserted.
*/

    @QtBlockedSlot
    public final void insertChildren(int index, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> children)    {
        if (children != null) {
            for (com.trolltech.qt.gui.QTreeWidgetItem i : children)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertChildren_int_List(nativeId(), index, children);
    }
    @QtBlockedSlot
    native void __qt_insertChildren_int_List(long __this__nativeId, int index, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> children);

/**
Returns true if the item is disabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDisabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDisabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDisabled(long __this__nativeId);

/**
Returns true if the item is expanded, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setExpanded(boolean) setExpanded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isExpanded()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExpanded(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExpanded(long __this__nativeId);

/**
Returns true if the item is spanning all the columns in a row; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setFirstColumnSpanned(boolean) setFirstColumnSpanned()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFirstColumnSpanned()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFirstColumnSpanned(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFirstColumnSpanned(long __this__nativeId);

/**
Returns true if the item is hidden, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setHidden(boolean) setHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isHidden()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHidden(long __this__nativeId);

/**
Returns true if the item is selected, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setSelected(boolean) setSelected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSelected()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelected(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelected(long __this__nativeId);

/**
<brief>Writes thisQTreeWidgetItem
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
<brief>Reads a QTreeWidgetItem
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
Returns the item's parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#child(int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem parent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_parent(long __this__nativeId);

/**
Removes the given item indicated by <tt>child</tt>. The removed item will not be deleted.
*/

    @QtBlockedSlot
    public final void removeChild(com.trolltech.qt.gui.QTreeWidgetItem child)    {
        if (child != null) {
            child.reenableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeChild_QTreeWidgetItem(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeChild_QTreeWidgetItem(long __this__nativeId, long child);

/**
Sets the background brush of the label in the given <tt>column</tt> to the specified <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#background(int) background()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setForeground(int, com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackground(int column, com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_int_QBrush(nativeId(), column, brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_int_QBrush(long __this__nativeId, int column, long brush);

/**
Sets the item in the given <tt>column</tt> check state to be <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#checkState(int) checkState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckState(int column, com.trolltech.qt.core.Qt.CheckState state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckState_int_CheckState(nativeId(), column, state.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckState_int_CheckState(long __this__nativeId, int column, int state);

/**
Sets the item indicator <tt>policy</tt>. This policy decides when the tree branch expand/collapse indicator is shown. The default value is ShowForChildren. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#childIndicatorPolicy() childIndicatorPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setChildIndicatorPolicy(com.trolltech.qt.gui.QTreeWidgetItem.ChildIndicatorPolicy policy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChildIndicatorPolicy_ChildIndicatorPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setChildIndicatorPolicy_ChildIndicatorPolicy(long __this__nativeId, int policy);

/**
Disables the item if <tt>disabled</tt> is true; otherwise enables the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#isDisabled() isDisabled()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDisabled(boolean disabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisabled_boolean(nativeId(), disabled);
    }
    @QtBlockedSlot
    native void __qt_setDisabled_boolean(long __this__nativeId, boolean disabled);

/**
Expands the item if <tt>expand</tt> is true, otherwise collapses the item. <p><b>Warning:</b> The QTreeWidgetItem must be added to the {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} before calling this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#isExpanded() isExpanded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setExpanded(boolean expand)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpanded_boolean(nativeId(), expand);
    }
    @QtBlockedSlot
    native void __qt_setExpanded_boolean(long __this__nativeId, boolean expand);

/**
Sets the first section to span all columns if <tt>span</tt> is true; otherwise all item sections are shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#isFirstColumnSpanned() isFirstColumnSpanned()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFirstColumnSpanned(boolean span)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFirstColumnSpanned_boolean(nativeId(), span);
    }
    @QtBlockedSlot
    native void __qt_setFirstColumnSpanned_boolean(long __this__nativeId, boolean span);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.Qt.ItemFlag ... flags) {
        this.setFlags(new com.trolltech.qt.core.Qt.ItemFlags(flags));
    }
/**
Sets the flags for the item to the given <tt>flags</tt>. These determine whether the item can be selected or modified. This is often used to disable an item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#flags() flags()}. <br></DD></DT>
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
Sets the font used to display the text in the given <tt>column</tt> to the given <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#font(int) font()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setText(int, java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setForeground(int, com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(int column, com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_int_QFont(nativeId(), column, font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_int_QFont(long __this__nativeId, int column, long font);

/**
Sets the foreground brush of the label in the given <tt>column</tt> to the specified <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#foreground(int) foreground()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setBackground(int, com.trolltech.qt.gui.QBrush) setBackground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForeground(int column, com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForeground_int_QBrush(nativeId(), column, brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setForeground_int_QBrush(long __this__nativeId, int column, long brush);

/**
Hides the item if <tt>hide</tt> is true, otherwise shows the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#isHidden() isHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHidden(boolean hide)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHidden_boolean(nativeId(), hide);
    }
    @QtBlockedSlot
    native void __qt_setHidden_boolean(long __this__nativeId, boolean hide);

/**
Sets the icon to be displayed in the given <tt>column</tt> to <tt>icon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#icon(int) icon()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setText(int, java.lang.String) setText()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIcon(int column, com.trolltech.qt.gui.QIcon icon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_int_QIcon(nativeId(), column, icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_int_QIcon(long __this__nativeId, int column, long icon);

/**
Sets the selected state of the item to <tt>select</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#isSelected() isSelected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelected(boolean select)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelected_boolean(nativeId(), select);
    }
    @QtBlockedSlot
    native void __qt_setSelected_boolean(long __this__nativeId, boolean select);

/**
Sets the size hint for the tree item in the given <tt>column</tt> to be <tt>size</tt>. If no size hint is set, the item delegate will compute the size hint based on the item data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#sizeHint(int) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizeHint(int column, com.trolltech.qt.core.QSize size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeHint_int_QSize(nativeId(), column, size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizeHint_int_QSize(long __this__nativeId, int column, long size);

/**
Sets the status tip for the given <tt>column</tt> to the given <tt>statusTip</tt>. {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} mouse tracking needs to be enabled for this feature to work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#statusTip(int) statusTip()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setToolTip(int, java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setWhatsThis(int, java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusTip(int column, java.lang.String statusTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_int_String(nativeId(), column, statusTip);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_int_String(long __this__nativeId, int column, java.lang.String statusTip);

/**
Sets the text to be displayed in the given <tt>column</tt> to the given <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#text(int) text()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setFont(int, com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setForeground(int, com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(int column, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_int_String(nativeId(), column, text);
    }
    @QtBlockedSlot
    native void __qt_setText_int_String(long __this__nativeId, int column, java.lang.String text);

/**
Sets the text alignment for the label in the given <tt>column</tt> to the <tt>alignment</tt> specified (see {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#textAlignment(int) textAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextAlignment(int column, int alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextAlignment_int_int(nativeId(), column, alignment);
    }
    @QtBlockedSlot
    native void __qt_setTextAlignment_int_int(long __this__nativeId, int column, int alignment);

/**
Sets the tooltip for the given <tt>column</tt> to <tt>toolTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#toolTip(int) toolTip()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setStatusTip(int, java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setWhatsThis(int, java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolTip(int column, java.lang.String toolTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_int_String(nativeId(), column, toolTip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_int_String(long __this__nativeId, int column, java.lang.String toolTip);

/**
Sets the "What's This?" help for the given <tt>column</tt> to <tt>whatsThis</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#whatsThis(int) whatsThis()}, {@link com.trolltech.qt.gui.QTreeWidgetItem#setStatusTip(int, java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QTreeWidgetItem#setToolTip(int, java.lang.String) setToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWhatsThis(int column, java.lang.String whatsThis)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_int_String(nativeId(), column, whatsThis);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_int_String(long __this__nativeId, int column, java.lang.String whatsThis);

/**
Returns the size hint set for the tree item in the given <tt>column</tt> (see {@link com.trolltech.qt.core.QSize QSize}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setSizeHint(int, com.trolltech.qt.core.QSize) setSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeHint(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint_int(long __this__nativeId, int column);

/**
Sorts the children of the item using the given <tt>order</tt>, by the values in the given <tt>column</tt>. <p><b>Note:</b> This function does nothing if the item is not associated with a {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget}.
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
Returns the status tip for the contents of the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setStatusTip(int, java.lang.String) setStatusTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String statusTip(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip_int(nativeId(), column);
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip_int(long __this__nativeId, int column);

/**
Removes the item at <tt>index</tt> and returns it, otherwise return 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem takeChild(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QTreeWidgetItem __qt_return_value = __qt_takeChild_int(nativeId(), index);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_takeChild_int(long __this__nativeId, int index);

/**
Removes the list of children and returns it, otherwise returns an empty list.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> takeChildren()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> __qt_return_value = __qt_takeChildren(nativeId());
        if (__qt_return_value != null) {
        for (com.trolltech.qt.gui.QTreeWidgetItem i : __qt_return_value)
            if (i != null) i.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> __qt_takeChildren(long __this__nativeId);

/**
Returns the text in the specified <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setText(int, java.lang.String) setText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_int(nativeId(), column);
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_int(long __this__nativeId, int column);

/**
Returns the text alignment for the label in the given <tt>column</tt> (see {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setTextAlignment(int, int) setTextAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int textAlignment(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textAlignment_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_textAlignment_int(long __this__nativeId, int column);

/**
Returns the tool tip for the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setToolTip(int, java.lang.String) setToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toolTip(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip_int(nativeId(), column);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip_int(long __this__nativeId, int column);

/**
Returns the tree widget that contains the item.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidget treeWidget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_treeWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidget __qt_treeWidget(long __this__nativeId);

/**
Returns the type passed to the QTreeWidgetItem constructor.
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the "What's This?" help for the contents of the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setWhatsThis(int, java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String whatsThis(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis_int(nativeId(), column);
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis_int(long __this__nativeId, int column);

/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QTreeWidgetItem clone()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_clone(long __this__nativeId);

/**
Returns the value for the item's <tt>column</tt> and <tt>role</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#setData(int, int, java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object data(int column, int role)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_int_int(nativeId(), column, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_int_int(long __this__nativeId, int column, int role);

/**
Returns true if the text in the item is less than the text in the <tt>other</tt> item, otherwise returns false.
*/

    @QtBlockedSlot
    public boolean operator_less(com.trolltech.qt.gui.QTreeWidgetItem other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTreeWidgetItem(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTreeWidgetItem(long __this__nativeId, long other);

/**
Reads the item from stream <tt>in</tt>. This only reads data into a single item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#write(com.trolltech.qt.core.QDataStream) write()}. <br></DD></DT>
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
Sets the value for the item's <tt>column</tt> and <tt>role</tt> to the given <tt>value</tt>. <p>The <tt>role</tt> describes the type of data specified by <tt>value</tt>, and is defined by the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole } enum. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#data(int, int) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setData(int column, int role, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_int_int_Object(nativeId(), column, role, value);
    }
    @QtBlockedSlot
    native void __qt_setData_int_int_Object(long __this__nativeId, int column, int role, java.lang.Object value);

/**
Writes the item to stream <tt>out</tt>. This only writes data from one single item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem#read(com.trolltech.qt.core.QDataStream) read()}. <br></DD></DT>
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

    public static native QTreeWidgetItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTreeWidgetItem(QPrivateConstructor p) { super(p); } 
}
