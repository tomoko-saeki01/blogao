package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionViewItemV2 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionViewItemV2 inherits {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}. <p>An instance of the QStyleOptionViewItemV2 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ViewItem } and version 2. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>See {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}'s detailed description for a discussion of how to handle "V2" classes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionViewItemV2 extends com.trolltech.qt.gui.QStyleOptionViewItem
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 2
*/

        Version(2);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItemV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 2: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describles the different types of features an item can have.
*/

    public enum ViewItemFeature implements com.trolltech.qt.QtEnumerator {
/**
 Indicates a normal item.
*/

        None(0),
/**
 Indicates an item with wrapped text.
*/

        WrapText(1),
/**
 Indicates that the item's background is rendered using alternateBase.
*/

        Alternate(2),
/**
 Indicates that the item has a check state indicator.
*/

        HasCheckIndicator(4),
/**
 Indicates that the item has a display role.
*/

        HasDisplay(8),
/**
 Indicates that the item has a decoration role.
*/

        HasDecoration(16);

        ViewItemFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionViewItemV2$ViewItemFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionViewItemV2$ViewItemFeature[]</tt> QStyleOptionViewItemV2$ViewItemFeature values set.</brief>
*/

        public static ViewItemFeatures createQFlags(ViewItemFeature ... values) {
            return new ViewItemFeatures(values);
        }
/**
<brief>Returns the QStyleOptionViewItemV2$ViewItemFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewItemFeature resolve(int value) {
            return (ViewItemFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return WrapText;
            case 2: return Alternate;
            case 4: return HasCheckIndicator;
            case 8: return HasDisplay;
            case 16: return HasDecoration;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ViewItemFeatures extends com.trolltech.qt.QFlags<ViewItemFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionViewItemV2-ViewItemFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature[]</tt>. flags set.</brief>
*/

        public ViewItemFeatures(ViewItemFeature ... args) { super(args); }
        public ViewItemFeatures(int value) { setValue(value); }
    }



/**
Constructs a QStyleOptionViewItemV2 object.
*/

    public QStyleOptionViewItemV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV2();
    }

    native void __qt_QStyleOptionViewItemV2();

/**
Constructs a QStyleOptionViewItemV2 copy of the <tt>other</tt> style option which can be either of the QStyleOptionViewItemV2 or {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem} types. <p>If the <tt>other</tt> style option's version is 1, the new style option's {@link com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature ViewItemFeature } value is set to {@link com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature QStyleOptionViewItemV2::None }. If its version is 2, its {@link com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature ViewItemFeature } value is simply copied to the new style option. <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionViewItemV2(com.trolltech.qt.gui.QStyleOptionViewItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV2_QStyleOptionViewItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV2_QStyleOptionViewItem(long other);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionViewItemV2(com.trolltech.qt.gui.QStyleOptionViewItemV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV2_QStyleOptionViewItemV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV2_QStyleOptionViewItemV2(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV2_int(version);
    }

    native void __qt_QStyleOptionViewItemV2_int(int version);


/**

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeatures(features));
    }
/**
This variable holds a bitwise OR of the features that describe this view item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature ViewItemFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeatures features)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_ViewItemFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_ViewItemFeatures(long __this__nativeId, int features);

/**
This variable holds a bitwise OR of the features that describe this view item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeature ViewItemFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeatures features()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionViewItemV2.ViewItemFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionViewItemV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionViewItemV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionViewItemV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionViewItemV2 __qt_clone(long __this_nativeId);
}
