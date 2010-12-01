package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextTableCell class represents the properties of a cell in a {@link com.trolltech.qt.gui.QTextTable QTextTable}. Table cells are pieces of document structure that belong to a table. The table orders cells into particular rows and columns; cells can also span multiple columns and rows. <p>Cells are usually created when a table is inserted into a document with {@link com.trolltech.qt.gui.QTextCursor#insertTable(int, int) QTextCursor::insertTable()}, but they are also created and destroyed when a table is resized. <p>Cells contain information about their location in a table; you can obtain the {@link com.trolltech.qt.gui.QTextTableCell#row() row()} and {@link com.trolltech.qt.gui.QTextTableCell#column() column()} numbers of a cell, and its {@link com.trolltech.qt.gui.QTextTableCell#rowSpan() rowSpan()} and {@link com.trolltech.qt.gui.QTextTableCell#columnSpan() columnSpan()}. <p>The {@link com.trolltech.qt.gui.QTextTableCell#format() format()} of a cell describes the default character format of its contents. The {@link com.trolltech.qt.gui.QTextTableCell#firstCursorPosition() firstCursorPosition()} and {@link com.trolltech.qt.gui.QTextTableCell#lastCursorPosition() lastCursorPosition()} functions are used to obtain the extent of the cell in the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable QTextTable}, and {@link com.trolltech.qt.gui.QTextTableFormat QTextTableFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextTableCell extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an invalid table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#isValid() isValid()}. <br></DD></DT>
*/

    public QTextTableCell(){
        super((QPrivateConstructor)null);
        __qt_QTextTableCell();
    }

    native void __qt_QTextTableCell();

/**
Copy constructor. Creates a new QTextTableCell object based on the <tt>other</tt> cell.
*/

    public QTextTableCell(com.trolltech.qt.gui.QTextTableCell o){
        super((QPrivateConstructor)null);
        __qt_QTextTableCell_QTextTableCell(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextTableCell_QTextTableCell(long o);

/**
Returns a frame iterator pointing to the beginning of the table's cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#end() end()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame_iterator begin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame_iterator __qt_begin(long __this__nativeId);

/**
Returns the number of the column in the table that contains this cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#row() row()}. <br></DD></DT>
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
Returns the number of columns this cell spans. The default is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#rowSpan() rowSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnSpan()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnSpan(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnSpan(long __this__nativeId);

/**
Returns a frame iterator pointing to the end of the table's cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#begin() begin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame_iterator end()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_end(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame_iterator __qt_end(long __this__nativeId);

/**
Returns the first valid cursor position in this cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#lastCursorPosition() lastCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor firstCursorPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstCursorPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_firstCursorPosition(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int firstPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_firstPosition(long __this__nativeId);

/**
Returns the cell's character format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#setFormat(com.trolltech.qt.gui.QTextCharFormat) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_format(long __this__nativeId);

/**
Returns true if this is a valid table cell; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the last valid cursor position in this cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#firstCursorPosition() firstCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor lastCursorPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastCursorPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_lastCursorPosition(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int lastPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lastPosition(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextTableCell other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextTableCell(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextTableCell(long __this__nativeId, long other);

/**
Returns the number of the row in the table that contains this cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#column() column()}. <br></DD></DT>
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
Returns the number of rows this cell spans. The default is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#columnSpan() columnSpan()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowSpan()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowSpan(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rowSpan(long __this__nativeId);

/**
Sets the cell's character format to <tt>format</tt>. This can for example be used to change the background color of the entire cell: <p>QTextTableCell cell = table-&gt;cellAt(2, 3); {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} format = cell.{@link com.trolltech.qt.gui.QTextTableCell#format() format()}; format.setBackground({@link com.trolltech.qt.core.Qt.GlobalColor Qt::blue }); cell.setFormat(format); <p>Note that the cell's row or column span cannot be changed through this function. You have to use QTextTable::mergeCells and QTextTable::splitCell instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCell#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QTextCharFormat(long __this__nativeId, long format);

/**
Returns the index of the tableCell's format in the document's internal list of formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#allFormats() QTextDocument::allFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int tableCellFormatIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableCellFormatIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tableCellFormatIndex(long __this__nativeId);

/**
@exclude
*/

    public static native QTextTableCell fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTableCell(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextTableCell array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextTableCell)
        return operator_equal((com.trolltech.qt.gui.QTextTableCell) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextTableCell clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextTableCell __qt_clone(long __this_nativeId);
}
