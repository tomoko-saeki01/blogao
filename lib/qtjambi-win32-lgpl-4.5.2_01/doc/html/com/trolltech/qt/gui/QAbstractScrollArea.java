package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractScrollArea widget provides a scrolling area with on-demand scroll bars. QAbstractScrollArea is a low-level abstraction of a scrolling area. The area provides a central widget called the viewport, in which the contents of the area is to be scrolled (i.e, the visible parts of the contents are rendered in the viewport). <p>Next to the viewport is a vertical scroll bar, and below is a horizontal scroll bar. When all of the area contents fits in the viewport, each scroll bar can be either visible or hidden depending on the scroll bar's {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarPolicy }. When a scroll bar is hidden, the viewport expands in order to cover all available space. When a scroll bar becomes visible again, the viewport shrinks in order to make room for the scroll bar. <p>It is possible to reserve a margin area around the viewport, see {@link com.trolltech.qt.gui.QAbstractScrollArea#setViewportMargins(int, int, int, int) setViewportMargins()}. The feature is mostly used to place a {@link com.trolltech.qt.gui.QHeaderView QHeaderView} widget above or beside the scrolling area. Subclasses of QAbstractScrollArea should implement margins. <p>When inheriting QAbstractScrollArea, you need to do the following: <ul><li> Control the scroll bars by setting their range, value, page step, and tracking their movements.</li><li> Draw the contents of the area in the viewport according to the values of the scroll bars.</li><li> Handle events received by the viewport in {@link com.trolltech.qt.gui.QAbstractScrollArea#viewportEvent(com.trolltech.qt.core.QEvent) viewportEvent()} - notably resize events.</li><li> Use <tt>viewport-&gt;update()</tt> to update the contents of the viewport instead of {@link com.trolltech.qt.gui.QWidget#update() update()} as all painting operations take place on the viewport.</li></ul> With a scroll bar policy of {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAsNeeded } (the default), QAbstractScrollArea shows scroll bars when they provide a non-zero scrolling range, and hides them otherwise. <p>The scroll bars and viewport should be updated whenever the viewport receives a resize event or the size of the contents changes. The viewport also needs to be updated when the scroll bars values change. The initial values of the scroll bars are often set when the area receives new contents. <p>We give a simple example, in which we have implemented a scroll area that can scroll any {@link com.trolltech.qt.gui.QWidget QWidget}. We make the widget a child of the viewport; this way, we do not have to calculate which part of the widget to draw but can simply move the widget with {@link QWidget#move(com.trolltech.qt.core.QPoint) QWidget::move()}. When the area contents or the viewport size changes, we do the following: <pre class="snippet">
        QSize areaSize = viewport().size();
        QSize  widgetSize = widget.size();

        verticalScrollBar().setPageStep(widgetSize.height());
        horizontalScrollBar().setPageStep(widgetSize.width());
        verticalScrollBar().setRange(0, widgetSize.height() - areaSize.height());
        horizontalScrollBar().setRange(0, widgetSize.width() - areaSize.width());
        updateWidgetPosition();
    </pre> When the scroll bars change value, we need to update the widget position, i.e., find the part of the widget that is to be drawn in the viewport: <pre class="snippet">
        int hvalue = horizontalScrollBar().value();
        int vvalue = verticalScrollBar().value();
        QPoint topLeft = viewport().rect().topLeft();

        widget.move(topLeft.x() - hvalue, topLeft.y() - vvalue);
    </pre> In order to track scroll bar movements, reimplement the virtual function {@link com.trolltech.qt.gui.QAbstractScrollArea#scrollContentsBy(int, int) scrollContentsBy()}. In order to fine-tune scrolling behavior, connect to a scroll bar's {@link com.trolltech.qt.gui.QAbstractSlider#actionTriggered QAbstractSlider::actionTriggered() } signal and adjust the {@link QAbstractSlider#sliderPosition() QAbstractSlider::sliderPosition} as you wish. <p>For convenience, QAbstractScrollArea makes all viewport events available in the virtual {@link com.trolltech.qt.gui.QAbstractScrollArea#viewportEvent(com.trolltech.qt.core.QEvent) viewportEvent()} handler. {@link com.trolltech.qt.gui.QWidget QWidget}'s specialized handlers are remapped to viewport events in the cases where this makes sense. The remapped specialized handlers are: paintEvent(), mousePressEvent(), mouseReleaseEvent(), mouseDoubleClickEvent(), mouseMoveEvent(), wheelEvent(), dragEnterEvent(), dragMoveEvent(), dragLeaveEvent(), dropEvent(), contextMenuEvent(), and resizeEvent(). <p>{@link com.trolltech.qt.gui.QScrollArea QScrollArea}, which inherits QAbstractScrollArea, provides smooth scrolling for any {@link com.trolltech.qt.gui.QWidget QWidget} (i.e., the widget is scrolled pixel by pixel). You only need to subclass QAbstractScrollArea if you need more specialized behavior. This is, for instance, true if the entire contents of the area is not suitable for being drawn on a {@link com.trolltech.qt.gui.QWidget QWidget} or if you do not want smooth scrolling. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea QScrollArea}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAbstractScrollArea extends com.trolltech.qt.gui.QFrame
{


/**
Constructs a viewport. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor.
*/

    public QAbstractScrollArea() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a viewport. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor.
*/

    public QAbstractScrollArea(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractScrollArea_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractScrollArea_QWidget(long parent);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addScrollBarWidget(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.addScrollBarWidget(widget, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Adds <tt>widget</tt> as a scroll bar widget in the location specified by <tt>alignment</tt>. <p>Scroll bar widgets are shown next to the horizontal or vertical scroll bar, and can be placed on either side of it. If you want the scroll bar widgets to be always visible, set the scrollBarPolicy for the corresponding scroll bar to <tt>AlwaysOn</tt>. <p><tt>alignment</tt> must be one of Qt::Alignleft and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, which maps to the horizontal scroll bar, or {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop } and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignBottom }, which maps to the vertical scroll bar. <p>A scroll bar widget can be removed by either re-parenting the widget or deleting it. It's also possible to hide a widget with {@link com.trolltech.qt.gui.QWidget#hide() QWidget::hide()} <p>The scroll bar widget will be resized to fit the scroll bar geometry for the current style. The following describes the case for scroll bar widgets on the horizontal scroll bar: <p>The height of the widget will be set to match the height of the scroll bar. To control the width of the widget, use QWidget::setMinimumWidth and QWidget::setMaximumWidth, or implement {@link QWidget#sizeHint() QWidget::sizeHint()} and set a horizontal size policy. If you want a square widget, call QStyle::pixelMetric({@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_ScrollBarExtent }) and set the width to this value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#scrollBarWidgets(com.trolltech.qt.core.Qt.AlignmentFlag[]) scrollBarWidgets()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addScrollBarWidget(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addScrollBarWidget_QWidget_Alignment(nativeId(), widget == null ? 0 : widget.nativeId(), alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addScrollBarWidget_QWidget_Alignment(long __this__nativeId, long widget, int alignment);

/**
Returns the widget in the corner between the two scroll bars. <p>By default, no corner widget is present. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#setCornerWidget(com.trolltech.qt.gui.QWidget) setCornerWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cornerWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cornerWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_cornerWidget(long __this__nativeId);

/**
Returns the horizontal scroll bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#setHorizontalScrollBar(com.trolltech.qt.gui.QScrollBar) setHorizontalScrollBar()}, {@link QAbstractScrollArea#horizontalScrollBarPolicy() horizontalScrollBarPolicy}, and {@link com.trolltech.qt.gui.QAbstractScrollArea#verticalScrollBar() verticalScrollBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QScrollBar horizontalScrollBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalScrollBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QScrollBar __qt_horizontalScrollBar(long __this__nativeId);

/**
This property holds the policy for the horizontal scroll bar. The default policy is {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAsNeeded }. <p><DT><b>See also:</b><br><DD>{@link QAbstractScrollArea#verticalScrollBarPolicy() verticalScrollBarPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="horizontalScrollBarPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ScrollBarPolicy horizontalScrollBarPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ScrollBarPolicy.resolve(__qt_horizontalScrollBarPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_horizontalScrollBarPolicy(long __this__nativeId);

/**
Returns the size of the viewport as if the scroll bars had no valid scrolling range.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize maximumViewportSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumViewportSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_maximumViewportSize(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QWidget> scrollBarWidgets(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        return this.scrollBarWidgets(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Returns a list of the currently set scroll bar widgets. <tt>alignment</tt> can be any combination of the four location flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#addScrollBarWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.AlignmentFlag[]) addScrollBarWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QWidget> scrollBarWidgets(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollBarWidgets_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QWidget> __qt_scrollBarWidgets_Alignment(long __this__nativeId, int alignment);

/**
Sets the widget in the corner between the two scroll bars to be <tt>widget</tt>. <p>You will probably also want to set at least one of the scroll bar modes to <tt>AlwaysOn</tt>. <p>Passing 0 shows no widget in the corner. <p>Any previous corner widget is hidden. <p>You may call {@link com.trolltech.qt.gui.QAbstractScrollArea#setCornerWidget(com.trolltech.qt.gui.QWidget) setCornerWidget()} with the same widget at different times. <p>All widgets set here will be deleted by the scroll area when it is destroyed unless you separately reparent the widget after setting some other corner widget (or 0). <p>Any newly set widget should have no current parent. <p>By default, no corner widget is present. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#cornerWidget() cornerWidget()}, {@link QAbstractScrollArea#horizontalScrollBarPolicy() horizontalScrollBarPolicy}, and {@link QAbstractScrollArea#horizontalScrollBarPolicy() horizontalScrollBarPolicy}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCornerWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCornerWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCornerWidget_QWidget(long __this__nativeId, long widget);

/**
Replaces the existing horizontal scroll bar with <tt>scrollBar</tt>, and sets all the former scroll bar's slider properties on the new scroll bar. The former scroll bar is then deleted. <p>QAbstractScrollArea already provides horizontal and vertical scroll bars by default. You can call this function to replace the default horizontal scroll bar with your own custom scroll bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#horizontalScrollBar() horizontalScrollBar()}, and {@link com.trolltech.qt.gui.QAbstractScrollArea#setVerticalScrollBar(com.trolltech.qt.gui.QScrollBar) setVerticalScrollBar()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setHorizontalScrollBar(com.trolltech.qt.gui.QScrollBar scrollbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalScrollBar_QScrollBar(nativeId(), scrollbar == null ? 0 : scrollbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setHorizontalScrollBar_QScrollBar(long __this__nativeId, long scrollbar);

/**
This property holds the policy for the horizontal scroll bar. The default policy is {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAsNeeded }. <p><DT><b>See also:</b><br><DD>{@link QAbstractScrollArea#verticalScrollBarPolicy() verticalScrollBarPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="horizontalScrollBarPolicy")
    @QtBlockedSlot
    public final void setHorizontalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalScrollBarPolicy_ScrollBarPolicy(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalScrollBarPolicy_ScrollBarPolicy(long __this__nativeId, int arg__1);

/**
Replaces the existing vertical scroll bar with <tt>scrollBar</tt>, and sets all the former scroll bar's slider properties on the new scroll bar. The former scroll bar is then deleted. <p>QAbstractScrollArea already provides vertical and horizontal scroll bars by default. You can call this function to replace the default vertical scroll bar with your own custom scroll bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#verticalScrollBar() verticalScrollBar()}, and {@link com.trolltech.qt.gui.QAbstractScrollArea#setHorizontalScrollBar(com.trolltech.qt.gui.QScrollBar) setHorizontalScrollBar()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setVerticalScrollBar(com.trolltech.qt.gui.QScrollBar scrollbar)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalScrollBar_QScrollBar(nativeId(), scrollbar == null ? 0 : scrollbar.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setVerticalScrollBar_QScrollBar(long __this__nativeId, long scrollbar);

/**
This property holds the policy for the vertical scroll bar. The default policy is {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAsNeeded }. <p><DT><b>See also:</b><br><DD>{@link QAbstractScrollArea#horizontalScrollBarPolicy() horizontalScrollBarPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="verticalScrollBarPolicy")
    @QtBlockedSlot
    public final void setVerticalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalScrollBarPolicy_ScrollBarPolicy(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setVerticalScrollBarPolicy_ScrollBarPolicy(long __this__nativeId, int arg__1);

/**
Sets the viewport to be the given <tt>widget</tt>. The QAbstractScrollArea will take ownership of the given <tt>widget</tt>. <p>If <tt>widget</tt> is 0, QAbstractScrollArea will assign a new {@link com.trolltech.qt.gui.QWidget QWidget} instance for the viewport. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setViewport(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewport_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setViewport_QWidget(long __this__nativeId, long widget);

/**
Sets the margins around the scrolling area to <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt>. This is useful for applications such as spreadsheets with "locked" rows and columns. The marginal space is is left blank; put widgets in the unused area. <p>Note that this function is frequently called by {@link com.trolltech.qt.gui.QTreeView QTreeView} and {@link com.trolltech.qt.gui.QTableView QTableView}, so margins must be implemented by QAbstractScrollArea subclasses. Also, if the subclasses are to be used in item views, they should not call this function. <p>By default all margins are zero.
*/

    @QtBlockedSlot
    protected final void setViewportMargins(int left, int top, int right, int bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewportMargins_int_int_int_int(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setViewportMargins_int_int_int_int(long __this__nativeId, int left, int top, int right, int bottom);

/**
This slot is called by QAbstractScrollArea after setViewport(<tt>viewport</tt>) has been called. Reimplement this function in a subclass of QAbstractScrollArea to initialize the new <tt>viewport</tt> before it is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#setViewport(com.trolltech.qt.gui.QWidget) setViewport()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    protected void setupViewport(com.trolltech.qt.gui.QWidget viewport)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setupViewport_QWidget(nativeId(), viewport == null ? 0 : viewport.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setupViewport_QWidget(long __this__nativeId, long viewport);

/**
Returns the vertical scroll bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#setVerticalScrollBar(com.trolltech.qt.gui.QScrollBar) setVerticalScrollBar()}, {@link QAbstractScrollArea#verticalScrollBarPolicy() verticalScrollBarPolicy}, and {@link com.trolltech.qt.gui.QAbstractScrollArea#horizontalScrollBar() horizontalScrollBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QScrollBar verticalScrollBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalScrollBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QScrollBar __qt_verticalScrollBar(long __this__nativeId);

/**
This property holds the policy for the vertical scroll bar. The default policy is {@link com.trolltech.qt.core.Qt.ScrollBarPolicy Qt::ScrollBarAsNeeded }. <p><DT><b>See also:</b><br><DD>{@link QAbstractScrollArea#horizontalScrollBarPolicy() horizontalScrollBarPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="verticalScrollBarPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ScrollBarPolicy verticalScrollBarPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ScrollBarPolicy.resolve(__qt_verticalScrollBarPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_verticalScrollBarPolicy(long __this__nativeId);

/**
Returns the viewport widget. <p>Use the {@link com.trolltech.qt.gui.QScrollArea#widget() QScrollArea::widget()} function to retrieve the contents of the viewport widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractScrollArea#setViewport(com.trolltech.qt.gui.QWidget) setViewport()}, and {@link com.trolltech.qt.gui.QScrollArea#widget() QScrollArea::widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget viewport()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewport(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_viewport(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long arg__1);

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
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

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
This virtual handler is called when the scroll bars are moved by <tt>dx</tt>, <tt>dy</tt>, and consequently the viewport's contents should be scrolled accordingly. <p>The default implementation simply calls {@link com.trolltech.qt.gui.QWidget#update() update()} on the entire {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}, subclasses can reimplement this handler for optimization purposes, or - like {@link com.trolltech.qt.gui.QScrollArea QScrollArea} - to move a contents widget. The parameters <tt>dx</tt> and <tt>dy</tt> are there for convenience, so that the class knows how much should be scrolled (useful e.g. when doing pixel-shifts). You may just as well ignore these values and scroll directly to the position the scroll bars indicate. <p>Calling this function in order to scroll programmatically is an error, use the scroll bars instead (e.g. by calling QScrollBar::setValue() directly).
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
The main event handler for the scrolling area (the {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()} widget). It handles the <tt>event</tt> specified, and can be called by subclasses to provide reasonable default behavior. <p>Returns true to indicate to the event system that the event has been handled, and needs no further processing; otherwise returns false to indicate that the event should be propagated further. <p>You can reimplement this function in a subclass, but we recommend using one of the specialized event handlers instead. <p>Specialised handlers for viewport events are: paintEvent(), mousePressEvent(), mouseReleaseEvent(), mouseDoubleClickEvent(), mouseMoveEvent(), wheelEvent(), dragEnterEvent(), dragMoveEvent(), dragLeaveEvent(), dropEvent(), contextMenuEvent(), and resizeEvent().
*/

    @QtBlockedSlot
    protected boolean viewportEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_viewportEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QAbstractScrollArea fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractScrollArea(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QPaintEngine paintEngine() {
        throw new RuntimeException("Cannot open a painter directly on a QAbstractScrollArea, open QPainter on its viewport instead...");
    }

}
