package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebSettings class provides an object to store the settings used by {@link com.trolltech.qt.webkit.QWebPage QWebPage} and {@link com.trolltech.qt.webkit.QWebFrame QWebFrame}. Each {@link com.trolltech.qt.webkit.QWebPage QWebPage} object has its own QWebSettings object, which configures the settings for that page. If a setting is not configured, then it is looked up in the global settings object, which can be accessed using {@link com.trolltech.qt.webkit.QWebSettings#globalSettings() QWebSettings::globalSettings()}. <p>QWebSettings allows configuring font properties such as font size and font family, the location of a custom stylesheet, and generic attributes like java script, plugins, etc. The {@link com.trolltech.qt.webkit.QWebSettings.WebAttribute WebAttribute } enum further describes this. <p>QWebSettings also configures global properties such as the web page memory cache and the web page icon database, local database storage and offline applications storage.<a name="web-application-support"><h2>Web Application Support</h2> WebKit provides support for features specified in {@link <a href="../http-www-w3-org-tr-html5.html">HTML 5</a>} that improve the performance and capabilities of Web applications. These include client-side (offline) storage and the use of a Web application cache. <p>Client-side (offline) storage is an improvement over the use of cookies to store persistent data in Web applications. Applications can configure and enable the use of an offline storage database by calling the {@link com.trolltech.qt.webkit.QWebSettings#setOfflineStoragePath(java.lang.String) setOfflineStoragePath()} with an appropriate file path, and can limit the quota for each application by calling {@link com.trolltech.qt.webkit.QWebSettings#setOfflineStorageDefaultQuota(long) setOfflineStorageDefaultQuota()}. <p>The performance of Web applications can be enhanced with the use of an offline cache. This can be enabled by calling setOfflineWebApplicationCache() with an appropriate file path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#settings() QWebPage::settings()}, {@link com.trolltech.qt.webkit.QWebView#settings() QWebView::settings()}, and {@link <a href="../qtwebkit.html">Browser</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QWebSettings extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the font sizes configurable through {@link com.trolltech.qt.webkit.QWebSettings QWebSettings}.
*/

    public enum FontSize implements com.trolltech.qt.QtEnumerator {
/**
 The hard minimum font size.
*/

        MinimumFontSize(0),
/**
 The minimum logical font size that is applied after zooming with {@link com.trolltech.qt.webkit.QWebFrame QWebFrame}'s textSizeMultiplier().
*/

        MinimumLogicalFontSize(1),
/**
 The default font size for regular text.
*/

        DefaultFontSize(2),
/**
 The default font size for fixed-pitch text.
*/

        DefaultFixedFontSize(3);

        FontSize(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebSettings$FontSize constant with the specified <tt>int</tt>.</brief>
*/

        public static FontSize resolve(int value) {
            return (FontSize) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MinimumFontSize;
            case 1: return MinimumLogicalFontSize;
            case 2: return DefaultFontSize;
            case 3: return DefaultFixedFontSize;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enums describes the standard graphical elements used in webpages.
*/

    public enum WebGraphic implements com.trolltech.qt.QtEnumerator {
/**
 The replacement graphic shown when an image could not be loaded.
*/

        MissingImageGraphic(0),
/**
 The replacement graphic shown when a plugin could not be loaded.
*/

        MissingPluginGraphic(1),
/**
 The default icon for {@link QWebFrame#icon() QWebFrame.:icon()}.
*/

        DefaultFrameIconGraphic(2),
/**
 The graphic shown for the size grip of text areas.
*/

        TextAreaSizeGripCornerGraphic(3);

        WebGraphic(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebSettings$WebGraphic constant with the specified <tt>int</tt>.</brief>
*/

        public static WebGraphic resolve(int value) {
            return (WebGraphic) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MissingImageGraphic;
            case 1: return MissingPluginGraphic;
            case 2: return DefaultFrameIconGraphic;
            case 3: return TextAreaSizeGripCornerGraphic;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the generic font families defined by CSS 2. For more information see the CSS standard.
*/

    public enum FontFamily implements com.trolltech.qt.QtEnumerator {
/**

*/

        StandardFont(0),
/**

*/

        FixedFont(1),
/**

*/

        SerifFont(2),
/**

*/

        SansSerifFont(3),
/**

*/

        CursiveFont(4),
/**

*/

        FantasyFont(5);

        FontFamily(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebSettings$FontFamily constant with the specified <tt>int</tt>.</brief>
*/

        public static FontFamily resolve(int value) {
            return (FontFamily) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StandardFont;
            case 1: return FixedFont;
            case 2: return SerifFont;
            case 3: return SansSerifFont;
            case 4: return CursiveFont;
            case 5: return FantasyFont;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes various attributes that are configurable through {@link com.trolltech.qt.webkit.QWebSettings QWebSettings}.
*/

    public enum WebAttribute implements com.trolltech.qt.QtEnumerator {
/**
 Specifies whether images are automatically loaded in web pages.
*/

        AutoLoadImages(0),
/**
 Enables or disables the running of JavaScript programs.
*/

        JavascriptEnabled(1),
/**
 Enables or disables Java applets. Currently Java applets are not supported.
*/

        JavaEnabled(2),
/**
 Enables or disables plugins in web pages. Currently Flash and other plugins are not supported.
*/

        PluginsEnabled(3),
/**
 Private browsing prevents WebKit from recording visited pages in the history and storing web page icons.
*/

        PrivateBrowsingEnabled(4),
/**
 Specifies whether JavaScript programs can open new windows.
*/

        JavascriptCanOpenWindows(5),
/**
 Specifies whether JavaScript programs can read or write to the clipboard.
*/

        JavascriptCanAccessClipboard(6),
/**
 Enables extra tools for Web developers. Currently this enables the "Inspect" element in the context menu, which shows the WebKit WebInspector for web site debugging.
*/

        DeveloperExtrasEnabled(7),
/**
 Specifies whether hyperlinks should be included in the keyboard focus chain.
*/

        LinksIncludedInFocusChain(8),
/**
 Specifies whether the zoom factor on a frame applies to only the text or all content.
*/

        ZoomTextOnly(9),
/**
 Specifies whether the background color and images are also drawn when the page is printed.
*/

        PrintElementBackgrounds(10),
/**
 Specifies whether support for the HTML 5 offline storage feature is enabled or not.
*/

        OfflineStorageDatabaseEnabled(11),
/**
 Specifies whether support for the HTML 5 web application cache feature is enabled or not.
*/

        OfflineWebApplicationCacheEnabled(12),
/**
 Specifies whether support for the HTML 5 local storage feature is enabled or not.
*/

        LocalStorageDatabaseEnabled(13);

        WebAttribute(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebSettings$WebAttribute constant with the specified <tt>int</tt>.</brief>
*/

        public static WebAttribute resolve(int value) {
            return (WebAttribute) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AutoLoadImages;
            case 1: return JavascriptEnabled;
            case 2: return JavaEnabled;
            case 3: return PluginsEnabled;
            case 4: return PrivateBrowsingEnabled;
            case 5: return JavascriptCanOpenWindows;
            case 6: return JavascriptCanAccessClipboard;
            case 7: return DeveloperExtrasEnabled;
            case 8: return LinksIncludedInFocusChain;
            case 9: return ZoomTextOnly;
            case 10: return PrintElementBackgrounds;
            case 11: return OfflineStorageDatabaseEnabled;
            case 12: return OfflineWebApplicationCacheEnabled;
            case 13: return LocalStorageDatabaseEnabled;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Returns the actual font family for the specified generic font family, <tt>which</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setFontFamily(com.trolltech.qt.webkit.QWebSettings.FontFamily, java.lang.String) setFontFamily()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fontFamily(com.trolltech.qt.webkit.QWebSettings.FontFamily which)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontFamily_FontFamily(nativeId(), which.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fontFamily_FontFamily(long __this__nativeId, int which);

/**
Returns the default font size for <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setFontSize(com.trolltech.qt.webkit.QWebSettings.FontSize, int) setFontSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int fontSize(com.trolltech.qt.webkit.QWebSettings.FontSize type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontSize_FontSize(nativeId(), type.value());
    }
    @QtBlockedSlot
    native int __qt_fontSize_FontSize(long __this__nativeId, int type);

/**
Resets the setting of <tt>attribute</tt>. This function has no effect on the global QWebSettings instance. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#globalSettings() globalSettings()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetAttribute(com.trolltech.qt.webkit.QWebSettings.WebAttribute attr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetAttribute_WebAttribute(nativeId(), attr.value());
    }
    @QtBlockedSlot
    native void __qt_resetAttribute_WebAttribute(long __this__nativeId, int attr);

/**
Resets the actual font family to the default font family, specified by <tt>which</tt>. <p>This function has no effect on the global QWebSettings instance.
*/

    @QtBlockedSlot
    public final void resetFontFamily(com.trolltech.qt.webkit.QWebSettings.FontFamily which)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetFontFamily_FontFamily(nativeId(), which.value());
    }
    @QtBlockedSlot
    native void __qt_resetFontFamily_FontFamily(long __this__nativeId, int which);

/**
Resets the font size for <tt>type</tt> to the size specified in the global settings object. <p>This function has no effect on the global QWebSettings instance.
*/

    @QtBlockedSlot
    public final void resetFontSize(com.trolltech.qt.webkit.QWebSettings.FontSize type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetFontSize_FontSize(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_resetFontSize_FontSize(long __this__nativeId, int type);

/**
Enables or disables the specified <tt>attribute</tt> feature depending on the value of <tt>on</tt>.
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.webkit.QWebSettings.WebAttribute attr, boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_WebAttribute_boolean(nativeId(), attr.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_WebAttribute_boolean(long __this__nativeId, int attr, boolean on);

/**
Sets the actual font family to <tt>family</tt> for the specified generic family, <tt>which</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#fontFamily(com.trolltech.qt.webkit.QWebSettings.FontFamily) fontFamily()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontFamily(com.trolltech.qt.webkit.QWebSettings.FontFamily which, java.lang.String family)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontFamily_FontFamily_String(nativeId(), which.value(), family);
    }
    @QtBlockedSlot
    native void __qt_setFontFamily_FontFamily_String(long __this__nativeId, int which, java.lang.String family);

/**
Sets the font size for <tt>type</tt> to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#fontSize(com.trolltech.qt.webkit.QWebSettings.FontSize) fontSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontSize(com.trolltech.qt.webkit.QWebSettings.FontSize type, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontSize_FontSize_int(nativeId(), type.value(), size);
    }
    @QtBlockedSlot
    native void __qt_setFontSize_FontSize_int(long __this__nativeId, int type, int size);

/**
Specifies the location of a user stylesheet to load with every web page. <p>The <tt>location</tt> can be a URL or a path on the local filesystem. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#userStyleSheetUrl() userStyleSheetUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserStyleSheetUrl(com.trolltech.qt.core.QUrl location)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserStyleSheetUrl_QUrl(nativeId(), location == null ? 0 : location.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUserStyleSheetUrl_QUrl(long __this__nativeId, long location);

/**
Returns true if <tt>attribute</tt> is enabled; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean testAttribute(com.trolltech.qt.webkit.QWebSettings.WebAttribute attr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testAttribute_WebAttribute(nativeId(), attr.value());
    }
    @QtBlockedSlot
    native boolean __qt_testAttribute_WebAttribute(long __this__nativeId, int attr);

/**
Returns the location of the user stylesheet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setUserStyleSheetUrl(com.trolltech.qt.core.QUrl) setUserStyleSheetUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl userStyleSheetUrl()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userStyleSheetUrl(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_userStyleSheetUrl(long __this__nativeId);

/**
Clears the icon database.
*/

    public native static void clearIconDatabase();

/**
Returns the global settings object. <p>Any setting changed on the default object is automatically applied to all {@link com.trolltech.qt.webkit.QWebPage QWebPage} instances where the particular setting is not overriden already.
*/

    public native static com.trolltech.qt.webkit.QWebSettings globalSettings();

/**
Returns the path of the icon database or an empty string if the icon database is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setIconDatabasePath(java.lang.String) setIconDatabasePath()}, and {@link com.trolltech.qt.webkit.QWebSettings#clearIconDatabase() clearIconDatabase()}. <br></DD></DT>
*/

    public native static java.lang.String iconDatabasePath();

/**
Returns the web site's icon for <tt>url</tt>. <p>If the web site does not specify an icon, or the icon is not in the database, a null {@link com.trolltech.qt.gui.QIcon QIcon} is returned. <p><b>Note:</b> The returned icon's size is arbitrary. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setIconDatabasePath(java.lang.String) setIconDatabasePath()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QIcon iconForUrl(com.trolltech.qt.core.QUrl url)    {
        return __qt_iconForUrl_QUrl(url == null ? 0 : url.nativeId());
    }
    native static com.trolltech.qt.gui.QIcon __qt_iconForUrl_QUrl(long url);

/**
Returns the maximum number of web pages that are kept in the memory cache. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setMaximumPagesInCache(int) setMaximumPagesInCache()}. <br></DD></DT>
*/

    public native static int maximumPagesInCache();

/**
Returns the value of the default quota for new offline storage databases. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setOfflineStorageDefaultQuota(long) setOfflineStorageDefaultQuota()}. <br></DD></DT>
*/

    public native static long offlineStorageDefaultQuota();

/**
Returns the path of the HTML5 offline storage or an empty string if the feature is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setOfflineStoragePath(java.lang.String) setOfflineStoragePath()}. <br></DD></DT>
*/

    public native static java.lang.String offlineStoragePath();

/**
Sets the path of the icon database to <tt>path</tt>. The icon database is used to store "favicons" associated with web sites. <p><tt>path</tt> must point to an existing directory where the icons are stored. <p>Setting an empty path disables the icon database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#iconDatabasePath() iconDatabasePath()}. <br></DD></DT>
*/

    public native static void setIconDatabasePath(java.lang.String location);

/**
Sets the maximum number of pages to hold in the memory cache to <tt>pages</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#maximumPagesInCache() maximumPagesInCache()}. <br></DD></DT>
*/

    public native static void setMaximumPagesInCache(int pages);

/**
Specifies the capacities for the memory cache for dead objects such as stylesheets or scripts. <p>The <tt>cacheMinDeadCapacity</tt> specifies the minimum number of bytes that dead objects should consume when the cache is under pressure. <p><tt>cacheMaxDead</tt> is the maximum number of bytes that dead objects should consume when the cache is <b>not</b> under pressure. <p><tt>totalCapacity</tt> specifies the maximum number of bytes that the cache should consume <b>overall</b>. <p>The cache is enabled by default. Calling setObjectCacheCapacities(0, 0, 0) will disable the cache. Calling it with one non-zero enables it again.
*/

    public native static void setObjectCacheCapacities(int cacheMinDeadCapacity, int cacheMaxDead, int totalCapacity);

/**
Sets the value of the default quota for new offline storage databases to <tt>maximumSize</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#offlineStorageDefaultQuota() offlineStorageDefaultQuota()}. <br></DD></DT>
*/

    public native static void setOfflineStorageDefaultQuota(long maximumSize);

/**
Sets the path for HTML5 offline storage to <tt>path</tt>. <p><tt>path</tt> must point to an existing directory where the databases are stored. <p>Setting an empty path disables the feature. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#offlineStoragePath() offlineStoragePath()}. <br></DD></DT>
*/

    public native static void setOfflineStoragePath(java.lang.String path);

/**
Sets <tt>graphic</tt> to be drawn when {@link <a href="../qtwebkit.html">QtWebKit</a>} needs to draw an image of the given <tt>type</tt>. <p>For example, when an image cannot be loaded the pixmap specified by {@link com.trolltech.qt.webkit.QWebSettings.WebGraphic MissingImageGraphic } is drawn instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#webGraphic(com.trolltech.qt.webkit.QWebSettings.WebGraphic) webGraphic()}. <br></DD></DT>
*/

    public static void setWebGraphic(com.trolltech.qt.webkit.QWebSettings.WebGraphic type, com.trolltech.qt.gui.QPixmap graphic)    {
        __qt_setWebGraphic_WebGraphic_QPixmap(type.value(), graphic == null ? 0 : graphic.nativeId());
    }
    native static void __qt_setWebGraphic_WebGraphic_QPixmap(int type, long graphic);

/**
Returns a previously set pixmap used to draw replacement graphics of the specified <tt>type</tt>. <p>For example, when an image cannot be loaded the pixmap specified by {@link com.trolltech.qt.webkit.QWebSettings.WebGraphic MissingImageGraphic } is drawn instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#setWebGraphic(com.trolltech.qt.webkit.QWebSettings.WebGraphic, com.trolltech.qt.gui.QPixmap) setWebGraphic()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QPixmap webGraphic(com.trolltech.qt.webkit.QWebSettings.WebGraphic type)    {
        return __qt_webGraphic_WebGraphic(type.value());
    }
    native static com.trolltech.qt.gui.QPixmap __qt_webGraphic_WebGraphic(int type);

/**
@exclude
*/

    public static native QWebSettings fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebSettings(QPrivateConstructor p) { super(p); } 
}
