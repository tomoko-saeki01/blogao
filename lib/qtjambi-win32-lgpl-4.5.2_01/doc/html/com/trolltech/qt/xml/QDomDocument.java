package com.trolltech.qt.xml;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer.Type;
import com.trolltech.qt.core.QIODevice;
import com.trolltech.qt.core.QByteArray;


/**
The QDomDocument class represents an XML document. The QDomDocument class represents the entire XML document. Conceptually, it is the root of the document tree, and provides the primary access to the document's data. <p>Since elements, text nodes, comments, processing instructions, etc., cannot exist outside the context of a document, the document class also contains the factory functions needed to create these objects. The node objects created have an {@link com.trolltech.qt.xml.QDomNode#ownerDocument() ownerDocument()} function which associates them with the document within whose context they were created. The DOM classes that will be used most often are {@link com.trolltech.qt.xml.QDomNode QDomNode}, QDomDocument, {@link com.trolltech.qt.xml.QDomElement QDomElement} and {@link com.trolltech.qt.xml.QDomText QDomText}. <p>The parsed XML is represented internally by a tree of objects that can be accessed using the various QDom classes. All QDom classes only reference objects in the internal tree. The internal objects in the DOM tree will get deleted once the last QDom object referencing them and the QDomDocument itself are deleted. <p>Creation of elements, text nodes, etc. is done using the various factory functions provided in this class. Using the default constructors of the QDom classes will only result in empty objects that cannot be manipulated or inserted into the Document. <p>The QDomDocument class has several functions for creating document data, for example, {@link com.trolltech.qt.xml.QDomDocument#createElement(java.lang.String) createElement()}, {@link com.trolltech.qt.xml.QDomDocument#createTextNode(java.lang.String) createTextNode()}, {@link com.trolltech.qt.xml.QDomDocument#createComment(java.lang.String) createComment()}, {@link com.trolltech.qt.xml.QDomDocument#createCDATASection(java.lang.String) createCDATASection()}, {@link com.trolltech.qt.xml.QDomDocument#createProcessingInstruction(java.lang.String, java.lang.String) createProcessingInstruction()}, {@link com.trolltech.qt.xml.QDomDocument#createAttribute(java.lang.String) createAttribute()} and {@link com.trolltech.qt.xml.QDomDocument#createEntityReference(java.lang.String) createEntityReference()}. Some of these functions have versions that support namespaces, i.e. {@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) createElementNS()} and {@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) createAttributeNS()}. The {@link com.trolltech.qt.xml.QDomDocument#createDocumentFragment() createDocumentFragment()} function is used to hold parts of the document; this is useful for manipulating for complex documents. <p>The entire content of the document is set with {@link com.trolltech.qt.xml.QDomDocument#setContent(com.trolltech.qt.xml.QXmlInputSource, boolean) setContent()}. This function parses the string it is passed as an XML document and creates the DOM tree that represents the document. The root element is available using {@link com.trolltech.qt.xml.QDomDocument#documentElement() documentElement()}. The textual representation of the document can be obtained using {@link com.trolltech.qt.xml.QDomDocument#toString() toString()}. <p>It is possible to insert a node from another document into the document using {@link com.trolltech.qt.xml.QDomDocument#importNode(com.trolltech.qt.xml.QDomNode, boolean) importNode()}. <p>You can obtain a list of all the elements that have a particular tag with {@link com.trolltech.qt.xml.QDomDocument#elementsByTagName(java.lang.String) elementsByTagName()} or with {@link com.trolltech.qt.xml.QDomDocument#elementsByTagNameNS(java.lang.String, java.lang.String) elementsByTagNameNS()}. <p>The QDom classes are typically used as follows: <pre class="snippet">
    QDomDocument domDoc = new QDomDocument("mydocument");
    QFile file = new QFile("mydocument.xml");
    QFile.OpenMode mode = new QFile.OpenMode();
    mode.set(QFile.OpenModeFlag.ReadOnly);

    if (!file.open(mode))
        return;
    if (!domDoc.setContent(file).success) {
        file.close();
        return;
    }
    file.close();

    // print out the element names of all elements that are direct children
    // of the outermost element.
    QDomElement docElem = doc.documentElement();

    QDomNode domNode = docElem.firstChild();
    while(!domNode.isNull()) {
        QDomElement e = domNode.toElement(); // try to convert the node to an element.
        if(!e.isNull()) {
            System.out.println(e.tagName()); // the node really is an element.
        }
        domNode = domNode.nextSibling();
    }

    // Here we append a new element to the end of the document
    QDomElement elem = doc.createElement("img");
    elem.setAttribute("src", "myimage.png");
    docElem.appendChild(elem);
</pre> Once <tt>doc</tt> and <tt>elem</tt> go out of scope, the whole internal tree representing the XML document is deleted. <p>To create a document using DOM use code like this: <pre class="snippet">
    QDomDocument doc = new QDomDocument("MyML");
    QDomElement root = doc.createElement("MyML");
    doc.appendChild(root);

    QDomElement tag = doc.createElement("Greeting");
    root.appendChild(tag);

    QDomText t = doc.createTextNode("Hello World");
    tag.appendChild(t);

    java.lang.String xml = doc.toString();
</pre> For further information about the Document Object Model see the Document Object Model (DOM) Level 1 and Level 2 Core Specifications. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-dombookmarks.html">DOM Bookmarks Example</a>}, and {@link <a href="../itemviews-simpledommodel.html">Simple DOM Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDomDocument extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

    private Object __rcContent = null;

/**
Constructs an empty document.
*/

    public QDomDocument(){
        super((QPrivateConstructor)null);
        __qt_QDomDocument();
    }

    native void __qt_QDomDocument();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomDocument(com.trolltech.qt.xml.QDomDocument x){
        super((QPrivateConstructor)null);
        __qt_QDomDocument_QDomDocument(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomDocument_QDomDocument(long x);

/**
Creates a document with the document type <tt>doctype</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#createDocumentType(java.lang.String, java.lang.String, java.lang.String) QDomImplementation::createDocumentType()}. <br></DD></DT>
*/

    public QDomDocument(com.trolltech.qt.xml.QDomDocumentType doctype){
        super((QPrivateConstructor)null);
        __qt_QDomDocument_QDomDocumentType(doctype == null ? 0 : doctype.nativeId());
    }

    native void __qt_QDomDocument_QDomDocumentType(long doctype);

/**
Creates a document and sets the name of the document type to <tt>name</tt>.
*/

    public QDomDocument(java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QDomDocument_String(name);
    }

    native void __qt_QDomDocument_String(java.lang.String name);

/**
Creates a new attribute called <tt>name</tt> that can be inserted into an element, e. . using {@link com.trolltech.qt.xml.QDomElement#setAttributeNode(com.trolltech.qt.xml.QDomAttr) QDomElement::setAttributeNode()}. <p>If <tt>name</tt> is not a valid XML name, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#createAttributeNS(java.lang.String, java.lang.String) createAttributeNS()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr createAttribute(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createAttribute_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_createAttribute_String(long __this__nativeId, java.lang.String name);

/**
Creates a new attribute with namespace support that can be inserted into an element. The name of the attribute is <tt>qName</tt> and the namespace URI is <tt>nsURI</tt>. This function also sets {@link com.trolltech.qt.xml.QDomNode#prefix() QDomNode::prefix()} and {@link com.trolltech.qt.xml.QDomNode#localName() QDomNode::localName()} to appropriate values (depending on <tt>qName</tt>). <p>If <tt>qName</tt> is not a valid XML name, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#createAttribute(java.lang.String) createAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomAttr createAttributeNS(java.lang.String nsURI, java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createAttributeNS_String_String(nativeId(), nsURI, qName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomAttr __qt_createAttributeNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String qName);

/**
Creates a new CDATA section for the string <tt>value</tt> that can be inserted into the document, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. <p>If <tt>value</tt> contains characters which cannot be stored in a CDATA section, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, and {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomCDATASection createCDATASection(java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createCDATASection_String(nativeId(), data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomCDATASection __qt_createCDATASection_String(long __this__nativeId, java.lang.String data);

/**
Creates a new comment for the string <tt>value</tt> that can be inserted into the document, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. <p>If <tt>value</tt> contains characters which cannot be stored in an XML comment, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, and {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomComment createComment(java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createComment_String(nativeId(), data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomComment __qt_createComment_String(long __this__nativeId, java.lang.String data);

/**
Creates a new document fragment, that can be used to hold parts of the document, e.g. when doing complex manipulations of the document tree.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocumentFragment createDocumentFragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createDocumentFragment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocumentFragment __qt_createDocumentFragment(long __this__nativeId);

/**
Creates a new element called <tt>tagName</tt> that can be inserted into the DOM tree, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. <p>If <tt>tagName</tt> is not a valid XML name, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p>{@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#createElementNS(java.lang.String, java.lang.String) createElementNS()}, {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, and {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement createElement(java.lang.String tagName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createElement_String(nativeId(), tagName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_createElement_String(long __this__nativeId, java.lang.String tagName);

/**
Creates a new element with namespace support that can be inserted into the DOM tree. The name of the element is <tt>qName</tt> and the namespace URI is <tt>nsURI</tt>. This function also sets {@link com.trolltech.qt.xml.QDomNode#prefix() QDomNode::prefix()} and {@link com.trolltech.qt.xml.QDomNode#localName() QDomNode::localName()} to appropriate values (depending on <tt>qName</tt>). <p>If <tt>qName</tt> is an empty string, returns a null element regardless of whether the invalid data policy is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#createElement(java.lang.String) createElement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement createElementNS(java.lang.String nsURI, java.lang.String qName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createElementNS_String_String(nativeId(), nsURI, qName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_createElementNS_String_String(long __this__nativeId, java.lang.String nsURI, java.lang.String qName);

/**
Creates a new entity reference called <tt>name</tt> that can be inserted into the document, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. <p>If <tt>name</tt> is not a valid XML name, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, and {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomEntityReference createEntityReference(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEntityReference_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomEntityReference __qt_createEntityReference_String(long __this__nativeId, java.lang.String name);

/**
Creates a new processing instruction that can be inserted into the document, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. This function sets the target for the processing instruction to <tt>target</tt> and the data to <tt>data</tt>. <p>If <tt>target</tt> is not a valid XML name, or data if contains characters which cannot appear in a processing instruction, the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, and {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomProcessingInstruction createProcessingInstruction(java.lang.String target, java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createProcessingInstruction_String_String(nativeId(), target, data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomProcessingInstruction __qt_createProcessingInstruction_String_String(long __this__nativeId, java.lang.String target, java.lang.String data);

/**
Creates a text node for the string <tt>value</tt> that can be inserted into the document tree, e. . using {@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}. <p>If <tt>value</tt> contains characters which cannot be stored as character data of an XML document (even in the form of character references), the behavior of this function is governed by {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy QDomImplementation::InvalidDataPolicy }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()}, {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}, and {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomText createTextNode(java.lang.String data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createTextNode_String(nativeId(), data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomText __qt_createTextNode_String(long __this__nativeId, java.lang.String data);

/**
Returns the document type of this document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocumentType doctype()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doctype(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocumentType __qt_doctype(long __this__nativeId);

/**
Returns the root element of the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement documentElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentElement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_documentElement(long __this__nativeId);

/**
Returns the element whose ID is equal to <tt>elementId</tt>. If no element with the ID was found, this function returns a {@link com.trolltech.qt.xml.QDomNode#isNull() null element}. <p>Since the QDomClasses do not know which attributes are element IDs, this function returns always a {@link com.trolltech.qt.xml.QDomNode#isNull() null element}. This may change in a future version.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement elementById(java.lang.String elementId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementById_String(nativeId(), elementId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_elementById_String(long __this__nativeId, java.lang.String elementId);

/**
Returns a {@link com.trolltech.qt.xml.QDomNodeList QDomNodeList}, that contains all the elements in the document with the name <tt>tagname</tt>. The order of the node list is the order they are encountered in a preorder traversal of the element tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#elementsByTagNameNS(java.lang.String, java.lang.String) elementsByTagNameNS()}, and {@link com.trolltech.qt.xml.QDomElement#elementsByTagName(java.lang.String) QDomElement::elementsByTagName()}. <br></DD></DT>
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
Returns a {@link com.trolltech.qt.xml.QDomNodeList QDomNodeList} that contains all the elements in the document with the local name <tt>localName</tt> and a namespace URI of <tt>nsURI</tt>. The order of the node list is the order they are encountered in a preorder traversal of the element tree. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#elementsByTagName(java.lang.String) elementsByTagName()}, and {@link com.trolltech.qt.xml.QDomElement#elementsByTagNameNS(java.lang.String, java.lang.String) QDomElement::elementsByTagNameNS()}. <br></DD></DT>
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
Returns a {@link com.trolltech.qt.xml.QDomImplementation QDomImplementation} object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomImplementation implementation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_implementation(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomImplementation __qt_implementation(long __this__nativeId);

/**
Imports the node <tt>importedNode</tt> from another document to this document. <tt>importedNode</tt> remains in the original document; this function creates a copy that can be used within this document. <p>This function returns the imported node that belongs to this document. The returned node has no parent. It is not possible to import QDomDocument and {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType} nodes. In those cases this function returns a {@link com.trolltech.qt.xml.QDomNode#isNull() null node}. <p>If <tt>deep</tt> is true, this function imports not only the node <tt>importedNode</tt> but its whole subtree; if it is false, only the <tt>importedNode</tt> is imported. The argument <tt>deep</tt> has no effect on {@link com.trolltech.qt.xml.QDomAttr QDomAttr} and {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference} nodes, since the descendants of {@link com.trolltech.qt.xml.QDomAttr QDomAttr} nodes are always imported and those of {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference} nodes are never imported. <p>The behavior of this function is slightly different depending on the node types: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Node Type</center></th><th><center> Behavior</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomAttr QDomAttr}</td><td> The owner element is set to 0 and the specified flag is set to true in the generated attribute. The whole subtree of <tt>importedNode</tt> is always imported for attribute nodes: <tt>deep</tt> has no effect.</td></tr><tr valign="top" class="odd"><td> QDomDocument</td><td> Document nodes cannot be imported.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomDocumentFragment QDomDocumentFragment}</td><td> If <tt>deep</tt> is true, this function imports the whole document fragment; otherwise it only generates an empty document fragment.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomDocumentType QDomDocumentType}</td><td> Document type nodes cannot be imported.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomElement QDomElement}</td><td> Attributes for which {@link com.trolltech.qt.xml.QDomAttr#specified() QDomAttr::specified()} is true are also imported, other attributes are not imported. If <tt>deep</tt> is true, this function also imports the subtree of <tt>importedNode</tt>; otherwise it imports only the element node (and some attributes, see above).</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomEntity QDomEntity}</td><td> Entity nodes can be imported, but at the moment there is no way to use them since the document type is read-only in DOM level 2.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomEntityReference QDomEntityReference}</td><td> Descendants of entity reference nodes are never imported: <tt>deep</tt> has no effect.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomNotation QDomNotation}</td><td> Notation nodes can be imported, but at the moment there is no way to use them since the document type is read-only in DOM level 2.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomProcessingInstruction QDomProcessingInstruction}</td><td> The target and value of the processing instruction is copied to the new node.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomText QDomText}</td><td> The text is copied to the new node.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}</td><td> The text is copied to the new node.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.xml.QDomComment QDomComment}</td><td> The text is copied to the new node.</td></tr></table> {@link com.trolltech.qt.xml.QDomNode#insertAfter(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertAfter()}{@link com.trolltech.qt.xml.QDomNode#replaceChild(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::replaceChild()}{@link com.trolltech.qt.xml.QDomNode#removeChild(com.trolltech.qt.xml.QDomNode) QDomNode::removeChild()}{@link com.trolltech.qt.xml.QDomNode#appendChild(com.trolltech.qt.xml.QDomNode) QDomNode::appendChild()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomElement#setAttribute(java.lang.String, java.lang.String) QDomElement::setAttribute()}, and {@link com.trolltech.qt.xml.QDomNode#insertBefore(com.trolltech.qt.xml.QDomNode, com.trolltech.qt.xml.QDomNode) QDomNode::insertBefore()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode importNode(com.trolltech.qt.xml.QDomNode importedNode, boolean deep)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_importNode_QDomNode_boolean(nativeId(), importedNode == null ? 0 : importedNode.nativeId(), deep);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_importNode_QDomNode_boolean(long __this__nativeId, long importedNode, boolean deep);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.core.QIODevice dev, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContent = dev;
        }
        return __qt_setContent_QIODevice_nativepointer_nativepointer_nativepointer(nativeId(), dev == null ? 0 : dev.nativeId(), errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QIODevice_nativepointer_nativepointer_nativepointer(long __this__nativeId, long dev, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.core.QIODevice dev, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContent = dev;
        }
        return __qt_setContent_QIODevice_boolean_nativepointer_nativepointer_nativepointer(nativeId(), dev == null ? 0 : dev.nativeId(), namespaceProcessing, errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QIODevice_boolean_nativepointer_nativepointer_nativepointer(long __this__nativeId, long dev, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.xml.QXmlInputSource source, com.trolltech.qt.xml.QXmlReader reader, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContent = source;
        }
        return __qt_setContent_QXmlInputSource_QXmlReader_nativepointer_nativepointer_nativepointer(nativeId(), source == null ? 0 : source.nativeId(), reader == null ? 0 : reader.nativeId(), errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QXmlInputSource_QXmlReader_nativepointer_nativepointer_nativepointer(long __this__nativeId, long source, long reader, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.xml.QXmlInputSource source, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContent = source;
        }
        return __qt_setContent_QXmlInputSource_boolean_nativepointer_nativepointer_nativepointer(nativeId(), source == null ? 0 : source.nativeId(), namespaceProcessing, errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QXmlInputSource_boolean_nativepointer_nativepointer_nativepointer(long __this__nativeId, long source, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.core.QByteArray text, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setContent_QByteArray_nativepointer_nativepointer_nativepointer(nativeId(), text == null ? 0 : text.nativeId(), errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QByteArray_nativepointer_nativepointer_nativepointer(long __this__nativeId, long text, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(com.trolltech.qt.core.QByteArray text, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setContent_QByteArray_boolean_nativepointer_nativepointer_nativepointer(nativeId(), text == null ? 0 : text.nativeId(), namespaceProcessing, errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_QByteArray_boolean_nativepointer_nativepointer_nativepointer(long __this__nativeId, long text, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(java.lang.String text, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setContent_String_nativepointer_nativepointer_nativepointer(nativeId(), text, errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_String_nativepointer_nativepointer_nativepointer(long __this__nativeId, java.lang.String text, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);

    @QtBlockedSlot
    private final boolean setContent(java.lang.String text, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setContent_String_boolean_nativepointer_nativepointer_nativepointer(nativeId(), text, namespaceProcessing, errorMsg, errorLine, errorColumn);
    }
    @QtBlockedSlot
    native boolean __qt_setContent_String_boolean_nativepointer_nativepointer_nativepointer(long __this__nativeId, java.lang.String text, boolean namespaceProcessing, com.trolltech.qt.QNativePointer errorMsg, com.trolltech.qt.QNativePointer errorLine, com.trolltech.qt.QNativePointer errorColumn);


/**
Converts the parsed document back to its textual representation and returns a {@link com.trolltech.qt.core.QByteArray QByteArray} containing the data encoded as UTF-8. <p>This function uses <tt>indent</tt> as the amount of space to indent subelements. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#toString() toString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toByteArray() {
        return toByteArray((int)1);
    }
/**
Converts the parsed document back to its textual representation and returns a {@link com.trolltech.qt.core.QByteArray QByteArray} containing the data encoded as UTF-8. <p>This function uses <tt>indent</tt> as the amount of space to indent subelements. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomDocument#toString() toString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toByteArray(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toByteArray_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toByteArray_int(long __this__nativeId, int arg__1);


/**
<brief>Returns a string representation of the <tt>this QDomDocument</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString() {
        return toString((int)1);
    }
/**
<brief>Returns a string representation of the <tt>int</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_int(long __this__nativeId, int arg__1);

/**
@exclude
*/

    public static native QDomDocument fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomDocument(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomDocument array[]);

    public class Result {
        private Result(boolean success, QNativePointer errorMessage, QNativePointer errorLine, QNativePointer errorColumn) {
            this.success = success;
            this.errorMessage = errorMessage.stringValue();
            this.errorLine = errorLine.intValue();
            this.errorColumn = errorColumn.intValue();
        }

        public boolean success;
        public String errorMessage;
        public int errorLine;
        public int errorColumn;

    }

/**
This is an overloaded method provided for convenience.
*/

    public final Result setContent(QXmlInputSource source, boolean namespaceProcessing)
    {
        QNativePointer errorStr = new QNativePointer(QNativePointer.Type.String);
        QNativePointer errorLine = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer errorColumn = new QNativePointer(QNativePointer.Type.Int);

        boolean success = setContent(source, namespaceProcessing, errorStr, errorLine, errorColumn);

        return new Result(success, errorStr, errorLine, errorColumn);
    }


    // TEMPLATE - xml.domdocument_setContent - START
/**
This function reads the XML document from the IO device <tt>dev</tt>, returning
true if the content was successfully parsed; otherwise returns false.
<p>
If <tt>namespaceProcessing</tt> is true, the parser recognizes
namespaces in the XML file and sets the prefix name, local name
and namespace URI to appropriate values. If <tt>namespaceProcessing</tt>
is false, the parser does no namespace processing when it reads
the XML file.
*/

    public final Result setContent(QIODevice dev, boolean namespaceProcessing){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(dev, namespaceProcessing, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This function reads the XML document from the byte array <tt>text</tt>,
returning true if the content was successfully parsed; otherwise returns
false.
<p>
If <tt>namespaceProcessing</tt> is true, the parser recognizes
namespaces in the XML file and sets the prefix name, local name
and namespace URI to appropriate values. If <tt>namespaceProcessing</tt>
is false, the parser does no namespace processing when it reads
the XML file.
*/

    public final Result setContent(QByteArray text, boolean namespaceProcessing){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(text, namespaceProcessing, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This function reads the XML document from the string <tt>text</tt>, returning
true if the content was successfully parsed; otherwise returns false.
Since <tt>text</tt> is already a Unicode string, no encoding detection
is performed.
<p>
If <tt>namespaceProcessing</tt> is true, the parser recognizes
namespaces in the XML file and sets the prefix name, local name
and namespace URI to appropriate values. If <tt>namespaceProcessing</tt>
is false, the parser does no namespace processing when it reads
the XML file.
*/

    public final Result setContent(String text, boolean namespaceProcessing){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(text, namespaceProcessing, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This function reads the XML document from the QXmlInputSource <tt>source</tt> and
parses it with the QXmlReader <tt>reader</tt>, returning true if the content was
successfully parsed; otherwise returns false.
<p>
This function doesn't change the features of the <tt>reader</tt>. If you want to
use certain features for parsing you can use this function to set up the
reader appropriately.
*/

    public final Result setContent(QXmlInputSource source, QXmlReader reader){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(source, reader, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This is an overloaded method provided for convenience.
*/

    public final Result setContent(String text){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(text, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This is an overloaded method provided for convenience.
*/

    public final Result setContent(QByteArray buffer){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(buffer, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


    // TEMPLATE - xml.domdocument_setContent - START
/**
This is an overloaded method provided for convenience.
*/

    public final Result setContent(QIODevice dev){
        QNativePointer errorStr = new QNativePointer(Type.String);
        QNativePointer errorLine = new QNativePointer(Type.Int);
        QNativePointer errorColumn = new QNativePointer(Type.Int);

        boolean success = setContent(dev, errorStr, errorLine, errorColumn);
        return new Result(success, errorStr, errorLine, errorColumn);
    }
    // TEMPLATE - xml.domdocument_setContent - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomDocument clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomDocument __qt_clone(long __this_nativeId);
}
