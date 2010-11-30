package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsGridLayout class provides a grid layout for managing widgets in Graphics View. The most common way to use QGraphicsGridLayout is to construct an object on the heap with no parent, add widgets and layouts by calling {@link com.trolltech.qt.gui.QGraphicsGridLayout#addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addItem()}, and finally assign the layout to a widget by calling {@link com.trolltech.qt.gui.QGraphicsWidget#setLayout(com.trolltech.qt.gui.QGraphicsLayout) QGraphicsWidget::setLayout()}. QGraphicsGridLayout automatically computes the dimensions of the grid as you add items. <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsWidget textEdit = scene.addWidget(new QTextEdit());
        QGraphicsWidget pushButton = scene.addWidget(new QPushButton());

        QGraphicsLinearLayout layout = new QGraphicsLinearLayout();
        layout.addItem(textEdit);
        layout.addItem(pushButton);

        QGraphicsWidget form = new QGraphicsWidget();
        form.setLayout(layout);
        scene.addItem(form);
</pre> The layout takes ownership of the items. In some cases when the layout item also inherits from {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} (such as {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}) there will be a ambiguity in ownership because the layout item belongs to two ownership hierarchies. See the documentation of {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setOwnedByLayout(boolean) QGraphicsLayoutItem::setOwnedByLayout()} how to handle this. You can access each item in the layout by calling count() and {@link com.trolltech.qt.gui.QGraphicsGridLayout#itemAt(int, int) itemAt()}. Calling removeAt() will remove an item from the layout, without destroying it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout QGraphicsLinearLayout}, and {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsGridLayout extends com.trolltech.qt.gui.QGraphicsLayout
{

    private java.util.Collection<Object> __rcItems = new java.util.ArrayList<Object>();


/**
Constructs a QGraphicsGridLayout instance. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsGridLayout() {
        this((com.trolltech.qt.gui.QGraphicsLayoutItem)null);
    }
/**
Constructs a QGraphicsGridLayout instance. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsGridLayout(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsGridLayout_QGraphicsLayoutItem(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsGridLayout_QGraphicsLayoutItem(long parent);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.addItem(item, row, column, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }

/**
Adds <tt>item</tt> to the grid on <tt>row</tt> and <tt>column</tt>. You can specify an optional <tt>alignment</tt> for <tt>item</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column) {
        addItem(item, row, column, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Adds <tt>item</tt> to the grid on <tt>row</tt> and <tt>column</tt>. You can specify an optional <tt>alignment</tt> for <tt>item</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column, com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item != null) {
            __rcItems.add(item);
        }
        __qt_addItem_QGraphicsLayoutItem_int_int_Alignment(nativeId(), item == null ? 0 : item.nativeId(), row, column, alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addItem_QGraphicsLayoutItem_int_int_Alignment(long __this__nativeId, long item, int row, int column, int alignment);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.addItem(item, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }

/**
Adds <tt>item</tt> to the grid on <tt>row</tt> and <tt>column</tt>. You can specify a <tt>rowSpan</tt> and <tt>columnSpan</tt> and an optional <tt>alignment</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan) {
        addItem(item, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Adds <tt>item</tt> to the grid on <tt>row</tt> and <tt>column</tt>. You can specify a <tt>rowSpan</tt> and <tt>columnSpan</tt> and an optional <tt>alignment</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item != null) {
            __rcItems.add(item);
        }
        __qt_addItem_QGraphicsLayoutItem_int_int_int_int_Alignment(nativeId(), item == null ? 0 : item.nativeId(), row, column, rowSpan, columnSpan, alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addItem_QGraphicsLayoutItem_int_int_int_int_Alignment(long __this__nativeId, long item, int row, int column, int rowSpan, int columnSpan, int alignment);

/**
Returns the alignment for <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment_QGraphicsLayoutItem(nativeId(), item == null ? 0 : item.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment_QGraphicsLayoutItem(long __this__nativeId, long item);

/**
Returns the alignment for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnAlignment(int, com.trolltech.qt.core.Qt.AlignmentFlag[]) setColumnAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment columnAlignment(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_columnAlignment_int(nativeId(), column));
    }
    @QtBlockedSlot
    native int __qt_columnAlignment_int(long __this__nativeId, int column);

/**
Returns the number of columns in the grid layout. This is always one more than the index of the last column that is occupied by a layout item (empty columns are counted except for those at the end).
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
Returns the maximum width for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnMaximumWidth(int, double) setColumnMaximumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double columnMaximumWidth(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnMaximumWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native double __qt_columnMaximumWidth_int(long __this__nativeId, int column);

/**
Returns the minimum width for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnMinimumWidth(int, double) setColumnMinimumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double columnMinimumWidth(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnMinimumWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native double __qt_columnMinimumWidth_int(long __this__nativeId, int column);

/**
Returns the preferred width for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnPreferredWidth(int, double) setColumnPreferredWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double columnPreferredWidth(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnPreferredWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native double __qt_columnPreferredWidth_int(long __this__nativeId, int column);

/**
Returns the column spacing for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnSpacing(int, double) setColumnSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double columnSpacing(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnSpacing_int(nativeId(), column);
    }
    @QtBlockedSlot
    native double __qt_columnSpacing_int(long __this__nativeId, int column);

/**
Returns the stretch factor for <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setColumnStretchFactor(int, int) setColumnStretchFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnStretchFactor(int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnStretchFactor_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnStretchFactor_int(long __this__nativeId, int column);

/**
Returns the default horizontal spacing for the grid layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setHorizontalSpacing(double) setHorizontalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double horizontalSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_horizontalSpacing(long __this__nativeId);

/**
Returns a pointer to the layout item at (<tt>row</tt>, <tt>column</tt>).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsLayoutItemInterface itemAt(int row, int column)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayoutItemInterface __qt_itemAt_int_int(long __this__nativeId, int row, int column);

/**
Returns the alignment of <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowAlignment(int, com.trolltech.qt.core.Qt.AlignmentFlag[]) setRowAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment rowAlignment(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_rowAlignment_int(nativeId(), row));
    }
    @QtBlockedSlot
    native int __qt_rowAlignment_int(long __this__nativeId, int row);

/**
Returns the number of rows in the grid layout. This is always one more than the index of the last row that is occupied by a layout item (empty rows are counted except for those at the end).
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
Returns the maximum height for row, <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowMaximumHeight(int, double) setRowMaximumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rowMaximumHeight(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowMaximumHeight_int(nativeId(), row);
    }
    @QtBlockedSlot
    native double __qt_rowMaximumHeight_int(long __this__nativeId, int row);

/**
Returns the minimum height for row, <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowMinimumHeight(int, double) setRowMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rowMinimumHeight(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowMinimumHeight_int(nativeId(), row);
    }
    @QtBlockedSlot
    native double __qt_rowMinimumHeight_int(long __this__nativeId, int row);

/**
Returns the preferred height for row, <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowPreferredHeight(int, double) setRowPreferredHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rowPreferredHeight(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowPreferredHeight_int(nativeId(), row);
    }
    @QtBlockedSlot
    native double __qt_rowPreferredHeight_int(long __this__nativeId, int row);

/**
Returns the row spacing for <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowSpacing(int, double) setRowSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rowSpacing(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowSpacing_int(nativeId(), row);
    }
    @QtBlockedSlot
    native double __qt_rowSpacing_int(long __this__nativeId, int row);

/**
Returns the stretch factor for <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setRowStretchFactor(int, int) setRowStretchFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowStretchFactor(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowStretchFactor_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_rowStretchFactor_int(long __this__nativeId, int row);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(item, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the alignment for <tt>item</tt> to <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#alignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) alignment()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_QGraphicsLayoutItem_Alignment(nativeId(), item == null ? 0 : item.nativeId(), alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setAlignment_QGraphicsLayoutItem_Alignment(long __this__nativeId, long item, int alignment);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setColumnAlignment(int column, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setColumnAlignment(column, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the alignment for <tt>column</tt> to <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnAlignment(int) columnAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnAlignment(int column, com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnAlignment_int_Alignment(nativeId(), column, alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setColumnAlignment_int_Alignment(long __this__nativeId, int column, int alignment);

/**
Sets the fixed width of <tt>column</tt> to <tt>width</tt>.
*/

    @QtBlockedSlot
    public final void setColumnFixedWidth(int column, double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnFixedWidth_int_double(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnFixedWidth_int_double(long __this__nativeId, int column, double width);

/**
Sets the maximum width of <tt>column</tt> to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnMaximumWidth(int) columnMaximumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnMaximumWidth(int column, double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnMaximumWidth_int_double(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnMaximumWidth_int_double(long __this__nativeId, int column, double width);

/**
Sets the minimum width for <tt>column</tt> to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnMinimumWidth(int) columnMinimumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnMinimumWidth(int column, double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnMinimumWidth_int_double(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnMinimumWidth_int_double(long __this__nativeId, int column, double width);

/**
Sets the preferred width for <tt>column</tt> to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnPreferredWidth(int) columnPreferredWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnPreferredWidth(int column, double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnPreferredWidth_int_double(nativeId(), column, width);
    }
    @QtBlockedSlot
    native void __qt_setColumnPreferredWidth_int_double(long __this__nativeId, int column, double width);

/**
Sets the spacing for <tt>column</tt> to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnSpacing(int) columnSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnSpacing(int column, double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnSpacing_int_double(nativeId(), column, spacing);
    }
    @QtBlockedSlot
    native void __qt_setColumnSpacing_int_double(long __this__nativeId, int column, double spacing);

/**
Sets the stretch factor for <tt>column</tt> to <tt>stretch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#columnStretchFactor(int) columnStretchFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnStretchFactor(int column, int stretch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnStretchFactor_int_int(nativeId(), column, stretch);
    }
    @QtBlockedSlot
    native void __qt_setColumnStretchFactor_int_int(long __this__nativeId, int column, int stretch);

/**
Sets the default horizontal spacing for the grid layout to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#horizontalSpacing() horizontalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setHorizontalSpacing_double(long __this__nativeId, double spacing);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setRowAlignment(int row, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setRowAlignment(row, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the alignment of <tt>row</tt> to <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowAlignment(int) rowAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowAlignment(int row, com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowAlignment_int_Alignment(nativeId(), row, alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setRowAlignment_int_Alignment(long __this__nativeId, int row, int alignment);

/**
Sets the fixed height for row, <tt>row</tt>, to <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setRowFixedHeight(int row, double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowFixedHeight_int_double(nativeId(), row, height);
    }
    @QtBlockedSlot
    native void __qt_setRowFixedHeight_int_double(long __this__nativeId, int row, double height);

/**
Sets the maximum height for row, <tt>row</tt>, to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowMaximumHeight(int) rowMaximumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowMaximumHeight(int row, double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowMaximumHeight_int_double(nativeId(), row, height);
    }
    @QtBlockedSlot
    native void __qt_setRowMaximumHeight_int_double(long __this__nativeId, int row, double height);

/**
Sets the minimum height for row, <tt>row</tt>, to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowMinimumHeight(int) rowMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowMinimumHeight(int row, double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowMinimumHeight_int_double(nativeId(), row, height);
    }
    @QtBlockedSlot
    native void __qt_setRowMinimumHeight_int_double(long __this__nativeId, int row, double height);

/**
Sets the preferred height for row, <tt>row</tt>, to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowPreferredHeight(int) rowPreferredHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowPreferredHeight(int row, double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowPreferredHeight_int_double(nativeId(), row, height);
    }
    @QtBlockedSlot
    native void __qt_setRowPreferredHeight_int_double(long __this__nativeId, int row, double height);

/**
Sets the spacing for <tt>row</tt> to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowSpacing(int) rowSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowSpacing(int row, double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowSpacing_int_double(nativeId(), row, spacing);
    }
    @QtBlockedSlot
    native void __qt_setRowSpacing_int_double(long __this__nativeId, int row, double spacing);

/**
Sets the stretch factor for <tt>row</tt> to <tt>stretch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowStretchFactor(int) rowStretchFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowStretchFactor(int row, int stretch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowStretchFactor_int_int(nativeId(), row, stretch);
    }
    @QtBlockedSlot
    native void __qt_setRowStretchFactor_int_int(long __this__nativeId, int row, int stretch);

/**
Sets the grid layout's default spacing, both vertical and horizontal, to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#rowSpacing(int) rowSpacing()}, and {@link com.trolltech.qt.gui.QGraphicsGridLayout#columnSpacing(int) columnSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setSpacing_double(long __this__nativeId, double spacing);

/**
Sets the default vertical spacing for the grid layout to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#verticalSpacing() verticalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setVerticalSpacing_double(long __this__nativeId, double spacing);

/**
Returns the default vertical spacing for the grid layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout#setVerticalSpacing(double) setVerticalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double verticalSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_verticalSpacing(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int count()    {
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
    public void invalidate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_invalidate(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QGraphicsLayoutItemInterface itemAt(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void removeAt(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_removeAt_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRectF(long __this__nativeId, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF sizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint_SizeHint_QSizeF(nativeId(), which.value(), constraint == null ? 0 : constraint.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_sizeHint_SizeHint_QSizeF(long __this__nativeId, int which, long constraint);

/**
@exclude
*/

    public static native QGraphicsGridLayout fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsGridLayout(QPrivateConstructor p) { super(p); } 
}
