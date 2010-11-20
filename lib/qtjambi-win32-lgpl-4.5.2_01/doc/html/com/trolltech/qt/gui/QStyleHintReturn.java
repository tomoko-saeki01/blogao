package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleHintReturn class provides style hints that return more than basic data types. QStyleHintReturn and its subclasses are used to pass information from a style back to the querying widget. This is most useful when the return value from {@link com.trolltech.qt.gui.QStyle#styleHint(com.trolltech.qt.gui.QStyle.StyleHint, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) QStyle::styleHint()} does not provide enough detail; for example, when a mask is to be returned.
*/
@QtJambiGeneratedClass
public class QStyleHintReturn extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum HintReturnType implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn}
*/

        SH_Default(61440),
/**
 {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_RubberBand_Mask }{@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_FocusFrame_Mask }
*/

        SH_Mask(61441),
/**
 {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TextControl_FocusIndicatorTextCharFormat }
*/

        SH_Variant(61442);

        HintReturnType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleHintReturn$HintReturnType constant with the specified <tt>int</tt>.</brief>
*/

        public static HintReturnType resolve(int value) {
            return (HintReturnType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 61440: return SH_Default;
            case 61441: return SH_Mask;
            case 61442: return SH_Variant;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturn.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleHintReturn$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturn.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleHintReturn.HintReturnType SH_Default } for this class).
*/

        Type(61440);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleHintReturn$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 61440: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QStyleHintReturn with version <tt>version</tt> and type <tt>type</tt>. <p>The version has no special meaning for QStyleHintReturn; it can be used by subclasses to distinguish between different version of the same hint type. <p><DT><b>See also:</b><br><DD>QStyleOption::version, and QStyleOption::type. <br></DD></DT>
*/

    public QStyleHintReturn(int version) {
        this(version, (int)61440);
    }

/**
Constructs a QStyleHintReturn with version <tt>version</tt> and type <tt>type</tt>. <p>The version has no special meaning for QStyleHintReturn; it can be used by subclasses to distinguish between different version of the same hint type. <p><DT><b>See also:</b><br><DD>QStyleOption::version, and QStyleOption::type. <br></DD></DT>
*/

    public QStyleHintReturn() {
        this((int)1, (int)61440);
    }
/**
Constructs a QStyleHintReturn with version <tt>version</tt> and type <tt>type</tt>. <p>The version has no special meaning for QStyleHintReturn; it can be used by subclasses to distinguish between different version of the same hint type. <p><DT><b>See also:</b><br><DD>QStyleOption::version, and QStyleOption::type. <br></DD></DT>
*/

    public QStyleHintReturn(int version, int type){
        super((QPrivateConstructor)null);
        __qt_QStyleHintReturn_int_int(version, type);
    }

    native void __qt_QStyleHintReturn_int_int(int version, int type);

/**
This variable holds the version of the style hint return container. This value can be used by subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast&lt;T&gt;(), you normally do not need to check it.
*/

    @QtBlockedSlot
    public final void setVersion(int version)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVersion_int(nativeId(), version);
    }
    @QtBlockedSlot
    native void __qt_setVersion_int(long __this__nativeId, int version);

/**
This variable holds the version of the style hint return container. This value can be used by subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast&lt;T&gt;(), you normally do not need to check it.
*/

    @QtBlockedSlot
    public final int version()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_version(nativeId());
    }
    @QtBlockedSlot
    native int __qt_version(long __this__nativeId);

/**
This variable holds the type of the style hint container. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturn.HintReturnType HintReturnType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setType(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_int(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setType_int(long __this__nativeId, int type);

/**
This variable holds the type of the style hint container. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturn.HintReturnType HintReturnType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleHintReturn fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleHintReturn(QPrivateConstructor p) { super(p); } 
}
