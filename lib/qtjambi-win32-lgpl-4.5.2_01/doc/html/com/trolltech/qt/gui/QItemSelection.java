package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemSelection class manages information about selected items in a model. A QItemSelection describes the items in a model that have been selected by the user. A QItemSelection is basically a list of selection ranges, see {@link com.trolltech.qt.gui.QItemSelectionRange QItemSelectionRange}. It provides functions for creating and manipulating selections, and selecting a range of items from a model. <p>The QItemSelection class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>An item selection can be constructed and initialized to contain a range of items from an existing model. The following example constructs a selection that contains a range of items from the given <tt>model</tt>, beginning at the <tt>topLeft</tt>, and ending at the <tt>bottomRight</tt>. <pre class="snippet">
    QItemSelection selection = new QItemSelection(topLeft, bottomRight);
</pre> An empty item selection can be constructed, and later populated as required. So, if the model is going to be unavailable when we construct the item selection, we can rewrite the above code in the following way: <pre class="snippet">
    QItemSelection selection = new QItemSelection();
    // ...
    selection.select(topLeft, bottomRight);
</pre> QItemSelection saves memory, and avoids unnecessary work, by working with selection ranges rather than recording the model item index for each item in the selection. Generally, an instance of this class will contain a list of non-overlapping selection ranges. <p>Use {@link com.trolltech.qt.gui.QItemSelection#merge(com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) merge()} to merge one item selection into another without making overlapping ranges. Use {@link com.trolltech.qt.gui.QItemSelection#split(com.trolltech.qt.gui.QItemSelectionRange, com.trolltech.qt.gui.QItemSelectionRange, com.trolltech.qt.gui.QItemSelection) split()} to split one selection range into smaller ranges based on a another selection range. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link com.trolltech.qt.gui.QItemSelectionModel QItemSelectionModel}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QItemSelection extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty selection.
*/

    public QItemSelection(){
        super((QPrivateConstructor)null);
        __qt_QItemSelection();
    }

    native void __qt_QItemSelection();

/**
Constructs an item selection that extends from the top-left model item, specified by the <tt>topLeft</tt> index, to the bottom-right item, specified by <tt>bottomRight</tt>.
*/

    public QItemSelection(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight){
        super((QPrivateConstructor)null);
        __qt_QItemSelection_QModelIndex_QModelIndex(topLeft, bottomRight);
    }

    native void __qt_QItemSelection_QModelIndex_QModelIndex(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);

/**
Appends <tt>t</tt> to this QItemSelection.
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QItemSelectionRange(long __this__nativeId, long t);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void append(java.util.List<com.trolltech.qt.gui.QItemSelectionRange> t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_List(nativeId(), t);
    }
    @QtBlockedSlot
    native void __qt_append_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QItemSelectionRange> t);

/**
Returns the QItemSelectionRange at position <tt>i</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_at_int(long __this__nativeId, int i);

/**
Returns the last item selection range in this QItemSelection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange back()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_back(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_back(long __this__nativeId);

/**
Clears this item selection of ranges.
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns true if the selection contains the given <tt>index</tt>; otherwise returns false.
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
Returns the number of QItemSelectionRanges in this QItemSelection.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int count(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native int __qt_count_QItemSelectionRange(long __this__nativeId, long t);

/**
Returns true if this QItemSelection is empty.
*/

    @QtBlockedSlot
    public final boolean empty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_empty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_empty(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean endsWith(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_QItemSelectionRange(long __this__nativeId, long t);

/**
Returns the first QItemSelectionRange in this item selection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange first()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_first(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_first(long __this__nativeId);

/**
Returns the font of this QItemSelection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange front()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_front(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_front(long __this__nativeId);


/**
Returns the index of <tt>t</tt> - searching from index <tt>from</tt>.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QItemSelectionRange t) {
        return indexOf(t, (int)0);
    }
/**
Returns the index of <tt>t</tt> - searching from index <tt>from</tt>.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QItemSelectionRange t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QItemSelectionRange_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_QItemSelectionRange_int(long __this__nativeId, long t, int from);

/**
Returns a list of model indexes that correspond to the selected items.
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
Returns true if there are no QItemSelectionRanges in this QItemSelection; otherwise, returns false.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns the last QItemSelectionRange in this QItemSelection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange last()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_last(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_last(long __this__nativeId);


/**
Returns the last index if <tt>t</tt> in this QItemSelection.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.gui.QItemSelectionRange t) {
        return lastIndexOf(t, (int)-1);
    }
/**
Returns the last index if <tt>t</tt> in this QItemSelection.
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.gui.QItemSelectionRange t, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_QItemSelectionRange_int(nativeId(), t == null ? 0 : t.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_QItemSelectionRange_int(long __this__nativeId, long t, int from);

/**

*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void merge(com.trolltech.qt.gui.QItemSelection other, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.merge(other, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Merges the <tt>other</tt> selection with this QItemSelection using the <tt>command</tt> given. This method guarantees that no ranges are overlapping. <p>Note that only {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::Select }, {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::Deselect }, and {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::Toggle } are supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelection#split(com.trolltech.qt.gui.QItemSelectionRange, com.trolltech.qt.gui.QItemSelectionRange, com.trolltech.qt.gui.QItemSelection) split()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void merge(com.trolltech.qt.gui.QItemSelection other, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_merge_QItemSelection_SelectionFlags(nativeId(), other == null ? 0 : other.nativeId(), command.value());
    }
    @QtBlockedSlot
    native void __qt_merge_QItemSelection_SelectionFlags(long __this__nativeId, long other, int command);


/**
Returns a java.util.List containing<tt>length</tt> elements of the QItemSelectionRanges from index <tt>pos</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QItemSelectionRange> mid(int pos) {
        return mid(pos, (int)-1);
    }
/**
Returns a java.util.List containing<tt>length</tt> elements of the QItemSelectionRanges from index <tt>pos</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QItemSelectionRange> mid(int pos, int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid_int_int(nativeId(), pos, length);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QItemSelectionRange> __qt_mid_int_int(long __this__nativeId, int pos, int length);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void move(int from, int to)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_move_int_int(nativeId(), from, to);
    }
    @QtBlockedSlot
    native void __qt_move_int_int(long __this__nativeId, int from, int to);

    @QtBlockedSlot
    private final boolean operator_equal(java.util.List<com.trolltech.qt.gui.QItemSelectionRange> l)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_List(nativeId(), l);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QItemSelectionRange> l);

/**
Returns the last QItemSelectionRange in this QItemSelection, and then removes it.
*/

    @QtBlockedSlot
    public final void pop_back()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pop_back(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pop_back(long __this__nativeId);

/**
Returns the first QItemSelectionRange in this QItemSelection, and then removes the range.
*/

    @QtBlockedSlot
    public final void pop_front()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pop_front(nativeId());
    }
    @QtBlockedSlot
    native void __qt_pop_front(long __this__nativeId);

/**
Inserts <tt>t</tt> as the first item selection range in this QItemSelection.
*/

    @QtBlockedSlot
    public final void prepend(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prepend_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_prepend_QItemSelectionRange(long __this__nativeId, long t);

/**
This function appends <tt>t</tt> to this QItemSelection's QItemSelectionRanges.
*/

    @QtBlockedSlot
    public final void push_back(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_back_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_back_QItemSelectionRange(long __this__nativeId, long t);

/**
Inserts <tt>t</tt> to the front of this QItemSelection's QItemSelectionRanges.
*/

    @QtBlockedSlot
    public final void push_front(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_push_front_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_push_front_QItemSelectionRange(long __this__nativeId, long t);

/**
Removes all item selection ranges from the given QItemSlecectionRange <tt>t</tt>.
*/

    @QtBlockedSlot
    public final int removeAll(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeAll_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native int __qt_removeAll_QItemSelectionRange(long __this__nativeId, long t);

/**
Removes the QItemSelectionRange at index <tt>i</tt>.
*/

    @QtBlockedSlot
    public final void removeAt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAt_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_removeAt_int(long __this__nativeId, int i);

/**
Removes the first item selection range in this QItemSelection.
*/

    @QtBlockedSlot
    public final void removeFirst()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeFirst(nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeFirst(long __this__nativeId);

/**
Removes the last item selection range in this QItemSelection.
*/

    @QtBlockedSlot
    public final void removeLast()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeLast(nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeLast(long __this__nativeId);

/**
Removes <tt>t</tt> from this QItemSelection.
*/

    @QtBlockedSlot
    public final boolean removeOne(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeOne_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_removeOne_QItemSelectionRange(long __this__nativeId, long t);

/**
Replaces the QItemSelectionRange at index <tt>i</tt> with <tt>t</tt>.
*/

    @QtBlockedSlot
    public final void replace(int i, com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replace_int_QItemSelectionRange(nativeId(), i, t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native void __qt_replace_int_QItemSelectionRange(long __this__nativeId, int i, long t);

/**
Adds the items in the range that extends from the top-left model item, specified by the <tt>topLeft</tt> index, to the bottom-right item, specified by <tt>bottomRight</tt> to the list. <p><b>Note:</b><tt>topLeft</tt> and <tt>bottomRight</tt> must have the same parent.
*/

    @QtBlockedSlot
    public final void select(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_select_QModelIndex_QModelIndex(nativeId(), topLeft, bottomRight);
    }
    @QtBlockedSlot
    native void __qt_select_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSharable(boolean sharable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSharable_boolean(nativeId(), sharable);
    }
    @QtBlockedSlot
    native void __qt_setSharable_boolean(long __this__nativeId, boolean sharable);

/**
Returns the number of QItemSelectionRanges in this QItemSelection.
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean startsWith(com.trolltech.qt.gui.QItemSelectionRange t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_QItemSelectionRange(nativeId(), t == null ? 0 : t.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_QItemSelectionRange(long __this__nativeId, long t);

/**
Swaps the positions of <tt>i</tt> and <tt>j</tt> in this QItemSelection.
*/

    @QtBlockedSlot
    public final void swap(int i, int j)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_swap_int_int(nativeId(), i, j);
    }
    @QtBlockedSlot
    native void __qt_swap_int_int(long __this__nativeId, int i, int j);

/**
Removes the last item selection range from this QItemSelection. The method returns the selection removed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange takeAt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeAt_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_takeAt_int(long __this__nativeId, int i);

/**
Removes the first QItemSelectionRange in this item selection, and then returns it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange takeFirst()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeFirst(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_takeFirst(long __this__nativeId);

/**
Removes last QItemSelectionRange in this item selection, and then returns it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange takeLast()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeLast(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_takeLast(long __this__nativeId);

/**
Returns all item selection ranges in this QItemSelection.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QItemSelectionRange> toVector()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toVector(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QItemSelectionRange> __qt_toVector(long __this__nativeId);

/**
Returns the QItemSelectionRange at index <tt>i</tt> in this item selection.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange value(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_value_int(long __this__nativeId, int i);

/**
Returns the QItemSelectionRange at index <tt>i</tt>. If <tt>i</tt> is out of bounds, <tt>defaultValue</tt> is returned.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionRange value(int i, com.trolltech.qt.gui.QItemSelectionRange defaultValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int_QItemSelectionRange(nativeId(), i, defaultValue == null ? 0 : defaultValue.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionRange __qt_value_int_QItemSelectionRange(long __this__nativeId, int i, long defaultValue);

/**
Returns a java.util.List of all QItemSelections in this QItemSelection.
*/

    public native static java.util.List<com.trolltech.qt.gui.QItemSelectionRange> fromVector(java.util.List<com.trolltech.qt.gui.QItemSelectionRange> vector);

    private static void split(com.trolltech.qt.gui.QItemSelectionRange range, com.trolltech.qt.gui.QItemSelectionRange other, com.trolltech.qt.QNativePointer result)    {
        __qt_split_QItemSelectionRange_QItemSelectionRange_nativepointer(range == null ? 0 : range.nativeId(), other == null ? 0 : other.nativeId(), result);
    }
    native static void __qt_split_QItemSelectionRange_QItemSelectionRange_nativepointer(long range, long other, com.trolltech.qt.QNativePointer result);

/**
@exclude
*/

    public static native QItemSelection fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QItemSelection(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QItemSelection array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof java.util.List)
        return operator_equal((java.util.List) other);
        return false;
    }


/**
Splits the selection <tt>range</tt> using the selection <tt>other</tt> range.
Removes all items in <tt>other</tt> from <tt>range</tt> and puts the result in
<tt>result</tt>.
*/

    public static void split(QItemSelectionRange range, QItemSelectionRange other, QItemSelection result) {
        com.trolltech.qt.QNativePointer np = result.nativePointer();
        split(range, other, np);
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QItemSelection clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QItemSelection __qt_clone(long __this_nativeId);
}
