package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTableWidgetSelectionRange class provides a way to interact with selection in a model without using model indexes and a selection model. The QTableWidgetSelectionRange class stores the top left and bottom right rows and columns of a selection range in a table. The selections in the table may consist of several selection ranges. <p><b>Note:</b> If the item within the selection range is marked as not selectable, e.g., <tt>itemFlags() & Qt::ItemIsSelectable == 0</tt> then it will not appear in the selection range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget QTableWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTableWidgetSelectionRange extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an table selection range, i. . a range whose {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rowCount() rowCount()} and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#columnCount() columnCount()} are 0.
*/

    public QTableWidgetSelectionRange(){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetSelectionRange();
    }

    native void __qt_QTableWidgetSelectionRange();

/**
Constructs a the table selection range by copying the given <tt>other</tt> table selection range.
*/

    public QTableWidgetSelectionRange(com.trolltech.qt.gui.QTableWidgetSelectionRange other){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetSelectionRange_QTableWidgetSelectionRange(other == null ? 0 : other.nativeId());
    }

    native void __qt_QTableWidgetSelectionRange_QTableWidgetSelectionRange(long other);

/**
Constructs the table selection range from the given <tt>top</tt>, <tt>left</tt>, <tt>bottom</tt> and <tt>right</tt> table rows and columns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#topRow() topRow()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#leftColumn() leftColumn()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#bottomRow() bottomRow()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rightColumn() rightColumn()}. <br></DD></DT>
*/

    public QTableWidgetSelectionRange(int top, int left, int bottom, int right){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetSelectionRange_int_int_int_int(top, left, bottom, right);
    }

    native void __qt_QTableWidgetSelectionRange_int_int_int_int(int top, int left, int bottom, int right);

/**
Returns the bottom row of the range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#topRow() topRow()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rightColumn() rightColumn()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rowCount() rowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bottomRow()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomRow(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bottomRow(long __this__nativeId);

/**
Returns the number of columns in the range. <p>This is equivalent to {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rightColumn() rightColumn()} - {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#leftColumn() leftColumn()} + 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rowCount() rowCount()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#leftColumn() leftColumn()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rightColumn() rightColumn()}. <br></DD></DT>
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
Returns the left column of the range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rightColumn() rightColumn()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#topRow() topRow()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int leftColumn()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_leftColumn(long __this__nativeId);

/**
Returns the right column of the range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#leftColumn() leftColumn()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#bottomRow() bottomRow()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#columnCount() columnCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rightColumn()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rightColumn(long __this__nativeId);

/**
Returns the number of rows in the range. <p>This is equivalent to {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#bottomRow() bottomRow()} - {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#topRow() topRow()} + 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#columnCount() columnCount()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#topRow() topRow()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#bottomRow() bottomRow()}. <br></DD></DT>
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
Returns the top row of the range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetSelectionRange#bottomRow() bottomRow()}, {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#leftColumn() leftColumn()}, and {@link com.trolltech.qt.gui.QTableWidgetSelectionRange#rowCount() rowCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int topRow()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topRow(nativeId());
    }
    @QtBlockedSlot
    native int __qt_topRow(long __this__nativeId);

/**
@exclude
*/

    public static native QTableWidgetSelectionRange fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTableWidgetSelectionRange(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTableWidgetSelectionRange array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTableWidgetSelectionRange clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTableWidgetSelectionRange __qt_clone(long __this_nativeId);
}
