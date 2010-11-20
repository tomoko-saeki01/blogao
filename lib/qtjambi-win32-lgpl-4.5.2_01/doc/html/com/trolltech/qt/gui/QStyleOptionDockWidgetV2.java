package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QStyleOptionDockWidgetV2 extends com.trolltech.qt.gui.QStyleOptionDockWidget
    implements java.lang.Cloneable
{
    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
        Version(2);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionDockWidgetV2$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
Creates a new QStyleOptionDockWidgetV2, initializing the  member variables to
their default values.
*/

    public QStyleOptionDockWidgetV2(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidgetV2();
    }

    native void __qt_QStyleOptionDockWidgetV2();

/**
Creates a new QStyleOptionDockWidgetV2, which is a copy of <tt>other</tt>.
*/

    public QStyleOptionDockWidgetV2(com.trolltech.qt.gui.QStyleOptionDockWidget other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidgetV2_QStyleOptionDockWidget(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionDockWidgetV2_QStyleOptionDockWidget(long other);

/**
Creates a new QStyleOptionDockWidgetV2, which is a copy of <tt>other</tt>.
*/

    public QStyleOptionDockWidgetV2(com.trolltech.qt.gui.QStyleOptionDockWidgetV2 other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidgetV2_QStyleOptionDockWidgetV2(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionDockWidgetV2_QStyleOptionDockWidgetV2(long other);

/**
Creates a new QStyleOptionDockWidgetV2 with the specified <tt>version</tt>.
*/

    protected QStyleOptionDockWidgetV2(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionDockWidgetV2_int(version);
    }

    native void __qt_QStyleOptionDockWidgetV2_int(int version);

/**
Sets this QStyleOptionDockWidgetV2's title bar to vertical if
<tt>verticalTitleBar</tt> is true; otherwise, horizontal.
*/

    @QtBlockedSlot
    public final void setVerticalTitleBar(boolean verticalTitleBar)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalTitleBar_boolean(nativeId(), verticalTitleBar);
    }
    @QtBlockedSlot
    native void __qt_setVerticalTitleBar_boolean(long __this__nativeId, boolean verticalTitleBar);

/**
Returns true if this QStyleOptionDockWidgetV2 has a vertical title
bar; otherwise, false.
*/

    @QtBlockedSlot
    public final boolean verticalTitleBar()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalTitleBar(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_verticalTitleBar(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionDockWidgetV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionDockWidgetV2(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionDockWidgetV2 array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionDockWidgetV2 clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionDockWidgetV2 __qt_clone(long __this_nativeId);
}
