package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomDocumentFragment class is a tree of QDomNodes which is not usually a complete {@link com.trolltech.qt.xml.QDomDocument QDomDocument}. If you want to do complex tree operations it is useful to have a lightweight class to store nodes and their relations. QDomDocumentFragment stores a subtree of a document which does not necessarily represent a well-formed XML document. <p>QDomDocumentFragment is also useful if you want to group several nodes in a list and insert them all together as children of some node. In these cases QDomDocumentFragment can be used as a temporary container for this list of children. <p>The most important feature of QDomDocumentFragment is that it is treated in a special way by {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::replaceChild()} and {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}: instead of inserting the fragment itself, all the fragment's children are inserted.
*/
@QtJambiGeneratedClass
public class QDomDocumentFragment extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty document fragment.
*/

    public QDomDocumentFragment(){
        super((QPrivateConstructor)null);
        __qt_QDomDocumentFragment();
    }

    native void __qt_QDomDocumentFragment();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomDocumentFragment(com.trolltech.qt.xml.QDomDocumentFragment x){
        super((QPrivateConstructor)null);
        __qt_QDomDocumentFragment_QDomDocumentFragment(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomDocumentFragment_QDomDocumentFragment(long x);

/**
@exclude
*/

    public static native QDomDocumentFragment fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomDocumentFragment(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomDocumentFragment array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomDocumentFragment clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomDocumentFragment __qt_clone(long __this_nativeId);
}
