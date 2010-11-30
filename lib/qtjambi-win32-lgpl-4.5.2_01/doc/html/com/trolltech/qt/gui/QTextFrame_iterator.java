package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QTextFrame_iterator extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**

*/

    public QTextFrame_iterator(){
        super((QPrivateConstructor)null);
        __qt_QTextFrame_iterator();
    }

    native void __qt_QTextFrame_iterator();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextFrame_iterator(com.trolltech.qt.gui.QTextFrame_iterator o){
        super((QPrivateConstructor)null);
        __qt_QTextFrame_iterator_QTextFrame_iterator(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextFrame_iterator_QTextFrame_iterator(long o);

/**
Returns true if the current item is the last item in the text frame.
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
Returns the current block the iterator points to. If the iterator points to a child frame, the returned block is invalid. <p><DT><b>See also:</b><br><DD>currentFrame(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock currentBlock()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentBlock(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_currentBlock(long __this__nativeId);

/**
Returns the current frame pointed to by the iterator, or 0 if the iterator currently points to a block. <p><DT><b>See also:</b><br><DD>currentBlock(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame currentFrame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_currentFrame(long __this__nativeId);

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
    private final boolean operator_equal(com.trolltech.qt.gui.QTextFrame_iterator o)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextFrame_iterator(nativeId(), o == null ? 0 : o.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextFrame_iterator(long __this__nativeId, long o);

/**
Returns the parent frame of the current frame. <p><DT><b>See also:</b><br><DD>currentFrame(), and {@link com.trolltech.qt.gui.QTextFrame#parentFrame() QTextFrame::parentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame parentFrame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_parentFrame(long __this__nativeId);

/**
@exclude
*/

    public static native QTextFrame_iterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFrame_iterator(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextFrame_iterator array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextFrame_iterator)
        return operator_equal((com.trolltech.qt.gui.QTextFrame_iterator) other);
        return false;
    }


/**
Returns the next QTextFrame in this iterator.
*/

    @QtBlockedSlot
    public final void next() {
        operator_increment();
    }

/**
Returns the previous QTextFrame in this iterator.
*/

    @QtBlockedSlot
    public final void previous() {
        operator_decrement();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextFrame_iterator clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextFrame_iterator __qt_clone(long __this_nativeId);
}
