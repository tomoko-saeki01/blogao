package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPixmapFilter class provides the basic functionality for pixmap filter classes. Pixmap filter can be for example colorize or blur. QPixmapFilter is the base class for every pixmap filter. QPixmapFilter is an abstract class and cannot itself be instantiated. It provides a standard interface for filter processing.
*/
@QtJambiGeneratedClass
public abstract class QPixmapFilter extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QPixmapFilter {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPixmap src, com.trolltech.qt.core.QRectF srcRect) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_draw_QPainter_QPointF_QPixmap_QRectF(nativeId(), painter == null ? 0 : painter.nativeId(), p == null ? 0 : p.nativeId(), src == null ? 0 : src.nativeId(), srcRect == null ? 0 : srcRect.nativeId());
        }
    }
/**
This enum describes the types of filter that can be applied to pixmaps.
*/


    public enum FilterType implements com.trolltech.qt.QtEnumerator {
/**
 A filter that is used to calculate the convolution of the image with a kernel. See {@link com.trolltech.qt.gui.QPixmapConvolutionFilter QPixmapConvolutionFilter} for more information.
*/

        ConvolutionFilter(0),
/**
 A filter that is used to change the overall color of an image. See {@link com.trolltech.qt.gui.QPixmapColorizeFilter QPixmapColorizeFilter} for more information.
*/

        ColorizeFilter(1),
/**
 A filter that is used to add a drop shadow to an image. See {@link com.trolltech.qt.gui.QPixmapDropShadowFilter QPixmapDropShadowFilter} for more information.
*/

        DropShadowFilter(2),
/**
 The first filter type that can be used for application-specific purposes.
*/

        UserFilter(1024);

        FilterType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPixmapFilter$FilterType constant with the specified <tt>int</tt>.</brief>
*/

        public static FilterType resolve(int value) {
            return (FilterType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ConvolutionFilter;
            case 1: return ColorizeFilter;
            case 2: return DropShadowFilter;
            case 1024: return UserFilter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a default QPixmapFilter with the given <tt>type</tt>. <p>This constructor should be used when subclassing QPixmapFilter to create custom user filters.
*/

    protected QPixmapFilter(com.trolltech.qt.gui.QPixmapFilter.FilterType type){
        super((QPrivateConstructor)null);
        __qt_QPixmapFilter_FilterType(type.value());
    }

    native void __qt_QPixmapFilter_FilterType(int type);

/**
Returns the type of the filter. All standard pixmap filter classes are associated with a unique value.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmapFilter.FilterType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPixmapFilter.FilterType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the bounding rectangle that is affected by the pixmap filter if the filter is applied to the specified <tt>rect</tt>.
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
Uses <tt>painter</tt> to draw filtered result of <tt>src</tt> at the point specified by <tt>p</tt>. If <tt>srcRect</tt> is specified the it will be used as a source rectangle to only draw a part of the source. <p>{@link com.trolltech.qt.gui.QPixmapFilter#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QPixmap) draw()} will affect the area which {@link com.trolltech.qt.gui.QPixmapFilter#boundingRectFor(com.trolltech.qt.core.QRectF) boundingRectFor()} returns.
*/

    @QtBlockedSlot
    public final void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPixmap src) {
        draw(painter, p, src, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF());
    }
/**
Uses <tt>painter</tt> to draw filtered result of <tt>src</tt> at the point specified by <tt>p</tt>. If <tt>srcRect</tt> is specified the it will be used as a source rectangle to only draw a part of the source. <p>{@link com.trolltech.qt.gui.QPixmapFilter#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QPixmap) draw()} will affect the area which {@link com.trolltech.qt.gui.QPixmapFilter#boundingRectFor(com.trolltech.qt.core.QRectF) boundingRectFor()} returns.
*/

    @QtBlockedSlot
    public abstract void draw(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPointF p, com.trolltech.qt.gui.QPixmap src, com.trolltech.qt.core.QRectF srcRect);
    @QtBlockedSlot
    native void __qt_draw_QPainter_QPointF_QPixmap_QRectF(long __this__nativeId, long painter, long p, long src, long srcRect);

/**
@exclude
*/

    public static native QPixmapFilter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmapFilter(QPrivateConstructor p) { super(p); } 
}
