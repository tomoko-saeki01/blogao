package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextBrowser class provides a rich text browser with hypertext navigation. This class extends {@link com.trolltech.qt.gui.QTextEdit QTextEdit} (in read-only mode), adding some navigation functionality so that users can follow links in hypertext documents. <p>If you want to provide your users with an editable rich text editor, use {@link com.trolltech.qt.gui.QTextEdit QTextEdit}. If you want a text browser without hypertext navigation use {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, and use {@link QTextEdit#setReadOnly(boolean) QTextEdit::setReadOnly()} to disable editing. If you just need to display a small piece of rich text use {@link com.trolltech.qt.gui.QLabel QLabel}.<a name="document-source-and-contents"><h2>Document Source and Contents</h2> The contents of {@link com.trolltech.qt.gui.QTextEdit QTextEdit} are set with setHtml() or setPlainText(), but QTextBrowser also implements the {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()} function, making it possible to use a named document as the source text. The name is looked up in a list of search paths and in the directory of the current document factory. <p>If a document name ends with an anchor (for example, "<tt>#anchor"</tt>), the text browser automatically scrolls to that position (using {@link com.trolltech.qt.gui.QTextEdit#scrollToAnchor(java.lang.String) scrollToAnchor()}). When the user clicks on a hyperlink, the browser will call {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()} itself with the link's <tt>href</tt> value as argument. You can track the current source by connecting to the {@link com.trolltech.qt.gui.QTextBrowser#sourceChanged sourceChanged() } signal.<a name="navigation"><h2>Navigation</h2> QTextBrowser provides {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()} and {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()} slots which you can use to implement Back and Forward buttons. The {@link com.trolltech.qt.gui.QTextBrowser#home() home()} slot sets the text to the very first document displayed. The {@link com.trolltech.qt.gui.QTextBrowser#anchorClicked anchorClicked() } signal is emitted when the user clicks an anchor. To override the default navigation behavior of the browser, call the {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()} function to supply new document text in a slot connected to this signal. <p>If you want to load documents stored in the Qt resource system use <tt>qrc</tt> as the scheme in the URL to load. For example, for the document resource path <tt>:/docs/index.html</tt> use <tt>qrc:/docs/index.html</tt> as the URL with {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit QTextEdit}, and {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextBrowser extends com.trolltech.qt.gui.QTextEdit
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: link)&gt;:<p> This signal is emitted when the user clicks an anchor. The URL referred to by the anchor is passed in <tt>link</tt>. <p>Note that the browser will automatically handle navigation to the location specified by <tt>link</tt> unless the {@link QTextBrowser#openLinks() openLinks} property is set to false or you call {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()} in a slot connected. This mechanism is used to override the default navigation features of the browser.
*/

    public final Signal1<com.trolltech.qt.core.QUrl> anchorClicked = new Signal1<com.trolltech.qt.core.QUrl>();

    private final void anchorClicked(com.trolltech.qt.core.QUrl arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_anchorClicked_QUrl(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_anchorClicked_QUrl(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted when the availability of {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()} changes. <tt>available</tt> is false when the user is at {@link com.trolltech.qt.gui.QTextBrowser#home() home()}; otherwise it is true.
*/

    public final Signal1<java.lang.Boolean> backwardAvailable = new Signal1<java.lang.Boolean>();

    private final void backwardAvailable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_backwardAvailable_boolean(nativeId(), arg__1);
    }
    native void __qt_backwardAvailable_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted when the availability of {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()} changes. <tt>available</tt> is true after the user navigates {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()} and false when the user navigates or goes {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}.
*/

    public final Signal1<java.lang.Boolean> forwardAvailable = new Signal1<java.lang.Boolean>();

    private final void forwardAvailable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_forwardAvailable_boolean(nativeId(), arg__1);
    }
    native void __qt_forwardAvailable_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: link)&gt;:<p> This signal is emitted when the user has selected but not activated an anchor in the document. The URL referred to by the anchor is passed in <tt>link</tt>.
*/

    public final Signal1<java.lang.String> highlightedString = new Signal1<java.lang.String>();

    private final void highlightedString(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlightedString_String(nativeId(), arg__1);
    }
    native void __qt_highlightedString_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: link)&gt;:<p> This signal is emitted when the user has selected but not activated an anchor in the document. The URL referred to by the anchor is passed in <tt>link</tt>.
*/

    public final Signal1<com.trolltech.qt.core.QUrl> highlighted = new Signal1<com.trolltech.qt.core.QUrl>();

    private final void highlighted(com.trolltech.qt.core.QUrl arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlighted_QUrl(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_highlighted_QUrl(long __this__nativeId, long arg__1);
/**
 This signal is emitted when the history changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#historyTitle(int) historyTitle()}, and {@link com.trolltech.qt.gui.QTextBrowser#historyUrl(int) historyUrl()}. <br></DD></DT>
*/

    public final Signal0 historyChanged = new Signal0();

    private final void historyChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_historyChanged(nativeId());
    }
    native void __qt_historyChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: src)&gt;:<p> This signal is emitted when the source has changed, <tt>src</tt> being the new source. <p>Source changes happen both programmatically when calling {@link com.trolltech.qt.gui.QTextBrowser#setSource(com.trolltech.qt.core.QUrl) setSource()}, {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}, backword() or {@link com.trolltech.qt.gui.QTextBrowser#home() home()} or when the user clicks on links or presses the equivalent key sequences.
*/

    public final Signal1<com.trolltech.qt.core.QUrl> sourceChanged = new Signal1<com.trolltech.qt.core.QUrl>();

    private final void sourceChanged(com.trolltech.qt.core.QUrl arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sourceChanged_QUrl(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_sourceChanged_QUrl(long __this__nativeId, long arg__1);


/**
Constructs an empty QTextBrowser with parent <tt>parent</tt>.
*/

    public QTextBrowser() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty QTextBrowser with parent <tt>parent</tt>.
*/

    public QTextBrowser(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTextBrowser_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextBrowser_QWidget(long parent);

/**
Returns the number of locations backward in the history.
*/

    @QtBlockedSlot
    public final int backwardHistoryCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backwardHistoryCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_backwardHistoryCount(long __this__nativeId);

/**
Clears the history of visited documents and disables the forward and backward navigation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#backward() backward()}, and {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearHistory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearHistory(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearHistory(long __this__nativeId);

/**
Returns the number of locations forward in the history.
*/

    @QtBlockedSlot
    public final int forwardHistoryCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_forwardHistoryCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_forwardHistoryCount(long __this__nativeId);

/**
Returns the documentTitle() of the HistoryItem. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Input</center></th><th><center> Return</center></th></tr></thead><tr valign="top" class="even"><td> <tt>i</tt> &lt; 0</td><td> {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()} history</td></tr><tr valign="top" class="odd"><td> <tt>i</tt> == 0</td><td> current, see {@link QTextBrowser#source() QTextBrowser::source()}</td></tr><tr valign="top" class="even"><td> <tt>i</tt> &gt; 0</td><td> {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()} history</td></tr></table> <pre class="snippet">
    backaction.setToolTip(browser.historyTitle(-1));
    forwardaction.setToolTip(browser.historyTitle(+1));
</pre>
*/

    @QtBlockedSlot
    public final java.lang.String historyTitle(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_historyTitle_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_historyTitle_int(long __this__nativeId, int arg__1);

/**
Returns the url of the HistoryItem. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Input</center></th><th><center> Return</center></th></tr></thead><tr valign="top" class="even"><td> <tt>i</tt> &lt; 0</td><td> {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()} history</td></tr><tr valign="top" class="odd"><td> <tt>i</tt> == 0</td><td> current, see {@link QTextBrowser#source() QTextBrowser::source()}</td></tr><tr valign="top" class="even"><td> <tt>i</tt> &gt; 0</td><td> {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()} history</td></tr></table>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl historyUrl(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_historyUrl_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_historyUrl_int(long __this__nativeId, int arg__1);

/**
Returns true if the text browser can go backward in the document history using {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#backwardAvailable backwardAvailable() }, and {@link com.trolltech.qt.gui.QTextBrowser#backward() backward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isBackwardAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBackwardAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isBackwardAvailable(long __this__nativeId);

/**
Returns true if the text browser can go forward in the document history using {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#forwardAvailable forwardAvailable() }, and {@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isForwardAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isForwardAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isForwardAvailable(long __this__nativeId);

/**
Specifies whether QTextBrowser should automatically open links to external sources using {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()} instead of emitting the anchorClicked signal. Links are considered external if their scheme is neither file or qrc. <p>The default value is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="openExternalLinks")
    @QtBlockedSlot
    public final boolean openExternalLinks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_openExternalLinks(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_openExternalLinks(long __this__nativeId);

/**
This property specifies whether QTextBrowser should automatically open links the user tries to activate by mouse or keyboard. <p>Regardless of the value of this property the anchorClicked signal is always emitted. <p>The default value is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="openLinks")
    @QtBlockedSlot
    public final boolean openLinks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_openLinks(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_openLinks(long __this__nativeId);

/**
This property holds the search paths used by the text browser to find supporting content. QTextBrowser uses this list to locate images and documents. <p>By default, this property contains an empty string list.
*/

    @com.trolltech.qt.QtPropertyReader(name="searchPaths")
    @QtBlockedSlot
    public final java.util.List<java.lang.String> searchPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_searchPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_searchPaths(long __this__nativeId);

/**
Specifies whether QTextBrowser should automatically open links to external sources using {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()} instead of emitting the anchorClicked signal. Links are considered external if their scheme is neither file or qrc. <p>The default value is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="openExternalLinks")
    @QtBlockedSlot
    public final void setOpenExternalLinks(boolean open)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpenExternalLinks_boolean(nativeId(), open);
    }
    @QtBlockedSlot
    native void __qt_setOpenExternalLinks_boolean(long __this__nativeId, boolean open);

/**
This property specifies whether QTextBrowser should automatically open links the user tries to activate by mouse or keyboard. <p>Regardless of the value of this property the anchorClicked signal is always emitted. <p>The default value is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="openLinks")
    @QtBlockedSlot
    public final void setOpenLinks(boolean open)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpenLinks_boolean(nativeId(), open);
    }
    @QtBlockedSlot
    native void __qt_setOpenLinks_boolean(long __this__nativeId, boolean open);

/**
This property holds the search paths used by the text browser to find supporting content. QTextBrowser uses this list to locate images and documents. <p>By default, this property contains an empty string list.
*/

    @com.trolltech.qt.QtPropertyWriter(name="searchPaths")
    @QtBlockedSlot
    public final void setSearchPaths(java.util.List<java.lang.String> paths)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSearchPaths_List(nativeId(), paths);
    }
    @QtBlockedSlot
    native void __qt_setSearchPaths_List(long __this__nativeId, java.util.List<java.lang.String> paths);

/**
This property holds the name of the displayed document.  This is a an invalid url if no document is displayed or if the source is unknown. <p>When setting this property QTextBrowser tries to find a document with the specified name in the paths of the {@link QTextBrowser#searchPaths() searchPaths} property and directory of the current source, unless the value is an absolute file path. It also checks for optional anchors and scrolls the document accordingly <p>If the first tag in the document is <tt>&lt;qt type=detail&gt;</tt>, the document is displayed as a popup rather than as new document in the browser window itself. Otherwise, the document is displayed normally in the text browser with the text set to the contents of the named document with setHtml(). <p>By default, this property contains an empty URL.
*/

    @com.trolltech.qt.QtPropertyReader(name="source")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl source()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_source(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_source(long __this__nativeId);

/**
Changes the document displayed to the previous document in the list of documents built by navigating links. Does nothing if there is no previous document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#forward() forward()}, and {@link com.trolltech.qt.gui.QTextBrowser#backwardAvailable backwardAvailable() }. <br></DD></DT>
*/

    public void backward()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_backward(nativeId());
    }
    native void __qt_backward(long __this__nativeId);

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
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long ev);

/**
Changes the document displayed to the next document in the list of documents built by navigating links. Does nothing if there is no next document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBrowser#backward() backward()}, and {@link com.trolltech.qt.gui.QTextBrowser#forwardAvailable forwardAvailable() }. <br></DD></DT>
*/

    public void forward()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_forward(nativeId());
    }
    native void __qt_forward(long __this__nativeId);

/**
Changes the document displayed to be the first document from the history.
*/

    public void home()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_home(nativeId());
    }
    native void __qt_home(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object loadResource(int type, com.trolltech.qt.core.QUrl name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadResource_int_QUrl(nativeId(), type, name == null ? 0 : name.nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_loadResource_int_QUrl(long __this__nativeId, int type, long name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
Reloads the current set source.
*/

    public void reload()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reload(nativeId());
    }
    native void __qt_reload(long __this__nativeId);

/**
This property holds the name of the displayed document.  This is a an invalid url if no document is displayed or if the source is unknown. <p>When setting this property QTextBrowser tries to find a document with the specified name in the paths of the {@link QTextBrowser#searchPaths() searchPaths} property and directory of the current source, unless the value is an absolute file path. It also checks for optional anchors and scrolls the document accordingly <p>If the first tag in the document is <tt>&lt;qt type=detail&gt;</tt>, the document is displayed as a popup rather than as new document in the browser window itself. Otherwise, the document is displayed normally in the text browser with the text set to the contents of the named document with setHtml(). <p>By default, this property contains an empty URL.
*/

    @com.trolltech.qt.QtPropertyWriter(name="source")
    public void setSource(com.trolltech.qt.core.QUrl name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSource_QUrl(nativeId(), name == null ? 0 : name.nativeId());
    }
    native void __qt_setSource_QUrl(long __this__nativeId, long name);

/**
@exclude
*/

    public static native QTextBrowser fromNativePointer(QNativePointer nativePointer);

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

    protected QTextBrowser(QPrivateConstructor p) { super(p); } 
}
