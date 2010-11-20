package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMdiSubWindow class provides a subwindow class for {@link com.trolltech.qt.gui.QMdiArea QMdiArea}. QMdiSubWindow represents a top-level window in a {@link com.trolltech.qt.gui.QMdiArea QMdiArea}, and consists of a title bar with window decorations, an internal widget, and (depending on the current style) a window frame and a size grip. QMdiSubWindow has its own layout, which consists of the title bar and a center area for the internal widget. <br><center><img src="../images/qmdisubwindowlayout.png"></center><br> The most common way to construct a QMdiSubWindow is to call {@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QMdiArea::addSubWindow()} with the internal widget as the argument. You can also create a subwindow yourself, and set an internal widget by calling {@link com.trolltech.qt.gui.QMdiSubWindow#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <p>You use the same API when programming with subwindows as with regular top-level windows (e.g., you can call functions such as {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, and setWindowTitle()).<a name="subwindow-handling"><h2>Subwindow Handling</h2> QMdiSubWindow also supports behavior specific to subwindows in an MDI area. <p>By default, each QMdiSubWindow is visible inside the MDI area viewport when moved around, but it is also possible to specify transparent window movement and resizing behavior, where only the outline of a subwindow is updated during these operations. The {@link com.trolltech.qt.gui.QMdiSubWindow#setOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption) setOption()} function is used to enable this behavior. <p>The {@link com.trolltech.qt.gui.QMdiSubWindow#isShaded() isShaded()} function detects whether the subwindow is currently shaded (i.e., the window is collapsed so that only the title bar is visible). To enter shaded mode, call {@link com.trolltech.qt.gui.QMdiSubWindow#showShaded() showShaded()}. QMdiSubWindow emits the {@link com.trolltech.qt.gui.QMdiSubWindow#windowStateChanged windowStateChanged() } signal whenever the window state has changed (e.g., when the window becomes minimized, or is restored). It also emits {@link com.trolltech.qt.gui.QMdiSubWindow#aboutToActivate aboutToActivate() } before it is activated. <p>In keyboard-interactive mode, the windows are moved and resized with the keyboard. You can enter this mode through the system menu of the window. The {@link QMdiSubWindow#keyboardSingleStep() keyboardSingleStep} and {@link QMdiSubWindow#keyboardPageStep() keyboardPageStep} properties control the distance the widget is moved or resized for each keypress event. When shift is pressed down page step is used; otherwise single step is used. <p>You can also change the active window with the keyboard. By pressing the control and tab keys at the same time, the next (using the current {@link com.trolltech.qt.gui.QMdiArea.WindowOrder WindowOrder }) subwindow will be activated. By pressing control, shift, and tab, you will activate the previous window. This is equivalent to calling {@link com.trolltech.qt.gui.QMdiArea#activateNextSubWindow() activateNextSubWindow()} and {@link com.trolltech.qt.gui.QMdiArea#activatePreviousSubWindow() activatePreviousSubWindow()}. Note that these shortcuts overrides global shortcuts, but not the {@link com.trolltech.qt.gui.QMdiArea QMdiArea}s shortcuts. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea QMdiArea}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMdiSubWindow extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum describes options that customize the behavior of {@link com.trolltech.qt.gui.QMdiSubWindow QMdiSubWindow}.
*/
@QtBlockedEnum
    public enum SubWindowOption implements com.trolltech.qt.QtEnumerator {
        AllowOutsideAreaHorizontally(1),
        AllowOutsideAreaVertically(2),
/**
 If you enable this option, a rubber band control is used to represent the subwindow's outline, and the user resizes this instead of the subwindow itself. As a result, the subwindow maintains its original position and size until the resize operation has been completed, at which time it will receive a single {@link com.trolltech.qt.gui.QResizeEvent QResizeEvent}. By default, this option is disabled.
*/

        RubberBandResize(4),
/**
 If you enable this option, a rubber band control is used to represent the subwindow's outline, and the user moves this instead of the subwindow itself. As a result, the subwindow remains in its original position until the move operation has completed, at which time a {@link com.trolltech.qt.gui.QMoveEvent QMoveEvent} is sent to the window. By default, this option is disabled.
*/

        RubberBandMove(8);

        SubWindowOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QMdiSubWindow$SubWindowOptions with the specified <tt>com.trolltech.qt.gui.QMdiSubWindow$SubWindowOption[]</tt> QMdiSubWindow$SubWindowOption values set.</brief>
*/

        public static SubWindowOptions createQFlags(SubWindowOption ... values) {
            return new SubWindowOptions(values);
        }
/**
<brief>Returns the QMdiSubWindow$SubWindowOption constant with the specified <tt>int</tt>.</brief>
*/

        public static SubWindowOption resolve(int value) {
            return (SubWindowOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return AllowOutsideAreaHorizontally;
            case 2: return AllowOutsideAreaVertically;
            case 4: return RubberBandResize;
            case 8: return RubberBandMove;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class SubWindowOptions extends com.trolltech.qt.QFlags<SubWindowOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QMdiSubWindow-SubWindowOptions with the specified <tt>com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption[]</tt>. flags set.</brief>
*/

        public SubWindowOptions(SubWindowOption ... args) { super(args); }
        public SubWindowOptions(int value) { setValue(value); }
    }


/**
 QMdiSubWindow emits this signal immediately before it is activated. After the subwindow has been activated, the {@link com.trolltech.qt.gui.QMdiArea QMdiArea} that manages the subwindow will also emit the {@link com.trolltech.qt.gui.QMdiArea#subWindowActivated subWindowActivated() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#subWindowActivated QMdiArea::subWindowActivated() }. <br></DD></DT>
*/

    public final Signal0 aboutToActivate = new Signal0();

    private final void aboutToActivate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToActivate(nativeId());
    }
    native void __qt_aboutToActivate(long __this__nativeId);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$WindowStates(named: oldState), com.trolltech.qt.core.Qt$WindowStates(named: newState)&gt;:<p> QMdiSubWindow emits this signal after the window state changes. <tt>oldState</tt> is the window state before it changed, and <tt>newState</tt> is the new, current state.
*/

    public final Signal2<com.trolltech.qt.core.Qt.WindowStates, com.trolltech.qt.core.Qt.WindowStates> windowStateChanged = new Signal2<com.trolltech.qt.core.Qt.WindowStates, com.trolltech.qt.core.Qt.WindowStates>();

    private final void windowStateChanged(com.trolltech.qt.core.Qt.WindowStates oldState, com.trolltech.qt.core.Qt.WindowStates newState)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_windowStateChanged_WindowStates_WindowStates(nativeId(), oldState.value(), newState.value());
    }
    native void __qt_windowStateChanged_WindowStates_WindowStates(long __this__nativeId, int oldState, int newState);


/**
This is an overloaded method provided for convenience.
*/

    public QMdiSubWindow(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a new QMdiSubWindow widget. The <tt>parent</tt> and <tt>flags</tt> arguments are passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor. <p>Instead of using addSubWindow(), it is also simply possible to use {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} when you add the subwindow to a {@link com.trolltech.qt.gui.QMdiArea QMdiArea}. <p>Note that only QMdiSubWindows can be set as children of {@link com.trolltech.qt.gui.QMdiArea QMdiArea}; you cannot, for instance, write:QMdiArea mdiArea;
QTextEdit editor(&mdiArea); // invalid child widget <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QMdiArea::addSubWindow()}. <br></DD></DT>
*/

    public QMdiSubWindow(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a new QMdiSubWindow widget. The <tt>parent</tt> and <tt>flags</tt> arguments are passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor. <p>Instead of using addSubWindow(), it is also simply possible to use {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} when you add the subwindow to a {@link com.trolltech.qt.gui.QMdiArea QMdiArea}. <p>Note that only QMdiSubWindows can be set as children of {@link com.trolltech.qt.gui.QMdiArea QMdiArea}; you cannot, for instance, write:QMdiArea mdiArea;
QTextEdit editor(&mdiArea); // invalid child widget <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QMdiArea::addSubWindow()}. <br></DD></DT>
*/

    public QMdiSubWindow() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a new QMdiSubWindow widget. The <tt>parent</tt> and <tt>flags</tt> arguments are passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor. <p>Instead of using addSubWindow(), it is also simply possible to use {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} when you add the subwindow to a {@link com.trolltech.qt.gui.QMdiArea QMdiArea}. <p>Note that only QMdiSubWindows can be set as children of {@link com.trolltech.qt.gui.QMdiArea QMdiArea}; you cannot, for instance, write:QMdiArea mdiArea;
QTextEdit editor(&mdiArea); // invalid child widget <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QMdiArea::addSubWindow()}. <br></DD></DT>
*/

    public QMdiSubWindow(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QMdiSubWindow_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QMdiSubWindow_QWidget_WindowFlags(long parent, int flags);

/**
Returns true if this window is shaded; otherwise returns false. <p>A window is shaded if it is collapsed so that only the title bar is visible.
*/

    @QtBlockedSlot
    public final boolean isShaded()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isShaded(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isShaded(long __this__nativeId);

/**
This property holds sets how far a widget should move or resize when using the keyboard page keys.  When in keyboard-interactive mode, you can use the arrow and page keys to either move or resize the window. This property controls the page keys. The common way to enter keyboard interactive mode is to enter the subwindow menu, and select either "resize" or "move". <p>The default keyboard page step value is 20 pixels. <p><DT><b>See also:</b><br><DD>{@link QMdiSubWindow#keyboardSingleStep() keyboardSingleStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="keyboardPageStep")
    @QtBlockedSlot
    public final int keyboardPageStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keyboardPageStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_keyboardPageStep(long __this__nativeId);

/**
This property holds sets how far a widget should move or resize when using the keyboard arrow keys.  When in keyboard-interactive mode, you can use the arrow and page keys to either move or resize the window. This property controls the arrow keys. The common way to enter keyboard interactive mode is to enter the subwindow menu, and select either "resize" or "move". <p>The default keyboard single step value is 5 pixels. <p><DT><b>See also:</b><br><DD>{@link QMdiSubWindow#keyboardPageStep() keyboardPageStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="keyboardSingleStep")
    @QtBlockedSlot
    public final int keyboardSingleStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keyboardSingleStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_keyboardSingleStep(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget maximizedButtonsWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximizedButtonsWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_maximizedButtonsWidget(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget maximizedSystemMenuIconWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximizedSystemMenuIconWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_maximizedSystemMenuIconWidget(long __this__nativeId);

/**
Returns the area containing this sub-window, or 0 if there is none. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiArea#addSubWindow(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QMdiArea::addSubWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMdiArea mdiArea()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mdiArea(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMdiArea __qt_mdiArea(long __this__nativeId);

/**
This property holds sets how far a widget should move or resize when using the keyboard page keys.  When in keyboard-interactive mode, you can use the arrow and page keys to either move or resize the window. This property controls the page keys. The common way to enter keyboard interactive mode is to enter the subwindow menu, and select either "resize" or "move". <p>The default keyboard page step value is 20 pixels. <p><DT><b>See also:</b><br><DD>{@link QMdiSubWindow#keyboardSingleStep() keyboardSingleStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="keyboardPageStep")
    @QtBlockedSlot
    public final void setKeyboardPageStep(int step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKeyboardPageStep_int(nativeId(), step);
    }
    @QtBlockedSlot
    native void __qt_setKeyboardPageStep_int(long __this__nativeId, int step);

/**
This property holds sets how far a widget should move or resize when using the keyboard arrow keys.  When in keyboard-interactive mode, you can use the arrow and page keys to either move or resize the window. This property controls the arrow keys. The common way to enter keyboard interactive mode is to enter the subwindow menu, and select either "resize" or "move". <p>The default keyboard single step value is 5 pixels. <p><DT><b>See also:</b><br><DD>{@link QMdiSubWindow#keyboardPageStep() keyboardPageStep}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="keyboardSingleStep")
    @QtBlockedSlot
    public final void setKeyboardSingleStep(int step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKeyboardSingleStep_int(nativeId(), step);
    }
    @QtBlockedSlot
    native void __qt_setKeyboardSingleStep_int(long __this__nativeId, int step);


/**
If <tt>on</tt> is true, <tt>option</tt> is enabled on the subwindow; otherwise it is disabled. See {@link com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption SubWindowOption } for the effect of each option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption SubWindowOption }, and {@link com.trolltech.qt.gui.QMdiSubWindow#testOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption option) {
        setOption(option, (boolean)true);
    }
/**
If <tt>on</tt> is true, <tt>option</tt> is enabled on the subwindow; otherwise it is disabled. See {@link com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption SubWindowOption } for the effect of each option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption SubWindowOption }, and {@link com.trolltech.qt.gui.QMdiSubWindow#testOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_SubWindowOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_SubWindowOption_boolean(long __this__nativeId, int option, boolean on);

/**
Sets <tt>systemMenu</tt> as the current system menu for this subwindow. <p>By default, each QMdiSubWindow has a standard system menu. <p>QActions for the system menu created by QMdiSubWindow will automatically be updated depending on the current window state; e.g., the minimize action will be disabled after the window is minimized. <p>QActions added by the user are not updated by QMdiSubWindow. <p>QMdiSubWindow takes ownership of <tt>systemMenu</tt>; you do not have to delete it. Any existing menus will be deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#systemMenu() systemMenu()}, and {@link com.trolltech.qt.gui.QMdiSubWindow#showSystemMenu() showSystemMenu()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setSystemMenu(com.trolltech.qt.gui.QMenu systemMenu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSystemMenu_QMenu(nativeId(), systemMenu == null ? 0 : systemMenu.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setSystemMenu_QMenu(long __this__nativeId, long systemMenu);

/**
Sets <tt>widget</tt> as the internal widget of this subwindow. The internal widget is displayed in the center of the subwindow beneath the title bar. <p>QMdiSubWindow takes temporary ownership of <tt>widget</tt>; you do not have to delete it. Any existing internal widget will be removed and reparented to the root window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#widget() widget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
Calling this function makes the subwindow enter the shaded mode. When the subwindow is shaded, only the title bar is visible. <p>Although shading is not supported by all styles, this function will still show the subwindow as shaded, regardless of whether support for shading is available. However, when used with styles without shading support, the user will be unable to return from shaded mode through the user interface (e.g., through a shade button in the title bar). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#isShaded() isShaded()}. <br></DD></DT>
*/

    public final void showShaded()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showShaded(nativeId());
    }
    native void __qt_showShaded(long __this__nativeId);

/**
Shows the system menu below the system menu icon in the title bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#setSystemMenu(com.trolltech.qt.gui.QMenu) setSystemMenu()}, and {@link com.trolltech.qt.gui.QMdiSubWindow#systemMenu() systemMenu()}. <br></DD></DT>
*/

    public final void showSystemMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showSystemMenu(nativeId());
    }
    native void __qt_showSystemMenu(long __this__nativeId);

/**
Returns a pointer to the current system menu, or zero if no system menu is set. QMdiSubWindow provides a default system menu, but you can also set the menu with {@link com.trolltech.qt.gui.QMdiSubWindow#setSystemMenu(com.trolltech.qt.gui.QMenu) setSystemMenu()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#setSystemMenu(com.trolltech.qt.gui.QMenu) setSystemMenu()}, and {@link com.trolltech.qt.gui.QMdiSubWindow#showSystemMenu() showSystemMenu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu systemMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemMenu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_systemMenu(long __this__nativeId);

/**
Returns true if <tt>option</tt> is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption SubWindowOption }, and {@link com.trolltech.qt.gui.QMdiSubWindow#setOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QMdiSubWindow.SubWindowOption arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_SubWindowOption(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_SubWindowOption(long __this__nativeId, int arg__1);

/**
Returns the current internal widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMdiSubWindow#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent changeEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), changeEvent == null ? 0 : changeEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long changeEvent);

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
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent closeEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), closeEvent == null ? 0 : closeEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long closeEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent contextMenuEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), contextMenuEvent == null ? 0 : contextMenuEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long contextMenuEvent);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent focusInEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), focusInEvent == null ? 0 : focusInEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long focusInEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent focusOutEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), focusOutEvent == null ? 0 : focusOutEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long focusOutEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent hideEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), hideEvent == null ? 0 : hideEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long hideEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent keyEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), keyEvent == null ? 0 : keyEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long keyEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void leaveEvent(com.trolltech.qt.core.QEvent leaveEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_leaveEvent_QEvent(nativeId(), leaveEvent == null ? 0 : leaveEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_leaveEvent_QEvent(long __this__nativeId, long leaveEvent);

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
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent mouseEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), mouseEvent == null ? 0 : mouseEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long mouseEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent mouseEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), mouseEvent == null ? 0 : mouseEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long mouseEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent mouseEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), mouseEvent == null ? 0 : mouseEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long mouseEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent mouseEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), mouseEvent == null ? 0 : mouseEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long mouseEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void moveEvent(com.trolltech.qt.gui.QMoveEvent moveEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveEvent_QMoveEvent(nativeId(), moveEvent == null ? 0 : moveEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveEvent_QMoveEvent(long __this__nativeId, long moveEvent);

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
@exclude
*/

    public static native QMdiSubWindow fromNativePointer(QNativePointer nativePointer);

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

    protected QMdiSubWindow(QPrivateConstructor p) { super(p); } 
}
