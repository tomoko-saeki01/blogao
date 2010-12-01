package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTableWidget class provides an item-based table view with a default model. Table widgets provide standard table display facilities for applications. The items in a QTableWidget are provided by {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem}. <p>If you want a table that uses your own data model you should use {@link com.trolltech.qt.gui.QTableView QTableView} rather than this class. <p>Table widgets can be constructed with the required numbers of rows and columns: <pre class="snippet">
        tableWidget = new QTableWidget(12, 3, this);
    </pre> Alternatively, tables can be constructed without a given size and resized later: <pre class="snippet">
        tableWidget = new QTableWidget(this);
    
        tableWidget.setRowCount(10);
        tableWidget.setColumnCount(5);
    </pre> Items are created ouside the table (with no parent widget) and inserted into the table with {@link com.trolltech.qt.gui.QTableWidget#setItem(int, int, com.trolltech.qt.gui.QTableWidgetItem) setItem()}: <pre class="snippet">
        QTableWidgetItem newItem = new QTableWidgetItem("" + (row+1) + ", " + (column+1));
        tableWidget.setItem(row, column, newItem);
    </pre> If you want to enable sorting in your table widget, do so after you have populated it with items, otherwise sorting may interfere with the insertion order (see {@link com.trolltech.qt.gui.QTableWidget#setItem(int, int, com.trolltech.qt.gui.QTableWidgetItem) setItem()} for details). <p>Tables can be given both horizontal and vertical headers. The simplest way to create the headers is to supply a list of strings to the {@link com.trolltech.qt.gui.QTableWidget#setHorizontalHeaderLabels(java.util.List) setHorizontalHeaderLabels()} and {@link com.trolltech.qt.gui.QTableWidget#setVerticalHeaderLabels(java.util.List) setVerticalHeaderLabels()} functions. These will provide simple textual headers for the table's columns and rows. More sophisticated headers can be created from existing table items that are usually constructed outside the table. For example, we can construct a table item with an icon and aligned text, and use it as the header for a particular column: <pre class="snippet">
        QTableWidgetItem cubesHeaderItem = new QTableWidgetItem(tr("Cubes"));
        cubesHeaderItem.setIcon(new QIcon(new QPixmap("classpath:images/cubed.png")));
        cubesHeaderItem.setTextAlignment(Qt.AlignmentFlag.AlignVCenter.value());
    </pre> The number of rows in the table can be found with {@link com.trolltech.qt.gui.QTableWidget#rowCount() rowCount()}, and the number of columns with {@link com.trolltech.qt.gui.QTableWidget#columnCount() columnCount()}. The table can be cleared with the {@link com.trolltech.qt.gui.QTableWidget#clear() clear()} function. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-tableview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-tableview.png"></center><br></td><td>  <br><center><img src="../images/plastique-tableview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} table widget.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} table widget.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} table widget.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem}, {@link com.trolltech.qt.gui.QTableView QTableView}, and {@link <a href="../model-view-programming.html">Model/View Programming</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTableWidget extends com.trolltech.qt.gui.QTableView
{
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the cell specified by <tt>row</tt> and <tt>column</tt> has been activated
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellActivated = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellActivated(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellActivated_int_int(nativeId(), row, column);
    }
    native void __qt_cellActivated_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted whenever the data of the item in the cell specified by <tt>row</tt> and <tt>column</tt> has changed.
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellChanged(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellChanged_int_int(nativeId(), row, column);
    }
    native void __qt_cellChanged_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted whenever a cell in the table is clicked. The <tt>row</tt> and <tt>column</tt> specified is the cell that was clicked.
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellClicked = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellClicked(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellClicked_int_int(nativeId(), row, column);
    }
    native void __qt_cellClicked_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted whenever a cell in the table is double clicked. The <tt>row</tt> and <tt>column</tt> specified is the cell that was double clicked.
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellDoubleClicked = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellDoubleClicked(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellDoubleClicked_int_int(nativeId(), row, column);
    }
    native void __qt_cellDoubleClicked_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted when the mouse cursor enters a cell. The cell is specified by <tt>row</tt> and <tt>column</tt>. <p>This signal is only emitted when {@link QWidget#hasMouseTracking() mouseTracking} is turned on, or when a mouse button is pressed while moving into an item.
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellEntered = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellEntered(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellEntered_int_int(nativeId(), row, column);
    }
    native void __qt_cellEntered_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), java.lang.Integer(named: column)&gt;:<p> This signal is emitted whenever a cell in the table is pressed. The <tt>row</tt> and <tt>column</tt> specified is the cell that was pressed.
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> cellPressed = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void cellPressed(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cellPressed_int_int(nativeId(), row, column);
    }
    native void __qt_cellPressed_int_int(long __this__nativeId, int row, int column);
/**
<p>This signal takes 4 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: currentRow), java.lang.Integer(named: currentColumn), java.lang.Integer(named: previousRow), java.lang.Integer(named: previousColumn)&gt;:<p> This signal is emitted whenever the current cell changes. The cell specified by <tt>previousRow</tt> and <tt>previousColumn</tt> is the cell that previously had the focus, the cell specified by <tt>currentRow</tt> and <tt>currentColumn</tt> is the new current cell.
*/

    public final Signal4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> currentCellChanged = new Signal4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>();

    private final void currentCellChanged(int currentRow, int currentColumn, int previousRow, int previousColumn)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentCellChanged_int_int_int_int(nativeId(), currentRow, currentColumn, previousRow, previousColumn);
    }
    native void __qt_currentCellChanged_int_int_int_int(long __this__nativeId, int currentRow, int currentColumn, int previousRow, int previousColumn);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: current), com.trolltech.qt.gui.QTableWidgetItem(named: previous)&gt;:<p> This signal is emitted whenever the current item changes. The <tt>previous</tt> item is the item that previously had the focus, <tt>current</tt> is the new current item.
*/

    public final Signal2<com.trolltech.qt.gui.QTableWidgetItem, com.trolltech.qt.gui.QTableWidgetItem> currentItemChanged = new Signal2<com.trolltech.qt.gui.QTableWidgetItem, com.trolltech.qt.gui.QTableWidgetItem>();

    private final void currentItemChanged(com.trolltech.qt.gui.QTableWidgetItem current, com.trolltech.qt.gui.QTableWidgetItem previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentItemChanged_QTableWidgetItem_QTableWidgetItem(nativeId(), current == null ? 0 : current.nativeId(), previous == null ? 0 : previous.nativeId());
    }
    native void __qt_currentItemChanged_QTableWidgetItem_QTableWidgetItem(long __this__nativeId, long current, long previous);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted when the specified <tt>item</tt> has been activated
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemActivated = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemActivated(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemActivated_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemActivated_QTableWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted whenever the data of <tt>item</tt> has changed.
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemChanged = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemChanged(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemChanged_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemChanged_QTableWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted whenever an item in the table is clicked. The <tt>item</tt> specified is the item that was clicked.
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemClicked = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemClicked(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemClicked_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemClicked_QTableWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted whenever an item in the table is double clicked. The <tt>item</tt> specified is the item that was double clicked.
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemDoubleClicked = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemDoubleClicked(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemDoubleClicked_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemDoubleClicked_QTableWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted when the mouse cursor enters an item. The <tt>item</tt> is the item entered. <p>This signal is only emitted when {@link QWidget#hasMouseTracking() mouseTracking} is turned on, or when a mouse button is pressed while moving into an item.
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemEntered = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemEntered(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemEntered_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemEntered_QTableWidgetItem(long __this__nativeId, long item);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTableWidgetItem(named: item)&gt;:<p> This signal is emitted whenever an item in the table is pressed. The <tt>item</tt> specified is the item that was pressed.
*/

    public final Signal1<com.trolltech.qt.gui.QTableWidgetItem> itemPressed = new Signal1<com.trolltech.qt.gui.QTableWidgetItem>();

    private final void itemPressed(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemPressed_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_itemPressed_QTableWidgetItem(long __this__nativeId, long item);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#selectedItems() selectedItems()}, and isItemSelected(). <br></DD></DT>
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
Creates a new table view with the given <tt>parent</tt>.
*/

    public QTableWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Creates a new table view with the given <tt>parent</tt>.
*/

    public QTableWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTableWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTableWidget_QWidget(long parent);


/**
Creates a new table view with the given <tt>rows</tt> and <tt>columns</tt>, and with the given <tt>parent</tt>.
*/

    public QTableWidget(int rows, int columns) {
        this(rows, columns, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Creates a new table view with the given <tt>rows</tt> and <tt>columns</tt>, and with the given <tt>parent</tt>.
*/

    public QTableWidget(int rows, int columns, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTableWidget_int_int_QWidget(rows, columns, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTableWidget_int_int_QWidget(int rows, int columns, long parent);

/**
Returns the widget displayed in the cell in the given <tt>row</tt> and <tt>column</tt>. <p><b>Note:</b> The table takes ownership of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setCellWidget(int, int, com.trolltech.qt.gui.QWidget) setCellWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cellWidget(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellWidget_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_cellWidget_int_int(long __this__nativeId, int row, int column);

/**
Removes all items in the view. This will also remove all selections. The table dimensions stay the same.
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Removes all items not in the headers from the view. This will also remove all selections. The table dimensions stay the same.
*/

    public final void clearContents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearContents(nativeId());
    }
    native void __qt_clearContents(long __this__nativeId);

/**
Closes the persistent editor for <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#openPersistentEditor(com.trolltech.qt.gui.QTableWidgetItem) openPersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closePersistentEditor(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closePersistentEditor_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closePersistentEditor_QTableWidgetItem(long __this__nativeId, long item);

/**
Returns the column for the <tt>item</tt>.
*/

    @QtBlockedSlot
    public final int column(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_column_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native int __qt_column_QTableWidgetItem(long __this__nativeId, long item);

/**
This property holds the number of columns in the table. By default, for a table constructed without row and column counts, this property contains a value of 0.
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
Returns the column of the current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#currentRow() currentRow()}, and {@link com.trolltech.qt.gui.QTableWidget#setCurrentCell(int, int) setCurrentCell()}. <br></DD></DT>
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
Returns the current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem) setCurrentItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem currentItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_currentItem(long __this__nativeId);

/**
Returns the row of the current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#currentColumn() currentColumn()}, and {@link com.trolltech.qt.gui.QTableWidget#setCurrentCell(int, int) setCurrentCell()}. <br></DD></DT>
*/

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
    public final void editItem(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editItem_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_editItem_QTableWidgetItem(long __this__nativeId, long item);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTableWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlag ... flags) {
        return this.findItems(text, new com.trolltech.qt.core.Qt.MatchFlags(flags));
    }
/**
Finds items that matches the <tt>text</tt> using the given <tt>flags</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTableWidgetItem> findItems(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findItems_String_MatchFlags(nativeId(), text, flags.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTableWidgetItem> __qt_findItems_String_MatchFlags(long __this__nativeId, java.lang.String text, int flags);

/**
Returns the horizontal header item for column, <tt>column</tt>, if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setHorizontalHeaderItem(int, com.trolltech.qt.gui.QTableWidgetItem) setHorizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem horizontalHeaderItem(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalHeaderItem_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_horizontalHeaderItem_int(long __this__nativeId, int column);

/**
Returns the QModelIndex assocated with the given <tt>item</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex indexFromItem(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexFromItem_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexFromItem_QTableWidgetItem(long __this__nativeId, long item);

/**
Inserts an empty column into the table at <tt>column</tt>.
*/

    public final void insertColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertColumn_int(nativeId(), column);
    }
    native void __qt_insertColumn_int(long __this__nativeId, int column);

/**
Inserts an empty row into the table at <tt>row</tt>.
*/

    public final void insertRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int(nativeId(), row);
    }
    native void __qt_insertRow_int(long __this__nativeId, int row);

/**
Returns the item for the given <tt>row</tt> and <tt>column</tt> if one has been set; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setItem(int, int, com.trolltech.qt.gui.QTableWidgetItem) setItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem item(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_item_int_int(long __this__nativeId, int row, int column);

/**
Returns a pointer to the item at the given <tt>point</tt>, or returns 0 if <tt>point</tt> is not covered by an item in the table widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#item(int, int) item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem itemAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_itemAt_QPoint(long __this__nativeId, long p);

/**
Returns the item at the position equivalent to {@link com.trolltech.qt.core.QPoint QPoint}(<tt>ax</tt>, <tt>ay</tt>) in the table widget's coordinate system, or returns 0 if the specified point is not covered by an item in the table widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#item(int, int) item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem itemAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_itemAt_int_int(long __this__nativeId, int x, int y);

/**
Returns a pointer to the {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem} assocated with the given <tt>index</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTableWidgetItem itemFromIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemFromIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_itemFromIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the item prototype used by the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setItemPrototype(com.trolltech.qt.gui.QTableWidgetItem) setItemPrototype()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem itemPrototype()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemPrototype(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_itemPrototype(long __this__nativeId);

/**
Returns a list of pointers to the items contained in the <tt>data</tt> object. If the object was not created by a {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} in the same process, the list is empty.
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.gui.QTableWidgetItem> items(com.trolltech.qt.core.QMimeData data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QMimeData(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTableWidgetItem> __qt_items_QMimeData(long __this__nativeId, long data);

/**
Opens an editor for the give <tt>item</tt>. The editor remains open after editing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#closePersistentEditor(com.trolltech.qt.gui.QTableWidgetItem) closePersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void openPersistentEditor(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_openPersistentEditor_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_openPersistentEditor_QTableWidgetItem(long __this__nativeId, long item);

/**
Removes the widget set on the cell indicated by <tt>row</tt> and <tt>column</tt>.
*/

    @QtBlockedSlot
    public final void removeCellWidget(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeCellWidget_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native void __qt_removeCellWidget_int_int(long __this__nativeId, int row, int column);

/**
Removes the column <tt>column</tt> and all its items from the table.
*/

    public final void removeColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeColumn_int(nativeId(), column);
    }
    native void __qt_removeColumn_int(long __this__nativeId, int column);

/**
Removes the row <tt>row</tt> and all its items from the table.
*/

    public final void removeRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeRow_int(nativeId(), row);
    }
    native void __qt_removeRow_int(long __this__nativeId, int row);

/**
Returns the row for the <tt>item</tt>.
*/

    @QtBlockedSlot
    public final int row(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_row_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native int __qt_row_QTableWidgetItem(long __this__nativeId, long item);

/**
This property holds the number of rows in the table. By default, for a table constructed without row and column counts, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="rowCount")
    @QtBlockedSlot
    public final int rowCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rowCount(long __this__nativeId);


/**
Scrolls the view if necessary to ensure that the <tt>item</tt> is visible. The <tt>hint</tt> parameter specifies more precisely where the <tt>item</tt> should be located after the operation.
*/

    public final void scrollToItem(com.trolltech.qt.gui.QTableWidgetItem item) {
        scrollToItem(item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint.EnsureVisible);
    }
/**
Scrolls the view if necessary to ensure that the <tt>item</tt> is visible. The <tt>hint</tt> parameter specifies more precisely where the <tt>item</tt> should be located after the operation.
*/

    public final void scrollToItem(com.trolltech.qt.gui.QTableWidgetItem item, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToItem_QTableWidgetItem_ScrollHint(nativeId(), item == null ? 0 : item.nativeId(), hint.value());
    }
    native void __qt_scrollToItem_QTableWidgetItem_ScrollHint(long __this__nativeId, long item, int hint);

/**
Returns a list of all selected items. <p>This function returns a list of pointers to the contents of the selected cells. Use the {@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()} function to retrieve the complete selection including empty cells. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTableWidgetItem> selectedItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTableWidgetItem> __qt_selectedItems(long __this__nativeId);

/**
Returns a list of all selected ranges. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange QTableWidgetSelectionRange}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTableWidgetSelectionRange> selectedRanges()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedRanges(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTableWidgetSelectionRange> __qt_selectedRanges(long __this__nativeId);

/**
Sets the given <tt>widget</tt> to be displayed in the cell in the given <tt>row</tt> and <tt>column</tt>, passing the ownership of the widget to the table. <p>If cell widget A is replaced with cell widget B, cell widget A will be deleted. For example, in the code snippet below, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} object will be deleted.<br><br>The following code example is written in c++.<br> <pre class="snippet">
setCellWidget(index, new QLineEdit);
...
setCellWidget(index, new QTextEdit);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#cellWidget(int, int) cellWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCellWidget(int row, int column, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCellWidget_int_int_QWidget(nativeId(), row, column, widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCellWidget_int_int_QWidget(long __this__nativeId, int row, int column, long widget);

/**
This property holds the number of columns in the table. By default, for a table constructed without row and column counts, this property contains a value of 0.
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
Sets the current cell to be the cell at position (<tt>row</tt>, <tt>column</tt>). <p>Depending on the current {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode selection mode }, the cell may also be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem) setCurrentItem()}, {@link com.trolltech.qt.gui.QTableWidget#currentRow() currentRow()}, and {@link com.trolltech.qt.gui.QTableWidget#currentColumn() currentColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCurrentCell(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentCell_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native void __qt_setCurrentCell_int_int(long __this__nativeId, int row, int column);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setCurrentCell(int row, int column, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentCell(row, column, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Sets the current cell to be the cell at position (<tt>row</tt>, <tt>column</tt>), using the given <tt>command</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem) setCurrentItem()}, {@link com.trolltech.qt.gui.QTableWidget#currentRow() currentRow()}, and {@link com.trolltech.qt.gui.QTableWidget#currentColumn() currentColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCurrentCell(int row, int column, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentCell_int_int_SelectionFlags(nativeId(), row, column, command.value());
    }
    @QtBlockedSlot
    native void __qt_setCurrentCell_int_int_SelectionFlags(long __this__nativeId, int row, int column, int command);

/**
Sets the current item to <tt>item</tt>. <p>Depending on the current {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode selection mode }, the item may also be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#currentItem() currentItem()}, and {@link com.trolltech.qt.gui.QTableWidget#setCurrentCell(int, int) setCurrentCell()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QTableWidgetItem(long __this__nativeId, long item);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem item, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentItem(item, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Sets the current item to be <tt>item</tt>, using the given <tt>command</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#currentItem() currentItem()}, and {@link com.trolltech.qt.gui.QTableWidget#setCurrentCell(int, int) setCurrentCell()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.qt.gui.QTableWidgetItem item, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QTableWidgetItem_SelectionFlags(nativeId(), item == null ? 0 : item.nativeId(), command.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCurrentItem_QTableWidgetItem_SelectionFlags(long __this__nativeId, long item, int command);

/**
Sets the horizontal header item for column <tt>column</tt> to <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#horizontalHeaderItem(int) horizontalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalHeaderItem(int column, com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalHeaderItem_int_QTableWidgetItem(nativeId(), column, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalHeaderItem_int_QTableWidgetItem(long __this__nativeId, int column, long item);

/**
Sets the horizontal header labels using <tt>labels</tt>.
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
Sets the item for the given <tt>row</tt> and <tt>column</tt> to <tt>item</tt>. <p>The table takes ownership of the item. <p>Note that if sorting is enabled (see {@link QTableView#isSortingEnabled() sortingEnabled}) and <tt>column</tt> is the current sort column, the <tt>row</tt> will be moved to the sorted position determined by <tt>item</tt>. <p>If you want to set several items of a particular row (say, by calling {@link com.trolltech.qt.gui.QTableWidget#setItem(int, int, com.trolltech.qt.gui.QTableWidgetItem) setItem()} in a loop), you may want to turn off sorting before doing so, and turn it back on afterwards; this will allow you to use the same <tt>row</tt> argument for all items in the same row (i.e. {@link com.trolltech.qt.gui.QTableWidget#setItem(int, int, com.trolltech.qt.gui.QTableWidgetItem) setItem()} will not move the row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#item(int, int) item()}, and {@link com.trolltech.qt.gui.QTableWidget#takeItem(int, int) takeItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItem(int row, int column, com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItem_int_int_QTableWidgetItem(nativeId(), row, column, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItem_int_int_QTableWidgetItem(long __this__nativeId, int row, int column, long item);

/**
Sets the item prototype for the table to the specified <tt>item</tt>. <p>The table widget will use the item prototype clone function when it needs to create a new table item. For example when the user is editing editing in an empty cell. This is useful when you have a {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem} subclass and want to make sure that QTableWidget creates instances of your subclass. <p>The table takes ownership of the prototype. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#itemPrototype() itemPrototype()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemPrototype(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemPrototype_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemPrototype_QTableWidgetItem(long __this__nativeId, long item);

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
Selects or deselects the <tt>range</tt> depending on <tt>select</tt>.
*/

    @QtBlockedSlot
    public final void setRangeSelected(com.trolltech.qt.gui.QTableWidgetSelectionRange range, boolean select)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRangeSelected_QTableWidgetSelectionRange_boolean(nativeId(), range == null ? 0 : range.nativeId(), select);
    }
    @QtBlockedSlot
    native void __qt_setRangeSelected_QTableWidgetSelectionRange_boolean(long __this__nativeId, long range, boolean select);

/**
This property holds the number of rows in the table. By default, for a table constructed without row and column counts, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="rowCount")
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
Sets the vertical header item for row <tt>row</tt> to <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#verticalHeaderItem(int) verticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalHeaderItem(int row, com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalHeaderItem_int_QTableWidgetItem(nativeId(), row, item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setVerticalHeaderItem_int_QTableWidgetItem(long __this__nativeId, int row, long item);

/**
Sets the vertical header labels using <tt>labels</tt>.
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
Sorts all the rows in the table widget based on <tt>column</tt> and <tt>order</tt>.
*/

    @QtBlockedSlot
    public final void sortItems(int column) {
        sortItems(column, com.trolltech.qt.core.Qt.SortOrder.AscendingOrder);
    }
/**
Sorts all the rows in the table widget based on <tt>column</tt> and <tt>order</tt>.
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
Removes the horizontal header item at <tt>column</tt> from the header without deleting it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem takeHorizontalHeaderItem(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QTableWidgetItem __qt_return_value = __qt_takeHorizontalHeaderItem_int(nativeId(), column);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_takeHorizontalHeaderItem_int(long __this__nativeId, int column);

/**
Removes the item at <tt>row</tt> and <tt>column</tt> from the table without deleting it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem takeItem(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QTableWidgetItem __qt_return_value = __qt_takeItem_int_int(nativeId(), row, column);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_takeItem_int_int(long __this__nativeId, int row, int column);

/**
Removes the vertical header item at <tt>row</tt> from the header without deleting it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem takeVerticalHeaderItem(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QTableWidgetItem __qt_return_value = __qt_takeVerticalHeaderItem_int(nativeId(), row);
        if (__qt_return_value != null) {
            __qt_return_value.reenableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_takeVerticalHeaderItem_int(long __this__nativeId, int row);

/**
Returns the vertical header item for row <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#setVerticalHeaderItem(int, com.trolltech.qt.gui.QTableWidgetItem) setVerticalHeaderItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidgetItem verticalHeaderItem(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalHeaderItem_int(nativeId(), row);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_verticalHeaderItem_int(long __this__nativeId, int row);

/**
Returns the visual column of the given <tt>logicalColumn</tt>.
*/

    @QtBlockedSlot
    public final int visualColumn(int logicalColumn)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualColumn_int(nativeId(), logicalColumn);
    }
    @QtBlockedSlot
    native int __qt_visualColumn_int(long __this__nativeId, int logicalColumn);

/**
Returns the rectangle on the viewport occupied by the item at <tt>item</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect visualItemRect(com.trolltech.qt.gui.QTableWidgetItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualItemRect_QTableWidgetItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualItemRect_QTableWidgetItem(long __this__nativeId, long item);

/**
Returns the visual row of the given <tt>logicalRow</tt>.
*/

    @QtBlockedSlot
    public final int visualRow(int logicalRow)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualRow_int(nativeId(), logicalRow);
    }
    @QtBlockedSlot
    native int __qt_visualRow_int(long __this__nativeId, int logicalRow);

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
Handles the <tt>data</tt> supplied by a drag and drop operation that ended with the given <tt>action</tt> in the given <tt>row</tt> and <tt>column</tt>. Returns true if the data and action can be handled by the model; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#supportedDropActions() supportedDropActions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean dropMimeData(int row, int column, com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.DropAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dropMimeData_int_int_QMimeData_DropAction(nativeId(), row, column, data == null ? 0 : data.nativeId(), action.value());
    }
    @QtBlockedSlot
    native boolean __qt_dropMimeData_int_int_QMimeData_DropAction(long __this__nativeId, int row, int column, long data, int action);

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
Returns an object that contains a serialized description of the specified <tt>items</tt>. The format used to describe the items is obtained from the {@link com.trolltech.qt.gui.QTableWidget#mimeTypes() mimeTypes()} function. <p>If the list of items is empty, 0 is returned rather than a serialized empty list.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QMimeData mimeData(java.util.List<com.trolltech.qt.gui.QTableWidgetItem> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_List(nativeId(), items);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTableWidgetItem> items);

/**
Returns a list of MIME types that can be used to describe a list of tablewidget items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget#mimeData(java.util.List) mimeData()}. <br></DD></DT>
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

    public static native QTableWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QTableWidget(QPrivateConstructor p) { super(p); } 
}
