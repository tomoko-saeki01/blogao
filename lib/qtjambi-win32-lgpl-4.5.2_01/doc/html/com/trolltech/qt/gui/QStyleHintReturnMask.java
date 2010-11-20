package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleHintReturnMask class provides style hints that return a {@link com.trolltech.qt.gui.QRegion QRegion}.
*/
@QtJambiGeneratedClass
public class QStyleHintReturnMask extends com.trolltech.qt.gui.QStyleHintReturn
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturnMask.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleHintReturnMask$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleHintReturn QStyleHintReturn} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleHintReturnMask.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleHintReturn.HintReturnType SH_Mask } for this class).
*/

        Type(61441);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleHintReturnMask$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 61441: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleHintReturnMask. The member variables are initialized to default values.
*/

    public QStyleHintReturnMask(){
        super((QPrivateConstructor)null);
        __qt_QStyleHintReturnMask();
    }

    native void __qt_QStyleHintReturnMask();

/**
This variable holds the region for style hints that return a {@link com.trolltech.qt.gui.QRegion QRegion}.
*/

    @QtBlockedSlot
    public final void setRegion(com.trolltech.qt.gui.QRegion region)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRegion_QRegion(nativeId(), region == null ? 0 : region.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRegion_QRegion(long __this__nativeId, long region);

/**
This variable holds the region for style hints that return a {@link com.trolltech.qt.gui.QRegion QRegion}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion region()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_region(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_region(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleHintReturnMask fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleHintReturnMask(QPrivateConstructor p) { super(p); } 
}
