package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextFormat class provides formatting information for a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A QTextFormat is a generic class used for describing the format of parts of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. The derived classes {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}, {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat}, {@link com.trolltech.qt.gui.QTextListFormat QTextListFormat}, and {@link com.trolltech.qt.gui.QTextTableFormat QTextTableFormat} are usually more useful, and describe the formatting that is applied to specific parts of the document. <p>A format has a <tt>FormatType</tt> which specifies the kinds of thing it can format; e.g. a block of text, a list, a table, etc. A format also has various properties (some specific to particular format types), as described by the Property enum. Every property has a corresponding Property. <p>The format type is given by {@link com.trolltech.qt.gui.QTextFormat#type() type()}, and the format can be tested with {@link com.trolltech.qt.gui.QTextFormat#isCharFormat() isCharFormat()}, {@link com.trolltech.qt.gui.QTextFormat#isBlockFormat() isBlockFormat()}, {@link com.trolltech.qt.gui.QTextFormat#isListFormat() isListFormat()}, {@link com.trolltech.qt.gui.QTextFormat#isTableFormat() isTableFormat()}, {@link com.trolltech.qt.gui.QTextFormat#isFrameFormat() isFrameFormat()}, and {@link com.trolltech.qt.gui.QTextFormat#isImageFormat() isImageFormat()}. If the type is determined, it can be retrieved with {@link com.trolltech.qt.gui.QTextFormat#toCharFormat() toCharFormat()}, {@link com.trolltech.qt.gui.QTextFormat#toBlockFormat() toBlockFormat()}, {@link com.trolltech.qt.gui.QTextFormat#toListFormat() toListFormat()}, {@link com.trolltech.qt.gui.QTextFormat#toTableFormat() toTableFormat()}, {@link com.trolltech.qt.gui.QTextFormat#toFrameFormat() toFrameFormat()}, and {@link com.trolltech.qt.gui.QTextFormat#toImageFormat() toImageFormat()}. <p>A format's properties can be set with the {@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()} functions, and retrieved with {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, and {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()} as appropriate. All the property IDs used in the format can be retrieved with allPropertyIds(). One format can be merged into another using {@link com.trolltech.qt.gui.QTextFormat#merge(com.trolltech.qt.gui.QTextFormat) merge()}. <p>A format's object index can be set with {@link com.trolltech.qt.gui.QTextFormat#setObjectIndex(int) setObjectIndex()}, and retrieved with {@link com.trolltech.qt.gui.QTextFormat#objectIndex() objectIndex()}. These methods can be used to associate the format with a {@link com.trolltech.qt.gui.QTextObject QTextObject}. It is used to represent lists, frames, and tables inside the document. <p><DT><b>See also:</b><br><DD>{@link <a href="../text.html">Text Processing Classes</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextFormat extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
Paragraph and character properties Paragraph properties Character properties List properties Table and frame properties Table cell properties Image properties Selection properties Page break properties
*/

    public enum Property implements com.trolltech.qt.QtEnumerator {
/**

*/

        ObjectIndex(0),
/**

*/

        CssFloat(2048),
/**
 The layout direction of the text in the document ({@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LayoutDirection }).
*/

        LayoutDirection(2049),
/**

*/

        OutlinePen(2064),
/**

*/

        BackgroundBrush(2080),
/**

*/

        ForegroundBrush(2081),
/**

*/

        BackgroundImageUrl(2083),
/**

*/

        BlockAlignment(4112),
/**

*/

        BlockTopMargin(4144),
/**

*/

        BlockBottomMargin(4145),
/**

*/

        BlockLeftMargin(4146),
/**

*/

        BlockRightMargin(4147),
/**

*/

        TextIndent(4148),
/**
 Specifies the tab positions. The tab positions are structs of QTextOption::Tab which are stored in a QList (internally, in a QList&lt;{@link com.trolltech.qt.QVariant QVariant}&gt;).
*/

        TabPositions(4149),
/**

*/

        BlockIndent(4160),
/**

*/

        BlockNonBreakableLines(4176),
/**

*/

        BlockTrailingHorizontalRulerWidth(4192),
/**
 Specifies the capitalization type that is to be applied to the text.
*/

        FontCapitalization(8160),
/**
 Changes the default spacing between individual letters in the font. The value is specified in percentage, with 100 as the default value.
*/

        FontLetterSpacing(8161),
/**
 Changes the default spacing between individual words. A positive value increases the word spacing by the corresponding pixels; a negative value decreases the spacing.
*/

        FontWordSpacing(8162),
/**
 Corresponds to the {@link com.trolltech.qt.gui.QFont.StyleHint QFont::StyleHint } property
*/

        FontStyleHint(8163),
/**
 Corresponds to the {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::StyleStrategy } property
*/

        FontStyleStrategy(8164),
/**
 Specifies whether the font has kerning turned on.
*/

        FontKerning(8165),
/**

*/

        FontFamily(8192),
/**

*/

        FontPointSize(8193),
/**
 Specifies the change in size given to the fontsize already set using {@link com.trolltech.qt.gui.QTextFormat.Property FontPointSize } or {@link com.trolltech.qt.gui.QTextFormat.Property FontPixelSize }.
*/

        FontSizeAdjustment(8194),
/**

*/

        FontWeight(8195),
/**

*/

        FontItalic(8196),
/**
 This property has been deprecated. Use {@link com.trolltech.qt.gui.QTextFormat.Property QTextFormat::TextUnderlineStyle } instead.
*/

        FontUnderline(8197),
/**

*/

        FontOverline(8198),
/**

*/

        FontStrikeOut(8199),
/**

*/

        FontFixedPitch(8200),
/**

*/

        FontPixelSize(8201),
/**

*/

        TextUnderlineColor(8208),
/**

*/

        TextVerticalAlignment(8225),
/**

*/

        TextOutline(8226),
/**

*/

        TextUnderlineStyle(8227),
/**
 Specifies the (optional) tool tip to be displayed for a fragment of text.
*/

        TextToolTip(8228),
/**

*/

        IsAnchor(8240),
/**

*/

        AnchorHref(8241),
/**

*/

        AnchorName(8242),
/**

*/

        ObjectType(12032),
/**

*/

        ListStyle(12288),
/**

*/

        ListIndent(12289),
/**

*/

        FrameBorder(16384),
/**

*/

        FrameMargin(16385),
/**

*/

        FramePadding(16386),
/**

*/

        FrameWidth(16387),
/**

*/

        FrameHeight(16388),
/**

*/

        FrameTopMargin(16389),
/**

*/

        FrameBottomMargin(16390),
/**

*/

        FrameLeftMargin(16391),
/**

*/

        FrameRightMargin(16392),
/**

*/

        FrameBorderBrush(16393),
/**

*/

        FrameBorderStyle(16400),
/**

*/

        TableColumns(16640),
/**

*/

        TableColumnWidthConstraints(16641),
/**

*/

        TableCellSpacing(16642),
/**

*/

        TableCellPadding(16643),
/**

*/

        TableHeaderRowCount(16644),
/**

*/

        TableCellRowSpan(18448),
/**

*/

        TableCellColumnSpan(18449),
/**

*/

        TableCellTopPadding(18450),
/**

*/

        TableCellBottomPadding(18451),
/**

*/

        TableCellLeftPadding(18452),
/**

*/

        TableCellRightPadding(18453),
/**

*/

        ImageName(20480),
/**

*/

        ImageWidth(20496),
/**

*/

        ImageHeight(20497),
/**
 When set on the characterFormat of a selection, the whole width of the text will be shown selected
*/

        FullWidthSelection(24576),
/**

*/

        PageBreakPolicy(28672),
/**

*/

        UserProperty(1048576);

        Property(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextFormat$Property constant with the specified <tt>int</tt>.</brief>
*/

        public static Property resolve(int value) {
            return (Property) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ObjectIndex;
            case 2048: return CssFloat;
            case 2049: return LayoutDirection;
            case 2064: return OutlinePen;
            case 2080: return BackgroundBrush;
            case 2081: return ForegroundBrush;
            case 2083: return BackgroundImageUrl;
            case 4112: return BlockAlignment;
            case 4144: return BlockTopMargin;
            case 4145: return BlockBottomMargin;
            case 4146: return BlockLeftMargin;
            case 4147: return BlockRightMargin;
            case 4148: return TextIndent;
            case 4149: return TabPositions;
            case 4160: return BlockIndent;
            case 4176: return BlockNonBreakableLines;
            case 4192: return BlockTrailingHorizontalRulerWidth;
            case 8160: return FontCapitalization;
            case 8161: return FontLetterSpacing;
            case 8162: return FontWordSpacing;
            case 8163: return FontStyleHint;
            case 8164: return FontStyleStrategy;
            case 8165: return FontKerning;
            case 8192: return FontFamily;
            case 8193: return FontPointSize;
            case 8194: return FontSizeAdjustment;
            case 8195: return FontWeight;
            case 8196: return FontItalic;
            case 8197: return FontUnderline;
            case 8198: return FontOverline;
            case 8199: return FontStrikeOut;
            case 8200: return FontFixedPitch;
            case 8201: return FontPixelSize;
            case 8208: return TextUnderlineColor;
            case 8225: return TextVerticalAlignment;
            case 8226: return TextOutline;
            case 8227: return TextUnderlineStyle;
            case 8228: return TextToolTip;
            case 8240: return IsAnchor;
            case 8241: return AnchorHref;
            case 8242: return AnchorName;
            case 12032: return ObjectType;
            case 12288: return ListStyle;
            case 12289: return ListIndent;
            case 16384: return FrameBorder;
            case 16385: return FrameMargin;
            case 16386: return FramePadding;
            case 16387: return FrameWidth;
            case 16388: return FrameHeight;
            case 16389: return FrameTopMargin;
            case 16390: return FrameBottomMargin;
            case 16391: return FrameLeftMargin;
            case 16392: return FrameRightMargin;
            case 16393: return FrameBorderBrush;
            case 16400: return FrameBorderStyle;
            case 16640: return TableColumns;
            case 16641: return TableColumnWidthConstraints;
            case 16642: return TableCellSpacing;
            case 16643: return TableCellPadding;
            case 16644: return TableHeaderRowCount;
            case 18448: return TableCellRowSpan;
            case 18449: return TableCellColumnSpan;
            case 18450: return TableCellTopPadding;
            case 18451: return TableCellBottomPadding;
            case 18452: return TableCellLeftPadding;
            case 18453: return TableCellRightPadding;
            case 20480: return ImageName;
            case 20496: return ImageWidth;
            case 20497: return ImageHeight;
            case 24576: return FullWidthSelection;
            case 28672: return PageBreakPolicy;
            case 1048576: return UserProperty;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum FormatType implements com.trolltech.qt.QtEnumerator {
/**

*/

        InvalidFormat(-1),
/**

*/

        BlockFormat(1),
/**

*/

        CharFormat(2),
/**

*/

        ListFormat(3),
/**

*/

        TableFormat(4),
/**

*/

        FrameFormat(5),
/**

*/

        UserFormat(100);

        FormatType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextFormat$FormatType constant with the specified <tt>int</tt>.</brief>
*/

        public static FormatType resolve(int value) {
            return (FormatType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return InvalidFormat;
            case 1: return BlockFormat;
            case 2: return CharFormat;
            case 3: return ListFormat;
            case 4: return TableFormat;
            case 5: return FrameFormat;
            case 100: return UserFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ObjectTypes implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoObject(0),
/**

*/

        ImageObject(1),
/**

*/

        TableObject(2),
/**

*/

        TableCellObject(3),
/**
 The first object that can be used for application-specific purposes.
*/

        UserObject(4096);

        ObjectTypes(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextFormat$ObjectTypes constant with the specified <tt>int</tt>.</brief>
*/

        public static ObjectTypes resolve(int value) {
            return (ObjectTypes) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoObject;
            case 1: return ImageObject;
            case 2: return TableObject;
            case 3: return TableCellObject;
            case 4096: return UserObject;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum PageBreakFlag implements com.trolltech.qt.QtEnumerator {
/**
 The page break is determined automatically depending on the available space on the current page
*/

        PageBreak_Auto(0),
/**
 The page is always broken before the paragraph/table
*/

        PageBreak_AlwaysBefore(1),
/**
 A new page is always started after the paragraph/table
*/

        PageBreak_AlwaysAfter(16);

        PageBreakFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QTextFormat$PageBreakFlags with the specified <tt>com.trolltech.qt.gui.QTextFormat$PageBreakFlag[]</tt> QTextFormat$PageBreakFlag values set.</brief>
*/

        public static PageBreakFlags createQFlags(PageBreakFlag ... values) {
            return new PageBreakFlags(values);
        }
/**
<brief>Returns the QTextFormat$PageBreakFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static PageBreakFlag resolve(int value) {
            return (PageBreakFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PageBreak_Auto;
            case 1: return PageBreak_AlwaysBefore;
            case 16: return PageBreak_AlwaysAfter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class PageBreakFlags extends com.trolltech.qt.QFlags<PageBreakFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextFormat-PageBreakFlags with the specified <tt>com.trolltech.qt.gui.QTextFormat.PageBreakFlag[]</tt>. flags set.</brief>
*/

        public PageBreakFlags(PageBreakFlag ... args) { super(args); }
        public PageBreakFlags(int value) { setValue(value); }
    }



/**
Creates a new text format with an <tt>InvalidFormat</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat.FormatType FormatType }. <br></DD></DT>
*/

    public QTextFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextFormat();
    }

    native void __qt_QTextFormat();

/**
Creates a new text format with the same attributes as the <tt>other</tt> text format.
*/

    public QTextFormat(com.trolltech.qt.gui.QTextFormat rhs){
        super((QPrivateConstructor)null);
        __qt_QTextFormat_QTextFormat(rhs == null ? 0 : rhs.nativeId());
    }

    native void __qt_QTextFormat_QTextFormat(long rhs);

/**
Creates a new text format of the given <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat.FormatType FormatType }. <br></DD></DT>
*/

    public QTextFormat(int type){
        super((QPrivateConstructor)null);
        __qt_QTextFormat_int(type);
    }

    native void __qt_QTextFormat_int(int type);

/**
Returns the brush used to paint the document's background. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, {@link com.trolltech.qt.gui.QTextFormat#clearBackground() clearBackground()}, and {@link com.trolltech.qt.gui.QTextFormat#foreground() foreground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background(long __this__nativeId);

/**
Returns the value of the property specified by <tt>propertyId</tt>. If the property isn't of QTextFormat::Bool type, false is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean boolProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boolProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native boolean __qt_boolProperty_int(long __this__nativeId, int propertyId);

/**
Returns the value of the property given by <tt>propertyId</tt>; if the property isn't of {@link com.trolltech.qt.QVariant.Type QVariant::Brush } type, {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brushProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brushProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brushProperty_int(long __this__nativeId, int propertyId);

/**
Clears the brush used to paint the document's background. The default brush will be used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#background() background()}, {@link com.trolltech.qt.gui.QTextFormat#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and {@link com.trolltech.qt.gui.QTextFormat#clearForeground() clearForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearBackground()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearBackground(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearBackground(long __this__nativeId);

/**
Clears the brush used to paint the document's foreground. The default brush will be used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#foreground() foreground()}, {@link com.trolltech.qt.gui.QTextFormat#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, and {@link com.trolltech.qt.gui.QTextFormat#clearBackground() clearBackground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearForeground()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearForeground(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearForeground(long __this__nativeId);

/**
Clears the value of the property given by <tt>propertyId</tt>
*/

    @QtBlockedSlot
    public final void clearProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native void __qt_clearProperty_int(long __this__nativeId, int propertyId);

/**
Returns the value of the property given by <tt>propertyId</tt>; if the property isn't of {@link com.trolltech.qt.QVariant.Type QVariant::Color } type, an invalid color is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor colorProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colorProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_colorProperty_int(long __this__nativeId, int propertyId);

/**
Returns the value of the property specified by <tt>propertyId</tt>. If the property isn't of {@link com.trolltech.qt.QVariant.Type QVariant::Double } type, 0 is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double doubleProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native double __qt_doubleProperty_int(long __this__nativeId, int propertyId);

/**
Returns the brush used to render foreground details, such as text, frame outlines, and table borders. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}, {@link com.trolltech.qt.gui.QTextFormat#clearForeground() clearForeground()}, and {@link com.trolltech.qt.gui.QTextFormat#background() background()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush foreground()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_foreground(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_foreground(long __this__nativeId);

/**
Returns true if the text format has a property with the given <tt>propertyId</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#properties() properties()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native boolean __qt_hasProperty_int(long __this__nativeId, int propertyId);

/**
Returns the value of the property specified by <tt>propertyId</tt>. If the property is not of QTextFormat::Integer type, 0 is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int intProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native int __qt_intProperty_int(long __this__nativeId, int propertyId);

/**
Returns true if this text format is a <tt>BlockFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isBlockFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBlockFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isBlockFormat(long __this__nativeId);

/**
Returns true if this text format is a <tt>CharFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isCharFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCharFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCharFormat(long __this__nativeId);

/**
Returns true if this text format is a <tt>FrameFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isFrameFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFrameFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFrameFormat(long __this__nativeId);

/**
Returns true if this text format is an image format; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isImageFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isImageFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isImageFormat(long __this__nativeId);

/**
Returns true if this text format is a <tt>ListFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isListFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isListFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isListFormat(long __this__nativeId);

/**
Returns true if this text format is a <tt>TableCellFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isTableCellFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTableCellFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTableCellFormat(long __this__nativeId);

/**
Returns true if this text format is a <tt>TableFormat</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isTableFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTableFormat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTableFormat(long __this__nativeId);

/**
Returns true if the format is valid (i. . is not {@link com.trolltech.qt.gui.QTextFormat.FormatType InvalidFormat }); otherwise returns false.
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
Returns the document's layout direction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection layoutDirection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_layoutDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_layoutDirection(long __this__nativeId);

/**
Returns the value of the property given by <tt>propertyId</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLength lengthProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lengthProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLength __qt_lengthProperty_int(long __this__nativeId, int propertyId);

/**
Returns the value of the property given by <tt>propertyId</tt>. If the property isn't of QTextFormat::LengthVector type, an empty length vector is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextLength> lengthVectorProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lengthVectorProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextLength> __qt_lengthVectorProperty_int(long __this__nativeId, int propertyId);

/**
Merges the <tt>other</tt> format with this format; where there are conflicts the <tt>other</tt> format takes precedence.
*/

    @QtBlockedSlot
    public final void merge(com.trolltech.qt.gui.QTextFormat other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_merge_QTextFormat(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native void __qt_merge_QTextFormat(long __this__nativeId, long other);

/**
Returns the index of the format object, or -1 if the format object is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setObjectIndex(int) setObjectIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int objectIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_objectIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_objectIndex(long __this__nativeId);

/**
Returns the text format's object type. See <tt>ObjectTypes</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setObjectType(int) setObjectType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int objectType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_objectType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_objectType(long __this__nativeId);

/**
<brief>Writes thisQTextFormat
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
    private final boolean operator_equal(com.trolltech.qt.gui.QTextFormat rhs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextFormat(nativeId(), rhs == null ? 0 : rhs.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextFormat(long __this__nativeId, long rhs);

/**
<brief>Reads a QTextFormat
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
Returns the value of the property given by <tt>propertyId</tt>; if the property isn't of {@link com.trolltech.qt.QVariant.Type QVariant::Pen } type, {@link com.trolltech.qt.core.Qt.PenStyle Qt::NoPen } is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#stringProperty(int) stringProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPen penProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_penProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPen __qt_penProperty_int(long __this__nativeId, int propertyId);

/**
Returns a map with all properties of this text format.
*/

    @QtBlockedSlot
    public final java.util.SortedMap<java.lang.Integer, java.lang.Object> properties()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_properties(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.Integer, java.lang.Object> __qt_properties(long __this__nativeId);

/**
Returns the property specified by the given <tt>propertyId</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object property(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_property_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_property_int(long __this__nativeId, int propertyId);

/**
Returns the number of properties stored in the format.
*/

    @QtBlockedSlot
    public final int propertyCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_propertyCount(long __this__nativeId);

/**
Sets the brush use to paint the document's background to the <tt>brush</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#background() background()}, {@link com.trolltech.qt.gui.QTextFormat#clearBackground() clearBackground()}, and {@link com.trolltech.qt.gui.QTextFormat#setForeground(com.trolltech.qt.gui.QBrush) setForeground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_QBrush(long __this__nativeId, long brush);

/**
Sets the foreground brush to the specified <tt>brush</tt>. The foreground brush is mostly used to render text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#foreground() foreground()}, {@link com.trolltech.qt.gui.QTextFormat#clearForeground() clearForeground()}, and {@link com.trolltech.qt.gui.QTextFormat#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForeground(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForeground_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setForeground_QBrush(long __this__nativeId, long brush);

/**
Sets the document's layout direction to the specified <tt>direction</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#layoutDirection() layoutDirection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayoutDirection_LayoutDirection(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setLayoutDirection_LayoutDirection(long __this__nativeId, int direction);

/**
Sets the format object's object <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#objectIndex() objectIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setObjectIndex(int object)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setObjectIndex_int(nativeId(), object);
    }
    @QtBlockedSlot
    native void __qt_setObjectIndex_int(long __this__nativeId, int object);

/**
Sets the text format's object <tt>type</tt>. See <tt>ObjectTypes</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#objectType() objectType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setObjectType(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setObjectType_int(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setObjectType_int(long __this__nativeId, int type);

/**
Sets the property specified by the <tt>propertyId</tt> to the given <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#property(int) property()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProperty(int propertyId, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProperty_int_Object(nativeId(), propertyId, value);
    }
    @QtBlockedSlot
    native void __qt_setProperty_int_Object(long __this__nativeId, int propertyId, java.lang.Object value);

/**
Sets the value of the property given by <tt>propertyId</tt> to <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProperty(int propertyId, java.util.List<com.trolltech.qt.gui.QTextLength> lengths)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProperty_int_List(nativeId(), propertyId, lengths);
    }
    @QtBlockedSlot
    native void __qt_setProperty_int_List(long __this__nativeId, int propertyId, java.util.List<com.trolltech.qt.gui.QTextLength> lengths);

/**
Returns the value of the property given by <tt>propertyId</tt>; if the property isn't of {@link com.trolltech.qt.QVariant.Type QVariant::String } type, an empty string is returned instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QTextFormat#boolProperty(int) boolProperty()}, {@link com.trolltech.qt.gui.QTextFormat#intProperty(int) intProperty()}, {@link com.trolltech.qt.gui.QTextFormat#doubleProperty(int) doubleProperty()}, {@link com.trolltech.qt.gui.QTextFormat#colorProperty(int) colorProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthProperty(int) lengthProperty()}, {@link com.trolltech.qt.gui.QTextFormat#lengthVectorProperty(int) lengthVectorProperty()}, and {@link com.trolltech.qt.gui.QTextFormat.Property Property }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String stringProperty(int propertyId)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stringProperty_int(nativeId(), propertyId);
    }
    @QtBlockedSlot
    native java.lang.String __qt_stringProperty_int(long __this__nativeId, int propertyId);

/**
Returns this format as a block format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlockFormat toBlockFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toBlockFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlockFormat __qt_toBlockFormat(long __this__nativeId);

/**
Returns this format as a character format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat toCharFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toCharFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_toCharFormat(long __this__nativeId);

/**
Returns this format as a frame format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrameFormat toFrameFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFrameFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrameFormat __qt_toFrameFormat(long __this__nativeId);

/**
Returns this format as an image format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextImageFormat toImageFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toImageFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextImageFormat __qt_toImageFormat(long __this__nativeId);

/**
Returns this format as a list format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextListFormat toListFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toListFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextListFormat __qt_toListFormat(long __this__nativeId);

/**
Returns this format as a table cell format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableCellFormat toTableCellFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTableCellFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableCellFormat __qt_toTableCellFormat(long __this__nativeId);

/**
Returns this format as a table format.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextTableFormat toTableFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTableFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextTableFormat __qt_toTableFormat(long __this__nativeId);

/**
Returns the type of this format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat.FormatType FormatType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QTextFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextFormat array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextFormat)
        return operator_equal((com.trolltech.qt.gui.QTextFormat) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextFormat __qt_clone(long __this_nativeId);
}
