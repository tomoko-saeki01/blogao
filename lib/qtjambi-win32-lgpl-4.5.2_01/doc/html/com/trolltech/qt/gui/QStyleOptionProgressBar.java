package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionProgressBar class is used to describe the parameters necessary for drawing a progress bar. Since Qt 4.1, Qt uses the {@link com.trolltech.qt.gui.QStyleOptionProgressBarV2 QStyleOptionProgressBarV2} subclass for drawing {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. <p>An instance of the QStyleOptionProgressBar class has type {@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ProgressBar } and version 1. <p>The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both QStyleOptionProgressBar and {@link com.trolltech.qt.gui.QStyleOptionProgressBarV2 QStyleOptionProgressBarV2}. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBarV2 QStyleOptionProgressBarV2}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionProgressBar extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBar.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionProgressBar$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionProgressBar.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
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
<brief>Returns the QStyleOptionProgressBar$StyleOptionType constant with the specified <tt>int</tt>.</brief>
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
Constructs a QStyleOptionProgressBar, initializing the members variables to their default values.
*/

    public QStyleOptionProgressBar(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBar();
    }

    native void __qt_QStyleOptionProgressBar();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionProgressBar(com.trolltech.qt.gui.QStyleOptionProgressBar other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBar_QStyleOptionProgressBar(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionProgressBar_QStyleOptionProgressBar(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionProgressBar(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionProgressBar_int(version);
    }

    native void __qt_QStyleOptionProgressBar_int(int version);

/**
This variable holds the minimum value for the progress bar. This is the minimum value in the progress bar. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#minimum() QProgressBar::minimum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimum(int minimum)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_int(nativeId(), minimum);
    }
    @QtBlockedSlot
    native void __qt_setMinimum_int(long __this__nativeId, int minimum);

/**
This variable holds the minimum value for the progress bar. This is the minimum value in the progress bar. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#minimum() QProgressBar::minimum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int minimum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimum(long __this__nativeId);

/**
This variable holds the maximum value for the progress bar. This is the maximum value in the progress bar. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#maximum() QProgressBar::maximum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximum(int maximum)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_int(nativeId(), maximum);
    }
    @QtBlockedSlot
    native void __qt_setMaximum_int(long __this__nativeId, int maximum);

/**
This variable holds the maximum value for the progress bar. This is the maximum value in the progress bar. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#maximum() QProgressBar::maximum}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int maximum()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximum(long __this__nativeId);

/**
This variable holds the current progress for the progress bar. The current progress. A value of QStyleOptionProgressBar::minimum - 1 indicates that the progress hasn't started yet. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#value() QProgressBar::value}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProgress(int progress)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProgress_int(nativeId(), progress);
    }
    @QtBlockedSlot
    native void __qt_setProgress_int(long __this__nativeId, int progress);

/**
This variable holds the current progress for the progress bar. The current progress. A value of QStyleOptionProgressBar::minimum - 1 indicates that the progress hasn't started yet. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#value() QProgressBar::value}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int progress()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progress(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progress(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... textAlignment) {
        this.setTextAlignment(new com.trolltech.qt.core.Qt.Alignment(textAlignment));
    }
/**
This variable holds the text alignment for the text in the {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. This can be used as a guide on where the text should be in the progress bar. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
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
This variable holds the text alignment for the text in the {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. This can be used as a guide on where the text should be in the progress bar. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
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
This variable holds the text for the progress bar. The progress bar text is usually just the progress expressed as a string. An empty string indicates that the progress bar has not started yet. The default value is an empty string. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#text() QProgressBar::text}. <br></DD></DT>
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
This variable holds the text for the progress bar. The progress bar text is usually just the progress expressed as a string. An empty string indicates that the progress bar has not started yet. The default value is an empty string. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#text() QProgressBar::text}. <br></DD></DT>
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
This variable holds a flag indicating whether or not text is visible. If this flag is true then the text is visible. Otherwise, the text is not visible. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#isTextVisible() QProgressBar::textVisible}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextVisible(boolean textVisible)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextVisible_boolean(nativeId(), textVisible);
    }
    @QtBlockedSlot
    native void __qt_setTextVisible_boolean(long __this__nativeId, boolean textVisible);

/**
This variable holds a flag indicating whether or not text is visible. If this flag is true then the text is visible. Otherwise, the text is not visible. The default value is false. <p><DT><b>See also:</b><br><DD>{@link QProgressBar#isTextVisible() QProgressBar::textVisible}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean textVisible()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_textVisible(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionProgressBar fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionProgressBar(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionProgressBar array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionProgressBar clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionProgressBar __qt_clone(long __this_nativeId);
}
