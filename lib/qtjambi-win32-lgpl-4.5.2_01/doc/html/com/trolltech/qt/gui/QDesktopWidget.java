package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDesktopWidget class provides access to screen information on multi-head systems. Systems with more than one graphics card and monitor can manage the physical screen space available either as multiple desktops, or as a large virtual desktop, which usually has the size of the bounding rectangle of all the screens (see {@link com.trolltech.qt.gui.QDesktopWidget#isVirtualDesktop() isVirtualDesktop()}). For an application, one of the available screens is the primary screen, i.e. the screen where the main widget resides (see {@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}). All windows opened in the context of the application should be constrained to the boundaries of the primary screen; for example, it would be inconvenient if a dialog box popped up on a different screen, or split over two screens. <p>The QDesktopWidget provides information about the geometry of the available screens with {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()}. The number of screens available is returned by {@link com.trolltech.qt.gui.QDesktopWidget#numScreens() numScreens()}. The screen number that a particular point or widget is located in is returned by {@link com.trolltech.qt.gui.QDesktopWidget#screenNumber(com.trolltech.qt.core.QPoint) screenNumber()}. <p>Widgets provided by Qt use this class, for example, to place tooltips, menus and dialog boxes according to the parent or application widget. <p>Applications can use this class to save window positions, or to place child widgets on one screen. <br><center><img src="../images/qdesktopwidget.png"></center><br> In the illustration above, Application One's primary screen is screen 0, and App Two's primary screen is screen 1.<a name="multiple-screens-note"> <b>Note:</b>QDesktopWidget inherits the {@link com.trolltech.qt.gui.QWidget QWidget} properties, width() and height(), which specify the size of the desktop. However, for desktops with multiple screens, the size of the desktop is the union of all the screen sizes, so width() and height() should not be used for computing the size of a widget to be placed on one of the screens. The correct width and height values are obtained using {@link com.trolltech.qt.gui.QDesktopWidget#availableGeometry(com.trolltech.qt.core.QPoint) availableGeometry()} or {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()} for a particular screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication QApplication}, and QX11Info::appRootWindow(). <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDesktopWidget extends com.trolltech.qt.gui.QWidget
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: screen)&gt;:<p> This signal is emitted when the size of <tt>screen</tt> changes.
*/

    public final Signal1<java.lang.Integer> resized = new Signal1<java.lang.Integer>();

    private final void resized(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resized_int(nativeId(), arg__1);
    }
    native void __qt_resized_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: screen)&gt;:<p> This signal is emitted when the work area available on <tt>screen</tt> changes.
*/

    public final Signal1<java.lang.Integer> workAreaResized = new Signal1<java.lang.Integer>();

    private final void workAreaResized(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_workAreaResized_int(nativeId(), arg__1);
    }
    native void __qt_workAreaResized_int(long __this__nativeId, int arg__1);

/**
Creates the desktop widget. <p>If the system supports a virtual desktop, this widget will have the size of the virtual desktop; otherwise this widget will have the size of the primary screen. <p>Instead of using QDesktopWidget directly, use {@link com.trolltech.qt.gui.QApplication#desktop() QApplication::desktop()}.
*/

    public QDesktopWidget(){
        super((QPrivateConstructor)null);
        __qt_QDesktopWidget();
    }

    native void __qt_QDesktopWidget();

/**
This is an overloaded member function, provided for convenience. <p>Returns the available geometry of the screen which contains <tt>p</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect availableGeometry(com.trolltech.qt.core.QPoint point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableGeometry_QPoint(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_availableGeometry_QPoint(long __this__nativeId, long point);

/**
This is an overloaded member function, provided for convenience. <p>Returns the available geometry of the screen which contains <tt>widget</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect availableGeometry(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableGeometry_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_availableGeometry_QWidget(long __this__nativeId, long widget);


/**
Returns the available geometry of the screen with index <tt>screen</tt>. What is available will be subrect of {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()} based on what the platform decides is available (for example excludes the dock and menu bar on Mac OS X, or the task bar on Windows). The default screen is used if <tt>screen</tt> is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenNumber(com.trolltech.qt.core.QPoint) screenNumber()}, and {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect availableGeometry() {
        return availableGeometry((int)-1);
    }
/**
Returns the available geometry of the screen with index <tt>screen</tt>. What is available will be subrect of {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()} based on what the platform decides is available (for example excludes the dock and menu bar on Mac OS X, or the task bar on Windows). The default screen is used if <tt>screen</tt> is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenNumber(com.trolltech.qt.core.QPoint) screenNumber()}, and {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) screenGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect availableGeometry(int screen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableGeometry_int(nativeId(), screen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_availableGeometry_int(long __this__nativeId, int screen);

/**
Returns true if the system manages the available screens in a virtual desktop; otherwise returns false. <p>For virtual desktops, {@link com.trolltech.qt.gui.QDesktopWidget#screen() screen()} will always return the same widget. The size of the virtual desktop is the size of this desktop widget.
*/

    @QtBlockedSlot
    public final boolean isVirtualDesktop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVirtualDesktop(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVirtualDesktop(long __this__nativeId);

/**
Returns the number of available screens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int numScreens()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numScreens(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numScreens(long __this__nativeId);

/**
Returns the index of the primary screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#numScreens() numScreens()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int primaryScreen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_primaryScreen(nativeId());
    }
    @QtBlockedSlot
    native int __qt_primaryScreen(long __this__nativeId);


/**
Returns a widget that represents the screen with index <tt>screen</tt> (a value of -1 means the default screen). <p>If the system uses a virtual desktop, the returned widget will have the geometry of the entire virtual desktop; i.e., bounding every <tt>screen</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}, {@link com.trolltech.qt.gui.QDesktopWidget#numScreens() numScreens()}, and {@link com.trolltech.qt.gui.QDesktopWidget#isVirtualDesktop() isVirtualDesktop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget screen() {
        return screen((int)-1);
    }
/**
Returns a widget that represents the screen with index <tt>screen</tt> (a value of -1 means the default screen). <p>If the system uses a virtual desktop, the returned widget will have the geometry of the entire virtual desktop; i.e., bounding every <tt>screen</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}, {@link com.trolltech.qt.gui.QDesktopWidget#numScreens() numScreens()}, and {@link com.trolltech.qt.gui.QDesktopWidget#isVirtualDesktop() isVirtualDesktop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget screen(int screen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screen_int(nativeId(), screen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_screen_int(long __this__nativeId, int screen);

/**
This is an overloaded member function, provided for convenience. <p>Returns the geometry of the screen which contains <tt>p</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect screenGeometry(com.trolltech.qt.core.QPoint point)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenGeometry_QPoint(nativeId(), point == null ? 0 : point.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_screenGeometry_QPoint(long __this__nativeId, long point);

/**
This is an overloaded member function, provided for convenience. <p>Returns the geometry of the screen which contains <tt>widget</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect screenGeometry(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenGeometry_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_screenGeometry_QWidget(long __this__nativeId, long widget);


/**
Returns the geometry of the screen with index <tt>screen</tt>. The default screen is used if <tt>screen</tt> is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenNumber(com.trolltech.qt.core.QPoint) screenNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect screenGeometry() {
        return screenGeometry((int)-1);
    }
/**
Returns the geometry of the screen with index <tt>screen</tt>. The default screen is used if <tt>screen</tt> is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#screenNumber(com.trolltech.qt.core.QPoint) screenNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect screenGeometry(int screen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenGeometry_int(nativeId(), screen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_screenGeometry_int(long __this__nativeId, int screen);

/**
This is an overloaded member function, provided for convenience. <p>Returns the index of the screen that contains the <tt>point</tt>, or the screen which is the shortest distance from the <tt>point</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int screenNumber(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenNumber_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_screenNumber_QPoint(long __this__nativeId, long arg__1);


/**
Returns the index of the screen that contains the largest part of <tt>widget</tt>, or -1 if the widget not on a screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int screenNumber() {
        return screenNumber((com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the index of the screen that contains the largest part of <tt>widget</tt>, or -1 if the widget not on a screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopWidget#primaryScreen() primaryScreen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int screenNumber(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_screenNumber_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_screenNumber_QWidget(long __this__nativeId, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QDesktopWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDesktopWidget(QPrivateConstructor p) { super(p); } 
}
