package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QDynamicPropertyChangeEvent class contains event parameters for dynamic property change events. Dynamic property change events are sent to objects when properties are dynamically added, changed or removed using {@link com.trolltech.qt.core.QObject#setProperty(java.lang.String, java.lang.Object) QObject::setProperty()}.
*/
@QtJambiGeneratedClass
public class QDynamicPropertyChangeEvent extends com.trolltech.qt.core.QEvent
{

/**
Constructs a dynamic property change event object with the property name set to <tt>name</tt>.
*/

    public QDynamicPropertyChangeEvent(com.trolltech.qt.core.QByteArray name){
        super((QPrivateConstructor)null);
        __qt_QDynamicPropertyChangeEvent_QByteArray(name == null ? 0 : name.nativeId());
    }

    native void __qt_QDynamicPropertyChangeEvent_QByteArray(long name);

/**
Returns the name of the dynamic property that was added, changed or removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#setProperty(java.lang.String, java.lang.Object) QObject::setProperty()}, and {@link com.trolltech.qt.core.QObject#dynamicPropertyNames() QObject::dynamicPropertyNames()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray propertyName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyName(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_propertyName(long __this__nativeId);

/**
@exclude
*/

    public static native QDynamicPropertyChangeEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDynamicPropertyChangeEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QDynamicPropertyChangeEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(type=" + type().name() + ")";
    }
}
