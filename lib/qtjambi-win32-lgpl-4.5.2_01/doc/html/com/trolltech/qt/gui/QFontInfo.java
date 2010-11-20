package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFontInfo class provides general information about fonts. The QFontInfo class provides the same access functions as {@link com.trolltech.qt.gui.QFont QFont}, e.g. {@link com.trolltech.qt.gui.QFontInfo#family() family()}, {@link com.trolltech.qt.gui.QFontInfo#pointSize() pointSize()}, {@link com.trolltech.qt.gui.QFontInfo#italic() italic()}, {@link com.trolltech.qt.gui.QFontInfo#weight() weight()}, {@link com.trolltech.qt.gui.QFontInfo#fixedPitch() fixedPitch()}, {@link com.trolltech.qt.gui.QFontInfo#styleHint() styleHint()} etc. But whilst the {@link com.trolltech.qt.gui.QFont QFont} access functions return the values that were set, a QFontInfo object returns the values that apply to the font that will actually be used to draw the text. <p>For example, when the program asks for a 25pt Courier font on a machine that has a non-scalable 24pt Courier font, {@link com.trolltech.qt.gui.QFont QFont} will (normally) use the 24pt Courier for rendering. In this case, {@link com.trolltech.qt.gui.QFont#pointSize() QFont::pointSize()} returns 25 and {@link com.trolltech.qt.gui.QFontInfo#pointSize() QFontInfo::pointSize()} returns 24. <p>There are three ways to create a QFontInfo object. <ol><li> Calling the QFontInfo constructor with a {@link com.trolltech.qt.gui.QFont QFont} creates a font info object for a screen-compatible font, i.e. the font cannot be a printer font. If the font is changed later, the font info object is not updated. <p>(Note: If you use a printer font the values returned may be inaccurate. Printer fonts are not always accessible so the nearest screen font is used if a printer font is supplied.)</li><li> {@link com.trolltech.qt.gui.QWidget#fontInfo() QWidget::fontInfo()} returns the font info for a widget's font. This is equivalent to calling QFontInfo(widget-&gt;font()). If the widget's font is changed later, the font info object is not updated.</li><li> {@link com.trolltech.qt.gui.QPainter#fontInfo() QPainter::fontInfo()} returns the font info for a painter's current font. If the painter's font is changed later, the font info object is not updated.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}, and {@link com.trolltech.qt.gui.QFontDatabase QFontDatabase}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFontInfo extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a font info object for <tt>font</tt>. <p>The font must be screen-compatible, i.e. a font you use when drawing text in {@link com.trolltech.qt.gui.QWidget widgets} or {@link com.trolltech.qt.gui.QPixmap pixmaps}, not {@link com.trolltech.qt.gui.QPicture QPicture} or {@link com.trolltech.qt.gui.QPrinter QPrinter}. <p>The font info object holds the information for the font that is passed in the constructor at the time it is created, and is not updated if the font's attributes are changed later. <p>Use {@link com.trolltech.qt.gui.QPainter#fontInfo() QPainter::fontInfo()} to get the font info when painting. This will give correct results also when painting on paint device that is not screen-compatible.
*/

    public QFontInfo(com.trolltech.qt.gui.QFont arg__1){
        super((QPrivateConstructor)null);
        __qt_QFontInfo_QFont(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontInfo.class, 1, 1000);
    }

    native void __qt_QFontInfo_QFont(long arg__1);

/**
Constructs a copy of <tt>fi</tt>.
*/

    public QFontInfo(com.trolltech.qt.gui.QFontInfo arg__1){
        super((QPrivateConstructor)null);
        __qt_QFontInfo_QFontInfo(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFontInfo.class, 1, 1000);
    }

    native void __qt_QFontInfo_QFontInfo(long arg__1);

/**
Returns true if {@link com.trolltech.qt.gui.QFontInfo#weight() weight()} would return a value greater than {@link com.trolltech.qt.gui.QFont.Weight QFont::Normal }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontInfo#weight() weight()}, and {@link com.trolltech.qt.gui.QFont#bold() QFont::bold()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean bold()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bold(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_bold(long __this__nativeId);

/**
Returns true if the matched window system font is exactly the same as the one specified by the font; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#exactMatch() QFont::exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exactMatch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exactMatch(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exactMatch(long __this__nativeId);

/**
Returns the family name of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#family() QFont::family()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String family()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_family(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_family(long __this__nativeId);

/**
Returns the fixed pitch value of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#fixedPitch() QFont::fixedPitch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fixedPitch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixedPitch(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fixedPitch(long __this__nativeId);

/**
Returns the italic value of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#italic() QFont::italic()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean italic()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_italic(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_italic(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean overline()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_overline(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_overline(long __this__nativeId);

/**
Returns the pixel size of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pointSize() QFont::pointSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pixelSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixelSize(long __this__nativeId);

/**
Returns the point size of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontInfo#pointSizeF() pointSizeF()}, and {@link com.trolltech.qt.gui.QFont#pointSize() QFont::pointSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pointSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pointSize(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pointSize(long __this__nativeId);

/**
Returns the point size of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pointSizeF() QFont::pointSizeF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double pointSizeF()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pointSizeF(nativeId());
    }
    @QtBlockedSlot
    native double __qt_pointSizeF(long __this__nativeId);

/**
Returns true if the font is a raw mode font; otherwise returns false. <p>If it is a raw mode font, all other functions in QFontInfo will return the same values set in the {@link com.trolltech.qt.gui.QFont QFont}, regardless of the font actually used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#rawMode() QFont::rawMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rawMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rawMode(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean strikeOut()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_strikeOut(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_strikeOut(long __this__nativeId);

/**
Returns the style value of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#style() QFont::style()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.Style style()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.Style.resolve(__qt_style(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_style(long __this__nativeId);

/**
Returns the style of the matched window system font. <p>Currently only returns the style hint set in {@link com.trolltech.qt.gui.QFont QFont}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#styleHint() QFont::styleHint()}, and {@link com.trolltech.qt.gui.QFont.StyleHint QFont::StyleHint }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.StyleHint styleHint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.StyleHint.resolve(__qt_styleHint(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_styleHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean underline()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_underline(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_underline(long __this__nativeId);

/**
Returns the weight of the matched window system font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#weight() QFont::weight()}, and {@link com.trolltech.qt.gui.QFontInfo#bold() bold()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int weight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_weight(nativeId());
    }
    @QtBlockedSlot
    native int __qt_weight(long __this__nativeId);

/**
@exclude
*/

    public static native QFontInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFontInfo(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFontInfo array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFontInfo clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFontInfo __qt_clone(long __this_nativeId);
}
