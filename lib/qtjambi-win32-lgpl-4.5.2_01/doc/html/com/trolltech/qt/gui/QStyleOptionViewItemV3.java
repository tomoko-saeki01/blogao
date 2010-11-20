package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionViewItemV3 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionViewItemV3 inherits {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}. <p>An instance of the QStyleOptionViewItemV3 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ViewItem } and version 3. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>See {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}'s detailed description for a discussion of how to handle "V2" and other versioned classes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionViewItemV3 extends com.trolltech.qt.gui.QStyleOptionViewItemV2
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 3
*/

        Version(3);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItemV3$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 3: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionViewItemV3 object.
*/

    public QStyleOptionViewItemV3(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV3();
    }

    native void __qt_QStyleOptionViewItemV3();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionViewItemV3(com.trolltech.qt.gui.QStyleOptionViewItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV3_QStyleOptionViewItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV3_QStyleOptionViewItem(long other);

/**
Creates a new QStyleOptionViewItemV3 that is a copy of <tt>other</tt>.
*/

    public QStyleOptionViewItemV3(com.trolltech.qt.gui.QStyleOptionViewItemV3 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV3_QStyleOptionViewItemV3(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV3_QStyleOptionViewItemV3(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV3(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV3_int(version);
    }

    native void __qt_QStyleOptionViewItemV3_int(int version);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void setLocale(com.trolltech.qt.core.QLocale locale)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocale_QLocale(nativeId(), locale == null ? 0 : locale.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocale_QLocale(long __this__nativeId, long locale);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale locale()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_locale(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QLocale __qt_locale(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionViewItemV3 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV3(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionViewItemV3 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionViewItemV3 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionViewItemV3 __qt_clone(long __this_nativeId);
}
