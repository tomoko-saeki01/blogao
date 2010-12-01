package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QListWidgetItem class provides an item for use with the {@link com.trolltech.qt.gui.QListWidget QListWidget} item view class. QListWidgetItem is used to represent items in a list provided by the {@link com.trolltech.qt.gui.QListWidget QListWidget} class. Each item can hold several pieces of information, and will display these appropriately. <p>The item view convenience classes use a classic item-based interface rather than a pure model/view approach. For a more flexible list view widget, consider using the {@link com.trolltech.qt.gui.QListView QListView} class with a standard model. <p>List items can be automatically inserted into a list when they are constructed by specifying the list widget: <pre class="snippet">
        new QListWidgetItem(tr("Hazel"), listWidget);
    </pre> They can also be created without a parent widget, and later inserted into a list (see {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}). <p>List items are typically used to display {@link com.trolltech.qt.gui.QListWidgetItem#text() text()} and an {@link com.trolltech.qt.gui.QListWidgetItem#icon() icon()}. These are set with the {@link com.trolltech.qt.gui.QListWidgetItem#setText(java.lang.String) setText()} and {@link com.trolltech.qt.gui.QListWidgetItem#setIcon(com.trolltech.qt.gui.QIcon) setIcon()} functions. The appearance of the text can be customized with {@link com.trolltech.qt.gui.QListWidgetItem#setFont(com.trolltech.qt.gui.QFont) setFont()}, {@link com.trolltech.qt.gui.QListWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. Text in list items can be aligned using the {@link com.trolltech.qt.gui.QListWidgetItem#setTextAlignment(int) setTextAlignment()} function. Tooltips, status tips and "What's This?" help can be added to list items with {@link com.trolltech.qt.gui.QListWidgetItem#setToolTip(java.lang.String) setToolTip()}, {@link com.trolltech.qt.gui.QListWidgetItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <p>By default, items are enabled, selectable, checkable, and can be the source of a drag and drop operation. Each item's flags can be changed by calling {@link com.trolltech.qt.gui.QListWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()} with the appropriate value (see Qt::ItemFlags). Checkable items can be checked, unchecked and partially checked with the {@link com.trolltech.qt.gui.QListWidgetItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()} function. The corresponding {@link com.trolltech.qt.gui.QListWidgetItem#checkState() checkState()} function indicates what check state the item currently has. <p>The {@link com.trolltech.qt.gui.QListWidgetItem#isHidden() isHidden()} function can be used to determine whether the item is hidden. Items can be hidden with {@link com.trolltech.qt.gui.QListWidgetItem#setHidden(boolean) setHidden()}.<a name="subclassing"><h2>Subclassing</h2> When subclassing QListWidgetItem to provide custom items, it is possible to define new types for them so that they can be distinguished from standard items. The constructors for subclasses that require this feature need to call the base class constructor with a new type value equal to or greater than {@link com.trolltech.qt.gui.QListWidgetItem.ItemType UserType }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidget QListWidget}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}, and {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QListWidgetItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types that are used to describe list widget items. You can define new user types in {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem} subclasses to ensure that custom items are treated specially. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public enum ItemType implements com.trolltech.qt.QtEnumerator {
/**
 The default type for list widget items.
*/

        Type(0),
/**
 The minimum value for custom types. Values below {@link com.trolltech.qt.gui.QListWidgetItem.ItemType UserType } are reserved by Qt.
*/

        UserType(1000);

        ItemType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QListWidgetItem$ItemType constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemType resolve(int value) {
            return (ItemType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Type;
            case 1000: return UserType;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QListWidget view) {
        this(view, (int)0);
    }

/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem() {
        this((com.trolltech.qt.gui.QListWidget)null, (int)0);
    }
/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QListWidget view, int type){
        super((QPrivateConstructor)null);
        __qt_QListWidgetItem_QListWidget_int(view == null ? 0 : view.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QListWidgetItem_QListWidget_int(long view, int type);


/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>icon</tt>, <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text, com.trolltech.qt.gui.QListWidget view) {
        this(icon, text, view, (int)0);
    }

/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>icon</tt>, <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text) {
        this(icon, text, (com.trolltech.qt.gui.QListWidget)null, (int)0);
    }
/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>icon</tt>, <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text, com.trolltech.qt.gui.QListWidget view, int type){
        super((QPrivateConstructor)null);
        __qt_QListWidgetItem_QIcon_String_QListWidget_int(icon == null ? 0 : icon.nativeId(), text, view == null ? 0 : view.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QListWidgetItem_QIcon_String_QListWidget_int(long icon, java.lang.String text, long view, int type);

/**
Constructs a copy of <tt>other</tt>. Note that {@link com.trolltech.qt.gui.QListWidgetItem#type() type()} and {@link com.trolltech.qt.gui.QListWidgetItem#listWidget() listWidget()} are not copied. <p>This function is useful when reimplementing {@link com.trolltech.qt.gui.QListWidgetItem#clone() clone()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#data(int) data()}, and {@link com.trolltech.qt.gui.QListWidgetItem#flags() flags()}. <br></DD></DT>
*/

    public QListWidgetItem(com.trolltech.qt.gui.QListWidgetItem other){
        super((QPrivateConstructor)null);
        __qt_QListWidgetItem_QListWidgetItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QListWidgetItem_QListWidgetItem(long other);


/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(java.lang.String text, com.trolltech.qt.gui.QListWidget view) {
        this(text, view, (int)0);
    }

/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QListWidget)null, (int)0);
    }
/**
Constructs an empty list widget item of the specified <tt>type</tt> with the given <tt>text</tt> and <tt>parent</tt>. If the parent is not specified, the item will need to be inserted into a list widget with {@link com.trolltech.qt.gui.QListWidget#insertItem(int, com.trolltech.qt.gui.QListWidgetItem) QListWidget::insertItem()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#type() type()}. <br></DD></DT>
*/

    public QListWidgetItem(java.lang.String text, com.trolltech.qt.gui.QListWidget view, int type){
        super((QPrivateConstructor)null);
        __qt_QListWidgetItem_String_QListWidget_int(text, view == null ? 0 : view.nativeId(), type);
        this.disableGarbageCollection();
    }

    native void __qt_QListWidgetItem_String_QListWidget_int(java.lang.String text, long view, int type);

/**
Returns the brush used to display the list item's background. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and {@link com.trolltech.qt.gui.QListWidgetItem#foreground() foreground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background(long __this__nativeId);

/**
Returns the checked state of the list item (see {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.gui.QListWidgetItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CheckState checkState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CheckState.resolve(__qt_checkState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_checkState(long __this__nativeId);

/**
Returns the item flags for this item (see Qt.:ItemFlags). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ItemFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
Returns the font used to display this list item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the brush used to display the list item's foreground (e. . text). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QListWidgetItem#background() background()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush foreground()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_foreground(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_foreground(long __this__nativeId);

/**
Returns the list item's icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
Returns true if the item is hidden, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setHidden(boolean) setHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isHidden()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHidden(long __this__nativeId);

/**
Returns true if the item is selected, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setSelected(boolean) setSelected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSelected()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelected(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelected(long __this__nativeId);

/**
Returns the list widget that contains the item.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QListWidget listWidget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_listWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidget __qt_listWidget(long __this__nativeId);

/**
<brief>Writes thisQListWidgetItem
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long out);

/**
<brief>Reads a QListWidgetItem
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long in);

/**
Sets the background brush of the list item to the given <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#background() background()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_QBrush(long __this__nativeId, long brush);

/**
Sets the check state of the list item to <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#checkState() checkState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckState(com.trolltech.qt.core.Qt.CheckState state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckState_CheckState(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckState_CheckState(long __this__nativeId, int state);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.Qt.ItemFlag ... flags) {
        this.setFlags(new com.trolltech.qt.core.Qt.ItemFlags(flags));
    }
/**
Sets the item flags for the list item to <tt>flags</tt> (see Qt.:ItemFlags). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.Qt.ItemFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_ItemFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_ItemFlags(long __this__nativeId, int flags);

/**
Sets the font used when painting the item to the given <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
Sets the foreground brush of the list item to the given <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#foreground() foreground()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForeground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForeground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setForeground_QBrush(long __this__nativeId, long brush);

/**
Hides the item if <tt>hide</tt> is true, otherwise shows the item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#isHidden() isHidden()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHidden(boolean hide)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHidden_boolean(nativeId(), hide);
    }
    @QtBlockedSlot
    native void __qt_setHidden_boolean(long __this__nativeId, boolean hide);

/**
Sets the icon for the list item to the given <tt>icon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#icon() icon()}, {@link com.trolltech.qt.gui.QListWidgetItem#text() text()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
Sets the selected state of the item to <tt>select</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#isSelected() isSelected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelected(boolean select)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelected_boolean(nativeId(), select);
    }
    @QtBlockedSlot
    native void __qt_setSelected_boolean(long __this__nativeId, boolean select);

/**
Sets the size hint for the list item to be <tt>size</tt>. If no size hint is set, the item delegate will compute the size hint based on the item data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#sizeHint() sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizeHint(com.trolltech.qt.core.QSize size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeHint_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizeHint_QSize(long __this__nativeId, long size);

/**
Sets the status tip for the list item to the text specified by <tt>statusTip</tt>. {@link com.trolltech.qt.gui.QListWidget QListWidget} mouse tracking needs to be enabled for this feature to work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#statusTip() statusTip()}, {@link com.trolltech.qt.gui.QListWidgetItem#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatusTip(java.lang.String statusTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_String(nativeId(), statusTip);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_String(long __this__nativeId, java.lang.String statusTip);

/**
Sets the text for the list widget item's to the given <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
Sets the list item's text alignment to <tt>alignment</tt> (see {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#textAlignment() textAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextAlignment(int alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextAlignment_int(nativeId(), alignment);
    }
    @QtBlockedSlot
    native void __qt_setTextAlignment_int(long __this__nativeId, int alignment);

/**
Sets the tooltip for the list item to the text specified by <tt>toolTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#toolTip() toolTip()}, {@link com.trolltech.qt.gui.QListWidgetItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolTip(java.lang.String toolTip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), toolTip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String toolTip);

/**
Sets the "What's This?" help for the list item to the text specified by <tt>whatsThis</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#whatsThis() whatsThis()}, {@link com.trolltech.qt.gui.QListWidgetItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#setToolTip(java.lang.String) setToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String whatsThis)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), whatsThis);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String whatsThis);

/**
Returns the size hint set for the list item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setSizeHint(com.trolltech.qt.core.QSize) setSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeHint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
Returns the list item's status tip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setStatusTip(java.lang.String) setStatusTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String statusTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip(long __this__nativeId);

/**
Returns the list item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Returns the text alignment for the list item (see {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setTextAlignment(int) setTextAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int textAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textAlignment(nativeId());
    }
    @QtBlockedSlot
    native int __qt_textAlignment(long __this__nativeId);

/**
Returns the list item's tooltip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setToolTip(java.lang.String) setToolTip()}, {@link com.trolltech.qt.gui.QListWidgetItem#statusTip() statusTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#whatsThis() whatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
Returns the type passed to the QListWidgetItem constructor.
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the list item's "What's This?" help text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}, {@link com.trolltech.qt.gui.QListWidgetItem#statusTip() statusTip()}, and {@link com.trolltech.qt.gui.QListWidgetItem#toolTip() toolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QListWidgetItem clone()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QListWidgetItem __qt_clone(long __this__nativeId);

/**
This function returns the item's data for a given <tt>role</tt> (see {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }). Reimplement this function if you need extra roles or special behavior for certain roles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#setData(int, java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object data(int role)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_int(nativeId(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_int(long __this__nativeId, int role);

/**
Returns true if this item's text is less then <tt>other</tt> item's text; otherwise returns false.
*/

    @QtBlockedSlot
    public boolean operator_less(com.trolltech.qt.gui.QListWidgetItem other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QListWidgetItem(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QListWidgetItem(long __this__nativeId, long other);

/**
Reads the item from stream <tt>in</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#write(com.trolltech.qt.core.QDataStream) write()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void read(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_read_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_read_QDataStream(long __this__nativeId, long in);

/**
This function sets the data for a given <tt>role</tt> to the given <tt>value</tt> (see {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }). Reimplement this function if you need extra roles or special behavior for certain roles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.gui.QListWidgetItem#data(int) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setData(int role, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_int_Object(nativeId(), role, value);
    }
    @QtBlockedSlot
    native void __qt_setData_int_Object(long __this__nativeId, int role, java.lang.Object value);

/**
Writes the item to stream <tt>out</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QListWidgetItem#read(com.trolltech.qt.core.QDataStream) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void write(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_write_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_write_QDataStream(long __this__nativeId, long out);

/**
@exclude
*/

    public static native QListWidgetItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QListWidgetItem(QPrivateConstructor p) { super(p); } 
}
