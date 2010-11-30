package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QAbstractXmlNodeModel class is an abstract base class for modeling non-XML data to look like XML for {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}. The QAbstractXmlNodeModel specifies the interface that a node model must implement for that node model be accessible to the query engine for processing XQuery queries. A node model represents data as a structure that can be queried as if the data were XML. <p>The node model represented by a subclass of QAbstractXmlNodeModel is meant to be accessed by the {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} query engine. If the API seems a little strange in a few places, it is because the member functions are called by the query engine as it evaluates an XQuery. They aren't meant to be used programatically.<a name="usage"><h2>Usage</h2> QAbstractXmlNodeModel bridges the gap between the arbitrary structure of the non-XML data to be queried and the well-defined structure of XML data understood by {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}. <p>Consider a chemistry application that reads the file <tt>chemistryData</tt>, which contains non-XML data that represents a chemical structure composed of molecules and atoms. The application will query this chemistry data with an XQuery it reads from file <tt>queryFile</tt>. We write a custom subclass of QAbstractXmlNodeModel (<tt>ChemistryNodeModel</tt>) that reads <tt>chemistryData</tt> and builds a data structure, perhaps composed of objects of our own classes <tt>molecule</tt> and <tt>atom</tt>. Clearly, this data structure is not XML. Our custom subclass will know how to traverse this non-XML structure and present it through the XPath Data Model interface.Error parsing snippet.</pre> The application first creates an instance of {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} and calls {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} to read <tt>queryFile</tt> containing the XQuery we want to run. Then it creates an instance of our custom node model class, <tt>ChemistryNodeModel</tt>, which is a subclass of QAbstractXmlNodeModel. Its constructor is called with the {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool} obtained from our {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}, and with the <tt>chemistryFile</tt> containing the structure of molecules and atoms to be queried. The {@link com.trolltech.qt.xmlpatterns.QXmlNamePool name pool} is required because our custom node model has the member function {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#name(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) name()}, which returns the {@link com.trolltech.qt.xmlpatterns.QXmlName name} of any node in the model. The {@link com.trolltech.qt.xmlpatterns.QXmlQuery query} and the custom node model must use the same name pool for constructing these {@link com.trolltech.qt.xmlpatterns.QXmlName names}. The constructor would then read <tt>chemistryFile</tt> and build the custom node model structure. <p>To connect the <tt>query</tt> to the custom node model, we must bind a variable name used in the query to a node in the model. The variable can then be used in the query as a starting node. First, an {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex index} for the desired starting node is retrieved by calling {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#createIndex(long) QAbstractXmlNodeModel::createIndex()}. Then the index is bound to a variable name, in this case <tt>queryRoot</tt>, by passing the name and the index to {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) QXmlQuery::bindVariable()}. The query can then use a variable reference <tt>$queryRoot</tt> to refer to the starting node. Note that if the {@link com.trolltech.qt.xmlpatterns.QXmlQuery query} uses multiple variable references, a call to {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) QXmlQuery::bindVariable()} is required to bind each different variable name to a node in the model. <p>The query is executed when the application calls one of the {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} evaluation functions. The application uses QXmlQuery::evaluateTo({@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver QAbstractXmlReceiver} *), because it then uses a {@link com.trolltech.qt.xmlpatterns.QXmlSerializer serializer} to out the query result as XML to <tt>stdout</tt>. We could have used QXmlQuery::evaluateTo({@link com.trolltech.qt.xmlpatterns.QXmlResultItems QXmlResultItems} *) to get a list of result items, or QXmlQuery::evaluateTo(QStringList *) if the query evaluated to a sequence of <tt>xs:string</tt> values. <p>During query execution, the engine iterates over the node model using {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#nextFromSimpleAxis(com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel.SimpleAxis, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) nextFromSimpleAxis()} to get the {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex index} of the next node to be visited. The engine can get the name of a node by calling {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#name(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) name()} with the node's {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex index}. {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#stringValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) stringValue()}, {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#baseUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) baseUri()}, {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#documentUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) documentUri()} and {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#kind(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) kind()} are also called as needed with a node {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex index}. <p>The example demonstrates the standard pattern for using a subclass of QAbstractXmlNodeModel in combination with {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} to perform an XQuery. <ol><li> Instantiate {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} and give it the XQuery to be run;</li><li> Instantiate a subclass of QAbstractXmlNodeModel or {@link com.trolltech.qt.xmlpatterns.QSimpleXmlNodeModel QSimpleXmlNodeModel};</li><li> Retrieve a {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} for the node in the model where the {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} should start the query;</li><li> Use {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) QXmlQuery::bindVariable()} to bind the {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} to <tt>$variable name</tt>;</li><li> Call one of the {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} evaluation functions to run the query.</li></ol><a name="subclassing"><h2>Subclassing</h2> Because the XPath Data Model interface presented by QAbstractXmlNodeModel allows {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} to operate on non-XML data as if it were XML, implementing subclasses of QAbstractXmlNodeModel can involve a significant amount of work. The {@link com.trolltech.qt.xmlpatterns.QSimpleXmlNodeModel QSimpleXmlNodeModel} class is provided to simplify the implementation for many common use cases.<a name="thread-safety"><h2>Thread Safety</h2> Because the node model can be accessed concurrently by threads in the {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} module, subclasses of QAbstractXmlNodeModel must be written to be {@link <a href="../qtjambi-threads.html#reentrancy-and-thread-safety">thread-safe</a>}. Classes that simplify implementing thread-safety include QReadLocker and QWriteLocker. <p>See the example {@link <a href="../xmlpatterns-filetree.html">File System Example</a>} for a demonstration.
*/
@QtJambiGeneratedClass
public abstract class QAbstractXmlNodeModel extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> attributes(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex element) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_attributes_QXmlNodeModelIndex(nativeId(), element == null ? 0 : element.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QUrl baseUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_baseUri_QXmlNodeModelIndex(nativeId(), ni == null ? 0 : ni.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder compareOrder(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni1, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni2) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder.resolve(super.__qt_compareOrder_QXmlNodeModelIndex_QXmlNodeModelIndex(nativeId(), ni1 == null ? 0 : ni1.nativeId(), ni2 == null ? 0 : ni2.nativeId()));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QUrl documentUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_documentUri_QXmlNodeModelIndex(nativeId(), ni == null ? 0 : ni.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex elementById(com.trolltech.qt.xmlpatterns.QXmlName NCName) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_elementById_QXmlName(nativeId(), NCName == null ? 0 : NCName.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.NodeKind kind(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.NodeKind.resolve(super.__qt_kind_QXmlNodeModelIndex(nativeId(), ni == null ? 0 : ni.nativeId()));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xmlpatterns.QXmlName name(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_name_QXmlNodeModelIndex(nativeId(), ni == null ? 0 : ni.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.xmlpatterns.QXmlName> namespaceBindings(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_namespaceBindings_QXmlNodeModelIndex(nativeId(), n == null ? 0 : n.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex nextFromSimpleAxis(com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel.SimpleAxis axis, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex origin) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_nextFromSimpleAxis_SimpleAxis_QXmlNodeModelIndex(nativeId(), axis.value(), origin == null ? 0 : origin.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> nodesByIdref(com.trolltech.qt.xmlpatterns.QXmlName NCName) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_nodesByIdref_QXmlName(nativeId(), NCName == null ? 0 : NCName.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex root(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_root_QXmlNodeModelIndex(nativeId(), n == null ? 0 : n.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String stringValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_stringValue_QXmlNodeModelIndex(nativeId(), n == null ? 0 : n.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.Object typedValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_typedValue_QXmlNodeModelIndex(nativeId(), n == null ? 0 : n.nativeId());
        }
    }
/**
Four axes that each contain one node only.
*/


    public enum SimpleAxis implements com.trolltech.qt.QtEnumerator {
/**
 The parent of the context node
*/

        Parent(0),
/**
 The first child of the context node
*/

        FirstChild(1),
/**
 The previous child of the context node
*/

        PreviousSibling(2),
/**
 The next child of the context node
*/

        NextSibling(3);

        SimpleAxis(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractXmlNodeModel$SimpleAxis constant with the specified <tt>int</tt>.</brief>
*/

        public static SimpleAxis resolve(int value) {
            return (SimpleAxis) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Parent;
            case 1: return FirstChild;
            case 2: return PreviousSibling;
            case 3: return NextSibling;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Controls how nodes are copied with copyNodeTo.
*/

    public enum NodeCopySetting implements com.trolltech.qt.QtEnumerator {
/**
 Copies the node with the <tt>copy-namespaces</tt> setting being <tt>inherit</tt>. If not set, <tt>no-inherit</tt> is assumed.
*/

        InheritNamespaces(1),
/**
 Copies the node with the <tt>copy-namespaces</tt> settings being <tt>preserve</tt>. If not set, <tt>no-preserve</tt> is assumed.
*/

        PreserveNamespaces(2);

        NodeCopySetting(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractXmlNodeModel$NodeCopySetting constant with the specified <tt>int</tt>.</brief>
*/

        public static NodeCopySetting resolve(int value) {
            return (NodeCopySetting) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return InheritNamespaces;
            case 2: return PreserveNamespaces;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a node index with <tt>data</tt> as its internal data. <tt>data</tt> is not constrained.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex createIndex(long data)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createIndex_long(nativeId(), data);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_createIndex_long(long __this__nativeId, long data);

/**
This is an overloaded member function, provided for convenience. <p>Creates a {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} containing <tt>data</tt> and <tt>additionalData</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex createIndex(long data, long additionalData)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createIndex_long_long(nativeId(), data, additionalData);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_createIndex_long_long(long __this__nativeId, long data, long additionalData);


/**
Creates a node index with <tt>pointer</tt> and <tt>additionalData</tt> as its internal data. <p>What <tt>pointer</tt> and <tt>additionalData</tt> is, is not constrained.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex createIndex(com.trolltech.qt.QNativePointer pointer) {
        return createIndex(pointer, (long)0);
    }
/**
Creates a node index with <tt>pointer</tt> and <tt>additionalData</tt> as its internal data. <p>What <tt>pointer</tt> and <tt>additionalData</tt> is, is not constrained.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex createIndex(com.trolltech.qt.QNativePointer pointer, long additionalData)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createIndex_nativepointer_long(nativeId(), pointer, additionalData);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_createIndex_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer pointer, long additionalData);

/**
Returns the attributes of <tt>element</tt>. The caller guarantees that <tt>element</tt> is an element in this node model.
*/

    @QtBlockedSlot
    protected abstract java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> attributes(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex element);
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> __qt_attributes_QXmlNodeModelIndex(long __this__nativeId, long element);

/**
Returns the base URI for the node whose index is <tt>n</tt>. The caller guarantees that <tt>n</tt> is not <tt>null</tt> and that it belongs to a node in this node model. <p>The base URI of a node can be extracted using the <tt>fn:base-uri()</tt> function. The base URI is typically used for resolving relative URIs that appear in the node or its children. It is conformant to just return the document URI, although that might not properly reflect the underlying data. <p>This function maps to the <tt>dm:base-uri</tt> accessor, which returns a base URI according to the following: <ul><li> For document nodes, the base URI and the document URI are the same.</li><li> For elements, the base URI is the URI appearing in the element's <tt>xml:base</tt> attribute, if present, or it is resolved to the parent element's base URI.</li><li> Namespace nodes have no base URI.</li><li> The base URI for a processing instruction, comment, attribute, or text node is the base URI of the node's parent element.</li></ul> The implementation guarantees to return a valid {@link com.trolltech.qt.core.QUrl QUrl}, or a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. If a node has no base URI, as in the case where a comment has no parent, a default constructed {@link com.trolltech.qt.core.QUrl QUrl} is returned. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QUrl baseUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni);
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_baseUri_QXmlNodeModelIndex(long __this__nativeId, long ni);

/**
This function returns the relative document order for the nodes indexed by <tt>ni1</tt> and <tt>ni2</tt>. It is used for the <tt>Is</tt> operator and for sorting nodes in document order. <p>The caller guarantees that <tt>ni1</tt> and <tt>ni2</tt> are not <tt>null</tt> and that both identify nodes in this node model. <p>If <tt>ni1</tt> is identical to <tt>ni2</tt>, {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder QXmlNodeModelIndex::Is } is returned. If <tt>ni1</tt> precedes <tt>ni2</tt> in document order, {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder QXmlNodeModelIndex::Precedes } is returned. If <tt>ni1</tt> follows <tt>ni2</tt> in document order, {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder QXmlNodeModelIndex::Follows } is returned. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.DocumentOrder compareOrder(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni1, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni2);
    @QtBlockedSlot
    native int __qt_compareOrder_QXmlNodeModelIndex_QXmlNodeModelIndex(long __this__nativeId, long ni1, long ni2);

/**
Returns the document URI of <tt>n</tt>. The document URI identifies the resource which is the document. For example, the document could be a regular file, e.g., <tt>file:/</tt>, or it could be the <tt>http://</tt> URL of the location of a file. The document URI is used for resolving URIs and to simply know where the document is. <p>If the node model maps to a URI in a natural way, return that URI. Otherwise, return the company or product URI. The document URI can be any URI as long as its valid and absolute. <p>The caller guarantees that <tt>n</tt> is not <tt>null</tt> and that it belongs to this QAbstractXmlNodeModel. <p>This function maps to the <tt>dm:document-uri</tt> accessor, which returns a document URI according to the following: <ul><li> If <tt>n</tt> is a document node, return an absolute {@link com.trolltech.qt.core.QUrl QUrl} containing the document URI, or a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. The latter signals that no document URI is available for the document node.</li><li> For all other nodes, return a default constructed {@link com.trolltech.qt.core.QUrl QUrl}.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#isValid() QUrl::isValid()}, and {@link com.trolltech.qt.core.QUrl#isRelative() QUrl::isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QUrl documentUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni);
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_documentUri_QXmlNodeModelIndex(long __this__nativeId, long ni);

/**
Returns the index of the element identified as <tt>id</tt>. XQuery's <tt>id()</tt> function calls this function. <p>The node index returned will be the element node whose value is of type <tt>ID</tt> and equals <tt>id</tt>, or it will be the element node that has an attribute whose typed value is of type <tt>ID</tt> and equals <tt>id</tt>. If there is no such element, a default constructed {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} instance is returned. The implementor guarantees that if the returned node index is not null, it identifies an element. <p>It is not sufficient for an attribute or element to merely be called <tt>id</tt>. Its value type must also be <tt>ID</tt>. However, the reserved name <tt>xml:id</tt> is sufficient. <p>In <tt>id</tt>, the <tt>namespace URI</tt> and the <tt>prefix</tt> are undefined, and the <tt>local name</tt> is the ID that should be looked up. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex elementById(com.trolltech.qt.xmlpatterns.QXmlName NCName);
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_elementById_QXmlName(long __this__nativeId, long NCName);

/**
Returns a value indicating the kind of node identified by <tt>ni</tt>. The caller guarantees that <tt>ni</tt> is not null and that it identifies a node in this node model. This function maps to the <tt>dm:node-kind()</tt> accessor. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex.NodeKind kind(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni);
    @QtBlockedSlot
    native int __qt_kind_QXmlNodeModelIndex(long __this__nativeId, long ni);

/**
Returns the name of <tt>ni</tt>. The caller guarantees that <tt>ni</tt> is not <tt>null</tt> and that it belongs to this QAbstractXmlNodeModel. <p>If a node does not have a name, e.g., comment nodes, a null {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} is returned. QXmlNames must be created with the instance of {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} that is being used for evaluating queries using this QAbstractXmlNodeModel. <p>This function maps to the <tt>dm:node-name()</tt> accessor. <p>If <tt>ni</tt> is a processing instruction, a {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} is returned with the local name as the target name and the namespace URI and prefix both empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xmlpatterns.QXmlName name(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex ni);
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlName __qt_name_QXmlNodeModelIndex(long __this__nativeId, long ni);

/**
Returns the in-scope namespaces of <tt>n</tt>. The caller guarantees that <tt>n</tt> is not <tt>null</tt> and that it belongs to this QAbstractXmlNodeModel. <p>This function corresponds to the <tt>dm:namespace-nodes</tt> accessor. <p>The returned vector of namespace declarations includes namespaces of the ancestors of <tt>n</tt>. <p>The caller guarantees that <tt>n</tt> is an Element that belongs to this QAbstractXmlNodeModel.
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.xmlpatterns.QXmlName> namespaceBindings(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n);
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlName> __qt_namespaceBindings_QXmlNodeModelIndex(long __this__nativeId, long n);

/**
When {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} evaluate path expressions, it emulate them through a combination of calls with {@link com.trolltech.qt.xmlpatterns.QSimpleXmlNodeModel.SimpleAxis QSimpleXmlNodeModel::SimpleAxis } values. Therefore, the implementation of this function must return the node, if any, that appears on the <tt>axis</tt> emanating from the <tt>origin</tt>. <p>If no such node is available, a default constructed {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} is returned. <p>{@link com.trolltech.qt.xmlpatterns.QSimpleXmlNodeModel QSimpleXmlNodeModel} eliminates the need to handle redundant corner cases by guaranteeing that it will never ask for: <ul><li> Children or siblings for attributes.</li><li> Children for comments, processing instructions, and text nodes.</li><li> Siblings or parents for document nodes.</li></ul> A typical implementation performs a <tt>switch</tt> on the value of <tt>axis</tt>:<pre>QXmlNodeModelIndex MyTreeModel::nextFromSimpleAxis(SimpleAxis axis, const QXmlNodeModelIndex &origin) const
{
  // Convert the QXmlNodeModelIndex to a value that is specific to what we represent.
  const MyValue value = toMyValue(ni);

  switch(axis)
  {
      case Parent:
          return toNodeIndex(value.parent());
      case FirstChild:
      case PreviousSibling:
      case NextSibling:
          // and so on
  }
}</pre>
*/

    @QtBlockedSlot
    protected abstract com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex nextFromSimpleAxis(com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel.SimpleAxis axis, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex origin);
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_nextFromSimpleAxis_SimpleAxis_QXmlNodeModelIndex(long __this__nativeId, int axis, long origin);

/**
Returns the elements and/or attributes that have an <tt>IDREF</tt> value equal to <tt>idref</tt>. XQuery's <tt>idref()</tt> function calls this function. <p>The implementor guarantees that the nodes identified by the returned indexes are elements or attributes. <p>It is not sufficient for an attribute or element to merely be called <tt>idref</tt>. It must also be of type <tt>IDREF</tt>. Elements must be typed as <tt>xs:IDREF</tt> or <tt>xs:IDREFS</tt>, or, in the case of attributes, as <tt>IDREF</tt> or <tt>IDREFS</tt> in the schema. <p>In <tt>idref</tt>, the <tt>namespace URI</tt> and the <tt>prefix</tt> are undefined, and the <tt>local name</tt> is the ID that should be looked up. <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> nodesByIdref(com.trolltech.qt.xmlpatterns.QXmlName NCName);
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> __qt_nodesByIdref_QXmlName(long __this__nativeId, long NCName);

/**
Returns the root node of the tree that contains the node whose index is <tt>n</tt>. The caller guarantees that <tt>n</tt> is not <tt>null</tt> and that it identifies a node in this node model. <p>If <tt>n</tt> identifies a node that is a direct child of the root, parent() would return the same {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex} returned by this function.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex root(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n);
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_root_QXmlNodeModelIndex(long __this__nativeId, long n);

/**
Returns the string value for node <tt>n</tt>. <p>The caller guarantees that <tt>n</tt> is not <tt>null</tt> and that it belong to this QAbstractXmlNodeModel instance. <p>This function maps to the <tt>dm:string-value()</tt> accessor, which the specification completely specifies. Here's a summary: <ul><li> For processing instructions, the string value is the data section(excluding any whitespace appearing between the name and the data).</li><li> For text nodes, the string value equals the text node.</li><li> For comments, the content of the comment</li><li> For elements, the concatenation of all text nodes that are descendants. Note, this is not only the children, but the childrens' childrens' text nodes, and so forth.</li><li> For document nodes, the concatenation of all text nodes in the document.</li></ul> <p><DT><b>See also:</b><br><DD></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String stringValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n);
    @QtBlockedSlot
    native java.lang.String __qt_stringValue_QXmlNodeModelIndex(long __this__nativeId, long n);

/**
Returns the typed value for node <tt>node</tt>. <p>The typed value is an atomic value, which an element or attribute contains. <p>The caller guarantees that <tt>node</tt> is either an element or an attribute. The implementor guarantees that the returned {@link com.trolltech.qt.QVariant QVariant} has a value which is supported in XQuery. It cannot be an arbitrary {@link com.trolltech.qt.QVariant QVariant} value. The implementor also guarantees that {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#stringValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) stringValue()} returns a lexical representation of {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#typedValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) typedValue()}(this is guaranteed by QSimpleXmlNodeModel::stringValue()). <p>If the return {@link com.trolltech.qt.QVariant QVariant} is a default constructed variant, it signals that <tt>node</tt> has no typed value.
*/

    @QtBlockedSlot
    public abstract java.lang.Object typedValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n);
    @QtBlockedSlot
    native java.lang.Object __qt_typedValue_QXmlNodeModelIndex(long __this__nativeId, long n);

/**
@exclude
*/

    public static native QAbstractXmlNodeModel fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractXmlNodeModel(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QAbstractXmlNodeModel array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QAbstractXmlNodeModel clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QAbstractXmlNodeModel __qt_clone(long __this_nativeId);
}
