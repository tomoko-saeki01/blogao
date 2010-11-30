package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsProxyWidget class provides a proxy layer for embedding a {@link com.trolltech.qt.gui.QWidget QWidget} in a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. QGraphicsProxyWidget embeds {@link com.trolltech.qt.gui.QWidget QWidget}-based widgets, for example, a {@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QFontComboBox QFontComboBox}, or even {@link com.trolltech.qt.gui.QFileDialog QFileDialog}, into {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. It forwards events between the two objects and translates between {@link com.trolltech.qt.gui.QWidget QWidget}'s integer-based geometry and {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}'s qreal-based geometry. QGraphicsProxyWidget supports all core features of {@link com.trolltech.qt.gui.QWidget QWidget}, including tab focus, keyboard input, Drag & Drop, and popups. You can also embed complex widgets, e.g., widgets with subwidgets. <p>Example: <pre class="snippet">
    public static void main(String args[]) {
        QApplication.initialize(args);
        QTabWidget tabWidget = new QTabWidget();

        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsProxyWidget proxy = scene.addWidget(tabWidget);

        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        QApplication.exec();
    }
</pre> QGraphicsProxyWidget takes care of automatically embedding popup children of embedded widgets through creating a child proxy for each popup. This means that when an embedded {@link com.trolltech.qt.gui.QComboBox QComboBox} shows its popup list, a new QGraphicsProxyWidget is created automatically, embedding the popup, and positioning it correctly.<a name="embedding-a-widget-with-qgraphicsproxywidget"><h2>Embedding a Widget with QGraphicsProxyWidget</h2> There are two ways to embed a widget using QGraphicsProxyWidget. The most common way is to pass a widget pointer to {@link com.trolltech.qt.gui.QGraphicsScene#addWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QGraphicsScene::addWidget()} together with any relevant Qt::WindowFlags. This function returns a pointer to a QGraphicsProxyWidget. You can then choose to reparent or position either the proxy, or the embedded widget itself. <p>For example, in the code snippet below, we embed a group box into the proxy: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();

        QLineEdit edit = new QLineEdit();
        QGraphicsProxyWidget proxy = scene.addWidget(edit);

        edit.isVisible();  // returns false, as QWidget is hidden by default
        proxy.isVisible(); // also returns false

        edit.show();

        edit.isVisible(); // returns true
        proxy.isVisible(); // returns true
</pre> The image below is the output obtained with its contents margin and contents rect labeled. <br><center><img src="../images/qgraphicsproxywidget-embed.png"></center><br> Alternatively, you can start by creating a new QGraphicsProxyWidget item, and then call {@link com.trolltech.qt.gui.QGraphicsProxyWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()} to embed a {@link com.trolltech.qt.gui.QWidget QWidget} later. The {@link com.trolltech.qt.gui.QGraphicsProxyWidget#widget() widget()} function returns a pointer to the embedded widget. QGraphicsProxyWidget shares ownership with {@link com.trolltech.qt.gui.QWidget QWidget}, so if either of the two widgets are destroyed, the other widget will be automatically destroyed as well.<a name="synchronizing-widget-states"><h2>Synchronizing Widget States</h2> QGraphicsProxyWidget keeps its state in sync with the embedded widget. For example, if the proxy is hidden or disabled, the embedded widget will be hidden or disabled as well, and vice versa. When the widget is embedded by calling addWidget(), QGraphicsProxyWidget copies the state from the widget into the proxy, and after that, the two will stay synchronized where possible. By default, when you embed a widget into a proxy, both the widget and the proxy will be visible because a {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} is visible when created (you do not have to call {@link com.trolltech.qt.gui.QGraphicsItem#show() show()}). If you explicitly hide the embedded widget, the proxy will also become invisible. <p>Example:Error parsing snippet.</pre> QGraphicsProxyWidget maintains symmetry for the following states: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.gui.QWidget QWidget} state</center></th><th><center> QGraphicsProxyWidget state</center></th><th><center> Notes</center></th></tr></thead><tr valign="top" class="even"><td> {@link QWidget#isEnabled() QWidget::enabled}</td><td> QGraphicsProxyWidget::enabled</td><td></td></tr><tr valign="top" class="odd"><td> {@link QWidget#isVisible() QWidget::visible}</td><td> QGraphicsProxyWidget::visible</td><td> The explicit state is also symmetric.</td></tr><tr valign="top" class="even"><td> {@link QWidget#geometry() QWidget::geometry}</td><td> QGraphicsProxyWidget::geometry</td><td> Geometry is only guaranteed to be symmetric while the embedded widget is visible.</td></tr><tr valign="top" class="odd"><td> {@link QWidget#layoutDirection() QWidget::layoutDirection}</td><td> {@link QGraphicsWidget#layoutDirection() QGraphicsProxyWidget::layoutDirection}</td><td></td></tr><tr valign="top" class="even"><td> QWidget::style</td><td> QGraphicsProxyWidget::style</td><td></td></tr><tr valign="top" class="odd"><td> {@link QWidget#palette() QWidget::palette}</td><td> {@link QGraphicsWidget#palette() QGraphicsProxyWidget::palette}</td><td></td></tr><tr valign="top" class="even"><td> {@link QWidget#font() QWidget::font}</td><td> {@link QGraphicsWidget#font() QGraphicsProxyWidget::font}</td><td></td></tr><tr valign="top" class="odd"><td> {@link QWidget#cursor() QWidget::cursor}</td><td> QGraphicsProxyWidget::cursor</td><td> The embedded widget overrides the proxy widget cursor. The proxy cursor changes depending on which embedded subwidget is currently under the mouse.</td></tr><tr valign="top" class="even"><td> {@link QWidget#sizeHint() QWidget::sizeHint()}</td><td> {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) QGraphicsProxyWidget::sizeHint()}</td><td> All size hint functionality from the embedded widget is forwarded by the proxy.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QWidget#getContentsMargins() QWidget::getContentsMargins()}</td><td> {@link com.trolltech.qt.gui.QGraphicsWidget#getContentsMargins() QGraphicsProxyWidget::getContentsMargins()}</td><td> Updated once by {@link com.trolltech.qt.gui.QGraphicsProxyWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}.</td></tr><tr valign="top" class="even"><td> {@link QWidget#windowTitle() QWidget::windowTitle}</td><td> {@link QGraphicsWidget#windowTitle() QGraphicsProxyWidget::windowTitle}</td><td> Updated once by {@link com.trolltech.qt.gui.QGraphicsProxyWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}.</td></tr></table> <b>Note:</b>{@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} keeps the embedded widget in a special state that prevents it from disturbing other widgets (both embedded and not embedded) while the widget is embedded. In this state, the widget may differ slightly in behavior from when it is not embedded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QGraphicsScene::addWidget()}, and {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsProxyWidget extends com.trolltech.qt.gui.QGraphicsWidget
{
    @QtBlockedEnum
    public enum enum_1 implements com.trolltech.qt.QtEnumerator {
        Type(12);

        enum_1(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsProxyWidget$enum_1 constant with the specified <tt>int</tt>.</brief>
*/

        public static enum_1 resolve(int value) {
            return (enum_1) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 12: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
This is an overloaded method provided for convenience.
*/

    public QGraphicsProxyWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.core.Qt.WindowType ... wFlags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(wFlags));
    }

/**
Constructs a new QGraphicsProxy widget. <tt>parent</tt> and <tt>wFlags</tt> are passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor.
*/

    public QGraphicsProxyWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a new QGraphicsProxy widget. <tt>parent</tt> and <tt>wFlags</tt> are passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor.
*/

    public QGraphicsProxyWidget() {
        this((com.trolltech.qt.gui.QGraphicsItem)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a new QGraphicsProxy widget. <tt>parent</tt> and <tt>wFlags</tt> are passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor.
*/

    public QGraphicsProxyWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.core.Qt.WindowFlags wFlags){
        super((QPrivateConstructor)null);
        __qt_QGraphicsProxyWidget_QGraphicsItem_WindowFlags(parent == null ? 0 : parent.nativeId(), wFlags.value());
    }

    native void __qt_QGraphicsProxyWidget_QGraphicsItem_WindowFlags(long parent, int wFlags);

/**
Creates a proxy widget for the given <tt>child</tt> of the widget contained in this proxy. <p>This function makes it possible to aquire proxies for non top-level widgets. For instance, you can embed a dialog, and then transform only one of its widgets. <p>If the widget is already embedded, return the existing proxy widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#newProxyWidget(com.trolltech.qt.gui.QWidget) newProxyWidget()}, and {@link com.trolltech.qt.gui.QGraphicsScene#addWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QGraphicsScene::addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsProxyWidget createProxyForChildWidget(com.trolltech.qt.gui.QWidget child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createProxyForChildWidget_QWidget(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsProxyWidget __qt_createProxyForChildWidget_QWidget(long __this__nativeId, long child);

/**
Creates a proxy widget for the given <tt>child</tt> of the widget contained in this proxy. <p>You should not call this function directly; use {@link com.trolltech.qt.gui.QGraphicsProxyWidget#createProxyForChildWidget(com.trolltech.qt.gui.QWidget) QGraphicsProxyWidget::createProxyForChildWidget()} instead. <p>This function is a fake virtual slot that you can reimplement in your subclass in order to control how new proxy widgets are created. The default implementation returns a proxy created with the QGraphicsProxyWidget() constructor with this proxy widget as the parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#createProxyForChildWidget(com.trolltech.qt.gui.QWidget) createProxyForChildWidget()}. <br></DD></DT>
*/

    protected final com.trolltech.qt.gui.QGraphicsProxyWidget newProxyWidget(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_newProxyWidget_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native com.trolltech.qt.gui.QGraphicsProxyWidget __qt_newProxyWidget_QWidget(long __this__nativeId, long arg__1);

/**
Embeds <tt>widget</tt> into this proxy widget. The embedded widget must reside exclusively either inside or outside of Graphics View. You cannot embed a widget as long as it is is visible elsewhere in the UI, at the same time. <p><tt>widget</tt> must be a top-level widget whose parent is 0. <p>When the widget is embedded, its state (e.g., visible, enabled, geometry, size hints) is copied into the proxy widget. If the embedded widget is explicitly hidden or disabled, the proxy widget will become explicitly hidden or disabled after embedding is complete. The class documentation has a full overview over the shared state. <p>After this function returns, QGraphicsProxyWidget will keep its state synchronized with that of <tt>widget</tt> whenever possible. <p>If a widget is already embedded by this proxy when this function is called, that widget will first be automatically unembedded. Passing 0 for the <tt>widget</tt> argument will only unembed the widget, and the ownership of the currently embedded widget will be passed on to the caller. Every child widget that are embedded will also be embedded and their proxy widget destroyed. <p>Note that widgets with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } widget attribute set and widgets that wrap an external application or controller cannot be embedded. Examples are {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} and QAxWidget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#widget() widget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        if (widget != null)
            widget.disableGarbageCollection();
        else if (widget() != null)
            widget().reenableGarbageCollection();


        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
Returns the rectangle for <tt>widget</tt>, which must be a descendant of {@link com.trolltech.qt.gui.QGraphicsProxyWidget#widget() widget()}, or {@link com.trolltech.qt.gui.QGraphicsProxyWidget#widget() widget()} itself, in this proxy item's local coordinates. <p>If no widget is embedded, <tt>widget</tt> is 0, or <tt>widget</tt> is not a descendant of the embedded widget, this function returns an empty {@link com.trolltech.qt.core.QRectF QRectF}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#widget() widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF subWidgetRect(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subWidgetRect_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_subWidgetRect_QWidget(long __this__nativeId, long widget);

/**
Returns a pointer to the embedded widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
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
    public void contextMenuEvent(com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QGraphicsSceneContextMenuEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QGraphicsSceneContextMenuEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

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
    public void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long event);

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
    public void focusOutEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void grabMouseEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabMouseEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabMouseEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void hoverEnterEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hoverEnterEvent_QGraphicsSceneHoverEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hoverEnterEvent_QGraphicsSceneHoverEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void hoverLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hoverLeaveEvent_QGraphicsSceneHoverEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hoverLeaveEvent_QGraphicsSceneHoverEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void hoverMoveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hoverMoveEvent_QGraphicsSceneHoverEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hoverMoveEvent_QGraphicsSceneHoverEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object itemChange(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange change, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemChange_GraphicsItemChange_Object(nativeId(), change.value(), value);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_itemChange_GraphicsItemChange_Object(long __this__nativeId, int change, java.lang.Object value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paint_QPainter_nativepointer_QWidget(nativeId(), painter == null ? 0 : painter.nativeId(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paint_QPainter_nativepointer_QWidget(long __this__nativeId, long painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QGraphicsSceneResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QGraphicsSceneResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QGraphicsSceneResizeEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRectF(long __this__nativeId, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSizeF sizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint_SizeHint_QSizeF(nativeId(), which.value(), constraint == null ? 0 : constraint.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_sizeHint_SizeHint_QSizeF(long __this__nativeId, int which, long constraint);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int type()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void ungrabMouseEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ungrabMouseEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_ungrabMouseEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void wheelEvent(com.trolltech.qt.gui.QGraphicsSceneWheelEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QGraphicsSceneWheelEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QGraphicsSceneWheelEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QGraphicsProxyWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsProxyWidget(QPrivateConstructor p) { super(p); } 
}
