package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOption class stores the parameters used by {@link com.trolltech.qt.gui.QStyle QStyle} functions. QStyleOption and its subclasses contain all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw a graphical element. <p>For performance reasons, there are few member functions and the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>The caller of a {@link com.trolltech.qt.gui.QStyle QStyle} function usually creates QStyleOption objects on the stack. This combined with Qt's extensive use of {@link <a href="../shared.html">implicit sharing</a>} for types such as QString, {@link com.trolltech.qt.gui.QPalette QPalette}, and {@link com.trolltech.qt.gui.QColor QColor} ensures that no memory allocation needlessly takes place. <p>The following code snippet shows how to use a specific QStyleOption subclass to paint a push button: <pre class="snippet">
    public void paintEvent(QPaintEvent event)
    {
        QStyleOptionButton optioni = new QStyleOptionButton();
        option.initFrom(this);
        option.state() = isDown() ? QStyle.State.State_Sunken :
                                    QStyle.State.State_Raised;
        if (isDefault())
            option.features().setFlag(QStyleOptionButton.ButtonFeature.DefaultButton);
        option.setText(text());
        option.setIcon(icon());

        QPainter painter = new QPainter(this);
        style().drawControl(QStyle.ControlElement.CE_PushButton, option, painter, this);
    }
</pre> In our example, the control is a {@link com.trolltech.qt.gui.QStyle.ControlElement QStyle::CE_PushButton }, and according to the {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawControl()} documentation the corresponding class is {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}. <p>When reimplementing {@link com.trolltech.qt.gui.QStyle QStyle} functions that take a QStyleOption parameter, you often need to cast the QStyleOption to a subclass. For safety, you can use qstyleoption_cast() to ensure that the pointer type is correct. For example: <pre class="snippet">
    void drawPrimitive(QStyle.PrimitiveElement element,
                       QStyleOption option,
                       QPainter painter,
                       QWidget widget)
    {
        if (element.equals(PrimitiveElement.PE_FrameFocusRect)) {
            QStyleOptionFocusRect focusRectOption =
                    (QStyleOptionFocusRect) option;
            if (focusRectOption != null) {
                // ...
            }
        }
        // ...
    }
    </pre> The qstyleoption_cast() function will return 0 if the object to which <tt>option</tt> points is not of the correct type. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle QStyle}, and {@link com.trolltech.qt.gui.QStylePainter QStylePainter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOption extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 1
*/

        Version(1);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOption$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Default } for this class).
*/

        Type(0);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOption$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. The following values are used for custom controls: Some style options are defined for various {@link <a href="../qt3support.html">Qt3Support</a>} controls: <p><DT><b>See also:</b><br><DD>type. <br></DD></DT>
*/

    public enum OptionType implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QStyleOption QStyleOption}
*/

        SO_Default(0),
/**
 {@link com.trolltech.qt.gui.QStyleOptionFocusRect QStyleOptionFocusRect}
*/

        SO_FocusRect(1),
/**
 {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}
*/

        SO_Button(2),
/**
 {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}
*/

        SO_Tab(3),
/**
 {@link com.trolltech.qt.gui.QStyleOptionMenuItem QStyleOptionMenuItem}
*/

        SO_MenuItem(4),
/**
 {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame}{@link com.trolltech.qt.gui.QStyleOptionFrameV2 QStyleOptionFrameV2}
*/

        SO_Frame(5),
/**
 {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}{@link com.trolltech.qt.gui.QStyleOptionProgressBarV2 QStyleOptionProgressBarV2}
*/

        SO_ProgressBar(6),
/**
 {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox}
*/

        SO_ToolBox(7),
/**
 {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}
*/

        SO_Header(8),
/**
 QStyleOptionQ3DockWindow
*/

        SO_Q3DockWindow(9),
/**
 {@link com.trolltech.qt.gui.QStyleOptionDockWidget QStyleOptionDockWidget}
*/

        SO_DockWidget(10),
/**
 QStyleOptionQ3ListViewItem
*/

/**
 QStyleOptionQ3ListView
*/

        SO_Q3ListViewItem(11),
/**
 {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem} (used in Interviews)
*/

        SO_ViewItem(12),
/**
 {@link com.trolltech.qt.gui.QStyleOptionTabWidgetFrame QStyleOptionTabWidgetFrame}
*/

        SO_TabWidgetFrame(13),
/**
 {@link com.trolltech.qt.gui.QStyleOptionTabBarBase QStyleOptionTabBarBase}
*/

        SO_TabBarBase(14),
/**
 {@link com.trolltech.qt.gui.QStyleOptionRubberBand QStyleOptionRubberBand}
*/

        SO_RubberBand(15),
/**
 {@link com.trolltech.qt.gui.QStyleOptionToolBar QStyleOptionToolBar}
*/

        SO_ToolBar(16),
/**
 {@link com.trolltech.qt.gui.QStyleOptionGraphicsItem QStyleOptionGraphicsItem}
*/

        SO_GraphicsItem(17),
/**
 {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex}
*/

        SO_Complex(983040),
/**
 {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}
*/

        SO_Slider(983041),
/**
 {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}
*/

        SO_SpinBox(983042),
/**
 {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}
*/

        SO_ToolButton(983043),
/**
 {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}
*/

        SO_ComboBox(983044),
        SO_Q3ListView(983045),
/**
 {@link com.trolltech.qt.gui.QStyleOptionTitleBar QStyleOptionTitleBar}
*/

        SO_TitleBar(983046),
/**
 {@link com.trolltech.qt.gui.QStyleOptionGroupBox QStyleOptionGroupBox}
*/

        SO_GroupBox(983047),
/**
 {@link com.trolltech.qt.gui.QStyleOptionSizeGrip QStyleOptionSizeGrip}
*/

        SO_SizeGrip(983048),
/**
 Reserved for custom QStyleOptions; all custom controls values must be above this value
*/

        SO_CustomBase(3840),
/**
 Reserved for custom QStyleOptions; all custom complex controls values must be above this value
*/

        SO_ComplexCustomBase(251658240),
        CustomEnum(0);

        OptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOption$OptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static OptionType resolve(int value) {
            return (OptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SO_Default;
            case 1: return SO_FocusRect;
            case 2: return SO_Button;
            case 3: return SO_Tab;
            case 4: return SO_MenuItem;
            case 5: return SO_Frame;
            case 6: return SO_ProgressBar;
            case 7: return SO_ToolBox;
            case 8: return SO_Header;
            case 9: return SO_Q3DockWindow;
            case 10: return SO_DockWidget;
            case 11: return SO_Q3ListViewItem;
            case 12: return SO_ViewItem;
            case 13: return SO_TabWidgetFrame;
            case 14: return SO_TabBarBase;
            case 15: return SO_RubberBand;
            case 16: return SO_ToolBar;
            case 17: return SO_GraphicsItem;
            case 983040: return SO_Complex;
            case 983041: return SO_Slider;
            case 983042: return SO_SpinBox;
            case 983043: return SO_ToolButton;
            case 983044: return SO_ComboBox;
            case 983045: return SO_Q3ListView;
            case 983046: return SO_TitleBar;
            case 983047: return SO_GroupBox;
            case 983048: return SO_SizeGrip;
            case 3840: return SO_CustomBase;
            case 251658240: return SO_ComplexCustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, OptionType>();
            OptionType e = enumCache.get(value);
            if (e == null) {
                e = (OptionType) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), OptionType.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, OptionType> enumCache;    }


/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOption(com.trolltech.qt.gui.QStyleOption other){
        super((QPrivateConstructor)null);
        __qt_QStyleOption_QStyleOption(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOption_QStyleOption(long other);


/**
Constructs a QStyleOption with the specified <tt>version</tt> and <tt>type</tt>. <p>The version has no special meaning for QStyleOption; it can be used by subclasses to distinguish between different version of the same option type. <p>The state member variable is initialized to {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_None }. <p><DT><b>See also:</b><br><DD>version, and type. <br></DD></DT>
*/

    public QStyleOption(int version) {
        this(version, (int)0);
    }

/**
Constructs a QStyleOption with the specified <tt>version</tt> and <tt>type</tt>. <p>The version has no special meaning for QStyleOption; it can be used by subclasses to distinguish between different version of the same option type. <p>The state member variable is initialized to {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_None }. <p><DT><b>See also:</b><br><DD>version, and type. <br></DD></DT>
*/

    public QStyleOption() {
        this((int)1, (int)0);
    }
/**
Constructs a QStyleOption with the specified <tt>version</tt> and <tt>type</tt>. <p>The version has no special meaning for QStyleOption; it can be used by subclasses to distinguish between different version of the same option type. <p>The state member variable is initialized to {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_None }. <p><DT><b>See also:</b><br><DD>version, and type. <br></DD></DT>
*/

    public QStyleOption(int version, int type){
        super((QPrivateConstructor)null);
        __qt_QStyleOption_int_int(version, type);
    }

    native void __qt_QStyleOption_int_int(int version, int type);

/**
Initializes the state, direction, rect, palette, and fontMetrics member variables based on the specified <tt>widget</tt>. <p>This is a convenience function; the member variables can also be initialized manually. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection()}, {@link QWidget#rect() QWidget::rect()}, {@link QWidget#palette() QWidget::palette()}, and {@link com.trolltech.qt.gui.QWidget#fontMetrics() QWidget::fontMetrics()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void initFrom(com.trolltech.qt.gui.QWidget w)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initFrom_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_initFrom_QWidget(long __this__nativeId, long w);

/**
This variable holds the palette that should be used when painting the control. By default, the application's default palette is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPalette(com.trolltech.qt.gui.QPalette palette)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPalette_QPalette(nativeId(), palette == null ? 0 : palette.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPalette_QPalette(long __this__nativeId, long palette);

/**
This variable holds the palette that should be used when painting the control. By default, the application's default palette is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette palette()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_palette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_palette(long __this__nativeId);

/**
This variable holds the version of the style option. This value can be used by subclasses to implement extensions without breaking compatibility. If you use the qstyleoption_cast() function, you normally do not need to check it. <p>The default value is 1.
*/

    @QtBlockedSlot
    public final void setVersion(int version)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVersion_int(nativeId(), version);
    }
    @QtBlockedSlot
    native void __qt_setVersion_int(long __this__nativeId, int version);

/**
This variable holds the version of the style option. This value can be used by subclasses to implement extensions without breaking compatibility. If you use the qstyleoption_cast() function, you normally do not need to check it. <p>The default value is 1.
*/

    @QtBlockedSlot
    public final int version()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_version(nativeId());
    }
    @QtBlockedSlot
    native int __qt_version(long __this__nativeId);

/**
This variable holds the text layout direction that should be used when drawing text in the control. By default, the layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirection_LayoutDirection(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setDirection_LayoutDirection(long __this__nativeId, int direction);

/**
This variable holds the text layout direction that should be used when drawing text in the control. By default, the layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection direction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_direction(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_direction(long __this__nativeId);

/**
This variable holds the area that should be used for various calculations and painting. This can have different meanings for different types of elements. For example, for a {@link com.trolltech.qt.gui.QStyle.ControlElement QStyle::CE_PushButton } element it would be the rectangle for the entire button, while for a {@link com.trolltech.qt.gui.QStyle.ControlElement QStyle::CE_PushButtonLabel } element it would be just the area for the push button label. <p>The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRect(com.trolltech.qt.core.QRect rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRect_QRect(long __this__nativeId, long rect);

/**
This variable holds the area that should be used for various calculations and painting. This can have different meanings for different types of elements. For example, for a {@link com.trolltech.qt.gui.QStyle.ControlElement QStyle::CE_PushButton } element it would be the rectangle for the entire button, while for a {@link com.trolltech.qt.gui.QStyle.ControlElement QStyle::CE_PushButtonLabel } element it would be just the area for the push button label. <p>The default value is a null rectangle, i.e. a rectangle with both the width and the height set to 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
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
This variable holds the option type of the style option. The default value is {@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Default }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption.OptionType OptionType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setType(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_int(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setType_int(long __this__nativeId, int type);

/**
This variable holds the option type of the style option. The default value is {@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Default }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption.OptionType OptionType }. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final void setState(com.trolltech.qt.gui.QStyle.StateFlag ... state) {
        this.setState(new com.trolltech.qt.gui.QStyle.State(state));
    }
/**
This variable holds the style flags that are used when drawing the control. The default value is {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}, {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawPrimitive()}, {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawControl()}, {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) QStyle::drawComplexControl()}, and QStyle::State. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setState(com.trolltech.qt.gui.QStyle.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setState_State(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setState_State(long __this__nativeId, int state);

/**
This variable holds the style flags that are used when drawing the control. The default value is {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_None }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}, {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawPrimitive()}, {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) QStyle::drawControl()}, {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) QStyle::drawComplexControl()}, and QStyle::State. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyle.State state()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyle.State(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
This variable holds the font metrics that should be used when drawing text in the control. By default, the application's default font is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontMetrics(com.trolltech.qt.gui.QFontMetrics fontMetrics)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontMetrics_QFontMetrics(nativeId(), fontMetrics == null ? 0 : fontMetrics.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFontMetrics_QFontMetrics(long __this__nativeId, long fontMetrics);

/**
This variable holds the font metrics that should be used when drawing text in the control. By default, the application's default font is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontMetrics fontMetrics()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontMetrics(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFontMetrics __qt_fontMetrics(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOption fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOption(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOption array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOption clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOption __qt_clone(long __this_nativeId);
}
