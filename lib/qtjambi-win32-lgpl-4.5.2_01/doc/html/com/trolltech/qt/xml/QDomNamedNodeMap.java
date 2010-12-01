package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomNamedNodeMap class contains a collection of nodes that can be accessed by name. Note that QDomNamedNodeMap does not inherit from {@link com.trolltech.qt.xml.QDomNodeList QDomNodeList}. QDomNamedNodeMaps do not provide any specific node ordering. Although nodes in a QDomNamedNodeMap may be accessed by an ordinal index, this is simply to allow a convenient enumeration of the contents of a QDomNamedNodeMap, and does not imply that the DOM specifies an ordering of the nodes. <p>The QDomNamedNodeMap is used in three places: <ol><li> {@link com.trolltech.qt.xml.QDomDocumentType#entities() QDomDocumentType::entities()} returns a map of all entities described in the DTD.</li><li> {@link com.trolltech.qt.xml.QDomDocumentType#notations() QDomDocumentType::notations()} returns a map of all notations described in the DTD.</li><li> QDomNode::attributes() returns a map of all attributes of an element.</li></ol> Items in the map are identified by the name which QDomNode::name() returns. Nodes are retrieved using {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItem(java.lang.String) namedItem()}, {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItemNS(java.lang.String, java.lang.String) namedItemNS()} or {@link com.trolltech.qt.xml.QDomNamedNodeMap#item(int) item()}. New nodes are inserted with {@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItem(com.trolltech.qt.xml.QDomNode) setNamedItem()} or {@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItemNS(com.trolltech.qt.xml.QDomNode) setNamedItemNS()} and removed with {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItem(java.lang.String) removeNamedItem()} or {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItemNS(java.lang.String, java.lang.String) removeNamedItemNS()}. Use {@link com.trolltech.qt.xml.QDomNamedNodeMap#contains(java.lang.String) contains()} to see if an item with the given name is in the named node map. The number of items is returned by {@link com.trolltech.qt.xml.QDomNamedNodeMap#length() length()}. <p>Terminology: in this class we use "item" and "node" interchangeably.
*/
@QtJambiGeneratedClass
public class QDomNamedNodeMap extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty named node map.
*/

    public QDomNamedNodeMap(){
        super((QPrivateConstructor)null);
        __qt_QDomNamedNodeMap();
    }

    native void __qt_QDomNamedNodeMap();

/**
Constructs a copy of <tt>n</tt>.
*/

    public QDomNamedNodeMap(com.trolltech.qt.xml.QDomNamedNodeMap arg__1){
        super((QPrivateConstructor)null);
        __qt_QDomNamedNodeMap_QDomNamedNodeMap(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDomNamedNodeMap_QDomNamedNodeMap(long arg__1);

/**
Returns true if the map contains a node called <tt>name</tt>; otherwise returns false. <p><b>Note:</b> This function does not take the presence of namespaces into account. Use {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItemNS(java.lang.String, java.lang.String) namedItemNS()} to test whether the map contains a node with a specific namespace URI and name.
*/

    @QtBlockedSlot
    public final boolean contains(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_contains_String(long __this__nativeId, java.lang.String name);

/**
This function is provided for Qt API consistency. It is equivalent to {@link com.trolltech.qt.xml.QDomNamedNodeMap#length() length()}.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns true if the map is empty; otherwise returns false. This function is provided for Qt API consistency.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Retrieves the node at position <tt>index</tt>. <p>This can be used to iterate over the map. Note that the nodes in the map are ordered arbitrarily. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#length() length()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode item(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_item_int(long __this__nativeId, int index);

/**
Returns the number of nodes in the map. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#item(int) item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

/**
Returns the node called <tt>name</tt>. <p>If the named node map does not contain such a node, a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} is returned. A node's name is the name returned by {@link com.trolltech.qt.xml.QDomNode#nodeName() QDomNode::nodeName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItem(com.trolltech.qt.xml.QDomNode) setNamedItem()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItemNS(java.lang.String, java.lang.String) namedItemNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode namedItem(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namedItem_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_namedItem_String(long __this__nativeId, java.lang.String name);

/**
Returns the node associated with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>. <p>If the map does not contain such a node, a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItemNS(com.trolltech.qt.xml.QDomNode) setNamedItemNS()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItem(java.lang.String) namedItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode namedItemNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namedItemNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_namedItemNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QDomNamedNodeMap arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDomNamedNodeMap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDomNamedNodeMap(long __this__nativeId, long arg__1);

/**
Removes the node called <tt>name</tt> from the map. <p>The function returns the removed node or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} if the map did not contain a node called <tt>name</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItem(com.trolltech.qt.xml.QDomNode) setNamedItem()}, {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItem(java.lang.String) namedItem()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItemNS(java.lang.String, java.lang.String) removeNamedItemNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode removeNamedItem(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeNamedItem_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_removeNamedItem_String(long __this__nativeId, java.lang.String name);

/**
Removes the node with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt> from the map. <p>The function returns the removed node or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} if the map did not contain a node with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItemNS(com.trolltech.qt.xml.QDomNode) setNamedItemNS()}, {@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItemNS(java.lang.String, java.lang.String) namedItemNS()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItem(java.lang.String) removeNamedItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode removeNamedItemNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeNamedItemNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_removeNamedItemNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

/**
Inserts the node <tt>newNode</tt> into the named node map. The name used by the map is the node name of <tt>newNode</tt> as returned by {@link com.trolltech.qt.xml.QDomNode#nodeName() QDomNode::nodeName()}. <p>If the new node replaces an existing node, i.e. the map contains a node with the same name, the replaced node is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItem(java.lang.String) namedItem()}, {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItem(java.lang.String) removeNamedItem()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItemNS(com.trolltech.qt.xml.QDomNode) setNamedItemNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode setNamedItem(com.trolltech.qt.xml.QDomNode newNode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNamedItem_QDomNode(nativeId(), newNode == null ? 0 : newNode.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_setNamedItem_QDomNode(long __this__nativeId, long newNode);

/**
Inserts the node <tt>newNode</tt> in the map. If a node with the same namespace URI and the same local name already exists in the map, it is replaced by <tt>newNode</tt>. If the new node replaces an existing node, the replaced node is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNamedNodeMap#namedItemNS(java.lang.String, java.lang.String) namedItemNS()}, {@link com.trolltech.qt.xml.QDomNamedNodeMap#removeNamedItemNS(java.lang.String, java.lang.String) removeNamedItemNS()}, and {@link com.trolltech.qt.xml.QDomNamedNodeMap#setNamedItem(com.trolltech.qt.xml.QDomNode) setNamedItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode setNamedItemNS(com.trolltech.qt.xml.QDomNode newNode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNamedItemNS_QDomNode(nativeId(), newNode == null ? 0 : newNode.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_setNamedItemNS_QDomNode(long __this__nativeId, long newNode);

/**
This function is provided for Qt API consistency. It is equivalent to {@link com.trolltech.qt.xml.QDomNamedNodeMap#length() length()}.
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
@exclude
*/

    public static native QDomNamedNodeMap fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomNamedNodeMap(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomNamedNodeMap array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QDomNamedNodeMap)
        return operator_equal((com.trolltech.qt.xml.QDomNamedNodeMap) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomNamedNodeMap clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomNamedNodeMap __qt_clone(long __this_nativeId);
}
