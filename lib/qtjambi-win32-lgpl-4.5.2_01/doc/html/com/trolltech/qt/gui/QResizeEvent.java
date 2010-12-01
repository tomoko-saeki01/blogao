package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QResizeEvent class contains event parameters for resize events. Resize events are sent to widgets that have been resized. <p>The event handler {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) QWidget::resizeEvent()} receives resize events. <p><DT><b>See also:</b><br><DD>{@link QWidget#resize(com.trolltech.qt.core.QSize) QWidget::resize()}, and {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QResizeEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a resize event with the new and old widget sizes, <tt>size</tt> and <tt>oldSize</tt> respectively.
*/

    public QResizeEvent(com.trolltech.qt.core.QSize size, com.trolltech.qt.core.QSize oldSize){
        super((QPrivateConstructor)null);
        __qt_QResizeEvent_QSize_QSize(size == null ? 0 : size.nativeId(), oldSize == null ? 0 : oldSize.nativeId());
    }

    native void __qt_QResizeEvent_QSize_QSize(long size, long oldSize);

/**
Returns the old size of the widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize oldSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_oldSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_oldSize(long __this__nativeId);

/**
Returns the new size of the widget. This is the same as {@link QWidget#size() QWidget::size()}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setOlds(com.trolltech.qt.core.QSize olds)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOlds_QSize(nativeId(), olds == null ? 0 : olds.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOlds_QSize(long __this__nativeId, long olds);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QSize olds()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_olds(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_olds(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setS(com.trolltech.qt.core.QSize s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setS_QSize(nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setS_QSize(long __this__nativeId, long s);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QSize s()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_s(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_s(long __this__nativeId);

/**
@exclude
*/

    public static native QResizeEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QResizeEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QResizeEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
