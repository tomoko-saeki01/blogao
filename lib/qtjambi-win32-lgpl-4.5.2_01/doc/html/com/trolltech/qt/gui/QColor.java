package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QColor class provides colors based on RGB, HSV or CMYK values. A color is normally specified in terms of RGB (red, green, and blue) components, but it is also possible to specify it in terms of HSV (hue, saturation, and value) and CMYK (cyan, magenta, yellow and black) components. In addition a color can be specified using a color name. The color name can be any of the SVG 1.0 color names. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qcolor-rgb.png"></center><br></td><td>  <br><center><img src="../images/qcolor-hsv.png"></center><br></td><td>  <br><center><img src="../images/qcolor-cmyk.png"></center><br></td></tr><thead><tr class="qt-style" valign="top"><th><center> RGB</center></th><th><center> HSV</center></th><th><center> CMYK</center></th></tr></thead></table> The QColor constructor creates the color based on RGB values. To create a QColor based on either HSV or CMYK values, use the {@link com.trolltech.qt.gui.QColor#toHsv() toHsv()} and {@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()} functions respectively. These functions return a copy of the color using the desired format. In addition the static {@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, {@link com.trolltech.qt.gui.QColor#fromHsv(int, int, int) fromHsv()} and {@link com.trolltech.qt.gui.QColor#fromCmyk(int, int, int, int) fromCmyk()} functions create colors from the specified values. Alternatively, a color can be converted to any of the three formats using the {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()} function (returning a copy of the color in the desired format), or any of the {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}, {@link com.trolltech.qt.gui.QColor#setHsv(int, int, int) setHsv()} and {@link com.trolltech.qt.gui.QColor#setCmyk(int, int, int, int) setCmyk()} functions altering this color's format. The {@link com.trolltech.qt.gui.QColor#spec() spec()} function tells how the color was specified. <p>A color can be set by passing an RGB string (such as "#112233"), or a color name (such as "blue"), to the {@link com.trolltech.qt.gui.QColor#setNamedColor(java.lang.String) setNamedColor()} function. The color names are taken from the SVG 1.0 color names. The {@link com.trolltech.qt.gui.QColor#name() name()} function returns the name of the color in the format "#RRGGBB". Colors can also be set using {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}, {@link com.trolltech.qt.gui.QColor#setHsv(int, int, int) setHsv()} and {@link com.trolltech.qt.gui.QColor#setCmyk(int, int, int, int) setCmyk()}. To get a lighter or darker color use the {@link com.trolltech.qt.gui.QColor#lighter() lighter()} and {@link com.trolltech.qt.gui.QColor#darker() darker()} functions respectively. <p>The {@link com.trolltech.qt.gui.QColor#isValid() isValid()} function indicates whether a QColor is legal at all. For example, a RGB color with RGB values out of range is illegal. For performance reasons, QColor mostly disregards illegal colors, and for that reason, the result of using an invalid color is undefined. <p>The color components can be retrieved individually, e.g with {@link com.trolltech.qt.gui.QColor#red() red()}, {@link com.trolltech.qt.gui.QColor#hue() hue()} and {@link com.trolltech.qt.gui.QColor#cyan() cyan()}. The values of the color components can also be retrieved in one go using the getRgb(), getHsv() and getCmyk() functions. Using the RGB color model, the color components can in addition be accessed with {@link com.trolltech.qt.gui.QColor#rgb() rgb()}. <p>There are several related non-members: QRgb is a typdef for an unsigned int representing the RGB value triplet (r, g, b). Note that it also can hold a value for the alpha-channel (for more information, see the Alpha-Blended Drawing section). The qRed(), qBlue() and qGreen() functions return the respective component of the given QRgb value, while the qRgb() and qRgba() functions create and return the QRgb triplet based on the given component values. Finally, the qAlpha() function returns the alpha component of the provided QRgb, and the qGray() function calculates and return a gray value based on the given value. <p>QColor is platform and device independent. The {@link com.trolltech.qt.gui.QColormap QColormap} class maps the color to the hardware. <p>For more information about painting in general, see {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>} documentation. <ul><li> {@link <a href="#integer-vs-floating-point-precision">Integer vs. Floating Point Precision</a>}</li><li> {@link <a href="#alpha-blended-drawing">Alpha-Blended Drawing</a>}</li><li> {@link <a href="#predefined-colors">Predefined Colors</a>}</li><li> {@link <a href="#the-hsv-color-model">The HSV Color Model</a>}</li><li> {@link <a href="#the-cmyk-color-model">The CMYK Color Model</a>}</li></ul><a name="integer-vs-floating-point-precision"><h2>Integer vs. Floating Point Precision</h2> QColor supports floating point precision and provides floating point versions of all the color components functions, e.g. getRgbF(), {@link com.trolltech.qt.gui.QColor#hueF() hueF()} and {@link com.trolltech.qt.gui.QColor#fromCmykF(double, double, double, double) fromCmykF()}. Note that since the components are stored using 16-bit integers, there might be minor deviations between the values set using, for example, {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()} and the values returned by the getRgbF() function due to rounding. <p>While the integer based functions take values in the range 0-255 (except {@link com.trolltech.qt.gui.QColor#hue() hue()} which must have values within the range 0-359), the floating point functions accept values in the range 0.0 - 1.0.<a name="alpha-blended-drawing"><h2>Alpha-Blended Drawing</h2> QColor also support alpha-blended outlining and filling. The alpha channel of a color specifies the transparency effect, 0 represents a fully transparent color, while 255 represents a fully opaque color. For example: <pre class="snippet">
        // Specify semi-transparent red
        painter.setBrush(new QColor(255, 0, 0, 127));
        painter.drawRect(0, 0, width()/2, height());

        // Specify semi-transparent blue
        painter.setBrush(new QColor(0, 0, 255, 127));
        painter.drawRect(0, 0, width(), height()/2);
</pre> The code above produces the following output: <br><center><img src="../images/alphafill.png"></center><br> Alpha-blended drawing is supported on Windows, Mac OS X, and on X11 systems that have the X Render extension installed. <p>The alpha channel of a color can be retrieved and set using the {@link com.trolltech.qt.gui.QColor#alpha() alpha()} and {@link com.trolltech.qt.gui.QColor#setAlpha(int) setAlpha()} functions if its value is an integer, and {@link com.trolltech.qt.gui.QColor#alphaF() alphaF()} and {@link com.trolltech.qt.gui.QColor#setAlphaF(double) setAlphaF()} if its value is qreal (double). By default, the alpha-channel is set to 255 (opaque). To retrieve and set all the RGB color components (including the alpha-channel) in one go, use the {@link com.trolltech.qt.gui.QColor#rgba() rgba()} and {@link com.trolltech.qt.gui.QColor#setRgba(int) setRgba()} functions.<a name="predefined-colors"><h2>Predefined Colors</h2> There are 20 predefined QColors: {@link com.trolltech.qt.core.Qt.GlobalColor Qt::white }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::black }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::red }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkRed }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::green }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkGreen }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::blue }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkBlue }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::cyan }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkCyan }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::magenta }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkMagenta }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::yellow }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkYellow }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::gray }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkGray }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::lightGray }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 }, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 }, and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::transparent }. <br><center><img src="../images/qt-colors.png"></center><br> QColor provides the static {@link com.trolltech.qt.gui.QColor#colorNames() colorNames()} function which returns a QStringList containing the color names Qt knows about. <p>The colors {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } (zero pixel value) and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } (non-zero pixel value) are special colors for drawing in QBitmaps. Painting with {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } sets the bitmap bits to 0 (transparent, i.e. background), and painting with {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } sets the bits to 1 (opaque, i.e. foreground).<a name="the-hsv-color-model"><h2>The HSV Color Model</h2> The RGB model is hardware-oriented. Its representation is close to what most monitors show. In contrast, HSV represents color in a way more suited to the human perception of color. For example, the relationships "stronger than", "darker than", and "the opposite of" are easily expressed in HSV but are much harder to express in RGB. <p>HSV, like RGB, has three components: <ul><li> H, for hue, is in the range 0 to 359 if the color is chromatic (not gray), or meaningless if it is gray. It represents degrees on the color wheel familiar to most people. Red is 0 (degrees), green is 120, and blue is 240. <p> <br><center><img src="../images/qcolor-hue.png"></center><br></li><li> S, for saturation, is in the range 0 to 255, and the bigger it is, the stronger the color is. Grayish colors have saturation near 0; very strong colors have saturation near 255. <p> <br><center><img src="../images/qcolor-saturation.png"></center><br></li><li> V, for value, is in the range 0 to 255 and represents lightness or brightness of the color. 0 is black; 255 is as far from black as possible. <p> <br><center><img src="../images/qcolor-value.png"></center><br></li></ul> Here are some examples: pure red is H=0, S=255, V=255; a dark red, moving slightly towards the magenta, could be H=350 (equivalent to -10), S=255, V=180; a grayish light red could have H about 0 (say 350-359 or 0-10), S about 50-100, and S=255. <p>Qt returns a hue value of -1 for achromatic colors. If you pass a hue value that is too large, Qt forces it into range. Hue 360 or 720 is treated as 0; hue 540 is treated as 180. <p>In addition to the standard HSV model, Qt provides an alpha-channel to feature alpha-blended drawing.<a name="the-cmyk-color-model"><h2>The CMYK Color Model</h2> While the RGB and HSV color models are used for display on computer monitors, the CMYK model is used in the four-color printing process of printing presses and some hard-copy devices. <p>CMYK has four components, all in the range 0-255: cyan (C), magenta (M), yellow (Y) and black (K). Cyan, magenta and yellow are called subtractive colors; the CMYK color model creates color by starting with a white surface and then subtracting color by applying the appropriate components. While combining cyan, magenta and yellow gives the color black, subtracting one or more will yield any other color. When combined in various percentages, these three colors can create the entire spectrum of colors. <p>Mixing 100 percent of cyan, magenta and yellow does produce black, but the result is unsatisfactory since it wastes ink, increases drying time, and gives a muddy colour when printing. For that reason, black is added in professional printing to provide a solid black tone; hence the term 'four color process'. <p>In addition to the standard CMYK model, Qt provides an alpha-channel to feature alpha-blended drawing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette QPalette}, {@link com.trolltech.qt.gui.QBrush QBrush}, and {@link com.trolltech.qt.gui.QApplication#setColorSpec(int) QApplication::setColorSpec()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QColor extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
The type of color specified, either RGB, HSV or CMYK. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#spec() spec()}, and {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()}. <br></DD></DT>
*/

    public enum Spec implements com.trolltech.qt.QtEnumerator {
/**

*/

        Invalid(0),
/**

*/

        Rgb(1),
/**

*/

        Hsv(2),
/**

*/

        Cmyk(3);

        Spec(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QColor$Spec constant with the specified <tt>int</tt>.</brief>
*/

        public static Spec resolve(int value) {
            return (Spec) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Invalid;
            case 1: return Rgb;
            case 2: return Hsv;
            case 3: return Cmyk;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an invalid color with the RGB value (0, 0, 0). An invalid color is a color that is not properly set up for the underlying window system. <p>The alpha value of an invalid color is unspecified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(){
        super((QPrivateConstructor)null);
        __qt_QColor();
    }

    native void __qt_QColor();

/**
This is an overloaded member function, provided for convenience. <p>Constructs a new color with a color value of <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and Predefined Colors. <br></DD></DT>
*/

    public QColor(com.trolltech.qt.core.Qt.GlobalColor color){
        super((QPrivateConstructor)null);
        __qt_QColor_GlobalColor(color.value());
    }

    native void __qt_QColor_GlobalColor(int color);

/**
Constructs a color that is a copy of <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(com.trolltech.qt.gui.QColor color){
        super((QPrivateConstructor)null);
        __qt_QColor_QColor(color == null ? 0 : color.nativeId());
    }

    native void __qt_QColor_QColor(long color);

/**
Constructs a named color in the same way as {@link com.trolltech.qt.gui.QColor#setNamedColor(java.lang.String) setNamedColor()} using the given <tt>name</tt>. <p>The color is left invalid if the <tt>name</tt> cannot be parsed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setNamedColor(java.lang.String) setNamedColor()}, {@link com.trolltech.qt.gui.QColor#name() name()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QColor_String(name);
    }

    native void __qt_QColor_String(java.lang.String name);


/**
Constructs a color with the RGB value <tt>r</tt>, <tt>g</tt>, <tt>b</tt>, and the alpha-channel (transparency) value of <tt>a</tt>. <p>The color is left invalid if any of the arguments are invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRgba(int) setRgba()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(int r, int g, int b) {
        this(r, g, b, (int)255);
    }
/**
Constructs a color with the RGB value <tt>r</tt>, <tt>g</tt>, <tt>b</tt>, and the alpha-channel (transparency) value of <tt>a</tt>. <p>The color is left invalid if any of the arguments are invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRgba(int) setRgba()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(int r, int g, int b, int a){
        super((QPrivateConstructor)null);
        __qt_QColor_int_int_int_int(r, g, b, a);
    }

    native void __qt_QColor_int_int_int_int(int r, int g, int b, int a);

/**
Constructs a color with the value <tt>color</tt>. The alpha component is ignored and set to solid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public QColor(int rgb){
        super((QPrivateConstructor)null);
        __qt_QColor_int(rgb);
    }

    native void __qt_QColor_int(int rgb);

/**
Returns the alpha color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setAlpha(int) setAlpha()}, {@link com.trolltech.qt.gui.QColor#alphaF() alphaF()}, and Alpha-Blended Drawing. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int alpha()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alpha(nativeId());
    }
    @QtBlockedSlot
    native int __qt_alpha(long __this__nativeId);

/**
Returns the alpha color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setAlphaF(double) setAlphaF()}, {@link com.trolltech.qt.gui.QColor#alpha() alpha()}, and Alpha-Blended Drawing. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double alphaF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alphaF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_alphaF(long __this__nativeId);

/**
Returns the black color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#blackF() blackF()}, getCmyk(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int black()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_black(nativeId());
    }
    @QtBlockedSlot
    native int __qt_black(long __this__nativeId);

/**
Returns the black color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#black() black()}, getCmykF(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double blackF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blackF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_blackF(long __this__nativeId);

/**
Returns the blue color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setBlue(int) setBlue()}, {@link com.trolltech.qt.gui.QColor#blueF() blueF()}, and getRgb(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int blue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_blue(long __this__nativeId);

/**
Returns the blue color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setBlueF(double) setBlueF()}, {@link com.trolltech.qt.gui.QColor#blue() blue()}, and getRgbF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final double blueF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blueF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_blueF(long __this__nativeId);

/**
Creates a copy of this color in the format specified by <tt>colorSpec</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#spec() spec()}, {@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()}, {@link com.trolltech.qt.gui.QColor#toHsv() toHsv()}, {@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor convertTo(com.trolltech.qt.gui.QColor.Spec colorSpec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_convertTo_Spec(nativeId(), colorSpec.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_convertTo_Spec(long __this__nativeId, int colorSpec);

/**
Returns the cyan color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#cyanF() cyanF()}, getCmyk(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int cyan()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cyan(nativeId());
    }
    @QtBlockedSlot
    native int __qt_cyan(long __this__nativeId);

/**
Returns the cyan color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#cyan() cyan()}, getCmykF(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double cyanF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cyanF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_cyanF(long __this__nativeId);


/**
Returns a darker (or lighter) color, but does not change this object. <p>If the <tt>factor</tt> is greater than 100, this functions returns a darker color. Setting <tt>factor</tt> to 300 returns a color that has one-third the brightness. If the <tt>factor</tt> is less than 100, the return color is lighter, but we recommend using the {@link com.trolltech.qt.gui.QColor#lighter() lighter()} function for this purpose. If the <tt>factor</tt> is 0 or negative, the return value is unspecified. <p>The function converts the current RGB color to HSV, divides the value (V) component by <tt>factor</tt> and converts the color back to RGB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#lighter() lighter()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor darker() {
        return darker((int)200);
    }
/**
Returns a darker (or lighter) color, but does not change this object. <p>If the <tt>factor</tt> is greater than 100, this functions returns a darker color. Setting <tt>factor</tt> to 300 returns a color that has one-third the brightness. If the <tt>factor</tt> is less than 100, the return color is lighter, but we recommend using the {@link com.trolltech.qt.gui.QColor#lighter() lighter()} function for this purpose. If the <tt>factor</tt> is 0 or negative, the return value is unspecified. <p>The function converts the current RGB color to HSV, divides the value (V) component by <tt>factor</tt> and converts the color back to RGB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#lighter() lighter()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor darker(int f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_darker_int(nativeId(), f);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_darker_int(long __this__nativeId, int f);

/**
Returns the green color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setGreen(int) setGreen()}, {@link com.trolltech.qt.gui.QColor#greenF() greenF()}, and getRgb(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int green()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_green(nativeId());
    }
    @QtBlockedSlot
    native int __qt_green(long __this__nativeId);

/**
Returns the green color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setGreenF(double) setGreenF()}, {@link com.trolltech.qt.gui.QColor#green() green()}, and getRgbF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final double greenF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_greenF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_greenF(long __this__nativeId);

/**
Returns the hue color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#hueF() hueF()}, getHsv(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int hue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_hue(long __this__nativeId);

/**
Returns the hue color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#hue() hue()}, getHsvF(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double hueF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hueF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_hueF(long __this__nativeId);

/**
Returns true if the color is valid; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);


/**
Returns a lighter (or darker) color, but does not change this object. <p>If the <tt>factor</tt> is greater than 100, this functions returns a lighter color. Setting <tt>factor</tt> to 150 returns a color that is 50% brighter. If the <tt>factor</tt> is less than 100, the return color is darker, but we recommend using the {@link com.trolltech.qt.gui.QColor#darker() darker()} function for this purpose. If the <tt>factor</tt> is 0 or negative, the return value is unspecified. <p>The function converts the current RGB color to HSV, multiplies the value (V) component by <tt>factor</tt> and converts the color back to RGB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#darker() darker()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor lighter() {
        return lighter((int)150);
    }
/**
Returns a lighter (or darker) color, but does not change this object. <p>If the <tt>factor</tt> is greater than 100, this functions returns a lighter color. Setting <tt>factor</tt> to 150 returns a color that is 50% brighter. If the <tt>factor</tt> is less than 100, the return color is darker, but we recommend using the {@link com.trolltech.qt.gui.QColor#darker() darker()} function for this purpose. If the <tt>factor</tt> is 0 or negative, the return value is unspecified. <p>The function converts the current RGB color to HSV, multiplies the value (V) component by <tt>factor</tt> and converts the color back to RGB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#darker() darker()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor lighter(int f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lighter_int(nativeId(), f);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_lighter_int(long __this__nativeId, int f);

/**
Returns the magenta color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#magentaF() magentaF()}, getCmyk(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int magenta()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_magenta(nativeId());
    }
    @QtBlockedSlot
    native int __qt_magenta(long __this__nativeId);

/**
Returns the magenta color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#magenta() magenta()}, getCmykF(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double magentaF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_magentaF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_magentaF(long __this__nativeId);

/**
Returns the name of the color in the format "#RRGGBB"; i. . a "#" character followed by three two-digit hexadecimal numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setNamedColor(java.lang.String) setNamedColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
<brief>Writes thisQColor
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
    private final boolean operator_equal(com.trolltech.qt.gui.QColor c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QColor(long __this__nativeId, long c);

/**
<brief>Reads a QColor
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
Returns the red color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRed(int) setRed()}, {@link com.trolltech.qt.gui.QColor#redF() redF()}, and getRgb(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int red()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_red(nativeId());
    }
    @QtBlockedSlot
    native int __qt_red(long __this__nativeId);

/**
Returns the red color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRedF(double) setRedF()}, {@link com.trolltech.qt.gui.QColor#red() red()}, and getRgbF(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final double redF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_redF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_redF(long __this__nativeId);

/**
Returns the RGB value of the color. The alpha is stripped for compatibility. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}, getRgb(), and {@link com.trolltech.qt.gui.QColor#rgba() rgba()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rgb()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rgb(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rgb(long __this__nativeId);

/**
Returns the RGB value of the color. Unlike {@link com.trolltech.qt.gui.QColor#rgb() rgb()}, the alpha is not stripped. <p>For an invalid color, the alpha value of the returned color is unspecified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#setRgba(int) setRgba()}, and {@link com.trolltech.qt.gui.QColor#rgb() rgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rgba()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rgba(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rgba(long __this__nativeId);

/**
Returns the saturation color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#saturationF() saturationF()}, getHsv(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int saturation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saturation(nativeId());
    }
    @QtBlockedSlot
    native int __qt_saturation(long __this__nativeId);

/**
Returns the saturation color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#saturation() saturation()}, getHsvF(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double saturationF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saturationF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_saturationF(long __this__nativeId);

/**
Sets the alpha of this color to <tt>alpha</tt>. Integer alpha is specified in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#alpha() alpha()}, {@link com.trolltech.qt.gui.QColor#alphaF() alphaF()}, and Alpha-Blended Drawing. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlpha(int alpha)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlpha_int(nativeId(), alpha);
    }
    @QtBlockedSlot
    native void __qt_setAlpha_int(long __this__nativeId, int alpha);

/**
Sets the alpha of this color to <tt>alpha</tt>. qreal alpha is specified in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#alphaF() alphaF()}, {@link com.trolltech.qt.gui.QColor#alpha() alpha()}, and Alpha-Blended Drawing. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlphaF(double alpha)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlphaF_double(nativeId(), alpha);
    }
    @QtBlockedSlot
    native void __qt_setAlphaF_double(long __this__nativeId, double alpha);

/**
Sets the blue color component of this color to <tt>blue</tt>. Integer components are specified in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#blue() blue()}, {@link com.trolltech.qt.gui.QColor#blueF() blueF()}, and {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlue(int blue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlue_int(nativeId(), blue);
    }
    @QtBlockedSlot
    native void __qt_setBlue_int(long __this__nativeId, int blue);

/**
Sets the blue color component of this color to <tt>blue</tt>. Float components are specified in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#blueF() blueF()}, {@link com.trolltech.qt.gui.QColor#blue() blue()}, and {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBlueF(double blue)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBlueF_double(nativeId(), blue);
    }
    @QtBlockedSlot
    native void __qt_setBlueF_double(long __this__nativeId, double blue);


/**
Sets the color to CMYK values, <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>getCmyk(), {@link com.trolltech.qt.gui.QColor#setCmykF(double, double, double, double) setCmykF()}, and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCmyk(int c, int m, int y, int k) {
        setCmyk(c, m, y, k, (int)255);
    }
/**
Sets the color to CMYK values, <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>getCmyk(), {@link com.trolltech.qt.gui.QColor#setCmykF(double, double, double, double) setCmykF()}, and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCmyk(int c, int m, int y, int k, int a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCmyk_int_int_int_int_int(nativeId(), c, m, y, k, a);
    }
    @QtBlockedSlot
    native void __qt_setCmyk_int_int_int_int_int(long __this__nativeId, int c, int m, int y, int k, int a);


/**
This is an overloaded member function, provided for convenience. <p>Sets the color to CMYK values, <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>getCmykF(), {@link com.trolltech.qt.gui.QColor#setCmyk(int, int, int, int) setCmyk()}, and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCmykF(double c, double m, double y, double k) {
        setCmykF(c, m, y, k, (double)1.0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Sets the color to CMYK values, <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>getCmykF(), {@link com.trolltech.qt.gui.QColor#setCmyk(int, int, int, int) setCmyk()}, and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCmykF(double c, double m, double y, double k, double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCmykF_double_double_double_double_double(nativeId(), c, m, y, k, a);
    }
    @QtBlockedSlot
    native void __qt_setCmykF_double_double_double_double_double(long __this__nativeId, double c, double m, double y, double k, double a);

/**
Sets the green color component of this color to <tt>green</tt>. Integer components are specified in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#green() green()}, {@link com.trolltech.qt.gui.QColor#greenF() greenF()}, and {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGreen(int green)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGreen_int(nativeId(), green);
    }
    @QtBlockedSlot
    native void __qt_setGreen_int(long __this__nativeId, int green);

/**
Sets the green color component of this color to <tt>green</tt>. Float components are specified in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#greenF() greenF()}, {@link com.trolltech.qt.gui.QColor#green() green()}, and {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGreenF(double green)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGreenF_double(nativeId(), green);
    }
    @QtBlockedSlot
    native void __qt_setGreenF_double(long __this__nativeId, double green);


/**
Sets a HSV color value; <tt>h</tt> is the hue, <tt>s</tt> is the saturation, <tt>v</tt> is the value and <tt>a</tt> is the alpha component of the HSV color. <p>The saturation, value and alpha-channel values must be in the range 0-255, and the hue value must be greater than -1. <p><DT><b>See also:</b><br><DD>hsv(), getHsv(), {@link com.trolltech.qt.gui.QColor#setHsvF(double, double, double) setHsvF()}, and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHsv(int h, int s, int v) {
        setHsv(h, s, v, (int)255);
    }
/**
Sets a HSV color value; <tt>h</tt> is the hue, <tt>s</tt> is the saturation, <tt>v</tt> is the value and <tt>a</tt> is the alpha component of the HSV color. <p>The saturation, value and alpha-channel values must be in the range 0-255, and the hue value must be greater than -1. <p><DT><b>See also:</b><br><DD>hsv(), getHsv(), {@link com.trolltech.qt.gui.QColor#setHsvF(double, double, double) setHsvF()}, and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHsv(int h, int s, int v, int a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHsv_int_int_int_int(nativeId(), h, s, v, a);
    }
    @QtBlockedSlot
    native void __qt_setHsv_int_int_int_int(long __this__nativeId, int h, int s, int v, int a);


/**
Sets a HSV color value; <tt>h</tt> is the hue, <tt>s</tt> is the saturation, <tt>v</tt> is the value and <tt>a</tt> is the alpha component of the HSV color. <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>getHsvF(), {@link com.trolltech.qt.gui.QColor#setHsv(int, int, int) setHsv()}, and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHsvF(double h, double s, double v) {
        setHsvF(h, s, v, (double)1.0);
    }
/**
Sets a HSV color value; <tt>h</tt> is the hue, <tt>s</tt> is the saturation, <tt>v</tt> is the value and <tt>a</tt> is the alpha component of the HSV color. <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>getHsvF(), {@link com.trolltech.qt.gui.QColor#setHsv(int, int, int) setHsv()}, and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHsvF(double h, double s, double v, double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHsvF_double_double_double_double(nativeId(), h, s, v, a);
    }
    @QtBlockedSlot
    native void __qt_setHsvF_double_double_double_double(long __this__nativeId, double h, double s, double v, double a);

/**
Sets the RGB value of this QColor to <tt>name</tt>, which may be in one of these formats. <ul><li> #RGB (each of R, G, and B is a single hex digit)</li><li> #RRGGBB</li><li> #RRRGGGBBB</li><li> #RRRRGGGGBBBB</li><li> A name from the list of colors defined in the list of {@link <a href="../http-www-w3-org-tr-svg-types-html-colorkeywords.html">SVG color keyword names</a>} provided by the World Wide Web Consortium; for example, "steelblue" or "gainsboro". These color names work on all platforms. Note that these color names are</li><li> not the same as defined by the {@link com.trolltech.qt.core.Qt.GlobalColor Qt::GlobalColor } enums, e.g. "green" and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::green } does not refer to the same color.</li><li> <tt>transparent</tt> - representing the absence of a color.</li><li> X11 only: If allowX11ColorNames() returns true, any valid X11 color name. See the documentation for <tt>XParseColor()</tt> for information about valid X11 color names.</li></ul> The color is invalid if <tt>name</tt> cannot be parsed. <p><DT><b>See also:</b><br><DD>QColor(), {@link com.trolltech.qt.gui.QColor#name() name()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and allowX11ColorNames(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNamedColor(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNamedColor_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setNamedColor_String(long __this__nativeId, java.lang.String name);

/**
Sets the red color component of this color to <tt>red</tt>. Integer components are specified in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#red() red()}, {@link com.trolltech.qt.gui.QColor#redF() redF()}, and {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRed(int red)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRed_int(nativeId(), red);
    }
    @QtBlockedSlot
    native void __qt_setRed_int(long __this__nativeId, int red);

/**
Sets the red color component of this color to <tt>red</tt>. Float components are specified in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#redF() redF()}, {@link com.trolltech.qt.gui.QColor#red() red()}, and {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRedF(double red)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRedF_double(nativeId(), red);
    }
    @QtBlockedSlot
    native void __qt_setRedF_double(long __this__nativeId, double red);


/**
Sets the RGB value to <tt>r</tt>, <tt>g</tt>, <tt>b</tt> and the alpha value to <tt>a</tt>. <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#rgb() rgb()}, getRgb(), and {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgb(int r, int g, int b) {
        setRgb(r, g, b, (int)255);
    }
/**
Sets the RGB value to <tt>r</tt>, <tt>g</tt>, <tt>b</tt> and the alpha value to <tt>a</tt>. <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#rgb() rgb()}, getRgb(), and {@link com.trolltech.qt.gui.QColor#setRgbF(double, double, double) setRgbF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgb(int r, int g, int b, int a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRgb_int_int_int_int(nativeId(), r, g, b, a);
    }
    @QtBlockedSlot
    native void __qt_setRgb_int_int_int_int(long __this__nativeId, int r, int g, int b, int a);

/**
This is an overloaded member function, provided for convenience. <p>Sets the RGB value to <tt>rgb</tt>, ignoring the alpha.
*/

    @QtBlockedSlot
    public final void setRgb(int rgb)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRgb_int(nativeId(), rgb);
    }
    @QtBlockedSlot
    native void __qt_setRgb_int(long __this__nativeId, int rgb);


/**
Sets the color channels of this color to <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue) and <tt>a</tt> (alpha, transparency). <p>All values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#rgb() rgb()}, getRgbF(), and {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgbF(double r, double g, double b) {
        setRgbF(r, g, b, (double)1.0);
    }
/**
Sets the color channels of this color to <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue) and <tt>a</tt> (alpha, transparency). <p>All values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#rgb() rgb()}, getRgbF(), and {@link com.trolltech.qt.gui.QColor#setRgb(int, int, int) setRgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgbF(double r, double g, double b, double a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRgbF_double_double_double_double(nativeId(), r, g, b, a);
    }
    @QtBlockedSlot
    native void __qt_setRgbF_double_double_double_double(long __this__nativeId, double r, double g, double b, double a);

/**
Sets the RGBA value to <tt>rgba</tt>. Unlike setRgb(QRgb rgb), this function does not ignore the alpha. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#rgba() rgba()}, and {@link com.trolltech.qt.gui.QColor#rgb() rgb()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRgba(int rgba)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRgba_int(nativeId(), rgba);
    }
    @QtBlockedSlot
    native void __qt_setRgba_int(long __this__nativeId, int rgba);

/**
Returns how the color was specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor.Spec Spec }, and {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor.Spec spec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QColor.Spec.resolve(__qt_spec(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_spec(long __this__nativeId);

/**
Creates and returns a CMYK QColor based on this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromCmyk(int, int, int, int) fromCmyk()}, {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor toCmyk()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toCmyk(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_toCmyk(long __this__nativeId);

/**
Creates and returns an HSV QColor based on this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromHsv(int, int, int) fromHsv()}, {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor toHsv()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHsv(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_toHsv(long __this__nativeId);

/**
Create and returns an RGB QColor based on this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, {@link com.trolltech.qt.gui.QColor#convertTo(com.trolltech.qt.gui.QColor.Spec) convertTo()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor toRgb()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toRgb(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_toRgb(long __this__nativeId);

/**
Returns the value color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#valueF() valueF()}, getHsv(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native int __qt_value(long __this__nativeId);

/**
Returns the value color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#value() value()}, getHsvF(), and The HSV Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double valueF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_valueF(long __this__nativeId);

/**
Returns the yellow color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#yellowF() yellowF()}, getCmyk(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int yellow()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_yellow(nativeId());
    }
    @QtBlockedSlot
    native int __qt_yellow(long __this__nativeId);

/**
Returns the yellow color component of this color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#yellow() yellow()}, getCmykF(), and The CMYK Color Model. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double yellowF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_yellowF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_yellowF(long __this__nativeId);

/**
Returns a QStringList containing the color names Qt knows about. <p><DT><b>See also:</b><br><DD>Predefined Colors. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> colorNames();


/**
Static convenience function that returns a QColor constructed from the given CMYK color values. <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()}, {@link com.trolltech.qt.gui.QColor#fromCmykF(double, double, double, double) fromCmykF()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The CMYK Color Model. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromCmyk(int c, int m, int y, int k) {
        return fromCmyk(c, m, y, k, (int)255);
    }
/**
Static convenience function that returns a QColor constructed from the given CMYK color values. <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()}, {@link com.trolltech.qt.gui.QColor#fromCmykF(double, double, double, double) fromCmykF()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The CMYK Color Model. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromCmyk(int c, int m, int y, int k, int a);


/**
This is an overloaded member function, provided for convenience. <p>Static convenience function that returns a QColor constructed from the given CMYK color values: <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()}, {@link com.trolltech.qt.gui.QColor#fromCmyk(int, int, int, int) fromCmyk()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The CMYK Color Model. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromCmykF(double c, double m, double y, double k) {
        return fromCmykF(c, m, y, k, (double)1.0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Static convenience function that returns a QColor constructed from the given CMYK color values: <tt>c</tt> (cyan), <tt>m</tt> (magenta), <tt>y</tt> (yellow), <tt>k</tt> (black), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toCmyk() toCmyk()}, {@link com.trolltech.qt.gui.QColor#fromCmyk(int, int, int, int) fromCmyk()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The CMYK Color Model. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromCmykF(double c, double m, double y, double k, double a);


/**
Static convenience function that returns a QColor constructed from the HSV color values, <tt>h</tt> (hue), <tt>s</tt> (saturation), <tt>v</tt> (value), and <tt>a</tt> (alpha-channel, i. . transparency). <p>The value of <tt>s</tt>, <tt>v</tt>, and <tt>a</tt> must all be in the range 0-255; the value of <tt>h</tt> must be in the range 0-359. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toHsv() toHsv()}, {@link com.trolltech.qt.gui.QColor#fromHsvF(double, double, double) fromHsvF()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The HSV Color Model. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromHsv(int h, int s, int v) {
        return fromHsv(h, s, v, (int)255);
    }
/**
Static convenience function that returns a QColor constructed from the HSV color values, <tt>h</tt> (hue), <tt>s</tt> (saturation), <tt>v</tt> (value), and <tt>a</tt> (alpha-channel, i. . transparency). <p>The value of <tt>s</tt>, <tt>v</tt>, and <tt>a</tt> must all be in the range 0-255; the value of <tt>h</tt> must be in the range 0-359. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toHsv() toHsv()}, {@link com.trolltech.qt.gui.QColor#fromHsvF(double, double, double) fromHsvF()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The HSV Color Model. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromHsv(int h, int s, int v, int a);


/**
This is an overloaded member function, provided for convenience. <p>Static convenience function that returns a QColor constructed from the HSV color values, <tt>h</tt> (hue), <tt>s</tt> (saturation), <tt>v</tt> (value), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toHsv() toHsv()}, {@link com.trolltech.qt.gui.QColor#fromHsv(int, int, int) fromHsv()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The HSV Color Model. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromHsvF(double h, double s, double v) {
        return fromHsvF(h, s, v, (double)1.0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Static convenience function that returns a QColor constructed from the HSV color values, <tt>h</tt> (hue), <tt>s</tt> (saturation), <tt>v</tt> (value), and <tt>a</tt> (alpha-channel, i.e. transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toHsv() toHsv()}, {@link com.trolltech.qt.gui.QColor#fromHsv(int, int, int) fromHsv()}, {@link com.trolltech.qt.gui.QColor#isValid() isValid()}, and The HSV Color Model. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromHsvF(double h, double s, double v, double a);


/**
Static convenience function that returns a QColor constructed from the RGB color values, <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, {@link com.trolltech.qt.gui.QColor#fromRgbF(double, double, double) fromRgbF()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromRgb(int r, int g, int b) {
        return fromRgb(r, g, b, (int)255);
    }
/**
Static convenience function that returns a QColor constructed from the RGB color values, <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0-255. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, {@link com.trolltech.qt.gui.QColor#fromRgbF(double, double, double) fromRgbF()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromRgb(int r, int g, int b, int a);

/**
Static convenience function that returns a QColor constructed from the given QRgb value <tt>rgb</tt>. <p>The alpha component of <tt>rgb</tt> is ignored (i.e. it is automatically set to 255), use the {@link com.trolltech.qt.gui.QColor#fromRgba(int) fromRgba()} function to include the alpha-channel specified by the given QRgb value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgba(int) fromRgba()}, {@link com.trolltech.qt.gui.QColor#fromRgbF(double, double, double) fromRgbF()}, {@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromRgb(int rgb);


/**
Static convenience function that returns a QColor constructed from the RGB color values, <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, {@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QColor fromRgbF(double r, double g, double b) {
        return fromRgbF(r, g, b, (double)1.0);
    }
/**
Static convenience function that returns a QColor constructed from the RGB color values, <tt>r</tt> (red), <tt>g</tt> (green), <tt>b</tt> (blue), and <tt>a</tt> (alpha-channel, i. . transparency). <p>All the values must be in the range 0.0-1.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, {@link com.trolltech.qt.gui.QColor#toRgb() toRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromRgbF(double r, double g, double b, double a);

/**
Static convenience function that returns a QColor constructed from the given QRgb value <tt>rgba</tt>. <p>Unlike the {@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()} function, the alpha-channel specified by the given QRgb value is included. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor#fromRgb(int, int, int) fromRgb()}, and {@link com.trolltech.qt.gui.QColor#isValid() isValid()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QColor fromRgba(int rgba);

/**
@exclude
*/

    public static native QColor fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QColor(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QColor array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QColor)
        return operator_equal((com.trolltech.qt.gui.QColor) other);
        return false;
    }


    public static final QColor white = new QColor(com.trolltech.qt.core.Qt.GlobalColor.white);
    public static final QColor black = new QColor(com.trolltech.qt.core.Qt.GlobalColor.black);
    public static final QColor red = new QColor(com.trolltech.qt.core.Qt.GlobalColor.red);
    public static final QColor darkRed = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkRed);
    public static final QColor green = new QColor(com.trolltech.qt.core.Qt.GlobalColor.green);
    public static final QColor darkGreen = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkGreen);
    public static final QColor blue = new QColor(com.trolltech.qt.core.Qt.GlobalColor.blue);
    public static final QColor darkBlue = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkBlue);
    public static final QColor cyan = new QColor(com.trolltech.qt.core.Qt.GlobalColor.cyan);
    public static final QColor darkCyan = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkCyan);
    public static final QColor magenta = new QColor(com.trolltech.qt.core.Qt.GlobalColor.magenta);
    public static final QColor darkMagenta = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkMagenta);
    public static final QColor yellow = new QColor(com.trolltech.qt.core.Qt.GlobalColor.yellow);
    public static final QColor darkYellow = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkYellow);
    public static final QColor gray = new QColor(com.trolltech.qt.core.Qt.GlobalColor.gray);
    public static final QColor darkGray = new QColor(com.trolltech.qt.core.Qt.GlobalColor.darkGray);
    public static final QColor lightGray = new QColor(com.trolltech.qt.core.Qt.GlobalColor.lightGray);
    public static final QColor transparent = new QColor(com.trolltech.qt.core.Qt.GlobalColor.transparent);
    public static final QColor color0 = new QColor(com.trolltech.qt.core.Qt.GlobalColor.color0);
    public static final QColor color1 = new QColor(com.trolltech.qt.core.Qt.GlobalColor.color1);


/**
<brief>Returns a string representation of the <tt>this QColor</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QColor clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QColor __qt_clone(long __this_nativeId);
}
