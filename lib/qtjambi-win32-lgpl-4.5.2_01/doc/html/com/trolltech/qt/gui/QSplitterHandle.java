package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSplitterHandle class provides handle functionality of the splitter. QSplitterHandle is typically what people think about when they think about a splitter. It is the handle that is used to resize the widgets. <p>A typical developer using {@link com.trolltech.qt.gui.QSplitter QSplitter} will never have to worry about QSplitterHandle. It is provided for developers who want splitter handles that provide extra features, such as popup menus. <p>The typical way one would create splitter handles is to subclass {@link com.trolltech.qt.gui.QSplitter QSplitter} then reimplement {@link com.trolltech.qt.gui.QSplitter#createHandle() QSplitter::createHandle()} to instantiate the custom splitter handle. For example, a minimum {@link com.trolltech.qt.gui.QSplitter QSplitter} subclass might look like this: <pre class="snippet">
public class Splitter extends QSplitter
{

    public Splitter(Qt.Orientation orientation, QWidget parent)
    {
        ...
    }

    protected QSplitterHandle createHandle()
    {
        ...
    }
};
</pre> The {@link com.trolltech.qt.gui.QSplitter#createHandle() createHandle()} implementation simply constructs a custom splitter handle, called <tt>Splitter</tt> in this example: <pre class="snippet">
    protected QSplitterHandle createHandle()
    {
        return new SplitterHandle(orientation(), this);
    }
    </pre> Information about a given handle can be obtained using functions like {@link com.trolltech.qt.gui.QSplitterHandle#orientation() orientation()} and {@link com.trolltech.qt.gui.QSplitterHandle#opaqueResize() opaqueResize()}, and is retrieved from its parent splitter. Details like these can be used to give custom handles different appearances depending on the splitter's orientation. <p>The complexity of a custom handle subclass depends on the tasks that it needs to perform. A simple subclass might only provide a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} implementation: <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    {
        QPainter painter = new QPainter(this);

        if (orientation().equals(Qt.Orientation.Horizontal)) {
            gradient.setStart(rect().left(), rect().height() / 2);
            gradient.setFinalStop(rect().right(), rect().height() / 2);
        } else {
            gradient.setStart(rect().width() / 2, rect().top());
            gradient.setFinalStop(rect().width() / 2, rect().bottom());
        }
        painter.fillRect(event.rect(), new QBrush(gradient));
    }
    </pre> In this example, a predefined gradient is set up differently depending on the orientation of the handle. QSplitterHandle provides a reasonable size hint for the handle, so the subclass does not need to provide a reimplementation of sizeHint() unless the handle has special size requirements. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter QSplitter}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSplitterHandle extends com.trolltech.qt.gui.QWidget
{

/**
Creates a {@link com.trolltech.qt.gui.QSplitter QSplitter} handle with the given <tt>orientation</tt> and {@link com.trolltech.qt.gui.QSplitter QSplitter}<tt>parent</tt>.
*/

    public QSplitterHandle(com.trolltech.qt.core.Qt.Orientation o, com.trolltech.qt.gui.QSplitter parent){
        super((QPrivateConstructor)null);
        __qt_QSplitterHandle_Orientation_QSplitter(o.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSplitterHandle_Orientation_QSplitter(int o, long parent);

/**
Returns the closest legal position to <tt>pos</tt> of the splitter handle. The positions are measured from the left or top edge of the splitter, even for right-to-left languages. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#closestLegalPosition(int, int) QSplitter::closestLegalPosition()}, and {@link com.trolltech.qt.gui.QSplitterHandle#moveSplitter(int) moveSplitter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int closestLegalPosition(int p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_closestLegalPosition_int(nativeId(), p);
    }
    @QtBlockedSlot
    native int __qt_closestLegalPosition_int(long __this__nativeId, int p);

/**
Tells the splitter to move this handle to position <tt>pos</tt>, which is the distance from the left or top edge of the widget. <p>Note that <tt>pos</tt> is also measured from the left (or top) for right-to-left languages. This function will map <tt>pos</tt> to the appropriate position before calling {@link com.trolltech.qt.gui.QSplitter#moveSplitter(int, int) QSplitter::moveSplitter()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#moveSplitter(int, int) QSplitter::moveSplitter()}, and {@link com.trolltech.qt.gui.QSplitterHandle#closestLegalPosition(int) closestLegalPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void moveSplitter(int p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveSplitter_int(nativeId(), p);
    }
    @QtBlockedSlot
    native void __qt_moveSplitter_int(long __this__nativeId, int p);

/**
Returns true if widgets are resized dynamically (opaquely), otherwise returns false. This value is controlled by the {@link com.trolltech.qt.gui.QSplitter QSplitter}. <p><DT><b>See also:</b><br><DD>{@link QSplitter#opaqueResize() QSplitter::opaqueResize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean opaqueResize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opaqueResize(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_opaqueResize(long __this__nativeId);

/**
Returns the handle's orientation. This is usually propagated from the {@link com.trolltech.qt.gui.QSplitter QSplitter}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitterHandle#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}, and {@link QSplitter#orientation() QSplitter::orientation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Sets the orientation of the splitter handle to <tt>orientation</tt>. This is usually propogated from the {@link com.trolltech.qt.gui.QSplitter QSplitter}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitterHandle#orientation() orientation()}, and {@link QSplitter#setOrientation(com.trolltech.qt.core.Qt.Orientation) QSplitter::setOrientation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation o)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), o.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int o);

/**
Returns the splitter associated with this splitter handle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#handle(int) QSplitter::handle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSplitter splitter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_splitter(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSplitter __qt_splitter(long __this__nativeId);

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

    public static native QSplitterHandle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSplitterHandle(QPrivateConstructor p) { super(p); } 
}
