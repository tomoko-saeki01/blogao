package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QLibraryInfo class provides information about the Qt library. Many pieces of information are established when Qt is configured. Installation paths, license information, and even a unique build key. This class provides an abstraction for accessing this information. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Function</center></th><th><center> Return value</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QLibraryInfo#buildKey() buildKey()}</td><td> A string that identifies the Qt version and the configuration. This key is used to ensure that {@link <a href="../plugins.html">plugins</a>} link against the same version of Qt as the application.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QLibraryInfo#location(com.trolltech.qt.core.QLibraryInfo.LibraryLocation) location()}</td><td> The path to a certain Qt component (e.g., documentation, header files).</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QLibraryInfo#licensee() licensee()}, {@link com.trolltech.qt.core.QLibraryInfo#licensedProducts() licensedProducts()}</td><td> Licensing information.</td></tr></table> You can also use a <tt>qt.conf</tt> file to override the hard-coded paths that are compiled into the Qt library. For more information, see the {@link <a href="../qt-conf.html">Using qt.conf</a>} documentation. <p><DT><b>See also:</b><br><DD>QSysInfo, and {@link <a href="../qt-conf.html">Using qt.conf</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QLibraryInfo extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
<a name="library-location"> This enum type is used to specify a specific location specifier. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLibraryInfo#location(com.trolltech.qt.core.QLibraryInfo.LibraryLocation) location()}. <br></DD></DT>
*/

    public enum LibraryLocation implements com.trolltech.qt.QtEnumerator {
/**
 The default prefix for all paths.
*/

        PrefixPath(0),
/**
 The location for documentation upon install.
*/

        DocumentationPath(1),
/**
 The location for all headers.
*/

        HeadersPath(2),
/**
 The location of installed librarires.
*/

        LibrariesPath(3),
/**
 The location of installed Qt binaries (tools and applications).
*/

        BinariesPath(4),
/**
 The location of installed Qt plugins.
*/

        PluginsPath(5),
/**
 The location of general Qt data.
*/

        DataPath(6),
/**
 The location of translation information for Qt strings.
*/

        TranslationsPath(7),
/**
 The location for Qt settings.
*/

        SettingsPath(8),
/**
 The location for demos upon install.
*/

        DemosPath(9),
/**
 The location for examples upon install.
*/

        ExamplesPath(10);

        LibraryLocation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLibraryInfo$LibraryLocation constant with the specified <tt>int</tt>.</brief>
*/

        public static LibraryLocation resolve(int value) {
            return (LibraryLocation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PrefixPath;
            case 1: return DocumentationPath;
            case 2: return HeadersPath;
            case 3: return LibrariesPath;
            case 4: return BinariesPath;
            case 5: return PluginsPath;
            case 6: return DataPath;
            case 7: return TranslationsPath;
            case 8: return SettingsPath;
            case 9: return DemosPath;
            case 10: return ExamplesPath;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Returns a unique key identifying this build of Qt and its configurations. This key is not globally unique, rather only useful for establishing of two configurations are compatible. This can be used to compare with the <tt>QT_BUILD_KEY</tt> preprocessor symbol. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLibraryInfo#location(com.trolltech.qt.core.QLibraryInfo.LibraryLocation) location()}. <br></DD></DT>
*/

    public native static java.lang.String buildKey();

/**
Returns the products that the license for this build of Qt has access to. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLibraryInfo#licensee() licensee()}. <br></DD></DT>
*/

    public native static java.lang.String licensedProducts();

/**
Returns the person to whom this build of Qt is licensed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLibraryInfo#licensedProducts() licensedProducts()}. <br></DD></DT>
*/

    public native static java.lang.String licensee();

/**
Returns the location specified by <tt>loc</tt>.
*/

    public static java.lang.String location(com.trolltech.qt.core.QLibraryInfo.LibraryLocation arg__1)    {
        return __qt_location_LibraryLocation(arg__1.value());
    }
    native static java.lang.String __qt_location_LibraryLocation(int arg__1);

/**
@exclude
*/

    public static native QLibraryInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLibraryInfo(QPrivateConstructor p) { super(p); } 
}
