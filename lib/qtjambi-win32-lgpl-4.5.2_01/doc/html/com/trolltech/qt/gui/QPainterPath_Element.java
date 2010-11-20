package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QPainterPath_Element extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**

*/

    public QPainterPath_Element(){
        super((QPrivateConstructor)null);
        __qt_QPainterPath_Element();
    }

    native void __qt_QPainterPath_Element();

/**
Returns true if the element is a curve, otherwise returns false. <p><DT><b>See also:</b><br><DD>type, and {@link com.trolltech.qt.gui.QPainterPath.ElementType QPainterPath::CurveToElement }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCurveTo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCurveTo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCurveTo(long __this__nativeId);

/**
Returns true if the element is a line, otherwise returns false. <p><DT><b>See also:</b><br><DD>type, and {@link com.trolltech.qt.gui.QPainterPath.ElementType QPainterPath::LineToElement }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isLineTo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isLineTo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isLineTo(long __this__nativeId);

/**
Returns true if the element is moving the current position, otherwise returns false. <p><DT><b>See also:</b><br><DD>type, and {@link com.trolltech.qt.gui.QPainterPath.ElementType QPainterPath::MoveToElement }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isMoveTo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMoveTo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMoveTo(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QPointF operator_cast_QPointF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_cast_QPointF(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_operator_cast_QPointF(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QPainterPath_Element e)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPainterPath_Element(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPainterPath_Element(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final double x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final double y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath.ElementType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPainterPath.ElementType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QPainterPath_Element fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPainterPath_Element(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPainterPath_Element array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QPainterPath_Element)
        return operator_equal((com.trolltech.qt.gui.QPainterPath_Element) other);
        return false;
    }


/**
Converts this painter path to a point.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF toPoint() {
        return operator_cast_QPointF();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QPainterPath_Element clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPainterPath_Element __qt_clone(long __this_nativeId);
}
