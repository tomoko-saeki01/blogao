package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionViewItemV4 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionViewItemV4 inherits {@link com.trolltech.qt.gui.QStyleOptionViewItemV3 QStyleOptionViewItemV3}. <p>An instance of the QStyleOptionViewItemV4 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ViewItem } and version 4. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>See {@link com.trolltech.qt.gui.QStyleOptionViewItemV3 QStyleOptionViewItemV3}'s detailed description for a discussion of how to handle "V3" classes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionViewItemV4 extends com.trolltech.qt.gui.QStyleOptionViewItemV3
    implements java.lang.Cloneable
{
/**
This enum is used to represent the placement of the item on a row. This can be used to draw items differently depending on their placement, for example by putting rounded edges at the beginning and end, and straight edges in between.
*/

    public enum ViewItemPosition implements com.trolltech.qt.QtEnumerator {
/**
 The {@link com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition ViewItemPosition } is unknown and should be disregarded.
*/

        Invalid(0),
/**
 The item appears at the beginning of the row.
*/

        Beginning(1),
/**
 The item appears in the middle of the row.
*/

        Middle(2),
/**
 The item appears at the end of the row.
*/

        End(3),
/**
 The item is the only one on the row, and is therefore both at the beginning and the end.
*/

        OnlyOne(4);

        ViewItemPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItemV4$ViewItemPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewItemPosition resolve(int value) {
            return (ViewItemPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Invalid;
            case 1: return Beginning;
            case 2: return Middle;
            case 3: return End;
            case 4: return OnlyOne;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 4
*/

        Version(4);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItemV4$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 4: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionViewItemV4 object.
*/

    public QStyleOptionViewItemV4(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV4();
    }

    native void __qt_QStyleOptionViewItemV4();

/**
Constructs a QStyleOptionViewItemV4 copy of the <tt>other</tt> style option which can be either of the {@link com.trolltech.qt.gui.QStyleOptionViewItemV3 QStyleOptionViewItemV3} or {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem} types. <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionViewItemV4(com.trolltech.qt.gui.QStyleOptionViewItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV4_QStyleOptionViewItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV4_QStyleOptionViewItem(long other);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionViewItemV4(com.trolltech.qt.gui.QStyleOptionViewItemV4 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV4_QStyleOptionViewItemV4(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItemV4_QStyleOptionViewItemV4(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV4(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItemV4_int(version);
    }

    native void __qt_QStyleOptionViewItemV4_int(int version);

/**
If this view item is checkable, i.e., ViewItemFeature::HasCheckIndicator is true, <tt>checkState</tt> is true if the item is checked; otherwise, it is false.
*/

    @QtBlockedSlot
    public final void setCheckState(com.trolltech.qt.core.Qt.CheckState checkState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckState_CheckState(nativeId(), checkState.value());
    }
    @QtBlockedSlot
    native void __qt_setCheckState_CheckState(long __this__nativeId, int checkState);

/**
If this view item is checkable, i.e., ViewItemFeature::HasCheckIndicator is true, <tt>checkState</tt> is true if the item is checked; otherwise, it is false.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CheckState checkState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CheckState.resolve(__qt_checkState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_checkState(long __this__nativeId);

/**
Gives the position of this view item relative to other items. See the {@link com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition ViewItemPosition } enum for the details.
*/

    @QtBlockedSlot
    public final void setViewItemPosition(com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition viewItemPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewItemPosition_ViewItemPosition(nativeId(), viewItemPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setViewItemPosition_ViewItemPosition(long __this__nativeId, int viewItemPosition);

/**
Gives the position of this view item relative to other items. See the {@link com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition ViewItemPosition } enum for the details.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition viewItemPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionViewItemV4.ViewItemPosition.resolve(__qt_viewItemPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewItemPosition(long __this__nativeId);

/**
The icon (if any) to be drawn in the view item.
*/

    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
The icon (if any) to be drawn in the view item.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
The {@link com.trolltech.qt.gui.QBrush QBrush} that should be used to paint the view items background.
*/

    @QtBlockedSlot
    public final void setBackgroundBrush(com.trolltech.qt.gui.QBrush backgroundBrush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundBrush_QBrush(nativeId(), backgroundBrush == null ? 0 : backgroundBrush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundBrush_QBrush(long __this__nativeId, long backgroundBrush);

/**
The {@link com.trolltech.qt.gui.QBrush QBrush} that should be used to paint the view items background.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush backgroundBrush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundBrush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_backgroundBrush(long __this__nativeId);

/**
The model index that is to be drawn.
*/

    @QtBlockedSlot
    public final void setIndex(com.trolltech.qt.core.QModelIndex index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
The model index that is to be drawn.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex index()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index(long __this__nativeId);

/**
The text (if any) to be drawn in the view item.
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
The text (if any) to be drawn in the view item.
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionViewItemV4 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItemV4(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionViewItemV4 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionViewItemV4 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionViewItemV4 __qt_clone(long __this_nativeId);
}
