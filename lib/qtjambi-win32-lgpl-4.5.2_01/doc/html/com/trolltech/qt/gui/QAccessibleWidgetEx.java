package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class QAccessibleWidgetEx extends com.trolltech.qt.gui.QAccessibleObjectEx
{


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QAccessibleWidgetEx(com.trolltech.qt.gui.QWidget o, com.trolltech.qt.gui.QAccessible.Role r) {
        this(o, r, (java.lang.String)null);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QAccessibleWidgetEx(com.trolltech.qt.gui.QWidget o) {
        this(o, com.trolltech.qt.gui.QAccessible.Role.Client, (java.lang.String)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QAccessibleWidgetEx(com.trolltech.qt.gui.QWidget o, com.trolltech.qt.gui.QAccessible.Role r, java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QAccessibleWidgetEx_QWidget_Role_String(o == null ? 0 : o.nativeId(), r.value(), name);
    }

    native void __qt_QAccessibleWidgetEx_QWidget_Role_String(long o, int r, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void addControllingSignal(java.lang.String signal)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addControllingSignal_String(nativeId(), signal);
    }
    @QtBlockedSlot
    native void __qt_addControllingSignal_String(long __this__nativeId, java.lang.String signal);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QObject parentObject()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentObject(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_parentObject(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setAccelerator(java.lang.String accel)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccelerator_String(nativeId(), accel);
    }
    @QtBlockedSlot
    native void __qt_setAccelerator_String(long __this__nativeId, java.lang.String accel);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setDescription(java.lang.String desc)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescription_String(nativeId(), desc);
    }
    @QtBlockedSlot
    native void __qt_setDescription_String(long __this__nativeId, java.lang.String desc);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setHelp(java.lang.String help)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHelp_String(nativeId(), help);
    }
    @QtBlockedSlot
    native void __qt_setHelp_String(long __this__nativeId, java.lang.String help);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setValue(java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setValue_String(long __this__nativeId, java.lang.String value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QWidget widget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String actionText(int action, com.trolltech.qt.gui.QAccessible.Text t, int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionText_int_Text_int(nativeId(), action, t.value(), child);
    }
    @QtBlockedSlot
    native java.lang.String __qt_actionText_int_Text_int(long __this__nativeId, int action, int t, int child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int childAt(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native int __qt_childAt_int_int(long __this__nativeId, int x, int y);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int childCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_childCount(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean doAction(int action, int child, java.util.List<java.lang.Object> params)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doAction_int_int_List(nativeId(), action, child, params);
    }
    @QtBlockedSlot
    native boolean __qt_doAction_int_int_List(long __this__nativeId, int action, int child, java.util.List<java.lang.Object> params);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int indexOfChild(com.trolltech.qt.gui.QAccessibleInterface child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOfChild_QAccessibleInterface(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOfChild_QAccessibleInterface(long __this__nativeId, long child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object invokeMethodEx(com.trolltech.qt.gui.QAccessible.Method method, int child, java.util.List<java.lang.Object> params)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invokeMethodEx_Method_int_List(nativeId(), method.value(), child, params);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_invokeMethodEx_Method_int_List(long __this__nativeId, int method, int child, java.util.List<java.lang.Object> params);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QAccessibleInterface.Target navigate(com.trolltech.qt.gui.QAccessible.RelationFlag rel, int entry)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_navigate_RelationFlag_int_nativepointer(nativeId(), rel.value(), entry);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface.Target __qt_navigate_RelationFlag_int_nativepointer(long __this__nativeId, int rel, int entry);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect rect(int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect_int(nativeId(), child);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect_int(long __this__nativeId, int child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QAccessible.Relation relationTo(int child, com.trolltech.qt.gui.QAccessibleInterface other, int otherChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAccessible.Relation(__qt_relationTo_int_QAccessibleInterface_int(nativeId(), child, other == null ? 0 : other.nativeId(), otherChild));
    }
    @QtBlockedSlot
    native int __qt_relationTo_int_QAccessibleInterface_int(long __this__nativeId, int child, long other, int otherChild);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QAccessible.Role role(int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAccessible.Role.resolve(__qt_role_int(nativeId(), child));
    }
    @QtBlockedSlot
    native int __qt_role_int(long __this__nativeId, int child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QAccessible.State state(int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAccessible.State(__qt_state_int(nativeId(), child));
    }
    @QtBlockedSlot
    native int __qt_state_int(long __this__nativeId, int child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String text(com.trolltech.qt.gui.QAccessible.Text t, int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_Text_int(nativeId(), t.value(), child);
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_Text_int(long __this__nativeId, int t, int child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native QAccessibleWidgetEx fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleWidgetEx(QPrivateConstructor p) { super(p); } 
}
