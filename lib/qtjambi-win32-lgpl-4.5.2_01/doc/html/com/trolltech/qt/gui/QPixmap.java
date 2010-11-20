package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.core.Qt;


/**
The QPixmap class is an off-screen image representation that can be used as a paint device. Qt provides four classes for handling image data: {@link com.trolltech.qt.gui.QImage QImage}, QPixmap, {@link com.trolltech.qt.gui.QBitmap QBitmap} and {@link com.trolltech.qt.gui.QPicture QPicture}. {@link com.trolltech.qt.gui.QImage QImage} is designed and optimized for I/O, and for direct pixel access and manipulation, while QPixmap is designed and optimized for showing images on screen. {@link com.trolltech.qt.gui.QBitmap QBitmap} is only a convenience class that inherits QPixmap, ensuring a depth of 1. The {@link com.trolltech.qt.gui.QPixmap#isQBitmap() isQBitmap()} function returns true if a QPixmap object is really a bitmap, otherwise returns false. Finally, the {@link com.trolltech.qt.gui.QPicture QPicture} class is a paint device that records and replays {@link com.trolltech.qt.gui.QPainter QPainter} commands. <p>A QPixmap can easily be displayed on the screen using {@link com.trolltech.qt.gui.QLabel QLabel} or one of {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}'s subclasses (such as {@link com.trolltech.qt.gui.QPushButton QPushButton} and {@link com.trolltech.qt.gui.QToolButton QToolButton}). {@link com.trolltech.qt.gui.QLabel QLabel} has a pixmap property, whereas {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} has an icon property. And because QPixmap is a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} subclass, {@link com.trolltech.qt.gui.QPainter QPainter} can be used to draw directly onto pixmaps. <p>In addition to the ordinary constructors, a QPixmap can be constructed using the static {@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()} and {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} functions which creates a QPixmap and paints the given widget, or window, in it. <p>Note that the pixel data in a pixmap is internal and is managed by the underlying window system. Pixels can only be accessed through {@link com.trolltech.qt.gui.QPainter QPainter} functions or by converting the QPixmap to a {@link com.trolltech.qt.gui.QImage QImage}. Depending on the system, QPixmap is stored using a RGB32 or a premultiplied alpha format. If the image has an alpha channel, and if the system allows, the preferred format is premultiplied alpha. Note also that QPixmap, unlike {@link com.trolltech.qt.gui.QImage QImage}, may be hardware dependent. On X11 and Mac, a QPixmap is stored on the server side while a {@link com.trolltech.qt.gui.QImage QImage} is stored on the client side (on Windows, these two classes have an equivalent internal representation, i.e. both {@link com.trolltech.qt.gui.QImage QImage} and QPixmap are stored on the client side and don't use any GDI resources). <p>There are functions to convert between {@link com.trolltech.qt.gui.QImage QImage} and QPixmap. Typically, the {@link com.trolltech.qt.gui.QImage QImage} class is used to load an image file, optionally manipulating the image data, before the {@link com.trolltech.qt.gui.QImage QImage} object is converted into a QPixmap to be shown on screen. Alternatively, if no manipulation is desired, the image file can be loaded directly into a QPixmap. On Windows, the QPixmap class also supports conversion between <tt>HBITMAP</tt> and QPixmap. <p>QPixmap provides a collection of functions that can be used to obtain a variety of information about the pixmap. In addition, there are several functions that enables transformation of the pixmap. <p>QPixmap objects can be passed around by value since the QPixmap class uses implicit data sharing. For more information, see the {@link <a href="../shared.html">Implicit Data Sharing</a>} documentation. QPixmap objects can also be streamed. <ul><li> {@link <a href="#reading-and-writing-image-files">Reading and Writing Image Files</a>}</li><li> {@link <a href="#pixmap-information">Pixmap Information</a>}</li><li> {@link <a href="#pixmap-conversion">Pixmap Conversion</a>}</li><li> {@link <a href="#pixmap-transformations">Pixmap Transformations</a>}</li></ul><a name="reading-and-writing-image-files"><h2>Reading and Writing Image Files</h2> QPixmap provides several ways of reading an image file: The file can be loaded when constructing the QPixmap object, or by using the {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()} or {@link com.trolltech.qt.gui.QPixmap#loadFromData(byte[], java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) loadFromData()} functions later on. When loading an image, the file name can either refer to an actual file on disk or to one of the application's embedded resources. See {@link <a href="../resources.html">The Qt Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Simply call the {@link com.trolltech.qt.gui.QPixmap#save(com.trolltech.qt.core.QIODevice, java.lang.String, int) save()} function to save a QPixmap object. <p>The complete list of supported file formats are available through the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions. New file formats can be added as plugins. By default, Qt supports the following formats: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Description</center></th><th><center> Qt's support</center></th></tr></thead><tr valign="top" class="even"><td> BMP</td><td> Windows Bitmap</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> GIF</td><td> Graphic Interchange Format (optional)</td><td> Read</td></tr><tr valign="top" class="even"><td> JPG</td><td> Joint Photographic Experts Group</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> JPEG</td><td> Joint Photographic Experts Group</td><td> Read/write</td></tr><tr valign="top" class="even"><td> PNG</td><td> Portable Network Graphics</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> PBM</td><td> Portable Bitmap</td><td> Read</td></tr><tr valign="top" class="even"><td> PGM</td><td> Portable Graymap</td><td> Read</td></tr><tr valign="top" class="odd"><td> PPM</td><td> Portable Pixmap</td><td> Read/write</td></tr><tr valign="top" class="even"><td> XBM</td><td> X11 Bitmap</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> XPM</td><td> X11 Pixmap</td><td> Read/write</td></tr></table><a name="pixmap-information"><h2>Pixmap Information</h2> QPixmap provides a collection of functions that can be used to obtain a variety of information about the pixmap: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center></center></th><th><center> Available Functions</center></th></tr></thead><tr valign="top" class="even"><td> Geometry</td><td> The {@link com.trolltech.qt.gui.QPixmap#size() size()}, {@link com.trolltech.qt.gui.QPixmap#width() width()} and {@link com.trolltech.qt.gui.QPixmap#height() height()} functions provide information about the pixmap's size. The {@link com.trolltech.qt.gui.QPixmap#rect() rect()} function returns the image's enclosing rectangle.</td></tr><tr valign="top" class="odd"><td> Alpha component</td><td> The {@link com.trolltech.qt.gui.QPixmap#hasAlphaChannel() hasAlphaChannel()} returns true if the pixmap has a format that respects the alpha channel, otherwise returns false, while the {@link com.trolltech.qt.gui.QPixmap#hasAlpha() hasAlpha()} function returns true if the pixmap has an alpha channel or a mask (otherwise false). <p>The {@link com.trolltech.qt.gui.QPixmap#alphaChannel() alphaChannel()} function returns the alpha channel as a new QPixmap object, while the {@link com.trolltech.qt.gui.QPixmap#mask() mask()} function returns the mask as a {@link com.trolltech.qt.gui.QBitmap QBitmap} object. The alpha channel and mask can be set using the {@link com.trolltech.qt.gui.QPixmap#setAlphaChannel(com.trolltech.qt.gui.QPixmap) setAlphaChannel()} and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) setMask()} functions, respectively.</td></tr><tr valign="top" class="even"><td> Low-level information</td><td> The {@link com.trolltech.qt.gui.QPixmap#depth() depth()} function returns the depth of the pixmap. The {@link com.trolltech.qt.gui.QPixmap#defaultDepth() defaultDepth()} function returns the default depth, i.e. the depth used by the application on the given screen. <p>The {@link com.trolltech.qt.gui.QPixmap#cacheKey() cacheKey()} function returns a number that uniquely identifies the contents of the QPixmap object. <p>The x11Info() function returns information about the configuration of the X display used to display the widget. The x11PictureHandle() function returns the X11 Picture handle of the pixmap for XRender support. Note that the two latter functions are only available on x11.</td></tr></table><a name="pixmap-conversion"><h2>Pixmap Conversion</h2> A QPixmap object can be converted into a {@link com.trolltech.qt.gui.QImage QImage} using the {@link com.trolltech.qt.gui.QPixmap#toImage() toImage()} function. Likewise, a {@link com.trolltech.qt.gui.QImage QImage} can be converted into a QPixmap using the {@link com.trolltech.qt.gui.QPixmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlag[]) fromImage()}. If this is too expensive an operation, you can use {@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) QBitmap::fromImage()} instead. <p>In addition, on Windows, the QPixmap class supports conversion to and from HBitmap: the toWinHBITMAP() function creates a HBITMAP equivalent to the QPixmap, based on the given {@link com.trolltech.qt.gui.QPixmap.HBitmapFormat HBitmapFormat }, and returns the HBITMAP handle. The fromWinHBITMAP() function returns a QPixmap that is equivalent to the given bitmap which has the specified format.<a name="pixmap-transformations"><h2>Pixmap Transformations</h2> QPixmap supports a number of functions for creating a new pixmap that is a transformed version of the original: The {@link com.trolltech.qt.gui.QPixmap#createHeuristicMask() createHeuristicMask()} function creates and returns a 1-bpp heuristic mask (i.e. a {@link com.trolltech.qt.gui.QBitmap QBitmap}) for this pixmap. It works by selecting a color from one of the corners and then chipping away pixels of that color, starting at all the edges. The {@link com.trolltech.qt.gui.QPixmap#createMaskFromColor(com.trolltech.qt.gui.QColor) createMaskFromColor()} function creates and returns a mask (i.e. a {@link com.trolltech.qt.gui.QBitmap QBitmap}) for the pixmap based on a given color. <p>The {@link com.trolltech.qt.gui.QPixmap#scaled(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) scaled()}, {@link com.trolltech.qt.gui.QPixmap#scaledToWidth(int) scaledToWidth()} and {@link com.trolltech.qt.gui.QPixmap#scaledToHeight(int) scaledToHeight()} functions return scaled copies of the pixmap, while the {@link com.trolltech.qt.gui.QPixmap#copy() copy()} function creates a QPixmap that is a plain copy of the original one. <p>The {@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) transformed()} function returns a copy of the pixmap that is transformed with the given transformation matrix and transformation mode: Internally, the transformation matrix is adjusted to compensate for unwanted translation, i.e. {@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) transformed()} returns the smallest pixmap containing all transformed points of the original pixmap. The static {@link com.trolltech.qt.gui.QPixmap#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function returns the actual matrix used for transforming the pixmap. <p>There are also functions for changing attributes of a pixmap. in-place: The {@link com.trolltech.qt.gui.QPixmap#fill() fill()} function fills the entire image with the given color, the {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) setMask()} function sets a mask bitmap, and the {@link com.trolltech.qt.gui.QPixmap#setAlphaChannel(com.trolltech.qt.gui.QPixmap) setAlphaChannel()} function sets the pixmap's alpha channel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBitmap QBitmap}, {@link com.trolltech.qt.gui.QImage QImage}, {@link com.trolltech.qt.gui.QImageReader QImageReader}, and {@link com.trolltech.qt.gui.QImageWriter QImageWriter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPixmap extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}. <br></DD></DT>
*/

    public QPixmap(){
        super((QPrivateConstructor)null);
        __qt_QPixmap();
    }

    native void __qt_QPixmap();

/**
Constructs a pixmap that is a copy of the given <tt>pixmap</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#copy() copy()}. <br></DD></DT>
*/

    public QPixmap(com.trolltech.qt.gui.QPixmap arg__1){
        super((QPrivateConstructor)null);
        __qt_QPixmap_QPixmap(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QPixmap_QPixmap(long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Constructs a pixmap of the given <tt>size</tt>. <p><b>Warning:</b> This will create a QPixmap with uninitialized data. Call {@link com.trolltech.qt.gui.QPixmap#fill() fill()} to fill the pixmap with an appropriate color before drawing onto it with {@link com.trolltech.qt.gui.QPainter QPainter}.
*/

    public QPixmap(com.trolltech.qt.core.QSize arg__1){
        super((QPrivateConstructor)null);
        __qt_QPixmap_QSize(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QPixmap_QSize(long arg__1);


    private QPixmap(java.lang.String fileName, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        this(fileName, format, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }
    private QPixmap(java.lang.String fileName, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlags flags){
        super((QPrivateConstructor)null);
        __qt_QPixmap_String_nativepointer_ImageConversionFlags(fileName, format, flags.value());
    }

    native void __qt_QPixmap_String_nativepointer_ImageConversionFlags(java.lang.String fileName, com.trolltech.qt.QNativePointer format, int flags);

    private QPixmap(com.trolltech.qt.QNativePointer xpm){
        super((QPrivateConstructor)null);
        __qt_QPixmap_nativepointer(xpm);
    }

    native void __qt_QPixmap_nativepointer(com.trolltech.qt.QNativePointer xpm);

/**
Constructs a pixmap with the given <tt>width</tt> and <tt>height</tt>. If either <tt>width</tt> or <tt>height</tt> is zero, a null pixmap is constructed. <p><b>Warning:</b> This will create a QPixmap with uninitialized data. Call {@link com.trolltech.qt.gui.QPixmap#fill() fill()} to fill the pixmap with an appropriate color before drawing onto it with {@link com.trolltech.qt.gui.QPainter QPainter}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}. <br></DD></DT>
*/

    public QPixmap(int w, int h){
        super((QPrivateConstructor)null);
        __qt_QPixmap_int_int(w, h);
    }

    native void __qt_QPixmap_int_int(int w, int h);

/**
Returns the alpha channel of the pixmap as a new grayscale QPixmap in which each pixel's red, green, and blue values are given the alpha value of the original pixmap. The color depth of the returned pixmap is the system depth on X11 and 8-bit on Windows and Mac OS X. <p>You can use this function while debugging to get a visible image of the alpha channel. If the pixmap doesn't have an alpha channel, i.e., the alpha channel's value for all pixels equals 0xff), a null pixmap is returned. You can check this with the <tt>isNull()</tt> function. <p>We show an example: <pre class="snippet">
    pixmap = QPixmap(100, 100);
    pixmap.fill(Qt::transparent);

    QRadialGradient gradient(50, 50, 50, 50, 50);
    gradient.setColorAt(0, QColor::fromRgbF(1, 0, 0, 1));
    gradient.setColorAt(1, QColor::fromRgbF(0, 0, 0, 0));
    QPainter painter(&pixmap);
    painter.fillRect(0, 0, 100, 100, gradient);

    channelImage = pixmap.alphaChannel();
    update();
</pre> <br><center><img src="../images/alphachannelimage.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#setAlphaChannel(com.trolltech.qt.gui.QPixmap) setAlphaChannel()}, and Pixmap Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap alphaChannel()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alphaChannel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_alphaChannel(long __this__nativeId);

/**
Returns a number that identifies this QPixmap. Distinct QPixmap objects can only have the same cache key if they refer to the same contents. <p>The {@link com.trolltech.qt.gui.QPixmap#cacheKey() cacheKey()} will change when the pixmap is altered.
*/

    @QtBlockedSlot
    public final long cacheKey()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cacheKey(nativeId());
    }
    @QtBlockedSlot
    native long __qt_cacheKey(long __this__nativeId);


/**
Returns a deep copy of the subset of the pixmap that is specified by the given <tt>rectangle</tt>. For more information on deep copies, see the {@link <a href="../shared.html">Implicit Data Sharing</a>} documentation. <p>If the given <tt>rectangle</tt> is empty, the whole image is copied. <p><DT><b>See also:</b><br><DD>operator=(), QPixmap(), and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap copy() {
        return copy((com.trolltech.qt.core.QRect)new com.trolltech.qt.core.QRect());
    }
/**
Returns a deep copy of the subset of the pixmap that is specified by the given <tt>rectangle</tt>. For more information on deep copies, see the {@link <a href="../shared.html">Implicit Data Sharing</a>} documentation. <p>If the given <tt>rectangle</tt> is empty, the whole image is copied. <p><DT><b>See also:</b><br><DD>operator=(), QPixmap(), and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap copy(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_copy_QRect(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>Returns a deep copy of the subset of the pixmap that is specified by the rectangle {@link com.trolltech.qt.core.QRect QRect}( <tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap copy(int x, int y, int width, int height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_int_int_int_int(nativeId(), x, y, width, height);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_copy_int_int_int_int(long __this__nativeId, int x, int y, int width, int height);


/**
Creates and returns a heuristic mask for this pixmap. <p>The function works by selecting a color from one of the corners and then chipping away pixels of that color, starting at all the edges. If <tt>clipTight</tt> is true (the default) the mask is just large enough to cover the pixels; otherwise, the mask is larger than the data pixels. <p>The mask may not be perfect but it should be reasonable, so you can do things such as the following: <pre class="snippet">
        QPixmap myPixmap = new QPixmap();
        myPixmap.setMask(myPixmap.createHeuristicMask());
</pre> This function is slow because it involves converting to/from a {@link com.trolltech.qt.gui.QImage QImage}, and non-trivial computations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createHeuristicMask() QImage::createHeuristicMask()}, and {@link com.trolltech.qt.gui.QPixmap#createMaskFromColor(com.trolltech.qt.gui.QColor) createMaskFromColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap createHeuristicMask() {
        return createHeuristicMask((boolean)true);
    }
/**
Creates and returns a heuristic mask for this pixmap. <p>The function works by selecting a color from one of the corners and then chipping away pixels of that color, starting at all the edges. If <tt>clipTight</tt> is true (the default) the mask is just large enough to cover the pixels; otherwise, the mask is larger than the data pixels. <p>The mask may not be perfect but it should be reasonable, so you can do things such as the following: <pre class="snippet">
        QPixmap myPixmap = new QPixmap();
        myPixmap.setMask(myPixmap.createHeuristicMask());
</pre> This function is slow because it involves converting to/from a {@link com.trolltech.qt.gui.QImage QImage}, and non-trivial computations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createHeuristicMask() QImage::createHeuristicMask()}, and {@link com.trolltech.qt.gui.QPixmap#createMaskFromColor(com.trolltech.qt.gui.QColor) createMaskFromColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap createHeuristicMask(boolean clipTight)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createHeuristicMask_boolean(nativeId(), clipTight);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_createHeuristicMask_boolean(long __this__nativeId, boolean clipTight);

/**
This is an overloaded member function, provided for convenience. <p>Creates and returns a mask for this pixmap based on the given <tt>maskColor</tt>. Same as calling createMaskFromColor(maskColor, {@link com.trolltech.qt.core.Qt.MaskMode Qt::MaskInColor }) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#createHeuristicMask() createHeuristicMask()}, and {@link com.trolltech.qt.gui.QImage#createMaskFromColor(int) QImage::createMaskFromColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap createMaskFromColor(com.trolltech.qt.gui.QColor maskColor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createMaskFromColor_QColor(nativeId(), maskColor == null ? 0 : maskColor.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_createMaskFromColor_QColor(long __this__nativeId, long maskColor);

/**
Creates and returns a mask for this pixmap based on the given <tt>maskColor</tt>. If the <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.MaskMode Qt::MaskInColor }, all pixels matching the maskColor will be opaque. If <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.MaskMode Qt::MaskOutColor }, all pixels matching the maskColor will be transparent. <p>This function is slow because it involves converting to/from a {@link com.trolltech.qt.gui.QImage QImage}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#createHeuristicMask() createHeuristicMask()}, and {@link com.trolltech.qt.gui.QImage#createMaskFromColor(int) QImage::createMaskFromColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap createMaskFromColor(com.trolltech.qt.gui.QColor maskColor, com.trolltech.qt.core.Qt.MaskMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createMaskFromColor_QColor_MaskMode(nativeId(), maskColor == null ? 0 : maskColor.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_createMaskFromColor_QColor_MaskMode(long __this__nativeId, long maskColor, int mode);

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
Fills the pixmap with the given <tt>color</tt>. <p><DT><b>See also:</b><br><DD>Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fill() {
        fill((com.trolltech.qt.gui.QColor)com.trolltech.qt.gui.QColor.white);
    }
/**
Fills the pixmap with the given <tt>color</tt>. <p><DT><b>See also:</b><br><DD>Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fill(com.trolltech.qt.gui.QColor fillColor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fill_QColor(nativeId(), fillColor == null ? 0 : fillColor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fill_QColor(long __this__nativeId, long fillColor);

/**
Fills the pixmap with the <tt>widget</tt>'s background color or pixmap according to the given offset. <p>The {@link com.trolltech.qt.core.QPoint QPoint}<tt>offset</tt> defines a point in widget coordinates to which the pixmap's top-left pixel will be mapped to. This is only significant if the widget has a background pixmap; otherwise the pixmap will simply be filled with the background color of the widget.
*/

    @QtBlockedSlot
    public final void fill(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.QPoint ofs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fill_QWidget_QPoint(nativeId(), widget == null ? 0 : widget.nativeId(), ofs == null ? 0 : ofs.nativeId());
    }
    @QtBlockedSlot
    native void __qt_fill_QWidget_QPoint(long __this__nativeId, long widget, long ofs);

/**
This is an overloaded member function, provided for convenience. <p>Fills the pixmap with the <tt>widget</tt>'s background color or pixmap. The given point, (<tt>x</tt>, <tt>y</tt>), defines an offset in widget coordinates to which the pixmap's top-left pixel will be mapped to.
*/

    @QtBlockedSlot
    public final void fill(com.trolltech.qt.gui.QWidget widget, int xofs, int yofs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fill_QWidget_int_int(nativeId(), widget == null ? 0 : widget.nativeId(), xofs, yofs);
    }
    @QtBlockedSlot
    native void __qt_fill_QWidget_int_int(long __this__nativeId, long widget, int xofs, int yofs);

/**
Returns true if this pixmap has an alpha channel, or has a mask, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#hasAlphaChannel() hasAlphaChannel()}, {@link com.trolltech.qt.gui.QPixmap#alphaChannel() alphaChannel()}, and {@link com.trolltech.qt.gui.QPixmap#mask() mask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasAlpha()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAlpha(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAlpha(long __this__nativeId);

/**
Returns true if the pixmap has a format that respects the alpha channel, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#alphaChannel() alphaChannel()}, and {@link com.trolltech.qt.gui.QPixmap#hasAlpha() hasAlpha()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasAlphaChannel()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasAlphaChannel(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasAlphaChannel(long __this__nativeId);

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for QPixmap and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
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
Returns true if this is a null pixmap; otherwise returns false. <p>A null pixmap has zero width, zero height and no contents. You cannot draw in a null pixmap.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns true if this is a {@link com.trolltech.qt.gui.QBitmap QBitmap}; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isQBitmap()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isQBitmap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isQBitmap(long __this__nativeId);


    @QtBlockedSlot
    private final boolean load(java.lang.String fileName, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.load(fileName, format, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }
    @QtBlockedSlot
    private final boolean load(java.lang.String fileName, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_String_nativepointer_ImageConversionFlags(nativeId(), fileName, format, flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_load_String_nativepointer_ImageConversionFlags(long __this__nativeId, java.lang.String fileName, com.trolltech.qt.QNativePointer format, int flags);


    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.loadFromData(data, format, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }
    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadFromData_QByteArray_nativepointer_ImageConversionFlags(nativeId(), data == null ? 0 : data.nativeId(), format, flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_loadFromData_QByteArray_nativepointer_ImageConversionFlags(long __this__nativeId, long data, com.trolltech.qt.QNativePointer format, int flags);


    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.QNativePointer buf, int len, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.loadFromData(buf, len, format, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }
    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.QNativePointer buf, int len, com.trolltech.qt.QNativePointer format, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadFromData_nativepointer_int_nativepointer_ImageConversionFlags(nativeId(), buf, len, format, flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_loadFromData_nativepointer_int_nativepointer_ImageConversionFlags(long __this__nativeId, com.trolltech.qt.QNativePointer buf, int len, com.trolltech.qt.QNativePointer format, int flags);

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
Extracts a bitmap mask from the pixmap's alphachannel. <p>This is potentially an expensive operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) setMask()}, and Pixmap Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBitmap mask()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mask(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBitmap __qt_mask(long __this__nativeId);

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
<brief>Writes thisQPixmap
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

/**
<brief>Reads a QPixmap
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

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
Returns the pixmap's enclosing rectangle. <p><DT><b>See also:</b><br><DD>Pixmap Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect(long __this__nativeId);

    @QtBlockedSlot
    private final boolean private_save(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.QNativePointer format, int quality)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_private_save_QIODevice_nativepointer_int(nativeId(), device == null ? 0 : device.nativeId(), format, quality);
    }
    @QtBlockedSlot
    native boolean __qt_private_save_QIODevice_nativepointer_int(long __this__nativeId, long device, com.trolltech.qt.QNativePointer format, int quality);

    @QtBlockedSlot
    private final boolean private_save(java.lang.String fileName, com.trolltech.qt.QNativePointer format, int quality)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_private_save_String_nativepointer_int(nativeId(), fileName, format, quality);
    }
    @QtBlockedSlot
    native boolean __qt_private_save_String_nativepointer_int(long __this__nativeId, java.lang.String fileName, com.trolltech.qt.QNativePointer format, int quality);


/**
Scales the pixmap to the given <tt>size</tt>, using the aspect ratio and transformation modes specified by <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the pixmap is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the pixmap is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the pixmap is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(com.trolltech.qt.core.QSize s, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode) {
        return scaled(s, aspectMode, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }

/**
Scales the pixmap to the given <tt>size</tt>, using the aspect ratio and transformation modes specified by <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the pixmap is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the pixmap is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the pixmap is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(com.trolltech.qt.core.QSize s) {
        return scaled(s, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Scales the pixmap to the given <tt>size</tt>, using the aspect ratio and transformation modes specified by <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the pixmap is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the pixmap is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the pixmap is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(com.trolltech.qt.core.QSize s, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaled_QSize_AspectRatioMode_TransformationMode(nativeId(), s == null ? 0 : s.nativeId(), aspectMode.value(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_scaled_QSize_AspectRatioMode_TransformationMode(long __this__nativeId, long s, int aspectMode, int mode);


/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the pixmap scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null pixmap.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(int w, int h, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode) {
        return scaled(w, h, aspectMode, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the pixmap scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null pixmap.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(int w, int h) {
        return scaled(w, h, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the pixmap scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null pixmap.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaled(int w, int h, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaled_int_int_AspectRatioMode_TransformationMode(nativeId(), w, h, aspectMode.value(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_scaled_int_int_AspectRatioMode_TransformationMode(long __this__nativeId, int w, int h, int aspectMode, int mode);


/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>height</tt> using the specified transformation <tt>mode</tt>. The width of the pixmap is automatically calculated so that the aspect ratio of the pixmap is preserved. <p>If <tt>height</tt> is 0 or negative, a null pixmap is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaledToHeight(int h) {
        return scaledToHeight(h, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>height</tt> using the specified transformation <tt>mode</tt>. The width of the pixmap is automatically calculated so that the aspect ratio of the pixmap is preserved. <p>If <tt>height</tt> is 0 or negative, a null pixmap is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaledToHeight(int h, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledToHeight_int_TransformationMode(nativeId(), h, mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_scaledToHeight_int_TransformationMode(long __this__nativeId, int h, int mode);


/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>width</tt> using the specified transformation <tt>mode</tt>. The height of the pixmap is automatically calculated so that the aspect ratio of the pixmap is preserved. <p>If <tt>width</tt> is 0 or negative, a null pixmap is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaledToWidth(int w) {
        return scaledToWidth(w, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>width</tt> using the specified transformation <tt>mode</tt>. The height of the pixmap is automatically calculated so that the aspect ratio of the pixmap is preserved. <p>If <tt>width</tt> is 0 or negative, a null pixmap is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#isNull() isNull()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap scaledToWidth(int w, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledToWidth_int_TransformationMode(nativeId(), w, mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_scaledToWidth_int_TransformationMode(long __this__nativeId, int w, int mode);

/**
Sets the alpha channel of this pixmap to the given <tt>alphaChannel</tt> by converting the <tt>alphaChannel</tt> into 32 bit and using the intensity of the RGB pixel values. <p>The effect of this function is undefined when the pixmap is being painted on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#alphaChannel() alphaChannel()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlphaChannel(com.trolltech.qt.gui.QPixmap arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlphaChannel_QPixmap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setAlphaChannel_QPixmap(long __this__nativeId, long arg__1);

/**
Sets a mask bitmap. <p>This function merges the <tt>mask</tt> with the pixmap's alpha channel. A pixel value of 1 on the mask means the pixmap's pixel is unchanged; a value of 0 means the pixel is transparent. The mask must have the same size as this pixmap. <p>Setting a null mask resets the mask, leaving the previously transparent pixels black. The effect of this function is undefined when the pixmap is being painted on. <p>This is potentially an expensive operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#mask() mask()}, Pixmap Transformations, and {@link com.trolltech.qt.gui.QBitmap QBitmap}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMask(com.trolltech.qt.gui.QBitmap arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMask_QBitmap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMask_QBitmap(long __this__nativeId, long arg__1);

/**
Returns the size of the pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#width() width()}, {@link com.trolltech.qt.gui.QPixmap#height() height()}, and Pixmap Information. <br></DD></DT>
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
Converts the pixmap to a {@link com.trolltech.qt.gui.QImage QImage}. Returns a null image if the conversion fails. <p>If the pixmap has 1-bit depth, the returned image will also be 1 bit deep. If the pixmap has 2- to 8-bit depth, the returned image has 8-bit depth. If the pixmap has greater than 8-bit depth, the returned image has 32-bit depth. <p>Note that for the moment, alpha masks on monochrome images are ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlag[]) fromImage()}, and {@link com.trolltech.qt.gui.QImage Image Formats}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage toImage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toImage(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_toImage(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function loads the <tt>matrix</tt> into a {@link com.trolltech.qt.gui.QTransform QTransform} and calls the overloaded function.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap transformed(com.trolltech.qt.gui.QMatrix arg__1, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QMatrix_TransformationMode(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_transformed_QMatrix_TransformationMode(long __this__nativeId, long arg__1, int mode);

/**
Returns a copy of the pixmap that is transformed using the given transformation <tt>transform</tt> and transformation <tt>mode</tt>. The original pixmap is not changed. <p>The transformation <tt>transform</tt> is internally adjusted to compensate for unwanted translation; i.e. the pixmap produced is the smallest pixmap that contains all the transformed points of the original pixmap. Use the {@link com.trolltech.qt.gui.QPixmap#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function to retrieve the actual matrix used for transforming the pixmap. <p>This function is slow because it involves transformation to a {@link com.trolltech.qt.gui.QImage QImage}, non-trivial computations and a transformation back to a QPixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()}, and Pixmap Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap transformed(com.trolltech.qt.gui.QTransform arg__1, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QTransform_TransformationMode(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_transformed_QTransform_TransformationMode(long __this__nativeId, long arg__1, int mode);

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for QPixmap and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
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
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metric_PaintDeviceMetric(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int arg__1);

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
Returns the default pixmap depth used by the application. <p>On Windows and Mac, the default depth is always 32. On X11 and embedded, the depth of the screen will be returned by this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#depth() depth()}, {@link com.trolltech.qt.gui.QColormap#depth() QColormap::depth()}, and Pixmap Information. <br></DD></DT>
*/

    public native static int defaultDepth();


/**

*/

    public static com.trolltech.qt.gui.QPixmap fromImage(com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return com.trolltech.qt.gui.QPixmap.fromImage(image, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Converts the given <tt>image</tt> to a pixmap using the specified <tt>flags</tt> to control the conversion. The <tt>flags</tt> argument is a bitwise-OR of the Qt::ImageConversionFlags. Passing 0 for <tt>flags</tt> sets all the default options. <p>In case of monochrome and 8-bit images, the image is first converted to a 32-bit pixmap and then filled with the colors in the color table. If this is too expensive an operation, you can use {@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) QBitmap::fromImage()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#toImage() toImage()}, and Pixmap Conversion. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap fromImage(com.trolltech.qt.gui.QImage image) {
        return fromImage(image, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Converts the given <tt>image</tt> to a pixmap using the specified <tt>flags</tt> to control the conversion. The <tt>flags</tt> argument is a bitwise-OR of the Qt::ImageConversionFlags. Passing 0 for <tt>flags</tt> sets all the default options. <p>In case of monochrome and 8-bit images, the image is first converted to a 32-bit pixmap and then filled with the colors in the color table. If this is too expensive an operation, you can use {@link com.trolltech.qt.gui.QBitmap#fromImage(com.trolltech.qt.gui.QImage, com.trolltech.qt.core.Qt.ImageConversionFlags) QBitmap::fromImage()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#toImage() toImage()}, and Pixmap Conversion. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap fromImage(com.trolltech.qt.gui.QImage image, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        return __qt_fromImage_QImage_ImageConversionFlags(image == null ? 0 : image.nativeId(), flags.value());
    }
    native static com.trolltech.qt.gui.QPixmap __qt_fromImage_QImage_ImageConversionFlags(long image, int flags);

/**
Creates a pixmap and paints the given <tt>widget</tt>, restricted by the given <tt>rectangle</tt>, in it. If the <tt>widget</tt> has any children, then they are also painted in the appropriate positions. <p>If no rectangle is specified (the default) the entire widget is painted. <p>If <tt>widget</tt> is 0, the specified rectangle doesn't overlap the widget's rectangle, or an error occurs, the function will return a null QPixmap. If the rectangle is a superset of the given <tt>widget</tt>, the areas outside the <tt>widget</tt> are covered with the widget's background. <p>This function actually asks <tt>widget</tt> to paint itself (and its children to paint themselves) by calling paintEvent() with painter redirection turned on. But QPixmap also provides the {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function which is a bit faster by grabbing pixels directly off the screen. In addition, if there are overlaying windows, {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()}, unlike {@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, will see them. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.QRect rect)    {
        return __qt_grabWidget_QWidget_QRect(widget == null ? 0 : widget.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native static com.trolltech.qt.gui.QPixmap __qt_grabWidget_QWidget_QRect(long widget, long rect);


/**
This is an overloaded member function, provided for convenience. <p>Creates a pixmap and paints the given <tt>widget</tt>, restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), in it. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget, int x, int y, int w) {
        return grabWidget(widget, x, y, w, (int)-1);
    }

/**
This is an overloaded member function, provided for convenience. <p>Creates a pixmap and paints the given <tt>widget</tt>, restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), in it. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget, int x, int y) {
        return grabWidget(widget, x, y, (int)-1, (int)-1);
    }

/**
This is an overloaded member function, provided for convenience. <p>Creates a pixmap and paints the given <tt>widget</tt>, restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), in it. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget, int x) {
        return grabWidget(widget, x, (int)0, (int)-1, (int)-1);
    }

/**
This is an overloaded member function, provided for convenience. <p>Creates a pixmap and paints the given <tt>widget</tt>, restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), in it. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget) {
        return grabWidget(widget, (int)0, (int)0, (int)-1, (int)-1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Creates a pixmap and paints the given <tt>widget</tt>, restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>), in it. <p><b>Warning:</b> Do not grab a widget from its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) QWidget::paintEvent()}. However, it is safe to grab a widget from another widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.
*/

    public static com.trolltech.qt.gui.QPixmap grabWidget(com.trolltech.qt.gui.QWidget widget, int x, int y, int w, int h)    {
        return __qt_grabWidget_QWidget_int_int_int_int(widget == null ? 0 : widget.nativeId(), x, y, w, h);
    }
    native static com.trolltech.qt.gui.QPixmap __qt_grabWidget_QWidget_int_int_int_int(long widget, int x, int y, int w, int h);


/**
Creates and returns a pixmap constructed by grabbing the contents of the given <tt>window</tt> restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>). <p>The arguments (<tt>x</tt>, <tt>y</tt>) specify the offset in the window, whereas (<tt>width</tt>, <tt>height</tt>) specify the area to be copied. If <tt>width</tt> is negative, the function copies everything to the right border of the window. If <tt>height</tt> is negative, the function copies everything to the bottom of the window. <p>The window system identifier (<tt>WId</tt>) can be retrieved using the {@link com.trolltech.qt.gui.QWidget#winId() QWidget::winId()} function. The rationale for using a window identifier and not a {@link com.trolltech.qt.gui.QWidget QWidget}, is to enable grabbing of windows that are not part of the application, window system frames, and so on. <p>The {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function grabs pixels from the screen, not from the window, i.e. if there is another window partially or entirely over the one you grab, you get pixels from the overlying window, too. The mouse cursor is generally not grabbed. <p>Note on X11that if the given <tt>window</tt> doesn't have the same depth as the root window, and another window partially or entirely obscures the one you grab, you will not get pixels from the overlying window. The contents of the obscured areas in the pixmap will be undefined and uninitialized. <p><b>Warning:</b> In general, grabbing an area outside the screen is not safe. This depends on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, and {@link <a href="../qtjambi-screenshot.html">Screenshot Example</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap grabWindow(long arg__1, int x, int y, int w) {
        return grabWindow(arg__1, x, y, w, (int)-1);
    }

/**
Creates and returns a pixmap constructed by grabbing the contents of the given <tt>window</tt> restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>). <p>The arguments (<tt>x</tt>, <tt>y</tt>) specify the offset in the window, whereas (<tt>width</tt>, <tt>height</tt>) specify the area to be copied. If <tt>width</tt> is negative, the function copies everything to the right border of the window. If <tt>height</tt> is negative, the function copies everything to the bottom of the window. <p>The window system identifier (<tt>WId</tt>) can be retrieved using the {@link com.trolltech.qt.gui.QWidget#winId() QWidget::winId()} function. The rationale for using a window identifier and not a {@link com.trolltech.qt.gui.QWidget QWidget}, is to enable grabbing of windows that are not part of the application, window system frames, and so on. <p>The {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function grabs pixels from the screen, not from the window, i.e. if there is another window partially or entirely over the one you grab, you get pixels from the overlying window, too. The mouse cursor is generally not grabbed. <p>Note on X11that if the given <tt>window</tt> doesn't have the same depth as the root window, and another window partially or entirely obscures the one you grab, you will not get pixels from the overlying window. The contents of the obscured areas in the pixmap will be undefined and uninitialized. <p><b>Warning:</b> In general, grabbing an area outside the screen is not safe. This depends on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, and {@link <a href="../qtjambi-screenshot.html">Screenshot Example</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap grabWindow(long arg__1, int x, int y) {
        return grabWindow(arg__1, x, y, (int)-1, (int)-1);
    }

/**
Creates and returns a pixmap constructed by grabbing the contents of the given <tt>window</tt> restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>). <p>The arguments (<tt>x</tt>, <tt>y</tt>) specify the offset in the window, whereas (<tt>width</tt>, <tt>height</tt>) specify the area to be copied. If <tt>width</tt> is negative, the function copies everything to the right border of the window. If <tt>height</tt> is negative, the function copies everything to the bottom of the window. <p>The window system identifier (<tt>WId</tt>) can be retrieved using the {@link com.trolltech.qt.gui.QWidget#winId() QWidget::winId()} function. The rationale for using a window identifier and not a {@link com.trolltech.qt.gui.QWidget QWidget}, is to enable grabbing of windows that are not part of the application, window system frames, and so on. <p>The {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function grabs pixels from the screen, not from the window, i.e. if there is another window partially or entirely over the one you grab, you get pixels from the overlying window, too. The mouse cursor is generally not grabbed. <p>Note on X11that if the given <tt>window</tt> doesn't have the same depth as the root window, and another window partially or entirely obscures the one you grab, you will not get pixels from the overlying window. The contents of the obscured areas in the pixmap will be undefined and uninitialized. <p><b>Warning:</b> In general, grabbing an area outside the screen is not safe. This depends on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, and {@link <a href="../qtjambi-screenshot.html">Screenshot Example</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap grabWindow(long arg__1, int x) {
        return grabWindow(arg__1, x, (int)0, (int)-1, (int)-1);
    }

/**
Creates and returns a pixmap constructed by grabbing the contents of the given <tt>window</tt> restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>). <p>The arguments (<tt>x</tt>, <tt>y</tt>) specify the offset in the window, whereas (<tt>width</tt>, <tt>height</tt>) specify the area to be copied. If <tt>width</tt> is negative, the function copies everything to the right border of the window. If <tt>height</tt> is negative, the function copies everything to the bottom of the window. <p>The window system identifier (<tt>WId</tt>) can be retrieved using the {@link com.trolltech.qt.gui.QWidget#winId() QWidget::winId()} function. The rationale for using a window identifier and not a {@link com.trolltech.qt.gui.QWidget QWidget}, is to enable grabbing of windows that are not part of the application, window system frames, and so on. <p>The {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function grabs pixels from the screen, not from the window, i.e. if there is another window partially or entirely over the one you grab, you get pixels from the overlying window, too. The mouse cursor is generally not grabbed. <p>Note on X11that if the given <tt>window</tt> doesn't have the same depth as the root window, and another window partially or entirely obscures the one you grab, you will not get pixels from the overlying window. The contents of the obscured areas in the pixmap will be undefined and uninitialized. <p><b>Warning:</b> In general, grabbing an area outside the screen is not safe. This depends on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, and {@link <a href="../qtjambi-screenshot.html">Screenshot Example</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap grabWindow(long arg__1) {
        return grabWindow(arg__1, (int)0, (int)0, (int)-1, (int)-1);
    }
/**
Creates and returns a pixmap constructed by grabbing the contents of the given <tt>window</tt> restricted by {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>). <p>The arguments (<tt>x</tt>, <tt>y</tt>) specify the offset in the window, whereas (<tt>width</tt>, <tt>height</tt>) specify the area to be copied. If <tt>width</tt> is negative, the function copies everything to the right border of the window. If <tt>height</tt> is negative, the function copies everything to the bottom of the window. <p>The window system identifier (<tt>WId</tt>) can be retrieved using the {@link com.trolltech.qt.gui.QWidget#winId() QWidget::winId()} function. The rationale for using a window identifier and not a {@link com.trolltech.qt.gui.QWidget QWidget}, is to enable grabbing of windows that are not part of the application, window system frames, and so on. <p>The {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) grabWindow()} function grabs pixels from the screen, not from the window, i.e. if there is another window partially or entirely over the one you grab, you get pixels from the overlying window, too. The mouse cursor is generally not grabbed. <p>Note on X11that if the given <tt>window</tt> doesn't have the same depth as the root window, and another window partially or entirely obscures the one you grab, you will not get pixels from the overlying window. The contents of the obscured areas in the pixmap will be undefined and uninitialized. <p><b>Warning:</b> In general, grabbing an area outside the screen is not safe. This depends on the underlying window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#grabWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QRect) grabWidget()}, and {@link <a href="../qtjambi-screenshot.html">Screenshot Example</a>}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QPixmap grabWindow(long arg__1, int x, int y, int w, int h);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function loads the matrix <tt>m</tt> into a {@link com.trolltech.qt.gui.QTransform QTransform} and calls the overloaded function with the {@link com.trolltech.qt.gui.QTransform QTransform} and the width <tt>w</tt> and the height <tt>h</tt>.
*/

    public static com.trolltech.qt.gui.QMatrix trueMatrix(com.trolltech.qt.gui.QMatrix m, int w, int h)    {
        return __qt_trueMatrix_QMatrix_int_int(m == null ? 0 : m.nativeId(), w, h);
    }
    native static com.trolltech.qt.gui.QMatrix __qt_trueMatrix_QMatrix_int_int(long m, int w, int h);

/**
Returns the actual matrix used for transforming a pixmap with the given <tt>width</tt>, <tt>height</tt> and <tt>matrix</tt>. <p>When transforming a pixmap using the {@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) transformed()} function, the transformation matrix is internally adjusted to compensate for unwanted translation, i.e. {@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) transformed()} returns the smallest pixmap containing all transformed points of the original pixmap. This function returns the modified matrix, which maps points correctly from the original pixmap into the new pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#transformed(com.trolltech.qt.gui.QMatrix, com.trolltech.qt.core.Qt.TransformationMode) transformed()}, and Pixmap Transformations. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QTransform trueMatrix(com.trolltech.qt.gui.QTransform m, int w, int h)    {
        return __qt_trueMatrix_QTransform_int_int(m == null ? 0 : m.nativeId(), w, h);
    }
    native static com.trolltech.qt.gui.QTransform __qt_trueMatrix_QTransform_int_int(long m, int w, int h);

/**
@exclude
*/

    public static native QPixmap fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPixmap(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPixmap array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);

    public QPixmap(String xpm[]) {
        this(com.trolltech.qt.QNativePointer.createCharPointerPointer(xpm));
    }


    // TEMPLATE - gui.pixmap_save - START
/**
This function writes a QPixmap to the given <tt>dev</tt> using the
specified image file <tt>format</tt> and <tt>quality</tt> factor. This can be
used, for example, to save a pixmap directly into a QByteArray:
*/

    public final boolean save(com.trolltech.qt.core.QIODevice dev, String format, int quality) {
        return private_save(dev, com.trolltech.qt.QNativePointer.createCharPointer(format), quality);
    }
/**
This is an overloaded method provided for convenience.
*/

    public final boolean save(com.trolltech.qt.core.QIODevice dev, String format) {
        return save(dev, format, -1);
    }
/**
This is an overloaded method provided for convenience.
*/

    public final boolean save(com.trolltech.qt.core.QIODevice dev) {
        return save(dev, null);
    }
    // TEMPLATE - gui.pixmap_save - END


    // TEMPLATE - gui.pixmap_save - START
/**
Saves the pixmap to the file with the given <tt>fileName</tt> using the
specified image file <tt>format</tt> and <tt>quality</tt> factor. Returns true
if successful; otherwise returns false.
<p>
The <tt>quality</tt> factor must be in the range [0,100] or -1. Specify
0 to obtain small compressed files, 100 for large uncompressed
files, and -1 to use the default settings.
<p>
If <tt>format</tt> is 0, an image format will be chosen from <tt>fileName</tt>'s
suffix.
*/

    public final boolean save(String fileName, String format, int quality) {
        return private_save(fileName, com.trolltech.qt.QNativePointer.createCharPointer(format), quality);
    }
/**
This is an overloaded method provided for convenience.
*/

    public final boolean save(String fileName, String format) {
        return save(fileName, format, -1);
    }
/**
This is an overloaded method provided for convenience.
*/

    public final boolean save(String fileName) {
        return save(fileName, null);
    }
    // TEMPLATE - gui.pixmap_save - END


    // TEMPLATE - gui.pixmap_constructor - START
    // TEMPLATE - gui.pixmap_loadconstructor - START
/**
Constructs a pixmap from the file with the given <tt>fileName</tt>. If the file does not exist or is of an unknown format, the pixmap becomes a null pixmap. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>The file name can either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p>The <tt>fileName</tt>, <tt>format</tt> and <tt>flags</tt> parameters are passed on to {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}. This means that the data in <tt>fileName</tt> is not compiled into the binary. If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p><DT><b>See also:</b><br><DD>Reading and Writing Image Files. <br></DD></DT>
*/

    public  QPixmap(String fileName, String format, Qt.ImageConversionFlags flags) {
        this(fileName, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
Constructs a pixmap from the file with the given <tt>fileName</tt>. If the file does not exist or is of an unknown format, the pixmap becomes a null pixmap. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>The file name can either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p>The <tt>fileName</tt>, <tt>format</tt> and <tt>flags</tt> parameters are passed on to {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}. This means that the data in <tt>fileName</tt> is not compiled into the binary. If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p><DT><b>See also:</b><br><DD>Reading and Writing Image Files. <br></DD></DT>
*/

    public  QPixmap(String fileName, String format, Qt.ImageConversionFlag ... flags) {
        this(fileName, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
This is an overloaded constructor provided for convenience.
*/

    public  QPixmap(String fileName, String format) {
        this(fileName, format, Qt.ImageConversionFlag.AutoColor);
    }

/**
This is an overloaded constructor provided for convenience.
*/

/**
Constructs a pixmap from the given <tt>xpm</tt> data, which must be a valid XPM image. <p>Errors are silently ignored. <p>Note that it's possible to squeeze the XPM variable a little bit by using an unusual declaration: <pre class="snippet">
        String start_xpm[] = {
            "16 15 8 1",
            "a c #cec6bd",
            // ...
            };
</pre> The extra <tt>const</tt> makes the entire definition read-only, which is slightly more efficient (for example, when the code is in a shared library) and ROMable when the application is to be stored in ROM.
*/

    public  QPixmap(String fileName) {
        this(fileName, null);
    }
    // TEMPLATE - gui.pixmap_loadconstructor - END
    // TEMPLATE - gui.pixmap_constructor - END


    // TEMPLATE - gui.pixmap_load - START
    // TEMPLATE - gui.pixmap_loadconstructor - START
/**
Constructs a pixmap from the file with the given <tt>fileName</tt>. If the file does not exist or is of an unknown format, the pixmap becomes a null pixmap. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>The file name can either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p>The <tt>fileName</tt>, <tt>format</tt> and <tt>flags</tt> parameters are passed on to {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}. This means that the data in <tt>fileName</tt> is not compiled into the binary. If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p><DT><b>See also:</b><br><DD>Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean load(String fileName, String format, Qt.ImageConversionFlags flags) {
        return load(fileName, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
Constructs a pixmap from the file with the given <tt>fileName</tt>. If the file does not exist or is of an unknown format, the pixmap becomes a null pixmap. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>The file name can either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>If the image needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p>The <tt>fileName</tt>, <tt>format</tt> and <tt>flags</tt> parameters are passed on to {@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}. This means that the data in <tt>fileName</tt> is not compiled into the binary. If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p><DT><b>See also:</b><br><DD>Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean load(String fileName, String format, Qt.ImageConversionFlag ... flags) {
        return load(fileName, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean load(String fileName, String format) {
        return load(fileName, format, Qt.ImageConversionFlag.AutoColor);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean load(String fileName) {
        return load(fileName, null);
    }
    // TEMPLATE - gui.pixmap_loadconstructor - END
    // TEMPLATE - gui.pixmap_load - END


    // TEMPLATE - gui.pixmap_load - START
    // TEMPLATE - gui.pixmap_loadconstructor - START
/**
Loads a pixmap from the <tt>len</tt> first bytes of the given binary <tt>data</tt>. Returns true if the pixmap was loaded successfully; otherwise returns false. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>If the data needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}, and Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean loadFromData(byte[] data, String format, Qt.ImageConversionFlags flags) {
        return loadFromData(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), data.length, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
Loads a pixmap from the <tt>len</tt> first bytes of the given binary <tt>data</tt>. Returns true if the pixmap was loaded successfully; otherwise returns false. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>If the data needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}, and Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean loadFromData(byte[] data, String format, Qt.ImageConversionFlag ... flags) {
        return loadFromData(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), data.length, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
Loads a pixmap from the <tt>len</tt> first bytes of the given binary <tt>data</tt>. Returns true if the pixmap was loaded successfully; otherwise returns false. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>If the data needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}, and Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean loadFromData(byte[] data, String format) {
        return loadFromData(data, format, Qt.ImageConversionFlag.AutoColor);
    }

/**
Loads a pixmap from the <tt>len</tt> first bytes of the given binary <tt>data</tt>. Returns true if the pixmap was loaded successfully; otherwise returns false. <p>The loader attempts to read the pixmap using the specified <tt>format</tt>. If the <tt>format</tt> is not specified (which is the default), the loader probes the file for a header to guess the file format. <p>If the data needs to be modified to fit in a lower-resolution result (e.g. converting from 32-bit to 8-bit), use the <tt>flags</tt> to control the conversion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#load(java.lang.String, java.lang.String, com.trolltech.qt.core.Qt.ImageConversionFlags) load()}, and Reading and Writing Image Files. <br></DD></DT>
*/

    public final boolean loadFromData(byte[] data) {
        return loadFromData(data, null);
    }
    // TEMPLATE - gui.pixmap_loadconstructor - END
    // TEMPLATE - gui.pixmap_load - END


    // TEMPLATE - gui.pixmap_load - START
    // TEMPLATE - gui.pixmap_loadconstructor - START
/**
Loads a pixmap from the binary <tt>data</tt> using the specified <tt>format</tt> and conversion <tt>flags</tt>.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data, String format, Qt.ImageConversionFlags flags) {
        return loadFromData(data, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
Loads a pixmap from the binary <tt>data</tt> using the specified <tt>format</tt> and conversion <tt>flags</tt>.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data, String format, Qt.ImageConversionFlag ... flags) {
        return loadFromData(data, format == null ? null : QNativePointer.createCharPointer(format), flags);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data, String format) {
        return loadFromData(data, format, Qt.ImageConversionFlag.AutoColor);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data) {
        return loadFromData(data, null);
    }
    // TEMPLATE - gui.pixmap_loadconstructor - END
    // TEMPLATE - gui.pixmap_load - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QPixmap clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPixmap __qt_clone(long __this_nativeId);
}
