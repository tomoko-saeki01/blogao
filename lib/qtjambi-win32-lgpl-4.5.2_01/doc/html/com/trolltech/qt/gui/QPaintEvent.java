package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPaintEvent class contains event parameters for paint events. Paint events are sent to widgets that need to update themselves, for instance when part of a widget is exposed because a covering widget was moved. <p>The event contains a {@link com.trolltech.qt.gui.QPaintEvent#region() region()} that needs to be updated, and a {@link com.trolltech.qt.gui.QPaintEvent#rect() rect()} that is the bounding rectangle of that region. Both are provided because many widgets can't make much use of {@link com.trolltech.qt.gui.QPaintEvent#region() region()}, and {@link com.trolltech.qt.gui.QPaintEvent#rect() rect()} can be much faster than {@link com.trolltech.qt.gui.QPaintEvent#region() region()}.boundingRect(). Painting is clipped to {@link com.trolltech.qt.gui.QPaintEvent#region() region()} during the processing of a paint event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QWidget#update() QWidget::update()}, {@link com.trolltech.qt.gui.QWidget#repaint() QWidget::repaint()}, and {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPaintEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a paint event object with the rectangle that needs to be updated. The region is specified by <tt>paintRect</tt>.
*/

    public QPaintEvent(com.trolltech.qt.core.QRect paintRect){
        super((QPrivateConstructor)null);
        __qt_QPaintEvent_QRect(paintRect == null ? 0 : paintRect.nativeId());
    }

    native void __qt_QPaintEvent_QRect(long paintRect);

/**
Constructs a paint event object with the region that needs to be updated. The region is specified by <tt>paintRegion</tt>.
*/

    public QPaintEvent(com.trolltech.qt.gui.QRegion paintRegion){
        super((QPrivateConstructor)null);
        __qt_QPaintEvent_QRegion(paintRegion == null ? 0 : paintRegion.nativeId());
    }

    native void __qt_QPaintEvent_QRegion(long paintRegion);

/**
Returns the rectangle that needs to be updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEvent#region() region()}, and {@link com.trolltech.qt.gui.QPainter#setClipRect(com.trolltech.qt.core.QRect) QPainter::setClipRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect(long __this__nativeId);

/**
Returns the region that needs to be updated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEvent#rect() rect()}, and {@link com.trolltech.qt.gui.QPainter#setClipRegion(com.trolltech.qt.gui.QRegion) QPainter::setClipRegion()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion region()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_region(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_region(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setM_rect(com.trolltech.qt.core.QRect m_rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setM_rect_QRect(nativeId(), m_rect == null ? 0 : m_rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setM_rect_QRect(long __this__nativeId, long m_rect);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect m_rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_m_rect(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setM_erased(boolean m_erased)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setM_erased_boolean(nativeId(), m_erased);
    }
    @QtBlockedSlot
    native void __qt_setM_erased_boolean(long __this__nativeId, boolean m_erased);

/**

*/

    @QtBlockedSlot
    protected final boolean m_erased()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m_erased(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_m_erased(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setM_region(com.trolltech.qt.gui.QRegion m_region)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setM_region_QRegion(nativeId(), m_region == null ? 0 : m_region.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setM_region_QRegion(long __this__nativeId, long m_region);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QRegion m_region()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_m_region(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_m_region(long __this__nativeId);

/**
@exclude
*/

    public static native QPaintEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPaintEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QPaintEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
