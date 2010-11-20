package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractItemView class provides the basic functionality for item view classes. QAbstractItemView class is the base class for every standard view that uses a {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. QAbstractItemView is an abstract class and cannot itself be instantiated. It provides a standard interface for interoperating with models through the signals and slots mechanism, enabling subclasses to be kept up-to-date with changes to their models. This class provides standard support for keyboard and mouse navigation, viewport scrolling, item editing, and selections. <p>The QAbstractItemView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>The view classes that inherit QAbstractItemView only need to implement their own view-specific functionality, such as drawing items, returning the geometry of items, finding items, etc. <p>QAbstractItemView provides common slots such as {@link com.trolltech.qt.gui.QAbstractItemView#edit(com.trolltech.qt.core.QModelIndex) edit()} and {@link com.trolltech.qt.gui.QAbstractItemView#setCurrentIndex(com.trolltech.qt.core.QModelIndex) setCurrentIndex()}. Many protected slots are also provided, including {@link com.trolltech.qt.gui.QAbstractItemView#dataChanged(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) dataChanged()}, {@link com.trolltech.qt.gui.QAbstractItemView#rowsInserted(com.trolltech.qt.core.QModelIndex, int, int) rowsInserted()}, {@link com.trolltech.qt.gui.QAbstractItemView#rowsAboutToBeRemoved(com.trolltech.qt.core.QModelIndex, int, int) rowsAboutToBeRemoved()}, {@link com.trolltech.qt.gui.QAbstractItemView#selectionChanged(com.trolltech.qt.gui.QItemSelection, com.trolltech.qt.gui.QItemSelection) selectionChanged()}, and {@link com.trolltech.qt.gui.QAbstractItemView#currentChanged(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) currentChanged()}. <p>The root item is returned by {@link com.trolltech.qt.gui.QAbstractItemView#rootIndex() rootIndex()}, and the current item by {@link com.trolltech.qt.gui.QAbstractItemView#currentIndex() currentIndex()}. To make sure that an item is visible use {@link com.trolltech.qt.gui.QAbstractItemView#scrollTo(com.trolltech.qt.core.QModelIndex) scrollTo()}. <p>Some of QAbstractItemView's functions are concerned with scrolling, for example {@link com.trolltech.qt.gui.QAbstractItemView#setHorizontalScrollMode(com.trolltech.qt.gui.QAbstractItemView.ScrollMode) setHorizontalScrollMode()} and {@link com.trolltech.qt.gui.QAbstractItemView#setVerticalScrollMode(com.trolltech.qt.gui.QAbstractItemView.ScrollMode) setVerticalScrollMode()}. To set the range of the scroll bars, you can, for example, reimplement the view's resizeEvent() function:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MyView::resizeEvent(QResizeEvent *event) {
    horizontalScrollBar()-&gt;setRange(0, realWidth - width());
    ...
}
</pre> Note that the range is not updated until the widget is shown. <p>Several other functions are concerned with selection control; for example {@link com.trolltech.qt.gui.QAbstractItemView#setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode) setSelectionMode()}, and {@link com.trolltech.qt.gui.QAbstractItemView#setSelectionBehavior(com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior) setSelectionBehavior()}. This class provides a default selection model to work with ({@link com.trolltech.qt.gui.QAbstractItemView#selectionModel() selectionModel()}), but this can be replaced by using {@link com.trolltech.qt.gui.QAbstractItemView#setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel) setSelectionModel()} with an instance of {@link com.trolltech.qt.gui.QItemSelectionModel QItemSelectionModel}. <p>For complete control over the display and editing of items you can specify a delegate with {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <p>QAbstractItemView provides a lot of protected functions. Some are concerned with editing, for example, {@link com.trolltech.qt.gui.QAbstractItemView#edit(com.trolltech.qt.core.QModelIndex) edit()}, and {@link com.trolltech.qt.gui.QAbstractItemView#commitData(com.trolltech.qt.gui.QWidget) commitData()}, whilst others are keyboard and mouse event handlers. <p><b>Note:</b> If you inherit QAbstractItemView and intend to update the contents of the viewport, you should use viewport-&gt;{@link com.trolltech.qt.gui.QAbstractItemView#update(com.trolltech.qt.core.QModelIndex) update()} instead of {@link com.trolltech.qt.gui.QWidget#update() update()} as all painting operations take place on the viewport. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-view.html">View Classes</a>}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, and {@link <a href="../itemviews-chart.html">Chart Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractItemView extends com.trolltech.qt.gui.QAbstractScrollArea
{

    private Object __rcItemModel = null;

    private Object __rcItemDelegate = null;

    private Object __rcItemSelectionModel = null;

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractItemView {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected int horizontalOffset() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_horizontalOffset(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QModelIndex indexAt(com.trolltech.qt.core.QPoint point) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_indexAt_QPoint(nativeId(), point == null ? 0 : point.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected boolean isIndexHidden(com.trolltech.qt.core.QModelIndex index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isIndexHidden_QModelIndex(nativeId(), index);
        }

        @Override
        @QtBlockedSlot
        protected com.trolltech.qt.core.QModelIndex moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction cursorAction, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_moveCursor_CursorAction_KeyboardModifiers(nativeId(), cursorAction.value(), modifiers.value());
        }

        @Override
        @QtBlockedSlot
        public void scrollTo(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_scrollTo_QModelIndex_ScrollHint(nativeId(), index, hint.value());
        }

        @Override
        @QtBlockedSlot
        protected void setSelection(com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setSelection_QRect_SelectionFlags(nativeId(), rect == null ? 0 : rect.nativeId(), command.value());
        }

        @Override
        @QtBlockedSlot
        protected int verticalOffset() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_verticalOffset(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRect visualRect(com.trolltech.qt.core.QModelIndex index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_visualRect_QModelIndex(nativeId(), index);
        }

        @Override
        @QtBlockedSlot
        protected com.trolltech.qt.gui.QRegion visualRegionForSelection(com.trolltech.qt.gui.QItemSelection selection) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_visualRegionForSelection_QItemSelection(nativeId(), selection == null ? 0 : selection.nativeId());
        }
    }
/**
Describes the various drag and drop events the view can act upon. By default the view does not support dragging or dropping (<tt>NoDragDrop</tt>). Note that the model used needs to provide support for drag and drop operations. <p><DT><b>See also:</b><br><DD>setDragDropMode(), and {@link <a href="../model-view-dnd.html">Using Drag and Drop with Item Views</a>}. <br></DD></DT>
*/


    public enum
/**
 The view supports both dragging and dropping
*/
 DragDropMode implements com.trolltech.qt.QtEnumerator {
/**
 Does not support dragging or dropping.
*/

        NoDragDrop(0),
/**
 The view supports dragging of its own items
*/

        DragOnly(1),
/**
 The view accepts drops
*/

        DropOnly(2),
        DragDrop(3),
/**
 The view accepts move (<b>not copy</b>) operations only from itself.
*/

        InternalMove(4);

        DragDropMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$DragDropMode constant with the specified <tt>int</tt>.</brief>
*/

        public static DragDropMode resolve(int value) {
            return (DragDropMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoDragDrop;
            case 1: return DragOnly;
            case 2: return DropOnly;
            case 3: return DragDrop;
            case 4: return InternalMove;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum SelectionBehavior implements com.trolltech.qt.QtEnumerator {
/**
 Selecting single items.
*/

        SelectItems(0),
/**
 Selecting only rows.
*/

        SelectRows(1),
/**
 Selecting only columns.
*/

        SelectColumns(2);

        SelectionBehavior(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$SelectionBehavior constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionBehavior resolve(int value) {
            return (SelectionBehavior) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SelectItems;
            case 1: return SelectRows;
            case 2: return SelectColumns;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes actions which will initiate item editing.
*/
@QtBlockedEnum
    public enum EditTrigger implements com.trolltech.qt.QtEnumerator {
/**
 No editing possible.
*/

        NoEditTriggers(0),
/**
 Editing start whenever current item changes.
*/

        CurrentChanged(1),
/**
 Editing starts when an item is double clicked.
*/

        DoubleClicked(2),
/**
 Editing starts when clicking on an already selected item.
*/

        SelectedClicked(4),
/**
 Editing starts when the platform edit key has been pressed over an item.
*/

        EditKeyPressed(8),
/**
 Editing starts when any key is pressed over an item.
*/

        AnyKeyPressed(16),
/**
 Editing starts for all above actions.
*/

        AllEditTriggers(31);

        EditTrigger(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QAbstractItemView$EditTriggers with the specified <tt>com.trolltech.qt.gui.QAbstractItemView$EditTrigger[]</tt> QAbstractItemView$EditTrigger values set.</brief>
*/

        public static EditTriggers createQFlags(EditTrigger ... values) {
            return new EditTriggers(values);
        }
/**
<brief>Returns the QAbstractItemView$EditTrigger constant with the specified <tt>int</tt>.</brief>
*/

        public static EditTrigger resolve(int value) {
            return (EditTrigger) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoEditTriggers;
            case 1: return CurrentChanged;
            case 2: return DoubleClicked;
            case 4: return SelectedClicked;
            case 8: return EditKeyPressed;
            case 16: return AnyKeyPressed;
            case 31: return AllEditTriggers;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class EditTriggers extends com.trolltech.qt.QFlags<EditTrigger> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAbstractItemView-EditTriggers with the specified <tt>com.trolltech.qt.gui.QAbstractItemView.EditTrigger[]</tt>. flags set.</brief>
*/

        public EditTriggers(EditTrigger ... args) { super(args); }
        public EditTriggers(int value) { setValue(value); }
    }

    public enum ScrollMode implements com.trolltech.qt.QtEnumerator {
/**
 The view will scroll the contents one item at a time.
*/

        ScrollPerItem(0),
/**
 The view will scroll the contents one pixel at a time.
*/

        ScrollPerPixel(1);

        ScrollMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$ScrollMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ScrollMode resolve(int value) {
            return (ScrollMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ScrollPerItem;
            case 1: return ScrollPerPixel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the different ways to navigate between items, <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction, com.trolltech.qt.core.Qt.KeyboardModifiers) moveCursor()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum CursorAction implements com.trolltech.qt.QtEnumerator {
/**
 Move to the item above the current item.
*/

        MoveUp(0),
/**
 Move to the item below the current item.
*/

        MoveDown(1),
/**
 Move to the item left of the current item.
*/

        MoveLeft(2),
/**
 Move to the item right of the current item.
*/

        MoveRight(3),
/**
 Move to the top-left corner item.
*/

        MoveHome(4),
/**
 Move to the bottom-right corner item.
*/

        MoveEnd(5),
/**
 Move one page up above the current item.
*/

        MovePageUp(6),
/**
 Move one page down below the current item.
*/

        MovePageDown(7),
/**
 Move to the item after the current item.
*/

        MoveNext(8),
/**
 Move to the item before the current item.
*/

        MovePrevious(9);

        CursorAction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$CursorAction constant with the specified <tt>int</tt>.</brief>
*/

        public static CursorAction resolve(int value) {
            return (CursorAction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MoveUp;
            case 1: return MoveDown;
            case 2: return MoveLeft;
            case 3: return MoveRight;
            case 4: return MoveHome;
            case 5: return MoveEnd;
            case 6: return MovePageUp;
            case 7: return MovePageDown;
            case 8: return MoveNext;
            case 9: return MovePrevious;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum indicates the position of the drop indicator in relation to the index at the current mouse position.
*/
@QtBlockedEnum
    public enum DropIndicatorPosition implements com.trolltech.qt.QtEnumerator {
/**
 The item will be dropped on the index.
*/

        OnItem(0),
/**
 The item will be dropped above the index.
*/

        AboveItem(1),
/**
 The item will be dropped below the index.
*/

        BelowItem(2),
/**
 The item will be dropped onto a region of the viewport with no items. The way each view handles items dropped onto the viewport depends on the behavior of the underlying model in use.
*/

        OnViewport(3);

        DropIndicatorPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$DropIndicatorPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static DropIndicatorPosition resolve(int value) {
            return (DropIndicatorPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OnItem;
            case 1: return AboveItem;
            case 2: return BelowItem;
            case 3: return OnViewport;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ScrollHint implements com.trolltech.qt.QtEnumerator {
/**
 Scroll to ensure that the item is visible.
*/

        EnsureVisible(0),
/**
 Scroll to position the item at the top of the viewport.
*/

        PositionAtTop(1),
/**
 Scroll to position the item at the bottom of the viewport.
*/

        PositionAtBottom(2),
/**
 Scroll to position the item at the center of the viewport.
*/

        PositionAtCenter(3);

        ScrollHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$ScrollHint constant with the specified <tt>int</tt>.</brief>
*/

        public static ScrollHint resolve(int value) {
            return (ScrollHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return EnsureVisible;
            case 1: return PositionAtTop;
            case 2: return PositionAtBottom;
            case 3: return PositionAtCenter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum indicates how the view responds to user selections. The most commonly used modes are {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SingleSelection } and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode ExtendedSelection }.
*/

    public enum SelectionMode implements com.trolltech.qt.QtEnumerator {
/**
 Items cannot be selected.
*/

        NoSelection(0),
/**
 When the user selects an item, any already-selected item becomes unselected, and the user cannot unselect the selected item by clicking on it.
*/

        SingleSelection(1),
/**
 When the user selects an item in the usual way, the selection status of that item is toggled and the other items are left alone. Multiple items can be toggled by dragging the mouse over them.
*/

        MultiSelection(2),
/**
 When the user selects an item in the usual way, the selection is cleared and the new item selected. However, if the user presses the Ctrl key when clicking on an item, the clicked item gets toggled and all other items are left untouched. If the user presses the Shift key while clicking on an item, all items between the current item and the clicked item are selected or unselected, depending on the state of the clicked item. Multiple items can be selected by dragging the mouse over them.
*/

        ExtendedSelection(3),
/**
 When the user selects an item in the usual way, the selection is cleared and the new item selected. However, if the user presses the Shift key while clicking on an item, all items between the current item and the clicked item are selected or unselected, depending on the state of the clicked item.
*/

        ContiguousSelection(4);

        SelectionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$SelectionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionMode resolve(int value) {
            return (SelectionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoSelection;
            case 1: return SingleSelection;
            case 2: return MultiSelection;
            case 3: return ExtendedSelection;
            case 4: return ContiguousSelection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
Describes the different states the view can be in. This is usually only interesting when reimplementing your own view.
*/
@QtBlockedEnum
    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 The is the default state.
*/

        NoState(0),
/**
 The user is dragging items.
*/

        DraggingState(1),
/**
 The user is selecting items.
*/

        DragSelectingState(2),
/**
 The user is editing an item in a widget editor.
*/

        EditingState(3),
/**
 The user is opening a branch of items.
*/

        ExpandingState(4),
/**
 The user is closing a branch of items.
*/

        CollapsingState(5),
/**
 The item view is performing an animation.
*/

        AnimatingState(6);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemView$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoState;
            case 1: return DraggingState;
            case 2: return DragSelectingState;
            case 3: return EditingState;
            case 4: return ExpandingState;
            case 5: return CollapsingState;
            case 6: return AnimatingState;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when the item specified by <tt>index</tt> is activated by the user. How to activate items depends on the platform; e.g., by single- or double-clicking the item, or by pressing the Return or Enter key when the item is current. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#clicked clicked() }, {@link com.trolltech.qt.gui.QAbstractItemView#doubleClicked doubleClicked() }, {@link com.trolltech.qt.gui.QAbstractItemView#entered entered() }, and {@link com.trolltech.qt.gui.QAbstractItemView#pressed pressed() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> activated = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void activated(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_QModelIndex(nativeId(), index);
    }
    native void __qt_activated_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when a mouse button is clicked. The item the mouse was clicked on is specified by <tt>index</tt>. The signal is only emitted when the index is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#activated activated() }, {@link com.trolltech.qt.gui.QAbstractItemView#doubleClicked doubleClicked() }, {@link com.trolltech.qt.gui.QAbstractItemView#entered entered() }, and {@link com.trolltech.qt.gui.QAbstractItemView#pressed pressed() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> clicked = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void clicked(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clicked_QModelIndex(nativeId(), index);
    }
    native void __qt_clicked_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when a mouse button is double-clicked. The item the mouse was double-clicked on is specified by <tt>index</tt>. The signal is only emitted when the index is valid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#clicked clicked() }, and {@link com.trolltech.qt.gui.QAbstractItemView#activated activated() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> doubleClicked = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void doubleClicked(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doubleClicked_QModelIndex(nativeId(), index);
    }
    native void __qt_doubleClicked_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when the mouse cursor enters the item specified by <tt>index</tt>. Mouse tracking needs to be enabled for this feature to work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#viewportEntered viewportEntered() }, {@link com.trolltech.qt.gui.QAbstractItemView#activated activated() }, {@link com.trolltech.qt.gui.QAbstractItemView#clicked clicked() }, {@link com.trolltech.qt.gui.QAbstractItemView#doubleClicked doubleClicked() }, and {@link com.trolltech.qt.gui.QAbstractItemView#pressed pressed() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> entered = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void entered(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_entered_QModelIndex(nativeId(), index);
    }
    native void __qt_entered_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when a mouse button is pressed. The item the mouse was pressed on is specified by <tt>index</tt>. The signal is only emitted when the index is valid. <p>Use the {@link com.trolltech.qt.gui.QApplication#mouseButtons() QApplication::mouseButtons()} function to get the state of the mouse buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#activated activated() }, {@link com.trolltech.qt.gui.QAbstractItemView#clicked clicked() }, {@link com.trolltech.qt.gui.QAbstractItemView#doubleClicked doubleClicked() }, and {@link com.trolltech.qt.gui.QAbstractItemView#entered entered() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> pressed = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void pressed(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pressed_QModelIndex(nativeId(), index);
    }
    native void __qt_pressed_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
 This signal is emitted when the mouse cursor enters the viewport. Mouse tracking needs to be enabled for this feature to work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#entered entered() }. <br></DD></DT>
*/

    public final Signal0 viewportEntered = new Signal0();

    private final void viewportEntered()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_viewportEntered(nativeId());
    }
    native void __qt_viewportEntered(long __this__nativeId);


/**
Constructs an abstract item view with the given <tt>parent</tt>.
*/

    public QAbstractItemView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an abstract item view with the given <tt>parent</tt>.
*/

    public QAbstractItemView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractItemView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractItemView_QWidget(long parent);

/**
This property holds whether to draw the background using alternating colors. If this property is true, the item background will be drawn using {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Base } and {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::AlternateBase }; otherwise the background will be drawn using the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Base } color. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="alternatingRowColors")
    @QtBlockedSlot
    public final boolean alternatingRowColors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alternatingRowColors(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_alternatingRowColors(long __this__nativeId);

/**
This property holds the size of the area when auto scrolling is triggered. This property controlls the size of the area at the edge of the viewport that triggers autoscrolling. The default value is 16 pixels.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoScrollMargin")
    @QtBlockedSlot
    public final int autoScrollMargin()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoScrollMargin(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autoScrollMargin(long __this__nativeId);

/**
Deselects all selected items. The current index will not be changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelection(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags) setSelection()}, and {@link com.trolltech.qt.gui.QAbstractItemView#selectAll() selectAll()}. <br></DD></DT>
*/

    public final void clearSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearSelection(nativeId());
    }
    native void __qt_clearSelection(long __this__nativeId);

/**
Closes the persistent editor for the item at the given <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#openPersistentEditor(com.trolltech.qt.core.QModelIndex) openPersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closePersistentEditor(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closePersistentEditor_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_closePersistentEditor_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the model index of the current item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setCurrentIndex(com.trolltech.qt.core.QModelIndex) setCurrentIndex()}. <br></DD></DT>
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
Returns the offset of the dirty regions in the view. <p>If you use {@link com.trolltech.qt.gui.QAbstractItemView#scrollDirtyRegion(int, int) scrollDirtyRegion()} and implement a paintEvent() in a subclass of QAbstractItemView, you should translate the area given by the paint event with the offset returned from this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#scrollDirtyRegion(int, int) scrollDirtyRegion()}, and {@link com.trolltech.qt.gui.QAbstractItemView#setDirtyRegion(com.trolltech.qt.gui.QRegion) setDirtyRegion()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint dirtyRegionOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dirtyRegionOffset(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_dirtyRegionOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void doAutoScroll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doAutoScroll(nativeId());
    }
    @QtBlockedSlot
    native void __qt_doAutoScroll(long __this__nativeId);

/**
This property holds the drag and drop event the view will act upon. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#showDropIndicator() showDropIndicator}, and {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="dragDropMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.DragDropMode dragDropMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.DragDropMode.resolve(__qt_dragDropMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dragDropMode(long __this__nativeId);

/**
This property holds the view's drag and drop behavior. If its value is <tt>true</tt>, the selected data will overwrite the existing item data when dropped, while moving the data will clear the item. If its value is <tt>false</tt>, the selected data will be inserted as a new item when the data is dropped. When the data is moved, the item is removed as well. <p>The default value is <tt>false</tt>, as in the {@link com.trolltech.qt.gui.QListView QListView} and {@link com.trolltech.qt.gui.QTreeView QTreeView} subclasses. In the {@link com.trolltech.qt.gui.QTableView QTableView} subclass, on the other hand, the property has been set to <tt>true</tt>. <p>Note: This is not intended to prevent overwriting of items. The model's implementation of flags() should do that by not returning {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsDropEnabled }. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#dragDropMode() dragDropMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="dragDropOverwriteMode")
    @QtBlockedSlot
    public final boolean dragDropOverwriteMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dragDropOverwriteMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dragDropOverwriteMode(long __this__nativeId);

/**
This property holds whether the view supports dragging of its own items. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#showDropIndicator() showDropIndicator}, {@link com.trolltech.qt.gui.QAbstractItemView.DragDropMode DragDropMode }, {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}, and {@link QWidget#acceptDrops() acceptDrops}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="dragEnabled")
    @QtBlockedSlot
    public final boolean dragEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dragEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dragEnabled(long __this__nativeId);

/**
Returns the position of the drop indicator in relation to the closest item.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QAbstractItemView.DropIndicatorPosition dropIndicatorPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.DropIndicatorPosition.resolve(__qt_dropIndicatorPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dropIndicatorPosition(long __this__nativeId);

/**
Starts editing the item corresponding to the given <tt>index</tt> if it is editable. <p>Note that this function does not change the current index. Since the current index defines the next and previous items to edit, users may find that keyboard navigation does not work as expected. To provide consistent navigation behavior, call {@link com.trolltech.qt.gui.QAbstractItemView#setCurrentIndex(com.trolltech.qt.core.QModelIndex) setCurrentIndex()} before this function with the same model index. <p><DT><b>See also:</b><br><DD>QModelIndex::flags(). <br></DD></DT>
*/

    public final void edit(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_edit_QModelIndex(nativeId(), index);
    }
    native void __qt_edit_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds which actions will initiate item editing. This property is a selection of flags defined by {@link com.trolltech.qt.gui.QAbstractItemView.EditTrigger EditTrigger }, combined using the OR operator. The view will only initiate the editing of an item if the action performed is set in this property.
*/

    @com.trolltech.qt.QtPropertyReader(name="editTriggers")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.EditTriggers editTriggers()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractItemView.EditTriggers(__qt_editTriggers(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_editTriggers(long __this__nativeId);

/**
Executes the scheduled layouts without waiting for the event processing to begin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#scheduleDelayedItemsLayout() scheduleDelayedItemsLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void executeDelayedItemsLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_executeDelayedItemsLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_executeDelayedItemsLayout(long __this__nativeId);

/**
This property holds whether autoscrolling in drag move events is enabled. If this property is set to true (the default), the QAbstractItemView automatically scrolls the contents of the view if the user drags within 16 pixels of the viewport edge. If the current item changes, then the view will scroll automatically to ensure that the current item is fully visible. <p>This property only works if the viewport accepts drops. Autoscroll is switched off by setting this property to false.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoScroll")
    @QtBlockedSlot
    public final boolean hasAutoScroll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAutoScroll(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAutoScroll(long __this__nativeId);

/**
This property holds how the view scrolls its contents in the horizontal direction. This property controlls how the view scroll its contents horizontally. Scrolling can be done either per pixel or per item.
*/

    @com.trolltech.qt.QtPropertyReader(name="horizontalScrollMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.ScrollMode horizontalScrollMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.ScrollMode.resolve(__qt_horizontalScrollMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_horizontalScrollMode(long __this__nativeId);

/**
This property holds the size of items. Setting this property when the view is visible will cause the items to be laid out again.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
Returns the widget for the item at the given <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setIndexWidget(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.gui.QWidget) setIndexWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget indexWidget(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexWidget_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_indexWidget_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the item delegate used by this view and model. This is either one set with {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}, or the default one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegate(long __this__nativeId);

/**
Returns the item delegate used by this view and model for the given <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegate(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegate_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegate_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the item delegate used by this view and model for the given <tt>column</tt>. You can call {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()} to get a pointer to the current delegate for a given index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegateForColumn(int, com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegateForColumn()}, {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegateForRow(int) itemDelegateForRow()}, and {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegateForColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegateForColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegateForColumn_int(long __this__nativeId, int column);

/**
Returns the item delegate used by this view and model for the given <tt>row</tt>, or 0 if no delegate has been assigned. You can call {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()} to get a pointer to the current delegate for a given index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegateForRow(int, com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegateForRow()}, {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegateForColumn(int) itemDelegateForColumn()}, and {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegateForRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegateForRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegateForRow_int(long __this__nativeId, int row);

/**
Returns the model that this view is presenting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}. <br></DD></DT>
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
Opens a persistent editor on the item at the given <tt>index</tt>. If no editor exists, the delegate will create a new editor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#closePersistentEditor(com.trolltech.qt.core.QModelIndex) closePersistentEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void openPersistentEditor(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_openPersistentEditor_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_openPersistentEditor_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the model index of the model's root item. The root item is the parent item to the view's toplevel items. The root can be invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setRootIndex(com.trolltech.qt.core.QModelIndex) setRootIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex rootIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_rootIndex(long __this__nativeId);

/**
Schedules a layout of the items in the view to be executed when the event processing starts. <p>Even if {@link com.trolltech.qt.gui.QAbstractItemView#scheduleDelayedItemsLayout() scheduleDelayedItemsLayout()} is called multiple times before events are processed, the view will only do the layout once. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#executeDelayedItemsLayout() executeDelayedItemsLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void scheduleDelayedItemsLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scheduleDelayedItemsLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_scheduleDelayedItemsLayout(long __this__nativeId);

/**
Prepares the view for scrolling by (<tt>dx</tt>,<tt>dy</tt>) pixels by moving the dirty regions in the opposite direction. You only need to call this function if you are implementing a scrolling viewport in your view subclass. <p>If you implement {@link com.trolltech.qt.gui.QAbstractScrollArea#scrollContentsBy(int, int) scrollContentsBy()} in a subclass of QAbstractItemView, call this function before you call {@link com.trolltech.qt.gui.QWidget#scroll(int, int) QWidget::scroll()} on the viewport. Alternatively, just call {@link com.trolltech.qt.gui.QAbstractItemView#update(com.trolltech.qt.core.QModelIndex) update()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#scrollContentsBy(int, int) scrollContentsBy()}, {@link com.trolltech.qt.gui.QAbstractItemView#dirtyRegionOffset() dirtyRegionOffset()}, and {@link com.trolltech.qt.gui.QAbstractItemView#setDirtyRegion(com.trolltech.qt.gui.QRegion) setDirtyRegion()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void scrollDirtyRegion(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollDirtyRegion_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scrollDirtyRegion_int_int(long __this__nativeId, int dx, int dy);

/**
Scrolls the view to the bottom. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#scrollTo(com.trolltech.qt.core.QModelIndex) scrollTo()}, and {@link com.trolltech.qt.gui.QAbstractItemView#scrollToTop() scrollToTop()}. <br></DD></DT>
*/

    public final void scrollToBottom()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToBottom(nativeId());
    }
    native void __qt_scrollToBottom(long __this__nativeId);

/**
Scrolls the view to the top. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#scrollTo(com.trolltech.qt.core.QModelIndex) scrollTo()}, and {@link com.trolltech.qt.gui.QAbstractItemView#scrollToBottom() scrollToBottom()}. <br></DD></DT>
*/

    public final void scrollToTop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToTop(nativeId());
    }
    native void __qt_scrollToTop(long __this__nativeId);

/**
This property holds which selection behavior the view uses. This property holds whether selections are done in terms of single items, rows or columns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode }, and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectionBehavior")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior selectionBehavior()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior.resolve(__qt_selectionBehavior(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectionBehavior(long __this__nativeId);

/**
This property holds which selection mode the view operates in. This property controls whether the user can select one or many items and, in many-item selections, whether the selection must be a continuous range of items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode }, and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectionMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.SelectionMode selectionMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.SelectionMode.resolve(__qt_selectionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectionMode(long __this__nativeId);

/**
Returns the current selection model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel) setSelectionModel()}, and {@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemSelectionModel selectionModel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectionModel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelectionModel __qt_selectionModel(long __this__nativeId);

/**
This property holds whether to draw the background using alternating colors. If this property is true, the item background will be drawn using {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Base } and {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::AlternateBase }; otherwise the background will be drawn using the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Base } color. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="alternatingRowColors")
    @QtBlockedSlot
    public final void setAlternatingRowColors(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlternatingRowColors_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAlternatingRowColors_boolean(long __this__nativeId, boolean enable);

/**
This property holds whether autoscrolling in drag move events is enabled. If this property is set to true (the default), the QAbstractItemView automatically scrolls the contents of the view if the user drags within 16 pixels of the viewport edge. If the current item changes, then the view will scroll automatically to ensure that the current item is fully visible. <p>This property only works if the viewport accepts drops. Autoscroll is switched off by setting this property to false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoScroll")
    @QtBlockedSlot
    public final void setAutoScroll(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoScroll_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAutoScroll_boolean(long __this__nativeId, boolean enable);

/**
This property holds the size of the area when auto scrolling is triggered. This property controlls the size of the area at the edge of the viewport that triggers autoscrolling. The default value is 16 pixels.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoScrollMargin")
    @QtBlockedSlot
    public final void setAutoScrollMargin(int margin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoScrollMargin_int(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setAutoScrollMargin_int(long __this__nativeId, int margin);

/**
Sets the current item to be the item at <tt>index</tt>. Depending on the current selection mode, the item may also be selected. Note that this function also updates the starting position for any new selections the user performs. <p>To set an item as the current item without selecting it, call <p><tt>selectionModel()-&gt;setCurrentIndex(index, QItemSelectionModel::NoUpdate);</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#currentIndex() currentIndex()}, {@link com.trolltech.qt.gui.QAbstractItemView#currentChanged(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) currentChanged()}, and {@link QAbstractItemView#selectionMode() selectionMode}. <br></DD></DT>
*/

    public final void setCurrentIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIndex_QModelIndex(nativeId(), index);
    }
    native void __qt_setCurrentIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Marks the given <tt>region</tt> as dirty and schedules it to be updated. You only need to call this function if you are implementing your own view subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#scrollDirtyRegion(int, int) scrollDirtyRegion()}, and {@link com.trolltech.qt.gui.QAbstractItemView#dirtyRegionOffset() dirtyRegionOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setDirtyRegion(com.trolltech.qt.gui.QRegion region)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirtyRegion_QRegion(nativeId(), region == null ? 0 : region.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDirtyRegion_QRegion(long __this__nativeId, long region);

/**
This property holds the drag and drop event the view will act upon. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#showDropIndicator() showDropIndicator}, and {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="dragDropMode")
    @QtBlockedSlot
    public final void setDragDropMode(com.trolltech.qt.gui.QAbstractItemView.DragDropMode behavior)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragDropMode_DragDropMode(nativeId(), behavior.value());
    }
    @QtBlockedSlot
    native void __qt_setDragDropMode_DragDropMode(long __this__nativeId, int behavior);

/**
This property holds the view's drag and drop behavior. If its value is <tt>true</tt>, the selected data will overwrite the existing item data when dropped, while moving the data will clear the item. If its value is <tt>false</tt>, the selected data will be inserted as a new item when the data is dropped. When the data is moved, the item is removed as well. <p>The default value is <tt>false</tt>, as in the {@link com.trolltech.qt.gui.QListView QListView} and {@link com.trolltech.qt.gui.QTreeView QTreeView} subclasses. In the {@link com.trolltech.qt.gui.QTableView QTableView} subclass, on the other hand, the property has been set to <tt>true</tt>. <p>Note: This is not intended to prevent overwriting of items. The model's implementation of flags() should do that by not returning {@link com.trolltech.qt.core.Qt.ItemFlag Qt::ItemIsDropEnabled }. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#dragDropMode() dragDropMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="dragDropOverwriteMode")
    @QtBlockedSlot
    public final void setDragDropOverwriteMode(boolean overwrite)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragDropOverwriteMode_boolean(nativeId(), overwrite);
    }
    @QtBlockedSlot
    native void __qt_setDragDropOverwriteMode_boolean(long __this__nativeId, boolean overwrite);

/**
This property holds whether the view supports dragging of its own items. <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#showDropIndicator() showDropIndicator}, {@link com.trolltech.qt.gui.QAbstractItemView.DragDropMode DragDropMode }, {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}, and {@link QWidget#acceptDrops() acceptDrops}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="dragEnabled")
    @QtBlockedSlot
    public final void setDragEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDragEnabled_boolean(long __this__nativeId, boolean enable);

/**
This property holds whether the drop indicator is shown when dragging items and dropping.  <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#dragEnabled() dragEnabled}, {@link com.trolltech.qt.gui.QAbstractItemView.DragDropMode DragDropMode }, {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}, and {@link QWidget#acceptDrops() acceptDrops}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="showDropIndicator")
    @QtBlockedSlot
    public final void setDropIndicatorShown(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDropIndicatorShown_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDropIndicatorShown_boolean(long __this__nativeId, boolean enable);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setEditTriggers(com.trolltech.qt.gui.QAbstractItemView.EditTrigger ... triggers) {
        this.setEditTriggers(new com.trolltech.qt.gui.QAbstractItemView.EditTriggers(triggers));
    }
/**
This property holds which actions will initiate item editing. This property is a selection of flags defined by {@link com.trolltech.qt.gui.QAbstractItemView.EditTrigger EditTrigger }, combined using the OR operator. The view will only initiate the editing of an item if the action performed is set in this property.
*/

    @com.trolltech.qt.QtPropertyWriter(name="editTriggers")
    @QtBlockedSlot
    public final void setEditTriggers(com.trolltech.qt.gui.QAbstractItemView.EditTriggers triggers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditTriggers_EditTriggers(nativeId(), triggers.value());
    }
    @QtBlockedSlot
    native void __qt_setEditTriggers_EditTriggers(long __this__nativeId, int triggers);

/**
This property holds how the view scrolls its contents in the horizontal direction. This property controlls how the view scroll its contents horizontally. Scrolling can be done either per pixel or per item.
*/

    @com.trolltech.qt.QtPropertyWriter(name="horizontalScrollMode")
    @QtBlockedSlot
    public final void setHorizontalScrollMode(com.trolltech.qt.gui.QAbstractItemView.ScrollMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalScrollMode_ScrollMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalScrollMode_ScrollMode(long __this__nativeId, int mode);

/**
This property holds the size of items. Setting this property when the view is visible will cause the items to be laid out again.
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    @QtBlockedSlot
    public final void setIconSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconSize_QSize(long __this__nativeId, long size);

/**
Sets the given <tt>widget</tt> on the item at the given <tt>index</tt>, passing the ownership of the widget to the viewport. <p>If <tt>index</tt> is invalid (e.g., if you pass the root index), this function will do nothing. <p>The given <tt>widget</tt>'s {@link com.trolltech.qt.gui.QWidget autoFillBackground} property must be set to true, otherwise the widget's background will be transparent, showing both the model data and the item at the given <tt>index</tt>. <p>If index widget A is replaced with index widget B, index widget A will be deleted. For example, in the code snippet below, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} object will be deleted.<br><br>The following code example is written in c++.<br> <pre class="snippet">
setIndexWidget(index, new QLineEdit);
...
setIndexWidget(index, new QTextEdit);
</pre> This function should only be used to display static content within the visible area corresponding to an item of data. If you want to display custom dynamic content or implement a custom editor widget, subclass {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#indexWidget(com.trolltech.qt.core.QModelIndex) indexWidget()}, and {@link <a href="../model-view-delegate.html">Delegate Classes</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setIndexWidget(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndexWidget_QModelIndex_QWidget(nativeId(), index, widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setIndexWidget_QModelIndex_QWidget(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, long widget);

/**
Sets the item delegate for this view and its model to <tt>delegate</tt>. This is useful if you want complete control over the editing and display of items. <p>Any existing delegate will be removed, but not deleted. QAbstractItemView does not take ownership of <tt>delegate</tt>. <p><b>Warning:</b> You should not share the same instance of a delegate between views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItemDelegate = delegate;
        }
        __qt_setItemDelegate_QAbstractItemDelegate(nativeId(), delegate == null ? 0 : delegate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemDelegate_QAbstractItemDelegate(long __this__nativeId, long delegate);

/**
Sets the given item <tt>delegate</tt> used by this view and model for the given <tt>column</tt>. All items on <tt>column</tt> will be drawn and managed by <tt>delegate</tt> instead of using the default delegate (i.e., {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}). <p>Any existing column delegate for <tt>column</tt> will be removed, but not deleted. QAbstractItemView does not take ownership of <tt>delegate</tt>. <p><b>Note:</b> If a delegate has been assigned to both a row and a column, the row delegate will take presedence and manage the intersecting cell index. <p><b>Warning:</b> You should not share the same instance of a delegate between views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#itemDelegateForColumn(int) itemDelegateForColumn()}, {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegateForRow(int, com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegateForRow()}, and {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setItemDelegateForColumn(int column, com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemDelegateForColumn_int_QAbstractItemDelegate(nativeId(), column, delegate == null ? 0 : delegate.nativeId());
        if (delegate == null)
            __rcDelegatesForColumns.remove(column);
        else
            __rcDelegatesForColumns.put(column,delegate);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setItemDelegateForColumn_int_QAbstractItemDelegate(long __this__nativeId, int column, long delegate);

/**
Sets the given item <tt>delegate</tt> used by this view and model for the given <tt>row</tt>. All items on <tt>row</tt> will be drawn and managed by <tt>delegate</tt> instead of using the default delegate (i.e., {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}). <p>Any existing row delegate for <tt>row</tt> will be removed, but not deleted. QAbstractItemView does not take ownership of <tt>delegate</tt>. <p><b>Note:</b> If a delegate has been assigned to both a row and a column, the row delegate (i.e., this delegate) will take presedence and manage the intersecting cell index. <p><b>Warning:</b> You should not share the same instance of a delegate between views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#itemDelegateForRow(int) itemDelegateForRow()}, {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegateForColumn(int, com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegateForColumn()}, and {@link com.trolltech.qt.gui.QAbstractItemView#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setItemDelegateForRow(int row, com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemDelegateForRow_int_QAbstractItemDelegate(nativeId(), row, delegate == null ? 0 : delegate.nativeId());
        if (delegate == null)
            __rcDelegatesForRows.remove(row);
        else
            __rcDelegatesForRows.put(row,delegate);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setItemDelegateForRow_int_QAbstractItemDelegate(long __this__nativeId, int row, long delegate);

/**
This property holds which selection behavior the view uses. This property holds whether selections are done in terms of single items, rows or columns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode }, and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectionBehavior")
    @QtBlockedSlot
    public final void setSelectionBehavior(com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior behavior)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionBehavior_SelectionBehavior(nativeId(), behavior.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectionBehavior_SelectionBehavior(long __this__nativeId, int behavior);

/**
This property holds which selection mode the view operates in. This property controls whether the user can select one or many items and, in many-item selections, whether the selection must be a continuous range of items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode SelectionMode }, and {@link com.trolltech.qt.gui.QAbstractItemView.SelectionBehavior SelectionBehavior }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectionMode")
    @QtBlockedSlot
    public final void setSelectionMode(com.trolltech.qt.gui.QAbstractItemView.SelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionMode_SelectionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectionMode_SelectionMode(long __this__nativeId, int mode);

/**
Sets the item view's state to the given <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#state() state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setState(com.trolltech.qt.gui.QAbstractItemView.State state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setState_State(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setState_State(long __this__nativeId, int state);

/**
This property holds whether item navigation with tab and backtab is enabled.
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabKeyNavigation")
    @QtBlockedSlot
    public final void setTabKeyNavigation(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabKeyNavigation_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setTabKeyNavigation_boolean(long __this__nativeId, boolean enable);

/**
This property holds the the position of the ". ." in elided text.. The default value for all item views is {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideRight }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="textElideMode")
    @QtBlockedSlot
    public final void setTextElideMode(com.trolltech.qt.core.Qt.TextElideMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextElideMode_TextElideMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setTextElideMode_TextElideMode(long __this__nativeId, int mode);

/**
This property holds how the view scrolls its contents in the vertical direction. This property controlls how the view scroll its contents vertically. Scrolling can be done either per pixel or per item.
*/

    @com.trolltech.qt.QtPropertyWriter(name="verticalScrollMode")
    @QtBlockedSlot
    public final void setVerticalScrollMode(com.trolltech.qt.gui.QAbstractItemView.ScrollMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalScrollMode_ScrollMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setVerticalScrollMode_ScrollMode(long __this__nativeId, int mode);

/**
This property holds whether the drop indicator is shown when dragging items and dropping.  <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#dragEnabled() dragEnabled}, {@link com.trolltech.qt.gui.QAbstractItemView.DragDropMode DragDropMode }, {@link QAbstractItemView#dragDropOverwriteMode() dragDropOverwriteMode}, and {@link QWidget#acceptDrops() acceptDrops}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="showDropIndicator")
    @QtBlockedSlot
    public final boolean showDropIndicator()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_showDropIndicator(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_showDropIndicator(long __this__nativeId);

/**
Returns the size hint for the item with the specified <tt>index</tt> or an invalid size for invalid indexes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#sizeHintForRow(int) sizeHintForRow()}, and {@link com.trolltech.qt.gui.QAbstractItemView#sizeHintForColumn(int) sizeHintForColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeHintForIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHintForIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHintForIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void startAutoScroll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startAutoScroll(nativeId());
    }
    @QtBlockedSlot
    native void __qt_startAutoScroll(long __this__nativeId);

/**
Returns the item view's state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setState(com.trolltech.qt.gui.QAbstractItemView.State) setState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QAbstractItemView.State state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.State.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void stopAutoScroll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stopAutoScroll(nativeId());
    }
    @QtBlockedSlot
    native void __qt_stopAutoScroll(long __this__nativeId);

/**
This property holds whether item navigation with tab and backtab is enabled.
*/

    @com.trolltech.qt.QtPropertyReader(name="tabKeyNavigation")
    @QtBlockedSlot
    public final boolean tabKeyNavigation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabKeyNavigation(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tabKeyNavigation(long __this__nativeId);

/**
This property holds the the position of the ". ." in elided text.. The default value for all item views is {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideRight }.
*/

    @com.trolltech.qt.QtPropertyReader(name="textElideMode")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextElideMode textElideMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextElideMode.resolve(__qt_textElideMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textElideMode(long __this__nativeId);

/**
Updates the area occupied by the given <tt>index</tt>.
*/

    public final void update(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QModelIndex(nativeId(), index);
    }
    native void __qt_update_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds how the view scrolls its contents in the vertical direction. This property controlls how the view scroll its contents vertically. Scrolling can be done either per pixel or per item.
*/

    @com.trolltech.qt.QtPropertyReader(name="verticalScrollMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView.ScrollMode verticalScrollMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractItemView.ScrollMode.resolve(__qt_verticalScrollMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_verticalScrollMode(long __this__nativeId);

/**
Closes the given <tt>editor</tt>, and releases it. The <tt>hint</tt> is used to specify how the view should respond to the end of the editing operation. For example, the hint may indicate that the next item in the view should be opened for editing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#edit(com.trolltech.qt.core.QModelIndex) edit()}, and {@link com.trolltech.qt.gui.QAbstractItemView#commitData(com.trolltech.qt.gui.QWidget) commitData()}. <br></DD></DT>
*/

    protected void closeEditor(com.trolltech.qt.gui.QWidget editor, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEditor_QWidget_EndEditHint(nativeId(), editor == null ? 0 : editor.nativeId(), hint.value());
    }
    native void __qt_closeEditor_QWidget_EndEditHint(long __this__nativeId, long editor, int hint);

/**
Commit the data in the <tt>editor</tt> to the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#closeEditor(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint) closeEditor()}. <br></DD></DT>
*/

    protected void commitData(com.trolltech.qt.gui.QWidget editor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commitData_QWidget(nativeId(), editor == null ? 0 : editor.nativeId());
    }
    native void __qt_commitData_QWidget(long __this__nativeId, long editor);

/**
This slot is called when a new item becomes the current item. The previous current item is specified by the <tt>previous</tt> index, and the new item by the <tt>current</tt> index. <p>If you want to know about changes to items see the {@link com.trolltech.qt.gui.QAbstractItemView#dataChanged(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) dataChanged()} signal.
*/

    protected void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);

/**
This slot is called when items are changed in the model. The changed items are those from <tt>topLeft</tt> to <tt>bottomRight</tt> inclusive. If just one item is changed <tt>topLeft</tt> == <tt>bottomRight</tt>.
*/

    protected void dataChanged(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataChanged_QModelIndex_QModelIndex(nativeId(), topLeft, bottomRight);
    }
    native void __qt_dataChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public void doItemsLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doItemsLayout(nativeId());
    }
    native void __qt_doItemsLayout(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long event);

/**
Starts editing the item at <tt>index</tt>, creating an editor if necessary, and returns true if the view's {@link com.trolltech.qt.gui.QAbstractItemView.State State } is now {@link com.trolltech.qt.gui.QAbstractItemView.State EditingState }; otherwise returns false. <p>The action that caused the editing process is described by <tt>trigger</tt>, and the associated event is specified by <tt>event</tt>. <p>Editing can be forced by specifying the <tt>trigger</tt> to be {@link com.trolltech.qt.gui.QAbstractItemView.EditTrigger QAbstractItemView::AllEditTriggers }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#closeEditor(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint) closeEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean edit(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QAbstractItemView.EditTrigger trigger, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_edit_QModelIndex_EditTrigger_QEvent(nativeId(), index, trigger.value(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_edit_QModelIndex_EditTrigger_QEvent(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int trigger, long event);

/**
This function is called when the given <tt>editor</tt> has been destroyed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#closeEditor(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint) closeEditor()}. <br></DD></DT>
*/

    protected void editorDestroyed(com.trolltech.qt.core.QObject editor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editorDestroyed_QObject(nativeId(), editor == null ? 0 : editor.nativeId());
    }
    native void __qt_editorDestroyed_QObject(long __this__nativeId, long editor);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long event);

/**
Returns the horizontal offset of the view. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#verticalOffset() verticalOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int horizontalOffset();
    @QtBlockedSlot
    native int __qt_horizontalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void horizontalScrollbarAction(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_horizontalScrollbarAction_int(nativeId(), action);
    }
    native void __qt_horizontalScrollbarAction_int(long __this__nativeId, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void horizontalScrollbarValueChanged(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_horizontalScrollbarValueChanged_int(nativeId(), value);
    }
    native void __qt_horizontalScrollbarValueChanged_int(long __this__nativeId, int value);

/**
Returns the model index of the item at the viewport coordinates <tt>point</tt>. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#visualRect(com.trolltech.qt.core.QModelIndex) visualRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QModelIndex indexAt(com.trolltech.qt.core.QPoint point);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexAt_QPoint(long __this__nativeId, long point);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery query)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), query.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int query);

/**
Returns true if the item referred to by the given <tt>index</tt> is hidden in the view, otherwise returns false. <p>Hiding is a view specific feature. For example in TableView a column can be marked as hidden or a row in the TreeView. <p>In the base class this is a pure virtual function.
*/

    @QtBlockedSlot
    protected abstract boolean isIndexHidden(com.trolltech.qt.core.QModelIndex index);
    @QtBlockedSlot
    native boolean __qt_isIndexHidden_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
Moves to and selects the item best matching the string <tt>search</tt>. If no item is found nothing happens. <p>In the default implementation, the search is reset if <tt>search</tt> is empty, or the time interval since the last search has exceeded {@link QApplication#keyboardInputInterval() QApplication::keyboardInputInterval()}.
*/

    @QtBlockedSlot
    public void keyboardSearch(java.lang.String search)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyboardSearch_String(nativeId(), search);
    }
    @QtBlockedSlot
    native void __qt_keyboardSearch_String(long __this__nativeId, java.lang.String search);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long event);

/**
Returns a QModelIndex object pointing to the next object in the view, based on the given <tt>cursorAction</tt> and keyboard modifiers specified by <tt>modifiers</tt>. <p>In the base class this is a pure virtual function.
*/

    @QtBlockedSlot
    protected abstract com.trolltech.qt.core.QModelIndex moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction cursorAction, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers);
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_moveCursor_CursorAction_KeyboardModifiers(long __this__nativeId, int cursorAction, int modifiers);

/**
Reset the internal state of the view. <p><b>Warning:</b> This function will reset open editors, scroll bar positions, selections, etc. Existing changes will not be committed. If you would like to save your changes when resetting the view, you can reimplement this function, commit your changes, and then call the superclass' implementation.
*/

    public void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    native void __qt_reset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
This slot is called when rows are about to be removed. The deleted rows are those under the given <tt>parent</tt> from <tt>start</tt> to <tt>end</tt> inclusive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#rowsInserted(com.trolltech.qt.core.QModelIndex, int, int) rowsInserted()}. <br></DD></DT>
*/

    protected void rowsAboutToBeRemoved(com.trolltech.qt.core.QModelIndex parent, int start, int end)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowsAboutToBeRemoved_QModelIndex_int_int(nativeId(), parent, start, end);
    }
    native void __qt_rowsAboutToBeRemoved_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int start, int end);

/**
This slot is called when rows are inserted. The new rows are those under the given <tt>parent</tt> from <tt>start</tt> to <tt>end</tt> inclusive. The base class implementation calls fetchMore() on the model to check for more data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#rowsAboutToBeRemoved(com.trolltech.qt.core.QModelIndex, int, int) rowsAboutToBeRemoved()}. <br></DD></DT>
*/

    protected void rowsInserted(com.trolltech.qt.core.QModelIndex parent, int start, int end)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowsInserted_QModelIndex_int_int(nativeId(), parent, start, end);
    }
    native void __qt_rowsInserted_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int start, int end);


/**
Scrolls the view if necessary to ensure that the item at <tt>index</tt> is visible. The view will try to position the item according to the given <tt>hint</tt>. <p>In the base class this is a pure virtual function.
*/

    @QtBlockedSlot
    public final void scrollTo(com.trolltech.qt.core.QModelIndex index) {
        scrollTo(index, com.trolltech.qt.gui.QAbstractItemView.ScrollHint.EnsureVisible);
    }
/**
Scrolls the view if necessary to ensure that the item at <tt>index</tt> is visible. The view will try to position the item according to the given <tt>hint</tt>. <p>In the base class this is a pure virtual function.
*/

    @QtBlockedSlot
    public abstract void scrollTo(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint);
    @QtBlockedSlot
    native void __qt_scrollTo_QModelIndex_ScrollHint(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int hint);

/**
Selects all item in the view. This function wil use the selection selection behavior set on the view when selecting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelection(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags) setSelection()}, {@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()}, and {@link com.trolltech.qt.gui.QAbstractItemView#clearSelection() clearSelection()}. <br></DD></DT>
*/

    public void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

/**
This convenience function returns a list of all selected and non-hidden item indexes in the view. The list contains no duplicates, and is not sorted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemSelectionModel#selectedIndexes() QItemSelectionModel::selectedIndexes()}. <br></DD></DT>
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
This slot is called when the selection is changed. The previous selection (which may be empty), is specified by <tt>deselected</tt>, and the new selection by <tt>selected</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelection(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags) setSelection()}. <br></DD></DT>
*/

    protected void selectionChanged(com.trolltech.qt.gui.QItemSelection selected, com.trolltech.qt.gui.QItemSelection deselected)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged_QItemSelection_QItemSelection(nativeId(), selected == null ? 0 : selected.nativeId(), deselected == null ? 0 : deselected.nativeId());
    }
    native void __qt_selectionChanged_QItemSelection_QItemSelection(long __this__nativeId, long selected, long deselected);


/**
Returns the SelectionFlags to be used when updating a selection with to include the <tt>index</tt> specified. The <tt>event</tt> is a user input event, such as a mouse or keyboard event. <p>Reimplement this function to define your own selection behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelection(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags) setSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags selectionCommand(com.trolltech.qt.core.QModelIndex index) {
        return selectionCommand(index, (com.trolltech.qt.core.QEvent)null);
    }
/**
Returns the SelectionFlags to be used when updating a selection with to include the <tt>index</tt> specified. The <tt>event</tt> is a user input event, such as a mouse or keyboard event. <p>Reimplement this function to define your own selection behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setSelection(com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags) setSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags selectionCommand(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags(__qt_selectionCommand_QModelIndex_QEvent(nativeId(), index, event == null ? 0 : event.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectionCommand_QModelIndex_QEvent(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, long event);

/**
Sets the <tt>model</tt> for the view to present. <p>This function will create and set a new selection model, replacing any model that was previously set with {@link com.trolltech.qt.gui.QAbstractItemView#setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel) setSelectionModel()}. However, the old selection model will not be deleted as it may be shared between several views. We recommend that you delete the old selection model if it is no longer required. This is done with the following code:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QItemSelectionModel *m = view-&gt;selectionModel();
view-&gt;setModel(new model);
delete m;
</pre> If both the old model and the old selection model do not have parents, or if their parents are long-lived objects, it may be preferable to call their deleteLater() functions to explicitly delete them. <p>The view does not take ownership of the model unless it is the model's parent object because the view may be shared between many different views. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#model() model()}, {@link com.trolltech.qt.gui.QAbstractItemView#selectionModel() selectionModel()}, and {@link com.trolltech.qt.gui.QAbstractItemView#setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel) setSelectionModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItemModel = model;
        }
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
        // setModel() creates a new selection model for the object
        com.trolltech.qt.GeneratorUtilities.setField(this, com.trolltech.qt.gui.QAbstractItemView.class, "__rcItemSelectionModel", null);


    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model);

/**
Sets the root item to the item at the given <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#rootIndex() rootIndex()}. <br></DD></DT>
*/

    public void setRootIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIndex_QModelIndex(nativeId(), index);
    }
    native void __qt_setRootIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Applies the selection <tt>flags</tt> to the items in or touched by the rectangle, <tt>rect</tt>. <p>When implementing your own itemview setSelection should call {@link com.trolltech.qt.gui.QAbstractItemView#selectionModel() selectionModel()}-&gt;select(selection, flags) where selection is either an empty QModelIndex or a {@link com.trolltech.qt.gui.QItemSelection QItemSelection} that contains all items that are contained in <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#selectionCommand(com.trolltech.qt.core.QModelIndex) selectionCommand()}, and {@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract void setSelection(com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command);
    @QtBlockedSlot
    native void __qt_setSelection_QRect_SelectionFlags(long __this__nativeId, long rect, int command);

/**
Sets the current selection model to the given <tt>selectionModel</tt>. <p>Note that, if you call {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} after this function, the given <tt>selectionModel</tt> will be replaced by one created by the view. <p><b>Note:</b> It is up to the application to delete the old selection model if it is no longer needed; i.e., if it is not being used by other views. This will happen automatically when its parent object is deleted. However, if it does not have a parent, or if the parent is a long-lived object, it may be preferable to call its deleteLater() function to explicitly delete it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#selectionModel() selectionModel()}, {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}, and {@link com.trolltech.qt.gui.QAbstractItemView#clearSelection() clearSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel selectionModel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (selectionModel == null)
            throw new NullPointerException("Argument 'selectionModel': null not expected.");
        {
            __rcItemSelectionModel = selectionModel;
        }
        __qt_setSelectionModel_QItemSelectionModel(nativeId(), selectionModel == null ? 0 : selectionModel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSelectionModel_QItemSelectionModel(long __this__nativeId, long selectionModel);

/**
Returns the width size hint for the specified <tt>column</tt> or -1 if there is no model. <p>This function is used in views with a horizontal header to find the size hint for a header section based on the contents of the given <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#sizeHintForRow(int) sizeHintForRow()}. <br></DD></DT>
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
Returns the height size hint for the specified <tt>row</tt> or -1 if there is no model. <p>The returned height is calculated using the size hints of the given <tt>row</tt>'s items, i.e. the returned value is the maximum height among the items. Note that to control the height of a row, you must reimplement the {@link com.trolltech.qt.gui.QAbstractItemDelegate#sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) QAbstractItemDelegate::sizeHint()} function. <p>This function is used in views with a vertical header to find the size hint for a header section based on the contents of the given <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#sizeHintForColumn(int) sizeHintForColumn()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    protected final void startDrag(com.trolltech.qt.core.Qt.DropAction ... supportedActions) {
        this.startDrag(new com.trolltech.qt.core.Qt.DropActions(supportedActions));
    }
/**
Starts a drag by calling drag-&gt;exec() using the given <tt>supportedActions</tt>.
*/

    @QtBlockedSlot
    protected void startDrag(com.trolltech.qt.core.Qt.DropActions supportedActions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_startDrag_DropActions(nativeId(), supportedActions.value());
    }
    @QtBlockedSlot
    native void __qt_startDrag_DropActions(long __this__nativeId, int supportedActions);

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

    protected void updateEditorData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateEditorData(nativeId());
    }
    native void __qt_updateEditorData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void updateEditorGeometries()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateEditorGeometries(nativeId());
    }
    native void __qt_updateEditorGeometries(long __this__nativeId);

/**
Updates the geometry of the child widgets of the view.
*/

    protected void updateGeometries()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometries(nativeId());
    }
    native void __qt_updateGeometries(long __this__nativeId);

/**
Returns the vertical offset of the view. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#horizontalOffset() horizontalOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int verticalOffset();
    @QtBlockedSlot
    native int __qt_verticalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void verticalScrollbarAction(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_verticalScrollbarAction_int(nativeId(), action);
    }
    native void __qt_verticalScrollbarAction_int(long __this__nativeId, int action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void verticalScrollbarValueChanged(int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_verticalScrollbarValueChanged_int(nativeId(), value);
    }
    native void __qt_verticalScrollbarValueChanged_int(long __this__nativeId, int value);

/**
Returns a {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem} structure populated with the view's palette, font, state, alignments etc.
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
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long event);

/**
Returns the rectangle on the viewport occupied by the item at <tt>index</tt>. <p>If your item is displayed in several areas then visualRect should return the primary area that contains index and not the complete area that index might encompasses, touch or cause drawing. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#indexAt(com.trolltech.qt.core.QPoint) indexAt()}, and {@link com.trolltech.qt.gui.QAbstractItemView#visualRegionForSelection(com.trolltech.qt.gui.QItemSelection) visualRegionForSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRect visualRect(com.trolltech.qt.core.QModelIndex index);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualRect_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the region from the viewport of the items in the given <tt>selection</tt>. <p>In the base class this is a pure virtual function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#visualRect(com.trolltech.qt.core.QModelIndex) visualRect()}, and {@link com.trolltech.qt.gui.QAbstractItemView#selectedIndexes() selectedIndexes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract com.trolltech.qt.gui.QRegion visualRegionForSelection(com.trolltech.qt.gui.QItemSelection selection);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_visualRegionForSelection_QItemSelection(long __this__nativeId, long selection);

/**
@exclude
*/

    public static native QAbstractItemView fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractItemView(QPrivateConstructor p) { super(p); } 

    private java.util.Hashtable<Integer, QAbstractItemDelegate> __rcDelegatesForColumns = new java.util.Hashtable<Integer, QAbstractItemDelegate>();
    private java.util.Hashtable<Integer, QAbstractItemDelegate> __rcDelegatesForRows = new java.util.Hashtable<Integer, QAbstractItemDelegate>();

}
