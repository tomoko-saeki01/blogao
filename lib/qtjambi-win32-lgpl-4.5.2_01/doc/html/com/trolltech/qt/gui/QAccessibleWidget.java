package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessibleWidget class implements the {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} for QWidgets. This class is convenient to use as a base class for custom implementations of QAccessibleInterfaces that provide information about widget objects. <p>The class provides functions to retrieve the {@link com.trolltech.qt.gui.QAccessibleWidget#parentObject() parentObject()} (the widget's parent widget), and the associated {@link com.trolltech.qt.gui.QAccessibleWidget#widget() widget()}. Controlling signals can be added with {@link com.trolltech.qt.gui.QAccessibleWidget#addControllingSignal(java.lang.String) addControllingSignal()}, and setters are provided for various aspects of the interface implementation, for example {@link com.trolltech.qt.gui.QAccessibleWidget#setValue(java.lang.String) setValue()}, {@link com.trolltech.qt.gui.QAccessibleWidget#setDescription(java.lang.String) setDescription()}, {@link com.trolltech.qt.gui.QAccessibleWidget#setAccelerator(java.lang.String) setAccelerator()}, and {@link com.trolltech.qt.gui.QAccessibleWidget#setHelp(java.lang.String) setHelp()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible QAccessible}, and {@link com.trolltech.qt.gui.QAccessibleObject QAccessibleObject}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAccessibleWidget extends com.trolltech.qt.gui.QAccessibleObject
{


/**
Creates a QAccessibleWidget object for widget <tt>w</tt>. <tt>role</tt> and <tt>name</tt> are optional parameters that set the object's role and name properties.
*/

    public QAccessibleWidget(com.trolltech.qt.gui.QWidget o, com.trolltech.qt.gui.QAccessible.Role r) {
        this(o, r, (java.lang.String)null);
    }

/**
Creates a QAccessibleWidget object for widget <tt>w</tt>. <tt>role</tt> and <tt>name</tt> are optional parameters that set the object's role and name properties.
*/

    public QAccessibleWidget(com.trolltech.qt.gui.QWidget o) {
        this(o, com.trolltech.qt.gui.QAccessible.Role.Client, (java.lang.String)null);
    }
/**
Creates a QAccessibleWidget object for widget <tt>w</tt>. <tt>role</tt> and <tt>name</tt> are optional parameters that set the object's role and name properties.
*/

    public QAccessibleWidget(com.trolltech.qt.gui.QWidget o, com.trolltech.qt.gui.QAccessible.Role r, java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QAccessibleWidget_QWidget_Role_String(o == null ? 0 : o.nativeId(), r.value(), name);
    }

    native void __qt_QAccessibleWidget_QWidget_Role_String(long o, int r, java.lang.String name);

/**
Registers <tt>signal</tt> as a controlling signal. <p>An object is a Controller to any other object connected to a controlling signal.
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
Returns the associated widget's parent object, which is either the parent widget, or qApp for top-level widgets.
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
Sets the accelerator of this interface implementation to <tt>accel</tt>. <p>The default implementation of {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} returns the set value for the Accelerator text. <p>Note that the object wrapped by this interface is not modified.
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
Sets the description of this interface implementation to <tt>desc</tt>. <p>The default implementation of {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} returns the set value for the Description text. <p>Note that the object wrapped by this interface is not modified.
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
Sets the help of this interface implementation to <tt>help</tt>. <p>The default implementation of {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} returns the set value for the Help text. <p>Note that the object wrapped by this interface is not modified.
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
Sets the value of this interface implementation to <tt>value</tt>. <p>The default implementation of {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} returns the set value for the Value text. <p>Note that the object wrapped by this interface is not modified.
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
Returns the associated widget.
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

    @QtBlockedSlot
    public int userActionCount(int child)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userActionCount_int(nativeId(), child);
    }
    @QtBlockedSlot
    native int __qt_userActionCount_int(long __this__nativeId, int child);

/**
@exclude
*/

    public static native QAccessibleWidget fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleWidget(QPrivateConstructor p) { super(p); } 
}
