package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebPage class provides an object to view and edit web documents. QWebPage holds a main frame responsible for web content, settings, the history of navigated links and actions. This class can be used, together with {@link com.trolltech.qt.webkit.QWebFrame QWebFrame}, to provide functionality like {@link com.trolltech.qt.webkit.QWebView QWebView} in a widget-less environment. <p>QWebPage's API is very similar to {@link com.trolltech.qt.webkit.QWebView QWebView}, as you are still provided with common functions like {@link com.trolltech.qt.webkit.QWebPage#action(com.trolltech.qt.webkit.QWebPage.WebAction) action()} (known as {@link com.trolltech.qt.webkit.QWebView#pageAction(com.trolltech.qt.webkit.QWebPage.WebAction) pageAction()} in {@link com.trolltech.qt.webkit.QWebView QWebView}), {@link com.trolltech.qt.webkit.QWebPage#triggerAction(com.trolltech.qt.webkit.QWebPage.WebAction) triggerAction()}, {@link com.trolltech.qt.webkit.QWebPage#findText(java.lang.String, com.trolltech.qt.webkit.QWebPage.FindFlag[]) findText()} and {@link com.trolltech.qt.webkit.QWebPage#settings() settings()}. More {@link com.trolltech.qt.webkit.QWebView QWebView}-like functions can be found in the main frame of QWebPage, obtained via {@link com.trolltech.qt.webkit.QWebPage#mainFrame() QWebPage::mainFrame()}. For example, the load(), setUrl() and setHtml() unctions for QWebPage can be accessed using {@link com.trolltech.qt.webkit.QWebFrame QWebFrame}. <p>The {@link com.trolltech.qt.webkit.QWebPage#loadStarted loadStarted() } signal is emitted when the page begins to load.The {@link com.trolltech.qt.webkit.QWebPage#loadProgress loadProgress() } signal, on the other hand, is emitted whenever an element of the web page completes loading, such as an embedded image, a script, etc. Finally, the {@link com.trolltech.qt.webkit.QWebPage#loadFinished loadFinished() } signal is emitted when the page has loaded completely. Its argument, either true or false, indicates whether or not the load operation succeeded.<a name="using-qwebpage-in-a-widget-less-environment"><h2>Using QWebPage in a Widget-less Environment</h2> Before you begin painting a QWebPage object, you need to set the size of the viewport by calling {@link com.trolltech.qt.webkit.QWebPage#setViewportSize(com.trolltech.qt.core.QSize) setViewportSize()}. Then, you invoke the main frame's render function ({@link com.trolltech.qt.webkit.QWebFrame#render(com.trolltech.qt.gui.QPainter) QWebFrame::render()}). An example of this is shown in the code snippet below. <p>Suppose we have a <tt>Thumbnail</tt> class as follows: <pre class="snippet">
class Thumbnailer extends QObject
{
    public Signal0 finished = new Signal0();

    public Thumbnailer(QUrl url) { ... }

    private void render(Boolean b) { ... }

    private QWebPage page;

}
</pre> The <tt>Thumbnail</tt>'s constructor takes in a <tt>url</tt>. We connect our QWebPage object's {@link com.trolltech.qt.webkit.QWebPage#loadFinished loadFinished() } signal to our private slot, <tt>render()</tt>. <pre class="snippet">
    public Thumbnailer(QUrl url)
    {
        page.mainFrame().load(url);
        page.loadFinished.connect(this, "render(Boolean)");
    }
</pre> The <tt>render()</tt> function shows how we can paint a thumbnail using a QWebPage object. <pre class="snippet">
    void render(Boolean b)
    {
        page.setViewportSize(page.mainFrame().contentsSize());
        QImage image = new QImage(page.viewportSize(), QImage.Format.Format_ARGB32);
        QPainter painter = new QPainter(image);

        page.mainFrame().render(painter);
        painter.end();

        QImage thumbnail = image.scaled(400, 400);
        thumbnail.save("thumbnail.png");

        finished.emit();
    }
</pre> We begin by setting the {@link QWebPage#viewportSize() viewportSize} and then we instantiate a {@link com.trolltech.qt.gui.QImage QImage} object, <tt>image</tt>, with the same size as our {@link QWebPage#viewportSize() viewportSize}. This image is then sent as a parameter to <tt>painter</tt>. Next, we render the contents of the main frame and its subframes into <tt>painter</tt>. Finally, we save the scaled image. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame QWebFrame}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWebPage extends com.trolltech.qt.core.QObject
{

    private Object __rcView = null;

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types of navigation available when browsing through hyperlinked documents.
*/

    public enum NavigationType implements com.trolltech.qt.QtEnumerator {
/**
 The user clicked on a link or pressed return on a focused link.
*/

        NavigationTypeLinkClicked(0),
/**
 The user activated a submit button for an HTML form.
*/

        NavigationTypeFormSubmitted(1),
/**
 Navigation to a previously shown document in the back or forward history is requested.
*/

        NavigationTypeBackOrForward(2),
/**
 The user activated the reload action.
*/

        NavigationTypeReload(3),
/**
 An HTML form was submitted a second time.
*/

        NavigationTypeFormResubmitted(4),
/**
 A navigation to another document using a method not listed above.
*/

        NavigationTypeOther(5);

        NavigationType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPage$NavigationType constant with the specified <tt>int</tt>.</brief>
*/

        public static NavigationType resolve(int value) {
            return (NavigationType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NavigationTypeLinkClicked;
            case 1: return NavigationTypeFormSubmitted;
            case 2: return NavigationTypeBackOrForward;
            case 3: return NavigationTypeReload;
            case 4: return NavigationTypeFormResubmitted;
            case 5: return NavigationTypeOther;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the types of action which can be performed on the web page. Actions which are related to text editing, cursor movement, and text selection only have an effect if {@link QWebPage#isContentEditable() contentEditable} is true.
*/

    public enum WebAction implements com.trolltech.qt.QtEnumerator {
/**
 No action is triggered.
*/

        NoWebAction(-1),
/**
 Open the current link.
*/

        OpenLink(0),
/**
 Open the current link in a new window.
*/

        OpenLinkInNewWindow(1),
/**
 Replicate the current frame in a new window.
*/

        OpenFrameInNewWindow(2),
/**
 Download the current link to the disk.
*/

        DownloadLinkToDisk(3),
/**
 Copy the content currently selected into the clipboard.
*/

/**
 Copy the current link to the clipboard.
*/

        CopyLinkToClipboard(4),
/**
 Open the highlighted image in a new window.
*/

        OpenImageInNewWindow(5),
/**
 Download the highlighted image to the disk.
*/

        DownloadImageToDisk(6),
/**
 Copy the highlighted image to the clipboard.
*/

        CopyImageToClipboard(7),
/**
 Navigate back in the history of navigated links.
*/

        Back(8),
/**
 Navigate forward in the history of navigated links.
*/

        Forward(9),
/**
 Stop loading the current page.
*/

        Stop(10),
/**
 Reload the current page.
*/

        Reload(11),
/**
 Cut the content currently selected into the clipboard.
*/

        Cut(12),
        Copy(13),
/**
 Paste content from the clipboard.
*/

        Paste(14),
/**
 Undo the last editing action.
*/

        Undo(15),
/**
 Redo the last editing action.
*/

        Redo(16),
/**
 Move the cursor to the next character.
*/

        MoveToNextChar(17),
/**
 Move the cursor to the previous character.
*/

        MoveToPreviousChar(18),
/**
 Move the cursor to the next word.
*/

        MoveToNextWord(19),
/**
 Move the cursor to the previous word.
*/

        MoveToPreviousWord(20),
/**
 Move the cursor to the next line.
*/

        MoveToNextLine(21),
/**
 Move the cursor to the previous line.
*/

        MoveToPreviousLine(22),
/**
 Move the cursor to the start of the line.
*/

        MoveToStartOfLine(23),
/**
 Move the cursor to the end of the line.
*/

        MoveToEndOfLine(24),
/**
 Move the cursor to the start of the block.
*/

        MoveToStartOfBlock(25),
/**
 Move the cursor to the end of the block.
*/

        MoveToEndOfBlock(26),
/**
 Move the cursor to the start of the document.
*/

        MoveToStartOfDocument(27),
/**
 Move the cursor to the end of the document.
*/

        MoveToEndOfDocument(28),
/**
 Select to the next character.
*/

        SelectNextChar(29),
/**
 Select to the previous character.
*/

        SelectPreviousChar(30),
/**
 Select to the next word.
*/

        SelectNextWord(31),
/**
 Select to the previous word.
*/

        SelectPreviousWord(32),
/**
 Select to the next line.
*/

        SelectNextLine(33),
/**
 Select to the previous line.
*/

        SelectPreviousLine(34),
/**
 Select to the start of the line.
*/

        SelectStartOfLine(35),
/**
 Select to the end of the line.
*/

        SelectEndOfLine(36),
/**
 Select to the start of the block.
*/

        SelectStartOfBlock(37),
/**
 Select to the end of the block.
*/

        SelectEndOfBlock(38),
/**
 Select to the start of the document.
*/

        SelectStartOfDocument(39),
/**
 Select to the end of the document.
*/

        SelectEndOfDocument(40),
/**
 Delete to the start of the word.
*/

        DeleteStartOfWord(41),
/**
 Delete to the end of the word.
*/

        DeleteEndOfWord(42),
/**
 Set the text direction to the default direction.
*/

        SetTextDirectionDefault(43),
/**
 Set the text direction to left-to-right.
*/

        SetTextDirectionLeftToRight(44),
/**
 Set the text direction to right-to-left.
*/

        SetTextDirectionRightToLeft(45),
/**
 Toggle the formatting between bold and normal weight.
*/

        ToggleBold(46),
/**
 Toggle the formatting between italic and normal style.
*/

        ToggleItalic(47),
/**
 Toggle underlining.
*/

        ToggleUnderline(48),
/**
 Show the Web Inspector with the currently highlighted HTML element.
*/

        InspectElement(49),
/**
 Insert a new paragraph.
*/

        InsertParagraphSeparator(50),
/**
 Insert a new line.
*/

        InsertLineSeparator(51),
/**
 Selects all content.
*/

        SelectAll(52),
        WebActionCount(53);

        WebAction(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPage$WebAction constant with the specified <tt>int</tt>.</brief>
*/

        public static WebAction resolve(int value) {
            return (WebAction) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return NoWebAction;
            case 0: return OpenLink;
            case 1: return OpenLinkInNewWindow;
            case 2: return OpenFrameInNewWindow;
            case 3: return DownloadLinkToDisk;
            case 4: return CopyLinkToClipboard;
            case 5: return OpenImageInNewWindow;
            case 6: return DownloadImageToDisk;
            case 7: return CopyImageToClipboard;
            case 8: return Back;
            case 9: return Forward;
            case 10: return Stop;
            case 11: return Reload;
            case 12: return Cut;
            case 13: return Copy;
            case 14: return Paste;
            case 15: return Undo;
            case 16: return Redo;
            case 17: return MoveToNextChar;
            case 18: return MoveToPreviousChar;
            case 19: return MoveToNextWord;
            case 20: return MoveToPreviousWord;
            case 21: return MoveToNextLine;
            case 22: return MoveToPreviousLine;
            case 23: return MoveToStartOfLine;
            case 24: return MoveToEndOfLine;
            case 25: return MoveToStartOfBlock;
            case 26: return MoveToEndOfBlock;
            case 27: return MoveToStartOfDocument;
            case 28: return MoveToEndOfDocument;
            case 29: return SelectNextChar;
            case 30: return SelectPreviousChar;
            case 31: return SelectNextWord;
            case 32: return SelectPreviousWord;
            case 33: return SelectNextLine;
            case 34: return SelectPreviousLine;
            case 35: return SelectStartOfLine;
            case 36: return SelectEndOfLine;
            case 37: return SelectStartOfBlock;
            case 38: return SelectEndOfBlock;
            case 39: return SelectStartOfDocument;
            case 40: return SelectEndOfDocument;
            case 41: return DeleteStartOfWord;
            case 42: return DeleteEndOfWord;
            case 43: return SetTextDirectionDefault;
            case 44: return SetTextDirectionLeftToRight;
            case 45: return SetTextDirectionRightToLeft;
            case 46: return ToggleBold;
            case 47: return ToggleItalic;
            case 48: return ToggleUnderline;
            case 49: return InspectElement;
            case 50: return InsertParagraphSeparator;
            case 51: return InsertLineSeparator;
            case 52: return SelectAll;
            case 53: return WebActionCount;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum WebWindowType implements com.trolltech.qt.QtEnumerator {
/**
 The window is a regular web browser window.
*/

        WebBrowserWindow(0),
/**
 The window acts as modal dialog.
*/

        WebModalDialog(1);

        WebWindowType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPage$WebWindowType constant with the specified <tt>int</tt>.</brief>
*/

        public static WebWindowType resolve(int value) {
            return (WebWindowType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WebBrowserWindow;
            case 1: return WebModalDialog;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the options available to {@link com.trolltech.qt.webkit.QWebPage QWebPage}'s {@link com.trolltech.qt.webkit.QWebPage#findText(java.lang.String, com.trolltech.qt.webkit.QWebPage.FindFlag[]) findText()} function. The options can be OR-ed together from the following list:
*/
@QtBlockedEnum
    public enum FindFlag implements com.trolltech.qt.QtEnumerator {
/**
 Searches backwards instead of forwards.
*/

        FindBackward(1),
/**
 By default {@link com.trolltech.qt.webkit.QWebPage#findText(java.lang.String, com.trolltech.qt.webkit.QWebPage.FindFlag[]) findText()} works case insensitive. Specifying this option changes the behaviour to a case sensitive find operation.
*/

        FindCaseSensitively(2),
/**
 Makes {@link com.trolltech.qt.webkit.QWebPage#findText(java.lang.String, com.trolltech.qt.webkit.QWebPage.FindFlag[]) findText()} restart from the beginning of the document if the end was reached and the text was not found.
*/

        FindWrapsAroundDocument(4);

        FindFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.webkit.QWebPage$FindFlags with the specified <tt>com.trolltech.qt.webkit.QWebPage$FindFlag[]</tt> QWebPage$FindFlag values set.</brief>
*/

        public static FindFlags createQFlags(FindFlag ... values) {
            return new FindFlags(values);
        }
/**
<brief>Returns the QWebPage$FindFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static FindFlag resolve(int value) {
            return (FindFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return FindBackward;
            case 2: return FindCaseSensitively;
            case 4: return FindWrapsAroundDocument;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FindFlags extends com.trolltech.qt.QFlags<FindFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QWebPage-FindFlags with the specified <tt>com.trolltech.qt.webkit.QWebPage.FindFlag[]</tt>. flags set.</brief>
*/

        public FindFlags(FindFlag ... args) { super(args); }
        public FindFlags(int value) { setValue(value); }
    }

    
/**
This enum describes the types of extensions that the page can support. Before using these extensions, you should verify that the extension is supported by calling {@link com.trolltech.qt.webkit.QWebPage#supportsExtension(com.trolltech.qt.webkit.QWebPage.Extension) supportsExtension()}.
*/
@QtBlockedEnum
    public enum Extension implements com.trolltech.qt.QtEnumerator {
/**
 Whether the web page supports multiple file selection. This extension is invoked when the web content requests one or more file names, for example as a result of the user clicking on a "file upload" button in a HTML form where multiple file selection is allowed.
*/

        ChooseMultipleFilesExtension(0);

        Extension(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPage$Extension constant with the specified <tt>int</tt>.</brief>
*/

        public static Extension resolve(int value) {
            return (Extension) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ChooseMultipleFilesExtension;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum defines the delegation policies a webpage can have when activating links and emitting the {@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() } signal.
*/

    public enum LinkDelegationPolicy implements com.trolltech.qt.QtEnumerator {
/**
 No links are delegated. Instead, {@link com.trolltech.qt.webkit.QWebPage QWebPage} tries to handle them all.
*/

        DontDelegateLinks(0),
/**
 When activating links that point to documents not stored on the local filesystem or an equivalent - such as the Qt resource system - then {@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() } is emitted.
*/

        DelegateExternalLinks(1),
/**
 Whenever a link is activated the {@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() } signal is emitted.
*/

        DelegateAllLinks(2);

        LinkDelegationPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWebPage$LinkDelegationPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static LinkDelegationPolicy resolve(int value) {
            return (LinkDelegationPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DontDelegateLinks;
            case 1: return DelegateExternalLinks;
            case 2: return DelegateAllLinks;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted whenever the text in form elements changes as well as other editable content. <p><DT><b>See also:</b><br><DD>{@link QWebPage#isContentEditable() contentEditable}, {@link com.trolltech.qt.webkit.QWebFrame#toHtml() QWebFrame::toHtml()}, and {@link com.trolltech.qt.webkit.QWebFrame#toPlainText() QWebFrame::toPlainText()}. <br></DD></DT>
*/

    public final Signal0 contentsChanged = new Signal0();

    private final void contentsChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contentsChanged(nativeId());
    }
    native void __qt_contentsChanged(long __this__nativeId);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.webkit.QWebFrame(named: frame), java.lang.String(named: databaseName)&gt;:<p> This signal is emitted whenever the web site shown in <tt>frame</tt> is asking to store data to the database <tt>databaseName</tt> and the quota allocated to that web site is exceeded.
*/

    public final Signal2<com.trolltech.qt.webkit.QWebFrame, java.lang.String> databaseQuotaExceeded = new Signal2<com.trolltech.qt.webkit.QWebFrame, java.lang.String>();

    private final void databaseQuotaExceeded(com.trolltech.qt.webkit.QWebFrame frame, java.lang.String databaseName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_databaseQuotaExceeded_QWebFrame_String(nativeId(), frame == null ? 0 : frame.nativeId(), databaseName);
    }
    native void __qt_databaseQuotaExceeded_QWebFrame_String(long __this__nativeId, long frame, java.lang.String databaseName);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkRequest(named: request)&gt;:<p> This signal is emitted when the user decides to download a link. The url of the link as well as additional meta-information is contained in <tt>request</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#unsupportedContent unsupportedContent() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QNetworkRequest> downloadRequested = new Signal1<com.trolltech.qt.network.QNetworkRequest>();

    private final void downloadRequested(com.trolltech.qt.network.QNetworkRequest request)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_downloadRequested_QNetworkRequest(nativeId(), request == null ? 0 : request.nativeId());
    }
    native void __qt_downloadRequested_QNetworkRequest(long __this__nativeId, long request);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.webkit.QWebFrame(named: frame)&gt;:<p> This signal is emitted whenever the page creates a new <tt>frame</tt>.
*/

    public final Signal1<com.trolltech.qt.webkit.QWebFrame> frameCreated = new Signal1<com.trolltech.qt.webkit.QWebFrame>();

    private final void frameCreated(com.trolltech.qt.webkit.QWebFrame frame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_frameCreated_QWebFrame(nativeId(), frame == null ? 0 : frame.nativeId());
    }
    native void __qt_frameCreated_QWebFrame(long __this__nativeId, long frame);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRect(named: geom)&gt;:<p> This signal is emitted whenever the document wants to change the position and size of the page to <tt>geom</tt>. This can happen for example through JavaScript.
*/

    public final Signal1<com.trolltech.qt.core.QRect> geometryChangeRequested = new Signal1<com.trolltech.qt.core.QRect>();

    private final void geometryChangeRequested(com.trolltech.qt.core.QRect geom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_geometryChangeRequested_QRect(nativeId(), geom == null ? 0 : geom.nativeId());
    }
    native void __qt_geometryChangeRequested_QRect(long __this__nativeId, long geom);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QUrl(named: url)&gt;:<p> This signal is emitted whenever the user clicks on a link and the page's {@link QWebPage#linkDelegationPolicy() linkDelegationPolicy} property is set to delegate the link handling for the specified <tt>url</tt>. <p>By default no links are delegated and are handled by QWebPage instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#linkHovered linkHovered() }. <br></DD></DT>
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
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: link), java.lang.String(named: title), java.lang.String(named: textContent)&gt;:<p> This signal is emitted when the mouse is hovering over a link. The first parameter is the <tt>link</tt> url, the second is the link <tt>title</tt> if any, and third <tt>textContent</tt> is the text content. Method is emitter with both empty parameters when the mouse isn't hovering over any link element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() }. <br></DD></DT>
*/

    public final Signal3<java.lang.String, java.lang.String, java.lang.String> linkHovered = new Signal3<java.lang.String, java.lang.String, java.lang.String>();

    private final void linkHovered(java.lang.String link, java.lang.String title, java.lang.String textContent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_linkHovered_String_String_String(nativeId(), link, title, textContent);
    }
    native void __qt_linkHovered_String_String_String(long __this__nativeId, java.lang.String link, java.lang.String title, java.lang.String textContent);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: ok)&gt;:<p> This signal is emitted when a load of the page is finished. <tt>ok</tt> will indicate whether the load was successful or any error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#loadStarted loadStarted() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> loadFinished = new Signal1<java.lang.Boolean>();

    private final void loadFinished(boolean ok)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_loadFinished_boolean(nativeId(), ok);
    }
    native void __qt_loadFinished_boolean(long __this__nativeId, boolean ok);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: progress)&gt;:<p> This signal is emitted when the global progress status changes. The current value is provided by <tt>progress</tt> and scales from 0 to 100, which is the default range of {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. It accumulates changes from all the child frames. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#bytesReceived() bytesReceived()}. <br></DD></DT>
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
 This signal is emitted when a new load of the page is started. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#loadFinished loadFinished() }. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: visible)&gt;:<p> This signal is emitted whenever the visibility of the menubar in a web browser window that hosts QWebPage should be changed to <tt>visible</tt>.
*/

    public final Signal1<java.lang.Boolean> menuBarVisibilityChangeRequested = new Signal1<java.lang.Boolean>();

    private final void menuBarVisibilityChangeRequested(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_menuBarVisibilityChangeRequested_boolean(nativeId(), visible);
    }
    native void __qt_menuBarVisibilityChangeRequested_boolean(long __this__nativeId, boolean visible);
/**
 This signal is emitted when for example the position of the cursor in an editable form element changes. It is used inform input methods about the new on-screen position where the user is able to enter text. This signal is usually connected to {@link com.trolltech.qt.gui.QWidget QWidget}'s updateMicroFocus() slot.
*/

    public final Signal0 microFocusChanged = new Signal0();

    private final void microFocusChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_microFocusChanged(nativeId());
    }
    native void __qt_microFocusChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.webkit.QWebFrame(named: frame)&gt;:<p> This signal is emitted whenever the page requests the web browser to print <tt>frame</tt>, for example through the JavaScript <tt>window. rint()</tt> call. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebFrame#print(com.trolltech.qt.gui.QPrinter) QWebFrame::print()}, and {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.webkit.QWebFrame> printRequested = new Signal1<com.trolltech.qt.webkit.QWebFrame>();

    private final void printRequested(com.trolltech.qt.webkit.QWebFrame frame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_printRequested_QWebFrame(nativeId(), frame == null ? 0 : frame.nativeId());
    }
    native void __qt_printRequested_QWebFrame(long __this__nativeId, long frame);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRect(named: dirtyRect)&gt;:<p> This signal is emitted whenever this QWebPage should be updated and no view was set. <tt>dirtyRect</tt> contains the area that needs to be updated. To paint the QWebPage get the {@link com.trolltech.qt.webkit.QWebPage#mainFrame() mainFrame()} and call the render({@link com.trolltech.qt.gui.QPainter QPainter}*, const {@link com.trolltech.qt.gui.QRegion QRegion}&) method with the <tt>dirtyRect</tt> as the second parameter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#mainFrame() mainFrame()}, and {@link com.trolltech.qt.webkit.QWebPage#view() view()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QRect> repaintRequested = new Signal1<com.trolltech.qt.core.QRect>();

    private final void repaintRequested(com.trolltech.qt.core.QRect dirtyRect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaintRequested_QRect(nativeId(), dirtyRect == null ? 0 : dirtyRect.nativeId());
    }
    native void __qt_repaintRequested_QRect(long __this__nativeId, long dirtyRect);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.webkit.QWebFrame(named: frame)&gt;:<p> This signal is emitted when the load of <tt>frame</tt> is finished and the application may now update its state accordingly.
*/

    public final Signal1<com.trolltech.qt.webkit.QWebFrame> restoreFrameStateRequested = new Signal1<com.trolltech.qt.webkit.QWebFrame>();

    private final void restoreFrameStateRequested(com.trolltech.qt.webkit.QWebFrame frame)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_restoreFrameStateRequested_QWebFrame(nativeId(), frame == null ? 0 : frame.nativeId());
    }
    native void __qt_restoreFrameStateRequested_QWebFrame(long __this__nativeId, long frame);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.webkit.QWebFrame(named: frame), com.trolltech.qt.QNativePointer(named: item)&gt;:<p> This signal is emitted shortly before the history of navigated pages in <tt>frame</tt> is changed, for example when navigating back in the history. <p>The provided {@link com.trolltech.qt.webkit.QWebHistoryItem QWebHistoryItem}, <tt>item</tt>, holds the history entry of the frame before the change. <p>A potential use-case for this signal is to store custom data in the {@link com.trolltech.qt.webkit.QWebHistoryItem QWebHistoryItem} associated to the frame, using {@link com.trolltech.qt.webkit.QWebHistoryItem#setUserData(java.lang.Object) QWebHistoryItem::setUserData()}.
*/

    public final Signal2<com.trolltech.qt.webkit.QWebFrame, com.trolltech.qt.QNativePointer> saveFrameStateRequested = new Signal2<com.trolltech.qt.webkit.QWebFrame, com.trolltech.qt.QNativePointer>();

    private final void saveFrameStateRequested(com.trolltech.qt.webkit.QWebFrame frame, com.trolltech.qt.QNativePointer item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_saveFrameStateRequested_QWebFrame_nativepointer(nativeId(), frame == null ? 0 : frame.nativeId(), item);
    }
    native void __qt_saveFrameStateRequested_QWebFrame_nativepointer(long __this__nativeId, long frame, com.trolltech.qt.QNativePointer item);
/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: dx), java.lang.Integer(named: dy), com.trolltech.qt.core.QRect(named: rectToScroll)&gt;:<p> This signal is emitted whenever the content given by <tt>rectToScroll</tt> needs to be scrolled <tt>dx</tt> and <tt>dy</tt> downwards and no view was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#view() view()}. <br></DD></DT>
*/

    public final Signal3<java.lang.Integer, java.lang.Integer, com.trolltech.qt.core.QRect> scrollRequested = new Signal3<java.lang.Integer, java.lang.Integer, com.trolltech.qt.core.QRect>();

    private final void scrollRequested(int dx, int dy, com.trolltech.qt.core.QRect scrollViewRect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollRequested_int_int_QRect(nativeId(), dx, dy, scrollViewRect == null ? 0 : scrollViewRect.nativeId());
    }
    native void __qt_scrollRequested_int_int_QRect(long __this__nativeId, int dx, int dy, long scrollViewRect);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#selectedText() selectedText()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: visible)&gt;:<p> This signal is emitted whenever the visibility of the statusbar in a web browser window that hosts QWebPage should be changed to <tt>visible</tt>.
*/

    public final Signal1<java.lang.Boolean> statusBarVisibilityChangeRequested = new Signal1<java.lang.Boolean>();

    private final void statusBarVisibilityChangeRequested(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_statusBarVisibilityChangeRequested_boolean(nativeId(), visible);
    }
    native void __qt_statusBarVisibilityChangeRequested_boolean(long __this__nativeId, boolean visible);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: visible)&gt;:<p> This signal is emitted whenever the visibility of the toolbar in a web browser window that hosts QWebPage should be changed to <tt>visible</tt>.
*/

    public final Signal1<java.lang.Boolean> toolBarVisibilityChangeRequested = new Signal1<java.lang.Boolean>();

    private final void toolBarVisibilityChangeRequested(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toolBarVisibilityChangeRequested_boolean(nativeId(), visible);
    }
    native void __qt_toolBarVisibilityChangeRequested_boolean(long __this__nativeId, boolean visible);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QNetworkReply(named: reply)&gt;:<p> This signals is emitted when webkit cannot handle a link the user navigated to. <p>At signal emissions time the meta data of the {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}<tt>reply</tt> is available. <p><b>Note:</b> This signal is only emitted if the {@link QWebPage#forwardUnsupportedContent() forwardUnsupportedContent} property is set to true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#downloadRequested downloadRequested() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QNetworkReply> unsupportedContent = new Signal1<com.trolltech.qt.network.QNetworkReply>();

    private final void unsupportedContent(com.trolltech.qt.network.QNetworkReply reply)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsupportedContent_QNetworkReply(nativeId(), reply == null ? 0 : reply.nativeId());
    }
    native void __qt_unsupportedContent_QNetworkReply(long __this__nativeId, long reply);
/**
 This signal is emitted whenever the page requests the web browser window to be closed, for example through the JavaScript <tt>window.close()</tt> call.
*/

    public final Signal0 windowCloseRequested = new Signal0();

    private final void windowCloseRequested()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_windowCloseRequested(nativeId());
    }
    native void __qt_windowCloseRequested(long __this__nativeId);


/**
Constructs an empty {@link com.trolltech.qt.webkit.QWebView QWebView} with parent <tt>parent</tt>.
*/

    public QWebPage() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an empty {@link com.trolltech.qt.webkit.QWebView QWebView} with parent <tt>parent</tt>.
*/

    public QWebPage(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QWebPage_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWebPage_QObject(long parent);

/**
Returns a {@link com.trolltech.qt.gui.QAction QAction} for the specified {@link com.trolltech.qt.webkit.QWebPage.WebAction WebAction }<tt>action</tt>. <p>The action is owned by the QWebPage but you can customize the look by changing its properties. <p>QWebPage also takes care of implementing the action, so that upon triggering the corresponding action is performed on the page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#triggerAction(com.trolltech.qt.webkit.QWebPage.WebAction) triggerAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction action(com.trolltech.qt.webkit.QWebPage.WebAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_action_WebAction(nativeId(), action.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_action_WebAction(long __this__nativeId, int action);

/**
Returns the number of bytes that were received from the network to render the current page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#totalBytes() totalBytes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long bytesReceived()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesReceived(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesReceived(long __this__nativeId);

/**
This function creates the standard context menu which is shown when the user clicks on the web page with the right mouse button. It is called from the default contextMenuEvent() handler. The popup menu's ownership is transferred to the caller.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu createStandardContextMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createStandardContextMenu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_createStandardContextMenu(long __this__nativeId);

/**
Returns the frame currently active. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#mainFrame() mainFrame()}, and {@link com.trolltech.qt.webkit.QWebPage#frameCreated frameCreated() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebFrame currentFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebFrame __qt_currentFrame(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final boolean findText(java.lang.String subString, com.trolltech.qt.webkit.QWebPage.FindFlag ... options) {
        return this.findText(subString, new com.trolltech.qt.webkit.QWebPage.FindFlags(options));
    }

/**
Finds the next occurrence of the string, <tt>subString</tt>, in the page, using the given <tt>options</tt>. Returns true of <tt>subString</tt> was found and selects the match visually; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean findText(java.lang.String subString) {
        return findText(subString, new com.trolltech.qt.webkit.QWebPage.FindFlags(0));
    }
/**
Finds the next occurrence of the string, <tt>subString</tt>, in the page, using the given <tt>options</tt>. Returns true of <tt>subString</tt> was found and selects the match visually; otherwise returns false.
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
Similar to QWidget.:focusNextPrevChild it focuses the next focusable web element if <tt>next</tt> is true; otherwise the previous element is focused. <p>Returns true if it can find a new focusable element, or false if it can't.
*/

    @QtBlockedSlot
    public final boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This property holds whether QWebPage should forward unsupported content through the unsupportedContent signal. If disabled the download of such content is aborted immediately. <p>By default unsupported content is not forwarded.
*/

    @com.trolltech.qt.QtPropertyReader(name="forwardUnsupportedContent")
    @QtBlockedSlot
    public final boolean forwardUnsupportedContent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_forwardUnsupportedContent(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_forwardUnsupportedContent(long __this__nativeId);

/**
Returns a pointer to the view's history of navigated web pages.
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
This method is used by the input method to query a set of properties of the page to be able to support complex input method operations as support for surrounding text and reconversions. <p><tt>property</tt> specifies which property is queried. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent) QWidget::inputMethodEvent()}, {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}, and {@link com.trolltech.qt.gui.QInputContext QInputContext}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), property.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int property);

/**
This property holds whether the content in this QWebPage is editable or not. If this property is enabled the contents of the page can be edited by the user through a visible cursor. If disabled (the default) only HTML elements in the web page with their <tt>contenteditable</tt> attribute set are editable.
*/

    @com.trolltech.qt.QtPropertyReader(name="contentEditable")
    @QtBlockedSlot
    public final boolean isContentEditable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isContentEditable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isContentEditable(long __this__nativeId);

/**
This property holds whether the page contains unsubmitted form data. By default, this property is false.
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
This property holds how QWebPage should delegate the handling of links through the {@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() } signal. The default is to delegate no links.
*/

    @com.trolltech.qt.QtPropertyReader(name="linkDelegationPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebPage.LinkDelegationPolicy linkDelegationPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.webkit.QWebPage.LinkDelegationPolicy.resolve(__qt_linkDelegationPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_linkDelegationPolicy(long __this__nativeId);

/**
Returns the main frame of the page. <p>The main frame provides access to the hierarchy of sub-frames and is also needed if you want to explicitly render a web page into a given painter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#currentFrame() currentFrame()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebFrame mainFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mainFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebFrame __qt_mainFrame(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} that is responsible for serving network requests for this QWebPage. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#setNetworkAccessManager(com.trolltech.qt.network.QNetworkAccessManager) setNetworkAccessManager()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkAccessManager networkAccessManager()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_networkAccessManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkAccessManager __qt_networkAccessManager(long __this__nativeId);

/**
This property holds the page's palette. The base brush of the palette is used to draw the background of the main frame. <p>By default, this property contains the application's default palette.
*/

    @com.trolltech.qt.QtPropertyReader(name="palette")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette palette()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_palette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_palette(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.webkit.QWebPluginFactory QWebPluginFactory} that is responsible for creating plugins embedded into this QWebPage. If no plugin factory is installed a null pointer is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#setPluginFactory(com.trolltech.qt.webkit.QWebPluginFactory) setPluginFactory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebPluginFactory pluginFactory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pluginFactory(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebPluginFactory __qt_pluginFactory(long __this__nativeId);

/**
This property holds the text currently selected. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#selectionChanged selectionChanged() }. <br></DD></DT>
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
This property holds whether the content in this QWebPage is editable or not. If this property is enabled the contents of the page can be edited by the user through a visible cursor. If disabled (the default) only HTML elements in the web page with their <tt>contenteditable</tt> attribute set are editable.
*/

    @com.trolltech.qt.QtPropertyWriter(name="contentEditable")
    @QtBlockedSlot
    public final void setContentEditable(boolean editable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentEditable_boolean(nativeId(), editable);
    }
    @QtBlockedSlot
    native void __qt_setContentEditable_boolean(long __this__nativeId, boolean editable);

/**
This property holds whether QWebPage should forward unsupported content through the unsupportedContent signal. If disabled the download of such content is aborted immediately. <p>By default unsupported content is not forwarded.
*/

    @com.trolltech.qt.QtPropertyWriter(name="forwardUnsupportedContent")
    @QtBlockedSlot
    public final void setForwardUnsupportedContent(boolean forward)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForwardUnsupportedContent_boolean(nativeId(), forward);
    }
    @QtBlockedSlot
    native void __qt_setForwardUnsupportedContent_boolean(long __this__nativeId, boolean forward);

/**
This property holds how QWebPage should delegate the handling of links through the {@link com.trolltech.qt.webkit.QWebPage#linkClicked linkClicked() } signal. The default is to delegate no links.
*/

    @com.trolltech.qt.QtPropertyWriter(name="linkDelegationPolicy")
    @QtBlockedSlot
    public final void setLinkDelegationPolicy(com.trolltech.qt.webkit.QWebPage.LinkDelegationPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLinkDelegationPolicy_LinkDelegationPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setLinkDelegationPolicy_LinkDelegationPolicy(long __this__nativeId, int policy);

/**
Sets the {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}<tt>manager</tt> responsible for serving network requests for this QWebPage. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#networkAccessManager() networkAccessManager()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNetworkAccessManager(com.trolltech.qt.network.QNetworkAccessManager manager)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (manager != null) {
            manager.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNetworkAccessManager_QNetworkAccessManager(nativeId(), manager == null ? 0 : manager.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setNetworkAccessManager_QNetworkAccessManager(long __this__nativeId, long manager);

/**
This property holds the page's palette. The base brush of the palette is used to draw the background of the main frame. <p>By default, this property contains the application's default palette.
*/

    @com.trolltech.qt.QtPropertyWriter(name="palette")
    @QtBlockedSlot
    public final void setPalette(com.trolltech.qt.gui.QPalette palette)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPalette_QPalette(nativeId(), palette == null ? 0 : palette.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPalette_QPalette(long __this__nativeId, long palette);

/**
Sets the {@link com.trolltech.qt.webkit.QWebPluginFactory QWebPluginFactory}<tt>factory</tt> responsible for creating plugins embedded into this QWebPage. <p>Note: The plugin factory is only used if the {@link com.trolltech.qt.webkit.QWebSettings.WebAttribute QWebSettings::PluginsEnabled } attribute is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#pluginFactory() pluginFactory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPluginFactory(com.trolltech.qt.webkit.QWebPluginFactory factory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPluginFactory_QWebPluginFactory(nativeId(), factory == null ? 0 : factory.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPluginFactory_QWebPluginFactory(long __this__nativeId, long factory);

/**
Sets the <tt>view</tt> that is associated with the web page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#view() view()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setView(com.trolltech.qt.gui.QWidget view)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcView = view;
        }
        __qt_setView_QWidget(nativeId(), view == null ? 0 : view.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setView_QWidget(long __this__nativeId, long view);

/**
This property holds the size of the viewport. The size affects for example the visibility of scrollbars if the document is larger than the viewport. <p>By default, for a newly-created Web page, this property contains a size with zero width and height.
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewportSize")
    @QtBlockedSlot
    public final void setViewportSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewportSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setViewportSize_QSize(long __this__nativeId, long size);

/**
Returns a pointer to the page's settings object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebSettings#globalSettings() QWebSettings::globalSettings()}. <br></DD></DT>
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
Filters the context menu event, <tt>event</tt>, through handlers for scrollbars and custom event handlers in the web page. Returns true if the event was handled; otherwise false. <p>A web page may swallow a context menu event through a custom event handler, allowing for context menus to be implemented in HTML/JavaScript. This is used by Google Maps, for example.
*/

    @QtBlockedSlot
    public final boolean swallowContextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_swallowContextMenuEvent_QContextMenuEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_swallowContextMenuEvent_QContextMenuEvent(long __this__nativeId, long event);

/**
Returns the total number of bytes that were received from the network to render the current page, including extra content such as embedded images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#bytesReceived() bytesReceived()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long totalBytes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalBytes(nativeId());
    }
    @QtBlockedSlot
    native long __qt_totalBytes(long __this__nativeId);

/**
Returns a pointer to the undo stack used for editable content.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QUndoStack undoStack()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_undoStack(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QUndoStack __qt_undoStack(long __this__nativeId);

/**
Updates the page's actions depending on the position <tt>pos</tt>. For example if <tt>pos</tt> is over an image element the {@link com.trolltech.qt.webkit.QWebPage.WebAction CopyImageToClipboard } action is enabled.
*/

    @QtBlockedSlot
    public final void updatePositionDependentActions(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updatePositionDependentActions_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_updatePositionDependentActions_QPoint(long __this__nativeId, long pos);

/**
Returns the view widget that is associated with the web page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#setView(com.trolltech.qt.gui.QWidget) setView()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget view()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_view(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_view(long __this__nativeId);

/**
This property holds the size of the viewport. The size affects for example the visibility of scrollbars if the document is larger than the viewport. <p>By default, for a newly-created Web page, this property contains a size with zero width and height.
*/

    @com.trolltech.qt.QtPropertyReader(name="viewportSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize viewportSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_viewportSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_viewportSize(long __this__nativeId);

/**
This function is called whenever {@link com.trolltech.qt.webkit.QWebPage#acceptNavigationRequest(com.trolltech.qt.webkit.QWebFrame, com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.webkit.QWebPage.NavigationType) WebKit} requests to navigate <tt>frame</tt> to the resource specified by <tt>request</tt> by means of the specified navigation type <tt>type</tt>. <p>The default implementation interprets the page's {@link QWebPage#linkDelegationPolicy() linkDelegationPolicy} and emits {@link com.trolltech.qt.webkit.QWebPage#acceptNavigationRequest(com.trolltech.qt.webkit.QWebFrame, com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.webkit.QWebPage.NavigationType) linkClicked} accordingly or returns true to let QWebPage handle the navigation itself.
*/

    @QtBlockedSlot
    protected boolean acceptNavigationRequest(com.trolltech.qt.webkit.QWebFrame frame, com.trolltech.qt.network.QNetworkRequest request, com.trolltech.qt.webkit.QWebPage.NavigationType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptNavigationRequest_QWebFrame_QNetworkRequest_NavigationType(nativeId(), frame == null ? 0 : frame.nativeId(), request == null ? 0 : request.nativeId(), type.value());
    }
    @QtBlockedSlot
    native boolean __qt_acceptNavigationRequest_QWebFrame_QNetworkRequest_NavigationType(long __this__nativeId, long frame, long request, int type);

/**
This function is called when the web content requests a file name, for example as a result of the user clicking on a "file upload" button in a HTML form. <p>A suggested filename may be provided in <tt>suggestedFile</tt>. The frame originating the request is provided as <tt>parentFrame</tt>.
*/

    @QtBlockedSlot
    protected java.lang.String chooseFile(com.trolltech.qt.webkit.QWebFrame originatingFrame, java.lang.String oldFile)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_chooseFile_QWebFrame_String(nativeId(), originatingFrame == null ? 0 : originatingFrame.nativeId(), oldFile);
    }
    @QtBlockedSlot
    native java.lang.String __qt_chooseFile_QWebFrame_String(long __this__nativeId, long originatingFrame, java.lang.String oldFile);

/**
This function is called whenever WebKit encounters a HTML object element with type "application/x-qt-plugin". The <tt>classid</tt>, <tt>url</tt>, <tt>paramNames</tt> and <tt>paramValues</tt> correspond to the HTML object element attributes and child elements to configure the embeddable object.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QObject createPlugin(java.lang.String classid, com.trolltech.qt.core.QUrl url, java.util.List<java.lang.String> paramNames, java.util.List<java.lang.String> paramValues)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createPlugin_String_QUrl_List_List(nativeId(), classid, url == null ? 0 : url.nativeId(), paramNames, paramValues);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_createPlugin_String_QUrl_List_List(long __this__nativeId, java.lang.String classid, long url, java.util.List<java.lang.String> paramNames, java.util.List<java.lang.String> paramValues);

/**
This function is called whenever WebKit wants to create a new window of the given <tt>type</tt>, for example when a JavaScript program requests to open a document in a new window. <p>If the new window can be created, the new window's QWebPage is returned; otherwise a null pointer is returned. <p>If the view associated with the web page is a {@link com.trolltech.qt.webkit.QWebView QWebView} object, then the default implementation forwards the request to {@link com.trolltech.qt.webkit.QWebView QWebView}'s {@link com.trolltech.qt.webkit.QWebPage#createWindow(com.trolltech.qt.webkit.QWebPage.WebWindowType) createWindow()} function; otherwise it returns a null pointer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#acceptNavigationRequest(com.trolltech.qt.webkit.QWebFrame, com.trolltech.qt.network.QNetworkRequest, com.trolltech.qt.webkit.QWebPage.NavigationType) acceptNavigationRequest()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.webkit.QWebPage createWindow(com.trolltech.qt.webkit.QWebPage.WebWindowType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createWindow_WebWindowType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebPage __qt_createWindow_WebWindowType(long __this__nativeId, int type);

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
This function is called whenever a JavaScript program running inside <tt>frame</tt> calls the alert() function with the message <tt>msg</tt>. <p>The default implementation shows the message, <tt>msg</tt>, with QMessageBox::information.
*/

    @QtBlockedSlot
    protected void javaScriptAlert(com.trolltech.qt.webkit.QWebFrame originatingFrame, java.lang.String msg)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_javaScriptAlert_QWebFrame_String(nativeId(), originatingFrame == null ? 0 : originatingFrame.nativeId(), msg);
    }
    @QtBlockedSlot
    native void __qt_javaScriptAlert_QWebFrame_String(long __this__nativeId, long originatingFrame, java.lang.String msg);

/**
This function is called whenever a JavaScript program running inside <tt>frame</tt> calls the confirm() function with the message, <tt>msg</tt>. Returns true if the user confirms the message; otherwise returns false. <p>The default implementation executes the query using QMessageBox::information with {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::Yes } and {@link com.trolltech.qt.gui.QMessageBox.StandardButton QMessageBox::No } buttons.
*/

    @QtBlockedSlot
    protected boolean javaScriptConfirm(com.trolltech.qt.webkit.QWebFrame originatingFrame, java.lang.String msg)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_javaScriptConfirm_QWebFrame_String(nativeId(), originatingFrame == null ? 0 : originatingFrame.nativeId(), msg);
    }
    @QtBlockedSlot
    native boolean __qt_javaScriptConfirm_QWebFrame_String(long __this__nativeId, long originatingFrame, java.lang.String msg);

/**
This function is called whenever a JavaScript program tries to print a <tt>message</tt> to the web browser's console. <p>For example in case of evaluation errors the source URL may be provided in <tt>sourceID</tt> as well as the <tt>lineNumber</tt>. <p>The default implementation prints nothing.
*/

    @QtBlockedSlot
    protected void javaScriptConsoleMessage(java.lang.String message, int lineNumber, java.lang.String sourceID)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_javaScriptConsoleMessage_String_int_String(nativeId(), message, lineNumber, sourceID);
    }
    @QtBlockedSlot
    native void __qt_javaScriptConsoleMessage_String_int_String(long __this__nativeId, java.lang.String message, int lineNumber, java.lang.String sourceID);

    @QtBlockedSlot
    private boolean javaScriptPrompt(com.trolltech.qt.webkit.QWebFrame originatingFrame, java.lang.String msg, java.lang.String defaultValue, com.trolltech.qt.QNativePointer result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_javaScriptPrompt_QWebFrame_String_String_nativepointer(nativeId(), originatingFrame == null ? 0 : originatingFrame.nativeId(), msg, defaultValue, result);
    }
    @QtBlockedSlot
    native boolean __qt_javaScriptPrompt_QWebFrame_String_String_nativepointer(long __this__nativeId, long originatingFrame, java.lang.String msg, java.lang.String defaultValue, com.trolltech.qt.QNativePointer result);

/**
This virtual function returns true if the web page supports <tt>extension</tt>; otherwise false is returned. <p><DT><b>See also:</b><br><DD>extension(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean supportsExtension(com.trolltech.qt.webkit.QWebPage.Extension extension)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);


/**
This function can be called to trigger the specified <tt>action</tt>. It is also called by {@link <a href="../qtwebkit.html">QtWebKit</a>} if the user triggers the action, for example through a context menu item. <p>If <tt>action</tt> is a checkable action then <tt>checked</tt> specified whether the action is toggled or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#action(com.trolltech.qt.webkit.QWebPage.WebAction) action()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void triggerAction(com.trolltech.qt.webkit.QWebPage.WebAction action) {
        triggerAction(action, (boolean)false);
    }
/**
This function can be called to trigger the specified <tt>action</tt>. It is also called by {@link <a href="../qtwebkit.html">QtWebKit</a>} if the user triggers the action, for example through a context menu item. <p>If <tt>action</tt> is a checkable action then <tt>checked</tt> specified whether the action is toggled or not. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebPage#action(com.trolltech.qt.webkit.QWebPage.WebAction) action()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void triggerAction(com.trolltech.qt.webkit.QWebPage.WebAction action, boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_triggerAction_WebAction_boolean(nativeId(), action.value(), checked);
    }
    @QtBlockedSlot
    native void __qt_triggerAction_WebAction_boolean(long __this__nativeId, int action, boolean checked);

/**
This function is called when a user agent for HTTP requests is needed. You can reimplement this function to dynamically return different user agents for different URLs, based on the <tt>url</tt> parameter. <p>The default implementation returns the following value: <p>"Mozilla/5.0 (%Platform%; %Security%; %Subplatform%; %Locale%) AppleWebKit/%WebKitVersion% (KHTML, like Gecko, Safari/419.3) %AppVersion" <p>In this string the following values are replaced at run-time: <ul><li> %Platform% and %Subplatform% are expanded to the windowing system and the operation system.</li><li> %Security% expands to U if SSL is enabled, otherwise N. SSL is enabled if {@link com.trolltech.qt.network.QSslSocket#supportsSsl() QSslSocket::supportsSsl()} returns true.</li><li> %Locale% is replaced with {@link com.trolltech.qt.core.QLocale#name() QLocale::name()}.</li><li> %WebKitVersion% currently expands to 527+</li><li> %AppVersion% expands to {@link QCoreApplication#applicationName() QCoreApplication::applicationName()}/{@link QCoreApplication#applicationVersion() QCoreApplication::applicationVersion()} if they're set; otherwise defaulting to Qt and the current Qt version.</li></ul>
*/

    @QtBlockedSlot
    protected java.lang.String userAgentForUrl(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userAgentForUrl_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_userAgentForUrl_QUrl(long __this__nativeId, long url);

/**
@exclude
*/

    public static native QWebPage fromNativePointer(QNativePointer nativePointer);

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

    protected QWebPage(QPrivateConstructor p) { super(p); } 

/**
This function is called whenever a {@link com.trolltech.qt.webkit.QWebPage#javaScriptPrompt(com.trolltech.qt.webkit.QWebFrame, java.lang.String, java.lang.String) JavaScript} program running inside <tt>frame</tt> tries to prompt the user for input. The program may provide an optional message, <tt>msg</tt>, as well as a default value for the input in <tt>defaultValue</tt>. <p>If the prompt was cancelled by the user the implementation should return false; otherwise the result should be written to <tt>result</tt> and true should be returned. <p>The default implementation uses {@link com.trolltech.qt.webkit.QWebPage#javaScriptPrompt(com.trolltech.qt.webkit.QWebFrame, java.lang.String, java.lang.String) QInputDialog::getText}.
*/

    protected String javaScriptPrompt(com.trolltech.qt.webkit.QWebFrame originatingFrame, java.lang.String msg, java.lang.String defaultValue) {
        com.trolltech.qt.QNativePointer result = new com.trolltech.qt.QNativePointer(QNativePointer.Type.String);
        if (javaScriptPrompt(originatingFrame, msg, defaultValue, result))
            return result.stringValue();
        else
            return null;
    }

}
