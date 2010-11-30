package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPaintDevice class is the base class of objects that can be painted. A paint device is an abstraction of a two-dimensional space that can be drawn using a {@link com.trolltech.qt.gui.QPainter QPainter}. Its default coordinate system has its origin located at the top-left position. X increases to the right and Y increases downwards. The unit is one pixel. <p>The drawing capabilities of QPaintDevice are currently implemented by the {@link com.trolltech.qt.gui.QWidget QWidget}, {@link com.trolltech.qt.gui.QImage QImage}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.opengl.QGLPixelBuffer QGLPixelBuffer}, {@link com.trolltech.qt.gui.QPicture QPicture}, and {@link com.trolltech.qt.gui.QPrinter QPrinter} subclasses. <p>To implement support for a new backend, you must derive from QPaintDevice and reimplement the virtual {@link com.trolltech.qt.gui.QPaintDevice#paintEngine() paintEngine()} function to tell {@link com.trolltech.qt.gui.QPainter QPainter} which paint engine should be used to draw on this particular device. Note that you also must create a corresponding paint engine to be able to draw on the device, i.e derive from {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} and reimplement its virtual functions. <p><b>Warning:</b> Qt requires that a {@link com.trolltech.qt.gui.QApplication QApplication} object exists before any paint devices can be created. Paint devices access window system resources, and these resources are not initialized before an application object is created. <p>The QPaintDevice class provides several functions returning the various device metrics: The {@link com.trolltech.qt.gui.QPaintDevice#depth() depth()} function returns its bit depth (number of bit planes). The {@link com.trolltech.qt.gui.QPaintDevice#height() height()} function returns its height in default coordinate system units (e.g. pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}) while {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()} returns the height of the device in millimeters. Similiarily, the {@link com.trolltech.qt.gui.QPaintDevice#width() width()} and {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()} functions return the width of the device in default coordinate system units and in millimeters, respectively. Alternatively, the protected {@link com.trolltech.qt.gui.QPaintDevice#metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric) metric()} function can be used to retrieve the metric information by specifying the desired {@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric } as argument. <p>The {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} functions return the horizontal and vertical resolution of the device in dots per inch. The {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} functions also return the resolution of the device in dots per inch, but note that if the logical and vertical resolution differ, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the mapping. Finally, the {@link com.trolltech.qt.gui.QPaintDevice#numColors() numColors()} function returns the number of different colors available for the paint device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine QPaintEngine}, {@link com.trolltech.qt.gui.QPainter QPainter}, {@link <a href="../coordsys.html">The Coordinate System</a>}, and {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QPaintDevice extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QPaintDevice {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QPaintEngine paintEngine() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_paintEngine(nativeId());
        }
    }
/**
Describes the various metrics of a paint device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric) metric()}. <br></DD></DT>
*/


    public enum PaintDeviceMetric implements com.trolltech.qt.QtEnumerator {
/**
 The width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). See also {@link com.trolltech.qt.gui.QPaintDevice#width() width()}.
*/

        PdmWidth(1),
/**
 The height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). See also {@link com.trolltech.qt.gui.QPaintDevice#height() height()}.
*/

        PdmHeight(2),
/**
 The width of the paint device in millimeters. See also {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}.
*/

        PdmWidthMM(3),
/**
 The height of the paint device in millimeters. See also {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}.
*/

        PdmHeightMM(4),
/**
 The number of different colors available for the paint device. See also {@link com.trolltech.qt.gui.QPaintDevice#numColors() numColors()}.
*/

        PdmNumColors(5),
/**
 The bit depth (number of bit planes) of the paint device. See also {@link com.trolltech.qt.gui.QPaintDevice#depth() depth()}.
*/

        PdmDepth(6),
/**
 The horizontal resolution of the device in dots per inch. See also {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}.
*/

        PdmDpiX(7),
/**
 The vertical resolution of the device in dots per inch. See also {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}.
*/

        PdmDpiY(8),
/**
 The horizontal resolution of the device in dots per inch. See also {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}.
*/

        PdmPhysicalDpiX(9),
/**
 The vertical resolution of the device in dots per inch. See also {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}.
*/

        PdmPhysicalDpiY(10);

        PaintDeviceMetric(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPaintDevice$PaintDeviceMetric constant with the specified <tt>int</tt>.</brief>
*/

        public static PaintDeviceMetric resolve(int value) {
            return (PaintDeviceMetric) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return PdmWidth;
            case 2: return PdmHeight;
            case 3: return PdmWidthMM;
            case 4: return PdmHeightMM;
            case 5: return PdmNumColors;
            case 6: return PdmDepth;
            case 7: return PdmDpiX;
            case 8: return PdmDpiY;
            case 9: return PdmPhysicalDpiX;
            case 10: return PdmPhysicalDpiY;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a paint device. This constructor can be invoked only from subclasses of QPaintDevice.
*/

    public QPaintDevice(){
        super((QPrivateConstructor)null);
        __qt_QPaintDevice();
    }

    native void __qt_QPaintDevice();

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
    public abstract com.trolltech.qt.gui.QPaintEngine paintEngine();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setPainters(char painters)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPainters_char(nativeId(), painters);
    }
    @QtBlockedSlot
    native void __qt_setPainters_char(long __this__nativeId, char painters);

/**

*/

    @QtBlockedSlot
    protected final char painters()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_painters(nativeId());
    }
    @QtBlockedSlot
    native char __qt_painters(long __this__nativeId);

/**
@exclude
*/

    public static native QPaintDevice fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPaintDevice(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);
}
