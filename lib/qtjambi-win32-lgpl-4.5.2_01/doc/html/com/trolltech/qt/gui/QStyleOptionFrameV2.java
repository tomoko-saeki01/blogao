package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionFrameV2 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionFrameV2 inherits {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame} which is used for drawing several built-in Qt widgets, including {@link com.trolltech.qt.gui.QFrame QFrame}, {@link com.trolltech.qt.gui.QGroupBox QGroupBox}, {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, and {@link com.trolltech.qt.gui.QMenu QMenu}. <p>An instance of the QStyleOptionFrameV2 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Frame } and version 2. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame} and QStyleOptionFrameV2. One way to achieve this is to use the QStyleOptionFrameV2 copy constructor. For example: <pre class="snippet">
        QStyleOptionFrame option = new QStyleOptionFrame();

        QStyleOptionFrame frameOption = null;
        if ((frameOption = (QStyleOptionFrame) option) != null) {
            QStyleOptionFrameV2 frameOptionV2 = new QStyleOptionFrameV2(frameOption);

            // draw the frame using frameOptionV2
        }
    </pre> In the example above: If the <tt>frameOption</tt>'s version is 1, {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature } is set to {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature None } for <tt>frameOptionV2</tt>. If <tt>frameOption</tt>'s version is 2, the constructor will simply copy the <tt>frameOption</tt>'s {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature } value. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionFrameV2 extends com.trolltech.qt.gui.QStyleOptionFrame
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrame.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionFrameV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum describles the different types of features a frame can have.
*/

    public enum FrameFeature implements com.trolltech.qt.QtEnumerator {
/**
 Indicates a normal frame.
*/

        None(0),
/**
 Indicates a flat frame.
*/

        Flat(1);

        FrameFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionFrameV2$FrameFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionFrameV2$FrameFeature[]</tt> QStyleOptionFrameV2$FrameFeature values set.</brief>
*/

        public static FrameFeatures createQFlags(FrameFeature ... values) {
            return new FrameFeatures(values);
        }
/**
<brief>Returns the QStyleOptionFrameV2$FrameFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static FrameFeature resolve(int value) {
            return (FrameFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return Flat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FrameFeatures extends com.trolltech.qt.QFlags<FrameFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionFrameV2-FrameFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature[]</tt>. flags set.</brief>
*/

        public FrameFeatures(FrameFeature ... args) { super(args); }
        public FrameFeatures(int value) { setValue(value); }
    }



/**
Constructs a QStyleOptionFrameV2 object.
*/

    public QStyleOptionFrameV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV2();
    }

    native void __qt_QStyleOptionFrameV2();

/**
Constructs a QStyleOptionFrameV2 copy of the <tt>other</tt> style option which can be either of the QStyleOptionFrameV2 or {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame} types. <p>If the <tt>other</tt> style option's version is 1, the new style option's {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature } value is set to {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature QStyleOptionFrameV2::None }. If its version is 2, its {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature } value is simply copied to the new style option. <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionFrameV2(com.trolltech.qt.gui.QStyleOptionFrame other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV2_QStyleOptionFrame(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFrameV2_QStyleOptionFrame(long other);

/**
Constructs a QStyleOptionFrameV2 copy of the <tt>other</tt> style option.
*/

    public QStyleOptionFrameV2(com.trolltech.qt.gui.QStyleOptionFrameV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV2_QStyleOptionFrameV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFrameV2_QStyleOptionFrameV2(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrameV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV2_int(version);
    }

    native void __qt_QStyleOptionFrameV2_int(int version);


/**

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeatures(features));
    }
/**
This variable holds a bitwise OR of the features that describe this frame.  <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature }. <br></DD></DT>
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
Returns the  QStyleOptionFrameV2.FrameFeatures of this QStyleOptionFrameV2.
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
@exclude
*/

    public static native QStyleOptionFrameV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrameV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionFrameV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionFrameV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionFrameV2 __qt_clone(long __this_nativeId);
}
