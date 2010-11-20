package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionProgressBarV2 class is used to describe the parameters necessary for drawing a progress bar in Qt 4.  or above. An instance of this class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ProgressBar } and version 2. <p>The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar} and QStyleOptionProgressBarV2. One way to achieve this is to use the QStyleOptionProgressBarV2 copy constructor. For example: <pre class="snippet">
        QStyleOptionProgressBar progressBarOption = null;
        if ((progressBarOption = (QStyleOptionProgressBar) option) != null) {
            QStyleOptionProgressBarV2 progressBarV2 =
                new QStyleOptionProgressBarV2(progressBarOption);

            // draw the progress bar using progressBarV2
        }
    </pre> In the example above: If the <tt>progressBarOption</tt>'s version is 1, the extra members (orientation, invertedAppearance, and bottomToTop) are set to default values for <tt>progressBarV2</tt>. If the <tt>progressBarOption</tt>'s version is 2, the constructor will simply copy the extra members to progressBarV2. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionProgressBarV2 extends com.trolltech.qt.gui.QStyleOptionProgressBar
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBarV2.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionProgressBarV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBarV2.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ProgressBar } for this class).
*/

        Type(6);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionProgressBarV2$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 6: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionProgressBarV2, initializing he members variables to their default values.
*/

    public QStyleOptionProgressBarV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBarV2();
    }

    native void __qt_QStyleOptionProgressBarV2();

/**
Constructs a copy of the <tt>other</tt> style option which can be either of the {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar} and QStyleOptionProgressBarV2 types. <p>If the <tt>other</tt> style option's version is 1, the extra members (orientation, invertedAppearance, and bottomToTop) are set to default values for the new style option. If <tt>other</tt>'s version is 2, the extra members are simply copied. <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionProgressBarV2(com.trolltech.qt.gui.QStyleOptionProgressBar other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBarV2_QStyleOptionProgressBar(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionProgressBarV2_QStyleOptionProgressBar(long other);

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionProgressBarV2(com.trolltech.qt.gui.QStyleOptionProgressBarV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBarV2_QStyleOptionProgressBarV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionProgressBarV2_QStyleOptionProgressBarV2(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionProgressBarV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBarV2_int(version);
    }

    native void __qt_QStyleOptionProgressBarV2_int(int version);

/**
This variable holds whether the text reads from bottom to top when the progress bar is vertical. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#textDirection() QProgressBar::textDirection}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomToTop(boolean bottomToTop)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomToTop_boolean(nativeId(), bottomToTop);
    }
    @QtBlockedSlot
    native void __qt_setBottomToTop_boolean(long __this__nativeId, boolean bottomToTop);

/**
This variable holds whether the text reads from bottom to top when the progress bar is vertical. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#textDirection() QProgressBar::textDirection}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean bottomToTop()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomToTop(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_bottomToTop(long __this__nativeId);

/**
This variable holds whether the progress bar's appearance is inverted. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#invertedAppearance() QProgressBar::invertedAppearance}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setInvertedAppearance(boolean invertedAppearance)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInvertedAppearance_boolean(nativeId(), invertedAppearance);
    }
    @QtBlockedSlot
    native void __qt_setInvertedAppearance_boolean(long __this__nativeId, boolean invertedAppearance);

/**
This variable holds whether the progress bar's appearance is inverted. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#invertedAppearance() QProgressBar::invertedAppearance}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean invertedAppearance()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invertedAppearance(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_invertedAppearance(long __this__nativeId);

/**
This variable holds the progress bar's orientation (horizontal or vertical); the default orentation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() QProgressBar::orientation}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This variable holds the progress bar's orientation (horizontal or vertical); the default orentation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#orientation() QProgressBar::orientation}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionProgressBarV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionProgressBarV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionProgressBarV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionProgressBarV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionProgressBarV2 __qt_clone(long __this_nativeId);
}
