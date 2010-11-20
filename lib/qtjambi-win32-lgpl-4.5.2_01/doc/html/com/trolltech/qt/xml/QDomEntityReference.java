package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomEntityReference class represents an XML entity reference. A QDomEntityReference object may be inserted into the DOM tree when an entity reference is in the source document, or when the user wishes to insert an entity reference. <p>Note that character references and references to predefined entities are expanded by the XML processor so that characters are represented by their Unicode equivalent rather than by an entity reference. <p>Moreover, the XML processor may completely expand references to entities while building the DOM tree, instead of providing QDomEntityReference objects. <p>If it does provide such objects, then for a given entity reference node, it may be that there is no entity node representing the referenced entity; but if such an entity exists, then the child list of the entity reference node is the same as that of the entity node. As with the entity node, all descendants of the entity reference are read-only. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomEntityReference extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty entity reference. Use {@link com.trolltech.qt.xml.QDomDocument#createEntityReference(java.lang.String) QDomDocument::createEntityReference()} to create a entity reference with content.
*/

    public QDomEntityReference(){
        super((QPrivateConstructor)null);
        __qt_QDomEntityReference();
    }

    native void __qt_QDomEntityReference();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomEntityReference(com.trolltech.qt.xml.QDomEntityReference x){
        super((QPrivateConstructor)null);
        __qt_QDomEntityReference_QDomEntityReference(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomEntityReference_QDomEntityReference(long x);

/**
@exclude
*/

    public static native QDomEntityReference fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomEntityReference(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomEntityReference array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomEntityReference clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomEntityReference __qt_clone(long __this_nativeId);
}
