package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSettings class provides persistent platform-independent application settings. Users normally expect an application to remember its settings (window sizes and positions, options, etc.) across sessions. This information is often stored in the system registry on Windows, and in XML preferences files on Mac OS X. On Unix systems, in the absence of a standard, many applications (including the KDE applications) use INI text files. <p>QSettings is an abstraction around these technologies, enabling you to save and restore application settings in a portable manner. It also supports custom storage formats. <p>QSettings's API is based on {@link com.trolltech.qt.QVariant QVariant}, allowing you to save most value-based types, such as QString, {@link com.trolltech.qt.core.QRect QRect}, and {@link com.trolltech.qt.gui.QImage QImage}, with the minimum of effort. <p>If all you need is a non-persistent memory-based structure, consider using QMap&lt;QString, {@link com.trolltech.qt.QVariant QVariant}&gt; instead. <ul><li> {@link <a href="#basic-usage">Basic Usage</a>}</li><li> {@link <a href="#qvariant-and-gui-types">QVariant and GUI Types</a>}</li><li> {@link <a href="#key-syntax">Key Syntax</a>}</li><li> {@link <a href="#fallback-mechanism">Fallback Mechanism</a>}</li><li> {@link <a href="#restoring-the-state-of-a-gui-application">Restoring the State of a GUI Application</a>}</li><li> {@link <a href="#accessing-settings-from-multiple-threads-or-processes-simultaneously">Accessing Settings from Multiple Threads or Processes Simultaneously</a>}</li><li> {@link <a href="#platform-specific-notes">Platform-Specific Notes</a>}</li></ul><a name="basic-usage"><h2>Basic Usage</h2> When creating a QSettings object, you must pass the name of your company or organization as well as the name of your application. For example, if your product is called Star Runner and your company is called MySoft, you would construct the QSettings object as follows: <pre class="snippet">
    QSettings settings = new QSettings("MySoft", "Star Runner");
</pre> QSettings objects can be created either on the stack or on the heap (i.e. using <tt>new</tt>). Constructing and destroying a QSettings object is very fast. <p>If you use QSettings from many places in your application, you might want to specify the organization name and the application name using {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()} and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()}, and then use the default QSettings constructor: <pre class="snippet">
    QCoreApplication.setOrganizationName("MySoft");

    QCoreApplication.setOrganizationDomain("mysoft.com");

    QCoreApplication.setApplicationName("Star Runner");
...
    QSettings settings = new QSettings();
</pre> (Here, we also specify the organization's Internet domain. When the Internet domain is set, it is used on Mac OS X instead of the organization name, since Mac OS X applications conventionally use Internet domains to identify themselves. If no domain is set, a fake domain is derived from the organization name. See the {@link <a href="../platform-notes.html">Platform-Specific Notes</a>} below for details.) <p>QSettings stores settings. Each setting consists of a QString that specifies the setting's name (the key) and a {@link com.trolltech.qt.QVariant QVariant} that stores the data associated with the key. To write a setting, use {@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}. For example: <pre class="snippet">
    settings.setValue("editor/wrapMargin", 68);
</pre> If there already exists a setting with the same key, the existing value is overwritten by the new value. For efficiency, the changes may not be saved to permanent storage immediately. (You can always call {@link com.trolltech.qt.core.QSettings#sync() sync()} to commit your changes.) <p>You can get a setting's value back using {@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}: <pre class="snippet">
    int margin = (Integer) settings.value("editor/wrapMargin");
</pre> If there is no setting with the specified name, QSettings returns a null {@link com.trolltech.qt.QVariant QVariant} (which can be converted to the integer 0). You can specify another default value by passing a second argument to {@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}: <pre class="snippet">
    int margin = (Integer) settings.value("editor/wrapMargin", 80);
</pre> To test whether a given key exists, call {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()}. To remove the setting associated with a key, call {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}. To obtain the list of all keys, call {@link com.trolltech.qt.core.QSettings#allKeys() allKeys()}. To remove all keys, call {@link com.trolltech.qt.core.QSettings#clear() clear()}.<a name="qvariant-and-gui-types"><h2>QVariant and GUI Types</h2> Because {@link com.trolltech.qt.QVariant QVariant} is part of the {@link <a href="../qtcore.html">QtCore</a>} library, it cannot provide conversion functions to data types such as {@link com.trolltech.qt.gui.QColor QColor}, {@link com.trolltech.qt.gui.QImage QImage}, and {@link com.trolltech.qt.gui.QPixmap QPixmap}, which are part of {@link <a href="../qtgui.html">QtGui</a>}. In other words, there is no <tt>toColor()</tt>, <tt>toImage()</tt>, or <tt>toPixmap()</tt> functions in {@link com.trolltech.qt.QVariant QVariant}. <p>Instead, you can use the QVariant::value() or the qVariantValue() template function. For example: <pre class="snippet">
        QSettings settings = new QSettings("MySoft", "Star Runner");
        QColor color = (QColor) settings.value("DataPump/bgcolor");
</pre> The inverse conversion (e.g., from {@link com.trolltech.qt.gui.QColor QColor} to {@link com.trolltech.qt.QVariant QVariant}) is automatic for all data types supported by {@link com.trolltech.qt.QVariant QVariant}, including GUI-related types: <pre class="snippet">
        QSettings settings = new QSettings("MySoft", "Star Runner");
        QColor color = widget.palette().window().color();
        settings.setValue("DataPump/bgcolor", color);
</pre> Custom types registered using qRegisterMetaType() and qRegisterMetaTypeStreamOperators() can be stored using QSettings.<a name="key-syntax"><h2>Key Syntax</h2> Setting keys can contain any Unicode characters. The Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, follow these two simple rules: <ol><li> Always refer to the same key using the same case. For example, if you refer to a key as "text fonts" in one place in your code, don't refer to it as "Text Fonts" somewhere else.</li><li> Avoid key names that are identical except for the case. For example, if you have a key called "{@link <a href="../designer-to-know.html">MainWindow</a>}", don't try to save another key as "mainwindow".</li><li> Do not use slashes ('/' and '\') in key names; the backslash character is used to separate sub keys (see below). On windows '\' are converted by QSettings to '/', which makes them identical.</li></ol> You can form hierarchical keys using the '/' character as a separator, similar to Unix file paths. For example: <pre class="snippet">
    settings.setValue("mainwindow/size", win.size());

    settings.setValue("mainwindow/fullScreen", win.isFullScreen());

    settings.setValue("outputpanel/visible", panel.isVisible());
</pre> If you want to save or restore many settings with the same prefix, you can specify the prefix using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()} and call {@link com.trolltech.qt.core.QSettings#endGroup() endGroup()} at the end. Here's the same example again, but this time using the group mechanism: <pre class="snippet">
    settings.beginGroup("mainwindow");
    settings.setValue("size", win.size());
    settings.setValue("fullScreen", win.isFullScreen());
    settings.endGroup();
<br>
    settings.beginGroup("outputpanel");
    settings.setValue("visible", panel.isVisible());
    settings.endGroup();
</pre> If a group is set using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, the behavior of most functions changes consequently. Groups can be set recursively. <p>In addition to groups, QSettings also supports an "array" concept. See {@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()} and {@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()} for details.<a name="fallback-mechanism"><h2>Fallback Mechanism</h2> Let's assume that you have created a QSettings object with the organization name MySoft and the application name Star Runner. When you look up a value, up to four locations are searched in that order: <ol><li> a user-specific location for the Star Runner application</li><li> a user-specific location for all applications by MySoft</li><li> a system-wide location for the Star Runner application</li><li> a system-wide location for all applications by MySoft</li></ol> (See {@link <a href="../platform-notes.html">Platform-Specific Notes</a>} below for information on what these locations are on the different platforms supported by Qt.) <p>If a key cannot be found in the first location, the search goes on in the second location, and so on. This enables you to store system-wide or organization-wide settings and to override them on a per-user or per-application basis. To turn off this mechanism, call setFallbacksEnabled(false). <p>Although keys from all four locations are available for reading, only the first file (the user-specific location for the application at hand) is accessible for writing. To write to any of the other files, omit the application name and/or specify {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope } (as opposed to {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the default). <p>Let's see with an example: <pre class="snippet">
    QSettings obj1 = new QSettings("MySoft", "Star Runner");

    QSettings obj2 = new QSettings("MySoft");
    QSettings obj3 = new QSettings(QSettings.Scope.SystemScope, "MySoft", "Star Runner");
    QSettings obj4 = new QSettings(QSettings.Scope.SystemScope, "MySoft");
</pre> The table below summarizes which QSettings objects access which location. "<b>X</b>" means that the location is the main location associated to the QSettings object and is used both for reading and for writing; "o" means that the location is used as a fallback when reading. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Locations</center></th><th><center> <tt>obj1</tt></center></th><th><center> <tt>obj2</tt></center></th><th><center> <tt>obj3</tt></center></th><th><center> <tt>obj4</tt></center></th></tr></thead><tr valign="top" class="even"><td> 1. User, Application</td><td> <b>X</b></td><td></td><td></td><td></td></tr><tr valign="top" class="odd"><td> 2. User, Organization</td><td> o</td><td> <b>X</b></td><td></td><td></td></tr><tr valign="top" class="even"><td> 3. System, Application</td><td> o</td><td></td><td> <b>X</b></td><td></td></tr><tr valign="top" class="odd"><td> 4. System, Organization</td><td> o</td><td> o</td><td> o</td><td> <b>X</b></td></tr></table> The beauty of this mechanism is that it works on all platforms supported by Qt and that it still gives you a lot of flexibility, without requiring you to specify any file names or registry paths. <p>If you want to use INI files on all platforms instead of the native API, you can pass {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat } as the first argument to the QSettings constructor, followed by the scope, the organization name, and the application name: <pre class="snippet">
    QSettings settings = new QSettings(QSettings.Format.IniFormat,
                                       QSettings.Scope.UserScope,
                                       "MySoft", "Star Runner");
</pre> The {@link <a href="../tools-settingseditor.html">Settings Editor</a>} example lets you experiment with different settings location and with fallbacks turned on or off.<a name="restoring-the-state-of-a-gui-application"><h2>Restoring the State of a GUI Application</h2> QSettings is often used to store the state of a GUI application. The following example illustrates how to use QSettings to save and restore the geometry of an application's main window. <pre class="snippet">
public void writeSettings()
{
    QSettings settings = new QSettings("Moose Soft", "Clipper");

    settings.beginGroup("MainWindow");
    settings.setValue("size", size());
    settings.setValue("pos", pos());
    settings.endGroup();
}
<br>
public void readSettings()
{
    QSettings settings = new QSettings("Moose Soft", "Clipper");

    settings.beginGroup("MainWindow");
    resize((QSize) settings.value("size", new QSize(400, 400)));
    move((QPoint) settings.value("pos", new QPoint(200, 200)));
    settings.endGroup();
}
</pre> See {@link <a href="../geometry.html">Window Geometry</a>} for a discussion on why it is better to call {@link QWidget#resize(com.trolltech.qt.core.QSize) QWidget::resize()} and {@link QWidget#move(com.trolltech.qt.core.QPoint) QWidget::move()} rather than {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()} to restore a window's geometry. <p>The <tt>readSettings()</tt> and <tt>writeSettings()</tt> functions must be called from the main window's constructor and close event handler as follows: <pre class="snippet">
public MainWindow()
{
...
    readSettings();

}
<br>
protected void closeEvent(QCloseEvent event)
{
    if (letsCutItOut()) {
        writeSettings();
        event.accept();
    } else {
        event.ignore();
    }
}
</pre> See the {@link <a href="../qtjambi-application.html">Application</a>} example for a self-contained example that uses QSettings.<a name="accessing-settings-from-multiple-threads-or-processes-simultaneously"><h2>Accessing Settings from Multiple Threads or Processes Simultaneously</h2> QSettings is {@link <a href="../qtjambi-threads.html">reentrant</a>}. This means that you can use distinct QSettings object in different threads simultaneously. This guarantee stands even when the QSettings objects refer to the same files on disk (or to the same entries in the system registry). If a setting is modified through one QSettings object, the change will immediately be visible in any other QSettings objects that operate on the same location and that live in the same process. <p>QSettings can safely be used from different processes (which can be different instances of your application running at the same time or different applications altogether) to read and write to the same system locations. It uses advisory file locking and a smart merging algorithm to ensure data integrity. Changes performed by another process aren't visible in the current process until {@link com.trolltech.qt.core.QSettings#sync() sync()} is called.<a name="platform-specific-notes"><h2>Platform-Specific Notes</h2><a name="locations-where-application-settings-are-stored"><h3>Locations Where Application Settings Are Stored</h3> As mentioned in the Fallback Mechanism section, QSettings stores settings for an application in up to four locations, depending on whether the settings are user-specific or system-wide and whether the the settings are application-specific or organization-wide. For simplicity, we're assuming the organization is called MySoft and the application is called Star Runner. <p>On Unix systems, if the file format is {@link com.trolltech.qt.core.QSettings.Format NativeFormat }, the following files are used by default: <ol><li> <tt>$HOME/.config/MySoft/Star Runner.conf</tt> (Qt for Embedded Linux: <tt>$HOME/Settings/MySoft/Star Runner.conf</tt>)</li><li> <tt>$HOME/.config/MySoft.conf</tt> (Qt for Embedded Linux: <tt>$HOME/Settings/MySoft.conf</tt>)</li><li> <tt>/etc/xdg/MySoft/Star Runner.conf</tt></li><li> <tt>/etc/xdg/MySoft.conf</tt></li></ol> On Mac OS X versions 10.2 and 10.3, these files are used by default: <ol><li> <tt>$HOME/Library/Preferences/com.MySoft.Star Runner.plist</tt></li><li> <tt>$HOME/Library/Preferences/com.MySoft.plist</tt></li><li> <tt>/Library/Preferences/com.MySoft.Star Runner.plist</tt></li><li> <tt>/Library/Preferences/com.MySoft.plist</tt></li></ol> On Windows, {@link com.trolltech.qt.core.QSettings.Format NativeFormat } settings are stored in the following registry paths: <ol><li> <tt>HKEY_CURRENT_USER\Software\MySoft\Star Runner</tt></li><li> <tt>HKEY_CURRENT_USER\Software\MySoft</tt></li><li> <tt>HKEY_LOCAL_MACHINE\Software\MySoft\Star Runner</tt></li><li> <tt>HKEY_LOCAL_MACHINE\Software\MySoft</tt></li></ol> If the file format is {@link com.trolltech.qt.core.QSettings.Format IniFormat }, the following files are used on Unix and Mac OS X: <ol><li> <tt>$HOME/.config/MySoft/Star Runner.ini</tt> (Qt for Embedded Linux: <tt>$HOME/Settings/MySoft/Star Runner.ini</tt>)</li><li> <tt>$HOME/.config/MySoft.ini</tt> (Qt for Embedded Linux: <tt>$HOME/Settings/MySoft.ini</tt>)</li><li> <tt>/etc/xdg/MySoft/Star Runner.ini</tt></li><li> <tt>/etc/xdg/MySoft.ini</tt></li></ol> On Windows, the following files are used: <ol><li> <tt>%APPDATA%\MySoft\Star Runner.ini</tt></li><li> <tt>%APPDATA%\MySoft.ini</tt></li><li> <tt>%COMMON_APPDATA%\MySoft\Star Runner.ini</tt></li><li> <tt>%COMMON_APPDATA%\MySoft.ini</tt></li></ol> The <tt>%APPDATA%</tt> path is usually <tt>C:\Documents and Settings\User Name\Application Data</tt>User Name; the <tt>%COMMON_APPDATA%</tt> path is usually <tt>C:\Documents and Settings\All Users\Application Data</tt>. <p>The paths for the <tt>.ini</tt> and <tt>.conf</tt> files can be changed using {@link com.trolltech.qt.core.QSettings#setPath(com.trolltech.qt.core.QSettings.Format, com.trolltech.qt.core.QSettings.Scope, java.lang.String) setPath()}. On Unix and Mac OS X, the user can override them by by setting the <tt>XDG_CONFIG_HOME</tt> environment variable; see {@link com.trolltech.qt.core.QSettings#setPath(com.trolltech.qt.core.QSettings.Format, com.trolltech.qt.core.QSettings.Scope, java.lang.String) setPath()} for details.<a name="accessing-ini-and-plist-files-directly"><h3>Accessing INI and .plist Files Directly</h3> Sometimes you do want to access settings stored in a specific file or registry path. On all platforms, if you want to read an INI file directly, you can use the QSettings constructor that takes a file name as first argument and pass {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat } as second argument. For example: <pre class="snippet">
        QSettings settings = new QSettings("/home/petra/misc/myapp.ini",
                           QSettings.Format.IniFormat);
</pre> You can then use the QSettings object to read and write settings in the file. <p>On Mac OS X, you can access XML-based <tt>.plist</tt> files by passing {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat } as second argument. For example: <pre class="snippet">
        QSettings settings = new QSettings("/Users/petra/misc/myapp.plist",
                           QSettings.Format.NativeFormat);
</pre><a name="accessing-the-windows-registry-directly"><h3>Accessing the Windows Registry Directly</h3> On Windows, QSettings lets you access settings that have been written with QSettings (or settings in a supported format, e.g., string data) in the system registry. This is done by constructing a QSettings object with a path in the registry and {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p>For example: <pre class="snippet">
        QSettings settings = new QSettings("HKEY_CURRENT_USER\\Software\\Microsoft\\Office",
                           QSettings.Format.NativeFormat);
</pre> All the registry entries that appear under the specified path can be read or written through the QSettings object as usual (using forward slashes instead of backslashes). For example: <pre class="snippet">
        settings.setValue("11.0/Outlook/Security/DontTrustInstalledFiles", 0);
</pre> Note that the backslash character is, as mentioned, used by QSettings to separate subkeys. As a result, you cannot read or write windows registry entries that contain slashes or backslashes; you should use a native windows API if you need to do so.<a name="accessing-common-registry-settings-on-windows"><h3>Accessing Common Registry Settings on Windows</h3> On Windows, it is possible for a key to have both a value and subkeys. Its default value is accessed by using "Default" or "." in place of a subkey: <pre class="snippet">
        settings.setValue("HKEY_CURRENT_USER\\MySoft\\Star Runner\\Galaxy", "Milkyway");
        settings.setValue("HKEY_CURRENT_USER\\MySoft\\Star Runner\\Galaxy\\Sun", "OurStar");
        settings.value("HKEY_CURRENT_USER\\MySoft\\Star Runner\\Galaxy\\Default"); // returns "Milkyway"
</pre> On other platforms than Windows, "Default" and "." would be treated as regular subkeys.<a name="platform-limitations"><h3>Platform Limitations</h3> While QSettings attempts to smooth over the differences between the different supported platforms, there are still a few differences that you should be aware of when porting your application: <ul><li> The Windows system registry has the following limitations: A subkey may not exceed 255 characters, an entry's value may not exceed 16,383 characters, and all the values of a key may not exceed 65,535 characters. One way to work around these limitations is to store the settings using the {@link com.trolltech.qt.core.QSettings.Format IniFormat } instead of the {@link com.trolltech.qt.core.QSettings.Format NativeFormat }.</li><li> On Mac OS X, {@link com.trolltech.qt.core.QSettings#allKeys() allKeys()} will return some extra keys for global settings that apply to all applications. These keys can be read using {@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()} but cannot be changed, only shadowed. Calling setFallbacksEnabled(false) will hide these global settings.</li><li> On Mac OS X, the CFPreferences API used by QSettings expects Internet domain names rather than organization names. To provide a uniform API, QSettings derives a fake domain name from the organization name (unless the organization name already is a domain name, e.g. OpenOffice.org). The algorithm appends ".com" to the company name and replaces spaces and other illegal characters with hyphens. If you want to specify a different domain name, call {@link QCoreApplication#setOrganizationDomain(java.lang.String) QCoreApplication::setOrganizationDomain()}, {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()}, and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()} in your <tt>main()</tt> function and then use the default QSettings constructor. Another solution is to use preprocessor directives, for example: <pre class="snippet">
        if (QSysInfo.operatingSystem() == QSysInfo.OS_DARWIN) {
            QSettings settings = new QSettings("grenoullelogique.fr", "Squash");
        } else {
            QSettings settings = new QSettings("Grenoulle Logique", "Squash");
        }
</li></pre><li> On Unix and Mac OS X systems, the advisory file locking is disabled if NFS (or AutoFS or CacheFS) is detected to work around a bug in the NFS fcntl() implementation, which hangs forever if statd or lockd aren't running. Also, the locking isn't performed when accessing <tt>.plist</tt> files.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.QVariant QVariant}, {@link com.trolltech.qt.gui.QSessionManager QSessionManager}, {@link <a href="../tools-settingseditor.html">Settings Editor Example</a>}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSettings extends com.trolltech.qt.core.QObject
{

    private Object __rcIniCodec = null;
    
/**
This enum type specifies the storage format used by {@link com.trolltech.qt.core.QSettings QSettings}. On Unix, {@link com.trolltech.qt.core.QSettings.Format NativeFormat } and {@link com.trolltech.qt.core.QSettings.Format IniFormat } mean the same thing, except that the file extension is different (<tt>.conf</tt> for {@link com.trolltech.qt.core.QSettings.Format NativeFormat }, <tt>.ini</tt> for {@link com.trolltech.qt.core.QSettings.Format IniFormat }). <p>The INI file format is a Windows file format that Qt supports on all platforms. In the absence of an INI standard, we try to follow what Microsoft does, with the following exceptions: <ul><li> If you store types that {@link com.trolltech.qt.QVariant QVariant} can't convert to QString (e.g., {@link com.trolltech.qt.core.QPoint QPoint}, {@link com.trolltech.qt.core.QRect QRect}, and {@link com.trolltech.qt.core.QSize QSize}), Qt uses an <tt>@</tt>-based syntax to encode the type. For example: <pre class="snippet">
        pos = &#64;Point(100 100)
</pre> To minimize compatibility issues, any <tt>@</tt> that doesn't appear at the first position in the value or that isn't followed by a Qt type (<tt>Point</tt>, <tt>Rect</tt>, <tt>Size</tt>, etc.) is treated as a normal character.</li><li> Although backslash is a special character in INI files, most Windows applications don't escape backslashes (<tt>\</tt>) in file paths: <pre class="snippet">
        windir = C:\Windows
</pre> {@link com.trolltech.qt.core.QSettings QSettings} always treats backslash as a special character and provides no API for reading or writing such entries.</li><li> The INI file format has severe restrictions on the syntax of a key. Qt works around this by using <tt>%</tt> as an escape character in keys. In addition, if you save a top-level setting (a key with no slashes in it, e.g., "someKey"), it will appear in the INI file's "General" section. To avoid overwriting other keys, if you save something using the a key such as "General/someKey", the key will be located in the "%General" section, not in the "General" section.</li><li> Following the philosophy that we should be liberal in what we accept and conservative in what we generate, {@link com.trolltech.qt.core.QSettings QSettings} will accept Latin-1 encoded INI files, but generate pure ASCII files, where non-ASCII values are encoded using standard INI escape sequences. To make the INI files more readable (but potentially less compatible), call {@link com.trolltech.qt.core.QSettings#setIniCodec(com.trolltech.qt.core.QTextCodec) setIniCodec()}.</li></ul> <p><DT><b>See also:</b><br><DD>registerFormat(), and {@link com.trolltech.qt.core.QSettings#setPath(com.trolltech.qt.core.QSettings.Format, com.trolltech.qt.core.QSettings.Scope, java.lang.String) setPath()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Format implements com.trolltech.qt.QtEnumerator {
/**
 Store the settings using the most appropriate storage format for the platform. On Windows, this means the system registry; on Mac OS X, this means the CFPreferences API; on Unix, this means textual configuration files in INI format.
*/

        NativeFormat(0),
/**
 Store the settings in INI files.
*/

        IniFormat(1),
/**
 Special value returned by registerFormat().
*/

        InvalidFormat(16),
        CustomFormat1(17),
        CustomFormat2(18),
        CustomFormat3(19),
        CustomFormat4(20),
        CustomFormat5(21),
        CustomFormat6(22),
        CustomFormat7(23),
        CustomFormat8(24),
        CustomFormat9(25),
        CustomFormat10(26),
        CustomFormat11(27),
        CustomFormat12(28),
        CustomFormat13(29),
        CustomFormat14(30),
        CustomFormat15(31),
        CustomFormat16(32);

        Format(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSettings$Format constant with the specified <tt>int</tt>.</brief>
*/

        public static Format resolve(int value) {
            return (Format) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NativeFormat;
            case 1: return IniFormat;
            case 16: return InvalidFormat;
            case 17: return CustomFormat1;
            case 18: return CustomFormat2;
            case 19: return CustomFormat3;
            case 20: return CustomFormat4;
            case 21: return CustomFormat5;
            case 22: return CustomFormat6;
            case 23: return CustomFormat7;
            case 24: return CustomFormat8;
            case 25: return CustomFormat9;
            case 26: return CustomFormat10;
            case 27: return CustomFormat11;
            case 28: return CustomFormat12;
            case 29: return CustomFormat13;
            case 30: return CustomFormat14;
            case 31: return CustomFormat15;
            case 32: return CustomFormat16;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
The following status values are possible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#status() status()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Status implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 An access error occurred (e.g. trying to write to a read-only file).
*/

        AccessError(1),
/**
 A format error occurred (e.g. loading a malformed INI file).
*/

        FormatError(2);

        Status(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSettings$Status constant with the specified <tt>int</tt>.</brief>
*/

        public static Status resolve(int value) {
            return (Status) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return AccessError;
            case 2: return FormatError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum specifies whether settings are user-specific or shared by all users of the same system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setPath(com.trolltech.qt.core.QSettings.Format, com.trolltech.qt.core.QSettings.Scope, java.lang.String) setPath()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Scope implements com.trolltech.qt.QtEnumerator {
/**
 Store settings in a location specific to the current user (e.g., in the user's home directory).
*/

        UserScope(0),
/**
 Store settings in a global location, so that all users on the same machine access the same set of settings.
*/

        SystemScope(1);

        Scope(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSettings$Scope constant with the specified <tt>int</tt>.</brief>
*/

        public static Scope resolve(int value) {
            return (Scope) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UserScope;
            case 1: return SystemScope;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QSettings object for accessing settings of the application and organization set previously with a call to {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()}, {@link QCoreApplication#setOrganizationDomain(java.lang.String) QCoreApplication::setOrganizationDomain()}, and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()}. <p>The scope is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope } and the format is {@link com.trolltech.qt.core.QSettings#defaultFormat() defaultFormat()} ({@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat } by default). <p>The code <pre class="snippet">
        QSettings settings = new QSettings("Moose Soft", "Facturo-Pro");
</pre> is equivalent to <pre class="snippet">
        QCoreApplication.setOrganizationName("Moose Soft");
        QCoreApplication.setApplicationName("Facturo-Pro");
        QSettings settings = new QSettings();
</pre> If {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()} and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()} has not been previously called, the QSettings object will not be able to read or write any settings, and {@link com.trolltech.qt.core.QSettings#status() status()} will return {@link com.trolltech.qt.core.QSettings.Status AccessError }. <p>On Mac OS X, if both a name and an Internet domain are specified for the organization, the domain is preferred over the name. On other platforms, the name is preferred over the domain. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()}, {@link QCoreApplication#setOrganizationDomain(java.lang.String) QCoreApplication::setOrganizationDomain()}, {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()}, and {@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}. <br></DD></DT>
*/

    public QSettings() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSettings object for accessing settings of the application and organization set previously with a call to {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()}, {@link QCoreApplication#setOrganizationDomain(java.lang.String) QCoreApplication::setOrganizationDomain()}, and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()}. <p>The scope is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope } and the format is {@link com.trolltech.qt.core.QSettings#defaultFormat() defaultFormat()} ({@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat } by default). <p>The code <pre class="snippet">
        QSettings settings = new QSettings("Moose Soft", "Facturo-Pro");
</pre> is equivalent to <pre class="snippet">
        QCoreApplication.setOrganizationName("Moose Soft");
        QCoreApplication.setApplicationName("Facturo-Pro");
        QSettings settings = new QSettings();
</pre> If {@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()} and {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()} has not been previously called, the QSettings object will not be able to read or write any settings, and {@link com.trolltech.qt.core.QSettings#status() status()} will return {@link com.trolltech.qt.core.QSettings.Status AccessError }. <p>On Mac OS X, if both a name and an Internet domain are specified for the organization, the domain is preferred over the name. On other platforms, the name is preferred over the domain. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#setOrganizationName(java.lang.String) QCoreApplication::setOrganizationName()}, {@link QCoreApplication#setOrganizationDomain(java.lang.String) QCoreApplication::setOrganizationDomain()}, {@link QCoreApplication#setApplicationName(java.lang.String) QCoreApplication::setApplicationName()}, and {@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}. <br></DD></DT>
*/

    public QSettings(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSettings_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSettings_QObject(long parent);


/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the native API is used for storing settings. If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat }, the INI format is used. <p>If no application name is given, the QSettings object will only access the organization-wide locations.
*/

    public QSettings(com.trolltech.qt.core.QSettings.Format format, com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization, java.lang.String application) {
        this(format, scope, organization, application, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the native API is used for storing settings. If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat }, the INI format is used. <p>If no application name is given, the QSettings object will only access the organization-wide locations.
*/

    public QSettings(com.trolltech.qt.core.QSettings.Format format, com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization) {
        this(format, scope, organization, (java.lang.String)null, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the native API is used for storing settings. If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat }, the INI format is used. <p>If no application name is given, the QSettings object will only access the organization-wide locations.
*/

    public QSettings(com.trolltech.qt.core.QSettings.Format format, com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization, java.lang.String application, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSettings_Format_Scope_String_String_QObject(format.value(), scope.value(), organization, application, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSettings_Format_Scope_String_String_QObject(int format, int scope, java.lang.String organization, java.lang.String application, long parent);


/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>The storage format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p>If no application name is given, the QSettings object will only access the organization-wide locations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}. <br></DD></DT>
*/

    public QSettings(com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization, java.lang.String application) {
        this(scope, organization, application, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>The storage format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p>If no application name is given, the QSettings object will only access the organization-wide locations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}. <br></DD></DT>
*/

    public QSettings(com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization) {
        this(scope, organization, (java.lang.String)null, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope }, the QSettings object searches user-specific settings first, before it searches system-wide settings as a fallback. If <tt>scope</tt> is {@link com.trolltech.qt.core.QSettings.Scope QSettings::SystemScope }, the QSettings object ignores user-specific settings and provides access to system-wide settings. <p>The storage format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p>If no application name is given, the QSettings object will only access the organization-wide locations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}. <br></DD></DT>
*/

    public QSettings(com.trolltech.qt.core.QSettings.Scope scope, java.lang.String organization, java.lang.String application, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSettings_Scope_String_String_QObject(scope.value(), organization, application, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSettings_Scope_String_String_QObject(int scope, java.lang.String organization, java.lang.String application, long parent);


/**
Constructs a QSettings object for accessing the settings stored in the file called <tt>fileName</tt>, with parent <tt>parent</tt>. If the file doesn't already exist, it is created. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the meaning of <tt>fileName</tt> depends on the platform. On Unix, <tt>fileName</tt> is the name of an INI file. On Mac OS X, <tt>fileName</tt> is the name of a <tt>.plist</tt> file. On Windows, <tt>fileName</tt> is a path in the system registry. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat }, <tt>fileName</tt> is the name of an INI file. <p><b>Warning:</b> This function is provided for convenience. It works well for accessing INI or <tt>.plist</tt> files generated by Qt, but might fail on some syntaxes found in such files originated by other programs. In particular, be aware of the following limitations: <ul><li> QSettings provides no way of reading INI "path" entries, i.e., entries with unescaped slash characters. (This is because these entries are ambiguous and cannot be resolved automatically.)</li><li> In INI files, QSettings uses the <tt>@</tt> character as a metacharacter in some contexts, to encode Qt-specific data types (e.g., <tt>@Rect</tt>), and might therefore misinterpret it when it occurs in pure INI files.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#fileName() fileName()}. <br></DD></DT>
*/

    public QSettings(java.lang.String fileName, com.trolltech.qt.core.QSettings.Format format) {
        this(fileName, format, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSettings object for accessing the settings stored in the file called <tt>fileName</tt>, with parent <tt>parent</tt>. If the file doesn't already exist, it is created. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the meaning of <tt>fileName</tt> depends on the platform. On Unix, <tt>fileName</tt> is the name of an INI file. On Mac OS X, <tt>fileName</tt> is the name of a <tt>.plist</tt> file. On Windows, <tt>fileName</tt> is a path in the system registry. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QSettings.Format QSettings::IniFormat }, <tt>fileName</tt> is the name of an INI file. <p><b>Warning:</b> This function is provided for convenience. It works well for accessing INI or <tt>.plist</tt> files generated by Qt, but might fail on some syntaxes found in such files originated by other programs. In particular, be aware of the following limitations: <ul><li> QSettings provides no way of reading INI "path" entries, i.e., entries with unescaped slash characters. (This is because these entries are ambiguous and cannot be resolved automatically.)</li><li> In INI files, QSettings uses the <tt>@</tt> character as a metacharacter in some contexts, to encode Qt-specific data types (e.g., <tt>@Rect</tt>), and might therefore misinterpret it when it occurs in pure INI files.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#fileName() fileName()}. <br></DD></DT>
*/

    public QSettings(java.lang.String fileName, com.trolltech.qt.core.QSettings.Format format, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSettings_String_Format_QObject(fileName, format.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSettings_String_Format_QObject(java.lang.String fileName, int format, long parent);


/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings("Moose Tech", "Facturo-Pro");
</pre> The scope is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope } and the format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}, and Fallback Mechanism. <br></DD></DT>
*/

    public QSettings(java.lang.String organization, java.lang.String application) {
        this(organization, application, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings("Moose Tech", "Facturo-Pro");
</pre> The scope is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope } and the format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}, and Fallback Mechanism. <br></DD></DT>
*/

    public QSettings(java.lang.String organization) {
        this(organization, (java.lang.String)null, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSettings object for accessing settings of the application called <tt>application</tt> from the organization called <tt>organization</tt>, and with parent <tt>parent</tt>. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings("Moose Tech", "Facturo-Pro");
</pre> The scope is {@link com.trolltech.qt.core.QSettings.Scope QSettings::UserScope } and the format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}, and Fallback Mechanism. <br></DD></DT>
*/

    public QSettings(java.lang.String organization, java.lang.String application, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSettings_String_String_QObject(organization, application, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSettings_String_String_QObject(java.lang.String organization, java.lang.String application, long parent);

/**
Returns a list of all keys, including subkeys, that can be read using the QSettings object. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("fridge/color", Qt.GlobalColor.white);
        settings.setValue("fridge/size", new QSize(32, 96));
        settings.setValue("sofa", true);
        settings.setValue("tv", false);

        List&lt;String&gt; keys = settings.allKeys();
        // keys: ["fridge/color", "fridge/size", "sofa", "tv"]
</pre> If a group is set using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, only the keys in the group are returned, without the group prefix: <pre class="snippet">
        settings.beginGroup("fridge");
        keys = settings.allKeys();
        // keys: ["color", "size"]
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#childGroups() childGroups()}, and {@link com.trolltech.qt.core.QSettings#childKeys() childKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> allKeys()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allKeys(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_allKeys(long __this__nativeId);

/**
Returns the application name used for storing the settings. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#applicationName() QCoreApplication::applicationName()}, {@link com.trolltech.qt.core.QSettings#format() format()}, {@link com.trolltech.qt.core.QSettings#scope() scope()}, and {@link com.trolltech.qt.core.QSettings#organizationName() organizationName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String applicationName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_applicationName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_applicationName(long __this__nativeId);

/**
Appends <tt>prefix</tt> to the current group. <p>The current group is automatically prepended to all keys specified to QSettings. In addition, query functions such as {@link com.trolltech.qt.core.QSettings#childGroups() childGroups()}, {@link com.trolltech.qt.core.QSettings#childKeys() childKeys()}, and {@link com.trolltech.qt.core.QSettings#allKeys() allKeys()} are based on the group. By default, no group is set. <p>Groups are useful to avoid typing in the same setting paths over and over. For example: <pre class="snippet">
        settings.beginGroup("mainwindow");
        settings.setValue("size", win.size());
        settings.setValue("fullScreen", win.isFullScreen());
        settings.endGroup();

        settings.beginGroup("outputpanel");
        settings.setValue("visible", panel.isVisible());
        settings.endGroup();
</pre> This will set the value of three settings: <ul><li> <tt>mainwindow/size</tt></li><li> <tt>mainwindow/fullScreen</tt></li><li> <tt>outputpanel/visible</tt></li></ul> Call {@link com.trolltech.qt.core.QSettings#endGroup() endGroup()} to reset the current group to what it was before the corresponding {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()} call. Groups can be nested. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#endGroup() endGroup()}, and {@link com.trolltech.qt.core.QSettings#group() group()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void beginGroup(java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginGroup_String(nativeId(), prefix);
    }
    @QtBlockedSlot
    native void __qt_beginGroup_String(long __this__nativeId, java.lang.String prefix);

/**
Adds <tt>prefix</tt> to the current group and starts reading from an array. Returns the size of the array. <p>Example: <pre class="snippet">
        class Login {
            public String userName;
            public String password;
        };
        List&lt;Login&gt; logins = new ArrayList&lt;Login&gt;();
        // ...

        QSettings settings = new QSettings();
        int size = settings.beginReadArray("logins");
        for (int i = 0; i &lt; size; ++i) {
            settings.setArrayIndex(i);
            Login login = new Login();
            login.userName = settings.value("userName").toString();
            login.password = settings.value("password").toString();
            logins.add(login);
        }
        settings.endArray();
</pre> Use {@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()} to write the array in the first place. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()}, {@link com.trolltech.qt.core.QSettings#endArray() endArray()}, and {@link com.trolltech.qt.core.QSettings#setArrayIndex(int) setArrayIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int beginReadArray(java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_beginReadArray_String(nativeId(), prefix);
    }
    @QtBlockedSlot
    native int __qt_beginReadArray_String(long __this__nativeId, java.lang.String prefix);


/**
Adds <tt>prefix</tt> to the current group and starts writing an array of size <tt>size</tt>. If <tt>size</tt> is -1 (the default), it is automatically determined based on the indexes of the entries written. <p>If you have many occurrences of a certain set of keys, you can use arrays to make your life easier. For example, let's suppose that you want to save a variable-length list of user names and passwords. You could then write: <pre class="snippet">
        class Login {
            String userName;
            String password;
        };
        List&lt;Login&gt; logins = new ArrayList&lt;Login&gt;();
        // ...

        QSettings settings = new QSettings();
        settings.beginWriteArray("logins");
        for (int i = 0; i &lt; logins.size(); ++i) {
            settings.setArrayIndex(i);
            settings.setValue("userName", logins.get(i).userName);
            settings.setValue("password", logins.get(i).password);
        }
        settings.endArray();
</pre> The generated keys will have the form <ul><li> <tt>logins/size</tt></li><li> <tt>logins/1/userName</tt></li><li> <tt>logins/1/password</tt></li><li> <tt>logins/2/userName</tt></li><li> <tt>logins/2/password</tt></li><li> <tt>logins/3/userName</tt></li><li> <tt>logins/3/password</tt></li><li> ...</li></ul> To read back an array, use {@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()}, {@link com.trolltech.qt.core.QSettings#endArray() endArray()}, and {@link com.trolltech.qt.core.QSettings#setArrayIndex(int) setArrayIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void beginWriteArray(java.lang.String prefix) {
        beginWriteArray(prefix, (int)-1);
    }
/**
Adds <tt>prefix</tt> to the current group and starts writing an array of size <tt>size</tt>. If <tt>size</tt> is -1 (the default), it is automatically determined based on the indexes of the entries written. <p>If you have many occurrences of a certain set of keys, you can use arrays to make your life easier. For example, let's suppose that you want to save a variable-length list of user names and passwords. You could then write: <pre class="snippet">
        class Login {
            String userName;
            String password;
        };
        List&lt;Login&gt; logins = new ArrayList&lt;Login&gt;();
        // ...

        QSettings settings = new QSettings();
        settings.beginWriteArray("logins");
        for (int i = 0; i &lt; logins.size(); ++i) {
            settings.setArrayIndex(i);
            settings.setValue("userName", logins.get(i).userName);
            settings.setValue("password", logins.get(i).password);
        }
        settings.endArray();
</pre> The generated keys will have the form <ul><li> <tt>logins/size</tt></li><li> <tt>logins/1/userName</tt></li><li> <tt>logins/1/password</tt></li><li> <tt>logins/2/userName</tt></li><li> <tt>logins/2/password</tt></li><li> <tt>logins/3/userName</tt></li><li> <tt>logins/3/password</tt></li><li> ...</li></ul> To read back an array, use {@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()}, {@link com.trolltech.qt.core.QSettings#endArray() endArray()}, and {@link com.trolltech.qt.core.QSettings#setArrayIndex(int) setArrayIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void beginWriteArray(java.lang.String prefix, int size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginWriteArray_String_int(nativeId(), prefix, size);
    }
    @QtBlockedSlot
    native void __qt_beginWriteArray_String_int(long __this__nativeId, java.lang.String prefix, int size);

/**
Returns a list of all key top-level groups that contain keys that can be read using the QSettings object. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("fridge/color", Qt.GlobalColor.white);
        settings.setValue("fridge/size", new QSize(32, 96));
        settings.setValue("sofa", true);
        settings.setValue("tv", false);

        List&lt;String&gt; groups = settings.childGroups();
        // group: ["fridge"]
</pre> If a group is set using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, the first-level keys in that group are returned, without the group prefix. <pre class="snippet">
        settings.beginGroup("fridge");
        groups = settings.childGroups();
        // groups: []
</pre> You can navigate through the entire setting hierarchy using {@link com.trolltech.qt.core.QSettings#childKeys() childKeys()} and {@link com.trolltech.qt.core.QSettings#childGroups() childGroups()} recursively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#childKeys() childKeys()}, and {@link com.trolltech.qt.core.QSettings#allKeys() allKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> childGroups()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childGroups(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_childGroups(long __this__nativeId);

/**
Returns a list of all top-level keys that can be read using the QSettings object. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("fridge/color", Qt.GlobalColor.white);
        settings.setValue("fridge/size", new QSize(32, 96));
        settings.setValue("sofa", true);
        settings.setValue("tv", false);

        List&lt;String&gt; keys = settings.childKeys();
        // keys: ["sofa", "tv"]
</pre> If a group is set using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, the top-level keys in that group are returned, without the group prefix: <pre class="snippet">
        settings.beginGroup("fridge");
        keys = settings.childKeys();
        // keys: ["color", "size"]
</pre> You can navigate through the entire setting hierarchy using {@link com.trolltech.qt.core.QSettings#childKeys() childKeys()} and {@link com.trolltech.qt.core.QSettings#childGroups() childGroups()} recursively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#childGroups() childGroups()}, and {@link com.trolltech.qt.core.QSettings#allKeys() allKeys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> childKeys()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childKeys(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_childKeys(long __this__nativeId);

/**
Removes all entries in the primary location associated to this QSettings object. <p>Entries in fallback locations are not removed. <p>If you only want to remove the entries in the current {@link com.trolltech.qt.core.QSettings#group() group()}, use remove("") instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}, and {@link com.trolltech.qt.core.QSettings#setFallbacksEnabled(boolean) setFallbacksEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns true if there exists a setting called <tt>key</tt>; returns false otherwise. <p>If a group is set using {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, <tt>key</tt> is taken to be relative to that group. <p>Note that the Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, see the Key Syntax rules. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}, and {@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(java.lang.String key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_String(nativeId(), key);
    }
    @QtBlockedSlot
    native boolean __qt_contains_String(long __this__nativeId, java.lang.String key);

/**
Closes the array that was started using {@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()} or {@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()}, and {@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void endArray()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endArray(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endArray(long __this__nativeId);

/**
Resets the group to what it was before the corresponding {@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()} call. <p>Example: <pre class="snippet">
        settings.beginGroup("alpha");
        // settings.group() == "alpha"

        settings.beginGroup("beta");
        // settings.group() == "alpha/beta"

        settings.endGroup();
        // settings.group() == "alpha"

        settings.endGroup();
        // settings.group() == ""
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, and {@link com.trolltech.qt.core.QSettings#group() group()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void endGroup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endGroup(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endGroup(long __this__nativeId);

/**
Returns true if fallbacks are enabled; returns false otherwise. <p>By default, fallbacks are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setFallbacksEnabled(boolean) setFallbacksEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fallbacksEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fallbacksEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fallbacksEnabled(long __this__nativeId);

/**
Returns the path where settings written using this QSettings object are stored. <p>On Windows, if the format is {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat }, the return value is a system registry path, not a file path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#isWritable() isWritable()}, and {@link com.trolltech.qt.core.QSettings#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Returns the format used for storing the settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#defaultFormat() defaultFormat()}, {@link com.trolltech.qt.core.QSettings#fileName() fileName()}, {@link com.trolltech.qt.core.QSettings#scope() scope()}, {@link com.trolltech.qt.core.QSettings#organizationName() organizationName()}, and {@link com.trolltech.qt.core.QSettings#applicationName() applicationName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSettings.Format format()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QSettings.Format.resolve(__qt_format(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_format(long __this__nativeId);

/**
Returns the current group. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#beginGroup(java.lang.String) beginGroup()}, and {@link com.trolltech.qt.core.QSettings#endGroup() endGroup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String group()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_group(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_group(long __this__nativeId);

/**
Returns the codec that is used for accessing INI files. By default, no codec is used, so a null pointer is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setIniCodec(com.trolltech.qt.core.QTextCodec) setIniCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec iniCodec()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iniCodec(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_iniCodec(long __this__nativeId);

/**
Returns true if settings can be written using this QSettings object; returns false otherwise. <p>One reason why {@link com.trolltech.qt.core.QSettings#isWritable() isWritable()} might return false is if QSettings operates on a read-only file. <p><b>Warning:</b> This function is not perfectly reliable, because the file permissions can change at any time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#fileName() fileName()}, {@link com.trolltech.qt.core.QSettings#status() status()}, and {@link com.trolltech.qt.core.QSettings#sync() sync()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWritable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWritable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWritable(long __this__nativeId);

/**
Returns the organization name used for storing the settings. <p><DT><b>See also:</b><br><DD>{@link QCoreApplication#organizationName() QCoreApplication::organizationName()}, {@link com.trolltech.qt.core.QSettings#format() format()}, {@link com.trolltech.qt.core.QSettings#scope() scope()}, and {@link com.trolltech.qt.core.QSettings#applicationName() applicationName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String organizationName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_organizationName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_organizationName(long __this__nativeId);

/**
Removes the setting <tt>key</tt> and any sub-settings of <tt>key</tt>. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("ape", 0);
        settings.setValue("monkey", 1);
        settings.setValue("monkey/sea", 2);
        settings.setValue("monkey/doe", 4);

        settings.remove("monkey");
        List&lt;String&gt; keys = settings.allKeys();
        // keys: ["ape"]
</pre> Be aware that if one of the fallback locations contains a setting with the same key, that setting will be visible after calling {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}. <p>If <tt>key</tt> is an empty string, all keys in the current {@link com.trolltech.qt.core.QSettings#group() group()} are removed. For example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("ape", 0);
        settings.setValue("monkey", 1);
        settings.setValue("monkey/sea", 2);
        settings.setValue("monkey/doe", 4);

        settings.beginGroup("monkey");
        settings.remove("");
        settings.endGroup();

        List&lt;String&gt; keys = settings.allKeys();
        // keys: ["ape"]
</pre> Note that the Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, see the Key Syntax rules. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}, {@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}, and {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void remove(java.lang.String key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_String(nativeId(), key);
    }
    @QtBlockedSlot
    native void __qt_remove_String(long __this__nativeId, java.lang.String key);

/**
Returns the scope used for storing the settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#format() format()}, {@link com.trolltech.qt.core.QSettings#organizationName() organizationName()}, and {@link com.trolltech.qt.core.QSettings#applicationName() applicationName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSettings.Scope scope()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QSettings.Scope.resolve(__qt_scope(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_scope(long __this__nativeId);

/**
Sets the current array index to <tt>i</tt>. Calls to functions such as {@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}, {@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}, {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}, and {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()} will operate on the array entry at that index. <p>You must call {@link com.trolltech.qt.core.QSettings#beginReadArray(java.lang.String) beginReadArray()} or {@link com.trolltech.qt.core.QSettings#beginWriteArray(java.lang.String) beginWriteArray()} before you can call this function.
*/

    @QtBlockedSlot
    public final void setArrayIndex(int i)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setArrayIndex_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_setArrayIndex_int(long __this__nativeId, int i);

/**
Sets whether fallbacks are enabled to <tt>b</tt>. <p>By default, fallbacks are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#fallbacksEnabled() fallbacksEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFallbacksEnabled(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFallbacksEnabled_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setFallbacksEnabled_boolean(long __this__nativeId, boolean b);

/**
Sets the codec for accessing INI files (including <tt>. onf</tt> files on Unix) to <tt>codec</tt>. The codec is used for decoding any data that is read from the INI file, and for encoding any data that is written to the file. By default, no codec is used, and non-ASCII characters are encoded using standard INI escape sequences. <p><b>Warning:</b> The codec must be set immediately after creating the QSettings object, before accessing any data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#iniCodec() iniCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIniCodec(com.trolltech.qt.core.QTextCodec codec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcIniCodec = codec;
        }
        __qt_setIniCodec_QTextCodec(nativeId(), codec == null ? 0 : codec.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIniCodec_QTextCodec(long __this__nativeId, long codec);

    @QtBlockedSlot
    private final void setIniCodec_private(com.trolltech.qt.QNativePointer codecName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIniCodec_private_nativepointer(nativeId(), codecName);
    }
    @QtBlockedSlot
    native void __qt_setIniCodec_private_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer codecName);

/**
Sets the value of setting <tt>key</tt> to <tt>value</tt>. If the <tt>key</tt> already exists, the previous value is overwritten. <p>Note that the Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, see the Key Syntax rules. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("interval", 30);
        QVariant.toInt(settings.value("interval"));     // returns 30

        settings.setValue("interval", 6.55);
        QVariant.toDouble(settings.value("interval"));  // returns 6.55
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#value(java.lang.String) value()}, {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}, and {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(java.lang.String key, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String_Object(nativeId(), key, value);
    }
    @QtBlockedSlot
    native void __qt_setValue_String_Object(long __this__nativeId, java.lang.String key, java.lang.Object value);

/**
Returns a status code indicating the first error that was met by QSettings, or {@link com.trolltech.qt.core.QSettings.Status QSettings::NoError } if no error occurred. <p>Be aware that QSettings delays performing some operations. For this reason, you might want to call {@link com.trolltech.qt.core.QSettings#sync() sync()} to ensure that the data stored in QSettings is written to disk before calling {@link com.trolltech.qt.core.QSettings#status() status()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#sync() sync()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSettings.Status status()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QSettings.Status.resolve(__qt_status(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_status(long __this__nativeId);

/**
Writes any unsaved changes to permanent storage, and reloads any settings that have been changed in the meantime by another application. <p>This function is called automatically from QSettings's destructor and by the event loop at regular intervals, so you normally don't need to call it yourself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#status() status()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sync()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sync(nativeId());
    }
    @QtBlockedSlot
    native void __qt_sync(long __this__nativeId);


/**
Returns the value for setting <tt>key</tt>. If the setting doesn't exist, returns <tt>defaultValue</tt>. <p>If no default value is specified, a default {@link com.trolltech.qt.QVariant QVariant} is returned. <p>Note that the Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, see the Key Syntax rules. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("animal/snake", 58);
        QVariant.toInt(settings.value("animal/snake", 1024));   // returns 58
        QVariant.toInt(settings.value("animal/zebra", 1024));   // returns 1024
        QVariant.toInt(settings.value("animal/zebra"));         // returns 0
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}, {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()}, and {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object value(java.lang.String key) {
        return value(key, (java.lang.Object)null);
    }
/**
Returns the value for setting <tt>key</tt>. If the setting doesn't exist, returns <tt>defaultValue</tt>. <p>If no default value is specified, a default {@link com.trolltech.qt.QVariant QVariant} is returned. <p>Note that the Windows registry and INI files use case-insensitive keys, whereas the Carbon Preferences API on Mac OS X uses case-sensitive keys. To avoid portability problems, see the Key Syntax rules. <p>Example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("animal/snake", 58);
        QVariant.toInt(settings.value("animal/snake", 1024));   // returns 58
        QVariant.toInt(settings.value("animal/zebra", 1024));   // returns 1024
        QVariant.toInt(settings.value("animal/zebra"));         // returns 0
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setValue(java.lang.String, java.lang.Object) setValue()}, {@link com.trolltech.qt.core.QSettings#contains(java.lang.String) contains()}, and {@link com.trolltech.qt.core.QSettings#remove(java.lang.String) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object value(java.lang.String key, java.lang.Object defaultValue)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String_Object(nativeId(), key, defaultValue);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value_String_Object(long __this__nativeId, java.lang.String key, java.lang.Object defaultValue);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
Returns default file format used for storing settings for the QSettings({@link com.trolltech.qt.core.QObject QObject} *) constructor. If no default format is set, {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat } is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#setDefaultFormat(com.trolltech.qt.core.QSettings.Format) setDefaultFormat()}, and {@link com.trolltech.qt.core.QSettings#format() format()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QSettings.Format defaultFormat()    {
        return com.trolltech.qt.core.QSettings.Format.resolve(__qt_defaultFormat());
    }
    native static int __qt_defaultFormat();

/**
Sets the default file format to the given <tt>format</tt>, used for storing settings for the QSettings({@link com.trolltech.qt.core.QObject QObject} *) constructor. <p>If no default format is set, {@link com.trolltech.qt.core.QSettings.Format QSettings::NativeFormat } is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSettings#defaultFormat() defaultFormat()}, and {@link com.trolltech.qt.core.QSettings#format() format()}. <br></DD></DT>
*/

    public static void setDefaultFormat(com.trolltech.qt.core.QSettings.Format format)    {
        __qt_setDefaultFormat_Format(format.value());
    }
    native static void __qt_setDefaultFormat_Format(int format);

/**
Sets the path used for storing settings for the given <tt>format</tt> and <tt>scope</tt>, to <tt>path</tt>. The <tt>format</tt> can be a custom format. <p>The table below summarizes the default values: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Platform</center></th><th><center> Format</center></th><th><center> Scope</center></th><th><center> Path</center></th></tr></thead><tr valign="top" class="even"><td rowspan=2> Windows</td><td rowspan=2> {@link com.trolltech.qt.core.QSettings.Format IniFormat }</td><td> {@link com.trolltech.qt.core.QSettings.Scope UserScope }</td><td> <tt>%APPDATA%</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QSettings.Scope SystemScope }</td><td> <tt>%COMMON_APPDATA%</tt></td></tr><tr valign="top" class="even"><td rowspan=2> Unix</td><td rowspan=2> {@link com.trolltech.qt.core.QSettings.Format NativeFormat }, {@link com.trolltech.qt.core.QSettings.Format IniFormat }</td><td> {@link com.trolltech.qt.core.QSettings.Scope UserScope }</td><td> <tt>$HOME/.config</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QSettings.Scope SystemScope }</td><td> <tt>/etc/xdg</tt></td></tr><tr valign="top" class="even"><td rowspan=2> Qt for Embedded Linux</td><td rowspan=2> {@link com.trolltech.qt.core.QSettings.Format NativeFormat }, {@link com.trolltech.qt.core.QSettings.Format IniFormat }</td><td> {@link com.trolltech.qt.core.QSettings.Scope UserScope }</td><td> <tt>$HOME/Settings</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QSettings.Scope SystemScope }</td><td> <tt>/etc/xdg</tt></td></tr><tr valign="top" class="even"><td rowspan=2> Mac OS X</td><td rowspan=2> {@link com.trolltech.qt.core.QSettings.Format IniFormat }</td><td> {@link com.trolltech.qt.core.QSettings.Scope UserScope }</td><td> <tt>$HOME/.config</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QSettings.Scope SystemScope }</td><td> <tt>/etc/xdg</tt></td></tr></table> The default {@link com.trolltech.qt.core.QSettings.Scope UserScope } paths on Unix and Mac OS X (<tt>$HOME/.config</tt> or $HOME/Settings) can be overridden by the user by setting the <tt>XDG_CONFIG_HOME</tt> environment variable. The default {@link com.trolltech.qt.core.QSettings.Scope SystemScope } paths on Unix and Mac OS X (<tt>/etc/xdg</tt>) can be overridden when building the Qt library using the <tt>configure</tt> script's <tt>--sysconfdir</tt> flag (see {@link com.trolltech.qt.core.QLibraryInfo QLibraryInfo} for details). <p>Setting the {@link com.trolltech.qt.core.QSettings.Format NativeFormat } paths on Windows and Mac OS X has no effect. <p><b>Warning:</b> This function doesn't affect existing QSettings objects. <p><DT><b>See also:</b><br><DD>registerFormat(). <br></DD></DT>
*/

    public static void setPath(com.trolltech.qt.core.QSettings.Format format, com.trolltech.qt.core.QSettings.Scope scope, java.lang.String path)    {
        __qt_setPath_Format_Scope_String(format.value(), scope.value(), path);
    }
    native static void __qt_setPath_Format_Scope_String(int format, int scope, java.lang.String path);

/**
@exclude
*/

    public static native QSettings fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSettings(QPrivateConstructor p) { super(p); } 

/**
This is an overloaded method provided for convenience.
*/

    public final void setIniCodec(String codecName)
    {
        QNativePointer strPtr = QNativePointer.createCharPointer(codecName);

        setIniCodec_private(strPtr);
    }

}
