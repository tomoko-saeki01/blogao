package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWorkspace widget provides a workspace window that can be used in an MDI application. This class is deprecated. Use {@link com.trolltech.qt.gui.QMdiArea QMdiArea} instead. <p>Multiple Document Interface (MDI) applications are typically composed of a main window containing a menu bar, a toolbar, and a central QWorkspace widget. The workspace itself is used to display a number of child windows, each of which is a widget. <p>The workspace itself is an ordinary Qt widget. It has a standard constructor that takes a parent widget. Workspaces can be placed in any layout, but are typically given as the central widget in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}: <pre class="snippet">
    public MainWindow()
    {
        workspace = new QWorkspace();
        setCentralWidget(workspace);
        // ...
    }
</pre> Child windows (MDI windows) are standard Qt widgets that are inserted into the workspace with {@link com.trolltech.qt.gui.QWorkspace#addWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) addWindow()}. As with top-level widgets, you can call functions such as {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, and setWindowTitle() on a child window to change its appearance within the workspace. You can also provide widget flags to determine the layout of the decoration or the behavior of the widget itself. <p>To change or retrieve the geometry of a child window, you must operate on its {@link com.trolltech.qt.gui.QWidget#parentWidget() parentWidget()}. The {@link com.trolltech.qt.gui.QWidget#parentWidget() parentWidget()} provides access to the decorated frame that contains the child window widget. When a child window is maximised, its decorated frame is hidden. If the top-level widget contains a menu bar, it will display the maximised window's operations menu to the left of the menu entries, and the window's controls to the right. <p>A child window becomes active when it gets the keyboard focus, or when {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} is called. The user can activate a window by moving focus in the usual ways, for example by clicking a window or by pressing Tab. The workspace emits a signal {@link com.trolltech.qt.gui.QWorkspace#windowActivated windowActivated() } when the active window changes, and the function {@link com.trolltech.qt.gui.QWorkspace#activeWindow() activeWindow()} returns a pointer to the active child window, or 0 if no window is active. <p>The convenience function {@link com.trolltech.qt.gui.QWorkspace#windowList() windowList()} returns a list of all child windows. This information could be used in a popup menu containing a list of windows, for example. This feature is also available as part of the {@link <a href="../http-qtsoftware-com-products-appdev-add-on-products-catalog-4-widgets-qtwindowlistmenu.html">Window Menu</a>} Solution. <p>QWorkspace provides two built-in layout strategies for child windows: {@link com.trolltech.qt.gui.QWorkspace#cascade() cascade()} and {@link com.trolltech.qt.gui.QWorkspace#tile() tile()}. Both are slots so you can easily connect menu entries to them. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/mdi-cascade.png"></center><br></td><td>  <br><center><img src="../images/mdi-tile.png"></center><br></td></tr></table> If you want your users to be able to work with child windows larger than the visible workspace area, set the {@link QWorkspace#scrollBarsEnabled() scrollBarsEnabled} property to true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget QDockWidget}, and {@link <a href="../qtjambi-mdi.html">MDI Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWorkspace extends com.trolltech.qt.gui.QWidget
{
    
/**
Specifies the order in which child windows are returned from {@link com.trolltech.qt.gui.QWorkspace#windowList() windowList()}.
*/
@QtBlockedEnum
    public enum WindowOrder implements com.trolltech.qt.QtEnumerator {
/**
 The windows are returned in the order of their creation
*/

        CreationOrder(0),
/**
 The windows are returned in the order of their stacking
*/

        StackingOrder(1);

        WindowOrder(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWorkspace$WindowOrder constant with the specified <tt>int</tt>.</brief>
*/

        public static WindowOrder resolve(int value) {
            return (WindowOrder) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CreationOrder;
            case 1: return StackingOrder;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: w)&gt;:<p> This signal is emitted when the child window <tt>w</tt> becomes active. Note that <tt>w</tt> can be 0, and that more than one signal may be emitted for a single activation event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#activeWindow() activeWindow()}, and {@link com.trolltech.qt.gui.QWorkspace#windowList() windowList()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QWidget> windowActivated = new Signal1<com.trolltech.qt.gui.QWidget>();

    private final void windowActivated(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_windowActivated_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    native void __qt_windowActivated_QWidget(long __this__nativeId, long w);


/**
Constructs a workspace with the given <tt>parent</tt>.
*/

    public QWorkspace() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a workspace with the given <tt>parent</tt>.
*/

    public QWorkspace(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QWorkspace_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWorkspace_QWidget(long parent);

/**
Gives the input focus to the next window in the list of child windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#activatePreviousWindow() activatePreviousWindow()}. <br></DD></DT>
*/

    public final void activateNextWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activateNextWindow(nativeId());
    }
    native void __qt_activateNextWindow(long __this__nativeId);

/**
Gives the input focus to the previous window in the list of child windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#activateNextWindow() activateNextWindow()}. <br></DD></DT>
*/

    public final void activatePreviousWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activatePreviousWindow(nativeId());
    }
    native void __qt_activatePreviousWindow(long __this__nativeId);

/**
Returns a pointer to the widget corresponding to the active child window, or 0 if no window is active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#setActiveWindow(com.trolltech.qt.gui.QWidget) setActiveWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget activeWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeWindow(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_activeWindow(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget addWindow(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.WindowType ... flags) {
        return this.addWindow(w, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Adds widget <tt>w</tt> as new sub window to the workspace. If <tt>flags</tt> are non-zero, they will override the flags set on the widget. <p>Returns the widget used for the window frame. <p>To remove the widget <tt>w</tt> from the workspace, simply call {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} with the new parent (or 0 to make it a stand-alone window).
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget addWindow(com.trolltech.qt.gui.QWidget w) {
        return addWindow(w, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Adds widget <tt>w</tt> as new sub window to the workspace. If <tt>flags</tt> are non-zero, they will override the flags set on the widget. <p>Returns the widget used for the window frame. <p>To remove the widget <tt>w</tt> from the workspace, simply call {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} with the new parent (or 0 to make it a stand-alone window).
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget addWindow(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.WindowFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addWindow_QWidget_WindowFlags(nativeId(), w == null ? 0 : w.nativeId(), flags.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_addWindow_QWidget_WindowFlags(long __this__nativeId, long w, int flags);

/**
Arranges all iconified windows at the bottom of the workspace. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#cascade() cascade()}, and {@link com.trolltech.qt.gui.QWorkspace#tile() tile()}. <br></DD></DT>
*/

    public final void arrangeIcons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_arrangeIcons(nativeId());
    }
    native void __qt_arrangeIcons(long __this__nativeId);

/**
This property holds the workspace's background.
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
Arranges all the child windows in a cascade pattern. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#tile() tile()}, and {@link com.trolltech.qt.gui.QWorkspace#arrangeIcons() arrangeIcons()}. <br></DD></DT>
*/

    public final void cascade()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cascade(nativeId());
    }
    native void __qt_cascade(long __this__nativeId);

/**
Closes the child window that is currently active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#closeAllWindows() closeAllWindows()}. <br></DD></DT>
*/

    public final void closeActiveWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeActiveWindow(nativeId());
    }
    native void __qt_closeActiveWindow(long __this__nativeId);

/**
Closes all child windows. <p>If any child window fails to accept the close event, the remaining windows will remain open. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#closeActiveWindow() closeActiveWindow()}. <br></DD></DT>
*/

    public final void closeAllWindows()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeAllWindows(nativeId());
    }
    native void __qt_closeAllWindows(long __this__nativeId);

/**
This property holds whether the workspace provides scroll bars. If this property is true, the workspace will provide scroll bars if any of the child windows extend beyond the edges of the visible workspace. The workspace area will automatically increase to contain child windows if they are resized beyond the right or bottom edges of the visible area. <p>If this property is false (the default), resizing child windows out of the visible area of the workspace is not permitted, although it is still possible to position them partially outside the visible area.
*/

    @com.trolltech.qt.QtPropertyReader(name="scrollBarsEnabled")
    @QtBlockedSlot
    public final boolean scrollBarsEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollBarsEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_scrollBarsEnabled(long __this__nativeId);

/**
Makes the child window that contains <tt>w</tt> the active child window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#activeWindow() activeWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setActiveWindow(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveWindow_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setActiveWindow_QWidget(long __this__nativeId, long w);

/**
This property holds the workspace's background.
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
This property holds whether the workspace provides scroll bars. If this property is true, the workspace will provide scroll bars if any of the child windows extend beyond the edges of the visible workspace. The workspace area will automatically increase to contain child windows if they are resized beyond the right or bottom edges of the visible area. <p>If this property is false (the default), resizing child windows out of the visible area of the workspace is not permitted, although it is still possible to position them partially outside the visible area.
*/

    @com.trolltech.qt.QtPropertyWriter(name="scrollBarsEnabled")
    @QtBlockedSlot
    public final void setScrollBarsEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScrollBarsEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setScrollBarsEnabled_boolean(long __this__nativeId, boolean enable);

/**
Arranges all child windows in a tile pattern. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWorkspace#cascade() cascade()}, and {@link com.trolltech.qt.gui.QWorkspace#arrangeIcons() arrangeIcons()}. <br></DD></DT>
*/

    public final void tile()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tile(nativeId());
    }
    native void __qt_tile(long __this__nativeId);


/**
Returns a list of all visible or minimized child windows.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QWidget> windowList() {
        return windowList(com.trolltech.qt.gui.QWorkspace.WindowOrder.CreationOrder);
    }
/**
Returns a list of all visible or minimized child windows. If <tt>order</tt> is {@link com.trolltech.qt.gui.QWorkspace.WindowOrder CreationOrder } (the default), the windows are listed in the order in which they were inserted into the workspace. If <tt>order</tt> is {@link com.trolltech.qt.gui.QWorkspace.WindowOrder StackingOrder }, the windows are listed in their stacking order, with the topmost window as the last item in the list.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QWidget> windowList(com.trolltech.qt.gui.QWorkspace.WindowOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowList_WindowOrder(nativeId(), order.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QWidget> __qt_windowList_WindowOrder(long __this__nativeId, int order);

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
    protected void childEvent(com.trolltech.qt.core.QChildEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

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
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

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

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long e);

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
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QWorkspace fromNativePointer(QNativePointer nativePointer);

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

    protected QWorkspace(QPrivateConstructor p) { super(p); } 
}
