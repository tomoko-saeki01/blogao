package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomNode class is the base class for all the nodes in a DOM tree. Many functions in the DOM return a QDomNode. <p>You can find out the type of a node using {@link com.trolltech.qt.xml.QDomNode#isAttr() isAttr()}, {@link com.trolltech.qt.xml.QDomNode#isCDATASection() isCDATASection()}, {@link com.trolltech.qt.xml.QDomNode#isDocumentFragment() isDocumentFragment()}, {@link com.trolltech.qt.xml.QDomNode#isDocument() isDocument()}, {@link com.trolltech.qt.xml.QDomNode#isDocumentType() isDocumentType()}, {@link com.trolltech.qt.xml.QDomNode#isElement() isElement()}, {@link com.trolltech.qt.xml.QDomNode#isEntityReference() isEntityReference()}, {@link com.trolltech.qt.xml.QDomNode#isText() isText()}, {@link com.trolltech.qt.xml.QDomNode#isEntity() isEntity()}, {@link com.trolltech.qt.xml.QDomNode#isNotation() isNotation()}, {@link com.trolltech.qt.xml.QDomNode#isProcessingInstruction() isProcessingInstruction()}, {@link com.trolltech.qt.xml.QDomNode#isCharacterData() isCharacterData()} and {@link com.trolltech.qt.xml.QDomNode#isComment() isComment()}. <p>A QDomNode can be converted into one of its subclasses using {@link com.trolltech.qt.xml.QDomNode#toAttr() toAttr()}, {@link com.trolltech.qt.xml.QDomNode#toCDATASection() toCDATASection()}, {@link com.trolltech.qt.xml.QDomNode#toDocumentFragment() toDocumentFragment()}, {@link com.trolltech.qt.xml.QDomNode#toDocument() toDocument()}, {@link com.trolltech.qt.xml.QDomNode#toDocumentType() toDocumentType()}, {@link com.trolltech.qt.xml.QDomNode#toElement() toElement()}, {@link com.trolltech.qt.xml.QDomNode#toEntityReference() toEntityReference()}, {@link com.trolltech.qt.xml.QDomNode#toText() toText()}, {@link com.trolltech.qt.xml.QDomNode#toEntity() toEntity()}, {@link com.trolltech.qt.xml.QDomNode#toNotation() toNotation()}, {@link com.trolltech.qt.xml.QDomNode#toProcessingInstruction() toProcessingInstruction()}, {@link com.trolltech.qt.xml.QDomNode#toCharacterData() toCharacterData()} or {@link com.trolltech.qt.xml.QDomNode#toComment() toComment()}. You can convert a node to a null node with {@link com.trolltech.qt.xml.QDomNode#clear() clear()}. <p>Copies of the QDomNode class share their data using explicit sharing. This means that modifying one node will change all copies. This is especially useful in combination with functions which return a QDomNode, e.g. {@link com.trolltech.qt.xml.QDomNode#firstChild() firstChild()}. You can make an independent (deep) copy of the node with {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}. <p>A QDomNode can be null, much like a null pointer. Creating a copy of a null node results in another null node. It is not possible to modify a null node, but it is possible to assign another, possibly non-null node to it. In this case, the copy of the null node will remain null. You can check if a QDomNode is null by calling {@link com.trolltech.qt.xml.QDomNode#isNull() isNull()}. The empty constructor of a QDomNode (or any of the derived classes) creates a null node. <p>Nodes are inserted with {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertAfter()} or {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) appendChild()}. You can replace one node with another using {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) replaceChild()} and remove a node with {@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) removeChild()}. <p>To traverse nodes use {@link com.trolltech.qt.xml.QDomNode#firstChild() firstChild()} to get a node's first child (if any), and {@link com.trolltech.qt.xml.QDomNode#nextSibling() nextSibling()} to traverse. QDomNode also provides {@link com.trolltech.qt.xml.QDomNode#lastChild() lastChild()}, {@link com.trolltech.qt.xml.QDomNode#previousSibling() previousSibling()} and {@link com.trolltech.qt.xml.QDomNode#parentNode() parentNode()}. To find the first child node with a particular node name use {@link com.trolltech.qt.xml.QDomNode#namedItem(java.lang.String) namedItem()}. <p>To find out if a node has children use {@link com.trolltech.qt.xml.QDomNode#hasChildNodes() hasChildNodes()} and to get a list of all of a node's children use {@link com.trolltech.qt.xml.QDomNode#childNodes() childNodes()}. <p>The node's name and value (the meaning of which varies depending on its type) is returned by {@link com.trolltech.qt.xml.QDomNode#nodeName() nodeName()} and {@link com.trolltech.qt.xml.QDomNode#nodeValue() nodeValue()} respectively. The node's type is returned by {@link com.trolltech.qt.xml.QDomNode#nodeType() nodeType()}. The node's value can be set with {@link com.trolltech.qt.xml.QDomNode#setNodeValue(java.lang.String) setNodeValue()}. <p>The document to which the node belongs is returned by {@link com.trolltech.qt.xml.QDomNode#ownerDocument() ownerDocument()}. <p>Adjacent {@link com.trolltech.qt.xml.QDomText QDomText} nodes can be merged into a single node with {@link com.trolltech.qt.xml.QDomNode#normalize() normalize()}. <p>{@link com.trolltech.qt.xml.QDomElement QDomElement} nodes have attributes which can be retrieved with attributes(). <p>{@link com.trolltech.qt.xml.QDomElement QDomElement} and {@link com.trolltech.qt.xml.QDomAttr QDomAttr} nodes can have namespaces which can be retrieved with {@link com.trolltech.qt.xml.QDomNode#namespaceURI() namespaceURI()}. Their local name is retrieved with {@link com.trolltech.qt.xml.QDomNode#localName() localName()}, and their prefix with {@link com.trolltech.qt.xml.QDomNode#prefix() prefix()}. The prefix can be set with {@link com.trolltech.qt.xml.QDomNode#setPrefix(java.lang.String) setPrefix()}. <p>You can write the XML representation of the node to a text stream with {@link com.trolltech.qt.xml.QDomNode#save(com.trolltech.qt.core.QTextStream, int) save()}. <p>The following example looks for the first element in an XML document and prints the names of all the elements that are its direct children. <pre class="snippet">
    QDomDocument d = new QDomDocument();
    d.setContent(someXML);
    QDomNode n = d.firstChild();
    while (!n.isNull()) {
        if (n.isElement()) {
            QDomElement e = n.toElement();
            System.out.printf("Element name: %s\n", e.tagName());
            break;
        }
        n = n.nextSibling();
    }
</pre> For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomNode extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }
/**
This enum defines the type of the node.
*/

    public enum NodeType implements com.trolltech.qt.QtEnumerator {
/**

*/

        ElementNode(1),
/**

*/

        AttributeNode(2),
/**

*/

        TextNode(3),
/**

*/

        CDATASectionNode(4),
/**

*/

        EntityReferenceNode(5),
/**

*/

        EntityNode(6),
/**

*/

        ProcessingInstructionNode(7),
/**

*/

        CommentNode(8),
/**

*/

        DocumentNode(9),
/**

*/

        DocumentTypeNode(10),
/**

*/

        DocumentFragmentNode(11),
/**

*/

        NotationNode(12),
/**
 A {@link com.trolltech.qt.xml.QDomNode QDomNode} object, i.e. not a {@link com.trolltech.qt.xml.QDomNode QDomNode} subclass.
*/

        BaseNode(21),
/**

*/

        CharacterDataNode(22);

        NodeType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDomNode$NodeType constant with the specified <tt>int</tt>.</brief>
*/

        public static NodeType resolve(int value) {
            return (NodeType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ElementNode;
            case 2: return AttributeNode;
            case 3: return TextNode;
            case 4: return CDATASectionNode;
            case 5: return EntityReferenceNode;
            case 6: return EntityNode;
            case 7: return ProcessingInstructionNode;
            case 8: return CommentNode;
            case 9: return DocumentNode;
            case 10: return DocumentTypeNode;
            case 11: return DocumentFragmentNode;
            case 12: return NotationNode;
            case 21: return BaseNode;
            case 22: return CharacterDataNode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies how {@link com.trolltech.qt.xml.QDomNode#save(com.trolltech.qt.core.QTextStream, int) QDomNode::save()} determines what encoding to use when serializing. See also the overload of the {@link com.trolltech.qt.xml.QDomNode#save(com.trolltech.qt.core.QTextStream, int) save()} function that takes an {@link com.trolltech.qt.xml.QDomNode.EncodingPolicy EncodingPolicy }.
*/

    public enum EncodingPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The encoding is fetched from the document.
*/

        EncodingFromDocument(1),
/**
 The encoding is fetched from the {@link com.trolltech.qt.core.QTextStream QTextStream}.
*/

        EncodingFromTextStream(2);

        EncodingPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDomNode$EncodingPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static EncodingPolicy resolve(int value) {
            return (EncodingPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return EncodingFromDocument;
            case 2: return EncodingFromTextStream;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a {@link com.trolltech.qt.xml.QDomNode#isNull() null} node.
*/

    public QDomNode(){
        super((QPrivateConstructor)null);
        __qt_QDomNode();
    }

    native void __qt_QDomNode();

/**
Constructs a copy of <tt>n</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomNode(com.trolltech.qt.xml.QDomNode arg__1){
        super((QPrivateConstructor)null);
        __qt_QDomNode_QDomNode(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDomNode_QDomNode(long arg__1);

/**
Appends <tt>newChild</tt> as the node's last child. <p>If <tt>newChild</tt> is the child of another node, it is reparented to this node. If <tt>newChild</tt> is a child of this node, then its position in the list of children is changed. <p>If <tt>newChild</tt> is a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}, then the children of the fragment are removed from the fragment and appended. <p>If <tt>newChild</tt> is a {@link com.trolltech.qt.xml.QDomElement QDomElement} and this node is a {@link com.trolltech.qt.xml.QDomDocument QDomDocument} that already has an element node as a child, <tt>newChild</tt> is not added as a child and a null node is returned. <p>Calling this function on a null node(created, for example, with the default constructor) does nothing. <p>The DOM specification disallow inserting attribute nodes, but due to historical reasons QDom accept them nevertheless. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertAfter()}, {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) replaceChild()}, and {@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) removeChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode appendChild(com.trolltech.qt.xml.QDomNode newChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_appendChild_QDomNode(nativeId(), newChild == null ? 0 : newChild.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_appendChild_QDomNode(long __this__nativeId, long newChild);

/**
Returns a list of all direct child nodes. <p>Most often you will call this function on a {@link com.trolltech.qt.xml.QDomElement QDomElement} object. <p>For example, if the XML document looks like this: <pre class="snippet">
    &lt;body&gt;
    &lt;h1&gt;Heading&lt;/h1&gt;
    &lt;p&gt;Hello &lt;b&gt;you&lt;/b&gt;&lt;/p&gt;
    &lt;/body&gt;
</pre> Then the list of child nodes for the "body"-element will contain the node created by the &lt;h1&gt; tag and the node created by the &lt;p&gt; tag. <p>The nodes in the list are not copied; so changing the nodes in the list will also change the children of this node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChild() firstChild()}, and {@link com.trolltech.qt.xml.QDomNode#lastChild() lastChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNodeList childNodes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childNodes(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNodeList __qt_childNodes(long __this__nativeId);

/**
Converts the node into a null node; if it was not a null node before, its type and contents are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isNull() isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);


/**
Creates a deep (not shallow) copy of the QDomNode. <p>If <tt>deep</tt> is true, then the cloning is done recursively which means that all the node's children are deep copied too. If <tt>deep</tt> is false only the node itself is copied and the copy will have no child nodes.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode cloneNode() {
        return cloneNode((boolean)true);
    }
/**
Creates a deep (not shallow) copy of the QDomNode. <p>If <tt>deep</tt> is true, then the cloning is done recursively which means that all the node's children are deep copied too. If <tt>deep</tt> is false only the node itself is copied and the copy will have no child nodes.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode cloneNode(boolean deep)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cloneNode_boolean(nativeId(), deep);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_cloneNode_boolean(long __this__nativeId, boolean deep);

/**
For nodes created by {@link com.trolltech.qt.xml.QDomDocument#setContent(com.trolltech.qt.xml.QXmlInputSource, boolean) QDomDocument::setContent()}, this function returns the column number in the XML document where the node was parsed. Otherwise, -1 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#lineNumber() lineNumber()}, and {@link com.trolltech.qt.xml.QDomDocument#setContent(com.trolltech.qt.xml.QXmlInputSource, boolean) QDomDocument::setContent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int columnNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnNumber(long __this__nativeId);

/**
Returns the first child of the node. If there is no child node, a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} is returned. Changing the returned node will also change the node in the document tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#lastChild() lastChild()}, and {@link com.trolltech.qt.xml.QDomNode#childNodes() childNodes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode firstChild()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstChild(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_firstChild(long __this__nativeId);


/**
Returns the first child element with tag name <tt>tagName</tt> if tagName is non-empty; otherwise returns the first child element. Returns a null element if no such child exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement firstChildElement() {
        return firstChildElement((java.lang.String)null);
    }
/**
Returns the first child element with tag name <tt>tagName</tt> if tagName is non-empty; otherwise returns the first child element. Returns a null element if no such child exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement firstChildElement(java.lang.String tagName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstChildElement_String(nativeId(), tagName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_firstChildElement_String(long __this__nativeId, java.lang.String tagName);

/**
Returns true if the node has attributes; otherwise returns false. <p><DT><b>See also:</b><br><DD>attributes(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasAttributes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAttributes(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAttributes(long __this__nativeId);

/**
Returns true if the node has one or more children; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean hasChildNodes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildNodes(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasChildNodes(long __this__nativeId);

/**
Inserts the node <tt>newChild</tt> after the child node <tt>refChild</tt>. <tt>refChild</tt> must be a direct child of this node. If <tt>refChild</tt> is {@link com.trolltech.qt.xml.QDomNode#isNull() null} then <tt>newChild</tt> is appended as this node's last child. <p>If <tt>newChild</tt> is the child of another node, it is reparented to this node. If <tt>newChild</tt> is a child of this node, then its position in the list of children is changed. <p>If <tt>newChild</tt> is a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}, then the children of the fragment are removed from the fragment and inserted after <tt>refChild</tt>. <p>Returns a new reference to <tt>newChild</tt> on success or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} on failure. <p>The DOM specification disallow inserting attribute nodes, but due to historical reasons QDom accept them nevertheless. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) replaceChild()}, {@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) removeChild()}, and {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) appendChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode insertAfter(com.trolltech.qt.xml.QDomNode newChild, com.trolltech.qt.xml.QDomNode refChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertAfter_QDomNode_QDomNode(nativeId(), newChild == null ? 0 : newChild.nativeId(), refChild == null ? 0 : refChild.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_insertAfter_QDomNode_QDomNode(long __this__nativeId, long newChild, long refChild);

/**
Inserts the node <tt>newChild</tt> before the child node <tt>refChild</tt>. <tt>refChild</tt> must be a direct child of this node. If <tt>refChild</tt> is {@link com.trolltech.qt.xml.QDomNode#isNull() null} then <tt>newChild</tt> is inserted as the node's first child. <p>If <tt>newChild</tt> is the child of another node, it is reparented to this node. If <tt>newChild</tt> is a child of this node, then its position in the list of children is changed. <p>If <tt>newChild</tt> is a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}, then the children of the fragment are removed from the fragment and inserted before <tt>refChild</tt>. <p>Returns a new reference to <tt>newChild</tt> on success or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} on failure. <p>The DOM specification disallow inserting attribute nodes, but due to historical reasons QDom accept them nevertheless. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertAfter()}, {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) replaceChild()}, {@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) removeChild()}, and {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) appendChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode insertBefore(com.trolltech.qt.xml.QDomNode newChild, com.trolltech.qt.xml.QDomNode refChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertBefore_QDomNode_QDomNode(nativeId(), newChild == null ? 0 : newChild.nativeId(), refChild == null ? 0 : refChild.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_insertBefore_QDomNode_QDomNode(long __this__nativeId, long newChild, long refChild);

/**
Returns true if the node is an attribute; otherwise returns false. <p>If this function returns true, it does not imply that this object is a QDomAttribute; you can get the QDomAttribute with toAttribute(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toAttr() toAttr()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAttr()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAttr(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAttr(long __this__nativeId);

/**
Returns true if the node is a CDATA section; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}; you can get the {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection} with {@link com.trolltech.qt.xml.QDomNode#toCDATASection() toCDATASection()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toCDATASection() toCDATASection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCDATASection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCDATASection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCDATASection(long __this__nativeId);

/**
Returns true if the node is a character data node; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomCharacterData QDomCharacterData}; you can get the {@link com.trolltech.qt.xml.QDomCharacterData QDomCharacterData} with {@link com.trolltech.qt.xml.QDomNode#toCharacterData() toCharacterData()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toCharacterData() toCharacterData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCharacterData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCharacterData(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCharacterData(long __this__nativeId);

/**
Returns true if the node is a comment; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomComment QDomComment}; you can get the {@link com.trolltech.qt.xml.QDomComment QDomComment} with {@link com.trolltech.qt.xml.QDomNode#toComment() toComment()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toComment() toComment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isComment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isComment(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isComment(long __this__nativeId);

/**
Returns true if the node is a document; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomDocument QDomDocument}; you can get the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} with {@link com.trolltech.qt.xml.QDomNode#toDocument() toDocument()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toDocument() toDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDocument(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDocument(long __this__nativeId);

/**
Returns true if the node is a document fragment; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}; you can get the {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment} with {@link com.trolltech.qt.xml.QDomNode#toDocumentFragment() toDocumentFragment()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toDocumentFragment() toDocumentFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDocumentFragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDocumentFragment(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDocumentFragment(long __this__nativeId);

/**
Returns true if the node is a document type; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType}; you can get the {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType} with {@link com.trolltech.qt.xml.QDomNode#toDocumentType() toDocumentType()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toDocumentType() toDocumentType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDocumentType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDocumentType(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDocumentType(long __this__nativeId);

/**
Returns true if the node is an element; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomElement QDomElement}; you can get the {@link com.trolltech.qt.xml.QDomElement QDomElement} with {@link com.trolltech.qt.xml.QDomNode#toElement() toElement()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toElement() toElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isElement(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isElement(long __this__nativeId);

/**
Returns true if the node is an entity; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomEntity QDomEntity}; you can get the {@link com.trolltech.qt.xml.QDomEntity QDomEntity} with {@link com.trolltech.qt.xml.QDomNode#toEntity() toEntity()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toEntity() toEntity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEntity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEntity(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEntity(long __this__nativeId);

/**
Returns true if the node is an entity reference; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference}; you can get the {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference} with {@link com.trolltech.qt.xml.QDomNode#toEntityReference() toEntityReference()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toEntityReference() toEntityReference()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEntityReference()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEntityReference(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEntityReference(long __this__nativeId);

/**
Returns true if the node is a notation; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomNotation QDomNotation}; you can get the {@link com.trolltech.qt.xml.QDomNotation QDomNotation} with {@link com.trolltech.qt.xml.QDomNode#toNotation() toNotation()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toNotation() toNotation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNotation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNotation(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNotation(long __this__nativeId);

/**
Returns true if this node is null (i.e. if it has no type or contents); otherwise returns false.
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
Returns true if the node is a processing instruction; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomProcessingInstruction QDomProcessingInstruction}; you can get the QProcessingInstruction with {@link com.trolltech.qt.xml.QDomNode#toProcessingInstruction() toProcessingInstruction()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toProcessingInstruction() toProcessingInstruction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isProcessingInstruction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isProcessingInstruction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isProcessingInstruction(long __this__nativeId);

/**
Returns true if the DOM implementation implements the feature <tt>feature</tt> and this feature is supported by this node in the version <tt>version</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#hasFeature(java.lang.String, java.lang.String) QDomImplementation::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSupported(java.lang.String feature, java.lang.String version)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSupported_String_String(nativeId(), feature, version);
    }
    @QtBlockedSlot
    native boolean __qt_isSupported_String_String(long __this__nativeId, java.lang.String feature, java.lang.String version);

/**
Returns true if the node is a text node; otherwise returns false. <p>If this function returns true, it does not imply that this object is a {@link com.trolltech.qt.xml.QDomText QDomText}; you can get the {@link com.trolltech.qt.xml.QDomText QDomText} with {@link com.trolltech.qt.xml.QDomNode#toText() toText()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toText() toText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isText(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isText(long __this__nativeId);

/**
Returns the last child of the node. If there is no child node, a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} is returned. Changing the returned node will also change the node in the document tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChild() firstChild()}, and {@link com.trolltech.qt.xml.QDomNode#childNodes() childNodes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode lastChild()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastChild(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_lastChild(long __this__nativeId);


/**
Returns the last child element with tag name <tt>tagName</tt> if tagName is non-empty; otherwise returns the first child element. Returns a null element if no such child exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement lastChildElement() {
        return lastChildElement((java.lang.String)null);
    }
/**
Returns the last child element with tag name <tt>tagName</tt> if tagName is non-empty; otherwise returns the first child element. Returns a null element if no such child exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement lastChildElement(java.lang.String tagName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastChildElement_String(nativeId(), tagName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_lastChildElement_String(long __this__nativeId, java.lang.String tagName);

/**
For nodes created by {@link com.trolltech.qt.xml.QDomDocument#setContent(com.trolltech.qt.xml.QXmlInputSource, boolean) QDomDocument::setContent()}, this function returns the line number in the XML document where the node was parsed. Otherwise, -1 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#columnNumber() columnNumber()}, and {@link com.trolltech.qt.xml.QDomDocument#setContent(com.trolltech.qt.xml.QXmlInputSource, boolean) QDomDocument::setContent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lineNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineNumber(long __this__nativeId);

/**
If the node uses namespaces, this function returns the local name of the node; otherwise it returns an empty string. <p>Only nodes of type {@link com.trolltech.qt.xml.QDomNode.NodeType ElementNode } or {@link com.trolltech.qt.xml.QDomNode.NodeType AttributeNode } can have namespaces. A namespace must have been specified at creation time; it is not possible to add a namespace afterwards. <p>{@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) QDomDocument::createAttributeNS()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#prefix() prefix()}, {@link com.trolltech.qt.xml.QDomNode#namespaceURI() namespaceURI()}, and {@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) QDomDocument::createElementNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String localName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_localName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_localName(long __this__nativeId);

/**
Returns the first direct child node for which {@link com.trolltech.qt.xml.QDomNode#nodeName() nodeName()} equals <tt>name</tt>. <p>If no such direct child exists, a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#nodeName() nodeName()}. <br></DD></DT>
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
Returns the namespace URI of this node or an empty string if the node has no namespace URI. <p>Only nodes of type {@link com.trolltech.qt.xml.QDomNode.NodeType ElementNode } or {@link com.trolltech.qt.xml.QDomNode.NodeType AttributeNode } can have namespaces. A namespace URI must be specified at creation time and cannot be changed later. <p>{@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) QDomDocument::createAttributeNS()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#prefix() prefix()}, {@link com.trolltech.qt.xml.QDomNode#localName() localName()}, and {@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) QDomDocument::createElementNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String namespaceURI()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceURI(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_namespaceURI(long __this__nativeId);

/**
Returns the next sibling in the document tree. Changing the returned node will also change the node in the document tree. <p>If you have XML like this: <pre class="snippet">
    &lt;h1&gt;Heading&lt;/h1&gt;
    &lt;p&gt;The text...&lt;/p&gt;
    &lt;h2&gt;Next heading&lt;/h2&gt;
</pre> and this QDomNode represents the &lt;p&gt; tag, {@link com.trolltech.qt.xml.QDomNode#nextSibling() nextSibling()} will return the node representing the &lt;h2&gt; tag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#previousSibling() previousSibling()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode nextSibling()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextSibling(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_nextSibling(long __this__nativeId);


/**
Returns the next sibilng element with tag name <tt>tagName</tt> if <tt>tagName</tt> is non-empty; otherwise returns any next sibling element. Returns a null element if no such sibling exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement nextSiblingElement() {
        return nextSiblingElement((java.lang.String)null);
    }
/**
Returns the next sibilng element with tag name <tt>tagName</tt> if <tt>tagName</tt> is non-empty; otherwise returns any next sibling element. Returns a null element if no such sibling exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#previousSiblingElement() previousSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement nextSiblingElement(java.lang.String taName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextSiblingElement_String(nativeId(), taName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_nextSiblingElement_String(long __this__nativeId, java.lang.String taName);

/**
Returns the name of the node. <p>The meaning of the name depends on the subclass: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Name</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomAttr QDomAttr}</td><td> The name of the attribute</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}</td><td> The string "#cdata-section"</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomComment QDomComment}</td><td> The string "#comment"</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomDocument QDomDocument}</td><td> The string "#document"</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}</td><td> The string "#document-fragment"</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType}</td><td> The name of the document type</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomElement QDomElement}</td><td> The tag name</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomEntity QDomEntity}</td><td> The name of the entity</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference}</td><td> The name of the referenced entity</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomNotation QDomNotation}</td><td> The name of the notation</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomProcessingInstruction QDomProcessingInstruction}</td><td> The target of the processing instruction</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomText QDomText}</td><td> The string "#text"</td></tr></table> <b>Note:</b> This function does not take the presence of namespaces into account when processing the names of element and attribute nodes. As a result, the returned name can contain any namespace prefix that may be present. To obtain the node name of an element or attribute, use {@link com.trolltech.qt.xml.QDomNode#localName() localName()}; to obtain the namespace prefix, use {@link com.trolltech.qt.xml.QDomNode#namespaceURI() namespaceURI()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#nodeValue() nodeValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String nodeName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nodeName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_nodeName(long __this__nativeId);

/**
Returns the type of the node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#toAttr() toAttr()}, {@link com.trolltech.qt.xml.QDomNode#toCDATASection() toCDATASection()}, {@link com.trolltech.qt.xml.QDomNode#toDocumentFragment() toDocumentFragment()}, {@link com.trolltech.qt.xml.QDomNode#toDocument() toDocument()}, {@link com.trolltech.qt.xml.QDomNode#toDocumentType() toDocumentType()}, {@link com.trolltech.qt.xml.QDomNode#toElement() toElement()}, {@link com.trolltech.qt.xml.QDomNode#toEntityReference() toEntityReference()}, {@link com.trolltech.qt.xml.QDomNode#toText() toText()}, {@link com.trolltech.qt.xml.QDomNode#toEntity() toEntity()}, {@link com.trolltech.qt.xml.QDomNode#toNotation() toNotation()}, {@link com.trolltech.qt.xml.QDomNode#toProcessingInstruction() toProcessingInstruction()}, {@link com.trolltech.qt.xml.QDomNode#toCharacterData() toCharacterData()}, and {@link com.trolltech.qt.xml.QDomNode#toComment() toComment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode.NodeType nodeType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.xml.QDomNode.NodeType.resolve(__qt_nodeType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_nodeType(long __this__nativeId);

/**
Returns the value of the node. <p>The meaning of the value depends on the subclass: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Name</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomAttr QDomAttr}</td><td> The attribute value</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}</td><td> The content of the CDATA section</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomComment QDomComment}</td><td> The comment</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomProcessingInstruction QDomProcessingInstruction}</td><td> The data of the processing instruction</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomText QDomText}</td><td> The text</td></tr></table> All the other subclasses do not have a node value and will return an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#setNodeValue(java.lang.String) setNodeValue()}, and {@link com.trolltech.qt.xml.QDomNode#nodeName() nodeName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String nodeValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nodeValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_nodeValue(long __this__nativeId);

/**
Calling {@link com.trolltech.qt.xml.QDomNode#normalize() normalize()} on an element converts all its children into a standard form. This means that adjacent {@link com.trolltech.qt.xml.QDomText QDomText} objects will be merged into a single text object ({@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection} nodes are not merged).
*/

    @QtBlockedSlot
    public final void normalize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_normalize(nativeId());
    }
    @QtBlockedSlot
    native void __qt_normalize(long __this__nativeId);

/**
<brief>Writes thisQDomNode
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QTextStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QTextStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QTextStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QDomNode arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDomNode(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDomNode(long __this__nativeId, long arg__1);

/**
Returns the document to which this node belongs.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocument ownerDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownerDocument(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocument __qt_ownerDocument(long __this__nativeId);

/**
Returns the parent node. If this node has no parent, a null node is returned (i.e. a node for which {@link com.trolltech.qt.xml.QDomNode#isNull() isNull()} returns true).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode parentNode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentNode(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_parentNode(long __this__nativeId);

/**
Returns the namespace prefix of the node or an empty string if the node has no namespace prefix. <p>Only nodes of type {@link com.trolltech.qt.xml.QDomNode.NodeType ElementNode } or {@link com.trolltech.qt.xml.QDomNode.NodeType AttributeNode } can have namespaces. A namespace prefix must be specified at creation time. If a node was created with a namespace prefix, you can change it later with {@link com.trolltech.qt.xml.QDomNode#setPrefix(java.lang.String) setPrefix()}. <p>If you create an element or attribute with {@link com.trolltech.qt.xml.QDomDocument#createElement(java.lang.String) QDomDocument::createElement()} or {@link com.trolltech.qt.xml.QDomDocument#createAttribute(java.lang.String) QDomDocument::createAttribute()}, the prefix will be an empty string. If you use {@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) QDomDocument::createElementNS()} or {@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) QDomDocument::createAttributeNS()} instead, the prefix will not be an empty string; but it might be an empty string if the name does not have a prefix. <p>{@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) QDomDocument::createElementNS()}{@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) QDomDocument::createAttributeNS()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#setPrefix(java.lang.String) setPrefix()}, {@link com.trolltech.qt.xml.QDomNode#localName() localName()}, and {@link com.trolltech.qt.xml.QDomNode#namespaceURI() namespaceURI()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String prefix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_prefix(long __this__nativeId);

/**
Returns the previous sibling in the document tree. Changing the returned node will also change the node in the document tree. <p>For example, if you have XML like this: <pre class="snippet">
    &lt;h1&gt;Heading&lt;/h1&gt;
    &lt;p&gt;The text...&lt;/p&gt;
    &lt;h2&gt;Next heading&lt;/h2&gt;
</pre> and this QDomNode represents the &lt;p&gt; tag, {@link com.trolltech.qt.xml.QDomNode#previousSibling() previousSibling()} will return the node representing the &lt;h1&gt; tag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#nextSibling() nextSibling()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode previousSibling()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previousSibling(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_previousSibling(long __this__nativeId);


/**
Returns the previous sibilng element with tag name <tt>tagName</tt> if <tt>tagName</tt> is non-empty; otherwise returns any previous sibling element. Returns a null element if no such sibling exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement previousSiblingElement() {
        return previousSiblingElement((java.lang.String)null);
    }
/**
Returns the previous sibilng element with tag name <tt>tagName</tt> if <tt>tagName</tt> is non-empty; otherwise returns any previous sibling element. Returns a null element if no such sibling exists. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#firstChildElement() firstChildElement()}, {@link com.trolltech.qt.xml.QDomNode#nextSiblingElement() nextSiblingElement()}, and {@link com.trolltech.qt.xml.QDomNode#lastChildElement() lastChildElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement previousSiblingElement(java.lang.String tagName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previousSiblingElement_String(nativeId(), tagName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_previousSiblingElement_String(long __this__nativeId, java.lang.String tagName);

/**
Removes <tt>oldChild</tt> from the list of children. <tt>oldChild</tt> must be a direct child of this node. <p>Returns a new reference to <tt>oldChild</tt> on success or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertAfter()}, {@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) replaceChild()}, and {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) appendChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode removeChild(com.trolltech.qt.xml.QDomNode oldChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeChild_QDomNode(nativeId(), oldChild == null ? 0 : oldChild.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_removeChild_QDomNode(long __this__nativeId, long oldChild);

/**
Replaces <tt>oldChild</tt> with <tt>newChild</tt>. <tt>oldChild</tt> must be a direct child of this node. <p>If <tt>newChild</tt> is the child of another node, it is reparented to this node. If <tt>newChild</tt> is a child of this node, then its position in the list of children is changed. <p>If <tt>newChild</tt> is a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}, then <tt>oldChild</tt> is replaced by all of the children of the fragment. <p>Returns a new reference to <tt>oldChild</tt> on success or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} an failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertBefore()}, {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) insertAfter()}, {@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) removeChild()}, and {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) appendChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode replaceChild(com.trolltech.qt.xml.QDomNode newChild, com.trolltech.qt.xml.QDomNode oldChild)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replaceChild_QDomNode_QDomNode(nativeId(), newChild == null ? 0 : newChild.nativeId(), oldChild == null ? 0 : oldChild.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_replaceChild_QDomNode_QDomNode(long __this__nativeId, long newChild, long oldChild);

/**
Writes the XML representation of the node and all its children to the stream <tt>str</tt>. This function uses <tt>indent</tt> as the amount of space to indent the node. <p>If this node is a document node, the encoding of text stream <tt>str</tt>'s encoding is set by treating a processing instruction by name "xml" as an XML declaration, if such a one exists, and otherwise defaults to UTF-8. XML declarations are not processing instructions, but this behavior exists for historical reasons. If this node is not a document node, the text stream's encoding is used. <p>If the document contains invalid XML characters or characters that cannot be encoded in the given encoding, the result and behavior is undefined.
*/

    @QtBlockedSlot
    public final void save(com.trolltech.qt.core.QTextStream arg__1, int arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_save_QTextStream_int(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2);
    }
    @QtBlockedSlot
    native void __qt_save_QTextStream_int(long __this__nativeId, long arg__1, int arg__2);

/**
If <tt>encodingPolicy</tt> is {@link com.trolltech.qt.xml.QDomNode.EncodingPolicy QDomNode::EncodingFromDocument }, this function behaves as save({@link com.trolltech.qt.core.QTextStream QTextStream} &str, int indent). <p>If <tt>encodingPolicy</tt> is {@link com.trolltech.qt.xml.QDomNode.EncodingPolicy EncodingFromTextStream } and this node is a document node, this function behaves as save({@link com.trolltech.qt.core.QTextStream QTextStream} &str, int indent) with the exception that the encoding specified in the text stream <tt>str</tt> is used. <p>If the document contains invalid XML characters or characters that cannot be encoded in the given encoding, the result and behavior is undefined.
*/

    @QtBlockedSlot
    public final void save(com.trolltech.qt.core.QTextStream arg__1, int arg__2, com.trolltech.qt.xml.QDomNode.EncodingPolicy arg__3)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_save_QTextStream_int_EncodingPolicy(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2, arg__3.value());
    }
    @QtBlockedSlot
    native void __qt_save_QTextStream_int_EncodingPolicy(long __this__nativeId, long arg__1, int arg__2, int arg__3);

/**
Sets the node's value to <tt>v</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#nodeValue() nodeValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNodeValue(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNodeValue_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setNodeValue_String(long __this__nativeId, java.lang.String arg__1);

/**
If the node has a namespace prefix, this function changes the namespace prefix of the node to <tt>pre</tt>. Otherwise this function does nothing. <p>Only nodes of type {@link com.trolltech.qt.xml.QDomNode.NodeType ElementNode } or {@link com.trolltech.qt.xml.QDomNode.NodeType AttributeNode } can have namespaces. A namespace prefix must have be specified at creation time; it is not possible to add a namespace prefix afterwards. <p>{@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) QDomDocument::createElementNS()}{@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) QDomDocument::createAttributeNS()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#prefix() prefix()}, {@link com.trolltech.qt.xml.QDomNode#localName() localName()}, and {@link com.trolltech.qt.xml.QDomNode#namespaceURI() namespaceURI()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrefix(java.lang.String pre)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrefix_String(nativeId(), pre);
    }
    @QtBlockedSlot
    native void __qt_setPrefix_String(long __this__nativeId, java.lang.String pre);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomAttr QDomAttr}. If the node is not an attribute, the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isAttr() isAttr()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr toAttr()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toAttr(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_toAttr(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}. If the node is not a CDATA section, the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isCDATASection() isCDATASection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomCDATASection toCDATASection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toCDATASection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomCDATASection __qt_toCDATASection(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomCharacterData QDomCharacterData}. If the node is not a character data node the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isCharacterData() isCharacterData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomCharacterData toCharacterData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toCharacterData(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomCharacterData __qt_toCharacterData(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomComment QDomComment}. If the node is not a comment the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isComment() isComment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomComment toComment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toComment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomComment __qt_toComment(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomDocument QDomDocument}. If the node is not a document the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isDocument() isDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocument toDocument()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDocument(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocument __qt_toDocument(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}. If the node is not a document fragment the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isDocumentFragment() isDocumentFragment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocumentFragment toDocumentFragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDocumentFragment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocumentFragment __qt_toDocumentFragment(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType}. If the node is not a document type the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isDocumentType() isDocumentType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocumentType toDocumentType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDocumentType(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocumentType __qt_toDocumentType(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomElement QDomElement}. If the node is not an element the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isElement() isElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement toElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toElement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_toElement(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomEntity QDomEntity}. If the node is not an entity the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isEntity() isEntity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomEntity toEntity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toEntity(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomEntity __qt_toEntity(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference}. If the node is not an entity reference, the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isEntityReference() isEntityReference()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomEntityReference toEntityReference()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toEntityReference(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomEntityReference __qt_toEntityReference(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomNotation QDomNotation}. If the node is not a notation the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isNotation() isNotation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNotation toNotation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toNotation(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNotation __qt_toNotation(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomProcessingInstruction QDomProcessingInstruction}. If the node is not a processing instruction the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isProcessingInstruction() isProcessingInstruction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomProcessingInstruction toProcessingInstruction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toProcessingInstruction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomProcessingInstruction __qt_toProcessingInstruction(long __this__nativeId);

/**
Converts a QDomNode into a {@link com.trolltech.qt.xml.QDomText QDomText}. If the node is not a text, the returned object will be {@link com.trolltech.qt.xml.QDomNode#isNull() null}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#isText() isText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomText toText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomText __qt_toText(long __this__nativeId);

/**
@exclude
*/

    public static native QDomNode fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomNode(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomNode array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QDomNode)
        return operator_equal((com.trolltech.qt.xml.QDomNode) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomNode clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomNode __qt_clone(long __this_nativeId);
}
