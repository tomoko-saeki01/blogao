package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionDockWidget class is used to describe the parameters for drawing a dock widget. QStyleOptionDockWidget contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw graphical elements like {@link com.trolltech.qt.gui.QDockWidget QDockWidget}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionDockWidget extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionDockWidget.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionDockWidget$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionDockWidget.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_DockWidget } for this class).
*/

        Type(10);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionDockWidget$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 10: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionDockWidget, initializing the member variables to their default values.
*/

    public QStyleOptionDockWidget(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidget();
    }

    native void __qt_QStyleOptionDockWidget();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionDockWidget(com.trolltech.qt.gui.QStyleOptionDockWidget other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidget_QStyleOptionDockWidget(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionDockWidget_QStyleOptionDockWidget(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionDockWidget(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidget_int(version);
    }

    native void __qt_QStyleOptionDockWidget_int(int version);

/**
This variable holds the title of the dock window. The default value is an empty string.
*/

    @QtBlockedSlot
    public final void setTitle(java.lang.String title)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setTitle_String(long __this__nativeId, java.lang.String title);

/**
This variable holds the title of the dock window. The default value is an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String title()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
This variable holds whether the dock window is floatable. The default value is true.
*/

    @QtBlockedSlot
    public final void setFloatable(boolean floatable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFloatable_boolean(nativeId(), floatable);
    }
    @QtBlockedSlot
    native void __qt_setFloatable_boolean(long __this__nativeId, boolean floatable);

/**
This variable holds whether the dock window is floatable. The default value is true.
*/

    @QtBlockedSlot
    public final boolean floatable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_floatable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_floatable(long __this__nativeId);

/**
This variable holds whether the dock window is closable. The default value is true.
*/

    @QtBlockedSlot
    public final void setClosable(boolean closable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClosable_boolean(nativeId(), closable);
    }
    @QtBlockedSlot
    native void __qt_setClosable_boolean(long __this__nativeId, boolean closable);

/**
This variable holds whether the dock window is closable. The default value is true.
*/

    @QtBlockedSlot
    public final boolean closable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_closable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_closable(long __this__nativeId);

/**
This variable holds whether the dock window is movable. The default value is false.
*/

    @QtBlockedSlot
    public final void setMovable(boolean movable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMovable_boolean(nativeId(), movable);
    }
    @QtBlockedSlot
    native void __qt_setMovable_boolean(long __this__nativeId, boolean movable);

/**
This variable holds whether the dock window is movable. The default value is false.
*/

    @QtBlockedSlot
    public final boolean movable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_movable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_movable(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionDockWidget fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionDockWidget(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionDockWidget array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionDockWidget clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionDockWidget __qt_clone(long __this_nativeId);
}
