package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QBitmap class provides monochrome (1-bit depth) pixmaps. The QBitmap class is a monochrome off-screen paint device used mainly for creating custom {@link com.trolltech.qt.gui.QCursor QCursor} and {@link com.trolltech.qt.gui.QBrush QBrush} objects, constructing {@link com.trolltech.qt.gui.QRegion QRegion} objects, and for setting masks for pixmaps and widgets. <p>QBitmap is a {@link com.trolltech.qt.gui.QPixmap QPixmap} subclass ensuring a depth of 1, except for null objects which have a depth of 0. If a pixmap with a depth greater than 1 is assigned to a bitmap, the bitmap will be dithered automatically. <p>Use the {@link com.trolltech.qt.gui.QColor QColor} objects {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } when drawing on a QBitmap object (or a {@link com.trolltech.qt.gui.QPixmap QPixmap} object with depth 1). <p>Painting with {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } sets the bitmap bits to 0, and painting with {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } sets the bits to 1. For a bitmap, 0-bits indicate background (or transparent pixels) and 1-bits indicate foreground (or opaque pixels). Use the {@link com.trolltech.qt.gui.QBitmap#clear() clear()} function to set all the bits to {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 }. Note that using the {@link com.trolltech.qt.core.Qt.GlobalColor Qt::black } and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::white } colors make no sense because the QColor::pixel() value is not necessarily 0 for black and 1 for white. <p>The QBitmap class provides the {@link com.trolltech.qt.gui.QBitmap#transformed(com.trolltech.qt.gui.QMatrix) transformed()} function returning a transformed copy of the bitmap; use the {@link com.trolltech.qt.gui.QMatrix QMatrix} argument to translate, scale, shear, and rotate the bitmap. In addition, QBitmap provides the static {@link com.trolltech.qt.gui.QBitmap#fromData(com.trolltech.qt.core.QSize, byte[], com.trolltech.qt.gui.QImage.Format) fromData()} function which returns a bitmap constructed from the given <tt>uchar</tt> data, and the static {@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) fromImage()} function returning a converted copy of a {@link com.trolltech.qt.gui.QImage QImage} object. <p>Just like the {@link com.trolltech.qt.gui.QPixmap QPixmap} class, QBitmap is optimized by the use of implicit data sharing. For more information, see the {Implicit Data Sharing} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.gui.QImage QImage}, {@link com.trolltech.qt.gui.QImageReader QImageReader}, and {@link com.trolltech.qt.gui.QImageWriter QImageWriter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBitmap extends com.trolltech.qt.gui.QPixmap
    implements java.lang.Cloneable
{

/**
Constructs a null bitmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() QPixmap::isNull()}. <br></DD></DT>
*/

    public QBitmap(){
        super((QPrivateConstructor)null);
        __qt_QBitmap();
    }

    native void __qt_QBitmap();

/**
Constructs a bitmap that is a copy of the given <tt>pixmap</tt>. <p>If the pixmap has a depth greater than 1, the resulting bitmap will be dithered automatically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#depth() QPixmap::depth()}, {@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) fromImage()}, and {@link com.trolltech.qt.gui.QBitmap#fromData(com.trolltech.qt.core.QSize, byte[], com.trolltech.qt.gui.QImage.Format) fromData()}. <br></DD></DT>
*/

    public QBitmap(com.trolltech.qt.gui.QPixmap arg__1){
        super((QPrivateConstructor)null);
        __qt_QBitmap_QPixmap(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QBitmap_QPixmap(long arg__1);

/**
Constructs a bitmap with the given <tt>size</tt>. The pixels in the bitmap are uninitialized. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap#clear() clear()}. <br></DD></DT>
*/

    public QBitmap(com.trolltech.qt.core.QSize arg__1){
        super((QPrivateConstructor)null);
        __qt_QBitmap_QSize(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QBitmap_QSize(long arg__1);

    private QBitmap(java.lang.String fileName, com.trolltech.qt.QNativePointer format){
        super((QPrivateConstructor)null);
        __qt_QBitmap_String_nativepointer(fileName, format);
    }

    native void __qt_QBitmap_String_nativepointer(java.lang.String fileName, com.trolltech.qt.QNativePointer format);

/**
Constructs a bitmap with the given <tt>width</tt> and <tt>height</tt>. The pixels inside are uninitialized. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap#clear() clear()}. <br></DD></DT>
*/

    public QBitmap(int w, int h){
        super((QPrivateConstructor)null);
        __qt_QBitmap_int_int(w, h);
    }

    native void __qt_QBitmap_int_int(int w, int h);

/**
Clears the bitmap, setting all its bits to {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 }.
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function converts the <tt>matrix</tt> to a {@link com.trolltech.qt.gui.QTransform QTransform} and calls the overloaded function.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap transformed(com.trolltech.qt.gui.QMatrix arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QMatrix(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_transformed_QMatrix(long __this__nativeId, long arg__1);

/**
Returns a copy of this bitmap, transformed according to the given <tt>matrix</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) QPixmap::transformed()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap transformed(com.trolltech.qt.gui.QTransform matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QTransform(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_transformed_QTransform(long __this__nativeId, long matrix);

    private static com.trolltech.qt.gui.QBitmap fromData(com.trolltech.qt.core.QSize size, com.trolltech.qt.QNativePointer bits, com.trolltech.qt.gui.QImage.Format monoFormat)    {
        return __qt_fromData_QSize_nativepointer_Format(size == null ? 0 : size.nativeId(), bits, monoFormat.value());
    }
    native static com.trolltech.qt.gui.QBitmap __qt_fromData_QSize_nativepointer_Format(long size, com.trolltech.qt.QNativePointer bits, int monoFormat);

/**
Returns a copy of the given <tt>image</tt> converted to a bitmap using the specified image conversion <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap#fromData(com.trolltech.qt.core.QSize, byte[], com.trolltech.qt.gui.QImage.Format) fromData()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QBitmap fromImage(com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        return __qt_fromImage_QImage_ImageConversionFlags(image == null ? 0 : image.nativeId(), flags.value());
    }
    native static com.trolltech.qt.gui.QBitmap __qt_fromImage_QImage_ImageConversionFlags(long image, int flags);

/**
@exclude
*/

    public static native QBitmap fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBitmap(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QBitmap array[]);

/**
Constructs a bitmap from the file specified by the given
<tt>fileName</tt>. If the file does not exist, or has an unknown
format, the bitmap becomes a null bitmap.
<p>
The <tt>fileName</tt> and <tt>format</tt> parameters are passed on to
the QPixmap::load() function. If the file format uses more than 1 bit
per pixel, the resulting bitmap will be dithered automatically.
*/

    public QBitmap(String fileName, String format) {
        this(fileName, format == null ? null : com.trolltech.qt.QNativePointer.createCharPointer(format));
    }

/**
This is an overloaded constructor provided for convenience.
*/

    public QBitmap(String fileName) {
        this(fileName, (String) null);
    }

/**
Returns a copy of the given <tt>image</tt> converted to a bitmap using the specified image conversion <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap#fromData(com.trolltech.qt.core.QSize, byte[], com.trolltech.qt.gui.QImage.Format) fromData()}. <br></DD></DT>
*/

    public static QBitmap fromData(com.trolltech.qt.core.QSize size, byte bits[], QImage.Format monoFormat) {
        return fromData(size, com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(bits), monoFormat);
    }

/**
Constructs a bitmap with the given <tt>size</tt>, and sets the contents to the <tt>bits</tt> supplied. <p>The bitmap data has to be byte aligned and provided in in the bit order specified by <tt>monoFormat</tt>. The mono format must be either {@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono } or {@link com.trolltech.qt.gui.QImage.Format QImage::Format_MonoLSB }. Use {@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono } to specify data on the XBM format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) fromImage()}. <br></DD></DT>
*/

    public static QBitmap fromData(com.trolltech.qt.core.QSize size, byte bits[]) {
        return fromData(size, bits, QImage.Format.Format_MonoLSB);
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QBitmap clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QBitmap __qt_clone(long __this_nativeId);
}
