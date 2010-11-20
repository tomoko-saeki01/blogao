package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomNotation class represents an XML notation. A notation either declares, by name, the format of an unparsed entity (see section 4.7 of the XML 1.0 specification), or is used for formal declaration of processing instruction targets (see section 2.6 of the XML 1.0 specification). <p>DOM does not support editing notation nodes; they are therefore read-only. <p>A notation node does not have any parent. <p>You can retrieve the {@link com.trolltech.qt.xml.QDomNotation#publicId() publicId()} and {@link com.trolltech.qt.xml.QDomNotation#systemId() systemId()} from a notation node. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomNotation extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructor.
*/

    public QDomNotation(){
        super((QPrivateConstructor)null);
        __qt_QDomNotation();
    }

    native void __qt_QDomNotation();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomNotation(com.trolltech.qt.xml.QDomNotation x){
        super((QPrivateConstructor)null);
        __qt_QDomNotation_QDomNotation(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomNotation_QDomNotation(long x);

/**
Returns the public identifier of this notation.
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
Returns the system identifier of this notation.
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

    public static native QDomNotation fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomNotation(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomNotation array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomNotation clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomNotation __qt_clone(long __this_nativeId);
}
