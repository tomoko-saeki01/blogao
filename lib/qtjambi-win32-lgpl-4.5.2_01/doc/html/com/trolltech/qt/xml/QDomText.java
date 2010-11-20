package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomText class represents text data in the parsed XML document. You can split the text in a QDomText object over two QDomText objecs with {@link com.trolltech.qt.xml.QDomText#splitText(int) splitText()}. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomText extends com.trolltech.qt.xml.QDomCharacterData
    implements java.lang.Cloneable
{

/**
Constructs an empty QDomText object. <p>To construct a QDomText with content, use {@link com.trolltech.qt.xml.QDomDocument#createTextNode(java.lang.String) QDomDocument::createTextNode()}.
*/

    public QDomText(){
        super((QPrivateConstructor)null);
        __qt_QDomText();
    }

    native void __qt_QDomText();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomText(com.trolltech.qt.xml.QDomText x){
        super((QPrivateConstructor)null);
        __qt_QDomText_QDomText(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomText_QDomText(long x);

/**
Splits this DOM text object into two QDomText objects. This object keeps its first <tt>offset</tt> characters and the second (newly created) object is inserted into the document tree after this object with the remaining characters. <p>The function returns the newly created object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#normalize() QDomNode::normalize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomText splitText(int offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_splitText_int(nativeId(), offset);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomText __qt_splitText_int(long __this__nativeId, int offset);

/**
@exclude
*/

    public static native QDomText fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomText(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomText array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomText clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomText __qt_clone(long __this_nativeId);
}
