package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionComplex class is used to hold parameters that are common to all complex controls. This class is not used on its own. Instead it is used to derive other complex control options, for example {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider} and {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionComplex extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionComplex.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionComplex$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionComplex.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Complex } for this class).
*/

        Type(983040);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionComplex$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983040: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionComplex(com.trolltech.qt.gui.QStyleOptionComplex other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionComplex_QStyleOptionComplex(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionComplex_QStyleOptionComplex(long other);


/**
Constructs a QStyleOptionComplex of the specified <tt>type</tt> and <tt>version</tt>, initializing the member variables to their default values. This constructor is usually called by subclasses.
*/

    public QStyleOptionComplex(int version) {
        this(version, (int)983040);
    }

/**
Constructs a QStyleOptionComplex of the specified <tt>type</tt> and <tt>version</tt>, initializing the member variables to their default values. This constructor is usually called by subclasses.
*/

    public QStyleOptionComplex() {
        this((int)1, (int)983040);
    }
/**
Constructs a QStyleOptionComplex of the specified <tt>type</tt> and <tt>version</tt>, initializing the member variables to their default values. This constructor is usually called by subclasses.
*/

    public QStyleOptionComplex(int version, int type){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionComplex_int_int(version, type);
    }

    native void __qt_QStyleOptionComplex_int_int(int version, int type);

/**
This variable holds a bitwise OR of the various sub-controls that need to be drawn for the complex control. The default value is {@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_All }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SubControl }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSubControls(int subControls)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSubControls_int(nativeId(), subControls);
    }
    @QtBlockedSlot
    native void __qt_setSubControls_int(long __this__nativeId, int subControls);

/**
This variable holds a bitwise OR of the various sub-controls that need to be drawn for the complex control. The default value is {@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_All }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SubControl }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int subControls()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subControls(nativeId());
    }
    @QtBlockedSlot
    native int __qt_subControls(long __this__nativeId);

/**
This variable holds a bitwise OR of the various sub-controls that are active (pressed) for the complex control. The default value is {@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SubControl }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setActiveSubControls(int activeSubControls)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveSubControls_int(nativeId(), activeSubControls);
    }
    @QtBlockedSlot
    native void __qt_setActiveSubControls_int(long __this__nativeId, int activeSubControls);

/**
This variable holds a bitwise OR of the various sub-controls that are active (pressed) for the complex control. The default value is {@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SubControl }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int activeSubControls()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeSubControls(nativeId());
    }
    @QtBlockedSlot
    native int __qt_activeSubControls(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionComplex fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionComplex(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionComplex array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionComplex clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionComplex __qt_clone(long __this_nativeId);
}
