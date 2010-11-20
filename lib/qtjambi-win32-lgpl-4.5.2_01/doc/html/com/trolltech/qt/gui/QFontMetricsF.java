package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFontMetricsF class provides font metrics information. QFontMetricsF functions calculate the size of characters and strings for a given font. You can construct a QFontMetricsF object with an existing {@link com.trolltech.qt.gui.QFont QFont} to obtain metrics for that font. If the font is changed later, the font metrics object is not updated. <p>Once created, the object provides functions to access the individual metrics of the font, its characters, and for strings rendered in the font. <p>There are several functions that operate on the font: {@link com.trolltech.qt.gui.QFontMetricsF#ascent() ascent()}, {@link com.trolltech.qt.gui.QFontMetricsF#descent() descent()}, {@link com.trolltech.qt.gui.QFontMetricsF#height() height()}, {@link com.trolltech.qt.gui.QFontMetricsF#leading() leading()} and {@link com.trolltech.qt.gui.QFontMetricsF#lineSpacing() lineSpacing()} return the basic size properties of the font. The {@link com.trolltech.qt.gui.QFontMetricsF#underlinePos() underlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#overlinePos() overlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#strikeOutPos() strikeOutPos()} and {@link com.trolltech.qt.gui.QFontMetricsF#lineWidth() lineWidth()} functions, return the properties of the line that underlines, overlines or strikes out the characters. These functions are all fast. <p>There are also some functions that operate on the set of glyphs in the font: {@link com.trolltech.qt.gui.QFontMetricsF#minLeftBearing() minLeftBearing()}, {@link com.trolltech.qt.gui.QFontMetricsF#minRightBearing() minRightBearing()} and {@link com.trolltech.qt.gui.QFontMetricsF#maxWidth() maxWidth()}. These are by necessity slow, and we recommend avoiding them if possible. <p>For each character, you can get its {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}, {@link com.trolltech.qt.gui.QFontMetricsF#leftBearing(char) leftBearing()} and {@link com.trolltech.qt.gui.QFontMetricsF#rightBearing(char) rightBearing()} and find out whether it is in the font using {@link com.trolltech.qt.gui.QFontMetricsF#inFont(char) inFont()}. You can also treat the character as a string, and use the string functions on it. <p>The string functions include {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}, to return the width of a string in pixels (or points, for a printer), {@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}, to return a rectangle large enough to contain the rendered string, and {@link com.trolltech.qt.gui.QFontMetricsF#size(int, java.lang.String, int, int[]) size()}, to return the size of that rectangle. <p>Example: <pre class="snippet">
    QFont font = new QFont("times", 24);
    QFontMetricsF fm = new QFontMetricsF(font);
    double pixelsWide = fm.width("What's the width of this text?");
    double pixelsHigh = fm.height();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QFontInfo QFontInfo}, and {@link com.trolltech.qt.gui.QFontDatabase QFontDatabase}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFontMetricsF extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a font metrics object for <tt>font</tt>. <p>The font metrics will be compatible with the paintdevice used to create <tt>font</tt>. <p>The font metrics object holds the information for the font that is passed in the constructor at the time it is created, and is not updated if the font's attributes are changed later. <p>Use QFontMetricsF(const {@link com.trolltech.qt.gui.QFont QFont} &, {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice} *) to get the font metrics that are compatible with a certain paint device.
*/

    public QFontMetricsF(com.trolltech.qt.gui.QFont arg__1){
        super((QPrivateConstructor)null);
        __qt_QFontMetricsF_QFont(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontMetricsF.class, 1, 1000);
    }

    native void __qt_QFontMetricsF_QFont(long arg__1);

/**
Constructs a font metrics object for <tt>font</tt> and <tt>paintdevice</tt>. <p>The font metrics will be compatible with the paintdevice passed. If the <tt>paintdevice</tt> is 0, the metrics will be screen-compatible, ie. the metrics you get if you use the font for drawing text on a {@link com.trolltech.qt.gui.QWidget widgets} or {@link com.trolltech.qt.gui.QPixmap pixmaps}, not on a {@link com.trolltech.qt.gui.QPicture QPicture} or {@link com.trolltech.qt.gui.QPrinter QPrinter}. <p>The font metrics object holds the information for the font that is passed in the constructor at the time it is created, and is not updated if the font's attributes are changed later.
*/

    public QFontMetricsF(com.trolltech.qt.gui.QFont arg__1, com.trolltech.qt.gui.QPaintDeviceInterface pd){
        super((QPrivateConstructor)null);
        __qt_QFontMetricsF_QFont_QPaintDevice(arg__1 == null ? 0 : arg__1.nativeId(), pd == null ? 0 : pd.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontMetricsF.class, 1, 1000);
    }

    native void __qt_QFontMetricsF_QFont_QPaintDevice(long arg__1, long pd);

/**
Constructs a font metrics object with floating point precision from the given <tt>fontMetrics</tt> object.
*/

    public QFontMetricsF(com.trolltech.qt.gui.QFontMetrics arg__1){
        super((QPrivateConstructor)null);
        __qt_QFontMetricsF_QFontMetrics(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontMetricsF.class, 1, 1000);
    }

    native void __qt_QFontMetricsF_QFontMetrics(long arg__1);

/**
Constructs a copy of <tt>fm</tt>.
*/

    public QFontMetricsF(com.trolltech.qt.gui.QFontMetricsF arg__1){
        super((QPrivateConstructor)null);
        __qt_QFontMetricsF_QFontMetricsF(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontMetricsF.class, 1, 1000);
    }

    native void __qt_QFontMetricsF_QFontMetricsF(long arg__1);

/**
Returns the ascent of the font. <p>The ascent of a font is the distance from the baseline to the highest position characters extend to. In practice, some font designers break this rule, e.g. when they put more than one accent on top of a character, or to accommodate an unusual character in an exotic language, so it is possible (though rare) that this value will be too small. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#descent() descent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double ascent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ascent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_ascent(long __this__nativeId);

/**
Returns the average width of glyphs in the font.
*/

    @QtBlockedSlot
    public final double averageCharWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_averageCharWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_averageCharWidth(long __this__nativeId);

/**
Returns the bounding rectangle of the character <tt>ch</tt> relative to the left-most point on the base line. <p>Note that the bounding rectangle may extend to the left of (0, 0), e.g. for italicized fonts, and that the text output may cover all pixels in the bounding rectangle. <p>Note that the rectangle usually extends both above and below the base line. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect_char(long __this__nativeId, char arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF r, int flags, java.lang.String string, int tabstops, com.trolltech.qt.QNativePointer tabarray)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_QRectF_int_String_int_nativepointer(nativeId(), r == null ? 0 : r.nativeId(), flags, string, tabstops, tabarray);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect_QRectF_int_String_int_nativepointer(long __this__nativeId, long r, int flags, java.lang.String string, int tabstops, com.trolltech.qt.QNativePointer tabarray);

/**
Returns the bounding rectangle of the characters in the string specified by <tt>text</tt>. The bounding rectangle always covers at least the set of pixels the text would cover if drawn at (0, 0). <p>Note that the bounding rectangle may extend to the left of (0, 0), e.g. for italicized fonts, and that the width of the returned rectangle might be different than what the {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} method returns. <p>If you want to know the advance width of the string (to layout a set of strings next to each other), use {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} instead. <p>Newline characters are processed as normal characters, not as linebreaks. <p>The height of the bounding rectangle is at least as large as the value returned {@link com.trolltech.qt.gui.QFontMetricsF#height() height()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}, {@link com.trolltech.qt.gui.QFontMetricsF#height() height()}, and {@link com.trolltech.qt.gui.QPainter#boundingRect(com.trolltech.qt.core.QRect, int, java.lang.String) QPainter::boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect(java.lang.String string)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect_String(nativeId(), string);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect_String(long __this__nativeId, java.lang.String string);

/**
Returns the descent of the font. <p>The descent is the distance from the base line to the lowest point characters extend to. (Note that this is different from X, which adds 1 pixel.) In practice, some font designers break this rule, e.g. to accommodate an unusual character in an exotic language, so it is possible (though rare) that this value will be too small. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#ascent() ascent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double descent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_descent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_descent(long __this__nativeId);


/**
If the string <tt>text</tt> is wider than <tt>width</tt>, returns an elided version of the string (i. ., a string with "..." in it). Otherwise, returns the original string. <p>The <tt>mode</tt> parameter specifies whether the text is elided on the left (e.g., "...tech"), in the middle (e.g., "Tr...ch"), or on the right (e.g., "Trol..."). <p>The <tt>width</tt> is specified in pixels, not characters. <p>The <tt>flags</tt> argument is optional and currently only supports {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic } as value.
*/

    @QtBlockedSlot
    public final java.lang.String elidedText(java.lang.String text, com.trolltech.qt.core.Qt.TextElideMode mode, double width) {
        return elidedText(text, mode, width, (int)0);
    }
/**
If the string <tt>text</tt> is wider than <tt>width</tt>, returns an elided version of the string (i. ., a string with "..." in it). Otherwise, returns the original string. <p>The <tt>mode</tt> parameter specifies whether the text is elided on the left (e.g., "...tech"), in the middle (e.g., "Tr...ch"), or on the right (e.g., "Trol..."). <p>The <tt>width</tt> is specified in pixels, not characters. <p>The <tt>flags</tt> argument is optional and currently only supports {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic } as value.
*/

    @QtBlockedSlot
    public final java.lang.String elidedText(java.lang.String text, com.trolltech.qt.core.Qt.TextElideMode mode, double width, int flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elidedText_String_TextElideMode_double_int(nativeId(), text, mode.value(), width, flags);
    }
    @QtBlockedSlot
    native java.lang.String __qt_elidedText_String_TextElideMode_double_int(long __this__nativeId, java.lang.String text, int mode, double width, int flags);

/**
Returns the height of the font. <p>This is always equal to {@link com.trolltech.qt.gui.QFontMetricsF#ascent() ascent()}+{@link com.trolltech.qt.gui.QFontMetricsF#descent() descent()}+1 (the 1 is for the base line). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#leading() leading()}, and {@link com.trolltech.qt.gui.QFontMetricsF#lineSpacing() lineSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native double __qt_height(long __this__nativeId);

/**
Returns true if character <tt>ch</tt> is a valid character in the font; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean inFont(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inFont_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native boolean __qt_inFont_char(long __this__nativeId, char arg__1);

/**
Returns the leading of the font. <p>This is the natural inter-line spacing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#height() height()}, and {@link com.trolltech.qt.gui.QFontMetricsF#lineSpacing() lineSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double leading()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leading(nativeId());
    }
    @QtBlockedSlot
    native double __qt_leading(long __this__nativeId);

/**
Returns the left bearing of character <tt>ch</tt> in the font. <p>The left bearing is the right-ward distance of the left-most pixel of the character from the logical origin of the character. This value is negative if the pixels of the character extend to the left of the logical origin. <p>See width(QChar) for a graphical description of this metric. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#rightBearing(char) rightBearing()}, {@link com.trolltech.qt.gui.QFontMetricsF#minLeftBearing() minLeftBearing()}, and {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double leftBearing(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftBearing_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native double __qt_leftBearing_char(long __this__nativeId, char arg__1);

/**
Returns the distance from one base line to the next. <p>This value is always equal to {@link com.trolltech.qt.gui.QFontMetricsF#leading() leading()}+{@link com.trolltech.qt.gui.QFontMetricsF#height() height()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#height() height()}, and {@link com.trolltech.qt.gui.QFontMetricsF#leading() leading()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double lineSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_lineSpacing(long __this__nativeId);

/**
Returns the width of the underline and strikeout lines, adjusted for the point size of the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#underlinePos() underlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#overlinePos() overlinePos()}, and {@link com.trolltech.qt.gui.QFontMetricsF#strikeOutPos() strikeOutPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double lineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_lineWidth(long __this__nativeId);

/**
Returns the width of the widest character in the font.
*/

    @QtBlockedSlot
    public final double maxWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maxWidth(long __this__nativeId);

/**
Returns the minimum left bearing of the font. <p>This is the smallest leftBearing(char) of all characters in the font. <p>Note that this function can be very slow if the font is large. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#minRightBearing() minRightBearing()}, and {@link com.trolltech.qt.gui.QFontMetricsF#leftBearing(char) leftBearing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minLeftBearing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minLeftBearing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minLeftBearing(long __this__nativeId);

/**
Returns the minimum right bearing of the font. <p>This is the smallest rightBearing(char) of all characters in the font. <p>Note that this function can be very slow if the font is large. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#minLeftBearing() minLeftBearing()}, and {@link com.trolltech.qt.gui.QFontMetricsF#rightBearing(char) rightBearing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minRightBearing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minRightBearing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minRightBearing(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QFontMetricsF other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QFontMetricsF(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QFontMetricsF(long __this__nativeId, long other);

/**
Returns the distance from the base line to where an overline should be drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#underlinePos() underlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#strikeOutPos() strikeOutPos()}, and {@link com.trolltech.qt.gui.QFontMetricsF#lineWidth() lineWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double overlinePos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_overlinePos(nativeId());
    }
    @QtBlockedSlot
    native double __qt_overlinePos(long __this__nativeId);

/**
Returns the right bearing of character <tt>ch</tt> in the font. <p>The right bearing is the left-ward distance of the right-most pixel of the character from the logical origin of a subsequent character. This value is negative if the pixels of the character extend to the right of the {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} of the character. <p>See {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} for a graphical description of this metric. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#leftBearing(char) leftBearing()}, {@link com.trolltech.qt.gui.QFontMetricsF#minRightBearing() minRightBearing()}, and {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rightBearing(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightBearing_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native double __qt_rightBearing_char(long __this__nativeId, char arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QSizeF size(int flags, java.lang.String str, int tabstops, com.trolltech.qt.QNativePointer tabarray)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size_int_String_int_nativepointer(nativeId(), flags, str, tabstops, tabarray);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_size_int_String_int_nativepointer(long __this__nativeId, int flags, java.lang.String str, int tabstops, com.trolltech.qt.QNativePointer tabarray);

/**
Returns the distance from the base line to where the strikeout line should be drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#underlinePos() underlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#overlinePos() overlinePos()}, and {@link com.trolltech.qt.gui.QFontMetricsF#lineWidth() lineWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double strikeOutPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_strikeOutPos(nativeId());
    }
    @QtBlockedSlot
    native double __qt_strikeOutPos(long __this__nativeId);

/**
Returns a tight bounding rectangle around the characters in the string specified by <tt>text</tt>. The bounding rectangle always covers at least the set of pixels the text would cover if drawn at (0, 0). <p>Note that the bounding rectangle may extend to the left of (0, 0), e.g. for italicized fonts, and that the width of the returned rectangle might be different than what the {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} method returns. <p>If you want to know the advance width of the string (to layout a set of strings next to each other), use {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} instead. <p>Newline characters are processed as normal characters, not as linebreaks. <p><b>Warning:</b> Calling this method is very slow on Windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}, {@link com.trolltech.qt.gui.QFontMetricsF#height() height()}, and {@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF tightBoundingRect(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tightBoundingRect_String(nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_tightBoundingRect_String(long __this__nativeId, java.lang.String text);

/**
Returns the distance from the base line to where an underscore should be drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#overlinePos() overlinePos()}, {@link com.trolltech.qt.gui.QFontMetricsF#strikeOutPos() strikeOutPos()}, and {@link com.trolltech.qt.gui.QFontMetricsF#lineWidth() lineWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double underlinePos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_underlinePos(nativeId());
    }
    @QtBlockedSlot
    native double __qt_underlinePos(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <br><center><img src="../images/bearings.png"></center><br> Returns the logical width of character <tt>ch</tt> in pixels. This is a distance appropriate for drawing a subsequent character after <tt>ch</tt>. <p>Some of the metrics are described in the image to the right. The central dark rectangles cover the logical {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} of each character. The outer pale rectangles cover the {@link com.trolltech.qt.gui.QFontMetricsF#leftBearing(char) leftBearing()} and {@link com.trolltech.qt.gui.QFontMetricsF#rightBearing(char) rightBearing()} of each character. Notice that the bearings of "f" in this particular font are both negative, while the bearings of "o" are both positive. <p><b>Warning:</b> This function will produce incorrect results for Arabic characters or non-spacing marks in the middle of a string, as the glyph shaping and positioning of marks that happens when processing strings cannot be taken into account. Use charWidth() instead if you aren't looking for the width of isolated characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double width(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native double __qt_width_char(long __this__nativeId, char arg__1);

/**
Returns the width in pixels of the characters in the given <tt>text</tt>. <p>Note that this value is not equal to the width returned by {@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}.{@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} because {@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()} returns a rectangle describing the pixels this string will cover whereas {@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()} returns the distance to where the next string should be drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double width(java.lang.String string)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width_String(nativeId(), string);
    }
    @QtBlockedSlot
    native double __qt_width_String(long __this__nativeId, java.lang.String string);

/**
Returns the 'x' height of the font. This is often but not always the same as the height of the character 'x'.
*/

    @QtBlockedSlot
    public final double xHeight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_xHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_xHeight(long __this__nativeId);

/**
@exclude
*/

    public static native QFontMetricsF fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFontMetricsF(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFontMetricsF array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QFontMetricsF)
        return operator_equal((com.trolltech.qt.gui.QFontMetricsF) other);
        return false;
    }


    // TEMPLATE - gui.fontmetricsf_boundingrect - START
    // TEMPLATE - gui.fontmetrics_tabarray_function - START
/**
Returns the bounding rectangle of the characters in the given <tt>text</tt>. This is the set of pixels the text would cover if drawn when constrained to the bounding rectangle specified by <tt>rect</tt>. <p>The <tt>flags</tt> argument is the bitwise OR of the following flags: <ul><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } aligns to the left border, except for Arabic and Hebrew where it aligns to the right.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } aligns to the right border, except for Arabic and Hebrew where it aligns to the left.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignJustify } produces justified text.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter } aligns horizontally centered.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop } aligns to the top border.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignBottom } aligns to the bottom border.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignVCenter } aligns vertically centered</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter } (== <tt>Qt::AlignHCenter | Qt::AlignVCenter</tt>)</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextSingleLine } ignores newline characters in the text.</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextExpandTabs } expands tabs (see below)</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic } interprets "&amp;x" as x, i.e. underlined.</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextWordWrap } breaks the text to fit the rectangle.</li></ul> {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } alignment defaults to {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } and vertical alignment defaults to {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }. <p>If several of the horizontal or several of the vertical alignment flags are set, the resulting alignment is undefined. <p>These flags are defined in {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignmentFlag }. <p>If {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextExpandTabs } is set in <tt>flags</tt>, the following behavior is used to interpret tab characters in the text: <ul><li> If <tt>tabArray</tt> is non-null, it specifies a 0-terminated sequence of pixel-positions for tabs in the text.</li><li> If <tt>tabStops</tt> is non-zero, it is used as the tab spacing (in pixels).</li></ul> Note that the bounding rectangle may extend to the left of (0, 0), e.g. for italicized fonts. <p>Newline characters are processed as line breaks. <p>Despite the different actual character heights, the heights of the bounding rectangles of "Yes" and "yes" are the same. <p>The bounding rectangle returned by this function is somewhat larger than that calculated by the simpler {@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()} function. This function uses the {@link com.trolltech.qt.gui.QFontMetricsF#minLeftBearing() maximum left} and {@link com.trolltech.qt.gui.QFontMetricsF#minRightBearing() right} font bearings as is necessary for multi-line text to align correctly. Also, fontHeight() and {@link com.trolltech.qt.gui.QFontMetricsF#lineSpacing() lineSpacing()} are used to calculate the height, rather than individual character heights. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#width(char) width()}, {@link com.trolltech.qt.gui.QPainter#boundingRect(com.trolltech.qt.core.QRect, int, java.lang.String) QPainter::boundingRect()}, and Qt::Alignment. <br></DD></DT>
*/

    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, int flags, String text, int tabStops, int tabArray[]) {
        QNativePointer np = tabArray == null ? null : new QNativePointer(QNativePointer.Type.Int, tabArray.length + 1);
        if (np != null) {
            for (int i=0; i<tabArray.length; ++i) np.setIntAt(i, tabArray[i]);
            np.setIntAt(tabArray.length, 0);
        }
        return boundingRect(rect, flags, text, tabStops, np);
    }

/**
Returns the bounding rectangle of the characters in the given <tt>text</tt>.
This is the set of pixels the text would cover if drawn when constrained
to the bounding rectangle specified by <tt>rect</tt>.
<p>
The <tt>flags</tt> argument is the bitwise OR of the following flags:
<dir>
<li> Qt::AlignLeft aligns to the left border, except for
      Arabic and Hebrew where it aligns to the right.
<li> Qt::AlignRight aligns to the right border, except for
      Arabic and Hebrew where it aligns to the left.
<li> Qt::AlignJustify produces justified text.
<li> Qt::AlignHCenter aligns horizontally centered.
<li> Qt::AlignTop aligns to the top border.
<li> Qt::AlignBottom aligns to the bottom border.
<li> Qt::AlignVCenter aligns vertically centered
<li> Qt::AlignCenter (== <b>Qt::AlignHCenter | Qt::AlignVCenter</b>)
<li> Qt::TextSingleLine ignores newline characters in the text.
<li> Qt::TextExpandTabs expands tabs (see below)
<li> Qt::TextShowMnemonic interprets "&amp;x" as <u>x</u>, i.e. underlined.
<li> Qt::TextWordBreak breaks the text to fit the rectangle.
</dir>
<p>
Qt::Horizontal alignment defaults to Qt::AlignLeft and vertical
alignment defaults to Qt::AlignTop.
<p>
If several of the horizontal or several of the vertical alignment
flags are set, the resulting alignment is undefined.
<p>
These flags are defined in Qt::AlignmentFlag.
<p>
If Qt::TextExpandTabs is set in <tt>flags</tt>, the following behavior is
used to interpret tab characters in the text:
<dir>
<li> If <tt>tabArray</tt> is non-null, it specifies a 0-terminated sequence of
     pixel-positions for tabs in the text.
<li> If <tt>tabStops</tt> is non-zero, it is used as the tab spacing (in pixels).
</dir>
<p>
Note that the bounding rectangle may extend to the left of (0, 0),
e.g. for italicized fonts.
<p>
Newline characters are processed as line breaks.
<p>
Despite the different actual character heights, the heights of the
bounding rectangles of "Yes" and "yes" are the same.
<p>
The bounding rectangle returned by this function is somewhat larger
than that calculated by the simpler boundingRect() function. This
function uses the minLeftBearing() maximum left and minRightBearing()
right font bearings as is necessary for multi-line text to align
correctly. Also, fontHeight() and lineSpacing() are used to calculate
the height, rather than individual character heights.
*/

    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, int flags, String text, int tabStops) {
        return boundingRect(rect, flags, text, tabStops, (int []) null);
    }

/**
This is an overloaded function provided for convenience.
*/

    public final com.trolltech.qt.core.QRectF boundingRect(com.trolltech.qt.core.QRectF rect, int flags, String text) {
        return boundingRect(rect, flags, text, 0);
    }
    // TEMPLATE - gui.fontmetrics_tabarray_function - END
    // TEMPLATE - gui.fontmetricsf_boundingrect - END


    // TEMPLATE - gui.fontmetrics_tabarray_function - START
/**
Returns the size in pixels of the characters in the given <tt>text</tt>. <p>The <tt>flags</tt> argument is the bitwise OR of the following flags: <ul><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextSingleLine } ignores newline characters.</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextExpandTabs } expands tabs (see below)</li><li> {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic } interprets "&amp;x" as x, i.e. underlined.</li><li> {@link com.trolltech.qt.gui.QFontMetricsF#size(int, java.lang.String, int, int[]) Qt::TextWordBreak} breaks the text to fit the rectangle.</li></ul> These flags are defined in Qt::TextFlags. <p>If {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextExpandTabs } is set in <tt>flags</tt>, the following behavior is used to interpret tab characters in the text: <ul><li> If <tt>tabArray</tt> is non-null, it specifies a 0-terminated sequence of pixel-positions for tabs in the text.</li><li> If <tt>tabStops</tt> is non-zero, it is used as the tab spacing (in pixels).</li></ul> Newline characters are processed as line breaks. <p>Note: Despite the different actual character heights, the heights of the bounding rectangles of "Yes" and "yes" are the same. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontMetricsF#boundingRect(char) boundingRect()}. <br></DD></DT>
*/

    public final com.trolltech.qt.core.QSizeF size(int flags, String text, int tabStops, int tabArray[]) {
        QNativePointer np = tabArray == null ? null : new QNativePointer(QNativePointer.Type.Int, tabArray.length + 1);
        if (np != null) {
            for (int i=0; i<tabArray.length; ++i) np.setIntAt(i, tabArray[i]);
            np.setIntAt(tabArray.length, 0);
        }
        return size(flags, text, tabStops, np);
    }

/**
This is an overloaded function provided for convenience.
*/

    public final com.trolltech.qt.core.QSizeF size(int flags, String text, int tabStops) {
        return size(flags, text, tabStops, (int []) null);
    }

/**
This is an overloaded function provided for convenience.
*/

    public final com.trolltech.qt.core.QSizeF size(int flags, String text) {
        return size(flags, text, 0);
    }
    // TEMPLATE - gui.fontmetrics_tabarray_function - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFontMetricsF clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFontMetricsF __qt_clone(long __this_nativeId);
}
