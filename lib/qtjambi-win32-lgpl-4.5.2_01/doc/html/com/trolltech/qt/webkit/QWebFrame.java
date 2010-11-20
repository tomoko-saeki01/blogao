package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebFrame class represents a frame in a web page. QWebFrame represents a frame inside a web page. Each {@link com.trolltech.qt.webkit.QWebPage QWebPage} object contains at least one frame, the main frame, obtained using {@link com.trolltech.qt.webkit.QWebPage#mainFrame() QWebPage::mainFrame()}. Additional frames will be created for HTML <tt>&lt;frame&gt;</tt> or <tt>&lt;iframe&gt;</tt> elements. <p>A frame can be loaded using {@link com.trolltech.qt.webkit.QWebFrame#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()} or {@link com.trolltech.qt.webkit.QWebFrame#setUrl(com.trolltech.qt.core.QUrl) setUrl()}. Alternatively, if you have the HTML content readily available, you can use {@link com.trolltech.qt.webkit.QWebFrame#setHtml(java.lang.String) setHtml()} instead. <p>The {@link com.trolltech.qt.webkit.QWebFrame#page() page()} function returns a pointer to the web page object. See {@link com.trolltech.qt.webkit.QWebView Elements of QWebView} for an explanation of how web frames are related to a web page and web view. <p>The title of an HTML frame can be accessed with the {@link com.trolltech.qt.webkit.QWebFrame#title() title()} property. Additionally, a frame may also specify an icon, which can be accessed using the {@link com.trolltech.qt.webkit.QWebFrame#icon() icon()} property. If the title or the icon changes, the corresponding {@link com.trolltech.qt.webkit.QWebFrame#titleChanged titleChanged() } and {@link com.trolltech.qt.webkit.QWebFrame#iconChanged iconChanged() } signals will be emitted. The {@link com.trolltech.qt.webkit.QWebFrame#zoomFactor() zoomFactor()} property can be used to change the overall size of the content displayed in the frame. <p>QWebFrame objects are created and controlled by the web page. You can connect to the web page's {@link com.trolltech.qt.webkit.QWebPage#frameCreated frameCreated() } signal to be notified when a new frame is created. <p>The {@link com.trolltech.qt.webkit.QWebFrame#hitTestContent(com.trolltech.qt.core.QPoint) hitTestContent()} function can be used to programmatically examine the contents of a frame. <p>A QWebFrame can be printed onto a {@link com.trolltech.qt.gui.QPrinter QPrinter} using the {@link com.trolltech.qt.webkit.QWebFrame#print(com.trolltech.qt.gui.QPrinter) print()} function. This function is marked as a slot and can be conveniently connected to {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}'s {@link com.trolltech.qt.gui.QPrintPreviewDialog#paintRequested paintRequested() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage QWebPage}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QWebFrame extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted when the icon ("favicon") associated with the frame has been loaded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#icon() icon()}. <br></DD></DT>
*/

    public final Signal0 iconChanged = new Signal0();

    private final void iconChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_iconChanged(nativeId());
    }
    native void __qt_iconChanged(long __this__nativeId);
/**
 This signal is emitted when the frame is laid out the first time. This is the first time you will see contents displayed on the frame. <p><b>Note:</b> A frame can be laid out multiple times.
*/

    public final Signal0 initialLayoutCompleted = new Signal0();

    private final void initialLayoutCompleted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initialLayoutCompleted(nativeId());
    }
    native void __qt_initialLayoutCompleted(long __this__nativeId);
/**
 This signal is emitted whenever the global window object of the JavaScript environment is cleared, e. ., before starting a new load. <p>If you intend to add QObjects to a QWebFrame using {@link com.trolltech.qt.webkit.QWebFrame#addToJavaScriptWindowObject(java.lang.String, com.trolltech.qt.core.QObject) addToJavaScriptWindowObject()}, you should add them in a slot connected to this signal. This ensures that your objects remain accessible when loading new URLs.
*/

    public final Signal0 javaScriptWindowObjectCleared = new Signal0();

    private final void javaScriptWindowObjectCleared()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_javaScriptWindowObjectCleared(nativeId());
    }
    native void __qt_javaScriptWindowObjectCleared(long __this__nativeId);
/**

*/

    public final Signal0 provisionalLoad = new Signal0();

    private final void provisionalLoad()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_provisionalLoad(nativeId());
    }
    native void __qt_provisionalLoad(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: title)&gt;:<p> This signal is emitted whenever the title of the frame changes. The <tt>title</tt> string specifies the new title. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#title() title()}. <br></DD></DT>
*/

    public final Signal1<java.lang.String> titleChanged = new Signal1<java.lang.String>();

    private final void titleChanged(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_titleChanged_String(nativeId(), title);
    }
    native void __qt_titleChanged_String(long __this__nativeId, java.lang.String title);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: url)&gt;:<p> This signal is emitted with the URL of the frame when the frame's title is received. The new URL is specified by <tt>url</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#url() url()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QUrl> urlChanged = new Signal1<com.trolltech.qt.core.QUrl>();

    private final void urlChanged(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_urlChanged_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    native void __qt_urlChanged_QUrl(long __this__nativeId, long url);

/**
Make <tt>object</tt> available under <tt>name</tt> from within the frame's JavaScript context. The <tt>object</tt> will be inserted as a child of the frame's window object. <p>Qt properties will be exposed as JavaScript properties and slots as JavaScript methods. <p>If you want to ensure that your QObjects remain accessible after loading a new URL, you should add them in a slot connected to the {@link com.trolltech.qt.webkit.QWebFrame#javaScriptWindowObjectCleared javaScriptWindowObjectCleared() } signal.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addToJavaScriptWindowObject(java.lang.String name, com.trolltech.qt.core.QObject object)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addToJavaScriptWindowObject_String_QObject(nativeId(), name, object == null ? 0 : object.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addToJavaScriptWindowObject_String_QObject(long __this__nativeId, java.lang.String name, long object);

/**
Returns a list of all frames that are direct children of this frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#parentFrame() parentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.webkit.QWebFrame> childFrames()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childFrames(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.webkit.QWebFrame> __qt_childFrames(long __this__nativeId);

/**
This property holds the size of the contents in this frame.
*/

    @com.trolltech.qt.QtPropertyReader(name="contentsSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize contentsSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentsSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_contentsSize(long __this__nativeId);

/**
Evaluate JavaScript defined by <tt>scriptSource</tt> using this frame as context. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#addToJavaScriptWindowObject(java.lang.String, com.trolltech.qt.core.QObject) addToJavaScriptWindowObject()}, and {@link com.trolltech.qt.webkit.QWebFrame#javaScriptWindowObjectCleared javaScriptWindowObjectCleared() }. <br></DD></DT>
*/

    public final java.lang.Object evaluateJavaScript(java.lang.String scriptSource)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_evaluateJavaScript_String(nativeId(), scriptSource);
    }
    native java.lang.Object __qt_evaluateJavaScript_String(long __this__nativeId, java.lang.String scriptSource);

/**
The name of this frame as defined by the parent frame.
*/

    @QtBlockedSlot
    public final java.lang.String frameName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_frameName(long __this__nativeId);

/**
Return the geometry of the frame relative to it's parent frame.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect geometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_geometry(long __this__nativeId);

/**
Performs a hit test on the frame contents at the given position <tt>pos</tt> and returns the hit test result.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHitTestResult hitTestContent(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitTestContent_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHitTestResult __qt_hitTestContent_QPoint(long __this__nativeId, long pos);

/**
This property holds the icon associated with this frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#iconChanged iconChanged() }, and {@link com.trolltech.qt.webkit.QWebSettings#iconForUrl(com.trolltech.qt.core.QUrl) QWebSettings::iconForUrl()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="icon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);


/**
Loads a network request, <tt>req</tt>, into this frame. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url.
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.network.QNetworkAccessManager.Operation operation) {
        load(request, operation, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Loads a network request, <tt>req</tt>, into this frame. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url.
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.network.QNetworkRequest request) {
        load(request, com.trolltech.qt.network.QNetworkAccessManager.Operation.GetOperation, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Loads a network request, <tt>req</tt>, into this frame. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url.
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.network.QNetworkAccessManager.Operation operation, com.trolltech.qt.core.QByteArray body)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_load_QNetworkRequest_Operation_QByteArray(nativeId(), request == null ? 0 : request.nativeId(), operation.value(), body == null ? 0 : body.nativeId());
    }
    @QtBlockedSlot
    native void __qt_load_QNetworkRequest_Operation_QByteArray(long __this__nativeId, long request, int operation, long body);

/**
Loads <tt>url</tt> into this frame. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new <tt>url</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#setUrl(com.trolltech.qt.core.QUrl) setUrl()}, {@link com.trolltech.qt.webkit.QWebFrame#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#setContent(com.trolltech.qt.core.QByteArray, java.lang.String) setContent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_load_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native void __qt_load_QUrl(long __this__nativeId, long url);

/**
Returns the meta data in this frame as a QMultiMap The meta data consists of the name and content attributes of the of the <tt>&lt;meta&gt;</tt> tags in the HTML document. <p>For example:<pre>&lt;html&gt;
    &lt;head&gt;
        &lt;meta name="description" content="This document is a tutorial about Qt development"&gt;
        &lt;meta name="keywords" content="Qt, WebKit, Programming"&gt;
    &lt;/head&gt;
    ...
&lt;/html&gt;</pre> Given the above HTML code the {@link com.trolltech.qt.webkit.QWebFrame#metaData() metaData()} function will return a map with two entries: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Key</center></th><th><center> Value</center></th></tr></thead><tr valign="top" class="even"><td> "description"</td><td> "This document is a tutorial about Qt development"</td></tr><tr valign="top" class="odd"><td> "keywords"</td><td> "Qt, WebKit, Programming"</td></tr></table> This function returns a multi map to support multiple meta tags with the same attribute name.
*/

    @QtBlockedSlot
    public final java.util.SortedMap<java.lang.String, java.util.List<java.lang.String>> metaData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaData(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.String, java.util.List<java.lang.String>> __qt_metaData(long __this__nativeId);

/**
The web page that contains this frame.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebPage page()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_page(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebPage __qt_page(long __this__nativeId);

/**
Returns the parent frame of this frame, or 0 if the frame is the web pages main frame. <p>This is equivalent to qobject_cast&lt;QWebFrame*&gt;(frame-&gt;{@link com.trolltech.qt.core.QObject#parent() parent()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#childFrames() childFrames()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebFrame parentFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebFrame __qt_parentFrame(long __this__nativeId);

/**
Returns the position of the frame relative to it's parent frame.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
Prints the frame to the given <tt>printer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#render(com.trolltech.qt.gui.QPainter) render()}. <br></DD></DT>
*/

    public final void print(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_print_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    native void __qt_print_QPrinter(long __this__nativeId, long printer);

/**
Render the frame into <tt>painter</tt>.
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter(nativeId(), painter == null ? 0 : painter.nativeId());
    }
    @QtBlockedSlot
    native void __qt_render_QPainter(long __this__nativeId, long painter);

/**
Render the frame into <tt>painter</tt> clipping to <tt>clip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#print(com.trolltech.qt.gui.QPrinter) print()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QRegion clip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_QRegion(nativeId(), painter == null ? 0 : painter.nativeId(), clip == null ? 0 : clip.nativeId());
    }
    @QtBlockedSlot
    native void __qt_render_QPainter_QRegion(long __this__nativeId, long painter, long clip);

/**
Returns a dump of the rendering tree. This is mainly useful for debugging html.
*/

    @QtBlockedSlot
    public final java.lang.String renderTreeDump()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_renderTreeDump(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_renderTreeDump(long __this__nativeId);

/**
Scrolls the frame <tt>dx</tt> pixels to the right and <tt>dy</tt> pixels downward. Both <tt>dx</tt> and <tt>dy</tt> may be negative. <p><DT><b>See also:</b><br><DD>{@link QWebFrame#scrollPosition() QWebFrame::scrollPosition}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scroll(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scroll_int_int(nativeId(), arg__1, arg__2);
    }
    @QtBlockedSlot
    native void __qt_scroll_int_int(long __this__nativeId, int arg__1, int arg__2);

/**
Returns the maximum value for the scrollbar with orientation <tt>orientation</tt>, or 0 if no scrollbar is found for <tt>orientation</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#scrollBarMinimum(com.trolltech.qt.core.Qt.Orientation) scrollBarMinimum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int scrollBarMaximum(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollBarMaximum_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native int __qt_scrollBarMaximum_Orientation(long __this__nativeId, int orientation);

/**
Returns the minimum value for the scrollbar with orientation <tt>orientation</tt>. <p>The minimum value is always 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#scrollBarMaximum(com.trolltech.qt.core.Qt.Orientation) scrollBarMaximum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int scrollBarMinimum(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollBarMinimum_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native int __qt_scrollBarMinimum_Orientation(long __this__nativeId, int orientation);

/**
Returns the scrollbar policy for the scrollbar defined by <tt>orientation</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#setScrollBarPolicy(com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.core.Qt.ScrollBarPolicy) setScrollBarPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ScrollBarPolicy scrollBarPolicy(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ScrollBarPolicy.resolve(__qt_scrollBarPolicy_Orientation(nativeId(), orientation.value()));
    }
    @QtBlockedSlot
    native int __qt_scrollBarPolicy_Orientation(long __this__nativeId, int orientation);

/**
Returns the current value for the scrollbar with orientation <tt>orientation</tt>, or 0 if no scrollbar is found for <tt>orientation</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#setScrollBarValue(com.trolltech.qt.core.Qt.Orientation, int) setScrollBarValue()}, {@link com.trolltech.qt.webkit.QWebFrame#scrollBarMinimum(com.trolltech.qt.core.Qt.Orientation) scrollBarMinimum()}, and {@link com.trolltech.qt.webkit.QWebFrame#scrollBarMaximum(com.trolltech.qt.core.Qt.Orientation) scrollBarMaximum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int scrollBarValue(com.trolltech.qt.core.Qt.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollBarValue_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native int __qt_scrollBarValue_Orientation(long __this__nativeId, int orientation);

/**
This property holds the position the frame is currently scrolled to.
*/

    @com.trolltech.qt.QtPropertyReader(name="scrollPosition")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint scrollPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scrollPosition(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_scrollPosition(long __this__nativeId);


/**
Sets the content of this frame to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContent(com.trolltech.qt.core.QByteArray data, java.lang.String mimeType) {
        setContent(data, mimeType, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }

/**
Sets the content of this frame to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContent(com.trolltech.qt.core.QByteArray data) {
        setContent(data, (java.lang.String)null, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets the content of this frame to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContent(com.trolltech.qt.core.QByteArray data, java.lang.String mimeType, com.trolltech.qt.core.QUrl baseUrl)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContent_QByteArray_String_QUrl(nativeId(), data == null ? 0 : data.nativeId(), mimeType, baseUrl == null ? 0 : baseUrl.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setContent_QByteArray_String_QUrl(long __this__nativeId, long data, java.lang.String mimeType, long baseUrl);


/**
Sets the content of this frame to <tt>html</tt>. <tt>baseUrl</tt> is optional and used to resolve relative URLs in the document, such as referenced images or stylesheets. <p>When using this method WebKit assumes that external resources such as JavaScript programs or style sheets are encoded in UTF-8 unless otherwise specified. For example, the encoding of an external script can be specified through the charset attribute of the HTML script tag. It is also possible for the encoding to be specified by web server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHtml(java.lang.String html) {
        setHtml(html, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets the content of this frame to <tt>html</tt>. <tt>baseUrl</tt> is optional and used to resolve relative URLs in the document, such as referenced images or stylesheets. <p>When using this method WebKit assumes that external resources such as JavaScript programs or style sheets are encoded in UTF-8 unless otherwise specified. For example, the encoding of an external script can be specified through the charset attribute of the HTML script tag. It is also possible for the encoding to be specified by web server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHtml(java.lang.String html, com.trolltech.qt.core.QUrl baseUrl)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHtml_String_QUrl(nativeId(), html, baseUrl == null ? 0 : baseUrl.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHtml_String_QUrl(long __this__nativeId, java.lang.String html, long baseUrl);

/**
Sets the scrollbar policy for the scrollbar defined by <tt>orientation</tt> to <tt>policy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#scrollBarPolicy(com.trolltech.qt.core.Qt.Orientation) scrollBarPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScrollBarPolicy(com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.core.Qt.ScrollBarPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScrollBarPolicy_Orientation_ScrollBarPolicy(nativeId(), orientation.value(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setScrollBarPolicy_Orientation_ScrollBarPolicy(long __this__nativeId, int orientation, int policy);

/**
Sets the current <tt>value</tt> for the scrollbar with orientation <tt>orientation</tt>. <p>The scrollbar forces the <tt>value</tt> to be within the legal range: minimum &lt;= value &lt;= maximum. <p>Changing the value also updates the thumb position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#scrollBarValue(com.trolltech.qt.core.Qt.Orientation) scrollBarValue()}, {@link com.trolltech.qt.webkit.QWebFrame#scrollBarMinimum(com.trolltech.qt.core.Qt.Orientation) scrollBarMinimum()}, and {@link com.trolltech.qt.webkit.QWebFrame#scrollBarMaximum(com.trolltech.qt.core.Qt.Orientation) scrollBarMaximum()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScrollBarValue(com.trolltech.qt.core.Qt.Orientation orientation, int value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScrollBarValue_Orientation_int(nativeId(), orientation.value(), value);
    }
    @QtBlockedSlot
    native void __qt_setScrollBarValue_Orientation_int(long __this__nativeId, int orientation, int value);

/**
This property holds the position the frame is currently scrolled to.
*/

    @com.trolltech.qt.QtPropertyWriter(name="scrollPosition")
    @QtBlockedSlot
    public final void setScrollPosition(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScrollPosition_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScrollPosition_QPoint(long __this__nativeId, long pos);

/**
Sets the value of the multiplier used to scale the text in a Web frame to the <tt>factor</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#textSizeMultiplier() textSizeMultiplier()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textSizeMultiplier")
    @QtBlockedSlot
    public final void setTextSizeMultiplier(double factor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextSizeMultiplier_double(nativeId(), factor);
    }
    @QtBlockedSlot
    native void __qt_setTextSizeMultiplier_double(long __this__nativeId, double factor);

/**
This property holds the url of the frame currently viewed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#urlChanged urlChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="url")
    @QtBlockedSlot
    public final void setUrl(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrl_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUrl_QUrl(long __this__nativeId, long url);

/**
This property holds the zoom factor for the frame.
*/

    @com.trolltech.qt.QtPropertyWriter(name="zoomFactor")
    @QtBlockedSlot
    public final void setZoomFactor(double factor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setZoomFactor_double(nativeId(), factor);
    }
    @QtBlockedSlot
    native void __qt_setZoomFactor_double(long __this__nativeId, double factor);

/**
Returns the value of the multiplier used to scale the text in a Web frame. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#setTextSizeMultiplier(double) setTextSizeMultiplier()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textSizeMultiplier")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final double textSizeMultiplier()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textSizeMultiplier(nativeId());
    }
    @QtBlockedSlot
    native double __qt_textSizeMultiplier(long __this__nativeId);

/**
This property holds the title of the frame as defined by the HTML &lt;title&gt; element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#titleChanged titleChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="title")
    @QtBlockedSlot
    public final java.lang.String title()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
Returns the frame's content, converted to HTML. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#toPlainText() toPlainText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toHtml()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHtml(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toHtml(long __this__nativeId);

/**
Returns the content of this frame converted to plain text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#toHtml() toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toPlainText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPlainText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toPlainText(long __this__nativeId);

/**
This property holds the url of the frame currently viewed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#urlChanged urlChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="url")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl url()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_url(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_url(long __this__nativeId);

/**
This property holds the zoom factor for the frame.
*/

    @com.trolltech.qt.QtPropertyReader(name="zoomFactor")
    @QtBlockedSlot
    public final double zoomFactor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_zoomFactor(nativeId());
    }
    @QtBlockedSlot
    native double __qt_zoomFactor(long __this__nativeId);

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
@exclude
*/

    public static native QWebFrame fromNativePointer(QNativePointer nativePointer);

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

    protected QWebFrame(QPrivateConstructor p) { super(p); } 
}
