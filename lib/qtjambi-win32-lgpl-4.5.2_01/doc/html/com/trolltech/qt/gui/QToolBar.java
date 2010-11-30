package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QToolBar class provides a movable panel that contains a set of controls. Toolbar buttons are added by adding actions, using {@link com.trolltech.qt.gui.QToolBar#addAction(com.trolltech.qt.gui.QIcon, java.lang.String) addAction()} or {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}. Groups of buttons can be separated using {@link com.trolltech.qt.gui.QToolBar#addSeparator() addSeparator()} or {@link com.trolltech.qt.gui.QToolBar#insertSeparator(com.trolltech.qt.gui.QAction) insertSeparator()}. If a toolbar button is not appropriate, a widget can be inserted instead using {@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} or {@link com.trolltech.qt.gui.QToolBar#insertWidget(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QWidget) insertWidget()}; examples of suitable widgets are {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox}, and {@link com.trolltech.qt.gui.QComboBox QComboBox}. When a toolbar button is pressed it emits the {@link com.trolltech.qt.gui.QToolBar#actionTriggered actionTriggered() } signal. <p>A toolbar can be fixed in place in a particular area (e.g. at the top of the window), or it can be movable ({@link com.trolltech.qt.gui.QToolBar#isMovable() isMovable()}) between toolbar areas; see {@link com.trolltech.qt.gui.QToolBar#allowedAreas() allowedAreas()} and {@link com.trolltech.qt.gui.QToolBar#isAreaAllowed(com.trolltech.qt.core.Qt.ToolBarArea) isAreaAllowed()}. <p>When a toolbar is resized in such a way that it is too small to show all the items it contains, an extension button will appear as the last item in the toolbar. Pressing the extension button will pop up a menu containing the items that does not currently fit in the toolbar. <p>When a QToolBar is not a child of a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, it looses the ability to populate the extension pop up with widgets added to the toolbar using {@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. Please use widget actions created by inheriting {@link com.trolltech.qt.gui.QWidgetAction QWidgetAction} and implementing {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) QWidgetAction::createWidget()} instead. This is a known issue which will be fixed in a future release. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolButton QToolButton}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QAction QAction}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QToolBar extends com.trolltech.qt.gui.QWidget
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QAction(named: action)&gt;:<p> This signal is emitted when an action in this toolbar is triggered. This happens when the action's tool button is pressed, or when the action is triggered in some other way outside the tool bar. The parameter holds the triggered <tt>action</tt>.
*/

    public final Signal1<com.trolltech.qt.gui.QAction> actionTriggered = new Signal1<com.trolltech.qt.gui.QAction>();

    private final void actionTriggered(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionTriggered_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    native void __qt_actionTriggered_QAction(long __this__nativeId, long action);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$ToolBarAreas(named: allowedAreas)&gt;:<p> This signal is emitted when the collection of allowed areas for the toolbar is changed. The new areas in which the toolbar can be positioned are specified by <tt>allowedAreas</tt>. <p><DT><b>See also:</b><br><DD>{@link QToolBar#allowedAreas() allowedAreas}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.Qt.ToolBarAreas> allowedAreasChanged = new Signal1<com.trolltech.qt.core.Qt.ToolBarAreas>();

    private final void allowedAreasChanged(com.trolltech.qt.core.Qt.ToolBarAreas allowedAreas)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_allowedAreasChanged_ToolBarAreas(nativeId(), allowedAreas.value());
    }
    native void __qt_allowedAreasChanged_ToolBarAreas(long __this__nativeId, int allowedAreas);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QSize(named: iconSize)&gt;:<p> This signal is emitted when the icon size is changed. The <tt>iconSize</tt> parameter holds the toolbar's new icon size. <p><DT><b>See also:</b><br><DD>{@link QToolBar#iconSize() iconSize}, and {@link QMainWindow#iconSize() QMainWindow::iconSize}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: movable)&gt;:<p> This signal is emitted when the toolbar becomes movable or fixed. If the toolbar can be moved, <tt>movable</tt> is true; otherwise it is false. <p><DT><b>See also:</b><br><DD>{@link QToolBar#isMovable() movable}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> movableChanged = new Signal1<java.lang.Boolean>();

    private final void movableChanged(boolean movable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_movableChanged_boolean(nativeId(), movable);
    }
    native void __qt_movableChanged_boolean(long __this__nativeId, boolean movable);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$Orientation(named: orientation)&gt;:<p> This signal is emitted when the orientation of the toolbar changes. The new orientation is specified by the <tt>orientation</tt> given. <p><DT><b>See also:</b><br><DD>{@link QToolBar#orientation() orientation}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.Qt.Orientation> orientationChanged = new Signal1<com.trolltech.qt.core.Qt.Orientation>();

    private final void orientationChanged(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_orientationChanged_Orientation(nativeId(), orientation.value());
    }
    native void __qt_orientationChanged_Orientation(long __this__nativeId, int orientation);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$ToolButtonStyle(named: toolButtonStyle)&gt;:<p> This signal is emitted when the tool button style is changed. The <tt>toolButtonStyle</tt> parameter holds the toolbar's new tool button style. <p><DT><b>See also:</b><br><DD>{@link QToolBar#toolButtonStyle() toolButtonStyle}, and {@link QMainWindow#toolButtonStyle() QMainWindow::toolButtonStyle}. <br></DD></DT>
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
Constructs a QToolBar with the given <tt>parent</tt>.
*/

    public QToolBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QToolBar with the given <tt>parent</tt>.
*/

    public QToolBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QToolBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QToolBar_QWidget(long parent);


/**
Constructs a QToolBar with the given <tt>parent</tt>. <p>The given window <tt>title</tt> identifies the toolbar and is shown in the context menu provided by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    public QToolBar(java.lang.String title) {
        this(title, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QToolBar with the given <tt>parent</tt>. <p>The given window <tt>title</tt> identifies the toolbar and is shown in the context menu provided by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    public QToolBar(java.lang.String title, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QToolBar_String_QWidget(title, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QToolBar_String_QWidget(java.lang.String title, long parent);

/**
Returns the action at point <tt>p</tt>. This function returns zero if no action was found. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#childAt(com.trolltech.qt.core.QPoint) QWidget::childAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction actionAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_actionAt_QPoint(long __this__nativeId, long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns the action at the point <tt>x</tt>, <tt>y</tt>. This function returns zero if no action was found.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction actionAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_actionAt_int_int(long __this__nativeId, int x, int y);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect actionGeometry(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actionGeometry_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_actionGeometry_QAction(long __this__nativeId, long action);

/**
This is an overloaded member function, provided for convenience. <p>Creates a new action with the given <tt>icon</tt> and <tt>text</tt>. This action is added to the end of the toolbar.
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
This is an overloaded member function, provided for convenience. <p>Creates a new action with the given <tt>text</tt>. This action is added to the end of the toolbar.
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
Adds a separator to the end of the toolbar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBar#insertSeparator(com.trolltech.qt.gui.QAction) insertSeparator()}. <br></DD></DT>
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
Adds the given <tt>widget</tt> to the toolbar as the toolbar's last item. <p>The toolbar takes ownership of <tt>widget</tt>. <p>If you add a {@link com.trolltech.qt.gui.QToolButton QToolButton} with this method, the tools bar's {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonStyle } will not be respected. <p>Note: You should use {@link QAction#setVisible(boolean) QAction::setVisible()} to change the visibility of the widget. Using {@link QWidget#setVisible(boolean) QWidget::setVisible()}, {@link com.trolltech.qt.gui.QWidget#show() QWidget::show()} and {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} does not work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBar#insertWidget(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QWidget) insertWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction addWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (widget != null) {
            widget.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_addWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds areas where the toolbar may be placed. The default is {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::AllToolBarAreas }. <p>This property only makes sense if the toolbar is in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>{@link QToolBar#isMovable() movable}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ToolBarAreas allowedAreas()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ToolBarAreas(__qt_allowedAreas(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_allowedAreas(long __this__nativeId);

/**
Removes all actions from the toolbar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <br></DD></DT>
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
This property holds size of icons in the toolbar.  The default size is determined by the application's style and is derived from the {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_ToolBarIconSize } pixel metric. It is the maximum size an icon can have. Icons of smaller size will not be scaled up.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

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
Inserts a separator into the toolbar in front of the toolbar item associated with the <tt>before</tt> action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBar#addSeparator() addSeparator()}. <br></DD></DT>
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
Inserts the given <tt>widget</tt> in front of the toolbar item associated with the <tt>before</tt> action. <p>Note: You should use {@link QAction#setVisible(boolean) QAction::setVisible()} to change the visibility of the widget. Using {@link QWidget#setVisible(boolean) QWidget::setVisible()}, {@link com.trolltech.qt.gui.QWidget#show() QWidget::show()} and {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} does not work. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction insertWidget(com.trolltech.qt.gui.QAction before, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (widget != null) {
            widget.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertWidget_QAction_QWidget(nativeId(), before == null ? 0 : before.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_insertWidget_QAction_QWidget(long __this__nativeId, long before, long widget);

/**
Returns true if this toolbar is dockable in the given <tt>area</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isAreaAllowed(com.trolltech.qt.core.Qt.ToolBarArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAreaAllowed_ToolBarArea(nativeId(), area.value());
    }
    @QtBlockedSlot
    native boolean __qt_isAreaAllowed_ToolBarArea(long __this__nativeId, int area);

/**
This property holds whether the toolbar can be dragged and dropped as an independent window.  The default is true.
*/

    @QtBlockedSlot
    public final boolean isFloatable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFloatable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFloatable(long __this__nativeId);

/**
This property holds whether the toolbar is an independent window.  By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() QWidget::isWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFloating()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFloating(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFloating(long __this__nativeId);

/**
This property holds whether the user can move the toolbar within the toolbar area, or between toolbar areas. By default, this property is true. <p>This property only makes sense if the toolbar is in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>{@link QToolBar#allowedAreas() allowedAreas}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="movable")
    @QtBlockedSlot
    public final boolean isMovable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMovable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMovable(long __this__nativeId);

/**
This property holds orientation of the toolbar. The default is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p>This function should not be used when the toolbar is managed by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. You can use {@link com.trolltech.qt.gui.QMainWindow#addToolBar(com.trolltech.qt.gui.QToolBar) QMainWindow::addToolBar()} or {@link com.trolltech.qt.gui.QMainWindow#insertToolBar(com.trolltech.qt.gui.QToolBar, com.trolltech.qt.gui.QToolBar) QMainWindow::insertToolBar()} if you wish to move a toolbar (that is already added to a main window) to another {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setAllowedAreas(com.trolltech.qt.core.Qt.ToolBarArea ... areas) {
        this.setAllowedAreas(new com.trolltech.qt.core.Qt.ToolBarAreas(areas));
    }
/**
This property holds areas where the toolbar may be placed. The default is {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::AllToolBarAreas }. <p>This property only makes sense if the toolbar is in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>{@link QToolBar#isMovable() movable}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAllowedAreas(com.trolltech.qt.core.Qt.ToolBarAreas areas)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAllowedAreas_ToolBarAreas(nativeId(), areas.value());
    }
    @QtBlockedSlot
    native void __qt_setAllowedAreas_ToolBarAreas(long __this__nativeId, int areas);

/**
This property holds whether the toolbar can be dragged and dropped as an independent window.  The default is true.
*/

    @QtBlockedSlot
    public final void setFloatable(boolean floatable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFloatable_boolean(nativeId(), floatable);
    }
    @QtBlockedSlot
    native void __qt_setFloatable_boolean(long __this__nativeId, boolean floatable);

/**
This property holds size of icons in the toolbar.  The default size is determined by the application's style and is derived from the {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_ToolBarIconSize } pixel metric. It is the maximum size an icon can have. Icons of smaller size will not be scaled up.
*/

    public final void setIconSize(com.trolltech.qt.core.QSize iconSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), iconSize == null ? 0 : iconSize.nativeId());
    }
    native void __qt_setIconSize_QSize(long __this__nativeId, long iconSize);

/**
This property holds whether the user can move the toolbar within the toolbar area, or between toolbar areas. By default, this property is true. <p>This property only makes sense if the toolbar is in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>{@link QToolBar#allowedAreas() allowedAreas}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMovable(boolean movable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMovable_boolean(nativeId(), movable);
    }
    @QtBlockedSlot
    native void __qt_setMovable_boolean(long __this__nativeId, boolean movable);

/**
This property holds orientation of the toolbar. The default is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }. <p>This function should not be used when the toolbar is managed by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. You can use {@link com.trolltech.qt.gui.QMainWindow#addToolBar(com.trolltech.qt.gui.QToolBar) QMainWindow::addToolBar()} or {@link com.trolltech.qt.gui.QMainWindow#insertToolBar(com.trolltech.qt.gui.QToolBar, com.trolltech.qt.gui.QToolBar) QMainWindow::insertToolBar()} if you wish to move a toolbar (that is already added to a main window) to another {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }.
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This property holds the style of toolbar buttons. This property defines the style of all tool buttons that are added as {@link com.trolltech.qt.gui.QAction QAction}s. Note that if you add a {@link com.trolltech.qt.gui.QToolButton QToolButton} with the {@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} method, it will not get this button style. <p>The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }.
*/

    public final void setToolButtonStyle(com.trolltech.qt.core.Qt.ToolButtonStyle toolButtonStyle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolButtonStyle_ToolButtonStyle(nativeId(), toolButtonStyle.value());
    }
    native void __qt_setToolButtonStyle_ToolButtonStyle(long __this__nativeId, int toolButtonStyle);

/**
Returns a checkable action that can be used to show or hide this toolbar. <p>The action's text is set to the toolbar's window title. <p><DT><b>See also:</b><br><DD>{@link QAction#text() QAction::text}, and {@link QWidget#windowTitle() QWidget::windowTitle}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction toggleViewAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toggleViewAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_toggleViewAction(long __this__nativeId);

/**
This property holds the style of toolbar buttons. This property defines the style of all tool buttons that are added as {@link com.trolltech.qt.gui.QAction QAction}s. Note that if you add a {@link com.trolltech.qt.gui.QToolButton QToolButton} with the {@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} method, it will not get this button style. <p>The default is {@link com.trolltech.qt.core.Qt.ToolButtonStyle Qt::ToolButtonIconOnly }.
*/

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
Returns the widget associated with the specified <tt>action</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBar#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widgetForAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widgetForAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widgetForAction_QAction(long __this__nativeId, long action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void actionEvent(com.trolltech.qt.gui.QActionEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionEvent_QActionEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_actionEvent_QActionEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void childEvent(com.trolltech.qt.core.QChildEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long event);

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
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QToolBar fromNativePointer(QNativePointer nativePointer);

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

    protected QToolBar(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from the menu bar and information from
action. This method is useful for subclasses when they need a
QStyleOptionMenuItem, but don't want to fill in all the information
themselves.
*/

    protected final void initStyleOption(QStyleOptionToolBar option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END


    // TEMPLATE - gui.addAction - START
/**
Creates a new action with the icon <tt>icon</tt> and text <tt>text</tt>. This
action is added to the end of the toolbar. The action's QAction.triggered()
signal is connected to <tt>method</tt> in <tt>receiver</tt>.
<p>
Finally, it returns the created action.
*/

    public final QAction addAction(QIcon icon, String text, Object receiver, String method) {
        QAction returned = addAction(icon, text);

        returned.triggered.connect(receiver, method);

        return returned;
    }

/**
Creates a new action with the icon <tt>icon</tt> and text <tt>text</tt>. This action is added to the end of the toolbar. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to <tt>member</tt> in <tt>receiver</tt>.
*/

    public final QAction addAction(QIcon icon, String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal) {
        QAction returned = addAction(icon, text);

        returned.triggered.connect(signal);
        return returned;
    }
    // TEMPLATE - gui.addAction - END


    // TEMPLATE - gui.addAction - START
/**
Creates a new action with text <tt>text</tt>. This
action is added to the end of the toolbar. The action's QAction.triggered()
signal is connected to <tt>method</tt> in <tt>receiver</tt>. The created
action is returned.
*/

    public final QAction addAction(String text, Object receiver, String method) {
        QAction returned = addAction(text);

        returned.triggered.connect(receiver, method);

        return returned;
    }

/**
Creates a new action with the given <tt>text</tt>. This action is added to the end of the toolbar. The action's {@link com.trolltech.qt.gui.QAction#triggered  } signal is connected to <tt>member</tt> in <tt>receiver</tt>.
*/

    public final QAction addAction(String text, com.trolltech.qt.QSignalEmitter.AbstractSignal signal) {
        QAction returned = addAction(text);

        returned.triggered.connect(signal);
        return returned;
    }
    // TEMPLATE - gui.addAction - END

}
