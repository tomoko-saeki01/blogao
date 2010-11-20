package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextDocument class holds formatted text that can be viewed and edited using a {@link com.trolltech.qt.gui.QTextEdit QTextEdit}. QTextDocument is a container for structured rich text documents, providing support for styled text and various types of document elements, such as lists, tables, frames, and images. They can be created for use in a {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, or used independently. <p>Each document element is described by an associated format object. Each format object is treated as a unique object by QTextDocuments, and can be passed to {@link com.trolltech.qt.gui.QTextDocument#objectForFormat(com.trolltech.qt.gui.QTextFormat) objectForFormat()} to obtain the document element that it is applied to. <p>A QTextDocument can be edited programmatically using a {@link com.trolltech.qt.gui.QTextCursor QTextCursor}, and its contents can be examined by traversing the document structure. The entire document structure is stored as a hierarchy of document elements beneath the root frame, found with the {@link com.trolltech.qt.gui.QTextDocument#rootFrame() rootFrame()} function. Alternatively, if you just want to iterate over the textual contents of the document you can use {@link com.trolltech.qt.gui.QTextDocument#begin() begin()}, {@link com.trolltech.qt.gui.QTextDocument#end() end()}, and {@link com.trolltech.qt.gui.QTextDocument#findBlock(int) findBlock()} to retrieve text blocks that you can examine and iterate over. <p>The layout of a document is determined by the {@link com.trolltech.qt.gui.QTextDocument#documentLayout() documentLayout()}; you can create your own {@link com.trolltech.qt.gui.QAbstractTextDocumentLayout QAbstractTextDocumentLayout} subclass and set it using {@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) setDocumentLayout()} if you want to use your own layout logic. The document's title can be obtained by calling the documentTitle() function. <p>The {@link com.trolltech.qt.gui.QTextDocument#toPlainText() toPlainText()} and {@link com.trolltech.qt.gui.QTextDocument#toHtml() toHtml()} convenience functions allow you to retrieve the contents of the document as plain text and HTML. The document's text can be searched using the {@link com.trolltech.qt.gui.QTextDocument#find(com.trolltech.qt.core.QRegExp, com.trolltech.qt.gui.QTextCursor, com.trolltech.qt.gui.QTextDocument.FindFlag[]) find()} functions. <p>Undo/redo of operations performed on the document can be controlled using the {@link com.trolltech.qt.gui.QTextDocument#setUndoRedoEnabled(boolean) setUndoRedoEnabled()} function. The undo/redo system can be controlled by an editor widget through the {@link com.trolltech.qt.gui.QTextDocument#undo() undo()} and {@link com.trolltech.qt.gui.QTextDocument#redo() redo()} slots; the document also provides {@link com.trolltech.qt.gui.QTextDocument#contentsChanged contentsChanged() }, {@link com.trolltech.qt.gui.QTextDocument#undoAvailable undoAvailable() }, and {@link com.trolltech.qt.gui.QTextDocument#redoAvailable redoAvailable() } signals that inform connected editor widgets about the state of the undo/redo system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor QTextCursor}, {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, and {@link <a href="../richtext.html">Rich Text Processing</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextDocument extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the types of resources that can be loaded by {@link com.trolltech.qt.gui.QTextDocument QTextDocument}'s {@link com.trolltech.qt.gui.QTextDocument#loadResource(int, com.trolltech.qt.core.QUrl) loadResource()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#loadResource(int, com.trolltech.qt.core.QUrl) loadResource()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ResourceType implements com.trolltech.qt.QtEnumerator {
/**
 The resource contains HTML.
*/

        HtmlResource(1),
/**
 The resource contains image data. Currently supported data types are {@link com.trolltech.qt.QVariant.Type QVariant::Pixmap } and {@link com.trolltech.qt.QVariant.Type QVariant::Image }. If the corresponding variant is of type {@link com.trolltech.qt.QVariant.Type QVariant::ByteArray } then Qt attempts to load the image using QImage::loadFromData. {@link com.trolltech.qt.QVariant.Type QVariant::Icon } is currently not supported. The icon needs to be converted to one of the supported types first, for example using QIcon::pixmap.
*/

        ImageResource(2),
/**
 The resource contains CSS.
*/

        StyleSheetResource(3),
/**
 The first available value for user defined resource types.
*/

        UserResource(100);

        ResourceType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextDocument$ResourceType constant with the specified <tt>int</tt>.</brief>
*/

        public static ResourceType resolve(int value) {
            return (ResourceType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return HtmlResource;
            case 2: return ImageResource;
            case 3: return StyleSheetResource;
            case 100: return UserResource;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the options available to {@link com.trolltech.qt.gui.QTextDocument QTextDocument}'s find function. The options can be OR-ed together from the following list:
*/
@QtBlockedEnum
    public enum FindFlag implements com.trolltech.qt.QtEnumerator {
/**
 Search backwards instead of forwards.
*/

        FindBackward(1),
/**
 By default find works case insensitive. Specifying this option changes the behaviour to a case sensitive find operation.
*/

        FindCaseSensitively(2),
/**
 Makes find match only complete words.
*/

        FindWholeWords(4);

        FindFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QTextDocument$FindFlags with the specified <tt>com.trolltech.qt.gui.QTextDocument$FindFlag[]</tt> QTextDocument$FindFlag values set.</brief>
*/

        public static FindFlags createQFlags(FindFlag ... values) {
            return new FindFlags(values);
        }
/**
<brief>Returns the QTextDocument$FindFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static FindFlag resolve(int value) {
            return (FindFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return FindBackward;
            case 2: return FindCaseSensitively;
            case 4: return FindWholeWords;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FindFlags extends com.trolltech.qt.QFlags<FindFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextDocument-FindFlags with the specified <tt>com.trolltech.qt.gui.QTextDocument.FindFlag[]</tt>. flags set.</brief>
*/

        public FindFlags(FindFlag ... args) { super(args); }
        public FindFlags(int value) { setValue(value); }
    }

    
/**
This enum describes the different types of meta information that can be added to a document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#metaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation) metaInformation()}, and {@link com.trolltech.qt.gui.QTextDocument#setMetaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation, java.lang.String) setMetaInformation()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum MetaInformation implements com.trolltech.qt.QtEnumerator {
/**
 The title of the document.
*/

        DocumentTitle(0),
/**
 The url of the document. The {@link com.trolltech.qt.gui.QTextDocument#loadResource(int, com.trolltech.qt.core.QUrl) loadResource()} function uses this url as the base when loading relative resources.
*/

        DocumentUrl(1);

        MetaInformation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextDocument$MetaInformation constant with the specified <tt>int</tt>.</brief>
*/

        public static MetaInformation resolve(int value) {
            return (MetaInformation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DocumentTitle;
            case 1: return DocumentUrl;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: newBlockCount)&gt;:<p> This signal is emitted when the total number of text blocks in the document changes. The value passed in <tt>newBlockCount</tt> is the new total.
*/

    public final Signal1<java.lang.Integer> blockCountChanged = new Signal1<java.lang.Integer>();

    private final void blockCountChanged(int newBlockCount)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_blockCountChanged_int(nativeId(), newBlockCount);
    }
    native void __qt_blockCountChanged_int(long __this__nativeId, int newBlockCount);
/**
<p>This signal takes 3 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: position), java.lang.Integer(named: charsRemoved), java.lang.Integer(named: charsAdded)&gt;:<p> This signal is emitted whenever the document's content changes; for example, when text is inserted or deleted, or when formatting is applied. <p>Information is provided about the <tt>position</tt> of the character in the document where the change occurred, the number of characters removed (<tt>charsRemoved</tt>), and the number of characters added (<tt>charsAdded</tt>). <p>The signal is emitted before the document's layout manager is notified about the change. This hook allows you to implement syntax highlighting for the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#documentChanged(int, int, int) QAbstractTextDocumentLayout::documentChanged()}, and {@link com.trolltech.qt.gui.QTextDocument#contentsChanged contentsChanged() }. <br></DD></DT>
*/

    public final Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer> contentsChange = new Signal3<java.lang.Integer, java.lang.Integer, java.lang.Integer>();

    private final void contentsChange(int from, int charsRemoves, int charsAdded)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contentsChange_int_int_int(nativeId(), from, charsRemoves, charsAdded);
    }
    native void __qt_contentsChange_int_int_int(long __this__nativeId, int from, int charsRemoves, int charsAdded);
/**
 This signal is emitted whenever the document's content changes; for example, when text is inserted or deleted, or when formatting is applied. <p>Information is provided about the <tt>position</tt> of the character in the document where the change occurred, the number of characters removed (<tt>charsRemoved</tt>), and the number of characters added (<tt>charsAdded</tt>). <p>The signal is emitted before the document's layout manager is notified about the change. This hook allows you to implement syntax highlighting for the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractTextDocumentLayout#documentChanged(int, int, int) QAbstractTextDocumentLayout::documentChanged()}, and {@link com.trolltech.qt.gui.QTextDocument#contentsChanged contentsChanged() }. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTextCursor(named: cursor)&gt;:<p> This signal is emitted whenever the position of a cursor changed due to an editing operation. The cursor that changed is passed in <tt>cursor</tt>. If you need a signal when the cursor is moved with the arrow keys you can use the {@link com.trolltech.qt.gui.QTextEdit#cursorPositionChanged cursorPositionChanged() } signal in {@link com.trolltech.qt.gui.QTextEdit QTextEdit}.
*/

    public final Signal1<com.trolltech.qt.gui.QTextCursor> cursorPositionChanged = new Signal1<com.trolltech.qt.gui.QTextCursor>();

    private final void cursorPositionChanged(com.trolltech.qt.gui.QTextCursor cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorPositionChanged_QTextCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    native void __qt_cursorPositionChanged_QTextCursor(long __this__nativeId, long cursor);
/**
 This signal is emitted when a new document layout is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) setDocumentLayout()}. <br></DD></DT>
*/

    public final Signal0 documentLayoutChanged = new Signal0();

    private final void documentLayoutChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_documentLayoutChanged(nativeId());
    }
    native void __qt_documentLayoutChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: changed)&gt;:<p> This signal is emitted whenever the content of the document changes in a way that affects the modification state. If <tt>changed</tt> is true, the document has been modified; otherwise it is false. <p>For example, calling setModified(false) on a document and then inserting text causes the signal to get emitted. If you undo that operation, causing the document to return to its original unmodified state, the signal will get emitted again.
*/

    public final Signal1<java.lang.Boolean> modificationChanged = new Signal1<java.lang.Boolean>();

    private final void modificationChanged(boolean m)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_modificationChanged_boolean(nativeId(), m);
    }
    native void __qt_modificationChanged_boolean(long __this__nativeId, boolean m);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted whenever redo operations become available (<tt>available</tt> is true) or unavailable (<tt>available</tt> is false).
*/

    public final Signal1<java.lang.Boolean> redoAvailable = new Signal1<java.lang.Boolean>();

    private final void redoAvailable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redoAvailable_boolean(nativeId(), arg__1);
    }
    native void __qt_redoAvailable_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted whenever undo operations become available (<tt>available</tt> is true) or unavailable (<tt>available</tt> is false). <p>See the {@link <a href="../qundo.html">Qt Undo Framework</a>} documentation for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#undo() undo()}, and {@link com.trolltech.qt.gui.QTextDocument#isUndoRedoEnabled() isUndoRedoEnabled()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> undoAvailable = new Signal1<java.lang.Boolean>();

    private final void undoAvailable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undoAvailable_boolean(nativeId(), arg__1);
    }
    native void __qt_undoAvailable_boolean(long __this__nativeId, boolean arg__1);
/**
 This signal is emitted every time a new level of undo is added to the QTextDocument.
*/

    public final Signal0 undoCommandAdded = new Signal0();

    private final void undoCommandAdded()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undoCommandAdded(nativeId());
    }
    native void __qt_undoCommandAdded(long __this__nativeId);


/**
Constructs an empty QTextDocument with the given <tt>parent</tt>.
*/

    public QTextDocument() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an empty QTextDocument with the given <tt>parent</tt>.
*/

    public QTextDocument(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTextDocument_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextDocument_QObject(long parent);


/**
Constructs a QTextDocument containing the plain (unformatted) <tt>text</tt> specified, and with the given <tt>parent</tt>.
*/

    public QTextDocument(java.lang.String text) {
        this(text, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QTextDocument containing the plain (unformatted) <tt>text</tt> specified, and with the given <tt>parent</tt>.
*/

    public QTextDocument(java.lang.String text, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTextDocument_String_QObject(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextDocument_String_QObject(java.lang.String text, long parent);

/**
Adds the resource <tt>resource</tt> to the resource cache, using <tt>type</tt> and <tt>name</tt> as identifiers. <tt>type</tt> should be a value from {@link com.trolltech.qt.gui.QTextDocument.ResourceType QTextDocument::ResourceType }. <p>For example, you can add an image as a resource in order to reference it from within the document:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    document-&gt;addResource(QTextDocument::ImageResource,
        QUrl("mydata://image.png"), QVariant(image));
</pre> The image can be inserted into the document using the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} API:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QTextImageFormat imageFormat;
    imageFormat.setName("mydata://image.png");
    cursor.insertImage(imageFormat);
</pre> Alternatively, you can insert images using the HTML <tt>img</tt> tag:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    editor-&gt;append("&lt;img src=\"mydata://image.png\" /&gt;");
</pre>
*/

    @QtBlockedSlot
    public final void addResource(int type, com.trolltech.qt.core.QUrl name, java.lang.Object resource)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addResource_int_QUrl_Object(nativeId(), type, name == null ? 0 : name.nativeId(), resource);
    }
    @QtBlockedSlot
    native void __qt_addResource_int_QUrl_Object(long __this__nativeId, int type, long name, java.lang.Object resource);

/**
Adjusts the document to a reasonable size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()}, {@link QTextDocument#textWidth() textWidth}, and {@link QTextDocument#size() size}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void adjustSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjustSize(nativeId());
    }
    @QtBlockedSlot
    native void __qt_adjustSize(long __this__nativeId);

/**
Returns a vector of text formats for all the formats used in the document.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextFormat> allFormats()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allFormats(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextFormat> __qt_allFormats(long __this__nativeId);

/**
Returns the document's first text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#firstBlock() firstBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock begin()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_begin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_begin(long __this__nativeId);

/**
Returns the number of text blocks in the document. <p>The value of this property is undefined in documents with tables or frames. <p>By default, if defined, this property contains a value of 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#lineCount() lineCount()}, and {@link com.trolltech.qt.gui.QTextDocument#characterCount() characterCount()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="blockCount")
    @QtBlockedSlot
    public final int blockCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_blockCount(long __this__nativeId);

/**
Returns the character at position <tt>pos</tt>, or a null character if the position is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#characterCount() characterCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final char characterAt(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_characterAt_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native char __qt_characterAt_int(long __this__nativeId, int pos);

/**
Returns the number of characters of this document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#blockCount() blockCount()}, and {@link com.trolltech.qt.gui.QTextDocument#characterAt(int) characterAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int characterCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_characterCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_characterCount(long __this__nativeId);


/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument clone() {
        return clone((com.trolltech.qt.core.QObject)null);
    }
/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument clone(com.trolltech.qt.core.QObject parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone_QObject(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocument __qt_clone_QObject(long __this__nativeId, long parent);

/**
This property holds the default font used to display the document's text.
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultFont")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont defaultFont()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultFont(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_defaultFont(long __this__nativeId);

/**
The default style sheet is applied to all newly HTML formatted text that is inserted into the document, for example using {@link com.trolltech.qt.gui.QTextDocument#setHtml(java.lang.String) setHtml()} or {@link com.trolltech.qt.gui.QTextCursor#insertHtml(java.lang.String) QTextCursor::insertHtml()}. <p>The style sheet needs to be compliant to CSS 2.1 syntax. <p><b>Note:</b> Changing the default style sheet does not have any effect to the existing content of the document. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultStyleSheet")
    @QtBlockedSlot
    public final java.lang.String defaultStyleSheet()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultStyleSheet(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_defaultStyleSheet(long __this__nativeId);

/**
This property holds the default text option will be set on all {@link com.trolltech.qt.gui.QTextLayout QTextLayout}s in the document.. When {@link com.trolltech.qt.gui.QTextBlock QTextBlock}s are created, the {@link QTextDocument#defaultTextOption() defaultTextOption} is set on their {@link com.trolltech.qt.gui.QTextLayout QTextLayout}. This allows setting global properties for the document such as the default word wrap mode.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextOption defaultTextOption()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultTextOption(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextOption __qt_defaultTextOption(long __this__nativeId);

/**
Returns the document layout for this document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout) setDocumentLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractTextDocumentLayout documentLayout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentLayout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractTextDocumentLayout __qt_documentLayout(long __this__nativeId);

/**
The margin around the document. The default is 4.
*/

    @com.trolltech.qt.QtPropertyReader(name="documentMargin")
    @QtBlockedSlot
    public final double documentMargin()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentMargin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_documentMargin(long __this__nativeId);


/**
Draws the content of the document with painter <tt>p</tt>, clipped to <tt>rect</tt>. If <tt>rect</tt> is a null rectangle (default) then the document is painted unclipped.
*/

    @QtBlockedSlot
    public final void drawContents(com.trolltech.qt.gui.QPainter painter) {
        drawContents(painter, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF());
    }
/**
Draws the content of the document with painter <tt>p</tt>, clipped to <tt>rect</tt>. If <tt>rect</tt> is a null rectangle (default) then the document is painted unclipped.
*/

    @QtBlockedSlot
    public final void drawContents(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRectF rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawContents_QPainter_QRectF(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawContents_QPainter_QRectF(long __this__nativeId, long painter, long rect);

/**
This function returns a block to test for the end of the document while iterating over it. <pre class="snippet">
        for (QTextBlock it = doc.begin(); it != doc.end(); it = it.next())
            System.out.println(it.text());
    </pre> The block returned is invalid and represents the block after the last block in the document. You can use {@link com.trolltech.qt.gui.QTextDocument#lastBlock() lastBlock()} to retrieve the last valid block of the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#lastBlock() lastBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock end()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_end(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_end(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, com.trolltech.qt.gui.QTextCursor from, com.trolltech.qt.gui.QTextDocument.FindFlag ... options) {
        return this.find(expr, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(options));
    }

/**
Finds the next occurrence, matching the regular expression, <tt>expr</tt>, in the document. The search starts at the position of the given <tt>cursor</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. The {@link com.trolltech.qt.gui.QTextDocument.FindFlag FindCaseSensitively } option is ignored for this overload, use QRegExp::caseSensitivity instead. <p>Returns a cursor with the match selected if a match was found; otherwise returns a null cursor. <p>If the given <tt>cursor</tt> has a selection, the search begins after the selection; otherwise it begins at the cursor's position. <p>By default the search is case-sensitive, and can match text anywhere in the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, com.trolltech.qt.gui.QTextCursor from) {
        return find(expr, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }
/**
Finds the next occurrence, matching the regular expression, <tt>expr</tt>, in the document. The search starts at the position of the given <tt>cursor</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. The {@link com.trolltech.qt.gui.QTextDocument.FindFlag FindCaseSensitively } option is ignored for this overload, use QRegExp::caseSensitivity instead. <p>Returns a cursor with the match selected if a match was found; otherwise returns a null cursor. <p>If the given <tt>cursor</tt> has a selection, the search begins after the selection; otherwise it begins at the cursor's position. <p>By default the search is case-sensitive, and can match text anywhere in the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, com.trolltech.qt.gui.QTextCursor from, com.trolltech.qt.gui.QTextDocument.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_QRegExp_QTextCursor_FindFlags(nativeId(), expr == null ? 0 : expr.nativeId(), from == null ? 0 : from.nativeId(), options.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_find_QRegExp_QTextCursor_FindFlags(long __this__nativeId, long expr, long from, int options);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, int from, com.trolltech.qt.gui.QTextDocument.FindFlag ... options) {
        return this.find(expr, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(options));
    }

/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence, matching the regular expression, <tt>expr</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. The {@link com.trolltech.qt.gui.QTextDocument.FindFlag FindCaseSensitively } option is ignored for this overload, use QRegExp::caseSensitivity instead. <p>Returns a cursor with the match selected if a match was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, int from) {
        return find(expr, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence, matching the regular expression, <tt>expr</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. The {@link com.trolltech.qt.gui.QTextDocument.FindFlag FindCaseSensitively } option is ignored for this overload, use QRegExp::caseSensitivity instead. <p>Returns a cursor with the match selected if a match was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr) {
        return find(expr, (int)0, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence, matching the regular expression, <tt>expr</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. The {@link com.trolltech.qt.gui.QTextDocument.FindFlag FindCaseSensitively } option is ignored for this overload, use QRegExp::caseSensitivity instead. <p>Returns a cursor with the match selected if a match was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(com.trolltech.qt.core.QRegExp expr, int from, com.trolltech.qt.gui.QTextDocument.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_QRegExp_int_FindFlags(nativeId(), expr == null ? 0 : expr.nativeId(), from, options.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_find_QRegExp_int_FindFlags(long __this__nativeId, long expr, int from, int options);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, com.trolltech.qt.gui.QTextCursor from, com.trolltech.qt.gui.QTextDocument.FindFlag ... options) {
        return this.find(subString, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(options));
    }

/**
Finds the next occurrence of the string, <tt>subString</tt>, in the document. The search starts at the position of the given <tt>cursor</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. <p>Returns a cursor with the match selected if <tt>subString</tt> was found; otherwise returns a null cursor. <p>If the given <tt>cursor</tt> has a selection, the search begins after the selection; otherwise it begins at the cursor's position. <p>By default the search is case-sensitive, and can match text anywhere in the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, com.trolltech.qt.gui.QTextCursor from) {
        return find(subString, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }
/**
Finds the next occurrence of the string, <tt>subString</tt>, in the document. The search starts at the position of the given <tt>cursor</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. <p>Returns a cursor with the match selected if <tt>subString</tt> was found; otherwise returns a null cursor. <p>If the given <tt>cursor</tt> has a selection, the search begins after the selection; otherwise it begins at the cursor's position. <p>By default the search is case-sensitive, and can match text anywhere in the document.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, com.trolltech.qt.gui.QTextCursor from, com.trolltech.qt.gui.QTextDocument.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_String_QTextCursor_FindFlags(nativeId(), subString, from == null ? 0 : from.nativeId(), options.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_find_String_QTextCursor_FindFlags(long __this__nativeId, java.lang.String subString, long from, int options);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, int from, com.trolltech.qt.gui.QTextDocument.FindFlag ... options) {
        return this.find(subString, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(options));
    }

/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence of the string, <tt>subString</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. <p>Returns a cursor with the match selected if <tt>subString</tt> was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, int from) {
        return find(subString, from, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence of the string, <tt>subString</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. <p>Returns a cursor with the match selected if <tt>subString</tt> was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString) {
        return find(subString, (int)0, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>Finds the next occurrence of the string, <tt>subString</tt>, in the document. The search starts at the given <tt>position</tt>, and proceeds forwards through the document unless specified otherwise in the search options. The <tt>options</tt> control the type of search performed. <p>Returns a cursor with the match selected if <tt>subString</tt> was found; otherwise returns a null cursor. <p>If the <tt>position</tt> is 0 (the default) the search begins from the beginning of the document; otherwise it begins at the specified position.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor find(java.lang.String subString, int from, com.trolltech.qt.gui.QTextDocument.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_String_int_FindFlags(nativeId(), subString, from, options.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_find_String_int_FindFlags(long __this__nativeId, java.lang.String subString, int from, int options);

/**
Returns the text block that contains the <tt>pos</tt>-th character.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock findBlock(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findBlock_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_findBlock_int(long __this__nativeId, int pos);

/**
Returns the text block that contains the specified <tt>lineNumber</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#firstLineNumber() QTextBlock::firstLineNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock findBlockByLineNumber(int blockNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findBlockByLineNumber_int(nativeId(), blockNumber);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_findBlockByLineNumber_int(long __this__nativeId, int blockNumber);

/**
Returns the text block with the specified <tt>blockNumber</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#blockNumber() QTextBlock::blockNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock findBlockByNumber(int blockNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findBlockByNumber_int(nativeId(), blockNumber);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_findBlockByNumber_int(long __this__nativeId, int blockNumber);

/**
Returns the document's first text block.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock firstBlock()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_firstBlock(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_firstBlock(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame frameAt(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameAt_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_frameAt_int(long __this__nativeId, int pos);

/**
Returns the ideal width of the text document. The ideal width is the actually used width of the document without optional alignments taken into account. It is always &lt;= {@link com.trolltech.qt.gui.QTextDocument#size() size()}.width(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#adjustSize() adjustSize()}, and {@link QTextDocument#textWidth() textWidth}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double idealWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_idealWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_idealWidth(long __this__nativeId);

/**
Returns the width used for text list and text block indenting. <p>The indent properties of {@link com.trolltech.qt.gui.QTextListFormat QTextListFormat} and {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat} specify multiples of this value. The default indent width is 40.
*/

    @com.trolltech.qt.QtPropertyReader(name="indentWidth")
    @QtBlockedSlot
    public final double indentWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indentWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_indentWidth(long __this__nativeId);

/**
Returns true if the document is empty; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
This property holds whether the document has been modified by the user. By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#modificationChanged modificationChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="modified")
    @com.trolltech.qt.QtPropertyDesignable("false")
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
Returns true if redo is available; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isRedoAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRedoAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRedoAvailable(long __this__nativeId);

/**
Returns true if undo is available; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isUndoAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isUndoAvailable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isUndoAvailable(long __this__nativeId);

/**
This property holds whether undo/redo are enabled for this document. This defaults to true. If disabled, the undo stack is cleared and no items will be added to it.
*/

    @com.trolltech.qt.QtPropertyReader(name="undoRedoEnabled")
    @QtBlockedSlot
    public final boolean isUndoRedoEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isUndoRedoEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isUndoRedoEnabled(long __this__nativeId);

/**
Returns the document's last (valid) text block.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextBlock lastBlock()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastBlock(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_lastBlock(long __this__nativeId);

/**
Returns the number of lines of this document (if the layout supports this). Otherwise, this is identical to the number of blocks. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#blockCount() blockCount()}, and {@link com.trolltech.qt.gui.QTextDocument#characterCount() characterCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lineCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineCount(long __this__nativeId);

/**
Marks the contents specified by the given <tt>position</tt> and <tt>length</tt> as "dirty", informing the document that it needs to be laid out again.
*/

    @QtBlockedSlot
    public final void markContentsDirty(int from, int length)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_markContentsDirty_int_int(nativeId(), from, length);
    }
    @QtBlockedSlot
    native void __qt_markContentsDirty_int_int(long __this__nativeId, int from, int length);

/**
This property Specifies the limit for blocks in the document.  Specifies the maximum number of blocks the document may have. If there are more blocks in the document that specified with this property blocks are removed from the beginning of the document. <p>A negative or zero value specifies that the document may contain an unlimited amount of blocks. <p>The default value is 0. <p>Note that setting this property will apply the limit immediately to the document contents. <p>Setting this property also disables the undo redo history. <p>This property is undefined in documents with tables or frames.
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumBlockCount")
    @QtBlockedSlot
    public final int maximumBlockCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumBlockCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximumBlockCount(long __this__nativeId);

/**
Returns meta information about the document of the type specified by <tt>info</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setMetaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation, java.lang.String) setMetaInformation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String metaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation info)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaInformation_MetaInformation(nativeId(), info.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_metaInformation_MetaInformation(long __this__nativeId, int info);

/**
Returns the text object associated with the given <tt>objectIndex</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextObject object(int objectIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_object_int(nativeId(), objectIndex);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextObject __qt_object_int(long __this__nativeId, int objectIndex);

/**
Returns the text object associated with the format <tt>f</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextObject objectForFormat(com.trolltech.qt.gui.QTextFormat arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_objectForFormat_QTextFormat(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextObject __qt_objectForFormat_QTextFormat(long __this__nativeId, long arg__1);

/**
returns the number of pages in this document.
*/

    @QtBlockedSlot
    public final int pageCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageCount(long __this__nativeId);

/**
This property holds the page size that should be used for laying out the document. By default, for a newly-created, empty document, this property contains an undefined size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#modificationChanged modificationChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="pageSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF pageSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_pageSize(long __this__nativeId);

/**
Prints the document to the given <tt>printer</tt>. The {@link com.trolltech.qt.gui.QPrinter QPrinter} must be set up before being used with this function. <p>This is only a convenience method to print the whole document to the printer. <p>If the document is already paginated through a specified height in the {@link com.trolltech.qt.gui.QTextDocument#pageSize() pageSize()} property it is printed as-is. <p>If the document is not paginated, like for example a document used in a {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, then a temporary copy of the document is created and the copy is broken into multiple pages according to the size of the {@link com.trolltech.qt.gui.QPrinter QPrinter}'s paperRect(). By default a 2 cm margin is set around the document contents. In addition the current page number is printed at the bottom of each page. <p>Note that {@link com.trolltech.qt.gui.QPrinter.PrintRange QPrinter::Selection } is not supported as print range with this function since the selection is a property of {@link com.trolltech.qt.gui.QTextCursor QTextCursor}. If you have a {@link com.trolltech.qt.gui.QTextEdit QTextEdit} associated with your QTextDocument then you can use {@link com.trolltech.qt.gui.QTextEdit QTextEdit}'s {@link com.trolltech.qt.gui.QTextDocument#print(com.trolltech.qt.gui.QPrinter) print()} function because {@link com.trolltech.qt.gui.QTextEdit QTextEdit} has access to the user's selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#print(com.trolltech.qt.gui.QPrinter) QTextEdit::print()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void print(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_print_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    @QtBlockedSlot
    native void __qt_print_QPrinter(long __this__nativeId, long printer);

/**
This is an overloaded member function, provided for convenience. <p>Redoes the last editing operation on the document if {@link com.trolltech.qt.gui.QTextDocument#isRedoAvailable() redo is available}.
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

    @QtBlockedSlot
    private final void redo(com.trolltech.qt.QNativePointer cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo_nativepointer(nativeId(), cursor);
    }
    @QtBlockedSlot
    native void __qt_redo_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer cursor);

/**
Returns data of the specified <tt>type</tt> from the resource with the given <tt>name</tt>. <p>This function is called by the rich text engine to request data that isn't directly stored by QTextDocument, but still associated with it. For example, images are referenced indirectly by the name attribute of a {@link com.trolltech.qt.gui.QTextImageFormat QTextImageFormat} object. <p>Resources are cached internally in the document. If a resource can not be found in the cache, loadResource is called to try to load the resource. loadResource should then use addResource to add the resource to the cache. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument.ResourceType QTextDocument::ResourceType }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object resource(int type, com.trolltech.qt.core.QUrl name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resource_int_QUrl(nativeId(), type, name == null ? 0 : name.nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_resource_int_QUrl(long __this__nativeId, int type, long name);

/**
Returns the document's revision (if undo is enabled). <p>The revision is guaranteed to increase when a document that is not modified is edited. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#revision() QTextBlock::revision()}, and {@link com.trolltech.qt.gui.QTextDocument#isModified() isModified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int revision()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_revision(nativeId());
    }
    @QtBlockedSlot
    native int __qt_revision(long __this__nativeId);

/**
Returns the document's root frame.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrame rootFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFrame __qt_rootFrame(long __this__nativeId);

/**
This property holds the default font used to display the document's text.
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultFont")
    @QtBlockedSlot
    public final void setDefaultFont(com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultFont_QFont(nativeId(), font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDefaultFont_QFont(long __this__nativeId, long font);

/**
The default style sheet is applied to all newly HTML formatted text that is inserted into the document, for example using {@link com.trolltech.qt.gui.QTextDocument#setHtml(java.lang.String) setHtml()} or {@link com.trolltech.qt.gui.QTextCursor#insertHtml(java.lang.String) QTextCursor::insertHtml()}. <p>The style sheet needs to be compliant to CSS 2.1 syntax. <p><b>Note:</b> Changing the default style sheet does not have any effect to the existing content of the document. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultStyleSheet")
    @QtBlockedSlot
    public final void setDefaultStyleSheet(java.lang.String sheet)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultStyleSheet_String(nativeId(), sheet);
    }
    @QtBlockedSlot
    native void __qt_setDefaultStyleSheet_String(long __this__nativeId, java.lang.String sheet);

/**
This property holds the default text option will be set on all {@link com.trolltech.qt.gui.QTextLayout QTextLayout}s in the document.. When {@link com.trolltech.qt.gui.QTextBlock QTextBlock}s are created, the {@link QTextDocument#defaultTextOption() defaultTextOption} is set on their {@link com.trolltech.qt.gui.QTextLayout QTextLayout}. This allows setting global properties for the document such as the default word wrap mode.
*/

    @QtBlockedSlot
    public final void setDefaultTextOption(com.trolltech.qt.gui.QTextOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultTextOption_QTextOption(nativeId(), option == null ? 0 : option.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDefaultTextOption_QTextOption(long __this__nativeId, long option);

/**
Sets the document to use the given <tt>layout</tt>. The previous layout is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#documentLayoutChanged documentLayoutChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDocumentLayout(com.trolltech.qt.gui.QAbstractTextDocumentLayout layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (layout != null) {
            layout.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentLayout_QAbstractTextDocumentLayout(nativeId(), layout == null ? 0 : layout.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDocumentLayout_QAbstractTextDocumentLayout(long __this__nativeId, long layout);

/**
The margin around the document. The default is 4.
*/

    @com.trolltech.qt.QtPropertyWriter(name="documentMargin")
    @QtBlockedSlot
    public final void setDocumentMargin(double margin)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setDocumentMargin_double(long __this__nativeId, double margin);

/**
Replaces the entire contents of the document with the given HTML-formatted text in the <tt>html</tt> string. <p>The HTML formatting is respected as much as possible; for example, "&lt;b&gt;bold&lt;/b&gt; text" will produce text where the first word has a font weight that gives it a bold appearance: "<b>bold</b> text". <p><b>Note:</b> It is the responsibility of the caller to make sure that the text is correctly decoded when a QString containing HTML is created and passed to {@link com.trolltech.qt.gui.QTextDocument#setHtml(java.lang.String) setHtml()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setPlainText(java.lang.String) setPlainText()}, and {@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHtml(java.lang.String html)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHtml_String(nativeId(), html);
    }
    @QtBlockedSlot
    native void __qt_setHtml_String(long __this__nativeId, java.lang.String html);

/**
Returns the width used for text list and text block indenting. <p>The indent properties of {@link com.trolltech.qt.gui.QTextListFormat QTextListFormat} and {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat} specify multiples of this value. The default indent width is 40.
*/

    @com.trolltech.qt.QtPropertyWriter(name="indentWidth")
    @QtBlockedSlot
    public final void setIndentWidth(double width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndentWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setIndentWidth_double(long __this__nativeId, double width);

/**
This property Specifies the limit for blocks in the document.  Specifies the maximum number of blocks the document may have. If there are more blocks in the document that specified with this property blocks are removed from the beginning of the document. <p>A negative or zero value specifies that the document may contain an unlimited amount of blocks. <p>The default value is 0. <p>Note that setting this property will apply the limit immediately to the document contents. <p>Setting this property also disables the undo redo history. <p>This property is undefined in documents with tables or frames.
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumBlockCount")
    @QtBlockedSlot
    public final void setMaximumBlockCount(int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumBlockCount_int(nativeId(), maximum);
    }
    @QtBlockedSlot
    native void __qt_setMaximumBlockCount_int(long __this__nativeId, int maximum);

/**
Sets the document's meta information of the type specified by <tt>info</tt> to the given <tt>string</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#metaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation) metaInformation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMetaInformation(com.trolltech.qt.gui.QTextDocument.MetaInformation info, java.lang.String arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMetaInformation_MetaInformation_String(nativeId(), info.value(), arg__2);
    }
    @QtBlockedSlot
    native void __qt_setMetaInformation_MetaInformation_String(long __this__nativeId, int info, java.lang.String arg__2);


/**
This property holds whether the document has been modified by the user. By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#modificationChanged modificationChanged() }. <br></DD></DT>
*/

    public final void setModified() {
        setModified((boolean)true);
    }
/**
This property holds whether the document has been modified by the user. By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#modificationChanged modificationChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="modified")
    public final void setModified(boolean m)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModified_boolean(nativeId(), m);
    }
    native void __qt_setModified_boolean(long __this__nativeId, boolean m);

/**
This property holds the page size that should be used for laying out the document. By default, for a newly-created, empty document, this property contains an undefined size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#modificationChanged modificationChanged() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="pageSize")
    @QtBlockedSlot
    public final void setPageSize(com.trolltech.qt.core.QSizeF size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageSize_QSizeF(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPageSize_QSizeF(long __this__nativeId, long size);

/**
Replaces the entire contents of the document with the given plain <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setHtml(java.lang.String) setHtml()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPlainText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPlainText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setPlainText_String(long __this__nativeId, java.lang.String text);

/**
The text width specifies the preferred width for text in the document. If the text (or content in general) is wider than the specified with it is broken into multiple lines and grows vertically. If the text cannot be broken into multiple lines to fit into the specified text width it will be larger and the {@link com.trolltech.qt.gui.QTextDocument#size() size()} and the {@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()} property will reflect that. <p>If the text width is set to -1 then the text will not be broken into multiple lines unless it is enforced through an explicit line break or a new paragraph. <p>The default value is -1. <p>Setting the text width will also set the page height to -1, causing the document to grow or shrink vertically in a continuous way. If you want the document layout to break the text into multiple pages then you have to set the {@link QTextDocument#pageSize() pageSize} property instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#size() size()}, {@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()}, and {@link com.trolltech.qt.gui.QTextDocument#pageSize() pageSize()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textWidth")
    @QtBlockedSlot
    public final void setTextWidth(double width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setTextWidth_double(long __this__nativeId, double width);

/**
This property holds whether undo/redo are enabled for this document. This defaults to true. If disabled, the undo stack is cleared and no items will be added to it.
*/

    @com.trolltech.qt.QtPropertyWriter(name="undoRedoEnabled")
    @QtBlockedSlot
    public final void setUndoRedoEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUndoRedoEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setUndoRedoEnabled_boolean(long __this__nativeId, boolean enable);

/**
If <tt>b</tt> is true then the layout will use design metrics; otherwise it will
use the metrics of the paint device (which is the default behavior).
*/

    @com.trolltech.qt.QtPropertyWriter(name="useDesignMetrics")
    @QtBlockedSlot
    public final void setUseDesignMetrics(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUseDesignMetrics_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setUseDesignMetrics_boolean(long __this__nativeId, boolean b);

/**
Returns the actual size of the document. This is equivalent to {@link com.trolltech.qt.gui.QTextDocument#documentLayout() documentLayout()}-&gt;documentSize(); <p>The size of the document can be changed either by setting a text width or setting an entire page size. <p>Note that the width is always &gt;= {@link com.trolltech.qt.gui.QTextDocument#pageSize() pageSize()}.width(). <p>By default, for a newly-created, empty document, this property contains a configuration-dependent size. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#setTextWidth(double) setTextWidth()}, {@link com.trolltech.qt.gui.QTextDocument#setPageSize(com.trolltech.qt.core.QSizeF) setPageSize()}, and {@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="size")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF size()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_size(long __this__nativeId);

/**
The text width specifies the preferred width for text in the document. If the text (or content in general) is wider than the specified with it is broken into multiple lines and grows vertically. If the text cannot be broken into multiple lines to fit into the specified text width it will be larger and the {@link com.trolltech.qt.gui.QTextDocument#size() size()} and the {@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()} property will reflect that. <p>If the text width is set to -1 then the text will not be broken into multiple lines unless it is enforced through an explicit line break or a new paragraph. <p>The default value is -1. <p>Setting the text width will also set the page height to -1, causing the document to grow or shrink vertically in a continuous way. If you want the document layout to break the text into multiple pages then you have to set the {@link QTextDocument#pageSize() pageSize} property instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#size() size()}, {@link com.trolltech.qt.gui.QTextDocument#idealWidth() idealWidth()}, and {@link com.trolltech.qt.gui.QTextDocument#pageSize() pageSize()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textWidth")
    @QtBlockedSlot
    public final double textWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_textWidth(long __this__nativeId);


/**
Returns a string containing an HTML representation of the document. <p>The <tt>encoding</tt> parameter specifies the value for the charset attribute in the html header. For example if 'utf-8' is specified then the beginning of the generated html will look like this:Error parsing snippet.</pre> If no encoding is specified then no such meta information is generated. <p>If you later on convert the returned html string into a byte array for transmission over a network or when saving to disk you should specify the encoding you're going to use for the conversion to a byte array here. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toHtml() {
        return toHtml((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Returns a string containing an HTML representation of the document. <p>The <tt>encoding</tt> parameter specifies the value for the charset attribute in the html header. For example if 'utf-8' is specified then the beginning of the generated html will look like this:Error parsing snippet.</pre> If no encoding is specified then no such meta information is generated. <p>If you later on convert the returned html string into a byte array for transmission over a network or when saving to disk you should specify the encoding you're going to use for the conversion to a byte array here. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String toHtml(com.trolltech.qt.core.QByteArray encoding)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHtml_QByteArray(nativeId(), encoding == null ? 0 : encoding.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toHtml_QByteArray(long __this__nativeId, long encoding);

/**
Returns the plain text contained in the document. If you want formatting information use a {@link com.trolltech.qt.gui.QTextCursor QTextCursor} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#toHtml() toHtml()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience.
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

    @QtBlockedSlot
    private final void undo(com.trolltech.qt.QNativePointer cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo_nativepointer(nativeId(), cursor);
    }
    @QtBlockedSlot
    native void __qt_undo_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer cursor);

/**
Returns true if this QTextDocument uses design metrics.
*/

    @com.trolltech.qt.QtPropertyReader(name="useDesignMetrics")
    @QtBlockedSlot
    public final boolean useDesignMetrics()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_useDesignMetrics(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_useDesignMetrics(long __this__nativeId);

/**
Clears the document.
*/

    @QtBlockedSlot
    public void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Creates and returns a new document object (a {@link com.trolltech.qt.gui.QTextObject QTextObject}), based on the given <tt>format</tt>. <p>QTextObjects will always get created through this method, so you must reimplement it if you use custom text objects inside your document.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QTextObject createObject(com.trolltech.qt.gui.QTextFormat f)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createObject_QTextFormat(nativeId(), f == null ? 0 : f.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextObject __qt_createObject_QTextFormat(long __this__nativeId, long f);

/**
Loads data of the specified <tt>type</tt> from the resource with the given <tt>name</tt>. <p>This function is called by the rich text engine to request data that isn't directly stored by QTextDocument, but still associated with it. For example, images are referenced indirectly by the name attribute of a {@link com.trolltech.qt.gui.QTextImageFormat QTextImageFormat} object. <p>When called by Qt, <tt>type</tt> is one of the values of {@link com.trolltech.qt.gui.QTextDocument.ResourceType QTextDocument::ResourceType }. <p>If the QTextDocument is a child object of a {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser}, or a QTextDocument itself then the default implementation tries to retrieve the data from the parent.
*/

    @QtBlockedSlot
    protected java.lang.Object loadResource(int type, com.trolltech.qt.core.QUrl name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadResource_int_QUrl(nativeId(), type, name == null ? 0 : name.nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_loadResource_int_QUrl(long __this__nativeId, int type, long name);

/**
@exclude
*/

    public static native QTextDocument fromNativePointer(QNativePointer nativePointer);

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

    protected QTextDocument(QPrivateConstructor p) { super(p); } 

/**
Redoes the last editing operation on the document if
QTextDocument.isRedoAvailable() redo is available.
<p>
The provided <tt>cursor</tt> is positioned at the end of the location where
the edition operation was redone.
*/

    public final void redo(QTextCursor cursor) {
        redo(cursor.nativePointer());
    }

/**
Undoes the last editing operation on the document if undo is
available. The provided <tt>cursor</tt> is positioned at the end of the
location where the edition operation was undone.
<p>
See the \l {Overview of Qt's Undo Framework}{Qt Undo Framework}
documentation for details.
*/

    public final void undo(QTextCursor cursor) {
        undo(cursor.nativePointer());
    }

}
