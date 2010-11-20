package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsRectItem class provides a rectangle item that you can add to a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. To set the item's rectangle, pass a {@link com.trolltech.qt.core.QRectF QRectF} to QGraphicsRectItem's constructor, or call the {@link com.trolltech.qt.gui.QGraphicsRectItem#setRect(com.trolltech.qt.core.QRectF) setRect()} function. The {@link com.trolltech.qt.gui.QGraphicsRectItem#rect() rect()} function returns the current rectangle. <br><center><img src="../images/graphicsview-rectitem.png"></center><br> QGraphicsRectItem uses the rectangle and the pen width to provide a reasonable implementation of {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, and {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}. The {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()} function draws the rectangle using the item's associated pen and brush, which you can set by calling the {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setPen(com.trolltech.qt.gui.QPen) setPen()} and {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setBrush(com.trolltech.qt.gui.QBrush) setBrush()} functions. <p><b>Note:</b> The rendering of invalid rectangles, such as those with negative widths or heights, is undefined. If you cannot be sure that you are using valid rectangles (for example, if you are creating rectangles using data from an unreliable source) then you should use {@link com.trolltech.qt.core.QRectF#normalized() QRectF::normalized()} to create normalized rectangles, and use those instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPathItem QGraphicsPathItem}, {@link com.trolltech.qt.gui.QGraphicsEllipseItem QGraphicsEllipseItem}, {@link com.trolltech.qt.gui.QGraphicsPolygonItem QGraphicsPolygonItem}, {@link com.trolltech.qt.gui.QGraphicsTextItem QGraphicsTextItem}, {@link com.trolltech.qt.gui.QGraphicsLineItem QGraphicsLineItem}, {@link com.trolltech.qt.gui.QGraphicsPixmapItem QGraphicsPixmapItem}, and {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsRectItem extends com.trolltech.qt.gui.QAbstractGraphicsShapeItem
{
    public enum enum_1 implements com.trolltech.qt.QtEnumerator {
        Type(3);

        enum_1(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsRectItem$enum_1 constant with the specified <tt>int</tt>.</brief>
*/

        public static enum_1 resolve(int value) {
            return (enum_1) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 3: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QGraphicsRectItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor.The item is added to the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsRectItem(com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Constructs a QGraphicsRectItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor.The item is added to the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsRectItem() {
        this((com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Constructs a QGraphicsRectItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor.The item is added to the scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsRectItem(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsRectItem_QGraphicsItem_QGraphicsScene(parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsRectItem_QGraphicsItem_QGraphicsScene(long parent, long scene);


/**
Creates a new QGraphicsRectItem with the specified bounds <tt>rect</tt> and
<tt>parent</tt>.
*/

    public QGraphicsRectItem(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(rect, parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Creates a new QGraphicsRectItem with the specified bounds <tt>rect</tt>.
*/

    public QGraphicsRectItem(com.trolltech.qt.core.QRectF rect) {
        this(rect, (com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Creates a new QGraphicsRectItem with the specified bounds <tt>rect</tt>,
<tt>parent</tt>, and then adds it to <tt>scene</tt>.
*/

    public QGraphicsRectItem(com.trolltech.qt.core.QRectF rect, com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsRectItem_QRectF_QGraphicsItem_QGraphicsScene(rect == null ? 0 : rect.nativeId(), parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsRectItem_QRectF_QGraphicsItem_QGraphicsScene(long rect, long parent, long scene);


/**
Creates a new QGraphicsRectItem of which top-left corner is (<tt>x</tt>,
<tt>y</tt>), width is <tt>w</tt>, and height is <tt>h</tt>. It will have the
specified <tt>parent</tt>.
*/

    public QGraphicsRectItem(double x, double y, double w, double h, com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(x, y, w, h, parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Creates a new QGraphicsRectItem of which top-left corner is (<tt>x</tt>,
<tt>y</tt>), width is <tt>w</tt>, and height is <tt>h</tt>.
*/

    public QGraphicsRectItem(double x, double y, double w, double h) {
        this(x, y, w, h, (com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Creates a new QGraphicsRectItem of which top-left corner is (<tt>x</tt>,
<tt>y</tt>), width is <tt>w</tt>, and height is <tt>h</tt>. It will have the
specified <tt>parent</tt> and <tt>scene</tt>.
*/

    public QGraphicsRectItem(double x, double y, double w, double h, com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsRectItem_double_double_double_double_QGraphicsItem_QGraphicsScene(x, y, w, h, parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsRectItem_double_double_double_double_QGraphicsItem_QGraphicsScene(double x, double y, double w, double h, long parent, long scene);

/**
Returns the item's rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsRectItem#setRect(com.trolltech.qt.core.QRectF) setRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_rect(long __this__nativeId);

/**
Sets the item's rectangle to be the given <tt>rectangle</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsRectItem#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRect(com.trolltech.qt.core.QRectF rect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_QRectF(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRect_QRectF(long __this__nativeId, long rect);

/**
Sets the item's rectangle to the rectangle defined by (<tt>x</tt>, <tt>y</tt>) and the given <tt>width</tt> and <tt>height</tt>. <p>This convenience function is equivalent to calling <tt>setRect(QRectF(x, y, width, height))</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsRectItem#rect() rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRect(double x, double y, double w, double h)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRect_double_double_double_double(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setRect_double_double_double_double(long __this__nativeId, double x, double y, double w, double h);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRectF boundingRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean contains(com.trolltech.qt.core.QPointF point)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QPointF(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QPointF(long __this__nativeId, long point);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object extension(java.lang.Object variant)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_extension_Object(nativeId(), variant);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_extension_Object(long __this__nativeId, java.lang.Object variant);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isObscuredBy(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isObscuredBy_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isObscuredBy_QGraphicsItem(long __this__nativeId, long item);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPainterPath opaqueArea()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opaqueArea(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_opaqueArea(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionGraphicsItem option, com.trolltech.qt.gui.QWidget widget)    {
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
    public void setExtension(com.trolltech.qt.gui.QGraphicsItem.Extension extension, java.lang.Object variant)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExtension_Extension_Object(nativeId(), extension.value(), variant);
    }
    @QtBlockedSlot
    native void __qt_setExtension_Extension_Object(long __this__nativeId, int extension, java.lang.Object variant);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPainterPath shape()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shape(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_shape(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean supportsExtension(com.trolltech.qt.gui.QGraphicsItem.Extension extension)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QGraphicsRectItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsRectItem(QPrivateConstructor p) { super(p); } 
}
