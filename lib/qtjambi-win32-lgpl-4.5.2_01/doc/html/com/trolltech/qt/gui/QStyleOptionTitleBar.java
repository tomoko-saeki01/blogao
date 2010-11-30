package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTitleBar class is used to describe the parameters for drawing a title bar. QStyleOptionTitleBar contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the title bars of {@link com.trolltech.qt.gui.QWorkspace QWorkspace}'s MDI children. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, and {@link com.trolltech.qt.gui.QWorkspace QWorkspace}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTitleBar extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTitleBar.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTitleBar$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTitleBar.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_TitleBar } for this class).
*/

        Type(983046);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionTitleBar$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983046: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionTitleBar, initializing the members variables to their default values.
*/

    public QStyleOptionTitleBar(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTitleBar();
    }

    native void __qt_QStyleOptionTitleBar();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionTitleBar(com.trolltech.qt.gui.QStyleOptionTitleBar other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTitleBar_QStyleOptionTitleBar(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTitleBar_QStyleOptionTitleBar(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTitleBar(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTitleBar_int(version);
    }

    native void __qt_QStyleOptionTitleBar_int(int version);


/**

*/

    @QtBlockedSlot
    public final void setTitleBarFlags(com.trolltech.qt.core.Qt.WindowType ... titleBarFlags) {
        this.setTitleBarFlags(new com.trolltech.qt.core.Qt.WindowFlags(titleBarFlags));
    }
/**
This variable holds the widget flags for the title bar. The default value is {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget }. <p><DT><b>See also:</b><br><DD>Qt::WindowFlags. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTitleBarFlags(com.trolltech.qt.core.Qt.WindowFlags titleBarFlags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitleBarFlags_WindowFlags(nativeId(), titleBarFlags.value());
    }
    @QtBlockedSlot
    native void __qt_setTitleBarFlags_WindowFlags(long __this__nativeId, int titleBarFlags);

/**
This variable holds the widget flags for the title bar. The default value is {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget }. <p><DT><b>See also:</b><br><DD>Qt::WindowFlags. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowFlags titleBarFlags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.WindowFlags(__qt_titleBarFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_titleBarFlags(long __this__nativeId);

/**
This variable holds the icon for the title bar. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds the icon for the title bar. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
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
This variable holds the text of the title bar. The default value is an empty string.
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
This variable holds the text of the title bar. The default value is an empty string.
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
This variable holds the state of the title bar. This is basically the window state of the underlying widget. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowState() QWidget::windowState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTitleBarState(int titleBarState)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitleBarState_int(nativeId(), titleBarState);
    }
    @QtBlockedSlot
    native void __qt_setTitleBarState_int(long __this__nativeId, int titleBarState);

/**
This variable holds the state of the title bar. This is basically the window state of the underlying widget. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowState() QWidget::windowState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int titleBarState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_titleBarState(nativeId());
    }
    @QtBlockedSlot
    native int __qt_titleBarState(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTitleBar fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTitleBar(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTitleBar array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTitleBar clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTitleBar __qt_clone(long __this_nativeId);
}
