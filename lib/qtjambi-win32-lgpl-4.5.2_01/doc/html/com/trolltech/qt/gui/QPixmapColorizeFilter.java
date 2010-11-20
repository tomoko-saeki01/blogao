package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPixmapColorizeFilter class provides colorizing filtering for pixmaps. A colorize filter gives the pixmap a tint of its {@link com.trolltech.qt.gui.QPixmapColorizeFilter#color() color()}. The filter first grayscales the pixmap and then converts those to colorized values using {@link com.trolltech.qt.gui.QPainter.CompositionMode QPainter::CompositionMode_Screen } with the chosen color. The alpha-channel is not changed. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QPixmapColorizeFilter *myFilter = new QPixmapColorFilter;
myFilter-&gt;setColor(QColor(128, 0, 0));
myFilter-&gt;draw(painter, QPoint(0, 0), originalPixmap);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter.CompositionMode QPainter::CompositionMode }. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPixmapColorizeFilter extends com.trolltech.qt.gui.QPixmapFilter
{

/**
Constructs an pixmap colorize filter. <p>Default color value for colorizing is {@link com.trolltech.qt.gui.QColor QColor}(0, 0, 192).
*/

    public QPixmapColorizeFilter(){
        super((QPrivateConstructor)null);
        __qt_QPixmapColorizeFilter();
    }

    native void __qt_QPixmapColorizeFilter();

/**
Gets the color of the colorize filter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapColorizeFilter#setColor(com.trolltech.qt.gui.QColor) setColor()}. <br></DD></DT>
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
Sets the color of the colorize filter to the <tt>color</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmapColorizeFilter#color() color()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPointF dest, com.trolltech.qt.gui.QPixmap src, com.trolltech.qt.core.QRectF srcRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_draw_QPainter_QPointF_QPixmap_QRectF(nativeId(), painter == null ? 0 : painter.nativeId(), dest == null ? 0 : dest.nativeId(), src == null ? 0 : src.nativeId(), srcRect == null ? 0 : srcRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_draw_QPainter_QPointF_QPixmap_QRectF(long __this__nativeId, long painter, long dest, long src, long srcRect);

/**
@exclude
*/

    public static native QPixmapColorizeFilter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmapColorizeFilter(QPrivateConstructor p) { super(p); } 
}
