package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTableView class provides a default model/view implementation of a table view. A QTableView implements a table view that displays items from a model. This class is used to provide standard tables that were previously provided by the {@link <a href="../porting4.html">QTable</a>} class, but using the more flexible approach provided by Qt's model/view architecture. <p>The QTableView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>QTableView implements the interfaces defined by the {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} class to allow it to display data provided by models derived from the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} class.<a name="navigation"><h2>Navigation</h2> You can navigate the cells in the table by clicking on a cell with the mouse, or by using the arrow keys. Because QTableView enables {@link QAbstractItemView#tabKeyNavigation() tabKeyNavigation} by default, you can also hit Tab and Backtab to move from cell to cell.<a name="visual-appearance"><h2>Visual Appearance</h2> The table has a vertical header that can be obtained using the {@link com.trolltech.qt.gui.QTableView#verticalHeader() verticalHeader()} function, and a horizontal header that is available through the {@link com.trolltech.qt.gui.QTableView#horizontalHeader() horizontalHeader()} function. The height of each row in the table can be found by using {@link com.trolltech.qt.gui.QTableView#rowHeight(int) rowHeight()}; similarly, the width of columns can be found using {@link com.trolltech.qt.gui.QTableView#columnWidth(int) columnWidth()}. Since both of these are plain widgets, you can hide either of them using their {@link com.trolltech.qt.gui.QWidget#hide() hide()} functions. <p>Rows and columns can be hidden and shown with {@link com.trolltech.qt.gui.QTableView#hideRow(int) hideRow()}, {@link com.trolltech.qt.gui.QTableView#hideColumn(int) hideColumn()}, {@link com.trolltech.qt.gui.QTableView#showRow(int) showRow()}, and {@link com.trolltech.qt.gui.QTableView#showColumn(int) showColumn()}. They can be selected with {@link com.trolltech.qt.gui.QTableView#selectRow(int) selectRow()} and {@link com.trolltech.qt.gui.QTableView#selectColumn(int) selectColumn()}. The table will show a grid depending on the {@link QTableView#showGrid() showGrid} property. <p>The items shown in a table view, like those in the other item views, are rendered and edited using standard {@link com.trolltech.qt.gui.QItemDelegate delegates}. However, for some tasks it is sometimes useful to be able to insert widgets in a table instead. Widgets are set for particular indexes with the {@link com.trolltech.qt.gui.QAbstractItemView#setIndexWidget(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QWidget) setIndexWidget()} function, and later retrieved with {@link com.trolltech.qt.gui.QAbstractItemView#indexWidget(com.trolltech.qt.core.QModelIndex) indexWidget()}. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qtableview-resized.png"></center><br></td><td> By default, the cells in a table do not expand to fill the available space. <p>You can make the cells fill the available space by stretching the last header section. Access the relevant header using {@link com.trolltech.qt.gui.QTableView#horizontalHeader() horizontalHeader()} or {@link com.trolltech.qt.gui.QTableView#verticalHeader() verticalHeader()} and set the header's {@link QHeaderView#stretchLastSection() stretchLastSection} property. <p>To distribute the available space according to the space requirement of each column or row, call the view's {@link com.trolltech.qt.gui.QTableView#resizeColumnsToContents() resizeColumnsToContents()} or {@link com.trolltech.qt.gui.QTableView#resizeRowsToContents() resizeRowsToContents()} functions.</td></tr></table><a name="coordinate-systems"><h2>Coordinate Systems</h2> For some specialized forms of tables it is useful to be able to convert between row and column indexes and widget coordinates. The {@link com.trolltech.qt.gui.QTableView#rowAt(int) rowAt()} function provides the y-coordinate within the view of the specified row; the row index can be used to obtain a corresponding y-coordinate with {@link com.trolltech.qt.gui.QTableView#rowViewportPosition(int) rowViewportPosition()}. The {@link com.trolltech.qt.gui.QTableView#columnAt(int) columnAt()} and {@link com.trolltech.qt.gui.QTableView#columnViewportPosition(int) columnViewportPosition()} functions provide the equivalent conversion operations between x-coordinates and column indexes.<a name="styles"><h2>Styles</h2> QTableView is styled appropriately for each platform. The following images show how it looks on three different platforms. Go to the {@link <a href="../gallery.html">Qt Widget Gallery</a>} to see its appearance in other styles. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-tableview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-tableview.png"></center><br></td><td>  <br><center><img src="../images/plastique-tableview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} table view.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} table view.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} table view.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget QTableWidget}, {@link <a href="../model-view-view.html">View Classes</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}, {@link <a href="../itemviews-chart.html">Chart Example</a>}, {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}, and {@link <a href="../sql-tablemodel.html">Table Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTableView extends com.trolltech.qt.gui.QAbstractItemView
{


/**
Constructs a table view with a <tt>parent</tt> to represent the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QTableView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a table view with a <tt>parent</tt> to represent the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QTableView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTableView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTableView_QWidget(long parent);

/**
Removes all row and column spans in the table view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setSpan(int, int, int, int) setSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearSpans()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearSpans(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearSpans(long __this__nativeId);

/**
Returns the column in which the given x-coordinate, <tt>x</tt>, in contents coordinates is located. <p><b>Note:</b> This function returns -1 if the given coordinate is not valid (has no column). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#rowAt(int) rowAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnAt(int x)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnAt_int(nativeId(), x);
    }
    @QtBlockedSlot
    native int __qt_columnAt_int(long __this__nativeId, int x);

/**
This slot is called whenever columns are added or deleted. The previous number of columns is specified by <tt>oldCount</tt>, and the new number of columns is specified by <tt>newCount</tt>.
*/

    protected final void columnCountChanged(int oldCount, int newCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnCountChanged_int_int(nativeId(), oldCount, newCount);
    }
    native void __qt_columnCountChanged_int_int(long __this__nativeId, int oldCount, int newCount);

/**
This slot is called to change the index of the given <tt>column</tt> in the table view. The old index is specified by <tt>oldIndex</tt>, and the new index by <tt>newIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#rowMoved(int, int, int) rowMoved()}. <br></DD></DT>
*/

    protected final void columnMoved(int column, int oldIndex, int newIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnMoved_int_int_int(nativeId(), column, oldIndex, newIndex);
    }
    native void __qt_columnMoved_int_int_int(long __this__nativeId, int column, int oldIndex, int newIndex);

/**
This slot is called to change the width of the given <tt>column</tt>. The old width is specified by <tt>oldWidth</tt>, and the new width by <tt>newWidth</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#rowResized(int, int, int) rowResized()}. <br></DD></DT>
*/

    protected final void columnResized(int column, int oldWidth, int newWidth)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnResized_int_int_int(nativeId(), column, oldWidth, newWidth);
    }
    native void __qt_columnResized_int_int_int(long __this__nativeId, int column, int oldWidth, int newWidth);

/**
Returns the column span of the table element at (<tt>row</tt>, <tt>column</tt>). The default is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setSpan(int, int, int, int) setSpan()}, and {@link com.trolltech.qt.gui.QTableView#rowSpan(int, int) rowSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnSpan(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnSpan_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native int __qt_columnSpan_int_int(long __this__nativeId, int row, int column);

/**
Returns the x-coordinate in contents coordinates of the given <tt>column</tt>.
*/

    @QtBlockedSlot
    public final int columnViewportPosition(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnViewportPosition_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnViewportPosition_int(long __this__nativeId, int column);

/**
Returns the width of the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setColumnWidth(int, int) setColumnWidth()}, {@link com.trolltech.qt.gui.QTableView#resizeColumnToContents(int) resizeColumnToContents()}, and {@link com.trolltech.qt.gui.QTableView#rowHeight(int) rowHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnWidth(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnWidth_int(long __this__nativeId, int column);

/**
This property holds the pen style used to draw the grid.  This property holds the style used when drawing the grid (see {@link QTableView#showGrid() showGrid}).
*/

    @com.trolltech.qt.QtPropertyReader(name="gridStyle")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.PenStyle gridStyle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.PenStyle.resolve(__qt_gridStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_gridStyle(long __this__nativeId);

/**
Hide the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#showColumn(int) showColumn()}, and {@link com.trolltech.qt.gui.QTableView#hideRow(int) hideRow()}. <br></DD></DT>
*/

    public final void hideColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideColumn_int(nativeId(), column);
    }
    native void __qt_hideColumn_int(long __this__nativeId, int column);

/**
Hide the given <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#showRow(int) showRow()}, and {@link com.trolltech.qt.gui.QTableView#hideColumn(int) hideColumn()}. <br></DD></DT>
*/

    public final void hideRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideRow_int(nativeId(), row);
    }
    native void __qt_hideRow_int(long __this__nativeId, int row);

/**
Returns the table view's horizontal header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setHorizontalHeader(com.trolltech.qt.gui.QHeaderView) setHorizontalHeader()}, {@link com.trolltech.qt.gui.QTableView#verticalHeader() verticalHeader()}, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) QAbstractItemModel::headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QHeaderView horizontalHeader()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalHeader(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QHeaderView __qt_horizontalHeader(long __this__nativeId);

/**
Returns true if the given <tt>column</tt> is hidden; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#isRowHidden(int) isRowHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isColumnHidden(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isColumnHidden_int(nativeId(), column);
    }
    @QtBlockedSlot
    native boolean __qt_isColumnHidden_int(long __this__nativeId, int column);

/**
This property holds whether the button in the top-left corner is enabled. If this property is true then button in the top-left corner of the table view is enabled. Clicking on this button will select all the cells in the table view. <p>This property is true by default.
*/

    @com.trolltech.qt.QtPropertyReader(name="cornerButtonEnabled")
    @QtBlockedSlot
    public final boolean isCornerButtonEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCornerButtonEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCornerButtonEnabled(long __this__nativeId);

/**
Returns true if the given <tt>row</tt> is hidden; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#isColumnHidden(int) isColumnHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isRowHidden(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRowHidden_int(nativeId(), row);
    }
    @QtBlockedSlot
    native boolean __qt_isRowHidden_int(long __this__nativeId, int row);

/**
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the table; if the property is false, sorting is not enabled. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#sortByColumn(int, com.trolltech.qt.core.Qt.SortOrder) sortByColumn()}. <br></DD></DT>
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
Resizes the given <tt>column</tt> based on the size hints of the delegate used to render each item in the column. <p><b>Note:</b> Only visible columns will be resized. Reimplement sizeHintForColumn() to resize hidden columns as well.
*/

    public final void resizeColumnToContents(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeColumnToContents_int(nativeId(), column);
    }
    native void __qt_resizeColumnToContents_int(long __this__nativeId, int column);

/**
Resizes all columns based on the size hints of the delegate used to render each item in the columns.
*/

    public final void resizeColumnsToContents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeColumnsToContents(nativeId());
    }
    native void __qt_resizeColumnsToContents(long __this__nativeId);

/**
Resizes the given <tt>row</tt> based on the size hints of the delegate used to render each item in the row.
*/

    public final void resizeRowToContents(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeRowToContents_int(nativeId(), row);
    }
    native void __qt_resizeRowToContents_int(long __this__nativeId, int row);

/**
Resizes all rows based on the size hints of the delegate used to render each item in the rows.
*/

    public final void resizeRowsToContents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeRowsToContents(nativeId());
    }
    native void __qt_resizeRowsToContents(long __this__nativeId);

/**
Returns the row in which the given y-coordinate, <tt>y</tt>, in contents coordinates is located. <p><b>Note:</b> This function returns -1 if the given coordinate is not valid (has no row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#columnAt(int) columnAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowAt(int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowAt_int(nativeId(), y);
    }
    @QtBlockedSlot
    native int __qt_rowAt_int(long __this__nativeId, int y);

/**
This slot is called whenever rows are added or deleted. The previous number of rows is specified by <tt>oldCount</tt>, and the new number of rows is specified by <tt>newCount</tt>.
*/

    protected final void rowCountChanged(int oldCount, int newCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowCountChanged_int_int(nativeId(), oldCount, newCount);
    }
    native void __qt_rowCountChanged_int_int(long __this__nativeId, int oldCount, int newCount);

/**
Returns the height of the given <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setRowHeight(int, int) setRowHeight()}, {@link com.trolltech.qt.gui.QTableView#resizeRowToContents(int) resizeRowToContents()}, and {@link com.trolltech.qt.gui.QTableView#columnWidth(int) columnWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowHeight(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowHeight_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_rowHeight_int(long __this__nativeId, int row);

/**
This slot is called to change the index of the given <tt>row</tt> in the table view. The old index is specified by <tt>oldIndex</tt>, and the new index by <tt>newIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#columnMoved(int, int, int) columnMoved()}. <br></DD></DT>
*/

    protected final void rowMoved(int row, int oldIndex, int newIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowMoved_int_int_int(nativeId(), row, oldIndex, newIndex);
    }
    native void __qt_rowMoved_int_int_int(long __this__nativeId, int row, int oldIndex, int newIndex);

/**
This slot is called to change the height of the given <tt>row</tt>. The old height is specified by <tt>oldHeight</tt>, and the new height by <tt>newHeight</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#columnResized(int, int, int) columnResized()}. <br></DD></DT>
*/

    protected final void rowResized(int row, int oldHeight, int newHeight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowResized_int_int_int(nativeId(), row, oldHeight, newHeight);
    }
    native void __qt_rowResized_int_int_int(long __this__nativeId, int row, int oldHeight, int newHeight);

/**
Returns the row span of the table element at (<tt>row</tt>, <tt>column</tt>). The default is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setSpan(int, int, int, int) setSpan()}, and {@link com.trolltech.qt.gui.QTableView#columnSpan(int, int) columnSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowSpan(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowSpan_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native int __qt_rowSpan_int_int(long __this__nativeId, int row, int column);

/**
Returns the y-coordinate in contents coordinates of the given <tt>row</tt>.
*/

    @QtBlockedSlot
    public final int rowViewportPosition(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowViewportPosition_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_rowViewportPosition_int(long __this__nativeId, int row);

/**
Selects the given <tt>column</tt> in the table view if the current {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode } and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior } allows columns to be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#selectRow(int) selectRow()}. <br></DD></DT>
*/

    public final void selectColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectColumn_int(nativeId(), column);
    }
    native void __qt_selectColumn_int(long __this__nativeId, int column);

/**
Selects the given <tt>row</tt> in the table view if the current {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode } and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior } allows rows to be selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#selectColumn(int) selectColumn()}. <br></DD></DT>
*/

    public final void selectRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectRow_int(nativeId(), row);
    }
    native void __qt_selectRow_int(long __this__nativeId, int row);

/**
If <tt>hide</tt> is true the given <tt>column</tt> will be hidden; otherwise it will be shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#isColumnHidden(int) isColumnHidden()}, and {@link com.trolltech.qt.gui.QTableView#setRowHidden(int, boolean) setRowHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnHidden(int column, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnHidden_int_boolean(nativeId(), column, hide);
    }
    @QtBlockedSlot
    native void __qt_setColumnHidden_int_boolean(long __this__nativeId, int column, boolean hide);

/**
Sets the width of the given <tt>column</tt> to be <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#columnWidth(int) columnWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnWidth(int column, int width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnWidth_int_int(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnWidth_int_int(long __this__nativeId, int column, int width);

/**
This property holds whether the button in the top-left corner is enabled. If this property is true then button in the top-left corner of the table view is enabled. Clicking on this button will select all the cells in the table view. <p>This property is true by default.
*/

    @com.trolltech.qt.QtPropertyWriter(name="cornerButtonEnabled")
    @QtBlockedSlot
    public final void setCornerButtonEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCornerButtonEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setCornerButtonEnabled_boolean(long __this__nativeId, boolean enable);

/**
This property holds the pen style used to draw the grid.  This property holds the style used when drawing the grid (see {@link QTableView#showGrid() showGrid}).
*/

    @com.trolltech.qt.QtPropertyWriter(name="gridStyle")
    @QtBlockedSlot
    public final void setGridStyle(com.trolltech.qt.core.Qt.PenStyle style)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGridStyle_PenStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setGridStyle_PenStyle(long __this__nativeId, int style);

/**
Sets the widget to use for the horizontal header to <tt>header</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#horizontalHeader() horizontalHeader()}, and {@link com.trolltech.qt.gui.QTableView#setVerticalHeader(com.trolltech.qt.gui.QHeaderView) setVerticalHeader()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setHorizontalHeader(com.trolltech.qt.gui.QHeaderView header)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalHeader_QHeaderView(nativeId(), header == null ? 0 : header.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setHorizontalHeader_QHeaderView(long __this__nativeId, long header);

/**
Sets the height of the given <tt>row</tt> to be <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#rowHeight(int) rowHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowHeight(int row, int height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowHeight_int_int(nativeId(), row, height);
    }
    @QtBlockedSlot
    native void __qt_setRowHeight_int_int(long __this__nativeId, int row, int height);

/**
If <tt>hide</tt> is true <tt>row</tt> will be hidden, otherwise it will be shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#isRowHidden(int) isRowHidden()}, and {@link com.trolltech.qt.gui.QTableView#setColumnHidden(int, boolean) setColumnHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowHidden(int row, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowHidden_int_boolean(nativeId(), row, hide);
    }
    @QtBlockedSlot
    native void __qt_setRowHidden_int_boolean(long __this__nativeId, int row, boolean hide);

/**
This property holds whether the grid is shown. If this property is true a grid is drawn for the table; if the property is false, no grid is drawn. The default value is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="showGrid")
    public final void setShowGrid(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShowGrid_boolean(nativeId(), show);
    }
    native void __qt_setShowGrid_boolean(long __this__nativeId, boolean show);

/**
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the table; if the property is false, sorting is not enabled. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#sortByColumn(int, com.trolltech.qt.core.Qt.SortOrder) sortByColumn()}. <br></DD></DT>
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
Sets the span of the table element at (<tt>row</tt>, <tt>column</tt>) to the number of rows and columns specified by (<tt>rowSpanCount</tt>, <tt>columnSpanCount</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#rowSpan(int, int) rowSpan()}, and {@link com.trolltech.qt.gui.QTableView#columnSpan(int, int) columnSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSpan(int row, int column, int rowSpan, int columnSpan)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpan_int_int_int_int(nativeId(), row, column, rowSpan, columnSpan);
    }
    @QtBlockedSlot
    native void __qt_setSpan_int_int_int_int(long __this__nativeId, int row, int column, int rowSpan, int columnSpan);

/**
Sets the widget to use for the vertical header to <tt>header</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#verticalHeader() verticalHeader()}, and {@link com.trolltech.qt.gui.QTableView#setHorizontalHeader(com.trolltech.qt.gui.QHeaderView) setHorizontalHeader()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setVerticalHeader(com.trolltech.qt.gui.QHeaderView header)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalHeader_QHeaderView(nativeId(), header == null ? 0 : header.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setVerticalHeader_QHeaderView(long __this__nativeId, long header);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is true by default. <p>Note that even of wrapping is enabled, the cell will not be expanded to fit all text. Ellipsis will be inserted according to the current {@link QAbstractItemView#textElideMode() textElideMode}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="wordWrap")
    @QtBlockedSlot
    public final void setWordWrap(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWordWrap_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setWordWrap_boolean(long __this__nativeId, boolean on);

/**
Show the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#hideColumn(int) hideColumn()}, and {@link com.trolltech.qt.gui.QTableView#showRow(int) showRow()}. <br></DD></DT>
*/

    public final void showColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showColumn_int(nativeId(), column);
    }
    native void __qt_showColumn_int(long __this__nativeId, int column);

/**
This property holds whether the grid is shown. If this property is true a grid is drawn for the table; if the property is false, no grid is drawn. The default value is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="showGrid")
    @QtBlockedSlot
    public final boolean showGrid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_showGrid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_showGrid(long __this__nativeId);

/**
Show the given <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#hideRow(int) hideRow()}, and {@link com.trolltech.qt.gui.QTableView#showColumn(int) showColumn()}. <br></DD></DT>
*/

    public final void showRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showRow_int(nativeId(), row);
    }
    native void __qt_showRow_int(long __this__nativeId, int row);

/**
Sorts the model by the values in the given <tt>column</tt> in the given <tt>order</tt>. <p><DT><b>See also:</b><br><DD>{@link QTableView#isSortingEnabled() sortingEnabled}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sortByColumn(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortByColumn_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sortByColumn_int_SortOrder(long __this__nativeId, int column, int order);

/**
Returns the table view's vertical header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableView#setVerticalHeader(com.trolltech.qt.gui.QHeaderView) setVerticalHeader()}, {@link com.trolltech.qt.gui.QTableView#horizontalHeader() horizontalHeader()}, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) QAbstractItemModel::headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QHeaderView verticalHeader()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalHeader(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QHeaderView __qt_verticalHeader(long __this__nativeId);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is true by default. <p>Note that even of wrapping is enabled, the cell will not be expanded to fit all text. Ellipsis will be inserted according to the current {@link QAbstractItemView#textElideMode() textElideMode}.
*/

    @com.trolltech.qt.QtPropertyReader(name="wordWrap")
    @QtBlockedSlot
    public final boolean wordWrap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wordWrap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wordWrap(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    @QtBlockedSlot
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int horizontalOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalOffset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_horizontalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void horizontalScrollbarAction(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_horizontalScrollbarAction_int(nativeId(), action);
    }
    @QtBlockedSlot
    native void __qt_horizontalScrollbarAction_int(long __this__nativeId, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex indexAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexAt_QPoint(long __this__nativeId, long p);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean isIndexHidden(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isIndexHidden_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isIndexHidden_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QModelIndex moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction cursorAction, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_moveCursor_CursorAction_KeyboardModifiers(nativeId(), cursorAction.value(), modifiers.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_moveCursor_CursorAction_KeyboardModifiers(long __this__nativeId, int cursorAction, int modifiers);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void scrollContentsBy(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollContentsBy_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scrollContentsBy_int_int(long __this__nativeId, int dx, int dy);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void scrollTo(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollTo_QModelIndex_ScrollHint(nativeId(), index, hint.value());
    }
    @QtBlockedSlot
    native void __qt_scrollTo_QModelIndex_ScrollHint(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int hint);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected java.util.List<com.trolltech.qt.core.QModelIndex> selectedIndexes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedIndexes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_selectedIndexes(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void selectionChanged(com.trolltech.qt.gui.QItemSelection selected, com.trolltech.qt.gui.QItemSelection deselected)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged_QItemSelection_QItemSelection(nativeId(), selected == null ? 0 : selected.nativeId(), deselected == null ? 0 : deselected.nativeId());
    }
    @QtBlockedSlot
    native void __qt_selectionChanged_QItemSelection_QItemSelection(long __this__nativeId, long selected, long deselected);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            com.trolltech.qt.GeneratorUtilities.setField(this, QAbstractItemView.class, "__rcItemModel", model);
        }
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
        // setModel() creates a new selection model for the object
        com.trolltech.qt.GeneratorUtilities.setField(this, com.trolltech.qt.gui.QAbstractItemView.class, "__rcItemSelectionModel", null);


    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setRootIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setRootIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void setSelection(com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelection_QRect_SelectionFlags(nativeId(), rect == null ? 0 : rect.nativeId(), command.value());
    }
    @QtBlockedSlot
    native void __qt_setSelection_QRect_SelectionFlags(long __this__nativeId, long rect, int command);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int sizeHintForColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHintForColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_sizeHintForColumn_int(long __this__nativeId, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int sizeHintForRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHintForRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_sizeHintForRow_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void updateGeometries()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometries(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateGeometries(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int verticalOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalOffset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_verticalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void verticalScrollbarAction(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_verticalScrollbarAction_int(nativeId(), action);
    }
    @QtBlockedSlot
    native void __qt_verticalScrollbarAction_int(long __this__nativeId, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QStyleOptionViewItem viewOptions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewOptions(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyleOptionViewItem __qt_viewOptions(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect visualRect(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualRect_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualRect_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QRegion visualRegionForSelection(com.trolltech.qt.gui.QItemSelection selection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualRegionForSelection_QItemSelection(nativeId(), selection == null ? 0 : selection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_visualRegionForSelection_QItemSelection(long __this__nativeId, long selection);

/**
@exclude
*/

    public static native QTableView fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTableView(QPrivateConstructor p) { super(p); } 
}
