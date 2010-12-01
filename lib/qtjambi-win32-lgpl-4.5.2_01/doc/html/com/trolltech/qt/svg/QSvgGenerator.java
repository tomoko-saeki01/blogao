package com.trolltech.qt.svg;

import com.trolltech.qt.*;



/**
The QSvgGenerator class provides a paint device that is used to create SVG drawings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgRenderer QSvgRenderer}, and {@link com.trolltech.qt.svg.QSvgWidget QSvgWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSvgGenerator extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    private Object __rcOutputDevice = null;

    static {
        com.trolltech.qt.svg.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a new generator.
*/

    public QSvgGenerator(){
        super((QPrivateConstructor)null);
        __qt_QSvgGenerator();
    }

    native void __qt_QSvgGenerator();

/**
Returns the bit depth (number of bit planes) of the paint device.
*/

    @QtBlockedSlot
    public final int depth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_depth(long __this__nativeId);

/**
This property holds the description of the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#title() title}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="description")
    @QtBlockedSlot
    public final java.lang.String description()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**
This property holds the target filename for the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#outputDevice() outputDevice}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fileName")
    @QtBlockedSlot
    public final java.lang.String fileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns the height of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int heightMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_heightMM(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiX(long __this__nativeId);

/**
Returns the vertical resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiY(long __this__nativeId);

/**
Returns the number of different colors available for the paint device. Since this value is an int, it will not be sufficient to represent the number of colors on 32 bit displays, in this case INT_MAX is returned instead.
*/

    @QtBlockedSlot
    public final int numColors()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numColors(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numColors(long __this__nativeId);

/**
This property holds the output device for the generated SVG drawing. If both output device and file name are specified, the output device will have precedence. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#fileName() fileName}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="outputDevice")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice outputDevice()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_outputDevice(long __this__nativeId);

/**
Returns true if the device is currently being painted on, i. . someone has called {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} but not yet called {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for this device; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() QPainter::isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean paintingActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintingActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_paintingActive(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiX(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiY(long __this__nativeId);

/**
This property holds the resolution of the generated output. The resolution is specified in dots per inch, and is used to calculate the physical size of an SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#size() size}, and {@link QSvgGenerator#viewBoxF() viewBox}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="resolution")
    @QtBlockedSlot
    public final int resolution()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolution(nativeId());
    }
    @QtBlockedSlot
    native int __qt_resolution(long __this__nativeId);

/**
This property holds the description of the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#title() title}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="description")
    @QtBlockedSlot
    public final void setDescription(java.lang.String description)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescription_String(nativeId(), description);
    }
    @QtBlockedSlot
    native void __qt_setDescription_String(long __this__nativeId, java.lang.String description);

/**
This property holds the target filename for the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#outputDevice() outputDevice}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="fileName")
    @QtBlockedSlot
    public final void setFileName(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String fileName);

/**
This property holds the output device for the generated SVG drawing. If both output device and file name are specified, the output device will have precedence. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#fileName() fileName}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="outputDevice")
    @QtBlockedSlot
    public final void setOutputDevice(com.trolltech.qt.core.QIODevice outputDevice)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcOutputDevice = outputDevice;
        }
        __qt_setOutputDevice_QIODevice(nativeId(), outputDevice == null ? 0 : outputDevice.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOutputDevice_QIODevice(long __this__nativeId, long outputDevice);

/**
This property holds the resolution of the generated output. The resolution is specified in dots per inch, and is used to calculate the physical size of an SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#size() size}, and {@link QSvgGenerator#viewBoxF() viewBox}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="resolution")
    @QtBlockedSlot
    public final void setResolution(int dpi)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResolution_int(nativeId(), dpi);
    }
    @QtBlockedSlot
    native void __qt_setResolution_int(long __this__nativeId, int dpi);

/**
This property holds the size of the generated SVG drawing. By default this property is set to <tt>QSize(-1, -1)</tt>, which indicates that the generator should not output the width and height attributes of the <tt>&lt;svg&gt;</tt> element. <p><b>Note:</b> It is not possible to change this property while a {@link com.trolltech.qt.gui.QPainter QPainter} is active on the generator. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#viewBoxF() viewBox}, and {@link QSvgGenerator#resolution() resolution}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="size")
    @QtBlockedSlot
    public final void setSize(com.trolltech.qt.core.QSize size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSize_QSize(long __this__nativeId, long size);

/**
This property holds the title of the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#description() description}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="title")
    @QtBlockedSlot
    public final void setTitle(java.lang.String title)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setTitle_String(long __this__nativeId, java.lang.String title);

/**
This property holds the {@link QSvgGenerator#viewBoxF() viewBox} of the generated SVG drawing. By default this property is set to <tt>QRect(0, 0, -1, -1)</tt>, which indicates that the generator should not output the {@link QSvgGenerator#viewBoxF() viewBox} attribute of the <tt>&lt;svg&gt;</tt> element. <p><b>Note:</b> It is not possible to change this property while a {@link com.trolltech.qt.gui.QPainter QPainter} is active on the generator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgGenerator#viewBox() viewBox()}, {@link QSvgGenerator#size() size}, and {@link QSvgGenerator#resolution() resolution}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setViewBox(com.trolltech.qt.core.QRect viewBox)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewBox_QRect(nativeId(), viewBox == null ? 0 : viewBox.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewBox_QRect(long __this__nativeId, long viewBox);

/**
This property holds the {@link QSvgGenerator#viewBoxF() viewBox} of the generated SVG drawing. By default this property is set to <tt>QRect(0, 0, -1, -1)</tt>, which indicates that the generator should not output the {@link QSvgGenerator#viewBoxF() viewBox} attribute of the <tt>&lt;svg&gt;</tt> element. <p><b>Note:</b> It is not possible to change this property while a {@link com.trolltech.qt.gui.QPainter QPainter} is active on the generator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgGenerator#viewBox() viewBox()}, {@link QSvgGenerator#size() size}, and {@link QSvgGenerator#resolution() resolution}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewBox")
    @QtBlockedSlot
    public final void setViewBox(com.trolltech.qt.core.QRectF viewBox)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewBox_QRectF(nativeId(), viewBox == null ? 0 : viewBox.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewBox_QRectF(long __this__nativeId, long viewBox);

/**
This property holds the size of the generated SVG drawing. By default this property is set to <tt>QSize(-1, -1)</tt>, which indicates that the generator should not output the width and height attributes of the <tt>&lt;svg&gt;</tt> element. <p><b>Note:</b> It is not possible to change this property while a {@link com.trolltech.qt.gui.QPainter QPainter} is active on the generator. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#viewBoxF() viewBox}, and {@link QSvgGenerator#resolution() resolution}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="size")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
This property holds the title of the generated SVG drawing. <p><DT><b>See also:</b><br><DD>{@link QSvgGenerator#description() description}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="title")
    @QtBlockedSlot
    public final java.lang.String title()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
Returns {@link com.trolltech.qt.svg.QSvgGenerator#viewBoxF() viewBoxF()}.toRect(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgGenerator#setViewBox(com.trolltech.qt.core.QRect) setViewBox()}, and {@link com.trolltech.qt.svg.QSvgGenerator#viewBoxF() viewBoxF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect viewBox()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewBox(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_viewBox(long __this__nativeId);

/**
This property holds the {@link QSvgGenerator#viewBoxF() viewBox} of the generated SVG drawing. By default this property is set to <tt>QRect(0, 0, -1, -1)</tt>, which indicates that the generator should not output the {@link QSvgGenerator#viewBoxF() viewBox} attribute of the <tt>&lt;svg&gt;</tt> element. <p><b>Note:</b> It is not possible to change this property while a {@link com.trolltech.qt.gui.QPainter QPainter} is active on the generator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.svg.QSvgGenerator#viewBox() viewBox()}, {@link QSvgGenerator#size() size}, and {@link QSvgGenerator#resolution() resolution}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="viewBox")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF viewBoxF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewBoxF(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_viewBoxF(long __this__nativeId);

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native int __qt_width(long __this__nativeId);

/**
Returns the width of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int widthMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widthMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_widthMM(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int devType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_devType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_devType(long __this__nativeId);

/**
Returns the metric information for the given paint device <tt>metric</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric metric)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metric_PaintDeviceMetric(nativeId(), metric.value());
    }
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int metric);

/**
Returns a pointer to the paint engine used for drawing on the device.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
@exclude
*/

    public static native QSvgGenerator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSvgGenerator(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);
}
