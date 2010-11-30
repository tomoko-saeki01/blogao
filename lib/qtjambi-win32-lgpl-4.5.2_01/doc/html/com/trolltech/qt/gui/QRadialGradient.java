package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QRadialGradient class is used in combination with {@link com.trolltech.qt.gui.QBrush QBrush} to specify a radial gradient brush. Radial gradients interpolate colors between a focal point and end points on a circle surrounding it. Outside the end points the gradient is either padded, reflected or repeated depending on the currently set {@link com.trolltech.qt.gui.QGradient.Spread spread } method: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qradialgradient-pad.png"></center><br></td><td>  <br><center><img src="../images/qradialgradient-reflect.png"></center><br></td><td>  <br><center><img src="../images/qradialgradient-repeat.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGradient.Spread PadSpread } (default)</td><td> {@link com.trolltech.qt.gui.QGradient.Spread ReflectSpread }</td><td> {@link com.trolltech.qt.gui.QGradient.Spread RepeatSpread }</td></tr></table> The colors in a gradient is defined using stop points of the QGradientStop type, i.e. a position and a color. Use the {@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()} or the {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()} function to define the stop points. It is the gradient's complete set of stop points that describes how the gradient area should be filled. If no stop points have been specified, a gradient of black at 0 to white at 1 is used. <p>In addition to the functions inherited from {@link com.trolltech.qt.gui.QGradient QGradient}, the QRadialGradient class provides the {@link com.trolltech.qt.gui.QRadialGradient#center() center()}, {@link com.trolltech.qt.gui.QRadialGradient#focalPoint() focalPoint()} and {@link com.trolltech.qt.gui.QRadialGradient#radius() radius()} functions returning the gradient's center, focal point and radius respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient QLinearGradient}, {@link com.trolltech.qt.gui.QConicalGradient QConicalGradient}, and {@link <a href="../demos-gradients.html">The Gradients Demo</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRadialGradient extends com.trolltech.qt.gui.QGradient
    implements java.lang.Cloneable
{

/**
Constructs a radial gradient with the center and focal point at (0, 0) with a radius of 1.
*/

    public QRadialGradient(){
        super((QPrivateConstructor)null);
        __qt_QRadialGradient();
    }

    native void __qt_QRadialGradient();

/**
Constructs a radial gradient with the given <tt>center</tt>, <tt>radius</tt> and the focal point in the circle center. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QRadialGradient(com.trolltech.qt.core.QPointF center, double radius){
        super((QPrivateConstructor)null);
        __qt_QRadialGradient_QPointF_double(center == null ? 0 : center.nativeId(), radius);
    }

    native void __qt_QRadialGradient_QPointF_double(long center, double radius);

/**
Constructs a radial gradient with the given <tt>center</tt>, <tt>radius</tt> and <tt>focalPoint</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QRadialGradient(com.trolltech.qt.core.QPointF center, double radius, com.trolltech.qt.core.QPointF focalPoint){
        super((QPrivateConstructor)null);
        __qt_QRadialGradient_QPointF_double_QPointF(center == null ? 0 : center.nativeId(), radius, focalPoint == null ? 0 : focalPoint.nativeId());
    }

    native void __qt_QRadialGradient_QPointF_double_QPointF(long center, double radius, long focalPoint);

/**
Constructs a radial gradient with the center at (<tt>cx</tt>, <tt>cy</tt>) and the specified <tt>radius</tt>. The focal point lies at the center of the circle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QRadialGradient(double cx, double cy, double radius){
        super((QPrivateConstructor)null);
        __qt_QRadialGradient_double_double_double(cx, cy, radius);
    }

    native void __qt_QRadialGradient_double_double_double(double cx, double cy, double radius);

/**
Constructs a radial gradient with the given center (<tt>cx</tt>, <tt>cy</tt>), <tt>radius</tt> and focal point (<tt>fx</tt>, <tt>fy</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QRadialGradient(double cx, double cy, double radius, double fx, double fy){
        super((QPrivateConstructor)null);
        __qt_QRadialGradient_double_double_double_double_double(cx, cy, radius, fx, fy);
    }

    native void __qt_QRadialGradient_double_double_double_double_double(double cx, double cy, double radius, double fx, double fy);

/**
Returns the center of this radial gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#setCenter(com.trolltech.qt.core.QPointF) setCenter()}, and {@link com.trolltech.qt.gui.QGradient#stops() QGradient::stops()}. <br></DD></DT>
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
Returns the focal point of this radial gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#setFocalPoint(com.trolltech.qt.core.QPointF) setFocalPoint()}, and {@link com.trolltech.qt.gui.QGradient#stops() QGradient::stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF focalPoint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focalPoint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_focalPoint(long __this__nativeId);

/**
Returns the radius of this radial gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#setRadius(double) setRadius()}, and {@link com.trolltech.qt.gui.QGradient#stops() QGradient::stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double radius()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_radius(nativeId());
    }
    @QtBlockedSlot
    native double __qt_radius(long __this__nativeId);

/**
Sets the center of this radial gradient in logical coordinates to <tt>center</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#center() center()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Sets the center of this radial gradient in logical coordinates to (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#center() center()}. <br></DD></DT>
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
Sets the focal point of this radial gradient in logical coordinates to <tt>focalPoint</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#focalPoint() focalPoint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocalPoint(com.trolltech.qt.core.QPointF focalPoint)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocalPoint_QPointF(nativeId(), focalPoint == null ? 0 : focalPoint.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFocalPoint_QPointF(long __this__nativeId, long focalPoint);

/**
This is an overloaded member function, provided for convenience. <p>Sets the focal point of this radial gradient in logical coordinates to (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#focalPoint() focalPoint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocalPoint(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocalPoint_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setFocalPoint_double_double(long __this__nativeId, double x, double y);

/**
Sets the radius of this radial gradient in logical coordinates to <tt>radius</tt> <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient#radius() radius()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRadius(double radius)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRadius_double(nativeId(), radius);
    }
    @QtBlockedSlot
    native void __qt_setRadius_double(long __this__nativeId, double radius);

/**
@exclude
*/

    public static native QRadialGradient fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRadialGradient(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QRadialGradient array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QRadialGradient clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QRadialGradient __qt_clone(long __this_nativeId);
}
