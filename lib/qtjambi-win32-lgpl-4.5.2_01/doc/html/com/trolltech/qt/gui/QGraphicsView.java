package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsView class provides a widget for displaying the contents of a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. QGraphicsView visualizes the contents of a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} in a scrollable viewport. To create a scene with geometrical items, see {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}'s documentation. QGraphicsView is part of {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <p>To visualize a scene, you start by constructing a QGraphicsView object, passing the address of the scene you want to visualize to QGraphicsView's constructor. Alternatively, you can call {@link com.trolltech.qt.gui.QGraphicsView#setScene(com.trolltech.qt.gui.QGraphicsScene) setScene()} to set the scene at a later point. After you call {@link com.trolltech.qt.gui.QWidget#show() show()}, the view will by default scroll to the center of the scene and display any items that are visible at this point. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("Hello, world!");

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
</pre> You can explicitly scroll to any position on the scene by using the scroll bars, or by calling {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. By passing a point to {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}, QGraphicsView will scroll its viewport to ensure that the point is centered in the view. An overload is provided for scrolling to a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, in which case QGraphicsView will see to that the center of the item is centered in the view. If all you want is to ensure that a certain area is visible, (but not necessarily centered,) you can call {@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()} instead. <p>QGraphicsView can be used to visualize a whole scene, or only parts of it. The visualized area is by default detected automatically when the view is displayed for the first time (by calling {@link com.trolltech.qt.gui.QGraphicsScene#itemsBoundingRect() QGraphicsScene::itemsBoundingRect()}). To set the visualized area rectangle yourself, you can call {@link com.trolltech.qt.gui.QGraphicsView#setSceneRect(com.trolltech.qt.core.QRectF) setSceneRect()}. This will adjust the scroll bars' ranges appropriately. Note that although the scene supports a virtually unlimited size, the range of the scroll bars will never exceed the range of an integer (INT_MIN, INT_MAX). When the scene is larger than the scroll bars' values, you can choose to use {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()} to navigate the scene instead. <p>QGraphicsView visualizes the scene by calling {@link com.trolltech.qt.gui.QGraphicsView#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRect) render()}. By default, the items are drawn onto the viewport by using a regular {@link com.trolltech.qt.gui.QPainter QPainter}, and using default render hints. To change the default render hints that QGraphicsView passes to {@link com.trolltech.qt.gui.QPainter QPainter} when painting items, you can call {@link com.trolltech.qt.gui.QGraphicsView#setRenderHints(com.trolltech.qt.gui.QPainter.RenderHint[]) setRenderHints()}. <p>By default, QGraphicsView provides a regular {@link com.trolltech.qt.gui.QWidget QWidget} for the viewport widget. You can access this widget by calling {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}, or you can replace it by calling {@link com.trolltech.qt.gui.QAbstractScrollArea#setViewport(com.trolltech.qt.gui.QWidget) setViewport()}. To render using OpenGL, simply call setViewport(new {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}). QGraphicsView takes ownership of the viewport widget. <p>QGraphicsView supports affine transformations, using {@link com.trolltech.qt.gui.QMatrix QMatrix}. You can either pass a matrix to {@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, or you can call one of the convenience functions {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()} or {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}. The most two common transformations are scaling, which is used to implement zooming, and rotation. QGraphicsView keeps the center of the view fixed during a transformation. <p>You can interact with the items on the scene by using the mouse and keyboard. QGraphicsView translates the mouse and key events into scene events, (events that inherit {@link com.trolltech.qt.gui.QGraphicsSceneEvent QGraphicsSceneEvent},), and forward them to the visualized scene. In the end, it's the individual item that handles the events and reacts to them. For example, if you click on a selectable item, the item will typically let the scene know that it has been selected, and it will also redraw itself to display a selection rectangle. Similiary, if you click and drag the mouse to move a movable item, it's the item that handles the mouse moves and moves itself. Item interaction is enabled by default, and you can toggle it by calling {@link com.trolltech.qt.gui.QGraphicsView#setInteractive(boolean) setInteractive()}. <p>You can also provide your own custom scene interaction, by creating a subclass of QGraphicsView, and reimplementing the mouse and key event handlers. To simplify how you programmatically interact with items in the view, QGraphicsView provides the mapping functions {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} and {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}, and the item accessors {@link com.trolltech.qt.gui.QGraphicsView#items() items()} and {@link com.trolltech.qt.gui.QGraphicsView#itemAt(com.trolltech.qt.core.QPoint) itemAt()}. These functions allow you to map points, rectangles, polygons and paths between view coordinates and scene coordinates, and to find items on the scene using view coordinates. <br><center><img src="../images/graphicsview-view.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}, {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}, and {@link com.trolltech.qt.gui.QGraphicsSceneEvent QGraphicsSceneEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsView extends com.trolltech.qt.gui.QAbstractScrollArea
{

    private Object __rcScene = null;
    
/**
This enum describes flags that you can enable to improve rendering performance in {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}. By default, none of these flags are set. Note that setting a flag usually imposes a side effect, and this effect can vary between paint devices and platforms.
*/
@QtBlockedEnum
    public enum OptimizationFlag implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} sometimes clips the painter when rendering the scene contents. This can generally improve performance (e.g., rendering only small parts of a large pixmap), and protects against rendering mistakes (e.g., drawing outside bounding rectangles, or outside the exposed area). In some situations, however, the painter clip can slow down rendering; especially when all painting is restricted to inside exposed areas. By enabling this flag, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will completely disable its implicit clipping. Note that rendering artifacts from using a semi-transparent foreground or background brush can occur if clipping is disabled.
*/

        DontClipPainter(1),
/**
 When rendering, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} protects the painter state (see {@link com.trolltech.qt.gui.QPainter#save() QPainter::save()}) when rendering the background or foreground, and when rendering each item. This allows you to leave the painter in an altered state (i.e., you can call {@link com.trolltech.qt.gui.QPainter#setPen(com.trolltech.qt.core.Qt.PenStyle) QPainter::setPen()} or {@link com.trolltech.qt.gui.QPainter#setBrush(com.trolltech.qt.core.Qt.BrushStyle) QPainter::setBrush()} without restoring the state after painting). However, if the items consistently do restore the state, you should enable this flag to prevent {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} from doing the same.
*/

        DontSavePainterState(2),
/**
 Disables {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}'s antialiasing auto-adjustment of exposed areas. Items that render antialiased lines on the boundaries of their {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() QGraphicsItem::boundingRect()} can end up rendering parts of the line outside. To prevent rendering artifacts, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} expands all exposed regions by 2 pixels in all directions. If you enable this flag, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will no longer perform these adjustments, minimizing the areas that require redrawing, which improves performance. A common side effect is that items that do draw with antialiasing can leave painting traces behind on the scene as they are moved.
*/

        DontAdjustForAntialiasing(4);

        OptimizationFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QGraphicsView$OptimizationFlags with the specified <tt>com.trolltech.qt.gui.QGraphicsView$OptimizationFlag[]</tt> QGraphicsView$OptimizationFlag values set.</brief>
*/

        public static OptimizationFlags createQFlags(OptimizationFlag ... values) {
            return new OptimizationFlags(values);
        }
/**
<brief>Returns the QGraphicsView$OptimizationFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static OptimizationFlag resolve(int value) {
            return (OptimizationFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DontClipPainter;
            case 2: return DontSavePainterState;
            case 4: return DontAdjustForAntialiasing;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class OptimizationFlags extends com.trolltech.qt.QFlags<OptimizationFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QGraphicsView-OptimizationFlags with the specified <tt>com.trolltech.qt.gui.QGraphicsView.OptimizationFlag[]</tt>. flags set.</brief>
*/

        public OptimizationFlags(OptimizationFlag ... args) { super(args); }
        public OptimizationFlags(int value) { setValue(value); }
    }
/**
This enums describe the possible anchors that {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} can use when the user resizes the view or when the view is transformed. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#resizeAnchor() resizeAnchor}, and {@link QGraphicsView#transformationAnchor() transformationAnchor}. <br></DD></DT>
*/


    public enum ViewportAnchor implements com.trolltech.qt.QtEnumerator {
/**
 No anchor, i.e. the view leaves the scene's position unchanged.
*/

        NoAnchor(0),
/**
 The scene point at the center of the view is used as the anchor.
*/

        AnchorViewCenter(1),
/**
 The point under the mouse is used as the anchor.
*/

        AnchorUnderMouse(2);

        ViewportAnchor(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsView$ViewportAnchor constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewportAnchor resolve(int value) {
            return (ViewportAnchor) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoAnchor;
            case 1: return AnchorViewCenter;
            case 2: return AnchorUnderMouse;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes how {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} updates its viewport when the scene contents change or are exposed. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#viewportUpdateMode() viewportUpdateMode}. <br></DD></DT>
*/

    public enum ViewportUpdateMode implements com.trolltech.qt.QtEnumerator {
/**
 When any visible part of the scene changes or is reexposed, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will update the entire viewport. This approach is fastest when {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} spends more time figuring out what to draw than it would spend drawing (e.g., when very many small items are repeatedly updated). This is the preferred update mode for viewports that do not support partial updates, such as {@link com.trolltech.qt.opengl.QGLWidget QGLWidget}, and for viewports that need to disable scroll optimization.
*/

        FullViewportUpdate(0),
/**
 {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will determine the minimal viewport region that requires a redraw, minimizing the time spent drawing by avoiding a redraw of areas that have not changed. This is {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}'s default mode. Although this approach provides the best performance in general, if there are many small visible changes on the scene, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} might end up spending more time finding the minimal approach than it will spend drawing.
*/

        MinimalViewportUpdate(1),
/**
 {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will attempt to find an optimal update mode by analyzing the areas that require a redraw.
*/

        SmartViewportUpdate(2),
/**
 {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will never update its viewport when the scene changes; the user is expected to control all updates. This mode disables all (potentially slow) item visibility testing in {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}, and is suitable for scenes that either require a fixed frame rate, or where the viewport is otherwise updated externally.
*/

        NoViewportUpdate(3),
/**
 The bounding rectangle of all changes in the viewport will be redrawn. This mode has the advantage that {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} searches only one region for changes, minimizing time spent determining what needs redrawing. The disadvantage is that areas that have not changed also need to be redrawn.
*/

        BoundingRectViewportUpdate(4);

        ViewportUpdateMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsView$ViewportUpdateMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewportUpdateMode resolve(int value) {
            return (ViewportUpdateMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FullViewportUpdate;
            case 1: return MinimalViewportUpdate;
            case 2: return SmartViewportUpdate;
            case 3: return NoViewportUpdate;
            case 4: return BoundingRectViewportUpdate;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the flags that you can set for a {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView}'s cache mode. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#cacheMode() cacheMode}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum CacheModeFlag implements com.trolltech.qt.QtEnumerator {
/**
 All painting is done directly onto the viewport.
*/

        CacheNone(0),
/**
 The background is cached. This affects both custom backgrounds, and backgrounds based on the {@link QGraphicsView#backgroundBrush() backgroundBrush} property. When this flag is enabled, {@link com.trolltech.qt.gui.QGraphicsView QGraphicsView} will allocate one pixmap with the full size of the viewport.
*/

        CacheBackground(1);

        CacheModeFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QGraphicsView$CacheMode with the specified <tt>com.trolltech.qt.gui.QGraphicsView$CacheModeFlag[]</tt> QGraphicsView$CacheModeFlag values set.</brief>
*/

        public static CacheMode createQFlags(CacheModeFlag ... values) {
            return new CacheMode(values);
        }
/**
<brief>Returns the QGraphicsView$CacheModeFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static CacheModeFlag resolve(int value) {
            return (CacheModeFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CacheNone;
            case 1: return CacheBackground;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class CacheMode extends com.trolltech.qt.QFlags<CacheModeFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QGraphicsView-CacheMode with the specified <tt>com.trolltech.qt.gui.QGraphicsView.CacheModeFlag[]</tt>. flags set.</brief>
*/

        public CacheMode(CacheModeFlag ... args) { super(args); }
        public CacheMode(int value) { setValue(value); }
    }
/**
This enum describes the default action for the view when pressing and dragging the mouse over the viewport. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#dragMode() dragMode}, and {@link com.trolltech.qt.gui.QGraphicsScene#setSelectionArea(com.trolltech.qt.gui.QPainterPath) QGraphicsScene::setSelectionArea()}. <br></DD></DT>
*/


    public enum DragMode implements com.trolltech.qt.QtEnumerator {
/**
 Nothing happens; the mouse event is ignored.
*/

        NoDrag(0),
/**
 The cursor changes into a pointing hand, and dragging the mouse around will scroll the scrolbars. This mode works both in {@link QGraphicsView#isInteractive() interactive} and non-interactive mode.
*/

        ScrollHandDrag(1),
/**
 A rubber band will appear. Dragging the mouse will set the rubber band geometry, and all items covered by the rubber band are selected. This mode is disabled for non-interactive views.
*/

        RubberBandDrag(2);

        DragMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsView$DragMode constant with the specified <tt>int</tt>.</brief>
*/

        public static DragMode resolve(int value) {
            return (DragMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoDrag;
            case 1: return ScrollHandDrag;
            case 2: return RubberBandDrag;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QGraphicsView and sets the visualized scene to <tt>scene</tt>. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QGraphicsView(com.trolltech.qt.gui.QGraphicsScene scene) {
        this(scene, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QGraphicsView and sets the visualized scene to <tt>scene</tt>. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QGraphicsView(com.trolltech.qt.gui.QGraphicsScene scene, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsView_QGraphicsScene_QWidget(scene == null ? 0 : scene.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsView_QGraphicsScene_QWidget(long scene, long parent);


/**
Constructs a QGraphicsView. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QGraphicsView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QGraphicsView. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QWidget QWidget}'s constructor.
*/

    public QGraphicsView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsView_QWidget(long parent);

/**
This property holds the alignment of the scene in the view when the whole scene is visible.  If the whole scene is visible in the view, (i.e., there are no visible scroll bars,) the view's alignment will decide where the scene will be rendered in the view. For example, if the alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter }, which is default, the scene will be centered in the view, and if the alignment is ({@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }), the scene will be rendered in the top-left corner of the view.
*/

    @com.trolltech.qt.QtPropertyReader(name="alignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
This property holds the background brush of the scene.  This property sets the background brush for the scene in this view. It is used to override the scene's own background, and defines the behavior of {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}. To provide custom background drawing for this view, you can reimplement {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} instead. <p>By default, this property contains a brush with the {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } pattern. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#backgroundBrush() QGraphicsScene::backgroundBrush}, and {@link QGraphicsView#foregroundBrush() foregroundBrush}. <br></DD></DT>
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
This property holds which parts of the view are cached. QGraphicsView can cache pre-rendered content in a {@link com.trolltech.qt.gui.QPixmap QPixmap}, which is then drawn onto the viewport. The purpose of such caching is to speed up the total rendering time for areas that are slow to render. Texture, gradient and alpha blended backgrounds, for example, can be notibly slow to render; especially with a transformed view. The {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheBackground } flag enables caching of the view's background. For example: <pre class="snippet">
        QGraphicsView view = new QGraphicsView();
        view.setBackgroundBrush(new QBrush(new QImage(":/images/backgroundtile.png")));
        view.setCacheMode(QGraphicsView.CacheModeFlag.CacheBackground);
</pre> The cache is invalidated every time the view is transformed. However, when scrolling, only partial invalidation is required. <p>By default, nothing is cached. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#resetCachedContent() resetCachedContent()}, and {@link com.trolltech.qt.gui.QPixmapCache QPixmapCache}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="cacheMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.CacheMode cacheMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QGraphicsView.CacheMode(__qt_cacheMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_cacheMode(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Scrolls the contents of the viewport to ensure that <tt>item</tt> is centered in the view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void centerOn(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_centerOn_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_centerOn_QGraphicsItem(long __this__nativeId, long item);

/**
Scrolls the contents of the viewport to ensure that the scene coordinate <tt>pos</tt>, is centered in the view. <p>Because <tt>pos</tt> is a floating point coordinate, and the scroll bars operate on integer coordinates, the centering is only an approximation. <p><b>Note:</b> If the item is close to or outside the border, it will be visible in the view, but not centered. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void centerOn(com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_centerOn_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_centerOn_QPointF(long __this__nativeId, long pos);

/**
This is an overloaded member function, provided for convenience. <p>This function is provided for convenience. It's equivalent to calling centerOn({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final void centerOn(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_centerOn_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_centerOn_double_double(long __this__nativeId, double x, double y);

/**
This property holds the behavior for dragging the mouse over the scene while the left mouse button is pressed.  This property defines what should happen when the user clicks on the scene background and drags the mouse (e.g., scrolling the viewport contents using a pointing hand cursor, or selecting multiple items with a rubber band). The default value, {@link com.trolltech.qt.gui.QGraphicsView.DragMode NoDrag }, does nothing. <p>This behavior only affects mouse clicks that are not handled by any item. You can define a custom behavior by creating a subclass of QGraphicsView and reimplementing {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}.
*/

    @com.trolltech.qt.QtPropertyReader(name="dragMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.DragMode dragMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsView.DragMode.resolve(__qt_dragMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dragMode(long __this__nativeId);


/**
This is an overloaded member function, provided for convenience. <p>Scrolls the contents of the viewport so that the center of item <tt>item</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface item, int xmargin) {
        ensureVisible(item, xmargin, (int)50);
    }

/**
This is an overloaded member function, provided for convenience. <p>Scrolls the contents of the viewport so that the center of item <tt>item</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface item) {
        ensureVisible(item, (int)50, (int)50);
    }
/**
This is an overloaded member function, provided for convenience. <p>Scrolls the contents of the viewport so that the center of item <tt>item</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface item, int xmargin, int ymargin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureVisible_QGraphicsItem_int_int(nativeId(), item == null ? 0 : item.nativeId(), xmargin, ymargin);
    }
    @QtBlockedSlot
    native void __qt_ensureVisible_QGraphicsItem_int_int(long __this__nativeId, long item, int xmargin, int ymargin);


/**
Scrolls the contents of the viewport so that the scene rectangle <tt>rect</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified rect cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.core.QRectF rect, int xmargin) {
        ensureVisible(rect, xmargin, (int)50);
    }

/**
Scrolls the contents of the viewport so that the scene rectangle <tt>rect</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified rect cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensureVisible(com.trolltech.qt.core.QRectF rect) {
        ensureVisible(rect, (int)50, (int)50);
    }
/**
Scrolls the contents of the viewport so that the scene rectangle <tt>rect</tt> is visible, with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified rect cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>This function is provided for convenience. It's equivalent to calling ensureVisible({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>xmargin</tt>, <tt>ymargin</tt>).
*/

    @QtBlockedSlot
    public final void ensureVisible(double x, double y, double w, double h, int xmargin) {
        ensureVisible(x, y, w, h, xmargin, (int)50);
    }

/**
This is an overloaded member function, provided for convenience. <p>This function is provided for convenience. It's equivalent to calling ensureVisible({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>xmargin</tt>, <tt>ymargin</tt>).
*/

    @QtBlockedSlot
    public final void ensureVisible(double x, double y, double w, double h) {
        ensureVisible(x, y, w, h, (int)50, (int)50);
    }
/**
This is an overloaded member function, provided for convenience. <p>This function is provided for convenience. It's equivalent to calling ensureVisible({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>xmargin</tt>, <tt>ymargin</tt>).
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
This is an overloaded member function, provided for convenience. <p>Ensures that <tt>item</tt> fits tightly inside the view, scaling the view according to <tt>aspectRatioMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(com.trolltech.qt.gui.QGraphicsItemInterface item) {
        fitInView(item, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio);
    }
/**
This is an overloaded member function, provided for convenience. <p>Ensures that <tt>item</tt> fits tightly inside the view, scaling the view according to <tt>aspectRatioMode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(com.trolltech.qt.gui.QGraphicsItemInterface item, com.trolltech.qt.core.Qt.AspectRatioMode aspectRadioMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (item == null)
            throw new NullPointerException("Argument 'item': null not expected.");
        __qt_fitInView_QGraphicsItem_AspectRatioMode(nativeId(), item == null ? 0 : item.nativeId(), aspectRadioMode.value());
    }
    @QtBlockedSlot
    native void __qt_fitInView_QGraphicsItem_AspectRatioMode(long __this__nativeId, long item, int aspectRadioMode);


/**
Scales the view matrix and scrolls the scroll bars to ensure that the scene rectangle <tt>rect</tt> fits inside the viewport. <tt>rect</tt> must be inside the scene rect; otherwise, {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} cannot guarantee that the whole rect is visible. <p>This function keeps the view's rotation, translation, or shear. The view is scaled according to <tt>aspectRatioMode</tt>. <tt>rect</tt> will be centered in the view if it does not fit tightly. <p>It's common to call {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} from inside a reimplementation of {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, to ensure that the whole scene, or parts of the scene, scales automatically to fit the new size of the viewport as the view is resized. Note though, that calling {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} from inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} can lead to unwanted resize recursion, if the new transformation toggles the automatic state of the scrollbars. You can toggle the scrollbar policies to always on or always off to prevent this (see horizontalScrollBarPolicy() and verticalScrollBarPolicy()). <p>If <tt>rect</tt> is empty, or if the viewport is too small, this function will do nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(com.trolltech.qt.core.QRectF rect) {
        fitInView(rect, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio);
    }
/**
Scales the view matrix and scrolls the scroll bars to ensure that the scene rectangle <tt>rect</tt> fits inside the viewport. <tt>rect</tt> must be inside the scene rect; otherwise, {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} cannot guarantee that the whole rect is visible. <p>This function keeps the view's rotation, translation, or shear. The view is scaled according to <tt>aspectRatioMode</tt>. <tt>rect</tt> will be centered in the view if it does not fit tightly. <p>It's common to call {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} from inside a reimplementation of {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, to ensure that the whole scene, or parts of the scene, scales automatically to fit the new size of the viewport as the view is resized. Note though, that calling {@link com.trolltech.qt.gui.QGraphicsView#fitInView(com.trolltech.qt.gui.QGraphicsItemInterface) fitInView()} from inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} can lead to unwanted resize recursion, if the new transformation toggles the automatic state of the scrollbars. You can toggle the scrollbar policies to always on or always off to prevent this (see horizontalScrollBarPolicy() and verticalScrollBarPolicy()). <p>If <tt>rect</tt> is empty, or if the viewport is too small, this function will do nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.core.Qt.AspectRatioMode aspectRadioMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fitInView_QRectF_AspectRatioMode(nativeId(), rect == null ? 0 : rect.nativeId(), aspectRadioMode.value());
    }
    @QtBlockedSlot
    native void __qt_fitInView_QRectF_AspectRatioMode(long __this__nativeId, long rect, int aspectRadioMode);


/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling fitInView({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>aspectRatioMode</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(double x, double y, double w, double h) {
        fitInView(x, y, w, h, com.trolltech.qt.core.Qt.AspectRatioMode.IgnoreAspectRatio);
    }
/**
This is an overloaded member function, provided for convenience. <p>This convenience function is equivalent to calling fitInView({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>aspectRatioMode</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#ensureVisible(com.trolltech.qt.gui.QGraphicsItemInterface, int) ensureVisible()}, and {@link com.trolltech.qt.gui.QGraphicsView#centerOn(com.trolltech.qt.gui.QGraphicsItemInterface) centerOn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void fitInView(double x, double y, double w, double h, com.trolltech.qt.core.Qt.AspectRatioMode aspectRadioMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fitInView_double_double_double_double_AspectRatioMode(nativeId(), x, y, w, h, aspectRadioMode.value());
    }
    @QtBlockedSlot
    native void __qt_fitInView_double_double_double_double_AspectRatioMode(long __this__nativeId, double x, double y, double w, double h, int aspectRadioMode);

/**
This property holds the foreground brush of the scene.  This property sets the foreground brush for the scene in this view. It is used to override the scene's own foreground, and defines the behavior of {@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}. To provide custom foreground drawing for this view, you can reimplement {@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} instead. <p>By default, this property contains a brush with the {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } pattern. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#foregroundBrush() QGraphicsScene::foregroundBrush}, and {@link QGraphicsView#backgroundBrush() backgroundBrush}. <br></DD></DT>
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

*/

    public final void invalidateScene(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsScene.SceneLayer ... layers) {
        this.invalidateScene(rect, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(layers));
    }

/**
Invalidates and schedules a redraw of <tt>layers</tt> inside <tt>rect</tt>. <tt>rect</tt> is in scene coordinates. Any cached content for <tt>layers</tt> inside <tt>rect</tt> is unconditionally invalidated and redrawn. <p>You can call this function to notify QGraphicsView of changes to the background or the foreground of the scene. It is commonly used for scenes with tile-based backgrounds to notify changes when QGraphicsView has enabled background caching. <p>Note that QGraphicsView currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QWidget#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer QGraphicsScene::BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#invalidate(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) QGraphicsScene::invalidate()}, and {@link com.trolltech.qt.gui.QWidget#update() update()}. <br></DD></DT>
*/

    public final void invalidateScene(com.trolltech.qt.core.QRectF rect) {
        invalidateScene(rect, new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(65535));
    }

/**
Invalidates and schedules a redraw of <tt>layers</tt> inside <tt>rect</tt>. <tt>rect</tt> is in scene coordinates. Any cached content for <tt>layers</tt> inside <tt>rect</tt> is unconditionally invalidated and redrawn. <p>You can call this function to notify QGraphicsView of changes to the background or the foreground of the scene. It is commonly used for scenes with tile-based backgrounds to notify changes when QGraphicsView has enabled background caching. <p>Note that QGraphicsView currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QWidget#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer QGraphicsScene::BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#invalidate(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) QGraphicsScene::invalidate()}, and {@link com.trolltech.qt.gui.QWidget#update() update()}. <br></DD></DT>
*/

    public final void invalidateScene() {
        invalidateScene((com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), new com.trolltech.qt.gui.QGraphicsScene.SceneLayers(65535));
    }
/**
Invalidates and schedules a redraw of <tt>layers</tt> inside <tt>rect</tt>. <tt>rect</tt> is in scene coordinates. Any cached content for <tt>layers</tt> inside <tt>rect</tt> is unconditionally invalidated and redrawn. <p>You can call this function to notify QGraphicsView of changes to the background or the foreground of the scene. It is commonly used for scenes with tile-based backgrounds to notify changes when QGraphicsView has enabled background caching. <p>Note that QGraphicsView currently supports background caching only (see {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag QGraphicsView::CacheBackground }). This function is equivalent to calling {@link com.trolltech.qt.gui.QWidget#update() update()} if any layer but {@link com.trolltech.qt.gui.QGraphicsScene.SceneLayer QGraphicsScene::BackgroundLayer } is passed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#invalidate(com.trolltech.qt.core.QRectF, com.trolltech.qt.gui.QGraphicsScene.SceneLayer[]) QGraphicsScene::invalidate()}, and {@link com.trolltech.qt.gui.QWidget#update() update()}. <br></DD></DT>
*/

    public final void invalidateScene(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsScene.SceneLayers layers)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidateScene_QRectF_SceneLayers(nativeId(), rect == null ? 0 : rect.nativeId(), layers.value());
    }
    native void __qt_invalidateScene_QRectF_SceneLayers(long __this__nativeId, long rect, int layers);

/**
This property holds whether the view allowed scene interaction.  If enabled, this view is set to allow scene interaction. Otherwise, this view will not allow interaction, and any mouse or key events are ignored (i.e., it will act as a read-only view). <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="interactive")
    @QtBlockedSlot
    public final boolean isInteractive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isInteractive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isInteractive(long __this__nativeId);

/**
Returns the item at position <tt>pos</tt>, which is in viewport coordinates. If there are several items at this position, this function returns the topmost item. <p>Example: <pre class="snippet">
    protected void mousePressEvent(QMouseEvent event)
    {
        QGraphicsItemInterface item = itemAt(event.pos());
        if (item != null) {
            System.out.println("You clicked on item " + item);
        } else {
            System.out.println("You didn't click on an item.");
        }
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#items() items()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface itemAt(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_itemAt_QPoint(long __this__nativeId, long pos);

/**
This is an overloaded member function, provided for convenience. <p>This function is provided for convenience. It's equivalent to calling itemAt({@link com.trolltech.qt.core.QPoint QPoint}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface itemAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_itemAt_int_int(long __this__nativeId, int x, int y);

/**
Returns a list of all the items in the associated scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#items() QGraphicsScene::items()}. <br></DD></DT>
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
Returns a list of all the items that are either
contained by or intersect with <tt>path</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPainterPath path) {
        return items(path, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a list of all the items that, depending on <tt>mode</tt>, are either contained by or intersect with <tt>path</tt>. <tt>path</tt> is in viewport coordinates. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>path</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, {@link com.trolltech.qt.gui.QGraphicsView#items() items()}, and {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
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
Returns a list of all the items at the position <tt>pos</tt> in the view. The items are listed in descending Z order (i.e., the first item in the list is the top-most item, and the last item is the bottom-most item). <tt>pos</tt> is in viewport coordinates. <p>This function is most commonly called from within mouse event handlers in a subclass in QGraphicsView. <tt>pos</tt> is in untransformed viewport coordinates, just like {@link com.trolltech.qt.gui.QMouseEvent#pos() QMouseEvent::pos()}. <pre class="snippet">
    protected void mousePressEvent(QMouseEvent event)
    {
        System.out.println("There are " + items(event.pos()).size()
                           + " items at position " + mapToScene(event.pos()));
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#items() QGraphicsScene::items()}, and {@link com.trolltech.qt.gui.QGraphicsItem#zValue() QGraphicsItem::zValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QPoint(long __this__nativeId, long pos);


/**
Returns a list of all the items that are either contained by or
intersect with <tt>polygon</tt>. <tt>polygon</tt> is in viewport
coordinates.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPolygon polygon) {
        return items(polygon, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a list of all the items that, depending on <tt>mode</tt>, are either contained by or intersect with <tt>polygon</tt>. <tt>polygon</tt> is in viewport coordinates. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>polygon</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, {@link com.trolltech.qt.gui.QGraphicsView#items() items()}, and {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.gui.QPolygon polygon, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QPolygon_ItemSelectionMode(nativeId(), polygon == null ? 0 : polygon.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QPolygon_ItemSelectionMode(long __this__nativeId, long polygon, int mode);


/**
Returns a list of all the items that are either contained by or
intersect with <tt>rect</tt>. <tt>rect</tt> is in viewport
coordinates.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QRect rect) {
        return items(rect, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a list of all the items that, depending on <tt>mode</tt>, are either contained by or intersect with <tt>rect</tt>. <tt>rect</tt> is in viewport coordinates. <p>The default value for <tt>mode</tt> is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose exact shape intersects with or is contained by <tt>rect</tt> are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#itemAt(com.trolltech.qt.core.QPoint) itemAt()}, {@link com.trolltech.qt.gui.QGraphicsView#items() items()}, and {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QRect_ItemSelectionMode(nativeId(), rect == null ? 0 : rect.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_QRect_ItemSelectionMode(long __this__nativeId, long rect, int mode);

/**
This function is provided for convenience. It's equivalent to calling items({@link com.trolltech.qt.core.QPoint QPoint}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_int_int(long __this__nativeId, int x, int y);


/**
This convenience function is equivalent to calling
items(QRectF(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(int x, int y, int w, int h) {
        return items(x, y, w, h, com.trolltech.qt.core.Qt.ItemSelectionMode.IntersectsItemShape);
    }
/**
This convenience function is equivalent to calling items({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>), <tt>mode</tt>).
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> items(int x, int y, int w, int h, com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_int_int_int_int_ItemSelectionMode(nativeId(), x, y, w, h, mode.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QGraphicsItemInterface> __qt_items_int_int_int_int_ItemSelectionMode(long __this__nativeId, int x, int y, int w, int h, int mode);

/**
Returns the scene coordinate painter path <tt>path</tt> to a viewport coordinate painter path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
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
Returns the scene coordinate <tt>point</tt> to viewport coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapFromScene(com.trolltech.qt.core.QPointF point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapFromScene_QPointF(long __this__nativeId, long point);

/**
Returns the scene coordinate polygon <tt>polygon</tt> to a viewport coordinate polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon mapFromScene(com.trolltech.qt.gui.QPolygonF polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_mapFromScene_QPolygonF(long __this__nativeId, long polygon);

/**
Returns the scene rectangle <tt>rect</tt> to a viewport coordinate polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon mapFromScene(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_mapFromScene_QRectF(long __this__nativeId, long rect);

/**
This function is provided for convenience. It's equivalent to calling mapFromScene({@link com.trolltech.qt.core.QPointF QPointF}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapFromScene(double x, double y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_double_double(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapFromScene_double_double(long __this__nativeId, double x, double y);

/**
This function is provided for convenience. It's equivalent to calling mapFromScene({@link com.trolltech.qt.core.QRectF QRectF}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygon mapFromScene(double x, double y, double w, double h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromScene_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygon __qt_mapFromScene_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
Returns the viewport painter path <tt>path</tt> mapped to a scene coordinate painter path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <br></DD></DT>
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
Returns the viewport coordinate <tt>point</tt> mapped to scene coordinates. <p>Note: It can be useful to map the whole rectangle covered by the pixel at <tt>point</tt> instead of the point itself. To do this, you can call mapToScene({@link com.trolltech.qt.core.QRect QRect}(<tt>point</tt>, {@link com.trolltech.qt.core.QSize QSize}(2, 2))). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToScene(com.trolltech.qt.core.QPoint point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QPoint(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToScene_QPoint(long __this__nativeId, long point);

/**
Returns the viewport polygon <tt>polygon</tt> mapped to a scene coordinate polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(com.trolltech.qt.gui.QPolygon polygon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QPolygon(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_QPolygon(long __this__nativeId, long polygon);

/**
Returns the viewport rectangle <tt>rect</tt> mapped to a scene coordinate polygon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_QRect(long __this__nativeId, long rect);

/**
This function is provided for convenience. It's equivalent to calling mapToScene({@link com.trolltech.qt.core.QPoint QPoint}(<tt>x</tt>, <tt>y</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF mapToScene(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mapToScene_int_int(long __this__nativeId, int x, int y);

/**
This function is provided for convenience. It's equivalent to calling mapToScene({@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>)).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF mapToScene(int x, int y, int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToScene_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_mapToScene_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Returns the current transformation matrix for the view. If no current transformation is set, the identity matrix is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix matrix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_matrix(long __this__nativeId);

/**
This property holds flags that can be used to tune QGraphicsView's performance.  QGraphicsView uses clipping, extra bounding rect adjustments, and certain other aids to improve rendering quality and performance for the common case graphics scene. However, depending on the target platform, the scene, and the viewport in use, some of these operations can degrade performance. <p>The effect varies from flag to flag; see the OptimizationFlags documentation for details. <p>By default, no optimization flags are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setOptimizationFlag(com.trolltech.qt.gui.QGraphicsView.OptimizationFlag) setOptimizationFlag()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="optimizationFlags")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.OptimizationFlags optimizationFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QGraphicsView.OptimizationFlags(__qt_optimizationFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_optimizationFlags(long __this__nativeId);


/**
Renders the <tt>source</tt> rect, which is in view coordinates, from the scene into <tt>target</tt>, which is in paint device coordinates, using <tt>painter</tt>. This function is useful for capturing the contents of the view onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing to {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        // scene.addItem(...

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
        // ...

        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);
        QPainter painter = new QPainter(printer);

        // print, fitting the viewport contents into a full page
        view.render(painter);

        // print the upper half of the viewport into the lower.
        // half of the page.
        QRect viewport = view.viewport().rect();
        view.render(painter,
                    new QRectF(0, printer.height() / 2, printer.width(), printer.height() / 2),
                    viewport.adjusted(0, 0, 0, -viewport.height() / 2)
        );

</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}-&gt;rect() to determine what to draw. If <tt>target</tt> is a null rect, the full dimensions of <tt>painter</tt>'s paint device (e.g., for a {@link com.trolltech.qt.gui.QPrinter QPrinter}, the page size) will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target, com.trolltech.qt.core.QRect source) {
        render(painter, target, source, com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }

/**
Renders the <tt>source</tt> rect, which is in view coordinates, from the scene into <tt>target</tt>, which is in paint device coordinates, using <tt>painter</tt>. This function is useful for capturing the contents of the view onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing to {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        // scene.addItem(...

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
        // ...

        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);
        QPainter painter = new QPainter(printer);

        // print, fitting the viewport contents into a full page
        view.render(painter);

        // print the upper half of the viewport into the lower.
        // half of the page.
        QRect viewport = view.viewport().rect();
        view.render(painter,
                    new QRectF(0, printer.height() / 2, printer.width(), printer.height() / 2),
                    viewport.adjusted(0, 0, 0, -viewport.height() / 2)
        );

</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}-&gt;rect() to determine what to draw. If <tt>target</tt> is a null rect, the full dimensions of <tt>painter</tt>'s paint device (e.g., for a {@link com.trolltech.qt.gui.QPrinter QPrinter}, the page size) will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target) {
        render(painter, target, (com.trolltech.qt.core.QRect)new com.trolltech.qt.core.QRect(), com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }

/**
Renders the <tt>source</tt> rect, which is in view coordinates, from the scene into <tt>target</tt>, which is in paint device coordinates, using <tt>painter</tt>. This function is useful for capturing the contents of the view onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing to {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        // scene.addItem(...

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
        // ...

        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);
        QPainter painter = new QPainter(printer);

        // print, fitting the viewport contents into a full page
        view.render(painter);

        // print the upper half of the viewport into the lower.
        // half of the page.
        QRect viewport = view.viewport().rect();
        view.render(painter,
                    new QRectF(0, printer.height() / 2, printer.width(), printer.height() / 2),
                    viewport.adjusted(0, 0, 0, -viewport.height() / 2)
        );

</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}-&gt;rect() to determine what to draw. If <tt>target</tt> is a null rect, the full dimensions of <tt>painter</tt>'s paint device (e.g., for a {@link com.trolltech.qt.gui.QPrinter QPrinter}, the page size) will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter) {
        render(painter, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF(), (com.trolltech.qt.core.QRect)new com.trolltech.qt.core.QRect(), com.trolltech.qt.core.Qt.AspectRatioMode.KeepAspectRatio);
    }
/**
Renders the <tt>source</tt> rect, which is in view coordinates, from the scene into <tt>target</tt>, which is in paint device coordinates, using <tt>painter</tt>. This function is useful for capturing the contents of the view onto a paint device, such as a {@link com.trolltech.qt.gui.QImage QImage} (e.g., to take a screenshot), or for printing to {@link com.trolltech.qt.gui.QPrinter QPrinter}. For example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        // scene.addItem(...

        QGraphicsView view = new QGraphicsView(scene);
        view.show();
        // ...

        QPrinter printer = new QPrinter(QPrinter.PrinterMode.HighResolution);
        printer.setPageSize(QPrinter.PageSize.A4);
        QPainter painter = new QPainter(printer);

        // print, fitting the viewport contents into a full page
        view.render(painter);

        // print the upper half of the viewport into the lower.
        // half of the page.
        QRect viewport = view.viewport().rect();
        view.render(painter,
                    new QRectF(0, printer.height() / 2, printer.width(), printer.height() / 2),
                    viewport.adjusted(0, 0, 0, -viewport.height() / 2)
        );

</pre> If <tt>source</tt> is a null rect, this function will use {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}-&gt;rect() to determine what to draw. If <tt>target</tt> is a null rect, the full dimensions of <tt>painter</tt>'s paint device (e.g., for a {@link com.trolltech.qt.gui.QPrinter QPrinter}, the page size) will be used. <p>The source rect contents will be transformed according to <tt>aspectRatioMode</tt> to fit into the target rect. By default, the aspect ratio is kept, and <tt>source</tt> is scaled to fit in <tt>target</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#render(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF, com.trolltech.qt.core.QRectF) QGraphicsScene::render()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF target, com.trolltech.qt.core.QRect source, com.trolltech.qt.core.Qt.AspectRatioMode aspectRatioMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_QRectF_QRect_AspectRatioMode(nativeId(), painter == null ? 0 : painter.nativeId(), target == null ? 0 : target.nativeId(), source == null ? 0 : source.nativeId(), aspectRatioMode.value());
    }
    @QtBlockedSlot
    native void __qt_render_QPainter_QRectF_QRect_AspectRatioMode(long __this__nativeId, long painter, long target, long source, int aspectRatioMode);

/**
This property holds the default render hints for the view. These hints are used to initialize {@link com.trolltech.qt.gui.QPainter QPainter} before each visible item is drawn. {@link com.trolltech.qt.gui.QPainter QPainter} uses render hints to toggle rendering features such as antialiasing and smooth pixmap transformation. <p>{@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::TextAntialiasing } is enabled by default. <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(new QRectF(-10, -10, 20, 20));

        QGraphicsView view = new QGraphicsView(scene);
        view.setRenderHints(QPainter.RenderHint.Antialiasing, QPainter.RenderHint.SmoothPixmapTransform);
        view.show();
</pre>
*/

    @com.trolltech.qt.QtPropertyReader(name="renderHints")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter.RenderHints renderHints()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPainter.RenderHints(__qt_renderHints(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_renderHints(long __this__nativeId);

/**
Resets any cached content. Calling this function will clear QGraphicsView's cache. If the current cache mode is {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheNone }, this function does nothing. <p>This function is called automatically for you when the {@link QGraphicsView#backgroundBrush() backgroundBrush} or {@link QGraphicsScene#backgroundBrush() QGraphicsScene::backgroundBrush} properties change; you only need to call this function if you have reimplemented {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) QGraphicsScene::drawBackground()} or {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) QGraphicsView::drawBackground()} to draw a custom background, and need to trigger a full redraw. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#cacheMode() cacheMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetCachedContent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetCachedContent(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetCachedContent(long __this__nativeId);

/**
Resets the view transformation matrix to the identity matrix.
*/

    @QtBlockedSlot
    public final void resetMatrix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetMatrix(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetMatrix(long __this__nativeId);

/**
Resets the view transformation to the identity matrix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#transform() transform()}, and {@link com.trolltech.qt.gui.QGraphicsView#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <br></DD></DT>
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
This property holds how the view should position the scene when the view is resized.  QGraphicsView uses this property to decide how to position the scene in the viewport when the viewport widget's size changes. The default behavior, {@link com.trolltech.qt.gui.QGraphicsView.ViewportAnchor NoAnchor }, leaves the scene's position unchanged during a resize; the top-left corner of the view will appear to be anchored while resizing. <p>Note that the effect of this property is noticeable when only a part of the scene is visible (i.e., when there are scroll bars). Otherwise, if the whole scene fits in the view, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} uses the view {@link QGraphicsView#alignment() alignment} to position the scene in the view. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#alignment() alignment}, {@link QGraphicsView#transformationAnchor() transformationAnchor}, and {@link com.trolltech.qt.core.Qt.WindowType Qt::WNorthWestGravity }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="resizeAnchor")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.ViewportAnchor resizeAnchor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsView.ViewportAnchor.resolve(__qt_resizeAnchor(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_resizeAnchor(long __this__nativeId);

/**
Rotates the current view transformation <tt>angle</tt> degrees clockwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
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
This property holds the behavior for selecting items with a rubber band selection rectangle.  This property defines how items are selected when using the {@link com.trolltech.qt.gui.QGraphicsView.DragMode RubberBandDrag } drag mode. <p>The default value is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose shape intersects with or is contained by the rubber band are selected. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#dragMode() dragMode}, and {@link com.trolltech.qt.gui.QGraphicsView#items() items()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="rubberBandSelectionMode")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ItemSelectionMode rubberBandSelectionMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ItemSelectionMode.resolve(__qt_rubberBandSelectionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_rubberBandSelectionMode(long __this__nativeId);

/**
Scales the current view transformation by (<tt>sx</tt>, <tt>sy</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
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
Returns a pointer to the scene that is currently visualized in the view. If no scene is currently visualized, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setScene(com.trolltech.qt.gui.QGraphicsScene) setScene()}. <br></DD></DT>
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
This property holds the area of the scene visualized by this view.  The scene rectangle defines the extent of the scene, and in the view's case, this means the area of the scene that you can navigate using the scroll bars. <p>If unset, or if a null {@link com.trolltech.qt.core.QRectF QRectF} is set, this property has the same value as {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}, and it changes with {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. Otherwise, the view's scene rect is unaffected by the scene. <p>Note that, although the scene supports a virtually unlimited size, the range of the scroll bars will never exceed the range of an integer (INT_MIN, INT_MAX). When the scene is larger than the scroll bars' values, you can choose to use {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()} to navigate the scene instead. <p>By default, this property contains a rectangle at the origin with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This property holds the alignment of the scene in the view when the whole scene is visible.  If the whole scene is visible in the view, (i.e., there are no visible scroll bars,) the view's alignment will decide where the scene will be rendered in the view. For example, if the alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter }, which is default, the scene will be centered in the view, and if the alignment is ({@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }), the scene will be rendered in the top-left corner of the view.
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);

/**
This property holds the background brush of the scene.  This property sets the background brush for the scene in this view. It is used to override the scene's own background, and defines the behavior of {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}. To provide custom background drawing for this view, you can reimplement {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} instead. <p>By default, this property contains a brush with the {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } pattern. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#backgroundBrush() QGraphicsScene::backgroundBrush}, and {@link QGraphicsView#foregroundBrush() foregroundBrush}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final void setCacheMode(com.trolltech.qt.gui.QGraphicsView.CacheModeFlag ... mode) {
        this.setCacheMode(new com.trolltech.qt.gui.QGraphicsView.CacheMode(mode));
    }
/**
This property holds which parts of the view are cached. QGraphicsView can cache pre-rendered content in a {@link com.trolltech.qt.gui.QPixmap QPixmap}, which is then drawn onto the viewport. The purpose of such caching is to speed up the total rendering time for areas that are slow to render. Texture, gradient and alpha blended backgrounds, for example, can be notibly slow to render; especially with a transformed view. The {@link com.trolltech.qt.gui.QGraphicsView.CacheModeFlag CacheBackground } flag enables caching of the view's background. For example: <pre class="snippet">
        QGraphicsView view = new QGraphicsView();
        view.setBackgroundBrush(new QBrush(new QImage(":/images/backgroundtile.png")));
        view.setCacheMode(QGraphicsView.CacheModeFlag.CacheBackground);
</pre> The cache is invalidated every time the view is transformed. However, when scrolling, only partial invalidation is required. <p>By default, nothing is cached. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#resetCachedContent() resetCachedContent()}, and {@link com.trolltech.qt.gui.QPixmapCache QPixmapCache}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="cacheMode")
    @QtBlockedSlot
    public final void setCacheMode(com.trolltech.qt.gui.QGraphicsView.CacheMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCacheMode_CacheMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setCacheMode_CacheMode(long __this__nativeId, int mode);

/**
This property holds the behavior for dragging the mouse over the scene while the left mouse button is pressed.  This property defines what should happen when the user clicks on the scene background and drags the mouse (e.g., scrolling the viewport contents using a pointing hand cursor, or selecting multiple items with a rubber band). The default value, {@link com.trolltech.qt.gui.QGraphicsView.DragMode NoDrag }, does nothing. <p>This behavior only affects mouse clicks that are not handled by any item. You can define a custom behavior by creating a subclass of QGraphicsView and reimplementing {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}.
*/

    @com.trolltech.qt.QtPropertyWriter(name="dragMode")
    @QtBlockedSlot
    public final void setDragMode(com.trolltech.qt.gui.QGraphicsView.DragMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragMode_DragMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setDragMode_DragMode(long __this__nativeId, int mode);

/**
This property holds the foreground brush of the scene.  This property sets the foreground brush for the scene in this view. It is used to override the scene's own foreground, and defines the behavior of {@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}. To provide custom foreground drawing for this view, you can reimplement {@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} instead. <p>By default, this property contains a brush with the {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } pattern. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#foregroundBrush() QGraphicsScene::foregroundBrush}, and {@link QGraphicsView#backgroundBrush() backgroundBrush}. <br></DD></DT>
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
This property holds whether the view allowed scene interaction.  If enabled, this view is set to allow scene interaction. Otherwise, this view will not allow interaction, and any mouse or key events are ignored (i.e., it will act as a read-only view). <p>By default, this property is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="interactive")
    @QtBlockedSlot
    public final void setInteractive(boolean allowed)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInteractive_boolean(nativeId(), allowed);
    }
    @QtBlockedSlot
    native void __qt_setInteractive_boolean(long __this__nativeId, boolean allowed);


/**
Sets the view's current transformation matrix to <tt>matrix</tt>. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current matrix; otherwise, <tt>matrix</tt>replaces the current matrix. <tt>combine</tt> is false by default. <p>The transformation matrix tranforms the scene into view coordinates. Using the default transformation, provided by the identity matrix, one pixel in the view represents one unit in the scene (e.g., a 10x10 rectangular item is drawn using 10x10 pixels in the view). If a 2x2 scaling matrix is applied, the scene will be drawn in 1:2 (e.g., a 10x10 rectangular item is then drawn using 20x20 pixels in the view). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("GraphicsView rotated clockwise");

        QGraphicsView view = new QGraphicsView(scene);
        view.rotate(90); // the text is rendered with a 90 degree clockwise rotation
        view.show();
</pre> To simplify interation with items using a transformed view, QGraphicsView provides mapTo... and mapFrom... functions that can translate between scene and view coordinates. For example, you can call {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} to map a view coordinate to a floating point scene coordinate, or {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} to map from floating point scene coordinates to view coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(com.trolltech.qt.gui.QMatrix matrix) {
        setMatrix(matrix, (boolean)false);
    }
/**
Sets the view's current transformation matrix to <tt>matrix</tt>. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current matrix; otherwise, <tt>matrix</tt>replaces the current matrix. <tt>combine</tt> is false by default. <p>The transformation matrix tranforms the scene into view coordinates. Using the default transformation, provided by the identity matrix, one pixel in the view represents one unit in the scene (e.g., a 10x10 rectangular item is drawn using 10x10 pixels in the view). If a 2x2 scaling matrix is applied, the scene will be drawn in 1:2 (e.g., a 10x10 rectangular item is then drawn using 20x20 pixels in the view). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("GraphicsView rotated clockwise");

        QGraphicsView view = new QGraphicsView(scene);
        view.rotate(90); // the text is rendered with a 90 degree clockwise rotation
        view.show();
</pre> To simplify interation with items using a transformed view, QGraphicsView provides mapTo... and mapFrom... functions that can translate between scene and view coordinates. For example, you can call {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} to map a view coordinate to a floating point scene coordinate, or {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} to map from floating point scene coordinates to view coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(com.trolltech.qt.gui.QMatrix matrix, boolean combine)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMatrix_QMatrix_boolean(nativeId(), matrix == null ? 0 : matrix.nativeId(), combine);
    }
    @QtBlockedSlot
    native void __qt_setMatrix_QMatrix_boolean(long __this__nativeId, long matrix, boolean combine);


/**
Enables <tt>flag</tt> if <tt>enabled</tt> is true; otherwise disables <tt>flag</tt>. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#optimizationFlags() optimizationFlags}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOptimizationFlag(com.trolltech.qt.gui.QGraphicsView.OptimizationFlag flag) {
        setOptimizationFlag(flag, (boolean)true);
    }
/**
Enables <tt>flag</tt> if <tt>enabled</tt> is true; otherwise disables <tt>flag</tt>. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#optimizationFlags() optimizationFlags}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOptimizationFlag(com.trolltech.qt.gui.QGraphicsView.OptimizationFlag flag, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptimizationFlag_OptimizationFlag_boolean(nativeId(), flag.value(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setOptimizationFlag_OptimizationFlag_boolean(long __this__nativeId, int flag, boolean enabled);


/**

*/

    @QtBlockedSlot
    public final void setOptimizationFlags(com.trolltech.qt.gui.QGraphicsView.OptimizationFlag ... flags) {
        this.setOptimizationFlags(new com.trolltech.qt.gui.QGraphicsView.OptimizationFlags(flags));
    }
/**
This property holds flags that can be used to tune QGraphicsView's performance.  QGraphicsView uses clipping, extra bounding rect adjustments, and certain other aids to improve rendering quality and performance for the common case graphics scene. However, depending on the target platform, the scene, and the viewport in use, some of these operations can degrade performance. <p>The effect varies from flag to flag; see the OptimizationFlags documentation for details. <p>By default, no optimization flags are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setOptimizationFlag(com.trolltech.qt.gui.QGraphicsView.OptimizationFlag) setOptimizationFlag()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="optimizationFlags")
    @QtBlockedSlot
    public final void setOptimizationFlags(com.trolltech.qt.gui.QGraphicsView.OptimizationFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptimizationFlags_OptimizationFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setOptimizationFlags_OptimizationFlags(long __this__nativeId, int flags);


/**
If <tt>enabled</tt> is true, the render hint <tt>hint</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#renderHints() renderHints}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint hint) {
        setRenderHint(hint, (boolean)true);
    }
/**
If <tt>enabled</tt> is true, the render hint <tt>hint</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#renderHints() renderHints}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRenderHint(com.trolltech.qt.gui.QPainter.RenderHint hint, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRenderHint_RenderHint_boolean(nativeId(), hint.value(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setRenderHint_RenderHint_boolean(long __this__nativeId, int hint, boolean enabled);


/**

*/

    @QtBlockedSlot
    public final void setRenderHints(com.trolltech.qt.gui.QPainter.RenderHint ... hints) {
        this.setRenderHints(new com.trolltech.qt.gui.QPainter.RenderHints(hints));
    }
/**
This property holds the default render hints for the view. These hints are used to initialize {@link com.trolltech.qt.gui.QPainter QPainter} before each visible item is drawn. {@link com.trolltech.qt.gui.QPainter QPainter} uses render hints to toggle rendering features such as antialiasing and smooth pixmap transformation. <p>{@link com.trolltech.qt.gui.QPainter.RenderHint QPainter::TextAntialiasing } is enabled by default. <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addRect(new QRectF(-10, -10, 20, 20));

        QGraphicsView view = new QGraphicsView(scene);
        view.setRenderHints(QPainter.RenderHint.Antialiasing, QPainter.RenderHint.SmoothPixmapTransform);
        view.show();
</pre>
*/

    @com.trolltech.qt.QtPropertyWriter(name="renderHints")
    @QtBlockedSlot
    public final void setRenderHints(com.trolltech.qt.gui.QPainter.RenderHints hints)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRenderHints_RenderHints(nativeId(), hints.value());
    }
    @QtBlockedSlot
    native void __qt_setRenderHints_RenderHints(long __this__nativeId, int hints);

/**
This property holds how the view should position the scene when the view is resized.  QGraphicsView uses this property to decide how to position the scene in the viewport when the viewport widget's size changes. The default behavior, {@link com.trolltech.qt.gui.QGraphicsView.ViewportAnchor NoAnchor }, leaves the scene's position unchanged during a resize; the top-left corner of the view will appear to be anchored while resizing. <p>Note that the effect of this property is noticeable when only a part of the scene is visible (i.e., when there are scroll bars). Otherwise, if the whole scene fits in the view, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} uses the view {@link QGraphicsView#alignment() alignment} to position the scene in the view. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#alignment() alignment}, {@link QGraphicsView#transformationAnchor() transformationAnchor}, and {@link com.trolltech.qt.core.Qt.WindowType Qt::WNorthWestGravity }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="resizeAnchor")
    @QtBlockedSlot
    public final void setResizeAnchor(com.trolltech.qt.gui.QGraphicsView.ViewportAnchor anchor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeAnchor_ViewportAnchor(nativeId(), anchor.value());
    }
    @QtBlockedSlot
    native void __qt_setResizeAnchor_ViewportAnchor(long __this__nativeId, int anchor);

/**
This property holds the behavior for selecting items with a rubber band selection rectangle.  This property defines how items are selected when using the {@link com.trolltech.qt.gui.QGraphicsView.DragMode RubberBandDrag } drag mode. <p>The default value is {@link com.trolltech.qt.core.Qt.ItemSelectionMode Qt::IntersectsItemShape }; all items whose shape intersects with or is contained by the rubber band are selected. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#dragMode() dragMode}, and {@link com.trolltech.qt.gui.QGraphicsView#items() items()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="rubberBandSelectionMode")
    @QtBlockedSlot
    public final void setRubberBandSelectionMode(com.trolltech.qt.core.Qt.ItemSelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRubberBandSelectionMode_ItemSelectionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setRubberBandSelectionMode_ItemSelectionMode(long __this__nativeId, int mode);

/**
Sets the current scene to <tt>scene</tt>. If <tt>scene</tt> is already being viewed, this function does nothing. <p>When a scene is set on a view, the {@link com.trolltech.qt.gui.QGraphicsScene#changed QGraphicsScene::changed() } signal is automatically connected to this view's {@link com.trolltech.qt.gui.QGraphicsView#updateScene(java.util.List) updateScene()} slot, and the view's scroll bars are adjusted to fit the size of the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#scene() scene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScene(com.trolltech.qt.gui.QGraphicsScene scene)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcScene = scene;
        }
        __qt_setScene_QGraphicsScene(nativeId(), scene == null ? 0 : scene.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScene_QGraphicsScene(long __this__nativeId, long scene);

/**
This property holds the area of the scene visualized by this view.  The scene rectangle defines the extent of the scene, and in the view's case, this means the area of the scene that you can navigate using the scroll bars. <p>If unset, or if a null {@link com.trolltech.qt.core.QRectF QRectF} is set, this property has the same value as {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}, and it changes with {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. Otherwise, the view's scene rect is unaffected by the scene. <p>Note that, although the scene supports a virtually unlimited size, the range of the scroll bars will never exceed the range of an integer (INT_MIN, INT_MAX). When the scene is larger than the scroll bars' values, you can choose to use {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()} to navigate the scene instead. <p>By default, this property contains a rectangle at the origin with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. <br></DD></DT>
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
This property holds the area of the scene visualized by this view.  The scene rectangle defines the extent of the scene, and in the view's case, this means the area of the scene that you can navigate using the scroll bars. <p>If unset, or if a null {@link com.trolltech.qt.core.QRectF QRectF} is set, this property has the same value as {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}, and it changes with {@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. Otherwise, the view's scene rect is unaffected by the scene. <p>Note that, although the scene supports a virtually unlimited size, the range of the scroll bars will never exceed the range of an integer (INT_MIN, INT_MAX). When the scene is larger than the scroll bars' values, you can choose to use {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()} to navigate the scene instead. <p>By default, this property contains a rectangle at the origin with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QGraphicsScene#sceneRect() QGraphicsScene::sceneRect}. <br></DD></DT>
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
Sets the view's current transformation matrix to <tt>matrix</tt>. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current matrix; otherwise, <tt>matrix</tt>replaces the current matrix. <tt>combine</tt> is false by default. <p>The transformation matrix tranforms the scene into view coordinates. Using the default transformation, provided by the identity matrix, one pixel in the view represents one unit in the scene (e.g., a 10x10 rectangular item is drawn using 10x10 pixels in the view). If a 2x2 scaling matrix is applied, the scene will be drawn in 1:2 (e.g., a 10x10 rectangular item is then drawn using 20x20 pixels in the view). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("GraphicsView rotated clockwise");

        QGraphicsView view = new QGraphicsView(scene);
        view.rotate(90); // the text is rendered with a 90 degree clockwise rotation
        view.show();
</pre> To simplify interation with items using a transformed view, QGraphicsView provides mapTo... and mapFrom... functions that can translate between scene and view coordinates. For example, you can call {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} to map a view coordiate to a floating point scene coordinate, or {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} to map from floating point scene coordinates to view coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTransform(com.trolltech.qt.gui.QTransform matrix) {
        setTransform(matrix, (boolean)false);
    }
/**
Sets the view's current transformation matrix to <tt>matrix</tt>. <p>If <tt>combine</tt> is true, then <tt>matrix</tt> is combined with the current matrix; otherwise, <tt>matrix</tt>replaces the current matrix. <tt>combine</tt> is false by default. <p>The transformation matrix tranforms the scene into view coordinates. Using the default transformation, provided by the identity matrix, one pixel in the view represents one unit in the scene (e.g., a 10x10 rectangular item is drawn using 10x10 pixels in the view). If a 2x2 scaling matrix is applied, the scene will be drawn in 1:2 (e.g., a 10x10 rectangular item is then drawn using 20x20 pixels in the view). <p>Example: <pre class="snippet">
        QGraphicsScene scene = new QGraphicsScene();
        scene.addText("GraphicsView rotated clockwise");

        QGraphicsView view = new QGraphicsView(scene);
        view.rotate(90); // the text is rendered with a 90 degree clockwise rotation
        view.show();
</pre> To simplify interation with items using a transformed view, QGraphicsView provides mapTo... and mapFrom... functions that can translate between scene and view coordinates. For example, you can call {@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()} to map a view coordiate to a floating point scene coordinate, or {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()} to map from floating point scene coordinates to view coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#transform() transform()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
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
This property holds how the view should position the scene during transformations.  QGraphicsView uses this property to decide how to position the scene in the viewport when the transformation matrix changes, and the coordinate system of the view is transformed. The default behavior, {@link com.trolltech.qt.gui.QGraphicsView.ViewportAnchor AnchorViewCenter }, ensures that the scene point at the center of the view remains unchanged during transformations (e.g., when rotating, the scene will appear to rotate around the center of the view). <p>Note that the effect of this property is noticeable when only a part of the scene is visible (i.e., when there are scroll bars). Otherwise, if the whole scene fits in the view, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} uses the view {@link QGraphicsView#alignment() alignment} to position the scene in the view. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#alignment() alignment}, and {@link QGraphicsView#resizeAnchor() resizeAnchor}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="transformationAnchor")
    @QtBlockedSlot
    public final void setTransformationAnchor(com.trolltech.qt.gui.QGraphicsView.ViewportAnchor anchor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTransformationAnchor_ViewportAnchor(nativeId(), anchor.value());
    }
    @QtBlockedSlot
    native void __qt_setTransformationAnchor_ViewportAnchor(long __this__nativeId, int anchor);

/**
This property holds how the viewport should update its contents.  QGraphicsView uses this property to decide how to update areas of the scene that have been reexposed or changed. Usually you do not need to modify this property, but there are some cases where doing so can improve rendering performance. See the {@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode ViewportUpdateMode } documentation for specific details. <p>The default value is {@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode MinimalViewportUpdate }, where QGraphicsView will update as small an area of the viewport as possible when the contents change. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode ViewportUpdateMode }, and {@link QGraphicsView#cacheMode() cacheMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewportUpdateMode")
    @QtBlockedSlot
    public final void setViewportUpdateMode(com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewportUpdateMode_ViewportUpdateMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setViewportUpdateMode_ViewportUpdateMode(long __this__nativeId, int mode);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    protected void setupViewport(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setupViewport_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setupViewport_QWidget(long __this__nativeId, long widget);

/**
Shears the current view transformation by (<tt>sh</tt>, <tt>sv</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
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
Returns the current transformation matrix for the view. If no current transformation is set, the identity matrix is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, {@link com.trolltech.qt.gui.QGraphicsView#scale(double, double) scale()}, {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}, and {@link com.trolltech.qt.gui.QGraphicsView#translate(double, double) translate()}. <br></DD></DT>
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
This property holds how the view should position the scene during transformations.  QGraphicsView uses this property to decide how to position the scene in the viewport when the transformation matrix changes, and the coordinate system of the view is transformed. The default behavior, {@link com.trolltech.qt.gui.QGraphicsView.ViewportAnchor AnchorViewCenter }, ensures that the scene point at the center of the view remains unchanged during transformations (e.g., when rotating, the scene will appear to rotate around the center of the view). <p>Note that the effect of this property is noticeable when only a part of the scene is visible (i.e., when there are scroll bars). Otherwise, if the whole scene fits in the view, {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene} uses the view {@link QGraphicsView#alignment() alignment} to position the scene in the view. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#alignment() alignment}, and {@link QGraphicsView#resizeAnchor() resizeAnchor}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="transformationAnchor")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.ViewportAnchor transformationAnchor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsView.ViewportAnchor.resolve(__qt_transformationAnchor(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_transformationAnchor(long __this__nativeId);

/**
Translates the current view transformation by (<tt>dx</tt>, <tt>dy</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}, {@link com.trolltech.qt.gui.QGraphicsView#matrix() matrix()}, {@link com.trolltech.qt.gui.QGraphicsView#rotate(double) rotate()}, and {@link com.trolltech.qt.gui.QGraphicsView#shear(double, double) shear()}. <br></DD></DT>
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
Schedules an update of the scene rectangles <tt>rects</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#changed QGraphicsScene::changed() }. <br></DD></DT>
*/

    public final void updateScene(java.util.List<com.trolltech.qt.core.QRectF> rects)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateScene_List(nativeId(), rects);
    }
    native void __qt_updateScene_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QRectF> rects);

/**
Notifies QGraphicsView that the scene's scene rect has changed. <tt>rect</tt> is the new scene rect. If the view already has an explicitly set scene rect, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link QGraphicsView#sceneRect() sceneRect}, and {@link com.trolltech.qt.gui.QGraphicsScene#sceneRectChanged QGraphicsScene::sceneRectChanged() }. <br></DD></DT>
*/

    public final void updateSceneRect(com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateSceneRect_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native void __qt_updateSceneRect_QRectF(long __this__nativeId, long rect);

/**
Returns a matrix that maps viewport coordinates to scene coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#mapToScene(com.trolltech.qt.gui.QPainterPath) mapToScene()}, and {@link com.trolltech.qt.gui.QGraphicsView#mapFromScene(com.trolltech.qt.gui.QPainterPath) mapFromScene()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform viewportTransform()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportTransform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_viewportTransform(long __this__nativeId);

/**
This property holds how the viewport should update its contents.  QGraphicsView uses this property to decide how to update areas of the scene that have been reexposed or changed. Usually you do not need to modify this property, but there are some cases where doing so can improve rendering performance. See the {@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode ViewportUpdateMode } documentation for specific details. <p>The default value is {@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode MinimalViewportUpdate }, where QGraphicsView will update as small an area of the viewport as possible when the contents change. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode ViewportUpdateMode }, and {@link QGraphicsView#cacheMode() cacheMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="viewportUpdateMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode viewportUpdateMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QGraphicsView.ViewportUpdateMode.resolve(__qt_viewportUpdateMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewportUpdateMode(long __this__nativeId);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long event);

/**
Draws the background of the scene using <tt>painter</tt>, before any items and the foreground are drawn. Reimplement this function to provide a custom background for this view. <p>If all you want is to define a color, texture or gradient for the background, you can call {@link com.trolltech.qt.gui.QGraphicsView#setBackgroundBrush(com.trolltech.qt.gui.QBrush) setBackgroundBrush()} instead. <p>All painting is done in scene coordinates. <tt>rect</tt> is the exposed rectangle. <p>The default implementation fills <tt>rect</tt> using the view's {@link QGraphicsView#backgroundBrush() backgroundBrush}. If no such brush is defined (the default), the scene's {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()} function is called instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}, and {@link com.trolltech.qt.gui.QGraphicsScene#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) QGraphicsScene::drawBackground()}. <br></DD></DT>
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
Draws the foreground of the scene using <tt>painter</tt>, after the background and all items are drawn. Reimplement this function to provide a custom foreground for this view. <p>If all you want is to define a color, texture or gradient for the foreground, you can call {@link com.trolltech.qt.gui.QGraphicsView#setForegroundBrush(com.trolltech.qt.gui.QBrush) setForegroundBrush()} instead. <p>All painting is done in scene coordinates. <tt>rect</tt> is the exposed rectangle. <p>The default implementation fills <tt>rect</tt> using the view's {@link QGraphicsView#foregroundBrush() foregroundBrush}. If no such brush is defined (the default), the scene's {@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()} function is called instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}, and {@link com.trolltech.qt.gui.QGraphicsScene#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) QGraphicsScene::drawForeground()}. <br></DD></DT>
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
Draws the items <tt>items</tt> in the scene using <tt>painter</tt>, after the background and before the foreground are drawn. <tt>numItems</tt> is the number of items in <tt>items</tt> and options in <tt>options</tt>. <tt>options</tt> is a list of styleoptions; one for each item. Reimplement this function to provide custom item drawing for this view. <p>The default implementation calls the scene's {@link com.trolltech.qt.gui.QGraphicsView#drawItems(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QGraphicsItemInterface[], com.trolltech.qt.gui.QStyleOptionGraphicsItem[]) drawItems()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsView#drawForeground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawForeground()}, {@link com.trolltech.qt.gui.QGraphicsView#drawBackground(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRectF) drawBackground()}, and {@link com.trolltech.qt.gui.QGraphicsScene#drawItems(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QGraphicsItemInterface[], com.trolltech.qt.gui.QStyleOptionGraphicsItem[]) QGraphicsScene::drawItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void drawItems(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QGraphicsItemInterface[] items, com.trolltech.qt.gui.QStyleOptionGraphicsItem[] options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItems_QPainter_int_nativepointer_nativepointer(nativeId(), painter == null ? 0 : painter.nativeId(), items, options);
    }
    @QtBlockedSlot
    native void __qt_drawItems_QPainter_int_nativepointer_nativepointer(long __this__nativeId, long painter, com.trolltech.qt.gui.QGraphicsItemInterface[] items, com.trolltech.qt.gui.QStyleOptionGraphicsItem[] options);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long event);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
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
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent event)    {
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
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long event);

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
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QGraphicsView fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsView(QPrivateConstructor p) { super(p); } 
}
