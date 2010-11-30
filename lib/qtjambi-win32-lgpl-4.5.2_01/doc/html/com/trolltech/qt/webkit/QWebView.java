package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebView class provides a widget that is used to view and edit web documents. QWebView is the main widget component of the {@link <a href="../qtwebkit.html">QtWebKit</a>} web browsing module. It can be used in various applications to display web content live from the Internet. <p>The image below shows QWebView previewed in Qt Designer with the Trolltech website. <br><center><img src="../images/qwebview-url.png"></center><br> A web site can be loaded onto QWebView with the {@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()} function. Like all Qt Widgets, the {@link com.trolltech.qt.gui.QWidget#show() show()} function must be invoked in order to display QWebView. The snippet below illustrates this: <pre class="snippet">
        QWebView view = new QWebView(parent);
        view.load(new QUrl("http://www.trolltech.com/"));
        view.show();
</pre> Alternatively, {@link com.trolltech.qt.webkit.QWebView#setUrl(com.trolltech.qt.core.QUrl) setUrl()} can also be used to load a web site. If you have the HTML content readily available, you can use {@link com.trolltech.qt.webkit.QWebView#setHtml(java.lang.String) setHtml()} instead. <p>The {@link com.trolltech.qt.webkit.QWebView#loadStarted loadStarted() } signal is emitted when the view begins loading. The {@link com.trolltech.qt.webkit.QWebView#loadProgress loadProgress() } signal, on the other hand, is emitted whenever an element of the web view completes loading, such as an embedded image, a script, etc. Finally, the {@link com.trolltech.qt.webkit.QWebView#loadFinished loadFinished() } signal is emitted when the view has loaded completely. It's argument - either <tt>true</tt> or <tt>false</tt> - indicates load success or failure. <p>The {@link com.trolltech.qt.webkit.QWebView#page() page()} function returns a pointer to the web page object. See Elements of QWebView for an explanation of how the web page is related to the view. To modify your web view's settings, you can access the {@link com.trolltech.qt.webkit.QWebSettings QWebSettings} object with the {@link com.trolltech.qt.webkit.QWebView#settings() settings()} function. With {@link com.trolltech.qt.webkit.QWebSettings QWebSettings}, you can change the default fonts, enable or disable features such as JavaScript and plugins. <p>The title of an HTML document can be accessed with the {@link com.trolltech.qt.webkit.QWebView#title() title()} property. Additionally, a web site may also specify an icon, which can be accessed using the {@link com.trolltech.qt.webkit.QWebView#icon() icon()} property. If the title or the icon changes, the corresponding {@link com.trolltech.qt.webkit.QWebView#titleChanged titleChanged() } and {@link com.trolltech.qt.webkit.QWebView#iconChanged iconChanged() } signals will be emitted. The {@link com.trolltech.qt.webkit.QWebView#textSizeMultiplier() textSizeMultiplier()} property can be used to change the overall size of the text displayed in the web view. <p>If you require a custom context menu, you can implement it by reimplementing {@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) contextMenuEvent()} and populating your {@link com.trolltech.qt.gui.QMenu QMenu} with the actions obtained from {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. More functionality such as reloading the view, copying selected text to the clipboard, or pasting into the view, is also encapsulated within the {@link com.trolltech.qt.gui.QAction QAction} objects returned by {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. These actions can be programmatically triggered using {@link com.trolltech.qt.webkit.QWebView#triggerPageAction(com.trolltech.qt.webkit.QWebPage.WebAction) triggerPageAction()}. Alternatively, the actions can be added to a toolbar or a menu directly. QWebView maintains the state of the returned actions but allows modification of action properties such as {@link QAction#text() text} or {@link QAction#icon() icon}. <p>A QWebView can be printed onto a {@link com.trolltech.qt.gui.QPrinter QPrinter} using the {@link com.trolltech.qt.webkit.QWebView#print(com.trolltech.qt.gui.QPrinter) print()} function. This function is marked as a slot and can be conveniently connected to {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}'s {@link com.trolltech.qt.gui.QPrintPreviewDialog#paintRequested paintRequested() } signal. <p>If you want to provide support for web sites that allow the user to open new windows, such as pop-up windows, you can subclass QWebView and reimplement the {@link com.trolltech.qt.webkit.QWebView#createWindow(com.trolltech.qt.webkit.QWebPage.WebWindowType) createWindow()} function.<a name="elements-of-qwebview"><h2>Elements of QWebView</h2> QWebView consists of other objects such as {@link com.trolltech.qt.webkit.QWebFrame QWebFrame} and {@link com.trolltech.qt.webkit.QWebPage QWebPage}. The flowchart below shows these elements are related. <br><center><img src="../images/qwebview-diagram.png"></center><br> <b>Note:</b> It is possible to use {@link com.trolltech.qt.webkit.QWebPage QWebPage} and {@link com.trolltech.qt.webkit.QWebFrame QWebFrame}, without using QWebView, if you do not require {@link com.trolltech.qt.gui.QWidget QWidget} attributes. Nevertheless, {@link <a href="../qtwebkit.html">QtWebKit</a>} depends on {@link <a href="../qtgui.html">QtGui</a>}, so you should use a {@link com.trolltech.qt.gui.QApplication QApplication} instead of {@link com.trolltech.qt.core.QCoreApplication QCoreApplication}. <p><DT><b>See also:</b><br><DD>{@link <a href="../webkit-previewer.html">Previewer Example</a>}, and {@link <a href="../qtwebkit.html">Browser</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWebView extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted whenever the icon of the page is loaded or changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#icon() icon()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: url)&gt;:<p> This signal is emitted whenever the user clicks on a link and the page's linkDelegationPolicy property is set to delegate the link handling for the specified <tt>url</tt>. <p><DT><b>See also:</b><br><DD>{@link QWebPage#linkDelegationPolicy() QWebPage::linkDelegationPolicy()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QUrl> linkClicked = new Signal1<com.trolltech.qt.core.QUrl>();

    private final void linkClicked(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_linkClicked_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    native void __qt_linkClicked_QUrl(long __this__nativeId, long url);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: ok)&gt;:<p> This signal is emitted when a load of the page is finished. <tt>ok</tt> will indicate whether the load was successful or any error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#loadStarted loadStarted() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> loadFinished = new Signal1<java.lang.Boolean>();

    private final void loadFinished(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_loadFinished_boolean(nativeId(), arg__1);
    }
    native void __qt_loadFinished_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: progress)&gt;:<p> This signal is emitted every time an element in the web page completes loading and the overall loading progress advances. <p>This signal tracks the progress of all child frames. <p>The current value is provided by <tt>progress</tt> and scales from 0 to 100, which is the default range of {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#loadStarted loadStarted() }, and {@link com.trolltech.qt.webkit.QWebView#loadFinished loadFinished() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> loadProgress = new Signal1<java.lang.Integer>();

    private final void loadProgress(int progress)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_loadProgress_int(nativeId(), progress);
    }
    native void __qt_loadProgress_int(long __this__nativeId, int progress);
/**
 This signal is emitted when a new load of the page is started. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#loadProgress loadProgress() }, and {@link com.trolltech.qt.webkit.QWebView#loadFinished loadFinished() }. <br></DD></DT>
*/

    public final Signal0 loadStarted = new Signal0();

    private final void loadStarted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_loadStarted(nativeId());
    }
    native void __qt_loadStarted(long __this__nativeId);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#selectedText() selectedText()}. <br></DD></DT>
*/

    public final Signal0 selectionChanged = new Signal0();

    private final void selectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged(nativeId());
    }
    native void __qt_selectionChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted when the statusbar <tt>text</tt> is changed by the page.
*/

    public final Signal1<java.lang.String> statusBarMessage = new Signal1<java.lang.String>();

    private final void statusBarMessage(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_statusBarMessage_String(nativeId(), text);
    }
    native void __qt_statusBarMessage_String(long __this__nativeId, java.lang.String text);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: title)&gt;:<p> This signal is emitted whenever the <tt>title</tt> of the main frame changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#title() title()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: url)&gt;:<p> This signal is emitted when the <tt>url</tt> of the view changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#url() url()}, and {@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}. <br></DD></DT>
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
Constructs an empty QWebView with parent <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}. <br></DD></DT>
*/

    public QWebView() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty QWebView with parent <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}. <br></DD></DT>
*/

    public QWebView(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QWebView_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWebView_QWidget(long parent);

/**
Convenience slot that loads the previous document in the list of documents built by navigating links. Does nothing if there is no previous document. <p>It is equivalent to <pre class="snippet">
    view.page().triggerAction(QWebPage.WebAction.GoBack);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#forward() forward()}, and {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. <br></DD></DT>
*/

    public final void back()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_back(nativeId());
    }
    native void __qt_back(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final boolean findText(java.lang.String subString, com.trolltech.qt.webkit.QWebPage.FindFlag ... options) {
        return this.findText(subString, new com.trolltech.qt.webkit.QWebPage.FindFlags(options));
    }

/**
Finds the next occurrence of the string, <tt>subString</tt>, in the page, using the given <tt>options</tt>. Returns true of <tt>subString</tt> was found and selects the match visually; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#selectedText() selectedText()}, and {@link com.trolltech.qt.webkit.QWebView#selectionChanged selectionChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean findText(java.lang.String subString) {
        return findText(subString, new com.trolltech.qt.webkit.QWebPage.FindFlags(0));
    }
/**
Finds the next occurrence of the string, <tt>subString</tt>, in the page, using the given <tt>options</tt>. Returns true of <tt>subString</tt> was found and selects the match visually; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#selectedText() selectedText()}, and {@link com.trolltech.qt.webkit.QWebView#selectionChanged selectionChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean findText(java.lang.String subString, com.trolltech.qt.webkit.QWebPage.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findText_String_FindFlags(nativeId(), subString, options.value());
    }
    @QtBlockedSlot
    native boolean __qt_findText_String_FindFlags(long __this__nativeId, java.lang.String subString, int options);

/**
Convenience slot that loads the next document in the list of documents built by navigating links. Does nothing if there is no next document. <p>It is equivalent to <pre class="snippet">
    view.page().triggerAction(QWebPage.WebAction.GoForward);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#back() back()}, and {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. <br></DD></DT>
*/

    public final void forward()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_forward(nativeId());
    }
    native void __qt_forward(long __this__nativeId);

/**
Returns a pointer to the view's history of navigated web pages. <p>It is equivalent to <pre class="snippet">
    view.page().history();
</pre>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHistory history()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_history(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHistory __qt_history(long __this__nativeId);

/**
This property holds the icon associated with the web page currently viewed. By default, this property contains a null icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#iconChanged iconChanged() }, and {@link com.trolltech.qt.webkit.QWebSettings#iconForUrl(com.trolltech.qt.core.QUrl) QWebSettings::iconForUrl()}. <br></DD></DT>
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
This property holds whether the document was modified by the user. Parts of HTML documents can be editable for example through the <tt>contenteditable</tt> attribute on HTML elements. <p>By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="modified")
    @QtBlockedSlot
    public final boolean isModified()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isModified(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isModified(long __this__nativeId);


/**
Loads a network request, <tt>request</tt>, using the method specified in <tt>operation</tt>. <p><tt>body</tt> is optional and is only used for POST operations. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#url() url()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.network.QNetworkAccessManager.Operation operation) {
        load(request, operation, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }

/**
Loads a network request, <tt>request</tt>, using the method specified in <tt>operation</tt>. <p><tt>body</tt> is optional and is only used for POST operations. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#url() url()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void load(com.trolltech.qt.network.QNetworkRequest request) {
        load(request, com.trolltech.qt.network.QNetworkAccessManager.Operation.GetOperation, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Loads a network request, <tt>request</tt>, using the method specified in <tt>operation</tt>. <p><tt>body</tt> is optional and is only used for POST operations. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new url. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#url() url()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
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
Loads the specified <tt>url</tt> and displays it. <p><b>Note:</b> The view remains the same until enough data has arrived to display the new <tt>url</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#setUrl(com.trolltech.qt.core.QUrl) setUrl()}, {@link com.trolltech.qt.webkit.QWebView#url() url()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
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
Returns a pointer to the underlying web page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#setPage(com.trolltech.qt.webkit.QWebPage) setPage()}. <br></DD></DT>
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
Returns a pointer to a {@link com.trolltech.qt.gui.QAction QAction} that encapsulates the specified web action <tt>action</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction pageAction(com.trolltech.qt.webkit.QWebPage.WebAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageAction_WebAction(nativeId(), action.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_pageAction_WebAction(long __this__nativeId, int action);

/**
Prints the main frame to the given <tt>printer</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#print(com.trolltech.qt.gui.QPrinter) QWebFrame::print()}, and {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}. <br></DD></DT>
*/

    public final void print(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_print_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    native void __qt_print_QPrinter(long __this__nativeId, long printer);

/**
Reloads the current document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#stop() stop()}, {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}, and {@link com.trolltech.qt.webkit.QWebView#loadStarted loadStarted() }. <br></DD></DT>
*/

    public final void reload()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reload(nativeId());
    }
    native void __qt_reload(long __this__nativeId);

/**
This property holds the text currently selected. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#findText(java.lang.String, com.trolltech.qt.webkit.QWebPage.FindFlag[]) findText()}, and {@link com.trolltech.qt.webkit.QWebView#selectionChanged selectionChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectedText")
    @QtBlockedSlot
    public final java.lang.String selectedText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectedText(long __this__nativeId);


/**
Sets the content of the web view to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, {@link com.trolltech.qt.webkit.QWebView#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContent(com.trolltech.qt.core.QByteArray data, java.lang.String mimeType) {
        setContent(data, mimeType, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }

/**
Sets the content of the web view to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, {@link com.trolltech.qt.webkit.QWebView#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContent(com.trolltech.qt.core.QByteArray data) {
        setContent(data, (java.lang.String)null, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets the content of the web view to the specified content <tt>data</tt>. If the <tt>mimeType</tt> argument is empty it is currently assumed that the content is HTML but in future versions we may introduce auto-detection. <p>External objects referenced in the content are located relative to <tt>baseUrl</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, {@link com.trolltech.qt.webkit.QWebView#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}. <br></DD></DT>
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
Sets the content of the web view to the specified <tt>html</tt>. <p>External objects such as stylesheets or images referenced in the HTML document are located relative to <tt>baseUrl</tt>. <p>When using this method, WebKit assumes that external resources such as JavaScript programs or style sheets are encoded in UTF-8 unless otherwise specified. For example, the encoding of an external script can be specified through the charset attribute of the HTML script tag. Alternatively, the encoding can also be specified by the web server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, {@link com.trolltech.qt.webkit.QWebView#setContent(com.trolltech.qt.core.QByteArray, java.lang.String) setContent()}, and {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHtml(java.lang.String html) {
        setHtml(html, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets the content of the web view to the specified <tt>html</tt>. <p>External objects such as stylesheets or images referenced in the HTML document are located relative to <tt>baseUrl</tt>. <p>When using this method, WebKit assumes that external resources such as JavaScript programs or style sheets are encoded in UTF-8 unless otherwise specified. For example, the encoding of an external script can be specified through the charset attribute of the HTML script tag. Alternatively, the encoding can also be specified by the web server. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, {@link com.trolltech.qt.webkit.QWebView#setContent(com.trolltech.qt.core.QByteArray, java.lang.String) setContent()}, and {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}. <br></DD></DT>
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
Makes <tt>page</tt> the new web page of the web view. <p>The parent {@link com.trolltech.qt.core.QObject QObject} of the provided page remains the owner of the object. If the current document is a child of the web view, it will be deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#page() page()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPage(com.trolltech.qt.webkit.QWebPage page)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (page != null) {
            page.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPage_QWebPage(nativeId(), page == null ? 0 : page.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPage_QWebPage(long __this__nativeId, long page);

/**
Sets the value of the multiplier used to scale the text in a Web page to the <tt>factor</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#textSizeMultiplier() textSizeMultiplier()}. <br></DD></DT>
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
This property holds the url of the web page currently viewed. Setting this property clears the view and loads the URL. <p>By default, this property contains an empty, invalid URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
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
This property holds the zoom factor for the view.
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
Returns a pointer to the view/page specific settings object. <p>It is equivalent to <pre class="snippet">
    view.page().settings();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#globalSettings() QWebSettings::globalSettings()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebSettings settings()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_settings(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebSettings __qt_settings(long __this__nativeId);

/**
Convenience slot that stops loading the document. <p>It is equivalent to <pre class="snippet">
    view.page().triggerAction(QWebPage.WebAction.Stop);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#reload() reload()}, {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}, and {@link com.trolltech.qt.webkit.QWebView#loadFinished loadFinished() }. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Returns the value of the multiplier used to scale the text in a Web page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#setTextSizeMultiplier(double) setTextSizeMultiplier()}. <br></DD></DT>
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
This property holds the title of the web page currently viewed. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#titleChanged titleChanged() }. <br></DD></DT>
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
Triggers the specified <tt>action</tt>. If it is a checkable action the specified <tt>checked</tt> state is assumed. <p>The following example triggers the copy action and therefore copies any selected text to the clipboard. <pre class="snippet">
    view.triggerAction(QWebPage.WebAction.Copy);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void triggerPageAction(com.trolltech.qt.webkit.QWebPage.WebAction action) {
        triggerPageAction(action, (boolean)false);
    }
/**
Triggers the specified <tt>action</tt>. If it is a checkable action the specified <tt>checked</tt> state is assumed. <p>The following example triggers the copy action and therefore copies any selected text to the clipboard. <pre class="snippet">
    view.triggerAction(QWebPage.WebAction.Copy);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void triggerPageAction(com.trolltech.qt.webkit.QWebPage.WebAction action, boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggerPageAction_WebAction_boolean(nativeId(), action.value(), checked);
    }
    @QtBlockedSlot
    native void __qt_triggerPageAction_WebAction_boolean(long __this__nativeId, int action, boolean checked);

/**
This property holds the url of the web page currently viewed. Setting this property clears the view and loads the URL. <p>By default, this property contains an empty, invalid URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebView#load(com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.network.QNetworkAccessManager.Operation) load()}, and {@link com.trolltech.qt.webkit.QWebView#urlChanged urlChanged() }. <br></DD></DT>
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
This property holds the zoom factor for the view.
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
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

/**
This function is called whenever WebKit wants to create a new window of the given <tt>type</tt>, for example as a result of a JavaScript request to open a document in a new window. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#createWindow(com.trolltech.qt.webkit.QWebPage.WebWindowType) QWebPage::createWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.webkit.QWebView createWindow(com.trolltech.qt.webkit.QWebPage.WebWindowType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createWindow_WebWindowType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebView __qt_createWindow_WebWindowType(long __this__nativeId, int type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long arg__1);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), property.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int property);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long ev);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QWebView fromNativePointer(QNativePointer nativePointer);

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

    protected QWebView(QPrivateConstructor p) { super(p); } 
}
