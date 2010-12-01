package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomComment class represents an XML comment. A comment in the parsed XML such as this: <pre class="snippet">
        &lt;!-- this is a comment -.
</pre> is represented by QDomComment objects in the parsed Dom tree. <p>For further information about the Document Object Model see http://www.w3.org/TR/REC-DOM-Level-1/ and http://www.w3.org/TR/DOM-Level-2-Core/. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomComment extends com.trolltech.qt.xml.QDomCharacterData
    implements java.lang.Cloneable
{

/**
Constructs an empty comment. To construct a comment with content, use the {@link com.trolltech.qt.xml.QDomDocument#createComment(java.lang.String) QDomDocument::createComment()} function.
*/

    public QDomComment(){
        super((QPrivateConstructor)null);
        __qt_QDomComment();
    }

    native void __qt_QDomComment();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomComment(com.trolltech.qt.xml.QDomComment x){
        super((QPrivateConstructor)null);
        __qt_QDomComment_QDomComment(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomComment_QDomComment(long x);

/**
@exclude
*/

    public static native QDomComment fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomComment(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomComment array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomComment clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomComment __qt_clone(long __this_nativeId);
}
