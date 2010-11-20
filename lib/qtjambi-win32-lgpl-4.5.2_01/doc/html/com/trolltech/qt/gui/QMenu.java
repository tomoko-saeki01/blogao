package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMenu class provides a menu widget for use in menu bars, context menus, and other popup menus. A menu widget is a selection menu. It can be either a pull-down menu in a menu bar or a standalone context menu. Pull-down menus are shown by the menu bar when the user clicks on the respective item or presses the specified shortcut key. Use {@link com.trolltech.qt.gui.QMenuBar#addMenu(com.trolltech.qt.gui.QMenu) QMenuBar::addMenu()} to insert a menu into a menu bar. Context menus are usually invoked by some special keyboard key or by right-clicking. They can be executed either asynchronously with {@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()} or synchronously with {@link com.trolltech.qt.gui.QMenu#exec() exec()}. Menus can also be invoked in response to button presses; these are just like context menus except for how they are invoked.    <table align="center" cellpadding="0">
    <tr>
        <td>
              <br><center><img src="../images/plastique-menu.png"></center><br>        </td>
        <td>
              <br><center><img src="../images/windowsxp-menu.png"></center><br>        </td>
        <td>
              <br><center><img src="../images/macintosh-menu.png"></center><br>        </td>

    </tr>
    <tr>
        <td colspan="3">
            A menu shown in {@link <a href="../gallery-plastique.html">Plastique widget style</a>}, {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}, and {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.        </td>
    </tr>
    </table>
    <a name="actions"><h2>Actions</h2> A menu consists of a list of action items. Actions are added with the {@link com.trolltech.qt.gui.QMenu#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) addAction()}, {@link com.trolltech.qt.gui.QWidget#addActions(java.util.List) addActions()} and {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()} functions. An action is represented vertically and rendered by {@link com.trolltech.qt.gui.QStyle QStyle}. In addition, actions can have a text label, an optional icon drawn on the very left side, and shortcut key sequence such as "Ctrl+X". <p>The existing actions held by a menu can be found with {@link com.trolltech.qt.gui.QWidget#actions() actions()}. <p>There are four kinds of action items: separators, actions that show a submenu, widgets, and actions that perform an action. Separators are inserted with {@link com.trolltech.qt.gui.QMenu#addSeparator() addSeparator()}, submenus with {@link com.trolltech.qt.gui.QMenu#addMenu(com.trolltech.qt.gui.QMenu) addMenu()}, and all other items are considered action items. <p>When inserting action items you usually specify a receiver and a slot. The receiver will be notifed whenever the item is {@link com.trolltech.qt.gui.QAction#triggered triggered() }. In addition, QMenu provides two signals, activated() and highlighted(), which signal the {@link com.trolltech.qt.gui.QAction QAction} that was triggered from the menu. <p>You clear a menu with {@link com.trolltech.qt.gui.QMenu#clear() clear()} and remove individual action items with {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <p>A QMenu can also provide a tear-off menu. A tear-off menu is a top-level window that contains a copy of the menu. This makes it possible for the user to "tear off" frequently used menus and position them in a convenient place on the screen. If you want this functionality for a particular menu, insert a tear-off handle with {@link com.trolltech.qt.gui.QMenu#setTearOffEnabled(boolean) setTearOffEnabled()}. When using tear-off menus, bear in mind that the concept isn't typically used on Microsoft Windows so some users may not be familiar with it. Consider using a {@link com.trolltech.qt.gui.QToolBar QToolBar} instead. <p>Widgets can be inserted into menus with the {@link com.trolltech.qt.gui.QWidgetAction QWidgetAction} class. Instances of this class are used to hold widgets, and are inserted into menus with the {@link com.trolltech.qt.gui.QMenu#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) addAction()} overload that takes a {@link com.trolltech.qt.gui.QAction QAction}. <p>Conversely, actions can be added to widgets with the {@link com.trolltech.qt.gui.QMenu#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) addAction()}, {@link com.trolltech.qt.gui.QWidget#addActions(java.util.List) addActions()} and {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()} functions.<a name="qmenu-on-qt-for-windows-ce"><h2>QMenu on Qt for Windows CE</h2> If a menu is integrated into the native menubar on Windows Mobile we do not support the signals: aboutToHide (), aboutToShow () and hovered (). It is not possible to display an icon in a native menu on Windows Mobile. <p>See the {@link <a href="../qtjambi-menus.html">Menus</a>} example for an example of how to use {@link com.trolltech.qt.gui.QMenuBar QMenuBar} and QMenu in your application. <p><b>Important inherited functions:</b>{@link com.trolltech.qt.gui.QMenu#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) addAction()}, {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QMenu#clear() clear()}, {@link com.trolltech.qt.gui.QMenu#addSeparator() addSeparator()}, and {@link com.trolltech.qt.gui.QMenu#addMenu(com.trolltech.qt.gui.QMenu) addMenu()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar QMenuBar}, {@link <a href="../guibooks.html">GUI Design Handbook: Menu, Drop-Down and Pop-Up</a>}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../qtjambi-menus.html">Menus Example</a>}, and {@link <a href="../mainwindows-recentfiles.html">Recent Files Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMenu extends com.trolltech.qt.gui.QWidget
{

    private java.util.Collection<Object> __rcMenus = new java.util.ArrayList<Object>();
/**
 This signal is emitted just before the menu is hidden from the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#aboutToShow aboutToShow() }, and {@link com.trolltech.qt.gui.QWidget#hide() hide()}. <br></DD></DT>
*/

    public final Signal0 aboutToHide = new Signal0();

    private final void aboutToHide()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToHide(nativeId());
    }
    native void __qt_aboutToHide(long __this__nativeId);
/**
 This signal is emitted just before the menu is shown to the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#aboutToHide aboutToHide() }, and {@link com.trolltech.qt.gui.QWidget#show() show()}. <br></DD></DT>
*/

    public final Signal0 aboutToShow = new Signal0();

    private final void aboutToShow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToShow(nativeId());
    }
    native void __qt_aboutToShow(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when a menu action is highlighted; <tt>action</tt> is the action that caused the signal to be emitted. <p>Often this is used to update status information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#triggered triggered() }, and {@link com.trolltech.qt.gui.QAction#hovered QAction::hovered() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAction> hovered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void hovered(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hovered_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    native void __qt_hovered_QAction(long __this__nativeId, long action);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when an action in this menu is triggered; <tt>action</tt> is the action that caused the signal to be emitted. <p>Normally, you connect each menu action's {@link com.trolltech.qt.gui.QAction#triggered triggered() } signal to its own custom slot, but sometimes you will want to connect several actions to a single slot, for example, when you have a group of closely related actions, such as "left justify", "center", "right justify". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#hovered hovered() }, and {@link com.trolltech.qt.gui.QAction#triggered QAction::triggered() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QAction> triggered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void triggered(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggered_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    native void __qt_triggered_QAction(long __this__nativeId, long action);


/**
Constructs a menu with parent <tt>parent</tt>. <p>Although a popup menu is always a top-level widget, if a parent is passed the popup menu will be deleted when that parent is destroyed (as with any other {@link com.trolltech.qt.core.QObject QObject}).
*/

    public QMenu() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a menu with parent <tt>parent</tt>. <p>Although a popup menu is always a top-level widget, if a parent is passed the popup menu will be deleted when that parent is destroyed (as with any other {@link com.trolltech.qt.core.QObject QObject}).
*/

    public QMenu(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QMenu_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMenu_QWidget(long parent);


/**
Constructs a menu with a <tt>title</tt> and a <tt>parent</tt>. <p>Although a popup menu is always a top-level widget, if a parent is passed the popup menu will be deleted when that parent is destroyed (as with any other {@link com.trolltech.qt.core.QObject QObject}). <p><DT><b>See also:</b><br><DD>{@link QMenu#title() title}. <br></DD></DT>
*/

    public QMenu(java.lang.String title) {
        this(title, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a menu with a <tt>title</tt> and a <tt>parent</tt>. <p>Although a popup menu is always a top-level widget, if a parent is passed the popup menu will be deleted when that parent is destroyed (as with any other {@link com.trolltech.qt.core.QObject QObject}). <p><DT><b>See also:</b><br><DD>{@link QMenu#title() title}. <br></DD></DT>
*/

    public QMenu(java.lang.String title, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QMenu_String_QWidget(title, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMenu_String_QWidget(java.lang.String title, long parent);

/**
Returns the item at <tt>pt</tt>; returns 0 if there is no item there.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction actionAt(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionAt_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_actionAt_QPoint(long __this__nativeId, long arg__1);

/**
Returns the geometry of action <tt>act</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect actionGeometry(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionGeometry_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_actionGeometry_QAction(long __this__nativeId, long arg__1);

/**
Returns the currently highlighted action, or 0 if no action is currently highlighted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#setActiveAction(com.trolltech.qt.gui.QAction) setActiveAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction activeAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_activeAction(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function creates a new action with an <tt>icon</tt> and some <tt>text</tt>. The function adds the newly created action to the menu's list of actions, and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addAction(com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addAction_QIcon_String(nativeId(), icon == null ? 0 : icon.nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addAction_QIcon_String(long __this__nativeId, long icon, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function creates a new action with <tt>text</tt>. The function adds the newly created action to the menu's list of actions, and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addAction(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addAction_String(nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addAction_String(long __this__nativeId, java.lang.String text);

/**
This convenience function adds <tt>menu</tt> as a submenu to this menu. It returns <tt>menu</tt>'s {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. This menu does not take ownership of <tt>menu</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addMenu(com.trolltech.qt.gui.QMenu menu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (menu != null) {
            __rcMenus.add(menu);
        }
        return __qt_addMenu_QMenu(nativeId(), menu == null ? 0 : menu.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addMenu_QMenu(long __this__nativeId, long menu);

/**
Appends a new QMenu with <tt>icon</tt> and <tt>title</tt> to the menu. The menu takes ownership of the menu. Returns the new menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu addMenu(com.trolltech.qt.gui.QIcon icon, java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMenu_QIcon_String(nativeId(), icon == null ? 0 : icon.nativeId(), title);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_addMenu_QIcon_String(long __this__nativeId, long icon, java.lang.String title);

/**
Appends a new QMenu with <tt>title</tt> to the menu. The menu takes ownership of the menu. Returns the new menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu addMenu(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMenu_String(nativeId(), title);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_addMenu_String(long __this__nativeId, java.lang.String title);

/**
This convenience function creates a new separator action, i. . an action with {@link com.trolltech.qt.gui.QAction#isSeparator() QAction::isSeparator()} returning true, and adds the new action to this menu's list of actions. It returns the newly created action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addSeparator()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addSeparator(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addSeparator(long __this__nativeId);

/**
Removes all the menu's actions. Actions owned by the menu and not shown in any other widget are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
If a menu does not fit on the screen it lays itself out so that it does fit. It is style dependent what layout means (for example, on Windows it will use multiple columns). <p>This functions returns the number of columns necessary.
*/

    @QtBlockedSlot
    protected final int columnCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnCount(long __this__nativeId);

/**
Returns the current default action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#setDefaultAction(com.trolltech.qt.gui.QAction) setDefaultAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction defaultAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_defaultAction(long __this__nativeId);

/**
Executes this menu synchronously. <p>This is equivalent to <tt>exec(pos())</tt>. <p>This returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>In most situations you'll want to specify the position yourself, for example, the current mouse position: <pre class="snippet">
      menu.exec(QCursor.pos());
</pre> or aligned to a widget: <pre class="snippet">
      menu.exec(somewidget.mapToGlobal(new QPoint(0,0)));
</pre> or in reaction to a {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent} *e: <pre class="snippet">
      menu.exec(e.globalPos());
</pre>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction exec()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_exec(long __this__nativeId);


/**
This is an overloaded member function, provided for convenience. <p>Executes this menu synchronously. <p>Pops up the menu so that the action <tt>action</tt> will be at the specified global position <tt>p</tt>. To translate a widget's local coordinates into global coordinates, use {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <p>This returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>Note that all signals are emitted as usual. If you connect a {@link com.trolltech.qt.gui.QAction QAction} to a slot and call the menu's {@link com.trolltech.qt.gui.QMenu#exec() exec()}, you get the result both via the signal-slot connection and in the return value of {@link com.trolltech.qt.gui.QMenu#exec() exec()}. <p>Common usage is to position the menu at the current mouse position: <pre class="snippet">
      menu.exec(QCursor.pos());
</pre> or aligned to a widget: <pre class="snippet">
      menu.exec(somewidget.mapToGlobal(new QPoint(0, 0)));
</pre> or in reaction to a {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent} *e: <pre class="snippet">
      menu.exec(e.globalPos());
</pre> When positioning a menu with {@link com.trolltech.qt.gui.QMenu#exec() exec()} or {@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, bear in mind that you cannot rely on the menu's current size(). For performance reasons, the menu adapts its size only when necessary. So in many cases, the size before and after the show is different. Instead, use sizeHint() which calculates the proper size depending on the menu's current contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction exec(com.trolltech.qt.core.QPoint pos) {
        return exec(pos, (com.trolltech.qt.gui.QAction)null);
    }
/**
This is an overloaded member function, provided for convenience. <p>Executes this menu synchronously. <p>Pops up the menu so that the action <tt>action</tt> will be at the specified global position <tt>p</tt>. To translate a widget's local coordinates into global coordinates, use {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <p>This returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>Note that all signals are emitted as usual. If you connect a {@link com.trolltech.qt.gui.QAction QAction} to a slot and call the menu's {@link com.trolltech.qt.gui.QMenu#exec() exec()}, you get the result both via the signal-slot connection and in the return value of {@link com.trolltech.qt.gui.QMenu#exec() exec()}. <p>Common usage is to position the menu at the current mouse position: <pre class="snippet">
      menu.exec(QCursor.pos());
</pre> or aligned to a widget: <pre class="snippet">
      menu.exec(somewidget.mapToGlobal(new QPoint(0, 0)));
</pre> or in reaction to a {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent} *e: <pre class="snippet">
      menu.exec(e.globalPos());
</pre> When positioning a menu with {@link com.trolltech.qt.gui.QMenu#exec() exec()} or {@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, bear in mind that you cannot rely on the menu's current size(). For performance reasons, the menu adapts its size only when necessary. So in many cases, the size before and after the show is different. Instead, use sizeHint() which calculates the proper size depending on the menu's current contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction exec(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.gui.QAction at)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec_QPoint_QAction(nativeId(), pos == null ? 0 : pos.nativeId(), at == null ? 0 : at.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_exec_QPoint_QAction(long __this__nativeId, long pos, long at);

/**
This function will forcibly hide the torn off menu making it disappear from the users desktop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#isTearOffMenuVisible() isTearOffMenuVisible()}, and {@link com.trolltech.qt.gui.QMenu#isTearOffEnabled() isTearOffEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void hideTearOffMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideTearOffMenu(nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideTearOffMenu(long __this__nativeId);

/**
This property holds The icon of the menu. This is equivalent to the {@link QAction#icon() QAction::icon} property of the {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. <p>By default, if no icon is explicitly set, this property contains a null icon.
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

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option, com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer_QAction(nativeId(), option, action == null ? 0 : action.nativeId());
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer_QAction(long __this__nativeId, com.trolltech.qt.QNativePointer option, long action);

/**
This convenience function inserts <tt>menu</tt> before action <tt>before</tt> and returns the menus {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) QWidget::insertAction()}, and {@link com.trolltech.qt.gui.QMenu#addMenu(com.trolltech.qt.gui.QMenu) addMenu()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction insertMenu(com.trolltech.qt.gui.QAction before, com.trolltech.qt.gui.QMenu menu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (menu != null) {
            __rcMenus.add(menu);
        }
        return __qt_insertMenu_QAction_QMenu(nativeId(), before == null ? 0 : before.nativeId(), menu == null ? 0 : menu.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_insertMenu_QAction_QMenu(long __this__nativeId, long before, long menu);

/**
This convenience function creates a new separator action, i. . an action with {@link com.trolltech.qt.gui.QAction#isSeparator() QAction::isSeparator()} returning true. The function inserts the newly created action into this menu's list of actions before action <tt>before</tt> and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) QWidget::insertAction()}, and {@link com.trolltech.qt.gui.QMenu#addSeparator() addSeparator()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction insertSeparator(com.trolltech.qt.gui.QAction before)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertSeparator_QAction(nativeId(), before == null ? 0 : before.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_insertSeparator_QAction(long __this__nativeId, long before);

/**
Returns true if there are no visible actions inserted into the menu, false otherwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
This property holds whether the menu supports being torn off. When true, the menu contains a special tear-off item (often shown as a dashed line at the top of the menu) that creates a copy of the menu when it is triggered. <p>This "torn-off" copy lives in a separate window. It contains the same menu items as the original menu, with the exception of the tear-off handle. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="tearOffEnabled")
    @QtBlockedSlot
    public final boolean isTearOffEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTearOffEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTearOffEnabled(long __this__nativeId);

/**
When a menu is torn off a second menu is shown to display the menu contents in a new window. When the menu is in this mode and the menu is visible returns true; otherwise false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#hideTearOffMenu() hideTearOffMenu()}, and {@link com.trolltech.qt.gui.QMenu#isTearOffEnabled() isTearOffEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTearOffMenuVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTearOffMenuVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTearOffMenuVisible(long __this__nativeId);

/**
Returns the action associated with this menu.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction menuAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_menuAction(long __this__nativeId);


/**
Displays the menu so that the action <tt>atAction</tt> will be at the specified global position <tt>p</tt>. To translate a widget's local coordinates into global coordinates, use {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <p>When positioning a menu with {@link com.trolltech.qt.gui.QMenu#exec() exec()} or {@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, bear in mind that you cannot rely on the menu's current size(). For performance reasons, the menu adapts its size only when necessary, so in many cases, the size before and after the show is different. Instead, use sizeHint() which calculates the proper size depending on the menu's current contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}, and {@link com.trolltech.qt.gui.QMenu#exec() exec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void popup(com.trolltech.qt.core.QPoint pos) {
        popup(pos, (com.trolltech.qt.gui.QAction)null);
    }
/**
Displays the menu so that the action <tt>atAction</tt> will be at the specified global position <tt>p</tt>. To translate a widget's local coordinates into global coordinates, use {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <p>When positioning a menu with {@link com.trolltech.qt.gui.QMenu#exec() exec()} or {@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, bear in mind that you cannot rely on the menu's current size(). For performance reasons, the menu adapts its size only when necessary, so in many cases, the size before and after the show is different. Instead, use sizeHint() which calculates the proper size depending on the menu's current contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}, and {@link com.trolltech.qt.gui.QMenu#exec() exec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void popup(com.trolltech.qt.core.QPoint pos, com.trolltech.qt.gui.QAction at)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_popup_QPoint_QAction(nativeId(), pos == null ? 0 : pos.nativeId(), at == null ? 0 : at.nativeId());
    }
    @QtBlockedSlot
    native void __qt_popup_QPoint_QAction(long __this__nativeId, long pos, long at);

/**
This property holds whether consecutive separators should be collapsed. This property specifies whether consecutive separators in the menu should be visually collapsed to a single one. Separators at the beginning or the end of the menu are also hidden. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="separatorsCollapsible")
    @QtBlockedSlot
    public final boolean separatorsCollapsible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_separatorsCollapsible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_separatorsCollapsible(long __this__nativeId);

/**
Sets the currently highlighted action to <tt>act</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#activeAction() activeAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setActiveAction(com.trolltech.qt.gui.QAction act)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveAction_QAction(nativeId(), act == null ? 0 : act.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setActiveAction_QAction(long __this__nativeId, long act);

/**
This will set the default action to <tt>act</tt>. The default action may have a visual queue depending on the current {@link com.trolltech.qt.gui.QStyle QStyle}. A default action is usually meant to indicate what will defaultly happen on a drop, as shown in a context menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#defaultAction() defaultAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setDefaultAction(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultAction_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setDefaultAction_QAction(long __this__nativeId, long arg__1);

/**
This property holds The icon of the menu. This is equivalent to the {@link QAction#icon() QAction::icon} property of the {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. <p>By default, if no icon is explicitly set, this property contains a null icon.
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
This property holds whether consecutive separators should be collapsed. This property specifies whether consecutive separators in the menu should be visually collapsed to a single one. Separators at the beginning or the end of the menu are also hidden. <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="separatorsCollapsible")
    @QtBlockedSlot
    public final void setSeparatorsCollapsible(boolean collapse)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSeparatorsCollapsible_boolean(nativeId(), collapse);
    }
    @QtBlockedSlot
    native void __qt_setSeparatorsCollapsible_boolean(long __this__nativeId, boolean collapse);

/**
This property holds whether the menu supports being torn off. When true, the menu contains a special tear-off item (often shown as a dashed line at the top of the menu) that creates a copy of the menu when it is triggered. <p>This "torn-off" copy lives in a separate window. It contains the same menu items as the original menu, with the exception of the tear-off handle. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="tearOffEnabled")
    @QtBlockedSlot
    public final void setTearOffEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTearOffEnabled_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setTearOffEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds The title of the menu. This is equivalent to the {@link QAction#text() QAction::text} property of the {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. <p>By default, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="title")
    @QtBlockedSlot
    public final void setTitle(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setTitle_String(long __this__nativeId, java.lang.String title);

/**
This property holds The title of the menu. This is equivalent to the {@link QAction#text() QAction::text} property of the {@link com.trolltech.qt.gui.QMenu#menuAction() menuAction()}. <p>By default, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="title")
    @QtBlockedSlot
    public final java.lang.String title()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void actionEvent(com.trolltech.qt.gui.QActionEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionEvent_QActionEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_actionEvent_QActionEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void enterEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enterEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_enterEvent_QEvent(long __this__nativeId, long arg__1);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void leaveEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_leaveEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_leaveEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long arg__1);


/**
This is an overloaded member function, provided for convenience. <p>Executes a menu synchronously. <p>The menu's actions are specified by the list of <tt>actions</tt>. The menu will pop up so that the specified action, <tt>at</tt>, appears at global position <tt>pos</tt>. If <tt>at</tt> is not specified then the menu appears at position <tt>pos</tt>. <p>The function returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>This is equivalent to: <pre class="snippet">
       QMenu menu = new QMenu();
       QAction at = actions.get(0); // Assumes actions is not empty
       for (QAction a: actions)
          menu.addAction(a);
       menu.exec(pos, at);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QAction exec(java.util.List<com.trolltech.qt.gui.QAction> actions, com.trolltech.qt.core.QPoint pos) {
        return exec(actions, pos, (com.trolltech.qt.gui.QAction)null);
    }
/**
This is an overloaded member function, provided for convenience. <p>Executes a menu synchronously. <p>The menu's actions are specified by the list of <tt>actions</tt>. The menu will pop up so that the specified action, <tt>at</tt>, appears at global position <tt>pos</tt>. If <tt>at</tt> is not specified then the menu appears at position <tt>pos</tt>. <p>The function returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>This is equivalent to: <pre class="snippet">
       QMenu menu = new QMenu();
       QAction at = actions.get(0); // Assumes actions is not empty
       for (QAction a: actions)
          menu.addAction(a);
       menu.exec(pos, at);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QAction exec(java.util.List<com.trolltech.qt.gui.QAction> actions, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.gui.QAction at)    {
        return __qt_exec_List_QPoint_QAction(actions, pos == null ? 0 : pos.nativeId(), at == null ? 0 : at.nativeId());
    }
    native static com.trolltech.qt.gui.QAction __qt_exec_List_QPoint_QAction(java.util.List<com.trolltech.qt.gui.QAction> actions, long pos, long at);

/**
This is an overloaded member function, provided for convenience. <p>Executes a menu synchronously. <p>The menu's actions are specified by the list of <tt>actions</tt>. The menu will pop up so that the specified action, <tt>at</tt>, appears at global position <tt>pos</tt>. If <tt>at</tt> is not specified then the menu appears at position <tt>pos</tt>. <tt>parent</tt> is the menu's parent widget; specifying the parent will provide context when <tt>pos</tt> alone is not enough to decide where the menu should go (e.g., with multiple desktops or when the parent is embedded in {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}). <p>The function returns the triggered {@link com.trolltech.qt.gui.QAction QAction} in either the popup menu or one of its submenus, or 0 if no item was triggered (normally because the user pressed Esc). <p>This is equivalent to: <pre class="snippet">
       QMenu menu = new QMenu();
       QAction at = actions.get(0); // Assumes actions is not empty
       for (QAction a: actions)
          menu.addAction(a);
       menu.exec(pos, at);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu#popup(com.trolltech.qt.core.QPoint) popup()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QAction exec(java.util.List<com.trolltech.qt.gui.QAction> actions, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.gui.QAction at, com.trolltech.qt.gui.QWidget parent)    {
        return __qt_exec_List_QPoint_QAction_QWidget(actions, pos == null ? 0 : pos.nativeId(), at == null ? 0 : at.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QAction __qt_exec_List_QPoint_QAction_QWidget(java.util.List<com.trolltech.qt.gui.QAction> actions, long pos, long at, long parent);

/**
@exclude
*/

    public static native QMenu fromNativePointer(QNativePointer nativePointer);

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

    protected QMenu(QPrivateConstructor p) { super(p); } 

/**
Initialize <tt>option</tt> with the values from this menu and information
from <tt>action</tt>. This method is useful for subclasses when they need a
QStyleOptionMenuItem, but don't want to fill in all the information
themselves.
*/

    protected final void initStyleOption(com.trolltech.qt.gui.QStyleOptionMenuItem option, QAction action) {
        initStyleOption(option.nativePointer(), action);
    }


    // TEMPLATE - gui.addAction_with_shortcut - START
    // TEMPLATE - gui.addAction - START
/**
This convenience function creates a new action with the text
<tt>text</tt>. The action's QAction.triggered() signal is connected to
the <tt>receiver</tt>'s <tt>method</tt> slot. The function adds the
newly created action to the menu's list of actions and returns it.
*/

    public final QAction addAction(String text, Object receiver, String method, QKeySequence shortcut) {
        QAction returned = addAction(text);
        returned.setShortcut(shortcut);
        returned.triggered.connect(receiver, method);

        return returned;
    }

/**
This convenience function creates a new action with the text <tt>text</tt> and an optional shortcut <tt>shortcut</tt>. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to the <tt>receiver</tt>'s <tt>member</tt> slot. The function adds the newly created action to the menu's list of actions and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    public final QAction addAction(String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal, QKeySequence shortcut) {
        QAction returned = addAction(text);
        returned.setShortcut(shortcut);
        returned.triggered.connect(signal);
        return returned;
    }
    // TEMPLATE - gui.addAction - END

/**
This convenience function creates a new action with the text
<tt>text</tt>. The action's QAction.triggered() signal is connected to
the <tt>receiver</tt>'s <tt>method</tt> slot. The function adds the
newly created action to the menu's list of actions and returns it.
*/

    public final QAction addAction(String text, Object receiver, String method) {
        return addAction(text, receiver, method, new QKeySequence(0));
    }

/**
This convenience function creates a new action with the text <tt>text</tt> and an optional shortcut <tt>shortcut</tt>. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to the <tt>receiver</tt>'s <tt>member</tt> slot. The function adds the newly created action to the menu's list of actions and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    public final QAction addAction(String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal) {
        return addAction(text, signal, new QKeySequence(0));
    }
    // TEMPLATE - gui.addAction_with_shortcut - END


    // TEMPLATE - gui.addAction_with_shortcut - START
    // TEMPLATE - gui.addAction - START
/**
This function creates a new action with the given <tt>icon</tt>,
<tt>shortcut</tt>, and <tt>text</tt>. It is connected to the
<tt>receiver</tt>'s <tt>method</tt> slot. It returns the created
action.
*/

    public final QAction addAction(QIcon icon, String text, Object receiver, String method, QKeySequence shortcut) {
        QAction returned = addAction(icon, text);
        returned.setShortcut(shortcut);
        returned.triggered.connect(receiver, method);

        return returned;
    }

/**
This convenience function creates a new action with an <tt>icon</tt> and some <tt>text</tt> and an optional shortcut <tt>shortcut</tt>. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to the <tt>member</tt> slot of the <tt>receiver</tt> object. The function adds the newly created action to the menu's list of actions, and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    public final QAction addAction(QIcon icon, String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal, QKeySequence shortcut) {
        QAction returned = addAction(icon, text);
        returned.setShortcut(shortcut);
        returned.triggered.connect(signal);
        return returned;
    }
    // TEMPLATE - gui.addAction - END

/**
This method creates a new action with the given <tt>icon</tt> and
<tt>text</tt>. It is connected to the <tt>receiver</tt>'s
<tt>method</tt> slot. It returns the created action.
*/

    public final QAction addAction(QIcon icon, String text, Object receiver, String method) {
        return addAction(icon, text, receiver, method, new QKeySequence(0));
    }

/**
This convenience function creates a new action with an <tt>icon</tt> and some <tt>text</tt> and an optional shortcut <tt>shortcut</tt>. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to the <tt>member</tt> slot of the <tt>receiver</tt> object. The function adds the newly created action to the menu's list of actions, and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    public final QAction addAction(QIcon icon, String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal) {
        return addAction(icon, text, signal, new QKeySequence(0));
    }
    // TEMPLATE - gui.addAction_with_shortcut - END

}
