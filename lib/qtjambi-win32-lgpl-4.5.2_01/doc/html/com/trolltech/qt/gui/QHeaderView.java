package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QHeaderView class provides a header row or header column for item views. A QHeaderView displays the headers used in item views such as the {@link com.trolltech.qt.gui.QTableView QTableView} and {@link com.trolltech.qt.gui.QTreeView QTreeView} classes. It takes the place of Qt3's <tt>QHeader</tt> class previously used for the same purpose, but uses the Qt's model/view architecture for consistency with the item view classes. <p>The QHeaderView class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>The header gets the data for each section from the model using the {@link com.trolltech.qt.core.QAbstractItemModel#headerData(int, com.trolltech.qt.core.Qt.Orientation) QAbstractItemModel::headerData()} function. You can set the data by using {@link com.trolltech.qt.core.QAbstractItemModel#setHeaderData(int, com.trolltech.qt.core.Qt.Orientation, java.lang.Object) QAbstractItemModel::setHeaderData()}. <p>Each header has an {@link com.trolltech.qt.gui.QHeaderView#orientation() orientation()} and a number of sections, given by the {@link com.trolltech.qt.gui.QHeaderView#count() count()} function. A section refers to a part of the header - either a row or a column, depending on the orientation. <p>Sections can be moved and resized using {@link com.trolltech.qt.gui.QHeaderView#moveSection(int, int) moveSection()} and {@link com.trolltech.qt.gui.QHeaderView#resizeSection(int, int) resizeSection()}; they can also be hidden and shown with {@link com.trolltech.qt.gui.QHeaderView#hideSection(int) hideSection()} and {@link com.trolltech.qt.gui.QHeaderView#showSection(int) showSection()}. <p>Each section of a header is described by a section ID, specified by its section(), and can be located at a particular {@link com.trolltech.qt.gui.QHeaderView#visualIndex(int) visualIndex()} in the header. A section can have a sort indicator set with {@link com.trolltech.qt.gui.QHeaderView#setSortIndicator(int, com.trolltech.qt.core.Qt.SortOrder) setSortIndicator()}; this indicates whether the items in the associated item view will be sorted in the order given by the section. <p>For a horizontal header the section is equivalent to a column in the model, and for a vertical header the section is equivalent to a row in the model.<a name="moving-header-sections"><h2>Moving Header Sections</h2> A header can be fixed in place, or made movable with {@link com.trolltech.qt.gui.QHeaderView#setMovable(boolean) setMovable()}. It can be made clickable with {@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}, and has resizing behavior in accordance with {@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <p><b>Note:</b> Double-clicking on a header to resize a section only applies for visible rows. <p>A header will emit {@link com.trolltech.qt.gui.QHeaderView#sectionMoved sectionMoved() } if the user moves a section, {@link com.trolltech.qt.gui.QHeaderView#sectionResized sectionResized() } if the user resizes a section, and {@link com.trolltech.qt.gui.QHeaderView#sectionClicked sectionClicked() } as well as {@link com.trolltech.qt.gui.QHeaderView#sectionHandleDoubleClicked sectionHandleDoubleClicked() } in response to mouse clicks. A header will also emit {@link com.trolltech.qt.gui.QHeaderView#sectionCountChanged sectionCountChanged() } and {@link com.trolltech.qt.gui.QHeaderView#sectionAutoResize sectionAutoResize() }. <p>You can identify a section using the {@link com.trolltech.qt.gui.QHeaderView#logicalIndex(int) logicalIndex()} and {@link com.trolltech.qt.gui.QHeaderView#logicalIndexAt(com.trolltech.qt.core.QPoint) logicalIndexAt()} functions, or by its index position, using the {@link com.trolltech.qt.gui.QHeaderView#visualIndex(int) visualIndex()} and {@link com.trolltech.qt.gui.QHeaderView#visualIndexAt(int) visualIndexAt()} functions. The visual index will change if a section is moved, but the logical index will not change.<a name="appearance"><h2>Appearance</h2> {@link com.trolltech.qt.gui.QTableWidget QTableWidget} and {@link com.trolltech.qt.gui.QTableView QTableView} create default headers. If you want the headers to be visible, you can use setVisible(). <p>Not all {@link com.trolltech.qt.core.Qt.ItemDataRole ItemDataRole }s will have an effect on a QHeaderView. If you need to draw other roles, you can subclass QHeaderView and reimplement {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. QHeaderView respects the following item data roles: {@link com.trolltech.qt.core.Qt.ItemDataRole TextAlignmentRole }, {@link com.trolltech.qt.core.Qt.ItemDataRole DisplayRole }, {@link com.trolltech.qt.core.Qt.ItemDataRole FontRole }, {@link com.trolltech.qt.core.Qt.ItemDataRole DecorationRole }, {@link com.trolltech.qt.core.Qt.ItemDataRole ForegroundRole }, and {@link com.trolltech.qt.core.Qt.ItemDataRole BackgroundRole }. <p><b>Note:</b> Each header renders the data for each section itself, and does not rely on a delegate. As a result, calling a header's {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()} function will have no effect. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTableView QTableView}, and {@link com.trolltech.qt.gui.QTreeView QTreeView}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHeaderView extends com.trolltech.qt.gui.QAbstractItemView
{
/**
The resize mode specifies the behavior of the header sections. It can be set on the entire header view or on individual sections using {@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. The following values are obsolete: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, {@link QHeaderView#stretchLastSection() stretchLastSection}, and {@link QHeaderView#minimumSectionSize() minimumSectionSize}. <br></DD></DT>
*/

    public enum ResizeMode implements com.trolltech.qt.QtEnumerator {
/**
 The user can resize the section. The section can also be resized programmatically using {@link com.trolltech.qt.gui.QHeaderView#resizeSection(int, int) resizeSection()}. The section size defaults to {@link QHeaderView#defaultSectionSize() defaultSectionSize}. (See also {@link QHeaderView#cascadingSectionResizes() cascadingSectionResizes}.)
*/

        Interactive(0),
/**
 {@link com.trolltech.qt.gui.QHeaderView QHeaderView} will automatically resize the section to fill the available space. The size cannot be changed by the user or programmatically.
*/

        Stretch(1),
/**
 The user cannot resize the section. The section can only be resized programmatically using {@link com.trolltech.qt.gui.QHeaderView#resizeSection(int, int) resizeSection()}. The section size defaults to {@link QHeaderView#defaultSectionSize() defaultSectionSize}.
*/

        Fixed(2),
/**
 {@link com.trolltech.qt.gui.QHeaderView QHeaderView} will automatically resize the section to its optimal size based on the contents of the entire column or row. The size cannot be changed by the user or programmatically. (This value was introduced in 4.2)
*/

        ResizeToContents(3),
;

        ResizeMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHeaderView$ResizeMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ResizeMode resolve(int value) {
            return (ResizeMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Interactive;
            case 1: return Stretch;
            case 2: return Fixed;
            case 3: return ResizeToContents;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when the header's geometries have changed.
*/

    public final Signal0 geometriesChanged = new Signal0();

    private final void geometriesChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_geometriesChanged(nativeId());
    }
    native void __qt_geometriesChanged(long __this__nativeId);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex), com.trolltech.qt.gui.QHeaderView$ResizeMode(named: mode)&gt;:<p> This signal is emitted when a section is automatically resized. The section's logical index is specified by <tt>logicalIndex</tt>, and the resize mode by <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link com.trolltech.qt.gui.QHeaderView#stretchLastSection() stretchLastSection()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, com.trolltech.qt.gui.QHeaderView.ResizeMode> sectionAutoResize = new Signal2<java.lang.Integer, com.trolltech.qt.gui.QHeaderView.ResizeMode>();

    private final void sectionAutoResize(int logicalIndex, com.trolltech.qt.gui.QHeaderView.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionAutoResize_int_ResizeMode(nativeId(), logicalIndex, mode.value());
    }
    native void __qt_sectionAutoResize_int_ResizeMode(long __this__nativeId, int logicalIndex, int mode);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex)&gt;:<p> This signal is emitted when a section is clicked. The section's logical index is specified by <tt>logicalIndex</tt>. <p>Note that the sectionPressed signal will also be emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionPressed sectionPressed() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sectionClicked = new Signal1<java.lang.Integer>();

    private final void sectionClicked(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionClicked_int(nativeId(), logicalIndex);
    }
    native void __qt_sectionClicked_int(long __this__nativeId, int logicalIndex);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: oldCount), java.lang.Integer(named: newCount)&gt;:<p> This signal is emitted when the number of sections changes, i. ., when sections are added or deleted. The original count is specified by <tt>oldCount</tt>, and the new count by <tt>newCount</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#count() count()}, {@link com.trolltech.qt.gui.QHeaderView#length() length()}, and {@link com.trolltech.qt.gui.QHeaderView#headerDataChanged(com.trolltech.qt.core.Qt.Orientation, int, int) headerDataChanged()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> sectionCountChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void sectionCountChanged(int oldCount, int newCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionCountChanged_int_int(nativeId(), oldCount, newCount);
    }
    native void __qt_sectionCountChanged_int_int(long __this__nativeId, int oldCount, int newCount);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex)&gt;:<p> This signal is emitted when a section is double-clicked. The section's logical index is specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sectionDoubleClicked = new Signal1<java.lang.Integer>();

    private final void sectionDoubleClicked(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionDoubleClicked_int(nativeId(), logicalIndex);
    }
    native void __qt_sectionDoubleClicked_int(long __this__nativeId, int logicalIndex);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex)&gt;:<p> This signal is emitted when the cursor moves over the section and the left mouse button is pressed. The section's logical index is specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionPressed sectionPressed() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sectionEntered = new Signal1<java.lang.Integer>();

    private final void sectionEntered(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionEntered_int(nativeId(), logicalIndex);
    }
    native void __qt_sectionEntered_int(long __this__nativeId, int logicalIndex);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex)&gt;:<p> This signal is emitted when a section is double-clicked. The section's logical index is specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sectionHandleDoubleClicked = new Signal1<java.lang.Integer>();

    private final void sectionHandleDoubleClicked(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionHandleDoubleClicked_int(nativeId(), logicalIndex);
    }
    native void __qt_sectionHandleDoubleClicked_int(long __this__nativeId, int logicalIndex);
/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex), java.lang.Integer(named: oldVisualIndex), java.lang.Integer(named: newVisualIndex)&gt;:<p> This signal is emitted when a section is moved. The section's logical index is specified by <tt>logicalIndex</tt>, the old index by <tt>oldVisualIndex</tt>, and the new index position by <tt>newVisualIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#moveSection(int, int) moveSection()}. <br></DD></DT>
*/

    public final Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer> sectionMoved = new Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer>();

    private final void sectionMoved(int logicalIndex, int oldVisualIndex, int newVisualIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionMoved_int_int_int(nativeId(), logicalIndex, oldVisualIndex, newVisualIndex);
    }
    native void __qt_sectionMoved_int_int_int(long __this__nativeId, int logicalIndex, int oldVisualIndex, int newVisualIndex);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex)&gt;:<p> This signal is emitted when a section is pressed. The section's logical index is specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> sectionPressed = new Signal1<java.lang.Integer>();

    private final void sectionPressed(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionPressed_int(nativeId(), logicalIndex);
    }
    native void __qt_sectionPressed_int(long __this__nativeId, int logicalIndex);
/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex), java.lang.Integer(named: oldSize), java.lang.Integer(named: newSize)&gt;:<p> This signal is emitted when a section is resized. The section's logical number is specified by <tt>logicalIndex</tt>, the old size by <tt>oldSize</tt>, and the new size by <tt>newSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#resizeSection(int, int) resizeSection()}. <br></DD></DT>
*/

    public final Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer> sectionResized = new Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer>();

    private final void sectionResized(int logicalIndex, int oldSize, int newSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionResized_int_int_int(nativeId(), logicalIndex, oldSize, newSize);
    }
    native void __qt_sectionResized_int_int_int(long __this__nativeId, int logicalIndex, int oldSize, int newSize);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: logicalIndex), com.trolltech.qt.core.Qt$SortOrder(named: order)&gt;:<p> This signal is emitted when the section containing the sort indicator or the order indicated is changed. The section's logical index is specified by <tt>logicalIndex</tt> and the sort order is specified by <tt>order</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setSortIndicator(int, com.trolltech.qt.core.Qt.SortOrder) setSortIndicator()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, com.trolltech.qt.core.Qt.SortOrder> sortIndicatorChanged = new Signal2<java.lang.Integer, com.trolltech.qt.core.Qt.SortOrder>();

    private final void sortIndicatorChanged(int logicalIndex, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sortIndicatorChanged_int_SortOrder(nativeId(), logicalIndex, order.value());
    }
    native void __qt_sortIndicatorChanged_int_SortOrder(long __this__nativeId, int logicalIndex, int order);


/**
Creates a new generic header with the given <tt>orientation</tt> and <tt>parent</tt>.
*/

    public QHeaderView(com.trolltech.qt.core.Qt.Orientation orientation) {
        this(orientation, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Creates a new generic header with the given <tt>orientation</tt> and <tt>parent</tt>.
*/

    public QHeaderView(com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QHeaderView_Orientation_QWidget(orientation.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QHeaderView_Orientation_QWidget(int orientation, long parent);

/**
This property holds whether interactive resizing will be cascaded to the following sections once the section being resized by the user has reached its minimum size. This property only affects sections that have {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Interactive } as their resize mode. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="cascadingSectionResizes")
    @QtBlockedSlot
    public final boolean cascadingSectionResizes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cascadingSectionResizes(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_cascadingSectionResizes(long __this__nativeId);

/**
Returns the number of sections in the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionCountChanged sectionCountChanged() }, and {@link com.trolltech.qt.gui.QHeaderView#length() length()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This property holds the default alignment of the text in each header section.
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultAlignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment defaultAlignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_defaultAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_defaultAlignment(long __this__nativeId);

/**
This property holds the default size of the header sections before resizing.  This property only affects sections that have {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Interactive } or {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Fixed } as their resize mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link QHeaderView#minimumSectionSize() minimumSectionSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultSectionSize")
    @QtBlockedSlot
    public final int defaultSectionSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultSectionSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_defaultSectionSize(long __this__nativeId);

/**
Updates the changed header sections with the given <tt>orientation</tt>, from <tt>logicalFirst</tt> to <tt>logicalLast</tt> inclusive.
*/

    public final void headerDataChanged(com.trolltech.qt.core.Qt.Orientation orientation, int logicalFirst, int logicalLast)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_headerDataChanged_Orientation_int_int(nativeId(), orientation.value(), logicalFirst, logicalLast);
    }
    native void __qt_headerDataChanged_Orientation_int_int(long __this__nativeId, int orientation, int logicalFirst, int logicalLast);

/**
Returns the number of sections in the header that has been hidden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setSectionHidden(int, boolean) setSectionHidden()}, and {@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int hiddenSectionCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hiddenSectionCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_hiddenSectionCount(long __this__nativeId);

/**
Hides the section specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#showSection(int) showSection()}, {@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}, {@link com.trolltech.qt.gui.QHeaderView#hiddenSectionCount() hiddenSectionCount()}, and {@link com.trolltech.qt.gui.QHeaderView#setSectionHidden(int, boolean) setSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void hideSection(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideSection_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native void __qt_hideSection_int(long __this__nativeId, int logicalIndex);

/**
This property holds whether the sections containing selected items are highlighted. By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="highlightSections")
    @QtBlockedSlot
    public final boolean highlightSections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_highlightSections(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_highlightSections(long __this__nativeId);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void initialize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initialize(nativeId());
    }
    @QtBlockedSlot
    native void __qt_initialize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void initializeSections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeSections(nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializeSections(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void initializeSections(int start, int end)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeSections_int_int(nativeId(), start, end);
    }
    @QtBlockedSlot
    native void __qt_initializeSections_int_int(long __this__nativeId, int start, int end);

/**
Returns true if the header is clickable; otherwise returns false. A clickable header could be set up to allow the user to change the representation of the data in the view related to the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isClickable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isClickable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isClickable(long __this__nativeId);

/**
Returns true if the header can be moved by the user; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setMovable(boolean) setMovable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isMovable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMovable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMovable(long __this__nativeId);

/**
Returns true if the section specified by <tt>logicalIndex</tt> is explicitly hidden from the user; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#hideSection(int) hideSection()}, {@link com.trolltech.qt.gui.QHeaderView#showSection(int) showSection()}, {@link com.trolltech.qt.gui.QHeaderView#setSectionHidden(int, boolean) setSectionHidden()}, and {@link com.trolltech.qt.gui.QHeaderView#hiddenSectionCount() hiddenSectionCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSectionHidden(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSectionHidden_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native boolean __qt_isSectionHidden_int(long __this__nativeId, int logicalIndex);

/**
This property holds whether the sort indicator is shown. By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="showSortIndicator")
    @QtBlockedSlot
    public final boolean isSortIndicatorShown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSortIndicatorShown(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSortIndicatorShown(long __this__nativeId);

/**
Returns the length along the orientation of the header. <p><DT><b>See also:</b><br><DD>sizeHint(), {@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link com.trolltech.qt.gui.QHeaderView#offset() offset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int length()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
Returns the logicalIndex for the section at the given <tt>visualIndex</tt> position, or -1 otherwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#visualIndex(int) visualIndex()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionPosition(int) sectionPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalIndex(int visualIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalIndex_int(nativeId(), visualIndex);
    }
    @QtBlockedSlot
    native int __qt_logicalIndex_int(long __this__nativeId, int visualIndex);

/**
Returns the logical index of the section at the position given in <tt>pos</tt>. If the header is horizontal the x-coordinate will be used, otherwise the y-coordinate will be used to find the logical index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionPosition(int) sectionPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalIndexAt(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalIndexAt_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalIndexAt_QPoint(long __this__nativeId, long pos);

/**
Returns the section that covers the given <tt>position</tt> in the viewport. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#visualIndexAt(int) visualIndexAt()}, and {@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalIndexAt(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalIndexAt_int(nativeId(), position);
    }
    @QtBlockedSlot
    native int __qt_logicalIndexAt_int(long __this__nativeId, int position);

/**
Returns the logical index of the section at the given coordinate. If the header is horizontal <tt>x</tt> will be used, otherwise <tt>y</tt> will be used to find the logical index.
*/

    @QtBlockedSlot
    public final int logicalIndexAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalIndexAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native int __qt_logicalIndexAt_int_int(long __this__nativeId, int x, int y);

/**
This property holds the minimum size of the header sections.  The minimum section size is the smallest section size allowed. If the minimum section size is set to -1, QHeaderView will use the maximum of the {@link QApplication#globalStrut() global strut} or the {@link com.trolltech.qt.gui.QWidget#fontMetrics() font metrics} size. <p>This property is honored by all {@link com.trolltech.qt.gui.QHeaderView.ResizeMode resize modes }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link QHeaderView#defaultSectionSize() defaultSectionSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumSectionSize")
    @QtBlockedSlot
    public final int minimumSectionSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSectionSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimumSectionSize(long __this__nativeId);

/**
Moves the section at visual index <tt>from</tt> to occupy visual index <tt>to</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionsMoved() sectionsMoved()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveSection(int from, int to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveSection_int_int(nativeId(), from, to);
    }
    @QtBlockedSlot
    native void __qt_moveSection_int_int(long __this__nativeId, int from, int to);

/**
Returns the offset of the header. this is the header's left-most (or top-most for vertical headers) visible pixel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setOffset(int) setOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int offset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_offset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_offset(long __this__nativeId);

/**
Returns the orientation of the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.Orientation Qt::Orientation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Returns the resize mode that applies to the section specified by the given <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QHeaderView.ResizeMode resizeMode(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QHeaderView.ResizeMode.resolve(__qt_resizeMode_int(nativeId(), logicalIndex));
    }
    @QtBlockedSlot
    native int __qt_resizeMode_int(long __this__nativeId, int logicalIndex);

/**
Resizes the section specified by <tt>logicalIndex</tt> to <tt>size</tt> measured in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionResized sectionResized() }, {@link com.trolltech.qt.gui.QHeaderView#resizeMode(int) resizeMode()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionSize(int) sectionSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resizeSection(int logicalIndex, int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeSection_int_int(nativeId(), logicalIndex, size);
    }
    @QtBlockedSlot
    native void __qt_resizeSection_int_int(long __this__nativeId, int logicalIndex, int size);

/**
Resizes the sections according to their size hints. Normally, you do not have to call this function.
*/

    protected final void resizeSections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeSections(nativeId());
    }
    native void __qt_resizeSections(long __this__nativeId);

/**
Resizes the sections according to the given <tt>mode</tt>, ignoring the current resize mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#resizeMode(int) resizeMode()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionResized sectionResized() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resizeSections(com.trolltech.qt.gui.QHeaderView.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeSections_ResizeMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_resizeSections_ResizeMode(long __this__nativeId, int mode);

/**
Restores the <tt>state</tt> of this header view. This function returns <tt>true</tt> if the state was restored; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#saveState() saveState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean restoreState(com.trolltech.qt.core.QByteArray state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreState_QByteArray(nativeId(), state == null ? 0 : state.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_restoreState_QByteArray(long __this__nativeId, long state);

/**
Saves the current state of this header view. <p>To restore the saved state, pass the return value to {@link com.trolltech.qt.gui.QHeaderView#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveState(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_saveState(long __this__nativeId);

/**
Returns the section position of the given <tt>logicalIndex</tt>, or -1 if the section is hidden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionViewportPosition(int) sectionViewportPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sectionPosition(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionPosition_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native int __qt_sectionPosition_int(long __this__nativeId, int logicalIndex);

/**
Returns the width (or height for vertical headers) of the given <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#length() length()}, {@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link com.trolltech.qt.gui.QHeaderView#defaultSectionSize() defaultSectionSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sectionSize(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionSize_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native int __qt_sectionSize_int(long __this__nativeId, int logicalIndex);

/**
Returns a suitable size hint for the section specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>sizeHint(), {@link com.trolltech.qt.gui.QHeaderView#defaultSectionSize() defaultSectionSize()}, {@link com.trolltech.qt.gui.QHeaderView#minimumSectionSize() minimumSectionSize()}, and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::SizeHintRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sectionSizeHint(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionSizeHint_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native int __qt_sectionSizeHint_int(long __this__nativeId, int logicalIndex);

/**
Returns the section viewport position of the given <tt>logicalIndex</tt>. <p>If the section is hidden, the return value is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sectionPosition(int) sectionPosition()}, and {@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sectionViewportPosition(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionViewportPosition_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native int __qt_sectionViewportPosition_int(long __this__nativeId, int logicalIndex);

/**
This slot is called when sections are removed from the <tt>parent</tt>. <tt>logicalFirst</tt> and <tt>logicalLast</tt> signify where the sections were removed. <p>If only one section is removed, <tt>logicalFirst</tt> and <tt>logicalLast</tt> will be the same.
*/

    protected final void sectionsAboutToBeRemoved(com.trolltech.qt.core.QModelIndex parent, int logicalFirst, int logicalLast)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionsAboutToBeRemoved_QModelIndex_int_int(nativeId(), parent, logicalFirst, logicalLast);
    }
    native void __qt_sectionsAboutToBeRemoved_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int logicalFirst, int logicalLast);

/**
Returns true if sections in the header has been hidden; otherwise returns false; <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setSectionHidden(int, boolean) setSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean sectionsHidden()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionsHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_sectionsHidden(long __this__nativeId);

/**
This slot is called when sections are inserted into the <tt>parent</tt>. <tt>logicalFirst</tt> and <tt>logicalLast</tt> indices signify where the new sections were inserted. <p>If only one section is inserted, <tt>logicalFirst</tt> and <tt>logicalLast</tt> will be the same.
*/

    protected final void sectionsInserted(com.trolltech.qt.core.QModelIndex parent, int logicalFirst, int logicalLast)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sectionsInserted_QModelIndex_int_int(nativeId(), parent, logicalFirst, logicalLast);
    }
    native void __qt_sectionsInserted_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int logicalFirst, int logicalLast);

/**
Returns true if sections in the header has been moved; otherwise returns false; <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#moveSection(int, int) moveSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean sectionsMoved()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionsMoved(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_sectionsMoved(long __this__nativeId);

/**
This property holds whether interactive resizing will be cascaded to the following sections once the section being resized by the user has reached its minimum size. This property only affects sections that have {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Interactive } as their resize mode. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="cascadingSectionResizes")
    @QtBlockedSlot
    public final void setCascadingSectionResizes(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCascadingSectionResizes_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setCascadingSectionResizes_boolean(long __this__nativeId, boolean enable);

/**
If <tt>clickable</tt> is true, the header will respond to single clicks. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#isClickable() isClickable()}, {@link com.trolltech.qt.gui.QHeaderView#sectionClicked sectionClicked() }, {@link com.trolltech.qt.gui.QHeaderView#sectionPressed sectionPressed() }, and {@link com.trolltech.qt.gui.QHeaderView#setSortIndicatorShown(boolean) setSortIndicatorShown()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClickable(boolean clickable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClickable_boolean(nativeId(), clickable);
    }
    @QtBlockedSlot
    native void __qt_setClickable_boolean(long __this__nativeId, boolean clickable);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setDefaultAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setDefaultAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This property holds the default alignment of the text in each header section.
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultAlignment")
    @QtBlockedSlot
    public final void setDefaultAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setDefaultAlignment_Alignment(long __this__nativeId, int alignment);

/**
This property holds the default size of the header sections before resizing.  This property only affects sections that have {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Interactive } or {@link com.trolltech.qt.gui.QHeaderView.ResizeMode Fixed } as their resize mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link QHeaderView#minimumSectionSize() minimumSectionSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultSectionSize")
    @QtBlockedSlot
    public final void setDefaultSectionSize(int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultSectionSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setDefaultSectionSize_int(long __this__nativeId, int size);

/**
This property holds whether the sections containing selected items are highlighted. By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="highlightSections")
    @QtBlockedSlot
    public final void setHighlightSections(boolean highlight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHighlightSections_boolean(nativeId(), highlight);
    }
    @QtBlockedSlot
    native void __qt_setHighlightSections_boolean(long __this__nativeId, boolean highlight);

/**
This property holds the minimum size of the header sections.  The minimum section size is the smallest section size allowed. If the minimum section size is set to -1, QHeaderView will use the maximum of the {@link QApplication#globalStrut() global strut} or the {@link com.trolltech.qt.gui.QWidget#fontMetrics() font metrics} size. <p>This property is honored by all {@link com.trolltech.qt.gui.QHeaderView.ResizeMode resize modes }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}, and {@link QHeaderView#defaultSectionSize() defaultSectionSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumSectionSize")
    @QtBlockedSlot
    public final void setMinimumSectionSize(int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSectionSize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setMinimumSectionSize_int(long __this__nativeId, int size);

/**
If <tt>movable</tt> is true, the header may be moved by the user; otherwise it is fixed in place. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#isMovable() isMovable()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionMoved sectionMoved() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMovable(boolean movable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMovable_boolean(nativeId(), movable);
    }
    @QtBlockedSlot
    native void __qt_setMovable_boolean(long __this__nativeId, boolean movable);

/**
Sets the header's offset to <tt>offset</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#offset() offset()}, and {@link com.trolltech.qt.gui.QHeaderView#length() length()}. <br></DD></DT>
*/

    public final void setOffset(int offset)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffset_int(nativeId(), offset);
    }
    native void __qt_setOffset_int(long __this__nativeId, int offset);

/**
Sets the offset to make the last section visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setOffset(int) setOffset()}, {@link com.trolltech.qt.gui.QHeaderView#sectionPosition(int) sectionPosition()}, and {@link com.trolltech.qt.gui.QHeaderView#setOffsetToSectionPosition(int) setOffsetToSectionPosition()}. <br></DD></DT>
*/

    public final void setOffsetToLastSection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffsetToLastSection(nativeId());
    }
    native void __qt_setOffsetToLastSection(long __this__nativeId);

/**
Sets the offset to the start of the section at the given <tt>visualIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setOffset(int) setOffset()}, and {@link com.trolltech.qt.gui.QHeaderView#sectionPosition(int) sectionPosition()}. <br></DD></DT>
*/

    public final void setOffsetToSectionPosition(int visualIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffsetToSectionPosition_int(nativeId(), visualIndex);
    }
    native void __qt_setOffsetToSectionPosition_int(long __this__nativeId, int visualIndex);

/**
Sets the constraints on how the header can be resized to those described by the given <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#resizeMode(int) resizeMode()}, {@link com.trolltech.qt.gui.QHeaderView#length() length()}, {@link com.trolltech.qt.gui.QHeaderView#sectionResized sectionResized() }, and {@link com.trolltech.qt.gui.QHeaderView#sectionAutoResize sectionAutoResize() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeMode_ResizeMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setResizeMode_ResizeMode(long __this__nativeId, int mode);

/**
This is an overloaded member function, provided for convenience. <p>Sets the constraints on how the section specified by <tt>logicalIndex</tt> in the header can be resized to those described by the given <tt>mode</tt>. <p><b>Note:</b> This setting will be ignored for the last section if the {@link QHeaderView#stretchLastSection() stretchLastSection} property is set to true. This is the default for the horizontal headers provided by {@link com.trolltech.qt.gui.QTreeView QTreeView}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setStretchLastSection(boolean) setStretchLastSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setResizeMode(int logicalIndex, com.trolltech.qt.gui.QHeaderView.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeMode_int_ResizeMode(nativeId(), logicalIndex, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setResizeMode_int_ResizeMode(long __this__nativeId, int logicalIndex, int mode);

/**
If <tt>hide</tt> is true the section specified by <tt>logicalIndex</tt> is hidden; otherwise the section is shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}, and {@link com.trolltech.qt.gui.QHeaderView#hiddenSectionCount() hiddenSectionCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSectionHidden(int logicalIndex, boolean hide)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSectionHidden_int_boolean(nativeId(), logicalIndex, hide);
    }
    @QtBlockedSlot
    native void __qt_setSectionHidden_int_boolean(long __this__nativeId, int logicalIndex, boolean hide);

/**
Sets the sort indicator for the section specified by the given <tt>logicalIndex</tt> in the direction specified by <tt>order</tt>, and removes the sort indicator from any other section that was showing it. <p><tt>logicalIndex</tt> may be -1, in which case no sort indicator will be shown and the model will return to its natural, unsorted order. Note that not all models support this and may even crash in this case. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#sortIndicatorSection() sortIndicatorSection()}, and {@link com.trolltech.qt.gui.QHeaderView#sortIndicatorOrder() sortIndicatorOrder()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSortIndicator(int logicalIndex, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortIndicator_int_SortOrder(nativeId(), logicalIndex, order.value());
    }
    @QtBlockedSlot
    native void __qt_setSortIndicator_int_SortOrder(long __this__nativeId, int logicalIndex, int order);

/**
This property holds whether the sort indicator is shown. By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setClickable(boolean) setClickable()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="showSortIndicator")
    @QtBlockedSlot
    public final void setSortIndicatorShown(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortIndicatorShown_boolean(nativeId(), show);
    }
    @QtBlockedSlot
    native void __qt_setSortIndicatorShown_boolean(long __this__nativeId, boolean show);

/**
This property holds whether the last visible section in the header takes up all the available space. The default value is false. <p><b>Note:</b> The horizontal headers provided by {@link com.trolltech.qt.gui.QTreeView QTreeView} are configured with this property set to true, ensuring that the view does not waste any of the space assigned to it for its header. If this value is set to true, this property will override the resize mode set on the last section in the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="stretchLastSection")
    @QtBlockedSlot
    public final void setStretchLastSection(boolean stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStretchLastSection_boolean(nativeId(), stretch);
    }
    @QtBlockedSlot
    native void __qt_setStretchLastSection_boolean(long __this__nativeId, boolean stretch);

/**
Shows the section specified by <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#hideSection(int) hideSection()}, {@link com.trolltech.qt.gui.QHeaderView#isSectionHidden(int) isSectionHidden()}, {@link com.trolltech.qt.gui.QHeaderView#hiddenSectionCount() hiddenSectionCount()}, and {@link com.trolltech.qt.gui.QHeaderView#setSectionHidden(int, boolean) setSectionHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void showSection(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showSection_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native void __qt_showSection_int(long __this__nativeId, int logicalIndex);

/**
Returns the order for the sort indicator. If no section has a sort indicator the return value of this function is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setSortIndicator(int, com.trolltech.qt.core.Qt.SortOrder) setSortIndicator()}, and {@link com.trolltech.qt.gui.QHeaderView#sortIndicatorSection() sortIndicatorSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.SortOrder sortIndicatorOrder()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.SortOrder.resolve(__qt_sortIndicatorOrder(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sortIndicatorOrder(long __this__nativeId);

/**
Returns the logical index of the section that has a sort indicator. By default this is section 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setSortIndicator(int, com.trolltech.qt.core.Qt.SortOrder) setSortIndicator()}, {@link com.trolltech.qt.gui.QHeaderView#sortIndicatorOrder() sortIndicatorOrder()}, and {@link com.trolltech.qt.gui.QHeaderView#setSortIndicatorShown(boolean) setSortIndicatorShown()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int sortIndicatorSection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sortIndicatorSection(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sortIndicatorSection(long __this__nativeId);

/**
This property holds whether the last visible section in the header takes up all the available space. The default value is false. <p><b>Note:</b> The horizontal headers provided by {@link com.trolltech.qt.gui.QTreeView QTreeView} are configured with this property set to true, ensuring that the view does not waste any of the space assigned to it for its header. If this value is set to true, this property will override the resize mode set on the last section in the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#setResizeMode(com.trolltech.qt.gui.QHeaderView.ResizeMode) setResizeMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="stretchLastSection")
    @QtBlockedSlot
    public final boolean stretchLastSection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stretchLastSection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_stretchLastSection(long __this__nativeId);

/**
Returns the number of sections that are set to resize mode stretch. In views, this can be used to see if the headerview needs to resize the sections when the view's geometry changes. <p><DT><b>See also:</b><br><DD>{@link QHeaderView#stretchLastSection() stretchLastSection}, and {@link com.trolltech.qt.gui.QHeaderView#resizeMode(int) resizeMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int stretchSectionCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stretchSectionCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_stretchSectionCount(long __this__nativeId);

/**
Swaps the section at visual index <tt>first</tt> with the section at visual index <tt>second</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#moveSection(int, int) moveSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void swapSections(int first, int second)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_swapSections_int_int(nativeId(), first, second);
    }
    @QtBlockedSlot
    native void __qt_swapSections_int_int(long __this__nativeId, int first, int second);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected final void updateSection(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateSection_int(nativeId(), logicalIndex);
    }
    native void __qt_updateSection_int(long __this__nativeId, int logicalIndex);

/**
Returns the visual index position of the section specified by the given <tt>logicalIndex</tt>, or -1 otherwise. <p>Hidden sections still have valid visual indexes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#logicalIndex(int) logicalIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int visualIndex(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualIndex_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native int __qt_visualIndex_int(long __this__nativeId, int logicalIndex);

/**
Returns the visual index of the section that covers the given <tt>position</tt> in the viewport. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#logicalIndexAt(com.trolltech.qt.core.QPoint) logicalIndexAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int visualIndexAt(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visualIndexAt_int(nativeId(), position);
    }
    @QtBlockedSlot
    native int __qt_visualIndexAt_int(long __this__nativeId, int position);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void currentChanged(com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex old)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_QModelIndex_QModelIndex(nativeId(), current, old);
    }
    @QtBlockedSlot
    native void __qt_currentChanged_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex current, com.trolltech.qt.core.QModelIndex old);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dataChanged(com.trolltech.qt.core.QModelIndex topLeft, com.trolltech.qt.core.QModelIndex bottomRight)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataChanged_QModelIndex_QModelIndex(nativeId(), topLeft, bottomRight);
    }
    @QtBlockedSlot
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
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

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
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QModelIndex moveCursor(com.trolltech.qt.gui.QAbstractItemView.CursorAction arg__1, com.trolltech.qt.core.Qt.KeyboardModifiers arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_moveCursor_CursorAction_KeyboardModifiers(nativeId(), arg__1.value(), arg__2.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_moveCursor_CursorAction_KeyboardModifiers(long __this__nativeId, int arg__1, int arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
Paints the section specified by the given <tt>logicalIndex</tt>, using the given <tt>painter</tt> and <tt>rect</tt>. <p>Normally, you do not have to call this function.
*/

    @QtBlockedSlot
    protected void paintSection(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintSection_QPainter_QRect_int(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native void __qt_paintSection_QPainter_QRect_int(long __this__nativeId, long painter, long rect, int logicalIndex);

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
Returns the size of the contents of the section specified by the given <tt>logicalIndex</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHeaderView#defaultSectionSize() defaultSectionSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QSize sectionSizeFromContents(int logicalIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionSizeFromContents_int(nativeId(), logicalIndex);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sectionSizeFromContents_int(long __this__nativeId, int logicalIndex);

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
            com.trolltech.qt.GeneratorUtilities.setField(this, QAbstractItemView.class, "__rcModel", model);
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
    protected void setSelection(com.trolltech.qt.core.QRect arg__1, com.trolltech.qt.gui.QItemSelectionModel.SelectionFlags arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelection_QRect_SelectionFlags(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2.value());
    }
    @QtBlockedSlot
    native void __qt_setSelection_QRect_SelectionFlags(long __this__nativeId, long arg__1, int arg__2);

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
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long e);

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

    public static native QHeaderView fromNativePointer(QNativePointer nativePointer);

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

    protected QHeaderView(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QHeaderView. This
method is useful for subclasses when they need a QStyleOptionButton,
but don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionHeader option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
