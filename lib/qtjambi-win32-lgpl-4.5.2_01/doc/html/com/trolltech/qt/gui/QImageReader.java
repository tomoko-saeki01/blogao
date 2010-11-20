package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QImageReader class provides a format independent interface for reading images from files or other devices. The most common way to read images is through {@link com.trolltech.qt.gui.QImage QImage} and {@link com.trolltech.qt.gui.QPixmap QPixmap}'s constructors, or by calling {@link com.trolltech.qt.gui.QImage#load(java.lang.String, java.lang.String) QImage::load()} and {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) QPixmap::load()}. QImageReader is a specialized class which gives you more control when reading images. For example, you can read an image into a specific size by calling {@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}, and you can select a clip rect, effectively loading only parts of an image, by calling {@link com.trolltech.qt.gui.QImageReader#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}. Depending on the underlying support in the image format, this can save memory and speed up loading of images. <p>To read an image, you start by constructing a QImageReader object. Pass either a file name or a device pointer, and the image format to QImageReader's constructor. You can then set several options, such as the clip rect (by calling {@link com.trolltech.qt.gui.QImageReader#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}) and scaled size (by calling {@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}). {@link com.trolltech.qt.gui.QImageReader#canRead() canRead()} returns the image if the QImageReader can read the image (i.e., the image format is supported and the device is open for reading). Call {@link com.trolltech.qt.gui.QImageReader#read() read()} to read the image. <p>If any error occurs when reading the image, {@link com.trolltech.qt.gui.QImageReader#read() read()} will return a null {@link com.trolltech.qt.gui.QImage QImage}. You can then call {@link com.trolltech.qt.gui.QImageReader#error() error()} to find the type of error that occurred, or {@link com.trolltech.qt.gui.QImageReader#errorString() errorString()} to get a human readable description of what went wrong. <p>Call {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()} for a list of formats that QImageReader can read. QImageReader supports all built-in image formats, in addition to any image format plugins that support reading. <p>QImageReader autodetects the image format by default, by looking at the provided (optional) format string, the file name suffix, and the data stream contents. You can enable or disable this feature, by calling {@link com.trolltech.qt.gui.QImageReader#setAutoDetectImageFormat(boolean) setAutoDetectImageFormat()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter QImageWriter}, {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler}, and {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QImageReader extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the different types of errors that can occur when reading images with {@link com.trolltech.qt.gui.QImageReader QImageReader}.
*/

    public enum ImageReaderError implements com.trolltech.qt.QtEnumerator {
/**
 An unknown error occurred. If you get this value after calling {@link com.trolltech.qt.gui.QImageReader#read() read()}, it is most likely caused by a bug in {@link com.trolltech.qt.gui.QImageReader QImageReader}.
*/

        UnknownError(0),
/**
 {@link com.trolltech.qt.gui.QImageReader QImageReader} was used with a file name, but not file was found with that name. This can also happen if the file name contained no extension, and the file with the correct extension is not supported by Qt.
*/

        FileNotFoundError(1),
/**
 {@link com.trolltech.qt.gui.QImageReader QImageReader} encountered a device error when reading the image. You can consult your particular device for more details on what went wrong.
*/

        DeviceError(2),
/**
 Qt does not support the requested image format.
*/

        UnsupportedFormatError(3),
/**
 The image data was invalid, and {@link com.trolltech.qt.gui.QImageReader QImageReader} was unable to read an image from it. The can happen if the image file is damaged.
*/

        InvalidDataError(4);

        ImageReaderError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QImageReader$ImageReaderError constant with the specified <tt>int</tt>.</brief>
*/

        public static ImageReaderError resolve(int value) {
            return (ImageReaderError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnknownError;
            case 1: return FileNotFoundError;
            case 2: return DeviceError;
            case 3: return UnsupportedFormatError;
            case 4: return InvalidDataError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty QImageReader object. Before reading an image, call {@link com.trolltech.qt.gui.QImageReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()} or {@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()}.
*/

    public QImageReader(){
        super((QPrivateConstructor)null);
        __qt_QImageReader();
    }

    native void __qt_QImageReader();


/**
Constructs a QImageReader object with the device <tt>device</tt> and the image format <tt>format</tt>.
*/

    public QImageReader(com.trolltech.qt.core.QIODevice device) {
        this(device, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs a QImageReader object with the device <tt>device</tt> and the image format <tt>format</tt>.
*/

    public QImageReader(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QImageReader_QIODevice_QByteArray(device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId());
    }

    native void __qt_QImageReader_QIODevice_QByteArray(long device, long format);


/**
Constructs a QImageReader object with the file name <tt>fileName</tt> and the image format <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public QImageReader(java.lang.String fileName) {
        this(fileName, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs a QImageReader object with the file name <tt>fileName</tt> and the image format <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public QImageReader(java.lang.String fileName, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QImageReader_String_QByteArray(fileName, format == null ? 0 : format.nativeId());
    }

    native void __qt_QImageReader_String_QByteArray(java.lang.String fileName, long format);

/**
Returns true if image format autodetection is enabled on this image reader; otherwise returns false. By default, autodetection is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setAutoDetectImageFormat(boolean) setAutoDetectImageFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoDetectImageFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoDetectImageFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoDetectImageFormat(long __this__nativeId);

/**
Returns the background color that's used when reading an image. If the image format does not support setting the background color an invalid color is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setBackgroundColor(com.trolltech.qt.gui.QColor) setBackgroundColor()}, and {@link com.trolltech.qt.gui.QImageReader#read() read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor backgroundColor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_backgroundColor(long __this__nativeId);

/**
Returns true if an image can be read for the device (i. ., the image format is supported, and the device seems to contain valid data); otherwise returns false. <p>{@link com.trolltech.qt.gui.QImageReader#canRead() canRead()} is a lightweight function that only does a quick test to see if the image data is valid. {@link com.trolltech.qt.gui.QImageReader#read() read()} may still return false after {@link com.trolltech.qt.gui.QImageReader#canRead() canRead()} returns true, if the image data is corrupt. <p>For images that support animation, {@link com.trolltech.qt.gui.QImageReader#canRead() canRead()} returns false when all frames have been read. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#read() read()}, and {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canRead()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canRead(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canRead(long __this__nativeId);

/**
Returns the clip rect (also known as the ROI, or Region Of Interest) of the image. If no clip rect has been set, an invalid {@link com.trolltech.qt.core.QRect QRect} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect clipRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_clipRect(long __this__nativeId);

/**
For image formats that support animation, this function returns the sequence number of the current frame. Otherwise, -1 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QImageIOHandler#currentImageNumber() QImageIOHandler::currentImageNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentImageNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentImageNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentImageNumber(long __this__nativeId);

/**
For image formats that support animation, this function returns the rect for the current frame. Otherwise, a null rect is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QImageIOHandler#currentImageRect() QImageIOHandler::currentImageRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect currentImageRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentImageRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_currentImageRect(long __this__nativeId);

/**
Returns the device currently assigned to QImageReader, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
Returns the type of error that occurred last. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader.ImageReaderError ImageReaderError }, and {@link com.trolltech.qt.gui.QImageReader#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImageReader.ImageReaderError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QImageReader.ImageReaderError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a human readable description of the last error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
If the currently assigned device is a {@link com.trolltech.qt.core.QFile QFile}, or if {@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()} has been called, this function returns the name of the file QImageReader reads from. Otherwise (i.e., if no device has been assigned or the device is not a {@link com.trolltech.qt.core.QFile QFile}), an empty QString is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.gui.QImageReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Returns the format QImageReader uses for reading images. <p>You can call this function after assigning a device to the reader to determine the format of the device. For example: <pre class="snippet">
        QImageReader reader = new QImageReader("image.png");
        // reader.format() == "png"
</pre> If the reader cannot read any image from the device (e.g., there is no image there, or the image has already been read), or if the format is unsupported, this function returns an empty QByteArray(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}, and {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()}. <br></DD></DT>
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
For image formats that support animation, this function returns the total number of images in the animation. <p>Certain animation formats do not support this feature, in which case 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QImageIOHandler#imageCount() QImageIOHandler::imageCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int imageCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_imageCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_imageCount(long __this__nativeId);

/**
Returns the format of the image, without actually reading the image contents. The format describes the image format {@link com.trolltech.qt.gui.QImageReader#read() QImageReader::read()} returns, not the format of the actual image. <p>If the image format does not support this feature, this function returns an invalid format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler.ImageOption QImageIOHandler::ImageOption }, {@link com.trolltech.qt.gui.QImageIOHandler#option(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageIOHandler::option()}, and {@link com.trolltech.qt.gui.QImageIOHandler#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageIOHandler::supportsOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage.Format imageFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QImage.Format.resolve(__qt_imageFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_imageFormat(long __this__nativeId);

/**
For image formats that support animation, this function skips to the image whose sequence number is <tt>imageNumber</tt>, returning true if successful or false if the corresponding image cannot be found. <p>The next call to {@link com.trolltech.qt.gui.QImageReader#read() read()} will attempt to read this image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#jumpToNextImage() jumpToNextImage()}, and {@link com.trolltech.qt.gui.QImageIOHandler#jumpToImage(int) QImageIOHandler::jumpToImage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean jumpToImage(int imageNumber)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToImage_int(nativeId(), imageNumber);
    }
    @QtBlockedSlot
    native boolean __qt_jumpToImage_int(long __this__nativeId, int imageNumber);

/**
For image formats that support animation, this function steps over the current image, returning true if successful or false if there is no following image in the animation. <p>The default implementation calls {@link com.trolltech.qt.gui.QImageReader#read() read()}, then discards the resulting image, but the image handler may have a more efficient way of implementing this operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#jumpToImage(int) jumpToImage()}, and {@link com.trolltech.qt.gui.QImageIOHandler#jumpToNextImage() QImageIOHandler::jumpToNextImage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean jumpToNextImage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToNextImage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_jumpToNextImage(long __this__nativeId);

/**
For image formats that support animation, this function returns the number of times the animation should loop. Otherwise, it returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QImageIOHandler#loopCount() QImageIOHandler::loopCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int loopCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loopCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loopCount(long __this__nativeId);

/**
For image formats that support animation, this function returns the number of milliseconds to wait until displaying the next frame in the animation. Otherwise, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QImageIOHandler#nextImageDelay() QImageIOHandler::nextImageDelay()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int nextImageDelay()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextImageDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nextImageDelay(long __this__nativeId);

/**
Returns the quality level of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setQuality(int) setQuality()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int quality()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_quality(nativeId());
    }
    @QtBlockedSlot
    native int __qt_quality(long __this__nativeId);

/**
Reads an image from the device. On success, the image that was read is returned; otherwise, a null {@link com.trolltech.qt.gui.QImage QImage} is returned. You can then call {@link com.trolltech.qt.gui.QImageReader#error() error()} to find the type of error that occurred, or {@link com.trolltech.qt.gui.QImageReader#errorString() errorString()} to get a human readable description of the error. <p>For image formats that support animation, calling {@link com.trolltech.qt.gui.QImageReader#read() read()} repeatedly will return the next frame. When all frames have been read, a null image will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#canRead() canRead()}, {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()}, {@link com.trolltech.qt.gui.QImageReader#supportsAnimation() supportsAnimation()}, and {@link com.trolltech.qt.gui.QMovie QMovie}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage read()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_read(long __this__nativeId);

/**
Returns the scaled clip rect of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setScaledClipRect(com.trolltech.qt.core.QRect) setScaledClipRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect scaledClipRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledClipRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_scaledClipRect(long __this__nativeId);

/**
Returns the scaled size of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize scaledSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_scaledSize(long __this__nativeId);

/**
If <tt>enabled</tt> is true, image format autodetection is enabled; otherwise, it is disabled. By default, autodetection is enabled. <p>QImageReader uses an extensive approach to detecting the image format; firstly, if you pass a file name to QImageReader, it will attempt to detect the file extension if the given file name does not point to an existing file, by appending supported default extensions to the given file name, one at a time. It then uses the following approach to detect the image format: <ul><li> Image plugins are queried first, based on either the optional format string, or the file name suffix (if the source device is a file). No content detection is done at this stage. QImageReader will choose the first plugin that supports reading for this format.</li><li> If no plugin supports the image format, Qt's built-in handlers are checked based on either the optional format string, or the file name suffix.</li><li> If no capable plugins or built-in handlers are found, each plugin is tested by inspecting the content of the data stream.</li><li> If no plugins could detect the image format based on data contents, each built-in image handler is tested by inspecting the contents.</li><li> Finally, if all above approaches fail, QImageReader will report failure when trying to read the image.</li></ul> By disabling image format autodetection, QImageReader will only query the plugins and built-in handlers based on the format string (i.e., no file name extensions are tested). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#autoDetectImageFormat() autoDetectImageFormat()}, {@link com.trolltech.qt.gui.QImageIOHandler#canRead() QImageIOHandler::canRead()}, and {@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) QImageIOPlugin::capabilities()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoDetectImageFormat(boolean enabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoDetectImageFormat_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setAutoDetectImageFormat_boolean(long __this__nativeId, boolean enabled);

/**
Sets the background color to <tt>color</tt>. Image formats that support this operation are expected to initialize the background to <tt>color</tt> before reading an image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#backgroundColor() backgroundColor()}, and {@link com.trolltech.qt.gui.QImageReader#read() read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackgroundColor(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundColor_QColor(long __this__nativeId, long color);

/**
Sets the image clip rect (also known as the ROI, or Region Of Interest) to <tt>rect</tt>. The coordinates of <tt>rect</tt> are relative to the untransformed image size, as returned by {@link com.trolltech.qt.gui.QImageReader#size() size()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#clipRect() clipRect()}, {@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}, and {@link com.trolltech.qt.gui.QImageReader#setScaledClipRect(com.trolltech.qt.core.QRect) setScaledClipRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setClipRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setClipRect_QRect(long __this__nativeId, long rect);

/**
Sets QImageReader's device to <tt>device</tt>. If a device has already been set, the old device is removed from QImageReader and is otherwise left unchanged. <p>If the device is not already open, QImageReader will attempt to open the device in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly } mode by calling open(). Note that this does not work for certain devices, such as {@link com.trolltech.qt.core.QProcess QProcess}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, where more logic is required to open the device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#device() device()}, and {@link com.trolltech.qt.gui.QImageReader#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
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
Sets the file name of QImageReader to <tt>fileName</tt>. Internally, QImageReader will create a {@link com.trolltech.qt.core.QFile QFile} object and open it in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly } mode, and use this when reading images. <p>If <tt>fileName</tt> does not include a file extension (e.g., .png or .bmp), QImageReader will cycle through all supported extensions until it finds a matching file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#fileName() fileName()}, {@link com.trolltech.qt.gui.QImageReader#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileName(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String fileName);

/**
Sets the format QImageReader will use when reading images, to <tt>format</tt>. <tt>format</tt> is a case insensitive text string. Example: <pre class="snippet">
        QImageReader reader = new QImageReader();
        reader.setFormat(new QByteArray("png")); // same as reader.setFormat("PNG");
</pre> You can call {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() supportedImageFormats()} for the full list of formats QImageReader supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#format() format()}. <br></DD></DT>
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
This is an image format specific function that sets the quality level of the image to <tt>quality</tt>. For image formats that do not support setting the quality, this value is ignored. <p>The value range of <tt>quality</tt> depends on the image format. For example, the "jpeg" format supports a quality range from 0 (low quality, high compression) to 100 (high quality, low compression). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#quality() quality()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setQuality(int quality)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuality_int(nativeId(), quality);
    }
    @QtBlockedSlot
    native void __qt_setQuality_int(long __this__nativeId, int quality);

/**
Sets the scaled clip rect to <tt>rect</tt>. The scaled clip rect is the clip rect (also known as ROI, or Region Of Interest) that is applied after the image has been scaled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#scaledClipRect() scaledClipRect()}, and {@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScaledClipRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaledClipRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScaledClipRect_QRect(long __this__nativeId, long rect);

/**
Sets the scaled size of the image to <tt>size</tt>. The scaling is performed after the initial clip rect, but before the scaled clip rect is applied. The algorithm used for scaling depends on the image format. By default (i.e., if the image format does not support scaling), QImageReader will use QImage::scale() with Qt::SmoothScaling. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#scaledSize() scaledSize()}, {@link com.trolltech.qt.gui.QImageReader#setClipRect(com.trolltech.qt.core.QRect) setClipRect()}, and {@link com.trolltech.qt.gui.QImageReader#setScaledClipRect(com.trolltech.qt.core.QRect) setScaledClipRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScaledSize(com.trolltech.qt.core.QSize size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaledSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScaledSize_QSize(long __this__nativeId, long size);

/**
Returns the size of the image, without actually reading the image contents. <p>If the image format does not support this feature, this function returns an invalid size. Qt's built-in image handlers all support this feature, but custom image format plugins are not required to do so. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler.ImageOption QImageIOHandler::ImageOption }, {@link com.trolltech.qt.gui.QImageIOHandler#option(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageIOHandler::option()}, and {@link com.trolltech.qt.gui.QImageIOHandler#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageIOHandler::supportsOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
Returns true if the image format supports animation; otherwise, false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#supportedFormats() QMovie::supportedFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean supportsAnimation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsAnimation(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_supportsAnimation(long __this__nativeId);

/**
Returns true if the reader supports <tt>option</tt>; otherwise returns false. <p>Different image formats support different options. Call this function to determine whether a certain option is supported by the current format. For example, the PNG format allows you to embed text into the image's metadata (see {@link com.trolltech.qt.gui.QImageReader#text(java.lang.String) text()}), and the BMP format allows you to determine the image's size without loading the whole image into memory (see {@link com.trolltech.qt.gui.QImageReader#size() size()}). <pre class="snippet">
        QImageReader reader = new QImageReader("classpath:/image.png");
        if (reader.supportsOption(QImageIOHandler.ImageOption.Size))
            System.err.println("Size: " + reader.size());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageWriter::supportsOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption option)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsOption_ImageOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsOption_ImageOption(long __this__nativeId, int option);

/**
Returns the image text associated with <tt>key</tt>. <p>Support for this option is implemented through {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption QImageIOHandler::Description }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#textKeys() textKeys()}, and {@link com.trolltech.qt.gui.QImageWriter#setText(java.lang.String, java.lang.String) QImageWriter::setText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text(java.lang.String key)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_String(long __this__nativeId, java.lang.String key);

/**
Returns the text keys for this image. You can use these keys with {@link com.trolltech.qt.gui.QImageReader#text(java.lang.String) text()} to list the image text for a certain key. <p>Support for this option is implemented through {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption QImageIOHandler::Description }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#text(java.lang.String) text()}, {@link com.trolltech.qt.gui.QImageWriter#setText(java.lang.String, java.lang.String) QImageWriter::setText()}, and {@link com.trolltech.qt.gui.QImage#textKeys() QImage::textKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> textKeys()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textKeys(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_textKeys(long __this__nativeId);

/**
If supported, this function returns the image format of the device <tt>device</tt>. Otherwise, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#autoDetectImageFormat() QImageReader::autoDetectImageFormat()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray imageFormat(com.trolltech.qt.core.QIODevice device)    {
        return __qt_imageFormat_QIODevice(device == null ? 0 : device.nativeId());
    }
    native static com.trolltech.qt.core.QByteArray __qt_imageFormat_QIODevice(long device);

/**
If supported, this function returns the image format of the file <tt>fileName</tt>. Otherwise, an empty string is returned.
*/

    public native static com.trolltech.qt.core.QByteArray imageFormat(java.lang.String fileName);

/**
Returns the list of image formats supported by QImageReader. <p>By default, Qt can read the following formats: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> BMP</td><td> Windows Bitmap</td></tr><tr valign="top" class="odd"><td> GIF</td><td> Graphic Interchange Format (optional)</td></tr><tr valign="top" class="even"><td> JPG</td><td> Joint Photographic Experts Group</td></tr><tr valign="top" class="odd"><td> JPEG</td><td> Joint Photographic Experts Group</td></tr><tr valign="top" class="even"><td> MNG</td><td> Multiple-image Network Graphics</td></tr><tr valign="top" class="odd"><td> PNG</td><td> Portable Network Graphics</td></tr><tr valign="top" class="even"><td> PBM</td><td> Portable Bitmap</td></tr><tr valign="top" class="odd"><td> PGM</td><td> Portable Graymap</td></tr><tr valign="top" class="even"><td> PPM</td><td> Portable Pixmap</td></tr><tr valign="top" class="odd"><td> TIFF</td><td> Tagged Image File Format</td></tr><tr valign="top" class="even"><td> XBM</td><td> X11 Bitmap</td></tr><tr valign="top" class="odd"><td> XPM</td><td> X11 Pixmap</td></tr></table> Reading and writing SVG files is supported through Qt's {@link <a href="../qtsvg.html">SVG Module</a>}. <p>To configure Qt with GIF support, pass <tt>-qt-gif</tt> to the <tt>configure</tt> script or check the appropriate option in the graphical installer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}, {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()}, and {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> supportedImageFormats();

/**
@exclude
*/

    public static native QImageReader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QImageReader(QPrivateConstructor p) { super(p); } 
}
