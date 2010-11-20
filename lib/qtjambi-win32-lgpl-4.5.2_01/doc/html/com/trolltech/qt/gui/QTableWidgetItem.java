package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTableWidgetItem class provides an item for use with the {@link com.trolltech.qt.gui.QTableWidget QTableWidget} class. Table items are used to hold pieces of information for table widgets. Items usually contain text, icons, or checkboxes <p>The QTableWidgetItem class is a convenience class that replaces the <tt>QTableItem</tt> class in Qt 3. It provides an item for use with the {@link com.trolltech.qt.gui.QTableWidget QTableWidget} class. <p>Top-level items are constructed without a parent then inserted at the position specified by a pair of row and column numbers: <pre class="snippet">
        QTableWidgetItem newItem =
            new QTableWidgetItem(String.valueOf(Math.pow(row, column+1)));
        tableWidget.setItem(row, column, newItem);
    </pre> Each item can have its own background brush which is set with the {@link com.trolltech.qt.gui.QTableWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()} function. The current background brush can be found with {@link com.trolltech.qt.gui.QTableWidgetItem#background() background()}. The text label for each item can be rendered with its own font and brush. These are specified with the {@link com.trolltech.qt.gui.QTableWidgetItem#setFont(com.trolltech.qt.gui.QFont) setFont()} and {@link com.trolltech.qt.gui.QTableWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()} functions, and read with {@link com.trolltech.qt.gui.QTableWidgetItem#font() font()} and {@link com.trolltech.qt.gui.QTableWidgetItem#foreground() foreground()}. <p>By default, items are enabled, editable, selectable, checkable, and can be used both as the source of a drag and drop operation and as a drop target. Each item's flags can be changed by calling {@link com.trolltech.qt.gui.QTableWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()} with the appropriate value (see Qt::ItemFlags). Checkable items can be checked and unchecked with the {@link com.trolltech.qt.gui.QTableWidgetItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()} function. The corresponding {@link com.trolltech.qt.gui.QTableWidgetItem#checkState() checkState()} function indicates whether the item is currently checked.<a name="subclassing"><h2>Subclassing</h2> When subclassing QTableWidgetItem to provide custom items, it is possible to define new types for them so that they can be distinguished from standard items. The constructors for subclasses that require this feature need to call the base class constructor with a new type value equal to or greater than {@link com.trolltech.qt.gui.QTableWidgetItem.ItemType UserType }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidget QTableWidget}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem}, and {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTableWidgetItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types that are used to describe table widget items. You can define new user types in {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem} subclasses to ensure that custom items are treated specially. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public enum ItemType implements com.trolltech.qt.QtEnumerator {
/**
 The default type for table widget items.
*/

        Type(0),
/**
 The minimum value for custom types. Values below {@link com.trolltech.qt.gui.QTableWidgetItem.ItemType UserType } are reserved by Qt.
*/

        UserType(1000);

        ItemType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTableWidgetItem$ItemType constant with the specified <tt>int</tt>.</brief>
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
Constructs a table item with the given <tt>icon</tt> and <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text) {
        this(icon, text, (int)0);
    }
/**
Constructs a table item with the given <tt>icon</tt> and <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text, int type){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetItem_QIcon_String_int(icon == null ? 0 : icon.nativeId(), text, type);
    }

    native void __qt_QTableWidgetItem_QIcon_String_int(long icon, java.lang.String text, int type);


/**
Constructs a table item with the given <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem(java.lang.String text) {
        this(text, (int)0);
    }
/**
Constructs a table item with the given <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem(java.lang.String text, int type){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetItem_String_int(text, type);
    }

    native void __qt_QTableWidgetItem_String_int(java.lang.String text, int type);

/**
Constructs a copy of <tt>other</tt>. Note that {@link com.trolltech.qt.gui.QTableWidgetItem#type() type()} and {@link com.trolltech.qt.gui.QTableWidgetItem#tableWidget() tableWidget()} are not copied. <p>This function is useful when reimplementing {@link com.trolltech.qt.gui.QTableWidgetItem#clone() clone()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#data(int) data()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#flags() flags()}. <br></DD></DT>
*/

    public QTableWidgetItem(com.trolltech.qt.gui.QTableWidgetItem other){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetItem_QTableWidgetItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QTableWidgetItem_QTableWidgetItem(long other);


/**
Constructs a table item of the specified <tt>type</tt> that does not belong to any table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem() {
        this((int)0);
    }
/**
Constructs a table item of the specified <tt>type</tt> that does not belong to any table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#type() type()}. <br></DD></DT>
*/

    public QTableWidgetItem(int type){
        super((QPrivateConstructor)null);
        __qt_QTableWidgetItem_int(type);
    }

    native void __qt_QTableWidgetItem_int(int type);

/**
Returns the brush used to render the item's background. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#foreground() foreground()}. <br></DD></DT>
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
Returns the checked state of the table item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setCheckState(com.trolltech.qt.core.Qt.CheckState) setCheckState()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#flags() flags()}. <br></DD></DT>
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
Returns the column of the item in the table. If the item is not in a table, this function will return -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#row() row()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int column()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_column(nativeId());
    }
    @QtBlockedSlot
    native int __qt_column(long __this__nativeId);

/**
Returns the flags used to describe the item. These determine whether the item can be checked, edited, and selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setFlags(com.trolltech.qt.core.Qt.ItemFlag[]) setFlags()}. <br></DD></DT>
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
Returns the font used to render the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
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
Returns the brush used to render the item's foreground (e. . text). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#background() background()}. <br></DD></DT>
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
Returns the item's icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
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
Returns true if the item is selected, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setSelected(boolean) setSelected()}. <br></DD></DT>
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
<brief>Writes thisQTableWidgetItem
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
<brief>Reads a QTableWidgetItem
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
Returns the row of the item in the table. If the item is not in a table, this function will return -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#column() column()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int row()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_row(nativeId());
    }
    @QtBlockedSlot
    native int __qt_row(long __this__nativeId);

/**
Sets the item's background brush to the specified <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#background() background()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
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
Sets the check state of the table item to be <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#checkState() checkState()}. <br></DD></DT>
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
Sets the flags for the item to the given <tt>flags</tt>. These determine whether the item can be selected or modified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#flags() flags()}. <br></DD></DT>
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
Sets the font used to display the item's text to the given <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#font() font()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
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
Sets the item's foreground brush to the specified <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#foreground() foreground()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. <br></DD></DT>
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
Sets the item's icon to the <tt>icon</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#icon() icon()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setText(java.lang.String) setText()}, and {@link QAbstractItemView#iconSize() iconSize}. <br></DD></DT>
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
Sets the selected state of the item to <tt>select</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#isSelected() isSelected()}. <br></DD></DT>
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
Sets the size hint for the table item to be <tt>size</tt>. If no size hint is set, the item delegate will compute the size hint based on the item data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#sizeHint() sizeHint()}. <br></DD></DT>
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
Sets the status tip for the table item to the text specified by <tt>statusTip</tt>. {@link com.trolltech.qt.gui.QTableWidget QTableWidget} mouse tracking needs to be enabled for this feature to work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#statusTip() statusTip()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
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
Sets the item's text to the <tt>text</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#text() text()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
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
Sets the text alignment for the item's text to the <tt>alignment</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#textAlignment() textAlignment()}, and Qt::Alignment. <br></DD></DT>
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
Sets the item's tooltip to the string specified by <tt>toolTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#toolTip() toolTip()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
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
Sets the item's "What's This?" help to the string specified by <tt>whatsThis</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#whatsThis() whatsThis()}, {@link com.trolltech.qt.gui.QTableWidgetItem#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QTableWidgetItem#setToolTip(java.lang.String) setToolTip()}. <br></DD></DT>
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
Returns the size hint set for the table item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setSizeHint(com.trolltech.qt.core.QSize) setSizeHint()}. <br></DD></DT>
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
Returns the item's status tip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setStatusTip(java.lang.String) setStatusTip()}. <br></DD></DT>
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
Returns the table widget that contains the item.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTableWidget tableWidget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidget __qt_tableWidget(long __this__nativeId);

/**
Returns the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setText(java.lang.String) setText()}. <br></DD></DT>
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
Returns the text alignment for the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setTextAlignment(int) setTextAlignment()}, and Qt::Alignment. <br></DD></DT>
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
Returns the item's tooltip. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setToolTip(java.lang.String) setToolTip()}. <br></DD></DT>
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
Returns the type passed to the QTableWidgetItem constructor.
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
Returns the item's "What's This?" help. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setWhatsThis(java.lang.String) setWhatsThis()}. <br></DD></DT>
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
    public com.trolltech.qt.gui.QTableWidgetItem clone()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTableWidgetItem __qt_clone(long __this__nativeId);

/**
Returns the item's data for the given <tt>role</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#setData(int, java.lang.Object) setData()}. <br></DD></DT>
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
Returns true if the item is less than the <tt>other</tt> item; otherwise returns false.
*/

    @QtBlockedSlot
    public boolean operator_less(com.trolltech.qt.gui.QTableWidgetItem other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTableWidgetItem(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTableWidgetItem(long __this__nativeId, long other);

/**
Reads the item from stream <tt>in</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#write(com.trolltech.qt.core.QDataStream) write()}. <br></DD></DT>
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
Sets the item's data for the given <tt>role</tt> to the specified <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }, and {@link com.trolltech.qt.gui.QTableWidgetItem#data(int) data()}. <br></DD></DT>
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
Writes the item to stream <tt>out</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTableWidgetItem#read(com.trolltech.qt.core.QDataStream) read()}. <br></DD></DT>
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

    public static native QTableWidgetItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTableWidgetItem(QPrivateConstructor p) { super(p); } 
}
