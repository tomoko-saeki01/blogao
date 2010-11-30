package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMainWindow class provides a main application window. <ul><li> {@link <a href="#qt-main-window-framework">Qt Main Window Framework</a>}</li><li> {@link <a href="#creating-main-window-components">Creating Main Window Components</a>}</li> <ul><li> {@link <a href="#creating-menus">Creating Menus</a>}</li><li> {@link <a href="#creating-toolbars">Creating Toolbars</a>}</li><li> {@link <a href="#creating-dock-widgets">Creating Dock Widgets</a>}</li><li> {@link <a href="#the-status-bar">The Status Bar</a>}</li></ul><li> {@link <a href="#storing-state">Storing State</a>}</li></ul><a name="qt-main-window-framework"><h2>Qt Main Window Framework</h2> A main window provides a framework for building an application's user interface. Qt has QMainWindow and its {@link <a href="../application.html">related classes</a>} for main window management. QMainWindow has its own layout to which you can add {@link com.trolltech.qt.gui.QToolBar QToolBar}s, {@link com.trolltech.qt.gui.QDockWidget QDockWidget}s, a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}, and a {@link com.trolltech.qt.gui.QStatusBar QStatusBar}. The layout has a center area that can be occupied by any kind of widget. You can see an image of the layout below. <br><center><img src="../images/mainwindowlayout.png"></center><br> <b>Note:</b> Creating a main window without a central widget is not supported. You must have a central widget even if it is just a placeholder.<a name="creating-main-window-components"><h2>Creating Main Window Components</h2> A central widget will typically be a standard Qt widget such as a {@link com.trolltech.qt.gui.QTextEdit QTextEdit} or a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. Custom widgets can also be used for advanced applications. You set the central widget with <tt>setCentralWidget()</tt>. <p>Main windows have either a single (SDI) or multiple (MDI) document interface. You create MDI applications in Qt by using a {@link com.trolltech.qt.gui.QMdiArea QMdiArea} as the central widget. <p>We will now examine each of the other widgets that can be added to a main window. We give examples on how to create and add them.<a name="creating-menus"><h3>Creating Menus</h3> Qt implements menus in {@link com.trolltech.qt.gui.QMenu QMenu} and QMainWindow keeps them in a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}. {@link com.trolltech.qt.gui.QAction QAction}s are added to the menus, which display them as menu items. <p>You can add new menus to the main window's menu bar by calling <tt>menuBar()</tt>, which returns the {@link com.trolltech.qt.gui.QMenuBar QMenuBar} for the window, and then add a menu with {@link com.trolltech.qt.gui.QMenuBar#addMenu(com.trolltech.qt.gui.QMenu) QMenuBar::addMenu()}. <p>QMainWindow comes with a default menu bar, but you can also set one yourself with <tt>setMenuBar()</tt>. If you wish to implement a custom menu bar (i.e., not use the {@link com.trolltech.qt.gui.QMenuBar QMenuBar} widget), you can set it with <tt>setMenuWidget()</tt>. <p>An example of how to create menus follows:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MainWindow::createMenus()
 
{
    fileMenu = menuBar()-&gt;addMenu(tr("&File"));
    fileMenu-&gt;addAction(newAct);

    fileMenu-&gt;addAction(openAct);

    fileMenu-&gt;addAction(saveAct);
</pre> The <tt>createPopupMenu()</tt> function creates popup menus when the main window receives context menu events. The default implementation generates a menu with the checkable actions from the dock widgets and toolbars. You can reimplement <tt>createPopupMenu()</tt> for a custom menu.<a name="creating-toolbars"><h3>Creating Toolbars</h3> Toolbars are implemented in the {@link com.trolltech.qt.gui.QToolBar QToolBar} class. You add a toolbar to a main window with <tt>addToolBar()</tt>. <p>You control the initial position of toolbars by assigning them to a specific {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }. You can split an area by inserting a toolbar break - think of this as a line break in text editing - with <tt>addToolBarBreak()</tt> or <tt>insertToolBarBreak()</tt>. You can also restrict placement by the user with {@link QToolBar#setAllowedAreas(com.trolltech.qt.core.Qt.ToolBarArea[]) QToolBar::setAllowedAreas()} and {@link QToolBar#setMovable(boolean) QToolBar::setMovable()}. <p>The size of toolbar icons can be retrieved with <tt>iconSize()</tt>. The sizes are platform dependent; you can set a fixed size with <tt>setIconSize()</tt>. You can alter the appearance of all tool buttons in the toolbars with <tt>setToolButtonStyle()</tt>. <p>An example of toolbar creation follows:<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
void MainWindow::createToolBars()
{
    fileToolBar = addToolBar(tr("File"));
    fileToolBar-&gt;addAction(newAct);
</pre><a name="creating-dock-widgets"><h3>Creating Dock Widgets</h3> Dock widgets are implemented in the {@link com.trolltech.qt.gui.QDockWidget QDockWidget} class. A dock widget is a window that can be docked into the main window. You add dock widgets to a main window with <tt>addDockWidget()</tt>. <p>There are four dock widget areas as given by the {@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::DockWidgetArea } enum: left, right, top, and bottom. You can specify which dock widget area that should occupy the corners where the areas overlap with <tt>setCorner()</tt>. By default each area can only contain one row (vertical or horizontal) of dock widgets, but if you enable nesting with <tt>setDockNestingEnabled()</tt>, dock widgets can be added in either direction. <p>Two dock widgets may also be stacked on top of each other. A {@link com.trolltech.qt.gui.QTabBar QTabBar} is then used to select which of the widgets that should be displayed. <p>We give an example of how to create and add dock widgets to a main window: <pre class="snippet">
        QDockWidget dockWidget = new QDockWidget(tr("Dock Widget"), this);
        dockWidget.setAllowedAreas(Qt.DockWidgetArea.LeftDockWidgetArea);
        dockWidget.setWidget(dockWidgetContents);
        addDockWidget(Qt.DockWidgetArea.LeftDockWidgetArea, dockWidget);
    </pre><a name="the-status-bar"><h3>The Status Bar</h3> You can set a status bar with <tt>setStatusBar()</tt>, but one is created the first time <tt>statusBar()</tt> (which returns the main window's status bar) is called. See {@link com.trolltech.qt.gui.QStatusBar QStatusBar} for information on how to use it.<a name="storing-state"><h2>Storing State</h2> QMainWindow can store the state of its layout with <tt>saveState()</tt>; it can later be retrieved with <tt>restoreState()</tt>. It is the position and size (relative to the size of the main window) of the toolbars and dock widgets that are stored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMenuBar QMenuBar}, {@link com.trolltech.qt.gui.QToolBar QToolBar}, {@link com.trolltech.qt.gui.QStatusBar QStatusBar}, {@link com.trolltech.qt.gui.QDockWidget QDockWidget}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../mainwindows-dockwidgets.html">Dock Widgets Example</a>}, {@link <a href="../qtjambi-mdi.html">MDI Example</a>}, {@link <a href="../mainwindows-sdi.html">SDI Example</a>}, and {@link <a href="../qtjambi-menus.html">Menus Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMainWindow extends com.trolltech.qt.gui.QWidget
{
/**
This enum contains flags that specify the docking behavior of {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. These options only control how dock widgets may be dropped in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. They do not re-arrange the dock widgets to conform with the specified options. For this reason they should be set before any dock widgets are added to the main window. Exceptions to this are the {@link com.trolltech.qt.gui.QMainWindow.DockOption AnimatedDocks } and {@link com.trolltech.qt.gui.QMainWindow.DockOption VerticalTabs } options, which may be set at any time.
*/

    public enum DockOption implements com.trolltech.qt.QtEnumerator {
/**
 Identical to the {@link QMainWindow#isAnimated() animated} property.
*/

        AnimatedDocks(1),
/**
 Identical to the {@link QMainWindow#isDockNestingEnabled() dockNestingEnabled} property.
*/

        AllowNestedDocks(2),
/**
 The user can drop one dock widget "on top" of another. The two widgets are stacked and a tab bar appears for selecting which one is visible.
*/

        AllowTabbedDocks(4),
/**
 Each dock area contains a single stack of tabbed dock widgets. In other words, dock widgets cannot be placed next to each other in a dock area. If this option is set, {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowNestedDocks } has no effect.
*/

        ForceTabbedDocks(8),
/**
 The two vertical dock areas on the sides of the main window show their tabs vertically. If this option is not set, all dock areas show their tabs at the bottom. Implies {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowTabbedDocks }. See also {@link com.trolltech.qt.gui.QMainWindow#setTabPosition(com.trolltech.qt.core.Qt.DockWidgetAreas, com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}.
*/

        VerticalTabs(16);

        DockOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QMainWindow$DockOptions with the specified <tt>com.trolltech.qt.gui.QMainWindow$DockOption[]</tt> QMainWindow$DockOption values set.</brief>
*/

        public static DockOptions createQFlags(DockOption ... values) {
            return new DockOptions(values);
        }
/**
<brief>Returns the QMainWindow$DockOption constant with the specified <tt>int</tt>.</brief>
*/

        public static DockOption resolve(int value) {
            return (DockOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return AnimatedDocks;
            case 2: return AllowNestedDocks;
            case 4: return AllowTabbedDocks;
            case 8: return ForceTabbedDocks;
            case 16: return VerticalTabs;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class DockOptions extends com.trolltech.qt.QFlags<DockOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QMainWindow-DockOptions with the specified <tt>com.trolltech.qt.gui.QMainWindow.DockOption[]</tt>. flags set.</brief>
*/

        public DockOptions(DockOption ... args) { super(args); }
        public DockOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QSize(named: iconSize)&gt;:<p> This signal is emitted when the size of the icons used in the window is changed. The new icon size is passed in <tt>iconSize</tt>. <p>You can connect this signal to other components to help maintain a consistent appearance for your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setIconSize(com.trolltech.qt.core.QSize) setIconSize()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QSize> iconSizeChanged = new Signal1<com.trolltech.qt.core.QSize>();

    private final void iconSizeChanged(com.trolltech.qt.core.QSize iconSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_iconSizeChanged_QSize(nativeId(), iconSize == null ? 0 : iconSize.nativeId());
    }
    native void __qt_iconSizeChanged_QSize(long __this__nativeId, long iconSize);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$ToolButtonStyle(named: toolButtonStyle)&gt;:<p> This signal is emitted when the style used for tool buttons in the window is changed. The new style is passed in <tt>toolButtonStyle</tt>. <p>You can connect this signal to other components to help maintain a consistent appearance for your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle) setToolButtonStyle()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.Qt.ToolButtonStyle> toolButtonStyleChanged = new Signal1<com.trolltech.qt.core.Qt.ToolButtonStyle>();

    private final void toolButtonStyleChanged(com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toolButtonStyleChanged_ToolButtonStyle(nativeId(), toolButtonStyle.value());
    }
    native void __qt_toolButtonStyleChanged_ToolButtonStyle(long __this__nativeId, int toolButtonStyle);


/**
This is an overloaded method provided for convenience.
*/

    public QMainWindow(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a QMainWindow with the given <tt>parent</tt> and the specified widget <tt>flags</tt>.
*/

    public QMainWindow(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QMainWindow with the given <tt>parent</tt> and the specified widget <tt>flags</tt>.
*/

    public QMainWindow() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QMainWindow with the given <tt>parent</tt> and the specified widget <tt>flags</tt>.
*/

    public QMainWindow(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QMainWindow_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QMainWindow_QWidget_WindowFlags(long parent, int flags);

/**
Adds the given <tt>dockwidget</tt> to the specified <tt>area</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addDockWidget(com.trolltech.qt.core.Qt.DockWidgetArea area, com.trolltech.qt.gui.QDockWidget dockwidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addDockWidget_DockWidgetArea_QDockWidget(nativeId(), area.value(), dockwidget == null ? 0 : dockwidget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addDockWidget_DockWidgetArea_QDockWidget(long __this__nativeId, int area, long dockwidget);

/**
Adds <tt>dockwidget</tt> into the given <tt>area</tt> in the direction specified by the <tt>orientation</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addDockWidget(com.trolltech.qt.core.Qt.DockWidgetArea area, com.trolltech.qt.gui.QDockWidget dockwidget, com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addDockWidget_DockWidgetArea_QDockWidget_Orientation(nativeId(), area.value(), dockwidget == null ? 0 : dockwidget.nativeId(), orientation.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addDockWidget_DockWidgetArea_QDockWidget_Orientation(long __this__nativeId, int area, long dockwidget, int orientation);

/**
This is an overloaded member function, provided for convenience. <p>Equivalent of calling addToolBar({@link com.trolltech.qt.core.Qt.ToolBarArea Qt::TopToolBarArea }, <tt>toolbar</tt>)
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addToolBar(com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addToolBar_QToolBar(nativeId(), toolbar == null ? 0 : toolbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addToolBar_QToolBar(long __this__nativeId, long toolbar);

/**
Adds the <tt>toolbar</tt> into the specified <tt>area</tt> in this main window. The <tt>toolbar</tt> is placed at the end of the current tool bar block (i.e. line). If the main window already manages <tt>toolbar</tt> then it will only move the toolbar to <tt>area</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#insertToolBar(com.trolltech.qt.gui.QToolBar, com.trolltech.qt.gui.QToolBar) insertToolBar()}, {@link com.trolltech.qt.gui.QMainWindow#addToolBarBreak() addToolBarBreak()}, and {@link com.trolltech.qt.gui.QMainWindow#insertToolBarBreak(com.trolltech.qt.gui.QToolBar) insertToolBarBreak()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addToolBar(com.trolltech.qt.core.Qt.ToolBarArea area, com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addToolBar_ToolBarArea_QToolBar(nativeId(), area.value(), toolbar == null ? 0 : toolbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addToolBar_ToolBarArea_QToolBar(long __this__nativeId, int area, long toolbar);

/**
This is an overloaded member function, provided for convenience. <p>Creates a {@link com.trolltech.qt.gui.QToolBar QToolBar} object, setting its window title to <tt>title</tt>, and inserts it into the top toolbar area. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QToolBar addToolBar(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addToolBar_String(nativeId(), title);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QToolBar __qt_addToolBar_String(long __this__nativeId, java.lang.String title);


/**
Adds a toolbar break to the given <tt>area</tt> after all the other objects that are present.
*/

    @QtBlockedSlot
    public final void addToolBarBreak() {
        addToolBarBreak(com.trolltech.qt.core.Qt.ToolBarArea.TopToolBarArea);
    }
/**
Adds a toolbar break to the given <tt>area</tt> after all the other objects that are present.
*/

    @QtBlockedSlot
    public final void addToolBarBreak(com.trolltech.qt.core.Qt.ToolBarArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addToolBarBreak_ToolBarArea(nativeId(), area.value());
    }
    @QtBlockedSlot
    native void __qt_addToolBarBreak_ToolBarArea(long __this__nativeId, int area);

/**
Returns the central widget for the main window. This function returns zero if the central widget has not been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setCentralWidget(com.trolltech.qt.gui.QWidget) setCentralWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget centralWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_centralWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_centralWidget(long __this__nativeId);

/**
Returns the dock widget area that occupies the specified <tt>corner</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setCorner(com.trolltech.qt.core.Qt.Corner, com.trolltech.qt.core.Qt.DockWidgetArea) setCorner()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DockWidgetArea corner(com.trolltech.qt.core.Qt.Corner corner)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DockWidgetArea.resolve(__qt_corner_Corner(nativeId(), corner.value()));
    }
    @QtBlockedSlot
    native int __qt_corner_Corner(long __this__nativeId, int corner);

/**
This property holds the docking behavior of QMainWindow. The default value is {@link com.trolltech.qt.gui.QMainWindow.DockOption AnimatedDocks } | {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowTabbedDocks }.
*/

    @com.trolltech.qt.QtPropertyReader(name="dockOptions")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMainWindow.DockOptions dockOptions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QMainWindow.DockOptions(__qt_dockOptions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dockOptions(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::DockWidgetArea } for <tt>dockwidget</tt>. If <tt>dockwidget</tt> has not been added to the main window, this function returns <tt>Qt::NoDockWidgetArea</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#addDockWidget(com.trolltech.qt.core.Qt.DockWidgetArea, com.trolltech.qt.gui.QDockWidget) addDockWidget()}, {@link com.trolltech.qt.gui.QMainWindow#splitDockWidget(com.trolltech.qt.gui.QDockWidget, com.trolltech.qt.gui.QDockWidget, com.trolltech.qt.core.Qt.Orientation) splitDockWidget()}, and {@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::DockWidgetArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DockWidgetArea dockWidgetArea(com.trolltech.qt.gui.QDockWidget dockwidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DockWidgetArea.resolve(__qt_dockWidgetArea_QDockWidget(nativeId(), dockwidget == null ? 0 : dockwidget.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dockWidgetArea_QDockWidget(long __this__nativeId, long dockwidget);

/**
This property holds whether the tab bar for tabbed dockwidgets is set to document mode.  The default is false. <p><DT><b>See also:</b><br><DD>{@link QTabBar#documentMode() QTabBar::documentMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="documentMode")
    @QtBlockedSlot
    public final boolean documentMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_documentMode(long __this__nativeId);

/**
This property holds size of toolbar icons in this mainwindow.  The default is the default tool bar icon size of the GUI style. Note that the icons used must be at least of this size as the icons are only scaled down.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
Inserts the <tt>toolbar</tt> into the area occupied by the <tt>before</tt> toolbar so that it appears before it. For example, in normal left-to-right layout operation, this means that <tt>toolbar</tt> will appear to the left of the toolbar specified by <tt>before</tt> in a horizontal toolbar area. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#insertToolBarBreak(com.trolltech.qt.gui.QToolBar) insertToolBarBreak()}, {@link com.trolltech.qt.gui.QMainWindow#addToolBar(com.trolltech.qt.gui.QToolBar) addToolBar()}, and {@link com.trolltech.qt.gui.QMainWindow#addToolBarBreak() addToolBarBreak()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertToolBar(com.trolltech.qt.gui.QToolBar before, com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertToolBar_QToolBar_QToolBar(nativeId(), before == null ? 0 : before.nativeId(), toolbar == null ? 0 : toolbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertToolBar_QToolBar_QToolBar(long __this__nativeId, long before, long toolbar);

/**
Inserts a toolbar break before the toolbar specified by <tt>before</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertToolBarBreak(com.trolltech.qt.gui.QToolBar before)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertToolBarBreak_QToolBar(nativeId(), before == null ? 0 : before.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertToolBarBreak_QToolBar(long __this__nativeId, long before);

/**
This property holds whether manipulating dock widgets and tool bars is animated. When a dock widget or tool bar is dragged over the main window, the main window adjusts its contents to indicate where the dock widget or tool bar will be docked if it is dropped. Setting this property causes QMainWindow to move its contents in a smooth animation. Clearing this property causes the contents to snap into their new positions. <p>By default, this property is set. It may be cleared if the main window contains widgets which are slow at resizing or repainting themselves. <p>Setting this property is identical to setting the {@link com.trolltech.qt.gui.QMainWindow.DockOption AnimatedDocks } option using {@link com.trolltech.qt.gui.QMainWindow#setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOption[]) setDockOptions()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="animated")
    @QtBlockedSlot
    public final boolean isAnimated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAnimated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAnimated(long __this__nativeId);

/**
This property holds whether docks can be nested. If this property is false, dock areas can only contain a single row (horizontal or vertical) of dock widgets. If this property is true, the area occupied by a dock widget can be split in either direction to contain more dock widgets. <p>Dock nesting is only necessary in applications that contain a lot of dock widgets. It gives the user greater freedom in organizing their main window. However, dock nesting leads to more complex (and less intuitive) behavior when a dock widget is dragged over the main window, since there are more ways in which a dropped dock widget may be placed in the dock area. <p>Setting this property is identical to setting the {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowNestedDocks } option using {@link com.trolltech.qt.gui.QMainWindow#setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOption[]) setDockOptions()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="dockNestingEnabled")
    @QtBlockedSlot
    public final boolean isDockNestingEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDockNestingEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDockNestingEnabled(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isSeparator(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSeparator_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSeparator_QPoint(long __this__nativeId, long pos);

/**
Returns the menu bar for the main window. This function creates and returns an empty menu bar if the menu bar does not exist. <p>If you want all windows in a Mac application to share one menu bar, don't use this function to create it, because the menu bar created here will have this QMainWindow as its parent. Instead, you must create a menu bar that does not have a parent, which you can then share among all the Mac windows. Create a parent-less menu bar this way: <pre class="snippet">
        QMenuBar menuBar = new QMenuBar();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setMenuBar(com.trolltech.qt.gui.QMenuBar) setMenuBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenuBar menuBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenuBar __qt_menuBar(long __this__nativeId);

/**
Returns the menu bar for the main window. This function returns null if a menu bar hasn't been constructed yet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setMenuWidget(com.trolltech.qt.gui.QWidget) setMenuWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget menuWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_menuWidget(long __this__nativeId);

/**
Removes the <tt>dockwidget</tt> from the main window layout and hides it. Note that the <tt>dockwidget</tt> is not deleted.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeDockWidget(com.trolltech.qt.gui.QDockWidget dockwidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeDockWidget_QDockWidget(nativeId(), dockwidget == null ? 0 : dockwidget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeDockWidget_QDockWidget(long __this__nativeId, long dockwidget);

/**
Removes the <tt>toolbar</tt> from the main window layout and hides it. Note that the <tt>toolbar</tt> is not deleted.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeToolBar(com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeToolBar_QToolBar(nativeId(), toolbar == null ? 0 : toolbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeToolBar_QToolBar(long __this__nativeId, long toolbar);

/**
Removes a toolbar break previously inserted before the toolbar specified by <tt>before</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeToolBarBreak(com.trolltech.qt.gui.QToolBar before)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeToolBarBreak_QToolBar(nativeId(), before == null ? 0 : before.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeToolBarBreak_QToolBar(long __this__nativeId, long before);

/**
Restores the state of <tt>dockwidget</tt> if it is created after the call to {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. Returns true if the state was restored; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean restoreDockWidget(com.trolltech.qt.gui.QDockWidget dockwidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreDockWidget_QDockWidget(nativeId(), dockwidget == null ? 0 : dockwidget.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_restoreDockWidget_QDockWidget(long __this__nativeId, long dockwidget);


/**
Restores the <tt>state</tt> of this mainwindow's toolbars and dockwidgets. The <tt>version</tt> number is compared with that stored in <tt>state</tt>. If they do not match, the mainwindow's state is left unchanged, and this function returns <tt>false</tt>; otherwise, the state is restored, and this function returns <tt>true</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#saveState() saveState()}, {@link com.trolltech.qt.gui.QWidget#saveGeometry() QWidget::saveGeometry()}, and {@link com.trolltech.qt.gui.QWidget#restoreGeometry(com.trolltech.qt.core.QByteArray) QWidget::restoreGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean restoreState(com.trolltech.qt.core.QByteArray state) {
        return restoreState(state, (int)0);
    }
/**
Restores the <tt>state</tt> of this mainwindow's toolbars and dockwidgets. The <tt>version</tt> number is compared with that stored in <tt>state</tt>. If they do not match, the mainwindow's state is left unchanged, and this function returns <tt>false</tt>; otherwise, the state is restored, and this function returns <tt>true</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#saveState() saveState()}, {@link com.trolltech.qt.gui.QWidget#saveGeometry() QWidget::saveGeometry()}, and {@link com.trolltech.qt.gui.QWidget#restoreGeometry(com.trolltech.qt.core.QByteArray) QWidget::restoreGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean restoreState(com.trolltech.qt.core.QByteArray state, int version)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreState_QByteArray_int(nativeId(), state == null ? 0 : state.nativeId(), version);
    }
    @QtBlockedSlot
    native boolean __qt_restoreState_QByteArray_int(long __this__nativeId, long state, int version);


/**
Saves the current state of this mainwindow's toolbars and dockwidgets. The <tt>version</tt> number is stored as part of the data. <p>The {@link QObject#objectName() objectName} property is used to identify each {@link com.trolltech.qt.gui.QToolBar QToolBar} and {@link com.trolltech.qt.gui.QDockWidget QDockWidget}. You should make sure that this property is unique for each {@link com.trolltech.qt.gui.QToolBar QToolBar} and {@link com.trolltech.qt.gui.QDockWidget QDockWidget} you add to the QMainWindow <p>To restore the saved state, pass the return value and <tt>version</tt> number to {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}, {@link com.trolltech.qt.gui.QWidget#saveGeometry() QWidget::saveGeometry()}, and {@link com.trolltech.qt.gui.QWidget#restoreGeometry(com.trolltech.qt.core.QByteArray) QWidget::restoreGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveState() {
        return saveState((int)0);
    }
/**
Saves the current state of this mainwindow's toolbars and dockwidgets. The <tt>version</tt> number is stored as part of the data. <p>The {@link QObject#objectName() objectName} property is used to identify each {@link com.trolltech.qt.gui.QToolBar QToolBar} and {@link com.trolltech.qt.gui.QDockWidget QDockWidget}. You should make sure that this property is unique for each {@link com.trolltech.qt.gui.QToolBar QToolBar} and {@link com.trolltech.qt.gui.QDockWidget QDockWidget} you add to the QMainWindow <p>To restore the saved state, pass the return value and <tt>version</tt> number to {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}, {@link com.trolltech.qt.gui.QWidget#saveGeometry() QWidget::saveGeometry()}, and {@link com.trolltech.qt.gui.QWidget#restoreGeometry(com.trolltech.qt.core.QByteArray) QWidget::restoreGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveState(int version)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveState_int(nativeId(), version);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_saveState_int(long __this__nativeId, int version);

/**
This property holds whether manipulating dock widgets and tool bars is animated. When a dock widget or tool bar is dragged over the main window, the main window adjusts its contents to indicate where the dock widget or tool bar will be docked if it is dropped. Setting this property causes QMainWindow to move its contents in a smooth animation. Clearing this property causes the contents to snap into their new positions. <p>By default, this property is set. It may be cleared if the main window contains widgets which are slow at resizing or repainting themselves. <p>Setting this property is identical to setting the {@link com.trolltech.qt.gui.QMainWindow.DockOption AnimatedDocks } option using {@link com.trolltech.qt.gui.QMainWindow#setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOption[]) setDockOptions()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="animated")
    public final void setAnimated(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAnimated_boolean(nativeId(), enabled);
    }
    native void __qt_setAnimated_boolean(long __this__nativeId, boolean enabled);

/**
Sets the given <tt>widget</tt> to be the main window's central widget. <p>Note: QMainWindow takes ownership of the <tt>widget</tt> pointer and deletes it at the appropriate time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#centralWidget() centralWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCentralWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCentralWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCentralWidget_QWidget(long __this__nativeId, long widget);

/**
Sets the given dock widget <tt>area</tt> to occupy the specified <tt>corner</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#corner(com.trolltech.qt.core.Qt.Corner) corner()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCorner(com.trolltech.qt.core.Qt.Corner corner, com.trolltech.qt.core.Qt.DockWidgetArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCorner_Corner_DockWidgetArea(nativeId(), corner.value(), area.value());
    }
    @QtBlockedSlot
    native void __qt_setCorner_Corner_DockWidgetArea(long __this__nativeId, int corner, int area);

/**
This property holds whether docks can be nested. If this property is false, dock areas can only contain a single row (horizontal or vertical) of dock widgets. If this property is true, the area occupied by a dock widget can be split in either direction to contain more dock widgets. <p>Dock nesting is only necessary in applications that contain a lot of dock widgets. It gives the user greater freedom in organizing their main window. However, dock nesting leads to more complex (and less intuitive) behavior when a dock widget is dragged over the main window, since there are more ways in which a dropped dock widget may be placed in the dock area. <p>Setting this property is identical to setting the {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowNestedDocks } option using {@link com.trolltech.qt.gui.QMainWindow#setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOption[]) setDockOptions()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="dockNestingEnabled")
    public final void setDockNestingEnabled(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDockNestingEnabled_boolean(nativeId(), enabled);
    }
    native void __qt_setDockNestingEnabled_boolean(long __this__nativeId, boolean enabled);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOption ... options) {
        this.setDockOptions(new com.trolltech.qt.gui.QMainWindow.DockOptions(options));
    }
/**
This property holds the docking behavior of QMainWindow. The default value is {@link com.trolltech.qt.gui.QMainWindow.DockOption AnimatedDocks } | {@link com.trolltech.qt.gui.QMainWindow.DockOption AllowTabbedDocks }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="dockOptions")
    @QtBlockedSlot
    public final void setDockOptions(com.trolltech.qt.gui.QMainWindow.DockOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDockOptions_DockOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setDockOptions_DockOptions(long __this__nativeId, int options);

/**
This property holds whether the tab bar for tabbed dockwidgets is set to document mode.  The default is false. <p><DT><b>See also:</b><br><DD>{@link QTabBar#documentMode() QTabBar::documentMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="documentMode")
    @QtBlockedSlot
    public final void setDocumentMode(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentMode_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setDocumentMode_boolean(long __this__nativeId, boolean enabled);

/**
This property holds size of toolbar icons in this mainwindow.  The default is the default tool bar icon size of the GUI style. Note that the icons used must be at least of this size as the icons are only scaled down.
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    @QtBlockedSlot
    public final void setIconSize(com.trolltech.qt.core.QSize iconSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), iconSize == null ? 0 : iconSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconSize_QSize(long __this__nativeId, long iconSize);

/**
Sets the menu bar for the main window to <tt>menuBar</tt>. <p>Note: QMainWindow takes ownership of the <tt>menuBar</tt> pointer and deletes it at the appropriate time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#menuBar() menuBar()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMenuBar(com.trolltech.qt.gui.QMenuBar menubar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuBar_QMenuBar(nativeId(), menubar == null ? 0 : menubar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMenuBar_QMenuBar(long __this__nativeId, long menubar);

/**
Sets the menu bar for the main window to <tt>menuBar</tt>. <p>QMainWindow takes ownership of the <tt>menuBar</tt> pointer and deletes it at the appropriate time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#menuWidget() menuWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMenuWidget(com.trolltech.qt.gui.QWidget menubar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMenuWidget_QWidget(nativeId(), menubar == null ? 0 : menubar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMenuWidget_QWidget(long __this__nativeId, long menubar);

/**
Sets the status bar for the main window to <tt>statusbar</tt>. <p>Setting the status bar to 0 will remove it from the main window. Note that QMainWindow takes ownership of the <tt>statusbar</tt> pointer and deletes it at the appropriate time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#statusBar() statusBar()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setStatusBar(com.trolltech.qt.gui.QStatusBar statusbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusBar_QStatusBar(nativeId(), statusbar == null ? 0 : statusbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setStatusBar_QStatusBar(long __this__nativeId, long statusbar);

/**
Sets the tab position for the given dock widget <tt>areas</tt> to the specified <tt>tabPosition</tt>. By default, all dock areas show their tabs at the bottom. <p><b>Note:</b> The {@link com.trolltech.qt.gui.QMainWindow.DockOption VerticalTabs } dock option overrides the tab positions set by this method. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#tabPosition(com.trolltech.qt.core.Qt.DockWidgetArea) tabPosition()}, and {@link com.trolltech.qt.gui.QMainWindow#setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape) setTabShape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabPosition(com.trolltech.qt.core.Qt.DockWidgetAreas areas, com.trolltech.qt.gui.QTabWidget.TabPosition tabPosition)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabPosition_DockWidgetAreas_TabPosition(nativeId(), areas.value(), tabPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setTabPosition_DockWidgetAreas_TabPosition(long __this__nativeId, int areas, int tabPosition);

/**
This property holds the tab shape used for tabbed dock widgets.  The default is {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setTabPosition(com.trolltech.qt.core.Qt.DockWidgetAreas, com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabShape")
    @QtBlockedSlot
    public final void setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape tabShape)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabShape_TabShape(nativeId(), tabShape.value());
    }
    @QtBlockedSlot
    native void __qt_setTabShape_TabShape(long __this__nativeId, int tabShape);

/**
This property holds style of toolbar buttons in this mainwindow.  The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="toolButtonStyle")
    @QtBlockedSlot
    public final void setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolButtonStyle_ToolButtonStyle(nativeId(), toolButtonStyle.value());
    }
    @QtBlockedSlot
    native void __qt_setToolButtonStyle_ToolButtonStyle(long __this__nativeId, int toolButtonStyle);

/**
This property holds whether the window uses the unified title and toolbar look on Mac OS X. This property is false by default and only has any effect on Mac OS X 10.4 or higher. <p>If set to true, then the top toolbar area is replaced with a Carbon HIToolbar and all toolbars in the top toolbar area are moved to that. Any toolbars added afterwards will also be added to the Carbon HIToolbar. This means a couple of things. <ul><li> QToolBars in this toolbar area are not movable and you cannot drag other toolbars to it</li><li> Toolbar breaks are not respected or preserved</li><li> Any custom widgets in the toolbar will not be shown if the toolbar becomes too small (only actions will be shown)</li><li> If you call {@link com.trolltech.qt.gui.QWidget#showFullScreen() showFullScreen()} on the main window, the {@link <a href="../porting4.html">QToolbar</a>} will disappear since it is considered to be part of the title bar. You can work around this by turning off the unified toolbar before you call {@link com.trolltech.qt.gui.QWidget#showFullScreen() showFullScreen()} and restoring it after you call {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}.</li></ul> Setting this back to false will remove these restrictions. <p>The {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_MacBrushedMetal } attribute takes precedence over this property.
*/

    @com.trolltech.qt.QtPropertyWriter(name="unifiedTitleAndToolBarOnMac")
    @QtBlockedSlot
    public final void setUnifiedTitleAndToolBarOnMac(boolean set)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUnifiedTitleAndToolBarOnMac_boolean(nativeId(), set);
    }
    @QtBlockedSlot
    native void __qt_setUnifiedTitleAndToolBarOnMac_boolean(long __this__nativeId, boolean set);

/**
Splits the space covered by the <tt>first</tt> dock widget into two parts, moves the <tt>first</tt> dock widget into the first part, and moves the <tt>second</tt> dock widget into the second part. <p>The <tt>orientation</tt> specifies how the space is divided: A {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } split places the second dock widget to the right of the first; a {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } split places the second dock widget below the first. <p>Note: if <tt>first</tt> is currently in a tabbed docked area, <tt>second</tt> will be added as a new tab, not as a neighbor of <tt>first</tt>. This is because a single tab can contain only one dock widget. <p>Note: The {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LayoutDirection } influences the order of the dock widgets in the two parts of the divided area. When right-to-left layout direction is enabled, the placing of the dock widgets will be reversed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#tabifyDockWidget(com.trolltech.qt.gui.QDockWidget, com.trolltech.qt.gui.QDockWidget) tabifyDockWidget()}, {@link com.trolltech.qt.gui.QMainWindow#addDockWidget(com.trolltech.qt.core.Qt.DockWidgetArea, com.trolltech.qt.gui.QDockWidget) addDockWidget()}, and {@link com.trolltech.qt.gui.QMainWindow#removeDockWidget(com.trolltech.qt.gui.QDockWidget) removeDockWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void splitDockWidget(com.trolltech.qt.gui.QDockWidget after, com.trolltech.qt.gui.QDockWidget dockwidget, com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_splitDockWidget_QDockWidget_QDockWidget_Orientation(nativeId(), after == null ? 0 : after.nativeId(), dockwidget == null ? 0 : dockwidget.nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_splitDockWidget_QDockWidget_QDockWidget_Orientation(long __this__nativeId, long after, long dockwidget, int orientation);

/**
Returns the status bar for the main window. This function creates and returns an empty status bar if the status bar does not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setStatusBar(com.trolltech.qt.gui.QStatusBar) setStatusBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStatusBar statusBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStatusBar __qt_statusBar(long __this__nativeId);

/**
Returns the tab position for <tt>area</tt>. <p><b>Note:</b> The {@link com.trolltech.qt.gui.QMainWindow.DockOption VerticalTabs } dock option overrides the tab positions returned by this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setTabPosition(com.trolltech.qt.core.Qt.DockWidgetAreas, com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}, and {@link com.trolltech.qt.gui.QMainWindow#tabShape() tabShape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabWidget.TabPosition tabPosition(com.trolltech.qt.core.Qt.DockWidgetArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabWidget.TabPosition.resolve(__qt_tabPosition_DockWidgetArea(nativeId(), area.value()));
    }
    @QtBlockedSlot
    native int __qt_tabPosition_DockWidgetArea(long __this__nativeId, int area);

/**
This property holds the tab shape used for tabbed dock widgets.  The default is {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#setTabPosition(com.trolltech.qt.core.Qt.DockWidgetAreas, com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tabShape")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabWidget.TabShape tabShape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabWidget.TabShape.resolve(__qt_tabShape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tabShape(long __this__nativeId);

/**
Returns the dock widgets that are tabified together with <tt>dockwidget</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#tabifyDockWidget(com.trolltech.qt.gui.QDockWidget, com.trolltech.qt.gui.QDockWidget) tabifyDockWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QDockWidget> tabifiedDockWidgets(com.trolltech.qt.gui.QDockWidget dockwidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabifiedDockWidgets_QDockWidget(nativeId(), dockwidget == null ? 0 : dockwidget.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QDockWidget> __qt_tabifiedDockWidgets_QDockWidget(long __this__nativeId, long dockwidget);

/**
Moves <tt>second</tt> dock widget on top of <tt>first</tt> dock widget, creating a tabbed docked area in the main window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#tabifiedDockWidgets(com.trolltech.qt.gui.QDockWidget) tabifiedDockWidgets()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void tabifyDockWidget(com.trolltech.qt.gui.QDockWidget first, com.trolltech.qt.gui.QDockWidget second)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabifyDockWidget_QDockWidget_QDockWidget(nativeId(), first == null ? 0 : first.nativeId(), second == null ? 0 : second.nativeId());
    }
    @QtBlockedSlot
    native void __qt_tabifyDockWidget_QDockWidget_QDockWidget(long __this__nativeId, long first, long second);

/**
Returns the {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea } for <tt>toolbar</tt>. If <tt>toolbar</tt> has not been added to the main window, this function returns <tt>Qt::NoToolBarArea</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#addToolBar(com.trolltech.qt.gui.QToolBar) addToolBar()}, {@link com.trolltech.qt.gui.QMainWindow#addToolBarBreak() addToolBarBreak()}, and {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ToolBarArea toolBarArea(com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ToolBarArea.resolve(__qt_toolBarArea_QToolBar(nativeId(), toolbar == null ? 0 : toolbar.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_toolBarArea_QToolBar(long __this__nativeId, long toolbar);

/**
Returns whether there is a toolbar break before the <tt>toolbar</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#addToolBarBreak() addToolBarBreak()}, and {@link com.trolltech.qt.gui.QMainWindow#insertToolBarBreak(com.trolltech.qt.gui.QToolBar) insertToolBarBreak()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean toolBarBreak(com.trolltech.qt.gui.QToolBar toolbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolBarBreak_QToolBar(nativeId(), toolbar == null ? 0 : toolbar.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_toolBarBreak_QToolBar(long __this__nativeId, long toolbar);

/**
This property holds style of toolbar buttons in this mainwindow.  The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }.
*/

    @com.trolltech.qt.QtPropertyReader(name="toolButtonStyle")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ToolButtonStyle.resolve(__qt_toolButtonStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_toolButtonStyle(long __this__nativeId);

/**
This property holds whether the window uses the unified title and toolbar look on Mac OS X. This property is false by default and only has any effect on Mac OS X 10.4 or higher. <p>If set to true, then the top toolbar area is replaced with a Carbon HIToolbar and all toolbars in the top toolbar area are moved to that. Any toolbars added afterwards will also be added to the Carbon HIToolbar. This means a couple of things. <ul><li> QToolBars in this toolbar area are not movable and you cannot drag other toolbars to it</li><li> Toolbar breaks are not respected or preserved</li><li> Any custom widgets in the toolbar will not be shown if the toolbar becomes too small (only actions will be shown)</li><li> If you call {@link com.trolltech.qt.gui.QWidget#showFullScreen() showFullScreen()} on the main window, the {@link <a href="../porting4.html">QToolbar</a>} will disappear since it is considered to be part of the title bar. You can work around this by turning off the unified toolbar before you call {@link com.trolltech.qt.gui.QWidget#showFullScreen() showFullScreen()} and restoring it after you call {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}.</li></ul> Setting this back to false will remove these restrictions. <p>The {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_MacBrushedMetal } attribute takes precedence over this property.
*/

    @com.trolltech.qt.QtPropertyReader(name="unifiedTitleAndToolBarOnMac")
    @QtBlockedSlot
    public final boolean unifiedTitleAndToolBarOnMac()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unifiedTitleAndToolBarOnMac(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_unifiedTitleAndToolBarOnMac(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long event);

/**
Returns a popup menu containing checkable entries for the toolbars and dock widgets present in the main window. If there are no toolbars and dock widgets present, this function returns a null pointer. <p>By default, this function is called by the main window when the user activates a context menu, typically by right-clicking on a toolbar or a dock widget. <p>If you want to create a custom popup menu, reimplement this function and return a newly-created popup menu. Ownership of the popup menu is transferred to the caller. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow#addDockWidget(com.trolltech.qt.core.Qt.DockWidgetArea, com.trolltech.qt.gui.QDockWidget) addDockWidget()}, {@link com.trolltech.qt.gui.QMainWindow#addToolBar(com.trolltech.qt.gui.QToolBar) addToolBar()}, and {@link com.trolltech.qt.gui.QMainWindow#menuBar() menuBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QMenu createPopupMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createPopupMenu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_createPopupMenu(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QMainWindow fromNativePointer(QNativePointer nativePointer);

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

    protected QMainWindow(QPrivateConstructor p) { super(p); } 
}
