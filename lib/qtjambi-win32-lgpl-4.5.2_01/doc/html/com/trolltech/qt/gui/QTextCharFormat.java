package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextCharFormat class provides formatting information for characters in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. The character format of text in a document specifies the visual properties of the text, as well as information about its role in a hypertext document. <p>The font used can be set by supplying a font to the {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()} function, and each aspect of its appearance can be adjusted to give the desired effect. {@link com.trolltech.qt.gui.QTextCharFormat#setFontFamily(java.lang.String) setFontFamily()} and {@link com.trolltech.qt.gui.QTextCharFormat#setFontPointSize(double) setFontPointSize()} define the font's family (e.g. Times) and printed size; {@link com.trolltech.qt.gui.QTextCharFormat#setFontWeight(int) setFontWeight()} and {@link com.trolltech.qt.gui.QTextCharFormat#setFontItalic(boolean) setFontItalic()} provide control over the style of the font. {@link com.trolltech.qt.gui.QTextCharFormat#setFontUnderline(boolean) setFontUnderline()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFontOverline(boolean) setFontOverline()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFontStrikeOut(boolean) setFontStrikeOut()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFontFixedPitch(boolean) setFontFixedPitch()} provide additional effects for text. <p>The color is set with {@link com.trolltech.qt.gui.QTextFormat#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. If the text is intended to be used as an anchor (for hyperlinks), this can be enabled with {@link com.trolltech.qt.gui.QTextCharFormat#setAnchor(boolean) setAnchor()}. The {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorHref(java.lang.String) setAnchorHref()} and {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorNames(java.util.List) setAnchorNames()} functions are used to specify the information about the hyperlink's destination and the anchor's name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat QTextFormat}, {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat}, {@link com.trolltech.qt.gui.QTextTableFormat QTextTableFormat}, and {@link com.trolltech.qt.gui.QTextListFormat QTextListFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextCharFormat extends com.trolltech.qt.gui.QTextFormat
    implements java.lang.Cloneable
{
/**
This enum describes the ways that adjacent characters can be vertically aligned.
*/

    public enum VerticalAlignment implements com.trolltech.qt.QtEnumerator {
/**
 Adjacent characters are positioned in the standard way for text in the writing system in use.
*/

        AlignNormal(0),
/**
 Characters are placed above the baseline for normal text.
*/

        AlignSuperScript(1),
/**
 Characters are placed below the baseline for normal text.
*/

        AlignSubScript(2),
/**
 The center of the object is vertically aligned with the base line. Currently, this is only implemented for inline objects.
*/

        AlignMiddle(3),
/**
 The top edge of the object is vertically aligned with the base line.
*/

        AlignTop(4),
/**
 The bottom edge of the object is vertically aligned with the base line.
*/

        AlignBottom(5);

        VerticalAlignment(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextCharFormat$VerticalAlignment constant with the specified <tt>int</tt>.</brief>
*/

        public static VerticalAlignment resolve(int value) {
            return (VerticalAlignment) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AlignNormal;
            case 1: return AlignSuperScript;
            case 2: return AlignSubScript;
            case 3: return AlignMiddle;
            case 4: return AlignTop;
            case 5: return AlignBottom;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the different ways drawing underlined text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.PenStyle Qt::PenStyle }. <br></DD></DT>
*/

    public enum UnderlineStyle implements com.trolltech.qt.QtEnumerator {
/**
 Text is draw without any underlining decoration.
*/

        NoUnderline(0),
/**
 A line is drawn using {@link com.trolltech.qt.core.Qt.PenStyle Qt::SolidLine }.
*/

        SingleUnderline(1),
/**
 Dashes are drawn using {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashLine }.
*/

        DashUnderline(2),
/**
 Dots are drawn using {@link com.trolltech.qt.core.Qt.PenStyle Qt::DotLine };
*/

        DotLine(3),
/**
 Dashs and dots are drawn using {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotLine }.
*/

        DashDotLine(4),
/**
 Underlines draw drawn using {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotDotLine }.
*/

        DashDotDotLine(5),
/**
 The text is underlined using a wave shaped line.
*/

        WaveUnderline(6),
/**
 The underline is drawn depending on the QStyle.:SH_SpellCeckUnderlineStyle style hint of the {@link com.trolltech.qt.gui.QApplication QApplication} style. By default this is mapped to {@link com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle WaveUnderline }, on Mac OS X it is mapped to {@link com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle DashDotLine }.
*/

        SpellCheckUnderline(7);

        UnderlineStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextCharFormat$UnderlineStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static UnderlineStyle resolve(int value) {
            return (UnderlineStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoUnderline;
            case 1: return SingleUnderline;
            case 2: return DashUnderline;
            case 3: return DotLine;
            case 4: return DashDotLine;
            case 5: return DashDotDotLine;
            case 6: return WaveUnderline;
            case 7: return SpellCheckUnderline;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a new character format object.
*/

    public QTextCharFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextCharFormat();
    }

    native void __qt_QTextCharFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCharFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextCharFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextCharFormat_QTextFormat(long fmt);

/**
Returns the text format's hypertext link, or an empty string if none has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setAnchorHref(java.lang.String) setAnchorHref()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String anchorHref()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_anchorHref(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_anchorHref(long __this__nativeId);

/**
Returns the anchor names associated with this text format, or an empty string list if none has been set. If the anchor names are set, text with this format can be the destination of a hypertext link. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setAnchorNames(java.util.List) setAnchorNames()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> anchorNames()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_anchorNames(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_anchorNames(long __this__nativeId);

/**
Returns the font for this character format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the current capitalization type of the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontCapitalization(com.trolltech.qt.gui.QFont.Capitalization) setFontCapitalization()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.Capitalization fontCapitalization()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.Capitalization.resolve(__qt_fontCapitalization(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fontCapitalization(long __this__nativeId);

/**
Returns the text format's font family. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontFamily(java.lang.String) setFontFamily()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fontFamily()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontFamily(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fontFamily(long __this__nativeId);

/**
Returns true if the text format's font is fixed pitch; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontFixedPitch(boolean) setFontFixedPitch()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontFixedPitch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontFixedPitch(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontFixedPitch(long __this__nativeId);

/**
Returns true if the text format's font is italic; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontItalic(boolean) setFontItalic()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontItalic()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontItalic(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontItalic(long __this__nativeId);

/**
Returns true if the the font kerning is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontKerning(boolean) setFontKerning()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontKerning()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontKerning(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontKerning(long __this__nativeId);

/**
Returns the current letter spacing percentage. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontLetterSpacing(double) setFontLetterSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double fontLetterSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontLetterSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_fontLetterSpacing(long __this__nativeId);

/**
Returns true if the text format's font is overlined; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontOverline(boolean) setFontOverline()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontOverline()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontOverline(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontOverline(long __this__nativeId);

/**
Returns the font size used to display text in this format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontPointSize(double) setFontPointSize()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double fontPointSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontPointSize(nativeId());
    }
    @QtBlockedSlot
    native double __qt_fontPointSize(long __this__nativeId);

/**
Returns true if the text format's font is struck out (has a horizontal line drawn through it); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontStrikeOut(boolean) setFontStrikeOut()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontStrikeOut()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontStrikeOut(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontStrikeOut(long __this__nativeId);

/**
Returns the font style hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setFontStyleHint()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.StyleHint fontStyleHint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.StyleHint.resolve(__qt_fontStyleHint(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fontStyleHint(long __this__nativeId);

/**
Returns the current font style strategy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy) setFontStyleStrategy()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.StyleStrategy fontStyleStrategy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.StyleStrategy.resolve(__qt_fontStyleStrategy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fontStyleStrategy(long __this__nativeId);

/**
Returns true if the text format's font is underlined; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontUnderline(boolean) setFontUnderline()}, and {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontUnderline()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontUnderline(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontUnderline(long __this__nativeId);

/**
Returns the text format's font weight. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontWeight(int) setFontWeight()}, {@link com.trolltech.qt.gui.QTextCharFormat#font() font()}, and {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int fontWeight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontWeight(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fontWeight(long __this__nativeId);

/**
Returns the current word spacing value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setFontWordSpacing(double) setFontWordSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double fontWordSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontWordSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_fontWordSpacing(long __this__nativeId);

/**
Returns true if the text is formatted as an anchor; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setAnchor(boolean) setAnchor()}, {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorHref(java.lang.String) setAnchorHref()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorNames(java.util.List) setAnchorNames()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAnchor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAnchor(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAnchor(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
If <tt>anchor</tt> is true, text with this format represents an anchor, and is formatted in the appropriate way; otherwise the text is formatted normally. (Anchors are hyperlinks which are often shown underlined and in a different color from plain text.) <p>The way the text is rendered is independent of whether or not the format has a valid anchor defined. Use {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorHref(java.lang.String) setAnchorHref()}, and optionally {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorNames(java.util.List) setAnchorNames()} to create a hypertext link. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#isAnchor() isAnchor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAnchor(boolean anchor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAnchor_boolean(nativeId(), anchor);
    }
    @QtBlockedSlot
    native void __qt_setAnchor_boolean(long __this__nativeId, boolean anchor);

/**
Sets the hypertext link for the text format to the given <tt>value</tt>. This is typically a URL like "http://qtsoftware.com/index.html". <p>The anchor will be displayed with the <tt>value</tt> as its display text; if you want to display different text call {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorNames(java.util.List) setAnchorNames()}. <p>To format the text as a hypertext link use {@link com.trolltech.qt.gui.QTextCharFormat#setAnchor(boolean) setAnchor()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#anchorHref() anchorHref()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAnchorHref(java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAnchorHref_String(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setAnchorHref_String(long __this__nativeId, java.lang.String value);

/**
Sets the text format's anchor <tt>names</tt>. For the anchor to work as a hyperlink, the destination must be set with {@link com.trolltech.qt.gui.QTextCharFormat#setAnchorHref(java.lang.String) setAnchorHref()} and the anchor must be enabled with {@link com.trolltech.qt.gui.QTextCharFormat#setAnchor(boolean) setAnchor()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#anchorNames() anchorNames()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAnchorNames(java.util.List<java.lang.String> names)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAnchorNames_List(nativeId(), names);
    }
    @QtBlockedSlot
    native void __qt_setAnchorNames_List(long __this__nativeId, java.util.List<java.lang.String> names);

/**
Sets the text format's <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
Sets the capitalization of the text that apppears in this font to <tt>capitalization</tt>. <p>A font's capitalization makes the text appear in the selected capitalization mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontCapitalization() fontCapitalization()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontCapitalization(com.trolltech.qt.gui.QFont.Capitalization capitalization)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontCapitalization_Capitalization(nativeId(), capitalization.value());
    }
    @QtBlockedSlot
    native void __qt_setFontCapitalization_Capitalization(long __this__nativeId, int capitalization);

/**
Sets the text format's font <tt>family</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontFamily() fontFamily()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontFamily(java.lang.String family)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontFamily_String(nativeId(), family);
    }
    @QtBlockedSlot
    native void __qt_setFontFamily_String(long __this__nativeId, java.lang.String family);

/**
If <tt>fixedPitch</tt> is true, sets the text format's font to be fixed pitch; otherwise a non-fixed pitch font is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontFixedPitch() fontFixedPitch()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontFixedPitch(boolean fixedPitch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontFixedPitch_boolean(nativeId(), fixedPitch);
    }
    @QtBlockedSlot
    native void __qt_setFontFixedPitch_boolean(long __this__nativeId, boolean fixedPitch);

/**
If <tt>italic</tt> is true, sets the text format's font to be italic; otherwise the font will be non-italic. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontItalic() fontItalic()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontItalic(boolean italic)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontItalic_boolean(nativeId(), italic);
    }
    @QtBlockedSlot
    native void __qt_setFontItalic_boolean(long __this__nativeId, boolean italic);

/**
Enables kerning for this font if <tt>enable</tt> is true; otherwise disables it. <p>When kerning is enabled, glyph metrics do not add up anymore, even for Latin text. In other words, the assumption that width('a') + width('b') is equal to width("ab") is not neccesairly true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontKerning() fontKerning()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontKerning(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontKerning_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setFontKerning_boolean(long __this__nativeId, boolean enable);

/**
Sets the letter spacing of this format to the given <tt>spacing</tt>, in percent. A value of 100 indicates default spacing; a value of 200 doubles the amount of space a letter takes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontLetterSpacing() fontLetterSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontLetterSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontLetterSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setFontLetterSpacing_double(long __this__nativeId, double spacing);

/**
If <tt>overline</tt> is true, sets the text format's font to be overlined; otherwise the font is displayed non-overlined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontOverline() fontOverline()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontOverline(boolean overline)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontOverline_boolean(nativeId(), overline);
    }
    @QtBlockedSlot
    native void __qt_setFontOverline_boolean(long __this__nativeId, boolean overline);

/**
Sets the text format's font <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontPointSize() fontPointSize()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontPointSize(double size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontPointSize_double(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setFontPointSize_double(long __this__nativeId, double size);

/**
If <tt>strikeOut</tt> is true, sets the text format's font with strike-out enabled (with a horizontal line through it); otherwise it is displayed without strikeout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontStrikeOut() fontStrikeOut()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontStrikeOut(boolean strikeOut)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontStrikeOut_boolean(nativeId(), strikeOut);
    }
    @QtBlockedSlot
    native void __qt_setFontStrikeOut_boolean(long __this__nativeId, boolean strikeOut);


/**
Sets the font style <tt>hint</tt> and <tt>strategy</tt>. <p>Qt does not support style hints on X11 since this information is not provided by the window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontStyleHint() fontStyleHint()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) QFont::setStyleHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontStyleHint(com.trolltech.qt.gui.QFont.StyleHint hint) {
        setFontStyleHint(hint, com.trolltech.qt.gui.QFont.StyleStrategy.PreferDefault);
    }
/**
Sets the font style <tt>hint</tt> and <tt>strategy</tt>. <p>Qt does not support style hints on X11 since this information is not provided by the window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontStyleHint() fontStyleHint()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) QFont::setStyleHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontStyleHint(com.trolltech.qt.gui.QFont.StyleHint hint, com.trolltech.qt.gui.QFont.StyleStrategy strategy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontStyleHint_StyleHint_StyleStrategy(nativeId(), hint.value(), strategy.value());
    }
    @QtBlockedSlot
    native void __qt_setFontStyleHint_StyleHint_StyleStrategy(long __this__nativeId, int hint, int strategy);

/**
Sets the font style <tt>strategy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontStyleStrategy() fontStyleStrategy()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QFont#setStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy) QFont::setStyleStrategy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy strategy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontStyleStrategy_StyleStrategy(nativeId(), strategy.value());
    }
    @QtBlockedSlot
    native void __qt_setFontStyleStrategy_StyleStrategy(long __this__nativeId, int strategy);

/**
If <tt>underline</tt> is true, sets the text format's font to be underlined; otherwise it is displayed non-underlined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontUnderline() fontUnderline()}, and {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontUnderline(boolean underline)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontUnderline_boolean(nativeId(), underline);
    }
    @QtBlockedSlot
    native void __qt_setFontUnderline_boolean(long __this__nativeId, boolean underline);

/**
Sets the text format's font weight to <tt>weight</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontWeight() fontWeight()}, {@link com.trolltech.qt.gui.QTextCharFormat#setFont(com.trolltech.qt.gui.QFont) setFont()}, and {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontWeight(int weight)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontWeight_int(nativeId(), weight);
    }
    @QtBlockedSlot
    native void __qt_setFontWeight_int(long __this__nativeId, int weight);

/**
Sets the word spacing of this format to the given <tt>spacing</tt>, in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#fontWordSpacing() fontWordSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontWordSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontWordSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setFontWordSpacing_double(long __this__nativeId, double spacing);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setTableCellColumnSpan(int tableCellColumnSpan)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTableCellColumnSpan_int(nativeId(), tableCellColumnSpan);
    }
    @QtBlockedSlot
    native void __qt_setTableCellColumnSpan_int(long __this__nativeId, int tableCellColumnSpan);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setTableCellRowSpan(int tableCellRowSpan)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTableCellRowSpan_int(nativeId(), tableCellRowSpan);
    }
    @QtBlockedSlot
    native void __qt_setTableCellRowSpan_int(long __this__nativeId, int tableCellRowSpan);

/**
Sets the pen used to draw the outlines of characters to the given <tt>pen</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#textOutline() textOutline()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextOutline(com.trolltech.qt.gui.QPen pen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextOutline_QPen(nativeId(), pen == null ? 0 : pen.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTextOutline_QPen(long __this__nativeId, long pen);

/**
Sets the tool tip for a fragment of text to the given <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#toolTip() toolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolTip(java.lang.String tip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), tip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String tip);

/**
Sets the underline color used for the characters with this format to the <tt>color</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#underlineColor() underlineColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUnderlineColor(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUnderlineColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUnderlineColor_QColor(long __this__nativeId, long color);

/**
Sets the style of underlining the text to <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#underlineStyle() underlineStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUnderlineStyle(com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUnderlineStyle_UnderlineStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setUnderlineStyle_UnderlineStyle(long __this__nativeId, int style);

/**
Sets the vertical alignment used for the characters with this format to the <tt>alignment</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#verticalAlignment() verticalAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalAlignment(com.trolltech.qt.gui.QTextCharFormat.VerticalAlignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalAlignment_VerticalAlignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setVerticalAlignment_VerticalAlignment(long __this__nativeId, int alignment);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int tableCellColumnSpan()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableCellColumnSpan(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tableCellColumnSpan(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int tableCellRowSpan()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableCellRowSpan(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tableCellRowSpan(long __this__nativeId);

/**
Returns the pen used to draw the outlines of characters in this format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setTextOutline(com.trolltech.qt.gui.QPen) setTextOutline()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPen textOutline()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textOutline(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPen __qt_textOutline(long __this__nativeId);

/**
Returns the tool tip that is displayed for a fragment of text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setToolTip(java.lang.String) setToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
Returns the color used to underline the characters with this format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setUnderlineColor(com.trolltech.qt.gui.QColor) setUnderlineColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor underlineColor()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_underlineColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_underlineColor(long __this__nativeId);

/**
Returns the style of underlining the text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setUnderlineStyle(com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle) setUnderlineStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle underlineStyle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle.resolve(__qt_underlineStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_underlineStyle(long __this__nativeId);

/**
Returns the vertical alignment used for characters with this format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCharFormat#setVerticalAlignment(com.trolltech.qt.gui.QTextCharFormat.VerticalAlignment) setVerticalAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat.VerticalAlignment verticalAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextCharFormat.VerticalAlignment.resolve(__qt_verticalAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_verticalAlignment(long __this__nativeId);

/**
@exclude
*/

    public static native QTextCharFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCharFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextCharFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextCharFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextCharFormat __qt_clone(long __this_nativeId);
}
