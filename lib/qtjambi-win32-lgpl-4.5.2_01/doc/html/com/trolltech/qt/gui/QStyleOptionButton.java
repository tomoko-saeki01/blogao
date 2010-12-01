package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionButton class is used to describe the parameters for drawing buttons. QStyleOptionButton contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw graphical elements like {@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, and {@link com.trolltech.qt.gui.QRadioButton QRadioButton}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionButton extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionButton.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionButton$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum describes the different types of features a push button can have. <p><DT><b>See also:</b><br><DD>features. <br></DD></DT>
*/

    public enum ButtonFeature implements com.trolltech.qt.QtEnumerator {
/**
 Indicates a normal push button.
*/

        None(0),
/**
 Indicates a flat push button.
*/

        Flat(1),
/**
 Indicates that the button has a drop down menu.
*/

        HasMenu(2),
/**
 Indicates that the button is a default button.
*/

        DefaultButton(4),
/**
 Indicates that the button is an auto default button.
*/

        AutoDefaultButton(8),
/**
 Indicates that the button is a Windows Vista type command link.
*/

        CommandLinkButton(16);

        ButtonFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionButton$ButtonFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionButton$ButtonFeature[]</tt> QStyleOptionButton$ButtonFeature values set.</brief>
*/

        public static ButtonFeatures createQFlags(ButtonFeature ... values) {
            return new ButtonFeatures(values);
        }
/**
<brief>Returns the QStyleOptionButton$ButtonFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static ButtonFeature resolve(int value) {
            return (ButtonFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return Flat;
            case 2: return HasMenu;
            case 4: return DefaultButton;
            case 8: return AutoDefaultButton;
            case 16: return CommandLinkButton;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ButtonFeatures extends com.trolltech.qt.QFlags<ButtonFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionButton-ButtonFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionButton.ButtonFeature[]</tt>. flags set.</brief>
*/

        public ButtonFeatures(ButtonFeature ... args) { super(args); }
        public ButtonFeatures(int value) { setValue(value); }
    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionButton.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/


    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Button } for this class).
*/

        Type(2);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionButton$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 2: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionButton, initializing the members variables to their default values.
*/

    public QStyleOptionButton(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionButton();
    }

    native void __qt_QStyleOptionButton();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionButton(com.trolltech.qt.gui.QStyleOptionButton other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionButton_QStyleOptionButton(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionButton_QStyleOptionButton(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionButton(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionButton_int(version);
    }

    native void __qt_QStyleOptionButton_int(int version);

/**
This variable holds the size of the icon for the button. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
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
This variable holds the size of the icon for the button. The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size.
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

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionButton.ButtonFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionButton.ButtonFeatures(features));
    }
/**
This variable holds a bitwise OR of the features that describe this button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionButton.ButtonFeature ButtonFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionButton.ButtonFeatures features)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_ButtonFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_ButtonFeatures(long __this__nativeId, int features);

/**
This variable holds a bitwise OR of the features that describe this button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionButton.ButtonFeature ButtonFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionButton.ButtonFeatures features()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionButton.ButtonFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);

/**
This variable holds the icon of the button. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename. <p><DT><b>See also:</b><br><DD>iconSize. <br></DD></DT>
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
This variable holds the icon of the button. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename. <p><DT><b>See also:</b><br><DD>iconSize. <br></DD></DT>
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
This variable holds the text of the button. The default value is an empty string.
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
This variable holds the text of the button. The default value is an empty string.
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

    public static native QStyleOptionButton fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionButton(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionButton array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionButton clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionButton __qt_clone(long __this_nativeId);
}
