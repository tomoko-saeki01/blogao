package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QScrollArea class provides a scrolling view onto another widget. A scroll area is used to display the contents of a child widget within a frame. If the widget exceeds the size of the frame, the view can provide scroll bars so that the entire area of the child widget can be viewed. The child widget must be specified with {@link com.trolltech.qt.gui.QScrollArea#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. For example: <pre class="snippet">
        QLabel imageLabel = new QLabel();
        QImage image = new QImage("happyguy.png");
        imageLabel.setPixmap(QPixmap.fromImage(image));

        QScrollArea scrollArea = new QScrollArea();
        scrollArea.setBackgroundRole(QPalette.ColorRole.Dark);
        scrollArea.setWidget(imageLabel);
</pre> The code above creates a scroll area (shown in the images below) containing an image label. When scaling the image, the scroll area can provide the necessary scroll bars: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qscrollarea-noscrollbars.png"></center><br></td><td>  <br><center><img src="../images/qscrollarea-onescrollbar.png"></center><br></td><td>  <br><center><img src="../images/qscrollarea-twoscrollbars.png"></center><br></td></tr></table> The scroll bars appearance depends on the currently set {@link com.trolltech.qt.core.Qt.ScrollBarPolicy scroll bar policies }. You can control the appearance of the scroll bars using the inherited functionality from {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea}. <p>For example, you can set the {@link QAbstractScrollArea#horizontalScrollBarPolicy() QAbstractScrollArea::horizontalScrollBarPolicy} and {@link QAbstractScrollArea#verticalScrollBarPolicy() QAbstractScrollArea::verticalScrollBarPolicy} properties. Or if you want the scroll bars to adjust dynamically when the contents of the scroll area changes, you can use the {@link com.trolltech.qt.gui.QAbstractScrollArea#horizontalScrollBar() horizontalScrollBar()} and {@link com.trolltech.qt.gui.QAbstractScrollArea#verticalScrollBar() verticalScrollBar()} functions (which enable you to access the scroll bars) and set the scroll bars' values whenever the scroll area's contents change, using the QScrollBar::setValue() function. <p>You can retrieve the child widget using the {@link com.trolltech.qt.gui.QScrollArea#widget() widget()} function. The view can be made to be resizable with the {@link com.trolltech.qt.gui.QScrollArea#setWidgetResizable(boolean) setWidgetResizable()} function. The alignment of the widget can be specified with {@link com.trolltech.qt.gui.QScrollArea#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <p>Two convenience functions {@link com.trolltech.qt.gui.QScrollArea#ensureVisible(int, int, int) ensureVisible()} and {@link com.trolltech.qt.gui.QScrollArea#ensureWidgetVisible(com.trolltech.qt.gui.QWidget, int) ensureWidgetVisible()} ensure a certain region of the contents is visible inside the viewport, by scrolling the contents if necessary.<a name="size-hints-and-layouts"><h2>Size Hints and Layouts</h2> When using a scroll area to display the contents of a custom widget, it is important to ensure that the {@link QWidget#sizeHint() size hint} of the child widget is set to a suitable value. If a standard {@link com.trolltech.qt.gui.QWidget QWidget} is used for the child widget, it may be necessary to call {@link QWidget#setMinimumSize(com.trolltech.qt.core.QSize) QWidget::setMinimumSize()} to ensure that the contents of the widget are shown correctly within the scroll area. <p>If a scroll area is used to display the contents of a widget that contains child widgets arranged in a layout, it is important to realise that the size policy of the layout will also determine the size of the widget. This is especially useful to know if you intend to dynamically change the contents of the layout. In such cases, setting the layout's {@link QLayout#sizeConstraint() size constraint} property to one which provides constraints on the minimum and/or maximum size of the layout (e.g., {@link com.trolltech.qt.gui.QLayout.SizeConstraint QLayout::SetMinAndMaxSize }) will cause the size of the the scroll area to be updated whenever the contents of the layout changes. <p>For a complete example using the QScrollArea class, see the {@link <a href="../widgets-imageviewer.html">Image Viewer</a>} example. The example shows how to combine {@link com.trolltech.qt.gui.QLabel QLabel} and QScrollArea to display an image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea}, {@link com.trolltech.qt.gui.QScrollBar QScrollBar}, and {@link <a href="../widgets-imageviewer.html">Image Viewer Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QScrollArea extends com.trolltech.qt.gui.QAbstractScrollArea
{


/**
Constructs an empty scroll area with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    public QScrollArea() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty scroll area with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    public QScrollArea(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QScrollArea_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QScrollArea_QWidget(long parent);

/**
This property holds the alignment of the scroll area's widget. By default, the widget stays rooted to the top-left corner of the scroll area.
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
Scrolls the contents of the scroll area so that the point (<tt>x</tt>, <tt>y</tt>) is visible inside the region of the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureVisible(int x, int y, int xmargin) {
        ensureVisible(x, y, xmargin, (int)50);
    }

/**
Scrolls the contents of the scroll area so that the point (<tt>x</tt>, <tt>y</tt>) is visible inside the region of the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureVisible(int x, int y) {
        ensureVisible(x, y, (int)50, (int)50);
    }
/**
Scrolls the contents of the scroll area so that the point (<tt>x</tt>, <tt>y</tt>) is visible inside the region of the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureVisible(int x, int y, int xmargin, int ymargin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureVisible_int_int_int_int(nativeId(), x, y, xmargin, ymargin);
    }
    @QtBlockedSlot
    native void __qt_ensureVisible_int_int_int_int(long __this__nativeId, int x, int y, int xmargin, int ymargin);


/**
Scrolls the contents of the scroll area so that the <tt>childWidget</tt> of {@link com.trolltech.qt.gui.QScrollArea#widget() QScrollArea::widget()} is visible inside the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureWidgetVisible(com.trolltech.qt.gui.QWidget childWidget, int xmargin) {
        ensureWidgetVisible(childWidget, xmargin, (int)50);
    }

/**
Scrolls the contents of the scroll area so that the <tt>childWidget</tt> of {@link com.trolltech.qt.gui.QScrollArea#widget() QScrollArea::widget()} is visible inside the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureWidgetVisible(com.trolltech.qt.gui.QWidget childWidget) {
        ensureWidgetVisible(childWidget, (int)50, (int)50);
    }
/**
Scrolls the contents of the scroll area so that the <tt>childWidget</tt> of {@link com.trolltech.qt.gui.QScrollArea#widget() QScrollArea::widget()} is visible inside the viewport with margins specified in pixels by <tt>xmargin</tt> and <tt>ymargin</tt>. If the specified point cannot be reached, the contents are scrolled to the nearest valid position. The default value for both margins is 50 pixels.
*/

    @QtBlockedSlot
    public final void ensureWidgetVisible(com.trolltech.qt.gui.QWidget childWidget, int xmargin, int ymargin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureWidgetVisible_QWidget_int_int(nativeId(), childWidget == null ? 0 : childWidget.nativeId(), xmargin, ymargin);
    }
    @QtBlockedSlot
    native void __qt_ensureWidgetVisible_QWidget_int_int(long __this__nativeId, long childWidget, int xmargin, int ymargin);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... arg__1) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(arg__1));
    }
/**
This property holds the alignment of the scroll area's widget. By default, the widget stays rooted to the top-left corner of the scroll area.
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int arg__1);

/**
Sets the scroll area's <tt>widget</tt>. <p>The <tt>widget</tt> becomes a child of the scroll area, and will be destroyed when the scroll area is deleted or when a new widget is set. <p>The widget's {@link QWidget#setAutoFillBackground(boolean) autoFillBackground} property will be set to <tt>true</tt>. <p>If the scroll area is visible when the <tt>widget</tt> is added, you must {@link com.trolltech.qt.gui.QWidget#show() show()} it explicitly. <p>Note that You must add the layout of <tt>widget</tt> before you call this function; if you add it later, the <tt>widget</tt> will not be visible - regardless of when you {@link com.trolltech.qt.gui.QWidget#show() show()} the scroll area. In this case, you can also not {@link com.trolltech.qt.gui.QWidget#show() show()} the <tt>widget</tt> later. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea#widget() widget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds whether the scroll area should resize the view widget. If this property is set to false (the default), the scroll area honors the size of its widget. Regardless of this property, you can programmatically resize the widget using {@link com.trolltech.qt.gui.QScrollArea#widget() widget()}-&gt;resize(), and the scroll area will automatically adjust itself to the new size. <p>If this property is set to true, the scroll area will automatically resize the widget in order to avoid scroll bars where they can be avoided, or to take advantage of extra space.
*/

    @com.trolltech.qt.QtPropertyWriter(name="widgetResizable")
    @QtBlockedSlot
    public final void setWidgetResizable(boolean resizable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidgetResizable_boolean(nativeId(), resizable);
    }
    @QtBlockedSlot
    native void __qt_setWidgetResizable_boolean(long __this__nativeId, boolean resizable);

/**
Removes the scroll area's widget, and passes ownership of the widget to the caller. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea#widget() widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget takeWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_takeWidget(long __this__nativeId);

/**
Returns the scroll area's widget, or 0 if there is none. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
This property holds whether the scroll area should resize the view widget. If this property is set to false (the default), the scroll area honors the size of its widget. Regardless of this property, you can programmatically resize the widget using {@link com.trolltech.qt.gui.QScrollArea#widget() widget()}-&gt;resize(), and the scroll area will automatically adjust itself to the new size. <p>If this property is set to true, the scroll area will automatically resize the widget in order to avoid scroll bars where they can be avoided, or to take advantage of extra space.
*/

    @com.trolltech.qt.QtPropertyReader(name="widgetResizable")
    @QtBlockedSlot
    public final boolean widgetResizable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widgetResizable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_widgetResizable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

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
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

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
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QScrollArea fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QScrollArea(QPrivateConstructor p) { super(p); } 
}
