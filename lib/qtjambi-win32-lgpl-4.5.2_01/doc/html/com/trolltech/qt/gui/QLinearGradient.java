package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLinearGradient class is used in combination with {@link com.trolltech.qt.gui.QBrush QBrush} to specify a linear gradient brush. Linear gradients interpolate colors between start and end points. Outside these points the gradient is either padded, reflected or repeated depending on the currently set {@link com.trolltech.qt.gui.QGradient.Spread spread } method: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qlineargradient-pad.png"></center><br></td><td>  <br><center><img src="../images/qlineargradient-reflect.png"></center><br></td><td>  <br><center><img src="../images/qlineargradient-repeat.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGradient.Spread PadSpread } (default)</td><td> {@link com.trolltech.qt.gui.QGradient.Spread ReflectSpread }</td><td> {@link com.trolltech.qt.gui.QGradient.Spread RepeatSpread }</td></tr></table> The colors in a gradient is defined using stop points of the QGradientStop type, i.e. a position and a color. Use the {@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()} or the {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()} function to define the stop points. It is the gradient's complete set of stop points that describes how the gradient area should be filled. If no stop points have been specified, a gradient of black at 0 to white at 1 is used. <p>In addition to the functions inherited from {@link com.trolltech.qt.gui.QGradient QGradient}, the QLinearGradient class provides the {@link com.trolltech.qt.gui.QLinearGradient#finalStop() finalStop()} function which returns the final stop point of the gradient, and the {@link com.trolltech.qt.gui.QLinearGradient#start() start()} function returning the start point of the gradient. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QRadialGradient QRadialGradient}, {@link com.trolltech.qt.gui.QConicalGradient QConicalGradient}, and {@link <a href="../demos-gradients.html">The Gradients Demo</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLinearGradient extends com.trolltech.qt.gui.QGradient
    implements java.lang.Cloneable
{

/**
Constructs a default linear gradient with interpolation area between (0, 0) and (1, 1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, {@link com.trolltech.qt.gui.QLinearGradient#setStart(com.trolltech.qt.core.QPointF) setStart()}, and {@link com.trolltech.qt.gui.QLinearGradient#setFinalStop(com.trolltech.qt.core.QPointF) setFinalStop()}. <br></DD></DT>
*/

    public QLinearGradient(){
        super((QPrivateConstructor)null);
        __qt_QLinearGradient();
    }

    native void __qt_QLinearGradient();

/**
Constructs a linear gradient with interpolation area between the given <tt>start</tt> point and <tt>finalStop</tt>. <p><b>Note:</b> The expected parameter values are in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QLinearGradient(com.trolltech.qt.core.QPointF start, com.trolltech.qt.core.QPointF finalStop){
        super((QPrivateConstructor)null);
        __qt_QLinearGradient_QPointF_QPointF(start == null ? 0 : start.nativeId(), finalStop == null ? 0 : finalStop.nativeId());
    }

    native void __qt_QLinearGradient_QPointF_QPointF(long start, long finalStop);

/**
Constructs a linear gradient with interpolation area between (<tt>x1</tt>, <tt>y1</tt>) and (<tt>x2</tt>, <tt>y2</tt>). <p><b>Note:</b> The expected parameter values are in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) QGradient::setColorAt()}, and {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) QGradient::setStops()}. <br></DD></DT>
*/

    public QLinearGradient(double xStart, double yStart, double xFinalStop, double yFinalStop){
        super((QPrivateConstructor)null);
        __qt_QLinearGradient_double_double_double_double(xStart, yStart, xFinalStop, yFinalStop);
    }

    native void __qt_QLinearGradient_double_double_double_double(double xStart, double yStart, double xFinalStop, double yFinalStop);

/**
Returns the final stop point of this linear gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#setFinalStop(com.trolltech.qt.core.QPointF) setFinalStop()}, and {@link com.trolltech.qt.gui.QGradient#stops() QGradient::stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF finalStop()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_finalStop(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_finalStop(long __this__nativeId);

/**
Sets the final stop point of this linear gradient in logical coordinates to <tt>stop</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#finalStop() finalStop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFinalStop(com.trolltech.qt.core.QPointF stop)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFinalStop_QPointF(nativeId(), stop == null ? 0 : stop.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFinalStop_QPointF(long __this__nativeId, long stop);

/**
This is an overloaded member function, provided for convenience. <p>Sets the final stop point of this linear gradient in logical coordinates to <tt>x</tt>, <tt>y</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#start() start()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFinalStop(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFinalStop_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setFinalStop_double_double(long __this__nativeId, double x, double y);

/**
Sets the start point of this linear gradient in logical coordinates to <tt>start</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#start() start()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStart(com.trolltech.qt.core.QPointF start)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStart_QPointF(nativeId(), start == null ? 0 : start.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setStart_QPointF(long __this__nativeId, long start);

/**
This is an overloaded member function, provided for convenience. <p>Sets the start point of this linear gradient in logical coordinates to <tt>x</tt>, <tt>y</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#start() start()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStart(double x, double y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStart_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setStart_double_double(long __this__nativeId, double x, double y);

/**
Returns the start point of this linear gradient in logical coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLinearGradient#setStart(com.trolltech.qt.core.QPointF) setStart()}, and {@link com.trolltech.qt.gui.QGradient#stops() QGradient::stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF start()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_start(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_start(long __this__nativeId);

/**
@exclude
*/

    public static native QLinearGradient fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLinearGradient(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QLinearGradient array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QLinearGradient clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QLinearGradient __qt_clone(long __this_nativeId);
}
