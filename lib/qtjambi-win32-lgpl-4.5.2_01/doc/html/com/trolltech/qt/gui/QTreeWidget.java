package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTreeWidget class provides a tree view that uses a predefined tree model. The QTreeWidget class is a convenience class that provides a standard tree widget with a classic item-based interface similar to that used by the {@link com.trolltech.qt.gui.QListView QListView} class in Qt 3. This class is based on Qt's Model/View architecture and uses a default model to hold items, each of which is a {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}. <p>Developers who do not need the flexibility of the Model/View framework can use this class to create simple hierarchical lists very easily. A more flexible approach involves combining a {@link com.trolltech.qt.gui.QTreeView QTreeView} with a standard item model. This allows the storage of data to be separated from its representation. <p>In its simplest form, a tree widget can be constructed in the following way: <pre class="snippet">
        QTreeWidget treeWidget = new QTreeWidget();
        treeWidget.setColumnCount(1);
        List&lt;QTreeWidgetItem&gt; items = new ArrayList&lt;QTreeWidgetItem&gt;();
        for (int i = 0; i &lt; 10; ++i) {
            List&lt;String&gt; lst = new ArrayList&lt;String&gt;();
            lst.add("item: " + i);
            items.add(new QTreeWidgetItem((QTreeWidgetItem) null, lst));
        }
        treeWidget.insertTopLevelItems(0, items);
</pre> Before items can be added to the tree widget, the number of columns must be set with {@link com.trolltech.qt.gui.QTreeWidget#setColumnCount(int) setColumnCount()}. This allows each item to have one or more labels or other decorations. The number of columns in use can be found with the {@link com.trolltech.qt.gui.QTreeWidget#columnCount() columnCount()} function. <p>The tree can have a header that contains a section for each column in the widget. It is easiest to set up the labels for each section by supplying a list of strings with {@link com.trolltech.qt.gui.QTreeWidget#setHeaderLabels(java.util.List) setHeaderLabels()}, but a custom header can be constructed with a {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem} and inserted into the tree with the {@link com.trolltech.qt.gui.QTreeWidget#setHeaderItem(com.trolltech.qt.gui.QTreeWidgetItem) setHeaderItem()} function. <p>The items in the tree can be sorted by column according to a predefined sort order. If sorting is enabled, the user can sort the items by clicking on a column header. Sorting can be enabled or disabled by calling {@link QTreeView#setSortingEnabled(boolean) setSortingEnabled()}. The {@link QTreeView#isSortingEnabled() isSortingEnabled()} function indicates whether sorting is enabled. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-treeview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-treeview.png"></center><br></td><td>  <br><center><img src="../images/plastique-treeview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} tree widget.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} tree widget.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} tree widget.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}, {@link com.trolltech.qt.gui.QTreeWidgetItemIterator QTreeWidgetItemIterator}, {@link com.trolltech.qt.gui.QTreeView QTreeView}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link <a href="../tools-settingseditor.html">Settings Editor Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTreeWidget extends com.trolltech.qt.gui.QTreeView
{
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: current), com.trolltech.qt.gui.QTreeWidgetItem(named: previous)&gt;:<p> This signal is emitted when the current item changes. The current item is specified by <tt>current</tt>, and this replaces the <tt>previous</tt> current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem) setCurrentItem()}. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, com.trolltech.qt.gui.QTreeWidgetItem> currentItemChanged = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, com.trolltech.qt.gui.QTreeWidgetItem>();

    private final void currentItemChanged(com.trolltech.qt.gui.QTreeWidgetItem current, com.trolltech.qt.gui.QTreeWidgetItem previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentItemChanged_QTreeWidgetItem_QTreeWidgetItem(nativeId(), current == null ? 0 : current.nativeId(), previous == null ? 0 : previous.nativeId());
    }
    native void __qt_currentItemChanged_QTreeWidgetItem_QTreeWidgetItem(long __this__nativeId, long current, long previous);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the user activates an item by single- or double-clicking (depending on the platform, i. . on the {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ItemView_ActivateItemOnSingleClick } style hint) or pressing a special key (e.g., <b>Enter</b>). <p>The specified <tt>item</tt> is the item that was clicked, or 0 if no item was clicked. The <tt>column</tt> is the item's column that was clicked, or -1 if no item was clicked.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemActivated = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemActivated(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemActivated_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemActivated_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the contents of the <tt>column</tt> in the specified <tt>item</tt> changes.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemChanged = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemChanged(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemChanged_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemChanged_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the user clicks inside the widget. <p>The specified <tt>item</tt> is the item that was clicked. The <tt>column</tt> is the item's column that was clicked. If no item was clicked, no signal will be emitted.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemClicked = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemClicked(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemClicked_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemClicked_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item)&gt;:<p> This signal is emitted when the specified <tt>item</tt> is collapsed so that none of its children are displayed. <p><b>Note:</b> This signal will not be emitted if an item changes its state when {@link com.trolltech.qt.gui.QTreeView#collapseAll() collapseAll()} is invoked. <p><DT><b>See also:</b><br><DD>isItemExpanded(), {@link com.trolltech.qt.gui.QTreeWidget#itemExpanded itemExpanded() }, and {@link com.trolltech.qt.gui.QTreeWidget#collapseItem(com.trolltech.qt.gui.QTreeWidgetItem) collapseItem()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QTreeWidgetItem> itemCollapsed = new Signal1<com.trolltech.qt.gui.QTreeWidgetItem>();

    private final void itemCollapsed(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemCollapsed_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemCollapsed_QTreeWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the user double clicks inside the widget. <p>The specified <tt>item</tt> is the item that was clicked, or 0 if no item was clicked. The <tt>column</tt> is the item's column that was clicked. If no item was double clicked, no signal will be emitted.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemDoubleClicked = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemDoubleClicked(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemDoubleClicked_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemDoubleClicked_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the mouse cursor enters an <tt>item</tt> over the specified <tt>column</tt>. QTreeWidget mouse tracking needs to be enabled for this feature to work.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemEntered = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemEntered(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemEntered_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemEntered_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item)&gt;:<p> This signal is emitted when the specified <tt>item</tt> is expanded so that all of its children are displayed. <p><b>Note:</b> This signal will not be emitted if an item changes its state when {@link com.trolltech.qt.gui.QTreeView#expandAll() expandAll()} is invoked. <p><DT><b>See also:</b><br><DD>setItemExpanded(), isItemExpanded(), {@link com.trolltech.qt.gui.QTreeWidget#itemCollapsed itemCollapsed() }, and {@link com.trolltech.qt.gui.QTreeWidget#expandItem(com.trolltech.qt.gui.QTreeWidgetItem) expandItem()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QTreeWidgetItem> itemExpanded = new Signal1<com.trolltech.qt.gui.QTreeWidgetItem>();

    private final void itemExpanded(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemExpanded_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemExpanded_QTreeWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTreeWidgetItem(named: item), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the user presses a mouse button inside the widget. <p>The specified <tt>item</tt> is the item that was clicked, or 0 if no item was clicked. The <tt>column</tt> is the item's column that was clicked, or -1 if no item was clicked.
*/

    public final Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer> itemPressed = new Signal2<com.trolltech.qt.gui.QTreeWidgetItem, java.lang.Integer>();

    private final void itemPressed(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemPressed_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    native void __qt_itemPressed_QTreeWidgetItem_int(long __this__nativeId, long item, int column);
/**
 This signal is emitted when the selection changes in the tree widget. The current selection can be found with {@link com.trolltech.qt.gui.QTreeWidget#selectedItems() selectedItems()}.
*/

    public final Signal0 itemSelectionChanged = new Signal0();

    private final void itemSelectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemSelectionChanged(nativeId());
    }
    native void __qt_itemSelectionChanged(long __this__nativeId);


/**
Constructs a tree widget with the given <tt>parent</tt>.
*/

    public QTreeWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a tree widget with the given <tt>parent</tt>.
*/

    public QTreeWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTreeWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTreeWidget_QWidget(long parent);

/**
Appends the <tt>item</tt> as a top-level item in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#insertTopLevelItem(int, com.trolltech.qt.gui.QTreeWidgetItem) insertTopLevelItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addTopLevelItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addTopLevelItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addTopLevelItem_QTreeWidgetItem(long __this__nativeId, long item);

/**
Appends the list of <tt>items</tt> as a top-level items in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#insertTopLevelItems(int, java.util.List) insertTopLevelItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addTopLevelItems(java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QTreeWidgetItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addTopLevelItems_List(nativeId(), items);
    }
    @QtBlockedSlot
    native void __qt_addTopLevelItems_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items);

/**
Clears the tree widget by removing all of its items and selections. <p><b>Note:</b> Since each item is removed from the tree widget before being deleted, the return value of {@link com.trolltech.qt.gui.QTreeWidgetItem#treeWidget() QTreeWidgetItem::treeWidget()} will be invalid when called from an item's destructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#takeTopLevelItem(int) takeTopLevelItem()}, {@link com.trolltech.qt.gui.QTreeWidget#topLevelItemCount() topLevelItemCount()}, and {@link com.trolltech.qt.gui.QTreeWidget#columnCount() columnCount()}. <br></DD></DT>
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);


/**
Closes the persistent editor for the <tt>item</tt> in the given <tt>column</tt>. <p>This function has no effect if no persistent editor is open for this combination of item and column. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#openPersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem) openPersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closePersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem item) {
        closePersistentEditor(item, (int)0);
    }
/**
Closes the persistent editor for the <tt>item</tt> in the given <tt>column</tt>. <p>This function has no effect if no persistent editor is open for this combination of item and column. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#openPersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem) openPersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closePersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closePersistentEditor_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_closePersistentEditor_QTreeWidgetItem_int(long __this__nativeId, long item, int column);

/**
Closes the <tt>item</tt>. This causes the tree containing the item's children to be collapsed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#expandItem(com.trolltech.qt.gui.QTreeWidgetItem) expandItem()}, {@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}, {@link com.trolltech.qt.gui.QTreeWidget#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}. <br></DD></DT>
*/

    public final void collapseItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_collapseItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_collapseItem_QTreeWidgetItem(long __this__nativeId, long item);

/**
This property holds the number of columns displayed in the tree widget. By default, this property has a value of 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="columnCount")
    @QtBlockedSlot
    public final int columnCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnCount(long __this__nativeId);

/**
Returns the current column in the tree widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem) setCurrentItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentColumn(long __this__nativeId);

/**
Returns the current item in the tree widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem) setCurrentItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#currentItemChanged currentItemChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem currentItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_currentItem(long __this__nativeId);


/**
Starts editing the <tt>item</tt> in the given <tt>column</tt> if it is editable.
*/

    @QtBlockedSlot
    public final void editItem(com.trolltech.qt.gui.QTreeWidgetItem item) {
        editItem(item, (int)0);
    }
/**
Starts editing the <tt>item</tt> in the given <tt>column</tt> if it is editable.
*/

    @QtBlockedSlot
    public final void editItem(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editItem_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_editItem_QTreeWidgetItem_int(long __this__nativeId, long item, int column);

/**
Expands the <tt>item</tt>. This causes the tree containing the item's children to be expanded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#collapseItem(com.trolltech.qt.gui.QTreeWidgetItem) collapseItem()}, {@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}, {@link com.trolltech.qt.gui.QTreeWidget#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#itemExpanded itemExpanded() }. <br></DD></DT>
*/

    public final void expandItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expandItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_expandItem_QTreeWidgetItem(long __this__nativeId, long item);


/**
Returns a list of items that match the given <tt>text</tt>, using the given <tt>flags</tt>, in the given <tt>column</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags) {
        return findItems(text, flags, (int)0);
    }
/**
Returns a list of items that match the given <tt>text</tt>, using the given <tt>flags</tt>, in the given <tt>column</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findItems_String_MatchFlags_int(nativeId(), text, flags.value(), column);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> __qt_findItems_String_MatchFlags_int(long __this__nativeId, java.lang.String text, int flags, int column);

/**
Returns the item used for the tree widget's header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setHeaderItem(com.trolltech.qt.gui.QTreeWidgetItem) setHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem headerItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_headerItem(long __this__nativeId);


/**
Returns the QModelIndex assocated with the given <tt>item</tt> in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex indexFromItem(com.trolltech.qt.gui.QTreeWidgetItem item) {
        return indexFromItem(item, (int)0);
    }
/**
Returns the QModelIndex assocated with the given <tt>item</tt> in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#itemFromIndex(com.trolltech.qt.core.QModelIndex) itemFromIndex()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex indexFromItem(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexFromItem_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexFromItem_QTreeWidgetItem_int(long __this__nativeId, long item, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int indexOfTopLevelItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOfTopLevelItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOfTopLevelItem_QTreeWidgetItem(long __this__nativeId, long item);

/**
Inserts the <tt>item</tt> at <tt>index</tt> in the top level in the view. <p>If the item has already been inserted somewhere else it wont be inserted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#addTopLevelItem(com.trolltech.qt.gui.QTreeWidgetItem) addTopLevelItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertTopLevelItem(int index, com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertTopLevelItem_int_QTreeWidgetItem(nativeId(), index, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertTopLevelItem_int_QTreeWidgetItem(long __this__nativeId, int index, long item);

/**
Inserts the list of <tt>items</tt> at <tt>index</tt> in the top level in the view. <p>Items that have already been inserted somewhere else wont be inserted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#addTopLevelItems(java.util.List) addTopLevelItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertTopLevelItems(int index, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (items != null) {
            for (com.trolltech.qt.gui.QTreeWidgetItem i : items)
                if (i != null) i.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertTopLevelItems_int_List(nativeId(), index, items);
    }
    @QtBlockedSlot
    native void __qt_insertTopLevelItems_int_List(long __this__nativeId, int index, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items);

/**
Returns the tree widget's invisible root item. <p>The invisible root item provides access to the tree widget's top-level items through the {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem} API, making it possible to write functions that can treat top-level items and their children in a uniform way; for example, recursive functions.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem invisibleRootItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invisibleRootItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_invisibleRootItem(long __this__nativeId);

/**
Returns true if the given <tt>item</tt> is set to show only one section over all columns; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setFirstItemColumnSpanned(com.trolltech.qt.gui.QTreeWidgetItem, boolean) setFirstItemColumnSpanned()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFirstItemColumnSpanned(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFirstItemColumnSpanned_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFirstItemColumnSpanned_QTreeWidgetItem(long __this__nativeId, long item);

/**
Returns the item above the given <tt>item</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem itemAbove(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAbove_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_itemAbove_QTreeWidgetItem(long __this__nativeId, long item);

/**
Returns a pointer to the item at the coordinates <tt>p</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#visualItemRect(com.trolltech.qt.gui.QTreeWidgetItem) visualItemRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem itemAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_itemAt_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns a pointer to the item at the coordinates (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem itemAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_itemAt_int_int(long __this__nativeId, int x, int y);

/**
Returns the item visually below the given <tt>item</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem itemBelow(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemBelow_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_itemBelow_QTreeWidgetItem(long __this__nativeId, long item);

/**
Returns a pointer to the {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem} assocated with the given <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#indexFromItem(com.trolltech.qt.gui.QTreeWidgetItem) indexFromItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTreeWidgetItem itemFromIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemFromIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_itemFromIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the widget displayed in the cell specified by <tt>item</tt> and the given <tt>column</tt>. <p><b>Note:</b> The tree takes ownership of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setItemWidget(com.trolltech.qt.gui.QTreeWidgetItem, int, com.trolltech.qt.gui.QWidget) setItemWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget itemWidget(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemWidget_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_itemWidget_QTreeWidgetItem_int(long __this__nativeId, long item, int column);


/**
Opens a persistent editor for the <tt>item</tt> in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#closePersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem) closePersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void openPersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem item) {
        openPersistentEditor(item, (int)0);
    }
/**
Opens a persistent editor for the <tt>item</tt> in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#closePersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem) closePersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void openPersistentEditor(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_openPersistentEditor_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_openPersistentEditor_QTreeWidgetItem_int(long __this__nativeId, long item, int column);

/**
Removes the widget set in the given <tt>item</tt> in the given <tt>column</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeItemWidget(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItemWidget_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeItemWidget_QTreeWidgetItem_int(long __this__nativeId, long item, int column);


/**
Ensures that the <tt>item</tt> is visible, scrolling the view if necessary using the specified <tt>hint</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}, {@link com.trolltech.qt.gui.QTreeWidget#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}. <br></DD></DT>
*/

    public final void scrollToItem(com.trolltech.qt.gui.QTreeWidgetItem item) {
        scrollToItem(item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint.EnsureVisible);
    }
/**
Ensures that the <tt>item</tt> is visible, scrolling the view if necessary using the specified <tt>hint</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}, {@link com.trolltech.qt.gui.QTreeWidget#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}. <br></DD></DT>
*/

    public final void scrollToItem(com.trolltech.qt.gui.QTreeWidgetItem item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToItem_QTreeWidgetItem_ScrollHint(nativeId(), item == null ? 0 : item.nativeId(), hint.value());
    }
    native void __qt_scrollToItem_QTreeWidgetItem_ScrollHint(long __this__nativeId, long item, int hint);

/**
Returns a list of all selected non-hidden items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#itemSelectionChanged itemSelectionChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> selectedItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> __qt_selectedItems(long __this__nativeId);

/**
This property holds the number of columns displayed in the tree widget. By default, this property has a value of 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="columnCount")
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
Sets the current <tt>item</tt> in the tree widget. <p>Depending on the current selection mode, the item may also be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#currentItemChanged currentItemChanged() }. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QTreeWidgetItem(long __this__nativeId, long item);

/**
Sets the current <tt>item</tt> in the tree widget and the current column to <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem item, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QTreeWidgetItem_int(nativeId(), item == null ? 0 : item.nativeId(), column);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QTreeWidgetItem_int(long __this__nativeId, long item, int column);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem item, int column, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentItem(item, column, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Sets the current <tt>item</tt> in the tree widget and the current column to <tt>column</tt>, using the given <tt>command</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTreeWidgetItem item, int column, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QTreeWidgetItem_int_SelectionFlags(nativeId(), item == null ? 0 : item.nativeId(), column, command.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QTreeWidgetItem_int_SelectionFlags(long __this__nativeId, long item, int column, int command);

/**
Sets the given <tt>item</tt> to only show one section for all columns if <tt>span</tt> is true; otherwise the item will show one section per column. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#isFirstItemColumnSpanned(com.trolltech.qt.gui.QTreeWidgetItem) isFirstItemColumnSpanned()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setFirstItemColumnSpanned(com.trolltech.qt.gui.QTreeWidgetItem item, boolean span)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFirstItemColumnSpanned_QTreeWidgetItem_boolean(nativeId(), item == null ? 0 : item.nativeId(), span);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setFirstItemColumnSpanned_QTreeWidgetItem_boolean(long __this__nativeId, long item, boolean span);

/**
Sets the header <tt>item</tt> for the tree widget. The label for each column in the header is supplied by the corresponding label in the item. <p>The tree widget takes ownership of the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#headerItem() headerItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#setHeaderLabels(java.util.List) setHeaderLabels()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeaderItem(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderItem_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHeaderItem_QTreeWidgetItem(long __this__nativeId, long item);

/**
Same as setHeaderLabels(QStringList(<tt>label</tt>)).
*/

    @QtBlockedSlot
    public final void setHeaderLabel(java.lang.String label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderLabel_String(nativeId(), label);
    }
    @QtBlockedSlot
    native void __qt_setHeaderLabel_String(long __this__nativeId, java.lang.String label);

/**
Adds a column in the header for each item in the <tt>labels</tt> list, and sets the label for each column. <p>Note that {@link com.trolltech.qt.gui.QTreeWidget#setHeaderLabels(java.util.List) setHeaderLabels()} won't remove existing columns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#setHeaderItem(com.trolltech.qt.gui.QTreeWidgetItem) setHeaderItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#setHeaderLabel(java.lang.String) setHeaderLabel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeaderLabels(java.util.List<java.lang.String> labels)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderLabels_List(nativeId(), labels);
    }
    @QtBlockedSlot
    native void __qt_setHeaderLabels_List(long __this__nativeId, java.util.List<java.lang.String> labels);

/**
Sets the given <tt>widget</tt> to be displayed in the cell specified by the given <tt>item</tt> and <tt>column</tt>. <p>Note that the given <tt>widget</tt>'s {@link com.trolltech.qt.gui.QWidget autoFillBackground} property must be set to true, otherwise the widget's background will be transparent, showing both the model data and the tree widget item. <p>This function should only be used to display static content in the place of a tree widget item. If you want to display custom dynamic content or implement a custom editor widget, use {@link com.trolltech.qt.gui.QTreeView QTreeView} and subclass {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} instead. <p><b>Note:</b> The tree takes ownership of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#itemWidget(com.trolltech.qt.gui.QTreeWidgetItem, int) itemWidget()}, and {@link <a href="../model-view-delegate.html">Delegate Classes</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setItemWidget(com.trolltech.qt.gui.QTreeWidgetItem item, int column, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemWidget_QTreeWidgetItem_int_QWidget(nativeId(), item == null ? 0 : item.nativeId(), column, widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setItemWidget_QTreeWidgetItem_int_QWidget(long __this__nativeId, long item, int column, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Deprecated
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
        // setModel() creates a new selection model for the object
        com.trolltech.qt.GeneratorUtilities.setField(this, com.trolltech.qt.gui.QAbstractItemView.class, "__rcItemSelectionModel", null);


    }
    @Deprecated
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    final void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


/**
Returns the column used to sort the contents of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#sortItems(int, com.trolltech.qt.core.Qt.SortOrder) sortItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sortColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sortColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sortColumn(long __this__nativeId);

/**
Sorts the items in the widget in the specified <tt>order</tt> by the values in the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#sortColumn() sortColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sortItems(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortItems_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sortItems_int_SortOrder(long __this__nativeId, int column, int order);

/**
Removes the top-level item at the given <tt>index</tt> in the tree and returns it, otherwise returns 0; <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#insertTopLevelItem(int, com.trolltech.qt.gui.QTreeWidgetItem) insertTopLevelItem()}, {@link com.trolltech.qt.gui.QTreeWidget#topLevelItem(int) topLevelItem()}, and {@link com.trolltech.qt.gui.QTreeWidget#topLevelItemCount() topLevelItemCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem takeTopLevelItem(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QTreeWidgetItem __qt_return_value = __qt_takeTopLevelItem_int(nativeId(), index);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_takeTopLevelItem_int(long __this__nativeId, int index);

/**
Returns the top level item at the given <tt>index</tt>, or 0 if the item does not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#topLevelItemCount() topLevelItemCount()}, and {@link com.trolltech.qt.gui.QTreeWidget#insertTopLevelItem(int, com.trolltech.qt.gui.QTreeWidgetItem) insertTopLevelItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTreeWidgetItem topLevelItem(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelItem_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_topLevelItem_int(long __this__nativeId, int index);

/**
This property holds the number of top-level items. By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#columnCount() columnCount()}, and {@link com.trolltech.qt.gui.QTreeWidget#currentItem() currentItem()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="topLevelItemCount")
    @QtBlockedSlot
    public final int topLevelItemCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelItemCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_topLevelItemCount(long __this__nativeId);

/**
Returns the rectangle on the viewport occupied by the item at <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#itemAt(com.trolltech.qt.core.QPoint) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect visualItemRect(com.trolltech.qt.gui.QTreeWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualItemRect_QTreeWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualItemRect_QTreeWidgetItem(long __this__nativeId, long item);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long event);

/**
Handles the <tt>data</tt> supplied by a drag and drop operation that ended with the given <tt>action</tt> in the <tt>index</tt> in the given <tt>parent</tt> item. <p>The default implementation returns true if the drop was successfully handled by decoding the mime data and inserting it into the model; otherwise it returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#supportedDropActions() supportedDropActions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean dropMimeData(com.trolltech.qt.gui.QTreeWidgetItem parent, int index, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.DropAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dropMimeData_QTreeWidgetItem_int_QMimeData_DropAction(nativeId(), parent == null ? 0 : parent.nativeId(), index, data == null ? 0 : data.nativeId(), action.value());
    }
    @QtBlockedSlot
    native boolean __qt_dropMimeData_QTreeWidgetItem_int_QMimeData_DropAction(long __this__nativeId, long parent, int index, long data, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
Returns an object that contains a serialized description of the specified <tt>items</tt>. The format used to describe the items is obtained from the {@link com.trolltech.qt.gui.QTreeWidget#mimeTypes() mimeTypes()} function. <p>If the list of items is empty, 0 is returned rather than a serialized empty list.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QMimeData mimeData(java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_List(nativeId(), items);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTreeWidgetItem> items);

/**
Returns a list of MIME types that can be used to describe a list of treewidget items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget#mimeData(java.util.List) mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.util.List<java.lang.String> mimeTypes()    {
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
    public void setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel selectionModel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (selectionModel == null)
            throw new NullPointerException("Argument 'selectionModel': null not expected.");
        {
            com.trolltech.qt.GeneratorUtilities.setField(this, QAbstractItemView.class, "__rcItemSelectionModel", selectionModel);
        }
        __qt_setSelectionModel_QItemSelectionModel(nativeId(), selectionModel == null ? 0 : selectionModel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSelectionModel_QItemSelectionModel(long __this__nativeId, long selectionModel);

/**
Returns the drop actions supported by this view. <p><DT><b>See also:</b><br><DD>Qt::DropActions. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.Qt.DropActions supportedDropActions()    {
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

    public static native QTreeWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QTreeWidget(QPrivateConstructor p) { super(p); } 
}
