package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QBoxLayout class lines up child widgets horizontally or vertically. QBoxLayout takes the space it gets (from its parent layout or from the {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()}), divides it up into a row of boxes, and makes each managed widget fill one box. <br><center><img src="../images/qhboxlayout-with-5-children.png"></center><br> If the QBoxLayout's orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } the boxes are placed in a row, with suitable sizes. Each widget (or other box) will get at least its minimum size and at most its maximum size. Any excess space is shared according to the stretch factors (more about that below). <br><center><img src="../images/qvboxlayout-with-5-children.png"></center><br> If the QBoxLayout's orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }, the boxes are placed in a column, again with suitable sizes. <p>The easiest way to create a QBoxLayout is to use one of the convenience classes, e.g. {@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout} (for {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } boxes) or {@link com.trolltech.qt.gui.QVBoxLayout QVBoxLayout} (for {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } boxes). You can also use the QBoxLayout constructor directly, specifying its direction as {@link com.trolltech.qt.gui.QBoxLayout.Direction LeftToRight }, {@link com.trolltech.qt.gui.QBoxLayout.Direction RightToLeft }, {@link com.trolltech.qt.gui.QBoxLayout.Direction TopToBottom }, or {@link com.trolltech.qt.gui.QBoxLayout.Direction BottomToTop }. <p>If the QBoxLayout is not the top-level layout (i.e. it is not managing all of the widget's area and children), you must add it to its parent layout before you can do anything with it. The normal way to add a layout is by calling parentLayout-&gt;{@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) addLayout()}. <p>Once you have done this, you can add boxes to the QBoxLayout using one of four functions: <ul><li> {@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} to add a widget to the QBoxLayout and set the widget's stretch factor. (The stretch factor is along the row of boxes.)</li><li> {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()} to create an empty box; this is one of the functions you use to create nice and spacious dialogs. See below for ways to set margins.</li><li> {@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()} to create an empty, stretchable box.</li><li> {@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) addLayout()} to add a box containing another {@link com.trolltech.qt.gui.QLayout QLayout} to the row and set that layout's stretch factor.</li></ul> Use {@link com.trolltech.qt.gui.QBoxLayout#insertWidget(int, com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) insertWidget()}, {@link com.trolltech.qt.gui.QBoxLayout#insertSpacing(int, int) insertSpacing()}, {@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()} or {@link com.trolltech.qt.gui.QBoxLayout#insertLayout(int, com.trolltech.qt.gui.QLayout) insertLayout()} to insert a box at a specified position in the layout. <p>QBoxLayout also includes two margin widths: <ul><li> {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) setContentsMargins()} sets the width of the outer border on each side of the widget. This is the width of the reserved space along each of the QBoxLayout's four sides.</li><li> {@link com.trolltech.qt.gui.QBoxLayout#setSpacing(int) setSpacing()} sets the width between neighboring boxes. (You can use {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()} to get more space at a particular spot.)</li></ul> The margin default is provided by the style. The default margin most Qt styles specify is 9 for child widgets and 11 for windows. The spacing defaults to the same as the margin width for a top-level layout, or to the same as the parent layout. <p>To remove a widget from a layout, call {@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}. Calling {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} on a widget also effectively removes the widget from the layout until {@link com.trolltech.qt.gui.QWidget#show() QWidget::show()} is called. <p>You will almost always want to use {@link com.trolltech.qt.gui.QVBoxLayout QVBoxLayout} and {@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout} rather than QBoxLayout because of their convenient constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout QGridLayout}, {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, and {@link <a href="../qtjambi-layout.html">Layout Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBoxLayout extends com.trolltech.qt.gui.QLayout
{
    
/**
This type is used to determine the direction of a box layout.
*/
@QtBlockedEnum
    public enum Direction implements com.trolltech.qt.QtEnumerator {
/**
 Horizontal from left to right.
*/

        LeftToRight(0),
/**
 Horizontal from right to left.
*/

        RightToLeft(1),
/**
 Vertical from top to bottom.
*/

        TopToBottom(2),
/**
 Vertical from bottom to top.
*/

        BottomToTop(3),
;

        Direction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QBoxLayout$Direction constant with the specified <tt>int</tt>.</brief>
*/

        public static Direction resolve(int value) {
            return (Direction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LeftToRight;
            case 1: return RightToLeft;
            case 2: return TopToBottom;
            case 3: return BottomToTop;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a new QBoxLayout with direction <tt>dir</tt> and parent widget <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#direction() direction()}. <br></DD></DT>
*/

    public QBoxLayout(com.trolltech.qt.gui.QBoxLayout.Direction arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new QBoxLayout with direction <tt>dir</tt> and parent widget <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#direction() direction()}. <br></DD></DT>
*/

    public QBoxLayout(com.trolltech.qt.gui.QBoxLayout.Direction arg__1, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QBoxLayout_Direction_QWidget(arg__1.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QBoxLayout_Direction_QWidget(int arg__1, long parent);


/**
Adds <tt>layout</tt> to the end of the box, with serial stretch factor <tt>stretch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertLayout(int, com.trolltech.qt.gui.QLayout) insertLayout()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout layout) {
        addLayout(layout, (int)0);
    }
/**
Adds <tt>layout</tt> to the end of the box, with serial stretch factor <tt>stretch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertLayout(int, com.trolltech.qt.gui.QLayout) insertLayout()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout layout, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (layout != null) {
            layout.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addLayout_QLayout_int(nativeId(), layout == null ? 0 : layout.nativeId(), stretch);
    }
    @QtBlockedSlot
    native void __qt_addLayout_QLayout_int(long __this__nativeId, long layout, int stretch);

/**
Adds <tt>spacerItem</tt> to the end of this box layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()}, and {@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addSpacerItem(com.trolltech.qt.gui.QSpacerItem spacerItem)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (spacerItem != null) {
            spacerItem.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addSpacerItem_QSpacerItem(nativeId(), spacerItem == null ? 0 : spacerItem.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addSpacerItem_QSpacerItem(long __this__nativeId, long spacerItem);

/**
Adds a non-stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) with size <tt>size</tt> to the end of this box layout. QBoxLayout provides default margin and spacing. This function adds additional space. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertSpacing(int, int) insertSpacing()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addSpacing(int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addSpacing_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_addSpacing_int(long __this__nativeId, int size);


/**
Adds a stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) with zero minimum size and stretch factor <tt>stretch</tt> to the end of this box layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addStretch() {
        addStretch((int)0);
    }
/**
Adds a stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) with zero minimum size and stretch factor <tt>stretch</tt> to the end of this box layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addStretch(int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addStretch_int(nativeId(), stretch);
    }
    @QtBlockedSlot
    native void __qt_addStretch_int(long __this__nativeId, int stretch);

/**
Limits the perpendicular dimension of the box (e. . height if the box is {@link com.trolltech.qt.gui.QBoxLayout.Direction LeftToRight }) to a minimum of <tt>size</tt>. Other constraints may increase the limit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addStrut(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addStrut_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_addStrut_int(long __this__nativeId, int arg__1);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int stretch, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.addWidget(arg__1, stretch, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Adds <tt>widget</tt> to the end of this box layout, with a stretch factor of <tt>stretch</tt> and alignment <tt>alignment</tt>. <p>The stretch factor applies only in the {@link com.trolltech.qt.gui.QBoxLayout#direction() direction} of the QBoxLayout, and is relative to the other boxes and widgets in this QBoxLayout. Widgets and boxes with higher stretch factors grow more. <p>If the stretch factor is 0 and nothing else in the QBoxLayout has a stretch factor greater than zero, the space is distributed according to the {@link com.trolltech.qt.gui.QWidget QWidget}:sizePolicy() of each widget that's involved. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#insertWidget(int, com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) insertWidget()}, {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, {@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) addLayout()}, {@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()}, and {@link com.trolltech.qt.gui.QBoxLayout#addStrut(int) addStrut()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int stretch, com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (arg__1 != null) {
            __rcTmp.add(arg__1);
        }
        __qt_addWidget_QWidget_int_Alignment(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), stretch, alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget_int_Alignment(long __this__nativeId, long arg__1, int stretch, int alignment);

/**
Returns the direction of the box. {@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} and {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()} work in this direction; the stretch stretches in this direction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#setDirection(com.trolltech.qt.gui.QBoxLayout.Direction) setDirection()}, {@link com.trolltech.qt.gui.QBoxLayout.Direction QBoxLayout::Direction }, {@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}, and {@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBoxLayout.Direction direction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QBoxLayout.Direction.resolve(__qt_direction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_direction(long __this__nativeId);

/**
Inserts <tt>item</tt> into this box layout at position <tt>index</tt>. If <tt>index</tt> is negative, the item is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, {@link com.trolltech.qt.gui.QBoxLayout#insertWidget(int, com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) insertWidget()}, {@link com.trolltech.qt.gui.QBoxLayout#insertLayout(int, com.trolltech.qt.gui.QLayout) insertLayout()}, {@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertSpacing(int, int) insertSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void insertItem(int index, com.trolltech.qt.gui.QLayoutItemInterface arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__2 != null) {
            arg__2.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertItem_int_QLayoutItem(nativeId(), index, arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertItem_int_QLayoutItem(long __this__nativeId, int index, long arg__2);


/**
Inserts <tt>layout</tt> at position <tt>index</tt>, with stretch factor <tt>stretch</tt>. If <tt>index</tt> is negative, the layout is added at the end. <p><tt>layout</tt> becomes a child of the box layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) addLayout()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertLayout(int index, com.trolltech.qt.gui.QLayout layout) {
        insertLayout(index, layout, (int)0);
    }
/**
Inserts <tt>layout</tt> at position <tt>index</tt>, with stretch factor <tt>stretch</tt>. If <tt>index</tt> is negative, the layout is added at the end. <p><tt>layout</tt> becomes a child of the box layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) addLayout()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertLayout(int index, com.trolltech.qt.gui.QLayout layout, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (layout != null) {
            layout.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertLayout_int_QLayout_int(nativeId(), index, layout == null ? 0 : layout.nativeId(), stretch);
    }
    @QtBlockedSlot
    native void __qt_insertLayout_int_QLayout_int(long __this__nativeId, int index, long layout, int stretch);

/**
Inserts <tt>spacerItem</tt> at position <tt>index</tt>, with zero minimum size and stretch factor. If <tt>index</tt> is negative the space is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addSpacerItem(com.trolltech.qt.gui.QSpacerItem) addSpacerItem()}, {@link com.trolltech.qt.gui.QBoxLayout#insertStretch(int) insertStretch()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertSpacing(int, int) insertSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertSpacerItem(int index, com.trolltech.qt.gui.QSpacerItem spacerItem)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (spacerItem != null) {
            spacerItem.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertSpacerItem_int_QSpacerItem(nativeId(), index, spacerItem == null ? 0 : spacerItem.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertSpacerItem_int_QSpacerItem(long __this__nativeId, int index, long spacerItem);

/**
Inserts a non-stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) at position <tt>index</tt>, with size <tt>size</tt>. If <tt>index</tt> is negative the space is added at the end. <p>The box layout has default margin and spacing. This function adds additional space. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addSpacing(int) addSpacing()}, {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertSpacing(int index, int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertSpacing_int_int(nativeId(), index, size);
    }
    @QtBlockedSlot
    native void __qt_insertSpacing_int_int(long __this__nativeId, int index, int size);


/**
Inserts a stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) at position <tt>index</tt>, with zero minimum size and stretch factor <tt>stretch</tt>. If <tt>index</tt> is negative the space is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertStretch(int index) {
        insertStretch(index, (int)0);
    }
/**
Inserts a stretchable space (a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}) at position <tt>index</tt>, with zero minimum size and stretch factor <tt>stretch</tt>. If <tt>index</tt> is negative the space is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addStretch() addStretch()}, {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}, and {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertStretch(int index, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertStretch_int_int(nativeId(), index, stretch);
    }
    @QtBlockedSlot
    native void __qt_insertStretch_int_int(long __this__nativeId, int index, int stretch);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertWidget(int index, com.trolltech.qt.gui.QWidget widget, int stretch, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.insertWidget(index, widget, stretch, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }

/**
Inserts <tt>widget</tt> at position <tt>index</tt>, with stretch factor <tt>stretch</tt> and alignment <tt>alignment</tt>. If <tt>index</tt> is negative, the widget is added at the end. <p>The stretch factor applies only in the {@link com.trolltech.qt.gui.QBoxLayout#direction() direction} of the QBoxLayout, and is relative to the other boxes and widgets in this QBoxLayout. Widgets and boxes with higher stretch factors grow more. <p>If the stretch factor is 0 and nothing else in the QBoxLayout has a stretch factor greater than zero, the space is distributed according to the {@link com.trolltech.qt.gui.QWidget QWidget}:sizePolicy() of each widget that's involved. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertWidget(int index, com.trolltech.qt.gui.QWidget widget, int stretch) {
        insertWidget(index, widget, stretch, new com.trolltech.qt.core.Qt.Alignment(0));
    }

/**
Inserts <tt>widget</tt> at position <tt>index</tt>, with stretch factor <tt>stretch</tt> and alignment <tt>alignment</tt>. If <tt>index</tt> is negative, the widget is added at the end. <p>The stretch factor applies only in the {@link com.trolltech.qt.gui.QBoxLayout#direction() direction} of the QBoxLayout, and is relative to the other boxes and widgets in this QBoxLayout. Widgets and boxes with higher stretch factors grow more. <p>If the stretch factor is 0 and nothing else in the QBoxLayout has a stretch factor greater than zero, the space is distributed according to the {@link com.trolltech.qt.gui.QWidget QWidget}:sizePolicy() of each widget that's involved. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertWidget(int index, com.trolltech.qt.gui.QWidget widget) {
        insertWidget(index, widget, (int)0, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Inserts <tt>widget</tt> at position <tt>index</tt>, with stretch factor <tt>stretch</tt> and alignment <tt>alignment</tt>. If <tt>index</tt> is negative, the widget is added at the end. <p>The stretch factor applies only in the {@link com.trolltech.qt.gui.QBoxLayout#direction() direction} of the QBoxLayout, and is relative to the other boxes and widgets in this QBoxLayout. Widgets and boxes with higher stretch factors grow more. <p>If the stretch factor is 0 and nothing else in the QBoxLayout has a stretch factor greater than zero, the space is distributed according to the {@link com.trolltech.qt.gui.QWidget QWidget}:sizePolicy() of each widget that's involved. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addWidget(com.trolltech.qt.gui.QWidget, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}, and {@link com.trolltech.qt.gui.QBoxLayout#insertItem(int, com.trolltech.qt.gui.QLayoutItemInterface) insertItem()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertWidget(int index, com.trolltech.qt.gui.QWidget widget, int stretch, com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (widget != null) {
            __rcTmp.add(widget);
        }
        __qt_insertWidget_int_QWidget_int_Alignment(nativeId(), index, widget == null ? 0 : widget.nativeId(), stretch, alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertWidget_int_QWidget_int_Alignment(long __this__nativeId, int index, long widget, int stretch, int alignment);

/**
Sets the direction of this layout to <tt>direction</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#direction() direction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDirection(com.trolltech.qt.gui.QBoxLayout.Direction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirection_Direction(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setDirection_Direction(long __this__nativeId, int arg__1);

/**
Reimplements QLayout.:setSpacing(). Sets the spacing property to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>QLayout::setSpacing(), and {@link com.trolltech.qt.gui.QBoxLayout#spacing() spacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSpacing(int spacing)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpacing_int(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setSpacing_int(long __this__nativeId, int spacing);

/**
Sets the stretch factor at position <tt>index</tt>. to <tt>stretch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#stretch(int) stretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStretch(int index, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStretch_int_int(nativeId(), index, stretch);
    }
    @QtBlockedSlot
    native void __qt_setStretch_int_int(long __this__nativeId, int index, int stretch);

/**
This is an overloaded member function, provided for convenience. <p>Sets the stretch factor for the layout <tt>layout</tt> to <tt>stretch</tt> and returns true if <tt>layout</tt> is found in this layout (not including child layouts); otherwise returns false.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setStretchFactor(com.trolltech.qt.gui.QLayout l, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setStretchFactor_QLayout_int(nativeId(), l == null ? 0 : l.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_setStretchFactor_QLayout_int(long __this__nativeId, long l, int stretch);

/**
Sets the stretch factor for <tt>widget</tt> to <tt>stretch</tt> and returns true if <tt>widget</tt> is found in this layout (not including child layouts); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#setAlignment(com.trolltech.qt.core.Qt.Alignment) setAlignment()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setStretchFactor(com.trolltech.qt.gui.QWidget w, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setStretchFactor_QWidget_int(nativeId(), w == null ? 0 : w.nativeId(), stretch);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_setStretchFactor_QWidget_int(long __this__nativeId, long w, int stretch);

/**
Reimplements QLayout.:spacing(). If the spacing property is valid, that value is returned. Otherwise, a value for the spacing property is computed and returned. Since layout spacing in a widget is style dependent, if the parent is a widget, it queries the style for the (horizontal or vertical) spacing of the layout. Otherwise, the parent is a layout, and it queries the parent layout for the {@link com.trolltech.qt.gui.QBoxLayout#spacing() spacing()}. <p><DT><b>See also:</b><br><DD>QLayout::spacing(), and {@link com.trolltech.qt.gui.QBoxLayout#setSpacing(int) setSpacing()}. <br></DD></DT>
*/

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
Returns the stretch factor at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#setStretch(int, int) setStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int stretch(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stretch_int(nativeId(), index);
    }
    @QtBlockedSlot
    native int __qt_stretch_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void addItem(com.trolltech.qt.gui.QLayoutItemInterface arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QLayoutItem(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addItem_QLayoutItem(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
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
    public com.trolltech.qt.core.Qt.Orientations expandingDirections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Orientations(__qt_expandingDirections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_expandingDirections(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasHeightForWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHeightForWidth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHeightForWidth(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int heightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void invalidate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
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
    public com.trolltech.qt.gui.QLayoutItemInterface itemAt(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize maximumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_maximumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int minimumHeightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_minimumHeightForWidth_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long arg__1);

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
    public com.trolltech.qt.gui.QLayoutItemInterface takeAt(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeAt_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_takeAt_int(long __this__nativeId, int arg__1);

/**
@exclude
*/

    public static native QBoxLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBoxLayout(QPrivateConstructor p) { super(p); } 
}
