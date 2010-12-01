package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QImageWriter class provides a format independent interface for writing images to files or other devices. QImageWriter supports setting format specific options, such as the gamma level, compression level and quality, prior to storing the image. If you do not need such options, you can use {@link com.trolltech.qt.gui.QImage#save(java.lang.String, java.lang.String, int) QImage::save()} or {@link com.trolltech.qt.gui.QPixmap#save(com.trolltech.qt.core.QIODevice, java.lang.String, int) QPixmap::save()} instead. <p>To store an image, you start by constructing a QImageWriter object. Pass either a file name or a device pointer, and the image format to QImageWriter's constructor. You can then set several options, such as the gamma level (by calling {@link com.trolltech.qt.gui.QImageWriter#setGamma(float) setGamma()}) and quality (by calling {@link com.trolltech.qt.gui.QImageWriter#setQuality(int) setQuality()}). {@link com.trolltech.qt.gui.QImageWriter#canWrite() canWrite()} returns true if QImageWriter can write the image (i.e., the image format is supported and the device is open for writing). Call {@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) write()} to write the image to the device. <p>If any error occurs when writing the image, {@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) write()} will return false. You can then call {@link com.trolltech.qt.gui.QImageWriter#error() error()} to find the type of error that occurred, or {@link com.trolltech.qt.gui.QImageWriter#errorString() errorString()} to get a human readable description of what went wrong. <p>Call {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() supportedImageFormats()} for a list of formats that QImageWriter can write. QImageWriter supports all built-in image formats, in addition to any image format plugins that support writing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader QImageReader}, {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler}, and {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QImageWriter extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes errors that can occur when writing images with {@link com.trolltech.qt.gui.QImageWriter QImageWriter}.
*/

    public enum ImageWriterError implements com.trolltech.qt.QtEnumerator {
/**
 An unknown error occurred. If you get this value after calling {@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) write()}, it is most likely caused by a bug in {@link com.trolltech.qt.gui.QImageWriter QImageWriter}.
*/

        UnknownError(0),
/**
 {@link com.trolltech.qt.gui.QImageWriter QImageWriter} encountered a device error when writing the image data. Consult your device for more details on what went wrong.
*/

        DeviceError(1),
/**
 Qt does not support the requested image format.
*/

        UnsupportedFormatError(2);

        ImageWriterError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QImageWriter$ImageWriterError constant with the specified <tt>int</tt>.</brief>
*/

        public static ImageWriterError resolve(int value) {
            return (ImageWriterError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnknownError;
            case 1: return DeviceError;
            case 2: return UnsupportedFormatError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty QImageWriter object. Before writing, you must call {@link com.trolltech.qt.gui.QImageWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()} to set an image format, then {@link com.trolltech.qt.gui.QImageWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()} or {@link com.trolltech.qt.gui.QImageWriter#setFileName(java.lang.String) setFileName()}.
*/

    public QImageWriter(){
        super((QPrivateConstructor)null);
        __qt_QImageWriter();
    }

    native void __qt_QImageWriter();

/**
Constructs a QImageWriter object using the device <tt>device</tt> and image format <tt>format</tt>.
*/

    public QImageWriter(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QImageWriter_QIODevice_QByteArray(device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId());
    }

    native void __qt_QImageWriter_QIODevice_QByteArray(long device, long format);


/**
Constructs a QImageWriter objects that will write to a file with the name <tt>fileName</tt>, using the image format <tt>format</tt>. If <tt>format</tt> is not provided, QImageWriter will detect the image format by inspecting the extension of <tt>fileName</tt>.
*/

    public QImageWriter(java.lang.String fileName) {
        this(fileName, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs a QImageWriter objects that will write to a file with the name <tt>fileName</tt>, using the image format <tt>format</tt>. If <tt>format</tt> is not provided, QImageWriter will detect the image format by inspecting the extension of <tt>fileName</tt>.
*/

    public QImageWriter(java.lang.String fileName, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QImageWriter_String_QByteArray(fileName, format == null ? 0 : format.nativeId());
    }

    native void __qt_QImageWriter_String_QByteArray(java.lang.String fileName, long format);

/**
Returns true if QImageWriter can write the image; i. ., the image format is supported and the assigned device is open for reading. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) write()}, {@link com.trolltech.qt.gui.QImageWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QImageWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canWrite()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canWrite(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canWrite(long __this__nativeId);

/**
Returns the compression of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setCompression(int) setCompression()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int compression()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_compression(nativeId());
    }
    @QtBlockedSlot
    native int __qt_compression(long __this__nativeId);

/**
Returns the device currently assigned to QImageWriter, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
Returns the type of error that last occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter.ImageWriterError ImageWriterError }, and {@link com.trolltech.qt.gui.QImageWriter#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImageWriter.ImageWriterError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QImageWriter.ImageWriterError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a human readable description of the last error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#error() error()}. <br></DD></DT>
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
If the currently assigned device is a {@link com.trolltech.qt.core.QFile QFile}, or if {@link com.trolltech.qt.gui.QImageWriter#setFileName(java.lang.String) setFileName()} has been called, this function returns the name of the file QImageWriter writes to. Otherwise (i.e., if no device has been assigned or the device is not a {@link com.trolltech.qt.core.QFile QFile}), an empty QString is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.gui.QImageWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
Returns the format QImageWriter uses for writing images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
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
Returns the gamma level of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setGamma(float) setGamma()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final float gamma()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_gamma(nativeId());
    }
    @QtBlockedSlot
    native float __qt_gamma(long __this__nativeId);

/**
Returns the quality level of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setQuality(int) setQuality()}. <br></DD></DT>
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
This is an image format specific function that set the compression of an image. For image formats that do not support setting the compression, this value is ignored. <p>The value range of <tt>compression</tt> depends on the image format. For example, the "tiff" format supports two values, 0(no compression) and 1(LZW-compression). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#compression() compression()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCompression(int compression)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompression_int(nativeId(), compression);
    }
    @QtBlockedSlot
    native void __qt_setCompression_int(long __this__nativeId, int compression);

/**
Sets QImageWriter's device to <tt>device</tt>. If a device has already been set, the old device is removed from QImageWriter and is otherwise left unchanged. <p>If the device is not already open, QImageWriter will attempt to open the device in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly } mode by calling open(). Note that this does not work for certain devices, such as {@link com.trolltech.qt.core.QProcess QProcess}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, where more logic is required to open the device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#device() device()}, and {@link com.trolltech.qt.gui.QImageWriter#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
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
Sets the file name of QImageWriter to <tt>fileName</tt>. Internally, QImageWriter will create a {@link com.trolltech.qt.core.QFile QFile} and open it in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly } mode, and use this file when writing images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#fileName() fileName()}, and {@link com.trolltech.qt.gui.QImageWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
Sets the format QImageWriter will use when writing images, to <tt>format</tt>. <tt>format</tt> is a case insensitive text string. Example: <pre class="snippet">
        QImageWriter writer = new QImageWriter();
        writer.setFormat(new QByteArray("png")); // same as writer.setFormat("PNG");
</pre> You can call {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() supportedImageFormats()} for the full list of formats QImageWriter supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#format() format()}. <br></DD></DT>
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
This is an image format specific function that sets the gamma level of the image to <tt>gamma</tt>. For image formats that do not support setting the gamma level, this value is ignored. <p>The value range of <tt>gamma</tt> depends on the image format. For example, the "png" format supports a gamma range from 0.0 to 1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#gamma() gamma()}, and {@link com.trolltech.qt.gui.QImageWriter#quality() quality()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGamma(float gamma)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGamma_float(nativeId(), gamma);
    }
    @QtBlockedSlot
    native void __qt_setGamma_float(long __this__nativeId, float gamma);

/**
This is an image format specific function that sets the quality level of the image to <tt>quality</tt>. For image formats that do not support setting the quality, this value is ignored. <p>The value range of <tt>quality</tt> depends on the image format. For example, the "jpeg" format supports a quality range from 0 (low quality, high compression) to 100 (high quality, low compression). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#quality() quality()}. <br></DD></DT>
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
Sets the image text associated with the key <tt>key</tt> to <tt>text</tt>. This is useful for storing copyright information or other information about the image. Example: <pre class="snippet">
        QImage image = new QImage("some/image.jpeg");
        QImageWriter writer = new QImageWriter("images/outimage.png", new QByteArray("png"));
        writer.setText("Author", "John Smith");
        writer.write(image);
</pre> If you want to store a single block of data (e.g., a comment), you can pass an empty key, or use a generic key like "Description". <p>The key and text will be embedded into the image data after calling {@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) write()}. <p>Support for this option is implemented through {@link com.trolltech.qt.gui.QImageIOHandler.ImageOption QImageIOHandler::Description }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setText(java.lang.String, java.lang.String) QImage::setText()}, and {@link com.trolltech.qt.gui.QImageReader#text(java.lang.String) QImageReader::text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String key, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String_String(nativeId(), key, text);
    }
    @QtBlockedSlot
    native void __qt_setText_String_String(long __this__nativeId, java.lang.String key, java.lang.String text);

/**
Returns true if the writer supports <tt>option</tt>; otherwise returns false. <p>Different image formats support different options. Call this function to determine whether a certain option is supported by the current format. For example, the PNG format allows you to embed text into the image's metadata (see text()). <pre class="snippet">
        QImageWriter writer = new QImageWriter(fileName);
        if (writer.supportsOption(QImageIOHandler.ImageOption.Description))
            writer.setText("Author", "John Smith");
</pre> Options can be tested after the writer has been associated with a format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageReader::supportsOption()}, and {@link com.trolltech.qt.gui.QImageWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
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
Writes the image <tt>image</tt> to the assigned device or file name. Returns true on success; otherwise returns false. If the operation fails, you can call {@link com.trolltech.qt.gui.QImageWriter#error() error()} to find the type of error that occurred, or {@link com.trolltech.qt.gui.QImageWriter#errorString() errorString()} to get a human readable description of the error. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#canWrite() canWrite()}, {@link com.trolltech.qt.gui.QImageWriter#error() error()}, and {@link com.trolltech.qt.gui.QImageWriter#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean write(com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QImage(nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write_QImage(long __this__nativeId, long image);

/**
Returns the list of image formats supported by QImageWriter. <p>By default, Qt can write the following formats: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> BMP</td><td> Windows Bitmap</td></tr><tr valign="top" class="odd"><td> JPG</td><td> Joint Photographic Experts Group</td></tr><tr valign="top" class="even"><td> JPEG</td><td> Joint Photographic Experts Group</td></tr><tr valign="top" class="odd"><td> PNG</td><td> Portable Network Graphics</td></tr><tr valign="top" class="even"><td> PPM</td><td> Portable Pixmap</td></tr><tr valign="top" class="odd"><td> TIFF</td><td> Tagged Image File Format</td></tr><tr valign="top" class="even"><td> XBM</td><td> X11 Bitmap</td></tr><tr valign="top" class="odd"><td> XPM</td><td> X11 Pixmap</td></tr></table> Reading and writing SVG files is supported through Qt's {@link <a href="../qtsvg.html">SVG Module</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}, {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()}, and {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> supportedImageFormats();

/**
@exclude
*/

    public static native QImageWriter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QImageWriter(QPrivateConstructor p) { super(p); } 
}
