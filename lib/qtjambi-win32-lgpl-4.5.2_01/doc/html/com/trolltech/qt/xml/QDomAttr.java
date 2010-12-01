package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomAttr class represents one attribute of a {@link com.trolltech.qt.xml.QDomElement QDomElement}. For example, the following piece of XML produces an element with no children, but two attributes: <pre class="snippet">
    &lt;link href="http://www.trolltech.com" color="red" /&gt;
</pre> You can access the attributes of an element with code like this: <pre class="snippet">
    QDomElement e = //...
    //...
    QDomAttr a = e.attributeNode("href");
    System.out.println(a.value());                // prints "http://www.trolltech.com"
    a.setValue("http://doc.trolltech.com"); // change the node's attribute
    QDomAttr a2 = e.attributeNode("href");
    System.out.println(a2.value());               // prints "http://doc.trolltech.com"
</pre> This example also shows that changing an attribute received from an element changes the attribute of the element. If you do not want to change the value of the element's attribute you must use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()} to get an independent copy of the attribute. <p>QDomAttr can return the {@link com.trolltech.qt.xml.QDomAttr#name() name()} and {@link com.trolltech.qt.xml.QDomAttr#value() value()} of an attribute. An attribute's value is set with {@link com.trolltech.qt.xml.QDomAttr#setValue(java.lang.String) setValue()}. If {@link com.trolltech.qt.xml.QDomAttr#specified() specified()} returns true the value was set with {@link com.trolltech.qt.xml.QDomAttr#setValue(java.lang.String) setValue()}. The node this attribute is attached to (if any) is returned by {@link com.trolltech.qt.xml.QDomAttr#ownerElement() ownerElement()}. <p>For further information about the Document Object Model see http://www.w3.org/TR/REC-DOM-Level-1/ and http://www.w3.org/TR/DOM-Level-2-Core/. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomAttr extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty attribute.
*/

    public QDomAttr(){
        super((QPrivateConstructor)null);
        __qt_QDomAttr();
    }

    native void __qt_QDomAttr();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomAttr(com.trolltech.qt.xml.QDomAttr x){
        super((QPrivateConstructor)null);
        __qt_QDomAttr_QDomAttr(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomAttr_QDomAttr(long x);

/**
Returns the attribute's name.
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
Returns the element node this attribute is attached to or a {@link com.trolltech.qt.xml.QDomNode#isNull() null node} if this attribute is not attached to any element.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomElement ownerElement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownerElement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomElement __qt_ownerElement(long __this__nativeId);

/**
Sets the attribute's value to <tt>v</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomAttr#value() value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setValue_String(long __this__nativeId, java.lang.String arg__1);

/**
Returns true if the attribute has been set by the user with {@link com.trolltech.qt.xml.QDomAttr#setValue(java.lang.String) setValue()}. Returns false if the value hasn't been specified or set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomAttr#setValue(java.lang.String) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean specified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_specified(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_specified(long __this__nativeId);

/**
Returns the value of the attribute or an empty string if the attribute has not been specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomAttr#specified() specified()}, and {@link com.trolltech.qt.xml.QDomAttr#setValue(java.lang.String) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_value(long __this__nativeId);

/**
@exclude
*/

    public static native QDomAttr fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomAttr(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomAttr array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomAttr clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomAttr __qt_clone(long __this_nativeId);
}
