package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} class is the base class of objects that can be painted. A paint device is an abstraction of a two-dimensional space that can be drawn using a {@link com.trolltech.qt.gui.QPainter QPainter}. Its default coordinate system has its origin located at the top-left position. X increases to the right and Y increases downwards. The unit is one pixel. <p>The drawing capabilities of {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} are currently implemented by the {@link com.trolltech.qt.gui.QWidget QWidget}, {@link com.trolltech.qt.gui.QImage QImage}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.opengl.QGLPixelBuffer QGLPixelBuffer}, {@link com.trolltech.qt.gui.QPicture QPicture}, and {@link com.trolltech.qt.gui.QPrinter QPrinter} subclasses. <p>To implement support for a new backend, you must derive from {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} and reimplement the virtual {@link com.trolltech.qt.gui.QPaintDevice#paintEngine() paintEngine()} function to tell {@link com.trolltech.qt.gui.QPainter QPainter} which paint engine should be used to draw on this particular device. Note that you also must create a corresponding paint engine to be able to draw on the device, i.e derive from {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} and reimplement its virtual functions. <p><b>Warning:</b> Qt requires that a {@link com.trolltech.qt.gui.QApplication QApplication} object exists before any paint devices can be created. Paint devices access window system resources, and these resources are not initialized before an application object is created. <p>The {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} class provides several functions returning the various device metrics: The {@link com.trolltech.qt.gui.QPaintDevice#depth() depth()} function returns its bit depth (number of bit planes). The {@link com.trolltech.qt.gui.QPaintDevice#height() height()} function returns its height in default coordinate system units (e.g. pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}) while {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()} returns the height of the device in millimeters. Similiarily, the {@link com.trolltech.qt.gui.QPaintDevice#width() width()} and {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()} functions return the width of the device in default coordinate system units and in millimeters, respectively. Alternatively, the protected {@link com.trolltech.qt.gui.QPaintDevice#metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric) metric()} function can be used to retrieve the metric information by specifying the desired {@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric } as argument. <p>The {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} functions return the horizontal and vertical resolution of the device in dots per inch. The {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} functions also return the resolution of the device in dots per inch, but note that if the logical and vertical resolution differ, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the mapping. Finally, the {@link com.trolltech.qt.gui.QPaintDevice#numColors() numColors()} function returns the number of different colors available for the paint device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine QPaintEngine}, {@link com.trolltech.qt.gui.QPainter QPainter}, {@link <a href="../coordsys.html">The Coordinate System</a>}, and {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QPaintDeviceInterface extends QtJambiInterface
{

/**
Returns the bit depth (number of bit planes) of the paint device.
*/

    @QtBlockedSlot
    public int depth();

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int height();

/**
Returns the height of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int heightMM();

/**
Returns the horizontal resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int logicalDpiX();

/**
Returns the vertical resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int logicalDpiY();

/**
Returns the number of different colors available for the paint device. Since this value is an int, it will not be sufficient to represent the number of colors on 32 bit displays, in this case INT_MAX is returned instead.
*/

    @QtBlockedSlot
    public int numColors();

/**
Returns true if the device is currently being painted on, i. . someone has called {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} but not yet called {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for this device; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() QPainter::isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean paintingActive();

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int physicalDpiX();

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int physicalDpiY();

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int width();

/**
Returns the width of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int widthMM();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int devType();

/**
Returns the metric information for the given paint device <tt>metric</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric metric);

/**
Returns a pointer to the paint engine used for drawing on the device.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QPaintDevice(long ptr);
}
