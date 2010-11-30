package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QBrush class defines the fill pattern of shapes drawn by {@link com.trolltech.qt.gui.QPainter QPainter}. A brush has a style, a color, a gradient and a texture. <p>The brush {@link com.trolltech.qt.gui.QBrush#style() style()} defines the fill pattern using the {@link com.trolltech.qt.core.Qt.BrushStyle Qt::BrushStyle } enum. The default brush style is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } (depending on how you construct a brush). This style tells the painter to not fill shapes. The standard style for filling is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::SolidPattern }. The style can be set when the brush is created using the appropriate constructor, and in addition the {@link com.trolltech.qt.gui.QBrush#setStyle(com.trolltech.qt.core.Qt.BrushStyle) setStyle()} function provides means for altering the style once the brush is constructed. <br><center><img src="../images/brush-styles.png"></center><br> The brush {@link com.trolltech.qt.gui.QBrush#color() color()} defines the color of the fill pattern. The color can either be one of Qt's predefined colors, {@link com.trolltech.qt.core.Qt.GlobalColor Qt::GlobalColor }, or any other custom {@link com.trolltech.qt.gui.QColor QColor}. The currently set color can be retrieved and altered using the {@link com.trolltech.qt.gui.QBrush#color() color()} and {@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()} functions, respectively. <p>The {@link com.trolltech.qt.gui.QBrush#gradient() gradient()} defines the gradient fill used when the current style is either {@link com.trolltech.qt.core.Qt.BrushStyle Qt::LinearGradientPattern }, {@link com.trolltech.qt.core.Qt.BrushStyle Qt::RadialGradientPattern } or {@link com.trolltech.qt.core.Qt.BrushStyle Qt::ConicalGradientPattern }. Gradient brushes are created by giving a {@link com.trolltech.qt.gui.QGradient QGradient} as a constructor argument when creating the QBrush. Qt provides three different gradients: {@link com.trolltech.qt.gui.QLinearGradient QLinearGradient}, {@link com.trolltech.qt.gui.QConicalGradient QConicalGradient}, and {@link com.trolltech.qt.gui.QRadialGradient QRadialGradient} - all of which inherit {@link com.trolltech.qt.gui.QGradient QGradient}. <pre class="snippet">
        QRadialGradient gradient =
            new QRadialGradient(50, 50, 50, 50, 50);
        gradient.setColorAt(0, QColor.fromRgbF(0, 1, 0, 1));
        gradient.setColorAt(1, QColor.fromRgbF(0, 0, 0, 0));

        QBrush brush = new QBrush(gradient);
        </pre> The {@link com.trolltech.qt.gui.QBrush#texture() texture()} defines the pixmap used when the current style is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. You can create a brush with a texture by providing the pixmap when the brush is created or by using {@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()}. <p>Note that applying {@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()} makes {@link com.trolltech.qt.gui.QBrush#style() style()} == {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }, regardless of previous style settings. Also, calling {@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()} will not make a difference if the style is a gradient. The same is the case if the style is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern } style unless the current texture is a {@link com.trolltech.qt.gui.QBitmap QBitmap}. <p>The {@link com.trolltech.qt.gui.QBrush#isOpaque() isOpaque()} function returns true if the brush is fully opaque otherwise false. A brush is considered opaque if: <ul><li> The alpha component of the {@link com.trolltech.qt.gui.QBrush#color() color()} is 255.</li><li> Its {@link com.trolltech.qt.gui.QBrush#texture() texture()} does not have an alpha channel and is not a {@link com.trolltech.qt.gui.QBitmap QBitmap}.</li><li> The colors in the {@link com.trolltech.qt.gui.QBrush#gradient() gradient()} all have an alpha component that is 255.</li></ul> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/brush-outline.png"></center><br></td><td> To specify the style and color of lines and outlines, use the {@link com.trolltech.qt.gui.QPainter QPainter}'s {@link com.trolltech.qt.gui.QPen pen} combined with {@link com.trolltech.qt.core.Qt.PenStyle Qt::PenStyle } and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::GlobalColor }: <pre class="snippet">
        QPainter painter = new QPainter(this);

        painter.setBrush(QColor.cyan);
        painter.setPen(QColor.darkCyan);
        painter.drawRect(0, 0, 100,100);

        painter.setBrush(QBrush.NoBrush);
        painter.setPen(QColor.darkGreen);
        painter.drawRect(40, 40, 100, 100);
</pre> Note that, by default, {@link com.trolltech.qt.gui.QPainter QPainter} renders the outline (using the currently set pen) when drawing shapes. Use {@link com.trolltech.qt.core.Qt.PenStyle painter.setPen(Qt::NoPen) }<tt>painter.setPen(Qt::NoPen)</tt> to disable this behavior.</td></tr></table> For more information about painting in general, see {@link <a href="../qtjambi-paintsystem.html">The Paint System</a>} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.BrushStyle Qt::BrushStyle }, {@link com.trolltech.qt.gui.QPainter QPainter}, and {@link com.trolltech.qt.gui.QColor QColor}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBrush extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a default black brush with the style {@link com.trolltech.qt.core.Qt.BrushStyle Qt::NoBrush } (i.e. this brush will not fill shapes).
*/

    public QBrush(){
        super((QPrivateConstructor)null);
        __qt_QBrush();
    }

    native void __qt_QBrush();

/**
Constructs a black brush with the given <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setStyle(com.trolltech.qt.core.Qt.BrushStyle) setStyle()}. <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.core.Qt.BrushStyle bs){
        super((QPrivateConstructor)null);
        __qt_QBrush_BrushStyle(bs.value());
    }

    native void __qt_QBrush_BrushStyle(int bs);

/**
Constructs a brush with the given <tt>color</tt> and the custom pattern stored in <tt>pixmap</tt>. <p>The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. The color will only have an effect for QBitmaps. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()}, and setPixmap(). <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.core.Qt.GlobalColor color, com.trolltech.qt.gui.QPixmap pixmap){
        super((QPrivateConstructor)null);
        __qt_QBrush_GlobalColor_QPixmap(color.value(), pixmap == null ? 0 : pixmap.nativeId());
    }

    native void __qt_QBrush_GlobalColor_QPixmap(int color, long pixmap);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QBrush(com.trolltech.qt.gui.QBrush brush){
        super((QPrivateConstructor)null);
        __qt_QBrush_QBrush(brush == null ? 0 : brush.nativeId());
    }

    native void __qt_QBrush_QBrush(long brush);


/**
Constructs a brush with the given <tt>color</tt> and <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()}, and {@link com.trolltech.qt.gui.QBrush#setStyle(com.trolltech.qt.core.Qt.BrushStyle) setStyle()}. <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.gui.QColor color) {
        this(color, com.trolltech.qt.core.Qt.BrushStyle.SolidPattern);
    }
/**
Constructs a brush with the given <tt>color</tt> and <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()}, and {@link com.trolltech.qt.gui.QBrush#setStyle(com.trolltech.qt.core.Qt.BrushStyle) setStyle()}. <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.gui.QColor color, com.trolltech.qt.core.Qt.BrushStyle bs){
        super((QPrivateConstructor)null);
        __qt_QBrush_QColor_BrushStyle(color == null ? 0 : color.nativeId(), bs.value());
    }

    native void __qt_QBrush_QColor_BrushStyle(long color, int bs);

/**
Constructs a brush with the given <tt>color</tt> and the custom pattern stored in <tt>pixmap</tt>. <p>The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. The color will only have an effect for QBitmaps. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()}, and setPixmap(). <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.gui.QColor color, com.trolltech.qt.gui.QPixmap pixmap){
        super((QPrivateConstructor)null);
        __qt_QBrush_QColor_QPixmap(color == null ? 0 : color.nativeId(), pixmap == null ? 0 : pixmap.nativeId());
    }

    native void __qt_QBrush_QColor_QPixmap(long color, long pixmap);

/**
Constructs a brush based on the given <tt>gradient</tt>. <p>The brush style is set to the corresponding gradient style (either {@link com.trolltech.qt.core.Qt.BrushStyle Qt::LinearGradientPattern }, {@link com.trolltech.qt.core.Qt.BrushStyle Qt::RadialGradientPattern } or {@link com.trolltech.qt.core.Qt.BrushStyle Qt::ConicalGradientPattern }).
*/

    public QBrush(com.trolltech.qt.gui.QGradient gradient){
        super((QPrivateConstructor)null);
        __qt_QBrush_QGradient(gradient.nativeId());
    }

    native void __qt_QBrush_QGradient(long gradient);

/**
Constructs a brush with a black color and a texture set to the given <tt>image</tt>. The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setTextureImage(com.trolltech.qt.gui.QImage) setTextureImage()}. <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.gui.QImage image){
        super((QPrivateConstructor)null);
        __qt_QBrush_QImage(image == null ? 0 : image.nativeId());
    }

    native void __qt_QBrush_QImage(long image);

/**
Constructs a brush with a black color and a texture set to the given <tt>pixmap</tt>. The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()}. <br></DD></DT>
*/

    public QBrush(com.trolltech.qt.gui.QPixmap pixmap){
        super((QPrivateConstructor)null);
        __qt_QBrush_QPixmap(pixmap == null ? 0 : pixmap.nativeId());
    }

    native void __qt_QBrush_QPixmap(long pixmap);

/**
Returns the brush color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor color()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_color(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_color(long __this__nativeId);

/**
Returns the gradient describing this brush.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGradient gradient()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_gradient(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGradient __qt_gradient(long __this__nativeId);

/**
Returns true if the brush is fully opaque otherwise false. A brush is considered opaque if: <ul><li> The alpha component of the {@link com.trolltech.qt.gui.QBrush#color() color()} is 255.</li><li> Its {@link com.trolltech.qt.gui.QBrush#texture() texture()} does not have an alpha channel and is not a {@link com.trolltech.qt.gui.QBitmap QBitmap}.</li><li> The colors in the {@link com.trolltech.qt.gui.QBrush#gradient() gradient()} all have an alpha component that is 255.</li></ul>
*/

    @QtBlockedSlot
    public final boolean isOpaque()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpaque(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpaque(long __this__nativeId);

/**
Returns the current transformation matrix for the brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setMatrix(com.trolltech.qt.gui.QMatrix) setMatrix()}. <br></DD></DT>
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
<brief>Writes thisQBrush
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QBrush b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QBrush(nativeId(), b == null ? 0 : b.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QBrush(long __this__nativeId, long b);

/**
<brief>Reads a QBrush
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Sets the brush color to the given <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.core.Qt.GlobalColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_GlobalColor(nativeId(), color.value());
    }
    @QtBlockedSlot
    native void __qt_setColor_GlobalColor(long __this__nativeId, int color);

/**
Sets the brush color to the given <tt>color</tt>. <p>Note that calling {@link com.trolltech.qt.gui.QBrush#setColor(com.trolltech.qt.core.Qt.GlobalColor) setColor()} will not make a difference if the style is a gradient. The same is the case if the style is {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern } style unless the current texture is a {@link com.trolltech.qt.gui.QBitmap QBitmap}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#color() color()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColor(com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setColor_QColor(long __this__nativeId, long color);

/**
Sets <tt>matrix</tt> as an explicit transformation matrix on the current brush. The brush transformation matrix is merged with {@link com.trolltech.qt.gui.QPainter QPainter} transformation matrix to produce the final result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#matrix() matrix()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMatrix(com.trolltech.qt.gui.QMatrix mat)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMatrix_QMatrix(nativeId(), mat == null ? 0 : mat.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMatrix_QMatrix(long __this__nativeId, long mat);

/**
Sets the brush style to <tt>style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#style() style()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.core.Qt.BrushStyle arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyle_BrushStyle(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setStyle_BrushStyle(long __this__nativeId, int arg__1);

/**
Sets the brush pixmap to <tt>pixmap</tt>. The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. <p>The current brush color will only have an effect for monochrome pixmaps, i.e. for {@link com.trolltech.qt.gui.QPixmap#depth() QPixmap::depth()} == 1 ({@link com.trolltech.qt.gui.QBitmap QBitmaps}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#texture() texture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTexture(com.trolltech.qt.gui.QPixmap pixmap)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTexture_QPixmap(nativeId(), pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTexture_QPixmap(long __this__nativeId, long pixmap);

/**
Sets the brush image to <tt>image</tt>. The style is set to {@link com.trolltech.qt.core.Qt.BrushStyle Qt::TexturePattern }. <p>Note the current brush color will not have any affect on monochrome images, as opposed to calling {@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()} with a {@link com.trolltech.qt.gui.QBitmap QBitmap}. If you want to change the color of monochrome image brushes, either convert the image to {@link com.trolltech.qt.gui.QBitmap QBitmap} with <tt>QBitmap::fromImage()</tt> and set the resulting {@link com.trolltech.qt.gui.QBitmap QBitmap} as a texture, or change the entries in the color table for the image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#textureImage() textureImage()}, and {@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextureImage(com.trolltech.qt.gui.QImage image)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextureImage_QImage(nativeId(), image == null ? 0 : image.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTextureImage_QImage(long __this__nativeId, long image);

/**
Sets <tt>matrix</tt> as an explicit transformation matrix on the current brush. The brush transformation matrix is merged with {@link com.trolltech.qt.gui.QPainter QPainter} transformation matrix to produce the final result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#transform() transform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTransform(com.trolltech.qt.gui.QTransform arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTransform_QTransform(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTransform_QTransform(long __this__nativeId, long arg__1);

/**
Returns the brush style. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setStyle(com.trolltech.qt.core.Qt.BrushStyle) setStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.BrushStyle style()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.BrushStyle.resolve(__qt_style(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_style(long __this__nativeId);

/**
Returns the custom brush pattern, or a null pixmap if no custom brush pattern has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setTexture(com.trolltech.qt.gui.QPixmap) setTexture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap texture()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_texture(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_texture(long __this__nativeId);

/**
Returns the custom brush pattern, or a null image if no custom brush pattern has been set. <p>If the texture was set as a {@link com.trolltech.qt.gui.QPixmap QPixmap} it will be converted to a {@link com.trolltech.qt.gui.QImage QImage}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setTextureImage(com.trolltech.qt.gui.QImage) setTextureImage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage textureImage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textureImage(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_textureImage(long __this__nativeId);

/**
Returns the current transformation matrix for the brush. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBrush#setTransform(com.trolltech.qt.gui.QTransform) setTransform()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform transform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_transform(long __this__nativeId);

/**
@exclude
*/

    public static native QBrush fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBrush(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QBrush array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QBrush)
        return operator_equal((com.trolltech.qt.gui.QBrush) other);
        return false;
    }


    public static final QBrush NoBrush = new QBrush(com.trolltech.qt.core.Qt.BrushStyle.NoBrush);


/**
<brief>Returns a string representation of the <tt>this QBrush</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QBrush clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QBrush __qt_clone(long __this_nativeId);
}
