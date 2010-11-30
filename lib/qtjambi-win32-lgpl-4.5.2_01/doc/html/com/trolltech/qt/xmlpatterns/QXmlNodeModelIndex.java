package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlNodeModelIndex class identifies a node in an XML node model subclassed from {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel}. QXmlNodeModelIndex is an index into an {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel XML node model}. It contains: <ul><li> A pointer to an {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel XML node model}, which is returned by {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#model() model()}, and</li><li> Some data, which is returned by {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#data() data()}, internalPointer(), and {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#additionalData() additionalData()}.</li></ul> Because QXmlNodeModelIndex is intentionally a simple class, it doesn't have member functions for accessing the properties of nodes. For example, it doesn't have functions for getting a node's name or its list of attributes or child nodes. If you find that you need to retrieve this kind of information from your query results, there are two ways to proceed. <ul><li> Send the output of your XQuery to an {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver XML receiver}, or</li><li> Let your XQuery do all the work to produce the desired result.</li></ul> The second case is explained by example. Suppose you want to populate a list widget with the values of certain attributes from a set of result elements. You could write an XQuery to return the set of elements, and then you would write the code to iterate over the result elements, get their attributes, and extract the desired string values. But the simpler way is to just augment your XQuery to finding the desired attribute values. Then all you have to do is evaluate the XQuery using the version of {@link com.trolltech.qt.xmlpatterns.QXmlQuery#evaluateTo(com.trolltech.qt.core.QIODevice) QXmlQuery::evaluateTo()} that populates a QStringList, which you can send directly to your widget. <p>QXmlNodeModelIndex doesn't impose any restrictions on the <tt>data</tt> value an QXmlNodeModelIndex should contain. The meaning of the data left to the associated {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel node model}. Because QXmlNodeModelIndex depends on a particular subclass of {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} for its existence, the only way you can create an instance of QXmlNodeModelIndex is by asking the node model to create one for you with {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#createIndex(long) QAbstractXmlNodeModel::createIndex()}. Since that function is protected, it is usually a good ide to write a public function that creates a QXmlNodeModelIndex from arguments that are appropriate for your particular node model. <p>A default constructed node index is said to be null, i.e., {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#isNull() isNull()} returns true. <p>QXmlNodeModelIndex and {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} follow the same design pattern used for QModelIndex and {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}.
*/
@QtJambiGeneratedClass
public class QXmlNodeModelIndex extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }
/**
Identifies a kind of node. Note that the optional XML declaration at very beginning of the XML document is not a processing instruction <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#kind(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) QAbstractXmlNodeModel::kind()}. <br></DD></DT>
*/

    public enum NodeKind implements com.trolltech.qt.QtEnumerator {
/**
 Identifies an attribute node
*/

        Attribute(1),
/**
 Identifies a comment node
*/

        Comment(2),
/**
 Identifies a document node
*/

        Document(4),
/**
 Identifies an element node
*/

        Element(8),
/**
 Identifies a namespace node
*/

        Namespace(16),
/**
 Identifies a processing instruction.
*/

        ProcessingInstruction(32),
/**
 Identifies a text node
*/

        Text(64);

        NodeKind(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QXmlNodeModelIndex$NodeKind constant with the specified <tt>int</tt>.</brief>
*/

        public static NodeKind resolve(int value) {
            return (NodeKind) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Attribute;
            case 2: return Comment;
            case 4: return Document;
            case 8: return Element;
            case 16: return Namespace;
            case 32: return ProcessingInstruction;
            case 64: return Text;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Identifies the specific node comparison operator that should be used.
*/

    public enum DocumentOrder implements com.trolltech.qt.QtEnumerator {
/**
 Signifies the <tt>\&lt;\&lt;</tt> operator. Test whether the first operand precedes the second in the document.
*/

        Precedes(-1),
/**
 Signifies the <tt>is</tt> operator. Test whether two nodes have the same node identity.
*/

        Is(0),
/**
 Signifies the <tt>\&gt;\&gt;</tt> operator. Test whether the first operand follows the second in the document.
*/

        Follows(1);

        DocumentOrder(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QXmlNodeModelIndex$DocumentOrder constant with the specified <tt>int</tt>.</brief>
*/

        public static DocumentOrder resolve(int value) {
            return (DocumentOrder) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return Precedes;
            case 0: return Is;
            case 1: return Follows;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Default constructor. Creates an item that is <tt>null</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#isNull() isNull()}. <br></DD></DT>
*/

    public QXmlNodeModelIndex(){
        super((QPrivateConstructor)null);
        __qt_QXmlNodeModelIndex();
    }

    native void __qt_QXmlNodeModelIndex();

/**
Standard copy constructor. Creates a QXmlNodeModelIndex instance that is a copy of <tt>other</tt>.
*/

    public QXmlNodeModelIndex(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex other){
        super((QPrivateConstructor)null);
        __qt_QXmlNodeModelIndex_QXmlNodeModelIndex(other == null ? 0 : other.nativeId());
    }

    native void __qt_QXmlNodeModelIndex_QXmlNodeModelIndex(long other);

/**
Returns the second data value. The node index holds two data values. {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#data() data()} returns the first one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long additionalData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_additionalData(nativeId());
    }
    @QtBlockedSlot
    native long __qt_additionalData(long __this__nativeId);

/**
Returns the first data value. The node index holds two data values. {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#additionalData() additionalData()} returns the second one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex#additionalData() additionalData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native long __qt_data(long __this__nativeId);

/**
Returns true if this QXmlNodeModelIndex is a default constructed value, otherwise false. <p>A null QXmlNodeModelIndex doesn't represent any node and cannot be used in conjunction with {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel}.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer model_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_model_private(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QXmlNodeModelIndex(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QXmlNodeModelIndex(long __this__nativeId, long other);

/**
@exclude
*/

    public static native QXmlNodeModelIndex fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlNodeModelIndex(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlNodeModelIndex array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex)
        return operator_equal((com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex) other);
        return false;
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

/**
Returns the {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} that this node index refers to. QXmlNodeModelIndex does not own {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} and does not keep track of its lifetime, so this pointer will dangle if the {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} is deallocated first. <p>There is no setter for the node model because instances of QXmlNodeModelIndex instances are only created with {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel#createIndex(long) QAbstractXmlNodeModel::createIndex()}.
*/

    @QtBlockedSlot
    public final QAbstractXmlNodeModel model() {
        return QAbstractXmlNodeModel.fromNativePointer(model_private());
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlNodeModelIndex clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlNodeModelIndex __qt_clone(long __this_nativeId);
}
