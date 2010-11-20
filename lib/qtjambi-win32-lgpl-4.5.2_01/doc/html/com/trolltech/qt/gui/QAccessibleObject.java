package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessibleObject class implements parts of the {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} for QObjects. This class is mainly provided for convenience. All subclasses of the {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} that provide implementations of non-widget objects should use this class as their base class. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible QAccessible}, and {@link com.trolltech.qt.gui.QAccessibleWidget QAccessibleWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAccessibleObject extends com.trolltech.qt.gui.QAccessibleInterface
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAccessibleObject {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int childAt(int x, int y) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childAt_int_int(nativeId(), x, y);
        }

        @Override
        @QtBlockedSlot
        public int childCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int indexOfChild(com.trolltech.qt.gui.QAccessibleInterface arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_indexOfChild_QAccessibleInterface(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface.Target navigate(com.trolltech.qt.gui.QAccessible.RelationFlag relation, int index) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_navigate_RelationFlag_int_nativepointer(nativeId(), relation.value(), index);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.Relation relationTo(int child, com.trolltech.qt.gui.QAccessibleInterface other, int otherChild) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return new com.trolltech.qt.gui.QAccessible.Relation(super.__qt_relationTo_int_QAccessibleInterface_int(nativeId(), child, other == null ? 0 : other.nativeId(), otherChild));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.Role role(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.gui.QAccessible.Role.resolve(super.__qt_role_int(nativeId(), child));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.State state(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return new com.trolltech.qt.gui.QAccessible.State(super.__qt_state_int(nativeId(), child));
        }

        @Override
        @QtBlockedSlot
        public java.lang.String text(com.trolltech.qt.gui.QAccessible.Text t, int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_text_Text_int(nativeId(), t.value(), child);
        }
    }


/**
Creates a QAccessibleObject for <tt>object</tt>.
*/

    public QAccessibleObject(com.trolltech.qt.core.QObject object){
        super((QPrivateConstructor)null);
        __qt_QAccessibleObject_QObject(object == null ? 0 : object.nativeId());
    }

    native void __qt_QAccessibleObject_QObject(long object);

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
    public boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QObject object()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_object(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_object(long __this__nativeId);

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
    public void setText(com.trolltech.qt.gui.QAccessible.Text t, int child, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_Text_int_String(nativeId(), t.value(), child, text);
    }
    @QtBlockedSlot
    native void __qt_setText_Text_int_String(long __this__nativeId, int t, int child, java.lang.String text);

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

    @QtBlockedSlot
    native int __qt_childAt_int_int(long __this__nativeId, int x, int y);

    @QtBlockedSlot
    native int __qt_childCount(long __this__nativeId);

    @QtBlockedSlot
    native int __qt_indexOfChild_QAccessibleInterface(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface.Target __qt_navigate_RelationFlag_int_nativepointer(long __this__nativeId, int relation, int index);

    @QtBlockedSlot
    native int __qt_relationTo_int_QAccessibleInterface_int(long __this__nativeId, int child, long other, int otherChild);

    @QtBlockedSlot
    native int __qt_role_int(long __this__nativeId, int child);

    @QtBlockedSlot
    native int __qt_state_int(long __this__nativeId, int child);

    @QtBlockedSlot
    native java.lang.String __qt_text_Text_int(long __this__nativeId, int t, int child);

/**
@exclude
*/

    public static native QAccessibleObject fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleObject(QPrivateConstructor p) { super(p); } 
}
