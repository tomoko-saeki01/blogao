package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionViewItem class is used to describe the parameters used to draw an item in a view widget. QStyleOptionViewItem contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the items for Qt's model/view classes. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link <a href="../model-view-programming.html">Model/View Programming</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionViewItem extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionViewItem$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ViewItem } for this class).
*/

        Type(12);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItem$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 12: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the position of the item's decoration. <p><DT><b>See also:</b><br><DD>decorationPosition. <br></DD></DT>
*/

    public enum Position implements com.trolltech.qt.QtEnumerator {
/**
 On the left of the text.
*/

        Left(0),
/**
 On the right of the text.
*/

        Right(1),
/**
 Above the text.
*/

        Top(2),
/**
 Below the text.
*/

        Bottom(3);

        Position(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionViewItem$Position constant with the specified <tt>int</tt>.</brief>
*/

        public static Position resolve(int value) {
            return (Position) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Left;
            case 1: return Right;
            case 2: return Top;
            case 3: return Bottom;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionViewItem, initializing the members variables to their default values.
*/

    public QStyleOptionViewItem(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItem();
    }

    native void __qt_QStyleOptionViewItem();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionViewItem(com.trolltech.qt.gui.QStyleOptionViewItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItem_QStyleOptionViewItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionViewItem_QStyleOptionViewItem(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItem(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionViewItem_int(version);
    }

    native void __qt_QStyleOptionViewItem_int(int version);

/**
This variable holds whether the decoration should be highlighted on selected items. If this option is true, the branch and any decorations on selected items should be highlighted, indicating that the item is selected; otherwise, no highlighting is required. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ItemView_ShowDecorationSelected }, and {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShowDecorationSelected(boolean showDecorationSelected)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShowDecorationSelected_boolean(nativeId(), showDecorationSelected);
    }
    @QtBlockedSlot
    native void __qt_setShowDecorationSelected_boolean(long __this__nativeId, boolean showDecorationSelected);

/**
This variable holds whether the decoration should be highlighted on selected items. If this option is true, the branch and any decorations on selected items should be highlighted, indicating that the item is selected; otherwise, no highlighting is required. The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ItemView_ShowDecorationSelected }, and {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean showDecorationSelected()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_showDecorationSelected(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_showDecorationSelected(long __this__nativeId);

/**
This variable holds the position of the decoration for the item. The default value is {@link com.trolltech.qt.gui.QStyleOptionViewItem.Position Left }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.Position Position }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDecorationPosition(com.trolltech.qt.gui.QStyleOptionViewItem.Position decorationPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecorationPosition_Position(nativeId(), decorationPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setDecorationPosition_Position(long __this__nativeId, int decorationPosition);

/**
This variable holds the position of the decoration for the item. The default value is {@link com.trolltech.qt.gui.QStyleOptionViewItem.Position Left }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionViewItem.Position Position }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionViewItem.Position decorationPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionViewItem.Position.resolve(__qt_decorationPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_decorationPosition(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setDecorationAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... decorationAlignment) {
        this.setDecorationAlignment(new com.trolltech.qt.core.Qt.Alignment(decorationAlignment));
    }
/**
This variable holds the alignment of the decoration for the item. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final void setDecorationAlignment(com.trolltech.qt.core.Qt.Alignment decorationAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecorationAlignment_Alignment(nativeId(), decorationAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setDecorationAlignment_Alignment(long __this__nativeId, int decorationAlignment);

/**
This variable holds the alignment of the decoration for the item. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment decorationAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_decorationAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_decorationAlignment(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setDisplayAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... displayAlignment) {
        this.setDisplayAlignment(new com.trolltech.qt.core.Qt.Alignment(displayAlignment));
    }
/**
This variable holds the alignment of the display value for the item. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final void setDisplayAlignment(com.trolltech.qt.core.Qt.Alignment displayAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisplayAlignment_Alignment(nativeId(), displayAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setDisplayAlignment_Alignment(long __this__nativeId, int displayAlignment);

/**
This variable holds the alignment of the display value for the item. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment displayAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_displayAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_displayAlignment(long __this__nativeId);

/**
This variable holds where ellipsis should be added for text that is too long to fit into an item. The default value is {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideMiddle }, i.e. the ellipsis appears in the middle of the text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.TextElideMode Qt::TextElideMode }, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ItemView_EllipsisLocation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextElideMode(com.trolltech.qt.core.Qt.TextElideMode textElideMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextElideMode_TextElideMode(nativeId(), textElideMode.value());
    }
    @QtBlockedSlot
    native void __qt_setTextElideMode_TextElideMode(long __this__nativeId, int textElideMode);

/**
This variable holds where ellipsis should be added for text that is too long to fit into an item. The default value is {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideMiddle }, i.e. the ellipsis appears in the middle of the text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.TextElideMode Qt::TextElideMode }, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ItemView_EllipsisLocation }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextElideMode textElideMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextElideMode.resolve(__qt_textElideMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textElideMode(long __this__nativeId);

/**
This variable holds the size of the decoration for the item. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size. <p><DT><b>See also:</b><br><DD>decorationAlignment, and decorationPosition. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDecorationSize(com.trolltech.qt.core.QSize decorationSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecorationSize_QSize(nativeId(), decorationSize == null ? 0 : decorationSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDecorationSize_QSize(long __this__nativeId, long decorationSize);

/**
This variable holds the size of the decoration for the item. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size. <p><DT><b>See also:</b><br><DD>decorationAlignment, and decorationPosition. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize decorationSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decorationSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_decorationSize(long __this__nativeId);

/**
This variable holds the font used for the item. By default, the application's default font is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
This variable holds the font used for the item. By default, the application's default font is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionViewItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionViewItem(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionViewItem array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionViewItem clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionViewItem __qt_clone(long __this_nativeId);
}
