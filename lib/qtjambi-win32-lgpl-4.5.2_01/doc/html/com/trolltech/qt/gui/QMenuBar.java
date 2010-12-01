package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMenuBar class provides a horizontal menu bar. A menu bar consists of a list of pull-down menu items. You add menu items with {@link com.trolltech.qt.gui.QMenuBar#addMenu(com.trolltech.qt.gui.QMenu) addMenu()}. For example, asuming that <tt>menubar</tt> is a pointer to a QMenuBar and <tt>fileMenu</tt> is a pointer to a {@link com.trolltech.qt.gui.QMenu QMenu}, the following statement inserts the menu into the menu bar: <pre class="snippet">
      menubar.addMenu(fileMenu);
</pre> The ampersand in the menu item's text sets Alt+F as a shortcut for this menu. (You can use "&&" to get a real ampersand in the menu bar.) <p>There is no need to lay out a menu bar. It automatically sets its own geometry to the top of the parent widget and changes it appropriately whenever the parent is resized.<a name="usage"><h2>Usage</h2> In most main window style applications you would use the {@link com.trolltech.qt.gui.QMainWindow#menuBar() menuBar()} function provided in {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, adding {@link com.trolltech.qt.gui.QMenu QMenu}s to the menu bar and adding {@link com.trolltech.qt.gui.QAction QAction}s to the pop-up menus. <p>Example (from the {@link <a href="../qtjambi-menus.html">Menus</a>} example):<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
    fileMenu = menuBar()-&gt;addMenu(tr("&File"));
    fileMenu-&gt;addAction(newAct);
</pre> Menu items may be removed with {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <p>Widgets can be added to menus by using instances of the {@link com.trolltech.qt.gui.QWidgetAction QWidgetAction} class to hold them. These actions can then be inserted into menus in the usual way; see the {@link com.trolltech.qt.gui.QMenu QMenu} documentation for more details.<a name="platform-dependent-look-and-feel"><h2>Platform Dependent Look and Feel</h2> Different platforms have different requirements for the appearance of menu bars and their behavior when the user interacts with them. For example, Windows systems are often configured so that the underlined character mnemonics that indicate keyboard shortcuts for items in the menu bar are only shown when the <b>Alt</b> key is pressed. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-menubar.png"></center><br> Plastique widget style.</td><td> The {@link com.trolltech.qt.gui.QPlastiqueStyle Plastique widget style}, like most other styles, handles the <b>Help</b> menu in the same way as it handles any other menu.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/motif-menubar.png"></center><br> Motif widget style.</td><td> The {@link com.trolltech.qt.gui.QMotifStyle Motif widget style} treats <b>Help</b> menus in a special way, placing them at right-hand end of the menu bar.</td></tr></table><a name="qmenubar-on-mac-os-x"><h2>QMenuBar on Mac OS X</h2> QMenuBar on Mac OS X is a wrapper for using the system-wide menu bar. If you have multiple menu bars in one dialog the outermost menu bar (normally inside a widget with widget flag {@link com.trolltech.qt.core.Qt.WindowType Qt::Window }) will be used for the system-wide menu bar. <p>Qt for Mac OS X also provides a menu bar merging feature to make QMenuBar conform more closely to accepted Mac OS X menu bar layout. The merging functionality is based on string matching the title of a {@link com.trolltech.qt.gui.QMenu QMenu} entry. These strings are translated (using QObject::tr()) in the "QMenuBar" context. If an entry is moved its slots will still fire as if it was in the original place. The table below outlines the strings looked for and where the entry is placed if matched: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> String matches</center></th><th><center> Placement</center></th><th><center> Notes</center></th></tr></thead><tr valign="top" class="even"><td> about.*</td><td> Application Menu | About &lt;application name&gt;</td><td> If this entry is not found no About item will appear in the Application Menu</td></tr><tr valign="top" class="odd"><td> config, options, setup, settings or preferences</td><td> Application Menu | Preferences</td><td> If this entry is not found the Settings item will be disabled</td></tr><tr valign="top" class="even"><td> quit or exit</td><td> Application Menu | Quit &lt;application name&gt;</td><td> If this entry is not found a default Quit item will be created to call {@link com.trolltech.qt.core.QCoreApplication#quit() QApplication::quit()}</td></tr></table> You can override this behavior by using the {@link QAction#menuRole() QAction::menuRole()} property. <p>If you want all windows in a Mac application to share one menu bar, you must create a menu bar that does not have a parent. Create a parent-less menu bar this way: <pre class="snippet">
        QMenuBar menuBar = new QMenuBar();
</pre> <b>Note:</b> Do not call {@link com.trolltech.qt.gui.QMainWindow#menuBar() QMainWindow::menuBar()} to create the shared menu bar, because that menu bar will have the {@link com.trolltech.qt.gui.QMainWindow QMainWindow} as its parent. That menu bar would only be displayed for the parent {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><b>Note:</b> The text used for the application name in the menu bar is obtained from the value set in the <tt>Info.plist</tt> file in the application's bundle. See {@link <a href="../deployment-mac.html">Deploying an Application on Mac OS X</a>} for more information.<a name="qmenubar-on-windows-ce"><h2>QMenuBar on Windows CE</h2> QMenuBar on Windows CE is a wrapper for using the system-wide menu bar, similar to the Mac. This feature is activated for Windows Mobile and integrates QMenuBar with the native soft keys. The left soft key can be controlled with QMenuBar::setDefaultAction() and the right soft key can be used to access the menu bar. <p>The {@link com.trolltech.qt.gui.QMenuBar#hovered hovered() } signal is not supported for the native menu integration. Also, it is not possible to display an icon in a native menu on Windows Mobile.<a name="examples"><h2>Examples</h2> The {@link <a href="../qtjambi-menus.html">Menus</a>} example shows how to use QMenuBar and {@link com.trolltech.qt.gui.QMenu QMenu}. The other {@link <a href="../examples.html#main-windows">main window application examples</a>} also provide menus using these classes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QShortcut QShortcut}, {@link com.trolltech.qt.gui.QAction QAction}, {@link <a href="../guibooks.html">GUI Design Handbook: Menu Bar</a>}, and {@link <a href="../qtjambi-menus.html">Menus Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMenuBar extends com.trolltech.qt.gui.QWidget
{

    private java.util.Collection<Object> __rcMenus = new java.util.ArrayList<Object>();
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when a menu action is highlighted; <tt>action</tt> is the action that caused the event to be sent. <p>Often this is used to update status information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar#triggered triggered() }, and {@link com.trolltech.qt.gui.QAction#hovered QAction::hovered() }. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when an action in a menu belonging to this menubar is triggered as a result of a mouse click; <tt>action</tt> is the action that caused the signal to be emitted. <p>Normally, you connect each menu action to a single slot using {@link com.trolltech.qt.gui.QAction#triggered QAction::triggered() }, but sometimes you will want to connect several items to a single slot (most often if the user selects from an array). This signal is useful in such cases. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar#hovered hovered() }, and {@link com.trolltech.qt.gui.QAction#triggered QAction::triggered() }. <br></DD></DT>
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
Constructs a menu bar with parent <tt>parent</tt>.
*/

    public QMenuBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a menu bar with parent <tt>parent</tt>.
*/

    public QMenuBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QMenuBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMenuBar_QWidget(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
Returns the {@link com.trolltech.qt.gui.QAction QAction} that is currently highlighted. A null pointer will be returned if no action is currently selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar#setActiveAction(com.trolltech.qt.gui.QAction) setActiveAction()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>This convenience function creates a new action with <tt>text</tt>. The function adds the newly created action to the menu's list of actions, and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()}. <br></DD></DT>
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
Appends <tt>menu</tt> to the menu bar. Returns the menu's menuAction(). <p><b>Note:</b> The returned {@link com.trolltech.qt.gui.QAction QAction} object can be used to hide the corresponding menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
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
Appends a new {@link com.trolltech.qt.gui.QMenu QMenu} with <tt>icon</tt> and <tt>title</tt> to the menu bar. The menu bar takes ownership of the menu. Returns the new menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
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
Appends a new {@link com.trolltech.qt.gui.QMenu QMenu} with <tt>title</tt> to the menu bar. The menu bar takes ownership of the menu. Returns the new menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}, and {@link com.trolltech.qt.gui.QMenu#menuAction() QMenu::menuAction()}. <br></DD></DT>
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
Appends a separator to the menu.
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
Removes all the actions from the menu bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cornerWidget() {
        return cornerWidget(com.trolltech.qt.core.Qt.Corner.TopRightCorner);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cornerWidget(com.trolltech.qt.core.Qt.Corner corner)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cornerWidget_Corner(nativeId(), corner.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_cornerWidget_Corner(long __this__nativeId, int corner);

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
This convenience function inserts <tt>menu</tt> before action <tt>before</tt> and returns the menus menuAction(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) QWidget::insertAction()}, and {@link com.trolltech.qt.gui.QMenuBar#addMenu(com.trolltech.qt.gui.QMenu) addMenu()}. <br></DD></DT>
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
This convenience function creates a new separator action, i. . an action with {@link com.trolltech.qt.gui.QAction#isSeparator() QAction::isSeparator()} returning true. The function inserts the newly created action into this menu bar's list of actions before action <tt>before</tt> and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) QWidget::insertAction()}, and {@link com.trolltech.qt.gui.QMenuBar#addSeparator() addSeparator()}. <br></DD></DT>
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
This property holds the popup orientation. The default popup orientation. By default, menus pop "down" the screen. By setting the property to true, the menu will pop "up". You might call this for menus that are below the document to which they refer. <p>If the menu would not fit on the screen, the other direction is used automatically.
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultUp")
    @QtBlockedSlot
    public final boolean isDefaultUp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDefaultUp(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDefaultUp(long __this__nativeId);

/**
Sets the currently highlighted action to <tt>act</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar#activeAction() activeAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setActiveAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setActiveAction_QAction(long __this__nativeId, long action);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCornerWidget(com.trolltech.qt.gui.QWidget w) {
        setCornerWidget(w, com.trolltech.qt.core.Qt.Corner.TopRightCorner);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCornerWidget(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.Corner corner)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCornerWidget_QWidget_Corner(nativeId(), w == null ? 0 : w.nativeId(), corner.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCornerWidget_QWidget_Corner(long __this__nativeId, long w, int corner);

/**
This property holds the popup orientation. The default popup orientation. By default, menus pop "down" the screen. By setting the property to true, the menu will pop "up". You might call this for menus that are below the document to which they refer. <p>If the menu would not fit on the screen, the other direction is used automatically.
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultUp")
    @QtBlockedSlot
    public final void setDefaultUp(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultUp_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDefaultUp_boolean(long __this__nativeId, boolean arg__1);

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
    public boolean eventFilter(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int heightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int arg__1);

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
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

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
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

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
@exclude
*/

    public static native QMenuBar fromNativePointer(QNativePointer nativePointer);

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

    protected QMenuBar(QPrivateConstructor p) { super(p); } 

/**
Initialize <tt>option</tt> with the values from the menu bar and information
from <tt>action</tt>. This method is useful for subclasses when they need a
QStyleOptionMenuItem, but don't want to fill in all the information
themselves.
*/

    protected final void initStyleOption(com.trolltech.qt.gui.QStyleOptionMenuItem option, QAction action) {
        initStyleOption(option.nativePointer(), action);
    }


    // TEMPLATE - gui.addAction - START
/**
This convenience function creates a new action with the given <tt>text</tt>.
The action's triggered() signal is connected to the <tt>receiver</tt>'s
<tt>method</tt> slot. The function adds the newly created action to the menu's
list of actions and returns it.
*/

    public final QAction addAction(String text, Object receiver, String method) {
        QAction returned = addAction(text);

        returned.triggered.connect(receiver, method);

        return returned;
    }

/**
This convenience function creates a new action with the given <tt>text</tt>. The action's {@link com.trolltech.qt.gui.QMenuBar#triggered triggered() } signal is connected to the <tt>receiver</tt>'s <tt>member</tt> slot. The function adds the newly created action to the menu's list of actions and returns it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    public final QAction addAction(String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal) {
        QAction returned = addAction(text);

        returned.triggered.connect(signal);
        return returned;
    }
    // TEMPLATE - gui.addAction - END

}
