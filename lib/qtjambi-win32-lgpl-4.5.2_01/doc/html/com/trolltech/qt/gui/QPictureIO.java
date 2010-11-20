package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QPictureIO class contains parameters for loading and saving pictures. QPictureIO contains a {@link com.trolltech.qt.core.QIODevice QIODevice} object that is used for picture data I/O. The programmer can install new picture file formats in addition to those that Qt provides. <p>You don't normally need to use this class; {@link com.trolltech.qt.gui.QPicture#load(com.trolltech.qt.core.QIODevice) QPicture::load()}, {@link com.trolltech.qt.gui.QPicture#save(com.trolltech.qt.core.QIODevice) QPicture::save()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPicture QPicture}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, and {@link com.trolltech.qt.core.QFile QFile}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPictureIO extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a QPictureIO object with all parameters set to zero.
*/

    public QPictureIO(){
        super((QPrivateConstructor)null);
        __qt_QPictureIO();
    }

    native void __qt_QPictureIO();

    private QPictureIO(com.trolltech.qt.core.QIODevice ioDevice, com.trolltech.qt.QNativePointer format){
        super((QPrivateConstructor)null);
        {
            __rcDevice = ioDevice;
        }
        __qt_QPictureIO_QIODevice_nativepointer(ioDevice == null ? 0 : ioDevice.nativeId(), format);
    }

    native void __qt_QPictureIO_QIODevice_nativepointer(long ioDevice, com.trolltech.qt.QNativePointer format);

    private QPictureIO(java.lang.String fileName, com.trolltech.qt.QNativePointer format){
        super((QPrivateConstructor)null);
        __qt_QPictureIO_String_nativepointer(fileName, format);
    }

    native void __qt_QPictureIO_String_nativepointer(java.lang.String fileName, com.trolltech.qt.QNativePointer format);

/**
Returns the picture description string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setDescription(java.lang.String) setDescription()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String description()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**
Returns the file name currently set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer format_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_format_private(long __this__nativeId);

/**
Returns the gamma value at which the picture will be viewed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setGamma(float) setGamma()}. <br></DD></DT>
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
Returns the IO device currently set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setIODevice(com.trolltech.qt.core.QIODevice) setIODevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice ioDevice()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ioDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_ioDevice(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer parameters_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parameters_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_parameters_private(long __this__nativeId);

/**
Returns the picture currently set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setPicture(com.trolltech.qt.gui.QPicture) setPicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPicture picture()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_picture(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPicture __qt_picture(long __this__nativeId);

/**
Returns the quality of the written picture, related to the compression ratio. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setQuality(int) setQuality()}, and {@link com.trolltech.qt.gui.QPicture#save(com.trolltech.qt.core.QIODevice) QPicture::save()}. <br></DD></DT>
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
Reads an picture into memory and returns true if the picture was successfully read; otherwise returns false. <p>Before reading an picture you must set an IO device or a file name. If both an IO device and a file name have been set, the IO device will be used. <p>Setting the picture file format string is optional. <p>Note that this function does not set the {@link com.trolltech.qt.gui.QPictureIO#format() format} used to read the picture. If you need that information, use the {@link com.trolltech.qt.gui.QPictureIO#pictureFormat(com.trolltech.qt.core.QIODevice) pictureFormat()} static functions. <p>Example: <pre class="snippet">
            QPictureIO iio = new QPictureIO();
            QPixmap  pixmap = new QPixmap();
            iio.setFileName("vegeburger.pic");
            if (iio.read()) {        // OK
                QPicture picture = iio.picture();
                QPainter painter = new QPainter(pixmap);
                painter.drawPicture(0, 0, picture);
            }
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setIODevice(com.trolltech.qt.core.QIODevice) setIODevice()}, {@link com.trolltech.qt.gui.QPictureIO#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.gui.QPictureIO#setFormat(java.lang.String) setFormat()}, {@link com.trolltech.qt.gui.QPictureIO#write() write()}, and {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) QPixmap::load()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean read()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_read(long __this__nativeId);

/**
Sets the picture description string for picture handlers that support picture descriptions to <tt>description</tt>. <p>Currently, no picture format supported by Qt uses the description string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#description() description()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDescription(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescription_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDescription_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the name of the file to read or write an picture from to <tt>fileName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#fileName() fileName()}, and {@link com.trolltech.qt.gui.QPictureIO#setIODevice(com.trolltech.qt.core.QIODevice) setIODevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileName(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String arg__1);

    @QtBlockedSlot
    private final void setFormat(com.trolltech.qt.QNativePointer arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_nativepointer(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFormat_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer arg__1);

/**
Sets the gamma value at which the picture will be viewed to <tt>gamma</tt>. If the picture format stores a gamma value for which the picture is intended to be used, then this setting will be used to modify the picture. Setting to 0.0 will disable gamma correction (i.e. any specification in the file will be ignored). <p>The default value is 0.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#gamma() gamma()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGamma(float arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGamma_float(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setGamma_float(long __this__nativeId, float arg__1);

/**
Sets the IO device to be used for reading or writing an picture. <p>Setting the IO device allows pictures to be read/written to any block-oriented {@link com.trolltech.qt.core.QIODevice QIODevice}. <p>If <tt>ioDevice</tt> is not null, this IO device will override file name settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIODevice(com.trolltech.qt.core.QIODevice arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = arg__1;
        }
        __qt_setIODevice_QIODevice(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIODevice_QIODevice(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final void setParameters(com.trolltech.qt.QNativePointer arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParameters_nativepointer(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setParameters_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer arg__1);

/**
Sets the picture to <tt>picture</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#picture() picture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPicture(com.trolltech.qt.gui.QPicture arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPicture_QPicture(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPicture_QPicture(long __this__nativeId, long arg__1);

/**
Sets the quality of the written picture to <tt>q</tt>, related to the compression ratio. <p><tt>q</tt> must be in the range -1..100. Specify 0 to obtain small compressed files, 100 for large uncompressed files. (-1 signifies the default compression.) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#quality() quality()}, and {@link com.trolltech.qt.gui.QPicture#save(com.trolltech.qt.core.QIODevice) QPicture::save()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setQuality(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuality_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setQuality_int(long __this__nativeId, int arg__1);

/**
Sets the picture IO status to <tt>status</tt>. A non-zero value indicates an error, whereas 0 means that the IO operation was successful. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#status() status()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatus(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatus_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStatus_int(long __this__nativeId, int arg__1);

/**
Returns the picture's IO status. A non-zero value indicates an error, whereas 0 means that the IO operation was successful. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setStatus(int) setStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int status()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_status(nativeId());
    }
    @QtBlockedSlot
    native int __qt_status(long __this__nativeId);

/**
Writes an picture to an IO device and returns true if the picture was successfully written; otherwise returns false. <p>Before writing an picture you must set an IO device or a file name. If both an IO device and a file name have been set, the IO device will be used. <p>The picture will be written using the specified picture format. <p>Example: <pre class="snippet">
            QPictureIO iio = new QPictureIO();
            QPicture   picture = new QPicture();
            QPainter painter = new QPainter(picture);
            painter.drawPixmap(0, 0, pixmap);
            iio.setPicture(picture);
            iio.setFileName("vegeburger.pic");
            iio.setFormat("PIC");
            if (iio.write())
                return;
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureIO#setIODevice(com.trolltech.qt.core.QIODevice) setIODevice()}, {@link com.trolltech.qt.gui.QPictureIO#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.gui.QPictureIO#setFormat(java.lang.String) setFormat()}, {@link com.trolltech.qt.gui.QPictureIO#read() read()}, and {@link com.trolltech.qt.gui.QPixmap#save(com.trolltech.qt.core.QIODevice, java.lang.String, int) QPixmap::save()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean write()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write(long __this__nativeId);

/**
Returns a sorted list of picture formats that are supported for picture input.
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> inputFormats();

/**
Returns a sorted list of picture formats that are supported for picture output.
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> outputFormats();

/**
This is an overloaded member function, provided for convenience. <p>Returns a string that specifies the picture format of the picture read from IO device <tt>d</tt>, or 0 if the device cannot be read or if the format is not recognized. <p>Make sure that <tt>d</tt> is at the right position in the device (for example, at the beginning of the file). <p><DT><b>See also:</b><br><DD>QIODevice::at(). <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray pictureFormat(com.trolltech.qt.core.QIODevice arg__1)    {
        return __qt_pictureFormat_QIODevice(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static com.trolltech.qt.core.QByteArray __qt_pictureFormat_QIODevice(long arg__1);

/**
Returns a string that specifies the picture format of the file <tt>fileName</tt>, or null if the file cannot be read or if the format is not recognized.
*/

    public native static com.trolltech.qt.core.QByteArray pictureFormat(java.lang.String fileName);

/**
@exclude
*/

    public static native QPictureIO fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPictureIO(QPrivateConstructor p) { super(p); } 

/**
Constructs a QPictureIO object with the I/O device <tt>ioDevice</tt> and a
<tt>format</tt> tag.
*/

    public QPictureIO(com.trolltech.qt.core.QIODevice ioDevice, String format) {
        this(ioDevice, QNativePointer.createCharPointer(format));
    }

/**
Constructs a QPictureIO object with the file name <tt>fileName</tt> and a
<tt>format</tt> tag.
*/

    public QPictureIO(String fileName, String format) {
        this(fileName, QNativePointer.createCharPointer(format));
    }

    // TEMPLATE - core.return_string_instead_of_char* - START
/**
Returns the picture format string or null if no format has been
explicitly set.
*/

    public final String format() {
        QNativePointer np = format_private();
        String returned = "";
        int i=0;
        while (np.byteAt(i) != 0) returned += (char) np.byteAt(i++);
        return returned;
    }
    // TEMPLATE - core.return_string_instead_of_char* - END
    // TEMPLATE - core.return_string_instead_of_char* - START
/**
Returns the picture's parameters string.
*/

    public final String parameters() {
        QNativePointer np = parameters_private();
        String returned = "";
        int i=0;
        while (np.byteAt(i) != 0) returned += (char) np.byteAt(i++);
        return returned;
    }
    // TEMPLATE - core.return_string_instead_of_char* - END
    // TEMPLATE - core.call_with_string_instead_of_char* - START
/**
Sets the picture format to <tt>format</tt> for the picture to be read or
written.
<p>
It is necessary to specify a format before writing an picture, but
it is not necessary to specify a format before reading an picture.
<p>
If no format has been set, Qt guesses the picture format before
reading it. If a format is set the picture will only be read if it
has that format.
*/

    public final void setFormat(String format) {
        setFormat(QNativePointer.createCharPointer(format));
    }
    // TEMPLATE - core.call_with_string_instead_of_char* - END
    // TEMPLATE - core.call_with_string_instead_of_char* - START
/**
Sets the picture's parameter string to <tt>parameters</tt>. This is for
picture handlers that require special parameters.
<p>
Although the current picture formats supported by Qt ignore the
parameters string, it may be used in future extensions or by
contributions (for example, JPEG).
*/

    public final void setParameters(String parameters) {
        setParameters(QNativePointer.createCharPointer(parameters));
    }
    // TEMPLATE - core.call_with_string_instead_of_char* - END

}
