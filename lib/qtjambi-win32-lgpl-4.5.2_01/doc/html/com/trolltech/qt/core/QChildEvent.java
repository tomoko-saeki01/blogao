package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QChildEvent class contains event parameters for child object events. Child events are sent immediately to objects when children are added or removed. <p>In both cases you can only rely on the child being a {@link com.trolltech.qt.core.QObject QObject} (or, if {@link com.trolltech.qt.core.QObject#isWidgetType() QObject::isWidgetType()} returns true, a {@link com.trolltech.qt.gui.QWidget QWidget}). This is because in the {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildAdded } case the child is not yet fully constructed; in the {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildRemoved } case it might have already been destructed. <p>The handler for these events is {@link com.trolltech.qt.core.QObject#childEvent(com.trolltech.qt.core.QChildEvent) QObject::childEvent()}.
*/
@QtJambiGeneratedClass
public class QChildEvent extends com.trolltech.qt.core.QEvent
{

/**
Constructs a child event object of a particular <tt>type</tt> for the <tt>child</tt>. <p><tt>type</tt> can be {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildAdded }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildRemoved }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildPolished }, or {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildRemoved }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QChildEvent#child() child()}. <br></DD></DT>
*/

    public QChildEvent(com.trolltech.qt.core.QEvent.Type type, com.trolltech.qt.core.QObject child){
        super((QPrivateConstructor)null);
        __qt_QChildEvent_Type_QObject(type.value(), child == null ? 0 : child.nativeId());
    }

    native void __qt_QChildEvent_Type_QObject(int type, long child);

/**
Returns true if {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildAdded }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean added()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_added(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_added(long __this__nativeId);

/**
Returns the child object that was added or removed.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject child()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_child(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_child(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildPolished }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean polished()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_polished(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_polished(long __this__nativeId);

/**
Returns true if {@link com.trolltech.qt.core.QEvent#type() type()} is {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildRemoved }; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean removed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removed(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_removed(long __this__nativeId);

/**
@exclude
*/

    public static native QChildEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QChildEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QChildEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(type=" + type().name() + ")";
    }
}
