package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QInputMethodEvent_Attribute extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an input method attribute. <tt>type</tt> specifies the type of attribute, <tt>start</tt> and <tt>length</tt> the position of the attribute, and <tt>value</tt> the value of the attribute.
*/

    public QInputMethodEvent_Attribute(com.trolltech.qt.gui.QInputMethodEvent.AttributeType t, int s, int l, java.lang.Object val){
        super((QPrivateConstructor)null);
        __qt_QInputMethodEvent_Attribute_AttributeType_int_int_Object(t.value(), s, l, val);
    }

    native void __qt_QInputMethodEvent_Attribute_AttributeType_int_int_Object(int t, int s, int l, java.lang.Object val);

/**
Sets the length of this QInputMethodEvent_Attribute.

<tt>length</tt>
*/

    @QtBlockedSlot
    public final void setLength(int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLength_int(nativeId(), length);
    }
    @QtBlockedSlot
    native void __qt_setLength_int(long __this__nativeId, int length);

/**
Returns the length of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setType(com.trolltech.qt.gui.QInputMethodEvent.AttributeType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_AttributeType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setType_AttributeType(long __this__nativeId, int type);

/**
Returns the type of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QInputMethodEvent.AttributeType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QInputMethodEvent.AttributeType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Sets the value of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final void setValue(java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setValue_Object(long __this__nativeId, java.lang.Object value);

/**
Returns the value of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final java.lang.Object value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value(long __this__nativeId);

/**
Sets the <tt>start</tt> of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final void setStart(int start)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStart_int(nativeId(), start);
    }
    @QtBlockedSlot
    native void __qt_setStart_int(long __this__nativeId, int start);

/**
Returns the start of this QInputMethodEvent_Attribute.
*/

    @QtBlockedSlot
    public final int start()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_start(nativeId());
    }
    @QtBlockedSlot
    native int __qt_start(long __this__nativeId);

/**
@exclude
*/

    public static native QInputMethodEvent_Attribute fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputMethodEvent_Attribute(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QInputMethodEvent_Attribute array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QInputMethodEvent_Attribute clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QInputMethodEvent_Attribute __qt_clone(long __this_nativeId);
}
