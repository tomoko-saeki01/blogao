package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QTextBlock_iterator extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Creates a new QTextBlockIterator.
*/

    public QTextBlock_iterator(){
        super((QPrivateConstructor)null);
        __qt_QTextBlock_iterator();
    }

    native void __qt_QTextBlock_iterator();

/**
Constructs a new QTextBlock_iterator by copying <tt>o</tt>.
*/

    public QTextBlock_iterator(com.trolltech.qt.gui.QTextBlock_iterator o){
        super((QPrivateConstructor)null);
        __qt_QTextBlock_iterator_QTextBlock_iterator(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextBlock_iterator_QTextBlock_iterator(long o);

/**
Returns true if the iterator is at the end of the text block.
*/

    @QtBlockedSlot
    public final boolean atEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
Returns the text fragment the iterator currently points to.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFragment fragment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fragment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFragment __qt_fragment(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_increment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_increment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_increment(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_decrement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_decrement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_decrement(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextBlock_iterator o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextBlock_iterator(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextBlock_iterator(long __this__nativeId, long o);

/**
@exclude
*/

    public static native QTextBlock_iterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlock_iterator(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextBlock_iterator array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextBlock_iterator)
        return operator_equal((com.trolltech.qt.gui.QTextBlock_iterator) other);
        return false;
    }


/**
Advances the iterator to the next item in the hash.
*/

    @QtBlockedSlot
    public final void next() {
        operator_increment();
    }

/**
Makes the preceding item the current item.
*/

    @QtBlockedSlot
    public final void previous() {
        operator_decrement();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextBlock_iterator clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextBlock_iterator __qt_clone(long __this_nativeId);
}
