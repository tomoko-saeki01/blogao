package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QListView class provides a list or icon view onto a model. A QListView presents items stored in a model, either as a simple non-hierarchical list, or as a collection of icons. This class is used to provide lists and icon views that were previously provided by the <tt>QListBox</tt> and <tt>QIconView</tt> classes, but using the more flexible approach provided by Qt's model/view architecture. <p>The QListView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>This view does not display horizontal or vertical headers; to display a list of items with a horizontal header, use {@link com.trolltech.qt.gui.QTreeView QTreeView} instead. <p>QListView implements the interfaces defined by the {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} class to allow it to display data provided by models derived from the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} class. <p>Items in a list view can be displayed using one of two view modes: In {@link com.trolltech.qt.gui.QListView.ViewMode ListMode }, the items are displayed in the form of a simple list; in {@link com.trolltech.qt.gui.QListView.ViewMode IconMode }, the list view takes the form of an icon view in which the items are displayed with icons like files in a file manager. By default, the list view is in {@link com.trolltech.qt.gui.QListView.ViewMode ListMode }. To change the view mode, use the {@link com.trolltech.qt.gui.QListView#setViewMode(com.trolltech.qt.gui.QListView.ViewMode) setViewMode()} function, and to determine the current view mode, use {@link com.trolltech.qt.gui.QListView#viewMode() viewMode()}. <p>Items in these views are laid out in the direction specified by the {@link com.trolltech.qt.gui.QListView#flow() flow()} of the list view. The items may be fixed in place, or allowed to move, depending on the view's {@link com.trolltech.qt.gui.QListView#movement() movement()} state. <p>If the items in the model cannot be completely laid out in the direction of flow, they can be wrapped at the boundary of the view widget; this depends on {@link com.trolltech.qt.gui.QListView#isWrapping() isWrapping()}. This property is useful when the items are being represented by an icon view. <p>The {@link com.trolltech.qt.gui.QListView#resizeMode() resizeMode()} and {@link com.trolltech.qt.gui.QListView#layoutMode() layoutMode()} govern how and when the items are laid out. Items are spaced according to their {@link com.trolltech.qt.gui.QListView#spacing() spacing()}, and can exist within a notional grid of size specified by {@link com.trolltech.qt.gui.QListView#gridSize() gridSize()}. The items can be rendered as large or small icons depending on their iconSize(). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-listview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-listview.png"></center><br></td><td>  <br><center><img src="../images/plastique-listview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} list view.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} list view.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} list view.</td></tr></table><a name="improving-performance"><h2>Improving Performance</h2> It is possible to give the view hints about the data it is handling in order to improve its performance when displaying large numbers of items. One approach that can be taken for views that are intended to display items with equal sizes is to set the {@link QListView#uniformItemSizes() uniformItemSizes} property to true. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-view.html">View Classes</a>}, {@link com.trolltech.qt.gui.QTreeView QTreeView}, {@link com.trolltech.qt.gui.QTableView QTableView}, and {@link com.trolltech.qt.gui.QListWidget QListWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QListView extends com.trolltech.qt.gui.QAbstractItemView
{
    public enum ResizeMode implements com.trolltech.qt.QtEnumerator {
/**
 The items will only be laid out the first time the view is shown.
*/

        Fixed(0),
/**
 The items will be laid out every time the view is resized.
*/

        Adjust(1);

        ResizeMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListView$ResizeMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ResizeMode resolve(int value) {
            return (ResizeMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Fixed;
            case 1: return Adjust;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<p><DT><b>See also.</b><br><DD>{@link QListView#batchSize() batchSize}. <br></DD></DT>
*/

    public enum LayoutMode implements com.trolltech.qt.QtEnumerator {
/**
 The items are laid out all at once.
*/

        SinglePass(0),
/**
 The items are laid out in batches of {@link QListView#batchSize() batchSize} items.
*/

        Batched(1);

        LayoutMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListView$LayoutMode constant with the specified <tt>int</tt>.</brief>
*/

        public static LayoutMode resolve(int value) {
            return (LayoutMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SinglePass;
            case 1: return Batched;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ViewMode implements com.trolltech.qt.QtEnumerator {
/**
 The items are laid out using {@link com.trolltech.qt.gui.QListView.Flow TopToBottom } flow, with Small size and Static movement
*/

        ListMode(0),
/**
 The items are laid out using {@link com.trolltech.qt.gui.QListView.Flow LeftToRight } flow, with Large size and Free movement
*/

        IconMode(1);

        ViewMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListView$ViewMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewMode resolve(int value) {
            return (ViewMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ListMode;
            case 1: return IconMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Flow implements com.trolltech.qt.QtEnumerator {
/**
 The items are laid out in the view from the left to the right.
*/

        LeftToRight(0),
/**
 The items are laid out in the view from the top to the bottom.
*/

        TopToBottom(1);

        Flow(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListView$Flow constant with the specified <tt>int</tt>.</brief>
*/

        public static Flow resolve(int value) {
            return (Flow) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LeftToRight;
            case 1: return TopToBottom;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Movement implements com.trolltech.qt.QtEnumerator {
/**
 The items cannot be moved by the user.
*/

        Static(0),
/**
 The items can be moved freely by the user.
*/

        Free(1),
/**
 The items snap to the specified grid when moved; see setGridSize().
*/

        Snap(2);

        Movement(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListView$Movement constant with the specified <tt>int</tt>.</brief>
*/

        public static Movement resolve(int value) {
            return (Movement) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Static;
            case 1: return Free;
            case 2: return Snap;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<com.trolltech.qt.core.QModelIndex>(named: indexes)&gt;:<p> This signal is emitted when the specified <tt>indexes</tt> are moved in the view.
*/

    public final Signal1<java.util.List<com.trolltech.qt.core.QModelIndex>> indexesMoved = new Signal1<java.util.List<com.trolltech.qt.core.QModelIndex>>();

    private final void indexesMoved(java.util.List<com.trolltech.qt.core.QModelIndex> indexes)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_indexesMoved_List(nativeId(), indexes);
    }
    native void __qt_indexesMoved_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QModelIndex> indexes);


/**
Creates a new QListView with the given <tt>parent</tt> to view a model. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model.
*/

    public QListView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Creates a new QListView with the given <tt>parent</tt> to view a model. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model.
*/

    public QListView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QListView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QListView_QWidget(long parent);

/**
This property holds the number of items laid out in each batch if {@link QListView#layoutMode() layoutMode} is set to {@link com.trolltech.qt.gui.QListView.LayoutMode Batched }. The default value is 100.
*/

    @com.trolltech.qt.QtPropertyReader(name="batchSize")
    @QtBlockedSlot
    public final int batchSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_batchSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_batchSize(long __this__nativeId);

/**
Clears the QListView-specific property flags. See {@link QListView#viewMode() viewMode}. <p>Properties inherited from {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} are not covered by the property flags. Specifically, {@link QAbstractItemView#dragEnabled() dragEnabled} and {@link QWidget#acceptDrops() acceptsDrops} are computed by QListView when calling {@link com.trolltech.qt.gui.QListView#setMovement(com.trolltech.qt.gui.QListView.Movement) setMovement()} or {@link com.trolltech.qt.gui.QListView#setViewMode(com.trolltech.qt.gui.QListView.ViewMode) setViewMode()}.
*/

    @QtBlockedSlot
    public final void clearPropertyFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearPropertyFlags(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearPropertyFlags(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QSize contentsSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentsSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_contentsSize(long __this__nativeId);

/**
This property holds which direction the items layout should flow.  If this property is {@link com.trolltech.qt.gui.QListView.Flow LeftToRight }, the items will be laid out left to right. If the {@link QListView#isWrapping() isWrapping} property is true, the layout will wrap when it reaches the right side of the visible area. If this property is {@link com.trolltech.qt.gui.QListView.Flow TopToBottom }, the items will be laid out from the top of the visible area, wrapping when it reaches the bottom. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.Flow TopToBottom }. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="flow")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListView.Flow flow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QListView.Flow.resolve(__qt_flow(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flow(long __this__nativeId);

/**
This property holds the size of the layout grid. This property is the size of the grid in which the items are laid out. The default is an empty size which means that there is no grid and the layout is not done in a grid. Setting this property to a non-empty size switches on the grid layout. (When a grid layout is in force the {@link QListView#spacing() spacing} property is ignored.) <p>Setting this property when the view is visible will cause the items to be laid out again. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="gridSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize gridSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_gridSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_gridSize(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    protected final void internalDrag(com.trolltech.qt.core.Qt.DropAction ... supportedActions) {
        this.internalDrag(new com.trolltech.qt.core.Qt.DropActions(supportedActions));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void internalDrag(com.trolltech.qt.core.Qt.DropActions supportedActions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_internalDrag_DropActions(nativeId(), supportedActions.value());
    }
    @QtBlockedSlot
    native void __qt_internalDrag_DropActions(long __this__nativeId, int supportedActions);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void internalDrop(com.trolltech.qt.gui.QDropEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_internalDrop_QDropEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_internalDrop_QDropEvent(long __this__nativeId, long e);

/**
Returns true if the <tt>row</tt> is hidden; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isRowHidden(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRowHidden_int(nativeId(), row);
    }
    @QtBlockedSlot
    native boolean __qt_isRowHidden_int(long __this__nativeId, int row);

/**
This property holds if the selection rectangle should be visible. If this property is true then the selection rectangle is visible; otherwise it will be hidden. <p><b>Note:</b> The selection rectangle will only be visible if the selection mode is in a mode where more than one item can be selected; i.e., it will not draw a selection rectangle if the selection mode is {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode QAbstractItemView::SingleSelection }. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="selectionRectVisible")
    @QtBlockedSlot
    public final boolean isSelectionRectVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelectionRectVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelectionRectVisible(long __this__nativeId);

/**
This property holds whether the items layout should wrap.  This property holds whether the layout should wrap when there is no more space in the visible area. The point at which the layout wraps depends on the {@link QListView#flow() flow} property. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="isWrapping")
    @QtBlockedSlot
    public final boolean isWrapping()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWrapping(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWrapping(long __this__nativeId);

/**
This property determines whether the layout of items should happen immediately or be delayed.  This property holds the layout mode for the items. When the mode is {@link com.trolltech.qt.gui.QListView.LayoutMode SinglePass } (the default), the items are laid out all in one go. When the mode is {@link com.trolltech.qt.gui.QListView.LayoutMode Batched }, the items are laid out in batches of {@link QListView#batchSize() batchSize} items, while processing events. This makes it possible to instantly view and interact with the visible items while the rest are being laid out. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="layoutMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListView.LayoutMode layoutMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QListView.LayoutMode.resolve(__qt_layoutMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_layoutMode(long __this__nativeId);

/**
This property holds the column in the model that is visible. By default, this property contains 0, indicating that the first column in the model will be shown.
*/

    @com.trolltech.qt.QtPropertyReader(name="modelColumn")
    @QtBlockedSlot
    public final int modelColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_modelColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_modelColumn(long __this__nativeId);

/**
This property holds whether the items can be moved freely, are snapped to a grid, or cannot be moved at all.  This property determines how the user can move the items in the view. {@link com.trolltech.qt.gui.QListView.Movement Static } means that the items can't be moved the user. {@link com.trolltech.qt.gui.QListView.Movement Free } means that the user can drag and drop the items to any position in the view. {@link com.trolltech.qt.gui.QListView.Movement Snap } means that the user can drag and drop the items, but only to the positions in a notional grid signified by the {@link QListView#gridSize() gridSize} property. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.Movement Static }. <p><DT><b>See also:</b><br><DD>{@link QListView#gridSize() gridSize}, {@link QListView#resizeMode() resizeMode}, and {@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="movement")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListView.Movement movement()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QListView.Movement.resolve(__qt_movement(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_movement(long __this__nativeId);

/**
Returns the rectangle of the item at position <tt>index</tt> in the model. The rectangle is in contents coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#visualRect(com.trolltech.qt.core.QModelIndex) visualRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect rectForIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rectForIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rectForIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void resizeContents(int width, int height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeContents_int_int(nativeId(), width, height);
    }
    @QtBlockedSlot
    native void __qt_resizeContents_int_int(long __this__nativeId, int width, int height);

/**
This property holds whether the items are laid out again when the view is resized.  If this property is {@link com.trolltech.qt.gui.QListView.ResizeMode Adjust }, the items will be laid out again when the view is resized. If the value is {@link com.trolltech.qt.gui.QListView.ResizeMode Fixed }, the items will not be laid out when the view is resized. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.ResizeMode Fixed }. <p><DT><b>See also:</b><br><DD>{@link QListView#movement() movement}, {@link QListView#gridSize() gridSize}, and {@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="resizeMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListView.ResizeMode resizeMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QListView.ResizeMode.resolve(__qt_resizeMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_resizeMode(long __this__nativeId);

/**
This property holds the number of items laid out in each batch if {@link QListView#layoutMode() layoutMode} is set to {@link com.trolltech.qt.gui.QListView.LayoutMode Batched }. The default value is 100.
*/

    @com.trolltech.qt.QtPropertyWriter(name="batchSize")
    @QtBlockedSlot
    public final void setBatchSize(int batchSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBatchSize_int(nativeId(), batchSize);
    }
    @QtBlockedSlot
    native void __qt_setBatchSize_int(long __this__nativeId, int batchSize);

/**
This property holds which direction the items layout should flow.  If this property is {@link com.trolltech.qt.gui.QListView.Flow LeftToRight }, the items will be laid out left to right. If the {@link QListView#isWrapping() isWrapping} property is true, the layout will wrap when it reaches the right side of the visible area. If this property is {@link com.trolltech.qt.gui.QListView.Flow TopToBottom }, the items will be laid out from the top of the visible area, wrapping when it reaches the bottom. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.Flow TopToBottom }. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="flow")
    @QtBlockedSlot
    public final void setFlow(com.trolltech.qt.gui.QListView.Flow flow)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlow_Flow(nativeId(), flow.value());
    }
    @QtBlockedSlot
    native void __qt_setFlow_Flow(long __this__nativeId, int flow);

/**
This property holds the size of the layout grid. This property is the size of the grid in which the items are laid out. The default is an empty size which means that there is no grid and the layout is not done in a grid. Setting this property to a non-empty size switches on the grid layout. (When a grid layout is in force the {@link QListView#spacing() spacing} property is ignored.) <p>Setting this property when the view is visible will cause the items to be laid out again. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="gridSize")
    @QtBlockedSlot
    public final void setGridSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGridSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGridSize_QSize(long __this__nativeId, long size);

/**
This property determines whether the layout of items should happen immediately or be delayed.  This property holds the layout mode for the items. When the mode is {@link com.trolltech.qt.gui.QListView.LayoutMode SinglePass } (the default), the items are laid out all in one go. When the mode is {@link com.trolltech.qt.gui.QListView.LayoutMode Batched }, the items are laid out in batches of {@link QListView#batchSize() batchSize} items, while processing events. This makes it possible to instantly view and interact with the visible items while the rest are being laid out. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="layoutMode")
    @QtBlockedSlot
    public final void setLayoutMode(com.trolltech.qt.gui.QListView.LayoutMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayoutMode_LayoutMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setLayoutMode_LayoutMode(long __this__nativeId, int mode);

/**
This property holds the column in the model that is visible. By default, this property contains 0, indicating that the first column in the model will be shown.
*/

    @com.trolltech.qt.QtPropertyWriter(name="modelColumn")
    @QtBlockedSlot
    public final void setModelColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModelColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_setModelColumn_int(long __this__nativeId, int column);

/**
This property holds whether the items can be moved freely, are snapped to a grid, or cannot be moved at all.  This property determines how the user can move the items in the view. {@link com.trolltech.qt.gui.QListView.Movement Static } means that the items can't be moved the user. {@link com.trolltech.qt.gui.QListView.Movement Free } means that the user can drag and drop the items to any position in the view. {@link com.trolltech.qt.gui.QListView.Movement Snap } means that the user can drag and drop the items, but only to the positions in a notional grid signified by the {@link QListView#gridSize() gridSize} property. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.Movement Static }. <p><DT><b>See also:</b><br><DD>{@link QListView#gridSize() gridSize}, {@link QListView#resizeMode() resizeMode}, and {@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="movement")
    @QtBlockedSlot
    public final void setMovement(com.trolltech.qt.gui.QListView.Movement movement)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMovement_Movement(nativeId(), movement.value());
    }
    @QtBlockedSlot
    native void __qt_setMovement_Movement(long __this__nativeId, int movement);

/**
Sets the contents position of the item at <tt>index</tt> in the model to the given <tt>position</tt>. If the list view's movement mode is Static, this function will have no effect.
*/

    @QtBlockedSlot
    protected final void setPositionForIndex(com.trolltech.qt.core.QPoint position, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPositionForIndex_QPoint_QModelIndex(nativeId(), position == null ? 0 : position.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setPositionForIndex_QPoint_QModelIndex(long __this__nativeId, long position, com.trolltech.qt.core.QModelIndex index);

/**
This property holds whether the items are laid out again when the view is resized.  If this property is {@link com.trolltech.qt.gui.QListView.ResizeMode Adjust }, the items will be laid out again when the view is resized. If the value is {@link com.trolltech.qt.gui.QListView.ResizeMode Fixed }, the items will not be laid out when the view is resized. <p>By default, this property is set to {@link com.trolltech.qt.gui.QListView.ResizeMode Fixed }. <p><DT><b>See also:</b><br><DD>{@link QListView#movement() movement}, {@link QListView#gridSize() gridSize}, and {@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="resizeMode")
    @QtBlockedSlot
    public final void setResizeMode(com.trolltech.qt.gui.QListView.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeMode_ResizeMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setResizeMode_ResizeMode(long __this__nativeId, int mode);

/**
If <tt>hide</tt> is true, the given <tt>row</tt> will be hidden; otherwise the <tt>row</tt> will be shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListView#isRowHidden(int) isRowHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowHidden(int row, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowHidden_int_boolean(nativeId(), row, hide);
    }
    @QtBlockedSlot
    native void __qt_setRowHidden_int_boolean(long __this__nativeId, int row, boolean hide);

/**
This property holds if the selection rectangle should be visible. If this property is true then the selection rectangle is visible; otherwise it will be hidden. <p><b>Note:</b> The selection rectangle will only be visible if the selection mode is in a mode where more than one item can be selected; i.e., it will not draw a selection rectangle if the selection mode is {@link com.trolltech.qt.gui.QAbstractItemView.SelectionMode QAbstractItemView::SingleSelection }. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectionRectVisible")
    @QtBlockedSlot
    public final void setSelectionRectVisible(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionRectVisible_boolean(nativeId(), show);
    }
    @QtBlockedSlot
    native void __qt_setSelectionRectVisible_boolean(long __this__nativeId, boolean show);

/**
This property holds the space between items in the layout. This property is the size of the empty space that is padded around an item in the layout. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property contains a value of 0. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="spacing")
    @QtBlockedSlot
    public final void setSpacing(int space)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpacing_int(nativeId(), space);
    }
    @QtBlockedSlot
    native void __qt_setSpacing_int(long __this__nativeId, int space);

/**
This property holds whether all items in the listview have the same size. This property should only be set to true if it is guaranteed that all items in the view have the same size. This enables the view to do some optimizations for performance purposes. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="uniformItemSizes")
    @QtBlockedSlot
    public final void setUniformItemSizes(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUniformItemSizes_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setUniformItemSizes_boolean(long __this__nativeId, boolean enable);

/**
This property holds the view mode of the QListView.  This property will change the other unset properties to conform with the set view mode. QListView-specific properties that have already been set will not be changed, unless {@link com.trolltech.qt.gui.QListView#clearPropertyFlags() clearPropertyFlags()} has been called. <p>Setting the view mode will enable or disable drag and drop based on the selected movement. For {@link com.trolltech.qt.gui.QListView.ViewMode ListMode }, the default movement is {@link com.trolltech.qt.gui.QListView.Movement Static } (drag and drop disabled); for {@link com.trolltech.qt.gui.QListView.ViewMode IconMode }, the default movement is {@link com.trolltech.qt.gui.QListView.Movement Free } (drag and drop enabled). <p><DT><b>See also:</b><br><DD>{@link QListView#isWrapping() isWrapping}, {@link QListView#spacing() spacing}, {@link QListView#gridSize() gridSize}, {@link QListView#flow() flow}, {@link QListView#movement() movement}, and {@link QListView#resizeMode() resizeMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewMode")
    @QtBlockedSlot
    public final void setViewMode(com.trolltech.qt.gui.QListView.ViewMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewMode_ViewMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setViewMode_ViewMode(long __this__nativeId, int mode);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is false by default. <p>Please note that even if wrapping is enabled, the cell will not be expanded to make room for the text. It will print ellipsis for text that cannot be shown, according to the view's {@link QAbstractItemView#textElideMode() textElideMode}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="wordWrap")
    @QtBlockedSlot
    public final void setWordWrap(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWordWrap_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setWordWrap_boolean(long __this__nativeId, boolean on);

/**
This property holds whether the items layout should wrap.  This property holds whether the layout should wrap when there is no more space in the visible area. The point at which the layout wraps depends on the {@link QListView#flow() flow} property. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="isWrapping")
    @QtBlockedSlot
    public final void setWrapping(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWrapping_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setWrapping_boolean(long __this__nativeId, boolean enable);

/**
This property holds the space between items in the layout. This property is the size of the empty space that is padded around an item in the layout. <p>Setting this property when the view is visible will cause the items to be laid out again. <p>By default, this property contains a value of 0. <p><DT><b>See also:</b><br><DD>{@link QListView#viewMode() viewMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="spacing")
    @QtBlockedSlot
    public final int spacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_spacing(long __this__nativeId);

/**
This property holds whether all items in the listview have the same size. This property should only be set to true if it is guaranteed that all items in the view have the same size. This enables the view to do some optimizations for performance purposes. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="uniformItemSizes")
    @QtBlockedSlot
    public final boolean uniformItemSizes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uniformItemSizes(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_uniformItemSizes(long __this__nativeId);

/**
This property holds the view mode of the QListView.  This property will change the other unset properties to conform with the set view mode. QListView-specific properties that have already been set will not be changed, unless {@link com.trolltech.qt.gui.QListView#clearPropertyFlags() clearPropertyFlags()} has been called. <p>Setting the view mode will enable or disable drag and drop based on the selected movement. For {@link com.trolltech.qt.gui.QListView.ViewMode ListMode }, the default movement is {@link com.trolltech.qt.gui.QListView.Movement Static } (drag and drop disabled); for {@link com.trolltech.qt.gui.QListView.ViewMode IconMode }, the default movement is {@link com.trolltech.qt.gui.QListView.Movement Free } (drag and drop enabled). <p><DT><b>See also:</b><br><DD>{@link QListView#isWrapping() isWrapping}, {@link QListView#spacing() spacing}, {@link QListView#gridSize() gridSize}, {@link QListView#flow() flow}, {@link QListView#movement() movement}, and {@link QListView#resizeMode() resizeMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="viewMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListView.ViewMode viewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QListView.ViewMode.resolve(__qt_viewMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewMode(long __this__nativeId);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is false by default. <p>Please note that even if wrapping is enabled, the cell will not be expanded to make room for the text. It will print ellipsis for text that cannot be shown, according to the view's {@link QAbstractItemView#textElideMode() textElideMode}.
*/

    @com.trolltech.qt.QtPropertyReader(name="wordWrap")
    @QtBlockedSlot
    public final boolean wordWrap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wordWrap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wordWrap(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    @QtBlockedSlot
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dataChanged(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataChanged_QModelIndex_QModelIndex(nativeId(), topLeft, bottomRight);
    }
    @QtBlockedSlot
    native void __qt_dataChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void doItemsLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_doItemsLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_doItemsLayout(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int horizontalOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalOffset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_horizontalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex indexAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexAt_QPoint(long __this__nativeId, long p);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean isIndexHidden(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isIndexHidden_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isIndexHidden_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QModelIndex moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction cursorAction, com.trolltech.qt.core.Qt.KeyboardModifiers modifiers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_moveCursor_CursorAction_KeyboardModifiers(nativeId(), cursorAction.value(), modifiers.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_moveCursor_CursorAction_KeyboardModifiers(long __this__nativeId, int cursorAction, int modifiers);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void rowsAboutToBeRemoved(com.trolltech.qt.core.QModelIndex parent, int start, int end)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowsAboutToBeRemoved_QModelIndex_int_int(nativeId(), parent, start, end);
    }
    @QtBlockedSlot
    native void __qt_rowsAboutToBeRemoved_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int start, int end);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void rowsInserted(com.trolltech.qt.core.QModelIndex parent, int start, int end)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowsInserted_QModelIndex_int_int(nativeId(), parent, start, end);
    }
    @QtBlockedSlot
    native void __qt_rowsInserted_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int start, int end);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void scrollContentsBy(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollContentsBy_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scrollContentsBy_int_int(long __this__nativeId, int dx, int dy);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void scrollTo(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QAbstractItemView.ScrollHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollTo_QModelIndex_ScrollHint(nativeId(), index, hint.value());
    }
    @QtBlockedSlot
    native void __qt_scrollTo_QModelIndex_ScrollHint(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int hint);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void selectionChanged(com.trolltech.qt.gui.QItemSelection selected, com.trolltech.qt.gui.QItemSelection deselected)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged_QItemSelection_QItemSelection(nativeId(), selected == null ? 0 : selected.nativeId(), deselected == null ? 0 : deselected.nativeId());
    }
    @QtBlockedSlot
    native void __qt_selectionChanged_QItemSelection_QItemSelection(long __this__nativeId, long selected, long deselected);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setRootIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setRootIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void setSelection(com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelection_QRect_SelectionFlags(nativeId(), rect == null ? 0 : rect.nativeId(), command.value());
    }
    @QtBlockedSlot
    native void __qt_setSelection_QRect_SelectionFlags(long __this__nativeId, long rect, int command);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void updateGeometries()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometries(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateGeometries(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int verticalOffset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalOffset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_verticalOffset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    public com.trolltech.qt.core.QRect visualRect(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualRect_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_visualRect_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QRegion visualRegionForSelection(com.trolltech.qt.gui.QItemSelection selection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualRegionForSelection_QItemSelection(nativeId(), selection == null ? 0 : selection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_visualRegionForSelection_QItemSelection(long __this__nativeId, long selection);

/**
@exclude
*/

    public static native QListView fromNativePointer(QNativePointer nativePointer);

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

    protected QListView(QPrivateConstructor p) { super(p); } 
}
