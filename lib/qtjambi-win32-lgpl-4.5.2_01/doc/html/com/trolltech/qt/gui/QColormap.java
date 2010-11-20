package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QColormap class maps device independent QColors to device dependent pixel values.
*/
@QtJambiGeneratedClass
public class QColormap extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes how {@link com.trolltech.qt.gui.QColormap QColormap} maps device independent RGB values to device dependent pixel values.
*/

    public enum Mode implements com.trolltech.qt.QtEnumerator {
/**
 Pixel values are derived directly from the RGB values, also known as "True Color."
*/

        Direct(0),
/**
 Pixel values represent indexes into a vector of available colors, i. . {@link com.trolltech.qt.gui.QColormap QColormap} uses the index of the color that most closely matches an RGB value.
*/

        Indexed(1),
/**
 Similar to <tt>Indexed</tt>, pixel values represent a vector of available gray tones. {@link com.trolltech.qt.gui.QColormap QColormap} uses the index of the gray tone that most closely matches the computed gray tone of an RGB value.
*/

        Gray(2);

        Mode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QColormap$Mode constant with the specified <tt>int</tt>.</brief>
*/

        public static Mode resolve(int value) {
            return (Mode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Direct;
            case 1: return Indexed;
            case 2: return Gray;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a copy of another <tt>colormap</tt>.
*/

    public QColormap(com.trolltech.qt.gui.QColormap colormap){
        super((QPrivateConstructor)null);
        __qt_QColormap_QColormap(colormap == null ? 0 : colormap.nativeId());
    }

    native void __qt_QColormap_QColormap(long colormap);

/**
Returns a {@link com.trolltech.qt.gui.QColor QColor} for the <tt>pixel</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap#pixel(com.trolltech.qt.gui.QColor) pixel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor colorAt(int pixel)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colorAt_int(nativeId(), pixel);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_colorAt_int(long __this__nativeId, int pixel);

/**
Returns a vector of colors which represents the devices colormap for <tt>Indexed</tt> and <tt>Gray</tt> modes. This function returns an empty vector for <tt>Direct</tt> mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QColor> colormap()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colormap(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QColor> __qt_colormap(long __this__nativeId);

/**
Returns the depth of the device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap#size() size()}. <br></DD></DT>
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
Returns the mode of this colormap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap.Mode QColormap::Mode }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColormap.Mode mode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QColormap.Mode.resolve(__qt_mode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mode(long __this__nativeId);

/**
Returns a device dependent pixel value for the <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap#colorAt(int) colorAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pixel(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixel_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixel_QColor(long __this__nativeId, long color);

/**
Returns the size of the colormap for <tt>Indexed</tt> and <tt>Gray</tt> modes; Returns -1 for <tt>Direct</tt> mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColormap#colormap() colormap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static void cleanup();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static void initialize();


/**
Returns the colormap for the specified <tt>screen</tt>. If <tt>screen</tt> is -1, this function returns the colormap for the default screen.
*/

    public static com.trolltech.qt.gui.QColormap instance() {
        return instance((int)-1);
    }
/**
Returns the colormap for the specified <tt>screen</tt>. If <tt>screen</tt> is -1, this function returns the colormap for the default screen.
*/

    public native static com.trolltech.qt.gui.QColormap instance(int screen);

/**
@exclude
*/

    public static native QColormap fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QColormap(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QColormap array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QColormap clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QColormap __qt_clone(long __this_nativeId);
}
