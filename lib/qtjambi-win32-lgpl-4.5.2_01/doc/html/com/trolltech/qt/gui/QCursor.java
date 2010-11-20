package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCursor class provides a mouse cursor with an arbitrary shape. This class is mainly used to create mouse cursors that are associated with particular widgets and to get and set the position of the mouse cursor. <p>Qt has a number of standard cursor shapes, but you can also make custom cursor shapes based on a {@link com.trolltech.qt.gui.QBitmap QBitmap}, a mask and a hotspot. <p>To associate a cursor with a widget, use {@link QWidget#setCursor(com.trolltech.qt.gui.QCursor) QWidget::setCursor()}. To associate a cursor with all widgets (normally for a short period of time), use {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) QApplication::setOverrideCursor()}. <p>To set a cursor shape use {@link com.trolltech.qt.gui.QCursor#setShape(com.trolltech.qt.core.Qt.CursorShape) QCursor::setShape()} or use the QCursor constructor which takes the shape as argument, or you can use one of the predefined cursors defined in the {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } enum. <p>If you want to create a cursor with your own bitmap, either use the QCursor constructor which takes a bitmap and a mask or the constructor which takes a pixmap as arguments. <p>To set or get the position of the mouse cursor use the static methods {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()} and {@link com.trolltech.qt.gui.QCursor#setPos(com.trolltech.qt.core.QPoint) QCursor::setPos()}. <p><b>Note:</b> It is possible to create a QCursor before {@link com.trolltech.qt.gui.QApplication QApplication}, but it is not useful except as a place-holder for a real QCursor created after {@link com.trolltech.qt.gui.QApplication QApplication}. Attempting to use a QCursor that was created before {@link com.trolltech.qt.gui.QApplication QApplication} will result in a crash.<a name="a-note-for-x11-users"><h2>A Note for X11 Users</h2> On X11, Qt supports the Xcursor library, which allows for full color icon themes. The table below shows the cursor name used for each {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } value. If a cursor cannot be found using the name shown below, a standard X11 cursor will be used instead. Note: X11 does not provide appropriate cursors for all possible {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } values. It is possible that some cursors will be taken from the Xcursor theme, while others will use an internal bitmap cursor. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Shape</center></th><th><center> {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } Value</center></th><th><center> Cursor Name</center></th><th><center> Shape</center></th><th><center> {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } Value</center></th><th><center> Cursor Name</center></th></tr></thead><tr valign="top" class="even"><td>  <br><center><img src="../images/cursor-arrow.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::ArrowCursor }</td><td> <tt>left_ptr</tt></td><td>  <br><center><img src="../images/cursor-sizev.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SizeVerCursor }</td><td> <tt>size_ver</tt></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/cursor-uparrow.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::UpArrowCursor }</td><td> <tt>up_arrow</tt></td><td>  <br><center><img src="../images/cursor-sizeh.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SizeHorCursor }</td><td> <tt>size_hor</tt></td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/cursor-cross.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::CrossCursor }</td><td> <tt>cross</tt></td><td>  <br><center><img src="../images/cursor-sizeb.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SizeBDiagCursor }</td><td> <tt>size_bdiag</tt></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/cursor-ibeam.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::IBeamCursor }</td><td> <tt>ibeam</tt></td><td>  <br><center><img src="../images/cursor-sizef.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SizeFDiagCursor }</td><td> <tt>size_fdiag</tt></td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/cursor-wait.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::WaitCursor }</td><td> <tt>wait</tt></td><td>  <br><center><img src="../images/cursor-sizeall.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SizeAllCursor }</td><td> <tt>size_all</tt></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/cursor-busy.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::BusyCursor }</td><td> <tt>left_ptr_watch</tt></td><td>  <br><center><img src="../images/cursor-hsplit.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SplitVCursor }</td><td> <tt>split_v</tt></td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/cursor-forbidden.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::ForbiddenCursor }</td><td> <tt>forbidden</tt></td><td>  <br><center><img src="../images/cursor-vsplit.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::SplitHCursor }</td><td> <tt>split_h</tt></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/cursor-hand.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::PointingHandCursor }</td><td> <tt>pointing_hand</tt></td><td>  <br><center><img src="../images/cursor-openhand.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::OpenHandCursor }</td><td> <tt>openhand</tt></td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/cursor-whatsthis.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::WhatsThisCursor }</td><td> <tt>whats_this</tt></td><td>  <br><center><img src="../images/cursor-closedhand.png"></center><br></td><td> {@link com.trolltech.qt.core.Qt.CursorShape Qt::ClosedHandCursor }</td><td> <tt>closedhand</tt></td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget QWidget}, and {@link <a href="../guibooks.html">GUI Design Handbook: Cursors</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCursor extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a cursor with the default arrow shape.
*/

    public QCursor(){
        super((QPrivateConstructor)null);
        __qt_QCursor();
    }

    native void __qt_QCursor();

/**
Constructs a cursor with the specified <tt>shape</tt>. <p>See {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } for a list of shapes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#setShape(com.trolltech.qt.core.Qt.CursorShape) setShape()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.core.Qt.CursorShape shape){
        super((QPrivateConstructor)null);
        __qt_QCursor_CursorShape(shape.value());
    }

    native void __qt_QCursor_CursorShape(int shape);


/**
Constructs a custom bitmap cursor. <p><tt>bitmap</tt> and <tt>mask</tt> make up the bitmap. <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>bitmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>bitmap().height()/2</tt>. <p>The cursor <tt>bitmap</tt> (B) and <tt>mask</tt> (M) bits are combined like this: <ul><li> B=1 and M=1 gives black.</li><li> B=0 and M=1 gives white.</li><li> B=0 and M=0 gives transparent.</li><li> B=1 and M=0 gives an XOR'd result.</li></ul> Use the global Qt color {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } to draw 0-pixels and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } to draw 1-pixels in the bitmaps. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QBitmap::QBitmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QBitmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QBitmap bitmap, com.trolltech.qt.gui.QBitmap mask, int hotX) {
        this(bitmap, mask, hotX, (int)-1);
    }

/**
Constructs a custom bitmap cursor. <p><tt>bitmap</tt> and <tt>mask</tt> make up the bitmap. <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>bitmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>bitmap().height()/2</tt>. <p>The cursor <tt>bitmap</tt> (B) and <tt>mask</tt> (M) bits are combined like this: <ul><li> B=1 and M=1 gives black.</li><li> B=0 and M=1 gives white.</li><li> B=0 and M=0 gives transparent.</li><li> B=1 and M=0 gives an XOR'd result.</li></ul> Use the global Qt color {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } to draw 0-pixels and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } to draw 1-pixels in the bitmaps. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QBitmap::QBitmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QBitmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QBitmap bitmap, com.trolltech.qt.gui.QBitmap mask) {
        this(bitmap, mask, (int)-1, (int)-1);
    }
/**
Constructs a custom bitmap cursor. <p><tt>bitmap</tt> and <tt>mask</tt> make up the bitmap. <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>bitmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>bitmap().height()/2</tt>. <p>The cursor <tt>bitmap</tt> (B) and <tt>mask</tt> (M) bits are combined like this: <ul><li> B=1 and M=1 gives black.</li><li> B=0 and M=1 gives white.</li><li> B=0 and M=0 gives transparent.</li><li> B=1 and M=0 gives an XOR'd result.</li></ul> Use the global Qt color {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color0 } to draw 0-pixels and {@link com.trolltech.qt.core.Qt.GlobalColor Qt::color1 } to draw 1-pixels in the bitmaps. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QBitmap::QBitmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QBitmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QBitmap bitmap, com.trolltech.qt.gui.QBitmap mask, int hotX, int hotY){
        super((QPrivateConstructor)null);
        __qt_QCursor_QBitmap_QBitmap_int_int(bitmap == null ? 0 : bitmap.nativeId(), mask == null ? 0 : mask.nativeId(), hotX, hotY);
    }

    native void __qt_QCursor_QBitmap_QBitmap_int_int(long bitmap, long mask, int hotX, int hotY);

/**
Constructs a copy of the cursor <tt>c</tt>.
*/

    public QCursor(com.trolltech.qt.gui.QCursor cursor){
        super((QPrivateConstructor)null);
        __qt_QCursor_QCursor(cursor == null ? 0 : cursor.nativeId());
    }

    native void __qt_QCursor_QCursor(long cursor);


/**
Constructs a custom pixmap cursor. <p><tt>pixmap</tt> is the image. It is usual to give it a mask (set using {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}). <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>pixmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>pixmap().height()/2</tt>. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QPixmap::QPixmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QPixmap pixmap, int hotX) {
        this(pixmap, hotX, (int)-1);
    }

/**
Constructs a custom pixmap cursor. <p><tt>pixmap</tt> is the image. It is usual to give it a mask (set using {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}). <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>pixmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>pixmap().height()/2</tt>. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QPixmap::QPixmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QPixmap pixmap) {
        this(pixmap, (int)-1, (int)-1);
    }
/**
Constructs a custom pixmap cursor. <p><tt>pixmap</tt> is the image. It is usual to give it a mask (set using {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}). <tt>hotX</tt> and <tt>hotY</tt> define the cursor's hot spot. <p>If <tt>hotX</tt> is negative, it is set to the <tt>pixmap().width()/2</tt>. If <tt>hotY</tt> is negative, it is set to the <tt>pixmap().height()/2</tt>. <p>Valid cursor sizes depend on the display hardware (or the underlying window system). We recommend using 32 x 32 cursors, because this size is supported on all platforms. Some platforms also support 16 x 16, 48 x 48, and 64 x 64 cursors. <p><b>Note:</b> On Windows CE, the cursor size is fixed. If the pixmap is bigger than the system size, it will be scaled. <p><DT><b>See also:</b><br><DD>QPixmap::QPixmap(), and {@link com.trolltech.qt.gui.QPixmap#setMask(com.trolltech.qt.gui.QBitmap) QPixmap::setMask()}. <br></DD></DT>
*/

    public QCursor(com.trolltech.qt.gui.QPixmap pixmap, int hotX, int hotY){
        super((QPrivateConstructor)null);
        __qt_QCursor_QPixmap_int_int(pixmap == null ? 0 : pixmap.nativeId(), hotX, hotY);
    }

    native void __qt_QCursor_QPixmap_int_int(long pixmap, int hotX, int hotY);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer bitmap_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bitmap_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_bitmap_private(long __this__nativeId);

/**
Returns the cursor hot spot, or (0, 0) if it is one of the standard cursors.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint hotSpot()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hotSpot(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_hotSpot(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer mask_private()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mask_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_mask_private(long __this__nativeId);

/**
<brief>Writes thisQCursor
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream outS)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), outS == null ? 0 : outS.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long outS);

/**
<brief>Reads a QCursor
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream inS)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), inS == null ? 0 : inS.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long inS);

/**
Returns the cursor pixmap. This is only valid if the cursor is a pixmap cursor.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap(long __this__nativeId);

/**
Sets the cursor to the shape identified by <tt>shape</tt>. <p>See {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } for the list of cursor shapes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#shape() shape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShape(com.trolltech.qt.core.Qt.CursorShape newShape)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShape_CursorShape(nativeId(), newShape.value());
    }
    @QtBlockedSlot
    native void __qt_setShape_CursorShape(long __this__nativeId, int newShape);

/**
Returns the cursor shape identifier. The return value is one of the {@link com.trolltech.qt.core.Qt.CursorShape Qt::CursorShape } enum values (cast to an int). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#setShape(com.trolltech.qt.core.Qt.CursorShape) setShape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CursorShape shape()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CursorShape.resolve(__qt_shape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shape(long __this__nativeId);

/**
Returns the position of the cursor (hot spot) in global screen coordinates. <p>You can call {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) QWidget::mapFromGlobal()} to translate it to widget coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#setPos(com.trolltech.qt.core.QPoint) setPos()}, {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) QWidget::mapFromGlobal()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QPoint pos();

/**
This is an overloaded member function, provided for convenience. <p>Moves the cursor (hot spot) to the global screen position at point <tt>p</tt>.
*/

    public static void setPos(com.trolltech.qt.core.QPoint p)    {
        __qt_setPos_QPoint(p == null ? 0 : p.nativeId());
    }
    native static void __qt_setPos_QPoint(long p);

/**
Moves the cursor (hot spot) to the global screen position (<tt>x</tt>, <tt>y</tt>). <p>You can call {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()} to translate widget coordinates to global screen coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#pos() pos()}, {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) QWidget::mapFromGlobal()}, and {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) QWidget::mapToGlobal()}. <br></DD></DT>
*/

    public native static void setPos(int x, int y);

/**
@exclude
*/

    public static native QCursor fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCursor(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QCursor array[]);

    // TEMPLATE - gui.cursor_bitmap_getter - START
    // TEMPLATE - gui.getter_returning_nativepointer - START
/**
Returns the cursor bitmap, or null if it is one of the standard
cursors.
*/

    public final QBitmap bitmap() {
        QNativePointer np = bitmap_private();
        QBitmap tmp = np == null ? null : QBitmap.fromNativePointer(np);
        return tmp == null ? null : new QBitmap(tmp);
    }

    // TEMPLATE - gui.getter_returning_nativepointer - END
    // TEMPLATE - gui.cursor_bitmap_getter - END


    // TEMPLATE - gui.cursor_bitmap_getter - START
    // TEMPLATE - gui.getter_returning_nativepointer - START
/**
Returns the cursor bitmap mask, or null if it is one of the standard
cursors.
*/

    public final QBitmap mask() {
        QNativePointer np = mask_private();
        QBitmap tmp = np == null ? null : QBitmap.fromNativePointer(np);
        return tmp == null ? null : new QBitmap(tmp);
    }

    // TEMPLATE - gui.getter_returning_nativepointer - END
    // TEMPLATE - gui.cursor_bitmap_getter - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QCursor clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QCursor __qt_clone(long __this_nativeId);
}
