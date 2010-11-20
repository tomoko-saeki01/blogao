package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QImage class provides a hardware-independent image representation that allows direct access to the pixel data, and can be used as a paint device. Qt provides four classes for handling image data: QImage, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.gui.QBitmap QBitmap} and {@link com.trolltech.qt.gui.QPicture QPicture}. QImage is designed and optimized for I/O, and for direct pixel access and manipulation, while {@link com.trolltech.qt.gui.QPixmap QPixmap} is designed and optimized for showing images on screen. {@link com.trolltech.qt.gui.QBitmap QBitmap} is only a convenience class that inherits {@link com.trolltech.qt.gui.QPixmap QPixmap}, ensuring a depth of 1. Finally, the {@link com.trolltech.qt.gui.QPicture QPicture} class is a paint device that records and replays {@link com.trolltech.qt.gui.QPainter QPainter} commands. <p>Because QImage is a {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} subclass, {@link com.trolltech.qt.gui.QPainter QPainter} can be used to draw directly onto images. When using {@link com.trolltech.qt.gui.QPainter QPainter} on a QImage, the painting can be performed in another thread than the current GUI thread. <p>The QImage class supports several image formats described by the {@link com.trolltech.qt.gui.QImage.Format Format } enum. These include monochrome, 8-bit, 32-bit and alpha-blended images which are available in all versions of Qt 4.x. <p>QImage provides a collection of functions that can be used to obtain a variety of information about the image. There are also several functions that enables transformation of the image. <p>QImage objects can be passed around by value since the QImage class uses {@link <a href="../shared.html">implicit data sharing</a>}. QImage objects can also be streamed and compared. <p><b>Note:</b> If you would like to load QImage objects in a static build of Qt, refer to the {@link <a href="../plugins-howto.html#static-plugins">Plugin HowTo</a>}. <ul><li> {@link <a href="#reading-and-writing-image-files">Reading and Writing Image Files</a>}</li><li> {@link <a href="#image-information">Image Information</a>}</li><li> {@link <a href="#pixel-manipulation">Pixel Manipulation</a>}</li><li> {@link <a href="#image-formats">Image Formats</a>}</li><li> {@link <a href="#image-transformations">Image Transformations</a>}</li><li> {@link <a href="#legal-information">Legal Information</a>}</li></ul><a name="reading-and-writing-image-files"><h2>Reading and Writing Image Files</h2> QImage provides several ways of loading an image file: The file can be loaded when constructing the QImage object, or by using the {@link com.trolltech.qt.gui.QImage#load(java.lang.String, java.lang.String) load()} or {@link com.trolltech.qt.gui.QImage#loadFromData(byte[], java.lang.String) loadFromData()} functions later on. QImage also provides the static {@link com.trolltech.qt.gui.QImage#fromData(com.trolltech.qt.core.QByteArray, java.lang.String) fromData()} function, constructing a QImage from the given data. When loading an image, the file name can either refer to an actual file on disk or to one of the application's embedded resources. See {@link <a href="../resources.html">The Qt Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Simply call the {@link com.trolltech.qt.gui.QImage#save(java.lang.String, java.lang.String, int) save()} function to save a QImage object. <p>The complete list of supported file formats are available through the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions. New file formats can be added as plugins. By default, Qt supports the following formats: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Description</center></th><th><center> Qt's support</center></th></tr></thead><tr valign="top" class="even"><td> BMP</td><td> Windows Bitmap</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> GIF</td><td> Graphic Interchange Format (optional)</td><td> Read</td></tr><tr valign="top" class="even"><td> JPG</td><td> Joint Photographic Experts Group</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> JPEG</td><td> Joint Photographic Experts Group</td><td> Read/write</td></tr><tr valign="top" class="even"><td> PNG</td><td> Portable Network Graphics</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> PBM</td><td> Portable Bitmap</td><td> Read</td></tr><tr valign="top" class="even"><td> PGM</td><td> Portable Graymap</td><td> Read</td></tr><tr valign="top" class="odd"><td> PPM</td><td> Portable Pixmap</td><td> Read/write</td></tr><tr valign="top" class="even"><td> TIFF</td><td> Tagged Image File Format</td><td> Read/write</td></tr><tr valign="top" class="odd"><td> XBM</td><td> X11 Bitmap</td><td> Read/write</td></tr><tr valign="top" class="even"><td> XPM</td><td> X11 Pixmap</td><td> Read/write</td></tr></table><a name="image-information"><h2>Image Information</h2> QImage provides a collection of functions that can be used to obtain a variety of information about the image: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center></center></th><th><center> Available Functions</center></th></tr></thead><tr valign="top" class="even"><td> Geometry</td><td> The {@link com.trolltech.qt.gui.QImage#size() size()}, {@link com.trolltech.qt.gui.QImage#width() width()}, {@link com.trolltech.qt.gui.QImage#height() height()}, {@link com.trolltech.qt.gui.QImage#dotsPerMeterX() dotsPerMeterX()}, and {@link com.trolltech.qt.gui.QImage#dotsPerMeterY() dotsPerMeterY()} functions provide information about the image size and aspect ratio. <p>The {@link com.trolltech.qt.gui.QImage#rect() rect()} function returns the image's enclosing rectangle. The {@link com.trolltech.qt.gui.QImage#valid(com.trolltech.qt.core.QPoint) valid()} function tells if a given pair of coordinates is within this rectangle. The {@link com.trolltech.qt.gui.QImage#offset() offset()} function returns the number of pixels by which the image is intended to be offset by when positioned relative to other images, which also can be manipulated using the {@link com.trolltech.qt.gui.QImage#setOffset(com.trolltech.qt.core.QPoint) setOffset()} function.</td></tr><tr valign="top" class="odd"><td> Colors</td><td> The color of a pixel can be retrieved by passing its coordinates to the {@link com.trolltech.qt.gui.QImage#pixel(com.trolltech.qt.core.QPoint) pixel()} function. The {@link com.trolltech.qt.gui.QImage#pixel(com.trolltech.qt.core.QPoint) pixel()} function returns the color as a QRgb value indepedent of the image's format. <p>In case of monochrome and 8-bit images, the {@link com.trolltech.qt.gui.QImage#numColors() numColors()} and {@link com.trolltech.qt.gui.QImage#colorTable() colorTable()} functions provide information about the color components used to store the image data: The {@link com.trolltech.qt.gui.QImage#colorTable() colorTable()} function returns the image's entire color table. To obtain a single entry, use the {@link com.trolltech.qt.gui.QImage#pixelIndex(com.trolltech.qt.core.QPoint) pixelIndex()} function to retrieve the pixel index for a given pair of coordinates, then use the {@link com.trolltech.qt.gui.QImage#color(int) color()} function to retrieve the color. Note that if you create an 8-bit image manually, you have to set a valid color table on the image as well. <p>The {@link com.trolltech.qt.gui.QImage#hasAlphaChannel() hasAlphaChannel()} function tells if the image's format respects the alpha channel, or not. The {@link com.trolltech.qt.gui.QImage#allGray() allGray()} and {@link com.trolltech.qt.gui.QImage#isGrayscale() isGrayscale()} functions tell whether an image's colors are all shades of gray. <p>See also the Pixel Manipulation and Image Transformations sections.</td></tr><tr valign="top" class="even"><td> Text</td><td> The {@link com.trolltech.qt.gui.QImage#text() text()} function returns the image text associated with the given text key. An image's text keys can be retrieved using the {@link com.trolltech.qt.gui.QImage#textKeys() textKeys()} function. Use the {@link com.trolltech.qt.gui.QImage#setText(java.lang.String, java.lang.String) setText()} function to alter an image's text.</td></tr><tr valign="top" class="odd"><td> Low-level information</td><td> The {@link com.trolltech.qt.gui.QImage#depth() depth()} function returns the depth of the image. The supported depths are 1 (monochrome), 8 and 32 (for more information see the Image Formats section). <p>The {@link com.trolltech.qt.gui.QImage#format() format()}, {@link com.trolltech.qt.gui.QImage#bytesPerLine() bytesPerLine()}, and {@link com.trolltech.qt.gui.QImage#numBytes() numBytes()} functions provide low-level information about the data stored in the image. <p>The {@link com.trolltech.qt.gui.QImage#cacheKey() cacheKey()} function returns a number that uniquely identifies the contents of this QImage object.</td></tr></table><a name="pixel-manipulation"><h2>Pixel Manipulation</h2> The functions used to manipulate an image's pixels depend on the image format. The reason is that monochrome and 8-bit images are index-based and use a color lookup table, while 32-bit images store ARGB values directly. For more information on image formats, see the Image Formats section. <p>In case of a 32-bit image, the {@link com.trolltech.qt.gui.QImage#setPixel(com.trolltech.qt.core.QPoint, int) setPixel()} function can be used to alter the color of the pixel at the given coordinates to any other color specified as an ARGB quadruplet. To make a suitable QRgb value, use the qRgb() (adding a default alpha component to the given RGB values, i.e. creating an opaque color) or qRgba() function. For example: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qimage-32bit_scaled.png"></center><br></td><td> <pre class="snippet">
        QImage image = new QImage(3, 3, QImage.Format.Format_RGB32);
        int value;

        value = new QColor(189, 149, 39).rgb(); // 0xffbd9527
        image.setPixel(1, 1, value);

        value = new QColor(122, 163, 39).rgb(); // 0xff7aa327
        image.setPixel(0, 1, value);
        image.setPixel(1, 0, value);

        value = new QColor(237, 187, 51).rgb(); // 0xffedba31
        image.setPixel(2, 1, value);
</pre></td></tr><thead><tr class="qt-style" valign="top"><th><center> 32-bit</center></th></tr></thead></table> In case of a 8-bit and monchrome images, the pixel value is only an index from the image's color table. So the {@link com.trolltech.qt.gui.QImage#setPixel(com.trolltech.qt.core.QPoint, int) setPixel()} function can only be used to alter the color of the pixel at the given coordinates to a predefined color from the image's color table, i.e. it can only change the pixel's index value. To alter or add a color to an image's color table, use the {@link com.trolltech.qt.gui.QImage#setColor(int, int) setColor()} function. <p>An entry in the color table is an ARGB quadruplet encoded as an QRgb value. Use the qRgb() and qRgba() functions to make a suitable QRgb value for use with the {@link com.trolltech.qt.gui.QImage#setColor(int, int) setColor()} function. For example: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qimage-8bit_scaled.png"></center><br></td><td> <pre class="snippet">
        QImage image = new QImage(3, 3, QImage.Format.Format_Indexed8);
        int value;

        value = new QColor(122, 163, 39).rgb(); // 0xff7aa327
        image.setColor(0, value);

        value = new QColor(237, 187, 51).rgb(); // 0xffedba31
        image.setColor(1, value);

        value = new QColor(189, 149, 39).rgb(); // 0xffbd9527
        image.setColor(2, value);

        image.setPixel(0, 1, 0);
        image.setPixel(1, 0, 0);
        image.setPixel(1, 1, 2);
        image.setPixel(2, 1, 1);
</pre></td></tr><thead><tr class="qt-style" valign="top"><th><center> 8-bit</center></th></tr></thead></table> QImage also provide the {@link com.trolltech.qt.gui.QImage#scanLine(int) scanLine()} function which returns a pointer to the pixel data at the scanline with the given index, and the {@link com.trolltech.qt.gui.QImage#bits() bits()} function which returns a pointer to the first pixel data (this is equivalent to <tt>scanLine(0)</tt>).<a name="image-formats"><h2>Image Formats</h2> Each pixel stored in a QImage is represented by an integer. The size of the integer varies depending on the format. QImage supports several image formats described by the {@link com.trolltech.qt.gui.QImage.Format Format } enum. The monochrome (1-bit), 8-bit and 32-bit images are available in all versions of Qt. In addition Qt for Embedded Linux also supports 2-bit, 4-bit, and 16-bit images. For more information about the Qt Extended specific formats, see the documentation of the {@link com.trolltech.qt.gui.QImage.Format Format } enum. <p>Monochrome images are stored using 1-bit indexes into a color table with at most two colors. There are two different types of monochrome images: big endian (MSB first) or little endian (LSB first) bit order. <p>8-bit images are stored using 8-bit indexes into a color table, i.e. they have a single byte per pixel. The color table is a QVector&lt;QRgb&gt;, and the QRgb typedef is equivalent to an unsigned int containing an ARGB quadruplet on the format 0xAARRGGBB. <p>32-bit images have no color table; instead, each pixel contains an QRgb value. There are three different types of 32-bit images storing RGB (i.e. 0xffRRGGBB), ARGB and premultiplied ARGB values respectively. In the premultiplied format the red, green, and blue channels are multiplied by the alpha component divided by 255. <p>An image's format can be retrieved using the {@link com.trolltech.qt.gui.QImage#format() format()} function. Use the {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()} functions to convert an image into another format. The {@link com.trolltech.qt.gui.QImage#allGray() allGray()} and {@link com.trolltech.qt.gui.QImage#isGrayscale() isGrayscale()} functions tell whether a color image can safely be converted to a grayscale image.<a name="image-transformations"><h2>Image Transformations</h2> QImage supports a number of functions for creating a new image that is a transformed version of the original: The {@link com.trolltech.qt.gui.QImage#createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag[]) createAlphaMask()} function builds and returns a 1-bpp mask from the alpha buffer in this image, and the {@link com.trolltech.qt.gui.QImage#createHeuristicMask() createHeuristicMask()} function creates and returns a 1-bpp heuristic mask for this image. The latter function works by selecting a color from one of the corners, then chipping away pixels of that color starting at all the edges. <p>The {@link com.trolltech.qt.gui.QImage#mirrored(boolean) mirrored()} function returns a mirror of the image in the desired direction, the {@link com.trolltech.qt.gui.QImage#scaled(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) scaled()} returns a copy of the image scaled to a rectangle of the desired measures, the {@link com.trolltech.qt.gui.QImage#rgbSwapped() rgbSwapped()} function constructs a BGR image from a RGB image, and the {@link com.trolltech.qt.gui.QImage#alphaChannel() alphaChannel()} function constructs an image from this image's alpha channel. <p>The {@link com.trolltech.qt.gui.QImage#scaledToWidth(int) scaledToWidth()} and {@link com.trolltech.qt.gui.QImage#scaledToHeight(int) scaledToHeight()} functions return scaled copies of the image. <p>The {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} function returns a copy of the image that is transformed with the given transformation matrix and transformation mode: Internally, the transformation matrix is adjusted to compensate for unwanted translation, i.e. {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} returns the smallest image containing all transformed points of the original image. The static {@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function returns the actual matrix used for transforming the image. <p>There are also functions for changing attributes of an image in-place: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Function</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> setAlphaChannel()</td><td> Sets the alpha channel of the image.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QImage#setDotsPerMeterX(int) setDotsPerMeterX()}</td><td> Defines the aspect ratio by setting the number of pixels that fit horizontally in a physical meter.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QImage#setDotsPerMeterY(int) setDotsPerMeterY()}</td><td> Defines the aspect ratio by setting the number of pixels that fit vertically in a physical meter.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QImage#fill(int) fill()}</td><td> Fills the entire image with the given pixel value.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QImage#invertPixels() invertPixels()}</td><td> Inverts all pixel values in the image using the given {@link com.trolltech.qt.gui.QImage.InvertMode InvertMode } value.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QImage#setColorTable(java.util.List) setColorTable()}</td><td> Sets the color table used to translate color indexes. Only monochrome and 8-bit formats.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QImage#setNumColors(int) setNumColors()}</td><td> Resizes the color table. Only monochrome and 8-bit formats.</td></tr></table><a name="legal-information"><h2>Legal Information</h2> For smooth scaling, the {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} functions use code based on smooth scaling algorithm by Daniel M. Duley.Copyright (C) 2004, 2005 Daniel M. DuleyRedistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader QImageReader}, {@link com.trolltech.qt.gui.QImageWriter QImageWriter}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.svg.QSvgRenderer QSvgRenderer}, {@link <a href="../painting-imagecomposition.html">Image Composition Example</a>}, {@link <a href="../widgets-imageviewer.html">Image Viewer Example</a>}, {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}, and {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QImage extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum type is used to describe how pixel values should be inverted in the {@link com.trolltech.qt.gui.QImage#invertPixels() invertPixels()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#invertPixels() invertPixels()}. <br></DD></DT>
*/

    public enum InvertMode implements com.trolltech.qt.QtEnumerator {
/**
 Invert only the RGB values and leave the alpha channel unchanged.
*/

        InvertRgb(0),
/**
 Invert all channels, including the alpha channel.
*/

        InvertRgba(1);

        InvertMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QImage$InvertMode constant with the specified <tt>int</tt>.</brief>
*/

        public static InvertMode resolve(int value) {
            return (InvertMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return InvertRgb;
            case 1: return InvertRgba;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
The following image formats are available in all versions of Qt. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#format() format()}, and {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()}. <br></DD></DT>
*/

    public enum Format implements com.trolltech.qt.QtEnumerator {
/**
 The image is invalid.
*/

        Format_Invalid(0),
/**
 The image is stored using 1-bit per pixel. Bytes are packed with the most significant bit (MSB) first.
*/

        Format_Mono(1),
/**
 The image is stored using 1-bit per pixel. Bytes are packed with the less significant bit (LSB) first.
*/

        Format_MonoLSB(2),
/**
 The image is stored using 8-bit indexes into a colormap.
*/

        Format_Indexed8(3),
/**
 The image is stored using a 32-bit RGB format (0xffRRGGBB).
*/

        Format_RGB32(4),
/**
 The image is stored using a 32-bit ARGB format (0xAARRGGBB).
*/

        Format_ARGB32(5),
/**
 The image is stored using a premultiplied 32-bit ARGB format (0xAARRGGBB), i.e. the red, green, and blue channels are multiplied by the alpha component divided by 255. (If RR, GG, or BB has a higher value than the alpha channel, the results are undefined.) Certain operations (such as image composition using alpha blending) are faster using premultiplied ARGB32 than with plain ARGB32.
*/

        Format_ARGB32_Premultiplied(6),
/**
 The image is stored using a 16-bit RGB format (5-6-5).
*/

        Format_RGB16(7),
/**
 The image is stored using a premultiplied 24-bit ARGB format (8-5-6-5).
*/

        Format_ARGB8565_Premultiplied(8),
/**
 The image is stored using a 24-bit RGB format (6-6-6). The unused most significant bits is always zero.
*/

        Format_RGB666(9),
/**
 The image is stored using a premultiplied 24-bit ARGB format (6-6-6-6).
*/

        Format_ARGB6666_Premultiplied(10),
/**
 The image is stored using a 16-bit RGB format (5-5-5). The unused most significant bit is always zero.
*/

        Format_RGB555(11),
/**
 The image is stored using a premultiplied 24-bit ARGB format (8-5-5-5).
*/

        Format_ARGB8555_Premultiplied(12),
/**
 The image is stored using a 24-bit RGB format (8-8-8).
*/

        Format_RGB888(13),
/**
 The image is stored using a 16-bit RGB format (4-4-4). The unused bits are always zero.
*/

        Format_RGB444(14),
/**
 The image is stored using a premultiplied 16-bit ARGB format (4-4-4-4).
*/

        Format_ARGB4444_Premultiplied(15),
        NImageFormats(16);

        Format(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QImage$Format constant with the specified <tt>int</tt>.</brief>
*/

        public static Format resolve(int value) {
            return (Format) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Format_Invalid;
            case 1: return Format_Mono;
            case 2: return Format_MonoLSB;
            case 3: return Format_Indexed8;
            case 4: return Format_RGB32;
            case 5: return Format_ARGB32;
            case 6: return Format_ARGB32_Premultiplied;
            case 7: return Format_RGB16;
            case 8: return Format_ARGB8565_Premultiplied;
            case 9: return Format_RGB666;
            case 10: return Format_ARGB6666_Premultiplied;
            case 11: return Format_RGB555;
            case 12: return Format_ARGB8555_Premultiplied;
            case 13: return Format_RGB888;
            case 14: return Format_RGB444;
            case 15: return Format_ARGB4444_Premultiplied;
            case 16: return NImageFormats;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a null image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#isNull() isNull()}. <br></DD></DT>
*/

    public QImage(){
        super((QPrivateConstructor)null);
        __qt_QImage();

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage();

/**
Constructs a shallow copy of the given <tt>image</tt>. <p>For more information about shallow copies, see the {@link <a href="../shared.html">Implicit Data Sharing</a>} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#copy() copy()}. <br></DD></DT>
*/

    public QImage(com.trolltech.qt.gui.QImage arg__1){
        super((QPrivateConstructor)null);
        __qt_QImage_QImage(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_QImage(long arg__1);

/**
Constructs an image with the given <tt>size</tt> and <tt>format</tt>. <p><b>Warning:</b> This will create a QImage with uninitialized data. Call {@link com.trolltech.qt.gui.QImage#fill(int) fill()} to fill the image with an appropriate pixel value before drawing onto it with {@link com.trolltech.qt.gui.QPainter QPainter}.
*/

    public QImage(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QImage.Format format){
        super((QPrivateConstructor)null);
        __qt_QImage_QSize_Format(size == null ? 0 : size.nativeId(), format.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_QSize_Format(long size, int format);

    private QImage(java.lang.String fileName, com.trolltech.qt.QNativePointer format){
        super((QPrivateConstructor)null);
        __qt_QImage_String_nativepointer(fileName, format);

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_String_nativepointer(java.lang.String fileName, com.trolltech.qt.QNativePointer format);

    private QImage(com.trolltech.qt.QNativePointer xpm){
        super((QPrivateConstructor)null);
        __qt_QImage_nativepointer(xpm);

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_nativepointer(com.trolltech.qt.QNativePointer xpm);

/**
Constructs an image with the given <tt>width</tt>, <tt>height</tt> and <tt>format</tt>. <p><b>Warning:</b> This will create a QImage with uninitialized data. Call {@link com.trolltech.qt.gui.QImage#fill(int) fill()} to fill the image with an appropriate pixel value before drawing onto it with {@link com.trolltech.qt.gui.QPainter QPainter}.
*/

    public QImage(int width, int height, com.trolltech.qt.gui.QImage.Format format){
        super((QPrivateConstructor)null);
        __qt_QImage_int_int_Format(width, height, format.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_int_int_Format(int width, int height, int format);

    private QImage(com.trolltech.qt.QNativePointer data, int width, int height, com.trolltech.qt.gui.QImage.Format format){
        super((QPrivateConstructor)null);
        __qt_QImage_nativepointer_int_int_Format(data, width, height, format.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_nativepointer_int_int_Format(com.trolltech.qt.QNativePointer data, int width, int height, int format);

/**
Constructs an image with the given <tt>width</tt>, <tt>height</tt> and <tt>format</tt>, that uses an existing memory buffer, <tt>data</tt>. The <tt>width</tt> and <tt>height</tt> must be specified in pixels. <tt>bytesPerLine</tt> specifies the number of bytes per line (stride). <p>The buffer must remain valid throughout the life of the QImage. The image does not delete the buffer at destruction. <p>If <tt>format</tt> is an indexed color format, the image color table is initially empty and must be sufficiently expanded with {@link com.trolltech.qt.gui.QImage#setNumColors(int) setNumColors()} or {@link com.trolltech.qt.gui.QImage#setColorTable(java.util.List) setColorTable()} before the image is used.
*/

    public QImage(com.trolltech.qt.QNativePointer data, int width, int height, int bytesPerLine, com.trolltech.qt.gui.QImage.Format format){
        super((QPrivateConstructor)null);
        __qt_QImage_nativepointer_int_int_int_Format(data, width, height, bytesPerLine, format.value());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QImage.class, height()*bytesPerLine(), 67108864);
    }

    native void __qt_QImage_nativepointer_int_int_int_Format(com.trolltech.qt.QNativePointer data, int width, int height, int bytesPerLine, int format);

/**
Returns true if all the colors in the image are shades of gray (i. . their red, green and blue components are equal); otherwise false. <p>Note that this function is slow for images without color table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#isGrayscale() isGrayscale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean allGray()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allGray(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_allGray(long __this__nativeId);

/**
Returns the alpha channel of the image as a new grayscale QImage in which each pixel's red, green, and blue values are given the alpha value of the original image. The color depth of the returned image is 8-bit. <p>You can see an example of use of this function in {@link com.trolltech.qt.gui.QPixmap QPixmap}'s {@link com.trolltech.qt.gui.QPixmap#alphaChannel() alphaChannel()}, which works in the same way as this function on QPixmaps. <p><DT><b>See also:</b><br><DD>setAlphaChannel(), {@link com.trolltech.qt.gui.QImage#hasAlphaChannel() hasAlphaChannel()}, {@link com.trolltech.qt.gui.QPixmap Pixmap}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage alphaChannel()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alphaChannel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_alphaChannel(long __this__nativeId);

/**
Returns a pointer to the first pixel data. This is equivalent to scanLine(0). <p>Note that QImage uses {@link <a href="../shared.html">implicit data sharing</a>}. This function performs a deep copy of the shared pixel data, thus ensuring that this QImage is the only one using the current return value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#scanLine(int) scanLine()}, and {@link com.trolltech.qt.gui.QImage#numBytes() numBytes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.QNativePointer bits()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bits(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_bits(long __this__nativeId);

/**
Returns the number of bytes per image scanline. <p>This is equivalent to {@link com.trolltech.qt.gui.QImage#numBytes() numBytes()}/ {@link com.trolltech.qt.gui.QImage#height() height()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#scanLine(int) scanLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int bytesPerLine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesPerLine(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bytesPerLine(long __this__nativeId);

/**
Returns a number that identifies the contents of this QImage object. Distinct QImage objects can only have the same key if they refer to the same contents. <p>The key will change when the image is altered.
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
Returns the color in the color table at index <tt>i</tt>. The first color is at index 0. <p>The colors in an image's color table are specified as ARGB quadruplets (QRgb). Use the qAlpha(), qRed(), qGreen(), and qBlue() functions to get the color value components. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setColor(int, int) setColor()}, {@link com.trolltech.qt.gui.QImage#pixelIndex(com.trolltech.qt.core.QPoint) pixelIndex()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int color(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color_int(nativeId(), i);
    }
    @QtBlockedSlot
    native int __qt_color_int(long __this__nativeId, int i);

/**
Returns a list of the colors contained in the image's color table, or an empty list if the image does not have a color table <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QImage#setColorTable(java.util.List) setColorTable()}, {@link com.trolltech.qt.gui.QImage#numColors() numColors()}, and {@link com.trolltech.qt.gui.QImage#color(int) color()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> colorTable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colorTable(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_colorTable(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.convertToFormat(f, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Returns a copy of the image in the given <tt>format</tt>. <p>The specified image conversion <tt>flags</tt> control how the image data is handled during the conversion process. <p><DT><b>See also:</b><br><DD>Image Format. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f) {
        return convertToFormat(f, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Returns a copy of the image in the given <tt>format</tt>. <p>The specified image conversion <tt>flags</tt> control how the image data is handled during the conversion process. <p><DT><b>See also:</b><br><DD>Image Format. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_convertToFormat_Format_ImageConversionFlags(nativeId(), f.value(), flags.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_convertToFormat_Format_ImageConversionFlags(long __this__nativeId, int f, int flags);


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f, java.util.List<java.lang.Integer> colorTable, com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.convertToFormat(f, colorTable, new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Returns a copy of the image in the given <tt>format</tt>. <p>The specified image conversion <tt>flags</tt> control how the image data is handled during the conversion process. <p><DT><b>See also:</b><br><DD>Image Format. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f, java.util.List<java.lang.Integer> colorTable) {
        return convertToFormat(f, colorTable, new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Returns a copy of the image in the given <tt>format</tt>. <p>The specified image conversion <tt>flags</tt> control how the image data is handled during the conversion process. <p><DT><b>See also:</b><br><DD>Image Format. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage convertToFormat(com.trolltech.qt.gui.QImage.Format f, java.util.List<java.lang.Integer> colorTable, com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_convertToFormat_Format_List_ImageConversionFlags(nativeId(), f.value(), colorTable, flags.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_convertToFormat_Format_List_ImageConversionFlags(long __this__nativeId, int f, java.util.List<java.lang.Integer> colorTable, int flags);


/**
Returns a sub-area of the image as a new image. <p>The returned image is copied from the position (<tt>rectangle</tt>.x(), <tt>rectangle</tt>.y()) in this image, and will always have the size of the given <tt>rectangle</tt>. <p>In areas beyond this image, pixels are set to 0. For 32-bit RGB images, this means black; for 32-bit ARGB images, this means transparent black; for 8-bit images, this means the color with index 0 in the color table which can be anything; for 1-bit images, this means {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 }. <p>If the given <tt>rectangle</tt> is a null rectangle the entire image is copied. <p><DT><b>See also:</b><br><DD>QImage(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage copy() {
        return copy((com.trolltech.qt.core.QRect)new com.trolltech.qt.core.QRect());
    }
/**
Returns a sub-area of the image as a new image. <p>The returned image is copied from the position (<tt>rectangle</tt>.x(), <tt>rectangle</tt>.y()) in this image, and will always have the size of the given <tt>rectangle</tt>. <p>In areas beyond this image, pixels are set to 0. For 32-bit RGB images, this means black; for 32-bit ARGB images, this means transparent black; for 8-bit images, this means the color with index 0 in the color table which can be anything; for 1-bit images, this means {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 }. <p>If the given <tt>rectangle</tt> is a null rectangle the entire image is copied. <p><DT><b>See also:</b><br><DD>QImage(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage copy(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_copy_QRect(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>The returned image is copied from the position (<tt>x</tt>, <tt>y</tt>) in this image, and will always have the given <tt>width</tt> and <tt>height</tt>. In areas beyond this image, pixels are set to 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage copy(int x, int y, int w, int h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_copy_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag ... flags) {
        return this.createAlphaMask(new com.trolltech.qt.core.Qt.ImageConversionFlags(flags));
    }

/**
Builds and returns a 1-bpp mask from the alpha buffer in this image. Returns a null image if the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_RGB32 }. <p>The <tt>flags</tt> argument is a bitwise-OR of the Qt::ImageConversionFlags, and controls the conversion process. Passing 0 for flags sets all the default options. <p>The returned image has little-endian bit order (i.e. the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_MonoLSB }), which you can convert to big-endian ({@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono }) using the {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createHeuristicMask() createHeuristicMask()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createAlphaMask() {
        return createAlphaMask(new com.trolltech.qt.core.Qt.ImageConversionFlags(0));
    }
/**
Builds and returns a 1-bpp mask from the alpha buffer in this image. Returns a null image if the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_RGB32 }. <p>The <tt>flags</tt> argument is a bitwise-OR of the Qt::ImageConversionFlags, and controls the conversion process. Passing 0 for flags sets all the default options. <p>The returned image has little-endian bit order (i.e. the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_MonoLSB }), which you can convert to big-endian ({@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono }) using the {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createHeuristicMask() createHeuristicMask()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createAlphaMask_ImageConversionFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_createAlphaMask_ImageConversionFlags(long __this__nativeId, int flags);


/**
Creates and returns a 1-bpp heuristic mask for this image. <p>The function works by selecting a color from one of the corners, then chipping away pixels of that color starting at all the edges. The four corners vote for which color is to be masked away. In case of a draw (this generally means that this function is not applicable to the image), the result is arbitrary. <p>The returned image has little-endian bit order (i.e. the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_MonoLSB }), which you can convert to big-endian ({@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono }) using the {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()} function. <p>If <tt>clipTight</tt> is true (the default) the mask is just large enough to cover the pixels; otherwise, the mask is larger than the data pixels. <p>Note that this function disregards the alpha buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag[]) createAlphaMask()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createHeuristicMask() {
        return createHeuristicMask((boolean)true);
    }
/**
Creates and returns a 1-bpp heuristic mask for this image. <p>The function works by selecting a color from one of the corners, then chipping away pixels of that color starting at all the edges. The four corners vote for which color is to be masked away. In case of a draw (this generally means that this function is not applicable to the image), the result is arbitrary. <p>The returned image has little-endian bit order (i.e. the image's format is {@link com.trolltech.qt.gui.QImage.Format QImage::Format_MonoLSB }), which you can convert to big-endian ({@link com.trolltech.qt.gui.QImage.Format QImage::Format_Mono }) using the {@link com.trolltech.qt.gui.QImage#convertToFormat(com.trolltech.qt.gui.QImage.Format, com.trolltech.qt.core.Qt.ImageConversionFlag[]) convertToFormat()} function. <p>If <tt>clipTight</tt> is true (the default) the mask is just large enough to cover the pixels; otherwise, the mask is larger than the data pixels. <p>Note that this function disregards the alpha buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag[]) createAlphaMask()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createHeuristicMask(boolean clipTight)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createHeuristicMask_boolean(nativeId(), clipTight);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_createHeuristicMask_boolean(long __this__nativeId, boolean clipTight);


/**
Creates and returns a mask for this image based on the given <tt>color</tt> value. If the <tt>mode</tt> is MaskInColor (the default value), all pixels matching <tt>color</tt> will be opaque pixels in the mask. If <tt>mode</tt> is MaskOutColor, all pixels matching the given color will be transparent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag[]) createAlphaMask()}, and {@link com.trolltech.qt.gui.QImage#createHeuristicMask() createHeuristicMask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createMaskFromColor(int color) {
        return createMaskFromColor(color, com.trolltech.qt.core.Qt.MaskMode.MaskInColor);
    }
/**
Creates and returns a mask for this image based on the given <tt>color</tt> value. If the <tt>mode</tt> is MaskInColor (the default value), all pixels matching <tt>color</tt> will be opaque pixels in the mask. If <tt>mode</tt> is MaskOutColor, all pixels matching the given color will be transparent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#createAlphaMask(com.trolltech.qt.core.Qt.ImageConversionFlag[]) createAlphaMask()}, and {@link com.trolltech.qt.gui.QImage#createHeuristicMask() createHeuristicMask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage createMaskFromColor(int color, com.trolltech.qt.core.Qt.MaskMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createMaskFromColor_int_MaskMode(nativeId(), color, mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_createMaskFromColor_int_MaskMode(long __this__nativeId, int color, int mode);

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
Returns the number of pixels that fit horizontally in a physical meter. Together with {@link com.trolltech.qt.gui.QImage#dotsPerMeterY() dotsPerMeterY()}, this number defines the intended scale and aspect ratio of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setDotsPerMeterX(int) setDotsPerMeterX()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dotsPerMeterX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dotsPerMeterX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dotsPerMeterX(long __this__nativeId);

/**
Returns the number of pixels that fit vertically in a physical meter. Together with {@link com.trolltech.qt.gui.QImage#dotsPerMeterX() dotsPerMeterX()}, this number defines the intended scale and aspect ratio of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setDotsPerMeterY(int) setDotsPerMeterY()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dotsPerMeterY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dotsPerMeterY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dotsPerMeterY(long __this__nativeId);

/**
Fills the entire image with the given <tt>pixelValue</tt>. <p>If the depth of this image is 1, only the lowest bit is used. If you say fill(0), fill(2), etc., the image is filled with 0s. If you say fill(1), fill(3), etc., the image is filled with 1s. If the depth is 8, the lowest 8 bits are used and if the depth is 16 the lowest 16 bits are used. <p>Note: {@link com.trolltech.qt.gui.QImage#pixel(com.trolltech.qt.core.QPoint) QImage::pixel()} returns the color of the pixel at the given coordinates while QColor::pixel() returns the pixel value of the underlying window system (essentially an index value), so normally you will want to use {@link com.trolltech.qt.gui.QImage#pixel(com.trolltech.qt.core.QPoint) QImage::pixel()} to use a color from an existing image or {@link com.trolltech.qt.gui.QColor#rgb() QColor::rgb()} to use a specific color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#depth() depth()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fill(int pixel)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fill_int(nativeId(), pixel);
    }
    @QtBlockedSlot
    native void __qt_fill_int(long __this__nativeId, int pixel);

/**
Returns the format of the image. <p><DT><b>See also:</b><br><DD>Image Formats. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage.Format format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QImage.Format.resolve(__qt_format(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_format(long __this__nativeId);

/**
Returns true if the image has a format that respects the alpha channel, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#alphaChannel() alphaChannel()}, and Image Information. <br></DD></DT>
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
Inverts all pixel values in the image. <p>The given invert <tt>mode</tt> only have a meaning when the image's depth is 32. The default <tt>mode</tt> is {@link com.trolltech.qt.gui.QImage.InvertMode InvertRgb }, which leaves the alpha channel unchanged. If the <tt>mode</tt> is {@link com.trolltech.qt.gui.QImage.InvertMode InvertRgba }, the alpha bits are also inverted. <p>Inverting an 8-bit image means to replace all pixels using color index i with a pixel using color index 255 minus i. The same is the case for a 1-bit image. Note that the color table is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void invertPixels() {
        invertPixels(com.trolltech.qt.gui.QImage.InvertMode.InvertRgb);
    }
/**
Inverts all pixel values in the image. <p>The given invert <tt>mode</tt> only have a meaning when the image's depth is 32. The default <tt>mode</tt> is {@link com.trolltech.qt.gui.QImage.InvertMode InvertRgb }, which leaves the alpha channel unchanged. If the <tt>mode</tt> is {@link com.trolltech.qt.gui.QImage.InvertMode InvertRgba }, the alpha bits are also inverted. <p>Inverting an 8-bit image means to replace all pixels using color index i with a pixel using color index 255 minus i. The same is the case for a 1-bit image. Note that the color table is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void invertPixels(com.trolltech.qt.gui.QImage.InvertMode arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invertPixels_InvertMode(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_invertPixels_InvertMode(long __this__nativeId, int arg__1);

/**
For 32-bit images, this function is equivalent to {@link com.trolltech.qt.gui.QImage#allGray() allGray()}. <p>For 8-bpp images, this function returns true if color(i) is QRgb(i, i, i) for all indexes of the color table; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#allGray() allGray()}, and Image Formats. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isGrayscale()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isGrayscale(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isGrayscale(long __this__nativeId);

/**
Returns true if it is a null image, otherwise returns false. <p>A null image has all parameters set to zero and no allocated data.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

    @QtBlockedSlot
    private final boolean load(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.QNativePointer format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_QIODevice_nativepointer(nativeId(), device == null ? 0 : device.nativeId(), format);
    }
    @QtBlockedSlot
    native boolean __qt_load_QIODevice_nativepointer(long __this__nativeId, long device, com.trolltech.qt.QNativePointer format);

    @QtBlockedSlot
    private final boolean load(java.lang.String fileName, com.trolltech.qt.QNativePointer format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_String_nativepointer(nativeId(), fileName, format);
    }
    @QtBlockedSlot
    native boolean __qt_load_String_nativepointer(long __this__nativeId, java.lang.String fileName, com.trolltech.qt.QNativePointer format);

    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.QNativePointer aformat)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadFromData_QByteArray_nativepointer(nativeId(), data == null ? 0 : data.nativeId(), aformat);
    }
    @QtBlockedSlot
    native boolean __qt_loadFromData_QByteArray_nativepointer(long __this__nativeId, long data, com.trolltech.qt.QNativePointer aformat);

    @QtBlockedSlot
    private final boolean loadFromData(com.trolltech.qt.QNativePointer buf, int len, com.trolltech.qt.QNativePointer format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadFromData_nativepointer_int_nativepointer(nativeId(), buf, len, format);
    }
    @QtBlockedSlot
    native boolean __qt_loadFromData_nativepointer_int_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer buf, int len, com.trolltech.qt.QNativePointer format);

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
Returns a mirror of the image, mirrored in the horizontal and/or the vertical direction depending on whether <tt>horizontal</tt> and <tt>vertical</tt> are set to true or false. <p>Note that the original image is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage mirrored(boolean horizontally) {
        return mirrored(horizontally, (boolean)true);
    }

/**
Returns a mirror of the image, mirrored in the horizontal and/or the vertical direction depending on whether <tt>horizontal</tt> and <tt>vertical</tt> are set to true or false. <p>Note that the original image is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage mirrored() {
        return mirrored((boolean)false, (boolean)true);
    }
/**
Returns a mirror of the image, mirrored in the horizontal and/or the vertical direction depending on whether <tt>horizontal</tt> and <tt>vertical</tt> are set to true or false. <p>Note that the original image is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage mirrored(boolean horizontally, boolean vertically)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mirrored_boolean_boolean(nativeId(), horizontally, vertically);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_mirrored_boolean_boolean(long __this__nativeId, boolean horizontally, boolean vertically);

/**
Returns the number of bytes occupied by the image data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#bytesPerLine() bytesPerLine()}, {@link com.trolltech.qt.gui.QImage#bits() bits()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int numBytes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numBytes(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numBytes(long __this__nativeId);

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
Returns the number of pixels by which the image is intended to be offset by when positioning relative to other images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setOffset(com.trolltech.qt.core.QPoint) setOffset()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint offset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_offset(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_offset(long __this__nativeId);

/**
<brief>Writes thisQImage
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QImage arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QImage(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QImage(long __this__nativeId, long arg__1);

/**
<brief>Reads a QImage
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
Returns the color of the pixel at the given <tt>position</tt>. <p>If the <tt>position</tt> is not valid, the results are undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setPixel(com.trolltech.qt.core.QPoint, int) setPixel()}, {@link com.trolltech.qt.gui.QImage#valid(com.trolltech.qt.core.QPoint) valid()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pixel(com.trolltech.qt.core.QPoint pt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixel_QPoint(nativeId(), pt == null ? 0 : pt.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixel_QPoint(long __this__nativeId, long pt);

/**
This is an overloaded member function, provided for convenience. <p>Returns the color of the pixel at coordinates (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final int pixel(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixel_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native int __qt_pixel_int_int(long __this__nativeId, int x, int y);

/**
Returns the pixel index at the given <tt>position</tt>. <p>If <tt>position</tt> is not valid, or if the image is not a paletted image ({@link com.trolltech.qt.gui.QImage#depth() depth()} &gt; 8), the results are undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#valid(com.trolltech.qt.core.QPoint) valid()}, {@link com.trolltech.qt.gui.QImage#depth() depth()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pixelIndex(com.trolltech.qt.core.QPoint pt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelIndex_QPoint(nativeId(), pt == null ? 0 : pt.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixelIndex_QPoint(long __this__nativeId, long pt);

/**
This is an overloaded member function, provided for convenience. <p>Returns the pixel index at (<tt>x</tt>, <tt>y</tt>).
*/

    @QtBlockedSlot
    public final int pixelIndex(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelIndex_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native int __qt_pixelIndex_int_int(long __this__nativeId, int x, int y);

/**
Returns the enclosing rectangle (0, 0, {@link com.trolltech.qt.gui.QImage#width() width()}, {@link com.trolltech.qt.gui.QImage#height() height()}) of the image. <p><DT><b>See also:</b><br><DD>Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect(long __this__nativeId);

/**
Returns a QImage in which the values of the red and blue components of all pixels have been swapped, effectively converting an RGB image to an BGR image. <p>The original QImage is not changed. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage rgbSwapped()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rgbSwapped(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_rgbSwapped(long __this__nativeId);

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
Returns a copy of the image scaled to a rectangle defined by the given <tt>size</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the image is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the image is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the image is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#isNull() isNull()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(com.trolltech.qt.core.QSize s, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode) {
        return scaled(s, aspectMode, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }

/**
Returns a copy of the image scaled to a rectangle defined by the given <tt>size</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the image is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the image is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the image is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#isNull() isNull()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(com.trolltech.qt.core.QSize s) {
        return scaled(s, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a copy of the image scaled to a rectangle defined by the given <tt>size</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <br><center><img src="../images/qimage-scaling.png"></center><br> <ul><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::IgnoreAspectRatio }, the image is scaled to <tt>size</tt>.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatio }, the image is scaled to a rectangle as large as possible inside <tt>size</tt>, preserving the aspect ratio.</li><li> If <tt>aspectRatioMode</tt> is {@link com.trolltech.qt.core.Qt.AspectRatioMode Qt::KeepAspectRatioByExpanding }, the image is scaled to a rectangle as small as possible outside <tt>size</tt>, preserving the aspect ratio.</li></ul> If the given <tt>size</tt> is empty, this function returns a null image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#isNull() isNull()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(com.trolltech.qt.core.QSize s, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaled_QSize_AspectRatioMode_TransformationMode(nativeId(), s == null ? 0 : s.nativeId(), aspectMode.value(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_scaled_QSize_AspectRatioMode_TransformationMode(long __this__nativeId, long s, int aspectMode, int mode);


/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the image scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null image.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(int w, int h, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode) {
        return scaled(w, h, aspectMode, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the image scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null image.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(int w, int h) {
        return scaled(w, h, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a copy of the image scaled to a rectangle with the given <tt>width</tt> and <tt>height</tt> according to the given <tt>aspectRatioMode</tt> and <tt>transformMode</tt>. <p>If either the <tt>width</tt> or the <tt>height</tt> is zero or negative, this function returns a null image.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaled(int w, int h, com.trolltech.qt.core.Qt.AspectRatioMode aspectMode, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaled_int_int_AspectRatioMode_TransformationMode(nativeId(), w, h, aspectMode.value(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_scaled_int_int_AspectRatioMode_TransformationMode(long __this__nativeId, int w, int h, int aspectMode, int mode);


/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>height</tt> using the specified transformation <tt>mode</tt>. <p>This function automatically calculates the width of the image so that the ratio of the image is preserved. <p>If the given <tt>height</tt> is 0 or negative, a null image is returned. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaledToHeight(int h) {
        return scaledToHeight(h, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>height</tt> using the specified transformation <tt>mode</tt>. <p>This function automatically calculates the width of the image so that the ratio of the image is preserved. <p>If the given <tt>height</tt> is 0 or negative, a null image is returned. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaledToHeight(int h, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledToHeight_int_TransformationMode(nativeId(), h, mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_scaledToHeight_int_TransformationMode(long __this__nativeId, int h, int mode);


/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>width</tt> using the specified transformation <tt>mode</tt>. <p>This function automatically calculates the height of the image so that its aspect ratio is preserved. <p>If the given <tt>width</tt> is 0 or negative, a null image is returned. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaledToWidth(int w) {
        return scaledToWidth(w, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a scaled copy of the image. The returned image is scaled to the given <tt>width</tt> using the specified transformation <tt>mode</tt>. <p>This function automatically calculates the height of the image so that its aspect ratio is preserved. <p>If the given <tt>width</tt> is 0 or negative, a null image is returned. <p><DT><b>See also:</b><br><DD>Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage scaledToWidth(int w, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledToWidth_int_TransformationMode(nativeId(), w, mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_scaledToWidth_int_TransformationMode(long __this__nativeId, int w, int mode);

/**
Returns a pointer to the pixel data at the scanline with index <tt>i</tt>. The first scanline is at index 0. <p>The scanline data is aligned on a 32-bit boundary. <p><b>Warning:</b> If you are accessing 32-bpp image data, cast the returned pointer to <tt>QRgb*</tt> (QRgb has a 32-bit size) and use it to read/write the pixel value. You cannot use the <tt>uchar*</tt> pointer directly, because the pixel format depends on the byte order on the underlying platform. Use qRed(), qGreen(), qBlue(), and qAlpha() to access the pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#bytesPerLine() bytesPerLine()}, {@link com.trolltech.qt.gui.QImage#bits() bits()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.QNativePointer scanLine(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scanLine_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_scanLine_int(long __this__nativeId, int arg__1);

/**
Sets the alpha channel of this image to the given <tt>alphaChannel</tt>. <p>If <tt>alphaChannel</tt> is an 8 bit grayscale image, the intensity values are written into this buffer directly. Otherwise, <tt>alphaChannel</tt> is converted to 32 bit and the intensity of the RGB pixel values is used. <p>Note that the image will be converted to the {@link com.trolltech.qt.gui.QImage.Format Format_ARGB32_Premultiplied } format if the function succeeds. <p>Use one of the composition mods in {@link com.trolltech.qt.gui.QPainter.CompositionMode QPainter::CompositionMode } instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#alphaChannel() alphaChannel()}, Image Transformations, and Image Formats. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlphaChannel(com.trolltech.qt.gui.QImage alphaChannel)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlphaChannel_QImage(nativeId(), alphaChannel == null ? 0 : alphaChannel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setAlphaChannel_QImage(long __this__nativeId, long alphaChannel);

/**
Sets the color at the given <tt>index</tt> in the color table, to the given to <tt>colorValue</tt>. The color value is an ARGB quadruplet. <p>If <tt>index</tt> is outside the current size of the color table, it is expanded with {@link com.trolltech.qt.gui.QImage#setNumColors(int) setNumColors()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#color(int) color()}, {@link com.trolltech.qt.gui.QImage#numColors() numColors()}, {@link com.trolltech.qt.gui.QImage#setColorTable(java.util.List) setColorTable()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(int i, int c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_int_int(nativeId(), i, c);
    }
    @QtBlockedSlot
    native void __qt_setColor_int_int(long __this__nativeId, int i, int c);

/**
Sets the color table used to translate color indexes to QRgb values, to the specified <tt>colors</tt>. <p>When the image is used, the color table must be large enough to have entries for all the pixel/index values present in the image, otherwise the results are undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#colorTable() colorTable()}, {@link com.trolltech.qt.gui.QImage#setColor(int, int) setColor()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColorTable(java.util.List<java.lang.Integer> colors)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColorTable_List(nativeId(), colors);
    }
    @QtBlockedSlot
    native void __qt_setColorTable_List(long __this__nativeId, java.util.List<java.lang.Integer> colors);

/**
Sets the number of pixels that fit horizontally in a physical meter, to <tt>x</tt>. <p>Together with {@link com.trolltech.qt.gui.QImage#dotsPerMeterY() dotsPerMeterY()}, this number defines the intended scale and aspect ratio of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#dotsPerMeterX() dotsPerMeterX()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDotsPerMeterX(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDotsPerMeterX_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDotsPerMeterX_int(long __this__nativeId, int arg__1);

/**
Sets the number of pixels that fit vertically in a physical meter, to <tt>y</tt>. <p>Together with {@link com.trolltech.qt.gui.QImage#dotsPerMeterX() dotsPerMeterX()}, this number defines the intended scale and aspect ratio of the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#dotsPerMeterY() dotsPerMeterY()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDotsPerMeterY(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDotsPerMeterY_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDotsPerMeterY_int(long __this__nativeId, int arg__1);

/**
Resizes the color table to contain <tt>numColors</tt> entries. <p>If the color table is expanded, all the extra colors will be set to transparent (i.e qRgba(0, 0, 0, 0)). <p>When the image is used, the color table must be large enough to have entries for all the pixel/index values present in the image, otherwise the results are undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#numColors() numColors()}, {@link com.trolltech.qt.gui.QImage#colorTable() colorTable()}, {@link com.trolltech.qt.gui.QImage#setColor(int, int) setColor()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumColors(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumColors_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setNumColors_int(long __this__nativeId, int arg__1);

/**
Sets the the number of pixels by which the image is intended to be offset by when positioning relative to other images, to <tt>offset</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#offset() offset()}, and Image Information. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOffset(com.trolltech.qt.core.QPoint arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOffset_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setOffset_QPoint(long __this__nativeId, long arg__1);

/**
Sets the pixel index or color at the given <tt>position</tt> to <tt>index_or_rgb</tt>. <p>If the image's format is either monochrome or 8-bit, the given <tt>index_or_rgb</tt> value must be an index in the image's color table, otherwise the parameter must be a QRgb value. <p>If <tt>position</tt> is not a valid coordinate pair in the image, or if <tt>index_or_rgb</tt> &gt;= {@link com.trolltech.qt.gui.QImage#numColors() numColors()} in the case of monochrome and 8-bit images, the result is undefined. <p><b>Warning:</b> This function is expensive due to the call of the internal <tt>detach()</tt> function called within; if performance is a concern, we recommend the use of {@link com.trolltech.qt.gui.QImage#scanLine(int) scanLine()} to access pixel data directly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#pixel(com.trolltech.qt.core.QPoint) pixel()}, and Pixel Manipulation. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixel(com.trolltech.qt.core.QPoint pt, int index_or_rgb)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixel_QPoint_int(nativeId(), pt == null ? 0 : pt.nativeId(), index_or_rgb);
    }
    @QtBlockedSlot
    native void __qt_setPixel_QPoint_int(long __this__nativeId, long pt, int index_or_rgb);

/**
This is an overloaded member function, provided for convenience. <p>Sets the pixel index or color at (<tt>x</tt>, <tt>y</tt>) to <tt>index_or_rgb</tt>.
*/

    @QtBlockedSlot
    public final void setPixel(int x, int y, int index_or_rgb)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixel_int_int_int(nativeId(), x, y, index_or_rgb);
    }
    @QtBlockedSlot
    native void __qt_setPixel_int_int_int(long __this__nativeId, int x, int y, int index_or_rgb);

/**
Sets the image text to the given <tt>text</tt> and associate it with the given <tt>key</tt>. <p>If you just want to store a single text block (i.e., a "comment" or just a description), you can either pass an empty key, or use a generic key like "Description". <p>The image text is embedded into the image data when you call {@link com.trolltech.qt.gui.QImage#save(java.lang.String, java.lang.String, int) save()} or {@link com.trolltech.qt.gui.QImageWriter#write(com.trolltech.qt.gui.QImage) QImageWriter::write()}. <p>Not all image formats support embedded text. You can find out if a specific image or format supports embedding text by using {@link com.trolltech.qt.gui.QImageWriter#supportsOption(com.trolltech.qt.gui.QImageIOHandler.ImageOption) QImageWriter::supportsOption()}. We give an example: <pre class="snippet">
    QImageWriter writer;
    writer.setFormat("png");
    if (writer.supportsOption(QImageIOHandler::Description))
        qDebug() &lt;&lt; "Png supports embedded text";
</pre> You can use {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} to find out which image formats are available to you. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#text() text()}, and {@link com.trolltech.qt.gui.QImage#textKeys() textKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String key, java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String_String(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_setText_String_String(long __this__nativeId, java.lang.String key, java.lang.String value);

/**
Returns the size of the image, i. . its {@link com.trolltech.qt.gui.QImage#width() width()} and {@link com.trolltech.qt.gui.QImage#height() height()}. <p><DT><b>See also:</b><br><DD>Image Information. <br></DD></DT>
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
Returns the image text associated with the given <tt>key</tt>. If the specified <tt>key</tt> is an empty string, the whole image text is returned, with each key-text pair separated by a newline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setText(java.lang.String, java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QImage#textKeys() textKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text() {
        return text((java.lang.String)null);
    }
/**
Returns the image text associated with the given <tt>key</tt>. If the specified <tt>key</tt> is an empty string, the whole image text is returned, with each key-text pair separated by a newline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#setText(java.lang.String, java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QImage#textKeys() textKeys()}. <br></DD></DT>
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
Returns the text keys for this image. <p>You can use these keys with {@link com.trolltech.qt.gui.QImage#text() text()} to list the image text for a certain key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#text() text()}. <br></DD></DT>
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
Returns a copy of the image that is transformed using the given transformation <tt>matrix</tt> and transformation <tt>mode</tt>. <p>The transformation <tt>matrix</tt> is internally adjusted to compensate for unwanted translation; i.e. the image produced is the smallest image that contains all the transformed points of the original image. Use the {@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function to retrieve the actual matrix used for transforming an image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage transformed(com.trolltech.qt.gui.QMatrix matrix) {
        return transformed(matrix, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a copy of the image that is transformed using the given transformation <tt>matrix</tt> and transformation <tt>mode</tt>. <p>The transformation <tt>matrix</tt> is internally adjusted to compensate for unwanted translation; i.e. the image produced is the smallest image that contains all the transformed points of the original image. Use the {@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function to retrieve the actual matrix used for transforming an image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage transformed(com.trolltech.qt.gui.QMatrix matrix, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QMatrix_TransformationMode(nativeId(), matrix == null ? 0 : matrix.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_transformed_QMatrix_TransformationMode(long __this__nativeId, long matrix, int mode);


/**
Returns a copy of the image that is transformed using the given transformation <tt>matrix</tt> and transformation <tt>mode</tt>. <p>The transformation <tt>matrix</tt> is internally adjusted to compensate for unwanted translation; i.e. the image produced is the smallest image that contains all the transformed points of the original image. Use the {@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function to retrieve the actual matrix used for transforming an image. <p>Unlike the other overload, this function can be used to perform perspective transformations on images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage transformed(com.trolltech.qt.gui.QTransform matrix) {
        return transformed(matrix, com.trolltech.qt.core.Qt.TransformationMode.FastTransformation);
    }
/**
Returns a copy of the image that is transformed using the given transformation <tt>matrix</tt> and transformation <tt>mode</tt>. <p>The transformation <tt>matrix</tt> is internally adjusted to compensate for unwanted translation; i.e. the image produced is the smallest image that contains all the transformed points of the original image. Use the {@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()} function to retrieve the actual matrix used for transforming an image. <p>Unlike the other overload, this function can be used to perform perspective transformations on images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#trueMatrix(com.trolltech.qt.gui.QMatrix, int, int) trueMatrix()}, and Image Transformations. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage transformed(com.trolltech.qt.gui.QTransform matrix, com.trolltech.qt.core.Qt.TransformationMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transformed_QTransform_TransformationMode(nativeId(), matrix == null ? 0 : matrix.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_transformed_QTransform_TransformationMode(long __this__nativeId, long matrix, int mode);

/**
Returns true if <tt>pos</tt> is a valid coordinate pair within the image; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#rect() rect()}, and {@link com.trolltech.qt.core.QRect#contains(com.trolltech.qt.core.QPoint) QRect::contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean valid(com.trolltech.qt.core.QPoint pt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valid_QPoint(nativeId(), pt == null ? 0 : pt.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_valid_QPoint(long __this__nativeId, long pt);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if {@link com.trolltech.qt.core.QPoint QPoint}(<tt>x</tt>, <tt>y</tt>) is a valid coordinate pair within the image; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean valid(int x, int y)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valid_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native boolean __qt_valid_int_int(long __this__nativeId, int x, int y);

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

    private static com.trolltech.qt.gui.QImage fromData(com.trolltech.qt.core.QByteArray data, com.trolltech.qt.QNativePointer format)    {
        return __qt_fromData_QByteArray_nativepointer(data == null ? 0 : data.nativeId(), format);
    }
    native static com.trolltech.qt.gui.QImage __qt_fromData_QByteArray_nativepointer(long data, com.trolltech.qt.QNativePointer format);

/**
Returns the actual matrix used for transforming an image with the given <tt>width</tt>, <tt>height</tt> and <tt>matrix</tt>. <p>When transforming an image using the {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} function, the transformation matrix is internally adjusted to compensate for unwanted translation, i.e. {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} returns the smallest image containing all transformed points of the original image. This function returns the modified matrix, which maps points correctly from the original image into the new image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()}, and Image Transformations. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QMatrix trueMatrix(com.trolltech.qt.gui.QMatrix arg__1, int w, int h)    {
        return __qt_trueMatrix_QMatrix_int_int(arg__1 == null ? 0 : arg__1.nativeId(), w, h);
    }
    native static com.trolltech.qt.gui.QMatrix __qt_trueMatrix_QMatrix_int_int(long arg__1, int w, int h);

/**
Returns the actual matrix used for transforming an image with the given <tt>width</tt>, <tt>height</tt> and <tt>matrix</tt>. <p>When transforming an image using the {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} function, the transformation matrix is internally adjusted to compensate for unwanted translation, i.e. {@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()} returns the smallest image containing all transformed points of the original image. This function returns the modified matrix, which maps points correctly from the original image into the new image. <p>Unlike the other overload, this function creates transformation matrices that can be used to perform perspective transformations on images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#transformed(com.trolltech.qt.gui.QMatrix) transformed()}, and Image Transformations. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QTransform trueMatrix(com.trolltech.qt.gui.QTransform arg__1, int w, int h)    {
        return __qt_trueMatrix_QTransform_int_int(arg__1 == null ? 0 : arg__1.nativeId(), w, h);
    }
    native static com.trolltech.qt.gui.QTransform __qt_trueMatrix_QTransform_int_int(long arg__1, int w, int h);

/**
@exclude
*/

    public static native QImage fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QImage(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QImage array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QImage)
        return operator_equal((com.trolltech.qt.gui.QImage) other);
        return false;
    }


    public QImage(String xpm[]) {
        this(com.trolltech.qt.QNativePointer.createCharPointerPointer(xpm));
    }

/**
Returns a copy of the image data.

@return
*/

    public final byte[] copyOfBytes() {
        QNativePointer bits = bits();
        byte bytes[] = new byte[numBytes()];
        for (int i = 0; i < bytes.length; ++i)
            bytes[i] = bits.byteAt(i);
        return bytes;
    }

/**
Constructs an image with the given <tt>width</tt>, <tt>height</tt>, <tt>depth</tt>, <tt>bytesPerLine</tt>, <tt>colortable</tt>, <tt>numColors</tt> and <tt>bitOrder</tt>, that uses an existing memory buffer, <tt>data</tt>. The image does not delete the buffer at destruction. <p><b>Warning:</b> This constructor is only available in Qt for Embedded Linux. <p>The data has to be 32-bit aligned, and each scanline of data in the image must also be 32-bit aligned, so it's no longer possible to specify a custom <tt>bytesPerLine</tt> value.
*/

    public QImage(byte data[], int width, int height, Format format) {
        this(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), width, height, format);
    }

/**
Constructs an image and tries to load the image from the file with the
given <tt>fileName</tt>.
<p>
The loader attempts to read the image using the specified
<tt>format</tt>. If the <tt>format</tt> is not specified (which is the
default), the loader probes the file for a header to guess the file
format.
<p>
If the loading of the image failed, this object is a null image.
<p>
The file name can either refer to an actual file on disk or to one of
the application's embedded resources. See the
\l{resources.html}{Resource System} overview for details on how to
embed images and other resource files in the application's executable.
*/

    public QImage(String fileName, String format) {
        this(fileName, format == null ? null : QNativePointer.createCharPointer(format));
    }

/**
This is an overloaded constructor provided for convenience.
*/

/**
Constructs an image from the given <tt>xpm</tt> image. <p>Make sure that the image is a valid XPM image. Errors are silently ignored. <p>Note that it's possible to squeeze the XPM variable a little bit by using an unusual declaration: <pre class="snippet">
        String start_xpm[] = {
            "16 15 8 1",
            "a c #cec6bd",
            .... };
</pre> The extra <tt>const</tt> makes the entire definition read-only, which is slightly more efficient (e.g., when the code is in a shared library) and able to be stored in ROM with the application.
*/

    public QImage(String fileName) {
        this(fileName, (String) null);
    }


    // TEMPLATE - gui.pixmap_save - START
/**
Saves the image to the file with the given <tt>fileName</tt>, using the
given image file <tt>format</tt> and <tt>quality</tt> factor. If <tt>format</tt> is
null, QImage will attempt to guess the format by looking at <tt>fileName</tt>'s
suffix.
<p>
The <tt>quality</tt> factor must be in the range 0 to 100 or -1. Specify
0 to obtain small compressed files, 100 for large uncompressed
files, and -1 (the default) to use the default settings.
<p>
Returns true if the image was successfully saved; otherwise
returns false.
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


    // TEMPLATE - gui.pixmap_save - START
/**
This is an overloaded method provided for convenience.
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
This is an overloaded function provided for convenience.
*/

    public final boolean save(com.trolltech.qt.core.QIODevice dev) {
        return save(dev, null);
    }
    // TEMPLATE - gui.pixmap_save - END


    // TEMPLATE - gui.image_load - START
/**
Loads an image from the file with the given <tt>fileName</tt>. Returns
true if the image was successfully loaded; otherwise returns false.
<p>
The loader attempts to read the image using the specified
<tt>format</tt>. If the <tt>format</tt> is null, the loader probes the
file for a header to guess the file format.
<p>
The file name can either refer to an actual file on disk or to one of
the application's embedded resources. See the
\l{resources.html}{Resource System} overview for details on how to
embed images and other resource files in the application's executable.
*/

    public final boolean load(String fileName, String format) {
        return load(fileName, format != null ? QNativePointer.createCharPointer(format) : null);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean load(String fileName) {
        return load(fileName, (String) null);
    }
    // TEMPLATE - gui.image_load - END


    // TEMPLATE - gui.image_load - START
/**
This is an overloaded function provided for convenience.
*/

    public final boolean load(com.trolltech.qt.core.QIODevice device, String format) {
        return load(device, format != null ? QNativePointer.createCharPointer(format) : null);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean load(com.trolltech.qt.core.QIODevice device) {
        return load(device, (String) null);
    }
    // TEMPLATE - gui.image_load - END


    // TEMPLATE - gui.image_load - START
/**
Loads an image from the given {@link com.trolltech.qt.core.QByteArray QByteArray}<tt>data</tt>.
*/

    public final boolean loadFromData(byte[] data, String format) {
        return loadFromData(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), data.length, format != null ? QNativePointer.createCharPointer(format) : null);
    }

/**
Loads an image from the given {@link com.trolltech.qt.core.QByteArray QByteArray}<tt>data</tt>.
*/

    public final boolean loadFromData(byte[] data) {
        return loadFromData(data, (String) null);
    }
    // TEMPLATE - gui.image_load - END


    // TEMPLATE - gui.image_load - START
/**
This is an overloaded method provided for convenience.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data, String format) {
        return loadFromData(data, format != null ? QNativePointer.createCharPointer(format) : null);
    }

/**
This is an overloaded method provided for convenience.
*/

    public final boolean loadFromData(com.trolltech.qt.core.QByteArray data) {
        return loadFromData(data, (String) null);
    }
    // TEMPLATE - gui.image_load - END


    // TEMPLATE - gui.image_load - START
/**
This is an overloaded method provided for convenience.
<p>
Loads an image from the given QByteArray <tt>data</tt>.
*/

    public static QImage fromData(com.trolltech.qt.core.QByteArray data, String format) {
        return fromData(data, format != null ? QNativePointer.createCharPointer(format) : null);
    }

/**
This is an overloaded method provided for convenience.
<p>
Loads an image from the given QByteArray <tt>data</tt>.
*/

    public static QImage fromData(com.trolltech.qt.core.QByteArray data) {
        return fromData(data, (String) null);
    }
    // TEMPLATE - gui.image_load - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QImage clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QImage __qt_clone(long __this_nativeId);
}
