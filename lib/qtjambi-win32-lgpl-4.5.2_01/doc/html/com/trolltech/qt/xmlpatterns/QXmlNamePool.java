package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlNamePool class is a table of shared strings referenced by instances of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName}. QXmlNamePool is used to optimize operations on instances of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName}. An instance of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} represents an XML name in a way that allows the XML name to be compared and passed around efficiently. The efficiency is achieved by storing the strings comprising the XML names in an instance of QXmlNamePool, where they are mapped to binary identifiers, which are then packed into a key which is stored in the {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName}. <p>This means that each instance of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} is tied to the name pool it was created with, and that name pool should be kept in scope and used to create all instances of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} that might be compared. Note also that the name pool is required if you must reconstitute the {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} as text, or if you must access any of its component strings, so although instances of {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} can be compared without reference to a name pool, the name pool must be kept in scope if the name's strings must be accessed later. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName}, and {@link com.trolltech.qt.xmlpatterns.QXmlQuery#namePool() QXmlQuery::namePool()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlNamePool extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty name pool.
*/

    public QXmlNamePool(){
        super((QPrivateConstructor)null);
        __qt_QXmlNamePool();
    }

    native void __qt_QXmlNamePool();

/**
Constructs a copy of the <tt>other</tt> name pool.
*/

    public QXmlNamePool(com.trolltech.qt.xmlpatterns.QXmlNamePool other){
        super((QPrivateConstructor)null);
        __qt_QXmlNamePool_QXmlNamePool(other == null ? 0 : other.nativeId());
    }

    native void __qt_QXmlNamePool_QXmlNamePool(long other);

/**
@exclude
*/

    public static native QXmlNamePool fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlNamePool(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlNamePool array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlNamePool clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlNamePool __qt_clone(long __this_nativeId);
}
