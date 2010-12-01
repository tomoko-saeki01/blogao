package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomNodeList class is a list of {@link com.trolltech.qt.xml.QDomNode QDomNode} objects. Lists can be obtained by {@link com.trolltech.qt.xml.QDomDocument#elementsByTagName(java.lang.String) QDomDocument::elementsByTagName()} and {@link com.trolltech.qt.xml.QDomNode#childNodes() QDomNode::childNodes()}. The Document Object Model (DOM) requires these lists to be "live": whenever you change the underlying document, the contents of the list will get updated. <p>You can get a particular node from the list with {@link com.trolltech.qt.xml.QDomNodeList#item(int) item()}. The number of items in the list is returned by {@link com.trolltech.qt.xml.QDomNodeList#length() length()}. <p>For further information about the Document Object Model see Level 1 and Level 2 Core. For a more general introduction of the DOM implementation see the {@link com.trolltech.qt.xml.QDomDocument QDomDocument} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNode#childNodes() QDomNode::childNodes()}, and {@link com.trolltech.qt.xml.QDomDocument#elementsByTagName(java.lang.String) QDomDocument::elementsByTagName()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDomNodeList extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty node list.
*/

    public QDomNodeList(){
        super((QPrivateConstructor)null);
        __qt_QDomNodeList();
    }

    native void __qt_QDomNodeList();

/**
Constructs a copy of <tt>n</tt>.
*/

    public QDomNodeList(com.trolltech.qt.xml.QDomNodeList arg__1){
        super((QPrivateConstructor)null);
        __qt_QDomNodeList_QDomNodeList(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDomNodeList_QDomNodeList(long arg__1);

/**
This function is provided for Qt API consistency. It is equivalent to {@link com.trolltech.qt.xml.QDomNodeList#item(int) item()}. <p>If <tt>index</tt> is negative or if <tt>index</tt> &gt;= {@link com.trolltech.qt.xml.QDomNodeList#length() length()} then a null node is returned (i.e. a node for which {@link com.trolltech.qt.xml.QDomNode#isNull() QDomNode::isNull()} returns true).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode at(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_at_int(long __this__nativeId, int index);

/**
This function is provided for Qt API consistency. It is equivalent to {@link com.trolltech.qt.xml.QDomNodeList#length() length()}.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns true if the list contains no items; otherwise returns false. This function is provided for Qt API consistency.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns the node at position <tt>index</tt>. <p>If <tt>index</tt> is negative or if <tt>index</tt> &gt;= {@link com.trolltech.qt.xml.QDomNodeList#length() length()} then a null node is returned (i.e. a node for which {@link com.trolltech.qt.xml.QDomNode#isNull() QDomNode::isNull()} returns true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomNodeList#length() length()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xml.QDomNode item(int index)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.xml.QDomNode __qt_item_int(long __this__nativeId, int index);

/**
Returns the number of nodes in the list.
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xml.QDomNodeList arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDomNodeList(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDomNodeList(long __this__nativeId, long arg__1);

/**
This function is provided for Qt API consistency. It is equivalent to {@link com.trolltech.qt.xml.QDomNodeList#length() length()}.
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
@exclude
*/

    public static native QDomNodeList fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomNodeList(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomNodeList array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xml.QDomNodeList)
        return operator_equal((com.trolltech.qt.xml.QDomNodeList) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomNodeList clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomNodeList __qt_clone(long __this_nativeId);
}
