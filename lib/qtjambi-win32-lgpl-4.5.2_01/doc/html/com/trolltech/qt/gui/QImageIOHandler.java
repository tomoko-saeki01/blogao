package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QImageIOHandler class defines the common image I/O interface for all image formats in Qt. Qt uses QImageIOHandler for reading and writing images through {@link com.trolltech.qt.gui.QImageReader QImageReader} and {@link com.trolltech.qt.gui.QImageWriter QImageWriter}. You can also derive from this class to write your own image format handler using Qt's plugin mechanism. <p>Call {@link com.trolltech.qt.gui.QImageIOHandler#setDevice(com.trolltech.qt.core.QIODevice) setDevice()} to assign a device to the handler, and {@link com.trolltech.qt.gui.QImageIOHandler#setFormat(com.trolltech.qt.core.QByteArray) setFormat()} to assign a format to it. One QImageIOHandler may support more than one image format. {@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()} returns true if an image can be read from the device, and {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()} and {@link com.trolltech.qt.gui.QImageIOHandler#write(com.trolltech.qt.gui.QImage) write()} return true if reading or writing an image was completed successfully. <p>QImageIOHandler also has support for animations formats, through the functions {@link com.trolltech.qt.gui.QImageIOHandler#loopCount() loopCount()}, {@link com.trolltech.qt.gui.QImageIOHandler#imageCount() imageCount()}, {@link com.trolltech.qt.gui.QImageIOHandler#nextImageDelay() nextImageDelay()} and {@link com.trolltech.qt.gui.QImageIOHandler#currentImageNumber() currentImageNumber()}. <p>In order to determine what options an image handler supports, Qt will call {@link com.trolltech.qt.gui.QImageIOHandler#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) supportsOption()} and {@link com.trolltech.qt.gui.QImageIOHandler#setOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption, java.lang.Object) setOption()}. Make sure to reimplement these functions if you can provide support for any of the options in the {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption ImageOption } enum. <p>To write your own image handler, you must at least reimplement {@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()} and {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}. Then create a {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin} that can create the handler. Finally, install your plugin, and {@link com.trolltech.qt.gui.QImageReader QImageReader} and {@link com.trolltech.qt.gui.QImageWriter QImageWriter} will then automatically load the plugin, and start using it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}, {@link com.trolltech.qt.gui.QImageReader QImageReader}, and {@link com.trolltech.qt.gui.QImageWriter QImageWriter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QImageIOHandler extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QImageIOHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean canRead() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_canRead(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean read(com.trolltech.qt.gui.QImage image) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_read_nativepointer(nativeId(), image);
        }
    }
/**
This enum describes the different options supported by {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler}. Some options are used to query an image for properties, and others are used to toggle the way in which an image should be written.
*/


    public enum ImageOption implements com.trolltech.qt.QtEnumerator {
/**
 The original size of an image. A handler that supports this option is expected to read the size of the image from the image metadata, and return this size from {@link com.trolltech.qt.gui.QImageIOHandler#option(com.trolltech.qt.gui.QImageIOHandler.ImageOption) option()} as a {@link com.trolltech.qt.core.QSize QSize}.
*/

        Size(0),
/**
 The clip rect, or ROI (Region Of Interest). A handler that supports this option is expected to only read the provided {@link com.trolltech.qt.core.QRect QRect} area from the original image in {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}, before any other transformation is applied.
*/

        ClipRect(1),
/**
 The image description. Some image formats, such as GIF and PNG, allow embedding of text or comments into the image data (e.g., for storing copyright information). It's common that the text is stored in key-value pairs, but some formats store all text in one continuous block. {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} returns the text as one QString, where keys and values are separated by a ':', and keys-value pairs are separated by two newlines (\n\n). For example, "Title: Sunset\n\nAuthor: Jim Smith\nSarah Jones\n\n". Formats that store text in a single block can use "Description" as the key.
*/

        Description(2),
/**
 The scaled clip rect (or ROI, Region Of Interest) of the image. A handler that supports this option is expected to apply the provided clip rect (a {@link com.trolltech.qt.core.QRect QRect}), after applying any scaling (ScaleSize) or regular clipping ({@link com.trolltech.qt.gui.QImageIOHandler.ImageOption ClipRect }). If the handler does not support this option, {@link com.trolltech.qt.gui.QImageReader QImageReader} will apply the scaled clip rect after the image has been read.
*/

        ScaledClipRect(3),
/**
 The scaled size of the image. A handler that supports this option is expected to scale the image to the provided size (a {@link com.trolltech.qt.core.QSize QSize}), after applying any clip rect transformation ({@link com.trolltech.qt.gui.QImageIOHandler.ImageOption ClipRect }). If the handler does not support this option, {@link com.trolltech.qt.gui.QImageReader QImageReader} will perform the scaling after the image has been read.
*/

        ScaledSize(4),
/**
 The compression ratio of the image data. A handler that supports this option is expected to set its compression rate depending on the value of this option (an int) when writing.
*/

        CompressionRatio(5),
/**
 The gamma level of the image. A handler that supports this option is expected to set the image gamma level depending on the value of this option (a float) when writing.
*/

        Gamma(6),
/**
 The quality level of the image. A handler that supports this option is expected to set the image quality level depending on the value of this option (an int) when writing.
*/

        Quality(7),
/**
 The name of the image. A handler that supports this option is expected to read the name from the image metadata and return this as a QString, or when writing an image it is expected to store the name in the image metadata.
*/

        Name(8),
/**
 The subtype of the image. A handler that supports this option can use the subtype value to help when reading and writing images. For example, a PPM handler may have a subtype value of "ppm" or "ppmraw".
*/

        SubType(9),
/**
 A handler that supports this option is expected to read the image in several passes, as if it was an animation. {@link com.trolltech.qt.gui.QImageReader QImageReader} will treat the image as an animation.
*/

        IncrementalReading(10),
/**
 The endianness of the image. Certain image formats can be stored as BigEndian or LittleEndian. A handler that supports Endianness uses the value of this option to determine how the image should be stored.
*/

        Endianness(11),
/**
 Image formats that support animation return true for this value in {@link com.trolltech.qt.gui.QImageIOHandler#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) supportsOption()}; otherwise, false is returned.
*/

        Animation(12),
/**
 Certain image formats allow the background color to be specified. A handler that supports {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption BackgroundColor } initializes the background color to this option (a {@link com.trolltech.qt.gui.QColor QColor}) when reading an image.
*/

        BackgroundColor(13),
        ImageFormat(14);

        ImageOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QImageIOHandler$ImageOption constant with the specified <tt>int</tt>.</brief>
*/

        public static ImageOption resolve(int value) {
            return (ImageOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Size;
            case 1: return ClipRect;
            case 2: return Description;
            case 3: return ScaledClipRect;
            case 4: return ScaledSize;
            case 5: return CompressionRatio;
            case 6: return Gamma;
            case 7: return Quality;
            case 8: return Name;
            case 9: return SubType;
            case 10: return IncrementalReading;
            case 11: return Endianness;
            case 12: return Animation;
            case 13: return BackgroundColor;
            case 14: return ImageFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QImageIOHandler object.
*/

    public QImageIOHandler(){
        super((QPrivateConstructor)null);
        __qt_QImageIOHandler();
    }

    native void __qt_QImageIOHandler();

/**
Returns the device currently assigned to the QImageIOHandler. If not device has been assigned, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_device(long __this__nativeId);

/**
Returns the format that is currently assigned to QImageIOHandler. If no format has been assigned, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_format(long __this__nativeId);

/**
Sets the device of the QImageIOHandler to <tt>device</tt>. The image handler will use this device when reading and writing images. <p>The device can only be set once and must be set before calling {@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()}, {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}, {@link com.trolltech.qt.gui.QImageIOHandler#write(com.trolltech.qt.gui.QImage) write()}, etc. If you need to read multiple files, construct multiple instances of the appropriate QImageIOHandler subclass. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#device() device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice device)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = device;
        }
        __qt_setDevice_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDevice_QIODevice(long __this__nativeId, long device);

/**
Sets the format of the QImageIOHandler to <tt>format</tt>. The format is most useful for handlers that support multiple image formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.core.QByteArray format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QByteArray(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QByteArray(long __this__nativeId, long format);

/**
Returns true if an image can be read from the device (i. ., the image format is supported, the device can be read from and the initial header information suggests that the image can be read); otherwise returns false. <p>When reimplementing {@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()}, make sure that the I/O device ({@link com.trolltech.qt.gui.QImageIOHandler#device() device()}) is left in its original state (e.g., by using peek() rather than {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}, and {@link com.trolltech.qt.core.QIODevice#peek(long) QIODevice::peek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean canRead();
    @QtBlockedSlot
    native boolean __qt_canRead(long __this__nativeId);

/**
For image formats that support animation, this function returns the sequence number of the current image in the animation. If this function is called before any image is {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}, -1 is returned. The number of the first image in the sequence is 0. <p>If the image format does not support animation, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int currentImageNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentImageNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentImageNumber(long __this__nativeId);

/**
Returns the rect of the current image. If no rect is defined for the image, and empty QRect() is returned. <p>This function is useful for animations, where only parts of the frame may be updated at a time.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect currentImageRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentImageRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_currentImageRect(long __this__nativeId);

/**
For image formats that support animation, this function returns the number of images in the animation. If the image format does not support animation, or if it is unable to determine the number of images, 0 is returned. <p>The default implementation returns 1 if {@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()} returns true; otherwise 0 is returned.
*/

    @QtBlockedSlot
    public int imageCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_imageCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_imageCount(long __this__nativeId);

/**
For image formats that support animation, this function jumps to the image whose sequence number is <tt>imageNumber</tt>. The next call to {@link com.trolltech.qt.gui.QImageIOHandler#read(com.trolltech.qt.gui.QImage) read()} will attempt to read this image. <p>The default implementation does nothing, and returns false.
*/

    @QtBlockedSlot
    public boolean jumpToImage(int imageNumber)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToImage_int(nativeId(), imageNumber);
    }
    @QtBlockedSlot
    native boolean __qt_jumpToImage_int(long __this__nativeId, int imageNumber);

/**
For image formats that support animation, this function jumps to the next image. <p>The default implementation does nothing, and returns false.
*/

    @QtBlockedSlot
    public boolean jumpToNextImage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToNextImage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_jumpToNextImage(long __this__nativeId);

/**
For image formats that support animation, this function returns the number of times the animation should loop. If the image format does not support animation, 0 is returned.
*/

    @QtBlockedSlot
    public int loopCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loopCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loopCount(long __this__nativeId);

/**
For image formats that support animation, this function returns the number of milliseconds to wait until reading the next image. If the image format does not support animation, 0 is returned.
*/

    @QtBlockedSlot
    public int nextImageDelay()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextImageDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nextImageDelay(long __this__nativeId);

/**
Returns the value assigned to <tt>option</tt> as a {@link com.trolltech.qt.QVariant QVariant}. The type of the value depends on the option. For example, option(Size) returns a {@link com.trolltech.qt.core.QSize QSize} variant. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#setOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption, java.lang.Object) setOption()}, and {@link com.trolltech.qt.gui.QImageIOHandler#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) supportsOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object option(com.trolltech.qt.gui.QImageIOHandler.ImageOption option)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_option_ImageOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_option_ImageOption(long __this__nativeId, int option);

/**
Read an image from the device, and stores it in <tt>image</tt>. Returns true if the image is successfully read; otherwise returns false. <p>For image formats that support incremental loading, and for animation formats, the image handler can assume that <tt>image</tt> points to the previous frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#canRead() canRead()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean read(com.trolltech.qt.gui.QImage image);
    @QtBlockedSlot
    native boolean __qt_read_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QImage image);

/**
Sets the option <tt>option</tt> with the value <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#option(com.trolltech.qt.gui.QImageIOHandler.ImageOption) option()}, and {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption ImageOption }. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption option, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_ImageOption_Object(nativeId(), option.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setOption_ImageOption_Object(long __this__nativeId, int option, java.lang.Object value);

/**
Returns true if the QImageIOHandler supports the option <tt>option</tt>; otherwise returns false. For example, if the QImageIOHandler supports the {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption Size } option, supportsOption(Size) must return true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler#setOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption, java.lang.Object) setOption()}, and {@link com.trolltech.qt.gui.QImageIOHandler#option(com.trolltech.qt.gui.QImageIOHandler.ImageOption) option()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption option)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsOption_ImageOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsOption_ImageOption(long __this__nativeId, int option);

/**
Writes the image <tt>image</tt> to the assigned device. Returns true on success; otherwise returns false. <p>The default implementation does nothing, and simply returns false.
*/

    @QtBlockedSlot
    public boolean write(com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QImage(nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write_QImage(long __this__nativeId, long image);

/**
@exclude
*/

    public static native QImageIOHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QImageIOHandler(QPrivateConstructor p) { super(p); } 
}
