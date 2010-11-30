package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionToolBoxV2 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionToolBoxV2 inherits {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox} which is used for drawing the tabs in a {@link com.trolltech.qt.gui.QToolBox QToolBox}. <p>An instance of the QStyleOptionToolBoxV2 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ToolBox } and version 2. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox} and QStyleOptionToolBoxV2. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionToolBoxV2 extends com.trolltech.qt.gui.QStyleOptionToolBox
    implements java.lang.Cloneable
{
/**
This enum holds the version of this style option
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 2
*/

        Version(2);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionToolBoxV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 2: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes tab positions relative to other tabs.
*/

    public enum TabPosition implements com.trolltech.qt.QtEnumerator {
/**
 The tab is the first (i.e., top-most) tab in the toolbox.
*/

        Beginning(0),
/**
 The tab is placed in the middle of the toolbox.
*/

        Middle(1),
/**
 The tab is placed at the bottom of the toolbox.
*/

        End(2),
/**
 There is only one tab in the toolbox.
*/

        OnlyOneTab(3);

        TabPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionToolBoxV2$TabPosition constant with the specified <tt>int</tt>.</brief>
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
<brief>Returns the QStyleOptionToolBoxV2$SelectedPosition constant with the specified <tt>int</tt>.</brief>
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
Contsructs a QStyleOptionToolBoxV2 object.
*/

    public QStyleOptionToolBoxV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBoxV2();
    }

    native void __qt_QStyleOptionToolBoxV2();

/**
Constructs a QStyleOptionToolBoxV2 copy of the <tt>other</tt> style option which can be either of the QStyleOptionToolBoxV2 or {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox} types. <p>If the <tt>other</tt> style option's version is 1, the new style option's position value is set to {@link com.trolltech.qt.gui.QStyleOptionToolBoxV2.TabPosition QStyleOptionToolBoxV2::Beginning } and selectedPosition is set to {@link com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition QStyleOptionToolBoxV2::NotAdjacent }. If its version is 2, the positionselectedPosition values are simply copied to the new style option. <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionToolBoxV2(com.trolltech.qt.gui.QStyleOptionToolBox other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBoxV2_QStyleOptionToolBox(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionToolBoxV2_QStyleOptionToolBox(long other);

/**
Constructs a QStyleOptionToolBoxV2 copy of the <tt>other</tt> style option.
*/

    public QStyleOptionToolBoxV2(com.trolltech.qt.gui.QStyleOptionToolBoxV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBoxV2_QStyleOptionToolBoxV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionToolBoxV2_QStyleOptionToolBoxV2(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolBoxV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBoxV2_int(version);
    }

    native void __qt_QStyleOptionToolBoxV2_int(int version);

/**

*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.gui.QStyleOptionToolBoxV2.TabPosition position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_TabPosition(nativeId(), position.value());
    }
    @QtBlockedSlot
    native void __qt_setPosition_TabPosition(long __this__nativeId, int position);

/**
Returns the tab position of this QStyleOptionToolBoxV2.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolBoxV2.TabPosition position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionToolBoxV2.TabPosition.resolve(__qt_position(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
This variable holds the position of the selected tab in relation to this tab. The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition NotAdjacent }, i.e. the tab is not adjacent to a selected tab nor is it the selected tab.
*/

    @QtBlockedSlot
    public final void setSelectedPosition(com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition selectedPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedPosition_SelectedPosition(nativeId(), selectedPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectedPosition_SelectedPosition(long __this__nativeId, int selectedPosition);

/**
This variable holds the position of the selected tab in relation to this tab. The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition NotAdjacent }, i.e. the tab is not adjacent to a selected tab nor is it the selected tab.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition selectedPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionToolBoxV2.SelectedPosition.resolve(__qt_selectedPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectedPosition(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionToolBoxV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolBoxV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionToolBoxV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionToolBoxV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionToolBoxV2 __qt_clone(long __this_nativeId);
}
