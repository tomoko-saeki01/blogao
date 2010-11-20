package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QApplication class manages the GUI application's control flow and main settings. It contains the main event loop, where all events from the window system and other sources are processed and dispatched. It also handles the application's initialization and finalization, and provides session management. It also handles most system-wide and application-wide settings. <p>For any GUI application that uses Qt, there is precisely one QApplication object, no matter whether the application has 0, 1, 2 or more windows at any time. For non-GUI Qt applications, use {@link com.trolltech.qt.core.QCoreApplication QCoreApplication} instead, which doesn't depend on the {@link <a href="../qtgui.html">QtGui</a>} library. <p>The QApplication object is accessible through the {@link com.trolltech.qt.core.QCoreApplication#instance() instance()} function which return a pointer equivalent to the global qApp pointer. <p>QApplication's main areas of responsibility are: <ul><li> It initializes the application with the user's desktop settings such as {@link com.trolltech.qt.gui.QApplication#palette() palette()}, {@link com.trolltech.qt.gui.QApplication#font() font()} and {@link com.trolltech.qt.gui.QApplication#doubleClickInterval() doubleClickInterval()}. It keeps track of these properties in case the user changes the desktop globally, for example through some kind of control panel.</li><li> It performs event handling, meaning that it receives events from the underlying window system and dispatches them to the relevant widgets. By using {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) sendEvent()} and {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()} you can send your own events to widgets.</li><li> It parses common command line arguments and sets its internal state accordingly. See the constructor documentation below for more details about this.</li><li> It defines the application's look and feel, which is encapsulated in a {@link com.trolltech.qt.gui.QStyle QStyle} object. This can be changed at runtime with {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}.</li><li> It specifies how the application is to allocate colors. See {@link com.trolltech.qt.gui.QApplication#setColorSpec(int) setColorSpec()} for details.</li><li> It provides localization of strings that are visible to the user via {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}.</li><li> It provides some magical objects like the {@link com.trolltech.qt.gui.QApplication#desktop() desktop()} and the {@link com.trolltech.qt.gui.QApplication#clipboard() clipboard()}.</li><li> It knows about the application's windows. You can ask which widget is at a certain position using {@link com.trolltech.qt.gui.QApplication#widgetAt(com.trolltech.qt.core.QPoint) widgetAt()}, get a list of {@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()} and {@link com.trolltech.qt.gui.QApplication#closeAllWindows() closeAllWindows()}, etc.</li><li> It manages the application's mouse cursor handling, see {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()}</li><li> On the X window system, it provides functions to flush and sync the communication stream, see flushX() and {@link com.trolltech.qt.gui.QApplication#syncX() syncX()}.</li><li> It provides support for sophisticated {@link <a href="../session.html">session management</a>}. This makes it possible for applications to terminate gracefully when the user logs out, to cancel a shutdown process if termination isn't possible and even to preserve the entire application's state for a future session. See {@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()} and {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()} and {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()} for details.</li></ul> Since the QApplication object does so much initialization, it must be created before any other objects related to the user interface are created. <p>Since it also deals with common command line arguments, it is usually a good idea to create it before any interpretation or modification of <tt>argv</tt> is done in the application itself. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Groups of functions</center></th></tr></thead><tr valign="top" class="even"><td> System settings</td><td> {@link com.trolltech.qt.gui.QApplication#desktopSettingsAware() desktopSettingsAware()}, {@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) setDesktopSettingsAware()}, {@link com.trolltech.qt.gui.QApplication#cursorFlashTime() cursorFlashTime()}, {@link com.trolltech.qt.gui.QApplication#setCursorFlashTime(int) setCursorFlashTime()}, {@link com.trolltech.qt.gui.QApplication#doubleClickInterval() doubleClickInterval()}, {@link com.trolltech.qt.gui.QApplication#setDoubleClickInterval(int) setDoubleClickInterval()}, {@link com.trolltech.qt.gui.QApplication#setKeyboardInputInterval(int) setKeyboardInputInterval()}, {@link com.trolltech.qt.gui.QApplication#wheelScrollLines() wheelScrollLines()}, {@link com.trolltech.qt.gui.QApplication#setWheelScrollLines(int) setWheelScrollLines()}, {@link com.trolltech.qt.gui.QApplication#palette() palette()}, {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}, {@link com.trolltech.qt.gui.QApplication#font() font()}, {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) setFont()}, {@link com.trolltech.qt.gui.QApplication#fontMetrics() fontMetrics()}.</td></tr><tr valign="top" class="odd"><td> Event handling</td><td> exec(), {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}, {@link com.trolltech.qt.core.QCoreApplication#exit() exit()}, {@link com.trolltech.qt.core.QCoreApplication#quit() quit()}. {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) sendEvent()}, {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}, {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}, {@link com.trolltech.qt.core.QCoreApplication#removePostedEvents(com.trolltech.qt.core.QObject) removePostedEvents()}, {@link com.trolltech.qt.core.QCoreApplication#hasPendingEvents() hasPendingEvents()}, {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()}, macEventFilter(), qwsEventFilter(), x11EventFilter(), x11ProcessEvent(), winEventFilter().</td></tr><tr valign="top" class="even"><td> GUI Styles</td><td> {@link com.trolltech.qt.gui.QApplication#style() style()}, {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}.</td></tr><tr valign="top" class="odd"><td> Color usage</td><td> {@link com.trolltech.qt.gui.QApplication#colorSpec() colorSpec()}, {@link com.trolltech.qt.gui.QApplication#setColorSpec(int) setColorSpec()}, qwsSetCustomColors().</td></tr><tr valign="top" class="even"><td> Text handling</td><td> {@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) installTranslator()}, {@link com.trolltech.qt.core.QCoreApplication#removeTranslator(com.trolltech.qt.core.QTranslator) removeTranslator()}{@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}.</td></tr><tr valign="top" class="odd"><td> Widgets</td><td> {@link com.trolltech.qt.gui.QApplication#allWidgets() allWidgets()}, {@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()}, {@link com.trolltech.qt.gui.QApplication#desktop() desktop()}, {@link com.trolltech.qt.gui.QApplication#activePopupWidget() activePopupWidget()}, {@link com.trolltech.qt.gui.QApplication#activeModalWidget() activeModalWidget()}, {@link com.trolltech.qt.gui.QApplication#clipboard() clipboard()}, {@link com.trolltech.qt.gui.QApplication#focusWidget() focusWidget()}, winFocus(), {@link com.trolltech.qt.gui.QApplication#activeWindow() activeWindow()}, {@link com.trolltech.qt.gui.QApplication#widgetAt(com.trolltech.qt.core.QPoint) widgetAt()}.</td></tr><tr valign="top" class="even"><td> Advanced cursor handling</td><td> {@link com.trolltech.qt.gui.QApplication#overrideCursor() overrideCursor()}, {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()}, {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()}.</td></tr><tr valign="top" class="odd"><td> X Window System synchronization</td><td> flushX(), {@link com.trolltech.qt.gui.QApplication#syncX() syncX()}.</td></tr><tr valign="top" class="even"><td> Session management</td><td> {@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}.</td></tr><tr valign="top" class="odd"><td> Miscellaneous</td><td> {@link com.trolltech.qt.gui.QApplication#closeAllWindows() closeAllWindows()}, {@link com.trolltech.qt.core.QCoreApplication#startingUp() startingUp()}, {@link com.trolltech.qt.core.QCoreApplication#closingDown() closingDown()}, {@link com.trolltech.qt.gui.QApplication#type() type()}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication QCoreApplication}, {@link com.trolltech.qt.core.QAbstractEventDispatcher QAbstractEventDispatcher}, {@link com.trolltech.qt.core.QEventLoop QEventLoop}, and {@link com.trolltech.qt.core.QSettings QSettings}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QApplication extends com.trolltech.qt.core.QCoreApplication
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    @QtBlockedEnum
    public enum Type implements com.trolltech.qt.QtEnumerator {
/**
 a console application
*/

        Tty(0),
/**
 a GUI client application
*/

        GuiClient(1),
/**
 a GUI server application (for Qt for Embedded Linux)
*/

        GuiServer(2);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QApplication$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Tty;
            case 1: return GuiClient;
            case 2: return GuiServer;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
See {@link com.trolltech.qt.gui.QApplication#setColorSpec(int) setColorSpec()} for full details.
*/
@QtBlockedEnum
    public enum ColorSpec implements com.trolltech.qt.QtEnumerator {
/**
 the default color allocation policy
*/

        NormalColor(0),
/**
 the same as {@link com.trolltech.qt.gui.QApplication.ColorSpec NormalColor } for X11; allocates colors to a palette on demand under Windows
*/

        CustomColor(1),
/**
 the right choice for applications that use thousands of colors
*/

        ManyColor(2);

        ColorSpec(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QApplication$ColorSpec constant with the specified <tt>int</tt>.</brief>
*/

        public static ColorSpec resolve(int value) {
            return (ColorSpec) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NormalColor;
            case 1: return CustomColor;
            case 2: return ManyColor;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QSessionManager(named: manager)&gt;:<p> This signal deals with {@link <a href="../session.html">session management</a>}. It is emitted when the {@link com.trolltech.qt.gui.QSessionManager QSessionManager} wants the application to commit all its data. <p>Usually this means saving all open files, after getting permission from the user. Furthermore you may want to provide a means by which the user can cancel the shutdown. <p>Note that you should not exit the application when called. Instead, the session manager may or may not do this afterwards, depending on the context. <p><b>Warning:</b> Within this signal, no user interaction is possible, unless you ask the <tt>manager</tt> for explicit permission. See {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() QSessionManager::allowsInteraction()} and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() QSessionManager::allowsErrorInteraction()} for details and example usage. <p>Note: You should use {@link com.trolltech.qt.core.Qt.ConnectionType Qt::DirectConnection } when connecting to this signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}, and {@link <a href="../session.html">Session Management</a>}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QSessionManager> commitDataRequest = new Signal1<com.trolltech.qt.gui.QSessionManager>();

    private final void commitDataRequest(com.trolltech.qt.gui.QSessionManager sessionManager)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commitDataRequest_QSessionManager(nativeId(), sessionManager == null ? 0 : sessionManager.nativeId());
    }
    native void __qt_commitDataRequest_QSessionManager(long __this__nativeId, long sessionManager);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: old), com.trolltech.qt.gui.QWidget(named: now)&gt;:<p> This signal is emitted when the widget that has keyboard focus changed from <tt>old</tt> to <tt>now</tt>, i. . because the user pressed the tab-key, clicked into a widget or changed the active window. Note that both <tt>old</tt> and <tt>now</tt> can be the null-pointer. <p>The signal is emitted after both widget have been notified about the change through {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocus() QWidget::setFocus()}, {@link com.trolltech.qt.gui.QWidget#clearFocus() QWidget::clearFocus()}, and {@link com.trolltech.qt.core.Qt.FocusReason Qt::FocusReason }. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QWidget> focusChanged = new Signal2<com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QWidget>();

    private final void focusChanged(com.trolltech.qt.gui.QWidget old, com.trolltech.qt.gui.QWidget now)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusChanged_QWidget_QWidget(nativeId(), old == null ? 0 : old.nativeId(), now == null ? 0 : now.nativeId());
    }
    native void __qt_focusChanged_QWidget_QWidget(long __this__nativeId, long old, long now);
/**
 This signal is emitted when application fonts are loaded or removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFontDatabase#addApplicationFont(java.lang.String) QFontDatabase::addApplicationFont()}, {@link com.trolltech.qt.gui.QFontDatabase#addApplicationFontFromData(com.trolltech.qt.core.QByteArray) QFontDatabase::addApplicationFontFromData()}, {@link com.trolltech.qt.gui.QFontDatabase#removeAllApplicationFonts() QFontDatabase::removeAllApplicationFonts()}, and {@link com.trolltech.qt.gui.QFontDatabase#removeApplicationFont(int) QFontDatabase::removeApplicationFont()}. <br></DD></DT>
*/

    public final Signal0 fontDatabaseChanged = new Signal0();

    private final void fontDatabaseChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fontDatabaseChanged(nativeId());
    }
    native void __qt_fontDatabaseChanged(long __this__nativeId);
/**
 This signal is emitted from QApplication.:exec() when the last visible primary window (i. . window with no parent) with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_QuitOnClose } attribute set is closed. <p>By default, <ul><li> this attribute is set for all widgets except transient windows such as splash screens, tool windows, and popup menus</li><li> QApplication implicitly quits when this signal is emitted.</li></ul> This feature be turned off by setting {@link QApplication#quitOnLastWindowClosed() quitOnLastWindowClosed} to false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}. <br></DD></DT>
*/

    public final Signal0 lastWindowClosed = new Signal0();

    private final void lastWindowClosed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lastWindowClosed(nativeId());
    }
    native void __qt_lastWindowClosed(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QSessionManager(named: manager)&gt;:<p> This signal deals with {@link <a href="../session.html">session management</a>}. It is invoked when the {@link com.trolltech.qt.gui.QSessionManager session manager} wants the application to preserve its state for a future session. <p>For example, a text editor would create a temporary file that includes the current contents of its edit buffers, the location of the cursor and other aspects of the current editing session. <p>Note that you should never exit the application within this signal. Instead, the session manager may or may not do this afterwards, depending on the context. Futhermore, most session managers will very likely request a saved state immediately after the application has been started. This permits the session manager to learn about the application's restart policy. <p><b>Warning:</b> Within this function, no user interaction is possible, unless you ask the <tt>manager</tt> for explicit permission. See {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() QSessionManager::allowsInteraction()} and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() QSessionManager::allowsErrorInteraction()} for details. <p>Note:: You should use {@link com.trolltech.qt.core.Qt.ConnectionType Qt::DirectConnection } when connecting to this signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, and {@link <a href="../session.html">Session Management</a>}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QSessionManager> saveStateRequest = new Signal1<com.trolltech.qt.gui.QSessionManager>();

    private final void saveStateRequest(com.trolltech.qt.gui.QSessionManager sessionManager)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_saveStateRequest_QSessionManager(nativeId(), sessionManager == null ? 0 : sessionManager.nativeId());
    }
    native void __qt_saveStateRequest_QSessionManager(long __this__nativeId, long sessionManager);


    private QApplication(com.trolltech.qt.QNativePointer argc, com.trolltech.qt.QNativePointer argv) {
        this(argc, argv, (int)0x040500);
    }
    private QApplication(com.trolltech.qt.QNativePointer argc, com.trolltech.qt.QNativePointer argv, int arg__3){
        super((QPrivateConstructor)null);
        __qt_QApplication_nativepointer_nativepointer_int(argc, argv, arg__3);
    }

    native void __qt_QApplication_nativepointer_nativepointer_int(com.trolltech.qt.QNativePointer argc, com.trolltech.qt.QNativePointer argv, int arg__3);

/**
Returns the {@link com.trolltech.qt.gui.QInputContext QInputContext} instance used by the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setInputContext(com.trolltech.qt.gui.QInputContext) setInputContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QInputContext inputContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputContext(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QInputContext __qt_inputContext(long __this__nativeId);

/**
Returns true if the application has been restored from an earlier {@link <a href="../session.html">session</a>}; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, and {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSessionRestored()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSessionRestored(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSessionRestored(long __this__nativeId);

/**
Returns the current {@link <a href="../session.html">session's</a>} identifier. <p>If the application has been restored from an earlier session, this identifier is the same as it was in that previous session. <p>The session identifier is guaranteed to be unique both for different applications and for different instances of the same application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionKey() sessionKey()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, and {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String sessionId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_sessionId(long __this__nativeId);

/**
Returns the session key in the current {@link <a href="../session.html">session</a>}. <p>If the application has been restored from an earlier session, this key is the same as it was when the previous session ended. <p>The session key changes with every call of {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()} or {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, and {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String sessionKey()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionKey(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_sessionKey(long __this__nativeId);

/**
This function replaces the {@link com.trolltech.qt.gui.QInputContext QInputContext} instance used by the application with <tt>inputContext</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#inputContext() inputContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setInputContext(com.trolltech.qt.gui.QInputContext arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInputContext_QInputContext(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setInputContext_QInputContext(long __this__nativeId, long arg__1);

/**
This property holds the application style sheet. By default, this property returns an empty string unless the user specifies the <tt>-stylesheet</tt> option on the command line when running the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) QWidget::setStyle()}, and {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="styleSheet")
    public final void setStyleSheet(java.lang.String sheet)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyleSheet_String(nativeId(), sheet);
    }
    native void __qt_setStyleSheet_String(long __this__nativeId, java.lang.String sheet);

/**
This property holds the application style sheet. By default, this property returns an empty string unless the user specifies the <tt>-stylesheet</tt> option on the command line when running the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) QWidget::setStyle()}, and {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="styleSheet")
    @QtBlockedSlot
    public final java.lang.String styleSheet()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleSheet(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_styleSheet(long __this__nativeId);

/**
This function deals with {@link <a href="../session.html">session management</a>}. It is invoked when the {@link com.trolltech.qt.gui.QSessionManager QSessionManager} wants the application to commit all its data. <p>Usually this means saving all open files, after getting permission from the user. Furthermore you may want to provide a means by which the user can cancel the shutdown. <p>Note that you should not exit the application within this function. Instead, the session manager may or may not do this afterwards, depending on the context. <p><b>Warning:</b> Within this function, no user interaction is possible, unless you ask the <tt>manager</tt> for explicit permission. See {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() QSessionManager::allowsInteraction()} and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() QSessionManager::allowsErrorInteraction()} for details and example usage. <p>The default implementation requests interaction and sends a close event to all visible top-level widgets. If any event was rejected, the shutdown is canceled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) saveState()}, and {@link <a href="../session.html">Session Management</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void commitData(com.trolltech.qt.gui.QSessionManager sm)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commitData_QSessionManager(nativeId(), sm == null ? 0 : sm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_commitData_QSessionManager(long __this__nativeId, long sm);

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
    public boolean notify(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_notify_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_notify_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

/**
This function deals with {@link <a href="../session.html">session management</a>}. It is invoked when the {@link com.trolltech.qt.gui.QSessionManager session manager} wants the application to preserve its state for a future session. <p>For example, a text editor would create a temporary file that includes the current contents of its edit buffers, the location of the cursor and other aspects of the current editing session. <p>Note that you should never exit the application within this function. Instead, the session manager may or may not do this afterwards, depending on the context. Futhermore, most session managers will very likely request a saved state immediately after the application has been started. This permits the session manager to learn about the application's restart policy. <p><b>Warning:</b> Within this function, no user interaction is possible, unless you ask the <tt>manager</tt> for explicit permission. See {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() QSessionManager::allowsInteraction()} and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() QSessionManager::allowsErrorInteraction()} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isSessionRestored() isSessionRestored()}, {@link com.trolltech.qt.gui.QApplication#sessionId() sessionId()}, {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) commitData()}, and {@link <a href="../session.html">Session Management</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void saveState(com.trolltech.qt.gui.QSessionManager sm)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_saveState_QSessionManager(nativeId(), sm == null ? 0 : sm.nativeId());
    }
    @QtBlockedSlot
    native void __qt_saveState_QSessionManager(long __this__nativeId, long sm);

/**
Displays a simple message box about Qt. The message includes the version number of Qt being used by the application. <p>This is useful for inclusion in the <b>Help</b> menu of an application, as shown in the {@link <a href="../qtjambi-menus.html">Menus</a>} example. <p>This function is a convenience slot for {@link com.trolltech.qt.gui.QMessageBox#aboutQt(com.trolltech.qt.gui.QWidget) QMessageBox::aboutQt()}.
*/

    public native static void aboutQt();

/**
Returns the active modal widget. <p>A modal widget is a special top-level widget which is a subclass of {@link com.trolltech.qt.gui.QDialog QDialog} that specifies the modal parameter of the constructor as true. A modal widget must be closed before the user can continue with other parts of the program. <p>Modal widgets are organized in a stack. This function returns the active modal widget at the top of the stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#activePopupWidget() activePopupWidget()}, and {@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget activeModalWidget();

/**
Returns the active popup widget. <p>A popup widget is a special top-level widget that sets the <tt>Qt::WType_Popup</tt> widget flag, e.g. the {@link com.trolltech.qt.gui.QMenu QMenu} widget. When the application opens a popup widget, all events are sent to the popup. Normal widgets and modal widgets cannot be accessed before the popup widget is closed. <p>Only other popup widgets may be opened when a popup widget is shown. The popup widgets are organized in a stack. This function returns the active popup widget at the top of the stack. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#activeModalWidget() activeModalWidget()}, and {@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget activePopupWidget();

/**
Returns the application top-level window that has the keyboard input focus, or 0 if no application window has the focus. Note that there might be an {@link com.trolltech.qt.gui.QApplication#activeWindow() activeWindow()} even if there is no {@link com.trolltech.qt.gui.QApplication#focusWidget() focusWidget()}, for example if no widget in that window accepts key events. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setActiveWindow(com.trolltech.qt.gui.QWidget) setActiveWindow()}, {@link com.trolltech.qt.gui.QWidget#setFocus() QWidget::setFocus()}, {@link QWidget#hasFocus() QWidget::hasFocus()}, and {@link com.trolltech.qt.gui.QApplication#focusWidget() focusWidget()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget activeWindow();


/**
Causes an alert to be shown for <tt>widget</tt> if the window is not the active window. The alert is shown for <tt>msec</tt> miliseconds. If <tt>msec</tt> is zero (the default), then the alert is shown indefinitely until the window becomes active again. <p>Currently this function does nothing on Qt for Embedded Linux. <p>On Mac OS X, this works more at the application level and will cause the application icon to bounce in the dock. <p>On Windows this causes the window's taskbar entry to flash for a time. If <tt>msec</tt> is zero, the flashing will stop and the taskbar entry will turn a different color (currently orange). <p>On X11, this will cause the window to be marked as "demands attention", the window must not be hidden (i.e. not have hide() called on it, but be visible in some sort of way) in order for this to work.
*/

    public static void alert(com.trolltech.qt.gui.QWidget widget) {
        alert(widget, (int)0);
    }
/**
Causes an alert to be shown for <tt>widget</tt> if the window is not the active window. The alert is shown for <tt>msec</tt> miliseconds. If <tt>msec</tt> is zero (the default), then the alert is shown indefinitely until the window becomes active again. <p>Currently this function does nothing on Qt for Embedded Linux. <p>On Mac OS X, this works more at the application level and will cause the application icon to bounce in the dock. <p>On Windows this causes the window's taskbar entry to flash for a time. If <tt>msec</tt> is zero, the flashing will stop and the taskbar entry will turn a different color (currently orange). <p>On X11, this will cause the window to be marked as "demands attention", the window must not be hidden (i.e. not have hide() called on it, but be visible in some sort of way) in order for this to work.
*/

    public static void alert(com.trolltech.qt.gui.QWidget widget, int duration)    {
        __qt_alert_QWidget_int(widget == null ? 0 : widget.nativeId(), duration);
    }
    native static void __qt_alert_QWidget_int(long widget, int duration);

/**
Returns a list of all the widgets in the application. <p>The list is empty (QList::isEmpty()) if there are no widgets. <p>Note that some of the widgets may be hidden. <p>Example: <pre class="snippet">
        public final void updateAllWidgets() {
            for (QWidget widget : QApplication.allWidgets())
                widget.update();
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()}, and {@link QWidget#isVisible() QWidget::isVisible()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.gui.QWidget> allWidgets();

/**
Sounds the bell, using the default volume and sound. The function is not available in Qt for Embedded Linux.
*/

    public native static void beep();

/**
Changes the currently active application override cursor to <tt>cursor</tt>. <p>This function has no effect if {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()} wasn't called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()}, {@link com.trolltech.qt.gui.QApplication#overrideCursor() overrideCursor()}, {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()}, and {@link QWidget#setCursor(com.trolltech.qt.gui.QCursor) QWidget::setCursor()}. <br></DD></DT>
*/

    public static void changeOverrideCursor(com.trolltech.qt.gui.QCursor arg__1)    {
        __qt_changeOverrideCursor_QCursor(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static void __qt_changeOverrideCursor_QCursor(long arg__1);

/**
Returns a pointer to the application global clipboard. <p><b>Note:</b> The QApplication object should already be constructed before accessing the clipboard.
*/

    public native static com.trolltech.qt.gui.QClipboard clipboard();

/**
Closes all top-level windows. <p>This function is particularly useful for applications with many top-level windows. It could, for example, be connected to a <b>Exit</b> entry in the <b>File</b> menu:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    exitAct = new QAction(tr("E&xit"), this);
    exitAct-&gt;setShortcut(tr("Ctrl+Q"));
    exitAct-&gt;setStatusTip(tr("Exit the application"));
    connect(exitAct, SIGNAL(triggered()), qApp, SLOT(closeAllWindows()));
</pre> The windows are closed in random order, until one window does not accept the close event. The application quits when the last window was successfully closed; this can be turned off by setting {@link QApplication#quitOnLastWindowClosed() quitOnLastWindowClosed} to false. <p><DT><b>See also:</b><br><DD>{@link QApplication#quitOnLastWindowClosed() quitOnLastWindowClosed}, {@link com.trolltech.qt.gui.QApplication#lastWindowClosed lastWindowClosed() }, {@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}, {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) QWidget::closeEvent()}, {@link com.trolltech.qt.gui.QApplication#lastWindowClosed lastWindowClosed() }, {@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, {@link com.trolltech.qt.gui.QApplication#topLevelWidgets() topLevelWidgets()}, and {@link com.trolltech.qt.gui.QWidget#isWindow() QWidget::isWindow()}. <br></DD></DT>
*/

    public native static void closeAllWindows();

/**
Returns the color specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setColorSpec(int) QApplication::setColorSpec()}. <br></DD></DT>
*/

    public native static int colorSpec();

/**
This property holds the text cursor's flash (blink) time in milliseconds. The flash time is the time required to display, invert and restore the caret display. Usually the text cursor is displayed for half the cursor flash time, then hidden for the same amount of time, but this may vary. <p>The default value on X11 is 1000 milliseconds. On Windows, the control panel value is used. Widgets should not cache this value since it may be changed at any time by the user changing the global desktop settings. <p>Note that on Microsoft Windows, setting this property sets the cursor flash time for all applications.
*/

    @com.trolltech.qt.QtPropertyReader(name="cursorFlashTime")
    public native static int cursorFlashTime();

/**
Returns the desktop widget (also called the root window). <p>Note that the desktop may be composed of multiple screens, so it would be incorrect, for example, to attempt to center some widget in the desktop's geometry. {@link com.trolltech.qt.gui.QDesktopWidget QDesktopWidget} has various functions for obtaining useful geometries upon the desktop, such as {@link com.trolltech.qt.gui.QDesktopWidget#screenGeometry(com.trolltech.qt.core.QPoint) QDesktopWidget::screenGeometry()} and {@link com.trolltech.qt.gui.QDesktopWidget#availableGeometry(com.trolltech.qt.core.QPoint) QDesktopWidget::availableGeometry()}. <p>On X11, it is also possible to draw on the desktop.
*/

    public native static com.trolltech.qt.gui.QDesktopWidget desktop();

/**
Returns true if Qt is set to use the system's standard colors, fonts, etc.  otherwise returns false. The default is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) setDesktopSettingsAware()}. <br></DD></DT>
*/

    public native static boolean desktopSettingsAware();

/**
This property holds the time limit in milliseconds that distinguishes a double click from two consecutive mouse clicks. The default value on X11 is 400 milliseconds. On Windows and Mac OS X, the operating system's value is used. <p>On Microsoft Windows, calling this function sets the double click interval for all applications.
*/

    @com.trolltech.qt.QtPropertyReader(name="doubleClickInterval")
    public native static int doubleClickInterval();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static int exec();

/**
Returns the application widget that has the keyboard input focus, or 0 if no widget in this application has the focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocus() QWidget::setFocus()}, {@link QWidget#hasFocus() QWidget::hasFocus()}, {@link com.trolltech.qt.gui.QApplication#activeWindow() activeWindow()}, and {@link com.trolltech.qt.gui.QApplication#focusChanged focusChanged() }. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget focusWidget();

/**
Returns the default application font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) setFont()}, {@link com.trolltech.qt.gui.QApplication#fontMetrics() fontMetrics()}, and {@link QWidget#font() QWidget::font()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QFont font();

/**
This is an overloaded member function, provided for convenience. <p>Returns the default font for the <tt>widget</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#fontMetrics() fontMetrics()}, and {@link QWidget#setFont(com.trolltech.qt.gui.QFont) QWidget::setFont()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QFont font(com.trolltech.qt.gui.QWidget arg__1)    {
        return __qt_font_QWidget(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static com.trolltech.qt.gui.QFont __qt_font_QWidget(long arg__1);

/**
Returns display (screen) font metrics for the application font. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#font() font()}, {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) setFont()}, {@link com.trolltech.qt.gui.QWidget#fontMetrics() QWidget::fontMetrics()}, and {@link com.trolltech.qt.gui.QPainter#fontMetrics() QPainter::fontMetrics()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QFontMetrics fontMetrics();

/**
This property holds the minimum size that any GUI element that the user can interact with should have. For example, no button should be resized to be smaller than the global strut size. The strut size should be considered when reimplementing GUI controls that may be used on touch-screens or similar I/O devices. <p>Example: <pre class="snippet">
        public static QSize sizeHint() {
            return new QSize(80, 25).expandedTo(QApplication.globalStrut());
        }
</pre> By default, this property contains a {@link com.trolltech.qt.core.QSize QSize} object with zero width and height.
*/

    @com.trolltech.qt.QtPropertyReader(name="globalStrut")
    public native static com.trolltech.qt.core.QSize globalStrut();

/**
Returns true if <tt>effect</tt> is enabled; otherwise returns false. <p>By default, Qt will try to use the desktop settings. Call setDesktopSettingsAware(false) to prevent this. <p>Note: All effects are disabled on screens running at less than 16-bit color depth. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setEffectEnabled(com.trolltech.qt.core.Qt.UIEffect) setEffectEnabled()}, and {@link com.trolltech.qt.core.Qt.UIEffect Qt::UIEffect }. <br></DD></DT>
*/

    public static boolean isEffectEnabled(com.trolltech.qt.core.Qt.UIEffect arg__1)    {
        return __qt_isEffectEnabled_UIEffect(arg__1.value());
    }
    native static boolean __qt_isEffectEnabled_UIEffect(int arg__1);

/**
Returns true if the application's layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#layoutDirection() layoutDirection()}, and {@link com.trolltech.qt.gui.QApplication#isRightToLeft() isRightToLeft()}. <br></DD></DT>
*/

    public native static boolean isLeftToRight();

/**
Returns true if the application's layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::RightToLeft }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#layoutDirection() layoutDirection()}, and {@link com.trolltech.qt.gui.QApplication#isLeftToRight() isLeftToRight()}. <br></DD></DT>
*/

    public native static boolean isRightToLeft();

/**
Returns the current keyboard input direction.
*/

    public static com.trolltech.qt.core.Qt.LayoutDirection keyboardInputDirection()    {
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_keyboardInputDirection());
    }
    native static int __qt_keyboardInputDirection();

/**
This property holds the time limit in milliseconds that distinguishes a key press from two consecutive key presses. The default value on X11 is 400 milliseconds. On Windows and Mac OS X, the operating system's value is used.
*/

    @com.trolltech.qt.QtPropertyReader(name="keyboardInputInterval")
    public native static int keyboardInputInterval();

/**
Returns the current keyboard input locale.
*/

    public native static com.trolltech.qt.core.QLocale keyboardInputLocale();

/**
Returns the current state of the modifier keys on the keyboard. The current state is updated sychronously as the event queue is emptied of events that will spontaneously change the keyboard state ({@link com.trolltech.qt.core.QEvent.Type QEvent::KeyPress } and {@link com.trolltech.qt.core.QEvent.Type QEvent::KeyRelease } events). <p>It should be noted this may not reflect the actual keys held on the input device at the time of calling but rather the modifiers as last reported in one of the above events. If no keys are being held {@link com.trolltech.qt.core.Qt.KeyboardModifier Qt::NoModifier } is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#mouseButtons() mouseButtons()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.Qt.KeyboardModifiers keyboardModifiers()    {
        return new com.trolltech.qt.core.Qt.KeyboardModifiers(__qt_keyboardModifiers());
    }
    native static int __qt_keyboardModifiers();

/**
This property holds the default layout direction for this application. On system start-up, the default layout direction depends on the application's language. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}, {@link com.trolltech.qt.gui.QApplication#isLeftToRight() isLeftToRight()}, and {@link com.trolltech.qt.gui.QApplication#isRightToLeft() isRightToLeft()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="layoutDirection")
    public static com.trolltech.qt.core.Qt.LayoutDirection layoutDirection()    {
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_layoutDirection());
    }
    native static int __qt_layoutDirection();

/**
Returns the current state of the buttons on the mouse. The current state is updated syncronously as the event queue is emptied of events that will spontaneously change the mouse state (QEvent::MousePress and QEvent::MouseRelease events). <p>It should be noted this may not reflect the actual buttons held on theinput device at the time of calling but rather the mouse buttons as last reported in one of the above events. If no mouse buttons are being held {@link com.trolltech.qt.core.Qt.MouseButton Qt::NoButton } is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#keyboardModifiers() keyboardModifiers()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.Qt.MouseButtons mouseButtons()    {
        return new com.trolltech.qt.core.Qt.MouseButtons(__qt_mouseButtons());
    }
    native static int __qt_mouseButtons();

    private native static com.trolltech.qt.QNativePointer overrideCursor_private();

/**
Returns the application palette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}, and {@link QWidget#palette() QWidget::palette()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QPalette palette();

/**
This is an overloaded member function, provided for convenience. <p>If a <tt>widget</tt> is passed, the default palette for the widget's class is returned. This may or may not be the application palette. In most cases there isn't a special palette for certain types of widgets, but one notable exception is the popup menu under Windows, if the user has defined a special background color for menus in the display settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}, and {@link QWidget#palette() QWidget::palette()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPalette palette(com.trolltech.qt.gui.QWidget arg__1)    {
        return __qt_palette_QWidget(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static com.trolltech.qt.gui.QPalette __qt_palette_QWidget(long arg__1);

/**
This property holds whether the application implicitly quits when the last window is closed.  The default is true. <p>If this property is true, the applications quits when the last visible primary window (i.e. window with no parent) with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_QuitOnClose } attribute set is closed. By default this attribute is set for all widgets except for sub-windows. Refer to {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowType } for a detailed list of {@link com.trolltech.qt.core.Qt.WindowType Qt::Window } objects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, and {@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="quitOnLastWindowClosed")
    public native static boolean quitOnLastWindowClosed();

/**
Undoes the last {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()}. <p>If {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()} has been called twice, calling {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()} will activate the first cursor set. Calling this function a second time restores the original widgets' cursors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()}, and {@link com.trolltech.qt.gui.QApplication#overrideCursor() overrideCursor()}. <br></DD></DT>
*/

    public native static void restoreOverrideCursor();

/**
Sets the active window to the <tt>active</tt> widget in response to a system event. The function is called from the platform specific event handlers. <p><b>Warning:</b> This function does not set the keyboard focus to the active widget. Call {@link com.trolltech.qt.gui.QWidget#activateWindow() QWidget::activateWindow()} instead. <p>It sets the {@link com.trolltech.qt.gui.QApplication#activeWindow() activeWindow()} and {@link com.trolltech.qt.gui.QApplication#focusWidget() focusWidget()} attributes and sends proper {@link com.trolltech.qt.core.QEvent.Type WindowActivate }/{@link com.trolltech.qt.core.QEvent.Type WindowDeactivate } and {@link com.trolltech.qt.core.QEvent.Type FocusIn }/{@link com.trolltech.qt.core.QEvent.Type FocusOut } events to all appropriate widgets. The window will then be painted in active state (e.g. cursors in line edits will blink), and it will have tool tips enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#activeWindow() activeWindow()}, and {@link com.trolltech.qt.gui.QWidget#activateWindow() QWidget::activateWindow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setActiveWindow(com.trolltech.qt.gui.QWidget act)    {
        __qt_setActiveWindow_QWidget(act == null ? 0 : act.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setActiveWindow_QWidget(long act);

/**
Sets the color specification for the application to <tt>spec</tt>. <p>The color specification controls how the application allocates colors when run on a display with a limited amount of colors, e.g. 8 bit / 256 color displays. <p>The color specification must be set before you create the QApplication object. <p>The options are: <ul><li> {@link com.trolltech.qt.gui.QApplication.ColorSpec QApplication::NormalColor }. This is the default color allocation strategy. Use this option if your application uses buttons, menus, texts and pixmaps with few colors. With this option, the application uses system global colors. This works fine for most applications under X11, but on Windows machines it may cause dithering of non-standard colors.</li><li> {@link com.trolltech.qt.gui.QApplication.ColorSpec QApplication::CustomColor }. Use this option if your application needs a small number of custom colors. On X11, this option is the same as {@link com.trolltech.qt.gui.QApplication.ColorSpec NormalColor }. On Windows, Qt creates a Windows palette, and allocates colors to it on demand.</li><li> {@link com.trolltech.qt.gui.QApplication.ColorSpec QApplication::ManyColor }. Use this option if your application is very color hungry (e.g. it requires thousands of colors). Under X11 the effect is: <ul><li> For 256-color displays which have at best a 256 color true color visual, the default visual is used, and colors are allocated from a color cube. The color cube is the 6x6x6 (216 color) "Web palette" (the red, green, and blue components always have one of the following values: 0x00, 0x33, 0x66, 0x99, 0xCC, or 0xFF), but the number of colors can be changed by the -ncols option. The user can force the application to use the true color visual with the -visual option.</li><li> For 256-color displays which have a true color visual with more than 256 colors, use that visual. Silicon Graphics X servers have this feature, for example. They provide an 8 bit visual by default but can deliver true color when asked.</li></ul> On Windows, Qt creates a Windows palette, and fills it with a color cube.</li></ul> Be aware that the {@link com.trolltech.qt.gui.QApplication.ColorSpec CustomColor } and {@link com.trolltech.qt.gui.QApplication.ColorSpec ManyColor } choices may lead to colormap flashing: The foreground application gets (most) of the available colors, while the background windows will look less attractive. <p>Example: <pre class="snippet">
        public static void main(String args[]) {
            QApplication.setColorSpec(QApplication.ColorSpec.ManyColor.value());
            QApplication.initialize(args);

             ... 
            QApplication.exec();
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#colorSpec() colorSpec()}. <br></DD></DT>
*/

    public native static void setColorSpec(int arg__1);

/**
This property holds the text cursor's flash (blink) time in milliseconds. The flash time is the time required to display, invert and restore the caret display. Usually the text cursor is displayed for half the cursor flash time, then hidden for the same amount of time, but this may vary. <p>The default value on X11 is 1000 milliseconds. On Windows, the control panel value is used. Widgets should not cache this value since it may be changed at any time by the user changing the global desktop settings. <p>Note that on Microsoft Windows, setting this property sets the cursor flash time for all applications.
*/

    @com.trolltech.qt.QtPropertyWriter(name="cursorFlashTime")
    public native static void setCursorFlashTime(int arg__1);

/**
Sets whether Qt should use the system's standard colors, fonts, etc.  to <tt>on</tt>. By default, this is true. <p>This function must be called before creating the QApplication object, like this: <pre class="snippet">
        public static void main(String args[]) {
            QApplication.setDesktopSettingsAware(false);
            QApplication.initialize(args);

             ... 

            QApplication.exec();
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#desktopSettingsAware() desktopSettingsAware()}. <br></DD></DT>
*/

    public native static void setDesktopSettingsAware(boolean arg__1);

/**
This property holds the time limit in milliseconds that distinguishes a double click from two consecutive mouse clicks. The default value on X11 is 400 milliseconds. On Windows and Mac OS X, the operating system's value is used. <p>On Microsoft Windows, calling this function sets the double click interval for all applications.
*/

    @com.trolltech.qt.QtPropertyWriter(name="doubleClickInterval")
    public native static void setDoubleClickInterval(int arg__1);


/**
Enables the UI effect <tt>effect</tt> if <tt>enable</tt> is true, otherwise the effect will not be used. <p>Note: All effects are disabled on screens running at less than 16-bit color depth. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isEffectEnabled(com.trolltech.qt.core.Qt.UIEffect) isEffectEnabled()}, {@link com.trolltech.qt.core.Qt.UIEffect Qt::UIEffect }, and {@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) setDesktopSettingsAware()}. <br></DD></DT>
*/

    public static void setEffectEnabled(com.trolltech.qt.core.Qt.UIEffect arg__1) {
        setEffectEnabled(arg__1, (boolean)true);
    }
/**
Enables the UI effect <tt>effect</tt> if <tt>enable</tt> is true, otherwise the effect will not be used. <p>Note: All effects are disabled on screens running at less than 16-bit color depth. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#isEffectEnabled(com.trolltech.qt.core.Qt.UIEffect) isEffectEnabled()}, {@link com.trolltech.qt.core.Qt.UIEffect Qt::UIEffect }, and {@link com.trolltech.qt.gui.QApplication#setDesktopSettingsAware(boolean) setDesktopSettingsAware()}. <br></DD></DT>
*/

    public static void setEffectEnabled(com.trolltech.qt.core.Qt.UIEffect arg__1, boolean enable)    {
        __qt_setEffectEnabled_UIEffect_boolean(arg__1.value(), enable);
    }
    native static void __qt_setEffectEnabled_UIEffect_boolean(int arg__1, boolean enable);

    private static void setFont(com.trolltech.qt.gui.QFont arg__1, com.trolltech.qt.QNativePointer className)    {
        __qt_setFont_QFont_nativepointer(arg__1 == null ? 0 : arg__1.nativeId(), className);
    }
    native static void __qt_setFont_QFont_nativepointer(long arg__1, com.trolltech.qt.QNativePointer className);

/**
This property holds the minimum size that any GUI element that the user can interact with should have. For example, no button should be resized to be smaller than the global strut size. The strut size should be considered when reimplementing GUI controls that may be used on touch-screens or similar I/O devices. <p>Example: <pre class="snippet">
        public static QSize sizeHint() {
            return new QSize(80, 25).expandedTo(QApplication.globalStrut());
        }
</pre> By default, this property contains a {@link com.trolltech.qt.core.QSize QSize} object with zero width and height.
*/

    @com.trolltech.qt.QtPropertyWriter(name="globalStrut")
    public static void setGlobalStrut(com.trolltech.qt.core.QSize arg__1)    {
        __qt_setGlobalStrut_QSize(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static void __qt_setGlobalStrut_QSize(long arg__1);

/**
This property holds the time limit in milliseconds that distinguishes a key press from two consecutive key presses. The default value on X11 is 400 milliseconds. On Windows and Mac OS X, the operating system's value is used.
*/

    @com.trolltech.qt.QtPropertyWriter(name="keyboardInputInterval")
    public native static void setKeyboardInputInterval(int arg__1);

/**
This property holds the default layout direction for this application. On system start-up, the default layout direction depends on the application's language. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}, {@link com.trolltech.qt.gui.QApplication#isLeftToRight() isLeftToRight()}, and {@link com.trolltech.qt.gui.QApplication#isRightToLeft() isRightToLeft()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="layoutDirection")
    public static void setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        __qt_setLayoutDirection_LayoutDirection(direction.value());
    }
    native static void __qt_setLayoutDirection_LayoutDirection(int direction);

/**
Sets the application override cursor to <tt>cursor</tt>. <p>Application override cursors are intended for showing the user that the application is in a special state, for example during an operation that might take some time. <p>This cursor will be displayed in all the application's widgets until {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()} or another {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()} is called. <p>Application cursors are stored on an internal stack. {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()} pushes the cursor onto the stack, and {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()} pops the active cursor off the stack. {@link com.trolltech.qt.gui.QApplication#changeOverrideCursor(com.trolltech.qt.gui.QCursor) changeOverrideCursor()} changes the curently active application override cursor. Every {@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) setOverrideCursor()} must eventually be followed by a corresponding {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()}, otherwise the stack will never be emptied. <p>Example: <pre class="snippet">
        QApplication.setOverrideCursor(new QCursor(Qt.CursorShape.WaitCursor));
        calculateHugeMandelbrot();              // lunch time...
        QApplication.restoreOverrideCursor();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#overrideCursor() overrideCursor()}, {@link com.trolltech.qt.gui.QApplication#restoreOverrideCursor() restoreOverrideCursor()}, {@link com.trolltech.qt.gui.QApplication#changeOverrideCursor(com.trolltech.qt.gui.QCursor) changeOverrideCursor()}, and {@link QWidget#setCursor(com.trolltech.qt.gui.QCursor) QWidget::setCursor()}. <br></DD></DT>
*/

    public static void setOverrideCursor(com.trolltech.qt.gui.QCursor arg__1)    {
        __qt_setOverrideCursor_QCursor(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static void __qt_setOverrideCursor_QCursor(long arg__1);

    private static void setPalette(com.trolltech.qt.gui.QPalette arg__1, com.trolltech.qt.QNativePointer className)    {
        __qt_setPalette_QPalette_nativepointer(arg__1 == null ? 0 : arg__1.nativeId(), className);
    }
    native static void __qt_setPalette_QPalette_nativepointer(long arg__1, com.trolltech.qt.QNativePointer className);

/**
This property holds whether the application implicitly quits when the last window is closed.  The default is true. <p>If this property is true, the applications quits when the last visible primary window (i.e. window with no parent) with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_QuitOnClose } attribute set is closed. By default this attribute is set for all widgets except for sub-windows. Refer to {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowType } for a detailed list of {@link com.trolltech.qt.core.Qt.WindowType Qt::Window } objects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, and {@link com.trolltech.qt.gui.QWidget#close() QWidget::close()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="quitOnLastWindowClosed")
    public native static void setQuitOnLastWindowClosed(boolean quit);

/**
If you support drag and drop in your application, and want to start a drag and drop operation after the user has moved the cursor a certain distance with a button held down, you should use this property's value as the minimum distance required. <p>For example, if the mouse position of the click is stored in <tt>startPos</tt> and the current position (e.g. in the mouse move event) is <tt>currentPos</tt>, you can find out if a drag should be started with code like this: <pre class="snippet">
            if (startPos.subtract(currentPos).manhattanLength() &gt;=
                QApplication.startDragDistance()) {
                startTheDrag();
            }
</pre> Qt uses this value internally, e.g. in {@link com.trolltech.qt.gui.QFileDialog QFileDialog}. <p>The default value is 4 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#startDragTime() startDragTime()}, {@link com.trolltech.qt.core.QPoint#manhattanLength() QPoint::manhattanLength()}, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="startDragDistance")
    public native static void setStartDragDistance(int l);

/**
This property holds the time in milliseconds that a mouse button must be held down before a drag and drop operation will begin. If you support drag and drop in your application, and want to start a drag and drop operation after the user has held down a mouse button for a certain amount of time, you should use this property's value as the delay. <p>Qt also uses this delay internally, e.g. in {@link com.trolltech.qt.gui.QTextEdit QTextEdit} and {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, for starting a drag. <p>The default value is 500 ms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#startDragDistance() startDragDistance()}, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="startDragTime")
    public native static void setStartDragTime(int ms);

/**
Sets the application's GUI style to <tt>style</tt>. Ownership of the style object is transferred to QApplication, so QApplication will delete the style object on application exit or when a new style is set and the old style is still the parent of the application object. <p>Example usage: <pre class="snippet">
        QApplication.setStyle(new QWindowsStyle());
</pre> When switching application styles, the color palette is set back to the initial colors or the system defaults. This is necessary since certain styles have to adapt the color palette to be fully style-guide compliant. <p>Note that setting the style before a palette has been set (i.e. before creating QApplication) will cause the application to use {@link com.trolltech.qt.gui.QStyle#standardPalette() QStyle::standardPalette()} for the palette. <p><b>Warning:</b> Qt style sheets are currently not supported for custom {@link com.trolltech.qt.gui.QStyle QStyle} subclasses. We plan to address this in some future release. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#style() style()}, {@link com.trolltech.qt.gui.QStyle QStyle}, {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}, and {@link com.trolltech.qt.gui.QApplication#desktopSettingsAware() desktopSettingsAware()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setStyle(com.trolltech.qt.gui.QStyle arg__1)    {
        __qt_setStyle_QStyle(arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setStyle_QStyle(long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Requests a {@link com.trolltech.qt.gui.QStyle QStyle} object for <tt>style</tt> from the {@link com.trolltech.qt.gui.QStyleFactory QStyleFactory}. <p>The string must be one of the {@link com.trolltech.qt.gui.QStyleFactory#keys() QStyleFactory::keys()}, typically one of "windows", "motif", "cde", "plastique", "windowsxp", or "macintosh". Style names are case insensitive. <p>Returns 0 if an unknown <tt>style</tt> is passed, otherwise the {@link com.trolltech.qt.gui.QStyle QStyle} object returned is set as the application's GUI style. <p><b>Warning:</b> To ensure that the application's style is set correctly, it is best to call this function before the QApplication constructor, if possible.
*/

    public native static com.trolltech.qt.gui.QStyle setStyle(java.lang.String arg__1);

/**
This property holds the number of lines to scroll a widget, when the mouse wheel is rotated.  If the value exceeds the widget's number of visible lines, the widget should interpret the scroll operation as a single page up or page down. If the widget is an {@link com.trolltech.qt.gui.QAbstractItemView item view class}, then the result of scrolling one line depends on the setting of the widget's {@link QAbstractItemView#verticalScrollMode() scroll mode}. Scroll one line can mean {@link com.trolltech.qt.gui.QAbstractItemView.ScrollMode scroll one item } or {@link com.trolltech.qt.gui.QAbstractItemView.ScrollMode scroll one pixel }. <p>By default, this property has a value of 3.
*/

    @com.trolltech.qt.QtPropertyWriter(name="wheelScrollLines")
    public native static void setWheelScrollLines(int arg__1);

/**
This property holds the default window icon. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowIcon(com.trolltech.qt.gui.QIcon) QWidget::setWindowIcon()}, and {@link <a href="../appicon.html">Setting the Application Icon</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowIcon")
    public static void setWindowIcon(com.trolltech.qt.gui.QIcon icon)    {
        __qt_setWindowIcon_QIcon(icon == null ? 0 : icon.nativeId());
    }
    native static void __qt_setWindowIcon_QIcon(long icon);

/**
If you support drag and drop in your application, and want to start a drag and drop operation after the user has moved the cursor a certain distance with a button held down, you should use this property's value as the minimum distance required. <p>For example, if the mouse position of the click is stored in <tt>startPos</tt> and the current position (e.g. in the mouse move event) is <tt>currentPos</tt>, you can find out if a drag should be started with code like this: <pre class="snippet">
            if (startPos.subtract(currentPos).manhattanLength() &gt;=
                QApplication.startDragDistance()) {
                startTheDrag();
            }
</pre> Qt uses this value internally, e.g. in {@link com.trolltech.qt.gui.QFileDialog QFileDialog}. <p>The default value is 4 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#startDragTime() startDragTime()}, {@link com.trolltech.qt.core.QPoint#manhattanLength() QPoint::manhattanLength()}, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="startDragDistance")
    public native static int startDragDistance();

/**
This property holds the time in milliseconds that a mouse button must be held down before a drag and drop operation will begin. If you support drag and drop in your application, and want to start a drag and drop operation after the user has held down a mouse button for a certain amount of time, you should use this property's value as the delay. <p>Qt also uses this delay internally, e.g. in {@link com.trolltech.qt.gui.QTextEdit QTextEdit} and {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, for starting a drag. <p>The default value is 500 ms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#startDragDistance() startDragDistance()}, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="startDragTime")
    public native static int startDragTime();

/**
Returns the application's style object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}, and {@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QStyle style();

/**
Synchronizes with the X server in the X11 implementation. This normally takes some time. Does nothing on other platforms.
*/

    public native static void syncX();

/**
Returns the top-level widget at the given <tt>point</tt>; returns 0 if there is no such widget.
*/

    public static com.trolltech.qt.gui.QWidget topLevelAt(com.trolltech.qt.core.QPoint p)    {
        return __qt_topLevelAt_QPoint(p == null ? 0 : p.nativeId());
    }
    native static com.trolltech.qt.gui.QWidget __qt_topLevelAt_QPoint(long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns the top-level widget at the point (<tt>x</tt>, <tt>y</tt>); returns 0 if there is no such widget.
*/

    public native static com.trolltech.qt.gui.QWidget topLevelAt(int x, int y);

/**
Returns a list of the top-level widgets (windows) in the application. <p>Note that some of the top-level widgets may be hidden, for example a tooltip if no tooltip is currently shown. <p>Example: <pre class="snippet">
        public final void showAllHiddenTopLevelWidgets() {
            for (QWidget widget : QApplication.topLevelWidgets()) {
                if (widget.isHidden())
                    widget.show();
            }
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#allWidgets() allWidgets()}, {@link com.trolltech.qt.gui.QWidget#isWindow() QWidget::isWindow()}, and {@link com.trolltech.qt.gui.QWidget#isHidden() QWidget::isHidden()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.gui.QWidget> topLevelWidgets();

/**
Returns the type of application ({@link com.trolltech.qt.gui.QApplication.Type Tty }, {@link com.trolltech.qt.gui.QApplication.Type GuiClient }, or {@link com.trolltech.qt.gui.QApplication.Type GuiServer }). The type is set when constructing the QApplication object.
*/

    public static com.trolltech.qt.gui.QApplication.Type type()    {
        return com.trolltech.qt.gui.QApplication.Type.resolve(__qt_type());
    }
    native static int __qt_type();

/**
This property holds the number of lines to scroll a widget, when the mouse wheel is rotated.  If the value exceeds the widget's number of visible lines, the widget should interpret the scroll operation as a single page up or page down. If the widget is an {@link com.trolltech.qt.gui.QAbstractItemView item view class}, then the result of scrolling one line depends on the setting of the widget's {@link QAbstractItemView#verticalScrollMode() scroll mode}. Scroll one line can mean {@link com.trolltech.qt.gui.QAbstractItemView.ScrollMode scroll one item } or {@link com.trolltech.qt.gui.QAbstractItemView.ScrollMode scroll one pixel }. <p>By default, this property has a value of 3.
*/

    @com.trolltech.qt.QtPropertyReader(name="wheelScrollLines")
    public native static int wheelScrollLines();

/**
Returns the widget at global screen position <tt>point</tt>, or 0 if there is no Qt widget there. <p>This function can be slow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}, {@link com.trolltech.qt.gui.QWidget#grabMouse() QWidget::grabMouse()}, and {@link com.trolltech.qt.gui.QWidget#grabKeyboard() QWidget::grabKeyboard()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QWidget widgetAt(com.trolltech.qt.core.QPoint p)    {
        return __qt_widgetAt_QPoint(p == null ? 0 : p.nativeId());
    }
    native static com.trolltech.qt.gui.QWidget __qt_widgetAt_QPoint(long p);

/**
This is an overloaded member function, provided for convenience. <p>Returns the widget at global screen position (<tt>x</tt>, <tt>y</tt>), or 0 if there is no Qt widget there.
*/

    public native static com.trolltech.qt.gui.QWidget widgetAt(int x, int y);

/**
This property holds the default window icon. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowIcon(com.trolltech.qt.gui.QIcon) QWidget::setWindowIcon()}, and {@link <a href="../appicon.html">Setting the Application Icon</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowIcon")
    public native static com.trolltech.qt.gui.QIcon windowIcon();

/**
@exclude
*/

    public static native QApplication fromNativePointer(QNativePointer nativePointer);

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

    protected QApplication(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static void initialize(String args[]) {
        com.trolltech.qt.internal.HelperFunctions.setAsMainThread();

        if (m_instance != null)
            throw new RuntimeException("QApplication can only be initialized once");

        String path = Utilities.unpackPlugins();
        if (path != null)
            addLibraryPath(path);
        else
            com.trolltech.qt.internal.QtJambiInternal.setupDefaultPluginPath();
        m_instance = new QApplication(args);
        m_instance.aboutToQuit.connect(m_instance, "disposeOfMyself()");
    }

/**
Displays a simple message box about Qt Jambi. The message includes the
version number of Qt being used by the application.
<p>
This is useful for inclusion in the Help menu of an application.
*/

    public static void aboutQtJambi() {
        com.trolltech.qt.QtJambiGuiInternal.aboutQtJambi();
    }

/**
Returns the unique QApplication instance.
*/

    public static QApplication instance() {
        if (type() != Type.Tty)
            return (QApplication) com.trolltech.qt.core.QCoreApplication.instance();
        return null;
    }

/**
Creates a QApplication with the specified command line arguments.
*/

    public QApplication(String args[]) {
        this(argc(args), argv(args));
    }

/**
Changes the default application font to <tt>font</tt>.
*/

    public static void setFont(QFont font) {
        setFont(font, null);
    }

/**
Changes the default application palette to <tt>palette</tt>.
*/

    public static void setPalette(QPalette palette) {
        setPalette(palette, null);
    }

/**
Returns the active application override cursor.
<p>
This function returns null if no application cursor has been defined
(i.e. the internal cursor stack is empty).
*/

    public static QCursor overrideCursor() {
        QNativePointer np = overrideCursor_private();
        return np == null ? null : QCursor.fromNativePointer(np);
    }

}
