package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFontComboBox widget is a combobox that lets the user select a font family. The combobox is populated with an alphabetized list of font family names, such as Arial, Helvetica, and Times New Roman. Family names are displayed using the actual font when possible. For fonts such as Symbol, where the name is not representable in the font itself, a sample of the font is displayed next to the family name. <p>QFontComboBox is often used in toolbars, in conjunction with a {@link com.trolltech.qt.gui.QComboBox QComboBox} for controlling the font size and two {@link com.trolltech.qt.gui.QToolButton QToolButton}s for bold and italic. <p>When the user selects a new font, the {@link com.trolltech.qt.gui.QFontComboBox#currentFontChanged currentFontChanged() } signal is emitted in addition to {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged currentIndexChanged() }. <p>Call {@link com.trolltech.qt.gui.QFontComboBox#setWritingSystem(com.trolltech.qt.gui.QFontDatabase.WritingSystem) setWritingSystem()} to tell QFontComboBox to show only fonts that support a given writing system, and {@link com.trolltech.qt.gui.QFontComboBox#setFontFilters(com.trolltech.qt.gui.QFontComboBox.FontFilter[]) setFontFilters()} to filter out certain types of fonts as e.g. non scalable fonts or monospaced fonts. <br><center><img src="../images/windowsxp-fontcombobox.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox QComboBox}, {@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QFontInfo QFontInfo}, {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}, {@link com.trolltech.qt.gui.QFontDatabase QFontDatabase}, and {@link <a href="../widgets-charactermap.html">Character Map Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFontComboBox extends com.trolltech.qt.gui.QComboBox
{
    
/**
This enum can be used to only show certain types of fonts in the font combo box.
*/
@QtBlockedEnum
    public enum FontFilter implements com.trolltech.qt.QtEnumerator {
/**
 Show all fonts
*/

        AllFonts(0),
/**
 Show scalable fonts
*/

        ScalableFonts(1),
/**
 Show non scalable fonts
*/

        NonScalableFonts(2),
/**
 Show monospaced fonts
*/

        MonospacedFonts(4),
/**
 Show proportional fonts
*/

        ProportionalFonts(8);

        FontFilter(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QFontComboBox$FontFilters with the specified <tt>com.trolltech.qt.gui.QFontComboBox$FontFilter[]</tt> QFontComboBox$FontFilter values set.</brief>
*/

        public static FontFilters createQFlags(FontFilter ... values) {
            return new FontFilters(values);
        }
/**
<brief>Returns the QFontComboBox$FontFilter constant with the specified <tt>int</tt>.</brief>
*/

        public static FontFilter resolve(int value) {
            return (FontFilter) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AllFonts;
            case 1: return ScalableFonts;
            case 2: return NonScalableFonts;
            case 4: return MonospacedFonts;
            case 8: return ProportionalFonts;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FontFilters extends com.trolltech.qt.QFlags<FontFilter> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QFontComboBox-FontFilters with the specified <tt>com.trolltech.qt.gui.QFontComboBox.FontFilter[]</tt>. flags set.</brief>
*/

        public FontFilters(FontFilter ... args) { super(args); }
        public FontFilters(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QFont(named: font)&gt;:<p> This signal is emitted whenever the current font changes, with the new <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link QFontComboBox#currentFont() currentFont}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QFont> currentFontChanged = new Signal1<com.trolltech.qt.gui.QFont>();

    private final void currentFontChanged(com.trolltech.qt.gui.QFont f)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentFontChanged_QFont(nativeId(), f == null ? 0 : f.nativeId());
    }
    native void __qt_currentFontChanged_QFont(long __this__nativeId, long f);


/**
Constructs a font combobox with the given <tt>parent</tt>.
*/

    public QFontComboBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a font combobox with the given <tt>parent</tt>.
*/

    public QFontComboBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QFontComboBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFontComboBox_QWidget(long parent);

/**
This property holds the currently selected font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontComboBox#currentFontChanged currentFontChanged() }, {@link QComboBox#currentIndex() currentIndex}, and {@link QComboBox#currentText() currentText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="currentFont")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont currentFont()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFont(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_currentFont(long __this__nativeId);

/**
This property holds the filter for the combobox. By default, all fonts are listed. <p><DT><b>See also:</b><br><DD>{@link QFontComboBox#writingSystem() writingSystem}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fontFilters")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontComboBox.FontFilters fontFilters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QFontComboBox.FontFilters(__qt_fontFilters(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fontFilters(long __this__nativeId);

/**
This property holds the currently selected font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontComboBox#currentFontChanged currentFontChanged() }, {@link QComboBox#currentIndex() currentIndex}, and {@link QComboBox#currentText() currentText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentFont")
    public final void setCurrentFont(com.trolltech.qt.gui.QFont f)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentFont_QFont(nativeId(), f == null ? 0 : f.nativeId());
    }
    native void __qt_setCurrentFont_QFont(long __this__nativeId, long f);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFontFilters(com.trolltech.qt.gui.QFontComboBox.FontFilter ... filters) {
        this.setFontFilters(new com.trolltech.qt.gui.QFontComboBox.FontFilters(filters));
    }
/**
This property holds the filter for the combobox. By default, all fonts are listed. <p><DT><b>See also:</b><br><DD>{@link QFontComboBox#writingSystem() writingSystem}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="fontFilters")
    @QtBlockedSlot
    public final void setFontFilters(com.trolltech.qt.gui.QFontComboBox.FontFilters filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontFilters_FontFilters(nativeId(), filters.value());
    }
    @QtBlockedSlot
    native void __qt_setFontFilters_FontFilters(long __this__nativeId, int filters);

/**
This property holds the writing system that serves as a filter for the combobox. If <tt>script</tt> is {@link com.trolltech.qt.gui.QFontDatabase.WritingSystem QFontDatabase::Any } (the default), all fonts are listed. <p><DT><b>See also:</b><br><DD>{@link QFontComboBox#fontFilters() fontFilters}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="writingSystem")
    @QtBlockedSlot
    public final void setWritingSystem(com.trolltech.qt.gui.QFontDatabase.WritingSystem arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWritingSystem_WritingSystem(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setWritingSystem_WritingSystem(long __this__nativeId, int arg__1);

/**
This property holds the writing system that serves as a filter for the combobox. If <tt>script</tt> is {@link com.trolltech.qt.gui.QFontDatabase.WritingSystem QFontDatabase::Any } (the default), all fonts are listed. <p><DT><b>See also:</b><br><DD>{@link QFontComboBox#fontFilters() fontFilters}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="writingSystem")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontDatabase.WritingSystem writingSystem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFontDatabase.WritingSystem.resolve(__qt_writingSystem(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_writingSystem(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QFontComboBox fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFontComboBox(QPrivateConstructor p) { super(p); } 
}
