package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMdiArea widget provides an area in which MDI windows are displayed. QMdiArea functions, essentially, like a window manager for MDI windows. For instance, it draws the windows it manages on itself and arranges them in a cascading or tile pattern. QMdiArea is commonly used as the center widget in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow} to create MDI applications, but can also be placed in any layout. The following code adds an area to a main window: <pre class="snippet">
        QMainWindow mainWindow = new QMainWindow();
        mainWindow.setCentralWidget(mdiArea);
    </pre> Unlike the window managers for top-level windows, all window flags (Qt::WindowFlags) are supported by QMdiArea as long as the flags are supported by the current widget style. If a specific flag is not supported by the style (e.g., the {@link com.trolltech.qt.core.Qt.WindowType WindowShadeButtonHint }), you can still shade the window with showShaded(). <p>Subwindows in QMdiArea are instances of {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow}. They are added to an MDI area with {@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) addSubWindow()}. It is common to pass a {@link com.trolltech.qt.gui.QWidget QWidget}, which is set as the internal widget, to this function, but it is also possible to pass a {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} directly.The class inherits {@link com.trolltech.qt.gui.QWidget QWidget}, and you can use the same API as with a normal top-level window when programming. {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} also has behavior that is specific to MDI windows. See the {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} class description for more details. <p>A subwindow becomes active when it gets the keyboard focus, or when {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} is called. The user activates a window by moving focus in the usual ways. The MDI area emits the {@link com.trolltech.qt.gui.QMdiArea#subWindowActivated subWindowActivated() } signal when the active window changes, and the {@link com.trolltech.qt.gui.QMdiArea#activeSubWindow() activeSubWindow()} function returns the active subwindow. <p>The convenience function {@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()} returns a list of all subwindows. This information could be used in a popup menu containing a list of windows, for example. <p>The subwindows are sorted by the the current {@link com.trolltech.qt.gui.QMdiArea.WindowOrder WindowOrder }. This is used for the {@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()} and for {@link com.trolltech.qt.gui.QMdiArea#activateNextSubWindow() activateNextSubWindow()} and acivatePreviousSubWindow(). Also, it is used when cascading or tiling the windows with {@link com.trolltech.qt.gui.QMdiArea#cascadeSubWindows() cascadeSubWindows()} and {@link com.trolltech.qt.gui.QMdiArea#tileSubWindows() tileSubWindows()}. <p>QMdiArea provides two built-in layout strategies for subwindows: {@link com.trolltech.qt.gui.QMdiArea#cascadeSubWindows() cascadeSubWindows()} and {@link com.trolltech.qt.gui.QMdiArea#tileSubWindows() tileSubWindows()}. Both are slots and are easily connected to menu entries. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/mdi-cascade.png"></center><br></td><td>  <br><center><img src="../images/mdi-tile.png"></center><br></td></tr></table> <b>Note:</b> The default scroll bar property for QMdiArea is {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAlwaysOff }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMdiArea extends com.trolltech.qt.gui.QAbstractScrollArea
{
/**
Specifies the criteria to use for ordering the list of child windows returned by {@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. The functions {@link com.trolltech.qt.gui.QMdiArea#cascadeSubWindows() cascadeSubWindows()} and {@link com.trolltech.qt.gui.QMdiArea#tileSubWindows() tileSubWindows()} follow this order when arranging the windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. <br></DD></DT>
*/

    public enum WindowOrder implements com.trolltech.qt.QtEnumerator {
/**
 The windows are returned in the order of their creation.
*/

        CreationOrder(0),
/**
 The windows are returned in the order in which they are stacked, with the top-most window being last in the list.
*/

        StackingOrder(1),
/**
 The windows are returned in the order in which they were activated.
*/

        ActivationHistoryOrder(2);

        WindowOrder(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMdiArea$WindowOrder constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowOrder resolve(int value) {
            return (WindowOrder) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CreationOrder;
            case 1: return StackingOrder;
            case 2: return ActivationHistoryOrder;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the view mode of the area; i.e. how sub-windows will be displayed. <p><DT><b>See also:</b><br><DD>setViewMode(). <br></DD></DT>
*/

    public enum ViewMode implements com.trolltech.qt.QtEnumerator {
/**
 Display sub-windows with window frames (default).
*/

        SubWindowView(0),
/**
 Display sub-windows with tabs in a tab bar.
*/

        TabbedView(1);

        ViewMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMdiArea$ViewMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewMode resolve(int value) {
            return (ViewMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SubWindowView;
            case 1: return TabbedView;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes options that customize the behavior of the {@link com.trolltech.qt.gui.QMdiArea QMdiArea}.
*/
@QtBlockedEnum
    public enum AreaOption implements com.trolltech.qt.QtEnumerator {
/**
 When the active subwindow is maximized, the default behavior is to maximize the next subwindow that is activated. Set this option if you do not want this behavior.
*/

        DontMaximizeSubWindowOnActivation(1);

        AreaOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QMdiArea$AreaOptions with the specified <tt>com.trolltech.qt.gui.QMdiArea$AreaOption[]</tt> QMdiArea$AreaOption values set.</brief>
*/

        public static AreaOptions createQFlags(AreaOption ... values) {
            return new AreaOptions(values);
        }
/**
<brief>Returns the QMdiArea$AreaOption constant with the specified <tt>int</tt>.</brief>
*/

        public static AreaOption resolve(int value) {
            return (AreaOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DontMaximizeSubWindowOnActivation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class AreaOptions extends com.trolltech.qt.QFlags<AreaOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QMdiArea-AreaOptions with the specified <tt>com.trolltech.qt.gui.QMdiArea.AreaOption[]</tt>. flags set.</brief>
*/

        public AreaOptions(AreaOption ... args) { super(args); }
        public AreaOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QMdiSubWindow(named: window)&gt;:<p> QMdiArea emits this signal after <tt>window</tt> has been activated. When <tt>window</tt> is 0, QMdiArea has just deactivated its last active window, and there are no active windows on the workspace. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#activeSubWindow() QMdiArea::activeSubWindow()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QMdiSubWindow> subWindowActivated = new Signal1<com.trolltech.qt.gui.QMdiSubWindow>();

    private final void subWindowActivated(com.trolltech.qt.gui.QMdiSubWindow arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_subWindowActivated_QMdiSubWindow(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_subWindowActivated_QMdiSubWindow(long __this__nativeId, long arg__1);


/**
Constructs an empty mdi area. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QMdiArea() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty mdi area. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QMdiArea(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QMdiArea_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMdiArea_QWidget(long parent);

/**
Gives the keyboard focus to the next window in the list of child windows. The windows are activated in the order in which they are created ({@link com.trolltech.qt.gui.QMdiArea.WindowOrder CreationOrder }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#activatePreviousSubWindow() activatePreviousSubWindow()}. <br></DD></DT>
*/

    public final void activateNextSubWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activateNextSubWindow(nativeId());
    }
    native void __qt_activateNextSubWindow(long __this__nativeId);

/**
Gives the keyboard focus to the previous window in the list of child windows. The windows are activated in the order in which they are created ({@link com.trolltech.qt.gui.QMdiArea.WindowOrder CreationOrder }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#activateNextSubWindow() activateNextSubWindow()}. <br></DD></DT>
*/

    public final void activatePreviousSubWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activatePreviousSubWindow(nativeId());
    }
    native void __qt_activatePreviousSubWindow(long __this__nativeId);

/**
This property holds the ordering criteria for subwindow lists. This property specifies the ordering criteria for the list of subwindows returned by {@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. By default, it is the window creation order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="activationOrder")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiArea.WindowOrder activationOrder()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMdiArea.WindowOrder.resolve(__qt_activationOrder(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_activationOrder(long __this__nativeId);

/**
Returns a pointer to the current active subwindow. If no window is currently active, 0 is returned. <p>Subwindows are treated as top-level windows with respect to window state, i.e., if a widget outside the MDI area is the active window, no subwindow will be active. Note that if a widget in the window in which the MDI area lives gains focus, the window will be activated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#setActiveSubWindow(com.trolltech.qt.gui.QMdiSubWindow) setActiveSubWindow()}, and {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowState }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiSubWindow activeSubWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeSubWindow(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMdiSubWindow __qt_activeSubWindow(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiSubWindow addSubWindow(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return this.addSubWindow(widget, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Adds <tt>widget</tt> as a new subwindow to the MDI area. If <tt>windowFlags</tt> are non-zero, they will override the flags set on the widget. <p>The <tt>widget</tt> can be either a {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} or another {@link com.trolltech.qt.gui.QWidget QWidget} (in which case the MDI area will create a subwindow and set the <tt>widget</tt> as the internal widget). <p><b>Note:</b> Once the subwindow has been added, its parent will be the viewport widget of the QMdiArea. <pre class="snippet">
        QMdiArea mdiArea = new QMdiArea();
        QMdiSubWindow subWindow1 = new QMdiSubWindow();
        subWindow1.setWidget(internalWidget1);
        subWindow1.setAttribute(Qt.WidgetAttribute.WA_DeleteOnClose);
        mdiArea.addSubWindow(subWindow1);

        QMdiSubWindow subWindow2 =
            mdiArea.addSubWindow(internalWidget2);

    </pre> When you create your own subwindow, you must set the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } widget attribute if you want the window to be deleted when closed in the MDI area. If not, the window will be hidden and the MDI area will not activate the next subwindow. <p>Returns the {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} that is added to the MDI area. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#removeSubWindow(com.trolltech.qt.gui.QWidget) removeSubWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiSubWindow addSubWindow(com.trolltech.qt.gui.QWidget widget) {
        return addSubWindow(widget, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Adds <tt>widget</tt> as a new subwindow to the MDI area. If <tt>windowFlags</tt> are non-zero, they will override the flags set on the widget. <p>The <tt>widget</tt> can be either a {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} or another {@link com.trolltech.qt.gui.QWidget QWidget} (in which case the MDI area will create a subwindow and set the <tt>widget</tt> as the internal widget). <p><b>Note:</b> Once the subwindow has been added, its parent will be the viewport widget of the QMdiArea. <pre class="snippet">
        QMdiArea mdiArea = new QMdiArea();
        QMdiSubWindow subWindow1 = new QMdiSubWindow();
        subWindow1.setWidget(internalWidget1);
        subWindow1.setAttribute(Qt.WidgetAttribute.WA_DeleteOnClose);
        mdiArea.addSubWindow(subWindow1);

        QMdiSubWindow subWindow2 =
            mdiArea.addSubWindow(internalWidget2);

    </pre> When you create your own subwindow, you must set the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } widget attribute if you want the window to be deleted when closed in the MDI area. If not, the window will be hidden and the MDI area will not activate the next subwindow. <p>Returns the {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} that is added to the MDI area. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#removeSubWindow(com.trolltech.qt.gui.QWidget) removeSubWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiSubWindow addSubWindow(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addSubWindow_QWidget_WindowFlags(nativeId(), widget == null ? 0 : widget.nativeId(), flags.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMdiSubWindow __qt_addSubWindow_QWidget_WindowFlags(long __this__nativeId, long widget, int flags);

/**
This property holds the background brush for the workspace. This property sets the background brush for the workspace area itself. By default, it is a gray color, but can be any brush (e.g., colors, gradients or pixmaps).
*/

    @com.trolltech.qt.QtPropertyReader(name="background")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush background()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_background(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_background(long __this__nativeId);

/**
Arranges all the child windows in a cascade pattern. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#tileSubWindows() tileSubWindows()}. <br></DD></DT>
*/

    public final void cascadeSubWindows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cascadeSubWindows(nativeId());
    }
    native void __qt_cascadeSubWindows(long __this__nativeId);

/**
Closes the active subwindow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#closeAllSubWindows() closeAllSubWindows()}. <br></DD></DT>
*/

    public final void closeActiveSubWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeActiveSubWindow(nativeId());
    }
    native void __qt_closeActiveSubWindow(long __this__nativeId);

/**
Closes all subwindows by sending a {@link com.trolltech.qt.gui.QCloseEvent QCloseEvent} to each window. You may receive {@link com.trolltech.qt.gui.QMdiArea#subWindowActivated subWindowActivated() } signals from subwindows before they are closed (if the MDI area activates the subwindow when another is closing). <p>Subwindows that ignore the close event will remain open. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#closeActiveSubWindow() closeActiveSubWindow()}. <br></DD></DT>
*/

    public final void closeAllSubWindows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeAllSubWindows(nativeId());
    }
    native void __qt_closeAllSubWindows(long __this__nativeId);

/**
Returns a pointer to the current subwindow, or 0 if there is no current subwindow. <p>This function will return the same as {@link com.trolltech.qt.gui.QMdiArea#activeSubWindow() activeSubWindow()} if the {@link com.trolltech.qt.gui.QApplication QApplication} containing QMdiArea is active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#activeSubWindow() activeSubWindow()}, and {@link com.trolltech.qt.gui.QApplication#activeWindow() QApplication::activeWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiSubWindow currentSubWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentSubWindow(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMdiSubWindow __qt_currentSubWindow(long __this__nativeId);

/**
This property holds whether the tab bar is set to document mode in tabbed view mode.  Document mode is disabled by default. <p><DT><b>See also:</b><br><DD>{@link QTabBar#documentMode() QTabBar::documentMode}, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
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
Removes <tt>widget</tt> from the MDI area. The <tt>widget</tt> must be either a {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow} or a widget that is the internal widget of a subwindow. Note that the subwindow is not deleted by QMdiArea and that its parent is set to 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) addSubWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeSubWindow(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeSubWindow_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeSubWindow_QWidget(long __this__nativeId, long widget);

/**
This property holds the ordering criteria for subwindow lists. This property specifies the ordering criteria for the list of subwindows returned by {@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. By default, it is the window creation order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#subWindowList() subWindowList()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="activationOrder")
    @QtBlockedSlot
    public final void setActivationOrder(com.trolltech.qt.gui.QMdiArea.WindowOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActivationOrder_WindowOrder(nativeId(), order.value());
    }
    @QtBlockedSlot
    native void __qt_setActivationOrder_WindowOrder(long __this__nativeId, int order);

/**
Activates the subwindow <tt>window</tt>. If <tt>window</tt> is 0, any current active window is deactivated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#activeSubWindow() activeSubWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setActiveSubWindow(com.trolltech.qt.gui.QMdiSubWindow window)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveSubWindow_QMdiSubWindow(nativeId(), window == null ? 0 : window.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setActiveSubWindow_QMdiSubWindow(long __this__nativeId, long window);

/**
This property holds the background brush for the workspace. This property sets the background brush for the workspace area itself. By default, it is a gray color, but can be any brush (e.g., colors, gradients or pixmaps).
*/

    @com.trolltech.qt.QtPropertyWriter(name="background")
    @QtBlockedSlot
    public final void setBackground(com.trolltech.qt.gui.QBrush background)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackground_QBrush(nativeId(), background == null ? 0 : background.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackground_QBrush(long __this__nativeId, long background);

/**
This property holds whether the tab bar is set to document mode in tabbed view mode.  Document mode is disabled by default. <p><DT><b>See also:</b><br><DD>{@link QTabBar#documentMode() QTabBar::documentMode}, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
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
If <tt>on</tt> is true, <tt>option</tt> is enabled on the MDI area; otherwise it is disabled. See {@link com.trolltech.qt.gui.QMdiArea.AreaOption AreaOption } for the effect of each option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.AreaOption AreaOption }, and {@link com.trolltech.qt.gui.QMdiArea#testOption(com.trolltech.qt.gui.QMdiArea.AreaOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QMdiArea.AreaOption option) {
        setOption(option, (boolean)true);
    }
/**
If <tt>on</tt> is true, <tt>option</tt> is enabled on the MDI area; otherwise it is disabled. See {@link com.trolltech.qt.gui.QMdiArea.AreaOption AreaOption } for the effect of each option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.AreaOption AreaOption }, and {@link com.trolltech.qt.gui.QMdiArea#testOption(com.trolltech.qt.gui.QMdiArea.AreaOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QMdiArea.AreaOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_AreaOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_AreaOption_boolean(long __this__nativeId, int option, boolean on);

/**
This property holds the position of the tabs in tabbed view mode.  Possible values for this property are described by the {@link com.trolltech.qt.gui.QTabWidget.TabPosition QTabWidget::TabPosition } enum. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabPosition QTabWidget::TabPosition }, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabPosition")
    @QtBlockedSlot
    public final void setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabPosition_TabPosition(nativeId(), position.value());
    }
    @QtBlockedSlot
    native void __qt_setTabPosition_TabPosition(long __this__nativeId, int position);

/**
This property holds the shape of the tabs in tabbed view mode.  Possible values for this property are {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded } (default) or {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Triangular }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::TabShape }, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabShape")
    @QtBlockedSlot
    public final void setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape shape)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabShape_TabShape(nativeId(), shape.value());
    }
    @QtBlockedSlot
    native void __qt_setTabShape_TabShape(long __this__nativeId, int shape);

/**
This property holds the way sub-windows are displayed in the QMdiArea.  By default, the {@link com.trolltech.qt.gui.QMdiArea.ViewMode SubWindowView } is used to display sub-windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.ViewMode ViewMode }, {@link com.trolltech.qt.gui.QMdiArea#setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape) setTabShape()}, and {@link com.trolltech.qt.gui.QMdiArea#setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewMode")
    @QtBlockedSlot
    public final void setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewMode_ViewMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setViewMode_ViewMode(long __this__nativeId, int mode);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    protected final void setupViewport(com.trolltech.qt.gui.QWidget viewport)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setupViewport_QWidget(nativeId(), viewport == null ? 0 : viewport.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setupViewport_QWidget(long __this__nativeId, long viewport);


/**
Returns a list of all subwindows in the MDI area.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QMdiSubWindow> subWindowList() {
        return subWindowList(com.trolltech.qt.gui.QMdiArea.WindowOrder.CreationOrder);
    }
/**
Returns a list of all subwindows in the MDI area. If <tt>order</tt> is {@link com.trolltech.qt.gui.QMdiArea.WindowOrder CreationOrder } (the default), the windows are sorted in the order in which they were inserted into the workspace. If <tt>order</tt> is {@link com.trolltech.qt.gui.QMdiArea.WindowOrder StackingOrder }, the windows are listed in their stacking order, with the topmost window as the last item in the list. If <tt>order</tt> is {@link com.trolltech.qt.gui.QMdiArea.WindowOrder ActivationHistoryOrder }, the windows are listed according to their recent activation history. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.WindowOrder WindowOrder }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QMdiSubWindow> subWindowList(com.trolltech.qt.gui.QMdiArea.WindowOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subWindowList_WindowOrder(nativeId(), order.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QMdiSubWindow> __qt_subWindowList_WindowOrder(long __this__nativeId, int order);

/**
This property holds the position of the tabs in tabbed view mode.  Possible values for this property are described by the {@link com.trolltech.qt.gui.QTabWidget.TabPosition QTabWidget::TabPosition } enum. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabPosition QTabWidget::TabPosition }, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tabPosition")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabWidget.TabPosition tabPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabWidget.TabPosition.resolve(__qt_tabPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tabPosition(long __this__nativeId);

/**
This property holds the shape of the tabs in tabbed view mode.  Possible values for this property are {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded } (default) or {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Triangular }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::TabShape }, and {@link com.trolltech.qt.gui.QMdiArea#setViewMode(com.trolltech.qt.gui.QMdiArea.ViewMode) setViewMode()}. <br></DD></DT>
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
Returns true if <tt>option</tt> is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.AreaOption AreaOption }, and {@link com.trolltech.qt.gui.QMdiArea#setOption(com.trolltech.qt.gui.QMdiArea.AreaOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QMdiArea.AreaOption opton)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_AreaOption(nativeId(), opton.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_AreaOption(long __this__nativeId, int opton);

/**
Arranges all child windows in a tile pattern. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#cascadeSubWindows() cascadeSubWindows()}. <br></DD></DT>
*/

    public final void tileSubWindows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tileSubWindows(nativeId());
    }
    native void __qt_tileSubWindows(long __this__nativeId);

/**
This property holds the way sub-windows are displayed in the QMdiArea.  By default, the {@link com.trolltech.qt.gui.QMdiArea.ViewMode SubWindowView } is used to display sub-windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea.ViewMode ViewMode }, {@link com.trolltech.qt.gui.QMdiArea#setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape) setTabShape()}, and {@link com.trolltech.qt.gui.QMdiArea#setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="viewMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiArea.ViewMode viewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMdiArea.ViewMode.resolve(__qt_viewMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewMode(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void childEvent(com.trolltech.qt.core.QChildEvent childEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), childEvent == null ? 0 : childEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long childEvent);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject object, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), object == null ? 0 : object.nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long object, long event);

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
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent paintEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), paintEvent == null ? 0 : paintEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long paintEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent resizeEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), resizeEvent == null ? 0 : resizeEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long resizeEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void scrollContentsBy(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollContentsBy_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scrollContentsBy_int_int(long __this__nativeId, int dx, int dy);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent showEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), showEvent == null ? 0 : showEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long showEvent);

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
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent timerEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), timerEvent == null ? 0 : timerEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long timerEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QMdiArea fromNativePointer(QNativePointer nativePointer);

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

    protected QMdiArea(QPrivateConstructor p) { super(p); } 
}
