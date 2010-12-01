package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStylePainter class is a convenience class for drawing {@link com.trolltech.qt.gui.QStyle QStyle} elements inside a widget. QStylePainter extends {@link com.trolltech.qt.gui.QPainter QPainter} with a set of high-level <tt>draw...()</tt> functions implemented on top of {@link com.trolltech.qt.gui.QStyle QStyle}'s API. The advantage of using QStylePainter is that the parameter lists get considerably shorter. Whereas a {@link com.trolltech.qt.gui.QStyle QStyle} object must be able to draw on any widget using any painter (because the application normally has one {@link com.trolltech.qt.gui.QStyle QStyle} object shared by all widget), a QStylePainter is initialized with a widget, eliminating the need to specify the {@link com.trolltech.qt.gui.QWidget QWidget}, the {@link com.trolltech.qt.gui.QPainter QPainter}, and the {@link com.trolltech.qt.gui.QStyle QStyle} for every function call. <p>Example using {@link com.trolltech.qt.gui.QStyle QStyle} directly: <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    
    {
    
        QPainter painter = new QPainter(this);
    

        QStyleOptionFocusRect option = new QStyleOptionFocusRect();
        option.initFrom(this);
        option.setBackgroundColor(palette().color(QPalette.ColorRole.Window));

    
        style().drawPrimitive(QStyle.PrimitiveElement.PE_FrameFocusRect,
                              option, painter, this);
    
    }
    </pre> Example using QStylePainter: <pre class="snippet"> 
    protected void paintEvent(QPaintEvent event)
    
    {
    
        QStylePainter painter = new QStylePainter(this);
    

        QStyleOptionFocusRect option = new QStyleOptionFocusRect();
        option.initFrom(this);
        option.setBackgroundColor(palette().color(QPalette.ColorRole.Window));

    
        painter.drawPrimitive(QStyle.PrimitiveElement.PE_FrameFocusRect, option);
    
    }
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle QStyle}, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStylePainter extends com.trolltech.qt.gui.QPainter
{

/**
Constructs a QStylePainter.
*/

    public QStylePainter(){
        super((QPrivateConstructor)null);
        __qt_QStylePainter();
    }

    native void __qt_QStylePainter();

/**
Construct a QStylePainter using <tt>pd</tt> for its paint device, and attributes from <tt>widget</tt>.
*/

    public QStylePainter(com.trolltech.qt.gui.QPaintDeviceInterface pd, com.trolltech.qt.gui.QWidget w){
        super((QPrivateConstructor)null);
        __qt_QStylePainter_QPaintDevice_QWidget(pd == null ? 0 : pd.nativeId(), w == null ? 0 : w.nativeId());
    }

    native void __qt_QStylePainter_QPaintDevice_QWidget(long pd, long w);

/**
Construct a QStylePainter using widget <tt>widget</tt> for its paint device.
*/

    public QStylePainter(com.trolltech.qt.gui.QWidget w){
        super((QPrivateConstructor)null);
        __qt_QStylePainter_QWidget(w == null ? 0 : w.nativeId());
    }

    native void __qt_QStylePainter_QWidget(long w);

/**
This is an overloaded member function, provided for convenience. <p>Begin painting operations on paint device <tt>pd</tt> as if it was <tt>widget</tt>. <p>This is automatically called by the constructor that takes a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} and a {@link com.trolltech.qt.gui.QWidget QWidget}.
*/

    @QtBlockedSlot
    public final boolean begin(com.trolltech.qt.gui.QPaintDeviceInterface pd, com.trolltech.qt.gui.QWidget w)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin_QPaintDevice_QWidget(nativeId(), pd == null ? 0 : pd.nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_begin_QPaintDevice_QWidget(long __this__nativeId, long pd, long w);

/**
Begin painting operations on the specified <tt>widget</tt>. Returns true if the painter is ready to use; otherwise returns false. <p>This is automatically called by the constructor that takes a {@link com.trolltech.qt.gui.QWidget QWidget}.
*/

    @QtBlockedSlot
    public final boolean begin(com.trolltech.qt.gui.QWidget w)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_begin_QWidget(long __this__nativeId, long w);

/**
Use the widget's style to draw a complex control <tt>cc</tt> specified by the {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}<tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) QStyle::drawComplexControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawComplexControl_ComplexControl_QStyleOptionComplex(nativeId(), cc.value(), opt == null ? 0 : opt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawComplexControl_ComplexControl_QStyleOptionComplex(long __this__nativeId, int cc, long opt);

/**
Use the widget's style to draw a control element <tt>ce</tt> specified by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}<tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawControl(com.trolltech.qt.gui.QStyle.ControlElement ce, com.trolltech.qt.gui.QStyleOption opt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawControl_ControlElement_QStyleOption(nativeId(), ce.value(), opt == null ? 0 : opt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawControl_ControlElement_QStyleOption(long __this__nativeId, int ce, long opt);

/**
Draws the <tt>pixmap</tt> in rectangle <tt>rect</tt>. The pixmap is aligned according to <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawItemPixmap(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPixmap) QStyle::drawItemPixmap()}, and Qt::Alignment. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawItemPixmap(com.trolltech.qt.core.QRect r, int flags, com.trolltech.qt.gui.QPixmap pixmap)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItemPixmap_QRect_int_QPixmap(nativeId(), r == null ? 0 : r.nativeId(), flags, pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawItemPixmap_QRect_int_QPixmap(long __this__nativeId, long r, int flags, long pixmap);


/**
Draws the <tt>text</tt> in rectangle <tt>rect</tt> and palette <tt>pal</tt>. The text is aligned and wrapped according to <tt>flags</tt>. <p>The pen color is specified with <tt>textRole</tt>. The <tt>enabled</tt> bool indicates whether or not the item is enabled; when reimplementing this bool should influence how the item is drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawItemText(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPalette, boolean, java.lang.String) QStyle::drawItemText()}, and Qt::Alignment. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawItemText(com.trolltech.qt.core.QRect r, int flags, com.trolltech.qt.gui.QPalette pal, boolean enabled, java.lang.String text) {
        drawItemText(r, flags, pal, enabled, text, com.trolltech.qt.gui.QPalette.ColorRole.NoRole);
    }
/**
Draws the <tt>text</tt> in rectangle <tt>rect</tt> and palette <tt>pal</tt>. The text is aligned and wrapped according to <tt>flags</tt>. <p>The pen color is specified with <tt>textRole</tt>. The <tt>enabled</tt> bool indicates whether or not the item is enabled; when reimplementing this bool should influence how the item is drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawItemText(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPalette, boolean, java.lang.String) QStyle::drawItemText()}, and Qt::Alignment. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawItemText(com.trolltech.qt.core.QRect r, int flags, com.trolltech.qt.gui.QPalette pal, boolean enabled, java.lang.String text, com.trolltech.qt.gui.QPalette.ColorRole textRole)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItemText_QRect_int_QPalette_boolean_String_ColorRole(nativeId(), r == null ? 0 : r.nativeId(), flags, pal == null ? 0 : pal.nativeId(), enabled, text, textRole.value());
    }
    @QtBlockedSlot
    native void __qt_drawItemText_QRect_int_QPalette_boolean_String_ColorRole(long __this__nativeId, long r, int flags, long pal, boolean enabled, java.lang.String text, int textRole);

/**
Use the widget's style to draw a primitive element <tt>pe</tt> specified by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}<tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawPrimitive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement pe, com.trolltech.qt.gui.QStyleOption opt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPrimitive_PrimitiveElement_QStyleOption(nativeId(), pe.value(), opt == null ? 0 : opt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPrimitive_PrimitiveElement_QStyleOption(long __this__nativeId, int pe, long opt);

/**
Return the current style used by the QStylePainter.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyle style()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_style(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyle __qt_style(long __this__nativeId);

/**
@exclude
*/

    public static native QStylePainter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStylePainter(QPrivateConstructor p) { super(p); } 
}
