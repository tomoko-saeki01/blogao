package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionRubberBand class is used to describe the parameters needed for drawing a rubber band. QStyleOptionRubberBand contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QRubberBand QRubberBand}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link com.trolltech.qt.gui.QRubberBand QRubberBand}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionRubberBand extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionRubberBand.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionRubberBand$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionRubberBand.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_RubberBand } for this class).
*/

        Type(15);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionRubberBand$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 15: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a QStyleOptionRubberBand, initializing the members variables to their default values.
*/

    public QStyleOptionRubberBand(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionRubberBand();
    }

    native void __qt_QStyleOptionRubberBand();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionRubberBand(com.trolltech.qt.gui.QStyleOptionRubberBand other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionRubberBand_QStyleOptionRubberBand(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionRubberBand_QStyleOptionRubberBand(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionRubberBand(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionRubberBand_int(version);
    }

    native void __qt_QStyleOptionRubberBand_int(int version);

/**
This variable holds whether the rubber band is required to be drawn in an opaque style. The default value is true.
*/

    @QtBlockedSlot
    public final void setOpaque(boolean opaque)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpaque_boolean(nativeId(), opaque);
    }
    @QtBlockedSlot
    native void __qt_setOpaque_boolean(long __this__nativeId, boolean opaque);

/**
This variable holds whether the rubber band is required to be drawn in an opaque style. The default value is true.
*/

    @QtBlockedSlot
    public final boolean opaque()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opaque(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_opaque(long __this__nativeId);

/**
This variable holds the shape of the rubber band. The default shape is {@link com.trolltech.qt.gui.QRubberBand.Shape QRubberBand::Line }.
*/

    @QtBlockedSlot
    public final void setShape(com.trolltech.qt.gui.QRubberBand.Shape shape)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShape_Shape(nativeId(), shape.value());
    }
    @QtBlockedSlot
    native void __qt_setShape_Shape(long __this__nativeId, int shape);

/**
This variable holds the shape of the rubber band. The default shape is {@link com.trolltech.qt.gui.QRubberBand.Shape QRubberBand::Line }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRubberBand.Shape shape()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QRubberBand.Shape.resolve(__qt_shape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shape(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionRubberBand fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionRubberBand(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionRubberBand array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionRubberBand clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionRubberBand __qt_clone(long __this_nativeId);
}
