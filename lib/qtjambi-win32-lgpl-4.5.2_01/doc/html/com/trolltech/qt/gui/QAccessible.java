package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessible class provides enums and static functions relating to accessibility. Accessible applications can be used by people who are not able to use applications by conventional means. <p>The functions in this class are used for communication between accessible applications (also called AT Servers) and accessibility tools (AT Clients), such as screen readers and braille displays. Clients and servers communicate in the following way: <ul><li> AT Servers notify the clients about events through calls to the {@link com.trolltech.qt.gui.QAccessible#updateAccessibility(com.trolltech.qt.core.QObject, int, com.trolltech.qt.gui.QAccessible.Event) updateAccessibility()} function.</li><li> AT Clients request information about the objects in the server. The {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} class is the core interface, and encapsulates this information in a pure virtual API. Implementations of the interface are provided by Qt through the {@link com.trolltech.qt.gui.QAccessible#queryAccessibleInterface(com.trolltech.qt.core.QObject) queryAccessibleInterface()} API.</li></ul> The communication between servers and clients is initialized by the {@link com.trolltech.qt.gui.QAccessible#setRootObject(com.trolltech.qt.core.QObject) setRootObject()} function. Function pointers can be installed to replace or extend the default behavior of the static functions in QAccessible. <p>Qt supports Microsoft Active Accessibility (MSAA), Mac OS X Accessibility, and the Unix/X11 AT-SPI standard. Other backends can be supported using {@link com.trolltech.qt.gui.QAccessibleBridge QAccessibleBridge}. <p>In addition to QAccessible's static functions, Qt offers one generic interface, {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface}, that can be used to wrap all widgets and objects (e.g., {@link com.trolltech.qt.gui.QPushButton QPushButton}). This single interface provides all the metadata necessary for the assistive technologies. Qt provides implementations of this interface for its built-in widgets as plugins. <p>When you develop custom widgets, you can create custom subclasses of {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} and distribute them as plugins (using {@link com.trolltech.qt.gui.QAccessiblePlugin QAccessiblePlugin}) or compile them into the application. Likewise, Qt's predefined accessibility support can be built as plugin (the default) or directly into the Qt library. The main advantage of using plugins is that the accessibility classes are only loaded into memory if they are actually used; they don't slow down the common case where no assistive technology is being used. <p>Qt also includes two convenience classes, {@link com.trolltech.qt.gui.QAccessibleObject QAccessibleObject} and {@link com.trolltech.qt.gui.QAccessibleWidget QAccessibleWidget}, that inherit from {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} and provide the lowest common denominator of metadata (e.g., widget geometry, window title, basic help text). You can use them as base classes when wrapping your custom {@link com.trolltech.qt.core.QObject QObject} or {@link com.trolltech.qt.gui.QWidget QWidget} subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAccessible extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the possible types of methods that can be invoked on an accessible object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#invokeMethod(com.trolltech.qt.gui.QAccessible.Method, int, java.util.List) QAccessibleInterface::invokeMethod()}. <br></DD></DT>
*/

    public enum Method implements com.trolltech.qt.QtEnumerator {
/**

*/

        ListSupportedMethods(0),
/**

*/

        SetCursorPosition(1),
/**

*/

        GetCursorPosition(2),
        ForegroundColor(3),
        BackgroundColor(4);

        Method(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAccessible$Method constant with the specified <tt>int</tt>.</brief>
*/

        public static Method resolve(int value) {
            return (Method) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ListSupportedMethods;
            case 1: return SetCursorPosition;
            case 2: return GetCursorPosition;
            case 3: return ForegroundColor;
            case 4: return BackgroundColor;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum defines the role of an accessible object. The roles are:
*/

    public enum Role implements com.trolltech.qt.QtEnumerator {
/**
 The object has no role. This usually indicates an invalid object.
*/

        NoRole(0),
/**
 The title bar caption of a window.
*/

        TitleBar(1),
/**
 A menu bar from which menus are opened by the user.
*/

        MenuBar(2),
/**
 A scroll bar, which allows the user to scroll the visible area.
*/

        ScrollBar(3),
/**
 A grip that the user can drag to change the size of widgets.
*/

        Grip(4),
/**
 An object that represents a sound.
*/

        Sound(5),
/**
 An object that represents the mouse cursor.
*/

        Cursor(6),
/**
 An object that represents the system caret (text cursor).
*/

        Caret(7),
/**
 An object that is used to alert the user.
*/

        AlertMessage(8),
/**
 A top level window.
*/

        Window(9),
/**
 The client area in a window.
*/

        Client(10),
/**
 A menu which lists options that the user can select to perform an action.
*/

        PopupMenu(11),
/**
 An item in a menu or menu bar.
*/

        MenuItem(12),
/**
 A tool tip which provides information about other objects.
*/

        ToolTip(13),
/**
 The application's main window.
*/

        Application(14),
/**
 A document window, usually in an MDI environment.
*/

        Document(15),
/**
 A generic container.
*/

        Pane(16),
/**
 An object that displays a graphical representation of data.
*/

        Chart(17),
/**
 A dialog box.
*/

/**
 An object that represents a dial or knob.
*/

        Dialog(18),
/**
 An object that represents a border.
*/

        Border(19),
/**
 An object that represents a logical grouping of other objects.
*/

        Grouping(20),
/**
 A separator that divides space into logical areas.
*/

        Separator(21),
/**
 A tool bar, which groups widgets that the user accesses frequently.
*/

        ToolBar(22),
/**
 A status bar.
*/

        StatusBar(23),
/**
 A table representing data in a grid of rows and columns.
*/

        Table(24),
/**
 A header for a column of data.
*/

/**
 A column of cells, usually within a table.
*/

        ColumnHeader(25),
/**
 A header for a row of data.
*/

/**
 A row of cells, usually within a table.
*/

        RowHeader(26),
        Column(27),
        Row(28),
/**
 A cell in a table.
*/

        Cell(29),
/**
 A link to something else.
*/

        Link(30),
/**
 An object that displays help in a separate, short lived window.
*/

        HelpBalloon(31),
/**
 An object that provids interactive help.
*/

        Assistant(32),
/**
 A list of items, from which the user can select one or more items.
*/

        List(33),
/**
 An item in a list of items.
*/

        ListItem(34),
/**
 A list of items in a tree structure.
*/

        Tree(35),
/**
 An item in a tree structure.
*/

        TreeItem(36),
/**
 A page tab that the user can select to switch to a different page in a dialog.
*/

        PageTab(37),
/**
 A property page where the user can change options and settings.
*/

        PropertyPage(38),
/**
 An indicator that represents a current value or item.
*/

        Indicator(39),
/**
 A graphic or picture, e.g. an icon.
*/

        Graphic(40),
/**
 Static text, such as labels for other widgets.
*/

        StaticText(41),
/**
 Editable text
*/

        EditableText(42),
/**
 A button.
*/

        PushButton(43),
/**
 An object that represents an option that can be checked or unchecked. Some options provide a "mixed" state, e.g. neither checked nor unchecked.
*/

        CheckBox(44),
/**
 An object that represents an option that is mutually exclusive with other options.
*/

        RadioButton(45),
/**
 A list of choices that the user can select from.
*/

        ComboBox(46),
/**
 The object displays the progress of an operation in progress.
*/

        ProgressBar(48),
        Dial(49),
/**
 A hotkey field that allows the user to enter a key sequence.
*/

        HotkeyField(50),
/**
 A slider that allows the user to select a value within a given range.
*/

        Slider(51),
/**
 A spin box widget that allows the user to enter a value within a given range.
*/

        SpinBox(52),
/**
 An object that displays graphics that the user can interact with.
*/

        Canvas(53),
/**
 An object that displays an animation.
*/

        Animation(54),
/**
 An object that represents a mathematical equation.
*/

        Equation(55),
/**
 A button that drops down a list of items.
*/

        ButtonDropDown(56),
/**
 A button that drops down a menu.
*/

        ButtonMenu(57),
/**
 A button that drops down a grid.
*/

        ButtonDropGrid(58),
/**
 Blank space between other objects.
*/

        Whitespace(59),
/**
 A list of page tabs.
*/

        PageTabList(60),
/**
 A clock displaying time.
*/

        Clock(61),
/**
 A splitter distributing available space between its child widgets.
*/

        Splitter(62),
/**
 An object that can contain layered children, e.g. in a stack.
*/

        LayeredPane(63),
/**
 The first value to be used for user defined roles.
*/

        UserRole(65535);

        Role(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAccessible$Role constant with the specified <tt>int</tt>.</brief>
*/

        public static Role resolve(int value) {
            return (Role) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoRole;
            case 1: return TitleBar;
            case 2: return MenuBar;
            case 3: return ScrollBar;
            case 4: return Grip;
            case 5: return Sound;
            case 6: return Cursor;
            case 7: return Caret;
            case 8: return AlertMessage;
            case 9: return Window;
            case 10: return Client;
            case 11: return PopupMenu;
            case 12: return MenuItem;
            case 13: return ToolTip;
            case 14: return Application;
            case 15: return Document;
            case 16: return Pane;
            case 17: return Chart;
            case 18: return Dialog;
            case 19: return Border;
            case 20: return Grouping;
            case 21: return Separator;
            case 22: return ToolBar;
            case 23: return StatusBar;
            case 24: return Table;
            case 25: return ColumnHeader;
            case 26: return RowHeader;
            case 27: return Column;
            case 28: return Row;
            case 29: return Cell;
            case 30: return Link;
            case 31: return HelpBalloon;
            case 32: return Assistant;
            case 33: return List;
            case 34: return ListItem;
            case 35: return Tree;
            case 36: return TreeItem;
            case 37: return PageTab;
            case 38: return PropertyPage;
            case 39: return Indicator;
            case 40: return Graphic;
            case 41: return StaticText;
            case 42: return EditableText;
            case 43: return PushButton;
            case 44: return CheckBox;
            case 45: return RadioButton;
            case 46: return ComboBox;
            case 48: return ProgressBar;
            case 49: return Dial;
            case 50: return HotkeyField;
            case 51: return Slider;
            case 52: return SpinBox;
            case 53: return Canvas;
            case 54: return Animation;
            case 55: return Equation;
            case 56: return ButtonDropDown;
            case 57: return ButtonMenu;
            case 58: return ButtonDropGrid;
            case 59: return Whitespace;
            case 60: return PageTabList;
            case 61: return Clock;
            case 62: return Splitter;
            case 63: return LayeredPane;
            case 65535: return UserRole;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the possible types of action that can occur.
*/

    public enum Action implements com.trolltech.qt.QtEnumerator {
/**

*/

        DefaultAction(0),
/**

*/

        Press(-1),
/**

*/

        SetFocus(-2),
/**

*/

        Increase(-3),
/**

*/

        Decrease(-4),
/**

*/

        Accept(-5),
/**

*/

        Cancel(-6),
/**

*/

        Select(-7),
/**

*/

        ClearSelection(-8),
/**

*/

        RemoveSelection(-9),
/**

*/

        ExtendSelection(-10),
/**

*/

        AddToSelection(-11),
;

        Action(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAccessible$Action constant with the specified <tt>int</tt>.</brief>
*/

        public static Action resolve(int value) {
            return (Action) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DefaultAction;
            case -1: return Press;
            case -2: return SetFocus;
            case -3: return Increase;
            case -4: return Decrease;
            case -5: return Accept;
            case -6: return Cancel;
            case -7: return Select;
            case -8: return ClearSelection;
            case -9: return RemoveSelection;
            case -10: return ExtendSelection;
            case -11: return AddToSelection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines accessible event types.
*/

    public enum Event implements com.trolltech.qt.QtEnumerator {
/**
 A sound has been played by an object
*/

        SoundPlayed(1),
/**
 A system alert (e. ., a message from a {@link com.trolltech.qt.gui.QMessageBox QMessageBox})
*/

        Alert(2),
/**
 A window has been activated (i.e., a new window has gained focus on the desktop)
*/

        ForegroundChanged(3),
/**
 A menu has been opened on the menubar (Qt uses {@link com.trolltech.qt.gui.QAccessible.Event PopupMenuStart } for all menus)
*/

        MenuStart(4),
/**
 A menu has been closed (Qt uses {@link com.trolltech.qt.gui.QAccessible.Event PopupMenuEnd } for all menus)
*/

        MenuEnd(5),
/**
 A popupmenu has opened.
*/

        PopupMenuStart(6),
/**
 A popup menu has closed.
*/

        PopupMenuEnd(7),
/**
 Context help ({@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}) for an object is initiated.
*/

        ContextHelpStart(12),
/**
 Context help ({@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}) for an object is finished.
*/

        ContextHelpEnd(13),
/**
 A Drag & Drop operation is about to be initiated.
*/

        DragDropStart(14),
/**
 A Drag & Drop operation is about to finished.
*/

        DragDropEnd(15),
/**
 A dialog ({@link com.trolltech.qt.gui.QDialog QDialog}) has been set visible.
*/

        DialogStart(16),
/**
 A dialog ({@link com.trolltech.qt.gui.QDialog QDialog}) is been hidden
*/

        DialogEnd(17),
/**
 A scrollbar scroll operation is about to start (i.e., the mouse has pressed on the slider handle)
*/

        ScrollingStart(18),
/**
 A scrollbar scroll operation has ended (the mouse has released the slider handle)
*/

        ScrollingEnd(19),
/**
 A menu item is triggered.
*/

        MenuCommand(24),
/**
 A new object is created.
*/

        ObjectCreated(32768),
/**
 An object is deleted.
*/

        ObjectDestroyed(32769),
/**
 An object is displayed (i. ., with {@link com.trolltech.qt.gui.QWidget#show() QWidget::show()}).
*/

        ObjectShow(32770),
/**
 An object is hidden (i. ., with {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()}). Any children the object that is hidden has do not send this event. It is not send when an object is hidden as it is being obcured by others.
*/

        ObjectHide(32771),
/**
 A layout or item view has added, removed, or moved an object (Qt does not use this event).
*/

        ObjectReorder(32772),
/**
 An object has gained keyboard focus.
*/

        Focus(32773),
/**
 The selection has changed in a menu or item view.
*/

        Selection(32774),
/**
 An item has been added to the selection in an item view.
*/

        SelectionAdd(32775),
/**
 An item has been removed from an item view selection.
*/

        SelectionRemove(32776),
/**
 Several changes to a selection has occurred in an item view.
*/

        SelectionWithin(32777),
/**
 The QAccessible.:State of an object has changed.
*/

        StateChanged(32778),
/**
 An objects location on the screen changed
*/

        LocationChanged(32779),
/**
 The {@link com.trolltech.qt.gui.QAccessible.Text QAccessible::Name } property of an object has changed
*/

        NameChanged(32780),
/**
 The objects {@link com.trolltech.qt.gui.QAccessible.Text QAccessible::Description } changed.
*/

        DescriptionChanged(32781),
/**
 The {@link com.trolltech.qt.gui.QAccessible.Text QAccessible::Value } of an object has changed.
*/

        ValueChanged(32782),
/**
 An objects parent object changed.
*/

        ParentChanged(32783),
/**
 The {@link com.trolltech.qt.gui.QAccessible.Text QAccessible::Help } text property of an object has changed
*/

        HelpChanged(32928),
/**
 The default {@link com.trolltech.qt.gui.QAccessible.Action QAccessible::Action } for the accessible object changed
*/

        DefaultActionChanged(32944),
/**

*/

        AcceleratorChanged(32960);

        Event(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAccessible$Event constant with the specified <tt>int</tt>.</brief>
*/

        public static Event resolve(int value) {
            return (Event) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return SoundPlayed;
            case 2: return Alert;
            case 3: return ForegroundChanged;
            case 4: return MenuStart;
            case 5: return MenuEnd;
            case 6: return PopupMenuStart;
            case 7: return PopupMenuEnd;
            case 12: return ContextHelpStart;
            case 13: return ContextHelpEnd;
            case 14: return DragDropStart;
            case 15: return DragDropEnd;
            case 16: return DialogStart;
            case 17: return DialogEnd;
            case 18: return ScrollingStart;
            case 19: return ScrollingEnd;
            case 24: return MenuCommand;
            case 32768: return ObjectCreated;
            case 32769: return ObjectDestroyed;
            case 32770: return ObjectShow;
            case 32771: return ObjectHide;
            case 32772: return ObjectReorder;
            case 32773: return Focus;
            case 32774: return Selection;
            case 32775: return SelectionAdd;
            case 32776: return SelectionRemove;
            case 32777: return SelectionWithin;
            case 32778: return StateChanged;
            case 32779: return LocationChanged;
            case 32780: return NameChanged;
            case 32781: return DescriptionChanged;
            case 32782: return ValueChanged;
            case 32783: return ParentChanged;
            case 32928: return HelpChanged;
            case 32944: return DefaultActionChanged;
            case 32960: return AcceleratorChanged;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines bit flags that can be combined to indicate the relationship between two accessible objects. Implementations of relationTo() return a combination of these flags. Some values are mutually exclusive. <p>Implementations of navigate() can accept only one distinct value.
*/

    public enum RelationFlag implements com.trolltech.qt.QtEnumerator {
/**
 The objects are unrelated.
*/

        Unrelated(0),
/**
 The objects are the same.
*/

        Self(1),
/**
 The first object is a parent of the second object.
*/

        Ancestor(2),
/**
 The first object is a direct child of the second object.
*/

        Child(4),
/**
 The first object is an indirect child of the second object.
*/

        Descendent(8),
/**
 The objects are siblings.
*/

        Sibling(16),
        HierarchyMask(255),
/**
 The first object is above the second object.
*/

        Up(256),
/**
 The first object is below the second object.
*/

        Down(512),
/**
 The first object is left of the second object.
*/

        Left(1024),
/**
 The first object is right of the second object.
*/

        Right(2048),
/**
 The first object covers the second object.
*/

        Covers(4096),
/**
 The first object is covered by the second object.
*/

        Covered(8192),
        GeometryMask(65280),
/**
 The first object is the second object's focus child.
*/

        FocusChild(65536),
/**
 The first object is the label of the second object.
*/

        Label(131072),
/**
 The first object is labelled by the second object.
*/

        Labelled(262144),
/**
 The first object controls the second object.
*/

        Controller(524288),
/**
 The first object is controlled by the second object.
*/

        Controlled(1048576),
        LogicalMask(16711680);

        RelationFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QAccessible$Relation with the specified <tt>com.trolltech.qt.gui.QAccessible$RelationFlag[]</tt> QAccessible$RelationFlag values set.</brief>
*/

        public static Relation createQFlags(RelationFlag ... values) {
            return new Relation(values);
        }
/**
<brief>Returns the QAccessible$RelationFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static RelationFlag resolve(int value) {
            return (RelationFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Unrelated;
            case 1: return Self;
            case 2: return Ancestor;
            case 4: return Child;
            case 8: return Descendent;
            case 16: return Sibling;
            case 255: return HierarchyMask;
            case 256: return Up;
            case 512: return Down;
            case 1024: return Left;
            case 2048: return Right;
            case 4096: return Covers;
            case 8192: return Covered;
            case 65280: return GeometryMask;
            case 65536: return FocusChild;
            case 131072: return Label;
            case 262144: return Labelled;
            case 524288: return Controller;
            case 1048576: return Controlled;
            case 16711680: return LogicalMask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Relation extends com.trolltech.qt.QFlags<RelationFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAccessible-Relation with the specified <tt>com.trolltech.qt.gui.QAccessible.RelationFlag[]</tt>. flags set.</brief>
*/

        public Relation(RelationFlag ... args) { super(args); }
        public Relation(int value) { setValue(value); }
    }
/**
This enum type defines bit flags that can be combined to indicate the state of an accessible object. The values are: Implementations of {@link com.trolltech.qt.gui.QAccessibleInterface#state(int) QAccessibleInterface::state()} return a combination of these flags.
*/


    public enum StateFlag implements com.trolltech.qt.QtEnumerator {
/**
 The normal state.
*/

        Normal(0),
/**
 The object is unavailable to the user, e.g. a disabled widget.
*/

        Unavailable(1),
/**
 The object is selected.
*/

        Selected(2),
/**
 The object has keyboard focus.
*/

        Focused(4),
/**
 The object is pressed.
*/

        Pressed(8),
/**
 The object's check box is checked.
*/

        Checked(16),
/**
 The state of the object is not determined, e.g. a tri-state check box that is neither checked nor unchecked.
*/

        Mixed(32),
/**
 The object can usually be edited, but is explicitly set to read-only.
*/

        ReadOnly(64),
/**
 The object's appearance is sensitive to the mouse cursor position.
*/

        HotTracked(128),
/**
 The object represents the default button in a dialog.
*/

        DefaultButton(256),
/**
 The object is expandable, and currently the children are visible.
*/

        Expanded(512),
/**
 The object is collapsed, e.g. a closed listview item, or an iconified window.
*/

        Collapsed(1024),
/**
 The object cannot accept input at the moment.
*/

        Busy(2048),
/**
 The object displays scrolling contents, e.g. a log view.
*/

        Marqueed(8192),
/**
 The object's appearance changes frequently.
*/

        Animated(16384),
/**
 The object is not visible to the user.
*/

        Invisible(32768),
/**
 The object is clipped by the visible area. Objects that are off screen are also invisible.
*/

        Offscreen(65536),
/**
 The object can be resized, e.g. top-level windows.
*/

        Sizeable(131072),
/**
 The object can be moved.
*/

        Movable(262144),
/**
 The object describes itself through speech or sound.
*/

        SelfVoicing(524288),
/**
 The object can receive focus. Only objects in the active window can receive focus.
*/

        Focusable(1048576),
/**
 The object is selectable.
*/

        Selectable(2097152),
/**
 The object is linked to another object, e.g. a hyperlink.
*/

        Linked(4194304),
/**
 The object is linked and has been visited.
*/

        Traversed(8388608),
/**
 The object supports multiple selected items.
*/

        MultiSelectable(16777216),
/**
 The object supports extended selection.
*/

        ExtSelectable(33554432),
/**
 The object is password protected, e.g. a line edit for entering a Password.
*/

        Protected(536870912),
/**
 The object opens a popup.
*/

        HasPopup(1073741824),
/**
 The object blocks input from other objects.
*/

        Modal(-2147483648),
        HasInvokeExtension(268435456);

        StateFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QAccessible$State with the specified <tt>com.trolltech.qt.gui.QAccessible$StateFlag[]</tt> QAccessible$StateFlag values set.</brief>
*/

        public static State createQFlags(StateFlag ... values) {
            return new State(values);
        }
/**
<brief>Returns the QAccessible$StateFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static StateFlag resolve(int value) {
            return (StateFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Normal;
            case 1: return Unavailable;
            case 2: return Selected;
            case 4: return Focused;
            case 8: return Pressed;
            case 16: return Checked;
            case 32: return Mixed;
            case 64: return ReadOnly;
            case 128: return HotTracked;
            case 256: return DefaultButton;
            case 512: return Expanded;
            case 1024: return Collapsed;
            case 2048: return Busy;
            case 8192: return Marqueed;
            case 16384: return Animated;
            case 32768: return Invisible;
            case 65536: return Offscreen;
            case 131072: return Sizeable;
            case 262144: return Movable;
            case 524288: return SelfVoicing;
            case 1048576: return Focusable;
            case 2097152: return Selectable;
            case 4194304: return Linked;
            case 8388608: return Traversed;
            case 16777216: return MultiSelectable;
            case 33554432: return ExtSelectable;
            case 536870912: return Protected;
            case 1073741824: return HasPopup;
            case -2147483648: return Modal;
            case 268435456: return HasInvokeExtension;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class State extends com.trolltech.qt.QFlags<StateFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAccessible-State with the specified <tt>com.trolltech.qt.gui.QAccessible.StateFlag[]</tt>. flags set.</brief>
*/

        public State(StateFlag ... args) { super(args); }
        public State(int value) { setValue(value); }
    }
/**
This enum specifies string information that an accessible object returns.
*/


    public enum Text implements com.trolltech.qt.QtEnumerator {
/**
 The name of the object. This can be used both as an identifier or a short description by accessible clients.
*/

        Name(0),
/**
 A short text describing the object.
*/

        Description(1),
/**
 The value of the object.
*/

        Value(2),
/**
 A longer text giving information about how to use the object.
*/

        Help(3),
/**
 The keyboard shortcut that executes the object's default action.
*/

        Accelerator(4),
/**
 The first value to be used for user defined text.
*/

        UserText(65535);

        Text(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAccessible$Text constant with the specified <tt>int</tt>.</brief>
*/

        public static Text resolve(int value) {
            return (Text) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Name;
            case 1: return Description;
            case 2: return Value;
            case 3: return Help;
            case 4: return Accelerator;
            case 65535: return UserText;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This is an overloaded method provided for convenience.
*/

    public QAccessible(){
        super((QPrivateConstructor)null);
        __qt_QAccessible();
    }

    native void __qt_QAccessible();

/**
Returns true if an accessibility implementation has been requested during the runtime of the application; otherwise returns false. <p>Use this function to prevent potentially expensive notifications via {@link com.trolltech.qt.gui.QAccessible#updateAccessibility(com.trolltech.qt.core.QObject, int, com.trolltech.qt.gui.QAccessible.Event) updateAccessibility()}.
*/

    public native static boolean isActive();

/**
If a {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} implementation exists for the given <tt>object</tt>, this function returns a pointer to the implementation; otherwise it returns 0. <p>The function calls all installed factory functions (from most recently installed to least recently installed) until one is found that provides an interface for the class of <tt>object</tt>. If no factory can provide an accessibility implementation for the class the function loads installed accessibility plugins, and tests if any of the plugins can provide the implementation. <p>If no implementation for the object's class is available, the function tries to find an implementation for the object's parent class, using the above strategy. <p><b>Warning:</b> The caller is responsible for deleting the returned interface after use.
*/

    public static com.trolltech.qt.gui.QAccessibleInterface queryAccessibleInterface(com.trolltech.qt.core.QObject arg__1)    {
        com.trolltech.qt.gui.QAccessibleInterface __qt_return_value = __qt_queryAccessibleInterface_QObject(arg__1 == null ? 0 : arg__1.nativeId());
        if (__qt_return_value != null) {
            __qt_return_value.setJavaOwnership();
        }
        return __qt_return_value;
    }
    native static com.trolltech.qt.gui.QAccessibleInterface __qt_queryAccessibleInterface_QObject(long arg__1);

/**
Sets the root accessible object of this application to <tt>object</tt>. All other accessible objects in the application can be reached by the client using object navigation. <p>You should never need to call this function. Qt sets the {@link com.trolltech.qt.gui.QApplication QApplication} object as the root object immediately before the event loop is entered in QApplication::exec(). <p>Use QAccessible::installRootObjectHandler() to redirect the function call to a customized handler function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible#queryAccessibleInterface(com.trolltech.qt.core.QObject) queryAccessibleInterface()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setRootObject(com.trolltech.qt.core.QObject arg__1)    {
        __qt_setRootObject_QObject(arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setRootObject_QObject(long arg__1);

/**
Notifies accessibility clients about a change in <tt>object</tt>'s accessibility information. <p><tt>reason</tt> specifies the cause of the change, for example, <tt>ValueChange</tt> when the position of a slider has been changed. <tt>child</tt> is the (1-based) index of the child element that has changed. When <tt>child</tt> is 0, the object itself has changed. <p>Call this function whenever the state of your accessible object or one of its sub-elements has been changed either programmatically (e.g. by calling {@link QLabel#setText(java.lang.String) QLabel::setText()}) or by user interaction. <p>If there are no accessibility tools listening to this event, the performance penalty for calling this function is small, but if determining the parameters of the call is expensive you can test {@link com.trolltech.qt.gui.QAccessible#isActive() isActive()} to avoid unnecessary computations.
*/

    public static void updateAccessibility(com.trolltech.qt.core.QObject arg__1, int who, com.trolltech.qt.gui.QAccessible.Event reason)    {
        __qt_updateAccessibility_QObject_int_Event(arg__1 == null ? 0 : arg__1.nativeId(), who, reason.value());
    }
    native static void __qt_updateAccessibility_QObject_int_Event(long arg__1, int who, int reason);

/**
@exclude
*/

    public static native QAccessible fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessible(QPrivateConstructor p) { super(p); } 
}
