package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionFocusRect class is used to describe the parameters for drawing a focus rectangle with {@link com.trolltech.qt.gui.QStyle QStyle}. For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionFocusRect extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFocusRect.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionFocusRect$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFocusRect.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_FocusRect } for this class).
*/

        Type(1);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionFocusRect$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionFocusRect, initializing the members variables to their default values.
*/

    public QStyleOptionFocusRect(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFocusRect();
    }

    native void __qt_QStyleOptionFocusRect();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionFocusRect(com.trolltech.qt.gui.QStyleOptionFocusRect other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFocusRect_QStyleOptionFocusRect(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFocusRect_QStyleOptionFocusRect(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFocusRect(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFocusRect_int(version);
    }

    native void __qt_QStyleOptionFocusRect_int(int version);

/**
This variable holds the background color on which the focus rectangle is being drawn. The default value is an invalid color with the RGB value (0, 0, 0). An invalid color is a color that is not properly set up for the underlying window system.
*/

    @QtBlockedSlot
    public final void setBackgroundColor(com.trolltech.qt.gui.QColor backgroundColor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundColor_QColor(nativeId(), backgroundColor == null ? 0 : backgroundColor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundColor_QColor(long __this__nativeId, long backgroundColor);

/**
This variable holds the background color on which the focus rectangle is being drawn. The default value is an invalid color with the RGB value (0, 0, 0). An invalid color is a color that is not properly set up for the underlying window system.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor backgroundColor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_backgroundColor(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionFocusRect fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFocusRect(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionFocusRect array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionFocusRect clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionFocusRect __qt_clone(long __this_nativeId);
}
