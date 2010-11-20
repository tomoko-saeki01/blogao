package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSpacerItem class provides blank space in a layout. Normally, you don't need to use this class directly. Qt's built-in layout managers provide the following functions for manipulating empty space in layouts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Class</center></th><th><center> Functions</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout}</td><td> {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()}, {@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QBoxLayout#insertSpacing(int, int) insertSpacing()}, {@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGridLayout QGridLayout}</td><td> {@link com.trolltech.qt.gui.QGridLayout#setRowMinimumHeight(int, int) setRowMinimumHeight()}, {@link com.trolltech.qt.gui.QGridLayout#setRowStretch(int, int) setRowStretch()}, {@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()}, {@link com.trolltech.qt.gui.QGridLayout#setColumnStretch(int, int) setColumnStretch()}</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout QLayout}, {@link com.trolltech.qt.gui.QWidgetItem QWidgetItem}, and {@link com.trolltech.qt.gui.QLayoutItem#spacerItem() QLayoutItem::spacerItem()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSpacerItem extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QLayoutItemInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a spacer item with preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space.
*/

    public QSpacerItem(int w, int h, com.trolltech.qt.gui.QSizePolicy.Policy hData) {
        this(w, h, hData, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);
    }

/**
Constructs a spacer item with preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space.
*/

    public QSpacerItem(int w, int h) {
        this(w, h, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);
    }
/**
Constructs a spacer item with preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space.
*/

    public QSpacerItem(int w, int h, com.trolltech.qt.gui.QSizePolicy.Policy hData, com.trolltech.qt.gui.QSizePolicy.Policy vData){
        super((QPrivateConstructor)null);
        __qt_QSpacerItem_int_int_Policy_Policy(w, h, hData.value(), vData.value());
    }

    native void __qt_QSpacerItem_int_int_Policy_Policy(int w, int h, int hData, int vData);

/**
Returns the alignment of this item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);


/**
Changes this spacer item to have preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space. <p>Note that if {@link com.trolltech.qt.gui.QSpacerItem#changeSize(int, int, com.trolltech.qt.gui.QSizePolicy.Policy) changeSize()} is called after the spacer item has been added to a layout, it is necessary to invalidate the layout in order for the spacer item's new size to take effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#invalidate() QSpacerItem::invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void changeSize(int w, int h, com.trolltech.qt.gui.QSizePolicy.Policy hData) {
        changeSize(w, h, hData, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);
    }

/**
Changes this spacer item to have preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space. <p>Note that if {@link com.trolltech.qt.gui.QSpacerItem#changeSize(int, int, com.trolltech.qt.gui.QSizePolicy.Policy) changeSize()} is called after the spacer item has been added to a layout, it is necessary to invalidate the layout in order for the spacer item's new size to take effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#invalidate() QSpacerItem::invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void changeSize(int w, int h) {
        changeSize(w, h, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);
    }
/**
Changes this spacer item to have preferred width <tt>w</tt>, preferred height <tt>h</tt>, horizontal size policy <tt>hPolicy</tt> and vertical size policy <tt>vPolicy</tt>. <p>The default values provide a gap that is able to stretch if nothing else wants the space. <p>Note that if {@link com.trolltech.qt.gui.QSpacerItem#changeSize(int, int, com.trolltech.qt.gui.QSizePolicy.Policy) changeSize()} is called after the spacer item has been added to a layout, it is necessary to invalidate the layout in order for the spacer item's new size to take effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#invalidate() QSpacerItem::invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void changeSize(int w, int h, com.trolltech.qt.gui.QSizePolicy.Policy hData, com.trolltech.qt.gui.QSizePolicy.Policy vData)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeSize_int_int_Policy_Policy(nativeId(), w, h, hData.value(), vData.value());
    }
    @QtBlockedSlot
    native void __qt_changeSize_int_int_Policy_Policy(long __this__nativeId, int w, int h, int hData, int vData);

/**
Returns the control type(s) for the layout item. For a {@link com.trolltech.qt.gui.QWidgetItem QWidgetItem}, the control type comes from the widget's size policy; for a {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem}, the control types is derived from the layout's contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#controlType() QSizePolicy::controlType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy.ControlTypes controlTypes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QSizePolicy.ControlTypes(__qt_controlTypes(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_controlTypes(long __this__nativeId);

/**
Sets the alignment of this item to <tt>alignment</tt>. <p><b>Note:</b> Item alignment is only supported by {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} subclasses where it would have a visual effect. Except for QSpacerItem, which provides blank space for layouts, all public Qt classes that inherit {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} support item alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), a.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int a);

/**
Returns whether this layout item can make use of more space than {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}. A value of {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in only one dimension, whereas {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } | {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in both dimensions.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.Orientations expandingDirections()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Orientations(__qt_expandingDirections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_expandingDirections(long __this__nativeId);

/**
Returns the rectangle covered by this layout item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect geometry()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_geometry(long __this__nativeId);

/**
Returns true if this layout's preferred height depends on its width; otherwise returns false. The default implementation returns false. <p>Reimplement this function in layout managers that support height for width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()}, and {@link com.trolltech.qt.gui.QWidget#heightForWidth(int) QWidget::heightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean hasHeightForWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHeightForWidth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHeightForWidth(long __this__nativeId);

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
    public int heightForWidth(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int arg__1);

/**
Invalidates any cached information in this layout item.
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
Implemented in subclasses to return whether this item is empty, i.e. whether it contains any widgets.
*/

    @QtBlockedSlot
    public boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
If this item is a {@link com.trolltech.qt.gui.QLayout QLayout}, it is returned as a {@link com.trolltech.qt.gui.QLayout QLayout}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayout layout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayout __qt_layout(long __this__nativeId);

/**
Implemented in subclasses to return the maximum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize maximumSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_maximumSize(long __this__nativeId);

/**
Returns the minimum height this widget needs for the given width, <tt>w</tt>. The default implementation simply returns heightForWidth(<tt>w</tt>).
*/

    @QtBlockedSlot
    public int minimumHeightForWidth(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_minimumHeightForWidth_int(long __this__nativeId, int arg__1);

/**
Implemented in subclasses to return the minimum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
Implemented in subclasses to set this item's geometry to <tt>r</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long arg__1);

/**
Implemented in subclasses to return the preferred size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
If this item is a QSpacerItem, it is returned as a QSpacerItem; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QSpacerItem spacerItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spacerItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSpacerItem __qt_spacerItem(long __this__nativeId);

/**
If this item is a {@link com.trolltech.qt.gui.QWidget QWidget}, it is returned as a {@link com.trolltech.qt.gui.QWidget QWidget}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget widget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
@exclude
*/

    public static native QSpacerItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSpacerItem(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QLayoutItem(long ptr);
}
