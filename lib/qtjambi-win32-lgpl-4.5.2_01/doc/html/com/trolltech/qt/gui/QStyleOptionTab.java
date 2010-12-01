package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTab class is used to describe the parameters for drawing a tab bar. The QStyleOptionTab class is used for drawing several built-in Qt widgets including {@link com.trolltech.qt.gui.QTabBar QTabBar} and the panel for {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. Note that to describe the parameters necessary for drawing a frame in Qt 4.1 or above, you must use the {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2} subclass. <p>An instance of the QStyleOptiontabV2 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Tab } and version 1. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both QStyleOptionTab and {@link com.trolltech.qt.gui.QStyleOptionTabV2 QStyleOptionTabV2}. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabV2 QStyleOptionTabV2}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTab extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTab$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
These flags indicate the corner widgets in a tab. <p><DT><b>See also:</b><br><DD>cornerWidgets. <br></DD></DT>
*/

    public enum CornerWidget implements com.trolltech.qt.QtEnumerator {
/**
 There are no corner widgets
*/

        NoCornerWidgets(0),
/**
 Left corner widget
*/

        LeftCornerWidget(1),
/**
 Right corner widget
*/

        RightCornerWidget(2);

        CornerWidget(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionTab$CornerWidgets with the specified <tt>com.trolltech.qt.gui.QStyleOptionTab$CornerWidget[]</tt> QStyleOptionTab$CornerWidget values set.</brief>
*/

        public static CornerWidgets createQFlags(CornerWidget ... values) {
            return new CornerWidgets(values);
        }
/**
<brief>Returns the QStyleOptionTab$CornerWidget constant with the specified <tt>int</tt>.</brief>
*/

        public static CornerWidget resolve(int value) {
            return (CornerWidget) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoCornerWidgets;
            case 1: return LeftCornerWidget;
            case 2: return RightCornerWidget;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class CornerWidgets extends com.trolltech.qt.QFlags<CornerWidget> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionTab-CornerWidgets with the specified <tt>com.trolltech.qt.gui.QStyleOptionTab.CornerWidget[]</tt>. flags set.</brief>
*/

        public CornerWidgets(CornerWidget ... args) { super(args); }
        public CornerWidgets(int value) { setValue(value); }
    }
/**
This enum describes the position of the tab. <p><DT><b>See also:</b><br><DD>position. <br></DD></DT>
*/


    public enum TabPosition implements com.trolltech.qt.QtEnumerator {
/**
 The tab is the first tab in the tab bar.
*/

        Beginning(0),
/**
 The tab is neither the first nor the last tab in the tab bar.
*/

        Middle(1),
/**
 The tab is the last tab in the tab bar.
*/

        End(2),
/**
 The tab is both the first and the last tab in the tab bar.
*/

        OnlyOneTab(3);

        TabPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTab$TabPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static TabPosition resolve(int value) {
            return (TabPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Beginning;
            case 1: return Middle;
            case 2: return End;
            case 3: return OnlyOneTab;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the position of the selected tab. Some styles need to draw a tab differently depending on whether or not it is adjacent to the selected tab. <p><DT><b>See also:</b><br><DD>selectedPosition. <br></DD></DT>
*/

    public enum SelectedPosition implements com.trolltech.qt.QtEnumerator {
/**
 The tab is not adjacent to a selected tab (or is the selected tab).
*/

        NotAdjacent(0),
/**
 The next tab (typically the tab on the right) is selected.
*/

        NextIsSelected(1),
/**
 The previous tab (typically the tab on the left) is selected.
*/

        PreviousIsSelected(2);

        SelectedPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTab$SelectedPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectedPosition resolve(int value) {
            return (SelectedPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotAdjacent;
            case 1: return NextIsSelected;
            case 2: return PreviousIsSelected;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Tab } for this class).
*/

        Type(3);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTab$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 3: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionTab object, initializing the members variables to their default values.
*/

    public QStyleOptionTab(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTab();
    }

    native void __qt_QStyleOptionTab();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionTab(com.trolltech.qt.gui.QStyleOptionTab other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTab_QStyleOptionTab(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTab_QStyleOptionTab(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTab(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTab_int(version);
    }

    native void __qt_QStyleOptionTab_int(int version);

/**
This variable holds which row the tab is currently in. The default value is 0, indicating the front row. Currently this property can only be 0.
*/

    @QtBlockedSlot
    public final void setRow(int row)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native void __qt_setRow_int(long __this__nativeId, int row);

/**
This variable holds which row the tab is currently in. The default value is 0, indicating the front row. Currently this property can only be 0.
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

*/

    @QtBlockedSlot
    public final void setCornerWidgets(com.trolltech.qt.gui.QStyleOptionTab.CornerWidget ... cornerWidgets) {
        this.setCornerWidgets(new com.trolltech.qt.gui.QStyleOptionTab.CornerWidgets(cornerWidgets));
    }
/**
This variable holds an OR combination of {@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget CornerWidget } values indicating the corner widgets of the tab bar. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget NoCornerWidgets }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget CornerWidget }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCornerWidgets(com.trolltech.qt.gui.QStyleOptionTab.CornerWidgets cornerWidgets)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCornerWidgets_CornerWidgets(nativeId(), cornerWidgets.value());
    }
    @QtBlockedSlot
    native void __qt_setCornerWidgets_CornerWidgets(long __this__nativeId, int cornerWidgets);

/**
This variable holds an OR combination of {@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget CornerWidget } values indicating the corner widgets of the tab bar. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget NoCornerWidgets }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab.CornerWidget CornerWidget }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionTab.CornerWidgets cornerWidgets()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionTab.CornerWidgets(__qt_cornerWidgets(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_cornerWidgets(long __this__nativeId);

/**
This variable holds the position of the tab in the tab bar. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.TabPosition Beginning }, i.e. the tab is the first tab in the tab bar.
*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.gui.QStyleOptionTab.TabPosition position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_TabPosition(nativeId(), position.value());
    }
    @QtBlockedSlot
    native void __qt_setPosition_TabPosition(long __this__nativeId, int position);

/**
This variable holds the position of the tab in the tab bar. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.TabPosition Beginning }, i.e. the tab is the first tab in the tab bar.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionTab.TabPosition position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionTab.TabPosition.resolve(__qt_position(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
This variable holds the icon for the tab. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds the icon for the tab. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds the tab shape used to draw the tab; by default {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::Shape }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShape(com.trolltech.qt.gui.QTabBar.Shape shape)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShape_Shape(nativeId(), shape.value());
    }
    @QtBlockedSlot
    native void __qt_setShape_Shape(long __this__nativeId, int shape);

/**
This variable holds the tab shape used to draw the tab; by default {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::Shape }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabBar.Shape shape()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabBar.Shape.resolve(__qt_shape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shape(long __this__nativeId);

/**
This variable holds the text of the tab. The default value is an empty string.
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
This variable holds the text of the tab. The default value is an empty string.
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
This variable holds the position of the selected tab in relation to this tab. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.SelectedPosition NotAdjacent }, i.e. the tab is not adjacent to a selected tab nor is it the selected tab.
*/

    @QtBlockedSlot
    public final void setSelectedPosition(com.trolltech.qt.gui.QStyleOptionTab.SelectedPosition selectedPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedPosition_SelectedPosition(nativeId(), selectedPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectedPosition_SelectedPosition(long __this__nativeId, int selectedPosition);

/**
This variable holds the position of the selected tab in relation to this tab. The default value is {@link com.trolltech.qt.gui.QStyleOptionTab.SelectedPosition NotAdjacent }, i.e. the tab is not adjacent to a selected tab nor is it the selected tab.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionTab.SelectedPosition selectedPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionTab.SelectedPosition.resolve(__qt_selectedPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectedPosition(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTab fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTab(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTab array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTab clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTab __qt_clone(long __this_nativeId);
}
