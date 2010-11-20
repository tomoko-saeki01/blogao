package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QListWidget class provides an item-based list widget. QListWidget is a convenience class that provides a list view similar to the one supplied by {@link com.trolltech.qt.gui.QListView QListView}, but with a classic item-based interface for adding and removing items. QListWidget uses an internal model to manage each {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem} in the list. <p>For a more flexible list view widget, use the {@link com.trolltech.qt.gui.QListView QListView} class with a standard model. <p>List widgets are constructed in the same way as other widgets: <pre class="snippet">
        QListWidget listWidget = new QListWidget(this);
    </pre> The selectionMode() of a list widget determines how many of the items in the list can be selected at the same time, and whether complex selections of items can be created. This can be set with the setSelectionMode() function. <p>There are two ways to add items to the list: they can be constructed with the list widget as their parent widget, or they can be constructed with no parent widget and added to the list later. If a list widget already exists when the items are constructed, the first method is easier to use: <pre class="snippet">
        new QListWidgetItem(tr("Oak"), listWidget);
        new QListWidgetItem(tr("Fir"), listWidget);
        new QListWidgetItem(tr("Pine"), listWidget);
    </pre> If you need to insert a new item into the list at a particular position, it is more required to construct the item without a parent widget and use the {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) insertItem()} function to place it within the list. The list widget will take ownership of the item. <pre class="snippet">
        QListWidgetItem newItem = new QListWidgetItem();
        newItem.setText(itemText);
    
        listWidget.insertItem(row, newItem);
    </pre> For multiple items, {@link com.trolltech.qt.gui.QListWidget#insertItems(int, java.util.List) insertItems()} can be used instead. The number of items in the list is found with the {@link com.trolltech.qt.gui.QListWidget#count() count()} function. To remove items from the list, use {@link com.trolltech.qt.gui.QListWidget#takeItem(int) takeItem()}. <p>The current item in the list can be found with {@link com.trolltech.qt.gui.QListWidget#currentItem() currentItem()}, and changed with {@link com.trolltech.qt.gui.QListWidget#setCurrentItem(com.trolltech.qt.gui.QListWidgetItem) setCurrentItem()}. The user can also change the current item by navigating with the keyboard or clicking on a different item. When the current item changes, the {@link com.trolltech.qt.gui.QListWidget#currentItemChanged currentItemChanged() } signal is emitted with the new current item and the item that was previously current. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-listview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-listview.png"></center><br></td><td>  <br><center><img src="../images/plastique-listview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} list widget.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} list widget.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} list widget.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem}, {@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTreeView QTreeView}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link <a href="../qtjambi-configdialog.html">Config Dialog Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QListWidget extends com.trolltech.qt.gui.QListView
{
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: current), com.trolltech.qt.gui.QListWidgetItem(named: previous)&gt;:<p> This signal is emitted whenever the current item changes. The <tt>previous</tt> item is the item that previously had the focus, <tt>current</tt> is the new current item.
*/

    public final Signal2<com.trolltech.qt.gui.QListWidgetItem, com.trolltech.qt.gui.QListWidgetItem> currentItemChanged = new Signal2<com.trolltech.qt.gui.QListWidgetItem, com.trolltech.qt.gui.QListWidgetItem>();

    private final void currentItemChanged(com.trolltech.qt.gui.QListWidgetItem current, com.trolltech.qt.gui.QListWidgetItem previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentItemChanged_QListWidgetItem_QListWidgetItem(nativeId(), current == null ? 0 : current.nativeId(), previous == null ? 0 : previous.nativeId());
    }
    native void __qt_currentItemChanged_QListWidgetItem_QListWidgetItem(long __this__nativeId, long current, long previous);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: currentRow)&gt;:<p> This signal is emitted whenever the current item changes. The <tt>currentRow</tt> is the row of the current item. If there is no current item, the <tt>currentRow</tt> is -1.
*/

    public final Signal1<java.lang.Integer> currentRowChanged = new Signal1<java.lang.Integer>();

    private final void currentRowChanged(int currentRow)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentRowChanged_int(nativeId(), currentRow);
    }
    native void __qt_currentRowChanged_int(long __this__nativeId, int currentRow);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: currentText)&gt;:<p> This signal is emitted whenever the current item changes. The <tt>currentText</tt> is the text data in the current item. If there is no current item, the <tt>currentText</tt> is invalid.
*/

    public final Signal1<java.lang.String> currentTextChanged = new Signal1<java.lang.String>();

    private final void currentTextChanged(java.lang.String currentText)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentTextChanged_String(nativeId(), currentText);
    }
    native void __qt_currentTextChanged_String(long __this__nativeId, java.lang.String currentText);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted when the <tt>item</tt> is activated. The <tt>item</tt> is activated when the user clicks or double clicks on it, depending on the system configuration. It is also activated when the user presses the activation key (on Windows and X11 this is the <b>Return</b> key, on Mac OS X it is <b>Ctrl+0</b>).
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemActivated = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemActivated(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemActivated_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemActivated_QListWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted whenever the data of <tt>item</tt> has changed.
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemChanged = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemChanged(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemChanged_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemChanged_QListWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted with the specified <tt>item</tt> when a mouse button is clicked on an item in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#itemPressed itemPressed() }, and {@link com.trolltech.qt.gui.QListWidget#itemDoubleClicked itemDoubleClicked() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemClicked = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemClicked(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemClicked_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemClicked_QListWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted with the specified <tt>item</tt> when a mouse button is double clicked on an item in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#itemClicked itemClicked() }, and {@link com.trolltech.qt.gui.QListWidget#itemPressed itemPressed() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemDoubleClicked = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemDoubleClicked(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemDoubleClicked_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemDoubleClicked_QListWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted when the mouse cursor enters an item. The <tt>item</tt> is the item entered. This signal is only emitted when {@link QWidget#hasMouseTracking() mouseTracking} is turned on, or when a mouse button is pressed while moving into an item.
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemEntered = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemEntered(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemEntered_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemEntered_QListWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QListWidgetItem(named: item)&gt;:<p> This signal is emitted with the specified <tt>item</tt> when a mouse button is pressed on an item in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#itemClicked itemClicked() }, and {@link com.trolltech.qt.gui.QListWidget#itemDoubleClicked itemDoubleClicked() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QListWidgetItem> itemPressed = new Signal1<com.trolltech.qt.gui.QListWidgetItem>();

    private final void itemPressed(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemPressed_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemPressed_QListWidgetItem(long __this__nativeId, long item);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#selectedItems() selectedItems()}, isItemSelected(), and {@link com.trolltech.qt.gui.QListWidget#currentItemChanged currentItemChanged() }. <br></DD></DT>
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
Constructs an empty QListWidget with the given <tt>parent</tt>.
*/

    public QListWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty QListWidget with the given <tt>parent</tt>.
*/

    public QListWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QListWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QListWidget_QWidget(long parent);

/**
Inserts the <tt>item</tt> at the the end of the list widget. <p><b>Warning:</b> A {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem} can only be added to a QListWidget once. Adding the same {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem} multiple times to a QListWidget will result in undefined behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addItem_QListWidgetItem(long __this__nativeId, long item);

/**
Removes all items and selections in the view. <p><b>Note:</b> All items will be permanently deleted.
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Closes the persistent editor for the given <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#openPersistentEditor(com.trolltech.qt.gui.QListWidgetItem) openPersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closePersistentEditor(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closePersistentEditor_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closePersistentEditor_QListWidgetItem(long __this__nativeId, long item);

/**
This property holds the number of items in the list including any hidden items.
*/

    @com.trolltech.qt.QtPropertyReader(name="count")
    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns the current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#setCurrentItem(com.trolltech.qt.gui.QListWidgetItem) setCurrentItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidgetItem currentItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_currentItem(long __this__nativeId);

/**
This property holds the row of the current item.  Depending on the current selection mode, the row may also be selected.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentRow")
    @QtBlockedSlot
    public final int currentRow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentRow(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentRow(long __this__nativeId);

/**
Starts editing the <tt>item</tt> if it is editable.
*/

    @QtBlockedSlot
    public final void editItem(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editItem_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_editItem_QListWidgetItem(long __this__nativeId, long item);


/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QListWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlag ... flags) {
        return this.findItems(text, new com.trolltech.qt.core.Qt.MatchFlags(flags));
    }
/**
Finds items with the text that matches the string <tt>text</tt> using the given <tt>flags</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QListWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findItems_String_MatchFlags(nativeId(), text, flags.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QListWidgetItem> __qt_findItems_String_MatchFlags(long __this__nativeId, java.lang.String text, int flags);

/**
Returns the QModelIndex assocated with the given <tt>item</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex indexFromItem(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexFromItem_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexFromItem_QListWidgetItem(long __this__nativeId, long item);

/**
Inserts the <tt>item</tt> at the position in the list given by <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#addItem(com.trolltech.qt.gui.QListWidgetItem) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItem(int row, com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertItem_int_QListWidgetItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertItem_int_QListWidgetItem(long __this__nativeId, int row, long item);

/**
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the list; if the property is false, sorting is not enabled. The default value is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="sortingEnabled")
    @QtBlockedSlot
    public final boolean isSortingEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSortingEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSortingEnabled(long __this__nativeId);

/**
Returns the item that occupies the given <tt>row</tt> in the list if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#row(com.trolltech.qt.gui.QListWidgetItem) row()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidgetItem item(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int(nativeId(), row);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_item_int(long __this__nativeId, int row);

/**
Returns a pointer to the item at the coordinates <tt>p</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidgetItem itemAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_itemAt_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns a pointer to the item at the coordinates (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidgetItem itemAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_itemAt_int_int(long __this__nativeId, int x, int y);

/**
Returns a pointer to the {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem} assocated with the given <tt>index</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QListWidgetItem itemFromIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemFromIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_itemFromIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the widget displayed in the given <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#setItemWidget(com.trolltech.qt.gui.QListWidgetItem, com.trolltech.qt.gui.QWidget) setItemWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget itemWidget(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemWidget_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_itemWidget_QListWidgetItem(long __this__nativeId, long item);

/**
Returns a list of pointers to the items contained in the <tt>data</tt> object. If the object was not created by a QListWidget in the same process, the list is empty.
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.gui.QListWidgetItem> items(com.trolltech.qt.core.QMimeData data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QMimeData(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QListWidgetItem> __qt_items_QMimeData(long __this__nativeId, long data);

/**
Opens an editor for the given <tt>item</tt>. The editor remains open after editing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#closePersistentEditor(com.trolltech.qt.gui.QListWidgetItem) closePersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void openPersistentEditor(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_openPersistentEditor_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_openPersistentEditor_QListWidgetItem(long __this__nativeId, long item);

/**
Removes the widget set on the given <tt>item</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeItemWidget(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItemWidget_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeItemWidget_QListWidgetItem(long __this__nativeId, long item);

/**
Returns the row containing the given <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#item(int) item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int row(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_row_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native int __qt_row_QListWidgetItem(long __this__nativeId, long item);


/**
Scrolls the view if necessary to ensure that the <tt>item</tt> is visible. The <tt>hint</tt> parameter specifies more precisely where the <tt>item</tt> should be located after the operation.
*/

    public final void scrollToItem(com.trolltech.qt.gui.QListWidgetItem item) {
        scrollToItem(item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint.EnsureVisible);
    }
/**
Scrolls the view if necessary to ensure that the <tt>item</tt> is visible. The <tt>hint</tt> parameter specifies more precisely where the <tt>item</tt> should be located after the operation.
*/

    public final void scrollToItem(com.trolltech.qt.gui.QListWidgetItem item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToItem_QListWidgetItem_ScrollHint(nativeId(), item == null ? 0 : item.nativeId(), hint.value());
    }
    native void __qt_scrollToItem_QListWidgetItem_ScrollHint(long __this__nativeId, long item, int hint);

/**
Returns a list of all selected items in the list widget.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QListWidgetItem> selectedItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QListWidgetItem> __qt_selectedItems(long __this__nativeId);

/**
Sets the current item to <tt>item</tt>. <p>Depending on the current selection mode, the item may also be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#currentItem() currentItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QListWidgetItem(long __this__nativeId, long item);


/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QListWidgetItem item, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentItem(item, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Set the current item to <tt>item</tt>, using the given <tt>command</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QListWidgetItem item, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QListWidgetItem_SelectionFlags(nativeId(), item == null ? 0 : item.nativeId(), command.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QListWidgetItem_SelectionFlags(long __this__nativeId, long item, int command);

/**
This property holds the row of the current item.  Depending on the current selection mode, the row may also be selected.
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentRow")
    @QtBlockedSlot
    public final void setCurrentRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native void __qt_setCurrentRow_int(long __this__nativeId, int row);


/**

*/

    @QtBlockedSlot
    public final void setCurrentRow(int row, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentRow(row, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
This property holds the row of the current item.  Depending on the current selection mode, the row may also be selected.
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentRow")
    @QtBlockedSlot
    public final void setCurrentRow(int row, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentRow_int_SelectionFlags(nativeId(), row, command.value());
    }
    @QtBlockedSlot
    native void __qt_setCurrentRow_int_SelectionFlags(long __this__nativeId, int row, int command);

/**
Sets the <tt>widget</tt> to be displayed in the give <tt>item</tt>. <p>This function should only be used to display static content in the place of a list widget item. If you want to display custom dynamic content or implement a custom editor widget, use {@link com.trolltech.qt.gui.QListView QListView} and subclass {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#itemWidget(com.trolltech.qt.gui.QListWidgetItem) itemWidget()}, and {@link <a href="../model-view-delegate.html">Delegate Classes</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setItemWidget(com.trolltech.qt.gui.QListWidgetItem item, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemWidget_QListWidgetItem_QWidget(nativeId(), item == null ? 0 : item.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setItemWidget_QListWidgetItem_QWidget(long __this__nativeId, long item, long widget);

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
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the list; if the property is false, sorting is not enabled. The default value is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortingEnabled")
    @QtBlockedSlot
    public final void setSortingEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortingEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setSortingEnabled_boolean(long __this__nativeId, boolean enable);


/**
Sorts all the items in the list widget according to the specified <tt>order</tt>.
*/

    @QtBlockedSlot
    public final void sortItems() {
        sortItems(com.trolltech.qt.core.Qt.SortOrder.AscendingOrder);
    }
/**
Sorts all the items in the list widget according to the specified <tt>order</tt>.
*/

    @QtBlockedSlot
    public final void sortItems(com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortItems_SortOrder(nativeId(), order.value());
    }
    @QtBlockedSlot
    native void __qt_sortItems_SortOrder(long __this__nativeId, int order);

/**
Removes and returns the item from the given <tt>row</tt> in the list widget; otherwise returns 0. <p>Items removed from a list widget will not be managed by Qt, and will need to be deleted manually. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) insertItem()}, and {@link com.trolltech.qt.gui.QListWidget#addItem(com.trolltech.qt.gui.QListWidgetItem) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidgetItem takeItem(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QListWidgetItem __qt_return_value = __qt_takeItem_int(nativeId(), row);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_takeItem_int(long __this__nativeId, int row);

/**
Returns the rectangle on the viewport occupied by the item at <tt>item</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect visualItemRect(com.trolltech.qt.gui.QListWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualItemRect_QListWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualItemRect_QListWidgetItem(long __this__nativeId, long item);

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
Handles the <tt>data</tt> supplied by an external drag and drop operation that ended with the given <tt>action</tt> in the given <tt>index</tt>. Returns true if the data and action can be handled by the model; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#supportedDropActions() supportedDropActions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean dropMimeData(int index, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.DropAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dropMimeData_int_QMimeData_DropAction(nativeId(), index, data == null ? 0 : data.nativeId(), action.value());
    }
    @QtBlockedSlot
    native boolean __qt_dropMimeData_int_QMimeData_DropAction(long __this__nativeId, int index, long data, int action);

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
Returns an object that contains a serialized description of the specified <tt>items</tt>. The format used to describe the items is obtained from the {@link com.trolltech.qt.gui.QListWidget#mimeTypes() mimeTypes()} function. <p>If the list of items is empty, 0 is returned rather than a serialized empty list.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QMimeData mimeData(java.util.List<com.trolltech.qt.gui.QListWidgetItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_List(nativeId(), items);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QListWidgetItem> items);

/**
Returns a list of MIME types that can be used to describe a list of listwidget items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget#mimeData(java.util.List) mimeData()}. <br></DD></DT>
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

    public static native QListWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QListWidget(QPrivateConstructor p) { super(p); } 

    /**
     * Inserts an item with the text label at the end of the list widget.
     *
     * @param label The text of the new item.
     */
    public final void addItem(String label) {
        addItem(new QListWidgetItem(label, this));
    }

    /**
     * Inserts items with the text labels at the end of the list widget.
     *
     * @param labels The collection of labels for the new items.
     */
    public final void addItems(java.util.List<String> labels) {
        for (String label : labels)
            addItem(label);
    }

    /**
     * This is an overloaded member function, provided for convenience.
     * Inserts an item with the text label in the list widget at the position given by row.
     *
     * @param row The position in which to insert the new item.
     * @param label The text of the new item.
     */
    public final void insertItem(int row, String label) {
        insertItem(row, new QListWidgetItem(label, this));
    }

    /**
     * Inserts items from the list of labels into the list, starting at the given row.
     *
     * @param row The position in which to insert the new items.
     * @param labels The collection of labels for the new items.
     */
    public final void insertItems(int row, java.util.List<String> labels) {
        for (String label : labels)
            insertItem(row++, label);
    }

}
