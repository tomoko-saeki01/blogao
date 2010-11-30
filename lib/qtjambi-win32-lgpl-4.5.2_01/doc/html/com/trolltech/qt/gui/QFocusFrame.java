package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFocusFrame widget provides a focus frame which can be outside of a widget's normal paintable area. Normally an application will not need to create its own QFocusFrame as {@link com.trolltech.qt.gui.QStyle QStyle} will handle this detail for you. A style writer can optionally use a QFocusFrame to have a focus area outside of the widget's paintable geometry. In this way space need not be reserved for the widget to have focus but only set on a {@link com.trolltech.qt.gui.QWidget QWidget} with QFocusFrame::setWidget. It is, however, legal to create your own QFocusFrame on a custom widget and set its geometry manually via QWidget::setGeometry however you will not get auto-placement when the focused widget changes size or placement.
*/
@QtJambiGeneratedClass
public class QFocusFrame extends com.trolltech.qt.gui.QWidget
{

    private Object __rcWidget = null;


/**
Constructs a QFocusFrame. <p>The focus frame will not monitor <tt>parent</tt> for updates but rather can be placed manually or by using QFocusFrame::setWidget. A QFocusFrame sets {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NoChildEventsForParent } attribute; as a result the parent will not receive a {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildInserted } event, this will make it possible to manually set the geometry of the QFocusFrame inside of a {@link com.trolltech.qt.gui.QSplitter QSplitter} or other child event monitoring widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFocusFrame#setWidget(com.trolltech.qt.gui.QWidget) QFocusFrame::setWidget()}. <br></DD></DT>
*/

    public QFocusFrame() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QFocusFrame. <p>The focus frame will not monitor <tt>parent</tt> for updates but rather can be placed manually or by using QFocusFrame::setWidget. A QFocusFrame sets {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NoChildEventsForParent } attribute; as a result the parent will not receive a {@link com.trolltech.qt.core.QEvent.Type QEvent::ChildInserted } event, this will make it possible to manually set the geometry of the QFocusFrame inside of a {@link com.trolltech.qt.gui.QSplitter QSplitter} or other child event monitoring widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFocusFrame#setWidget(com.trolltech.qt.gui.QWidget) QFocusFrame::setWidget()}. <br></DD></DT>
*/

    public QFocusFrame(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QFocusFrame_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFocusFrame_QWidget(long parent);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
QFocusFrame will track changes to <tt>widget</tt> and resize itself automatically. If the monitored widget's parent changes, QFocusFrame will follow the widget and place itself around the widget automatically. If the monitored widget is deleted, QFocusFrame will set it to zero. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFocusFrame#widget() QFocusFrame::widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcWidget = widget;
        }
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
Returns the currently monitored widget for automatically resize and update. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFocusFrame#setWidget(com.trolltech.qt.gui.QWidget) QFocusFrame::setWidget()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

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
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QFocusFrame fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFocusFrame(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QFocusFrame. This
method is useful for subclasses when they need a QStyleOption, but
don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOption option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
