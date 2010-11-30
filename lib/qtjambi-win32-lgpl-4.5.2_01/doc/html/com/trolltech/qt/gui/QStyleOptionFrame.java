package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionFrame class is used to describe the parameters for drawing a frame. QStyleOptionFrame is used for drawing several built-in Qt widgets, including {@link com.trolltech.qt.gui.QFrame QFrame}, {@link com.trolltech.qt.gui.QGroupBox QGroupBox}, {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, and {@link com.trolltech.qt.gui.QMenu QMenu}. Note that to describe the parameters necessary for drawing a frame in Qt 4.1 or above, you must use the {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2} subclass. <p>An instance of the QStyleOptionFrame class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Frame } and version 1. <p>The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both QStyleOptionFrame and {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionFrame extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrame.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionFrame$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrame.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Frame } for this class).
*/

        Type(5);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionFrame$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 5: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionFrame, initializing the members variables to their default values.
*/

    public QStyleOptionFrame(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrame();
    }

    native void __qt_QStyleOptionFrame();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionFrame(com.trolltech.qt.gui.QStyleOptionFrame other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrame_QStyleOptionFrame(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFrame_QStyleOptionFrame(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrame(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrame_int(version);
    }

    native void __qt_QStyleOptionFrame_int(int version);

/**
This variable holds the line width for drawing the frame. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() QFrame::lineWidth}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLineWidth(int lineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWidth_int(nativeId(), lineWidth);
    }
    @QtBlockedSlot
    native void __qt_setLineWidth_int(long __this__nativeId, int lineWidth);

/**
This variable holds the line width for drawing the frame. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() QFrame::lineWidth}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineWidth(long __this__nativeId);

/**
This variable holds the mid-line width for drawing the frame. This is usually used in drawing sunken or raised frames. <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() QFrame::midLineWidth}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMidLineWidth(int midLineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMidLineWidth_int(nativeId(), midLineWidth);
    }
    @QtBlockedSlot
    native void __qt_setMidLineWidth_int(long __this__nativeId, int midLineWidth);

/**
This variable holds the mid-line width for drawing the frame. This is usually used in drawing sunken or raised frames. <p>The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() QFrame::midLineWidth}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int midLineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_midLineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_midLineWidth(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionFrame fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrame(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionFrame array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionFrame clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionFrame __qt_clone(long __this_nativeId);
}
