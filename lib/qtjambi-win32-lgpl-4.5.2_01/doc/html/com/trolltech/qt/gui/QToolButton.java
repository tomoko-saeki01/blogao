package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QToolButton class provides a quick-access button to commands or options, usually used inside a {@link com.trolltech.qt.gui.QToolBar QToolBar}. A tool button is a special button that provides quick-access to specific commands or options. As opposed to a normal command button, a tool button usually doesn't show a text label, but shows an icon instead. <p>Tool buttons are normally created when new {@link com.trolltech.qt.gui.QAction QAction} instances are created with {@link com.trolltech.qt.gui.QToolBar#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) QToolBar::addAction()} or existing actions are added to a toolbar with {@link com.trolltech.qt.gui.QToolBar#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) QToolBar::addAction()}. It is also possible to construct tool buttons in the same way as any other widget, and arrange them alongside other widgets in layouts. <p>One classic use of a tool button is to select tools; for example, the "pen" tool in a drawing program. This would be implemented by using a QToolButton as a toggle button (see setToggleButton()). <p>QToolButton supports auto-raising. In auto-raise mode, the button draws a 3D frame only when the mouse points at it. The feature is automatically turned on when a button is used inside a {@link com.trolltech.qt.gui.QToolBar QToolBar}. Change it with {@link com.trolltech.qt.gui.QToolButton#setAutoRaise(boolean) setAutoRaise()}. <p>A tool button's icon is set as {@link com.trolltech.qt.gui.QIcon QIcon}. This makes it possible to specify different pixmaps for the disabled and active state. The disabled pixmap is used when the button's functionality is not available. The active pixmap is displayed when the button is auto-raised because the mouse pointer is hovering over it. <p>The button's look and dimension is adjustable with {@link com.trolltech.qt.gui.QToolButton#setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle) setToolButtonStyle()} and setIconSize(). When used inside a {@link com.trolltech.qt.gui.QToolBar QToolBar} in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, the button automatically adjusts to {@link com.trolltech.qt.gui.QMainWindow QMainWindow}'s settings (see {@link QMainWindow#setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle) QMainWindow::setToolButtonStyle()} and {@link QMainWindow#setIconSize(com.trolltech.qt.core.QSize) QMainWindow::setIconSize()}). Instead of an icon, a tool button can also display an arrow symbol, specified with {@link QToolButton#arrowType() arrowType}. <p>A tool button can offer additional choices in a popup menu. The popup menu can be set using {@link com.trolltech.qt.gui.QToolButton#setMenu(com.trolltech.qt.gui.QMenu) setMenu()}. Use {@link com.trolltech.qt.gui.QToolButton#setPopupMode(com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode) setPopupMode()} to configure the different modes available for tool buttons with a menu set. The default mode is DelayedPopupMode which is sometimes used with the "Back" button in a web browser. After pressing and holding the button down for a while, a menu pops up showing a list of possible pages to jump to. The default delay is 600 ms; you can adjust it with setPopupDelay(). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/assistant-toolbar.png"></center><br></td></tr><tr valign="top" class="odd"><td> Qt Assistant's toolbar contains tool buttons that are associated with actions used in other parts of the main window.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QToolBar QToolBar}, {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, {@link com.trolltech.qt.gui.QAction QAction}, and {@link <a href="../guibooks.html">GUI Design Handbook: Push Button</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QToolButton extends com.trolltech.qt.gui.QAbstractButton
{

    private Object __rcDefaultAction = null;

    private Object __rcMenu = null;
/**
Describes how a menu should be popped up for tool buttons that has a menu set or contains a list of actions.
*/

    public enum ToolButtonPopupMode implements com.trolltech.qt.QtEnumerator {
/**
 After pressing and holding the tool button down for a certain amount of time (the timeout is style dependant, see {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_ToolButton_PopupDelay }), the menu is displayed. A typical application example is the "back" button in some web browsers's tool bars. If the user clicks it, the browser simply browses back to the previous page. If the user presses and holds the button down for a while, the tool button shows a menu containing the current history list
*/

        DelayedPopup(0),
/**
 In this mode the tool button displays a special arrow to indicate that a menu is present. The menu is displayed when the arrow part of the button is pressed.
*/

        MenuButtonPopup(1),
/**
 The menu is displayed, without delay, when the tool button is pressed. In this mode, the button's own action is not triggered.
*/

        InstantPopup(2);

        ToolButtonPopupMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QToolButton$ToolButtonPopupMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolButtonPopupMode resolve(int value) {
            return (ToolButtonPopupMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DelayedPopup;
            case 1: return MenuButtonPopup;
            case 2: return InstantPopup;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when the given <tt>action</tt> is triggered. <p>The action may also be associated with other parts of the user interface, such as menu items and keyboard shortcuts. Sharing actions in this way helps make the user interface more consistent and is often less work to implement.
*/

    public final Signal1<com.trolltech.qt.gui.QAction> triggered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void triggered(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggered_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_triggered_QAction(long __this__nativeId, long arg__1);


/**
Constructs an empty tool button with parent <tt>parent</tt>.
*/

    public QToolButton() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty tool button with parent <tt>parent</tt>.
*/

    public QToolButton(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QToolButton_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QToolButton_QWidget(long parent);

/**
This property holds whether the button displays an arrow instead of a normal icon. This displays an arrow as the icon for the QToolButton. <p>By default, this property is set to {@link com.trolltech.qt.core.Qt.ArrowType Qt::NoArrow }.
*/

    @com.trolltech.qt.QtPropertyReader(name="arrowType")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ArrowType arrowType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ArrowType.resolve(__qt_arrowType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_arrowType(long __this__nativeId);

/**
This property holds whether auto-raising is enabled or not.  The default is disabled (i.e. false). <p>This property is currently ignored on Mac OS X when using QMacStyle.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRaise")
    @QtBlockedSlot
    public final boolean autoRaise()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRaise(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoRaise(long __this__nativeId);

/**
Returns the default action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton#setDefaultAction(com.trolltech.qt.gui.QAction) setDefaultAction()}. <br></DD></DT>
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

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
Returns the associated menu, or 0 if no menu has been defined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton#setMenu(com.trolltech.qt.gui.QMenu) setMenu()}. <br></DD></DT>
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
This property describes the way that popup menus are used with tool buttons. By default, this property is set to {@link com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode DelayedPopup }.
*/

    @com.trolltech.qt.QtPropertyReader(name="popupMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode popupMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode.resolve(__qt_popupMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_popupMode(long __this__nativeId);

/**
This property holds whether the button displays an arrow instead of a normal icon. This displays an arrow as the icon for the QToolButton. <p>By default, this property is set to {@link com.trolltech.qt.core.Qt.ArrowType Qt::NoArrow }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="arrowType")
    @QtBlockedSlot
    public final void setArrowType(com.trolltech.qt.core.Qt.ArrowType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setArrowType_ArrowType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setArrowType_ArrowType(long __this__nativeId, int type);

/**
This property holds whether auto-raising is enabled or not.  The default is disabled (i.e. false). <p>This property is currently ignored on Mac OS X when using QMacStyle.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRaise")
    @QtBlockedSlot
    public final void setAutoRaise(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRaise_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAutoRaise_boolean(long __this__nativeId, boolean enable);

/**
Sets the default action to <tt>action</tt>. <p>If a tool button has a default action, the action defines the button's properties like text, icon, tool tip, etc. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton#defaultAction() defaultAction()}. <br></DD></DT>
*/

    public final void setDefaultAction(com.trolltech.qt.gui.QAction arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDefaultAction = arg__1;
        }
        __qt_setDefaultAction_QAction(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_setDefaultAction_QAction(long __this__nativeId, long arg__1);

/**
Associates the given <tt>menu</tt> with this tool button. <p>The menu will be shown according to the button's {@link QToolButton#popupMode() popupMode}. <p>Ownership of the menu is not transferred to the tool button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton#menu() menu()}. <br></DD></DT>
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
This property describes the way that popup menus are used with tool buttons. By default, this property is set to {@link com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode DelayedPopup }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="popupMode")
    @QtBlockedSlot
    public final void setPopupMode(com.trolltech.qt.gui.QToolButton.ToolButtonPopupMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPopupMode_ToolButtonPopupMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setPopupMode_ToolButtonPopupMode(long __this__nativeId, int mode);

/**
This property holds whether the tool button displays an icon only, text only, or text beside/below the icon.  The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }. <p>QToolButton automatically connects this slot to the relevant signal in the {@link com.trolltech.qt.gui.QMainWindow QMainWindow} in which is resides.
*/

    @com.trolltech.qt.QtPropertyWriter(name="toolButtonStyle")
    public final void setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle style)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolButtonStyle_ToolButtonStyle(nativeId(), style.value());
    }
    native void __qt_setToolButtonStyle_ToolButtonStyle(long __this__nativeId, int style);

/**
Shows (pops up) the associated popup menu. If there is no such menu, this function does nothing. This function does not return until the popup menu has been closed by the user.
*/

    public final void showMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMenu(nativeId());
    }
    native void __qt_showMenu(long __this__nativeId);

/**
This property holds whether the tool button displays an icon only, text only, or text beside/below the icon.  The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }. <p>QToolButton automatically connects this slot to the relevant signal in the {@link com.trolltech.qt.gui.QMainWindow QMainWindow} in which is resides.
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
    protected boolean hitButton(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitButton_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hitButton_QPoint(long __this__nativeId, long pos);

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
    protected void nextCheckState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_nextCheckState(nativeId());
    }
    @QtBlockedSlot
    native void __qt_nextCheckState(long __this__nativeId);

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
@exclude
*/

    public static native QToolButton fromNativePointer(QNativePointer nativePointer);

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

    protected QToolButton(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QToolButton. This method
is useful for subclasses when they need a QStyleOptionToolButton, but don't
want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionToolButton option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
