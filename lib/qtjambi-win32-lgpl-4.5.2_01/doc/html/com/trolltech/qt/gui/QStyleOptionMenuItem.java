package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionMenuItem class is used to describe the parameter necessary for drawing a menu item. QStyleOptionMenuItem contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the menu items from {@link com.trolltech.qt.gui.QMenu QMenu}. It is also used for drawing other menu-related widgets. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionMenuItem extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 1
*/

        Version(1);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionMenuItem$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_MenuItem } for this class).
*/

        Type(4);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionMenuItem$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 4: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to indicate whether or not a check mark should be drawn for the item, or even if it should be drawn at all. <p><DT><b>See also:</b><br><DD>checkType, {@link QAction#isCheckable() QAction::checkable}, {@link QAction#isChecked() QAction::checked}, and {@link QActionGroup#isExclusive() QActionGroup::exclusive}. <br></DD></DT>
*/

    public enum CheckType implements com.trolltech.qt.QtEnumerator {
/**
 The item is not checkable.
*/

        NotCheckable(0),
/**
 The item is an exclusive check item (like a radio button).
*/

        Exclusive(1),
/**
 The item is a non-exclusive check item (like a check box).
*/

        NonExclusive(2);

        CheckType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionMenuItem$CheckType constant with the specified <tt>int</tt>.</brief>
*/

        public static CheckType resolve(int value) {
            return (CheckType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotCheckable;
            case 1: return Exclusive;
            case 2: return NonExclusive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum indicates the type of menu item that the structure describes. <p><DT><b>See also:</b><br><DD>menuItemType. <br></DD></DT>
*/

    public enum MenuItemType implements com.trolltech.qt.QtEnumerator {
/**
 A normal menu item.
*/

        Normal(0),
/**
 A menu item that is the default action as specified with {@link com.trolltech.qt.gui.QMenu#defaultAction() QMenu::defaultAction()}.
*/

        DefaultItem(1),
/**
 A menu separator.
*/

        Separator(2),
/**
 Indicates the menu item points to a sub-menu.
*/

        SubMenu(3),
/**
 A popup menu scroller (currently only used on Mac OS X).
*/

        Scroller(4),
/**
 A tear-off handle for the menu.
*/

        TearOff(5),
/**
 The margin of the menu.
*/

        Margin(6),
/**
 The empty area of the menu.
*/

        EmptyArea(7);

        MenuItemType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionMenuItem$MenuItemType constant with the specified <tt>int</tt>.</brief>
*/

        public static MenuItemType resolve(int value) {
            return (MenuItemType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Normal;
            case 1: return DefaultItem;
            case 2: return Separator;
            case 3: return SubMenu;
            case 4: return Scroller;
            case 5: return TearOff;
            case 6: return Margin;
            case 7: return EmptyArea;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionMenuItem, initializing the members variables to their default values.
*/

    public QStyleOptionMenuItem(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionMenuItem();
    }

    native void __qt_QStyleOptionMenuItem();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionMenuItem(com.trolltech.qt.gui.QStyleOptionMenuItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionMenuItem_QStyleOptionMenuItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionMenuItem_QStyleOptionMenuItem(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionMenuItem(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionMenuItem_int(version);
    }

    native void __qt_QStyleOptionMenuItem_int(int version);

/**
This variable holds whether the menu as a whole has checkable items or not. The default value is true. <p>If this option is set to false, then the menu has no checkable items. This makes it possible for GUI styles to save some horizontal space that would normally be used for the check column.
*/

    @QtBlockedSlot
    public final void setMenuHasCheckableItems(boolean menuHasCheckableItems)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuHasCheckableItems_boolean(nativeId(), menuHasCheckableItems);
    }
    @QtBlockedSlot
    native void __qt_setMenuHasCheckableItems_boolean(long __this__nativeId, boolean menuHasCheckableItems);

/**
This variable holds whether the menu as a whole has checkable items or not. The default value is true. <p>If this option is set to false, then the menu has no checkable items. This makes it possible for GUI styles to save some horizontal space that would normally be used for the check column.
*/

    @QtBlockedSlot
    public final boolean menuHasCheckableItems()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuHasCheckableItems(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_menuHasCheckableItems(long __this__nativeId);

/**
This variable holds the rectangle for the entire menu. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final void setMenuRect(com.trolltech.qt.core.QRect menuRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuRect_QRect(nativeId(), menuRect == null ? 0 : menuRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMenuRect_QRect(long __this__nativeId, long menuRect);

/**
This variable holds the rectangle for the entire menu. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect menuRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_menuRect(long __this__nativeId);

/**
This variable holds the type of checkmark of the menu item. The default value is {@link com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType NotCheckable }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType CheckType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCheckType(com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType checkType)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckType_CheckType(nativeId(), checkType.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckType_CheckType(long __this__nativeId, int checkType);

/**
This variable holds the type of checkmark of the menu item. The default value is {@link com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType NotCheckable }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType CheckType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType checkType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionMenuItem.CheckType.resolve(__qt_checkType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_checkType(long __this__nativeId);

/**
This variable holds the icon for the menu item. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds the icon for the menu item. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds whether the menu item is checked or not. The default value is false.
*/

    @QtBlockedSlot
    public final void setChecked(boolean checked)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChecked_boolean(nativeId(), checked);
    }
    @QtBlockedSlot
    native void __qt_setChecked_boolean(long __this__nativeId, boolean checked);

/**
This variable holds whether the menu item is checked or not. The default value is false.
*/

    @QtBlockedSlot
    public final boolean checked()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_checked(long __this__nativeId);

/**
This variable holds the maximum icon width for the icon in the menu item. This can be used for drawing the icon into the correct place or properly aligning items. The variable must be set regardless of whether or not the menu item has an icon. The default value is 0.
*/

    @QtBlockedSlot
    public final void setMaxIconWidth(int maxIconWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxIconWidth_int(nativeId(), maxIconWidth);
    }
    @QtBlockedSlot
    native void __qt_setMaxIconWidth_int(long __this__nativeId, int maxIconWidth);

/**
This variable holds the maximum icon width for the icon in the menu item. This can be used for drawing the icon into the correct place or properly aligning items. The variable must be set regardless of whether or not the menu item has an icon. The default value is 0.
*/

    @QtBlockedSlot
    public final int maxIconWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxIconWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxIconWidth(long __this__nativeId);

/**
This variable holds the tab width for the menu item. The tab width is the distance between the text of the menu item and the shortcut. The default value is 0.
*/

    @QtBlockedSlot
    public final void setTabWidth(int tabWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabWidth_int(nativeId(), tabWidth);
    }
    @QtBlockedSlot
    native void __qt_setTabWidth_int(long __this__nativeId, int tabWidth);

/**
This variable holds the tab width for the menu item. The tab width is the distance between the text of the menu item and the shortcut. The default value is 0.
*/

    @QtBlockedSlot
    public final int tabWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tabWidth(long __this__nativeId);

/**
This variable holds the text for the menu item. Note that the text format is something like this "Menu text<b>\t</b>Shortcut". <p>If the menu item doesn't have a shortcut, it will just contain the menu item's text. The default value is an empty string.
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
This variable holds the text for the menu item. Note that the text format is something like this "Menu text<b>\t</b>Shortcut". <p>If the menu item doesn't have a shortcut, it will just contain the menu item's text. The default value is an empty string.
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
This variable holds the font used for the menu item text. This is the font that should be used for drawing the menu text minus the shortcut. The shortcut is usually drawn using the painter's font. By default, the application's default font is used.
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
This variable holds the font used for the menu item text. This is the font that should be used for drawing the menu text minus the shortcut. The shortcut is usually drawn using the painter's font. By default, the application's default font is used.
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
This variable holds the type of menu item. The default value is {@link com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType Normal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType MenuItemType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMenuItemType(com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType menuItemType)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuItemType_MenuItemType(nativeId(), menuItemType.value());
    }
    @QtBlockedSlot
    native void __qt_setMenuItemType_MenuItemType(long __this__nativeId, int menuItemType);

/**
This variable holds the type of menu item. The default value is {@link com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType Normal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType MenuItemType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType menuItemType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionMenuItem.MenuItemType.resolve(__qt_menuItemType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_menuItemType(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionMenuItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionMenuItem(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionMenuItem array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionMenuItem clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionMenuItem __qt_clone(long __this_nativeId);
}
