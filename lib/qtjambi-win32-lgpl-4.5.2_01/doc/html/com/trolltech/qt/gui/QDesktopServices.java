package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDesktopServices class provides methods for accessing common desktop services. Many desktop environments provide services that can be used by applications to perform common tasks, such as opening a web page, in a way that is both consistent and takes into account the user's application preferences. <p>This class contains functions that provide simple interfaces to these services that indicate whether they succeeded or failed. <p>The {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) openUrl()} function is used to open files located at arbitrary URLs in external applications. For URLs that correspond to resources on the local filing system (where the URL scheme is "file"), a suitable application will be used to open the file; otherwise, a web browser will be used to fetch and display the file. <p>The user's desktop settings control whether certain executable file types are opened for browsing, or if they are executed instead. Some desktop environments are configured to prevent users from executing files obtained from non-local URLs, or to ask the user's permission before doing so.<a name="url-handlers"><h2>URL Handlers</h2> The behavior of the {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) openUrl()} function can be customized for individual URL schemes to allow applications to override the default handling behavior for certain types of URLs. <p>The dispatch mechanism allows only one custom handler to be used for each URL scheme; this is set using the {@link com.trolltech.qt.gui.QDesktopServices#setUrlHandler(java.lang.String, com.trolltech.qt.gui.QDesktopServices.UrlHandler) setUrlHandler()} function. Each handler is implemented as a slot which accepts only a single {@link com.trolltech.qt.core.QUrl QUrl} argument. <p>The existing handlers for each scheme can be removed with the {@link com.trolltech.qt.gui.QDesktopServices#unsetUrlHandler(java.lang.String) unsetUrlHandler()} function. This returns the handling behavior for the given scheme to the default behavior. <p>This system makes it easy to implement a help system, for example. Help could be provided in labels and text browsers using <b>help://myapplication/mytopic</b> URLs, and by registering a handler it becomes possible to display the help text inside the application: <pre class="snippet">
        QDesktopServices.setUrlHandler("help", new QDesktopServices.UrlHandler() {
            public void handleUrl(QUrl url) {
                // respond to url...
            }
            });
</pre> If inside the handler you decide that you can't open the requested URL, you can just call {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()} again with the same argument, and it will try to open the URL using the appropriate mechanism for the user's desktop environment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon QSystemTrayIcon}, and {@link com.trolltech.qt.core.QProcess QProcess}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDesktopServices extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the different locations that can be queried by QDesktopServices.:storageLocation and QDesktopServices::displayName. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopServices#storageLocation(com.trolltech.qt.gui.QDesktopServices.StandardLocation) storageLocation()}, and {@link com.trolltech.qt.gui.QDesktopServices#displayName(com.trolltech.qt.gui.QDesktopServices.StandardLocation) displayName()}. <br></DD></DT>
*/

    public enum StandardLocation implements com.trolltech.qt.QtEnumerator {
/**
 Returns the users desktop.
*/

        DesktopLocation(0),
/**
 Returns the users document.
*/

        DocumentsLocation(1),
/**
 Returns the users fonts.
*/

        FontsLocation(2),
/**
 Returns the users applications.
*/

        ApplicationsLocation(3),
/**
 Returns the users music.
*/

        MusicLocation(4),
/**
 Returns the users movies.
*/

        MoviesLocation(5),
/**
 Returns the users pictures.
*/

        PicturesLocation(6),
/**
 Returns the system's temporary directory.
*/

        TempLocation(7),
/**
 Returns the user's home directory.
*/

        HomeLocation(8),
/**
 Returns a directory location where persistent application data can be stored. {@link QCoreApplication#applicationName() QCoreApplication::applicationName} and {@link QCoreApplication#organizationName() QCoreApplication::organizationName} should be set to work on all platforms.
*/

        DataLocation(9),
/**
 Returns a directory location where user-specific non-essential (cached) data should be written.
*/

        CacheLocation(10);

        StandardLocation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDesktopServices$StandardLocation constant with the specified <tt>int</tt>.</brief>
*/

        public static StandardLocation resolve(int value) {
            return (StandardLocation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DesktopLocation;
            case 1: return DocumentsLocation;
            case 2: return FontsLocation;
            case 3: return ApplicationsLocation;
            case 4: return MusicLocation;
            case 5: return MoviesLocation;
            case 6: return PicturesLocation;
            case 7: return TempLocation;
            case 8: return HomeLocation;
            case 9: return DataLocation;
            case 10: return CacheLocation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**

*/

    public QDesktopServices(){
        super((QPrivateConstructor)null);
        __qt_QDesktopServices();
    }

    native void __qt_QDesktopServices();

/**
Returns a localized display name for the given location <tt>type</tt> or an empty QString if no relevant location can be found.
*/

    public static java.lang.String displayName(com.trolltech.qt.gui.QDesktopServices.StandardLocation type)    {
        return __qt_displayName_StandardLocation(type.value());
    }
    native static java.lang.String __qt_displayName_StandardLocation(int type);

/**
Opens the given <tt>url</tt> in the appropriate Web browser for the user's desktop environment, and returns true if successful; otherwise returns false. <p>If the URL is a reference to a local file (i.e., the URL scheme is "file") then it will be opened with a suitable application instead of a Web browser. <p>If a <tt>mailto</tt> URL is specified, the user's e-mail client will be used to open a composer window containing the options specified in the URL, similar to the way <tt>mailto</tt> links are handled by a Web browser. <p>For example, the following URL contains a recipient (<tt>user@foo.com</tt>), a subject (<tt>Test</tt>), and a message body (<tt>Just a test</tt>): <pre class="snippet">
    mailto:user&#64;foo.com?subject=Testody=Just a test
</pre> <b>Warning:</b> Although many e-mail clients can send attachments and are Unicode-aware, the user may have configured their client without these features. Also, certain e-mail clients (e.g., Lotus Notes) have problems with long URLs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopServices#setUrlHandler(java.lang.String, com.trolltech.qt.gui.QDesktopServices.UrlHandler) setUrlHandler()}. <br></DD></DT>
*/

    public static boolean openUrl(com.trolltech.qt.core.QUrl url)    {
        return __qt_openUrl_QUrl(url == null ? 0 : url.nativeId());
    }
    native static boolean __qt_openUrl_QUrl(long url);

    @SuppressWarnings("unchecked")
    private static void setUrlHandler(java.lang.String scheme, com.trolltech.qt.core.QObject receiver, com.trolltech.qt.QNativePointer method)    {
        __qt_setUrlHandler_String_QObject_nativepointer(scheme, receiver == null ? 0 : receiver.nativeId(), method);
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setUrlHandler_String_QObject_nativepointer(java.lang.String scheme, long receiver, com.trolltech.qt.QNativePointer method);

/**
Returns the default system directory where files of <tt>type</tt> belong, or an empty string if the location cannot be determined. <p><b>Note:</b> The storage location returned can be a directory that does not exist; i.e., it may need to be created by the system or the user.
*/

    public static java.lang.String storageLocation(com.trolltech.qt.gui.QDesktopServices.StandardLocation type)    {
        return __qt_storageLocation_StandardLocation(type.value());
    }
    native static java.lang.String __qt_storageLocation_StandardLocation(int type);

/**
Removes a previously set URL handler for the specified <tt>scheme</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopServices#setUrlHandler(java.lang.String, com.trolltech.qt.gui.QDesktopServices.UrlHandler) setUrlHandler()}. <br></DD></DT>
*/

    public native static void unsetUrlHandler(java.lang.String scheme);

/**
@exclude
*/

    public static native QDesktopServices fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDesktopServices(QPrivateConstructor p) { super(p); } 

    private static java.util.Hashtable<String, InternalUrlHandler> __rcUrlHandlers = new java.util.Hashtable<String, InternalUrlHandler>();

    public static interface UrlHandler {
        public void handleUrl(com.trolltech.qt.core.QUrl url);
    }

    private static class InternalUrlHandler extends com.trolltech.qt.core.QObject {
        private UrlHandler urlHandler;

        private InternalUrlHandler(UrlHandler urlHandler) {
            this.urlHandler = urlHandler;
        }

        private void handleUrl(com.trolltech.qt.core.QUrl url) {
            urlHandler.handleUrl(url);
        }

    }

/**
Sets the handler for the given <tt>scheme</tt> to be the handler <tt>method</tt> provided by the <tt>receiver</tt> object. <p>This function provides a way to customize the behavior of {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) openUrl()}. If {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) openUrl()} is called with a URL with the specified <tt>scheme</tt> then the given <tt>method</tt> on the <tt>receiver</tt> object is called instead of QDesktopServices launching an external application. <p>The provided method must be implemented as a slot that only accepts a single {@link com.trolltech.qt.core.QUrl QUrl} argument. <p>If {@link com.trolltech.qt.gui.QDesktopServices#setUrlHandler(java.lang.String, com.trolltech.qt.gui.QDesktopServices.UrlHandler) setUrlHandler()} is used to set a new handler for a scheme which already has a handler, the existing handler is simply replaced with the new one. Since QDesktopServices does not take ownership of handlers, no objects are deleted when a handler is replaced. <p>Note that the handler will always be called from within the same thread that calls {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) openUrl()}. <br></DD></DT>
*/

    public static void setUrlHandler(String scheme, UrlHandler urlHandler) {
        InternalUrlHandler receiver = urlHandler != null ? new InternalUrlHandler(urlHandler) : null;

        if (receiver == null)
            __rcUrlHandlers.remove(scheme);
        else
            __rcUrlHandlers.put(scheme, receiver);
        setUrlHandler(scheme, receiver, QNativePointer.createCharPointer("handleUrl"));
    }

}
