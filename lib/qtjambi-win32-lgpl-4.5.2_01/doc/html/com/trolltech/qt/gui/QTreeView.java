package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTreeView class provides a default model/view implementation of a tree view. A QTreeView implements a tree representation of items from a model. This class is used to provide standard hierarchical lists that were previously provided by the <tt>QListView</tt> class, but using the more flexible approach provided by Qt's model/view architecture. <p>The QTreeView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>QTreeView implements the interfaces defined by the {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} class to allow it to display data provided by models derived from the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} class. <p>It is simple to construct a tree view displaying data from a model. In the following example, the contents of a directory are supplied by a {@link com.trolltech.qt.gui.QDirModel QDirModel} and displayed as a tree: <pre class="snippet">
    QDirModel model = new QDirModel();
   
    QTreeView tree = new QTreeView(splitter);

    tree.setModel(model);
 </pre> The model/view architecture ensures that the contents of the tree view are updated as the model changes. <p>Items that have children can be in an expanded (children are visible) or collapsed (children are hidden) state. When this state changes a {@link com.trolltech.qt.gui.QTreeView#collapsed collapsed() } or {@link com.trolltech.qt.gui.QTreeView#expanded expanded() } signal is emitted with the model index of the relevant item. <p>The amount of indentation used to indicate levels of hierarchy is controlled by the {@link QTreeView#indentation() indentation} property. <p>Headers in tree views are constructed using the {@link com.trolltech.qt.gui.QHeaderView QHeaderView} class and can be hidden using <tt>header()-&gt;hide()</tt>. Note that each header is configured with its {@link QHeaderView#stretchLastSection() stretchLastSection} property set to true, ensuring that the view does not waste any of the space assigned to it for its header. If this value is set to true, this property will override the resize mode set on the last section in the header.<a name="key-bindings"><h2>Key Bindings</h2> QTreeView supports a set of key bindings that enable the user to navigate in the view and interact with the contents of items: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Key</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> Up</td><td> Moves the cursor to the item in the same column on the previous row. If the parent of the current item has no more rows to navigate to, the cursor moves to the relevant item in the last row of the sibling that precedes the parent.</td></tr><tr valign="top" class="odd"><td> Down</td><td> Moves the cursor to the item in the same column on the next row. If the parent of the current item has no more rows to navigate to, the cursor moves to the relevant item in the first row of the sibling that follows the parent.</td></tr><tr valign="top" class="even"><td> Left</td><td> Hides the children of the current item (if present) by collapsing a branch.</td></tr><tr valign="top" class="odd"><td> Minus</td><td> Same as LeftArrow.</td></tr><tr valign="top" class="even"><td> Right</td><td> Reveals the children of the current item (if present) by expanding a branch.</td></tr><tr valign="top" class="odd"><td> Plus</td><td> Same as RightArrow.</td></tr><tr valign="top" class="even"><td> Asterisk</td><td> Expands all children of the current item (if present).</td></tr><tr valign="top" class="odd"><td> PageUp</td><td> Moves the cursor up one page.</td></tr><tr valign="top" class="even"><td> PageDown</td><td> Moves the cursor down one page.</td></tr><tr valign="top" class="odd"><td> Home</td><td> Moves the cursor to an item in the same column of the first row of the first top-level item in the model.</td></tr><tr valign="top" class="even"><td> End</td><td> Moves the cursor to an item in the same column of the last row of the last top-level item in the model.</td></tr><tr valign="top" class="odd"><td> F2</td><td> In editable models, this opens the current item for editing. The Escape key can be used to cancel the editing process and revert any changes to the data displayed.</td></tr></table> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-treeview.png"></center><br></td><td>  <br><center><img src="../images/macintosh-treeview.png"></center><br></td><td>  <br><center><img src="../images/plastique-treeview.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} tree view.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} tree view.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} tree view.</td></tr></table><a name="improving-performance"><h2>Improving Performance</h2> It is possible to give the view hints about the data it is handling in order to improve its performance when displaying large numbers of items. One approach that can be taken for views that are intended to display items with equal heights is to set the {@link QTreeView#uniformRowHeights() uniformRowHeights} property to true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget}, {@link <a href="../model-view-view.html">View Classes</a>}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}, and {@link <a href="../itemviews-dirview.html">Dir View Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTreeView extends com.trolltech.qt.gui.QAbstractItemView
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when the item specified by <tt>index</tt> is collapsed.
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> collapsed = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void collapsed(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_collapsed_QModelIndex(nativeId(), index);
    }
    native void __qt_collapsed_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when the item specified by <tt>index</tt> is expanded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#setExpanded(com.trolltech.qt.core.QModelIndex, boolean) setExpanded()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> expanded = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void expanded(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expanded_QModelIndex(nativeId(), index);
    }
    native void __qt_expanded_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);


/**
Constructs a table view with a <tt>parent</tt> to represent a model's data. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QTreeView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a table view with a <tt>parent</tt> to represent a model's data. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QTreeView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTreeView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTreeView_QWidget(long parent);

/**
This property holds whether items should show keyboard focus using all columns. If this property is true all columns will show focus, otherwise only one column will show focus. <p>The default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="allColumnsShowFocus")
    @QtBlockedSlot
    public final boolean allColumnsShowFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allColumnsShowFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_allColumnsShowFocus(long __this__nativeId);

/**
This property holds The delay time before items in a tree are opened during a drag and drop operation.  This property holds the amount of time in milliseconds that the user must wait over a node before that node will automatically open or close. If the time is set to less then 0 then it will not be activated. <p>By default, this property has a value of -1, meaning that auto-expansion is disabled.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoExpandDelay")
    @QtBlockedSlot
    public final int autoExpandDelay()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoExpandDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_autoExpandDelay(long __this__nativeId);

/**
Collapses the model item specified by the <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#collapsed collapsed() }. <br></DD></DT>
*/

    public final void collapse(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_collapse_QModelIndex(nativeId(), index);
    }
    native void __qt_collapse_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Collapses all expanded items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#expandAll() expandAll()}, {@link com.trolltech.qt.gui.QTreeView#expand(com.trolltech.qt.core.QModelIndex) expand()}, {@link com.trolltech.qt.gui.QTreeView#collapse(com.trolltech.qt.core.QModelIndex) collapse()}, and {@link com.trolltech.qt.gui.QTreeView#setExpanded(com.trolltech.qt.core.QModelIndex, boolean) setExpanded()}. <br></DD></DT>
*/

    public final void collapseAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_collapseAll(nativeId());
    }
    native void __qt_collapseAll(long __this__nativeId);

/**
Returns the column in the tree view whose header covers the <tt>x</tt> coordinate given.
*/

    @QtBlockedSlot
    public final int columnAt(int x)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnAt_int(nativeId(), x);
    }
    @QtBlockedSlot
    native int __qt_columnAt_int(long __this__nativeId, int x);

/**
Informs the tree view that the number of columns in the tree view has changed from <tt>oldCount</tt> to <tt>newCount</tt>.
*/

    protected final void columnCountChanged(int oldCount, int newCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnCountChanged_int_int(nativeId(), oldCount, newCount);
    }
    native void __qt_columnCountChanged_int_int(long __this__nativeId, int oldCount, int newCount);

/**
This slot is called whenever a column has been moved.
*/

    protected final void columnMoved()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnMoved(nativeId());
    }
    native void __qt_columnMoved(long __this__nativeId);

/**
This function is called whenever <tt>column</tt>'s size is changed in the header. <tt>oldSize</tt> and <tt>newSize</tt> give the previous size and the new size in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#setColumnWidth(int, int) setColumnWidth()}. <br></DD></DT>
*/

    protected final void columnResized(int column, int oldSize, int newSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_columnResized_int_int_int(nativeId(), column, oldSize, newSize);
    }
    native void __qt_columnResized_int_int_int(long __this__nativeId, int column, int oldSize, int newSize);

/**
Returns the horizontal position of the <tt>column</tt> in the viewport.
*/

    @QtBlockedSlot
    public final int columnViewportPosition(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnViewportPosition_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnViewportPosition_int(long __this__nativeId, int column);

/**
Returns the width of the <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#resizeColumnToContents(int) resizeColumnToContents()}, and {@link com.trolltech.qt.gui.QTreeView#setColumnWidth(int, int) setColumnWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnWidth(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnWidth_int(long __this__nativeId, int column);

/**
Draws the part of the tree intersecting the given <tt>region</tt> using the specified <tt>painter</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void drawTree(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QRegion region)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawTree_QPainter_QRegion(nativeId(), painter == null ? 0 : painter.nativeId(), region == null ? 0 : region.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawTree_QPainter_QRegion(long __this__nativeId, long painter, long region);

/**
Expands the model item specified by the <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#expanded expanded() }. <br></DD></DT>
*/

    public final void expand(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expand_QModelIndex(nativeId(), index);
    }
    native void __qt_expand_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Expands all expandable items. <p>Warning: if the model contains a large number of items, this function will be take time to execute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#collapseAll() collapseAll()}, {@link com.trolltech.qt.gui.QTreeView#expand(com.trolltech.qt.core.QModelIndex) expand()}, {@link com.trolltech.qt.gui.QTreeView#collapse(com.trolltech.qt.core.QModelIndex) collapse()}, and {@link com.trolltech.qt.gui.QTreeView#setExpanded(com.trolltech.qt.core.QModelIndex, boolean) setExpanded()}. <br></DD></DT>
*/

    public final void expandAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expandAll(nativeId());
    }
    native void __qt_expandAll(long __this__nativeId);

/**
Expands all expandable items to the given <tt>depth</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#expandAll() expandAll()}, {@link com.trolltech.qt.gui.QTreeView#collapseAll() collapseAll()}, {@link com.trolltech.qt.gui.QTreeView#expand(com.trolltech.qt.core.QModelIndex) expand()}, {@link com.trolltech.qt.gui.QTreeView#collapse(com.trolltech.qt.core.QModelIndex) collapse()}, and {@link com.trolltech.qt.gui.QTreeView#setExpanded(com.trolltech.qt.core.QModelIndex, boolean) setExpanded()}. <br></DD></DT>
*/

    public final void expandToDepth(int depth)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expandToDepth_int(nativeId(), depth);
    }
    native void __qt_expandToDepth_int(long __this__nativeId, int depth);

/**
This property holds whether the items can be expanded by double-clicking.  This property holds whether the user can expand and collapse items by double-clicking. The default value is true. <p><DT><b>See also:</b><br><DD>{@link QTreeView#itemsExpandable() itemsExpandable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="expandsOnDoubleClick")
    @QtBlockedSlot
    public final boolean expandsOnDoubleClick()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expandsOnDoubleClick(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_expandsOnDoubleClick(long __this__nativeId);

/**
Returns the header for the tree view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#setHeader(com.trolltech.qt.gui.QHeaderView) setHeader()}, and {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) QAbstractItemModel::headerData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QHeaderView header()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_header(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QHeaderView __qt_header(long __this__nativeId);

/**
Hides the <tt>column</tt> given. <p><b>Note:</b> This function should only be called after the model has been initialized, as the view needs to know the number of columns in order to hide <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#showColumn(int) showColumn()}, and {@link com.trolltech.qt.gui.QTreeView#setColumnHidden(int, boolean) setColumnHidden()}. <br></DD></DT>
*/

    public final void hideColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideColumn_int(nativeId(), column);
    }
    native void __qt_hideColumn_int(long __this__nativeId, int column);

/**
This property holds indentation of the items in the tree view.  This property holds the indentation measured in pixels of the items for each level in the tree view. For top-level items, the indentation specifies the horizontal distance from the viewport edge to the items in the first column; for child items, it specifies their indentation from their parent items. <p>By default, this property has a value of 20.
*/

    @com.trolltech.qt.QtPropertyReader(name="indentation")
    @QtBlockedSlot
    public final int indentation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indentation(nativeId());
    }
    @QtBlockedSlot
    native int __qt_indentation(long __this__nativeId);

/**
Returns the model index of the item above <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex indexAbove(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexAbove_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexAbove_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the model index of the item below <tt>index</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex indexBelow(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexBelow_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexBelow_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the size hint for the row indicated by <tt>index</tt>. <p><DT><b>See also:</b><br><DD>sizeHintForColumn(), and {@link com.trolltech.qt.gui.QTreeView#uniformRowHeights() uniformRowHeights()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int indexRowSizeHint(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexRowSizeHint_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native int __qt_indexRowSizeHint_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds whether animations are enabled. If this property is true the treeview will animate expandsion and collasping of branches. If this property is false, the treeview will expand or collapse branches immediately without showing the animation. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="animated")
    @QtBlockedSlot
    public final boolean isAnimated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAnimated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAnimated(long __this__nativeId);

/**
Returns true if the <tt>column</tt> is hidden; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#hideColumn(int) hideColumn()}, and {@link com.trolltech.qt.gui.QTreeView#isRowHidden(int, com.trolltech.qt.core.QModelIndex) isRowHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isColumnHidden(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isColumnHidden_int(nativeId(), column);
    }
    @QtBlockedSlot
    native boolean __qt_isColumnHidden_int(long __this__nativeId, int column);

/**
Returns true if the model item <tt>index</tt> is expanded; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#expand(com.trolltech.qt.core.QModelIndex) expand()}, {@link com.trolltech.qt.gui.QTreeView#expanded expanded() }, and {@link com.trolltech.qt.gui.QTreeView#setExpanded(com.trolltech.qt.core.QModelIndex, boolean) setExpanded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isExpanded(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExpanded_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isExpanded_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns true if the item in first column in the given <tt>row</tt> of the <tt>parent</tt> is spanning all the columns; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#setFirstColumnSpanned(int, com.trolltech.qt.core.QModelIndex, boolean) setFirstColumnSpanned()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFirstColumnSpanned(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFirstColumnSpanned_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_isFirstColumnSpanned_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);

/**
This property holds whether the header is shown or not.  If this property is true, the header is not shown otherwise it is. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#header() header()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="headerHidden")
    @QtBlockedSlot
    public final boolean isHeaderHidden()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHeaderHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHeaderHidden(long __this__nativeId);

/**
Returns true if the item in the given <tt>row</tt> of the <tt>parent</tt> is hidden; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#setRowHidden(int, com.trolltech.qt.core.QModelIndex, boolean) setRowHidden()}, and {@link com.trolltech.qt.gui.QTreeView#isColumnHidden(int) isColumnHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isRowHidden(int row, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRowHidden_int_QModelIndex(nativeId(), row, parent);
    }
    @QtBlockedSlot
    native boolean __qt_isRowHidden_int_QModelIndex(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent);

/**
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the tree; if the property is false, sorting is not enabled. The default value is false. <p><b>Note:</b> In order to avoid performance issues, it is recommended that sorting is enabled after inserting the items into the tree. Alternatively, you could also insert the items into a list before inserting the items into the tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#sortByColumn(int, com.trolltech.qt.core.Qt.SortOrder) sortByColumn()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sortingEnabled")
    @QtBlockedSlot
    public final boolean isSortingEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSortingEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSortingEnabled(long __this__nativeId);

/**
This property holds whether the items are expandable by the user.  This property holds whether the user can expand and collapse items interactively. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="itemsExpandable")
    @QtBlockedSlot
    public final boolean itemsExpandable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemsExpandable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_itemsExpandable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected final void reexpand()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reexpand(nativeId());
    }
    native void __qt_reexpand(long __this__nativeId);

/**
Resizes the <tt>column</tt> given to the size of its contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#columnWidth(int) columnWidth()}, and {@link com.trolltech.qt.gui.QTreeView#setColumnWidth(int, int) setColumnWidth()}. <br></DD></DT>
*/

    public final void resizeColumnToContents(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeColumnToContents_int(nativeId(), column);
    }
    native void __qt_resizeColumnToContents_int(long __this__nativeId, int column);

/**
This property holds whether to show controls for expanding and collapsing top-level items. Items with children are typically shown with controls to expand and collapse them, allowing their children to be shown or hidden. If this property is false, these controls are not shown for top-level items. This can be used to make a single level tree structure appear like a simple list of items. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="rootIsDecorated")
    @QtBlockedSlot
    public final boolean rootIsDecorated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootIsDecorated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rootIsDecorated(long __this__nativeId);

/**
Returns the height of the row indicated by the given <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#indexRowSizeHint(com.trolltech.qt.core.QModelIndex) indexRowSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int rowHeight(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowHeight_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native int __qt_rowHeight_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Informs the view that the rows from the <tt>start</tt> row to the <tt>end</tt> row inclusive have been removed from the given <tt>parent</tt> model item.
*/

    protected final void rowsRemoved(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rowsRemoved_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    native void __qt_rowsRemoved_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
This property holds whether items should show keyboard focus using all columns. If this property is true all columns will show focus, otherwise only one column will show focus. <p>The default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="allColumnsShowFocus")
    @QtBlockedSlot
    public final void setAllColumnsShowFocus(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAllColumnsShowFocus_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAllColumnsShowFocus_boolean(long __this__nativeId, boolean enable);

/**
This property holds whether animations are enabled. If this property is true the treeview will animate expandsion and collasping of branches. If this property is false, the treeview will expand or collapse branches immediately without showing the animation. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="animated")
    @QtBlockedSlot
    public final void setAnimated(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAnimated_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAnimated_boolean(long __this__nativeId, boolean enable);

/**
This property holds The delay time before items in a tree are opened during a drag and drop operation.  This property holds the amount of time in milliseconds that the user must wait over a node before that node will automatically open or close. If the time is set to less then 0 then it will not be activated. <p>By default, this property has a value of -1, meaning that auto-expansion is disabled.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoExpandDelay")
    @QtBlockedSlot
    public final void setAutoExpandDelay(int delay)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoExpandDelay_int(nativeId(), delay);
    }
    @QtBlockedSlot
    native void __qt_setAutoExpandDelay_int(long __this__nativeId, int delay);

/**
If <tt>hide</tt> is true the <tt>column</tt> is hidden, otherwise the <tt>column</tt> is shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#isColumnHidden(int) isColumnHidden()}, {@link com.trolltech.qt.gui.QTreeView#hideColumn(int) hideColumn()}, and {@link com.trolltech.qt.gui.QTreeView#setRowHidden(int, com.trolltech.qt.core.QModelIndex, boolean) setRowHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnHidden(int column, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnHidden_int_boolean(nativeId(), column, hide);
    }
    @QtBlockedSlot
    native void __qt_setColumnHidden_int_boolean(long __this__nativeId, int column, boolean hide);

/**
Sets the width of the given <tt>column</tt> to the <tt>width</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#columnWidth(int) columnWidth()}, and {@link com.trolltech.qt.gui.QTreeView#resizeColumnToContents(int) resizeColumnToContents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnWidth(int column, int width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnWidth_int_int(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnWidth_int_int(long __this__nativeId, int column, int width);

/**
Sets the item referred to by <tt>index</tt> to either collapse or expanded, depending on the value of <tt>expanded</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#expanded expanded() }, {@link com.trolltech.qt.gui.QTreeView#expand(com.trolltech.qt.core.QModelIndex) expand()}, and {@link com.trolltech.qt.gui.QTreeView#isExpanded(com.trolltech.qt.core.QModelIndex) isExpanded()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setExpanded(com.trolltech.qt.core.QModelIndex index, boolean expand)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpanded_QModelIndex_boolean(nativeId(), index, expand);
    }
    @QtBlockedSlot
    native void __qt_setExpanded_QModelIndex_boolean(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, boolean expand);

/**
This property holds whether the items can be expanded by double-clicking.  This property holds whether the user can expand and collapse items by double-clicking. The default value is true. <p><DT><b>See also:</b><br><DD>{@link QTreeView#itemsExpandable() itemsExpandable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="expandsOnDoubleClick")
    @QtBlockedSlot
    public final void setExpandsOnDoubleClick(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpandsOnDoubleClick_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setExpandsOnDoubleClick_boolean(long __this__nativeId, boolean enable);

/**
If <tt>span</tt> is true the item in the first column in the <tt>row</tt> with the given <tt>parent</tt> is set to span all columns, otherwise all items on the <tt>row</tt> are shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#isFirstColumnSpanned(int, com.trolltech.qt.core.QModelIndex) isFirstColumnSpanned()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFirstColumnSpanned(int row, com.trolltech.qt.core.QModelIndex parent, boolean span)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFirstColumnSpanned_int_QModelIndex_boolean(nativeId(), row, parent, span);
    }
    @QtBlockedSlot
    native void __qt_setFirstColumnSpanned_int_QModelIndex_boolean(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent, boolean span);

/**
Sets the header for the tree view, to the given <tt>header</tt>. <p>The view takes ownership over the given <tt>header</tt> and deletes it when a new header is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) QAbstractItemModel::headerData()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setHeader(com.trolltech.qt.gui.QHeaderView header)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeader_QHeaderView(nativeId(), header == null ? 0 : header.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setHeader_QHeaderView(long __this__nativeId, long header);

/**
This property holds whether the header is shown or not.  If this property is true, the header is not shown otherwise it is. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#header() header()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="headerHidden")
    @QtBlockedSlot
    public final void setHeaderHidden(boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderHidden_boolean(nativeId(), hide);
    }
    @QtBlockedSlot
    native void __qt_setHeaderHidden_boolean(long __this__nativeId, boolean hide);

/**
This property holds indentation of the items in the tree view.  This property holds the indentation measured in pixels of the items for each level in the tree view. For top-level items, the indentation specifies the horizontal distance from the viewport edge to the items in the first column; for child items, it specifies their indentation from their parent items. <p>By default, this property has a value of 20.
*/

    @com.trolltech.qt.QtPropertyWriter(name="indentation")
    @QtBlockedSlot
    public final void setIndentation(int i)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndentation_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_setIndentation_int(long __this__nativeId, int i);

/**
This property holds whether the items are expandable by the user.  This property holds whether the user can expand and collapse items interactively. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="itemsExpandable")
    @QtBlockedSlot
    public final void setItemsExpandable(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemsExpandable_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setItemsExpandable_boolean(long __this__nativeId, boolean enable);

/**
This property holds whether to show controls for expanding and collapsing top-level items. Items with children are typically shown with controls to expand and collapse them, allowing their children to be shown or hidden. If this property is false, these controls are not shown for top-level items. This can be used to make a single level tree structure appear like a simple list of items. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="rootIsDecorated")
    @QtBlockedSlot
    public final void setRootIsDecorated(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIsDecorated_boolean(nativeId(), show);
    }
    @QtBlockedSlot
    native void __qt_setRootIsDecorated_boolean(long __this__nativeId, boolean show);

/**
If <tt>hide</tt> is true the <tt>row</tt> with the given <tt>parent</tt> is hidden, otherwise the <tt>row</tt> is shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#isRowHidden(int, com.trolltech.qt.core.QModelIndex) isRowHidden()}, and {@link com.trolltech.qt.gui.QTreeView#setColumnHidden(int, boolean) setColumnHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowHidden(int row, com.trolltech.qt.core.QModelIndex parent, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowHidden_int_QModelIndex_boolean(nativeId(), row, parent, hide);
    }
    @QtBlockedSlot
    native void __qt_setRowHidden_int_QModelIndex_boolean(long __this__nativeId, int row, com.trolltech.qt.core.QModelIndex parent, boolean hide);

/**
This property holds whether sorting is enabled. If this property is true, sorting is enabled for the tree; if the property is false, sorting is not enabled. The default value is false. <p><b>Note:</b> In order to avoid performance issues, it is recommended that sorting is enabled after inserting the items into the tree. Alternatively, you could also insert the items into a list before inserting the items into the tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#sortByColumn(int, com.trolltech.qt.core.Qt.SortOrder) sortByColumn()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortingEnabled")
    @QtBlockedSlot
    public final void setSortingEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortingEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setSortingEnabled_boolean(long __this__nativeId, boolean enable);

/**
This property holds whether all items in the treeview have the same height. This property should only be set to true if it is guaranteed that all items in the view has the same height. This enables the view to do some optimizations. <p>The height is obtained from the first item in the view. It is updated when the data changes on that item. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="uniformRowHeights")
    @QtBlockedSlot
    public final void setUniformRowHeights(boolean uniform)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUniformRowHeights_boolean(nativeId(), uniform);
    }
    @QtBlockedSlot
    native void __qt_setUniformRowHeights_boolean(long __this__nativeId, boolean uniform);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is false by default. <p>Note that even if wrapping is enabled, the cell will not be expanded to fit all text. Ellipsis will be inserted according to the current {@link QAbstractItemView#textElideMode() textElideMode}.
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
Shows the given <tt>column</tt> in the tree view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeView#hideColumn(int) hideColumn()}, and {@link com.trolltech.qt.gui.QTreeView#setColumnHidden(int, boolean) setColumnHidden()}. <br></DD></DT>
*/

    public final void showColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showColumn_int(nativeId(), column);
    }
    native void __qt_showColumn_int(long __this__nativeId, int column);

/**
Sets the model up for sorting by the values in the given <tt>column</tt> and <tt>order</tt>. <p><tt>column</tt> may be -1, in which case no sort indicator will be shown and the model will return to its natural, unsorted order. Note that not all models support this and may even crash in this case. <p><DT><b>See also:</b><br><DD>{@link QTreeView#isSortingEnabled() sortingEnabled}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sortByColumn(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortByColumn_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sortByColumn_int_SortOrder(long __this__nativeId, int column, int order);

/**
This property holds whether all items in the treeview have the same height. This property should only be set to true if it is guaranteed that all items in the view has the same height. This enables the view to do some optimizations. <p>The height is obtained from the first item in the view. It is updated when the data changes on that item. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="uniformRowHeights")
    @QtBlockedSlot
    public final boolean uniformRowHeights()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uniformRowHeights(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_uniformRowHeights(long __this__nativeId);

/**
This property holds the item text word-wrapping policy. If this property is true then the item text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. This property is false by default. <p>Note that even if wrapping is enabled, the cell will not be expanded to fit all text. Ellipsis will be inserted according to the current {@link QAbstractItemView#textElideMode() textElideMode}.
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
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long event);

/**
Draws the branches in the tree view on the same row as the model item <tt>index</tt>, using the <tt>painter</tt> given. The branches are drawn in the rectangle specified by <tt>rect</tt>.
*/

    @QtBlockedSlot
    protected void drawBranches(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawBranches_QPainter_QRect_QModelIndex(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_drawBranches_QPainter_QRect_QModelIndex(long __this__nativeId, long painter, long rect, com.trolltech.qt.core.QModelIndex index);

/**
Draws the row in the tree view that contains the model item <tt>index</tt>, using the <tt>painter</tt> given. The <tt>option</tt> control how the item is displayed. <p><DT><b>See also:</b><br><DD>setAlternatingRowColors(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected void drawRow(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem options, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawRow_QPainter_QStyleOptionViewItem_QModelIndex(nativeId(), painter == null ? 0 : painter.nativeId(), options == null ? 0 : options.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_drawRow_QPainter_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long painter, long options, com.trolltech.qt.core.QModelIndex index);

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
    protected void horizontalScrollbarAction(int action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_horizontalScrollbarAction_int(nativeId(), action);
    }
    @QtBlockedSlot
    native void __qt_horizontalScrollbarAction_int(long __this__nativeId, int action);

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
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

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

    public void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

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
    public void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            com.trolltech.qt.GeneratorUtilities.setField(this, QAbstractItemView.class, "__rcItemModel", model);
        }
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
        // setModel() creates a new selection model for the object
        com.trolltech.qt.GeneratorUtilities.setField(this, com.trolltech.qt.gui.QAbstractItemView.class, "__rcItemSelectionModel", null);


    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model);

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
    public void setSelectionModel(com.trolltech.qt.gui.QItemSelectionModel selectionModel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (selectionModel == null)
            throw new NullPointerException("Argument 'selectionModel': null not expected.");
        {
            com.trolltech.qt.GeneratorUtilities.setField(this, QAbstractItemView.class, "__rcItemSelectionModel", selectionModel);
        }
        __qt_setSelectionModel_QItemSelectionModel(nativeId(), selectionModel == null ? 0 : selectionModel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSelectionModel_QItemSelectionModel(long __this__nativeId, long selectionModel);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long event);

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

    public static native QTreeView fromNativePointer(QNativePointer nativePointer);

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

    protected QTreeView(QPrivateConstructor p) { super(p); } 
}
