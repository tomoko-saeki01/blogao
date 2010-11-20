package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionFrameV3 class is used to describe the parameters necessary for drawing a frame in Qt 4.  or above. QStyleOptionFrameV3 inherits {@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2} <p>An instance of the QStyleOptionFrameV3 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Frame } and version 3. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionFrameV3 extends com.trolltech.qt.gui.QStyleOptionFrameV2
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionFrame.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 3
*/

        Version(3);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionFrameV3$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 3: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionFrameV3 object.
*/

    public QStyleOptionFrameV3(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV3();
    }

    native void __qt_QStyleOptionFrameV3();

/**
Constructs a QStyleOptionFrameV3 copy of the <tt>other</tt> style option which can be either of the QStyleOptionFrameV3 or {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame} types. <p>If the <tt>other</tt> style option's version is 1, the new style option's {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature FrameFeature } value is set to {@link com.trolltech.qt.gui.QStyleOptionFrameV2.FrameFeature QStyleOptionFrameV2::None }. If its version is 2 or lower, QStyleOptionFrameV3::frameShape value is {@link com.trolltech.qt.gui.QFrame.Shape QFrame::NoFrame } <p><DT><b>See also:</b><br><DD>version. <br></DD></DT>
*/

    public QStyleOptionFrameV3(com.trolltech.qt.gui.QStyleOptionFrame other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV3_QStyleOptionFrame(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFrameV3_QStyleOptionFrame(long other);

/**
Constructs a QStyleOptionFrameV3 copy of the <tt>other</tt> style option.
*/

    public QStyleOptionFrameV3(com.trolltech.qt.gui.QStyleOptionFrameV3 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV3_QStyleOptionFrameV3(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionFrameV3_QStyleOptionFrameV3(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrameV3(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionFrameV3_int(version);
    }

    native void __qt_QStyleOptionFrameV3_int(int version);

/**
This variable holds This property holds the frame shape value of the frame.  <p><DT><b>See also:</b><br><DD>{@link QFrame#frameShape() QFrame::frameShape}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFrameShape(com.trolltech.qt.gui.QFrame.Shape frameShape)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameShape_Shape(nativeId(), frameShape.value());
    }
    @QtBlockedSlot
    native void __qt_setFrameShape_Shape(long __this__nativeId, int frameShape);

/**
This variable holds This property holds the frame shape value of the frame.  <p><DT><b>See also:</b><br><DD>{@link QFrame#frameShape() QFrame::frameShape}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFrame.Shape frameShape()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFrame.Shape.resolve(__qt_frameShape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_frameShape(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void setUnused(int unused)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUnused_int(nativeId(), unused);
    }
    @QtBlockedSlot
    native void __qt_setUnused_int(long __this__nativeId, int unused);

/**

*/

    @QtBlockedSlot
    public final int unused()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unused(nativeId());
    }
    @QtBlockedSlot
    native int __qt_unused(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionFrameV3 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionFrameV3(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionFrameV3 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionFrameV3 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionFrameV3 __qt_clone(long __this_nativeId);
}
