package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextEdit class provides a widget that is used to edit and display both plain and rich text. <ul><li> {@link <a href="#introduction-and-concepts">Introduction and Concepts</a>}</li><li> {@link <a href="#using-qtextedit-as-a-display-widget">Using QTextEdit as a Display Widget</a>}</li> <ul><li> {@link <a href="#read-only-key-bindings">Read-only Key Bindings</a>}</li></ul><li> {@link <a href="#using-qtextedit-as-an-editor">Using QTextEdit as an Editor</a>}</li> <ul><li> {@link <a href="#drag-and-drop">Drag and Drop</a>}</li><li> {@link <a href="#editing-key-bindings">Editing Key Bindings</a>}</li></ul></ul><a name="introduction-and-concepts"><h2>Introduction and Concepts</h2> QTextEdit is an advanced WYSIWYG viewer/editor supporting rich text formatting using HTML-style tags. It is optimized to handle large documents and to respond quickly to user input. <p>QTextEdit works on paragraphs and characters. A paragraph is a formatted string which is word-wrapped to fit into the width of the widget. By default when reading plain text, one newline signifies a paragraph. A document consists of zero or more paragraphs. The words in the paragraph are aligned in accordance with the paragraph's alignment. Paragraphs are separated by hard line breaks. Each character within a paragraph has its own attributes, for example, font and color. <p>QTextEdit can display images, lists and tables. If the text is too large to view within the text edit's viewport, scroll bars will appear. The text edit can load both plain text and HTML files (a subset of HTML 3.2 and 4). <p>If you just need to display a small piece of rich text use {@link com.trolltech.qt.gui.QLabel QLabel}. <p>The rich text support in Qt is designed to provide a fast, portable and efficient way to add reasonable online help facilities to applications, and to provide a basis for rich text editors. If you find the HTML support insufficient for your needs you may consider the use of {@link <a href="../qtwebkit.html">QtWebKit</a>}, which provides a full-featured web browser widget. <p>The shape of the mouse cursor on a QTextEdit is {@link com.trolltech.qt.core.Qt.CursorShape Qt::IBeamCursor } by default. It can be changed through the {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()}'s cursor property.<a name="using-qtextedit-as-a-display-widget"><h2>Using QTextEdit as a Display Widget</h2> QTextEdit can display a large HTML subset, including tables and images. <p>The text is set or replaced using {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} which deletes any existing text and replaces it with the text passed in the {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} call. If you call {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} with legacy HTML, and then call {@link com.trolltech.qt.gui.QTextEdit#toHtml() toHtml()}, the text that is returned may have different markup, but will render the same. The entire text can be deleted with {@link com.trolltech.qt.gui.QTextEdit#clear() clear()}. <p>Text itself can be inserted using the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} class or using the convenience functions {@link com.trolltech.qt.gui.QTextEdit#insertHtml(java.lang.String) insertHtml()}, {@link com.trolltech.qt.gui.QTextEdit#insertPlainText(java.lang.String) insertPlainText()}, {@link com.trolltech.qt.gui.QTextEdit#append(java.lang.String) append()} or {@link com.trolltech.qt.gui.QTextEdit#paste() paste()}. {@link com.trolltech.qt.gui.QTextCursor QTextCursor} is also able to insert complex objects like tables or lists into the document, and it deals with creating selections and applying changes to selected text. <p>By default the text edit wraps words at whitespace to fit within the text edit widget. The {@link com.trolltech.qt.gui.QTextEdit#setLineWrapMode(com.trolltech.qt.gui.QTextEdit.LineWrapMode) setLineWrapMode()} function is used to specify the kind of line wrap you want, or {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode NoWrap } if you don't want any wrapping. Call {@link com.trolltech.qt.gui.QTextEdit#setLineWrapMode(com.trolltech.qt.gui.QTextEdit.LineWrapMode) setLineWrapMode()} to set a fixed pixel width {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedPixelWidth }, or character column (e.g. 80 column) {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedColumnWidth } with the pixels or columns specified with {@link com.trolltech.qt.gui.QTextEdit#setLineWrapColumnOrWidth(int) setLineWrapColumnOrWidth()}. If you use word wrap to the widget's width {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode WidgetWidth }, you can specify whether to break on whitespace or anywhere with {@link com.trolltech.qt.gui.QTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}. <p>The {@link com.trolltech.qt.gui.QTextEdit#find(java.lang.String, com.trolltech.qt.gui.QTextDocument.FindFlag[]) find()} function can be used to find and select a given string within the text. <p>If you want to limit the total number of paragraphs in a QTextEdit, as it is for example open useful in a log viewer, then you can use {@link com.trolltech.qt.gui.QTextDocument QTextDocument}'s maximumBlockCount property for that.<a name="read-only-key-bindings"><h3>Read-only Key Bindings</h3> When QTextEdit is used read-only the key bindings are limited to navigation, and text may only be selected with the mouse: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Keypresses</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> Up</td><td> Moves one line up.</td></tr><tr valign="top" class="odd"><td> Down</td><td> Moves one line down.</td></tr><tr valign="top" class="even"><td> Left</td><td> Moves one character to the left.</td></tr><tr valign="top" class="odd"><td> Right</td><td> Moves one character to the right.</td></tr><tr valign="top" class="even"><td> PageUp</td><td> Moves one (viewport) page up.</td></tr><tr valign="top" class="odd"><td> PageDown</td><td> Moves one (viewport) page down.</td></tr><tr valign="top" class="even"><td> Home</td><td> Moves to the beginning of the text.</td></tr><tr valign="top" class="odd"><td> End</td><td> Moves to the end of the text.</td></tr><tr valign="top" class="even"><td> Alt+Wheel</td><td> Scrolls the page horizontally (the Wheel is the mouse wheel).</td></tr><tr valign="top" class="odd"><td> Ctrl+Wheel</td><td> Zooms the text.</td></tr><tr valign="top" class="even"><td> Ctrl+A</td><td> Selects all text.</td></tr></table> The text edit may be able to provide some meta-information. For example, the {@link com.trolltech.qt.gui.QTextEdit#documentTitle() documentTitle()} function will return the text from within HTML <tt>&lt;title&gt;</tt> tags.<a name="using-qtextedit-as-an-editor"><h2>Using QTextEdit as an Editor</h2> All the information about using QTextEdit as a display widget also applies here. <p>The current char format's attributes are set with {@link com.trolltech.qt.gui.QTextEdit#setFontItalic(boolean) setFontItalic()}, {@link com.trolltech.qt.gui.QTextEdit#setFontWeight(int) setFontWeight()}, {@link com.trolltech.qt.gui.QTextEdit#setFontUnderline(boolean) setFontUnderline()}, {@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}, {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}, {@link com.trolltech.qt.gui.QTextEdit#setTextColor(com.trolltech.qt.gui.QColor) setTextColor()} and {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}. The current paragraph's alignment is set with {@link com.trolltech.qt.gui.QTextEdit#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <p>Selection of text is handled by the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} class, which provides functionality for creating selections, retrieving the text contents or deleting selections. You can retrieve the object that corresponds with the user-visible cursor using the {@link com.trolltech.qt.gui.QTextEdit#textCursor() textCursor()} method. If you want to set a selection in QTextEdit just create one on a {@link com.trolltech.qt.gui.QTextCursor QTextCursor} object and then make that cursor the visible cursor using {@link com.trolltech.qt.gui.QTextEdit#setTextCursor(com.trolltech.qt.gui.QTextCursor) setTextCursor()}. The selection can be copied to the clipboard with {@link com.trolltech.qt.gui.QTextEdit#copy() copy()}, or cut to the clipboard with {@link com.trolltech.qt.gui.QTextEdit#cut() cut()}. The entire text can be selected using {@link com.trolltech.qt.gui.QTextEdit#selectAll() selectAll()}. <p>When the cursor is moved and the underlying formatting attributes change, the {@link com.trolltech.qt.gui.QTextEdit#currentCharFormatChanged currentCharFormatChanged() } signal is emitted to reflect the new attributes at the new cursor position. <p>QTextEdit holds a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} object which can be retrieved using the {@link com.trolltech.qt.gui.QTextEdit#document() document()} method. You can also set your own document object using {@link com.trolltech.qt.gui.QTextEdit#setDocument(com.trolltech.qt.gui.QTextDocument) setDocument()}. {@link com.trolltech.qt.gui.QTextDocument QTextDocument} emits a {@link com.trolltech.qt.gui.QTextEdit#textChanged textChanged() } signal if the text changes and it also provides a isModified() function which will return true if the text has been modified since it was either loaded or since the last call to setModified with false as argument. In addition it provides methods for undo and redo.<a name="drag-and-drop"><h3>Drag and Drop</h3> QTextEdit also supports custom drag and drop behavior. By default, QTextEdit will insert plain text, HTML and rich text when the user drops data of these MIME types onto a document. Reimplement {@link com.trolltech.qt.gui.QTextEdit#canInsertFromMimeData(com.trolltech.qt.core.QMimeData) canInsertFromMimeData()} and {@link com.trolltech.qt.gui.QTextEdit#insertFromMimeData(com.trolltech.qt.core.QMimeData) insertFromMimeData()} to add support for additional MIME types. <p>For example, to allow the user to drag and drop an image onto a QTextEdit, you could the implement these functions in the following way: <pre class="snippet">
    public boolean canInsertFromMimeData(QMimeData source)
    {
        if (source.hasImage())
            return true;
        else
            return super.canInsertFromMimeData(source);
    }
    </pre> We add support for image MIME types by returning true. For all other MIME types, we use the default implementation. <pre class="snippet">
    public void insertFromMimeData(QMimeData source)
    {
        if (source.hasImage())
        {
            QImage image = (QImage) source.imageData();
            QTextCursor cursor = this.textCursor();
            QTextDocument document = this.document();
            document.addResource(QTextDocument.ResourceType.ImageResource.value(),
                                 new QUrl("image"), image);
            cursor.insertImage("image");
        }
    }
    </pre> We unpack the image from the {@link com.trolltech.qt.QVariant QVariant} held by the MIME source and insert it into the document as a resource.<a name="editing-key-bindings"><h3>Editing Key Bindings</h3> The list of key bindings which are implemented for editing: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Keypresses</center></th><th><center> Action</center></th></tr></thead><tr valign="top" class="even"><td> Backspace</td><td> Deletes the character to the left of the cursor.</td></tr><tr valign="top" class="odd"><td> Delete</td><td> Deletes the character to the right of the cursor.</td></tr><tr valign="top" class="even"><td> Ctrl+C</td><td> Copy the selected text to the clipboard.</td></tr><tr valign="top" class="odd"><td> Ctrl+Insert</td><td> Copy the selected text to the clipboard.</td></tr><tr valign="top" class="even"><td> Ctrl+K</td><td> Deletes to the end of the line.</td></tr><tr valign="top" class="odd"><td> Ctrl+V</td><td> Pastes the clipboard text into text edit.</td></tr><tr valign="top" class="even"><td> Shift+Insert</td><td> Pastes the clipboard text into text edit.</td></tr><tr valign="top" class="odd"><td> Ctrl+X</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="even"><td> Shift+Delete</td><td> Deletes the selected text and copies it to the clipboard.</td></tr><tr valign="top" class="odd"><td> Ctrl+Z</td><td> Undoes the last operation.</td></tr><tr valign="top" class="even"><td> Ctrl+Y</td><td> Redoes the last operation.</td></tr><tr valign="top" class="odd"><td> Left</td><td> Moves the cursor one character to the left.</td></tr><tr valign="top" class="even"><td> Ctrl+Left</td><td> Moves the cursor one word to the left.</td></tr><tr valign="top" class="odd"><td> Right</td><td> Moves the cursor one character to the right.</td></tr><tr valign="top" class="even"><td> Ctrl+Right</td><td> Moves the cursor one word to the right.</td></tr><tr valign="top" class="odd"><td> Up</td><td> Moves the cursor one line up.</td></tr><tr valign="top" class="even"><td> Down</td><td> Moves the cursor one line down.</td></tr><tr valign="top" class="odd"><td> PageUp</td><td> Moves the cursor one page up.</td></tr><tr valign="top" class="even"><td> PageDown</td><td> Moves the cursor one page down.</td></tr><tr valign="top" class="odd"><td> Home</td><td> Moves the cursor to the beginning of the line.</td></tr><tr valign="top" class="even"><td> Ctrl+Home</td><td> Moves the cursor to the beginning of the text.</td></tr><tr valign="top" class="odd"><td> End</td><td> Moves the cursor to the end of the line.</td></tr><tr valign="top" class="even"><td> Ctrl+End</td><td> Moves the cursor to the end of the text.</td></tr><tr valign="top" class="odd"><td> Alt+Wheel</td><td> Scrolls the page horizontally (the Wheel is the mouse wheel).</td></tr></table> To select (mark) text hold down the Shift key whilst pressing one of the movement keystrokes, for example, Shift+Right will select the character to the right, and Shift+Ctrl+Right will select the word to the right, etc. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument QTextDocument}, {@link com.trolltech.qt.gui.QTextCursor QTextCursor}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../qtjambi-syntaxhighlighter.html">Syntax Highlighter Example</a>}, and {@link <a href="../richtext.html">Rich Text Processing</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextEdit extends com.trolltech.qt.gui.QAbstractScrollArea
{

    private Object __rcDocument = null;
    @QtBlockedEnum
    public enum AutoFormattingFlag implements com.trolltech.qt.QtEnumerator {
/**
 Don't do any automatic formatting.
*/

        AutoNone(0),
/**
 Automatically create bullet lists (e.g. when the user enters an asterisk ('*') in the left most column, or presses Enter in an existing list item.
*/

        AutoBulletList(1),
/**
 Apply all automatic formatting. Currently only automatic bullet lists are supported.
*/

        AutoAll(-1);

        AutoFormattingFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QTextEdit$AutoFormatting with the specified <tt>com.trolltech.qt.gui.QTextEdit$AutoFormattingFlag[]</tt> QTextEdit$AutoFormattingFlag values set.</brief>
*/

        public static AutoFormatting createQFlags(AutoFormattingFlag ... values) {
            return new AutoFormatting(values);
        }
/**
<brief>Returns the QTextEdit$AutoFormattingFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static AutoFormattingFlag resolve(int value) {
            return (AutoFormattingFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AutoNone;
            case 1: return AutoBulletList;
            case -1: return AutoAll;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class AutoFormatting extends com.trolltech.qt.QFlags<AutoFormattingFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextEdit-AutoFormatting with the specified <tt>com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag[]</tt>. flags set.</brief>
*/

        public AutoFormatting(AutoFormattingFlag ... args) { super(args); }
        public AutoFormatting(int value) { setValue(value); }
    }

    public enum LineWrapMode implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoWrap(0),
/**

*/

        WidgetWidth(1),
/**

*/

        FixedPixelWidth(2),
/**

*/

        FixedColumnWidth(3);

        LineWrapMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextEdit$LineWrapMode constant with the specified <tt>int</tt>.</brief>
*/

        public static LineWrapMode resolve(int value) {
            return (LineWrapMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoWrap;
            case 1: return WidgetWidth;
            case 2: return FixedPixelWidth;
            case 3: return FixedColumnWidth;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: yes)&gt;:<p> This signal is emitted when text is selected or de-selected in the text edit. <p>When text is selected this signal will be emitted with <tt>yes</tt> set to true. If no text has been selected or if the selected text is de-selected this signal is emitted with <tt>yes</tt> set to false. <p>If <tt>yes</tt> is true then {@link com.trolltech.qt.gui.QTextEdit#copy() copy()} can be used to copy the selection to the clipboard. If <tt>yes</tt> is false then {@link com.trolltech.qt.gui.QTextEdit#copy() copy()} does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#selectionChanged selectionChanged() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> copyAvailable = new Signal1<java.lang.Boolean>();

    private final void copyAvailable(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_copyAvailable_boolean(nativeId(), b);
    }
    native void __qt_copyAvailable_boolean(long __this__nativeId, boolean b);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QTextCharFormat(named: f)&gt;:<p> This signal is emitted if the current character format has changed, for example caused by a change of the cursor position. <p>The new format is <tt>f</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setCurrentCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCurrentCharFormat()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QTextCharFormat> currentCharFormatChanged = new Signal1<com.trolltech.qt.gui.QTextCharFormat>();

    private final void currentCharFormatChanged(com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentCharFormatChanged_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    native void __qt_currentCharFormatChanged_QTextCharFormat(long __this__nativeId, long format);
/**
 This signal is emitted whenever the position of the cursor changed.
*/

    public final Signal0 cursorPositionChanged = new Signal0();

    private final void cursorPositionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cursorPositionChanged(nativeId());
    }
    native void __qt_cursorPositionChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted whenever redo operations become available (<tt>available</tt> is true) or unavailable (<tt>available</tt> is false).
*/

    public final Signal1<java.lang.Boolean> redoAvailable = new Signal1<java.lang.Boolean>();

    private final void redoAvailable(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redoAvailable_boolean(nativeId(), b);
    }
    native void __qt_redoAvailable_boolean(long __this__nativeId, boolean b);
/**
 This signal is emitted whenever the selection changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#copyAvailable copyAvailable() }. <br></DD></DT>
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
 This signal is emitted whenever the document's content changes; for example, when text is inserted or deleted, or when formatting is applied.
*/

    public final Signal0 textChanged = new Signal0();

    private final void textChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_textChanged(nativeId());
    }
    native void __qt_textChanged(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: available)&gt;:<p> This signal is emitted whenever undo operations become available (<tt>available</tt> is true) or unavailable (<tt>available</tt> is false).
*/

    public final Signal1<java.lang.Boolean> undoAvailable = new Signal1<java.lang.Boolean>();

    private final void undoAvailable(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undoAvailable_boolean(nativeId(), b);
    }
    native void __qt_undoAvailable_boolean(long __this__nativeId, boolean b);


/**
Constructs an empty QTextEdit with parent <tt>parent</tt>.
*/

    public QTextEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty QTextEdit with parent <tt>parent</tt>.
*/

    public QTextEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTextEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextEdit_QWidget(long parent);


/**
Constructs a QTextEdit with parent <tt>parent</tt>. The text edit will display the text <tt>text</tt>. The text is interpreted as html.
*/

    public QTextEdit(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QTextEdit with parent <tt>parent</tt>. The text edit will display the text <tt>text</tt>. The text is interpreted as html.
*/

    public QTextEdit(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTextEdit_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextEdit_String_QWidget(java.lang.String text, long parent);

/**
This property holds whether the text edit accepts rich text insertions by the user. When this propery is set to false text edit will accept only plain text input from the user. For example through clipboard or drag and drop. <p>This property's default is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="acceptRichText")
    @QtBlockedSlot
    public final boolean acceptRichText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptRichText(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acceptRichText(long __this__nativeId);

/**
Returns the alignment of the current paragraph. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
Returns the reference of the anchor at position <tt>pos</tt>, or an empty string if no anchor exists at that point.
*/

    @QtBlockedSlot
    public final java.lang.String anchorAt(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_anchorAt_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_anchorAt_QPoint(long __this__nativeId, long pos);

/**
Appends a new paragraph with <tt>text</tt> to the end of the text edit. <p><b>Note:</b> The new paragraph appended will have the same character format and block format as the current paragraph, determined by the position of the cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#currentCharFormat() currentCharFormat()}, and {@link com.trolltech.qt.gui.QTextCursor#blockFormat() QTextCursor::blockFormat()}. <br></DD></DT>
*/

    public final void append(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_String(nativeId(), text);
    }
    native void __qt_append_String(long __this__nativeId, java.lang.String text);

/**
This property holds the enabled set of auto formatting features. The value can be any combination of the values in the {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoFormattingFlag } enum. The default is {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoNone }. Choose {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoAll } to enable all automatic formatting. <p>Currently, the only automatic formatting feature provided is {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoBulletList }; future versions of Qt may offer more.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoFormatting")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextEdit.AutoFormatting autoFormatting()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QTextEdit.AutoFormatting(__qt_autoFormatting(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_autoFormatting(long __this__nativeId);

/**
Returns whether text can be pasted from the clipboard into the textedit.
*/

    @QtBlockedSlot
    public final boolean canPaste()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canPaste(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canPaste(long __this__nativeId);

/**
Deletes all the text in the text edit. <p>Note that the undo/redo history is cleared by this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#cut() cut()}, {@link com.trolltech.qt.gui.QTextEdit#setPlainText(java.lang.String) setPlainText()}, and {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()}. <br></DD></DT>
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Copies any selected text to the clipboard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#copyAvailable copyAvailable() }. <br></DD></DT>
*/

    public final void copy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_copy(nativeId());
    }
    native void __qt_copy(long __this__nativeId);

/**
This function creates the standard context menu which is shown when the user clicks on the text edit with the right mouse button. It is called from the default contextMenuEvent() handler. The popup menu's ownership is transferred to the caller. <p>We recommend that you use the createStandardContextMenu({@link com.trolltech.qt.core.QPoint QPoint}) version instead which will enable the actions that are sensitive to where the user clicked.
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
This function creates the standard context menu which is shown when the user clicks on the text edit with the right mouse button. It is called from the default contextMenuEvent() handler and it takes the <tt>position</tt> of where the mouse click was. This can enable actions that are sensitive to the position where the user clicked. The popup menu's ownership is transferred to the caller.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu createStandardContextMenu(com.trolltech.qt.core.QPoint position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createStandardContextMenu_QPoint(nativeId(), position == null ? 0 : position.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_createStandardContextMenu_QPoint(long __this__nativeId, long position);

/**
Returns the char format that is used when inserting new text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setCurrentCharFormat(com.trolltech.qt.gui.QTextCharFormat) setCurrentCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat currentCharFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentCharFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_currentCharFormat(long __this__nativeId);

/**
Returns the font of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, {@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont currentFont()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFont(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_currentFont(long __this__nativeId);

/**
returns a {@link com.trolltech.qt.gui.QTextCursor QTextCursor} at position <tt>pos</tt> (in viewport coordinates).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor cursorForPosition(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorForPosition_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_cursorForPosition_QPoint(long __this__nativeId, long pos);

/**
returns a rectangle (in viewport coordinates) that includes the cursor of the text edit.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect cursorRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_cursorRect(long __this__nativeId);

/**
returns a rectangle (in viewport coordinates) that includes the <tt>cursor</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect cursorRect(com.trolltech.qt.gui.QTextCursor cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorRect_QTextCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_cursorRect_QTextCursor(long __this__nativeId, long cursor);

/**
This property specifies the width of the cursor in pixels. The default value is 1.
*/

    @com.trolltech.qt.QtPropertyReader(name="cursorWidth")
    @QtBlockedSlot
    public final int cursorWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_cursorWidth(long __this__nativeId);

/**
Copies the selected text to the clipboard and deletes it from the text edit. <p>If there is no selected text nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#copy() copy()}, and {@link com.trolltech.qt.gui.QTextEdit#paste() paste()}. <br></DD></DT>
*/

    public final void cut()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cut(nativeId());
    }
    native void __qt_cut(long __this__nativeId);

/**
Returns a pointer to the underlying document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setDocument(com.trolltech.qt.gui.QTextDocument) setDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument document()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_document(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocument __qt_document(long __this__nativeId);

/**
This property holds the title of the document parsed from the text.  By default, for a newly-created, empty document, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="documentTitle")
    @QtBlockedSlot
    public final java.lang.String documentTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentTitle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_documentTitle(long __this__nativeId);

/**
Ensures that the cursor is visible by scrolling the text edit if necessary.
*/

    @QtBlockedSlot
    public final void ensureCursorVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensureCursorVisible(nativeId());
    }
    @QtBlockedSlot
    native void __qt_ensureCursorVisible(long __this__nativeId);

/**
Returns previously set extra selections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setExtraSelections(java.util.List) setExtraSelections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextEdit_ExtraSelection> extraSelections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_extraSelections(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextEdit_ExtraSelection> __qt_extraSelections(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean find(java.lang.String exp, com.trolltech.qt.gui.QTextDocument.FindFlag ... options) {
        return this.find(exp, new com.trolltech.qt.gui.QTextDocument.FindFlags(options));
    }

/**
Finds the next occurrence of the string, <tt>exp</tt>, using the given <tt>options</tt>. Returns true if <tt>exp</tt> was found and changes the cursor to select the match; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean find(java.lang.String exp) {
        return find(exp, new com.trolltech.qt.gui.QTextDocument.FindFlags(0));
    }
/**
Finds the next occurrence of the string, <tt>exp</tt>, using the given <tt>options</tt>. Returns true if <tt>exp</tt> was found and changes the cursor to select the match; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean find(java.lang.String exp, com.trolltech.qt.gui.QTextDocument.FindFlags options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_find_String_FindFlags(nativeId(), exp, options.value());
    }
    @QtBlockedSlot
    native boolean __qt_find_String_FindFlags(long __this__nativeId, java.lang.String exp, int options);

/**
Returns the font family of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}, {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fontFamily()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontFamily(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fontFamily(long __this__nativeId);

/**
Returns true if the font of the current format is italic; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setFontItalic(boolean) setFontItalic()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontItalic()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontItalic(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontItalic(long __this__nativeId);

/**
Returns the point size of the font of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}, {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double fontPointSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontPointSize(nativeId());
    }
    @QtBlockedSlot
    native double __qt_fontPointSize(long __this__nativeId);

/**
Returns true if the font of the current format is underlined; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setFontUnderline(boolean) setFontUnderline()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontUnderline()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontUnderline(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontUnderline(long __this__nativeId);

/**
Returns the font weight of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setFontWeight(int) setFontWeight()}, {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}, and {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int fontWeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontWeight(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fontWeight(long __this__nativeId);

/**
Convenience slot that inserts <tt>text</tt> which is assumed to be of html formatting at the current cursor position. <p>It is equivalent to: <pre class="snippet">
        edit.textCursor().insertHtml(fragment);
        </pre> <b>Note:</b> When using this function with a style sheet, the style sheet will only apply to the current block in the document. In order to apply a style sheet throughout a document, use {@link QTextDocument#setDefaultStyleSheet(java.lang.String) QTextDocument::setDefaultStyleSheet()} instead.
*/

    public final void insertHtml(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertHtml_String(nativeId(), text);
    }
    native void __qt_insertHtml_String(long __this__nativeId, java.lang.String text);

/**
Convenience slot that inserts <tt>text</tt> at the current cursor position. <p>It is equivalent to <pre class="snippet">
        edit.textCursor().insertText(text);
        </pre>
*/

    public final void insertPlainText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertPlainText_String(nativeId(), text);
    }
    native void __qt_insertPlainText_String(long __this__nativeId, java.lang.String text);

/**
This property holds whether the text edit is read-only. In a read-only text edit the user can only navigate through the text and select text; modifying the text is not possible. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="readOnly")
    @QtBlockedSlot
    public final boolean isReadOnly()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
This property holds whether undo and redo are enabled. Users are only able to undo or redo actions if this property is true, and if there is an action that can be undone (or redone).
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
This property holds the position (in pixels or columns depending on the wrap mode) where text will be wrapped. If the wrap mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedPixelWidth }, the value is the number of pixels from the left edge of the text edit at which text should be wrapped. If the wrap mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedColumnWidth }, the value is the column number (in character columns) from the left edge of the text edit at which text should be wrapped. <p>By default, this property contains a value of 0. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#lineWrapMode() lineWrapMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="lineWrapColumnOrWidth")
    @QtBlockedSlot
    public final int lineWrapColumnOrWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWrapColumnOrWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineWrapColumnOrWidth(long __this__nativeId);

/**
This property holds the line wrap mode. The default mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode WidgetWidth } which causes words to be wrapped at the right edge of the text edit. Wrapping occurs at whitespace, keeping whole words intact. If you want wrapping to occur within words use {@link com.trolltech.qt.gui.QTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}. If you set a wrap mode of {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedPixelWidth } or {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedColumnWidth } you should also call {@link com.trolltech.qt.gui.QTextEdit#setLineWrapColumnOrWidth(int) setLineWrapColumnOrWidth()} with the width you want. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#lineWrapColumnOrWidth() lineWrapColumnOrWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="lineWrapMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextEdit.LineWrapMode lineWrapMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextEdit.LineWrapMode.resolve(__qt_lineWrapMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_lineWrapMode(long __this__nativeId);

/**
Merges the properties specified in <tt>modifier</tt> into the current character format by calling QTextCursor.:mergeCharFormat on the editor's cursor. If the editor has a selection then the properties of <tt>modifier</tt> are directly applied to the selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#mergeCharFormat(com.trolltech.qt.gui.QTextCharFormat) QTextCursor::mergeCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void mergeCurrentCharFormat(com.trolltech.qt.gui.QTextCharFormat modifier)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mergeCurrentCharFormat_QTextCharFormat(nativeId(), modifier == null ? 0 : modifier.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mergeCurrentCharFormat_QTextCharFormat(long __this__nativeId, long modifier);


/**
Moves the cursor by performing the given <tt>operation</tt>. <p>If <tt>mode</tt> is {@link com.trolltech.qt.gui.QTextCursor.MoveMode QTextCursor::KeepAnchor }, the cursor selects the text it moves over. This is the same effect that the user achieves when they hold down the Shift key and move the cursor with the cursor keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) QTextCursor::movePosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveCursor(com.trolltech.qt.gui.QTextCursor.MoveOperation operation) {
        moveCursor(operation, com.trolltech.qt.gui.QTextCursor.MoveMode.MoveAnchor);
    }
/**
Moves the cursor by performing the given <tt>operation</tt>. <p>If <tt>mode</tt> is {@link com.trolltech.qt.gui.QTextCursor.MoveMode QTextCursor::KeepAnchor }, the cursor selects the text it moves over. This is the same effect that the user achieves when they hold down the Shift key and move the cursor with the cursor keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCursor#movePosition(com.trolltech.qt.gui.QTextCursor.MoveOperation, com.trolltech.qt.gui.QTextCursor.MoveMode) QTextCursor::movePosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveCursor(com.trolltech.qt.gui.QTextCursor.MoveOperation operation, com.trolltech.qt.gui.QTextCursor.MoveMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveCursor_MoveOperation_MoveMode(nativeId(), operation.value(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_moveCursor_MoveOperation_MoveMode(long __this__nativeId, int operation, int mode);

/**
Returns this QTextEdit's overwrite mode.
<p>
If FALSE (the default) characters entered by the user are inserted with any
characters to the right being moved out of the way. If TRUE, the editor is in
overwrite mode, i.e. characters entered by the user overwrite any characters
to the right of the cursor position.
*/

    @com.trolltech.qt.QtPropertyReader(name="overwriteMode")
    @QtBlockedSlot
    public final boolean overwriteMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_overwriteMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_overwriteMode(long __this__nativeId);

/**
Pastes the text from the clipboard into the text edit at the current cursor position. <p>If there is no text in the clipboard nothing happens. <p>To change the behavior of this function, i.e. to modify what QTextEdit can paste and how it is being pasted, reimplement the virtual {@link com.trolltech.qt.gui.QTextEdit#canInsertFromMimeData(com.trolltech.qt.core.QMimeData) canInsertFromMimeData()} and {@link com.trolltech.qt.gui.QTextEdit#insertFromMimeData(com.trolltech.qt.core.QMimeData) insertFromMimeData()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QTextEdit#copy() copy()}. <br></DD></DT>
*/

    public final void paste()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paste(nativeId());
    }
    native void __qt_paste(long __this__nativeId);

/**
Convenience function to print the text edit's document to the given <tt>printer</tt>. This is equivalent to calling the print method on the document directly except that this function also supports {@link com.trolltech.qt.gui.QPrinter.PrintRange QPrinter::Selection } as print range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#print(com.trolltech.qt.gui.QPrinter) QTextDocument::print()}. <br></DD></DT>
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
Redoes the last operation. <p>If there is no operation to redo, i.e. there is no redo step in the undo/redo history, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#undo() undo()}. <br></DD></DT>
*/

    public final void redo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_redo(nativeId());
    }
    native void __qt_redo(long __this__nativeId);

/**
Scrolls the text edit so that the anchor with the given <tt>name</tt> is visible; does nothing if the <tt>name</tt> is empty, or is already visible, or isn't found.
*/

    public final void scrollToAnchor(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollToAnchor_String(nativeId(), name);
    }
    native void __qt_scrollToAnchor_String(long __this__nativeId, java.lang.String name);

/**
Selects all text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#copy() copy()}, {@link com.trolltech.qt.gui.QTextEdit#cut() cut()}, and {@link com.trolltech.qt.gui.QTextEdit#textCursor() textCursor()}. <br></DD></DT>
*/

    public final void selectAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectAll(nativeId());
    }
    native void __qt_selectAll(long __this__nativeId);

/**
This property holds whether the text edit accepts rich text insertions by the user. When this propery is set to false text edit will accept only plain text input from the user. For example through clipboard or drag and drop. <p>This property's default is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="acceptRichText")
    @QtBlockedSlot
    public final void setAcceptRichText(boolean accept)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptRichText_boolean(nativeId(), accept);
    }
    @QtBlockedSlot
    native void __qt_setAcceptRichText_boolean(long __this__nativeId, boolean accept);


/**
This is an overloaded method provided for convenience.
*/

    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... a) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(a));
    }
/**
Sets the alignment of the current paragraph to <tt>a</tt>. Valid alignments are {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignJustify } and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter } (which centers horizontally). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#alignment() alignment()}. <br></DD></DT>
*/

    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment a)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), a.value());
    }
    native void __qt_setAlignment_Alignment(long __this__nativeId, int a);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAutoFormatting(com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag ... features) {
        this.setAutoFormatting(new com.trolltech.qt.gui.QTextEdit.AutoFormatting(features));
    }
/**
This property holds the enabled set of auto formatting features. The value can be any combination of the values in the {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoFormattingFlag } enum. The default is {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoNone }. Choose {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoAll } to enable all automatic formatting. <p>Currently, the only automatic formatting feature provided is {@link com.trolltech.qt.gui.QTextEdit.AutoFormattingFlag AutoBulletList }; future versions of Qt may offer more.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoFormatting")
    @QtBlockedSlot
    public final void setAutoFormatting(com.trolltech.qt.gui.QTextEdit.AutoFormatting features)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoFormatting_AutoFormatting(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setAutoFormatting_AutoFormatting(long __this__nativeId, int features);

/**
Sets the char format that is be used when inserting new text to <tt>format</tt> by calling {@link com.trolltech.qt.gui.QTextCursor#setCharFormat(com.trolltech.qt.gui.QTextCharFormat) QTextCursor::setCharFormat()} on the editor's cursor. If the editor has a selection then the char format is directly applied to the selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#currentCharFormat() currentCharFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCurrentCharFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentCharFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentCharFormat_QTextCharFormat(long __this__nativeId, long format);

/**
Sets the font of the current format to <tt>f</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#currentFont() currentFont()}, {@link com.trolltech.qt.gui.QTextEdit#setFontPointSize(double) setFontPointSize()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}. <br></DD></DT>
*/

    public final void setCurrentFont(com.trolltech.qt.gui.QFont f)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentFont_QFont(nativeId(), f == null ? 0 : f.nativeId());
    }
    native void __qt_setCurrentFont_QFont(long __this__nativeId, long f);

/**
This property specifies the width of the cursor in pixels. The default value is 1.
*/

    @com.trolltech.qt.QtPropertyWriter(name="cursorWidth")
    @QtBlockedSlot
    public final void setCursorWidth(int width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursorWidth_int(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setCursorWidth_int(long __this__nativeId, int width);

/**
Makes <tt>document</tt> the new document of the text editor. <p><b>Note:</b> The editor does not take ownership of the document unless it is the document's parent object. The parent object of the provided document remains the owner of the object. <p>If the current document is a child of the text editor, then it is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#document() document()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDocument(com.trolltech.qt.gui.QTextDocument document)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDocument = document;
        }
        __qt_setDocument_QTextDocument(nativeId(), document == null ? 0 : document.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDocument_QTextDocument(long __this__nativeId, long document);

/**
This property holds the title of the document parsed from the text.  By default, for a newly-created, empty document, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="documentTitle")
    @QtBlockedSlot
    public final void setDocumentTitle(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setDocumentTitle_String(long __this__nativeId, java.lang.String title);

/**
This function allows temporarily marking certain regions in the document with a given color, specified as <tt>selections</tt>. This can be useful for example in a programming editor to mark a whole line of text with a given background color to indicate the existence of a breakpoint. <p><DT><b>See also:</b><br><DD>QTextEdit::ExtraSelection, and {@link com.trolltech.qt.gui.QTextEdit#extraSelections() extraSelections()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setExtraSelections(java.util.List<com.trolltech.qt.gui.QTextEdit_ExtraSelection> selections)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExtraSelections_List(nativeId(), selections);
    }
    @QtBlockedSlot
    native void __qt_setExtraSelections_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTextEdit_ExtraSelection> selections);

/**
Sets the font family of the current format to <tt>fontFamily</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#fontFamily() fontFamily()}, and {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}. <br></DD></DT>
*/

    public final void setFontFamily(java.lang.String fontFamily)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontFamily_String(nativeId(), fontFamily);
    }
    native void __qt_setFontFamily_String(long __this__nativeId, java.lang.String fontFamily);

/**
If <tt>italic</tt> is true, sets the current format to italic; otherwise sets the current format to non-italic. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#fontItalic() fontItalic()}. <br></DD></DT>
*/

    public final void setFontItalic(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontItalic_boolean(nativeId(), b);
    }
    native void __qt_setFontItalic_boolean(long __this__nativeId, boolean b);

/**
Sets the point size of the current format to <tt>s</tt>. <p>Note that if <tt>s</tt> is zero or negative, the behavior of this function is not defined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#fontPointSize() fontPointSize()}, {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}. <br></DD></DT>
*/

    public final void setFontPointSize(double s)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontPointSize_double(nativeId(), s);
    }
    native void __qt_setFontPointSize_double(long __this__nativeId, double s);

/**
If <tt>underline</tt> is true, sets the current format to underline; otherwise sets the current format to non-underline. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#fontUnderline() fontUnderline()}. <br></DD></DT>
*/

    public final void setFontUnderline(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontUnderline_boolean(nativeId(), b);
    }
    native void __qt_setFontUnderline_boolean(long __this__nativeId, boolean b);

/**
Sets the font weight of the current format to the given <tt>weight</tt>, where the value used is in the range defined by the {@link com.trolltech.qt.gui.QFont.Weight QFont::Weight } enum. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#fontWeight() fontWeight()}, {@link com.trolltech.qt.gui.QTextEdit#setCurrentFont(com.trolltech.qt.gui.QFont) setCurrentFont()}, and {@link com.trolltech.qt.gui.QTextEdit#setFontFamily(java.lang.String) setFontFamily()}. <br></DD></DT>
*/

    public final void setFontWeight(int w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontWeight_int(nativeId(), w);
    }
    native void __qt_setFontWeight_int(long __this__nativeId, int w);

/**
This property provides an HTML interface to the text of the text edit. <p>{@link com.trolltech.qt.gui.QTextEdit#toHtml() toHtml()} returns the text of the text edit as html. <p>{@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} changes the text of the text edit. Any previous text is removed and the undo/redo history is cleared. The input text is interpreted as rich text in html format. <p><b>Note:</b> It is the responsibility of the caller to make sure that the text is correctly decoded when a QString containing HTML is created and passed to {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()}. <p>By default, for a newly-created, empty document, this property contains text to describe an HTML 4.0 document with no body text. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}, and {@link QTextEdit#toPlainText() plainText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="html")
    public final void setHtml(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHtml_String(nativeId(), text);
    }
    native void __qt_setHtml_String(long __this__nativeId, java.lang.String text);

/**
This property holds the position (in pixels or columns depending on the wrap mode) where text will be wrapped. If the wrap mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedPixelWidth }, the value is the number of pixels from the left edge of the text edit at which text should be wrapped. If the wrap mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedColumnWidth }, the value is the column number (in character columns) from the left edge of the text edit at which text should be wrapped. <p>By default, this property contains a value of 0. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#lineWrapMode() lineWrapMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="lineWrapColumnOrWidth")
    @QtBlockedSlot
    public final void setLineWrapColumnOrWidth(int w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWrapColumnOrWidth_int(nativeId(), w);
    }
    @QtBlockedSlot
    native void __qt_setLineWrapColumnOrWidth_int(long __this__nativeId, int w);

/**
This property holds the line wrap mode. The default mode is {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode WidgetWidth } which causes words to be wrapped at the right edge of the text edit. Wrapping occurs at whitespace, keeping whole words intact. If you want wrapping to occur within words use {@link com.trolltech.qt.gui.QTextEdit#setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWordWrapMode()}. If you set a wrap mode of {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedPixelWidth } or {@link com.trolltech.qt.gui.QTextEdit.LineWrapMode FixedColumnWidth } you should also call {@link com.trolltech.qt.gui.QTextEdit#setLineWrapColumnOrWidth(int) setLineWrapColumnOrWidth()} with the width you want. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#lineWrapColumnOrWidth() lineWrapColumnOrWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="lineWrapMode")
    @QtBlockedSlot
    public final void setLineWrapMode(com.trolltech.qt.gui.QTextEdit.LineWrapMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWrapMode_LineWrapMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setLineWrapMode_LineWrapMode(long __this__nativeId, int mode);

/**
This property holds the text edit's overwrite mode to <tt>overwrite</tt>.
<p>
If FALSE (the default) characters entered by the user are inserted with any
characters to the right being moved out of the way. If TRUE, the editor is in
overwrite mode, i.e. characters entered by the user overwrite any characters
to the right of the cursor position.
*/

    @com.trolltech.qt.QtPropertyWriter(name="overwriteMode")
    @QtBlockedSlot
    public final void setOverwriteMode(boolean overwrite)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOverwriteMode_boolean(nativeId(), overwrite);
    }
    @QtBlockedSlot
    native void __qt_setOverwriteMode_boolean(long __this__nativeId, boolean overwrite);

/**
This property gets and sets the text editor's contents as plain text. Previous contents are removed and undo/redo history is reset when the property is set. <p>If the text edit has another content type, it will not be replaced by plain text if you call {@link com.trolltech.qt.gui.QTextEdit#toPlainText() toPlainText()}. <p>By default, for an editor with no contents, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#toHtml() html}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="plainText")
    public final void setPlainText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPlainText_String(nativeId(), text);
    }
    native void __qt_setPlainText_String(long __this__nativeId, java.lang.String text);

/**
This property holds whether the text edit is read-only. In a read-only text edit the user can only navigate through the text and select text; modifying the text is not possible. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="readOnly")
    @QtBlockedSlot
    public final void setReadOnly(boolean ro)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), ro);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean ro);

/**
This property holds whether <b>Tab</b> changes focus or is accepted as input. In some occasions text edits should not allow the user to input tabulators or change indentation using the <b>Tab</b> key, as this breaks the focus chain. The default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabChangesFocus")
    @QtBlockedSlot
    public final void setTabChangesFocus(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabChangesFocus_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setTabChangesFocus_boolean(long __this__nativeId, boolean b);

/**
This property holds the tab stop width in pixels. By default, this property contains a value of 80.
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabStopWidth")
    @QtBlockedSlot
    public final void setTabStopWidth(int width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabStopWidth_int(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setTabStopWidth_int(long __this__nativeId, int width);

/**
Sets the text edit's <tt>text</tt>. The text can be plain text or HTML and the text edit will try to guess the right format. <p>Use {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} or {@link com.trolltech.qt.gui.QTextEdit#setPlainText(java.lang.String) setPlainText()} directly to avoid text edit's guessing. <p><DT><b>See also:</b><br><DD>text(). <br></DD></DT>
*/

    public final void setText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
Sets the text background color of the current format to <tt>c</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#textBackgroundColor() textBackgroundColor()}. <br></DD></DT>
*/

    public final void setTextBackgroundColor(com.trolltech.qt.gui.QColor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextBackgroundColor_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    native void __qt_setTextBackgroundColor_QColor(long __this__nativeId, long c);

/**
Sets the text color of the current format to <tt>c</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#textColor() textColor()}. <br></DD></DT>
*/

    public final void setTextColor(com.trolltech.qt.gui.QColor c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextColor_QColor(nativeId(), c == null ? 0 : c.nativeId());
    }
    native void __qt_setTextColor_QColor(long __this__nativeId, long c);

/**
Sets the visible <tt>cursor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#textCursor() textCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextCursor(com.trolltech.qt.gui.QTextCursor cursor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextCursor_QTextCursor(nativeId(), cursor == null ? 0 : cursor.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTextCursor_QTextCursor(long __this__nativeId, long cursor);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag ... flags) {
        this.setTextInteractionFlags(new com.trolltech.qt.core.Qt.TextInteractionFlags(flags));
    }
/**
Specifies how the widget should interact with user input. <p>The default value depends on whether the QTextEdit is read-only or editable, and whether it is a {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser} or not.
*/

    @com.trolltech.qt.QtPropertyWriter(name="textInteractionFlags")
    @QtBlockedSlot
    public final void setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextInteractionFlags_TextInteractionFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setTextInteractionFlags_TextInteractionFlags(long __this__nativeId, int flags);

/**
This property holds whether undo and redo are enabled. Users are only able to undo or redo actions if this property is true, and if there is an action that can be undone (or redone).
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
This property holds the mode QTextEdit will use when wrapping text by words. By default, this property is set to {@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapAtWordBoundaryOrAnywhere }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapMode }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWordWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWordWrapMode_WrapMode(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setWordWrapMode_WrapMode(long __this__nativeId, int policy);

/**
This property holds whether <b>Tab</b> changes focus or is accepted as input. In some occasions text edits should not allow the user to input tabulators or change indentation using the <b>Tab</b> key, as this breaks the focus chain. The default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="tabChangesFocus")
    @QtBlockedSlot
    public final boolean tabChangesFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabChangesFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tabChangesFocus(long __this__nativeId);

/**
This property holds the tab stop width in pixels. By default, this property contains a value of 80.
*/

    @com.trolltech.qt.QtPropertyReader(name="tabStopWidth")
    @QtBlockedSlot
    public final int tabStopWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabStopWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tabStopWidth(long __this__nativeId);

/**
Returns the text background color of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setTextBackgroundColor(com.trolltech.qt.gui.QColor) setTextBackgroundColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor textBackgroundColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textBackgroundColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_textBackgroundColor(long __this__nativeId);

/**
Returns the text color of the current format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setTextColor(com.trolltech.qt.gui.QColor) setTextColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor textColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_textColor(long __this__nativeId);

/**
Returns a copy of the {@link com.trolltech.qt.gui.QTextCursor QTextCursor} that represents the currently visible cursor. Note that changes on the returned cursor do not affect QTextEdit's cursor; use {@link com.trolltech.qt.gui.QTextEdit#setTextCursor(com.trolltech.qt.gui.QTextCursor) setTextCursor()} to update the visible cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#setTextCursor(com.trolltech.qt.gui.QTextCursor) setTextCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCursor textCursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textCursor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCursor __qt_textCursor(long __this__nativeId);

/**
Specifies how the widget should interact with user input. <p>The default value depends on whether the QTextEdit is read-only or editable, and whether it is a {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser} or not.
*/

    @com.trolltech.qt.QtPropertyReader(name="textInteractionFlags")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextInteractionFlags textInteractionFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.TextInteractionFlags(__qt_textInteractionFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textInteractionFlags(long __this__nativeId);

/**
This property provides an HTML interface to the text of the text edit. <p>{@link com.trolltech.qt.gui.QTextEdit#toHtml() toHtml()} returns the text of the text edit as html. <p>{@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()} changes the text of the text edit. Any previous text is removed and the undo/redo history is cleared. The input text is interpreted as rich text in html format. <p><b>Note:</b> It is the responsibility of the caller to make sure that the text is correctly decoded when a QString containing HTML is created and passed to {@link com.trolltech.qt.gui.QTextEdit#setHtml(java.lang.String) setHtml()}. <p>By default, for a newly-created, empty document, this property contains text to describe an HTML 4.0 document with no body text. <p><DT><b>See also:</b><br><DD>{@link <a href="../richtext-html-subset.html">Supported HTML Subset</a>}, and {@link QTextEdit#toPlainText() plainText}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="html")
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
This property gets and sets the text editor's contents as plain text. Previous contents are removed and undo/redo history is reset when the property is set. <p>If the text edit has another content type, it will not be replaced by plain text if you call {@link com.trolltech.qt.gui.QTextEdit#toPlainText() toPlainText()}. <p>By default, for an editor with no contents, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QTextEdit#toHtml() html}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="plainText")
    @com.trolltech.qt.QtPropertyDesignable("false")
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
Undoes the last operation. <p>If there is no operation to undo, i.e. there is no undo step in the undo/redo history, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#redo() redo()}. <br></DD></DT>
*/

    public final void undo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_undo(nativeId());
    }
    native void __qt_undo(long __this__nativeId);

/**
This property holds the mode QTextEdit will use when wrapping text by words. By default, this property is set to {@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapAtWordBoundaryOrAnywhere }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption.WrapMode QTextOption::WrapMode }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextOption.WrapMode wordWrapMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextOption.WrapMode.resolve(__qt_wordWrapMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_wordWrapMode(long __this__nativeId);


/**
Zooms in on the text by making the base font size <tt>range</tt> points larger and recalculating all font sizes to be the new size. This does not change the size of any images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#zoomOut() zoomOut()}. <br></DD></DT>
*/

    public final void zoomIn() {
        zoomIn((int)1);
    }
/**
Zooms in on the text by making the base font size <tt>range</tt> points larger and recalculating all font sizes to be the new size. This does not change the size of any images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#zoomOut() zoomOut()}. <br></DD></DT>
*/

    public final void zoomIn(int range)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_zoomIn_int(nativeId(), range);
    }
    native void __qt_zoomIn_int(long __this__nativeId, int range);


/**
This is an overloaded member function, provided for convenience. <p>Zooms out on the text by making the base font size <tt>range</tt> points smaller and recalculating all font sizes to be the new size. This does not change the size of any images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#zoomIn() zoomIn()}. <br></DD></DT>
*/

    public final void zoomOut() {
        zoomOut((int)1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Zooms out on the text by making the base font size <tt>range</tt> points smaller and recalculating all font sizes to be the new size. This does not change the size of any images. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit#zoomIn() zoomIn()}. <br></DD></DT>
*/

    public final void zoomOut(int range)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_zoomOut_int(nativeId(), range);
    }
    native void __qt_zoomOut_int(long __this__nativeId, int range);

/**
This function returns true if the contents of the MIME data object, specified by <tt>source</tt>, can be decoded and inserted into the document. It is called for example when during a drag operation the mouse enters this widget and it is necessary to determine whether it is possible to accept the drag and drop operation. <p>Reimplement this function to enable drag and drop support for additional MIME types.
*/

    @QtBlockedSlot
    protected boolean canInsertFromMimeData(com.trolltech.qt.core.QMimeData source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canInsertFromMimeData_QMimeData(nativeId(), source == null ? 0 : source.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canInsertFromMimeData_QMimeData(long __this__nativeId, long source);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long e);

/**
This function returns a new MIME data object to represent the contents of the text edit's current selection. It is called when the selection needs to be encapsulated into a new {@link com.trolltech.qt.core.QMimeData QMimeData} object; for example, when a drag and drop operation is started, or when data is copyied to the clipboard. <p>If you reimplement this function, note that the ownership of the returned {@link com.trolltech.qt.core.QMimeData QMimeData} object is passed to the caller. The selection can be retrieved by using the {@link com.trolltech.qt.gui.QTextEdit#textCursor() textCursor()} function.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QMimeData createMimeDataFromSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createMimeDataFromSelection(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_createMimeDataFromSelection(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long e);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long e);

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
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long e);

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
This function inserts the contents of the MIME data object, specified by <tt>source</tt>, into the text edit at the current cursor position. It is called whenever text is inserted as the result of a clipboard paste operation, or when the text edit accepts data from a drag and drop operation. <p>Reimplement this function to enable drag and drop support for additional MIME types.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    protected void insertFromMimeData(com.trolltech.qt.core.QMimeData source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertFromMimeData_QMimeData(nativeId(), source == null ? 0 : source.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertFromMimeData_QMimeData(long __this__nativeId, long source);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long e);

/**
Loads the resource specified by the given <tt>type</tt> and <tt>name</tt>. <p>This function is an extension of {@link com.trolltech.qt.gui.QTextDocument#loadResource(int, com.trolltech.qt.core.QUrl) QTextDocument::loadResource()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocument#loadResource(int, com.trolltech.qt.core.QUrl) QTextDocument::loadResource()}. <br></DD></DT>
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
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long e);

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
    protected void scrollContentsBy(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scrollContentsBy_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scrollContentsBy_int_int(long __this__nativeId, int dx, int dy);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QTextEdit fromNativePointer(QNativePointer nativePointer);

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

    protected QTextEdit(QPrivateConstructor p) { super(p); } 
}
