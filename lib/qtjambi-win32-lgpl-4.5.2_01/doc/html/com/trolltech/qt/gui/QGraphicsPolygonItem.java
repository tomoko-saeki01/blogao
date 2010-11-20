package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsPolygonItem class provides a polygon item that you can add to a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. To set the item's polygon, pass a {@link com.trolltech.qt.gui.QPolygonF QPolygonF} to QGraphicsPolygonItem's constructor, or call the {@link com.trolltech.qt.gui.QGraphicsPolygonItem#setPolygon(com.trolltech.qt.gui.QPolygonF) setPolygon()} function. The {@link com.trolltech.qt.gui.QGraphicsPolygonItem#polygon() polygon()} function returns the current polygon. <br><center><img src="../images/graphicsview-polygonitem.png"></center><br> QGraphicsPolygonItem uses the polygon and the pen width to provide a reasonable implementation of {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, and {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}. The {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) paint()} function draws the polygon using the item's associated pen and brush, which you can set by calling the {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setPen(com.trolltech.qt.gui.QPen) setPen()} and {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setBrush(com.trolltech.qt.gui.QBrush) setBrush()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPathItem QGraphicsPathItem}, {@link com.trolltech.qt.gui.QGraphicsRectItem QGraphicsRectItem}, {@link com.trolltech.qt.gui.QGraphicsEllipseItem QGraphicsEllipseItem}, {@link com.trolltech.qt.gui.QGraphicsTextItem QGraphicsTextItem}, {@link com.trolltech.qt.gui.QGraphicsLineItem QGraphicsLineItem}, {@link com.trolltech.qt.gui.QGraphicsPixmapItem QGraphicsPixmapItem}, and {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsPolygonItem extends com.trolltech.qt.gui.QAbstractGraphicsShapeItem
{
    public enum enum_1 implements com.trolltech.qt.QtEnumerator {
        Type(5);

        enum_1(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsPolygonItem$enum_1 constant with the specified <tt>int</tt>.</brief>
*/

        public static enum_1 resolve(int value) {
            return (enum_1) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 5: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QGraphicsPolygonItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsPolygonItem(com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Constructs a QGraphicsPolygonItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsPolygonItem() {
        this((com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Constructs a QGraphicsPolygonItem. <tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem QAbstractGraphicsShapeItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsPolygonItem(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsPolygonItem_QGraphicsItem_QGraphicsScene(parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsPolygonItem_QGraphicsItem_QGraphicsScene(long parent, long scene);


/**
Creates a new QGraphicsPolygonItem of the specified <tt>polygon</tt> and
<tt>parent</tt>.
*/

    public QGraphicsPolygonItem(com.trolltech.qt.gui.QPolygonF polygon, com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(polygon, parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Creates a new QGraphicsPolygonItem from <tt>polygon</tt>.
*/

    public QGraphicsPolygonItem(com.trolltech.qt.gui.QPolygonF polygon) {
        this(polygon, (com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Creates a new QGraphicsPolygonItem from the given <tt>polygon</tt>, and with
the specified <tt>parent</tt>. It is then added to <tt>scene</tt>.
*/

    public QGraphicsPolygonItem(com.trolltech.qt.gui.QPolygonF polygon, com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsPolygonItem_QPolygonF_QGraphicsItem_QGraphicsScene(polygon == null ? 0 : polygon.nativeId(), parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsPolygonItem_QPolygonF_QGraphicsItem_QGraphicsScene(long polygon, long parent, long scene);

/**
Returns the fill rule of the polygon. The default fill rule is {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPolygonItem#setFillRule(com.trolltech.qt.core.Qt.FillRule) setFillRule()}, {@link com.trolltech.qt.gui.QPainterPath#fillRule() QPainterPath::fillRule()}, and {@link com.trolltech.qt.gui.QPainter#drawPolygon(com.trolltech.qt.gui.QPolygon) QPainter::drawPolygon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.FillRule fillRule()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.FillRule.resolve(__qt_fillRule(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fillRule(long __this__nativeId);

/**
Returns the item's polygon, or an empty polygon if no polygon has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPolygonItem#setPolygon(com.trolltech.qt.gui.QPolygonF) setPolygon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPolygonF polygon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_polygon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPolygonF __qt_polygon(long __this__nativeId);

/**
Sets the fill rule of the polygon to <tt>rule</tt>. The default fill rule is {@link com.trolltech.qt.core.Qt.FillRule Qt::OddEvenFill }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPolygonItem#fillRule() fillRule()}, {@link com.trolltech.qt.gui.QPainterPath#fillRule() QPainterPath::fillRule()}, and {@link com.trolltech.qt.gui.QPainter#drawPolygon(com.trolltech.qt.gui.QPolygon) QPainter::drawPolygon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFillRule(com.trolltech.qt.core.Qt.FillRule rule)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFillRule_FillRule(nativeId(), rule.value());
    }
    @QtBlockedSlot
    native void __qt_setFillRule_FillRule(long __this__nativeId, int rule);

/**
Sets the item's polygon to be the given <tt>polygon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsPolygonItem#polygon() polygon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPolygon(com.trolltech.qt.gui.QPolygonF polygon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPolygon_QPolygonF(nativeId(), polygon == null ? 0 : polygon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPolygon_QPolygonF(long __this__nativeId, long polygon);

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

    public static native QGraphicsPolygonItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsPolygonItem(QPrivateConstructor p) { super(p); } 
}
