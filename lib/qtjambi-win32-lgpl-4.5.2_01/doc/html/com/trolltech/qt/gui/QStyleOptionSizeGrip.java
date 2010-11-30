package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionSizeGrip class is used to describe the parameter for drawing a size grip. {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton} contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, and {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionSizeGrip extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSizeGrip.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionSizeGrip$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionSizeGrip.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_TabBarBase } for this class).
*/

        Type(983048);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionSizeGrip$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983048: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionSizeGrip.
*/

    public QStyleOptionSizeGrip(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSizeGrip();
    }

    native void __qt_QStyleOptionSizeGrip();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionSizeGrip(com.trolltech.qt.gui.QStyleOptionSizeGrip other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSizeGrip_QStyleOptionSizeGrip(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionSizeGrip_QStyleOptionSizeGrip(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSizeGrip(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionSizeGrip_int(version);
    }

    native void __qt_QStyleOptionSizeGrip_int(int version);

/**
The corner in which the size grip is located.
*/

    @QtBlockedSlot
    public final void setCorner(com.trolltech.qt.core.Qt.Corner corner)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCorner_Corner(nativeId(), corner.value());
    }
    @QtBlockedSlot
    native void __qt_setCorner_Corner(long __this__nativeId, int corner);

/**
The corner in which the size grip is located.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Corner corner()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Corner.resolve(__qt_corner(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_corner(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionSizeGrip fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionSizeGrip(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionSizeGrip array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionSizeGrip clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionSizeGrip __qt_clone(long __this_nativeId);
}
