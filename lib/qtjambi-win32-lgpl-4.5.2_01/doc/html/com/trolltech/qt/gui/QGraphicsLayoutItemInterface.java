package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} class can be inherited to allow your custom items to be managed by layouts. {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is an abstract class that defines a set of virtual functions describing sizes, size policies, and size hints for any object arranged by {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. The API contains functions relevant for both the item itself and for the user of the item as most of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s functions are also part of the subclass' public API. <p>In most cases, existing layout-aware classes such as {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} already provide the functionality you require. However, subclassing these classes will enable you to create both graphical elements that work well with layouts ({@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}) or custom layouts ({@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}).<a name="subclassing-qgraphicslayoutitem"><h2>Subclassing QGraphicsLayoutItem</h2> If you create a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} and reimplement its virtual functions, you will enable the layout to resize and position your item along with other QGraphicsLayoutItems including {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <p>You can start by reimplementing important functions: the protected {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} function, as well as the public {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()} function. If you want your items to be aware of immediate geometry changes, you can also reimplement {@link com.trolltech.qt.gui.QGraphicsLayoutItem#updateGeometry() updateGeometry()}. <p>The geometry, size hint, and size policy affect the item's size and position. Calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()} will always resize and reposition the item immediately. Normally, this function is called by {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} after the layout has been activated, but it can also be called by the item's user at any time. <p>The {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} function returns the item' minimum, preferred and maximum size hints. You can override these properties by calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()} or {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}. You can also use functions such as {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()} or {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumHeight(double) setMaximumHeight()} to set only the width or height component if desired. <p>The {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} function, on the other hand, returns a size hint for any given {@link com.trolltech.qt.core.Qt.SizeHint Qt::SizeHint }, and guarantees that the returned size is bound to the minimum and maximum sizes and size hints. You can set the item's vertical and horizontal size policy by calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy, com.trolltech.qt.gui.QSizePolicy.Policy) setSizePolicy()}. The sizePolicy property is used by the layout system to describe how this item prefers to grow or shrink.<a name="nesting-qgraphicslayoutitems"><h2>Nesting QGraphicsLayoutItems</h2> QGraphicsLayoutItems can be nested within other QGraphicsLayoutItems, similar to layouts that can contain sublayouts. This is done either by passing a {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} pointer to {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s protected constructor, or by calling {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) setParentLayoutItem()}. The {@link com.trolltech.qt.gui.QGraphicsLayoutItem#parentLayoutItem() parentLayoutItem()} function returns a pointer to the item's layoutItem parent. If the item's parent is 0 or if the the parent does not inherit from {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#parentLayoutItem() parentLayoutItem()} function then returns 0. {@link com.trolltech.qt.gui.QGraphicsLayoutItem#isLayout() isLayout()} returns true if the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} subclass is itself a layout, or false otherwise. <p>Qt uses {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to provide layout functionality in the {@link <a href="../graphicsview.html">The Graphics View Framework</a>}, but in the future its use may spread throughout Qt itself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}, {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout QGraphicsLinearLayout}, and {@link com.trolltech.qt.gui.QGraphicsGridLayout QGraphicsGridLayout}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QGraphicsLayoutItemInterface extends QtJambiInterface
{

/**
Returns the contents rect in local coordinates. <p>The contents rect defines the subrectangle used by an associated layout when arranging subitems. This function is a convenience function that adjusts the item's {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()} by its contents margins. Note that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()} is a virtual function that you can reimplement to return the item's contents margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF contentsRect();

/**
Returns the effective size hint for this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. <p><tt>which</tt> is the size hint in question. <tt>constraint</tt> is an optional argument that defines a special constrain when calculating the effective size hint. By default, <tt>constraint</tt> is {@link com.trolltech.qt.core.QSizeF QSizeF}(-1, -1), which means there is no constraint to the size hint. <p>If you want to specify the widget's size hint for a given width or height, you can provide the fixed dimension in <tt>constraint</tt>. This is useful for widgets that can grow only either vertically or horizontally, and need to set either their width or their height to a special value. <p>For example, a text paragraph item fit into a column width of 200 may grow vertically. You can pass {@link com.trolltech.qt.core.QSizeF QSizeF}(200, -1) as a constraint to get a suitable minimum, preferred and maximum height). <p>You can adjust the effective size hint by reimplementing {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} in a {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} subclass, or by calling one of the following functions: {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, setPreferredSize, or {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()} (or a combination of both). <p>This function caches each of the size hints and guarantees that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} will be called only once for each value of <tt>which</tt> - unless <tt>constraint</tt> is not specified and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#updateGeometry() updateGeometry()} has been called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint);

/**
Returns the item's geometry (e. ., position and size) as a {@link com.trolltech.qt.core.QRectF QRectF}. This function is equivalent to {@link com.trolltech.qt.core.QRectF QRectF}(pos(), size()). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF geometry();

/**
Returns the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} that this layout item represents. For {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} it will return itself. For custom items it can return an aggregated value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface) setGraphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QGraphicsItemInterface graphicsItem();

/**
Returns true if this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is a layout (e.g., is inherited by an object that arranges other {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} objects); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean isLayout();

/**
Returns the maximum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumHeight(double) setMaximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double maximumHeight();

/**
Returns the maximum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF maximumSize();

/**
Returns the maximum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumWidth(double) setMaximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double maximumWidth();

/**
Returns the minimum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double minimumHeight();

/**
Returns the minimum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF minimumSize();

/**
Returns the minimum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double minimumWidth();

/**
Returns whether a layout should delete this item in its destructor. If its true, then the layout will delete it. If its false, then it is assumed that another object has the ownership of it, and the layout won't delete this item. <p>If the item inherits both {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} (such as {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} does) the item is really part of two ownership hierarchies. This property informs what the layout should do with its child items when it is destructed. In the case of {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}, it is preferred that when the layout is deleted it won't delete its children (since they are also part of the graphics item hierarchy). <p>By default this value is initialized to false in {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, but it is overridden by {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} to return true. This is because {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} is not normally part of the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} hierarchy, so the parent layout should delete it. Subclasses might override this default behaviour by calling setOwnedByLayout(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setOwnedByLayout(boolean) setOwnedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean ownedByLayout();

/**
Returns the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, or 0 if there is no parent, or if the parent does not inherit from {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} ({@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is often used through multiple inheritance with {@link com.trolltech.qt.core.QObject QObject}-derived classes). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) setParentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QGraphicsLayoutItemInterface parentLayoutItem();

/**
Returns the preferred height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredHeight(double) setPreferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double preferredHeight();

/**
Returns the preferred size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF preferredSize();

/**
Returns the preferred width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredWidth(double) setPreferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public double preferredWidth();

/**
If the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} represents a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and it wants to take advantage of the automatic reparenting capabilities of {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} it should set this value. Note that if you delete <tt>item</tt> and not delete the layout item, you are responsible of calling setGraphicsItem(0) in order to avoid having a dangling pointer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#graphicsItem() graphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface item);

/**
Sets the maximum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumHeight() maximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMaximumHeight(double height);

/**
Sets the maximum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size larger than <tt>size</tt>. In order to unset the maximum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMaximumSize(com.trolltech.qt.core.QSizeF size);

/**
This convenience function is equivalent to calling setMaximumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMaximumSize(double w, double h);

/**
Sets the maximum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumWidth() maximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMaximumWidth(double width);

/**
Sets the minimum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumHeight() minimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMinimumHeight(double height);

/**
Sets the minimum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size smaller than <tt>size</tt>. In order to unset the minimum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMinimumSize(com.trolltech.qt.core.QSizeF size);

/**
This convenience function is equivalent to calling setMinimumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMinimumSize(double w, double h);

/**
Sets the minimum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumWidth() minimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setMinimumWidth(double width);

/**
Sets whether a layout should delete this item in its destructor or not. <tt>ownership</tt> must be true to in order for the layout to delete it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#ownedByLayout() ownedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setOwnedByLayout(boolean ownedByLayout);

/**
Sets the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#parentLayoutItem() parentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent);

/**
Sets the preferred height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setPreferredHeight(double height);

/**
Sets the preferred size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize } and provides the default value for {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. In order to unset the preferred size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setPreferredSize(com.trolltech.qt.core.QSizeF size);

/**
This convenience function is equivalent to calling setPreferredSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setPreferredSize(double w, double h);

/**
Sets the preferred width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setPreferredWidth(double width);

/**
This is an overloaded member function, provided for convenience. <p>This function is equivalent to calling setSizePolicy({@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}(<tt>hPolicy</tt>, <tt>vPolicy</tt>, <tt>controlType</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy hPolicy, com.trolltech.qt.gui.QSizePolicy.Policy vPolicy, com.trolltech.qt.gui.QSizePolicy.ControlType controlType);

/**
Sets the size policy to <tt>policy</tt>. The size policy describes how the item should grow horizontally and vertically when arranged in a layout. <p>{@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s default size policy is ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }), but it is common for subclasses to change the default. For example, {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} defaults to ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSizePolicy(com.trolltech.qt.gui.QSizePolicy policy);

/**
Returns the current size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy, com.trolltech.qt.gui.QSizePolicy.Policy) setSizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QSizePolicy sizePolicy();

/**
This pure virtual function sets the geometry of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>rect</tt>, which is in parent coordinates (e.g., the top-left corner of <tt>rect</tt> is equivalent to the item's position in parent coordinates). <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to enable your item to receive geometry updates. <p>If <tt>rect</tt> is outside of the bounds of minimumSize and maximumSize, it will be adjusted to its closest size so that it is within the legal bounds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRectF rect);

/**
This pure virtual function returns the size hint for <tt>which</tt> of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, using the width or height of <tt>constraint</tt> to constrain the output. <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to provide the necessary size hints for your items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF sizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint);

/**
This virtual function discards any cached size hint information. You should always call this function if you change the return value of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} function. Subclasses must always call the base implementation when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void updateGeometry();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QGraphicsLayoutItem(long ptr);

/**
This virtual function provides the <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt> contents margins for this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. The default implementation assumes all contents margins are 0. The parameters point to values stored in qreals. If any of the pointers is 0, that value will not be updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setContentsMargins(double, double, double, double) QGraphicsWidget::setContentsMargins()}. <br></DD></DT>
*/

    public QMarginsF getContentsMargins();

}
