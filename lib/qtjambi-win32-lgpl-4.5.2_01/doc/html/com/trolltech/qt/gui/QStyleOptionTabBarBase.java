package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTabBarBase class is used to describe the base of a tab bar, i. . the part that the tab bar usually overlaps with. QStyleOptionTabBarBase contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the tab bar base. Note that this is only drawn for a standalone {@link com.trolltech.qt.gui.QTabBar QTabBar} (one that isn't part of a {@link com.trolltech.qt.gui.QTabWidget QTabWidget}). <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link QTabBar#drawBase() QTabBar::drawBase()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTabBarBase extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabBarBase.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTabBarBase$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabBarBase.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_TabBarBase } for this class).
*/

        Type(14);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTabBarBase$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 14: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Construct a QStyleOptionTabBarBase, initializing the members vaiables to their default values.
*/

    public QStyleOptionTabBarBase(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBase();
    }

    native void __qt_QStyleOptionTabBarBase();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionTabBarBase(com.trolltech.qt.gui.QStyleOptionTabBarBase other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBase_QStyleOptionTabBarBase(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabBarBase_QStyleOptionTabBarBase(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabBarBase(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBase_int(version);
    }

    native void __qt_QStyleOptionTabBarBase_int(int version);

/**
This variable holds the rectangle containing the selected tab. This rectangle is contained within the tabBarRect. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final void setSelectedTabRect(com.trolltech.qt.core.QRect selectedTabRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedTabRect_QRect(nativeId(), selectedTabRect == null ? 0 : selectedTabRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSelectedTabRect_QRect(long __this__nativeId, long selectedTabRect);

/**
This variable holds the rectangle containing the selected tab. This rectangle is contained within the tabBarRect. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect selectedTabRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedTabRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_selectedTabRect(long __this__nativeId);

/**
This variable holds the shape of the tab bar. The default value is {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }.
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
This variable holds the shape of the tab bar. The default value is {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }.
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
This variable holds the rectangle containing all the tabs. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final void setTabBarRect(com.trolltech.qt.core.QRect tabBarRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabBarRect_QRect(nativeId(), tabBarRect == null ? 0 : tabBarRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTabBarRect_QRect(long __this__nativeId, long tabBarRect);

/**
This variable holds the rectangle containing all the tabs. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect tabBarRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabBarRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_tabBarRect(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTabBarBase fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabBarBase(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTabBarBase array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTabBarBase clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTabBarBase __qt_clone(long __this_nativeId);
}
