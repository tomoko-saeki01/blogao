package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QCoreApplication class provides an event loop for console Qt applications. This class is used by non-GUI applications to provide their event loop. For non-GUI application that uses Qt, there should be exactly one QCoreApplication object. For GUI applications, see {@link com.trolltech.qt.gui.QApplication QApplication}. <p>QCoreApplication contains the main event loop, where all events from the operating system (e.g., timer and network events) and other sources are processed and dispatched. It also handles the application's initialization and finalization, as well as system-wide and application-wide settings. <p>The command line arguments which QCoreApplication's constructor should be called with are accessible using {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()}. The event loop is started with a call to {@link com.trolltech.qt.core.QCoreApplication#exec() exec()}. Long running operations can call {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()} to keep the application responsive. <p>Some Qt classes, such as QString, can be used without a QCoreApplication object. However, in general, we recommend that you create a QCoreApplication or a {@link com.trolltech.qt.gui.QApplication QApplication} object in your <tt>main()</tt> function as early as possible. The application will enter the event loop when {@link com.trolltech.qt.core.QCoreApplication#exec() exec()} is called. {@link com.trolltech.qt.core.QCoreApplication#exit() exit()} will not return until the event loop exits, e.g., when {@link com.trolltech.qt.core.QCoreApplication#quit() quit()} is called. <p>An application has an {@link com.trolltech.qt.core.QCoreApplication#applicationDirPath() applicationDirPath()} and an {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() applicationFilePath()}. Translation files can be added or removed using {@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) installTranslator()} and {@link com.trolltech.qt.core.QCoreApplication#removeTranslator(com.trolltech.qt.core.QTranslator) removeTranslator()}. Application strings can be translated using {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}. The QObject::tr() and QObject::trUtf8() functions are implemented in terms of {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}. <p>The class provides a {@link com.trolltech.qt.core.QCoreApplication#quit() quit()} slot and an {@link com.trolltech.qt.core.QCoreApplication#aboutToQuit aboutToQuit() } signal. <p>Several static convenience functions are also provided. The QCoreApplication object is available from {@link com.trolltech.qt.core.QCoreApplication#instance() instance()}. Events can be sent or posted using {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) sendEvent()}, {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}, and {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. Pending events can be removed with {@link com.trolltech.qt.core.QCoreApplication#removePostedEvents(com.trolltech.qt.core.QObject) removePostedEvents()} or flushed with {@link com.trolltech.qt.core.QCoreApplication#flush() flush()}. Library paths (see QLibrary) can be retrieved with {@link com.trolltech.qt.core.QCoreApplication#libraryPaths() libraryPaths()} and manipulated by {@link com.trolltech.qt.core.QCoreApplication#setLibraryPaths(java.util.List) setLibraryPaths()}, {@link com.trolltech.qt.core.QCoreApplication#addLibraryPath(java.lang.String) addLibraryPath()}, and {@link com.trolltech.qt.core.QCoreApplication#removeLibraryPath(java.lang.String) removeLibraryPath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication QApplication}, {@link com.trolltech.qt.core.QAbstractEventDispatcher QAbstractEventDispatcher}, {@link com.trolltech.qt.core.QEventLoop QEventLoop}, {@link <a href="../threads-semaphores.html">Semaphores Example</a>}, and {@link <a href="../threads-waitconditions.html">Wait Conditions Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCoreApplication extends com.trolltech.qt.core.QObject
{

    private static java.util.Collection<Object> __rcTranslators = new java.util.ArrayList<Object>();
    
/**
This enum type defines the 8-bit encoding of character string arguments to {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}: <p><DT><b>See also:</b><br><DD>QObject::tr(), QObject::trUtf8(), and QString::fromUtf8(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum Encoding implements com.trolltech.qt.QtEnumerator {
/**
 The encoding specified by QTextCodec.:codecForTr() (Latin-1 if none has been set).
*/

        CodecForTr(0),
/**
 UTF-8.
*/

        UnicodeUTF8(1),
;

        Encoding(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCoreApplication$Encoding constant with the specified <tt>int</tt>.</brief>
*/

        public static Encoding resolve(int value) {
            return (Encoding) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CodecForTr;
            case 1: return UnicodeUTF8;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted when the application is about to quit the main event loop, e. . when the event loop level drops to zero. This may happen either after a call to {@link com.trolltech.qt.core.QCoreApplication#quit() quit()} from inside the application or when the users shuts down the entire desktop session. <p>The signal is particularly useful if your application has to do some last-second cleanup. Note that no user interaction is possible in this state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}. <br></DD></DT>
*/

    public final Signal0 aboutToQuit = new Signal0();

    private final void aboutToQuit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToQuit(nativeId());
    }
    native void __qt_aboutToQuit(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: number)&gt;:<p> This signal is emitted whenever a Unix signal is received by the application. The Unix signal received is specified by its <tt>number</tt>.
*/

    public final Signal1<java.lang.Integer> unixSignal = new Signal1<java.lang.Integer>();

    private final void unixSignal(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unixSignal_int(nativeId(), arg__1);
    }
    native void __qt_unixSignal_int(long __this__nativeId, int arg__1);

    private QCoreApplication(com.trolltech.qt.QNativePointer argc, com.trolltech.qt.QNativePointer argv){
        super((QPrivateConstructor)null);
        __qt_QCoreApplication_nativepointer_nativepointer(argc, argv);
    }

    native void __qt_QCoreApplication_nativepointer_nativepointer(com.trolltech.qt.QNativePointer argc, com.trolltech.qt.QNativePointer argv);

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
Sends <tt>event</tt> to <tt>receiver</tt>. <tt>receiver</tt>-&gt;event(<tt>event</tt>). Returns the value that is returned from the receiver's event handler. Note that this function is called for all events send to any object is all threads. <p>For certain types of events (e.g. mouse and key events), the event will be propagated to the receiver's parent and so on up to the top-level object if the receiver is not interested in the event (i.e., it returns false). <p>There are five different ways that events can be processed; reimplementing this virtual function is just one of them. All five approaches are listed below: <ol><li> Reimplementing paintEvent(), mousePressEvent() and so on. This is the commonest, easiest and least powerful way.</li><li> Reimplementing this function. This is very powerful, providing complete control; but only one subclass can be active at a time.</li><li> Installing an event filter on {@link com.trolltech.qt.core.QCoreApplication#instance() QCoreApplication::instance()}. Such an event filter is able to process all events for all widgets, so it's just as powerful as reimplementing {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()}; furthermore, it's possible to have more than one application-global event filter. Global event filters even see mouse events for {@link QWidget#isEnabled() disabled widgets}. Note that application event filters are only called for objects that live in the main thread.</li><li> Reimplementing {@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) QObject::event()} (as {@link com.trolltech.qt.gui.QWidget QWidget} does). If you do this you get Tab key presses, and you get to see the events before any widget-specific event filters.</li><li> Installing an event filter on the object. Such an event filter gets all the events, including Tab and Shift+Tab key press events, as long as they do not change the focus widget.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) QObject::event()}, and {@link com.trolltech.qt.core.QObject#installEventFilter(com.trolltech.qt.core.QObject) installEventFilter()}. <br></DD></DT>
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
Prepends <tt>path</tt> to the beginning of the library path list, ensuring that it is searched for libraries first. If <tt>path</tt> is empty or already in the path list, the path list is not changed. <p>The default path list consists of a single entry, the installation directory for plugins. The default installation directory for plugins is <tt>INSTALL/plugins</tt>, where <tt>INSTALL</tt> is the directory where Qt was installed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#removeLibraryPath(java.lang.String) removeLibraryPath()}, {@link com.trolltech.qt.core.QCoreApplication#libraryPaths() libraryPaths()}, and {@link com.trolltech.qt.core.QCoreApplication#setLibraryPaths(java.util.List) setLibraryPaths()}. <br></DD></DT>
*/

    public native static void addLibraryPath(java.lang.String arg__1);

/**
Returns the directory that contains the application executable. <p>For example, if you have installed Qt in the <tt>C:\Trolltech\Qt</tt> directory, and you run the <tt>regexp</tt> example, this function will return "C:/Trolltech/Qt/examples/tools/regexp". <p>On Mac OS X this will point to the directory actually containing the executable, which may be inside of an application bundle (if the application is bundled). <p><b>Warning:</b> On Linux, this function will try to get the path from the <tt>/proc</tt> file system. If that fails, it assumes that <tt>argv[0]</tt> contains the absolute file name of the executable. The function also assumes that the current directory has not been changed by the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() applicationFilePath()}. <br></DD></DT>
*/

    public native static java.lang.String applicationDirPath();

/**
Returns the file path of the application executable. <p>For example, if you have installed Qt in the <tt>/usr/local/qt</tt> directory, and you run the <tt>regexp</tt> example, this function will return "/usr/local/qt/examples/tools/regexp/regexp". <p><b>Warning:</b> On Linux, this function will try to get the path from the <tt>/proc</tt> file system. If that fails, it assumes that <tt>argv[0]</tt> contains the absolute file name of the executable. The function also assumes that the current directory has not been changed by the application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#applicationDirPath() applicationDirPath()}. <br></DD></DT>
*/

    public native static java.lang.String applicationFilePath();

/**
This property holds the name of this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationName() organizationName}, {@link QCoreApplication#organizationDomain() organizationDomain}, and {@link QCoreApplication#applicationVersion() applicationVersion}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="applicationName")
    public native static java.lang.String applicationName();

/**
Returns the current process ID for the application.
*/

    public native static long applicationPid();

/**
This property holds the version of this application. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#applicationName() applicationName}, {@link QCoreApplication#organizationName() organizationName}, and {@link QCoreApplication#organizationDomain() organizationDomain}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="applicationVersion")
    public native static java.lang.String applicationVersion();

/**
Returns the list of command-line arguments. <p>Usually {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()}.at(0) is the program name, {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()}.at(1) is the first argument, and {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()}.last() is the last argument. See the note below about Windows. <p>Calling this function is slow - you should store the result in a variable when parsing the command line. <p><b>Warning:</b> On Unix, this list is built from the argc and argv parameters passed to the constructor in the main() function. The string-data in argv is interpreted using QString::fromLocal8Bit(); hence it is not possible to pass i.e. Japanese command line arguments on a system that runs in a latin1 locale. Most modern Unix systems do not have this limitation, as they are Unicode based. <p>On NT-based Windows, this limitation does not apply either. On Windows, the {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()} are not built from the contents of argv/argc, as the content does not support Unicode. Instead, the {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()} are constructed from the return value of GetCommandLine(). As a result of this, the string given by {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()}.at(0) might not be the program name on Windows, depending on how the application was started. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() applicationFilePath()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> arguments();

/**
Returns true if the application objects are being destroyed; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#startingUp() startingUp()}. <br></DD></DT>
*/

    public native static boolean closingDown();

/**
Enters the main event loop and waits until {@link com.trolltech.qt.core.QCoreApplication#exit() exit()} is called. Returns the value that was set to {@link com.trolltech.qt.core.QCoreApplication#exit() exit()} (which is 0 if {@link com.trolltech.qt.core.QCoreApplication#exit() exit()} is called via {@link com.trolltech.qt.core.QCoreApplication#quit() quit()}). <p>It is necessary to call this function to start event handling. The main event loop receives events from the window system and dispatches these to the application widgets. <p>To make your application perform idle processing (i.e. executing a special function whenever there are no pending events), use a {@link com.trolltech.qt.core.QTimer QTimer} with 0 timeout. More advanced idle processing schemes can be achieved using {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <p>We recommend that you connect clean-up code to the {@link com.trolltech.qt.core.QCoreApplication#aboutToQuit aboutToQuit() } signal, instead of putting it in your application's <tt>main()</tt> function because on some platforms the {@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()} call may not return. For example, on Windows when the user logs off, the system terminates the process after Qt closes all top-level windows. Hence, there is no guarantee that the application will have time to exit its event loop and execute code at the end of the <tt>main()</tt> function after the {@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()} call. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, {@link com.trolltech.qt.core.QCoreApplication#exit() exit()}, {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}, and QApplication::exec(). <br></DD></DT>
*/

    public native static int exec();


/**
Tells the application to exit with a return code. <p>After this function has been called, the application leaves the main event loop and returns from the call to {@link com.trolltech.qt.core.QCoreApplication#exec() exec()}. The {@link com.trolltech.qt.core.QCoreApplication#exec() exec()} function returns <tt>returnCode</tt>. If the event loop is not running, this function does nothing. <p>By convention, a <tt>returnCode</tt> of 0 means success, and any non-zero value indicates an error. <p>Note that unlike the C library function of the same name, this function does return to the caller -- it is event processing that stops. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, and {@link com.trolltech.qt.core.QCoreApplication#exec() exec()}. <br></DD></DT>
*/

    public static void exit() {
        exit((int)0);
    }
/**
Tells the application to exit with a return code. <p>After this function has been called, the application leaves the main event loop and returns from the call to {@link com.trolltech.qt.core.QCoreApplication#exec() exec()}. The {@link com.trolltech.qt.core.QCoreApplication#exec() exec()} function returns <tt>returnCode</tt>. If the event loop is not running, this function does nothing. <p>By convention, a <tt>returnCode</tt> of 0 means success, and any non-zero value indicates an error. <p>Note that unlike the C library function of the same name, this function does return to the caller -- it is event processing that stops. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, and {@link com.trolltech.qt.core.QCoreApplication#exec() exec()}. <br></DD></DT>
*/

    public native static void exit(int retcode);

/**
Flushes the platform specific event queues. <p>If you are doing graphical changes inside a loop that does not return to the event loop on asynchronous window systems like X11 or double buffered window systems like Mac OS X, and you want to visualize these changes immediately (e.g. Splash Screens), call this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. <br></DD></DT>
*/

    public native static void flush();

/**
This function returns true if there are pending events; otherwise returns false. Pending events can be either from the window system or posted events using {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractEventDispatcher#hasPendingEvents() QAbstractEventDispatcher::hasPendingEvents()}. <br></DD></DT>
*/

    public native static boolean hasPendingEvents();

/**
Adds the translation file <tt>translationFile</tt> to the list of translation files to be used for translations. <p>Multiple translation files can be installed. Translations are searched for in the reverse order in which they were installed, so the most recently installed translation file is searched first and the first translation file installed is searched last. The search stops as soon as a translation containing a matching string is found. <p>Installing or removing a {@link com.trolltech.qt.core.QTranslator QTranslator}, or changing an installed {@link com.trolltech.qt.core.QTranslator QTranslator} generates a {@link com.trolltech.qt.core.QEvent.Type LanguageChange } event for the QCoreApplication instance. A {@link com.trolltech.qt.gui.QApplication QApplication} instance will propagate the event to all toplevel windows, where a reimplementation of changeEvent can re-translate the user interface by passing user-visible strings via the tr() function to the respective property setters. User-interface classes generated by {@link <a href="../designer-manual.html">Qt Designer</a>} provide a <tt>retranslateUi()</tt> function that can be called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#removeTranslator(com.trolltech.qt.core.QTranslator) removeTranslator()}, {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}, {@link com.trolltech.qt.core.QTranslator#load(java.lang.String, java.lang.String, java.lang.String) QTranslator::load()}, and {@link <a href="../qtjambi-i18n.html">Dynamic Translation</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void installTranslator(com.trolltech.qt.core.QTranslator messageFile)    {
        if (messageFile != null) {
            __rcTranslators.add(messageFile);
        }
        __qt_installTranslator_QTranslator(messageFile == null ? 0 : messageFile.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_installTranslator_QTranslator(long messageFile);

/**
Returns a pointer to the application's QCoreApplication (or {@link com.trolltech.qt.gui.QApplication QApplication}) instance. <p>If no instance has been allocated, <tt>null</tt> is returned.
*/

    public native static com.trolltech.qt.core.QCoreApplication instance();

/**
Returns a list of paths that the application will search when dynamically loading libraries. <p>Qt provides default library paths, but they can also be set using a {@link <a href="../qt-conf.html">qt.conf</a>} file. Paths specified in this file will override default values. <p>This list will include the installation directory for plugins if it exists (the default installation directory for plugins is <tt>INSTALL/plugins</tt>, where <tt>INSTALL</tt> is the directory where Qt was installed). The directory of the application executable (NOT the working directory) is always added, as well as the colon separated entries of the QT_PLUGIN_PATH environment variable. <p>If you want to iterate over the list, you can use the {@link <a href="../containers.html">foreach</a>} pseudo-keyword: <pre class="snippet">
        for (String path : QApplication.libraryPaths())
            do_something(path);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#setLibraryPaths(java.util.List) setLibraryPaths()}, {@link com.trolltech.qt.core.QCoreApplication#addLibraryPath(java.lang.String) addLibraryPath()}, {@link com.trolltech.qt.core.QCoreApplication#removeLibraryPath(java.lang.String) removeLibraryPath()}, QLibrary, and {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> libraryPaths();

/**
This property holds the Internet domain of the organization that wrote this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p>On Mac, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationDomain() organizationDomain()} as the organization if it's not an empty string; otherwise it uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()}. On all other platforms, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()} as the organization. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationName() organizationName}, {@link QCoreApplication#applicationName() applicationName}, and {@link QCoreApplication#applicationVersion() applicationVersion}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="organizationDomain")
    public native static java.lang.String organizationDomain();

/**
This property holds the name of the organization that wrote this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p>On Mac, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationDomain() organizationDomain()} as the organization if it's not an empty string; otherwise it uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()}. On all other platforms, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()} as the organization. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationDomain() organizationDomain}, and {@link QCoreApplication#applicationName() applicationName}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="organizationName")
    public native static java.lang.String organizationName();

/**
Adds the event <tt>event</tt>, with the object <tt>receiver</tt> as the receiver of the event, to an event queue and returns immediately. <p>The event must be allocated on the heap since the post event queue will take ownership of the event and delete it once it has been posted. It is not safe to modify or delete the event after it has been posted. <p>When control returns to the main event loop, all events that are stored in the queue will be sent using the {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()} function. <p>Events are processed in the order posted. For more control over the processing order, use the {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()} overload below, which takes a priority argument. This function posts all event with a {@link com.trolltech.qt.core.Qt.EventPriority Qt::NormalEventPriority }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) sendEvent()}, {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()}, and {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. <br></DD></DT>
*/

    public static void postEvent(com.trolltech.qt.core.QObject receiver, com.trolltech.qt.core.QEvent event)    {
        if (event != null) {
            event.disableGarbageCollection();
        }
        __qt_postEvent_QObject_QEvent(receiver == null ? 0 : receiver.nativeId(), event == null ? 0 : event.nativeId());
    }
    native static void __qt_postEvent_QObject_QEvent(long receiver, long event);

/**
This function overloads {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}. <p>Adds the event <tt>event</tt>, with the object <tt>receiver</tt> as the receiver of the event, to an event queue and returns immediately. <p>The event must be allocated on the heap since the post event queue will take ownership of the event and delete it once it has been posted. It is not safe to modify or delete the event after it has been posted. <p>When control returns to the main event loop, all events that are stored in the queue will be sent using the {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()} function. <p>Events are sorted in descending <tt>priority</tt> order, i.e. events with a high <tt>priority</tt> are queued before events with a lower <tt>priority</tt>. The <tt>priority</tt> can be any integer value, i.e. between INT_MAX and INT_MIN, inclusive; see {@link com.trolltech.qt.core.Qt.EventPriority Qt::EventPriority } for more details. Events with equal <tt>priority</tt> will be processed in the order posted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) sendEvent()}, {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()}, {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}, and {@link com.trolltech.qt.core.Qt.EventPriority Qt::EventPriority }. <br></DD></DT>
*/

    public static void postEvent(com.trolltech.qt.core.QObject receiver, com.trolltech.qt.core.QEvent event, int priority)    {
        __qt_postEvent_QObject_QEvent_int(receiver == null ? 0 : receiver.nativeId(), event == null ? 0 : event.nativeId(), priority);
    }
    native static void __qt_postEvent_QObject_QEvent_int(long receiver, long event, int priority);


/**

*/

    public static void processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag ... flags) {
        com.trolltech.qt.core.QCoreApplication.processEvents(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(flags));
    }

/**
Processes all pending events for the calling thread according to the specified <tt>flags</tt> until there are no more events to process. <p>You can call this function occasionally when your program is busy performing a long operation (e.g. copying a file). <p>In event you are running a local loop which calls this function continuously, without an event loop, the {@link com.trolltech.qt.core.QEvent.Type DeferredDelete } events will not be processed. This can affect the behaviour of widgets, e.g. {@link com.trolltech.qt.gui.QToolTip QToolTip}, that rely on {@link com.trolltech.qt.core.QEvent.Type DeferredDelete } events to function properly. An alternative would be to call {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()} from within that local loop. <p>Calling this function processes events only for the calling thread. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#exec() exec()}, {@link com.trolltech.qt.core.QTimer QTimer}, {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QEventLoop::processEvents()}, {@link com.trolltech.qt.core.QCoreApplication#flush() flush()}, and {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. <br></DD></DT>
*/

    public static void processEvents() {
        processEvents(new com.trolltech.qt.core.QEventLoop.ProcessEventsFlags(0));
    }
/**
Processes all pending events for the calling thread according to the specified <tt>flags</tt> until there are no more events to process. <p>You can call this function occasionally when your program is busy performing a long operation (e.g. copying a file). <p>In event you are running a local loop which calls this function continuously, without an event loop, the {@link com.trolltech.qt.core.QEvent.Type DeferredDelete } events will not be processed. This can affect the behaviour of widgets, e.g. {@link com.trolltech.qt.gui.QToolTip QToolTip}, that rely on {@link com.trolltech.qt.core.QEvent.Type DeferredDelete } events to function properly. An alternative would be to call {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()} from within that local loop. <p>Calling this function processes events only for the calling thread. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#exec() exec()}, {@link com.trolltech.qt.core.QTimer QTimer}, {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QEventLoop::processEvents()}, {@link com.trolltech.qt.core.QCoreApplication#flush() flush()}, and {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. <br></DD></DT>
*/

    public static void processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags)    {
        __qt_processEvents_ProcessEventsFlags(flags.value());
    }
    native static void __qt_processEvents_ProcessEventsFlags(int flags);

/**
This function overloads {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <p>Processes pending events for the calling thread for <tt>maxtime</tt> milliseconds or until there are no more events to process, whichever is shorter. <p>You can call this function occasionally when you program is busy doing a long operation (e.g. copying a file). <p>Calling this function processes events only for the calling thread. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#exec() exec()}, {@link com.trolltech.qt.core.QTimer QTimer}, and {@link com.trolltech.qt.core.QEventLoop#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) QEventLoop::processEvents()}. <br></DD></DT>
*/

    public static void processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlags flags, int maxtime)    {
        __qt_processEvents_ProcessEventsFlags_int(flags.value(), maxtime);
    }
    native static void __qt_processEvents_ProcessEventsFlags_int(int flags, int maxtime);

/**
Tells the application to exit with return code 0 (success). Equivalent to calling QCoreApplication::exit(0). <p>It's common to connect the {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() } signal to {@link com.trolltech.qt.core.QCoreApplication#quit() quit()}, and you also often connect e.g. {@link com.trolltech.qt.gui.QAbstractButton#clicked QAbstractButton::clicked() } or signals in {@link com.trolltech.qt.gui.QAction QAction}, {@link com.trolltech.qt.gui.QMenu QMenu}, or {@link com.trolltech.qt.gui.QMenuBar QMenuBar} to it. <p>Example: <pre class="snippet">
        QPushButton quitButton = new QPushButton("Quit");
        quitButton.clicked.connect(QApplication.instance(), "quit()");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#exit() exit()}, {@link com.trolltech.qt.core.QCoreApplication#aboutToQuit aboutToQuit() }, and {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() }. <br></DD></DT>
*/

    public native static void quit();

/**
Removes <tt>path</tt> from the library path list. If <tt>path</tt> is empty or not in the path list, the list is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#addLibraryPath(java.lang.String) addLibraryPath()}, {@link com.trolltech.qt.core.QCoreApplication#libraryPaths() libraryPaths()}, and {@link com.trolltech.qt.core.QCoreApplication#setLibraryPaths(java.util.List) setLibraryPaths()}. <br></DD></DT>
*/

    public native static void removeLibraryPath(java.lang.String arg__1);

/**
Removes all events posted using {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()} for <tt>receiver</tt>. <p>The events are not dispatched, instead they are removed from the queue. You should never need to call this function. If you do call it, be aware that killing events may cause <tt>receiver</tt> to break one or more invariants.
*/

    @SuppressWarnings("unchecked")
    public static void removePostedEvents(com.trolltech.qt.core.QObject receiver)    {
        __qt_removePostedEvents_QObject(receiver == null ? 0 : receiver.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_removePostedEvents_QObject(long receiver);

/**
This function overloads {@link com.trolltech.qt.core.QCoreApplication#removePostedEvents(com.trolltech.qt.core.QObject) removePostedEvents()}. <p>Removes all events of the given <tt>eventType</tt> that were posted using {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()} for <tt>receiver</tt>. <p>The events are not dispatched, instead they are removed from the queue. You should never need to call this function. If you do call it, be aware that killing events may cause <tt>receiver</tt> to break one or more invariants. <p>If <tt>receiver</tt> is null, the events of <tt>eventType</tt> are removed for all objects. If <tt>eventType</tt> is 0, all the events are removed for <tt>receiver</tt>.
*/

    @SuppressWarnings("unchecked")
    public static void removePostedEvents(com.trolltech.qt.core.QObject receiver, int eventType)    {
        __qt_removePostedEvents_QObject_int(receiver == null ? 0 : receiver.nativeId(), eventType);
    }
    @SuppressWarnings("unchecked")
    native static void __qt_removePostedEvents_QObject_int(long receiver, int eventType);

/**
Removes the translation file <tt>translationFile</tt> from the list of translation files used by this application. (It does not delete the translation file from the file system.) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) installTranslator()}, {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) translate()}, and QObject::tr(). <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void removeTranslator(com.trolltech.qt.core.QTranslator messageFile)    {
        if (messageFile != null) {
            while (__rcTranslators.remove(messageFile)) ;
        }
        __qt_removeTranslator_QTranslator(messageFile == null ? 0 : messageFile.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_removeTranslator_QTranslator(long messageFile);

/**
Sends event <tt>event</tt> directly to receiver <tt>receiver</tt>, using the {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()} function. Returns the value that was returned from the event handler. <p>The event is not deleted when the event has been sent. The normal approach is to create the event on the stack, for example: <pre class="snippet">
        QMouseEvent event = new QMouseEvent(QEvent.Type.MouseButtonPress, pos, Qt.MouseButton.NoButton,
                                            new Qt.MouseButtons(Qt.MouseButton.NoButton),
                                            new Qt.KeyboardModifiers(Qt.KeyboardModifier.NoModifier));
        QApplication.sendEvent(mainWindow, event);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}, and {@link com.trolltech.qt.core.QCoreApplication#notify(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) notify()}. <br></DD></DT>
*/

    public static boolean sendEvent(com.trolltech.qt.core.QObject receiver, com.trolltech.qt.core.QEvent event)    {
        return __qt_sendEvent_QObject_QEvent(receiver == null ? 0 : receiver.nativeId(), event == null ? 0 : event.nativeId());
    }
    native static boolean __qt_sendEvent_QObject_QEvent(long receiver, long event);

/**
This function overloads {@link com.trolltech.qt.core.QCoreApplication#sendPostedEvents() sendPostedEvents()}. <p>Dispatches all posted events, i.e. empties the event queue.
*/

    public native static void sendPostedEvents();

/**
Immediately dispatches all events which have been previously queued with {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QCoreApplication::postEvent()} and which are for the object <tt>receiver</tt> and have the event type <tt>event_type</tt>. <p>Events from the window system are not dispatched by this function, but by {@link com.trolltech.qt.core.QCoreApplication#processEvents(com.trolltech.qt.core.QEventLoop.ProcessEventsFlag[]) processEvents()}. <p>If <tt>receiver</tt> is null, the events of <tt>event_type</tt> are sent for all objects. If <tt>event_type</tt> is 0, all the events are sent for <tt>receiver</tt>. <p><b>Note:</b> This method must be called from the same thread as its {@link com.trolltech.qt.core.QObject QObject} parameter, <tt>receiver</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#flush() flush()}, and {@link com.trolltech.qt.core.QCoreApplication#postEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) postEvent()}. <br></DD></DT>
*/

    public static void sendPostedEvents(com.trolltech.qt.core.QObject receiver, int event_type)    {
        __qt_sendPostedEvents_QObject_int(receiver == null ? 0 : receiver.nativeId(), event_type);
    }
    native static void __qt_sendPostedEvents_QObject_int(long receiver, int event_type);

/**
This property holds the name of this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationName() organizationName}, {@link QCoreApplication#organizationDomain() organizationDomain}, and {@link QCoreApplication#applicationVersion() applicationVersion}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="applicationName")
    public native static void setApplicationName(java.lang.String application);

/**
This property holds the version of this application. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#applicationName() applicationName}, {@link QCoreApplication#organizationName() organizationName}, and {@link QCoreApplication#organizationDomain() organizationDomain}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="applicationVersion")
    public native static void setApplicationVersion(java.lang.String version);


/**
Sets the attribute <tt>attribute</tt> if <tt>on</tt> is true; otherwise clears the attribute. <p>One of the attributes that can be set with this method is {@link com.trolltech.qt.core.Qt.ApplicationAttribute Qt::AA_ImmediateWidgetCreation }. It tells Qt to create toplevel windows immediately. Normally, resources for widgets are allocated on demand to improve efficiency and minimize resource usage. Therefore, if it is important to minimize resource consumption, do not set this attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#testAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) testAttribute()}. <br></DD></DT>
*/

    public static void setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute attribute) {
        setAttribute(attribute, (boolean)true);
    }
/**
Sets the attribute <tt>attribute</tt> if <tt>on</tt> is true; otherwise clears the attribute. <p>One of the attributes that can be set with this method is {@link com.trolltech.qt.core.Qt.ApplicationAttribute Qt::AA_ImmediateWidgetCreation }. It tells Qt to create toplevel windows immediately. Normally, resources for widgets are allocated on demand to improve efficiency and minimize resource usage. Therefore, if it is important to minimize resource consumption, do not set this attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#testAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) testAttribute()}. <br></DD></DT>
*/

    public static void setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute attribute, boolean on)    {
        __qt_setAttribute_ApplicationAttribute_boolean(attribute.value(), on);
    }
    native static void __qt_setAttribute_ApplicationAttribute_boolean(int attribute, boolean on);

/**
Sets the list of directories to search when loading libraries to <tt>paths</tt>. All existing paths will be deleted and the path list will consist of the paths given in <tt>paths</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#libraryPaths() libraryPaths()}, {@link com.trolltech.qt.core.QCoreApplication#addLibraryPath(java.lang.String) addLibraryPath()}, {@link com.trolltech.qt.core.QCoreApplication#removeLibraryPath(java.lang.String) removeLibraryPath()}, and QLibrary. <br></DD></DT>
*/

    public native static void setLibraryPaths(java.util.List<java.lang.String> arg__1);

/**
This property holds the Internet domain of the organization that wrote this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p>On Mac, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationDomain() organizationDomain()} as the organization if it's not an empty string; otherwise it uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()}. On all other platforms, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()} as the organization. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationName() organizationName}, {@link QCoreApplication#applicationName() applicationName}, and {@link QCoreApplication#applicationVersion() applicationVersion}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="organizationDomain")
    public native static void setOrganizationDomain(java.lang.String orgDomain);

/**
This property holds the name of the organization that wrote this application. The value is used by the {@link com.trolltech.qt.core.QSettings QSettings} class when it is constructed using the empty constructor. This saves having to repeat this information each time a {@link com.trolltech.qt.core.QSettings QSettings} object is created. <p>On Mac, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationDomain() organizationDomain()} as the organization if it's not an empty string; otherwise it uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()}. On all other platforms, {@link com.trolltech.qt.core.QSettings QSettings} uses {@link com.trolltech.qt.core.QCoreApplication#organizationName() organizationName()} as the organization. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationDomain() organizationDomain}, and {@link QCoreApplication#applicationName() applicationName}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="organizationName")
    public native static void setOrganizationName(java.lang.String orgName);

/**
Returns true if an application object has not been created yet; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#closingDown() closingDown()}. <br></DD></DT>
*/

    public native static boolean startingUp();

/**
Returns true if attribute <tt>attribute</tt> is set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#setAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute) setAttribute()}. <br></DD></DT>
*/

    public static boolean testAttribute(com.trolltech.qt.core.Qt.ApplicationAttribute attribute)    {
        return __qt_testAttribute_ApplicationAttribute(attribute.value());
    }
    native static boolean __qt_testAttribute_ApplicationAttribute(int attribute);

    private static java.lang.String translate(com.trolltech.qt.QNativePointer context, com.trolltech.qt.QNativePointer key, com.trolltech.qt.QNativePointer disambiguation, com.trolltech.qt.core.QCoreApplication.Encoding encoding)    {
        return __qt_translate_nativepointer_nativepointer_nativepointer_Encoding(context, key, disambiguation, encoding.value());
    }
    native static java.lang.String __qt_translate_nativepointer_nativepointer_nativepointer_Encoding(com.trolltech.qt.QNativePointer context, com.trolltech.qt.QNativePointer key, com.trolltech.qt.QNativePointer disambiguation, int encoding);

    private static java.lang.String translate(com.trolltech.qt.QNativePointer context, com.trolltech.qt.QNativePointer key, com.trolltech.qt.QNativePointer disambiguation, com.trolltech.qt.core.QCoreApplication.Encoding encoding, int n)    {
        return __qt_translate_nativepointer_nativepointer_nativepointer_Encoding_int(context, key, disambiguation, encoding.value(), n);
    }
    native static java.lang.String __qt_translate_nativepointer_nativepointer_nativepointer_Encoding_int(com.trolltech.qt.QNativePointer context, com.trolltech.qt.QNativePointer key, com.trolltech.qt.QNativePointer disambiguation, int encoding, int n);

/**
@exclude
*/

    public static native QCoreApplication fromNativePointer(QNativePointer nativePointer);

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

    protected QCoreApplication(QPrivateConstructor p) { super(p); } 

    protected static QCoreApplication m_instance = null;

/**
Constructs a Qt kernel application. Kernel applications are applications without a graphical user interface. These type of applications are used at the console or as server processes. <p>The argument <tt>args</tt> arguments are processed by the application, and made available in a more convenient form by the {@link com.trolltech.qt.core.QCoreApplication#arguments() arguments()} function.
*/

    public QCoreApplication(String args[]) {
        this(argc(args), argv(args));
    }

/**
Returns the translation text for <tt>sourceText</tt>, by querying the
installed translation files. The translation files are searched
from the most recently installed file back to the first
installed file.
<p>
QObject.tr() and QObject.trUtf8() provide this functionality
more conveniently.
<p>
<tt>context</tt> is typically a class name (e.g., "MyDialog") and
<tt>sourceText</tt> is either English text or a short identifying text.
<p>
<tt>comment</tt> is a disambiguating comment, for when the same
<tt>sourceText</tt> is used in different roles within the same context. By
default, it is null. <tt>encoding</tt> indicates the 8-bit encoding of
character stings See the QTranslator documentation for more
information about contexts and comments.
*/

    public static String translate(String context, String sourceText, String comment) {
        QTextCodec codec = QTextCodec.codecForName("UTF-8");
        return translate(context != null ? codec.fromUnicode(context).data() : null, sourceText != null ? codec.fromUnicode(sourceText).data() : null,
            comment != null ? codec.fromUnicode(comment).data() : null, Encoding.CodecForTr);
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String translate(String context, String sourceText) {
        return translate(context, sourceText, null);
    }

/**
Returns the translation text for <tt>sourceText</tt>, by querying the
installed translation files. The translation files are searched
from the most recently installed file back to the first
installed file.
<p>
QObject.tr() and QObject.trUtf8() provide this functionality
more conveniently.
<p>
<tt>context</tt> is typically a class name (e.g., "MyDialog") and
<tt>sourceText</tt> is either English text or a short identifying text.
<p>
<tt>comment</tt> is a disambiguating comment, for when the same
<tt>sourceText</tt> is used in different roles within the same context. By
default, it is null. <tt>encoding</tt> indicates the 8-bit encoding of
character stings See the QTranslator documentation for more
information about contexts and comments.
<p>
<tt>n</tt> is used in conjunction with <b>%n</b> to support plural forms.
See QObject.tr() for details.
*/

    public static String translate(String context, String sourceText, String comment, int n) {
        QTextCodec codec = QTextCodec.codecForName("UTF-8");
        return translate(context != null ? codec.fromUnicode(context).data() : null, sourceText != null ? codec.fromUnicode(sourceText).data() : null,
            comment != null ? codec.fromUnicode(comment).data() : null, Encoding.CodecForTr, n);
    }

/**
QCoreApplication keeps a unique instance of a QCoreApplication. It is initialized with this function.
*/

    public static void initialize(String args[]) {
        com.trolltech.qt.internal.HelperFunctions.setAsMainThread();

        if (m_instance != null)
            throw new RuntimeException("QCoreApplication can only be initialized once");

        String path = Utilities.unpackPlugins();
        if (path != null)
            addLibraryPath(path);
        else
            com.trolltech.qt.internal.QtJambiInternal.setupDefaultPluginPath();
        m_instance = new QCoreApplication(args);
        m_instance.aboutToQuit.connect(m_instance, "disposeOfMyself()");
    }

    private void disposeOfMyself() {
        m_instance = null;
        System.gc();
        this.disposeLater();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected final static com.trolltech.qt.QNativePointer argv(String args[]) {
        String newArgs[] = new String[args.length + 1];
        System.arraycopy(args, 0, newArgs, 1, args.length);
        newArgs[0] = "Qt Jambi application";
        argv = com.trolltech.qt.QNativePointer.createCharPointerPointer(newArgs);
        return argv;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected final static com.trolltech.qt.QNativePointer argc(String args[]) {
        if (argc != null) {
            throw new RuntimeException("There can only exist one QCoreApplication instance");
        }
        argc = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);
        argc.setIntValue(args.length + 1);
        return argc;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    protected void disposed() {
        argc = null;
        argv = null;
        m_instance = null;
        super.disposed();
    }

/**
This function will queue the <tt>runnable</tt> and invokes it later.
*/

    public static void invokeLater(java.lang.Runnable runnable) {
        postEvent(new QInvokable(runnable), new QEvent(QInvokable.INVOKABLE_EVENT));
    }

    /**
     * Executes the runnable's run() method in the main thread and waits for it
     * to return. If the current thread is not the main thread, an event loop
     * must be running in the main thread, or this method will wait
     * indefinitely.
     */
    public static void invokeAndWait(Runnable runnable) {
        // Specialcase invoke and wait for the case of running on the current thread...
        if (Thread.currentThread() == instance().thread()) {
            runnable.run();
            return;
        }

        QSynchronousInvokable invokable = new QSynchronousInvokable(runnable);
        QCoreApplication.postEvent(invokable, new QEvent(QSynchronousInvokable.SYNCHRONOUS_INVOKABLE_EVENT));
        invokable.waitForInvoked();
        invokable.disposeLater();
    }

    /**
     * Executes the task in the application's main thread after the
     * specified timeout. This is done by starting a timer so this
     * method does not block.
     * @param timeout The time to wait, in milliseconds
     * @param task The task to perform...
     */
    public static void invokeLater(int timeout, final Runnable task) {
        QTimer.singleShot(timeout, new QObject() {
            public void todo() {
                task.run();
                disposeLater();
            }
        }, "todo()");
    }

    private static com.trolltech.qt.QNativePointer argc, argv;

}
