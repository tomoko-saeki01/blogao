package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QPersistentModelIndex class is used to locate data in a data model. A QPersistentModelIndex is a model index that can be stored by an application, and later used to access information in a model. Unlike the QModelIndex class, it is safe to store a QPersistentModelIndex since the model will ensure that references to items will continue to be valid as long as they can be accessed by the model. <p>It is good practice to check that persistent model indexes are valid before using them. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, QModelIndex, and {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPersistentModelIndex extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QPersistentModelIndex(){
        super((QPrivateConstructor)null);
        __qt_QPersistentModelIndex();
    }

    native void __qt_QPersistentModelIndex();

/**
Creates a new QPersistentModelIndex that is a copy of the model <tt>index</tt>.
*/

    public QPersistentModelIndex(com.trolltech.qt.core.QModelIndex index){
        super((QPrivateConstructor)null);
        __qt_QPersistentModelIndex_QModelIndex(index);
    }

    native void __qt_QPersistentModelIndex_QModelIndex(com.trolltech.qt.core.QModelIndex index);

/**
Creates a new QPersistentModelIndex that is a copy of the <tt>other</tt> persistent model index.
*/

    public QPersistentModelIndex(com.trolltech.qt.core.QPersistentModelIndex other){
        super((QPrivateConstructor)null);
        __qt_QPersistentModelIndex_QPersistentModelIndex(other == null ? 0 : other.nativeId());
    }

    native void __qt_QPersistentModelIndex_QPersistentModelIndex(long other);

/**
Returns the child of the model index that is stored in the given <tt>row</tt> and <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPersistentModelIndex#parent() parent()}, and {@link com.trolltech.qt.core.QPersistentModelIndex#sibling(int, int) sibling()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex child(int row, int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_child_int_int(long __this__nativeId, int row, int column);

/**
Returns the column this persistent model index refers to.
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
Returns the data for the given <tt>role</tt> for the item referred to by the index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) QAbstractItemModel::setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data() {
        return data((int)0);
    }
/**
Returns the data for the given <tt>role</tt> for the item referred to by the index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) QAbstractItemModel::setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data(int role)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_int(nativeId(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_int(long __this__nativeId, int role);

/**
Returns the flags for the item referred to by the index.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ItemFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final long internalId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_internalId(nativeId());
    }
    @QtBlockedSlot
    native long __qt_internalId(long __this__nativeId);

/**
Returns true if this persistent model index is valid; otherwise returns false. A valid index belongs to a model, and has non-negative row and column numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPersistentModelIndex#model() model()}, {@link com.trolltech.qt.core.QPersistentModelIndex#row() row()}, and {@link com.trolltech.qt.core.QPersistentModelIndex#column() column()}. <br></DD></DT>
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
Returns the model that the index belongs to.
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
    private final boolean operator_less(com.trolltech.qt.core.QPersistentModelIndex other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QPersistentModelIndex(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QPersistentModelIndex(long __this__nativeId, long other);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QModelIndex other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QModelIndex(nativeId(), other);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex other);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QPersistentModelIndex other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPersistentModelIndex(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPersistentModelIndex(long __this__nativeId, long other);

/**
Returns the parent QModelIndex for this persistent index, or QModelIndex() if it has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPersistentModelIndex#child(int, int) child()}, {@link com.trolltech.qt.core.QPersistentModelIndex#sibling(int, int) sibling()}, and {@link com.trolltech.qt.core.QPersistentModelIndex#model() model()}. <br></DD></DT>
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
Returns the row this persistent model index refers to.
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
Returns the sibling at <tt>row</tt> and <tt>column</tt> or an invalid QModelIndex if there is no sibling at this position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QPersistentModelIndex#parent() parent()}, and {@link com.trolltech.qt.core.QPersistentModelIndex#child(int, int) child()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex sibling(int row, int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sibling_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_sibling_int_int(long __this__nativeId, int row, int column);

/**
@exclude
*/

    public static native QPersistentModelIndex fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPersistentModelIndex(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPersistentModelIndex array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QModelIndex)
        return operator_equal((com.trolltech.qt.core.QModelIndex) other);
    else if (other instanceof com.trolltech.qt.core.QPersistentModelIndex)
        return operator_equal((com.trolltech.qt.core.QPersistentModelIndex) other);
        return false;
    }

/**
Compares this object with the specified object for order. Returns a
negative integer, zero, or a positive integer as this object is less
than, equal to, or greater than the specified object.
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QPersistentModelIndex) {
            if (operator_less((com.trolltech.qt.core.QPersistentModelIndex) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
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
<brief>Returns a string representation of the <tt>this QPersistentModelIndex</tt>. </brief>
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
    public QPersistentModelIndex clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPersistentModelIndex __qt_clone(long __this_nativeId);
}
