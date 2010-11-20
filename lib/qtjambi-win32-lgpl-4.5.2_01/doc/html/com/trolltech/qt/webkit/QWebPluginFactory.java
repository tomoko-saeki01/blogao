package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebPluginFactory class creates plugins to be embedded into web pages. QWebPluginFactory is a factory for creating plugins for {@link com.trolltech.qt.webkit.QWebPage QWebPage}. A plugin factory can be installed on a {@link com.trolltech.qt.webkit.QWebPage QWebPage} using {@link com.trolltech.qt.webkit.QWebPage#setPluginFactory(com.trolltech.qt.webkit.QWebPluginFactory) QWebPage::setPluginFactory()}. <p><b>Note:</b> The plugin factory is only used if plugins are enabled through {@link com.trolltech.qt.webkit.QWebSettings QWebSettings}. <p>You can provide a QWebPluginFactory by implementing the {@link com.trolltech.qt.webkit.QWebPluginFactory#plugins() plugins()} and the {@link com.trolltech.qt.webkit.QWebPluginFactory#create(java.lang.String, com.trolltech.qt.core.QUrl, java.util.List, java.util.List) create()} method. For {@link com.trolltech.qt.webkit.QWebPluginFactory#plugins() plugins()} it is necessary to describe the plugins the factory can create, including a description and the supported MIME types. The MIME types each plugin can handle should match the ones specified in in the HTML <tt>&lt;object&gt;</tt> tag. <p>The {@link com.trolltech.qt.webkit.QWebPluginFactory#create(java.lang.String, com.trolltech.qt.core.QUrl, java.util.List, java.util.List) create()} method is called if the requested MIME type is supported. The implementation has to return a new instance of the plugin requested for the given MIME type and the specified URL.
*/
@QtJambiGeneratedClass
public abstract class QWebPluginFactory extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.webkit.QWebPluginFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QObject create(java.lang.String mimeType, com.trolltech.qt.core.QUrl url, java.util.List<java.lang.String> argumentNames, java.util.List<java.lang.String> argumentValues) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String_QUrl_List_List(nativeId(), mimeType, url == null ? 0 : url.nativeId(), argumentNames, argumentValues);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.webkit.QWebPluginFactory_Plugin> plugins() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_plugins(nativeId());
        }
    }

    
/**
This enum describes the types of extensions that the plugin factory can support. Before using these extensions, you should verify that the extension is supported by calling {@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()}. <p>Currently there are no extensions.
*/
@QtBlockedEnum
    public enum Extension implements com.trolltech.qt.QtEnumerator {
;

        Extension(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPluginFactory$Extension constant with the specified <tt>int</tt>.</brief>
*/

        public static Extension resolve(int value) {
            return (Extension) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a QWebPluginFactory with parent <tt>parent</tt>.
*/

    public QWebPluginFactory() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QWebPluginFactory with parent <tt>parent</tt>.
*/

    public QWebPluginFactory(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QWebPluginFactory_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWebPluginFactory_QObject(long parent);

/**
Implemented in subclasses to create a new plugin that can display content of the MIME type given by <tt>mimeType</tt>. The URL of the content is provided in <tt>url</tt>. The returned object should be a {@link com.trolltech.qt.gui.QWidget QWidget}. <p>The HTML object element can provide parameters through the <tt>&lt;param&gt;</tt> tag. The name and the value attributes of these tags are specified by the <tt>argumentNames</tt> and <tt>argumentValues</tt> string lists. <p>For example:<pre>&lt;object type="application/x-pdf" data="http://qtsoftware.com/document.pdf" width="500" height="400"&gt;
    &lt;param name="showTableOfContents" value="true" /&gt;
    &lt;param name="hideThumbnails" value="false" /&gt;
&lt;/object&gt;</pre> The above object element will result in a call to {@link com.trolltech.qt.webkit.QWebPluginFactory#create(java.lang.String, com.trolltech.qt.core.QUrl, java.util.List, java.util.List) create()} with the following arguments: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Parameter</center></th><th><center> Value</center></th></tr></thead><tr valign="top" class="even"><td> mimeType</td><td> "application/x-pdf"</td></tr><tr valign="top" class="odd"><td> url</td><td> "http://qtsoftware.com/document.pdf"</td></tr><tr valign="top" class="even"><td> argumentNames</td><td> "showTableOfContents" "hideThumbnails"</td></tr><tr valign="top" class="odd"><td> argumentVaues</td><td> "true" "false"</td></tr></table> <b>Note:</b> Ownership of the returned object will be transferred to the caller.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QObject create(java.lang.String mimeType, com.trolltech.qt.core.QUrl url, java.util.List<java.lang.String> argumentNames, java.util.List<java.lang.String> argumentValues);
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_create_String_QUrl_List_List(long __this__nativeId, java.lang.String mimeType, long url, java.util.List<java.lang.String> argumentNames, java.util.List<java.lang.String> argumentValues);


/**
This virtual function can be reimplemented in a QWebPluginFactory subclass to provide support for extensions. The <tt>option</tt> argument is provided as input to the extension; the output results can be stored in <tt>output</tt>. <p>The behaviour of this function is determined by <tt>extension</tt>. <p>You can call {@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()} to check if an extension is supported by the factory. <p>By default, no extensions are supported, and this function returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()}, and {@link com.trolltech.qt.webkit.QWebPluginFactory.Extension Extension }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean extension(com.trolltech.qt.webkit.QWebPluginFactory.Extension extension, com.trolltech.qt.webkit.QWebPluginFactory_ExtensionOption option) {
        return extension(extension, option, (com.trolltech.qt.webkit.QWebPluginFactory_ExtensionReturn)null);
    }

/**
This virtual function can be reimplemented in a QWebPluginFactory subclass to provide support for extensions. The <tt>option</tt> argument is provided as input to the extension; the output results can be stored in <tt>output</tt>. <p>The behaviour of this function is determined by <tt>extension</tt>. <p>You can call {@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()} to check if an extension is supported by the factory. <p>By default, no extensions are supported, and this function returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()}, and {@link com.trolltech.qt.webkit.QWebPluginFactory.Extension Extension }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean extension(com.trolltech.qt.webkit.QWebPluginFactory.Extension extension) {
        return extension(extension, (com.trolltech.qt.webkit.QWebPluginFactory_ExtensionOption)null, (com.trolltech.qt.webkit.QWebPluginFactory_ExtensionReturn)null);
    }
/**
This virtual function can be reimplemented in a QWebPluginFactory subclass to provide support for extensions. The <tt>option</tt> argument is provided as input to the extension; the output results can be stored in <tt>output</tt>. <p>The behaviour of this function is determined by <tt>extension</tt>. <p>You can call {@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()} to check if an extension is supported by the factory. <p>By default, no extensions are supported, and this function returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPluginFactory#supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension) supportsExtension()}, and {@link com.trolltech.qt.webkit.QWebPluginFactory.Extension Extension }. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean extension(com.trolltech.qt.webkit.QWebPluginFactory.Extension extension, com.trolltech.qt.webkit.QWebPluginFactory_ExtensionOption option, com.trolltech.qt.webkit.QWebPluginFactory_ExtensionReturn output)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_extension_Extension_QWebPluginFactory_ExtensionOption_QWebPluginFactory_ExtensionReturn(nativeId(), extension.value(), option == null ? 0 : option.nativeId(), output == null ? 0 : output.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_extension_Extension_QWebPluginFactory_ExtensionOption_QWebPluginFactory_ExtensionReturn(long __this__nativeId, int extension, long option, long output);

/**
This function is reimplemented in subclasses to return a list of supported plugins the factory can create. <p><b>Note:</b> Currently, this function is only called when JavaScript programs access the global <tt>plugins</tt> or <tt>mimetypes</tt> objects.
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.webkit.QWebPluginFactory_Plugin> plugins();
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.webkit.QWebPluginFactory_Plugin> __qt_plugins(long __this__nativeId);

/**
This function is called to refresh the list of supported plugins. It may be called after a new plugin has been installed in the system.
*/

    @QtBlockedSlot
    public void refreshPlugins()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_refreshPlugins(nativeId());
    }
    @QtBlockedSlot
    native void __qt_refreshPlugins(long __this__nativeId);

/**
This virtual function returns true if the plugin factory supports <tt>extension</tt>; otherwise false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPluginFactory#extension(com.trolltech.qt.webkit.QWebPluginFactory.Extension, com.trolltech.qt.webkit.QWebPluginFactory_ExtensionOption) extension()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean supportsExtension(com.trolltech.qt.webkit.QWebPluginFactory.Extension extension)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);

/**
@exclude
*/

    public static native QWebPluginFactory fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebPluginFactory(QPrivateConstructor p) { super(p); } 
}
