package com.trolltech.qt.webkit;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QWebPluginFactory_Plugin extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QWebPluginFactory_Plugin(){
        super((QPrivateConstructor)null);
        __qt_QWebPluginFactory_Plugin();
    }

    native void __qt_QWebPluginFactory_Plugin();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setDescription(java.lang.String description)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescription_String(nativeId(), description);
    }
    @QtBlockedSlot
    native void __qt_setDescription_String(long __this__nativeId, java.lang.String description);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.lang.String description()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setName_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
@exclude
*/

    public static native QWebPluginFactory_Plugin fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebPluginFactory_Plugin(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QWebPluginFactory_Plugin array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QWebPluginFactory_Plugin clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QWebPluginFactory_Plugin __qt_clone(long __this_nativeId);
}
