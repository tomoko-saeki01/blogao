package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QColumnView class provides a model/view implementation of a column view. QColumnView displays a model in a number of QListViews, one for each hierarchy in the tree. This is sometimes referred to as a cascading list. <p>The QColumnView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>QColumnView implements the interfaces defined by the {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} class to allow it to display data provided by models derived from the {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel} class. <br><center><img src="../images/qcolumnview.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QColumnView extends com.trolltech.qt.gui.QAbstractItemView
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal is emitted when the preview widget should be updated to provide rich information about <tt>index</tt> <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#previewWidget() previewWidget()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> updatePreviewWidget = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void updatePreviewWidget(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updatePreviewWidget_QModelIndex(nativeId(), index);
    }
    native void __qt_updatePreviewWidget_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);


/**
Constructs a column view with a <tt>parent</tt> to represent a model's data. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QColumnView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a column view with a <tt>parent</tt> to represent a model's data. Use {@link com.trolltech.qt.gui.QAbstractItemView#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} to set the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/

    public QColumnView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QColumnView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QColumnView_QWidget(long parent);

/**
Returns a list of the width of all the columns in this view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#setColumnWidths(java.util.List) setColumnWidths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> columnWidths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnWidths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_columnWidths(long __this__nativeId);

/**
Copies the behavior and options of the column view and applies them to the <tt>column</tt> such as the iconSize(), textElideMode() and alternatingRowColors(). This can be useful when reimplementing {@link com.trolltech.qt.gui.QColumnView#createColumn(com.trolltech.qt.core.QModelIndex) createColumn()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#createColumn(com.trolltech.qt.core.QModelIndex) createColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void initializeColumn(com.trolltech.qt.gui.QAbstractItemView column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeColumn_QAbstractItemView(nativeId(), column == null ? 0 : column.nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializeColumn_QAbstractItemView(long __this__nativeId, long column);

/**
Returns the preview widget, or 0 if there is none. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#setPreviewWidget(com.trolltech.qt.gui.QWidget) setPreviewWidget()}, and {@link com.trolltech.qt.gui.QColumnView#updatePreviewWidget updatePreviewWidget() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget previewWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previewWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_previewWidget(long __this__nativeId);

/**
This property holds the way to specify if the list views gets resize grips or not. By default, <tt>visible</tt> is set to true <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setRootIndex(com.trolltech.qt.core.QModelIndex) setRootIndex()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="resizeGripsVisible")
    @QtBlockedSlot
    public final boolean resizeGripsVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resizeGripsVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_resizeGripsVisible(long __this__nativeId);

/**
Sets the column widths to the values given in the <tt>list</tt>. Extra values in the list are kept and used when the columns are created. <p>If list contains too few values, only width of the rest of the columns will not be modified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#columnWidths() columnWidths()}, and {@link com.trolltech.qt.gui.QColumnView#createColumn(com.trolltech.qt.core.QModelIndex) createColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnWidths(java.util.List<java.lang.Integer> list)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnWidths_List(nativeId(), list);
    }
    @QtBlockedSlot
    native void __qt_setColumnWidths_List(long __this__nativeId, java.util.List<java.lang.Integer> list);

/**
Sets the preview <tt>widget</tt>. <p>The <tt>widget</tt> becomes a child of the column view, and will be destroyed when the column area is deleted or when a new widget is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#previewWidget() previewWidget()}, and {@link com.trolltech.qt.gui.QColumnView#updatePreviewWidget updatePreviewWidget() }. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setPreviewWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreviewWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setPreviewWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds the way to specify if the list views gets resize grips or not. By default, <tt>visible</tt> is set to true <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemView#setRootIndex(com.trolltech.qt.core.QModelIndex) setRootIndex()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="resizeGripsVisible")
    @QtBlockedSlot
    public final void setResizeGripsVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeGripsVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setResizeGripsVisible_boolean(long __this__nativeId, boolean visible);

/**
To use a custom widget for the final column when you select an item overload this function and return a widget. <tt>index</tt> is the root index that will be assigned to the view. <p>Return the new view. QColumnView will automatically take ownership of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColumnView#setPreviewWidget(com.trolltech.qt.gui.QWidget) setPreviewWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QAbstractItemView createColumn(com.trolltech.qt.core.QModelIndex rootIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createColumn_QModelIndex(nativeId(), rootIndex);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemView __qt_createColumn_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex rootIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, previous);
    }
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex previous);

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
    public com.trolltech.qt.core.QModelIndex indexAt(com.trolltech.qt.core.QPoint point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexAt_QPoint(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexAt_QPoint(long __this__nativeId, long point);

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
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

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
    public void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    @QtBlockedSlot
    native void __qt_selectAll(long __this__nativeId);

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
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

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

    public static native QColumnView fromNativePointer(QNativePointer nativePointer);

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

    protected QColumnView(QPrivateConstructor p) { super(p); } 
}
