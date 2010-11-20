package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGLColormap class is used for installing custom colormaps into QGLWidgets. QGLColormap provides a platform independent way of specifying and installing indexed colormaps into QGLWidgets. QGLColormap is especially useful when using the OpenGL color-index mode. <p>Under X11 you must use an X server that supports either a <tt>PseudoColor</tt> or <tt>DirectColor</tt> visual class. If your X server currently only provides a <tt>GrayScale</tt>, <tt>TrueColor</tt>, <tt>StaticColor</tt> or <tt>StaticGray</tt> visual, you will not be able to allocate colorcells for writing. If this is the case, try setting your X server to 8 bit mode. It should then provide you with at least a <tt>PseudoColor</tt> visual. Note that you may experience colormap flashing if your X server is running in 8 bit mode. <p>Under Windows the size of the colormap is always set to 256 colors. Note that under Windows you can also install colormaps in child widgets. <p>This class uses {@link <a href="../shared.html">implicit sharing</a>} as a memory and speed optimization. <p>Example of use: <pre class="snippet">
    public static void main(String args[]) {
        QApplication.initialize(args);

        MyGLWidget widget = new MyGLWidget();  // a QGLWidget in color-index mode
        QGLColormap colormap = new QGLColormap();

        // This will fill the colormap with colors ranging from black to white.
        for (int i = 0; i &lt; colormap.size(); i++)
            colormap.setEntry(i, new QColor(i, i, i).rgb());

        widget.setColormap(colormap);
        widget.show();
        QApplication.exec();
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.opengl.QGLWidget#setColormap(com.trolltech.qt.opengl.QGLColormap) QGLWidget::setColormap()}, and {@link com.trolltech.qt.opengl.QGLWidget#colormap() QGLWidget::colormap()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGLColormap extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.opengl.QtJambi_LibraryInitializer.init();
    }

/**
Construct a QGLColormap.
*/

    public QGLColormap(){
        super((QPrivateConstructor)null);
        __qt_QGLColormap();
    }

    native void __qt_QGLColormap();

/**
Construct a shallow copy of <tt>map</tt>.
*/

    public QGLColormap(com.trolltech.qt.opengl.QGLColormap arg__1){
        super((QPrivateConstructor)null);
        __qt_QGLColormap_QGLColormap(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QGLColormap_QGLColormap(long arg__1);

/**
Returns the QRgb value in the colorcell with index <tt>idx</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor entryColor(int idx)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryColor_int(nativeId(), idx);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_entryColor_int(long __this__nativeId, int idx);

/**
Returns the QRgb value in the colorcell with index <tt>idx</tt>.
*/

    @QtBlockedSlot
    public final int entryRgb(int idx)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryRgb_int(nativeId(), idx);
    }
    @QtBlockedSlot
    native int __qt_entryRgb_int(long __this__nativeId, int idx);

/**
Returns the index of the color <tt>color</tt>. If <tt>color</tt> is not in the map, -1 is returned.
*/

    @QtBlockedSlot
    public final int find(int color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_int(nativeId(), color);
    }
    @QtBlockedSlot
    native int __qt_find_int(long __this__nativeId, int color);

/**
Returns the index of the color that is the closest match to color <tt>color</tt>.
*/

    @QtBlockedSlot
    public final int findNearest(int color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findNearest_int(nativeId(), color);
    }
    @QtBlockedSlot
    native int __qt_findNearest_int(long __this__nativeId, int color);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final long handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native long __qt_handle(long __this__nativeId);

/**
Returns true if the colormap is empty; otherwise returns false. A colormap with no color values set is considered to be empty.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);


    @QtBlockedSlot
    private final void setEntries(int count, com.trolltech.qt.QNativePointer colors) {
        setEntries(count, colors, (int)0);
    }
    @QtBlockedSlot
    private final void setEntries(int count, com.trolltech.qt.QNativePointer colors, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEntries_int_nativepointer_int(nativeId(), count, colors, base);
    }
    @QtBlockedSlot
    native void __qt_setEntries_int_nativepointer_int(long __this__nativeId, int count, com.trolltech.qt.QNativePointer colors, int base);

/**
This is an overloaded member function, provided for convenience. <p>Set the cell with index <tt>idx</tt> in the colormap to color <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void setEntry(int idx, com.trolltech.qt.gui.QColor color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEntry_int_QColor(nativeId(), idx, color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEntry_int_QColor(long __this__nativeId, int idx, long color);

/**
Set cell at index <tt>idx</tt> in the colormap to color <tt>color</tt>.
*/

    @QtBlockedSlot
    public final void setEntry(int idx, int color)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEntry_int_int(nativeId(), idx, color);
    }
    @QtBlockedSlot
    native void __qt_setEntry_int_int(long __this__nativeId, int idx, int color);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setHandle(long ahandle)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHandle_long(nativeId(), ahandle);
    }
    @QtBlockedSlot
    native void __qt_setHandle_long(long __this__nativeId, long ahandle);

/**
Returns the number of colorcells in the colormap.
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
@exclude
*/

    public static native QGLColormap fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGLColormap(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QGLColormap array[]);

/**
Set an array of cells in this colormap. <tt>count</tt> is the number of colors that should be set, <tt>colors</tt> is the array of colors, and <tt>base</tt> is the starting index.
*/

    public final void setEntries(int colors[], int base) {
        setEntries(colors.length, com.trolltech.qt.internal.QtJambiInternal.intArrayToNativePointer(colors), base);
    }

/**
Set an array of cells in this colormap. <tt>count</tt> is the number of colors that should be set, <tt>colors</tt> is the array of colors, and <tt>base</tt> is the starting index.
*/

    public final void setEntries(int colors[]) {
        setEntries(colors.length, com.trolltech.qt.internal.QtJambiInternal.intArrayToNativePointer(colors));
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QGLColormap clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QGLColormap __qt_clone(long __this_nativeId);
}
