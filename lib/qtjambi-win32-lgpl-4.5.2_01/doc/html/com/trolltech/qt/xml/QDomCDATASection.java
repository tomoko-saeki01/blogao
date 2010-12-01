package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomCDATASection class represents an XML CDATA section. CDATA sections are used to escape blocks of text containing characters that would otherwise be regarded as markup. The only delimiter that is recognized in a CDATA section is the "]]&gt;" string that terminates the CDATA section. CDATA sections cannot be nested. Their primary purpose is for including material such as XML fragments, without needing to escape all the delimiters. <p>Adjacent QDomCDATASection nodes are not merged by the {@link com.trolltech.qt.xml.QDomNode#normalize() QDomNode::normalize()} function. <p>For further information about the Document Object Model see http://www.w3.org/TR/REC-DOM-Level-1/ and http://www.w3.org/TR/DOM-Level-2-Core/. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomCDATASection extends com.trolltech.qt.xml.QDomText
    implements java.lang.Cloneable
{

/**
Constructs an empty CDATA section. To create a CDATA section with content, use the {@link com.trolltech.qt.xml.QDomDocument#createCDATASection(java.lang.String) QDomDocument::createCDATASection()} function.
*/

    public QDomCDATASection(){
        super((QPrivateConstructor)null);
        __qt_QDomCDATASection();
    }

    native void __qt_QDomCDATASection();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomCDATASection(com.trolltech.qt.xml.QDomCDATASection x){
        super((QPrivateConstructor)null);
        __qt_QDomCDATASection_QDomCDATASection(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomCDATASection_QDomCDATASection(long x);

/**
@exclude
*/

    public static native QDomCDATASection fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomCDATASection(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomCDATASection array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomCDATASection clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomCDATASection __qt_clone(long __this_nativeId);
}
