package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAccessibleTableInterface extends com.trolltech.qt.gui.QAccessible2Interface
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAccessibleTableInterface {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface accessibleAt(int row, int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_accessibleAt_int_int(nativeId(), row, column);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface caption() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_caption(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleTableInterface.CellAtIndex cellAtIndex(int index) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_cellAtIndex_int_nativepointer_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), index);
        }

        @Override
        @QtBlockedSlot
        public int childIndex(int rowIndex, int columnIndex) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childIndex_int_int(nativeId(), rowIndex, columnIndex);
        }

        @Override
        @QtBlockedSlot
        public int columnCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String columnDescription(int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnDescription_int(nativeId(), column);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface columnHeader() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnHeader(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int columnIndex(int childIndex) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnIndex_int(nativeId(), childIndex);
        }

        @Override
        @QtBlockedSlot
        public int columnSpan(int row, int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_columnSpan_int_int(nativeId(), row, column);
        }

        @Override
        @QtBlockedSlot
        public boolean isColumnSelected(int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isColumnSelected_int(nativeId(), column);
        }

        @Override
        @QtBlockedSlot
        public boolean isRowSelected(int row) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isRowSelected_int(nativeId(), row);
        }

        @Override
        @QtBlockedSlot
        public boolean isSelected(int row, int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isSelected_int_int(nativeId(), row, column);
        }

        @Override
        @QtBlockedSlot
        public int rowCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String rowDescription(int row) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowDescription_int(nativeId(), row);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface rowHeader() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowHeader(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int rowIndex(int childIndex) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowIndex_int(nativeId(), childIndex);
        }

        @Override
        @QtBlockedSlot
        public int rowSpan(int row, int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rowSpan_int_int(nativeId(), row, column);
        }

        @Override
        @QtBlockedSlot
        public void selectColumn(int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_selectColumn_int(nativeId(), column);
        }

        @Override
        @QtBlockedSlot
        public void selectRow(int row) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_selectRow_int(nativeId(), row);
        }

        @Override
        @QtBlockedSlot
        public int selectedColumnCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_selectedColumnCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int selectedColumns(int maxColumns, java.util.List<Integer> columns) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_selectedColumns_int_nativepointer(nativeId(), maxColumns, columns);
        }

        @Override
        @QtBlockedSlot
        public int selectedRowCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_selectedRowCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int selectedRows(int maxRows, java.util.List<Integer> rows) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_selectedRows_int_nativepointer(nativeId(), maxRows, rows);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface summary() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_summary(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void unselectColumn(int column) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_unselectColumn_int(nativeId(), column);
        }

        @Override
        @QtBlockedSlot
        public void unselectRow(int row) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_unselectRow_int(nativeId(), row);
        }
    }


/**

*/

    public QAccessibleTableInterface(){
        super((QPrivateConstructor)null);
        __qt_QAccessibleTableInterface();
    }

    native void __qt_QAccessibleTableInterface();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface accessibleAt(int row, int column);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_accessibleAt_int_int(long __this__nativeId, int row, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface caption();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_caption(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleTableInterface.CellAtIndex cellAtIndex(int index);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleTableInterface.CellAtIndex __qt_cellAtIndex_int_nativepointer_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int childIndex(int rowIndex, int columnIndex);
    @QtBlockedSlot
    native int __qt_childIndex_int_int(long __this__nativeId, int rowIndex, int columnIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int columnCount();
    @QtBlockedSlot
    native int __qt_columnCount(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.String columnDescription(int column);
    @QtBlockedSlot
    native java.lang.String __qt_columnDescription_int(long __this__nativeId, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface columnHeader();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_columnHeader(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int columnIndex(int childIndex);
    @QtBlockedSlot
    native int __qt_columnIndex_int(long __this__nativeId, int childIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int columnSpan(int row, int column);
    @QtBlockedSlot
    native int __qt_columnSpan_int_int(long __this__nativeId, int row, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean isColumnSelected(int column);
    @QtBlockedSlot
    native boolean __qt_isColumnSelected_int(long __this__nativeId, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean isRowSelected(int row);
    @QtBlockedSlot
    native boolean __qt_isRowSelected_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean isSelected(int row, int column);
    @QtBlockedSlot
    native boolean __qt_isSelected_int_int(long __this__nativeId, int row, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int rowCount();
    @QtBlockedSlot
    native int __qt_rowCount(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.String rowDescription(int row);
    @QtBlockedSlot
    native java.lang.String __qt_rowDescription_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface rowHeader();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_rowHeader(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int rowIndex(int childIndex);
    @QtBlockedSlot
    native int __qt_rowIndex_int(long __this__nativeId, int childIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int rowSpan(int row, int column);
    @QtBlockedSlot
    native int __qt_rowSpan_int_int(long __this__nativeId, int row, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void selectColumn(int column);
    @QtBlockedSlot
    native void __qt_selectColumn_int(long __this__nativeId, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void selectRow(int row);
    @QtBlockedSlot
    native void __qt_selectRow_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int selectedColumnCount();
    @QtBlockedSlot
    native int __qt_selectedColumnCount(long __this__nativeId);

    @QtBlockedSlot
    public abstract int selectedColumns(int maxColumns, java.util.List<Integer> columns);
    @QtBlockedSlot
    native int __qt_selectedColumns_int_nativepointer(long __this__nativeId, int maxColumns, java.util.List<Integer> columns);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int selectedRowCount();
    @QtBlockedSlot
    native int __qt_selectedRowCount(long __this__nativeId);

    @QtBlockedSlot
    public abstract int selectedRows(int maxRows, java.util.List<Integer> rows);
    @QtBlockedSlot
    native int __qt_selectedRows_int_nativepointer(long __this__nativeId, int maxRows, java.util.List<Integer> rows);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface summary();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_summary(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void unselectColumn(int column);
    @QtBlockedSlot
    native void __qt_unselectColumn_int(long __this__nativeId, int column);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void unselectRow(int row);
    @QtBlockedSlot
    native void __qt_unselectRow_int(long __this__nativeId, int row);

/**
@exclude
*/

    public static native QAccessibleTableInterface fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleTableInterface(QPrivateConstructor p) { super(p); } 

    public static class CellAtIndex extends QTableArea {
        public CellAtIndex(int row, int column, int rowSpan, int columnSpan, boolean isSelected) {
            super(row, column, rowSpan, columnSpan);
            this.isSelected = isSelected;
        }

        public boolean isSelected;
    }

}
