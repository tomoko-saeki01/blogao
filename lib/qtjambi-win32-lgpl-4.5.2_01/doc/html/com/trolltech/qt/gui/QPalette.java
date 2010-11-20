package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPalette class contains color groups for each widget state. A palette consists of three color groups: Active, Disabled, and Inactive. All widgets in Qt contain a palette and use their palette to draw themselves. This makes the user interface easily configurable and easier to keep consistent. <p>If you create a new widget we strongly recommend that you use the colors in the palette rather than hard-coding specific colors. <p>The color groups: <ul><li> The Active group is used for the window that has keyboard focus.</li><li> The Inactive group is used for other windows.</li><li> The Disabled group is used for widgets (not windows) that are disabled for some reason.</li></ul> Both active and inactive windows can contain disabled widgets. (Disabled widgets are often called inaccessible or grayed out.) <p>In most styles, Active and Inactive look the same. <p>Colors and brushes can be set for particular roles in any of a palette's color groups with {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()} and {@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}. A color group contains a group of colors used by widgets for drawing themselves. We recommend that widgets use color group roles from the palette such as "foreground" and "base" rather than literal colors like "red" or "turquoise". The color roles are enumerated and defined in the {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole } documentation. <p>We strongly recommend that you use the default palette of the current style (returned by {@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}) and modify that as necessary. This is done by Qt's widgets when they are drawn. <p>To modify a color group you call the functions {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()} and {@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}, depending on whether you want a pure color or a pixmap pattern. <p>There are also corresponding {@link com.trolltech.qt.gui.QPalette#color(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) color()} and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()} getters, and a commonly used convenience function to get the {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole } for the current {@link com.trolltech.qt.gui.QPalette.ColorGroup ColorGroup }: {@link com.trolltech.qt.gui.QPalette#window() window()}, {@link com.trolltech.qt.gui.QPalette#windowText() windowText()}, {@link com.trolltech.qt.gui.QPalette#base() base()}, etc. <p>You can copy a palette using the copy constructor and test to see if two palettes are identical using {@link com.trolltech.qt.gui.QPalette#isCopyOf(com.trolltech.qt.gui.QPalette) isCopyOf()}. <p>QPalette is optimized by the use of {@link <a href="../shared.html">implicit sharing</a>}, so it is very efficient to pass QPalette objects as arguments. <p><b>Warning:</b> Some styles do not use the palette for all drawing, for instance, if they make use of native theme engines. This is the case for both the Windows XP, Windows Vista, and the Mac OS X styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}, {@link QWidget#setPalette(com.trolltech.qt.gui.QPalette) QWidget::setPalette()}, and {@link com.trolltech.qt.gui.QColor QColor}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPalette extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum ColorGroup implements com.trolltech.qt.QtEnumerator {
/**

*/

        Active(0),
/**

*/

        Disabled(1),
/**

*/

        Inactive(2),
        NColorGroups(3),
        Current(4),
        All(5),
;

        ColorGroup(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPalette$ColorGroup constant with the specified <tt>int</tt>.</brief>
*/

        public static ColorGroup resolve(int value) {
            return (ColorGroup) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Active;
            case 1: return Disabled;
            case 2: return Inactive;
            case 3: return NColorGroups;
            case 4: return Current;
            case 5: return All;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
See the description for details.  <br><center><img src=". /images/palette.png"></center><br> The {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole } enum defines the different symbolic color roles used in current GUIs. <p>The central roles are: There are some color roles used mostly for 3D bevel and shadow effects. All of these are normally derived from <tt>Window</tt>, and used in ways that depend on that relationship. For example, buttons depend on it to make the bevels look attractive, and Motif scroll bars depend on <tt>Mid</tt> to be slightly different from <tt>Window</tt>. Selected (marked) items have two roles: There are two color roles related to hyperlinks: Note that we do not use the <tt>Link</tt> and <tt>LinkVisited</tt> roles when rendering rich text in Qt, and that we recommend that you use CSS and the {@link QTextDocument#setDefaultStyleSheet(java.lang.String) QTextDocument::setDefaultStyleSheet()} function to alter the appearance of links. For example: <pre class="snippet">
    QTextBrowser browser = new QTextBrowser();
    QColor linkColor = QColor.red;
    String sheet = "a { text-decoration: underline; color: " + linkColor.name();
    browser.document().setDefaultStyleSheet(sheet);
</pre>
*/

    public enum ColorRole implements com.trolltech.qt.QtEnumerator {
/**
 A general foreground color.
*/

/**
 A general background color.
*/

        WindowText(0),
/**
 The general button background color. This background can be different from <tt>Window</tt> as some styles require a different background color for buttons.
*/

        Button(1),
/**
 Lighter than <tt>Button</tt> color.
*/

        Light(2),
/**
 Between <tt>Button</tt> and <tt>Dark</tt>.
*/

/**
 Between <tt>Button</tt> and <tt>Light</tt>.
*/

        Midlight(3),
/**
 Darker than <tt>Button</tt>.
*/

        Dark(4),
        Mid(5),
/**
 The foreground color used with <tt>Base</tt>. This is usually the same as the <tt>WindowText</tt>, in which case it must provide good contrast with <tt>Window</tt> and <tt>Base</tt>.
*/

        Text(6),
/**
 A text color that is very different from <tt>WindowText</tt>, and contrasts well with e.g. <tt>Dark</tt>. Typically used for text that needs to be drawn where <tt>Text</tt> or <tt>WindowText</tt> would give poor contrast, such as on pressed push buttons. Note that text colors can be used for things other than just words; text colors are usually used for text, but it's quite common to use the text color roles for lines, icons, etc.
*/

        BrightText(7),
/**
 A foreground color used with the <tt>Button</tt> color.
*/

        ButtonText(8),
/**
 Used mostly as the background color for text entry widgets, but can also be used for other painting - such as the background of combobox drop down lists and toolbar handles. It is usually white or another light color.
*/

        Base(9),
        Window(10),
/**
 A very dark color. By default, the shadow color is {@link com.trolltech.qt.core.Qt.GlobalColor Qt::black }.
*/

        Shadow(11),
/**
 A color to indicate a selected item or the current item. By default, the highlight color is {@link com.trolltech.qt.core.Qt.GlobalColor Qt::darkBlue }.
*/

        Highlight(12),
/**
 A text color that contrasts with <tt>Highlight</tt>. By default, the highlighted text color is {@link com.trolltech.qt.core.Qt.GlobalColor Qt::white }.
*/

        HighlightedText(13),
/**
 A text color used for unvisited hyperlinks. By default, the link color is {@link com.trolltech.qt.core.Qt.GlobalColor Qt::blue }.
*/

        Link(14),
/**
 A text color used for already visited hyperlinks. By default, the linkvisited color is {@link com.trolltech.qt.core.Qt.GlobalColor Qt::magenta }.
*/

        LinkVisited(15),
/**
 Used as the alternate background color in views with alternating row colors (see {@link QAbstractItemView#setAlternatingRowColors(boolean) QAbstractItemView.:setAlternatingRowColors()}).
*/

        AlternateBase(16),
/**
 No role; this special role is often used to indicate that a role has not been assigned.
*/

        NoRole(17),
/**
 Used as the background color for {@link com.trolltech.qt.gui.QToolTip QToolTip} and {@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}. Tool tips use the Inactive color group of {@link com.trolltech.qt.gui.QPalette QPalette}, because tool tips are not active windows.
*/

        ToolTipBase(18),
/**
 Used as the foreground color for {@link com.trolltech.qt.gui.QToolTip QToolTip} and {@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}. Tool tips use the Inactive color group of {@link com.trolltech.qt.gui.QPalette QPalette}, because tool tips are not active windows.
*/

        ToolTipText(19),
;

        ColorRole(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPalette$ColorRole constant with the specified <tt>int</tt>.</brief>
*/

        public static ColorRole resolve(int value) {
            return (ColorRole) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WindowText;
            case 1: return Button;
            case 2: return Light;
            case 3: return Midlight;
            case 4: return Dark;
            case 5: return Mid;
            case 6: return Text;
            case 7: return BrightText;
            case 8: return ButtonText;
            case 9: return Base;
            case 10: return Window;
            case 11: return Shadow;
            case 12: return Highlight;
            case 13: return HighlightedText;
            case 14: return Link;
            case 15: return LinkVisited;
            case 16: return AlternateBase;
            case 17: return NoRole;
            case 18: return ToolTipBase;
            case 19: return ToolTipText;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a palette object that uses the application's default palette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}, and {@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}. <br></DD></DT>
*/

    public QPalette(){
        super((QPrivateConstructor)null);
        __qt_QPalette();
    }

    native void __qt_QPalette();

/**
Constructs a palette from the <tt>button</tt> color. The other colors are automatically calculated, based on this color. <tt>Window</tt> will be the button color as well.
*/

    public QPalette(com.trolltech.qt.core.Qt.GlobalColor button){
        super((QPrivateConstructor)null);
        __qt_QPalette_GlobalColor(button.value());
    }

    native void __qt_QPalette_GlobalColor(int button);

/**
Constructs a palette. You can pass either brushes, pixmaps or plain colors for <tt>windowText</tt>, <tt>button</tt>, <tt>light</tt>, <tt>dark</tt>, <tt>mid</tt>, <tt>text</tt>, <tt>bright_text</tt>, <tt>base</tt> and <tt>window</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush QBrush}. <br></DD></DT>
*/

    public QPalette(com.trolltech.qt.gui.QBrush windowText, com.trolltech.qt.gui.QBrush button, com.trolltech.qt.gui.QBrush light, com.trolltech.qt.gui.QBrush dark, com.trolltech.qt.gui.QBrush mid, com.trolltech.qt.gui.QBrush text, com.trolltech.qt.gui.QBrush bright_text, com.trolltech.qt.gui.QBrush base, com.trolltech.qt.gui.QBrush window){
        super((QPrivateConstructor)null);
        __qt_QPalette_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush(windowText == null ? 0 : windowText.nativeId(), button == null ? 0 : button.nativeId(), light == null ? 0 : light.nativeId(), dark == null ? 0 : dark.nativeId(), mid == null ? 0 : mid.nativeId(), text == null ? 0 : text.nativeId(), bright_text == null ? 0 : bright_text.nativeId(), base == null ? 0 : base.nativeId(), window == null ? 0 : window.nativeId());
    }

    native void __qt_QPalette_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush(long windowText, long button, long light, long dark, long mid, long text, long bright_text, long base, long window);

/**
Constructs a palette from the <tt>button</tt> color. The other colors are automatically calculated, based on this color. <tt>Window</tt> will be the button color as well.
*/

    public QPalette(com.trolltech.qt.gui.QColor button){
        super((QPrivateConstructor)null);
        __qt_QPalette_QColor(button == null ? 0 : button.nativeId());
    }

    native void __qt_QPalette_QColor(long button);

/**
Constructs a palette from a <tt>button</tt> color and a <tt>window</tt>. The other colors are automatically calculated, based on these colors.
*/

    public QPalette(com.trolltech.qt.gui.QColor button, com.trolltech.qt.gui.QColor window){
        super((QPrivateConstructor)null);
        __qt_QPalette_QColor_QColor(button == null ? 0 : button.nativeId(), window == null ? 0 : window.nativeId());
    }

    native void __qt_QPalette_QColor_QColor(long button, long window);

/**
Constructs a copy of <tt>p</tt>. <p>This constructor is fast thanks to {@link <a href="../shared.html">implicit sharing</a>}.
*/

    public QPalette(com.trolltech.qt.gui.QPalette palette){
        super((QPrivateConstructor)null);
        __qt_QPalette_QPalette(palette == null ? 0 : palette.nativeId());
    }

    native void __qt_QPalette_QPalette(long palette);

/**
Returns the alternate base brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush alternateBase()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alternateBase(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_alternateBase(long __this__nativeId);

/**
Returns the base brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush base()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_base(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_base(long __this__nativeId);

/**
Returns the bright text foreground brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brightText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brightText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brightText(long __this__nativeId);

/**
Returns the brush in the specified color <tt>group</tt>, used for the given color <tt>role</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#color(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) color()}, {@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brush(com.trolltech.qt.gui.QPalette.ColorGroup cg, com.trolltech.qt.gui.QPalette.ColorRole cr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brush_ColorGroup_ColorRole(nativeId(), cg.value(), cr.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brush_ColorGroup_ColorRole(long __this__nativeId, int cg, int cr);

/**
This is an overloaded member function, provided for convenience. <p>Returns the brush that has been set for the given color <tt>role</tt> in the current {@link com.trolltech.qt.gui.QPalette.ColorGroup ColorGroup }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#color(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) color()}, {@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brush(com.trolltech.qt.gui.QPalette.ColorRole cr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brush_ColorRole(nativeId(), cr.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brush_ColorRole(long __this__nativeId, int cr);

/**
Returns the button brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush button()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_button(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_button(long __this__nativeId);

/**
Returns the button text foreground brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush buttonText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttonText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_buttonText(long __this__nativeId);

/**
Returns a number that identifies the contents of this QPalette object. Distinct QPalette objects can have the same key if they refer to the same contents. <p>The {@link com.trolltech.qt.gui.QPalette#cacheKey() cacheKey()} will change when the palette is altered.
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
Returns the color in the specified color <tt>group</tt>, used for the given color <tt>role</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}, {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor color(com.trolltech.qt.gui.QPalette.ColorGroup cg, com.trolltech.qt.gui.QPalette.ColorRole cr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color_ColorGroup_ColorRole(nativeId(), cg.value(), cr.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_color_ColorGroup_ColorRole(long __this__nativeId, int cg, int cr);

/**
This is an overloaded member function, provided for convenience. <p>Returns the color that has been set for the given color <tt>role</tt> in the current {@link com.trolltech.qt.gui.QPalette.ColorGroup ColorGroup }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor color(com.trolltech.qt.gui.QPalette.ColorRole cr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color_ColorRole(nativeId(), cr.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_color_ColorRole(long __this__nativeId, int cr);

/**
Returns the palette's current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#setCurrentColorGroup(com.trolltech.qt.gui.QPalette.ColorGroup) setCurrentColorGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette.ColorGroup currentColorGroup()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPalette.ColorGroup.resolve(__qt_currentColorGroup(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_currentColorGroup(long __this__nativeId);

/**
Returns the dark brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush dark()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dark(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_dark(long __this__nativeId);

/**
Returns the highlight brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush highlight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_highlight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_highlight(long __this__nativeId);

/**
Returns the highlighted text brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush highlightedText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_highlightedText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_highlightedText(long __this__nativeId);

/**
Returns true if the {@link com.trolltech.qt.gui.QPalette.ColorGroup ColorGroup }<tt>cg</tt> and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }<tt>cr</tt> has been set previously on this palette; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isBrushSet(com.trolltech.qt.gui.QPalette.ColorGroup cg, com.trolltech.qt.gui.QPalette.ColorRole cr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBrushSet_ColorGroup_ColorRole(nativeId(), cg.value(), cr.value());
    }
    @QtBlockedSlot
    native boolean __qt_isBrushSet_ColorGroup_ColorRole(long __this__nativeId, int cg, int cr);

/**
Returns true if this palette and <tt>p</tt> are copies of each other, i.e. one of them was created as a copy of the other and neither was subsequently modified; otherwise returns false. This is much stricter than equality. <p><DT><b>See also:</b><br><DD>operator=(), and operator==(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCopyOf(com.trolltech.qt.gui.QPalette p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCopyOf_QPalette(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCopyOf_QPalette(long __this__nativeId, long p);

/**
Returns true (usually quickly) if color group <tt>cg1</tt> is equal to <tt>cg2</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEqual(com.trolltech.qt.gui.QPalette.ColorGroup cr1, com.trolltech.qt.gui.QPalette.ColorGroup cr2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEqual_ColorGroup_ColorGroup(nativeId(), cr1.value(), cr2.value());
    }
    @QtBlockedSlot
    native boolean __qt_isEqual_ColorGroup_ColorGroup(long __this__nativeId, int cr1, int cr2);

/**
Returns the light brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush light()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_light(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_light(long __this__nativeId);

/**
Returns the unvisited link text brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush link()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_link(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_link(long __this__nativeId);

/**
Returns the visited link text brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush linkVisited()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_linkVisited(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_linkVisited(long __this__nativeId);

/**
Returns the mid brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush mid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_mid(long __this__nativeId);

/**
Returns the midlight brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush midlight()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_midlight(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_midlight(long __this__nativeId);

/**
<brief>Writes thisQPalette
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream ds)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), ds == null ? 0 : ds.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long ds);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QPalette p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QPalette(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QPalette(long __this__nativeId, long p);

/**
<brief>Reads a QPalette
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream ds)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), ds == null ? 0 : ds.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long ds);

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
Returns a new QPalette that has attributes copied from <tt>other</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette resolve(com.trolltech.qt.gui.QPalette arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolve_QPalette(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_resolve_QPalette(long __this__nativeId, long arg__1);

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
This is an overloaded member function, provided for convenience. <p>Sets the brush in the specified color <tt>group</tt>, used for the given color <tt>role</tt>, to <tt>brush</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}, {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBrush(com.trolltech.qt.gui.QPalette.ColorGroup cg, com.trolltech.qt.gui.QPalette.ColorRole cr, com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrush_ColorGroup_ColorRole_QBrush(nativeId(), cg.value(), cr.value(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBrush_ColorGroup_ColorRole_QBrush(long __this__nativeId, int cg, int cr, long brush);

/**
Sets the brush for the given color <tt>role</tt> to the specified <tt>brush</tt> for all groups in the palette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}, {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBrush(com.trolltech.qt.gui.QPalette.ColorRole cr, com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBrush_ColorRole_QBrush(nativeId(), cr.value(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBrush_ColorRole_QBrush(long __this__nativeId, int cr, long brush);

/**
Sets the brush in the specified color <tt>group</tt>, used for the given color <tt>role</tt>, to the specified solid <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#setBrush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QBrush) setBrush()}, {@link com.trolltech.qt.gui.QPalette#color(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) color()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.gui.QPalette.ColorGroup cg, com.trolltech.qt.gui.QPalette.ColorRole cr, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_ColorGroup_ColorRole_QColor(nativeId(), cg.value(), cr.value(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColor_ColorGroup_ColorRole_QColor(long __this__nativeId, int cg, int cr, long color);

/**
This is an overloaded member function, provided for convenience. <p>Sets the color used for the given color <tt>role</tt>, in all color groups, to the specified solid <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}, {@link com.trolltech.qt.gui.QPalette#setColor(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole, com.trolltech.qt.gui.QColor) setColor()}, and {@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.gui.QPalette.ColorRole cr, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_ColorRole_QColor(nativeId(), cr.value(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColor_ColorRole_QColor(long __this__nativeId, int cr, long color);

/**
Sets a the group at <tt>cg</tt>. You can pass either brushes, pixmaps or plain colors for <tt>windowText</tt>, <tt>button</tt>, <tt>light</tt>, <tt>dark</tt>, <tt>mid</tt>, <tt>text</tt>, <tt>bright_text</tt>, <tt>base</tt> and <tt>window</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush QBrush}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColorGroup(com.trolltech.qt.gui.QPalette.ColorGroup cr, com.trolltech.qt.gui.QBrush windowText, com.trolltech.qt.gui.QBrush button, com.trolltech.qt.gui.QBrush light, com.trolltech.qt.gui.QBrush dark, com.trolltech.qt.gui.QBrush mid, com.trolltech.qt.gui.QBrush text, com.trolltech.qt.gui.QBrush bright_text, com.trolltech.qt.gui.QBrush base, com.trolltech.qt.gui.QBrush window)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColorGroup_ColorGroup_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush(nativeId(), cr.value(), windowText == null ? 0 : windowText.nativeId(), button == null ? 0 : button.nativeId(), light == null ? 0 : light.nativeId(), dark == null ? 0 : dark.nativeId(), mid == null ? 0 : mid.nativeId(), text == null ? 0 : text.nativeId(), bright_text == null ? 0 : bright_text.nativeId(), base == null ? 0 : base.nativeId(), window == null ? 0 : window.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColorGroup_ColorGroup_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush_QBrush(long __this__nativeId, int cr, long windowText, long button, long light, long dark, long mid, long text, long bright_text, long base, long window);

/**
Set the palette's current color group to <tt>cg</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette#currentColorGroup() currentColorGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCurrentColorGroup(com.trolltech.qt.gui.QPalette.ColorGroup cg)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentColorGroup_ColorGroup(nativeId(), cg.value());
    }
    @QtBlockedSlot
    native void __qt_setCurrentColorGroup_ColorGroup(long __this__nativeId, int cg);

/**
Returns the shadow brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush shadow()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shadow(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_shadow(long __this__nativeId);

/**
Returns the text foreground brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_text(long __this__nativeId);

/**
Returns the tool tip base brush of the current color group. This brush is used by {@link com.trolltech.qt.gui.QToolTip QToolTip} and {@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}. <p><b>Note:</b> Tool tips use the Inactive color group of QPalette, because tool tips are not active windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush toolTipBase()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTipBase(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_toolTipBase(long __this__nativeId);

/**
Returns the tool tip text brush of the current color group. This brush is used by {@link com.trolltech.qt.gui.QToolTip QToolTip} and {@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}. <p><b>Note:</b> Tool tips use the Inactive color group of QPalette, because tool tips are not active windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush toolTipText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTipText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_toolTipText(long __this__nativeId);

/**
Returns the window (general background) brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush window()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_window(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_window(long __this__nativeId);

/**
Returns the window text (general foreground) brush of the current color group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette.ColorRole ColorRole }, and {@link com.trolltech.qt.gui.QPalette#brush(com.trolltech.qt.gui.QPalette.ColorGroup, com.trolltech.qt.gui.QPalette.ColorRole) brush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush windowText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowText(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_windowText(long __this__nativeId);

/**
@exclude
*/

    public static native QPalette fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPalette(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPalette array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QPalette)
        return operator_equal((com.trolltech.qt.gui.QPalette) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QPalette clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPalette __qt_clone(long __this_nativeId);
}
