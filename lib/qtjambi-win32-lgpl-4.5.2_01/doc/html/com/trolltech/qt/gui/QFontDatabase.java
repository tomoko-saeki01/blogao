package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFontDatabase class provides information about the fonts available in the underlying window system. The most common uses of this class are to query the database for the list of font {@link com.trolltech.qt.gui.QFontDatabase#families() families()} and for the {@link com.trolltech.qt.gui.QFontDatabase#pointSizes(java.lang.String) pointSizes()} and {@link com.trolltech.qt.gui.QFontDatabase#styles(java.lang.String) styles()} that are available for each family. An alternative to {@link com.trolltech.qt.gui.QFontDatabase#pointSizes(java.lang.String) pointSizes()} is {@link com.trolltech.qt.gui.QFontDatabase#smoothSizes(java.lang.String, java.lang.String) smoothSizes()} which returns the sizes at which a given family and style will look attractive. <p>If the font family is available from two or more foundries the foundry name is included in the family name, e.g. "Helvetica [Adobe]" and "Helvetica [Cronyx]". When you specify a family you can either use the old hyphenated Qt 2.x "foundry-family" format, e.g. "Cronyx-Helvetica", or the new bracketed Qt 3.x "family [foundry]" format e.g. "Helvetica [Cronyx]". If the family has a foundry it is always returned, e.g. by {@link com.trolltech.qt.gui.QFontDatabase#families() families()}, using the bracketed format. <p>The {@link com.trolltech.qt.gui.QFontDatabase#font(java.lang.String, java.lang.String, int) font()} function returns a {@link com.trolltech.qt.gui.QFont QFont} given a family, style and point size. <p>A family and style combination can be checked to see if it is {@link com.trolltech.qt.gui.QFontDatabase#italic(java.lang.String, java.lang.String) italic()} or {@link com.trolltech.qt.gui.QFontDatabase#bold(java.lang.String, java.lang.String) bold()}, and to retrieve its {@link com.trolltech.qt.gui.QFontDatabase#weight(java.lang.String, java.lang.String) weight()}. Similarly we can call {@link com.trolltech.qt.gui.QFontDatabase#isBitmapScalable(java.lang.String) isBitmapScalable()}, {@link com.trolltech.qt.gui.QFontDatabase#isSmoothlyScalable(java.lang.String) isSmoothlyScalable()}, {@link com.trolltech.qt.gui.QFontDatabase#isScalable(java.lang.String) isScalable()} and {@link com.trolltech.qt.gui.QFontDatabase#isFixedPitch(java.lang.String) isFixedPitch()}. <p>Use the {@link com.trolltech.qt.gui.QFontDatabase#styleString(com.trolltech.qt.gui.QFont) styleString()} to obtain a text version of a style. <p>The QFontDatabase class also supports some static functions, for example, {@link com.trolltech.qt.gui.QFontDatabase#standardSizes() standardSizes()}. You can retrieve the description of a writing system using {@link com.trolltech.qt.gui.QFontDatabase#writingSystemName(com.trolltech.qt.gui.QFontDatabase.WritingSystem) writingSystemName()}, and a sample of characters in a writing system with {@link com.trolltech.qt.gui.QFontDatabase#writingSystemSample(com.trolltech.qt.gui.QFontDatabase.WritingSystem) writingSystemSample()}. <p>Example: <pre class="snippet">
        QFontDatabase database = new QFontDatabase();
        QTreeWidget fontTree = new QTreeWidget();
        fontTree.setColumnCount(2);
        List&lt;String&gt; headers = new Vector&lt;String&gt;();
        headers.add("Font");
        headers.add("Smooth Sizes");

        fontTree.setHeaderLabels(headers);

        for (String family : database.families()) {
            QTreeWidgetItem familyItem = new QTreeWidgetItem(fontTree);
            familyItem.setText(0, family);

            for (String style : database.styles(family)) {
                QTreeWidgetItem styleItem = new QTreeWidgetItem(familyItem);
                styleItem.setText(0, style);

                String sizes = "";
                for (int points : database.smoothSizes(family, style))
                    sizes += String.valueOf(points) + " ";

                styleItem.setText(1, sizes.trim());
            }
    
        }
    </pre> This example gets the list of font families, the list of styles for each family, and the point sizes that are available for each combination of family and style, displaying this information in a tree view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QFontInfo QFontInfo}, {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}, {@link com.trolltech.qt.gui.QFontComboBox QFontComboBox}, and {@link <a href="../widgets-charactermap.html">Character Map Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFontDatabase extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum WritingSystem implements com.trolltech.qt.QtEnumerator {
/**

*/

        Any(0),
/**

*/

        Latin(1),
/**

*/

        Greek(2),
/**

*/

        Cyrillic(3),
/**

*/

        Armenian(4),
/**

*/

        Hebrew(5),
/**

*/

        Arabic(6),
/**

*/

        Syriac(7),
/**

*/

        Thaana(8),
/**

*/

        Devanagari(9),
/**

*/

        Bengali(10),
/**

*/

        Gurmukhi(11),
/**

*/

        Gujarati(12),
/**

*/

        Oriya(13),
/**

*/

        Tamil(14),
/**

*/

        Telugu(15),
/**

*/

        Kannada(16),
/**

*/

        Malayalam(17),
/**

*/

        Sinhala(18),
/**

*/

        Thai(19),
/**

*/

        Lao(20),
/**

*/

        Tibetan(21),
/**

*/

        Myanmar(22),
/**

*/

        Georgian(23),
/**

*/

        Khmer(24),
/**

*/

        SimplifiedChinese(25),
/**

*/

        TraditionalChinese(26),
/**

*/

        Japanese(27),
/**

*/

        Korean(28),
/**

*/

        Vietnamese(29),
/**

*/

        Symbol(30),
/**

*/

        Ogham(31),
/**

*/

        Runic(32),
        WritingSystemsCount(33);

        WritingSystem(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFontDatabase$WritingSystem constant with the specified <tt>int</tt>.</brief>
*/

        public static WritingSystem resolve(int value) {
            return (WritingSystem) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Any;
            case 1: return Latin;
            case 2: return Greek;
            case 3: return Cyrillic;
            case 4: return Armenian;
            case 5: return Hebrew;
            case 6: return Arabic;
            case 7: return Syriac;
            case 8: return Thaana;
            case 9: return Devanagari;
            case 10: return Bengali;
            case 11: return Gurmukhi;
            case 12: return Gujarati;
            case 13: return Oriya;
            case 14: return Tamil;
            case 15: return Telugu;
            case 16: return Kannada;
            case 17: return Malayalam;
            case 18: return Sinhala;
            case 19: return Thai;
            case 20: return Lao;
            case 21: return Tibetan;
            case 22: return Myanmar;
            case 23: return Georgian;
            case 24: return Khmer;
            case 25: return SimplifiedChinese;
            case 26: return TraditionalChinese;
            case 27: return Japanese;
            case 28: return Korean;
            case 29: return Vietnamese;
            case 30: return Symbol;
            case 31: return Ogham;
            case 32: return Runic;
            case 33: return WritingSystemsCount;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a font database object.
*/

    public QFontDatabase(){
        super((QPrivateConstructor)null);
        __qt_QFontDatabase();
    }

    native void __qt_QFontDatabase();

/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is bold; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#italic(java.lang.String, java.lang.String) italic()}, and {@link com.trolltech.qt.gui.QFontDatabase#weight(java.lang.String, java.lang.String) weight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean bold(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bold_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_bold_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);


/**
Returns a sorted list of the available font families.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> families() {
        return families(com.trolltech.qt.gui.QFontDatabase.WritingSystem.Any);
    }
/**
Returns a sorted list of the available font families which support the <tt>writingSystem</tt>. <p>If a family exists in several foundries, the returned name for that font is in the form "family [foundry]". Examples: "Times [Adobe]", "Times [Cronyx]", "Palatino". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#writingSystems() writingSystems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> families(com.trolltech.qt.gui.QFontDatabase.WritingSystem writingSystem)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_families_WritingSystem(nativeId(), writingSystem.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_families_WritingSystem(long __this__nativeId, int writingSystem);

/**
Returns a {@link com.trolltech.qt.gui.QFont QFont} object that has family <tt>family</tt>, style <tt>style</tt> and point size <tt>pointSize</tt>. If no matching font could be created, a {@link com.trolltech.qt.gui.QFont QFont} object that uses the application's default font is returned.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font(java.lang.String family, java.lang.String style, int pointSize)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font_String_String_int(nativeId(), family, style, pointSize);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font_String_String_int(long __this__nativeId, java.lang.String family, java.lang.String style, int pointSize);


/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is a scalable bitmap font; otherwise returns false. Scaling a bitmap font usually produces an unattractive hardly readable result, because the pixels of the font are scaled. If you need to scale a bitmap font it is better to scale it to one of the fixed sizes returned by {@link com.trolltech.qt.gui.QFontDatabase#smoothSizes(java.lang.String, java.lang.String) smoothSizes()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isScalable(java.lang.String) isScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isSmoothlyScalable(java.lang.String) isSmoothlyScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isBitmapScalable(java.lang.String family) {
        return isBitmapScalable(family, (java.lang.String)null);
    }
/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is a scalable bitmap font; otherwise returns false. Scaling a bitmap font usually produces an unattractive hardly readable result, because the pixels of the font are scaled. If you need to scale a bitmap font it is better to scale it to one of the fixed sizes returned by {@link com.trolltech.qt.gui.QFontDatabase#smoothSizes(java.lang.String, java.lang.String) smoothSizes()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isScalable(java.lang.String) isScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isSmoothlyScalable(java.lang.String) isSmoothlyScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isBitmapScalable(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBitmapScalable_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_isBitmapScalable_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);


/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is fixed pitch; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isFixedPitch(java.lang.String family) {
        return isFixedPitch(family, (java.lang.String)null);
    }
/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is fixed pitch; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isFixedPitch(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFixedPitch_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_isFixedPitch_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);


/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is scalable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isBitmapScalable(java.lang.String) isBitmapScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isSmoothlyScalable(java.lang.String) isSmoothlyScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isScalable(java.lang.String family) {
        return isScalable(family, (java.lang.String)null);
    }
/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is scalable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isBitmapScalable(java.lang.String) isBitmapScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isSmoothlyScalable(java.lang.String) isSmoothlyScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isScalable(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isScalable_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_isScalable_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);


/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is smoothly scalable; otherwise returns false. If this function returns true, it's safe to scale this font to any size, and the result will always look attractive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isScalable(java.lang.String) isScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isBitmapScalable(java.lang.String) isBitmapScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSmoothlyScalable(java.lang.String family) {
        return isSmoothlyScalable(family, (java.lang.String)null);
    }
/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is smoothly scalable; otherwise returns false. If this function returns true, it's safe to scale this font to any size, and the result will always look attractive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#isScalable(java.lang.String) isScalable()}, and {@link com.trolltech.qt.gui.QFontDatabase#isBitmapScalable(java.lang.String) isBitmapScalable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSmoothlyScalable(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSmoothlyScalable_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_isSmoothlyScalable_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);

/**
Returns true if the font that has family <tt>family</tt> and style <tt>style</tt> is italic; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#weight(java.lang.String, java.lang.String) weight()}, and {@link com.trolltech.qt.gui.QFontDatabase#bold(java.lang.String, java.lang.String) bold()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean italic(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_italic_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native boolean __qt_italic_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);


/**
Returns a list of the point sizes available for the font that has
the specified <tt>family</tt>. The list may be empty.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> pointSizes(java.lang.String family) {
        return pointSizes(family, (java.lang.String)null);
    }
/**
Returns a list of the point sizes available for the font that has family <tt>family</tt> and style <tt>style</tt>. The list may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#smoothSizes(java.lang.String, java.lang.String) smoothSizes()}, and {@link com.trolltech.qt.gui.QFontDatabase#standardSizes() standardSizes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> pointSizes(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pointSizes_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_pointSizes_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);

/**
Returns the point sizes of a font that has family <tt>family</tt> and style <tt>style</tt> that will look attractive. The list may be empty. For non-scalable fonts and bitmap scalable fonts, this function is equivalent to {@link com.trolltech.qt.gui.QFontDatabase#pointSizes(java.lang.String) pointSizes()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#pointSizes(java.lang.String) pointSizes()}, and {@link com.trolltech.qt.gui.QFontDatabase#standardSizes() standardSizes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> smoothSizes(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_smoothSizes_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_smoothSizes_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);

/**
Returns a string that describes the style of the <tt>font</tt>. For example, "Bold Italic", "Bold", "Italic" or "Normal". An empty string may be returned.
*/

    @QtBlockedSlot
    public final java.lang.String styleString(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleString_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_styleString_QFont(long __this__nativeId, long font);

/**
Returns a string that describes the style of the <tt>fontInfo</tt>. For example, "Bold Italic", "Bold", "Italic" or "Normal". An empty string may be returned.
*/

    @QtBlockedSlot
    public final java.lang.String styleString(com.trolltech.qt.gui.QFontInfo fontInfo)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleString_QFontInfo(nativeId(), fontInfo == null ? 0 : fontInfo.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_styleString_QFontInfo(long __this__nativeId, long fontInfo);

/**
Returns a list of the styles available for the font family <tt>family</tt>. Some example styles: "Light", "Light Italic", "Bold", "Oblique", "Demi". The list may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#families() families()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> styles(java.lang.String family)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styles_String(nativeId(), family);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_styles_String(long __this__nativeId, java.lang.String family);

/**
Returns the weight of the font that has family <tt>family</tt> and style <tt>style</tt>. If there is no such family and style combination, returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#italic(java.lang.String, java.lang.String) italic()}, and {@link com.trolltech.qt.gui.QFontDatabase#bold(java.lang.String, java.lang.String) bold()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int weight(java.lang.String family, java.lang.String style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_weight_String_String(nativeId(), family, style);
    }
    @QtBlockedSlot
    native int __qt_weight_String_String(long __this__nativeId, java.lang.String family, java.lang.String style);

/**
Returns a sorted list of the available writing systems. This is list generated from information about all installed fonts on the system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#families() families()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QFontDatabase.WritingSystem> writingSystems()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writingSystems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QFontDatabase.WritingSystem> __qt_writingSystems(long __this__nativeId);

/**
Returns a sorted list of the writing systems supported by a given font <tt>family</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#families() families()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QFontDatabase.WritingSystem> writingSystems(java.lang.String family)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writingSystems_String(nativeId(), family);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QFontDatabase.WritingSystem> __qt_writingSystems_String(long __this__nativeId, java.lang.String family);

/**
Loads the font from the file specified by <tt>fileName</tt> and makes it available to the application. An ID is returned that can be used to remove the font again with {@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) removeApplicationFont()} or to retrieve the list of family names contained in the font. <p>The function returns -1 if the font could not be loaded. <p>Currently only TrueType fonts, TrueType font collections, and OpenType fonts are supported. <p><b>Note:</b> Adding application fonts on Unix/X11 platforms without fontconfig is currently not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) addApplicationFontFromData()}, {@link com.trolltech.qt.gui.QFontDatabase#applicationFontFamilies(int) applicationFontFamilies()}, and {@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) removeApplicationFont()}. <br></DD></DT>
*/

    public native static int addApplicationFont(java.lang.String fileName);

/**
Loads the font from binary data specified by <tt>fontData</tt> and makes it available to the application. An ID is returned that can be used to remove the font again with {@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) removeApplicationFont()} or to retrieve the list of family names contained in the font. <p>The function returns -1 if the font could not be loaded. <p>Currently only TrueType fonts and TrueType font collections are supported. <p><b>Note:</b> Adding application fonts on Unix/X11 platforms without fontconfig is currently not supported. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) addApplicationFont()}, {@link com.trolltech.qt.gui.QFontDatabase#applicationFontFamilies(int) applicationFontFamilies()}, and {@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) removeApplicationFont()}. <br></DD></DT>
*/

    public static int addApplicationFontFromData(com.trolltech.qt.core.QByteArray fontData)    {
        return __qt_addApplicationFontFromData_QByteArray(fontData == null ? 0 : fontData.nativeId());
    }
    native static int __qt_addApplicationFontFromData_QByteArray(long fontData);

/**
Returns a list of font families for the given application font identified by <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) addApplicationFont()}, and {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) addApplicationFontFromData()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> applicationFontFamilies(int id);

/**
Removes all application-local fonts previously added using {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) addApplicationFont()} and {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) addApplicationFontFromData()}. <p>Returns true if unloading of the fonts succeeded; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) removeApplicationFont()}, {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) addApplicationFont()}, and {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) addApplicationFontFromData()}. <br></DD></DT>
*/

    public native static boolean removeAllApplicationFonts();

/**
Removes the previously loaded application font identified by <tt>id</tt>. Returns true if unloading of the font succeeded; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#removeAllApplicationFonts() removeAllApplicationFonts()}, {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) addApplicationFont()}, and {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) addApplicationFontFromData()}. <br></DD></DT>
*/

    public native static boolean removeApplicationFont(int id);

/**
Returns a list of standard font sizes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#smoothSizes(java.lang.String, java.lang.String) smoothSizes()}, and {@link com.trolltech.qt.gui.QFontDatabase#pointSizes(java.lang.String) pointSizes()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.Integer> standardSizes();

/**
Returns true if font rendering is supported outside the GUI thread, false otherwise. In other words, a return value of false means that all {@link com.trolltech.qt.gui.QPainter#drawText(com.trolltech.qt.core.QPoint, java.lang.String) QPainter::drawText()} calls outside the GUI thread will not produce readable output. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-threads.html#painting-in-threads">threads.html#painting-in-threads</a>}. <br></DD></DT>
*/

    public native static boolean supportsThreadedFontRendering();

/**
Returns the names the <tt>writingSystem</tt> (e.g. for displaying to the user in a dialog).
*/

    public static java.lang.String writingSystemName(com.trolltech.qt.gui.QFontDatabase.WritingSystem writingSystem)    {
        return __qt_writingSystemName_WritingSystem(writingSystem.value());
    }
    native static java.lang.String __qt_writingSystemName_WritingSystem(int writingSystem);

/**
Returns a string with sample characters from <tt>writingSystem</tt>.
*/

    public static java.lang.String writingSystemSample(com.trolltech.qt.gui.QFontDatabase.WritingSystem writingSystem)    {
        return __qt_writingSystemSample_WritingSystem(writingSystem.value());
    }
    native static java.lang.String __qt_writingSystemSample_WritingSystem(int writingSystem);

/**
@exclude
*/

    public static native QFontDatabase fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFontDatabase(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFontDatabase array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFontDatabase clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFontDatabase __qt_clone(long __this_nativeId);
}
