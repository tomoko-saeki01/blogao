package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAction class provides an abstract user interface action that can be inserted into widgets. In applications many common commands can be invoked via menus, toolbar buttons, and keyboard shortcuts. Since the user expects each command to be performed in the same way, regardless of the user interface used, it is useful to represent each command as an action. <p>Actions can be added to menus and toolbars, and will automatically keep them in sync. For example, in a word processor, if the user presses a Bold toolbar button, the Bold menu item will automatically be checked. <p>Actions can be created as independent objects, but they may also be created during the construction of menus; the {@link com.trolltech.qt.gui.QMenu QMenu} class contains convenience functions for creating actions suitable for use as menu items. <p>A QAction may contain an icon, menu text, a shortcut, status text, "What's This?" text, and a tooltip. Most of these can be set in the constructor. They can also be set independently with {@link com.trolltech.qt.gui.QAction#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}, {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QAction#setIconText(java.lang.String) setIconText()}, {@link com.trolltech.qt.gui.QAction#setShortcut(com.trolltech.qt.gui.QKeySequence) setShortcut()}, {@link com.trolltech.qt.gui.QAction#setStatusTip(java.lang.String) setStatusTip()}, {@link com.trolltech.qt.gui.QAction#setWhatsThis(java.lang.String) setWhatsThis()}, and {@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}. For menu items, it is possible to set an individual font with {@link com.trolltech.qt.gui.QAction#setFont(com.trolltech.qt.gui.QFont) setFont()}. <p>Actions are added to widgets using {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()} or {@link com.trolltech.qt.gui.QGraphicsWidget#addAction(com.trolltech.qt.gui.QAction) QGraphicsWidget::addAction()}. Note that an action must be added to a widget before it can be used; this is also true when the shortcut should be global (i.e., {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ApplicationShortcut } as {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ShortcutContext }). <p>Once a QAction has been created it should be added to the relevant menu and toolbar, then connected to the slot which will perform the action. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    openAct = new QAction(QIcon(":/images/open.png"), tr("&Open..."), this);
    openAct-&gt;setShortcuts(QKeySequence::Open);
    openAct-&gt;setStatusTip(tr("Open an existing file"));
    connect(openAct, SIGNAL(triggered()), this, SLOT(open()));
 <br>
    fileMenu-&gt;addAction(openAct);

    fileToolBar-&gt;addAction(openAct);
</pre> We recommend that actions are created as children of the window they are used in. In most cases actions will be children of the application's main window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QToolBar QToolBar}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAction extends com.trolltech.qt.core.QObject
{

    private Object __rcMenu = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum type is used when calling {@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}
*/
@QtBlockedEnum
    public enum ActionEvent implements com.trolltech.qt.QtEnumerator {
/**
 this will cause the {@link com.trolltech.qt.gui.QAction#triggered QAction::triggered() } signal to be emitted.
*/

        Trigger(0),
/**
 this will cause the {@link com.trolltech.qt.gui.QAction#hovered QAction::hovered() } signal to be emitted.
*/

        Hover(1);

        ActionEvent(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAction$ActionEvent constant with the specified <tt>int</tt>.</brief>
*/

        public static ActionEvent resolve(int value) {
            return (ActionEvent) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Trigger;
            case 1: return Hover;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes how an action should be moved into the application menu on Mac OS X.
*/

    public enum MenuRole implements com.trolltech.qt.QtEnumerator {
/**
 This action should not be put into the application menu
*/

        NoRole(0),
/**
 This action should be put in the application menu based on the action's text as described in the {@link com.trolltech.qt.gui.QMenuBar QMenuBar} documentation.
*/

        TextHeuristicRole(1),
/**
 This action should be put in the application menu with an application specific role
*/

        ApplicationSpecificRole(2),
/**
 This action matches handles the "About Qt" menu item.
*/

        AboutQtRole(3),
/**
 This action should be placed where the "About" menu item is in the application menu.
*/

        AboutRole(4),
/**
 This action should be placed where the "Preferences. ." menu item is in the application menu.
*/

        PreferencesRole(5),
/**
 This action should be placed where the Quit menu item is in the application menu.
*/

        QuitRole(6);

        MenuRole(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAction$MenuRole constant with the specified <tt>int</tt>.</brief>
*/

        public static MenuRole resolve(int value) {
            return (MenuRole) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoRole;
            case 1: return TextHeuristicRole;
            case 2: return ApplicationSpecificRole;
            case 3: return AboutQtRole;
            case 4: return AboutRole;
            case 5: return PreferencesRole;
            case 6: return QuitRole;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when an action has changed. If you are only interested in actions in a given widget, you can watch for {@link com.trolltech.qt.gui.QWidget#actionEvent(com.trolltech.qt.gui.QActionEvent) QWidget::actionEvent()} sent with an {@link com.trolltech.qt.core.QEvent.Type QEvent::ActionChanged }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#actionEvent(com.trolltech.qt.gui.QActionEvent) QWidget::actionEvent()}. <br></DD></DT>
*/

    public final Signal0 changed = new Signal0();

    private final void changed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changed(nativeId());
    }
    native void __qt_changed(long __this__nativeId);
/**
 This signal is emitted when an action is highlighted by the user; for example, when the user pauses with the cursor over a menu option, toolbar button, or presses an action's shortcut key combination. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}. <br></DD></DT>
*/

    public final Signal0 hovered = new Signal0();

    private final void hovered()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hovered(nativeId());
    }
    native void __qt_hovered(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: checked)&gt;:<p> This signal is emitted whenever a checkable action changes its {@link com.trolltech.qt.gui.QAction#isChecked() isChecked()} status. This can be the result of a user interaction, or because {@link com.trolltech.qt.gui.QAction#setChecked(boolean) setChecked()} was called. <p><tt>checked</tt> is true if the action is checked, or false if the action is unchecked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}, {@link com.trolltech.qt.gui.QAction#triggered QAction::triggered() }, and {@link QAction#isChecked() checked}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> toggled = new Signal1<java.lang.Boolean>();

    private final void toggled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggled_boolean(nativeId(), arg__1);
    }
    native void __qt_toggled_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: checked)&gt;:<p> This signal is emitted when an action is activated by the user; for example, when the user clicks a menu option, toolbar button, or presses an action's shortcut key combination, or when {@link com.trolltech.qt.gui.QAction#trigger() trigger()} was called. Notably, it is not emitted when {@link com.trolltech.qt.gui.QAction#setChecked(boolean) setChecked()} or {@link com.trolltech.qt.gui.QAction#toggle() toggle()} is called. <p>If the action is checkable, <tt>checked</tt> is true if the action is checked, or false if the action is unchecked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#activate(com.trolltech.qt.gui.QAction.ActionEvent) QAction::activate()}, {@link com.trolltech.qt.gui.QAction#toggled QAction::toggled() }, and {@link QAction#isChecked() checked}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> triggered = new Signal1<java.lang.Boolean>();


    private final void triggered() {
        triggered((boolean)false);
    }
    private final void triggered(boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggered_boolean(nativeId(), checked);
    }
    native void __qt_triggered_boolean(long __this__nativeId, boolean checked);

/**
Constructs an action with <tt>parent</tt>. If <tt>parent</tt> is an action group the action will be automatically inserted into the group.
*/

    public QAction(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAction_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAction_QObject(long parent);

/**
Constructs an action with an <tt>icon</tt> and some <tt>text</tt> and <tt>parent</tt>. If <tt>parent</tt> is an action group the action will be automatically inserted into the group. <p>The action uses a stripped version of <tt>text</tt> (e.g. "&Menu Option..." becomes "Menu Option") as descriptive text for tool buttons. You can override this by setting a specific description with {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()}. The same text will be used for tooltips unless you specify a different text using {@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}.
*/

    public QAction(com.trolltech.qt.gui.QIcon icon, java.lang.String text, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAction_QIcon_String_QObject(icon == null ? 0 : icon.nativeId(), text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAction_QIcon_String_QObject(long icon, java.lang.String text, long parent);

/**
Constructs an action with some <tt>text</tt> and <tt>parent</tt>. If <tt>parent</tt> is an action group the action will be automatically inserted into the group. <p>The action uses a stripped version of <tt>text</tt> (e.g. "&Menu Option..." becomes "Menu Option") as descriptive text for tool buttons. You can override this by setting a specific description with {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()}. The same text will be used for tooltips unless you specify a different text using {@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}.
*/

    public QAction(java.lang.String text, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAction_String_QObject(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAction_String_QObject(java.lang.String text, long parent);

/**
Returns the action group for this action. If no action group manages this action then 0 will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QActionGroup QActionGroup}, and {@link com.trolltech.qt.gui.QAction#setActionGroup(com.trolltech.qt.gui.QActionGroup) QAction::setActionGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QActionGroup actionGroup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionGroup(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QActionGroup __qt_actionGroup(long __this__nativeId);

/**
Sends the relevant signals for {@link com.trolltech.qt.gui.QAction.ActionEvent ActionEvent }<tt>event</tt>. <p>Action based widgets use this API to cause the QAction to emit signals as well as emitting their own.
*/

    @QtBlockedSlot
    public final void activate(com.trolltech.qt.gui.QAction.ActionEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activate_ActionEvent(nativeId(), event.value());
    }
    @QtBlockedSlot
    native void __qt_activate_ActionEvent(long __this__nativeId, int event);

/**
Returns a list of widgets this action has been added to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QAction#associatedWidgets() associatedWidgets()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsWidget> associatedGraphicsWidgets()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_associatedGraphicsWidgets(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsWidget> __qt_associatedGraphicsWidgets(long __this__nativeId);

/**
Returns a list of widgets this action has been added to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QAction#associatedGraphicsWidgets() associatedGraphicsWidgets()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QWidget> associatedWidgets()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_associatedWidgets(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QWidget> __qt_associatedWidgets(long __this__nativeId);

/**
This property holds whether the action can auto repeat. If true, the action will auto repeat when the keyboard shortcut combination is held down, provided that keyboard auto repeat is enabled on the system. The default value is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRepeat")
    @QtBlockedSlot
    public final boolean autoRepeat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRepeat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoRepeat(long __this__nativeId);

/**
Returns the user data as set in QAction.:setData. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setData(java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data(long __this__nativeId);

/**
This property holds the action's font. The font property is used to render the text set on the QAction. The font will can be considered a hint as it will not be consulted in all cases based upon application and style. <p>By default, this property contains the application's default font. <p><DT><b>See also:</b><br><DD>{@link QAction#setText(java.lang.String) QAction::setText()}, and {@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="font")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
This is a convenience slot that calls activate(Hover).
*/

    public final void hover()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hover(nativeId());
    }
    native void __qt_hover(long __this__nativeId);

/**
This property holds the action's icon. In toolbars, the icon is used as the tool button icon; in menus, it is displayed to the left of the menu text. There is no default icon. <p>If a null icon ({@link com.trolltech.qt.gui.QIcon#isNull() QIcon::isNull()} is passed into this function, the icon of the action is cleared.
*/

    @com.trolltech.qt.QtPropertyReader(name="icon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
This property holds the action's descriptive icon text. If {@link QToolBar#toolButtonStyle() QToolBar::toolButtonStyle} is set to a value that permits text to be displayed, the text defined held in this property appears as a label in the relevant tool button. <p>It also serves as the default text in menus and tooltips if the action has not been defined with {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()} or {@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and will also be used in toolbar buttons if no icon has been defined using {@link com.trolltech.qt.gui.QAction#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}. <p>If the icon text is not explicitly set, the action's normal text will be used for the icon text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QAction#setStatusTip(java.lang.String) setStatusTip()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="iconText")
    @QtBlockedSlot
    public final java.lang.String iconText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_iconText(long __this__nativeId);

/**
This property holds whether the action is a checkable action. A checkable action is one which has an on/off state. For example, in a word processor, a Bold toolbar button may be either on or off. An action which is not a toggle action is a command action; a command action is simply executed, e.g. file save. By default, this property is false. <p>In some situations, the state of one toggle action should depend on the state of others. For example, "Left Align", "Center" and "Right Align" toggle actions are mutually exclusive. To achieve exclusive toggling, add the relevant toggle actions to a {@link com.trolltech.qt.gui.QActionGroup QActionGroup} with the {@link QActionGroup#isExclusive() QActionGroup::exclusive} property set to true. <p><DT><b>See also:</b><br><DD>{@link QAction#setChecked(boolean) QAction::setChecked()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checkable")
    @QtBlockedSlot
    public final boolean isCheckable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCheckable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCheckable(long __this__nativeId);

/**
This property holds whether the action is checked.  Only checkable actions can be checked. By default, this is false (the action is unchecked). <p><DT><b>See also:</b><br><DD>{@link QAction#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checked")
    @com.trolltech.qt.QtPropertyDesignable("isCheckable")
    @QtBlockedSlot
    public final boolean isChecked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isChecked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isChecked(long __this__nativeId);

/**
This property holds whether the action is enabled. Disabled actions cannot be chosen by the user. They do not disappear from menus or toolbars, but they are displayed in a way which indicates that they are unavailable. For example, they might be displayed using only shades of gray. <p><b>What's This?</b> help on disabled actions is still available, provided that the {@link QAction#whatsThis() QAction::whatsThis} property is set. <p>An action will be disabled when all widgets to which it is added (with {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}) are disabled or not visible. When an action is disabled, it is not possible to trigger it through its shortcut. <p>By default, this property is true (actions are enabled). <p><DT><b>See also:</b><br><DD>{@link QAction#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="enabled")
    @QtBlockedSlot
    public final boolean isEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
This property holds Whether or not an action should show an icon in a menu. In some applications, it may make sense to have actions with icons in the toolbar, but not in menus. If true, the icon (if valid) is shown in the menu, when it is false, it is not shown. <p>The default is to follow whether the {@link com.trolltech.qt.core.Qt.ApplicationAttribute Qt::AA_DontShowIconsInMenus } attribute is set for the application. Explicitly settings this property overrides the presence (or abscence) of the attribute. <p>For example: <pre class="snippet">
    QApplication.initialize(args);
    QApplication.setAttribute(Qt.ApplicationAttribute.AA_DontShowIconsInMenus);  // Icons are *no longer shown* in menus
    // ...
    QAction myAction = new QAction(window);
    // ...
    myAction.setIcon(SomeIcon);
    myAction.setIconVisibleInMenu(true);   // Icon *will* be shown in menus for *this* action.
</pre> <p><DT><b>See also:</b><br><DD>{@link QAction#icon() QAction::icon}, and {@link com.trolltech.qt.core.QCoreApplication#setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) QApplication::setAttribute()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="iconVisibleInMenu")
    @QtBlockedSlot
    public final boolean isIconVisibleInMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isIconVisibleInMenu(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isIconVisibleInMenu(long __this__nativeId);

/**
Returns true if this action is a separator action; otherwise it returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setSeparator(boolean) QAction::setSeparator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSeparator()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSeparator(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSeparator(long __this__nativeId);

/**
This property holds whether the action can be seen (e.g. in menus and toolbars). If visible is true the action can be seen (e.g. in menus and toolbars) and chosen by the user; if visible is false the action cannot be seen or chosen by the user. <p>Actions which are not visible are not grayed out; they do not appear at all. <p>By default, this property is true (actions are visible).
*/

    @com.trolltech.qt.QtPropertyReader(name="visible")
    @QtBlockedSlot
    public final boolean isVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisible(long __this__nativeId);

/**
Returns the menu contained by this action. Actions that contain menus can be used to create menu items with submenus, or inserted into toolbars to create buttons with popup menus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setMenu(com.trolltech.qt.gui.QMenu) setMenu()}, and {@link com.trolltech.qt.gui.QMenu#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) QMenu::addAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu menu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_menu(long __this__nativeId);

/**
This property holds the action's menu role. This indicates what role the action serves in the application menu on Mac OS X. By default all action have the {@link com.trolltech.qt.gui.QAction.MenuRole TextHeuristicRole }, which means that the action is added based on its text (see {@link com.trolltech.qt.gui.QMenuBar QMenuBar} for more information). <p>The menu role can only be changed before the actions are put into the menu bar in Mac OS X (usually just before the first application window is shown).
*/

    @com.trolltech.qt.QtPropertyReader(name="menuRole")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction.MenuRole menuRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAction.MenuRole.resolve(__qt_menuRole(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_menuRole(long __this__nativeId);

/**
Returns the parent widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget parentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_parentWidget(long __this__nativeId);

/**
Sets this action group to <tt>group</tt>. The action will be automatically added to the group's list of actions. <p>Actions within the group will be mutually exclusive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QActionGroup QActionGroup}, and {@link com.trolltech.qt.gui.QAction#actionGroup() QAction::actionGroup()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setActionGroup(com.trolltech.qt.gui.QActionGroup group)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActionGroup_QActionGroup(nativeId(), group == null ? 0 : group.nativeId());
        java.util.Collection<Object> __rcTmp = null;
        if (__rcActionGroup != null) {
            __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(__rcActionGroup, QActionGroup.class, "__rcActions");
            while (__rcTmp.contains(this))
                __rcTmp.remove(this);
        }
        __rcActionGroup = group;
        if (__rcActionGroup != null) {
            __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(__rcActionGroup, QActionGroup.class, "__rcActions");
            __rcTmp.add(this);
        }


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setActionGroup_QActionGroup(long __this__nativeId, long group);

/**
This property holds whether the action can auto repeat. If true, the action will auto repeat when the keyboard shortcut combination is held down, provided that keyboard auto repeat is enabled on the system. The default value is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRepeat")
    @QtBlockedSlot
    public final void setAutoRepeat(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRepeat_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setAutoRepeat_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the action is a checkable action. A checkable action is one which has an on/off state. For example, in a word processor, a Bold toolbar button may be either on or off. An action which is not a toggle action is a command action; a command action is simply executed, e.g. file save. By default, this property is false. <p>In some situations, the state of one toggle action should depend on the state of others. For example, "Left Align", "Center" and "Right Align" toggle actions are mutually exclusive. To achieve exclusive toggling, add the relevant toggle actions to a {@link com.trolltech.qt.gui.QActionGroup QActionGroup} with the {@link QActionGroup#isExclusive() QActionGroup::exclusive} property set to true. <p><DT><b>See also:</b><br><DD>{@link QAction#setChecked(boolean) QAction::setChecked()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checkable")
    @QtBlockedSlot
    public final void setCheckable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckable_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setCheckable_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the action is checked.  Only checkable actions can be checked. By default, this is false (the action is unchecked). <p><DT><b>See also:</b><br><DD>{@link QAction#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checked")
    public final void setChecked(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChecked_boolean(nativeId(), arg__1);
    }
    native void __qt_setChecked_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the action's internal data to the given <tt>userData</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(java.lang.Object var)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_Object(nativeId(), var);
    }
    @QtBlockedSlot
    native void __qt_setData_Object(long __this__nativeId, java.lang.Object var);

/**
This is a convenience function for the {@link QAction#isEnabled() enabled} property, that is useful for signals--slots connections. If <tt>b</tt> is true the action is disabled; otherwise it is enabled.
*/

    public final void setDisabled(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisabled_boolean(nativeId(), b);
    }
    native void __qt_setDisabled_boolean(long __this__nativeId, boolean b);

/**
This property holds whether the action is enabled. Disabled actions cannot be chosen by the user. They do not disappear from menus or toolbars, but they are displayed in a way which indicates that they are unavailable. For example, they might be displayed using only shades of gray. <p><b>What's This?</b> help on disabled actions is still available, provided that the {@link QAction#whatsThis() QAction::whatsThis} property is set. <p>An action will be disabled when all widgets to which it is added (with {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}) are disabled or not visible. When an action is disabled, it is not possible to trigger it through its shortcut. <p>By default, this property is true (actions are enabled). <p><DT><b>See also:</b><br><DD>{@link QAction#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="enabled")
    public final void setEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), arg__1);
    }
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the action's font. The font property is used to render the text set on the QAction. The font will can be considered a hint as it will not be consulted in all cases based upon application and style. <p>By default, this property contains the application's default font. <p><DT><b>See also:</b><br><DD>{@link QAction#setText(java.lang.String) QAction::setText()}, and {@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="font")
    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
This property holds the action's icon. In toolbars, the icon is used as the tool button icon; in menus, it is displayed to the left of the menu text. There is no default icon. <p>If a null icon ({@link com.trolltech.qt.gui.QIcon#isNull() QIcon::isNull()} is passed into this function, the icon of the action is cleared.
*/

    @com.trolltech.qt.QtPropertyWriter(name="icon")
    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
This property holds the action's descriptive icon text. If {@link QToolBar#toolButtonStyle() QToolBar::toolButtonStyle} is set to a value that permits text to be displayed, the text defined held in this property appears as a label in the relevant tool button. <p>It also serves as the default text in menus and tooltips if the action has not been defined with {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()} or {@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and will also be used in toolbar buttons if no icon has been defined using {@link com.trolltech.qt.gui.QAction#setIcon(com.trolltech.qt.gui.QIcon) setIcon()}. <p>If the icon text is not explicitly set, the action's normal text will be used for the icon text. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QAction#setStatusTip(java.lang.String) setStatusTip()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconText")
    @QtBlockedSlot
    public final void setIconText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setIconText_String(long __this__nativeId, java.lang.String text);

/**
This property holds Whether or not an action should show an icon in a menu. In some applications, it may make sense to have actions with icons in the toolbar, but not in menus. If true, the icon (if valid) is shown in the menu, when it is false, it is not shown. <p>The default is to follow whether the {@link com.trolltech.qt.core.Qt.ApplicationAttribute Qt::AA_DontShowIconsInMenus } attribute is set for the application. Explicitly settings this property overrides the presence (or abscence) of the attribute. <p>For example: <pre class="snippet">
    QApplication.initialize(args);
    QApplication.setAttribute(Qt.ApplicationAttribute.AA_DontShowIconsInMenus);  // Icons are *no longer shown* in menus
    // ...
    QAction myAction = new QAction(window);
    // ...
    myAction.setIcon(SomeIcon);
    myAction.setIconVisibleInMenu(true);   // Icon *will* be shown in menus for *this* action.
</pre> <p><DT><b>See also:</b><br><DD>{@link QAction#icon() QAction::icon}, and {@link com.trolltech.qt.core.QCoreApplication#setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) QApplication::setAttribute()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconVisibleInMenu")
    @QtBlockedSlot
    public final void setIconVisibleInMenu(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconVisibleInMenu_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setIconVisibleInMenu_boolean(long __this__nativeId, boolean visible);

/**
Sets the menu contained by this action to the specified <tt>menu</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#menu() menu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMenu(com.trolltech.qt.gui.QMenu menu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMenu = menu;
        }
        __qt_setMenu_QMenu(nativeId(), menu == null ? 0 : menu.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMenu_QMenu(long __this__nativeId, long menu);

/**
This property holds the action's menu role. This indicates what role the action serves in the application menu on Mac OS X. By default all action have the {@link com.trolltech.qt.gui.QAction.MenuRole TextHeuristicRole }, which means that the action is added based on its text (see {@link com.trolltech.qt.gui.QMenuBar QMenuBar} for more information). <p>The menu role can only be changed before the actions are put into the menu bar in Mac OS X (usually just before the first application window is shown).
*/

    @com.trolltech.qt.QtPropertyWriter(name="menuRole")
    @QtBlockedSlot
    public final void setMenuRole(com.trolltech.qt.gui.QAction.MenuRole menuRole)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuRole_MenuRole(nativeId(), menuRole.value());
    }
    @QtBlockedSlot
    native void __qt_setMenuRole_MenuRole(long __this__nativeId, int menuRole);

/**
If <tt>b</tt> is true then this action will be considered a separator. <p>How a separator is represented depends on the widget it is inserted into. Under most circumstances the text, submenu, and icon will be ignored for separator actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#isSeparator() QAction::isSeparator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSeparator(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSeparator_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setSeparator_boolean(long __this__nativeId, boolean b);

/**
This property holds the action's primary shortcut key. Valid keycodes for this property can be found in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }. There is no default shortcut key.
*/

    @com.trolltech.qt.QtPropertyWriter(name="shortcut")
    @QtBlockedSlot
    public final void setShortcut(com.trolltech.qt.gui.QKeySequence shortcut)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcut_QKeySequence(nativeId(), shortcut == null ? 0 : shortcut.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setShortcut_QKeySequence(long __this__nativeId, long shortcut);

/**
This property holds the context for the action's shortcut. Valid values for this property can be found in {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ShortcutContext }. The default value is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="shortcutContext")
    @QtBlockedSlot
    public final void setShortcutContext(com.trolltech.qt.core.Qt.ShortcutContext context)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcutContext_ShortcutContext(nativeId(), context.value());
    }
    @QtBlockedSlot
    native void __qt_setShortcutContext_ShortcutContext(long __this__nativeId, int context);

/**
Sets a platform dependent list of shortcuts based on the <tt>key</tt>. The result of calling this function will depend on the currently running platform. Note that more than one shortcut can assigned by this action. If only the primary shortcut is required, use setShortcut instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QKeySequence#keyBindings(com.trolltech.qt.gui.QKeySequence.StandardKey) QKeySequence::keyBindings()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcuts(com.trolltech.qt.gui.QKeySequence.StandardKey arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcuts_StandardKey(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setShortcuts_StandardKey(long __this__nativeId, int arg__1);

/**
Sets <tt>shortcuts</tt> as the list of shortcuts that trigger the action. The first element of the list is the primary shortcut. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#shortcuts() shortcuts()}, and {@link QAction#shortcut() shortcut}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcuts(java.util.List<com.trolltech.qt.gui.QKeySequence> shortcuts)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcuts_List(nativeId(), shortcuts);
    }
    @QtBlockedSlot
    native void __qt_setShortcuts_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QKeySequence> shortcuts);

/**
This property holds the action's status tip. The status tip is displayed on all status bars provided by the action's top-level parent widget. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QAction#showStatusText() showStatusText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="statusTip")
    @QtBlockedSlot
    public final void setStatusTip(java.lang.String statusTip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_String(nativeId(), statusTip);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_String(long __this__nativeId, java.lang.String statusTip);

/**
This property holds the action's descriptive text. If the action is added to a menu, the menu option will consist of the icon (if there is one), the text, and the shortcut (if there is one). If the text is not explicitly set in the constructor, or by using {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()}, the action's description icon text will be used as text. There is no default text. <p><DT><b>See also:</b><br><DD>{@link QAction#iconText() iconText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="text")
    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
This property holds the action's tooltip. This text is used for the tooltip. If no tooltip is specified, the action's text is used. <p>By default, this property contains the action's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QAction#setShortcut(com.trolltech.qt.gui.QKeySequence) setShortcut()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="toolTip")
    @QtBlockedSlot
    public final void setToolTip(java.lang.String tip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), tip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String tip);

/**
This property holds whether the action can be seen (e.g. in menus and toolbars). If visible is true the action can be seen (e.g. in menus and toolbars) and chosen by the user; if visible is false the action cannot be seen or chosen by the user. <p>Actions which are not visible are not grayed out; they do not appear at all. <p>By default, this property is true (actions are visible).
*/

    @com.trolltech.qt.QtPropertyWriter(name="visible")
    public final void setVisible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), arg__1);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the action's "What's This?" help text. The "What's This?" text is used to provide a brief description of the action. The text may contain rich text. There is no default "What's This?" text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, and Q3StyleSheet. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="whatsThis")
    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String what)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), what);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String what);

/**
This property holds the action's primary shortcut key. Valid keycodes for this property can be found in {@link com.trolltech.qt.core.Qt.Key Qt::Key } and {@link com.trolltech.qt.core.Qt.Modifier Qt::Modifier }. There is no default shortcut key.
*/

    @com.trolltech.qt.QtPropertyReader(name="shortcut")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QKeySequence shortcut()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shortcut(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QKeySequence __qt_shortcut(long __this__nativeId);

/**
This property holds the context for the action's shortcut. Valid values for this property can be found in {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ShortcutContext }. The default value is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }.
*/

    @com.trolltech.qt.QtPropertyReader(name="shortcutContext")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ShortcutContext shortcutContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ShortcutContext.resolve(__qt_shortcutContext(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shortcutContext(long __this__nativeId);

/**
Returns the list of shortcuts, with the primary shortcut as the first element of the list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setShortcuts(com.trolltech.qt.gui.QKeySequence.StandardKey) setShortcuts()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QKeySequence> shortcuts()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shortcuts(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QKeySequence> __qt_shortcuts(long __this__nativeId);


/**
Updates the relevant status bar for the <tt>widget</tt> specified by sending a {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent} to its parent widget. Returns true if an event was sent; otherwise returns false. <p>If a null widget is specified, the event is sent to the action's parent. <p><DT><b>See also:</b><br><DD>{@link QAction#statusTip() statusTip}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean showStatusText() {
        return showStatusText((com.trolltech.qt.gui.QWidget)null);
    }
/**
Updates the relevant status bar for the <tt>widget</tt> specified by sending a {@link com.trolltech.qt.gui.QStatusTipEvent QStatusTipEvent} to its parent widget. Returns true if an event was sent; otherwise returns false. <p>If a null widget is specified, the event is sent to the action's parent. <p><DT><b>See also:</b><br><DD>{@link QAction#statusTip() statusTip}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean showStatusText(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_showStatusText_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_showStatusText_QWidget(long __this__nativeId, long widget);

/**
This property holds the action's status tip. The status tip is displayed on all status bars provided by the action's top-level parent widget. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QAction#showStatusText() showStatusText()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="statusTip")
    @QtBlockedSlot
    public final java.lang.String statusTip()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip(long __this__nativeId);

/**
This property holds the action's descriptive text. If the action is added to a menu, the menu option will consist of the icon (if there is one), the text, and the shortcut (if there is one). If the text is not explicitly set in the constructor, or by using {@link com.trolltech.qt.gui.QAction#setText(java.lang.String) setText()}, the action's description icon text will be used as text. There is no default text. <p><DT><b>See also:</b><br><DD>{@link QAction#iconText() iconText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="text")
    @QtBlockedSlot
    public final java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
This is a convenience function for the {@link QAction#isChecked() checked} property. Connect to it to change the checked state to its opposite state.
*/

    public final void toggle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggle(nativeId());
    }
    native void __qt_toggle(long __this__nativeId);

/**
This property holds the action's tooltip. This text is used for the tooltip. If no tooltip is specified, the action's text is used. <p>By default, this property contains the action's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction#setStatusTip(java.lang.String) setStatusTip()}, and {@link com.trolltech.qt.gui.QAction#setShortcut(com.trolltech.qt.gui.QKeySequence) setShortcut()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="toolTip")
    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
This is a convenience slot that calls activate(Trigger).
*/

    public final void trigger()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_trigger(nativeId());
    }
    native void __qt_trigger(long __this__nativeId);

/**
This property holds the action's "What's This?" help text. The "What's This?" text is used to provide a brief description of the action. The text may contain rich text. There is no default "What's This?" text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, and Q3StyleSheet. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="whatsThis")
    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QAction fromNativePointer(QNativePointer nativePointer);

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

    protected QAction(QPrivateConstructor p) { super(p); } 

    private QActionGroup __rcActionGroup = null;

    /**
     * Sets the shortcut to the key sequence for the given key string. For
     * example "Ctrl+O" gives CTRL+'O'. The strings "Ctrl", "Shift", "Alt" and
     * "Meta" are recognized, as well as their translated equivalents in the
     * "QShortcut" context (using QObject::tr()). Up to four key codes may be
     * entered by separating them with commas, e.g. "Alt+X,Ctrl+S,Q".
     *
     * @param key
     *            The description of the key sequence. Typically used with tr()
     *            so key sequences can be locale aware.
     */
    public final void setShortcut(String key) {
        setShortcut(new QKeySequence(key));
    }

    /**
     * Sets the shortcut to the key sequence for the given key. The result will
     * depend on the currently running platform. The key sequence will be based
     * on the first element in the list of key bindings for the key.
     *
     * @param key
     *            The key for which to select a key sequence
     */
    public final void setShortcut(QKeySequence.StandardKey key) {
        setShortcut(new QKeySequence(key));
    }

    public final void setIcon(QPixmap pm) {
        setIcon(new QIcon(pm));
    }

}
