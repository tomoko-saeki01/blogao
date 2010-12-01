package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QXmlStreamEntityResolver class provides an entity resolver for a {@link com.trolltech.qt.xml.QXmlStreamReader QXmlStreamReader}.
*/
@QtJambiGeneratedClass
public class QXmlStreamEntityResolver extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QXmlStreamEntityResolver(){
        super((QPrivateConstructor)null);
        __qt_QXmlStreamEntityResolver();
    }

    native void __qt_QXmlStreamEntityResolver();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String resolveEntity(java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolveEntity_String_String(nativeId(), publicId, systemId);
    }
    @QtBlockedSlot
    native java.lang.String __qt_resolveEntity_String_String(long __this__nativeId, java.lang.String publicId, java.lang.String systemId);

/**
Resolves the undeclared entity <tt>name</tt> and returns its replacement text. If the entity is also unknown to the entity resolver, it returns an empty string. <p>The default implementation always returns an empty string.
*/

    @QtBlockedSlot
    public java.lang.String resolveUndeclaredEntity(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolveUndeclaredEntity_String(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.String __qt_resolveUndeclaredEntity_String(long __this__nativeId, java.lang.String name);

/**
@exclude
*/

    public static native QXmlStreamEntityResolver fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlStreamEntityResolver(QPrivateConstructor p) { super(p); } 
}
