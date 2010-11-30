package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFont class specifies a font used for drawing text. When you create a QFont object you specify various attributes that you want the font to have. Qt will use the font with the specified attributes, or if no matching font exists, Qt will use the closest matching installed font. The attributes of the font that is actually used are retrievable from a {@link com.trolltech.qt.gui.QFontInfo QFontInfo} object. If the window system provides an exact match {@link com.trolltech.qt.gui.QFont#exactMatch() exactMatch()} returns true. Use {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics} to get measurements, e.g. the pixel length of a string using {@link com.trolltech.qt.gui.QFontMetrics#width(char) QFontMetrics::width()}. <p>Note that a {@link com.trolltech.qt.gui.QApplication QApplication} instance must exist before a QFont can be used. You can set the application's default font with {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}. <p>If a chosen font does not include all the characters that need to be displayed, QFont will try to find the characters in the nearest equivalent fonts. When a {@link com.trolltech.qt.gui.QPainter QPainter} draws a character from a font the QFont will report whether or not it has the character; if it does not, {@link com.trolltech.qt.gui.QPainter QPainter} will draw an unfilled square. <p>Create QFonts like this: <pre class="snippet">
        QFont serifFont = new QFont("Times", 10, QFont.Weight.Bold.value());
        QFont sansFont = new QFont("Helv etica [Cronyx]", 12);
</pre> The attributes set in the constructor can also be set later, e.g. {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, setPointSizeFloat(), {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()} and {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}. The remaining attributes must be set after contstruction, e.g. {@link com.trolltech.qt.gui.QFont#setBold(boolean) setBold()}, {@link com.trolltech.qt.gui.QFont#setUnderline(boolean) setUnderline()}, {@link com.trolltech.qt.gui.QFont#setOverline(boolean) setOverline()}, {@link com.trolltech.qt.gui.QFont#setStrikeOut(boolean) setStrikeOut()} and {@link com.trolltech.qt.gui.QFont#setFixedPitch(boolean) setFixedPitch()}. {@link com.trolltech.qt.gui.QFontInfo QFontInfo} objects should be created after the font's attributes have been set. A {@link com.trolltech.qt.gui.QFontInfo QFontInfo} object will not change, even if you change the font's attributes. The corresponding "get" functions, e.g. {@link com.trolltech.qt.gui.QFont#family() family()}, {@link com.trolltech.qt.gui.QFont#pointSize() pointSize()}, etc., return the values that were set, even though the values used may differ. The actual values are available from a {@link com.trolltech.qt.gui.QFontInfo QFontInfo} object. <p>If the requested font family is unavailable you can influence the font matching algorithm by choosing a particular {@link com.trolltech.qt.gui.QFont.StyleHint QFont::StyleHint } and {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::StyleStrategy } with {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}. The default family (corresponding to the current style hint) is returned by {@link com.trolltech.qt.gui.QFont#defaultFamily() defaultFamily()}. <p>The font-matching algorithm has a {@link com.trolltech.qt.gui.QFont#lastResortFamily() lastResortFamily()} and {@link com.trolltech.qt.gui.QFont#lastResortFont() lastResortFont()} in cases where a suitable match cannot be found. You can provide substitutions for font family names using {@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()} and {@link com.trolltech.qt.gui.QFont#insertSubstitutions(java.lang.String, java.util.List) insertSubstitutions()}. Substitutions can be removed with {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}. Use {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()} to retrieve a family's first substitute, or the family name itself if it has no substitutes. Use {@link com.trolltech.qt.gui.QFont#substitutes(java.lang.String) substitutes()} to retrieve a list of a family's substitutes (which may be empty). <p>Every QFont has a {@link com.trolltech.qt.gui.QFont#key() key()} which you can use, for example, as the key in a cache or dictionary. If you want to store a user's font preferences you could use {@link com.trolltech.qt.core.QSettings QSettings}, writing the font information with {@link com.trolltech.qt.gui.QFont#toString() toString()} and reading it back with {@link com.trolltech.qt.gui.QFont#fromString(java.lang.String) fromString()}. The operator&lt;&lt;() and operator&gt;&gt;() functions are also available, but they work on a data stream. <p>It is possible to set the height of characters shown on the screen to a specified number of pixels with {@link com.trolltech.qt.gui.QFont#setPixelSize(int) setPixelSize()}; however using {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()} has a similar effect and provides device independence. <p>In X11 you can set a font using its system specific name with {@link com.trolltech.qt.gui.QFont#setRawName(java.lang.String) setRawName()}. <p>Loading fonts can be expensive, especially on X11. QFont contains extensive optimizations to make the copying of QFont objects fast, and to cache the results of the slow window system functions it depends upon.<a name="fontmatching"> The font matching algorithm works as follows: <ol><li> The specified font family is searched for.</li><li> If not found, the {@link com.trolltech.qt.gui.QFont#styleHint() styleHint()} is used to select a replacement family.</li><li> Each replacement font family is searched for.</li><li> If none of these are found or there was no {@link com.trolltech.qt.gui.QFont#styleHint() styleHint()}, "helvetica" will be searched for.</li><li> If "helvetica" isn't found Qt will try the {@link com.trolltech.qt.gui.QFont#lastResortFamily() lastResortFamily()}.</li><li> If the {@link com.trolltech.qt.gui.QFont#lastResortFamily() lastResortFamily()} isn't found Qt will try the {@link com.trolltech.qt.gui.QFont#lastResortFont() lastResortFont()} which will always return a name of some kind.</li></ol> Note that the actual font matching algorithm varies from platform to platform. <p>In Windows a request for the "Courier" font is automatically changed to "Courier New", an improved version of Courier that allows for smooth scaling. The older "Courier" bitmap font can be selected by setting the {@link com.trolltech.qt.gui.QFont.StyleStrategy PreferBitmap } style strategy (see {@link com.trolltech.qt.gui.QFont#setStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy) setStyleStrategy()}). <p>Once a font is found, the remaining attributes are matched in order of priority: <ol><li> {@link com.trolltech.qt.gui.QFont#fixedPitch() fixedPitch()}</li><li> {@link com.trolltech.qt.gui.QFont#pointSize() pointSize()} (see below)</li><li> {@link com.trolltech.qt.gui.QFont#weight() weight()}</li><li> {@link com.trolltech.qt.gui.QFont#style() style()}</li></ol> If you have a font which matches on family, even if none of the other attributes match, this font will be chosen in preference to a font which doesn't match on family but which does match on the other attributes. This is because font family is the dominant search criteria. <p>The point size is defined to match if it is within 20% of the requested point size. When several fonts match and are only distinguished by point size, the font with the closest point size to the one requested will be chosen. <p>The actual family, font size, weight and other font attributes used for drawing text will depend on what's available for the chosen family under the window system. A {@link com.trolltech.qt.gui.QFontInfo QFontInfo} object can be used to determine the actual values used for drawing the text. <p>Examples: <pre class="snippet">
        QFont font = new QFont("Helvetica");
</pre> If you had both an Adobe and a Cronyx Helvetica, you might get either. <pre class="snippet">
        QFont font = new QFont("Helvetica [Cronyx]");
</pre> You can specify the foundry you want in the family name. The font f in the above example will be set to "Helvetica [Cronyx]". <p>To determine the attributes of the font actually used in the window system, use a {@link com.trolltech.qt.gui.QFontInfo QFontInfo} object, e.g. <pre class="snippet">
        QFontInfo info = new QFontInfo(font);
        String family = info.family();
</pre> To find out font metrics use a {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics} object, e.g. <pre class="snippet">
        QFontMetrics fm = new QFontMetrics(font);
        int textWidthInPixels = fm.width("How many pixels wide is this text?");
        int textHeightInPixels = fm.height();
</pre> For more general information on fonts, see the comp.fonts FAQ. Information on encodings can be found from Roman Czyborra's page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontComboBox QFontComboBox}, {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}, {@link com.trolltech.qt.gui.QFontInfo QFontInfo}, {@link com.trolltech.qt.gui.QFontDatabase QFontDatabase}, and {@link <a href="../widgets-charactermap.html">Character Map Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFont extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the different styles of glyphs that are used to display text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.Weight Weight }. <br></DD></DT>
*/
/**
The style strategy tells the {@link com.trolltech.qt.gui.QFont font matching} algorithm what type of fonts should be used to find an appropriate default family. <p>The following strategies are available: Any of these may be OR-ed with one of these flags:
*/


    public enum StyleStrategy implements com.trolltech.qt.QtEnumerator {
/**
 the default style strategy. It does not prefer any type of font.
*/

        PreferDefault(1),
/**
 prefers bitmap fonts (as opposed to outline fonts).
*/

        PreferBitmap(2),
/**
 prefers device fonts.
*/

        PreferDevice(4),
/**
 prefers outline fonts (as opposed to bitmap fonts).
*/

        PreferOutline(8),
/**
 forces the use of outline fonts.
*/

        ForceOutline(16),
/**
 prefer an exact match. The font matcher will try to use the exact font size that has been specified.
*/

        PreferMatch(32),
/**
 prefer the best quality font. The font matcher will use the nearest standard point size that the font supports.
*/

        PreferQuality(64),
/**
 antialias if possible.
*/

        PreferAntialias(128),
/**
 don't antialias the fonts.
*/

        NoAntialias(256),
/**
 forces the use of OpenGL compatible fonts.
*/

        OpenGLCompatible(512),
/**
 If a font does not contain a character requested to draw then Qt automatically chooses a similar looking for that contains the character. This flag disables this feature.
*/

        NoFontMerging(32768);

        StyleStrategy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$StyleStrategy constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleStrategy resolve(int value) {
            return (StyleStrategy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return PreferDefault;
            case 2: return PreferBitmap;
            case 4: return PreferDevice;
            case 8: return PreferOutline;
            case 16: return ForceOutline;
            case 32: return PreferMatch;
            case 64: return PreferQuality;
            case 128: return PreferAntialias;
            case 256: return NoAntialias;
            case 512: return OpenGLCompatible;
            case 32768: return NoFontMerging;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum SpacingType implements com.trolltech.qt.QtEnumerator {
/**
 A value of 100 will keep the spacing unchanged; a value of 200 will enlarge the spacing after a character by the width of the character itself.
*/

        PercentageSpacing(0),
/**
 A positive value increases the letter spacing by the corresponding pixels; a negative value decreases the spacing.
*/

        AbsoluteSpacing(1);

        SpacingType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$SpacingType constant with the specified <tt>int</tt>.</brief>
*/

        public static SpacingType resolve(int value) {
            return (SpacingType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PercentageSpacing;
            case 1: return AbsoluteSpacing;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Style hints are used by the {@link com.trolltech.qt.gui.QFont font matching} algorithm to find an appropriate default family if a selected font family is not available.
*/

    public enum StyleHint implements com.trolltech.qt.QtEnumerator {
/**
 is a synonym for <tt>SansSerif</tt>.
*/

        Helvetica(0),
/**
 is a synonym for <tt>Serif</tt>.
*/

        Times(1),
/**
 a synonym for <tt>TypeWriter</tt>.
*/

        Courier(2),
/**
 the font matcher prefers decorative fonts.
*/

        OldEnglish(3),
/**
 the font matcher prefers system fonts.
*/

        System(4),
/**
 leaves the font matching algorithm to choose the family. This is the default.
*/

        AnyStyle(5);

        StyleHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$StyleHint constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleHint resolve(int value) {
            return (StyleHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Helvetica;
            case 1: return Times;
            case 2: return Courier;
            case 3: return OldEnglish;
            case 4: return System;
            case 5: return AnyStyle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Qt uses a weighting scale from 0 to 99 similar to, but not the same as, the scales used in Windows or CSS. A weight of 0 is ultralight, whilst 99 will be an extremely black. <p>This enum contains the predefined font weights:
*/

    public enum Weight implements com.trolltech.qt.QtEnumerator {
/**
 25
*/

        Light(25),
/**
 50
*/

        Normal(50),
/**
 63
*/

        DemiBold(63),
/**
 75
*/

        Bold(75),
/**
 87
*/

        Black(87);

        Weight(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$Weight constant with the specified <tt>int</tt>.</brief>
*/

        public static Weight resolve(int value) {
            return (Weight) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 25: return Light;
            case 50: return Normal;
            case 63: return DemiBold;
            case 75: return Bold;
            case 87: return Black;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Rendering option for text this font applies to.
*/

    public enum Capitalization implements com.trolltech.qt.QtEnumerator {
/**
 This is the normal text rendering option where no capitalization change is applied.
*/

        MixedCase(0),
/**
 This alters the text to be rendered in all uppercase type.
*/

        AllUppercase(1),
/**
 This alters the text to be rendered in all lowercase type.
*/

        AllLowercase(2),
/**
 This alters the text to be rendered in small-caps type.
*/

        SmallCaps(3),
/**
 This alters the text to be rendered with the first character of each word as an uppercase character.
*/

        Capitalize(4);

        Capitalization(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$Capitalization constant with the specified <tt>int</tt>.</brief>
*/

        public static Capitalization resolve(int value) {
            return (Capitalization) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MixedCase;
            case 1: return AllUppercase;
            case 2: return AllLowercase;
            case 3: return SmallCaps;
            case 4: return Capitalize;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Predefined stretch values that follow the CSS naming convention. The higher the value, the more stretched the text is. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStretch(int) setStretch()}, and {@link com.trolltech.qt.gui.QFont#stretch() stretch()}. <br></DD></DT>
*/

    public enum Stretch implements com.trolltech.qt.QtEnumerator {
/**
 50
*/

        UltraCondensed(50),
/**
 62
*/

        ExtraCondensed(62),
/**
 75
*/

        Condensed(75),
/**
 87
*/

        SemiCondensed(87),
/**
 100
*/

        Unstretched(100),
/**
 112
*/

        SemiExpanded(112),
/**
 125
*/

        Expanded(125),
/**
 150
*/

        ExtraExpanded(150),
/**
 200
*/

        UltraExpanded(200);

        Stretch(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFont$Stretch constant with the specified <tt>int</tt>.</brief>
*/

        public static Stretch resolve(int value) {
            return (Stretch) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 50: return UltraCondensed;
            case 62: return ExtraCondensed;
            case 75: return Condensed;
            case 87: return SemiCondensed;
            case 100: return Unstretched;
            case 112: return SemiExpanded;
            case 125: return Expanded;
            case 150: return ExtraExpanded;
            case 200: return UltraExpanded;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Style implements com.trolltech.qt.QtEnumerator {
/**
 Normal glyphs used in unstyled text.
*/

        StyleNormal(0),
/**
 Italic glyphs that are specifically designed for the purpose of representing italicized text.
*/

        StyleItalic(1),
/**
 Glyphs with an italic appearance that are typically based on the unstyled glyphs, but are not fine-tuned for the purpose of representing italicized text.
*/

        StyleOblique(2);

        Style(int value) { this.value = value; }
        public int value() { return value; }

/**
<brief>Returns the QFont$Style constant with the specified <tt>int</tt>.</brief>
*/

        public static Style resolve(int value) {
            return (Style) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StyleNormal;
            case 1: return StyleItalic;
            case 2: return StyleOblique;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a font object that uses the application's default font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}, and {@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}. <br></DD></DT>
*/

    public QFont(){
        super((QPrivateConstructor)null);
        __qt_QFont();

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFont.class, 1, 1000);
    }

    native void __qt_QFont();

/**
Constructs a font that is a copy of <tt>font</tt>.
*/

    public QFont(com.trolltech.qt.gui.QFont arg__1){
        super((QPrivateConstructor)null);
        __qt_QFont_QFont(arg__1 == null ? 0 : arg__1.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFont.class, 1, 1000);
    }

    native void __qt_QFont_QFont(long arg__1);

/**
Constructs a font from <tt>font</tt> for use on the paint device <tt>pd</tt>.
*/

    public QFont(com.trolltech.qt.gui.QFont arg__1, com.trolltech.qt.gui.QPaintDeviceInterface pd){
        super((QPrivateConstructor)null);
        __qt_QFont_QFont_QPaintDevice(arg__1 == null ? 0 : arg__1.nativeId(), pd == null ? 0 : pd.nativeId());

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFont.class, 1, 1000);
    }

    native void __qt_QFont_QFont_QPaintDevice(long arg__1, long pd);


/**
Constructs a font object with the specified <tt>family</tt>, <tt>pointSize</tt>, <tt>weight</tt> and <tt>italic</tt> settings. <p>If <tt>pointSize</tt> is &lt;= 0, it is set to 12. <p>The <tt>family</tt> name may optionally also include a foundry name, e.g. "Helvetica [Cronyx]". If the <tt>family</tt> is available from more than one foundry and the foundry isn't specified, an arbitrary foundry is chosen. If the family isn't available a family will be set using the font matching algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.Weight Weight }, {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}, {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}. <br></DD></DT>
*/

    public QFont(java.lang.String family, int pointSize, int weight) {
        this(family, pointSize, weight, (boolean)false);
    }

/**
Constructs a font object with the specified <tt>family</tt>, <tt>pointSize</tt>, <tt>weight</tt> and <tt>italic</tt> settings. <p>If <tt>pointSize</tt> is &lt;= 0, it is set to 12. <p>The <tt>family</tt> name may optionally also include a foundry name, e.g. "Helvetica [Cronyx]". If the <tt>family</tt> is available from more than one foundry and the foundry isn't specified, an arbitrary foundry is chosen. If the family isn't available a family will be set using the font matching algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.Weight Weight }, {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}, {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}. <br></DD></DT>
*/

    public QFont(java.lang.String family, int pointSize) {
        this(family, pointSize, (int)-1, (boolean)false);
    }

/**
Constructs a font object with the specified <tt>family</tt>, <tt>pointSize</tt>, <tt>weight</tt> and <tt>italic</tt> settings. <p>If <tt>pointSize</tt> is &lt;= 0, it is set to 12. <p>The <tt>family</tt> name may optionally also include a foundry name, e.g. "Helvetica [Cronyx]". If the <tt>family</tt> is available from more than one foundry and the foundry isn't specified, an arbitrary foundry is chosen. If the family isn't available a family will be set using the font matching algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.Weight Weight }, {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}, {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}. <br></DD></DT>
*/

    public QFont(java.lang.String family) {
        this(family, (int)-1, (int)-1, (boolean)false);
    }
/**
Constructs a font object with the specified <tt>family</tt>, <tt>pointSize</tt>, <tt>weight</tt> and <tt>italic</tt> settings. <p>If <tt>pointSize</tt> is &lt;= 0, it is set to 12. <p>The <tt>family</tt> name may optionally also include a foundry name, e.g. "Helvetica [Cronyx]". If the <tt>family</tt> is available from more than one foundry and the foundry isn't specified, an arbitrary foundry is chosen. If the family isn't available a family will be set using the font matching algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.Weight Weight }, {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}, {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}. <br></DD></DT>
*/

    public QFont(java.lang.String family, int pointSize, int weight, boolean italic){
        super((QPrivateConstructor)null);
        __qt_QFont_String_int_int_boolean(family, pointSize, weight, italic);

        com.trolltech.qt.GeneratorUtilities.countExpense(com.trolltech.qt.gui.QFont.class, 1, 1000);
    }

    native void __qt_QFont_String_int_int_boolean(java.lang.String family, int pointSize, int weight, boolean italic);

/**
Returns true if {@link com.trolltech.qt.gui.QFont#weight() weight()} is a value greater than {@link com.trolltech.qt.gui.QFont.Weight QFont::Normal }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#weight() weight()}, {@link com.trolltech.qt.gui.QFont#setBold(boolean) setBold()}, and {@link com.trolltech.qt.gui.QFontInfo#bold() QFontInfo::bold()}. <br></DD></DT>
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
Returns the current capitalization type of the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setCapitalization(com.trolltech.qt.gui.QFont.Capitalization) setCapitalization()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.Capitalization capitalization()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.Capitalization.resolve(__qt_capitalization(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_capitalization(long __this__nativeId);

/**
Returns the family name that corresponds to the current style hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.StyleHint StyleHint }, {@link com.trolltech.qt.gui.QFont#styleHint() styleHint()}, and {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String defaultFamily()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultFamily(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_defaultFamily(long __this__nativeId);

/**
Returns true if a window system font exactly matching the settings of this font is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
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
Returns the requested font family name, i. . the name set in the constructor or the last setFont() call. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#substitutes(java.lang.String) substitutes()}, and {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}. <br></DD></DT>
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
Returns true if fixed pitch has been set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setFixedPitch(boolean) setFixedPitch()}, and {@link com.trolltech.qt.gui.QFontInfo#fixedPitch() QFontInfo::fixedPitch()}. <br></DD></DT>
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
Sets this font to match the description <tt>descrip</tt>. The description is a comma-separated list of the font attributes, as returned by {@link com.trolltech.qt.gui.QFont#toString() toString()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#toString() toString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fromString(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromString_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native boolean __qt_fromString_String(long __this__nativeId, java.lang.String arg__1);

/**
Returns the window system handle to the font, for low-level access. Using this function is not portable.
*/

    @QtBlockedSlot
    public final long handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native long __qt_handle(long __this__nativeId);

/**
Returns true if this font and <tt>f</tt> are copies of each other, i.e. one of them was created as a copy of the other and neither has been modified since. This is much stricter than equality. <p><DT><b>See also:</b><br><DD>operator=(), and operator==(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCopyOf(com.trolltech.qt.gui.QFont arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCopyOf_QFont(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCopyOf_QFont(long __this__nativeId, long arg__1);

/**
Returns true if the {@link com.trolltech.qt.gui.QFont#style() style()} of the font is not {@link com.trolltech.qt.gui.QFont.Style QFont::StyleNormal } <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}, and {@link com.trolltech.qt.gui.QFont#style() style()}. <br></DD></DT>
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
Returns true if kerning should be used when drawing text with this font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setKerning(boolean) setKerning()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean kerning()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_kerning(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_kerning(long __this__nativeId);

/**
Returns the font's key, a textual representation of a font. It is typically used as the key for a cache or dictionary of fonts. <p><DT><b>See also:</b><br><DD>QMap. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String key()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_key(long __this__nativeId);

/**
Returns the "last resort" font family name. <p>The current implementation tries a wide variety of common fonts, returning the first one it finds. Is is possible that no family is found in which case an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#lastResortFont() lastResortFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String lastResortFamily()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastResortFamily(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_lastResortFamily(long __this__nativeId);

/**
Returns a "last resort" font name for the font matching algorithm. This is used if the last resort family is not available. It will always return a name, if necessary returning something like "fixed" or "system". <p>The current implementation tries a wide variety of common fonts, returning the first one it finds. The implementation may change at any time, but this function will always return a string containing something. <p>It is theoretically possible that there really isn't a {@link com.trolltech.qt.gui.QFont#lastResortFont() lastResortFont()} in which case Qt will abort with an error message. We have not been able to identify a case where this happens. Please {@link <a href="../qtjambi-bughowto.html">report it as a bug</a>} if it does, preferably with a list of the fonts you have installed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#lastResortFamily() lastResortFamily()}, and {@link com.trolltech.qt.gui.QFont#rawName() rawName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String lastResortFont()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastResortFont(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_lastResortFont(long __this__nativeId);

/**
Returns the letter spacing for the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setLetterSpacing(com.trolltech.qt.gui.QFont.SpacingType, double) setLetterSpacing()}, {@link com.trolltech.qt.gui.QFont#letterSpacingType() letterSpacingType()}, and {@link com.trolltech.qt.gui.QFont#setWordSpacing(double) setWordSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double letterSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_letterSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_letterSpacing(long __this__nativeId);

/**
Returns the spacing type used for letter spacing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#letterSpacing() letterSpacing()}, {@link com.trolltech.qt.gui.QFont#setLetterSpacing(com.trolltech.qt.gui.QFont.SpacingType, double) setLetterSpacing()}, and {@link com.trolltech.qt.gui.QFont#setWordSpacing(double) setWordSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.SpacingType letterSpacingType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.SpacingType.resolve(__qt_letterSpacingType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_letterSpacingType(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.gui.QFont arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QFont(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QFont(long __this__nativeId, long arg__1);

/**
<brief>Writes thisQFont
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
    private final boolean operator_equal(com.trolltech.qt.gui.QFont arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QFont(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QFont(long __this__nativeId, long arg__1);

/**
<brief>Reads a QFont
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
Returns true if overline has been set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setOverline(boolean) setOverline()}. <br></DD></DT>
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
Returns the pixel size of the font if it was set with {@link com.trolltech.qt.gui.QFont#setPixelSize(int) setPixelSize()}. Returns -1 if the size was set with {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()} or {@link com.trolltech.qt.gui.QFont#setPointSizeF(double) setPointSizeF()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setPixelSize(int) setPixelSize()}, {@link com.trolltech.qt.gui.QFont#pointSize() pointSize()}, {@link com.trolltech.qt.gui.QFontInfo#pointSize() QFontInfo::pointSize()}, and {@link com.trolltech.qt.gui.QFontInfo#pixelSize() QFontInfo::pixelSize()}. <br></DD></DT>
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
Returns the point size of the font. Returns -1 if the font size was specified in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, and {@link com.trolltech.qt.gui.QFont#pointSizeF() pointSizeF()}. <br></DD></DT>
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
Returns the point size of the font. Returns -1 if the font size was specified in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pointSize() pointSize()}, {@link com.trolltech.qt.gui.QFont#setPointSizeF(double) setPointSizeF()}, {@link com.trolltech.qt.gui.QFont#pixelSize() pixelSize()}, {@link com.trolltech.qt.gui.QFontInfo#pointSize() QFontInfo::pointSize()}, and {@link com.trolltech.qt.gui.QFontInfo#pixelSize() QFontInfo::pixelSize()}. <br></DD></DT>
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
Returns true if raw mode is used for font name matching; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setRawMode(boolean) setRawMode()}, and {@link com.trolltech.qt.gui.QFont#rawName() rawName()}. <br></DD></DT>
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
Returns the name of the font within the underlying window system. <p>Only on X11 when Qt was built without FontConfig support the XLFD (X Logical Font Description) is returned; otherwise an empty string. <p>Using the return value of this function is usually notportable. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setRawName(java.lang.String) setRawName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String rawName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_rawName(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int resolve()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolve(nativeId());
    }
    @QtBlockedSlot
    native int __qt_resolve(long __this__nativeId);

/**
Returns a new QFont that has attributes copied from <tt>other</tt> that have not been previously set on this font.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont resolve(com.trolltech.qt.gui.QFont arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolve_QFont(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_resolve_QFont(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void resolve(int mask)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resolve_int(nativeId(), mask);
    }
    @QtBlockedSlot
    native void __qt_resolve_int(long __this__nativeId, int mask);

/**
If <tt>enable</tt> is true sets the font's weight to {@link com.trolltech.qt.gui.QFont.Weight QFont::Bold }; otherwise sets the weight to {@link com.trolltech.qt.gui.QFont.Weight QFont::Normal }. <p>For finer boldness control use {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#bold() bold()}, and {@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBold(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBold_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setBold_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the capitalization of the text in this font to <tt>caps</tt>. <p>A font's capitalization makes the text appear in the selected capitalization mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#capitalization() capitalization()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCapitalization(com.trolltech.qt.gui.QFont.Capitalization arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCapitalization_Capitalization(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setCapitalization_Capitalization(long __this__nativeId, int arg__1);

/**
Sets the family name of the font. The name is case insensitive and may include a foundry name. <p>The <tt>family</tt> name may optionally also include a foundry name, e.g. "Helvetica [Cronyx]". If the <tt>family</tt> is available from more than one foundry and the foundry isn't specified, an arbitrary foundry is chosen. If the family isn't available a family will be set using the font matching algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#family() family()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFamily(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFamily_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFamily_String(long __this__nativeId, java.lang.String arg__1);

/**
If <tt>enable</tt> is true, sets fixed pitch on; otherwise sets fixed pitch off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#fixedPitch() fixedPitch()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFixedPitch(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFixedPitch_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFixedPitch_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the {@link com.trolltech.qt.gui.QFont#style() style()} of the font to {@link com.trolltech.qt.gui.QFont.Style QFont::StyleItalic } if <tt>enable</tt> is true; otherwise the style is set to {@link com.trolltech.qt.gui.QFont.Style QFont::StyleNormal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#italic() italic()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItalic(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItalic_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setItalic_boolean(long __this__nativeId, boolean b);

/**
Enables kerning for this font if <tt>enable</tt> is true; otherwise disables it. By default, kerning is enabled. <p>When kerning is enabled, glyph metrics do not add up anymore, even for Latin text. In other words, the assumption that width('a') + width('b') is equal to width("ab") is not neccesairly true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#kerning() kerning()}, and {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setKerning(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKerning_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setKerning_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the letter spacing for the font to <tt>spacing</tt> and the type of spacing to <tt>type</tt>. <p>Letter spacing changes the default spacing between individual letters in the font. The spacing between the letters can be made smaller as well as larger. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#letterSpacing() letterSpacing()}, {@link com.trolltech.qt.gui.QFont#letterSpacingType() letterSpacingType()}, and {@link com.trolltech.qt.gui.QFont#setWordSpacing(double) setWordSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLetterSpacing(com.trolltech.qt.gui.QFont.SpacingType type, double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLetterSpacing_SpacingType_double(nativeId(), type.value(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setLetterSpacing_SpacingType_double(long __this__nativeId, int type, double spacing);

/**
If <tt>enable</tt> is true, sets overline on; otherwise sets overline off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#overline() overline()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOverline(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOverline_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setOverline_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the font size to <tt>pixelSize</tt> pixels. <p>Using this function makes the font device dependent. Use {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()} or {@link com.trolltech.qt.gui.QFont#setPointSizeF(double) setPointSizeF()} to set the size of the font in a device independent manner. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pixelSize() pixelSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixelSize(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixelSize_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPixelSize_int(long __this__nativeId, int arg__1);

/**
Sets the point size to <tt>pointSize</tt>. The point size must be greater than zero. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pointSize() pointSize()}, and {@link com.trolltech.qt.gui.QFont#setPointSizeF(double) setPointSizeF()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPointSize(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPointSize_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPointSize_int(long __this__nativeId, int arg__1);

/**
Sets the point size to <tt>pointSize</tt>. The point size must be greater than zero. The requested precision may not be achieved on all platforms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#pointSizeF() pointSizeF()}, {@link com.trolltech.qt.gui.QFont#setPointSize(int) setPointSize()}, and {@link com.trolltech.qt.gui.QFont#setPixelSize(int) setPixelSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPointSizeF(double arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPointSizeF_double(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPointSizeF_double(long __this__nativeId, double arg__1);

/**
If <tt>enable</tt> is true, turns raw mode on; otherwise turns raw mode off. This function only has an effect under X11. <p>If raw mode is enabled, Qt will search for an X font with a complete font name matching the family name, ignoring all other values set for the QFont. If the font name matches several fonts, Qt will use the first font returned by X. {@link com.trolltech.qt.gui.QFontInfo QFontInfo}cannot be used to fetch information about a QFont using raw mode (it will return the values set in the QFont for all parameters, including the family name). <p><b>Warning:</b> Do not use raw mode unless you really, really need it! In most (if not all) cases, {@link com.trolltech.qt.gui.QFont#setRawName(java.lang.String) setRawName()} is a much better choice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#rawMode() rawMode()}, and {@link com.trolltech.qt.gui.QFont#setRawName(java.lang.String) setRawName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRawMode(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRawMode_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setRawMode_boolean(long __this__nativeId, boolean arg__1);

/**
Sets a font by its system specific name. The function is particularly useful under X, where system font settings (for example X resources) are usually available in XLFD (X Logical Font Description) form only. You can pass an XLFD as <tt>name</tt> to this function. <p>A font set with {@link com.trolltech.qt.gui.QFont#setRawName(java.lang.String) setRawName()} is still a full-featured QFont. It can be queried (for example with {@link com.trolltech.qt.gui.QFont#italic() italic()}) or modified (for example with {@link com.trolltech.qt.gui.QFont#setItalic(boolean) setItalic()}) and is therefore also suitable for rendering rich text. <p>If Qt's internal font database cannot resolve the raw name, the font becomes a raw font with <tt>name</tt> as its family. <p>Note that the present implementation does not handle wildcards in XLFDs well, and that font aliases (file <tt>fonts.alias</tt> in the font directory on X11) are not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#rawName() rawName()}, {@link com.trolltech.qt.gui.QFont#setRawMode(boolean) setRawMode()}, and {@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRawName(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRawName_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setRawName_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the stretch factor for the font. <p>The stretch factor changes the width of all characters in the font by <tt>factor</tt> percent. For example, setting <tt>factor</tt> to 150 results in all characters in the font being 1.5 times (ie. 150%) wider. The default stretch factor is 100. The minimum stretch factor is 1, and the maximum stretch factor is 4000. <p>The stretch factor is only applied to outline fonts. The stretch factor is ignored for bitmap fonts. <p>NOTE: QFont cannot stretch XLFD fonts. When loading XLFD fonts on X11, the stretch factor is matched against a predefined set of values for the SETWIDTH_NAME field of the XLFD. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#stretch() stretch()}, and {@link com.trolltech.qt.gui.QFont.Stretch QFont::Stretch }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStretch(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStretch_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStretch_int(long __this__nativeId, int arg__1);

/**
If <tt>enable</tt> is true, sets strikeout on; otherwise sets strikeout off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#strikeOut() strikeOut()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStrikeOut(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStrikeOut_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStrikeOut_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the style of the font to <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#style() style()}, {@link com.trolltech.qt.gui.QFont#italic() italic()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.gui.QFont.Style style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyle_Style(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setStyle_Style(long __this__nativeId, int style);


/**
Sets the style hint and strategy to <tt>hint</tt> and <tt>strategy</tt>, respectively. <p>If these aren't set explicitly the style hint will default to <tt>AnyStyle</tt> and the style strategy to <tt>PreferDefault</tt>. <p>Qt does not support style hints on X11 since this information is not provided by the window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.StyleHint StyleHint }, {@link com.trolltech.qt.gui.QFont#styleHint() styleHint()}, {@link com.trolltech.qt.gui.QFont.StyleStrategy StyleStrategy }, {@link com.trolltech.qt.gui.QFont#styleStrategy() styleStrategy()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyleHint(com.trolltech.qt.gui.QFont.StyleHint arg__1) {
        setStyleHint(arg__1, com.trolltech.qt.gui.QFont.StyleStrategy.PreferDefault);
    }
/**
Sets the style hint and strategy to <tt>hint</tt> and <tt>strategy</tt>, respectively. <p>If these aren't set explicitly the style hint will default to <tt>AnyStyle</tt> and the style strategy to <tt>PreferDefault</tt>. <p>Qt does not support style hints on X11 since this information is not provided by the window system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont.StyleHint StyleHint }, {@link com.trolltech.qt.gui.QFont#styleHint() styleHint()}, {@link com.trolltech.qt.gui.QFont.StyleStrategy StyleStrategy }, {@link com.trolltech.qt.gui.QFont#styleStrategy() styleStrategy()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyleHint(com.trolltech.qt.gui.QFont.StyleHint arg__1, com.trolltech.qt.gui.QFont.StyleStrategy arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyleHint_StyleHint_StyleStrategy(nativeId(), arg__1.value(), arg__2.value());
    }
    @QtBlockedSlot
    native void __qt_setStyleHint_StyleHint_StyleStrategy(long __this__nativeId, int arg__1, int arg__2);

/**
Sets the style strategy for the font to <tt>s</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#styleStrategy() styleStrategy()}, and {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::StyleStrategy }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyleStrategy_StyleStrategy(nativeId(), s.value());
    }
    @QtBlockedSlot
    native void __qt_setStyleStrategy_StyleStrategy(long __this__nativeId, int s);

/**
If <tt>enable</tt> is true, sets underline on; otherwise sets underline off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#underline() underline()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUnderline(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUnderline_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setUnderline_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the weight the font to <tt>weight</tt>, which should be a value from the {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight } enumeration. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#weight() weight()}, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWeight(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWeight_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setWeight_int(long __this__nativeId, int arg__1);

/**
Sets the word spacing for the font to <tt>spacing</tt>. <p>Word spacing changes the default spacing between individual words. A positive value increases the word spacing by a corresponding amount of pixels, while a negative value decreases the inter-word spacing accordingly. <p>Word spacing will not apply to writing systems, where indiviaul words are not separated by white space. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#wordSpacing() wordSpacing()}, and {@link com.trolltech.qt.gui.QFont#setLetterSpacing(com.trolltech.qt.gui.QFont.SpacingType, double) setLetterSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWordSpacing(double spacing)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWordSpacing_double(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setWordSpacing_double(long __this__nativeId, double spacing);

/**
Returns the stretch factor for the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStretch(int) setStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int stretch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_stretch(nativeId());
    }
    @QtBlockedSlot
    native int __qt_stretch(long __this__nativeId);

/**
Returns true if strikeout has been set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStrikeOut(boolean) setStrikeOut()}. <br></DD></DT>
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
Returns the style of the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStyle(com.trolltech.qt.gui.QFont.Style) setStyle()}. <br></DD></DT>
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
Returns the {@link com.trolltech.qt.gui.QFont.StyleHint StyleHint }. <p>The style hint affects the font matching algorithm. See {@link com.trolltech.qt.gui.QFont.StyleHint QFont::StyleHint } for the list of available hints. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::StyleStrategy }, and {@link com.trolltech.qt.gui.QFontInfo#styleHint() QFontInfo::styleHint()}. <br></DD></DT>
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
Returns the {@link com.trolltech.qt.gui.QFont.StyleStrategy StyleStrategy }. <p>The style strategy affects the font matching algorithm. See {@link com.trolltech.qt.gui.QFont.StyleStrategy QFont::StyleStrategy } for the list of available strategies. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setStyleStrategy(com.trolltech.qt.gui.QFont.StyleStrategy) setStyleStrategy()}, {@link com.trolltech.qt.gui.QFont#setStyleHint(com.trolltech.qt.gui.QFont.StyleHint) setStyleHint()}, and {@link com.trolltech.qt.gui.QFont.StyleHint QFont::StyleHint }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont.StyleStrategy styleStrategy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFont.StyleStrategy.resolve(__qt_styleStrategy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_styleStrategy(long __this__nativeId);

/**
<brief>Returns a string representation of the <tt>this QFont</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString(long __this__nativeId);

/**
Returns true if underline has been set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setUnderline(boolean) setUnderline()}. <br></DD></DT>
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
Returns the weight of the font which is one of the enumerated values from {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setWeight(int) setWeight()}, {@link com.trolltech.qt.gui.QFont.Weight Weight }, and {@link com.trolltech.qt.gui.QFontInfo QFontInfo}. <br></DD></DT>
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
Returns the word spacing for the font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setWordSpacing(double) setWordSpacing()}, and {@link com.trolltech.qt.gui.QFont#setLetterSpacing(com.trolltech.qt.gui.QFont.SpacingType, double) setLetterSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double wordSpacing()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wordSpacing(nativeId());
    }
    @QtBlockedSlot
    native double __qt_wordSpacing(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static void cacheStatistics();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static void cleanup();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static void initialize();

/**
Inserts <tt>substituteName</tt> into the substitution table for the family <tt>familyName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#insertSubstitutions(java.lang.String, java.util.List) insertSubstitutions()}, {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}, {@link com.trolltech.qt.gui.QFont#substitutions() substitutions()}, {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}, and {@link com.trolltech.qt.gui.QFont#substitutes(java.lang.String) substitutes()}. <br></DD></DT>
*/

    public native static void insertSubstitution(java.lang.String arg__1, java.lang.String arg__2);

/**
Inserts the list of families <tt>substituteNames</tt> into the substitution list for <tt>familyName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()}, {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}, {@link com.trolltech.qt.gui.QFont#substitutions() substitutions()}, and {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}. <br></DD></DT>
*/

    public native static void insertSubstitutions(java.lang.String arg__1, java.util.List<java.lang.String> arg__2);

/**
Removes all the substitutions for <tt>familyName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#insertSubstitutions(java.lang.String, java.util.List) insertSubstitutions()}, {@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()}, {@link com.trolltech.qt.gui.QFont#substitutions() substitutions()}, and {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}. <br></DD></DT>
*/

    public native static void removeSubstitution(java.lang.String arg__1);

/**
Returns the first family name to be used whenever <tt>familyName</tt> is specified. The lookup is case insensitive. <p>If there is no substitution for <tt>familyName</tt>, <tt>familyName</tt> is returned. <p>To obtain a list of substitutions use {@link com.trolltech.qt.gui.QFont#substitutes(java.lang.String) substitutes()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#setFamily(java.lang.String) setFamily()}, {@link com.trolltech.qt.gui.QFont#insertSubstitutions(java.lang.String, java.util.List) insertSubstitutions()}, {@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()}, and {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}. <br></DD></DT>
*/

    public native static java.lang.String substitute(java.lang.String arg__1);

/**
Returns a list of family names to be used whenever <tt>familyName</tt> is specified. The lookup is case insensitive. <p>If there is no substitution for <tt>familyName</tt>, an empty list is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}, {@link com.trolltech.qt.gui.QFont#insertSubstitutions(java.lang.String, java.util.List) insertSubstitutions()}, {@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()}, and {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> substitutes(java.lang.String arg__1);

/**
Returns a sorted list of substituted family names. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont#insertSubstitution(java.lang.String, java.lang.String) insertSubstitution()}, {@link com.trolltech.qt.gui.QFont#removeSubstitution(java.lang.String) removeSubstitution()}, and {@link com.trolltech.qt.gui.QFont#substitute(java.lang.String) substitute()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> substitutions();

/**
@exclude
*/

    public static native QFont fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFont(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFont array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QFont)
        return operator_equal((com.trolltech.qt.gui.QFont) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.gui.QFont) {
            if (operator_less((com.trolltech.qt.gui.QFont) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFont clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFont __qt_clone(long __this_nativeId);
}
