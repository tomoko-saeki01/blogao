package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSplashScreen widget provides a splash screen that can be shown during application startup. A splash screen is a widget that is usually displayed when an application is being started. Splash screens are often used for applications that have long start up times (e.g. database or networking applications that take time to establish connections) to provide the user with feedback that the application is loading. <p>The splash screen appears in the center of the screen. It may be useful to add the {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowStaysOnTopHint } to the splash widget's window flags if you want to keep it above all the other windows on the desktop. <p>Some X11 window managers do not support the "stays on top" flag. A solution is to set up a timer that periodically calls {@link com.trolltech.qt.gui.QWidget#raise() raise()} on the splash screen to simulate the "stays on top" effect. <p>The most common usage is to show a splash screen before the main widget is displayed on the screen. This is illustrated in the following code snippet in which a splash screen is displayed and some initialization tasks are performed before the application's main window is shown: <pre class="snippet">
    public static void main(String args[])
    {
        QApplication.initialize(args);
        QPixmap pixmap = new QPixmap("classpath:splash.png");
        QSplashScreen splash = new QSplashScreen(pixmap);
        splash.show();
        QApplication.processEvents();
    ...

        QMainWindow window = new QMainWindow();
        window.show();
        splash.finish(window);
        QApplication.exec();
    }
    </pre> The user can hide the splash screen by clicking on it with the mouse. Since the splash screen is typically displayed before the event loop has started running, it is necessary to periodically call {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QApplication::processEvents()} to receive the mouse clicks. <p>It is sometimes useful to update the splash screen with messages, for example, announcing connections established or modules loaded as the application starts up: <pre class="snippet">
       QPixmap pixmap = new QPixmap(":/splash.png");
       QSplashScreen splash = new QSplashScreen(pixmap);
       splash.show();

       // Loading some items ...
       splash.showMessage("Loaded modules");

       QApplication.processEvents();

       // Establishing connections ...
       splash.showMessage("Established connections");

       QApplication.processEvents();
</pre> QSplashScreen supports this with the {@link com.trolltech.qt.gui.QSplashScreen#showMessage(java.lang.String, int) showMessage()} function. If you wish to do your own drawing you can get a pointer to the pixmap used in the splash screen with {@link com.trolltech.qt.gui.QSplashScreen#pixmap() pixmap()}. Alternatively, you can subclass QSplashScreen and reimplement {@link com.trolltech.qt.gui.QSplashScreen#drawContents(com.trolltech.qt.gui.QPainter) drawContents()}.
*/
@QtJambiGeneratedClass
public class QSplashScreen extends com.trolltech.qt.gui.QWidget
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: message)&gt;:<p> This signal is emitted when the message on the splash screen changes. <tt>message</tt> is the new message and is a null-string when the message has been removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplashScreen#showMessage(java.lang.String, int) showMessage()}, and {@link com.trolltech.qt.gui.QSplashScreen#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final Signal1<java.lang.String> messageChanged = new Signal1<java.lang.String>();

    private final void messageChanged(java.lang.String message)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_messageChanged_String(nativeId(), message);
    }
    native void __qt_messageChanged_String(long __this__nativeId, java.lang.String message);


/**
This is an overloaded method provided for convenience.
*/

    public QSplashScreen(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, pixmap, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
This is an overloaded member function, provided for convenience. <p>This function allows you to specify a parent for your splashscreen. The typical use for this constructor is if you have a multiple screens and prefer to have the splash screen on a different screen than your primary one. In that case pass the proper desktop() as the <tt>parent</tt>.
*/

    public QSplashScreen(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.gui.QPixmap pixmap) {
        this(parent, pixmap, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>This function allows you to specify a parent for your splashscreen. The typical use for this constructor is if you have a multiple screens and prefer to have the splash screen on a different screen than your primary one. In that case pass the proper desktop() as the <tt>parent</tt>.
*/

    public QSplashScreen(com.trolltech.qt.gui.QWidget parent) {
        this(parent, (com.trolltech.qt.gui.QPixmap)new com.trolltech.qt.gui.QPixmap(), new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>This function allows you to specify a parent for your splashscreen. The typical use for this constructor is if you have a multiple screens and prefer to have the splash screen on a different screen than your primary one. In that case pass the proper desktop() as the <tt>parent</tt>.
*/

    public QSplashScreen(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QSplashScreen_QWidget_QPixmap_WindowFlags(parent == null ? 0 : parent.nativeId(), pixmap == null ? 0 : pixmap.nativeId(), f.value());
    }

    native void __qt_QSplashScreen_QWidget_QPixmap_WindowFlags(long parent, long pixmap, int f);


/**
This is an overloaded method provided for convenience.
*/

    public QSplashScreen(com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(pixmap, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Construct a splash screen that will display the <tt>pixmap</tt>. <p>There should be no need to set the widget flags, <tt>f</tt>, except perhaps {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowStaysOnTopHint }.
*/

    public QSplashScreen(com.trolltech.qt.gui.QPixmap pixmap) {
        this(pixmap, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Construct a splash screen that will display the <tt>pixmap</tt>. <p>There should be no need to set the widget flags, <tt>f</tt>, except perhaps {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowStaysOnTopHint }.
*/

    public QSplashScreen() {
        this((com.trolltech.qt.gui.QPixmap)new com.trolltech.qt.gui.QPixmap(), new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Construct a splash screen that will display the <tt>pixmap</tt>. <p>There should be no need to set the widget flags, <tt>f</tt>, except perhaps {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowStaysOnTopHint }.
*/

    public QSplashScreen(com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QSplashScreen_QPixmap_WindowFlags(pixmap == null ? 0 : pixmap.nativeId(), f.value());
    }

    native void __qt_QSplashScreen_QPixmap_WindowFlags(long pixmap, int f);

/**
Removes the message being displayed on the splash screen <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QSplashScreen#showMessage(java.lang.String, int) showMessage()}. <br></DD></DT>
*/

    public final void clearMessage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMessage(nativeId());
    }
    native void __qt_clearMessage(long __this__nativeId);

/**
Makes the splash screen wait until the widget <tt>mainWin</tt> is displayed before calling {@link com.trolltech.qt.gui.QWidget#close() close()} on itself.
*/

    @QtBlockedSlot
    public final void finish(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finish_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_finish_QWidget(long __this__nativeId, long w);

/**
Returns the pixmap that is used in the splash screen. The image does not have any of the text drawn by {@link com.trolltech.qt.gui.QSplashScreen#showMessage(java.lang.String, int) showMessage()} calls. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplashScreen#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap(long __this__nativeId);

/**
Sets the pixmap that will be used as the splash screen's image to <tt>pixmap</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplashScreen#pixmap() pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixmap(com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixmap_QPixmap(nativeId(), pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPixmap_QPixmap(long __this__nativeId, long pixmap);


/**
Draws the <tt>message</tt> text onto the splash screen with color <tt>color</tt> and aligns the text according to the flags in <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>Qt::Alignment, and {@link com.trolltech.qt.gui.QSplashScreen#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String message, int alignment) {
        showMessage(message, alignment, (com.trolltech.qt.gui.QColor)com.trolltech.qt.gui.QColor.black);
    }

/**
Draws the <tt>message</tt> text onto the splash screen with color <tt>color</tt> and aligns the text according to the flags in <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>Qt::Alignment, and {@link com.trolltech.qt.gui.QSplashScreen#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String message) {
        showMessage(message, (int)1, (com.trolltech.qt.gui.QColor)com.trolltech.qt.gui.QColor.black);
    }
/**
Draws the <tt>message</tt> text onto the splash screen with color <tt>color</tt> and aligns the text according to the flags in <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>Qt::Alignment, and {@link com.trolltech.qt.gui.QSplashScreen#clearMessage() clearMessage()}. <br></DD></DT>
*/

    public final void showMessage(java.lang.String message, int alignment, com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMessage_String_int_QColor(nativeId(), message, alignment, color == null ? 0 : color.nativeId());
    }
    native void __qt_showMessage_String_int_QColor(long __this__nativeId, java.lang.String message, int alignment, long color);

/**
Draw the contents of the splash screen using painter <tt>painter</tt>. The default implementation draws the message passed by {@link com.trolltech.qt.gui.QSplashScreen#showMessage(java.lang.String, int) showMessage()}. Reimplement this function if you want to do your own drawing on the splash screen.
*/

    @QtBlockedSlot
    protected void drawContents(com.trolltech.qt.gui.QPainter painter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawContents_QPainter(nativeId(), painter == null ? 0 : painter.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawContents_QPainter(long __this__nativeId, long painter);

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
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QSplashScreen fromNativePointer(QNativePointer nativePointer);

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

    protected QSplashScreen(QPrivateConstructor p) { super(p); } 
}
