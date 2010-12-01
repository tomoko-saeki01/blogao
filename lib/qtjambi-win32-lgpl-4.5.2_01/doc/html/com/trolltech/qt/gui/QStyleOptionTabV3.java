package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionTabV3 class is used to describe the parameters necessary for drawing a tabs in Qt 4.  or above. An instance of the QStyleOptionTabV3 class has type{@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Tab } and version 3. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p>If you create your own {@link com.trolltech.qt.gui.QStyle QStyle} subclass, you should handle both {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}, {@link com.trolltech.qt.gui.QStyleOptionTabV2 QStyleOptionTabV2} and QStyleOptionTabV3. One way to achieve this is to use the QStyleOptionTabV3 copy constructor. For example: <pre class="snippet">
        QStyleOptionTab tabOption = null;
        if ((tabOption = (QStyleOptionTab) option) != null) {
            QStyleOptionTabV2 tabV2 =
                    new QStyleOptionTabV2(tabOption);

            // draw the tab using tabV2
       }
    </pre> In the example above: If <tt>tabOption</tt>'s version is 1, the extra member (iconSize) will be set to an invalid size for <tt>tabV2</tt>. If <tt>tabOption</tt>'s version is 2, the constructor will simply copy the <tt>tab</tt>'s iconSize. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionTabV3 extends com.trolltech.qt.gui.QStyleOptionTabV2
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionTab.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionTabV3$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
Constructs a QStyleOptionTabV3.
*/

    public QStyleOptionTabV3(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabV3();
    }

    native void __qt_QStyleOptionTabV3();

/**
Constructs a QStyleOptionTabV3 copy of the <tt>other</tt> style option which can be either of the QStyleOptionTabV3, {@link com.trolltech.qt.gui.QStyleOptionTabV2 QStyleOptionTabV2} or {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab} types. <p>If the other style option's version is 1 or 2, the new style option's <tt>leftButtonSize</tt> and <tt>rightButtonSize</tt> is set to an invalid value. If its version is 3, its <tt>leftButtonSize</tt> and <tt>rightButtonSize</tt> values are simply copied to the new style option.
*/

    public QStyleOptionTabV3(com.trolltech.qt.gui.QStyleOptionTab other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabV3_QStyleOptionTab(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabV3_QStyleOptionTab(long other);

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionTabV3(com.trolltech.qt.gui.QStyleOptionTabV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabV3_QStyleOptionTabV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabV3_QStyleOptionTabV2(long other);

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionTabV3(com.trolltech.qt.gui.QStyleOptionTabV3 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabV3_QStyleOptionTabV3(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionTabV3_QStyleOptionTabV3(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabV3(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionTabV3_int(version);
    }

    native void __qt_QStyleOptionTabV3_int(int version);

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
This variable holds the size for the right widget on the tab.  The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size;
*/

    @QtBlockedSlot
    public final void setRightButtonSize(com.trolltech.qt.core.QSize rightButtonSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRightButtonSize_QSize(nativeId(), rightButtonSize == null ? 0 : rightButtonSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRightButtonSize_QSize(long __this__nativeId, long rightButtonSize);

/**
This variable holds the size for the right widget on the tab.  The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size;
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize rightButtonSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightButtonSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_rightButtonSize(long __this__nativeId);

/**
This variable holds the size for the left widget on the tab.  The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size;
*/

    @QtBlockedSlot
    public final void setLeftButtonSize(com.trolltech.qt.core.QSize leftButtonSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeftButtonSize_QSize(nativeId(), leftButtonSize == null ? 0 : leftButtonSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLeftButtonSize_QSize(long __this__nativeId, long leftButtonSize);

/**
This variable holds the size for the left widget on the tab.  The default value is {@link com.trolltech.qt.core.QSize QSize}(-1, -1), i.e. an invalid size;
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize leftButtonSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftButtonSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_leftButtonSize(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionTabV3 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionTabV3(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionTabV3 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionTabV3 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionTabV3 __qt_clone(long __this_nativeId);
}
