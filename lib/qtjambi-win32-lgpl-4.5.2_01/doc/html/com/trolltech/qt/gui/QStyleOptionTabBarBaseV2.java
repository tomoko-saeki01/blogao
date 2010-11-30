package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTabBarBaseV2 class is used to describe the base of a tab bar, i. . the part that the tab bar usually overlaps with. {@link com.trolltech.qt.gui.QStyleOptionTabBarBase QStyleOptionTabBarBase} contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the tab bar base. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link QTabBar#drawBase() QTabBar::drawBase()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTabBarBaseV2 extends com.trolltech.qt.gui.QStyleOptionTabBarBase
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTabBarBase.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTabBarBaseV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
Construct a QStyleOptionTabBarBaseV2, initializing the members vaiables to their default values.
*/

    public QStyleOptionTabBarBaseV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBaseV2();
    }

    native void __qt_QStyleOptionTabBarBaseV2();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionTabBarBaseV2(com.trolltech.qt.gui.QStyleOptionTabBarBase other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBaseV2_QStyleOptionTabBarBase(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabBarBaseV2_QStyleOptionTabBarBase(long other);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionTabBarBaseV2(com.trolltech.qt.gui.QStyleOptionTabBarBaseV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBaseV2_QStyleOptionTabBarBaseV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabBarBaseV2_QStyleOptionTabBarBaseV2(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabBarBaseV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabBarBaseV2_int(version);
    }

    native void __qt_QStyleOptionTabBarBaseV2_int(int version);

/**
This variable holds whether the tabbar is in document mode.  The default value is false;
*/

    @QtBlockedSlot
    public final void setDocumentMode(boolean documentMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentMode_boolean(nativeId(), documentMode);
    }
    @QtBlockedSlot
    native void __qt_setDocumentMode_boolean(long __this__nativeId, boolean documentMode);

/**
This variable holds whether the tabbar is in document mode.  The default value is false;
*/

    @QtBlockedSlot
    public final boolean documentMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_documentMode(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTabBarBaseV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabBarBaseV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTabBarBaseV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTabBarBaseV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTabBarBaseV2 __qt_clone(long __this_nativeId);
}
