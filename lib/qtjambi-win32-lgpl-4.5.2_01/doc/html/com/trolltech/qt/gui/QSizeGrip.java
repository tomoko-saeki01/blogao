package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSizeGrip class provides a resize handle for resizing top-level windows. This widget works like the standard Windows resize handle. In the X11 version this resize handle generally works differently from the one provided by the system if the X11 window manager does not support necessary modern post-ICCCM specifications. <p>Put this widget anywhere in a widget tree and the user can use it to resize the top-level window or any widget with the {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow } flag set. Generally, this should be in the lower right-hand corner. Note that {@link com.trolltech.qt.gui.QStatusBar QStatusBar} already uses this widget, so if you have a status bar (e.g., you are using {@link com.trolltech.qt.gui.QMainWindow QMainWindow}), then you don't need to use this widget explicitly. <p>On some platforms the size grip automatically hides itself when the window is shown full screen or maximised. <table align="center" border="0" cellpadding="2" cellspacing="1" width="50%"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-sizegrip.png"></center><br></td><td> A size grip widget at the bottom-right corner of a main window, shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> The QSizeGrip class inherits {@link com.trolltech.qt.gui.QWidget QWidget} and reimplements the {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()} and {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()} functions to feature the resize functionality, and the {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} function to render the size grip widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar QStatusBar}, and {@link com.trolltech.qt.gui.QWidget#windowState() QWidget::windowState()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSizeGrip extends com.trolltech.qt.gui.QWidget
{

/**
Constructs a resize corner as a child widget of the given <tt>parent</tt>.
*/

    public QSizeGrip(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSizeGrip_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSizeGrip_QWidget(long parent);

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
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent hideEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), hideEvent == null ? 0 : hideEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long hideEvent);

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
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent mouseEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), mouseEvent == null ? 0 : mouseEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long mouseEvent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void moveEvent(com.trolltech.qt.gui.QMoveEvent moveEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveEvent_QMoveEvent(nativeId(), moveEvent == null ? 0 : moveEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveEvent_QMoveEvent(long __this__nativeId, long moveEvent);

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
    public void setVisible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent showEvent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), showEvent == null ? 0 : showEvent.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long showEvent);

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

    public static native QSizeGrip fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSizeGrip(QPrivateConstructor p) { super(p); } 
}
