package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPixmapConvolutionFilter class provides convolution filtering for pixmaps. QPixmapConvolutionFilter implements a convolution pixmap filter, which is applied when {@link com.trolltech.qt.gui.QPixmapFilter#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QPixmap) draw()} is called. A convolution filter lets you distort an image by setting the values of a matrix of qreal values called its {@link com.trolltech.qt.gui.QPixmapConvolutionFilter#setConvolutionKernel(double[], int, int) kernel}. The matrix's values are usually between -1.0 and 1.0. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QPixmapConvolutionFilter *myFilter = new QPixmapConvolutionFilter;
qreal kernel[] = {
     0.0,-1.0, 0.0,
    -1.0, 5.0,-1.0,
     0.0,-1.0, 0.0
    };
myFilter-&gt;setConvolutionKernel(kernel, 3, 3);
myFilter-&gt;draw(painter, QPoint(0, 0), originalPixmap);
</pre> <p><DT><b>See also:</b><br><DD>{@link <a href="../painting-pixmapfilters.html">Pixmap Filters Example</a>}, {@link com.trolltech.qt.gui.QPixmapColorizeFilter QPixmapColorizeFilter}, and {@link com.trolltech.qt.gui.QPixmapDropShadowFilter QPixmapDropShadowFilter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPixmapConvolutionFilter extends com.trolltech.qt.gui.QPixmapFilter
{

/**
Constructs a pixmap convolution filter. <p>By default there is no convolution kernel.
*/

    public QPixmapConvolutionFilter(){
        super((QPrivateConstructor)null);
        __qt_QPixmapConvolutionFilter();
    }

    native void __qt_QPixmapConvolutionFilter();

    @QtBlockedSlot
    private final void setConvolutionKernel_private(com.trolltech.qt.QNativePointer matrix, int rows, int columns)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setConvolutionKernel_private_nativepointer_int_int(nativeId(), matrix, rows, columns);
    }
    @QtBlockedSlot
    native void __qt_setConvolutionKernel_private_nativepointer_int_int(long __this__nativeId, com.trolltech.qt.QNativePointer matrix, int rows, int columns);

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

    public static native QPixmapConvolutionFilter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmapConvolutionFilter(QPrivateConstructor p) { super(p); } 

/**

*/

    public final void setConvolutionKernel(double[] kernel, int rows, int columns)
    {
        int length = rows * columns;

        QNativePointer kernelPtr = new QNativePointer(QNativePointer.Type.Double, length);
        for (int i = 0; i < length; ++i)
            kernelPtr.setDoubleAt(i, kernel[i]);

        setConvolutionKernel_private(kernelPtr, rows, columns);
    }

}
