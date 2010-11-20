package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QEvent class is the base class of all event classes. Event objects contain event parameters. Qt's main event loop ({@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()}) fetches native window system events from the event queue, translates them into QEvents, and sends the translated events to {@link com.trolltech.qt.core.QObject QObject}s. <p>In general, events come from the underlying window system ({@link com.trolltech.qt.core.QEvent#spontaneous() spontaneous()} returns true), but it is also possible to manually send events using {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::sendEvent()} and {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::postEvent()} ({@link com.trolltech.qt.core.QEvent#spontaneous() spontaneous()} returns false). <p>QObjects receive events by having their {@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) QObject::event()} function called. The function can be reimplemented in subclasses to customize event handling and add additional event types; QWidget::event() is a notable example. By default, events are dispatched to event handlers like {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()} and {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) QWidget::mouseMoveEvent()}. {@link com.trolltech.qt.core.QObject#installEventFilter(com.trolltech.qt.core.QObject) QObject::installEventFilter()} allows an object to intercept events destined for another object. <p>The basic QEvent contains only an event type parameter and an "accept" flag. The accept flag set with {@link com.trolltech.qt.core.QEvent#accept() accept()}, and cleared with {@link com.trolltech.qt.core.QEvent#ignore() ignore()}. It is set by default, but don't rely on this as subclasses may choose to clear it in their constructor. <p>Subclasses of QEvent contain additional parameters that describe the particular event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) QObject::event()}, {@link com.trolltech.qt.core.QObject#installEventFilter(com.trolltech.qt.core.QObject) QObject::installEventFilter()}, QWidget::event(), {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::sendEvent()}, {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::postEvent()}, and {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QCoreApplication::processEvents()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QEvent extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum type defines the valid event types in Qt. The event types and the specialized classes for each type are as follows: User events should have values between <tt>User</tt> and <tt>MaxUser</tt>: For convenience, you can use the {@link com.trolltech.qt.core.QEvent#registerEventType() registerEventType()} function to register and reserve a custom event type for your application. Doing so will allow you to avoid accidentally re-using a custom event type already in use elsewhere in your application.
*/

    public enum Type implements com.trolltech.qt.QtEnumerator {
/**
 Not an event.
*/

        None(0),
/**
 Regular timer events ({@link com.trolltech.qt.core.QTimerEvent QTimerEvent}).
*/

        Timer(1),
/**
 Mouse press ({@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}).
*/

        MouseButtonPress(2),
/**
 Mouse release ({@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}).
*/

        MouseButtonRelease(3),
/**
 Mouse press again ({@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}).
*/

        MouseButtonDblClick(4),
/**
 Mouse move ({@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}).
*/

        MouseMove(5),
/**
 Key press ({@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}).
*/

        KeyPress(6),
/**
 Key release ({@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}).
*/

        KeyRelease(7),
/**
 Widget gains keyboard focus ({@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}).
*/

        FocusIn(8),
/**
 Widget loses keyboard focus ({@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}).
*/

        FocusOut(9),
/**
 Mouse enters widget's boundaries.
*/

        Enter(10),
/**
 Mouse leaves widget's boundaries.
*/

        Leave(11),
/**
 Screen update necessary ({@link com.trolltech.qt.gui.QPaintEvent QPaintEvent}).
*/

        Paint(12),
/**
 Widget's position changed ({@link com.trolltech.qt.gui.QMoveEvent QMoveEvent}).
*/

        Move(13),
/**
 Widget's size changed ({@link com.trolltech.qt.gui.QResizeEvent QResizeEvent}).
*/

        Resize(14),
        Create(15),
        Destroy(16),
/**
 Widget was shown on screen ({@link com.trolltech.qt.gui.QShowEvent QShowEvent}).
*/

        Show(17),
/**
 Widget was hidden ({@link com.trolltech.qt.gui.QHideEvent QHideEvent}).
*/

        Hide(18),
/**
 Widget was closed ({@link com.trolltech.qt.gui.QCloseEvent QCloseEvent}).
*/

        Close(19),
        Quit(20),
/**
 The widget parent has changed.
*/

        ParentChange(21),
/**
 The widget parent is about to change.
*/

        ParentAboutToChange(131),
        ThreadChange(22),
/**
 Window was activated.
*/

        WindowActivate(24),
/**
 Window was deactivated.
*/

        WindowDeactivate(25),
/**
 A child widget has been shown.
*/

        ShowToParent(26),
/**
 A child widget has been hidden.
*/

        HideToParent(27),
/**
 Mouse wheel rolled ({@link com.trolltech.qt.gui.QWheelEvent QWheelEvent}).
*/

        Wheel(31),
/**
 The window title has changed.
*/

        WindowTitleChange(33),
/**
 The window's icon has changed.
*/

        WindowIconChange(34),
/**
 The application's icon has changed.
*/

        ApplicationWindowIconChange(35),
/**
 The default application font has changed.
*/

        ApplicationFontChange(36),
/**
 The default application layout direction has changed.
*/

        ApplicationLayoutDirectionChange(37),
/**
 The default application palette has changed.
*/

        ApplicationPaletteChange(38),
/**
 Palette of the widget changed.
*/

        PaletteChange(39),
/**
 The clipboard contents have changed ({@link com.trolltech.qt.gui.QClipboardEvent QClipboardEvent}).
*/

        Clipboard(40),
        Speech(42),
/**
 An asynchronous method invocation via QMetaObject.:invokeMethod().
*/

        MetaCall(43),
/**
 Socket activated, used to implement {@link com.trolltech.qt.core.QSocketNotifier QSocketNotifier}.
*/

        SockAct(50),
/**
 A Windows-specific activation event has occurred.
*/

        WinEventAct(132),
/**
 The object will be deleted after it has cleaned up.
*/

        DeferredDelete(52),
/**
 The cursor enters a widget during a drag and drop operation ({@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent}).
*/

        DragEnter(60),
/**
 A drag and drop operation is in progress ({@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}).
*/

        DragMove(61),
/**
 The cursor leaves a widget during a drag and drop operation ({@link com.trolltech.qt.gui.QDragLeaveEvent QDragLeaveEvent}).
*/

        DragLeave(62),
/**
 A drag and drop operation is completed ({@link com.trolltech.qt.gui.QDropEvent QDropEvent}).
*/

        Drop(63),
        DragResponse(64),
/**
 An object gets a child ({@link com.trolltech.qt.core.QChildEvent QChildEvent}).
*/

        ChildAdded(68),
/**
 A widget child gets polished ({@link com.trolltech.qt.core.QChildEvent QChildEvent}).
*/

        ChildPolished(69),
/**
 An object loses a child ({@link com.trolltech.qt.core.QChildEvent QChildEvent}).
*/

        ChildRemoved(71),
        ShowWindowRequest(73),
/**
 The widget should be polished.
*/

/**
 The widget is polished.
*/

        PolishRequest(74),
        Polish(75),
/**
 Widget layout needs to be redone.
*/

        LayoutRequest(76),
/**
 The widget should be repainted.
*/

        UpdateRequest(77),
/**
 The widget should be queued to be repainted at a later time.
*/

        UpdateLater(78),
        EmbeddingControl(79),
        ActivateControl(80),
        DeactivateControl(81),
/**
 Context popup menu ({@link com.trolltech.qt.gui.QContextMenuEvent QContextMenuEvent}).
*/

        ContextMenu(82),
/**
 An input method is being used ({@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}).
*/

        InputMethod(83),
/**
 Accessibility information is requested.
*/

        AccessibilityPrepare(86),
/**
 Wacom tablet move ({@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}).
*/

        TabletMove(87),
/**
 The system locale has changed.
*/

        LocaleChange(88),
/**
 The application translation changed.
*/

        LanguageChange(89),
/**
 The direction of layouts changed.
*/

        LayoutDirectionChange(90),
        Style(91),
/**
 Wacom tablet press ({@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}).
*/

        TabletPress(92),
/**
 Wacom tablet release ({@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}).
*/

        TabletRelease(93),
/**
 Ok button in decoration pressed. Supported only for Windows CE.
*/

        OkRequest(94),
        HelpRequest(95),
/**
 The main icon of a window has been dragged away ({@link com.trolltech.qt.gui.QIconDragEvent QIconDragEvent}).
*/

        IconDrag(96),
/**
 Widget's font has changed.
*/

        FontChange(97),
/**
 Widget's enabled state has changed.
*/

        EnabledChange(98),
/**
 A widget's top-level window activation state has changed.
*/

        ActivationChange(99),
/**
 Widget's style has been changed.
*/

        StyleChange(100),
/**
 Widget's icon text has been changed.
*/

        IconTextChange(101),
/**
 Widgets modification state has been changed.
*/

        ModifiedChange(102),
/**
 The mouse tracking state has changed.
*/

        MouseTrackingChange(109),
/**
 The window is blocked by a modal dialog.
*/

        WindowBlocked(103),
/**
 The window is unblocked after a modal dialog exited.
*/

        WindowUnblocked(104),
/**
 The {@link com.trolltech.qt.gui.QWidget#windowState() window's state} (minimized, maximized or full-screen) has changed ({@link com.trolltech.qt.gui.QWindowStateChangeEvent QWindowStateChangeEvent}).
*/

        WindowStateChange(105),
/**
 A tooltip was requested ({@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}).
*/

        ToolTip(110),
/**
 The widget should reveal "What's This?" help ({@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}).
*/

        WhatsThis(111),
/**
 A status tip is requested ({@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent}).
*/

        StatusTip(112),
/**
 An action has been changed ({@link com.trolltech.qt.gui.QActionEvent QActionEvent}).
*/

        ActionChanged(113),
/**
 A new action has been added ({@link com.trolltech.qt.gui.QActionEvent QActionEvent}).
*/

        ActionAdded(114),
/**
 An action has been removed ({@link com.trolltech.qt.gui.QActionEvent QActionEvent}).
*/

        ActionRemoved(115),
/**
 File open request ({@link com.trolltech.qt.gui.QFileOpenEvent QFileOpenEvent}).
*/

        FileOpen(116),
/**
 Key press in child for shortcut key handling ({@link com.trolltech.qt.gui.QShortcutEvent QShortcutEvent}).
*/

        Shortcut(117),
/**
 Key press in child, for overriding shortcut key handling ({@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}).
*/

        ShortcutOverride(51),
/**
 A link in a widget's "What's This?" help was clicked.
*/

        WhatsThisClicked(118),
/**
 The toolbar button is toggled on Mac OS X.
*/

        ToolBarChange(120),
/**
 The application has been made available to the user.
*/

        ApplicationActivate(121),
/**
 The application has been suspended, and is unavailable to the user.
*/

        ApplicationDeactivate(122),
/**
 The widget should accept the event if it has "What's This?" help.
*/

        QueryWhatsThis(123),
/**
 Send to toplevel widgets when the application enters "What's This?" mode.
*/

        EnterWhatsThisMode(124),
/**
 Send to toplevel widgets when the application leaves "What's This?" mode.
*/

        LeaveWhatsThisMode(125),
/**
 The widget's z-order has changed. This event is never sent to top level windows.
*/

        ZOrderChange(126),
/**
 The mouse cursor enters a hover widget ({@link com.trolltech.qt.gui.QHoverEvent QHoverEvent}).
*/

        HoverEnter(127),
/**
 The mouse cursor leaves a hover widget ({@link com.trolltech.qt.gui.QHoverEvent QHoverEvent}).
*/

        HoverLeave(128),
/**
 The mouse cursor moves inside a hover widget ({@link com.trolltech.qt.gui.QHoverEvent QHoverEvent}).
*/

        HoverMove(129),
/**
 Used to query accessibility help texts ({@link com.trolltech.qt.gui.QAccessibleEvent QAccessibleEvent}).
*/

        AccessibilityHelp(119),
/**
 Used to query accessibility description texts ({@link com.trolltech.qt.gui.QAccessibleEvent QAccessibleEvent}).
*/

        AccessibilityDescription(130),
        AcceptDropsChange(152),
/**
 The window's menu bar has been updated.
*/

        MenubarUpdated(153),
        ZeroTimerEvent(154),
/**
 Move mouse in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}).
*/

        GraphicsSceneMouseMove(155),
/**
 Mouse press in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}).
*/

        GraphicsSceneMousePress(156),
/**
 Mouse release in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}).
*/

        GraphicsSceneMouseRelease(157),
/**
 Mouse press again (double click) in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneMouseEvent QGraphicsSceneMouseEvent}).
*/

        GraphicsSceneMouseDoubleClick(158),
/**
 Context popup menu over a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent QGraphicsSceneContextMenuEvent}).
*/

        GraphicsSceneContextMenu(159),
/**
 The mouse cursor enters a hover item in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}).
*/

        GraphicsSceneHoverEnter(160),
/**
 The mouse cursor moves inside a hover item in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}).
*/

        GraphicsSceneHoverMove(161),
/**
 The mouse cursor leaves a hover item in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}).
*/

        GraphicsSceneHoverLeave(162),
/**
 The user requests help for a graphics scene ({@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}).
*/

        GraphicsSceneHelp(163),
/**
 The cursor enters a graphics scene during a drag and drop operation.
*/

        GraphicsSceneDragEnter(164),
/**
 A drag and drop operation is in progress over a scene.
*/

        GraphicsSceneDragMove(165),
/**
 The cursor leaves a graphics scene during a drag and drop operation.
*/

        GraphicsSceneDragLeave(166),
/**
 A drag and drop operation is completed over a scene.
*/

        GraphicsSceneDrop(167),
/**
 Mouse wheel rolled in a graphics scene ({@link com.trolltech.qt.gui.QGraphicsSceneWheelEvent QGraphicsSceneWheelEvent}).
*/

        GraphicsSceneWheel(168),
/**
 The keyboard layout has changed.
*/

        KeyboardLayoutChange(169),
/**
 A dynamic property was added, changed or removed from the object.
*/

        DynamicPropertyChange(170),
/**
 Wacom tablet enter proximity event ({@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}), sent to {@link com.trolltech.qt.gui.QApplication QApplication}.
*/

        TabletEnterProximity(171),
/**
 Wacom tablet leave proximity event ({@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}), sent to {@link com.trolltech.qt.gui.QApplication QApplication}.
*/

        TabletLeaveProximity(172),
/**
 A mouse move occurred outside the client area.
*/

        NonClientAreaMouseMove(173),
/**
 A mouse button press occurred outside the client area.
*/

        NonClientAreaMouseButtonPress(174),
/**
 A mouse button release occurred outside the client area.
*/

        NonClientAreaMouseButtonRelease(175),
/**
 A mouse double click occurred outside the client area.
*/

        NonClientAreaMouseButtonDblClick(176),
/**
 The user changed his widget sizes (Mac OS X only).
*/

        MacSizeChange(177),
/**
 The margins of the widget's content rect changed.
*/

        ContentsRectChange(178),
        MacGLWindowChange(179),
        FutureCallOut(180),
/**
 Widget was resized ({@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent QGraphicsSceneResizeEvent}).
*/

        GraphicsSceneResize(181),
/**
 Widget was moved ({@link com.trolltech.qt.gui.QGraphicsSceneMoveEvent QGraphicsSceneMoveEvent}).
*/

        GraphicsSceneMove(182),
/**
 The widget's cursor has changed.
*/

        CursorChange(183),
/**
 The widget's tooltip has changed.
*/

        ToolTipChange(184),
        NetworkReplyUpdated(185),
/**
 Item gains mouse grab ({@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} only).
*/

        GrabMouse(186),
/**
 Item loses mouse grab ({@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} only).
*/

        UngrabMouse(187),
/**
 Item gains keyboard grab ({@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} only).
*/

        GrabKeyboard(188),
/**
 Item loses keyboard grab ({@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} only).
*/

        UngrabKeyboard(189),
        CocoaRequestModal(190),
/**
 User-defined event.
*/

        User(1000),
/**
 Last user event ID.
*/

        MaxUser(65535),
        CustomEnum(0);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QEvent$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return Timer;
            case 2: return MouseButtonPress;
            case 3: return MouseButtonRelease;
            case 4: return MouseButtonDblClick;
            case 5: return MouseMove;
            case 6: return KeyPress;
            case 7: return KeyRelease;
            case 8: return FocusIn;
            case 9: return FocusOut;
            case 10: return Enter;
            case 11: return Leave;
            case 12: return Paint;
            case 13: return Move;
            case 14: return Resize;
            case 15: return Create;
            case 16: return Destroy;
            case 17: return Show;
            case 18: return Hide;
            case 19: return Close;
            case 20: return Quit;
            case 21: return ParentChange;
            case 131: return ParentAboutToChange;
            case 22: return ThreadChange;
            case 24: return WindowActivate;
            case 25: return WindowDeactivate;
            case 26: return ShowToParent;
            case 27: return HideToParent;
            case 31: return Wheel;
            case 33: return WindowTitleChange;
            case 34: return WindowIconChange;
            case 35: return ApplicationWindowIconChange;
            case 36: return ApplicationFontChange;
            case 37: return ApplicationLayoutDirectionChange;
            case 38: return ApplicationPaletteChange;
            case 39: return PaletteChange;
            case 40: return Clipboard;
            case 42: return Speech;
            case 43: return MetaCall;
            case 50: return SockAct;
            case 132: return WinEventAct;
            case 52: return DeferredDelete;
            case 60: return DragEnter;
            case 61: return DragMove;
            case 62: return DragLeave;
            case 63: return Drop;
            case 64: return DragResponse;
            case 68: return ChildAdded;
            case 69: return ChildPolished;
            case 71: return ChildRemoved;
            case 73: return ShowWindowRequest;
            case 74: return PolishRequest;
            case 75: return Polish;
            case 76: return LayoutRequest;
            case 77: return UpdateRequest;
            case 78: return UpdateLater;
            case 79: return EmbeddingControl;
            case 80: return ActivateControl;
            case 81: return DeactivateControl;
            case 82: return ContextMenu;
            case 83: return InputMethod;
            case 86: return AccessibilityPrepare;
            case 87: return TabletMove;
            case 88: return LocaleChange;
            case 89: return LanguageChange;
            case 90: return LayoutDirectionChange;
            case 91: return Style;
            case 92: return TabletPress;
            case 93: return TabletRelease;
            case 94: return OkRequest;
            case 95: return HelpRequest;
            case 96: return IconDrag;
            case 97: return FontChange;
            case 98: return EnabledChange;
            case 99: return ActivationChange;
            case 100: return StyleChange;
            case 101: return IconTextChange;
            case 102: return ModifiedChange;
            case 109: return MouseTrackingChange;
            case 103: return WindowBlocked;
            case 104: return WindowUnblocked;
            case 105: return WindowStateChange;
            case 110: return ToolTip;
            case 111: return WhatsThis;
            case 112: return StatusTip;
            case 113: return ActionChanged;
            case 114: return ActionAdded;
            case 115: return ActionRemoved;
            case 116: return FileOpen;
            case 117: return Shortcut;
            case 51: return ShortcutOverride;
            case 118: return WhatsThisClicked;
            case 120: return ToolBarChange;
            case 121: return ApplicationActivate;
            case 122: return ApplicationDeactivate;
            case 123: return QueryWhatsThis;
            case 124: return EnterWhatsThisMode;
            case 125: return LeaveWhatsThisMode;
            case 126: return ZOrderChange;
            case 127: return HoverEnter;
            case 128: return HoverLeave;
            case 129: return HoverMove;
            case 119: return AccessibilityHelp;
            case 130: return AccessibilityDescription;
            case 152: return AcceptDropsChange;
            case 153: return MenubarUpdated;
            case 154: return ZeroTimerEvent;
            case 155: return GraphicsSceneMouseMove;
            case 156: return GraphicsSceneMousePress;
            case 157: return GraphicsSceneMouseRelease;
            case 158: return GraphicsSceneMouseDoubleClick;
            case 159: return GraphicsSceneContextMenu;
            case 160: return GraphicsSceneHoverEnter;
            case 161: return GraphicsSceneHoverMove;
            case 162: return GraphicsSceneHoverLeave;
            case 163: return GraphicsSceneHelp;
            case 164: return GraphicsSceneDragEnter;
            case 165: return GraphicsSceneDragMove;
            case 166: return GraphicsSceneDragLeave;
            case 167: return GraphicsSceneDrop;
            case 168: return GraphicsSceneWheel;
            case 169: return KeyboardLayoutChange;
            case 170: return DynamicPropertyChange;
            case 171: return TabletEnterProximity;
            case 172: return TabletLeaveProximity;
            case 173: return NonClientAreaMouseMove;
            case 174: return NonClientAreaMouseButtonPress;
            case 175: return NonClientAreaMouseButtonRelease;
            case 176: return NonClientAreaMouseButtonDblClick;
            case 177: return MacSizeChange;
            case 178: return ContentsRectChange;
            case 179: return MacGLWindowChange;
            case 180: return FutureCallOut;
            case 181: return GraphicsSceneResize;
            case 182: return GraphicsSceneMove;
            case 183: return CursorChange;
            case 184: return ToolTipChange;
            case 185: return NetworkReplyUpdated;
            case 186: return GrabMouse;
            case 187: return UngrabMouse;
            case 188: return GrabKeyboard;
            case 189: return UngrabKeyboard;
            case 190: return CocoaRequestModal;
            case 1000: return User;
            case 65535: return MaxUser;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, Type>();
            Type e = enumCache.get(value);
            if (e == null) {
                e = (Type) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), Type.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, Type> enumCache;    }


/**
Contructs an event object of type <tt>type</tt>.
*/

    public QEvent(com.trolltech.qt.core.QEvent.Type type){
        super((QPrivateConstructor)null);
        __qt_QEvent_Type(type.value());
    }

    native void __qt_QEvent_Type(int type);

/**
Sets the accept flag of the event object, the equivalent of calling setAccepted(true). <p>Setting the accept parameter indicates that the event receiver wants the event. Unwanted events might be propagated to the parent widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#ignore() ignore()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void accept()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accept(nativeId());
    }
    @QtBlockedSlot
    native void __qt_accept(long __this__nativeId);

/**
Clears the accept flag parameter of the event object, the equivalent of calling setAccepted(false). <p>Clearing the accept parameter indicates that the event receiver does not want the event. Unwanted events might be propgated to the parent widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#accept() accept()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ignore()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ignore(nativeId());
    }
    @QtBlockedSlot
    native void __qt_ignore(long __this__nativeId);

/**
the accept flag of the event object <p>Setting the accept parameter indicates that the event receiver wants the event. Unwanted events might be propagated to the parent widget. By default, {@link com.trolltech.qt.core.QEvent#isAccepted() isAccepted()} is set to true, but don't rely on this as subclasses may choose to clear it in their constructor. <p>For convenience, the accept flag can also be set with {@link com.trolltech.qt.core.QEvent#accept() accept()}, and cleared with {@link com.trolltech.qt.core.QEvent#ignore() ignore()}.
*/

    @QtBlockedSlot
    public final boolean isAccepted()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAccepted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAccepted(long __this__nativeId);

/**
the accept flag of the event object <p>Setting the accept parameter indicates that the event receiver wants the event. Unwanted events might be propagated to the parent widget. By default, {@link com.trolltech.qt.core.QEvent#isAccepted() isAccepted()} is set to true, but don't rely on this as subclasses may choose to clear it in their constructor. <p>For convenience, the accept flag can also be set with {@link com.trolltech.qt.core.QEvent#accept() accept()}, and cleared with {@link com.trolltech.qt.core.QEvent#ignore() ignore()}.
*/

    @QtBlockedSlot
    public final void setAccepted(boolean accepted)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccepted_boolean(nativeId(), accepted);
    }
    @QtBlockedSlot
    native void __qt_setAccepted_boolean(long __this__nativeId, boolean accepted);

/**
Returns true if the event originated outside the application (a system event); otherwise returns false. <p>The return value of this function is not defined for paint events.
*/

    @QtBlockedSlot
    public final boolean spontaneous()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spontaneous(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_spontaneous(long __this__nativeId);

/**
Returns the event type.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QEvent.Type type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QEvent.Type.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);


/**
Registers and returns a custom event type. The <tt>hint</tt> provided will be used if it is available, otherwise it will return a value between {@link com.trolltech.qt.core.QEvent.Type QEvent::User } and {@link com.trolltech.qt.core.QEvent.Type QEvent::MaxUser } that has not yet been registered. The <tt>hint</tt> is ignored if its value is not between {@link com.trolltech.qt.core.QEvent.Type QEvent::User } and {@link com.trolltech.qt.core.QEvent.Type QEvent::MaxUser }.
*/

    public static int registerEventType() {
        return registerEventType((int)-1);
    }
/**
Registers and returns a custom event type. The <tt>hint</tt> provided will be used if it is available, otherwise it will return a value between {@link com.trolltech.qt.core.QEvent.Type QEvent::User } and {@link com.trolltech.qt.core.QEvent.Type QEvent::MaxUser } that has not yet been registered. The <tt>hint</tt> is ignored if its value is not between {@link com.trolltech.qt.core.QEvent.Type QEvent::User } and {@link com.trolltech.qt.core.QEvent.Type QEvent::MaxUser }.
*/

    public native static int registerEventType(int hint);

/**
Sets the type of this QEvent to <tt>t</tt>.
*/

    @QtBlockedSlot
    protected final void setT(char t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setT_char(nativeId(), t);
    }
    @QtBlockedSlot
    native void __qt_setT_char(long __this__nativeId, char t);

/**
Returns the type of this QEvent.
*/

    @QtBlockedSlot
    protected final char t()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_t(nativeId());
    }
    @QtBlockedSlot
    native char __qt_t(long __this__nativeId);

/**
@exclude
*/

    public static native QEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(type=" + type().name() + ")";
    }
}
