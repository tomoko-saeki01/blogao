package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlItem class contains either an XML node or an atomic value. In XQuery, all expressions evaluate to a sequence of items, where each item is either an XML node or an atomic value. The query in the following snippet evaluates to sequence of five items.<pre class="snippet">&lt;aNode/&gt;,
xs:base64Binary("FFFF"),
current-date(),
3e3, (: A floating point value :)
attribute {"name"} {()}
</pre> The five items are: An element, an atomic value (binary data encoded in base64), a date, a float, and an attribute. <p>QXmlItem is the class that represents these XQuery items in the {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} API. A non-null instance of QXmlItem is either a node or an atomic value. Calling {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() isNode()} or {@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() isAtomicValue()} tells you which it is. Atomic values are represented elsewhere in the Qt API as instances of {@link com.trolltech.qt.QVariant QVariant}, and an instance of QXmlItem that represents an atomic value can be converted to a {@link com.trolltech.qt.QVariant QVariant} by calling {@link com.trolltech.qt.xmlpatterns.QXmlItem#toAtomicValue() toAtomicValue()}. A QXmlItem that wraps a node is represented elsewhere as an instance of {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex}. A node QXmlItem can be converted to a {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} by calling {@link com.trolltech.qt.xmlpatterns.QXmlItem#toNodeModelIndex() toNodeModelIndex()}. <p>A default constructed QXmlItem instance is neither a node nor an atomic value. It is considered null, in which case {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNull() isNull()} returns true. <p>An instance of QXmlItem will be left dangling if the {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel XML node model} it refers to is deleted, if it is a {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex}.
*/
@QtJambiGeneratedClass
public class QXmlItem extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null QXmlItem that is neither a node nor an atomic value. {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNull() isNull()} returns true for a default constructed instance.
*/

    public QXmlItem(){
        super((QPrivateConstructor)null);
        __qt_QXmlItem();
    }

    native void __qt_QXmlItem();

/**
Constructs an atomic value QXmlItem with <tt>atomicValue</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() isAtomicValue()}. <br></DD></DT>
*/

    public QXmlItem(java.lang.Object atomicValue){
        super((QPrivateConstructor)null);
        __qt_QXmlItem_Object(atomicValue);
    }

    native void __qt_QXmlItem_Object(java.lang.Object atomicValue);

/**
The copy constructor constructs a copy of <tt>other</tt>.
*/

    public QXmlItem(com.trolltech.qt.xmlpatterns.QXmlItem other){
        super((QPrivateConstructor)null);
        __qt_QXmlItem_QXmlItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QXmlItem_QXmlItem(long other);

/**
Constructs a node QXmlItem that is a copy of <tt>node</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() isNode()}. <br></DD></DT>
*/

    public QXmlItem(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex node){
        super((QPrivateConstructor)null);
        __qt_QXmlItem_QXmlNodeModelIndex(node == null ? 0 : node.nativeId());
    }

    native void __qt_QXmlItem_QXmlNodeModelIndex(long node);

/**
Returns true if this item is an atomic value. Returns false if it is a node or null. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isNull() isNull()}, and {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() isNode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAtomicValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAtomicValue(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAtomicValue(long __this__nativeId);

/**
Returns true if this item is a Node. Returns false if it is an atomic value or null. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isNull() isNull()}, and {@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() isAtomicValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNode(long __this__nativeId);

/**
Returns true if this QXmlItem is neither a node nor an atomic value. Default constructed instances of QXmlItem are null.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
If this QXmlItem represents an atomic value, it is converted to an appropriate {@link com.trolltech.qt.QVariant QVariant} and returned. If this QXmlItem is not an atomic value, the return value is a default constructed {@link com.trolltech.qt.QVariant QVariant}. You can call {@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() isAtomicValue()} to test whether the item is an atomic value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() isAtomicValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object toAtomicValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toAtomicValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_toAtomicValue(long __this__nativeId);

/**
If this QXmlItem represents a node, it returns the item as a {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex}. If this QXmlItem is not a node, the return value is undefined. You can call {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() isNode()} to test whether the item is a node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() isNode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex toNodeModelIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toNodeModelIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_toNodeModelIndex(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlItem(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlItem array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlItem clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlItem __qt_clone(long __this_nativeId);
}
