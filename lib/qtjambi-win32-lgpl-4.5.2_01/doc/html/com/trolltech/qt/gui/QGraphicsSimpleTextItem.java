package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsSimpleTextItem class provides a simple text path item that you can add to a {@link com.trolltech.qt.gui.QGraphicsScene QGraphicsScene}. To set the item's text, you can either pass a QString to QGraphicsSimpleTextItem's constructor, or call {@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#setText(java.lang.String) setText()} to change the text later. To set the text fill color, call {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setBrush(com.trolltech.qt.gui.QBrush) setBrush()}. <p>The simple text item can have both a fill and an outline; {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setBrush(com.trolltech.qt.gui.QBrush) setBrush()} will set the text fill (i.e., text color), and {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setPen(com.trolltech.qt.gui.QPen) setPen()} sets the pen that will be used to draw the text outline. (The latter can be slow, especially for complex pens, and items with long text content.) If all you want is to draw a simple line of text, you should call {@link com.trolltech.qt.gui.QAbstractGraphicsShapeItem#setBrush(com.trolltech.qt.gui.QBrush) setBrush()} only, and leave the pen unset; QGraphicsSimpleTextItem's pen is by default {@link com.trolltech.qt.core.Qt.PenStyle Qt::NoPen }. <p>QGraphicsSimpleTextItem uses the text's formatted size and the associated font to provide a reasonable implementation of {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() boundingRect()}, {@link com.trolltech.qt.gui.QGraphicsItem#shape() shape()}, and {@link com.trolltech.qt.gui.QGraphicsItem#contains(com.trolltech.qt.core.QPointF) contains()}. You can set the font by calling {@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <p>QGraphicsSimpleText does not display rich text; instead, you can use {@link com.trolltech.qt.gui.QGraphicsTextItem QGraphicsTextItem}, which provides full text control capabilities. <br><center><img src="../images/graphicsview-simpletextitem.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsTextItem QGraphicsTextItem}, {@link com.trolltech.qt.gui.QGraphicsPathItem QGraphicsPathItem}, {@link com.trolltech.qt.gui.QGraphicsRectItem QGraphicsRectItem}, {@link com.trolltech.qt.gui.QGraphicsEllipseItem QGraphicsEllipseItem}, {@link com.trolltech.qt.gui.QGraphicsPixmapItem QGraphicsPixmapItem}, {@link com.trolltech.qt.gui.QGraphicsPolygonItem QGraphicsPolygonItem}, {@link com.trolltech.qt.gui.QGraphicsLineItem QGraphicsLineItem}, and {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsSimpleTextItem extends com.trolltech.qt.gui.QAbstractGraphicsShapeItem
{
    public enum enum_1 implements com.trolltech.qt.QtEnumerator {
        Type(9);

        enum_1(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QGraphicsSimpleTextItem$enum_1 constant with the specified <tt>int</tt>.</brief>
*/

        public static enum_1 resolve(int value) {
            return (enum_1) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 9: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QGraphicsSimpleTextItem. <p><tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsSimpleTextItem(com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Constructs a QGraphicsSimpleTextItem. <p><tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsSimpleTextItem() {
        this((com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Constructs a QGraphicsSimpleTextItem. <p><tt>parent</tt> is passed to {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}'s constructor. The item is added to scene. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsScene#addItem(com.trolltech.qt.gui.QGraphicsItemInterface) QGraphicsScene::addItem()}. <br></DD></DT>
*/

    public QGraphicsSimpleTextItem(com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSimpleTextItem_QGraphicsItem_QGraphicsScene(parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsSimpleTextItem_QGraphicsItem_QGraphicsScene(long parent, long scene);


/**
Creates a new QGraphicsSimpleTextItem with the specified <tt>text</tt> and
<tt>parent</tt>.
*/

    public QGraphicsSimpleTextItem(java.lang.String text, com.trolltech.qt.gui.QGraphicsItemInterface parent) {
        this(text, parent, (com.trolltech.qt.gui.QGraphicsScene)null);
    }

/**
Creates a new parentless QGraphicsSimpleTextItem with the specified <tt>text</tt>.
*/

    public QGraphicsSimpleTextItem(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QGraphicsItem)null, (com.trolltech.qt.gui.QGraphicsScene)null);
    }
/**
Creates a new QGraphicsSimpleTextItem with the specified <tt>text</tt> and
<tt>parent</tt>, and adds it to <tt>scene</tt>.
*/

    public QGraphicsSimpleTextItem(java.lang.String text, com.trolltech.qt.gui.QGraphicsItemInterface parent, com.trolltech.qt.gui.QGraphicsScene scene){
        super((QPrivateConstructor)null);
        __qt_QGraphicsSimpleTextItem_String_QGraphicsItem_QGraphicsScene(text, parent == null ? 0 : parent.nativeId(), scene == null ? 0 : scene.nativeId());
        if (parent != null) disableGarbageCollection();


    }

    native void __qt_QGraphicsSimpleTextItem_String_QGraphicsItem_QGraphicsScene(java.lang.String text, long parent, long scene);

/**
Returns the font that is used to draw the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Sets the font that is used to draw the item's text to <tt>font</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#font() font()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont font)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long font);

/**
Sets the item's text to <tt>text</tt>. The text will be displayed as plain text. Newline characters ('\n') as well as characters of type {@link null.SpecialCharacter QChar::LineSeparator } will cause item to break the text into multiple lines. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
Returns the item's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsSimpleTextItem#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

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

    public static native QGraphicsSimpleTextItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsSimpleTextItem(QPrivateConstructor p) { super(p); } 
}
