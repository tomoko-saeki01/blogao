package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionGroupBox class describes the parameters for drawing a group box. {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton} contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need the various graphical elements of a group box. <p>It holds the lineWidth and the midLineWidth for drawing the panel, the group box's title and the title's alignment and color. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}, and {@link com.trolltech.qt.gui.QGroupBox QGroupBox}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionGroupBox extends com.trolltech.qt.gui.QStyleOptionComplex
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionGroupBox.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionGroupBox$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionGroupBox.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_GroupBox } for this class).
*/

        Type(983047);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionGroupBox$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 983047: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionGroupBox, initializing the members variables to their default values.
*/

    public QStyleOptionGroupBox(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGroupBox();
    }

    native void __qt_QStyleOptionGroupBox();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionGroupBox(com.trolltech.qt.gui.QStyleOptionGroupBox other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGroupBox_QStyleOptionGroupBox(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionGroupBox_QStyleOptionGroupBox(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionGroupBox(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGroupBox_int(version);
    }

    native void __qt_QStyleOptionGroupBox_int(int version);

/**
This variable holds the line width for drawing the panel. The value of this variable is, currently, always 1. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() QFrame::lineWidth}. <br></DD></DT>
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
This variable holds the line width for drawing the panel. The value of this variable is, currently, always 1. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() QFrame::lineWidth}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeatures(features));
    }
/**
This variable holds the features of the group box frame. The frame is flat by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature QStyleOptionFrameV2::FrameFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeatures features)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_FrameFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_FrameFeatures(long __this__nativeId, int features);

/**
This variable holds the features of the group box frame. The frame is flat by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature QStyleOptionFrameV2::FrameFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeatures features()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... textAlignment) {
        this.setTextAlignment(new com.trolltech.qt.core.Qt.Alignment(textAlignment));
    }
/**
This variable holds the alignment of the group box title. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#alignment() QGroupBox::alignment}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.Alignment textAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextAlignment_Alignment(nativeId(), textAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setTextAlignment_Alignment(long __this__nativeId, int textAlignment);

/**
This variable holds the alignment of the group box title. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#alignment() QGroupBox::alignment}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment textAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_textAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textAlignment(long __this__nativeId);

/**
This variable holds the mid-line width for drawing the panel. The mid-line width is usually used when drawing sunken or raised group box frames. The value of this variable is, currently, always 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() QFrame::midLineWidth}. <br></DD></DT>
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
This variable holds the mid-line width for drawing the panel. The mid-line width is usually used when drawing sunken or raised group box frames. The value of this variable is, currently, always 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() QFrame::midLineWidth}. <br></DD></DT>
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
This variable holds the text of the group box. The default value is an empty string. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#title() QGroupBox::title}. <br></DD></DT>
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
This variable holds the text of the group box. The default value is an empty string. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#title() QGroupBox::title}. <br></DD></DT>
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
This variable holds the color of the group box title. The default value is an invalid color with the RGB value (0, 0, 0). An invalid color is a color that is not properly set up for the underlying window system.
*/

    @QtBlockedSlot
    public final void setTextColor(com.trolltech.qt.gui.QColor textColor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextColor_QColor(nativeId(), textColor == null ? 0 : textColor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTextColor_QColor(long __this__nativeId, long textColor);

/**
This variable holds the color of the group box title. The default value is an invalid color with the RGB value (0, 0, 0). An invalid color is a color that is not properly set up for the underlying window system.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor textColor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_textColor(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionGroupBox fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionGroupBox(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionGroupBox array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionGroupBox clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionGroupBox __qt_clone(long __this_nativeId);
}
