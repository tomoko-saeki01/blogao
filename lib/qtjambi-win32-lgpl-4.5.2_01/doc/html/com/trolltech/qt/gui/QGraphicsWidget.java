package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsWidget class is the base class for all widget items in a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. QGraphicsWidget is an extended base item that provides extra functionality over {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. It is similar to {@link com.trolltech.qt.gui.QWidget QWidget} in many ways: <ul><li> Provides a {@link QGraphicsWidget#palette() palette}, a {@link QGraphicsWidget#font() font} and a {@link com.trolltech.qt.gui.QGraphicsWidget#style() style()}.</li><li> Has a defined {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}.</li><li> Supports layouts with {@link com.trolltech.qt.gui.QGraphicsWidget#setLayout(com.trolltech.qt.gui.QGraphicsLayout) setLayout()} and {@link com.trolltech.qt.gui.QGraphicsWidget#layout() layout()}.</li><li> Supports shortcuts and actions with {@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()} and {@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}</li></ul> Unlike {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, QGraphicsWidget is not an abstract class; you can create instances of a QGraphicsWidget without having to subclass it. This approach is useful for widgets that only serve the purpose of organizing child widgets into a layout. <p>QGraphicsWidget can be used as a base item for your own custom item if you require advanced input focus handling, e.g., tab focus and activation, or layouts. <p>Since QGraphicsWidget resembles {@link com.trolltech.qt.gui.QWidget QWidget} and has similar API, it is easier to port a widget from {@link com.trolltech.qt.gui.QWidget QWidget} to QGraphicsWidget, instead of {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. <p><b>Note:</b>{@link com.trolltech.qt.gui.QWidget QWidget}-based widgets can be directly embedded into a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} using {@link com.trolltech.qt.gui.QGraphicsProxyWidget QGraphicsProxyWidget}. <p>Noticeable differences between QGraphicsWidget and {@link com.trolltech.qt.gui.QWidget QWidget} are: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> QGraphicsWidget</center></th><th><center> {@link com.trolltech.qt.gui.QWidget QWidget}</center></th></tr></thead><tr valign="top" class="even"><td> Coordinates and geometry are defined with qreals (doubles or floats, depending on the platform).</td><td> {@link com.trolltech.qt.gui.QWidget QWidget} uses integer geometry ({@link com.trolltech.qt.core.QPoint QPoint}, {@link com.trolltech.qt.core.QRect QRect}).</td></tr><tr valign="top" class="odd"><td> The widget is already visible by default; you do not have to call {@link com.trolltech.qt.gui.QGraphicsItem#show() show()} to display the widget.</td><td> {@link com.trolltech.qt.gui.QWidget QWidget} is hidden by default until you call {@link com.trolltech.qt.gui.QGraphicsItem#show() show()}.</td></tr><tr valign="top" class="even"><td> A subset of widget attributes are supported.</td><td> All widget attributes are supported.</td></tr><tr valign="top" class="odd"><td> A top-level item's style defaults to QGraphicsScene::style</td><td> A top-level widget's style defaults to QApplication::style</td></tr><tr valign="top" class="even"><td> Graphics View provides a custom drag and drop framework, different from {@link com.trolltech.qt.gui.QWidget QWidget}.</td><td> Standard drag and drop framework.</td></tr><tr valign="top" class="odd"><td> Widget items do not support modality.</td><td> Full modality support.</td></tr></table> QGraphicsWidget supports a subset of Qt's widget attributes, ({@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WidgetAttribute }), as shown in the table below. Any attributes not listed in this table are unsupported, or otherwise unused. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Widget Attribute</center></th><th><center> Usage</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetLayoutDirection }</td><td> Set by {@link com.trolltech.qt.gui.QGraphicsWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}, cleared by {@link com.trolltech.qt.gui.QGraphicsWidget#unsetLayoutDirection() unsetLayoutDirection()}. You can test this attribute to check if the widget has been explicitly assigned a {@link QGraphicsWidget#layoutDirection() layoutDirection}. If the attribute is not set, the {@link QGraphicsWidget#layoutDirection() layoutDirection()} is inherited.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_RightToLeft }</td><td> Toggled by {@link com.trolltech.qt.gui.QGraphicsWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}. Inherited from the parent/scene. If set, the widget's layout will order horizontally arranged widgets from right to left.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetStyle }</td><td> Set and cleared by {@link com.trolltech.qt.gui.QGraphicsWidget#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}. If this attribute is set, the widget has been explicitly assigned a style. If it is unset, the widget will use the scene's or the application's style.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_Resized }</td><td> Set by {@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()} and {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()}.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetPalette }</td><td> Set by {@link com.trolltech.qt.gui.QGraphicsWidget#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetFont }</td><td> Set by {@link com.trolltech.qt.gui.QGraphicsWidget#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_WindowPropagation }</td><td> Enables propagation to window widgets.</td></tr></table> Although QGraphicsWidget inherits from both {@link com.trolltech.qt.core.QObject QObject} and {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, you should use the functions provided by {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, not{@link com.trolltech.qt.core.QObject QObject}, to manage the relationships between parent and child items. These functions control the stacking order of items as well as their ownership. <p><b>Note:</b> The {@link com.trolltech.qt.core.QObject#parent() QObject::parent()} should always return 0 for QGraphicsWidgets, but this policy is not strictly defined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget QGraphicsProxyWidget}, {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and {@link <a href="../graphicsview.html">Widgets and Layouts</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsWidget extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QGraphicsItemInterface,
            com.trolltech.qt.gui.QGraphicsLayoutItemInterface
{

    private Object __rcStyle = null;

    private Object __rcParentLayoutItem = null;

    private Object __rcItem = null;

    private Object __rcLayout = null;

    private java.util.Collection<Object> __rcActions = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    @QtBlockedEnum
    public enum enum_1 implements com.trolltech.qt.QtEnumerator {
        Type(11);

        enum_1(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsWidget$enum_1 constant with the specified <tt>int</tt>.</brief>
*/

        public static enum_1 resolve(int value) {
            return (enum_1) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 11: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**

*/

    public QGraphicsWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.core.Qt.WindowType ... wFlags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(wFlags));
    }

/**
Constructs a QGraphicsWidget instance. The optional <tt>parent</tt> argument is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The optional <tt>wFlags</tt> argument specifies the widget's window flags (e.g., whether the widget should be a window, a tool, a popup, etc).
*/

    public QGraphicsWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QGraphicsWidget instance. The optional <tt>parent</tt> argument is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The optional <tt>wFlags</tt> argument specifies the widget's window flags (e.g., whether the widget should be a window, a tool, a popup, etc).
*/

    public QGraphicsWidget() {
        this((com.trolltech.qt.gui.QGraphicsItem)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QGraphicsWidget instance. The optional <tt>parent</tt> argument is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The optional <tt>wFlags</tt> argument specifies the widget's window flags (e.g., whether the widget should be a window, a tool, a popup, etc).
*/

    public QGraphicsWidget(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.core.Qt.WindowFlags wFlags){
        super((QPrivateConstructor)null);
        __qt_QGraphicsWidget_QGraphicsItem_WindowFlags(parent == null ? 0 : parent.nativeId(), wFlags.value());
    }

    native void __qt_QGraphicsWidget_QGraphicsItem_WindowFlags(long parent, int wFlags);

/**
Returns true if this item can accept drag and drop events; otherwise, returns false. By default, items do not accept drag and drop events; items are transparent to drag and drop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setAcceptDrops(boolean) setAcceptDrops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean acceptDrops()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptDrops(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acceptDrops(long __this__nativeId);

/**
Returns true if an item accepts hover events ({@link com.trolltech.qt.gui.QGraphicsSceneHoverEvent QGraphicsSceneHoverEvent}); otherwise, returns false. By default, items do not accept hover events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setAcceptHoverEvents(boolean) setAcceptHoverEvents()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) setAcceptedMouseButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean acceptHoverEvents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptHoverEvents(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acceptHoverEvents(long __this__nativeId);

/**
Returns the mouse buttons that this item accepts mouse events for. By default, all mouse buttons are accepted. <p>If an item accepts a mouse button, it will become the mouse grabber item when a mouse press event is delivered for that mouse button. However, if the item does not accept the button, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} will forward the mouse events to the first item beneath it that does. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) setAcceptedMouseButtons()}, and {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.MouseButtons acceptedMouseButtons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_acceptedMouseButtons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_acceptedMouseButtons(long __this__nativeId);

/**
Call {@link com.trolltech.qt.gui.QGraphicsItem#acceptHoverEvents() acceptHoverEvents()} instead. <p><DT><b>See also:</b><br><DD>setAcceptsHoverEvents(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean acceptsHoverEvents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptsHoverEvents(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acceptsHoverEvents(long __this__nativeId);

/**
Returns the (possibly empty) list of this widget's actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QGraphicsWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QWidget#actions() QWidget::actions()}, {@link com.trolltech.qt.gui.QAction#associatedWidgets() QAction::associatedWidgets()}, and {@link com.trolltech.qt.gui.QAction#associatedGraphicsWidgets() QAction::associatedGraphicsWidgets()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QAction> actions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QAction> __qt_actions(long __this__nativeId);

/**
Appends the action <tt>action</tt> to this widget's list of actions. <p>All QGraphicsWidgets have a list of {@link com.trolltech.qt.gui.QAction QAction}s, however they can be represented graphically in many different ways. The default use of the {@link com.trolltech.qt.gui.QAction QAction} list (as returned by {@link com.trolltech.qt.gui.QGraphicsWidget#actions() actions()}) is to create a context {@link com.trolltech.qt.gui.QMenu QMenu}. <p>A QGraphicsWidget should only have one of each action and adding an action it already has will not cause the same action to be in the widget twice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QGraphicsWidget#actions() actions()}, and {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) QWidget::addAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            __rcActions.add(action);
        }
        __qt_addAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addAction_QAction(long __this__nativeId, long action);

/**
Appends the actions <tt>actions</tt> to this widget's list of actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QGraphicsWidget#addAction(com.trolltech.qt.gui.QAction) addAction()}, and {@link com.trolltech.qt.gui.QWidget#addActions(java.util.List) QWidget::addActions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addActions(java.util.List<com.trolltech.qt.gui.QAction> actions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addActions_List(nativeId(), actions);
    }
    @QtBlockedSlot
    native void __qt_addActions_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QAction> actions);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void addToIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addToIndex(nativeId());
    }
    @QtBlockedSlot
    native void __qt_addToIndex(long __this__nativeId);

/**
Adjusts the size of the widget to its effective preferred size hint. <p>This function is called implicitly when the item is shown for the first time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}, and {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void adjustSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjustSize(nativeId());
    }
    @QtBlockedSlot
    native void __qt_adjustSize(long __this__nativeId);

/**
Returns the bounding region for this item. The coordinate space of the returned region depends on <tt>itemToDeviceTransform</tt>. If you pass an identity {@link com.trolltech.qt.gui.QTransform QTransform} as a parameter, this function will return a local coordinate region. <p>The bounding region describes a coarse outline of the item's visual contents. Although it's expensive to calculate, it's also more precise than {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, and it can help to avoid unnecessary repainting when an item is updated. This is particularily efficient for thin items (e.g., lines or simple polygons). You can tune the granularity for the bounding region by calling {@link com.trolltech.qt.gui.QGraphicsItem#setBoundingRegionGranularity(double) setBoundingRegionGranularity()}. The default granularity is 0; in which the item's bounding region is the same as its bounding rect. <p><tt>itemToDeviceTransform</tt> is the transformation from item coordinates to device coordinates. If you want this function to return a {@link com.trolltech.qt.gui.QRegion QRegion} in scene coordinates, you can pass {@link com.trolltech.qt.gui.QGraphicsItem#sceneTransform() sceneTransform()} as an argument. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRegionGranularity() boundingRegionGranularity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion boundingRegion(com.trolltech.qt.gui.QTransform itemToDeviceTransform)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRegion_QTransform(nativeId(), itemToDeviceTransform == null ? 0 : itemToDeviceTransform.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_boundingRegion_QTransform(long __this__nativeId, long itemToDeviceTransform);

/**
Returns the item's bounding region granularity; a value between and including 0 and 1. The default value is 0 (i.e., the lowest granularity, where the bounding region corresponds to the item's bounding rectangle). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setBoundingRegionGranularity(double) setBoundingRegionGranularity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double boundingRegionGranularity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRegionGranularity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_boundingRegionGranularity(long __this__nativeId);

/**
Returns the cache mode for this item. The default mode is {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode NoCache } (i.e., cache is disabled and all painting is immediate). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setCacheMode(com.trolltech.qt.gui.QGraphicsItem.CacheMode) setCacheMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItem.CacheMode cacheMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsItem.CacheMode.resolve(__qt_cacheMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_cacheMode(long __this__nativeId);

/**
Returns a list of this item's children. The items are returned in no particular order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setParentItem(com.trolltech.qt.gui.QGraphicsItemInterface) setParentItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> childItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_childItems(long __this__nativeId);

/**
Returns the bounding rect of this item's descendants (i. ., its children, their children, etc.) in local coordinates. The rectangle will contain all descendants after they have been mapped to local coordinates. If the item has no children, this function returns an empty {@link com.trolltech.qt.core.QRectF QRectF}. <p>This does not include this item's own bounding rect; it only returns its descendants' accumulated bounding rect. If you need to include this item's bounding rect, you can add {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} to {@link com.trolltech.qt.gui.QGraphicsItem#childrenBoundingRect() childrenBoundingRect()} using QRectF::operator|(). <p>This function is linear in complexity; it determines the size of the returned bounding rect by iterating through all descendants. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneBoundingRect() sceneBoundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF childrenBoundingRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childrenBoundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_childrenBoundingRect(long __this__nativeId);

/**
Takes keyboard input focus from the item. <p>If it has focus, a focus out event is sent to this item to tell it that it is about to lose the focus. <p>Only items that set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag, or widgets that set an appropriate focus policy, can accept keyboard focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setFocus() setFocus()}, and {@link QGraphicsWidget#focusPolicy() QGraphicsWidget::focusPolicy}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearFocus(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearFocus(long __this__nativeId);

/**
Returns this item's clip path, or an empty {@link com.trolltech.qt.gui.QPainterPath QPainterPath} if this item is not clipped. The clip path constrains the item's appearance and interaction (i.e., restricts the area the item can draw, and it also restricts the area that the item receives events). <p>You can enable clipping by setting the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemClipsToShape } or {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemClipsChildrenToShape } flags. The item's clip path is calculated by intersecting all clipping ancestors' shapes. If the item sets {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemClipsToShape }, the final clip is intersected with the item's own shape. <p><b>Note:</b> Clipping introduces a performance penalty for all items involved; you should generally avoid using clipping if you can (e.g., if your items always draw inside {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} or {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()} boundaries, clipping is not necessary). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isClipped() isClipped()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFlags(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath clipPath()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipPath(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_clipPath(long __this__nativeId);

/**
Call this function to close the widget. <p>Returns true if the widget was closed; otherwise returns false. This slot will first send a {@link com.trolltech.qt.gui.QCloseEvent QCloseEvent} to the widget, which may or may not accept the event. If the event was ignored, nothing happens. If the event was accepted, it will {@link com.trolltech.qt.gui.QGraphicsItem#hide() hide()} the widget. <p>If the widget has the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } attribute set it will be deleted.
*/

    public final boolean close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    native boolean __qt_close(long __this__nativeId);

/**
Returns a list of all items that collide with this item. <p>The way collisions are detected is determined by <tt>mode</tt>. The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; All items whose shape intersects or is contained by this item's shape are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#collidingItems(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::collidingItems()}, and {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface) collidesWithItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> collidingItems(com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_collidingItems_ItemSelectionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_collidingItems_ItemSelectionMode(long __this__nativeId, int mode);

/**
Returns the closest common ancestor item of this item and <tt>other</tt>, or 0 if either <tt>other</tt> is 0, or there is no common ancestor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isAncestorOf(com.trolltech.qt.gui.QGraphicsItemInterface) isAncestorOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface commonAncestorItem(com.trolltech.qt.gui.QGraphicsItemInterface other)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_commonAncestorItem_QGraphicsItem(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_commonAncestorItem_QGraphicsItem(long __this__nativeId, long other);

/**
Returns the contents rect in local coordinates. <p>The contents rect defines the subrectangle used by an associated layout when arranging subitems. This function is a convenience function that adjusts the item's {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()} by its contents margins. Note that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()} is a virtual function that you can reimplement to return the item's contents margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#getContentsMargins() getContentsMargins()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF contentsRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentsRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_contentsRect(long __this__nativeId);

/**
Returns the current cursor shape for the item. The mouse cursor will assume this shape when it's over this item. See the {@link com.trolltech.qt.core.Qt.CursorShape list of predefined cursor objects } for a range of useful shapes. <p>An editor item might want to use an I-beam cursor: <pre class="snippet">
       item.setCursor(new QCursor(Qt.CursorShape.IBeamCursor));
</pre> If no cursor has been set, the parent's cursor is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setCursor(com.trolltech.qt.gui.QCursor) setCursor()}, {@link com.trolltech.qt.gui.QGraphicsItem#hasCursor() hasCursor()}, {@link com.trolltech.qt.gui.QGraphicsItem#unsetCursor() unsetCursor()}, {@link QWidget#cursor() QWidget::cursor}, and {@link com.trolltech.qt.gui.QApplication#overrideCursor() QApplication::overrideCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCursor cursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QCursor __qt_cursor(long __this__nativeId);

/**
Returns this item's custom data for the key <tt>key</tt> as a {@link com.trolltech.qt.QVariant QVariant}. <p>Custom item data is useful for storing arbitrary properties in any item. Example: <pre class="snippet">
        int ObjectName = 0;

        QGraphicsItemInterface item = scene.itemAt(100, 50);
        if (item.data(ObjectName).toString().length() == 0) {
            if (item instanceof ButtonItem)
                item.setData(ObjectName, "Button");
        }
</pre> Qt does not use this feature for storing data; it is provided solely for the convenience of the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setData(int, java.lang.Object) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object data(int key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_int(nativeId(), key);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_int(long __this__nativeId, int key);

/**
Returns this item's device transformation matrix, using <tt>viewportTransform</tt> to map from scene to device coordinates. This matrix can be used to map coordinates and geometrical shapes from this item's local coordinate system to the viewport's (or any device's) coordinate system. To map coordinates from the viewport, you must first invert the returned matrix. <p>Example: <pre class="snippet">
        QGraphicsRectItem rect = new QGraphicsRectItem();
        rect.setPos(100, 100);

        rect.deviceTransform(view.viewportTransform()).map(new QPointF(0, 0));
        // returns the item's (0, 0) point in view's viewport coordinates

        rect.deviceTransform(view.viewportTransform()).inverted().map(new QPointF(100, 100));
        // returns view's viewport's (100, 100) coordinate in item coordinates
</pre> This function is the same as combining this item's scene transform with the view's viewport transform, but it also understands the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIgnoresTransformations } flag. The device transform can be used to do accurate coordinate mapping (and collision detection) for untransformable items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#scenePos() scenePos()}, {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}, and {@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform deviceTransform(com.trolltech.qt.gui.QTransform viewportTransform)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceTransform_QTransform(nativeId(), viewportTransform == null ? 0 : viewportTransform.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_deviceTransform_QTransform(long __this__nativeId, long viewportTransform);

/**
Returns this item's effective opacity, which is between 0.  (transparent) and 1.0 (opaque). This value is a combination of this item's local opacity, and its parent and ancestors' opacities. The effective opacity decides how the item is rendered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#opacity() opacity()}, {@link com.trolltech.qt.gui.QGraphicsItem#setOpacity(double) setOpacity()}, {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()}, {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIgnoresParentOpacity }, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemDoesntPropagateOpacityToChildren }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double effectiveOpacity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effectiveOpacity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_effectiveOpacity(long __this__nativeId);

/**
Returns the effective size hint for this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}. <p><tt>which</tt> is the size hint in question. <tt>constraint</tt> is an optional argument that defines a special constrain when calculating the effective size hint. By default, <tt>constraint</tt> is {@link com.trolltech.qt.core.QSizeF QSizeF}(-1, -1), which means there is no constraint to the size hint. <p>If you want to specify the widget's size hint for a given width or height, you can provide the fixed dimension in <tt>constraint</tt>. This is useful for widgets that can grow only either vertically or horizontally, and need to set either their width or their height to a special value. <p>For example, a text paragraph item fit into a column width of 200 may grow vertically. You can pass {@link com.trolltech.qt.core.QSizeF QSizeF}(200, -1) as a constraint to get a suitable minimum, preferred and maximum height). <p>You can adjust the effective size hint by reimplementing {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} in a {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} subclass, or by calling one of the following functions: {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, setPreferredSize, or {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()} (or a combination of both). <p>This function caches each of the size hints and guarantees that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} will be called only once for each value of <tt>which</tt> - unless <tt>constraint</tt> is not specified and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#updateGeometry() updateGeometry()} has been called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint which, com.trolltech.qt.core.QSizeF constraint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effectiveSizeHint_SizeHint_QSizeF(nativeId(), which.value(), constraint == null ? 0 : constraint.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_effectiveSizeHint_SizeHint_QSizeF(long __this__nativeId, int which, long constraint);

/**
If this item is part of a scene that is viewed by a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}, this convenience function will attempt to scroll the view to ensure that <tt>rect</tt> is visible inside the view's viewport. If <tt>rect</tt> is a null rect (the default), {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} will default to the item's bounding rect. <tt>xmargin</tt> and <tt>ymargin</tt> are the number of pixels the view should use for margins. <p>If the specified rect cannot be reached, the contents are scrolled to the nearest valid position. <p>If this item is not viewed by a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) QGraphicsView::ensureVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.core.QRectF rect, int xmargin, int ymargin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureVisible_QRectF_int_int(nativeId(), rect == null ? 0 : rect.nativeId(), xmargin, ymargin);
    }
    @QtBlockedSlot
    native void __qt_ensureVisible_QRectF_int_int(long __this__nativeId, long rect, int xmargin, int ymargin);

/**
This convenience function is equivalent to calling ensureVisible({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>xmargin</tt>, <tt>ymargin</tt>):
*/

    @QtBlockedSlot
    public final void ensureVisible(double x, double y, double w, double h, int xmargin, int ymargin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureVisible_double_double_double_double_int_int(nativeId(), x, y, w, h, xmargin, ymargin);
    }
    @QtBlockedSlot
    native void __qt_ensureVisible_double_double_double_double_int_int(long __this__nativeId, double x, double y, double w, double h, int xmargin, int ymargin);

/**
Returns this item's flags. The flags describe what configurable features of the item are enabled and not. For example, if the flags include {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable }, the item can accept input focus. <p>By default, no flags are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setFlags(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag[]) setFlags()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFlag(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag) setFlag()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlags flags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
This property holds the way the widget accepts keyboard focus. The focus policy is {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::TabFocus } if the widget accepts keyboard focus by tabbing, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus } if the widget accepts focus by clicking, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus } if it accepts both, and {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } (the default) if it does not accept focus at all. <p>You must enable keyboard focus for a widget if it processes keyboard events. This is normally done from the widget's constructor. For instance, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} constructor calls setFocusPolicy({@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }). <p>If you enable a focus policy (i.e., not {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus }), QGraphicsWidget will automatically enable the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag. Setting {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } on a widget will clear the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag. If the widget currently has keyboard focus, the widget will automatically lose focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, and enabled. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="focusPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.FocusPolicy focusPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.FocusPolicy.resolve(__qt_focusPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_focusPolicy(long __this__nativeId);

/**
If this widget, a child or descendant of this widget currently has input focus, this function will return a pointer to that widget. If no descendant has input focus, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusWidget() QWidget::focusWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsWidget focusWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsWidget __qt_focusWidget(long __this__nativeId);

/**
This property holds the widgets' font. This property provides the widget's font. <p>{@link com.trolltech.qt.gui.QFont QFont} consists of font properties that have been explicitly defined and properties implicitly inherited from the widget's parent. Hence, {@link com.trolltech.qt.gui.QGraphicsWidget#font() font()} can return a different font compared to the one set with {@link com.trolltech.qt.gui.QGraphicsWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}. This scheme allows you to define single entries in a font without affecting the font's inherited entries. <p>When a widget's font changes, it resolves its entries against its parent widget. If the widget does not have a parent widget, it resolves its entries against the scene. The widget then sends itself a {@link com.trolltech.qt.core.QEvent.Type FontChange } event and notifies all its descendants so that they can resolve their fonts as well. <p>By default, this property contains the application's default font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}, {@link QGraphicsScene#font() QGraphicsScene::font}, and QFont::resolve(). <br></DD></DT>
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
Returns the item's geometry (e. ., position and size) as a {@link com.trolltech.qt.core.QRectF QRectF}. This function is equivalent to {@link com.trolltech.qt.core.QRectF QRectF}(pos(), {@link com.trolltech.qt.gui.QGraphicsWidget#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGeometry(com.trolltech.qt.core.QRectF) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF geometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_geometry(long __this__nativeId);

    @QtBlockedSlot
    private final void getWindowFrameMargins(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getWindowFrameMargins_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_getWindowFrameMargins_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom);

/**
Grabs the keyboard input. <p>The item will receive all keyboard input to the scene until one of the following events occur: <ul><li> The item becomes invisible</li><li> The item is removed from the scene</li><li> The item is deleted</li><li> The item calls {@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}</li><li> Another item calls {@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()}; the item will regain the keyboard grab when the other item calls {@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}.</li></ul> When an item gains the keyboard grab, it receives a {@link com.trolltech.qt.core.QEvent.Type QEvent::GrabKeyboard } event. When it loses the keyboard grab, it receives a {@link com.trolltech.qt.core.QEvent.Type QEvent::UngrabKeyboard } event. These events can be used to detect when your item gains or loses the keyboard grab through other means than gaining input focus. <p>It is almost never necessary to explicitly grab the keyboard in Qt, as Qt grabs and releases it sensibly. In particular, Qt grabs the keyboard when your item gains input focus, and releases it when your item loses input focus, or when the item is hidden. <p>Note that only visible items can grab keyboard input. Calling {@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()} on an invisible item has no effect. <p>Keyboard events are not affected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}, {@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFocus() setFocus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void grabKeyboard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabKeyboard(nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabKeyboard(long __this__nativeId);

/**
Grabs the mouse input. <p>This item will receive all mouse events for the scene until any of the following events occurs: <ul><li> The item becomes invisible</li><li> The item is removed from the scene</li><li> The item is deleted</li><li> The item call {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}</li><li> Another item calls {@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()}; the item will regain the mouse grab when the other item calls {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}.</li></ul> When an item gains the mouse grab, it receives a {@link com.trolltech.qt.core.QEvent.Type QEvent::GrabMouse } event. When it loses the mouse grab, it receives a {@link com.trolltech.qt.core.QEvent.Type QEvent::UngrabMouse } event. These events can be used to detect when your item gains or loses the mouse grab through other means than receiving mouse button events. <p>It is almost never necessary to explicitly grab the mouse in Qt, as Qt grabs and releases it sensibly. In particular, Qt grabs the mouse when you press a mouse button, and keeps the mouse grabbed until you release the last mouse button. Also, {@link com.trolltech.qt.core.Qt.WindowType Qt::Popup } widgets implicitly call {@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()} when shown, and {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()} when hidden. <p>Note that only visible items can grab mouse input. Calling {@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()} on an invisible item has no effect. <p>Keyboard events are not affected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#mouseGrabberItem() QGraphicsScene::mouseGrabberItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}, and {@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void grabMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabMouse(nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabMouse(long __this__nativeId);


/**
Adds a shortcut to Qt's shortcut system that watches for the given key <tt>sequence</tt> in the given <tt>context</tt>. If the <tt>context</tt> is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ApplicationShortcut }, the shortcut applies to the application as a whole. Otherwise, it is either local to this widget, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WidgetShortcut }, or to the window itself, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }. For widgets that are not part of a window (i.e., top-level widgets and their children), {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut } shortcuts apply to the scene. <p>If the same key <tt>sequence</tt> has been grabbed by several widgets, when the key <tt>sequence</tt> occurs a {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } event is sent to all the widgets to which it applies in a non-deterministic order, but with the ``ambiguous'' flag set to true. <p><b>Warning:</b> You should not normally need to use this function; instead create {@link com.trolltech.qt.gui.QAction QAction}s with the shortcut key sequences you require (if you also want equivalent menu options and toolbar buttons), or create {@link com.trolltech.qt.gui.QShortcut QShortcut}s if you just need key sequences. Both {@link com.trolltech.qt.gui.QAction QAction} and {@link com.trolltech.qt.gui.QShortcut QShortcut} handle all the event filtering for you, and provide signals which are triggered when the user triggers the key sequence, so are much easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#setShortcutEnabled(int) setShortcutEnabled()}, and {@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) QWidget::grabShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int grabShortcut(com.trolltech.qt.gui.QKeySequence sequence) {
        return grabShortcut(sequence, com.trolltech.qt.core.Qt.ShortcutContext.WindowShortcut);
    }
/**
Adds a shortcut to Qt's shortcut system that watches for the given key <tt>sequence</tt> in the given <tt>context</tt>. If the <tt>context</tt> is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ApplicationShortcut }, the shortcut applies to the application as a whole. Otherwise, it is either local to this widget, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WidgetShortcut }, or to the window itself, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }. For widgets that are not part of a window (i.e., top-level widgets and their children), {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut } shortcuts apply to the scene. <p>If the same key <tt>sequence</tt> has been grabbed by several widgets, when the key <tt>sequence</tt> occurs a {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } event is sent to all the widgets to which it applies in a non-deterministic order, but with the ``ambiguous'' flag set to true. <p><b>Warning:</b> You should not normally need to use this function; instead create {@link com.trolltech.qt.gui.QAction QAction}s with the shortcut key sequences you require (if you also want equivalent menu options and toolbar buttons), or create {@link com.trolltech.qt.gui.QShortcut QShortcut}s if you just need key sequences. Both {@link com.trolltech.qt.gui.QAction QAction} and {@link com.trolltech.qt.gui.QShortcut QShortcut} handle all the event filtering for you, and provide signals which are triggered when the user triggers the key sequence, so are much easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#setShortcutEnabled(int) setShortcutEnabled()}, and {@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) QWidget::grabShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int grabShortcut(com.trolltech.qt.gui.QKeySequence sequence, com.trolltech.qt.core.Qt.ShortcutContext context)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_grabShortcut_QKeySequence_ShortcutContext(nativeId(), sequence == null ? 0 : sequence.nativeId(), context.value());
    }
    @QtBlockedSlot
    native int __qt_grabShortcut_QKeySequence_ShortcutContext(long __this__nativeId, long sequence, int context);

/**
Returns the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} that this layout item represents. For QGraphicsWidget it will return itself. For custom items it can return an aggregated value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface) setGraphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface graphicsItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_graphicsItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_graphicsItem(long __this__nativeId);

/**
Returns a pointer to this item's item group, or 0 if this item is not member of a group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setGroup(com.trolltech.qt.gui.QGraphicsItemGroup) setGroup()}, {@link com.trolltech.qt.gui.QGraphicsItemGroup QGraphicsItemGroup}, and {@link com.trolltech.qt.gui.QGraphicsScene#createItemGroup(java.util.List) QGraphicsScene::createItemGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemGroup group()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_group(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemGroup __qt_group(long __this__nativeId);

/**
Returns true if this item handles child events (i. ., all events intended for any of its children are instead sent to this item); otherwise, false is returned. <p>This property is useful for item groups; it allows one item to handle events on behalf of its children, as opposed to its children handling their events individually. <p>The default is to return false; children handle their own events. The exception for this is if the item is a {@link com.trolltech.qt.gui.QGraphicsItemGroup QGraphicsItemGroup}, then it defaults to return true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setHandlesChildEvents(boolean) setHandlesChildEvents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean handlesChildEvents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handlesChildEvents(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_handlesChildEvents(long __this__nativeId);

/**
Returns true if this item has a cursor set; otherwise, false is returned. <p>By default, items don't have any cursor set. {@link com.trolltech.qt.gui.QGraphicsItem#cursor() cursor()} will return a standard pointing arrow cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#unsetCursor() unsetCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasCursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasCursor(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasCursor(long __this__nativeId);

/**
Returns true if this item has keyboard input focus; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#focusItem() QGraphicsScene::focusItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#setFocus() setFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::setFocusItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFocus(long __this__nativeId);

/**
Hides the item. (Items are visible by default.) <p>This convenience function is equivalent to calling <tt>setVisible(false)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#show() show()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setVisible(boolean) setVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void hide()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hide(nativeId());
    }
    @QtBlockedSlot
    native void __qt_hide(long __this__nativeId);

/**
Inserts the action <tt>action</tt> to this widget's list of actions, before the action <tt>before</tt>. It appends the action if <tt>before</tt> is 0 or <tt>before</tt> is not a valid action for this widget. <p>A QGraphicsWidget should only have one of each action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QGraphicsWidget#addAction(com.trolltech.qt.gui.QAction) addAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QGraphicsWidget#actions() actions()}, and {@link com.trolltech.qt.gui.QWidget#insertActions(com.trolltech.qt.gui.QAction, java.util.List) QWidget::insertActions()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertAction(com.trolltech.qt.gui.QAction before, com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            __rcActions.add(action);
        }
        __qt_insertAction_QAction_QAction(nativeId(), before == null ? 0 : before.nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertAction_QAction_QAction(long __this__nativeId, long before, long action);

/**
Inserts the actions <tt>actions</tt> to this widget's list of actions, before the action <tt>before</tt>. It appends the action if <tt>before</tt> is 0 or <tt>before</tt> is not a valid action for this widget. <p>A QGraphicsWidget can have at most one of each action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, and {@link com.trolltech.qt.gui.QWidget#insertActions(com.trolltech.qt.gui.QAction, java.util.List) QWidget::insertActions()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertActions(com.trolltech.qt.gui.QAction before, java.util.List<com.trolltech.qt.gui.QAction> actions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (actions != null) {
            __rcActions.add(actions);
        }
        __qt_insertActions_QAction_List(nativeId(), before == null ? 0 : before.nativeId(), actions);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertActions_QAction_List(long __this__nativeId, long before, java.util.List<com.trolltech.qt.gui.QAction> actions);

/**
Installs an event filter for this item on <tt>filterItem</tt>, causing all events for this item to first pass through <tt>filterItem</tt>'s {@link com.trolltech.qt.gui.QGraphicsItem#sceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.core.QEvent) sceneEventFilter()} function. <p>To filter another item's events, install this item as an event filter for the other item. Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsEllipseItem ellipse = scene.addEllipse(new QRectF(-10, -10, 20, 20));
        QGraphicsLineItem line = scene.addLine(new QLineF(-10, -10, 20, 20));

        line.installSceneEventFilter(ellipse);
        // line's events are filtered by ellipse's sceneEventFilter() function.

        ellipse.installSceneEventFilter(line);
        // ellipse's events are filtered by line's sceneEventFilter() function.
</pre> An item can only filter events for other items in the same scene. Also, an item cannot filter its own events; instead, you can reimplement {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()} directly. <p>Items must belong to a scene for scene event filters to be installed and used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#removeSceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface) removeSceneEventFilter()}, {@link com.trolltech.qt.gui.QGraphicsItem#sceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.core.QEvent) sceneEventFilter()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void installSceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface filterItem)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_installSceneEventFilter_QGraphicsItem(nativeId(), filterItem == null ? 0 : filterItem.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_installSceneEventFilter_QGraphicsItem(long __this__nativeId, long filterItem);

/**
Returns true if this widget's window is in the active window, or if the widget does not have a window but is in an active scene (i. ., a scene that currently has focus). <p>The active window is the window that either contains a child widget that currently has input focus, or that itself has input focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#activeWindow() QGraphicsScene::activeWindow()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setActiveWindow(com.trolltech.qt.gui.QGraphicsWidget) QGraphicsScene::setActiveWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isActiveWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActiveWindow(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActiveWindow(long __this__nativeId);

/**
Returns true if this item is an ancestor of <tt>child</tt> (i. ., if this item is <tt>child</tt>'s parent, or one of <tt>child</tt>'s parent's ancestors). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#parentItem() parentItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAncestorOf(com.trolltech.qt.gui.QGraphicsItemInterface child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAncestorOf_QGraphicsItem(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAncestorOf_QGraphicsItem(long __this__nativeId, long child);

/**
Returns true if this item is clipped. An item is clipped if it has either set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemClipsToShape } flag, or if it or any of its ancestors has set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemClipsChildrenToShape } flag. <p>Clipping affects the item's appearance (i.e., painting), as well as mouse and hover event delivery. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#clipPath() clipPath()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFlags(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isClipped()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isClipped(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isClipped(long __this__nativeId);

/**
Returns true if the item is enabled; otherwise, false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setEnabled(boolean) setEnabled()}. <br></DD></DT>
*/

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
Returns true if this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is a layout (e.g., is inherited by an object that arranges other {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} objects); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isLayout(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isLayout(long __this__nativeId);

/**
Returns true if this item's bounding rect is completely obscured by the opaque shape of any of colliding items above it (i. ., with a higher Z value than this item). <p>Its implementation is based on calling {@link com.trolltech.qt.gui.QGraphicsItem#isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface) isObscuredBy()}, which you can reimplement to provide a custom obscurity algorithm. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#opaqueArea() opaqueArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isObscured()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isObscured(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isObscured(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if <tt>rect</tt> is completely obscured by the opaque shape of any of colliding items above it (i.e., with a higher Z value than this item). <p>Unlike the default {@link com.trolltech.qt.gui.QGraphicsItem#isObscured() isObscured()} function, this function does not call {@link com.trolltech.qt.gui.QGraphicsItem#isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface) isObscuredBy()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#opaqueArea() opaqueArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isObscured(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isObscured_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isObscured_QRectF(long __this__nativeId, long rect);

/**
This convenience function is equivalent to calling isObscured({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final boolean isObscured(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isObscured_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native boolean __qt_isObscured_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Returns true if this item is selected; otherwise, false is returned. <p>Items that are in a group inherit the group's selected state. <p>Items are not selected by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setSelected(boolean) setSelected()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) QGraphicsScene::setSelectionArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSelected()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelected(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelected(long __this__nativeId);

/**
Returns true if this item is currently under the mouse cursor in one of the views; otherwise, false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#views() QGraphicsScene::views()}, and {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isUnderMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isUnderMouse(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isUnderMouse(long __this__nativeId);

/**
Returns true if the item is visible; otherwise, false is returned. <p>Note that the item's general visibility is unrelated to whether or not it is actually being visualized by a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setVisible(boolean) setVisible()}. <br></DD></DT>
*/

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
Returns true if the item is visible to <tt>parent</tt>; otherwise, false is returned. <tt>parent</tt> can be 0, in which case this function will return whether the item is visible to the scene or not. <p>An item may not be visible to its ancestors even if {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() isVisible()} is true. If any ancestor is hidden, the item itself will be implicitly hidden, in which case this function will return false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isVisible() isVisible()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setVisible(boolean) setVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isVisibleTo(com.trolltech.qt.gui.QGraphicsItemInterface parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisibleTo_QGraphicsItem(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisibleTo_QGraphicsItem(long __this__nativeId, long parent);

/**
Returns true if this item is a widget (i.e., QGraphicsWidget); otherwise, returns false.
*/

    @QtBlockedSlot
    public final boolean isWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWidget(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWidget(long __this__nativeId);

/**
Returns true if the item is a QGraphicsWidget window, otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link QGraphicsWidget#windowFlags() QGraphicsWidget::windowFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWindow(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWindow(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.gui.QTransform QTransform} that maps coordinates from this item to <tt>other</tt>. If <tt>ok</tt> is not null, and if there is no such transform, the boolean pointed to by <tt>ok</tt> will be set to false; otherwise true. <p>This transform provides an alternative to the {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()} or {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()} functions, by returning the appropriate transform so that you can map shapes and coordinates yourself. It also helps you write more efficient code when repeatedly mapping between the same two items. <p>Note that in rare circumstances, there is no transform that maps between two items <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#deviceTransform(com.trolltech.qt.gui.QTransform) deviceTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface other)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemTransform_QGraphicsItem_nativepointer(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_itemTransform_QGraphicsItem_nativepointer(long __this__nativeId, long other);

/**
Returns this widget's layout, or 0 if no layout is currently managing this widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setLayout(com.trolltech.qt.gui.QGraphicsLayout) setLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsLayout layout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayout __qt_layout(long __this__nativeId);

/**
This property holds the layout direction for this widget.  This property modifies this widget's and all of its descendants' {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_RightToLeft } attribute. It also sets this widget's {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetLayoutDirection } attribute. <p>The widget's layout direction determines the order in which the layout manager horizontally arranges subwidgets of this widget. The default value depends on the language and locale of the application, and is typically in the same direction as words are read and written. With {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, the layout starts placing subwidgets from the left side of this widget towards the right. {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::RightToLeft } does the opposite - the layout will place widgets starting from the right edge moving towards the left. <p>Subwidgets inherit their layout direction from the parent. Top-level widget items inherit their layout direction from QGraphicsScene::layoutDirection. If you change a widget's layout direction by calling {@link com.trolltech.qt.gui.QGraphicsWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}, the widget will send itself a {@link com.trolltech.qt.core.QEvent.Type LayoutDirectionChange } event, and then propagate the new layout direction to all its descendants. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}, and {@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="layoutDirection")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection layoutDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_layoutDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_layoutDirection(long __this__nativeId);

/**
Maps the path <tt>path</tt>, which is in <tt>item</tt>'s coordinate system, to this item's coordinate system, and returns the mapped path. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_QPainterPath(nativeId(), item == null ? 0 : item.nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapFromItem_QGraphicsItem_QPainterPath(long __this__nativeId, long item, long path);

/**
Maps the point <tt>point</tt>, which is in <tt>item</tt>'s coordinate system, to this item's coordinate system, and returns the mapped coordinate. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_QPointF(nativeId(), item == null ? 0 : item.nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromItem_QGraphicsItem_QPointF(long __this__nativeId, long item, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in <tt>item</tt>'s coordinate system, to this item's coordinate system, and returns the mapped polygon. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_QPolygonF(nativeId(), item == null ? 0 : item.nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromItem_QGraphicsItem_QPolygonF(long __this__nativeId, long item, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in <tt>item</tt>'s coordinate system, to this item's coordinate system, and returns the mapped rectangle as a polygon. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_QRectF(nativeId(), item == null ? 0 : item.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromItem_QGraphicsItem_QRectF(long __this__nativeId, long item, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapFromItem(<tt>item</tt>, {@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromItem_QGraphicsItem_double_double(long __this__nativeId, long item, double x, double y);

/**
This convenience function is equivalent to calling mapFromItem(item, {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromItem_QGraphicsItem_double_double_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromItem_QGraphicsItem_double_double_double_double(long __this__nativeId, long item, double x, double y, double w, double h);

/**
Maps the path <tt>path</tt>, which is in this item's parent's coordinate system, to this item's coordinate system, and returns the mapped path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapFromParent(com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapFromParent_QPainterPath(long __this__nativeId, long path);

/**
Maps the point <tt>point</tt>, which is in this item's parent's coordinate system, to this item's coordinate system, and returns the mapped coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromParent(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromParent_QPointF(long __this__nativeId, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in this item's parent's coordinate system, to this item's coordinate system, and returns the mapped polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromParent(com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromParent_QPolygonF(long __this__nativeId, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's parent's coordinate system, to this item's coordinate system, and returns the mapped rectangle as a polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromParent(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromParent_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapFromParent({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromParent(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromParent_double_double(long __this__nativeId, double x, double y);

/**
This convenience function is equivalent to calling mapFromItem({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromParent(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromParent_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the path <tt>path</tt>, which is in this item's scene's coordinate system, to this item's coordinate system, and returns the mapped path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapFromScene(com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapFromScene_QPainterPath(long __this__nativeId, long path);

/**
Maps the point <tt>point</tt>, which is in this item's scene's coordinate system, to this item's coordinate system, and returns the mapped coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromScene(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromScene_QPointF(long __this__nativeId, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in this item's scene's coordinate system, to this item's coordinate system, and returns the mapped polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromScene(com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromScene_QPolygonF(long __this__nativeId, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's scene's coordinate system, to this item's coordinate system, and returns the mapped rectangle as a polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromScene(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromScene_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapFromScene({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapFromScene(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapFromScene_double_double(long __this__nativeId, double x, double y);

/**
This convenience function is equivalent to calling mapFromScene({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapFromScene(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapFromScene_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in <tt>item</tt>'s coordinate system, to this item's coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapRectFromScene(com.trolltech.qt.core.QRectF) mapRectFromScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromItem_QGraphicsItem_QRectF(nativeId(), item == null ? 0 : item.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromItem_QGraphicsItem_QRectF(long __this__nativeId, long item, long rect);

/**
This convenience function is equivalent to calling mapRectFromItem(item, {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromItem_QGraphicsItem_double_double_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromItem_QGraphicsItem_double_double_double_double(long __this__nativeId, long item, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's parent's coordinate system, to this item's coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromParent(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromParent_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromParent_QRectF(long __this__nativeId, long rect);

/**
This convenience function is equivalent to calling mapRectFromParent({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromParent(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromParent_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromParent_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in scene coordinates, to this item's coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromScene(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromScene_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromScene_QRectF(long __this__nativeId, long rect);

/**
This convenience function is equivalent to calling mapRectFromScene({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectFromScene(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectFromScene_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectFromScene_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to <tt>item</tt>'s coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapRectToScene(com.trolltech.qt.core.QRectF) mapRectToScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToItem_QGraphicsItem_QRectF(nativeId(), item == null ? 0 : item.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToItem_QGraphicsItem_QRectF(long __this__nativeId, long item, long rect);

/**
This convenience function is equivalent to calling mapRectToItem(item, {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToItem_QGraphicsItem_double_double_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToItem_QGraphicsItem_double_double_double_double(long __this__nativeId, long item, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to its parent's coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToParent(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToParent_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToParent_QRectF(long __this__nativeId, long rect);

/**
This convenience function is equivalent to calling mapRectToParent({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToParent(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToParent_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToParent_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to the scene coordinate system, and returns the mapped rectangle as a new rectangle (i. ., the bounding rectangle of the resulting polygon). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToScene(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToScene_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToScene_QRectF(long __this__nativeId, long rect);

/**
This convenience function is equivalent to calling mapRectToScene({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF mapRectToScene(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapRectToScene_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_mapRectToScene_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the path <tt>path</tt>, which is in this item's coordinate system, to <tt>item</tt>'s coordinate system, and returns the mapped path. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_QPainterPath(nativeId(), item == null ? 0 : item.nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapToItem_QGraphicsItem_QPainterPath(long __this__nativeId, long item, long path);

/**
Maps the point <tt>point</tt>, which is in this item's coordinate system, to <tt>item</tt>'s coordinate system, and returns the mapped coordinate. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_QPointF(nativeId(), item == null ? 0 : item.nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToItem_QGraphicsItem_QPointF(long __this__nativeId, long item, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in this item's coordinate system, to <tt>item</tt>'s coordinate system, and returns the mapped polygon. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_QPolygonF(nativeId(), item == null ? 0 : item.nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToItem_QGraphicsItem_QPolygonF(long __this__nativeId, long item, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to <tt>item</tt>'s coordinate system, and returns the mapped rectangle as a polygon. <p>If <tt>item</tt> is 0, this function returns the same as {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#itemTransform(com.trolltech.qt.gui.QGraphicsItemInterface) itemTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapFromItem()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_QRectF(nativeId(), item == null ? 0 : item.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToItem_QGraphicsItem_QRectF(long __this__nativeId, long item, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapToItem(<tt>item</tt>, {@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToItem_QGraphicsItem_double_double(long __this__nativeId, long item, double x, double y);

/**
This convenience function is equivalent to calling mapToItem(item, {@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface item, double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToItem_QGraphicsItem_double_double_double_double(nativeId(), item == null ? 0 : item.nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToItem_QGraphicsItem_double_double_double_double(long __this__nativeId, long item, double x, double y, double w, double h);

/**
Maps the path <tt>path</tt>, which is in this item's coordinate system, to its parent's coordinate system, and returns the mapped path. If the item has no parent, <tt>path</tt> will be mapped to the scene's coordinate system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapToParent(com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapToParent_QPainterPath(long __this__nativeId, long path);

/**
Maps the point <tt>point</tt>, which is in this item's coordinate system, to its parent's coordinate system, and returns the mapped coordinate. If the item has no parent, <tt>point</tt> will be mapped to the scene's coordinate system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToParent(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToParent_QPointF(long __this__nativeId, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in this item's coordinate system, to its parent's coordinate system, and returns the mapped polygon. If the item has no parent, <tt>polygon</tt> will be mapped to the scene's coordinate system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToParent(com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToParent_QPolygonF(long __this__nativeId, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to its parent's coordinate system, and returns the mapped rectangle as a polygon. If the item has no parent, <tt>rect</tt> will be mapped to the scene's coordinate system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromParent(com.trolltech.qt.gui.QPainterPath) mapFromParent()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToParent(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToParent_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapToParent({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToParent(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToParent_double_double(long __this__nativeId, double x, double y);

/**
This convenience function is equivalent to calling mapToParent({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToParent(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToParent_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Maps the path <tt>path</tt>, which is in this item's coordinate system, to the scene's coordinate system, and returns the mapped path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath mapToScene(com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_mapToScene_QPainterPath(long __this__nativeId, long path);

/**
Maps the point <tt>point</tt>, which is in this item's coordinate system, to the scene's coordinate system, and returns the mapped coordinate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToScene(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToScene_QPointF(long __this__nativeId, long point);

/**
Maps the polygon <tt>polygon</tt>, which is in this item's coordinate system, to the scene's coordinate system, and returns the mapped polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_QPolygonF(long __this__nativeId, long polygon);

/**
Maps the rectangle <tt>rect</tt>, which is in this item's coordinate system, to the scene's coordinate system, and returns the mapped rectangle as a polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mapToParent(com.trolltech.qt.gui.QPainterPath) mapToParent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapToItem(com.trolltech.qt.gui.QGraphicsItemInterface, com.trolltech.qt.gui.QPainterPath) mapToItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling mapToScene({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToScene(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToScene_double_double(long __this__nativeId, double x, double y);

/**
This convenience function is equivalent to calling mapToScene({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Returns the maximum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumHeight(double) setMaximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double maximumHeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumHeight(long __this__nativeId);

/**
Returns the maximum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF maximumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_maximumSize(long __this__nativeId);

/**
Returns the maximum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumWidth(double) setMaximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double maximumWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumWidth(long __this__nativeId);

/**
Returns the minimum height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minimumHeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimumHeight(long __this__nativeId);

/**
Returns the minimum size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_minimumSize(long __this__nativeId);

/**
Returns the minimum width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minimumWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimumWidth(long __this__nativeId);

/**
Moves the item by <tt>dx</tt> points horizontally, and <tt>dy</tt> point vertically. This function is equivalent to calling setPos({@link com.trolltech.qt.gui.QGraphicsItem#pos() pos()} + {@link com.trolltech.qt.core.QPointF QPointF}(<tt>dx</tt>, <tt>dy</tt>)).
*/

    @QtBlockedSlot
    public final void moveBy(double dx, double dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveBy_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_moveBy_double_double(long __this__nativeId, double dx, double dy);

/**
Returns this item's local opacity, which is between 0.  (transparent) and 1.0 (opaque). This value is combined with parent and ancestor values into the {@link com.trolltech.qt.gui.QGraphicsItem#effectiveOpacity() effectiveOpacity()}. The effective opacity decides how the item is rendered. <p>The opacity property decides the state of the painter passed to the {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()} function. If the item is cached (i.e., {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode ItemCoordinateCache } or {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode DeviceCoordinateCache }), the effective property will applied to the item's cache as it is rendered. <p>The default opacity is 1.0; fully opaque. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setOpacity(double) setOpacity()}, {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()}, {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIgnoresParentOpacity }, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemDoesntPropagateOpacityToChildren }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double opacity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opacity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_opacity(long __this__nativeId);

/**
Returns whether a layout should delete this item in its destructor. If its true, then the layout will delete it. If its false, then it is assumed that another object has the ownership of it, and the layout won't delete this item. <p>If the item inherits both {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} (such as QGraphicsWidget does) the item is really part of two ownership hierarchies. This property informs what the layout should do with its child items when it is destructed. In the case of QGraphicsWidget, it is preferred that when the layout is deleted it won't delete its children (since they are also part of the graphics item hierarchy). <p>By default this value is initialized to false in {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, but it is overridden by {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} to return true. This is because {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} is not normally part of the {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} hierarchy, so the parent layout should delete it. Subclasses might override this default behaviour by calling setOwnedByLayout(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setOwnedByLayout(boolean) setOwnedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean ownedByLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownedByLayout(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ownedByLayout(long __this__nativeId);

/**
This property holds the widget's palette. This property provides the widget's palette. The palette provides colors and brushes for color groups (e.g., {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Button }) and states (e.g., {@link com.trolltech.qt.gui.QPalette.ColorGroup QPalette::Inactive }), loosely defining the general look of the widget and its children. <p>{@link com.trolltech.qt.gui.QPalette QPalette} consists of color groups that have been explicitly defined, and groups that are implicitly inherited from the widget's parent. Because of this, {@link com.trolltech.qt.gui.QGraphicsWidget#palette() palette()} can return a different palette than what has been set with {@link com.trolltech.qt.gui.QGraphicsWidget#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}. This scheme allows you to define single entries in a palette without affecting the palette's inherited entries. <p>When a widget's palette changes, it resolves its entries against its parent widget, or if it doesn't have a parent widget, it resolves against the scene. It then sends itself a {@link com.trolltech.qt.core.QEvent.Type PaletteChange } event, and notifies all its descendants so they can resolve their palettes as well. <p>By default, this property contains the application's default palette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}, {@link QGraphicsScene#palette() QGraphicsScene::palette}, and QPalette::resolve(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="palette")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette palette()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_palette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_palette(long __this__nativeId);

/**
Returns a pointer to this item's parent item. If this item does not have a parent, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setParentItem(com.trolltech.qt.gui.QGraphicsItemInterface) setParentItem()}, and children(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface parentItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_parentItem(long __this__nativeId);

/**
Returns the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, or 0 if there is no parent, or if the parent does not inherit from {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} ({@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} is often used through multiple inheritance with {@link com.trolltech.qt.core.QObject QObject}-derived classes). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) setParentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsLayoutItemInterface parentLayoutItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentLayoutItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsLayoutItemInterface __qt_parentLayoutItem(long __this__nativeId);

/**
Returns a pointer to the item's parent widget. The item's parent widget is the closest parent item that is a widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#parentItem() parentItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#childItems() childItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsWidget parentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsWidget __qt_parentWidget(long __this__nativeId);

/**
Returns the position of the item in parent coordinates. If the item has no parent, its position is given in scene coordinates. <p>The position of the item describes its origin (local coordinate (0, 0)) in parent coordinates; this function returns the same as mapToParent(0, 0). <p>For convenience, you can also call {@link com.trolltech.qt.gui.QGraphicsItem#scenePos() scenePos()} to determine the item's position in scene coordinates, regardless of its parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#x() x()}, {@link com.trolltech.qt.gui.QGraphicsItem#y() y()}, {@link com.trolltech.qt.gui.QGraphicsItem#setPos(com.trolltech.qt.core.QPointF) setPos()}, matrix(), and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF pos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_pos(long __this__nativeId);

/**
Returns the preferred height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredHeight(double) setPreferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double preferredHeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredHeight(nativeId());
    }
    @QtBlockedSlot
    native double __qt_preferredHeight(long __this__nativeId);

/**
Returns the preferred size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF preferredSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_preferredSize(long __this__nativeId);

/**
Returns the preferred width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredWidth(double) setPreferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double preferredWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preferredWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_preferredWidth(long __this__nativeId);

/**
Prepares the item for a geometry change. Call this function before changing the bounding rect of an item to keep {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}'s index up to date. <p>{@link com.trolltech.qt.gui.QGraphicsItem#prepareGeometryChange() prepareGeometryChange()} will call {@link com.trolltech.qt.gui.QGraphicsItem#update() update()} if this is necessary. <p>Example: <pre class="snippet">
        public class CircleItem extends QGraphicsItem {

            // ...
            public void setRadius(double newRadius)
            {
                if (radius != newRadius) {
                    prepareGeometryChange();
                    radius = newRadius;
                }
            }
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void prepareGeometryChange()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prepareGeometryChange(nativeId());
    }
    @QtBlockedSlot
    native void __qt_prepareGeometryChange(long __this__nativeId);

/**
Returns the item's local rect as a {@link com.trolltech.qt.core.QRectF QRectF}. This function is equivalent to {@link com.trolltech.qt.core.QRectF QRectF}(QPointF(), {@link com.trolltech.qt.gui.QGraphicsWidget#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF rect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_rect(long __this__nativeId);

/**
Removes the shortcut with the given <tt>id</tt> from Qt's shortcut system. The widget will no longer receive {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } events for the shortcut's key sequence (unless it has other shortcuts with the same key sequence). <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system removes shortcuts automatically when their parent widget is destroyed. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. Note also that this is an expensive operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#setShortcutEnabled(int) setShortcutEnabled()}, and {@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) QWidget::releaseShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseShortcut(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseShortcut_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_releaseShortcut_int(long __this__nativeId, int id);

/**
Removes the action <tt>action</tt> from this widget's list of actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QGraphicsWidget#actions() actions()}, {@link com.trolltech.qt.gui.QGraphicsWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, and {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) QWidget::removeAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            while (__rcActions.remove(action)) ;
        }
        __qt_removeAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeAction_QAction(long __this__nativeId, long action);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void removeFromIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeFromIndex(nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeFromIndex(long __this__nativeId);

/**
Removes an event filter on this item from <tt>filterItem</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#installSceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface) installSceneEventFilter()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeSceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface filterItem)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeSceneEventFilter_QGraphicsItem(nativeId(), filterItem == null ? 0 : filterItem.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeSceneEventFilter_QGraphicsItem(long __this__nativeId, long filterItem);

/**
Resets this item's transformation matrix to the identity matrix. This is equivalent to calling <tt>setTransform(QTransform())</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, and {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetTransform()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetTransform(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetTransform(long __this__nativeId);

/**
This property holds the size of the widget. Calling {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()} resizes the widget to a <tt>size</tt> bounded by {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. This property only affects the widget's width and height (e.g., its right and bottom edges); the widget's position and top-left corner remains unaffected. <p>Resizing a widget triggers the widget to immediately receive a {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneResize } event with the widget's old and new size. If the widget has a layout assigned when this event arrives, the layout will be activated and it will automatically update any child widgets's geometry. <p>This property does not affect any layout of the parent widget. If the widget itself is managed by a parent layout; e.g., it has a parent widget with a layout assigned, that layout will not activate. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}, {@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent QGraphicsSceneResizeEvent}, and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="size")
    @QtBlockedSlot
    public final void resize(com.trolltech.qt.core.QSizeF size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resize_QSizeF(long __this__nativeId, long size);

/**
This property holds the size of the widget. Calling {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()} resizes the widget to a <tt>size</tt> bounded by {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. This property only affects the widget's width and height (e.g., its right and bottom edges); the widget's position and top-left corner remains unaffected. <p>Resizing a widget triggers the widget to immediately receive a {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneResize } event with the widget's old and new size. If the widget has a layout assigned when this event arrives, the layout will be activated and it will automatically update any child widgets's geometry. <p>This property does not affect any layout of the parent widget. If the widget itself is managed by a parent layout; e.g., it has a parent widget with a layout assigned, that layout will not activate. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}, {@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent QGraphicsSceneResizeEvent}, and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resize(double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_resize_double_double(long __this__nativeId, double w, double h);

/**
Rotates the current item transformation <tt>angle</tt> degrees clockwise around its origin. To translate around an arbitrary point (x, y), you need to combine translation and rotation with {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <p>Example: <pre class="snippet">
        // Rotate an item 45 degrees around (0, 0).
        item.rotate(45);

        // Rotate an item 45 degrees around (x, y).
        item.setTransform(new QTransform().translate(x, y).rotate(45).translate(-x, -y));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsItem#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsItem#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void rotate(double angle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rotate_double(nativeId(), angle);
    }
    @QtBlockedSlot
    native void __qt_rotate_double(long __this__nativeId, double angle);

/**
Scales the current item transformation by (<tt>sx</tt>, <tt>sy</tt>) around its origin. To scale from an arbitrary point (x, y), you need to combine translation and scaling with {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <p>Example: <pre class="snippet">
        // Scale an item by 3x2 from its origin
        item.scale(3, 2);

        // Scale an item by 3x2 from (x, y)
        item.setTransform(new QTransform().translate(x, y).scale(3, 2).translate(-x, -y));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsItem#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsItem#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scale(double sx, double sy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scale_double_double(nativeId(), sx, sy);
    }
    @QtBlockedSlot
    native void __qt_scale_double_double(long __this__nativeId, double sx, double sy);

/**
Returns the current scene for the item, or 0 if the item is not stored in a scene. <p>To add or move an item to a scene, call {@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsScene scene()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scene(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsScene __qt_scene(long __this__nativeId);

/**
Returns the bounding rect of this item in scene coordinates, by combining {@link com.trolltech.qt.gui.QGraphicsItem#sceneTransform() sceneTransform()} with {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF sceneBoundingRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sceneBoundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_sceneBoundingRect(long __this__nativeId);

/**
Returns the item's position in scene coordinates. This is equivalent to calling <tt>mapToScene(0, 0)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsItem#sceneTransform() sceneTransform()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF scenePos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scenePos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_scenePos(long __this__nativeId);

/**
Returns this item's scene transformation matrix. This matrix can be used to map coordinates and geometrical shapes from this item's local coordinate system to the scene's coordinate system. To map coordinates from the scene, you must first invert the returned matrix. <p>Example: <pre class="snippet">
        QGraphicsRectItem rect = new QGraphicsRectItem();
        rect.setPos(100, 100);

        rect.sceneTransform().map(new QPointF(0, 0));
        // returns QPointF(100, 100);

        rect.sceneTransform().inverted().map(new QPointF(100, 100));
        // returns QPointF(0, 0);
</pre> Unlike {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, which returns only an item's local transformation, this function includes the item's (and any parents') position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#scenePos() scenePos()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform sceneTransform()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sceneTransform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_sceneTransform(long __this__nativeId);

/**
Scrolls the contents of <tt>rect</tt> by <tt>dx</tt>, <tt>dy</tt>. If <tt>rect</tt> is a null rect (the default), the item's bounding rect is scrolled. <p>Scrolling provides a fast alternative to simply redrawing when the contents of the item (or parts of the item) are shifted vertically or horizontally. Depending on the current transformation and the capabilities of the paint device (i.e., the viewport), this operation may consist of simply moving pixels from one location to another using memmove(). In most cases this is faster than rerendering the entire area. <p>After scrolling, the item will issue an update for the newly exposed areas. If scrolling is not supported (e.g., you are rendering to an OpenGL viewport, which does not benefit from scroll optimizations), this function is equivalent to calling update(<tt>rect</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scroll(double dx, double dy, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scroll_double_double_QRectF(nativeId(), dx, dy, rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_scroll_double_double_QRectF(long __this__nativeId, double dx, double dy, long rect);

/**
If <tt>on</tt> is true, this item will accept drag and drop events; otherwise, it is transparent for drag and drop events. By default, items do not accept drag and drop events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#acceptDrops() acceptDrops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAcceptDrops(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptDrops_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setAcceptDrops_boolean(long __this__nativeId, boolean on);

/**
If <tt>enabled</tt> is true, this item will accept hover events; otherwise, it will ignore them. By default, items do not accept hover events. <p>Hover events are delivered when there is no current mouse grabber item. They are sent when the mouse cursor enters an item, when it moves around inside the item, and when the cursor leaves an item. Hover events are commonly used to highlight an item when it's entered, and for tracking the mouse cursor as it hovers over the item (equivalent to {@link QWidget#hasMouseTracking() QWidget::mouseTracking}). <p>Parent items receive hover enter events before their children, and leave events after their children. The parent does not receive a hover leave event if the cursor enters a child, though; the parent stays "hovered" until the cursor leaves its area, including its children's areas. <p>If a parent item handles child events ({@link com.trolltech.qt.gui.QGraphicsItem#setHandlesChildEvents(boolean) setHandlesChildEvents()}), it will receive hover move, drag move, and drop events as the cursor passes through its children, but it does not receive hover enter and hover leave, nor drag enter and drag leave events on behalf of its children. <p>A QGraphicsWidget with window decorations will accept hover events regardless of the value of {@link com.trolltech.qt.gui.QGraphicsItem#acceptHoverEvents() acceptHoverEvents()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#acceptHoverEvents() acceptHoverEvents()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverEnterEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverMoveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#hoverLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverLeaveEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAcceptHoverEvents(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptHoverEvents_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setAcceptHoverEvents_boolean(long __this__nativeId, boolean enabled);

/**
Sets the mouse <tt>buttons</tt> that this item accepts mouse events for. <p>By default, all mouse buttons are accepted. If an item accepts a mouse button, it will become the mouse grabber item when a mouse press event is delivered for that button. However, if the item does not accept the mouse button, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} will forward the mouse events to the first item beneath it that does. <p>To disable mouse events for an item (i.e., make it transparent for mouse events), call setAcceptedMouseButtons(0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#acceptedMouseButtons() acceptedMouseButtons()}, and {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButtons buttons)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptedMouseButtons_MouseButtons(nativeId(), buttons.value());
    }
    @QtBlockedSlot
    native void __qt_setAcceptedMouseButtons_MouseButtons(long __this__nativeId, int buttons);

/**
Use setAcceptHoverEvents(<tt>enabled</tt>) instead. <p><DT><b>See also:</b><br><DD>acceptsHoverEvents(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAcceptsHoverEvents(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptsHoverEvents_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setAcceptsHoverEvents_boolean(long __this__nativeId, boolean enabled);


/**
If <tt>on</tt> is true, this function enables <tt>attribute</tt>; otherwise <tt>attribute</tt> is disabled. <p>See the class documentation for QGraphicsWidget for a complete list of which attributes are supported, and what they are for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) testAttribute()}, and {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) QWidget::setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute attribute) {
        setAttribute(attribute, (boolean)true);
    }
/**
If <tt>on</tt> is true, this function enables <tt>attribute</tt>; otherwise <tt>attribute</tt> is disabled. <p>See the class documentation for QGraphicsWidget for a complete list of which attributes are supported, and what they are for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) testAttribute()}, and {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) QWidget::setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute attribute, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_WidgetAttribute_boolean(nativeId(), attribute.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_WidgetAttribute_boolean(long __this__nativeId, int attribute, boolean on);

/**
Sets the bounding region granularity to <tt>granularity</tt>; a value between and including 0 and 1. The default value is 0 (i.e., the lowest granularity, where the bounding region corresponds to the item's bounding rectangle). <p>The granularity is used by {@link com.trolltech.qt.gui.QGraphicsItem#boundingRegion(com.trolltech.qt.gui.QTransform) boundingRegion()} to calculate how fine the bounding region of the item should be. The highest achievable granularity is 1, where {@link com.trolltech.qt.gui.QGraphicsItem#boundingRegion(com.trolltech.qt.gui.QTransform) boundingRegion()} will return the finest outline possible for the respective device (e.g., for a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} viewport, this gives you a pixel-perfect bounding region). The lowest possible granularity is 0. The value of <tt>granularity</tt> describes the ratio between device resolution and the resolution of the bounding region (e.g., a value of 0.25 will provide a region where each chunk corresponds to 4x4 device units / pixels). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRegionGranularity() boundingRegionGranularity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBoundingRegionGranularity(double granularity)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBoundingRegionGranularity_double(nativeId(), granularity);
    }
    @QtBlockedSlot
    native void __qt_setBoundingRegionGranularity_double(long __this__nativeId, double granularity);

/**
Sets the item's cache mode to <tt>mode</tt>. <p>The optional <tt>logicalCacheSize</tt> argument is used only by {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode ItemCoordinateCache } mode, and describes the resolution of the cache buffer; if <tt>logicalCacheSize</tt> is (100, 100), {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} will fit the item into 100x100 pixels in graphics memory, regardless of the logical size of the item itself. By default {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} uses the size of {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}. For all other cache modes than {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode ItemCoordinateCache }, <tt>logicalCacheSize</tt> is ignored. <p>Caching can speed up rendering if your item spends a significant time redrawing itself. In some cases the cache can also slow down rendering, in particular when the item spends less time redrawing than {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} spends redrawing from the cache. When enabled, the item's {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()} function will be called only once for each call to {@link com.trolltech.qt.gui.QGraphicsItem#update() update()}; for any subsequent repaint requests, the Graphics View framework will redraw from the cache. This approach works particularly well with {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, which stores all the cache as OpenGL textures. <p>Be aware that {@link com.trolltech.qt.gui.QPixmapCache QPixmapCache}'s cache limit may need to be changed to obtain optimal performance. <p>You can read more about the different cache modes in the {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode CacheMode } documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#cacheMode() cacheMode()}, {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode CacheMode }, and {@link com.trolltech.qt.gui.QPixmapCache#setCacheLimit(int) QPixmapCache::setCacheLimit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCacheMode(com.trolltech.qt.gui.QGraphicsItem.CacheMode mode, com.trolltech.qt.core.QSize cacheSize)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCacheMode_CacheMode_QSize(nativeId(), mode.value(), cacheSize == null ? 0 : cacheSize.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCacheMode_CacheMode_QSize(long __this__nativeId, int mode, long cacheSize);

/**
Sets the widget's contents margins to <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt>. <p>Contents margins are used by the assigned layout to define the placement of subwidgets and layouts. Margins are particularily useful for widgets that constrain subwidgets to only a section of its own geometry. For example, a group box with a layout will place subwidgets inside its frame, but below the title. <p>Changing a widget's contents margins will always trigger an {@link com.trolltech.qt.gui.QGraphicsItem#update() update()}, and any assigned layout will be activated automatically. The widget will then receive a {@link com.trolltech.qt.core.QEvent.Type ContentsRectChange } event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#getContentsMargins() getContentsMargins()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContentsMargins(double left, double top, double right, double bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentsMargins_double_double_double_double(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setContentsMargins_double_double_double_double(long __this__nativeId, double left, double top, double right, double bottom);

/**
Sets the current cursor shape for the item to <tt>cursor</tt>. The mouse cursor will assume this shape when it's over this item. See the {@link com.trolltech.qt.core.Qt.CursorShape list of predefined cursor objects } for a range of useful shapes. <p>An editor item might want to use an I-beam cursor: <pre class="snippet">
       item.setCursor(new QCursor(Qt.CursorShape.IBeamCursor));
</pre> If no cursor has been set, the cursor of the item beneath is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#cursor() cursor()}, {@link com.trolltech.qt.gui.QGraphicsItem#hasCursor() hasCursor()}, {@link com.trolltech.qt.gui.QGraphicsItem#unsetCursor() unsetCursor()}, {@link QWidget#cursor() QWidget::cursor}, and {@link com.trolltech.qt.gui.QApplication#overrideCursor() QApplication::overrideCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCursor(com.trolltech.qt.gui.QCursor cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursor_QCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCursor_QCursor(long __this__nativeId, long cursor);

/**
Sets this item's custom data for the key <tt>key</tt> to <tt>value</tt>. <p>Custom item data is useful for storing arbitrary properties for any item. Qt does not use this feature for storing data; it is provided solely for the convenience of the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#data(int) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(int key, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_int_Object(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_setData_int_Object(long __this__nativeId, int key, java.lang.Object value);

/**
If <tt>enabled</tt> is true, the item is enabled; otherwise, it is disabled. <p>Disabled items are visible, but they do not receive any events, and cannot take focus nor be selected. Mouse events are discarded; they are not propagated unless the item is also invisible, or if it does not accept mouse events (see {@link com.trolltech.qt.gui.QGraphicsItem#acceptedMouseButtons() acceptedMouseButtons()}). A disabled item cannot become the mouse grabber, and as a result of this, an item loses the grab if it becomes disabled when grabbing the mouse, just like it loses focus if it had focus when it was disabled. <p>Disabled items are traditionally drawn using grayed-out colors (see {@link com.trolltech.qt.gui.QPalette.ColorGroup QPalette::Disabled }). <p>If you disable a parent item, all its children will also be disabled. If you enable a parent item, all children will be enabled, unless they have been explicitly disabled (i.e., if you call setEnabled(false) on a child, it will not be reenabled if its parent is disabled, and then enabled again). <p>Items are enabled by default. <p><b>Note:</b> If you install an event filter, you can still intercept events before they are delivered to items; this mechanism disregards the item's enabled state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isEnabled() isEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnabled(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean enabled);

/**
If <tt>enabled</tt> is true, the item flag <tt>flag</tt> is enabled; otherwise, it is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#flags() flags()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFlags(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFlag(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag flag, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlag_GraphicsItemFlag_boolean(nativeId(), flag.value(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setFlag_GraphicsItemFlag_boolean(long __this__nativeId, int flag, boolean enabled);

/**
Sets the item flags to <tt>flags</tt>. All flags in <tt>flags</tt> are enabled; all flags not in <tt>flags</tt> are disabled. <p>If the item had focus and <tt>flags</tt> does not enable {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable }, the item loses focus as a result of calling this function. Similarly, if the item was selected, and <tt>flags</tt> does not enabled {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsSelectable }, the item is automatically unselected. <p>By default, no flags are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#flags() flags()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setFlag(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag) setFlag()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_GraphicsItemFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_GraphicsItemFlags(long __this__nativeId, int flags);

/**
Gives keyboard input focus to this item. The <tt>focusReason</tt> argument will be passed into any focus event generated by this function; it is used to give an explanation of what caused the item to get focus. <p>Only items that set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag can accept keyboard focus. <p>If this item is not visible (i.e., {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() isVisible()} returns false), not enabled, not associated with a scene, or if it already has input focus, this function will do nothing. <p>As a result of calling this function, this item will receive a focus in event with <tt>focusReason</tt>. If another item already has focus, that item will first receive a focus out event indicating that it has lost input focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#clearFocus() clearFocus()}, and {@link com.trolltech.qt.gui.QGraphicsItem#hasFocus() hasFocus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocus(com.trolltech.qt.core.Qt.FocusReason focusReason)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocus_FocusReason(nativeId(), focusReason.value());
    }
    @QtBlockedSlot
    native void __qt_setFocus_FocusReason(long __this__nativeId, int focusReason);

/**
This property holds the way the widget accepts keyboard focus. The focus policy is {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::TabFocus } if the widget accepts keyboard focus by tabbing, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus } if the widget accepts focus by clicking, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus } if it accepts both, and {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } (the default) if it does not accept focus at all. <p>You must enable keyboard focus for a widget if it processes keyboard events. This is normally done from the widget's constructor. For instance, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} constructor calls setFocusPolicy({@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }). <p>If you enable a focus policy (i.e., not {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus }), QGraphicsWidget will automatically enable the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag. Setting {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } on a widget will clear the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag. If the widget currently has keyboard focus, the widget will automatically lose focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, and enabled. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="focusPolicy")
    @QtBlockedSlot
    public final void setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocusPolicy_FocusPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setFocusPolicy_FocusPolicy(long __this__nativeId, int policy);

/**
This property holds the widgets' font. This property provides the widget's font. <p>{@link com.trolltech.qt.gui.QFont QFont} consists of font properties that have been explicitly defined and properties implicitly inherited from the widget's parent. Hence, {@link com.trolltech.qt.gui.QGraphicsWidget#font() font()} can return a different font compared to the one set with {@link com.trolltech.qt.gui.QGraphicsWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}. This scheme allows you to define single entries in a font without affecting the font's inherited entries. <p>When a widget's font changes, it resolves its entries against its parent widget. If the widget does not have a parent widget, it resolves its entries against the scene. The widget then sends itself a {@link com.trolltech.qt.core.QEvent.Type FontChange } event and notifies all its descendants so that they can resolve their fonts as well. <p>By default, this property contains the application's default font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#font() QApplication::font()}, {@link QGraphicsScene#font() QGraphicsScene::font}, and QFont::resolve(). <br></DD></DT>
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
This convenience function is equivalent to calling setGeometry({@link com.trolltech.qt.core.QRectF QRectF}( <tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGeometry(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setGeometry_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
If the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} represents a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and it wants to take advantage of the automatic reparenting capabilities of {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout} it should set this value. Note that if you delete <tt>item</tt> and not delete the layout item, you are responsible of calling setGraphicsItem(0) in order to avoid having a dangling pointer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#graphicsItem() graphicsItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGraphicsItem(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItem = item;
        }
        __qt_setGraphicsItem_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGraphicsItem_QGraphicsItem(long __this__nativeId, long item);

/**
Adds this item to the item group <tt>group</tt>. If <tt>group</tt> is 0, this item is removed from any current group and added as a child of the previous group's parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#group() group()}, and {@link com.trolltech.qt.gui.QGraphicsScene#createItemGroup(java.util.List) QGraphicsScene::createItemGroup()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setGroup(com.trolltech.qt.gui.QGraphicsItemGroup group)    {
        com.trolltech.qt.gui.QGraphicsItemGroup oldGroup = group();


        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGroup_QGraphicsItemGroup(nativeId(), group == null ? 0 : group.nativeId());
        if (group == null && oldGroup != null && oldGroup.parentItem() == null)
            reenableGarbageCollection();
        else
            disableGarbageCollection();


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setGroup_QGraphicsItemGroup(long __this__nativeId, long group);

/**
If <tt>enabled</tt> is true, this item is set to handle all events for all its children (i. ., all events intented for any of its children are instead sent to this item); otherwise, if <tt>enabled</tt> is false, this item will only handle its own events. The default value is false. <p>This property is useful for item groups; it allows one item to handle events on behalf of its children, as opposed to its children handling their events individually. <p>If a child item accepts hover events, its parent will receive hover move events as the cursor passes through the child, but it does not receive hover enter and hover leave events on behalf of its child. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#handlesChildEvents() handlesChildEvents()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHandlesChildEvents(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHandlesChildEvents_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setHandlesChildEvents_boolean(long __this__nativeId, boolean enabled);

/**
Sets the layout for this widget to <tt>layout</tt>. Any existing layout manager is deleted before the new layout is assigned. If <tt>layout</tt> is 0, the widget is left without a layout. Existing subwidgets' geometries will remain unaffected. <p>All widgets that are currently managed by <tt>layout</tt> or all of its sublayouts, are automatically reparented to this item. The layout is then invalidated, and the child widget geometries are adjusted according to this item's {@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()} and contentsMargins(). Children who are not explicitly managed by <tt>layout</tt> remain unaffected by the layout after it has been assigned to this widget. <p>QGraphicsWidget takes ownership of <tt>layout</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#layout() layout()}, {@link com.trolltech.qt.gui.QGraphicsLinearLayout#addItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface) QGraphicsLinearLayout::addItem()}, and {@link com.trolltech.qt.gui.QGraphicsLayout#invalidate() QGraphicsLayout::invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLayout(com.trolltech.qt.gui.QGraphicsLayout layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcLayout = layout;
        }
        __qt_setLayout_QGraphicsLayout(nativeId(), layout == null ? 0 : layout.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLayout_QGraphicsLayout(long __this__nativeId, long layout);

/**
This property holds the layout direction for this widget.  This property modifies this widget's and all of its descendants' {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_RightToLeft } attribute. It also sets this widget's {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetLayoutDirection } attribute. <p>The widget's layout direction determines the order in which the layout manager horizontally arranges subwidgets of this widget. The default value depends on the language and locale of the application, and is typically in the same direction as words are read and written. With {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, the layout starts placing subwidgets from the left side of this widget towards the right. {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::RightToLeft } does the opposite - the layout will place widgets starting from the right edge moving towards the left. <p>Subwidgets inherit their layout direction from the parent. Top-level widget items inherit their layout direction from QGraphicsScene::layoutDirection. If you change a widget's layout direction by calling {@link com.trolltech.qt.gui.QGraphicsWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}, the widget will send itself a {@link com.trolltech.qt.core.QEvent.Type LayoutDirectionChange } event, and then propagate the new layout direction to all its descendants. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}, and {@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="layoutDirection")
    @QtBlockedSlot
    public final void setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayoutDirection_LayoutDirection(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setLayoutDirection_LayoutDirection(long __this__nativeId, int direction);

/**
Sets the maximum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumHeight() maximumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumHeight(double height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setMaximumHeight_double(long __this__nativeId, double height);

/**
Sets the maximum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size larger than <tt>size</tt>. In order to unset the maximum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MaximumSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumSize(com.trolltech.qt.core.QSizeF size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setMaximumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumSize(double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the maximum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumWidth() maximumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumWidth(double width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setMaximumWidth_double(long __this__nativeId, double width);

/**
Sets the minimum height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumHeight() minimumHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumHeight(double height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setMinimumHeight_double(long __this__nativeId, double height);

/**
Sets the minimum size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize } and ensures that {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()} will never return a size smaller than <tt>size</tt>. In order to unset the minimum size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::MinimumSize }, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumWidth(double) setMinimumWidth()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumHeight(double) setMinimumHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumSize(com.trolltech.qt.core.QSizeF size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setMinimumSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumSize(double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the minimum width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumWidth() minimumWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumWidth(double width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setMinimumWidth_double(long __this__nativeId, double width);

/**
Sets this item's local <tt>opacity</tt>, between 0.  (transparent) and 1.0 (opaque). The item's local opacity is combined with parent and ancestor opacities into the {@link com.trolltech.qt.gui.QGraphicsItem#effectiveOpacity() effectiveOpacity()}. <p>By default, opacity propagates from parent to child, so if a parent's opacity is 0.5 and the child is also 0.5, the child's effective opacity will be 0.25. The result <p>The opacity property decides the state of the painter passed to the {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()} function. If the item is cached (i.e., {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode ItemCoordinateCache } or {@link com.trolltech.qt.gui.QGraphicsItem.CacheMode DeviceCoordinateCache }), the effective property will applied to the item's cache as it is rendered. <p>There are two item flags that affect how the item's opacity is combined with the parent: {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIgnoresParentOpacity } and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemDoesntPropagateOpacityToChildren }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#opacity() opacity()}, and {@link com.trolltech.qt.gui.QGraphicsItem#effectiveOpacity() effectiveOpacity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOpacity(double opacity)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpacity_double(nativeId(), opacity);
    }
    @QtBlockedSlot
    native void __qt_setOpacity_double(long __this__nativeId, double opacity);

/**
Sets whether a layout should delete this item in its destructor or not. <tt>ownership</tt> must be true to in order for the layout to delete it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#ownedByLayout() ownedByLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOwnedByLayout(boolean ownedByLayout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOwnedByLayout_boolean(nativeId(), ownedByLayout);
    }
    @QtBlockedSlot
    native void __qt_setOwnedByLayout_boolean(long __this__nativeId, boolean ownedByLayout);

/**
This property holds the widget's palette. This property provides the widget's palette. The palette provides colors and brushes for color groups (e.g., {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Button }) and states (e.g., {@link com.trolltech.qt.gui.QPalette.ColorGroup QPalette::Inactive }), loosely defining the general look of the widget and its children. <p>{@link com.trolltech.qt.gui.QPalette QPalette} consists of color groups that have been explicitly defined, and groups that are implicitly inherited from the widget's parent. Because of this, {@link com.trolltech.qt.gui.QGraphicsWidget#palette() palette()} can return a different palette than what has been set with {@link com.trolltech.qt.gui.QGraphicsWidget#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}. This scheme allows you to define single entries in a palette without affecting the palette's inherited entries. <p>When a widget's palette changes, it resolves its entries against its parent widget, or if it doesn't have a parent widget, it resolves against the scene. It then sends itself a {@link com.trolltech.qt.core.QEvent.Type PaletteChange } event, and notifies all its descendants so they can resolve their palettes as well. <p>By default, this property contains the application's default palette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}, {@link QGraphicsScene#palette() QGraphicsScene::palette}, and QPalette::resolve(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="palette")
    @QtBlockedSlot
    public final void setPalette(com.trolltech.qt.gui.QPalette palette)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPalette_QPalette(nativeId(), palette == null ? 0 : palette.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPalette_QPalette(long __this__nativeId, long palette);

/**
Sets this item's parent item to <tt>parent</tt>. If this item already has a parent, it is first removed from the previous parent. If <tt>parent</tt> is 0, this item will become a top-level item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#parentItem() parentItem()}, and children(). <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setParentItem(com.trolltech.qt.gui.QGraphicsItemInterface parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParentItem_QGraphicsItem(nativeId(), parent == null ? 0 : parent.nativeId());
        if (parent == null)
            reenableGarbageCollection();
        else
            disableGarbageCollection();


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setParentItem_QGraphicsItem(long __this__nativeId, long parent);

/**
Sets the parent of this {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#parentLayoutItem() parentLayoutItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setParentLayoutItem(com.trolltech.qt.gui.QGraphicsLayoutItemInterface parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcParentLayoutItem = parent;
        }
        __qt_setParentLayoutItem_QGraphicsLayoutItem(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setParentLayoutItem_QGraphicsLayoutItem(long __this__nativeId, long parent);

/**
Sets the position of the item to <tt>pos</tt>, which is in parent coordinates. For items with no parent, <tt>pos</tt> is in scene coordinates. <p>The position of the item describes its origin (local coordinate (0, 0)) in parent coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#pos() pos()}, {@link com.trolltech.qt.gui.QGraphicsItem#scenePos() scenePos()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPos(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPos_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPos_QPointF(long __this__nativeId, long pos);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling setPos({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final void setPos(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPos_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_setPos_double_double(long __this__nativeId, double x, double y);

/**
Sets the preferred height to <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredHeight(double height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setPreferredHeight_double(long __this__nativeId, double height);

/**
Sets the preferred size to <tt>size</tt>. This property overrides {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} for {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize } and provides the default value for {@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. In order to unset the preferred size, use an invalid size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}, {@link com.trolltech.qt.core.Qt.SizeHint Qt::PreferredSize }, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredSize(com.trolltech.qt.core.QSizeF size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPreferredSize_QSizeF(long __this__nativeId, long size);

/**
This convenience function is equivalent to calling setPreferredSize({@link com.trolltech.qt.core.QSizeF QSizeF}(<tt>w</tt>, <tt>h</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMaximumSize(com.trolltech.qt.core.QSizeF) setMaximumSize()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setMinimumSize(com.trolltech.qt.core.QSizeF) setMinimumSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredSize(double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredSize_double_double(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setPreferredSize_double_double(long __this__nativeId, double w, double h);

/**
Sets the preferred width to <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredWidth() preferredWidth()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredHeight() preferredHeight()}, {@link com.trolltech.qt.gui.QGraphicsLayoutItem#setPreferredSize(com.trolltech.qt.core.QSizeF) setPreferredSize()}, and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#preferredSize() preferredSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPreferredWidth(double width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreferredWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setPreferredWidth_double(long __this__nativeId, double width);

/**
If <tt>selected</tt> is true and this item is selectable, this item is selected; otherwise, it is unselected. <p>If the item is in a group, the whole group's selected state is toggled by this function. If the group is selected, all items in the group are also selected, and if the group is not selected, no item in the group is selected. <p>Only visible, enabled, selectable items can be selected. If <tt>selected</tt> is true and this item is either invisible or disabled or unselectable, this function does nothing. <p>By default, items cannot be selected. To enable selection, set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsSelectable } flag. <p>This function is provided for convenience, allowing individual toggling of the selected state of an item. However, a more common way of selecting items is to call {@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) QGraphicsScene::setSelectionArea()}, which will call this function for all visible, enabled, and selectable items within a specified area on the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isSelected() isSelected()}, and {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() QGraphicsScene::selectedItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelected(boolean selected)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelected_boolean(nativeId(), selected);
    }
    @QtBlockedSlot
    native void __qt_setSelected_boolean(long __this__nativeId, boolean selected);


/**
If <tt>enabled</tt> is true, auto repeat of the shortcut with the given <tt>id</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutAutoRepeat(int) QWidget::setShortcutAutoRepeat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutAutoRepeat(int id) {
        setShortcutAutoRepeat(id, (boolean)true);
    }
/**
If <tt>enabled</tt> is true, auto repeat of the shortcut with the given <tt>id</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutAutoRepeat(int) QWidget::setShortcutAutoRepeat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutAutoRepeat(int id, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcutAutoRepeat_int_boolean(nativeId(), id, enabled);
    }
    @QtBlockedSlot
    native void __qt_setShortcutAutoRepeat_int_boolean(long __this__nativeId, int id, boolean enabled);


/**
If <tt>enabled</tt> is true, the shortcut with the given <tt>id</tt> is enabled; otherwise the shortcut is disabled. <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system enables/disables shortcuts automatically as widgets become hidden/visible and gain or lose focus. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutEnabled(int) QWidget::setShortcutEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutEnabled(int id) {
        setShortcutEnabled(id, (boolean)true);
    }
/**
If <tt>enabled</tt> is true, the shortcut with the given <tt>id</tt> is enabled; otherwise the shortcut is disabled. <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system enables/disables shortcuts automatically as widgets become hidden/visible and gain or lose focus. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, {@link com.trolltech.qt.gui.QGraphicsWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutEnabled(int) QWidget::setShortcutEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutEnabled(int id, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcutEnabled_int_boolean(nativeId(), id, enabled);
    }
    @QtBlockedSlot
    native void __qt_setShortcutEnabled_int_boolean(long __this__nativeId, int id, boolean enabled);

/**
This is an overloaded member function, provided for convenience. <p>This function is equivalent to calling setSizePolicy({@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}(<tt>hPolicy</tt>, <tt>vPolicy</tt>, <tt>controlType</tt>)). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy hPolicy, com.trolltech.qt.gui.QSizePolicy.Policy vPolicy, com.trolltech.qt.gui.QSizePolicy.ControlType controlType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_Policy_Policy_ControlType(nativeId(), hPolicy.value(), vPolicy.value(), controlType.value());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_Policy_Policy_ControlType(long __this__nativeId, int hPolicy, int vPolicy, int controlType);

/**
Sets the size policy to <tt>policy</tt>. The size policy describes how the item should grow horizontally and vertically when arranged in a layout. <p>{@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}'s default size policy is ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Fixed }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }), but it is common for subclasses to change the default. For example, QGraphicsWidget defaults to ({@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Preferred }, {@link com.trolltech.qt.gui.QSizePolicy.ControlType QSizePolicy::DefaultType }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizePolicy() sizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_QSizePolicy(nativeId(), policy == null ? 0 : policy.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_QSizePolicy(long __this__nativeId, long policy);

/**
Sets the widget's style to <tt>style</tt>. QGraphicsWidget does not take ownership of <tt>style</tt>. <p>If no style is assigned, or <tt>style</tt> is 0, the widget will use {@link com.trolltech.qt.gui.QGraphicsScene#style() QGraphicsScene::style()} (if this has been set). Otherwise the widget will use {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()}. <p>This function sets the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetStyle } attribute if <tt>style</tt> is not 0; otherwise it clears the attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#style() style()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.gui.QStyle style)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcStyle = style;
        }
        __qt_setStyle_QStyle(nativeId(), style == null ? 0 : style.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setStyle_QStyle(long __this__nativeId, long style);

/**
Sets the item's tool tip to <tt>toolTip</tt>. If <tt>toolTip</tt> is empty, the item's tool tip is cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#toolTip() toolTip()}, and {@link com.trolltech.qt.gui.QToolTip QToolTip}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolTip(java.lang.String toolTip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), toolTip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String toolTip);

/**
Sets the item's current transformation matrix to <tt>matrix</tt>. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current matrix; otherwise, <tt>matrix</tt>replaces the current matrix. <tt>combine</tt> is false by default. <p>To simplify interation with items using a transformed view, {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} provides mapTo... and mapFrom... functions that can translate between items' and the scene's coordinates. For example, you can call {@link com.trolltech.qt.gui.QGraphicsItem#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} to map an item coordiate to a scene coordinate, or {@link com.trolltech.qt.gui.QGraphicsItem#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} to map from scene coordinates to item coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsItem#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsItem#shear(double, double) shear()}, {@link com.trolltech.qt.gui.QGraphicsItem#translate(double, double) translate()}, and {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTransform(com.trolltech.qt.gui.QTransform matrix, boolean combine)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTransform_QTransform_boolean(nativeId(), matrix == null ? 0 : matrix.nativeId(), combine);
    }
    @QtBlockedSlot
    native void __qt_setTransform_QTransform_boolean(long __this__nativeId, long matrix, boolean combine);

/**
If <tt>visible</tt> is true, the item is made visible. Otherwise, the item is made invisible. Invisible items are not painted, nor do they receive any events. In particular, mouse events pass right through invisible items, and are delivered to any item that may be behind. Invisible items are also unselectable, they cannot take input focus, and are not detected by {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}'s item location functions. <p>If an item becomes invisible while grabbing the mouse, (i.e., while it is receiving mouse events,) it will automatically lose the mouse grab, and the grab is not regained by making the item visible again; it must receive a new mouse press to regain the mouse grab. <p>Similarly, an invisible item cannot have focus, so if the item has focus when it becomes invisible, it will lose focus, and the focus is not regained by simply making the item visible again. <p>If you hide a parent item, all its children will also be hidden. If you show a parent item, all children will be shown, unless they have been explicitly hidden (i.e., if you call setVisible(false) on a child, it will not be reshown even if its parent is hidden, and then shown again). <p>Items are visible by default; it is unnecessary to call {@link com.trolltech.qt.gui.QGraphicsItem#setVisible(boolean) setVisible()} on a new item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isVisible() isVisible()}, {@link com.trolltech.qt.gui.QGraphicsItem#show() show()}, and {@link com.trolltech.qt.gui.QGraphicsItem#hide() hide()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);


/**

*/

    @QtBlockedSlot
    public final void setWindowFlags(com.trolltech.qt.core.Qt.WindowType ... wFlags) {
        this.setWindowFlags(new com.trolltech.qt.core.Qt.WindowFlags(wFlags));
    }
/**
This property holds the widget's window flags. Window flags are a combination of a window type (e.g., {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }) and several flags giving hints on the behavior of the window. The behavior is platform-dependent. <p>By default, this property contains no window flags.
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowFlags")
    @QtBlockedSlot
    public final void setWindowFlags(com.trolltech.qt.core.Qt.WindowFlags wFlags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowFlags_WindowFlags(nativeId(), wFlags.value());
    }
    @QtBlockedSlot
    native void __qt_setWindowFlags_WindowFlags(long __this__nativeId, int wFlags);

/**
Sets the widget's window frame margins to <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt>. The default frame margins are provided by the style, and they depend on the current window flags. <p>If you would like to draw your own window decoration, you can set your own frame margins to override the default margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#unsetWindowFrameMargins() unsetWindowFrameMargins()}, {@link com.trolltech.qt.gui.QGraphicsWidget#getWindowFrameMargins() getWindowFrameMargins()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameRect() windowFrameRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWindowFrameMargins(double left, double top, double right, double bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowFrameMargins_double_double_double_double(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setWindowFrameMargins_double_double_double_double(long __this__nativeId, double left, double top, double right, double bottom);

/**
This property holds This property holds the window title (caption).  This property is only used for windows. <p>By default, if no title has been set, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowTitle")
    @QtBlockedSlot
    public final void setWindowTitle(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setWindowTitle_String(long __this__nativeId, java.lang.String title);

/**
Sets the Z-value, or the elevation, of the item, to <tt>z</tt>. The elevation decides the stacking order of sibling (neighboring) items. An item of high Z-value will be drawn on top of an item with a lower Z-value if they share the same parent item. In addition, children of an item will always be drawn on top of the parent, regardless of the child's Z-value. Sibling items that share the same Z-value will be drawn in an undefined order, although the order will stay the same for as long as the items live. <br><center><img src="../images/graphicsview-zorder.png"></center><br> Children of different parents are stacked according to the Z-value of each item's ancestor item which is an immediate child of the two items' closest common ancestor. For example, a robot item might define a torso item as the parent of a head item, two arm items, and two upper-leg items. The upper-leg items would each be parents of one lower-leg item, and each lower-leg item would be parents of one foot item. The stacking order of the feet is the same as the stacking order of each foot's ancestor that is an immediate child of the two feet's common ancestor (i.e., the torso item); so the feet are stacked in the same order as the upper-leg items, regardless of each foot's Z-value. <p>The Z-value does not affect the item's size in any way. <p>The default Z-value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#zValue() zValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setZValue(double z)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setZValue_double(nativeId(), z);
    }
    @QtBlockedSlot
    native void __qt_setZValue_double(long __this__nativeId, double z);

/**
Shears the current item transformation by (<tt>sh</tt>, <tt>sv</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsItem#scale(double, double) scale()}, and {@link com.trolltech.qt.gui.QGraphicsItem#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void shear(double sh, double sv)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_shear_double_double(nativeId(), sh, sv);
    }
    @QtBlockedSlot
    native void __qt_shear_double_double(long __this__nativeId, double sh, double sv);

/**
Shows the item. (Items are visible by default.) <p>This convenience function is equivalent to calling <tt>setVisible(true)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#hide() hide()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setVisible(boolean) setVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void show()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_show(nativeId());
    }
    @QtBlockedSlot
    native void __qt_show(long __this__nativeId);

/**
This property holds the size of the widget. Calling {@link com.trolltech.qt.gui.QGraphicsWidget#resize(com.trolltech.qt.core.QSizeF) resize()} resizes the widget to a <tt>size</tt> bounded by {@link com.trolltech.qt.gui.QGraphicsLayoutItem#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QGraphicsLayoutItem#maximumSize() maximumSize()}. This property only affects the widget's width and height (e.g., its right and bottom edges); the widget's position and top-left corner remains unaffected. <p>Resizing a widget triggers the widget to immediately receive a {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneResize } event with the widget's old and new size. If the widget has a layout assigned when this event arrives, the layout will be activated and it will automatically update any child widgets's geometry. <p>This property does not affect any layout of the parent widget. If the widget itself is managed by a parent layout; e.g., it has a parent widget with a layout assigned, that layout will not activate. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}, {@link com.trolltech.qt.gui.QGraphicsSceneResizeEvent QGraphicsSceneResizeEvent}, and {@link com.trolltech.qt.gui.QGraphicsLayout QGraphicsLayout}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="size")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF size()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_size(long __this__nativeId);

/**
Returns the current size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy, com.trolltech.qt.gui.QSizePolicy.Policy) setSizePolicy()}, and {@link QWidget#sizePolicy() QWidget::sizePolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy sizePolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizePolicy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSizePolicy __qt_sizePolicy(long __this__nativeId);

/**
Returns a pointer to the widget's style. If this widget does not have any explicitly assigned style, the scene's style is returned instead. In turn, if the scene does not have any assigned style, this function returns {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyle style()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_style(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyle __qt_style(long __this__nativeId);

/**
Returns true if <tt>attribute</tt> is enabled for this widget; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute attribute)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testAttribute_WidgetAttribute(nativeId(), attribute.value());
    }
    @QtBlockedSlot
    native boolean __qt_testAttribute_WidgetAttribute(long __this__nativeId, int attribute);

/**
Returns the item's tool tip, or an empty QString if no tool tip has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setToolTip(java.lang.String) setToolTip()}, and {@link com.trolltech.qt.gui.QToolTip QToolTip}. <br></DD></DT>
*/

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
Returns this item's top-level item. The top-level item is the item's topmost ancestor item whose parent is 0. If an item has no parent, its own pointer is returned (i.e., a top-level item is its own top-level item). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#parentItem() parentItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface topLevelItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_topLevelItem(long __this__nativeId);

/**
Returns a pointer to the item's top level widget (i.e., the item's ancestor whose parent is 0, or whose parent is not a widget), or 0 if this item does not have a top level widget. If the item is its own top level widget, this function returns a pointer to the item itself.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsWidget topLevelWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsWidget __qt_topLevelWidget(long __this__nativeId);

/**
Returns this item's transformation matrix. If no matrix has been set, the identity matrix is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneTransform() sceneTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform transform()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_transform(long __this__nativeId);

/**
Translates the current item transformation by (<tt>dx</tt>, <tt>dy</tt>). <p>If all you want is to move an item, you should call {@link com.trolltech.qt.gui.QGraphicsItem#moveBy(double, double) moveBy()} or {@link com.trolltech.qt.gui.QGraphicsItem#setPos(com.trolltech.qt.core.QPointF) setPos()} instead; this function changes the item's translation, which is conceptually separate from its position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsItem#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsItem#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsItem#scale(double, double) scale()}, and {@link com.trolltech.qt.gui.QGraphicsItem#shear(double, double) shear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void translate(double dx, double dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_translate_double_double(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_translate_double_double(long __this__nativeId, double dx, double dy);

/**
Releases the keyboard grab. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()}, and {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ungrabKeyboard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ungrabKeyboard(nativeId());
    }
    @QtBlockedSlot
    native void __qt_ungrabKeyboard(long __this__nativeId);

/**
Releases the mouse grab. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ungrabMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ungrabMouse(nativeId());
    }
    @QtBlockedSlot
    native void __qt_ungrabMouse(long __this__nativeId);

/**
Clears the cursor from this item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#hasCursor() hasCursor()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setCursor(com.trolltech.qt.gui.QCursor) setCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void unsetCursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetCursor(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetCursor(long __this__nativeId);

/**
This property holds the layout direction for this widget.  This property modifies this widget's and all of its descendants' {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_RightToLeft } attribute. It also sets this widget's {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_SetLayoutDirection } attribute. <p>The widget's layout direction determines the order in which the layout manager horizontally arranges subwidgets of this widget. The default value depends on the language and locale of the application, and is typically in the same direction as words are read and written. With {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, the layout starts placing subwidgets from the left side of this widget towards the right. {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::RightToLeft } does the opposite - the layout will place widgets starting from the right edge moving towards the left. <p>Subwidgets inherit their layout direction from the parent. Top-level widget items inherit their layout direction from QGraphicsScene::layoutDirection. If you change a widget's layout direction by calling {@link com.trolltech.qt.gui.QGraphicsWidget#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) setLayoutDirection()}, the widget will send itself a {@link com.trolltech.qt.core.QEvent.Type LayoutDirectionChange } event, and then propagate the new layout direction to all its descendants. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}, and {@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="layoutDirection")
    @QtBlockedSlot
    public final void unsetLayoutDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetLayoutDirection(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetLayoutDirection(long __this__nativeId);

/**
Resets the window frame margins to the default value, provided by the style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#setWindowFrameMargins(double, double, double, double) setWindowFrameMargins()}, {@link com.trolltech.qt.gui.QGraphicsWidget#getWindowFrameMargins() getWindowFrameMargins()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameRect() windowFrameRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void unsetWindowFrameMargins()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetWindowFrameMargins(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetWindowFrameMargins(long __this__nativeId);

/**
Schedules a redraw of the area covered by <tt>rect</tt> in this item. You can call this function whenever your item needs to be redrawn, such as if it changes appearance or size. <p>This function does not cause an immediate paint; instead it schedules a paint request that is processed by {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} after control reaches the event loop. The item will only be redrawn if it is visible in any associated view. <p>As a side effect of the item being repainted, other items that overlap the area <tt>rect</tt> may also be repainted. <p>If the item is invisible (i.e., {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() isVisible()} returns false), this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()}, and {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void update(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_update_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling update({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>width</tt>, <tt>height</tt>)).
*/

    @QtBlockedSlot
    public final void update(double x, double y, double width, double height)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_double_double_double_double(nativeId(), x, y, width, height);
    }
    @QtBlockedSlot
    native void __qt_update_double_double_double_double(long __this__nativeId, double x, double y, double width, double height);

/**
Returns the item's window, or 0 if this item does not have a window. If the item is a window, it will return itself. Otherwise it will return the closest ancestor that is a window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isWindow() QGraphicsWidget::isWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsWidget window()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_window(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsWidget __qt_window(long __this__nativeId);

/**
This property holds the widget's window flags. Window flags are a combination of a window type (e.g., {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }) and several flags giving hints on the behavior of the window. The behavior is platform-dependent. <p>By default, this property contains no window flags.
*/

    @com.trolltech.qt.QtPropertyReader(name="windowFlags")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowFlags windowFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.WindowFlags(__qt_windowFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowFlags(long __this__nativeId);

/**
Returns the widget's geometry in parent coordinates including any window frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameRect() windowFrameRect()}, {@link com.trolltech.qt.gui.QGraphicsWidget#getWindowFrameMargins() getWindowFrameMargins()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#setWindowFrameMargins(double, double, double, double) setWindowFrameMargins()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF windowFrameGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowFrameGeometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_windowFrameGeometry(long __this__nativeId);

/**
Returns the widget's local rect including any window frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameGeometry() windowFrameGeometry()}, {@link com.trolltech.qt.gui.QGraphicsWidget#getWindowFrameMargins() getWindowFrameMargins()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#setWindowFrameMargins(double, double, double, double) setWindowFrameMargins()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF windowFrameRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowFrameRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_windowFrameRect(long __this__nativeId);

/**
This property holds This property holds the window title (caption).  This property is only used for windows. <p>By default, if no title has been set, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="windowTitle")
    @QtBlockedSlot
    public final java.lang.String windowTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowTitle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_windowTitle(long __this__nativeId);

/**
Returns the widgets window type.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowType windowType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.WindowType.resolve(__qt_windowType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowType(long __this__nativeId);

/**
This convenience function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsItem#pos() pos()}.{@link com.trolltech.qt.gui.QGraphicsItem#x() x()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#y() y()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double x()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x(long __this__nativeId);

/**
This convenience function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsItem#pos() pos()}.{@link com.trolltech.qt.gui.QGraphicsItem#y() y()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#x() x()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double y()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y(long __this__nativeId);

/**
Returns the Z-value, or the elevation, of the item. The Z-value decides the stacking order of sibling (neighboring) items. <p>The default Z-value is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setZValue(double) setZValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double zValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_zValue(nativeId());
    }
    @QtBlockedSlot
    native double __qt_zValue(long __this__nativeId);

/**
This virtual function is called twice for all items by the {@link com.trolltech.qt.gui.QGraphicsScene#advance() QGraphicsScene::advance()} slot. In the first phase, all items are called with <tt>phase</tt> == 0, indicating that items on the scene are about to advance, and then all items are called with <tt>phase</tt> == 1. Reimplement this function to update your item if you need simple scene-controlled animation. <p>The default implementation does nothing. <p>For individual item animation, an alternative to this function is to either use {@link com.trolltech.qt.gui.QGraphicsItemAnimation QGraphicsItemAnimation}, or to multiple-inherit from {@link com.trolltech.qt.core.QObject QObject} and {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and animate your item using {@link com.trolltech.qt.core.QObject#startTimer(int) QObject::startTimer()} and {@link com.trolltech.qt.core.QObject#timerEvent(com.trolltech.qt.core.QTimerEvent) QObject::timerEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation QGraphicsItemAnimation}, and {@link com.trolltech.qt.core.QTimeLine QTimeLine}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void advance(int phase)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_advance_int(nativeId(), phase);
    }
    @QtBlockedSlot
    native void __qt_advance_int(long __this__nativeId, int phase);

/**
This pure virtual function defines the outer bounds of the item as a rectangle; all painting must be restricted to inside an item's bounding rect. {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} uses this to determine whether the item requires redrawing. <p>Although the item's shape can be arbitrary, the bounding rect is always rectangular, and it is unaffected by the items' transformation ({@link com.trolltech.qt.gui.QGraphicsItem#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsItem#rotate(double) rotate()}, etc.). <p>If you want to change the item's bounding rectangle, you must first call {@link com.trolltech.qt.gui.QGraphicsItem#prepareGeometryChange() prepareGeometryChange()}. This notifies the scene of the imminent change, so that its can update its item geometry index; otherwise, the scene will be unaware of the item's new geometry, and the results are undefined (typically, rendering artifacts are left around in the view). <p>Reimplement this function to let {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} determine what parts of the widget, if any, need to be redrawn. <p>Note: For shapes that paint an outline / stroke, it is important to include half the pen width in the bounding rect. It is not necessary to compensate for antialiasing, though. <p>Example: <pre class="snippet">
    public class CircleItem extends QGraphicsItem
    {
        // ...
        public QRectF boundingRect() {
            double penWidth = 1;
            return new QRectF(-radius - penWidth / 2, -radius - penWidth / 2,
                          diameter + penWidth, diameter + penWidth);
        }
      // ...
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRegion(com.trolltech.qt.gui.QTransform) boundingRegion()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}, {@link <a href="../graphicsview.html">The Graphics View Coordinate System</a>}, and {@link com.trolltech.qt.gui.QGraphicsItem#prepareGeometryChange() prepareGeometryChange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF boundingRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect(long __this__nativeId);

/**
This event handler can be reimplemented to handle state changes. <p>The state being changed in this event can be retrieved through <tt>event</tt>. <p>Change events include: {@link com.trolltech.qt.core.QEvent.Type QEvent::ActivationChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::EnabledChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::FontChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::StyleChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::PaletteChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ParentChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::LayoutDirectionChange }, and {@link com.trolltech.qt.core.QEvent.Type QEvent::ContentsRectChange }.
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
This event handler, for <tt>event</tt>, can be reimplemented in a subclass to receive widget close events. The default implementation accepts the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#close() close()}, and {@link com.trolltech.qt.gui.QCloseEvent QCloseEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long event);

/**
Returns true if this item collides with <tt>other</tt>; otherwise returns false. The ways items collide is determined by <tt>mode</tt>. The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; <tt>other</tt> collides with this item if it either intersects, contains, or is contained by this item's shape. <p>The default implementation is based on shape intersection, and it calls {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()} on both items. Because the complexity of arbitrary shape-shape intersection grows with an order of magnitude when the shapes are complex, this operation can be noticably time consuming. You have the option of reimplementing this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} to provide a custom algorithm. This allows you to make use of natural constraints in the shapes of your own items, in order to improve the performance of the collision detection. For instance, two untransformed perfectly circular items' collision can be determined very efficiently by comparing their positions and radii. <p>Keep in mind that when reimplementing this function and calling {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()} or {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} on <tt>other</tt>, the returned coordinates must be mapped to this item's coordinate system before any intersection can take place. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}, and {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface other, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_collidesWithItem_QGraphicsItem_ItemSelectionMode(nativeId(), other == null ? 0 : other.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_collidesWithItem_QGraphicsItem_ItemSelectionMode(long __this__nativeId, long other, int mode);

/**
Returns true if this item collides with <tt>path</tt>. <p>The collision is determined by <tt>mode</tt>. The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; <tt>path</tt> collides with this item if it either intersects, contains, or is contained by this item's shape. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface) collidesWithItem()}, {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}, and {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean collidesWithPath(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_collidesWithPath_QPainterPath_ItemSelectionMode(nativeId(), path == null ? 0 : path.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_collidesWithPath_QPainterPath_ItemSelectionMode(long __this__nativeId, long path, int mode);

/**
Returns true if this item contains <tt>point</tt>, which is in local coordinates; otherwise, false is returned. It is most often called from {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} to determine what item is under the cursor, and for that reason, the implementation of this function should be as light-weight as possible. <p>By default, this function calls {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, but you can reimplement it in a subclass to provide a (perhaps more efficient) implementation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, and {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithPath(com.trolltech.qt.gui.QPainterPath) collidesWithPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean contains(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPointF(long __this__nativeId, long point);

/**
This event handler can be reimplemented in a subclass to process context menu events. The <tt>event</tt> parameter contains details about the event to be handled. <p>If you ignore the event, (i.e., by calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()},) <tt>event</tt> will propagate to any item beneath this item. If no items accept the event, it will be ignored by the scene, and propagate to the view. <p>It's common to open a {@link com.trolltech.qt.gui.QMenu QMenu} in response to receiving a context menu event. Example: <pre class="snippet">
        public class CutsomItem extends QGraphicsItem
        {
            // ...
            public void contextMenuEvent(QGraphicsSceneContextMenuEvent event) {
                QMenu menu = new QMenu();
                QAction emoveAction = menu.addAction("Remove");
                QAction arkAction = menu.addAction("Mark");
                QAction electedAction = menu.exec(event.screenPos());
                // ...
            }
            // ...
        }
</pre> The default implementation ignores the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive drag enter events for this item. Drag enter events are generated as the cursor enters the item's area. <p>By accepting the event, (i.e., by calling {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()},) the item will accept drop events, in addition to receiving drag move and drag leave. Otherwise, the event will be ignored and propagate to the item beneath. If the event is accepted, the item will receive a drag move event before control goes back to the event loop. <p>A common implementation of dragEnterEvent accepts or ignores <tt>event</tt> depending on the associated mime data in <tt>event</tt>. Example: <pre class="snippet">
        public class CutsomItem extends QGraphicsItem
        {
            public CutsomItem()
            {
                setAcceptDrops(true);
                // ...
            }

            public void dragEnterEvent(QGraphicsSceneDragDropEvent event)
            {
                event.setAccepted(event.mimeData().hasFormat("text/plain"));
            }
            // ...
        }
</pre> Items do not receive drag and drop events by default; to enable this feature, call <tt>setAcceptDrops(true)</tt>. <p>The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive drag leave events for this item. Drag leave events are generated as the cursor leaves the item's area. Most often you will not need to reimplement this function, but it can be useful for resetting state in your item (e.g., highlighting). <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p>Items do not receive drag and drop events by default; to enable this feature, call <tt>setAcceptDrops(true)</tt>. <p>The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive drag move events for this item. Drag move events are generated as the cursor moves around inside the item's area. Most often you will not need to reimplement this function; it is used to indicate that only parts of the item can accept drops. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> toggles whether or not the item will accept drops at the position from the event. By default, <tt>event</tt> is accepted, indicating that the item allows drops at the specified position. <p>Items do not receive drag and drop events by default; to enable this feature, call <tt>setAcceptDrops(true)</tt>. <p>The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive drop events for this item. Items can only receive drop events if the last drag move event was accepted. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p>Items do not receive drag and drop events by default; to enable this feature, call <tt>setAcceptDrops(true)</tt>. <p>The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}. <br></DD></DT>
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
    public java.lang.Object extension(java.lang.Object variant)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_extension_Object(nativeId(), variant);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_extension_Object(long __this__nativeId, java.lang.Object variant);

/**
This event handler, for event <tt>event</tt>, can be reimplemented to receive focus in events for this item. The default implementation calls {@link com.trolltech.qt.gui.QGraphicsItem#ensureVisible(com.trolltech.qt.core.QRectF, int) ensureVisible()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
Finds a new widget to give the keyboard focus to, as appropriate for Tab and Shift+Tab, and returns true if it can find a new widget; returns false otherwise. If <tt>next</tt> is true, this function searches forward; if <tt>next</tt> is false, it searches backward. <p>Sometimes, you will want to reimplement this function to provide special focus handling for your widget and its subwidgets. For example, a web browser might reimplement it to move its current active link forward or backward, and call the base implementation only when it reaches the last or first link on the page. <p>Child widgets call {@link com.trolltech.qt.gui.QGraphicsWidget#focusNextPrevChild(boolean) focusNextPrevChild()} on their parent widgets, but only the window that contains the child widgets decides where to redirect focus. By reimplementing this function for an object, you gain control of focus traversal for all child widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#focusPolicy() focusPolicy()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive focus out events for this item. The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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

    @QtBlockedSlot
    private void getContentsMargins(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom);

/**
This event handler, for <tt>event</tt>, can be reimplemented in a subclass to receive notifications for Qt.:GrabKeyboard events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()}, and {@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void grabKeyboardEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabKeyboardEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabKeyboardEvent_QEvent(long __this__nativeId, long event);

/**
This event handler, for <tt>event</tt>, can be reimplemented in a subclass to receive notifications for Qt.:GrabMouse events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QGraphicsItem#grabKeyboard() grabKeyboard()}. <br></DD></DT>
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
This event handler, for {@link com.trolltech.qt.core.QEvent.Type Hide } events, is delivered after the widget has been hidden, for example, setVisible(false) has been called for the widget or one of its ancestors when the widget was previously shown. <p>You can reimplement this event handler to detect when your widget is hidden. Calling {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} or {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()}, {@link com.trolltech.qt.gui.QWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) QWidget::hideEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange ItemVisibleChange }. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive hover enter events for this item. The default implementation calls {@link com.trolltech.qt.gui.QGraphicsItem#update() update()}; otherwise it does nothing. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#hoverMoveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverLeaveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptHoverEvents(boolean) setAcceptHoverEvents()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive hover leave events for this item. The default implementation calls {@link com.trolltech.qt.gui.QGraphicsItem#update() update()}; otherwise it does nothing. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#hoverEnterEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverMoveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptHoverEvents(boolean) setAcceptHoverEvents()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive hover move events for this item. The default implementation does nothing. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#hoverEnterEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverLeaveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptHoverEvents(boolean) setAcceptHoverEvents()}. <br></DD></DT>
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
Populates a style option object for this widget based on its current state, and stores the output in <tt>option</tt>. The default implementation populates <tt>option</tt> with the following properties. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Style Option Property</center></th><th><center> Value</center></th></tr></thead><tr valign="top" class="even"><td> state & {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_Enabled }</td><td> Corresponds to {@link com.trolltech.qt.gui.QGraphicsItem#isEnabled() QGraphicsItem::isEnabled()}.</td></tr><tr valign="top" class="odd"><td> state & {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_HasFocus }</td><td> Corresponds to {@link com.trolltech.qt.gui.QGraphicsItem#hasFocus() QGraphicsItem::hasFocus()}.</td></tr><tr valign="top" class="even"><td> state & {@link com.trolltech.qt.gui.QStyle.StateFlag QStyle::State_MouseOver }</td><td> Corresponds to {@link com.trolltech.qt.gui.QGraphicsItem#isUnderMouse() QGraphicsItem::isUnderMouse()}.</td></tr><tr valign="top" class="odd"><td> direction</td><td> Corresponds to {@link QGraphicsWidget#layoutDirection() QGraphicsWidget::layoutDirection()}.</td></tr><tr valign="top" class="even"><td> rect</td><td> Corresponds to {@link com.trolltech.qt.gui.QGraphicsWidget#rect() QGraphicsWidget::rect()}.toRect().</td></tr><tr valign="top" class="odd"><td> palette</td><td> Corresponds to {@link QGraphicsWidget#palette() QGraphicsWidget::palette()}.</td></tr><tr valign="top" class="even"><td> fontMetrics</td><td> Corresponds to {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}({@link QGraphicsWidget#font() QGraphicsWidget::font()}).</td></tr></table> Subclasses of QGraphicsWidget should call the base implementation, and then test the type of <tt>option</tt> using qstyleoption_cast&lt;&gt;() or test {@link com.trolltech.qt.gui.QStyleOption.StyleOptionType QStyleOption::Type } before storing widget-specific options. <p>For example: <pre class="snippet">
        &#64;Override
        protected void initStyleOption(QStyleOption option) {
            super.initStyleOption(option);
            if (option instanceof QStyleOptionGroupBox) {
                QStyleOptionGroupBox box = (QStyleOptionGroupBox)option;
                // Add group box specific state.
                box.setLineWidth(lineWidth());
                // ...
            }
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) QStyleOption::initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void initStyleOption(com.trolltech.qt.gui.QStyleOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QStyleOption option);

/**
This event handler, for event <tt>event</tt>, can be reimplemented to receive input method events for this item. The default implementation ignores the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery) inputMethodQuery()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long event);

/**
This method is only relevant for input items. It is used by the input method to query a set of properties of the item to be able to support complex input method operations, such as support for surrounding text and reconversions. <tt>query</tt> specifies which property is queried. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent) inputMethodEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery query)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), query.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int query);

/**
Returns true if this item's bounding rect is completely obscured by the opaque shape of <tt>item</tt>. <p>The base implementation maps <tt>item</tt>'s {@link com.trolltech.qt.gui.QGraphicsItem#opaqueArea() opaqueArea()} to this item's coordinate system, and then checks if this item's {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} is fully contained within the mapped shape. <p>You can reimplement this function to provide a custom algorithm for determining whether this item is obscured by <tt>item</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#opaqueArea() opaqueArea()}, and {@link com.trolltech.qt.gui.QGraphicsItem#isObscured() isObscured()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isObscuredBy_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isObscuredBy_QGraphicsItem(long __this__nativeId, long item);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} to notify custom items that some part of the item's state changes. By reimplementing this function, your can react to a change, and in some cases, (depending on <tt>change</tt>,) adjustments can be made. <p><tt>change</tt> is the parameter of the item that is changing. <tt>value</tt> is the new value; the type of the value depends on <tt>change</tt>. <p>Example: <pre class="snippet">
            public Object itemChange(GraphicsItemChange change, Object value)
            {
                if (change == GraphicsItemChange.ItemPositionChange && scene() != null) {
                    // value is the new position.
                    QPointF newPos = (QPointF)value;
                    QRectF rect = scene().sceneRect();
                    if (!rect.contains(newPos)) {
                        // Keep the item inside the scene rect.
                        newPos.setX(Math.min(rect.right(), Math.max(newPos.x(), rect.left())));
                        newPos.setY(Math.min(rect.bottom(), Math.max(newPos.y(), rect.top())));
                        return newPos;
                    }
                }

                return super.itemChange(change, value);
            }
</pre> The default implementation does nothing, and returns <tt>value</tt>. <p>Note: Certain {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} functions cannot be called in a reimplementation of this function; see the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange GraphicsItemChange } documentation for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange GraphicsItemChange }. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive key press events for this item. The default implementation ignores the event. If you reimplement this handler, the event will by default be accepted. <p>Note that key events are only received for items that set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag, and that have keyboard input focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#setFocus() setFocus()}, {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::setFocusItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive key release events for this item. The default implementation ignores the event. If you reimplement this handler, the event will by default be accepted. <p>Note that key events are only received for items that set the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag ItemIsFocusable } flag, and that have keyboard input focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#setFocus() setFocus()}, {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::setFocusItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive mouse doubleclick events for this item. <p>When doubleclicking an item, the item will first receive a mouse press event, followed by a release event (i.e., a click), then a doubleclick event, and finally a release event. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p>The default implementation calls {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}. If you want to keep the base implementation when reimplementing this function, call {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseDoubleClickEvent()} in your reimplementation. <p>Note that an item will not receive double click events if it is neither {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag selectable } nor {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag movable } (single mouse clicks are ignored in this case, and that stops the generation of double clicks). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseReleaseEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive mouse move events for this item. If you do receive this event, you can be certain that this item also received a mouse press event, and that this item is the current mouse grabber. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p>The default implementation handles basic item interaction, such as selection and moving. If you want to keep the base implementation when reimplementing this function, call {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseMoveEvent()} in your reimplementation. <p>Please note that {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()} decides which graphics item it is that receives mouse events. See the {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()} description for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive mouse press events for this item. Mouse press events are only delivered to items that accept the mouse button that is pressed. By default, an item accepts all mouse buttons, but you can change this by calling {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) setAcceptedMouseButtons()}. <p>The mouse press event decides which item should become the mouse grabber (see {@link com.trolltech.qt.gui.QGraphicsScene#mouseGrabberItem() QGraphicsScene::mouseGrabberItem()}). If you do not reimplement this function, the press event will propagate to any topmost item beneath this item, and no other mouse events will be delivered to this item. <p>If you do reimplement this function, <tt>event</tt> will by default be accepted (see {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()}), and this item is then the mouse grabber. This allows the item to receive future move, release and doubleclick events. If you call {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} on <tt>event</tt>, this item will lose the mouse grab, and <tt>event</tt> will propagate to any topmost item beneath. No further mouse events will be delivered to this item unless a new mouse press event is received. <p>The default implementation handles basic item interaction, such as selection and moving. If you want to keep the base implementation when reimplementing this function, call {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()} in your reimplementation. <p>The event is {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()}d for items that are neither {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag movable } nor {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag selectable }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for event <tt>event</tt>, can be reimplemented to receive mouse release events for this item. <p>Calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} or {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} on <tt>event</tt> has no effect. <p>The default implementation handles basic item interaction, such as selection and moving. If you want to keep the base implementation when reimplementing this function, call {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseReleaseEvent()} in your reimplementation. <p>Please note that {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()} decides which graphics item it is that receives mouse events. See the {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()} description for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneMove } events, is delivered after the widget has moved (e.g., its local position has changed). <p>This event is only delivered when the item is moved locally. Calling {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()} or moving any of the item's ancestors does not affect the item's local position. <p>You can reimplement this event handler to detect when your widget has moved. Calling {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} or {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange ItemPositionChange }, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange ItemPositionHasChanged }. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void moveEvent(com.trolltech.qt.gui.QGraphicsSceneMoveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveEvent_QGraphicsSceneMoveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveEvent_QGraphicsSceneMoveEvent(long __this__nativeId, long event);

/**
This virtual function returns a shape representing the area where this item is opaque. An area is opaque if it is filled using an opaque brush or color (i.e., not transparent). <p>This function is used by {@link com.trolltech.qt.gui.QGraphicsItem#isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface) isObscuredBy()}, which is called by underlying items to determine if they are obscured by this item. <p>The default implementation returns an empty {@link com.trolltech.qt.gui.QPainterPath QPainterPath}, indicating that this item is completely transparent and does not obscure any other items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface) isObscuredBy()}, {@link com.trolltech.qt.gui.QGraphicsItem#isObscured() isObscured()}, and {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPainterPath opaqueArea()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opaqueArea(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_opaqueArea(long __this__nativeId);

/**
This function, which is usually called by {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}, paints the contents of an item in local coordinates. <p>Reimplement this function in a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} subclass to provide the item's painting implementation, using <tt>painter</tt>. The <tt>option</tt> parameter provides style options for the item, such as its state, exposed area and its level-of-detail hints. The <tt>widget</tt> argument is optional. If provided, it points to the widget that is being painted on; otherwise, it is 0. For cached painting, <tt>widget</tt> is always 0. <pre class="snippet">
    public class RoundRectItem extends QGraphicsItem
    {
        // ...
        public void paint(QPainter painter,
                QStyleOptionGraphicsItem option,
                QWidget widget) {
            painter.drawRoundRect(-10, -10, 20, 20, 5, 5);
            }
        // ...
    }
</pre> The painter's pen is 0-width by default, and its pen is initialized to the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Text } brush from the paint device's palette. The brush is initialized to {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window }. <p>Make sure to constrain all painting inside the boundaries of {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} to avoid rendering artifacts (as {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} does not clip the painter for you). In particular, when {@link com.trolltech.qt.gui.QPainter QPainter} renders the outline of a shape using an assigned {@link com.trolltech.qt.gui.QPen QPen}, half of the outline will be drawn outside, and half inside, the shape you're rendering (e.g., with a pen width of 2 units, you must draw outlines 1 unit inside {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}). {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} does not support use of cosmetic pens with a non-zero width. <p>All painting is done in local coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#setCacheMode(com.trolltech.qt.gui.QGraphicsItem.CacheMode) setCacheMode()}, {@link com.trolltech.qt.gui.QPen#width() QPen::width()}, and {@link <a href="../graphicsview.html">Item Coordinates</a>}. <br></DD></DT>
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
This virtual function is called by {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} to draw the window frame for windows using <tt>painter</tt>, <tt>option</tt>, and <tt>widget</tt>, in local coordinates. The base implementation uses the current style to render the frame and title bar. <p>You can reimplement this function in a subclass of QGraphicsWidget to provide custom rendering of the widget's window frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) QGraphicsItem::paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void paintWindowFrame(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option) {
        paintWindowFrame(painter, option, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This virtual function is called by {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} to draw the window frame for windows using <tt>painter</tt>, <tt>option</tt>, and <tt>widget</tt>, in local coordinates. The base implementation uses the current style to render the frame and title bar. <p>You can reimplement this function in a subclass of QGraphicsWidget to provide custom rendering of the widget's window frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) QGraphicsItem::paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void paintWindowFrame(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintWindowFrame_QPainter_nativepointer_QWidget(nativeId(), painter == null ? 0 : painter.nativeId(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintWindowFrame_QPainter_nativepointer_QWidget(long __this__nativeId, long painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option, long widget);

/**
This event is delivered to the item by the scene at some point after it has been constructed, but before it is shown or otherwise accessed through the scene. You can use this event handler to do last-minute initializations of the widget which require the item to be fully constructed. <p>The base implementation does nothing.
*/

    @QtBlockedSlot
    protected void polishEvent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polishEvent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_polishEvent(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected java.lang.Object propertyChange(java.lang.String propertyName, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyChange_String_Object(nativeId(), propertyName, value);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_propertyChange_String_Object(long __this__nativeId, java.lang.String propertyName, java.lang.Object value);

/**
This event handler, for {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneResize } events, is delivered after the widget has been resized (i.e., its local size has changed). <tt>event</tt> contains both the old and the new size. <p>This event is only delivered when the widget is resized locally; calling {@link com.trolltech.qt.gui.QGraphicsItem#setTransform(com.trolltech.qt.gui.QTransform) setTransform()} on the widget or any of its ancestors or view, does not affect the widget's local size. <p>You can reimplement this event handler to detect when your widget has been resized. Calling {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} or {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#setGeometry(double, double, double, double) setGeometry()}. <br></DD></DT>
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
This virtual function receives events to this item. Reimplement this function to intercept events before they are dispatched to the specialized event handlers {@link com.trolltech.qt.gui.QGraphicsItem#contextMenuEvent(com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent) contextMenuEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverEnterEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverMoveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#hoverLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneHoverEvent) hoverLeaveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mouseDoubleClickEvent()}. <p>Returns true if the event was recognized and handled; otherwise, (e.g., if the event type was not recognized,) false is returned. <p><tt>event</tt> is the intercepted event.
*/

    @QtBlockedSlot
    public boolean sceneEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sceneEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_sceneEvent_QEvent(long __this__nativeId, long event);

/**
Filters events for the item <tt>watched</tt>. <tt>event</tt> is the filtered event. <p>Reimplementing this function in a subclass makes it possible for the item to be used as an event filter for other items, intercepting all the events send to those items before they are able to respond. <p>Reimplementations must return true to prevent further processing of a given event, ensuring that it will not be delivered to the watched item, or return false to indicate that the event should be propagated further by the event system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#installSceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface) installSceneEventFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean sceneEventFilter(com.trolltech.qt.gui.QGraphicsItemInterface watched, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sceneEventFilter_QGraphicsItem_QEvent(nativeId(), watched == null ? 0 : watched.nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_sceneEventFilter_QGraphicsItem_QEvent(long __this__nativeId, long watched, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setExtension(com.trolltech.qt.gui.QGraphicsItem.Extension extension, java.lang.Object variant)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExtension_Extension_Object(nativeId(), extension.value(), variant);
    }
    @QtBlockedSlot
    native void __qt_setExtension_Extension_Object(long __this__nativeId, int extension, java.lang.Object variant);

/**
This pure virtual function sets the geometry of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to <tt>rect</tt>, which is in parent coordinates (e.g., the top-left corner of <tt>rect</tt> is equivalent to the item's position in parent coordinates). <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to enable your item to receive geometry updates. <p>If <tt>rect</tt> is outside of the bounds of minimumSize and maximumSize, it will be adjusted to its closest size so that it is within the legal bounds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#geometry() geometry()}. <br></DD></DT>
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
Returns the shape of this item as a {@link com.trolltech.qt.gui.QPainterPath QPainterPath} in local coordinates. The shape is used for many things, including collision detection, hit tests, and for the {@link com.trolltech.qt.gui.QGraphicsScene#items() QGraphicsScene::items()} functions. <p>The default implementation calls {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()} to return a simple rectangular shape, but subclasses can reimplement this function to return a more accurate shape for non-rectangular items. For example, a round item may choose to return an elliptic shape for better collision detection. For example: <pre class="snippet">
    public class RoundItem extends QGraphicsItem
    {
        // ...
        public QPainterPath shape() {
            QPainterPath path = new QPainterPath();
            path.addEllipse(boundingRect());
            return path;
        }
        // ...
    }
</pre> The outline of a shape can vary depending on the width and style of the pen used when drawing. If you want to include this outline in the item's shape, you can create a shape from the stroke using {@link com.trolltech.qt.gui.QPainterPathStroker QPainterPathStroker}. <p>This function is called by the default implementations of {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()} and {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithPath(com.trolltech.qt.gui.QPainterPath) collidesWithPath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}, {@link com.trolltech.qt.gui.QGraphicsItem#prepareGeometryChange() prepareGeometryChange()}, and {@link com.trolltech.qt.gui.QPainterPathStroker QPainterPathStroker}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPainterPath shape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shape(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_shape(long __this__nativeId);

/**
This event handler, for {@link com.trolltech.qt.core.QEvent.Type Show } events, is delivered before the widget has been shown, for example, setVisible(true) has been called for the widget or one of its ancestors when the widget was previously hidden. <p>You can reimplement this event handler to detect when your widget is shown. Calling {@link com.trolltech.qt.core.QEvent#accept() QEvent::accept()} or {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()} on <tt>event</tt> has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) hideEvent()}, {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) QWidget::showEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemChange ItemVisibleChange }. <br></DD></DT>
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
This pure virtual function returns the size hint for <tt>which</tt> of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem}, using the width or height of <tt>constraint</tt> to constrain the output. <p>Reimplement this function in a subclass of {@link com.trolltech.qt.gui.QGraphicsLayoutItem QGraphicsLayoutItem} to provide the necessary size hints for your items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
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
    public boolean supportsExtension(com.trolltech.qt.gui.QGraphicsItem.Extension extension)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);

/**
Returns the type of an item as an int. All standard graphicsitem classes are associated with a unique value; see QGraphicsItem::Type. This type information is used by qgraphicsitem_cast() to distinguish between types. <p>The default implementation (in {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}) returns UserType. <p>To enable use of qgraphicsitem_cast() with a custom item, reimplement this function and declare a Type enum value equal to your custom item's type. Custom items must return a value larger than or equal to UserType (65536). <p>For example:Error parsing snippet.</pre> <p><DT><b>See also:</b><br><DD>UserType. <br></DD></DT>
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
This event handler, for <tt>event</tt>, can be reimplemented in a subclass to receive notifications for Qt.:UngrabKeyboard events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}, and {@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void ungrabKeyboardEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ungrabKeyboardEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_ungrabKeyboardEvent_QEvent(long __this__nativeId, long event);

/**
This event handler, for <tt>event</tt>, can be reimplemented in a subclass to receive notifications for Qt.:UngrabMouse events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#ungrabMouse() ungrabMouse()}, and {@link com.trolltech.qt.gui.QGraphicsItem#ungrabKeyboard() ungrabKeyboard()}. <br></DD></DT>
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
This virtual function discards any cached size hint information. You should always call this function if you change the return value of the {@link com.trolltech.qt.gui.QGraphicsLayoutItem#sizeHint(com.trolltech.qt.core.Qt.SizeHint) sizeHint()} function. Subclasses must always call the base implementation when reimplementing this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsLayoutItem#effectiveSizeHint(com.trolltech.qt.core.Qt.SizeHint) effectiveSizeHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void updateGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometry(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateGeometry(long __this__nativeId);

/**
This event handler, for event <tt>event</tt>, can be reimplemented to receive wheel events for this item. If you reimplement this function, <tt>event</tt> will be accepted by default. <p>If you ignore the event, (i.e., by calling {@link com.trolltech.qt.core.QEvent#ignore() QEvent::ignore()},) it will propagate to any item beneath this item. If no items accept the event, it will be ignored by the scene, and propagate to the view (e.g., the view's vertical scroll bar). <p>The default implementation ignores the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#sceneEvent(com.trolltech.qt.core.QEvent) sceneEvent()}. <br></DD></DT>
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
This event handler, for <tt>event</tt>, receives events for the window frame if this widget is a window. Its base implementation provides support for default window frame interaction such as moving, resizing, etc. <p>You can reimplement this handler in a subclass of QGraphicsWidget to provide your own custom window frame interaction support. <p>Returns true if <tt>event</tt> has been recognized and processed; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) event()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean windowFrameEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowFrameEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_windowFrameEvent_QEvent(long __this__nativeId, long e);

/**
Returns the window frame section at position <tt>pos</tt>, or {@link com.trolltech.qt.core.Qt.WindowFrameSection Qt::NoSection } if there is no window frame section at this position. <p>This function is used in QGraphicsWidget's base implementation for window frame interaction. <p>You can reimplement this function if you want to customize how a window can be interactively moved or resized. For instance, if you only want to allow a window to be resized by the bottom right corner, you can reimplement this function to return {@link com.trolltech.qt.core.Qt.WindowFrameSection Qt::NoSection } for all sections except {@link com.trolltech.qt.core.Qt.WindowFrameSection Qt::BottomRightSection }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameEvent(com.trolltech.qt.core.QEvent) windowFrameEvent()}, {@link com.trolltech.qt.gui.QGraphicsWidget#paintWindowFrame(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paintWindowFrame()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#windowFrameGeometry() windowFrameGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.Qt.WindowFrameSection windowFrameSectionAt(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.WindowFrameSection.resolve(__qt_windowFrameSectionAt_QPointF(nativeId(), pos == null ? 0 : pos.nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowFrameSectionAt_QPointF(long __this__nativeId, long pos);

/**
Moves the <tt>second</tt> widget around the ring of focus widgets so that keyboard focus moves from the <tt>first</tt> widget to the <tt>second</tt> widget when the Tab key is pressed. <p>Note that since the tab order of the <tt>second</tt> widget is changed, you should order a chain like this: <pre class="snippet">
        setTabOrder(a, b); // a to b
        setTabOrder(b, c); // a to b to c
        setTabOrder(c, d); // a to b to c to d
</pre> not like this: <pre class="snippet">
        // WRONG
        setTabOrder(c, d); // c to d
        setTabOrder(a, b); // a to b AND c to d
        setTabOrder(b, c); // a to b to c, but not c to d
</pre> If <tt>first</tt> is 0, this indicates that <tt>second</tt> should be the first widget to receive input focus should the scene gain Tab focus (i.e., the user hits Tab so that focus passes into the scene). If <tt>second</tt> is 0, this indicates that <tt>first</tt> should be the first widget to gain focus if the scene gained BackTab focus. <p>By default, tab order is defined implicitly using widget creation order. <p><DT><b>See also:</b><br><DD>{@link QGraphicsWidget#focusPolicy() focusPolicy}, and {@link <a href="../focus.html">Keyboard Focus</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setTabOrder(com.trolltech.qt.gui.QGraphicsWidget first, com.trolltech.qt.gui.QGraphicsWidget second)    {
        __qt_setTabOrder_QGraphicsWidget_QGraphicsWidget(first == null ? 0 : first.nativeId(), second == null ? 0 : second.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setTabOrder_QGraphicsWidget_QGraphicsWidget(long first, long second);

/**
@exclude
*/

    public static native QGraphicsWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsWidget(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QGraphicsItem(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QGraphicsLayoutItem(long ptr);

    /**
     * Gets the widget's window frame margins.
     *
     * @returns An object containing the margins in left, right, top and bottom coordinates.
     */
    @QtBlockedSlot
    public final QMarginsF getWindowFrameMargins() {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Double);

        getWindowFrameMargins(left, top, right, bottom);
        return new QMarginsF(left.doubleValue(), top.doubleValue(), right.doubleValue(), bottom.doubleValue());
    }

    @QtBlockedSlot
    public final QMarginsF getContentsMargins() {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Double);

        getContentsMargins(left, top, right, bottom);
        return new QMarginsF(left.doubleValue(), top.doubleValue(), right.doubleValue(), bottom.doubleValue());
    }

}
