package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomProcessingInstruction class represents an XML processing instruction. Processing instructions are used in XML to keep processor-specific information in the text of the document. <p>The XML declaration that appears at the top of an XML document, typically <tt>&lt;?xml version='1.0' encoding='UTF-8'?&gt;</tt>, is treated by QDom as a processing instruction. This is unfortunate, since the XML declaration is not a processing instruction; among other differences, it cannot be inserted into a document anywhere but on the first line. <p>Do not use this function to create an xml declaration, since although it has the same syntax as a processing instruction, it isn't, and might not be treated by QDom as such. <p>The content of the processing instruction is retrieved with {@link com.trolltech.qt.xml.QDomProcessingInstruction#data() data()} and set with {@link com.trolltech.qt.xml.QDomProcessingInstruction#setData(java.lang.String) setData()}. The processing instruction's target is retrieved with {@link com.trolltech.qt.xml.QDomProcessingInstruction#target() target()}. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation.
*/
@QtJambiGeneratedClass
public class QDomProcessingInstruction extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty processing instruction. Use {@link com.trolltech.qt.xml.QDomDocument#createProcessingInstruction(java.lang.String, java.lang.String) QDomDocument::createProcessingInstruction()} to create a processing instruction with content.
*/

    public QDomProcessingInstruction(){
        super((QPrivateConstructor)null);
        __qt_QDomProcessingInstruction();
    }

    native void __qt_QDomProcessingInstruction();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomProcessingInstruction(com.trolltech.qt.xml.QDomProcessingInstruction x){
        super((QPrivateConstructor)null);
        __qt_QDomProcessingInstruction_QDomProcessingInstruction(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomProcessingInstruction_QDomProcessingInstruction(long x);

/**
Returns the content of this processing instruction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomProcessingInstruction#setData(java.lang.String) setData()}, and {@link com.trolltech.qt.xml.QDomProcessingInstruction#target() target()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_data(long __this__nativeId);

/**
Sets the data contained in the processing instruction to <tt>d</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomProcessingInstruction#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(java.lang.String d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_String(nativeId(), d);
    }
    @QtBlockedSlot
    native void __qt_setData_String(long __this__nativeId, java.lang.String d);

/**
Returns the target of this processing instruction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomProcessingInstruction#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String target()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_target(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_target(long __this__nativeId);

/**
@exclude
*/

    public static native QDomProcessingInstruction fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomProcessingInstruction(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomProcessingInstruction array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomProcessingInstruction clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomProcessingInstruction __qt_clone(long __this_nativeId);
}
