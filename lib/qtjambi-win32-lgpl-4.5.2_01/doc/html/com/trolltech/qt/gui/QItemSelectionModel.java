package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemSelectionModel class keeps track of a view's selected items. A QItemSelectionModel keeps track of the selected items in a view, or in several views onto the same model. It also keeps track of the currently selected item in a view. <p>The QItemSelectionModel class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>The selected items are stored using ranges. Whenever you want to modify the selected items use {@link com.trolltech.qt.gui.QItemSelectionModel#select(com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) select()} and provide either a {@link com.trolltech.qt.gui.QItemSelection QItemSelection}, or a QModelIndex and a {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::SelectionFlag }. <p>The QItemSelectionModel takes a two layer approach to selection management, dealing with both selected items that have been committed and items that are part of the current selection. The current selected items are part of the current interactive selection (for example with rubber-band selection or keyboard-shift selections). <p>To update the currently selected items, use the bitwise OR of {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::Current } and any of the other SelectionFlags. If you omit the {@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::Current } command, a new current selection will be created, and the previous one added to the whole selection. All functions operate on both layers; for example, selectedItems() will return items from both layers. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, and {@link <a href="../itemviews-chart.html">Chart Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QItemSelectionModel extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the way the selection model will be updated.
*/
@QtBlockedEnum
    public enum
/**
 All specified indexes will be selected.
*/
 SelectionFlag implements com.trolltech.qt.QtEnumerator {
/**
 No selection will be made.
*/

        NoUpdate(0),
/**
 The complete selection will be cleared.
*/

        Clear(1),
        Select(2),
/**
 All specified indexes will be deselected.
*/

        Deselect(4),
/**
 All specified indexes will be selected or deselected depending on their current state.
*/

        Toggle(8),
/**
 The current selection will be updated.
*/

        Current(16),
/**
 All indexes will be expanded to span rows.
*/

        Rows(32),
/**
 All indexes will be expanded to span columns.
*/

        Columns(64),
/**
 A combination of Select and Current, provided for convenience.
*/

        SelectCurrent(18),
/**
 A combination of Toggle and Current, provided for convenience.
*/

        ToggleCurrent(24),
/**
 A combination of Clear and Select, provided for convenience.
*/

        ClearAndSelect(3);

        SelectionFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QItemSelectionModel$SelectionFlags with the specified <tt>com.trolltech.qt.gui.QItemSelectionModel$SelectionFlag[]</tt> QItemSelectionModel$SelectionFlag values set.</brief>
*/

        public static SelectionFlags createQFlags(SelectionFlag ... values) {
            return new SelectionFlags(values);
        }
/**
<brief>Returns the QItemSelectionModel$SelectionFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionFlag resolve(int value) {
            return (SelectionFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoUpdate;
            case 1: return Clear;
            case 2: return Select;
            case 4: return Deselect;
            case 8: return Toggle;
            case 16: return Current;
            case 32: return Rows;
            case 64: return Columns;
            case 18: return SelectCurrent;
            case 24: return ToggleCurrent;
            case 3: return ClearAndSelect;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class SelectionFlags extends com.trolltech.qt.QFlags<SelectionFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QItemSelectionModel-SelectionFlags with the specified <tt>com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]</tt>. flags set.</brief>
*/

        public SelectionFlags(SelectionFlag ... args) { super(args); }
        public SelectionFlags(int value) { setValue(value); }
    }


/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: current), com.trolltech.qt.core.QModelIndex(named: previous)&gt;:<p> This signal is emitted whenever the current item changes. The <tt>previous</tt> model item index is replaced by the <tt>current</tt> index as the selection's current item. <p>Note that this signal will not be emitted when the item model is reset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#currentIndex() currentIndex()}, {@link com.trolltech.qt.gui.QItemSelectionModel#setCurrentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) setCurrentIndex()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() }. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex> currentChanged = new Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex>();

    private final void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: current), com.trolltech.qt.core.QModelIndex(named: previous)&gt;:<p> This signal is emitted if the <tt>current</tt> item changes and its column is different to the column of the <tt>previous</tt> current item. <p>Note that this signal will not be emitted when the item model is reset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#currentChanged currentChanged() }, {@link com.trolltech.qt.gui.QItemSelectionModel#currentRowChanged currentRowChanged() }, {@link com.trolltech.qt.gui.QItemSelectionModel#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#setCurrentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) setCurrentIndex()}. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex> currentColumnChanged = new Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex>();

    private final void currentColumnChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentColumnChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    native void __qt_currentColumnChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: current), com.trolltech.qt.core.QModelIndex(named: previous)&gt;:<p> This signal is emitted if the <tt>current</tt> item changes and its row is different to the row of the <tt>previous</tt> current item. <p>Note that this signal will not be emitted when the item model is reset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#currentChanged currentChanged() }, {@link com.trolltech.qt.gui.QItemSelectionModel#currentColumnChanged currentColumnChanged() }, {@link com.trolltech.qt.gui.QItemSelectionModel#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#setCurrentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) setCurrentIndex()}. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex> currentRowChanged = new Signal2<com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex>();

    private final void currentRowChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentRowChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    native void __qt_currentRowChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QItemSelection(named: selected), com.trolltech.qt.gui.QItemSelection(named: deselected)&gt;:<p> This signal is emitted whenever the selection changes. The change in the selection is represented as an item selection of <tt>deselected</tt> items and an item selection of <tt>selected</tt> items. <p>Note the that the current index changes independently from the selection. Also note that this signal will not be emitted when the item model is reset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#select(com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) select()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#currentChanged currentChanged() }. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelection> selectionChanged = new Signal2<com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelection>();

    private final void selectionChanged(com.trolltech.qt.gui.QItemSelection selected, com.trolltech.qt.gui.QItemSelection deselected)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged_QItemSelection_QItemSelection(nativeId(), selected == null ? 0 : selected.nativeId(), deselected == null ? 0 : deselected.nativeId());
    }
    native void __qt_selectionChanged_QItemSelection_QItemSelection(long __this__nativeId, long selected, long deselected);

/**
Constructs a selection model that operates on the specified item <tt>model</tt>.
*/

    public QItemSelectionModel(com.trolltech.qt.core.QAbstractItemModel model){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionModel_QAbstractItemModel(model == null ? 0 : model.nativeId());
    }

    native void __qt_QItemSelectionModel_QAbstractItemModel(long model);

/**
Constructs a selection model that operates on the specified item <tt>model</tt> with <tt>parent</tt>.
*/

    public QItemSelectionModel(com.trolltech.qt.core.QAbstractItemModel model, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QItemSelectionModel_QAbstractItemModel_QObject(model == null ? 0 : model.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QItemSelectionModel_QAbstractItemModel_QObject(long model, long parent);

/**
Clears the selection in the selection model. Emits {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() }.
*/

    public final void clearSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearSelection(nativeId());
    }
    native void __qt_clearSelection(long __this__nativeId);

/**
Returns true if there are any items selected in the <tt>column</tt> with the given <tt>parent</tt>.
*/

    @QtBlockedSlot
    public final boolean columnIntersectsSelection(int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnIntersectsSelection_int_QModelIndex(nativeId(), column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_columnIntersectsSelection_int_QModelIndex(long __this__nativeId, int column, com.trolltech.qt.core.QModelIndex parent);

/**
Returns the model item index for the current item, or an invalid index if there is no current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#setCurrentIndex(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) setCurrentIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex currentIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_currentIndex(long __this__nativeId);

/**
Compares the two selections <tt>newSelection</tt> and <tt>oldSelection</tt> and emits {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() } with the deselected and selected items.
*/

    @QtBlockedSlot
    protected final void emitSelectionChanged(com.trolltech.qt.gui.QItemSelection newSelection, com.trolltech.qt.gui.QItemSelection oldSelection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_emitSelectionChanged_QItemSelection_QItemSelection(nativeId(), newSelection == null ? 0 : newSelection.nativeId(), oldSelection == null ? 0 : oldSelection.nativeId());
    }
    @QtBlockedSlot
    native void __qt_emitSelectionChanged_QItemSelection_QItemSelection(long __this__nativeId, long newSelection, long oldSelection);

/**
Returns true if the selection model contains any selection ranges; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasSelection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasSelection(long __this__nativeId);

/**
Returns true if all items are selected in the <tt>column</tt> with the given <tt>parent</tt>. <p>Note that this function is usually faster than calling {@link com.trolltech.qt.gui.QItemSelectionModel#isSelected(com.trolltech.qt.core.QModelIndex) isSelected()} on all items in the same column and that unselectable items are ignored.
*/

    @QtBlockedSlot
    public final boolean isColumnSelected(int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isColumnSelected_int_QModelIndex(nativeId(), column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_isColumnSelected_int_QModelIndex(long __this__nativeId, int column, com.trolltech.qt.core.QModelIndex parent);

/**
Returns true if all items are selected in the <tt>row</tt> with the given <tt>parent</tt>. <p>Note that this function is usually faster than calling {@link com.trolltech.qt.gui.QItemSelectionModel#isSelected(com.trolltech.qt.core.QModelIndex) isSelected()} on all items in the same row and that unselectable items are ignored.
*/

    @QtBlockedSlot
    public final boolean isRowSelected(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRowSelected_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_isRowSelected_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);

/**
Returns true if the given model item <tt>index</tt> is selected.
*/

    @QtBlockedSlot
    public final boolean isSelected(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelected_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isSelected_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the item model operated on by the selection model.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel model()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_model(long __this__nativeId);

/**
Returns true if there are any items selected in the <tt>row</tt> with the given <tt>parent</tt>.
*/

    @QtBlockedSlot
    public final boolean rowIntersectsSelection(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowIntersectsSelection_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_rowIntersectsSelection_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);


/**
Returns the indexes in row 0 for columns where all rows are
selected.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> selectedColumns() {
        return selectedColumns((int)0);
    }
/**
Returns the indexes in the given <tt>row</tt> for columns where all rows are selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#selectedIndexes() selectedIndexes()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#selectedRows() selectedRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> selectedColumns(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedColumns_int(nativeId(), row);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_selectedColumns_int(long __this__nativeId, int row);

/**
Returns a list of all selected model item indexes. The list contains no duplicates, and is not sorted.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> selectedIndexes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedIndexes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_selectedIndexes(long __this__nativeId);


/**
Returns the indexes in column 0 for the rows where all
columns are selected.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> selectedRows() {
        return selectedRows((int)0);
    }
/**
Returns the indexes in the given <tt>column</tt> for the rows where all columns are selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#selectedIndexes() selectedIndexes()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#selectedColumns() selectedColumns()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QModelIndex> selectedRows(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedRows_int(nativeId(), column);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_selectedRows_int(long __this__nativeId, int column);

/**
Returns the selection ranges stored in the selection model.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelection selection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelection __qt_selection(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public final void setCurrentIndex(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.setCurrentIndex(index, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Sets the model item <tt>index</tt> to be the current item, and emits {@link com.trolltech.qt.gui.QItemSelectionModel#currentChanged currentChanged() }. The current item is used for keyboard navigation and focus indication; it is independent of any selected items, although a selected item can also be the current item. <p>Depending on the specified <tt>command</tt>, the <tt>index</tt> can also become part of the current selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QItemSelectionModel#select(com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag[]) select()}. <br></DD></DT>
*/

    public final void setCurrentIndex(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIndex_QModelIndex_SelectionFlags(nativeId(), index, command.value());
    }
    native void __qt_setCurrentIndex_QModelIndex_SelectionFlags(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int command);

/**
Clears the selection model. Emits {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() } and {@link com.trolltech.qt.gui.QItemSelectionModel#currentChanged currentChanged() }.
*/

    public void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Clears the selection model. Does not emit any signals.
*/

    public void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    native void __qt_reset(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public final void select(com.trolltech.qt.gui.QItemSelection selection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.select(selection, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Selects the item <tt>selection</tt> using the specified <tt>command</tt>, and emits {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag QItemSelectionModel::SelectionFlag }. <br></DD></DT>
*/

    public void select(com.trolltech.qt.gui.QItemSelection selection, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_select_QItemSelection_SelectionFlags(nativeId(), selection == null ? 0 : selection.nativeId(), command.value());
    }
    native void __qt_select_QItemSelection_SelectionFlags(long __this__nativeId, long selection, int command);


/**
This is an overloaded method provided for convenience.
*/

    public final void select(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlag ... command) {
        this.select(index, new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(command));
    }
/**
Selects the model item <tt>index</tt> using the specified <tt>command</tt>, and emits {@link com.trolltech.qt.gui.QItemSelectionModel#selectionChanged selectionChanged() }. <p><DT><b>See also:</b><br><DD>QItemSelectionModel::SelectionFlags. <br></DD></DT>
*/

    public void select(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_select_QModelIndex_SelectionFlags(nativeId(), index, command.value());
    }
    native void __qt_select_QModelIndex_SelectionFlags(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int command);

/**
@exclude
*/

    public static native QItemSelectionModel fromNativePointer(QNativePointer nativePointer);

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

    protected QItemSelectionModel(QPrivateConstructor p) { super(p); } 
}
