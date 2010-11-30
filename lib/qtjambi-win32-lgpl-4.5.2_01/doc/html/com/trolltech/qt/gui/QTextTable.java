package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextTable class represents a table in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A table is a group of cells ordered into rows and columns. Each table contains at least one row and one column. Each cell contains a block, and is surrounded by a frame. <p>Tables are usually created and inserted into a document with the {@link com.trolltech.qt.gui.QTextCursor#insertTable(int, int) QTextCursor::insertTable()} function. For example, we can insert a table with three rows and two columns at the current cursor position in an editor using the following lines of code: <pre class="snippet">
        QTextCursor cursor = new QTextCursor(editor.textCursor());
    
        cursor.movePosition(QTextCursor.MoveOperation.Start);
    <br>
        QTextTable table = cursor.insertTable(rows, columns, tableFormat);
     </pre> The table format is either defined when the table is created or changed later with {@link com.trolltech.qt.gui.QTextTable#setFormat(com.trolltech.qt.gui.QTextTableFormat) setFormat()}. <p>The table currently being edited by the cursor is found with {@link com.trolltech.qt.gui.QTextCursor#currentTable() QTextCursor::currentTable()}. This allows its format or dimensions to be changed after it has been inserted into a document. <p>A table's size can be changed with {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, or by using {@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, or {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}. Use {@link com.trolltech.qt.gui.QTextTable#cellAt(com.trolltech.qt.gui.QTextCursor) cellAt()} to retrieve table cells. <p>The starting and ending positions of table rows can be found by moving a cursor within a table, and using the {@link com.trolltech.qt.gui.QTextTable#rowStart(com.trolltech.qt.gui.QTextCursor) rowStart()} and {@link com.trolltech.qt.gui.QTextTable#rowEnd(com.trolltech.qt.gui.QTextCursor) rowEnd()} functions to obtain cursors at the start and end of each row. <p>Rows and columns within a QTextTable can be merged and split using the {@link com.trolltech.qt.gui.QTextTable#mergeCells(com.trolltech.qt.gui.QTextCursor) mergeCells()} and {@link com.trolltech.qt.gui.QTextTable#splitCell(int, int, int, int) splitCell()} functions. However, only cells that span multiple rows or columns can be split. (Merging or splitting does not increase or decrease the number of rows and columns.) <table align="center" border="0" cellpadding="2" cellspacing="1" width="80%"><tr valign="top" class="even"><td>  <br><center><img src="../images/texttable-split.png"></center><br></td><td> Suppose we have a 2x3 table of names and addresses. To merge both columns in the first row we invoke {@link com.trolltech.qt.gui.QTextTable#mergeCells(com.trolltech.qt.gui.QTextCursor) mergeCells()} with <tt>row</tt> = 0, <tt>column</tt> = 0, <tt>numRows</tt> = 1 and <tt>numColumns</tt> = 2. <pre class="snippet">
        table.mergeCells(0, 0, 1, 2);
    </pre></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/texttable-merge.png"></center><br></td><td> This gives us the following table. To split the first row of the table back into two cells, we invoke the {@link com.trolltech.qt.gui.QTextTable#splitCell(int, int, int, int) splitCell()} function with <tt>numRows</tt> and <tt>numCols</tt> = 1. <pre class="snippet">
        table.splitCell(0, 0, 1, 1);
    </pre></td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/texttable-split.png"></center><br></td><td> This results in the original table.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat QTextTableFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextTable extends com.trolltech.qt.gui.QTextFrame
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextTable(com.trolltech.qt.gui.QTextDocument doc){
        super((QPrivateConstructor)null);
        __qt_QTextTable_QTextDocument(doc == null ? 0 : doc.nativeId());
    }

    native void __qt_QTextTable_QTextDocument(long doc);

/**
Appends <tt>count</tt> columns at the right side of the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}, and {@link com.trolltech.qt.gui.QTextTable#appendRows(int) appendRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendColumns(int count)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendColumns_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_appendColumns_int(long __this__nativeId, int count);

/**
Appends <tt>count</tt> rows at the bottom of the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}, and {@link com.trolltech.qt.gui.QTextTable#appendColumns(int) appendColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void appendRows(int count)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendRows_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_appendRows_int(long __this__nativeId, int count);

/**
This is an overloaded member function, provided for convenience. <p>Returns the table cell containing the given <tt>cursor</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableCell cellAt(com.trolltech.qt.gui.QTextCursor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellAt_QTextCursor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableCell __qt_cellAt_QTextCursor(long __this__nativeId, long c);

/**
This is an overloaded member function, provided for convenience. <p>Returns the table cell that contains the character at the given <tt>position</tt> in the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableCell cellAt(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellAt_int(nativeId(), position);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableCell __qt_cellAt_int(long __this__nativeId, int position);

/**
Returns the table cell at the given <tt>row</tt> and <tt>column</tt> in the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#columns() columns()}, and {@link com.trolltech.qt.gui.QTextTable#rows() rows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableCell cellAt(int row, int col)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellAt_int_int(nativeId(), row, col);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableCell __qt_cellAt_int_int(long __this__nativeId, int row, int col);

/**
Returns the number of columns in the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#rows() rows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columns()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columns(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columns(long __this__nativeId);

/**
Returns the table's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#setFormat(com.trolltech.qt.gui.QTextTableFormat) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableFormat tableFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableFormat __qt_tableFormat(long __this__nativeId);

/**
Inserts a number of <tt>columns</tt> before the column with the specified <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.gui.QTextTable#appendRows(int) appendRows()}, and {@link com.trolltech.qt.gui.QTextTable#appendColumns(int) appendColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertColumns(int pos, int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertColumns_int_int(nativeId(), pos, num);
    }
    @QtBlockedSlot
    native void __qt_insertColumns_int_int(long __this__nativeId, int pos, int num);

/**
Inserts a number of <tt>rows</tt> before the row with the specified <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.gui.QTextTable#appendRows(int) appendRows()}, and {@link com.trolltech.qt.gui.QTextTable#appendColumns(int) appendColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertRows(int pos, int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRows_int_int(nativeId(), pos, num);
    }
    @QtBlockedSlot
    native void __qt_insertRows_int_int(long __this__nativeId, int pos, int num);

/**
This is an overloaded member function, provided for convenience. <p>Merges the cells selected by the provided <tt>cursor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#splitCell(int, int, int, int) splitCell()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeCells(com.trolltech.qt.gui.QTextCursor cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeCells_QTextCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mergeCells_QTextCursor(long __this__nativeId, long cursor);

/**
Merges the cell at the specified <tt>row</tt> and <tt>column</tt> with the adjacent cells into one cell. The new cell will span <tt>numRows</tt> rows and <tt>numCols</tt> columns. If <tt>numRows</tt> or <tt>numCols</tt> is less than the current number of rows or columns the cell spans then this method does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#splitCell(int, int, int, int) splitCell()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeCells(int row, int col, int numRows, int numCols)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeCells_int_int_int_int(nativeId(), row, col, numRows, numCols);
    }
    @QtBlockedSlot
    native void __qt_mergeCells_int_int_int_int(long __this__nativeId, int row, int col, int numRows, int numCols);

/**
Removes a number of <tt>columns</tt> starting with the column at the specified <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#appendRows(int) appendRows()}, and {@link com.trolltech.qt.gui.QTextTable#appendColumns(int) appendColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeColumns(int pos, int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeColumns_int_int(nativeId(), pos, num);
    }
    @QtBlockedSlot
    native void __qt_removeColumns_int_int(long __this__nativeId, int pos, int num);

/**
Removes a number of <tt>rows</tt> starting with the row at the specified <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#resize(int, int) resize()}, {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}, {@link com.trolltech.qt.gui.QTextTable#appendRows(int) appendRows()}, and {@link com.trolltech.qt.gui.QTextTable#appendColumns(int) appendColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeRows(int pos, int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeRows_int_int(nativeId(), pos, num);
    }
    @QtBlockedSlot
    native void __qt_removeRows_int_int(long __this__nativeId, int pos, int num);

/**
Resizes the table to contain the required number of <tt>rows</tt> and <tt>columns</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#insertRows(int, int) insertRows()}, {@link com.trolltech.qt.gui.QTextTable#insertColumns(int, int) insertColumns()}, {@link com.trolltech.qt.gui.QTextTable#removeRows(int, int) removeRows()}, and {@link com.trolltech.qt.gui.QTextTable#removeColumns(int, int) removeColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resize(int rows, int cols)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_int_int(nativeId(), rows, cols);
    }
    @QtBlockedSlot
    native void __qt_resize_int_int(long __this__nativeId, int rows, int cols);

/**
Returns a cursor pointing to the end of the row that contains the given <tt>cursor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#rowStart(com.trolltech.qt.gui.QTextCursor) rowStart()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor rowEnd(com.trolltech.qt.gui.QTextCursor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowEnd_QTextCursor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_rowEnd_QTextCursor(long __this__nativeId, long c);

/**
Returns a cursor pointing to the start of the row that contains the given <tt>cursor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#rowEnd(com.trolltech.qt.gui.QTextCursor) rowEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor rowStart(com.trolltech.qt.gui.QTextCursor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowStart_QTextCursor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_rowStart_QTextCursor(long __this__nativeId, long c);

/**
Returns the number of rows in the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#columns() columns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rows(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rows(long __this__nativeId);

/**
Sets the table's <tt>format</tt>. <p><DT><b>See also:</b><br><DD>format(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.gui.QTextTableFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QTextTableFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QTextTableFormat(long __this__nativeId, long format);

/**
Splits the specified cell at <tt>row</tt> and <tt>column</tt> into an array of multiple cells with dimensions specified by <tt>numRows</tt> and <tt>numCols</tt>. <p><b>Note:</b> It is only possible to split cells that span multiple rows or columns, such as rows that have been merged using {@link com.trolltech.qt.gui.QTextTable#mergeCells(com.trolltech.qt.gui.QTextCursor) mergeCells()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable#mergeCells(com.trolltech.qt.gui.QTextCursor) mergeCells()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void splitCell(int row, int col, int numRows, int numCols)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_splitCell_int_int_int_int(nativeId(), row, col, numRows, numCols);
    }
    @QtBlockedSlot
    native void __qt_splitCell_int_int_int_int(long __this__nativeId, int row, int col, int numRows, int numCols);

/**
@exclude
*/

    public static native QTextTable fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTable(QPrivateConstructor p) { super(p); } 
}
