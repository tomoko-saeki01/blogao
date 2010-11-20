package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTabWidgetFrame class is used to describe the parameters for drawing the frame around a tab widget. QStyleOptionTabWidgetFrame contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the frame around {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTabWidgetFrame extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabWidgetFrame.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTabWidgetFrame$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabWidgetFrame.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_TabWidgetFrame } for this class).
*/

        Type(13);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTabWidgetFrame$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 13: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionTabWidgetFrame, initializing the members variables to their default values.
*/

    public QStyleOptionTabWidgetFrame(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabWidgetFrame();
    }

    native void __qt_QStyleOptionTabWidgetFrame();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionTabWidgetFrame(com.trolltech.qt.gui.QStyleOptionTabWidgetFrame other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabWidgetFrame_QStyleOptionTabWidgetFrame(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabWidgetFrame_QStyleOptionTabWidgetFrame(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabWidgetFrame(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabWidgetFrame_int(version);
    }

    native void __qt_QStyleOptionTabWidgetFrame_int(int version);

/**
This variable holds the line width for drawing the panel. The default value is 0.
*/

    @QtBlockedSlot
    public final void setLineWidth(int lineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWidth_int(nativeId(), lineWidth);
    }
    @QtBlockedSlot
    native void __qt_setLineWidth_int(long __this__nativeId, int lineWidth);

/**
This variable holds the line width for drawing the panel. The default value is 0.
*/

    @QtBlockedSlot
    public final int lineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineWidth(long __this__nativeId);

/**
This variable holds the size of the right-corner widget. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final void setRightCornerWidgetSize(com.trolltech.qt.core.QSize rightCornerWidgetSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRightCornerWidgetSize_QSize(nativeId(), rightCornerWidgetSize == null ? 0 : rightCornerWidgetSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRightCornerWidgetSize_QSize(long __this__nativeId, long rightCornerWidgetSize);

/**
This variable holds the size of the right-corner widget. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize rightCornerWidgetSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightCornerWidgetSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_rightCornerWidgetSize(long __this__nativeId);

/**
This variable holds the size of the tab bar. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final void setTabBarSize(com.trolltech.qt.core.QSize tabBarSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabBarSize_QSize(nativeId(), tabBarSize == null ? 0 : tabBarSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTabBarSize_QSize(long __this__nativeId, long tabBarSize);

/**
This variable holds the size of the tab bar. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize tabBarSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabBarSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_tabBarSize(long __this__nativeId);

/**
This variable holds the tab shape used to draw the tabs. The default value is {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }.
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
This variable holds the tab shape used to draw the tabs. The default value is {@link com.trolltech.qt.gui.QTabBar.Shape QTabBar::RoundedNorth }.
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
This variable holds the mid-line width for drawing the panel. The mid line width is usually used in drawing sunken or raised frames. The default value is 0.
*/

    @QtBlockedSlot
    public final void setMidLineWidth(int midLineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMidLineWidth_int(nativeId(), midLineWidth);
    }
    @QtBlockedSlot
    native void __qt_setMidLineWidth_int(long __this__nativeId, int midLineWidth);

/**
This variable holds the mid-line width for drawing the panel. The mid line width is usually used in drawing sunken or raised frames. The default value is 0.
*/

    @QtBlockedSlot
    public final int midLineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_midLineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_midLineWidth(long __this__nativeId);

/**
This variable holds the size of the left-corner widget. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final void setLeftCornerWidgetSize(com.trolltech.qt.core.QSize leftCornerWidgetSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeftCornerWidgetSize_QSize(nativeId(), leftCornerWidgetSize == null ? 0 : leftCornerWidgetSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLeftCornerWidgetSize_QSize(long __this__nativeId, long leftCornerWidgetSize);

/**
This variable holds the size of the left-corner widget. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize leftCornerWidgetSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftCornerWidgetSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_leftCornerWidgetSize(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTabWidgetFrame fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabWidgetFrame(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTabWidgetFrame array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTabWidgetFrame clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTabWidgetFrame __qt_clone(long __this_nativeId);
}
