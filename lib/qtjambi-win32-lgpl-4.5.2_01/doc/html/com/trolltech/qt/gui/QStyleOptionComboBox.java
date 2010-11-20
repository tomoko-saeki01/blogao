package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionComboBox class is used to describe the parameter for drawing a combobox. {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton} contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QComboBox QComboBox}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, and {@link com.trolltech.qt.gui.QComboBox QComboBox}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionComboBox extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionComboBox.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionComboBox$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionComboBox.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ComboBox } for this class).
*/

        Type(983044);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionComboBox$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983044: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a QStyleOptionComboBox, initializing the members variables to their default values.
*/

    public QStyleOptionComboBox(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionComboBox();
    }

    native void __qt_QStyleOptionComboBox();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionComboBox(com.trolltech.qt.gui.QStyleOptionComboBox other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionComboBox_QStyleOptionComboBox(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionComboBox_QStyleOptionComboBox(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionComboBox(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionComboBox_int(version);
    }

    native void __qt_QStyleOptionComboBox_int(int version);

/**
This variable holds the text for the current item of the combo box. The default value is an empty string.
*/

    @QtBlockedSlot
    public final void setCurrentText(java.lang.String currentText)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentText_String(nativeId(), currentText);
    }
    @QtBlockedSlot
    native void __qt_setCurrentText_String(long __this__nativeId, java.lang.String currentText);

/**
This variable holds the text for the current item of the combo box. The default value is an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String currentText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_currentText(long __this__nativeId);

/**
This variable holds the icon size for the current item of the combo box. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
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
This variable holds the icon size for the current item of the combo box. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
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
This variable holds whether or not the combobox is editable or not. the default value is false <p><DT><b>See also:</b><br><DD>{@link QComboBox#isEditable() QComboBox::isEditable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEditable(boolean editable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditable_boolean(nativeId(), editable);
    }
    @QtBlockedSlot
    native void __qt_setEditable_boolean(long __this__nativeId, boolean editable);

/**
This variable holds whether or not the combobox is editable or not. the default value is false <p><DT><b>See also:</b><br><DD>{@link QComboBox#isEditable() QComboBox::isEditable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean editable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_editable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_editable(long __this__nativeId);

/**
This variable holds whether the combo box has a frame. The default value is true.
*/

    @QtBlockedSlot
    public final void setFrame(boolean frame)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrame_boolean(nativeId(), frame);
    }
    @QtBlockedSlot
    native void __qt_setFrame_boolean(long __this__nativeId, boolean frame);

/**
This variable holds whether the combo box has a frame. The default value is true.
*/

    @QtBlockedSlot
    public final boolean frame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frame(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_frame(long __this__nativeId);

/**
This variable holds the popup rectangle for the combobox. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0. <p>This variable is currently unused. You can safely ignore it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_ComboBoxListBoxPopup }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPopupRect(com.trolltech.qt.core.QRect popupRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPopupRect_QRect(nativeId(), popupRect == null ? 0 : popupRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPopupRect_QRect(long __this__nativeId, long popupRect);

/**
This variable holds the popup rectangle for the combobox. The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0. <p>This variable is currently unused. You can safely ignore it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl QStyle::SC_ComboBoxListBoxPopup }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect popupRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_popupRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_popupRect(long __this__nativeId);

/**
This variable holds the icon for the current item of the combo box. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
*/

    @QtBlockedSlot
    public final void setCurrentIcon(com.trolltech.qt.gui.QIcon currentIcon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIcon_QIcon(nativeId(), currentIcon == null ? 0 : currentIcon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentIcon_QIcon(long __this__nativeId, long currentIcon);

/**
This variable holds the icon for the current item of the combo box. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon currentIcon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentIcon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_currentIcon(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionComboBox fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionComboBox(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionComboBox array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionComboBox clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionComboBox __qt_clone(long __this_nativeId);
}
