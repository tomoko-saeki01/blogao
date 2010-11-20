package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomDocumentType class is the representation of the DTD in the document tree. The QDomDocumentType class allows read-only access to some of the data structures in the DTD: it can return a map of all {@link com.trolltech.qt.xml.QDomDocumentType#entities() entities()} and {@link com.trolltech.qt.xml.QDomDocumentType#notations() notations()}. In addition the function {@link com.trolltech.qt.xml.QDomDocumentType#name() name()} returns the name of the document type as specified in the &lt;!DOCTYPE name&gt; tag. This class also provides the {@link com.trolltech.qt.xml.QDomDocumentType#publicId() publicId()}, {@link com.trolltech.qt.xml.QDomDocumentType#systemId() systemId()} and {@link com.trolltech.qt.xml.QDomDocumentType#internalSubset() internalSubset()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument QDomDocument}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDomDocumentType extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Creates an empty QDomDocumentType object.
*/

    public QDomDocumentType(){
        super((QPrivateConstructor)null);
        __qt_QDomDocumentType();
    }

    native void __qt_QDomDocumentType();

/**
Constructs a copy of <tt>n</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomDocumentType(com.trolltech.qt.xml.QDomDocumentType x){
        super((QPrivateConstructor)null);
        __qt_QDomDocumentType_QDomDocumentType(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomDocumentType_QDomDocumentType(long x);

/**
Returns a map of all entities described in the DTD.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNamedNodeMap entities()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entities(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNamedNodeMap __qt_entities(long __this__nativeId);

/**
Returns the internal subset of the document type or an empty string if there is no internal subset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocumentType#publicId() publicId()}, and {@link com.trolltech.qt.xml.QDomDocumentType#systemId() systemId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String internalSubset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_internalSubset(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_internalSubset(long __this__nativeId);

/**
Returns the name of the document type as specified in the &lt;!DOCTYPE name&gt; tag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#nodeName() nodeName()}. <br></DD></DT>
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
Returns a map of all notations described in the DTD.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNamedNodeMap notations()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notations(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNamedNodeMap __qt_notations(long __this__nativeId);

/**
Returns the public identifier of the external DTD subset or an empty string if there is no public identifier. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocumentType#systemId() systemId()}, {@link com.trolltech.qt.xml.QDomDocumentType#internalSubset() internalSubset()}, and {@link com.trolltech.qt.xml.QDomImplementation#createDocumentType(java.lang.String, java.lang.String, java.lang.String) QDomImplementation::createDocumentType()}. <br></DD></DT>
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
Returns the system identifier of the external DTD subset or an empty string if there is no system identifier. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocumentType#publicId() publicId()}, {@link com.trolltech.qt.xml.QDomDocumentType#internalSubset() internalSubset()}, and {@link com.trolltech.qt.xml.QDomImplementation#createDocumentType(java.lang.String, java.lang.String, java.lang.String) QDomImplementation::createDocumentType()}. <br></DD></DT>
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

    public static native QDomDocumentType fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomDocumentType(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomDocumentType array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomDocumentType clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomDocumentType __qt_clone(long __this_nativeId);
}
