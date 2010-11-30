package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextTableFormat class provides formatting information for tables in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A table is a group of cells ordered into rows and columns. Each table contains at least one row and one column. Each cell contains a block. Tables in rich text documents are formatted using the properties defined in this class. <p>Tables are horizontally justified within their parent frame according to the table's alignment. This can be read with the {@link com.trolltech.qt.gui.QTextTableFormat#alignment() alignment()} function and set with {@link com.trolltech.qt.gui.QTextTableFormat#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <p>Cells within the table are separated by cell spacing. The number of pixels between cells is set with {@link com.trolltech.qt.gui.QTextTableFormat#setCellSpacing(double) setCellSpacing()} and read with {@link com.trolltech.qt.gui.QTextTableFormat#cellSpacing() cellSpacing()}. The contents of each cell is surrounded by cell padding. The number of pixels between each cell edge and its contents is set with {@link com.trolltech.qt.gui.QTextTableFormat#setCellPadding(double) setCellPadding()} and read with {@link com.trolltech.qt.gui.QTextTableFormat#cellPadding() cellPadding()}. <br><center><img src="../images/qtexttableformat-cell.png"></center><br> The table's background color can be read with the {@link com.trolltech.qt.gui.QTextFormat#background() background()} function, and can be specified with {@link com.trolltech.qt.gui.QTextFormat#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. The background color of each cell can be set independently, and will control the color of the cell within the padded area. <p>The table format also provides a way to constrain the widths of the columns in the table. Columns can be assigned a fixed width, a variable width, or a percentage of the available width (see {@link com.trolltech.qt.gui.QTextLength QTextLength}). The {@link com.trolltech.qt.gui.QTextTableFormat#columns() columns()} function returns the number of columns with constraints, and the {@link com.trolltech.qt.gui.QTextTableFormat#columnWidthConstraints() columnWidthConstraints()} function returns the constraints defined for the table. These quantities can also be set by calling {@link com.trolltech.qt.gui.QTextTableFormat#setColumnWidthConstraints(java.util.List) setColumnWidthConstraints()} with a vector containing new constraints. If no constraints are required, {@link com.trolltech.qt.gui.QTextTableFormat#clearColumnWidthConstraints() clearColumnWidthConstraints()} can be used to remove them. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable QTextTable}, {@link com.trolltech.qt.gui.QTextTableCell QTextTableCell}, and {@link com.trolltech.qt.gui.QTextLength QTextLength}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextTableFormat extends com.trolltech.qt.gui.QTextFrameFormat
    implements java.lang.Cloneable
{

/**
Constructs a new table format object.
*/

    public QTextTableFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextTableFormat();
    }

    native void __qt_QTextTableFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTableFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextTableFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextTableFormat_QTextFormat(long fmt);

/**
Returns the table's alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
Returns the table's cell padding. This describes the distance between the border of a cell and its contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#setCellPadding(double) setCellPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double cellPadding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellPadding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_cellPadding(long __this__nativeId);

/**
Returns the table's cell spacing. This describes the distance between adjacent cells. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#setCellSpacing(double) setCellSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double cellSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_cellSpacing(long __this__nativeId);

/**
Clears the column width constraints for the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#columnWidthConstraints() columnWidthConstraints()}, and {@link com.trolltech.qt.gui.QTextTableFormat#setColumnWidthConstraints(java.util.List) setColumnWidthConstraints()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearColumnWidthConstraints()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearColumnWidthConstraints(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearColumnWidthConstraints(long __this__nativeId);

/**
Returns a list of constraints used by this table format to control the appearance of columns in a table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#setColumnWidthConstraints(java.util.List) setColumnWidthConstraints()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextLength> columnWidthConstraints()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnWidthConstraints(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextLength> __qt_columnWidthConstraints(long __this__nativeId);

/**
Returns the number of columns specified by the table format.
*/

    @QtBlockedSlot
    public final int columns()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columns(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columns(long __this__nativeId);

/**
Returns the number of rows in the table that define the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#setHeaderRowCount(int) setHeaderRowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int headerRowCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerRowCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_headerRowCount(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the table's <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);

/**
Sets the cell <tt>padding</tt> for the table. This determines the distance between the border of a cell and its contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#cellPadding() cellPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCellPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCellPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setCellPadding_double(long __this__nativeId, double padding);

/**
Sets the cell <tt>spacing</tt> for the table. This determines the distance between adjacent cells. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#cellSpacing() cellSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCellSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCellSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setCellSpacing_double(long __this__nativeId, double spacing);

/**
Sets the column width <tt>constraints</tt> for the table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#columnWidthConstraints() columnWidthConstraints()}, and {@link com.trolltech.qt.gui.QTextTableFormat#clearColumnWidthConstraints() clearColumnWidthConstraints()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnWidthConstraints(java.util.List<com.trolltech.qt.gui.QTextLength> constraints)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnWidthConstraints_List(nativeId(), constraints);
    }
    @QtBlockedSlot
    native void __qt_setColumnWidthConstraints_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTextLength> constraints);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setColumns(int columns)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumns_int(nativeId(), columns);
    }
    @QtBlockedSlot
    native void __qt_setColumns_int(long __this__nativeId, int columns);

/**
Declares the first <tt>count</tt> rows of the table as table header. The table header rows get repeated when a table is broken across a page boundary. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableFormat#headerRowCount() headerRowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeaderRowCount(int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderRowCount_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_setHeaderRowCount_int(long __this__nativeId, int count);

/**
@exclude
*/

    public static native QTextTableFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTableFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextTableFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextTableFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextTableFormat __qt_clone(long __this_nativeId);
}
