package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} class provides an abstract item that a {@link com.trolltech.qt.gui.QLayout QLayout} manipulates. This is used by custom layouts. <p>Pure virtual functions are provided to return information about the layout, including, {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QLayoutItem#maximumSize() maximumSize()} and expanding(). <p>The layout's geometry can be set and retrieved with {@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} and {@link com.trolltech.qt.gui.QLayoutItem#geometry() geometry()}, and its alignment with {@link com.trolltech.qt.gui.QLayoutItem#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()} and {@link com.trolltech.qt.gui.QLayoutItem#alignment() alignment()}. <p>{@link com.trolltech.qt.gui.QLayoutItem#isEmpty() isEmpty()} returns whether the layout item is empty. If the concrete item is a {@link com.trolltech.qt.gui.QWidget QWidget}, it can be retrieved using {@link com.trolltech.qt.gui.QLayoutItem#widget() widget()}. Similarly for {@link com.trolltech.qt.gui.QLayoutItem#layout() layout()} and {@link com.trolltech.qt.gui.QLayoutItem#spacerItem() spacerItem()}. <p>Some layouts have width and height interdependencies. These can be expressed using {@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()}, {@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()}, and {@link com.trolltech.qt.gui.QLayoutItem#minimumHeightForWidth(int) minimumHeightForWidth()}. For more explanation see the Qt Quarterly article Trading Height for Width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout QLayout}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QLayoutItemInterface extends QtJambiInterface
{

/**
Returns the alignment of this item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.Alignment alignment();

/**
Returns the control type(s) for the layout item. For a {@link com.trolltech.qt.gui.QWidgetItem QWidgetItem}, the control type comes from the widget's size policy; for a {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem}, the control types is derived from the layout's contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#controlType() QSizePolicy::controlType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QSizePolicy.ControlTypes controlTypes();

/**
Sets the alignment of this item to <tt>alignment</tt>. <p><b>Note:</b> Item alignment is only supported by {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} subclasses where it would have a visual effect. Except for {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}, which provides blank space for layouts, all public Qt classes that inherit {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} support item alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setAlignment(com.trolltech.qt.core.Qt.Alignment a);

/**
Returns whether this layout item can make use of more space than {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}. A value of {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in only one dimension, whereas {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } | {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in both dimensions.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.Orientations expandingDirections();

/**
Returns the rectangle covered by this layout item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect geometry();

/**
Returns true if this layout's preferred height depends on its width; otherwise returns false. The default implementation returns false. <p>Reimplement this function in layout managers that support height for width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()}, and {@link com.trolltech.qt.gui.QWidget#heightForWidth(int) QWidget::heightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean hasHeightForWidth();

/**
Returns the preferred height for this layout item, given the width <tt>w</tt>. <p>The default implementation returns -1, indicating that the preferred height is independent of the width of the item. Using the function {@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()} will typically be much faster than calling this function and testing for -1. <p>Reimplement this function in layout managers that support height for width. A typical implementation will look like this: <pre class="snippet">
    public int heightForWidth(int w)
    {
        if (cache_dirty || cached_width != w) {
            int h = calculateHeightForWidth(w);
            cached_hfw = h;
            return h;
        }
        return cached_hfw;
    }
</pre> Caching is strongly recommended; without it layout will take exponential time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int heightForWidth(int arg__1);

/**
Invalidates any cached information in this layout item.
*/

    @QtBlockedSlot
    public void invalidate();

    @QtBlockedSlot
    public boolean isEmpty();

/**
If this item is a {@link com.trolltech.qt.gui.QLayout QLayout}, it is returned as a {@link com.trolltech.qt.gui.QLayout QLayout}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayout layout();

/**
Implemented in subclasses to return the maximum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize maximumSize();

/**
Returns the minimum height this widget needs for the given width, <tt>w</tt>. The default implementation simply returns heightForWidth(<tt>w</tt>).
*/

    @QtBlockedSlot
    public int minimumHeightForWidth(int arg__1);

/**
Implemented in subclasses to return the minimum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize();

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect arg__1);

/**
Implemented in subclasses to return the preferred size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint();

/**
If this item is a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}, it is returned as a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QSpacerItem spacerItem();

/**
If this item is a {@link com.trolltech.qt.gui.QWidget QWidget}, it is returned as a {@link com.trolltech.qt.gui.QWidget QWidget}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget widget();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QLayoutItem(long ptr);
}
