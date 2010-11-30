package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemSelectionRange class manages information about a range of selected items in a model. A QItemSelectionRange contains information about a range of selected items in a model. A range of items is a contiguous array of model items, extending to cover a number of adjacent rows and columns with a common parent item; this can be visualized as a two-dimensional block of cells in a table. A selection range has a {@link com.trolltech.qt.gui.QItemSelectionRange#top() top()}, {@link com.trolltech.qt.gui.QItemSelectionRange#left() left()} a {@link com.trolltech.qt.gui.QItemSelectionRange#bottom() bottom()}, {@link com.trolltech.qt.gui.QItemSelectionRange#right() right()} and a {@link com.trolltech.qt.gui.QItemSelectionRange#parent() parent()}. <p>The QItemSelectionRange class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>The model items contained in the selection range can be obtained using the {@link com.trolltech.qt.gui.QItemSelectionRange#indexes() indexes()} function. Use {@link com.trolltech.qt.gui.QItemSelectionModel#selectedIndexes() QItemSelectionModel::selectedIndexes()} to get a list of all selected items for a view. <p>You can determine whether a given model item lies within a particular range by using the {@link com.trolltech.qt.gui.QItemSelectionRange#contains(com.trolltech.qt.core.QModelIndex) contains()} function. Ranges can also be compared using the overloaded operators for equality and inequality, and the {@link com.trolltech.qt.gui.QItemSelectionRange#intersects(com.trolltech.qt.gui.QItemSelectionRange) intersects()} function allows you to determine whether two ranges overlap. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link com.trolltech.qt.gui.QItemSelection QItemSelection}, and {@link com.trolltech.qt.gui.QItemSelectionModel QItemSelectionModel}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QItemSelectionRange extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty selection range.
*/

    public QItemSelectionRange(){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionRange();
    }

    native void __qt_QItemSelectionRange();

/**
Copy constructor. Constructs a new selection range with the same contents as the <tt>other</tt> range given.
*/

    public QItemSelectionRange(com.trolltech.qt.gui.QItemSelectionRange other){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionRange_QItemSelectionRange(other == null ? 0 : other.nativeId());
    }

    native void __qt_QItemSelectionRange_QItemSelectionRange(long other);

/**
Constructs a new selection range containing only the model item specified by the model index <tt>index</tt>.
*/

    public QItemSelectionRange(com.trolltech.qt.core.QModelIndex index){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionRange_QModelIndex(index);
    }

    native void __qt_QItemSelectionRange_QModelIndex(com.trolltech.qt.core.QModelIndex index);

/**
Constructs a new selection range containing only the index specified by the <tt>topLeft</tt> and the index <tt>bottomRight</tt>.
*/

    public QItemSelectionRange(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionRange_QModelIndex_QModelIndex(topLeft, bottomRight);
    }

    native void __qt_QItemSelectionRange_QModelIndex_QModelIndex(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);

/**
Returns the row index corresponding to the lowermost selected row in the selection range.
*/

    @QtBlockedSlot
    public final int bottom()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottom(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bottom(long __this__nativeId);

/**
Returns the index for the item located at the bottom-right corner of the selection range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionRange#bottom() bottom()}, {@link com.trolltech.qt.gui.QItemSelectionRange#right() right()}, and {@link com.trolltech.qt.gui.QItemSelectionRange#topLeft() topLeft()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex bottomRight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomRight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_bottomRight(long __this__nativeId);

/**
Returns true if the model item specified by the <tt>index</tt> lies within the range of selected items; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QModelIndex index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_contains_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the model item specified by (<tt>row</tt>, <tt>column</tt>) and with <tt>parentIndex</tt> as the parent item lies within the range of selected items; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(int row, int column, com.trolltech.qt.core.QModelIndex parentIndex)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_int_int_QModelIndex(nativeId(), row, column, parentIndex);
    }
    @QtBlockedSlot
    native boolean __qt_contains_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parentIndex);

/**
Returns the number of selected rows in the selection range.
*/

    @QtBlockedSlot
    public final int height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns the list of model index items stored in the selection.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> indexes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_indexes(long __this__nativeId);

/**
Returns a new selection range containing only the items that are found in both the selection range and the <tt>other</tt> selection range.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange intersected(com.trolltech.qt.gui.QItemSelectionRange other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersected_QItemSelectionRange(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_intersected_QItemSelectionRange(long __this__nativeId, long other);

/**
Returns true if this selection range intersects (overlaps with) the <tt>other</tt> range given; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean intersects(com.trolltech.qt.gui.QItemSelectionRange other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intersects_QItemSelectionRange(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_intersects_QItemSelectionRange(long __this__nativeId, long other);

/**
Returns true if the selection range is valid; otherwise returns false.
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
Returns the column index corresponding to the leftmost selected column in the selection range.
*/

    @QtBlockedSlot
    public final int left()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_left(nativeId());
    }
    @QtBlockedSlot
    native int __qt_left(long __this__nativeId);

/**
Returns the model that the items in the selection range belong to.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel model()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_model(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QItemSelectionRange other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QItemSelectionRange(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QItemSelectionRange(long __this__nativeId, long other);

/**
Returns the parent model item index of the items in the selection range.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex parent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent(long __this__nativeId);

/**
Returns the column index corresponding to the rightmost selected column in the selection range.
*/

    @QtBlockedSlot
    public final int right()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_right(nativeId());
    }
    @QtBlockedSlot
    native int __qt_right(long __this__nativeId);

/**
Returns the row index corresponding to the uppermost selected row in the selection range.
*/

    @QtBlockedSlot
    public final int top()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_top(nativeId());
    }
    @QtBlockedSlot
    native int __qt_top(long __this__nativeId);

/**
Returns the index for the item located at the top-left corner of the selection range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionRange#top() top()}, {@link com.trolltech.qt.gui.QItemSelectionRange#left() left()}, and {@link com.trolltech.qt.gui.QItemSelectionRange#bottomRight() bottomRight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex topLeft()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLeft(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_topLeft(long __this__nativeId);

/**
Returns the number of selected columns in the selection range.
*/

    @QtBlockedSlot
    public final int width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native int __qt_width(long __this__nativeId);

/**
@exclude
*/

    public static native QItemSelectionRange fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QItemSelectionRange(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QItemSelectionRange array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QItemSelectionRange)
        return operator_equal((com.trolltech.qt.gui.QItemSelectionRange) other);
        return false;
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

/**
<brief>Returns a string representation of the <tt>this QItemSelectionRange</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QItemSelectionRange clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QItemSelectionRange __qt_clone(long __this_nativeId);
}
