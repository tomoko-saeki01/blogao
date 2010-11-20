package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QSimpleXmlNodeModel class is an implementation of {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} sufficient for many common cases. Subclassing {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} can be a significant task, because it requires implementing several, complex member functions. QSimpleXmlNodeModel provides default implementations of these member functions that are suitable for a wide range of node models. <p>Subclasses of QSimpleXmlNodeModel must be thread-safe.
*/
@QtJambiGeneratedClass
public abstract class QSimpleXmlNodeModel extends com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel
    implements java.lang.Cloneable
{

    private static class ConcreteWrapper extends com.trolltech.qt.xmlpatterns.QSimpleXmlNodeModel {
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
        protected com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex nextFromSimpleAxis(com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel.SimpleAxis axis, com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex origin) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_nextFromSimpleAxis_SimpleAxis_QXmlNodeModelIndex(nativeId(), axis.value(), origin == null ? 0 : origin.nativeId());
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
        public java.lang.Object typedValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex n) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_typedValue_QXmlNodeModelIndex(nativeId(), n == null ? 0 : n.nativeId());
        }
    }


/**
Constructs a QSimpleXmlNodeModel for use with with the specified <tt>namePool</tt>.
*/

    public QSimpleXmlNodeModel(com.trolltech.qt.xmlpatterns.QXmlNamePool namePool){
        super((QPrivateConstructor)null);
        __qt_QSimpleXmlNodeModel_QXmlNamePool(namePool == null ? 0 : namePool.nativeId());
    }

    native void __qt_QSimpleXmlNodeModel_QXmlNamePool(long namePool);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer namePool_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namePool_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_namePool_private(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QUrl baseUri(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex node)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_baseUri_QXmlNodeModelIndex(nativeId(), node == null ? 0 : node.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_baseUri_QXmlNodeModelIndex(long __this__nativeId, long node);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex elementById(com.trolltech.qt.xmlpatterns.QXmlName id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elementById_QXmlName(nativeId(), id == null ? 0 : id.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_elementById_QXmlName(long __this__nativeId, long id);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.xmlpatterns.QXmlName> namespaceBindings(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namespaceBindings_QXmlNodeModelIndex(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlName> __qt_namespaceBindings_QXmlNodeModelIndex(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> nodesByIdref(com.trolltech.qt.xmlpatterns.QXmlName idref)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nodesByIdref_QXmlName(nativeId(), idref == null ? 0 : idref.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> __qt_nodesByIdref_QXmlName(long __this__nativeId, long idref);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String stringValue(com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex node)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stringValue_QXmlNodeModelIndex(nativeId(), node == null ? 0 : node.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_stringValue_QXmlNodeModelIndex(long __this__nativeId, long node);

    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex> __qt_attributes_QXmlNodeModelIndex(long __this__nativeId, long element);

    @QtBlockedSlot
    native int __qt_compareOrder_QXmlNodeModelIndex_QXmlNodeModelIndex(long __this__nativeId, long ni1, long ni2);

    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_documentUri_QXmlNodeModelIndex(long __this__nativeId, long ni);

    @QtBlockedSlot
    native int __qt_kind_QXmlNodeModelIndex(long __this__nativeId, long ni);

    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlName __qt_name_QXmlNodeModelIndex(long __this__nativeId, long ni);

    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_nextFromSimpleAxis_SimpleAxis_QXmlNodeModelIndex(long __this__nativeId, int axis, long origin);

    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex __qt_root_QXmlNodeModelIndex(long __this__nativeId, long n);

    @QtBlockedSlot
    native java.lang.Object __qt_typedValue_QXmlNodeModelIndex(long __this__nativeId, long n);

/**
@exclude
*/

    public static native QSimpleXmlNodeModel fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSimpleXmlNodeModel(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSimpleXmlNodeModel array[]);

    /**
     * Returns the name pool that is associated with this model. The implementation of <code>name()</code>
     * would use this to create names.
     */
    public final QXmlNamePool namePool() {
        return QXmlNamePool.fromNativePointer(namePool_private());
    }


    @Override
    public QSimpleXmlNodeModel clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSimpleXmlNodeModel __qt_clone(long __this_nativeId);
}
