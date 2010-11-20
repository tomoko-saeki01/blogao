package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomElement class represents one element in the DOM tree. Elements have a {@link com.trolltech.qt.xml.QDomElement#tagName() tagName()} and zero or more attributes associated with them. The tag name can be changed with {@link com.trolltech.qt.xml.QDomElement#setTagName(java.lang.String) setTagName()}. <p>Element attributes are represented by {@link com.trolltech.qt.xml.QDomAttr QDomAttr} objects that can be queried using the {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()} and {@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()} functions. You can set attributes with the {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()} and {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()} functions. Attributes can be removed with {@link com.trolltech.qt.xml.QDomElement#removeAttribute(java.lang.String) removeAttribute()}. There are namespace-aware equivalents to these functions, i.e. {@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()} and {@link com.trolltech.qt.xml.QDomElement#removeAttributeNS(java.lang.String, java.lang.String) removeAttributeNS()}. <p>If you want to access the text of a node use {@link com.trolltech.qt.xml.QDomElement#text() text()}, e.g. <pre class="snippet">
    QDomElement e = //...
    //...
    java.lang.String s = e.text()
</pre> The {@link com.trolltech.qt.xml.QDomElement#text() text()} function operates recursively to find the text (since not all elements contain text). If you want to find all the text in all of a node's children, iterate over the children looking for {@link com.trolltech.qt.xml.QDomText QDomText} nodes, e.g. <pre class="snippet">
    java.lang.String text = new java.lang.String();
    QDomElement element = doc.documentElement();
    for(QDomNode node = element.firstChild(); !node.isNull(); node = node.nextSibling())
    {
        QDomText t = node.toText();
        if (!t.isNull())
            text += t.data();
    }
</pre> Note that we attempt to convert each node to a text node and use {@link com.trolltech.qt.xml.QDomElement#text() text()} rather than using {@link com.trolltech.qt.xml.QDomNode#firstChild() firstChild()}.{@link com.trolltech.qt.xml.QDomNode#toText() toText()}.data() or n.{@link com.trolltech.qt.xml.QDomNode#toText() toText()}.data() directly on the node, because the node may not be a text element. <p>You can get a list of all the decendents of an element which have a specified tag name with {@link com.trolltech.qt.xml.QDomElement#elementsByTagName(java.lang.String) elementsByTagName()} or {@link com.trolltech.qt.xml.QDomElement#elementsByTagNameNS(java.lang.String, java.lang.String) elementsByTagNameNS()}. <p>To browse the elements of a dom document use {@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}, {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()} and {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}. For example, to iterate over all child elements called "entry" in a root element called "database", you can use: <pre class="snippet">
    QDomDocument doc = // ...
    QDomElement root = doc.firstChildElement("database");
    QDomElement elt = root.firstChildElement("entry");
    for (; !elt.isNull(); elt = elt.nextSiblingElelement("entry")) {
        // ...
    }
</pre> For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomElement extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty element. Use the {@link com.trolltech.qt.xml.QDomDocument#createElement(java.lang.String) QDomDocument::createElement()} function to construct elements with content.
*/

    public QDomElement(){
        super((QPrivateConstructor)null);
        __qt_QDomElement();
    }

    native void __qt_QDomElement();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomElement(com.trolltech.qt.xml.QDomElement x){
        super((QPrivateConstructor)null);
        __qt_QDomElement_QDomElement(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomElement_QDomElement(long x);


/**
Returns the attribute called <tt>name</tt>. If the attribute does not exist <tt>defValue</tt> is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, {@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}, and {@link com.trolltech.qt.xml.QDomElement#attributeNS(java.lang.String, java.lang.String) attributeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String attribute(java.lang.String name) {
        return attribute(name, (java.lang.String)null);
    }
/**
Returns the attribute called <tt>name</tt>. If the attribute does not exist <tt>defValue</tt> is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, {@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}, and {@link com.trolltech.qt.xml.QDomElement#attributeNS(java.lang.String, java.lang.String) attributeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String attribute(java.lang.String name, java.lang.String defValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attribute_String_String(nativeId(), name, defValue);
    }
    @QtBlockedSlot
    native java.lang.String __qt_attribute_String_String(long __this__nativeId, java.lang.String name, java.lang.String defValue);


/**
Returns the attribute with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>. If the attribute does not exist <tt>defValue</tt> is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}, {@link com.trolltech.qt.xml.QDomElement#attributeNodeNS(java.lang.String, java.lang.String) attributeNodeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()}, and {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String attributeNS(java.lang.String nsURI, java.lang.String localName) {
        return attributeNS(nsURI, localName, (java.lang.String)null);
    }
/**
Returns the attribute with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>. If the attribute does not exist <tt>defValue</tt> is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}, {@link com.trolltech.qt.xml.QDomElement#attributeNodeNS(java.lang.String, java.lang.String) attributeNodeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()}, and {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String attributeNS(java.lang.String nsURI, java.lang.String localName, java.lang.String defValue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeNS_String_String_String(nativeId(), nsURI, localName, defValue);
    }
    @QtBlockedSlot
    native java.lang.String __qt_attributeNS_String_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName, java.lang.String defValue);

/**
Returns the {@link com.trolltech.qt.xml.QDomAttr QDomAttr} object that corresponds to the attribute called <tt>name</tt>. If no such attribute exists a {@link com.trolltech.qt.xml.QDomNode#isNull() null attribute} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}, {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}, {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, and {@link com.trolltech.qt.xml.QDomElement#attributeNodeNS(java.lang.String, java.lang.String) attributeNodeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr attributeNode(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeNode_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_attributeNode_String(long __this__nativeId, java.lang.String name);

/**
Returns the {@link com.trolltech.qt.xml.QDomAttr QDomAttr} object that corresponds to the attribute with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>. If no such attribute exists a {@link com.trolltech.qt.xml.QDomNode#isNull() null attribute} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}, {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}, and {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr attributeNodeNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeNodeNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_attributeNodeNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

/**
Returns a {@link com.trolltech.qt.xml.QDomNamedNodeMap QDomNamedNodeMap} containing all this element's attributes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}, {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, {@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()}, and {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNamedNodeMap attributes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributes(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNamedNodeMap __qt_attributes(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.xml.QDomNodeList QDomNodeList} containing all descendants of this element named <tt>tagname</tt> encountered during a preorder traversal of the element subtree with this element as its root. The order of the elements in the returned list is the order they are encountered during the preorder traversal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#elementsByTagNameNS(java.lang.String, java.lang.String) elementsByTagNameNS()}, and {@link com.trolltech.qt.xml.QDomDocument#elementsByTagName(java.lang.String) QDomDocument::elementsByTagName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNodeList elementsByTagName(java.lang.String tagname)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementsByTagName_String(nativeId(), tagname);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNodeList __qt_elementsByTagName_String(long __this__nativeId, java.lang.String tagname);

/**
Returns a {@link com.trolltech.qt.xml.QDomNodeList QDomNodeList} containing all descendants of this element with local name <tt>localName</tt> and namespace URI <tt>nsURI</tt> encountered during a preorder traversal of the element subtree with this element as its root. The order of the elements in the returned list is the order they are encountered during the preorder traversal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#elementsByTagName(java.lang.String) elementsByTagName()}, and {@link com.trolltech.qt.xml.QDomDocument#elementsByTagNameNS(java.lang.String, java.lang.String) QDomDocument::elementsByTagNameNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNodeList elementsByTagNameNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementsByTagNameNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNodeList __qt_elementsByTagNameNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

/**
Returns true if this element has an attribute called <tt>name</tt>; otherwise returns false. <p><b>Note:</b> This function does not take the presence of namespaces into account. As a result, the specified name will be tested against fully-qualified attribute names that include any namespace prefixes that may be present. <p>Use {@link com.trolltech.qt.xml.QDomElement#hasAttributeNS(java.lang.String, java.lang.String) hasAttributeNS()} to explicitly test for attributes with specific namespaces and names.
*/

    @QtBlockedSlot
    public final boolean hasAttribute(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAttribute_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_hasAttribute_String(long __this__nativeId, java.lang.String name);

/**
Returns true if this element has an attribute with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasAttributeNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAttributeNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native boolean __qt_hasAttributeNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

/**
Removes the attribute called name <tt>name</tt> from this element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, {@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}, and {@link com.trolltech.qt.xml.QDomElement#removeAttributeNS(java.lang.String, java.lang.String) removeAttributeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeAttribute(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAttribute_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_removeAttribute_String(long __this__nativeId, java.lang.String name);

/**
Removes the attribute with the local name <tt>localName</tt> and the namespace URI <tt>nsURI</tt> from this element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}, {@link com.trolltech.qt.xml.QDomElement#attributeNS(java.lang.String, java.lang.String) attributeNS()}, and {@link com.trolltech.qt.xml.QDomElement#removeAttribute(java.lang.String) removeAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeAttributeNS(java.lang.String nsURI, java.lang.String localName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeAttributeNS_String_String(nativeId(), nsURI, localName);
    }
    @QtBlockedSlot
    native void __qt_removeAttributeNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String localName);

/**
Removes the attribute <tt>oldAttr</tt> from the element and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()}, and {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr removeAttributeNode(com.trolltech.qt.xml.QDomAttr oldAttr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeAttributeNode_QDomAttr(nativeId(), oldAttr == null ? 0 : oldAttr.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_removeAttributeNode_QDomAttr(long __this__nativeId, long oldAttr);

/**
Adds an attribute called <tt>name</tt> with value <tt>value</tt>. If an attribute with the same name exists, its value is replaced by <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attribute(java.lang.String) attribute()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}, and {@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(java.lang.String name, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_String(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_String(long __this__nativeId, java.lang.String name, java.lang.String value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttribute(java.lang.String name, double value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_double(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_double(long __this__nativeId, java.lang.String name, double value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttribute(java.lang.String name, float value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_float(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_float(long __this__nativeId, java.lang.String name, float value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttribute(java.lang.String name, int value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_int(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_int(long __this__nativeId, java.lang.String name, int value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttribute(java.lang.String name, long value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_long(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_long(long __this__nativeId, java.lang.String name, long value);

/**
Adds an attribute with the qualified name <tt>qName</tt> and the namespace URI <tt>nsURI</tt> with the value <tt>value</tt>. If an attribute with the same local name and namespace URI exists, its prefix is replaced by the prefix of <tt>qName</tt> and its value is repaced by <tt>value</tt>. <p>Although <tt>qName</tt> is the qualified name, the local name is used to decide if an existing attribute's value should be replaced. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attributeNS(java.lang.String, java.lang.String) attributeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()}, and {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttributeNS(java.lang.String nsURI, java.lang.String qName, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttributeNS_String_String_String(nativeId(), nsURI, qName, value);
    }
    @QtBlockedSlot
    native void __qt_setAttributeNS_String_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String qName, java.lang.String value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttributeNS(java.lang.String nsURI, java.lang.String qName, double value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttributeNS_String_String_double(nativeId(), nsURI, qName, value);
    }
    @QtBlockedSlot
    native void __qt_setAttributeNS_String_String_double(long __this__nativeId, java.lang.String nsURI, java.lang.String qName, double value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttributeNS(java.lang.String nsURI, java.lang.String qName, int value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttributeNS_String_String_int(nativeId(), nsURI, qName, value);
    }
    @QtBlockedSlot
    native void __qt_setAttributeNS_String_String_int(long __this__nativeId, java.lang.String nsURI, java.lang.String qName, int value);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAttributeNS(java.lang.String nsURI, java.lang.String qName, long value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttributeNS_String_String_long(nativeId(), nsURI, qName, value);
    }
    @QtBlockedSlot
    native void __qt_setAttributeNS_String_String_long(long __this__nativeId, java.lang.String nsURI, java.lang.String qName, long value);

/**
Adds the attribute <tt>newAttr</tt> to this element. <p>If the element has another attribute that has the same name as <tt>newAttr</tt>, this function replaces that attribute and returns it; otherwise the function returns a {@link com.trolltech.qt.xml.QDomNode#isNull() null attribute}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attributeNode(java.lang.String) attributeNode()}, {@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) setAttribute()}, and {@link com.trolltech.qt.xml.QDomElement#setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr) setAttributeNodeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr setAttributeNode(com.trolltech.qt.xml.QDomAttr newAttr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setAttributeNode_QDomAttr(nativeId(), newAttr == null ? 0 : newAttr.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_setAttributeNode_QDomAttr(long __this__nativeId, long newAttr);

/**
Adds the attribute <tt>newAttr</tt> to this element. <p>If the element has another attribute that has the same local name and namespace URI as <tt>newAttr</tt>, this function replaces that attribute and returns it; otherwise the function returns a {@link com.trolltech.qt.xml.QDomNode#isNull() null attribute}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#attributeNodeNS(java.lang.String, java.lang.String) attributeNodeNS()}, {@link com.trolltech.qt.xml.QDomElement#setAttributeNS(java.lang.String, java.lang.String, java.lang.String) setAttributeNS()}, and {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) setAttributeNode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr setAttributeNodeNS(com.trolltech.qt.xml.QDomAttr newAttr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setAttributeNodeNS_QDomAttr(nativeId(), newAttr == null ? 0 : newAttr.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_setAttributeNodeNS_QDomAttr(long __this__nativeId, long newAttr);

/**
Sets this element's tag name to <tt>name</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#tagName() tagName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTagName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTagName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setTagName_String(long __this__nativeId, java.lang.String name);

/**
Returns the tag name of this element. For an XML element like this: <pre class="snippet">
    &lt;img src="myimg.png"&gt;
</pre> the tagname would return "img". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setTagName(java.lang.String) setTagName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tagName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tagName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_tagName(long __this__nativeId);

/**
Returns the element's text or an empty string. <p>Example: <pre class="snippet">
    &lt;h1&gt;Hello &lt;b&gt;Qt&lt;/b&gt; &lt;![CDATA[&lt;xml is cool&gt;]]&gt;&lt;/h1&gt;
</pre> The function {@link com.trolltech.qt.xml.QDomElement#text() text()} of the QDomElement for the <tt>&lt;h1&gt;</tt> tag, will return the following text: <pre class="snippet">
    Hello Qt t;xml is coolt;
</pre> Comments are ignored by this function. It only evaluates {@link com.trolltech.qt.xml.QDomText QDomText} and {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection} objects.
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
@exclude
*/

    public static native QDomElement fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomElement(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomElement array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomElement clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomElement __qt_clone(long __this_nativeId);
}
