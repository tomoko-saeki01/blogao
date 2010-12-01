package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QConicalGradient class is used in combination with {@link com.trolltech.qt.gui.QBrush QBrush} to specify a conical gradient brush. Conical gradients interpolate interpolate colors counter-clockwise around a center point. <br><center><img src="../images/qconicalgradient.png"></center><br> The colors in a gradient is defined using stop points of the QGradientStop type, i.e. a position and a color. Use the {@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()} or the {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()} function to define the stop points. It is the gradient's complete set of stop points that describes how the gradient area should be filled. If no stop points have been specified, a gradient of black at 0 to white at 1 is used. <p>In addition to the functions inherited from {@link com.trolltech.qt.gui.QGradient QGradient}, the QConicalGradient class provides the {@link com.trolltech.qt.gui.QConicalGradient#angle() angle()} and {@link com.trolltech.qt.gui.QConicalGradient#center() center()} functions returning the start angle and center of the gradient. <p>Note that the {@link com.trolltech.qt.gui.QGradient#setSpread(com.trolltech.qt.gui.QGradient.Spread) setSpread()} function has no effect for conical gradients. The reason is that the conical gradient is closed by definition, i.e. the conical gradient fills the entire circle from 0 - 360 degrees, while the boundary of a radial or a linear gradient can be specified through its radius or final stop points, respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient QLinearGradient}, {@link com.trolltech.qt.gui.QRadialGradient QRadialGradient}, and {@link <a href="../demos-gradients.html">The Gradients Demo</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QConicalGradient extends com.trolltech.qt.gui.QGradient
    implements java.lang.Cloneable
{

/**
Constructs a conical with center at (0, 0) starting the interpolation at angle 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, {@link com.trolltech.qt.gui.QConicalGradient#setCenter(com.trolltech.qt.core.QPointF) setCenter()}, and {@link com.trolltech.qt.gui.QConicalGradient#setAngle(double) setAngle()}. <br></DD></DT>
*/

    public QConicalGradient(){
        super((QPrivateConstructor)null);
        __qt_QConicalGradient();
    }

    native void __qt_QConicalGradient();

/**
Constructs a conical gradient with the given <tt>center</tt>, starting the interpolation at the given <tt>angle</tt>. The <tt>angle</tt> must be specified in degrees between 0 and 360. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QConicalGradient(com.trolltech.qt.core.QPointF center, double startAngle){
        super((QPrivateConstructor)null);
        __qt_QConicalGradient_QPointF_double(center == null ? 0 : center.nativeId(), startAngle);
    }

    native void __qt_QConicalGradient_QPointF_double(long center, double startAngle);

/**
Constructs a conical gradient with the given center (<tt>cx</tt>, <tt>cy</tt>), starting the interpolation at the given <tt>angle</tt>. The angle must be specified in degrees between 0 and 360. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QConicalGradient(double cx, double cy, double startAngle){
        super((QPrivateConstructor)null);
        __qt_QConicalGradient_double_double_double(cx, cy, startAngle);
    }

    native void __qt_QConicalGradient_double_double_double(double cx, double cy, double startAngle);

/**
Returns the start angle of the conical gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QConicalGradient#setAngle(double) setAngle()}, and {@link com.trolltech.qt.gui.QGradient#stops() stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double angle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_angle(nativeId());
    }
    @QtBlockedSlot
    native double __qt_angle(long __this__nativeId);

/**
Returns the center of the conical gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QConicalGradient#setCenter(com.trolltech.qt.core.QPointF) setCenter()}, and {@link com.trolltech.qt.gui.QGradient#stops() stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF center()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_center(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_center(long __this__nativeId);

/**
Sets <tt>angle</tt> to be the start angle for this conical gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QConicalGradient#angle() angle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAngle(double angle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAngle_double(nativeId(), angle);
    }
    @QtBlockedSlot
    native void __qt_setAngle_double(long __this__nativeId, double angle);

/**
Sets the center of this conical gradient in logical coordinates to <tt>center</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QConicalGradient#center() center()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCenter(com.trolltech.qt.core.QPointF center)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCenter_QPointF(nativeId(), center == null ? 0 : center.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCenter_QPointF(long __this__nativeId, long center);

/**
This is an overloaded member function, provided for convenience. <p>Sets the center of this conical gradient in logical coordinates to (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QConicalGradient#center() center()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCenter(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCenter_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setCenter_double_double(long __this__nativeId, double x, double y);

/**
@exclude
*/

    public static native QConicalGradient fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QConicalGradient(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QConicalGradient array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QConicalGradient clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QConicalGradient __qt_clone(long __this_nativeId);
}
