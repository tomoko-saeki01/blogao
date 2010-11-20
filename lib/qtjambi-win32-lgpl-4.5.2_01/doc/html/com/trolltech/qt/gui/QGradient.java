package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGradient class is used in combination with {@link com.trolltech.qt.gui.QBrush QBrush} to specify gradient fills. Qt currently supports three types of gradient fills: <ul><li> Linear gradients interpolate colors between start and end points.</li><li> Radial gradients interpolate colors between a focal point and end points on a circle surrounding it.</li><li> Conical gradients interpolate colors around a center point.</li></ul> A gradient's type can be retrieved using the {@link com.trolltech.qt.gui.QGradient#type() type()} function. Each of the types is represented by a subclass of QGradient: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qgradient-linear.png"></center><br></td><td>  <br><center><img src="../images/qgradient-radial.png"></center><br></td><td>  <br><center><img src="../images/qgradient-conical.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.gui.QLinearGradient QLinearGradient}</center></th><th><center> {@link com.trolltech.qt.gui.QRadialGradient QRadialGradient}</center></th><th><center> {@link com.trolltech.qt.gui.QConicalGradient QConicalGradient}</center></th></tr></thead></table> The colors in a gradient is defined using stop points of the QGradientStop type, i.e. a position and a color. Use the {@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) setColorAt()} function to define a single stop point. Alternatively, use the {@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) setStops()} function to define several stop points in one go. Note that the latter function replaces the current set of stop points. <p>It is the gradient's complete set of stop points (accessible through the {@link com.trolltech.qt.gui.QGradient#stops() stops()} function) that describes how the gradient area should be filled. If no stop points have been specified, a gradient of black at 0 to white at 1 is used. <p>A diagonal linear gradient from black at (100, 100) to white at (200, 200) could be specified like this: <pre class="snippet">
        QLinearGradient linearGrad = new QLinearGradient(new QPointF(100, 100),
                                                         new QPointF(200, 200));
        linearGrad.setColorAt(0, new QColor(Qt.GlobalColor.black));
        linearGrad.setColorAt(1, new QColor(Qt.GlobalColor.white));
    </pre> A gradient can have an arbitrary number of stop points. The following would create a radial gradient starting with red in the center, blue and then green on the edges: <pre class="snippet">
        QRadialGradient radialGrad =
            new QRadialGradient(new QPointF(100, 100), 100);
        radialGrad.setColorAt(0, new QColor(Qt.GlobalColor.red));
        radialGrad.setColorAt(0.5, new QColor(Qt.GlobalColor.blue));
        radialGrad.setColorAt(1, new QColor(Qt.GlobalColor.green));
    </pre> It is possible to repeat or reflect the gradient outside its area by specifiying the {@link com.trolltech.qt.gui.QGradient.Spread spread method } using the {@link com.trolltech.qt.gui.QGradient#setSpread(com.trolltech.qt.gui.QGradient.Spread) setSpread()} function. The default is to pad the outside area with the color at the closest stop point. The currently set {@link com.trolltech.qt.gui.QGradient.Spread spread method } can be retrieved using the {@link com.trolltech.qt.gui.QGradient#spread() spread()} function. The {@link com.trolltech.qt.gui.QGradient.Spread QGradient::Spread } enum defines three different methods: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qradialgradient-pad.png"></center><br></td><td>  <br><center><img src="../images/qradialgradient-repeat.png"></center><br></td><td>  <br><center><img src="../images/qradialgradient-reflect.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QGradient.Spread PadSpread }</td><td> {@link com.trolltech.qt.gui.QGradient.Spread RepeatSpread }</td><td> {@link com.trolltech.qt.gui.QGradient.Spread ReflectSpread }</td></tr></table> Note that the {@link com.trolltech.qt.gui.QGradient#setSpread(com.trolltech.qt.gui.QGradient.Spread) setSpread()} function only has effect for linear and radial gradients. The reason is that the conical gradient is closed by definition, i.e. the conical gradient fills the entire circle from 0 - 360 degrees, while the boundary of a radial or a linear gradient can be specified through its radius or final stop points, respectively. <p>The gradient coordinates can be specified in logical coordinates, relative to device coordinates, or relative to object bounding box coordinates. The {@link com.trolltech.qt.gui.QGradient.CoordinateMode coordinate mode } can be set using the {@link com.trolltech.qt.gui.QGradient#setCoordinateMode(com.trolltech.qt.gui.QGradient.CoordinateMode) setCoordinateMode()} function. The default is {@link com.trolltech.qt.gui.QGradient.CoordinateMode LogicalMode }, where the gradient coordinates are specified in the same way as the object coordinates. To retrieve the currently set {@link com.trolltech.qt.gui.QGradient.CoordinateMode coordinate mode } use {@link com.trolltech.qt.gui.QGradient#coordinateMode() coordinateMode()}. <p><DT><b>See also:</b><br><DD>{@link <a href="../demos-gradients.html">The Gradients Demo</a>}, and {@link com.trolltech.qt.gui.QBrush QBrush}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QGradient extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum specifies how gradient coordinates map to the paint device on which the gradient is used.
*/

    public enum CoordinateMode implements com.trolltech.qt.QtEnumerator {
/**
 This is the default mode. The gradient coordinates are specified logical space just like the object coordinates.
*/

        LogicalMode(0),
/**
 In this mode the gradient coordinates are relative to the bounding rectangle of the paint device, with (0,0) in the top left corner, and (1,1) in the bottom right corner of the paint device.
*/

        StretchToDeviceMode(1),
/**
 In this mode the gradient coordinates are relative to the bounding rectangle of the object being drawn, with (0,0) in the top left corner, and (1,1) in the bottom right corner of the object's bounding rectangle.
*/

        ObjectBoundingMode(2);

        CoordinateMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGradient$CoordinateMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CoordinateMode resolve(int value) {
            return (CoordinateMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LogicalMode;
            case 1: return StretchToDeviceMode;
            case 2: return ObjectBoundingMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Specifies how the area outside the gradient area should be filled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#spread() spread()}, and {@link com.trolltech.qt.gui.QGradient#setSpread(com.trolltech.qt.gui.QGradient.Spread) setSpread()}. <br></DD></DT>
*/

    public enum Spread implements com.trolltech.qt.QtEnumerator {
/**
 The area is filled with the closest stop color. This is the default.
*/

        PadSpread(0),
/**
 The gradient is reflected outside the gradient area.
*/

        ReflectSpread(1),
/**
 The gradient is repeated outside the gradient area.
*/

        RepeatSpread(2);

        Spread(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGradient$Spread constant with the specified <tt>int</tt>.</brief>
*/

        public static Spread resolve(int value) {
            return (Spread) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PadSpread;
            case 1: return ReflectSpread;
            case 2: return RepeatSpread;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Specifies the type of gradient. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#type() type()}. <br></DD></DT>
*/

    public enum Type implements com.trolltech.qt.QtEnumerator {
/**
 Interpolates colors between start and end points ({@link com.trolltech.qt.gui.QLinearGradient QLinearGradient}).
*/

        LinearGradient(0),
/**
 Interpolate colors between a focal point and end points on a circle surrounding it ({@link com.trolltech.qt.gui.QRadialGradient QRadialGradient}).
*/

        RadialGradient(1),
/**
 Interpolate colors around a center point ({@link com.trolltech.qt.gui.QConicalGradient QConicalGradient}).
*/

        ConicalGradient(2),
/**
 No gradient is used.
*/

        NoGradient(3);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGradient$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LinearGradient;
            case 1: return RadialGradient;
            case 2: return ConicalGradient;
            case 3: return NoGradient;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGradient(){
        super((QPrivateConstructor)null);
        __qt_QGradient();
    }

    native void __qt_QGradient();

/**
Returns the coordinate mode of this gradient. The default mode is {@link com.trolltech.qt.gui.QGradient.CoordinateMode LogicalMode }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setCoordinateMode(com.trolltech.qt.gui.QGradient.CoordinateMode) setCoordinateMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGradient.CoordinateMode coordinateMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGradient.CoordinateMode.resolve(__qt_coordinateMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_coordinateMode(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QGradient gradient)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QGradient(nativeId(), gradient.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QGradient(long __this__nativeId, long gradient);

/**
Creates a stop point at the given <tt>position</tt> with the given <tt>color</tt>. The given <tt>position</tt> must be in the range 0 to 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) setStops()}, and {@link com.trolltech.qt.gui.QGradient#stops() stops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColorAt(double pos, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColorAt_double_QColor(nativeId(), pos, color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColorAt_double_QColor(long __this__nativeId, double pos, long color);

/**
Sets the coordinate mode of this gradient to <tt>mode</tt>. The default mode is {@link com.trolltech.qt.gui.QGradient.CoordinateMode LogicalMode }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#coordinateMode() coordinateMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCoordinateMode(com.trolltech.qt.gui.QGradient.CoordinateMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCoordinateMode_CoordinateMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setCoordinateMode_CoordinateMode(long __this__nativeId, int mode);

/**
Specifies the spread <tt>method</tt> that should be used for this gradient. <p>Note that this function only has effect for linear and radial gradients. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#spread() spread()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSpread(com.trolltech.qt.gui.QGradient.Spread spread)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpread_Spread(nativeId(), spread.value());
    }
    @QtBlockedSlot
    native void __qt_setSpread_Spread(long __this__nativeId, int spread);

/**
Replaces the current set of stop points with the given <tt>stops</tt>.
The positions of the points must be in the range 0 to 1, and must be
sorted with the lowest point first.
*/

    @QtBlockedSlot
    public final void setStops(java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.gui.QColor>> stops)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStops_List(nativeId(), stops);
    }
    @QtBlockedSlot
    native void __qt_setStops_List(long __this__nativeId, java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.gui.QColor>> stops);

/**
Returns the spread method use by this gradient. The default is {@link com.trolltech.qt.gui.QGradient.Spread PadSpread }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setSpread(com.trolltech.qt.gui.QGradient.Spread) setSpread()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGradient.Spread spread()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGradient.Spread.resolve(__qt_spread(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_spread(long __this__nativeId);

/**
Returns the stop points for this gradient. <p>If no stop points have been specified, a gradient of black at 0 to white at 1 is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGradient#setStops(java.util.List) setStops()}, and {@link com.trolltech.qt.gui.QGradient#setColorAt(double, com.trolltech.qt.gui.QColor) setColorAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.gui.QColor>> stops()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stops(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.gui.QColor>> __qt_stops(long __this__nativeId);

/**
Returns the type of gradient.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGradient.Type type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGradient.Type.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QGradient fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGradient(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QGradient array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QGradient)
        return operator_equal((com.trolltech.qt.gui.QGradient) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QGradient clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QGradient __qt_clone(long __this_nativeId);
}
