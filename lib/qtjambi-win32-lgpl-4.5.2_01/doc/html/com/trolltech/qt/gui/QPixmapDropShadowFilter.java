package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPixmapDropShadowFilter class is a convenience class for drawing pixmaps with drop shadows. The drop shadow is produced by taking a copy of the source pixmap and applying a color to the copy using a {@link com.trolltech.qt.gui.QPainter.CompositionMode QPainter::CompositionMode_DestinationIn } operation. This produces a homogeneously-colored pixmap which is then drawn using a {@link com.trolltech.qt.gui.QPixmapConvolutionFilter QPixmapConvolutionFilter} at an offset. The original pixmap is drawn on top. <p>The QPixmapDropShadowFilter class provides some customization options to specify how the drop shadow should appear. The color of the drop shadow can be modified using the {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setColor(com.trolltech.qt.gui.QColor) setColor()} function, the drop shadow offset can be modified using the {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setOffset(com.trolltech.qt.core.QPointF) setOffset()} function, and the blur radius of the drop shadow can be changed through the {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setBlurRadius(double) setBlurRadius()} function. <p>By default, the drop shadow is a dark gray shadow, blurred with a radius of 1 at an offset of 8 pixels towards the lower right. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QPixmapDropShadowFilter *myFilter = new QPixmapDropShadowFilter;
myFilter-&gt;draw(painter, QPoint(0, 0), originalPixmap);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapColorizeFilter QPixmapColorizeFilter}, and {@link com.trolltech.qt.gui.QPixmapConvolutionFilter QPixmapConvolutionFilter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPixmapDropShadowFilter extends com.trolltech.qt.gui.QPixmapFilter
{

/**
Constructs drop shadow filter.
*/

    public QPixmapDropShadowFilter(){
        super((QPrivateConstructor)null);
        __qt_QPixmapDropShadowFilter();
    }

    native void __qt_QPixmapDropShadowFilter();

/**
Returns the radius in pixels of the blur on the drop shadow. <p>A smaller radius results in a sharper shadow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setBlurRadius(double) setBlurRadius()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#color() color()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#offset() offset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double blurRadius()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blurRadius(nativeId());
    }
    @QtBlockedSlot
    native double __qt_blurRadius(long __this__nativeId);

/**
Returns the color of the drop shadow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setColor(com.trolltech.qt.gui.QColor) setColor()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#blurRadius() blurRadius()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#offset() offset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor color()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_color(long __this__nativeId);

/**
Returns the shadow offset in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setOffset(com.trolltech.qt.core.QPointF) setOffset()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#blurRadius() blurRadius()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#color() color()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF offset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_offset(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_offset(long __this__nativeId);

/**
Sets the radius in pixels of the blur on the drop shadow to the <tt>radius</tt> specified. <p>Using a smaller radius results in a sharper shadow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#blurRadius() blurRadius()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setColor(com.trolltech.qt.gui.QColor) setColor()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setOffset(com.trolltech.qt.core.QPointF) setOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlurRadius(double radius)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlurRadius_double(nativeId(), radius);
    }
    @QtBlockedSlot
    native void __qt_setBlurRadius_double(long __this__nativeId, double radius);

/**
Sets the color of the drop shadow to the <tt>color</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#color() color()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setBlurRadius(double) setBlurRadius()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setOffset(com.trolltech.qt.core.QPointF) setOffset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColor_QColor(long __this__nativeId, long color);

/**
Sets the shadow offset in pixels to the <tt>offset</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#offset() offset()}, {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setBlurRadius(double) setBlurRadius()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOffset(com.trolltech.qt.core.QPointF offset)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffset_QPointF(nativeId(), offset == null ? 0 : offset.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOffset_QPointF(long __this__nativeId, long offset);

/**
This is an overloaded member function, provided for convenience. <p>Sets the shadow offset in pixels to be the displacement specified by the horizontal <tt>dx</tt> and vertical <tt>dy</tt> coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setBlurRadius(double) setBlurRadius()}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOffset(double dx, double dy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffset_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_setOffset_double_double(long __this__nativeId, double dx, double dy);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF boundingRectFor(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRectFor_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRectFor_QRectF(long __this__nativeId, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void draw(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF pos, com.trolltech.qt.gui.QPixmap px, com.trolltech.qt.core.QRectF src)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_draw_QPainter_QPointF_QPixmap_QRectF(nativeId(), p == null ? 0 : p.nativeId(), pos == null ? 0 : pos.nativeId(), px == null ? 0 : px.nativeId(), src == null ? 0 : src.nativeId());
    }
    @QtBlockedSlot
    native void __qt_draw_QPainter_QPointF_QPixmap_QRectF(long __this__nativeId, long p, long pos, long px, long src);

/**
@exclude
*/

    public static native QPixmapDropShadowFilter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmapDropShadowFilter(QPrivateConstructor p) { super(p); } 
}
