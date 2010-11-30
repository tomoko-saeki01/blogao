package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsScene class provides a surface for managing a large number of 2D graphical items. The class serves as a container for QGraphicsItems. It is used together with {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} for visualizing graphical items, such as lines, rectangles, text, or even custom items, on a 2D surface. QGraphicsScene is part of {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <p>QGraphicsScene also provides functionality that lets you efficiently determine both the location of items, and for determining what items are visible within an arbitrary area on the scene. With the {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} widget, you can either visualize the whole scene, or zoom in and view only parts of the scene. <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("Hello, world!");

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
</pre> Note that QGraphicsScene has no visual appearance of its own; it only manages the items. You need to create a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} widget to visualize the scene. <p>To add items to a scene, you start off by constructing a QGraphicsScene object. Then, you have two options: either add your existing {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem} objects by calling {@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}, or you can call one of the convenience functions {@link com.trolltech.qt.gui.QGraphicsScene#addEllipse(com.trolltech.qt.core.QRectF) addEllipse()}, {@link com.trolltech.qt.gui.QGraphicsScene#addLine(com.trolltech.qt.gui.QLineF) addLine()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPath(com.trolltech.qt.gui.QPainterPath) addPath()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPolygon(com.trolltech.qt.gui.QPolygonF) addPolygon()}, {@link com.trolltech.qt.gui.QGraphicsScene#addRect(com.trolltech.qt.core.QRectF) addRect()}, or {@link com.trolltech.qt.gui.QGraphicsScene#addText(java.lang.String) addText()}, which all return a pointer to the newly added item. The dimensions of the items added with these functions are relative to the item's coordinate system, and the items position is initialized to (0, 0) in the scene. <p>You can then visualize the scene using {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. When the scene changes, (e.g., when an item moves or is transformed) QGraphicsScene emits the {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() } signal. To remove an item, call {@link com.trolltech.qt.gui.QGraphicsScene#removeItem(com.trolltech.qt.gui.QGraphicsItemInterface) removeItem()}. <p>QGraphicsScene uses an indexing algorithm to manage the location of items efficiently. By default, a BSP (Binary Space Partitioning) tree is used; an algorithm suitable for large scenes where most items remain static (i.e., do not move around). You can choose to disable this index by calling {@link com.trolltech.qt.gui.QGraphicsScene#setItemIndexMethod(com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod) setItemIndexMethod()}. For more information about the available indexing algorithms, see the {@link QGraphicsScene#itemIndexMethod() itemIndexMethod} property. <p>The scene's bounding rect is set by calling {@link com.trolltech.qt.gui.QGraphicsScene#setSceneRect(com.trolltech.qt.core.QRectF) setSceneRect()}. Items can be placed at any position on the scene, and the size of the scene is by default unlimited. The scene rect is used only for internal bookkeeping, maintaining the scene's item index. If the scene rect is unset, QGraphicsScene will use the bounding area of all items, as returned by {@link com.trolltech.qt.gui.QGraphicsScene#itemsBoundingRect() itemsBoundingRect()}, as the scene rect. However, {@link com.trolltech.qt.gui.QGraphicsScene#itemsBoundingRect() itemsBoundingRect()} is a relatively time consuming function, as it operates by collecting positional information for every item on the scene. Because of this, you should always set the scene rect when operating on large scenes. <p>One of QGraphicsScene's greatest strengths is its ability to efficiently determine the location of items. Even with millions of items on the scene, the {@link com.trolltech.qt.gui.QGraphicsScene#items() items()} functions can determine the location of an item within few milliseconds. There are several overloads to {@link com.trolltech.qt.gui.QGraphicsScene#items() items()}: one that finds items at a certain position, one that finds items inside or intersecting with a polygon or a rectangle, and more. The list of returned items is sorted by stacking order, with the topmost item being the first item in the list. For convenience, there is also an {@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()} function that returns the topmost item at a given position. <p>QGraphicsScene maintains selection information for the scene. To select items, call {@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}, and to clear the current selection, call {@link com.trolltech.qt.gui.QGraphicsScene#clearSelection() clearSelection()}. Call {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() selectedItems()} to get the list of all selected items.<a name="event-handling-and-propagation"><h2>Event Handling and Propagation</h2> Another responsibility that QGraphicsScene has, is to propagate events from {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. To send an event to a scene, you construct an event that inherits {@link com.trolltech.qt.core.QEvent QEvent}, and then send it using, for example, {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QApplication::sendEvent()}. event() is responsible for dispatching the event to the individual items. Some common events are handled by convenience event handlers. For example, key press events are handled by {@link com.trolltech.qt.gui.QGraphicsScene#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, and mouse press events are handled by {@link com.trolltech.qt.gui.QGraphicsScene#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}. <p>Key events are delivered to the focus item. To set the focus item, you can either call {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}, passing an item that accepts focus, or the item itself can call {@link com.trolltech.qt.gui.QGraphicsItem#setFocus() QGraphicsItem::setFocus()}. Call {@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()} to get the current focus item. For compatibility with widgets, the scene also maintains its own focus information. By default, the scene does not have focus, and all key events are discarded. If {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()} is called, or if an item on the scene gains focus, the scene automatically gains focus. If the scene has focus, {@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()} will return true, and key events will be forwarded to the focus item, if any. If the scene loses focus, (i.e., someone calls {@link com.trolltech.qt.gui.QGraphicsScene#clearFocus() clearFocus()},) while an item has focus, the scene will maintain its item focus information, and once the scene regains focus, it will make sure the last focus item regains focus. <p>For mouse-over effects, QGraphicsScene dispatches hover events. If an item accepts hover events (see {@link com.trolltech.qt.gui.QGraphicsItem#acceptHoverEvents() QGraphicsItem::acceptHoverEvents()}), it will receive a {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneHoverEnter } event when the mouse enters its area. As the mouse continues moving inside the item's area, QGraphicsScene will send it {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneHoverMove } events. When the mouse leaves the item's area, the item will receive a {@link com.trolltech.qt.core.QEvent.Type GraphicsSceneHoverLeave } event. <p>All mouse events are delivered to the current mouse grabber item. An item becomes the scene's mouse grabber if it accepts mouse events (see {@link com.trolltech.qt.gui.QGraphicsItem#acceptedMouseButtons() QGraphicsItem::acceptedMouseButtons()}) and it receives a mouse press. It stays the mouse grabber until it receives a mouse release when no other mouse buttons are pressed. You can call {@link com.trolltech.qt.gui.QGraphicsScene#mouseGrabberItem() mouseGrabberItem()} to determine what item is currently grabbing the mouse. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsScene extends com.trolltech.qt.core.QObject
{

    private Object __rcFocusItem = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the rendering layers in a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. When {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} draws the scene contents, it renders each of these layers separately, in order. <p>Each layer represents a flag that can be OR'ed together when calling functions such as {@link com.trolltech.qt.gui.QGraphicsScene#invalidate(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) invalidate()} or {@link com.trolltech.qt.gui.QGraphicsView#invalidateScene(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) QGraphicsView::invalidateScene()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#invalidate(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) invalidate()}, and {@link com.trolltech.qt.gui.QGraphicsView#invalidateScene(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) QGraphicsView::invalidateScene()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum SceneLayer implements com.trolltech.qt.QtEnumerator {
/**
 The item layer. {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} renders all items are in this layer by calling the virtual function {@link com.trolltech.qt.gui.QGraphicsScene#drawItems(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QGraphicsItemInterface[], com.trolltech.qt.gui.QStyleOptionGraphicsItem[]) drawItems()}. The item layer is drawn after the background layer, but before the foreground layer.
*/

        ItemLayer(1),
/**
 The background layer. {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} renders the scene's background in this layer by calling the virtual function {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}. The background layer is drawn first of all layers.
*/

        BackgroundLayer(2),
/**
 The foreground layer. {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} renders the scene's foreground in this layer by calling the virtual function {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}. The foreground layer is drawn last of all layers.
*/

        ForegroundLayer(4),
/**
 All layers; this value represents a combination of all three layers.
*/

        AllLayers(65535);

        SceneLayer(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QGraphicsScene$SceneLayers with the specified <tt>com.trolltech.qt.gui.QGraphicsScene$SceneLayer[]</tt> QGraphicsScene$SceneLayer values set.</brief>
*/

        public static SceneLayers createQFlags(SceneLayer ... values) {
            return new SceneLayers(values);
        }
/**
<brief>Returns the QGraphicsScene$SceneLayer constant with the specified <tt>int</tt>.</brief>
*/

        public static SceneLayer resolve(int value) {
            return (SceneLayer) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ItemLayer;
            case 2: return BackgroundLayer;
            case 4: return ForegroundLayer;
            case 65535: return AllLayers;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class SceneLayers extends com.trolltech.qt.QFlags<SceneLayer> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QGraphicsScene-SceneLayers with the specified <tt>com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]</tt>. flags set.</brief>
*/

        public SceneLayers(SceneLayer ... args) { super(args); }
        public SceneLayers(int value) { setValue(value); }
    }

    
/**
This enum describes the indexing algorithms {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} provides for managing positional information about items on the scene. <p><DT><b>See also:</b><br><DD>setItemIndexMethod(), and {@link QGraphicsScene#bspTreeDepth() bspTreeDepth}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ItemIndexMethod implements com.trolltech.qt.QtEnumerator {
/**
 A Binary Space Partitioning tree is applied. All {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}'s item location algorithms are of an order close to logarithmic complexity, by making use of binary search. Adding, moving and removing items is logarithmic. This approach is best for static scenes (i.e., scenes where most items do not move).
*/

        BspTreeIndex(0),
/**
 No index is applied. Item location is of linear complexity, as all items on the scene are searched. Adding, moving and removing items, however, is done in constant time. This approach is ideal for dynamic scenes, where many items are added, moved or removed continuously.
*/

        NoIndex(-1);

        ItemIndexMethod(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsScene$ItemIndexMethod constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemIndexMethod resolve(int value) {
            return (ItemIndexMethod) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return BspTreeIndex;
            case -1: return NoIndex;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<com.trolltech.qt.core.QRectF>(named: region)&gt;:<p> This signal is emitted by QGraphicsScene when control reaches the event loop, if the scene content changes. The <tt>region</tt> parameter contains a list of scene rectangles that indicate the area that has been changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#updateScene(java.util.List) QGraphicsView::updateScene()}. <br></DD></DT>
*/

    public final Signal1<java.util.List<com.trolltech.qt.core.QRectF>> changed = new Signal1<java.util.List<com.trolltech.qt.core.QRectF>>();

    private final void changed(java.util.List<com.trolltech.qt.core.QRectF> region)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changed_List(nativeId(), region);
    }
    native void __qt_changed_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QRectF> region);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRectF(named: rect)&gt;:<p> This signal is emitted by QGraphicsScene whenever the scene rect changes. The <tt>rect</tt> parameter is the new scene rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#updateSceneRect(com.trolltech.qt.core.QRectF) QGraphicsView::updateSceneRect()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QRectF> sceneRectChanged = new Signal1<com.trolltech.qt.core.QRectF>();

    private final void sceneRectChanged(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sceneRectChanged_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native void __qt_sceneRectChanged_QRectF(long __this__nativeId, long rect);
/**
 This signal is emitted by QGraphicsScene whenever the selection changes. You can call {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() selectedItems()} to get the new list of selected items. <p>The selection changes whenever an item is selected or unselected, a selection area is set, cleared or otherwise changed, if a preselected item is added to the scene, or if a selected item is removed from the scene. <p>QGraphicsScene emits this signal only once for group selection operations. For example, if you set a selection area, select or unselect a {@link com.trolltech.qt.gui.QGraphicsItemGroup QGraphicsItemGroup}, or if you add or remove from the scene a parent item that contains several selected items, {@link com.trolltech.qt.gui.QGraphicsScene#selectionChanged selectionChanged() } is emitted only once after the operation has completed (instead of once for each item). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}, {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() selectedItems()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setSelected(boolean) QGraphicsItem::setSelected()}. <br></DD></DT>
*/

    public final Signal0 selectionChanged = new Signal0();

    private final void selectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged(nativeId());
    }
    native void __qt_selectionChanged(long __this__nativeId);


/**
Constructs a QGraphicsScene object. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QGraphicsScene() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QGraphicsScene object. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QGraphicsScene(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsScene_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsScene_QObject(long parent);


/**
Constructs a QGraphicsScene object, using <tt>sceneRect</tt> for its scene rectangle. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() sceneRect}. <br></DD></DT>
*/

    public QGraphicsScene(com.trolltech.qt.core.QRectF sceneRect) {
        this(sceneRect, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QGraphicsScene object, using <tt>sceneRect</tt> for its scene rectangle. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() sceneRect}. <br></DD></DT>
*/

    public QGraphicsScene(com.trolltech.qt.core.QRectF sceneRect, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsScene_QRectF_QObject(sceneRect == null ? 0 : sceneRect.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsScene_QRectF_QObject(long sceneRect, long parent);


/**
Constructs a QGraphicsScene object, using the rectangle specified by (<tt>x</tt>, <tt>y</tt>), and the given <tt>width</tt> and <tt>height</tt> for its scene rectangle. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() sceneRect}. <br></DD></DT>
*/

    public QGraphicsScene(double x, double y, double width, double height) {
        this(x, y, width, height, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QGraphicsScene object, using the rectangle specified by (<tt>x</tt>, <tt>y</tt>), and the given <tt>width</tt> and <tt>height</tt> for its scene rectangle. The <tt>parent</tt> parameter is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() sceneRect}. <br></DD></DT>
*/

    public QGraphicsScene(double x, double y, double width, double height, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsScene_double_double_double_double_QObject(x, y, width, height, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsScene_double_double_double_double_QObject(double x, double y, double width, double height, long parent);

/**
Returns the current active window, or 0 if there is no window is currently active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setActiveWindow(com.trolltech.qt.gui.QGraphicsWidget) QGraphicsScene::setActiveWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsWidget activeWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activeWindow(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsWidget __qt_activeWindow(long __this__nativeId);

/**
Adds or moves the item <tt>item</tt> and all its childen to the scene. <p>If the item is visible (i.e., {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() QGraphicsItem::isVisible()} returns true), QGraphicsScene will emit {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() } once control goes back to the event loop. <p>If the item is already in a different scene, it will first be removed from its old scene, and then added to this scene as a top-level. <p>QGraphicsScene will send ItemSceneChange notifications to <tt>item</tt> while it is added to the scene. If item does not currently belong to a scene, only one notification is sent. If it does belong to scene already (i.e., it is moved to this scene), QGraphicsScene will send an addition notification as the item is removed from its previous scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#removeItem(com.trolltech.qt.gui.QGraphicsItemInterface) removeItem()}, {@link com.trolltech.qt.gui.QGraphicsScene#addEllipse(com.trolltech.qt.core.QRectF) addEllipse()}, {@link com.trolltech.qt.gui.QGraphicsScene#addLine(com.trolltech.qt.gui.QLineF) addLine()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPath(com.trolltech.qt.gui.QPainterPath) addPath()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addRect(com.trolltech.qt.core.QRectF) addRect()}, {@link com.trolltech.qt.gui.QGraphicsScene#addText(java.lang.String) addText()}, and {@link com.trolltech.qt.gui.QGraphicsScene#addWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addItem_QGraphicsItem(long __this__nativeId, long item);


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsProxyWidget addWidget(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.WindowType ... wFlags) {
        return this.addWidget(widget, new com.trolltech.qt.core.Qt.WindowFlags(wFlags));
    }

/**
Creates a new {@link com.trolltech.qt.gui.QGraphicsProxyWidget QGraphicsProxyWidget} for <tt>widget</tt>, adds it to the scene, and returns a pointer to the proxy. <tt>wFlags</tt> set the default window flags for the embedding proxy widget. <p>The item's position is initialized to (0, 0). <p>If the item is visible (i.e., {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() QGraphicsItem::isVisible()} returns true), QGraphicsScene will emit {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() } once control goes back to the event loop. <p>Note that widgets with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } widget attribute set and widgets that wrap an external application or controller are not supported. Examples are {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} and QAxWidget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addEllipse(com.trolltech.qt.core.QRectF) addEllipse()}, {@link com.trolltech.qt.gui.QGraphicsScene#addLine(com.trolltech.qt.gui.QLineF) addLine()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addRect(com.trolltech.qt.core.QRectF) addRect()}, {@link com.trolltech.qt.gui.QGraphicsScene#addText(java.lang.String) addText()}, {@link com.trolltech.qt.gui.QGraphicsScene#addSimpleText(java.lang.String) addSimpleText()}, and {@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsProxyWidget addWidget(com.trolltech.qt.gui.QWidget widget) {
        return addWidget(widget, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Creates a new {@link com.trolltech.qt.gui.QGraphicsProxyWidget QGraphicsProxyWidget} for <tt>widget</tt>, adds it to the scene, and returns a pointer to the proxy. <tt>wFlags</tt> set the default window flags for the embedding proxy widget. <p>The item's position is initialized to (0, 0). <p>If the item is visible (i.e., {@link com.trolltech.qt.gui.QGraphicsItem#isVisible() QGraphicsItem::isVisible()} returns true), QGraphicsScene will emit {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() } once control goes back to the event loop. <p>Note that widgets with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } widget attribute set and widgets that wrap an external application or controller are not supported. Examples are {@link com.trolltech.qt.opengl.QGLWidget QGLWidget} and QAxWidget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addEllipse(com.trolltech.qt.core.QRectF) addEllipse()}, {@link com.trolltech.qt.gui.QGraphicsScene#addLine(com.trolltech.qt.gui.QLineF) addLine()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addPixmap(com.trolltech.qt.gui.QPixmap) addPixmap()}, {@link com.trolltech.qt.gui.QGraphicsScene#addRect(com.trolltech.qt.core.QRectF) addRect()}, {@link com.trolltech.qt.gui.QGraphicsScene#addText(java.lang.String) addText()}, {@link com.trolltech.qt.gui.QGraphicsScene#addSimpleText(java.lang.String) addSimpleText()}, and {@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsProxyWidget addWidget(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.WindowFlags wFlags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (widget != null) {
            widget.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QGraphicsProxyWidget __qt_return_value = __qt_addWidget_QWidget_WindowFlags(nativeId(), widget == null ? 0 : widget.nativeId(), wFlags.value());
        if (__qt_return_value != null) {
            __qt_return_value.disableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsProxyWidget __qt_addWidget_QWidget_WindowFlags(long __this__nativeId, long widget, int wFlags);

/**
This slot advances the scene by one step, by calling {@link com.trolltech.qt.gui.QGraphicsItem#advance(int) QGraphicsItem::advance()} for all items on the scene. This is done in two phases: in the first phase, all items are notified that the scene is about to change, and in the second phase all items are notified that they can move. In the first phase, {@link com.trolltech.qt.gui.QGraphicsItem#advance(int) QGraphicsItem::advance()} is called passing a value of 0 as an argument, and 1 is passed in the second phase. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#advance(int) QGraphicsItem::advance()}, {@link com.trolltech.qt.gui.QGraphicsItemAnimation QGraphicsItemAnimation}, and {@link com.trolltech.qt.core.QTimeLine QTimeLine}. <br></DD></DT>
*/

    public final void advance()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_advance(nativeId());
    }
    native void __qt_advance(long __this__nativeId);

/**
This property holds the background brush of the scene.  Set this property to changes the scene's background to a different color, gradient or texture. The default background brush is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush }. The background is drawn before (behind) the items. <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        // a blue background
        scene.setBackgroundBrush(new QBrush(QColor.blue));

        // a gradient background
        QRadialGradient gradient = new QRadialGradient(0, 0, 10);
        gradient.setSpread(QGradient.Spread.RepeatSpread);
        scene.setBackgroundBrush(new QBrush(gradient));
</pre> {@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()} calls {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} to draw the scene background. For more detailed control over how the background is drawn, you can reimplement {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} in a subclass of QGraphicsScene.
*/

    @com.trolltech.qt.QtPropertyReader(name="backgroundBrush")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush backgroundBrush()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundBrush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_backgroundBrush(long __this__nativeId);

/**
This property holds the depth of QGraphicsScene's BSP index tree. This property has no effect when {@link com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod NoIndex } is used. <p>This value determines the depth of QGraphicsScene's BSP tree. The depth directly affects QGraphicsScene's performance and memory usage; the latter growing exponentially with the depth of the tree. With an optimal tree depth, QGraphicsScene can instantly determine the locality of items, even for scenes with thousands or millions of items. This also greatly improves rendering performance. <p>By default, the value is 0, in which case Qt will guess a reasonable default depth based on the size, location and number of items in the scene. If these parameters change frequently, however, you may experience slowdowns as QGraphicsScene retunes the depth internally. You can avoid potential slowdowns by fixating the tree depth through setting this property. <p>The depth of the tree and the size of the scene rectangle decide the granularity of the scene's partitioning. The size of each scene segment is determined by the following algorithm: <pre class="snippet">
        QSizeF segmentSize = sceneRect().size().divide(java.lang.Math.pow(2, depth - 1));
</pre> The BSP tree has an optimal size when each segment contains between 0 and 10 items. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#itemIndexMethod() itemIndexMethod}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="bspTreeDepth")
    @QtBlockedSlot
    public final int bspTreeDepth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bspTreeDepth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_bspTreeDepth(long __this__nativeId);

/**
Removes and deletes all items from the scene, but otherwise leaves the state of the scene unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}. <br></DD></DT>
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Clears focus from the scene. If any item has focus when this function is called, it will lose focus, and regain focus again once the scene regains focus. <p>A scene that does not have focus ignores key events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()}, {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}. <br></DD></DT>
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
Clears the current selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}, and {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() selectedItems()}. <br></DD></DT>
*/

    public final void clearSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearSelection(nativeId());
    }
    native void __qt_clearSelection(long __this__nativeId);


/**
Returns a list of all items that collide with <tt>item</tt>. Collisions are
determined by calling QGraphicsItem.collidesWithItem(); the collision
detection is determined by \a mode. By default, all items whose shape
intersects \a item or is contained inside \a item's shape are returned.
<p>
The items are returned in descending Z order (i.e., the first item in the
list is the top-most item, and the last item is the bottom-most item).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> collidingItems(com.trolltech.qt.gui.QGraphicsItemInterface item) {
        return collidingItems(item, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
Returns a list of all items that collide with <tt>item</tt>. Collisions are determined by calling {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsItem::collidesWithItem()}; the collision detection is determined by <tt>mode</tt>. By default, all items whose shape intersects <tt>item</tt> or is contained inside <tt>item</tt>'s shape are returned. <p>The items are returned in descending Z order (i.e., the first item in the list is the top-most item, and the last item is the bottom-most item). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#items() items()}, {@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}, and {@link com.trolltech.qt.gui.QGraphicsItem#collidesWithItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsItem::collidesWithItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> collidingItems(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_collidingItems_QGraphicsItem_ItemSelectionMode(nativeId(), item == null ? 0 : item.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_collidingItems_QGraphicsItem_ItemSelectionMode(long __this__nativeId, long item, int mode);

/**
Groups all items in <tt>items</tt> into a new {@link com.trolltech.qt.gui.QGraphicsItemGroup QGraphicsItemGroup}, and returns a pointer to the group. The group is created with the common ancestor of <tt>items</tt> as its parent, and with position (0, 0). The items are all reparented to the group, and their positions and transformations are mapped to the group. If <tt>items</tt> is empty, this function will return an empty top-level {@link com.trolltech.qt.gui.QGraphicsItemGroup QGraphicsItemGroup}. <p>QGraphicsScene has ownership of the group item; you do not need to delete it. To dismantle (ungroup) a group, call {@link com.trolltech.qt.gui.QGraphicsScene#destroyItemGroup(com.trolltech.qt.gui.QGraphicsItemGroup) destroyItemGroup()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#destroyItemGroup(com.trolltech.qt.gui.QGraphicsItemGroup) destroyItemGroup()}, and {@link com.trolltech.qt.gui.QGraphicsItemGroup#addToGroup(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsItemGroup::addToGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemGroup createItemGroup(java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createItemGroup_List(nativeId(), items);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemGroup __qt_createItemGroup_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items);

/**
Reparents all items in <tt>group</tt> to <tt>group</tt>'s parent item, then removes <tt>group</tt> from the scene, and finally deletes it. The items' positions and transformations are mapped from the group to the group's parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#createItemGroup(java.util.List) createItemGroup()}, and {@link com.trolltech.qt.gui.QGraphicsItemGroup#removeFromGroup(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsItemGroup::removeFromGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void destroyItemGroup(com.trolltech.qt.gui.QGraphicsItemGroup group)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_destroyItemGroup_QGraphicsItemGroup(nativeId(), group == null ? 0 : group.nativeId());
    }
    @QtBlockedSlot
    native void __qt_destroyItemGroup_QGraphicsItemGroup(long __this__nativeId, long group);

/**
Returns the scene's current focus item, or 0 if no item currently has focus. <p>The focus item receives keyboard input when the scene receives a key event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}, and {@link com.trolltech.qt.gui.QGraphicsItem#hasFocus() QGraphicsItem::hasFocus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface focusItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_focusItem(long __this__nativeId);

/**
Finds a new widget to give the keyboard focus to, as appropriate for Tab and Shift+Tab, and returns true if it can find a new widget, or false if it cannot. If <tt>next</tt> is true, this function searches forward; if <tt>next</tt> is false, it searches backward. <p>You can reimplement this function in a subclass of QGraphicsScene to provide fine-grained control over how tab focus passes inside your scene. The default implementation is based on the tab focus chain defined by {@link com.trolltech.qt.gui.QGraphicsWidget#setTabOrder(com.trolltech.qt.gui.QGraphicsWidget, com.trolltech.qt.gui.QGraphicsWidget) QGraphicsWidget::setTabOrder()}.
*/

    protected final boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This property holds the scene's default font. This property provides the scene's font. The scene font defaults to, and resolves all its entries from, QApplication::font. <p>If the scene's font changes, either directly through {@link com.trolltech.qt.gui.QGraphicsScene#setFont(com.trolltech.qt.gui.QFont) setFont()} or indirectly when the application font changes, QGraphicsScene first sends itself a {@link com.trolltech.qt.core.QEvent.Type FontChange } event, and it then sends {@link com.trolltech.qt.core.QEvent.Type FontChange } events to all top-level widget items in the scene. These items respond by resolving their own fonts to the scene, and they then notify their children, who again notify their children, and so on, until all widget items have updated their fonts. <p>Changing the scene font, (directly or indirectly through {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()},) automatically schedules a redraw the entire scene. <p><DT><b>See also:</b><br><DD>{@link QWidget#font() QWidget::font}, {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}, {@link QGraphicsScene#palette() palette}, and {@link com.trolltech.qt.gui.QGraphicsScene#style() style()}. <br></DD></DT>
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
This property holds the foreground brush of the scene.  Change this property to set the scene's foreground to a different color, gradient or texture. <p>The foreground is drawn after (on top of) the items. The default foreground brush is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } ( i.e. the foreground is not drawn). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        // a white semi-transparent foreground
        scene.setForegroundBrush(new QBrush(new QColor(255, 255, 255, 127)));

        // a grid foreground
        scene.setForegroundBrush(new QBrush(QColor.lightGray, Qt.BrushStyle.CrossPattern));
</pre> {@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()} calls {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} to draw the scene foreground. For more detailed control over how the foreground is drawn, you can reimplement the {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} function in a QGraphicsScene subclass.
*/

    @com.trolltech.qt.QtPropertyReader(name="foregroundBrush")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush foregroundBrush()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_foregroundBrush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_foregroundBrush(long __this__nativeId);

/**
Returns true if the scene has focus; otherwise returns false. If the scene has focus, it will will forward key events from {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent} to any item that has focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}. <br></DD></DT>
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
This convenience function is equivalent to calling <tt>sceneRect(). eight()</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double height()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native double __qt_height(long __this__nativeId);


/**

*/

    public final void invalidate(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsScene.SceneLayer ... layers) {
        this.invalidate(rect, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(layers));
    }

/**
Invalidates and schedules a redraw of the <tt>layers</tt> in <tt>rect</tt> on the scene. Any cached content in <tt>layers</tt> is unconditionally invalidated and redrawn. <p>You can use this function overload to notify QGraphicsScene of changes to the background or the foreground of the scene. This function is commonly used for scenes with tile-based backgrounds to notify changes when {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} has enabled {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheBackground }. <p>Example: <pre class="snippet">
    class TileScene extends QGraphicsScene {

    private final int tileWidth = 10;
    private final int tileHeight = 10;
    private final int numTilesH = 10;
    private final int numTilesV = 10;
    private QPixmap[][] tiles;

    TileScene() {
        tiles = new QPixmap[numTilesH][numTilesV];
    }

      public QRectF rectForTile(int x, int y)
      {
          // Return the rectangle for the tile at position (x, y).
          return new QRectF(x * tileWidth,y * tileHeight,tileWidth,tileHeight);
      }

      public void setTile(int x, int y, QPixmap pixmap)
      {
          // Sets or replaces the tile at position (x, y) with pixmap.
          if (x &gt;= 0 && x &lt; numTilesH && y &gt;= 0 && y &lt; numTilesV) {
              tiles[y][x] = pixmap;
              invalidate(rectForTile(x, y), QGraphicsScene.SceneLayer.BackgroundLayer);
          }
      }

      protected void drawBackground(QPainter painter, QRectF exposed)
      {
          // Draws all tiles that intersect the exposed area.
          for (int y = 0; y &lt; numTilesV; ++y) {
              for (int x = 0; x &lt; numTilesH; ++x) {
                  QRectF rect = rectForTile(x, y);
                  if (exposed.intersects(rect))
                      painter.drawPixmap(rect.topLeft(), tiles[y][x]);
              }
          }
      }

    }

</pre> Note that {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsScene#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#resetCachedContent() QGraphicsView::resetCachedContent()}. <br></DD></DT>
*/

    public final void invalidate(com.trolltech.qt.core.QRectF rect) {
        invalidate(rect, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(65535));
    }

/**
Invalidates and schedules a redraw of the <tt>layers</tt> in <tt>rect</tt> on the scene. Any cached content in <tt>layers</tt> is unconditionally invalidated and redrawn. <p>You can use this function overload to notify QGraphicsScene of changes to the background or the foreground of the scene. This function is commonly used for scenes with tile-based backgrounds to notify changes when {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} has enabled {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheBackground }. <p>Example: <pre class="snippet">
    class TileScene extends QGraphicsScene {

    private final int tileWidth = 10;
    private final int tileHeight = 10;
    private final int numTilesH = 10;
    private final int numTilesV = 10;
    private QPixmap[][] tiles;

    TileScene() {
        tiles = new QPixmap[numTilesH][numTilesV];
    }

      public QRectF rectForTile(int x, int y)
      {
          // Return the rectangle for the tile at position (x, y).
          return new QRectF(x * tileWidth,y * tileHeight,tileWidth,tileHeight);
      }

      public void setTile(int x, int y, QPixmap pixmap)
      {
          // Sets or replaces the tile at position (x, y) with pixmap.
          if (x &gt;= 0 && x &lt; numTilesH && y &gt;= 0 && y &lt; numTilesV) {
              tiles[y][x] = pixmap;
              invalidate(rectForTile(x, y), QGraphicsScene.SceneLayer.BackgroundLayer);
          }
      }

      protected void drawBackground(QPainter painter, QRectF exposed)
      {
          // Draws all tiles that intersect the exposed area.
          for (int y = 0; y &lt; numTilesV; ++y) {
              for (int x = 0; x &lt; numTilesH; ++x) {
                  QRectF rect = rectForTile(x, y);
                  if (exposed.intersects(rect))
                      painter.drawPixmap(rect.topLeft(), tiles[y][x]);
              }
          }
      }

    }

</pre> Note that {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsScene#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#resetCachedContent() QGraphicsView::resetCachedContent()}. <br></DD></DT>
*/

    public final void invalidate() {
        invalidate((com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(65535));
    }
/**
Invalidates and schedules a redraw of the <tt>layers</tt> in <tt>rect</tt> on the scene. Any cached content in <tt>layers</tt> is unconditionally invalidated and redrawn. <p>You can use this function overload to notify QGraphicsScene of changes to the background or the foreground of the scene. This function is commonly used for scenes with tile-based backgrounds to notify changes when {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} has enabled {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheBackground }. <p>Example: <pre class="snippet">
    class TileScene extends QGraphicsScene {

    private final int tileWidth = 10;
    private final int tileHeight = 10;
    private final int numTilesH = 10;
    private final int numTilesV = 10;
    private QPixmap[][] tiles;

    TileScene() {
        tiles = new QPixmap[numTilesH][numTilesV];
    }

      public QRectF rectForTile(int x, int y)
      {
          // Return the rectangle for the tile at position (x, y).
          return new QRectF(x * tileWidth,y * tileHeight,tileWidth,tileHeight);
      }

      public void setTile(int x, int y, QPixmap pixmap)
      {
          // Sets or replaces the tile at position (x, y) with pixmap.
          if (x &gt;= 0 && x &lt; numTilesH && y &gt;= 0 && y &lt; numTilesV) {
              tiles[y][x] = pixmap;
              invalidate(rectForTile(x, y), QGraphicsScene.SceneLayer.BackgroundLayer);
          }
      }

      protected void drawBackground(QPainter painter, QRectF exposed)
      {
          // Draws all tiles that intersect the exposed area.
          for (int y = 0; y &lt; numTilesV; ++y) {
              for (int x = 0; x &lt; numTilesH; ++x) {
                  QRectF rect = rectForTile(x, y);
                  if (exposed.intersects(rect))
                      painter.drawPixmap(rect.topLeft(), tiles[y][x]);
              }
          }
      }

    }

</pre> Note that {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsScene#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#resetCachedContent() QGraphicsView::resetCachedContent()}. <br></DD></DT>
*/

    public final void invalidate(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsScene.SceneLayers layers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate_QRectF_SceneLayers(nativeId(), rect == null ? 0 : rect.nativeId(), layers.value());
    }
    native void __qt_invalidate_QRectF_SceneLayers(long __this__nativeId, long rect, int layers);


/**

*/

    @QtBlockedSlot
    public final void invalidate(double x, double y, double w, double h, com.trolltech.qt.gui.QGraphicsScene.SceneLayer ... layers) {
        this.invalidate(x, y, w, h, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(layers));
    }

/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling invalidate({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>layers</tt>);
*/

    @QtBlockedSlot
    public final void invalidate(double x, double y, double w, double h) {
        invalidate(x, y, w, h, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(65535));
    }
/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling invalidate({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>layers</tt>);
*/

    @QtBlockedSlot
    public final void invalidate(double x, double y, double w, double h, com.trolltech.qt.gui.QGraphicsScene.SceneLayers layers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate_double_double_double_double_SceneLayers(nativeId(), x, y, w, h, layers.value());
    }
    @QtBlockedSlot
    native void __qt_invalidate_double_double_double_double_SceneLayers(long __this__nativeId, double x, double y, double w, double h, int layers);

/**
This property holds whether sort caching is enabled. When enabled, this property adds a cache that speeds up sorting and transformations for scenes with deep hierarchies (i.e., items with many levels of descendents), at the cost of using more memory (approx. 100 more bytes of memory per item). <p>Items that are not part of a deep hierarchy suffer no penalty from this cache.
*/

    @com.trolltech.qt.QtPropertyReader(name="sortCacheEnabled")
    @QtBlockedSlot
    public final boolean isSortCacheEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSortCacheEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSortCacheEnabled(long __this__nativeId);

/**
Returns the topmost visible item at the specified <tt>position</tt>, or 0 if there are no items at this position. <p><b>Note:</b> The topmost item is the one with the highest Z-value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#items() items()}, {@link com.trolltech.qt.gui.QGraphicsScene#collidingItems(com.trolltech.qt.gui.QGraphicsItemInterface) collidingItems()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setZValue(double) QGraphicsItem::setZValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface itemAt(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_itemAt_QPointF(long __this__nativeId, long pos);

/**
This is an overloaded member function, provided for convenience. <p>Returns the topmost item at the position specified by (<tt>x</tt>, <tt>y</tt>), or 0 if there are no items at this position. <p>This convenience function is equivalent to calling <tt>itemAt(QPointF(x, y))</tt>. <p><b>Note:</b> The topmost item is the one with the highest Z-value.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface itemAt(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_itemAt_double_double(long __this__nativeId, double x, double y);

/**
This property holds the item indexing method.  QGraphicsScene applies an indexing algorithm to the scene, to speed up item discovery functions like {@link com.trolltech.qt.gui.QGraphicsScene#items() items()} and {@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. Indexing is most efficient for static scenes (i.e., where items don't move around). For dynamic scenes, or scenes with many animated items, the index bookkeeping can outweight the fast lookup speeds. <p>For the common case, the default index method {@link com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod BspTreeIndex } works fine. If your scene uses many animations and you are experiencing slowness, you can disable indexing by calling <tt>setItemIndexMethod(NoIndex)</tt>. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#bspTreeDepth() bspTreeDepth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="itemIndexMethod")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod itemIndexMethod()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod.resolve(__qt_itemIndexMethod(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_itemIndexMethod(long __this__nativeId);

/**
Returns a list of all items on the scene, in no particular order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}, and {@link com.trolltech.qt.gui.QGraphicsScene#removeItem(com.trolltech.qt.gui.QGraphicsItemInterface) removeItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items(long __this__nativeId);


/**
Returns all visible items that are either inside or
intersect with the path <tt>path</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPainterPath path) {
        return items(path, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns all visible items that, depending on <tt>path</tt>, are either inside or intersect with the path <tt>path</tt>. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>path</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QPainterPath_ItemSelectionMode(nativeId(), path == null ? 0 : path.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QPainterPath_ItemSelectionMode(long __this__nativeId, long path, int mode);

/**
Returns all visible items at position <tt>pos</tt> in the scene. The items are listed in descending Z order (i.e., the first item in the list is the top-most item, and the last item is the bottom-most item). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QPointF(long __this__nativeId, long pos);


/**
Returns all visible items that are either inside or
intersect with the polygon <tt>polygon</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPolygonF polygon) {
        return items(polygon, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns all visible items that, depending on <tt>mode</tt>, are either inside or intersect with the polygon <tt>polygon</tt>. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>polygon</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPolygonF polygon, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QPolygonF_ItemSelectionMode(nativeId(), polygon == null ? 0 : polygon.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QPolygonF_ItemSelectionMode(long __this__nativeId, long polygon, int mode);


/**
Returns all visible items that are either inside or intersect with the
specified <tt>rectangle</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QRectF rect) {
        return items(rect, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns all visible items that, depending on <tt>mode</tt>, are either inside or intersect with the specified <tt>rectangle</tt>. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>rectangle</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QRectF_ItemSelectionMode(nativeId(), rect == null ? 0 : rect.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QRectF_ItemSelectionMode(long __this__nativeId, long rect, int mode);


/**
This convenience function is equivalent to calling items(QRectF(<tt>x</tt>,
<tt>y</tt>, <tt>w</tt>, <tt>h</tt>).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(double x, double y, double w, double h) {
        return items(x, y, w, h, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This convenience function is equivalent to calling items({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>mode</tt>).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(double x, double y, double w, double h, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_double_double_double_double_ItemSelectionMode(nativeId(), x, y, w, h, mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_double_double_double_double_ItemSelectionMode(long __this__nativeId, double x, double y, double w, double h, int mode);

/**
Calculates and returns the bounding rect of all items on the scene. This function works by iterating over all items, and because if this, it can be slow for large scenes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF itemsBoundingRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemsBoundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_itemsBoundingRect(long __this__nativeId);

/**
Returns the current mouse grabber item, or 0 if no item is currently grabbing the mouse. The mouse grabber item is the item that receives all mouse events sent to the scene. <p>An item becomes a mouse grabber when it receives and accepts a mouse press event, and it stays the mouse grabber until either of the following events occur: <ul><li> If the item receives a mouse release event when there are no other buttons pressed, it loses the mouse grab.</li><li> If the item becomes invisible (i.e., someone calls <tt>item-&gt;setVisible(false))</tt>, or if it becomes disabled (i.e., someone calls <tt>item-&gt;setEnabled(false))</tt>, it loses the mouse grab.</li><li> If the item is removed from the scene, it loses the mouse grab.</li></ul> If the item loses its mouse grab, the scene will ignore all mouse events until a new item grabs the mouse (i.e., until a new item receives a mouse press event).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface mouseGrabberItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mouseGrabberItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_mouseGrabberItem(long __this__nativeId);

/**
This property holds the scene's default palette. This property provides the scene's palette. The scene palette defaults to, and resolves all its entries from, QApplication::palette. <p>If the scene's palette changes, either directly through {@link com.trolltech.qt.gui.QGraphicsScene#setPalette(com.trolltech.qt.gui.QPalette) setPalette()} or indirectly when the application palette changes, QGraphicsScene first sends itself a {@link com.trolltech.qt.core.QEvent.Type PaletteChange } event, and it then sends {@link com.trolltech.qt.core.QEvent.Type PaletteChange } events to all top-level widget items in the scene. These items respond by resolving their own palettes to the scene, and they then notify their children, who again notify their children, and so on, until all widget items have updated their palettes. <p>Changing the scene palette, (directly or indirectly through {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()},) automatically schedules a redraw the entire scene. <p><DT><b>See also:</b><br><DD>{@link QWidget#palette() QWidget::palette}, {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}, {@link QGraphicsScene#font() font}, and {@link com.trolltech.qt.gui.QGraphicsScene#style() style()}. <br></DD></DT>
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
Removes the item <tt>item</tt> and all its children from the scene. The ownership of <tt>item</tt> is passed on to the caller (i.e., QGraphicsScene will no longer delete <tt>item</tt> when destroyed). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeItem(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.reenableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItem_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeItem_QGraphicsItem(long __this__nativeId, long item);


/**
Renders the <tt>source</tt> rect from scene into <tt>target</tt>, using <tt>painter</tt>. This function is useful for capturing the contents of the scene onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing with {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(0d,0d,50d,50d);
        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);

        QPainter painter = new QPainter(printer);
        scene.render(painter);
</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} to determine what to render. If <tt>target</tt> is a null rect, the dimensions of <tt>painter</tt>'s paint device will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRect) QGraphicsView::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target, com.trolltech.qt.core.QRectF source) {
        render(painter, target, source, com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }

/**
Renders the <tt>source</tt> rect from scene into <tt>target</tt>, using <tt>painter</tt>. This function is useful for capturing the contents of the scene onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing with {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(0d,0d,50d,50d);
        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);

        QPainter painter = new QPainter(printer);
        scene.render(painter);
</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} to determine what to render. If <tt>target</tt> is a null rect, the dimensions of <tt>painter</tt>'s paint device will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRect) QGraphicsView::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target) {
        render(painter, target, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }

/**
Renders the <tt>source</tt> rect from scene into <tt>target</tt>, using <tt>painter</tt>. This function is useful for capturing the contents of the scene onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing with {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(0d,0d,50d,50d);
        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);

        QPainter painter = new QPainter(printer);
        scene.render(painter);
</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} to determine what to render. If <tt>target</tt> is a null rect, the dimensions of <tt>painter</tt>'s paint device will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRect) QGraphicsView::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter) {
        render(painter, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }
/**
Renders the <tt>source</tt> rect from scene into <tt>target</tt>, using <tt>painter</tt>. This function is useful for capturing the contents of the scene onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing with {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(0d,0d,50d,50d);
        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);

        QPainter painter = new QPainter(printer);
        scene.render(painter);
</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} to determine what to render. If <tt>target</tt> is a null rect, the dimensions of <tt>painter</tt>'s paint device will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRect) QGraphicsView::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target, com.trolltech.qt.core.QRectF source, com.trolltech.qt.core.Qt.AspectRatioMode aspectRatioMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_QRectF_QRectF_AspectRatioMode(nativeId(), painter == null ? 0 : painter.nativeId(), target == null ? 0 : target.nativeId(), source == null ? 0 : source.nativeId(), aspectRatioMode.value());
    }
    @QtBlockedSlot
    native void __qt_render_QPainter_QRectF_QRectF_AspectRatioMode(long __this__nativeId, long painter, long target, long source, int aspectRatioMode);

/**
This property holds the scene rectangle; the bounding rectangle of the scene. The scene rectangle defines the extent of the scene. It is primarily used by {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} to determine the view's default scrollable area, and by QGraphicsScene to manage item indexing. <p>If unset, or if set to a null {@link com.trolltech.qt.core.QRectF QRectF}, {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} will return the largest bounding rect of all items on the scene since the scene was created (i.e., a rectangle that grows when items are added to or moved in the scene, but never shrinks). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#width() width()}, {@link com.trolltech.qt.gui.QGraphicsScene#height() height()}, and {@link QGraphicsView#sceneRect() QGraphicsView::sceneRect}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sceneRect")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF sceneRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sceneRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_sceneRect(long __this__nativeId);

/**
Returns a list of all currently selected items. The items are returned in no particular order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> selectedItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_selectedItems(long __this__nativeId);

/**
Returns the selection area that was previously set with {@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}, or an empty {@link com.trolltech.qt.gui.QPainterPath QPainterPath} if no selection area has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) setSelectionArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath selectionArea()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectionArea(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_selectionArea(long __this__nativeId);

/**
Activates <tt>widget</tt>, which must be a widget in this scene. You can also pass 0 for <tt>widget</tt>, in which case QGraphicsScene will deactivate any currently active window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#activeWindow() activeWindow()}, and {@link com.trolltech.qt.gui.QGraphicsWidget#isActiveWindow() QGraphicsWidget::isActiveWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setActiveWindow(com.trolltech.qt.gui.QGraphicsWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActiveWindow_QGraphicsWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setActiveWindow_QGraphicsWidget(long __this__nativeId, long widget);

/**
This property holds the background brush of the scene.  Set this property to changes the scene's background to a different color, gradient or texture. The default background brush is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush }. The background is drawn before (behind) the items. <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        // a blue background
        scene.setBackgroundBrush(new QBrush(QColor.blue));

        // a gradient background
        QRadialGradient gradient = new QRadialGradient(0, 0, 10);
        gradient.setSpread(QGradient.Spread.RepeatSpread);
        scene.setBackgroundBrush(new QBrush(gradient));
</pre> {@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()} calls {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} to draw the scene background. For more detailed control over how the background is drawn, you can reimplement {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} in a subclass of QGraphicsScene.
*/

    @com.trolltech.qt.QtPropertyWriter(name="backgroundBrush")
    @QtBlockedSlot
    public final void setBackgroundBrush(com.trolltech.qt.gui.QBrush brush)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundBrush_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundBrush_QBrush(long __this__nativeId, long brush);

/**
This property holds the depth of QGraphicsScene's BSP index tree. This property has no effect when {@link com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod NoIndex } is used. <p>This value determines the depth of QGraphicsScene's BSP tree. The depth directly affects QGraphicsScene's performance and memory usage; the latter growing exponentially with the depth of the tree. With an optimal tree depth, QGraphicsScene can instantly determine the locality of items, even for scenes with thousands or millions of items. This also greatly improves rendering performance. <p>By default, the value is 0, in which case Qt will guess a reasonable default depth based on the size, location and number of items in the scene. If these parameters change frequently, however, you may experience slowdowns as QGraphicsScene retunes the depth internally. You can avoid potential slowdowns by fixating the tree depth through setting this property. <p>The depth of the tree and the size of the scene rectangle decide the granularity of the scene's partitioning. The size of each scene segment is determined by the following algorithm: <pre class="snippet">
        QSizeF segmentSize = sceneRect().size().divide(java.lang.Math.pow(2, depth - 1));
</pre> The BSP tree has an optimal size when each segment contains between 0 and 10 items. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#itemIndexMethod() itemIndexMethod}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="bspTreeDepth")
    @QtBlockedSlot
    public final void setBspTreeDepth(int depth)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBspTreeDepth_int(nativeId(), depth);
    }
    @QtBlockedSlot
    native void __qt_setBspTreeDepth_int(long __this__nativeId, int depth);


/**
Sets focus on the scene by sending a {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent} to the scene, passing <tt>focusReason</tt> as the reason. If the scene regains focus after having previously lost it while an item had focus, the last focus item will receive focus with <tt>focusReason</tt> as the reason. <p>If the scene already has focus, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()}, {@link com.trolltech.qt.gui.QGraphicsScene#clearFocus() clearFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocus() {
        setFocus(com.trolltech.qt.core.Qt.FocusReason.OtherFocusReason);
    }
/**
Sets focus on the scene by sending a {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent} to the scene, passing <tt>focusReason</tt> as the reason. If the scene regains focus after having previously lost it while an item had focus, the last focus item will receive focus with <tt>focusReason</tt> as the reason. <p>If the scene already has focus, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()}, {@link com.trolltech.qt.gui.QGraphicsScene#clearFocus() clearFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface) setFocusItem()}. <br></DD></DT>
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
Sets the scene's focus item to <tt>item</tt>, with the focus reason <tt>focusReason</tt>, after removing focus from any previous item that may have had focus. <p>If <tt>item</tt> is 0, or if it either does not accept focus (i.e., it does not have the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag QGraphicsItem::ItemIsFocusable } flag enabled), or is not visible or not enabled, this function only removes focus from any previous focusitem. <p>If item is not 0, and the scene does not currently have focus (i.e., {@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()} returns false), this function will call {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()} automatically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()}, {@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface item) {
        setFocusItem(item, com.trolltech.qt.core.Qt.FocusReason.OtherFocusReason);
    }
/**
Sets the scene's focus item to <tt>item</tt>, with the focus reason <tt>focusReason</tt>, after removing focus from any previous item that may have had focus. <p>If <tt>item</tt> is 0, or if it either does not accept focus (i.e., it does not have the {@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag QGraphicsItem::ItemIsFocusable } flag enabled), or is not visible or not enabled, this function only removes focus from any previous focusitem. <p>If item is not 0, and the scene does not currently have focus (i.e., {@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()} returns false), this function will call {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()} automatically. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()}, {@link com.trolltech.qt.gui.QGraphicsScene#hasFocus() hasFocus()}, and {@link com.trolltech.qt.gui.QGraphicsScene#setFocus() setFocus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocusItem(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.Qt.FocusReason focusReason)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcFocusItem = item;
        }
        __qt_setFocusItem_QGraphicsItem_FocusReason(nativeId(), item == null ? 0 : item.nativeId(), focusReason.value());
    }
    @QtBlockedSlot
    native void __qt_setFocusItem_QGraphicsItem_FocusReason(long __this__nativeId, long item, int focusReason);

/**
This property holds the scene's default font. This property provides the scene's font. The scene font defaults to, and resolves all its entries from, QApplication::font. <p>If the scene's font changes, either directly through {@link com.trolltech.qt.gui.QGraphicsScene#setFont(com.trolltech.qt.gui.QFont) setFont()} or indirectly when the application font changes, QGraphicsScene first sends itself a {@link com.trolltech.qt.core.QEvent.Type FontChange } event, and it then sends {@link com.trolltech.qt.core.QEvent.Type FontChange } events to all top-level widget items in the scene. These items respond by resolving their own fonts to the scene, and they then notify their children, who again notify their children, and so on, until all widget items have updated their fonts. <p>Changing the scene font, (directly or indirectly through {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()},) automatically schedules a redraw the entire scene. <p><DT><b>See also:</b><br><DD>{@link QWidget#font() QWidget::font}, {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}, {@link QGraphicsScene#palette() palette}, and {@link com.trolltech.qt.gui.QGraphicsScene#style() style()}. <br></DD></DT>
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
This property holds the foreground brush of the scene.  Change this property to set the scene's foreground to a different color, gradient or texture. <p>The foreground is drawn after (on top of) the items. The default foreground brush is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } ( i.e. the foreground is not drawn). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        // a white semi-transparent foreground
        scene.setForegroundBrush(new QBrush(new QColor(255, 255, 255, 127)));

        // a grid foreground
        scene.setForegroundBrush(new QBrush(QColor.lightGray, Qt.BrushStyle.CrossPattern));
</pre> {@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()} calls {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} to draw the scene foreground. For more detailed control over how the foreground is drawn, you can reimplement the {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} function in a QGraphicsScene subclass.
*/

    @com.trolltech.qt.QtPropertyWriter(name="foregroundBrush")
    @QtBlockedSlot
    public final void setForegroundBrush(com.trolltech.qt.gui.QBrush brush)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForegroundBrush_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setForegroundBrush_QBrush(long __this__nativeId, long brush);

/**
This property holds the item indexing method.  QGraphicsScene applies an indexing algorithm to the scene, to speed up item discovery functions like {@link com.trolltech.qt.gui.QGraphicsScene#items() items()} and {@link com.trolltech.qt.gui.QGraphicsScene#itemAt(com.trolltech.qt.core.QPointF) itemAt()}. Indexing is most efficient for static scenes (i.e., where items don't move around). For dynamic scenes, or scenes with many animated items, the index bookkeeping can outweight the fast lookup speeds. <p>For the common case, the default index method {@link com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod BspTreeIndex } works fine. If your scene uses many animations and you are experiencing slowness, you can disable indexing by calling <tt>setItemIndexMethod(NoIndex)</tt>. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#bspTreeDepth() bspTreeDepth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="itemIndexMethod")
    @QtBlockedSlot
    public final void setItemIndexMethod(com.trolltech.qt.gui.QGraphicsScene.ItemIndexMethod method)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemIndexMethod_ItemIndexMethod(nativeId(), method.value());
    }
    @QtBlockedSlot
    native void __qt_setItemIndexMethod_ItemIndexMethod(long __this__nativeId, int method);

/**
This property holds the scene's default palette. This property provides the scene's palette. The scene palette defaults to, and resolves all its entries from, QApplication::palette. <p>If the scene's palette changes, either directly through {@link com.trolltech.qt.gui.QGraphicsScene#setPalette(com.trolltech.qt.gui.QPalette) setPalette()} or indirectly when the application palette changes, QGraphicsScene first sends itself a {@link com.trolltech.qt.core.QEvent.Type PaletteChange } event, and it then sends {@link com.trolltech.qt.core.QEvent.Type PaletteChange } events to all top-level widget items in the scene. These items respond by resolving their own palettes to the scene, and they then notify their children, who again notify their children, and so on, until all widget items have updated their palettes. <p>Changing the scene palette, (directly or indirectly through {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()},) automatically schedules a redraw the entire scene. <p><DT><b>See also:</b><br><DD>{@link QWidget#palette() QWidget::palette}, {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}, {@link QGraphicsScene#font() font}, and {@link com.trolltech.qt.gui.QGraphicsScene#style() style()}. <br></DD></DT>
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
This property holds the scene rectangle; the bounding rectangle of the scene. The scene rectangle defines the extent of the scene. It is primarily used by {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} to determine the view's default scrollable area, and by QGraphicsScene to manage item indexing. <p>If unset, or if set to a null {@link com.trolltech.qt.core.QRectF QRectF}, {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} will return the largest bounding rect of all items on the scene since the scene was created (i.e., a rectangle that grows when items are added to or moved in the scene, but never shrinks). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#width() width()}, {@link com.trolltech.qt.gui.QGraphicsScene#height() height()}, and {@link QGraphicsView#sceneRect() QGraphicsView::sceneRect}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sceneRect")
    @QtBlockedSlot
    public final void setSceneRect(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSceneRect_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSceneRect_QRectF(long __this__nativeId, long rect);

/**
This property holds the scene rectangle; the bounding rectangle of the scene. The scene rectangle defines the extent of the scene. It is primarily used by {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} to determine the view's default scrollable area, and by QGraphicsScene to manage item indexing. <p>If unset, or if set to a null {@link com.trolltech.qt.core.QRectF QRectF}, {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()} will return the largest bounding rect of all items on the scene since the scene was created (i.e., a rectangle that grows when items are added to or moved in the scene, but never shrinks). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#width() width()}, {@link com.trolltech.qt.gui.QGraphicsScene#height() height()}, and {@link QGraphicsView#sceneRect() QGraphicsView::sceneRect}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSceneRect(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSceneRect_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setSceneRect_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Sets the selection area to <tt>path</tt>. All items within this area are immediately selected, and all items outside are unselected. You can get the list of all selected items by calling {@link com.trolltech.qt.gui.QGraphicsScene#selectedItems() selectedItems()}. <p>For an item to be selected, it must be marked as selectable ({@link com.trolltech.qt.gui.QGraphicsItem.GraphicsItemFlag QGraphicsItem::ItemIsSelectable }). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#clearSelection() clearSelection()}, and {@link com.trolltech.qt.gui.QGraphicsScene#selectionArea() selectionArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelectionArea(com.trolltech.qt.gui.QPainterPath path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionArea_QPainterPath(nativeId(), path == null ? 0 : path.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSelectionArea_QPainterPath(long __this__nativeId, long path);

/**
This is an overloaded member function, provided for convenience. <p>Sets the selection area to <tt>path</tt> using <tt>mode</tt> to determine if items are included in the selection area. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#clearSelection() clearSelection()}, and {@link com.trolltech.qt.gui.QGraphicsScene#selectionArea() selectionArea()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelectionArea(com.trolltech.qt.gui.QPainterPath path, com.trolltech.qt.core.Qt.ItemSelectionMode arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionArea_QPainterPath_ItemSelectionMode(nativeId(), path == null ? 0 : path.nativeId(), arg__2.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectionArea_QPainterPath_ItemSelectionMode(long __this__nativeId, long path, int arg__2);

/**
This property holds whether sort caching is enabled. When enabled, this property adds a cache that speeds up sorting and transformations for scenes with deep hierarchies (i.e., items with many levels of descendents), at the cost of using more memory (approx. 100 more bytes of memory per item). <p>Items that are not part of a deep hierarchy suffer no penalty from this cache.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortCacheEnabled")
    @QtBlockedSlot
    public final void setSortCacheEnabled(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortCacheEnabled_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setSortCacheEnabled_boolean(long __this__nativeId, boolean enabled);

/**
Sets or replaces the style of the scene to <tt>style</tt>, and reparents the style to this scene. Any previously assigned style is deleted. The scene's style defaults to {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()}, and serves as the default for all {@link com.trolltech.qt.gui.QGraphicsWidget QGraphicsWidget} items in the scene. <p>Changing the style, either directly by calling this function, or indirectly by calling {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) QApplication::setStyle()}, will automatically update the style for all widgets in the scene that do not have a style explicitly assigned to them. <p>If <tt>style</tt> is 0, QGraphicsScene will revert to {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#style() style()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.gui.QStyle style)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyle_QStyle(nativeId(), style == null ? 0 : style.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setStyle_QStyle(long __this__nativeId, long style);

/**
Returns the scene's style, or the same as {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()} if the scene has not been explicitly assigned a style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}. <br></DD></DT>
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
Schedules a redraw of the area <tt>rect</tt> on the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()}, and {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() }. <br></DD></DT>
*/

    public final void update() {
        update((com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF());
    }
/**
Schedules a redraw of the area <tt>rect</tt> on the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()}, and {@link com.trolltech.qt.gui.QGraphicsScene#changed changed() }. <br></DD></DT>
*/

    public final void update(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native void __qt_update_QRectF(long __this__nativeId, long rect);

/**
This is an overloaded member function, provided for convenience. <p>This function is equivalent to calling update({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>));
*/

    @QtBlockedSlot
    public final void update(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_update_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Returns a list of all the views that display this scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#scene() QGraphicsView::scene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsView> views()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_views(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsView> __qt_views(long __this__nativeId);

/**
This convenience function is equivalent to calling {@link com.trolltech.qt.gui.QGraphicsScene#sceneRect() sceneRect()}.{@link com.trolltech.qt.gui.QGraphicsScene#width() width()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double width()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native double __qt_width(long __this__nativeId);

/**
This event handler, for event <tt>contextMenuEvent</tt>, can be reimplemented in a subclass to receive context menu events. The default implementation forwards the event to the topmost item that accepts context menu events at the position of the event. If no items accept context menu events at this position, the event is ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#contextMenuEvent(com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent) QGraphicsItem::contextMenuEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QGraphicsSceneContextMenuEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QGraphicsSceneContextMenuEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QGraphicsSceneContextMenuEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive drag enter events for the scene. <p>The default implementation accepts the event and prepares the scene to accept drag move events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) QGraphicsItem::dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive drag leave events for the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) QGraphicsItem::dragLeaveEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive drag move events for the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) QGraphicsItem::dragMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dropEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QGraphicsSceneDragDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QGraphicsSceneDragDropEvent(long __this__nativeId, long event);

/**
Draws the background of the scene using <tt>painter</tt>, before any items and the foreground are drawn. Reimplement this function to provide a custom background for the scene. <p>All painting is done in scene coordinates. The <tt>rect</tt> parameter is the exposed rectangle. <p>If all you want is to define a color, texture, or gradient for the background, you can call {@link com.trolltech.qt.gui.QGraphicsScene#setBackgroundBrush(com.trolltech.qt.gui.QBrush) setBackgroundBrush()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}, and {@link com.trolltech.qt.gui.QGraphicsScene#drawItems(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QGraphicsItemInterface[], com.trolltech.qt.gui.QStyleOptionGraphicsItem[]) drawItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void drawBackground(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawBackground_QPainter_QRectF(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawBackground_QPainter_QRectF(long __this__nativeId, long painter, long rect);

/**
Draws the foreground of the scene using <tt>painter</tt>, after the background and all items have been drawn. Reimplement this function to provide a custom foreground for the scene. <p>All painting is done in scene coordinates. The <tt>rect</tt> parameter is the exposed rectangle. <p>If all you want is to define a color, texture or gradient for the foreground, you can call {@link com.trolltech.qt.gui.QGraphicsScene#setForegroundBrush(com.trolltech.qt.gui.QBrush) setForegroundBrush()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}, and {@link com.trolltech.qt.gui.QGraphicsScene#drawItems(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QGraphicsItemInterface[], com.trolltech.qt.gui.QStyleOptionGraphicsItem[]) drawItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void drawForeground(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawForeground_QPainter_QRectF(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawForeground_QPainter_QRectF(long __this__nativeId, long painter, long rect);


/**

*/

    @QtBlockedSlot
    protected final void drawItems(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QGraphicsItemInterface[] items, com.trolltech.qt.gui.QStyleOptionGraphicsItem[] options) {
        drawItems(painter, items, options, (com.trolltech.qt.gui.QWidget)null);
    }
/**

*/

    @QtBlockedSlot
    protected void drawItems(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QGraphicsItemInterface[] items, com.trolltech.qt.gui.QStyleOptionGraphicsItem[] options, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItems_QPainter_int_nativepointer_nativepointer_QWidget(nativeId(), painter == null ? 0 : painter.nativeId(), items, options, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawItems_QPainter_int_nativepointer_nativepointer_QWidget(long __this__nativeId, long painter, com.trolltech.qt.gui.QGraphicsItemInterface[] items, com.trolltech.qt.gui.QStyleOptionGraphicsItem[] options, long widget);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive drop events for the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) QGraphicsItem::dropEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragEnterEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QGraphicsScene#dragMoveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragMoveEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#dragLeaveEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent) dragLeaveEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QGraphicsSceneDragDropEvent event)    {
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
    public boolean eventFilter(com.trolltech.qt.core.QObject watched, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), watched == null ? 0 : watched.nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long watched, long event);

/**
This event handler, for event <tt>focusEvent</tt>, can be reimplemented in a subclass to receive focus in events. <p>The default implementation sets focus on the scene, and then on the last focus item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) QGraphicsItem::focusOutEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>focusEvent</tt>, can be reimplemented in a subclass to receive focus out events. <p>The default implementation removes focus from any focus item, then removes focus from the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#focusInEvent(com.trolltech.qt.gui.QFocusEvent) QGraphicsItem::focusInEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>helpEvent</tt>, can be reimplemented in a subclass to receive help events. The events are of type {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip }, which are created when a tooltip is requested. <p>The default implementation shows the tooltip of the topmost item, i.e., the item with the highest z-value, at the mouse cursor position. If no item has a tooltip set, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#toolTip() QGraphicsItem::toolTip()}, and {@link com.trolltech.qt.gui.QGraphicsSceneHelpEvent QGraphicsSceneHelpEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void helpEvent(com.trolltech.qt.gui.QGraphicsSceneHelpEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_helpEvent_QGraphicsSceneHelpEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_helpEvent_QGraphicsSceneHelpEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive input method events for the scene. <p>The default implementation forwards the event to the {@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()}. If no item currently has focus, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent) QGraphicsItem::inputMethodEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long event);

/**
This method is used by input methods to query a set of properties of the scene to be able to support complex input method operations as support for surrounding text and reconversions. <p>The <tt>query</tt> parameter specifies which property is queried. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery) QWidget::inputMethodQuery()}. <br></DD></DT>
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
This event handler, for event <tt>keyEvent</tt>, can be reimplemented in a subclass to receive keypress events. The default implementation forwards the event to current focus item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) QGraphicsItem::keyPressEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>keyEvent</tt>, can be reimplemented in a subclass to receive key release events. The default implementation forwards the event to current focus item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) QGraphicsItem::keyReleaseEvent()}, and {@link com.trolltech.qt.gui.QGraphicsScene#focusItem() focusItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>mouseEvent</tt>, can be reimplemented in a subclass to receive mouse doubleclick events for the scene. <p>If someone doubleclicks on the scene, the scene will first receive a mouse press event, followed by a release event (i.e., a click), then a doubleclick event, and finally a release event. If the doubleclick event is delivered to a different item than the one that received the first press and release, it will be delivered as a press event. However, tripleclick events are not delivered as doubleclick events in this case. <p>The default implementation is similar to {@link com.trolltech.qt.gui.QGraphicsScene#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) mousePressEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseReleaseEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) QGraphicsItem::setAcceptedMouseButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>mouseEvent</tt>, can be reimplemented in a subclass to receive mouse move events for the scene. <p>The default implementation depends on the mouse grabber state. If there is a mouse grabber item, the event is sent to the mouse grabber. If there are any items that accept hover events at the current position, the event is translated into a hover event and accepted; otherwise it's ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) QGraphicsItem::setAcceptedMouseButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>mouseEvent</tt>, can be reimplemented in a subclass to receive mouse press events for the scene. <p>The default implementation depends on the state of the scene. If there is a mouse grabber item, then the event is sent to the mouse grabber. Otherwise, it is forwarded to the topmost item that accepts mouse events at the scene position from the event, and that item promptly becomes the mouse grabber item. <p>If there is no item at the given position on the scene, the selection area is reset, any focus item loses its input focus, and the event is then ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) QGraphicsItem::setAcceptedMouseButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>mouseEvent</tt>, can be reimplemented in a subclass to receive mouse release events for the scene. <p>The default implementation depends on the mouse grabber state. If there is no mouse grabber, the event is ignored. Otherwise, if there is a mouse grabber item, the event is sent to the mouse grabber. If this mouse release represents the last pressed button on the mouse, the mouse grabber item then loses the mouse grab. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#mousePressEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mousePressEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseMoveEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseMoveEvent()}, {@link com.trolltech.qt.gui.QGraphicsItem#mouseDoubleClickEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent) QGraphicsItem::mouseDoubleClickEvent()}, and {@link com.trolltech.qt.gui.QGraphicsItem#setAcceptedMouseButtons(com.trolltech.qt.core.Qt.MouseButton[]) QGraphicsItem::setAcceptedMouseButtons()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QGraphicsSceneMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QGraphicsSceneMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QGraphicsSceneMouseEvent(long __this__nativeId, long event);

/**
This event handler, for event <tt>wheelEvent</tt>, can be reimplemented in a subclass to receive mouse wheel events for the scene. <p>By default, the event is delivered to the topmost visible item under the cursor. If ignored, the event propagates to the item beneath, and again until the event is accepted, or it reaches the scene. If no items accept the event, it is ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItem#wheelEvent(com.trolltech.qt.gui.QGraphicsSceneWheelEvent) QGraphicsItem::wheelEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QGraphicsSceneWheelEvent event)    {
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

    public static native QGraphicsScene fromNativePointer(QNativePointer nativePointer);

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

    protected QGraphicsScene(QPrivateConstructor p) { super(p); } 

    /**
     * Equivalent to addEllipse(rect, null, null)
     */
        public final QGraphicsEllipseItem addEllipse(com.trolltech.qt.core.QRectF rect)
    {
        return addEllipse(rect, null);
    }

    /**
     * Equivalent to addEllipse(rect, pen, null)
     */
        public final QGraphicsEllipseItem addEllipse(com.trolltech.qt.core.QRectF rect, QPen pen)
    {
        return addEllipse(rect, pen, null);
    }

    /**
     * Creates and adds an ellipse item to the scene, and returns the item
     * reference. The geometry of the ellipse is defined by rect, and its pen
     * and brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem::isVisible() returns true),
     * QGraphicsScene will emit changed() once control goes back to the event
     * loop.
     *
     * @param rect The bounding rectangle of the ellipse.
     * @param pen The pen for the resulting QGraphicsEllipseItem.
     * @param brush The brush for the resulting QGraphicsEllipseItem.
     * @return The resulting item.
     */
        public final QGraphicsEllipseItem addEllipse(com.trolltech.qt.core.QRectF rect, QPen pen, QBrush brush)
    {
        return addEllipse(rect.x(), rect.y(), rect.width(), rect.height(), pen, brush);
    }

    /**
     * Equivalent to addEllipse(x, y, w, h, null, null)
     */
    public final QGraphicsEllipseItem addEllipse(double x, double y, double w, double h) {
        return addEllipse(x, y, w, h, null);
    }

    /**
     * Equivalent to addEllipse(x, y, w, h, pen, null)
     */
        public final QGraphicsEllipseItem addEllipse(double x, double y, double w, double h, QPen pen)
    {
        return addEllipse(x, y, w, h, pen, null);
    }

    /**
     * Creates and adds an ellipse item to the scene, and returns the item
     * reference. The geometry of the ellipse is defined by x, y, w, h, and its pen
     * and brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param x The left horizontal coordinate of the ellipse's bounding rectangle.
     * @param y The top vertical coordinate of the ellipse's bounding rectangle.
     * @param w The width of the ellipse's bounding rectangle.
     * @param h The height of the ellipse's bounding rectangle.
     * @param pen The pen for the resulting QGraphicsEllipseItem.
     * @param brush The brush for the resulting QGraphicsEllipseItem.
     * @return The resulting item.
     */
        public final QGraphicsEllipseItem addEllipse(double x, double y, double w, double h, QPen pen, QBrush brush)
    {
        QGraphicsEllipseItem item = new QGraphicsEllipseItem(x, y, w, h);
        item.setPen(pen);
        item.setBrush(brush);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addLine(line, null)
     */
    public final QGraphicsLineItem addLine(QLineF line) {
        return addLine(line, null);
    }

    /**
     * Creates and adds a line item to the scene, and returns the item
     * reference. The geometry of the line is defined by line, and its pen
     * is initialized to pen.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param line The definition of the line.
     * @param pen The pen with which to draw the line.
     * @return The resulting item.
     */
        public final QGraphicsLineItem addLine(QLineF line, QPen pen)
    {
        return addLine(line.x1(), line.y1(), line.x2(), line.y2(), pen);
    }

    /**
     * Equivalent to addLine(x1, y1, x2, y2, null)
     */
    public final QGraphicsLineItem addLine(double x1, double y1, double x2, double y2) {
        return addLine(x1, y1, x2, y2, null);
    }

    /**
     * Creates and adds a line item to the scene, and returns the item
     * reference. The geometry of the line is defined by x1, y1, x2, y2, and its pen
     * is initialized to pen.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param x1 The first horizontal coordinate of the line.
     * @param y1 The first vertical coordinate of the line.
     * @param x2 The second horizontal coordinate of the line.
     * @param y2 The second vertical coordinate of the line.
     * @param pen The pen with which to draw the line.
     * @return The resulting item.
     */
        public final QGraphicsLineItem addLine(double x1, double y1, double x2, double y2, QPen pen)
    {
        QGraphicsLineItem item = new QGraphicsLineItem(x1, y1, x2, y2);
        item.setPen(pen);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addPath(path, null, null)
     */
    public final QGraphicsPathItem addPath(QPainterPath path) {
        return addPath(path, null);
    }

    /**
     * Equivalent to addPath(path, pen, null)
     */
        public final QGraphicsPathItem addPath(QPainterPath path, QPen pen)
    {
        return addPath(path, pen, null);
    }
    /**
     * Creates and adds a path item to the scene, and returns the item
     * reference. The geometry of the path is defined by path, and its pen and
     * brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param path The definition of the path.
     * @param pen The pen for drawing the path.
     * @param brush The brush for drawing the path.
     * @return The resulting item.
     */
        public final QGraphicsPathItem addPath(QPainterPath path, QPen pen, QBrush brush)
    {
        QGraphicsPathItem item = new QGraphicsPathItem(path);
        item.setPen(pen);
        item.setBrush(brush);

        addItem(item);

        return item;
    }

    /**
     * Creates and adds a pixmap item to the scene, and returns the item
     * reference. The pixmap is defined by pixmap.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param pixmap The pixmap for which to create a graphics item.
     * @return The resulting item.
     */
        public final QGraphicsPixmapItem addPixmap(QPixmap pixmap)
    {
        QGraphicsPixmapItem item = new QGraphicsPixmapItem(pixmap);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addPolygon(polygon, null, null)
     */
    public final QGraphicsPolygonItem addPolygon(QPolygonF polygon) {
        return addPolygon(polygon, null);
    }

    /**
     * Equivalent to addPolygon(polygon, pen, null)
     */
    public final QGraphicsPolygonItem addPolygon(QPolygonF polygon, QPen pen) {
        return addPolygon(polygon, pen, null);
    }

    /**
     * Creates and adds a polygon item to the scene, and returns the item
     * reference. The polygon is defined by polygon, and its pen and
     * brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param polygon The definition of the polygon.
     * @param pen The pen with which to draw the polygon.
     * @param brush The brush with which to draw the polygon.
     * @return The resulting item.
     */
        public final QGraphicsPolygonItem addPolygon(QPolygonF polygon, QPen pen, QBrush brush)
    {
        QGraphicsPolygonItem item = new QGraphicsPolygonItem(polygon);
        item.setPen(pen);
        item.setBrush(brush);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addRect(rect, null, null)
     */
    public final QGraphicsRectItem addRect(com.trolltech.qt.core.QRectF rect) {
        return addRect(rect, null);
    }

    /**
     * Equivalent to addRect(rect, pen, null)
     */
        public final QGraphicsRectItem addRect(com.trolltech.qt.core.QRectF rect, QPen pen)
    {
        return addRect(rect, pen, null);
    }

    /**
     * Creates and adds a rectangle item to the scene, and returns the item
     * reference. The geometry of the rectangle is defined by rect, and its pen
     * and brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0). For example, if a QRect(50, 50, 100,
     * 100) is added, its top-left corner will be at (50, 50) relative to the
     * origin in the item's coordinate system.
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param rect The definition of the rectangle.
     * @param pen The pen with which to draw the rectangle.
     * @param brush The brush with which to draw the rectangle.
     * @return The resulting item.
     */
        public final QGraphicsRectItem addRect(com.trolltech.qt.core.QRectF rect, QPen pen, QBrush brush)
    {
        return addRect(rect.x(), rect.y(), rect.width(), rect.height(), pen, brush);
    }

    /**
     * Equivalent to addRect(x, y, w, h, null, null)
     */
    public final QGraphicsRectItem addRect(double x, double y, double w, double h) {
        return addRect(x, y, w, h, null);
    }

    /**
     * Equivalent to addRect(x, y, w, h, pen, null)
     */
    public final QGraphicsRectItem addRect(double x, double y, double w, double h, QPen pen) {
        return addRect(x, y, w, h, pen, null);
    }

    /**
     * Creates and adds a rectangle item to the scene, and returns the item
     * reference. The geometry of the rectangle is defined by x, y, w, h, and its pen
     * and brush are initialized to pen and brush.
     *
     * Note that the item's geometry is provided in item coordinates, and its
     * position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param x The left horizontal coordinate of the rectangle.
     * @param y The top vertical coordinate of the rectangle.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     * @param pen The pen with which to draw the rectangle.
     * @param brush The brush with which to draw the rectangle.
     * @return The resulting item.
     */
        public final QGraphicsRectItem addRect(double x, double y, double w, double h, QPen pen, QBrush brush)
    {
        QGraphicsRectItem item = new QGraphicsRectItem(x, y, w, h);
        item.setPen(pen);
        item.setBrush(brush);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addSimpleText(text, null)
     */
    public final QGraphicsSimpleTextItem addSimpleText(String text) {
        return addSimpleText(text, null);
    }

    /**
     * Creates and adds a QGraphicsSimpleTextItem to the scene, and returns the
     * item reference. The text string is initialized to text, and its font is
     * initialized to font.
     *
     * The item's position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param text The text to add to the scene.
     * @param font The font to use for displaying the text.
     * @return The resulting item.
     */
        public final QGraphicsSimpleTextItem addSimpleText(String text, QFont font)
    {
        QGraphicsSimpleTextItem item = new QGraphicsSimpleTextItem(text);
        item.setFont(font);

        addItem(item);

        return item;
    }

    /**
     * Equivalent to addText(text, null)
     */
    public final QGraphicsTextItem addText(String text) {
        return addText(text, null);
    }

    /**
     * Creates and adds a text item to the scene, and returns the item
     * reference. The text string is initialized to text, and its font
     * is initialized to font.
     *
     * The item's position is initialized to (0, 0).
     *
     * If the item is visible (i.e., QGraphicsItem.isVisible() returns true),
     * QGraphicsScene will emit changed once control goes back to the event
     * loop.
     *
     * @param text The text to add to the scene.
     * @param font The font to use for displaying the text.
     * @return The resulting item.
     */
        public final QGraphicsTextItem addText(String text, QFont font)
    {
        QGraphicsTextItem item = new QGraphicsTextItem(text);
        item.setFont(font);

        addItem(item);

        return item;
    }

}
