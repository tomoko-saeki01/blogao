package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFrame class is the base class of widgets that can have a frame. {@link com.trolltech.qt.gui.QMenu QMenu} uses this to "raise" the menu above the surrounding screen. {@link com.trolltech.qt.gui.QProgressBar QProgressBar} has a "sunken" look. {@link com.trolltech.qt.gui.QLabel QLabel} has a flat look. The frames of widgets like these can be changed. <pre class="snippet">
    QLabel label = new QLabel(this);
    label.setFrameStyle(QFrame.Shape.Panel.value() | QFrame.Shadow.Raised.value());
    label.setLineWidth(2);

    QProgressBar pbar = new QProgressBar(this);
    label.setFrameStyle(QFrame.Shape.NoFrame.value());
</pre> The QFrame class can also be used directly for creating simple placeholder frames without any contents. <p>The frame style is specified by a {@link com.trolltech.qt.gui.QFrame.Shape frame shape } and a {@link com.trolltech.qt.gui.QFrame.Shadow shadow style } that is used to visually separate the frame from surrounding widgets. These properties can be set together using the {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()} function and read with {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}. <p>The frame shapes are {@link com.trolltech.qt.gui.QFrame.Shape NoFrame }, {@link com.trolltech.qt.gui.QFrame.Shape Box }, {@link com.trolltech.qt.gui.QFrame.Shape Panel }, {@link com.trolltech.qt.gui.QFrame.Shape StyledPanel }, {@link com.trolltech.qt.gui.QFrame.Shape HLine } and {@link com.trolltech.qt.gui.QFrame.Shape VLine }; the shadow styles are {@link com.trolltech.qt.gui.QFrame.Shadow Plain }, {@link com.trolltech.qt.gui.QFrame.Shadow Raised } and {@link com.trolltech.qt.gui.QFrame.Shadow Sunken }. <p>A frame widget has three attributes that describe the thickness of the border: {@link QFrame#lineWidth() lineWidth}, {@link QFrame#midLineWidth() midLineWidth}, and {@link QFrame#frameWidth() frameWidth}. <ul><li> The line width is the width of the frame border. It can be modified to customize the frame's appearance.</li><li> The mid-line width specifies the width of an extra line in the middle of the frame, which uses a third color to obtain a special 3D effect. Notice that a mid-line is only drawn for {@link com.trolltech.qt.gui.QFrame.Shape Box }, {@link com.trolltech.qt.gui.QFrame.Shape HLine } and {@link com.trolltech.qt.gui.QFrame.Shape VLine } frames that are raised or sunken.</li><li> The frame width is determined by the frame style, and the {@link com.trolltech.qt.gui.QFrame#frameWidth() frameWidth()} function is used to obtain the value defined for the style used.</li></ul> The margin between the frame and the contents of the frame can be customized with the {@link com.trolltech.qt.gui.QWidget#setContentsMargins(int, int, int, int) QWidget::setContentsMargins()} function.<a name="picture"> This table shows some of the combinations of styles and line widths: <br><center><img src="../images/frames.png"></center><br>
*/
@QtJambiGeneratedClass
public class QFrame extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum defines two constants that can be used to extract the two components of {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}: Normally, you don't need to use these, since frameShadow() and frameShape() already extract the {@link com.trolltech.qt.gui.QFrame.Shadow Shadow } and the {@link com.trolltech.qt.gui.QFrame.Shape Shape } parts of {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}, and {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StyleMask implements com.trolltech.qt.QtEnumerator {
/**
 The {@link com.trolltech.qt.gui.QFrame.Shadow Shadow } part of {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}
*/

        Shadow_Mask(240),
/**
 The {@link com.trolltech.qt.gui.QFrame.Shape Shape } part of {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}
*/

        Shape_Mask(15);

        StyleMask(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFrame$StyleMask constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleMask resolve(int value) {
            return (StyleMask) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 240: return Shadow_Mask;
            case 15: return Shape_Mask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the shapes of frame available. When it does not call {@link com.trolltech.qt.gui.QStyle QStyle}, Shape interacts with {@link com.trolltech.qt.gui.QFrame.Shadow QFrame::Shadow }, the lineWidth() and the midLineWidth() to create the total result. See the picture of the frames in the main class documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame.Shadow QFrame::Shadow }, {@link com.trolltech.qt.gui.QWidget#style() QFrame::style()}, and {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawPrimitive()}. <br></DD></DT>
*/

    public enum Shape implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QFrame QFrame} draws nothing
*/

        NoFrame(0),
/**
 {@link com.trolltech.qt.gui.QFrame QFrame} draws a box around its contents
*/

        Box(1),
/**
 {@link com.trolltech.qt.gui.QFrame QFrame} draws a panel to make the contents appear raised or sunken
*/

        Panel(2),
/**
 draws a rectangular panel that can be raised or sunken like those in Windows 95. Specifying this shape sets the line width to 2 pixels. {@link com.trolltech.qt.gui.QFrame.Shape WinPanel } is provided for compatibility. For GUI style independence we recommend using {@link com.trolltech.qt.gui.QFrame.Shape StyledPanel } instead.
*/

        WinPanel(3),
/**
 {@link com.trolltech.qt.gui.QFrame QFrame} draws a horizontal line that frames nothing (useful as separator)
*/

        HLine(4),
/**
 {@link com.trolltech.qt.gui.QFrame QFrame} draws a vertical line that frames nothing (useful as separator)
*/

        VLine(5),
/**
 draws a rectangular panel with a look that depends on the current GUI style. It can be raised or sunken.
*/

        StyledPanel(6);

        Shape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFrame$Shape constant with the specified <tt>int</tt>.</brief>
*/

        public static Shape resolve(int value) {
            return (Shape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoFrame;
            case 1: return Box;
            case 2: return Panel;
            case 3: return WinPanel;
            case 4: return HLine;
            case 5: return VLine;
            case 6: return StyledPanel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the types of shadow that are used to give a 3D effect to frames. Shadow interacts with {@link com.trolltech.qt.gui.QFrame.Shape QFrame::Shape }, the lineWidth() and the midLineWidth(). See the picture of the frames in the main class documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame.Shape QFrame::Shape }, lineWidth(), and midLineWidth(). <br></DD></DT>
*/

    public enum Shadow implements com.trolltech.qt.QtEnumerator {
/**
 the frame and contents appear level with the surroundings; draws using the palette {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::WindowText } color (without any 3D effect)
*/

        Plain(16),
/**
 the frame and contents appear raised; draws a 3D raised line using the light and dark colors of the current color group
*/

        Raised(32),
/**
 the frame and contents appear sunken; draws a 3D sunken line using the light and dark colors of the current color group
*/

        Sunken(48),
        CustomEnum(0);

        Shadow(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFrame$Shadow constant with the specified <tt>int</tt>.</brief>
*/

        public static Shadow resolve(int value) {
            return (Shadow) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 16: return Plain;
            case 32: return Raised;
            case 48: return Sunken;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, Shadow>();
            Shadow e = enumCache.get(value);
            if (e == null) {
                e = (Shadow) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), Shadow.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, Shadow> enumCache;    }



/**
This is an overloaded method provided for convenience.
*/

    public QFrame(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs a frame widget with frame style {@link com.trolltech.qt.gui.QFrame.Shape NoFrame } and a 1-pixel frame width. <p>The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor.
*/

    public QFrame(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a frame widget with frame style {@link com.trolltech.qt.gui.QFrame.Shape NoFrame } and a 1-pixel frame width. <p>The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor.
*/

    public QFrame() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a frame widget with frame style {@link com.trolltech.qt.gui.QFrame.Shape NoFrame } and a 1-pixel frame width. <p>The <tt>parent</tt> and <tt>f</tt> arguments are passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor.
*/

    public QFrame(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QFrame_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QFrame_QWidget_WindowFlags(long parent, int f);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void drawFrame(com.trolltech.qt.gui.QPainter arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawFrame_QPainter(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawFrame_QPainter(long __this__nativeId, long arg__1);

/**
This property holds the frame's rectangle. The frame's rectangle is the rectangle the frame is drawn in. By default, this is the entire widget. Setting the rectangle does does not cause a widget update. The frame rectangle is automatically adjusted when the widget changes size. <p>If you set the rectangle to a null rectangle (for example, {@link com.trolltech.qt.core.QRect QRect}(0, 0, 0, 0)), then the resulting frame rectangle is equivalent to the {@link QWidget#rect() widget rectangle}.
*/

    @com.trolltech.qt.QtPropertyReader(name="frameRect")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect frameRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_frameRect(long __this__nativeId);

/**
This property holds the frame shadow value from the frame style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}, and {@link com.trolltech.qt.gui.QFrame#frameShape() frameShape()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="frameShadow")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFrame.Shadow frameShadow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFrame.Shadow.resolve(__qt_frameShadow(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_frameShadow(long __this__nativeId);

/**
This property holds the frame shape value from the frame style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}, and {@link com.trolltech.qt.gui.QFrame#frameShadow() frameShadow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="frameShape")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFrame.Shape frameShape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFrame.Shape.resolve(__qt_frameShape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_frameShape(long __this__nativeId);

/**
Returns the frame style. <p>The default value is {@link com.trolltech.qt.gui.QFrame.Shape QFrame::NoFrame }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, {@link com.trolltech.qt.gui.QFrame#frameShape() frameShape()}, and {@link com.trolltech.qt.gui.QFrame#frameShadow() frameShadow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int frameStyle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameStyle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_frameStyle(long __this__nativeId);

/**
This property holds the width of the frame that is drawn.  Note that the frame width depends on the {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) frame style}, not only the line width and the mid-line width. For example, the style specified by {@link com.trolltech.qt.gui.QFrame.Shape NoFrame } always has a frame width of 0, whereas the style {@link com.trolltech.qt.gui.QFrame.Shape Panel } has a frame width equivalent to the line width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#lineWidth() lineWidth()}, {@link com.trolltech.qt.gui.QFrame#midLineWidth() midLineWidth()}, and {@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="frameWidth")
    @QtBlockedSlot
    public final int frameWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_frameWidth(long __this__nativeId);

/**
This property holds the line width. Note that the total line width for frames used as separators ({@link com.trolltech.qt.gui.QFrame.Shape HLine } and {@link com.trolltech.qt.gui.QFrame.Shape VLine }) is specified by {@link QFrame#frameWidth() frameWidth}. <p>The default value is 1. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() midLineWidth}, and {@link QFrame#frameWidth() frameWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="lineWidth")
    @QtBlockedSlot
    public final int lineWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineWidth(long __this__nativeId);

/**
This property holds the width of the mid-line. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() lineWidth}, and {@link QFrame#frameWidth() frameWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="midLineWidth")
    @QtBlockedSlot
    public final int midLineWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_midLineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_midLineWidth(long __this__nativeId);

/**
This property holds the frame's rectangle. The frame's rectangle is the rectangle the frame is drawn in. By default, this is the entire widget. Setting the rectangle does does not cause a widget update. The frame rectangle is automatically adjusted when the widget changes size. <p>If you set the rectangle to a null rectangle (for example, {@link com.trolltech.qt.core.QRect QRect}(0, 0, 0, 0)), then the resulting frame rectangle is equivalent to the {@link QWidget#rect() widget rectangle}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="frameRect")
    @QtBlockedSlot
    public final void setFrameRect(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameRect_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFrameRect_QRect(long __this__nativeId, long arg__1);

/**
This property holds the frame shadow value from the frame style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}, and {@link com.trolltech.qt.gui.QFrame#frameShape() frameShape()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="frameShadow")
    @QtBlockedSlot
    public final void setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameShadow_Shadow(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setFrameShadow_Shadow(long __this__nativeId, int arg__1);

/**
This property holds the frame shape value from the frame style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}, and {@link com.trolltech.qt.gui.QFrame#frameShadow() frameShadow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="frameShape")
    @QtBlockedSlot
    public final void setFrameShape(com.trolltech.qt.gui.QFrame.Shape arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameShape_Shape(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setFrameShape_Shape(long __this__nativeId, int arg__1);

/**
Sets the frame style to <tt>style</tt>. <p>The <tt>style</tt> is the bitwise OR between a frame shape and a frame shadow style. See the picture of the frames in the main class documentation. <p>The frame shapes are given in {@link com.trolltech.qt.gui.QFrame.Shape QFrame::Shape } and the shadow styles in {@link com.trolltech.qt.gui.QFrame.Shadow QFrame::Shadow }. <p>If a mid-line width greater than 0 is specified, an additional line is drawn for {@link com.trolltech.qt.gui.QFrame.Shadow Raised } or {@link com.trolltech.qt.gui.QFrame.Shadow Sunken }{@link com.trolltech.qt.gui.QFrame.Shape Box }, {@link com.trolltech.qt.gui.QFrame.Shape HLine }, and {@link com.trolltech.qt.gui.QFrame.Shape VLine } frames. The mid-color of the current color group is used for drawing middle lines. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFrame#frameStyle() frameStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFrameStyle(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrameStyle_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFrameStyle_int(long __this__nativeId, int arg__1);

/**
This property holds the line width. Note that the total line width for frames used as separators ({@link com.trolltech.qt.gui.QFrame.Shape HLine } and {@link com.trolltech.qt.gui.QFrame.Shape VLine }) is specified by {@link QFrame#frameWidth() frameWidth}. <p>The default value is 1. <p><DT><b>See also:</b><br><DD>{@link QFrame#midLineWidth() midLineWidth}, and {@link QFrame#frameWidth() frameWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="lineWidth")
    @QtBlockedSlot
    public final void setLineWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setLineWidth_int(long __this__nativeId, int arg__1);

/**
This property holds the width of the mid-line. The default value is 0. <p><DT><b>See also:</b><br><DD>{@link QFrame#lineWidth() lineWidth}, and {@link QFrame#frameWidth() frameWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="midLineWidth")
    @QtBlockedSlot
    public final void setMidLineWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMidLineWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setMidLineWidth_int(long __this__nativeId, int arg__1);

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
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QFrame fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFrame(QPrivateConstructor p) { super(p); } 
}
