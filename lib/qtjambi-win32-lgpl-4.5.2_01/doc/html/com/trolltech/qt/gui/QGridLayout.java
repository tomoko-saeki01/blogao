package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QGridLayout class lays out widgets in a grid. QGridLayout takes the space made available to it (by its parent layout or by the {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()}), divides it up into rows and columns, and puts each widget it manages into the correct cell. <p>Columns and rows behave identically; we will discuss columns, but there are equivalent functions for rows. <p>Each column has a minimum width and a stretch factor. The minimum width is the greatest of that set using {@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()} and the minimum width of each widget in that column. The stretch factor is set using {@link com.trolltech.qt.gui.QGridLayout#setColumnStretch(int, int) setColumnStretch()} and determines how much of the available space the column will get over and above its necessary minimum. <p>Normally, each managed widget or layout is put into a cell of its own using {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}. It is also possible for a widget to occupy multiple cells using the row and column spanning overloads of {@link com.trolltech.qt.gui.QGridLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface, int, int, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addItem()} and {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}. If you do this, QGridLayout will guess how to distribute the size over the columns/rows (based on the stretch factors). <p>To remove a widget from a layout, call {@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}. Calling {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} on a widget also effectively removes the widget from the layout until {@link com.trolltech.qt.gui.QWidget#show() QWidget::show()} is called. <p>This illustration shows a fragment of a dialog with a five-column, three-row grid (the grid is shown overlaid in magenta): <br><center><img src="../images/gridlayout.png"></center><br> Columns 0, 2 and 4 in this dialog fragment are made up of a {@link com.trolltech.qt.gui.QLabel QLabel}, a {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, and a {@link <a href="../porting4.html">QListBox</a>}. Columns 1 and 3 are placeholders made with {@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()}. Row 0 consists of three {@link com.trolltech.qt.gui.QLabel QLabel} objects, row 1 of three {@link com.trolltech.qt.gui.QLineEdit QLineEdit} objects and row 2 of three {@link <a href="../porting4.html">QListBox</a>} objects. We used placeholder columns (1 and 3) to get the right amount of space between the columns. <p>Note that the columns and rows are not equally wide or tall. If you want two columns to have the same width, you must set their minimum widths and stretch factors to be the same yourself. You do this using {@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()} and {@link com.trolltech.qt.gui.QGridLayout#setColumnStretch(int, int) setColumnStretch()}. <p>If the QGridLayout is not the top-level layout (i.e. does not manage all of the widget's area and children), you must add it to its parent layout when you create it, but before you do anything with it. The normal way to add a layout is by calling {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()} on the parent layout. <p>Once you have added your layout you can start putting widgets and other layouts into the cells of your grid layout using {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()}, {@link com.trolltech.qt.gui.QGridLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface, int, int, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addItem()}, and {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()}. <p>QGridLayout also includes two margin widths: the margin() and the {@link com.trolltech.qt.gui.QGridLayout#spacing() spacing()}. The margin is the width of the reserved space along each of the QGridLayout's four sides. The spacing is the width of the automatically allocated spacing between neighboring boxes. <p>The default margin() and {@link com.trolltech.qt.gui.QGridLayout#spacing() spacing()} values are provided by the style. The default margin Qt styles specify is 9 for child widgets and 11 for windows. The spacing defaults to the same as the margin width for a top-level layout, or to the same as the parent layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout QBoxLayout}, {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, {@link <a href="../qtjambi-layout.html">Layout Classes</a>}, and {@link <a href="../layouts-basiclayouts.html">Basic Layouts Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGridLayout extends com.trolltech.qt.gui.QLayout
{

/**
Constructs a new grid layout. <p>You must insert this grid into another layout. You can insert widgets and layouts into this layout at any time, but laying out will not be performed before this is inserted into another layout.
*/

    public QGridLayout(){
        super((QPrivateConstructor)null);
        __qt_QGridLayout();
    }

    native void __qt_QGridLayout();

/**
Constructs a new QGridLayout with parent widget, <tt>parent</tt>. The layout has one row and one column initially, and will expand when new items are inserted.
*/

    public QGridLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QGridLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGridLayout_QWidget(long parent);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.AlignmentFlag ... arg__6) {
        this.addItem(item, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(arg__6));
    }

/**
Adds <tt>item</tt> at position <tt>row</tt>, <tt>column</tt>, spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns, and aligns it according to <tt>alignment</tt>. If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the item will extend to the bottom and/or right edge, respectively. The layout takes ownership of the <tt>item</tt>. <p><b>Warning:</b> Do not use this function to add child layouts or child widget items. Use {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()} or {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} instead.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan) {
        addItem(item, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(0));
    }

/**
Adds <tt>item</tt> at position <tt>row</tt>, <tt>column</tt>, spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns, and aligns it according to <tt>alignment</tt>. If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the item will extend to the bottom and/or right edge, respectively. The layout takes ownership of the <tt>item</tt>. <p><b>Warning:</b> Do not use this function to add child layouts or child widget items. Use {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()} or {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} instead.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QLayoutItemInterface item, int row, int column, int rowSpan) {
        addItem(item, row, column, rowSpan, (int)1, new com.trolltech.qt.core.Qt.Alignment(0));
    }

/**
Adds <tt>item</tt> at position <tt>row</tt>, <tt>column</tt>, spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns, and aligns it according to <tt>alignment</tt>. If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the item will extend to the bottom and/or right edge, respectively. The layout takes ownership of the <tt>item</tt>. <p><b>Warning:</b> Do not use this function to add child layouts or child widget items. Use {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()} or {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} instead.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QLayoutItemInterface item, int row, int column) {
        addItem(item, row, column, (int)1, (int)1, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Adds <tt>item</tt> at position <tt>row</tt>, <tt>column</tt>, spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns, and aligns it according to <tt>alignment</tt>. If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the item will extend to the bottom and/or right edge, respectively. The layout takes ownership of the <tt>item</tt>. <p><b>Warning:</b> Do not use this function to add child layouts or child widget items. Use {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addLayout()} or {@link com.trolltech.qt.gui.QGridLayout#addWidget(com.trolltech.qt.gui.QWidget, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addWidget()} instead.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QLayoutItemInterface item, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.Alignment arg__6)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QLayoutItem_int_int_int_int_Alignment(nativeId(), item == null ? 0 : item.nativeId(), row, column, rowSpan, columnSpan, arg__6.value());
    }
    @QtBlockedSlot
    native void __qt_addItem_QLayoutItem_int_int_int_int_Alignment(long __this__nativeId, long item, int row, int column, int rowSpan, int columnSpan, int arg__6);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column, com.trolltech.qt.core.Qt.AlignmentFlag ... arg__4) {
        this.addLayout(arg__1, row, column, new com.trolltech.qt.core.Qt.Alignment(arg__4));
    }

/**
Places the <tt>layout</tt> at position (<tt>row</tt>, <tt>column</tt>) in the grid. The top-left position is (0, 0). <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p>A non-zero alignment indicates that the layout should not grow to fill the available space but should be sized according to {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}. <p><tt>layout</tt> becomes a child of the grid layout.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column) {
        addLayout(arg__1, row, column, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Places the <tt>layout</tt> at position (<tt>row</tt>, <tt>column</tt>) in the grid. The top-left position is (0, 0). <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell. <p>A non-zero alignment indicates that the layout should not grow to fill the available space but should be sized according to {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}. <p><tt>layout</tt> becomes a child of the grid layout.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column, com.trolltech.qt.core.Qt.Alignment arg__4)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addLayout_QLayout_int_int_Alignment(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), row, column, arg__4.value());
    }
    @QtBlockedSlot
    native void __qt_addLayout_QLayout_int_int_Alignment(long __this__nativeId, long arg__1, int row, int column, int arg__4);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.AlignmentFlag ... arg__6) {
        this.addLayout(arg__1, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(arg__6));
    }

/**
This is an overloaded member function, provided for convenience. <p>This version adds the layout <tt>layout</tt> to the cell grid, spanning multiple rows/columns. The cell will start at <tt>row</tt>, <tt>column</tt> spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns. <p>If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the layout will extend to the bottom and/or right edge, respectively.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column, int rowSpan, int columnSpan) {
        addLayout(arg__1, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>This version adds the layout <tt>layout</tt> to the cell grid, spanning multiple rows/columns. The cell will start at <tt>row</tt>, <tt>column</tt> spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns. <p>If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the layout will extend to the bottom and/or right edge, respectively.
*/

    @QtBlockedSlot
    public final void addLayout(com.trolltech.qt.gui.QLayout arg__1, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.Alignment arg__6)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addLayout_QLayout_int_int_int_int_Alignment(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), row, column, rowSpan, columnSpan, arg__6.value());
    }
    @QtBlockedSlot
    native void __qt_addLayout_QLayout_int_int_int_int_Alignment(long __this__nativeId, long arg__1, int row, int column, int rowSpan, int columnSpan, int arg__6);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column, com.trolltech.qt.core.Qt.AlignmentFlag ... arg__4) {
        this.addWidget(arg__1, row, column, new com.trolltech.qt.core.Qt.Alignment(arg__4));
    }

/**
Adds the given <tt>widget</tt> to the cell grid at <tt>row</tt>, <tt>column</tt>. The top-left position is (0, 0) by default. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column) {
        addWidget(arg__1, row, column, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
Adds the given <tt>widget</tt> to the cell grid at <tt>row</tt>, <tt>column</tt>. The top-left position is (0, 0) by default. <p>The alignment is specified by <tt>alignment</tt>. The default alignment is 0, which means that the widget fills the entire cell.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column, com.trolltech.qt.core.Qt.Alignment arg__4)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (arg__1 != null) {
            __rcTmp.add(arg__1);
        }
        __qt_addWidget_QWidget_int_int_Alignment(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), row, column, arg__4.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget_int_int_Alignment(long __this__nativeId, long arg__1, int row, int column, int arg__4);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.AlignmentFlag ... arg__6) {
        this.addWidget(arg__1, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(arg__6));
    }

/**
This is an overloaded member function, provided for convenience. <p>This version adds the given <tt>widget</tt> to the cell grid, spanning multiple rows/columns. The cell will start at <tt>fromRow</tt>, <tt>fromColumn</tt> spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns. The <tt>widget</tt> will have the given <tt>alignment</tt>. <p>If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the widget will extend to the bottom and/or right edge, respectively.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column, int rowSpan, int columnSpan) {
        addWidget(arg__1, row, column, rowSpan, columnSpan, new com.trolltech.qt.core.Qt.Alignment(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>This version adds the given <tt>widget</tt> to the cell grid, spanning multiple rows/columns. The cell will start at <tt>fromRow</tt>, <tt>fromColumn</tt> spanning <tt>rowSpan</tt> rows and <tt>columnSpan</tt> columns. The <tt>widget</tt> will have the given <tt>alignment</tt>. <p>If <tt>rowSpan</tt> and/or <tt>columnSpan</tt> is -1, then the widget will extend to the bottom and/or right edge, respectively.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget arg__1, int row, int column, int rowSpan, int columnSpan, com.trolltech.qt.core.Qt.Alignment arg__6)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (arg__1 != null) {
            __rcTmp.add(arg__1);
        }
        __qt_addWidget_QWidget_int_int_int_int_Alignment(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), row, column, rowSpan, columnSpan, arg__6.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget_int_int_int_int_Alignment(long __this__nativeId, long arg__1, int row, int column, int rowSpan, int columnSpan, int arg__6);

/**
Returns the geometry of the cell with row <tt>row</tt> and column <tt>column</tt> in the grid. Returns an invalid rectangle if <tt>row</tt> or <tt>column</tt> is outside the grid. <p><b>Warning:</b> in the current version of Qt this function does not return valid results until {@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} has been called, i.e. after the {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()} is visible.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect cellRect(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cellRect_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_cellRect_int_int(long __this__nativeId, int row, int column);

/**
Returns the number of columns in this grid.
*/

    @QtBlockedSlot
    public final int columnCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnCount(long __this__nativeId);

/**
Returns the column spacing for column <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnMinimumWidth(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnMinimumWidth_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnMinimumWidth_int(long __this__nativeId, int column);

/**
Returns the stretch factor for column <tt>column</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setColumnStretch(int, int) setColumnStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnStretch(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnStretch_int(nativeId(), column);
    }
    @QtBlockedSlot
    native int __qt_columnStretch_int(long __this__nativeId, int column);

    @QtBlockedSlot
    private final void getItemPosition(int idx, com.trolltech.qt.QNativePointer row, com.trolltech.qt.QNativePointer column, com.trolltech.qt.QNativePointer rowSpan, com.trolltech.qt.QNativePointer columnSpan)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getItemPosition_int_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), idx, row, column, rowSpan, columnSpan);
    }
    @QtBlockedSlot
    native void __qt_getItemPosition_int_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, int idx, com.trolltech.qt.QNativePointer row, com.trolltech.qt.QNativePointer column, com.trolltech.qt.QNativePointer rowSpan, com.trolltech.qt.QNativePointer columnSpan);

/**
This property holds the spacing between widgets that are laid out side by side. If no value is explicitly set, the layout's horizontal spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QGridLayout#verticalSpacing() verticalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int horizontalSpacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalSpacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_horizontalSpacing(long __this__nativeId);

/**
Returns the layout item that occupies cell (<tt>row</tt>, <tt>column</tt>), or 0 if the cell is empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#getItemPosition(int) getItemPosition()}, and {@link com.trolltech.qt.gui.QLayout#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLayoutItemInterface itemAtPosition(int row, int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAtPosition_int_int(nativeId(), row, column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAtPosition_int_int(long __this__nativeId, int row, int column);

/**
Returns the corner that's used for the grid's origin, i. . for position (0, 0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setOriginCorner(com.trolltech.qt.core.Qt.Corner) setOriginCorner()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Corner originCorner()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Corner.resolve(__qt_originCorner(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_originCorner(long __this__nativeId);

/**
Returns the number of rows in this grid.
*/

    @QtBlockedSlot
    public final int rowCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rowCount(long __this__nativeId);

/**
Returns the minimum width set for row <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setRowMinimumHeight(int, int) setRowMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowMinimumHeight(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowMinimumHeight_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_rowMinimumHeight_int(long __this__nativeId, int row);

/**
Returns the stretch factor for row <tt>row</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setRowStretch(int, int) setRowStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowStretch(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowStretch_int(nativeId(), row);
    }
    @QtBlockedSlot
    native int __qt_rowStretch_int(long __this__nativeId, int row);

/**
Sets the minimum width of column <tt>column</tt> to <tt>minSize</tt> pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#columnMinimumWidth(int) columnMinimumWidth()}, and {@link com.trolltech.qt.gui.QGridLayout#setRowMinimumHeight(int, int) setRowMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnMinimumWidth(int column, int minSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnMinimumWidth_int_int(nativeId(), column, minSize);
    }
    @QtBlockedSlot
    native void __qt_setColumnMinimumWidth_int_int(long __this__nativeId, int column, int minSize);

/**
Sets the stretch factor of column <tt>column</tt> to <tt>stretch</tt>. The first column is number 0. <p>The stretch factor is relative to the other columns in this grid. Columns with a higher stretch factor take more of the available space. <p>The default stretch factor is 0. If the stretch factor is 0 and no other column in this table can grow at all, the column may still grow. <p>An alternative approach is to add spacing using {@link com.trolltech.qt.gui.QGridLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface, int, int, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) addItem()} with a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#columnStretch(int) columnStretch()}, and {@link com.trolltech.qt.gui.QGridLayout#setRowStretch(int, int) setRowStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumnStretch(int column, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumnStretch_int_int(nativeId(), column, stretch);
    }
    @QtBlockedSlot
    native void __qt_setColumnStretch_int_int(long __this__nativeId, int column, int stretch);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setDefaultPositioning(int n, com.trolltech.qt.core.Qt.Orientation orient)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultPositioning_int_Orientation(nativeId(), n, orient.value());
    }
    @QtBlockedSlot
    native void __qt_setDefaultPositioning_int_Orientation(long __this__nativeId, int n, int orient);

/**
This property holds the spacing between widgets that are laid out side by side. If no value is explicitly set, the layout's horizontal spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QGridLayout#verticalSpacing() verticalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalSpacing(int spacing)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalSpacing_int(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setHorizontalSpacing_int(long __this__nativeId, int spacing);

/**
Sets the grid's origin corner, i. . position (0, 0), to <tt>corner</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#originCorner() originCorner()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOriginCorner(com.trolltech.qt.core.Qt.Corner arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOriginCorner_Corner(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setOriginCorner_Corner(long __this__nativeId, int arg__1);

/**
Sets the minimum height of row <tt>row</tt> to <tt>minSize</tt> pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#rowMinimumHeight(int) rowMinimumHeight()}, and {@link com.trolltech.qt.gui.QGridLayout#setColumnMinimumWidth(int, int) setColumnMinimumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowMinimumHeight(int row, int minSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowMinimumHeight_int_int(nativeId(), row, minSize);
    }
    @QtBlockedSlot
    native void __qt_setRowMinimumHeight_int_int(long __this__nativeId, int row, int minSize);

/**
Sets the stretch factor of row <tt>row</tt> to <tt>stretch</tt>. The first row is number 0. <p>The stretch factor is relative to the other rows in this grid. Rows with a higher stretch factor take more of the available space. <p>The default stretch factor is 0. If the stretch factor is 0 and no other row in this table can grow at all, the row may still grow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#rowStretch(int) rowStretch()}, {@link com.trolltech.qt.gui.QGridLayout#setRowMinimumHeight(int, int) setRowMinimumHeight()}, and {@link com.trolltech.qt.gui.QGridLayout#setColumnStretch(int, int) setColumnStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRowStretch(int row, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowStretch_int_int(nativeId(), row, stretch);
    }
    @QtBlockedSlot
    native void __qt_setRowStretch_int_int(long __this__nativeId, int row, int stretch);

/**
This function sets both the vertical and horizontal spacing to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#spacing() spacing()}, {@link com.trolltech.qt.gui.QGridLayout#setVerticalSpacing(int) setVerticalSpacing()}, and {@link com.trolltech.qt.gui.QGridLayout#setHorizontalSpacing(int) setHorizontalSpacing()}. <br></DD></DT>
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
This property holds the spacing between widgets that are laid out on top of each other. If no value is explicitly set, the layout's vertical spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QGridLayout#horizontalSpacing() horizontalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalSpacing(int spacing)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalSpacing_int(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setVerticalSpacing_int(long __this__nativeId, int spacing);

/**
If the vertical spacing is equal to the horizontal spacing, this function returns that value; otherwise it return -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout#setSpacing(int) setSpacing()}, {@link com.trolltech.qt.gui.QGridLayout#verticalSpacing() verticalSpacing()}, and {@link com.trolltech.qt.gui.QGridLayout#horizontalSpacing() horizontalSpacing()}. <br></DD></DT>
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
This property holds the spacing between widgets that are laid out on top of each other. If no value is explicitly set, the layout's vertical spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QGridLayout#horizontalSpacing() horizontalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int verticalSpacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalSpacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_verticalSpacing(long __this__nativeId);

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
    public com.trolltech.qt.gui.QLayoutItemInterface itemAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int index);

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
    public com.trolltech.qt.gui.QLayoutItemInterface takeAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_takeAt_int(long __this__nativeId, int index);

/**
@exclude
*/

    public static native QGridLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGridLayout(QPrivateConstructor p) { super(p); } 

/**
Returns the position information of the item with the given index.
*/

    public final QTableArea getItemPosition(int index) {
        QNativePointer row = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer column = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer rowSpan = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer columnSpan = new QNativePointer(QNativePointer.Type.Int);

        getItemPosition(index, row, column, rowSpan, columnSpan);

        return new QTableArea(row.intValue(), column.intValue(), rowSpan.intValue(), columnSpan.intValue());
    }

}
