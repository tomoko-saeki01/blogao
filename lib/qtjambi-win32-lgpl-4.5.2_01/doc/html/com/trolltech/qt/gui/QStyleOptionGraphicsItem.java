package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionGraphicsItem class is used to describe the parameters needed to draw a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, and {@link com.trolltech.qt.gui.QGraphicsItem#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionGraphicsItem) QGraphicsItem::paint()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionGraphicsItem extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionGraphicsItem.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 1
*/

        Version(1);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionGraphicsItem$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionGraphicsItem.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_GraphicsItem } for this class).
*/

        Type(17);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionGraphicsItem$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 17: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionGraphicsItem. The levelOfDetail parameter is initialized to 1.
*/

    public QStyleOptionGraphicsItem(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGraphicsItem();
    }

    native void __qt_QStyleOptionGraphicsItem();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QStyleOptionGraphicsItem(com.trolltech.qt.gui.QStyleOptionGraphicsItem other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGraphicsItem_QStyleOptionGraphicsItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionGraphicsItem_QStyleOptionGraphicsItem(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionGraphicsItem(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionGraphicsItem_int(version);
    }

    native void __qt_QStyleOptionGraphicsItem_int(int version);

/**
This variable holds the exposed rectangle, in item coordinates. Make use of this rectangle to speed up item drawing when only parts of the item are exposed. If the whole item is exposed, this rectangle will be the same as {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() QGraphicsItem::boundingRect()}.
*/

    @QtBlockedSlot
    public final void setExposedRect(com.trolltech.qt.core.QRectF exposedRect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExposedRect_QRectF(nativeId(), exposedRect == null ? 0 : exposedRect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setExposedRect_QRectF(long __this__nativeId, long exposedRect);

/**
This variable holds the exposed rectangle, in item coordinates. Make use of this rectangle to speed up item drawing when only parts of the item are exposed. If the whole item is exposed, this rectangle will be the same as {@link com.trolltech.qt.gui.QGraphicsItem#boundingRect() QGraphicsItem::boundingRect()}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF exposedRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exposedRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_exposedRect(long __this__nativeId);

/**
This variable holds the complete transformation matrix for the item. This matrix is the sum of the item's scene matrix and the matrix of the painter used for drawing the item. It is provided for convenience, allowing anvanced level-of-detail metrics that can be used to speed up item drawing. <p>To find the dimentions of an item in screen coordinates (i.e., pixels), you can use the mapping functions of {@link com.trolltech.qt.gui.QMatrix QMatrix}, such as {@link com.trolltech.qt.gui.QMatrix#map(com.trolltech.qt.gui.QLine) QMatrix::map()}. <p><DT><b>See also:</b><br><DD>QStyleOptionGraphicsItem::levelOfDetail. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(com.trolltech.qt.gui.QMatrix matrix)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMatrix_QMatrix(nativeId(), matrix == null ? 0 : matrix.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMatrix_QMatrix(long __this__nativeId, long matrix);

/**
This variable holds the complete transformation matrix for the item. This matrix is the sum of the item's scene matrix and the matrix of the painter used for drawing the item. It is provided for convenience, allowing anvanced level-of-detail metrics that can be used to speed up item drawing. <p>To find the dimentions of an item in screen coordinates (i.e., pixels), you can use the mapping functions of {@link com.trolltech.qt.gui.QMatrix QMatrix}, such as {@link com.trolltech.qt.gui.QMatrix#map(com.trolltech.qt.gui.QLine) QMatrix::map()}. <p><DT><b>See also:</b><br><DD>QStyleOptionGraphicsItem::levelOfDetail. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix matrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_matrix(long __this__nativeId);

/**
This variable holds a simple metric for determining an item's level of detail. This simple metric provides an easy way to determine the level of detail for an item. Its value represents the maximum value of the height and width of a unity rectangle, mapped using the complete transformation matrix of the painter used to draw the item. By default, if no transformations are applied, its value is 1. If zoomed out 1:2, the level of detail will be 0.5, and if zoomed in 2:1, its value is 2. <p>For more advanced level-of-detail metrics, use QStyleOptionGraphicsItem::matrix directly. <p><DT><b>See also:</b><br><DD>QStyleOptionGraphicsItem::matrix. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLevelOfDetail(double levelOfDetail)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLevelOfDetail_double(nativeId(), levelOfDetail);
    }
    @QtBlockedSlot
    native void __qt_setLevelOfDetail_double(long __this__nativeId, double levelOfDetail);

/**
This variable holds a simple metric for determining an item's level of detail. This simple metric provides an easy way to determine the level of detail for an item. Its value represents the maximum value of the height and width of a unity rectangle, mapped using the complete transformation matrix of the painter used to draw the item. By default, if no transformations are applied, its value is 1. If zoomed out 1:2, the level of detail will be 0.5, and if zoomed in 2:1, its value is 2. <p>For more advanced level-of-detail metrics, use QStyleOptionGraphicsItem::matrix directly. <p><DT><b>See also:</b><br><DD>QStyleOptionGraphicsItem::matrix. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double levelOfDetail()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_levelOfDetail(nativeId());
    }
    @QtBlockedSlot
    native double __qt_levelOfDetail(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionGraphicsItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionGraphicsItem(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionGraphicsItem array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionGraphicsItem clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionGraphicsItem __qt_clone(long __this_nativeId);
}
