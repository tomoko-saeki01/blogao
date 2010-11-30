package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionToolButton class is used to describe the parameters for drawing a tool button. QStyleOptionToolButton contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QToolButton QToolButton}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, and {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionToolButton extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolButton.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionToolButton$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
Describes the various features that a tool button can have. <p><DT><b>See also:</b><br><DD>features, {@link QToolButton#toolButtonStyle() QToolButton::toolButtonStyle()}, and {@link QToolButton#popupMode() QToolButton::popupMode()}. <br></DD></DT>
*/

    public enum ToolButtonFeature implements com.trolltech.qt.QtEnumerator {
/**
 A normal tool button.
*/

        None(0),
/**
 The tool button is an arrow.
*/

        Arrow(1),
/**
 The tool button has a menu.
*/

        Menu(4),
/**
 There is a delay to showing the menu.
*/

        PopupDelay(8),
/**
 The button has a popup menu.
*/

        HasMenu(16);

        ToolButtonFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionToolButton$ToolButtonFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionToolButton$ToolButtonFeature[]</tt> QStyleOptionToolButton$ToolButtonFeature values set.</brief>
*/

        public static ToolButtonFeatures createQFlags(ToolButtonFeature ... values) {
            return new ToolButtonFeatures(values);
        }
/**
<brief>Returns the QStyleOptionToolButton$ToolButtonFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolButtonFeature resolve(int value) {
            return (ToolButtonFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return Arrow;
            case 4: return Menu;
            case 8: return PopupDelay;
            case 16: return HasMenu;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ToolButtonFeatures extends com.trolltech.qt.QFlags<ToolButtonFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionToolButton-ToolButtonFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature[]</tt>. flags set.</brief>
*/

        public ToolButtonFeatures(ToolButtonFeature ... args) { super(args); }
        public ToolButtonFeatures(int value) { setValue(value); }
    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolButton.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/


    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ToolButton } for this class).
*/

        Type(983043);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionToolButton$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983043: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionToolButton, initializing the members variables to their default values.
*/

    public QStyleOptionToolButton(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolButton();
    }

    native void __qt_QStyleOptionToolButton();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionToolButton(com.trolltech.qt.gui.QStyleOptionToolButton other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolButton_QStyleOptionToolButton(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionToolButton_QStyleOptionToolButton(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolButton(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolButton_int(version);
    }

    native void __qt_QStyleOptionToolButton_int(int version);

/**
This variable holds the size of the icon for the tool button. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final void setIconSize(com.trolltech.qt.core.QSize iconSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), iconSize == null ? 0 : iconSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconSize_QSize(long __this__nativeId, long iconSize);

/**
This variable holds the size of the icon for the tool button. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
This variable holds a {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonStyle } value describing the appearance of the tool button. The default value is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }. <p><DT><b>See also:</b><br><DD>{@link QToolButton#toolButtonStyle() QToolButton::toolButtonStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolButtonStyle_ToolButtonStyle(nativeId(), toolButtonStyle.value());
    }
    @QtBlockedSlot
    native void __qt_setToolButtonStyle_ToolButtonStyle(long __this__nativeId, int toolButtonStyle);

/**
This variable holds a {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonStyle } value describing the appearance of the tool button. The default value is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }. <p><DT><b>See also:</b><br><DD>{@link QToolButton#toolButtonStyle() QToolButton::toolButtonStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ToolButtonStyle.resolve(__qt_toolButtonStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_toolButtonStyle(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeatures(features));
    }
/**
This variable holds an OR combination of the tool button's features. The default value is {@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature ToolButtonFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeatures features)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_ToolButtonFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_ToolButtonFeatures(long __this__nativeId, int features);

/**
This variable holds an OR combination of the tool button's features. The default value is {@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature ToolButtonFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeatures features()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);

/**
This variable holds the direction of the arrow for the tool button. This value is only used if features includes {@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature Arrow }. The default value is {@link com.trolltech.qt.core.Qt.ArrowType Qt::DownArrow }.
*/

    @QtBlockedSlot
    public final void setArrowType(com.trolltech.qt.core.Qt.ArrowType arrowType)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setArrowType_ArrowType(nativeId(), arrowType.value());
    }
    @QtBlockedSlot
    native void __qt_setArrowType_ArrowType(long __this__nativeId, int arrowType);

/**
This variable holds the direction of the arrow for the tool button. This value is only used if features includes {@link com.trolltech.qt.gui.QStyleOptionToolButton.ToolButtonFeature Arrow }. The default value is {@link com.trolltech.qt.core.Qt.ArrowType Qt::DownArrow }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ArrowType arrowType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ArrowType.resolve(__qt_arrowType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_arrowType(long __this__nativeId);

/**
This variable holds the icon for the tool button. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename. <p><DT><b>See also:</b><br><DD>iconSize. <br></DD></DT>
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
This variable holds the icon for the tool button. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename. <p><DT><b>See also:</b><br><DD>iconSize. <br></DD></DT>
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
This variable holds the position of the tool button. The default value is a null point, i.e. (0, 0)
*/

    @QtBlockedSlot
    public final void setPos(com.trolltech.qt.core.QPoint pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPos_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPos_QPoint(long __this__nativeId, long pos);

/**
This variable holds the position of the tool button. The default value is a null point, i.e. (0, 0)
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
This variable holds the text of the tool button. This value is only used if toolButtonStyle is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextUnderIcon }, {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextBesideIcon }, or {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextOnly }. The default value is an empty string.
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
This variable holds the text of the tool button. This value is only used if toolButtonStyle is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextUnderIcon }, {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextBesideIcon }, or {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextOnly }. The default value is an empty string.
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
This variable holds the font that is used for the text. This value is only used if toolButtonStyle is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextUnderIcon }, {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextBesideIcon }, or {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextOnly }. By default, the application's default font is used.
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
This variable holds the font that is used for the text. This value is only used if toolButtonStyle is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextUnderIcon }, {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextBesideIcon }, or {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonTextOnly }. By default, the application's default font is used.
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

    public static native QStyleOptionToolButton fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolButton(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionToolButton array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionToolButton clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionToolButton __qt_clone(long __this_nativeId);
}
