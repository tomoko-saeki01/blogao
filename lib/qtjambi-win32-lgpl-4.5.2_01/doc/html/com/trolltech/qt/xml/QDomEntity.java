package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomEntity class represents an XML entity. This class represents an entity in an XML document, either parsed or unparsed. Note that this models the entity itself not the entity declaration. <p>DOM does not support editing entity nodes; if a user wants to make changes to the contents of an entity, every related {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference} node must be replaced in the DOM tree by a clone of the entity's contents, and then the desired changes must be made to each of the clones instead. All the descendants of an entity node are read-only. <p>An entity node does not have any parent. <p>You can access the entity's {@link com.trolltech.qt.xml.QDomEntity#publicId() publicId()}, {@link com.trolltech.qt.xml.QDomEntity#systemId() systemId()} and {@link com.trolltech.qt.xml.QDomEntity#notationName() notationName()} when available. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomEntity extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty entity.
*/

    public QDomEntity(){
        super((QPrivateConstructor)null);
        __qt_QDomEntity();
    }

    native void __qt_QDomEntity();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomEntity(com.trolltech.qt.xml.QDomEntity x){
        super((QPrivateConstructor)null);
        __qt_QDomEntity_QDomEntity(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomEntity_QDomEntity(long x);

/**
For unparsed entities this function returns the name of the notation for the entity. For parsed entities this function returns an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String notationName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notationName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_notationName(long __this__nativeId);

/**
Returns the public identifier associated with this entity. If the public identifier was not specified an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String publicId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_publicId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_publicId(long __this__nativeId);

/**
Returns the system identifier associated with this entity. If the system identifier was not specified an empty string is returned.
*/

    @QtBlockedSlot
    public final java.lang.String systemId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_systemId(long __this__nativeId);

/**
@exclude
*/

    public static native QDomEntity fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomEntity(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomEntity array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomEntity clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomEntity __qt_clone(long __this_nativeId);
}
