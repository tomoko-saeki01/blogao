package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QRubberBand class provides a rectangle or line that can indicate a selection or a boundary. A rubber band is often used to show a new bounding area (as in a {@link com.trolltech.qt.gui.QSplitter QSplitter} or a {@link com.trolltech.qt.gui.QDockWidget QDockWidget} that is undocking). Historically this has been implemented using a {@link com.trolltech.qt.gui.QPainter QPainter} and XOR, but this approach doesn't always work properly since rendering can happen in the window below the rubber band, but before the rubber band has been "erased". <p>You can create a QRubberBand whenever you need to render a rubber band around a given area (or to represent a single line), then call setGeometry(), move() or resize() to position and size it. A common pattern is to do this in conjunction with mouse events. For example: <pre class="snippet">
        protected void mousePressEvent(QMouseEvent event)
        {
            origin = event.pos();
            if (rubberBand != null)
                rubberBand = new QRubberBand(QRubberBand.Shape.Rectangle, this);
            rubberBand.setGeometry(new QRect(origin, new QSize()));
            rubberBand.show();
        }

        protected void mouseMoveEvent(QMouseEvent event)
        {
            rubberBand.setGeometry(new QRect(origin, event.pos()).normalized());
        }

        protected void mouseReleaseEvent(QMouseEvent event)
        {
            rubberBand.hide();
            // determine selection, for example using QRect.intersects()
            // and QRect.contains().
        }
</pre> If you pass a parent to QRubberBand's constructor, the rubber band will display only inside its parent, but stays on top of other child widgets. If no parent is passed, QRubberBand will act as a top-level widget. <p>Call {@link com.trolltech.qt.gui.QWidget#show() show()} to make the rubber band visible; also when the rubber band is not a top-level. Hiding or destroying the widget will make the rubber band disappear. The rubber band can be a {@link com.trolltech.qt.gui.QRubberBand.Shape Rectangle } or a {@link com.trolltech.qt.gui.QRubberBand.Shape Line } (vertical or horizontal), depending on the {@link com.trolltech.qt.gui.QRubberBand#shape() shape()} it was given when constructed.
*/
@QtJambiGeneratedClass
public class QRubberBand extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum specifies what shape a {@link com.trolltech.qt.gui.QRubberBand QRubberBand} should have. This is a drawing hint that is passed down to the style system, and can be interpreted by each {@link com.trolltech.qt.gui.QStyle QStyle}.
*/
@QtBlockedEnum
    public enum Shape implements com.trolltech.qt.QtEnumerator {
/**
 A {@link com.trolltech.qt.gui.QRubberBand QRubberBand} can represent a vertical or horizontal line. Geometry is still given in rect() and the line will fill the given geometry on most styles.
*/

        Line(0),
/**
 A {@link com.trolltech.qt.gui.QRubberBand QRubberBand} can represent a rectangle. Some styles will interpret this as a filled (often semi-transparent) rectangle, or a rectangular outline.
*/

        Rectangle(1);

        Shape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QRubberBand$Shape constant with the specified <tt>int</tt>.</brief>
*/

        public static Shape resolve(int value) {
            return (Shape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Line;
            case 1: return Rectangle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a rubber band of shape <tt>s</tt>, with parent <tt>p</tt>. <p>By default a rectangular rubber band (<tt>s</tt> is <tt>Rectangle</tt>) will use a mask, so that a small border of the rectangle is all that is visible. Some styles (e.g., native Mac OS X) will change this and call {@link QWidget#setWindowOpacity(double) QWidget::setWindowOpacity()} to make a semi-transparent filled selection rectangle.
*/

    public QRubberBand(com.trolltech.qt.gui.QRubberBand.Shape arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a rubber band of shape <tt>s</tt>, with parent <tt>p</tt>. <p>By default a rectangular rubber band (<tt>s</tt> is <tt>Rectangle</tt>) will use a mask, so that a small border of the rectangle is all that is visible. Some styles (e.g., native Mac OS X) will change this and call {@link QWidget#setWindowOpacity(double) QWidget::setWindowOpacity()} to make a semi-transparent filled selection rectangle.
*/

    public QRubberBand(com.trolltech.qt.gui.QRubberBand.Shape arg__1, com.trolltech.qt.gui.QWidget arg__2){
        super((QPrivateConstructor)null);
        __qt_QRubberBand_Shape_QWidget(arg__1.value(), arg__2 == null ? 0 : arg__2.nativeId());
    }

    native void __qt_QRubberBand_Shape_QWidget(int arg__1, long arg__2);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This is an overloaded member function, provided for convenience. <p>Moves the rubberband to point <tt>p</tt>. <p><DT><b>See also:</b><br><DD>resize(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveRubberBand(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveRubberBand_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveRubberBand_QPoint(long __this__nativeId, long p);

/**
Moves the rubberband to point (<tt>x</tt>, <tt>y</tt>). <p><DT><b>See also:</b><br><DD>resize(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveRubberBand(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveRubberBand_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_moveRubberBand_int_int(long __this__nativeId, int x, int y);

/**
This is an overloaded member function, provided for convenience. <p>Resizes the rubberband so that its new size is <tt>size</tt>. <p><DT><b>See also:</b><br><DD>move(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resizeRubberBand(com.trolltech.qt.core.QSize s)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeRubberBand_QSize(nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeRubberBand_QSize(long __this__nativeId, long s);

/**
Resizes the rubberband so that its width is <tt>width</tt>, and its height is <tt>height</tt>. <p><DT><b>See also:</b><br><DD>move(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resizeRubberBand(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeRubberBand_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_resizeRubberBand_int_int(long __this__nativeId, int w, int h);

/**
Sets the geometry of the rubber band to <tt>rect</tt>, specified in the coordinate system of its parent widget. <p><DT><b>See also:</b><br><DD>{@link QWidget#geometry() QWidget::geometry}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRubberBandGeometry(com.trolltech.qt.core.QRect r)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRubberBandGeometry_QRect(nativeId(), r == null ? 0 : r.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRubberBandGeometry_QRect(long __this__nativeId, long r);

/**
This is an overloaded member function, provided for convenience. <p>Sets the geometry of the rubberband to the rectangle whose top-left corner lies at the point (<tt>x</tt>, <tt>y</tt>), and with dimensions specified by <tt>width</tt> and <tt>height</tt>. The geometry is specified in the parent widget's coordinate system.
*/

    @QtBlockedSlot
    public final void setRubberBandGeometry(int x, int y, int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRubberBandGeometry_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setRubberBandGeometry_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Returns the shape of this rubber band. The shape can only be set upon construction.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRubberBand.Shape shape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QRubberBand.Shape.resolve(__qt_shape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shape(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void moveEvent(com.trolltech.qt.gui.QMoveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveEvent_QMoveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveEvent_QMoveEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QRubberBand fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRubberBand(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
This is a overloaded function provided for convenience.
*/

    protected final void initStyleOption(QStyleOptionRubberBand option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
