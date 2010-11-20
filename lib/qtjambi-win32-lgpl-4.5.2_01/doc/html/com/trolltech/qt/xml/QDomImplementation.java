package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomImplementation class provides information about the features of the DOM implementation. This class describes the features that are supported by the DOM implementation. Currently the XML subset of DOM Level 1 and DOM Level 2 Core are supported. <p>Normally you will use the function {@link com.trolltech.qt.xml.QDomDocument#implementation() QDomDocument::implementation()} to get the implementation object. <p>You can create a new document type with {@link com.trolltech.qt.xml.QDomImplementation#createDocumentType(java.lang.String, java.lang.String, java.lang.String) createDocumentType()} and a new document with {@link com.trolltech.qt.xml.QDomImplementation#createDocument(java.lang.String, java.lang.String, com.trolltech.qt.xml.QDomDocumentType) createDocument()}. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation. <p>The QDom classes have a few issues of nonconformance with the XML specifications that cannot be fixed in Qt 4 without breaking backward Â compatibility. The {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} module and the {@link com.trolltech.qt.xml.QXmlStreamReader QXmlStreamReader} and Â {@link com.trolltech.qt.xml.QXmlStreamWriter QXmlStreamWriter} classes have a higher degree of a conformance. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#hasFeature(java.lang.String, java.lang.String) hasFeature()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDomImplementation extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }
/**
This enum specifies what should be done when a factory function in {@link com.trolltech.qt.xml.QDomDocument QDomDocument} is called with invalid data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#setInvalidDataPolicy(com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy) setInvalidDataPolicy()}, and {@link com.trolltech.qt.xml.QDomImplementation#invalidDataPolicy() invalidDataPolicy()}. <br></DD></DT>
*/

    public enum InvalidDataPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The data should be stored in the DOM object anyway. In this case the resulting XML document might not be well-formed. This is the default value and QDom's behavior in Qt &lt; 4.1.
*/

        AcceptInvalidChars(0),
/**
 The invalid characters should be removed from the data.
*/

        DropInvalidChars(1),
/**
 The factory function should return a null node.
*/

        ReturnNullNode(2);

        InvalidDataPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDomImplementation$InvalidDataPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static InvalidDataPolicy resolve(int value) {
            return (InvalidDataPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AcceptInvalidChars;
            case 1: return DropInvalidChars;
            case 2: return ReturnNullNode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QDomImplementation object.
*/

    public QDomImplementation(){
        super((QPrivateConstructor)null);
        __qt_QDomImplementation();
    }

    native void __qt_QDomImplementation();

/**
Constructs a copy of <tt>x</tt>.
*/

    public QDomImplementation(com.trolltech.qt.xml.QDomImplementation arg__1){
        super((QPrivateConstructor)null);
        __qt_QDomImplementation_QDomImplementation(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDomImplementation_QDomImplementation(long arg__1);

/**
Creates a DOM document with the document type <tt>doctype</tt>. This function also adds a root element node with the qualified name <tt>qName</tt> and the namespace URI <tt>nsURI</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocument createDocument(java.lang.String nsURI, java.lang.String qName, com.trolltech.qt.xml.QDomDocumentType doctype)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createDocument_String_String_QDomDocumentType(nativeId(), nsURI, qName, doctype == null ? 0 : doctype.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocument __qt_createDocument_String_String_QDomDocumentType(long __this__nativeId, java.lang.String nsURI, java.lang.String qName, long doctype);

/**
Creates a document type node for the name <tt>qName</tt>. <p><tt>publicId</tt> specifies the public identifier of the external subset. If you specify an empty string (QString()) as the <tt>publicId</tt>, this means that the document type has no public identifier. <p><tt>systemId</tt> specifies the system identifier of the external subset. If you specify an empty string as the <tt>systemId</tt>, this means that the document type has no system identifier. <p>Since you cannot have a public identifier without a system identifier, the public identifier is set to an empty string if there is no system identifier. <p>DOM level 2 does not support any other document type declaration features. <p>The only way you can use a document type that was created this way, is in combination with the {@link com.trolltech.qt.xml.QDomImplementation#createDocument(java.lang.String, java.lang.String, com.trolltech.qt.xml.QDomDocumentType) createDocument()} function to create a {@link com.trolltech.qt.xml.QDomDocument QDomDocument} with this document type. <p>In the DOM specification, this is the only way to create a non-null document. For historical reasons, Qt also allows to create the document using the default empty constructor. The resulting document is null, but becomes non-null when a factory function, for example {@link com.trolltech.qt.xml.QDomDocument#createElement(java.lang.String) QDomDocument::createElement()}, is called. The document also becomes non-null when setContent() is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#createDocument(java.lang.String, java.lang.String, com.trolltech.qt.xml.QDomDocumentType) createDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomDocumentType createDocumentType(java.lang.String qName, java.lang.String publicId, java.lang.String systemId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createDocumentType_String_String_String(nativeId(), qName, publicId, systemId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomDocumentType __qt_createDocumentType_String_String_String(long __this__nativeId, java.lang.String qName, java.lang.String publicId, java.lang.String systemId);

/**
The function returns true if QDom implements the requested <tt>version</tt> of a <tt>feature</tt>; otherwise returns false. <p>The currently supported features and their versions: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Feature</center></th><th><center> Version</center></th></tr></thead><tr valign="top" class="even"><td> XML</td><td> 1.0</td></tr></table>
*/

    @QtBlockedSlot
    public final boolean hasFeature(java.lang.String feature, java.lang.String version)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFeature_String_String(nativeId(), feature, version);
    }
    @QtBlockedSlot
    native boolean __qt_hasFeature_String_String(long __this__nativeId, java.lang.String feature, java.lang.String version);

/**
Returns false if the object was created by {@link com.trolltech.qt.xml.QDomDocument#implementation() QDomDocument::implementation()}; otherwise returns true.
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
    private final boolean operator_equal(com.trolltech.qt.xml.QDomImplementation arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDomImplementation(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDomImplementation(long __this__nativeId, long arg__1);

/**
Returns the invalid data policy, which specifies what should be done when a factory function in {@link com.trolltech.qt.xml.QDomDocument QDomDocument} is passed invalid data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#setInvalidDataPolicy(com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy) setInvalidDataPolicy()}, and {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy InvalidDataPolicy }. <br></DD></DT>
*/

    public static com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy invalidDataPolicy()    {
        return com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy.resolve(__qt_invalidDataPolicy());
    }
    native static int __qt_invalidDataPolicy();

/**
Sets the invalid data policy, which specifies what should be done when a factory function in {@link com.trolltech.qt.xml.QDomDocument QDomDocument} is passed invalid data. <p>The <tt>policy</tt> is set for all instances of {@link com.trolltech.qt.xml.QDomDocument QDomDocument} which already exist and which will be created in the future. <pre class="snippet">
        QDomDocument doc = new QDomDocument();
        QDomImplementation impl = new QDomImplementation();

        // This will create the element, but the resulting XML document will
        // be invalid, because '~' is not a valid character in a tag name.
        impl.setInvalidDataPolicy(QDomImplementation.InvalidDataPolicy.AcceptInvalidChars);
        QDomElement elt1 = doc.createElement("foo~bar");

        // This will create an element with the tag name "foobar".
        impl.setInvalidDataPolicy(QDomImplementation.InvalidDataPolicy.DropInvalidChars);
        QDomElement elt2 = doc.createElement("foo~bar");

        // This will create a null element.
        impl.setInvalidDataPolicy(QDomImplementation.InvalidDataPolicy.ReturnNullNode);
        QDomElement elt3 = doc.createElement("foo~bar");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomImplementation#invalidDataPolicy() invalidDataPolicy()}, and {@link com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy InvalidDataPolicy }. <br></DD></DT>
*/

    public static void setInvalidDataPolicy(com.trolltech.qt.xml.QDomImplementation.InvalidDataPolicy policy)    {
        __qt_setInvalidDataPolicy_InvalidDataPolicy(policy.value());
    }
    native static void __qt_setInvalidDataPolicy_InvalidDataPolicy(int policy);

/**
@exclude
*/

    public static native QDomImplementation fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomImplementation(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomImplementation array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QDomImplementation)
        return operator_equal((com.trolltech.qt.xml.QDomImplementation) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomImplementation clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomImplementation __qt_clone(long __this_nativeId);
}
