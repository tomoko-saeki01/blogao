package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QTreeModel extends com.trolltech.qt.core.QAbstractItemModel
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QTreeModel {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.Object child(java.lang.Object parent, int index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_child_java_lang_Object_int(nativeId(), parent, index);
        }

        @Override
        @QtBlockedSlot
        public int childCount(java.lang.Object parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childCount_java_lang_Object(nativeId(), parent);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String text(java.lang.Object value) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_text_java_lang_Object(nativeId(), value);
        }
    }



/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTreeModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTreeModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTreeModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTreeModel_QObject(long parent);

/**
Inserts <tt>last</tt> - <tt>first</tt> + 1 nodes into the given <tt>parent</tt>, before the node specified by <tt>first</tt>. Note that this function must be called when nodes have been inserted into the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#beginInsertRows(com.trolltech.qt.core.QModelIndex, int, int) beginInsertRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void childrenInserted(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childrenInserted_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_childrenInserted_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Removes the nodes from <tt>first</tt> to <tt>last</tt> from the given <tt>parent</tt>, including the node specified by <tt>last</tt>. Note that this function must be called when nodes have been removed from the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeModel#childrenRemoved(com.trolltech.qt.core.QModelIndex, int, int) beginDeleteRows()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void childrenRemoved(com.trolltech.qt.core.QModelIndex parent, int first, int last)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childrenRemoved_QModelIndex_int_int(nativeId(), parent, first, last);
    }
    @QtBlockedSlot
    native void __qt_childrenRemoved_QModelIndex_int_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent, int first, int last);

/**
Translates the given index to a value node and returns the node.
*/

    @QtBlockedSlot
    public final java.lang.Object indexToValue(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexToValue_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_indexToValue_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Releases datastructures that are no longer needed, from the memory pool. <p>Internally, the QTreeModel class caches the datastructures of nodes that have been expanded. Call the {@link com.trolltech.qt.gui.QTreeModel#releaseChildren(com.trolltech.qt.core.QModelIndex) releaseChildren()} function to release parts of this memory pool when they are no longer needed, for example when the view collapses a subtree. <p>Note that if the model is shared between multiple views, calling the model's {@link com.trolltech.qt.gui.QTreeModel#releaseChildren(com.trolltech.qt.core.QModelIndex) releaseChildren()} function affects all.
*/

    public final void releaseChildren(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseChildren_QModelIndex(nativeId(), index);
    }
    native void __qt_releaseChildren_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the model index for <tt>object</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex valueToIndex(java.lang.Object object)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueToIndex_java_lang_Object(nativeId(), object);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_valueToIndex_java_lang_Object(long __this__nativeId, java.lang.Object object);

/**
Returns the child specified by <tt>index</tt>, of the given <tt>node</tt>.
*/

    @QtBlockedSlot
    public abstract java.lang.Object child(java.lang.Object parent, int index);
    @QtBlockedSlot
    native java.lang.Object __qt_child_java_lang_Object_int(long __this__nativeId, java.lang.Object parent, int index);

/**
Returns the given <tt>node</tt>'s number of children, or 0 if the <tt>node</tt> is a leaf node.
*/

    @QtBlockedSlot
    public abstract int childCount(java.lang.Object parent);
    @QtBlockedSlot
    native int __qt_childCount_java_lang_Object(long __this__nativeId, java.lang.Object parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int columnCount(com.trolltech.qt.core.QModelIndex arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount_QModelIndex(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex index, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), index, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

/**
Using the standard {@link com.trolltech.qt.gui.QTreeView QTreeView} class to view the content's of the model, the text is rendered using {@link com.trolltech.qt.gui.QTreeView QTreeView}'s fonts. Reimplement this function to alter the view's rendering behavior. <p>The default implementation is calling {@link com.trolltech.qt.gui.QTreeModel#text(java.lang.Object) text()} and {@link com.trolltech.qt.gui.QTreeModel#icon(java.lang.Object) icon()} function for the given <tt>value</tt> and <tt>role</tt>.
*/

    @QtBlockedSlot
    public java.lang.Object data(java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_java_lang_Object_int(nativeId(), value, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_java_lang_Object_int(long __this__nativeId, java.lang.Object value, int role);

/**
Reimplement this function to get graphical nodes. The default implementation returns an empty icon.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIcon icon(java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon_java_lang_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon_java_lang_Object(long __this__nativeId, java.lang.Object value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex index(int row, int arg__2, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_int_int_QModelIndex(nativeId(), row, arg__2, parent);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int arg__2, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int rowCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
Returns a string representation of the given <tt>value</tt>.
*/

    @QtBlockedSlot
    public abstract java.lang.String text(java.lang.Object value);
    @QtBlockedSlot
    native java.lang.String __qt_text_java_lang_Object(long __this__nativeId, java.lang.Object value);

/**
@exclude
*/

    public static native QTreeModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTreeModel(QPrivateConstructor p) { super(p); } 
}
