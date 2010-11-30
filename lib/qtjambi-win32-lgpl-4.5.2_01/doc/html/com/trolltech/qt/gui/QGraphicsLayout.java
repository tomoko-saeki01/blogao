package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsLayout class provides the base class for all layouts in Graphics View. QGraphicsLayout is an abstract class that defines a virtual API for arranging {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} children and other {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} objects for a {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}. {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} assigns responsibility to a QGraphicsLayout through {@link com.trolltech.qt.gui.QGraphicsWidget#setLayout(com.trolltech.qt.gui.QGraphicsLayout) QGraphicsWidget::setLayout()}. As the widget is resized, the layout will automatically arrange the widget's children. QGraphicsLayout inherits {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, so, it can be managed by any layout, including its own subclasses.<a name="writing-a-custom-layout"><h2>Writing a Custom Layout</h2> You can use QGraphicsLayout as a base to write your own custom layout (e.g., a flowlayout), but it is more common to use one of its subclasses instead - {@link com.trolltech.qt.gui.QGraphicsLinearLayout QGraphicsLinearLayout} or {@link com.trolltech.qt.gui.QGraphicsGridLayout QGraphicsGridLayout}. When creating a custom layout, the following functions must be reimplemented as a bare minimum: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Function</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) QGraphicsLayoutItem::setGeometry()}</td><td> Notifies you when the geometry of the layout is set. You can store the geometry in your own layout class in a reimplementation of this function.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) QGraphicsLayoutItem::sizeHint()}</td><td> Returns the layout's size hints.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QGraphicsLayout#count() QGraphicsLayout::count()}</td><td> Returns the number of items in your layout.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) QGraphicsLayout::itemAt()}</td><td> Returns a pointer to an item in your layout.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QGraphicsLayout#removeAt(int) QGraphicsLayout::removeAt()}</td><td> Removes an item from your layout without destroying it.</td></tr></table> For more details on how to implement each function, refer to the individual function documentation. <p>Each layout defines its own API for arranging widgets and layout items. For example, with a grid layout, you require a row and a column index with optional row and column spans, alignment, spacing, and more. A linear layout, however, requires a single row or column index to position its items. For a grid layout, the order of insertion does not affect the layout in any way, but for a linear layout, the order is essential. When writing your own layout subclass, you are free to choose the API that best suits your layout.<a name="activating-the-layout"><h2>Activating the Layout</h2> When the layout's geometry changes, QGraphicsLayout immediately rearranges all of its managed items by calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()} on each item. This rearrangement is called activating the layout. <p>QGraphicsLayout updates its own geometry to match the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#contentsRect() contentsRect()} of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} it is managing. Thus, it will automatically rearrange all its items when the widget is resized. QGraphicsLayout caches the sizes of all its managed items to avoid calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()} too often. <p><b>Note:</b> A QGraphicsLayout will have the same geometry as the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#contentsRect() contentsRect()} of the widget (not the layout) it is assigned to.<a name="activating-the-layout-implicitly"><h3>Activating the Layout Implicitly</h3> The layout can be activated implicitly using one of two ways: by calling {@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()} or by calling {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. Calling {@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()} activates the layout immediately. In contrast, calling {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()} is delayed, as it posts a {@link com.trolltech.qt.core.QEvent.Type LayoutRequest } event to the managed widget. Due to event compression, the {@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()} will only be called once after control has returned to the event loop. This is referred to as invalidating the layout. Invalidating the layout also invalidates any cached information. Also, the {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()} function is a virtual function. So, you can invalidate your own cache in a subclass of QGraphicsLayout by reimplementing this function.<a name="event-handling"><h2>Event Handling</h2> QGraphicsLayout listens to events for the widget it manages through the virtual {@link com.trolltech.qt.gui.QGraphicsLayout#widgetEvent(com.trolltech.qt.core.QEvent) widgetEvent()} event handler. When the layout is assigned to a widget, all events delivered to the widget are first processed by {@link com.trolltech.qt.gui.QGraphicsLayout#widgetEvent(com.trolltech.qt.core.QEvent) widgetEvent()}. This allows the layout to be aware of any relevant state changes on the widget such as visibility changes or layout direction changes.<a name="margin-handling"><h2>Margin Handling</h2> The margins of a QGraphicsLayout can be modified by reimplementing {@link com.trolltech.qt.gui.QGraphicsLayout#setContentsMargins(double, double, double, double) setContentsMargins()} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()}.
*/
@QtJambiGeneratedClass
public abstract class QGraphicsLayout extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QGraphicsLayoutItemInterface
{

    private Object __rcParentLayoutItem = null;

    private Object __rcItem = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QGraphicsLayout {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int count() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_count(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QGraphicsLayoutItemInterface itemAt(int i) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_itemAt_int(nativeId(), i);
        }

        @Override
        @QtBlockedSlot
        public void removeAt(int index) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_removeAt_int(nativeId(), index);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSizeF sizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_sizeHint_SizeHint_QSizeF(nativeId(), which.value(), constraint == null ? 0 : constraint.nativeId());
        }
    }



/**
Contructs a QGraphicsLayout object. <p><tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s constructor and the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s isLayout argument is set to true.
*/

    public QGraphicsLayout() {
        this((com.trolltech.qt.gui.QGraphicsLayoutItem)null);
    }
/**
Contructs a QGraphicsLayout object. <p><tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s constructor and the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s isLayout argument is set to true.
*/

    public QGraphicsLayout(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsLayout_QGraphicsLayoutItem(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsLayout_QGraphicsLayoutItem(long parent);

/**
Activates the layout, causing all items in the layout to be immediately rearranged. This function is based on calling {@link com.trolltech.qt.gui.QGraphicsLayout#count() count()} and {@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) itemAt()}, and then calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()} on all items sequentially. When activated, the layout will adjust its geometry to its parent's {@link com.trolltech.qt.gui.QGraphicsLayoutItem#contentsRect() contentsRect()}. The parent will then invalidate any layout of its own. <p>If called in sequence or recursively, e.g., by one of the arranged items in response to being resized, this function will do nothing. <p>Note that the layout is free to use geometry caching to optimize this process. To forcefully invalidate any such cache, you can call {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()} before calling {@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void activate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_activate(long __this__nativeId);

/**
Returns the contents rect in local coordinates. <p>The contents rect defines the subrectangle used by an associated layout when arranging subitems. This function is a convenience function that adjusts the item's {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()} by its contents margins. Note that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()} is a virtual function that you can reimplement to return the item's contents margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF contentsRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentsRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_contentsRect(long __this__nativeId);

/**
Returns the effective size hint for this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. <p><tt>which</tt> is the size hint in question. <tt>constraint</tt> is an optional argument that defines a special constrain when calculating the effective size hint. By default, <tt>constraint</tt> is {@link com.trolltech.qt.core.QSizeF QSizeF}(-1, -1), which means there is no constraint to the size hint. <p>If you want to specify the widget's size hint for a given width or height, you can provide the fixed dimension in <tt>constraint</tt>. This is useful for widgets that can grow only either vertically or horizontally, and need to set either their width or their height to a special value. <p>For example, a text paragraph item fit into a column width of 200 may grow vertically. You can pass {@link com.trolltech.qt.core.QSizeF QSizeF}(200, -1) as a constraint to get a suitable minimum, preferred and maximum height). <p>You can adjust the effective size hint by reimplementing {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} in a {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} subclass, or by calling one of the following functions: {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, setPreferredSize, or {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()} (or a combination of both). <p>This function caches each of the size hints and guarantees that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} will be called only once for each value of <tt>which</tt> - unless <tt>constraint</tt> is not specified and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#updateGeometry() updateGeometry()} has been called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effectiveSizeHint_SizeHint_QSizeF(nativeId(), which.value(), constraint == null ? 0 : constraint.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_effectiveSizeHint_SizeHint_QSizeF(long __this__nativeId, int which, long constraint);

/**
Returns the item's geometry (e. ., position and size) as a {@link com.trolltech.qt.core.QRectF QRectF}. This function is equivalent to {@link com.trolltech.qt.core.QRectF QRectF}(pos(), size()). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF geometry()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_geometry(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} that this layout item represents. For {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} it will return itself. For custom items it can return an aggregated value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface) setGraphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface graphicsItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_graphicsItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_graphicsItem(long __this__nativeId);

/**
Returns true if the layout is currently being activated; otherwise, returns false. If the layout is being activated, this means that it is currently in the process of rearranging its items (i.e., the {@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()} function has been called, and has not yet returned). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isActivated()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActivated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActivated(long __this__nativeId);

/**
Returns true if this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is a layout (e.g., is inherited by an object that arranges other {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} objects); otherwise returns false. <p><DT><b>See also:</b><br><DD>QGraphicsLayout. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isLayout(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isLayout(long __this__nativeId);

/**
Returns the maximum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumHeight(double) setMaximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double maximumHeight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumHeight(long __this__nativeId);

/**
Returns the maximum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF maximumSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_maximumSize(long __this__nativeId);

/**
Returns the maximum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumWidth(double) setMaximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double maximumWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumWidth(long __this__nativeId);

/**
Returns the minimum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minimumHeight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimumHeight(long __this__nativeId);

/**
Returns the minimum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF minimumSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_minimumSize(long __this__nativeId);

/**
Returns the minimum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minimumWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimumWidth(long __this__nativeId);

/**
Returns whether a layout should delete this item in its destructor. If its true, then the layout will delete it. If its false, then it is assumed that another object has the ownership of it, and the layout won't delete this item. <p>If the item inherits both {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} (such as {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} does) the item is really part of two ownership hierarchies. This property informs what the layout should do with its child items when it is destructed. In the case of {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}, it is preferred that when the layout is deleted it won't delete its children (since they are also part of the graphics item hierarchy). <p>By default this value is initialized to false in {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, but it is overridden by QGraphicsLayout to return true. This is because QGraphicsLayout is not normally part of the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} hierarchy, so the parent layout should delete it. Subclasses might override this default behaviour by calling setOwnedByLayout(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setOwnedByLayout(boolean) setOwnedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean ownedByLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownedByLayout(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ownedByLayout(long __this__nativeId);

/**
Returns the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, or 0 if there is no parent, or if the parent does not inherit from {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} ({@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is often used through multiple inheritance with {@link com.trolltech.qt.core.QObject QObject}-derived classes). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) setParentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsLayoutItemInterface parentLayoutItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentLayoutItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayoutItemInterface __qt_parentLayoutItem(long __this__nativeId);

/**
Returns the preferred height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredHeight(double) setPreferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double preferredHeight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_preferredHeight(long __this__nativeId);

/**
Returns the preferred size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF preferredSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_preferredSize(long __this__nativeId);

/**
Returns the preferred width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredWidth(double) setPreferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double preferredWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_preferredWidth(long __this__nativeId);

/**
Sets the contents margins to <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt>. The default contents margins for toplevel layouts are style dependent (by querying the pixelMetric for {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_LayoutLeftMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_LayoutTopMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_LayoutRightMargin } and {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_LayoutBottomMargin }). <p>For sublayouts the default margins are 0. <p>Changing the contents margins automatically invalidates the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContentsMargins(double left, double top, double right, double bottom)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentsMargins_double_double_double_double(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setContentsMargins_double_double_double_double(long __this__nativeId, double left, double top, double right, double bottom);

/**
If the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} represents a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and it wants to take advantage of the automatic reparenting capabilities of QGraphicsLayout it should set this value. Note that if you delete <tt>item</tt> and not delete the layout item, you are responsible of calling setGraphicsItem(0) in order to avoid having a dangling pointer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#graphicsItem() graphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItem = item;
        }
        {
            __rcItem = item;
        }
        __qt_setGraphicsItem_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGraphicsItem_QGraphicsItem(long __this__nativeId, long item);

/**
Sets the maximum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumHeight() maximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumHeight(double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setMaximumHeight_double(long __this__nativeId, double height);

/**
Sets the maximum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size larger than <tt>size</tt>. In order to unset the maximum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumSize(com.trolltech.qt.core.QSizeF size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setMaximumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumSize(double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the maximum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumWidth() maximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setMaximumWidth_double(long __this__nativeId, double width);

/**
Sets the minimum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumHeight() minimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumHeight(double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setMinimumHeight_double(long __this__nativeId, double height);

/**
Sets the minimum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size smaller than <tt>size</tt>. In order to unset the minimum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumSize(com.trolltech.qt.core.QSizeF size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setMinimumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumSize(double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the minimum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumWidth() minimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setMinimumWidth_double(long __this__nativeId, double width);

/**
Sets whether a layout should delete this item in its destructor or not. <tt>ownership</tt> must be true to in order for the layout to delete it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#ownedByLayout() ownedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOwnedByLayout(boolean ownedByLayout)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOwnedByLayout_boolean(nativeId(), ownedByLayout);
    }
    @QtBlockedSlot
    native void __qt_setOwnedByLayout_boolean(long __this__nativeId, boolean ownedByLayout);

/**
Sets the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#parentLayoutItem() parentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcParentLayoutItem = parent;
        }
        {
            __rcParentLayoutItem = parent;
        }
        __qt_setParentLayoutItem_QGraphicsLayoutItem(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setParentLayoutItem_QGraphicsLayoutItem(long __this__nativeId, long parent);

/**
Sets the preferred height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredHeight(double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setPreferredHeight_double(long __this__nativeId, double height);

/**
Sets the preferred size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize } and provides the default value for {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. In order to unset the preferred size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredSize(com.trolltech.qt.core.QSizeF size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPreferredSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setPreferredSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredSize(double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setPreferredSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the preferred width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setPreferredWidth_double(long __this__nativeId, double width);

/**
This is an overloaded member function, provided for convenience. <p>This function is equivalent to calling setSizePolicy({@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}(<tt>hPolicy</tt>, <tt>vPolicy</tt>, <tt>controlType</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy hPolicy, com.trolltech.qt.gui.QSizePolicy.Policy vPolicy, com.trolltech.qt.gui.QSizePolicy.ControlType controlType)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_Policy_Policy_ControlType(nativeId(), hPolicy.value(), vPolicy.value(), controlType.value());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_Policy_Policy_ControlType(long __this__nativeId, int hPolicy, int vPolicy, int controlType);

/**
Sets the size policy to <tt>policy</tt>. The size policy describes how the item should grow horizontally and vertically when arranged in a layout. <p>{@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s default size policy is ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }), but it is common for subclasses to change the default. For example, {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} defaults to ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy policy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_QSizePolicy(nativeId(), policy == null ? 0 : policy.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_QSizePolicy(long __this__nativeId, long policy);

/**
Returns the current size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy, com.trolltech.qt.gui.QSizePolicy.Policy) setSizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy sizePolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizePolicy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSizePolicy __qt_sizePolicy(long __this__nativeId);

/**
This pure virtual function must be reimplemented in a subclass of QGraphicsLayout to return the number of items in the layout. <p>The subclass is free to decide how to store the items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) itemAt()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#removeAt(int) removeAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int count();
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

    @QtBlockedSlot
    private void getContentsMargins(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom);

/**
Clears any cached geometry and size hint information in the layout, and posts a {@link com.trolltech.qt.core.QEvent.Type LayoutRequest } event to the managed parent {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#activate() activate()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()}. <br></DD></DT>
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
This pure virtual function must be reimplemented in a subclass of QGraphicsLayout to return a pointer to the item at index <tt>i</tt>. The reimplementation can assume that <tt>i</tt> is valid (i.e., it respects the value of {@link com.trolltech.qt.gui.QGraphicsLayout#count() count()}). <p>The subclass is free to decide how to store the items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#count() count()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#removeAt(int) removeAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QGraphicsLayoutItemInterface itemAt(int i);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int i);

/**
This pure virtual function must be reimplemented in a subclass of QGraphicsLayout to remove the item at <tt>index</tt>. The reimplementation can assume that <tt>index</tt> is valid (i.e., it respects the value of {@link com.trolltech.qt.gui.QGraphicsLayout#count() count()}). <p>If the layout is to be reused between applications, we recommend that the layout deletes the item, but the graphics view framework does not depend on this. <p>The subclass is free to decide how to store the items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout#itemAt(int) itemAt()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#count() count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void removeAt(int index);
    @QtBlockedSlot
    native void __qt_removeAt_int(long __this__nativeId, int index);

/**
This pure virtual function sets the geometry of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>rect</tt>, which is in parent coordinates (e.g., the top-left corner of <tt>rect</tt> is equivalent to the item's position in parent coordinates). <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to enable your item to receive geometry updates. <p>If <tt>rect</tt> is outside of the bounds of minimumSize and maximumSize, it will be adjusted to its closest size so that it is within the legal bounds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
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
This pure virtual function returns the size hint for <tt>which</tt> of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, using the width or height of <tt>constraint</tt> to constrain the output. <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to provide the necessary size hints for your items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSizeF sizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint);
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_sizeHint_SizeHint_QSizeF(long __this__nativeId, int which, long constraint);

/**
This virtual function discards any cached size hint information. You should always call this function if you change the return value of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} function. Subclasses must always call the base implementation when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void updateGeometry()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometry(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateGeometry(long __this__nativeId);

/**
This virtual event handler receives all events for the managed widget. QGraphicsLayout uses this event handler to listen for layout related events such as geometry changes, layout changes or layout direction changes. <p><tt>e</tt> is a pointer to the event. <p>You can reimplement this event handler to track similar events for your own custom layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) QGraphicsWidget::event()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) QGraphicsItem::sceneEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void widgetEvent(com.trolltech.qt.core.QEvent e)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_widgetEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_widgetEvent_QEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QGraphicsLayout fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsLayout(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QGraphicsLayoutItem(long ptr);

/**
This virtual function provides the <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt> contents margins for this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. The default implementation assumes all contents margins are 0. The parameters point to values stored in qreals. If any of the pointers is 0, that value will not be updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setContentsMargins(double, double, double, double) QGraphicsWidget::setContentsMargins()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final QMarginsF getContentsMargins() {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Double);

        getContentsMargins(left, top, right, bottom);
        return new QMarginsF(left.doubleValue(), top.doubleValue(), right.doubleValue(), bottom.doubleValue());
    }

}
