package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsLinearLayout class provides a horizontal or vertical layout for managing widgets in Graphics View. The default orientation for a linear layout is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. You can choose a vertical orientation either by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}, or by passing {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } to QGraphicsLinearLayout's constructor. <p>The most common way to use QGraphicsLinearLayout is to construct an object on the heap with no parent, add widgets and layouts by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) addItem()}, and finally assign the layout to a widget by calling {@link com.trolltech.qt.gui.QGraphicsWidget#setLayout(com.trolltech.qt.gui.QGraphicsLayout) QGraphicsWidget::setLayout()}. <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsWidget textEdit = scene.addWidget(new QTextEdit());
        QGraphicsWidget pushButton = scene.addWidget(new QPushButton());

        QGraphicsLinearLayout layout = new QGraphicsLinearLayout();
        layout.addItem(textEdit);
        layout.addItem(pushButton);

        QGraphicsWidget form = new QGraphicsWidget();
        form.setLayout(layout);
        scene.addItem(form);
</pre> You can add widgets, layouts, stretches ({@link com.trolltech.qt.gui.QGraphicsLinearLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#insertStretch(int) insertStretch()} or {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}), and spacings ({@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}) to a linear layout. The layout takes ownership of the items. In some cases when the layout item also inherits from {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} (such as {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}) there will be a ambiguity in ownership because the layout item belongs to two ownership hierarchies. See the documentation of {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setOwnedByLayout(boolean) QGraphicsLayoutItem::setOwnedByLayout()} how to handle this. You can access each item in the layout by calling {@link com.trolltech.qt.gui.QGraphicsLayout#count() count()} and {@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) itemAt()}. Calling removeAt() or {@link com.trolltech.qt.gui.QGraphicsLinearLayout#removeItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) removeItem()} will remove an item from the layout, without destroying it.<a name="size-hints-and-size-policies-in-qgraphicslinearlayout"><h2>Size Hints and Size Policies in QGraphicsLinearLayout</h2> QGraphicsLinearLayout respects each item's size hints and size policies, and when the layout contains more space than the items can fill, each item is arranged according to the layout's alignment for that item. You can set an alignment for each item by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, and check the alignment for any item by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#alignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) alignment()}. By default, items are centered both vertically and horizontally.<a name="spacing-within-qgraphicslinearlayout"><h2>Spacing within QGraphicsLinearLayout</h2> Between the items, the layout distributes some space. The actual amount of space depends on the managed widget's current style, but the common spacing is 4. You can also set your own spacing by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setSpacing(double) setSpacing()}, and get the current spacing value by calling {@link com.trolltech.qt.gui.QGraphicsLinearLayout#spacing() spacing()}. If you want to configure individual spacing for your items, you can call {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}.<a name="stretch-factor-in-qgraphicslinearlayout"><h2>Stretch Factor in QGraphicsLinearLayout</h2> You can assign a stretch factor to each item to control how much space it will get compared to the other items. By default, two identical widgets arranged in a linear layout will have the same size, but if the first widget has a stretch factor of 1 and the second widget has a stretch factor of 2, the first widget will get 1/3 of the available space, and the second will get 2/3. <p>QGraphicsLinearLayout calculates the distribution of sizes by adding up the stretch factors of all items, and then dividing the available space accordingly. The default stretch factor is 0 for all items; a factor of 0 means the item does not have any defined stretch factor; effectively this is the same as setting the stretch factor to 1. The stretch factor only applies to the available space in the lengthwise direction of the layout (following its orientation). If you want to control both the item's horizontal and vertical stretch, you can use {@link com.trolltech.qt.gui.QGraphicsGridLayout QGraphicsGridLayout} instead.<a name="qgraphicslinearlayout-compared-to-other-layouts"><h2>QGraphicsLinearLayout Compared to Other Layouts</h2> QGraphicsLinearLayout is very similar to {@link com.trolltech.qt.gui.QVBoxLayout QVBoxLayout} and {@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout}, but in contrast to these classes, it is used to manage {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} instead of {@link com.trolltech.qt.gui.QWidget QWidget} and {@link com.trolltech.qt.gui.QLayout QLayout}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsGridLayout QGraphicsGridLayout}, and {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsLinearLayout extends com.trolltech.qt.gui.QGraphicsLayout
{

    private java.util.Collection<Object> __rcItems = new java.util.ArrayList<Object>();


/**
Constructs a QGraphicsLinearLayout instance using {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } orientation. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsLinearLayout() {
        this((com.trolltech.qt.gui.QGraphicsLayoutItem)null);
    }
/**
Constructs a QGraphicsLinearLayout instance using {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } orientation. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsLinearLayout(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsLinearLayout_QGraphicsLayoutItem(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsLinearLayout_QGraphicsLayoutItem(long parent);


/**
Constructs a QGraphicsLinearLayout instance. You can pass the <tt>orientation</tt> for the layout, either horizontal or vertical, and <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsLinearLayout(com.trolltech.qt.core.Qt.Orientation orientation) {
        this(orientation, (com.trolltech.qt.gui.QGraphicsLayoutItem)null);
    }
/**
Constructs a QGraphicsLinearLayout instance. You can pass the <tt>orientation</tt> for the layout, either horizontal or vertical, and <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}'s constructor.
*/

    public QGraphicsLinearLayout(com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsLinearLayout_Orientation_QGraphicsLayoutItem(orientation.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsLinearLayout_Orientation_QGraphicsLayoutItem(int orientation, long parent);

/**
This convenience function is equivalent to calling insertItem(-1, <tt>item</tt>).
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item != null) {
            __rcItems.add(item);
        }
        __qt_addItem_QGraphicsLayoutItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addItem_QGraphicsLayoutItem(long __this__nativeId, long item);


/**
This convenience function is equivalent to calling insertStretch(-1, <tt>stretch</tt>).
*/

    @QtBlockedSlot
    public final void addStretch() {
        addStretch((int)1);
    }
/**
This convenience function is equivalent to calling insertStretch(-1, <tt>stretch</tt>).
*/

    @QtBlockedSlot
    public final void addStretch(int stretch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addStretch_int(nativeId(), stretch);
    }
    @QtBlockedSlot
    native void __qt_addStretch_int(long __this__nativeId, int stretch);

/**
Returns the alignment for <tt>item</tt>. The default alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter }. <p>The alignment decides how the item is positioned within its assigned space in the case where there's more space available in the layout than the widgets can occupy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
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
Inserts <tt>item</tt> into the layout at <tt>index</tt>, or before any item that is currently at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) addItem()}, {@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) itemAt()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#insertStretch(int) insertStretch()}, and {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertItem(int index, com.trolltech.qt.gui.QGraphicsLayoutItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item != null) {
            __rcItems.add(item);
        }
        __qt_insertItem_int_QGraphicsLayoutItem(nativeId(), index, item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertItem_int_QGraphicsLayoutItem(long __this__nativeId, int index, long item);


/**
Inserts a stretch of <tt>stretch</tt> at <tt>index</tt>, or before any item that is currently at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}, and {@link com.trolltech.qt.gui.QGraphicsLinearLayout#insertItem(int, com.trolltech.qt.gui.QGraphicsLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertStretch(int index) {
        insertStretch(index, (int)1);
    }
/**
Inserts a stretch of <tt>stretch</tt> at <tt>index</tt>, or before any item that is currently at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}, and {@link com.trolltech.qt.gui.QGraphicsLinearLayout#insertItem(int, com.trolltech.qt.gui.QGraphicsLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertStretch(int index, int stretch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertStretch_int_int(nativeId(), index, stretch);
    }
    @QtBlockedSlot
    native void __qt_insertStretch_int_int(long __this__nativeId, int index, int stretch);

/**
Returns the spacing after item at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double itemSpacing(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemSpacing_int(nativeId(), index);
    }
    @QtBlockedSlot
    native double __qt_itemSpacing_int(long __this__nativeId, int index);

/**
This property holds the orientation of the linear layout. This property toggles the layout orientation. Changing the layout orientation will automatically invalidate the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Removes <tt>item</tt> from the layout without destroying it. Ownership of <tt>item</tt> is transferred to the caller. <p><DT><b>See also:</b><br><DD>removeAt(), and {@link com.trolltech.qt.gui.QGraphicsLinearLayout#insertItem(int, com.trolltech.qt.gui.QGraphicsLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item != null) {
            while (__rcItems.remove(item)) ;
        }
        __qt_removeItem_QGraphicsLayoutItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeItem_QGraphicsLayoutItem(long __this__nativeId, long item);


/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(item, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the alignment of <tt>item</tt> to <tt>alignment</tt>. If <tt>item</tt>'s alignment changes, the layout is automatically invalidated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#alignment(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) alignment()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
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
Sets the spacing after item at <tt>index</tt> to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#itemSpacing(int) itemSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemSpacing(int index, double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemSpacing_int_double(nativeId(), index, spacing);
    }
    @QtBlockedSlot
    native void __qt_setItemSpacing_int_double(long __this__nativeId, int index, double spacing);

/**
This property holds the orientation of the linear layout. This property toggles the layout orientation. Changing the layout orientation will automatically invalidate the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This property holds the layout's default spacing. This property adjusts the layout's default spacing. The spacing applies to the vertical and horizontal distance between items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}, and {@link com.trolltech.qt.gui.QGraphicsGridLayout#setSpacing(double) QGraphicsGridLayout::setSpacing()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="spacing")
    @QtBlockedSlot
    public final void setSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setSpacing_double(long __this__nativeId, double spacing);

/**
Sets the stretch factor for <tt>item</tt> to <tt>stretch</tt>. If an item's stretch factor changes, this function will invalidate the layout. <p>Setting <tt>stretch</tt> to 0 removes the stretch factor from the item, and is effectively equivalent to setting <tt>stretch</tt> to 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#stretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) stretchFactor()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item, int stretch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStretchFactor_QGraphicsLayoutItem_int(nativeId(), item == null ? 0 : item.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setStretchFactor_QGraphicsLayoutItem_int(long __this__nativeId, long item, int stretch);

/**
This property holds the layout's default spacing. This property adjusts the layout's default spacing. The spacing applies to the vertical and horizontal distance between items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#setItemSpacing(int, double) setItemSpacing()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}, and {@link com.trolltech.qt.gui.QGraphicsGridLayout#setSpacing(double) QGraphicsGridLayout::setSpacing()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="spacing")
    @QtBlockedSlot
    public final double spacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_spacing(long __this__nativeId);

/**
Returns the stretch factor for <tt>item</tt>. The default stretch factor is 0, meaning that the item has no assigned stretch factor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLinearLayout#setStretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface, int) setStretchFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int stretchFactor(com.trolltech.qt.gui.QGraphicsLayoutItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stretchFactor_QGraphicsLayoutItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native int __qt_stretchFactor_QGraphicsLayoutItem(long __this__nativeId, long item);

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

    public static native QGraphicsLinearLayout fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsLinearLayout(QPrivateConstructor p) { super(p); } 
}
