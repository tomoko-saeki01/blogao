package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The Qt namespace contains miscellaneous identifiers used throughout the Qt library.
*/
@QtJambiGeneratedClass
public interface Qt
{
/**
This enum type defines the various cursors that can be used. <p>The standard arrow cursor is the default for widgets in a normal state.
*/

    public enum CursorShape implements com.trolltech.qt.QtEnumerator {
/**
See the description for details.   <br><center><img src=". /images/cursor-arrow.png"></center><br> The standard arrow cursor.
*/

        ArrowCursor(0),
/**
See the description for details.   <br><center><img src=". /images/cursor-uparrow.png"></center><br> An arrow pointing upwards toward the top of the screen.
*/

        UpArrowCursor(1),
/**
See the description for details.   <br><center><img src=". /images/cursor-cross.png"></center><br> A crosshair cursor, typically used to help the user accurately select a point on the screen.
*/

        CrossCursor(2),
/**
See the description for details.   <br><center><img src=". /images/cursor-wait.png"></center><br> An hourglass or watch cursor, usually shown during operations that prevent the user from interacting with the application.
*/

        WaitCursor(3),
/**
See the description for details.   <br><center><img src=". /images/cursor-ibeam.png"></center><br> A caret or ibeam cursor, indicating that a widget can accept and display text input.
*/

        IBeamCursor(4),
/**
See the description for details.   <br><center><img src=". /images/cursor-sizev.png"></center><br> A cursor used for elements that are used to vertically resize top-level windows.
*/

        SizeVerCursor(5),
/**
See the description for details.   <br><center><img src=". /images/cursor-sizeh.png"></center><br> A cursor used for elements that are used to horizontally resize top-level windows.
*/

        SizeHorCursor(6),
/**
See the description for details.   <br><center><img src=". /images/cursor-sizeb.png"></center><br> A cursor used for elements that are used to diagonally resize top-level windows at their top-right and bottom-left corners.
*/

        SizeBDiagCursor(7),
/**
See the description for details.   <br><center><img src=". /images/cursor-sizef.png"></center><br> A cursor used for elements that are used to diagonally resize top-level windows at their top-left and bottom-right corners.
*/

        SizeFDiagCursor(8),
/**
See the description for details.   <br><center><img src=". /images/cursor-sizeall.png"></center><br> A cursor used for elements that are used to resize top-level windows in any direction.
*/

        SizeAllCursor(9),
/**
 A blank/invisible cursor, typically used when the cursor shape needs to be hidden.
*/

        BlankCursor(10),
/**
See the description for details.   <br><center><img src=". /images/cursor-vsplit.png"></center><br> A cursor used for vertical splitters, indicating that a handle can be dragged horizontally to adjust the use of available space.
*/

        SplitVCursor(11),
/**
See the description for details.   <br><center><img src=". /images/cursor-hsplit.png"></center><br> A cursor used for horizontal splitters, indicating that a handle can be dragged vertically to adjust the use of available space.
*/

        SplitHCursor(12),
/**
See the description for details.   <br><center><img src=". /images/cursor-hand.png"></center><br> A pointing hand cursor that is typically used for clickable elements such as hyperlinks.
*/

        PointingHandCursor(13),
/**
See the description for details.   <br><center><img src=". /images/cursor-forbidden.png"></center><br> A slashed circle cursor, typically used during drag and drop operations to indicate that dragged content cannot be dropped on particular widgets or inside certain regions.
*/

        ForbiddenCursor(14),
/**
See the description for details.   <br><center><img src=". /images/cursor-whatsthis.png"></center><br> An arrow with a question mark, typically used to indicate the presence of What's This? help for a widget.
*/

        WhatsThisCursor(15),
/**
See the description for details.   <br><center><img src=". /images/cursor-wait.png"></center><br> An hourglass or watch cursor, usually shown during operations that allow the user to interact with the application while they are performed in the background.
*/

        BusyCursor(16),
/**
See the description for details.   <br><center><img src=". /images/cursor-openhand.png"></center><br> A cursor representing an open hand, typically used to indicate that the area under the cursor is the visible part of a canvas that the user can click and drag in order to scroll around.
*/

        OpenHandCursor(17),
/**
See the description for details.   <br><center><img src=". /images/cursor-closedhand.png"></center><br> A cursor representing a closed hand, typically used to indicate that a dragging operation is in progress that involves scrolling.
*/

        ClosedHandCursor(18),
/**

*/

        BitmapCursor(24),
        CustomCursor(25);

        CursorShape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$CursorShape constant with the specified <tt>int</tt>.</brief>
*/

        public static CursorShape resolve(int value) {
            return (CursorShape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ArrowCursor;
            case 1: return UpArrowCursor;
            case 2: return CrossCursor;
            case 3: return WaitCursor;
            case 4: return IBeamCursor;
            case 5: return SizeVerCursor;
            case 6: return SizeHorCursor;
            case 7: return SizeBDiagCursor;
            case 8: return SizeFDiagCursor;
            case 9: return SizeAllCursor;
            case 10: return BlankCursor;
            case 11: return SplitVCursor;
            case 12: return SplitHCursor;
            case 13: return PointingHandCursor;
            case 14: return ForbiddenCursor;
            case 15: return WhatsThisCursor;
            case 16: return BusyCursor;
            case 17: return OpenHandCursor;
            case 18: return ClosedHandCursor;
            case 24: return BitmapCursor;
            case 25: return CustomCursor;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type specifies a corner in a rectangle.
*/

    public enum Corner implements com.trolltech.qt.QtEnumerator {
/**
 The top-left corner of the rectangle.
*/

        TopLeftCorner(0),
/**
 The top-right corner of the rectangle.
*/

        TopRightCorner(1),
/**
 The bottom-left corner of the rectangle.
*/

        BottomLeftCorner(2),
/**
 The bottom-right corner of the rectangle.
*/

        BottomRightCorner(3);

        Corner(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$Corner constant with the specified <tt>int</tt>.</brief>
*/

        public static Corner resolve(int value) {
            return (Corner) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TopLeftCorner;
            case 1: return TopRightCorner;
            case 2: return BottomLeftCorner;
            case 3: return BottomRightCorner;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines three values to represent the three axes in the cartesian coordinate system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTransform#rotate(double, com.trolltech.qt.core.Qt.Axis) QTransform::rotate()}, and {@link com.trolltech.qt.gui.QTransform#rotateRadians(double, com.trolltech.qt.core.Qt.Axis) QTransform::rotateRadians()}. <br></DD></DT>
*/

    public enum Axis implements com.trolltech.qt.QtEnumerator {
/**
 The X axis.
*/

        XAxis(0),
/**
 The Y axis.
*/

        YAxis(1),
/**
 The Z axis.
*/

        ZAxis(2);

        Axis(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$Axis constant with the specified <tt>int</tt>.</brief>
*/

        public static Axis resolve(int value) {
            return (Axis) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return XAxis;
            case 1: return YAxis;
            case 2: return ZAxis;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This type is used to signify an object's orientation. Orientation is used with {@link com.trolltech.qt.gui.QScrollBar QScrollBar} for example.
*/

    public enum Orientation implements com.trolltech.qt.QtEnumerator {
/**

*/

        Horizontal(1),
/**

*/

        Vertical(2);

        Orientation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$Orientations with the specified <tt>com.trolltech.qt.core.Qt$Orientation[]</tt> Qt$Orientation values set.</brief>
*/

        public static Orientations createQFlags(Orientation ... values) {
            return new Orientations(values);
        }
/**
<brief>Returns the Qt$Orientation constant with the specified <tt>int</tt>.</brief>
*/

        public static Orientation resolve(int value) {
            return (Orientation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Horizontal;
            case 2: return Vertical;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Orientations extends com.trolltech.qt.QFlags<Orientation> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-Orientations with the specified <tt>com.trolltech.qt.core.Qt.Orientation[]</tt>. flags set.</brief>
*/

        public Orientations(Orientation ... args) { super(args); }
        public Orientations(int value) { setValue(value); }
    }
/**
Specifies the direction of Qt's layouts. Right-to-left layouts are necessary for certain languages, notably Arabic and Hebrew. <p><DT><b>See also:</b><br><DD>{@link QApplication#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) QApplication::setLayoutDirection()}, and {@link QWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) QWidget::setLayoutDirection()}. <br></DD></DT>
*/


    public enum LayoutDirection implements com.trolltech.qt.QtEnumerator {
/**
 Left-to-right layout.
*/

        LeftToRight(0),
/**
 Right-to-left layout.
*/

        RightToLeft(1);

        LayoutDirection(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$LayoutDirection constant with the specified <tt>int</tt>.</brief>
*/

        public static LayoutDirection resolve(int value) {
            return (LayoutDirection) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LeftToRight;
            case 1: return RightToLeft;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Background mode.
*/

    public enum BGMode implements com.trolltech.qt.QtEnumerator {
/**

*/

        TransparentMode(0),
/**

*/

        OpaqueMode(1);

        BGMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$BGMode constant with the specified <tt>int</tt>.</brief>
*/

        public static BGMode resolve(int value) {
            return (BGMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TransparentMode;
            case 1: return OpaqueMode;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines what happens to the aspect ratio when scaling an rectangle. <br><center><img src="../images/qimage-scaling.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#scale(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) QSize::scale()}, and {@link com.trolltech.qt.gui.QImage#scaled(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) QImage::scaled()}. <br></DD></DT>
*/

    public enum AspectRatioMode implements com.trolltech.qt.QtEnumerator {
/**
 The size is scaled freely. The aspect ratio is not preserved.
*/

        IgnoreAspectRatio(0),
/**
 The size is scaled to a rectangle as large as possible inside a given rectangle, preserving the aspect ratio.
*/

        KeepAspectRatio(1),
/**
 The size is scaled to a rectangle as small as possible outside a given rectangle, preserving the aspect ratio.
*/

        KeepAspectRatioByExpanding(2);

        AspectRatioMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$AspectRatioMode constant with the specified <tt>int</tt>.</brief>
*/

        public static AspectRatioMode resolve(int value) {
            return (AspectRatioMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return IgnoreAspectRatio;
            case 1: return KeepAspectRatio;
            case 2: return KeepAspectRatioByExpanding;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies where the ellipsis should appear when displaying texts that don't fit. {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideMiddle } is normally the most appropriate choice for URLs (e.g., "http://www.troll...ovingto/beijing/"), whereas {@link com.trolltech.qt.core.Qt.TextElideMode Qt::ElideRight } is appropriate for other strings (e.g., "Deploying Applications on Ma..."). <p><DT><b>See also:</b><br><DD>{@link QAbstractItemView#textElideMode() QAbstractItemView::textElideMode}, {@link com.trolltech.qt.gui.QFontMetrics#elidedText(java.lang.String, com.trolltech.qt.core.Qt.TextElideMode, int) QFontMetrics::elidedText()}, {@link com.trolltech.qt.core.Qt.AlignmentFlag AlignmentFlag }, and {@link QTabBar#elideMode() QTabBar::elideMode}. <br></DD></DT>
*/

    public enum TextElideMode implements com.trolltech.qt.QtEnumerator {
/**
 The ellipsis should appear at the beginning of the text.
*/

        ElideLeft(0),
/**
 The ellipsis should appear at the end of the text.
*/

        ElideRight(1),
/**
 The ellipsis should appear in the middle of the text.
*/

        ElideMiddle(2),
/**
 Ellipsis should NOT appear in the text.
*/

        ElideNone(3);

        TextElideMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$TextElideMode constant with the specified <tt>int</tt>.</brief>
*/

        public static TextElideMode resolve(int value) {
            return (TextElideMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ElideLeft;
            case 1: return ElideRight;
            case 2: return ElideMiddle;
            case 3: return ElideNone;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used by {@link com.trolltech.qt.gui.QPainter#drawRoundedRect(com.trolltech.qt.core.QRect, double, double) QPainter::drawRoundedRect()} and {@link com.trolltech.qt.gui.QPainterPath#addRoundedRect(com.trolltech.qt.core.QRectF, double, double) QPainterPath::addRoundedRect()} functions to specify the radii of rectangle corners with respect to the dimensions of the bounding rectangles specified.
*/

    public enum SizeMode implements com.trolltech.qt.QtEnumerator {
/**
 Specifies the size using absolute measurements.
*/

        AbsoluteSize(0),
/**
 Specifies the size relative to the bounding rectangle, typically using percentage measurements.
*/

        RelativeSize(1);

        SizeMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$SizeMode constant with the specified <tt>int</tt>.</brief>
*/

        public static SizeMode resolve(int value) {
            return (SizeMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AbsoluteSize;
            case 1: return RelativeSize;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<a name="window-flag"> This enum type is used to specify various window-system properties for the widget. They are fairly unusual but necessary in a few cases. Some of these flags depend on whether the underlying window manager supports them. <p>The main types are There are also a number of flags which you can use to customize the appearance of top-level windows. These have no effect on other windows: The <tt>CustomizeWindowHint</tt> flag is used to enable customization of the window controls. This flag must be set to allow the <tt>WindowTitleHint</tt>, <tt>WindowSystemMenuHint</tt>, <tt>WindowMinimizeButtonHint</tt>, <tt>WindowMaximizeButtonHint</tt> and <tt>WindowCloseButtonHint</tt> flags to be changed. Obsolete flags: <p><DT><b>See also:</b><br><DD>{@link QWidget#windowFlags() QWidget::windowFlags}, and {@link <a href="../widgets-windowflags.html">Window Flags Example</a>}. <br></DD></DT>
*/

    public enum
/**
 Indicates that the widget is a window, usually with a window system frame and a title bar, irrespective of whether the widget has a parent or not. Note that it is not possible to unset this flag if the widget does not have a parent.
*/
 WindowType implements com.trolltech.qt.QtEnumerator {
/**
 This is the default type for {@link com.trolltech.qt.gui.QWidget QWidget}. Widgets of this type are child widgets if they have a parent, and independent windows if they have no parent. See also {@link com.trolltech.qt.core.Qt.WindowType Qt::Window } and {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow }.
*/

        Widget(0),
        Window(1),
/**
 Indicates that the widget is a window that should be decorated as a dialog (i. ., typically no maximize or minimize buttons in the title bar). This is the default type for {@link com.trolltech.qt.gui.QDialog QDialog}. If you want to use it as a modal dialog, it should be launched from another window, or have a parent and used with the {@link QWidget#windowModality() QWidget::windowModality} property. If you make it modal, the dialog will prevent other top-level windows in the application from getting any input. We refer to a top-level window that has a parent as a secondary window.
*/

        Dialog(3),
/**
 Indicates that the widget is a Macintosh sheet.
*/

        Sheet(5),
/**
 Indicates that the widget is a Macintosh drawer.
*/

        Drawer(7),
/**
 Indicates that the widget is a pop-up top-level window, i.e. that it is modal, but has a window system frame appropriate for pop-up menus.
*/

        Popup(9),
/**
 Indicates that the widget is a tool window. A tool window is often a small window with a smaller than usual title bar and decoration, typically used for collections of tool buttons. It there is a parent, the tool window will always be kept on top of it. If there isn't a parent, you may consider using {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowStaysOnTopHint } as well. If the window system supports it, a tool window can be decorated with a somewhat lighter frame. It can also be combined with {@link com.trolltech.qt.core.Qt.WindowType Qt::FramelessWindowHint }. <br /><br /> On Mac OS X, tool windows correspond to the Floating class of windows. This means that the window lives on a level above normal windows; it impossible to put a normal window on top of it. By default, tool windows will disappear when the application is inactive. This can be controlled by the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_MacAlwaysShowToolWindow } attribute.
*/

        Tool(11),
/**
 Indicates that the widget is a tooltip. This is used internally to implement {@link QWidget#toolTip() tooltips}.
*/

        ToolTip(13),
/**
 Indicates that the window is a splash screen. This is the default type for {@link com.trolltech.qt.gui.QSplashScreen QSplashScreen}.
*/

        SplashScreen(15),
/**
 Indicates that this widget is the desktop. This is the type for {@link com.trolltech.qt.gui.QDesktopWidget QDesktopWidget}.
*/

        Desktop(17),
/**
 Indicates that this widget is a sub-window, such as a {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} widget.
*/

        SubWindow(18),
/**
 A mask for extracting the window type part of the window flags.
*/

        WindowType_Mask(255),
/**
 Gives the window a thin dialog border on Windows. This style is traditionally used for fixed-size dialogs.
*/

        MSWindowsFixedSizeDialogHint(256),
/**
 Gives the window its own display context on Windows.
*/

        MSWindowsOwnDC(512),
/**
 Bypass the window manager completely. This results in a borderless window that is not managed at all (i.e., no keyboard input unless you call {@link com.trolltech.qt.gui.QWidget#activateWindow() QWidget::activateWindow()} manually).
*/

        X11BypassWindowManagerHint(1024),
/**
 Produces a borderless window. The user cannot move or resize a borderless window via the window system. On X11, the result of the flag is dependent on the window manager and its ability to understand Motif and/or NETWM hints. Most existing modern window managers can handle this.
*/

        FramelessWindowHint(2048),
/**
 Gives the window a title bar.
*/

        WindowTitleHint(4096),
/**
 Adds a window system menu, and possibly a close button (for example on Mac). If you need to hide or show a close button, it is more portable to use <tt>WindowCloseButtonHint</tt>.
*/

        WindowSystemMenuHint(8192),
/**
 Adds a minimize button. On some platforms this implies {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } for it to work.
*/

        WindowMinimizeButtonHint(16384),
/**
 Adds a maximize button. On some platforms this implies {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } for it to work.
*/

        WindowMaximizeButtonHint(32768),
/**
 Adds a minimize and a maximize button. On some platforms this implies {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } for it to work.
*/

        WindowMinMaxButtonsHint(49152),
/**
 Adds a context help button to dialogs. On some platforms this implies {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } for it to work.
*/

        WindowContextHelpButtonHint(65536),
/**

*/

        WindowShadeButtonHint(131072),
/**
 Informs the window system that the window should stay on top of all other windows. Note that on some window managers on X11 you also have to pass {@link com.trolltech.qt.core.Qt.WindowType Qt::X11BypassWindowManagerHint } for this flag to work correctly.
*/

        WindowStaysOnTopHint(262144),
/**
 Adds an OK button to the window decoration of a dialog. Only supported for Windows CE.
*/

        WindowOkButtonHint(524288),
/**
 Adds a Cancel button to the window decoration of a dialog. Only supported for Windows CE.
*/

        WindowCancelButtonHint(1048576),
/**
 Turns off the default window title hints.
*/

        CustomizeWindowHint(33554432),
/**
 Informs the window system that the window should stay on bottom of all other windows. Note that on X11 this hint will work only in window managers that support _NET_WM_STATE_BELOW atom. If a window always on the bottom has a parent, the parent will also be left on the bottom. This window hint is currently not implemented for Mac OS X.
*/

        WindowStaysOnBottomHint(67108864),
/**
 Adds a close button. On some platforms this implies {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowSystemMenuHint } for it to work.
*/

        WindowCloseButtonHint(134217728),
/**
 On Mac OS X adds a tool bar button (i.e., the oblong button that is on the top right of windows that have toolbars.
*/

        MacWindowToolBarButtonHint(268435456),
/**
 Prevents the window and its children from automatically embedding themselves into a {@link com.trolltech.qt.gui.QGraphicsProxyWidget QGraphicsProxyWidget} if the parent widget is already embedded. You can set this flag if you want your widget to always be a toplevel widget on the desktop, regardless of whether the parent widget is embedded in a scene or not.
*/

        BypassGraphicsProxyWidget(536870912);

        WindowType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$WindowFlags with the specified <tt>com.trolltech.qt.core.Qt$WindowType[]</tt> Qt$WindowType values set.</brief>
*/

        public static WindowFlags createQFlags(WindowType ... values) {
            return new WindowFlags(values);
        }
/**
<brief>Returns the Qt$WindowType constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowType resolve(int value) {
            return (WindowType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Widget;
            case 1: return Window;
            case 3: return Dialog;
            case 5: return Sheet;
            case 7: return Drawer;
            case 9: return Popup;
            case 11: return Tool;
            case 13: return ToolTip;
            case 15: return SplashScreen;
            case 17: return Desktop;
            case 18: return SubWindow;
            case 255: return WindowType_Mask;
            case 256: return MSWindowsFixedSizeDialogHint;
            case 512: return MSWindowsOwnDC;
            case 1024: return X11BypassWindowManagerHint;
            case 2048: return FramelessWindowHint;
            case 4096: return WindowTitleHint;
            case 8192: return WindowSystemMenuHint;
            case 16384: return WindowMinimizeButtonHint;
            case 32768: return WindowMaximizeButtonHint;
            case 49152: return WindowMinMaxButtonsHint;
            case 65536: return WindowContextHelpButtonHint;
            case 131072: return WindowShadeButtonHint;
            case 262144: return WindowStaysOnTopHint;
            case 524288: return WindowOkButtonHint;
            case 1048576: return WindowCancelButtonHint;
            case 33554432: return CustomizeWindowHint;
            case 67108864: return WindowStaysOnBottomHint;
            case 134217728: return WindowCloseButtonHint;
            case 268435456: return MacWindowToolBarButtonHint;
            case 536870912: return BypassGraphicsProxyWidget;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class WindowFlags extends com.trolltech.qt.QFlags<WindowType> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-WindowFlags with the specified <tt>com.trolltech.qt.core.Qt.WindowType[]</tt>. flags set.</brief>
*/

        public WindowFlags(WindowType ... args) { super(args); }
        public WindowFlags(int value) { setValue(value); }
    }

    public static class ItemDataRole{
        public static final int DisplayRole = 0;
        public static final int DecorationRole = 1;
        public static final int EditRole = 2;
        public static final int ToolTipRole = 3;
        public static final int StatusTipRole = 4;
        public static final int WhatsThisRole = 5;
        public static final int FontRole = 6;
        public static final int TextAlignmentRole = 7;
        public static final int BackgroundRole = 8;
        public static final int ForegroundRole = 9;
        public static final int CheckStateRole = 10;
        public static final int AccessibleTextRole = 11;
        public static final int AccessibleDescriptionRole = 12;
        public static final int SizeHintRole = 13;
        public static final int DisplayPropertyRole = 27;
        public static final int DecorationPropertyRole = 28;
        public static final int ToolTipPropertyRole = 29;
        public static final int StatusTipPropertyRole = 30;
        public static final int WhatsThisPropertyRole = 31;
        public static final int UserRole = 32;
    } // end of enum ItemDataRole
/**
This enum describes how the items in a widget are sorted.
*/


    public enum SortOrder implements com.trolltech.qt.QtEnumerator {
/**
 The items are sorted ascending e.g. starts with 'AAA' ends with 'ZZZ' in Latin-1 locales
*/

        AscendingOrder(0),
/**
 The items are sorted descending e.g. starts with 'ZZZ' ends with 'AAA' in Latin-1 locales
*/

        DescendingOrder(1);

        SortOrder(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$SortOrder constant with the specified <tt>int</tt>.</brief>
*/

        public static SortOrder resolve(int value) {
            return (SortOrder) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AscendingOrder;
            case 1: return DescendingOrder;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the type of matches that can be used when searching for items in a model. <p><DT><b>See also:</b><br><DD>QString::compare(), and {@link com.trolltech.qt.core.QRegExp QRegExp}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum MatchFlag implements com.trolltech.qt.QtEnumerator {
/**
 Performs {@link com.trolltech.qt.QVariant QVariant}-based matching.
*/

        MatchExactly(0),
/**
 The search term is contained in the item.
*/

        MatchContains(1),
/**
 The search term matches the start of the item.
*/

        MatchStartsWith(2),
/**
 The search term matches the end of the item.
*/

        MatchEndsWith(3),
/**
 Performs string-based matching using a regular expression as the search term.
*/

        MatchRegExp(4),
/**
 Performs string-based matching using a string with wildcards as the search term.
*/

        MatchWildcard(5),
/**
 Performs string-based matching. String-based comparisons are case-insensitive unless the <tt>MatchCaseSensitive</tt> flag is also specified.
*/

        MatchFixedString(8),
/**
 The search is case sensitive.
*/

        MatchCaseSensitive(16),
/**
 Perform a search that wraps around, so that when the search reaches the last item in the model, it begins again at the first item and continues until all items have been examined.
*/

        MatchWrap(32),
/**
 Searches the entire hierarchy.
*/

        MatchRecursive(64);

        MatchFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$MatchFlags with the specified <tt>com.trolltech.qt.core.Qt$MatchFlag[]</tt> Qt$MatchFlag values set.</brief>
*/

        public static MatchFlags createQFlags(MatchFlag ... values) {
            return new MatchFlags(values);
        }
/**
<brief>Returns the Qt$MatchFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static MatchFlag resolve(int value) {
            return (MatchFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MatchExactly;
            case 1: return MatchContains;
            case 2: return MatchStartsWith;
            case 3: return MatchEndsWith;
            case 4: return MatchRegExp;
            case 5: return MatchWildcard;
            case 8: return MatchFixedString;
            case 16: return MatchCaseSensitive;
            case 32: return MatchWrap;
            case 64: return MatchRecursive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class MatchFlags extends com.trolltech.qt.QFlags<MatchFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-MatchFlags with the specified <tt>com.trolltech.qt.core.Qt.MatchFlag[]</tt>. flags set.</brief>
*/

        public MatchFlags(MatchFlag ... args) { super(args); }
        public MatchFlags(int value) { setValue(value); }
    }
/**
This enum type defines the pen join styles supported by Qt, i. . which joins between two connected lines can be drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-bevel.png"></center><br></td><td>  <br><center><img src="../images/qpen-miter.png"></center><br></td><td>  <br><center><img src="../images/qpen-roundjoin.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::BevelJoin }</td><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::MiterJoin }</td><td> {@link com.trolltech.qt.core.Qt.PenJoinStyle Qt::RoundJoin }</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen QPen}. <br></DD></DT>
*/


    public enum PenJoinStyle implements com.trolltech.qt.QtEnumerator {
/**
 The outer edges of the lines are extended to meet at an angle, and this area is filled.
*/

        MiterJoin(0),
/**
 The triangular notch between the two lines is filled.
*/

        BevelJoin(64),
/**
 A circular arc between the two lines is filled.
*/

        RoundJoin(128),
/**
 A miter join corresponding to the definition of a miter join in the {@link <a href="../http-www-w3-org-tr-svgmobile12.html">SVG 1.2 Tiny</a>} specification.
*/

        SvgMiterJoin(256),
        MPenJoinStyle(448);

        PenJoinStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$PenJoinStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static PenJoinStyle resolve(int value) {
            return (PenJoinStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MiterJoin;
            case 64: return BevelJoin;
            case 128: return RoundJoin;
            case 256: return SvgMiterJoin;
            case 448: return MPenJoinStyle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum CaseSensitivity implements com.trolltech.qt.QtEnumerator {
/**

*/

        CaseInsensitive(0),
/**

*/

        CaseSensitive(1);

        CaseSensitivity(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$CaseSensitivity constant with the specified <tt>int</tt>.</brief>
*/

        public static CaseSensitivity resolve(int value) {
            return (CaseSensitivity) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CaseInsensitive;
            case 1: return CaseSensitive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the brush styles supported by Qt, i. . the fill pattern of shapes drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. <br><center><img src="../images/brush-styles.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush QBrush}. <br></DD></DT>
*/

    public enum BrushStyle implements com.trolltech.qt.QtEnumerator {
/**
 No brush pattern.
*/

        NoBrush(0),
/**
 Uniform color.
*/

        SolidPattern(1),
/**
 Extremely dense brush pattern.
*/

        Dense1Pattern(2),
/**
 Very dense brush pattern.
*/

        Dense2Pattern(3),
/**
 Somewhat dense brush pattern.
*/

        Dense3Pattern(4),
/**
 Half dense brush pattern.
*/

        Dense4Pattern(5),
/**
 Somewhat sparse brush pattern.
*/

        Dense5Pattern(6),
/**
 Very sparse brush pattern.
*/

        Dense6Pattern(7),
/**
 Extremely sparse brush pattern.
*/

        Dense7Pattern(8),
/**
 Horizontal lines.
*/

        HorPattern(9),
/**
 Vertical lines.
*/

        VerPattern(10),
/**
 Crossing horizontal and vertical lines.
*/

        CrossPattern(11),
/**
 Backward diagonal lines.
*/

        BDiagPattern(12),
/**
 Forward diagonal lines.
*/

        FDiagPattern(13),
/**
 Crossing diagonal lines.
*/

        DiagCrossPattern(14),
/**
 Linear gradient (set using a dedicated {@link com.trolltech.qt.gui.QBrush QBrush} constructor).
*/

        LinearGradientPattern(15),
/**
 Radial gradient (set using a dedicated {@link com.trolltech.qt.gui.QBrush QBrush} constructor).
*/

        RadialGradientPattern(16),
/**
 Conical gradient (set using a dedicated {@link com.trolltech.qt.gui.QBrush QBrush} constructor).
*/

        ConicalGradientPattern(17),
/**
 Custom pattern (see {@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) QBrush::setTexture()}).
*/

        TexturePattern(24);

        BrushStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$BrushStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static BrushStyle resolve(int value) {
            return (BrushStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoBrush;
            case 1: return SolidPattern;
            case 2: return Dense1Pattern;
            case 3: return Dense2Pattern;
            case 4: return Dense3Pattern;
            case 5: return Dense4Pattern;
            case 6: return Dense5Pattern;
            case 7: return Dense6Pattern;
            case 8: return Dense7Pattern;
            case 9: return HorPattern;
            case 10: return VerPattern;
            case 11: return CrossPattern;
            case 12: return BDiagPattern;
            case 13: return FDiagPattern;
            case 14: return DiagCrossPattern;
            case 15: return LinearGradientPattern;
            case 16: return RadialGradientPattern;
            case 17: return ConicalGradientPattern;
            case 24: return TexturePattern;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ClipOperation implements com.trolltech.qt.QtEnumerator {
/**
 This operation turns clipping off.
*/

        NoClip(0),
/**
 Replaces the current clip path/rect/region with the one supplied in the function call.
*/

        ReplaceClip(1),
/**
 Intersects the current clip path/rect/region with the one supplied in the function call.
*/

        IntersectClip(2),
/**
 Unites the current clip path/rect/region with the one supplied in the function call.
*/

        UniteClip(3);

        ClipOperation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ClipOperation constant with the specified <tt>int</tt>.</brief>
*/

        public static ClipOperation resolve(int value) {
            return (ClipOperation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoClip;
            case 1: return ReplaceClip;
            case 2: return IntersectClip;
            case 3: return UniteClip;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum specifies why the focus changed. It will be passed through QWidget::setFocus and can be retrieved in the {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent} sent to the widget upon focus change. <p><DT><b>See also:</b><br><DD>{@link <a href="../focus.html">Keyboard Focus</a>}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum FocusReason implements com.trolltech.qt.QtEnumerator {
/**
 A mouse action occurred.
*/

        MouseFocusReason(0),
/**
 The Tab key was pressed.
*/

        TabFocusReason(1),
/**
 A Backtab occurred. The input for this may include the Shift or Control keys; e.g. Shift+Tab.
*/

        BacktabFocusReason(2),
/**
 The window system made this window either active or inactive.
*/

        ActiveWindowFocusReason(3),
/**
 The application opened/closed a pop-up that grabbed/released the keyboard focus.
*/

        PopupFocusReason(4),
/**
 The user typed a label's buddy shortcut
*/

        ShortcutFocusReason(5),
/**
 The menu bar took focus.
*/

        MenuBarFocusReason(6),
/**
 Another reason, usually application-specific.
*/

        OtherFocusReason(7),
        NoFocusReason(8);

        FocusReason(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$FocusReason constant with the specified <tt>int</tt>.</brief>
*/

        public static FocusReason resolve(int value) {
            return (FocusReason) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MouseFocusReason;
            case 1: return TabFocusReason;
            case 2: return BacktabFocusReason;
            case 3: return ActiveWindowFocusReason;
            case 4: return PopupFocusReason;
            case 5: return ShortcutFocusReason;
            case 6: return MenuBarFocusReason;
            case 7: return OtherFocusReason;
            case 8: return NoFocusReason;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ToolBarArea implements com.trolltech.qt.QtEnumerator {
/**

*/

        LeftToolBarArea(1),
/**

*/

        RightToolBarArea(2),
/**

*/

        TopToolBarArea(4),
/**

*/

        BottomToolBarArea(8),
        ToolBarArea_Mask(15),
/**

*/

        NoToolBarArea(0);

        ToolBarArea(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$ToolBarAreas with the specified <tt>com.trolltech.qt.core.Qt$ToolBarArea[]</tt> Qt$ToolBarArea values set.</brief>
*/

        public static ToolBarAreas createQFlags(ToolBarArea ... values) {
            return new ToolBarAreas(values);
        }
/**
<brief>Returns the Qt$ToolBarArea constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolBarArea resolve(int value) {
            return (ToolBarArea) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return LeftToolBarArea;
            case 2: return RightToolBarArea;
            case 4: return TopToolBarArea;
            case 8: return BottomToolBarArea;
            case 15: return ToolBarArea_Mask;
            case 0: return NoToolBarArea;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ToolBarAreas extends com.trolltech.qt.QFlags<ToolBarArea> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-ToolBarAreas with the specified <tt>com.trolltech.qt.core.Qt.ToolBarArea[]</tt>. flags set.</brief>
*/

        public ToolBarAreas(ToolBarArea ... args) { super(args); }
        public ToolBarAreas(int value) { setValue(value); }
    }

    @QtBlockedEnum
/**
The key names used by Qt. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QKeyEvent#key() QKeyEvent::key()}. <br></DD></DT>
*/

    public enum KeyboardModifier implements com.trolltech.qt.QtEnumerator {
        NoModifier(0),
        ShiftModifier(33554432),
        ControlModifier(67108864),
        AltModifier(134217728),
        MetaModifier(268435456),
        KeypadModifier(536870912),
        GroupSwitchModifier(1073741824),
        KeyboardModifierMask(-33554432);

        KeyboardModifier(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$KeyboardModifiers with the specified <tt>com.trolltech.qt.core.Qt$KeyboardModifier[]</tt> Qt$KeyboardModifier values set.</brief>
*/

        public static KeyboardModifiers createQFlags(KeyboardModifier ... values) {
            return new KeyboardModifiers(values);
        }
        public static KeyboardModifier resolve(int value) {
            return (KeyboardModifier) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoModifier;
            case 33554432: return ShiftModifier;
            case 67108864: return ControlModifier;
            case 134217728: return AltModifier;
            case 268435456: return MetaModifier;
            case 536870912: return KeypadModifier;
            case 1073741824: return GroupSwitchModifier;
            case -33554432: return KeyboardModifierMask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class KeyboardModifiers extends com.trolltech.qt.QFlags<KeyboardModifier> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-KeyboardModifiers with the specified <tt>com.trolltech.qt.core.Qt.KeyboardModifier[]</tt>. flags set.</brief>
*/

        public KeyboardModifiers(KeyboardModifier ... args) { super(args); }
        public KeyboardModifiers(int value) { setValue(value); }
    }

    
/**
This enum describes the types of whitespace mode that are used by the {@link com.trolltech.qt.gui.QTextDocument QTextDocument} class to meet the requirements of different kinds of textual information. This enum is defined in the <tt>&lt;QTextDocument&gt;</tt> header file.
*/
@QtBlockedEnum
    public enum WhiteSpaceMode implements com.trolltech.qt.QtEnumerator {
/**
 The whitespace mode used to display normal word wrapped text in paragraphs.
*/

        WhiteSpaceNormal(0),
/**
 A preformatted text mode in which whitespace is reproduced exactly.
*/

        WhiteSpacePre(1),
/**

*/

        WhiteSpaceNoWrap(2),
        WhiteSpaceModeUndefined(-1);

        WhiteSpaceMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$WhiteSpaceMode constant with the specified <tt>int</tt>.</brief>
*/

        public static WhiteSpaceMode resolve(int value) {
            return (WhiteSpaceMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WhiteSpaceNormal;
            case 1: return WhiteSpacePre;
            case 2: return WhiteSpaceNoWrap;
            case -1: return WhiteSpaceModeUndefined;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum DayOfWeek implements com.trolltech.qt.QtEnumerator {
/**

*/

        Monday(1),
/**

*/

        Tuesday(2),
/**

*/

        Wednesday(3),
/**

*/

        Thursday(4),
/**

*/

        Friday(5),
/**

*/

        Saturday(6),
/**

*/

        Sunday(7);

        DayOfWeek(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$DayOfWeek constant with the specified <tt>int</tt>.</brief>
*/

        public static DayOfWeek resolve(int value) {
            return (DayOfWeek) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Monday;
            case 2: return Tuesday;
            case 3: return Wednesday;
            case 4: return Thursday;
            case 5: return Friday;
            case 6: return Saturday;
            case 7: return Sunday;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum can be used to specify event priorities. Note that these values are provided purely for convenience, since event priorities can be any value between <tt>INT_MAX</tt> and <tt>INT_MIN</tt>, inclusive. For example, you can define custom priorities as being relative to each other: <pre class="snippet">
enum CustomEventPriority
{
    // An important event
    ImportantEventPriority = Qt::HighEventPriority,

    // A more important event
    MoreImportantEventPriority = ImportantEventPriority + 1,

    // A critical event
    CriticalEventPriority = 100 * MoreImportantEventPriority,

    // Not that important
    StatusEventPriority = Qt::LowEventPriority,

    // These are less important than Status events
    IdleProcessingDoneEventPriority = StatusEventPriority - 1
};
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::postEvent()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum EventPriority implements com.trolltech.qt.QtEnumerator {
/**
 Events with this priority are sent before events with {@link com.trolltech.qt.core.Qt.EventPriority NormalEventPriority } or {@link com.trolltech.qt.core.Qt.EventPriority LowEventPriority }.
*/

        HighEventPriority(1),
/**
 Events with this priority are sent after events with {@link com.trolltech.qt.core.Qt.EventPriority HighEventPriority }, but before events with {@link com.trolltech.qt.core.Qt.EventPriority LowEventPriority }.
*/

        NormalEventPriority(0),
/**
 Events with this priority are sent after events with {@link com.trolltech.qt.core.Qt.EventPriority HighEventPriority } or {@link com.trolltech.qt.core.Qt.EventPriority NormalEventPriority }.
*/

        LowEventPriority(-1);

        EventPriority(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$EventPriority constant with the specified <tt>int</tt>.</brief>
*/

        public static EventPriority resolve(int value) {
            return (EventPriority) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return HighEventPriority;
            case 0: return NormalEventPriority;
            case -1: return LowEventPriority;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<b>Note.</b> For <tt>ISODate</tt> formats, each <tt>Y</tt>, <tt>M</tt> and <tt>D</tt> represents a single digit of the year, month and day used to specify the date. Each <tt>H</tt>, <tt>M</tt> and <tt>S</tt> represents a single digit of the hour, minute and second used to specify the time. The presence of a literal <tt>T</tt> character is used to separate the date and time when both are specified.
*/

    public enum DateFormat implements com.trolltech.qt.QtEnumerator {
/**
 The default Qt format, which includes the day and month name, the day number in the month, and the year in full. The day and month names will be short, localized names. This is basically equivalent to using the date format string, "ddd MMM d yyyy". See {@link com.trolltech.qt.core.QDate#toString() QDate::toString()} for more information.
*/

        TextDate(0),
/**
 ISO 8601 extended format. either <tt>YYYY-MM-DD</tt> for dates or <tt>YYYY-MM-DDTHH:MM:SS</tt> for combined dates and times.
*/

        ISODate(1),
/**
 This enum value is deprecated. Use {@link com.trolltech.qt.core.Qt.DateFormat Qt::SystemLocaleShortDate } instead (or {@link com.trolltech.qt.core.Qt.DateFormat Qt::SystemLocaleLongDate } if you want long dates).
*/

        SystemLocaleDate(2),
/**
 This enum value is deprecated. Use {@link com.trolltech.qt.core.Qt.DateFormat Qt::DefaultLocaleShortDate } instead (or {@link com.trolltech.qt.core.Qt.DateFormat Qt::DefaultLocaleLongDate } if you want long dates).
*/

        LocaleDate(3),
/**
 The {@link com.trolltech.qt.core.QLocale.FormatType short format } used by the {@link com.trolltech.qt.core.QLocale#system() operating system}.
*/

        SystemLocaleShortDate(4),
/**
 The {@link com.trolltech.qt.core.QLocale.FormatType long format } used by the {@link com.trolltech.qt.core.QLocale#system() operating system}.
*/

        SystemLocaleLongDate(5),
/**
 The {@link com.trolltech.qt.core.QLocale.FormatType short format } specified by the {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) application's locale}.
*/

        DefaultLocaleShortDate(6),
/**
 The {@link com.trolltech.qt.core.QLocale.FormatType long format } used by the {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) application's locale}.
*/

        DefaultLocaleLongDate(7);

        DateFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$DateFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static DateFormat resolve(int value) {
            return (DateFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return TextDate;
            case 1: return ISODate;
            case 2: return SystemLocaleDate;
            case 3: return LocaleDate;
            case 4: return SystemLocaleShortDate;
            case 5: return SystemLocaleLongDate;
            case 6: return DefaultLocaleShortDate;
            case 7: return DefaultLocaleLongDate;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies the behavior of the {@link com.trolltech.qt.gui.QPixmap#createMaskFromColor(com.trolltech.qt.gui.QColor) QPixmap::createMaskFromColor()} and {@link com.trolltech.qt.gui.QImage#createMaskFromColor(int) QImage::createMaskFromColor()} functions.
*/

    public enum MaskMode implements com.trolltech.qt.QtEnumerator {
/**
 Creates a mask where all pixels matching the given color are opaque.
*/

        MaskInColor(0),
/**
 Creates a mask where all pixels matching the given color are transparent.
*/

        MaskOutColor(1);

        MaskMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$MaskMode constant with the specified <tt>int</tt>.</brief>
*/

        public static MaskMode resolve(int value) {
            return (MaskMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MaskInColor;
            case 1: return MaskOutColor;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the available UI effects. <p>By default, Qt will try to use the platform specific desktop settings for each effect. Use the {@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) QApplication::setDesktopSettingsAware()} function (passing <tt>false</tt> as argument) to prevent this, and the {@link com.trolltech.qt.gui.QApplication#setEffectEnabled(com.trolltech.qt.core.Qt.UIEffect) QApplication::setEffectEnabled()} to enable or disable a particular effect. <p>Note that all effects are disabled on screens running at less than 16-bit color depth. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setEffectEnabled(com.trolltech.qt.core.Qt.UIEffect) QApplication::setEffectEnabled()}, and {@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) QApplication::setDesktopSettingsAware()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum UIEffect implements com.trolltech.qt.QtEnumerator {
        UI_General(0),
/**
 Show animated menus.
*/

        UI_AnimateMenu(1),
/**
 Show faded menus.
*/

        UI_FadeMenu(2),
/**
 Show animated comboboxes.
*/

        UI_AnimateCombo(3),
/**
 Show tooltip animations.
*/

        UI_AnimateTooltip(4),
/**
 Show tooltip fading effects.
*/

        UI_FadeTooltip(5),
/**
 Reserved
*/

        UI_AnimateToolBox(6);

        UIEffect(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$UIEffect constant with the specified <tt>int</tt>.</brief>
*/

        public static UIEffect resolve(int value) {
            return (UIEffect) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UI_General;
            case 1: return UI_AnimateMenu;
            case 2: return UI_FadeMenu;
            case 3: return UI_AnimateCombo;
            case 4: return UI_AnimateTooltip;
            case 5: return UI_FadeTooltip;
            case 6: return UI_AnimateToolBox;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the various policies a widget can have with respect to showing a context menu.
*/

    public enum ContextMenuPolicy implements com.trolltech.qt.QtEnumerator {
/**
 the widget does not feature a context menu, context menu handling is deferred to the widget's parent.
*/

        NoContextMenu(0),
/**
 the widget's {@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) QWidget::contextMenuEvent()} handler is called.
*/

        DefaultContextMenu(1),
/**
 the widget displays its {@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()} as context menu.
*/

        ActionsContextMenu(2),
/**
 the widget emits the {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested QWidget::customContextMenuRequested() } signal.
*/

        CustomContextMenu(3),
/**
 the widget does not feature a context menu, and in contrast to <tt>NoContextMenu</tt>, the handling is not deferred to the widget's parent. This means that all right mouse button events are guaranteed to be delivered to the widget itself through mousePressEvent(), and mouseReleaseEvent().
*/

        PreventContextMenu(4);

        ContextMenuPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ContextMenuPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static ContextMenuPolicy resolve(int value) {
            return (ContextMenuPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoContextMenu;
            case 1: return DefaultContextMenu;
            case 2: return ActionsContextMenu;
            case 3: return CustomContextMenu;
            case 4: return PreventContextMenu;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
An anchor has one or more of the following attributes.
*/
@QtBlockedEnum
    public enum AnchorAttribute implements com.trolltech.qt.QtEnumerator {
/**
 the name attribute of the anchor. This attribute is used when scrolling to an anchor in the document.
*/

        AnchorName(0),
/**
 the href attribute of the anchor. This attribute is used when a link is clicked to determine what content to load.
*/

        AnchorHref(1);

        AnchorAttribute(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$AnchorAttribute constant with the specified <tt>int</tt>.</brief>
*/

        public static AnchorAttribute resolve(int value) {
            return (AnchorAttribute) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AnchorName;
            case 1: return AnchorHref;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type describes the various modes of {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea}'s scroll bars. (The modes for the horizontal and vertical scroll bars are independent.)
*/

    public enum ScrollBarPolicy implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea} shows a scroll bar when the content is too large to fit and not otherwise. This is the default.
*/

        ScrollBarAsNeeded(0),
/**
 {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea} never shows a scroll bar.
*/

        ScrollBarAlwaysOff(1),
/**
 {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea} always shows a scroll bar.
*/

        ScrollBarAlwaysOn(2);

        ScrollBarPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ScrollBarPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static ScrollBarPolicy resolve(int value) {
            return (ScrollBarPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ScrollBarAsNeeded;
            case 1: return ScrollBarAlwaysOff;
            case 2: return ScrollBarAlwaysOn;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
The style of the tool button, describing how the button's text and icon should be displayed.
*/

    public enum ToolButtonStyle implements com.trolltech.qt.QtEnumerator {
/**
 Only display the icon.
*/

        ToolButtonIconOnly(0),
/**
 Only display the text.
*/

        ToolButtonTextOnly(1),
/**
 The text appears beside the icon.
*/

        ToolButtonTextBesideIcon(2),
/**
 The text appears under the icon.
*/

        ToolButtonTextUnderIcon(3);

        ToolButtonStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ToolButtonStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolButtonStyle resolve(int value) {
            return (ToolButtonStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ToolButtonIconOnly;
            case 1: return ToolButtonTextOnly;
            case 2: return ToolButtonTextBesideIcon;
            case 3: return ToolButtonTextUnderIcon;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum type is used to define some modifier flags. Some of these flags only make sense in the context of printing: You can use as many modifier flags as you want, except that {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextSingleLine } and {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextWordWrap } cannot be combined. <p>Flags that are inappropriate for a given use are generally ignored.
*/
@QtBlockedEnum
    public enum TextFlag implements com.trolltech.qt.QtEnumerator {
/**
 Treats all whitespace as spaces and prints just one line.
*/

        TextSingleLine(256),
/**
 If it's impossible to stay within the given bounds, it prints outside.
*/

        TextDontClip(512),
/**
 Makes the U+0009 (ASCII tab) character move to the next tab stop.
*/

        TextExpandTabs(1024),
/**
 Displays the string "&P" as P (see {@link <a href="../porting4.html">QButton</a>} for an example). For an ampersand, use "&&".
*/

        TextShowMnemonic(2048),
/**
 Breaks lines at appropriate points, e.g. at word boundaries.
*/

        TextWordWrap(4096),
/**
 Breaks lines anywhere, even within words.
*/

        TextWrapAnywhere(8192),
/**
 Treat this text as "hidden" and don't print it.
*/

        TextDontPrint(16384),
        TextIncludeTrailingSpaces(134217728),
/**
 Same as {@link com.trolltech.qt.core.Qt.TextFlag Qt::TextShowMnemonic } but doesn't draw the underlines.
*/

        TextHideMnemonic(32768),
/**
 Ensures that text lines are justified.
*/

        TextJustificationForced(65536),
        TextForceLeftToRight(131072),
        TextForceRightToLeft(262144);

        TextFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$TextFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static TextFlag resolve(int value) {
            return (TextFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 256: return TextSingleLine;
            case 512: return TextDontClip;
            case 1024: return TextExpandTabs;
            case 2048: return TextShowMnemonic;
            case 4096: return TextWordWrap;
            case 8192: return TextWrapAnywhere;
            case 16384: return TextDontPrint;
            case 134217728: return TextIncludeTrailingSpaces;
            case 32768: return TextHideMnemonic;
            case 65536: return TextJustificationForced;
            case 131072: return TextForceLeftToRight;
            case 262144: return TextForceRightToLeft;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used in {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} and {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} to specify how items are selected, or how to determine if a shapes and items collide. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#items() QGraphicsScene::items()}, {@link com.trolltech.qt.gui.QGraphicsScene#collidingItems(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::collidingItems()}, {@link com.trolltech.qt.gui.QGraphicsView#items() QGraphicsView::items()}, {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsItem::collidesWithItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithPath(com.trolltech.qt.gui.QPainterPath) QGraphicsItem::collidesWithPath()}. <br></DD></DT>
*/

    public enum ItemSelectionMode implements com.trolltech.qt.QtEnumerator {
/**
 The output list contains only items whose {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape} is fully contained inside the selection area. Items that intersect with the area's outline are not included.
*/

        ContainsItemShape(0),
/**
 The output list contains both items whose {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape} is fully contained inside the selection area, and items that intersect with the area's outline. This is a common mode for rubber band selection.
*/

        IntersectsItemShape(1),
/**
 The output list contains only items whose {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() bounding rectangle} is fully contained inside the selection area. Items that intersect with the area's outline are not included.
*/

        ContainsItemBoundingRect(2),
/**
 The output list contains both items whose {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() bounding rectangle} is fully contained inside the selection area, and items that intersect with the area's outline. This method is commonly used for determining areas that need redrawing.
*/

        IntersectsItemBoundingRect(3);

        ItemSelectionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ItemSelectionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemSelectionMode resolve(int value) {
            return (ItemSelectionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ContainsItemShape;
            case 1: return IntersectsItemShape;
            case 2: return ContainsItemBoundingRect;
            case 3: return IntersectsItemBoundingRect;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used by {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) QGraphicsLayoutItem::sizeHint()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) QGraphicsLayoutItem::sizeHint()}. <br></DD></DT>
*/

    public enum SizeHint implements com.trolltech.qt.QtEnumerator {
/**
 is used to specify the minimum size of a graphics layout item.
*/

        MinimumSize(0),
/**
 is used to specify the preferred size of a graphics layout item.
*/

        PreferredSize(1),
/**
 is used to specify the maximum size of a graphics layout item.
*/

        MaximumSize(2),
/**
 is used to specify the minimum descent of a text string in a graphics layout item.
*/

        MinimumDescent(3),
        NSizeHints(4);

        SizeHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$SizeHint constant with the specified <tt>int</tt>.</brief>
*/

        public static SizeHint resolve(int value) {
            return (SizeHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MinimumSize;
            case 1: return PreferredSize;
            case 2: return MaximumSize;
            case 3: return MinimumDescent;
            case 4: return NSizeHints;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Key implements com.trolltech.qt.QtEnumerator {
/**

*/

/**

*/

        Key_Escape(16777216),
/**

*/

/**

*/

        Key_Tab(16777217),
/**

*/

/**

*/

/**

*/

        Key_Backtab(16777218),
/**

*/

        Key_Backspace(16777219),
/**

*/

/**

*/

        Key_Return(16777220),
/**
 Typically located on the keypad.
*/

        Key_Enter(16777221),
/**

*/

/**

*/

        Key_Insert(16777222),
/**

*/

/**

*/

        Key_Delete(16777223),
/**

*/

/**

*/

        Key_Pause(16777224),
/**

*/

        Key_Print(16777225),
/**

*/

/**

*/

        Key_SysReq(16777226),
/**

*/

/**

*/

        Key_Clear(16777227),
/**

*/

/**

*/

        Key_Home(16777232),
/**

*/

        Key_End(16777233),
/**

*/

/**

*/

        Key_Left(16777234),
/**

*/

/**

*/

        Key_Up(16777235),
/**

*/

        Key_Right(16777236),
/**

*/

        Key_Down(16777237),
/**

*/

        Key_PageUp(16777238),
/**

*/

        Key_PageDown(16777239),
/**

*/

        Key_Shift(16777248),
/**
 On Mac OS X, this corresponds to the Command keys.
*/

        Key_Control(16777249),
/**

*/

/**
 On Mac OS X, this corresponds to the Control keys. On Windows keyboards, this key is mapped to the Windows key.
*/

        Key_Meta(16777250),
/**

*/

/**

*/

        Key_Alt(16777251),
/**

*/

        Key_CapsLock(16777252),
/**

*/

/**

*/

        Key_NumLock(16777253),
/**

*/

        Key_ScrollLock(16777254),
/**

*/

/**

*/

        Key_F1(16777264),
/**

*/

        Key_F2(16777265),
/**

*/

        Key_F3(16777266),
/**

*/

        Key_F4(16777267),
/**

*/

        Key_F5(16777268),
/**

*/

        Key_F6(16777269),
/**

*/

        Key_F7(16777270),
/**

*/

        Key_F8(16777271),
/**

*/

        Key_F9(16777272),
/**

*/

        Key_F10(16777273),
/**

*/

        Key_F11(16777274),
/**

*/

        Key_F12(16777275),
/**

*/

        Key_F13(16777276),
/**

*/

        Key_F14(16777277),
/**

*/

        Key_F15(16777278),
/**

*/

        Key_F16(16777279),
/**

*/

        Key_F17(16777280),
/**

*/

        Key_F18(16777281),
/**

*/

        Key_F19(16777282),
/**

*/

        Key_F20(16777283),
/**

*/

        Key_F21(16777284),
/**

*/

        Key_F22(16777285),
/**

*/

        Key_F23(16777286),
/**

*/

        Key_F24(16777287),
/**

*/

        Key_F25(16777288),
/**

*/

        Key_F26(16777289),
/**

*/

        Key_F27(16777290),
/**

*/

        Key_F28(16777291),
/**

*/

        Key_F29(16777292),
/**

*/

        Key_F30(16777293),
/**

*/

        Key_F31(16777294),
/**

*/

        Key_F32(16777295),
/**

*/

        Key_F33(16777296),
/**

*/

        Key_F34(16777297),
/**

*/

        Key_F35(16777298),
/**

*/

        Key_Super_L(16777299),
/**

*/

        Key_Super_R(16777300),
/**

*/

        Key_Menu(16777301),
/**

*/

        Key_Hyper_L(16777302),
/**

*/

        Key_Hyper_R(16777303),
/**

*/

        Key_Help(16777304),
/**

*/

        Key_Direction_L(16777305),
/**

*/

        Key_Direction_R(16777312),
/**

*/

        Key_Space(32),
/**

*/

        Key_Exclam(33),
/**

*/

/**

*/

        Key_QuoteDbl(34),
/**

*/

        Key_NumberSign(35),
/**

*/

        Key_Dollar(36),
/**

*/

        Key_Percent(37),
/**

*/

        Key_Ampersand(38),
/**

*/

        Key_Apostrophe(39),
/**

*/

        Key_ParenLeft(40),
/**

*/

        Key_ParenRight(41),
/**

*/

        Key_Asterisk(42),
/**

*/

        Key_Plus(43),
/**

*/

        Key_Comma(44),
/**

*/

        Key_Minus(45),
/**

*/

        Key_Period(46),
/**

*/

        Key_Slash(47),
/**

*/

        Key_0(48),
/**

*/

        Key_1(49),
/**

*/

        Key_2(50),
/**

*/

        Key_3(51),
/**

*/

        Key_4(52),
/**

*/

        Key_5(53),
/**

*/

        Key_6(54),
/**

*/

        Key_7(55),
/**

*/

        Key_8(56),
/**

*/

        Key_9(57),
/**

*/

        Key_Colon(58),
/**

*/

        Key_Semicolon(59),
/**

*/

        Key_Less(60),
/**

*/

        Key_Equal(61),
/**

*/

/**

*/

        Key_Greater(62),
/**

*/

        Key_Question(63),
/**

*/

        Key_At(64),
        Key_A(65),
        Key_B(66),
        Key_C(67),
        Key_D(68),
        Key_E(69),
        Key_F(70),
        Key_G(71),
        Key_H(72),
        Key_I(73),
/**

*/

        Key_J(74),
/**

*/

        Key_K(75),
        Key_L(76),
        Key_M(77),
        Key_N(78),
/**

*/

        Key_O(79),
        Key_P(80),
        Key_Q(81),
        Key_R(82),
        Key_S(83),
        Key_T(84),
        Key_U(85),
/**

*/

        Key_V(86),
/**

*/

        Key_W(87),
/**

*/

        Key_X(88),
/**

*/

        Key_Y(89),
/**

*/

        Key_Z(90),
/**

*/

        Key_BracketLeft(91),
/**

*/

        Key_Backslash(92),
/**

*/

        Key_BracketRight(93),
/**

*/

        Key_AsciiCircum(94),
/**

*/

        Key_Underscore(95),
/**

*/

        Key_QuoteLeft(96),
/**

*/

        Key_BraceLeft(123),
/**

*/

        Key_Bar(124),
/**

*/

        Key_BraceRight(125),
/**

*/

        Key_AsciiTilde(126),
/**

*/

        Key_nobreakspace(160),
/**

*/

        Key_exclamdown(161),
/**

*/

        Key_cent(162),
/**

*/

        Key_sterling(163),
/**

*/

        Key_currency(164),
/**

*/

        Key_yen(165),
/**

*/

        Key_brokenbar(166),
/**

*/

        Key_section(167),
/**

*/

        Key_diaeresis(168),
/**

*/

        Key_copyright(169),
/**

*/

        Key_ordfeminine(170),
/**

*/

        Key_guillemotleft(171),
/**

*/

        Key_notsign(172),
/**

*/

        Key_hyphen(173),
/**

*/

        Key_registered(174),
/**

*/

        Key_macron(175),
/**

*/

        Key_degree(176),
/**

*/

        Key_plusminus(177),
/**

*/

        Key_twosuperior(178),
/**

*/

        Key_threesuperior(179),
/**

*/

        Key_acute(180),
/**

*/

        Key_mu(181),
/**

*/

        Key_paragraph(182),
/**

*/

        Key_periodcentered(183),
/**

*/

        Key_cedilla(184),
/**

*/

        Key_onesuperior(185),
/**

*/

        Key_masculine(186),
/**

*/

        Key_guillemotright(187),
/**

*/

        Key_onequarter(188),
/**

*/

        Key_onehalf(189),
/**

*/

        Key_threequarters(190),
/**

*/

        Key_questiondown(191),
/**

*/

        Key_Agrave(192),
/**

*/

        Key_Aacute(193),
/**

*/

        Key_Acircumflex(194),
/**

*/

        Key_Atilde(195),
/**

*/

        Key_Adiaeresis(196),
/**

*/

        Key_Aring(197),
/**

*/

        Key_AE(198),
/**

*/

        Key_Ccedilla(199),
/**

*/

        Key_Egrave(200),
/**

*/

        Key_Eacute(201),
/**

*/

        Key_Ecircumflex(202),
/**

*/

        Key_Ediaeresis(203),
/**

*/

        Key_Igrave(204),
/**

*/

        Key_Iacute(205),
/**

*/

        Key_Icircumflex(206),
/**

*/

        Key_Idiaeresis(207),
/**

*/

        Key_ETH(208),
/**

*/

        Key_Ntilde(209),
/**

*/

        Key_Ograve(210),
/**

*/

        Key_Oacute(211),
/**

*/

        Key_Ocircumflex(212),
/**

*/

        Key_Otilde(213),
/**

*/

        Key_Odiaeresis(214),
/**

*/

        Key_multiply(215),
/**

*/

        Key_Ooblique(216),
/**

*/

        Key_Ugrave(217),
/**

*/

        Key_Uacute(218),
/**

*/

        Key_Ucircumflex(219),
/**

*/

        Key_Udiaeresis(220),
/**

*/

        Key_Yacute(221),
/**

*/

        Key_THORN(222),
/**

*/

        Key_ssharp(223),
/**

*/

        Key_division(247),
/**

*/

        Key_ydiaeresis(255),
/**
 On Windows, when the KeyDown event for this key is sent, the Ctrl+Alt modifiers are also set.
*/

        Key_AltGr(16781571),
/**

*/

        Key_Multi_key(16781600),
/**

*/

        Key_Codeinput(16781623),
/**

*/

        Key_SingleCandidate(16781628),
/**

*/

        Key_MultipleCandidate(16781629),
/**

*/

        Key_PreviousCandidate(16781630),
/**

*/

        Key_Mode_switch(16781694),
/**

*/

        Key_Kanji(16781601),
/**

*/

        Key_Muhenkan(16781602),
/**

*/

        Key_Henkan(16781603),
/**

*/

        Key_Romaji(16781604),
/**

*/

        Key_Hiragana(16781605),
/**

*/

        Key_Katakana(16781606),
/**

*/

        Key_Hiragana_Katakana(16781607),
/**

*/

        Key_Zenkaku(16781608),
/**

*/

        Key_Hankaku(16781609),
/**

*/

        Key_Zenkaku_Hankaku(16781610),
/**

*/

        Key_Touroku(16781611),
/**

*/

        Key_Massyo(16781612),
/**

*/

        Key_Kana_Lock(16781613),
/**

*/

        Key_Kana_Shift(16781614),
/**

*/

        Key_Eisu_Shift(16781615),
/**

*/

        Key_Eisu_toggle(16781616),
/**

*/

        Key_Hangul(16781617),
/**

*/

        Key_Hangul_Start(16781618),
/**

*/

        Key_Hangul_End(16781619),
/**

*/

        Key_Hangul_Hanja(16781620),
/**

*/

        Key_Hangul_Jamo(16781621),
/**

*/

        Key_Hangul_Romaja(16781622),
/**

*/

        Key_Hangul_Jeonja(16781624),
/**

*/

        Key_Hangul_Banja(16781625),
/**

*/

        Key_Hangul_PreHanja(16781626),
/**

*/

        Key_Hangul_PostHanja(16781627),
/**

*/

        Key_Hangul_Special(16781631),
/**

*/

        Key_Dead_Grave(16781904),
/**

*/

        Key_Dead_Acute(16781905),
/**

*/

        Key_Dead_Circumflex(16781906),
/**

*/

        Key_Dead_Tilde(16781907),
/**

*/

        Key_Dead_Macron(16781908),
/**

*/

        Key_Dead_Breve(16781909),
/**

*/

        Key_Dead_Abovedot(16781910),
/**

*/

        Key_Dead_Diaeresis(16781911),
/**

*/

        Key_Dead_Abovering(16781912),
/**

*/

        Key_Dead_Doubleacute(16781913),
/**

*/

        Key_Dead_Caron(16781914),
/**

*/

        Key_Dead_Cedilla(16781915),
/**

*/

        Key_Dead_Ogonek(16781916),
/**

*/

        Key_Dead_Iota(16781917),
/**

*/

        Key_Dead_Voiced_Sound(16781918),
/**

*/

        Key_Dead_Semivoiced_Sound(16781919),
/**

*/

        Key_Dead_Belowdot(16781920),
/**

*/

        Key_Dead_Hook(16781921),
/**

*/

        Key_Dead_Horn(16781922),
        Key_Back(16777313),
/**

*/

        Key_Forward(16777314),
/**

*/

        Key_Stop(16777315),
/**

*/

        Key_Refresh(16777316),
/**

*/

        Key_VolumeDown(16777328),
/**

*/

        Key_VolumeMute(16777329),
/**

*/

        Key_VolumeUp(16777330),
/**

*/

        Key_BassBoost(16777331),
/**

*/

        Key_BassUp(16777332),
/**

*/

        Key_BassDown(16777333),
/**

*/

        Key_TrebleUp(16777334),
/**

*/

        Key_TrebleDown(16777335),
/**

*/

        Key_MediaPlay(16777344),
/**

*/

        Key_MediaStop(16777345),
/**

*/

        Key_MediaPrevious(16777346),
/**

*/

        Key_MediaNext(16777347),
/**

*/

        Key_MediaRecord(16777348),
/**

*/

        Key_HomePage(16777360),
/**

*/

        Key_Favorites(16777361),
/**

*/

        Key_Search(16777362),
/**

*/

        Key_Standby(16777363),
/**

*/

        Key_OpenUrl(16777364),
/**

*/

        Key_LaunchMail(16777376),
/**

*/

        Key_LaunchMedia(16777377),
/**

*/

        Key_Launch0(16777378),
/**

*/

        Key_Launch1(16777379),
/**

*/

        Key_Launch2(16777380),
/**

*/

        Key_Launch3(16777381),
/**

*/

        Key_Launch4(16777382),
/**

*/

        Key_Launch5(16777383),
/**

*/

        Key_Launch6(16777384),
/**

*/

        Key_Launch7(16777385),
/**

*/

        Key_Launch8(16777386),
/**

*/

        Key_Launch9(16777387),
/**

*/

        Key_LaunchA(16777388),
/**

*/

        Key_LaunchB(16777389),
/**

*/

        Key_LaunchC(16777390),
/**

*/

        Key_LaunchD(16777391),
/**

*/

        Key_LaunchE(16777392),
/**

*/

        Key_LaunchF(16777393),
/**

*/

        Key_MediaLast(16842751),
/**

*/

        Key_Select(16842752),
/**

*/

        Key_Yes(16842753),
/**

*/

        Key_No(16842754),
/**

*/

        Key_Cancel(16908289),
/**

*/

        Key_Printer(16908290),
/**

*/

        Key_Execute(16908291),
/**

*/

        Key_Sleep(16908292),
/**

*/

        Key_Play(16908293),
/**

*/

        Key_Zoom(16908294),
/**

*/

        Key_Context1(17825792),
/**

*/

        Key_Context2(17825793),
/**

*/

        Key_Context3(17825794),
/**

*/

        Key_Context4(17825795),
/**

*/

        Key_Call(17825796),
/**

*/

        Key_Hangup(17825797),
/**

*/

        Key_Flip(17825798),
/**

*/

        Key_unknown(33554431);

        Key(int value) { this.value = value; }
        public int value() { return value; }

/**
<brief>Returns the Qt$Key constant with the specified <tt>int</tt>.</brief>
*/

        public static Key resolve(int value) {
            return (Key) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 16777216: return Key_Escape;
            case 16777217: return Key_Tab;
            case 16777218: return Key_Backtab;
            case 16777219: return Key_Backspace;
            case 16777220: return Key_Return;
            case 16777221: return Key_Enter;
            case 16777222: return Key_Insert;
            case 16777223: return Key_Delete;
            case 16777224: return Key_Pause;
            case 16777225: return Key_Print;
            case 16777226: return Key_SysReq;
            case 16777227: return Key_Clear;
            case 16777232: return Key_Home;
            case 16777233: return Key_End;
            case 16777234: return Key_Left;
            case 16777235: return Key_Up;
            case 16777236: return Key_Right;
            case 16777237: return Key_Down;
            case 16777238: return Key_PageUp;
            case 16777239: return Key_PageDown;
            case 16777248: return Key_Shift;
            case 16777249: return Key_Control;
            case 16777250: return Key_Meta;
            case 16777251: return Key_Alt;
            case 16777252: return Key_CapsLock;
            case 16777253: return Key_NumLock;
            case 16777254: return Key_ScrollLock;
            case 16777264: return Key_F1;
            case 16777265: return Key_F2;
            case 16777266: return Key_F3;
            case 16777267: return Key_F4;
            case 16777268: return Key_F5;
            case 16777269: return Key_F6;
            case 16777270: return Key_F7;
            case 16777271: return Key_F8;
            case 16777272: return Key_F9;
            case 16777273: return Key_F10;
            case 16777274: return Key_F11;
            case 16777275: return Key_F12;
            case 16777276: return Key_F13;
            case 16777277: return Key_F14;
            case 16777278: return Key_F15;
            case 16777279: return Key_F16;
            case 16777280: return Key_F17;
            case 16777281: return Key_F18;
            case 16777282: return Key_F19;
            case 16777283: return Key_F20;
            case 16777284: return Key_F21;
            case 16777285: return Key_F22;
            case 16777286: return Key_F23;
            case 16777287: return Key_F24;
            case 16777288: return Key_F25;
            case 16777289: return Key_F26;
            case 16777290: return Key_F27;
            case 16777291: return Key_F28;
            case 16777292: return Key_F29;
            case 16777293: return Key_F30;
            case 16777294: return Key_F31;
            case 16777295: return Key_F32;
            case 16777296: return Key_F33;
            case 16777297: return Key_F34;
            case 16777298: return Key_F35;
            case 16777299: return Key_Super_L;
            case 16777300: return Key_Super_R;
            case 16777301: return Key_Menu;
            case 16777302: return Key_Hyper_L;
            case 16777303: return Key_Hyper_R;
            case 16777304: return Key_Help;
            case 16777305: return Key_Direction_L;
            case 16777312: return Key_Direction_R;
            case 32: return Key_Space;
            case 33: return Key_Exclam;
            case 34: return Key_QuoteDbl;
            case 35: return Key_NumberSign;
            case 36: return Key_Dollar;
            case 37: return Key_Percent;
            case 38: return Key_Ampersand;
            case 39: return Key_Apostrophe;
            case 40: return Key_ParenLeft;
            case 41: return Key_ParenRight;
            case 42: return Key_Asterisk;
            case 43: return Key_Plus;
            case 44: return Key_Comma;
            case 45: return Key_Minus;
            case 46: return Key_Period;
            case 47: return Key_Slash;
            case 48: return Key_0;
            case 49: return Key_1;
            case 50: return Key_2;
            case 51: return Key_3;
            case 52: return Key_4;
            case 53: return Key_5;
            case 54: return Key_6;
            case 55: return Key_7;
            case 56: return Key_8;
            case 57: return Key_9;
            case 58: return Key_Colon;
            case 59: return Key_Semicolon;
            case 60: return Key_Less;
            case 61: return Key_Equal;
            case 62: return Key_Greater;
            case 63: return Key_Question;
            case 64: return Key_At;
            case 65: return Key_A;
            case 66: return Key_B;
            case 67: return Key_C;
            case 68: return Key_D;
            case 69: return Key_E;
            case 70: return Key_F;
            case 71: return Key_G;
            case 72: return Key_H;
            case 73: return Key_I;
            case 74: return Key_J;
            case 75: return Key_K;
            case 76: return Key_L;
            case 77: return Key_M;
            case 78: return Key_N;
            case 79: return Key_O;
            case 80: return Key_P;
            case 81: return Key_Q;
            case 82: return Key_R;
            case 83: return Key_S;
            case 84: return Key_T;
            case 85: return Key_U;
            case 86: return Key_V;
            case 87: return Key_W;
            case 88: return Key_X;
            case 89: return Key_Y;
            case 90: return Key_Z;
            case 91: return Key_BracketLeft;
            case 92: return Key_Backslash;
            case 93: return Key_BracketRight;
            case 94: return Key_AsciiCircum;
            case 95: return Key_Underscore;
            case 96: return Key_QuoteLeft;
            case 123: return Key_BraceLeft;
            case 124: return Key_Bar;
            case 125: return Key_BraceRight;
            case 126: return Key_AsciiTilde;
            case 160: return Key_nobreakspace;
            case 161: return Key_exclamdown;
            case 162: return Key_cent;
            case 163: return Key_sterling;
            case 164: return Key_currency;
            case 165: return Key_yen;
            case 166: return Key_brokenbar;
            case 167: return Key_section;
            case 168: return Key_diaeresis;
            case 169: return Key_copyright;
            case 170: return Key_ordfeminine;
            case 171: return Key_guillemotleft;
            case 172: return Key_notsign;
            case 173: return Key_hyphen;
            case 174: return Key_registered;
            case 175: return Key_macron;
            case 176: return Key_degree;
            case 177: return Key_plusminus;
            case 178: return Key_twosuperior;
            case 179: return Key_threesuperior;
            case 180: return Key_acute;
            case 181: return Key_mu;
            case 182: return Key_paragraph;
            case 183: return Key_periodcentered;
            case 184: return Key_cedilla;
            case 185: return Key_onesuperior;
            case 186: return Key_masculine;
            case 187: return Key_guillemotright;
            case 188: return Key_onequarter;
            case 189: return Key_onehalf;
            case 190: return Key_threequarters;
            case 191: return Key_questiondown;
            case 192: return Key_Agrave;
            case 193: return Key_Aacute;
            case 194: return Key_Acircumflex;
            case 195: return Key_Atilde;
            case 196: return Key_Adiaeresis;
            case 197: return Key_Aring;
            case 198: return Key_AE;
            case 199: return Key_Ccedilla;
            case 200: return Key_Egrave;
            case 201: return Key_Eacute;
            case 202: return Key_Ecircumflex;
            case 203: return Key_Ediaeresis;
            case 204: return Key_Igrave;
            case 205: return Key_Iacute;
            case 206: return Key_Icircumflex;
            case 207: return Key_Idiaeresis;
            case 208: return Key_ETH;
            case 209: return Key_Ntilde;
            case 210: return Key_Ograve;
            case 211: return Key_Oacute;
            case 212: return Key_Ocircumflex;
            case 213: return Key_Otilde;
            case 214: return Key_Odiaeresis;
            case 215: return Key_multiply;
            case 216: return Key_Ooblique;
            case 217: return Key_Ugrave;
            case 218: return Key_Uacute;
            case 219: return Key_Ucircumflex;
            case 220: return Key_Udiaeresis;
            case 221: return Key_Yacute;
            case 222: return Key_THORN;
            case 223: return Key_ssharp;
            case 247: return Key_division;
            case 255: return Key_ydiaeresis;
            case 16781571: return Key_AltGr;
            case 16781600: return Key_Multi_key;
            case 16781623: return Key_Codeinput;
            case 16781628: return Key_SingleCandidate;
            case 16781629: return Key_MultipleCandidate;
            case 16781630: return Key_PreviousCandidate;
            case 16781694: return Key_Mode_switch;
            case 16781601: return Key_Kanji;
            case 16781602: return Key_Muhenkan;
            case 16781603: return Key_Henkan;
            case 16781604: return Key_Romaji;
            case 16781605: return Key_Hiragana;
            case 16781606: return Key_Katakana;
            case 16781607: return Key_Hiragana_Katakana;
            case 16781608: return Key_Zenkaku;
            case 16781609: return Key_Hankaku;
            case 16781610: return Key_Zenkaku_Hankaku;
            case 16781611: return Key_Touroku;
            case 16781612: return Key_Massyo;
            case 16781613: return Key_Kana_Lock;
            case 16781614: return Key_Kana_Shift;
            case 16781615: return Key_Eisu_Shift;
            case 16781616: return Key_Eisu_toggle;
            case 16781617: return Key_Hangul;
            case 16781618: return Key_Hangul_Start;
            case 16781619: return Key_Hangul_End;
            case 16781620: return Key_Hangul_Hanja;
            case 16781621: return Key_Hangul_Jamo;
            case 16781622: return Key_Hangul_Romaja;
            case 16781624: return Key_Hangul_Jeonja;
            case 16781625: return Key_Hangul_Banja;
            case 16781626: return Key_Hangul_PreHanja;
            case 16781627: return Key_Hangul_PostHanja;
            case 16781631: return Key_Hangul_Special;
            case 16781904: return Key_Dead_Grave;
            case 16781905: return Key_Dead_Acute;
            case 16781906: return Key_Dead_Circumflex;
            case 16781907: return Key_Dead_Tilde;
            case 16781908: return Key_Dead_Macron;
            case 16781909: return Key_Dead_Breve;
            case 16781910: return Key_Dead_Abovedot;
            case 16781911: return Key_Dead_Diaeresis;
            case 16781912: return Key_Dead_Abovering;
            case 16781913: return Key_Dead_Doubleacute;
            case 16781914: return Key_Dead_Caron;
            case 16781915: return Key_Dead_Cedilla;
            case 16781916: return Key_Dead_Ogonek;
            case 16781917: return Key_Dead_Iota;
            case 16781918: return Key_Dead_Voiced_Sound;
            case 16781919: return Key_Dead_Semivoiced_Sound;
            case 16781920: return Key_Dead_Belowdot;
            case 16781921: return Key_Dead_Hook;
            case 16781922: return Key_Dead_Horn;
            case 16777313: return Key_Back;
            case 16777314: return Key_Forward;
            case 16777315: return Key_Stop;
            case 16777316: return Key_Refresh;
            case 16777328: return Key_VolumeDown;
            case 16777329: return Key_VolumeMute;
            case 16777330: return Key_VolumeUp;
            case 16777331: return Key_BassBoost;
            case 16777332: return Key_BassUp;
            case 16777333: return Key_BassDown;
            case 16777334: return Key_TrebleUp;
            case 16777335: return Key_TrebleDown;
            case 16777344: return Key_MediaPlay;
            case 16777345: return Key_MediaStop;
            case 16777346: return Key_MediaPrevious;
            case 16777347: return Key_MediaNext;
            case 16777348: return Key_MediaRecord;
            case 16777360: return Key_HomePage;
            case 16777361: return Key_Favorites;
            case 16777362: return Key_Search;
            case 16777363: return Key_Standby;
            case 16777364: return Key_OpenUrl;
            case 16777376: return Key_LaunchMail;
            case 16777377: return Key_LaunchMedia;
            case 16777378: return Key_Launch0;
            case 16777379: return Key_Launch1;
            case 16777380: return Key_Launch2;
            case 16777381: return Key_Launch3;
            case 16777382: return Key_Launch4;
            case 16777383: return Key_Launch5;
            case 16777384: return Key_Launch6;
            case 16777385: return Key_Launch7;
            case 16777386: return Key_Launch8;
            case 16777387: return Key_Launch9;
            case 16777388: return Key_LaunchA;
            case 16777389: return Key_LaunchB;
            case 16777390: return Key_LaunchC;
            case 16777391: return Key_LaunchD;
            case 16777392: return Key_LaunchE;
            case 16777393: return Key_LaunchF;
            case 16842751: return Key_MediaLast;
            case 16842752: return Key_Select;
            case 16842753: return Key_Yes;
            case 16842754: return Key_No;
            case 16908289: return Key_Cancel;
            case 16908290: return Key_Printer;
            case 16908291: return Key_Execute;
            case 16908292: return Key_Sleep;
            case 16908293: return Key_Play;
            case 16908294: return Key_Zoom;
            case 17825792: return Key_Context1;
            case 17825793: return Key_Context2;
            case 17825794: return Key_Context3;
            case 17825795: return Key_Context4;
            case 17825796: return Key_Call;
            case 17825797: return Key_Hangup;
            case 17825798: return Key_Flip;
            case 33554431: return Key_unknown;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum ToolBarAreaSizes implements com.trolltech.qt.QtEnumerator {
        NToolBarAreas(4);

        ToolBarAreaSizes(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ToolBarAreaSizes constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolBarAreaSizes resolve(int value) {
            return (ToolBarAreaSizes) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 4: return NToolBarAreas;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ArrowType implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoArrow(0),
/**

*/

        UpArrow(1),
/**

*/

        DownArrow(2),
/**

*/

        LeftArrow(3),
/**

*/

        RightArrow(4);

        ArrowType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ArrowType constant with the specified <tt>int</tt>.</brief>
*/

        public static ArrowType resolve(int value) {
            return (ArrowType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoArrow;
            case 1: return UpArrow;
            case 2: return DownArrow;
            case 3: return LeftArrow;
            case 4: return RightArrow;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the various policies a widget can have with respect to acquiring keyboard focus.
*/

    public enum FocusPolicy implements com.trolltech.qt.QtEnumerator {
/**
 the widget does not accept focus.
*/

        NoFocus(0),
/**
 the widget accepts focus by tabbing.
*/

        TabFocus(1),
/**
 the widget accepts focus by clicking.
*/

        ClickFocus(2),
/**
 the widget accepts focus by both tabbing and clicking. On Mac OS X this will also be indicate that the widget accepts tab focus when in 'Text/List focus mode'.
*/

        StrongFocus(11),
/**
 like {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus } plus the widget accepts focus by using the mouse wheel.
*/

        WheelFocus(15);

        FocusPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$FocusPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static FocusPolicy resolve(int value) {
            return (FocusPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoFocus;
            case 1: return TabFocus;
            case 2: return ClickFocus;
            case 11: return StrongFocus;
            case 15: return WheelFocus;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used to describe parts of a window frame. It is returned by {@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameSectionAt(com.trolltech.qt.core.QPointF) QGraphicsWidget::windowFrameSectionAt()} to describe what section of the window frame is under the mouse. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameEvent(com.trolltech.qt.core.QEvent) QGraphicsWidget::windowFrameEvent()}, {@link com.trolltech.qt.gui.QGraphicsWidget#paintWindowFrame(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) QGraphicsWidget::paintWindowFrame()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameSectionAt(com.trolltech.qt.core.QPointF) QGraphicsWidget::windowFrameSectionAt()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum WindowFrameSection implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoSection(0),
/**

*/

        LeftSection(1),
/**

*/

        TopLeftSection(2),
/**

*/

        TopSection(3),
/**

*/

        TopRightSection(4),
/**

*/

        RightSection(5),
/**

*/

        BottomRightSection(6),
/**

*/

        BottomSection(7),
/**

*/

        BottomLeftSection(8),
/**

*/

        TitleBarArea(9);

        WindowFrameSection(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$WindowFrameSection constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowFrameSection resolve(int value) {
            return (WindowFrameSection) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoSection;
            case 1: return LeftSection;
            case 2: return TopLeftSection;
            case 3: return TopSection;
            case 4: return TopRightSection;
            case 5: return RightSection;
            case 6: return BottomRightSection;
            case 7: return BottomSection;
            case 8: return BottomLeftSection;
            case 9: return TitleBarArea;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum InputMethodQuery implements com.trolltech.qt.QtEnumerator {
/**
 The rectangle covering the area of the input cursor in widget coordinates.
*/

        ImMicroFocus(0),
/**
 The currently used font for text input.
*/

        ImFont(1),
/**
 The logical position of the cursor within the text surrounding the input area (see {@link com.trolltech.qt.core.Qt.InputMethodQuery ImSurroundingText }). If any text is selected, the position returned will be at the logical end of the selection, even if the real cursor is located at the logical start.
*/

        ImCursorPosition(2),
/**
 The plain text around the input area, for example the current paragraph.
*/

        ImSurroundingText(3),
/**
 The currently selected text.
*/

        ImCurrentSelection(4);

        InputMethodQuery(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$InputMethodQuery constant with the specified <tt>int</tt>.</brief>
*/

        public static InputMethodQuery resolve(int value) {
            return (InputMethodQuery) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ImMicroFocus;
            case 1: return ImFont;
            case 2: return ImCursorPosition;
            case 3: return ImSurroundingText;
            case 4: return ImCurrentSelection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
On X11 this value is used to do a move. <p>{@link com.trolltech.qt.core.Qt.DropAction TargetMoveAction } is not used on the Mac.
*/
@QtBlockedEnum
    public enum DropAction implements com.trolltech.qt.QtEnumerator {
/**
 Copy the data to the target.
*/

        CopyAction(1),
/**
 Move the data from the source to the target.
*/

        MoveAction(2),
/**
 Create a link from the source to the target.
*/

        LinkAction(4),
/**

*/

        ActionMask(255),
/**
 On Windows, this value is used when the ownership of the D&D data should be taken over by the target application, i.e., the source application should not delete the data.
*/

        TargetMoveAction(32770),
/**
 Ignore the action (do nothing with the data).
*/

        IgnoreAction(0);

        DropAction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$DropActions with the specified <tt>com.trolltech.qt.core.Qt$DropAction[]</tt> Qt$DropAction values set.</brief>
*/

        public static DropActions createQFlags(DropAction ... values) {
            return new DropActions(values);
        }
/**
<brief>Returns the Qt$DropAction constant with the specified <tt>int</tt>.</brief>
*/

        public static DropAction resolve(int value) {
            return (DropAction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return CopyAction;
            case 2: return MoveAction;
            case 4: return LinkAction;
            case 255: return ActionMask;
            case 32770: return TargetMoveAction;
            case 0: return IgnoreAction;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class DropActions extends com.trolltech.qt.QFlags<DropAction> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-DropActions with the specified <tt>com.trolltech.qt.core.Qt.DropAction[]</tt>. flags set.</brief>
*/

        public DropActions(DropAction ... args) { super(args); }
        public DropActions(int value) { setValue(value); }
    }
/**
Specifies which method should be used to fill the paths and polygons.
*/


    public enum FillRule implements com.trolltech.qt.QtEnumerator {
/**
 Specifies that the region is filled using the odd even fill rule. With this rule, we determine whether a point is inside the shape by using the following method. Draw a horizontal line from the point to a location outside the shape, and count the number of intersections. If the number of intersections is an odd number, the point is inside the shape. This mode is the default.
*/

        OddEvenFill(0),
/**
 Specifies that the region is filled using the non zero winding rule. With this rule, we determine whether a point is inside the shape by using the following method. Draw a horizontal line from the point to a location outside the shape. Determine whether the direction of the line at each intersection point is up or down. The winding number is determined by summing the direction of each intersection. If the number is non zero, the point is inside the shape. This fill mode can also in most cases be considered as the intersection of closed shapes.
*/

        WindingFill(1);

        FillRule(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$FillRule constant with the specified <tt>int</tt>.</brief>
*/

        public static FillRule resolve(int value) {
            return (FillRule) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OddEvenFill;
            case 1: return WindingFill;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<style type="text/css" id="colorstyles">
     #white { background-color. #ffffff; color: #000000 }
     #black { background-color: #000000; color: #ffffff }
     #red { background-color: #ff0000; color: #000000 }
     #darkRed { background-color: #800000; color: #ffffff }
     #green { background-color: #00ff00; color: #000000 }
     #darkGreen { background-color: #008000; color: #ffffff }
     #blue { background-color: #0000ff; color: #ffffff }
     #darkBlue { background-color: #000080; color: #ffffff }
     #cyan { background-color: #00ffff; color: #000000 }
     #darkCyan { background-color: #008080; color: #ffffff }
     #magenta { background-color: #ff00ff; color: #000000 }
     #darkMagenta { background-color: #800080; color: #ffffff }
     #yellow { background-color: #ffff00; color: #000000 }
     #darkYellow { background-color: #808000; color: #ffffff }
     #gray { background-color: #a0a0a4; color: #000000 }
     #darkGray { background-color: #808080; color: #ffffff }
     #lightGray { background-color: #c0c0c0; color: #000000 }
    </style>
     Qt's predefined {@link com.trolltech.qt.gui.QColor QColor} objects: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QColor QColor}. <br></DD></DT>
*/

    public enum GlobalColor implements com.trolltech.qt.QtEnumerator {
/**
 0 pixel value (for bitmaps)
*/

        color0(0),
/**
 1 pixel value (for bitmaps)
*/

        color1(1),
/**
    Black <tt id="black">(#000000)</tt>
    
*/

        black(2),
/**
    White <tt id="white">(#ffffff)</tt>
    
*/

        white(3),
/**
    Dark gray <tt id="darkGray">(#808080)</tt>
    
*/

        darkGray(4),
/**
    Gray <tt id="gray">(#a0a0a4)</tt>
    
*/

        gray(5),
/**
    Light gray <tt id="lightGray">(#c0c0c0)</tt>
    
*/

        lightGray(6),
/**
    Red <tt id="red">(#ff0000)</tt>
    
*/

        red(7),
/**
    Green <tt id="green">(#00ff00)</tt>
    
*/

        green(8),
/**
    Blue <tt id="blue">(#0000ff)</tt>
    
*/

        blue(9),
/**
    Cyan <tt id="cyan">(#00ffff)</tt>
    
*/

        cyan(10),
/**
    Magenta <tt id="magenta">(#ff00ff)</tt>
    
*/

        magenta(11),
/**
    Yellow <tt id="yellow">(#ffff00)</tt>
    
*/

        yellow(12),
/**
    Dark red <tt id="darkRed">(#800000)</tt>
    
*/

        darkRed(13),
/**
    Dark green <tt id="darkGreen">(#008000)</tt>
    
*/

        darkGreen(14),
/**
    Dark blue <tt id="darkBlue">(#000080)</tt>
    
*/

        darkBlue(15),
/**
    Dark cyan <tt id="darkCyan">(#008080)</tt>
    
*/

        darkCyan(16),
/**
    Dark magenta <tt id="darkMagenta">(#800080)</tt>
    
*/

        darkMagenta(17),
/**
    Dark yellow <tt id="darkYellow">(#808000)</tt>
    
*/

        darkYellow(18),
/**
 a transparent black value (i. ., {@link com.trolltech.qt.gui.QColor QColor}(0, 0, 0, 0))
*/

        transparent(19);

        GlobalColor(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$GlobalColor constant with the specified <tt>int</tt>.</brief>
*/

        public static GlobalColor resolve(int value) {
            return (GlobalColor) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return color0;
            case 1: return color1;
            case 2: return black;
            case 3: return white;
            case 4: return darkGray;
            case 5: return gray;
            case 6: return lightGray;
            case 7: return red;
            case 8: return green;
            case 9: return blue;
            case 10: return cyan;
            case 11: return magenta;
            case 12: return yellow;
            case 13: return darkRed;
            case 14: return darkGreen;
            case 15: return darkBlue;
            case 16: return darkCyan;
            case 17: return darkMagenta;
            case 18: return darkYellow;
            case 19: return transparent;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the types of connection that can be used between signals and slots. In particular, it determines whether a particular signal is delivered to a slot immediately or queued for delivery at a later time. With queued connections, the parameters must be of types that are known to Qt's meta-object system, because Qt needs to copy the arguments to store them in an event behind the scenes. If you try to use a queued connection and get the error message <pre class="snippet">
QObject::connect: Cannot queue arguments of type 'MyType'
</pre> call qRegisterMetaType() to register the data type before you establish the connection. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-threads.html">Thread Support in Qt</a>}, QObject::connect(), and qRegisterMetaType(). <br></DD></DT>
*/

    public enum ConnectionType implements com.trolltech.qt.QtEnumerator {
/**
 If the signal is emitted from the thread in which the receiving object lives, the slot is invoked directly, as with {@link com.trolltech.qt.core.Qt.ConnectionType Qt::DirectConnection }; otherwise the signal is queued, as with {@link com.trolltech.qt.core.Qt.ConnectionType Qt::QueuedConnection }.
*/

        AutoConnection(0),
/**
 When emitted, the signal is immediately delivered to the slot.
*/

        DirectConnection(1),
/**
 When emitted, the signal is queued until the event loop is able to deliver it to the slot.
*/

        QueuedConnection(2),
        AutoCompatConnection(3),
/**
 Same as {@link com.trolltech.qt.core.Qt.ConnectionType QueuedConnection }, except that the current thread blocks until the slot has been delivered. This connection type should only be used for receivers in a different thread. Note that misuse of this type can lead to dead locks in your application.
*/

        BlockingQueuedConnection(4);

        ConnectionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ConnectionType constant with the specified <tt>int</tt>.</brief>
*/

        public static ConnectionType resolve(int value) {
            return (ConnectionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AutoConnection;
            case 1: return DirectConnection;
            case 2: return QueuedConnection;
            case 3: return AutoCompatConnection;
            case 4: return BlockingQueuedConnection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the pen cap styles supported by Qt, i. . the line end caps that can be drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-square.png"></center><br></td><td>  <br><center><img src="../images/qpen-flat.png"></center><br></td><td>  <br><center><img src="../images/qpen-roundcap.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::SquareCap }</td><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::FlatCap }</td><td> {@link com.trolltech.qt.core.Qt.PenCapStyle Qt::RoundCap }</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen QPen}. <br></DD></DT>
*/

    public enum PenCapStyle implements com.trolltech.qt.QtEnumerator {
/**
 a square line end that does not cover the end point of the line.
*/

        FlatCap(0),
/**
 a square line end that covers the end point and extends beyond it by half the line width.
*/

        SquareCap(16),
/**
 a rounded line end.
*/

        RoundCap(32),
        MPenCapStyle(48);

        PenCapStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$PenCapStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static PenCapStyle resolve(int value) {
            return (PenCapStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FlatCap;
            case 16: return SquareCap;
            case 32: return RoundCap;
            case 48: return MPenCapStyle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines whether image transformations (e. ., scaling) should be smooth or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImage#scaled(com.trolltech.qt.core.QSize, com.trolltech.qt.core.Qt.AspectRatioMode) QImage::scaled()}. <br></DD></DT>
*/

    public enum TransformationMode implements com.trolltech.qt.QtEnumerator {
/**
 The transformation is performed quickly, with no smoothing.
*/

        FastTransformation(0),
/**
 The resulting image is transformed using bilinear filtering.
*/

        SmoothTransformation(1);

        TransformationMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$TransformationMode constant with the specified <tt>int</tt>.</brief>
*/

        public static TransformationMode resolve(int value) {
            return (TransformationMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FastTransformation;
            case 1: return SmoothTransformation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum DockWidgetAreaSizes implements com.trolltech.qt.QtEnumerator {
        NDockWidgetAreas(4);

        DockWidgetAreaSizes(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$DockWidgetAreaSizes constant with the specified <tt>int</tt>.</brief>
*/

        public static DockWidgetAreaSizes resolve(int value) {
            return (DockWidgetAreaSizes) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 4: return NDockWidgetAreas;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes attributes that change the behavior of application-wide features. These are enabled and disabled using {@link com.trolltech.qt.core.QCoreApplication#setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) QCoreApplication::setAttribute()}, and can be tested for with {@link com.trolltech.qt.core.QCoreApplication#testAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) QCoreApplication::testAttribute()}. Menus that are currently open or menus already created in the native Mac OS X menubar MAY NOT pick up a change in this attribute. Changes in the {@link QAction#isIconVisibleInMenu() QAction::iconVisibleInMenu} property will always be picked up.
*/

    public enum ApplicationAttribute implements com.trolltech.qt.QtEnumerator {
/**
 Ensures that widgets are created as soon as they are constructed. By default, resources for widgets are allocated on demand to improve efficiency and minimize resource usage. Setting or clearing this attribute affects widgets constructed after the change. Setting it tells Qt to create toplevel windows immediately. Therefore, if it is important to minimize resource consumption, do not set this attribute.
*/

        AA_ImmediateWidgetCreation(0),
/**
 Is a Windows specific attribute, that will make the Direct3D paint engine the default Qt widget paint engine. Note that you can toggle usage of the Direct3D engine on individual QWidgets by setting/clearing the <tt>WA_MSWindowsUseDirect3D</tt> attribute on a specific widget. <b>This functionality is experimental</b>.
*/

        AA_MSWindowsUseDirect3DByDefault(1),
/**
 Actions with the Icon property won't be shown in any menus unless specifically set by the {@link QAction#isIconVisibleInMenu() QAction.:iconVisibleInMenu} property.
*/

        AA_DontShowIconsInMenus(2),
/**
 Ensures that widgets have native windows.
*/

        AA_NativeWindows(3),
/**
 Ensures that siblings of native widgets stay non-native unless specifically set by the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NativeWindow } attribute.
*/

        AA_DontCreateNativeWidgetSiblings(4),
/**
 Stops the a Qt mac application from doing specific initializations that do not necessarily make sense when using Qt to author a plugin. This includes avoiding loading our nib for the main menu and not taking possession of the native menu bar.
*/

        AA_MacPluginApplication(5),
        AA_AttributeCount(6);

        ApplicationAttribute(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ApplicationAttribute constant with the specified <tt>int</tt>.</brief>
*/

        public static ApplicationAttribute resolve(int value) {
            return (ApplicationAttribute) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AA_ImmediateWidgetCreation;
            case 1: return AA_MSWindowsUseDirect3DByDefault;
            case 2: return AA_DontShowIconsInMenus;
            case 3: return AA_NativeWindows;
            case 4: return AA_DontCreateNativeWidgetSiblings;
            case 5: return AA_MacPluginApplication;
            case 6: return AA_AttributeCount;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
For a {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } event to occur, the shortcut's key sequence must be entered by the user in a context where the shortcut is active. The possible contexts are these:
*/

    public enum ShortcutContext implements com.trolltech.qt.QtEnumerator {
/**
 The shortcut is active when its parent widget has focus.
*/

        WidgetShortcut(0),
/**
 The shortcut is active when its parent widget is a logical subwidget of the active top-level window.
*/

        WindowShortcut(1),
/**
 The shortcut is active when one of the applications windows are active.
*/

        ApplicationShortcut(2),
/**
 The shortcut is active when its parent widget, or any of its children has focus. Children which are top-level widgets, except pop-ups, are not affected by this shortcut context.
*/

        WidgetWithChildrenShortcut(3);

        ShortcutContext(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$ShortcutContext constant with the specified <tt>int</tt>.</brief>
*/

        public static ShortcutContext resolve(int value) {
            return (ShortcutContext) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WidgetShortcut;
            case 1: return WindowShortcut;
            case 2: return ApplicationShortcut;
            case 3: return WidgetWithChildrenShortcut;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies how a text displaying widget reacts to user input.
*/

    public enum TextInteractionFlag implements com.trolltech.qt.QtEnumerator {
/**
 No interaction with the text is possible.
*/

        NoTextInteraction(0),
/**
 Text can be selected with the mouse and copied to the clipboard using a context menu or standard keyboard shortcuts.
*/

        TextSelectableByMouse(1),
/**
 Text can be selected with the cursor keys on the keyboard. A text cursor is shown.
*/

        TextSelectableByKeyboard(2),
/**
 Links can be highlighted and activated with the mouse.
*/

        LinksAccessibleByMouse(4),
/**
 Links can be focused using tab and activated with enter.
*/

        LinksAccessibleByKeyboard(8),
/**
 The text is fully editable.
*/

        TextEditable(16),
/**
 The default for a text editor.
*/

        TextEditorInteraction(19),
/**
 The default for {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser}.
*/

        TextBrowserInteraction(13);

        TextInteractionFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$TextInteractionFlags with the specified <tt>com.trolltech.qt.core.Qt$TextInteractionFlag[]</tt> Qt$TextInteractionFlag values set.</brief>
*/

        public static TextInteractionFlags createQFlags(TextInteractionFlag ... values) {
            return new TextInteractionFlags(values);
        }
/**
<brief>Returns the Qt$TextInteractionFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static TextInteractionFlag resolve(int value) {
            return (TextInteractionFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoTextInteraction;
            case 1: return TextSelectableByMouse;
            case 2: return TextSelectableByKeyboard;
            case 4: return LinksAccessibleByMouse;
            case 8: return LinksAccessibleByKeyboard;
            case 16: return TextEditable;
            case 19: return TextEditorInteraction;
            case 13: return TextBrowserInteraction;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class TextInteractionFlags extends com.trolltech.qt.QFlags<TextInteractionFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-TextInteractionFlags with the specified <tt>com.trolltech.qt.core.Qt.TextInteractionFlag[]</tt>. flags set.</brief>
*/

        public TextInteractionFlags(TextInteractionFlag ... args) { super(args); }
        public TextInteractionFlags(int value) { setValue(value); }
    }
/**
This enum describes the state of checkable items, controls, and widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCheckBox QCheckBox}, Qt::ItemFlags, and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }. <br></DD></DT>
*/


    public enum CheckState implements com.trolltech.qt.QtEnumerator {
/**
 The item is unchecked.
*/

        Unchecked(0),
/**
 The item is partially checked. Items in hierarchical models may be partially checked if some, but not all, of their children are checked.
*/

        PartiallyChecked(1),
/**
 The item is checked.
*/

        Checked(2);

        CheckState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$CheckState constant with the specified <tt>int</tt>.</brief>
*/

        public static CheckState resolve(int value) {
            return (CheckState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Unchecked;
            case 1: return PartiallyChecked;
            case 2: return Checked;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum DockWidgetArea implements com.trolltech.qt.QtEnumerator {
/**

*/

        LeftDockWidgetArea(1),
/**

*/

        RightDockWidgetArea(2),
/**

*/

        TopDockWidgetArea(4),
/**

*/

        BottomDockWidgetArea(8),
        DockWidgetArea_Mask(15),
/**

*/

        NoDockWidgetArea(0);

        DockWidgetArea(int value) { this.value = value; }
        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$DockWidgetAreas with the specified <tt>com.trolltech.qt.core.Qt$DockWidgetArea[]</tt> Qt$DockWidgetArea values set.</brief>
*/

        public static DockWidgetAreas createQFlags(DockWidgetArea ... values) {
            return new DockWidgetAreas(values);
        }
/**
<brief>Returns the Qt$DockWidgetArea constant with the specified <tt>int</tt>.</brief>
*/

        public static DockWidgetArea resolve(int value) {
            return (DockWidgetArea) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return LeftDockWidgetArea;
            case 2: return RightDockWidgetArea;
            case 4: return TopDockWidgetArea;
            case 8: return BottomDockWidgetArea;
            case 15: return DockWidgetArea_Mask;
            case 0: return NoDockWidgetArea;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class DockWidgetAreas extends com.trolltech.qt.QFlags<DockWidgetArea> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-DockWidgetAreas with the specified <tt>com.trolltech.qt.core.Qt.DockWidgetArea[]</tt>. flags set.</brief>
*/

        public DockWidgetAreas(DockWidgetArea ... args) { super(args); }
        public DockWidgetAreas(int value) { setValue(value); }
    }

    public enum TimeSpec implements com.trolltech.qt.QtEnumerator {
/**
 Locale dependent time (Timezones and Daylight Savings Time).
*/

        LocalTime(0),
/**
 Coordinated Universal Time, replaces Greenwich Mean Time.
*/

        UTC(1),
/**
 An offset in seconds from Coordinated Universal Time.
*/

        OffsetFromUTC(2);

        TimeSpec(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$TimeSpec constant with the specified <tt>int</tt>.</brief>
*/

        public static TimeSpec resolve(int value) {
            return (TimeSpec) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LocalTime;
            case 1: return UTC;
            case 2: return OffsetFromUTC;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
The options marked "(default)" are set if no other values from the list are included (since the defaults are zero). <p>Color/Mono preference (ignored for {@link com.trolltech.qt.gui.QBitmap QBitmap}): Dithering mode preference for RGB channels: Dithering mode preference for alpha channel: Color matching versus dithering preference:
*/
@QtBlockedEnum
    public enum ImageConversionFlag implements com.trolltech.qt.QtEnumerator {
        ColorMode_Mask(3),
/**
 (default) - If the image has {@link com.trolltech.qt.gui.QImage#depth() depth} 1 and contains only black and white pixels, the pixmap becomes monochrome.
*/

        AutoColor(0),
/**
 The pixmap becomes monochrome. If necessary, it is dithered using the chosen dithering algorithm.
*/

        MonoOnly(2),
        AlphaDither_Mask(12),
/**
 A faster, more ordered dither.
*/

        OrderedAlphaDither(4),
/**
 A high-quality dither.
*/

        DiffuseAlphaDither(8),
        Dither_Mask(48),
/**
 A faster, more ordered dither.
*/

        OrderedDither(16),
/**
 No dithering; closest color is used.
*/

        ThresholdDither(32),
        DitherMode_Mask(192),
/**
 (default when converting to a pixmap) - Always dither 32-bit images when the image is converted to 8 bits.
*/

        PreferDither(64),
/**
 (default when converting for the purpose of saving to file) - Dither 32-bit images only if the image has more than 256 colors and it is being converted to 8 bits.
*/

        AvoidDither(128),
        NoOpaqueDetection(256);

        ImageConversionFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$ImageConversionFlags with the specified <tt>com.trolltech.qt.core.Qt$ImageConversionFlag[]</tt> Qt$ImageConversionFlag values set.</brief>
*/

        public static ImageConversionFlags createQFlags(ImageConversionFlag ... values) {
            return new ImageConversionFlags(values);
        }
/**
<brief>Returns the Qt$ImageConversionFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static ImageConversionFlag resolve(int value) {
            return (ImageConversionFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 3: return ColorMode_Mask;
            case 0: return AutoColor;
            case 2: return MonoOnly;
            case 12: return AlphaDither_Mask;
            case 4: return OrderedAlphaDither;
            case 8: return DiffuseAlphaDither;
            case 48: return Dither_Mask;
            case 16: return OrderedDither;
            case 32: return ThresholdDither;
            case 192: return DitherMode_Mask;
            case 64: return PreferDither;
            case 128: return AvoidDither;
            case 256: return NoOpaqueDetection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ImageConversionFlags extends com.trolltech.qt.QFlags<ImageConversionFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-ImageConversionFlags with the specified <tt>com.trolltech.qt.core.Qt.ImageConversionFlag[]</tt>. flags set.</brief>
*/

        public ImageConversionFlags(ImageConversionFlag ... args) { super(args); }
        public ImageConversionFlags(int value) { setValue(value); }
    }
/**
<a name="modal"> This enum specifies the behavior of a modal window. A modal window is one that blocks input to other windows. Note that windows that are children of a modal window are not blocked. <p>The values are: <p><DT><b>See also:</b><br><DD>{@link QWidget#windowModality() QWidget::windowModality}, and {@link com.trolltech.qt.gui.QDialog QDialog}. <br></DD></DT>
*/


    public enum
/**
 The window is modal to a single window hierarchy and blocks input to its parent window, all grandparent windows, and all siblings of its parent and grandparent windows.
*/
 WindowModality implements com.trolltech.qt.QtEnumerator {
/**
 The window is not modal and does not block input to other windows.
*/

        NonModal(0),
        WindowModal(1),
/**
 The window is modal to the application and blocks input to all windows.
*/

        ApplicationModal(2);

        WindowModality(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$WindowModality constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowModality resolve(int value) {
            return (WindowModality) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NonModal;
            case 1: return WindowModal;
            case 2: return ApplicationModal;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum provides shorter names for the keyboard modifier keys supported by Qt. <p><b>Note:</b> On Mac OS X, the <tt>CTRL</tt> value corresponds to the Command keys on the Macintosh keyboard, and the <tt>META</tt> value corresponds to the Control keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.KeyboardModifier KeyboardModifier }, and {@link com.trolltech.qt.core.Qt.MouseButton MouseButton }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Modifier implements com.trolltech.qt.QtEnumerator {
/**
 The Meta keys.
*/

        META(268435456),
/**
 The Shift keys provided on all standard keyboards.
*/

        SHIFT(33554432),
/**
 The Ctrl keys.
*/

        CTRL(67108864),
/**
 The normal Alt keys, but not keys like AltGr.
*/

        ALT(134217728),
        MODIFIER_MASK(-33554432),
/**
 The shortcut is specified as a Unicode code point, not as a Qt Key.
*/

        UNICODE_ACCEL(0);

        Modifier(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$Modifier constant with the specified <tt>int</tt>.</brief>
*/

        public static Modifier resolve(int value) {
            return (Modifier) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 268435456: return META;
            case 33554432: return SHIFT;
            case 67108864: return CTRL;
            case 134217728: return ALT;
            case -33554432: return MODIFIER_MASK;
            case 0: return UNICODE_ACCEL;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum type is used to describe alignment. It contains horizontal and vertical flags that can be combined to produce the required effect. <p>The {@link com.trolltech.qt.core.Qt.TextElideMode TextElideMode } enum can also be used in many situations to fine-tune the appearance of aligned text. <p>The horizontal flags are: The vertical flags are: You can use only one of the horizontal flags at a time. There is one two-dimensional flag: You can use at most one horizontal and one vertical flag at a time. {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter } counts as both horizontal and vertical. <p>Three enum values are useful in applications that can be run in right-to-left mode: Masks: Conflicting combinations of flags have undefined meanings.
*/
@QtBlockedEnum
    public enum AlignmentFlag implements com.trolltech.qt.QtEnumerator {
/**
 Aligns with the left edge.
*/

        AlignLeft(1),
/**
 Aligns with the right edge.
*/

        AlignRight(2),
/**
 Centers horizontally in the available space.
*/

        AlignHCenter(4),
/**
 Justifies the text in the available space.
*/

        AlignJustify(8),
/**
 If the widget's layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::RightToLeft } (instead of {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, the default), {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } refers to the right edge and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } to the left edge. This is normally the desired behavior. If you want {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } to always mean "left" and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } to always mean "right", combine the flag with {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignAbsolute }.
*/

        AlignAbsolute(16),
/**

*/

        AlignHorizontal_Mask(31),
/**
 Aligns with the top.
*/

        AlignTop(32),
/**
 Aligns with the bottom.
*/

        AlignBottom(64),
/**
 Centers vertically in the available space.
*/

        AlignVCenter(128),
/**

*/

        AlignVertical_Mask(224),
/**
 Centers in both dimensions.
*/

        AlignCenter(132);

        AlignmentFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$Alignment with the specified <tt>com.trolltech.qt.core.Qt$AlignmentFlag[]</tt> Qt$AlignmentFlag values set.</brief>
*/

        public static Alignment createQFlags(AlignmentFlag ... values) {
            return new Alignment(values);
        }
/**
<brief>Returns the Qt$AlignmentFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static AlignmentFlag resolve(int value) {
            return (AlignmentFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return AlignLeft;
            case 2: return AlignRight;
            case 4: return AlignHCenter;
            case 8: return AlignJustify;
            case 16: return AlignAbsolute;
            case 31: return AlignHorizontal_Mask;
            case 32: return AlignTop;
            case 64: return AlignBottom;
            case 128: return AlignVCenter;
            case 224: return AlignVertical_Mask;
            case 132: return AlignCenter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Alignment extends com.trolltech.qt.QFlags<AlignmentFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-Alignment with the specified <tt>com.trolltech.qt.core.Qt.AlignmentFlag[]</tt>. flags set.</brief>
*/

        public Alignment(AlignmentFlag ... args) { super(args); }
        public Alignment(int value) { setValue(value); }
    }
/**
<a name="widget-attributes"> This enum type is used to specify various widget attributes. Attributes are set and cleared with {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) QWidget::setAttribute()}, and queried with {@link com.trolltech.qt.gui.QWidget#testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) QWidget::testAttribute()}, although some have special convenience functions which are mentioned below. The attribute is off by default and can be enabled on a per-window basis.
*/


    public enum WidgetAttribute implements com.trolltech.qt.QtEnumerator {
/**
 Indicates that the widget is disabled, i. . it does not receive any mouse or keyboard events. There is also a getter functions {@link QWidget#isEnabled() QWidget::isEnabled()}. This is set/cleared by the Qt kernel.
*/

        WA_Disabled(0),
/**
 Indicates that the widget is under the mouse cursor. The value is not updated correctly during drag and drop operations. There is also a getter function {@link com.trolltech.qt.gui.QWidget#underMouse() QWidget::underMouse()}. This is set/cleared by the Qt kernel.
*/

        WA_UnderMouse(1),
/**
 Indicates that the widget has mouse tracking enabled. See {@link QWidget#hasMouseTracking() QWidget::mouseTracking}.
*/

        WA_MouseTracking(2),
/**
 This flag is superfluous and obsolete; it no longer has any effect. Since Qt 4.1, all widgets that do not set {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_PaintOnScreen } propagate their contents.
*/

        WA_ContentsPropagated(3),
/**
 Indicates that the widget paints all its pixels when it receives a paint event. It is thus not required for operations like updating, resizing, scrolling and focus changes to erase the widget before generating paint events. Using {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_OpaquePaintEvent } is a small optimization. It can help to reduce flicker on systems that do not provide double buffer support, and it avoids the computational cycles necessary to erase the background prior to paint. <b>Note:</b> Unlike {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_NoSystemBackground }, {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_OpaquePaintEvent } makes an effort to avoid transparent window backgrounds. This is set/cleared by the widget's author.
*/

        WA_OpaquePaintEvent(4),
/**
 Indicates that the widget contents are north-west aligned and static. On resize, such a widget will receive paint events only for the newly visible part of itself. This is set/cleared by the widget's author.
*/

        WA_StaticContents(5),
        WA_LaidOut(7),
/**
 Indicates that the widget wants to draw directly onto the screen. Widgets with this attribute set do not participate in composition management, i.e. they cannot be semi-transparent or shine through semi-transparent overlapping widgets. This is only supported on X11. On Qt for Embedded Linux, the flag currently only works when set on a top-level widget and relies on support from the active screen driver. The flag is set or cleared by the widget's author. For rendering outside of Qt's paint system; e.g. if you need to use native X11 painting primitives, you need to reimplement {@link com.trolltech.qt.gui.QWidget#paintEngine() QWidget::paintEngine()} to return 0 and set this flag. <b>Note:</b> This flag disables double buffering.
*/

        WA_PaintOnScreen(8),
/**
 Indicates that the widget has no background, i. . when the widget receives paint events, the background is not automatically repainted. <b>Note:</b> Unlike {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_OpaquePaintEvent }, newly exposed areas are never filled with the background (e.g after showing a window for the first time the user can see "through" it until the application processes the paint events). This is set/cleared by the widget's author.
*/

        WA_NoSystemBackground(9),
/**
 Indicates that updates are blocked (including the system background). This flag must never be set/cleared by the widget author. It is set/cleared by the Qt kernel.
*/

        WA_UpdatesDisabled(10),
/**
 Indicates that the widget is mapped on screen. This is set/cleared by the Qt kernel.
*/

        WA_Mapped(11),
/**
 When a widget that has this attribute set is clicked, and its window is inactive, the click will make the window active but won't be seen by the widget. Typical use of this attribute is on widgets with "destructive" actions, such as a "Delete" button. {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_MacNoClickThrough } also applies to all child widgets of the widget that has it set.
*/

        WA_MacNoClickThrough(12),
/**
 Makes it possible to use {@link com.trolltech.qt.gui.QPainter QPainter} to paint on the widget outside {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. This is not supported on Windows, Mac OS X or Embedded Linux. We recommend that you use this attribute only when porting Qt 3 code to Qt 4.
*/

        WA_PaintOutsidePaintEvent(13),
/**
 Enables input methods for Asian languages. Must be set when creating custom text editing widgets. On Windows CE this flag can be used in addition to QApplication::autoSipEnabled to automatically display the SIP when entering a widget.
*/

        WA_InputMethodEnabled(14),
        WA_WState_Visible(15),
        WA_WState_Hidden(16),
/**
 Indicates that the widget is explicitly disabled, i. . it will remain disabled even when all its ancestors are set to the enabled state. This implies {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_Disabled }. This is set/cleared by {@link QWidget#setEnabled(boolean) QWidget::setEnabled()} and {@link com.trolltech.qt.gui.QWidget#setDisabled(boolean) QWidget::setDisabled()}.
*/

        WA_ForceDisabled(32),
/**
 Enables key event compression if set, and disables it if not set. By default key compression is off, so widgets receive one key press event for each key press (or more, since autorepeat is usually on). If you turn it on and your program doesn't keep up with key input, Qt may try to compress key events so that more than one character can be processed in each event. For example, a word processor widget might receive 2, 3 or more characters in each {@link com.trolltech.qt.gui.QKeyEvent#text() QKeyEvent::text()}, if the layout recalculation takes too long for the CPU. If a widget supports multiple character unicode input, it is always safe to turn the compression on. Qt performs key event compression only for printable characters. {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier } keys, cursor movement keys, function keys and miscellaneous action keys (e.g. Escape, Enter, Backspace, PrintScreen) will stop key event compression, even if there are more compressible key events available. Platforms other than Mac and X11 do not support this compression, in which case turning it on will have no effect. This is set/cleared by the widget's author.
*/

        WA_KeyCompression(33),
/**
 Indicates that a move event is pending, e.g. when a hidden widget was moved. This is set/cleared by the Qt kernel.
*/

        WA_PendingMoveEvent(34),
/**
 Indicates that a resize event is pending, e.g. when a hidden widget was resized. This is set/cleared by the Qt kernel.
*/

        WA_PendingResizeEvent(35),
/**
 Indicates that the widget has a palette of its own. This is set/cleared by {@link QWidget#setPalette(com.trolltech.qt.gui.QPalette) QWidget::setPalette()}.
*/

        WA_SetPalette(36),
/**
 Indicates that the widget has a font of its own. This is set/cleared by {@link QWidget#setFont(com.trolltech.qt.gui.QFont) QWidget::setFont()}.
*/

        WA_SetFont(37),
/**
 Indicates that the widget has a cursor of its own. This is set/cleared by {@link QWidget#setCursor(com.trolltech.qt.gui.QCursor) QWidget::setCursor()} and {@link QWidget#unsetCursor() QWidget::unsetCursor()}.
*/

        WA_SetCursor(38),
/**
 Indicates that the widget does not want to receive ChildAdded or ChildRemoved events sent from its children. This is set by a widget's author.
*/

        WA_NoChildEventsFromChildren(39),
/**
 Indicates that the window is marked as modified. On some platforms this will mean nothing, on others (including Mac OS X and Windows) the window will take a modified appearance. This is set/cleared by {@link QWidget#setWindowModified(boolean) QWidget::setWindowModified()}.
*/

        WA_WindowModified(41),
/**
 Indicates that the widget has an explicit size. This is set/cleared by {@link QWidget#resize(com.trolltech.qt.core.QSize) QWidget::resize()} and by {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()}.
*/

        WA_Resized(42),
/**
 Indicates that the widget has an explicit position. This is set/cleared by {@link QWidget#move(com.trolltech.qt.core.QPoint) QWidget::move()} and by {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()}.
*/

        WA_Moved(43),
        WA_PendingUpdate(44),
        WA_InvalidSize(45),
/**
 Indicates the widget should be drawn in the brushed metal style as supported by the windowing system. This attribute is only applicable to Mac OS X.
*/

        WA_MacBrushedMetal(46),
/**
 Indicates that the widget wants to continue operating normally in "What's This?" mode. This is set by the widget's author.
*/

        WA_CustomWhatsThis(47),
/**
 Indicates that the widget wants {@link com.trolltech.qt.gui.QLayout QLayout} to operate on the entire {@link QWidget#rect() QWidget::rect()}, not only on {@link com.trolltech.qt.gui.QWidget#contentsRect() QWidget::contentsRect()}. This is set by the widget's author.
*/

        WA_LayoutOnEntireRect(48),
/**
 Indicates that the widget is outside the valid range of the window system's coordinate system. A widget outside the valid range cannot be mapped on screen. This is set/cleared by the Qt kernel.
*/

        WA_OutsideWSRange(49),
        WA_GrabbedShortcut(50),
        WA_TransparentForMouseEvents(51),
/**
 Makes all painters operating on this widget unclipped. Children of this widget or other widgets in front of it do not clip the area the painter can paint on. This flag is only supported for widgets for which the {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_PaintOnScreen } flag is set. The preferred way to do this in a cross platform way is to create a transparent widget that lies in front of the other widgets.
*/

        WA_PaintUnclipped(52),
        WA_SetWindowIcon(53),
/**
 Used for pop-up widgets. Indicates that the most recent mouse press event should not be replayed when the pop-up widget closes. The flag is set by the widget's author and cleared by the Qt kernel every time the widget receives a new mouse event.
*/

        WA_NoMouseReplay(54),
/**
 Makes Qt delete this widget when the widget has accepted the close event (see {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) QWidget::closeEvent()}).
*/

        WA_DeleteOnClose(55),
/**
 Indicates that the layout direction for the widget is right to left.
*/

        WA_RightToLeft(56),
        WA_SetLayoutDirection(57),
/**
 Indicates that the widget does not want ChildAdded or ChildRemoved events sent to its parent. This is rarely necessary but can help to avoid automatic insertion widgets like splitters and layouts. This is set by a widget's author.
*/

        WA_NoChildEventsForParent(58),
/**
 Indicates that updates are explicitly disabled for the widget; i. . it will remain disabled even when all its ancestors are set to the updates-enabled state. This implies {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_UpdatesDisabled }. This is set/cleared by {@link QWidget#setUpdatesEnabled(boolean) QWidget::setUpdatesEnabled()}.
*/

        WA_ForceUpdatesDisabled(59),
        WA_WState_Created(60),
        WA_WState_CompressKeys(61),
        WA_WState_InPaintEvent(62),
        WA_WState_Reparented(63),
        WA_WState_ConfigPending(64),
        WA_WState_Polished(66),
        WA_WState_DND(67),
        WA_WState_OwnSizePolicy(68),
        WA_WState_ExplicitShowHide(69),
/**
 This attribute has been deprecated. Use {@link QWidget#windowModality() QWidget::windowModality} instead.
*/

        WA_ShowModal(70),
/**
 Makes the widget receive mouse events for the entire widget regardless of the currently set mask, overriding {@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) QWidget::setMask()}. This is not applicable for top-level windows.
*/

        WA_MouseNoMask(71),
/**
 This attribute has been deprecated. Use {@link QWidget#windowModality() QWidget::windowModality} instead.
*/

        WA_GroupLeader(72),
/**
 Prohibits mouse events from being propagated to the widget's parent.
*/

        WA_NoMousePropagation(73),
/**
 Forces Qt to generate paint events when the mouse enters or leaves the widget. This feature is typically used when implementing custom styles; see the {@link <a href="../qtjambi-styles.html">Styles</a>} example for details.
*/

        WA_Hover(74),
        WA_InputMethodTransparent(75),
/**
 Makes Qt quit the application when the last widget with the attribute set has accepted closeEvent(). This behavior can be adjusted with the {@link QApplication#quitOnLastWindowClosed() QApplication::quitOnLastWindowClosed} property. By default the attribute is set for all widgets of type {@link com.trolltech.qt.core.Qt.WindowType Qt::Window }.
*/

        WA_QuitOnClose(76),
/**
 Set on a toplevel window when the users changes focus with the keyboard (tab, backtab, or shortcut).
*/

        WA_KeyboardFocusChange(77),
/**
 Allows data from drag and drop operations to be dropped onto the widget (see {@link QWidget#setAcceptDrops(boolean) QWidget.:setAcceptDrops()}).
*/

        WA_AcceptDrops(78),
        WA_DropSiteRegistered(79),
/**
 Makes a toplevel window inherit font and palette from its parent.
*/

        WA_WindowPropagation(80),
        WA_NoX11EventCompression(81),
        WA_TintedBackground(82),
        WA_X11OpenGLOverlay(83),
/**
 Enables tooltips for inactive windows.
*/

        WA_AlwaysShowToolTips(84),
/**
 Indicates that the native Carbon size grip should be opaque instead of transparent (the default). This attribute is only applicable to Mac OS X and is set by the widget's author.
*/

        WA_MacOpaqueSizeGrip(85),
/**
 Indicates that the widget has a style of its own. This is set/cleared by {@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) QWidget::setStyle()}.
*/

        WA_SetStyle(86),
/**
 Indicates the local should be taken into consideration in the widget.
*/

        WA_SetLocale(87),
/**
 Indicates that this widget should get a {@link com.trolltech.qt.gui.QFocusFrame QFocusFrame} around it. Some widgets draw their own focus halo regardless of this attribute. Not that the {@link QWidget#focusPolicy() QWidget::focusPolicy} also plays the main role in whether something is given focus or not, this only controls whether or not this gets the focus frame. This attribute is only applicable to Mac OS X.
*/

        WA_MacShowFocusRect(88),
/**
 Indicates the widget should have the normal size for widgets in Mac OS X. This attribute is only applicable to Mac OS X.
*/

        WA_MacNormalSize(89),
/**
 Indicates the widget should have the small size for widgets in Mac OS X. This attribute is only applicable to Mac OS X.
*/

        WA_MacSmallSize(90),
/**
 Indicates the widget should have the mini size for widgets in Mac OS X. This attribute is only applicable to Mac OS X.
*/

        WA_MacMiniSize(91),
/**
 Ignore the layout item rect from the style when laying out this widget with {@link com.trolltech.qt.gui.QLayout QLayout}. This makes a difference in QMacStyle and {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle} for some widgets.
*/

        WA_LayoutUsesWidgetRect(92),
/**
 Indicates the widget should be drawn using a styled background.
*/

        WA_StyledBackground(93),
/**
 Makes drawing to a widget with this attribute set use the Direct3D paint engine, if the Direct3D paint engine is available. <b>This functionality is experimental.</b>
*/

        WA_MSWindowsUseDirect3D(94),
        WA_CanHostQMdiSubWindowTitleBar(95),
/**
 On Mac OS X, show the tool window even when the application is not active. By default, all tool windows are hidden when the application is inactive.
*/

        WA_MacAlwaysShowToolWindow(96),
/**
 Indicates that the widget is styled using a {@link <a href="../qtjambi-stylesheet.html">style sheet</a>}.
*/

        WA_StyleSheet(97),
/**
 Show the widget without making it active.
*/

        WA_ShowWithoutActivating(98),
        WA_X11BypassTransientForHint(99),
/**
 Indicates that a native window is created for the widget. Enabling this will also force a native window for the widget's ancestors unless {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DontCreateNativeAncestors } is set.
*/

        WA_NativeWindow(100),
/**
 Indicates that the widget's ancestors are kept non-native even though the widget itself is native.
*/

        WA_DontCreateNativeAncestors(101),
/**
 Indicates the widget can choose between alternative sizes for widgets to avoid clipping. This attribute is only applicable to Mac OS X.
*/

        WA_MacVariableSize(102),
        WA_DontShowOnScreen(103),
/**
 Adds _NET_WM_WINDOW_TYPE_DESKTOP to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms.
*/

        WA_X11NetWmWindowTypeDesktop(104),
/**
 Adds _NET_WM_WINDOW_TYPE_DOCK to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms.
*/

        WA_X11NetWmWindowTypeDock(105),
/**
 Adds _NET_WM_WINDOW_TYPE_TOOLBAR to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automaticaly sets this attribute for {@link com.trolltech.qt.gui.QToolBar QToolBar}.
*/

        WA_X11NetWmWindowTypeToolBar(106),
/**
 Adds _NET_WM_WINDOW_TYPE_MENU to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for {@link com.trolltech.qt.gui.QMenu QMenu} when torn-off.
*/

        WA_X11NetWmWindowTypeMenu(107),
/**
 Adds _NET_WM_WINDOW_TYPE_UTILITY to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for the {@link com.trolltech.qt.core.Qt.WindowType Qt::Tool } window type.
*/

        WA_X11NetWmWindowTypeUtility(108),
/**
 Adds _NET_WM_WINDOW_TYPE_SPLASH to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for the {@link com.trolltech.qt.core.Qt.WindowType Qt::SplashScreen } window type.
*/

        WA_X11NetWmWindowTypeSplash(109),
/**
 Adds _NET_WM_WINDOW_TYPE_DIALOG to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for the {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog } and {@link com.trolltech.qt.core.Qt.WindowType Qt::Sheet } window types.
*/

        WA_X11NetWmWindowTypeDialog(110),
/**
 Adds _NET_WM_WINDOW_TYPE_DROPDOWN_MENU to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for QMenus added to a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}.
*/

        WA_X11NetWmWindowTypeDropDownMenu(111),
/**
 Adds _NET_WM_WINDOW_TYPE_POPUP_MENU to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        WA_X11NetWmWindowTypePopupMenu(112),
/**
 Adds _NET_WM_WINDOW_TYPE_TOOLTIP to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for the {@link com.trolltech.qt.core.Qt.WindowType Qt::ToolTip } window type.
*/

        WA_X11NetWmWindowTypeToolTip(113),
/**
 Adds _NET_WM_WINDOW_TYPE_NOTIFICATION to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms.
*/

        WA_X11NetWmWindowTypeNotification(114),
/**
 Adds _NET_WM_WINDOW_TYPE_COMBO to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute for the {@link com.trolltech.qt.gui.QComboBox QComboBox} pop-up.
*/

        WA_X11NetWmWindowTypeCombo(115),
/**
 Adds _NET_WM_WINDOW_TYPE_DND to the window's _NET_WM_WINDOW_TYPE X11 window property. See http://standards.freedesktop.org/wm-spec/ for more details. This attribute has no effect on non-X11 platforms. Note that Qt automatically sets this attribute on the feedback widget used during a drag.
*/

        WA_X11NetWmWindowTypeDND(116),
/**
 Enables resolution independence aware mode on Mac when using Carbon. This attribute has no effect on Cocoa.
*/

        WA_MacFrameworkScaled(117),
        WA_SetWindowModality(118),
        WA_WState_WindowOpacitySet(119),
/**
 Indicates that the widget should have a translucent background; i. ., any non-opaque regions of the widgets will be translucent because the widget will have an alpha channel. Setting this flag causes {@link com.trolltech.qt.core.Qt.WidgetAttribute WA_NoSystemBackground } to be set. This flag is set/cleared by the widget's author.
*/

        WA_TranslucentBackground(120),
        WA_AttributeCount(121);

        WidgetAttribute(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$WidgetAttribute constant with the specified <tt>int</tt>.</brief>
*/

        public static WidgetAttribute resolve(int value) {
            return (WidgetAttribute) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WA_Disabled;
            case 1: return WA_UnderMouse;
            case 2: return WA_MouseTracking;
            case 3: return WA_ContentsPropagated;
            case 4: return WA_OpaquePaintEvent;
            case 5: return WA_StaticContents;
            case 7: return WA_LaidOut;
            case 8: return WA_PaintOnScreen;
            case 9: return WA_NoSystemBackground;
            case 10: return WA_UpdatesDisabled;
            case 11: return WA_Mapped;
            case 12: return WA_MacNoClickThrough;
            case 13: return WA_PaintOutsidePaintEvent;
            case 14: return WA_InputMethodEnabled;
            case 15: return WA_WState_Visible;
            case 16: return WA_WState_Hidden;
            case 32: return WA_ForceDisabled;
            case 33: return WA_KeyCompression;
            case 34: return WA_PendingMoveEvent;
            case 35: return WA_PendingResizeEvent;
            case 36: return WA_SetPalette;
            case 37: return WA_SetFont;
            case 38: return WA_SetCursor;
            case 39: return WA_NoChildEventsFromChildren;
            case 41: return WA_WindowModified;
            case 42: return WA_Resized;
            case 43: return WA_Moved;
            case 44: return WA_PendingUpdate;
            case 45: return WA_InvalidSize;
            case 46: return WA_MacBrushedMetal;
            case 47: return WA_CustomWhatsThis;
            case 48: return WA_LayoutOnEntireRect;
            case 49: return WA_OutsideWSRange;
            case 50: return WA_GrabbedShortcut;
            case 51: return WA_TransparentForMouseEvents;
            case 52: return WA_PaintUnclipped;
            case 53: return WA_SetWindowIcon;
            case 54: return WA_NoMouseReplay;
            case 55: return WA_DeleteOnClose;
            case 56: return WA_RightToLeft;
            case 57: return WA_SetLayoutDirection;
            case 58: return WA_NoChildEventsForParent;
            case 59: return WA_ForceUpdatesDisabled;
            case 60: return WA_WState_Created;
            case 61: return WA_WState_CompressKeys;
            case 62: return WA_WState_InPaintEvent;
            case 63: return WA_WState_Reparented;
            case 64: return WA_WState_ConfigPending;
            case 66: return WA_WState_Polished;
            case 67: return WA_WState_DND;
            case 68: return WA_WState_OwnSizePolicy;
            case 69: return WA_WState_ExplicitShowHide;
            case 70: return WA_ShowModal;
            case 71: return WA_MouseNoMask;
            case 72: return WA_GroupLeader;
            case 73: return WA_NoMousePropagation;
            case 74: return WA_Hover;
            case 75: return WA_InputMethodTransparent;
            case 76: return WA_QuitOnClose;
            case 77: return WA_KeyboardFocusChange;
            case 78: return WA_AcceptDrops;
            case 79: return WA_DropSiteRegistered;
            case 80: return WA_WindowPropagation;
            case 81: return WA_NoX11EventCompression;
            case 82: return WA_TintedBackground;
            case 83: return WA_X11OpenGLOverlay;
            case 84: return WA_AlwaysShowToolTips;
            case 85: return WA_MacOpaqueSizeGrip;
            case 86: return WA_SetStyle;
            case 87: return WA_SetLocale;
            case 88: return WA_MacShowFocusRect;
            case 89: return WA_MacNormalSize;
            case 90: return WA_MacSmallSize;
            case 91: return WA_MacMiniSize;
            case 92: return WA_LayoutUsesWidgetRect;
            case 93: return WA_StyledBackground;
            case 94: return WA_MSWindowsUseDirect3D;
            case 95: return WA_CanHostQMdiSubWindowTitleBar;
            case 96: return WA_MacAlwaysShowToolWindow;
            case 97: return WA_StyleSheet;
            case 98: return WA_ShowWithoutActivating;
            case 99: return WA_X11BypassTransientForHint;
            case 100: return WA_NativeWindow;
            case 101: return WA_DontCreateNativeAncestors;
            case 102: return WA_MacVariableSize;
            case 103: return WA_DontShowOnScreen;
            case 104: return WA_X11NetWmWindowTypeDesktop;
            case 105: return WA_X11NetWmWindowTypeDock;
            case 106: return WA_X11NetWmWindowTypeToolBar;
            case 107: return WA_X11NetWmWindowTypeMenu;
            case 108: return WA_X11NetWmWindowTypeUtility;
            case 109: return WA_X11NetWmWindowTypeSplash;
            case 110: return WA_X11NetWmWindowTypeDialog;
            case 111: return WA_X11NetWmWindowTypeDropDownMenu;
            case 112: return WA_X11NetWmWindowTypePopupMenu;
            case 113: return WA_X11NetWmWindowTypeToolTip;
            case 114: return WA_X11NetWmWindowTypeNotification;
            case 115: return WA_X11NetWmWindowTypeCombo;
            case 116: return WA_X11NetWmWindowTypeDND;
            case 117: return WA_MacFrameworkScaled;
            case 118: return WA_SetWindowModality;
            case 119: return WA_WState_WindowOpacitySet;
            case 120: return WA_TranslucentBackground;
            case 121: return WA_AttributeCount;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used in widgets that can display both plain text and rich text, e. . {@link com.trolltech.qt.gui.QLabel QLabel}. It is used for deciding whether a text string should be interpreted as one or the other. This is normally done by passing one of the enum values to a setTextFormat() function.
*/

    public enum TextFormat implements com.trolltech.qt.QtEnumerator {
/**
 The text string is interpreted as a plain text string.
*/

        PlainText(0),
/**
 The text string is interpreted as a rich text string.
*/

        RichText(1),
/**
 The text string is interpreted as for {@link com.trolltech.qt.core.Qt.TextFormat Qt::RichText } if Qt::mightBeRichText() returns true, otherwise as {@link com.trolltech.qt.core.Qt.TextFormat Qt::PlainText }.
*/

        AutoText(2),
/**
 A special, limited text format which is only used by Q3TextEdit in an optimized mode.
*/

        LogText(3);

        TextFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$TextFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static TextFormat resolve(int value) {
            return (TextFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PlainText;
            case 1: return RichText;
            case 2: return AutoText;
            case 3: return LogText;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum type describes the different mouse buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.KeyboardModifier KeyboardModifier }, and {@link com.trolltech.qt.core.Qt.Modifier Modifier }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum MouseButton implements com.trolltech.qt.QtEnumerator {
/**
 The button state does not refer to any button (see {@link com.trolltech.qt.gui.QMouseEvent#button() QMouseEvent::button()}).
*/

        NoButton(0),
/**
 The left button is pressed, or an event refers to the left button. (The left button may be the right button on left-handed mice.)
*/

        LeftButton(1),
/**
 The right button.
*/

        RightButton(2),
/**
 The middle button.
*/

        MidButton(4),
/**
 The first X button.
*/

        XButton1(8),
/**
 The second X button.
*/

        XButton2(16),
        MouseButtonMask(255);

        MouseButton(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$MouseButtons with the specified <tt>com.trolltech.qt.core.Qt$MouseButton[]</tt> Qt$MouseButton values set.</brief>
*/

        public static MouseButtons createQFlags(MouseButton ... values) {
            return new MouseButtons(values);
        }
/**
<brief>Returns the Qt$MouseButton constant with the specified <tt>int</tt>.</brief>
*/

        public static MouseButton resolve(int value) {
            return (MouseButton) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoButton;
            case 1: return LeftButton;
            case 2: return RightButton;
            case 4: return MidButton;
            case 8: return XButton1;
            case 16: return XButton2;
            case 255: return MouseButtonMask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class MouseButtons extends com.trolltech.qt.QFlags<MouseButton> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-MouseButtons with the specified <tt>com.trolltech.qt.core.Qt.MouseButton[]</tt>. flags set.</brief>
*/

        public MouseButtons(MouseButton ... args) { super(args); }
        public MouseButtons(int value) { setValue(value); }
    }
/**
<a name="window-state"> This enum type is used to specify the current state of a top-level window. <p>The states are
*/


    public enum WindowState implements com.trolltech.qt.QtEnumerator {
/**
 The window has no state set (in normal state).
*/

        WindowNoState(0),
/**
 The window is minimized (i.e. iconified).
*/

        WindowMinimized(1),
/**
 The window is maximized with a frame around it.
*/

        WindowMaximized(2),
/**
 The window fills the entire screen without any frame around it.
*/

        WindowFullScreen(4),
/**
 The window is the active window, i.e. it has keyboard focus.
*/

        WindowActive(8);

        WindowState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$WindowStates with the specified <tt>com.trolltech.qt.core.Qt$WindowState[]</tt> Qt$WindowState values set.</brief>
*/

        public static WindowStates createQFlags(WindowState ... values) {
            return new WindowStates(values);
        }
/**
<brief>Returns the Qt$WindowState constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowState resolve(int value) {
            return (WindowState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WindowNoState;
            case 1: return WindowMinimized;
            case 2: return WindowMaximized;
            case 4: return WindowFullScreen;
            case 8: return WindowActive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class WindowStates extends com.trolltech.qt.QFlags<WindowState> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-WindowStates with the specified <tt>com.trolltech.qt.core.Qt.WindowState[]</tt>. flags set.</brief>
*/

        public WindowStates(WindowState ... args) { super(args); }
        public WindowStates(int value) { setValue(value); }
    }
/**
This enum type defines the pen styles that can be drawn using {@link com.trolltech.qt.gui.QPainter QPainter}. The styles are: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-solid.png"></center><br></td><td>  <br><center><img src="../images/qpen-dash.png"></center><br></td><td>  <br><center><img src="../images/qpen-dot.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::SolidLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DotLine }</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/qpen-dashdot.png"></center><br></td><td>  <br><center><img src="../images/qpen-dashdotdot.png"></center><br></td><td>  <br><center><img src="../images/qpen-custom.png"></center><br></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::DashDotDotLine }</td><td> {@link com.trolltech.qt.core.Qt.PenStyle Qt::CustomDashLine }</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPen QPen}. <br></DD></DT>
*/


    public enum PenStyle implements com.trolltech.qt.QtEnumerator {
/**
 no line at all. For example, {@link com.trolltech.qt.gui.QPainter#drawRect(com.trolltech.qt.core.QRect) QPainter::drawRect()} fills but does not draw any boundary line.
*/

        NoPen(0),
/**
 A plain line.
*/

        SolidLine(1),
/**
 Dashes separated by a few pixels.
*/

        DashLine(2),
/**
 Dots separated by a few pixels.
*/

        DotLine(3),
/**
 Alternate dots and dashes.
*/

        DashDotLine(4),
/**
 One dash, two dots, one dash, two dots.
*/

        DashDotDotLine(5),
/**
 A custom pattern defined using {@link com.trolltech.qt.gui.QPainterPathStroker#setDashPattern(com.trolltech.qt.core.Qt.PenStyle) QPainterPathStroker::setDashPattern()}.
*/

        CustomDashLine(6),
        MPenStyle(15);

        PenStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$PenStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static PenStyle resolve(int value) {
            return (PenStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoPen;
            case 1: return SolidLine;
            case 2: return DashLine;
            case 3: return DotLine;
            case 4: return DashDotLine;
            case 5: return DashDotDotLine;
            case 6: return CustomDashLine;
            case 15: return MPenStyle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the properties of an item. Note that checkable items need to be given both a suitable set of flags and an initial state, indicating whether the item is checked or not. This is handled automatically for model/view components, but needs to be explicitly set for instances of {@link com.trolltech.qt.gui.QListWidgetItem QListWidgetItem}, {@link com.trolltech.qt.gui.QTableWidgetItem QTableWidgetItem}, and {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ItemFlag implements com.trolltech.qt.QtEnumerator {
/**
 It does not have any properties set.
*/

        NoItemFlags(0),
/**
 It can be selected.
*/

        ItemIsSelectable(1),
/**
 It can be edited.
*/

        ItemIsEditable(2),
/**
 It can be dragged.
*/

        ItemIsDragEnabled(4),
/**
 It can be used as a drop target.
*/

        ItemIsDropEnabled(8),
/**
 It can be checked or unchecked by the user.
*/

        ItemIsUserCheckable(16),
/**
 The user can interact with the item.
*/

        ItemIsEnabled(32),
/**
 The item is checkable with three separate states.
*/

        ItemIsTristate(64);

        ItemFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.Qt$ItemFlags with the specified <tt>com.trolltech.qt.core.Qt$ItemFlag[]</tt> Qt$ItemFlag values set.</brief>
*/

        public static ItemFlags createQFlags(ItemFlag ... values) {
            return new ItemFlags(values);
        }
/**
<brief>Returns the Qt$ItemFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemFlag resolve(int value) {
            return (ItemFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoItemFlags;
            case 1: return ItemIsSelectable;
            case 2: return ItemIsEditable;
            case 4: return ItemIsDragEnabled;
            case 8: return ItemIsDropEnabled;
            case 16: return ItemIsUserCheckable;
            case 32: return ItemIsEnabled;
            case 64: return ItemIsTristate;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ItemFlags extends com.trolltech.qt.QFlags<ItemFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a Qt-ItemFlags with the specified <tt>com.trolltech.qt.core.Qt.ItemFlag[]</tt>. flags set.</brief>
*/

        public ItemFlags(ItemFlag ... args) { super(args); }
        public ItemFlags(int value) { setValue(value); }
    }

    
/**
This enum contains the types of accuracy that can be used by the {@link com.trolltech.qt.gui.QTextDocument QTextDocument} class when testing for mouse clicks on text documents. This enum is defined in the <tt>&lt;QTextDocument&gt;</tt> header file.
*/
@QtBlockedEnum
    public enum HitTestAccuracy implements com.trolltech.qt.QtEnumerator {
/**
 The point at which input occurred must coincide exactly with input-sensitive parts of the document.
*/

        ExactHit(0),
/**
 The point at which input occurred can lie close to input-sensitive parts of the document.
*/

        FuzzyHit(1);

        HitTestAccuracy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Qt$HitTestAccuracy constant with the specified <tt>int</tt>.</brief>
*/

        public static HitTestAccuracy resolve(int value) {
            return (HitTestAccuracy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ExactHit;
            case 1: return FuzzyHit;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

}
